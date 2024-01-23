import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "I")
	public static int anInt3058;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Z")
	public static boolean aBoolean221;

	@OriginalMember(owner = "client!en", name = "h", descriptor = "[Lclient!fb;")
	public static Class47[] aClass47Array5;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "Z")
	public static boolean aBoolean222 = false;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIIIIIFII)[[I")
	public static int[][] method2448(@OriginalArg(6) float arg0) {
		@Pc(5) Class1_Sub2_Sub33 local5 = new Class1_Sub2_Sub33();
		local5.aBoolean372 = false;
		local5.anInt5214 = (int) (arg0 * 4096.0F);
		local5.anInt5215 = 8;
		local5.anInt5213 = 4;
		local5.anInt5210 = 3;
		local5.method4578();
		@Pc(34) int[][] local34 = new int[256][64];
		Static68.method1140(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local5.method4040(local40, local34[local40]);
		}
		return local34;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg5) {
			Static193.method3144(arg3, arg5, arg2, arg1, arg4, arg0);
		} else if (arg3 - arg5 >= Static312.anInt5850 && Static214.anInt4216 >= arg5 + arg3 && arg2 - arg6 >= Static240.anInt1319 && arg2 + arg6 <= Static59.anInt1155) {
			Static193.method3146(arg4, arg6, arg0, arg2, arg1, arg3, arg5);
		} else {
			Static272.method4013(arg4, arg2, arg1, arg6, arg0, arg3, arg5);
		}
	}
}
