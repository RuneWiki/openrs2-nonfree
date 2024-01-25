import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
	public static int anInt3591;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_62 = new Class231("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII[FII)V")
	public static void method3211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static220.method3379(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static220.method3379(arg5)) {
			@Pc(42) int local42 = Static7.method121(6408);
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg5 <= arg4 ? arg5 : arg4;
			@Pc(59) int local59 = arg4 >> 1;
			@Pc(63) int local63 = arg5 >> 1;
			@Pc(65) float[] local65 = arg3;
			@Pc(72) float[] local72 = new float[local42 * local63 * local59];
			while (true) {
				OpenGL.glTexImage2Df(3553, local44, 34842, arg4, arg5, 0, 6408, 5126, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(91) int local91 = local42 * arg4;
				@Pc(93) float[] local93 = local72;
				for (@Pc(95) int local95 = 0; local95 < local42; local95++) {
					@Pc(99) int local99 = local95;
					@Pc(101) int local101 = local95;
					@Pc(105) int local105 = local95 + local91;
					for (@Pc(107) int local107 = 0; local107 < local63; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local59; local111++) {
							@Pc(117) float local117 = local65[local101];
							local101 += local42;
							@Pc(127) float local127 = local117 + local65[local101];
							@Pc(133) float local133 = local127 + local65[local105];
							local101 += local42;
							local105 += local42;
							@Pc(147) float local147 = local133 + local65[local105];
							local105 += local42;
							local72[local99] = local147 * 0.25F;
							local99 += local42;
						}
						local105 += local91;
						local101 += local91;
					}
				}
				local72 = local65;
				arg4 = local59;
				arg5 = local63;
				local65 = local93;
				local63 >>= 0x1;
				local59 >>= 0x1;
				local44++;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
	public static void method3213() {
		Static265.method4065(Static268.anInt4600);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
	public static void method3214() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static14.aClass189ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static14.aClass189ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static401.anInt6621; local6++) {
					for (local9 = 0; local9 < Static364.anInt6134; local9++) {
						if (Static14.aClass189ArrayArrayArray1[local3][local6][local9] != null) {
							Static14.aClass189ArrayArrayArray1[local3][local6][local9].method4280();
						}
						Static14.aClass189ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static14.aClass189ArrayArrayArray1 = null;
		Static93.aClass84Array1 = null;
		if (Static280.aClass189ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static280.aClass189ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static401.anInt6621; local6++) {
					for (local9 = 0; local9 < Static364.anInt6134; local9++) {
						if (Static280.aClass189ArrayArrayArray3[local3][local6][local9] != null) {
							Static280.aClass189ArrayArrayArray3[local3][local6][local9].method4280();
						}
						Static280.aClass189ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static280.aClass189ArrayArrayArray3 = null;
		Static365.aClass84Array3 = null;
		Static30.aClass189ArrayArrayArray2 = null;
		Static420.aClass84Array4 = null;
		Static269.anInt4605 = 0;
		if (Static84.aClass219Array2 != null) {
			for (local3 = 0; local3 < Static269.anInt4605; local3++) {
				Static84.aClass219Array2[local3] = null;
			}
		}
		if (Static81.aClass3_Sub3Array1 != null) {
			for (local3 = 0; local3 < Static215.anInt3735; local3++) {
				Static81.aClass3_Sub3Array1[local3] = null;
			}
			Static215.anInt3735 = 0;
		}
		if (Static304.aClass66Array1 != null) {
			for (local3 = 0; local3 < Static208.anInt3623; local3++) {
				Static304.aClass66Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static268.anInt4600; local6++) {
				for (local9 = 0; local9 < Static401.anInt6621; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static364.anInt6134; local160++) {
						Static267.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static208.anInt3623 = 0;
		}
		Static41.anIntArrayArrayArray2 = null;
		Static392.method5390();
		Static412.aClass128_10.method2829();
		Static426.aByteArrayArray46 = null;
		Static5.anIntArrayArray1 = null;
		Static340.aByteArrayArray34 = null;
		Static19.aClass10_1 = null;
		Static357.aClass132_4 = null;
		Static291.aClass28_132 = null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public static void method3215() {
		if (Static18.aClass105_1 != null) {
			Static18.aClass105_1.method5161();
		}
		if (Static166.aClass105_2 != null) {
			Static166.aClass105_2.method5161();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Z")
	public static boolean method3217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3218(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static214.method3328(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static165.anInt2940; local25++) {
			@Pc(36) String local36 = Static208.aStringArray24[local25];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static214.method3328(local36);
			if (local36 != null && local36.equals(local20)) {
				Static165.anInt2940--;
				for (@Pc(60) int local60 = local25; local60 < Static165.anInt2940; local60++) {
					Static208.aStringArray24[local60] = Static208.aStringArray24[local60 + 1];
					Static76.aStringArray8[local60] = Static76.aStringArray8[local60 + 1];
					Static262.anIntArray399[local60] = Static262.anIntArray399[local60 + 1];
					Static315.aStringArray28[local60] = Static315.aStringArray28[local60 + 1];
					Static85.anIntArray168[local60] = Static85.anIntArray168[local60 + 1];
					Static381.aBooleanArray26[local60] = Static381.aBooleanArray26[local60 + 1];
				}
				Static31.anInt507 = Static323.anInt5265;
				Static298.method4373(Static295.aClass25_77);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static384.method5308(arg0));
				Static449.aClass6_Sub15_Sub1_2.method3094(arg0);
				return;
			}
		}
	}
}
