import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!po", name = "d", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas6;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString243 = "Loaded textures";

	@OriginalMember(owner = "client!po", name = "j", descriptor = "I")
	public static int anInt6127 = 0;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "I")
	public static int anInt6130 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BIIIII)V")
	public static void method5303(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static165.anInt3409 < arg0 || arg4 < Static41.anInt1131) {
			return;
		}
		@Pc(29) boolean local29;
		if (Static60.anInt1399 > arg1) {
			arg1 = Static60.anInt1399;
			local29 = false;
		} else if (arg1 > Static138.anInt6334) {
			arg1 = Static138.anInt6334;
			local29 = false;
		} else {
			local29 = true;
		}
		@Pc(51) boolean local51;
		if (arg3 < Static60.anInt1399) {
			arg3 = Static60.anInt1399;
			local51 = false;
		} else if (arg3 <= Static138.anInt6334) {
			local51 = true;
		} else {
			local51 = false;
			arg3 = Static138.anInt6334;
		}
		if (arg0 < Static41.anInt1131) {
			arg0 = Static41.anInt1131;
		} else {
			Static244.method5351(arg1, arg3, Static319.anIntArrayArray31[arg0++], arg2);
		}
		if (Static165.anInt3409 < arg4) {
			arg4 = Static165.anInt3409;
		} else {
			Static244.method5351(arg1, arg3, Static319.anIntArrayArray31[arg4--], arg2);
		}
		@Pc(107) int local107;
		if (local29 && local51) {
			for (local107 = arg0; local107 <= arg4; local107++) {
				@Pc(151) int[] local151 = Static319.anIntArrayArray31[local107];
				local151[arg1] = local151[arg3] = arg2;
			}
		} else if (local29) {
			for (local107 = arg0; local107 <= arg4; local107++) {
				Static319.anIntArrayArray31[local107][arg1] = arg2;
			}
		} else if (local51) {
			for (local107 = arg0; local107 <= arg4; local107++) {
				Static319.anIntArrayArray31[local107][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)Z")
	public static boolean method5310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static200.anIntArrayArrayArray10[arg0][arg1][arg2];
		if (local7 == -Static77.anInt1573) {
			return false;
		} else if (local7 == Static77.anInt1573) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static62.method5782(local22 + 1, Static263.aClass12Array2[arg0].method2704(arg1, arg2), local26 + 1) && Static62.method5782(local22 + 128 - 1, Static263.aClass12Array2[arg0].method2704(arg1 + 1, arg2), local26 + 1) && Static62.method5782(local22 + 128 - 1, Static263.aClass12Array2[arg0].method2704(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static62.method5782(local22 + 1, Static263.aClass12Array2[arg0].method2704(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static200.anIntArrayArrayArray10[arg0][arg1][arg2] = Static77.anInt1573;
				return true;
			} else {
				Static200.anIntArrayArrayArray10[arg0][arg1][arg2] = -Static77.anInt1573;
				return false;
			}
		}
	}
}
