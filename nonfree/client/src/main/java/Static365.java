import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "[Lclient!sp;")
	public static Class323[] aClass323Array1;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Lclient!tp;")
	public static Class275_Sub1 aClass275_Sub1_2;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	public static int anInt5779;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_77 = new Class179(72, 18);

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
	public static int anInt5778 = 0;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Z")
	public static boolean aBoolean427 = false;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_5 = new Class215();

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
	public static void method4952() {
		if (Static486.anIntArray562 != null) {
			return;
		}
		Static486.anIntArray562 = new int[65536];
		@Pc(25) double local25 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(43) float local43 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
				@Pc(61) float local61 = (float) local54 / 128.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(71) float local71 = local43 / 60.0F;
				@Pc(74) int local74 = (int) local71;
				@Pc(78) int local78 = local74 % 6;
				@Pc(84) float local84 = (float) -local74 + local71;
				@Pc(91) float local91 = local61 * (1.0F - local52);
				@Pc(100) float local100 = local61 * (1.0F - local52 * local84);
				@Pc(110) float local110 = local61 * (1.0F - local52 * (1.0F - local84));
				if (local78 == 0) {
					local67 = local91;
					local63 = local61;
					local65 = local110;
				} else if (local78 == 1) {
					local63 = local100;
					local67 = local91;
					local65 = local61;
				} else if (local78 == 2) {
					local65 = local61;
					local63 = local91;
					local67 = local110;
				} else if (local78 == 3) {
					local67 = local61;
					local65 = local100;
					local63 = local91;
				} else if (local78 == 4) {
					local63 = local110;
					local67 = local61;
					local65 = local91;
				} else if (local78 == 5) {
					local63 = local61;
					local65 = local91;
					local67 = local100;
				}
				local63 = (float) Math.pow((double) local63, local25);
				local65 = (float) Math.pow((double) local65, local25);
				local67 = (float) Math.pow((double) local67, local25);
				@Pc(207) int local207 = (int) (local63 * 256.0F);
				@Pc(212) int local212 = (int) (local65 * 256.0F);
				@Pc(217) int local217 = (int) (local67 * 256.0F);
				@Pc(230) int local230 = local217 + (local207 << 16) + (local212 << 8) - 16777216;
				Static486.anIntArray562[local27++] = local230;
			}
		}
	}
}
