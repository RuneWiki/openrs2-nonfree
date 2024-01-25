import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static226 {

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
	public static int anInt4752;

	@OriginalMember(owner = "client!oh", name = "T", descriptor = "Lclient!am;")
	public static Class11 aClass11_92;

	@OriginalMember(owner = "client!oh", name = "X", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
	public static int anInt4746 = 0;

	@OriginalMember(owner = "client!oh", name = "M", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IC)C")
	public static char method3892(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!fd;I)Ljava/lang/String;")
	public static String method3893(@OriginalArg(0) Class72 arg0) {
		if (Static46.method876(arg0).method261() == 0) {
			return null;
		} else if (arg0.aString57 == null || arg0.aString57.trim().length() == 0) {
			return Static93.aBoolean179 ? "Hidden-use" : null;
		} else {
			return arg0.aString57;
		}
	}
}
