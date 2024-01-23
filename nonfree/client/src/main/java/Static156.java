import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Lclient!ug;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_3;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
	public static int anInt3577;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "Lclient!ml;")
	public static Class1_Sub2_Sub16 aClass1_Sub2_Sub16_3;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "Lclient!ol;")
	public static Class117 aClass117_13 = new Class117(16);

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
	public static int[] anIntArray329 = new int[32];

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString105 = "flash1:";

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method2880(@OriginalArg(2) String arg0, @OriginalArg(3) String arg1, @OriginalArg(4) String arg2) {
		Static120.method2661(arg0, 9, arg2, -1, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	public static void method2881() {
		Static263.aClass155_43.method4362();
		Static200.aClass155_32.method4362();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIIB)I")
	public static int method2882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(8) int local8 = arg0;
			arg0 = arg3;
			arg3 = local8;
		}
		@Pc(25) int local25 = arg4 & 0x3;
		if (local25 == 0) {
			return arg1;
		} else if (local25 == 1) {
			return 7 + 1 - arg2 - arg0;
		} else if (local25 == 2) {
			return 7 + 1 - arg1 - arg3;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	public static void method2883() {
		Static81.aClass1_Sub16_Sub1_1.method2676(98);
		Static81.aClass1_Sub16_Sub1_1.method2621(Static277.method4610());
		Static81.aClass1_Sub16_Sub1_1.method2624(Static193.anInt4370);
		Static81.aClass1_Sub16_Sub1_1.method2624(Static144.anInt3368);
		Static81.aClass1_Sub16_Sub1_1.method2621(Static171.anInt3870);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
	public static void method2885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static102.anInt2239 <= arg0 && arg0 <= Static88.anInt2052) {
			@Pc(20) int local20 = Static223.method941(arg3, Static223.anInt1245, Static152.anInt3532);
			@Pc(26) int local26 = Static223.method941(arg1, Static223.anInt1245, Static152.anInt3532);
			Static227.method3947(local20, local26, arg2, arg0);
		}
	}
}
