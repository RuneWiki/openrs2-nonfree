import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "Z")
	public static boolean aBoolean439 = true;

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString82 = null;

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean440 = true;

	@OriginalMember(owner = "client!naa", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V")
	public static void method5753() {
		if (Static162.aClass100_7.method8799()) {
			Static162.aClass100_7.method8834(Static271.aCanvas6);
			Static46.method849();
			if (Static389.aBoolean497) {
				Static627.method8756(Static271.aCanvas6);
			} else {
				@Pc(28) Dimension local28 = Static271.aCanvas6.getSize();
				Static162.aClass100_7.method8797(Static271.aCanvas6, local28.width, local28.height);
			}
			Static162.aClass100_7.method8788(Static271.aCanvas6);
		} else {
			Static278.method4875(Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681(), false);
		}
		Static643.method8977();
		Static133.aBoolean183 = true;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(III)Z")
	public static boolean method5754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
