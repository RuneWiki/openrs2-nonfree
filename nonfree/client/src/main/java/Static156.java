import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
	public static int anInt3310 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method2665() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static104.aBooleanArray19[local7] = false;
		}
		Static69.anInt1366 = 0;
		Static59.anInt1177 = -1;
		Static101.anInt1895 = 5;
		Static218.anInt4282 = -1;
		Static281.anInt5364 = 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!ph;I)Lclient!ln;")
	public static Class1_Sub1_Sub3_Sub2 method2667(@OriginalArg(1) Class138 arg0, @OriginalArg(2) int arg1) {
		return Static109.method1792(arg1, arg0) ? Static56.method974() : null;
	}
}
