import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3 aClass3_Sub2_Sub3_Sub3_43;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "[I")
	public static int[] anIntArray440 = new int[25];

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1426 = Static65.method1172("skill)2");

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1424 = aClass46_1426;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1425 = Static65.method1172("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
	public static int anInt3963 = 1;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
	public static void method2887() {
		aClass46_1424 = null;
		aClass3_Sub2_Sub3_Sub3_43 = null;
		aClass46_1425 = null;
		aClass46_1426 = null;
		anIntArray440 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!tg;)V")
	public static void method2888(@OriginalArg(1) Class3_Sub24 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt3516 == 0) {
			local5 = Static154.aClass62_1.method2008(arg0.anInt3523, arg0.anInt3513, arg0.anInt3514);
		}
		if (arg0.anInt3516 == 1) {
			local5 = Static154.aClass62_1.method1980(arg0.anInt3523, arg0.anInt3513, arg0.anInt3514);
		}
		if (arg0.anInt3516 == 2) {
			local5 = Static154.aClass62_1.method1996(arg0.anInt3523, arg0.anInt3513, arg0.anInt3514);
		}
		if (arg0.anInt3516 == 3) {
			local5 = Static154.aClass62_1.method1973(arg0.anInt3523, arg0.anInt3513, arg0.anInt3514);
		}
		@Pc(65) int local65 = 0;
		if (local5 != 0) {
			@Pc(80) int local80 = Static154.aClass62_1.method1967(arg0.anInt3523, arg0.anInt3513, arg0.anInt3514, local5);
			local65 = local80 >> 6 & 0x3;
			local7 = local5 >> 14 & 0x7FFF;
			local9 = local80 & 0x1F;
		}
		arg0.anInt3518 = local7;
		arg0.anInt3517 = local9;
		arg0.anInt3510 = local65;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
	public static void method2889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static33.anInt920 = -1;
			Static24.anInt561 = -1;
			return;
		}
		@Pc(37) int local37 = Static168.method2689(arg0, arg2, Static99.anInt2422) - arg1;
		@Pc(41) int local41 = local37 - Static94.anInt2298;
		@Pc(45) int local45 = arg2 - Static134.anInt3130;
		@Pc(49) int local49 = arg0 - Static70.anInt1833;
		@Pc(53) int local53 = Class3_Sub2_Sub3_Sub4.anIntArray347[Static163.anInt3624];
		@Pc(61) int local61 = Class3_Sub2_Sub3_Sub4.anIntArray346[Static124.anInt2967];
		@Pc(65) int local65 = Class3_Sub2_Sub3_Sub4.anIntArray347[Static124.anInt2967];
		@Pc(75) int local75 = local45 * local61 + local65 * local49 >> 16;
		@Pc(86) int local86 = local49 * local61 - local65 * local45 >> 16;
		@Pc(90) int local90 = Class3_Sub2_Sub3_Sub4.anIntArray346[Static163.anInt3624];
		@Pc(92) int local92 = local75;
		@Pc(102) int local102 = local41 * local90 - local86 * local53 >> 16;
		@Pc(112) int local112 = local90 * local86 + local41 * local53 >> 16;
		if (local112 >= 50) {
			Static33.anInt920 = (local102 << 9) / local112 + 167;
			Static24.anInt561 = (local92 << 9) / local112 + 256;
		} else {
			Static33.anInt920 = -1;
			Static24.anInt561 = -1;
		}
	}
}
