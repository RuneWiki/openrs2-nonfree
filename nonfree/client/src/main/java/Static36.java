import java.awt.Component;
import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "Lclient!qf;")
	private static Class60 aClass60_476 = Static59.method1195("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "Lclient!qf;")
	public static Class60 aClass60_471 = aClass60_476;

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "Lclient!qf;")
	public static Class60 aClass60_472 = Static59.method1195("(U0a )2 via: ");

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
	public static int anInt1210 = 0;

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "Lclient!qf;")
	public static Class60 aClass60_473 = Static59.method1195("redstone2");

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "[[I")
	public static int[][] anIntArrayArray34 = new int[104][104];

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
	public static int anInt1213 = 0;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "Lclient!qf;")
	private static Class60 aClass60_478 = Static59.method1195("Loaded update list");

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "Lclient!qf;")
	public static Class60 aClass60_474 = aClass60_478;

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "Lclient!qf;")
	private static Class60 aClass60_477 = Static59.method1195("Members object");

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
	public static int anInt1216 = 0;

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "Lclient!eb;")
	public static Class17 aClass17_20 = new Class17(50);

	@OriginalMember(owner = "client!gb", name = "Z", descriptor = "Lclient!qf;")
	public static Class60 aClass60_479 = aClass60_477;

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lclient!qf;")
	private static Class60 aClass60_480 = Static59.method1195(" is already on your friend list");

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_481 = aClass60_480;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([Lclient!td;IIIIIZII[B)V")
	public static void method794(@OriginalArg(0) Class72[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg3 > 0 && arg3 + local7 < 103 && arg4 + local11 > 0 && arg4 + local11 < 103) {
					arg0[arg5].anIntArrayArray78[arg3 + local7][local11 + arg4] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(87) Class3_Sub12 local87 = new Class3_Sub12(arg8);
		for (@Pc(89) int local89 = 0; local89 < 4; local89++) {
			for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
				for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
					if (arg6 == local89 && local93 >= arg1 && arg1 + 8 > local93 && arg2 <= local97 && arg2 + 8 > local97) {
						Static77.method1567(arg7, 0, local87, arg5, arg4 + Static56.method1156(local93 & 0x7, local97 & 0x7, arg7), arg3 + Static57.method2267(arg7, local97 & 0x7, local93 & 0x7), 0);
					} else {
						Static77.method1567(0, 0, local87, 0, -1, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!jb;Ljava/awt/Component;)V")
	public static void method795(@OriginalArg(1) Class25 arg0, @OriginalArg(2) Component arg1) {
		if (Static12.aBoolean13) {
			return;
		}
		Static62.aClass3_Sub1_Sub2_Sub4_4 = Static54.method1137(Static6.aClass60_98, Static11.aClass60_146, arg0);
		Static105.aClass3_Sub1_Sub2_Sub4_16 = Static54.method1137(Static6.aClass60_98, Static10.aClass60_135, arg0);
		Static98.aClass3_Sub1_Sub2_Sub4_12 = Static54.method1137(Static6.aClass60_98, Static16.aClass60_268, arg0);
		Static63.aClass3_Sub1_Sub2_Sub4_13 = Static54.method1137(Static6.aClass60_98, Static21.aClass60_324, arg0);
		Static81.aClass3_Sub1_Sub2_Sub4_9 = Static54.method1137(Static6.aClass60_98, Static95.aClass60_1171, arg0);
		Static130.aClass3_Sub1_Sub2_Sub4_22 = Static54.method1137(Static6.aClass60_98, Static16.aClass60_264, arg0);
		Static43.aClass16_37 = Static42.method971(arg1, 479, 96);
		Static105.aClass3_Sub1_Sub2_Sub4_16.method1903(0, 0);
		Static85.aClass16_62 = Static42.method971(arg1, 172, 156);
		Static40.method1886();
		Static98.aClass3_Sub1_Sub2_Sub4_12.method1903(0, 0);
		Static113.aClass16_72 = Static42.method971(arg1, 190, 261);
		Static62.aClass3_Sub1_Sub2_Sub4_4.method1903(0, 0);
		Static27.aClass16_24 = Static42.method971(arg1, 512, 334);
		Static40.method1886();
		Static62.aClass16_47 = Static42.method971(arg1, 496, 50);
		Static57.aClass16_75 = Static42.method971(arg1, 269, 37);
		Static13.aClass16_14 = Static42.method971(arg1, 249, 45);
		@Pc(106) Class3_Sub1_Sub2_Sub3 local106 = Static79.method1602(Static98.aClass60_1206, arg0, Static6.aClass60_98);
		Static126.aClass16_76 = Static42.method971(arg1, local106.anInt2187, local106.anInt2191);
		local106.method1455(0, 0);
		@Pc(124) Class3_Sub1_Sub2_Sub3 local124 = Static79.method1602(Static4.aClass60_76, arg0, Static6.aClass60_98);
		Static74.aClass16_58 = Static42.method971(arg1, local124.anInt2187, local124.anInt2191);
		local124.method1455(0, 0);
		@Pc(142) Class3_Sub1_Sub2_Sub3 local142 = Static79.method1602(Static75.aClass60_1021, arg0, Static6.aClass60_98);
		Static63.aClass16_68 = Static42.method971(arg1, local142.anInt2187, local142.anInt2191);
		local142.method1455(0, 0);
		@Pc(160) Class3_Sub1_Sub2_Sub3 local160 = Static79.method1602(Static15.aClass60_248, arg0, Static6.aClass60_98);
		Static27.aClass16_25 = Static42.method971(arg1, local160.anInt2187, local160.anInt2191);
		local160.method1455(0, 0);
		@Pc(178) Class3_Sub1_Sub2_Sub3 local178 = Static79.method1602(Static55.aClass60_778, arg0, Static6.aClass60_98);
		Static3.aClass16_5 = Static42.method971(arg1, local178.anInt2187, local178.anInt2191);
		local178.method1455(0, 0);
		@Pc(196) Class3_Sub1_Sub2_Sub3 local196 = Static79.method1602(Static66.aClass60_897, arg0, Static6.aClass60_98);
		Static55.aClass16_42 = Static42.method971(arg1, local196.anInt2187, local196.anInt2191);
		local196.method1455(0, 0);
		@Pc(214) Class3_Sub1_Sub2_Sub3 local214 = Static79.method1602(Static50.aClass60_732, arg0, Static6.aClass60_98);
		Static70.aClass16_53 = Static42.method971(arg1, local214.anInt2187, local214.anInt2191);
		local214.method1455(0, 0);
		@Pc(232) Class3_Sub1_Sub2_Sub3 local232 = Static79.method1602(Static96.aClass60_1179, arg0, Static6.aClass60_98);
		Static61.aClass16_46 = Static42.method971(arg1, local232.anInt2187, local232.anInt2191);
		local232.method1455(0, 0);
		@Pc(250) Class3_Sub1_Sub2_Sub3 local250 = Static79.method1602(Static50.aClass60_733, arg0, Static6.aClass60_98);
		Static12.aClass16_12 = Static42.method971(arg1, local250.anInt2187, local250.anInt2191);
		local250.method1455(0, 0);
		Static72.aClass3_Sub1_Sub2_Sub4_7 = Static54.method1137(Static6.aClass60_98, Static62.aClass60_859, arg0);
		Static130.aClass3_Sub1_Sub2_Sub4_21 = Static54.method1137(Static6.aClass60_98, aClass60_473, arg0);
		Static85.aClass3_Sub1_Sub2_Sub4_10 = Static54.method1137(Static6.aClass60_98, Static31.aClass60_424, arg0);
		Static65.aClass3_Sub1_Sub2_Sub4_6 = Static72.aClass3_Sub1_Sub2_Sub4_7.method1904();
		Static65.aClass3_Sub1_Sub2_Sub4_6.method1901();
		Static107.aClass3_Sub1_Sub2_Sub4_17 = Static130.aClass3_Sub1_Sub2_Sub4_21.method1904();
		Static107.aClass3_Sub1_Sub2_Sub4_17.method1901();
		Static43.aClass3_Sub1_Sub2_Sub4_3 = Static72.aClass3_Sub1_Sub2_Sub4_7.method1904();
		Static43.aClass3_Sub1_Sub2_Sub4_3.method1905();
		Static100.aClass3_Sub1_Sub2_Sub4_14 = Static130.aClass3_Sub1_Sub2_Sub4_21.method1904();
		Static100.aClass3_Sub1_Sub2_Sub4_14.method1905();
		Static51.aClass3_Sub1_Sub2_Sub4_2 = Static85.aClass3_Sub1_Sub2_Sub4_10.method1904();
		Static51.aClass3_Sub1_Sub2_Sub4_2.method1905();
		Static112.aClass3_Sub1_Sub2_Sub4_18 = Static72.aClass3_Sub1_Sub2_Sub4_7.method1904();
		Static112.aClass3_Sub1_Sub2_Sub4_18.method1901();
		Static112.aClass3_Sub1_Sub2_Sub4_18.method1905();
		Static119.aClass3_Sub1_Sub2_Sub4_20 = Static130.aClass3_Sub1_Sub2_Sub4_21.method1904();
		Static119.aClass3_Sub1_Sub2_Sub4_20.method1901();
		Static119.aClass3_Sub1_Sub2_Sub4_20.method1905();
		Static80.aClass3_Sub1_Sub2_Sub4Array6 = Static52.method1130(arg0, Static11.aClass60_150, Static6.aClass60_98);
		Static85.anIntArray270 = new int[33];
		Static13.anIntArray54 = new int[151];
		Static107.anIntArray323 = new int[33];
		Static33.anIntArray139 = new int[151];
		@Pc(350) int local350;
		@Pc(352) int local352;
		@Pc(354) int local354;
		for (@Pc(346) int local346 = 0; local346 < 33; local346++) {
			local350 = 999;
			local352 = 0;
			for (local354 = 0; local354 < 34; local354++) {
				if (Static98.aClass3_Sub1_Sub2_Sub4_12.aByteArray75[local354 + local346 * Static98.aClass3_Sub1_Sub2_Sub4_12.anInt2860] == 0) {
					if (local350 == 999) {
						local350 = local354;
					}
				} else if (local350 != 999) {
					local352 = local354;
					break;
				}
			}
			Static85.anIntArray270[local346] = local350;
			Static107.anIntArray323[local346] = local352 - local350;
		}
		for (local350 = 5; local350 < 156; local350++) {
			local352 = 999;
			local354 = 0;
			for (@Pc(415) int local415 = 25; local415 < 172; local415++) {
				if (Static98.aClass3_Sub1_Sub2_Sub4_12.aByteArray75[local350 * Static98.aClass3_Sub1_Sub2_Sub4_12.anInt2860 + local415] == 0 && (local415 > 34 || local350 > 34)) {
					if (local352 == 999) {
						local352 = local415;
					}
				} else if (local352 != 999) {
					local354 = local415;
					break;
				}
			}
			Static13.anIntArray54[local350 - 5] = local352 - 25;
			Static33.anIntArray139[local350 - 5] = local354 - local352;
		}
		Static12.aBoolean13 = true;
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
	public static void method796() {
		Static98.aClass17_47.method646();
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
	public static void method797() {
		anIntArrayArray34 = null;
		aByteArrayArrayArray2 = null;
		aClass17_20 = null;
		aClass60_480 = null;
		aClass60_479 = null;
		aClass60_476 = null;
		aClass60_473 = null;
		aClass60_477 = null;
		aClass60_474 = null;
		aClass60_472 = null;
		aClass60_481 = null;
		aFontMetrics1 = null;
		aClass60_478 = null;
		aClass60_471 = null;
	}
}
