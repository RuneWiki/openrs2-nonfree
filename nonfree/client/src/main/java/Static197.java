import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static197 {

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
	public static int anInt3480;

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_62 = new Class186(1, -1);

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[5];

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
	public static int anInt3483 = -1;

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ICZ)C")
	public static char method2978(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}
}
