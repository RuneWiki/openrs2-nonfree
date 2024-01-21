import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_196 = Static177.method3050("flash3:");

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_195 = aClass46_196;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_197 = Static177.method3050("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!jd;")
	public static Class46 aClass46_198 = aClass46_197;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Lclient!jd;")
	public static Class46 aClass46_199 = aClass46_196;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "[I")
	public static final int[] anIntArray60 = new int[128];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method395() {
		Static96.method1858(false);
		Static59.anInt1453 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static172.aByteArrayArray11.length; local14++) {
			if (Static182.anIntArray436[local14] != -1 && Static172.aByteArrayArray11[local14] == null) {
				Static172.aByteArrayArray11[local14] = Static160.aClass62_Sub1_88.method2878(Static182.anIntArray436[local14], 0);
				if (Static172.aByteArrayArray11[local14] == null) {
					local12 = false;
					Static59.anInt1453++;
				}
			}
			if (Static95.anIntArray282[local14] != -1 && Static154.aByteArrayArray12[local14] == null) {
				Static154.aByteArrayArray12[local14] = Static160.aClass62_Sub1_88.method2873(Static101.anIntArrayArray19[local14], 0, Static95.anIntArray282[local14]);
				if (Static154.aByteArrayArray12[local14] == null) {
					local12 = false;
					Static59.anInt1453++;
				}
			}
		}
		if (!local12) {
			Static46.anInt1215 = 1;
			return;
		}
		Static25.anInt617 = 0;
		local12 = true;
		@Pc(116) int local116;
		@Pc(126) int local126;
		for (@Pc(97) int local97 = 0; local97 < Static172.aByteArrayArray11.length; local97++) {
			@Pc(103) byte[] local103 = Static154.aByteArrayArray12[local97];
			if (local103 != null) {
				local116 = (Static83.anIntArray205[local97] >> 8) * 64 - Static103.anInt2610;
				local126 = (Static83.anIntArray205[local97] & 0xFF) * 64 - Static184.anInt4144;
				if (Static91.aBoolean104) {
					local116 = 10;
					local126 = 10;
				}
				local12 &= Static188.method3192(local116, local126, local103);
			}
		}
		if (!local12) {
			Static46.anInt1215 = 2;
			return;
		}
		if (Static46.anInt1215 != 0) {
			Static13.method264(true, Static69.method1482(new Class46[] { Static128.aClass46_1117, Static35.aClass46_310 }));
		}
		Static6.method100();
		Static88.method1744();
		Static6.method100();
		Static91.method1803();
		Static6.method100();
		System.gc();
		for (@Pc(183) int local183 = 0; local183 < 4; local183++) {
			Static29.aClass58Array1[local183].method1993();
		}
		@Pc(204) int local204;
		for (local116 = 0; local116 < 4; local116++) {
			for (local126 = 0; local126 < 104; local126++) {
				for (local204 = 0; local204 < 104; local204++) {
					Static53.aByteArrayArrayArray2[local116][local126][local204] = 0;
				}
			}
		}
		Static6.method100();
		Static93.method1815();
		local126 = Static172.aByteArrayArray11.length;
		Static128.method2258();
		Static96.method1858(true);
		@Pc(256) int local256;
		@Pc(266) int local266;
		@Pc(368) int local368;
		@Pc(320) int local320;
		@Pc(379) int local379;
		if (!Static91.aBoolean104) {
			@Pc(270) byte[] local270;
			for (local204 = 0; local204 < local126; local204++) {
				local256 = (Static83.anIntArray205[local204] >> 8) * 64 - Static103.anInt2610;
				local266 = (Static83.anIntArray205[local204] & 0xFF) * 64 - Static184.anInt4144;
				local270 = Static172.aByteArrayArray11[local204];
				if (local270 != null) {
					Static6.method100();
					Static183.method1443(local266, Static60.anInt1484 * 8 - 48, Static29.aClass58Array1, local270, (Static55.anInt1366 - 6) * 8, local256);
				}
			}
			for (local256 = 0; local256 < local126; local256++) {
				local266 = (Static83.anIntArray205[local256] >> 8) * 64 - Static103.anInt2610;
				local320 = (Static83.anIntArray205[local256] & 0xFF) * 64 - Static184.anInt4144;
				@Pc(324) byte[] local324 = Static172.aByteArrayArray11[local256];
				if (local324 == null && Static55.anInt1366 < 800) {
					Static6.method100();
					Static103.method1968(local320, local266, 64, 64);
				}
			}
			Static96.method1858(true);
			for (local266 = 0; local266 < local126; local266++) {
				local270 = Static154.aByteArrayArray12[local266];
				if (local270 != null) {
					local368 = (Static83.anIntArray205[local266] & 0xFF) * 64 - Static184.anInt4144;
					local379 = (Static83.anIntArray205[local266] >> 8) * 64 - Static103.anInt2610;
					Static6.method100();
					Static39.method688(local270, local368, local379, Static29.aClass58Array1);
				}
			}
		}
		@Pc(438) int local438;
		@Pc(444) int local444;
		if (Static91.aBoolean104) {
			@Pc(450) int local450;
			@Pc(460) int local460;
			@Pc(462) int local462;
			for (local204 = 0; local204 < 4; local204++) {
				Static6.method100();
				for (local256 = 0; local256 < 13; local256++) {
					for (local266 = 0; local266 < 13; local266++) {
						@Pc(414) boolean local414 = false;
						local379 = Static9.anIntArrayArrayArray6[local204][local256][local266];
						if (local379 != -1) {
							local368 = local379 >> 24 & 0x3;
							local438 = local379 >> 1 & 0x3;
							local444 = local379 >> 14 & 0x3FF;
							local450 = local379 >> 3 & 0x7FF;
							local460 = local450 / 8 + (local444 / 8 << 8);
							for (local462 = 0; local462 < Static83.anIntArray205.length; local462++) {
								if (Static83.anIntArray205[local462] == local460 && Static172.aByteArrayArray11[local462] != null) {
									Static187.method3165(Static29.aClass58Array1, local256 * 8, Static172.aByteArrayArray11[local462], local368, local266 * 8, (local450 & 0x7) * 8, local204, local438, (local444 & 0x7) * 8);
									local414 = true;
									break;
								}
							}
						}
						if (!local414) {
							Static181.method3120(local204, local266 * 8, local256 * 8);
						}
					}
				}
			}
			for (local256 = 0; local256 < 13; local256++) {
				for (local266 = 0; local266 < 13; local266++) {
					local320 = Static9.anIntArrayArrayArray6[0][local256][local266];
					if (local320 == -1) {
						Static103.method1968(local266 * 8, local256 * 8, 8, 8);
					}
				}
			}
			Static96.method1858(true);
			for (local266 = 0; local266 < 4; local266++) {
				Static6.method100();
				for (local320 = 0; local320 < 13; local320++) {
					for (local379 = 0; local379 < 13; local379++) {
						local368 = Static9.anIntArrayArrayArray6[local266][local320][local379];
						if (local368 != -1) {
							local438 = local368 >> 24 & 0x3;
							local444 = local368 >> 1 & 0x3;
							local460 = local368 >> 3 & 0x7FF;
							local450 = local368 >> 14 & 0x3FF;
							local462 = (local450 / 8 << 8) + (local460 / 8);
							for (@Pc(638) int local638 = 0; local638 < Static83.anIntArray205.length; local638++) {
								if (Static83.anIntArray205[local638] == local462 && Static154.aByteArrayArray12[local638] != null) {
									Static141.method2414(local444, (local450 & 0x7) * 8, (local460 & 0x7) * 8, Static29.aClass58Array1, local266, local438, Static154.aByteArrayArray12[local638], local320 * 8, local379 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static96.method1858(true);
		Static88.method1744();
		Static6.method100();
		Static93.method1817(Static29.aClass58Array1);
		Static96.method1858(true);
		local204 = Static38.anInt1011;
		if (local204 > Static73.anInt1873) {
			local204 = Static73.anInt1873;
		}
		if (local204 < Static73.anInt1873 - 1) {
		}
		if (Static103.aBoolean113) {
			Static184.method3169(Static38.anInt1011);
		} else {
			Static184.method3169(0);
		}
		for (local256 = 0; local256 < 104; local256++) {
			for (local266 = 0; local266 < 104; local266++) {
				Static147.method478(local266, local256);
			}
		}
		Static6.method100();
		Static88.method1741();
		Static88.method1744();
		if (Static164.aFrame1 != null) {
			Static90.aClass4_Sub11_Sub1_1.method1285(40);
			Static90.aClass4_Sub11_Sub1_1.method1256(1057001181);
		}
		if (!Static91.aBoolean104) {
			local266 = (Static60.anInt1484 - 6) / 8;
			local320 = (Static60.anInt1484 + 6) / 8;
			local379 = (Static55.anInt1366 - 6) / 8;
			local368 = (Static55.anInt1366 + 6) / 8;
			for (local438 = local266 - 1; local438 <= local320 + 1; local438++) {
				for (local444 = local379 - 1; local444 <= local368 + 1; local444++) {
					if (local438 < local266 || local438 > local320 || local379 > local444 || local444 > local368) {
						Static160.aClass62_Sub1_88.method2858(Static69.method1482(new Class46[] { Static152.aClass46_1285, Static127.method2240(local438), Static91.aClass46_847, Static127.method2240(local444) }));
						Static160.aClass62_Sub1_88.method2858(Static69.method1482(new Class46[] { Static158.aClass46_1312, Static127.method2240(local438), Static91.aClass46_847, Static127.method2240(local444) }));
					}
				}
			}
		}
		Static187.method3168(30);
		Static6.method100();
		Static160.method2721();
		Static90.aClass4_Sub11_Sub1_1.method1285(235);
		Static6.method101();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)Lclient!ef;")
	public static Class4_Sub1_Sub6 method396(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1_Sub6 local10 = (Class4_Sub1_Sub6) Static59.aClass66_27.method2225((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static65.method1389(arg0, Static91.aClass62_24, Static110.aClass62_30);
		if (local10 != null) {
			Static59.aClass66_27.method2222(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
	public static void method397() {
		for (@Pc(10) Class4_Sub24 local10 = (Class4_Sub24) Static121.aClass11_12.method274(); local10 != null; local10 = (Class4_Sub24) Static121.aClass11_12.method271()) {
			if (local10.aClass4_Sub1_Sub19_1 != null) {
				local10.method2743();
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!nh;Lclient!nh;Lclient!nh;I)V")
	public static void method398(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class62 arg2) {
		Static91.aClass62_24 = arg0;
		Static110.aClass62_30 = arg2;
		Static136.aClass62_34 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Lclient!jd;")
	public static Class46 method399(@OriginalArg(0) int arg0) {
		return Static69.method1482(new Class46[] { Static127.method2240(arg0 >> 24 & 0xFF), Static174.aClass46_1427, Static127.method2240(arg0 >> 16 & 0xFF), Static174.aClass46_1427, Static127.method2240(arg0 >> 8 & 0xFF), Static174.aClass46_1427, Static127.method2240(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public static void method400() {
		for (@Pc(6) Class4_Sub14 local6 = (Class4_Sub14) Static106.aClass20_5.method504(); local6 != null; local6 = (Class4_Sub14) Static106.aClass20_5.method498()) {
			@Pc(11) int local11 = local6.anInt2450;
			if (Static165.method2751(local11)) {
				@Pc(19) boolean local19 = true;
				@Pc(23) Class1[] local23 = Static54.aClass1ArrayArray1[local11];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					if (local23[local25] != null) {
						local19 = local23[local25].aBoolean8;
						break;
					}
				}
				if (!local19) {
					@Pc(49) int local49 = (int) local6.aLong148;
					@Pc(53) Class1 local53 = Static154.method3136(local49);
					if (local53 != null) {
						Static3.method21(local53);
					}
				}
			}
		}
	}
}
