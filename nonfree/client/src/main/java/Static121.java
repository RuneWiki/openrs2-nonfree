import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	public static int anInt2155;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Lclient!vt;")
	public static Class258 method1714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static319.aClass258ArrayArrayArray3[0][arg1][arg2] != null && Static319.aClass258ArrayArrayArray3[0][arg1][arg2].aClass258_1 != null;
			if (local28 && arg0 >= Static96.anInt1667 - 1) {
				return null;
			}
			Static40.method656(arg0, arg1, arg2);
		}
		return Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBI)Lclient!uh;")
	public static Class240 method1715(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class240 local7 = new Class240();
		local7.anInt6844 = -1;
		local7.anInt6848 = -1;
		local7.anInt6854 = arg0 + 6;
		local7.anInt6841 = arg1 + 6;
		local7.anIntArrayArray60 = new int[local7.anInt6854][local7.anInt6841];
		local7.method5416();
		return local7;
	}
}
