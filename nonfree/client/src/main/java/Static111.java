import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt2421;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
	public static int anInt2434;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "[Lclient!bb;")
	public static final Class9[] aClass9Array1 = new Class9[24];

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
	public static final int[] anIntArray225 = new int[50];

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_835 = Static151.method2243("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!mb;")
	public static Class62 aClass62_834 = aClass62_835;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public static int anInt2425 = 10;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public static int anInt2426 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	public static final int anInt2427 = 5063219;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_836 = Static151.method2243("M");

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_837 = Static151.method2243(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "[I")
	public static final int[] anIntArray226 = new int[1000];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!kd;)Lclient!vc;")
	public static Class102 method1703(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(7) Class102 local7 = new Class102();
		local7.anInt4174 = arg0.method1557();
		local7.aClass2_Sub1_Sub3_1 = Static106.method1670(local7.anInt4174);
		return local7;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg5 && arg0 == arg1 && arg4 == arg2 && arg8 == arg3) {
			Static165.method2409(arg6, arg8, arg2, arg7, arg1);
			return;
		}
		@Pc(23) int local23 = arg6;
		@Pc(25) int local25 = arg1;
		@Pc(29) int local29 = arg1 * 3;
		@Pc(33) int local33 = arg0 * 3;
		@Pc(37) int local37 = arg6 * 3;
		@Pc(41) int local41 = arg4 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(59) int local59 = local33 + arg8 - local45 - arg1;
		@Pc(68) int local68 = local49 + arg2 - local41 - arg6;
		@Pc(78) int local78 = local37 + local41 - local49 - local49;
		@Pc(83) int local83 = local49 - local37;
		@Pc(92) int local92 = local45 + local29 - local33 - local33;
		@Pc(97) int local97 = local33 - local29;
		for (@Pc(99) int local99 = 128; local99 <= 4096; local99 += 128) {
			@Pc(107) int local107 = local99 * local99 >> 12;
			@Pc(113) int local113 = local107 * local99 >> 12;
			@Pc(117) int local117 = local113 * local68;
			@Pc(121) int local121 = local59 * local113;
			@Pc(125) int local125 = local78 * local107;
			@Pc(129) int local129 = local97 * local99;
			@Pc(133) int local133 = local83 * local99;
			@Pc(143) int local143 = (local133 + local125 + local117 >> 12) + arg6;
			@Pc(147) int local147 = local107 * local92;
			@Pc(158) int local158 = (local147 + local121 + local129 >> 12) + arg1;
			Static165.method2409(local23, local158, local143, arg7, local25);
			local23 = local143;
			local25 = local158;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
	public static void method1711() {
		if (Static60.aBoolean52 && Static126.anInt2806 != Static119.anInt2627) {
			Static176.method2553(Static186.aClass7_Sub2_Sub2_1.anIntArray274[0], Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], Static18.anInt449, Static64.anInt1337, Static126.anInt2806);
		} else if (Static126.anInt2806 != Static179.anInt3763) {
			Static179.anInt3763 = Static126.anInt2806;
			Static101.method1612(Static126.anInt2806);
		}
	}
}
