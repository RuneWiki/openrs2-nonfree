import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "[Lclient!f;")
	public static Class8[] aClass8Array211;

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
	public static int anInt7635 = -50;

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "[I")
	public static final int[] anIntArray533 = new int[1000];

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
	public static void method5973() {
		if (Static98.anInt2238 <= 0) {
			Static392.aString57 = "";
			return;
		}
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static271.aStringArray36.length; local12++) {
			if (Static271.aStringArray36[local12].startsWith("--> ")) {
				local10++;
				if (Static98.anInt2238 == local10) {
					Static392.aString57 = Static271.aStringArray36[local12].substring(4);
					return;
				}
			}
		}
	}
}
