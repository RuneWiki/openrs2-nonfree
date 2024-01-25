import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static508 {

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_126 = new Class218(2, -1);

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_169 = new Class180(125, 8);

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
	public static int anInt8219 = -1;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(III)V")
	public static void method7196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static519.anInt8360 = arg0;
		Static617.anInt9892 = arg1;
		if (Static76.anInt1404 == 0) {
			Static454.anInt5692 = Static519.anInt8360 + Static609.anInt9830 * 2;
			Static561.anInt9112 = Static489.anInt8083 * 2 + Static617.anInt9892;
		} else if (Static76.anInt1404 == 1) {
			Static37.anInt839 = Static278.anInt3283 + Static519.anInt8360 / Static9.anInt105 + 2;
			Static153.anInt3033 = Static617.anInt9892 / Static336.anInt5533 + Static8.anInt97 + 2;
			Static454.anInt5692 = Static9.anInt105 * Static37.anInt839;
			Static561.anInt9112 = Static336.anInt5533 * Static153.anInt3033;
			Static609.anInt9830 = Static454.anInt5692 - Static519.anInt8360 >> 1;
			Static489.anInt8083 = Static561.anInt9112 - Static617.anInt9892 >> 1;
		} else if (Static76.anInt1404 == 2) {
			Static454.anInt5692 = Static519.anInt8360;
			Static561.anInt9112 = Static617.anInt9892;
		}
	}
}
