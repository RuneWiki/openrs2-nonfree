import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString162 = "K";

	@OriginalMember(owner = "client!n", name = "d", descriptor = "I")
	public static int anInt4070 = 0;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
	public static void method3747() {
		if (Static56.anIntArray140 != null) {
			return;
		}
		Static56.anIntArray140 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(36) double local36 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(47) double local47 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(54) double local54 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(56) double local56 = local54;
			@Pc(58) double local58 = local54;
			@Pc(60) double local60 = local54;
			if (local47 != 0.0D) {
				@Pc(77) double local77;
				if (local54 < 0.5D) {
					local77 = local54 * (local47 + 1.0D);
				} else {
					local77 = local47 + local54 - local47 * local54;
				}
				@Pc(91) double local91 = local54 * 2.0D - local77;
				@Pc(95) double local95 = local36 + 0.3333333333333333D;
				if (local95 > 1.0D) {
					local95--;
				}
				@Pc(109) double local109 = local36 - 0.3333333333333333D;
				if (local36 * 6.0D < 1.0D) {
					local58 = local91 + (local77 - local91) * 6.0D * local36;
				} else if (local36 * 2.0D < 1.0D) {
					local58 = local77;
				} else if (local36 * 3.0D < 2.0D) {
					local58 = (local77 - local91) * 6.0D * (0.6666666666666666D - local36) + local91;
				} else {
					local58 = local91;
				}
				if (local109 < 0.0D) {
					local109++;
				}
				if (local95 * 6.0D < 1.0D) {
					local56 = local95 * (local77 - local91) * 6.0D + local91;
				} else if (local95 * 2.0D < 1.0D) {
					local56 = local77;
				} else if (local95 * 3.0D < 2.0D) {
					local56 = local91 + (local77 - local91) * 6.0D * (0.6666666666666666D - local95);
				} else {
					local56 = local91;
				}
				if (local109 * 6.0D < 1.0D) {
					local60 = local109 * (local77 - local91) * 6.0D + local91;
				} else if (local109 * 2.0D < 1.0D) {
					local60 = local77;
				} else if (local109 * 3.0D < 2.0D) {
					local60 = (local77 - local91) * 6.0D * (0.6666666666666666D - local109) + local91;
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
			@Pc(307) int local307 = local297 + (local287 << 16) + (local292 << 8);
			Static56.anIntArray140[local22] = local307;
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
	public static void method3749() {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = -1; local3 < Static334.anInt6370; local3++) {
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static123.anIntArray290[local3];
			}
			@Pc(20) Class5_Sub3_Sub3_Sub1 local20 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local12];
			if (local20 != null && local20.anInt4945 > 0) {
				local20.anInt4945--;
				if (local20.anInt4945 == 0) {
					local20.aString199 = null;
				}
			}
		}
		for (local12 = 0; local12 < Static338.anInt6419; local12++) {
			@Pc(60) int local60 = Static25.anIntArray83[local12];
			@Pc(64) Class5_Sub3_Sub3_Sub2 local64 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local60];
			if (local64 != null && local64.anInt4945 > 0) {
				local64.anInt4945--;
				if (local64.anInt4945 == 0) {
					local64.aString199 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	public static void method3750() {
		@Pc(1) Class140 local1 = Static338.aClass140_174;
		synchronized (Static338.aClass140_174) {
			Static338.aClass140_174.method3824(5);
		}
	}
}
