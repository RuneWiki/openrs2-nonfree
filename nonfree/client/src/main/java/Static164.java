import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "[S")
	public static short[] aShortArray45;

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "Lclient!of;")
	public static final Class188 aClass188_30 = new Class188(8);

	@OriginalMember(owner = "client!ht", name = "o", descriptor = "[I")
	public static final int[] anIntArray253 = new int[1024];

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "Lclient!cg;")
	public static final Class37 aClass37_11 = new Class37(15, 0, 1, 0);

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray70 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZIIIII)V")
	public static void method2401(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static123.anInt2069 < arg3 || arg2 < Static118.anInt2005) {
			return;
		}
		@Pc(28) boolean local28;
		if (arg0 < Static347.anInt6160) {
			arg0 = Static347.anInt6160;
			local28 = false;
		} else if (Static385.anInt6686 < arg0) {
			arg0 = Static385.anInt6686;
			local28 = false;
		} else {
			local28 = true;
		}
		@Pc(51) boolean local51;
		if (arg1 < Static347.anInt6160) {
			local51 = false;
			arg1 = Static347.anInt6160;
		} else if (arg1 <= Static385.anInt6686) {
			local51 = true;
		} else {
			arg1 = Static385.anInt6686;
			local51 = false;
		}
		if (Static118.anInt2005 <= arg3) {
			Static215.method3035(arg0, arg1, Static46.anIntArrayArray24[arg3++], arg4);
		} else {
			arg3 = Static118.anInt2005;
		}
		if (arg2 <= Static123.anInt2069) {
			Static215.method3035(arg0, arg1, Static46.anIntArrayArray24[arg2--], arg4);
		} else {
			arg2 = Static123.anInt2069;
		}
		@Pc(101) int local101;
		if (local28 && local51) {
			for (local101 = arg3; local101 <= arg2; local101++) {
				@Pc(106) int[] local106 = Static46.anIntArrayArray24[local101];
				local106[arg0] = local106[arg1] = arg4;
			}
			return;
		}
		if (local28) {
			for (local101 = arg3; local101 <= arg2; local101++) {
				Static46.anIntArrayArray24[local101][arg0] = arg4;
			}
			return;
		}
		if (local51) {
			for (local101 = arg3; local101 <= arg2; local101++) {
				Static46.anIntArrayArray24[local101][arg1] = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLclient!qu;)V")
	public static void method2403(@OriginalArg(1) Class208 arg0) {
		Static389.aClass2_Sub17_Sub1_2.method5576(arg0.method4853());
	}
}
