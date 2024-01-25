import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!ws", name = "I", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!ws", name = "K", descriptor = "I")
	public static int anInt7811;

	@OriginalMember(owner = "client!ws", name = "M", descriptor = "I")
	public static int anInt7813;

	@OriginalMember(owner = "client!ws", name = "Q", descriptor = "I")
	public static int anInt7817 = 0;

	@OriginalMember(owner = "client!ws", name = "R", descriptor = "[I")
	public static int[] anIntArray687 = new int[1];

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIBI[FI)V")
	public static void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static304.method4356(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static304.method4356(arg0)) {
			@Pc(31) int local31 = Static368.method5070(6408);
			@Pc(33) int local33 = 0;
			@Pc(48) int local48 = arg0 <= arg5 ? arg0 : arg5;
			@Pc(52) int local52 = arg5 >> 1;
			@Pc(56) int local56 = arg0 >> 1;
			@Pc(58) float[] local58 = arg4;
			@Pc(65) float[] local65 = new float[local52 * local56 * local31];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg5, arg0, 0, 6408, 5126, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(84) int local84 = arg5 * local31;
				for (@Pc(86) int local86 = 0; local86 < local31; local86++) {
					@Pc(90) int local90 = local86;
					@Pc(92) int local92 = local86;
					@Pc(96) int local96 = local84 + local86;
					for (@Pc(98) int local98 = 0; local98 < local56; local98++) {
						for (@Pc(102) int local102 = 0; local102 < local52; local102++) {
							@Pc(108) float local108 = local58[local92];
							local92 += local31;
							@Pc(118) float local118 = local108 + local58[local92];
							local92 += local31;
							@Pc(128) float local128 = local118 + local58[local96];
							local96 += local31;
							@Pc(138) float local138 = local128 + local58[local96];
							local96 += local31;
							local65[local90] = local138 * 0.25F;
							local90 += local31;
						}
						local92 += local84;
						local96 += local84;
					}
				}
				@Pc(182) float[] local182 = local65;
				local65 = local58;
				local58 = local182;
				arg5 = local52;
				arg0 = local56;
				local33++;
				local56 >>= 0x1;
				local52 >>= 0x1;
				local48 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(BI)V")
	public static void method6064(@OriginalArg(1) int arg0) {
		if (Static387.anIntArray560 == null || Static387.anIntArray560.length < arg0) {
			Static387.anIntArray560 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBLclient!ss;Lclient!ea;IIIJI)V")
	public static void method6065(@OriginalArg(0) int arg0, @OriginalArg(2) Class219 arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg7 * arg7 + arg0 * arg0;
		if (arg6 < (long) local12) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg1.anInt6398 / 2, arg1.anInt6363 / 2);
		if (local12 <= local32 * local32) {
			Static157.method2368(arg2, arg5, arg7, arg0, arg1, Static329.aClass80Array14[arg4], arg3);
			return;
		}
		local32 -= 10;
		@Pc(68) int local68;
		if (Static310.anInt5540 == 4) {
			local68 = (int) Static274.aFloat78 & 0x3FFF;
		} else {
			local68 = (int) Static274.aFloat78 + Static182.anInt7140 & 0x3FFF;
		}
		@Pc(79) int local79 = Class4.anIntArray7[local68];
		@Pc(83) int local83 = Class4.anIntArray6[local68];
		if (Static310.anInt5540 != 4) {
			local83 = local83 * 256 / (Static427.anInt7386 + 256);
			local79 = local79 * 256 / (Static427.anInt7386 + 256);
		}
		@Pc(114) int local114 = arg7 * local83 + arg0 * local79 >> 15;
		@Pc(125) int local125 = arg0 * local83 - arg7 * local79 >> 15;
		@Pc(131) double local131 = Math.atan2((double) local114, (double) local125);
		@Pc(138) int local138 = (int) (Math.sin(local131) * (double) local32);
		@Pc(145) int local145 = (int) ((double) local32 * Math.cos(local131));
		Static185.aClass80Array3[arg4].method6097((float) local138 + (float) arg1.anInt6398 / 2.0F + (float) arg3, (float) -local145 + (float) arg5 + (float) arg1.anInt6363 / 2.0F, 4096, (int) (-local131 / 6.283185307179586D * 65535.0D));
	}
}
