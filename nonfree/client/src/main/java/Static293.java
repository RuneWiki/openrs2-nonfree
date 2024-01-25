import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString325;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray25;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	public static int anInt5620;

	@OriginalMember(owner = "client!sj", name = "v", descriptor = "Lclient!ra;")
	public static Class170 aClass170_97;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "Lclient!ch;")
	public static final Class33 aClass33_1 = new Class33();

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
	public static int anInt5615 = 0;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "Ljava/lang/String;")
	public static final String aString326 = "glow3:";

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZLclient!nl;I)V")
	public static void method4968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class137 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class5_Sub27 local10 = (Class5_Sub27) Static82.aClass211_6.method5608(); local10 != null; local10 = (Class5_Sub27) Static82.aClass211_6.method5603()) {
			if (arg0 == local10.anInt3746 && arg3 * 128 == local10.anInt3735 && arg1 * 128 == local10.anInt3730 && arg2.anInt4114 == local10.aClass137_1.anInt4114) {
				if (local10.aClass5_Sub17_Sub1_1 != null) {
					Static5.aClass5_Sub17_Sub3_1.method3544(local10.aClass5_Sub17_Sub1_1);
					local10.aClass5_Sub17_Sub1_1 = null;
				}
				if (local10.aClass5_Sub17_Sub1_2 != null) {
					Static5.aClass5_Sub17_Sub3_1.method3544(local10.aClass5_Sub17_Sub1_2);
					local10.aClass5_Sub17_Sub1_2 = null;
				}
				local10.method5803();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)V")
	public static void method4971(@OriginalArg(0) int arg0) {
		if (Static247.anInt3874 == arg0) {
			return;
		}
		if (Static247.anInt3874 == 0) {
			Static216.method3818();
		}
		if (arg0 == 40) {
			Static131.method2526();
		}
		if (arg0 != 40 && Static240.aClass68_19 != null) {
			Static240.aClass68_19.method1994();
			Static240.aClass68_19 = null;
		}
		if (Static247.anInt3874 == 25 || Static247.anInt3874 == 28) {
			Static65.aClass170_36.anInt5179 = 2;
			Static101.aClass170_46.anInt5179 = 2;
			Static303.aClass170_101.anInt5179 = 2;
			Static145.aClass170_118.anInt5179 = 2;
			Static176.aClass170_34.anInt5179 = 2;
			Static310.aClass170_107.anInt5179 = 2;
			Static183.aClass170_65.anInt5179 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static324.anInt6150 = 0;
			Static253.anInt4963 = 0;
			Static345.anInt6412 = 0;
			Static9.anInt305 = 1;
			Static30.anInt819 = 1;
			Static287.method4912(true);
			Static65.aClass170_36.anInt5179 = 1;
			Static101.aClass170_46.anInt5179 = 1;
			Static303.aClass170_101.anInt5179 = 1;
			Static145.aClass170_118.anInt5179 = 1;
			Static176.aClass170_34.anInt5179 = 1;
			Static310.aClass170_107.anInt5179 = 1;
			Static183.aClass170_65.anInt5179 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static230.method3961();
		}
		if (arg0 == 5) {
			Static230.method3965(Static15.aClass59_1, Static317.aClass170_114);
		} else {
			Static68.method1521();
		}
		@Pc(150) boolean local150 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(165) boolean local165 = Static247.anInt3874 == 5 || Static247.anInt3874 == 10 || Static247.anInt3874 == 28;
		if (local150 != local165) {
			if (local150) {
				Static100.anInt2201 = Static114.anInt2434;
				if (Static111.anInt2405 == 0) {
					Static283.method4781();
				} else {
					Static46.method1043(255, Static305.aClass170_102, Static114.anInt2434);
				}
				Static159.aClass7_1.method238(false);
			} else {
				Static283.method4781();
				Static159.aClass7_1.method238(true);
				if (Static341.aClass171_1 != null) {
					Static341.aClass171_1.method4587();
					Static341.aClass171_1 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static15.aClass59_1.method4881();
		}
		Static247.anInt3874 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)V")
	public static void method4975() {
		Static336.method4719(Static287.aClass96_16);
		Static110.anInt2338++;
		if (Static138.aBoolean185 && Static10.aBoolean13) {
			@Pc(24) int local24 = Static270.anInt5171;
			local24 -= Static25.anInt606;
			@Pc(30) int local30 = Static274.anInt5378;
			local30 -= Static42.anInt1007;
			if (Static311.anInt6465 > local24) {
				local24 = Static311.anInt6465;
			}
			if (local30 < Static353.anInt6608) {
				local30 = Static353.anInt6608;
			}
			if (local24 + Static287.aClass96_16.anInt2943 > Static232.aClass96_15.anInt2943 + Static311.anInt6465) {
				local24 = Static311.anInt6465 + Static232.aClass96_15.anInt2943 - Static287.aClass96_16.anInt2943;
			}
			if (Static353.anInt6608 + Static232.aClass96_15.anInt2916 < local30 - -Static287.aClass96_16.anInt2916) {
				local30 = Static232.aClass96_15.anInt2916 + Static353.anInt6608 - Static287.aClass96_16.anInt2916;
			}
			@Pc(104) int local104 = local24 - Static153.anInt3097;
			@Pc(109) int local109 = local30 - Static26.anInt623;
			@Pc(112) int local112 = Static287.aClass96_16.anInt2968;
			if (Static287.aClass96_16.anInt2905 < Static110.anInt2338 && (local112 < local104 || -local112 > local104 || local109 > local112 || local109 < -local112)) {
				Static203.aBoolean279 = true;
			}
			@Pc(157) int local157 = local24 + Static232.aClass96_15.anInt2918 - Static311.anInt6465;
			@Pc(165) int local165 = local30 + Static232.aClass96_15.anInt2904 - Static353.anInt6608;
			@Pc(174) Class5_Sub12 local174;
			if (Static287.aClass96_16.anObjectArray25 != null && Static203.aBoolean279) {
				local174 = new Class5_Sub12();
				local174.anObjectArray3 = Static287.aClass96_16.anObjectArray25;
				local174.anInt1380 = local165;
				local174.aClass96_4 = Static287.aClass96_16;
				local174.anInt1384 = local157;
				Static223.method3891(local174);
			}
			if (Static160.anInt3228 == 0) {
				if (Static203.aBoolean279) {
					if (Static287.aClass96_16.anObjectArray15 != null) {
						local174 = new Class5_Sub12();
						local174.anObjectArray3 = Static287.aClass96_16.anObjectArray15;
						local174.anInt1380 = local165;
						local174.anInt1384 = local157;
						local174.aClass96_4 = Static287.aClass96_16;
						local174.aClass96_3 = Static295.aClass96_18;
						Static223.method3891(local174);
					}
					if (Static295.aClass96_18 != null && Static43.method983(Static287.aClass96_16) != null) {
						Static335.aClass5_Sub1_Sub1_3.method174(225);
						Static335.aClass5_Sub1_Sub1_3.method1851(Static287.aClass96_16.anInt2877);
						Static335.aClass5_Sub1_Sub1_3.method1876(Static295.aClass96_18.anInt2877);
						Static335.aClass5_Sub1_Sub1_3.method1870(Static295.aClass96_18.anInt2914);
						Static335.aClass5_Sub1_Sub1_3.method1861(Static287.aClass96_16.anInt2914);
					}
				} else if ((Static305.anInt5879 == 1 || Static175.method3300()) && Static27.anInt5324 > 2) {
					Static261.method4494(2);
				} else if (Static215.method3792()) {
					Static261.method4494(1);
				}
				Static287.aClass96_16 = null;
			}
		} else if (Static110.anInt2338 > 1) {
			Static287.aClass96_16 = null;
		}
	}
}
