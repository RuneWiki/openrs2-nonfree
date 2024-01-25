import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static120 {

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_45 = new Class2(32, 3);

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_46 = new Class2(68, 7);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I")
	public static int method1994() {
		if (Static145.aFrame4 == null) {
			return Static75.aBoolean88 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIII)V")
	public static void method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static293.anInt4886 <= arg3 && Static137.anInt2576 >= arg4 && Static316.anInt5188 <= arg2 && arg0 <= Static82.anInt1667) {
			Static12.method105(arg0, arg3, arg4, arg1, arg2);
		} else {
			Static207.method2976(arg2, arg3, arg0, arg1, arg4);
		}
	}
}
