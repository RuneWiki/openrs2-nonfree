import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
	public static int anInt3373 = -1;

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_173 = new Class12(50, 8);

	@OriginalMember(owner = "client!iv", name = "B", descriptor = "Z")
	public static boolean aBoolean265 = false;

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)V")
	public static void method2888() {
		if (Static95.anIntArray92 != null) {
			return;
		}
		Static95.anIntArray92 = new int[65536];
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
				@Pc(82) float local82 = (float) -local72 + local69;
				@Pc(88) float local88 = (1.0F - local50) * local59;
				@Pc(96) float local96 = local59 * (1.0F - local82 * local50);
				@Pc(106) float local106 = local59 * (1.0F - local50 * (1.0F - local82));
				if (local76 == 0) {
					local63 = local106;
					local61 = local59;
					local65 = local88;
				} else if (local76 == 1) {
					local65 = local88;
					local63 = local59;
					local61 = local96;
				} else if (local76 == 2) {
					local63 = local59;
					local61 = local88;
					local65 = local106;
				} else if (local76 == 3) {
					local63 = local96;
					local65 = local59;
					local61 = local88;
				} else if (local76 == 4) {
					local61 = local106;
					local65 = local59;
					local63 = local88;
				} else if (local76 == 5) {
					local61 = local59;
					local65 = local96;
					local63 = local88;
				}
				local61 = (float) Math.pow((double) local61, local24);
				local63 = (float) Math.pow((double) local63, local24);
				local65 = (float) Math.pow((double) local65, local24);
				@Pc(199) int local199 = (int) (local61 * 256.0F);
				@Pc(204) int local204 = (int) (local63 * 256.0F);
				@Pc(209) int local209 = (int) (local65 * 256.0F);
				@Pc(222) int local222 = local209 + (local204 << 8) + (local199 << 16) - 16777216;
				Static95.anIntArray92[local26++] = local222;
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)V")
	public static void method2889() {
		if (Static403.anInt7143 == 5) {
			Static403.anInt7143 = 6;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method2890(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static165.method3932(arg3, -1, arg4, arg2, null, arg1, arg0);
	}
}
