import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "Lclient!rd;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "Z")
	public static boolean aBoolean42;

	@OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
	public static int anInt773;

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
	public static int anInt774;

	@OriginalMember(owner = "client!fa", name = "P", descriptor = "Z")
	public static boolean aBoolean43;

	@OriginalMember(owner = "client!fa", name = "M", descriptor = "[I")
	public static final int[] anIntArray149 = new int[256];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIZI)V")
	public static void method643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (anInt773 >= anIntArray149.length) {
			anInterface3_1.method1721(anIntArray149, anInt773);
			anInt773 = 0;
		}
		anIntArray149[anInt773++] = arg2 - anInt774;
		anInt774 = arg2;
		anIntArray149[anInt773++] = arg0 << 16 | arg3 << 8 | arg1;
	}

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "(I)V")
	public static void method645() {
		if (anInt773 > 0) {
			anInterface3_1.method1721(anIntArray149, anInt773);
			anInt773 = 0;
		}
	}
}
