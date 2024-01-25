import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "Lclient!mo;")
	public static Class143 aClass143_88;

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
	public static int anInt4637;

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "Lclient!mo;")
	public static Class143 aClass143_89;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString174 = " has logged out.";

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
	public static int anInt4633 = 0;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "[Lclient!om;")
	public static final Class14_Sub2_Sub15[] aClass14_Sub2_Sub15Array3 = new Class14_Sub2_Sub15[14];

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)I")
	public static int method4149() {
		if (Static267.aFrame1 == null) {
			return Static335.aBoolean434 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!mo;I)V")
	public static void method4152(@OriginalArg(0) Class143 arg0) {
		Static115.aClass143_57 = arg0;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V")
	public static void method4153() {
		if (Static71.anIntArray514 != null) {
			return;
		}
		Static71.anIntArray514 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < 512; local23++) {
			@Pc(36) float local36 = ((float) (local23 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(45) float local45 = (float) (local23 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(47) int local47 = 0; local47 < 128; local47++) {
				@Pc(54) float local54 = (float) local47 / 128.0F;
				@Pc(56) float local56 = 0.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(64) float local64 = local36 / 60.0F;
				@Pc(67) int local67 = (int) local64;
				@Pc(71) int local71 = local67 % 6;
				@Pc(77) float local77 = (float) -local67 + local64;
				@Pc(83) float local83 = local54 * (1.0F - local45);
				@Pc(92) float local92 = (1.0F - local45 * local77) * local54;
				@Pc(103) float local103 = (1.0F - (1.0F - local77) * local45) * local54;
				if (local71 == 0) {
					local56 = local54;
					local60 = local83;
					local58 = local103;
				} else if (local71 == 1) {
					local56 = local92;
					local60 = local83;
					local58 = local54;
				} else if (local71 == 2) {
					local56 = local83;
					local58 = local54;
					local60 = local103;
				} else if (local71 == 3) {
					local58 = local92;
					local56 = local83;
					local60 = local54;
				} else if (local71 == 4) {
					local58 = local83;
					local60 = local54;
					local56 = local103;
				} else if (local71 == 5) {
					local58 = local83;
					local56 = local54;
					local60 = local92;
				}
				local56 = (float) Math.pow((double) local56, local19);
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				@Pc(198) int local198 = (int) (local56 * 256.0F);
				@Pc(203) int local203 = (int) (local58 * 256.0F);
				@Pc(208) int local208 = (int) (local60 * 256.0F);
				@Pc(221) int local221 = (local203 << 8) + ((local198 << 16) + local208 - 16777216);
				Static71.anIntArray514[local21++] = local221;
			}
		}
	}
}
