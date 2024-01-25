import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "[I")
	public static int[] anIntArray471;

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IBI)Z")
	public static boolean method4677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;I)V")
	public static void method4678(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		Static524.method7354(arg3, arg1, arg0, -1, arg2, true);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!pq;II)Lclient!hfa;")
	public static Class6_Sub23 method4680(@OriginalArg(0) Class251 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method5855(arg1);
		return local8 == null ? null : new Class6_Sub23(local8);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Lclient!bc;")
	public static Class24 method4681(@OriginalArg(1) int arg0) {
		@Pc(8) Class24[] local8 = Static197.method2977();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class24 local16 = local8[local10];
			if (local16.anInt490 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIII)Z")
	public static boolean method4687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static98.method1512(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static188.anInt3275;
		@Pc(14) int local14 = arg2 << Static188.anInt3275;
		@Pc(23) int local23 = Static285.aClass60Array8[arg0].JA(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static188.anInt3275 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static188.anInt3275 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static188.anInt3275 - 7);
		if (arg3 == 1) {
			if (local10 > Static135.anInt2375) {
				if (!Static236.method3450(local10, local23, local14)) {
					return false;
				}
				if (!Static236.method3450(local10, local23, local14 + Static431.anInt7547)) {
					return false;
				}
				if (!Static236.method3450(local10, local23, local14 + Static57.anInt953)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static236.method3450(local10, local31, local14)) {
					return false;
				}
				if (!Static236.method3450(local10, local31, local14 + Static431.anInt7547)) {
					return false;
				}
				if (!Static236.method3450(local10, local31, local14 + Static57.anInt953)) {
					return false;
				}
			}
			if (!Static236.method3450(local10, local39, local14)) {
				return false;
			} else if (Static236.method3450(local10, local39, local14 + Static431.anInt7547)) {
				return Static236.method3450(local10, local39, local14 + Static57.anInt953);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static163.anInt2862) {
				if (!Static236.method3450(local10, local23, local14 + Static57.anInt953)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static431.anInt7547, local23, local14 + Static57.anInt953)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static57.anInt953, local23, local14 + Static57.anInt953)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static236.method3450(local10, local31, local14 + Static57.anInt953)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static431.anInt7547, local31, local14 + Static57.anInt953)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static57.anInt953, local31, local14 + Static57.anInt953)) {
					return false;
				}
			}
			if (!Static236.method3450(local10, local39, local14 + Static57.anInt953)) {
				return false;
			} else if (Static236.method3450(local10 + Static431.anInt7547, local39, local14 + Static57.anInt953)) {
				return Static236.method3450(local10 + Static57.anInt953, local39, local14 + Static57.anInt953);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static135.anInt2375) {
				if (!Static236.method3450(local10 + Static57.anInt953, local23, local14)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static57.anInt953, local23, local14 + Static431.anInt7547)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static57.anInt953, local23, local14 + Static57.anInt953)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static236.method3450(local10 + Static57.anInt953, local31, local14)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static57.anInt953, local31, local14 + Static431.anInt7547)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static57.anInt953, local31, local14 + Static57.anInt953)) {
					return false;
				}
			}
			if (!Static236.method3450(local10 + Static57.anInt953, local39, local14)) {
				return false;
			} else if (Static236.method3450(local10 + Static57.anInt953, local39, local14 + Static431.anInt7547)) {
				return Static236.method3450(local10 + Static57.anInt953, local39, local14 + Static57.anInt953);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static163.anInt2862) {
				if (!Static236.method3450(local10, local23, local14)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static431.anInt7547, local23, local14)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static57.anInt953, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static236.method3450(local10, local31, local14)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static431.anInt7547, local31, local14)) {
					return false;
				}
				if (!Static236.method3450(local10 + Static57.anInt953, local31, local14)) {
					return false;
				}
			}
			if (!Static236.method3450(local10, local39, local14)) {
				return false;
			} else if (Static236.method3450(local10 + Static431.anInt7547, local39, local14)) {
				return Static236.method3450(local10 + Static57.anInt953, local39, local14);
			} else {
				return false;
			}
		} else if (!Static236.method3450(local10 + Static431.anInt7547, local47, local14 + Static431.anInt7547)) {
			return false;
		} else if (arg3 == 16) {
			return Static236.method3450(local10, local39, local14 + Static57.anInt953);
		} else if (arg3 == 32) {
			return Static236.method3450(local10 + Static57.anInt953, local39, local14 + Static57.anInt953);
		} else if (arg3 == 64) {
			return Static236.method3450(local10 + Static57.anInt953, local39, local14);
		} else if (arg3 == 128) {
			return Static236.method3450(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4688(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
