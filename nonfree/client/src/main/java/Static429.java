import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
	public static int anInt6999 = 0;

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_250 = new Class56(88, -2);

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "[I")
	public static final int[] anIntArray529 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!vl", name = "G", descriptor = "[I")
	public static final int[] anIntArray530 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!vl", name = "M", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_251 = new Class56(72, 8);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZIIIIII)V")
	public static void method5619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static366.method4859(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg1;
		@Pc(27) int local27 = -arg1;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static267.anIntArrayArray50[arg3];
		@Pc(44) int local44 = arg4 - local15;
		@Pc(49) int local49 = arg4 + local15;
		Static249.method6044(local40, arg0, local44, arg4 - arg1);
		Static249.method6044(local40, arg5, local49, local44);
		Static249.method6044(local40, arg0, arg4 + arg1, local49);
		while (local24 > local10) {
			local34 += 2;
			local36 += 2;
			local32 += local36;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				Static136.anIntArray209[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(127) int[] local127;
			@Pc(133) int[] local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			@Pc(183) int local183;
			@Pc(187) int local187;
			@Pc(192) int local192;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				if (local24 >= local15) {
					local127 = Static267.anIntArrayArray50[local24 + arg3];
					local133 = Static267.anIntArrayArray50[arg3 - local24];
					local138 = arg4 + local10;
					local143 = arg4 - local10;
					Static249.method6044(local127, arg0, local138, local143);
					Static249.method6044(local133, arg0, local138, local143);
				} else {
					local127 = Static267.anIntArrayArray50[arg3 + local24];
					local133 = Static267.anIntArrayArray50[arg3 - local24];
					local138 = Static136.anIntArray209[local24];
					local143 = local10 + arg4;
					local183 = arg4 - local10;
					local187 = arg4 + local138;
					local192 = arg4 - local138;
					Static249.method6044(local127, arg0, local192, local183);
					Static249.method6044(local127, arg5, local187, local192);
					Static249.method6044(local127, arg0, local143, local187);
					Static249.method6044(local133, arg0, local192, local183);
					Static249.method6044(local133, arg5, local187, local192);
					Static249.method6044(local133, arg0, local143, local187);
				}
			}
			local127 = Static267.anIntArrayArray50[arg3 + local10];
			local133 = Static267.anIntArrayArray50[arg3 - local10];
			local138 = arg4 + local24;
			local143 = arg4 - local24;
			if (local10 < local15) {
				local183 = local10 > local29 ? Static136.anIntArray209[local10] : local29;
				local187 = arg4 + local183;
				local192 = arg4 - local183;
				Static249.method6044(local127, arg0, local192, local143);
				Static249.method6044(local127, arg5, local187, local192);
				Static249.method6044(local127, arg0, local138, local187);
				Static249.method6044(local133, arg0, local192, local143);
				Static249.method6044(local133, arg5, local187, local192);
				Static249.method6044(local133, arg0, local138, local187);
			} else {
				Static249.method6044(local127, arg0, local138, local143);
				Static249.method6044(local133, arg0, local138, local143);
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[S)[S")
	public static short[] method5622(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static461.method1987(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5630(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}
}
