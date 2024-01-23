import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!la", name = "i", descriptor = "I")
	public static int anInt2598;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array35 = new Class41[100];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!q;IIBI)V")
	public static void method1819(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static194.method3305();
		Static64.method1166(arg2, arg3, arg2 + arg0.anInt3635, arg0.anInt3660 + arg3);
		if (Static219.anInt4791 == 2 || Static219.anInt4791 == 5) {
			Static64.method1177(arg2, arg3, arg0.anIntArray384, arg0.anIntArray385);
		} else {
			@Pc(42) int local42 = Static47.anInt1372 + Static183.anInt1324 & 0x7FF;
			@Pc(50) int local50 = 464 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
			@Pc(57) int local57 = Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32 + 48;
			((Class2_Sub2_Sub16_Sub1) Static96.aClass2_Sub2_Sub16_2).method2423(arg2, arg3, arg0.anInt3635, arg0.anInt3660, local57, local50, local42, Static58.anInt1635 + 256, arg0.anIntArray384, arg0.anIntArray385);
			@Pc(94) int local94;
			@Pc(108) int local108;
			for (@Pc(78) int local78 = 0; local78 < Static46.anInt4143; local78++) {
				local94 = Static124.anIntArray312[local78] * 4 + 2 - Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32;
				local108 = Static119.anIntArray307[local78] * 4 + 2 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
				@Pc(114) Class2_Sub2_Sub14 local114 = Static168.method2705(Static131.anIntArray322[local78]);
				if (local114.anIntArray324 != null) {
					local114 = local114.method2120();
					if (local114 == null || local114.anInt3065 == -1) {
						continue;
					}
				}
				Static52.method1009(arg3, arg2, local108, arg0, Static219.aClass2_Sub2_Sub16Array21[local114.anInt3065], local94);
			}
			@Pc(192) int local192;
			for (local94 = 0; local94 < 104; local94++) {
				for (local108 = 0; local108 < 104; local108++) {
					@Pc(167) Class108 local167 = Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local94][local108];
					if (local167 != null) {
						@Pc(180) int local180 = local94 * 4 + 2 - Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32;
						local192 = local108 * 4 + 2 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
						Static52.method1009(arg3, arg2, local192, arg0, Static33.aClass2_Sub2_Sub16Array4[0], local180);
					}
				}
			}
			@Pc(263) int local263;
			for (local108 = 0; local108 < Static50.anInt2134; local108++) {
				@Pc(224) Class12_Sub3_Sub2 local224 = Static199.aClass12_Sub3_Sub2Array1[Static23.anIntArray47[local108]];
				if (local224 != null && local224.method2727()) {
					@Pc(235) Class2_Sub2_Sub12 local235 = local224.aClass2_Sub2_Sub12_1;
					if (local235 != null && local235.anIntArray294 != null) {
						local235 = local235.method1902();
					}
					if (local235 != null && local235.aBoolean143 && local235.aBoolean144) {
						local263 = local224.anInt3949 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
						local192 = local224.anInt3961 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32;
						Static52.method1009(arg3, arg2, local263, arg0, Static33.aClass2_Sub2_Sub16Array4[1], local192);
					}
				}
			}
			for (@Pc(290) int local290 = 0; local290 < Static50.anInt2126; local290++) {
				@Pc(298) Class12_Sub3_Sub1 local298 = Static216.aClass12_Sub3_Sub1Array1[Static156.anIntArray386[local290]];
				if (local298 != null && local298.method2727()) {
					local192 = local298.anInt3961 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32;
					local263 = local298.anInt3949 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
					@Pc(328) boolean local328 = false;
					@Pc(333) long local333 = local298.aClass41_362.method1419();
					for (@Pc(335) int local335 = 0; local335 < Static131.anInt2996; local335++) {
						if (local333 == Static101.aLongArray7[local335] && Static145.anIntArray341[local335] != 0) {
							local328 = true;
							break;
						}
					}
					@Pc(361) boolean local361 = false;
					if (Static213.aClass12_Sub3_Sub1_1.anInt1207 != 0 && local298.anInt1207 != 0 && Static213.aClass12_Sub3_Sub1_1.anInt1207 == local298.anInt1207) {
						local361 = true;
					}
					if (local328) {
						Static52.method1009(arg3, arg2, local263, arg0, Static33.aClass2_Sub2_Sub16Array4[3], local192);
					} else if (local361) {
						Static52.method1009(arg3, arg2, local263, arg0, Static33.aClass2_Sub2_Sub16Array4[4], local192);
					} else {
						Static52.method1009(arg3, arg2, local263, arg0, Static33.aClass2_Sub2_Sub16Array4[2], local192);
					}
				}
			}
			@Pc(426) Class55[] local426 = Static57.aClass55Array1;
			@Pc(524) int local524;
			for (local192 = 0; local192 < local426.length; local192++) {
				@Pc(434) Class55 local434 = local426[local192];
				if (local434 != null && local434.anInt2526 != 0 && Static103.anInt2511 % 20 < 10) {
					@Pc(493) int local493;
					@Pc(483) int local483;
					if (local434.anInt2526 == 1 && local434.anInt2529 >= 0 && local434.anInt2529 < Static199.aClass12_Sub3_Sub2Array1.length) {
						@Pc(470) Class12_Sub3_Sub2 local470 = Static199.aClass12_Sub3_Sub2Array1[local434.anInt2529];
						if (local470 != null) {
							local483 = local470.anInt3961 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32;
							local493 = local470.anInt3949 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
							Static214.method3265(arg0, local483, arg3, local493, local434.anInt2524, arg2);
						}
					}
					if (local434.anInt2526 == 2) {
						local524 = (local434.anInt2525 + -Static198.anInt4451) * 4 + 2 - Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32;
						local483 = (local434.anInt2522 - Static168.anInt3899) * 4 + 2 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
						Static214.method3265(arg0, local524, arg3, local483, local434.anInt2524, arg2);
					}
					if (local434.anInt2526 == 10 && local434.anInt2529 >= 0 && local434.anInt2529 < Static216.aClass12_Sub3_Sub1Array1.length) {
						@Pc(571) Class12_Sub3_Sub1 local571 = Static216.aClass12_Sub3_Sub1Array1[local434.anInt2529];
						if (local571 != null) {
							local483 = local571.anInt3961 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32;
							local493 = local571.anInt3949 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
							Static214.method3265(arg0, local483, arg3, local493, local434.anInt2524, arg2);
						}
					}
				}
			}
			if (Static102.anInt2490 != 0) {
				local524 = Static125.anInt1524 * 4 + 2 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
				local263 = Static102.anInt2490 * 4 + 2 - Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32;
				Static52.method1009(arg3, arg2, local524, arg0, Static176.aClass2_Sub2_Sub16_3, local263);
			}
			Static64.method1164(arg0.anInt3635 / 2 + arg2 - 1, arg3 - -(arg0.anInt3660 / 2) + -1, 3, 3, 16777215);
		}
		Static187.aBooleanArray22[arg1] = true;
	}
}
