import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!us", name = "p", descriptor = "[Lclient!fd;")
	public static Class103[] aClass103Array24;

	@OriginalMember(owner = "client!us", name = "v", descriptor = "I")
	public static int anInt9501;

	@OriginalMember(owner = "client!us", name = "n", descriptor = "I")
	public static int anInt9494 = 0;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BII)Z")
	public static boolean method8123(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(IB)I")
	public static int method8124(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V")
	public static void method8126() {
		if (Static205.anIntArray530 != null) {
			return;
		}
		Static205.anIntArray530 = new int[65536];
		@Pc(23) double local23 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(25) int local25 = 0; local25 < 65536; local25++) {
			@Pc(38) double local38 = (double) (local25 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(49) double local49 = (double) (local25 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(56) double local56 = (double) (local25 & 0x7F) / 128.0D;
			@Pc(58) double local58 = local56;
			@Pc(60) double local60 = local56;
			@Pc(62) double local62 = local56;
			if (local49 != 0.0D) {
				@Pc(76) double local76;
				if (local56 < 0.5D) {
					local76 = local56 * (local49 + 1.0D);
				} else {
					local76 = local56 + local49 - local49 * local56;
				}
				@Pc(93) double local93 = local56 * 2.0D - local76;
				@Pc(97) double local97 = local38 + 0.3333333333333333D;
				if (local97 > 1.0D) {
					local97--;
				}
				@Pc(111) double local111 = local38 - 0.3333333333333333D;
				if (local97 * 6.0D < 1.0D) {
					local58 = local97 * 6.0D * (local76 - local93) + local93;
				} else if (local97 * 2.0D < 1.0D) {
					local58 = local76;
				} else if (local97 * 3.0D < 2.0D) {
					local58 = (local76 - local93) * 6.0D * (0.6666666666666666D - local97) + local93;
				} else {
					local58 = local93;
				}
				if (local111 < 0.0D) {
					local111++;
				}
				if (local38 * 6.0D < 1.0D) {
					local60 = (local76 - local93) * 6.0D * local38 + local93;
				} else if (local38 * 2.0D < 1.0D) {
					local60 = local76;
				} else if (local38 * 3.0D < 2.0D) {
					local60 = local93 + (local76 - local93) * 6.0D * (0.6666666666666666D - local38);
				} else {
					local60 = local93;
				}
				if (local111 * 6.0D < 1.0D) {
					local62 = local93 + local111 * (local76 - local93) * 6.0D;
				} else if (local111 * 2.0D < 1.0D) {
					local62 = local76;
				} else if (local111 * 3.0D < 2.0D) {
					local62 = local93 + (0.6666666666666666D - local111) * (-local93 + local76) * 6.0D;
				} else {
					local62 = local93;
				}
			}
			local58 = Math.pow(local58, local23);
			local60 = Math.pow(local60, local23);
			local62 = Math.pow(local62, local23);
			@Pc(291) int local291 = (int) (local58 * 256.0D);
			@Pc(296) int local296 = (int) (local60 * 256.0D);
			@Pc(301) int local301 = (int) (local62 * 256.0D);
			@Pc(312) int local312 = (local291 << 16) + (local296 << 8) + local301;
			Static205.anIntArray530[local25] = local312;
		}
	}
}
