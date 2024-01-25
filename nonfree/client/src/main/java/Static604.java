import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!uia", name = "g", descriptor = "Lclient!ib;")
	public static final Class5_Sub23 aClass5_Sub23_10 = new Class5_Sub23(1350);

	@OriginalMember(owner = "client!uia", name = "e", descriptor = "Lclient!pda;")
	public static Class5_Sub5_Sub18 aClass5_Sub5_Sub18_1 = null;

	@OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
	public static int anInt10083 = 100;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IIIII[FI)V")
	public static void method8663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static45.method8836(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static45.method8836(arg1)) {
			@Pc(45) int local45 = Static331.method5045(6408);
			@Pc(54) int local54 = 0;
			@Pc(62) int local62 = arg2 < arg1 ? arg2 : arg1;
			@Pc(66) int local66 = arg2 >> 1;
			@Pc(70) int local70 = arg1 >> 1;
			@Pc(72) float[] local72 = arg4;
			@Pc(79) float[] local79 = new float[local45 * local66 * local70];
			while (true) {
				OpenGL.glTexImage2Df(3553, local54, 34842, arg2, arg1, 0, 6408, 5126, local72, 0);
				if (local62 <= 1) {
					return;
				}
				@Pc(99) int local99 = local45 * arg2;
				for (@Pc(101) int local101 = 0; local101 < local45; local101++) {
					@Pc(107) int local107 = local101;
					@Pc(109) int local109 = local101;
					@Pc(113) int local113 = local99 + local101;
					for (@Pc(115) int local115 = 0; local115 < local70; local115++) {
						for (@Pc(119) int local119 = 0; local119 < local66; local119++) {
							@Pc(125) float local125 = local72[local109];
							local109 += local45;
							@Pc(135) float local135 = local125 + local72[local109];
							@Pc(141) float local141 = local135 + local72[local113];
							local109 += local45;
							local113 += local45;
							@Pc(155) float local155 = local141 + local72[local113];
							local113 += local45;
							local79[local107] = local155 * 0.25F;
							local107 += local45;
						}
						local109 += local99;
						local113 += local99;
					}
				}
				@Pc(197) float[] local197 = local79;
				local79 = local72;
				arg1 = local70;
				local72 = local197;
				arg2 = local66;
				local70 >>= 0x1;
				local66 >>= 0x1;
				local62 >>= 0x1;
				local54++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)V")
	public static void method8667() {
		if (Static560.anIntArray534 != null) {
			return;
		}
		Static560.anIntArray534 = new int[65536];
		@Pc(23) double local23 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(32) int local32 = 0; local32 < 65536; local32++) {
			@Pc(46) double local46 = (double) (local32 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(57) double local57 = (double) (local32 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(64) double local64 = (double) (local32 & 0x7F) / 128.0D;
			@Pc(66) double local66 = local64;
			@Pc(68) double local68 = local64;
			@Pc(70) double local70 = local64;
			if (local57 != 0.0D) {
				@Pc(88) double local88;
				if (local64 < 0.5D) {
					local88 = (local57 + 1.0D) * local64;
				} else {
					local88 = local57 + local64 - local57 * local64;
				}
				@Pc(102) double local102 = local64 * 2.0D - local88;
				@Pc(106) double local106 = local46 + 0.3333333333333333D;
				if (local106 > 1.0D) {
					local106--;
				}
				@Pc(120) double local120 = local46 - 0.3333333333333333D;
				if (local46 * 6.0D < 1.0D) {
					local68 = local102 + local46 * 6.0D * (local88 - local102);
				} else if (local46 * 2.0D < 1.0D) {
					local68 = local88;
				} else if (local46 * 3.0D < 2.0D) {
					local68 = (local88 - local102) * 6.0D * (0.6666666666666666D - local46) + local102;
				} else {
					local68 = local102;
				}
				if (local106 * 6.0D < 1.0D) {
					local66 = local102 + (local88 - local102) * 6.0D * local106;
				} else if (local106 * 2.0D < 1.0D) {
					local66 = local88;
				} else if (local106 * 3.0D < 2.0D) {
					local66 = local102 + (local88 - local102) * (0.6666666666666666D - local106) * 6.0D;
				} else {
					local66 = local102;
				}
				if (local120 < 0.0D) {
					local120++;
				}
				if (local120 * 6.0D < 1.0D) {
					local70 = (local88 - local102) * 6.0D * local120 + local102;
				} else if (local120 * 2.0D < 1.0D) {
					local70 = local88;
				} else if (local120 * 3.0D < 2.0D) {
					local70 = local102 + (0.6666666666666666D - local120) * (-local102 + local88) * 6.0D;
				} else {
					local70 = local102;
				}
			}
			local66 = Math.pow(local66, local23);
			local68 = Math.pow(local68, local23);
			local70 = Math.pow(local70, local23);
			@Pc(311) int local311 = (int) (local66 * 256.0D);
			@Pc(316) int local316 = (int) (local68 * 256.0D);
			@Pc(321) int local321 = (int) (local70 * 256.0D);
			@Pc(331) int local331 = local321 + (local316 << 8) + (local311 << 16);
			Static560.anIntArray534[local32] = local331;
		}
	}
}
