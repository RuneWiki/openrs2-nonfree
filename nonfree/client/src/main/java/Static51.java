import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!j", name = "G", descriptor = "I")
	public static int anInt1334;

	@OriginalMember(owner = "client!j", name = "K", descriptor = "Lclient!q;")
	public static Class4_Sub17 aClass4_Sub17_5;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "Lclient!lc;")
	public static Class40 aClass40_41;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "Lclient!mf;")
	public static Class48 aClass48_30 = new Class48(128);

	@OriginalMember(owner = "client!j", name = "z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_512 = Static121.method2047("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!j", name = "J", descriptor = "Lclient!mf;")
	public static Class48 aClass48_31 = new Class48(64);

	@OriginalMember(owner = "client!j", name = "L", descriptor = "Lclient!qc;")
	public static Class60 aClass60_513 = Static121.method2047("Cabbage");

	@OriginalMember(owner = "client!j", name = "N", descriptor = "[I")
	public static int[] anIntArray141 = new int[32];

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	public static void method970() {
		aClass40_41 = null;
		aClass4_Sub17_5 = null;
		aClass60_512 = null;
		aClass48_30 = null;
		anIntArray141 = null;
		aClass48_31 = null;
		aClass60_513 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!sd;B)V")
	public static void method972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub4_Sub1_Sub2_Sub2 arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		if ((arg1 & 0x100) != 0) {
			local9 = Static105.aClass4_Sub13_Sub1_3.method1255();
			local13 = Static105.aClass4_Sub13_Sub1_3.method1223();
			arg2.method1881(Static81.anInt1944, local9, local13);
			arg2.anInt2623 = Static81.anInt1944 + 300;
			arg2.anInt2598 = Static105.aClass4_Sub13_Sub1_3.method1229();
			arg2.anInt2619 = Static105.aClass4_Sub13_Sub1_3.method1255();
		}
		if ((arg1 & 0x20) != 0) {
			local9 = Static105.aClass4_Sub13_Sub1_3.method1244();
			local13 = Static105.aClass4_Sub13_Sub1_3.method1229();
			@Pc(57) int local57 = Static105.aClass4_Sub13_Sub1_3.method1235();
			@Pc(60) int local60 = Static105.aClass4_Sub13_Sub1_3.anInt1643;
			if (arg2.aClass60_1066 != null && arg2.aClass36_1 != null) {
				@Pc(71) long local71 = arg2.aClass60_1066.method1665();
				@Pc(73) boolean local73 = false;
				if (local13 <= 1) {
					for (@Pc(78) int local78 = 0; local78 < Static85.anInt2032; local78++) {
						if (Static39.aLongArray7[local78] == local71) {
							local73 = true;
							break;
						}
					}
				}
				if (!local73 && Static57.anInt528 == 0) {
					Static122.aClass4_Sub13_5.anInt1643 = 0;
					Static105.aClass4_Sub13_Sub1_3.method1203(Static122.aClass4_Sub13_5.aByteArray68, local57);
					Static122.aClass4_Sub13_5.anInt1643 = 0;
					@Pc(124) Class60 local124 = Static97.method1747(Static56.method1039(Static122.aClass4_Sub13_5).method1663());
					arg2.aClass60_1059 = local124.method1666();
					arg2.anInt2627 = local9 >> 8;
					arg2.anInt2602 = local9 & 0xFF;
					arg2.anInt2596 = 150;
					if (local13 == 2 || local13 == 3) {
						Static73.method1386(local124, 1, Static125.method2072(new Class60[] { Static22.aClass60_237, arg2.aClass60_1066 }));
					} else if (local13 == 1) {
						Static73.method1386(local124, 1, Static125.method2072(new Class60[] { Static74.aClass60_725, arg2.aClass60_1066 }));
					} else {
						Static73.method1386(local124, 2, arg2.aClass60_1066);
					}
				}
			}
			Static105.aClass4_Sub13_Sub1_3.anInt1643 = local60 + local57;
		}
		if ((arg1 & 0x400) != 0) {
			arg2.anInt2604 = Static105.aClass4_Sub13_Sub1_3.method1223();
			arg2.anInt2586 = Static105.aClass4_Sub13_Sub1_3.method1235();
			arg2.anInt2589 = Static105.aClass4_Sub13_Sub1_3.method1255();
			arg2.anInt2638 = Static105.aClass4_Sub13_Sub1_3.method1223();
			arg2.anInt2597 = Static105.aClass4_Sub13_Sub1_3.method1210() + Static81.anInt1944;
			arg2.anInt2618 = Static105.aClass4_Sub13_Sub1_3.method1232() + Static81.anInt1944;
			arg2.anInt2621 = Static105.aClass4_Sub13_Sub1_3.method1229();
			arg2.anInt2600 = 1;
			arg2.anInt2599 = 0;
		}
		if ((arg1 & 0x1) != 0) {
			local9 = Static105.aClass4_Sub13_Sub1_3.method1255();
			local13 = Static105.aClass4_Sub13_Sub1_3.method1255();
			arg2.method1881(Static81.anInt1944, local9, local13);
			arg2.anInt2623 = Static81.anInt1944 + 300;
			arg2.anInt2598 = Static105.aClass4_Sub13_Sub1_3.method1223();
			arg2.anInt2619 = Static105.aClass4_Sub13_Sub1_3.method1229();
		}
		if ((arg1 & 0x80) != 0) {
			local9 = Static105.aClass4_Sub13_Sub1_3.method1244();
			if (local9 == 65535) {
				local9 = -1;
			}
			local13 = Static105.aClass4_Sub13_Sub1_3.method1235();
			Static107.method1835(local13, arg2, local9);
		}
		if ((arg1 & 0x10) != 0) {
			local9 = Static105.aClass4_Sub13_Sub1_3.method1223();
			@Pc(339) byte[] local339 = new byte[local9];
			@Pc(344) Class4_Sub13 local344 = new Class4_Sub13(local339);
			Static105.aClass4_Sub13_Sub1_3.method1203(local339, local9);
			Static22.aClass4_Sub13Array1[arg0] = local344;
			arg2.method1886(local344);
		}
		if ((arg1 & 0x8) != 0) {
			arg2.anInt2625 = Static105.aClass4_Sub13_Sub1_3.method1244();
			if (arg2.anInt2625 == 65535) {
				arg2.anInt2625 = -1;
			}
		}
		if ((arg1 & 0x2) != 0) {
			arg2.anInt2641 = Static105.aClass4_Sub13_Sub1_3.method1210();
			arg2.anInt2607 = Static105.aClass4_Sub13_Sub1_3.method1210();
		}
		if ((arg1 & 0x200) != 0) {
			arg2.anInt2630 = Static105.aClass4_Sub13_Sub1_3.method1236();
			local9 = Static105.aClass4_Sub13_Sub1_3.method1234();
			arg2.anInt2608 = 0;
			arg2.anInt2642 = local9 >> 16;
			arg2.anInt2617 = 0;
			arg2.anInt2610 = Static81.anInt1944 + (local9 & 0xFFFF);
			if (arg2.anInt2630 == 65535) {
				arg2.anInt2630 = -1;
			}
			if (arg2.anInt2610 > Static81.anInt1944) {
				arg2.anInt2617 = -1;
			}
		}
		if ((arg1 & 0x4) == 0) {
			return;
		}
		arg2.aClass60_1059 = Static105.aClass4_Sub13_Sub1_3.method1249();
		if (arg2.aClass60_1059.method1634(0) == 126) {
			arg2.aClass60_1059 = arg2.aClass60_1059.method1662(1);
			Static73.method1386(arg2.aClass60_1059, 2, arg2.aClass60_1066);
		} else if (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1 == arg2) {
			Static73.method1386(arg2.aClass60_1059, 2, arg2.aClass60_1066);
		}
		arg2.anInt2602 = 0;
		arg2.anInt2627 = 0;
		arg2.anInt2596 = 150;
	}
}
