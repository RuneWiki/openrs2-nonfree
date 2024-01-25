import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
	public static int anInt5345;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "Lclient!wm;")
	public static Class348 aClass348_1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	public static void method4579() {
		if (Static29.anIntArray66 != null) {
			return;
		}
		Static29.anIntArray66 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(81) float local81 = local69 - (float) local72;
				@Pc(88) float local88 = local59 * (1.0F - local50);
				@Pc(96) float local96 = (1.0F - local50 * local81) * local59;
				@Pc(106) float local106 = local59 * (1.0F - (1.0F - local81) * local50);
				if (local76 == 0) {
					local65 = local88;
					local61 = local59;
					local63 = local106;
				} else if (local76 == 1) {
					local63 = local59;
					local61 = local96;
					local65 = local88;
				} else if (local76 == 2) {
					local65 = local106;
					local63 = local59;
					local61 = local88;
				} else if (local76 == 3) {
					local63 = local96;
					local65 = local59;
					local61 = local88;
				} else if (local76 == 4) {
					local65 = local59;
					local63 = local88;
					local61 = local106;
				} else if (local76 == 5) {
					local63 = local88;
					local65 = local96;
					local61 = local59;
				}
				local61 = (float) Math.pow((double) local61, local24);
				local63 = (float) Math.pow((double) local63, local24);
				local65 = (float) Math.pow((double) local65, local24);
				@Pc(196) int local196 = (int) (local61 * 256.0F);
				@Pc(201) int local201 = (int) (local63 * 256.0F);
				@Pc(206) int local206 = (int) (local65 * 256.0F);
				@Pc(219) int local219 = (local196 << 16) + (local201 << 8) + local206 - 16777216;
				Static29.anIntArray66[local26++] = local219;
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z")
	public static boolean method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)I")
	public static int method4583(@OriginalArg(0) boolean arg0) {
		if (Static139.anIntArray225 == null) {
			return 0;
		} else if (arg0 || Static261.aClass141Array1 == null) {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < Static139.anIntArray225.length; local27++) {
				@Pc(33) int local33 = Static139.anIntArray225[local27];
				if (Static194.aClass168_50.method4427(local33)) {
					local25++;
				}
				if (Static394.aClass168_92.method4427(local33)) {
					local25++;
				}
			}
			return local25;
		} else {
			return Static139.anIntArray225.length * 2;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[J[I)V")
	public static void method4585(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static429.method6570(0, arg0.length - 1, arg0, arg1);
	}
}
