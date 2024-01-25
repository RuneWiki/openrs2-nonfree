import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!pca", name = "D", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_140 = new Class268(54, -1);

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V")
	public static void method6695() {
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			Static303.aBooleanArray32[local12] = false;
		}
		Static358.anInt6653 = 0;
		Static239.anInt4786 = Static580.anInt9662;
		Static489.anInt8504 = Static263.anInt5239;
		Static222.anInt4352 = 0;
		Static518.anInt9068 = -1;
		Static334.anInt6354 = 5;
		Static393.anInt7360 = Static428.anInt7788;
		Static228.anInt4471 = Static524.anInt9123;
		Static224.anInt4365 = -1;
		Static511.anInt8899 = Static113.anInt2243;
		Static563.anInt9556 = Static470.anInt8261;
		Static624.anInt10280 = -1;
		Static160.anInt3352 = -1;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(JJ)J")
	public static long method6698(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "(B)V")
	public static void method6699() {
		if (Static152.anIntArray292 != null) {
			return;
		}
		Static152.anIntArray292 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(42) float local42 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(51) float local51 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(53) int local53 = 0; local53 < 128; local53++) {
				@Pc(60) float local60 = (float) local53 / 128.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(70) float local70 = local42 / 60.0F;
				@Pc(73) int local73 = (int) local70;
				@Pc(77) int local77 = local73 % 6;
				@Pc(83) float local83 = (float) -local73 + local70;
				@Pc(90) float local90 = local60 * (1.0F - local51);
				@Pc(98) float local98 = (1.0F - local83 * local51) * local60;
				@Pc(109) float local109 = (1.0F - local51 * (1.0F - local83)) * local60;
				if (local77 == 0) {
					local64 = local109;
					local62 = local60;
					local66 = local90;
				} else if (local77 == 1) {
					local62 = local98;
					local64 = local60;
					local66 = local90;
				} else if (local77 == 2) {
					local64 = local60;
					local66 = local109;
					local62 = local90;
				} else if (local77 == 3) {
					local62 = local90;
					local64 = local98;
					local66 = local60;
				} else if (local77 == 4) {
					local62 = local109;
					local66 = local60;
					local64 = local90;
				} else if (local77 == 5) {
					local62 = local60;
					local66 = local98;
					local64 = local90;
				}
				local62 = (float) Math.pow((double) local62, local20);
				local64 = (float) Math.pow((double) local64, local20);
				local66 = (float) Math.pow((double) local66, local20);
				@Pc(200) int local200 = (int) (local62 * 256.0F);
				@Pc(205) int local205 = (int) (local64 * 256.0F);
				@Pc(210) int local210 = (int) (local66 * 256.0F);
				@Pc(222) int local222 = local210 + (local200 << 16) + (local205 << 8) - 16777216;
				Static152.anIntArray292[local22++] = local222;
			}
		}
	}
}
