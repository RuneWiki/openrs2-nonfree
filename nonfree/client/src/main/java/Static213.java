import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!pk", name = "J", descriptor = "[Z")
	public static boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "[[Lclient!bl;")
	public static Class4_Sub8[][] aClass4_Sub8ArrayArray2;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "Lclient!cg;")
	public static Class22 aClass22_71;

	@OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
	public static int anInt4149 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIZ)V")
	public static void method3346(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static246.anInt4853 = 104;
		Static64.anInt1393 = 104;
		Static133.anInt2661 = arg0;
		Static75.aClass4_Sub21ArrayArrayArray1 = new Class4_Sub21[4][Static246.anInt4853][Static64.anInt1393];
		Static230.anIntArrayArrayArray12 = new int[4][Static246.anInt4853 + 1][Static64.anInt1393 + 1];
		if (Static251.aBoolean330) {
			aClass4_Sub8ArrayArray2 = new Class4_Sub8[4][];
		}
		if (arg1) {
			Static199.aClass4_Sub21ArrayArrayArray3 = new Class4_Sub21[1][Static246.anInt4853][Static64.anInt1393];
			Static149.anIntArrayArray17 = new int[Static246.anInt4853][Static64.anInt1393];
			Static127.anIntArrayArrayArray3 = new int[1][Static246.anInt4853 + 1][Static64.anInt1393 + 1];
			if (Static251.aBoolean330) {
				Static244.aClass4_Sub8ArrayArray3 = new Class4_Sub8[1][];
			}
		} else {
			Static199.aClass4_Sub21ArrayArrayArray3 = null;
			Static149.anIntArrayArray17 = null;
			Static127.anIntArrayArrayArray3 = null;
			Static244.aClass4_Sub8ArrayArray3 = null;
		}
		Static158.method2543(false);
		Static309.aClass75Array2 = new Class75[500];
		Static287.anInt5606 = 0;
		Static280.aClass75Array3 = new Class75[500];
		Static153.anInt3108 = 0;
		Static168.anIntArrayArrayArray8 = new int[4][Static246.anInt4853 + 1][Static64.anInt1393 + 1];
		Static181.aClass99Array36 = new Class99[5000];
		Static69.anInt1421 = 0;
		Static102.aClass99Array13 = new Class99[100];
		Static202.aBooleanArrayArray4 = new boolean[Static133.anInt2661 + Static133.anInt2661 + 1][Static133.anInt2661 + Static133.anInt2661 + 1];
		Static15.aBooleanArrayArray1 = new boolean[Static133.anInt2661 + Static133.anInt2661 + 2][Static133.anInt2661 + Static133.anInt2661 + 2];
		Static98.aByteArrayArrayArray6 = new byte[4][Static246.anInt4853][Static64.anInt1393];
	}

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)V")
	public static void method3348() {
		for (@Pc(10) Class4_Sub26 local10 = (Class4_Sub26) Static80.aClass17_11.method613(); local10 != null; local10 = (Class4_Sub26) Static80.aClass17_11.method607()) {
			if (local10.aBoolean242) {
				local10.method3178();
			}
		}
		for (@Pc(40) Class4_Sub26 local40 = (Class4_Sub26) Static17.aClass17_2.method613(); local40 != null; local40 = (Class4_Sub26) Static17.aClass17_2.method607()) {
			if (local40.aBoolean242) {
				local40.method3178();
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZIIIIIII)V")
	public static void method3349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = arg1 - arg7;
		@Pc(19) int local19 = arg5 - arg8;
		@Pc(28) int local28 = (arg3 - arg4 << 16) / local15;
		@Pc(36) int local36 = (arg0 - arg6 << 16) / local19;
		Static149.method2345(local28, local36, arg5, arg6, arg2, arg4, arg1, arg7, arg8);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!u;III)V")
	public static void method3350(@OriginalArg(0) Class13_Sub5_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt5305 == arg2 && arg2 != -1) {
			@Pc(83) Class186 local83 = Static51.method992(arg2);
			@Pc(86) int local86 = local83.anInt5814;
			if (local86 == 1) {
				arg0.anInt5251 = arg1;
				arg0.anInt5309 = 0;
				arg0.anInt5333 = 0;
				arg0.anInt5247 = 1;
				arg0.anInt5249 = 0;
				Static229.method3598(false, arg0.anInt5294, local83, arg0.anInt5334, arg0.anInt5249);
			}
			if (local86 == 2) {
				arg0.anInt5309 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt5305 == -1 || Static51.method992(arg2).anInt5807 >= Static51.method992(arg0.anInt5305).anInt5807) {
			arg0.anInt5249 = 0;
			arg0.anInt5305 = arg2;
			arg0.anInt5309 = 0;
			arg0.anInt5251 = arg1;
			arg0.anInt5247 = 1;
			arg0.anInt5333 = 0;
			arg0.anInt5316 = arg0.anInt5271;
			if (arg0.anInt5305 != -1) {
				Static229.method3598(false, arg0.anInt5294, Static51.method992(arg0.anInt5305), arg0.anInt5334, arg0.anInt5249);
			}
		}
	}
}
