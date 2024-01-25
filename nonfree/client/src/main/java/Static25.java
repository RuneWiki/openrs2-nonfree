import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "Lclient!ke;")
	public static Class201 aClass201_1;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
	public static int anInt416;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "Lclient!hda;")
	public static final Class146 aClass146_1 = new Class146("RC", 1);

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_10 = new Class186(64, 6);

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "Lclient!m;")
	public static final Class235 aClass235_2 = new Class235(13);

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([IIIIIIII)V")
	public static void method374(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 > 0 && !Static28.method398(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static28.method398(arg3)) {
			@Pc(66) int local66 = 0;
			@Pc(74) int local74 = arg5 < arg3 ? arg5 : arg3;
			@Pc(78) int local78 = arg5 >> 1;
			@Pc(82) int local82 = arg3 >> 1;
			@Pc(84) int[] local84 = arg0;
			@Pc(89) int[] local89 = new int[local82 * local78];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local66, arg2, arg5, arg3, 0, 32993, arg4, local84, 0);
				if (local74 <= 1) {
					return;
				}
				@Pc(109) int local109 = 0;
				@Pc(111) int local111 = 0;
				@Pc(116) int local116 = arg5;
				for (@Pc(118) int local118 = 0; local118 < local82; local118++) {
					for (@Pc(124) int local124 = 0; local124 < local78; local124++) {
						@Pc(133) int local133 = local84[local111++];
						@Pc(138) int local138 = local84[local111++];
						@Pc(143) int local143 = local84[local116++];
						@Pc(149) int local149 = local133 >> 8 & 0xFF;
						@Pc(153) int local153 = local133 & 0xFF;
						@Pc(158) int local158 = local84[local116++];
						@Pc(164) int local164 = local133 >> 16 & 0xFF;
						@Pc(170) int local170 = local133 >> 24 & 0xFF;
						@Pc(178) int local178 = local149 + (local138 >> 8 & 0xFF);
						@Pc(184) int local184 = local153 + (local138 & 0xFF);
						@Pc(192) int local192 = local170 + (local138 >> 24 & 0xFF);
						@Pc(200) int local200 = local164 + (local138 >> 16 & 0xFF);
						@Pc(206) int local206 = local184 + (local143 & 0xFF);
						@Pc(214) int local214 = local200 + (local143 >> 16 & 0xFF);
						@Pc(222) int local222 = local178 + (local143 >> 8 & 0xFF);
						@Pc(230) int local230 = local192 + (local143 >> 24 & 0xFF);
						@Pc(238) int local238 = local214 + (local158 >> 16 & 0xFF);
						@Pc(246) int local246 = local230 + (local158 >> 24 & 0xFF);
						@Pc(254) int local254 = local222 + (local158 >> 8 & 0xFF);
						@Pc(260) int local260 = local206 + (local158 & 0xFF);
						local89[local109++] = (local246 & 0x3FC) << 22 | (local238 & 0x3FC) << 14 | (local254 & 0x3FC) << 6 | local260 >> 2 & 0xFF;
					}
					local111 += arg5;
					local116 += arg5;
				}
				@Pc(315) int[] local315 = local89;
				local89 = local84;
				arg3 = local82;
				local84 = local315;
				arg5 = local78;
				local74 >>= 0x1;
				local66++;
				local82 >>= 0x1;
				local78 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
