import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_6;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "[[Lclient!vd;")
	public static Class83[][] aClass83ArrayArray1;

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
	public static int anInt1344;

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "[I")
	public static int[] anIntArray142;

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "Lclient!je;")
	public static Class43 aClass43_3;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "Lclient!sd;")
	private static Class73 aClass73_734 = Static122.method531("Select");

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Lclient!sd;")
	public static Class73 aClass73_730 = aClass73_734;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "Lclient!sd;")
	private static Class73 aClass73_736 = Static122.method531("Invalid username or password)3");

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_731 = aClass73_736;

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Lclient!sd;")
	public static Class73 aClass73_732 = Static122.method531("sl_flags");

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Lclient!sd;")
	public static Class73 aClass73_733 = Static122.method531("<col=ffff00>");

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "Lclient!sd;")
	public static Class73 aClass73_735 = Static122.method531(":clan:");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public static void method995() {
		Static167.method2623(false);
		@Pc(10) boolean local10 = true;
		Static86.anInt1938 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static170.aByteArrayArray11.length; local14++) {
			if (Static151.anIntArray366[local14] != -1 && Static170.aByteArrayArray11[local14] == null) {
				Static170.aByteArrayArray11[local14] = Static125.aClass13_Sub1_15.method348(Static151.anIntArray366[local14], 0);
				if (Static170.aByteArrayArray11[local14] == null) {
					local10 = false;
					Static86.anInt1938++;
				}
			}
			if (Static122.anIntArray71[local14] != -1 && Static173.aByteArrayArray12[local14] == null) {
				Static173.aByteArrayArray12[local14] = Static125.aClass13_Sub1_15.method350(Static88.anIntArrayArray17[local14], Static122.anIntArray71[local14], 0);
				if (Static173.aByteArrayArray12[local14] == null) {
					local10 = false;
					Static86.anInt1938++;
				}
			}
		}
		if (!local10) {
			Static113.anInt2742 = 1;
			return;
		}
		local10 = true;
		Static9.anInt267 = 0;
		@Pc(117) int local117;
		@Pc(128) int local128;
		for (@Pc(98) int local98 = 0; local98 < Static170.aByteArrayArray11.length; local98++) {
			@Pc(104) byte[] local104 = Static173.aByteArrayArray12[local98];
			if (local104 != null) {
				local117 = (Static82.anIntArray187[local98] >> 8) * 64 - Static151.anInt3389;
				local128 = (Static82.anIntArray187[local98] & 0xFF) * 64 - Static134.anInt3066;
				if (Static47.aBoolean115) {
					local117 = 10;
					local128 = 10;
				}
				local10 &= Static166.method2607(local128, local104, local117);
			}
		}
		if (!local10) {
			Static113.anInt2742 = 2;
			return;
		}
		if (Static113.anInt2742 != 0) {
			Static104.method1816(true, Static19.method372(new Class73[] { Static133.aClass73_1696, Static140.aClass73_1756 }));
		}
		Static109.method1956();
		Static19.method377();
		Static109.method1956();
		Static119.aClass35_1.method1178();
		Static109.method1956();
		System.gc();
		for (@Pc(185) int local185 = 0; local185 < 4; local185++) {
			Static41.aClass60Array1[local185].method2147();
		}
		@Pc(206) int local206;
		for (local117 = 0; local117 < 4; local117++) {
			for (local128 = 0; local128 < 104; local128++) {
				for (local206 = 0; local206 < 104; local206++) {
					Static110.aByteArrayArrayArray5[local117][local128][local206] = 0;
				}
			}
		}
		Static109.method1956();
		Static3.method44();
		local128 = Static170.aByteArrayArray11.length;
		Static136.method2236();
		Static167.method2623(true);
		@Pc(262) int local262;
		@Pc(272) int local272;
		@Pc(381) int local381;
		@Pc(314) int local314;
		@Pc(370) int local370;
		if (!Static47.aBoolean115) {
			@Pc(276) byte[] local276;
			for (local206 = 0; local206 < local128; local206++) {
				local262 = (Static82.anIntArray187[local206] >> 8) * 64 - Static151.anInt3389;
				local272 = (Static82.anIntArray187[local206] & 0xFF) * 64 - Static134.anInt3066;
				local276 = Static170.aByteArrayArray11[local206];
				if (local276 != null) {
					Static109.method1956();
					Static170.method2658((Static26.anInt719 - 6) * 8, local262, local272, (Static54.anInt1286 - 6) * 8, Static41.aClass60Array1, local276);
				}
			}
			for (local262 = 0; local262 < local128; local262++) {
				local314 = (Static82.anIntArray187[local262] & 0xFF) * 64 - Static134.anInt3066;
				local272 = (Static82.anIntArray187[local262] >> 8) * 64 - Static151.anInt3389;
				@Pc(329) byte[] local329 = Static170.aByteArrayArray11[local262];
				if (local329 == null && Static54.anInt1286 < 800) {
					Static109.method1956();
					Static54.method968(local272, 64, local314, 64);
				}
			}
			Static167.method2623(true);
			for (local272 = 0; local272 < local128; local272++) {
				local276 = Static173.aByteArrayArray12[local272];
				if (local276 != null) {
					local370 = (Static82.anIntArray187[local272] >> 8) * 64 - Static151.anInt3389;
					local381 = (Static82.anIntArray187[local272] & 0xFF) * 64 - Static134.anInt3066;
					Static109.method1956();
					Static146.method2392(local381, local370, local276, Static41.aClass60Array1, Static119.aClass35_1);
				}
			}
		}
		@Pc(441) int local441;
		@Pc(447) int local447;
		if (Static47.aBoolean115) {
			@Pc(435) int local435;
			@Pc(458) int local458;
			@Pc(460) int local460;
			for (local206 = 0; local206 < 4; local206++) {
				Static109.method1956();
				for (local262 = 0; local262 < 13; local262++) {
					for (local272 = 0; local272 < 13; local272++) {
						@Pc(412) boolean local412 = false;
						local370 = Static159.anIntArrayArrayArray8[local206][local262][local272];
						if (local370 != -1) {
							local381 = local370 >> 24 & 0x3;
							local435 = local370 >> 3 & 0x7FF;
							local441 = local370 >> 1 & 0x3;
							local447 = local370 >> 14 & 0x3FF;
							local458 = (local447 / 8 << 8) + (local435 / 8);
							for (local460 = 0; local460 < Static82.anIntArray187.length; local460++) {
								if (Static82.anIntArray187[local460] == local458 && Static170.aByteArrayArray11[local460] != null) {
									Static94.method1624(local381, (local435 & 0x7) * 8, local206, local262 * 8, Static41.aClass60Array1, local272 * 8, Static170.aByteArrayArray11[local460], local441, (local447 & 0x7) * 8);
									local412 = true;
									break;
								}
							}
						}
						if (!local412) {
							Static40.method773(local272 * 8, local262 * 8, local206);
						}
					}
				}
			}
			for (local262 = 0; local262 < 13; local262++) {
				for (local272 = 0; local272 < 13; local272++) {
					local314 = Static159.anIntArrayArrayArray8[0][local262][local272];
					if (local314 == -1) {
						Static54.method968(local262 * 8, 8, local272 * 8, 8);
					}
				}
			}
			Static167.method2623(true);
			for (local272 = 0; local272 < 4; local272++) {
				Static109.method1956();
				for (local314 = 0; local314 < 13; local314++) {
					for (local370 = 0; local370 < 13; local370++) {
						local381 = Static159.anIntArrayArrayArray8[local272][local314][local370];
						if (local381 != -1) {
							local441 = local381 >> 24 & 0x3;
							local447 = local381 >> 1 & 0x3;
							local458 = local381 >> 3 & 0x7FF;
							local435 = local381 >> 14 & 0x3FF;
							local460 = (local435 / 8 << 8) + local458 / 8;
							for (@Pc(642) int local642 = 0; local642 < Static82.anIntArray187.length; local642++) {
								if (local460 == Static82.anIntArray187[local642] && Static173.aByteArrayArray12[local642] != null) {
									Static84.method1459(local272, (local458 & 0x7) * 8, local314 * 8, Static173.aByteArrayArray12[local642], local441, (local435 & 0x7) * 8, Static119.aClass35_1, Static41.aClass60Array1, local370 * 8, local447);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static167.method2623(true);
		Static19.method377();
		Static109.method1956();
		Static131.method2176(Static41.aClass60Array1, Static119.aClass35_1);
		Static167.method2623(true);
		local206 = Static108.anInt2483;
		if (Static147.anInt3309 < local206) {
			local206 = Static147.anInt3309;
		}
		if (local206 < Static147.anInt3309 - 1) {
		}
		if (Static85.aBoolean127) {
			Static119.aClass35_1.method1158(Static108.anInt2483);
		} else {
			Static119.aClass35_1.method1158(0);
		}
		for (local262 = 0; local262 < 104; local262++) {
			for (local272 = 0; local272 < 104; local272++) {
				Static109.method1954(local272, local262);
			}
		}
		Static109.method1956();
		Static116.method2045();
		Static19.method377();
		if (Static90.aFrame1 != null) {
			Static139.aClass3_Sub12_Sub1_3.method1400(224);
			Static139.aClass3_Sub12_Sub1_3.method1392(1057001181);
		}
		if (!Static47.aBoolean115) {
			local272 = (Static26.anInt719 - 6) / 8;
			local314 = (Static26.anInt719 + 6) / 8;
			local370 = (Static54.anInt1286 - 6) / 8;
			local381 = (Static54.anInt1286 + 6) / 8;
			for (local441 = local272 - 1; local441 <= local314 + 1; local441++) {
				for (local447 = local370 - 1; local447 <= local381 + 1; local447++) {
					if (local272 > local441 || local441 > local314 || local447 < local370 || local447 > local381) {
						Static125.aClass13_Sub1_15.method351(Static19.method372(new Class73[] { Static31.aClass73_473, Static154.method2485(local441), Static42.aClass73_286, Static154.method2485(local447) }));
						Static125.aClass13_Sub1_15.method351(Static19.method372(new Class73[] { Static87.aClass73_1067, Static154.method2485(local441), Static42.aClass73_286, Static154.method2485(local447) }));
					}
				}
			}
		}
		Static78.method1320(30);
		Static109.method1956();
		Static108.method1936();
		Static139.aClass3_Sub12_Sub1_3.method1400(97);
		Static56.method989();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILclient!f;IIZI)V")
	public static void method996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(6) int arg3) {
		Static52.anInt1269 = arg3;
		Static31.anInt816 = 2;
		Static71.anInt1634 = arg1;
		Static71.aClass13_13 = arg2;
		Static137.anInt3105 = 1;
		Static4.aBoolean7 = false;
		Static130.anInt2969 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
	public static void method998() {
		aClass73_735 = null;
		aClass73_731 = null;
		aClass73_736 = null;
		aClass73_730 = null;
		aClass13_Sub1_6 = null;
		aClass73_734 = null;
		aClass73_732 = null;
		aClass73_733 = null;
		anIntArray142 = null;
		aClass43_3 = null;
		aClass83ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZZZ)I")
	public static int method1000() {
		return Static163.anInt3163 + Static124.anInt2868;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
	public static void method1001() {
		@Pc(9) int local9 = Static4.anInt78 * 128 + 64;
		@Pc(15) int local15 = Static142.anInt3267 * 128 + 64;
		@Pc(23) int local23 = Static107.method1922(local9, local15, Static147.anInt3309) - Static140.anInt3200;
		if (local9 > Static34.anInt834) {
			Static34.anInt834 += Static52.anInt1281 * (local9 - Static34.anInt834) / 1000 + Static120.anInt2826;
			if (local9 < Static34.anInt834) {
				Static34.anInt834 = local9;
			}
		}
		if (local9 < Static34.anInt834) {
			Static34.anInt834 -= Static52.anInt1281 * (Static34.anInt834 - local9) / 1000 + Static120.anInt2826;
			if (Static34.anInt834 < local9) {
				Static34.anInt834 = local9;
			}
		}
		if (Static19.anInt513 < local15) {
			Static19.anInt513 += Static120.anInt2826 + Static52.anInt1281 * (local15 - Static19.anInt513) / 1000;
			if (Static19.anInt513 > local15) {
				Static19.anInt513 = local15;
			}
		}
		if (local23 > Static55.anInt1291) {
			Static55.anInt1291 += Static52.anInt1281 * (local23 - Static55.anInt1291) / 1000 + Static120.anInt2826;
			if (Static55.anInt1291 > local23) {
				Static55.anInt1291 = local23;
			}
		}
		if (Static19.anInt513 > local15) {
			Static19.anInt513 -= Static120.anInt2826 + Static52.anInt1281 * (Static19.anInt513 - local15) / 1000;
			if (local15 > Static19.anInt513) {
				Static19.anInt513 = local15;
			}
		}
		if (Static55.anInt1291 > local23) {
			Static55.anInt1291 -= Static52.anInt1281 * (Static55.anInt1291 - local23) / 1000 + Static120.anInt2826;
			if (Static55.anInt1291 < local23) {
				Static55.anInt1291 = local23;
			}
		}
		local9 = Static74.anInt1667 * 128 + 64;
		local15 = Static102.anInt2294 * 128 + 64;
		local23 = Static107.method1922(local9, local15, Static147.anInt3309) - Static180.anInt3941;
		@Pc(194) int local194 = local9 - Static34.anInt834;
		@Pc(198) int local198 = local23 - Static55.anInt1291;
		@Pc(202) int local202 = local15 - Static19.anInt513;
		@Pc(213) int local213 = (int) Math.sqrt((double) (local202 * local202 + local194 * local194));
		@Pc(224) int local224 = (int) (Math.atan2((double) local198, (double) local213) * 325.949D) & 0x7FF;
		if (local224 < 128) {
			local224 = 128;
		}
		@Pc(242) int local242 = (int) (Math.atan2((double) local194, (double) local202) * -325.949D) & 0x7FF;
		if (local224 > 383) {
			local224 = 383;
		}
		if (Static130.anInt2973 < local224) {
			Static130.anInt2973 += (local224 - Static130.anInt2973) * Static72.anInt1641 / 1000 + Static28.anInt757;
			if (local224 < Static130.anInt2973) {
				Static130.anInt2973 = local224;
			}
		}
		@Pc(278) int local278 = local242 - Static141.anInt3252;
		if (Static130.anInt2973 > local224) {
			Static130.anInt2973 -= Static72.anInt1641 * (Static130.anInt2973 - local224) / 1000 + Static28.anInt757;
			if (Static130.anInt2973 < local224) {
				Static130.anInt2973 = local224;
			}
		}
		if (local278 > 1024) {
			local278 -= 2048;
		}
		if (local278 < -1024) {
			local278 += 2048;
		}
		if (local278 > 0) {
			Static141.anInt3252 += local278 * Static72.anInt1641 / 1000 + Static28.anInt757;
			Static141.anInt3252 &= 0x7FF;
		}
		if (local278 < 0) {
			Static141.anInt3252 -= Static28.anInt757 + Static72.anInt1641 * -local278 / 1000;
			Static141.anInt3252 &= 0x7FF;
		}
		@Pc(352) int local352 = local242 - Static141.anInt3252;
		if (local352 > 1024) {
			local352 -= 2048;
		}
		if (local352 < -1024) {
			local352 += 2048;
		}
		if (local352 < 0 && local278 > 0 || local352 > 0 && local278 < 0) {
			Static141.anInt3252 = local242;
		}
	}
}
