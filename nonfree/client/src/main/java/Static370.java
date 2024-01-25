import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!an;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!fp;IB)V")
	public static void method5897(@OriginalArg(0) Class11_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static508.anInt8998 < arg0.anInt7391) {
			Static239.method4217(arg0);
		} else if (Static508.anInt8998 > arg0.anInt7428) {
			Static85.method1892(arg0, false);
			local7 = Static415.anInt7773;
			local9 = Static566.anInt9589;
		} else {
			Static193.method3703(arg0);
		}
		if (arg0.anInt7347 < 512 || arg0.anInt7351 < 512 || arg0.anInt7347 >= (Static228.anInt4746 - 1) * 512 || arg0.anInt7351 >= (Static44.anInt1275 - 1) * 512) {
			arg0.anInt7393 = -1;
			arg0.anInt7428 = 0;
			local9 = 0;
			local7 = -1;
			arg0.anInt7391 = 0;
			arg0.anInt7384 = -1;
			arg0.anInt7387 = -1;
			arg0.anInt7347 = arg0.anIntArray526[0] * 512 + arg0.method6212() * 256;
			arg0.anInt7351 = arg0.anIntArray527[0] * 512 + arg0.method6212() * 256;
			arg0.method6206();
		}
		if (arg0 == Static350.aClass11_Sub1_Sub1_Sub2_4 && (arg0.anInt7347 < 6144 || arg0.anInt7351 < 6144 || arg0.anInt7347 >= Static228.anInt4746 * 512 - 6144 || (Static44.anInt1275 - 12) * 512 <= arg0.anInt7351)) {
			arg0.anInt7387 = -1;
			arg0.anInt7384 = -1;
			arg0.anInt7393 = -1;
			local9 = 0;
			arg0.anInt7391 = 0;
			arg0.anInt7428 = 0;
			local7 = -1;
			arg0.anInt7347 = arg0.anIntArray526[0] * 512 + arg0.method6212() * 256;
			arg0.anInt7351 = arg0.anIntArray527[0] * 512 + arg0.method6212() * 256;
			arg0.method6206();
		}
		@Pc(208) int local208 = Static401.method6296(arg0);
		Static247.method4362(arg0, local9, local208, local7);
		Static128.method2505(arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBI)Z")
	public static boolean method5898(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V")
	public static void method5899(@OriginalArg(0) int arg0) {
		@Pc(15) Class6_Sub4_Sub6 local15 = Static68.method1408(9, arg0);
		local15.method3828();
	}
}
