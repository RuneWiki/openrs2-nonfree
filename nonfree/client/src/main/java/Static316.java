import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "Lclient!db;")
	public static final Class57 aClass57_10 = new Class57(15, 0, 1, 0);

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "[I")
	public static final int[] anIntArray540 = new int[1];

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_107 = new Class133(94, 0);

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IB)Z")
	public static boolean method5110(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)V")
	public static void method5112() {
		if (Static457.anIntArray710 != null) {
			return;
		}
		Static457.anIntArray710 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(26) int local26 = 0;
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
				@Pc(82) float local82 = local70 - (float) local73;
				@Pc(88) float local88 = (1.0F - local51) * local60;
				@Pc(97) float local97 = (1.0F - local82 * local51) * local60;
				@Pc(109) float local109 = (1.0F - local51 * (1.0F - local82)) * local60;
				if (local77 == 0) {
					local66 = local88;
					local62 = local60;
					local64 = local109;
				} else if (local77 == 1) {
					local62 = local97;
					local66 = local88;
					local64 = local60;
				} else if (local77 == 2) {
					local64 = local60;
					local62 = local88;
					local66 = local109;
				} else if (local77 == 3) {
					local66 = local60;
					local64 = local97;
					local62 = local88;
				} else if (local77 == 4) {
					local64 = local88;
					local62 = local109;
					local66 = local60;
				} else if (local77 == 5) {
					local62 = local60;
					local64 = local88;
					local66 = local97;
				}
				local62 = (float) Math.pow((double) local62, local20);
				local64 = (float) Math.pow((double) local64, local20);
				local66 = (float) Math.pow((double) local66, local20);
				@Pc(204) int local204 = (int) (local62 * 256.0F);
				@Pc(209) int local209 = (int) (local64 * 256.0F);
				@Pc(214) int local214 = (int) (local66 * 256.0F);
				@Pc(227) int local227 = local214 + (local204 << 16) + (local209 << 8) - 16777216;
				Static457.anIntArray710[local26++] = local227;
			}
		}
	}
}
