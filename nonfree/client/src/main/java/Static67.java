import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_12;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	public static int anInt1693 = 0;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "Lclient!ja;")
	public static Class39 aClass39_892 = Static28.method504("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "Lclient!ja;")
	public static Class39 aClass39_893 = Static28.method504("Hidden)2");

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "Lclient!ja;")
	public static Class39 aClass39_894 = Static28.method504("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "Lclient!ja;")
	public static Class39 aClass39_895 = Static28.method504("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!pd;Lclient!pd;ZLclient!ad;Lclient!pd;)Z")
	public static boolean method1163(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) Class4_Sub1_Sub1 arg2, @OriginalArg(4) Class20 arg3) {
		Static40.aClass20_24 = arg0;
		Static73.aClass20_36 = arg1;
		Static80.aClass4_Sub1_Sub1_2 = arg2;
		Static85.aClass20_43 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIILclient!pd;)[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] method1164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class20 arg2) {
		return Static55.method977(arg1, arg0, arg2) ? Static115.method2014() : null;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public static void method1165() {
		aClass39_893 = null;
		aClass39_892 = null;
		aClass39_894 = null;
		aClass39_895 = null;
		aClass20_Sub1_12 = null;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V")
	public static void method1166(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static10.anIntArray36[arg0];
		@Pc(14) int local14 = Static125.anIntArray358[arg0];
		@Pc(18) int local18 = Static49.anIntArray136[arg0];
		@Pc(22) int local22 = Static104.anIntArray287[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		@Pc(35) Class4_Sub5 local35;
		if (local14 == 1) {
			Static1.method4();
			local35 = Static54.method949(local18);
			Static59.anInt1555 = 1;
			Static36.anInt911 = local10;
			Static31.anInt818 = local18;
			Static42.anInt1068 = local22;
			Static19.method344(local35);
			Static52.aClass39_764 = Static62.method1123(new Class39[] { Static104.aClass39_1337, Static119.method2166(local22).aClass39_352, Static127.aClass39_1758 });
			if (Static52.aClass39_764 == null) {
				Static52.aClass39_764 = Static99.aClass39_1290;
			}
			return;
		}
		@Pc(112) int local112;
		if (local14 == 47) {
			Static114.aClass4_Sub16_Sub1_3.method1499(124);
			Static114.aClass4_Sub16_Sub1_3.method1489(local18);
			local35 = Static54.method949(local18);
			if (local35.anIntArrayArray8 != null && local35.anIntArrayArray8[0][0] == 5) {
				local112 = local35.anIntArrayArray8[0][1];
				if (local35.anIntArray124[0] != Static22.anIntArray64[local112]) {
					Static22.anIntArray64[local112] = local35.anIntArray124[0];
					Static20.method383(local112);
				}
			}
		}
		@Pc(139) Class4_Sub2_Sub1_Sub1_Sub1 local139;
		if (local14 == 3) {
			local139 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local22];
			if (local139 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local139.anIntArray296[0], local139.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				Static85.anInt2127 = 0;
				anInt1693 = 2;
				Static84.anInt2111 = Static1.anInt9;
				Static59.anInt1568 = Static27.anInt741;
				Static114.aClass4_Sub16_Sub1_3.method1499(88);
				Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			}
		}
		if (local14 == 1006) {
			Static59.anInt1568 = Static27.anInt741;
			anInt1693 = 2;
			Static84.anInt2111 = Static1.anInt9;
			Static85.anInt2127 = 0;
			Static114.aClass4_Sub16_Sub1_3.method1499(1);
			Static114.aClass4_Sub16_Sub1_3.method1473(local22 >> 14 & 0x7FFF);
		}
		@Pc(225) Class4_Sub2_Sub1_Sub1_Sub2 local225;
		if (local14 == 34) {
			local225 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local22];
			if (local225 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local225.anIntArray296[0], local225.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				anInt1693 = 2;
				Static85.anInt2127 = 0;
				Static84.anInt2111 = Static1.anInt9;
				Static59.anInt1568 = Static27.anInt741;
				Static114.aClass4_Sub16_Sub1_3.method1499(79);
				Static114.aClass4_Sub16_Sub1_3.method1473(local22);
				Static114.aClass4_Sub16_Sub1_3.method1451(Static31.anInt818);
				Static114.aClass4_Sub16_Sub1_3.method1488(Static42.anInt1068);
				Static114.aClass4_Sub16_Sub1_3.method1441(Static36.anInt911);
			}
		}
		if (local14 == 1002) {
			Static84.anInt2111 = Static1.anInt9;
			Static59.anInt1568 = Static27.anInt741;
			Static85.anInt2127 = 0;
			anInt1693 = 2;
			Static114.aClass4_Sub16_Sub1_3.method1499(237);
			Static114.aClass4_Sub16_Sub1_3.method1441(local22);
		}
		if (local14 == 41) {
			local225 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local22];
			if (local225 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local225.anIntArray296[0], local225.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				anInt1693 = 2;
				Static59.anInt1568 = Static27.anInt741;
				Static85.anInt2127 = 0;
				Static84.anInt2111 = Static1.anInt9;
				Static114.aClass4_Sub16_Sub1_3.method1499(206);
				Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			}
		}
		@Pc(392) boolean local392;
		if (local14 == 49) {
			local392 = Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 0, 0);
			if (!local392) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
			}
			Static85.anInt2127 = 0;
			Static84.anInt2111 = Static1.anInt9;
			Static59.anInt1568 = Static27.anInt741;
			anInt1693 = 2;
			Static114.aClass4_Sub16_Sub1_3.method1499(75);
			Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			Static114.aClass4_Sub16_Sub1_3.method1441(local10 + Static36.anInt909);
			Static114.aClass4_Sub16_Sub1_3.method1473(local18 + Static24.anInt503);
		}
		if (local14 == 24) {
			local139 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local22];
			if (local139 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local139.anIntArray296[0], local139.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				Static84.anInt2111 = Static1.anInt9;
				anInt1693 = 2;
				Static59.anInt1568 = Static27.anInt741;
				Static85.anInt2127 = 0;
				Static114.aClass4_Sub16_Sub1_3.method1499(64);
				Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			}
		}
		if (local14 == 26) {
			Static114.aClass4_Sub16_Sub1_3.method1499(136);
			Static114.aClass4_Sub16_Sub1_3.method1473(local10);
			Static114.aClass4_Sub16_Sub1_3.method1468(local18);
			Static114.aClass4_Sub16_Sub1_3.method1488(local22);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 43) {
			Static114.aClass4_Sub16_Sub1_3.method1499(106);
			Static114.aClass4_Sub16_Sub1_3.method1454(local18);
			Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			Static114.aClass4_Sub16_Sub1_3.method1488(local10);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 18) {
			local139 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local22];
			if (local139 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local139.anIntArray296[0], local139.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				Static85.anInt2127 = 0;
				anInt1693 = 2;
				Static59.anInt1568 = Static27.anInt741;
				Static84.anInt2111 = Static1.anInt9;
				Static114.aClass4_Sub16_Sub1_3.method1499(157);
				Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			}
		}
		if (local14 == 12 && Static55.method982(local22, local18, local10)) {
			Static114.aClass4_Sub16_Sub1_3.method1499(62);
			Static114.aClass4_Sub16_Sub1_3.method1488(local22 >> 14 & 0x7FFF);
			Static114.aClass4_Sub16_Sub1_3.method1446(Static101.anInt2518);
			Static114.aClass4_Sub16_Sub1_3.method1488(Static24.anInt503 + local18);
			Static114.aClass4_Sub16_Sub1_3.method1488(Static36.anInt909 + local10);
			Static114.aClass4_Sub16_Sub1_3.method1454(Static65.anInt1667);
		}
		if (local14 == 58) {
			Static55.method982(local22, local18, local10);
			Static114.aClass4_Sub16_Sub1_3.method1499(25);
			Static114.aClass4_Sub16_Sub1_3.method1488(local10 + Static36.anInt909);
			Static114.aClass4_Sub16_Sub1_3.method1441(local22 >> 14 & 0x7FFF);
			Static114.aClass4_Sub16_Sub1_3.method1441(Static24.anInt503 + local18);
		}
		if (local14 == 38 && Static55.method982(local22, local18, local10)) {
			Static114.aClass4_Sub16_Sub1_3.method1499(164);
			Static114.aClass4_Sub16_Sub1_3.method1451(Static31.anInt818);
			Static114.aClass4_Sub16_Sub1_3.method1473(Static42.anInt1068);
			Static114.aClass4_Sub16_Sub1_3.method1488(Static36.anInt911);
			Static114.aClass4_Sub16_Sub1_3.method1488(Static36.anInt909 + local10);
			Static114.aClass4_Sub16_Sub1_3.method1488(local22 >> 14 & 0x7FFF);
			Static114.aClass4_Sub16_Sub1_3.method1473(Static24.anInt503 + local18);
		}
		if (local14 == 57) {
			Static114.method1990();
		}
		if (local14 == 40) {
			Static114.aClass4_Sub16_Sub1_3.method1499(29);
			Static114.aClass4_Sub16_Sub1_3.method1488(local10);
			Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			Static114.aClass4_Sub16_Sub1_3.method1489(local18);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 11) {
			Static55.method982(local22, local18, local10);
			Static114.aClass4_Sub16_Sub1_3.method1499(247);
			Static114.aClass4_Sub16_Sub1_3.method1446(local22 >> 14 & 0x7FFF);
			Static114.aClass4_Sub16_Sub1_3.method1473(Static24.anInt503 + local18);
			Static114.aClass4_Sub16_Sub1_3.method1446(Static36.anInt909 + local10);
		}
		if (local14 == 45) {
			local392 = Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 0, 0);
			if (!local392) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
			}
			Static59.anInt1568 = Static27.anInt741;
			anInt1693 = 2;
			Static85.anInt2127 = 0;
			Static84.anInt2111 = Static1.anInt9;
			Static114.aClass4_Sub16_Sub1_3.method1499(69);
			Static114.aClass4_Sub16_Sub1_3.method1473(local22);
			Static114.aClass4_Sub16_Sub1_3.method1446(local10 + Static36.anInt909);
			Static114.aClass4_Sub16_Sub1_3.method1488(Static24.anInt503 + local18);
		}
		if (local14 == 25) {
			local139 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local22];
			if (local139 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local139.anIntArray296[0], local139.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				anInt1693 = 2;
				Static84.anInt2111 = Static1.anInt9;
				Static85.anInt2127 = 0;
				Static59.anInt1568 = Static27.anInt741;
				Static114.aClass4_Sub16_Sub1_3.method1499(161);
				Static114.aClass4_Sub16_Sub1_3.method1473(local22);
			}
		}
		if (local14 == 31) {
			Static101.aClass43_1.method1094(Static131.anInt3202, local10, local18);
		}
		if (local14 == 28) {
			local139 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local22];
			if (local139 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local139.anIntArray296[0], local139.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				Static59.anInt1568 = Static27.anInt741;
				Static84.anInt2111 = Static1.anInt9;
				anInt1693 = 2;
				Static85.anInt2127 = 0;
				Static114.aClass4_Sub16_Sub1_3.method1499(197);
				Static114.aClass4_Sub16_Sub1_3.method1489(Static65.anInt1667);
				Static114.aClass4_Sub16_Sub1_3.method1441(Static101.anInt2518);
				Static114.aClass4_Sub16_Sub1_3.method1473(local22);
			}
		}
		if (local14 == 9) {
			local225 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local22];
			if (local225 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local225.anIntArray296[0], local225.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				Static84.anInt2111 = Static1.anInt9;
				Static85.anInt2127 = 0;
				anInt1693 = 2;
				Static59.anInt1568 = Static27.anInt741;
				Static114.aClass4_Sub16_Sub1_3.method1499(240);
				Static114.aClass4_Sub16_Sub1_3.method1473(local22);
			}
		}
		if (local14 == 7) {
			local392 = Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 0, 0);
			if (!local392) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
			}
			Static59.anInt1568 = Static27.anInt741;
			Static85.anInt2127 = 0;
			anInt1693 = 2;
			Static84.anInt2111 = Static1.anInt9;
			Static114.aClass4_Sub16_Sub1_3.method1499(2);
			Static114.aClass4_Sub16_Sub1_3.method1473(local10 + Static36.anInt909);
			Static114.aClass4_Sub16_Sub1_3.method1488(local22);
			Static114.aClass4_Sub16_Sub1_3.method1473(Static24.anInt503 + local18);
		}
		if (local14 == 1001) {
			Static55.method982(local22, local18, local10);
			Static114.aClass4_Sub16_Sub1_3.method1499(54);
			Static114.aClass4_Sub16_Sub1_3.method1446(Static36.anInt909 + local10);
			Static114.aClass4_Sub16_Sub1_3.method1441(Static24.anInt503 + local18);
			Static114.aClass4_Sub16_Sub1_3.method1473(local22 >> 14 & 0x7FFF);
		}
		if (local14 == 4) {
			local139 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local22];
			if (local139 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local139.anIntArray296[0], local139.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				Static84.anInt2111 = Static1.anInt9;
				Static85.anInt2127 = 0;
				anInt1693 = 2;
				Static59.anInt1568 = Static27.anInt741;
				Static114.aClass4_Sub16_Sub1_3.method1499(112);
				Static114.aClass4_Sub16_Sub1_3.method1473(Static42.anInt1068);
				Static114.aClass4_Sub16_Sub1_3.method1473(local22);
				Static114.aClass4_Sub16_Sub1_3.method1489(Static31.anInt818);
				Static114.aClass4_Sub16_Sub1_3.method1473(Static36.anInt911);
			}
		}
		if (local14 == 15 && Static101.aClass4_Sub5_55 == null) {
			Static102.method1837(local18, local10);
			Static101.aClass4_Sub5_55 = Static59.method1051(local10, local18);
			Static19.method344(Static101.aClass4_Sub5_55);
		}
		if (local14 == 33) {
			local35 = Static54.method949(local18);
			@Pc(1357) boolean local1357 = true;
			if (local35.anInt1241 > 0) {
				local1357 = Static64.method1146(local35);
			}
			if (local1357) {
				Static114.aClass4_Sub16_Sub1_3.method1499(124);
				Static114.aClass4_Sub16_Sub1_3.method1489(local18);
			}
		}
		if (local14 == 44) {
			Static114.aClass4_Sub16_Sub1_3.method1499(219);
			Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			Static114.aClass4_Sub16_Sub1_3.method1446(Static36.anInt911);
			Static114.aClass4_Sub16_Sub1_3.method1488(Static42.anInt1068);
			Static114.aClass4_Sub16_Sub1_3.method1446(local10);
			Static114.aClass4_Sub16_Sub1_3.method1468(local18);
			Static114.aClass4_Sub16_Sub1_3.method1451(Static31.anInt818);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 39) {
			local392 = Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 0, 0);
			if (!local392) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
			}
			Static84.anInt2111 = Static1.anInt9;
			Static59.anInt1568 = Static27.anInt741;
			Static85.anInt2127 = 0;
			anInt1693 = 2;
			Static114.aClass4_Sub16_Sub1_3.method1499(123);
			Static114.aClass4_Sub16_Sub1_3.method1473(Static101.anInt2518);
			Static114.aClass4_Sub16_Sub1_3.method1473(local22);
			Static114.aClass4_Sub16_Sub1_3.method1446(Static24.anInt503 + local18);
			Static114.aClass4_Sub16_Sub1_3.method1473(local10 + Static36.anInt909);
			Static114.aClass4_Sub16_Sub1_3.method1489(Static65.anInt1667);
		}
		if (local14 == 19) {
			Static114.aClass4_Sub16_Sub1_3.method1499(155);
			Static114.aClass4_Sub16_Sub1_3.method1488(local10);
			Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			Static114.aClass4_Sub16_Sub1_3.method1489(local18);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 22) {
			local225 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local22];
			if (local225 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local225.anIntArray296[0], local225.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				Static84.anInt2111 = Static1.anInt9;
				Static59.anInt1568 = Static27.anInt741;
				anInt1693 = 2;
				Static85.anInt2127 = 0;
				Static114.aClass4_Sub16_Sub1_3.method1499(227);
				Static114.aClass4_Sub16_Sub1_3.method1488(local22);
			}
		}
		if (local14 == 23) {
			local35 = Static59.method1051(local10, local18);
			if (local35 != null) {
				Static1.method4();
				Static62.method1124(Static65.method1151(Static20.method385(local35)), local10, local18);
				Static59.anInt1555 = 0;
				Static104.aClass39_1338 = Static46.method767(local35);
				if (Static104.aClass39_1338 == null) {
					Static104.aClass39_1338 = Static109.aClass39_1429;
				}
				if (local35.aBoolean63) {
					Static24.aClass39_299 = Static62.method1123(new Class39[] { local35.aClass39_721, Static127.aClass39_1758 });
					return;
				}
				Static24.aClass39_299 = Static62.method1123(new Class39[] { Static27.aClass39_392, local35.aClass39_720, Static127.aClass39_1758 });
			}
			return;
		}
		if (local14 == 14) {
			Static114.aClass4_Sub16_Sub1_3.method1499(73);
			Static114.aClass4_Sub16_Sub1_3.method1446(Static101.anInt2518);
			Static114.aClass4_Sub16_Sub1_3.method1488(local22);
			Static114.aClass4_Sub16_Sub1_3.method1454(local18);
			Static114.aClass4_Sub16_Sub1_3.method1488(local10);
			Static114.aClass4_Sub16_Sub1_3.method1451(Static65.anInt1667);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 6) {
			local392 = Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 0, 0);
			if (!local392) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
			}
			Static59.anInt1568 = Static27.anInt741;
			Static85.anInt2127 = 0;
			anInt1693 = 2;
			Static84.anInt2111 = Static1.anInt9;
			Static114.aClass4_Sub16_Sub1_3.method1499(115);
			Static114.aClass4_Sub16_Sub1_3.method1446(Static24.anInt503 + local18);
			Static114.aClass4_Sub16_Sub1_3.method1473(local22);
			Static114.aClass4_Sub16_Sub1_3.method1446(local10 + Static36.anInt909);
		}
		if (local14 == 1005) {
			Static59.anInt1568 = Static27.anInt741;
			Static85.anInt2127 = 0;
			anInt1693 = 2;
			Static84.anInt2111 = Static1.anInt9;
			local225 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local22];
			if (local225 != null) {
				@Pc(1829) Class4_Sub2_Sub16 local1829 = local225.aClass4_Sub2_Sub16_1;
				if (local1829.anIntArray316 != null) {
					local1829 = local1829.method2043();
				}
				if (local1829 != null) {
					Static114.aClass4_Sub16_Sub1_3.method1499(230);
					Static114.aClass4_Sub16_Sub1_3.method1441(local1829.anInt2936);
				}
			}
		}
		if (local14 == 42) {
			Static114.aClass4_Sub16_Sub1_3.method1499(124);
			Static114.aClass4_Sub16_Sub1_3.method1489(local18);
			local35 = Static54.method949(local18);
			if (local35.anIntArrayArray8 != null && local35.anIntArrayArray8[0][0] == 5) {
				local112 = local35.anIntArrayArray8[0][1];
				Static22.anIntArray64[local112] = 1 - Static22.anIntArray64[local112];
				Static20.method383(local112);
			}
		}
		if (local14 == 35) {
			local392 = Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 0, 0);
			if (!local392) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
			}
			Static59.anInt1568 = Static27.anInt741;
			Static84.anInt2111 = Static1.anInt9;
			Static85.anInt2127 = 0;
			anInt1693 = 2;
			Static114.aClass4_Sub16_Sub1_3.method1499(175);
			Static114.aClass4_Sub16_Sub1_3.method1446(Static36.anInt909 + local10);
			Static114.aClass4_Sub16_Sub1_3.method1441(local18 + Static24.anInt503);
			Static114.aClass4_Sub16_Sub1_3.method1441(local22);
		}
		if (local14 == 48) {
			local225 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local22];
			if (local225 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local225.anIntArray296[0], local225.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				Static85.anInt2127 = 0;
				Static59.anInt1568 = Static27.anInt741;
				Static84.anInt2111 = Static1.anInt9;
				anInt1693 = 2;
				Static114.aClass4_Sub16_Sub1_3.method1499(45);
				Static114.aClass4_Sub16_Sub1_3.method1473(local22);
			}
		}
		if (local14 == 16) {
			local392 = Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 0, 0);
			if (!local392) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local18, local10, 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
			}
			Static84.anInt2111 = Static1.anInt9;
			Static59.anInt1568 = Static27.anInt741;
			Static85.anInt2127 = 0;
			anInt1693 = 2;
			Static114.aClass4_Sub16_Sub1_3.method1499(173);
			Static114.aClass4_Sub16_Sub1_3.method1488(Static24.anInt503 + local18);
			Static114.aClass4_Sub16_Sub1_3.method1488(Static42.anInt1068);
			Static114.aClass4_Sub16_Sub1_3.method1446(local10 + Static36.anInt909);
			Static114.aClass4_Sub16_Sub1_3.method1488(Static36.anInt911);
			Static114.aClass4_Sub16_Sub1_3.method1446(local22);
			Static114.aClass4_Sub16_Sub1_3.method1454(Static31.anInt818);
		}
		if (local14 == 8) {
			Static114.aClass4_Sub16_Sub1_3.method1499(66);
			Static114.aClass4_Sub16_Sub1_3.method1441(local10);
			Static114.aClass4_Sub16_Sub1_3.method1488(local22);
			Static114.aClass4_Sub16_Sub1_3.method1454(local18);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 36) {
			local225 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local22];
			if (local225 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local225.anIntArray296[0], local225.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				Static84.anInt2111 = Static1.anInt9;
				Static85.anInt2127 = 0;
				Static59.anInt1568 = Static27.anInt741;
				anInt1693 = 2;
				Static114.aClass4_Sub16_Sub1_3.method1499(35);
				Static114.aClass4_Sub16_Sub1_3.method1473(local22);
			}
		}
		if (local14 == 30) {
			local139 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local22];
			if (local139 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local139.anIntArray296[0], local139.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				Static85.anInt2127 = 0;
				anInt1693 = 2;
				Static59.anInt1568 = Static27.anInt741;
				Static84.anInt2111 = Static1.anInt9;
				Static114.aClass4_Sub16_Sub1_3.method1499(98);
				Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			}
		}
		if (local14 == 20) {
			Static114.aClass4_Sub16_Sub1_3.method1499(44);
			Static114.aClass4_Sub16_Sub1_3.method1488(local10);
			Static114.aClass4_Sub16_Sub1_3.method1454(local18);
			Static114.aClass4_Sub16_Sub1_3.method1446(local22);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 1004) {
			local35 = Static54.method949(local18);
			if (local35 == null || local35.anIntArray134[local10] < 100000) {
				Static114.aClass4_Sub16_Sub1_3.method1499(237);
				Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			} else {
				Static40.method672(0, Static62.method1123(new Class39[] { Static29.method510(local35.anIntArray134[local10]), Static23.aClass39_372, Static119.method2166(local22).aClass39_352 }), Static72.aClass39_423);
			}
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 10) {
			Static114.aClass4_Sub16_Sub1_3.method1499(198);
			Static114.aClass4_Sub16_Sub1_3.method1488(Static101.anInt2518);
			Static114.aClass4_Sub16_Sub1_3.method1488(local10);
			Static114.aClass4_Sub16_Sub1_3.method1489(local18);
			Static114.aClass4_Sub16_Sub1_3.method1451(Static65.anInt1667);
		}
		if (local14 == 46) {
			Static55.method982(local22, local18, local10);
			Static114.aClass4_Sub16_Sub1_3.method1499(90);
			Static114.aClass4_Sub16_Sub1_3.method1441(local10 + Static36.anInt909);
			Static114.aClass4_Sub16_Sub1_3.method1441(local22 >> 14 & 0x7FFF);
			Static114.aClass4_Sub16_Sub1_3.method1488(local18 + Static24.anInt503);
		}
		if (local14 == 37) {
			Static114.aClass4_Sub16_Sub1_3.method1499(204);
			Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			Static114.aClass4_Sub16_Sub1_3.method1473(local10);
			Static114.aClass4_Sub16_Sub1_3.method1451(local18);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 21) {
			Static114.aClass4_Sub16_Sub1_3.method1499(127);
			Static114.aClass4_Sub16_Sub1_3.method1454(local18);
			Static114.aClass4_Sub16_Sub1_3.method1473(local10);
			Static114.aClass4_Sub16_Sub1_3.method1473(local22);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 32) {
			local225 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local22];
			if (local225 != null) {
				Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local225.anIntArray296[0], local225.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				Static59.anInt1568 = Static27.anInt741;
				Static84.anInt2111 = Static1.anInt9;
				Static85.anInt2127 = 0;
				anInt1693 = 2;
				Static114.aClass4_Sub16_Sub1_3.method1499(151);
				Static114.aClass4_Sub16_Sub1_3.method1489(Static65.anInt1667);
				Static114.aClass4_Sub16_Sub1_3.method1473(Static101.anInt2518);
				Static114.aClass4_Sub16_Sub1_3.method1441(local22);
			}
		}
		if (local14 == 5) {
			Static114.aClass4_Sub16_Sub1_3.method1499(102);
			Static114.aClass4_Sub16_Sub1_3.method1446(local10);
			Static114.aClass4_Sub16_Sub1_3.method1489(local18);
			Static114.aClass4_Sub16_Sub1_3.method1473(local22);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 2) {
			Static55.method982(local22, local18, local10);
			Static114.aClass4_Sub16_Sub1_3.method1499(92);
			Static114.aClass4_Sub16_Sub1_3.method1441(local18 + Static24.anInt503);
			Static114.aClass4_Sub16_Sub1_3.method1473(local22 >> 14 & 0x7FFF);
			Static114.aClass4_Sub16_Sub1_3.method1488(local10 + Static36.anInt909);
		}
		if (local14 == 29) {
			Static114.aClass4_Sub16_Sub1_3.method1499(207);
			Static114.aClass4_Sub16_Sub1_3.method1473(local10);
			Static114.aClass4_Sub16_Sub1_3.method1489(local18);
			Static114.aClass4_Sub16_Sub1_3.method1446(local22);
			Static114.anInt2849 = 0;
			Static25.aClass4_Sub5_74 = Static54.method949(local18);
			Static120.anInt2958 = local10;
		}
		if (local14 == 13 || local14 == 1003) {
			Static60.method1069(local10, local22, local18, Static52.aClass39Array11[arg0]);
		}
		if (Static59.anInt1555 != 0) {
			Static59.anInt1555 = 0;
			Static19.method344(Static54.method949(Static31.anInt818));
		}
		if (Static78.aBoolean101) {
			Static1.method4();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBIIII)V")
	public static void method1167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = 2048 - arg1 & 0x7FF;
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = 2048 - arg0 & 0x7FF;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = arg3;
		@Pc(36) int local36;
		@Pc(32) int local32;
		@Pc(47) int local47;
		if (local13 != 0) {
			local32 = Class4_Sub2_Sub3_Sub2.anIntArray155[local13];
			local36 = Class4_Sub2_Sub3_Sub2.anIntArray152[local13];
			local47 = local32 * 0 - arg3 * local36 >> 16;
			local26 = local36 * 0 + arg3 * local32 >> 16;
			local24 = local47;
		}
		if (local22 != 0) {
			local36 = Class4_Sub2_Sub3_Sub2.anIntArray152[local22];
			local32 = Class4_Sub2_Sub3_Sub2.anIntArray155[local22];
			local47 = local32 * 0 + local36 * local26 >> 16;
			local26 = local32 * local26 - local36 * 0 >> 16;
			local15 = local47;
		}
		Static119.anInt3113 = arg2 - local26;
		Static97.anInt2445 = arg5 - local24;
		Static18.anInt423 = arg1;
		Static69.anInt1723 = arg4 - local15;
		Static121.anInt3006 = arg0;
	}
}
