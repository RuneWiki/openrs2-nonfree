import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!pa;")
	public static Class63 aClass63_17 = new Class63(30);

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!eh;")
	public static Class28 aClass28_838 = Static170.method3101("Ausw-=hlen");

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "Lclient!eh;")
	private static Class28 aClass28_840 = Static170.method3101("Select");

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "Lclient!eh;")
	public static Class28 aClass28_839 = aClass28_840;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	public static int anInt2652 = 0;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
	public static int anInt2654 = -1;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "Lclient!eh;")
	private static Class28 aClass28_841 = Static170.method3101("Error loading your profile)3");

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Lclient!eh;")
	public static Class28 aClass28_842 = aClass28_841;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)Z")
	public static boolean method2105() {
		if (Static52.aClass38_1 == null) {
			return false;
		}
		@Pc(154) int local154;
		try {
			@Pc(11) int local11 = Static52.aClass38_1.method1634();
			if (local11 == 0) {
				return false;
			}
			if (Static159.anInt3903 == -1) {
				local11--;
				Static52.aClass38_1.method1636(0, Static18.aClass3_Sub8_Sub1_1.aByteArray19, 1);
				Static18.aClass3_Sub8_Sub1_1.anInt1948 = 0;
				Static159.anInt3903 = Static18.aClass3_Sub8_Sub1_1.method1558();
				Static11.anInt410 = Static66.anIntArray342[Static159.anInt3903];
			}
			if (Static11.anInt410 == -1) {
				if (local11 <= 0) {
					return false;
				}
				Static52.aClass38_1.method1636(0, Static18.aClass3_Sub8_Sub1_1.aByteArray19, 1);
				local11--;
				Static11.anInt410 = Static18.aClass3_Sub8_Sub1_1.aByteArray19[0] & 0xFF;
			}
			if (Static11.anInt410 == -2) {
				if (local11 <= 1) {
					return false;
				}
				Static52.aClass38_1.method1636(0, Static18.aClass3_Sub8_Sub1_1.aByteArray19, 2);
				local11 -= 2;
				Static18.aClass3_Sub8_Sub1_1.anInt1948 = 0;
				Static11.anInt410 = Static18.aClass3_Sub8_Sub1_1.method1510();
			}
			if (local11 < Static11.anInt410) {
				return false;
			}
			Static18.aClass3_Sub8_Sub1_1.anInt1948 = 0;
			Static52.aClass38_1.method1636(0, Static18.aClass3_Sub8_Sub1_1.aByteArray19, Static11.anInt410);
			Static93.anInt2607 = 0;
			Static15.anInt1152 = Static65.anInt2024;
			Static65.anInt2024 = Static139.anInt3669;
			Static139.anInt3669 = Static159.anInt3903;
			if (Static159.anInt3903 == 135) {
				Static135.anInt3444 = Static18.aClass3_Sub8_Sub1_1.method1549() * 30;
				Static95.anInt2637 = Static90.anInt2570;
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 236) {
				Static29.method750(Static18.aClass3_Sub8_Sub1_1);
				Static159.anInt3903 = -1;
				return true;
			}
			@Pc(162) int local162;
			@Pc(150) int local150;
			@Pc(158) int local158;
			@Pc(166) int local166;
			if (Static159.anInt3903 == 99) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1545();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1545();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1545();
				local162 = Static18.aClass3_Sub8_Sub1_1.method1545();
				local166 = Static18.aClass3_Sub8_Sub1_1.method1510();
				Static175.aBooleanArray21[local150] = true;
				Static7.anIntArray84[local150] = local154;
				Static64.anIntArray333[local150] = local158;
				Static83.anIntArray410[local150] = local162;
				Static173.anIntArray689[local150] = local166;
				Static159.anInt3903 = -1;
				return true;
			}
			@Pc(211) Class33 local211;
			if (Static159.anInt3903 == 130) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1510();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1510();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1551();
				local211 = Static19.method576(local158);
				local211.anInt1468 = (local150 << 16) + local154;
				Static159.anInt3903 = -1;
				return true;
			}
			@Pc(231) Class28 local231;
			if (Static159.anInt3903 == 184) {
				local231 = Static18.aClass3_Sub8_Sub1_1.method1516();
				@Pc(238) Object[] local238 = new Object[local231.method901() + 1];
				for (local158 = local231.method901() - 1; local158 >= 0; local158--) {
					if (local231.method917(local158) == 115) {
						local238[local158 + 1] = Static18.aClass3_Sub8_Sub1_1.method1516();
					} else {
						local238[local158 + 1] = Integer.valueOf(Static18.aClass3_Sub8_Sub1_1.method1540());
					}
				}
				local238[0] = Integer.valueOf(Static18.aClass3_Sub8_Sub1_1.method1540());
				@Pc(292) Class3_Sub6 local292 = new Class3_Sub6();
				local292.anObjectArray2 = local238;
				Static163.method3014(local292);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 77) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1551();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1510();
				if (local154 == 65535) {
					local154 = -1;
				}
				local158 = Static18.aClass3_Sub8_Sub1_1.method1533();
				local211 = Static19.method576(local150);
				@Pc(343) Class3_Sub2_Sub10 local343;
				if (local211.aBoolean90) {
					local211.anInt1514 = local154;
					local211.anInt1511 = local158;
					local343 = Static76.method1736(local154);
					local211.anInt1526 = local343.anInt1879;
					local211.anInt1459 = local343.anInt1867;
					local211.anInt1474 = local343.anInt1895;
					local211.anInt1504 = local343.anInt1884;
					local211.anInt1508 = local343.anInt1873;
					local211.anInt1519 = local343.anInt1880;
					if (local211.anInt1457 > 0) {
						local211.anInt1519 = local211.anInt1519 * 32 / local211.anInt1457;
					}
					Static16.method534(local211);
				} else if (local154 == -1) {
					Static159.anInt3903 = -1;
					local211.anInt1493 = 0;
					return true;
				} else {
					local343 = Static76.method1736(local154);
					local211.anInt1455 = local154;
					local211.anInt1474 = local343.anInt1895;
					local211.anInt1519 = local343.anInt1880 * 100 / local158;
					local211.anInt1508 = local343.anInt1873;
					local211.anInt1493 = 4;
					Static16.method534(local211);
				}
				Static159.anInt3903 = -1;
				return true;
			}
			@Pc(459) int local459;
			if (Static159.anInt3903 == 10) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1551();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1502();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1502();
				local211 = Static19.method576(local150);
				local166 = local211.anInt1497 + local158;
				local459 = local154 + local211.anInt1491;
				if (local166 != local211.anInt1492 || local459 != local211.anInt1480) {
					local211.anInt1492 = local166;
					local211.anInt1480 = local459;
					Static16.method534(local211);
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 242) {
				Static31.method791();
				Static159.anInt3903 = -1;
				return false;
			}
			if (Static159.anInt3903 == 231) {
				Static82.anInt2391 = Static18.aClass3_Sub8_Sub1_1.method1545();
				if (Static82.anInt2391 == 1) {
					Static22.anInt590 = Static18.aClass3_Sub8_Sub1_1.method1510();
				}
				if (Static82.anInt2391 >= 2 && Static82.anInt2391 <= 6) {
					if (Static82.anInt2391 == 2) {
						Static170.anInt4091 = 64;
						Static44.anInt3940 = 64;
					}
					if (Static82.anInt2391 == 3) {
						Static44.anInt3940 = 64;
						Static170.anInt4091 = 0;
					}
					if (Static82.anInt2391 == 4) {
						Static44.anInt3940 = 64;
						Static170.anInt4091 = 128;
					}
					if (Static82.anInt2391 == 5) {
						Static44.anInt3940 = 0;
						Static170.anInt4091 = 64;
					}
					if (Static82.anInt2391 == 6) {
						Static170.anInt4091 = 64;
						Static44.anInt3940 = 128;
					}
					Static82.anInt2391 = 2;
					Static145.anInt3634 = Static18.aClass3_Sub8_Sub1_1.method1510();
					Static84.anInt2468 = Static18.aClass3_Sub8_Sub1_1.method1510();
					Static32.anInt979 = Static18.aClass3_Sub8_Sub1_1.method1545();
				}
				if (Static82.anInt2391 == 10) {
					Static71.anInt2137 = Static18.aClass3_Sub8_Sub1_1.method1510();
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 21) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1540();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1549();
				local158 = local154 >> 10 & 0x1F;
				@Pc(608) Class33 local608 = Static19.method576(local150);
				local166 = local154 & 0x1F;
				local162 = local154 >> 5 & 0x1F;
				local459 = (local166 << 3) + (local162 << 11) + (local158 << 19);
				if (local459 != local608.anInt1461) {
					local608.anInt1461 = local459;
					Static16.method534(local608);
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 17) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1535();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1535();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1535();
				Static171.anInt4109 = local158 >> 1;
				Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.method1431(local150, (local158 & 0x1) == 1, local154);
				Static159.anInt3903 = -1;
				return true;
			}
			@Pc(699) Class28 local699;
			if (Static159.anInt3903 == 8) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1525();
				local699 = Static18.aClass3_Sub8_Sub1_1.method1516();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1535();
				if (local158 >= 1 && local158 <= 8) {
					if (local699.method936(Static50.aClass28_439)) {
						local699 = null;
					}
					Static140.aClass28Array21[local158 - 1] = local699;
					Static98.aBooleanArray14[local158 - 1] = local150 == 0;
				}
				Static159.anInt3903 = -1;
				return true;
			}
			@Pc(878) int local878;
			@Pc(965) int local965;
			@Pc(752) long local752;
			@Pc(872) int local872;
			@Pc(911) int local911;
			if (Static159.anInt3903 == 206) {
				local752 = Static18.aClass3_Sub8_Sub1_1.method1511();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1510();
				local162 = Static18.aClass3_Sub8_Sub1_1.method1545();
				@Pc(766) Class28 local766 = Static149.method2829(local752).method912();
				for (local459 = 0; local459 < Static66.anInt2068; local459++) {
					if (Static26.aLongArray4[local459] == local752) {
						if (Static114.anIntArray509[local459] != local158) {
							Static114.anIntArray509[local459] = local158;
							if (local158 > 0) {
								Static51.method1192(Static156.aClass28_1306, 5, Static4.method96(new Class28[] { local766, Static31.aClass28_318 }));
							}
							if (local158 == 0) {
								Static51.method1192(Static156.aClass28_1306, 5, Static4.method96(new Class28[] { local766, Static16.aClass28_190 }));
							}
						}
						Static165.anIntArray669[local459] = local162;
						local766 = null;
						break;
					}
				}
				if (local766 != null && Static66.anInt2068 < 200) {
					Static26.aLongArray4[Static66.anInt2068] = local752;
					Static37.aClass28Array4[Static66.anInt2068] = local766;
					Static114.anIntArray509[Static66.anInt2068] = local158;
					Static165.anIntArray669[Static66.anInt2068] = local162;
					Static66.anInt2068++;
				}
				Static31.anInt968 = Static90.anInt2570;
				local872 = Static66.anInt2068;
				while (local872 > 0) {
					local872--;
					@Pc(876) boolean local876 = true;
					for (local878 = 0; local878 < local872; local878++) {
						if (Static114.anIntArray509[local878] != Static170.anInt4098 && Static170.anInt4098 == Static114.anIntArray509[local878 + 1] || Static114.anIntArray509[local878] == 0 && Static114.anIntArray509[local878 + 1] != 0) {
							local876 = false;
							local911 = Static114.anIntArray509[local878];
							Static114.anIntArray509[local878] = Static114.anIntArray509[local878 + 1];
							Static114.anIntArray509[local878 + 1] = local911;
							@Pc(929) Class28 local929 = Static37.aClass28Array4[local878];
							Static37.aClass28Array4[local878] = Static37.aClass28Array4[local878 + 1];
							Static37.aClass28Array4[local878 + 1] = local929;
							@Pc(947) long local947 = Static26.aLongArray4[local878];
							Static26.aLongArray4[local878] = Static26.aLongArray4[local878 + 1];
							Static26.aLongArray4[local878 + 1] = local947;
							local965 = Static165.anIntArray669[local878];
							Static165.anIntArray669[local878] = Static165.anIntArray669[local878 + 1];
							Static165.anIntArray669[local878 + 1] = local965;
						}
					}
					if (local876) {
						break;
					}
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 45) {
				Static4.anInt128 = Static11.anInt410 / 8;
				for (local150 = 0; local150 < Static4.anInt128; local150++) {
					Static21.aLongArray3[local150] = Static18.aClass3_Sub8_Sub1_1.method1511();
					Static11.aClass28Array2[local150] = Static149.method2829(Static21.aLongArray3[local150]);
				}
				Static31.anInt968 = Static90.anInt2570;
				Static159.anInt3903 = -1;
				return true;
			}
			@Pc(1037) Class33 local1037;
			if (Static159.anInt3903 == 142) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1540();
				local1037 = Static19.method576(local150);
				local1037.anInt1493 = 3;
				local1037.anInt1455 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass76_1.method2976();
				Static16.method534(local1037);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 165) {
				Static75.method1728();
				Static139.anInt3674 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static95.anInt2637 = Static90.anInt2570;
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 159 || Static159.anInt3903 == 63 || Static159.anInt3903 == 174 || Static159.anInt3903 == 61 || Static159.anInt3903 == 88 || Static159.anInt3903 == 65 || Static159.anInt3903 == 127 || Static159.anInt3903 == 198 || Static159.anInt3903 == 141 || Static159.anInt3903 == 29 || Static159.anInt3903 == 39) {
				Static126.method2499();
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 86) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1527();
				if (local150 == 65535) {
					local150 = -1;
				}
				local154 = Static18.aClass3_Sub8_Sub1_1.method1533();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1549();
				local162 = Static18.aClass3_Sub8_Sub1_1.method1540();
				if (local158 == 65535) {
					local158 = -1;
				}
				for (local166 = local150; local166 <= local158; local166++) {
					@Pc(1157) long local1157 = ((long) local162 << 32) + (long) local166;
					@Pc(1162) Class3 local1162 = Static30.aClass87_3.method3201(local1157);
					if (local1162 != null) {
						local1162.method3167();
					}
					Static30.aClass87_3.method3200(local1157, new Class3_Sub24(local154));
				}
				Static159.anInt3903 = -1;
				return true;
			}
			@Pc(1336) long local1336;
			@Pc(1284) Class3_Sub7 local1284;
			@Pc(1321) int local1321;
			if (Static159.anInt3903 == 245) {
				local150 = Static11.anInt410 + Static18.aClass3_Sub8_Sub1_1.anInt1948;
				local154 = Static18.aClass3_Sub8_Sub1_1.method1510();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1510();
				if (local154 != Static177.anInt4207) {
					Static177.anInt4207 = local154;
					Static126.method2500(Static177.anInt4207);
					Static5.method103(Static177.anInt4207);
					for (local162 = 0; local162 < 100; local162++) {
						Static137.aBooleanArray15[local162] = true;
					}
				}
				while (local158-- > 0) {
					local162 = Static18.aClass3_Sub8_Sub1_1.method1540();
					local166 = Static18.aClass3_Sub8_Sub1_1.method1510();
					local459 = Static18.aClass3_Sub8_Sub1_1.method1545();
					@Pc(1249) Class3_Sub7 local1249 = (Class3_Sub7) Static119.aClass87_11.method3201((long) local162);
					if (local1249 != null && local1249.anInt1548 != local166) {
						Static160.method2984(true, local1249);
						local1249 = null;
					}
					if (local1249 == null) {
						local1249 = Static144.method1398(local166, local459, local162);
					}
					local1249.aBoolean91 = true;
				}
				for (local1284 = (Class3_Sub7) Static119.aClass87_11.method3203(); local1284 != null; local1284 = (Class3_Sub7) Static119.aClass87_11.method3199()) {
					if (local1284.aBoolean91) {
						local1284.aBoolean91 = false;
					} else {
						Static160.method2984(true, local1284);
					}
				}
				Static30.aClass87_3 = new Class87(512);
				while (Static18.aClass3_Sub8_Sub1_1.anInt1948 < local150) {
					local166 = Static18.aClass3_Sub8_Sub1_1.method1540();
					local459 = Static18.aClass3_Sub8_Sub1_1.method1510();
					local1321 = Static18.aClass3_Sub8_Sub1_1.method1510();
					local872 = Static18.aClass3_Sub8_Sub1_1.method1540();
					for (local878 = local459; local878 <= local1321; local878++) {
						local1336 = ((long) local166 << 32) + (long) local878;
						Static30.aClass87_3.method3200(local1336, new Class3_Sub24(local872));
					}
				}
				Static159.anInt3903 = -1;
				return true;
			}
			@Pc(1382) Class33 local1382;
			if (Static159.anInt3903 == 37) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1540();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1510();
				if (local150 < -70000) {
					local154 += 32768;
				}
				if (local150 < 0) {
					local1382 = null;
				} else {
					local1382 = Static19.method576(local150);
				}
				while (Static11.anInt410 > Static18.aClass3_Sub8_Sub1_1.anInt1948) {
					local459 = 0;
					local162 = Static18.aClass3_Sub8_Sub1_1.method1544();
					local166 = Static18.aClass3_Sub8_Sub1_1.method1510();
					if (local166 != 0) {
						local459 = Static18.aClass3_Sub8_Sub1_1.method1545();
						if (local459 == 255) {
							local459 = Static18.aClass3_Sub8_Sub1_1.method1540();
						}
					}
					if (local1382 != null && local162 >= 0 && local1382.anIntArray261.length > local162) {
						local1382.anIntArray261[local162] = local166;
						local1382.anIntArray266[local162] = local459;
					}
					Static118.method2374(local162, local459, local166 - 1, local154);
				}
				if (local1382 != null) {
					Static16.method534(local1382);
				}
				Static75.method1728();
				Static112.anIntArray502[Static32.anInt989++ & 0x1F] = local154 & 0x7FFF;
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 223) {
				for (local150 = 0; local150 < Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1.length; local150++) {
					if (Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local150] != null) {
						Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local150].anInt1833 = -1;
					}
				}
				for (local154 = 0; local154 < Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1.length; local154++) {
					if (Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local154] != null) {
						Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local154].anInt1833 = -1;
					}
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 252) {
				Static75.method1728();
				local150 = Static18.aClass3_Sub8_Sub1_1.method1551();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1525();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static111.anIntArray498[local154] = local150;
				Static18.anIntArray144[local154] = local158;
				Static95.anIntArray451[local154] = 1;
				for (local162 = 0; local162 < 98; local162++) {
					if (Class3_Sub2_Sub13.anIntArray450[local162] <= local150) {
						Static95.anIntArray451[local154] = local162 + 2;
					}
				}
				Static91.anIntArray688[Static77.anInt2283++ & 0x1F] = local154;
				Static159.anInt3903 = -1;
				return true;
			}
			@Pc(1615) int local1615;
			@Pc(1592) long local1592;
			@Pc(1601) long local1601;
			if (Static159.anInt3903 == 103) {
				local752 = Static18.aClass3_Sub8_Sub1_1.method1511();
				local1592 = Static18.aClass3_Sub8_Sub1_1.method1510();
				local1601 = Static18.aClass3_Sub8_Sub1_1.method1554();
				local1321 = Static18.aClass3_Sub8_Sub1_1.method1545();
				@Pc(1611) long local1611 = local1601 + (local1592 << 32);
				@Pc(1613) boolean local1613 = false;
				for (local1615 = 0; local1615 < 100; local1615++) {
					if (Static155.aLongArray8[local1615] == local1611) {
						local1613 = true;
						break;
					}
				}
				if (local1321 <= 1) {
					for (@Pc(1642) int local1642 = 0; local1642 < Static4.anInt128; local1642++) {
						if (local752 == Static21.aLongArray3[local1642]) {
							local1613 = true;
							break;
						}
					}
				}
				if (!local1613 && Static140.anInt3590 == 0) {
					Static155.aLongArray8[Static103.anInt2675] = local1611;
					Static103.anInt2675 = (Static103.anInt2675 + 1) % 100;
					@Pc(1677) Class28 local1677 = Static10.method1786(Static30.method788(Static18.aClass3_Sub8_Sub1_1).method940());
					if (local1321 == 2 || local1321 == 3) {
						Static51.method1192(Static4.method96(new Class28[] { Static164.aClass28_1389, Static149.method2829(local752).method912() }), 7, local1677);
					} else if (local1321 == 1) {
						Static51.method1192(Static4.method96(new Class28[] { Static132.aClass28_1097, Static149.method2829(local752).method912() }), 7, local1677);
					} else {
						Static51.method1192(Static149.method2829(local752).method912(), 3, local1677);
					}
				}
				Static159.anInt3903 = -1;
				return true;
			}
			@Pc(1756) boolean local1756;
			if (Static159.anInt3903 == 146) {
				local752 = Static18.aClass3_Sub8_Sub1_1.method1511();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1510();
				local1756 = false;
				@Pc(1760) byte local1760 = Static18.aClass3_Sub8_Sub1_1.method1508();
				if ((Long.MIN_VALUE & local752) != 0L) {
					local1756 = true;
				}
				if (local1756) {
					if (Static35.anInt1045 == 0) {
						Static159.anInt3903 = -1;
						return true;
					}
					local752 &= Long.MAX_VALUE;
					for (local459 = 0; local459 < Static35.anInt1045 && (Static34.aClass3_Sub12Array1[local459].aLong144 != local752 || local158 != Static34.aClass3_Sub12Array1[local459].anInt2285); local459++) {
					}
					if (Static35.anInt1045 > local459) {
						while (Static35.anInt1045 - 1 > local459) {
							Static34.aClass3_Sub12Array1[local459] = Static34.aClass3_Sub12Array1[local459 + 1];
							local459++;
						}
						Static35.anInt1045--;
						Static34.aClass3_Sub12Array1[Static35.anInt1045] = null;
					}
				} else {
					@Pc(1776) Class3_Sub12 local1776 = new Class3_Sub12();
					local1776.aLong144 = local752;
					local1776.aClass28_694 = Static149.method2829(local1776.aLong144);
					local1776.anInt2285 = local158;
					local1776.aByte5 = local1760;
					for (local1321 = Static35.anInt1045 - 1; local1321 >= 0; local1321--) {
						local872 = Static34.aClass3_Sub12Array1[local1321].aClass28_694.method921(local1776.aClass28_694);
						if (local872 == 0) {
							Static34.aClass3_Sub12Array1[local1321].anInt2285 = local158;
							Static34.aClass3_Sub12Array1[local1321].aByte5 = local1760;
							if (local752 == Static151.aLong124) {
								Static51.aByte4 = local1760;
							}
							Static159.anInt3903 = -1;
							Static21.anInt569 = Static90.anInt2570;
							return true;
						}
						if (local872 < 0) {
							break;
						}
					}
					if (Static35.anInt1045 >= Static34.aClass3_Sub12Array1.length) {
						Static159.anInt3903 = -1;
						return true;
					}
					for (local872 = Static35.anInt1045 - 1; local872 > local1321; local872--) {
						Static34.aClass3_Sub12Array1[local872 + 1] = Static34.aClass3_Sub12Array1[local872];
					}
					if (Static35.anInt1045 == 0) {
						Static34.aClass3_Sub12Array1 = new Class3_Sub12[100];
					}
					Static34.aClass3_Sub12Array1[local1321 + 1] = local1776;
					Static35.anInt1045++;
					if (Static151.aLong124 == local752) {
						Static51.aByte4 = local1760;
					}
				}
				Static159.anInt3903 = -1;
				Static21.anInt569 = Static90.anInt2570;
				return true;
			}
			if (Static159.anInt3903 == 20) {
				for (local150 = 0; local150 < Static178.anInt4249; local150++) {
					@Pc(1982) Class3_Sub2_Sub12 local1982 = Static120.method2408(local150);
					if (local1982 != null && local1982.anInt2530 == 0) {
						Static65.anIntArray337[local150] = 0;
						Static72.anIntArray354[local150] = 0;
					}
				}
				Static75.method1728();
				Static85.anInt2509 += 32;
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 186) {
				Static177.anInt4222 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static159.anInt3903 = -1;
				Static31.anInt968 = Static90.anInt2570;
				return true;
			}
			if (Static159.anInt3903 == 221) {
				for (local150 = 0; local150 < Static72.anIntArray354.length; local150++) {
					if (Static65.anIntArray337[local150] != Static72.anIntArray354[local150]) {
						Static72.anIntArray354[local150] = Static65.anIntArray337[local150];
						Static110.method2234(local150);
						Static127.anIntArray567[Static85.anInt2509++ & 0x1F] = local150;
					}
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 90) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1536();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1518();
				local1382 = Static19.method576(local150);
				if (local1382.anInt1523 != local154 || local154 == -1) {
					local1382.anInt1485 = 0;
					local1382.anInt1523 = local154;
					local1382.anInt1467 = 0;
					Static16.method534(local1382);
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 115) {
				Static16.anInt490 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 166) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1517();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1551();
				local1382 = Static19.method576(local154);
				if (local1382 != null && local1382.anInt1522 == 0) {
					if (local150 > local1382.anInt1458 - local1382.anInt1515) {
						local150 = local1382.anInt1458 - local1382.anInt1515;
					}
					if (local150 < 0) {
						local150 = 0;
					}
					if (local150 != local1382.anInt1490) {
						local1382.anInt1490 = local150;
						Static16.method534(local1382);
					}
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 254) {
				Static101.method2114();
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 213) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1510();
				@Pc(2216) byte local2216 = Static18.aClass3_Sub8_Sub1_1.method1530();
				Static65.anIntArray337[local150] = local2216;
				if (local2216 != Static72.anIntArray354[local150]) {
					Static72.anIntArray354[local150] = local2216;
					Static110.method2234(local150);
				}
				Static127.anIntArray567[Static85.anInt2509++ & 0x1F] = local150;
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 152) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1536();
				Static119.aClass61_4 = Static123.aClass68_4.method2530(local150);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 18) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1527();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1535();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1533();
				local1284 = (Class3_Sub7) Static119.aClass87_11.method3201((long) local158);
				if (local1284 != null) {
					Static160.method2984(local1284.anInt1548 != local150, local1284);
				}
				Static144.method1398(local150, local154, local158);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 50) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1533();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1517();
				Static65.anIntArray337[local154] = local150;
				if (local150 != Static72.anIntArray354[local154]) {
					Static72.anIntArray354[local154] = local150;
					Static110.method2234(local154);
				}
				Static127.anIntArray567[Static85.anInt2509++ & 0x1F] = local154;
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 148) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1517();
				if (local150 == 65535) {
					local150 = -1;
				}
				Static99.method2102(local150);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 46) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1520();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1510();
				if (local154 == 65535) {
					local154 = -1;
				}
				Static70.method1650(local150, local154);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 6) {
				Static17.anInt515 = Static18.aClass3_Sub8_Sub1_1.method1525();
				Static57.anInt1590 = Static18.aClass3_Sub8_Sub1_1.method1525();
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 35) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1549();
				Static177.anInt4207 = local150;
				Static126.method2500(local150);
				Static5.method103(Static177.anInt4207);
				for (local154 = 0; local154 < 100; local154++) {
					Static137.aBooleanArray15[local154] = true;
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 216) {
				local752 = Static18.aClass3_Sub8_Sub1_1.method1511();
				@Pc(2469) Class28 local2469 = Static10.method1786(Static30.method788(Static18.aClass3_Sub8_Sub1_1).method940());
				Static51.method1192(Static149.method2829(local752).method912(), 6, local2469);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 188) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1510();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1545();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1510();
				Static18.method567(local154, local158, local150);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 202) {
				Static132.aBoolean160 = false;
				for (local150 = 0; local150 < 5; local150++) {
					Static175.aBooleanArray21[local150] = false;
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 47) {
				Static21.anInt569 = Static90.anInt2570;
				local752 = Static18.aClass3_Sub8_Sub1_1.method1511();
				if (local752 == 0L) {
					Static34.aClass3_Sub12Array1 = null;
					Static35.anInt1045 = 0;
					Static67.aClass28_615 = null;
					Static106.aClass28_889 = null;
					Static159.anInt3903 = -1;
					return true;
				}
				local1592 = Static18.aClass3_Sub8_Sub1_1.method1511();
				Static106.aClass28_889 = Static149.method2829(local1592);
				Static67.aClass28_615 = Static149.method2829(local752);
				Static177.aByte9 = Static18.aClass3_Sub8_Sub1_1.method1508();
				local166 = Static18.aClass3_Sub8_Sub1_1.method1545();
				if (local166 == 255) {
					Static159.anInt3903 = -1;
					return true;
				}
				Static35.anInt1045 = local166;
				@Pc(2587) Class3_Sub12[] local2587 = new Class3_Sub12[100];
				for (local1321 = 0; local1321 < Static35.anInt1045; local1321++) {
					local2587[local1321] = new Class3_Sub12();
					local2587[local1321].aLong144 = Static18.aClass3_Sub8_Sub1_1.method1511();
					local2587[local1321].aClass28_694 = Static149.method2829(local2587[local1321].aLong144);
					local2587[local1321].anInt2285 = Static18.aClass3_Sub8_Sub1_1.method1510();
					local2587[local1321].aByte5 = Static18.aClass3_Sub8_Sub1_1.method1508();
					if (local2587[local1321].aLong144 == Static151.aLong124) {
						Static51.aByte4 = local2587[local1321].aByte5;
					}
				}
				local911 = Static35.anInt1045;
				while (local911 > 0) {
					local911--;
					@Pc(2655) boolean local2655 = true;
					for (local1615 = 0; local1615 < local911; local1615++) {
						if (local2587[local1615].aClass28_694.method921(local2587[local1615 + 1].aClass28_694) > 0) {
							@Pc(2678) Class3_Sub12 local2678 = local2587[local1615];
							local2655 = false;
							local2587[local1615] = local2587[local1615 + 1];
							local2587[local1615 + 1] = local2678;
						}
					}
					if (local2655) {
						break;
					}
				}
				Static159.anInt3903 = -1;
				Static34.aClass3_Sub12Array1 = local2587;
				return true;
			}
			if (Static159.anInt3903 == 108) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1536();
				@Pc(2734) boolean local2734 = Static18.aClass3_Sub8_Sub1_1.method1505() == 1;
				local1382 = Static19.method576(local150);
				if (local2734 != local1382.aBoolean78) {
					local1382.aBoolean78 = local2734;
					Static16.method534(local1382);
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 84) {
				Static152.method2877(Static18.aClass3_Sub8_Sub1_1, Static11.anInt410, Static123.aClass68_4);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 243) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1540();
				@Pc(2782) Class3_Sub7 local2782 = (Class3_Sub7) Static119.aClass87_11.method3201((long) local150);
				if (local2782 != null) {
					Static160.method2984(true, local2782);
				}
				if (Static175.aClass33_15 != null) {
					Static16.method534(Static175.aClass33_15);
					Static175.aClass33_15 = null;
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 120) {
				local752 = Static18.aClass3_Sub8_Sub1_1.method1511();
				Static18.aClass3_Sub8_Sub1_1.method1508();
				local1592 = Static18.aClass3_Sub8_Sub1_1.method1511();
				local1601 = Static18.aClass3_Sub8_Sub1_1.method1510();
				@Pc(2830) long local2830 = (long) Static18.aClass3_Sub8_Sub1_1.method1554();
				local1336 = local2830 + (local1601 << 32);
				@Pc(2838) boolean local2838 = false;
				local878 = Static18.aClass3_Sub8_Sub1_1.method1545();
				for (@Pc(2844) int local2844 = 0; local2844 < 100; local2844++) {
					if (local1336 == Static155.aLongArray8[local2844]) {
						local2838 = true;
						break;
					}
				}
				if (local878 <= 1) {
					for (local965 = 0; local965 < Static4.anInt128; local965++) {
						if (Static21.aLongArray3[local965] == local752) {
							local2838 = true;
							break;
						}
					}
				}
				if (!local2838 && Static140.anInt3590 == 0) {
					Static155.aLongArray8[Static103.anInt2675] = local1336;
					Static103.anInt2675 = (Static103.anInt2675 + 1) % 100;
					@Pc(2904) Class28 local2904 = Static10.method1786(Static30.method788(Static18.aClass3_Sub8_Sub1_1).method940());
					if (local878 == 2 || local878 == 3) {
						Static115.method2299(9, Static4.method96(new Class28[] { Static164.aClass28_1389, Static149.method2829(local752).method912() }), local2904, Static149.method2829(local1592).method912());
					} else if (local878 == 1) {
						Static115.method2299(9, Static4.method96(new Class28[] { Static132.aClass28_1097, Static149.method2829(local752).method912() }), local2904, Static149.method2829(local1592).method912());
					} else {
						Static115.method2299(9, Static149.method2829(local752).method912(), local2904, Static149.method2829(local1592).method912());
					}
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 179) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1540();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1517();
				local1382 = Static19.method576(local150);
				if (local1382.anInt1493 != 1 || local1382.anInt1455 != local154) {
					local1382.anInt1455 = local154;
					local1382.anInt1493 = 1;
					Static16.method534(local1382);
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 114) {
				Static162.method3011();
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 123) {
				Static132.aBoolean160 = true;
				Static142.anInt3629 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static84.anInt2466 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static38.anInt1086 = Static18.aClass3_Sub8_Sub1_1.method1510();
				Static158.anInt616 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static50.anInt1434 = Static18.aClass3_Sub8_Sub1_1.method1545();
				if (Static50.anInt1434 >= 100) {
					local150 = Static142.anInt3629 * 128 + 64;
					local154 = Static84.anInt2466 * 128 + 64;
					local158 = Static33.method848(local150, Static171.anInt4109, local154) - Static38.anInt1086;
					local162 = local150 - Static28.anInt900;
					local166 = local158 - Static163.anInt3970;
					local459 = local154 - Static85.anInt2512;
					local1321 = (int) Math.sqrt((double) (local459 * local459 + local162 * local162));
					Static169.anInt683 = (int) (Math.atan2((double) local166, (double) local1321) * 325.949D) & 0x7FF;
					Static44.anInt3941 = (int) (Math.atan2((double) local162, (double) local459) * -325.949D) & 0x7FF;
					if (Static169.anInt683 < 128) {
						Static169.anInt683 = 128;
					}
					if (Static169.anInt683 > 383) {
						Static169.anInt683 = 383;
					}
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 105) {
				Static17.anInt515 = Static18.aClass3_Sub8_Sub1_1.method1505();
				Static57.anInt1590 = Static18.aClass3_Sub8_Sub1_1.method1535();
				while (Static11.anInt410 > Static18.aClass3_Sub8_Sub1_1.anInt1948) {
					Static159.anInt3903 = Static18.aClass3_Sub8_Sub1_1.method1545();
					Static126.method2499();
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 137) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1545();
				if (Static18.aClass3_Sub8_Sub1_1.method1545() == 0) {
					Static129.aClass20Array1[local150] = new Class20();
				} else {
					Static18.aClass3_Sub8_Sub1_1.anInt1948--;
					Static129.aClass20Array1[local150] = new Class20(Static18.aClass3_Sub8_Sub1_1);
				}
				Static124.anInt3186 = Static90.anInt2570;
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 192) {
				Static21.anInt574 = 0;
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 218) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1510();
				Static4.method98(local150);
				Static112.anIntArray502[Static32.anInt989++ & 0x1F] = local150 & 0x7FFF;
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 230) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1517();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1551();
				local158 = Static18.aClass3_Sub8_Sub1_1.method1517();
				local162 = Static18.aClass3_Sub8_Sub1_1.method1549();
				@Pc(3285) Class33 local3285 = Static19.method576(local154);
				if (local3285.anInt1474 != local158 || local3285.anInt1508 != local162 || local3285.anInt1519 != local150) {
					local3285.anInt1508 = local162;
					local3285.anInt1519 = local150;
					local3285.anInt1474 = local158;
					Static16.method534(local3285);
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 172) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1540();
				local1037 = Static19.method576(local150);
				for (local158 = 0; local158 < local1037.anIntArray261.length; local158++) {
					local1037.anIntArray261[local158] = -1;
					local1037.anIntArray261[local158] = 0;
				}
				Static16.method534(local1037);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 57) {
				if (Static177.anInt4207 != -1) {
					Static65.method1570(Static177.anInt4207, 0);
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 162) {
				Static75.method1728();
				Static35.anInt1048 = Static18.aClass3_Sub8_Sub1_1.method1542();
				Static95.anInt2637 = Static90.anInt2570;
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 209) {
				Static132.aBoolean160 = true;
				Static66.anInt2057 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static169.anInt658 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static71.anInt2140 = Static18.aClass3_Sub8_Sub1_1.method1510();
				Static121.anInt3122 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static44.anInt3934 = Static18.aClass3_Sub8_Sub1_1.method1545();
				if (Static44.anInt3934 >= 100) {
					Static28.anInt900 = Static66.anInt2057 * 128 + 64;
					Static85.anInt2512 = Static169.anInt658 * 128 + 64;
					Static163.anInt3970 = Static33.method848(Static28.anInt900, Static171.anInt4109, Static85.anInt2512) - Static71.anInt2140;
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 4) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1540();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1510();
				if (local150 >= 0) {
					local1382 = Static19.method576(local150);
				} else {
					local1382 = null;
				}
				if (local1382 != null) {
					for (local162 = 0; local162 < local1382.anIntArray261.length; local162++) {
						local1382.anIntArray261[local162] = 0;
						local1382.anIntArray266[local162] = 0;
					}
				}
				if (local150 < -70000) {
					local154 += 32768;
				}
				Static27.method743(local154);
				local162 = Static18.aClass3_Sub8_Sub1_1.method1510();
				for (local166 = 0; local166 < local162; local166++) {
					local459 = Static18.aClass3_Sub8_Sub1_1.method1510();
					local1321 = Static18.aClass3_Sub8_Sub1_1.method1535();
					if (local1321 == 255) {
						local1321 = Static18.aClass3_Sub8_Sub1_1.method1540();
					}
					if (local1382 != null && local166 < local1382.anIntArray261.length) {
						local1382.anIntArray261[local166] = local459;
						local1382.anIntArray266[local166] = local1321;
					}
					Static118.method2374(local166, local1321, local459 - 1, local154);
				}
				if (local1382 != null) {
					Static16.method534(local1382);
				}
				Static75.method1728();
				Static112.anIntArray502[Static32.anInt989++ & 0x1F] = local154 & 0x7FFF;
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 149) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1540();
				local699 = Static18.aClass3_Sub8_Sub1_1.method1516();
				local1382 = Static19.method576(local150);
				if (!local699.method934(local1382.aClass28_455)) {
					local1382.aClass28_455 = local699;
					Static16.method534(local1382);
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 126) {
				Static153.method2893(false);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 212) {
				local231 = Static18.aClass3_Sub8_Sub1_1.method1516();
				if (local231.method939(Static65.aClass28_596)) {
					local1756 = false;
					local699 = local231.method926(local231.method903(Static99.aClass28_837), 0);
					local1592 = local699.method924();
					for (local459 = 0; local459 < Static4.anInt128; local459++) {
						if (Static21.aLongArray3[local459] == local1592) {
							local1756 = true;
							break;
						}
					}
					if (!local1756 && Static140.anInt3590 == 0) {
						Static51.method1192(local699, 4, Static70.aClass28_633);
					}
				} else if (local231.method939(Static55.aClass28_465)) {
					local699 = local231.method926(local231.method903(Static99.aClass28_837), 0);
					local1592 = local699.method924();
					local1756 = false;
					for (local459 = 0; local459 < Static4.anInt128; local459++) {
						if (Static21.aLongArray3[local459] == local1592) {
							local1756 = true;
							break;
						}
					}
					if (!local1756 && Static140.anInt3590 == 0) {
						@Pc(4020) Class28 local4020 = local231.method926(local231.method901() - 9, local231.method903(Static99.aClass28_837) - -1);
						Static51.method1192(local699, 8, local4020);
					}
				} else if (local231.method939(Static113.aClass28_941)) {
					local699 = local231.method926(local231.method903(Static99.aClass28_837), 0);
					local1592 = local699.method924();
					local1756 = false;
					for (local459 = 0; local459 < Static4.anInt128; local459++) {
						if (Static21.aLongArray3[local459] == local1592) {
							local1756 = true;
							break;
						}
					}
					if (!local1756 && Static140.anInt3590 == 0) {
						Static51.method1192(local699, 10, Static156.aClass28_1306);
					}
				} else if (local231.method939(Static68.aClass28_628)) {
					local699 = local231.method926(local231.method903(Static68.aClass28_628), 0);
					Static51.method1192(Static156.aClass28_1306, 11, local699);
				} else if (local231.method939(Static168.aClass28_1428)) {
					local699 = local231.method926(local231.method903(Static168.aClass28_1428), 0);
					if (Static140.anInt3590 == 0) {
						Static51.method1192(Static156.aClass28_1306, 12, local699);
					}
				} else if (local231.method939(Static24.aClass28_256)) {
					local699 = local231.method926(local231.method903(Static24.aClass28_256), 0);
					if (Static140.anInt3590 == 0) {
						Static51.method1192(Static156.aClass28_1306, 13, local699);
					}
				} else if (local231.method939(Static144.aClass28_531)) {
					local699 = local231.method926(local231.method903(Static99.aClass28_837), 0);
					local1756 = false;
					local1592 = local699.method924();
					for (local459 = 0; local459 < Static4.anInt128; local459++) {
						if (local1592 == Static21.aLongArray3[local459]) {
							local1756 = true;
							break;
						}
					}
					if (!local1756 && Static140.anInt3590 == 0) {
						Static51.method1192(local699, 14, Static156.aClass28_1306);
					}
				} else if (local231.method939(Static72.aClass28_645)) {
					local699 = local231.method926(local231.method903(Static99.aClass28_837), 0);
					local1592 = local699.method924();
					local1756 = false;
					for (local459 = 0; local459 < Static4.anInt128; local459++) {
						if (local1592 == Static21.aLongArray3[local459]) {
							local1756 = true;
							break;
						}
					}
					if (!local1756 && Static140.anInt3590 == 0) {
						Static51.method1192(local699, 15, Static156.aClass28_1306);
					}
				} else if (local231.method939(Static111.aClass28_921)) {
					local699 = local231.method926(local231.method903(Static99.aClass28_837), 0);
					local1592 = local699.method924();
					local1756 = false;
					for (local459 = 0; local459 < Static4.anInt128; local459++) {
						if (Static21.aLongArray3[local459] == local1592) {
							local1756 = true;
							break;
						}
					}
					if (!local1756 && Static140.anInt3590 == 0) {
						Static51.method1192(local699, 16, Static156.aClass28_1306);
					}
				} else {
					Static51.method1192(Static156.aClass28_1306, 0, local231);
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 30) {
				Static108.anInt2803 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static84.anInt2473 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static157.anInt3884 = Static18.aClass3_Sub8_Sub1_1.method1545();
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 187) {
				Static153.method2893(true);
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 98) {
				local150 = Static18.aClass3_Sub8_Sub1_1.method1510();
				local154 = Static18.aClass3_Sub8_Sub1_1.method1536();
				local1382 = Static19.method576(local154);
				if (local1382.anInt1493 != 2 || local1382.anInt1455 != local150) {
					local1382.anInt1455 = local150;
					local1382.anInt1493 = 2;
					Static16.method534(local1382);
				}
				Static159.anInt3903 = -1;
				return true;
			}
			if (Static159.anInt3903 == 68) {
				Static17.anInt515 = Static18.aClass3_Sub8_Sub1_1.method1505();
				Static57.anInt1590 = Static18.aClass3_Sub8_Sub1_1.method1525();
				for (local150 = Static57.anInt1590; local150 < Static57.anInt1590 + 8; local150++) {
					for (local154 = Static17.anInt515; local154 < Static17.anInt515 + 8; local154++) {
						if (Static26.aClass23ArrayArrayArray1[Static171.anInt4109][local150][local154] != null) {
							Static26.aClass23ArrayArrayArray1[Static171.anInt4109][local150][local154] = null;
							Static138.method2711(local154, local150);
						}
					}
				}
				for (@Pc(4154) Class3_Sub25 local4154 = (Class3_Sub25) Static24.aClass23_3.method858(); local4154 != null; local4154 = (Class3_Sub25) Static24.aClass23_3.method861()) {
					if (Static57.anInt1590 <= local4154.anInt4177 && Static57.anInt1590 + 8 > local4154.anInt4177 && Static17.anInt515 <= local4154.anInt4168 && Static17.anInt515 + 8 > local4154.anInt4168 && local4154.anInt4181 == Static171.anInt4109) {
						local4154.anInt4182 = 0;
					}
				}
				Static159.anInt3903 = -1;
				return true;
			}
			Static146.method2791(null, "T1 - " + Static159.anInt3903 + "," + Static65.anInt2024 + "," + Static15.anInt1152 + " - " + Static11.anInt410);
			Static31.method791();
		} catch (@Pc(4227) IOException local4227) {
			Static47.method1115();
		} catch (@Pc(4231) Exception local4231) {
			@Pc(4271) String local4271 = "T2 - " + Static159.anInt3903 + "," + Static65.anInt2024 + "," + Static15.anInt1152 + " - " + Static11.anInt410 + "," + (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0] + Static111.anInt2843) + "," + (Static29.anInt907 + Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0]) + " - ";
			for (local154 = 0; Static11.anInt410 > local154 && local154 < 50; local154++) {
				local4271 = local4271 + Static18.aClass3_Sub8_Sub1_1.aByteArray19[local154] + ",";
			}
			Static146.method2791(local4231, local4271);
			Static31.method791();
		}
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public static void method2106() {
		for (@Pc(15) Class3_Sub18 local15 = (Class3_Sub18) Static108.aClass23_11.method858(); local15 != null; local15 = (Class3_Sub18) Static108.aClass23_11.method861()) {
			if (local15.aClass3_Sub2_Sub18_1 != null) {
				local15.method2497();
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BILclient!sh;)V")
	public static void method2107(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2_Sub1_Sub2 arg1) {
		Static9.method288(arg0, arg1.anInt1800, arg1.anInt1792);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!ah;)Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4 method2108(@OriginalArg(0) int arg0, @OriginalArg(2) Class7 arg1) {
		return Static19.method578(arg1, arg0) ? Static70.method1647() : null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
	public static void method2109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static51.aClass3_Sub8_Sub1_2.method1559(29);
		Static51.aClass3_Sub8_Sub1_2.method1524(arg0);
		Static51.aClass3_Sub8_Sub1_2.method1547(arg1);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
	public static void method2111() {
		aClass28_841 = null;
		aClass28_840 = null;
		aClass28_838 = null;
		aClass63_17 = null;
		aClass28_839 = null;
		aClass28_842 = null;
	}
}
