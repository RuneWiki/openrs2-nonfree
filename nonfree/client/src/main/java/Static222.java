import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ida", name = "G", descriptor = "Lclient!mk;")
	public static final Class207 aClass207_5 = new Class207();

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!ig;Z)Lclient!vv;")
	public static Class6_Sub3 method4168(@OriginalArg(0) Class8_Sub8 arg0) {
		@Pc(12) Class6 local12 = Static121.method2709(arg0);
		@Pc(16) int local16 = arg0.method8540();
		@Pc(20) int local20 = arg0.method8540();
		@Pc(24) int local24 = arg0.method8578();
		return new Class6_Sub3(local12.aClass173_14, local12.aClass60_13, local12.anInt10332, local12.anInt10334, local12.anInt10335, local12.anInt10336, local12.anInt10339, local12.anInt10342, local12.anInt10337, local16, local20, local24);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BLclient!tp;)Lclient!tp;")
	public static Class331 method4170(@OriginalArg(1) Class331 arg0) {
		if (arg0.anInt9509 != -1) {
			return Static178.method3435(arg0.anInt9509);
		}
		@Pc(25) int local25 = arg0.anInt9578 >>> 16;
		@Pc(30) Class154 local30 = new Class154(Static218.aClass253_14);
		for (@Pc(35) Class8_Sub51 local35 = (Class8_Sub51) local30.method4529(); local35 != null; local35 = (Class8_Sub51) local30.method4531()) {
			if (local25 == local35.anInt10454) {
				return Static178.method3435((int) local35.aLong285);
			}
		}
		return null;
	}
}
