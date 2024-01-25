import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static442 {

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!gu;")
	public static Class98 aClass98_1;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public static int anInt7338;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_159 = new Class253(6, 8);

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "[C")
	public static final char[] aCharArray11 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZIIII)V")
	public static void method5639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static63.anInt1215 = arg1;
		Static47.anInt746 = arg4;
		Static404.anInt7485 = arg3;
		Static150.anInt2821 = arg5;
		Static62.anInt1155 = arg0;
		if (arg2 && Static62.anInt1155 >= 100) {
			Static46.anInt737 = Static404.anInt7485 * 128 + 64;
			Static181.anInt3254 = Static63.anInt1215 * 128 + 64;
			Static212.anInt3801 = Static333.method2748(Static268.anInt4539, Static181.anInt3254, Static46.anInt737) - Static150.anInt2821;
		}
		Static9.anInt60 = 2;
	}
}
