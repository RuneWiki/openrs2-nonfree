import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "Lclient!ofa;")
	public static Class265 aClass265_13;

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_106 = new Class240(61, 7);

	@OriginalMember(owner = "client!dt", name = "T", descriptor = "Z")
	public static boolean aBoolean679 = false;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIIII[B)V")
	public static void method7898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg3 > 0 && !Static365.method5254(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static365.method5254(arg1)) {
			@Pc(38) int local38 = Static571.method7502(arg2);
			@Pc(40) int local40 = 0;
			@Pc(51) int local51 = arg1 <= arg3 ? arg1 : arg3;
			@Pc(55) int local55 = arg3 >> 1;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(61) byte[] local61 = arg5;
			@Pc(68) byte[] local68 = new byte[local38 * local59 * local55];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local40, arg0, arg3, arg1, 0, arg2, 5121, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(89) int local89 = local38 * arg3;
				@Pc(91) byte[] local91 = local68;
				for (@Pc(93) int local93 = 0; local93 < local38; local93++) {
					@Pc(97) int local97 = local93;
					@Pc(99) int local99 = local93;
					@Pc(104) int local104 = local93 + local89;
					for (@Pc(106) int local106 = 0; local106 < local59; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local55; local110++) {
							@Pc(116) byte local116 = local61[local99];
							local99 += local38;
							@Pc(126) int local126 = local116 + local61[local99];
							local99 += local38;
							@Pc(136) int local136 = local126 + local61[local104];
							local104 += local38;
							@Pc(146) int local146 = local136 + local61[local104];
							local104 += local38;
							local68[local97] = (byte) (local146 >> 2);
							local97 += local38;
						}
						local99 += local89;
						local104 += local89;
					}
				}
				local68 = local61;
				local61 = local91;
				arg3 = local55;
				arg1 = local59;
				local40++;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIIIIIIZI)Z")
	public static boolean method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (!Static518.method6733(arg4, arg0, arg1)) {
			return false;
		}
		@Pc(15) int local15 = Static324.anIntArray307[1];
		@Pc(19) int local19 = Static324.anIntArray307[2];
		@Pc(23) int local23 = Static324.anIntArray307[0];
		if (!Static518.method6733(arg8, arg5, arg7)) {
			return false;
		}
		@Pc(35) int local35 = Static324.anIntArray307[0];
		@Pc(39) int local39 = Static324.anIntArray307[2];
		@Pc(43) int local43 = Static324.anIntArray307[1];
		if (Static518.method6733(arg6, arg3, arg2)) {
			@Pc(55) int local55 = Static324.anIntArray307[0];
			@Pc(64) int local64 = Static324.anIntArray307[2];
			@Pc(68) int local68 = Static324.anIntArray307[1];
			return Static278.method4061(local35, local55, local39, local15, local43, local68, local23, local64, local19);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
	public static void method7915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static216.method3187(local7.aClass34_Sub1_Sub2_1);
			if (local7.aClass34_Sub1_Sub2_1 != null) {
				local7.aClass34_Sub1_Sub2_1 = null;
			}
		}
	}
}
