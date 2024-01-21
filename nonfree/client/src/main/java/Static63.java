import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!h", name = "h", descriptor = "I")
	public static int anInt1354;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "[I")
	public static int[] anIntArray165;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "I")
	public static int anInt1351 = 0;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "Lclient!lf;")
	public static Class49 aClass49_688 = Static32.method683("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Lclient!lf;")
	public static Class49 aClass49_689 = Static32.method683(" <col=00ff80>");

	@OriginalMember(owner = "client!h", name = "l", descriptor = "I")
	public static int anInt1356 = 0;

	@OriginalMember(owner = "client!h", name = "p", descriptor = "Lclient!lf;")
	public static Class49 aClass49_690 = Static32.method683("<img=0>");

	@OriginalMember(owner = "client!h", name = "q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_691 = Static32.method683("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method1093() {
		Static54.method943(false);
		Static45.anInt1054 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static127.aByteArrayArray10.length; local14++) {
			if (Static45.anIntArray104[local14] != -1 && Static127.aByteArrayArray10[local14] == null) {
				Static127.aByteArrayArray10[local14] = Static151.aClass11_Sub1_34.method2049(0, Static45.anIntArray104[local14]);
				if (Static127.aByteArrayArray10[local14] == null) {
					Static45.anInt1054++;
					local12 = false;
				}
			}
			if (Static71.anIntArray174[local14] != -1 && Static78.aByteArrayArray8[local14] == null) {
				Static78.aByteArrayArray8[local14] = Static151.aClass11_Sub1_34.method2073(Static23.anIntArrayArray3[local14], Static71.anIntArray174[local14], 0);
				if (Static78.aByteArrayArray8[local14] == null) {
					Static45.anInt1054++;
					local12 = false;
				}
			}
		}
		if (!local12) {
			Static152.anInt3279 = 1;
			return;
		}
		Static125.anInt2749 = 0;
		local12 = true;
		@Pc(117) int local117;
		@Pc(127) int local127;
		for (@Pc(98) int local98 = 0; local98 < Static127.aByteArrayArray10.length; local98++) {
			@Pc(104) byte[] local104 = Static78.aByteArrayArray8[local98];
			if (local104 != null) {
				local117 = (Static91.anIntArray196[local98] >> 8) * 64 - Static49.anInt1133;
				local127 = (Static91.anIntArray196[local98] & 0xFF) * 64 - Static38.anInt944;
				if (Static5.aBoolean7) {
					local127 = 10;
					local117 = 10;
				}
				local12 &= Static113.method1918(local104, local127, local117);
			}
		}
		if (!local12) {
			Static152.anInt3279 = 2;
			return;
		}
		if (Static152.anInt3279 != 0) {
			Static91.method1580(Static33.method692(new Class49[] { Static104.aClass49_1038, Static38.aClass49_488 }), true);
		}
		Static167.method2773();
		Static110.method1894();
		Static167.method2773();
		Static24.method456();
		Static167.method2773();
		System.gc();
		for (@Pc(180) int local180 = 0; local180 < 4; local180++) {
			Static148.aClass48Array1[local180].method1589();
		}
		@Pc(203) int local203;
		for (local117 = 0; local117 < 4; local117++) {
			for (local127 = 0; local127 < 104; local127++) {
				for (local203 = 0; local203 < 104; local203++) {
					Static81.aByteArrayArrayArray2[local117][local127][local203] = 0;
				}
			}
		}
		Static167.method2773();
		Static50.method902();
		local127 = Static127.aByteArrayArray10.length;
		Static96.method1647();
		Static54.method943(true);
		@Pc(256) int local256;
		@Pc(270) int local270;
		@Pc(381) int local381;
		@Pc(309) int local309;
		@Pc(370) int local370;
		if (!Static5.aBoolean7) {
			@Pc(260) byte[] local260;
			for (local203 = 0; local203 < local127; local203++) {
				local256 = (Static91.anIntArray196[local203] >> 8) * 64 - Static49.anInt1133;
				local260 = Static127.aByteArrayArray10[local203];
				local270 = (Static91.anIntArray196[local203] & 0xFF) * 64 - Static38.anInt944;
				if (local260 != null) {
					Static167.method2773();
					Static31.method660(local260, Static94.anInt1979 * 8 - 48, (Static155.anInt3385 + -6) * 8, local256, local270, Static148.aClass48Array1);
				}
			}
			for (local256 = 0; local256 < local127; local256++) {
				local309 = (Static91.anIntArray196[local256] & 0xFF) * 64 - Static38.anInt944;
				local270 = (Static91.anIntArray196[local256] >> 8) * 64 - Static49.anInt1133;
				@Pc(324) byte[] local324 = Static127.aByteArrayArray10[local256];
				if (local324 == null && Static155.anInt3385 < 800) {
					Static167.method2773();
					Static121.method2047(local270, 64, 64, local309);
				}
			}
			Static54.method943(true);
			for (local270 = 0; local270 < local127; local270++) {
				local260 = Static78.aByteArrayArray8[local270];
				if (local260 != null) {
					local370 = (Static91.anIntArray196[local270] >> 8) * 64 - Static49.anInt1133;
					local381 = (Static91.anIntArray196[local270] & 0xFF) * 64 - Static38.anInt944;
					Static167.method2773();
					Static108.method1835(local370, local381, local260, Static148.aClass48Array1);
				}
			}
		}
		@Pc(435) int local435;
		@Pc(447) int local447;
		@Pc(441) int local441;
		if (Static5.aBoolean7) {
			@Pc(457) int local457;
			@Pc(459) int local459;
			for (local203 = 0; local203 < 4; local203++) {
				Static167.method2773();
				for (local256 = 0; local256 < 13; local256++) {
					for (local270 = 0; local270 < 13; local270++) {
						local370 = Static9.anIntArrayArrayArray1[local203][local256][local270];
						@Pc(419) boolean local419 = false;
						if (local370 != -1) {
							local381 = local370 >> 24 & 0x3;
							local435 = local370 >> 1 & 0x3;
							local441 = local370 >> 3 & 0x7FF;
							local447 = local370 >> 14 & 0x3FF;
							local457 = (local447 / 8 << 8) + local441 / 8;
							for (local459 = 0; local459 < Static91.anIntArray196.length; local459++) {
								if (local457 == Static91.anIntArray196[local459] && Static127.aByteArrayArray10[local459] != null) {
									local419 = true;
									Static72.method1197(local381, local435, Static148.aClass48Array1, local256 * 8, Static127.aByteArrayArray10[local459], local270 * 8, local203, (local441 & 0x7) * 8, (local447 & 0x7) * 8);
									break;
								}
							}
						}
						if (!local419) {
							Static162.method2743(local203, local256 * 8, local270 * 8);
						}
					}
				}
			}
			for (local256 = 0; local256 < 13; local256++) {
				for (local270 = 0; local270 < 13; local270++) {
					local309 = Static9.anIntArrayArrayArray1[0][local256][local270];
					if (local309 == -1) {
						Static121.method2047(local256 * 8, 8, 8, local270 * 8);
					}
				}
			}
			Static54.method943(true);
			for (local270 = 0; local270 < 4; local270++) {
				Static167.method2773();
				for (local309 = 0; local309 < 13; local309++) {
					for (local370 = 0; local370 < 13; local370++) {
						local381 = Static9.anIntArrayArrayArray1[local270][local309][local370];
						if (local381 != -1) {
							local435 = local381 >> 24 & 0x3;
							local447 = local381 >> 1 & 0x3;
							local441 = local381 >> 14 & 0x3FF;
							local457 = local381 >> 3 & 0x7FF;
							local459 = (local441 / 8 << 8) + (local457 / 8);
							for (@Pc(638) int local638 = 0; local638 < Static91.anIntArray196.length; local638++) {
								if (local459 == Static91.anIntArray196[local638] && Static78.aByteArrayArray8[local638] != null) {
									Static110.method1889(local447, local309 * 8, Static148.aClass48Array1, Static78.aByteArrayArray8[local638], local435, (local457 & 0x7) * 8, local370 * 8, (local441 & 0x7) * 8, local270);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static54.method943(true);
		Static110.method1894();
		Static167.method2773();
		Static65.method3009(Static148.aClass48Array1);
		Static54.method943(true);
		local203 = Static77.anInt1626;
		if (local203 > Static66.anInt1396) {
			local203 = Static66.anInt1396;
		}
		if (Static66.anInt1396 - 1 > local203) {
		}
		if (Static159.aBoolean148) {
			Static132.method2217(Static77.anInt1626);
		} else {
			Static132.method2217(0);
		}
		for (local256 = 0; local256 < 104; local256++) {
			for (local309 = 0; local309 < 104; local309++) {
				Static151.method2502(local256, local309);
			}
		}
		Static167.method2773();
		Static2.method22();
		Static110.method1894();
		if (Static24.aFrame1 != null) {
			Static176.aClass2_Sub13_Sub1_14.method2976(24);
			Static176.aClass2_Sub13_Sub1_14.method2952(1057001181);
		}
		if (!Static5.aBoolean7) {
			local309 = (Static94.anInt1979 - 6) / 8;
			local381 = (Static155.anInt3385 - 6) / 8;
			local435 = (Static155.anInt3385 + 6) / 8;
			local370 = (Static94.anInt1979 + 6) / 8;
			for (local447 = local309 - 1; local447 <= local370 + 1; local447++) {
				for (local441 = local381 - 1; local441 <= local435 + 1; local441++) {
					if (local447 < local309 || local447 > local370 || local441 < local381 || local441 > local435) {
						Static151.aClass11_Sub1_34.method2066(Static33.method692(new Class49[] { Static175.aClass49_1707, Static48.method882(local447), Static141.aClass49_1356, Static48.method882(local441) }));
						Static151.aClass11_Sub1_34.method2066(Static33.method692(new Class49[] { Static130.aClass49_1696, Static48.method882(local447), Static141.aClass49_1356, Static48.method882(local441) }));
					}
				}
			}
		}
		Static33.method691(30);
		Static167.method2773();
		Static168.method2794();
		Static176.aClass2_Sub13_Sub1_14.method2976(4);
		Static35.method731();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	public static void method1094() {
		Static142.anIntArray282 = null;
		Static9.aByteArrayArray1 = null;
		Static47.anIntArray105 = null;
		Static20.anIntArray41 = null;
		anIntArray165 = null;
		Static178.anIntArray364 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
	public static void method1095(@OriginalArg(1) int arg0) {
		@Pc(8) int[] local8 = Static120.aClass2_Sub2_Sub2_Sub3_5.anIntArray191;
		@Pc(16) int local16 = local8.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			local8[local18] = 1;
		}
		@Pc(43) int local43;
		@Pc(45) int local45;
		for (@Pc(30) int local30 = 1; local30 < 103; local30++) {
			local43 = (52736 - local30 * 512) * 4 + 24628;
			for (local45 = 1; local45 < 103; local45++) {
				if ((Static81.aByteArrayArrayArray2[arg0][local45][local30] & 0x18) == 0) {
					Static69.method1154(local8, local43, arg0, local45, local30);
				}
				if (arg0 < 3 && (Static81.aByteArrayArrayArray2[arg0 + 1][local45][local30] & 0x8) != 0) {
					Static69.method1154(local8, local43, arg0 + 1, local45, local30);
				}
				local43 += 4;
			}
		}
		Static120.aClass2_Sub2_Sub2_Sub3_5.method1524();
		local45 = (int) (Math.random() * 20.0D) + 228 << 16;
		local43 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + 238 - 10;
		@Pc(146) int local146;
		for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
			for (local146 = 1; local146 < 103; local146++) {
				if ((Static81.aByteArrayArrayArray2[arg0][local146][local142] & 0x18) == 0) {
					Static118.method1994(arg0, local142, local45, local43, local146);
				}
				if (arg0 < 3 && (Static81.aByteArrayArrayArray2[arg0 + 1][local146][local142] & 0x8) != 0) {
					Static118.method1994(arg0 + 1, local142, local45, local43, local146);
				}
			}
		}
		Static145.anInt3085 = 0;
		for (local146 = 0; local146 < 104; local146++) {
			for (@Pc(212) int local212 = 0; local212 < 104; local212++) {
				@Pc(219) long local219 = Static71.method1174(Static66.anInt1396, local146, local212);
				if (local219 != 0L) {
					@Pc(235) int local235 = Static124.method2146((int) (local219 >>> 32) & Integer.MAX_VALUE).anInt1515;
					if (local235 >= 0) {
						@Pc(242) int local242 = local146;
						@Pc(244) int local244 = local212;
						if (local235 != 22 && local235 != 29 && local235 != 34 && local235 != 36 && local235 != 46 && local235 != 47 && local235 != 48) {
							@Pc(276) int[][] local276 = Static148.aClass48Array1[Static66.anInt1396].anIntArrayArray21;
							for (@Pc(278) int local278 = 0; local278 < 10; local278++) {
								@Pc(285) int local285 = (int) (Math.random() * 4.0D);
								if (local285 == 0 && local242 > 0 && local146 - 3 < local242 && (local276[local242 - 1][local244] & 0x12C0108) == 0) {
									local242--;
								}
								if (local285 == 1 && local242 < 103 && local242 < local146 + 3 && (local276[local242 + 1][local244] & 0x12C0180) == 0) {
									local242++;
								}
								if (local285 == 2 && local244 > 0 && local244 > local212 - 3 && (local276[local242][local244 - 1] & 0x12C0102) == 0) {
									local244--;
								}
								if (local285 == 3 && local244 < 103 && local244 < local212 + 3 && (local276[local242][local244 + 1] & 0x12C0120) == 0) {
									local244++;
								}
							}
						}
						Static105.aClass2_Sub2_Sub2_Sub3Array4[Static145.anInt3085] = Static130.aClass2_Sub2_Sub2_Sub3Array11[local235];
						Static91.anIntArray194[Static145.anInt3085] = local242;
						Static7.anIntArray9[Static145.anInt3085] = local244;
						Static145.anInt3085++;
					}
				}
			}
		}
		Static62.aClass24_1.method1745();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method1096() {
		aClass49_691 = null;
		aClass49_688 = null;
		aClass49_689 = null;
		aClass49_690 = null;
		anIntArray165 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)I")
	public static int method1097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static80.method2928(arg1 - 1, arg0 - 1) + Static80.method2928(arg1 + 1, arg0 - 1) + Static80.method2928(arg1 + -1, arg0 + 1) + Static80.method2928(arg1 + 1, arg0 + 1);
		@Pc(74) int local74 = Static80.method2928(arg1 - 1, arg0) + Static80.method2928(arg1 + 1, arg0) + Static80.method2928(arg1, arg0 - 1) + Static80.method2928(arg1, arg0 + 1);
		@Pc(79) int local79 = Static80.method2928(arg1, arg0);
		return local74 / 8 + local45 / 16 + local79 / 4;
	}
}
