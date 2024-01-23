import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static236 {

	@OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
	public static int anInt3712 = -2;

	@OriginalMember(owner = "client!rn", name = "y", descriptor = "[J")
	public static long[] aLongArray11 = new long[32];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	public static void method2947() {
		aLongArray11 = null;
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)I")
	public static int method2948() {
		return Static222.aClass33_33.method842();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIII)V")
	public static void method2949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static211.anInt4200 = 0;
		Static154.anInt3126 = arg1;
		Static171.anInt3392 = 0;
		Static141.anInt2889 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBLclient!lc;I)Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1 method2951(@OriginalArg(0) int arg0, @OriginalArg(2) Class98 arg1) {
		return Static292.method4344(arg0, 0, arg1) ? Static94.method1510() : null;
	}
}
