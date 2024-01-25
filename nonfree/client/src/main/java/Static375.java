import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static375 {

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "[Lclient!ha;")
	public static Class2[] aClass2Array11;

	@OriginalMember(owner = "client!pt", name = "y", descriptor = "I")
	public static int anInt6873;

	@OriginalMember(owner = "client!pt", name = "w", descriptor = "Z")
	public static boolean aBoolean499 = true;

	@OriginalMember(owner = "client!pt", name = "x", descriptor = "I")
	public static int anInt6872 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)V")
	public static void method5758(@OriginalArg(0) int arg0) {
		if (Static438.anInt7729 == 1) {
			Static398.anInt7152 = arg0;
		} else if (Static438.anInt7729 == 2 || Static438.anInt7729 == 3) {
			Static430.anInt6478 = arg0;
		}
	}
}
