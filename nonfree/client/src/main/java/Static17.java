import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static17 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
	public static void method238() {
		Static328.aClass121_9.method4616(Static250.aFloat75, Static444.aFloat125, Static241.aFloat74);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIII)Z")
	public static boolean method239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static228.aByteArrayArrayArray8[0][arg0][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static228.aByteArrayArrayArray8[arg3][arg0][arg2] & 0x10) == 0) {
			return arg1 == Static111.method1745(arg3, arg0, arg2);
		} else {
			return false;
		}
	}
}
