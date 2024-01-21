import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static57 {

	@OriginalMember(owner = "client!l", name = "N", descriptor = "I")
	public static int anInt1459;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "Z")
	public static boolean aBoolean111;

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "Lclient!id;")
	public static Interface3 anInterface3_2;

	@OriginalMember(owner = "client!l", name = "R", descriptor = "I")
	public static int anInt1460;

	@OriginalMember(owner = "client!l", name = "S", descriptor = "Z")
	public static boolean aBoolean112;

	@OriginalMember(owner = "client!l", name = "P", descriptor = "[I")
	public static final int[] anIntArray301 = new int[256];

	@OriginalMember(owner = "client!l", name = "i", descriptor = "(I)V")
	public static void method969() {
		if (anInt1460 > 0) {
			anInterface3_2.method792(anIntArray301, anInt1460);
			anInt1460 = 0;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIB)V")
	public static void method970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt1460 >= anIntArray301.length) {
			anInterface3_2.method792(anIntArray301, anInt1460);
			anInt1460 = 0;
		}
		anIntArray301[anInt1460++] = arg1 - anInt1459;
		anInt1459 = arg1;
		anIntArray301[anInt1460++] = arg0 << 8 | arg3 | arg2 << 16;
	}
}
