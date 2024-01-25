import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
	public static int anInt2696;

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_68 = new Class129(97, 3);

	@OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
	public static int anInt2694 = 0;

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "J")
	public static long aLong88 = -1L;

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "Z")
	public static boolean aBoolean175 = false;

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "[B")
	public static final byte[] aByteArray35 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
	public static int anInt2695 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!fh;B)Lclient!fs;")
	public static Class61_Sub2 method2166(@OriginalArg(0) Class5_Sub15 arg0) {
		return new Class61_Sub2(arg0.method5586(), arg0.method5586(), arg0.method5586(), arg0.method5586(), arg0.method5541(), arg0.method5541(), arg0.method5539());
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V")
	public static void method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static3.anInt45 <= arg2 && arg1 <= Static112.anInt1900 && Static356.anInt5817 <= arg4 && arg0 <= Static3.anInt46) {
			Static453.method4906(arg2, arg0, arg4, arg3, arg1);
		} else {
			Static338.method4372(arg1, arg0, arg2, arg3, arg4);
		}
	}
}
