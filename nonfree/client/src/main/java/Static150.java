import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fba", name = "u", descriptor = "Lclient!cp;")
	public static Interface2 anInterface2_1;

	@OriginalMember(owner = "client!fba", name = "w", descriptor = "Lclient!kj;")
	public static Class202 aClass202_2;

	@OriginalMember(owner = "client!fba", name = "r", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_39 = new Class187(28, 3);

	@OriginalMember(owner = "client!fba", name = "v", descriptor = "I")
	public static int anInt2471 = 0;

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V")
	public static void method2228() {
		if (Static254.anIntArray246 != null) {
			return;
		}
		Static254.anIntArray246 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		int var2 = 0;
		for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
			@Pc(34) float local34 = ((float) (local21 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(43) float local43 = (float) (local21 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(45) int local45 = 0; local45 < 128; local45++) {
				@Pc(51) float local51 = (float) local45 / 128.0F;
				@Pc(53) float local53 = 0.0F;
				@Pc(55) float local55 = 0.0F;
				@Pc(57) float local57 = 0.0F;
				@Pc(61) float local61 = local34 / 60.0F;
				@Pc(64) int local64 = (int) local61;
				@Pc(68) int local68 = local64 % 6;
				@Pc(74) float local74 = (float) -local64 + local61;
				@Pc(81) float local81 = (1.0F - local43) * local51;
				@Pc(90) float local90 = (1.0F - local74 * local43) * local51;
				@Pc(101) float local101 = (1.0F - local43 * (1.0F - local74)) * local51;
				if (local68 == 0) {
					local53 = local51;
					local55 = local101;
					local57 = local81;
				} else if (local68 == 1) {
					local57 = local81;
					local55 = local51;
					local53 = local90;
				} else if (local68 == 2) {
					local53 = local81;
					local57 = local101;
					local55 = local51;
				} else if (local68 == 3) {
					local55 = local90;
					local57 = local51;
					local53 = local81;
				} else if (local68 == 4) {
					local55 = local81;
					local53 = local101;
					local57 = local51;
				} else if (local68 == 5) {
					local53 = local51;
					local57 = local90;
					local55 = local81;
				}
				local53 = (float) Math.pow((double) local53, local17);
				local55 = (float) Math.pow((double) local55, local17);
				local57 = (float) Math.pow((double) local57, local17);
				@Pc(191) int local191 = (int) (local53 * 256.0F);
				@Pc(196) int local196 = (int) (local55 * 256.0F);
				@Pc(201) int local201 = (int) (local57 * 256.0F);
				@Pc(213) int local213 = local201 + (local191 << 16) + (local196 << 8) - 16777216;
				Static254.anIntArray246[var2++] = local213;
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(III)V")
	public static void method2229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static478.aClass174_6 == Static591.aClass174_7) {
			if (!Static240.method3447(1, arg1, 0, false, -2, 0, 1, arg0)) {
				Static240.method3447(1, arg1, 0, false, -3, 0, 1, arg0);
			}
		} else if (!Static240.method3447(1, arg1, 0, false, -3, 0, 1, arg0)) {
			Static240.method3447(1, arg1, 0, false, -2, 0, 1, arg0);
		}
	}
}
