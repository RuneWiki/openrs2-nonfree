import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "Lclient!de;")
	public static final Class69 aClass69_45 = new Class69(128, 4);

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "Lclient!fh;")
	public static final Class114 aClass114_39 = new Class114();

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "[F")
	public static final float[] aFloatArray64 = new float[4];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6331(@OriginalArg(1) String arg0) {
		Static107.method1973(arg0, 0, "", "", 0, "");
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)Lclient!he;")
	public static Class16_Sub1_Sub2 method6332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass16_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[BIIIII)V")
	public static void method6333(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static608.method8539(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static608.method8539(arg5)) {
			@Pc(36) int local36 = Static257.method4273(arg0);
			@Pc(38) int local38 = 0;
			@Pc(49) int local49 = arg5 > arg4 ? arg4 : arg5;
			@Pc(58) int local58 = arg4 >> 1;
			@Pc(62) int local62 = arg5 >> 1;
			@Pc(64) byte[] local64 = arg1;
			@Pc(71) byte[] local71 = new byte[local36 * local58 * local62];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local38, arg2, arg4, arg5, 0, arg0, 5121, local64, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg4 * local36;
				@Pc(94) byte[] local94 = local71;
				for (@Pc(96) int local96 = 0; local96 < local36; local96++) {
					@Pc(99) int local99 = local96;
					@Pc(101) int local101 = local96;
					@Pc(105) int local105 = local96 + local92;
					for (@Pc(107) int local107 = 0; local107 < local62; local107++) {
						for (@Pc(110) int local110 = 0; local110 < local58; local110++) {
							@Pc(115) byte local115 = local64[local101];
							local101 += local36;
							@Pc(125) int local125 = local115 + local64[local101];
							local101 += local36;
							@Pc(135) int local135 = local125 + local64[local105];
							local105 += local36;
							@Pc(145) int local145 = local135 + local64[local105];
							local105 += local36;
							local71[local99] = (byte) (local145 >> 2);
							local99 += local36;
						}
						local105 += local92;
						local101 += local92;
					}
				}
				local71 = local64;
				arg5 = local62;
				local64 = local94;
				arg4 = local58;
				local49 >>= 0x1;
				local58 >>= 0x1;
				local38++;
				local62 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
