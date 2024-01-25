import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
	public static boolean aBoolean22 = true;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	public static void method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static67.aClass252ArrayArrayArray2[0][arg1][arg2] != null && Static67.aClass252ArrayArrayArray2[0][arg1][arg2].aClass252_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static67.aClass252ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class252 local46 = Static67.aClass252ArrayArrayArray2[local22][arg1][arg2] = new Class252(local22, arg1, arg2);
				if (local20) {
					local46.aByte100++;
				}
			}
		}
	}
}
