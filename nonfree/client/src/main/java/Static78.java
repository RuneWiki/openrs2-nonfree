import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
	public static int anInt2082;

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas7;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
	public static void method1980() {
		if (Static180.anIntArray297 != null) {
			return;
		}
		Static180.anIntArray297 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
			@Pc(33) float local33 = ((float) (local21 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(42) float local42 = (float) (local21 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(44) int local44 = 0; local44 < 128; local44++) {
				@Pc(50) float local50 = (float) local44 / 128.0F;
				@Pc(52) float local52 = 0.0F;
				@Pc(54) float local54 = 0.0F;
				@Pc(56) float local56 = 0.0F;
				@Pc(60) float local60 = local33 / 60.0F;
				@Pc(63) int local63 = (int) local60;
				@Pc(67) int local67 = local63 % 6;
				@Pc(72) float local72 = local60 - (float) local63;
				@Pc(79) float local79 = local50 * (1.0F - local42);
				@Pc(88) float local88 = (1.0F - local72 * local42) * local50;
				@Pc(99) float local99 = (1.0F - (1.0F - local72) * local42) * local50;
				if (local67 == 0) {
					local56 = local79;
					local52 = local50;
					local54 = local99;
				} else if (local67 == 1) {
					local56 = local79;
					local54 = local50;
					local52 = local88;
				} else if (local67 == 2) {
					local54 = local50;
					local56 = local99;
					local52 = local79;
				} else if (local67 == 3) {
					local52 = local79;
					local54 = local88;
					local56 = local50;
				} else if (local67 == 4) {
					local56 = local50;
					local54 = local79;
					local52 = local99;
				} else if (local67 == 5) {
					local56 = local88;
					local52 = local50;
					local54 = local79;
				}
				local52 = (float) Math.pow((double) local52, local17);
				local54 = (float) Math.pow((double) local54, local17);
				local56 = (float) Math.pow((double) local56, local17);
				@Pc(189) int local189 = (int) (local52 * 256.0F);
				@Pc(194) int local194 = (int) (local54 * 256.0F);
				@Pc(199) int local199 = (int) (local56 * 256.0F);
				@Pc(212) int local212 = (local189 << 16) + (local194 << 8) + local199 - 16777216;
				Static180.anIntArray297[local19++] = local212;
			}
		}
	}
}
