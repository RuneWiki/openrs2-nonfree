import jaggl.OpenGL;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!og", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[6][];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII[BI)V")
	public static void method5316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static259.method3656(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static259.method3656(arg2)) {
			@Pc(36) int local36 = Static224.method2730(arg0);
			@Pc(38) int local38 = 0;
			@Pc(53) int local53 = arg1 < arg2 ? arg1 : arg2;
			@Pc(57) int local57 = arg1 >> 1;
			@Pc(61) int local61 = arg2 >> 1;
			@Pc(63) byte[] local63 = arg4;
			@Pc(70) byte[] local70 = new byte[local36 * local57 * local61];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local38, arg3, arg1, arg2, 0, arg0, 5121, local63, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg1 * local36;
				@Pc(91) byte[] local91 = local70;
				for (@Pc(93) int local93 = 0; local93 < local36; local93++) {
					@Pc(97) int local97 = local93;
					@Pc(99) int local99 = local93;
					@Pc(103) int local103 = local89 + local93;
					for (@Pc(105) int local105 = 0; local105 < local61; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local57; local109++) {
							@Pc(115) byte local115 = local63[local99];
							local99 += local36;
							@Pc(125) int local125 = local115 + local63[local99];
							@Pc(131) int local131 = local125 + local63[local103];
							local99 += local36;
							local103 += local36;
							@Pc(145) int local145 = local131 + local63[local103];
							local103 += local36;
							local70[local97] = (byte) (local145 >> 2);
							local97 += local36;
						}
						local103 += local89;
						local99 += local89;
					}
				}
				local70 = local63;
				arg1 = local57;
				arg2 = local61;
				local63 = local91;
				local57 >>= 0x1;
				local53 >>= 0x1;
				local38++;
				local61 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZBLjava/awt/Component;)Lclient!oea;")
	public static Class131 method5318(@OriginalArg(2) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class131_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class131) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class131_Sub1(arg0, true);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method5319(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(17) int local17 = local6 + 3 & 0xFFFFFFFC;
		@Pc(23) int local23 = local17 / 4 * 3;
		if (local6 <= local17 - 2 || Static549.method7172(arg0.charAt(local17 - 2)) == -1) {
			local23 -= 2;
		} else if (local17 - 1 >= local6 || Static549.method7172(arg0.charAt(local17 - 1)) == -1) {
			local23--;
		}
		@Pc(68) byte[] local68 = new byte[local23];
		Static376.method5248(0, local68, arg0);
		return local68;
	}
}
