import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
	public static void method6322() {
		if (Static101.anIntArray262 != null) {
			return;
		}
		Static101.anIntArray262 = new int[65536];
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
					local76 = (local49 + 1.0D) * local56;
				} else {
					local76 = local56 + local49 - local56 * local49;
				}
				@Pc(94) double local94 = local56 * 2.0D - local76;
				@Pc(98) double local98 = local38 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local38 - 0.3333333333333333D;
				if (local38 * 6.0D < 1.0D) {
					local60 = local38 * 6.0D * (local76 - local94) + local94;
				} else if (local38 * 2.0D < 1.0D) {
					local60 = local76;
				} else if (local38 * 3.0D < 2.0D) {
					local60 = (local76 - local94) * (0.6666666666666666D - local38) * 6.0D + local94;
				} else {
					local60 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local98 * 6.0D < 1.0D) {
					local58 = local94 + (local76 - local94) * 6.0D * local98;
				} else if (local98 * 2.0D < 1.0D) {
					local58 = local76;
				} else if (local98 * 3.0D < 2.0D) {
					local58 = (local76 - local94) * (-local98 + 0.6666666666666666D) * 6.0D + local94;
				} else {
					local58 = local94;
				}
				if (local112 * 6.0D < 1.0D) {
					local62 = (local76 - local94) * 6.0D * local112 + local94;
				} else if (local112 * 2.0D < 1.0D) {
					local62 = local76;
				} else if (local112 * 3.0D < 2.0D) {
					local62 = local94 + (local76 - local94) * 6.0D * (0.6666666666666666D - local112);
				} else {
					local62 = local94;
				}
			}
			local58 = Math.pow(local58, local23);
			local60 = Math.pow(local60, local23);
			local62 = Math.pow(local62, local23);
			@Pc(292) int local292 = (int) (local58 * 256.0D);
			@Pc(297) int local297 = (int) (local60 * 256.0D);
			@Pc(302) int local302 = (int) (local62 * 256.0D);
			@Pc(313) int local313 = (local292 << 16) - (-(local297 << 8) - local302);
			Static101.anIntArray262[local25] = local313;
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!fca;B)V")
	public static void method6324(@OriginalArg(0) Class97 arg0) {
		if (arg0.anInt2324 != Static39.anInt680) {
			return;
		}
		if (Static426.aClass29_Sub2_Sub1_Sub2_2.aString108 == null) {
			arg0.anInt2263 = 0;
			arg0.anInt2273 = 0;
			return;
		}
		arg0.anInt2322 = 150;
		arg0.anInt2279 = (int) (Math.sin((double) Static358.anInt6263 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2262 = 5;
		arg0.anInt2263 = Static44.anInt711;
		arg0.anInt2273 = Static194.method2914(Static426.aClass29_Sub2_Sub1_Sub2_2.aString108);
		arg0.anInt2310 = Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8535;
		arg0.anInt2272 = 0;
		arg0.anInt2287 = Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8515;
		arg0.anInt2304 = Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8581;
	}
}
