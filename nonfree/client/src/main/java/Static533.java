import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_123;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!tl;")
	public static final Class319 aClass319_14 = new Class319();

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([Ljava/lang/Object;I[III)V")
	public static void method7239(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(22) int local22 = (arg3 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg2[local22];
		arg2[local22] = arg2[arg3];
		arg2[arg3] = local28;
		@Pc(42) Object local42 = arg0[local22];
		arg0[local22] = arg0[arg3];
		arg0[arg3] = local42;
		@Pc(61) int local61 = ~local28 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg1; local63 < arg3; local63++) {
			if (arg2[local63] < (local63 & local61) + local28) {
				@Pc(78) int local78 = arg2[local63];
				arg2[local63] = arg2[local24];
				arg2[local24] = local78;
				@Pc(92) Object local92 = arg0[local63];
				arg0[local63] = arg0[local24];
				arg0[local24++] = local92;
			}
		}
		arg2[arg3] = arg2[local24];
		arg2[local24] = local28;
		arg0[arg3] = arg0[local24];
		arg0[local24] = local42;
		method7239(arg0, arg1, arg2, local24 - 1);
		method7239(arg0, local24 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BII)V")
	public static void method7242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (Static408.anInt7209 != arg0) {
			Static398.anIntArray514 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static398.anIntArray514[local13] = (local13 << 12) / arg0;
			}
			Static408.anInt7209 = arg0;
			Static368.anInt6505 = arg0 - 1;
			Static550.anInt9085 = arg0 * 32;
		}
		if (arg1 == Static88.anInt1743) {
			return;
		}
		if (Static408.anInt7209 == arg1) {
			Static501.anIntArray637 = Static398.anIntArray514;
		} else {
			Static501.anIntArray637 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static501.anIntArray637[local13] = (local13 << 12) / arg1;
			}
		}
		Static457.anInt7873 = arg1 - 1;
		Static88.anInt1743 = arg1;
	}
}
