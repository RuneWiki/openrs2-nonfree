import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Lclient!oa;")
	public static Class129 aClass129_2;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)Lclient!sd;")
	public static Class211 method3007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static268.aClass211ArrayArrayArray4[0][arg1][arg2] != null && Static268.aClass211ArrayArrayArray4[0][arg1][arg2].aClass211_1 != null;
			if (local28 && arg0 >= Static107.anInt1964 - 1) {
				return null;
			}
			Static294.method4793(arg0, arg1, arg2);
		}
		return Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2];
	}
}
