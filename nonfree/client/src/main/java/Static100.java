import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_43;

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_41;

	@OriginalMember(owner = "client!sb", name = "mb", descriptor = "Lclient!jd;")
	public static Class11 aClass11_110;

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
	public static int anInt2686 = 0;

	@OriginalMember(owner = "client!sb", name = "U", descriptor = "Lclient!sa;")
	public static Class67 aClass67_22 = new Class67(64);

	@OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
	public static int anInt2693 = -1;

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1158 = Static63.method1251("yellow:");

	@OriginalMember(owner = "client!sb", name = "hb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1159 = aClass45_1158;

	@OriginalMember(owner = "client!sb", name = "kb", descriptor = "Lclient!sa;")
	public static Class67 aClass67_23 = new Class67(260);

	@OriginalMember(owner = "client!sb", name = "ob", descriptor = "I")
	public static int anInt2698 = 0;

	@OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
	public static int anInt2699 = 0;

	@OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
	public static int anInt2700 = 0;

	@OriginalMember(owner = "client!sb", name = "rb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1160 = Static63.method1251("backleft1");

	@OriginalMember(owner = "client!sb", name = "sb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1161 = Static63.method1251("(X");

	@OriginalMember(owner = "client!sb", name = "tb", descriptor = "I")
	public static int anInt2701 = 0;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
	public static void method1838() {
		for (@Pc(10) Class5_Sub11 local10 = (Class5_Sub11) Static48.aClass10_7.method230(); local10 != null; local10 = (Class5_Sub11) Static48.aClass10_7.method233()) {
			if (local10.aClass5_Sub7_Sub2_3 != null) {
				Static47.aClass5_Sub7_Sub3_2.method2009(local10.aClass5_Sub7_Sub2_3);
				local10.aClass5_Sub7_Sub2_3 = null;
			}
			if (local10.aClass5_Sub7_Sub2_2 != null) {
				Static47.aClass5_Sub7_Sub3_2.method2009(local10.aClass5_Sub7_Sub2_2);
				local10.aClass5_Sub7_Sub2_2 = null;
			}
		}
		Static48.aClass10_7.method222();
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
	public static void method1839() {
		aClass11_110 = null;
		aClass67_23 = null;
		aClass29_Sub1_43 = null;
		aClass45_1159 = null;
		aClass5_Sub2_Sub6_Sub4_41 = null;
		aClass45_1158 = null;
		aClass67_22 = null;
		aClass45_1160 = null;
		aClass45_1161 = null;
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)Z")
	public static boolean method1840() {
		if (Static104.aClass7_3 == null) {
			return false;
		}
		@Pc(233) int local233;
		try {
			@Pc(15) int local15 = Static104.aClass7_3.method72();
			if (local15 == 0) {
				return false;
			}
			if (Static85.anInt2444 == -1) {
				local15--;
				Static104.aClass7_3.method75(0, 1, Static70.aClass5_Sub9_Sub1_3.aByteArray28);
				Static70.aClass5_Sub9_Sub1_3.anInt2140 = 0;
				Static85.anInt2444 = Static70.aClass5_Sub9_Sub1_3.method1458();
				Static69.anInt1989 = Static64.anIntArray282[Static85.anInt2444];
			}
			if (Static69.anInt1989 == -1) {
				if (local15 <= 0) {
					return false;
				}
				local15--;
				Static104.aClass7_3.method75(0, 1, Static70.aClass5_Sub9_Sub1_3.aByteArray28);
				Static69.anInt1989 = Static70.aClass5_Sub9_Sub1_3.aByteArray28[0] & 0xFF;
			}
			if (Static69.anInt1989 == -2) {
				if (local15 <= 1) {
					return false;
				}
				Static104.aClass7_3.method75(0, 2, Static70.aClass5_Sub9_Sub1_3.aByteArray28);
				Static70.aClass5_Sub9_Sub1_3.anInt2140 = 0;
				Static69.anInt1989 = Static70.aClass5_Sub9_Sub1_3.method1418();
				local15 -= 2;
			}
			if (local15 < Static69.anInt1989) {
				return false;
			}
			Static70.aClass5_Sub9_Sub1_3.anInt2140 = 0;
			Static104.aClass7_3.method75(0, Static69.anInt1989, Static70.aClass5_Sub9_Sub1_3.aByteArray28);
			Static23.anInt777 = Static74.anInt2504;
			Static74.anInt2504 = Static60.anInt1800;
			Static59.anInt1778 = 0;
			Static60.anInt1800 = Static85.anInt2444;
			if (Static85.anInt2444 == 185) {
				Static117.anInt3065 = Static70.aClass5_Sub9_Sub1_3.method1418();
				Static85.anInt2444 = -1;
				return true;
			}
			@Pc(149) int local149;
			@Pc(153) Class45 local153;
			@Pc(157) Class5_Sub2_Sub8 local157;
			if (Static85.anInt2444 == 201) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1434();
				local153 = Static70.aClass5_Sub9_Sub1_3.method1448();
				local157 = Static80.method1507(local149);
				local157.aClass45_544 = local153;
				if (Static57.anIntArray262[Static53.anInt2372] == local149 >> 16) {
					Static72.aBoolean99 = true;
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 172) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1410();
				if (local149 >= 0) {
					Static11.method224(local149);
				}
				if (local149 != Static16.anInt514) {
					Static5.method79(Static16.anInt514);
					Static16.anInt514 = local149;
				}
				Static78.method1485(Static16.anInt514);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 91) {
				Static1.anInt2 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static114.anInt3008 = Static70.aClass5_Sub9_Sub1_3.method1408();
				for (local149 = Static1.anInt2; local149 < Static1.anInt2 + 8; local149++) {
					for (local233 = Static114.anInt3008; local233 < Static114.anInt3008 + 8; local233++) {
						if (Static30.aClass10ArrayArrayArray2[Static8.anInt262][local149][local233] != null) {
							Static30.aClass10ArrayArrayArray2[Static8.anInt262][local149][local233] = null;
							Static81.method1518(local233, local149);
						}
					}
				}
				for (@Pc(276) Class5_Sub19 local276 = (Class5_Sub19) Static74.aClass10_10.method230(); local276 != null; local276 = (Class5_Sub19) Static74.aClass10_10.method233()) {
					if (local276.anInt3117 >= Static1.anInt2 && Static1.anInt2 + 8 > local276.anInt3117 && local276.anInt3122 >= Static114.anInt3008 && local276.anInt3122 < Static114.anInt3008 + 8 && local276.anInt3115 == Static8.anInt262) {
						local276.anInt3116 = 0;
					}
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 2) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1434();
				Static54.aClass46_2 = Static96.aClass77_3.method2164(local149);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 255) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1418();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1404();
				local157 = Static80.method1507(local233);
				Static85.anInt2444 = -1;
				local157.anInt1254 = local149;
				local157.anInt1291 = 2;
				return true;
			}
			if (Static85.anInt2444 == 156) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1435();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1427();
				local157 = Static80.method1507(local233);
				if (local157 != null && local157.anInt1269 == 0) {
					if (local149 > local157.anInt1232 - local157.anInt1243) {
						local149 = local157.anInt1232 - local157.anInt1243;
					}
					if (local149 < 0) {
						local149 = 0;
					}
					local157.anInt1244 = local149;
				}
				Static85.anInt2444 = -1;
				return true;
			}
			@Pc(440) int local440;
			@Pc(438) Class5_Sub2_Sub8 local438;
			if (Static85.anInt2444 == 223) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1434();
				local438 = Static80.method1507(local149);
				for (local440 = 0; local440 < local438.anIntArray201.length; local440++) {
					local438.anIntArray201[local440] = -1;
					local438.anIntArray201[local440] = 0;
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 58) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1427();
				local438 = Static80.method1507(local149);
				local438.anInt1291 = 3;
				local438.anInt1254 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass32_2.method868();
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 135) {
				Static69.anInt1993 = Static69.anInt1989 / 8;
				for (local149 = 0; local149 < Static69.anInt1993; local149++) {
					Static56.aLongArray3[local149] = Static70.aClass5_Sub9_Sub1_3.method1436();
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 148) {
				Static1.anInt2 = Static70.aClass5_Sub9_Sub1_3.method1400();
				Static114.anInt3008 = Static70.aClass5_Sub9_Sub1_3.method1400();
				while (Static70.aClass5_Sub9_Sub1_3.anInt2140 < Static69.anInt1989) {
					Static85.anInt2444 = Static70.aClass5_Sub9_Sub1_3.method1408();
					Static17.method319();
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 142) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1418();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1452();
				Static11.method224(local149);
				if (local233 != -1) {
					Static11.method224(local233);
				}
				if (Static63.anInt1837 != -1) {
					Static5.method79(Static63.anInt1837);
					Static63.anInt1837 = -1;
				}
				if (Static72.anInt2162 != -1) {
					Static5.method79(Static72.anInt2162);
					Static72.anInt2162 = -1;
				}
				if (Static67.anInt1909 != -1) {
					Static5.method79(Static67.anInt1909);
					Static67.anInt1909 = -1;
				}
				if (local149 == Static101.anInt1036) {
					Static33.method686(Static101.anInt1036);
				} else {
					Static5.method79(Static101.anInt1036);
					Static101.anInt1036 = local149;
					Static39.method1422(35);
				}
				if (Static38.anInt1088 == local149) {
					Static33.method686(Static38.anInt1088);
				} else {
					Static5.method79(Static38.anInt1088);
					Static38.anInt1088 = local233;
				}
				Static119.anInt3089 = -1;
				Static75.anInt2178 = 0;
				Static78.method1485(Static101.anInt1036);
				Static78.method1485(Static38.anInt1088);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 177) {
				Static53.method1613();
				Static85.anInt2444 = -1;
				return true;
			}
			@Pc(677) Class5_Sub2_Sub8 local677;
			if (Static85.anInt2444 == 157) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1404();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1410();
				local440 = Static70.aClass5_Sub9_Sub1_3.method1407();
				local677 = Static80.method1507(local149);
				local677.anInt1252 = local677.anInt1278 + local440;
				local677.anInt1294 = local677.anInt1246 + local233;
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 206) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1434();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1450();
				local157 = Static80.method1507(local149);
				if (local157.anInt1279 != local233 || local233 == -1) {
					local157.anInt1236 = 0;
					local157.anInt1257 = 0;
					local157.anInt1279 = local233;
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 38) {
				Static62.anInt1817 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static108.anInt2827 = Static3.anInt94;
				Static72.aBoolean99 = true;
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 37) {
				Static53.anInt2372 = Static70.aClass5_Sub9_Sub1_3.method1401();
				Static85.anInt2444 = -1;
				Static72.aBoolean99 = true;
				Static78.aBoolean102 = true;
				return true;
			}
			if (Static85.anInt2444 == 242) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1418();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1408();
				local440 = Static70.aClass5_Sub9_Sub1_3.method1418();
				Static72.method1461(local440, local149, local233);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 203) {
				Static107.anInt2801 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static85.anInt2444 = -1;
				if (Static107.anInt2801 == Static53.anInt2372) {
					if (Static107.anInt2801 == 3) {
						Static53.anInt2372 = 1;
					} else {
						Static53.anInt2372 = 3;
					}
					Static72.aBoolean99 = true;
				}
				return true;
			}
			if (Static85.anInt2444 == 118) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1434();
				@Pc(850) boolean local850 = Static70.aClass5_Sub9_Sub1_3.method1408() == 1;
				local157 = Static80.method1507(local149);
				Static85.anInt2444 = -1;
				local157.aBoolean68 = local850;
				return true;
			}
			if (Static85.anInt2444 == 152) {
				if (Static67.anInt1909 != -1) {
					Static5.method79(Static67.anInt1909);
					Static67.anInt1909 = -1;
				}
				Static93.aBoolean116 = false;
				Static85.anInt2444 = -1;
				Static78.aClass45_923 = Static78.aClass45_929;
				Static75.anInt2178 = 2;
				Static51.aBoolean81 = true;
				return true;
			}
			if (Static85.anInt2444 == 55) {
				Static114.aBoolean131 = true;
				Static4.anInt104 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static31.anInt925 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static35.anInt966 = Static70.aClass5_Sub9_Sub1_3.method1418();
				Static42.anInt801 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static62.anInt1822 = Static70.aClass5_Sub9_Sub1_3.method1408();
				if (Static62.anInt1822 >= 100) {
					Static46.anInt1334 = Static31.anInt925 * 128 + 64;
					Static25.anInt791 = Static4.anInt104 * 128 + 64;
					Static50.anInt1602 = Static32.method676(Static25.anInt791, Static46.anInt1334, Static8.anInt262) - Static35.anInt966;
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 64) {
				for (local149 = 0; local149 < Static117.anIntArray483.length; local149++) {
					if (Static117.anIntArray483[local149] != Static114.anIntArray473[local149]) {
						Static117.anIntArray483[local149] = Static114.anIntArray473[local149];
						Static69.method1352(local149);
						Static72.aBoolean99 = true;
					}
				}
				Static85.anInt2444 = -1;
				Static108.anInt2827 = Static3.anInt94;
				return true;
			}
			if (Static85.anInt2444 == 95) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1442();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1435();
				Static114.anIntArray473[local233] = local149;
				if (local149 != Static117.anIntArray483[local233]) {
					Static117.anIntArray483[local233] = local149;
					Static69.method1352(local233);
					if (anInt2693 != -1) {
						Static51.aBoolean81 = true;
					}
					Static72.aBoolean99 = true;
				}
				Static85.anInt2444 = -1;
				Static108.anInt2827 = Static3.anInt94;
				return true;
			}
			if (Static85.anInt2444 == 71) {
				for (local149 = 0; local149 < Static99.anInt2655; local149++) {
					@Pc(1028) Class5_Sub2_Sub1 local1028 = Static34.method688(local149);
					if (local1028 != null && local1028.anInt170 == 0) {
						Static114.anIntArray473[local149] = 0;
						Static117.anIntArray483[local149] = 0;
					}
				}
				Static108.anInt2827 = Static3.anInt94;
				if (anInt2693 != -1) {
					Static51.aBoolean81 = true;
				}
				Static72.aBoolean99 = true;
				Static85.anInt2444 = -1;
				return true;
			}
			@Pc(1092) int local1092;
			if (Static85.anInt2444 == 4) {
				Static72.aBoolean99 = true;
				local149 = Static70.aClass5_Sub9_Sub1_3.method1401();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1446();
				local440 = Static70.aClass5_Sub9_Sub1_3.method1442();
				Static52.anIntArray488[local233] = local440;
				Static23.anIntArray130[local233] = local149;
				Static57.anIntArray260[local233] = 1;
				for (local1092 = 0; local1092 < 98; local1092++) {
					if (Class4_Sub2.anIntArray366[local1092] <= local440) {
						Static57.anIntArray260[local233] = local1092 + 2;
					}
				}
				Static59.anInt1767 = Static3.anInt94;
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 126) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1435();
				Static11.method224(local149);
				if (Static67.anInt1909 != -1) {
					Static5.method79(Static67.anInt1909);
					Static51.aBoolean81 = true;
					Static67.anInt1909 = -1;
				}
				if (Static101.anInt1036 != -1) {
					Static5.method79(Static101.anInt1036);
					Static101.anInt1036 = -1;
					Static39.method1422(30);
				}
				if (Static38.anInt1088 != -1) {
					Static5.method79(Static38.anInt1088);
					Static38.anInt1088 = -1;
				}
				if (Static63.anInt1837 != -1) {
					Static5.method79(Static63.anInt1837);
					Static63.anInt1837 = -1;
				}
				if (local149 == Static72.anInt2162) {
					Static33.method686(Static72.anInt2162);
				} else {
					Static5.method79(Static72.anInt2162);
					Static72.anInt2162 = local149;
				}
				Static78.aBoolean102 = true;
				Static72.aBoolean99 = true;
				Static119.anInt3089 = -1;
				if (Static75.anInt2178 != 0) {
					Static75.anInt2178 = 0;
					Static51.aBoolean81 = true;
				}
				Static78.method1485(Static72.anInt2162);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 239) {
				if (Static67.anInt1909 != -1) {
					Static5.method79(Static67.anInt1909);
					Static67.anInt1909 = -1;
				}
				Static75.anInt2178 = 1;
				Static93.aBoolean116 = false;
				Static51.aBoolean81 = true;
				Static78.aClass45_923 = Static78.aClass45_929;
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 249) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1435();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1434();
				local157 = Static80.method1507(local233);
				local157.anInt1291 = 1;
				Static85.anInt2444 = -1;
				local157.anInt1254 = local149;
				return true;
			}
			if (Static85.anInt2444 == 161) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1452();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1434();
				local440 = Static70.aClass5_Sub9_Sub1_3.method1452();
				local677 = Static80.method1507(local233);
				Static85.anInt2444 = -1;
				local677.anInt1240 = local440 + (local149 << 16);
				return true;
			}
			@Pc(1312) int local1312;
			@Pc(1292) long local1292;
			@Pc(1504) long local1504;
			if (Static85.anInt2444 == 43) {
				local1292 = Static70.aClass5_Sub9_Sub1_3.method1436();
				local440 = Static70.aClass5_Sub9_Sub1_3.method1418();
				local1092 = Static70.aClass5_Sub9_Sub1_3.method1408();
				@Pc(1310) Class45 local1310 = Static10.method217(local1292).method1303();
				for (local1312 = 0; local1312 < Static104.anInt2772; local1312++) {
					if (Static23.aLongArray1[local1312] == local1292) {
						if (Static56.anIntArray257[local1312] != local440) {
							Static56.anIntArray257[local1312] = local440;
							Static72.aBoolean99 = true;
							if (local440 > 0) {
								Static7.method138(Static39.method1443(new Class45[] { local1310, Static108.aClass45_1246 }), Static78.aClass45_929, 5);
							}
							if (local440 == 0) {
								Static7.method138(Static39.method1443(new Class45[] { local1310, Static11.aClass45_170 }), Static78.aClass45_929, 5);
							}
						}
						Static9.anIntArray41[local1312] = local1092;
						local1310 = null;
						break;
					}
				}
				if (local1310 != null && Static104.anInt2772 < 200) {
					Static23.aLongArray1[Static104.anInt2772] = local1292;
					Static21.aClass45Array7[Static104.anInt2772] = local1310;
					Static56.anIntArray257[Static104.anInt2772] = local440;
					Static9.anIntArray41[Static104.anInt2772] = local1092;
					Static108.anInt2827 = Static3.anInt94;
					Static72.aBoolean99 = true;
					Static104.anInt2772++;
				}
				@Pc(1424) boolean local1424 = false;
				while (!local1424) {
					local1424 = true;
					for (@Pc(1430) int local1430 = 0; local1430 < Static104.anInt2772 - 1; local1430++) {
						if (Static56.anIntArray257[local1430] != Static62.anInt1821 && Static56.anIntArray257[local1430 + 1] == Static62.anInt1821 || Static56.anIntArray257[local1430] == 0 && Static56.anIntArray257[local1430 + 1] != 0) {
							local1424 = false;
							@Pc(1468) int local1468 = Static56.anIntArray257[local1430];
							Static56.anIntArray257[local1430] = Static56.anIntArray257[local1430 + 1];
							Static56.anIntArray257[local1430 + 1] = local1468;
							@Pc(1486) Class45 local1486 = Static21.aClass45Array7[local1430];
							Static21.aClass45Array7[local1430] = Static21.aClass45Array7[local1430 + 1];
							Static21.aClass45Array7[local1430 + 1] = local1486;
							local1504 = Static23.aLongArray1[local1430];
							Static23.aLongArray1[local1430] = Static23.aLongArray1[local1430 + 1];
							Static23.aLongArray1[local1430 + 1] = local1504;
							@Pc(1522) int local1522 = Static9.anIntArray41[local1430];
							Static9.anIntArray41[local1430] = Static9.anIntArray41[local1430 + 1];
							Static9.anIntArray41[local1430 + 1] = local1522;
							Static72.aBoolean99 = true;
						}
					}
				}
				Static85.anInt2444 = -1;
				return true;
			}
			@Pc(1577) long local1577;
			@Pc(1567) long local1567;
			if (Static85.anInt2444 == 202) {
				local1292 = Static70.aClass5_Sub9_Sub1_3.method1436();
				@Pc(1563) byte local1563 = Static70.aClass5_Sub9_Sub1_3.method1447();
				local1567 = Static70.aClass5_Sub9_Sub1_3.method1436();
				@Pc(1572) long local1572 = (long) Static70.aClass5_Sub9_Sub1_3.method1418();
				local1577 = Static70.aClass5_Sub9_Sub1_3.method1409();
				local1504 = local1577 + (local1572 << 32);
				@Pc(1585) boolean local1585 = false;
				@Pc(1589) int local1589 = Static70.aClass5_Sub9_Sub1_3.method1408();
				for (@Pc(1591) int local1591 = 0; local1591 < 100; local1591++) {
					if (Static60.aLongArray4[local1591] == local1504) {
						local1585 = true;
						break;
					}
				}
				if (local1589 <= 1) {
					for (@Pc(1614) int local1614 = 0; local1614 < Static69.anInt1993; local1614++) {
						if (Static56.aLongArray3[local1614] == local1292) {
							local1585 = true;
							break;
						}
					}
				}
				if (!local1585 && Static55.anInt1659 == 0) {
					Static60.aLongArray4[Static9.anInt338] = local1504;
					Static9.anInt338 = (Static9.anInt338 + 1) % 100;
					@Pc(1652) Class45 local1652 = Static96.method1800(Static70.aClass5_Sub9_Sub1_3).method1310();
					@Pc(1683) Class45 local1683 = Static39.method1443(new Class45[] { Static33.aClass45_466, Static10.method217(local1567), Static88.aClass45_1039, Static76.method1476(local1563), Static8.aClass45_110 });
					if (local1589 == 2 || local1589 == 3) {
						Static7.method138(local1652, Static39.method1443(new Class45[] { local1683, Static19.aClass45_285, Static10.method217(local1292).method1303() }), 7);
					} else if (local1589 == 1) {
						Static7.method138(local1652, Static39.method1443(new Class45[] { local1683, Static60.aClass45_720, Static10.method217(local1292).method1303() }), 7);
					} else {
						Static7.method138(local1652, Static39.method1443(new Class45[] { local1683, Static10.method217(local1292).method1303() }), 3);
					}
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 207) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1444();
				Static2.method19(local149);
				Static77.anInt2197 = Static3.anInt94;
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 200) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1408();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1408();
				local440 = Static70.aClass5_Sub9_Sub1_3.method1408();
				local1092 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static110.aBooleanArray24[local149] = true;
				Static13.anIntArray55[local149] = local233;
				Static61.anIntArray277[local149] = local440;
				Static98.anIntArray401[local149] = local1092;
				Static99.anIntArray403[local149] = 0;
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 3) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1435();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1442();
				local440 = Static70.aClass5_Sub9_Sub1_3.method1452();
				local1092 = Static70.aClass5_Sub9_Sub1_3.method1452();
				@Pc(1870) Class5_Sub2_Sub8 local1870 = Static80.method1507(local233);
				local1870.anInt1281 = local1092;
				local1870.anInt1235 = local440;
				Static85.anInt2444 = -1;
				local1870.anInt1266 = local149;
				return true;
			}
			if (Static85.anInt2444 == 115) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1434();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1434();
				local440 = Static70.aClass5_Sub9_Sub1_3.method1418();
				if (local440 == 65535) {
					local440 = -1;
				}
				local677 = Static80.method1507(local233);
				@Pc(1926) Class5_Sub2_Sub3 local1926;
				if (local677.aBoolean66) {
					local677.anInt1289 = local440;
					local677.anInt1285 = local149;
					local1926 = Static81.method1515(local440);
					local677.anInt1281 = local1926.anInt237;
					if (local677.anInt1260 > 0) {
						local677.anInt1281 = local677.anInt1281 * 32 / local677.anInt1260;
					}
					local677.anInt1270 = local1926.anInt253;
					local677.anInt1235 = local1926.anInt269;
					local677.anInt1286 = local1926.anInt249;
					local677.anInt1297 = local1926.anInt270;
					local677.anInt1266 = local1926.anInt246;
					Static115.method2090(local677);
				} else if (local440 == -1) {
					Static85.anInt2444 = -1;
					local677.anInt1291 = 0;
					return true;
				} else {
					local1926 = Static81.method1515(local440);
					local677.anInt1266 = local1926.anInt246;
					local677.anInt1291 = 4;
					local677.anInt1254 = local440;
					local677.anInt1281 = local1926.anInt237 * 100 / local149;
					local677.anInt1235 = local1926.anInt269;
				}
				Static85.anInt2444 = -1;
				return true;
			}
			@Pc(2062) int local2062;
			if (Static85.anInt2444 == 141) {
				Static72.aBoolean99 = true;
				local149 = Static70.aClass5_Sub9_Sub1_3.method1434();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1418();
				if (local149 < -70000) {
					local233 += 32768;
				}
				if (local149 >= 0) {
					local157 = Static80.method1507(local149);
				} else {
					local157 = null;
				}
				while (Static69.anInt1989 > Static70.aClass5_Sub9_Sub1_3.anInt2140) {
					local1092 = Static70.aClass5_Sub9_Sub1_3.method1417();
					local2062 = Static70.aClass5_Sub9_Sub1_3.method1418();
					local1312 = 0;
					if (local2062 != 0) {
						local1312 = Static70.aClass5_Sub9_Sub1_3.method1408();
						if (local1312 == 255) {
							local1312 = Static70.aClass5_Sub9_Sub1_3.method1434();
						}
					}
					if (local157 != null && local1092 >= 0 && local1092 < local157.anIntArray201.length) {
						local157.anIntArray201[local1092] = local2062;
						local157.anIntArray208[local1092] = local1312;
					}
					Static51.method1115(local2062 - 1, local233, local1312, local1092);
				}
				Static85.anInt2444 = -1;
				Static77.anInt2197 = Static3.anInt94;
				return true;
			}
			if (Static85.anInt2444 == 133) {
				Static51.anInt1621 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 69) {
				Static97.method1805(true);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 138) {
				Static27.method610();
				Static85.anInt2444 = -1;
				return true;
			}
			@Pc(2240) int local2240;
			if (Static85.anInt2444 == 189) {
				Static72.aBoolean99 = true;
				local149 = Static70.aClass5_Sub9_Sub1_3.method1434();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1418();
				if (local149 < -70000) {
					local233 += 32768;
				}
				if (local149 >= 0) {
					local157 = Static80.method1507(local149);
				} else {
					local157 = null;
				}
				if (local157 != null) {
					for (local1092 = 0; local1092 < local157.anIntArray201.length; local1092++) {
						local157.anIntArray201[local1092] = 0;
						local157.anIntArray208[local1092] = 0;
					}
				}
				Static107.method1922(local233);
				local1092 = Static70.aClass5_Sub9_Sub1_3.method1418();
				for (local2062 = 0; local2062 < local1092; local2062++) {
					local1312 = Static70.aClass5_Sub9_Sub1_3.method1446();
					if (local1312 == 255) {
						local1312 = Static70.aClass5_Sub9_Sub1_3.method1427();
					}
					local2240 = Static70.aClass5_Sub9_Sub1_3.method1418();
					if (local157 != null && local2062 < local157.anIntArray201.length) {
						local157.anIntArray201[local2062] = local2240;
						local157.anIntArray208[local2062] = local1312;
					}
					Static51.method1115(local2240 - 1, local233, local1312, local2062);
				}
				Static85.anInt2444 = -1;
				Static77.anInt2197 = Static3.anInt94;
				return true;
			}
			if (Static85.anInt2444 == 153) {
				Static11.anInt365 = Static70.aClass5_Sub9_Sub1_3.method1408();
				if (Static11.anInt365 == 1) {
					Static29.anInt888 = Static70.aClass5_Sub9_Sub1_3.method1418();
				}
				if (Static11.anInt365 >= 2 && Static11.anInt365 <= 6) {
					if (Static11.anInt365 == 2) {
						Static97.anInt2643 = 64;
						Static48.anInt1592 = 64;
					}
					if (Static11.anInt365 == 3) {
						Static48.anInt1592 = 64;
						Static97.anInt2643 = 0;
					}
					if (Static11.anInt365 == 4) {
						Static48.anInt1592 = 64;
						Static97.anInt2643 = 128;
					}
					if (Static11.anInt365 == 5) {
						Static97.anInt2643 = 64;
						Static48.anInt1592 = 0;
					}
					if (Static11.anInt365 == 6) {
						Static48.anInt1592 = 128;
						Static97.anInt2643 = 64;
					}
					Static11.anInt365 = 2;
					Static56.anInt1697 = Static70.aClass5_Sub9_Sub1_3.method1418();
					Static110.anInt2891 = Static70.aClass5_Sub9_Sub1_3.method1418();
					Static61.anInt1810 = Static70.aClass5_Sub9_Sub1_3.method1408();
				}
				if (Static11.anInt365 == 10) {
					Static77.anInt2201 = Static70.aClass5_Sub9_Sub1_3.method1418();
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 29) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1442();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1427();
				local440 = Static70.aClass5_Sub9_Sub1_3.method1444();
				if (local440 == 65535) {
					local440 = -1;
				}
				local1567 = ((long) local149 << 32) + ((long) local440);
				@Pc(2415) Class5 local2415 = Static38.aClass66_6.method1812(local1567);
				if (local2415 != null) {
					local2415.method2144();
				}
				Static38.aClass66_6.method1811(local1567, new Class5_Sub3(local233));
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 162) {
				Static114.aBoolean131 = true;
				Static27.anInt853 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static105.anInt2778 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static49.anInt1599 = Static70.aClass5_Sub9_Sub1_3.method1418();
				Static68.anInt1961 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static91.anInt2546 = Static70.aClass5_Sub9_Sub1_3.method1408();
				if (Static91.anInt2546 >= 100) {
					local149 = Static27.anInt853 * 128 + 64;
					local233 = Static105.anInt2778 * 128 + 64;
					local440 = Static32.method676(local149, local233, Static8.anInt262) - Static49.anInt1599;
					local2062 = local440 - Static50.anInt1602;
					local1092 = local149 - Static25.anInt791;
					local1312 = local233 - Static46.anInt1334;
					local2240 = (int) Math.sqrt((double) (local1092 * local1092 + local1312 * local1312));
					Static38.anInt1089 = (int) (Math.atan2((double) local2062, (double) local2240) * 325.949D) & 0x7FF;
					Static56.anInt1690 = (int) (Math.atan2((double) local1092, (double) local1312) * -325.949D) & 0x7FF;
					if (Static38.anInt1089 < 128) {
						Static38.anInt1089 = 128;
					}
					if (Static38.anInt1089 > 383) {
						Static38.anInt1089 = 383;
					}
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 89) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1400();
				local153 = Static70.aClass5_Sub9_Sub1_3.method1448();
				local440 = Static70.aClass5_Sub9_Sub1_3.method1446();
				if (local149 >= 1 && local149 <= 5) {
					if (local153.method1330(Static75.aClass45_904)) {
						local153 = null;
					}
					Static11.aClass45Array3[local149 - 1] = local153;
					Static37.aBooleanArray11[local149 - 1] = local440 == 0;
				}
				Static85.anInt2444 = -1;
				return true;
			}
			@Pc(2618) long local2618;
			if (Static85.anInt2444 == 144) {
				local1292 = Static70.aClass5_Sub9_Sub1_3.method1436();
				local2618 = Static70.aClass5_Sub9_Sub1_3.method1418();
				@Pc(2620) boolean local2620 = false;
				@Pc(2625) long local2625 = (long) Static70.aClass5_Sub9_Sub1_3.method1409();
				local1577 = (local2618 << 32) + local2625;
				local2240 = Static70.aClass5_Sub9_Sub1_3.method1408();
				for (@Pc(2637) int local2637 = 0; local2637 < 100; local2637++) {
					if (Static60.aLongArray4[local2637] == local1577) {
						local2620 = true;
						break;
					}
				}
				if (local2240 <= 1) {
					for (@Pc(2662) int local2662 = 0; local2662 < Static69.anInt1993; local2662++) {
						if (Static56.aLongArray3[local2662] == local1292) {
							local2620 = true;
							break;
						}
					}
				}
				if (!local2620 && Static55.anInt1659 == 0) {
					Static60.aLongArray4[Static9.anInt338] = local1577;
					Static9.anInt338 = (Static9.anInt338 + 1) % 100;
					@Pc(2698) Class45 local2698 = Static96.method1800(Static70.aClass5_Sub9_Sub1_3).method1310();
					if (local2240 == 2 || local2240 == 3) {
						Static7.method138(local2698, Static39.method1443(new Class45[] { Static19.aClass45_285, Static10.method217(local1292).method1303() }), 7);
					} else if (local2240 == 1) {
						Static7.method138(local2698, Static39.method1443(new Class45[] { Static60.aClass45_720, Static10.method217(local1292).method1303() }), 7);
					} else {
						Static7.method138(local2698, Static10.method217(local1292).method1303(), 3);
					}
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 63) {
				Static119.anInt3087 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 7) {
				if (Static53.anInt2372 == 12) {
					Static72.aBoolean99 = true;
				}
				Static48.anInt1591 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 132) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1401();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1452();
				if (local233 == 65535) {
					local233 = -1;
				}
				if (local233 == Static57.anIntArray262[local149]) {
					Static33.method686(Static57.anIntArray262[local149]);
				} else {
					Static5.method79(Static57.anIntArray262[local149]);
					Static57.anIntArray262[local149] = local233;
				}
				Static78.aBoolean102 = true;
				Static72.aBoolean99 = true;
				Static78.method1485(Static57.anIntArray262[local149]);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 178) {
				local1292 = Static70.aClass5_Sub9_Sub1_3.method1436();
				@Pc(2872) Class45 local2872 = Static96.method1800(Static70.aClass5_Sub9_Sub1_3).method1310();
				Static7.method138(local2872, Static10.method217(local1292).method1303(), 6);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 190) {
				Static53.anInt2368 = Static70.aClass5_Sub9_Sub1_3.method1444() * 30;
				Static85.anInt2444 = -1;
				return true;
			}
			@Pc(2909) Class45 local2909;
			if (Static85.anInt2444 == 240) {
				local2909 = Static70.aClass5_Sub9_Sub1_3.method1448();
				@Pc(2939) boolean local2939;
				if (local2909.method1321(Static62.aClass45_768)) {
					local153 = local2909.method1322(local2909.method1328(Static57.aClass45_686), 0);
					local2939 = false;
					local2618 = local153.method1299();
					for (local1312 = 0; local1312 < Static69.anInt1993; local1312++) {
						if (local2618 == Static56.aLongArray3[local1312]) {
							local2939 = true;
							break;
						}
					}
					if (!local2939 && Static55.anInt1659 == 0) {
						Static7.method138(Static27.aClass45_415, local153, 4);
					}
				} else if (local2909.method1321(Static54.aClass45_656)) {
					local153 = local2909.method1322(local2909.method1328(Static57.aClass45_686), 0);
					local2618 = local153.method1299();
					local2939 = false;
					for (local1312 = 0; local1312 < Static69.anInt1993; local1312++) {
						if (local2618 == Static56.aLongArray3[local1312]) {
							local2939 = true;
							break;
						}
					}
					if (!local2939 && Static55.anInt1659 == 0) {
						Static7.method138(Static56.aClass45_681, local153, 8);
					}
				} else if (local2909.method1321(Static2.aClass45_12)) {
					local153 = local2909.method1322(local2909.method1328(Static57.aClass45_686), 0);
					local2618 = local153.method1299();
					local2939 = false;
					for (local1312 = 0; local1312 < Static69.anInt1993; local1312++) {
						if (Static56.aLongArray3[local1312] == local2618) {
							local2939 = true;
							break;
						}
					}
					if (!local2939 && Static55.anInt1659 == 0) {
						@Pc(2981) Class45 local2981 = local2909.method1322(local2909.method1317() - 9, local2909.method1328(Static57.aClass45_686) + 1);
						Static7.method138(local2981, local153, 8);
					}
				} else {
					Static7.method138(local2909, Static78.aClass45_929, 0);
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 92) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1435();
				@Pc(3110) byte local3110 = Static70.aClass5_Sub9_Sub1_3.method1453();
				Static114.anIntArray473[local149] = local3110;
				if (local3110 != Static117.anIntArray483[local149]) {
					Static117.anIntArray483[local149] = local3110;
					Static69.method1352(local149);
					Static72.aBoolean99 = true;
					if (anInt2693 != -1) {
						Static51.aBoolean81 = true;
					}
				}
				Static85.anInt2444 = -1;
				Static108.anInt2827 = Static3.anInt94;
				return true;
			}
			if (Static85.anInt2444 == 22) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1418();
				Static11.method224(local149);
				if (Static72.anInt2162 != -1) {
					Static5.method79(Static72.anInt2162);
					Static78.aBoolean102 = true;
					Static72.anInt2162 = -1;
					Static72.aBoolean99 = true;
				}
				if (Static101.anInt1036 != -1) {
					Static5.method79(Static101.anInt1036);
					Static101.anInt1036 = -1;
					Static39.method1422(30);
				}
				if (Static38.anInt1088 != -1) {
					Static5.method79(Static38.anInt1088);
					Static38.anInt1088 = -1;
				}
				if (Static63.anInt1837 != -1) {
					Static5.method79(Static63.anInt1837);
					Static63.anInt1837 = -1;
				}
				if (local149 == Static67.anInt1909) {
					Static33.method686(Static67.anInt1909);
				} else {
					Static5.method79(Static67.anInt1909);
					Static67.anInt1909 = local149;
				}
				Static119.anInt3089 = -1;
				Static78.method1485(Static67.anInt1909);
				Static51.aBoolean81 = true;
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 59) {
				Static85.anInt2444 = -1;
				Static1.anInt6 = 0;
				return true;
			}
			if (Static85.anInt2444 == 35) {
				Static114.anInt3008 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static1.anInt2 = Static70.aClass5_Sub9_Sub1_3.method1401();
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 167) {
				if (Static53.anInt2372 == 12) {
					Static72.aBoolean99 = true;
				}
				Static59.anInt1756 = Static70.aClass5_Sub9_Sub1_3.method1410();
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 222) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1444();
				Static11.method224(local149);
				if (Static72.anInt2162 != -1) {
					Static5.method79(Static72.anInt2162);
					Static72.anInt2162 = -1;
					Static72.aBoolean99 = true;
					Static78.aBoolean102 = true;
				}
				if (Static67.anInt1909 != -1) {
					Static5.method79(Static67.anInt1909);
					Static51.aBoolean81 = true;
					Static67.anInt1909 = -1;
				}
				if (Static101.anInt1036 != -1) {
					Static5.method79(Static101.anInt1036);
					Static101.anInt1036 = -1;
					Static39.method1422(30);
				}
				if (Static38.anInt1088 != -1) {
					Static5.method79(Static38.anInt1088);
					Static38.anInt1088 = -1;
				}
				if (Static63.anInt1837 == local149) {
					Static33.method686(Static63.anInt1837);
				} else {
					Static5.method79(Static63.anInt1837);
					Static63.anInt1837 = local149;
				}
				Static119.anInt3089 = -1;
				if (Static75.anInt2178 != 0) {
					Static51.aBoolean81 = true;
					Static75.anInt2178 = 0;
				}
				Static78.method1485(Static63.anInt1837);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 171) {
				if (Static72.anInt2162 != -1) {
					Static5.method79(Static72.anInt2162);
					Static78.aBoolean102 = true;
					Static72.aBoolean99 = true;
					Static72.anInt2162 = -1;
				}
				if (Static67.anInt1909 != -1) {
					Static5.method79(Static67.anInt1909);
					Static67.anInt1909 = -1;
					Static51.aBoolean81 = true;
				}
				if (Static101.anInt1036 != -1) {
					Static5.method79(Static101.anInt1036);
					Static101.anInt1036 = -1;
					Static39.method1422(30);
				}
				if (Static38.anInt1088 != -1) {
					Static5.method79(Static38.anInt1088);
					Static38.anInt1088 = -1;
				}
				if (Static63.anInt1837 != -1) {
					Static5.method79(Static63.anInt1837);
					Static63.anInt1837 = -1;
				}
				Static119.anInt3089 = -1;
				Static85.anInt2444 = -1;
				if (Static75.anInt2178 != 0) {
					Static51.aBoolean81 = true;
					Static75.anInt2178 = 0;
				}
				return true;
			}
			if (Static85.anInt2444 == 209) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1400();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1446();
				local440 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static8.anInt262 = local149 >> 1;
				Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.method1622(local440, local233, (local149 & 0x1) == 1);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 194) {
				Static97.method1805(false);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 158) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1452();
				if (local149 == 65535) {
					local149 = -1;
				}
				Static37.method792(local149);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 76) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1435();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1405();
				if (local149 == 65535) {
					local149 = -1;
				}
				Static25.method556(local149, local233);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 220) {
				for (local149 = 0; local149 < Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1.length; local149++) {
					if (Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local149] != null) {
						Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local149].anInt2436 = -1;
					}
				}
				for (local233 = 0; local233 < Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1.length; local233++) {
					if (Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local233] != null) {
						Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local233].anInt2436 = -1;
					}
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 66) {
				Static96.method1796();
				Static85.anInt2444 = -1;
				return false;
			}
			if (Static85.anInt2444 == 183) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1418();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1435();
				if (Static67.anInt1909 != -1) {
					Static5.method79(Static67.anInt1909);
					Static67.anInt1909 = -1;
					Static51.aBoolean81 = true;
				}
				if (Static101.anInt1036 != -1) {
					Static5.method79(Static101.anInt1036);
					Static101.anInt1036 = -1;
					Static39.method1422(30);
				}
				if (Static38.anInt1088 != -1) {
					Static5.method79(Static38.anInt1088);
					Static38.anInt1088 = -1;
				}
				if (Static63.anInt1837 == local233) {
					Static33.method686(Static63.anInt1837);
				} else {
					Static5.method79(Static63.anInt1837);
					Static63.anInt1837 = local233;
				}
				if (Static72.anInt2162 == local149) {
					Static33.method686(Static72.anInt2162);
				} else {
					Static5.method79(Static72.anInt2162);
					Static72.anInt2162 = local149;
				}
				Static78.aBoolean102 = true;
				Static119.anInt3089 = -1;
				if (Static75.anInt2178 != 0) {
					Static51.aBoolean81 = true;
					Static75.anInt2178 = 0;
				}
				Static72.aBoolean99 = true;
				Static78.method1485(Static63.anInt1837);
				Static78.method1485(Static72.anInt2162);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 46 || Static85.anInt2444 == 214 || Static85.anInt2444 == 130 || Static85.anInt2444 == 77 || Static85.anInt2444 == 23 || Static85.anInt2444 == 51 || Static85.anInt2444 == 6 || Static85.anInt2444 == 253 || Static85.anInt2444 == 44 || Static85.anInt2444 == 216 || Static85.anInt2444 == 197) {
				Static17.method319();
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 227) {
				local2909 = Static70.aClass5_Sub9_Sub1_3.method1448();
				@Pc(3729) Object[] local3729 = new Object[local2909.method1317() + 1];
				for (local440 = local2909.method1317() - 1; local440 >= 0; local440--) {
					if (local2909.method1324(local440) == 115) {
						local3729[local440 + 1] = Static70.aClass5_Sub9_Sub1_3.method1448();
					} else {
						local3729[local440 + 1] = Integer.valueOf(Static70.aClass5_Sub9_Sub1_3.method1434());
					}
				}
				local3729[0] = Integer.valueOf(Static70.aClass5_Sub9_Sub1_3.method1434());
				Static33.method687(0, null, 0, local3729, 0, null);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 70) {
				Static112.method2037(Static96.aClass77_3, Static69.anInt1989, Static70.aClass5_Sub9_Sub1_3);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 137) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1407();
				if (local149 != anInt2693) {
					Static5.method79(anInt2693);
					anInt2693 = local149;
				}
				Static51.aBoolean81 = true;
				Static78.method1485(anInt2693);
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 82) {
				Static114.aBoolean131 = false;
				for (local149 = 0; local149 < 5; local149++) {
					Static110.aBooleanArray24[local149] = false;
				}
				Static85.anInt2444 = -1;
				return true;
			}
			if (Static85.anInt2444 == 62) {
				Static78.aClass45_928 = Static70.aClass5_Sub9_Sub1_3.method1448();
				if (Static67.anInt1909 != -1) {
					Static5.method79(Static67.anInt1909);
					Static67.anInt1909 = -1;
				}
				Static51.aBoolean81 = true;
				Static85.anInt2444 = -1;
				Static93.aBoolean116 = false;
				Static78.aClass45_923 = Static78.aClass45_929;
				Static75.anInt2178 = 4;
				return true;
			}
			if (Static85.anInt2444 == 88) {
				local149 = Static70.aClass5_Sub9_Sub1_3.method1427();
				local233 = Static70.aClass5_Sub9_Sub1_3.method1444();
				local440 = local233 >> 10 & 0x1F;
				local2062 = local233 & 0x1F;
				local1092 = local233 >> 5 & 0x1F;
				@Pc(3921) Class5_Sub2_Sub8 local3921 = Static80.method1507(local149);
				Static85.anInt2444 = -1;
				local3921.anInt1233 = (local2062 << 3) + ((local440 << 19) + (local1092 << 11));
				return true;
			}
			if (Static85.anInt2444 == 85) {
				Static71.anInt2080 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static36.anInt1058 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static70.anInt2023 = Static70.aClass5_Sub9_Sub1_3.method1408();
				Static96.aBoolean121 = true;
				Static85.anInt2444 = -1;
				Static51.aBoolean81 = true;
				return true;
			}
			Static53.method1609("T1 - " + Static85.anInt2444 + "," + Static74.anInt2504 + "," + Static23.anInt777 + " - " + Static69.anInt1989, null);
			Static96.method1796();
		} catch (@Pc(3990) IOException local3990) {
			Static6.method114();
		} catch (@Pc(3994) Exception local3994) {
			@Pc(4034) String local4034 = "T2 - " + Static85.anInt2444 + "," + Static74.anInt2504 + "," + Static23.anInt777 + " - " + Static69.anInt1989 + "," + (Static78.anInt2210 + Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0]) + "," + (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0] + Static6.anInt162) + " - ";
			for (local233 = 0; Static69.anInt1989 > local233 && local233 < 50; local233++) {
				local4034 = local4034 + Static70.aClass5_Sub9_Sub1_3.aByteArray28[local233] + ",";
			}
			Static53.method1609(local4034, local3994);
			Static96.method1796();
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
	public static void method1841() {
		Static121.aClass4_3.method1695();
		for (@Pc(11) int local11 = 0; local11 < 32; local11++) {
			Static105.aLongArray6[local11] = 0L;
		}
		for (@Pc(25) int local25 = 0; local25 < 32; local25++) {
			Static54.aLongArray2[local25] = 0L;
		}
		Static88.anInt2503 = 0;
	}

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)V")
	public static void method1842() {
		if (Static98.anInt2653 == 0) {
			return;
		}
		@Pc(8) int local8 = 0;
		if (Static53.anInt2368 != 0) {
			local8 = 1;
		}
		for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
			if (Static59.aClass45Array16[local17] != null) {
				@Pc(26) int local26 = Static12.anIntArray486[local17];
				@Pc(30) Class45 local30 = Static37.aClass45Array11[local17];
				if (local30 != null && local30.method1302(Static60.aClass45_720)) {
					local30 = local30.method1296(5);
				}
				if (local30 != null && local30.method1302(Static19.aClass45_285)) {
					local30 = local30.method1296(5);
				}
				if ((local26 == 3 || local26 == 7) && (local26 == 7 || Static36.anInt1058 == 0 || Static36.anInt1058 == 1 && Static71.method1383(local30))) {
					@Pc(85) int local85 = 329 - local8 * 13;
					local8++;
					if (Static14.anInt425 > 4 && local85 - 10 < Static47.anInt1354 - 4 && local85 + 3 >= Static47.anInt1354 + -4) {
						@Pc(134) int local134 = Static78.aClass5_Sub2_Sub6_Sub1_5.method520(Static39.method1443(new Class45[] { Static73.aClass45_900, Static75.aClass45_903, local30, Static59.aClass45Array16[local17] })) + 25;
						if (local134 > 450) {
							local134 = 450;
						}
						if (local134 + 4 > Static14.anInt425) {
							if (Static84.anInt2332 >= 1) {
								Static108.method1945(0, 2010, Static39.method1443(new Class45[] { Static39.aClass45_886, local30 }), 0, 0, Static37.aClass45_500);
							}
							Static108.method1945(0, 2046, Static39.method1443(new Class45[] { Static39.aClass45_886, local30 }), 0, 0, Static31.aClass45_446);
							Static108.method1945(0, 2013, Static39.method1443(new Class45[] { Static39.aClass45_886, local30 }), 0, 0, Static16.aClass45_222);
						}
					}
					if (local8 >= 5) {
						return;
					}
				}
				if ((local26 == 5 || local26 == 6) && Static36.anInt1058 < 2) {
					local8++;
					if (local8 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)V")
	public static void method1843(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static69.anInt1993 >= 100) {
			Static7.method138(Static120.aClass45_1366, Static78.aClass45_929, 0);
			return;
		}
		@Pc(33) Class45 local33 = Static10.method217(arg0).method1303();
		for (@Pc(35) int local35 = 0; local35 < Static69.anInt1993; local35++) {
			if (Static56.aLongArray3[local35] == arg0) {
				Static7.method138(Static39.method1443(new Class45[] { local33, Static79.aClass45_944 }), Static78.aClass45_929, 0);
				return;
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static104.anInt2772; local74++) {
			if (Static23.aLongArray1[local74] == arg0) {
				Static7.method138(Static39.method1443(new Class45[] { Static119.aClass45_1351, local33, Static50.aClass45_647 }), Static78.aClass45_929, 0);
				return;
			}
		}
		if (!local33.method1319(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass45_629)) {
			Static56.aLongArray3[Static69.anInt1993++] = arg0;
			Static72.aBoolean99 = true;
			Static64.aClass5_Sub9_Sub1_2.method1466(242);
			Static64.aClass5_Sub9_Sub1_2.method1454(arg0);
		}
	}
}
