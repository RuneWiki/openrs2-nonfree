import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "[S")
	public static short[] aShortArray89;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "[I")
	public static int[] anIntArray400 = new int[500];

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "[Lclient!lf;")
	public static Class1_Sub14[] aClass1_Sub14Array1 = new Class1_Sub14[2048];

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public static int anInt4556 = -1;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString270 = "wave:";

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)V")
	public static void method3971() {
		Static13.aClass121_11 = null;
		Static209.anInt3978 = -1;
		Static190.anInt3615 = 1;
		Static111.anInt2293 = 2;
		Static282.anInt5096 = -1;
		Static213.anInt4453 = 0;
		Static168.aBoolean223 = false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg0 && arg3 == arg5 && arg8 == arg1 && arg2 == arg7) {
			Static176.method2946(arg4, arg1, arg7, arg6, arg3);
			return;
		}
		@Pc(23) int local23 = arg6;
		@Pc(27) int local27 = arg6 * 3;
		@Pc(29) int local29 = arg3;
		@Pc(33) int local33 = arg3 * 3;
		@Pc(37) int local37 = arg0 * 3;
		@Pc(41) int local41 = arg5 * 3;
		@Pc(45) int local45 = arg8 * 3;
		@Pc(49) int local49 = arg2 * 3;
		@Pc(59) int local59 = local41 + arg7 - arg3 - local49;
		@Pc(69) int local69 = arg1 + local37 - arg6 - local45;
		@Pc(79) int local79 = local27 + local45 - local37 - local37;
		@Pc(84) int local84 = local41 - local33;
		@Pc(93) int local93 = local49 + local33 - local41 - local41;
		@Pc(98) int local98 = local37 - local27;
		for (@Pc(100) int local100 = 128; local100 <= 4096; local100 += 128) {
			@Pc(109) int local109 = local100 * local100 >> 12;
			@Pc(115) int local115 = local109 * local100 >> 12;
			@Pc(119) int local119 = local59 * local115;
			@Pc(123) int local123 = local93 * local109;
			@Pc(127) int local127 = local69 * local115;
			@Pc(131) int local131 = local79 * local109;
			@Pc(135) int local135 = local84 * local100;
			@Pc(146) int local146 = (local135 + local119 + local123 >> 12) + arg3;
			@Pc(150) int local150 = local100 * local98;
			@Pc(161) int local161 = (local150 + local127 + local131 >> 12) + arg6;
			Static176.method2946(arg4, local161, local146, local23, local29);
			local29 = local146;
			local23 = local161;
		}
	}
}
