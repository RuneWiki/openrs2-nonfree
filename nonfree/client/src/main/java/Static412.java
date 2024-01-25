import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!um", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!um", name = "L", descriptor = "Lclient!jc;")
	public static final Class126 aClass126_16 = new Class126(7, 7);

	@OriginalMember(owner = "client!um", name = "M", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_102 = new Class177(48, 2);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III)Lclient!ut;")
	public static Class252 method5598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static67.aClass252ArrayArrayArray2[0][arg1][arg2] != null && Static67.aClass252ArrayArrayArray2[0][arg1][arg2].aClass252_1 != null;
			if (local28 && arg0 >= Static220.anInt4418 - 1) {
				return null;
			}
			Static399.method508(arg0, arg1, arg2);
		}
		return Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
	}
}
