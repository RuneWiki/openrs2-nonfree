import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!gq", name = "B", descriptor = "Lclient!da;")
	public static Class67 aClass67_6;

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_54 = new Class241(40, 7);

	@OriginalMember(owner = "client!gq", name = "I", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_55 = new Class241(69, 7);

	@OriginalMember(owner = "client!gq", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "I")
	public static int anInt4119 = 0;

	@OriginalMember(owner = "client!gq", name = "G", descriptor = "[F")
	public static final float[] aFloatArray42 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)V")
	public static void method3787() {
		if (Static229.anIntArray228 != null) {
			return;
		}
		Static229.anIntArray228 = new int[65536];
		@Pc(28) double local28 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(30) int local30 = 0; local30 < 65536; local30++) {
			@Pc(44) double local44 = (double) (local30 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(55) double local55 = (double) (local30 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(62) double local62 = (double) (local30 & 0x7F) / 128.0D;
			@Pc(64) double local64 = local62;
			@Pc(66) double local66 = local62;
			@Pc(68) double local68 = local62;
			if (local55 != 0.0D) {
				@Pc(86) double local86;
				if (local62 < 0.5D) {
					local86 = local62 * (local55 + 1.0D);
				} else {
					local86 = local62 + local55 - local62 * local55;
				}
				@Pc(100) double local100 = local62 * 2.0D - local86;
				@Pc(104) double local104 = local44 + 0.3333333333333333D;
				if (local104 > 1.0D) {
					local104--;
				}
				@Pc(118) double local118 = local44 - 0.3333333333333333D;
				if (local118 < 0.0D) {
					local118++;
				}
				if (local104 * 6.0D < 1.0D) {
					local64 = local100 + (local86 - local100) * 6.0D * local104;
				} else if (local104 * 2.0D < 1.0D) {
					local64 = local86;
				} else if (local104 * 3.0D < 2.0D) {
					local64 = (0.6666666666666666D - local104) * (-local100 + local86) * 6.0D + local100;
				} else {
					local64 = local100;
				}
				if (local44 * 6.0D < 1.0D) {
					local66 = local100 + (local86 - local100) * 6.0D * local44;
				} else if (local44 * 2.0D < 1.0D) {
					local66 = local86;
				} else if (local44 * 3.0D < 2.0D) {
					local66 = (0.6666666666666666D - local44) * (local86 - local100) * 6.0D + local100;
				} else {
					local66 = local100;
				}
				if (local118 * 6.0D < 1.0D) {
					local68 = (local86 - local100) * 6.0D * local118 + local100;
				} else if (local118 * 2.0D < 1.0D) {
					local68 = local86;
				} else if (local118 * 3.0D < 2.0D) {
					local68 = local100 + (local86 - local100) * (-local118 + 0.6666666666666666D) * 6.0D;
				} else {
					local68 = local100;
				}
			}
			local64 = Math.pow(local64, local28);
			local66 = Math.pow(local66, local28);
			local68 = Math.pow(local68, local28);
			@Pc(309) int local309 = (int) (local64 * 256.0D);
			@Pc(314) int local314 = (int) (local66 * 256.0D);
			@Pc(319) int local319 = (int) (local68 * 256.0D);
			@Pc(329) int local329 = local319 + (local309 << 16) + (local314 << 8);
			Static229.anIntArray228[local30] = local329;
		}
	}
}
