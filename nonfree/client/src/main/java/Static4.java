import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!g;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_38 = Static72.method1077("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Lclient!u;")
	public static Class74 aClass74_39 = Static72.method1077("null");

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!u;")
	private static Class74 aClass74_43 = Static72.method1077("Loaded input handler");

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!u;")
	public static Class74 aClass74_40 = aClass74_43;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_41 = null;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!u;")
	public static Class74 aClass74_42 = Static72.method1077("blinken1:");

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public static int anInt56 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method24() {
		aClass74_40 = null;
		aLongArray1 = null;
		aClass74_38 = null;
		aClass74_39 = null;
		aClass26_1 = null;
		aClass74_43 = null;
		aClass74_41 = null;
		aClass74_42 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method25() {
		if (Static53.anInt1291 != 0 && Static53.anInt1291 != 3 || Static41.anInt973 != 1) {
			return;
		}
		@Pc(26) int local26 = Static15.anInt442 - 9;
		@Pc(32) int local32 = Static120.anInt2565 - 550 - 25;
		if (local32 < 0 || local26 < 0 || local32 >= 146 || local26 >= 151) {
			return;
		}
		@Pc(58) int local58 = Static5.anInt62 + Static18.anInt562 & 0x7FF;
		@Pc(62) int local62 = Class2_Sub2_Sub1_Sub4.anIntArray122[local58];
		@Pc(70) int local70 = local62 * (Static41.anInt968 + 256) >> 8;
		local32 -= 73;
		@Pc(75) int local75 = Class2_Sub2_Sub1_Sub4.anIntArray119[local58];
		local26 -= 75;
		@Pc(84) int local84 = local75 * (Static41.anInt968 + 256) >> 8;
		@Pc(94) int local94 = local26 * local84 - local70 * local32 >> 11;
		@Pc(104) int local104 = local32 * local84 + local70 * local26 >> 11;
		@Pc(111) int local111 = local104 + Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 >> 7;
		@Pc(119) int local119 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 - local94 >> 7;
		@Pc(139) boolean local139 = Static48.method794(1, 0, true, 0, local119, 0, local111, 0, 0, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
		if (!local139) {
			return;
		}
		Static128.aClass2_Sub10_Sub1_3.method1486(local32);
		Static128.aClass2_Sub10_Sub1_3.method1486(local26);
		Static128.aClass2_Sub10_Sub1_3.method1485(Static18.anInt562);
		Static128.aClass2_Sub10_Sub1_3.method1486(57);
		Static128.aClass2_Sub10_Sub1_3.method1486(Static5.anInt62);
		Static128.aClass2_Sub10_Sub1_3.method1486(Static41.anInt968);
		Static128.aClass2_Sub10_Sub1_3.method1486(89);
		Static128.aClass2_Sub10_Sub1_3.method1485(Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673);
		Static128.aClass2_Sub10_Sub1_3.method1485(Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672);
		Static128.aClass2_Sub10_Sub1_3.method1486(Static85.anInt1830);
		Static128.aClass2_Sub10_Sub1_3.method1486(63);
		return;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!g;IIZI)V")
	public static void method26(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		Static62.aClass26_12 = arg1;
		Static72.anInt1559 = 10000;
		Static9.anInt300 = 1;
		Static77.aBoolean68 = false;
		Static107.anInt2339 = arg2;
		Static84.anInt1827 = arg0;
		Static121.anInt2594 = arg3;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!ba;)V")
	public static void method27(@OriginalArg(1) Class2_Sub2_Sub2_Sub1 arg0) {
		if (arg0.anInt2707 == 0) {
			return;
		}
		@Pc(40) int local40;
		@Pc(47) int local47;
		if (arg0.anInt2717 != -1 && arg0.anInt2717 < 32768) {
			@Pc(31) Class2_Sub2_Sub2_Sub1_Sub1 local31 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[arg0.anInt2717];
			if (local31 != null) {
				local40 = arg0.anInt2673 - local31.anInt2673;
				local47 = arg0.anInt2672 - local31.anInt2672;
				if (local40 != 0 || local47 != 0) {
					arg0.anInt2705 = (int) (Math.atan2((double) local40, (double) local47) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(75) int local75;
		if (arg0.anInt2717 >= 32768) {
			local75 = arg0.anInt2717 - 32768;
			if (Static39.anInt949 == local75) {
				local75 = 2047;
			}
			@Pc(88) Class2_Sub2_Sub2_Sub1_Sub2 local88 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local75];
			if (local88 != null) {
				local47 = arg0.anInt2673 - local88.anInt2673;
				@Pc(104) int local104 = arg0.anInt2672 - local88.anInt2672;
				if (local47 != 0 || local104 != 0) {
					arg0.anInt2705 = (int) (Math.atan2((double) local47, (double) local104) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2664 != 0 || arg0.anInt2713 != 0) && (arg0.anInt2691 == 0 || arg0.anInt2709 > 0)) {
			local75 = arg0.anInt2673 - (arg0.anInt2664 - Static107.anInt2343 - Static107.anInt2343) * 64;
			local40 = arg0.anInt2672 - (arg0.anInt2713 - Static62.anInt1413 - Static62.anInt1413) * 64;
			if (local75 != 0 || local40 != 0) {
				arg0.anInt2705 = (int) (Math.atan2((double) local75, (double) local40) * 325.949D) & 0x7FF;
			}
			arg0.anInt2713 = 0;
			arg0.anInt2664 = 0;
		}
		local75 = arg0.anInt2705 - arg0.anInt2720 & 0x7FF;
		if (local75 == 0) {
			arg0.anInt2723 = 0;
			return;
		}
		arg0.anInt2723++;
		@Pc(212) boolean local212;
		if (local75 > 1024) {
			local212 = true;
			arg0.anInt2720 -= arg0.anInt2707;
			if (local75 < arg0.anInt2707 || local75 > 2048 - arg0.anInt2707) {
				local212 = false;
				arg0.anInt2720 = arg0.anInt2705;
			}
			if (arg0.anInt2722 == arg0.anInt2663 && (arg0.anInt2723 > 25 || local212)) {
				if (arg0.anInt2708 == -1) {
					arg0.anInt2663 = arg0.anInt2693;
				} else {
					arg0.anInt2663 = arg0.anInt2708;
				}
			}
		} else {
			arg0.anInt2720 += arg0.anInt2707;
			local212 = true;
			if (local75 < arg0.anInt2707 || 2048 - arg0.anInt2707 < local75) {
				arg0.anInt2720 = arg0.anInt2705;
				local212 = false;
			}
			if (arg0.anInt2722 == arg0.anInt2663 && (arg0.anInt2723 > 25 || local212)) {
				if (arg0.anInt2682 == -1) {
					arg0.anInt2663 = arg0.anInt2693;
				} else {
					arg0.anInt2663 = arg0.anInt2682;
				}
			}
		}
		arg0.anInt2720 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIB)I")
	public static int method28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}
}
