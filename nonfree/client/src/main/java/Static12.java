import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_997 = Static41.method597("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_998 = null;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Lclient!od;")
	private static Class60 aClass60_999 = Static41.method597("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	public static int anInt2546 = 0;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "I")
	public static int anInt2553 = 0;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!c", name = "P", descriptor = "I")
	public static int anInt2556 = 0;

	@OriginalMember(owner = "client!c", name = "R", descriptor = "I")
	public static int anInt2558 = 0;

	@OriginalMember(owner = "client!c", name = "W", descriptor = "Lclient!od;")
	public static Class60 aClass60_1000 = aClass60_999;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[Lclient!od;)Lclient!od;")
	public static Class60 method1761(@OriginalArg(1) Class60[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static117.method1886(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(BI)Lclient!we;")
	public static Class4_Sub3_Sub17 method1771(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub3_Sub17 local6 = (Class4_Sub3_Sub17) Static67.aClass12_12.method289((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static108.aClass10_28.method1774(14, arg0);
		local6 = new Class4_Sub3_Sub17();
		if (local25 != null) {
			local6.method1998(new Class4_Sub9(local25));
		}
		Static67.aClass12_12.method290(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lclient!vf;")
	public static Class3 method1781() {
		try {
			return (Class3) Class.forName("Class3_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class3_Sub1();
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	public static void method1786() {
		aClass60_997 = null;
		anIntArray328 = null;
		aClass60_998 = null;
		aClass60_999 = null;
		aClass60_1000 = null;
	}
}
