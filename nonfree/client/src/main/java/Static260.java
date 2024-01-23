import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static260 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!hc;")
	public static Class51 aClass51_34;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
	public static int anInt2793;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	public static int anInt2794;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19 = new String[5];

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "[I")
	public static int[] anIntArray205 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIB)I")
	public static int method2132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + (arg0 >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BII)V")
	public static void method2136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static171.aClass1_Sub13_Sub1_3.method1825(49);
		Static171.aClass1_Sub13_Sub1_3.method1796(arg0);
		Static171.aClass1_Sub13_Sub1_3.method1808(arg1);
	}
}
