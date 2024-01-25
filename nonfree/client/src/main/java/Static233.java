import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
	public static int anInt5198;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)V")
	public static void method4262() {
		if (Static396.anIntArray370 != null) {
			return;
		}
		Static396.anIntArray370 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(82) float local82 = (float) -local72 + local69;
				@Pc(89) float local89 = (1.0F - local50) * local59;
				@Pc(97) float local97 = local59 * (1.0F - local50 * local82);
				@Pc(109) float local109 = (1.0F - (1.0F - local82) * local50) * local59;
				if (local76 == 0) {
					local63 = local109;
					local61 = local59;
					local65 = local89;
				} else if (local76 == 1) {
					local63 = local59;
					local61 = local97;
					local65 = local89;
				} else if (local76 == 2) {
					local61 = local89;
					local65 = local109;
					local63 = local59;
				} else if (local76 == 3) {
					local61 = local89;
					local63 = local97;
					local65 = local59;
				} else if (local76 == 4) {
					local63 = local89;
					local65 = local59;
					local61 = local109;
				} else if (local76 == 5) {
					local65 = local97;
					local61 = local59;
					local63 = local89;
				}
				local61 = (float) Math.pow((double) local61, local19);
				local63 = (float) Math.pow((double) local63, local19);
				local65 = (float) Math.pow((double) local65, local19);
				@Pc(203) int local203 = (int) (local61 * 256.0F);
				@Pc(208) int local208 = (int) (local63 * 256.0F);
				@Pc(213) int local213 = (int) (local65 * 256.0F);
				@Pc(226) int local226 = (local203 << 16) + ((local208 << 8) + local213 - 16777216);
				Static396.anIntArray370[local21++] = local226;
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILclient!vha;ILclient!ha;IB)V")
	public static void method4264(@OriginalArg(0) int arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(4) int arg4) {
		@Pc(19) Class17 local19 = Static386.aClass341_2.method7998(arg1.anInt10249);
		if (local19.anInt639 == -1) {
			return;
		}
		if (arg1.aBoolean803) {
			@Pc(33) int local33 = arg0 + arg1.anInt10227;
			arg0 = local33 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(49) Class4 local49 = local19.method605(arg1.lb, arg0, arg3);
		if (local49 == null) {
			return;
		}
		@Pc(55) int local55 = arg1.anInt10250;
		@Pc(58) int local58 = arg1.anInt10238;
		if ((arg0 & 0x1) == 1) {
			local58 = arg1.anInt10250;
			local55 = arg1.anInt10238;
		}
		@Pc(72) int local72 = local49.method7700();
		@Pc(75) int local75 = local49.method7712();
		if (local19.aBoolean66) {
			local75 = local58 * 4;
			local72 = local55 * 4;
		}
		if (local19.anInt644 == 0) {
			local49.method7689(arg2, arg4 - (local58 - 1) * 4, local72, local75);
		} else {
			local49.method7690(arg2, arg4 + 4 - local58 * 4, local72, local75, 0, local19.anInt644 | 0xFF000000, 1);
		}
	}
}
