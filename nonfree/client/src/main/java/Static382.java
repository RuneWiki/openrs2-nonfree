import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!we", name = "y", descriptor = "I")
	public static int anInt6411;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "I")
	public static int anInt6412;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Lclient!ct;")
	public static Class48 method5674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static69.aClass48ArrayArrayArray1[0][arg1][arg2] != null && Static69.aClass48ArrayArrayArray1[0][arg1][arg2].aClass48_1 != null;
			if (local28 && arg0 >= Static164.anInt2901 - 1) {
				return null;
			}
			Static172.method3206(arg0, arg1, arg2);
		}
		return Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
	}
}
