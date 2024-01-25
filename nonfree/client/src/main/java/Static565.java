import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static565 {

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!nd;")
	public static Class238 aClass238_258;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_164 = new Class145(54, -1);

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_165 = new Class145(50, 2);

	@OriginalMember(owner = "client!u", name = "g", descriptor = "I")
	public static int anInt9269 = -1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIII)V")
	public static void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static305.aClass2_Sub49_15.aClass33_Sub9_5.method3103() != 0 && arg0 != 0 && Static110.anInt2383 < 50 && arg2 != -1) {
			Static301.aClass301Array1[Static110.anInt2383++] = new Class301((byte) 1, arg2, arg0, arg3, arg1, 0, arg4, (Class16_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method7890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static144.method2588(arg1, 0, arg5, arg4, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)[I")
	public static int[] method7891() {
		return new int[] { Static358.anInt6196, Static574.anInt9375, Static84.anInt2169 };
	}
}
