import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "F")
	public static float aFloat119;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5441(@OriginalArg(1) Class100 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static389.aBoolean497) {
			local7 = Static240.method4161();
			local9 = Static452.method6945();
		}
		Static409.method6501(Static29.anInt622 + local7, Static400.anInt7476, local9 + Static94.anInt1854, arg0, Static483.anInt8373);
		Static173.aClass50_5.method5736(-1, Static29.anInt622 + local7 + 3, Static317.aClass192_24.method5299(Static307.anInt5931), local9 + Static94.anInt1854 + 14, -10660793);
		@Pc(63) int local63 = local7 + Static429.aClass71_1.method7701();
		@Pc(69) int local69 = local9 + Static429.aClass71_1.method7702();
		@Pc(73) int local73;
		@Pc(90) int local90;
		if (Static165.aBoolean249) {
			local73 = 0;
			for (@Pc(78) Class6_Sub2_Sub12 local78 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7242(); local78 != null; local78 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7241()) {
				local90 = local73 * 16 + local9 + Static94.anInt1854 + 31;
				if (local78.anInt5417 == 1) {
					Static80.method1402((Class6_Sub2_Sub4) local78.aClass286_6.aClass6_Sub2_56.aClass6_Sub2_66, local63, local9 + Static94.anInt1854, -1, local69, Static483.anInt8373, local90, arg0, Static400.anInt7476, Static29.anInt622 + local7, -256);
				} else {
					Static600.method8453(Static400.anInt7476, local78, Static29.anInt622 + local7, arg0, local63, local9 + Static94.anInt1854, Static483.anInt8373, local69, local90, -1, -256);
				}
				local73++;
			}
			if (Static72.aClass6_Sub2_Sub12_1 != null) {
				Static409.method6501(Static195.anInt3962, Static282.anInt5632, Static617.anInt10189, arg0, Static457.anInt8136);
				Static173.aClass50_5.method5736(-1, Static195.anInt3962 + 3, Static72.aClass6_Sub2_Sub12_1.aString58, Static617.anInt10189 + 14, -10660793);
				local73 = 0;
				for (@Pc(178) Class6_Sub2_Sub4 local178 = (Class6_Sub2_Sub4) Static72.aClass6_Sub2_Sub12_1.aClass286_6.method7242(); local178 != null; local178 = (Class6_Sub2_Sub4) Static72.aClass6_Sub2_Sub12_1.aClass286_6.method7241()) {
					@Pc(188) int local188 = Static617.anInt10189 + local73 * 16 + 31;
					local73++;
					Static80.method1402(local178, local63, Static617.anInt10189, -1, local69, Static457.anInt8136, local188, arg0, Static282.anInt5632, Static195.anInt3962, -256);
				}
				Static297.method6206(Static195.anInt3962, Static617.anInt10189, Static282.anInt5632, Static457.anInt8136);
			}
		} else {
			local73 = 0;
			for (@Pc(225) Class6_Sub2_Sub4 local225 = (Class6_Sub2_Sub4) Static298.aClass8_34.method149(); local225 != null; local225 = (Class6_Sub2_Sub4) Static298.aClass8_34.method155()) {
				local90 = local9 + Static94.anInt1854 + (Static462.anInt8179 + -1 - local73) * 16 + 31;
				Static80.method1402(local225, local63, Static94.anInt1854 + local9, -1, local69, Static483.anInt8373, local90, arg0, Static400.anInt7476, local7 + Static29.anInt622, -256);
				local73++;
			}
		}
		Static297.method6206(local7 + Static29.anInt622, Static94.anInt1854 + local9, Static400.anInt7476, Static483.anInt8373);
	}
}
