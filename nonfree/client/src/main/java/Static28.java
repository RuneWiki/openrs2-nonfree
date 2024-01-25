import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "Lclient!iu;")
	public static Class129 aClass129_3;

	@OriginalMember(owner = "client!bf", name = "Vb", descriptor = "I")
	public static int anInt7409;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZI)I")
	public static int method5890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static403.anIntArray516[arg0 & 0x3] : Static367.anIntArray477[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLclient!fh;)Lclient!rr;")
	public static Class51_Sub3 method5896(@OriginalArg(1) Class4_Sub9 arg0) {
		return new Class51_Sub3(arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5008(), arg0.method5008(), arg0.method5007());
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIII[BII)V")
	public static void method5899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static280.method3692(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static280.method3692(arg1)) {
			@Pc(34) int local34 = Static172.method2393(arg5);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg0 >= arg1 ? arg1 : arg0;
			@Pc(47) int local47 = arg0 >> 1;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(53) byte[] local53 = arg3;
			@Pc(60) byte[] local60 = new byte[local47 * local51 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local36, arg2, arg0, arg1, 0, arg5, 5121, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(83) int local83 = local34 * arg0;
				@Pc(85) byte[] local85 = local60;
				for (@Pc(87) int local87 = 0; local87 < local34; local87++) {
					@Pc(91) int local91 = local87;
					@Pc(93) int local93 = local87;
					@Pc(97) int local97 = local87 + local83;
					for (@Pc(99) int local99 = 0; local99 < local51; local99++) {
						for (@Pc(103) int local103 = 0; local103 < local47; local103++) {
							@Pc(109) byte local109 = local53[local93];
							local93 += local34;
							@Pc(119) int local119 = local109 + local53[local93];
							@Pc(125) int local125 = local119 + local53[local97];
							local93 += local34;
							local97 += local34;
							@Pc(139) int local139 = local125 + local53[local97];
							local60[local91] = (byte) (local139 >> 2);
							local97 += local34;
							local91 += local34;
						}
						local93 += local83;
						local97 += local83;
					}
				}
				local60 = local53;
				arg0 = local47;
				local53 = local85;
				arg1 = local51;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local43 >>= 0x1;
				local36++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
