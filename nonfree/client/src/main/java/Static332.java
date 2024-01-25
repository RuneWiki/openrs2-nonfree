import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "[Lclient!xa;")
	public static Class4[] aClass4Array11;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "[[B")
	public static final byte[][] aByteArrayArray19 = new byte[1000][];

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III[FIII)V")
	public static void method5086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1 > 0 && !Static392.method5808(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static392.method5808(arg0)) {
			@Pc(37) int local37 = Static172.method2654(6408);
			@Pc(39) int local39 = 0;
			@Pc(50) int local50 = arg0 <= arg1 ? arg0 : arg1;
			@Pc(54) int local54 = arg1 >> 1;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(60) float[] local60 = arg3;
			@Pc(67) float[] local67 = new float[local54 * local58 * local37];
			while (true) {
				OpenGL.glTexImage2Df(3553, local39, 34842, arg1, arg0, 0, 6408, 5126, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(86) int local86 = arg1 * local37;
				for (@Pc(88) int local88 = 0; local88 < local37; local88++) {
					@Pc(92) int local92 = local88;
					@Pc(94) int local94 = local88;
					@Pc(98) int local98 = local86 + local88;
					for (@Pc(100) int local100 = 0; local100 < local58; local100++) {
						for (@Pc(104) int local104 = 0; local104 < local54; local104++) {
							@Pc(110) float local110 = local60[local94];
							local94 += local37;
							@Pc(120) float local120 = local110 + local60[local94];
							local94 += local37;
							@Pc(130) float local130 = local120 + local60[local98];
							local98 += local37;
							@Pc(140) float local140 = local130 + local60[local98];
							local67[local92] = local140 * 0.25F;
							local98 += local37;
							local92 += local37;
						}
						local98 += local86;
						local94 += local86;
					}
				}
				@Pc(184) float[] local184 = local67;
				local67 = local60;
				arg0 = local58;
				arg1 = local54;
				local60 = local184;
				local50 >>= 0x1;
				local39++;
				local58 >>= 0x1;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B[B)[B")
	public static byte[] method5088(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static585.method3080(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	public static void method5089() {
		Static529.aClass332_192.method7510();
	}
}
