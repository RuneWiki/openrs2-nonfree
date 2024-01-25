import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!of", name = "F", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_148 = new Class40(67, 28);

	@OriginalMember(owner = "client!of", name = "J", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_149 = new Class40(35, 14);

	@OriginalMember(owner = "client!of", name = "K", descriptor = "Z")
	public static boolean aBoolean429 = true;

	@OriginalMember(owner = "client!of", name = "L", descriptor = "I")
	public static int anInt6263 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IBI)V")
	public static void method5316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class171 local14 = Static82.aClass171ArrayArray1[arg1][arg0];
		if (local14 != null) {
			Static377.anInt6494 = local14.anInt4241;
			Static74.anInt1218 = local14.anInt4229;
			Static13.anInt235 = local14.anInt4235;
		}
		Static142.method2147();
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
	public static void method5319() {
		@Pc(15) int local15 = Static480.aClass6_Sub37_Sub1_1.method5159(Static567.anInt9503);
		if (local15 == 0) {
			Static393.aByteArrayArrayArray16 = null;
			Static526.method7357(0);
		} else if (local15 == 1) {
			Static151.method2222((byte) 0);
			Static526.method7357(512);
			if (Static303.aByteArrayArrayArray13 != null) {
				Static146.method2180();
			}
		} else {
			Static151.method2222((byte) (Static43.anInt710 - 4 & 0xFF));
			Static526.method7357(2);
		}
		Static146.anInt2584 = Static282.anInt4677;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method5322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 >= Static235.anInt3970 && Static151.anInt2683 >= arg0 && arg4 >= Static235.anInt3970 && Static151.anInt2683 >= arg4 && arg5 >= Static235.anInt3970 && Static151.anInt2683 >= arg5 && Static235.anInt3970 <= arg6 && Static151.anInt2683 >= arg6 && Static134.anInt2364 <= arg1 && arg1 <= Static60.anInt971 && arg7 >= Static134.anInt2364 && arg7 <= Static60.anInt971 && Static134.anInt2364 <= arg2 && Static60.anInt971 >= arg2 && arg8 >= Static134.anInt2364 && arg8 <= Static60.anInt971) {
			Static395.method5825(arg8, arg6, arg4, arg0, arg2, arg1, arg5, arg7, arg3);
		} else {
			Static492.method6799(arg6, arg4, arg2, arg0, arg8, arg1, arg5, arg7, arg3);
		}
	}
}
