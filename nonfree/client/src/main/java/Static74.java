import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static74 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!bw;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static348.method4902(arg0, arg1) | Static435.method5599(arg0, arg1) | Static10.method287(arg1, arg0)) & Static229.method3192(arg0, arg1);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1343(@OriginalArg(0) String arg0) {
		if (Static2.aClass219Array10 != null) {
			Static209.method2982(Static293.aClass36_95);
			Static116.aClass4_Sub30_Sub1_1.method4871(Static226.method592(arg0));
			Static116.aClass4_Sub30_Sub1_1.method4849(arg0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V")
	public static void method1344(@OriginalArg(0) int arg0) {
		Static97.anInt2094 = -1;
		Static4.anInt162 = arg0;
		Static97.anInt2094 = -1;
		Static28.method540();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z")
	public static boolean method1345(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
