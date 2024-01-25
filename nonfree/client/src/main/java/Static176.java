import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!tj;")
	public static Class193 aClass193_28;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Z")
	public static boolean aBoolean141 = false;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "S")
	public static short aShort23 = 32767;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "J")
	public static long aLong58 = -1L;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1866() {
		for (@Pc(8) int local8 = 0; local8 < Static244.anInt4894; local8++) {
			@Pc(14) int local14 = Static311.anIntArray474[local8];
			@Pc(18) Class8_Sub1_Sub2_Sub1 local18 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local14];
			@Pc(22) int local22 = Static127.aClass4_Sub11_Sub1_3.method3440();
			if ((local22 & 0x20) != 0) {
				local22 += Static127.aClass4_Sub11_Sub1_3.method3440() << 8;
			}
			Static201.method3772(local22, local14, local18);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1867() {
		if (Static194.anIntArray340 != null) {
			return;
		}
		Static194.anIntArray340 = new int[65536];
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
				@Pc(86) float local86 = local56 * (1.0F - local47);
				@Pc(94) float local94 = local56 * (1.0F - local47 * local79);
				@Pc(105) float local105 = local56 * (1.0F - (1.0F - local79) * local47);
				if (local73 == 0) {
					local58 = local56;
					local60 = local105;
					local62 = local86;
				} else if (local73 == 1) {
					local60 = local56;
					local62 = local86;
					local58 = local94;
				} else if (local73 == 2) {
					local60 = local56;
					local58 = local86;
					local62 = local105;
				} else if (local73 == 3) {
					local60 = local94;
					local58 = local86;
					local62 = local56;
				} else if (local73 == 4) {
					local58 = local105;
					local62 = local56;
					local60 = local86;
				} else if (local73 == 5) {
					local62 = local94;
					local60 = local86;
					local58 = local56;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(195) int local195 = (int) (local58 * 256.0F);
				@Pc(200) int local200 = (int) (local60 * 256.0F);
				@Pc(205) int local205 = (int) (local62 * 256.0F);
				@Pc(218) int local218 = (local200 << 8) + (local195 << 16) + local205 - 16777216;
				Static194.anIntArray340[local22++] = local218;
			}
		}
	}
}
