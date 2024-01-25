import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
	public static int anInt2165 = -1;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "[Lclient!pp;")
	public static final Class4_Sub1_Sub1_Sub2[] aClass4_Sub1_Sub1_Sub2Array3 = new Class4_Sub1_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IBIII)V")
	public static void method1983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static140.aClass6_Sub48_Sub1_1.anInt8997 != 0 && arg3 != 0 && Static559.anInt9221 < 50 && arg1 != -1) {
			Static546.aClass39Array1[Static559.anInt9221++] = new Class39((byte) 1, arg1, arg3, arg2, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!pfa;I)Lclient!xa;")
	public static Class58 method1984(@OriginalArg(1) Class251 arg0, @OriginalArg(2) int arg1) {
		return Static578.aBoolean725 ? Static240.aClass14_7.method6889(Static604.method3624(arg0, arg1), true) : Static146.method2820(arg0.method5761(arg1));
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)V")
	public static void method1988(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static401.method5861(arg0, 14);
		local8.method2580();
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
	public static void method1989() {
		Static111.aClient1.method1341();
		Static499.method6761();
		Static97.anInt1865 = 0;
		Static462.aClass73_148 = null;
		Static108.aClass73_41 = null;
		Static261.aClass73_98 = null;
		Static282.aClass6_Sub21_Sub2_1.anInt7338 = 0;
		Static530.anInt8824 = 0;
		Static296.method4744();
		Static324.anInt7486 = 0;
		Static398.aString61 = null;
		Static257.anInt5017 = 0;
		Static198.aClass234Array1 = null;
		Static574.anInt9426 = 0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!pg;ILclient!ac;ILclient!pp;III)V")
	public static void method1990(@OriginalArg(0) Class252 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub1_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) Class6_Sub16 local11 = new Class6_Sub16();
		local11.anInt2202 = arg3;
		local11.anInt2206 = arg1 << 9;
		local11.anInt2213 = arg5 << 9;
		if (arg0 != null) {
			local11.aClass252_1 = arg0;
			@Pc(32) int local32 = arg0.anInt6935;
			@Pc(35) int local35 = arg0.anInt6898;
			if (arg6 == 1 || arg6 == 3) {
				local32 = arg0.anInt6898;
				local35 = arg0.anInt6935;
			}
			local11.anInt2212 = arg1 + local32 << 9;
			local11.anInt2201 = arg0.anInt6917;
			local11.anInt2214 = arg0.anInt6892;
			local11.anInt2208 = arg0.anInt6915 << 9;
			local11.anInt2209 = arg0.anInt6894;
			local11.anInt2211 = local35 + arg5 << 9;
			local11.aBoolean153 = arg0.aBoolean479;
			local11.aBoolean152 = arg0.aBoolean475;
			local11.anIntArray167 = arg0.anIntArray509;
			local11.anInt2207 = arg0.anInt6887;
			if (arg0.anIntArray506 != null) {
				local11.aBoolean151 = true;
				local11.method2013();
			}
			if (local11.anIntArray167 != null) {
				local11.anInt2215 = (int) (Math.random() * (double) (local11.anInt2209 - local11.anInt2201)) + local11.anInt2201;
			}
			Static1.aClass361_67.method7833(local11);
		} else if (arg2 != null) {
			local11.aClass4_Sub1_Sub1_Sub1_1 = arg2;
			@Pc(137) Class273 local137 = arg2.aClass273_1;
			if (local137.anIntArray537 != null) {
				local11.aBoolean151 = true;
				local137 = local137.method6159(Static498.aClass101_1);
			}
			if (local137 != null) {
				local11.anInt2211 = arg5 + local137.anInt7439 << 9;
				local11.anInt2212 = local137.anInt7439 + arg1 << 9;
				local11.anInt2207 = Static219.method3785(arg2);
				local11.aBoolean152 = local137.aBoolean517;
				local11.anInt2208 = local137.anInt7458 << 9;
				local11.anInt2214 = local137.anInt7448;
			}
			Static427.aClass361_54.method7833(local11);
		} else if (arg4 != null) {
			local11.aClass4_Sub1_Sub1_Sub2_1 = arg4;
			local11.anInt2212 = arg1 + arg4.method5892() << 9;
			local11.anInt2211 = arg5 + arg4.method5892() << 9;
			local11.anInt2207 = Static449.method6351(arg4);
			local11.anInt2208 = arg4.anInt7174 << 9;
			local11.anInt2214 = arg4.anInt7171;
			local11.aBoolean152 = arg4.aBoolean497;
			Static156.aClass128_12.method3267(local11, (long) arg4.anInt7126);
		}
	}
}
