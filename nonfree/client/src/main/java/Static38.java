import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
	public static int[] anIntArray218;

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "Z")
	public static boolean aBoolean54;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "Lclient!ge;")
	public static Class29 aClass29_16 = new Class29(64);

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
	public static int anInt1481 = 0;

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "Lclient!r;")
	public static Class61 aClass61_462 = Static129.method2060("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "Lclient!r;")
	public static Class61 aClass61_463 = Static129.method2060("Cabbage");

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "[I")
	public static int[] anIntArray223 = new int[500];

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "Lclient!r;")
	public static Class61 aClass61_464 = Static129.method2060("Clientscript error in: ");

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)I")
	public static int method1035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(28) int local28 = arg1 - 1 & arg2;
		@Pc(32) int local32 = arg2 / arg1;
		@Pc(37) int local37 = Static44.method778(local32, local7);
		@Pc(44) int local44 = Static44.method778(local32, local7 + 1);
		@Pc(51) int local51 = Static44.method778(local32 + 1, local7);
		@Pc(60) int local60 = Static44.method778(local32 + 1, local7 + 1);
		@Pc(67) int local67 = Static109.method1798(local13, local44, arg1, local37);
		@Pc(74) int local74 = Static109.method1798(local13, local60, arg1, local51);
		return Static109.method1798(local28, local74, arg1, local67);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public static void method1037() {
		aClass61_463 = null;
		anIntArray218 = null;
		aClass29_16 = null;
		aClass61_462 = null;
		anIntArray223 = null;
		aClass61_464 = null;
	}
}
