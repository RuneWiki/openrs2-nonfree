import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "Lclient!ra;")
	public static Class170 aClass170_75;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "Lclient!am;")
	public static Class10 aClass10_3;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "[S")
	public static short[] aShortArray47;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "[I")
	public static final int[] anIntArray284 = new int[256];

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString232 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V")
	public static void method3623() {
		if (Static82.anIntArray113 != null) {
			return;
		}
		Static82.anIntArray113 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
			@Pc(38) float local38 = ((float) (local24 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (local24 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(49) int local49 = 0; local49 < 128; local49++) {
				@Pc(56) float local56 = (float) local49 / 128.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(66) float local66 = local38 / 60.0F;
				@Pc(69) int local69 = (int) local66;
				@Pc(73) int local73 = local69 % 6;
				@Pc(78) float local78 = local66 - (float) local69;
				@Pc(84) float local84 = (1.0F - local47) * local56;
				@Pc(93) float local93 = local56 * (1.0F - local78 * local47);
				@Pc(103) float local103 = (1.0F - local47 * (1.0F - local78)) * local56;
				if (local73 == 0) {
					local62 = local84;
					local60 = local103;
					local58 = local56;
				} else if (local73 == 1) {
					local62 = local84;
					local58 = local93;
					local60 = local56;
				} else if (local73 == 2) {
					local60 = local56;
					local62 = local103;
					local58 = local84;
				} else if (local73 == 3) {
					local60 = local93;
					local58 = local84;
					local62 = local56;
				} else if (local73 == 4) {
					local62 = local56;
					local60 = local84;
					local58 = local103;
				} else if (local73 == 5) {
					local60 = local84;
					local58 = local56;
					local62 = local93;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(195) int local195 = (int) (local58 * 256.0F);
				@Pc(200) int local200 = (int) (local60 * 256.0F);
				@Pc(205) int local205 = (int) (local62 * 256.0F);
				@Pc(218) int local218 = (local195 << 16) + (local200 << 8) + local205 - 16777216;
				Static82.anIntArray113[local22++] = local218;
			}
		}
	}
}
