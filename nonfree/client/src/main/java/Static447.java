import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIIILclient!gp;IZ)V")
	public static void method6323(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class117 arg2) {
		Static235.anInt4584 = 0;
		Static431.aBoolean537 = false;
		Static332.anInt6296 = 1;
		Static296.anInt5926 = arg1;
		Static289.anInt5853 = arg0;
		Static409.aClass117_173 = arg2;
		Static456.anInt7875 = 2;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!mda;)V")
	public static void method6324(@OriginalArg(1) Class30_Sub4 arg0) {
		arg0.aClass15_Sub2_Sub1_1 = null;
		if (Static12.anInt193 < 20) {
			Static143.aClass77_6.method2165(arg0);
			Static12.anInt193++;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)I")
	public static int method6325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static356.anIntArray503[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBII)V")
	public static void method6326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class5_Sub19 local10 = (Class5_Sub19) Static206.aClass99_39.method2526(); local10 != null; local10 = (Class5_Sub19) Static206.aClass99_39.method2519()) {
			Static211.method3429(arg1, arg3, local10, arg0, arg2);
		}
		for (@Pc(40) Class5_Sub19 local40 = (Class5_Sub19) Static479.aClass99_71.method2526(); local40 != null; local40 = (Class5_Sub19) Static479.aClass99_71.method2519()) {
			@Pc(44) byte local44 = 1;
			@Pc(49) Class281 local49 = local40.aClass15_Sub2_Sub1_Sub2_1.method4026();
			if (local40.aClass15_Sub2_Sub1_Sub2_1.aBoolean299) {
				local44 = 0;
			} else if (local40.aClass15_Sub2_Sub1_Sub2_1.anInt4725 == local49.anInt8093 || local49.anInt8117 == local40.aClass15_Sub2_Sub1_Sub2_1.anInt4725 || local40.aClass15_Sub2_Sub1_Sub2_1.anInt4725 == local49.anInt8113 || local49.anInt8121 == local40.aClass15_Sub2_Sub1_Sub2_1.anInt4725) {
				local44 = 2;
			} else if (local49.anInt8124 == local40.aClass15_Sub2_Sub1_Sub2_1.anInt4725 || local40.aClass15_Sub2_Sub1_Sub2_1.anInt4725 == local49.anInt8099 || local49.anInt8116 == local40.aClass15_Sub2_Sub1_Sub2_1.anInt4725 || local40.aClass15_Sub2_Sub1_Sub2_1.anInt4725 == local49.anInt8098) {
				local44 = 3;
			}
			if (local40.anInt3171 != local44) {
				@Pc(148) int local148 = Static7.method266(local40.aClass15_Sub2_Sub1_Sub2_1);
				if (local148 != local40.anInt3164) {
					if (local40.aClass5_Sub15_Sub1_2 != null) {
						Static373.aClass5_Sub15_Sub2_1.method4871(local40.aClass5_Sub15_Sub1_2);
						local40.aClass5_Sub15_Sub1_2 = null;
					}
					local40.anInt3164 = local148;
				}
				local40.anInt3171 = local44;
			}
			local40.anInt3159 = local40.aClass15_Sub2_Sub1_Sub2_1.anInt8492;
			local40.anInt3160 = local40.aClass15_Sub2_Sub1_Sub2_1.anInt8492 + (local40.aClass15_Sub2_Sub1_Sub2_1.method4035() << 6);
			local40.anInt3163 = local40.aClass15_Sub2_Sub1_Sub2_1.anInt8493;
			local40.anInt3166 = local40.aClass15_Sub2_Sub1_Sub2_1.anInt8493 + (local40.aClass15_Sub2_Sub1_Sub2_1.method4035() << 6);
			Static211.method3429(arg1, arg3, local40, arg0, arg2);
		}
		for (@Pc(222) Class5_Sub19 local222 = (Class5_Sub19) Static484.aClass42_43.method1103(); local222 != null; local222 = (Class5_Sub19) Static484.aClass42_43.method1105()) {
			@Pc(226) byte local226 = 1;
			@Pc(231) Class281 local231 = local222.aClass15_Sub2_Sub1_Sub1_2.method4026();
			if (local222.aClass15_Sub2_Sub1_Sub1_2.aBoolean299) {
				local226 = 0;
			} else if (local231.anInt8093 == local222.aClass15_Sub2_Sub1_Sub1_2.anInt4725 || local231.anInt8117 == local222.aClass15_Sub2_Sub1_Sub1_2.anInt4725 || local222.aClass15_Sub2_Sub1_Sub1_2.anInt4725 == local231.anInt8113 || local231.anInt8121 == local222.aClass15_Sub2_Sub1_Sub1_2.anInt4725) {
				local226 = 2;
			} else if (local231.anInt8124 == local222.aClass15_Sub2_Sub1_Sub1_2.anInt4725 || local222.aClass15_Sub2_Sub1_Sub1_2.anInt4725 == local231.anInt8099 || local222.aClass15_Sub2_Sub1_Sub1_2.anInt4725 == local231.anInt8116 || local222.aClass15_Sub2_Sub1_Sub1_2.anInt4725 == local231.anInt8098) {
				local226 = 3;
			}
			if (local222.anInt3171 != local226) {
				@Pc(314) int local314 = Static276.method4515(local222.aClass15_Sub2_Sub1_Sub1_2);
				if (local314 != local222.anInt3164) {
					if (local222.aClass5_Sub15_Sub1_2 != null) {
						Static373.aClass5_Sub15_Sub2_1.method4871(local222.aClass5_Sub15_Sub1_2);
						local222.aClass5_Sub15_Sub1_2 = null;
					}
					local222.anInt3164 = local314;
				}
				local222.anInt3171 = local226;
			}
			local222.anInt3159 = local222.aClass15_Sub2_Sub1_Sub1_2.anInt8492;
			local222.anInt3160 = local222.aClass15_Sub2_Sub1_Sub1_2.anInt8492 + (local222.aClass15_Sub2_Sub1_Sub1_2.method4035() << 6);
			local222.anInt3163 = local222.aClass15_Sub2_Sub1_Sub1_2.anInt8493;
			local222.anInt3166 = local222.aClass15_Sub2_Sub1_Sub1_2.anInt8493 + (local222.aClass15_Sub2_Sub1_Sub1_2.method4035() << 6);
			Static211.method3429(arg1, arg3, local222, arg0, arg2);
		}
	}
}
