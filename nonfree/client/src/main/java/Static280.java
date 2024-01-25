import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
	public static int anInt5116;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "[I")
	public static int[] anIntArray383 = new int[2];

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_10 = new Class187(2, 16);

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_157 = new Class272(98, -1);

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_27 = new Class10(10);

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
	public static int anInt5115 = 0;

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_105 = new Class298(17, 7);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
	public static int method4440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static309.anIntArrayArray10 == null ? 0 : Static309.anIntArrayArray10[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(F[FFIIIIIIIFII)V")
	public static void method4441(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg8 - arg6;
		@Pc(13) int local13 = arg4 - arg10;
		@Pc(17) int local17 = arg11 - arg3;
		@Pc(38) float local38 = arg1[0] * (float) local17 + (float) local13 * arg1[1] + arg1[2] * (float) local5;
		@Pc(59) float local59 = (float) local5 * arg1[5] + arg1[4] * (float) local13 + arg1[3] * (float) local17;
		@Pc(85) float local85 = (float) local5 * arg1[8] + (float) local17 * arg1[6] + (float) local13 * arg1[7];
		@Pc(93) float local93;
		@Pc(100) float local100;
		if (arg5 == 0) {
			local93 = arg2 + local38 + 0.5F;
			local100 = arg9 + 0.5F - local85;
		} else if (arg5 == 1) {
			local93 = arg2 + local38 + 0.5F;
			local100 = local85 + arg9 + 0.5F;
		} else if (arg5 == 2) {
			local93 = arg2 + 0.5F - local38;
			local100 = arg0 + 0.5F - local59;
		} else if (arg5 == 3) {
			local93 = arg2 + local38 + 0.5F;
			local100 = arg0 + 0.5F - local59;
		} else if (arg5 == 4) {
			local100 = arg0 + 0.5F - local59;
			local93 = local85 + arg9 + 0.5F;
		} else {
			local100 = arg0 + 0.5F - local59;
			local93 = arg9 + 0.5F - local85;
		}
		@Pc(199) float local199;
		if (arg7 == 1) {
			local199 = local93;
			local93 = -local100;
			local100 = local199;
		} else if (arg7 == 2) {
			local100 = -local100;
			local93 = -local93;
		} else if (arg7 == 3) {
			local199 = local93;
			local93 = local100;
			local100 = -local199;
		}
		Static490.aFloat163 = local100;
		Static397.aFloat147 = local93;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIBII)V")
	public static void method4446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg2; local12++) {
			Static337.method5150(arg3, arg4, arg0, Static176.anIntArrayArray28[local12]);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([FII)[F")
	public static float[] method4447(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static604.method5914(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[Lclient!jfa;Lclient!us;)Lclient!taa;")
	public static Class315 method4448(@OriginalArg(1) Class165[] arg0, @OriginalArg(2) Class43_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong134 <= 0L) {
				return null;
			}
		}
		@Pc(31) long local31 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
			OpenGL.glAttachObjectARB(local31, arg0[local33].aLong134);
		}
		OpenGL.glLinkProgramARB(local31);
		OpenGL.glGetObjectParameterivARB(local31, 35714, Static571.anIntArray638, 0);
		if (Static571.anIntArray638[0] == 0) {
			if (Static571.anIntArray638[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local31, 35716, Static571.anIntArray638, 1);
			if (Static571.anIntArray638[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static571.anIntArray638[1]];
				OpenGL.glGetInfoLogARB(local31, Static571.anIntArray638[1], Static571.anIntArray638, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static571.anIntArray638[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg0.length; local115++) {
					OpenGL.glDetachObjectARB(local31, arg0[local115].aLong134);
				}
				OpenGL.glDeleteObjectARB(local31);
				return null;
			}
		}
		return new Class315(arg1, local31, arg0);
	}
}
