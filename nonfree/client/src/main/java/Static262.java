import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static262 {

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	public static int anInt4838;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public static int anInt4840;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	public static int anInt4841;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString183 = "purple:";

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)V")
	public static void method4043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static19.method322(arg1)) {
			Static26.method495(Static176.aClass157ArrayArray1[arg1], arg0);
		}
	}
}
