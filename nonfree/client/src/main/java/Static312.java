import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIII)V")
	public static void method4642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static182.method3571(arg3);
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg3 - arg0;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(27) int local27 = arg3;
		@Pc(30) int local30 = -arg3;
		@Pc(32) int local32 = local18;
		@Pc(35) int local35 = -local18;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		@Pc(43) int[] local43 = Static15.anIntArrayArray1[arg5];
		@Pc(48) int local48 = arg1 - local18;
		Static315.method4662(local48, local43, arg1 - arg3, arg4);
		@Pc(62) int local62 = arg1 + local18;
		Static315.method4662(local62, local43, local48, arg2);
		Static315.method4662(arg1 + arg3, local43, local62, arg4);
		while (local27 > local14) {
			local39 += 2;
			local37 += 2;
			local35 += local39;
			local30 += local37;
			if (local35 >= 0 && local32 >= 1) {
				Static262.anIntArray891[local32] = local14;
				local32--;
				local35 -= local32 << 1;
			}
			local14++;
			@Pc(132) int[] local132;
			@Pc(138) int[] local138;
			@Pc(142) int local142;
			@Pc(146) int local146;
			@Pc(185) int local185;
			@Pc(190) int local190;
			@Pc(194) int local194;
			if (local30 >= 0) {
				local27--;
				local30 -= local27 << 1;
				if (local27 >= local18) {
					local132 = Static15.anIntArrayArray1[local27 + arg5];
					local138 = Static15.anIntArrayArray1[arg5 - local27];
					local142 = arg1 + local14;
					local146 = arg1 - local14;
					Static315.method4662(local142, local132, local146, arg4);
					Static315.method4662(local142, local138, local146, arg4);
				} else {
					local132 = Static15.anIntArrayArray1[arg5 + local27];
					local138 = Static15.anIntArrayArray1[arg5 - local27];
					local142 = Static262.anIntArray891[local27];
					local146 = local14 + arg1;
					local185 = arg1 - local14;
					local190 = arg1 + local142;
					local194 = arg1 - local142;
					Static315.method4662(local194, local132, local185, arg4);
					Static315.method4662(local190, local132, local194, arg2);
					Static315.method4662(local146, local132, local190, arg4);
					Static315.method4662(local194, local138, local185, arg4);
					Static315.method4662(local190, local138, local194, arg2);
					Static315.method4662(local146, local138, local190, arg4);
				}
			}
			local132 = Static15.anIntArrayArray1[local14 + arg5];
			local138 = Static15.anIntArrayArray1[arg5 - local14];
			local142 = local27 + arg1;
			local146 = arg1 - local27;
			if (local14 < local18) {
				local185 = local32 >= local14 ? local32 : Static262.anIntArray891[local14];
				local190 = local185 + arg1;
				local194 = arg1 - local185;
				Static315.method4662(local194, local132, local146, arg4);
				Static315.method4662(local190, local132, local194, arg2);
				Static315.method4662(local142, local132, local190, arg4);
				Static315.method4662(local194, local138, local146, arg4);
				Static315.method4662(local190, local138, local194, arg2);
				Static315.method4662(local142, local138, local190, arg4);
			} else {
				Static315.method4662(local142, local132, local146, arg4);
				Static315.method4662(local142, local138, local146, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V")
	public static void method4643(@OriginalArg(1) int arg0) {
		Static359.anInt6026 = arg0;
		Static241.aClass160_37.method3595();
	}
}
