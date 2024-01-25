import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	public static int anInt5226 = 1;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	public static void method4376() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static110.aBooleanArray22[local3] = false;
		}
		Static166.anInt3847 = -1;
		Static242.anInt4993 = 1;
		Static129.anInt9544 = 0;
		Static84.anInt2025 = 0;
		Static376.anInt9581 = -1;
	}
}
