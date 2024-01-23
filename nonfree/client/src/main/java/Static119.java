import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!j", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray21;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	public static int anInt4991;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	public static int anInt4988 = 0;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "[C")
	public static char[] aCharArray16 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!j", name = "f", descriptor = "I")
	public static int anInt4990 = 0;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	public static int anInt4994 = 50;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I[Ljava/lang/Object;II[J)V")
	public static void method3836(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg2) / 2;
		@Pc(18) long local18 = arg3[local14];
		arg3[local14] = arg3[arg0];
		arg3[arg0] = local18;
		@Pc(30) int local30 = arg2;
		@Pc(34) Object local34 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg0; local46++) {
			if (arg3[local46] < (long) (local46 & 0x1) + local18) {
				@Pc(69) long local69 = arg3[local46];
				arg3[local46] = arg3[local30];
				arg3[local30] = local69;
				@Pc(83) Object local83 = arg1[local46];
				arg1[local46] = arg1[local30];
				arg1[local30++] = local83;
			}
		}
		arg3[arg0] = arg3[local30];
		arg3[local30] = local18;
		arg1[arg0] = arg1[local30];
		arg1[local30] = local34;
		method3836(local30 - 1, arg1, arg2, arg3);
		method3836(arg0, arg1, local30 + 1, arg3);
	}
}
