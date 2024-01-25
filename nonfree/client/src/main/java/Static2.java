import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_3 = new Class211(89, -1);

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
	public static final int[] anIntArray3 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	public static int anInt12 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(CI)Z")
	public static boolean method8(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)[Lclient!bm;")
	public static Class28[] method9() {
		return new Class28[] { Static44.aClass28_1, Static361.aClass28_4, Static167.aClass28_2 };
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method10() {
		if (Static142.anInt2665 == 10) {
			Static212.method2974(28);
		}
		if (Static142.anInt2665 == 30) {
			Static212.method2974(25);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IC)Z")
	public static boolean method11(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(28) char[] local28 = Static367.aCharArray6;
			for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
				@Pc(36) char local36 = local28[local30];
				if (arg0 == local36) {
					return true;
				}
			}
		}
		return false;
	}
}
