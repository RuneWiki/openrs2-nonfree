import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_22 = new Class169(4);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII[III)V")
	public static void method3025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		if (arg4 > 0 && !Static468.method7401(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static468.method7401(arg2)) {
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg2 > arg4 ? arg4 : arg2;
			@Pc(53) int local53 = arg4 >> 1;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(59) int[] local59 = arg5;
			@Pc(64) int[] local64 = new int[local57 * local53];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local37, arg1, arg4, arg2, 0, 32993, arg3, local59, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(80) int local80 = 0;
				@Pc(82) int local82 = 0;
				@Pc(86) int local86 = arg4;
				@Pc(88) int[] local88 = local64;
				for (@Pc(90) int local90 = 0; local90 < local57; local90++) {
					for (@Pc(94) int local94 = 0; local94 < local53; local94++) {
						@Pc(101) int local101 = local59[local82++];
						@Pc(106) int local106 = local59[local82++];
						@Pc(111) int local111 = local59[local86++];
						@Pc(115) int local115 = local101 & 0xFF;
						@Pc(121) int local121 = local101 >> 16 & 0xFF;
						@Pc(127) int local127 = local101 >> 24 & 0xFF;
						@Pc(133) int local133 = local101 >> 8 & 0xFF;
						@Pc(138) int local138 = local59[local86++];
						@Pc(146) int local146 = local127 + (local106 >> 24 & 0xFF);
						@Pc(154) int local154 = local121 + (local106 >> 16 & 0xFF);
						@Pc(160) int local160 = local115 + (local106 & 0xFF);
						@Pc(168) int local168 = local133 + (local106 >> 8 & 0xFF);
						@Pc(176) int local176 = local146 + (local111 >> 24 & 0xFF);
						@Pc(184) int local184 = local154 + (local111 >> 16 & 0xFF);
						@Pc(192) int local192 = local168 + (local111 >> 8 & 0xFF);
						@Pc(198) int local198 = local160 + (local111 & 0xFF);
						@Pc(204) int local204 = local198 + (local138 & 0xFF);
						@Pc(212) int local212 = local192 + (local138 >> 8 & 0xFF);
						@Pc(220) int local220 = local176 + (local138 >> 24 & 0xFF);
						@Pc(228) int local228 = local184 + (local138 >> 16 & 0xFF);
						local64[local80++] = (local212 & 0x3FC) << 6 | (local228 & 0x3FC) << 14 | (local220 & 0x3FC) << 22 | local204 >> 2 & 0xFF;
					}
					local82 += arg4;
					local86 += arg4;
				}
				local64 = local59;
				arg2 = local57;
				arg4 = local53;
				local59 = local88;
				local37++;
				local53 >>= 0x1;
				local44 >>= 0x1;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[Ljava/lang/Object;I[JI)V")
	public static void method3026(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg2) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) long local24 = arg3[local18];
		arg3[local18] = arg3[arg2];
		arg3[arg2] = local24;
		@Pc(38) Object local38 = arg1[local18];
		arg1[local18] = arg1[arg2];
		arg1[arg2] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg0; local60 < arg2; local60++) {
			if ((long) (local60 & local58) + local24 > arg3[local60]) {
				@Pc(77) long local77 = arg3[local60];
				arg3[local60] = arg3[local20];
				arg3[local20] = local77;
				@Pc(91) Object local91 = arg1[local60];
				arg1[local60] = arg1[local20];
				arg1[local20++] = local91;
			}
		}
		arg3[arg2] = arg3[local20];
		arg3[local20] = local24;
		arg1[arg2] = arg1[local20];
		arg1[local20] = local38;
		method3026(arg0, arg1, local20 - 1, arg3);
		method3026(local20 + 1, arg1, arg2, arg3);
	}
}
