import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
	public static int anInt2450;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "[[Lclient!mq;")
	public static Class156[][] aClass156ArrayArray1;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "Z")
	public static boolean aBoolean220 = false;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "[I")
	public static final int[] anIntArray142 = new int[13];

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
	public static void method1883(@OriginalArg(1) int arg0) {
		Static206.method3199();
		Static361.method4770();
		Static194.method3106(true, arg0);
		Static323.method844(Static56.aClass32_26, Static405.aClass32_82, Static121.aClass172_3);
		Static104.method1820(Static121.aClass172_3, Static405.aClass32_82);
		Static252.method3756(Static260.aClass8Array170);
		Static345.method5809();
		Static36.method725();
		if (Static120.anInt2584 == 10) {
			Static435.method5708(false);
		} else if (Static120.anInt2584 == 30) {
			Static230.method3465(25);
		} else if (Static120.anInt2584 == 5) {
			Static170.method2752(Static121.aClass172_3, Static405.aClass32_82);
			return;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method1884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 >= Static452.anInt7626 && arg8 <= Static82.anInt3956 && Static452.anInt7626 <= arg5 && Static82.anInt3956 >= arg5 && arg2 >= Static452.anInt7626 && arg2 <= Static82.anInt3956 && arg6 >= Static452.anInt7626 && Static82.anInt3956 >= arg6 && arg4 >= Static341.anInt5789 && arg4 <= Static309.anInt5495 && Static341.anInt5789 <= arg0 && arg0 <= Static309.anInt5495 && arg7 >= Static341.anInt5789 && Static309.anInt5495 >= arg7 && arg1 >= Static341.anInt5789 && Static309.anInt5495 >= arg1) {
			Static30.method643(arg2, arg7, arg0, arg3, arg1, arg4, arg8, arg6, arg5);
		} else {
			Static261.method659(arg7, arg0, arg8, arg4, arg3, arg5, arg6, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!cu;)Lclient!bo;")
	public static Class27 method1886(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(7) Class27 local7 = new Class27();
		local7.anInt1018 = arg0.method2588();
		local7.aClass3_Sub4_Sub15_1 = Static104.aClass262_1.method5748(local7.anInt1018);
		return local7;
	}
}
