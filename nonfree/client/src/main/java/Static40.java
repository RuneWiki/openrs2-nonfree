import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "Lclient!f;")
	public static Class49 aClass49_13;

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "Lclient!no;")
	public static Class173 aClass173_5;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "Z")
	public static boolean aBoolean385 = false;

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_37 = new Class254();

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "[I")
	public static final int[] anIntArray253 = new int[4096];

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_176 = new Class214(38, 5);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIB)V")
	public static void method3797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub3_Sub13 local8 = Static397.method4998(4, arg1);
		local8.method3459();
		local8.anInt4295 = arg3;
		local8.anInt4297 = arg0;
		local8.anInt4301 = arg2;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!me;I)V")
	public static void method3800(@OriginalArg(1) Class20_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt6062 > Static368.anInt6250) {
			Static385.method4921(arg0);
		} else if (arg0.anInt6078 < Static368.anInt6250) {
			Static303.method3968(false, arg0);
			local9 = Static213.anInt3439;
			local7 = Static339.anInt5513;
		} else {
			Static9.method158(arg0);
		}
		if (arg0.anInt6613 < 128 || arg0.anInt6616 < 128 || Static425.anInt6922 * 128 - 128 <= arg0.anInt6613 || arg0.anInt6616 >= Static251.anInt4072 * 128 - 128) {
			arg0.anInt6014 = -1;
			arg0.anInt6062 = 0;
			local7 = -1;
			arg0.anInt6019 = -1;
			local9 = 0;
			arg0.anInt6078 = 0;
			arg0.anInt6051 = -1;
			arg0.anInt6613 = arg0.anIntArray370[0] * 128 + arg0.method4678() * 64;
			arg0.anInt6616 = arg0.anIntArray369[0] * 128 + arg0.method4678() * 64;
			arg0.method4687();
		}
		if (Static239.aClass20_Sub3_Sub3_Sub1_1 == arg0 && (arg0.anInt6613 < 1536 || arg0.anInt6616 < 1536 || arg0.anInt6613 >= (Static425.anInt6922 - 12) * 128 || arg0.anInt6616 >= (Static251.anInt4072 - 12) * 128)) {
			local7 = -1;
			arg0.anInt6014 = -1;
			arg0.anInt6078 = 0;
			arg0.anInt6019 = -1;
			arg0.anInt6051 = -1;
			arg0.anInt6062 = 0;
			local9 = 0;
			arg0.anInt6613 = arg0.anIntArray370[0] * 128 + arg0.method4678() * 64;
			arg0.anInt6616 = arg0.anIntArray369[0] * 128 + arg0.method4678() * 64;
			arg0.method4687();
		}
		@Pc(217) int local217 = Static385.method4922(arg0);
		Static149.method5577(local7, local9, arg0, local217);
		Static109.method1526(arg0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BI)V")
	public static void method3801(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub13 local8 = Static397.method4998(4, arg0);
		local8.method3458();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(CILjava/lang/String;)I")
	public static int method3803(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1.charAt(local12) == arg0) {
				local7++;
			}
		}
		return local7;
	}
}
