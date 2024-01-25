import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	public static int anInt8963;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_298 = new Class288(49, -1);

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public static int anInt8966 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[II[II)V")
	public static void method7513(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local34;
		@Pc(51) int local51 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg3; local53 < arg0; local53++) {
			if (local20 + (local53 & local51) > arg1[local53]) {
				@Pc(73) int local73 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16] = local73;
				@Pc(87) int local87 = arg2[local53];
				arg2[local53] = arg2[local16];
				arg2[local16++] = local87;
			}
		}
		arg1[arg0] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg0] = arg2[local16];
		arg2[local16] = local34;
		method7513(local16 - 1, arg1, arg2, arg3);
		method7513(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(20) int local20 = Static414.method5547(arg2, Static257.anInt4068, Static67.anInt1214);
		@Pc(26) int local26 = Static414.method5547(arg0, Static257.anInt4068, Static67.anInt1214);
		@Pc(32) int local32 = Static414.method5547(arg6, Static379.anInt5914, Static624.anInt10032);
		@Pc(38) int local38 = Static414.method5547(arg5, Static379.anInt5914, Static624.anInt10032);
		@Pc(47) int local47 = Static414.method5547(arg2 + arg3, Static257.anInt4068, Static67.anInt1214);
		@Pc(55) int local55 = Static414.method5547(arg0 - arg3, Static257.anInt4068, Static67.anInt1214);
		for (@Pc(57) int local57 = local20; local57 < local47; local57++) {
			Static134.method1841(Static543.anIntArrayArray57[local57], local32, local38, arg1);
		}
		for (@Pc(77) int local77 = local26; local77 > local55; local77--) {
			Static134.method1841(Static543.anIntArrayArray57[local77], local32, local38, arg1);
		}
		@Pc(104) int local104 = Static414.method5547(arg6 + arg3, Static379.anInt5914, Static624.anInt10032);
		@Pc(112) int local112 = Static414.method5547(arg5 - arg3, Static379.anInt5914, Static624.anInt10032);
		for (@Pc(114) int local114 = local47; local114 <= local55; local114++) {
			@Pc(120) int[] local120 = Static543.anIntArrayArray57[local114];
			Static134.method1841(local120, local32, local104, arg1);
			Static134.method1841(local120, local104, local112, arg4);
			Static134.method1841(local120, local112, local38, arg1);
		}
	}
}
