import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
	public static int anInt5374;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	public static int anInt5378;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
	public static int anInt5380;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "[I")
	public static int[] anIntArray551 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	public static void method4221() {
		if (Static194.anInt4389 != -1) {
			Static140.method2512(Static194.anInt4389);
		}
		for (@Pc(19) int local19 = 0; local19 < Static31.anInt803; local19++) {
			if (Static165.aBooleanArray16[local19]) {
				Static138.aBooleanArray13[local19] = true;
			}
			Static217.aBooleanArray20[local19] = Static165.aBooleanArray16[local19];
			Static165.aBooleanArray16[local19] = false;
		}
		if (Static296.aBoolean335) {
			Static177.aBoolean203 = true;
		}
		Static210.anInt4683 = -1;
		Static227.aClass116_14 = null;
		Static117.anInt2578 = -1;
		Static95.anInt2164 = Static32.anInt809;
		if (Static194.anInt4389 != -1) {
			Static31.anInt803 = 0;
			Static43.method947();
		}
		if (Static296.aBoolean335) {
			Static288.method4710();
		} else {
			Static203.method3609();
		}
		Static112.anInt2417 = 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 >= Static102.anInt2239 && Static88.anInt2052 >= arg2 && arg8 >= Static102.anInt2239 && Static88.anInt2052 >= arg8 && arg1 >= Static102.anInt2239 && arg1 <= Static88.anInt2052 && arg3 >= Static102.anInt2239 && Static88.anInt2052 >= arg3 && Static152.anInt3532 <= arg0 && Static223.anInt1245 >= arg0 && Static152.anInt3532 <= arg6 && Static223.anInt1245 >= arg6 && Static152.anInt3532 <= arg4 && arg4 <= Static223.anInt1245 && arg5 >= Static152.anInt3532 && Static223.anInt1245 >= arg5) {
			Static180.method3275(arg2, arg8, arg6, arg0, arg4, arg1, arg5, arg3, arg7);
		} else {
			Static181.method3283(arg2, arg8, arg3, arg5, arg6, arg7, arg4, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I")
	public static int method4223(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local9 * local32 >> 12;
	}
}
