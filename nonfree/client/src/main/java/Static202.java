import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!oe", name = "V", descriptor = "Lclient!g;")
	public static Class56 aClass56_11;

	@OriginalMember(owner = "client!oe", name = "hb", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
	public static int anInt2813 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(CI)Z")
	public static boolean method2134(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
	public static void method2140() {
		if (Static237.anInt4776 < 0) {
			Static54.anInt1326 = -1;
			Static18.anInt388 = -1;
			Static237.anInt4776 = 0;
		}
		if (Static237.anInt4776 > Static250.anInt3121) {
			Static237.anInt4776 = Static250.anInt3121;
			Static18.anInt388 = -1;
			Static54.anInt1326 = -1;
		}
		if (Static67.anInt1659 < 0) {
			Static18.anInt388 = -1;
			Static67.anInt1659 = 0;
			Static54.anInt1326 = -1;
		}
		if (Static250.anInt3119 < Static67.anInt1659) {
			Static54.anInt1326 = -1;
			Static67.anInt1659 = Static250.anInt3119;
			Static18.anInt388 = -1;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)J")
	public static long method2141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass191_1 == null ? 0L : local7.aClass191_1.aLong209;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)V")
	public static void method2169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(1, arg0);
		local8.method2052();
		local8.anInt2698 = arg1;
	}
}
