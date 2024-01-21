import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	public static int anInt966;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "[Lclient!mb;")
	public static Class45[] aClass45Array10 = new Class45[500];

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_479 = Static63.method1251("");

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
	public static int[] anIntArray163 = new int[500];

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	public static int anInt968 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method696() {
		anIntArray163 = null;
		anIntArray162 = null;
		aClass45_479 = null;
		aClass45Array10 = null;
		aFrame1 = null;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method697() {
		@Pc(1) Class63 local1 = Static71.aClass63_1;
		synchronized (Static71.aClass63_1) {
			Static108.anInt2830 = Static91.anInt2547;
			Static14.anInt425 = Static4.anInt103;
			Static47.anInt1354 = Static67.anInt1912;
			Static28.anInt881 = Static37.anInt1076;
			Static67.anInt1906 = Static108.anInt2836;
			Static36.anInt1063 = Static69.anInt1983;
			Static34.aLong58 = Static46.aLong71;
			Static37.anInt1076 = 0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public static void method698() {
		Static14.anInt421++;
		Static98.method1813(true);
		Static33.method684(true);
		Static98.method1813(false);
		Static33.method684(false);
		Static5.method76();
		Static101.method732();
		@Pc(31) int local31;
		@Pc(63) int local63;
		if (!Static114.aBoolean131) {
			local31 = Static102.anInt2755;
			if (local31 < Static52.anInt3138 / 256) {
				local31 = Static52.anInt3138 / 256;
			}
			if (Static110.aBooleanArray24[4] && local31 < Static61.anIntArray277[4] + 128) {
				local31 = Static61.anIntArray277[4] + 128;
			}
			local63 = Static76.anInt2191 + Static112.anInt2981 & 0x7FF;
			Static115.method2087(Static34.anInt955, local31 * 3 + 600, Static32.method676(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417, Static8.anInt262) + -50, Static50.anInt1604, local63, local31);
		}
		if (Static114.aBoolean131) {
			local31 = Static102.method1889();
		} else {
			local31 = Static119.method2131();
		}
		@Pc(100) int local100 = Static50.anInt1602;
		local63 = Static25.anInt791;
		@Pc(104) int local104 = Static46.anInt1334;
		@Pc(106) int local106 = Static38.anInt1089;
		@Pc(108) int local108 = Static56.anInt1690;
		for (@Pc(110) int local110 = 0; local110 < 5; local110++) {
			if (Static110.aBooleanArray24[local110]) {
				@Pc(152) int local152 = (int) ((double) -Static13.anIntArray55[local110] + (double) (Static13.anIntArray55[local110] * 2 + 1) * Math.random() + Math.sin((double) Static98.anIntArray401[local110] / 100.0D * (double) Static99.anIntArray403[local110]) * (double) Static61.anIntArray277[local110]);
				if (local110 == 1) {
					Static50.anInt1602 += local152;
				}
				if (local110 == 3) {
					Static56.anInt1690 = Static56.anInt1690 + local152 & 0x7FF;
				}
				if (local110 == 0) {
					Static25.anInt791 += local152;
				}
				if (local110 == 4) {
					Static38.anInt1089 += local152;
					if (Static38.anInt1089 < 128) {
						Static38.anInt1089 = 128;
					}
					if (Static38.anInt1089 > 383) {
						Static38.anInt1089 = 383;
					}
				}
				if (local110 == 2) {
					Static46.anInt1334 += local152;
				}
			}
		}
		Static88.method1688();
		Static20.anInt692 = Static47.anInt1354 - 4;
		Static20.anInt688 = Static14.anInt425 - 4;
		Static20.anInt691 = 0;
		Static20.aBoolean29 = true;
		Static104.method1900();
		Static118.method1865();
		Static104.method1900();
		Static110.aClass34_1.method907(Static25.anInt791, Static50.anInt1602, Static46.anInt1334, Static38.anInt1089, Static56.anInt1690, local31);
		Static104.method1900();
		Static110.aClass34_1.method903();
		Static52.method2149();
		Static101.method755();
		((Class57) Static86.anInterface2_1).method1685(Static90.anInt2533);
		Static108.method1946();
		if (Static21.aBoolean31 && Static11.method226() == 0) {
			Static21.aBoolean31 = false;
		}
		if (Static21.aBoolean31) {
			Static88.method1688();
			Static118.method1865();
			Static59.method1216(null, Static111.aClass45_1277, false);
		}
		Static104.method1900();
		Static80.method1509();
		Static46.anInt1334 = local104;
		Static25.anInt791 = local63;
		Static38.anInt1089 = local106;
		Static50.anInt1602 = local100;
		Static56.anInt1690 = local108;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!sd;Ljava/awt/Component;)V")
	public static void method699(@OriginalArg(1) Class29 arg0, @OriginalArg(2) Component arg1) {
		if (Static5.aBoolean6) {
			return;
		}
		Static107.aClass5_Sub2_Sub6_Sub4_43 = Static74.method1696(Static29.aClass45_430, Static1.aClass45_1, arg0);
		Static117.aClass5_Sub2_Sub6_Sub4_48 = Static74.method1696(Static29.aClass45_430, Static37.aClass45_502, arg0);
		Static117.aClass5_Sub2_Sub6_Sub4_49 = Static74.method1696(Static29.aClass45_430, Static90.aClass45_1054, arg0);
		Static100.aClass5_Sub2_Sub6_Sub4_41 = Static74.method1696(Static29.aClass45_430, Static85.aClass45_1017, arg0);
		Static73.aClass5_Sub2_Sub6_Sub4_32 = Static74.method1696(Static29.aClass45_430, Static103.aClass45_1183, arg0);
		Static91.aClass5_Sub2_Sub6_Sub4_37 = Static74.method1696(Static29.aClass45_430, Static80.aClass45_953, arg0);
		Static9.aClass11_17 = Static55.method1154(479, 96, arg1);
		Static117.aClass5_Sub2_Sub6_Sub4_48.method1874(0, 0);
		Static12.aClass11_137 = Static55.method1154(172, 156, arg1);
		Static118.method1865();
		Static117.aClass5_Sub2_Sub6_Sub4_49.method1874(0, 0);
		Static40.aClass11_54 = Static55.method1154(190, 261, arg1);
		Static107.aClass5_Sub2_Sub6_Sub4_43.method1874(0, 0);
		Static12.aClass11_136 = Static55.method1154(512, 334, arg1);
		Static118.method1865();
		Static16.aClass11_23 = Static55.method1154(496, 50, arg1);
		Static99.aClass11_107 = Static55.method1154(269, 37, arg1);
		Static14.aClass11_22 = Static55.method1154(249, 45, arg1);
		@Pc(112) Class5_Sub2_Sub6_Sub3 local112 = Static117.method2123(Static29.aClass45_430, arg0, Static100.aClass45_1160);
		Static100.aClass11_110 = Static55.method1154(local112.anInt2599, local112.anInt2597, arg1);
		local112.method1773(0, 0);
		@Pc(132) Class5_Sub2_Sub6_Sub3 local132 = Static117.method2123(Static29.aClass45_430, arg0, Static106.aClass45_1220);
		Static90.aClass11_102 = Static55.method1154(local132.anInt2599, local132.anInt2597, arg1);
		local132.method1773(0, 0);
		@Pc(150) Class5_Sub2_Sub6_Sub3 local150 = Static117.method2123(Static29.aClass45_430, arg0, Static79.aClass45_943);
		Static14.aClass11_21 = Static55.method1154(local150.anInt2599, local150.anInt2597, arg1);
		local150.method1773(0, 0);
		@Pc(172) Class5_Sub2_Sub6_Sub3 local172 = Static117.method2123(Static29.aClass45_430, arg0, Static91.aClass45_1069);
		Static68.aClass11_82 = Static55.method1154(local172.anInt2599, local172.anInt2597, arg1);
		local172.method1773(0, 0);
		@Pc(192) Class5_Sub2_Sub6_Sub3 local192 = Static117.method2123(Static29.aClass45_430, arg0, Static62.aClass45_776);
		Static112.aClass11_129 = Static55.method1154(local192.anInt2599, local192.anInt2597, arg1);
		local192.method1773(0, 0);
		@Pc(210) Class5_Sub2_Sub6_Sub3 local210 = Static117.method2123(Static29.aClass45_430, arg0, Static67.aClass45_821);
		Static51.aClass11_67 = Static55.method1154(local210.anInt2599, local210.anInt2597, arg1);
		local210.method1773(0, 0);
		@Pc(233) Class5_Sub2_Sub6_Sub3 local233 = Static117.method2123(Static29.aClass45_430, arg0, Static105.aClass45_1201);
		Static90.aClass11_101 = Static55.method1154(local233.anInt2599, local233.anInt2597, arg1);
		local233.method1773(0, 0);
		@Pc(251) Class5_Sub2_Sub6_Sub3 local251 = Static117.method2123(Static29.aClass45_430, arg0, Static71.aClass45_874);
		Static110.aClass11_124 = Static55.method1154(local251.anInt2599, local251.anInt2597, arg1);
		local251.method1773(0, 0);
		@Pc(271) Class5_Sub2_Sub6_Sub3 local271 = Static117.method2123(Static29.aClass45_430, arg0, Static6.aClass45_74);
		Static39.aClass11_89 = Static55.method1154(local271.anInt2599, local271.anInt2597, arg1);
		local271.method1773(0, 0);
		Static16.aClass5_Sub2_Sub6_Sub4_10 = Static74.method1696(Static29.aClass45_430, Static21.aClass45_320, arg0);
		Static68.aClass5_Sub2_Sub6_Sub4_29 = Static74.method1696(Static29.aClass45_430, Static96.aClass45_1107, arg0);
		Static42.aClass5_Sub2_Sub6_Sub4_17 = Static74.method1696(Static29.aClass45_430, Static63.aClass45_781, arg0);
		Static29.aClass5_Sub2_Sub6_Sub4_19 = Static16.aClass5_Sub2_Sub6_Sub4_10.method1878();
		Static29.aClass5_Sub2_Sub6_Sub4_19.method1875();
		Static92.aClass5_Sub2_Sub6_Sub4_47 = Static68.aClass5_Sub2_Sub6_Sub4_29.method1878();
		Static92.aClass5_Sub2_Sub6_Sub4_47.method1875();
		Static60.aClass5_Sub2_Sub6_Sub4_27 = Static16.aClass5_Sub2_Sub6_Sub4_10.method1878();
		Static60.aClass5_Sub2_Sub6_Sub4_27.method1873();
		Static50.aClass5_Sub2_Sub6_Sub4_24 = Static68.aClass5_Sub2_Sub6_Sub4_29.method1878();
		Static50.aClass5_Sub2_Sub6_Sub4_24.method1873();
		Static9.aClass5_Sub2_Sub6_Sub4_8 = Static42.aClass5_Sub2_Sub6_Sub4_17.method1878();
		Static9.aClass5_Sub2_Sub6_Sub4_8.method1873();
		Static11.aClass5_Sub2_Sub6_Sub4_9 = Static16.aClass5_Sub2_Sub6_Sub4_10.method1878();
		Static11.aClass5_Sub2_Sub6_Sub4_9.method1875();
		Static11.aClass5_Sub2_Sub6_Sub4_9.method1873();
		Static5.aClass5_Sub2_Sub6_Sub4_1 = Static68.aClass5_Sub2_Sub6_Sub4_29.method1878();
		Static5.aClass5_Sub2_Sub6_Sub4_1.method1875();
		Static5.aClass5_Sub2_Sub6_Sub4_1.method1873();
		Static120.aClass5_Sub2_Sub6_Sub4Array6 = Static96.method1798(Static89.aClass45_1048, arg0, Static29.aClass45_430);
		Static108.anIntArray432 = new int[151];
		Static66.anIntArray291 = new int[33];
		Static57.anIntArray261 = new int[151];
		Static48.anIntArray244 = new int[33];
		@Pc(366) int local366;
		@Pc(364) int local364;
		@Pc(368) int local368;
		for (@Pc(360) int local360 = 0; local360 < 33; local360++) {
			local364 = 0;
			local366 = 999;
			for (local368 = 0; local368 < 34; local368++) {
				if (Static117.aClass5_Sub2_Sub6_Sub4_49.aByteArray37[Static117.aClass5_Sub2_Sub6_Sub4_49.anInt2731 * local360 + local368] == 0) {
					if (local366 == 999) {
						local366 = local368;
					}
				} else if (local366 != 999) {
					local364 = local368;
					break;
				}
			}
			Static66.anIntArray291[local360] = local366;
			Static48.anIntArray244[local360] = local364 - local366;
		}
		for (local366 = 5; local366 < 156; local366++) {
			local364 = 999;
			local368 = 0;
			for (@Pc(425) int local425 = 25; local425 < 172; local425++) {
				if (Static117.aClass5_Sub2_Sub6_Sub4_49.aByteArray37[local366 * Static117.aClass5_Sub2_Sub6_Sub4_49.anInt2731 + local425] == 0 && (local425 > 34 || local366 > 34)) {
					if (local364 == 999) {
						local364 = local425;
					}
				} else if (local364 != 999) {
					local368 = local425;
					break;
				}
			}
			Static108.anIntArray432[local366 - 5] = local364 - 25;
			Static57.anIntArray261[local366 - 5] = local368 - local364;
		}
		Static5.aBoolean6 = true;
	}
}
