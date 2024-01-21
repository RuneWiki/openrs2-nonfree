import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "[I")
	public static final int[] anIntArray164 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
	public static int anInt1163 = 0;

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_453 = Static120.method1824("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!fh", name = "O", descriptor = "Lclient!mb;")
	public static final Class3_Sub17 aClass3_Sub17_1 = new Class3_Sub17(new byte[5000]);

	@OriginalMember(owner = "client!fh", name = "P", descriptor = "Lclient!rd;")
	public static Class80 aClass80_454 = aClass80_453;

	@OriginalMember(owner = "client!fh", name = "Q", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_455 = Static120.method1824(" ");

	@OriginalMember(owner = "client!fh", name = "S", descriptor = "Lclient!rd;")
	public static Class80 aClass80_456 = null;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIB)V")
	public static void method792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class34[] local11 = Static94.aClass34Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(19) Class34 local19 = local11[local13];
			if (local19 != null && local19.anInt1330 == 2) {
				Static162.method2626(local19.anInt1319 + (local19.anInt1325 - Static39.anInt875 << 7), local19.anInt1322 * 2, (local19.anInt1323 - Static97.anInt2062 << 7) + local19.anInt1318);
				if (Static168.anInt3762 > -1 && Static193.anInt4411 % 20 < 10) {
					Static181.aClass3_Sub1_Sub4_Sub4Array15[local19.anInt1329].method2595(arg1 + Static168.anInt3762 - 12, arg0 + -28 - -Static13.anInt316);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class60 local3 = new Class60();
		local3.anInt2548 = arg2 / 128;
		local3.anInt2537 = arg3 / 128;
		local3.anInt2539 = arg4 / 128;
		local3.anInt2545 = arg5 / 128;
		local3.anInt2547 = arg1;
		local3.anInt2542 = arg2;
		local3.anInt2530 = arg3;
		local3.anInt2541 = arg4;
		local3.anInt2533 = arg5;
		local3.anInt2538 = arg6;
		local3.anInt2532 = arg7;
		Static185.aClass60ArrayArray1[arg0][Static185.anIntArray499[arg0]++] = local3;
	}
}
