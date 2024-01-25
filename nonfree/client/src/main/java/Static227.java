import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!it", name = "r", descriptor = "J")
	public static long aLong121;

	@OriginalMember(owner = "client!it", name = "t", descriptor = "F")
	public static float aFloat110;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[5];

	@OriginalMember(owner = "client!it", name = "n", descriptor = "I")
	public static int anInt4290 = 0;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!vg;BI)V")
	public static void method3464(@OriginalArg(0) int arg0, @OriginalArg(1) Class341 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte119 == 0) {
			arg1.anInt9293 = arg1.anInt9245;
		} else if (arg1.aByte119 == 1) {
			arg1.anInt9293 = (arg2 - arg1.anInt9300) / 2 + arg1.anInt9245;
		} else if (arg1.aByte119 == 2) {
			arg1.anInt9293 = arg2 - arg1.anInt9300 - arg1.anInt9245;
		} else if (arg1.aByte119 == 3) {
			arg1.anInt9293 = arg1.anInt9245 * arg2 >> 14;
		} else if (arg1.aByte119 == 4) {
			arg1.anInt9293 = (arg2 - arg1.anInt9300) / 2 + (arg1.anInt9245 * arg2 >> 14);
		} else {
			arg1.anInt9293 = arg2 - (arg2 * arg1.anInt9245 >> 14) - arg1.anInt9300;
		}
		if (arg1.aByte117 == 0) {
			arg1.lb = arg1.anInt9279;
		} else if (arg1.aByte117 == 1) {
			arg1.lb = (arg0 - arg1.anInt9248) / 2 + arg1.anInt9279;
		} else if (arg1.aByte117 == 2) {
			arg1.lb = arg0 - arg1.anInt9248 - arg1.anInt9279;
		} else if (arg1.aByte117 == 3) {
			arg1.lb = arg0 * arg1.anInt9279 >> 14;
		} else if (arg1.aByte117 == 4) {
			arg1.lb = (arg1.anInt9279 * arg0 >> 14) + (arg0 - arg1.anInt9248) / 2;
		} else {
			arg1.lb = arg0 - (arg0 * arg1.anInt9279 >> 14) - arg1.anInt9248;
		}
		if (!Static595.aBoolean755) {
			return;
		}
		if (Static63.method1137(arg1).anInt9530 == 0 && arg1.anInt9309 != 0) {
			return;
		}
		if (arg1.anInt9293 < 0) {
			arg1.anInt9293 = 0;
		} else if (arg2 < arg1.anInt9293 + arg1.anInt9300) {
			arg1.anInt9293 = arg2 - arg1.anInt9300;
		}
		if (arg1.lb < 0) {
			arg1.lb = 0;
			return;
		}
		if (arg0 < arg1.lb + arg1.anInt9248) {
			arg1.lb = arg0 - arg1.anInt9248;
			return;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!mw;Z)Z")
	public static boolean method3465(@OriginalArg(0) Class8_Sub3_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static199.aClass47Array1 == Static557.aClass47Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7633();
		if (arg0.aShort132 < 0 || arg0.aShort131 < 0 || arg0.aShort133 >= Static27.anInt373 || arg0.aShort130 >= Static507.anInt8645) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort132; local36 <= arg0.aShort133; local36++) {
			for (local40 = arg0.aShort131; local40 <= arg0.aShort130; local40++) {
				@Pc(47) Class39 local47 = Static589.method7833(arg0.aByte123, local36, local40);
				if (local47 != null) {
					@Pc(53) Class111 local53 = Static492.method7386(arg0);
					@Pc(56) Class111 local56 = local47.aClass111_1;
					if (local56 == null) {
						local47.aClass111_1 = local53;
					} else {
						while (local56.aClass111_2 != null) {
							local56 = local56.aClass111_2;
						}
						local56.aClass111_2 = local53;
					}
					if (local6 && (Static114.anIntArrayArray59[local36][local40] & 0xFF000000) != 0) {
						local8 = Static114.anIntArrayArray59[local36][local40];
						local10 = Static535.aShortArrayArray12[local36][local40];
						local12 = Static548.aByteArrayArray32[local36][local40];
					}
					if (!arg1 && local47.aClass8_Sub3_Sub1_1 != null && local47.aClass8_Sub3_Sub1_1.aShort37 > local33) {
						local33 = local47.aClass8_Sub3_Sub1_1.aShort37;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort132; local40 <= arg0.aShort133; local40++) {
				for (@Pc(136) int local136 = arg0.aShort131; local136 <= arg0.aShort130; local136++) {
					if ((Static114.anIntArrayArray59[local40][local136] & 0xFF000000) == 0) {
						Static114.anIntArrayArray59[local40][local136] = local8;
						Static535.aShortArrayArray12[local40][local136] = local10;
						Static548.aByteArrayArray32[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static410.aClass8_Sub3_Sub3Array1[Static16.anInt203++] = arg0;
		} else {
			local40 = Static199.aClass47Array1 == Static557.aClass47Array3 ? 1 : 0;
			if (!arg0.method7622()) {
				Static88.aClass8_Sub3ArrayArray2[local40][Static583.anIntArray731[local40]++] = arg0;
			} else if (arg0.method7620()) {
				Static471.aClass8_Sub3ArrayArray3[local40][Static437.anIntArray588[local40]++] = arg0;
			} else {
				Static34.aClass8_Sub3ArrayArray4[local40][Static11.anIntArray12[local40]++] = arg0;
			}
		}
		if (arg1) {
			arg0.anInt9361 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V")
	public static void method3466() {
		Static136.aClass222_14.method4433(50);
	}
}
