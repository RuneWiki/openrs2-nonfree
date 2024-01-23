import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
	public static int anInt4608;

	@OriginalMember(owner = "client!uh", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray43 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!uh", name = "U", descriptor = "Lclient!qe;")
	private static Class78 aClass78_814 = Static199.method3560("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!uh", name = "T", descriptor = "Lclient!qe;")
	public static Class78 aClass78_813 = aClass78_814;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "(I)I")
	public static int method3655() {
		Static166.anInt1143 = Static189.anInt4407;
		Static219.method3823();
		Static122.method1344();
		Static86.method1522(Static166.anInt1143);
		Static31.aClass5_Sub2_Sub2_1 = new Class5_Sub2_Sub2();
		Static31.aClass5_Sub2_Sub2_1.anInt1849 = 3000;
		Static31.aClass5_Sub2_Sub2_1.anInt1827 = 3000;
		Static198.method3553(Static215.aClass72_Sub1_33);
		return 10;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V")
	public static void method3656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static80.method1342(arg3, Static73.anInt1576, Static137.anInt3137);
		@Pc(21) int local21 = Static80.method1342(arg0, Static73.anInt1576, Static137.anInt3137);
		@Pc(27) int local27 = Static80.method1342(arg2, Static6.anInt187, Static101.anInt2213);
		@Pc(33) int local33 = Static80.method1342(arg1, Static6.anInt187, Static101.anInt2213);
		for (@Pc(35) int local35 = local11; local35 <= local21; local35++) {
			Static221.method3893(arg4, local27, Static183.anIntArrayArray40[local35], local33);
		}
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V")
	public static void method3657() {
		Static154.aClass110_14.method3889();
	}
}
