import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt6551;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
	public static final int[] anIntArray457 = new int[1000];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!du;Lclient!j;ILclient!qa;ILclient!ao;II)V")
	public static void method5482(@OriginalArg(0) Class12_Sub12 arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(3) Class42 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class17 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg0.anInt2335 - arg5 / 2 - 5;
		@Pc(19) int local19 = arg3 + 2;
		if (arg1.anInt4733 != 0) {
			arg2.method5866(local19, arg5 + 10, -local19 + arg4.method423() * arg6 + (arg3 - -1), arg1.anInt4733, local15);
		}
		if (arg1.anInt4749 != 0) {
			arg2.method5811(arg1.anInt4749, arg5 + 10, arg4.method423() * arg6 + 1 + (arg3 - local19), local15, local19);
		}
		@Pc(69) int local69 = arg1.anInt4730;
		if (arg0.aBoolean197 && arg1.anInt4754 != -1) {
			local69 = arg1.anInt4754;
		}
		for (@Pc(82) int local82 = 0; local82 < arg6; local82++) {
			@Pc(88) String local88 = Static141.aStringArray18[local82];
			if (arg6 - 1 > local82) {
				local88 = local88.substring(0, local88.length() - 4);
			}
			arg4.method427(arg2, local88, arg0.anInt2335, arg3, local69);
			arg3 += arg4.method423();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public static void method5483() {
		Static464.aClass220_6.method5380();
		Static73.aClass47_2.method1421();
		Static274.aClass78_1.method2175();
		Static49.aClass155_2.method4066();
		Static161.aClass110_3.method3024();
		Static150.aClass254_2.method6338();
		Static47.aClass41_1.method912();
		Static82.aClass212_2.method5061();
		Static64.aClass296_10.method7292();
		Static367.aClass146_1.method3864();
		Static218.aClass160_1.method4124();
		Static149.aClass292_2.method7216();
		Static293.aClass93_8.method2478();
		Static139.aClass106_1.method2874();
		Static453.aClass258_2.method6429();
		Static114.aClass252_1.method6263();
		Static496.aClass60_3.method1678();
		Static367.aClass156_1.method4106();
		Static317.aClass148_1.method3976();
		Static285.aClass172_1.method4377();
		Static397.method6234();
		Static247.method4253();
		Static267.method4552();
		Static161.method3997();
		Static316.aClass125_45.method3442();
		Static420.aClass125_58.method3442();
		Static355.aClass125_51.method3442();
		Static197.aClass125_23.method3442();
		Static312.aClass125_44.method3442();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Z")
	public static boolean method5484(@OriginalArg(0) int arg0) {
		if (arg0 == 59 || arg0 == 57 || arg0 == 22 || arg0 == 10 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 58 || arg0 == 1008;
		}
	}
}
