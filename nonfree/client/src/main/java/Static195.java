import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
	public static boolean aBoolean248 = false;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
	public static int anInt3964 = -1;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	public static int anInt3965 = 104;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString137 = "wave:";

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIII)V")
	public static void method3673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static112.anInt2485 < arg1 || arg2 < Static32.anInt750) {
			return;
		}
		@Pc(18) boolean local18;
		if (Static6.anInt136 > arg4) {
			arg4 = Static6.anInt136;
			local18 = false;
		} else if (arg4 > Static275.anInt5244) {
			local18 = false;
			arg4 = Static275.anInt5244;
		} else {
			local18 = true;
		}
		@Pc(43) boolean local43;
		if (Static6.anInt136 > arg3) {
			arg3 = Static6.anInt136;
			local43 = false;
		} else if (arg3 > Static275.anInt5244) {
			local43 = false;
			arg3 = Static275.anInt5244;
		} else {
			local43 = true;
		}
		if (arg1 < Static32.anInt750) {
			arg1 = Static32.anInt750;
		} else {
			Static27.method690(arg3, Static104.anIntArrayArray31[arg1++], arg0, arg4);
		}
		if (Static112.anInt2485 < arg2) {
			arg2 = Static112.anInt2485;
		} else {
			Static27.method690(arg3, Static104.anIntArrayArray31[arg2--], arg0, arg4);
		}
		@Pc(97) int local97;
		if (local18 && local43) {
			for (local97 = arg1; local97 <= arg2; local97++) {
				@Pc(103) int[] local103 = Static104.anIntArrayArray31[local97];
				local103[arg4] = local103[arg3] = arg0;
			}
		} else if (local18) {
			for (local97 = arg1; local97 <= arg2; local97++) {
				Static104.anIntArrayArray31[local97][arg4] = arg0;
			}
		} else if (local43) {
			for (local97 = arg1; local97 <= arg2; local97++) {
				Static104.anIntArrayArray31[local97][arg3] = arg0;
			}
		}
	}
}
