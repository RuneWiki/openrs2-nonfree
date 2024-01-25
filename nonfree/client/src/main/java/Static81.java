import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
	public static int anInt1714;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "Lclient!ps;")
	public static final Class291 aClass291_1 = new Class291();

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Lclient!es;")
	public static final Class4_Sub11 aClass4_Sub11_2 = new Class4_Sub11(1350);

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
	public static int anInt1716 = 0;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "Z")
	public static boolean aBoolean116 = true;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BII)V")
	public static void method1714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static445.anInt6953 = arg1;
		Static461.anInt7413 = arg0;
		if (Static106.anInt2134 == 0) {
			Static118.anInt2257 = Static590.anInt9079 * 2 + Static461.anInt7413;
			Static235.anInt5516 = Static445.anInt6953 + Static617.anInt9691 * 2;
		} else if (Static106.anInt2134 == 1) {
			Static257.anInt4179 = Static284.anInt4535 + Static461.anInt7413 / Static567.anInt8756 + 2;
			Static217.anInt3516 = Static289.anInt4579 + Static445.anInt6953 / Static614.anInt9423 + 2;
			Static235.anInt5516 = Static614.anInt9423 * Static217.anInt3516;
			Static118.anInt2257 = Static567.anInt8756 * Static257.anInt4179;
			Static617.anInt9691 = Static235.anInt5516 - Static445.anInt6953 >> 1;
			Static590.anInt9079 = Static118.anInt2257 - Static461.anInt7413 >> 1;
			return;
		} else if (Static106.anInt2134 == 2) {
			Static118.anInt2257 = Static461.anInt7413;
			Static235.anInt5516 = Static445.anInt6953;
			return;
		}
	}
}
