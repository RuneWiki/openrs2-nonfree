import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!h", name = "p", descriptor = "I")
	public static int anInt882;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Lclient!hb;")
	public static Class27 aClass27_439 = Static87.method1648("k");

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!hb;")
	private static Class27 aClass27_440 = Static87.method1648("You have only just left another world)3");

	@OriginalMember(owner = "client!h", name = "w", descriptor = "Lclient!hb;")
	private static Class27 aClass27_449 = Static87.method1648("Password: ");

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Lclient!hb;")
	public static Class27 aClass27_441 = aClass27_449;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "Lclient!hb;")
	private static Class27 aClass27_442 = Static87.method1648("To play on this world move to a free area first");

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Lclient!hb;")
	public static Class27 aClass27_443 = aClass27_440;

	@OriginalMember(owner = "client!h", name = "l", descriptor = "Lclient!hb;")
	public static Class27 aClass27_444 = Static87.method1648("(U1");

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Lclient!hb;")
	public static Class27 aClass27_445 = Static87.method1648("::clientdrop");

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!hb;")
	private static Class27 aClass27_447 = Static87.method1648("wishes to duel with you)3");

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!hb;")
	public static Class27 aClass27_446 = aClass27_447;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "Lclient!hb;")
	private static Class27 aClass27_448 = Static87.method1648(" is already on your ignore list");

	@OriginalMember(owner = "client!h", name = "z", descriptor = "Lclient!hb;")
	public static Class27 aClass27_450 = aClass27_442;

	@OriginalMember(owner = "client!h", name = "A", descriptor = "Lclient!hb;")
	public static Class27 aClass27_451 = aClass27_448;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "I")
	public static int anInt887 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ne;B)V")
	public static void method695(@OriginalArg(0) Class3_Sub3_Sub2_Sub4 arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static34.anIntArray154.length; local13++) {
			Static34.anIntArray154[local13] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) ((double) 256 * Math.random() * 128.0D);
			Static34.anIntArray154[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(67) int local67;
		for (local36 = 0; local36 < 20; local36++) {
			for (local55 = 1; local55 < 255; local55++) {
				for (local59 = 1; local59 < 127; local59++) {
					local67 = (local55 << 7) + local59;
					Static59.anIntArray254[local67] = (Static34.anIntArray154[local67 + 128] + Static34.anIntArray154[local67 + 1] + Static34.anIntArray154[local67 - 1] + Static34.anIntArray154[local67 + -128]) / 4;
				}
			}
			@Pc(113) int[] local113 = Static34.anIntArray154;
			Static34.anIntArray154 = Static59.anIntArray254;
			Static59.anIntArray254 = local113;
		}
		if (arg0 == null) {
			return;
		}
		local55 = 0;
		for (local59 = 0; local59 < arg0.anInt1902; local59++) {
			for (local67 = 0; local67 < arg0.anInt1904; local67++) {
				if (arg0.aByteArray15[local55++] != 0) {
					@Pc(146) int local146 = arg0.anInt1905 + local67 + 16;
					@Pc(153) int local153 = local59 + arg0.anInt1900 + 16;
					@Pc(159) int local159 = (local153 << 7) + local146;
					Static34.anIntArray154[local159] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!nb;")
	public static Class3_Sub3_Sub9 method696(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub3_Sub9 local10 = (Class3_Sub3_Sub9) Static11.aClass21_32.method658((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static1.aClass54_1.method1615(10, arg0);
		local10 = new Class3_Sub3_Sub9();
		local10.anInt1778 = arg0;
		if (local20 != null) {
			local10.method1272(new Class3_Sub11(local20));
		}
		local10.method1271();
		if (local10.anInt1796 != -1) {
			local10.method1267(method696(local10.anInt1791), method696(local10.anInt1796));
		}
		if (!Static84.aBoolean106 && local10.aBoolean93) {
			local10.aClass27Array12 = null;
			local10.anInt1807 = 0;
			local10.aClass27_869 = Static36.aClass27_433;
			local10.aClass27Array11 = null;
		}
		Static11.aClass21_32.method660(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method697() {
		aClass27_442 = null;
		aClass27_444 = null;
		aClass27_450 = null;
		aClass27_443 = null;
		aClass27_449 = null;
		aClass27_451 = null;
		aClass27_441 = null;
		aClass27_445 = null;
		aClass27_447 = null;
		aClass27_446 = null;
		aClass27_440 = null;
		aClass27_439 = null;
		aClass27_448 = null;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Z")
	public static boolean method698() {
		if (Static91.aClass20_42 == null) {
			return false;
		}
		@Pc(151) int local151;
		try {
			@Pc(13) int local13 = Static91.aClass20_42.method655();
			if (local13 == 0) {
				return false;
			}
			if (Static34.anInt829 == -1) {
				Static91.aClass20_42.method648(0, Static47.aClass3_Sub11_Sub1_1.aByteArray17, 1);
				Static47.aClass3_Sub11_Sub1_1.anInt2060 = 0;
				Static34.anInt829 = Static47.aClass3_Sub11_Sub1_1.method1477();
				Static11.anInt2733 = Static22.anIntArray117[Static34.anInt829];
				local13--;
			}
			if (Static11.anInt2733 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static91.aClass20_42.method648(0, Static47.aClass3_Sub11_Sub1_1.aByteArray17, 1);
				Static11.anInt2733 = Static47.aClass3_Sub11_Sub1_1.aByteArray17[0] & 0xFF;
				local13--;
			}
			if (Static11.anInt2733 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static91.aClass20_42.method648(0, Static47.aClass3_Sub11_Sub1_1.aByteArray17, 2);
				local13 -= 2;
				Static47.aClass3_Sub11_Sub1_1.anInt2060 = 0;
				Static11.anInt2733 = Static47.aClass3_Sub11_Sub1_1.method1451();
			}
			if (Static11.anInt2733 > local13) {
				return false;
			}
			Static47.aClass3_Sub11_Sub1_1.anInt2060 = 0;
			Static91.aClass20_42.method648(0, Static47.aClass3_Sub11_Sub1_1.aByteArray17, Static11.anInt2733);
			Static99.anInt2622 = Static1.anInt13;
			Static1.anInt13 = Static19.anInt442;
			Static97.anInt2261 = 0;
			Static19.anInt442 = Static34.anInt829;
			if (Static34.anInt829 == 26) {
				Static1.anInt8 = Static47.aClass3_Sub11_Sub1_1.method1445();
				Static34.anInt829 = -1;
				if (Static34.anInt825 == Static1.anInt8) {
					Static75.aBoolean101 = true;
					if (Static1.anInt8 == 3) {
						Static34.anInt825 = 1;
					} else {
						Static34.anInt825 = 3;
					}
				}
				return true;
			}
			@Pc(147) int local147;
			@Pc(155) Class3_Sub3_Sub6 local155;
			if (Static34.anInt829 == 9) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1441();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1444();
				local155 = Static77.method1516(local151);
				local155.anInt1615 = 1;
				local155.anInt1607 = local147;
				Static34.anInt829 = -1;
				return true;
			}
			@Pc(174) long local174;
			if (Static34.anInt829 == 111) {
				local174 = Static47.aClass3_Sub11_Sub1_1.method1450();
				@Pc(180) Class27 local180 = Static38.method721(Static47.aClass3_Sub11_Sub1_1).method728();
				Static43.method901(local180, Static38.method712(local174).method746(), 6);
				Static34.anInt829 = -1;
				return true;
			}
			@Pc(206) Class3_Sub3_Sub6 local206;
			if (Static34.anInt829 == 25) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1434();
				local206 = Static77.method1516(local147);
				local206.anInt1615 = 3;
				local206.anInt1607 = Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.aClass15_2.method346();
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 142) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1451();
				Static64.method1184(local147);
				if (Static41.anInt1210 != -1) {
					Static97.method1607(Static41.anInt1210);
					Static75.aBoolean101 = true;
					Static41.anInt1210 = -1;
					Static86.aBoolean116 = true;
				}
				if (Static84.anInt2220 != -1) {
					Static97.method1607(Static84.anInt2220);
					Static13.aBoolean40 = true;
					Static84.anInt2220 = -1;
				}
				if (Static55.anInt1446 != -1) {
					Static97.method1607(Static55.anInt1446);
					Static55.anInt1446 = -1;
					Static109.method1459(30);
				}
				if (Static92.anInt2543 != -1) {
					Static97.method1607(Static92.anInt2543);
					Static92.anInt2543 = -1;
				}
				if (Static104.anInt2723 != local147) {
					Static97.method1607(Static104.anInt2723);
					Static104.anInt2723 = local147;
				}
				Static109.anInt2025 = -1;
				if (Static68.anInt1744 != 0) {
					Static13.aBoolean40 = true;
					Static68.anInt1744 = 0;
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 48) {
				Static99.method1807();
				Static34.anInt829 = -1;
				return true;
			}
			@Pc(328) int local328;
			@Pc(318) Class27 local318;
			if (Static34.anInt829 == 170) {
				local318 = Static47.aClass3_Sub11_Sub1_1.method1426();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1445();
				local328 = Static47.aClass3_Sub11_Sub1_1.method1421();
				if (local328 >= 1 && local328 <= 5) {
					if (local318.method763(Static43.aClass27_604)) {
						local318 = null;
					}
					Static55.aClass27Array7[local328 - 1] = local318;
					Static24.aBooleanArray6[local328 - 1] = local151 == 0;
				}
				Static34.anInt829 = -1;
				return true;
			}
			@Pc(391) long local391;
			@Pc(395) int local395;
			@Pc(387) Class27 local387;
			if (Static34.anInt829 == 234) {
				local318 = Static47.aClass3_Sub11_Sub1_1.method1426();
				@Pc(393) boolean local393;
				if (local318.method750(Static75.aClass27_990)) {
					local387 = local318.method747(0, local318.method739(Static78.aClass27_1024));
					local391 = local387.method758();
					local393 = false;
					for (local395 = 0; local395 < Static38.anInt910; local395++) {
						if (Static45.aLongArray5[local395] == local391) {
							local393 = true;
							break;
						}
					}
					if (!local393 && Static7.anInt182 == 0) {
						Static43.method901(Static101.aClass27_1264, local387, 4);
					}
				} else if (local318.method750(Static11.aClass27_1322)) {
					local393 = false;
					local387 = local318.method747(0, local318.method739(Static78.aClass27_1024));
					local391 = local387.method758();
					for (local395 = 0; local395 < Static38.anInt910; local395++) {
						if (Static45.aLongArray5[local395] == local391) {
							local393 = true;
							break;
						}
					}
					if (!local393 && Static7.anInt182 == 0) {
						Static43.method901(aClass27_446, local387, 8);
					}
				} else if (local318.method750(Static83.aClass27_1129)) {
					local393 = false;
					local387 = local318.method747(0, local318.method739(Static78.aClass27_1024));
					local391 = local387.method758();
					for (local395 = 0; local395 < Static38.anInt910; local395++) {
						if (local391 == Static45.aLongArray5[local395]) {
							local393 = true;
							break;
						}
					}
					if (!local393 && Static7.anInt182 == 0) {
						@Pc(550) Class27 local550 = local318.method747(local318.method739(Static78.aClass27_1024) + 1, local318.method765() - 9);
						Static43.method901(local550, local387, 8);
					}
				} else {
					Static43.method901(local318, Static45.aClass27_182, 0);
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 126) {
				Static66.anInt1712 = Static47.aClass3_Sub11_Sub1_1.method1422();
				Static62.anInt1619 = Static47.aClass3_Sub11_Sub1_1.method1421();
				for (local147 = Static62.anInt1619; local147 < Static62.anInt1619 + 8; local147++) {
					for (local151 = Static66.anInt1712; local151 < Static66.anInt1712 + 8; local151++) {
						if (Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local147][local151] != null) {
							Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local147][local151] = null;
							Static33.method669(local151, local147);
						}
					}
				}
				for (@Pc(623) Class3_Sub13 local623 = (Class3_Sub13) Static82.aClass28_10.method884(); local623 != null; local623 = (Class3_Sub13) Static82.aClass28_10.method875()) {
					if (local623.anInt2725 >= Static62.anInt1619 && local623.anInt2725 < Static62.anInt1619 + 8 && Static66.anInt1712 <= local623.anInt2716 && local623.anInt2716 < Static66.anInt1712 + 8 && Static68.anInt1747 == local623.anInt2710) {
						local623.anInt2707 = 0;
					}
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 221) {
				Static34.anInt825 = Static47.aClass3_Sub11_Sub1_1.method1422();
				Static34.anInt829 = -1;
				Static75.aBoolean101 = true;
				Static86.aBoolean116 = true;
				return true;
			}
			if (Static34.anInt829 == 144) {
				Static74.anInt2080 = Static47.aClass3_Sub11_Sub1_1.method1421();
				if (Static74.anInt2080 == 1) {
					Static42.anInt1229 = Static47.aClass3_Sub11_Sub1_1.method1451();
				}
				if (Static74.anInt2080 >= 2 && Static74.anInt2080 <= 6) {
					if (Static74.anInt2080 == 2) {
						Static11.anInt2734 = 64;
						Static47.anInt1276 = 64;
					}
					if (Static74.anInt2080 == 3) {
						Static11.anInt2734 = 0;
						Static47.anInt1276 = 64;
					}
					if (Static74.anInt2080 == 4) {
						Static47.anInt1276 = 64;
						Static11.anInt2734 = 128;
					}
					if (Static74.anInt2080 == 5) {
						Static11.anInt2734 = 64;
						Static47.anInt1276 = 0;
					}
					if (Static74.anInt2080 == 6) {
						Static47.anInt1276 = 128;
						Static11.anInt2734 = 64;
					}
					Static74.anInt2080 = 2;
					Static80.anInt2185 = Static47.aClass3_Sub11_Sub1_1.method1451();
					Static38.anInt926 = Static47.aClass3_Sub11_Sub1_1.method1451();
					Static19.anInt444 = Static47.aClass3_Sub11_Sub1_1.method1421();
				}
				if (Static74.anInt2080 == 10) {
					Static41.anInt1222 = Static47.aClass3_Sub11_Sub1_1.method1451();
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 246) {
				Static34.method676(false);
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 17) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1434();
				@Pc(810) boolean local810 = Static47.aClass3_Sub11_Sub1_1.method1421() == 1;
				local155 = Static77.method1516(local147);
				local155.aBoolean84 = local810;
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 115) {
				if (Static34.anInt825 == 12) {
					Static75.aBoolean101 = true;
				}
				Static96.anInt1720 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 71 || Static34.anInt829 == 33 || Static34.anInt829 == 230 || Static34.anInt829 == 37 || Static34.anInt829 == 158 || Static34.anInt829 == 66 || Static34.anInt829 == 89 || Static34.anInt829 == 163 || Static34.anInt829 == 209 || Static34.anInt829 == 79 || Static34.anInt829 == 116) {
				Static50.method975();
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 104) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1465();
				local387 = Static47.aClass3_Sub11_Sub1_1.method1426();
				local155 = Static77.method1516(local147);
				local155.aClass27_788 = local387;
				if (Static91.anIntArray372[Static34.anInt825] == local147 >> 16) {
					Static75.aBoolean101 = true;
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 146) {
				for (local147 = 0; local147 < Static18.anIntArray60.length; local147++) {
					if (Static18.anIntArray60[local147] != Static108.anIntArray400[local147]) {
						Static18.anIntArray60[local147] = Static108.anIntArray400[local147];
						Static59.method1109(local147);
						Static75.aBoolean101 = true;
					}
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 50) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1451();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1421();
				local328 = Static47.aClass3_Sub11_Sub1_1.method1451();
				if (Static41.anInt1224 != 0 && local151 != 0 && anInt887 < 50) {
					Static36.anIntArray159[anInt887] = local147;
					Static57.anIntArray245[anInt887] = local151;
					Static12.anIntArray53[anInt887] = local328;
					Static92.aClass36Array1[anInt887] = null;
					Static8.anIntArray41[anInt887] = 0;
					anInt887++;
				}
				Static34.anInt829 = -1;
				return true;
			}
			@Pc(1054) Class3_Sub3_Sub6 local1054;
			if (Static34.anInt829 == 135) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1429();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1465();
				local328 = Static47.aClass3_Sub11_Sub1_1.method1431();
				local1054 = Static77.method1516(local151);
				local1054.anInt1584 = local1054.anInt1616 + local147;
				local1054.anInt1596 = local1054.anInt1590 + local328;
				Static34.anInt829 = -1;
				return true;
			}
			@Pc(1105) int local1105;
			if (Static34.anInt829 == 84) {
				Static75.aBoolean101 = true;
				local147 = Static47.aClass3_Sub11_Sub1_1.method1470();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1422();
				local328 = Static47.aClass3_Sub11_Sub1_1.method1444();
				Static66.anIntArray298[local147] = local328;
				Static17.anIntArray59[local147] = local151;
				Static109.anIntArray325[local147] = 1;
				for (local1105 = 0; local1105 < 98; local1105++) {
					if (local328 >= Class5_Sub1.anIntArray148[local1105]) {
						Static109.anIntArray325[local147] = local1105 + 2;
					}
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 166) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1434();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1457();
				Static108.anIntArray400[local151] = local147;
				if (Static18.anIntArray60[local151] != local147) {
					Static18.anIntArray60[local151] = local147;
					Static59.method1109(local151);
					if (Static64.anInt1661 != -1) {
						Static13.aBoolean40 = true;
					}
					Static75.aBoolean101 = true;
				}
				Static34.anInt829 = -1;
				return true;
			}
			@Pc(1247) int local1247;
			@Pc(1235) int local1235;
			if (Static34.anInt829 == 109) {
				Static30.aBoolean45 = true;
				Static13.anInt772 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static65.anInt1671 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static7.anInt177 = Static47.aClass3_Sub11_Sub1_1.method1451();
				Static57.anInt1498 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static32.anInt807 = Static47.aClass3_Sub11_Sub1_1.method1421();
				if (Static32.anInt807 >= 100) {
					local147 = Static13.anInt772 * 128 + 64;
					local151 = Static65.anInt1671 * 128 + 64;
					local328 = Static48.method1675(local151, Static68.anInt1747, local147) - Static7.anInt177;
					local1105 = local147 - Static108.anInt2777;
					local395 = local151 - Static45.anInt371;
					local1235 = local328 - Static75.anInt2122;
					local1247 = (int) Math.sqrt((double) (local1105 * local1105 + local395 * local395));
					Static81.anInt2195 = (int) (Math.atan2((double) local1235, (double) local1247) * 325.949D) & 0x7FF;
					Static86.anInt2328 = (int) (Math.atan2((double) local1105, (double) local395) * -325.949D) & 0x7FF;
					if (Static81.anInt2195 < 128) {
						Static81.anInt2195 = 128;
					}
					if (Static81.anInt2195 > 383) {
						Static81.anInt2195 = 383;
					}
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 112) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1419();
				Static64.method1184(local147);
				if (Static84.anInt2220 != -1) {
					Static97.method1607(Static84.anInt2220);
					Static13.aBoolean40 = true;
					Static84.anInt2220 = -1;
				}
				if (Static55.anInt1446 != -1) {
					Static97.method1607(Static55.anInt1446);
					Static55.anInt1446 = -1;
					Static109.method1459(30);
				}
				if (Static92.anInt2543 != -1) {
					Static97.method1607(Static92.anInt2543);
					Static92.anInt2543 = -1;
				}
				if (Static104.anInt2723 != -1) {
					Static97.method1607(Static104.anInt2723);
					Static104.anInt2723 = -1;
				}
				if (local147 != Static41.anInt1210) {
					Static97.method1607(Static41.anInt1210);
					Static41.anInt1210 = local147;
				}
				Static86.aBoolean116 = true;
				Static109.anInt2025 = -1;
				if (Static68.anInt1744 != 0) {
					Static13.aBoolean40 = true;
					Static68.anInt1744 = 0;
				}
				Static34.anInt829 = -1;
				Static75.aBoolean101 = true;
				return true;
			}
			if (Static34.anInt829 == 56) {
				for (local147 = 0; local147 < Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1.length; local147++) {
					if (Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local147] != null) {
						Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local147].anInt2430 = -1;
					}
				}
				for (local151 = 0; local151 < Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2.length; local151++) {
					if (Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local151] != null) {
						Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local151].anInt2430 = -1;
					}
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 94) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1451();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1451();
				if (Static84.anInt2220 != -1) {
					Static97.method1607(Static84.anInt2220);
					Static84.anInt2220 = -1;
					Static13.aBoolean40 = true;
				}
				if (Static55.anInt1446 != -1) {
					Static97.method1607(Static55.anInt1446);
					Static55.anInt1446 = -1;
					Static109.method1459(30);
				}
				if (Static92.anInt2543 != -1) {
					Static97.method1607(Static92.anInt2543);
					Static92.anInt2543 = -1;
				}
				if (local147 != Static104.anInt2723) {
					Static97.method1607(Static104.anInt2723);
					Static104.anInt2723 = local147;
				}
				if (local151 != Static41.anInt1210) {
					Static97.method1607(Static41.anInt1210);
					Static41.anInt1210 = local151;
				}
				Static86.aBoolean116 = true;
				Static75.aBoolean101 = true;
				Static109.anInt2025 = -1;
				if (Static68.anInt1744 != 0) {
					Static68.anInt1744 = 0;
					Static13.aBoolean40 = true;
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 55) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1421();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1421();
				local328 = Static47.aClass3_Sub11_Sub1_1.method1421();
				local1105 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static85.aBooleanArray11[local147] = true;
				Static103.anIntArray393[local147] = local151;
				Static2.anIntArray2[local147] = local328;
				Static24.anIntArray122[local147] = local1105;
				Static77.anIntArray330[local147] = 0;
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 23) {
				Static38.anInt910 = Static11.anInt2733 / 8;
				for (local147 = 0; local147 < Static38.anInt910; local147++) {
					Static45.aLongArray5[local147] = Static47.aClass3_Sub11_Sub1_1.method1450();
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 91) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1428();
				if (local147 >= 0) {
					Static64.method1184(local147);
				}
				if (Static19.anInt446 != local147) {
					Static97.method1607(Static19.anInt446);
					Static19.anInt446 = local147;
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 202) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1444();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1457();
				local1105 = local151 >> 5 & 0x1F;
				local328 = local151 >> 10 & 0x1F;
				@Pc(1624) Class3_Sub3_Sub6 local1624 = Static77.method1516(local147);
				local1235 = local151 & 0x1F;
				local1624.anInt1620 = (local1235 << 3) + (local1105 << 11) + (local328 << 19);
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 226) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1434();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1451();
				local155 = Static77.method1516(local147);
				Static34.anInt829 = -1;
				local155.anInt1607 = local151;
				local155.anInt1615 = 2;
				return true;
			}
			if (Static34.anInt829 == 27) {
				local174 = Static47.aClass3_Sub11_Sub1_1.method1450();
				local391 = Static47.aClass3_Sub11_Sub1_1.method1451();
				@Pc(1693) long local1693 = (long) Static47.aClass3_Sub11_Sub1_1.method1424();
				@Pc(1699) long local1699 = local1693 + (local391 << 32);
				local1247 = Static47.aClass3_Sub11_Sub1_1.method1421();
				@Pc(1705) boolean local1705 = false;
				for (@Pc(1707) int local1707 = 0; local1707 < 100; local1707++) {
					if (Static82.aLongArray11[local1707] == local1699) {
						local1705 = true;
						break;
					}
				}
				if (local1247 <= 1) {
					for (@Pc(1730) int local1730 = 0; local1730 < Static38.anInt910; local1730++) {
						if (local174 == Static45.aLongArray5[local1730]) {
							local1705 = true;
							break;
						}
					}
				}
				if (!local1705 && Static7.anInt182 == 0) {
					Static82.aLongArray11[Static81.anInt2196] = local1699;
					Static81.anInt2196 = (Static81.anInt2196 + 1) % 100;
					@Pc(1771) Class27 local1771 = Static38.method721(Static47.aClass3_Sub11_Sub1_1).method728();
					if (local1247 == 2 || local1247 == 3) {
						Static43.method901(local1771, Static98.method1779(new Class27[] { Static42.aClass27_600, Static38.method712(local174).method746() }), 7);
					} else if (local1247 == 1) {
						Static43.method901(local1771, Static98.method1779(new Class27[] { Static4.aClass27_1330, Static38.method712(local174).method746() }), 7);
					} else {
						Static43.method901(local1771, Static38.method712(local174).method746(), 3);
					}
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 40) {
				Static4.anInt2754 = Static47.aClass3_Sub11_Sub1_1.method1419();
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 118) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1465();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1458();
				local155 = Static77.method1516(local147);
				Static34.anInt829 = -1;
				if (local151 != local155.anInt1575 || local151 == -1) {
					local155.anInt1575 = local151;
					local155.anInt1621 = 0;
					local155.anInt1598 = 0;
				}
				return true;
			}
			if (Static34.anInt829 == 5) {
				Static30.aBoolean45 = true;
				Static42.anInt1234 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static46.anInt1259 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static32.anInt808 = Static47.aClass3_Sub11_Sub1_1.method1451();
				Static36.anInt869 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static41.anInt1220 = Static47.aClass3_Sub11_Sub1_1.method1421();
				if (Static41.anInt1220 >= 100) {
					Static108.anInt2777 = Static42.anInt1234 * 128 + 64;
					Static45.anInt371 = Static46.anInt1259 * 128 + 64;
					Static75.anInt2122 = Static48.method1675(Static45.anInt371, Static68.anInt1747, Static108.anInt2777) - Static32.anInt808;
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 68) {
				if (Static41.anInt1210 != -1) {
					Static97.method1607(Static41.anInt1210);
					Static75.aBoolean101 = true;
					Static41.anInt1210 = -1;
					Static86.aBoolean116 = true;
				}
				if (Static84.anInt2220 != -1) {
					Static97.method1607(Static84.anInt2220);
					Static13.aBoolean40 = true;
					Static84.anInt2220 = -1;
				}
				if (Static55.anInt1446 != -1) {
					Static97.method1607(Static55.anInt1446);
					Static55.anInt1446 = -1;
					Static109.method1459(30);
				}
				if (Static92.anInt2543 != -1) {
					Static97.method1607(Static92.anInt2543);
					Static92.anInt2543 = -1;
				}
				if (Static104.anInt2723 != -1) {
					Static97.method1607(Static104.anInt2723);
					Static104.anInt2723 = -1;
				}
				Static34.anInt829 = -1;
				if (Static68.anInt1744 != 0) {
					Static13.aBoolean40 = true;
					Static68.anInt1744 = 0;
				}
				Static109.anInt2025 = -1;
				return true;
			}
			if (Static34.anInt829 == 58) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1441();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1444();
				local328 = Static47.aClass3_Sub11_Sub1_1.method1441();
				local1105 = Static47.aClass3_Sub11_Sub1_1.method1441();
				@Pc(2049) Class3_Sub3_Sub6 local2049 = Static77.method1516(local151);
				Static34.anInt829 = -1;
				local2049.anInt1622 = local1105;
				local2049.anInt1613 = local147;
				local2049.anInt1606 = local328;
				return true;
			}
			if (Static34.anInt829 == 129) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1423();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1441();
				local155 = Static77.method1516(local147);
				if (local155 != null && local155.anInt1608 == 0) {
					if (local151 < 0) {
						local151 = 0;
					}
					if (local155.anInt1611 - local155.anInt1579 < local151) {
						local151 = local155.anInt1611 - local155.anInt1579;
					}
					local155.anInt1618 = local151;
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 83) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1444();
				Static76.aClass64_7 = Static88.aClass32_4.method942(local147);
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 235) {
				Static18.anInt418 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 179) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1451();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1441();
				Static64.method1184(local147);
				if (local151 != -1) {
					Static64.method1184(local151);
				}
				if (Static104.anInt2723 != -1) {
					Static97.method1607(Static104.anInt2723);
					Static104.anInt2723 = -1;
				}
				if (Static41.anInt1210 != -1) {
					Static97.method1607(Static41.anInt1210);
					Static41.anInt1210 = -1;
				}
				if (Static84.anInt2220 != -1) {
					Static97.method1607(Static84.anInt2220);
					Static84.anInt2220 = -1;
				}
				if (local147 != Static55.anInt1446) {
					Static97.method1607(Static55.anInt1446);
					Static55.anInt1446 = local147;
					Static109.method1459(35);
				}
				if (local147 != Static92.anInt2543) {
					Static97.method1607(Static92.anInt2543);
					Static92.anInt2543 = local151;
				}
				Static34.anInt829 = -1;
				Static68.anInt1744 = 0;
				Static109.anInt2025 = -1;
				return true;
			}
			if (Static34.anInt829 == 137) {
				Static22.method446();
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 54) {
				Static75.aBoolean101 = true;
				local147 = Static47.aClass3_Sub11_Sub1_1.method1444();
				local206 = Static77.method1516(local147);
				local328 = Static47.aClass3_Sub11_Sub1_1.method1451();
				for (local1105 = 0; local1105 < local328; local1105++) {
					local1235 = Static47.aClass3_Sub11_Sub1_1.method1457();
					local395 = Static47.aClass3_Sub11_Sub1_1.method1445();
					if (local395 == 255) {
						local395 = Static47.aClass3_Sub11_Sub1_1.method1423();
					}
					if (local206.anIntArray274.length > local1105) {
						local206.anIntArray274[local1105] = local1235;
						local206.anIntArray275[local1105] = local395;
					}
				}
				for (local1235 = local328; local1235 < local206.anIntArray274.length; local1235++) {
					local206.anIntArray274[local1235] = 0;
					local206.anIntArray275[local1235] = 0;
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 16) {
				Static30.aBoolean45 = false;
				for (local147 = 0; local147 < 5; local147++) {
					Static85.aBooleanArray11[local147] = false;
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 154) {
				local174 = Static47.aClass3_Sub11_Sub1_1.method1450();
				local328 = Static47.aClass3_Sub11_Sub1_1.method1451();
				@Pc(2370) Class27 local2370 = Static38.method712(local174).method746();
				for (local1235 = 0; local1235 < Static43.anInt1241; local1235++) {
					if (local174 == Static53.aLongArray8[local1235]) {
						if (local328 != Static22.anIntArray116[local1235]) {
							Static22.anIntArray116[local1235] = local328;
							Static75.aBoolean101 = true;
							if (local328 > 0) {
								Static43.method901(Static98.method1779(new Class27[] { local2370, Static92.aClass27_1213 }), Static45.aClass27_182, 5);
							}
							if (local328 == 0) {
								Static43.method901(Static98.method1779(new Class27[] { local2370, Static93.aClass27_1217 }), Static45.aClass27_182, 5);
							}
						}
						local2370 = null;
						break;
					}
				}
				@Pc(2440) boolean local2440 = false;
				if (local2370 != null && Static43.anInt1241 < 200) {
					Static53.aLongArray8[Static43.anInt1241] = local174;
					Static46.aClass27Array5[Static43.anInt1241] = local2370;
					Static22.anIntArray116[Static43.anInt1241] = local328;
					Static43.anInt1241++;
					Static75.aBoolean101 = true;
				}
				while (!local2440) {
					local2440 = true;
					for (local1247 = 0; local1247 < Static43.anInt1241 - 1; local1247++) {
						if (Static22.anIntArray116[local1247] != Static72.anInt1911 && Static22.anIntArray116[local1247 + 1] == Static72.anInt1911 || Static22.anIntArray116[local1247] == 0 && Static22.anIntArray116[local1247 + 1] != 0) {
							local2440 = false;
							@Pc(2504) int local2504 = Static22.anIntArray116[local1247];
							Static22.anIntArray116[local1247] = Static22.anIntArray116[local1247 + 1];
							Static22.anIntArray116[local1247 + 1] = local2504;
							@Pc(2522) Class27 local2522 = Static46.aClass27Array5[local1247];
							Static46.aClass27Array5[local1247] = Static46.aClass27Array5[local1247 + 1];
							Static46.aClass27Array5[local1247 + 1] = local2522;
							@Pc(2540) long local2540 = Static53.aLongArray8[local1247];
							Static53.aLongArray8[local1247] = Static53.aLongArray8[local1247 + 1];
							Static53.aLongArray8[local1247 + 1] = local2540;
							Static75.aBoolean101 = true;
						}
					}
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 222) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1458();
				if (local147 != Static64.anInt1661) {
					Static97.method1607(Static64.anInt1661);
					Static64.anInt1661 = local147;
				}
				Static13.aBoolean40 = true;
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 233) {
				Static72.method1339(Static88.aClass32_4, Static11.anInt2733, Static47.aClass3_Sub11_Sub1_1);
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 36) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1451();
				@Pc(2624) byte local2624 = Static47.aClass3_Sub11_Sub1_1.method1449();
				Static108.anIntArray400[local147] = local2624;
				if (local2624 != Static18.anIntArray60[local147]) {
					Static18.anIntArray60[local147] = local2624;
					Static59.method1109(local147);
					Static75.aBoolean101 = true;
					if (Static64.anInt1661 != -1) {
						Static13.aBoolean40 = true;
					}
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 123) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1441();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1445();
				if (local147 == 65535) {
					local147 = -1;
				}
				if (local147 != Static91.anIntArray372[local151]) {
					Static97.method1607(Static91.anIntArray372[local151]);
					Static91.anIntArray372[local151] = local147;
				}
				Static34.anInt829 = -1;
				Static86.aBoolean116 = true;
				Static75.aBoolean101 = true;
				return true;
			}
			if (Static34.anInt829 == 232) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1441();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1457();
				local328 = Static47.aClass3_Sub11_Sub1_1.method1423();
				local1054 = Static77.method1516(local328);
				local1054.anInt1589 = (local147 << 16) + local151;
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 4) {
				Static90.anInt2496 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static75.aBoolean101 = true;
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 224) {
				Static68.anInt1744 = 2;
				Static13.aBoolean40 = true;
				Static45.aClass27_179 = Static45.aClass27_182;
				Static97.aBoolean112 = false;
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 201) {
				Static32.anInt809 = Static47.aClass3_Sub11_Sub1_1.method1451() * 30;
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 49) {
				Static66.anInt1712 = Static47.aClass3_Sub11_Sub1_1.method1470();
				Static62.anInt1619 = Static47.aClass3_Sub11_Sub1_1.method1470();
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 255) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1457();
				Static64.method1184(local147);
				if (Static41.anInt1210 != -1) {
					Static97.method1607(Static41.anInt1210);
					Static86.aBoolean116 = true;
					Static41.anInt1210 = -1;
					Static75.aBoolean101 = true;
				}
				if (Static55.anInt1446 != -1) {
					Static97.method1607(Static55.anInt1446);
					Static55.anInt1446 = -1;
					Static109.method1459(30);
				}
				if (Static92.anInt2543 != -1) {
					Static97.method1607(Static92.anInt2543);
					Static92.anInt2543 = -1;
				}
				if (Static104.anInt2723 != -1) {
					Static97.method1607(Static104.anInt2723);
					Static104.anInt2723 = -1;
				}
				if (local147 != Static84.anInt2220) {
					Static97.method1607(Static84.anInt2220);
					Static84.anInt2220 = local147;
				}
				Static13.aBoolean40 = true;
				Static34.anInt829 = -1;
				Static109.anInt2025 = -1;
				return true;
			}
			if (Static34.anInt829 == 92) {
				if (Static34.anInt825 == 12) {
					Static75.aBoolean101 = true;
				}
				Static92.anInt2542 = Static47.aClass3_Sub11_Sub1_1.method1428();
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 195) {
				Static68.anInt1744 = 1;
				Static45.aClass27_179 = Static45.aClass27_182;
				Static97.aBoolean112 = false;
				Static34.anInt829 = -1;
				Static13.aBoolean40 = true;
				return true;
			}
			if (Static34.anInt829 == 215) {
				Static42.anInt1232 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 110) {
				Static34.method676(true);
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 76) {
				for (local147 = 0; local147 < anInt882; local147++) {
					@Pc(2930) Class3_Sub3_Sub5 local2930 = Static70.method1278(local147);
					if (local2930 != null && local2930.anInt1549 == 0) {
						Static108.anIntArray400[local147] = 0;
						Static18.anIntArray60[local147] = 0;
					}
				}
				Static75.aBoolean101 = true;
				if (Static64.anInt1661 != -1) {
					Static13.aBoolean40 = true;
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 250) {
				Static75.aBoolean101 = true;
				local147 = Static47.aClass3_Sub11_Sub1_1.method1444();
				local206 = Static77.method1516(local147);
				while (Static47.aClass3_Sub11_Sub1_1.anInt2060 < Static11.anInt2733) {
					local328 = Static47.aClass3_Sub11_Sub1_1.method1469();
					local1105 = Static47.aClass3_Sub11_Sub1_1.method1451();
					local1235 = 0;
					if (local1105 != 0) {
						local1235 = Static47.aClass3_Sub11_Sub1_1.method1421();
						if (local1235 == 255) {
							local1235 = Static47.aClass3_Sub11_Sub1_1.method1444();
						}
					}
					if (local328 >= 0 && local206.anIntArray274.length > local328) {
						local206.anIntArray274[local328] = local1105;
						local206.anIntArray275[local328] = local1235;
					}
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 211) {
				Static17.method309();
				Static34.anInt829 = -1;
				return false;
			}
			if (Static34.anInt829 == 167) {
				Static62.anInt1619 = Static47.aClass3_Sub11_Sub1_1.method1470();
				Static66.anInt1712 = Static47.aClass3_Sub11_Sub1_1.method1445();
				while (Static47.aClass3_Sub11_Sub1_1.anInt2060 < Static11.anInt2733) {
					Static34.anInt829 = Static47.aClass3_Sub11_Sub1_1.method1421();
					Static50.method975();
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 241) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1423();
				local206 = Static77.method1516(local147);
				for (local328 = 0; local328 < local206.anIntArray274.length; local328++) {
					local206.anIntArray274[local328] = -1;
					local206.anIntArray274[local328] = 0;
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 175) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1451();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1465();
				local328 = Static47.aClass3_Sub11_Sub1_1.method1451();
				local1054 = Static77.method1516(local151);
				if (local147 == 65535) {
					Static34.anInt829 = -1;
					local1054.anInt1615 = 0;
					return true;
				}
				@Pc(3156) Class3_Sub3_Sub9 local3156 = method696(local147);
				local1054.anInt1622 = local3156.anInt1810 * 100 / local328;
				local1054.anInt1613 = local3156.anInt1806;
				local1054.anInt1607 = local147;
				Static34.anInt829 = -1;
				local1054.anInt1615 = 4;
				local1054.anInt1606 = local3156.anInt1804;
				return true;
			}
			if (Static34.anInt829 == 219) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1441();
				if (local147 == 65535) {
					local147 = -1;
				}
				if (local147 == -1 && Static98.anInt2576 == 0) {
					Static1.method10();
				} else if (local147 != -1 && Static12.anInt283 != local147 && Static71.anInt1874 != 0 && Static98.anInt2576 == 0) {
					Static1.method13(local147, Static80.aClass54_Sub1_38, Static71.anInt1874, 0);
				}
				Static34.anInt829 = -1;
				Static12.anInt283 = local147;
				return true;
			}
			if (Static34.anInt829 == 1) {
				local147 = Static47.aClass3_Sub11_Sub1_1.method1424();
				local151 = Static47.aClass3_Sub11_Sub1_1.method1441();
				if (local151 == 65535) {
					local151 = -1;
				}
				if (Static71.anInt1874 != 0 && local151 != -1) {
					Static1.method4(1, Static71.anInt1874, Static108.aClass54_Sub1_52, local151);
					Static98.anInt2576 = local147;
				}
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 143) {
				Static77.anInt2150 = 0;
				Static34.anInt829 = -1;
				return true;
			}
			if (Static34.anInt829 == 28) {
				Static76.anInt2134 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static34.anInt828 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static61.anInt1554 = Static47.aClass3_Sub11_Sub1_1.method1421();
				Static13.aBoolean40 = true;
				Static34.anInt829 = -1;
				Static89.aBoolean120 = true;
				return true;
			}
			Static16.method293("T1 - " + Static34.anInt829 + "," + Static1.anInt13 + "," + Static99.anInt2622 + " - " + Static11.anInt2733, null);
			Static17.method309();
		} catch (@Pc(3336) IOException local3336) {
			Static98.method1777();
		} catch (@Pc(3340) Exception local3340) {
			@Pc(3381) String local3381 = "T2 - " + Static34.anInt829 + "," + Static1.anInt13 + "," + Static99.anInt2622 + " - " + Static11.anInt2733 + "," + (Static89.anInt2464 + Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0]) + "," + (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0] + Static101.anInt2631) + " - ";
			for (local151 = 0; local151 < Static11.anInt2733 && local151 < 50; local151++) {
				local3381 = local3381 + Static47.aClass3_Sub11_Sub1_1.aByteArray17[local151] + ",";
			}
			Static16.method293(local3381, local3340);
			Static17.method309();
		}
		return true;
	}
}
