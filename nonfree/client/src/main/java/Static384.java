import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static384 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "F")
	public static float aFloat110;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "[I")
	public static int[] anIntArray636;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString62 = "";

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZI)V")
	public static void method5155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static370.anInt6392 = arg0 - Static143.anInt2863;
		Static126.anInt2600 = arg1 - Static143.anInt2867;
	}
}
