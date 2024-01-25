import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static595 {

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "[I")
	public static int[] anIntArray540;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_96 = new Class305(33, -1);

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "[I")
	public static int[] anIntArray539 = new int[2];

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_223 = new Class359(97, 3);

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_224 = new Class359(18, -1);

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
	public static int anInt9783 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIII)V")
	public static void method8160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static172.aClass5_Sub50_14.aClass12_Sub7_4.method2118() != 0 && arg1 != 0 && Static204.anInt3872 < 50 && arg3 != -1) {
			Static569.aClass351Array1[Static204.anInt3872++] = new Class351((byte) 1, arg3, arg1, arg4, arg0, 0, arg2, (Class28_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)Z")
	public static boolean method8162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static537.method3393(arg0, arg1) | (arg1 & 0x70000) != 0 || Static112.method2102(arg1, arg0);
	}
}
