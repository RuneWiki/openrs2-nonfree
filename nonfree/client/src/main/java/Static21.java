import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "[Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5[] aClass1_Sub3_Sub1_Sub5Array2;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!l;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_218 = Static187.method3089("Untersuchen");

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
	public static final int[] anIntArray47 = new int[25];

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_219 = Static187.method3089("mem=");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static38.anIntArrayArrayArray2[arg0][local16][local20] == -Static71.anInt1617) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static73.anIntArrayArrayArray3[arg0][arg1][arg3] + arg5;
			if (!Static169.method2639(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static169.method2639(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static169.method2639(local20, local156, local182)) {
				return false;
			} else if (Static169.method2639(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static196.method3212(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static169.method2639(local16 + 1, Static73.anIntArrayArrayArray3[arg0][arg1][arg3] + arg5, local20 + 1) && Static169.method2639(local16 + 128 - 1, Static73.anIntArrayArrayArray3[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static169.method2639(local16 + 128 - 1, Static73.anIntArrayArrayArray3[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static169.method2639(local16 + 1, Static73.anIntArrayArrayArray3[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ab;Lclient!ab;I)I")
	public static int method437(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		@Pc(1) int local1 = 0;
		if (arg1.method3253(Static17.anInt3467)) {
			local1++;
		}
		if (arg0.method3253(Static187.anInt4097)) {
			local1++;
		}
		if (arg0.method3253(Static85.anInt1856)) {
			local1++;
		}
		if (arg0.method3253(Static155.anInt2985)) {
			local1++;
		}
		if (arg0.method3253(Static195.anInt4229)) {
			local1++;
		}
		if (arg0.method3253(Static73.anInt1643)) {
			local1++;
		}
		arg0.method3253(Static114.anInt2459);
		arg0.method3253(Static176.anInt3804);
		arg0.method3253(Static160.anInt3331);
		arg0.method3253(Static28.anInt642);
		arg0.method3253(Static31.anInt759);
		return local1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)Z")
	public static boolean method438(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}
}
