import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!u")
public final class Class42 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	private int anInt972 = -732;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	private int anInt973 = -11252;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[Lclient!v;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt974 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(24) int local24 = 0; local24 < arg0; local24++) {
				@Pc(34) Class1 local34 = this.aClass1Array1[local24] = new Class1();
				local34.aClass1_41 = local34;
				local34.aClass1_42 = local34;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("24811, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(J)Lclient!v;")
	public Class1 method640(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt974 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong35 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!v;IJ)V")
	public void method641(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method665();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg2 & (long) (this.anInt974 - 1))];
			arg0.aClass1_42 = local18.aClass1_42;
			arg0.aClass1_41 = local18;
			if (arg1 != -5797) {
				for (@Pc(30) int local30 = 1; local30 > 0; local30++) {
				}
			}
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong35 = arg2;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("62310, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}
}
