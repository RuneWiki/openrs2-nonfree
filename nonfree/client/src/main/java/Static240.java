import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "Lclient!wm;")
	public static Class150 aClass150_2;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
	public static String method4225(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return arg0 && arg1 >= 0 ? Static612.method8449(arg0, arg1) : Integer.toString(arg1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIII)Z")
	public static boolean method4227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static519.aBoolean664 || !Static26.aBoolean26) {
			return false;
		} else if (Static14.anInt211 < 100) {
			return false;
		} else {
			@Pc(28) int local28 = Static52.anIntArrayArrayArray11[arg0][arg2][arg1];
			if (local28 == -Static395.anInt6854) {
				return false;
			} else if (local28 == Static395.anInt6854) {
				return true;
			} else if (Static555.aClass96Array3 == Static216.aClass96Array1) {
				return false;
			} else {
				@Pc(55) int local55 = arg2 << Static594.anInt9440;
				@Pc(59) int local59 = arg1 << Static594.anInt9440;
				if (Static44.method541(local55 + 1, Static555.aClass96Array3[arg0].method8080(arg2, arg1), Static555.aClass96Array3[arg0].method8080(arg2 + 1, arg1 + 1), local59 + 1, local55 + 1, Static555.aClass96Array3[arg0].method8080(arg2, arg1 + 1), local59 + Static234.anInt4537 - 1, local59 + Static234.anInt4537 + -1, Static234.anInt4537 + local55 - 1) && Static44.method541(local55 + 1, Static555.aClass96Array3[arg0].method8080(arg2, arg1), Static555.aClass96Array3[arg0].method8080(arg2 + 1, arg1), local59 + 1, local55 + -1 + Static234.anInt4537, Static555.aClass96Array3[arg0].method8080(arg2 + 1, arg1 - -1), local59 + 1, Static234.anInt4537 + -1 + local59, Static234.anInt4537 + local55 - 1)) {
					Static188.anInt3782++;
					Static52.anIntArrayArrayArray11[arg0][arg2][arg1] = Static395.anInt6854;
					return true;
				} else {
					Static52.anIntArrayArrayArray11[arg0][arg2][arg1] = -Static395.anInt6854;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
	public static void method4228() {
		Static688.aClass359_71.method8511();
	}
}
