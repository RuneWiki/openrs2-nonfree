import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!o", name = "I", descriptor = "I")
	public static int anInt2776;

	@OriginalMember(owner = "client!o", name = "S", descriptor = "[I")
	public static int[] anIntArray302;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "[I")
	public static final int[] anIntArray301 = new int[] { 1, 0, 0, 0, 1, 0, 2 };

	@OriginalMember(owner = "client!o", name = "E", descriptor = "I")
	public static int anInt2775 = 0;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1007 = Static161.method2452("wishes to trade with you)3");

	@OriginalMember(owner = "client!o", name = "G", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1008 = Static161.method2452("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!o", name = "H", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1009 = Static161.method2452("gelb:");

	@OriginalMember(owner = "client!o", name = "J", descriptor = "Lclient!mf;")
	public static Class69 aClass69_12 = null;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1010 = aClass20_1007;

	@OriginalMember(owner = "client!o", name = "P", descriptor = "I")
	public static int anInt2781 = -1;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIILclient!ia;Lclient!ia;IIIIJ)V")
	public static void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class29 local6 = new Class29();
		local6.aLong61 = arg10;
		local6.anInt1071 = arg1 * 128 + 64;
		local6.anInt1069 = arg2 * 128 + 64;
		local6.anInt1073 = arg3;
		local6.aClass1_2 = arg4;
		local6.aClass1_3 = arg5;
		local6.anInt1079 = arg6;
		local6.anInt1076 = arg7;
		local6.anInt1077 = arg8;
		local6.anInt1074 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static157.aClass5_Sub3ArrayArrayArray2[local46][arg1][arg2] == null) {
				Static157.aClass5_Sub3ArrayArrayArray2[local46][arg1][arg2] = new Class5_Sub3(local46, arg1, arg2);
			}
		}
		Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2].aClass29_1 = local6;
	}
}
