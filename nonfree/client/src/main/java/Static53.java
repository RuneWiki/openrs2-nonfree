import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "[I")
	public static int[] anIntArray40 = new int[1];

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "[I")
	public static final int[] anIntArray41 = new int[32];

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)I")
	public static int method1327() {
		return Static196.anInt4255;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class251 local13 = Static137.method2669(arg1, arg0);
		if (local13 == null) {
			return;
		}
		if (local13.anObjectArray30 != null) {
			@Pc(23) Class3_Sub36 local23 = new Class3_Sub36();
			local23.aString164 = arg2;
			local23.aClass251_8 = local13;
			local23.anObjectArray1 = local13.anObjectArray30;
			local23.anInt6432 = arg3;
			Static583.method7919(local23);
		}
		if (Static409.anInt1461 != 10 || !Static70.method1716(local13).method3244(arg3 - 1)) {
			return;
		}
		@Pc(67) Class3_Sub10 local67;
		if (arg3 == 1) {
			local67 = Static129.method2403(Static452.aClass353_2, Static115.aClass287_42);
			Static265.method4052(local13.anInt7254, local67, arg1, arg0);
			Static193.method3398(local67);
		}
		if (arg3 == 2) {
			local67 = Static129.method2403(Static452.aClass353_2, Static235.aClass287_71);
			Static265.method4052(local13.anInt7254, local67, arg1, arg0);
			Static193.method3398(local67);
		}
		if (arg3 == 3) {
			local67 = Static129.method2403(Static452.aClass353_2, Static578.aClass287_147);
			Static265.method4052(local13.anInt7254, local67, arg1, arg0);
			Static193.method3398(local67);
		}
		if (arg3 == 4) {
			local67 = Static129.method2403(Static452.aClass353_2, Static410.aClass287_121);
			Static265.method4052(local13.anInt7254, local67, arg1, arg0);
			Static193.method3398(local67);
		}
		if (arg3 == 5) {
			local67 = Static129.method2403(Static452.aClass353_2, Static355.aClass287_104);
			Static265.method4052(local13.anInt7254, local67, arg1, arg0);
			Static193.method3398(local67);
		}
		if (arg3 == 6) {
			local67 = Static129.method2403(Static452.aClass353_2, Static558.aClass287_144);
			Static265.method4052(local13.anInt7254, local67, arg1, arg0);
			Static193.method3398(local67);
		}
		if (arg3 == 7) {
			local67 = Static129.method2403(Static452.aClass353_2, Static24.aClass287_4);
			Static265.method4052(local13.anInt7254, local67, arg1, arg0);
			Static193.method3398(local67);
		}
		if (arg3 == 8) {
			local67 = Static129.method2403(Static452.aClass353_2, Static361.aClass287_107);
			Static265.method4052(local13.anInt7254, local67, arg1, arg0);
			Static193.method3398(local67);
		}
		if (arg3 == 9) {
			local67 = Static129.method2403(Static452.aClass353_2, Static184.aClass287_150);
			Static265.method4052(local13.anInt7254, local67, arg1, arg0);
			Static193.method3398(local67);
		}
		if (arg3 == 10) {
			local67 = Static129.method2403(Static452.aClass353_2, Static298.aClass287_91);
			Static265.method4052(local13.anInt7254, local67, arg1, arg0);
			Static193.method3398(local67);
		}
	}
}
