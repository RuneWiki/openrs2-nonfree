import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	public static int anInt4059;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "Lclient!od;")
	public static Class4_Sub2_Sub15 aClass4_Sub2_Sub15_6;

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!pm", name = "Q", descriptor = "Lclient!lc;")
	public static Class98 aClass98_126;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
	public static int anInt4065 = 0;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "Lclient!cc;")
	public static Class22 aClass22_17 = null;

	@OriginalMember(owner = "client!pm", name = "R", descriptor = "Lclient!nc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)V")
	public static void method3301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static239.anInt4616 == 2) {
			Static299.anInt5560 = arg1;
			Static279.anInt5259 = arg0;
		}
		Static96.aFloat16 = arg1;
		Static270.aFloat49 = arg0;
		Static104.method1700();
		Static114.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!fc;III)V")
	public static void method3302(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class4_Sub23 local10 = (Class4_Sub23) Static47.aClass10_8.method190(); local10 != null; local10 = (Class4_Sub23) Static47.aClass10_8.method191()) {
			if (local10.anInt3420 == arg3 && local10.anInt3418 == arg0 * 128 && arg2 * 128 == local10.anInt3417 && arg1.anInt1366 == local10.aClass47_1.anInt1366) {
				if (local10.aClass4_Sub9_Sub1_3 != null) {
					Static219.aClass4_Sub9_Sub4_2.method1470(local10.aClass4_Sub9_Sub1_3);
					local10.aClass4_Sub9_Sub1_3 = null;
				}
				if (local10.aClass4_Sub9_Sub1_2 != null) {
					Static219.aClass4_Sub9_Sub4_2.method1470(local10.aClass4_Sub9_Sub1_2);
					local10.aClass4_Sub9_Sub1_2 = null;
				}
				local10.method4391();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V")
	public static void method3307() {
		aClass4_Sub2_Sub15_6 = null;
		aClass22_17 = null;
		aByteArrayArray17 = null;
		aClass98_126 = null;
	}
}
