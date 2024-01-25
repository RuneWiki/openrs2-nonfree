import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
	public static int anInt2009;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "[[[Lclient!sq;")
	public static Class194[][][] aClass194ArrayArrayArray1;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "Lclient!c;")
	public static Class5 aClass5_10;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
	public static final int[] anIntArray200 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "Lclient!tm;")
	public static final Class197 aClass197_7 = new Class197(16);

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_16 = new Class87(5);

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
	public static int anInt2010 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([[[Lclient!sq;Z)V")
	public static void method1747(@OriginalArg(0) Class194[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class194[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class194 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass17_Sub5_1 instanceof Interface5) {
							((Interface5) local23.aClass17_Sub5_1).method4801();
						}
						if (local23.aClass17_Sub3_1 instanceof Interface5) {
							((Interface5) local23.aClass17_Sub3_1).method4801();
						}
						if (local23.aClass17_Sub3_2 instanceof Interface5) {
							((Interface5) local23.aClass17_Sub3_2).method4801();
						}
						if (local23.aClass17_Sub4_1 instanceof Interface5) {
							((Interface5) local23.aClass17_Sub4_1).method4801();
						}
						if (local23.aClass17_Sub4_2 instanceof Interface5) {
							((Interface5) local23.aClass17_Sub4_2).method4801();
						}
						for (@Pc(73) Class126 local73 = local23.aClass126_2; local73 != null; local73 = local73.aClass126_1) {
							@Pc(78) Class17_Sub1 local78 = local73.aClass17_Sub1_1;
							if (local78 instanceof Interface5) {
								((Interface5) local78).method4801();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBIIIIIII)Z")
	public static boolean method1749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 + arg0 > arg1 && arg1 + arg2 > arg0) {
			return arg6 < arg3 + arg5 && arg6 + arg7 > arg5;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBII)V")
	public static void method1753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			Static342.aClass1_Sub8_Sub1_7.method3229(69);
		}
		if (arg0 == 1) {
			Static342.aClass1_Sub8_Sub1_7.method3229(52);
		}
		Static342.aClass1_Sub8_Sub1_7.method4515(arg2 + Static234.anInt4783);
		Static342.aClass1_Sub8_Sub1_7.method4548(Static57.aClass171_1.method4638(82) ? 1 : 0);
		Static342.aClass1_Sub8_Sub1_7.method4561(Static32.anInt2224 + arg1);
		Static266.anInt5402 = arg1;
		Static47.aBoolean146 = false;
		Static99.anInt2377 = arg2;
		Static115.method2440();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V")
	public static void method1754(@OriginalArg(0) int arg0) {
		Static239.anInt4961 = 1000 / arg0;
	}
}
