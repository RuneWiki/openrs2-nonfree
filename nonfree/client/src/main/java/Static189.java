import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!jb;")
	public static Class28 aClass28_64;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!jb;")
	public static Class28 aClass28_65;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "J")
	public static long aLong149;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt4166 = 0;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public static int anInt4167 = 0;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	public static int anInt4168 = 0;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1101 = Static231.method3737("::tele ");

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1102 = Static231.method3737("::gc");

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	public static int anInt4176 = 0;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1103 = Static231.method3737(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "[I")
	public static int[] anIntArray347 = new int[100];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method3061() {
		Static7.aClass61_9.method1689();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	public static int method3062(@OriginalArg(0) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIII)V")
	public static void method3063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg1) {
			Static163.method2617(arg3, arg4, arg0, arg2);
		} else if (Static99.anInt915 <= arg2 - arg0 && arg2 + arg0 <= Static38.anInt784 && arg3 - arg1 >= Static223.anInt4869 && Static47.anInt1057 >= arg1 + arg3) {
			Static166.method3213(arg1, arg2, arg0, arg3, arg4);
		} else {
			Static66.method1214(arg4, arg1, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZJ[I)Lclient!sc;")
	public static Class107 method3064(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (Static119.anInterface1_1 != null) {
			@Pc(12) Class107 local12 = Static119.anInterface1_1.method2118(arg1, arg0, arg2);
			if (local12 != null) {
				return local12;
			}
		}
		return arg0 == 5 ? Static19.method382(arg1).method3092() : Static152.method2502(arg1);
	}
}
