import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
	public static int anInt4246;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
	public static int anInt4241 = 0;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)Lclient!im;")
	public static Class118 method3518() {
		try {
			return (Class118) Class.forName("Class118_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	public static void method3519() {
		if (Static389.anIntArray561 != null) {
			return;
		}
		Static389.anIntArray561 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(36) double local36 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(47) double local47 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(54) double local54 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(56) double local56 = local54;
			@Pc(58) double local58 = local54;
			@Pc(60) double local60 = local54;
			if (local47 != 0.0D) {
				@Pc(76) double local76;
				if (local54 < 0.5D) {
					local76 = (local47 + 1.0D) * local54;
				} else {
					local76 = local54 + local47 - local47 * local54;
				}
				@Pc(90) double local90 = local54 * 2.0D - local76;
				@Pc(94) double local94 = local36 + 0.3333333333333333D;
				if (local94 > 1.0D) {
					local94--;
				}
				@Pc(108) double local108 = local36 - 0.3333333333333333D;
				if (local108 < 0.0D) {
					local108++;
				}
				if (local94 * 6.0D < 1.0D) {
					local56 = (local76 - local90) * 6.0D * local94 + local90;
				} else if (local94 * 2.0D < 1.0D) {
					local56 = local76;
				} else if (local94 * 3.0D < 2.0D) {
					local56 = (local76 - local90) * 6.0D * (0.6666666666666666D - local94) + local90;
				} else {
					local56 = local90;
				}
				if (local36 * 6.0D < 1.0D) {
					local58 = local90 + local36 * (local76 - local90) * 6.0D;
				} else if (local36 * 2.0D < 1.0D) {
					local58 = local76;
				} else if (local36 * 3.0D < 2.0D) {
					local58 = (local76 - local90) * 6.0D * (0.6666666666666666D - local36) + local90;
				} else {
					local58 = local90;
				}
				if (local108 * 6.0D < 1.0D) {
					local60 = local90 + (local76 - local90) * 6.0D * local108;
				} else if (local108 * 2.0D < 1.0D) {
					local60 = local76;
				} else if (local108 * 3.0D < 2.0D) {
					local60 = (0.6666666666666666D - local108) * 6.0D * (local76 - local90) + local90;
				} else {
					local60 = local90;
				}
			}
			local56 = Math.pow(local56, local19);
			local58 = Math.pow(local58, local19);
			local60 = Math.pow(local60, local19);
			@Pc(287) int local287 = (int) (local56 * 256.0D);
			@Pc(292) int local292 = (int) (local58 * 256.0D);
			@Pc(297) int local297 = (int) (local60 * 256.0D);
			@Pc(308) int local308 = (local287 << 16) + (local292 << 8) + local297;
			Static389.anIntArray561[local21] = local308;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Z")
	public static boolean method3521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
