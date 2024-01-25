import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static379 {

	@OriginalMember(owner = "client!so", name = "e", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_205 = new Class214(69, 3);

	@OriginalMember(owner = "client!so", name = "f", descriptor = "Z")
	public static boolean aBoolean483 = false;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIBIIIII)V")
	public static void method5369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg4) {
			Static227.method3864(arg5, arg4, arg0, arg1, arg3, arg6);
		} else if (arg5 - arg4 >= Static176.anInt3462 && arg5 + arg4 <= Static418.anInt3023 && arg0 - arg2 >= Static162.anInt1715 && arg2 + arg0 <= Static55.anInt1319) {
			Static275.method4381(arg3, arg2, arg6, arg1, arg0, arg5, arg4);
		} else {
			Static460.method6237(arg0, arg6, arg1, arg2, arg5, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	public static void method5370() {
		if (Static39.aBoolean62) {
			return;
		}
		Static39.aBoolean62 = true;
		Static110.aBoolean165 = true;
		if (Static157.aClass185_Sub1_1.aBoolean393) {
			Static322.aFloat82 = (int) Static322.aFloat82 + 191 & 0xFFFFFF80;
		} else {
			Static249.aFloat69 += (24.0F - Static249.aFloat69) / 2.0F;
		}
	}
}
