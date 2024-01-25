import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!rca", name = "r", descriptor = "I")
	public static int anInt8898 = 1;

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "[I")
	public static final int[] anIntArray462 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "S")
	public static short aShort86 = 1;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(II[BIII)V")
	public static void method7671(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		arg2 += arg0;
		@Pc(18) int local18 = arg3 - arg0 >> 2;
		while (true) {
			local18--;
			if (local18 < 0) {
				local18 = arg3 - arg0 & 0x3;
				while (true) {
					local18--;
					if (local18 < 0) {
						return;
					}
					arg1[arg2++] = 1;
				}
			}
			@Pc(28) int local28 = arg2 + 1;
			arg1[arg2] = 1;
			@Pc(33) int local33 = local28 + 1;
			arg1[local28] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg1[local33] = 1;
			arg2 = local38 + 1;
			arg1[local38] = 1;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIIZ[III)V")
	public static void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 > 0 && !Static670.method9288(90, arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static670.method9288(84, arg4)) {
			@Pc(47) int local47 = 0;
			@Pc(55) int local55 = arg4 > arg2 ? arg2 : arg4;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(63) int local63 = arg4 >> 1;
			@Pc(65) int[] local65 = arg3;
			@Pc(70) int[] local70 = new int[local59 * local63];
			while (true) {
				OpenGL.glTexImage2Di(arg5, local47, arg1, arg2, arg4, 0, 32993, arg0, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(100) int local100 = 0;
				@Pc(102) int local102 = 0;
				@Pc(106) int local106 = arg2;
				@Pc(108) int[] local108 = local70;
				for (@Pc(110) int local110 = 0; local110 < local63; local110++) {
					for (@Pc(113) int local113 = 0; local113 < local59; local113++) {
						@Pc(119) int local119 = local65[local102++];
						@Pc(124) int local124 = local65[local106++];
						@Pc(129) int local129 = local65[local102++];
						@Pc(135) int local135 = local119 >> 8 & 0xFF;
						@Pc(140) int local140 = local65[local106++];
						@Pc(146) int local146 = local119 >> 24 & 0xFF;
						@Pc(150) int local150 = local119 & 0xFF;
						@Pc(156) int local156 = local119 >> 16 & 0xFF;
						@Pc(164) int local164 = local156 + (local129 >> 16 & 0xFF);
						@Pc(170) int local170 = local150 + (local129 & 0xFF);
						@Pc(178) int local178 = local146 + (local129 >> 24 & 0xFF);
						@Pc(186) int local186 = local135 + (local129 >> 8 & 0xFF);
						@Pc(192) int local192 = local170 + (local124 & 0xFF);
						@Pc(200) int local200 = local178 + (local124 >> 24 & 0xFF);
						@Pc(208) int local208 = local164 + (local124 >> 16 & 0xFF);
						@Pc(216) int local216 = local186 + (local124 >> 8 & 0xFF);
						@Pc(224) int local224 = local208 + (local140 >> 16 & 0xFF);
						@Pc(232) int local232 = local216 + (local140 >> 8 & 0xFF);
						@Pc(238) int local238 = local192 + (local140 & 0xFF);
						@Pc(246) int local246 = local200 + (local140 >> 24 & 0xFF);
						local70[local100++] = (local246 & 0x3FC) << 22 | local224 << 14 & 0xFF0000 | (local232 & 0x3FC) << 6 | local238 >> 2 & 0xFF;
					}
					local106 += arg2;
					local102 += arg2;
				}
				local70 = local65;
				arg4 = local63;
				local65 = local108;
				arg2 = local59;
				local59 >>= 0x1;
				local55 >>= 0x1;
				local47++;
				local63 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
