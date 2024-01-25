import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	public static int anInt7512 = 104;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
	public static int anInt7514 = 999999;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "[I")
	public static final int[] anIntArray502 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	public static int anInt7517 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)I")
	public static int method6277(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!dk;B)I")
	public static int method6278(@OriginalArg(0) Class72 arg0) {
		if (Static332.aClass72_8 == arg0) {
			return 6407;
		} else if (arg0 == Static306.aClass72_5) {
			return 6408;
		} else if (Static61.aClass72_1 == arg0) {
			return 6406;
		} else if (arg0 == Static173.aClass72_4) {
			return 6409;
		} else if (Static473.aClass72_15 == arg0) {
			return 6410;
		} else if (arg0 == Static392.aClass72_11) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[I[I)V")
	public static void method6282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg1) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) int local25 = arg2[local19];
		arg2[local19] = arg2[arg0];
		arg2[arg0] = local25;
		@Pc(39) int local39 = arg3[local19];
		arg3[local19] = arg3[arg0];
		arg3[arg0] = local39;
		@Pc(58) int local58 = ~local25 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg1; local60 < arg0; local60++) {
			if (local25 + (local58 & local60) > arg2[local60]) {
				@Pc(80) int local80 = arg2[local60];
				arg2[local60] = arg2[local21];
				arg2[local21] = local80;
				@Pc(94) int local94 = arg3[local60];
				arg3[local60] = arg3[local21];
				arg3[local21++] = local94;
			}
		}
		arg2[arg0] = arg2[local21];
		arg2[local21] = local25;
		arg3[arg0] = arg3[local21];
		arg3[local21] = local39;
		method6282(local21 - 1, arg1, arg2, arg3);
		method6282(arg0, local21 + 1, arg2, arg3);
	}
}
