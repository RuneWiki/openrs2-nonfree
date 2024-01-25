import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "Lclient!rca;")
	public static Class298 aClass298_1;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	public static int anInt7492 = 0;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "[I")
	public static final int[] anIntArray405 = new int[250];

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIZIIII)V")
	public static void method6637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static234.method3908(arg0);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg0;
		@Pc(23) int local23 = -arg0;
		@Pc(25) int local25 = local14;
		@Pc(39) int local39 = -local14;
		@Pc(41) int local41 = -1;
		@Pc(43) int local43 = -1;
		@Pc(47) int[] local47 = Static249.anIntArrayArray23[arg1];
		@Pc(51) int local51 = arg5 - local14;
		@Pc(55) int local55 = local14 + arg5;
		Static491.method7219(local47, arg5 - arg0, arg3, local51);
		Static491.method7219(local47, local51, arg4, local55);
		Static491.method7219(local47, local55, arg3, arg5 + arg0);
		while (local20 > local10) {
			local41 += 2;
			local43 += 2;
			local23 += local41;
			local39 += local43;
			if (local39 >= 0 && local25 >= 1) {
				Static443.anIntArray408[local25] = local10;
				local25--;
				local39 -= local25 << 1;
			}
			local10++;
			@Pc(132) int[] local132;
			@Pc(138) int[] local138;
			@Pc(142) int local142;
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(154) int local154;
			@Pc(159) int local159;
			if (local23 >= 0) {
				local20--;
				if (local14 > local20) {
					local132 = Static249.anIntArrayArray23[local20 + arg1];
					local138 = Static249.anIntArrayArray23[arg1 - local20];
					local142 = Static443.anIntArray408[local20];
					local146 = local10 + arg5;
					local150 = arg5 - local10;
					local154 = arg5 + local142;
					local159 = arg5 - local142;
					Static491.method7219(local132, local150, arg3, local159);
					Static491.method7219(local132, local159, arg4, local154);
					Static491.method7219(local132, local154, arg3, local146);
					Static491.method7219(local138, local150, arg3, local159);
					Static491.method7219(local138, local159, arg4, local154);
					Static491.method7219(local138, local154, arg3, local146);
				} else {
					local132 = Static249.anIntArrayArray23[local20 + arg1];
					local138 = Static249.anIntArrayArray23[arg1 - local20];
					local142 = local10 + arg5;
					local146 = arg5 - local10;
					Static491.method7219(local132, local146, arg3, local142);
					Static491.method7219(local138, local146, arg3, local142);
				}
				local23 -= local20 << 1;
			}
			local132 = Static249.anIntArrayArray23[local10 + arg1];
			local138 = Static249.anIntArrayArray23[arg1 - local10];
			local142 = local20 + arg5;
			local146 = arg5 - local20;
			if (local14 <= local10) {
				Static491.method7219(local132, local146, arg3, local142);
				Static491.method7219(local138, local146, arg3, local142);
			} else {
				local150 = local25 >= local10 ? local25 : Static443.anIntArray408[local10];
				local154 = arg5 + local150;
				local159 = arg5 - local150;
				Static491.method7219(local132, local146, arg3, local159);
				Static491.method7219(local132, local159, arg4, local154);
				Static491.method7219(local132, local154, arg3, local142);
				Static491.method7219(local138, local146, arg3, local159);
				Static491.method7219(local138, local159, arg4, local154);
				Static491.method7219(local138, local154, arg3, local142);
			}
		}
	}
}
