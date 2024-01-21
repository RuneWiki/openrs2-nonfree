import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!g", name = "E", descriptor = "Lclient!fa;")
	public static Interface2 anInterface2_1;

	@OriginalMember(owner = "client!g", name = "F", descriptor = "Z")
	public static boolean aBoolean68;

	@OriginalMember(owner = "client!g", name = "G", descriptor = "Z")
	public static boolean aBoolean69;

	@OriginalMember(owner = "client!g", name = "H", descriptor = "I")
	public static int anInt1190;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "I")
	public static int anInt1191;

	@OriginalMember(owner = "client!g", name = "I", descriptor = "[I")
	public static final int[] anIntArray145 = new int[256];

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
	public static void method808() {
		if (anInt1191 > 0) {
			anInterface2_1.method750(anIntArray145, anInt1191);
			anInt1191 = 0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
	public static void method809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (anInt1191 >= anIntArray145.length) {
			anInterface2_1.method750(anIntArray145, anInt1191);
			anInt1191 = 0;
		}
		anIntArray145[anInt1191++] = arg2 - anInt1190;
		anInt1190 = arg2;
		anIntArray145[anInt1191++] = arg1 << 16 | arg0 | arg3 << 8;
	}
}
