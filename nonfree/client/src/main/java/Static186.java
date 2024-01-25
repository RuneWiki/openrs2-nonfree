import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hfa", name = "j", descriptor = "[I")
	public static final int[] anIntArray380 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!hfa", name = "k", descriptor = "I")
	public static int anInt3245 = -1;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IZ)V")
	public static void method2764(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static353.anInt6214 = arg0;
		Static450.aClass102_Sub6Array1 = new Class102_Sub6[Static25.anIntArray37[Static353.anInt6214] + 1];
		Static303.anInt4926 = 0;
		Static58.anInt957 = 0;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIII)V")
	public static void method2765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class6_Sub22 local6 = (Class6_Sub22) Static429.aClass275_156.method6366(); local6 != null; local6 = (Class6_Sub22) Static429.aClass275_156.method6364()) {
			Static192.method2862(arg3, arg2, arg0, arg1, local6);
		}
		for (@Pc(40) Class6_Sub22 local40 = (Class6_Sub22) Static292.aClass275_101.method6366(); local40 != null; local40 = (Class6_Sub22) Static292.aClass275_101.method6364()) {
			@Pc(44) byte local44 = 1;
			@Pc(49) Class120 local49 = local40.aClass29_Sub2_Sub1_Sub1_1.method7009();
			if (local40.aClass29_Sub2_Sub1_Sub1_1.aBoolean597) {
				local44 = 0;
			} else if (local49.anInt2874 == local40.aClass29_Sub2_Sub1_Sub1_1.anInt8535 || local40.aClass29_Sub2_Sub1_Sub1_1.anInt8535 == local49.anInt2905 || local49.anInt2904 == local40.aClass29_Sub2_Sub1_Sub1_1.anInt8535 || local49.anInt2882 == local40.aClass29_Sub2_Sub1_Sub1_1.anInt8535) {
				local44 = 2;
			} else if (local49.anInt2909 == local40.aClass29_Sub2_Sub1_Sub1_1.anInt8535 || local49.anInt2867 == local40.aClass29_Sub2_Sub1_Sub1_1.anInt8535 || local40.aClass29_Sub2_Sub1_Sub1_1.anInt8535 == local49.anInt2870 || local40.aClass29_Sub2_Sub1_Sub1_1.anInt8535 == local49.anInt2902) {
				local44 = 3;
			}
			if (local44 != local40.anInt3142) {
				@Pc(144) int local144 = Static439.method6316(local40.aClass29_Sub2_Sub1_Sub1_1);
				@Pc(148) Class257 local148 = local40.aClass29_Sub2_Sub1_Sub1_1.aClass257_1;
				if (local148.anIntArray571 != null) {
					local148 = local148.method5935(Static505.aClass30_1);
				}
				if (local148 == null || local144 == -1) {
					local40.anInt3144 = -1;
					local40.aBoolean213 = false;
				} else if (local40.anInt3144 != local144 || local148.aBoolean500 != local40.aBoolean213) {
					if (local40.aClass6_Sub19_Sub2_2 != null) {
						Static144.aClass6_Sub19_Sub3_2.method6424(local40.aClass6_Sub19_Sub2_2);
						local40.aClass6_Sub19_Sub2_2 = null;
					}
					local40.aBoolean213 = local148.aBoolean500;
					local40.aClass6_Sub50_2 = null;
					local40.anInt3144 = local144;
					local40.aClass6_Sub12_Sub1_2 = null;
				}
				local40.anInt3142 = local44;
			}
			local40.anInt3147 = local40.aClass29_Sub2_Sub1_Sub1_1.anInt9222;
			local40.anInt3156 = local40.aClass29_Sub2_Sub1_Sub1_1.anInt9222 + (local40.aClass29_Sub2_Sub1_Sub1_1.method7008() << 8);
			local40.anInt3157 = local40.aClass29_Sub2_Sub1_Sub1_1.anInt9218;
			local40.anInt3150 = local40.aClass29_Sub2_Sub1_Sub1_1.anInt9218 + (local40.aClass29_Sub2_Sub1_Sub1_1.method7008() << 8);
			Static192.method2862(arg3, arg2, arg0, arg1, local40);
		}
		for (@Pc(270) Class6_Sub22 local270 = (Class6_Sub22) Static214.aClass212_12.method5099(); local270 != null; local270 = (Class6_Sub22) Static214.aClass212_12.method5103()) {
			@Pc(274) byte local274 = 1;
			@Pc(279) Class120 local279 = local270.aClass29_Sub2_Sub1_Sub2_1.method7009();
			if (local270.aClass29_Sub2_Sub1_Sub2_1.aBoolean597) {
				local274 = 0;
			} else if (local270.aClass29_Sub2_Sub1_Sub2_1.anInt8535 == local279.anInt2874 || local279.anInt2905 == local270.aClass29_Sub2_Sub1_Sub2_1.anInt8535 || local270.aClass29_Sub2_Sub1_Sub2_1.anInt8535 == local279.anInt2904 || local270.aClass29_Sub2_Sub1_Sub2_1.anInt8535 == local279.anInt2882) {
				local274 = 2;
			} else if (local270.aClass29_Sub2_Sub1_Sub2_1.anInt8535 == local279.anInt2909 || local279.anInt2867 == local270.aClass29_Sub2_Sub1_Sub2_1.anInt8535 || local279.anInt2870 == local270.aClass29_Sub2_Sub1_Sub2_1.anInt8535 || local279.anInt2902 == local270.aClass29_Sub2_Sub1_Sub2_1.anInt8535) {
				local274 = 3;
			}
			if (local274 != local270.anInt3142) {
				@Pc(368) int local368 = Static441.method6342(local270.aClass29_Sub2_Sub1_Sub2_1);
				if (local270.anInt3144 != local368 || local270.aBoolean213 != local270.aClass29_Sub2_Sub1_Sub2_1.aBoolean604) {
					if (local270.aClass6_Sub19_Sub2_2 != null) {
						Static144.aClass6_Sub19_Sub3_2.method6424(local270.aClass6_Sub19_Sub2_2);
						local270.aClass6_Sub19_Sub2_2 = null;
					}
					local270.aBoolean213 = local270.aClass29_Sub2_Sub1_Sub2_1.aBoolean604;
					local270.aClass6_Sub12_Sub1_2 = null;
					local270.aClass6_Sub50_2 = null;
					local270.anInt3144 = local368;
				}
				local270.anInt3142 = local274;
			}
			local270.anInt3147 = local270.aClass29_Sub2_Sub1_Sub2_1.anInt9222;
			local270.anInt3156 = local270.aClass29_Sub2_Sub1_Sub2_1.anInt9222 + (local270.aClass29_Sub2_Sub1_Sub2_1.method7008() << 8);
			local270.anInt3157 = local270.aClass29_Sub2_Sub1_Sub2_1.anInt9218;
			local270.anInt3150 = local270.aClass29_Sub2_Sub1_Sub2_1.anInt9218 + (local270.aClass29_Sub2_Sub1_Sub2_1.method7008() << 8);
			Static192.method2862(arg3, arg2, arg0, arg1, local270);
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)I")
	public static int method2766() {
		return 46;
	}
}
