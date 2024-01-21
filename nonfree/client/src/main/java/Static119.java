import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
	public static int anInt2775 = 0;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "[I")
	public static int[] anIntArray480 = new int[32];

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "Z")
	public static volatile boolean aBoolean116 = true;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "[I")
	public static int[] anIntArray481 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
	public static int anInt2780 = 127;

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1610 = Static106.method1849("Loading textures )2 ");

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1609 = aClass66_1610;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method1960() {
		aClass66_1610 = null;
		aClass66_1609 = null;
		anIntArray481 = null;
		anIntArray480 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z")
	public static boolean method1961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!sf;I)Lclient!cd;")
	public static Class1_Sub6 method1962(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1) {
		@Pc(8) byte[] local8 = arg1.method124(arg0);
		return local8 == null ? null : new Class1_Sub6(local8);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public static void method1963() {
		Static66.aFont2 = null;
		Static28.aFontMetrics1 = null;
		Static90.anImage5 = null;
	}
}
