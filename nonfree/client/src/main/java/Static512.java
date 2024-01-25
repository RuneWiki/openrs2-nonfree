import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
	public static int anInt8976;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public static void method7372() {
		if (Static336.anInt6621 == 1 || Static336.anInt6621 == 3 || Static336.anInt6621 != Static148.anInt6592 && (Static336.anInt6621 == 0 || Static148.anInt6592 == 0)) {
			Static59.anInt1906 = 0;
			Static438.anInt8226 = 0;
			Static278.aClass253_20.method6598();
		}
		Static148.anInt6592 = Static336.anInt6621;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIZI)V")
	public static void method7374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static188.anInt4410 || Static444.anInt8258 > arg3) {
			return;
		}
		@Pc(20) boolean local20;
		if (Static251.anInt9634 > arg1) {
			local20 = false;
			arg1 = Static251.anInt9634;
		} else if (arg1 <= Static366.anInt6946) {
			local20 = true;
		} else {
			local20 = false;
			arg1 = Static366.anInt6946;
		}
		@Pc(49) boolean local49;
		if (arg0 < Static251.anInt9634) {
			local49 = false;
			arg0 = Static251.anInt9634;
		} else if (arg0 > Static366.anInt6946) {
			arg0 = Static366.anInt6946;
			local49 = false;
		} else {
			local49 = true;
		}
		if (arg4 < Static444.anInt8258) {
			arg4 = Static444.anInt8258;
		} else {
			Static36.method1264(Static632.anIntArrayArray65[arg4++], arg1, arg2, arg0);
		}
		if (arg3 > Static188.anInt4410) {
			arg3 = Static188.anInt4410;
		} else {
			Static36.method1264(Static632.anIntArrayArray65[arg3--], arg1, arg2, arg0);
		}
		@Pc(97) int local97;
		if (local20 && local49) {
			for (local97 = arg4; local97 <= arg3; local97++) {
				@Pc(103) int[] local103 = Static632.anIntArrayArray65[local97];
				local103[arg1] = local103[arg0] = arg2;
			}
		} else if (local20) {
			for (local97 = arg4; local97 <= arg3; local97++) {
				Static632.anIntArrayArray65[local97][arg1] = arg2;
			}
		} else if (local49) {
			for (local97 = arg4; local97 <= arg3; local97++) {
				Static632.anIntArrayArray65[local97][arg0] = arg2;
			}
		}
	}
}
