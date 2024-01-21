import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "Lclient!fd;")
	public static Class24 aClass24_31;

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "[I")
	public static int[] anIntArray332;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	public static int anInt2834 = 0;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "Lclient!uf;")
	public static Class77 aClass77_14 = new Class77(4096);

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_1522 = Static69.method1231("sl_stars");

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
	public static int anInt2842 = 0;

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "Lclient!je;")
	public static Class40 aClass40_1523 = Static69.method1231("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "[I")
	public static int[] anIntArray331 = new int[50];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
	public static void method2032() {
		aClass40_1523 = null;
		aClass24_31 = null;
		anIntArray332 = null;
		aClass40_1522 = null;
		aClass77_14 = null;
		anIntArray331 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBLclient!ta;)V")
	public static void method2033(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub3 arg1) {
		if (arg1.anInt1787 > Static28.anInt704) {
			Static31.method468(arg1);
		} else if (arg1.anInt1784 >= Static28.anInt704) {
			Static52.method936(arg1);
		} else {
			method2035(arg1);
		}
		if (arg1.anInt1788 < 128 || arg1.anInt1792 < 128 || arg1.anInt1788 >= 13184 || arg1.anInt1792 >= 13184) {
			arg1.anInt1788 = arg1.anIntArray177[0] * 128 + arg1.anInt1789 * 64;
			arg1.anInt1784 = 0;
			arg1.anInt1816 = -1;
			arg1.anInt1817 = -1;
			arg1.anInt1792 = arg1.anInt1789 * 64 + arg1.anIntArray180[0] * 128;
			arg1.anInt1787 = 0;
			arg1.method1177();
		}
		if (arg1 == Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1 && (arg1.anInt1788 < 1536 || arg1.anInt1792 < 1536 || arg1.anInt1788 >= 11776 || arg1.anInt1792 >= 11776)) {
			arg1.anInt1788 = arg1.anInt1789 * 64 + arg1.anIntArray177[0] * 128;
			arg1.anInt1816 = -1;
			arg1.anInt1787 = 0;
			arg1.anInt1784 = 0;
			arg1.anInt1792 = arg1.anInt1789 * 64 + arg1.anIntArray180[0] * 128;
			arg1.anInt1817 = -1;
			arg1.method1177();
		}
		Static72.method1226(arg1);
		Static19.method378(arg1);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!ta;I)V")
	private static void method2035(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0) {
		arg0.anInt1790 = arg0.anInt1786;
		if (arg0.anInt1779 == 0) {
			arg0.anInt1770 = 0;
			return;
		}
		if (arg0.anInt1817 != -1 && arg0.anInt1814 == 0) {
			@Pc(34) Class2_Sub1_Sub7 local34 = Static40.method724(arg0.anInt1817);
			if (arg0.anInt1782 > 0 && local34.anInt1980 == 0) {
				arg0.anInt1770++;
				return;
			}
			if (arg0.anInt1782 <= 0 && local34.anInt1971 == 0) {
				arg0.anInt1770++;
				return;
			}
		}
		@Pc(69) int local69 = arg0.anInt1788;
		@Pc(84) int local84 = arg0.anInt1789 * 64 + arg0.anIntArray177[arg0.anInt1779 - 1] * 128;
		@Pc(99) int local99 = arg0.anInt1789 * 64 + arg0.anIntArray180[arg0.anInt1779 - 1] * 128;
		@Pc(102) int local102 = arg0.anInt1792;
		if (local84 - local69 > 256 || local84 - local69 < -256 || local99 - local102 > 256 || local99 - local102 < -256) {
			arg0.anInt1788 = local84;
			arg0.anInt1792 = local99;
			return;
		}
		@Pc(139) boolean local139 = true;
		@Pc(142) int local142 = arg0.anInt1813;
		@Pc(144) int local144 = 4;
		if (local84 <= local69) {
			if (local69 <= local84) {
				if (local102 < local99) {
					arg0.anInt1801 = 1024;
				} else if (local102 > local99) {
					arg0.anInt1801 = 0;
				}
			} else if (local102 < local99) {
				arg0.anInt1801 = 768;
			} else if (local99 < local102) {
				arg0.anInt1801 = 256;
			} else {
				arg0.anInt1801 = 512;
			}
		} else if (local102 < local99) {
			arg0.anInt1801 = 1280;
		} else if (local102 <= local99) {
			arg0.anInt1801 = 1536;
		} else {
			arg0.anInt1801 = 1792;
		}
		@Pc(239) int local239 = arg0.anInt1801 - arg0.anInt1818 & 0x7FF;
		if (local239 > 1024) {
			local239 -= 2048;
		}
		if (local239 >= -256 && local239 <= 256) {
			local142 = arg0.anInt1771;
		} else if (local239 >= 256 && local239 < 768) {
			local142 = arg0.anInt1823;
		} else if (local239 >= -768 && local239 <= -256) {
			local142 = arg0.anInt1777;
		}
		if (local142 == -1) {
			local142 = arg0.anInt1771;
		}
		arg0.anInt1790 = local142;
		if (arg0 instanceof Class2_Sub1_Sub1_Sub3_Sub1) {
			local139 = ((Class2_Sub1_Sub1_Sub3_Sub1) arg0).aClass2_Sub1_Sub11_1.aBoolean186;
		}
		if (local139) {
			if (arg0.anInt1801 != arg0.anInt1818 && arg0.anInt1815 == -1 && arg0.anInt1796 != 0) {
				local144 = 2;
			}
			if (arg0.anInt1779 > 2) {
				local144 = 6;
			}
			if (arg0.anInt1779 > 3) {
				local144 = 8;
			}
			if (arg0.anInt1770 > 0 && arg0.anInt1779 > 1) {
				arg0.anInt1770--;
				local144 = 8;
			}
		} else {
			if (arg0.anInt1779 > 1) {
				local144 = 6;
			}
			if (arg0.anInt1779 > 2) {
				local144 = 8;
			}
			if (arg0.anInt1770 > 0 && arg0.anInt1779 > 1) {
				local144 = 8;
				arg0.anInt1770--;
			}
		}
		if (arg0.aBooleanArray19[arg0.anInt1779 - 1]) {
			local144 <<= 0x1;
		}
		if (local144 >= 8 && arg0.anInt1771 == arg0.anInt1790 && arg0.anInt1778 != -1) {
			arg0.anInt1790 = arg0.anInt1778;
		}
		if (local84 > local69) {
			arg0.anInt1788 += local144;
			if (local84 < arg0.anInt1788) {
				arg0.anInt1788 = local84;
			}
		} else if (local84 < local69) {
			arg0.anInt1788 -= local144;
			if (arg0.anInt1788 < local84) {
				arg0.anInt1788 = local84;
			}
		}
		if (local99 > local102) {
			arg0.anInt1792 += local144;
			if (local99 < arg0.anInt1792) {
				arg0.anInt1792 = local99;
			}
		} else if (local99 < local102) {
			arg0.anInt1792 -= local144;
			if (arg0.anInt1792 < local99) {
				arg0.anInt1792 = local99;
			}
		}
		if (local84 != arg0.anInt1788 || arg0.anInt1792 != local99) {
			return;
		}
		arg0.anInt1779--;
		if (arg0.anInt1782 > 0) {
			arg0.anInt1782--;
			return;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILclient!qb;II)V")
	public static void method2036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub2_Sub4 arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		@Pc(12) int local12 = Static39.anInt1035 + Static19.anInt616 & 0x7FF;
		@Pc(20) int local20 = arg2 * arg2 + arg0 * arg0;
		if (local20 > 6400) {
			return;
		}
		@Pc(28) int local28 = Class2_Sub1_Sub2_Sub2.anIntArray219[local12];
		@Pc(36) int local36 = local28 * 256 / (Static94.anInt2403 + 256);
		@Pc(40) int local40 = Class2_Sub1_Sub2_Sub2.anIntArray221[local12];
		@Pc(48) int local48 = local40 * 256 / (Static94.anInt2403 + 256);
		@Pc(59) int local59 = local48 * arg2 - arg0 * local36 >> 16;
		@Pc(70) int local70 = arg2 * local36 + local48 * arg0 >> 16;
		if (local20 > 2500) {
			arg3.method1708(Static38.aClass2_Sub1_Sub2_Sub1_7, arg4 + local70 + 4 + 94 - arg3.anInt2387 / 2, -local59 + (arg1 - (-83 - (-(arg3.anInt2388 / 2) - 4))));
		} else {
			arg3.method1722(arg4 + local70 + 94 + 4 - arg3.anInt2387 / 2, arg1 - -83 + -4 - (local59 - -(arg3.anInt2388 / 2)));
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!kc;I)Lclient!je;")
	public static Class40 method2037(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (!Static88.method1598(Static116.method1945(arg0), arg1) && arg0.anObjectArray4 == null) {
			return null;
		} else if (arg0.aClass40Array6 == null || arg1 >= arg0.aClass40Array6.length || arg0.aClass40Array6[arg1] == null || arg0.aClass40Array6[arg1].method964().method950() == 0) {
			return Static65.aBoolean130 ? Static40.method722(new Class40[] { Static123.aClass40_1551, Static49.method886(arg1) }) : null;
		} else {
			return arg0.aClass40Array6[arg1];
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public static void method2038() {
		Static42.aBoolean78 = true;
		Static34.aBoolean60 = true;
	}
}
