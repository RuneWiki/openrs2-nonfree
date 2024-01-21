import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static22 {

	@OriginalMember(owner = "client!de", name = "J", descriptor = "Lclient!ad;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!de", name = "L", descriptor = "Z")
	public static boolean aBoolean29;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "I")
	public static int anInt719;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "I")
	public static int anInt720;

	@OriginalMember(owner = "client!de", name = "P", descriptor = "Z")
	public static boolean aBoolean30;

	@OriginalMember(owner = "client!de", name = "K", descriptor = "Lclient!ue;")
	public static final Class68 aClass68_1 = new Class68();

	@OriginalMember(owner = "client!de", name = "M", descriptor = "[I")
	public static final int[] anIntArray86 = new int[256];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIII)V")
	public static void method542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anInt720 >= anIntArray86.length) {
			anInterface1_1.method67(anIntArray86, anInt720);
			anInt720 = 0;
		}
		anIntArray86[anInt720++] = arg3 - anInt719;
		anInt719 = arg3;
		anIntArray86[anInt720++] = arg2 << 16 | arg1 << 8 | arg0;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public static void method543() {
		if (anInt720 > 0) {
			anInterface1_1.method67(anIntArray86, anInt720);
			anInt720 = 0;
		}
	}
}
