import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!wi;")
	public static Class297 aClass297_1;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt930;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "[I")
	public static int[] anIntArray62;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public static int anInt931;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_28 = new Class381(74, 2);

	@OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
	public static final int[] anIntArray63 = new int[50];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method939() {
		if (Static305.anIntArray314 != null) {
			return;
		}
		Static305.anIntArray314 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
			@Pc(37) float local37 = ((float) (local24 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(46) float local46 = (float) (local24 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(48) int local48 = 0; local48 < 128; local48++) {
				@Pc(55) float local55 = (float) local48 / 128.0F;
				@Pc(57) float local57 = 0.0F;
				@Pc(59) float local59 = 0.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(65) float local65 = local37 / 60.0F;
				@Pc(68) int local68 = (int) local65;
				@Pc(72) int local72 = local68 % 6;
				@Pc(77) float local77 = local65 - (float) local68;
				@Pc(84) float local84 = (1.0F - local46) * local55;
				@Pc(93) float local93 = local55 * (1.0F - local77 * local46);
				@Pc(104) float local104 = (1.0F - local46 * (1.0F - local77)) * local55;
				if (local72 == 0) {
					local57 = local55;
					local61 = local84;
					local59 = local104;
				} else if (local72 == 1) {
					local59 = local55;
					local57 = local93;
					local61 = local84;
				} else if (local72 == 2) {
					local57 = local84;
					local59 = local55;
					local61 = local104;
				} else if (local72 == 3) {
					local61 = local55;
					local59 = local93;
					local57 = local84;
				} else if (local72 == 4) {
					local57 = local104;
					local61 = local55;
					local59 = local84;
				} else if (local72 == 5) {
					local61 = local93;
					local57 = local55;
					local59 = local84;
				}
				local57 = (float) Math.pow((double) local57, local20);
				local59 = (float) Math.pow((double) local59, local20);
				local61 = (float) Math.pow((double) local61, local20);
				@Pc(205) int local205 = (int) (local57 * 256.0F);
				@Pc(210) int local210 = (int) (local59 * 256.0F);
				@Pc(215) int local215 = (int) (local61 * 256.0F);
				@Pc(228) int local228 = local215 + (local205 << 16) + (local210 << 8) - 16777216;
				Static305.anIntArray314[local22++] = local228;
			}
		}
	}
}
