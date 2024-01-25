import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "Lclient!mn;")
	public static Class171 aClass171_80;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "[F")
	public static final float[] aFloatArray15 = new float[16];

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "Z")
	public static boolean aBoolean431 = false;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public static void method4962() {
		if (Static268.anIntArray402 != null) {
			return;
		}
		Static268.anIntArray402 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (int var3 = 0; var3 < 512; var3++) {
			@Pc(38) float local38 = ((float) (var3 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (var3 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(49) int local49 = 0; local49 < 128; local49++) {
				@Pc(56) float local56 = (float) local49 / 128.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(66) float local66 = local38 / 60.0F;
				@Pc(69) int local69 = (int) local66;
				@Pc(73) int local73 = local69 % 6;
				@Pc(79) float local79 = (float) -local69 + local66;
				@Pc(86) float local86 = (1.0F - local47) * local56;
				@Pc(95) float local95 = local56 * (1.0F - local47 * local79);
				@Pc(106) float local106 = local56 * (1.0F - (1.0F - local79) * local47);
				if (local73 == 0) {
					local62 = local86;
					local60 = local106;
					local58 = local56;
				} else if (local73 == 1) {
					local60 = local56;
					local62 = local86;
					local58 = local95;
				} else if (local73 == 2) {
					local62 = local106;
					local58 = local86;
					local60 = local56;
				} else if (local73 == 3) {
					local58 = local86;
					local62 = local56;
					local60 = local95;
				} else if (local73 == 4) {
					local58 = local106;
					local60 = local86;
					local62 = local56;
				} else if (local73 == 5) {
					local60 = local86;
					local62 = local95;
					local58 = local56;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(200) int local200 = (int) (local58 * 256.0F);
				@Pc(205) int local205 = (int) (local60 * 256.0F);
				@Pc(210) int local210 = (int) (local62 * 256.0F);
				@Pc(223) int local223 = local210 + (local200 << 16) + (local205 << 8) - 16777216;
				Static268.anIntArray402[local22++] = local223;
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
	public static void method4964() {
		if (Static350.aClass62_2 != null) {
			Static350.aClass62_2.method2404();
		}
		if (Static147.aClass62_1 != null) {
			Static147.aClass62_1.method2404();
		}
	}
}
