import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Lclient!la;")
	public static Class96 aClass96_7;

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!ek", name = "G", descriptor = "Lclient!in;")
	public static Class160 aClass160_8 = null;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIII)Z")
	public static boolean method2175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static204.aBoolean276) {
			return false;
		} else if (Static397.anInt7106 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static262.anIntArrayArrayArray14[arg1][arg2][arg0];
			if (-Static239.anInt4403 == local22) {
				return false;
			} else if (Static239.anInt4403 == local22) {
				return true;
			} else if (Static310.aClass129Array5 == Static150.aClass129Array4) {
				return false;
			} else {
				@Pc(50) int local50 = arg2 << Static166.anInt7796;
				@Pc(54) int local54 = arg0 << Static166.anInt7796;
				if (Static561.method7582(Static165.anInt3157 + local50 - 1, local54 - -Static165.anInt3157 + -1, Static310.aClass129Array5[arg1].method6481(arg0 + 1, arg2), local54 + Static165.anInt3157 - 1, local50 + 1, Static310.aClass129Array5[arg1].method6481(arg0, arg2), local54 + 1, Static310.aClass129Array5[arg1].method6481(arg0 + 1, arg2 - -1), local50 + 1) && Static561.method7582(Static165.anInt3157 + local50 - 1, local54 - -1, Static310.aClass129Array5[arg1].method6481(arg0 + 1, arg2 - -1), local54 + Static165.anInt3157 - 1, local50 + 1, Static310.aClass129Array5[arg1].method6481(arg0, arg2), local54 + 1, Static310.aClass129Array5[arg1].method6481(arg0, arg2 + 1), local50 + Static165.anInt3157 - 1)) {
					Static324.anInt5951++;
					Static262.anIntArrayArrayArray14[arg1][arg2][arg0] = Static239.anInt4403;
					return true;
				} else {
					Static262.anIntArrayArrayArray14[arg1][arg2][arg0] = -Static239.anInt4403;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBILclient!hd;)V")
	public static void method2181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class130 arg2) {
		Static366.aClass130ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IC)I")
	public static int method2184(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class127.anIntArray157.length > arg0 ? Class127.anIntArray157[arg0] : -1;
	}
}
