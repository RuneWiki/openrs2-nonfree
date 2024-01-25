import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!i", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLclient!la;Ljava/lang/String;I)V")
	public static void method4683(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) String arg2) {
		@Pc(26) int local26 = Static414.aClass89_9.method1997(arg2, 250, null);
		@Pc(35) int local35 = Static414.aClass89_9.method1985(arg2, null, 250) * 13;
		Static185.aClass34_7.P(6, 6, local26 + 4 + 4, local35 + 4 + 4, -16777216, 0);
		Static185.aClass34_7.method5769(6, 6, local26 + 4 + 4, local35 + 4 + 4, -1, 0);
		arg1.method4585(local35, 10, null, null, 0, null, -1, local26, 1, 0, arg2, 10, -1);
		Static384.method5031(6, local35 + 4 + 4, local26 + 4 - -4, 6);
		if (arg0) {
			Static185.aClass34_7.method5781();
		}
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
	public static void method4685() {
		if (Static134.anIntArray161 != null) {
			return;
		}
		Static134.anIntArray161 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(26) int local26 = 0;
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
				@Pc(81) float local81 = local69 - (float) local72;
				@Pc(87) float local87 = local59 * (1.0F - local50);
				@Pc(96) float local96 = local59 * (1.0F - local81 * local50);
				@Pc(108) float local108 = local59 * (1.0F - local50 * (1.0F - local81));
				if (local76 == 0) {
					local63 = local108;
					local61 = local59;
					local65 = local87;
				} else if (local76 == 1) {
					local65 = local87;
					local63 = local59;
					local61 = local96;
				} else if (local76 == 2) {
					local65 = local108;
					local63 = local59;
					local61 = local87;
				} else if (local76 == 3) {
					local63 = local96;
					local65 = local59;
					local61 = local87;
				} else if (local76 == 4) {
					local65 = local59;
					local63 = local87;
					local61 = local108;
				} else if (local76 == 5) {
					local63 = local87;
					local61 = local59;
					local65 = local96;
				}
				local61 = (float) Math.pow((double) local61, local24);
				local63 = (float) Math.pow((double) local63, local24);
				local65 = (float) Math.pow((double) local65, local24);
				@Pc(198) int local198 = (int) (local61 * 256.0F);
				@Pc(203) int local203 = (int) (local63 * 256.0F);
				@Pc(208) int local208 = (int) (local65 * 256.0F);
				@Pc(221) int local221 = local208 + (local198 << 16) + (local203 << 8) - 16777216;
				Static134.anIntArray161[local26++] = local221;
			}
		}
	}
}
