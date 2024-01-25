import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
	public static int anInt7761;

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "Lclient!pi;")
	public static Class247 aClass247_1;

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "Lclient!gda;")
	public static Class117 aClass117_2;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject25;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_106 = new Class160(81, -1);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	public static void method6429() {
		if (Static6.anIntArray272 != null) {
			return;
		}
		Static6.anIntArray272 = new int[65536];
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
				@Pc(78) float local78 = local66 - (float) local69;
				@Pc(84) float local84 = local56 * (1.0F - local47);
				@Pc(93) float local93 = (1.0F - local78 * local47) * local56;
				@Pc(103) float local103 = (1.0F - (1.0F - local78) * local47) * local56;
				if (local73 == 0) {
					local58 = local56;
					local60 = local103;
					local62 = local84;
				} else if (local73 == 1) {
					local60 = local56;
					local58 = local93;
					local62 = local84;
				} else if (local73 == 2) {
					local62 = local103;
					local60 = local56;
					local58 = local84;
				} else if (local73 == 3) {
					local60 = local93;
					local58 = local84;
					local62 = local56;
				} else if (local73 == 4) {
					local58 = local103;
					local62 = local56;
					local60 = local84;
				} else if (local73 == 5) {
					local60 = local84;
					local58 = local56;
					local62 = local93;
				}
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				local62 = (float) Math.pow((double) local62, local19);
				@Pc(194) int local194 = (int) (local58 * 256.0F);
				@Pc(199) int local199 = (int) (local60 * 256.0F);
				@Pc(204) int local204 = (int) (local62 * 256.0F);
				@Pc(217) int local217 = (local194 << 16) + ((local199 << 8) + local204 - 16777216);
				Static6.anIntArray272[local21++] = local217;
			}
		}
	}
}
