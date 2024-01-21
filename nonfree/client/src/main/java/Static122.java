import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!a;")
	public static Class1_Sub1_Sub1 aClass1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2 aClass1_Sub3_Sub1_Sub2_5;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Lclient!kb;")
	public static Class41 aClass41_30;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "I")
	public static int anInt3120 = 0;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "I")
	public static int anInt3121 = 0;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "I")
	public static int anInt3122 = 0;

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!af;")
	public static Class5 aClass5_1386 = Static45.method1937("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Lclient!nd;")
	public static Class53 aClass53_16 = new Class53();

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	public static int anInt3127 = 0;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "Lclient!af;")
	public static Class5 aClass5_1387 = Static45.method1937(" loggt sich ein)3");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method2170() {
		try {
			if (Static116.anInt2892 == 0) {
				if (Static11.aClass78_2 != null) {
					Static11.aClass78_2.method2176();
					Static11.aClass78_2 = null;
				}
				Static99.anInt2454 = 0;
				Static43.aBoolean34 = false;
				Static116.anInt2892 = 1;
				Static70.aClass51_3 = null;
			}
			if (Static116.anInt2892 == 1) {
				if (Static70.aClass51_3 == null) {
					Static70.aClass51_3 = Static65.aClass55_2.method1536(Static1.aString1, Static49.anInt1195);
				}
				if (Static70.aClass51_3.anInt1880 == 2) {
					throw new IOException();
				}
				if (Static70.aClass51_3.anInt1880 == 1) {
					Static11.aClass78_2 = new Class78((Socket) Static70.aClass51_3.anObject2, Static65.aClass55_2);
					Static70.aClass51_3 = null;
					Static116.anInt2892 = 2;
				}
			}
			if (Static116.anInt2892 == 2) {
				@Pc(71) long local71 = Static111.aLong85 = Static93.aClass5_1114.method193();
				Static44.aClass1_Sub20_Sub1_1.anInt2951 = 0;
				Static44.aClass1_Sub20_Sub1_1.method2081(14);
				@Pc(85) int local85 = (int) (local71 >> 16 & 0x1FL);
				Static44.aClass1_Sub20_Sub1_1.method2081(local85);
				Static11.aClass78_2.method2182(2, Static44.aClass1_Sub20_Sub1_1.aByteArray36);
				Static116.anInt2892 = 3;
				Static79.aClass1_Sub20_Sub1_2.anInt2951 = 0;
			}
			@Pc(118) int local118;
			if (Static116.anInt2892 == 3) {
				if (Static113.aClass10_2 != null) {
					Static113.aClass10_2.method1299();
				}
				if (Static97.aClass10_1 != null) {
					Static97.aClass10_1.method1299();
				}
				local118 = Static11.aClass78_2.method2175();
				if (Static113.aClass10_2 != null) {
					Static113.aClass10_2.method1299();
				}
				if (Static97.aClass10_1 != null) {
					Static97.aClass10_1.method1299();
				}
				if (local118 != 0) {
					Static26.method563(local118);
					return;
				}
				Static79.aClass1_Sub20_Sub1_2.anInt2951 = 0;
				Static116.anInt2892 = 4;
			}
			if (Static116.anInt2892 == 4) {
				if (Static79.aClass1_Sub20_Sub1_2.anInt2951 < 8) {
					local118 = Static11.aClass78_2.method2179();
					if (8 - Static79.aClass1_Sub20_Sub1_2.anInt2951 < local118) {
						local118 = 8 - Static79.aClass1_Sub20_Sub1_2.anInt2951;
					}
					if (local118 > 0) {
						Static11.aClass78_2.method2180(Static79.aClass1_Sub20_Sub1_2.aByteArray36, local118, Static79.aClass1_Sub20_Sub1_2.anInt2951);
						Static79.aClass1_Sub20_Sub1_2.anInt2951 += local118;
					}
				}
				if (Static79.aClass1_Sub20_Sub1_2.anInt2951 == 8) {
					Static79.aClass1_Sub20_Sub1_2.anInt2951 = 0;
					Static64.aLong48 = Static79.aClass1_Sub20_Sub1_2.method2068();
					Static116.anInt2892 = 5;
				}
			}
			if (Static116.anInt2892 == 5) {
				Static44.aClass1_Sub20_Sub1_1.anInt2951 = 0;
				@Pc(207) int[] local207 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static64.aLong48 >> 32), (int) Static64.aLong48 };
				Static44.aClass1_Sub20_Sub1_1.method2081(10);
				Static44.aClass1_Sub20_Sub1_1.method2092(local207[0]);
				Static44.aClass1_Sub20_Sub1_1.method2092(local207[1]);
				Static44.aClass1_Sub20_Sub1_1.method2092(local207[2]);
				Static44.aClass1_Sub20_Sub1_1.method2092(local207[3]);
				Static44.aClass1_Sub20_Sub1_1.method2092(Static65.aClass55_2.anInt2200);
				Static44.aClass1_Sub20_Sub1_1.method2078(Static93.aClass5_1114.method193());
				Static44.aClass1_Sub20_Sub1_1.method2054(Static93.aClass5_1120);
				Static44.aClass1_Sub20_Sub1_1.method2073(Static85.aBigInteger1, Static109.aBigInteger2);
				Static119.aClass1_Sub20_Sub1_3.anInt2951 = 0;
				if (Static95.anInt2352 == 40) {
					Static119.aClass1_Sub20_Sub1_3.method2081(18);
				} else {
					Static119.aClass1_Sub20_Sub1_3.method2081(16);
				}
				Static119.aClass1_Sub20_Sub1_3.method2081(Static44.aClass1_Sub20_Sub1_1.anInt2951 + 69);
				Static119.aClass1_Sub20_Sub1_3.method2092(461);
				Static119.aClass1_Sub20_Sub1_3.method2081(Static79.aBoolean64 ? 1 : 0);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static73.aClass41_Sub1_11.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static50.aClass41_Sub1_7.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static54.aClass41_Sub1_8.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static66.aClass41_Sub1_23.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static38.aClass41_Sub1_5.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static20.aClass41_Sub1_4.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static98.aClass41_Sub1_16.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static17.aClass41_Sub1_3.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static109.aClass41_Sub1_20.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static45.aClass41_Sub1_22.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static62.aClass41_Sub1_17.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static120.aClass41_Sub1_14.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static10.aClass41_Sub1_1.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static74.aClass41_Sub1_12.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static103.aClass41_Sub1_19.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2092(Static12.aClass41_Sub1_25.anInt2472);
				Static119.aClass1_Sub20_Sub1_3.method2074(Static44.aClass1_Sub20_Sub1_1.aByteArray36, Static44.aClass1_Sub20_Sub1_1.anInt2951);
				Static11.aClass78_2.method2182(Static119.aClass1_Sub20_Sub1_3.anInt2951, Static119.aClass1_Sub20_Sub1_3.aByteArray36);
				Static44.aClass1_Sub20_Sub1_1.method2119(local207);
				for (@Pc(420) int local420 = 0; local420 < 4; local420++) {
					local207[local420] += 50;
				}
				Static79.aClass1_Sub20_Sub1_2.method2119(local207);
				Static116.anInt2892 = 6;
			}
			if (Static116.anInt2892 == 6 && Static11.aClass78_2.method2179() > 0) {
				local118 = Static11.aClass78_2.method2175();
				if (local118 == 21 && Static95.anInt2352 == 20) {
					Static116.anInt2892 = 7;
				} else if (local118 == 2) {
					Static116.anInt2892 = 9;
				} else if (local118 == 15 && Static95.anInt2352 == 40) {
					Static119.method2162();
					return;
				} else if (local118 == 23 && Static71.anInt1631 < 1) {
					Static116.anInt2892 = 0;
					Static71.anInt1631++;
				} else {
					Static26.method563(local118);
					return;
				}
			}
			if (Static116.anInt2892 == 7 && Static11.aClass78_2.method2179() > 0) {
				Static37.anInt962 = Static11.aClass78_2.method2175() * 60 + 180;
				Static116.anInt2892 = 8;
			}
			if (Static116.anInt2892 == 8) {
				Static99.anInt2454 = 0;
				Static44.method797(Static28.aClass5_405, Static126.aClass5_1436, Static100.method1696(new Class5[] { Static48.method838(Static37.anInt962 / 60), Static2.aClass5_38 }));
				if (--Static37.anInt962 <= 0) {
					Static116.anInt2892 = 0;
				}
			} else {
				if (Static116.anInt2892 == 9 && Static11.aClass78_2.method2179() >= 8) {
					Static40.anInt1047 = Static11.aClass78_2.method2175();
					Static128.aBoolean124 = Static11.aClass78_2.method2175() == 1;
					Static84.anInt2149 = Static11.aClass78_2.method2175();
					Static84.anInt2149 <<= 0x8;
					Static84.anInt2149 += Static11.aClass78_2.method2175();
					Static13.anInt339 = Static11.aClass78_2.method2175();
					Static11.aClass78_2.method2180(Static79.aClass1_Sub20_Sub1_2.aByteArray36, 1, 0);
					Static79.aClass1_Sub20_Sub1_2.anInt2951 = 0;
					Static104.anInt2540 = Static79.aClass1_Sub20_Sub1_2.method2116();
					Static11.aClass78_2.method2180(Static79.aClass1_Sub20_Sub1_2.aByteArray36, 2, 0);
					Static79.aClass1_Sub20_Sub1_2.anInt2951 = 0;
					Static77.anInt1803 = Static79.aClass1_Sub20_Sub1_2.method2087();
					Static116.anInt2892 = 10;
				}
				if (Static116.anInt2892 != 10) {
					Static99.anInt2454++;
					if (Static99.anInt2454 > 2000) {
						if (Static71.anInt1631 < 1) {
							Static116.anInt2892 = 0;
							if (Static96.anInt2385 == Static49.anInt1195) {
								Static49.anInt1195 = Static57.anInt1368;
							} else {
								Static49.anInt1195 = Static96.anInt2385;
							}
							Static71.anInt1631++;
						} else {
							Static26.method563(-3);
						}
					}
				} else if (Static11.aClass78_2.method2179() >= Static77.anInt1803) {
					Static79.aClass1_Sub20_Sub1_2.anInt2951 = 0;
					Static11.aClass78_2.method2180(Static79.aClass1_Sub20_Sub1_2.aByteArray36, Static77.anInt1803, 0);
					Static55.method950();
					Static108.anInt2662 = -1;
					Static118.method2110(false);
					Static104.anInt2540 = -1;
				}
			}
		} catch (@Pc(716) IOException local716) {
			if (Static71.anInt1631 < 1) {
				Static116.anInt2892 = 0;
				Static71.anInt1631++;
				if (Static96.anInt2385 == Static49.anInt1195) {
					Static49.anInt1195 = Static57.anInt1368;
				} else {
					Static49.anInt1195 = Static96.anInt2385;
				}
			} else {
				Static26.method563(-2);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method2171() {
		aClass5_1386 = null;
		aClass41_30 = null;
		aClass5_1387 = null;
		aClass1_Sub3_Sub1_Sub2_5 = null;
		aClass1_Sub1_Sub1_2 = null;
		aClass53_16 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!af;BI)V")
	public static void method2172(@OriginalArg(0) Class5 arg0, @OriginalArg(2) int arg1) {
		Static44.aClass1_Sub20_Sub1_1.method2108(141);
		Static44.aClass1_Sub20_Sub1_1.method2082(arg1);
		Static44.aClass1_Sub20_Sub1_1.method2062(arg0.method193());
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
	public static void method2173(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(15) String local15 = "";
			if (arg0 != null) {
				local15 = Static115.method2020(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local15 = local15 + " | ";
				}
				local15 = local15 + arg1;
			}
			System.out.println("Error: " + local15);
			local15 = local15.replace(':', '.');
			local15 = local15.replace('@', '_');
			local15 = local15.replace('&', '_');
			local15 = local15.replace('#', '_');
			if (Static43.aClass55_1.anApplet1 != null) {
				@Pc(109) Class51 local109 = Static43.aClass55_1.method1542(new URL(Static43.aClass55_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static91.anInt2289 + "&u=" + Static111.aLong85 + "&v1=" + Static88.aString2 + "&v2=" + Static88.aString3 + "&e=" + local15));
				while (local109.anInt1880 == 0) {
					Static70.method1226(1L);
				}
				if (local109.anInt1880 == 1) {
					@Pc(130) DataInputStream local130 = (DataInputStream) local109.anObject2;
					local130.read();
					local130.close();
				}
			}
		} catch (@Pc(137) Exception local137) {
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!ad;Lclient!ad;)V")
	public static void method2174(@OriginalArg(1) Class1_Sub3_Sub1_Sub1 arg0, @OriginalArg(2) Class1_Sub3_Sub1_Sub1 arg1) {
		if (Static96.aClass1_Sub3_Sub1_Sub2Array5 == null) {
			Static96.aClass1_Sub3_Sub1_Sub2Array5 = Static27.method592(Static109.aClass41_Sub1_20, Static74.aClass5_849, Static93.aClass5_1117);
		}
		if (Static100.aClass1_Sub3_Sub1_Sub3Array9 == null) {
			Static100.aClass1_Sub3_Sub1_Sub3Array9 = Static24.method541(Static93.aClass5_1117, Static97.aClass5_1147, Static109.aClass41_Sub1_20);
		}
		if (Static57.aClass1_Sub3_Sub1_Sub3Array4 == null) {
			Static57.aClass1_Sub3_Sub1_Sub3Array4 = Static24.method541(Static93.aClass5_1117, Static12.aClass5_1448, Static109.aClass41_Sub1_20);
		}
		if (Static5.aClass1_Sub3_Sub1_Sub3Array2 == null) {
			Static5.aClass1_Sub3_Sub1_Sub3Array2 = Static24.method541(Static93.aClass5_1117, Static104.aClass5_1214, Static109.aClass41_Sub1_20);
		}
		Static33.method1984(0, 23, 765, 480, 0);
		Static33.method1970(0, 0, 125, 23, 12425273, 9135624);
		Static33.method1970(125, 0, 640, 23, 5197647, 2697513);
		arg1.method170(Static75.aClass5_863, 62, 15, 0, -1);
		if (Static5.aClass1_Sub3_Sub1_Sub3Array2 != null) {
			Static5.aClass1_Sub3_Sub1_Sub3Array2[1].method1687(140, 1);
			arg0.method165(Static90.aClass5_1084, 152, 10, 16777215, -1);
			Static5.aClass1_Sub3_Sub1_Sub3Array2[0].method1687(140, 12);
			arg0.method165(Static63.aClass5_882, 152, 21, 16777215, -1);
		}
		if (Static57.aClass1_Sub3_Sub1_Sub3Array4 != null) {
			if (Static66.anIntArray453[0] == 0 && Static64.anIntArray247[0] == 0) {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[2].method1687(280, 4);
			} else {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[0].method1687(280, 4);
			}
			if (Static66.anIntArray453[0] == 0 && Static64.anIntArray247[0] == 1) {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[3].method1687(295, 4);
			} else {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[1].method1687(295, 4);
			}
			arg1.method165(Static127.aClass5_1460, 312, 17, 16777215, -1);
			if (Static66.anIntArray453[0] == 1 && Static64.anIntArray247[0] == 0) {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[2].method1687(390, 4);
			} else {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[0].method1687(390, 4);
			}
			if (Static66.anIntArray453[0] == 1 && Static64.anIntArray247[0] == 1) {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[3].method1687(405, 4);
			} else {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[1].method1687(405, 4);
			}
			arg1.method165(Static42.aClass5_513, 422, 17, 16777215, -1);
			if (Static66.anIntArray453[0] == 2 && Static64.anIntArray247[0] == 0) {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[2].method1687(500, 4);
			} else {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[0].method1687(500, 4);
			}
			if (Static66.anIntArray453[0] == 2 && Static64.anIntArray247[0] == 1) {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[3].method1687(515, 4);
			} else {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[1].method1687(515, 4);
			}
			arg1.method165(Static126.aClass5_1445, 532, 17, 16777215, -1);
			if (Static66.anIntArray453[0] == 3 && Static64.anIntArray247[0] == 0) {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[2].method1687(610, 4);
			} else {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[0].method1687(610, 4);
			}
			if (Static66.anIntArray453[0] == 3 && Static64.anIntArray247[0] == 1) {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[3].method1687(625, 4);
			} else {
				Static57.aClass1_Sub3_Sub1_Sub3Array4[1].method1687(625, 4);
			}
			arg1.method165(Static42.aClass5_503, 642, 17, 16777215, -1);
		}
		Static33.method1984(708, 4, 50, 16, 0);
		arg0.method170(Static70.aClass5_819, 733, 16, 16777215, -1);
		Static78.anInt1876 = -1;
		if (Static96.aClass1_Sub3_Sub1_Sub2Array5 != null) {
			@Pc(397) int local397 = 8;
			@Pc(403) int local403 = 24;
			@Pc(405) int local405;
			@Pc(407) int local407;
			do {
				local405 = local403;
				local407 = local397;
				if (local403 * (local397 - 1) >= Static52.anInt1265) {
					local397--;
				}
				if (Static52.anInt1265 <= local397 * (local403 - 1)) {
					local403--;
				}
				if ((local403 - 1) * local397 >= Static52.anInt1265) {
					local403--;
				}
			} while (local405 != local403 || local407 != local397);
			local405 = (765 - local397 * 88) / (local397 + 1);
			local407 = (480 - local403 * 19) / (local403 + 1);
			if (local405 > 5) {
				local405 = 5;
			}
			if (local407 > 5) {
				local407 = 5;
			}
			@Pc(496) int local496 = (765 - (local397 - 1) * local405 - local397 * 88) / 2;
			@Pc(511) int local511 = (480 - local403 * 19 - local407 * (local403 + -1)) / 2;
			@Pc(513) int local513 = local496;
			@Pc(515) int local515 = 0;
			@Pc(519) int local519 = local511 + 23;
			for (@Pc(521) int local521 = 0; local521 < Static52.anInt1265; local521++) {
				@Pc(527) Class9 local527 = Static37.aClass9Array1[local521];
				@Pc(532) Class5 local532 = Static48.method838(local527.anInt343);
				@Pc(534) boolean local534 = true;
				if (local527.anInt343 == -1) {
					local532 = Static101.aClass5_1188;
					local534 = false;
				} else if (local527.anInt343 > 1980) {
					local534 = false;
					local532 = Static52.aClass5_655;
				}
				if (Static98.anInt2407 >= local513 && local519 <= Static97.anInt2395 && local513 + 88 > Static98.anInt2407 && local519 + 19 > Static97.anInt2395 && local534) {
					Static78.anInt1876 = local521;
					Static96.aClass1_Sub3_Sub1_Sub2Array5[local527.aBoolean7 ? 1 : 0].method753(local513, local519);
				} else {
					Static96.aClass1_Sub3_Sub1_Sub2Array5[local527.aBoolean7 ? 1 : 0].method760(local513, local519);
				}
				if (Static100.aClass1_Sub3_Sub1_Sub3Array9 != null) {
					Static100.aClass1_Sub3_Sub1_Sub3Array9[(local527.aBoolean7 ? 8 : 0) + local527.anInt342].method1687(local513 + 29, local519);
				}
				arg1.method170(Static48.method838(local527.anInt346), local513 + 15, local519 + 14, 0, -1);
				arg0.method170(local532, local513 + 60, local519 + 9 + 5, 268435455, -1);
				local519 += local407 + 19;
				@Pc(665) int local665 = ~local403;
				local515++;
				if (local665 >= ~local515) {
					local515 = 0;
					local513 += local405 + 88;
					local519 = local511 + 23;
				}
			}
		}
		try {
			@Pc(693) Graphics local693 = Static12.aCanvas3.getGraphics();
			Static90.aClass43_1.method2199(local693);
		} catch (@Pc(701) Exception local701) {
			Static12.aCanvas3.repaint();
		}
	}
}
