import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static58 {

	@OriginalMember(owner = "client!l", name = "bb", descriptor = "Z")
	public static boolean aBoolean94;

	@OriginalMember(owner = "client!l", name = "db", descriptor = "Lclient!u;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
	public static int anInt1774;

	@OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
	public static int anInt1775;

	@OriginalMember(owner = "client!l", name = "hb", descriptor = "Z")
	public static boolean aBoolean95;

	@OriginalMember(owner = "client!l", name = "cb", descriptor = "Lclient!cc;")
	public static final Class11 aClass11_1 = new Class11();

	@OriginalMember(owner = "client!l", name = "gb", descriptor = "[I")
	public static final int[] anIntArray231 = new int[256];

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
	public static void method1052() {
		if (anInt1774 > 0) {
			anInterface3_1.method1711(anIntArray231, anInt1774);
			anInt1774 = 0;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIBI)V")
	public static void method1053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (anIntArray231.length <= anInt1774) {
			anInterface3_1.method1711(anIntArray231, anInt1774);
			anInt1774 = 0;
		}
		anIntArray231[anInt1774++] = arg0 - anInt1775;
		anInt1775 = arg0;
		anIntArray231[anInt1774++] = arg1 << 8 | arg3 | arg2 << 16;
	}
}
