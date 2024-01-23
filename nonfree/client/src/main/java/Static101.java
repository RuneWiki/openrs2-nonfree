import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
	public static int anInt2041;

	@OriginalMember(owner = "client!jg", name = "cb", descriptor = "[I")
	public static int[] anIntArray191;

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "[I")
	public static int[] anIntArray190 = new int[1000];

	@OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
	public static int anInt2038 = 2;

	@OriginalMember(owner = "client!jg", name = "V", descriptor = "[S")
	public static short[] aShortArray29 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!jg", name = "db", descriptor = "Lclient!hh;")
	private static Class50 aClass50_667 = Static186.method3527("OFF");

	@OriginalMember(owner = "client!jg", name = "Z", descriptor = "Lclient!hh;")
	public static Class50 aClass50_666 = aClass50_667;

	@OriginalMember(owner = "client!jg", name = "fb", descriptor = "[I")
	public static int[] anIntArray192 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIILclient!ta;Lclient!ta;IIIIJ)V")
	public static void method1574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20 arg4, @OriginalArg(5) Class20 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class61 local6 = new Class61();
		local6.aLong89 = arg10;
		local6.anInt2074 = arg1 * 128 + 64;
		local6.anInt2075 = arg2 * 128 + 64;
		local6.anInt2070 = arg3;
		local6.aClass20_3 = arg4;
		local6.aClass20_4 = arg5;
		local6.anInt2079 = arg6;
		local6.anInt2069 = arg7;
		local6.anInt2072 = arg8;
		local6.anInt2082 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static56.aClass1_Sub11ArrayArrayArray3[local46][arg1][arg2] == null) {
				Static56.aClass1_Sub11ArrayArrayArray3[local46][arg1][arg2] = new Class1_Sub11(local46, arg1, arg2);
			}
		}
		Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2].aClass61_1 = local6;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!hh;I)V")
	public static void method1575(@OriginalArg(0) Class50 arg0) {
		Static129.method2047();
		Static140.method2331(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIILclient!qh;)V")
	public static void method1576(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class93 arg3) {
		if (Static214.anInt4249 < 3) {
			((Class1_Sub1_Sub8_Sub1) Static114.aClass1_Sub1_Sub8_4).method2433(arg2, arg1, arg3.anInt3600, arg3.anInt3620, Static114.aClass1_Sub1_Sub8_4.anInt2984 / 2, Static114.aClass1_Sub1_Sub8_4.anInt2985 / 2, Static104.anInt2068, arg3.anIntArray394, arg3.anIntArray398);
		} else {
			Static29.method417(arg2, arg1, arg3.anIntArray394, arg3.anIntArray398);
		}
		Static222.aBooleanArray28[arg0] = true;
	}
}
