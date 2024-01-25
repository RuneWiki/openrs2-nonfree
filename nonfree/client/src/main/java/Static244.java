import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_176 = new Class198(16);

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
	public static int anInt4894 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lclient!vj;B)V")
	public static void method4312(@OriginalArg(0) Class58[] arg0) {
		Static6.anInt179 = arg0.length;
		Static312.anIntArray475 = new int[Static6.anInt179 + 10];
		Static225.aClass58Array87 = new Class58[Static6.anInt179 + 10];
		Static359.method760(arg0, 0, Static225.aClass58Array87, 0, Static6.anInt179);
		for (@Pc(26) int local26 = 0; local26 < Static6.anInt179; local26++) {
			Static312.anIntArray475[local26] = Static225.aClass58Array87[local26].method4286();
		}
		for (@Pc(51) int local51 = Static6.anInt179; local51 < Static225.aClass58Array87.length; local51++) {
			Static312.anIntArray475[local51] = 12;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([II[Ljava/lang/Object;IB)V")
	public static void method4313(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg3) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) int local29 = arg0[local23];
		arg0[local23] = arg0[arg3];
		arg0[arg3] = local29;
		@Pc(43) Object local43 = arg2[local23];
		arg2[local23] = arg2[arg3];
		arg2[arg3] = local43;
		for (@Pc(55) int local55 = arg1; local55 < arg3; local55++) {
			if (arg0[local55] < (local55 & 0x1) + local29) {
				@Pc(70) int local70 = arg0[local55];
				arg0[local55] = arg0[local25];
				arg0[local25] = local70;
				@Pc(84) Object local84 = arg2[local55];
				arg2[local55] = arg2[local25];
				arg2[local25++] = local84;
			}
		}
		arg0[arg3] = arg0[local25];
		arg0[local25] = local29;
		arg2[arg3] = arg2[local25];
		arg2[local25] = local43;
		method4313(arg0, arg1, arg2, local25 - 1);
		method4313(arg0, local25 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static5.anInt2965 <= arg8 && Static220.anInt6565 >= arg8 && arg5 >= Static5.anInt2965 && Static220.anInt6565 >= arg5 && Static5.anInt2965 <= arg7 && arg7 <= Static220.anInt6565 && Static5.anInt2965 <= arg3 && arg3 <= Static220.anInt6565 && arg1 >= Static349.anInt6619 && Static195.anInt4097 >= arg1 && Static349.anInt6619 <= arg6 && arg6 <= Static195.anInt4097 && arg2 >= Static349.anInt6619 && Static195.anInt4097 >= arg2 && Static349.anInt6619 <= arg4 && arg4 <= Static195.anInt4097) {
			Static225.method4041(arg6, arg0, arg7, arg2, arg5, arg4, arg1, arg8, arg3);
		} else {
			Static147.method2998(arg1, arg8, arg7, arg6, arg2, arg0, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIILclient!jl;)V")
	public static void method4315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub3 arg4) {
		arg4.anInt3145 = (arg1 << 7) + 64;
		arg4.anInt3142 = arg3;
		arg4.anInt3138 = (arg2 << 7) + 64;
		@Pc(24) Class128 local24 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class117 local31 = local24.aClass117_2; local31 != null; local31 = local31.aClass117_1) {
				if (local31.aClass8_Sub1_1.aBoolean485) {
					@Pc(41) int local41 = local31.aClass8_Sub1_1.method5629();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt3142 += local28;
				arg4.aBoolean248 = true;
			}
		}
		if (Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static269.method4620(arg0, arg1, arg2);
		}
		Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2].aClass8_Sub3_1 = arg4;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	public static void method4316() {
		Static287.aBoolean345 = true;
	}
}
