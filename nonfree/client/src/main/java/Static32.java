import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!db", name = "A", descriptor = "Lclient!ab;")
	public static Class3 aClass3_2;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "Lclient!cf;")
	public static final Class20 aClass20_2 = new Class20();

	@OriginalMember(owner = "client!db", name = "u", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_344 = Static187.method3089("<col=00ff00>");

	@OriginalMember(owner = "client!db", name = "y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_345 = Static187.method3089("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_346 = Static187.method3089(" <col=ffffff>");

	@OriginalMember(owner = "client!db", name = "B", descriptor = "I")
	public static int anInt769 = -1;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "I")
	public static int anInt770 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public static void method581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static118.anInt2521 && Static204.anInt2389 >= arg1) {
			@Pc(19) int local19 = Static19.method429(Static102.anInt2207, arg2, Static116.anInt2488);
			@Pc(25) int local25 = Static19.method429(Static102.anInt2207, arg0, Static116.anInt2488);
			Static59.method976(local19, local25, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZ)V")
	public static void method582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static24.method463(arg0)) {
			Static35.method654(arg1, arg2, -1, Static194.aClass11ArrayArray1[arg0]);
		}
	}
}
