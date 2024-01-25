import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!s", name = "O", descriptor = "I")
	public static int anInt5521 = -1;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "I")
	public static int anInt5524 = 0;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "[I")
	public static final int[] anIntArray422 = new int[2048];

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(I)V")
	public static void method5049() {
		Static271.aClass60_2.method1868();
		Static164.aClass142_1.method4916();
		if (Static8.aClass29_1 != null) {
			Static8.aClass29_1.method2775(Static174.aCanvas3);
		}
		Static48.aClient2.method1053();
		Static174.aCanvas3.setBackground(Color.black);
		Static198.anInt4016 = -1;
		Static271.aClass60_2 = Static323.method4446(Static174.aCanvas3);
		Static164.aClass142_1 = Static132.method2713(Static174.aCanvas3);
		if (Static8.aClass29_1 != null) {
			Static8.aClass29_1.method2778(Static174.aCanvas3);
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V")
	public static void method5050(@OriginalArg(0) int arg0) {
		Static207.anInt4093 = arg0;
		Static286.anInt5852 = -1;
		Static253.anInt5163 = -1;
		Static229.method4278();
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "(I)V")
	public static void method5051() {
		if (Static209.anIntArray347 != null) {
			return;
		}
		Static209.anIntArray347 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(36) double local36 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(47) double local47 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(54) double local54 = (double) (local22 & 0x7F) / 128.0D;
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
				@Pc(91) double local91 = local54 * 2.0D - local76;
				@Pc(95) double local95 = local36 + 0.3333333333333333D;
				if (local95 > 1.0D) {
					local95--;
				}
				@Pc(109) double local109 = local36 - 0.3333333333333333D;
				if (local36 * 6.0D < 1.0D) {
					local58 = local36 * 6.0D * (local76 - local91) + local91;
				} else if (local36 * 2.0D < 1.0D) {
					local58 = local76;
				} else if (local36 * 3.0D < 2.0D) {
					local58 = (local76 - local91) * (-local36 + 0.6666666666666666D) * 6.0D + local91;
				} else {
					local58 = local91;
				}
				if (local95 * 6.0D < 1.0D) {
					local56 = (local76 - local91) * 6.0D * local95 + local91;
				} else if (local95 * 2.0D < 1.0D) {
					local56 = local76;
				} else if (local95 * 3.0D < 2.0D) {
					local56 = local91 + (0.6666666666666666D - local95) * 6.0D * (local76 - local91);
				} else {
					local56 = local91;
				}
				if (local109 < 0.0D) {
					local109++;
				}
				if (local109 * 6.0D < 1.0D) {
					local60 = local91 + local109 * 6.0D * (local76 - local91);
				} else if (local109 * 2.0D < 1.0D) {
					local60 = local76;
				} else if (local109 * 3.0D < 2.0D) {
					local60 = (0.6666666666666666D - local109) * 6.0D * (local76 - local91) + local91;
				} else {
					local60 = local91;
				}
			}
			local56 = Math.pow(local56, local20);
			local58 = Math.pow(local58, local20);
			local60 = Math.pow(local60, local20);
			@Pc(287) int local287 = (int) (local56 * 256.0D);
			@Pc(292) int local292 = (int) (local58 * 256.0D);
			@Pc(297) int local297 = (int) (local60 * 256.0D);
			@Pc(308) int local308 = local297 + (local287 << 16) + (local292 << 8);
			Static209.anIntArray347[local22] = local308;
		}
	}
}
