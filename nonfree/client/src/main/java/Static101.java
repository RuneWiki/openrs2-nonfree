import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "[I")
	public static int[] anIntArray259;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "[I")
	public static final int[] anIntArray258 = new int[4096];

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray3 = new int[2][][];

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBIIIII)V")
	public static void method2073(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(6) Class20_Sub4 local6 = (Class20_Sub4) Static227.aClass109_6.method2948(); local6 != null; local6 = (Class20_Sub4) Static227.aClass109_6.method2939()) {
			if (Static76.anInt2853 >= local6.anInt1607) {
				local6.method5103();
			} else {
				Static6.method119(local6.anInt1606 * 2, (local6.anInt1598 << 7) + 64, (local6.anInt1603 << 7) + 64, arg0 >> 1, arg3 >> 1);
				Static309.aClass30_5.method5333(local6.anInt1601 | 0xFF000000, arg2 + Static158.anIntArray632[0], local6.aString56, 0, arg1 + Static158.anIntArray632[1]);
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)V")
	public static void method2075(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class61 local12 = Static241.method5342(arg0);
		@Pc(15) int local15 = local12.anInt1353;
		@Pc(18) int local18 = local12.anInt1356;
		@Pc(21) int local21 = local12.anInt1352;
		@Pc(28) int local28 = Class6_Sub2_Sub11_Sub2.anIntArray569[local21 - local18];
		if (arg1 < 0 || local28 < arg1) {
			arg1 = 0;
		}
		local28 <<= local18;
		Static214.method3833(~local28 & Static41.anIntArray721[local15] | arg1 << local18 & local28, local15);
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(III)V")
	public static void method2079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static39.aClass187ArrayArrayArray1[0][arg1][arg2] != null && Static39.aClass187ArrayArrayArray1[0][arg1][arg2].aClass187_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static39.aClass187ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class187 local46 = Static39.aClass187ArrayArrayArray1[local22][arg1][arg2] = new Class187(local22, arg1, arg2);
				if (local20) {
					local46.aByte83++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZII)V")
	public static void method2080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static25.anInt504; local8++) {
			@Pc(14) Rectangle local14 = Class44.aRectangleArray21[local8];
			if (arg2 < local14.width + local14.x && local14.x < arg2 + arg0 && local14.height + local14.y > arg3 && local14.y < arg1 + arg3) {
				Static103.aBooleanArray18[local8] = true;
			}
		}
	}
}
