import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static174 {

	@OriginalMember(owner = "client!in", name = "N", descriptor = "Lclient!pc;")
	public static Class188 aClass188_49;

	@OriginalMember(owner = "client!in", name = "W", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!in", name = "O", descriptor = "Lclient!ub;")
	public static final Class240 aClass240_16 = new Class240(16);

	@OriginalMember(owner = "client!in", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString23 = null;

	@OriginalMember(owner = "client!in", name = "T", descriptor = "[I")
	public static final int[] anIntArray222 = new int[50];

	@OriginalMember(owner = "client!in", name = "X", descriptor = "I")
	public static int anInt3372 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZIIIIZ)V")
	public static void method2735(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static361.anInt6359 = arg0;
		Static451.anInt1568 = arg3;
		Static292.anInt5317 = arg2;
		Static117.anInt2350 = arg5;
		Static135.anInt2653 = arg4;
		if (arg1 && Static117.anInt2350 >= 100) {
			Static293.anInt5621 = Static361.anInt6359 * 128 + 64;
			Static225.anInt4310 = Static451.anInt1568 * 128 + 64;
			Static110.anInt2281 = Static66.method1200(Static301.anInt5383, Static225.anInt4310, Static293.anInt5621) - Static135.anInt2653;
		}
		Static65.anInt7824 = 2;
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(B)V")
	public static void method2736() {
		Static176.anInt3417 = -1;
		Static425.anInt5530 = -1;
		Static416.anInt7259 = 0;
	}
}
