import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "f", descriptor = "[Lclient!bi;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!lc;")
	public static Class98 aClass98_1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString1 = "Loading interfaces - ";

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public static int anInt4 = -1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method1() {
		aString1 = null;
		aClass98_1 = null;
		aClass4_Sub2_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg1 && arg5 == arg7 && arg8 == arg3 && arg6 == arg4) {
			Static153.method2444(arg0, arg3, arg1, arg4, arg7);
			return;
		}
		@Pc(19) int local19 = arg1;
		@Pc(23) int local23 = arg2 * 3;
		@Pc(27) int local27 = arg7 * 3;
		@Pc(31) int local31 = arg1 * 3;
		@Pc(33) int local33 = arg7;
		@Pc(37) int local37 = arg5 * 3;
		@Pc(41) int local41 = arg8 * 3;
		@Pc(45) int local45 = arg6 * 3;
		@Pc(55) int local55 = local31 + local41 - local23 - local23;
		@Pc(66) int local66 = arg3 + local23 - arg1 - local41;
		@Pc(76) int local76 = local45 + local27 - local37 - local37;
		@Pc(81) int local81 = local23 - local31;
		@Pc(92) int local92 = arg4 + local37 - arg7 - local45;
		@Pc(97) int local97 = local37 - local27;
		for (@Pc(99) int local99 = 128; local99 <= 4096; local99 += 128) {
			@Pc(110) int local110 = local99 * local99 >> 12;
			@Pc(114) int local114 = local55 * local110;
			@Pc(120) int local120 = local99 * local110 >> 12;
			@Pc(124) int local124 = local76 * local110;
			@Pc(128) int local128 = local66 * local120;
			@Pc(132) int local132 = local92 * local120;
			@Pc(136) int local136 = local99 * local97;
			@Pc(140) int local140 = local99 * local81;
			@Pc(152) int local152 = arg7 + (local132 + local124 + local136 >> 12);
			@Pc(162) int local162 = (local140 + local114 + local128 >> 12) + arg1;
			Static153.method2444(arg0, local162, local19, local152, local33);
			local33 = local152;
			local19 = local162;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIILclient!g;II)V")
	public static void method5(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12_Sub3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static134.method2174(arg2, arg1, arg3.anInt4113, arg5, arg3.anInt4141, arg0, arg4);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLclient!hc;II)V")
	public static void method8(@OriginalArg(1) Class12_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0.anInt4178 && arg1 != -1) {
			@Pc(19) Class141 local19 = Static296.method1376(arg1);
			@Pc(22) int local22 = local19.anInt4349;
			if (local22 == 1) {
				arg0.anInt4120 = 0;
				arg0.anInt4152 = 1;
				arg0.anInt4119 = arg2;
				arg0.anInt4170 = 0;
				arg0.anInt4112 = 0;
				Static11.method188(false, local19, arg0.anInt4141, arg0.anInt4113, arg0.anInt4170);
			}
			if (local22 == 2) {
				arg0.anInt4112 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt4178 == -1 || Static296.method1376(arg1).anInt4358 >= Static296.method1376(arg0.anInt4178).anInt4358) {
			arg0.anInt4119 = arg2;
			arg0.anInt4170 = 0;
			arg0.anInt4152 = 1;
			arg0.anInt4189 = arg0.anInt4157;
			arg0.anInt4112 = 0;
			arg0.anInt4178 = arg1;
			arg0.anInt4120 = 0;
			if (arg0.anInt4178 != -1) {
				Static11.method188(false, Static296.method1376(arg0.anInt4178), arg0.anInt4141, arg0.anInt4113, arg0.anInt4170);
			}
		}
	}
}
