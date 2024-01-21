import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1169 = Static49.method1293("sch-Utteln:");

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "[Lclient!mh;")
	public static Class53[] aClass53Array3 = new Class53[100];

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1172 = Static49.method1293("Please try using a different world)3");

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1170 = aClass70_1172;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public static int anInt3479 = 255;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1171 = aClass70_1172;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1173 = aClass70_1172;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1174 = aClass70_1172;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1175 = aClass70_1172;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1176 = aClass70_1172;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1177 = Static49.method1293("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
	public static void method2576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static115.anInt3162 == 1) {
			Static106.aClass1_Sub1_Sub1_Sub4Array6[Static100.anInt2853 / 100].method3021(Static107.anInt3036 - 8, Static126.anInt822 + -8);
		}
		if (Static115.anInt3162 == 2) {
			Static106.aClass1_Sub1_Sub1_Sub4Array6[Static100.anInt2853 / 100 + 4].method3021(Static107.anInt3036 - 8, Static126.anInt822 + -8);
		}
		Static131.method2563();
		if (!Static89.aBoolean103) {
			return;
		}
		@Pc(58) int local58 = arg2 + 512 - 5;
		@Pc(62) int local62 = arg3 + 20;
		Static113.aClass1_Sub1_Sub1_Sub2_Sub1_3.method2387(Static160.method3210(new Class70[] { Static28.aClass70_293, Static34.method873(Static110.anInt3090) }), local58, local62, 16776960, -1);
		@Pc(83) int local83 = local62 + 15;
		@Pc(85) Runtime local85 = Runtime.getRuntime();
		@Pc(95) int local95 = (int) ((local85.totalMemory() - local85.freeMemory()) / 1024L);
		@Pc(97) int local97 = 16776960;
		if (local95 > 32768 && Static79.aBoolean91) {
			local97 = 16711680;
		}
		if (local95 > 65536 && !Static79.aBoolean91) {
			local97 = 16711680;
		}
		Static113.aClass1_Sub1_Sub1_Sub2_Sub1_3.method2387(Static160.method3210(new Class70[] { Static184.aClass70_1596, Static34.method873(local95), Static113.aClass70_1021 }), local58, local83, local97, -1);
		local62 = local83 + 15;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIILclient!s;IJZ)Z")
	public static boolean method2577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static93.method2007(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method2578() {
		anIntArray331 = null;
		aClass70_1173 = null;
		aClass70_1174 = null;
		aClass70_1176 = null;
		aClass53Array3 = null;
		aClass70_1175 = null;
		aClass70_1177 = null;
		aClass70_1172 = null;
		aClass70_1169 = null;
		aClass70_1171 = null;
		aClass70_1170 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method2579() {
		if (Static111.aBooleanArray14[96]) {
			Static109.anInt3061 += (-Static109.anInt3061 - 24) / 2;
		} else if (Static111.aBooleanArray14[97]) {
			Static109.anInt3061 += (24 - Static109.anInt3061) / 2;
		} else {
			Static109.anInt3061 /= 2;
		}
		if (Static111.aBooleanArray14[98]) {
			Static123.anInt3349 += (12 - Static123.anInt3349) / 2;
		} else if (Static111.aBooleanArray14[99]) {
			Static123.anInt3349 += (-Static123.anInt3349 - 12) / 2;
		} else {
			Static123.anInt3349 /= 2;
		}
		Static71.anInt2223 = Static71.anInt2223 + Static109.anInt3061 / 2 & 0x7FF;
		Static40.anInt1395 += Static123.anInt3349 / 2;
		@Pc(91) int local91 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 + Static16.anInt465;
		if (Static40.anInt1395 < 128) {
			Static40.anInt1395 = 128;
		}
		@Pc(104) int local104 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 + Static72.anInt2246;
		@Pc(106) int local106 = 0;
		if (Static165.anInt4303 - local104 < -500 || Static165.anInt4303 - local104 > 500 || Static132.anInt3459 - local91 < -500 || Static132.anInt3459 - local91 > 500) {
			Static132.anInt3459 = local91;
			Static165.anInt4303 = local104;
		}
		if (local104 != Static165.anInt4303) {
			Static165.anInt4303 += (local104 - Static165.anInt4303) / 16;
		}
		@Pc(160) int local160 = Static165.anInt4303 >> 7;
		if (Static40.anInt1395 > 383) {
			Static40.anInt1395 = 383;
		}
		if (local91 != Static132.anInt3459) {
			Static132.anInt3459 += (local91 - Static132.anInt3459) / 16;
		}
		@Pc(181) int local181 = Static132.anInt3459 >> 7;
		@Pc(187) int local187 = Static156.method3142(Static165.anInt4303, Static56.anInt1784, Static132.anInt3459);
		@Pc(207) int local207;
		if (local160 > 3 && local181 > 3 && local160 < 100 && local181 < 100) {
			for (local207 = local160 - 4; local207 <= local160 + 4; local207++) {
				for (@Pc(213) int local213 = local181 - 4; local213 <= local181 + 4; local213++) {
					@Pc(217) int local217 = Static56.anInt1784;
					if (local217 < 3 && (Static20.aByteArrayArrayArray1[1][local207][local213] & 0x2) == 2) {
						local217++;
					}
					@Pc(243) int local243 = local187 - Static142.anIntArrayArrayArray8[local217][local207][local213];
					if (local243 > local106) {
						local106 = local243;
					}
				}
			}
		}
		local207 = local106 * 192;
		if (local207 > 98048) {
			local207 = 98048;
		}
		if (local207 < 32768) {
			local207 = 32768;
		}
		if (Static157.anInt2669 < local207) {
			Static157.anInt2669 += (local207 - Static157.anInt2669) / 24;
		} else if (local207 < Static157.anInt2669) {
			Static157.anInt2669 += (local207 - Static157.anInt2669) / 80;
		}
	}
}
