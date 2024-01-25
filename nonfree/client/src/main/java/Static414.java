import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!ot", name = "H", descriptor = "Z")
	public static volatile boolean aBoolean535 = true;

	@OriginalMember(owner = "client!ot", name = "U", descriptor = "I")
	public static int anInt7569 = -1;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIB)I")
	public static int method6546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static35.anIntArray27[arg0 & 0x3] : Static296.anIntArray283[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(III)Z")
	public static boolean method6550(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(Z)V")
	public static void method6551() {
		if (Static355.aBoolean492) {
			return;
		}
		Static504.method7454(Static68.aClass77ArrayArrayArray1);
		if (Static338.aClass77ArrayArrayArray3 != null) {
			Static504.method7454(Static338.aClass77ArrayArrayArray3);
		}
		Static355.aBoolean492 = true;
	}

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "(I)V")
	public static void method6555() {
		if (Static513.anIntArray548 != null) {
			return;
		}
		Static513.anIntArray548 = new int[65536];
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
				@Pc(89) float local89 = (1.0F - local50) * local59;
				@Pc(97) float local97 = (1.0F - local82 * local50) * local59;
				@Pc(108) float local108 = (1.0F - local50 * (1.0F - local82)) * local59;
				if (local76 == 0) {
					local63 = local108;
					local61 = local59;
					local65 = local89;
				} else if (local76 == 1) {
					local61 = local97;
					local65 = local89;
					local63 = local59;
				} else if (local76 == 2) {
					local63 = local59;
					local65 = local108;
					local61 = local89;
				} else if (local76 == 3) {
					local61 = local89;
					local65 = local59;
					local63 = local97;
				} else if (local76 == 4) {
					local61 = local108;
					local63 = local89;
					local65 = local59;
				} else if (local76 == 5) {
					local61 = local59;
					local65 = local97;
					local63 = local89;
				}
				local61 = (float) Math.pow((double) local61, local19);
				local63 = (float) Math.pow((double) local63, local19);
				local65 = (float) Math.pow((double) local65, local19);
				@Pc(200) int local200 = (int) (local61 * 256.0F);
				@Pc(205) int local205 = (int) (local63 * 256.0F);
				@Pc(210) int local210 = (int) (local65 * 256.0F);
				@Pc(222) int local222 = local210 + (local205 << 8) + (local200 << 16) - 16777216;
				Static513.anIntArray548[local26++] = local222;
			}
		}
	}
}
