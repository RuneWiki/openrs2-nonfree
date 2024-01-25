import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
	public static int anInt5576;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	public static int anInt5579;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "Lclient!tq;")
	public static Class191 aClass191_178;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray49;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
	public static int anInt5577 = 0;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "Lclient!va;")
	public static Class199 aClass199_25 = new Class199(8);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBLclient!on;I)V")
	public static void method4967(@OriginalArg(0) int arg0, @OriginalArg(2) Class146 arg1, @OriginalArg(3) int arg2) {
		if (!Static262.aBoolean479) {
			@Pc(14) String local14;
			for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
				local14 = Static23.method712(arg1, local5);
				if (local14 != null) {
					Static53.method1208(arg1.anInt4493, arg1.aString40, Static92.method728(arg1, local5), local14, (long) (local5 + 1), arg1.anInt4450, 1006);
				}
			}
			local14 = Static36.method849(arg1);
			if (local14 != null) {
				Static53.method1208(arg1.anInt4493, arg1.aString40, arg1.anInt4412, local14, 0L, arg1.anInt4450, 23);
			}
			for (@Pc(71) int local71 = 4; local71 >= 0; local71--) {
				@Pc(78) String local78 = Static23.method712(arg1, local71);
				if (local78 != null) {
					Static53.method1208(arg1.anInt4493, arg1.aString40, Static92.method728(arg1, local71), local78, (long) (local71 + 1), arg1.anInt4450, 5);
				}
			}
			if (Static43.method1056(arg1).method710()) {
				if (arg1.aString39 == null) {
					Static53.method1208(arg1.anInt4493, "", -1, Static121.aClass93_51.method2819(Static21.anInt455), 0L, arg1.anInt4450, 48);
				} else {
					Static53.method1208(arg1.anInt4493, "", -1, arg1.aString39, 0L, arg1.anInt4450, 48);
				}
			}
		} else if (Static43.method1056(arg1).method711() && (Static326.anInt6614 & 0x20) != 0) {
			Static53.method1208(arg1.anInt4493, Static149.aString25 + " -> " + arg1.aString40, anInt5579, Static165.aString29, 0L, arg1.anInt4450, 17);
		}
	}
}
