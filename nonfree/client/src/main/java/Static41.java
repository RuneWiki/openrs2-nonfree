import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public static int anInt850;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "B")
	public static byte aByte4;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "Z")
	public static boolean aBoolean79 = true;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[2][][];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIB)I")
	public static int method727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return 7 - arg1;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZZIILclient!af;Lclient!af;)I")
	public static int method728(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub1 arg4, @OriginalArg(6) Class4_Sub1 arg5) {
		@Pc(6) int local6 = Static231.method3702(arg4, arg2, arg0, arg5);
		if (local6 != 0) {
			return arg0 ? -local6 : local6;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = Static231.method3702(arg4, arg3, arg1, arg5);
			return arg1 ? -local32 : local32;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!kl;IIII)V")
	public static void method731(@OriginalArg(0) Class11_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 == Static138.aClass11_Sub4_Sub1_3 || Static241.anInt4470 >= 400) {
			return;
		}
		@Pc(40) String local40;
		if (arg0.anInt3002 == 0) {
			@Pc(44) boolean local44 = true;
			if (Static138.aClass11_Sub4_Sub1_3.anInt2997 != -1 && arg0.anInt2997 != -1) {
				@Pc(70) int local70 = Static138.aClass11_Sub4_Sub1_3.anInt3015 > arg0.anInt3015 ? Static138.aClass11_Sub4_Sub1_3.anInt3015 : arg0.anInt3015;
				@Pc(81) int local81 = arg0.anInt2997 <= Static138.aClass11_Sub4_Sub1_3.anInt2997 ? arg0.anInt2997 : Static138.aClass11_Sub4_Sub1_3.anInt2997;
				@Pc(91) int local91 = local81 + local70 * 10 / 100 + 5;
				@Pc(98) int local98 = Static138.aClass11_Sub4_Sub1_3.anInt3015 - arg0.anInt3015;
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local98 > local91) {
					local44 = false;
				}
			}
			@Pc(119) String local119 = Static272.anInt5005 == 1 ? Static230.aString151 : Static35.aString29;
			if (arg0.anInt3006 > arg0.anInt3015) {
				local40 = arg0.method2583() + (local44 ? Static297.method4443(Static138.aClass11_Sub4_Sub1_3.anInt3015, arg0.anInt3015) : "<col=ffffff>") + " (" + local119 + arg0.anInt3015 + "+" + (arg0.anInt3006 - arg0.anInt3015) + ")";
			} else {
				local40 = arg0.method2583() + (local44 ? Static297.method4443(Static138.aClass11_Sub4_Sub1_3.anInt3015, arg0.anInt3015) : "<col=ffffff>") + " (" + local119 + arg0.anInt3015 + ")";
			}
		} else {
			local40 = arg0.method2583() + " (" + Static161.aString106 + arg0.anInt3002 + ")";
		}
		@Pc(225) int local225;
		if (Static101.anInt2152 == 1) {
			Static69.method1328(Static199.aString133 + " -> <col=ffffff>" + local40, arg3, (short) 1, Static150.anInt3066, Static253.aString167, arg2, (long) arg1);
		} else if (!Static187.aBoolean318) {
			for (local225 = 7; local225 >= 0; local225--) {
				if (Static218.aStringArray25[local225] != null) {
					@Pc(238) short local238 = 0;
					if (Static272.anInt5005 == 0 && Static218.aStringArray25[local225].equalsIgnoreCase(Static287.aString202)) {
						if (Static138.aClass11_Sub4_Sub1_3.anInt3015 < arg0.anInt3015) {
							local238 = 2000;
						}
						if (Static138.aClass11_Sub4_Sub1_3.anInt2998 != 0 && arg0.anInt2998 != 0) {
							if (arg0.anInt2998 == Static138.aClass11_Sub4_Sub1_3.anInt2998) {
								local238 = 2000;
							} else {
								local238 = 0;
							}
						}
					} else if (Static253.aBooleanArray21[local225]) {
						local238 = 2000;
					}
					@Pc(289) short local289 = Static297.aShortArray86[local225];
					@Pc(294) short local294 = (short) (local289 + local238);
					Static69.method1328("<col=ffffff>" + local40, arg3, local294, Static9.anIntArray22[local225], Static218.aStringArray25[local225], arg2, (long) arg1);
				}
			}
		} else if ((Static96.anInt2071 & 0x8) != 0) {
			Static69.method1328(Static176.aString113 + " -> <col=ffffff>" + local40, arg3, (short) 20, Static144.anInt2797, Static132.aString88, arg2, (long) arg1);
		}
		for (local225 = 0; local225 < Static241.anInt4470; local225++) {
			if (Static94.aShortArray46[local225] == 38) {
				Static246.aStringArray28[local225] = "<col=ffffff>" + local40;
				break;
			}
		}
	}
}
