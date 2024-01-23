import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!qf", name = "cb", descriptor = "[[[Lclient!fa;")
	public static Class1_Sub9[][][] aClass1_Sub9ArrayArrayArray2;

	@OriginalMember(owner = "client!qf", name = "fb", descriptor = "Lclient!uc;")
	public static Class1_Sub2_Sub15_Sub1 aClass1_Sub2_Sub15_Sub1_4;

	@OriginalMember(owner = "client!qf", name = "hb", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_102;

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
	public static int anInt3793 = 0;

	@OriginalMember(owner = "client!qf", name = "Y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1029 = Static231.method3737("<col=00ff80>");

	@OriginalMember(owner = "client!qf", name = "ab", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1030 = Static231.method3737("<br>(X100(U(Y");

	@OriginalMember(owner = "client!qf", name = "bb", descriptor = "I")
	public static int anInt3795 = 0;

	@OriginalMember(owner = "client!qf", name = "db", descriptor = "I")
	public static int anInt3796 = 0;

	@OriginalMember(owner = "client!qf", name = "eb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10 = new int[2][][];

	@OriginalMember(owner = "client!qf", name = "gb", descriptor = "[I")
	public static int[] anIntArray332 = new int[5];

	@OriginalMember(owner = "client!qf", name = "ib", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1031 = Static231.method3737("weiss:");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!sc;Lclient!sc;ILclient!sc;II)V")
	public static void method2775(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(3) Class107 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static227.anIntArray379[local3] = Static227.anIntArray379[local3 - 1];
			Static182.aClass107Array25[local3] = Static182.aClass107Array25[local3 - 1];
			Static61.aClass107Array7[local3] = Static61.aClass107Array7[local3 - 1];
			Static227.aClass107Array30[local3] = Static227.aClass107Array30[local3 - 1];
			Static76.anIntArray161[local3] = Static76.anIntArray161[local3 - 1];
		}
		Static36.anInt765 = Static218.anInt4760;
		Static227.anIntArray379[0] = arg3;
		Static156.anInt3415++;
		Static76.anIntArray161[0] = arg4;
		Static182.aClass107Array25[0] = arg1;
		Static61.aClass107Array7[0] = arg2;
		Static227.aClass107Array30[0] = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) int local13 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg4);
		@Pc(19) int local19 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg3);
		@Pc(25) int local25 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg5);
		@Pc(31) int local31 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg6);
		@Pc(39) int local39 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg4 + arg0);
		@Pc(49) int local49 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg3 - arg0);
		for (@Pc(51) int local51 = local13; local51 < local39; local51++) {
			Static162.method2605(Static231.anIntArrayArray44[local51], local25, arg2, local31);
		}
		for (@Pc(71) int local71 = local19; local71 > local49; local71--) {
			Static162.method2605(Static231.anIntArrayArray44[local71], local25, arg2, local31);
		}
		@Pc(98) int local98 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 + arg5);
		@Pc(109) int local109 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg6 - arg0);
		for (@Pc(111) int local111 = local39; local111 <= local49; local111++) {
			@Pc(117) int[] local117 = Static231.anIntArrayArray44[local111];
			Static162.method2605(local117, local25, arg2, local98);
			Static162.method2605(local117, local98, arg1, local109);
			Static162.method2605(local117, local109, arg2, local31);
		}
	}
}
