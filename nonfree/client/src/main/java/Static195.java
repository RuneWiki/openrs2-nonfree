import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Lclient!pp;")
	public static Class259 method3405(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static46.aClass259Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public static void method3407() {
		Static289.aClass342_111.method7687();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Lclient!up;")
	public static Class333 method3408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static189.aClass333ArrayArrayArray1[0][arg1][arg2] != null && Static189.aClass333ArrayArrayArray1[0][arg1][arg2].aClass333_1 != null;
			if (local28 && arg0 >= Static590.anInt10277 - 1) {
				return null;
			}
			Static125.method2370(arg0, arg1, arg2);
		}
		return Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
	}
}
