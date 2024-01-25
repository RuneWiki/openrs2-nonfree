import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
	public static int anInt5310;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "[I")
	public static int[] anIntArray508;

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "[[S")
	public static short[][] aShortArrayArray11;

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "[I")
	public static final int[] anIntArray507 = new int[256];

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString205 = "Connection lost.";

	@OriginalMember(owner = "client!rf", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString206 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
	public static void method4657() {
		Static252.aClass37_84.method919();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(DZ)V")
	public static void method4658(@OriginalArg(0) double arg0) {
		if (Static317.aDouble9 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			anIntArray507[local15] = local27 > 255 ? 255 : local27;
		}
		Static317.aDouble9 = arg0;
	}
}
