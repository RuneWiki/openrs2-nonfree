import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
	public static int anInt1765;

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
	public static int anInt1766;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "[[[Lclient!hg;")
	public static Class106[][][] aClass106ArrayArrayArray1;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "[I")
	public static final int[] anIntArray148 = new int[4096];

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray10 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZIII)V")
	public static void method1466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg1 + 1;
		Static64.method1247(arg0, Static280.anIntArrayArray51[arg1], arg3, arg4);
		@Pc(18) int local18 = arg2 - 1;
		Static64.method1247(arg0, Static280.anIntArrayArray51[arg2], arg3, arg4);
		for (@Pc(25) int local25 = local5; local25 <= local18; local25++) {
			@Pc(31) int[] local31 = Static280.anIntArrayArray51[local25];
			local31[arg0] = local31[arg3] = arg4;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V")
	public static void method1468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class2_Sub5_Sub13 local10 = Static208.method3306(arg2, 11);
		local10.method4547();
		local10.anInt5643 = arg1;
		local10.anInt5641 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)V")
	public static void method1469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg0) {
			Static47.method782(arg3, arg0, arg1, arg2);
		} else if (arg1 - arg0 >= Static8.anInt223 && arg0 + arg1 <= Static184.anInt3600 && Static430.anInt7123 <= arg2 - arg4 && arg2 + arg4 <= Static181.anInt3543) {
			Static83.method1615(arg0, arg1, arg4, arg2, arg3);
		} else {
			Static284.method4119(arg3, arg0, arg2, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBI)V")
	public static void method1470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static8.anInt223 <= arg3 && Static184.anInt3600 >= arg3) {
			@Pc(15) int local15 = Static327.method4554(arg2, Static181.anInt3543, Static430.anInt7123);
			@Pc(21) int local21 = Static327.method4554(arg1, Static181.anInt3543, Static430.anInt7123);
			Static206.method3258(local15, arg3, local21, arg0);
		}
	}
}
