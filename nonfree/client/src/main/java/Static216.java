import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	public static int anInt4467;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "[I")
	public static final int[] anIntArray200 = new int[50];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!fm;II)V")
	public static void method4032(@OriginalArg(0) Class15_Sub3_Sub3_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static62.anInt1184 < arg0.anInt4008) {
			Static277.method9742(arg0);
		} else if (Static62.anInt1184 > arg0.anInt3982) {
			Static129.method2324(false, arg0);
			local7 = Static670.anInt7886;
			local9 = Static553.anInt9679;
		} else {
			Static138.method2437(arg0);
		}
		@Pc(123) int local123;
		if (arg0.anInt11022 < 512 || arg0.anInt11024 < 512 || arg0.anInt11022 >= Static222.anInt4533 * 512 - 512 || arg0.anInt11024 >= Static668.anInt11370 * 512 - 512) {
			arg0.anIntArray184 = null;
			local7 = -1;
			local9 = 0;
			arg0.anInt3982 = 0;
			arg0.anInt4008 = 0;
			arg0.anInt3985 = -1;
			arg0.anInt11022 = arg0.anIntArray189[0] * 512 + arg0.method3690() * 256;
			arg0.anInt11024 = arg0.anIntArray188[0] * 512 + arg0.method3690() * 256;
			arg0.method3675();
			for (local123 = 0; local123 < arg0.aClass358Array3.length; local123++) {
				arg0.aClass358Array3[local123].anInt10525 = -1;
			}
		}
		if (arg0 == Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 && (arg0.anInt11022 < 6144 || arg0.anInt11024 < 6144 || arg0.anInt11022 >= Static222.anInt4533 * 512 - 6144 || arg0.anInt11024 >= Static668.anInt11370 * 512 - 6144)) {
			local9 = 0;
			arg0.anInt4008 = 0;
			arg0.anInt3982 = 0;
			local7 = -1;
			arg0.anIntArray184 = null;
			arg0.anInt3985 = -1;
			arg0.anInt11022 = arg0.anIntArray189[0] * 512 + arg0.method3690() * 256;
			arg0.anInt11024 = arg0.anIntArray188[0] * 512 + arg0.method3690() * 256;
			arg0.method3675();
			for (local123 = 0; local123 < arg0.aClass358Array3.length; local123++) {
				arg0.aClass358Array3[local123].anInt10525 = -1;
			}
		}
		local123 = Static666.method9729(arg0);
		Static544.method8345(arg0);
		Static140.method7797(local9, arg0, local7, local123);
		Static629.method9337(arg0, local7);
		Static112.method1976(arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I")
	public static int method4033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local14 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local14 * arg0;
		} else {
			return local14;
		}
	}
}
