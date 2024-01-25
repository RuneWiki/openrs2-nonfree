import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!wca", name = "F", descriptor = "[I")
	public static final int[] anIntArray716 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!wca", name = "M", descriptor = "[I")
	public static final int[] anIntArray717 = new int[2048];

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!de;I)V")
	public static void method7711(@OriginalArg(0) Class8_Sub3_Sub3_Sub1_Sub1 arg0) {
		@Pc(17) Class1_Sub38 local17 = (Class1_Sub38) Static478.aClass187_41.method3797((long) arg0.anInt6821);
		if (local17 == null) {
			return;
		}
		if (local17.aClass1_Sub7_Sub4_4 != null) {
			Static309.aClass1_Sub7_Sub1_2.method477(local17.aClass1_Sub7_Sub4_4);
			local17.aClass1_Sub7_Sub4_4 = null;
		}
		local17.method7859();
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BIII)Lclient!d;")
	public static Class1_Sub11 method7712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class1_Sub11 local5 = null;
		if (arg2 == 0) {
			local5 = Static276.method3885(Static4.aClass70_2, Static481.aClass276_2);
		}
		if (arg2 == 1) {
			local5 = Static276.method3885(Static538.aClass70_98, Static481.aClass276_2);
		}
		local5.aClass1_Sub35_Sub2_1.method5764(arg0 + Static116.anInt2289);
		local5.aClass1_Sub35_Sub2_1.method5764(Static541.anInt9058 + arg1);
		local5.aClass1_Sub35_Sub2_1.method5794(Static137.aClass295_1.method7719(82) ? 1 : 0);
		Static228.anInt4297 = arg1;
		Static66.anInt1351 = arg0;
		Static309.aBoolean425 = false;
		Static248.method3688();
		return local5;
	}
}
