import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!am", name = "c", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public static int anInt281 = -1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BIIII)V")
	public static void method215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static290.anInt5903 <= arg2 && Static530.anInt9437 >= arg2) {
			@Pc(18) int local18 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg0);
			@Pc(24) int local24 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg1);
			Static533.method7756(arg2, local24, local18, arg3);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public static void method216() {
		if (Static15.anIntArray11 != null) {
			return;
		}
		Static15.anIntArray11 = new int[65536];
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
					local58 = (local76 - local93) * 6.0D * local97 + local93;
				} else if (local97 * 2.0D < 1.0D) {
					local58 = local76;
				} else if (local97 * 3.0D < 2.0D) {
					local58 = (0.6666666666666666D - local97) * (local76 - local93) * 6.0D + local93;
				} else {
					local58 = local93;
				}
				if (local38 * 6.0D < 1.0D) {
					local60 = local38 * (local76 - local93) * 6.0D + local93;
				} else if (local38 * 2.0D < 1.0D) {
					local60 = local76;
				} else if (local38 * 3.0D < 2.0D) {
					local60 = (0.6666666666666666D - local38) * (-local93 + local76) * 6.0D + local93;
				} else {
					local60 = local93;
				}
				if (local111 < 0.0D) {
					local111++;
				}
				if (local111 * 6.0D < 1.0D) {
					local62 = local93 + (local76 - local93) * 6.0D * local111;
				} else if (local111 * 2.0D < 1.0D) {
					local62 = local76;
				} else if (local111 * 3.0D < 2.0D) {
					local62 = local93 + (local76 - local93) * 6.0D * (0.6666666666666666D - local111);
				} else {
					local62 = local93;
				}
			}
			local58 = Math.pow(local58, local23);
			local60 = Math.pow(local60, local23);
			local62 = Math.pow(local62, local23);
			@Pc(290) int local290 = (int) (local58 * 256.0D);
			@Pc(295) int local295 = (int) (local60 * 256.0D);
			@Pc(300) int local300 = (int) (local62 * 256.0D);
			@Pc(310) int local310 = (local295 << 8) + (local290 << 16) + local300;
			Static15.anIntArray11[local25] = local310;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)I")
	public static int method217(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
