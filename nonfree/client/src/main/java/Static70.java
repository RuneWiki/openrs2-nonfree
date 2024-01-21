import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!m", name = "zb", descriptor = "Lclient!sd;")
	public static Class64 aClass64_2;

	@OriginalMember(owner = "client!m", name = "V", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!m", name = "cb", descriptor = "Lclient!se;")
	public static Class65 aClass65_38 = new Class65();

	@OriginalMember(owner = "client!m", name = "ob", descriptor = "I")
	public static int anInt1540 = 0;

	@OriginalMember(owner = "client!m", name = "Eb", descriptor = "Lclient!he;")
	public static Class26 aClass26_776 = Static6.method100(":");

	@OriginalMember(owner = "client!m", name = "Sb", descriptor = "Lclient!he;")
	public static Class26 aClass26_777 = Static6.method100(": ");

	@OriginalMember(owner = "client!m", name = "Tb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ef;ILclient!ef;Lclient!bf;Lclient!ef;)Z")
	public static boolean method971(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) Class3_Sub3_Sub1 arg2, @OriginalArg(4) Class16 arg3) {
		Static1.aClass3_Sub3_Sub1_1 = arg2;
		Static35.aClass16_53 = arg0;
		Static115.aClass16_139 = arg3;
		Static101.aClass16_125 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
	public static void method982() {
		aCRC32_2 = null;
		aClass64_2 = null;
		aClass26_777 = null;
		aClass26_776 = null;
		aClass65_38 = null;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(II)V")
	public static void method986(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static132.anIntArray411[arg0];
		@Pc(17) int local17 = Static67.anIntArray338[arg0];
		if (local13 >= 2000) {
			local13 -= 2000;
		}
		@Pc(27) int local27 = Static7.anIntArray16[arg0];
		@Pc(31) int local31 = Static64.anIntArray178[arg0];
		@Pc(40) Class3_Sub1_Sub5_Sub1_Sub1 local40;
		if (local13 == 57) {
			local40 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local40.anIntArray325[0], local40.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static49.anInt1587 = 2;
				Static93.anInt2538 = Static59.anInt1803;
				Static2.anInt18 = Static19.anInt514;
				Static17.anInt428 = 0;
				Static107.aClass3_Sub11_Sub1_3.method1029(180);
				Static107.aClass3_Sub11_Sub1_3.method972(local27);
			}
		}
		@Pc(95) Class3_Sub1_Sub5_Sub1_Sub2 local95;
		if (local13 == 47) {
			local95 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local27];
			if (local95 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local95.anIntArray325[0], local95.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static2.anInt18 = Static19.anInt514;
				Static49.anInt1587 = 2;
				Static93.anInt2538 = Static59.anInt1803;
				Static17.anInt428 = 0;
				Static107.aClass3_Sub11_Sub1_3.method1029(43);
				Static107.aClass3_Sub11_Sub1_3.method989(local27);
			}
		}
		if (local13 == 20) {
			Static107.aClass3_Sub11_Sub1_3.method1029(159);
			Static107.aClass3_Sub11_Sub1_3.method1009(local31);
			Static107.aClass3_Sub11_Sub1_3.method989(local17);
			Static107.aClass3_Sub11_Sub1_3.method989(local27);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 29) {
			Static107.aClass3_Sub11_Sub1_3.method1029(177);
			Static107.aClass3_Sub11_Sub1_3.method972(local27);
			Static107.aClass3_Sub11_Sub1_3.method976(local31);
			Static107.aClass3_Sub11_Sub1_3.method972(local17);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 4) {
			Static107.aClass3_Sub11_Sub1_3.method1029(4);
			Static107.aClass3_Sub11_Sub1_3.method1016(local17);
			Static107.aClass3_Sub11_Sub1_3.method972(local27);
			Static107.aClass3_Sub11_Sub1_3.method1009(local31);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 26) {
			local40 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local40.anIntArray325[0], local40.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static2.anInt18 = Static19.anInt514;
				Static49.anInt1587 = 2;
				Static93.anInt2538 = Static59.anInt1803;
				Static17.anInt428 = 0;
				Static107.aClass3_Sub11_Sub1_3.method1029(181);
				Static107.aClass3_Sub11_Sub1_3.method972(local27);
			}
		}
		if (local13 == 10 || local13 == 1006) {
			Static72.method1330(Static29.aClass26Array7[arg0], local27, local31, local17);
		}
		@Pc(327) Class3_Sub14 local327;
		if (local13 == 5) {
			local327 = Static89.method1642(local31, local17);
			if (local327 != null) {
				Static58.method1188();
				Static81.method1415(Static111.method2008(Static89.method1641(local327)), local31, local17);
				Static3.anInt89 = 0;
				Static132.aClass26_1815 = Static120.method2151(local327);
				if (Static132.aClass26_1815 == null) {
					Static132.aClass26_1815 = Static62.aClass26_935;
				}
				if (local327.aBoolean113) {
					Static8.aClass26_114 = Static119.method2136(new Class26[] { local327.aClass26_1114, Static41.aClass26_671 });
					return;
				}
				Static8.aClass26_114 = Static119.method2136(new Class26[] { Static80.aClass26_1120, local327.aClass26_1115, Static41.aClass26_671 });
			}
			return;
		}
		if (local13 == 3) {
			local95 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local27];
			if (local95 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local95.anIntArray325[0], local95.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static93.anInt2538 = Static59.anInt1803;
				Static17.anInt428 = 0;
				Static49.anInt1587 = 2;
				Static2.anInt18 = Static19.anInt514;
				Static107.aClass3_Sub11_Sub1_3.method1029(51);
				Static107.aClass3_Sub11_Sub1_3.method983(local27);
			}
		}
		if (local13 == 51) {
			Static2.method8();
		}
		if (local13 == 58) {
			local95 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local27];
			if (local95 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local95.anIntArray325[0], local95.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static49.anInt1587 = 2;
				Static93.anInt2538 = Static59.anInt1803;
				Static17.anInt428 = 0;
				Static2.anInt18 = Static19.anInt514;
				Static107.aClass3_Sub11_Sub1_3.method1029(129);
				Static107.aClass3_Sub11_Sub1_3.method989(local27);
			}
		}
		if (local13 == 1002) {
			local327 = Static100.method2212(local31);
			if (local327 == null || local327.anIntArray215[local17] < 100000) {
				Static107.aClass3_Sub11_Sub1_3.method1029(205);
				Static107.aClass3_Sub11_Sub1_3.method972(local27);
			} else {
				Static67.method1915(Static119.method2136(new Class26[] { Static122.method2170(local327.anIntArray215[local17]), Static3.aClass26_60, Static117.method2099(local27).aClass26_857 }), Static22.aClass26_415, 0);
			}
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 34) {
			local40 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local40.anIntArray325[0], local40.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static49.anInt1587 = 2;
				Static17.anInt428 = 0;
				Static93.anInt2538 = Static59.anInt1803;
				Static2.anInt18 = Static19.anInt514;
				Static107.aClass3_Sub11_Sub1_3.method1029(162);
				Static107.aClass3_Sub11_Sub1_3.method1016(local27);
			}
		}
		@Pc(669) boolean local669;
		if (local13 == 22) {
			local669 = Static100.method2209(0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 0, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			if (!local669) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			}
			Static49.anInt1587 = 2;
			Static2.anInt18 = Static19.anInt514;
			Static17.anInt428 = 0;
			Static93.anInt2538 = Static59.anInt1803;
			Static107.aClass3_Sub11_Sub1_3.method1029(20);
			Static107.aClass3_Sub11_Sub1_3.method989(local17 + Static10.anInt286);
			Static107.aClass3_Sub11_Sub1_3.method972(local27);
			Static107.aClass3_Sub11_Sub1_3.method989(Static56.anInt1700 + local31);
		}
		if (local13 == 1005) {
			Static2.anInt18 = Static19.anInt514;
			Static49.anInt1587 = 2;
			Static17.anInt428 = 0;
			Static93.anInt2538 = Static59.anInt1803;
			Static107.aClass3_Sub11_Sub1_3.method1029(97);
			Static107.aClass3_Sub11_Sub1_3.method983(local27 >> 14 & 0x7FFF);
		}
		if (local13 == 32) {
			local669 = Static100.method2209(0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 0, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			if (!local669) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			}
			Static49.anInt1587 = 2;
			Static2.anInt18 = Static19.anInt514;
			Static17.anInt428 = 0;
			Static93.anInt2538 = Static59.anInt1803;
			Static107.aClass3_Sub11_Sub1_3.method1029(216);
			Static107.aClass3_Sub11_Sub1_3.method972(local27);
			Static107.aClass3_Sub11_Sub1_3.method983(Static56.anInt1700 + local31);
			Static107.aClass3_Sub11_Sub1_3.method1016(Static10.anInt286 + local17);
		}
		if (local13 == 1) {
			local669 = Static100.method2209(0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 0, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			if (!local669) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			}
			Static93.anInt2538 = Static59.anInt1803;
			Static2.anInt18 = Static19.anInt514;
			Static49.anInt1587 = 2;
			Static17.anInt428 = 0;
			Static107.aClass3_Sub11_Sub1_3.method1029(144);
			Static107.aClass3_Sub11_Sub1_3.method972(local17 + Static10.anInt286);
			Static107.aClass3_Sub11_Sub1_3.method972(local27);
			Static107.aClass3_Sub11_Sub1_3.method983(local31 + Static56.anInt1700);
		}
		if (local13 == 6) {
			local669 = Static100.method2209(0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 0, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			if (!local669) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			}
			Static2.anInt18 = Static19.anInt514;
			Static93.anInt2538 = Static59.anInt1803;
			Static17.anInt428 = 0;
			Static49.anInt1587 = 2;
			Static107.aClass3_Sub11_Sub1_3.method1029(255);
			Static107.aClass3_Sub11_Sub1_3.method972(local27);
			Static107.aClass3_Sub11_Sub1_3.method989(Static10.anInt286 + local17);
			Static107.aClass3_Sub11_Sub1_3.method972(Static56.anInt1700 + local31);
		}
		if (local13 == 50) {
			Static58.method1188();
			local327 = Static100.method2212(local31);
			Static57.anInt1724 = local27;
			Static93.anInt2530 = local31;
			Static67.anInt2802 = local17;
			Static3.anInt89 = 1;
			Static110.method2004(local327);
			Static102.aClass26_1505 = Static119.method2136(new Class26[] { Static102.aClass26_1501, Static117.method2099(local27).aClass26_857, Static41.aClass26_671 });
			if (Static102.aClass26_1505 == null) {
				Static102.aClass26_1505 = Static119.aClass26_1692;
			}
			return;
		}
		if (local13 == 12) {
			Static40.method782(local27, local31, local17);
			Static107.aClass3_Sub11_Sub1_3.method1029(44);
			Static107.aClass3_Sub11_Sub1_3.method989(local27 >> 14 & 0x7FFF);
			Static107.aClass3_Sub11_Sub1_3.method972(Static10.anInt286 + local17);
			Static107.aClass3_Sub11_Sub1_3.method989(Static56.anInt1700 + local31);
		}
		if (local13 == 28) {
			Static107.aClass3_Sub11_Sub1_3.method1029(215);
			Static107.aClass3_Sub11_Sub1_3.method989(local17);
			Static107.aClass3_Sub11_Sub1_3.method1009(local31);
			Static107.aClass3_Sub11_Sub1_3.method989(local27);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 35) {
			Static62.aClass69_1.method2055(Static132.anInt3270, local17, local31);
		}
		if (local13 == 1003) {
			Static40.method782(local27, local31, local17);
			Static107.aClass3_Sub11_Sub1_3.method1029(250);
			Static107.aClass3_Sub11_Sub1_3.method983(local31 + Static56.anInt1700);
			Static107.aClass3_Sub11_Sub1_3.method972(local27 >> 14 & 0x7FFF);
			Static107.aClass3_Sub11_Sub1_3.method972(local17 + Static10.anInt286);
		}
		if (local13 == 38) {
			local95 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local27];
			if (local95 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local95.anIntArray325[0], local95.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static2.anInt18 = Static19.anInt514;
				Static17.anInt428 = 0;
				Static49.anInt1587 = 2;
				Static93.anInt2538 = Static59.anInt1803;
				Static107.aClass3_Sub11_Sub1_3.method1029(69);
				Static107.aClass3_Sub11_Sub1_3.method972(Static72.anInt2055);
				Static107.aClass3_Sub11_Sub1_3.method1001(Static100.anInt3233);
				Static107.aClass3_Sub11_Sub1_3.method972(local27);
			}
		}
		if (local13 == 42) {
			local669 = Static100.method2209(0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 0, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			if (!local669) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			}
			Static49.anInt1587 = 2;
			Static93.anInt2538 = Static59.anInt1803;
			Static2.anInt18 = Static19.anInt514;
			Static17.anInt428 = 0;
			Static107.aClass3_Sub11_Sub1_3.method1029(221);
			Static107.aClass3_Sub11_Sub1_3.method989(local27);
			Static107.aClass3_Sub11_Sub1_3.method989(Static56.anInt1700 + local31);
			Static107.aClass3_Sub11_Sub1_3.method1016(Static10.anInt286 + local17);
		}
		if (local13 == 14) {
			Static40.method782(local27, local31, local17);
			Static107.aClass3_Sub11_Sub1_3.method1029(120);
			Static107.aClass3_Sub11_Sub1_3.method972(local31 + Static56.anInt1700);
			Static107.aClass3_Sub11_Sub1_3.method983(local27 >> 14 & 0x7FFF);
			Static107.aClass3_Sub11_Sub1_3.method983(local17 + Static10.anInt286);
		}
		if (local13 == 30) {
			local40 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local40.anIntArray325[0], local40.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static49.anInt1587 = 2;
				Static2.anInt18 = Static19.anInt514;
				Static93.anInt2538 = Static59.anInt1803;
				Static17.anInt428 = 0;
				Static107.aClass3_Sub11_Sub1_3.method1029(27);
				Static107.aClass3_Sub11_Sub1_3.method1016(Static57.anInt1724);
				Static107.aClass3_Sub11_Sub1_3.method989(local27);
				Static107.aClass3_Sub11_Sub1_3.method972(Static67.anInt2802);
				Static107.aClass3_Sub11_Sub1_3.method1009(Static93.anInt2530);
			}
		}
		if (local13 == 39) {
			Static107.aClass3_Sub11_Sub1_3.method1029(88);
			Static107.aClass3_Sub11_Sub1_3.method1009(local31);
			Static107.aClass3_Sub11_Sub1_3.method989(local27);
			Static107.aClass3_Sub11_Sub1_3.method1016(local17);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 41) {
			Static107.aClass3_Sub11_Sub1_3.method1029(212);
			Static107.aClass3_Sub11_Sub1_3.method976(local31);
			Static107.aClass3_Sub11_Sub1_3.method1016(local17);
			Static107.aClass3_Sub11_Sub1_3.method989(local27);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		@Pc(1527) int local1527;
		if (local13 == 33) {
			Static107.aClass3_Sub11_Sub1_3.method1029(153);
			Static107.aClass3_Sub11_Sub1_3.method1001(local31);
			local327 = Static100.method2212(local31);
			if (local327.anIntArrayArray18 != null && local327.anIntArrayArray18[0][0] == 5) {
				local1527 = local327.anIntArrayArray18[0][1];
				if (Static52.anIntArray159[local1527] != local327.anIntArray212[0]) {
					Static52.anIntArray159[local1527] = local327.anIntArray212[0];
					Static4.method77(local1527);
				}
			}
		}
		if (local13 == 9) {
			local669 = Static100.method2209(0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 0, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			if (!local669) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			}
			Static17.anInt428 = 0;
			Static49.anInt1587 = 2;
			Static2.anInt18 = Static19.anInt514;
			Static93.anInt2538 = Static59.anInt1803;
			Static107.aClass3_Sub11_Sub1_3.method1029(152);
			Static107.aClass3_Sub11_Sub1_3.method1001(Static93.anInt2530);
			Static107.aClass3_Sub11_Sub1_3.method983(local17 + Static10.anInt286);
			Static107.aClass3_Sub11_Sub1_3.method1016(Static67.anInt2802);
			Static107.aClass3_Sub11_Sub1_3.method1016(local27);
			Static107.aClass3_Sub11_Sub1_3.method983(Static57.anInt1724);
			Static107.aClass3_Sub11_Sub1_3.method972(Static56.anInt1700 + local31);
		}
		if (local13 == 7) {
			local40 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local40.anIntArray325[0], local40.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static17.anInt428 = 0;
				Static93.anInt2538 = Static59.anInt1803;
				Static2.anInt18 = Static19.anInt514;
				Static49.anInt1587 = 2;
				Static107.aClass3_Sub11_Sub1_3.method1029(123);
				Static107.aClass3_Sub11_Sub1_3.method989(Static72.anInt2055);
				Static107.aClass3_Sub11_Sub1_3.method1016(local27);
				Static107.aClass3_Sub11_Sub1_3.method1009(Static100.anInt3233);
			}
		}
		if (local13 == 21) {
			Static107.aClass3_Sub11_Sub1_3.method1029(86);
			Static107.aClass3_Sub11_Sub1_3.method989(local17);
			Static107.aClass3_Sub11_Sub1_3.method972(local27);
			Static107.aClass3_Sub11_Sub1_3.method995(local31);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 15 && Static40.method782(local27, local31, local17)) {
			Static107.aClass3_Sub11_Sub1_3.method1029(103);
			Static107.aClass3_Sub11_Sub1_3.method983(Static56.anInt1700 + local31);
			Static107.aClass3_Sub11_Sub1_3.method972(Static67.anInt2802);
			Static107.aClass3_Sub11_Sub1_3.method1016(local17 + Static10.anInt286);
			Static107.aClass3_Sub11_Sub1_3.method995(Static93.anInt2530);
			Static107.aClass3_Sub11_Sub1_3.method983(Static57.anInt1724);
			Static107.aClass3_Sub11_Sub1_3.method989(local27 >> 14 & 0x7FFF);
		}
		if (local13 == 1001) {
			Static2.anInt18 = Static19.anInt514;
			Static49.anInt1587 = 2;
			Static93.anInt2538 = Static59.anInt1803;
			Static17.anInt428 = 0;
			Static107.aClass3_Sub11_Sub1_3.method1029(205);
			Static107.aClass3_Sub11_Sub1_3.method972(local27);
		}
		if (local13 == 44) {
			local95 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local27];
			if (local95 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local95.anIntArray325[0], local95.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static2.anInt18 = Static19.anInt514;
				Static17.anInt428 = 0;
				Static49.anInt1587 = 2;
				Static93.anInt2538 = Static59.anInt1803;
				Static107.aClass3_Sub11_Sub1_3.method1029(19);
				Static107.aClass3_Sub11_Sub1_3.method1016(local27);
			}
		}
		if (local13 == 8) {
			Static107.aClass3_Sub11_Sub1_3.method1029(153);
			Static107.aClass3_Sub11_Sub1_3.method1001(local31);
			local327 = Static100.method2212(local31);
			if (local327.anIntArrayArray18 != null && local327.anIntArrayArray18[0][0] == 5) {
				local1527 = local327.anIntArrayArray18[0][1];
				Static52.anIntArray159[local1527] = 1 - Static52.anIntArray159[local1527];
				Static4.method77(local1527);
			}
		}
		if (local13 == 19 && Static79.aClass3_Sub14_8 == null) {
			Static126.method2197(local17, local31);
			Static79.aClass3_Sub14_8 = Static89.method1642(local31, local17);
			Static110.method2004(Static79.aClass3_Sub14_8);
		}
		if (local13 == 49) {
			Static107.aClass3_Sub11_Sub1_3.method1029(142);
			Static107.aClass3_Sub11_Sub1_3.method972(Static72.anInt2055);
			Static107.aClass3_Sub11_Sub1_3.method976(local31);
			Static107.aClass3_Sub11_Sub1_3.method976(Static100.anInt3233);
			Static107.aClass3_Sub11_Sub1_3.method972(local17);
		}
		if (local13 == 11) {
			local669 = Static100.method2209(0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 0, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			if (!local669) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31, local17, 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
			}
			Static17.anInt428 = 0;
			Static93.anInt2538 = Static59.anInt1803;
			Static2.anInt18 = Static19.anInt514;
			Static49.anInt1587 = 2;
			Static107.aClass3_Sub11_Sub1_3.method1029(63);
			Static107.aClass3_Sub11_Sub1_3.method983(Static72.anInt2055);
			Static107.aClass3_Sub11_Sub1_3.method1001(Static100.anInt3233);
			Static107.aClass3_Sub11_Sub1_3.method989(local31 + Static56.anInt1700);
			Static107.aClass3_Sub11_Sub1_3.method983(Static10.anInt286 + local17);
			Static107.aClass3_Sub11_Sub1_3.method972(local27);
		}
		if (local13 == 25 && Static40.method782(local27, local31, local17)) {
			Static107.aClass3_Sub11_Sub1_3.method1029(207);
			Static107.aClass3_Sub11_Sub1_3.method1016(local31 + Static56.anInt1700);
			Static107.aClass3_Sub11_Sub1_3.method1016(Static10.anInt286 + local17);
			Static107.aClass3_Sub11_Sub1_3.method1009(Static100.anInt3233);
			Static107.aClass3_Sub11_Sub1_3.method972(local27 >> 14 & 0x7FFF);
			Static107.aClass3_Sub11_Sub1_3.method989(Static72.anInt2055);
		}
		if (local13 == 31) {
			Static107.aClass3_Sub11_Sub1_3.method1029(220);
			Static107.aClass3_Sub11_Sub1_3.method983(local27);
			Static107.aClass3_Sub11_Sub1_3.method989(local17);
			Static107.aClass3_Sub11_Sub1_3.method1001(local31);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 23) {
			Static107.aClass3_Sub11_Sub1_3.method1029(166);
			Static107.aClass3_Sub11_Sub1_3.method989(Static67.anInt2802);
			Static107.aClass3_Sub11_Sub1_3.method972(local17);
			Static107.aClass3_Sub11_Sub1_3.method1016(local27);
			Static107.aClass3_Sub11_Sub1_3.method995(Static93.anInt2530);
			Static107.aClass3_Sub11_Sub1_3.method1009(local31);
			Static107.aClass3_Sub11_Sub1_3.method983(Static57.anInt1724);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 16) {
			local40 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local40.anIntArray325[0], local40.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static17.anInt428 = 0;
				Static49.anInt1587 = 2;
				Static93.anInt2538 = Static59.anInt1803;
				Static2.anInt18 = Static19.anInt514;
				Static107.aClass3_Sub11_Sub1_3.method1029(114);
				Static107.aClass3_Sub11_Sub1_3.method972(local27);
			}
		}
		if (local13 == 37) {
			Static107.aClass3_Sub11_Sub1_3.method1029(101);
			Static107.aClass3_Sub11_Sub1_3.method976(local31);
			Static107.aClass3_Sub11_Sub1_3.method989(local17);
			Static107.aClass3_Sub11_Sub1_3.method989(local27);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 45) {
			Static107.aClass3_Sub11_Sub1_3.method1029(247);
			Static107.aClass3_Sub11_Sub1_3.method995(local31);
			Static107.aClass3_Sub11_Sub1_3.method983(local27);
			Static107.aClass3_Sub11_Sub1_3.method989(local17);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 24) {
			local327 = Static100.method2212(local31);
			@Pc(2329) boolean local2329 = true;
			if (local327.anInt2186 > 0) {
				local2329 = Static5.method2202(local327);
			}
			if (local2329) {
				Static107.aClass3_Sub11_Sub1_3.method1029(153);
				Static107.aClass3_Sub11_Sub1_3.method1001(local31);
			}
		}
		if (local13 == 48) {
			local40 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local40.anIntArray325[0], local40.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static2.anInt18 = Static19.anInt514;
				Static17.anInt428 = 0;
				Static93.anInt2538 = Static59.anInt1803;
				Static49.anInt1587 = 2;
				Static107.aClass3_Sub11_Sub1_3.method1029(117);
				Static107.aClass3_Sub11_Sub1_3.method983(local27);
			}
		}
		if (local13 == 17) {
			local40 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local40.anIntArray325[0], local40.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static49.anInt1587 = 2;
				Static2.anInt18 = Static19.anInt514;
				Static93.anInt2538 = Static59.anInt1803;
				Static17.anInt428 = 0;
				Static107.aClass3_Sub11_Sub1_3.method1029(183);
				Static107.aClass3_Sub11_Sub1_3.method1016(local27);
			}
		}
		if (local13 == 40) {
			Static107.aClass3_Sub11_Sub1_3.method1029(163);
			Static107.aClass3_Sub11_Sub1_3.method1016(local27);
			Static107.aClass3_Sub11_Sub1_3.method989(local17);
			Static107.aClass3_Sub11_Sub1_3.method1016(Static72.anInt2055);
			Static107.aClass3_Sub11_Sub1_3.method995(local31);
			Static107.aClass3_Sub11_Sub1_3.method1009(Static100.anInt3233);
			Static29.anInt1008 = 0;
			Static74.aClass3_Sub14_7 = Static100.method2212(local31);
			Static62.anInt1894 = local17;
		}
		if (local13 == 18) {
			local40 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local40.anIntArray325[0], local40.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static49.anInt1587 = 2;
				Static17.anInt428 = 0;
				Static93.anInt2538 = Static59.anInt1803;
				Static2.anInt18 = Static19.anInt514;
				Static107.aClass3_Sub11_Sub1_3.method1029(1);
				Static107.aClass3_Sub11_Sub1_3.method983(local27);
			}
		}
		if (local13 == 46) {
			local95 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local27];
			if (local95 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local95.anIntArray325[0], local95.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static17.anInt428 = 0;
				Static49.anInt1587 = 2;
				Static93.anInt2538 = Static59.anInt1803;
				Static2.anInt18 = Static19.anInt514;
				Static107.aClass3_Sub11_Sub1_3.method1029(187);
				Static107.aClass3_Sub11_Sub1_3.method1001(Static93.anInt2530);
				Static107.aClass3_Sub11_Sub1_3.method983(local27);
				Static107.aClass3_Sub11_Sub1_3.method972(Static57.anInt1724);
				Static107.aClass3_Sub11_Sub1_3.method972(Static67.anInt2802);
			}
		}
		if (local13 == 1004) {
			Static2.anInt18 = Static19.anInt514;
			Static93.anInt2538 = Static59.anInt1803;
			Static17.anInt428 = 0;
			Static49.anInt1587 = 2;
			local95 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local27];
			if (local95 != null) {
				@Pc(2655) Class3_Sub1_Sub3 local2655 = local95.aClass3_Sub1_Sub3_1;
				if (local2655.anIntArray27 != null) {
					local2655 = local2655.method140();
				}
				if (local2655 != null) {
					Static107.aClass3_Sub11_Sub1_3.method1029(176);
					Static107.aClass3_Sub11_Sub1_3.method1016(local2655.anInt245);
				}
			}
		}
		if (local13 == 43) {
			local95 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local27];
			if (local95 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local95.anIntArray325[0], local95.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static2.anInt18 = Static19.anInt514;
				Static49.anInt1587 = 2;
				Static93.anInt2538 = Static59.anInt1803;
				Static17.anInt428 = 0;
				Static107.aClass3_Sub11_Sub1_3.method1029(156);
				Static107.aClass3_Sub11_Sub1_3.method983(local27);
			}
		}
		if (local13 == 2) {
			local40 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local40.anIntArray325[0], local40.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				Static17.anInt428 = 0;
				Static49.anInt1587 = 2;
				Static2.anInt18 = Static19.anInt514;
				Static93.anInt2538 = Static59.anInt1803;
				Static107.aClass3_Sub11_Sub1_3.method1029(84);
				Static107.aClass3_Sub11_Sub1_3.method972(local27);
			}
		}
		if (local13 == 36) {
			Static40.method782(local27, local31, local17);
			Static107.aClass3_Sub11_Sub1_3.method1029(119);
			Static107.aClass3_Sub11_Sub1_3.method972(Static10.anInt286 + local17);
			Static107.aClass3_Sub11_Sub1_3.method1016(local27 >> 14 & 0x7FFF);
			Static107.aClass3_Sub11_Sub1_3.method1016(local31 + Static56.anInt1700);
		}
		if (local13 == 13) {
			Static40.method782(local27, local31, local17);
			Static107.aClass3_Sub11_Sub1_3.method1029(127);
			Static107.aClass3_Sub11_Sub1_3.method983(local27 >> 14 & 0x7FFF);
			Static107.aClass3_Sub11_Sub1_3.method983(local31 + Static56.anInt1700);
			Static107.aClass3_Sub11_Sub1_3.method989(local17 + Static10.anInt286);
		}
		if (Static3.anInt89 != 0) {
			Static3.anInt89 = 0;
			Static110.method2004(Static100.method2212(Static93.anInt2530));
		}
		if (Static117.aBoolean169) {
			Static58.method1188();
		}
		if (Static74.aClass3_Sub14_7 != null && Static29.anInt1008 == 0) {
			Static110.method2004(Static74.aClass3_Sub14_7);
		}
	}

	@OriginalMember(owner = "client!m", name = "k", descriptor = "(B)V")
	public static void method1011() {
		while (true) {
			if (Static33.aClass3_Sub11_Sub1_2.method1027(Static104.anInt2841) >= 11) {
				@Pc(16) int local16 = Static33.aClass3_Sub11_Sub1_2.method1031(11);
				if (local16 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local16] == null) {
						local23 = true;
						Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local16] = new Class3_Sub1_Sub5_Sub1_Sub1();
						if (Static40.aClass3_Sub11Array1[local16] != null) {
							Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local16].method477(Static40.aClass3_Sub11Array1[local16]);
						}
					}
					Static117.anIntArray370[Static62.anInt1885++] = local16;
					@Pc(59) Class3_Sub1_Sub5_Sub1_Sub1 local59 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local16];
					local59.anInt2722 = Static4.anInt136;
					@Pc(67) int local67 = Static33.aClass3_Sub11_Sub1_2.method1031(5);
					if (local67 > 15) {
						local67 -= 32;
					}
					@Pc(80) int local80 = Static55.anIntArray165[Static33.aClass3_Sub11_Sub1_2.method1031(3)];
					if (local23) {
						local59.anInt2691 = local59.anInt2692 = local80;
					}
					@Pc(93) int local93 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
					@Pc(98) int local98 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
					if (local98 == 1) {
						Static76.anIntArray206[Static19.anInt512++] = local16;
					}
					@Pc(116) int local116 = Static33.aClass3_Sub11_Sub1_2.method1031(5);
					if (local116 > 15) {
						local116 -= 32;
					}
					local59.method1881(Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0] + local116, local93 == 1, local67 + Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0]);
					continue;
				}
			}
			Static33.aClass3_Sub11_Sub1_2.method1039();
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!ac;IIIIIIILclient!td;)V")
	public static void method1022(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class69 arg8) {
		@Pc(13) int local13 = Static117.anIntArrayArrayArray6[arg5][arg7][arg2];
		@Pc(23) int local23 = Static117.anIntArrayArrayArray6[arg5][arg7 + 1][arg2];
		@Pc(35) int local35 = Static117.anIntArrayArrayArray6[arg5][arg7 + 1][arg2 + 1];
		@Pc(45) int local45 = Static117.anIntArrayArrayArray6[arg5][arg7][arg2 + 1];
		@Pc(49) Class3_Sub1_Sub1 local49 = Static4.method68(arg4);
		@Pc(61) int local61 = (arg2 << 7) + arg7 + (arg4 << 14) + 1073741824;
		if (local49.anInt87 == 0) {
			local61 += Integer.MIN_VALUE;
		}
		@Pc(82) int local82 = local45 + local35 + local13 + local23 >> 2;
		@Pc(88) int local88 = (arg0 << 6) + arg6;
		if (local49.anInt98 == 1) {
			local88 += 256;
		}
		@Pc(121) Class3_Sub1_Sub5 local121;
		if (arg6 == 22) {
			if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
				local121 = local49.method49(local23, 22, arg0, local35, local45, local13);
			} else {
				local121 = new Class3_Sub1_Sub5_Sub6(arg4, 22, arg0, local13, local23, local35, local45, local49.anInt75, true, null);
			}
			arg8.method2050(arg3, arg7, arg2, local82, local121, local61, local88);
			if (local49.anInt93 == 1) {
				arg1.method67(arg2, arg7);
			}
			return;
		}
		@Pc(209) int local209;
		if (arg6 == 10 || arg6 == 11) {
			if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
				local121 = local49.method49(local23, 10, arg0, local35, local45, local13);
			} else {
				local121 = new Class3_Sub1_Sub5_Sub6(arg4, 10, arg0, local13, local23, local35, local45, local49.anInt75, true, null);
			}
			if (local121 != null) {
				@Pc(212) int local212;
				if (arg0 == 1 || arg0 == 3) {
					local209 = local49.anInt96;
					local212 = local49.anInt86;
				} else {
					local209 = local49.anInt86;
					local212 = local49.anInt96;
				}
				@Pc(222) int local222 = 0;
				if (arg6 == 11) {
					local222 += 256;
				}
				arg8.method2045(arg3, arg7, arg2, local82, local209, local212, local121, local222, local61, local88);
			}
			if (local49.anInt93 != 0) {
				arg1.method72(arg2, local49.aBoolean6, local49.anInt96, arg0, local49.anInt86, arg7);
			}
		} else if (arg6 >= 12) {
			if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
				local121 = local49.method49(local23, arg6, arg0, local35, local45, local13);
			} else {
				local121 = new Class3_Sub1_Sub5_Sub6(arg4, arg6, arg0, local13, local23, local35, local45, local49.anInt75, true, null);
			}
			arg8.method2045(arg3, arg7, arg2, local82, 1, 1, local121, 0, local61, local88);
			if (local49.anInt93 != 0) {
				arg1.method72(arg2, local49.aBoolean6, local49.anInt96, arg0, local49.anInt86, arg7);
			}
		} else if (arg6 == 0) {
			if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
				local121 = local49.method49(local23, 0, arg0, local35, local45, local13);
			} else {
				local121 = new Class3_Sub1_Sub5_Sub6(arg4, 0, arg0, local13, local23, local35, local45, local49.anInt75, true, null);
			}
			arg8.method2029(arg3, arg7, arg2, local82, local121, null, Static9.anIntArray26[arg0], 0, local61, local88);
			if (local49.anInt93 != 0) {
				arg1.method64(local49.aBoolean6, arg6, arg0, arg7, arg2);
			}
		} else if (arg6 == 1) {
			if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
				local121 = local49.method49(local23, 1, arg0, local35, local45, local13);
			} else {
				local121 = new Class3_Sub1_Sub5_Sub6(arg4, 1, arg0, local13, local23, local35, local45, local49.anInt75, true, null);
			}
			arg8.method2029(arg3, arg7, arg2, local82, local121, null, Static72.anIntArray197[arg0], 0, local61, local88);
			if (local49.anInt93 != 0) {
				arg1.method64(local49.aBoolean6, arg6, arg0, arg7, arg2);
			}
		} else {
			@Pc(474) int local474;
			@Pc(513) Class3_Sub1_Sub5 local513;
			if (arg6 == 2) {
				local474 = arg0 + 1 & 0x3;
				@Pc(498) Class3_Sub1_Sub5 local498;
				if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
					local498 = local49.method49(local23, 2, arg0 + 4, local35, local45, local13);
					local513 = local49.method49(local23, 2, local474, local35, local45, local13);
				} else {
					local498 = new Class3_Sub1_Sub5_Sub6(arg4, 2, arg0 + 4, local13, local23, local35, local45, local49.anInt75, true, null);
					local513 = new Class3_Sub1_Sub5_Sub6(arg4, 2, local474, local13, local23, local35, local45, local49.anInt75, true, null);
				}
				arg8.method2029(arg3, arg7, arg2, local82, local498, local513, Static9.anIntArray26[arg0], Static9.anIntArray26[local474], local61, local88);
				if (local49.anInt93 != 0) {
					arg1.method64(local49.aBoolean6, arg6, arg0, arg7, arg2);
				}
			} else if (arg6 == 3) {
				if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
					local121 = local49.method49(local23, 3, arg0, local35, local45, local13);
				} else {
					local121 = new Class3_Sub1_Sub5_Sub6(arg4, 3, arg0, local13, local23, local35, local45, local49.anInt75, true, null);
				}
				arg8.method2029(arg3, arg7, arg2, local82, local121, null, Static72.anIntArray197[arg0], 0, local61, local88);
				if (local49.anInt93 != 0) {
					arg1.method64(local49.aBoolean6, arg6, arg0, arg7, arg2);
				}
			} else if (arg6 == 9) {
				if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
					local121 = local49.method49(local23, arg6, arg0, local35, local45, local13);
				} else {
					local121 = new Class3_Sub1_Sub5_Sub6(arg4, arg6, arg0, local13, local23, local35, local45, local49.anInt75, true, null);
				}
				arg8.method2045(arg3, arg7, arg2, local82, 1, 1, local121, 0, local61, local88);
				if (local49.anInt93 != 0) {
					arg1.method72(arg2, local49.aBoolean6, local49.anInt96, arg0, local49.anInt86, arg7);
				}
			} else {
				if (local49.aBoolean5) {
					if (arg0 == 1) {
						local474 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local13;
						local13 = local474;
					} else if (arg0 == 2) {
						local474 = local45;
						local45 = local23;
						local23 = local474;
						local474 = local35;
						local35 = local13;
						local13 = local474;
					} else if (arg0 == 3) {
						local474 = local45;
						local45 = local13;
						local13 = local23;
						local23 = local35;
						local35 = local474;
					}
				}
				if (arg6 == 4) {
					if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
						local121 = local49.method49(local23, 4, 0, local35, local45, local13);
					} else {
						local121 = new Class3_Sub1_Sub5_Sub6(arg4, 4, 0, local13, local23, local35, local45, local49.anInt75, true, null);
					}
					arg8.method2039(arg3, arg7, arg2, local82, local121, Static9.anIntArray26[arg0], arg0 * 512, 0, 0, local61, local88);
				} else if (arg6 == 5) {
					local474 = 16;
					local209 = arg8.method2042(arg3, arg7, arg2);
					if (local209 != 0) {
						local474 = Static4.method68(local209 >> 14 & 0x7FFF).anInt101;
					}
					if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
						local513 = local49.method49(local23, 4, 0, local35, local45, local13);
					} else {
						local513 = new Class3_Sub1_Sub5_Sub6(arg4, 4, 0, local13, local23, local35, local45, local49.anInt75, true, null);
					}
					arg8.method2039(arg3, arg7, arg2, local82, local513, Static9.anIntArray26[arg0], arg0 * 512, local474 * Static40.anIntArray135[arg0], local474 * Static10.anIntArray32[arg0], local61, local88);
				} else if (arg6 == 6) {
					if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
						local121 = local49.method49(local23, 4, 0, local35, local45, local13);
					} else {
						local121 = new Class3_Sub1_Sub5_Sub6(arg4, 4, 0, local13, local23, local35, local45, local49.anInt75, true, null);
					}
					arg8.method2039(arg3, arg7, arg2, local82, local121, 256, arg0, 0, 0, local61, local88);
				} else if (arg6 == 7) {
					if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
						local121 = local49.method49(local23, 4, 0, local35, local45, local13);
					} else {
						local121 = new Class3_Sub1_Sub5_Sub6(arg4, 4, 0, local13, local23, local35, local45, local49.anInt75, true, null);
					}
					arg8.method2039(arg3, arg7, arg2, local82, local121, 512, arg0, 0, 0, local61, local88);
				} else if (arg6 == 8) {
					if (local49.anInt75 == -1 && local49.anIntArray9 == null) {
						local121 = local49.method49(local23, 4, 0, local35, local45, local13);
					} else {
						local121 = new Class3_Sub1_Sub5_Sub6(arg4, 4, 0, local13, local23, local35, local45, local49.anInt75, true, null);
					}
					arg8.method2039(arg3, arg7, arg2, local82, local121, 768, arg0, 0, 0, local61, local88);
				}
			}
		}
	}
}
