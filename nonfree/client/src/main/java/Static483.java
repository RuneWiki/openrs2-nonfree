import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!rba", name = "A", descriptor = "I")
	public static int anInt8552;

	@OriginalMember(owner = "client!rba", name = "C", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)I")
	public static int method7127(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)I")
	public static int method7129() {
		return Static114.anInt2971;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(II)Lclient!ch;")
	public static Class6_Sub5_Sub5 method7130(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub5_Sub5 local10 = (Class6_Sub5_Sub5) Static76.aClass117_1.method3389((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static105.aClass223_38.method5954(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static47.method1559(local20);
		} catch (@Pc(39) Exception local39) {
			throw new RuntimeException(local39.getMessage() + " S: " + arg0);
		}
		Static76.aClass117_1.method3390(local10, (long) arg0);
		return local10;
	}
}
