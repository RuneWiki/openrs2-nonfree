import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static77 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "I")
	public static int anInt1573;

	@OriginalMember(owner = "client!es", name = "e", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "Lclient!lm;")
	public static Class134 aClass134_33;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!es", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString60 = "Loaded client variable data";

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIII)V")
	public static void method1306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static345.anIntArrayArray60 != null) {
			Static345.anIntArrayArray60[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IC)C")
	public static char method1307(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
