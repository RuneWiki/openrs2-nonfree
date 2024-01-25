import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "Lclient!f;")
	public static Class5 aClass5_32;

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "Lclient!em;")
	public static final Class83 aClass83_157 = new Class83(15, 16);

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "[I")
	public static final int[] anIntArray458 = new int[1000];

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "[I")
	public static final int[] anIntArray459 = new int[1000];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZII)I")
	public static int method6091(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static461.method6448(arg0 + 91923, arg1 - -45365, 4) + (Static461.method6448(arg0 + 37821, arg1 + 10294, 2) - 128 >> 1) + (Static461.method6448(arg0, arg1, 1) + -128 >> 2) - 128;
		local46 = (int) ((double) local46 * 0.3D) + 35;
		if (local46 < 10) {
			local46 = 10;
		} else if (local46 > 60) {
			local46 = 60;
		}
		return local46;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIFFFIBILclient!gj;FF)[B")
	public static byte[] method6095(@OriginalArg(2) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(8) Class119 arg3, @OriginalArg(9) float arg4, @OriginalArg(10) float arg5) {
		@Pc(18) byte[] local18 = new byte[262144];
		Static318.method4727(local18, arg2, arg4, arg5, arg3, 0, arg1, arg0);
		return local18;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!vv;[Lclient!tw;)V")
	public static void method6096(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) Class1_Sub24[] arg1) {
		@Pc(6) int local6;
		if (Static478.aBoolean368) {
			local6 = arg0.method7204(arg1);
			Static458.aClass78_153.method6825(local6, arg1);
		}
		if (Static150.aClass129Array4 == Static310.aClass129Array5) {
			@Pc(28) int local28;
			if (arg0 instanceof Class11_Sub1_Sub1) {
				local6 = ((Class11_Sub1_Sub1) arg0).aShort90;
				local28 = ((Class11_Sub1_Sub1) arg0).aShort88;
			} else {
				local6 = arg0.anInt8902 >> Static166.anInt7796;
				local28 = arg0.anInt8906 >> Static166.anInt7796;
			}
			Static458.aClass78_153.YA(Static36.aClass129Array7[0].method6480(arg0.anInt8906, arg0.anInt8902), Static440.method6225(local6, local28), Static227.method3388(local6, local28), Static73.method1224(local6, local28));
		}
		@Pc(64) Class11_Sub2 local64 = arg0.method7219(Static458.aClass78_153);
		if (local64 == null) {
			return;
		}
		local64.aClass11_Sub1_1 = arg0;
		if (Static336.aBoolean470) {
			@Pc(73) Class196 local73 = Static572.aClass196_9;
			synchronized (Static572.aClass196_9) {
				@Pc(77) boolean local77 = false;
				for (@Pc(82) Class11_Sub2 local82 = (Class11_Sub2) Static572.aClass196_9.method4024(); local82 != null; local82 = (Class11_Sub2) Static572.aClass196_9.method4028()) {
					if (arg0.anInt8899 >= local82.aClass11_Sub1_1.anInt8899) {
						Static263.method3799(local82, local64);
						local77 = true;
						break;
					}
				}
				if (!local77) {
					Static572.aClass196_9.method4032(local64);
				}
				return;
			}
		}
		@Pc(117) boolean local117 = false;
		for (@Pc(122) Class11_Sub2 local122 = (Class11_Sub2) Static572.aClass196_9.method4024(); local122 != null; local122 = (Class11_Sub2) Static572.aClass196_9.method4028()) {
			if (arg0.anInt8899 >= local122.aClass11_Sub1_1.anInt8899) {
				Static263.method3799(local122, local64);
				local117 = true;
				break;
			}
		}
		if (!local117) {
			Static572.aClass196_9.method4032(local64);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	public static void method6099() {
		@Pc(5) Class207 local5 = Static236.aClass207_55;
		synchronized (Static236.aClass207_55) {
			Static236.aClass207_55.method4398();
		}
		local5 = Static275.aClass207_25;
		synchronized (Static275.aClass207_25) {
			Static275.aClass207_25.method4398();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
	public static void method6101() {
		Static11.aClass5Array1 = null;
		Static76.aClass5_22 = null;
		Static309.aClass5Array15 = null;
		Static404.aClass5Array16 = null;
		Static339.aClass96_9 = null;
		Static85.aClass5Array5 = null;
		Static360.aClass5Array17 = null;
		Static205.aClass5Array12 = null;
		Static308.aClass5_21 = null;
		Static12.aClass5Array3 = null;
		Static62.aClass96_4 = null;
		Static518.aClass5Array20 = null;
		Static11.aClass5Array2 = null;
		Static142.aClass5Array9 = null;
		Static99.aClass5Array6 = null;
		Static442.aClass96_12 = null;
		Static21.aClass5Array4 = null;
		Static517.aClass5Array18 = null;
	}
}
