import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "Lclient!ih;")
	public static Class113 aClass113_3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!sr", name = "g", descriptor = "Ljava/lang/Class;")
	private static Class aClass27;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BLclient!kt;)V")
	public static void method7734(@OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg0) {
		@Pc(6) Class45 local6 = arg0.aClass45_10;
		if (Static716.anInt11157 == arg0.anInt8812 || !local6.method6572() || local6.method6582()) {
			@Pc(41) int local41 = arg0.anInt8812 - arg0.anInt8811;
			@Pc(46) int local46 = Static716.anInt11157 - arg0.anInt8811;
			@Pc(57) int local57 = arg0.anInt8813 * 512 + arg0.method7485() * 256;
			@Pc(69) int local69 = arg0.anInt8806 * 512 + arg0.method7485() * 256;
			@Pc(81) int local81 = arg0.anInt8810 * 512 + arg0.method7485() * 256;
			@Pc(92) int local92 = arg0.anInt8808 * 512 + arg0.method7485() * 256;
			arg0.anInt10695 = (local69 * (local41 - local46) + local46 * local92) / local41;
			arg0.anInt10694 = (local57 * (local41 - local46) + local46 * local81) / local41;
		}
		arg0.anInt8814 = 0;
		if (arg0.anInt8805 == 0) {
			arg0.method7495(8192, false);
		}
		if (arg0.anInt8805 == 1) {
			arg0.method7495(12288, false);
		}
		if (arg0.anInt8805 == 2) {
			arg0.method7495(0, false);
		}
		if (arg0.anInt8805 == 3) {
			arg0.method7495(4096, false);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!vp;B)V")
	public static void method7735(@OriginalArg(0) Class3_Sub57 arg0) {
		if (Static448.aClass364ArrayArrayArray2 == null) {
			return;
		}
		@Pc(16) Interface9 local16 = null;
		if (arg0.anInt10800 == 0) {
			local16 = (Interface9) Static518.method6967(arg0.anInt10802, arg0.anInt10797, arg0.anInt10805);
		}
		if (arg0.anInt10800 == 1) {
			local16 = (Interface9) Static233.method3389(arg0.anInt10802, arg0.anInt10797, arg0.anInt10805);
		}
		if (arg0.anInt10800 == 2) {
			local16 = (Interface9) Static405.method5449(arg0.anInt10802, arg0.anInt10797, arg0.anInt10805, aClass27 == null ? (aClass27 = Class347.a("et")) : aClass27);
		}
		if (arg0.anInt10800 == 3) {
			local16 = (Interface9) Static198.method3049(arg0.anInt10802, arg0.anInt10797, arg0.anInt10805);
		}
		if (local16 == null) {
			arg0.anInt10799 = 0;
			arg0.anInt10796 = -1;
			arg0.anInt10798 = 0;
		} else {
			arg0.anInt10796 = local16.method9107();
			arg0.anInt10799 = local16.method9102();
			arg0.anInt10798 = local16.method9105();
		}
	}
}
