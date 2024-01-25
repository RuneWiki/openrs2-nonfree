import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static335 {

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
	public static int anInt6373;

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "[Lclient!lf;")
	public static Class90[] aClass90Array16;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "Z")
	public static boolean aBoolean560 = false;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
	public static int anInt6374 = 0;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
	public static int anInt6377 = 2;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "Lclient!rg;")
	public static Class177 aClass177_24 = null;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
	public static int anInt6381 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public static void method5574(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static339.method5609();
		} else if (arg0 == 2) {
			Static344.method5514();
		} else if (arg0 == 3) {
			Static21.method547();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5579(@OriginalArg(1) String arg0) {
		return Static135.method2610(arg0);
	}
}
