import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
	public static int anInt6432;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "Lclient!cu;")
	public static final Class54 aClass54_23 = new Class54(8, 4);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(CB)B")
	public static byte method5796(@OriginalArg(0) char arg0) {
		@Pc(28) byte local28;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local28 = (byte) arg0;
		} else if (arg0 == '€') {
			local28 = -128;
		} else if (arg0 == '‚') {
			local28 = -126;
		} else if (arg0 == 'ƒ') {
			local28 = -125;
		} else if (arg0 == '„') {
			local28 = -124;
		} else if (arg0 == '…') {
			local28 = -123;
		} else if (arg0 == '†') {
			local28 = -122;
		} else if (arg0 == '‡') {
			local28 = -121;
		} else if (arg0 == 'ˆ') {
			local28 = -120;
		} else if (arg0 == '‰') {
			local28 = -119;
		} else if (arg0 == 'Š') {
			local28 = -118;
		} else if (arg0 == '‹') {
			local28 = -117;
		} else if (arg0 == 'Œ') {
			local28 = -116;
		} else if (arg0 == 'Ž') {
			local28 = -114;
		} else if (arg0 == '‘') {
			local28 = -111;
		} else if (arg0 == '’') {
			local28 = -110;
		} else if (arg0 == '“') {
			local28 = -109;
		} else if (arg0 == '”') {
			local28 = -108;
		} else if (arg0 == '•') {
			local28 = -107;
		} else if (arg0 == '–') {
			local28 = -106;
		} else if (arg0 == '—') {
			local28 = -105;
		} else if (arg0 == '˜') {
			local28 = -104;
		} else if (arg0 == '™') {
			local28 = -103;
		} else if (arg0 == 'š') {
			local28 = -102;
		} else if (arg0 == '›') {
			local28 = -101;
		} else if (arg0 == 'œ') {
			local28 = -100;
		} else if (arg0 == 'ž') {
			local28 = -98;
		} else if (arg0 == 'Ÿ') {
			local28 = -97;
		} else {
			local28 = 63;
		}
		return local28;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II[IIIIII)V")
	public static void method5798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 > 0 && !Static329.method5606(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static329.method5606(arg4)) {
			@Pc(50) int local50 = 0;
			@Pc(61) int local61 = arg3 >= arg4 ? arg4 : arg3;
			@Pc(65) int local65 = arg3 >> 1;
			@Pc(69) int local69 = arg4 >> 1;
			@Pc(71) int[] local71 = arg2;
			@Pc(76) int[] local76 = new int[local69 * local65];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local50, arg1, arg3, arg4, 0, 32993, arg5, local71, 0);
				if (local61 <= 1) {
					return;
				}
				@Pc(95) int local95 = 0;
				@Pc(97) int local97 = 0;
				@Pc(101) int local101 = arg3;
				for (@Pc(103) int local103 = 0; local103 < local69; local103++) {
					for (@Pc(107) int local107 = 0; local107 < local65; local107++) {
						@Pc(114) int local114 = local71[local97++];
						@Pc(119) int local119 = local71[local97++];
						@Pc(124) int local124 = local71[local101++];
						@Pc(129) int local129 = local71[local101++];
						@Pc(133) int local133 = local114 & 0xFF;
						@Pc(139) int local139 = local114 >> 16 & 0xFF;
						@Pc(145) int local145 = local114 >> 8 & 0xFF;
						@Pc(151) int local151 = local114 >> 24 & 0xFF;
						@Pc(157) int local157 = local133 + (local119 & 0xFF);
						@Pc(165) int local165 = local151 + (local119 >> 24 & 0xFF);
						@Pc(173) int local173 = local139 + (local119 >> 16 & 0xFF);
						@Pc(181) int local181 = local145 + (local119 >> 8 & 0xFF);
						@Pc(189) int local189 = local173 + (local124 >> 16 & 0xFF);
						@Pc(197) int local197 = local165 + (local124 >> 24 & 0xFF);
						@Pc(203) int local203 = local157 + (local124 & 0xFF);
						@Pc(211) int local211 = local181 + (local124 >> 8 & 0xFF);
						@Pc(219) int local219 = local211 + (local129 >> 8 & 0xFF);
						@Pc(225) int local225 = local203 + (local129 & 0xFF);
						@Pc(233) int local233 = local189 + (local129 >> 16 & 0xFF);
						@Pc(241) int local241 = local197 + (local129 >> 24 & 0xFF);
						local76[local95++] = (local233 & 0x3FC) << 14 | (local241 & 0x3FC) << 22 | (local219 & 0x3FC) << 6 | local225 >> 2 & 0xFF;
					}
					local97 += arg3;
					local101 += arg3;
				}
				@Pc(290) int[] local290 = local76;
				local76 = local71;
				arg4 = local69;
				local71 = local290;
				arg3 = local65;
				local61 >>= 0x1;
				local69 >>= 0x1;
				local65 >>= 0x1;
				local50++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
