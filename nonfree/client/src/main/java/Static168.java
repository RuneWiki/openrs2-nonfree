import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
	public static int anInt5441 = 0;

	@OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
	public static int anInt5448 = 0;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!jda;B[[B)V")
	public static void method4649(@OriginalArg(0) Class149_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt4443; local18++) {
			Static63.method1142();
			for (@Pc(24) int local24 = 0; local24 < Static459.anInt7799 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static482.anInt7990 >> 3; local28++) {
					@Pc(38) int local38 = Static178.anIntArrayArrayArray2[local18][local24][local28];
					if (local38 != -1) {
						@Pc(48) int local48 = local38 >> 24 & 0x3;
						if (!arg0.aBoolean310 || local48 == 0) {
							@Pc(62) int local62 = local38 >> 1 & 0x3;
							@Pc(68) int local68 = local38 >> 14 & 0x3FF;
							@Pc(74) int local74 = local38 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < Static9.anIntArray23.length; local86++) {
								if (Static9.anIntArray23[local86] == local84 && arg1[local86] != null) {
									@Pc(108) Class1_Sub6 local108 = new Class1_Sub6(arg1[local86]);
									arg0.method3868(local48, local62, local68, local18, Static86.aClass91Array1, local74, local24 * 8, local28 * 8, local108);
									arg0.method3875(local108, Static513.aClass122_10, local16[0] == -1 ? local16 : null, local74, local62, local48, local24 * 8, local18, local28 * 8, local68);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local16[0] != -1) {
			Static40.aClass117_1 = Static335.aClass41_1.method1031(local16[3], local16[0], Static482.aClass82_1, local16[2], local16[1]);
			Static101.anInt7613 = local16[4];
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BII)V")
	public static void method4650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static204.method3515(arg1)) {
			Static124.method2109(Static396.aClass156ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
	public static void method4652() {
		if (Static488.anIntArray759 != null) {
			return;
		}
		Static488.anIntArray759 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
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
				@Pc(82) float local82 = (float) -local72 + local69;
				@Pc(88) float local88 = (1.0F - local50) * local59;
				@Pc(96) float local96 = (1.0F - local82 * local50) * local59;
				@Pc(108) float local108 = (1.0F - local50 * (1.0F - local82)) * local59;
				if (local76 == 0) {
					local65 = local88;
					local63 = local108;
					local61 = local59;
				} else if (local76 == 1) {
					local63 = local59;
					local61 = local96;
					local65 = local88;
				} else if (local76 == 2) {
					local65 = local108;
					local63 = local59;
					local61 = local88;
				} else if (local76 == 3) {
					local65 = local59;
					local61 = local88;
					local63 = local96;
				} else if (local76 == 4) {
					local61 = local108;
					local63 = local88;
					local65 = local59;
				} else if (local76 == 5) {
					local63 = local88;
					local61 = local59;
					local65 = local96;
				}
				local61 = (float) Math.pow((double) local61, local19);
				local63 = (float) Math.pow((double) local63, local19);
				local65 = (float) Math.pow((double) local65, local19);
				@Pc(198) int local198 = (int) (local61 * 256.0F);
				@Pc(203) int local203 = (int) (local63 * 256.0F);
				@Pc(208) int local208 = (int) (local65 * 256.0F);
				@Pc(221) int local221 = (local203 << 8) + (local198 << 16) + local208 - 16777216;
				Static488.anIntArray759[local26++] = local221;
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLclient!uda;)I")
	public static int method4654(@OriginalArg(1) Class292 arg0) {
		if (arg0 == Static252.aClass292_9) {
			return 6407;
		} else if (Static542.aClass292_17 == arg0) {
			return 6408;
		} else if (Static526.aClass292_15 == arg0) {
			return 6406;
		} else if (arg0 == Static299.aClass292_10) {
			return 6409;
		} else if (Static184.aClass292_13 == arg0) {
			return 6410;
		} else if (arg0 == Static521.aClass292_14) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
