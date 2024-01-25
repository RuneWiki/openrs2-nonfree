import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_45 = new Class303(8, 8);

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
	public static void method3668() {
		for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
			Static319.aBooleanArray17[local14] = true;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([I[Ljava/lang/Object;B)V")
	public static void method3669(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static309.method4509(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIII)Z")
	public static boolean method3671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static279.aBoolean733) {
			return false;
		} else if (Static328.anInt5532 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static555.anIntArrayArrayArray20[arg1][arg0][arg2];
			if (-Static414.anInt7057 == local22) {
				return false;
			} else if (Static414.anInt7057 == local22) {
				return true;
			} else if (Static426.aClass34Array5 == Static68.aClass34Array1) {
				return false;
			} else {
				@Pc(46) int local46 = arg0 << Static315.anInt5369;
				@Pc(58) int local58 = arg2 << Static315.anInt5369;
				if (Static591.method7907(local46 + 1, local46 + 1, Static68.aClass34Array1[arg1].method6525(arg2, arg0), local46 + Static467.anInt7776 - 1, Static467.anInt7776 + local58 - 1, Static467.anInt7776 + local58 - 1, local58 + 1, Static68.aClass34Array1[arg1].method6525(arg2 + 1, arg0), Static68.aClass34Array1[arg1].method6525(arg2 + 1, arg0 + 1)) && Static591.method7907(local46 + Static467.anInt7776 - 1, local46 + 1, Static68.aClass34Array1[arg1].method6525(arg2, arg0), local46 + Static467.anInt7776 - 1, local58 + 1, local58 + Static467.anInt7776 - 1, local58 + 1, Static68.aClass34Array1[arg1].method6525(arg2 + 1, arg0 + 1), Static68.aClass34Array1[arg1].method6525(arg2, arg0 + 1))) {
					Static244.anInt4331++;
					Static555.anIntArrayArrayArray20[arg1][arg0][arg2] = Static414.anInt7057;
					return true;
				} else {
					Static555.anIntArrayArrayArray20[arg1][arg0][arg2] = -Static414.anInt7057;
					return false;
				}
			}
		}
	}
}
