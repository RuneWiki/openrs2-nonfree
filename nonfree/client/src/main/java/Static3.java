import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString3;

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
	public static int anInt77 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(CI)C")
	public static char method166(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void method170() {
		Static317.method5332(false);
		if (Static139.anInt2757 >= 0 && Static139.anInt2757 != 0) {
			Static263.method4608(Static139.anInt2757);
			Static139.anInt2757 = -1;
		}
	}
}
