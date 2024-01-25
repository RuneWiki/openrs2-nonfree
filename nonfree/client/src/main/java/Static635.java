import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "[Lclient!ak;")
	public static Class17[] aClass17Array3;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "[Lclient!fl;")
	public static final Class103[] aClass103Array3 = new Class103[16];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBI[Ljava/lang/Object;[I)V")
	public static void method8384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) int local16 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local16;
		@Pc(30) Object local30 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local30;
		@Pc(49) int local49 = ~local16 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg0; local51 < arg1; local51++) {
			if ((local49 & local51) + local16 > arg3[local51]) {
				@Pc(70) int local70 = arg3[local51];
				arg3[local51] = arg3[local12];
				arg3[local12] = local70;
				@Pc(84) Object local84 = arg2[local51];
				arg2[local51] = arg2[local12];
				arg2[local12++] = local84;
			}
		}
		arg3[arg1] = arg3[local12];
		arg3[local12] = local16;
		arg2[arg1] = arg2[local12];
		arg2[local12] = local30;
		method8384(arg0, local12 - 1, arg2, arg3);
		method8384(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method8386(@OriginalArg(0) Class6_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static195.aClass199Array1 != Static510.aClass199Array3) {
			@Pc(12) int local12 = Static228.aClass199Array2[arg1].method8531(arg3, arg2);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class199 local19 = Static228.aClass199Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8531(arg3, arg2);
					if (arg4 != null) {
						arg4[local14] = local19.method8527(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)Lclient!ffa;")
	public static Class97 method8388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static272.aClass97ArrayArrayArray3[0][arg1][arg2] != null && Static272.aClass97ArrayArrayArray3[0][arg1][arg2].aClass97_1 != null;
			if (local28 && arg0 >= Static535.anInt9275 - 1) {
				return null;
			}
			Static174.method3210(arg0, arg1, arg2);
		}
		return Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!vd;ILclient!vd;Lclient!vd;Lclient!vd;)V")
	public static void method8389(@OriginalArg(0) Class353 arg0, @OriginalArg(2) Class353 arg1, @OriginalArg(3) Class353 arg2, @OriginalArg(4) Class353 arg3) {
		Static565.aClass353_119 = arg2;
		Static603.aClass353_129 = arg1;
		Static251.aClass353_46 = arg3;
		Static605.aClass302ArrayArray4 = new Class302[Static603.aClass353_129.method8415()][];
		Static627.aBooleanArray59 = new boolean[Static603.aClass353_129.method8415()];
	}
}
