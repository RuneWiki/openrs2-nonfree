import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static151 {

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "Lclient!eb;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
	public static void method2521() {
		Static198.aClass163_24.method3767();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Z")
	public static boolean method2523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIBLclient!bf;)V")
	public static void method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class22 arg2) {
		Static227.aClass22ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!eo;IIII)V")
	public static void method2525(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static132.method2251(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static42.anInt4340) {
			Static132.method2251(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static132.method2251(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static386.anInt6463) {
			Static132.method2251(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static386.anInt6463) {
			Static132.method2251(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static42.anInt4340 && arg4 <= Static386.anInt6463) {
			Static132.method2251(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static132.method2251(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static42.anInt4340 && arg4 > 0) {
			Static132.method2251(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
