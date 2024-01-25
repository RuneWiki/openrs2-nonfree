import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static428 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)V")
	public static void method6266(@OriginalArg(1) int arg0) {
		if (Static302.anInt5579 == 0) {
			Static106.aClass1_Sub16_Sub3_1.method5254(arg0);
		} else {
			Static101.anInt7625 = arg0;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!kg;IIII)V")
	public static void method6270(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static338.method5137(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static93.anInt1898) {
			Static338.method5137(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static338.method5137(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static382.anInt6965) {
			Static338.method5137(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static382.anInt6965) {
			Static338.method5137(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static93.anInt1898 && arg4 <= Static382.anInt6965) {
			Static338.method5137(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static338.method5137(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static93.anInt1898 && arg4 > 0) {
			Static338.method5137(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
