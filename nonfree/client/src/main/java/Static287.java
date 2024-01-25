import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static287 {

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "[I")
	public static final int[] anIntArray396 = new int[8];

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
	public static int anInt4907 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ef;B)I")
	public static int method4093(@OriginalArg(0) Class87 arg0) {
		if (arg0 == Static461.aClass87_5) {
			return 7681;
		} else if (Static575.aClass87_7 == arg0) {
			return 8448;
		} else if (Static129.aClass87_4 == arg0) {
			return 34165;
		} else if (arg0 == Static15.aClass87_1) {
			return 260;
		} else if (arg0 == Static543.aClass87_6) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BII)Z")
	public static boolean method4094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static317.method5006(arg1, arg0) || Static271.method3954(arg1, arg0);
	}
}
