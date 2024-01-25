import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dv", name = "G", descriptor = "I")
	public static int anInt1606;

	@OriginalMember(owner = "client!dv", name = "J", descriptor = "I")
	public static int anInt1608;

	@OriginalMember(owner = "client!dv", name = "K", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!dv", name = "M", descriptor = "Lclient!qn;")
	public static Class211 aClass211_22;

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
	public static int anInt1601 = -1;

	@OriginalMember(owner = "client!dv", name = "A", descriptor = "S")
	public static short aShort24 = 320;

	@OriginalMember(owner = "client!dv", name = "F", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_27 = new Class15("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!dv", name = "I", descriptor = "I")
	public static int anInt1607 = 765;

	@OriginalMember(owner = "client!dv", name = "N", descriptor = "[Lclient!cm;")
	public static final Class4_Sub2_Sub6[] aClass4_Sub2_Sub6Array1 = new Class4_Sub2_Sub6[14];

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I[I[ILclient!rd;[I)V")
	public static void method1305(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class8_Sub3_Sub1_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) int local13 = arg0[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg3[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg2.aClass39Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass39Array3[local23] = null;
					} else {
						@Pc(48) Class119 local48 = Static170.aClass125_3.method2389(local13);
						@Pc(51) int local51 = local48.anInt3012;
						@Pc(56) Class39 local56 = arg2.aClass39Array3[local23];
						if (local56 != null) {
							if (local56.anInt732 == local13) {
								if (local51 == 0) {
									local56 = arg2.aClass39Array3[local23] = null;
								} else if (local51 == 1) {
									local56.anInt729 = 0;
									local56.anInt731 = local21;
									local56.anInt738 = 1;
									local56.anInt734 = 0;
									local56.anInt736 = 0;
									Static334.method4419(arg2.anInt7339, local48, arg2.aByte99, arg2 == Static401.aClass8_Sub3_Sub1_Sub1_2, 0, arg2.anInt7343);
								} else if (local51 == 2) {
									local56.anInt729 = 0;
								}
							} else if (local48.anInt2999 >= Static170.aClass125_3.method2389(local56.anInt732).anInt2999) {
								local56 = arg2.aClass39Array3[local23] = null;
							}
						}
						if (local56 == null) {
							local56 = arg2.aClass39Array3[local23] = new Class39();
							local56.anInt729 = 0;
							local56.anInt732 = local13;
							local56.anInt731 = local21;
							local56.anInt738 = 1;
							local56.anInt734 = 0;
							local56.anInt736 = 0;
							Static334.method4419(arg2.anInt7339, local48, arg2.aByte99, Static401.aClass8_Sub3_Sub1_Sub1_2 == arg2, 0, arg2.anInt7343);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIIII)V")
	public static void method1306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(14) int local14 = arg4 - arg2;
		for (@Pc(16) int local16 = arg0; local16 < local9; local16++) {
			Static249.method6044(Static267.anIntArrayArray50[local16], arg5, arg3, arg1);
		}
		for (@Pc(36) int local36 = arg4; local36 > local14; local36--) {
			Static249.method6044(Static267.anIntArrayArray50[local36], arg5, arg3, arg1);
		}
		@Pc(58) int local58 = arg2 + arg1;
		@Pc(62) int local62 = arg3 - arg2;
		for (@Pc(68) int local68 = local9; local68 <= local14; local68++) {
			@Pc(74) int[] local74 = Static267.anIntArrayArray50[local68];
			Static249.method6044(local74, arg5, local58, arg1);
			Static249.method6044(local74, arg5, arg3, local62);
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZIII)I")
	public static int method1307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
