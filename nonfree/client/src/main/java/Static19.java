import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!as", name = "v", descriptor = "[S")
	private static final short[] aShortArray3 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!as", name = "w", descriptor = "[S")
	private static final short[] aShortArray4 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!as", name = "z", descriptor = "[S")
	private static final short[] aShortArray5 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!as", name = "q", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray3, aShortArray4, aShortArray5 };

	@OriginalMember(owner = "client!as", name = "s", descriptor = "I")
	public static int anInt608 = 0;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "I")
	public static int anInt609 = 0;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIII[III)V")
	public static void method754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg1 > 0 && !Static282.method4863(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static282.method4863(arg3)) {
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg3 <= arg1 ? arg3 : arg1;
			@Pc(52) int local52 = arg1 >> 1;
			@Pc(56) int local56 = arg3 >> 1;
			@Pc(58) int[] local58 = arg4;
			@Pc(63) int[] local63 = new int[local56 * local52];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local41, arg5, arg1, arg3, 0, 32993, arg0, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(81) int local81 = 0;
				@Pc(83) int local83 = 0;
				@Pc(87) int local87 = arg1;
				for (@Pc(89) int local89 = 0; local89 < local56; local89++) {
					for (@Pc(92) int local92 = 0; local92 < local52; local92++) {
						@Pc(98) int local98 = local58[local83++];
						@Pc(103) int local103 = local58[local87++];
						@Pc(108) int local108 = local58[local83++];
						@Pc(113) int local113 = local58[local87++];
						@Pc(117) int local117 = local98 & 0xFF;
						@Pc(123) int local123 = local98 >> 16 & 0xFF;
						@Pc(129) int local129 = local98 >> 8 & 0xFF;
						@Pc(135) int local135 = local98 >> 24 & 0xFF;
						@Pc(143) int local143 = local123 + (local108 >> 16 & 0xFF);
						@Pc(151) int local151 = local129 + (local108 >> 8 & 0xFF);
						@Pc(159) int local159 = local135 + (local108 >> 24 & 0xFF);
						@Pc(165) int local165 = local117 + (local108 & 0xFF);
						@Pc(173) int local173 = local159 + (local103 >> 24 & 0xFF);
						@Pc(181) int local181 = local143 + (local103 >> 16 & 0xFF);
						@Pc(187) int local187 = local165 + (local103 & 0xFF);
						@Pc(195) int local195 = local151 + (local103 >> 8 & 0xFF);
						@Pc(203) int local203 = local173 + (local113 >> 24 & 0xFF);
						@Pc(211) int local211 = local195 + (local113 >> 8 & 0xFF);
						@Pc(219) int local219 = local181 + (local113 >> 16 & 0xFF);
						@Pc(225) int local225 = local187 + (local113 & 0xFF);
						local63[local81++] = (local203 & 0x3FC) << 22 | local219 << 14 & 0xFF0000 | (local211 & 0x3FC) << 6 | local225 >> 2 & 0xFF;
					}
					local87 += arg1;
					local83 += arg1;
				}
				@Pc(274) int[] local274 = local63;
				local63 = local58;
				local58 = local274;
				arg1 = local52;
				arg3 = local56;
				local52 >>= 0x1;
				local56 >>= 0x1;
				local41++;
				local48 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
