import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static248 {

	@OriginalMember(owner = "client!iea", name = "w", descriptor = "I")
	public static int anInt4279;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IBI)V")
	public static void method3643(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (!Static354.method5310()) {
			return;
		}
		Static295.anInt5127 = arg0;
		if (arg2 != Static471.anInt7980) {
			Static537.aString57 = "";
		}
		Static471.anInt7980 = arg2;
		if (arg1 == 95) {
			Static21.method316(6);
		}
	}
}
