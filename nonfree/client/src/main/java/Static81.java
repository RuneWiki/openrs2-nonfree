import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!ae;")
	public static Class5 aClass5_923 = Static56.method972("null");

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_924 = Static56.method972("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	public static int anInt2005 = -1;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Lclient!ae;")
	public static Class5 aClass5_925 = Static56.method972("");

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_926 = Static56.method972("Lade Texturen )2 ");

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
	public static int anInt2006 = -1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method1297() {
		aClass5_923 = null;
		aClass5_926 = null;
		aClass5_924 = null;
		aClass5_925 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!te;B)Z")
	public static boolean method1298(@OriginalArg(0) Class3_Sub1_Sub17 arg0) {
		@Pc(2) int local2 = arg0.anInt2646;
		if (Static15.anInt524 == 2) {
			if (local2 == 201) {
				Static17.anInt614 = 1;
				Static103.aBoolean141 = true;
				Static110.aClass5_1301 = Static110.aClass5_1307;
				Static68.anInt1553 = 0;
				Static15.aBoolean22 = true;
				Static110.aClass5_1299 = Static23.aClass5_312;
			}
			if (local2 == 202) {
				Static17.anInt614 = 2;
				Static103.aBoolean141 = true;
				Static15.aBoolean22 = true;
				Static68.anInt1553 = 0;
				Static110.aClass5_1299 = Static61.aClass5_782;
				Static110.aClass5_1301 = Static110.aClass5_1307;
			}
		}
		if (local2 == 205) {
			Static27.anInt810 = 250;
			return true;
		}
		if (local2 == 501) {
			Static110.aClass5_1301 = Static110.aClass5_1307;
			Static110.aClass5_1299 = Static103.aClass5_1204;
			Static103.aBoolean141 = true;
			Static17.anInt614 = 4;
			Static15.aBoolean22 = true;
			Static68.anInt1553 = 0;
		}
		if (local2 == 502) {
			Static110.aClass5_1301 = Static110.aClass5_1307;
			Static110.aClass5_1299 = Static48.aClass5_637;
			Static17.anInt614 = 5;
			Static103.aBoolean141 = true;
			Static68.anInt1553 = 0;
			Static15.aBoolean22 = true;
		}
		@Pc(101) int local101;
		@Pc(105) int local105;
		if (local2 >= 300 && local2 <= 313) {
			local101 = (local2 - 300) / 2;
			local105 = local2 & 0x1;
			Static27.aClass48_1.method1222(local105 == 1, local101);
		}
		if (local2 >= 314 && local2 <= 323) {
			local105 = local2 & 0x1;
			local101 = (local2 - 314) / 2;
			Static27.aClass48_1.method1234(local105 == 1, local101);
		}
		if (local2 == 324) {
			Static27.aClass48_1.method1221(false);
		}
		if (local2 == 325) {
			Static27.aClass48_1.method1221(true);
		}
		if (local2 == 326) {
			Static95.aClass3_Sub6_Sub1_3.method1645(118);
			Static27.aClass48_1.method1224(Static95.aClass3_Sub6_Sub1_3);
			return true;
		}
		if (local2 == 620) {
			Static103.aBoolean140 = !Static103.aBoolean140;
		}
		if (local2 >= 601 && local2 <= 613) {
			Static93.method1557();
			if (Static110.aClass5_1306.method144() > 0) {
				Static95.aClass3_Sub6_Sub1_3.method1645(119);
				Static95.aClass3_Sub6_Sub1_3.method1606(Static110.aClass5_1306.method146());
				Static95.aClass3_Sub6_Sub1_3.method1608(local2 - 601);
				Static95.aClass3_Sub6_Sub1_3.method1608(Static103.aBoolean140 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;ILclient!bf;)V")
	public static void method1299(@OriginalArg(0) Component arg0, @OriginalArg(2) Class11 arg1) {
		if (Static63.aBoolean156) {
			return;
		}
		Static74.aClass3_Sub1_Sub2_Sub4_7 = Static85.method1369(arg1, Static89.aClass5_1036, Static46.aClass5_606);
		Static22.aClass3_Sub1_Sub2_Sub4_3 = Static85.method1369(arg1, Static70.aClass5_839, Static46.aClass5_606);
		Static79.aClass3_Sub1_Sub2_Sub4_8 = Static85.method1369(arg1, Static51.aClass5_1096, Static46.aClass5_606);
		Static88.aClass3_Sub1_Sub2_Sub4_9 = Static85.method1369(arg1, Static99.aClass5_1128, Static46.aClass5_606);
		Static113.aClass3_Sub1_Sub2_Sub4_19 = Static85.method1369(arg1, Static46.aClass5_611, Static46.aClass5_606);
		Static92.aClass3_Sub1_Sub2_Sub4_11 = Static85.method1369(arg1, Static9.aClass5_164, Static46.aClass5_606);
		Static38.aClass2_7 = Static92.method1544(arg0, 479, 96);
		Static22.aClass3_Sub1_Sub2_Sub4_3.method1857(0, 0);
		Static115.aClass2_27 = Static92.method1544(arg0, 172, 156);
		Static66.method1850();
		Static79.aClass3_Sub1_Sub2_Sub4_8.method1857(0, 0);
		Static53.aClass2_12 = Static92.method1544(arg0, 190, 261);
		Static74.aClass3_Sub1_Sub2_Sub4_7.method1857(0, 0);
		Static32.aClass2_5 = Static92.method1544(arg0, 512, 334);
		Static66.method1850();
		Static112.aClass2_25 = Static92.method1544(arg0, 496, 50);
		Static22.aClass2_4 = Static92.method1544(arg0, 269, 37);
		Static87.aClass2_16 = Static92.method1544(arg0, 249, 45);
		@Pc(106) Class3_Sub1_Sub2_Sub3 local106 = Static56.method965(Static100.aClass5_1140, Static46.aClass5_606, arg1);
		Static95.aClass2_20 = Static92.method1544(arg0, local106.anInt2172, local106.anInt2169);
		local106.method1444(0, 0);
		@Pc(131) Class3_Sub1_Sub2_Sub3 local131 = Static56.method965(Static111.aClass5_1310, Static46.aClass5_606, arg1);
		Static93.aClass2_18 = Static92.method1544(arg0, local131.anInt2172, local131.anInt2169);
		local131.method1444(0, 0);
		@Pc(149) Class3_Sub1_Sub2_Sub3 local149 = Static56.method965(Static22.aClass5_311, Static46.aClass5_606, arg1);
		Static83.aClass2_15 = Static92.method1544(arg0, local149.anInt2172, local149.anInt2169);
		local149.method1444(0, 0);
		@Pc(167) Class3_Sub1_Sub2_Sub3 local167 = Static56.method965(Static62.aClass5_788, Static46.aClass5_606, arg1);
		Static12.aClass2_1 = Static92.method1544(arg0, local167.anInt2172, local167.anInt2169);
		local167.method1444(0, 0);
		@Pc(185) Class3_Sub1_Sub2_Sub3 local185 = Static56.method965(Static88.aClass5_1018, Static46.aClass5_606, arg1);
		Static70.aClass2_14 = Static92.method1544(arg0, local185.anInt2172, local185.anInt2169);
		local185.method1444(0, 0);
		@Pc(203) Class3_Sub1_Sub2_Sub3 local203 = Static56.method965(Static112.aClass5_1328, Static46.aClass5_606, arg1);
		Static105.aClass2_23 = Static92.method1544(arg0, local203.anInt2172, local203.anInt2169);
		local203.method1444(0, 0);
		@Pc(221) Class3_Sub1_Sub2_Sub3 local221 = Static56.method965(Static45.aClass5_605, Static46.aClass5_606, arg1);
		Static38.aClass2_8 = Static92.method1544(arg0, local221.anInt2172, local221.anInt2169);
		local221.method1444(0, 0);
		@Pc(239) Class3_Sub1_Sub2_Sub3 local239 = Static56.method965(Static70.aClass5_848, Static46.aClass5_606, arg1);
		Static102.aClass2_21 = Static92.method1544(arg0, local239.anInt2172, local239.anInt2169);
		local239.method1444(0, 0);
		@Pc(257) Class3_Sub1_Sub2_Sub3 local257 = Static56.method965(Static100.aClass5_1134, Static46.aClass5_606, arg1);
		Static92.aClass2_17 = Static92.method1544(arg0, local257.anInt2172, local257.anInt2169);
		local257.method1444(0, 0);
		Static113.aClass3_Sub1_Sub2_Sub4_18 = Static85.method1369(arg1, Static2.aClass5_83, Static46.aClass5_606);
		Static90.aClass3_Sub1_Sub2_Sub4_10 = Static85.method1369(arg1, Static90.aClass5_1059, Static46.aClass5_606);
		Static2.aClass3_Sub1_Sub2_Sub4_1 = Static85.method1369(arg1, Static95.aClass5_1121, Static46.aClass5_606);
		Static52.aClass3_Sub1_Sub2_Sub4_6 = Static113.aClass3_Sub1_Sub2_Sub4_18.method1854();
		Static52.aClass3_Sub1_Sub2_Sub4_6.method1853();
		Static109.aClass3_Sub1_Sub2_Sub4_17 = Static90.aClass3_Sub1_Sub2_Sub4_10.method1854();
		Static109.aClass3_Sub1_Sub2_Sub4_17.method1853();
		Static5.aClass3_Sub1_Sub2_Sub4_2 = Static113.aClass3_Sub1_Sub2_Sub4_18.method1854();
		Static5.aClass3_Sub1_Sub2_Sub4_2.method1856();
		Static101.aClass3_Sub1_Sub2_Sub4_14 = Static90.aClass3_Sub1_Sub2_Sub4_10.method1854();
		Static101.aClass3_Sub1_Sub2_Sub4_14.method1856();
		Static51.aClass3_Sub1_Sub2_Sub4_13 = Static2.aClass3_Sub1_Sub2_Sub4_1.method1854();
		Static51.aClass3_Sub1_Sub2_Sub4_13.method1856();
		Static46.aClass3_Sub1_Sub2_Sub4_4 = Static113.aClass3_Sub1_Sub2_Sub4_18.method1854();
		Static46.aClass3_Sub1_Sub2_Sub4_4.method1853();
		Static46.aClass3_Sub1_Sub2_Sub4_4.method1856();
		Static103.aClass3_Sub1_Sub2_Sub4_15 = Static90.aClass3_Sub1_Sub2_Sub4_10.method1854();
		Static103.aClass3_Sub1_Sub2_Sub4_15.method1853();
		Static103.aClass3_Sub1_Sub2_Sub4_15.method1856();
		Static93.aClass3_Sub1_Sub2_Sub4Array5 = Static80.method1296(arg1, Static46.aClass5_606, Static115.aClass5_1353);
		Static22.anIntArray91 = new int[151];
		Static50.anIntArray161 = new int[33];
		Static48.anIntArray153 = new int[151];
		Static102.anIntArray310 = new int[33];
		@Pc(350) int local350;
		@Pc(352) int local352;
		@Pc(354) int local354;
		for (@Pc(346) int local346 = 0; local346 < 33; local346++) {
			local350 = 999;
			local352 = 0;
			for (local354 = 0; local354 < 34; local354++) {
				if (Static79.aClass3_Sub1_Sub2_Sub4_8.aByteArray24[local354 + Static79.aClass3_Sub1_Sub2_Sub4_8.anInt2809 * local346] == 0) {
					if (local350 == 999) {
						local350 = local354;
					}
				} else if (local350 != 999) {
					local352 = local354;
					break;
				}
			}
			Static50.anIntArray161[local346] = local350;
			Static102.anIntArray310[local346] = local352 - local350;
		}
		for (local350 = 5; local350 < 156; local350++) {
			local352 = 999;
			local354 = 0;
			for (@Pc(417) int local417 = 25; local417 < 172; local417++) {
				if (Static79.aClass3_Sub1_Sub2_Sub4_8.aByteArray24[local417 + Static79.aClass3_Sub1_Sub2_Sub4_8.anInt2809 * local350] == 0 && (local417 > 34 || local350 > 34)) {
					if (local352 == 999) {
						local352 = local417;
					}
				} else if (local352 != 999) {
					local354 = local417;
					break;
				}
			}
			Static22.anIntArray91[local350 - 5] = local352 - 25;
			Static48.anIntArray153[local350 - 5] = local354 - local352;
		}
		Static63.aBoolean156 = true;
	}
}
