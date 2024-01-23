import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	public static int anInt2976;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!ek;")
	public static Class42 aClass42_35;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!ek;")
	public static Class42 aClass42_36;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "I")
	public static int anInt2985;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "[I")
	public static int[] anIntArray293 = new int[4096];

	@OriginalMember(owner = "client!j", name = "l", descriptor = "[I")
	public static int[] anIntArray294 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!j", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString100 = " has logged out.";

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
	public static void method2394(@OriginalArg(1) int arg0) {
		if (Static188.anIntArray567 == null || Static188.anIntArray567.length < arg0) {
			Static188.anIntArray567 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method2395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		@Pc(19) long local19 = Static160.method4114(arg3, arg1 + 0, arg4);
		@Pc(33) int local33;
		@Pc(47) int local47;
		@Pc(40) int local40;
		@Pc(51) Class146 local51;
		@Pc(73) int local73;
		@Pc(71) int[] local71;
		@Pc(88) int local88;
		if (local19 != 0L) {
			local33 = (int) local19 >> 20 & 0x3;
			local40 = Integer.MAX_VALUE & (int) (local19 >>> 32);
			local47 = (int) local19 >> 14 & 0x1F;
			local51 = Static10.method158(local40);
			if (local51.anInt4764 == -1) {
				local71 = Static77.anIntArray163;
				local73 = arg2;
				local88 = (103 - arg4) * 512 * 4 + arg1 * 4 + 24624;
				if (local19 > 0L) {
					local73 = arg0;
				}
				if (local47 == 0 || local47 == 2) {
					if (local33 == 0) {
						local71[local88] = local73;
						local71[local88 + 512] = local73;
						local71[local88 + 1024] = local73;
						local71[local88 + 1536] = local73;
					} else if (local33 == 1) {
						local71[local88] = local73;
						local71[local88 + 1] = local73;
						local71[local88 + 2] = local73;
						local71[local88 + 3] = local73;
					} else if (local33 == 2) {
						local71[local88 + 3] = local73;
						local71[local88 + 512 + 3] = local73;
						local71[local88 + 1024 + 3] = local73;
						local71[local88 + 1536 + 3] = local73;
					} else if (local33 == 3) {
						local71[local88 + 1536] = local73;
						local71[local88 + 1 + 1536] = local73;
						local71[local88 + 2 + 1536] = local73;
						local71[local88 + 1539] = local73;
					}
				}
				if (local47 == 3) {
					if (local33 == 0) {
						local71[local88] = local73;
					} else if (local33 == 1) {
						local71[local88 + 3] = local73;
					} else if (local33 == 2) {
						local71[local88 + 1539] = local73;
					} else if (local33 == 3) {
						local71[local88 + 1536] = local73;
					}
				}
				if (local47 == 2) {
					if (local33 == 3) {
						local71[local88] = local73;
						local71[local88 + 512] = local73;
						local71[local88 + 1024] = local73;
						local71[local88 + 1536] = local73;
					} else if (local33 == 0) {
						local71[local88] = local73;
						local71[local88 + 1] = local73;
						local71[local88 + 2] = local73;
						local71[local88 + 3] = local73;
					} else if (local33 == 1) {
						local71[local88 + 3] = local73;
						local71[local88 + 515] = local73;
						local71[local88 + 3 + 1024] = local73;
						local71[local88 + 3 + 1536] = local73;
					} else if (local33 == 2) {
						local71[local88 + 1536] = local73;
						local71[local88 + 1 + 1536] = local73;
						local71[local88 + 2 + 1536] = local73;
						local71[local88 + 3 + 1536] = local73;
					}
				}
			} else if (!Static20.method337(arg4, arg1, local51, local33)) {
				return false;
			}
		}
		local19 = Static166.method3026(arg3, arg1 + 0, arg4);
		if (local19 != 0L) {
			local33 = (int) local19 >> 20 & 0x3;
			local47 = (int) local19 >> 14 & 0x1F;
			local40 = (int) (local19 >>> 32) & Integer.MAX_VALUE;
			local51 = Static10.method158(local40);
			if (local51.anInt4764 == -1) {
				if (local47 == 9) {
					local71 = Static77.anIntArray163;
					local73 = 15658734;
					local88 = (103 - arg4) * 512 * 4 + arg1 * 4 + 24624;
					if (local19 > 0L) {
						local73 = 15597568;
					}
					if (local33 == 0 || local33 == 2) {
						local71[local88 + 1536] = local73;
						local71[local88 + 1024 + 1] = local73;
						local71[local88 + 512 + 2] = local73;
						local71[local88 + 3] = local73;
					} else {
						local71[local88] = local73;
						local71[local88 + 1 + 512] = local73;
						local71[local88 + 1024 + 2] = local73;
						local71[local88 + 1536 + 3] = local73;
					}
				}
			} else if (!Static20.method337(arg4, arg1, local51, local33)) {
				return false;
			}
		}
		local19 = Static202.method2141(arg3, arg1 + 0, arg4);
		if (local19 != 0L) {
			local33 = (int) local19 >> 20 & 0x3;
			local47 = Integer.MAX_VALUE & (int) (local19 >>> 32);
			@Pc(593) Class146 local593 = Static10.method158(local47);
			if (local593.anInt4764 != -1 && !Static20.method337(arg4, arg1, local593, local33)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
	public static void method2396() {
		Static157.aClass157_29.method4034(5);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V")
	public static void method2397(@OriginalArg(0) boolean arg0) {
		Static236.method3824(Static120.anInt2649, Static303.anInt5868, Static60.anInt1510, arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIBI)V")
	public static void method2398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > arg0) {
			Static25.method486(Static275.anIntArrayArray37[arg3], arg0, arg2, arg1);
		} else {
			Static25.method486(Static275.anIntArrayArray37[arg3], arg2, arg0, arg1);
		}
	}
}
