import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II[J[II)V")
	public static void method6533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) long local16 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local16;
		@Pc(30) int local30 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local30;
		@Pc(50) int local50 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg1; local52 < arg0; local52++) {
			if (arg2[local52] < (long) (local52 & local50) + local16) {
				@Pc(73) long local73 = arg2[local52];
				arg2[local52] = arg2[local12];
				arg2[local12] = local73;
				@Pc(87) int local87 = arg3[local52];
				arg3[local52] = arg3[local12];
				arg3[local12++] = local87;
			}
		}
		arg2[arg0] = arg2[local12];
		arg2[local12] = local16;
		arg3[arg0] = arg3[local12];
		arg3[local12] = local30;
		method6533(local12 - 1, arg1, arg2, arg3);
		method6533(arg0, local12 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!vo;IILclient!fa;Ljava/awt/Canvas;)Lclient!r;")
	public static Class7 method6534(@OriginalArg(0) Class348 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) Canvas arg3) {
		if (!Static258.method4078()) {
			throw new RuntimeException("");
		} else if (Static188.method3095("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg3, 8, 8, 8, 24, 0, arg1);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(60) Class7_Sub1_Sub1 local60 = new Class7_Sub1_Sub1(local29, arg3, local39, arg2, arg0, arg1);
			local60.method5688();
			return local60;
		} else {
			throw new RuntimeException("");
		}
	}
}
