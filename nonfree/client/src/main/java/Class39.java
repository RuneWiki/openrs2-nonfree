import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WIZYUELH")
public final class Class39 {

	@OriginalMember(owner = "client!WIZYUELH", name = "a", descriptor = "Z")
	private boolean aBoolean170 = true;

	@OriginalMember(owner = "client!WIZYUELH", name = "b", descriptor = "I")
	private int anInt629;

	@OriginalMember(owner = "client!WIZYUELH", name = "c", descriptor = "[Lclient!CSUKQTYW;")
	private Class4[] aClass4Array1;

	@OriginalMember(owner = "client!WIZYUELH", name = "<init>", descriptor = "(II)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt629 = arg1;
			this.aClass4Array1 = new Class4[arg1];
			for (@Pc(24) int local24 = 0; local24 < arg1; local24++) {
				@Pc(34) Class4 local34 = this.aClass4Array1[local24] = new Class4();
				local34.aClass4_41 = local34;
				local34.aClass4_42 = local34;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("68641, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WIZYUELH", name = "a", descriptor = "(J)Lclient!CSUKQTYW;")
	public Class4 method479(@OriginalArg(0) long arg0) {
		@Pc(13) Class4 local13 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt629 - 1))];
		for (@Pc(16) Class4 local16 = local13.aClass4_41; local16 != local13; local16 = local16.aClass4_41) {
			if (local16.aLong24 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!WIZYUELH", name = "a", descriptor = "(Lclient!CSUKQTYW;JI)V")
	public void method480(@OriginalArg(0) Class4 arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0.aClass4_42 != null) {
				arg0.method556();
			}
			@Pc(18) Class4 local18 = this.aClass4Array1[(int) (arg1 & (long) (this.anInt629 - 1))];
			arg0.aClass4_42 = local18.aClass4_42;
			arg0.aClass4_41 = local18;
			arg0.aClass4_42.aClass4_41 = arg0;
			arg0.aClass4_41.aClass4_42 = arg0;
			arg0.aLong24 = arg1;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("60508, " + arg0 + ", " + arg1 + ", " + 874 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}
}
