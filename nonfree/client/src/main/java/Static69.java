import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!mc;")
	public static Class33_Sub1 aClass33_Sub1_35;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public static int anInt2065;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!da;")
	public static Class15 aClass15_49;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "[I")
	public static int[] anIntArray279;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!wb;")
	public static Class65 aClass65_954 = Static24.method441("@cr1@");

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!wb;")
	public static Class65 aClass65_955 = Static24.method441("Fertigkeit)2");

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!wb;")
	public static Class65 aClass65_956 = Static24.method441("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!wb;")
	private static Class65 aClass65_958 = Static24.method441("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_957 = aClass65_958;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	public static int anInt2068 = -1;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
	public static int anInt2069 = -1;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)[Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3[] method1240() {
		@Pc(8) Class2_Sub1_Sub4_Sub3[] local8 = new Class2_Sub1_Sub4_Sub3[Static78.anInt565];
		for (@Pc(10) int local10 = 0; local10 < Static78.anInt565; local10++) {
			@Pc(20) Class2_Sub1_Sub4_Sub3 local20 = local8[local10] = new Class2_Sub1_Sub4_Sub3();
			local20.anInt2451 = Static82.anInt2367;
			local20.anInt2446 = Static90.anInt1399;
			local20.anInt2447 = Static28.anIntArray110[local10];
			local20.anInt2449 = Static17.anIntArray79[local10];
			local20.anInt2448 = Static98.anIntArray404[local10];
			local20.anInt2450 = Static24.anIntArray98[local10];
			local20.anIntArray318 = Static28.anIntArray109;
			local20.aByteArray62 = Static101.aByteArrayArray9[local10];
		}
		Static13.method284();
		return local8;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public static void method1241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class52 local11 = Static22.aClass52ArrayArrayArray1[Static62.anInt1879][arg1][arg0];
		if (local11 == null) {
			Static67.aClass18_1.method595(Static62.anInt1879, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub1_Sub1_Sub3 local23 = null;
		@Pc(28) Class2_Sub1_Sub1_Sub3 local28;
		for (local28 = (Class2_Sub1_Sub1_Sub3) local11.method1587(); local28 != null; local28 = (Class2_Sub1_Sub1_Sub3) local11.method1588()) {
			@Pc(34) Class2_Sub1_Sub8 local34 = Static70.method1263(local28.anInt1292);
			@Pc(37) int local37 = local34.anInt1831;
			if (local34.anInt1820 == 1) {
				local37 *= local28.anInt1297 + 1;
			}
			if (local37 > local21) {
				local21 = local37;
				local23 = local28;
			}
		}
		if (local23 == null) {
			Static67.aClass18_1.method595(Static62.anInt1879, arg1, arg0);
			return;
		}
		@Pc(76) Class2_Sub1_Sub1_Sub3 local76 = null;
		local11.method1584(local23);
		local28 = (Class2_Sub1_Sub1_Sub3) local11.method1587();
		@Pc(87) Class2_Sub1_Sub1_Sub3 local87 = null;
		while (local28 != null) {
			if (local28.anInt1292 != local23.anInt1292) {
				if (local87 == null) {
					local87 = local28;
				}
				if (local28.anInt1292 != local87.anInt1292 && local76 == null) {
					local76 = local28;
				}
			}
			local28 = (Class2_Sub1_Sub1_Sub3) local11.method1588();
		}
		@Pc(129) int local129 = (arg0 << 7) + arg1 + 1610612736;
		Static67.aClass18_1.method585(Static62.anInt1879, arg1, arg0, Static25.method447(Static62.anInt1879, arg0 * 128 + 64, arg1 * 128 + 64), local23, local129, local87, local76);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!ce;Z)V")
	public static void method1242(@OriginalArg(1) Class13 arg0, @OriginalArg(2) boolean arg1) {
		if (Static39.aClass13_2 != null) {
			try {
				Static39.aClass13_2.method316();
			} catch (@Pc(14) Exception local14) {
			}
			Static39.aClass13_2 = null;
		}
		Static39.aClass13_2 = arg0;
		Static84.method1446(arg1);
		Static24.anInt711 = 0;
		Static70.aClass2_Sub8_3.anInt2342 = 0;
		Static93.aClass2_Sub8_5 = null;
		Static12.aClass2_Sub1_Sub13_1 = null;
		while (true) {
			@Pc(39) Class2_Sub1_Sub13 local39 = (Class2_Sub1_Sub13) Static102.aClass7_6.method162();
			if (local39 == null) {
				while (true) {
					local39 = (Class2_Sub1_Sub13) Static46.aClass7_3.method162();
					if (local39 == null) {
						if (Static41.aByte2 != 0) {
							try {
								@Pc(93) Class2_Sub8 local93 = new Class2_Sub8(4);
								local93.method1375(4);
								local93.method1375(Static41.aByte2);
								local93.method1398(0);
								Static39.aClass13_2.method313(4, local93.aByteArray59);
							} catch (@Pc(114) IOException local114) {
								try {
									Static39.aClass13_2.method316();
								} catch (@Pc(121) Exception local121) {
								}
								Static39.aClass13_2 = null;
								Static26.anInt2924++;
							}
						}
						Static87.anInt2519 = 0;
						Static5.aLong15 = Static76.method1306();
						return;
					}
					Static90.aClass28_4.method828(local39);
					Static80.aClass7_4.method167(local39.aLong82, local39);
					Static20.anInt628--;
					Static107.anInt2852++;
				}
			}
			Static13.aClass7_1.method167(local39.aLong82, local39);
			Static20.anInt622--;
			Static67.anInt2021++;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBIII[B[Lclient!uc;)V")
	public static void method1243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) Class58[] arg5) {
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (@Pc(15) int local15 = 0; local15 < 64; local15++) {
					if (arg2 + local11 > 0 && local11 + arg2 < 103 && local15 + arg0 > 0 && local15 + arg0 < 103) {
						arg5[local7].anIntArrayArray25[local11 + arg2][local15 + arg0] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(86) Class2_Sub8 local86 = new Class2_Sub8(arg4);
		for (@Pc(96) int local96 = 0; local96 < 4; local96++) {
			for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
				for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
					Static35.method737(arg0 + local104, arg3, local96, arg1, local86, 0, local100 + arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method1244() {
		aClass65_957 = null;
		anIntArray279 = null;
		aClass65_955 = null;
		aClass33_Sub1_35 = null;
		aClass65_956 = null;
		aClass65_954 = null;
		aClass65_958 = null;
		aClass15_49 = null;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	public static void method1245() {
		Static60.anIntArray247 = new int[104];
		Static7.aByteArrayArrayArray3 = new byte[4][104][104];
		Static7.aByteArrayArrayArray2 = new byte[4][104][104];
		Static68.anIntArrayArray18 = new int[105][105];
		Static90.anIntArray196 = new int[104];
		Static38.aByteArrayArrayArray4 = new byte[4][104][104];
		Static100.anIntArrayArrayArray7 = new int[4][105][105];
		Static89.anIntArray369 = new int[104];
		Static4.anIntArray28 = new int[104];
		Static5.aByteArrayArrayArray1 = new byte[4][104][104];
		Static106.anInt2837 = 99;
		Static50.anIntArray199 = new int[104];
		Static100.aByteArrayArrayArray9 = new byte[4][105][105];
	}
}
