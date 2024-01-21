import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JJYRPNAX")
public final class Class19 {

	@OriginalMember(owner = "client!JJYRPNAX", name = "a", descriptor = "I")
	private int anInt252 = 9;

	@OriginalMember(owner = "client!JJYRPNAX", name = "b", descriptor = "I")
	private int anInt253 = 375;

	@OriginalMember(owner = "client!JJYRPNAX", name = "c", descriptor = "I")
	private int anInt254 = -706;

	@OriginalMember(owner = "client!JJYRPNAX", name = "d", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!JJYRPNAX", name = "e", descriptor = "[Lclient!LTTSKENL;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!JJYRPNAX", name = "<init>", descriptor = "(II)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt255 = arg1;
			this.aClass3Array1 = new Class3[arg1];
			for (@Pc(25) int local25 = 0; local25 < arg1; local25++) {
				@Pc(35) Class3 local35 = this.aClass3Array1[local25] = new Class3();
				local35.aClass3_41 = local35;
				local35.aClass3_42 = local35;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("16866, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JJYRPNAX", name = "a", descriptor = "(J)Lclient!LTTSKENL;")
	public Class3 method232(@OriginalArg(0) long arg0) {
		@Pc(11) Class3 local11 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt255 - 1))];
		for (@Pc(14) Class3 local14 = local11.aClass3_41; local14 != local11; local14 = local14.aClass3_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!JJYRPNAX", name = "a", descriptor = "(Lclient!LTTSKENL;ZJ)V")
	public void method233(@OriginalArg(0) Class3 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass3_42 != null) {
				arg0.method514();
			}
			@Pc(18) Class3 local18 = this.aClass3Array1[(int) (arg1 & (long) (this.anInt255 - 1))];
			arg0.aClass3_42 = local18.aClass3_42;
			arg0.aClass3_41 = local18;
			arg0.aClass3_42.aClass3_41 = arg0;
			arg0.aClass3_41.aClass3_42 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("88405, " + arg0 + ", " + false + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}
}
