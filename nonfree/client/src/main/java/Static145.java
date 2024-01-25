import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static145 {

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "Lclient!rk;")
	public static Class180 aClass180_38;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "Z")
	public static boolean aBoolean239 = false;

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "Z")
	public static volatile boolean aBoolean240 = true;

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "[I")
	public static final int[] anIntArray414 = new int[25];

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)I")
	public static int method2909(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLclient!bi;)Z")
	public static boolean method2911(@OriginalArg(1) Class26 arg0) {
		if (arg0.anInt557 == 205) {
			Static108.anInt1315 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public static void method2915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			Static29.aClass7_Sub3_Sub2_1.method2799(47);
		}
		if (arg0 == 1) {
			Static29.aClass7_Sub3_Sub2_1.method2799(182);
		}
		Static29.aClass7_Sub3_Sub2_1.method2783(Static17.aBooleanArray24[82] ? 1 : 0);
		Static29.aClass7_Sub3_Sub2_1.method2788(arg1 + Static350.anInt6609);
		Static29.aClass7_Sub3_Sub2_1.method2745(Static237.anInt4696 + arg2);
		Static35.anInt1025 = arg1;
		Static259.anInt5013 = arg2;
		Static35.aBoolean78 = false;
		Static118.method5348();
	}
}
