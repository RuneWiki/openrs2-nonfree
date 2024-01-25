import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_111 = new Class322(91, 9);

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!dp;")
	public static final Class82 aClass82_11 = new Class82();

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	public static void method5598(@OriginalArg(0) boolean arg0) {
		if (Static123.anIntArray129 != null) {
			return;
		}
		Static123.anIntArray129 = new int[65536];
		@Pc(23) double local23 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
			@Pc(43) float local43 = ((float) (local27 >> 1539218275) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local27 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
				@Pc(61) float local61 = (float) local54 / 128.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(71) float local71 = local43 / 60.0F;
				@Pc(74) int local74 = (int) local71;
				@Pc(78) int local78 = local74 % 6;
				@Pc(83) float local83 = local71 - (float) local74;
				@Pc(89) float local89 = local61 * (1.0F - local52);
				@Pc(98) float local98 = (1.0F - local83 * local52) * local61;
				@Pc(109) float local109 = local61 * (1.0F - (1.0F - local83) * local52);
				if (local78 == 0) {
					local65 = local109;
					local67 = local89;
					local63 = local61;
				} else if (local78 == 1) {
					local65 = local61;
					local67 = local89;
					local63 = local98;
				} else if (local78 == 2) {
					local63 = local89;
					local65 = local61;
					local67 = local109;
				} else if (local78 == 3) {
					local63 = local89;
					local67 = local61;
					local65 = local98;
				} else if (local78 == 4) {
					local63 = local109;
					local65 = local89;
					local67 = local61;
				} else if (local78 == 5) {
					local67 = local98;
					local63 = local61;
					local65 = local89;
				}
				local63 = (float) Math.pow((double) local63, local23);
				local65 = (float) Math.pow((double) local65, local23);
				local67 = (float) Math.pow((double) local67, local23);
				@Pc(211) int local211 = (int) (local63 * 256.0F);
				@Pc(216) int local216 = (int) (local65 * 256.0F);
				@Pc(221) int local221 = (int) (local67 * 256.0F);
				@Pc(233) int local233 = local221 + (local211 << 16) + (local216 << 8) - 16777216;
				Static123.anIntArray129[local25++] = local233;
			}
		}
		if (arg0) {
			method5598(true);
		}
	}
}
