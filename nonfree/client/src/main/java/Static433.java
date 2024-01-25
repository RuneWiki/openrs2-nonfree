import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public static int anInt7306 = 500;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII[B)V")
	public static void method6471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg2 > 0 && !Static586.method8223(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static586.method8223(arg0)) {
			@Pc(38) int local38 = Static211.method3220(arg4);
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg0 <= arg2 ? arg0 : arg2;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(57) byte[] local57 = arg5;
			@Pc(64) byte[] local64 = new byte[local55 * local51 * local38];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local40, arg1, arg2, arg0, 0, arg4, 5121, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg2 * local38;
				for (@Pc(87) int local87 = 0; local87 < local38; local87++) {
					@Pc(91) int local91 = local87;
					@Pc(93) int local93 = local87;
					@Pc(97) int local97 = local85 + local87;
					for (@Pc(99) int local99 = 0; local99 < local55; local99++) {
						for (@Pc(103) int local103 = 0; local103 < local51; local103++) {
							@Pc(109) byte local109 = local57[local93];
							local93 += local38;
							@Pc(119) int local119 = local109 + local57[local93];
							local93 += local38;
							@Pc(129) int local129 = local119 + local57[local97];
							local97 += local38;
							@Pc(139) int local139 = local129 + local57[local97];
							local97 += local38;
							local64[local91] = (byte) (local139 >> 2);
							local91 += local38;
						}
						local93 += local85;
						local97 += local85;
					}
				}
				@Pc(180) byte[] local180 = local64;
				local64 = local57;
				arg0 = local55;
				local57 = local180;
				arg2 = local51;
				local40++;
				local47 >>= 0x1;
				local55 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BILjava/lang/String;II)I")
	public static int method6472(@OriginalArg(1) byte[] arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg1.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg0[local12 + arg3] = (byte) local20;
			} else if (local20 == '€') {
				arg0[local12 + arg3] = -128;
			} else if (local20 == '‚') {
				arg0[local12 + arg3] = -126;
			} else if (local20 == 'ƒ') {
				arg0[arg3 + local12] = -125;
			} else if (local20 == '„') {
				arg0[arg3 + local12] = -124;
			} else if (local20 == '…') {
				arg0[arg3 + local12] = -123;
			} else if (local20 == '†') {
				arg0[local12 + arg3] = -122;
			} else if (local20 == '‡') {
				arg0[arg3 + local12] = -121;
			} else if (local20 == 'ˆ') {
				arg0[arg3 + local12] = -120;
			} else if (local20 == '‰') {
				arg0[arg3 + local12] = -119;
			} else if (local20 == 'Š') {
				arg0[arg3 + local12] = -118;
			} else if (local20 == '‹') {
				arg0[arg3 + local12] = -117;
			} else if (local20 == 'Œ') {
				arg0[arg3 + local12] = -116;
			} else if (local20 == 'Ž') {
				arg0[arg3 + local12] = -114;
			} else if (local20 == '‘') {
				arg0[local12 + arg3] = -111;
			} else if (local20 == '’') {
				arg0[arg3 + local12] = -110;
			} else if (local20 == '“') {
				arg0[arg3 + local12] = -109;
			} else if (local20 == '”') {
				arg0[local12 + arg3] = -108;
			} else if (local20 == '•') {
				arg0[local12 + arg3] = -107;
			} else if (local20 == '–') {
				arg0[local12 + arg3] = -106;
			} else if (local20 == '—') {
				arg0[local12 + arg3] = -105;
			} else if (local20 == '˜') {
				arg0[arg3 + local12] = -104;
			} else if (local20 == '™') {
				arg0[local12 + arg3] = -103;
			} else if (local20 == 'š') {
				arg0[arg3 + local12] = -102;
			} else if (local20 == '›') {
				arg0[local12 + arg3] = -101;
			} else if (local20 == 'œ') {
				arg0[arg3 + local12] = -100;
			} else if (local20 == 'ž') {
				arg0[local12 + arg3] = -98;
			} else if (local20 == 'Ÿ') {
				arg0[local12 + arg3] = -97;
			} else {
				arg0[arg3 + local12] = 63;
			}
		}
		return local10;
	}
}
