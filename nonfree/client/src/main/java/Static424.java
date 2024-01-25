import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static424 {

	@OriginalMember(owner = "client!pca", name = "k", descriptor = "Z")
	public static boolean aBoolean576 = false;

	@OriginalMember(owner = "client!pca", name = "o", descriptor = "Z")
	public static boolean aBoolean577 = false;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)V")
	public static void method6416(@OriginalArg(0) int arg0) {
		Static92.anInt1857 = -1;
		if (arg0 == 37) {
			Static292.aFloat212 = 3.0F;
		} else if (arg0 == 50) {
			Static292.aFloat212 = 4.0F;
		} else if (arg0 == 75) {
			Static292.aFloat212 = 6.0F;
		} else if (arg0 == 100) {
			Static292.aFloat212 = 8.0F;
		} else if (arg0 == 200) {
			Static292.aFloat212 = 16.0F;
		}
		Static92.anInt1857 = -1;
	}
}
