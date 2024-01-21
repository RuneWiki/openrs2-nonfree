import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static49 {

	@OriginalMember(owner = "client!ja", name = "R", descriptor = "Lclient!db;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!ja", name = "S", descriptor = "Z")
	public static boolean aBoolean89;

	@OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
	public static int anInt1624;

	@OriginalMember(owner = "client!ja", name = "W", descriptor = "Z")
	public static boolean aBoolean90;

	@OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
	public static int anInt1625;

	@OriginalMember(owner = "client!ja", name = "T", descriptor = "Lclient!ea;")
	public static final Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!ja", name = "V", descriptor = "[I")
	public static final int[] anIntArray165 = new int[256];

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)V")
	public static void method1097() {
		if (anInt1625 > 0) {
			anInterface1_1.method586(anIntArray165, anInt1625);
			anInt1625 = 0;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBIII)V")
	public static void method1098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anIntArray165.length <= anInt1625) {
			anInterface1_1.method586(anIntArray165, anInt1625);
			anInt1625 = 0;
		}
		anIntArray165[anInt1625++] = arg2 - anInt1624;
		anInt1624 = arg2;
		anIntArray165[anInt1625++] = arg3 | arg0 << 8 | arg1 << 16;
	}
}
