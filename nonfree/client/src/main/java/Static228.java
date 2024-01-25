import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!jj", name = "Kb", descriptor = "[I")
	public static int[] anIntArray442;

	@OriginalMember(owner = "client!jj", name = "Jb", descriptor = "[B")
	public static final byte[] aByteArray67 = new byte[2048];

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "(II)I")
	public static int method3981(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "(I)V")
	public static void method3982() {
		if (Static212.anIntArray347 != null) {
			return;
		}
		Static212.anIntArray347 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(34) double local34 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(45) double local45 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(52) double local52 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(54) double local54 = local52;
			@Pc(56) double local56 = local52;
			@Pc(58) double local58 = local52;
			if (local45 != 0.0D) {
				@Pc(72) double local72;
				if (local52 < 0.5D) {
					local72 = local52 * (local45 + 1.0D);
				} else {
					local72 = local45 + local52 - local52 * local45;
				}
				@Pc(89) double local89 = local52 * 2.0D - local72;
				@Pc(93) double local93 = local34 + 0.3333333333333333D;
				if (local93 > 1.0D) {
					local93--;
				}
				@Pc(107) double local107 = local34 - 0.3333333333333333D;
				if (local93 * 6.0D < 1.0D) {
					local54 = local89 + (local72 - local89) * 6.0D * local93;
				} else if (local93 * 2.0D < 1.0D) {
					local54 = local72;
				} else if (local93 * 3.0D < 2.0D) {
					local54 = local89 + (local72 - local89) * 6.0D * (0.6666666666666666D - local93);
				} else {
					local54 = local89;
				}
				if (local107 < 0.0D) {
					local107++;
				}
				if (local34 * 6.0D < 1.0D) {
					local56 = local89 + local34 * 6.0D * (local72 - local89);
				} else if (local34 * 2.0D < 1.0D) {
					local56 = local72;
				} else if (local34 * 3.0D < 2.0D) {
					local56 = (local72 - local89) * 6.0D * (0.6666666666666666D - local34) + local89;
				} else {
					local56 = local89;
				}
				if (local107 * 6.0D < 1.0D) {
					local58 = local107 * (local72 - local89) * 6.0D + local89;
				} else if (local107 * 2.0D < 1.0D) {
					local58 = local72;
				} else if (local107 * 3.0D < 2.0D) {
					local58 = local89 + (local72 - local89) * 6.0D * (0.6666666666666666D - local107);
				} else {
					local58 = local89;
				}
			}
			local54 = Math.pow(local54, local19);
			local56 = Math.pow(local56, local19);
			local58 = Math.pow(local58, local19);
			@Pc(287) int local287 = (int) (local54 * 256.0D);
			@Pc(292) int local292 = (int) (local56 * 256.0D);
			@Pc(297) int local297 = (int) (local58 * 256.0D);
			@Pc(307) int local307 = local297 + (local292 << 8) + (local287 << 16);
			Static212.anIntArray347[local21] = local307;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method3983(@OriginalArg(1) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static357.anInt6307;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class240 local27 = Static526.aClass216_1.method5177(arg0[local18]);
			if (local27.anInt6881 != -1) {
				@Pc(41) Class2 local41 = (Class2) Static27.aClass313_3.method7406((long) local27.anInt6881);
				if (local41 == null) {
					@Pc(49) Class136 local49 = Static552.method3541(Static543.aClass171_154, local27.anInt6881, 0);
					if (local49 != null) {
						local41 = Static513.aClass122_10.method7220(local49);
						Static27.aClass313_3.method7399((long) local27.anInt6881, local41);
					}
				}
				if (local41 != null) {
					Static72.aClass2Array2[local16] = local41;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}
}
