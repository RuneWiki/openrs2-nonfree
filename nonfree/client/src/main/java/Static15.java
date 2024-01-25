import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
	public static int anInt199;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "[S")
	private static final short[] aShortArray8 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!kea;")
	public static final Class187 aClass187_1 = new Class187(32);

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "[S")
	private static final short[] aShortArray10 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "[S")
	private static final short[] aShortArray9 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray8, aShortArray10, aShortArray9 };

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
	public static void method150() {
		if (Static184.anIntArray303 != null) {
			return;
		}
		Static184.anIntArray303 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < 512; local23++) {
			@Pc(38) float local38 = ((float) (local23 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (local23 & 0x7) / 8.0F + 0.0625F;
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
				@Pc(94) float local94 = local56 * (1.0F - local79 * local47);
				@Pc(106) float local106 = (1.0F - local47 * (1.0F - local79)) * local56;
				if (local73 == 0) {
					local60 = local106;
					local62 = local86;
					local58 = local56;
				} else if (local73 == 1) {
					local60 = local56;
					local62 = local86;
					local58 = local94;
				} else if (local73 == 2) {
					local60 = local56;
					local58 = local86;
					local62 = local106;
				} else if (local73 == 3) {
					local58 = local86;
					local62 = local56;
					local60 = local94;
				} else if (local73 == 4) {
					local60 = local86;
					local58 = local106;
					local62 = local56;
				} else if (local73 == 5) {
					local60 = local86;
					local62 = local94;
					local58 = local56;
				}
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				local62 = (float) Math.pow((double) local62, local19);
				@Pc(198) int local198 = (int) (local58 * 256.0F);
				@Pc(203) int local203 = (int) (local60 * 256.0F);
				@Pc(208) int local208 = (int) (local62 * 256.0F);
				@Pc(220) int local220 = (local203 << 8) + (local198 << 16) + local208 - 16777216;
				Static184.anIntArray303[local21++] = local220;
			}
		}
	}
}
