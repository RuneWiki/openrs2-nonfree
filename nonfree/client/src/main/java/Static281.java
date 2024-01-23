import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	public static int anInt5831;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
	public static int[] anIntArray506;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "[J")
	public static long[] aLongArray23 = new long[100];

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
	public static int anInt5834 = 1;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method4664(@OriginalArg(0) Component arg0) {
		@Pc(5) Method local5 = Static282.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		arg0.addKeyListener(Static165.aClass128_1);
		arg0.addFocusListener(Static165.aClass128_1);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public static void method4665() {
		Static95.aClass2_Sub26_Sub1_1.method4287(6);
		Static95.aClass2_Sub26_Sub1_1.method4225(0L);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)V")
	public static void method4666() {
		Static299.aClass46_19.method1068(5);
		Static165.aClass46_28.method1068(5);
		Static98.aClass46_13.method1068(5);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!jd;I)Z")
	public static boolean method4667(@OriginalArg(0) Class84 arg0) {
		return arg0.method2138(Static102.anInt2236);
	}
}
