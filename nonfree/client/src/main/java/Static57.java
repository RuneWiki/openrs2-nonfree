import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static57 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "I")
	public static int anInt1639;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "I")
	public static int anInt1653;

	@OriginalMember(owner = "client!la", name = "A", descriptor = "I")
	public static int anInt1657;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][13][13];

	@OriginalMember(owner = "client!la", name = "i", descriptor = "I")
	public static int anInt1642 = 0;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Lclient!ke;")
	private static Class39 aClass39_711 = Static2.method66("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!ke;")
	public static Class39 aClass39_709 = aClass39_711;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	public static int anInt1649 = 0;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "I")
	public static int anInt1650 = -1;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_710 = Static2.method66("compass");

	@OriginalMember(owner = "client!la", name = "x", descriptor = "I")
	public static int anInt1654 = 0;

	@OriginalMember(owner = "client!la", name = "G", descriptor = "I")
	public static int anInt1663 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1148() {
		anIntArrayArrayArray4 = null;
		aByteArrayArrayArray2 = null;
		aClass39_711 = null;
		aClass39_709 = null;
		aClass39_710 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ[BI)V")
	public static void method1149(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2) {
		if (Static78.aClass11_1 == null) {
			return;
		}
		if (Static30.anInt844 >= 0) {
			Static78.aClass11_1.method1861();
			Static50.anInt1408 = 0;
			Static30.anInt844 = -1;
			Static51.aByteArray22 = null;
			Static10.anInt248 = 20;
		}
		if (arg2 == null) {
			return;
		}
		if (Static10.anInt248 > 0) {
			Static78.aClass11_1.method1867(arg0);
			Static10.anInt248 = 0;
		}
		Static30.anInt844 = arg0;
		Static78.aClass11_1.method1862(arg1, arg0, arg2);
	}
}
