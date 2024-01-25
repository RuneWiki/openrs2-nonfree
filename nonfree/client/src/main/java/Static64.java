import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "Lclient!ha;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3;

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "Lclient!rs;")
	public static Interface17 anInterface17_1;

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "[I")
	public static final int[] anIntArray65 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	public static void method1174() {
		if (Static376.anInt7119 <= 0) {
			Static356.aString80 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static244.aStringArray82.length; local14++) {
			if (Static244.aStringArray82[local14].indexOf("--> ") != -1) {
				local12++;
				if (local12 == Static376.anInt7119) {
					Static356.aString80 = Static244.aStringArray82[local14].substring(Static244.aStringArray82[local14].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI)Z")
	public static boolean method1178(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
