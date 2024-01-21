import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!m", name = "wc", descriptor = "J")
	public static long aLong61;

	@OriginalMember(owner = "client!m", name = "Mc", descriptor = "Lclient!r;")
	private static Class61 aClass61_574 = Static129.method2060("Cancel");

	@OriginalMember(owner = "client!m", name = "xc", descriptor = "Lclient!r;")
	public static Class61 aClass61_572 = aClass61_574;

	@OriginalMember(owner = "client!m", name = "zc", descriptor = "[I")
	public static int[] anIntArray266 = new int[500];

	@OriginalMember(owner = "client!m", name = "Ac", descriptor = "I")
	public static int anInt1866 = 0;

	@OriginalMember(owner = "client!m", name = "Cc", descriptor = "I")
	public static int anInt1867 = 0;

	@OriginalMember(owner = "client!m", name = "Fc", descriptor = "[I")
	public static int[] anIntArray267 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!m", name = "Gc", descriptor = "I")
	public static int anInt1870 = 0;

	@OriginalMember(owner = "client!m", name = "Jc", descriptor = "Z")
	public static volatile boolean aBoolean73 = true;

	@OriginalMember(owner = "client!m", name = "Kc", descriptor = "[I")
	public static int[] anIntArray268 = new int[5];

	@OriginalMember(owner = "client!m", name = "Lc", descriptor = "Lclient!r;")
	public static Class61 aClass61_573 = Static129.method2060("rect_debug=");

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
	public static void method1227() {
		aClass61_573 = null;
		anIntArray267 = null;
		aClass61_572 = null;
		anIntArray266 = null;
		anIntArray268 = null;
		aClass61_574 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!td;B)V")
	public static void method1228(@OriginalArg(0) Class5_Sub22 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray28;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class5_Sub2_Sub15 local18 = Static62.method1070(local14);
		if (local18 == null) {
			return;
		}
		Static91.anInt2424 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = 0;
		@Pc(32) int[] local32 = local18.anIntArray368;
		@Pc(35) int[] local35 = local18.anIntArray369;
		@Pc(37) byte local37 = -1;
		@Pc(51) int local51;
		@Pc(89) int local89;
		try {
			Static102.aClass61Array17 = new Class61[local18.anInt3070];
			@Pc(43) int local43 = 0;
			Static32.anIntArray153 = new int[local18.anInt3073];
			@Pc(49) int local49 = 0;
			for (local51 = 1; local51 < local8.length; local51++) {
				if (local8[local51] instanceof Integer) {
					local89 = (Integer) local8[local51];
					if (local89 == -2147483647) {
						local89 = arg0.anInt2981;
					}
					if (local89 == -2147483646) {
						local89 = arg0.anInt2980;
					}
					if (local89 == -2147483645) {
						local89 = arg0.aClass5_Sub11_12 == null ? -1 : arg0.aClass5_Sub11_12.anInt1614;
					}
					if (local89 == -2147483644) {
						local89 = arg0.anInt2983;
					}
					if (local89 == -2147483643) {
						local89 = arg0.aClass5_Sub11_12 == null ? -1 : arg0.aClass5_Sub11_12.anInt1645;
					}
					if (local89 == -2147483642) {
						local89 = arg0.aClass5_Sub11_11 == null ? -1 : arg0.aClass5_Sub11_11.anInt1614;
					}
					if (local89 == -2147483641) {
						local89 = arg0.aClass5_Sub11_11 == null ? -1 : arg0.aClass5_Sub11_11.anInt1645;
					}
					if (local89 == -2147483640) {
						local89 = arg0.anInt2979;
					}
					if (local89 == -2147483639) {
						local89 = arg0.anInt2987;
					}
					Static32.anIntArray153[local43++] = local89;
				} else if (local8[local51] instanceof Class61) {
					@Pc(68) Class61 local68 = (Class61) local8[local51];
					if (local68.method1736(Static52.aClass61_425)) {
						local68 = arg0.aClass61_908;
					}
					Static102.aClass61Array17[local49++] = local68;
				}
			}
			local89 = 0;
			label1981: while (true) {
				local89++;
				if (local89 > 200000) {
					throw new RuntimeException("slow");
				}
				local27++;
				@Pc(210) int local210 = local32[local27];
				@Pc(768) int local768;
				@Pc(624) int local624;
				@Pc(649) int local649;
				@Pc(763) int local763;
				@Pc(582) Class61 local582;
				if (local210 < 100) {
					if (local210 == 0) {
						Static133.anIntArray449[local25++] = local35[local27];
						continue;
					}
					@Pc(235) int local235;
					if (local210 == 1) {
						local235 = local35[local27];
						Static133.anIntArray449[local25++] = Static83.anIntArray289[local235];
						continue;
					}
					if (local210 == 2) {
						local235 = local35[local27];
						local25--;
						Static83.anIntArray289[local235] = Static133.anIntArray449[local25];
						continue;
					}
					if (local210 == 3) {
						Static2.aClass61Array2[local29++] = local18.aClass61Array22[local27];
						continue;
					}
					if (local210 == 6) {
						local27 += local35[local27];
						continue;
					}
					if (local210 == 7) {
						local25 -= 2;
						if (Static133.anIntArray449[local25 + 1] != Static133.anIntArray449[local25]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local210 == 8) {
						local25 -= 2;
						if (Static133.anIntArray449[local25 + 1] == Static133.anIntArray449[local25]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local210 == 9) {
						local25 -= 2;
						if (Static133.anIntArray449[local25 + 1] > Static133.anIntArray449[local25]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local210 == 10) {
						local25 -= 2;
						if (Static133.anIntArray449[local25] > Static133.anIntArray449[local25 + 1]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local210 == 21) {
						if (Static91.anInt2424 == 0) {
							return;
						}
						@Pc(401) Class23 local401 = Static114.aClass23Array1[--Static91.anInt2424];
						Static102.aClass61Array17 = local401.aClass61Array6;
						Static32.anIntArray153 = local401.anIntArray164;
						local18 = local401.aClass5_Sub2_Sub15_1;
						local27 = local401.anInt1016;
						local35 = local18.anIntArray369;
						local32 = local18.anIntArray368;
						continue;
					}
					if (local210 == 25) {
						local235 = local35[local27];
						Static133.anIntArray449[local25++] = Static111.method1829(local235);
						continue;
					}
					if (local210 == 27) {
						local235 = local35[local27];
						local25--;
						Static90.method1580(Static133.anIntArray449[local25], local235);
						continue;
					}
					if (local210 == 31) {
						local25 -= 2;
						if (Static133.anIntArray449[local25] <= Static133.anIntArray449[local25 + 1]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local210 == 32) {
						local25 -= 2;
						if (Static133.anIntArray449[local25 + 1] <= Static133.anIntArray449[local25]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local210 == 33) {
						Static133.anIntArray449[local25++] = Static32.anIntArray153[local35[local27]];
						continue;
					}
					@Pc(530) int local530;
					if (local210 == 34) {
						local530 = local35[local27];
						local25--;
						Static32.anIntArray153[local530] = Static133.anIntArray449[local25];
						continue;
					}
					if (local210 == 35) {
						Static2.aClass61Array2[local29++] = Static102.aClass61Array17[local35[local27]];
						continue;
					}
					if (local210 == 36) {
						local530 = local35[local27];
						local29--;
						Static102.aClass61Array17[local530] = Static2.aClass61Array2[local29];
						continue;
					}
					if (local210 == 37) {
						local235 = local35[local27];
						local29 -= local235;
						local582 = Static86.method1533(local29, local235, Static2.aClass61Array2);
						Static2.aClass61Array2[local29++] = local582;
						continue;
					}
					if (local210 == 38) {
						local25--;
						continue;
					}
					if (local210 == 39) {
						local29--;
						continue;
					}
					if (local210 == 40) {
						local235 = local35[local27];
						@Pc(614) Class5_Sub2_Sub15 local614 = Static62.method1070(local235);
						@Pc(618) int[] local618 = new int[local614.anInt3073];
						@Pc(622) Class61[] local622 = new Class61[local614.anInt3070];
						for (local624 = 0; local624 < local614.anInt3074; local624++) {
							local618[local624] = Static133.anIntArray449[local624 + local25 - local614.anInt3074];
						}
						for (local649 = 0; local649 < local614.anInt3064; local649++) {
							local622[local649] = Static2.aClass61Array2[local649 + local29 - local614.anInt3064];
						}
						local29 -= local614.anInt3064;
						local25 -= local614.anInt3074;
						@Pc(682) Class23 local682 = new Class23();
						local682.anIntArray164 = Static32.anIntArray153;
						local682.aClass61Array6 = Static102.aClass61Array17;
						local682.aClass5_Sub2_Sub15_1 = local18;
						local18 = local614;
						local682.anInt1016 = local27;
						Static114.aClass23Array1[Static91.anInt2424++] = local682;
						local32 = local614.anIntArray368;
						local27 = -1;
						Static32.anIntArray153 = local618;
						local35 = local614.anIntArray369;
						Static102.aClass61Array17 = local622;
						continue;
					}
					if (local210 == 42) {
						Static133.anIntArray449[local25++] = Static26.anIntArray117[local35[local27]];
						continue;
					}
					if (local210 == 43) {
						local530 = local35[local27];
						local25--;
						Static26.anIntArray117[local530] = Static133.anIntArray449[local25];
						continue;
					}
					if (local210 == 44) {
						local235 = local35[local27] >> 16;
						local763 = local35[local27] & 0xFFFF;
						local25--;
						local768 = Static133.anIntArray449[local25];
						if (local768 >= 0 && local768 <= 5000) {
							Static12.anIntArray68[local235] = local768;
							@Pc(786) byte local786 = -1;
							if (local763 == 105) {
								local786 = 0;
							}
							local624 = 0;
							while (true) {
								if (local768 <= local624) {
									continue label1981;
								}
								Static71.anIntArrayArray19[local235][local624] = local786;
								local624++;
							}
						}
						throw new RuntimeException();
					}
					if (local210 == 45) {
						local25--;
						local763 = Static133.anIntArray449[local25];
						local235 = local35[local27];
						if (local763 >= 0 && Static12.anIntArray68[local235] > local763) {
							Static133.anIntArray449[local25++] = Static71.anIntArrayArray19[local235][local763];
							continue;
						}
						throw new RuntimeException();
					}
					if (local210 == 46) {
						local235 = local35[local27];
						local25 -= 2;
						local763 = Static133.anIntArray449[local25];
						if (local763 >= 0 && local763 < Static12.anIntArray68[local235]) {
							Static71.anIntArrayArray19[local235][local763] = Static133.anIntArray449[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local210 == 47) {
						@Pc(897) Class61 local897 = Static54.aClass61Array7[local35[local27]];
						if (local897 == null) {
							local897 = Static50.aClass61_392;
						}
						Static2.aClass61Array2[local29++] = local897;
						continue;
					}
					if (local210 == 48) {
						local530 = local35[local27];
						local29--;
						Static54.aClass61Array7[local530] = Static2.aClass61Array2[local29];
						continue;
					}
				}
				@Pc(931) boolean local931;
				if (local35[local27] == 1) {
					local931 = true;
				} else {
					local931 = false;
				}
				@Pc(1085) Class5_Sub11 local1085;
				@Pc(960) int local960;
				@Pc(970) Class5_Sub11 local970;
				@Pc(995) int local995;
				@Pc(1140) Class5_Sub11 local1140;
				if (local210 < 1000) {
					if (local210 == 100) {
						local25 -= 3;
						local763 = Static133.anIntArray449[local25];
						local768 = Static133.anIntArray449[local25 + 1];
						local960 = Static133.anIntArray449[local25 + 2];
						if (local768 == 0) {
							throw new RuntimeException();
						}
						local970 = Static88.method2191(local763);
						if (local970.aClass5_Sub11Array1 == null) {
							local970.aClass5_Sub11Array1 = new Class5_Sub11[local960 + 1];
						}
						if (local970.aClass5_Sub11Array1.length <= local960) {
							@Pc(993) Class5_Sub11[] local993 = new Class5_Sub11[local960 + 1];
							for (local995 = 0; local995 < local970.aClass5_Sub11Array1.length; local995++) {
								local993[local995] = local970.aClass5_Sub11Array1[local995];
							}
							local970.aClass5_Sub11Array1 = local993;
						}
						if (local960 > 0 && local970.aClass5_Sub11Array1[local960 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local960 - 1));
						}
						@Pc(1042) Class5_Sub11 local1042 = new Class5_Sub11();
						local1042.aBoolean66 = true;
						local1042.anInt1669 = local768;
						local1042.anInt1645 = local960;
						local1042.anInt1681 = local1042.anInt1614 = local970.anInt1614;
						local970.aClass5_Sub11Array1[local960] = local1042;
						if (local931) {
							Static79.aClass5_Sub11_7 = local1042;
						} else {
							Static34.aClass5_Sub11_4 = local1042;
						}
						Static24.method505(local970);
						continue;
					}
					if (local210 == 101) {
						local1085 = local931 ? Static79.aClass5_Sub11_7 : Static34.aClass5_Sub11_4;
						@Pc(1090) Class5_Sub11 local1090 = Static88.method2191(local1085.anInt1614);
						local1090.aClass5_Sub11Array1[local1085.anInt1645] = null;
						Static24.method505(local1090);
						continue;
					}
					if (local210 == 102) {
						local25--;
						local1085 = Static88.method2191(Static133.anIntArray449[local25]);
						local1085.aClass5_Sub11Array1 = null;
						Static24.method505(local1085);
						continue;
					}
					if (local210 == 200) {
						local25 -= 2;
						local763 = Static133.anIntArray449[local25];
						local768 = Static133.anIntArray449[local25 + 1];
						local1140 = Static98.method1667(local763, local768);
						if (local1140 != null && local768 != -1) {
							Static133.anIntArray449[local25++] = 1;
							if (local931) {
								Static79.aClass5_Sub11_7 = local1140;
							} else {
								Static34.aClass5_Sub11_4 = local1140;
							}
							continue;
						}
						Static133.anIntArray449[local25++] = 0;
						continue;
					}
				} else if ((local210 < 1000 || local210 >= 1100) && (local210 < 2000 || local210 >= 2100)) {
					@Pc(1639) Class61 local1639;
					if (local210 >= 1100 && local210 < 1200 || local210 >= 2100 && local210 < 2200) {
						if (local210 >= 2000) {
							local25--;
							local1085 = Static88.method2191(Static133.anIntArray449[local25]);
							local210 -= 1000;
						} else {
							local1085 = local931 ? Static79.aClass5_Sub11_7 : Static34.aClass5_Sub11_4;
						}
						if (local210 == 1100) {
							local25 -= 2;
							local1085.anInt1640 = Static133.anIntArray449[local25];
							if (local1085.anInt1640 > local1085.anInt1634 - local1085.anInt1653) {
								local1085.anInt1640 = local1085.anInt1634 - local1085.anInt1653;
							}
							if (local1085.anInt1640 < 0) {
								local1085.anInt1640 = 0;
							}
							local1085.anInt1660 = Static133.anIntArray449[local25 + 1];
							if (local1085.anInt1660 > local1085.anInt1662 - local1085.anInt1636) {
								local1085.anInt1660 = local1085.anInt1662 - local1085.anInt1636;
							}
							if (local1085.anInt1660 < 0) {
								local1085.anInt1660 = 0;
							}
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1101) {
							local25--;
							local1085.anInt1611 = Static133.anIntArray449[local25];
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1102) {
							local25--;
							local1085.aBoolean68 = Static133.anIntArray449[local25] == 1;
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1103) {
							local25--;
							local1085.anInt1678 = Static133.anIntArray449[local25];
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1104) {
							local25--;
							local1085.anInt1680 = Static133.anIntArray449[local25];
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1105) {
							local25--;
							local1085.anInt1651 = Static133.anIntArray449[local25];
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1106) {
							local25--;
							local1085.anInt1666 = Static133.anIntArray449[local25];
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1107) {
							local25--;
							local1085.aBoolean67 = Static133.anIntArray449[local25] == 1;
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1108) {
							local1085.anInt1649 = 1;
							local25--;
							local1085.anInt1679 = Static133.anIntArray449[local25];
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1109) {
							local25 -= 6;
							local1085.anInt1673 = Static133.anIntArray449[local25];
							local1085.anInt1664 = Static133.anIntArray449[local25 + 1];
							local1085.anInt1647 = Static133.anIntArray449[local25 + 2];
							local1085.anInt1671 = Static133.anIntArray449[local25 + 3];
							local1085.anInt1670 = Static133.anIntArray449[local25 + 4];
							local1085.anInt1668 = Static133.anIntArray449[local25 + 5];
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1110) {
							local25--;
							local768 = Static133.anIntArray449[local25];
							if (local1085.anInt1625 != local768) {
								local1085.anInt1617 = 0;
								local1085.anInt1625 = local768;
								local1085.anInt1672 = 0;
								Static24.method505(local1085);
							}
							continue;
						}
						if (local210 == 1111) {
							local25--;
							local1085.aBoolean61 = Static133.anIntArray449[local25] == 1;
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1112) {
							local29--;
							local1639 = Static2.aClass61Array2[local29];
							if (!local1639.method1736(local1085.aClass61_506)) {
								local1085.aClass61_506 = local1639;
								Static24.method505(local1085);
							}
							continue;
						}
						if (local210 == 1113) {
							local25--;
							local1085.anInt1654 = Static133.anIntArray449[local25];
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1114) {
							local25 -= 3;
							local1085.anInt1642 = Static133.anIntArray449[local25];
							local1085.anInt1610 = Static133.anIntArray449[local25 + 1];
							local1085.anInt1633 = Static133.anIntArray449[local25 + 2];
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1115) {
							local25--;
							local1085.aBoolean63 = Static133.anIntArray449[local25] == 1;
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1116) {
							local25--;
							local1085.anInt1648 = Static133.anIntArray449[local25];
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1117) {
							local25--;
							local1085.anInt1652 = Static133.anIntArray449[local25];
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1118) {
							local25--;
							local1085.aBoolean65 = Static133.anIntArray449[local25] == 1;
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1119) {
							local25--;
							local1085.aBoolean70 = Static133.anIntArray449[local25] == 1;
							Static24.method505(local1085);
							continue;
						}
						if (local210 == 1120) {
							local25 -= 2;
							local1085.anInt1634 = Static133.anIntArray449[local25];
							local1085.anInt1662 = Static133.anIntArray449[local25 + 1];
							Static24.method505(local1085);
							continue;
						}
					} else if (local210 >= 1200 && local210 < 1300 || local210 >= 2200 && local210 < 2300) {
						if (local210 < 2000) {
							local1085 = local931 ? Static79.aClass5_Sub11_7 : Static34.aClass5_Sub11_4;
						} else {
							local25--;
							local1085 = Static88.method2191(Static133.anIntArray449[local25]);
							local210 -= 1000;
						}
						Static24.method505(local1085);
						if (local210 == 1200) {
							local25 -= 2;
							local960 = Static133.anIntArray449[local25 + 1];
							local768 = Static133.anIntArray449[local25];
							local1085.anInt1630 = local960;
							local1085.anInt1618 = local768;
							@Pc(6993) Class5_Sub2_Sub11 local6993 = Static111.method1830(local768);
							local1085.anInt1668 = local6993.anInt1960;
							if (local1085.anInt1653 > 0) {
								local1085.anInt1668 = local1085.anInt1668 * 32 / local1085.anInt1653;
							}
							local1085.anInt1671 = local6993.anInt1967;
							local1085.anInt1670 = local6993.anInt1954;
							local1085.anInt1647 = local6993.anInt1950;
							local1085.anInt1673 = local6993.anInt1959;
							local1085.anInt1664 = local6993.anInt1956;
							continue;
						}
						if (local210 == 1201) {
							local1085.anInt1649 = 2;
							local25--;
							local1085.anInt1679 = Static133.anIntArray449[local25];
							continue;
						}
						if (local210 == 1202) {
							local1085.anInt1649 = 3;
							local1085.anInt1679 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass37_2.method998();
							continue;
						}
					} else if ((local210 < 1300 || local210 >= 1400) && (local210 < 2300 || local210 >= 2400)) {
						if (local210 >= 1400 && local210 < 1500 || local210 >= 2400 && local210 < 2500) {
							if (local210 < 2000) {
								local1085 = local931 ? Static79.aClass5_Sub11_7 : Static34.aClass5_Sub11_4;
							} else {
								local25--;
								local1085 = Static88.method2191(Static133.anIntArray449[local25]);
								local210 -= 1000;
							}
							@Pc(2021) int[] local2021 = null;
							local29--;
							local1639 = Static2.aClass61Array2[local29];
							if (local1639.method1733() > 0 && local1639.method1714(local1639.method1733() - 1) == 89) {
								local25--;
								local624 = Static133.anIntArray449[local25];
								if (local624 > 0) {
									local2021 = new int[local624];
									while (local624-- > 0) {
										local25--;
										local2021[local624] = Static133.anIntArray449[local25];
									}
								}
								local1639 = local1639.method1730(local1639.method1733() - 1, 0);
							}
							@Pc(2085) Object[] local2085 = new Object[local1639.method1733() + 1];
							for (local649 = local2085.length - 1; local649 >= 1; local649--) {
								if (local1639.method1714(local649 - 1) == 115) {
									local29--;
									local2085[local649] = Static2.aClass61Array2[local29];
								} else {
									local25--;
									local2085[local649] = Integer.valueOf(Static133.anIntArray449[local25]);
								}
							}
							local25--;
							local995 = Static133.anIntArray449[local25];
							if (local995 == -1) {
								local2085 = null;
							} else {
								local2085[0] = Integer.valueOf(local995);
							}
							if (local210 == 1422) {
								local1085.anObjectArray20 = local2085;
							}
							if (local210 == 1424) {
								local1085.anObjectArray3 = local2085;
							}
							if (local210 == 1409) {
								local1085.anObjectArray15 = local2085;
							}
							if (local210 == 1415) {
								local1085.anIntArray244 = local2021;
								local1085.anObjectArray12 = local2085;
							}
							if (local210 == 1408) {
								local1085.anObjectArray21 = local2085;
							}
							if (local210 == 1416) {
								local1085.anObjectArray26 = local2085;
							}
							if (local210 == 1405) {
								local1085.anObjectArray5 = local2085;
							}
							if (local210 == 1423) {
								local1085.anObjectArray8 = local2085;
							}
							if (local210 == 1401) {
								local1085.anObjectArray18 = local2085;
							}
							if (local210 == 1410) {
								local1085.anObjectArray4 = local2085;
							}
							if (local210 == 1412) {
								local1085.anObjectArray16 = local2085;
							}
							if (local210 == 1420) {
								local1085.anObjectArray17 = local2085;
							}
							if (local210 == 1414) {
								local1085.anObjectArray10 = local2085;
								local1085.anIntArray247 = local2021;
							}
							if (local210 == 1411) {
								local1085.anObjectArray9 = local2085;
							}
							if (local210 == 1419) {
								local1085.anObjectArray14 = local2085;
							}
							if (local210 == 1407) {
								local1085.anIntArray243 = local2021;
								local1085.anObjectArray6 = local2085;
							}
							if (local210 == 1406) {
								local1085.anObjectArray22 = local2085;
							}
							local1085.aBoolean64 = true;
							if (local210 == 1418) {
								local1085.anObjectArray23 = local2085;
							}
							if (local210 == 1402) {
								local1085.anObjectArray24 = local2085;
							}
							if (local210 == 1400) {
								local1085.anObjectArray11 = local2085;
							}
							if (local210 == 1403) {
								local1085.anObjectArray27 = local2085;
							}
							if (local210 == 1404) {
								local1085.anObjectArray13 = local2085;
							}
							if (local210 == 1421) {
								local1085.anObjectArray25 = local2085;
							}
							if (local210 == 1417) {
								local1085.anObjectArray7 = local2085;
							}
							continue;
						}
						if (local210 < 1600) {
							local1085 = local931 ? Static79.aClass5_Sub11_7 : Static34.aClass5_Sub11_4;
							if (local210 == 1500) {
								Static133.anIntArray449[local25++] = local1085.anInt1665;
								continue;
							}
							if (local210 == 1501) {
								Static133.anIntArray449[local25++] = local1085.anInt1661;
								continue;
							}
							if (local210 == 1502) {
								Static133.anIntArray449[local25++] = local1085.anInt1653;
								continue;
							}
							if (local210 == 1503) {
								Static133.anIntArray449[local25++] = local1085.anInt1636;
								continue;
							}
							if (local210 == 1504) {
								Static133.anIntArray449[local25++] = local1085.aBoolean71 ? 1 : 0;
								continue;
							}
							if (local210 == 1505) {
								Static133.anIntArray449[local25++] = local1085.anInt1681;
								continue;
							}
						} else if (local210 < 1700) {
							local1085 = local931 ? Static79.aClass5_Sub11_7 : Static34.aClass5_Sub11_4;
							if (local210 == 1600) {
								Static133.anIntArray449[local25++] = local1085.anInt1640;
								continue;
							}
							if (local210 == 1601) {
								Static133.anIntArray449[local25++] = local1085.anInt1660;
								continue;
							}
							if (local210 == 1602) {
								Static2.aClass61Array2[local29++] = local1085.aClass61_506;
								continue;
							}
							if (local210 == 1603) {
								Static133.anIntArray449[local25++] = local1085.anInt1634;
								continue;
							}
							if (local210 == 1604) {
								Static133.anIntArray449[local25++] = local1085.anInt1662;
								continue;
							}
							if (local210 == 1605) {
								Static133.anIntArray449[local25++] = local1085.anInt1668;
								continue;
							}
							if (local210 == 1606) {
								Static133.anIntArray449[local25++] = local1085.anInt1647;
								continue;
							}
							if (local210 == 1607) {
								Static133.anIntArray449[local25++] = local1085.anInt1670;
								continue;
							}
							if (local210 == 1608) {
								Static133.anIntArray449[local25++] = local1085.anInt1671;
								continue;
							}
						} else if (local210 < 1800) {
							local1085 = local931 ? Static79.aClass5_Sub11_7 : Static34.aClass5_Sub11_4;
							if (local210 == 1700) {
								Static133.anIntArray449[local25++] = local1085.anInt1618;
								continue;
							}
							if (local210 == 1701) {
								if (local1085.anInt1618 == -1) {
									Static133.anIntArray449[local25++] = 0;
								} else {
									Static133.anIntArray449[local25++] = local1085.anInt1630;
								}
								continue;
							}
							if (local210 == 1702) {
								Static133.anIntArray449[local25++] = local1085.anInt1645;
								continue;
							}
						} else if (local210 < 1900) {
							local1085 = local931 ? Static79.aClass5_Sub11_7 : Static34.aClass5_Sub11_4;
							if (local210 == 1800) {
								Static133.anIntArray449[local25++] = Static27.method1860(Static42.method755(local1085));
								continue;
							}
							if (local210 == 1801) {
								local25--;
								local768 = Static133.anIntArray449[local25];
								local768--;
								if (local1085.aClass61Array9 != null && local1085.aClass61Array9.length > local768 && local1085.aClass61Array9[local768] != null) {
									Static2.aClass61Array2[local29++] = local1085.aClass61Array9[local768];
									continue;
								}
								Static2.aClass61Array2[local29++] = Static28.aClass61_269;
								continue;
							}
							if (local210 == 1802) {
								if (local1085.aClass61_510 == null) {
									Static2.aClass61Array2[local29++] = Static28.aClass61_269;
								} else {
									Static2.aClass61Array2[local29++] = local1085.aClass61_510;
								}
								continue;
							}
						} else if (local210 < 2600) {
							local25--;
							local1085 = Static88.method2191(Static133.anIntArray449[local25]);
							if (local210 == 2500) {
								Static133.anIntArray449[local25++] = local1085.anInt1665;
								continue;
							}
							if (local210 == 2501) {
								Static133.anIntArray449[local25++] = local1085.anInt1661;
								continue;
							}
							if (local210 == 2502) {
								Static133.anIntArray449[local25++] = local1085.anInt1653;
								continue;
							}
							if (local210 == 2503) {
								Static133.anIntArray449[local25++] = local1085.anInt1636;
								continue;
							}
							if (local210 == 2504) {
								Static133.anIntArray449[local25++] = local1085.aBoolean71 ? 1 : 0;
								continue;
							}
							if (local210 == 2505) {
								Static133.anIntArray449[local25++] = local1085.anInt1681;
								continue;
							}
						} else if (local210 < 2700) {
							local25--;
							local1085 = Static88.method2191(Static133.anIntArray449[local25]);
							if (local210 == 2600) {
								Static133.anIntArray449[local25++] = local1085.anInt1640;
								continue;
							}
							if (local210 == 2601) {
								Static133.anIntArray449[local25++] = local1085.anInt1660;
								continue;
							}
							if (local210 == 2602) {
								Static2.aClass61Array2[local29++] = local1085.aClass61_506;
								continue;
							}
							if (local210 == 2603) {
								Static133.anIntArray449[local25++] = local1085.anInt1634;
								continue;
							}
							if (local210 == 2604) {
								Static133.anIntArray449[local25++] = local1085.anInt1662;
								continue;
							}
							if (local210 == 2605) {
								Static133.anIntArray449[local25++] = local1085.anInt1668;
								continue;
							}
							if (local210 == 2606) {
								Static133.anIntArray449[local25++] = local1085.anInt1647;
								continue;
							}
							if (local210 == 2607) {
								Static133.anIntArray449[local25++] = local1085.anInt1670;
								continue;
							}
							if (local210 == 2608) {
								Static133.anIntArray449[local25++] = local1085.anInt1671;
								continue;
							}
						} else if (local210 < 2800) {
							if (local210 == 2700) {
								local25--;
								local1085 = Static88.method2191(Static133.anIntArray449[local25]);
								Static133.anIntArray449[local25++] = local1085.anInt1618;
								continue;
							}
							if (local210 == 2701) {
								local25--;
								local1085 = Static88.method2191(Static133.anIntArray449[local25]);
								if (local1085.anInt1618 == -1) {
									Static133.anIntArray449[local25++] = 0;
								} else {
									Static133.anIntArray449[local25++] = local1085.anInt1630;
								}
								continue;
							}
							if (local210 == 2702) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								@Pc(2672) Class5_Sub13 local2672 = (Class5_Sub13) Static28.aClass20_3.method656((long) local763);
								if (local2672 == null) {
									Static133.anIntArray449[local25++] = 0;
								} else {
									Static133.anIntArray449[local25++] = 1;
								}
								continue;
							}
						} else if (local210 < 2900) {
							local25--;
							local1085 = Static88.method2191(Static133.anIntArray449[local25]);
							if (local210 == 2800) {
								Static133.anIntArray449[local25++] = Static27.method1860(Static42.method755(local1085));
								continue;
							}
							if (local210 == 2801) {
								local25--;
								local768 = Static133.anIntArray449[local25];
								local768--;
								if (local1085.aClass61Array9 != null && local768 < local1085.aClass61Array9.length && local1085.aClass61Array9[local768] != null) {
									Static2.aClass61Array2[local29++] = local1085.aClass61Array9[local768];
									continue;
								}
								Static2.aClass61Array2[local29++] = Static28.aClass61_269;
								continue;
							}
							if (local210 == 2802) {
								if (local1085.aClass61_510 == null) {
									Static2.aClass61Array2[local29++] = Static28.aClass61_269;
								} else {
									Static2.aClass61Array2[local29++] = local1085.aClass61_510;
								}
								continue;
							}
						} else if (local210 < 3200) {
							if (local210 == 3100) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								Static91.method1596(Static28.aClass61_269, local582, 0);
								continue;
							}
							if (local210 == 3101) {
								local25 -= 2;
								Static29.method623(Static133.anIntArray449[local25], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10, Static133.anIntArray449[local25 + 1]);
								continue;
							}
							if (local210 == 3103) {
								Static61.method1055();
								continue;
							}
							if (local210 == 3104) {
								local768 = 0;
								local29--;
								local582 = Static2.aClass61Array2[local29];
								if (local582.method1715()) {
									local768 = local582.method1704();
								}
								Static1.aClass5_Sub14_Sub1_1.method1489(202);
								Static1.aClass5_Sub14_Sub1_1.method1451(local768);
								continue;
							}
							if (local210 == 3105) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								Static1.aClass5_Sub14_Sub1_1.method1489(129);
								Static1.aClass5_Sub14_Sub1_1.method1464(local582.method1723());
								continue;
							}
							if (local210 == 3106) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								Static1.aClass5_Sub14_Sub1_1.method1489(242);
								Static1.aClass5_Sub14_Sub1_1.method1440(local582.method1733() + 1);
								Static1.aClass5_Sub14_Sub1_1.method1483(local582);
								continue;
							}
							if (local210 == 3107) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								local29--;
								local1639 = Static2.aClass61Array2[local29];
								Static28.method615(local763, local1639);
								continue;
							}
							if (local210 == 3108) {
								local25 -= 3;
								local763 = Static133.anIntArray449[local25];
								local960 = Static133.anIntArray449[local25 + 2];
								local768 = Static133.anIntArray449[local25 + 1];
								local970 = Static88.method2191(local960);
								Static27.method1853(local970, local763, local768);
								continue;
							}
							if (local210 == 3109) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								local1140 = local931 ? Static79.aClass5_Sub11_7 : Static34.aClass5_Sub11_4;
								Static27.method1853(local1140, local763, local768);
								continue;
							}
						} else if (local210 < 3300) {
							if (local210 == 3200) {
								local25 -= 3;
								Static105.method2174(Static133.anIntArray449[local25 + 2], Static133.anIntArray449[local25], Static133.anIntArray449[local25 + 1]);
								continue;
							}
							if (local210 == 3201) {
								local25--;
								Static78.method1268(Static133.anIntArray449[local25]);
								continue;
							}
							if (local210 == 3202) {
								local25 -= 2;
								Static45.method853(Static133.anIntArray449[local25], Static133.anIntArray449[local25 + 1]);
								continue;
							}
						} else if (local210 < 3400) {
							if (local210 == 3300) {
								Static133.anIntArray449[local25++] = Static58.anInt1422;
								continue;
							}
							if (local210 == 3301) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = Static40.method740(local768, local763);
								continue;
							}
							if (local210 == 3302) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = Static101.method1707(local768, local763);
								continue;
							}
							if (local210 == 3303) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = Static132.method2183(local768, local763);
								continue;
							}
							if (local210 == 3304) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = Static92.method1469(local763).anInt527;
								continue;
							}
							if (local210 == 3305) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = Static118.anIntArray361[local763];
								continue;
							}
							if (local210 == 3306) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = Static23.anIntArray125[local763];
								continue;
							}
							if (local210 == 3307) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = Static100.anIntArray328[local763];
								continue;
							}
							if (local210 == 3308) {
								local763 = Static93.anInt2428;
								local768 = (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 >> 7) + Static19.anInt623;
								local960 = Static25.anInt730 + (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 >> 7);
								Static133.anIntArray449[local25++] = (local763 << 28) + (local768 << 14) + local960;
								continue;
							}
							if (local210 == 3309) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = local763 >> 14 & 0x3FFF;
								continue;
							}
							if (local210 == 3310) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = local763 >> 28;
								continue;
							}
							if (local210 == 3311) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = local763 & 0x3FFF;
								continue;
							}
							if (local210 == 3312) {
								Static133.anIntArray449[local25++] = Static54.aBoolean49 ? 1 : 0;
								continue;
							}
							if (local210 == 3313) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25] + 32768;
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = Static40.method740(local768, local763);
								continue;
							}
							if (local210 == 3314) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25] + 32768;
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = Static101.method1707(local768, local763);
								continue;
							}
							if (local210 == 3315) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25] + 32768;
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = Static132.method2183(local768, local763);
								continue;
							}
							if (local210 == 3316) {
								if (Static44.anInt1136 >= 2) {
									Static133.anIntArray449[local25++] = Static44.anInt1136;
								} else {
									Static133.anIntArray449[local25++] = 0;
								}
								continue;
							}
							if (local210 == 3317) {
								Static133.anIntArray449[local25++] = Static88.anInt3387;
								continue;
							}
							if (local210 == 3318) {
								Static133.anIntArray449[local25++] = Static67.anInt1683;
								continue;
							}
							if (local210 == 3321) {
								Static133.anIntArray449[local25++] = Static28.anInt901;
								continue;
							}
							if (local210 == 3322) {
								Static133.anIntArray449[local25++] = Static102.anInt2696;
								continue;
							}
							if (local210 == 3323) {
								if (Static44.anInt1136 == 1) {
									Static133.anIntArray449[local25++] = 1;
								} else {
									Static133.anIntArray449[local25++] = 0;
								}
								continue;
							}
						} else if (local210 < 3500) {
							if (local210 == 3400) {
								local25 -= 2;
								local768 = Static133.anIntArray449[local25 + 1];
								local763 = Static133.anIntArray449[local25];
								@Pc(3062) Class5_Sub2_Sub9 local3062 = Static37.method705(local763);
								for (local624 = 0; local624 < local3062.anInt1527; local624++) {
									if (local3062.anIntArray228[local624] == local768) {
										Static2.aClass61Array2[local29++] = local3062.aClass61Array8[local624];
										local3062 = null;
										break;
									}
								}
								if (local3062 != null) {
									Static2.aClass61Array2[local29++] = local3062.aClass61_479;
								}
								continue;
							}
							if (local210 == 3408) {
								local25 -= 4;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								local960 = Static133.anIntArray449[local25 + 2];
								local624 = Static133.anIntArray449[local25 + 3];
								@Pc(3130) Class5_Sub2_Sub9 local3130 = Static37.method705(local960);
								if (local3130.anInt1535 == local763 && local768 == local3130.anInt1531) {
									for (local995 = 0; local995 < local3130.anInt1527; local995++) {
										if (local3130.anIntArray228[local995] == local624) {
											if (local768 == 115) {
												Static2.aClass61Array2[local29++] = local3130.aClass61Array8[local995];
											} else {
												Static133.anIntArray449[local25++] = local3130.anIntArray230[local995];
											}
											local3130 = null;
											break;
										}
									}
									if (local3130 != null) {
										if (local768 == 115) {
											Static2.aClass61Array2[local29++] = local3130.aClass61_479;
										} else {
											Static133.anIntArray449[local25++] = local3130.anInt1525;
										}
									}
									continue;
								}
								if (local768 == 115) {
									Static2.aClass61Array2[local29++] = Static50.aClass61_392;
								} else {
									Static133.anIntArray449[local25++] = 0;
								}
								continue;
							}
						} else if (local210 < 3700) {
							if (local210 == 3600) {
								if (Static126.anInt3158 == 0) {
									Static133.anIntArray449[local25++] = -2;
								} else if (Static126.anInt3158 == 1) {
									Static133.anIntArray449[local25++] = -1;
								} else {
									Static133.anIntArray449[local25++] = Static45.anInt1203;
								}
								continue;
							}
							if (local210 == 3601) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								if (Static126.anInt3158 == 2 && Static45.anInt1203 > local763) {
									Static2.aClass61Array2[local29++] = Static1.aClass61Array1[local763];
									continue;
								}
								Static2.aClass61Array2[local29++] = Static28.aClass61_269;
								continue;
							}
							if (local210 == 3602) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								if (Static126.anInt3158 == 2 && local763 < Static45.anInt1203) {
									Static133.anIntArray449[local25++] = Static109.anIntArray339[local763];
									continue;
								}
								Static133.anIntArray449[local25++] = 0;
								continue;
							}
							if (local210 == 3603) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								if (Static126.anInt3158 == 2 && Static45.anInt1203 > local763) {
									Static133.anIntArray449[local25++] = Static99.anIntArray327[local763];
									continue;
								}
								Static133.anIntArray449[local25++] = 0;
								continue;
							}
							if (local210 == 3604) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								local25--;
								local768 = Static133.anIntArray449[local25];
								Static72.method1283(local582, local768);
								continue;
							}
							if (local210 == 3605) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								Static12.method257(local582.method1723());
								continue;
							}
							if (local210 == 3606) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								Static71.method1181(local582.method1723());
								continue;
							}
							if (local210 == 3607) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								Static116.method1885(local582.method1723());
								continue;
							}
							if (local210 == 3608) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								Static95.method1607(local582.method1723());
								continue;
							}
							if (local210 == 3609) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								if (local582.method1713(Static11.aClass61_100) || local582.method1713(Static108.aClass61_35)) {
									local582 = local582.method1724(7);
								}
								Static133.anIntArray449[local25++] = Static67.method1118(local582) ? 1 : 0;
								continue;
							}
							if (local210 == 3611) {
								if (Static85.aClass61_670 == null) {
									Static2.aClass61Array2[local29++] = Static28.aClass61_269;
								} else {
									Static2.aClass61Array2[local29++] = Static85.aClass61_670.method1701();
								}
								continue;
							}
							if (local210 == 3612) {
								if (Static85.aClass61_670 == null) {
									Static133.anIntArray449[local25++] = 0;
								} else {
									Static133.anIntArray449[local25++] = Static92.anInt2213;
								}
								continue;
							}
							if (local210 == 3613) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								if (Static85.aClass61_670 != null && Static92.anInt2213 > local763) {
									Static2.aClass61Array2[local29++] = Static88.aClass5_Sub12Array62[local763].aClass61_549.method1701();
									continue;
								}
								Static2.aClass61Array2[local29++] = Static28.aClass61_269;
								continue;
							}
							if (local210 == 3614) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								if (Static85.aClass61_670 != null && Static92.anInt2213 > local763) {
									Static133.anIntArray449[local25++] = Static88.aClass5_Sub12Array62[local763].anInt1768;
									continue;
								}
								Static133.anIntArray449[local25++] = 0;
								continue;
							}
							if (local210 == 3615) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								if (Static85.aClass61_670 != null && local763 < Static92.anInt2213) {
									Static133.anIntArray449[local25++] = Static88.aClass5_Sub12Array62[local763].aByte6;
									continue;
								}
								Static133.anIntArray449[local25++] = 0;
								continue;
							}
							if (local210 == 3616) {
								Static133.anIntArray449[local25++] = Static134.aByte8;
								continue;
							}
							if (local210 == 3617) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								Static86.method1535(local582);
								continue;
							}
							if (local210 == 3618) {
								Static133.anIntArray449[local25++] = Static45.aByte3;
								continue;
							}
							if (local210 == 3619) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								Static33.method674(local582.method1723());
								continue;
							}
							if (local210 == 3620) {
								Static65.method1102();
								continue;
							}
							if (local210 == 3621) {
								if (Static126.anInt3158 == 0) {
									Static133.anIntArray449[local25++] = -1;
								} else {
									Static133.anIntArray449[local25++] = Static114.anInt2962;
								}
								continue;
							}
							if (local210 == 3622) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								if (Static126.anInt3158 != 0 && local763 < Static114.anInt2962) {
									Static2.aClass61Array2[local29++] = Static111.method1831(Static68.aLongArray3[local763]).method1701();
									continue;
								}
								Static2.aClass61Array2[local29++] = Static28.aClass61_269;
								continue;
							}
							if (local210 == 3623) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								if (local582.method1713(Static11.aClass61_100) || local582.method1713(Static108.aClass61_35)) {
									local582 = local582.method1724(7);
								}
								Static133.anIntArray449[local25++] = Static19.method454(local582) ? 1 : 0;
								continue;
							}
							if (local210 == 3624) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								if (Static88.aClass5_Sub12Array62 != null && Static92.anInt2213 > local763 && Static88.aClass5_Sub12Array62[local763].aClass61_549.method1709(Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass61_877)) {
									Static133.anIntArray449[local25++] = 1;
									continue;
								}
								Static133.anIntArray449[local25++] = 0;
								continue;
							}
							if (local210 == 3625) {
								if (Static65.aClass61_492 == null) {
									Static2.aClass61Array2[local29++] = Static28.aClass61_269;
								} else {
									Static2.aClass61Array2[local29++] = Static65.aClass61_492.method1701();
								}
								continue;
							}
						} else if (local210 < 4100) {
							if (local210 == 4000) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = local768 + local763;
								continue;
							}
							if (local210 == 4001) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = local763 - local768;
								continue;
							}
							if (local210 == 4002) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = local768 * local763;
								continue;
							}
							if (local210 == 4003) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = local763 / local768;
								continue;
							}
							if (local210 == 4004) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = (int) (Math.random() * (double) local763);
								continue;
							}
							if (local210 == 4005) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = (int) (Math.random() * (double) (local763 + 1));
								continue;
							}
							if (local210 == 4006) {
								local25 -= 5;
								local624 = Static133.anIntArray449[local25 + 3];
								local649 = Static133.anIntArray449[local25 + 4];
								local960 = Static133.anIntArray449[local25 + 2];
								local768 = Static133.anIntArray449[local25 + 1];
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = local763 + (local649 - local960) * (-local763 + local768) / (local624 - local960);
								continue;
							}
							if (local210 == 4007) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = local768 * local763 / 100 + local763;
								continue;
							}
							if (local210 == 4008) {
								local25 -= 2;
								local768 = Static133.anIntArray449[local25 + 1];
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = local763 | 0x1 << local768;
								continue;
							}
							if (local210 == 4009) {
								local25 -= 2;
								local768 = Static133.anIntArray449[local25 + 1];
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = -(0x1 << local768) - 1 & local763;
								continue;
							}
							if (local210 == 4010) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = (0x1 << local768 & local763) == 0 ? 0 : 1;
								continue;
							}
							if (local210 == 4011) {
								local25 -= 2;
								local768 = Static133.anIntArray449[local25 + 1];
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = local763 % local768;
								continue;
							}
							if (local210 == 4012) {
								local25 -= 2;
								local768 = Static133.anIntArray449[local25 + 1];
								local763 = Static133.anIntArray449[local25];
								if (local763 == 0) {
									Static133.anIntArray449[local25++] = 0;
								} else {
									Static133.anIntArray449[local25++] = (int) Math.pow((double) local763, (double) local768);
								}
								continue;
							}
							if (local210 == 4013) {
								local25 -= 2;
								local768 = Static133.anIntArray449[local25 + 1];
								local763 = Static133.anIntArray449[local25];
								if (local763 == 0) {
									Static133.anIntArray449[local25++] = 0;
								} else if (local768 == 0) {
									Static133.anIntArray449[local25++] = Integer.MAX_VALUE;
								} else {
									Static133.anIntArray449[local25++] = (int) Math.pow((double) local763, 1.0D / (double) local768);
								}
								continue;
							}
							if (local210 == 4014) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = local763 & local768;
								continue;
							}
							if (local210 == 4015) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								Static133.anIntArray449[local25++] = local763 | local768;
								continue;
							}
						} else if (local210 < 4200) {
							if (local210 == 4100) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								local25--;
								local768 = Static133.anIntArray449[local25];
								Static2.aClass61Array2[local29++] = Static123.method1929(new Class61[] { local582, Static39.method730(local768) });
								continue;
							}
							if (local210 == 4101) {
								local29 -= 2;
								local1639 = Static2.aClass61Array2[local29 + 1];
								local582 = Static2.aClass61Array2[local29];
								Static2.aClass61Array2[local29++] = Static123.method1929(new Class61[] { local582, local1639 });
								continue;
							}
							if (local210 == 4102) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								local25--;
								local768 = Static133.anIntArray449[local25];
								Static2.aClass61Array2[local29++] = Static123.method1929(new Class61[] { local582, Static39.method735(local768) });
								continue;
							}
							if (local210 == 4103) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								Static2.aClass61Array2[local29++] = local582.method1711();
								continue;
							}
							if (local210 == 4104) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								@Pc(3989) long local3989 = ((long) local763 + 11745L) * 86400000L;
								Static79.aCalendar1.setTime(new Date(local3989));
								local624 = Static79.aCalendar1.get(5);
								local649 = Static79.aCalendar1.get(2);
								local995 = Static79.aCalendar1.get(1);
								Static2.aClass61Array2[local29++] = Static123.method1929(new Class61[] { Static39.method730(local624), Static90.aClass61_704, Static116.aClass61Array20[local649], Static90.aClass61_704, Static39.method730(local995) });
								continue;
							}
							if (local210 == 4105) {
								local29 -= 2;
								local582 = Static2.aClass61Array2[local29];
								local1639 = Static2.aClass61Array2[local29 + 1];
								if (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass37_2 != null && Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass37_2.aBoolean48) {
									Static2.aClass61Array2[local29++] = local1639;
									continue;
								}
								Static2.aClass61Array2[local29++] = local582;
								continue;
							}
							if (local210 == 4106) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static2.aClass61Array2[local29++] = Static39.method730(local763);
								continue;
							}
							if (local210 == 4107) {
								local29 -= 2;
								Static133.anIntArray449[local25++] = Static2.aClass61Array2[local29].method1717(Static2.aClass61Array2[local29 + 1]);
								continue;
							}
							@Pc(4140) byte[] local4140;
							@Pc(4145) Class5_Sub2_Sub1_Sub1_Sub1 local4145;
							if (local210 == 4108) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								local25 -= 2;
								local768 = Static133.anIntArray449[local25];
								local960 = Static133.anIntArray449[local25 + 1];
								local4140 = Static134.aClass26_Sub1_21.method1038(local960, 0);
								local4145 = new Class5_Sub2_Sub1_Sub1_Sub1(local4140);
								Static133.anIntArray449[local25++] = local4145.method567(local582, local768);
								continue;
							}
							if (local210 == 4109) {
								local25 -= 2;
								local768 = Static133.anIntArray449[local25];
								local29--;
								local582 = Static2.aClass61Array2[local29];
								local960 = Static133.anIntArray449[local25 + 1];
								local4140 = Static134.aClass26_Sub1_21.method1038(local960, 0);
								local4145 = new Class5_Sub2_Sub1_Sub1_Sub1(local4140);
								Static133.anIntArray449[local25++] = local4145.method552(local582, local768);
								continue;
							}
							if (local210 == 4110) {
								local29 -= 2;
								local582 = Static2.aClass61Array2[local29];
								local1639 = Static2.aClass61Array2[local29 + 1];
								local25--;
								if (Static133.anIntArray449[local25] == 1) {
									Static2.aClass61Array2[local29++] = local582;
								} else {
									Static2.aClass61Array2[local29++] = local1639;
								}
								continue;
							}
							if (local210 == 4111) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								Static2.aClass61Array2[local29++] = Static7.method570(local582);
								continue;
							}
							if (local210 == 4112) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								local25--;
								local768 = Static133.anIntArray449[local25];
								Static2.aClass61Array2[local29++] = local582.method1720(local768);
								continue;
							}
							if (local210 == 4113) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = Static28.method614(local763) ? 1 : 0;
								continue;
							}
							if (local210 == 4114) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = Static79.method1299(local763) ? 1 : 0;
								continue;
							}
							if (local210 == 4115) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = Static125.method1964(local763) ? 1 : 0;
								continue;
							}
							if (local210 == 4116) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = Static10.method189(local763) ? 1 : 0;
								continue;
							}
							if (local210 == 4117) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								if (local582 == null) {
									Static133.anIntArray449[local25++] = 0;
								} else {
									Static133.anIntArray449[local25++] = local582.method1733();
								}
								continue;
							}
							if (local210 == 4118) {
								local25 -= 2;
								local29--;
								local582 = Static2.aClass61Array2[local29];
								local768 = Static133.anIntArray449[local25];
								local960 = Static133.anIntArray449[local25 + 1];
								Static2.aClass61Array2[local29++] = local582.method1730(local960, local768);
								continue;
							}
							if (local210 == 4119) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								@Pc(4432) boolean local4432 = false;
								local1639 = Static27.method1858(local582.method1733());
								for (local624 = 0; local582.method1733() > local624; local624++) {
									local649 = local582.method1714(local624);
									if (local649 == 60) {
										local4432 = true;
									} else if (local649 == 62) {
										local4432 = false;
									} else if (!local4432) {
										local1639.method1703(local649);
									}
								}
								local1639.method1718();
								Static2.aClass61Array2[local29++] = local1639;
								continue;
							}
							if (local210 == 4120) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								local25 -= 2;
								local960 = Static133.anIntArray449[local25 + 1];
								local768 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = local582.method1727(local768, local960);
								continue;
							}
							if (local210 == 4121) {
								local29 -= 2;
								local582 = Static2.aClass61Array2[local29];
								local1639 = Static2.aClass61Array2[local29 + 1];
								local25--;
								local960 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = local582.method1705(local960, local1639);
								continue;
							}
						} else if (local210 < 4300) {
							if (local210 == 4200) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static2.aClass61Array2[local29++] = Static111.method1830(local763).aClass61_597;
								continue;
							}
							@Pc(4598) Class5_Sub2_Sub11 local4598;
							if (local210 == 4201) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								local4598 = Static111.method1830(local763);
								if (local768 >= 1 && local768 <= 5 && local4598.aClass61Array14[local768 - 1] != null) {
									Static2.aClass61Array2[local29++] = local4598.aClass61Array14[local768 - 1];
									continue;
								}
								Static2.aClass61Array2[local29++] = Static28.aClass61_269;
								continue;
							}
							if (local210 == 4202) {
								local25 -= 2;
								local763 = Static133.anIntArray449[local25];
								local768 = Static133.anIntArray449[local25 + 1];
								local4598 = Static111.method1830(local763);
								if (local768 >= 1 && local768 <= 5 && local4598.aClass61Array15[local768 - 1] != null) {
									Static2.aClass61Array2[local29++] = local4598.aClass61Array15[local768 - 1];
									continue;
								}
								Static2.aClass61Array2[local29++] = Static28.aClass61_269;
								continue;
							}
							if (local210 == 4203) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = Static111.method1830(local763).anInt1953;
								continue;
							}
							if (local210 == 4204) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = Static111.method1830(local763).anInt1940 == 1 ? 1 : 0;
								continue;
							}
							@Pc(4745) Class5_Sub2_Sub11 local4745;
							if (local210 == 4205) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								local4745 = Static111.method1830(local763);
								if (local4745.anInt1943 == -1 && local4745.anInt1968 >= 0) {
									Static133.anIntArray449[local25++] = local4745.anInt1968;
									continue;
								}
								Static133.anIntArray449[local25++] = local763;
								continue;
							}
							if (local210 == 4206) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								local4745 = Static111.method1830(local763);
								if (local4745.anInt1943 >= 0 && local4745.anInt1968 >= 0) {
									Static133.anIntArray449[local25++] = local4745.anInt1968;
									continue;
								}
								Static133.anIntArray449[local25++] = local763;
								continue;
							}
							if (local210 == 4207) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								Static133.anIntArray449[local25++] = Static111.method1830(local763).aBoolean74 ? 1 : 0;
								continue;
							}
						} else if (local210 < 5100) {
							if (local210 == 5000) {
								Static133.anIntArray449[local25++] = Static124.anInt3090;
								continue;
							}
							if (local210 == 5001) {
								local25 -= 3;
								Static124.anInt3090 = Static133.anIntArray449[local25];
								Static73.anInt1740 = Static133.anIntArray449[local25 + 1];
								Static17.anInt525 = Static133.anIntArray449[local25 + 2];
								Static1.aClass5_Sub14_Sub1_1.method1489(175);
								Static1.aClass5_Sub14_Sub1_1.method1440(Static124.anInt3090);
								Static1.aClass5_Sub14_Sub1_1.method1440(Static73.anInt1740);
								Static1.aClass5_Sub14_Sub1_1.method1440(Static17.anInt525);
								continue;
							}
							if (local210 == 5002) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								local25 -= 2;
								local960 = Static133.anIntArray449[local25 + 1];
								local768 = Static133.anIntArray449[local25];
								Static1.aClass5_Sub14_Sub1_1.method1489(1);
								Static1.aClass5_Sub14_Sub1_1.method1464(local582.method1723());
								Static1.aClass5_Sub14_Sub1_1.method1440(local768 - 1);
								Static1.aClass5_Sub14_Sub1_1.method1440(local960);
								continue;
							}
							if (local210 == 5003) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								local1639 = null;
								if (local763 < 100) {
									local1639 = Static70.aClass61Array12[local763];
								}
								if (local1639 == null) {
									local1639 = Static28.aClass61_269;
								}
								Static2.aClass61Array2[local29++] = local1639;
								continue;
							}
							if (local210 == 5004) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								local768 = -1;
								if (local763 < 100 && Static70.aClass61Array12[local763] != null) {
									local768 = Static121.anIntArray362[local763];
								}
								Static133.anIntArray449[local25++] = local768;
								continue;
							}
							if (local210 == 5005) {
								Static133.anIntArray449[local25++] = Static73.anInt1740;
								continue;
							}
							if (local210 == 5008) {
								local29--;
								local582 = Static2.aClass61Array2[local29];
								if (local582.method1713(Static90.aClass61_703)) {
									Static61.method1053(local582);
								} else {
									local1639 = local582.method1711();
									@Pc(5034) byte local5034 = 0;
									@Pc(5036) byte local5036 = 0;
									if (local1639.method1713(Static89.aClass61_692)) {
										local5034 = 0;
										local582 = local582.method1724(Static89.aClass61_692.method1733());
									} else if (local1639.method1713(Static77.aClass61_589)) {
										local5034 = 1;
										local582 = local582.method1724(Static77.aClass61_589.method1733());
									} else if (local1639.method1713(Static116.aClass61_916)) {
										local5034 = 2;
										local582 = local582.method1724(Static116.aClass61_916.method1733());
									} else if (local1639.method1713(Static27.aClass61_876)) {
										local5034 = 3;
										local582 = local582.method1724(Static27.aClass61_876.method1733());
									} else if (local1639.method1713(Static1.aClass61_2)) {
										local582 = local582.method1724(Static1.aClass61_2.method1733());
										local5034 = 4;
									} else if (local1639.method1713(Static85.aClass61_668)) {
										local5034 = 5;
										local582 = local582.method1724(Static85.aClass61_668.method1733());
									} else if (local1639.method1713(Static9.aClass61_83)) {
										local582 = local582.method1724(Static9.aClass61_83.method1733());
										local5034 = 6;
									} else if (local1639.method1713(Static97.aClass61_759)) {
										local582 = local582.method1724(Static97.aClass61_759.method1733());
										local5034 = 7;
									} else if (local1639.method1713(Static24.aClass61_217)) {
										local582 = local582.method1724(Static24.aClass61_217.method1733());
										local5034 = 8;
									} else if (local1639.method1713(Static31.aClass61_285)) {
										local5034 = 9;
										local582 = local582.method1724(Static31.aClass61_285.method1733());
									} else if (local1639.method1713(Static82.aClass61_655)) {
										local5034 = 10;
										local582 = local582.method1724(Static82.aClass61_655.method1733());
									} else if (local1639.method1713(Static125.aClass61_993)) {
										local5034 = 11;
										local582 = local582.method1724(Static125.aClass61_993.method1733());
									} else if (Static13.anInt367 != 0) {
										if (local1639.method1713(Static89.aClass61_693)) {
											local5034 = 0;
											local582 = local582.method1724(Static89.aClass61_693.method1733());
										} else if (local1639.method1713(Static77.aClass61_585)) {
											local582 = local582.method1724(Static77.aClass61_585.method1733());
											local5034 = 1;
										} else if (local1639.method1713(Static116.aClass61_921)) {
											local582 = local582.method1724(Static116.aClass61_921.method1733());
											local5034 = 2;
										} else if (local1639.method1713(Static27.aClass61_871)) {
											local582 = local582.method1724(Static27.aClass61_871.method1733());
											local5034 = 3;
										} else if (local1639.method1713(Static1.aClass61_3)) {
											local582 = local582.method1724(Static1.aClass61_3.method1733());
											local5034 = 4;
										} else if (local1639.method1713(Static85.aClass61_666)) {
											local582 = local582.method1724(Static85.aClass61_666.method1733());
											local5034 = 5;
										} else if (local1639.method1713(Static9.aClass61_86)) {
											local5034 = 6;
											local582 = local582.method1724(Static9.aClass61_86.method1733());
										} else if (local1639.method1713(Static97.aClass61_758)) {
											local582 = local582.method1724(Static97.aClass61_758.method1733());
											local5034 = 7;
										} else if (local1639.method1713(Static24.aClass61_219)) {
											local5034 = 8;
											local582 = local582.method1724(Static24.aClass61_219.method1733());
										} else if (local1639.method1713(Static31.aClass61_288)) {
											local5034 = 9;
											local582 = local582.method1724(Static31.aClass61_288.method1733());
										} else if (local1639.method1713(Static82.aClass61_654)) {
											local5034 = 10;
											local582 = local582.method1724(Static82.aClass61_654.method1733());
										} else if (local1639.method1713(Static125.aClass61_1002)) {
											local5034 = 11;
											local582 = local582.method1724(Static125.aClass61_1002.method1733());
										}
									}
									local1639 = local582.method1711();
									if (local1639.method1713(Static45.aClass61_360)) {
										local5036 = 1;
										local582 = local582.method1724(Static45.aClass61_360.method1733());
									} else if (local1639.method1713(Static125.aClass61_1003)) {
										local582 = local582.method1724(Static125.aClass61_1003.method1733());
										local5036 = 2;
									} else if (local1639.method1713(Static96.aClass61_748)) {
										local5036 = 3;
										local582 = local582.method1724(Static96.aClass61_748.method1733());
									} else if (local1639.method1713(Static86.aClass61_676)) {
										local582 = local582.method1724(Static86.aClass61_676.method1733());
										local5036 = 4;
									} else if (local1639.method1713(Static126.aClass61_1010)) {
										local582 = local582.method1724(Static126.aClass61_1010.method1733());
										local5036 = 5;
									} else if (Static13.anInt367 != 0) {
										if (local1639.method1713(Static45.aClass61_365)) {
											local5036 = 1;
											local582 = local582.method1724(Static45.aClass61_365.method1733());
										} else if (local1639.method1713(Static125.aClass61_995)) {
											local5036 = 2;
											local582 = local582.method1724(Static125.aClass61_995.method1733());
										} else if (local1639.method1713(Static96.aClass61_749)) {
											local5036 = 3;
											local582 = local582.method1724(Static96.aClass61_749.method1733());
										} else if (local1639.method1713(Static86.aClass61_675)) {
											local5036 = 4;
											local582 = local582.method1724(Static86.aClass61_675.method1733());
										} else if (local1639.method1713(Static126.aClass61_1006)) {
											local582 = local582.method1724(Static126.aClass61_1006.method1733());
											local5036 = 5;
										}
									}
									Static1.aClass5_Sub14_Sub1_1.method1489(222);
									Static1.aClass5_Sub14_Sub1_1.method1440(0);
									local649 = Static1.aClass5_Sub14_Sub1_1.anInt2199;
									Static1.aClass5_Sub14_Sub1_1.method1440(local5034);
									Static1.aClass5_Sub14_Sub1_1.method1440(local5036);
									Static93.method1599(Static1.aClass5_Sub14_Sub1_1, local582);
									Static1.aClass5_Sub14_Sub1_1.method1485(Static1.aClass5_Sub14_Sub1_1.anInt2199 - local649);
								}
								continue;
							}
							if (local210 == 5009) {
								local29 -= 2;
								local582 = Static2.aClass61Array2[local29];
								local1639 = Static2.aClass61Array2[local29 + 1];
								Static1.aClass5_Sub14_Sub1_1.method1489(64);
								Static1.aClass5_Sub14_Sub1_1.method1440(0);
								local960 = Static1.aClass5_Sub14_Sub1_1.anInt2199;
								Static1.aClass5_Sub14_Sub1_1.method1464(local582.method1723());
								Static93.method1599(Static1.aClass5_Sub14_Sub1_1, local1639);
								Static1.aClass5_Sub14_Sub1_1.method1485(Static1.aClass5_Sub14_Sub1_1.anInt2199 - local960);
								continue;
							}
							if (local210 == 5010) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								local1639 = null;
								if (local763 < 100) {
									local1639 = Static21.aClass61Array4[local763];
								}
								if (local1639 == null) {
									local1639 = Static28.aClass61_269;
								}
								Static2.aClass61Array2[local29++] = local1639;
								continue;
							}
							if (local210 == 5011) {
								local25--;
								local763 = Static133.anIntArray449[local25];
								local1639 = null;
								if (local763 < 100) {
									local1639 = Static68.aClass61Array11[local763];
								}
								if (local1639 == null) {
									local1639 = Static28.aClass61_269;
								}
								Static2.aClass61Array2[local29++] = local1639;
								continue;
							}
							if (local210 == 5015) {
								if (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10 == null || Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass61_877 == null) {
									local582 = Static112.aClass61_881;
								} else {
									local582 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass61_877;
								}
								Static2.aClass61Array2[local29++] = local582;
								continue;
							}
							if (local210 == 5016) {
								Static133.anIntArray449[local25++] = Static17.anInt525;
								continue;
							}
							if (local210 == 5017) {
								Static133.anIntArray449[local25++] = Static4.anInt2613;
								continue;
							}
						}
					} else {
						if (local210 < 2000) {
							local1085 = local931 ? Static79.aClass5_Sub11_7 : Static34.aClass5_Sub11_4;
						} else {
							local210 -= 1000;
							local25--;
							local1085 = Static88.method2191(Static133.anIntArray449[local25]);
						}
						if (local210 == 1300) {
							local25--;
							local768 = Static133.anIntArray449[local25] - 1;
							if (local768 >= 0 && local768 <= 9) {
								local29--;
								local1085.method1125(Static2.aClass61Array2[local29], local768);
								continue;
							}
							local29--;
							continue;
						}
						if (local210 == 1301) {
							local25 -= 2;
							local768 = Static133.anIntArray449[local25];
							local960 = Static133.anIntArray449[local25 + 1];
							local1085.aClass5_Sub11_5 = Static98.method1667(local768, local960);
							continue;
						}
						if (local210 == 1302) {
							local25--;
							local1085.aBoolean69 = Static133.anIntArray449[local25] == 1;
							continue;
						}
						if (local210 == 1303) {
							local25--;
							local1085.anInt1643 = Static133.anIntArray449[local25];
							continue;
						}
						if (local210 == 1304) {
							local25--;
							local1085.anInt1620 = Static133.anIntArray449[local25];
							continue;
						}
						if (local210 == 1305) {
							local29--;
							local1085.aClass61_510 = Static2.aClass61Array2[local29];
							continue;
						}
						if (local210 == 1306) {
							local29--;
							local1085.aClass61_509 = Static2.aClass61Array2[local29];
							continue;
						}
						if (local210 == 1307) {
							local1085.aClass61Array9 = null;
							continue;
						}
					}
				} else {
					if (local210 >= 2000) {
						local210 -= 1000;
						local25--;
						local1085 = Static88.method2191(Static133.anIntArray449[local25]);
					} else {
						local1085 = local931 ? Static79.aClass5_Sub11_7 : Static34.aClass5_Sub11_4;
					}
					if (local210 == 1000) {
						local25 -= 2;
						local1085.anInt1665 = Static133.anIntArray449[local25];
						local1085.anInt1661 = Static133.anIntArray449[local25 + 1];
						Static24.method505(local1085);
						continue;
					}
					if (local210 == 1001) {
						local25 -= 2;
						local1085.anInt1653 = Static133.anIntArray449[local25];
						local1085.anInt1636 = Static133.anIntArray449[local25 + 1];
						Static24.method505(local1085);
						continue;
					}
					if (local210 == 1003) {
						local25--;
						@Pc(1262) boolean local1262 = Static133.anIntArray449[local25] == 1;
						if (local1085.aBoolean71 != local1262) {
							local1085.aBoolean71 = local1262;
							Static24.method505(local1085);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7067) Exception local7067) {
			if (local18.aClass61_973 == null) {
				if (Static30.anInt925 != 0) {
					Static91.method1596(Static28.aClass61_269, Static65.aClass61_493, 0);
				}
				Static21.method462("CS2 - scr:" + local18.aLong100 + " op:" + local37, local7067);
			} else {
				@Pc(7100) Class61 local7100 = Static27.method1858(30);
				local7100.method1721(Static111.aClass61_859).method1721(local18.aClass61_973);
				for (local51 = Static91.anInt2424 - 1; local51 >= 0; local51--) {
					local7100.method1721(Static25.aClass61_225).method1721(Static114.aClass23Array1[local51].aClass5_Sub2_Sub15_1.aClass61_973);
				}
				if (local37 == 40) {
					local89 = local35[local27];
					local7100.method1721(Static109.aClass61_848).method1721(Static39.method730(local89));
				}
				if (Static30.anInt925 != 0) {
					Static91.method1596(Static28.aClass61_269, Static123.method1929(new Class61[] { Static38.aClass61_464, local18.aClass61_973 }), 0);
				}
				Static21.method462("CS2 - scr:" + local18.aLong100 + " op:" + local37 + new String(local7100.method1719()), local7067);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIIIIII)V")
	public static void method1229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static21.method461(arg1)) {
			Static132.aClass5_Sub11Array2 = null;
			Static82.method1496(arg3, arg5, Static56.aClass5_Sub11ArrayArray1[arg1], arg7, arg2, arg0, arg6, -1, arg4);
			if (Static132.aClass5_Sub11Array2 != null) {
				Static82.method1496(arg3, Static32.anInt958, Static132.aClass5_Sub11Array2, arg7, arg2, arg0, arg6, -1412584499, Static113.anInt2958);
				Static132.aClass5_Sub11Array2 = null;
			}
		} else if (arg7 == -1) {
			for (@Pc(22) int local22 = 0; local22 < 100; local22++) {
				Static48.aBooleanArray5[local22] = true;
			}
		} else {
			Static48.aBooleanArray5[arg7] = true;
		}
	}
}
