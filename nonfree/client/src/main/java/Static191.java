import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIII)V")
	public static void method3433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = Static24.method734(Static307.anInt6214, arg2, Static228.anInt920);
		@Pc(21) int local21 = Static24.method734(Static307.anInt6214, arg0, Static228.anInt920);
		@Pc(27) int local27 = Static24.method734(Static96.anInt2180, arg4, Static124.anInt4221);
		@Pc(33) int local33 = Static24.method734(Static96.anInt2180, arg3, Static124.anInt4221);
		@Pc(42) int local42 = Static24.method734(Static307.anInt6214, arg2 + arg1, Static228.anInt920);
		@Pc(51) int local51 = Static24.method734(Static307.anInt6214, arg0 - arg1, Static228.anInt920);
		for (@Pc(53) int local53 = local11; local53 < local42; local53++) {
			Static205.method3670(arg5, local33, Static146.anIntArrayArray91[local53], local27);
		}
		for (@Pc(73) int local73 = local21; local73 > local51; local73--) {
			Static205.method3670(arg5, local33, Static146.anIntArrayArray91[local73], local27);
		}
		@Pc(99) int local99 = Static24.method734(Static96.anInt2180, arg1 + arg4, Static124.anInt4221);
		@Pc(108) int local108 = Static24.method734(Static96.anInt2180, arg3 - arg1, Static124.anInt4221);
		for (@Pc(110) int local110 = local42; local110 <= local51; local110++) {
			@Pc(116) int[] local116 = Static146.anIntArrayArray91[local110];
			Static205.method3670(arg5, local99, local116, local27);
			Static205.method3670(arg5, local33, local116, local108);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
	public static void method3434() {
		Static257.aClass119_160.method3304();
	}
}
