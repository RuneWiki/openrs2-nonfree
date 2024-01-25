import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static386 {

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "Lclient!uda;")
	public static Class338 aClass338_1;

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "Z")
	public static boolean aBoolean562 = false;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
	public static int anInt6769 = 0;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "[I")
	public static final int[] anIntArray529 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILclient!wu;ZII)V")
	public static void method5960(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class384 arg2, @OriginalArg(5) int arg3) {
		if (arg1 <= 0) {
			Static228.method3581(arg0, arg3, arg2);
			return;
		}
		Static583.aClass5_Sub16_Sub1_6 = null;
		Static617.aBoolean818 = false;
		Static474.anInt7949 = arg0;
		Static210.anInt3640 = arg3;
		Static571.anInt9391 = 1;
		Static166.aClass384_43 = arg2;
		Static198.anInt3546 = 0;
		Static3.anInt29 = Static275.aClass5_Sub16_Sub1_5.method2572() / arg1;
		if (Static3.anInt29 < 1) {
			Static3.anInt29 = 1;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Lclient!rs;")
	public static Class166_Sub1 method5962() {
		Static535.anInt8894 = 0;
		return Static54.method859();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIB)Z")
	public static boolean method5963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static187.method3002(arg0, arg1) & ((arg1 & 0x2000) != 0 | Static601.method8391(arg1, arg0) | Static399.method6178(arg0, arg1));
	}
}
