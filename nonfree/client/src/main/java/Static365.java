import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!se", name = "l", descriptor = "I")
	public static int anInt3059 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
	public static int method2559(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZII)V")
	public static void method2560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg1 * Static361.aClass85_Sub1_1.anInt2496 >> 8;
		if (arg2 == -1 && !Static290.aBoolean344) {
			Static193.method3059();
		} else if (arg2 != -1 && (arg2 != Static151.anInt3107 || !Static133.method2301()) && local18 != 0 && !Static290.aBoolean344) {
			Static449.method5991(Static43.aClass187_11, arg2, arg0, local18);
		}
		Static151.anInt3107 = arg2;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method2561() {
		Static173.aClass43_5.method1037();
		Static297.aClass207_5.method4751();
		Static8.aClass100_1.method2414();
		Static342.aClass237_4.method5208();
		Static448.aClass38_4.method862();
		Static313.aClass272_2.method6065();
		Static281.aClass98_3.method2404();
		Static147.aClass107_1.method2642();
		Static189.aClass112_1.method2695();
		Static82.aClass271_1.method6054();
		Static133.aClass223_1.method4949();
		Static228.aClass2_4.method9();
		Static300.aClass88_3.method2269();
		Static116.aClass144_1.method3296();
		Static376.aClass204_1.method4530();
		Static88.aClass47_2.method1075();
		Static314.aClass158_1.method3481();
		Static120.aClass128_1.method3043();
		Static400.aClass165_1.method3685();
		Static394.aClass48_1.method1081();
		Static77.method1476();
		Static134.method2305();
		Static69.method1356();
		if (Static284.aClass151_8 != Static110.aClass151_5) {
			for (@Pc(84) int local84 = 0; local84 < Static294.aByteArrayArray50.length; local84++) {
				Static294.aByteArrayArray50[local84] = null;
			}
			Static332.anInt5638 = 0;
		}
		Static225.method5951();
		Static75.method3764();
		Static290.method4080();
		Static62.method1047();
		Static349.method4743();
		Static79.aClass267_14.method6011();
		Static412.aClass50_8.method5844();
		Static99.aClass52_1.method1348();
		Static19.method278();
		Static341.aClass187_103.method4285();
		Static166.aClass187_66.method4285();
		Static255.aClass187_81.method4285();
		Static347.aClass187_106.method4285();
		Static343.aClass187_105.method4285();
		Static77.aClass187_32.method4285();
		Static43.aClass187_11.method4285();
		Static3.aClass187_76.method4285();
		Static21.aClass187_8.method4285();
		Static16.aClass187_6.method4285();
		Static322.aClass187_95.method4285();
		Static265.aClass187_83.method4285();
		Static157.aClass187_63.method4285();
		Static326.aClass187_99.method4285();
		Static203.aClass187_72.method4285();
		Static131.aClass187_53.method4285();
		Static87.aClass187_36.method4285();
		Static85.aClass187_137.method4285();
		Static436.aClass187_126.method4285();
		Static297.aClass187_90.method4285();
		Static63.aClass187_21.method4285();
		Static339.aClass187_102.method4285();
		Static74.aClass187_30.method4285();
		Static251.aClass187_110.method4285();
		Static265.aClass187_82.method4285();
		Static393.aClass187_116.method4285();
		Static105.aClass187_43.method4285();
		Static39.aClass187_10.method4285();
		Static144.aClass187_59.method4285();
		Static127.aClass187_50.method4285();
		Static209.aClass267_36.method6011();
		Static152.aClass267_27.method6011();
		Static359.aClass267_64.method6011();
		Static432.aClass267_82.method6011();
	}
}
