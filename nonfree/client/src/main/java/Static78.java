import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static78 {

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "Z")
	public static boolean aBoolean112;

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
	public static int anInt2011;

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "Lclient!bb;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!pe", name = "V", descriptor = "Z")
	public static boolean aBoolean113;

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
	public static int anInt2012;

	@OriginalMember(owner = "client!pe", name = "W", descriptor = "[I")
	public static final int[] anIntArray314 = new int[256];

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	public static void method1440() {
		if (anInt2012 > 0) {
			anInterface1_1.method130(anIntArray314, anInt2012);
			anInt2012 = 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIBI)V")
	public static void method1441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (anIntArray314.length <= anInt2012) {
			anInterface1_1.method130(anIntArray314, anInt2012);
			anInt2012 = 0;
		}
		anIntArray314[anInt2012++] = arg2 - anInt2011;
		anInt2011 = arg2;
		anIntArray314[anInt2012++] = arg1 << 16 | arg3 | arg0 << 8;
	}
}
