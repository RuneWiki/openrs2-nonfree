import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static215 {

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "[I")
	public static final int[] anIntArray237 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)V")
	public static void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static183.anInt3166 = arg1;
		Static376.anInt5906 = arg4;
		Static500.anInt8135 = arg3;
		Static93.anInt1715 = arg0;
		Static129.anInt9000 = arg5;
		Static430.anInt8345 = arg2;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZZ)V")
	public static void method2967(@OriginalArg(0) boolean arg0) {
		if (Static77.aClass252_2 == null) {
			Static250.method3435();
		}
		if (arg0) {
			Static77.aClass252_2.method5480();
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public static void method2974() {
		Static432.aClass118_40.method2599();
		Static523.aClass118_45.method2599();
	}
}
