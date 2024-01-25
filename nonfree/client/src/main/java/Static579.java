import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "F")
	public static float aFloat167;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "J")
	public static long aLong268;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
	public static int anInt9037;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_241 = new Class381(88, 0);

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "Z")
	public static boolean aBoolean604 = false;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "[[F")
	public static final float[][] aFloatArrayArray16 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "[I")
	public static int[] anIntArray521 = new int[8];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([[FI[[S)[[S")
	public static short[][] method7771(@OriginalArg(0) float[][] arg0, @OriginalArg(2) short[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			for (@Pc(13) int local13 = 0; local13 < arg1[local7].length; local13++) {
				arg1[local7][local13] = (short) (int) (arg0[local7][local13] * 16383.0F);
			}
		}
		if (16383 != 16383) {
			anIntArray521 = null;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB[I[II)V")
	public static void method7772(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local34;
		@Pc(54) int local54 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg0; local56 < arg3; local56++) {
			if (arg1[local56] < local20 + (local56 & local54)) {
				@Pc(74) int local74 = arg1[local56];
				arg1[local56] = arg1[local16];
				arg1[local16] = local74;
				@Pc(88) int local88 = arg2[local56];
				arg2[local56] = arg2[local16];
				arg2[local16++] = local88;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg3] = arg2[local16];
		arg2[local16] = local34;
		method7772(arg0, arg1, arg2, local16 - 1);
		method7772(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB[BIII)V")
	public static void method7773(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg0) {
			return;
		}
		arg3 += arg2;
		@Pc(21) int local21 = arg0 - arg2 >> 2;
		while (true) {
			local21--;
			if (local21 < 0) {
				local21 = arg0 - arg2 & 0x3;
				while (true) {
					local21--;
					if (local21 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(29) int local29 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg1[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg1[local34] = 1;
			arg3 = local39 + 1;
			arg1[local39] = 1;
		}
	}
}
