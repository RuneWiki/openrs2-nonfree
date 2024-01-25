import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!si", name = "k", descriptor = "Lclient!u;")
	public static final Class101 aClass101_1 = Static137.method2725();

	@OriginalMember(owner = "client!si", name = "m", descriptor = "[I")
	public static final int[] anIntArray487 = new int[32];

	@OriginalMember(owner = "client!si", name = "t", descriptor = "Z")
	public static boolean aBoolean520 = false;

	@OriginalMember(owner = "client!si", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString220 = "Choose Option";

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = Static181.method3367(Static229.anInt4777, arg3, Static165.anInt3366);
		@Pc(17) int local17 = Static181.method3367(Static229.anInt4777, arg2, Static165.anInt3366);
		@Pc(23) int local23 = Static181.method3367(Static338.anInt5369, arg5, Static295.anInt5964);
		@Pc(29) int local29 = Static181.method3367(Static338.anInt5369, arg0, Static295.anInt5964);
		@Pc(43) int local43 = Static181.method3367(Static229.anInt4777, arg3 + arg4, Static165.anInt3366);
		@Pc(51) int local51 = Static181.method3367(Static229.anInt4777, arg2 - arg4, Static165.anInt3366);
		for (@Pc(53) int local53 = local11; local53 < local43; local53++) {
			Static182.method3394(local23, Static30.anIntArrayArray10[local53], arg1, local29);
		}
		for (@Pc(69) int local69 = local17; local69 > local51; local69--) {
			Static182.method3394(local23, Static30.anIntArrayArray10[local69], arg1, local29);
		}
		@Pc(96) int local96 = Static181.method3367(Static338.anInt5369, arg5 + arg4, Static295.anInt5964);
		@Pc(104) int local104 = Static181.method3367(Static338.anInt5369, arg0 - arg4, Static295.anInt5964);
		for (@Pc(106) int local106 = local43; local106 <= local51; local106++) {
			@Pc(112) int[] local112 = Static30.anIntArrayArray10[local106];
			Static182.method3394(local23, local112, arg1, local96);
			Static182.method3394(local96, local112, arg6, local104);
			Static182.method3394(local104, local112, arg1, local29);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public static void method4973(@OriginalArg(1) int arg0) {
		@Pc(1) Class4_Sub1_Sub1 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class26 local8 = Static310.aClass26Array4[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static220.anInt4569; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static151.anInt3338; local15++) {
						local1 = local8.method4999(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class26 local41 = Static310.aClass26Array4[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method4996(local15, local12) - local41.method4996(local15, local12);
									@Pc(67) int local67 = local8.method4996(local15 + 1, local12) - local41.method4996(local15 + 1, local12);
									@Pc(85) int local85 = local8.method4996(local15 + 1, local12 + 1) - local41.method4996(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method4996(local15, local12 + 1) - local41.method4996(local15, local12 + 1);
									local41.method4991(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!am;Lclient!am;ZB)V")
	public static void method4974(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		Static192.aBoolean344 = true;
		Static101.aClass11_64 = arg0;
		Static223.aClass11_87 = arg1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZILclient!lb;III)V")
	public static void method4975(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class116 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static234.anInt4843 >= 50 || (arg1 == null || arg1.anIntArrayArray36 == null || arg2 >= arg1.anIntArrayArray36.length || arg1.anIntArrayArray36[arg2] == null)) {
			return;
		}
		@Pc(36) int local36 = arg1.anIntArrayArray36[arg2][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(69) int local69;
		if (arg1.anIntArrayArray36[arg2].length > 1) {
			local69 = (int) (Math.random() * (double) arg1.anIntArrayArray36[arg2].length);
			if (local69 > 0) {
				local40 = arg1.anIntArrayArray36[arg2][local69];
			}
		}
		if (local50 == 0) {
			if (arg0) {
				Static280.method4789(local40, 0, 255, local46);
			}
		} else if (Static235.anInt6709 != 0) {
			Static196.anIntArray362[Static234.anInt4843] = local40;
			Static115.anIntArray241[Static234.anInt4843] = local46;
			Static169.anIntArray331[Static234.anInt4843] = 0;
			Static268.aClass112Array1[Static234.anInt4843] = null;
			Static349.anIntArray540[Static234.anInt4843] = 255;
			local69 = (arg3 - 64) / 128;
			@Pc(138) int local138 = (arg4 - 64) / 128;
			Static111.anIntArray236[Static234.anInt4843] = local50 + (local69 << 16) + (local138 << 8);
			Static234.anInt4843++;
		}
	}
}
