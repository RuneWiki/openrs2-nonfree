import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
	public static int anInt4891;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I", line = 171)
	public static int method4499(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Lclient!f;", line = 425)
	public static Class67 method4501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static307.aClass67ArrayArrayArray3[0][arg1][arg2] != null && Static307.aClass67ArrayArrayArray3[0][arg1][arg2].aClass67_1 != null;
			if (local28 && arg0 >= Static86.anInt1912 - 1) {
				return null;
			}
			Static220.method4120(arg0, arg1, arg2);
		}
		return Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2];
	}
}
