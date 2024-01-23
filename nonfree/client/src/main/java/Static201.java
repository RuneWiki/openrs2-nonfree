import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!wd;")
	public static Class111 aClass111_40;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Lclient!eg;")
	public static Class33 aClass33_16;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_31;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
	public static int[] anIntArray726 = new int[50];

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
	public static int[] anIntArray727 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_796 = Static199.method3560("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!qe;")
	public static Class78 aClass78_797 = Static199.method3560("m");

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
	public static int anInt4508 = 2;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "[S")
	public static short[] aShortArray142 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z")
	public static boolean method3570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static202.anInt4521; local1++) {
			@Pc(6) Class1 local6 = Static17.aClass1Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt11 == 1) {
				local15 = local6.anInt12 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt9 + (local6.anInt3 * local15 >> 8);
					local37 = local6.anInt1 + (local6.anInt14 * local15 >> 8);
					local47 = local6.anInt13 + (local6.anInt15 * local15 >> 8);
					local57 = local6.anInt19 + (local6.anInt2 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt11 == 2) {
				local15 = arg0 - local6.anInt12;
				if (local15 > 0) {
					local27 = local6.anInt9 + (local6.anInt3 * local15 >> 8);
					local37 = local6.anInt1 + (local6.anInt14 * local15 >> 8);
					local47 = local6.anInt13 + (local6.anInt15 * local15 >> 8);
					local57 = local6.anInt19 + (local6.anInt2 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt11 == 3) {
				local15 = local6.anInt9 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt12 + (local6.anInt10 * local15 >> 8);
					local37 = local6.anInt5 + (local6.anInt6 * local15 >> 8);
					local47 = local6.anInt13 + (local6.anInt15 * local15 >> 8);
					local57 = local6.anInt19 + (local6.anInt2 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt11 == 4) {
				local15 = arg2 - local6.anInt9;
				if (local15 > 0) {
					local27 = local6.anInt12 + (local6.anInt10 * local15 >> 8);
					local37 = local6.anInt5 + (local6.anInt6 * local15 >> 8);
					local47 = local6.anInt13 + (local6.anInt15 * local15 >> 8);
					local57 = local6.anInt19 + (local6.anInt2 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt11 == 5) {
				local15 = arg1 - local6.anInt13;
				if (local15 > 0) {
					local27 = local6.anInt12 + (local6.anInt10 * local15 >> 8);
					local37 = local6.anInt5 + (local6.anInt6 * local15 >> 8);
					local47 = local6.anInt9 + (local6.anInt3 * local15 >> 8);
					local57 = local6.anInt1 + (local6.anInt14 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method3576() {
		for (@Pc(12) int local12 = -1; local12 < Static180.anInt4193; local12++) {
			@Pc(19) int local19;
			if (local12 == -1) {
				local19 = 2047;
			} else {
				local19 = Static16.anIntArray792[local12];
			}
			@Pc(29) Class5_Sub2_Sub2 local29 = Static213.aClass5_Sub2_Sub2Array3[local19];
			if (local29 != null) {
				Static204.method3621(local29.anInt1832, local29);
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!mj;IB)V")
	public static void method3580(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aByte15 == 0) {
			arg1.anInt3004 = arg1.anInt3065;
		} else if (arg1.aByte15 == 1) {
			arg1.anInt3004 = (arg0 - arg1.anInt3021) / 2 + arg1.anInt3065;
		} else if (arg1.aByte15 == 2) {
			arg1.anInt3004 = arg0 - arg1.anInt3021 - arg1.anInt3065;
		} else if (arg1.aByte15 == 3) {
			arg1.anInt3004 = arg1.anInt3065 * arg0 >> 14;
		} else if (arg1.aByte15 == 4) {
			arg1.anInt3004 = (arg0 * arg1.anInt3065 >> 14) + (arg0 - arg1.anInt3021) / 2;
		} else {
			arg1.anInt3004 = arg0 - (arg1.anInt3065 * arg0 >> 14) - arg1.anInt3021;
		}
		if (arg1.aByte12 == 0) {
			arg1.anInt3052 = arg1.anInt3036;
		} else if (arg1.aByte12 == 1) {
			arg1.anInt3052 = arg1.anInt3036 + (arg2 - arg1.anInt3040) / 2;
		} else if (arg1.aByte12 == 2) {
			arg1.anInt3052 = arg2 - arg1.anInt3036 - arg1.anInt3040;
		} else if (arg1.aByte12 == 3) {
			arg1.anInt3052 = arg1.anInt3036 * arg2 >> 14;
		} else if (arg1.aByte12 == 4) {
			arg1.anInt3052 = (arg2 * arg1.anInt3036 >> 14) + (arg2 - arg1.anInt3040) / 2;
		} else {
			arg1.anInt3052 = arg2 - (arg2 * arg1.anInt3036 >> 14) - arg1.anInt3040;
		}
		if (!Static57.aBoolean21) {
			return;
		}
		if (Static36.method473(arg1) == 0 && arg1.anInt3051 != 0) {
			return;
		}
		if (arg1.anInt3052 < 0) {
			arg1.anInt3052 = 0;
		} else if (arg1.anInt3052 + arg1.anInt3040 > arg2) {
			arg1.anInt3052 = arg2 - arg1.anInt3040;
		}
		if (arg1.anInt3004 < 0) {
			arg1.anInt3004 = 0;
			return;
		}
		if (arg0 < arg1.anInt3021 + arg1.anInt3004) {
			arg1.anInt3004 = arg0 - arg1.anInt3021;
			return;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mj;IB)I")
	public static int method3582(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray29 == null || arg1 >= arg0.anIntArrayArray29.length) {
			return -2;
		}
		try {
			@Pc(21) int local21 = 0;
			@Pc(26) int[] local26 = arg0.anIntArrayArray29[arg1];
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(40) int local40 = 0;
				@Pc(45) int local45 = local26[local21++];
				@Pc(47) byte local47 = 0;
				if (local45 == 0) {
					return local30;
				}
				if (local45 == 1) {
					local40 = Static72.anIntArray745[local26[local21++]];
				}
				if (local45 == 2) {
					local40 = Static41.anIntArray129[local26[local21++]];
				}
				if (local45 == 3) {
					local40 = Static220.anIntArray772[local26[local21++]];
				}
				@Pc(97) int local97;
				@Pc(108) Class64 local108;
				@Pc(113) int local113;
				@Pc(125) int local125;
				if (local45 == 4) {
					local97 = local26[local21++] << 16;
					@Pc(104) int local104 = local97 + local26[local21++];
					local108 = Static204.method3618(local104);
					local113 = local26[local21++];
					if (local113 != -1 && (!Static32.method3209(local113).aBoolean154 || Static111.aBoolean104)) {
						for (local125 = 0; local125 < local108.anIntArray493.length; local125++) {
							if (local113 + 1 == local108.anIntArray493[local125]) {
								local40 += local108.anIntArray496[local125];
							}
						}
					}
				}
				if (local45 == 5) {
					local40 = Static198.anIntArray724[local26[local21++]];
				}
				if (local45 == 6) {
					local40 = Class2_Sub2_Sub22.anIntArray533[Static41.anIntArray129[local26[local21++]] - 1];
				}
				if (local45 == 15) {
					local47 = 1;
				}
				if (local45 == 7) {
					local40 = Static198.anIntArray724[local26[local21++]] * 100 / 46875;
				}
				if (local45 == 8) {
					local40 = Static31.aClass5_Sub2_Sub2_1.anInt1898;
				}
				if (local45 == 16) {
					local47 = 2;
				}
				if (local45 == 17) {
					local47 = 3;
				}
				if (local45 == 9) {
					for (local97 = 0; local97 < 25; local97++) {
						if (Static47.aBooleanArray27[local97]) {
							local40 += Static41.anIntArray129[local97];
						}
					}
				}
				if (local45 == 10) {
					local97 = local26[local21++] << 16;
					local97 += local26[local21++];
					local108 = Static204.method3618(local97);
					local113 = local26[local21++];
					if (local113 != -1 && (!Static32.method3209(local113).aBoolean154 || Static111.aBoolean104)) {
						for (local125 = 0; local125 < local108.anIntArray493.length; local125++) {
							if (local113 + 1 == local108.anIntArray493[local125]) {
								local40 = 999999999;
								break;
							}
						}
					}
				}
				if (local45 == 11) {
					local40 = Static104.anInt2285;
				}
				if (local45 == 12) {
					local40 = Static10.anInt306;
				}
				if (local45 == 13) {
					local97 = Static198.anIntArray724[local26[local21++]];
					@Pc(325) int local325 = local26[local21++];
					local40 = (local97 & 0x1 << local325) == 0 ? 0 : 1;
				}
				if (local45 == 14) {
					local97 = local26[local21++];
					local40 = Static103.method1784(local97);
				}
				if (local45 == 18) {
					local40 = Static28.anInt497 + (Static31.aClass5_Sub2_Sub2_1.anInt1849 >> 7);
				}
				if (local45 == 19) {
					local40 = (Static31.aClass5_Sub2_Sub2_1.anInt1827 >> 7) + Static57.anInt628;
				}
				if (local45 == 20) {
					local40 = local26[local21++];
				}
				if (local47 == 0) {
					if (local28 == 0) {
						local30 += local40;
					}
					if (local28 == 1) {
						local30 -= local40;
					}
					if (local28 == 2 && local40 != 0) {
						local30 /= local40;
					}
					if (local28 == 3) {
						local30 *= local40;
					}
					local28 = 0;
				} else {
					local28 = local47;
				}
			}
		} catch (@Pc(428) Exception local428) {
			return -1;
		}
	}
}
