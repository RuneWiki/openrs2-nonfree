import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
	public static int anInt1726;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
	public static int anInt1727;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Lclient!ga;")
	public static Class29 aClass29_9;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!mb;")
	public static Class49 aClass49_17 = new Class49(64);

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_900 = Static80.method1463("backbase2");

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	public static int anInt1728 = 0;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Lclient!rd;")
	public static Class63 aClass63_901 = Static80.method1463("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Lclient!rd;")
	public static Class63 aClass63_902 = Static80.method1463("Classic");

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Lclient!rd;")
	public static Class63 aClass63_903 = Static80.method1463("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!rd;")
	public static Class63 aClass63_904 = Static80.method1463("An:");

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Lclient!rd;")
	public static Class63 aClass63_905 = Static80.method1463("blinken3:");

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Lclient!rd;")
	public static Class63 aClass63_906 = Static80.method1463("gleiten:");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZIII)Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2 method1131(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) long local23 = ((long) arg0 << 38) + ((long) arg3 << 16) + (long) arg2 + ((long) arg4 << 40);
		@Pc(31) Class6_Sub3_Sub3_Sub2 local31;
		if (!arg1) {
			local31 = (Class6_Sub3_Sub3_Sub2) Static73.aClass49_20.method1397(local23);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class6_Sub3_Sub8 local39 = Static91.method1664(arg2);
		if (arg3 > 1 && local39.anIntArray155 != null) {
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
				if (arg3 >= local39.anIntArray156[local49] && local39.anIntArray156[local49] != 0) {
					local47 = local39.anIntArray155[local49];
				}
			}
			if (local47 != -1) {
				local39 = Static91.method1664(local47);
			}
		}
		@Pc(90) Class6_Sub3_Sub1_Sub3 local90 = local39.method955(1);
		if (local90 == null) {
			return null;
		}
		@Pc(96) Class6_Sub3_Sub3_Sub2 local96 = null;
		if (local39.anInt1386 != -1) {
			local96 = method1131(1, true, local39.anInt1377, 10, 0);
			if (local96 == null) {
				return null;
			}
		}
		@Pc(116) int[] local116 = Static121.anIntArray338;
		@Pc(118) int local118 = Static121.anInt2988;
		@Pc(120) int local120 = Static121.anInt2984;
		@Pc(122) int local122 = Static121.anInt2986;
		@Pc(124) int local124 = Static121.anInt2985;
		@Pc(126) int local126 = Static121.anInt2987;
		@Pc(128) int local128 = Static121.anInt2989;
		@Pc(130) int[] local130 = Static107.method1985();
		@Pc(132) int local132 = Static107.anInt2992;
		@Pc(134) int local134 = Static107.anInt2997;
		local31 = new Class6_Sub3_Sub3_Sub2(36, 32);
		Static121.method1977(local31.anIntArray221, 36, 32);
		Static71.anIntArray230 = Static107.method1987(Static71.anIntArray230);
		Static121.method1976(0, 0, 36, 32, 0);
		Static107.aBoolean162 = false;
		Static107.method1993(16, 16);
		@Pc(162) int local162 = local39.anInt1358;
		if (arg1) {
			local162 = (int) ((double) local162 * 1.5D);
		} else if (arg0 == 2) {
			local162 = (int) ((double) local162 * 1.04D);
		}
		@Pc(192) int local192 = Class6_Sub3_Sub3_Sub4.anIntArray342[local39.anInt1397] * local162 >> 16;
		@Pc(201) int local201 = local162 * Class6_Sub3_Sub3_Sub4.anIntArray343[local39.anInt1397] >> 16;
		local90.method632();
		local90.method623(local39.anInt1359, local39.anInt1367, local39.anInt1397, local39.anInt1380, local201 + local90.anInt3082 / 2 + local39.anInt1360, local192 + local39.anInt1360);
		if (arg0 >= 1) {
			local31.method1267(1);
		}
		if (arg0 >= 2) {
			local31.method1267(16777215);
		}
		if (arg4 != 0) {
			local31.method1271(arg4);
		}
		Static121.method1977(local31.anIntArray221, 36, 32);
		if (local39.anInt1386 != -1) {
			local96.method1252(0, 0);
		}
		if (!arg1 && (local39.anInt1401 == 1 || arg3 != 1) && arg3 != -1) {
			Static33.aClass6_Sub3_Sub3_Sub1_1.method456(Static13.method348(arg3), 1, 10, 1);
			Static33.aClass6_Sub3_Sub3_Sub1_1.method456(Static13.method348(arg3), 0, 9, 16776960);
		}
		if (!arg1) {
			Static73.aClass49_20.method1396(local23, local31);
		}
		Static121.method1977(local116, local118, local120);
		Static121.method1969(local122, local128, local124, local126);
		Static107.method1987(local130);
		Static107.anInt2997 = local134;
		Static107.anInt2992 = local132;
		Static107.method1983();
		Static107.aBoolean162 = true;
		return local31;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method1132() {
		aClass63_904 = null;
		aClass63_903 = null;
		aClass63_900 = null;
		aClass49_17 = null;
		aClass29_9 = null;
		aClass63_906 = null;
		aClass63_905 = null;
		aClass63_901 = null;
		aClass63_902 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!af;ILclient!nc;I)V")
	public static void method1133(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		@Pc(7) Class6_Sub5 local7 = new Class6_Sub5();
		local7.aClass53_3 = arg2;
		local7.aClass7_Sub1_6 = arg0;
		local7.aLong91 = arg1;
		local7.anInt846 = 1;
		@Pc(22) Class1 local22 = Static109.aClass1_10;
		synchronized (Static109.aClass1_10) {
			Static109.aClass1_10.method10(local7);
		}
		Static13.method346();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Lclient!dd;")
	public static Class6_Sub3_Sub5 method1134(@OriginalArg(0) int arg0) {
		@Pc(6) Class6_Sub3_Sub5 local6 = (Class6_Sub3_Sub5) Static29.aClass49_8.method1397((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static47.aClass7_27.method110(1, arg0);
		local6 = new Class6_Sub3_Sub5();
		if (local28 != null) {
			local6.method582(arg0, new Class6_Sub4(local28));
		}
		local6.method583();
		Static29.aClass49_8.method1396((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B[B)V")
	public static void method1135(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class6_Sub4 local10 = new Class6_Sub4(arg0);
		local10.anInt1949 = arg0.length - 2;
		Static2.anInt18 = local10.method1306();
		Static117.anIntArray345 = new int[Static2.anInt18];
		Static22.anIntArray65 = new int[Static2.anInt18];
		Static39.anIntArray143 = new int[Static2.anInt18];
		Static59.anIntArray189 = new int[Static2.anInt18];
		Static61.aByteArrayArray6 = new byte[Static2.anInt18][];
		local10.anInt1949 = arg0.length - Static2.anInt18 * 8 - 7;
		Static18.anInt566 = local10.method1306();
		Static12.anInt417 = local10.method1306();
		@Pc(70) int local70 = (local10.method1321() & 0xFF) + 1;
		for (@Pc(72) int local72 = 0; local72 < Static2.anInt18; local72++) {
			Static22.anIntArray65[local72] = local10.method1306();
		}
		for (@Pc(90) int local90 = 0; local90 < Static2.anInt18; local90++) {
			Static39.anIntArray143[local90] = local10.method1306();
		}
		for (@Pc(104) int local104 = 0; local104 < Static2.anInt18; local104++) {
			Static117.anIntArray345[local104] = local10.method1306();
		}
		for (@Pc(118) int local118 = 0; local118 < Static2.anInt18; local118++) {
			Static59.anIntArray189[local118] = local10.method1306();
		}
		local10.anInt1949 = arg0.length + 3 - Static2.anInt18 * 8 - local70 * 3 - 7;
		Static61.anIntArray190 = new int[local70];
		for (@Pc(155) int local155 = 1; local155 < local70; local155++) {
			Static61.anIntArray190[local155] = local10.method1290();
			if (Static61.anIntArray190[local155] == 0) {
				Static61.anIntArray190[local155] = 1;
			}
		}
		local10.anInt1949 = 0;
		for (@Pc(183) int local183 = 0; local183 < Static2.anInt18; local183++) {
			@Pc(189) int local189 = Static59.anIntArray189[local183];
			@Pc(193) int local193 = Static117.anIntArray345[local183];
			@Pc(197) int local197 = local193 * local189;
			@Pc(200) byte[] local200 = new byte[local197];
			Static61.aByteArrayArray6[local183] = local200;
			@Pc(208) int local208 = local10.method1321();
			@Pc(215) int local215;
			if (local208 == 0) {
				for (local215 = 0; local215 < local197; local215++) {
					local200[local215] = local10.method1297();
				}
			} else if (local208 == 1) {
				for (local215 = 0; local215 < local193; local215++) {
					for (@Pc(240) int local240 = 0; local240 < local189; local240++) {
						local200[local215 + local193 * local240] = local10.method1297();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIB)I")
	public static int method1136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0 & 0x3;
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return arg2;
		} else if (local8 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
