import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!oa;")
	public static Class105 aClass105_6;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	public static int anInt6355;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_211 = new Class186(37, 2);

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public static int anInt6352 = -1;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!go;")
	public static final Class95 aClass95_7 = new Class95("runescape", 0);

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_113 = new Class36(70, -1);

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static int anInt6354 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)Z")
	public static boolean method4948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static169.method2493(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static372.anInt7558;
		@Pc(14) int local14 = arg2 << Static372.anInt7558;
		@Pc(23) int local23 = Static346.aClass146Array2[arg0].I(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static372.anInt7558 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static372.anInt7558 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static372.anInt7558 - 7);
		if (arg3 == 1) {
			if (local10 > Static284.anInt5181) {
				if (!Static48.method1023(local10, local23, local14)) {
					return false;
				}
				if (!Static48.method1023(local10, local23, local14 + Static40.anInt1024)) {
					return false;
				}
				if (!Static48.method1023(local10, local23, local14 + Static205.anInt3908)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static48.method1023(local10, local31, local14)) {
					return false;
				}
				if (!Static48.method1023(local10, local31, local14 + Static40.anInt1024)) {
					return false;
				}
				if (!Static48.method1023(local10, local31, local14 + Static205.anInt3908)) {
					return false;
				}
			}
			if (!Static48.method1023(local10, local39, local14)) {
				return false;
			} else if (Static48.method1023(local10, local39, local14 + Static40.anInt1024)) {
				return Static48.method1023(local10, local39, local14 + Static205.anInt3908);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static113.anInt2415) {
				if (!Static48.method1023(local10, local23, local14 + Static205.anInt3908)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static40.anInt1024, local23, local14 + Static205.anInt3908)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static205.anInt3908, local23, local14 + Static205.anInt3908)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static48.method1023(local10, local31, local14 + Static205.anInt3908)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static40.anInt1024, local31, local14 + Static205.anInt3908)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static205.anInt3908, local31, local14 + Static205.anInt3908)) {
					return false;
				}
			}
			if (!Static48.method1023(local10, local39, local14 + Static205.anInt3908)) {
				return false;
			} else if (Static48.method1023(local10 + Static40.anInt1024, local39, local14 + Static205.anInt3908)) {
				return Static48.method1023(local10 + Static205.anInt3908, local39, local14 + Static205.anInt3908);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static284.anInt5181) {
				if (!Static48.method1023(local10 + Static205.anInt3908, local23, local14)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static205.anInt3908, local23, local14 + Static40.anInt1024)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static205.anInt3908, local23, local14 + Static205.anInt3908)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static48.method1023(local10 + Static205.anInt3908, local31, local14)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static205.anInt3908, local31, local14 + Static40.anInt1024)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static205.anInt3908, local31, local14 + Static205.anInt3908)) {
					return false;
				}
			}
			if (!Static48.method1023(local10 + Static205.anInt3908, local39, local14)) {
				return false;
			} else if (Static48.method1023(local10 + Static205.anInt3908, local39, local14 + Static40.anInt1024)) {
				return Static48.method1023(local10 + Static205.anInt3908, local39, local14 + Static205.anInt3908);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static113.anInt2415) {
				if (!Static48.method1023(local10, local23, local14)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static40.anInt1024, local23, local14)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static205.anInt3908, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static48.method1023(local10, local31, local14)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static40.anInt1024, local31, local14)) {
					return false;
				}
				if (!Static48.method1023(local10 + Static205.anInt3908, local31, local14)) {
					return false;
				}
			}
			if (!Static48.method1023(local10, local39, local14)) {
				return false;
			} else if (Static48.method1023(local10 + Static40.anInt1024, local39, local14)) {
				return Static48.method1023(local10 + Static205.anInt3908, local39, local14);
			} else {
				return false;
			}
		} else if (!Static48.method1023(local10 + Static40.anInt1024, local47, local14 + Static40.anInt1024)) {
			return false;
		} else if (arg3 == 16) {
			return Static48.method1023(local10, local39, local14 + Static205.anInt3908);
		} else if (arg3 == 32) {
			return Static48.method1023(local10 + Static205.anInt3908, local39, local14 + Static205.anInt3908);
		} else if (arg3 == 64) {
			return Static48.method1023(local10 + Static205.anInt3908, local39, local14);
		} else if (arg3 == 128) {
			return Static48.method1023(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBIII)V")
	public static void method4952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static116.aClass4_Sub30_Sub1_1.anInt6244 = 0;
		Static116.aClass4_Sub30_Sub1_1.method4871(Static58.aClass223_16.anInt6527);
		Static116.aClass4_Sub30_Sub1_1.method4871(arg0);
		Static116.aClass4_Sub30_Sub1_1.method4871(arg1);
		Static116.aClass4_Sub30_Sub1_1.method4846(arg2);
		Static116.aClass4_Sub30_Sub1_1.method4846(arg3);
		Static198.anInt3783 = -3;
		Static272.anInt4809 = 1;
		Static93.anInt1997 = 0;
		Static239.anInt4385 = 0;
	}
}
