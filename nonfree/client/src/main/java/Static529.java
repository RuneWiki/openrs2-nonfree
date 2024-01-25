import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static529 {

	@OriginalMember(owner = "client!rk", name = "A", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_103 = new Class241(54, 6);

	@OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
	public static int anInt8695 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZBZ)V")
	public static void method7605(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static279.anInt5095++;
			Static371.method5598(false);
		}
		if (arg0) {
			Static16.anInt229++;
			Static205.method3787();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)Z")
	public static boolean method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static465.method7031(arg0, arg1) | (arg1 & 0x70000) != 0 || Static114.method2148(arg0, arg1);
	}
}
