import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "Lclient!r;")
	public static Class61 aClass61_425 = Static129.method2060("event_opbase");

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "Lclient!r;")
	private static Class61 aClass61_429 = Static129.method2060(" from your ignore list first)3");

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "Lclient!r;")
	public static Class61 aClass61_426 = aClass61_429;

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "Lclient!ge;")
	public static Class29 aClass29_12 = new Class29(200);

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "Lclient!r;")
	public static Class61 aClass61_427 = Static129.method2060("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "Lclient!r;")
	public static Class61 aClass61_428 = Static129.method2060("::errortest");

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "Lclient!r;")
	private static Class61 aClass61_431 = Static129.method2060(" has logged out)3");

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lclient!r;")
	public static Class61 aClass61_430 = aClass61_431;

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
	public static int anInt1345 = 255;

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "Lclient!r;")
	public static Class61 aClass61_432 = Static129.method2060(" weitere Optionen");

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
	public static void method960() {
		aClass61_431 = null;
		aClass61_428 = null;
		aClass61_425 = null;
		aClass61_426 = null;
		aClass61_430 = null;
		aClass61_429 = null;
		aClass29_12 = null;
		aClass61_432 = null;
		aClass61_427 = null;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	public static void method961() {
		Static133.method2194(false);
		@Pc(10) boolean local10 = true;
		Static43.anInt1121 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static127.aByteArrayArray10.length; local14++) {
			if (Static125.anIntArray378[local14] != -1 && Static127.aByteArrayArray10[local14] == null) {
				Static127.aByteArrayArray10[local14] = Static45.aClass26_Sub1_7.method1038(Static125.anIntArray378[local14], 0);
				if (Static127.aByteArrayArray10[local14] == null) {
					Static43.anInt1121++;
					local10 = false;
				}
			}
			if (Static68.anIntArray251[local14] != -1 && Static50.aByteArrayArray5[local14] == null) {
				Static50.aByteArrayArray5[local14] = Static45.aClass26_Sub1_7.method1030(0, Static68.anIntArray251[local14], Static93.anIntArrayArray21[local14]);
				if (Static50.aByteArrayArray5[local14] == null) {
					local10 = false;
					Static43.anInt1121++;
				}
			}
		}
		if (!local10) {
			Static125.anInt3138 = 1;
			return;
		}
		Static98.anInt2577 = 0;
		local10 = true;
		@Pc(117) int local117;
		@Pc(128) int local128;
		for (@Pc(98) int local98 = 0; local98 < Static127.aByteArrayArray10.length; local98++) {
			@Pc(104) byte[] local104 = Static50.aByteArrayArray5[local98];
			if (local104 != null) {
				local117 = (Static2.anIntArray3[local98] >> 8) * 64 - Static19.anInt623;
				local128 = (Static2.anIntArray3[local98] & 0xFF) * 64 - Static25.anInt730;
				if (Static53.aBoolean47) {
					local117 = 10;
					local128 = 10;
				}
				local10 &= Static77.method1253(local117, local128, local104);
			}
		}
		if (!local10) {
			Static125.anInt3138 = 2;
			return;
		}
		if (Static125.anInt3138 != 0) {
			Static32.method651(Static123.method1929(new Class61[] { Static17.aClass61_165, Static43.aClass61_340 }), true);
		}
		Static48.method879();
		Static103.method1747();
		Static48.method879();
		Static61.aClass81_1.method2096();
		Static48.method879();
		System.gc();
		for (@Pc(186) int local186 = 0; local186 < 4; local186++) {
			Static103.aClass66Array1[local186].method1803();
		}
		@Pc(212) int local212;
		for (local117 = 0; local117 < 4; local117++) {
			for (local128 = 0; local128 < 104; local128++) {
				for (local212 = 0; local212 < 104; local212++) {
					Static30.aByteArrayArrayArray2[local117][local128][local212] = 0;
				}
			}
		}
		Static48.method879();
		Static29.method627();
		local128 = Static127.aByteArrayArray10.length;
		Static60.method1019();
		Static133.method2194(true);
		@Pc(266) int local266;
		@Pc(276) int local276;
		@Pc(379) int local379;
		@Pc(330) int local330;
		@Pc(389) int local389;
		if (!Static53.aBoolean47) {
			@Pc(280) byte[] local280;
			for (local212 = 0; local212 < local128; local212++) {
				local266 = (Static2.anIntArray3[local212] >> 8) * 64 - Static19.anInt623;
				local276 = (Static2.anIntArray3[local212] & 0xFF) * 64 - Static25.anInt730;
				local280 = Static127.aByteArrayArray10[local212];
				if (local280 != null) {
					Static48.method879();
					Static10.method192(Static107.anInt2777 * 8 - 48, local266, Static103.aClass66Array1, local280, local276, Static92.anInt2247 * 8 - 48);
				}
			}
			for (local266 = 0; local266 < local128; local266++) {
				local276 = (Static2.anIntArray3[local266] >> 8) * 64 - Static19.anInt623;
				local330 = (Static2.anIntArray3[local266] & 0xFF) * 64 - Static25.anInt730;
				@Pc(334) byte[] local334 = Static127.aByteArrayArray10[local266];
				if (local334 == null && Static92.anInt2247 < 800) {
					Static48.method879();
					Static48.method882(64, local330, 64, local276);
				}
			}
			Static133.method2194(true);
			for (local276 = 0; local276 < local128; local276++) {
				local280 = Static50.aByteArrayArray5[local276];
				if (local280 != null) {
					local379 = (Static2.anIntArray3[local276] & 0xFF) * 64 - Static25.anInt730;
					local389 = (Static2.anIntArray3[local276] >> 8) * 64 - Static19.anInt623;
					Static48.method879();
					Static96.method1638(local379, local280, local389, Static61.aClass81_1, Static103.aClass66Array1);
				}
			}
		}
		@Pc(443) int local443;
		@Pc(449) int local449;
		if (Static53.aBoolean47) {
			@Pc(455) int local455;
			@Pc(465) int local465;
			@Pc(467) int local467;
			for (local212 = 0; local212 < 4; local212++) {
				Static48.method879();
				for (local266 = 0; local266 < 13; local266++) {
					for (local276 = 0; local276 < 13; local276++) {
						@Pc(420) boolean local420 = false;
						local389 = Static60.anIntArrayArrayArray1[local212][local266][local276];
						if (local389 != -1) {
							local379 = local389 >> 24 & 0x3;
							local443 = local389 >> 1 & 0x3;
							local449 = local389 >> 14 & 0x3FF;
							local455 = local389 >> 3 & 0x7FF;
							local465 = local455 / 8 + (local449 / 8 << 8);
							for (local467 = 0; local467 < Static2.anIntArray3.length; local467++) {
								if (local465 == Static2.anIntArray3[local467] && Static127.aByteArrayArray10[local467] != null) {
									local420 = true;
									Static28.method618(Static103.aClass66Array1, local266 * 8, local379, local443, (local455 & 0x7) * 8, local276 * 8, Static127.aByteArrayArray10[local467], (local449 & 0x7) * 8, local212);
									break;
								}
							}
						}
						if (!local420) {
							Static82.method1488(local212, local266 * 8, local276 * 8);
						}
					}
				}
			}
			for (local266 = 0; local266 < 13; local266++) {
				for (local276 = 0; local276 < 13; local276++) {
					local330 = Static60.anIntArrayArrayArray1[0][local266][local276];
					if (local330 == -1) {
						Static48.method882(8, local276 * 8, 8, local266 * 8);
					}
				}
			}
			Static133.method2194(true);
			for (local276 = 0; local276 < 4; local276++) {
				Static48.method879();
				for (local330 = 0; local330 < 13; local330++) {
					for (local389 = 0; local389 < 13; local389++) {
						local379 = Static60.anIntArrayArrayArray1[local276][local330][local389];
						if (local379 != -1) {
							local443 = local379 >> 24 & 0x3;
							local449 = local379 >> 1 & 0x3;
							local455 = local379 >> 14 & 0x3FF;
							local465 = local379 >> 3 & 0x7FF;
							local467 = (local455 / 8 << 8) + (local465 / 8);
							for (@Pc(653) int local653 = 0; local653 < Static2.anIntArray3.length; local653++) {
								if (local467 == Static2.anIntArray3[local653] && Static50.aByteArrayArray5[local653] != null) {
									Static70.method1155(local330 * 8, local449, (local455 & 0x7) * 8, (local465 & 0x7) * 8, Static61.aClass81_1, local443, local389 * 8, local276, Static103.aClass66Array1, Static50.aByteArrayArray5[local653]);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static133.method2194(true);
		Static103.method1747();
		Static48.method879();
		Static87.method1548(Static103.aClass66Array1, Static61.aClass81_1);
		Static133.method2194(true);
		local212 = Static36.anInt1012;
		if (Static93.anInt2428 < local212) {
			local212 = Static93.anInt2428;
		}
		if (Static93.anInt2428 - 1 > local212) {
		}
		if (Static61.aBoolean57) {
			Static61.aClass81_1.method2114(Static36.anInt1012);
		} else {
			Static61.aClass81_1.method2114(0);
		}
		for (local266 = 0; local266 < 104; local266++) {
			for (local276 = 0; local276 < 104; local276++) {
				Static32.method648(local276, local266);
			}
		}
		Static48.method879();
		Static75.method1197();
		Static37.aClass29_10.method765();
		if (Static79.aFrame1 != null) {
			Static1.aClass5_Sub14_Sub1_1.method1489(54);
			Static1.aClass5_Sub14_Sub1_1.method1451(1057001181);
		}
		if (!Static53.aBoolean47) {
			local276 = (Static107.anInt2777 - 6) / 8;
			local330 = (Static107.anInt2777 + 6) / 8;
			local389 = (Static92.anInt2247 - 6) / 8;
			local379 = (Static92.anInt2247 + 6) / 8;
			for (local443 = local276 - 1; local443 <= local330 + 1; local443++) {
				for (local449 = local389 - 1; local449 <= local379 + 1; local449++) {
					if (local276 > local443 || local443 > local330 || local449 < local389 || local449 > local379) {
						Static45.aClass26_Sub1_7.method1032(Static123.method1929(new Class61[] { Static50.aClass61_393, Static39.method730(local443), Static11.aClass61_97, Static39.method730(local449) }));
						Static45.aClass26_Sub1_7.method1032(Static123.method1929(new Class61[] { Static99.aClass61_771, Static39.method730(local443), Static11.aClass61_97, Static39.method730(local449) }));
					}
				}
			}
		}
		Static36.method697(30);
		Static48.method879();
		Static23.method496();
		Static1.aClass5_Sub14_Sub1_1.method1489(34);
		Static114.method1870();
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V")
	public static void method962() {
		@Pc(12) Class44 local12 = Static127.aClass44_1;
		synchronized (Static127.aClass44_1) {
			Static96.anInt2501 = Static105.anInt3354;
			@Pc(27) int local27;
			if (Static41.anInt2294 >= 0) {
				while (Static76.anInt1866 != Static41.anInt2294) {
					local27 = Static8.anIntArray49[Static76.anInt1866];
					Static76.anInt1866 = Static76.anInt1866 + 1 & 0x7F;
					if (local27 >= 0) {
						Static110.aBooleanArray14[local27] = true;
					} else {
						Static110.aBooleanArray14[~local27] = false;
					}
				}
			} else {
				for (local27 = 0; local27 < 112; local27++) {
					Static110.aBooleanArray14[local27] = false;
				}
				Static41.anInt2294 = Static76.anInt1866;
			}
			Static105.anInt3354 = Static4.anInt2609;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!ff;II)Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3 method965(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static8.method174(arg1, arg0, arg2) ? Static93.method1600() : null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Lclient!r;")
	public static Class61 method966(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static123.method1929(new Class61[] { Static117.aClass61_934, Static39.method730(arg0), Static124.aClass61_980 });
		} else if (arg0 < 10000000) {
			return Static123.method1929(new Class61[] { Static17.aClass61_173, Static39.method730(arg0 / 1000), Static90.aClass61_706, Static124.aClass61_980 });
		} else {
			return Static123.method1929(new Class61[] { Static2.aClass61_10, Static39.method730(arg0 / 1000000), Static121.aClass61_955, Static124.aClass61_980 });
		}
	}
}
