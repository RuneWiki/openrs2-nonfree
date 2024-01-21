import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "Lclient!hd;")
	public static Interface4 anInterface4_1;

	@OriginalMember(owner = "client!ea", name = "N", descriptor = "Z")
	public static boolean aBoolean48;

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
	public static int anInt746;

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "Z")
	public static boolean aBoolean49;

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
	public static int anInt747;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "Lclient!sc;")
	public static final Class65 aClass65_1 = new Class65();

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "[I")
	public static final int[] anIntArray104 = new int[256];

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
	public static void method503() {
		if (anInt747 > 0) {
			anInterface4_1.method725(anIntArray104, anInt747);
			anInt747 = 0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIIII)V")
	public static void method504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anInt747 >= anIntArray104.length) {
			anInterface4_1.method725(anIntArray104, anInt747);
			anInt747 = 0;
		}
		anIntArray104[anInt747++] = arg1 - anInt746;
		anInt746 = arg1;
		anIntArray104[anInt747++] = arg0 << 16 | arg3 | arg2 << 8;
	}
}
