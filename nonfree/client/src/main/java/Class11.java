import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GUGSPPMO")
public final class Class11 {

	@OriginalMember(owner = "client!GUGSPPMO", name = "a", descriptor = "I")
	private int anInt127 = 240;

	@OriginalMember(owner = "client!GUGSPPMO", name = "b", descriptor = "Z")
	private boolean aBoolean57 = true;

	@OriginalMember(owner = "client!GUGSPPMO", name = "c", descriptor = "I")
	private int anInt128;

	@OriginalMember(owner = "client!GUGSPPMO", name = "d", descriptor = "[Lclient!QEPVMESX;")
	private Class4[] aClass4Array1;

	@OriginalMember(owner = "client!GUGSPPMO", name = "<init>", descriptor = "(II)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt128 = arg0;
			this.aClass4Array1 = new Class4[arg0];
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				@Pc(40) Class4 local40 = this.aClass4Array1[local30] = new Class4();
				local40.aClass4_41 = local40;
				local40.aClass4_42 = local40;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("18963, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GUGSPPMO", name = "a", descriptor = "(J)Lclient!QEPVMESX;")
	public Class4 method185(@OriginalArg(0) long arg0) {
		@Pc(11) Class4 local11 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt128 - 1))];
		for (@Pc(14) Class4 local14 = local11.aClass4_41; local14 != local11; local14 = local14.aClass4_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!GUGSPPMO", name = "a", descriptor = "(Lclient!QEPVMESX;JI)V")
	public void method186(@OriginalArg(0) Class4 arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0.aClass4_42 != null) {
				arg0.method572();
			}
			@Pc(18) Class4 local18 = this.aClass4Array1[(int) (arg1 & (long) (this.anInt128 - 1))];
			arg0.aClass4_42 = local18.aClass4_42;
			arg0.aClass4_41 = local18;
			arg0.aClass4_42.aClass4_41 = arg0;
			arg0.aClass4_41.aClass4_42 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("72832, " + arg0 + ", " + arg1 + ", " + 927 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}
}
