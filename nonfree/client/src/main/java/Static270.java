import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!uda;")
	public static Class14_Sub2_Sub20 aClass14_Sub2_Sub20_1;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Z")
	public static boolean aBoolean372;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public static int anInt5019 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(CB)Z")
	public static boolean method4527(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
