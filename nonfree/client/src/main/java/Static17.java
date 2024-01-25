import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public static int anInt271;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_4 = new Class130();

	@OriginalMember(owner = "client!al", name = "e", descriptor = "[I")
	public static final int[] anIntArray31 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!al", name = "g", descriptor = "I")
	public static int anInt272 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIILclient!da;I)Lclient!bm;")
	public static Class29 method292(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class57 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class29(arg3, arg1, arg0, arg2.K(), arg2.KA(), arg2.l(), arg2.J(), arg2.H(), arg2.OA(), arg2.za());
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Lclient!mu;")
	public static Class3_Sub34 method293() {
		@Pc(6) Class3_Sub34 local6 = Static592.method7786();
		local6.anInt6003 = 0;
		local6.aClass298_129 = null;
		local6.aClass3_Sub11_Sub1_2 = new Class3_Sub11_Sub1(5000);
		return local6;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
	public static void method295() {
		Static31.aClass305_1.method6567();
		Static545.aClass201_5.method4718();
		Static107.aClass352_2.method7547();
		Static476.aClass69_5.method2183();
		Static510.aClass284_2.method6282();
		Static517.aClass145_1.method3794();
		Static330.aClass279_2.method6219();
		Static547.aClass248_2.method5707();
		Static165.aClass212_1.method5097();
		Static157.aClass195_1.method4543();
		Static363.aClass135_1.method3666();
		Static191.aClass168_2.method4067();
		Static453.aClass348_3.method7406();
		Static69.aClass118_1.method3020();
		Static268.aClass79_1.method2480();
		Static257.aClass182_1.method4393();
		Static125.aClass349_1.method7440();
		Static483.aClass2_1.method15();
		Static172.aClass219_1.method5177();
		Static405.aClass71_1.method2255();
		Static465.method6457();
		Static568.method7555();
		Static74.method1680();
		Static89.method2016();
		Static460.method6380();
		Static421.aClass10_45.method258(5);
		Static582.aClass10_67.method258(5);
		Static209.aClass10_58.method258(5);
		Static450.aClass10_48.method258(5);
		Static149.aClass10_14.method258(5);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIBI)V")
	public static void method296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static269.method4385(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg3;
		@Pc(27) int local27 = -arg3;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(41) int local41 = -1;
		@Pc(64) int local64;
		@Pc(72) int local72;
		@Pc(80) int local80;
		@Pc(88) int local88;
		if (arg1 >= Static385.anInt6630 && Static69.anInt1918 >= arg1) {
			@Pc(55) int[] local55 = Static176.anIntArrayArray28[arg1];
			local64 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 - arg3);
			local72 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 + arg3);
			local80 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 - local15);
			local88 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 + local15);
			Static337.method5150(local80, arg2, local64, local55);
			Static337.method5150(local88, arg4, local80, local55);
			Static337.method5150(local72, arg2, local88, local55);
		}
		while (local24 > local10) {
			local34 += 2;
			local41 += 2;
			local32 += local41;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				Static478.anIntArray602[local29] = local10;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(200) int local200;
			@Pc(208) int local208;
			@Pc(219) int[] local219;
			@Pc(154) int local154;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local154 = arg1 - local24;
				local64 = local24 + arg1;
				if (Static385.anInt6630 <= local64 && Static69.anInt1918 >= local154) {
					if (local15 > local24) {
						local72 = Static478.anIntArray602[local24];
						local80 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 + local10);
						local88 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 - local10);
						local200 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, local72 + arg0);
						local208 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 - local72);
						if (Static69.anInt1918 >= local64) {
							local219 = Static176.anIntArrayArray28[local64];
							Static337.method5150(local208, arg2, local88, local219);
							Static337.method5150(local200, arg4, local208, local219);
							Static337.method5150(local80, arg2, local200, local219);
						}
						if (local154 >= Static385.anInt6630) {
							local219 = Static176.anIntArrayArray28[local154];
							Static337.method5150(local208, arg2, local88, local219);
							Static337.method5150(local200, arg4, local208, local219);
							Static337.method5150(local80, arg2, local200, local219);
						}
					} else {
						local72 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, local10 + arg0);
						local80 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 - local10);
						if (local64 <= Static69.anInt1918) {
							Static337.method5150(local72, arg2, local80, Static176.anIntArrayArray28[local64]);
						}
						if (Static385.anInt6630 <= local154) {
							Static337.method5150(local72, arg2, local80, Static176.anIntArrayArray28[local154]);
						}
					}
				}
			}
			local154 = arg1 - local10;
			local64 = arg1 + local10;
			if (local64 >= Static385.anInt6630 && Static69.anInt1918 >= local154) {
				local72 = local24 + arg0;
				local80 = arg0 - local24;
				if (Static110.anInt2597 <= local72 && Static459.anInt7524 >= local80) {
					local72 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, local72);
					local80 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, local80);
					if (local10 >= local15) {
						if (Static69.anInt1918 >= local64) {
							Static337.method5150(local72, arg2, local80, Static176.anIntArrayArray28[local64]);
						}
						if (local154 >= Static385.anInt6630) {
							Static337.method5150(local72, arg2, local80, Static176.anIntArrayArray28[local154]);
						}
					} else {
						local88 = local10 > local29 ? Static478.anIntArray602[local10] : local29;
						local200 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, local88 + arg0);
						local208 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 - local88);
						if (local64 <= Static69.anInt1918) {
							local219 = Static176.anIntArrayArray28[local64];
							Static337.method5150(local208, arg2, local80, local219);
							Static337.method5150(local200, arg4, local208, local219);
							Static337.method5150(local72, arg2, local200, local219);
						}
						if (local154 >= Static385.anInt6630) {
							local219 = Static176.anIntArrayArray28[local154];
							Static337.method5150(local208, arg2, local80, local219);
							Static337.method5150(local200, arg4, local208, local219);
							Static337.method5150(local72, arg2, local200, local219);
						}
					}
				}
			}
		}
	}
}
