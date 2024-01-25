import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
	public static int anInt7772;

	@OriginalMember(owner = "client!ro", name = "G", descriptor = "I")
	public static int anInt7776;

	@OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
	public static int anInt7775 = 0;

	@OriginalMember(owner = "client!ro", name = "P", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_84 = new Class303(58, 7);

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(II)V")
	public static void method6466(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(1, arg0);
		local8.method7329();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg2 && arg1 == arg4 && arg7 == arg8 && arg5 == arg0) {
			Static463.method6425(arg3, arg5, arg4, arg2, arg7);
			return;
		}
		@Pc(41) int local41 = arg2;
		@Pc(43) int local43 = arg4;
		@Pc(47) int local47 = arg2 * 3;
		@Pc(51) int local51 = arg4 * 3;
		@Pc(55) int local55 = arg6 * 3;
		@Pc(59) int local59 = arg1 * 3;
		@Pc(63) int local63 = arg8 * 3;
		@Pc(67) int local67 = arg0 * 3;
		@Pc(77) int local77 = local55 + arg7 - arg2 - local63;
		@Pc(88) int local88 = arg5 + local59 - arg4 - local67;
		@Pc(97) int local97 = local63 + local47 - local55 - local55;
		@Pc(108) int local108 = local67 + local51 - local59 - local59;
		@Pc(113) int local113 = local55 - local47;
		@Pc(117) int local117 = local59 - local51;
		for (@Pc(119) int local119 = 128; local119 <= 4096; local119 += 128) {
			@Pc(127) int local127 = local119 * local119 >> 12;
			@Pc(133) int local133 = local127 * local119 >> 12;
			@Pc(137) int local137 = local133 * local77;
			@Pc(141) int local141 = local88 * local133;
			@Pc(145) int local145 = local97 * local127;
			@Pc(149) int local149 = local127 * local108;
			@Pc(153) int local153 = local113 * local119;
			@Pc(157) int local157 = local119 * local117;
			@Pc(167) int local167 = (local153 + local145 + local137 >> 12) + arg2;
			@Pc(178) int local178 = arg4 + (local157 + local149 + local141 >> 12);
			Static463.method6425(arg3, local178, local43, local41, local167);
			local41 = local167;
			local43 = local178;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method6468(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static379.method5534(arg1, arg0, -1, -1);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIILclient!tq;Lclient!tq;)V")
	public static void method6470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class41_Sub2_Sub2 arg3, @OriginalArg(4) Class41_Sub2_Sub2 arg4) {
		@Pc(4) Class299 local4 = Static12.method6301(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass41_Sub2_Sub2_2 = arg3;
		local4.aClass41_Sub2_Sub2_1 = arg4;
		@Pc(19) int local19 = Static68.aClass34Array1 == Static426.aClass34Array5 ? 1 : 0;
		if (!arg3.method7847()) {
			Static533.aClass41_Sub2ArrayArray2[local19][Static505.anIntArray524[local19]++] = arg3;
		} else if (arg3.method7851()) {
			Static548.aClass41_Sub2ArrayArray3[local19][Static462.anIntArray496[local19]++] = arg3;
		} else {
			Static417.aClass41_Sub2ArrayArray1[local19][Static279.anIntArray622[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7847()) {
			if (arg4.method7851()) {
				Static548.aClass41_Sub2ArrayArray3[local19][Static462.anIntArray496[local19]++] = arg4;
				return;
			}
			Static417.aClass41_Sub2ArrayArray1[local19][Static279.anIntArray622[local19]++] = arg4;
			return;
		}
		Static533.aClass41_Sub2ArrayArray2[local19][Static505.anIntArray524[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIBI)Lclient!sp;")
	public static Class41_Sub2_Sub1_Sub4 method6471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class299 local16 = Static309.aClass299ArrayArrayArray3[arg1][arg0][arg2];
		if (local16 == null) {
			return null;
		}
		@Pc(22) Class41_Sub2_Sub1_Sub4 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class38 local27 = local16.aClass38_2; local27 != null; local27 = local27.aClass38_1) {
			@Pc(31) Class41_Sub2_Sub1 local31 = local27.aClass41_Sub2_Sub1_1;
			if (local31 instanceof Class41_Sub2_Sub1_Sub4) {
				@Pc(37) Class41_Sub2_Sub1_Sub4 local37 = (Class41_Sub2_Sub1_Sub4) local31;
				@Pc(47) int local47 = local37.method7858() * 256 + 252 - 256;
				@Pc(55) int local55 = local37.anInt9444 - local47 >> 9;
				@Pc(62) int local62 = local37.anInt9442 - local47 >> 9;
				@Pc(69) int local69 = local37.anInt9444 + local47 >> 9;
				@Pc(76) int local76 = local47 + local37.anInt9442 >> 9;
				if (arg0 >= local55 && arg2 >= local62 && local69 >= arg0 && arg2 <= local76) {
					@Pc(117) int local117 = (local76 + 1 - arg2) * (local69 + 1 + -arg0);
					if (local117 > local24) {
						local22 = local37;
						local24 = local117;
					}
				}
			}
		}
		return local22;
	}
}
