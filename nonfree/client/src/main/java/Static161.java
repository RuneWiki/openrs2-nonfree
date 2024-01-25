import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static161 {

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "[I")
	public static final int[] anIntArray309 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	public static void method2702(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static2.aString1 = arg1;
		Static33.aString67 = arg0;
		if (Static156.anInt3163 != 3 && (Static2.aString1.equals("") || Static33.aString67.equals(""))) {
			Static150.method2585(3);
			return;
		}
		if (Static156.anInt3163 != 1) {
			Static111.anInt5894 = -1;
			Static424.anInt7138 = 0;
		}
		Static317.aBoolean361 = false;
		Static150.method2585(-3);
		Static360.anInt6115 = 0;
		Static168.anInt3346 = 0;
		Static197.anInt3945 = 1;
	}
}
