import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static377 {

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Lclient!up;")
	public static final Class250 aClass250_14 = new Class250(12, 4);

	@OriginalMember(owner = "client!t", name = "l", descriptor = "I")
	public static final int anInt3940 = 2;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I")
	public static int method3112(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method3114() {
		Static254.anInt4209 = -1;
		Static387.anInt6335 = 0;
		Static363.anInt5531 = -1;
		Static25.anInt375 = -1;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(II)Z")
	public static boolean method3116(@OriginalArg(0) int arg0) {
		return arg0 == 47 || arg0 == 58 || arg0 == 1012 || arg0 == 12 || arg0 == 4;
	}
}
