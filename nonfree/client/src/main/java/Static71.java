import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "Lclient!tv;")
	public static Class241 aClass241_3;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_27 = new Class2(11, 4);

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "[I")
	public static final int[] anIntArray102 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIIII)V")
	public static void method1181(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static19.aClass223ArrayArrayArray1 == null) {
			Static269.aClass51_9.method5286(arg2, -16777216, arg1, arg4, arg3);
		} else if (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 >= 0 && Static333.anInt3375 * 128 > Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 && Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 >= 0 && Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 < Static102.anInt2086 * 128) {
			Static143.anInt2745++;
			if (Static104.aClass26_Sub2_Sub4_Sub2_2 != null && Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 + 64 - Static104.aClass26_Sub2_Sub4_Sub2_2.method5512() * 64 >> 7 == Static153.anInt5631 && Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 + 64 - Static104.aClass26_Sub2_Sub4_Sub2_2.method5512() * 64 >> 7 == Static89.anInt1837) {
				Static89.anInt1837 = -1;
				Static153.anInt5631 = -1;
				Static87.method1508();
			}
			Static32.method421();
			if (!arg0) {
				Static410.method5159();
			}
			Static302.method4036();
			Static89.method1592(arg2, arg1, true, arg4, arg3);
			@Pc(118) int local118 = Static180.anInt3243;
			@Pc(120) int local120 = Static393.anInt6285;
			@Pc(122) int local122 = Static269.anInt4578;
			@Pc(124) int local124 = Static185.anInt3322;
			@Pc(135) int local135;
			@Pc(170) int local170;
			if (Static9.anInt60 == 1) {
				local135 = (int) Static67.aFloat36;
				if (local135 < Static290.anInt4840 >> 8) {
					local135 = Static290.anInt4840 >> 8;
				}
				if (Static172.aBooleanArray15[4] && local135 < Static388.anIntArray562[4] + 128) {
					local135 = Static388.anIntArray562[4] + 128;
				}
				local170 = (int) Static97.aFloat52 + Static243.anInt4160 & 0x3FFF;
				Static412.method5181(Static87.anInt1714, (local135 >> 3) * 3 + 600 << 0, Static333.method2748(Static268.anInt4539, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388) - 50, Static335.anInt5453, local170, local135, local118);
			} else if (Static9.anInt60 == 4) {
				local135 = (int) Static67.aFloat36;
				if (Static290.anInt4840 >> 8 > local135) {
					local135 = Static290.anInt4840 >> 8;
				}
				if (Static172.aBooleanArray15[4] && Static388.anIntArray562[4] + 128 > local135) {
					local135 = Static388.anIntArray562[4] + 128;
				}
				local170 = (int) Static97.aFloat52 & 0x3FFF;
				Static412.method5181(Static87.anInt1714, (local135 >> 3) * 3 + 600 << 0, Static333.method2748(Static268.anInt4539, Static17.anInt264, Static197.anInt3481) - 50, Static335.anInt5453, local170, local135, local118);
			} else if (Static9.anInt60 == 5) {
				Static316.method4108(local118);
			}
			local135 = Static46.anInt737;
			local170 = Static212.anInt3801;
			@Pc(278) int local278 = Static181.anInt3254;
			@Pc(280) int local280 = Static9.anInt55;
			@Pc(282) int local282 = Static92.anInt1897;
			@Pc(326) int local326;
			for (@Pc(284) int local284 = 0; local284 < 5; local284++) {
				if (Static172.aBooleanArray15[local284]) {
					local326 = (int) ((double) -Static365.anIntArray540[local284] + Math.random() * (double) (Static365.anIntArray540[local284] * 2 + 1) + Math.sin((double) Static282.anIntArray426[local284] / 100.0D * (double) Static356.anIntArray523[local284]) * (double) Static388.anIntArray562[local284]);
					if (local284 == 2) {
						Static181.anInt3254 += local326;
					}
					if (local284 == 3) {
						Static92.anInt1897 = Static92.anInt1897 + local326 & 0x3FFF;
					}
					if (local284 == 0) {
						Static46.anInt737 += local326;
					}
					if (local284 == 4) {
						Static9.anInt55 += local326;
						if (Static9.anInt55 < 1024) {
							Static9.anInt55 = 1024;
						} else if (Static9.anInt55 > 3072) {
							Static9.anInt55 = 3072;
						}
					}
					if (local284 == 1) {
						Static212.anInt3801 += local326;
					}
				}
			}
			if (Static46.anInt737 < 0) {
				Static46.anInt737 = 0;
			}
			if (Static181.anInt3254 < 0) {
				Static181.anInt3254 = 0;
			}
			if (Static46.anInt737 > (Static264.anInt4480 << 7) - 1) {
				Static46.anInt737 = (Static264.anInt4480 << 7) - 1;
			}
			if (Static181.anInt3254 > (Static295.anInt4910 << 7) - 1) {
				Static181.anInt3254 = (Static295.anInt4910 << 7) - 1;
			}
			Static310.method4077();
			Static422.method5410();
			Static269.aClass51_9.OA(local120, local124, local122 + local120, local118 + local124);
			Static269.aClass51_9.method5278();
			local326 = Static312.anInt5171;
			if (Static37.aClass196_1 == null) {
				Static269.aClass51_9.p(local326);
			} else {
				Static37.aClass196_1.method4084(local122, Static92.anInt1897, Static269.anInt4579 << 3, local326, local118, local120, local124, Static9.anInt55, Static269.aClass51_9);
			}
			Static330.method4331();
			Static179.aClass33_11.s(Static46.anInt737, Static212.anInt3801, Static181.anInt3254, -Static9.anInt55 & 0x3FFF, -Static92.anInt1897 & 0x3FFF, -Static408.anInt6454 & 0x3FFF);
			Static269.aClass51_9.ea(Static179.aClass33_11);
			Static269.aClass51_9.H(local122 / 2 + local120, local124 - -(local118 / 2), Static417.anInt6626 << 1, Static417.anInt6626 << 1);
			Static407.method5111(local120 + local122 / 2, Static417.anInt6626 << 1, local118 / 2 + local124, Static417.anInt6626 << 1);
			method1184(-Static9.anInt55 & 0x3FFF, Static181.anInt3254, -Static92.anInt1897 & 0x3FFF, Static212.anInt3801, -Static408.anInt6454 & 0x3FFF, Static46.anInt737);
			@Pc(556) byte local556 = Static130.aClass153_Sub1_1.method4230(Static377.anInt6113) == 2 ? (byte) Static143.anInt2745 : 1;
			Static341.method4432(Static269.aClass51_9, Static274.anInt4617, Static367.anInt5880, Static179.aClass33_11, Static46.anInt737, Static212.anInt3801, Static181.anInt3254, Static351.aByteArrayArrayArray17, Static315.anIntArray465, Static313.anIntArray464, Static382.anIntArray554, Static203.anIntArray321, Static4.anIntArray626, Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 + 1, local556, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 >> 7, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 >> 7, !Static130.aClass153_Sub1_1.aBoolean354);
			Static330.method4331();
			if (Static206.anInt3642 == 9) {
				Static72.method1194(local118, local124, local120, local122);
				Static117.method1987(local120, local118, local124, local122);
				Static279.method5723(local124, local122, local118, local120);
				Static94.method1664(local120, local122, local124, local118);
			}
			Static355.method2948();
			Static46.anInt737 = local135;
			Static92.anInt1897 = local282;
			Static181.anInt3254 = local278;
			Static9.anInt55 = local280;
			Static212.anInt3801 = local170;
			if (Static250.aBoolean275 && Static90.aClass120_1.method2660() == 0) {
				Static250.aBoolean275 = false;
			}
			if (Static250.aBoolean275) {
				Static269.aClass51_9.method5286(local122, -16777216, local120, local118, local124);
				Static374.method4823(Static259.aClass63_7, Static10.aClass55_6.method1205(Static5.anInt20), false);
			}
		} else {
			Static269.aClass51_9.method5286(arg2, -16777216, arg1, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZIIIII)V")
	private static void method1184(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static401.anInt6374 = arg5;
		Static123.anInt2422 = arg0;
		Static438.anInt7313 = arg3;
		Static112.anInt2261 = arg4;
		Static412.anInt6545 = arg2;
		Static442.anInt7338 = arg1;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Z")
	public static boolean method1185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
