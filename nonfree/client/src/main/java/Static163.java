import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_58 = new Class205(36, -2);

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
	public static int anInt2451 = 0;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
	public static int anInt2452 = 0;

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "Lclient!mb;")
	public static final Class154 aClass154_4 = new Class154();

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
	public static void method2375() {
		if (Static214.anIntArray762 != null) {
			return;
		}
		Static214.anIntArray762 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
			@Pc(46) float local46 = ((float) (local32 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(55) float local55 = (float) (local32 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(57) int local57 = 0; local57 < 128; local57++) {
				@Pc(64) float local64 = (float) local57 / 128.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(68) float local68 = 0.0F;
				@Pc(70) float local70 = 0.0F;
				@Pc(74) float local74 = local46 / 60.0F;
				@Pc(77) int local77 = (int) local74;
				@Pc(81) int local81 = local77 % 6;
				@Pc(87) float local87 = (float) -local77 + local74;
				@Pc(93) float local93 = local64 * (1.0F - local55);
				@Pc(102) float local102 = (1.0F - local55 * local87) * local64;
				@Pc(114) float local114 = local64 * (1.0F - (1.0F - local87) * local55);
				if (local81 == 0) {
					local68 = local114;
					local66 = local64;
					local70 = local93;
				} else if (local81 == 1) {
					local68 = local64;
					local66 = local102;
					local70 = local93;
				} else if (local81 == 2) {
					local68 = local64;
					local66 = local93;
					local70 = local114;
				} else if (local81 == 3) {
					local68 = local102;
					local66 = local93;
					local70 = local64;
				} else if (local81 == 4) {
					local70 = local64;
					local68 = local93;
					local66 = local114;
				} else if (local81 == 5) {
					local68 = local93;
					local70 = local102;
					local66 = local64;
				}
				local66 = (float) Math.pow((double) local66, local20);
				local68 = (float) Math.pow((double) local68, local20);
				local70 = (float) Math.pow((double) local70, local20);
				@Pc(204) int local204 = (int) (local66 * 256.0F);
				@Pc(209) int local209 = (int) (local68 * 256.0F);
				@Pc(214) int local214 = (int) (local70 * 256.0F);
				@Pc(227) int local227 = local214 + (local209 << 8) + (local204 << 16) - 16777216;
				Static214.anIntArray762[local30++] = local227;
			}
		}
	}
}
