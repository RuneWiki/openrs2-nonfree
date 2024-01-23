import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
	public static int anInt1501;

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "[I")
	public static int[] anIntArray113;

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "Lclient!vd;")
	public static Class140 aClass140_3 = new Class140(512);

	@OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
	public static int anInt1509 = -1;

	@OriginalMember(owner = "client!eb", name = "Z", descriptor = "Lclient!fb;")
	public static Class1_Sub9 aClass1_Sub9_1 = new Class1_Sub9(0, 0);

	@OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
	public static int anInt1510 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
	public static void method1048(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static216.anIntArray379[arg0];
		@Pc(19) int local19 = Static161.anIntArray281[arg0];
		@Pc(23) int local23 = Static57.aShortArray26[arg0];
		@Pc(27) long local27 = Static84.aLongArray14[arg0];
		if (local23 >= 2000) {
			local23 -= 2000;
		}
		@Pc(36) int local36 = (int) Static84.aLongArray14[arg0];
		@Pc(43) Class9_Sub1_Sub1 local43;
		if (local23 == 57) {
			local43 = Static147.aClass9_Sub1_Sub1Array1[local36];
			if (local43 != null) {
				Static171.anInt3982 = 2;
				Static24.anInt805 = 0;
				Static266.anInt5550 = Static256.anInt5442;
				Static223.anInt4901 = Static133.anInt3300;
				Static171.aClass1_Sub13_Sub1_3.method1825(161);
				Static171.aClass1_Sub13_Sub1_3.method1807(local36);
				Static171.aClass1_Sub13_Sub1_3.method1782(Static167.anInt3917);
				Static171.aClass1_Sub13_Sub1_3.method1806(Static124.aBooleanArray7[82] ? 1 : 0);
				Static171.aClass1_Sub13_Sub1_3.method1807(Static161.anInt3798);
			}
		}
		if (local23 == 47) {
			Static171.aClass1_Sub13_Sub1_3.method1825(253);
			Static171.aClass1_Sub13_Sub1_3.method1789(local15);
			Static171.aClass1_Sub13_Sub1_3.method1755(local19);
			Static171.aClass1_Sub13_Sub1_3.method1759(local36);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		@Pc(127) Class9_Sub1_Sub2 local127;
		if (local23 == 5) {
			local127 = Static36.aClass9_Sub1_Sub2Array2[local36];
			if (local127 != null) {
				Static266.anInt5550 = Static256.anInt5442;
				Static24.anInt805 = 0;
				Static171.anInt3982 = 2;
				Static223.anInt4901 = Static133.anInt3300;
				Static171.aClass1_Sub13_Sub1_3.method1825(251);
				Static171.aClass1_Sub13_Sub1_3.method1796(Static221.anInt4841);
				Static171.aClass1_Sub13_Sub1_3.method1807(Static98.anInt2704);
				Static171.aClass1_Sub13_Sub1_3.method1806(Static124.aBooleanArray7[82] ? 1 : 0);
				Static171.aClass1_Sub13_Sub1_3.method1759(local36);
				Static171.aClass1_Sub13_Sub1_3.method1782(Static77.anInt2096);
			}
		}
		if (local23 == 1001) {
			Static266.anInt5550 = Static256.anInt5442;
			Static171.anInt3982 = 2;
			Static223.anInt4901 = Static133.anInt3300;
			Static24.anInt805 = 0;
			Static171.aClass1_Sub13_Sub1_3.method1825(193);
			Static171.aClass1_Sub13_Sub1_3.method1759(local36);
		}
		if (local23 == 6) {
			local127 = Static36.aClass9_Sub1_Sub2Array2[local36];
			if (local127 != null) {
				Static223.anInt4901 = Static133.anInt3300;
				Static171.anInt3982 = 2;
				Static24.anInt805 = 0;
				Static266.anInt5550 = Static256.anInt5442;
				Static171.aClass1_Sub13_Sub1_3.method1825(88);
				Static171.aClass1_Sub13_Sub1_3.method1796(local36);
				Static171.aClass1_Sub13_Sub1_3.method1766(Static124.aBooleanArray7[82] ? 1 : 0);
			}
		}
		if (local23 == 23) {
			Static171.aClass1_Sub13_Sub1_3.method1825(191);
			Static171.aClass1_Sub13_Sub1_3.method1755(local19);
			Static171.aClass1_Sub13_Sub1_3.method1789(local36);
			Static171.aClass1_Sub13_Sub1_3.method1782(Static167.anInt3917);
			Static171.aClass1_Sub13_Sub1_3.method1796(Static161.anInt3798);
			Static171.aClass1_Sub13_Sub1_3.method1807(local15);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (local23 == 10) {
			Static171.anInt3982 = 2;
			Static266.anInt5550 = Static256.anInt5442;
			Static24.anInt805 = 0;
			Static223.anInt4901 = Static133.anInt3300;
			Static171.aClass1_Sub13_Sub1_3.method1825(234);
			Static171.aClass1_Sub13_Sub1_3.method1807(local19 + Static29.anInt907);
			Static171.aClass1_Sub13_Sub1_3.method1796(local15 + Static64.anInt1786);
			Static171.aClass1_Sub13_Sub1_3.method1766(Static124.aBooleanArray7[82] ? 1 : 0);
			Static171.aClass1_Sub13_Sub1_3.method1759(Integer.MAX_VALUE & (int) (local27 >>> 32));
		}
		@Pc(351) Class122 local351;
		if (local23 == 50) {
			local351 = Static106.method2192(local15, local19);
			if (local351 != null) {
				Static263.method4206();
				@Pc(360) Class1_Sub27 local360 = Static39.method702(local351);
				Static167.method2903(local360.anInt4834, local351.anInt4665, local19, local360.method3657(), local351.anInt4727, local15);
				Static183.anInt5174 = 0;
				Static106.aString183 = Static19.method365(local351);
				if (Static106.aString183 == null) {
					Static106.aString183 = "Null";
				}
				if (!local351.aBoolean228) {
					Static120.aString194 = "<col=00ff00>" + local351.aString332 + "<col=ffffff>";
					return;
				}
				Static120.aString194 = local351.aString331 + "<col=ffffff>";
			}
			return;
		}
		if (local23 == 30) {
			local43 = Static147.aClass9_Sub1_Sub1Array1[local36];
			if (local43 != null) {
				Static24.anInt805 = 0;
				Static171.anInt3982 = 2;
				Static266.anInt5550 = Static256.anInt5442;
				Static223.anInt4901 = Static133.anInt3300;
				Static171.aClass1_Sub13_Sub1_3.method1825(0);
				Static171.aClass1_Sub13_Sub1_3.method1759(local36);
				Static171.aClass1_Sub13_Sub1_3.method1766(Static124.aBooleanArray7[82] ? 1 : 0);
			}
		}
		@Pc(489) int local489;
		if (local23 == 38) {
			Static171.aClass1_Sub13_Sub1_3.method1825(68);
			Static171.aClass1_Sub13_Sub1_3.method1754(local19);
			local351 = Static206.method3444(local19);
			if (local351.anIntArrayArray30 != null && local351.anIntArrayArray30[0][0] == 5) {
				local489 = local351.anIntArrayArray30[0][1];
				Static91.anIntArray189[local489] = 1 - Static91.anIntArray189[local489];
				Static84.method1819(local489);
			}
		}
		if (local23 == 35) {
			Static171.aClass1_Sub13_Sub1_3.method1825(105);
			Static171.aClass1_Sub13_Sub1_3.method1807(local15);
			Static171.aClass1_Sub13_Sub1_3.method1808(local19);
			Static171.aClass1_Sub13_Sub1_3.method1789(local36);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (local23 == 14) {
			local43 = Static147.aClass9_Sub1_Sub1Array1[local36];
			if (local43 != null) {
				Static24.anInt805 = 0;
				Static266.anInt5550 = Static256.anInt5442;
				Static171.anInt3982 = 2;
				Static223.anInt4901 = Static133.anInt3300;
				Static171.aClass1_Sub13_Sub1_3.method1825(216);
				Static171.aClass1_Sub13_Sub1_3.method1766(Static124.aBooleanArray7[82] ? 1 : 0);
				Static171.aClass1_Sub13_Sub1_3.method1789(local36);
			}
		}
		if (local23 == 42) {
			local127 = Static36.aClass9_Sub1_Sub2Array2[local36];
			if (local127 != null) {
				Static24.anInt805 = 0;
				Static171.anInt3982 = 2;
				Static223.anInt4901 = Static133.anInt3300;
				Static266.anInt5550 = Static256.anInt5442;
				Static171.aClass1_Sub13_Sub1_3.method1825(218);
				Static171.aClass1_Sub13_Sub1_3.method1807(local36);
				Static171.aClass1_Sub13_Sub1_3.method1766(Static124.aBooleanArray7[82] ? 1 : 0);
			}
		}
		if (local23 == 32) {
			Static171.anInt3982 = 2;
			Static223.anInt4901 = Static133.anInt3300;
			Static266.anInt5550 = Static256.anInt5442;
			Static24.anInt805 = 0;
			Static171.aClass1_Sub13_Sub1_3.method1825(13);
			Static171.aClass1_Sub13_Sub1_3.method1799(Static124.aBooleanArray7[82] ? 1 : 0);
			Static171.aClass1_Sub13_Sub1_3.method1796(Static29.anInt907 + local19);
			Static171.aClass1_Sub13_Sub1_3.method1796(Integer.MAX_VALUE & (int) (local27 >>> 32));
			Static171.aClass1_Sub13_Sub1_3.method1796(Static64.anInt1786 + local15);
		}
		if (local23 == 49) {
			if (local36 == 0) {
				Static215.anInt4736 = 1;
				Static228.method3808(Static137.anInt3321, local15, local19);
			} else if (Static203.anInt4493 > 0 && Static124.aBooleanArray7[82] && Static124.aBooleanArray7[81]) {
				Static202.method3369(Static29.anInt907 + local19, local15 + Static64.anInt1786, Static137.anInt3321);
			} else {
				Static171.aClass1_Sub13_Sub1_3.method1825(96);
				Static171.aClass1_Sub13_Sub1_3.method1789(local19 + Static29.anInt907);
				Static171.aClass1_Sub13_Sub1_3.method1759(local15 + Static64.anInt1786);
			}
		}
		if (local23 == 37) {
			local127 = Static36.aClass9_Sub1_Sub2Array2[local36];
			if (local127 != null) {
				Static223.anInt4901 = Static133.anInt3300;
				Static24.anInt805 = 0;
				Static171.anInt3982 = 2;
				Static266.anInt5550 = Static256.anInt5442;
				Static171.aClass1_Sub13_Sub1_3.method1825(190);
				Static171.aClass1_Sub13_Sub1_3.method1789(local36);
				Static171.aClass1_Sub13_Sub1_3.method1806(Static124.aBooleanArray7[82] ? 1 : 0);
			}
		}
		if (local23 == 43) {
			if (local36 == 0) {
				Static120.anInt3093 = 1;
				Static228.method3808(Static137.anInt3321, local15, local19);
			} else if (local36 == 1) {
				Static171.aClass1_Sub13_Sub1_3.method1825(5);
				Static171.aClass1_Sub13_Sub1_3.method1796(Static64.anInt1786 + local15);
				Static171.aClass1_Sub13_Sub1_3.method1808(Static167.anInt3917);
				Static171.aClass1_Sub13_Sub1_3.method1796(Static29.anInt907 + local19);
				Static171.aClass1_Sub13_Sub1_3.method1807(Static161.anInt3798);
			}
		}
		if (local23 == 2) {
			Static223.anInt4901 = Static133.anInt3300;
			Static24.anInt805 = 0;
			Static266.anInt5550 = Static256.anInt5442;
			Static171.anInt3982 = 2;
			Static171.aClass1_Sub13_Sub1_3.method1825(237);
			Static171.aClass1_Sub13_Sub1_3.method1807(local19 + Static29.anInt907);
			Static171.aClass1_Sub13_Sub1_3.method1799(Static124.aBooleanArray7[82] ? 1 : 0);
			Static171.aClass1_Sub13_Sub1_3.method1796(Static64.anInt1786 + local15);
			Static171.aClass1_Sub13_Sub1_3.method1807(Integer.MAX_VALUE & (int) (local27 >>> 32));
		}
		if (local23 == 12) {
			local127 = Static36.aClass9_Sub1_Sub2Array2[local36];
			if (local127 != null) {
				Static266.anInt5550 = Static256.anInt5442;
				Static223.anInt4901 = Static133.anInt3300;
				Static171.anInt3982 = 2;
				Static24.anInt805 = 0;
				Static171.aClass1_Sub13_Sub1_3.method1825(233);
				Static171.aClass1_Sub13_Sub1_3.method1789(local36);
				Static171.aClass1_Sub13_Sub1_3.method1806(Static124.aBooleanArray7[82] ? 1 : 0);
			}
		}
		if (local23 == 4) {
			local43 = Static147.aClass9_Sub1_Sub1Array1[local36];
			if (local43 != null) {
				Static24.anInt805 = 0;
				Static223.anInt4901 = Static133.anInt3300;
				Static266.anInt5550 = Static256.anInt5442;
				Static171.anInt3982 = 2;
				Static171.aClass1_Sub13_Sub1_3.method1825(12);
				Static171.aClass1_Sub13_Sub1_3.method1789(local36);
				Static171.aClass1_Sub13_Sub1_3.method1799(Static124.aBooleanArray7[82] ? 1 : 0);
			}
		}
		if (local23 == 45) {
			local127 = Static36.aClass9_Sub1_Sub2Array2[local36];
			if (local127 != null) {
				Static171.anInt3982 = 2;
				Static24.anInt805 = 0;
				Static223.anInt4901 = Static133.anInt3300;
				Static266.anInt5550 = Static256.anInt5442;
				Static171.aClass1_Sub13_Sub1_3.method1825(217);
				Static171.aClass1_Sub13_Sub1_3.method1806(Static124.aBooleanArray7[82] ? 1 : 0);
				Static171.aClass1_Sub13_Sub1_3.method1759(local36);
			}
		}
		if (local23 == 33) {
			Static171.aClass1_Sub13_Sub1_3.method1825(68);
			Static171.aClass1_Sub13_Sub1_3.method1754(local19);
			local351 = Static206.method3444(local19);
			if (local351.anIntArrayArray30 != null && local351.anIntArrayArray30[0][0] == 5) {
				local489 = local351.anIntArrayArray30[0][1];
				if (local351.anIntArray374[0] != Static91.anIntArray189[local489]) {
					Static91.anIntArray189[local489] = local351.anIntArray374[0];
					Static84.method1819(local489);
				}
			}
		}
		if (local23 == 7) {
			Static138.method2532();
		}
		if (local23 == 1004) {
			Static171.anInt3982 = 2;
			Static24.anInt805 = 0;
			Static223.anInt4901 = Static133.anInt3300;
			Static266.anInt5550 = Static256.anInt5442;
			Static171.aClass1_Sub13_Sub1_3.method1825(242);
			Static171.aClass1_Sub13_Sub1_3.method1789(local36);
		}
		if (local23 == 1) {
			Static171.aClass1_Sub13_Sub1_3.method1825(94);
			Static171.aClass1_Sub13_Sub1_3.method1789(local36);
			Static171.aClass1_Sub13_Sub1_3.method1754(local19);
			Static171.aClass1_Sub13_Sub1_3.method1807(local15);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (local23 == 1003) {
			local351 = Static206.method3444(local19);
			if (local351 == null || local351.anIntArray360[local15] < 100000) {
				Static171.aClass1_Sub13_Sub1_3.method1825(242);
				Static171.aClass1_Sub13_Sub1_3.method1789(local36);
			} else {
				Static50.method1013("", local351.anIntArray360[local15] + " x " + Static93.method2006(local36).aString235, 0);
			}
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (local23 == 3) {
			Static171.aClass1_Sub13_Sub1_3.method1825(175);
			Static171.aClass1_Sub13_Sub1_3.method1807(local36);
			Static171.aClass1_Sub13_Sub1_3.method1808(local19);
			Static171.aClass1_Sub13_Sub1_3.method1807(local15);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (local23 == 15) {
			Static171.anInt3982 = 2;
			Static24.anInt805 = 0;
			Static223.anInt4901 = Static133.anInt3300;
			Static266.anInt5550 = Static256.anInt5442;
			Static171.aClass1_Sub13_Sub1_3.method1825(224);
			Static171.aClass1_Sub13_Sub1_3.method1796(Static98.anInt2704);
			Static171.aClass1_Sub13_Sub1_3.method1754(Static77.anInt2096);
			Static171.aClass1_Sub13_Sub1_3.method1796(Static29.anInt907 + local19);
			Static171.aClass1_Sub13_Sub1_3.method1806(Static124.aBooleanArray7[82] ? 1 : 0);
			Static171.aClass1_Sub13_Sub1_3.method1796(Integer.MAX_VALUE & (int) (local27 >>> 32));
			Static171.aClass1_Sub13_Sub1_3.method1807(Static64.anInt1786 + local15);
			Static171.aClass1_Sub13_Sub1_3.method1807(Static221.anInt4841);
		}
		if (local23 == 29) {
			local43 = Static147.aClass9_Sub1_Sub1Array1[local36];
			if (local43 != null) {
				Static266.anInt5550 = Static256.anInt5442;
				Static223.anInt4901 = Static133.anInt3300;
				Static171.anInt3982 = 2;
				Static24.anInt805 = 0;
				Static171.aClass1_Sub13_Sub1_3.method1825(238);
				Static171.aClass1_Sub13_Sub1_3.method1806(Static124.aBooleanArray7[82] ? 1 : 0);
				Static171.aClass1_Sub13_Sub1_3.method1796(local36);
			}
		}
		if (local23 == 21) {
			local127 = Static36.aClass9_Sub1_Sub2Array2[local36];
			if (local127 != null) {
				Static24.anInt805 = 0;
				Static266.anInt5550 = Static256.anInt5442;
				Static171.anInt3982 = 2;
				Static223.anInt4901 = Static133.anInt3300;
				Static171.aClass1_Sub13_Sub1_3.method1825(249);
				Static171.aClass1_Sub13_Sub1_3.method1789(local36);
				Static171.aClass1_Sub13_Sub1_3.method1789(Static161.anInt3798);
				Static171.aClass1_Sub13_Sub1_3.method1782(Static167.anInt3917);
				Static171.aClass1_Sub13_Sub1_3.method1766(Static124.aBooleanArray7[82] ? 1 : 0);
			}
		}
		if (local23 == 20) {
			Static223.anInt4901 = Static133.anInt3300;
			Static266.anInt5550 = Static256.anInt5442;
			Static24.anInt805 = 0;
			Static171.anInt3982 = 2;
			Static171.aClass1_Sub13_Sub1_3.method1825(143);
			Static171.aClass1_Sub13_Sub1_3.method1767(Static124.aBooleanArray7[82] ? 1 : 0);
			Static171.aClass1_Sub13_Sub1_3.method1759(local36);
			Static171.aClass1_Sub13_Sub1_3.method1807(Static29.anInt907 + local19);
			Static171.aClass1_Sub13_Sub1_3.method1807(local15 + Static64.anInt1786);
		}
		if (local23 == 17) {
			Static171.aClass1_Sub13_Sub1_3.method1825(182);
			Static171.aClass1_Sub13_Sub1_3.method1782(local19);
			Static171.aClass1_Sub13_Sub1_3.method1796(local15);
			Static171.aClass1_Sub13_Sub1_3.method1796(local36);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (local23 == 58) {
			Static263.method4206();
			local351 = Static206.method3444(local19);
			Static98.anInt2704 = local15;
			Static77.anInt2096 = local19;
			Static183.anInt5174 = 1;
			Static221.anInt4841 = local36;
			Static257.method4146(local351);
			Static199.aString296 = "<col=ff9040>" + Static93.method2006(local36).aString235 + "<col=ffffff>";
			if (Static199.aString296 == null) {
				Static199.aString296 = "null";
			}
			return;
		}
		if (local23 == 34) {
			Static24.anInt805 = 0;
			Static171.anInt3982 = 2;
			Static266.anInt5550 = Static256.anInt5442;
			Static223.anInt4901 = Static133.anInt3300;
			Static171.aClass1_Sub13_Sub1_3.method1825(121);
			Static171.aClass1_Sub13_Sub1_3.method1807(Static29.anInt907 + local19);
			Static171.aClass1_Sub13_Sub1_3.method1759((int) (local27 >>> 32) & Integer.MAX_VALUE);
			Static171.aClass1_Sub13_Sub1_3.method1789(local15 + Static64.anInt1786);
			Static171.aClass1_Sub13_Sub1_3.method1799(Static124.aBooleanArray7[82] ? 1 : 0);
		}
		if (local23 == 13) {
			Static24.anInt805 = 0;
			Static171.anInt3982 = 2;
			Static223.anInt4901 = Static133.anInt3300;
			Static266.anInt5550 = Static256.anInt5442;
			Static171.aClass1_Sub13_Sub1_3.method1825(129);
			Static171.aClass1_Sub13_Sub1_3.method1759(local19 + Static29.anInt907);
			Static171.aClass1_Sub13_Sub1_3.method1796(local36);
			Static171.aClass1_Sub13_Sub1_3.method1807(local15 + Static64.anInt1786);
			Static171.aClass1_Sub13_Sub1_3.method1767(Static124.aBooleanArray7[82] ? 1 : 0);
		}
		if (local23 == 19) {
			Static171.anInt3982 = 2;
			Static223.anInt4901 = Static133.anInt3300;
			Static266.anInt5550 = Static256.anInt5442;
			Static24.anInt805 = 0;
			Static171.aClass1_Sub13_Sub1_3.method1825(111);
			Static171.aClass1_Sub13_Sub1_3.method1759(local15 + Static64.anInt1786);
			Static171.aClass1_Sub13_Sub1_3.method1767(Static124.aBooleanArray7[82] ? 1 : 0);
			Static171.aClass1_Sub13_Sub1_3.method1759(local19 + Static29.anInt907);
			Static171.aClass1_Sub13_Sub1_3.method1796(Static161.anInt3798);
			Static171.aClass1_Sub13_Sub1_3.method1754(Static167.anInt3917);
			Static171.aClass1_Sub13_Sub1_3.method1796(local36);
		}
		if (local23 == 9) {
			if (local36 == 0) {
				Static228.method3808(Static137.anInt3321, local15, local19);
			} else if (local36 == 1) {
				if (Static203.anInt4493 > 0 && Static124.aBooleanArray7[82] && Static124.aBooleanArray7[81]) {
					Static202.method3369(local19 + Static29.anInt907, Static64.anInt1786 - -local15, Static137.anInt3321);
				} else {
					Static228.method3804(1, local15, local19);
					Static171.aClass1_Sub13_Sub1_3.method1766(Static240.anInt5171);
					Static171.aClass1_Sub13_Sub1_3.method1766(Static71.anInt1927);
					Static171.aClass1_Sub13_Sub1_3.method1789((int) Static230.aFloat51);
					Static171.aClass1_Sub13_Sub1_3.method1766(57);
					Static171.aClass1_Sub13_Sub1_3.method1766(Static83.anInt2232);
					Static171.aClass1_Sub13_Sub1_3.method1766(Static44.anInt1333);
					Static171.aClass1_Sub13_Sub1_3.method1766(89);
					Static171.aClass1_Sub13_Sub1_3.method1789(Static83.aClass9_Sub1_Sub1_1.anInt427);
					Static171.aClass1_Sub13_Sub1_3.method1789(Static83.aClass9_Sub1_Sub1_1.anInt479);
					Static171.aClass1_Sub13_Sub1_3.method1766(Static2.anInt44);
					Static171.aClass1_Sub13_Sub1_3.method1766(63);
				}
			}
		}
		if (local23 == 60) {
			Static171.anInt3982 = 2;
			Static223.anInt4901 = Static133.anInt3300;
			Static24.anInt805 = 0;
			Static266.anInt5550 = Static256.anInt5442;
			Static171.aClass1_Sub13_Sub1_3.method1825(135);
			Static171.aClass1_Sub13_Sub1_3.method1799(Static124.aBooleanArray7[82] ? 1 : 0);
			Static171.aClass1_Sub13_Sub1_3.method1782(Static77.anInt2096);
			Static171.aClass1_Sub13_Sub1_3.method1759(local36);
			Static171.aClass1_Sub13_Sub1_3.method1807(Static64.anInt1786 + local15);
			Static171.aClass1_Sub13_Sub1_3.method1807(Static98.anInt2704);
			Static171.aClass1_Sub13_Sub1_3.method1759(Static29.anInt907 + local19);
			Static171.aClass1_Sub13_Sub1_3.method1807(Static221.anInt4841);
		}
		if (local23 == 44) {
			Static171.aClass1_Sub13_Sub1_3.method1825(110);
			Static171.aClass1_Sub13_Sub1_3.method1808(local19);
			Static171.aClass1_Sub13_Sub1_3.method1796(Static98.anInt2704);
			Static171.aClass1_Sub13_Sub1_3.method1789(local15);
			Static171.aClass1_Sub13_Sub1_3.method1789(local36);
			Static171.aClass1_Sub13_Sub1_3.method1782(Static77.anInt2096);
			Static171.aClass1_Sub13_Sub1_3.method1789(Static221.anInt4841);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (local23 == 8) {
			local43 = Static147.aClass9_Sub1_Sub1Array1[local36];
			if (local43 != null) {
				Static223.anInt4901 = Static133.anInt3300;
				Static171.anInt3982 = 2;
				Static266.anInt5550 = Static256.anInt5442;
				Static24.anInt805 = 0;
				Static171.aClass1_Sub13_Sub1_3.method1825(140);
				Static171.aClass1_Sub13_Sub1_3.method1806(Static124.aBooleanArray7[82] ? 1 : 0);
				Static171.aClass1_Sub13_Sub1_3.method1789(local36);
			}
		}
		if (local23 == 51) {
			local43 = Static147.aClass9_Sub1_Sub1Array1[local36];
			if (local43 != null) {
				Static171.anInt3982 = 2;
				Static223.anInt4901 = Static133.anInt3300;
				Static24.anInt805 = 0;
				Static266.anInt5550 = Static256.anInt5442;
				Static171.aClass1_Sub13_Sub1_3.method1825(183);
				Static171.aClass1_Sub13_Sub1_3.method1767(Static124.aBooleanArray7[82] ? 1 : 0);
				Static171.aClass1_Sub13_Sub1_3.method1807(local36);
			}
		}
		if (local23 == 25) {
			Static171.aClass1_Sub13_Sub1_3.method1825(134);
			Static171.aClass1_Sub13_Sub1_3.method1754(local19);
			Static171.aClass1_Sub13_Sub1_3.method1796(local15);
			Static171.aClass1_Sub13_Sub1_3.method1759(local36);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (local23 == 22) {
			Static171.aClass1_Sub13_Sub1_3.method1825(61);
			Static171.aClass1_Sub13_Sub1_3.method1789(Static161.anInt3798);
			Static171.aClass1_Sub13_Sub1_3.method1782(local19);
			Static171.aClass1_Sub13_Sub1_3.method1808(Static167.anInt3917);
			Static171.aClass1_Sub13_Sub1_3.method1807(local15);
		}
		if (local23 == 46) {
			Static171.aClass1_Sub13_Sub1_3.method1825(78);
			Static171.aClass1_Sub13_Sub1_3.method1782(local19);
			Static171.aClass1_Sub13_Sub1_3.method1789(local15);
			Static171.aClass1_Sub13_Sub1_3.method1796(local36);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (local23 == 1005) {
			Static24.anInt805 = 0;
			Static171.anInt3982 = 2;
			Static266.anInt5550 = Static256.anInt5442;
			Static223.anInt4901 = Static133.anInt3300;
			local127 = Static36.aClass9_Sub1_Sub2Array2[local36];
			if (local127 != null) {
				@Pc(2063) Class45 local2063 = local127.aClass45_1;
				if (local2063.anIntArray154 != null) {
					local2063 = local2063.method1460();
				}
				if (local2063 != null) {
					Static171.aClass1_Sub13_Sub1_3.method1825(145);
					Static171.aClass1_Sub13_Sub1_3.method1796(local2063.anInt2009);
				}
			}
		}
		if (local23 == 39) {
			local43 = Static147.aClass9_Sub1_Sub1Array1[local36];
			if (local43 != null) {
				Static266.anInt5550 = Static256.anInt5442;
				Static171.anInt3982 = 2;
				Static223.anInt4901 = Static133.anInt3300;
				Static24.anInt805 = 0;
				Static171.aClass1_Sub13_Sub1_3.method1825(104);
				Static171.aClass1_Sub13_Sub1_3.method1796(Static221.anInt4841);
				Static171.aClass1_Sub13_Sub1_3.method1808(Static77.anInt2096);
				Static171.aClass1_Sub13_Sub1_3.method1767(Static124.aBooleanArray7[82] ? 1 : 0);
				Static171.aClass1_Sub13_Sub1_3.method1807(Static98.anInt2704);
				Static171.aClass1_Sub13_Sub1_3.method1789(local36);
			}
		}
		if (local23 == 40 || local23 == 1006) {
			Static60.method1146(local36, local19, local15, Static174.aStringArray33[arg0]);
		}
		if (local23 == 48) {
			local43 = Static147.aClass9_Sub1_Sub1Array1[local36];
			if (local43 != null) {
				Static24.anInt805 = 0;
				Static171.anInt3982 = 2;
				Static266.anInt5550 = Static256.anInt5442;
				Static223.anInt4901 = Static133.anInt3300;
				Static171.aClass1_Sub13_Sub1_3.method1825(3);
				Static171.aClass1_Sub13_Sub1_3.method1799(Static124.aBooleanArray7[82] ? 1 : 0);
				Static171.aClass1_Sub13_Sub1_3.method1807(local36);
			}
		}
		if (local23 == 41) {
			Static171.aClass1_Sub13_Sub1_3.method1825(128);
			Static171.aClass1_Sub13_Sub1_3.method1808(local19);
			Static171.aClass1_Sub13_Sub1_3.method1789(local36);
			Static171.aClass1_Sub13_Sub1_3.method1796(local15);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (local23 == 59) {
			Static266.anInt5550 = Static256.anInt5442;
			Static223.anInt4901 = Static133.anInt3300;
			Static24.anInt805 = 0;
			Static171.anInt3982 = 2;
			Static171.aClass1_Sub13_Sub1_3.method1825(53);
			Static171.aClass1_Sub13_Sub1_3.method1807((int) (local27 >>> 32) & Integer.MAX_VALUE);
			Static171.aClass1_Sub13_Sub1_3.method1789(local15 + Static64.anInt1786);
			Static171.aClass1_Sub13_Sub1_3.method1782(Static167.anInt3917);
			Static171.aClass1_Sub13_Sub1_3.method1759(local19 + Static29.anInt907);
			Static171.aClass1_Sub13_Sub1_3.method1806(Static124.aBooleanArray7[82] ? 1 : 0);
			Static171.aClass1_Sub13_Sub1_3.method1796(Static161.anInt3798);
		}
		if (local23 == 28) {
			Static171.anInt3982 = 2;
			Static223.anInt4901 = Static133.anInt3300;
			Static24.anInt805 = 0;
			Static266.anInt5550 = Static256.anInt5442;
			Static171.aClass1_Sub13_Sub1_3.method1825(10);
			Static171.aClass1_Sub13_Sub1_3.method1807(Static29.anInt907 + local19);
			Static171.aClass1_Sub13_Sub1_3.method1807(Static64.anInt1786 + local15);
			Static171.aClass1_Sub13_Sub1_3.method1806(Static124.aBooleanArray7[82] ? 1 : 0);
			Static171.aClass1_Sub13_Sub1_3.method1789(local36);
		}
		if (local23 == 31) {
			Static171.aClass1_Sub13_Sub1_3.method1825(8);
			Static171.aClass1_Sub13_Sub1_3.method1789(local15);
			Static171.aClass1_Sub13_Sub1_3.method1796(local36);
			Static171.aClass1_Sub13_Sub1_3.method1808(local19);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (local23 == 11) {
			Static24.anInt805 = 0;
			Static171.anInt3982 = 2;
			Static223.anInt4901 = Static133.anInt3300;
			Static266.anInt5550 = Static256.anInt5442;
			Static171.aClass1_Sub13_Sub1_3.method1825(27);
			Static171.aClass1_Sub13_Sub1_3.method1759(Static64.anInt1786 + local15);
			Static171.aClass1_Sub13_Sub1_3.method1799(Static124.aBooleanArray7[82] ? 1 : 0);
			Static171.aClass1_Sub13_Sub1_3.method1796(local36);
			Static171.aClass1_Sub13_Sub1_3.method1807(local19 + Static29.anInt907);
		}
		if (local23 == 16) {
			local351 = Static206.method3444(local19);
			@Pc(2434) boolean local2434 = true;
			if (local351.anInt4672 > 0) {
				local2434 = Static107.method2202(local351);
			}
			if (local2434) {
				Static171.aClass1_Sub13_Sub1_3.method1825(68);
				Static171.aClass1_Sub13_Sub1_3.method1754(local19);
			}
		}
		if (local23 == 24) {
			Static24.anInt805 = 0;
			Static171.anInt3982 = 2;
			Static223.anInt4901 = Static133.anInt3300;
			Static266.anInt5550 = Static256.anInt5442;
			Static171.aClass1_Sub13_Sub1_3.method1825(160);
			Static171.aClass1_Sub13_Sub1_3.method1789(local15 + Static64.anInt1786);
			Static171.aClass1_Sub13_Sub1_3.method1789(local36);
			Static171.aClass1_Sub13_Sub1_3.method1796(local19 + Static29.anInt907);
			Static171.aClass1_Sub13_Sub1_3.method1767(Static124.aBooleanArray7[82] ? 1 : 0);
		}
		if (local23 == 26 && Static58.aClass122_6 == null) {
			Static260.method2136(local15, local19);
			Static58.aClass122_6 = Static106.method2192(local15, local19);
			Static257.method4146(Static58.aClass122_6);
		}
		if (local23 == 18) {
			local43 = Static147.aClass9_Sub1_Sub1Array1[local36];
			if (local43 != null) {
				Static171.anInt3982 = 2;
				Static266.anInt5550 = Static256.anInt5442;
				Static223.anInt4901 = Static133.anInt3300;
				Static24.anInt805 = 0;
				Static171.aClass1_Sub13_Sub1_3.method1825(199);
				Static171.aClass1_Sub13_Sub1_3.method1796(local36);
				Static171.aClass1_Sub13_Sub1_3.method1766(Static124.aBooleanArray7[82] ? 1 : 0);
			}
		}
		if (local23 == 1002) {
			Static24.anInt805 = 0;
			Static223.anInt4901 = Static133.anInt3300;
			Static266.anInt5550 = Static256.anInt5442;
			Static171.anInt3982 = 2;
			Static171.aClass1_Sub13_Sub1_3.method1825(188);
			Static171.aClass1_Sub13_Sub1_3.method1799(Static124.aBooleanArray7[82] ? 1 : 0);
			Static171.aClass1_Sub13_Sub1_3.method1796((int) (local27 >>> 32) & Integer.MAX_VALUE);
			Static171.aClass1_Sub13_Sub1_3.method1789(local15 + Static64.anInt1786);
			Static171.aClass1_Sub13_Sub1_3.method1759(local19 + Static29.anInt907);
		}
		if (local23 == 36) {
			Static171.aClass1_Sub13_Sub1_3.method1825(219);
			Static171.aClass1_Sub13_Sub1_3.method1759(local36);
			Static171.aClass1_Sub13_Sub1_3.method1782(local19);
			Static171.aClass1_Sub13_Sub1_3.method1807(local15);
			Static68.anInt1401 = 0;
			Static42.aClass122_3 = Static206.method3444(local19);
			Static86.anInt2434 = local15;
		}
		if (Static183.anInt5174 != 0) {
			Static183.anInt5174 = 0;
			Static257.method4146(Static206.method3444(Static77.anInt2096));
		}
		if (Static88.aBoolean138) {
			Static263.method4206();
		}
		if (Static42.aClass122_3 != null && Static68.anInt1401 == 0) {
			Static257.method4146(Static42.aClass122_3);
		}
	}
}
