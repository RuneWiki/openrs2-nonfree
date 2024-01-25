import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!nu", name = "q", descriptor = "Lclient!jf;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!nu", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)I")
	public static int method3709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static149.anIntArray235[arg0 & 0x3] : Static335.anIntArray524[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3712(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static402.method1650(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static422.anInt7120; local33++) {
			@Pc(39) String local39 = Static71.aStringArray9[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static402.method1650(local39);
			if (local39 != null && local39.equals(local20)) {
				Static422.anInt7120--;
				for (@Pc(63) int local63 = local33; local63 < Static422.anInt7120; local63++) {
					Static71.aStringArray9[local63] = Static71.aStringArray9[local63 + 1];
					Static317.aStringArray34[local63] = Static317.aStringArray34[local63 + 1];
					Static447.aStringArray44[local63] = Static447.aStringArray44[local63 + 1];
					Static252.aStringArray15[local63] = Static252.aStringArray15[local63 + 1];
					Static93.aBooleanArray7[local63] = Static93.aBooleanArray7[local63 + 1];
				}
				Static35.anInt830 = Static190.anInt3670;
				Static209.method2982(Static86.aClass36_111);
				Static116.aClass4_Sub30_Sub1_1.method4871(Static226.method592(arg0));
				Static116.aClass4_Sub30_Sub1_1.method4849(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)V")
	public static void method3713() {
		if (Static154.anIntArray246 != null) {
			return;
		}
		Static154.anIntArray246 = new int[65536];
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
					local76 = local54 * (local47 + 1.0D);
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
					local58 = local91 + (local76 - local91) * 6.0D * local36;
				} else if (local36 * 2.0D < 1.0D) {
					local58 = local76;
				} else if (local36 * 3.0D < 2.0D) {
					local58 = local91 + (local76 - local91) * 6.0D * (0.6666666666666666D - local36);
				} else {
					local58 = local91;
				}
				if (local95 * 6.0D < 1.0D) {
					local56 = local95 * (local76 - local91) * 6.0D + local91;
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
					local60 = local109 * (local76 - local91) * 6.0D + local91;
				} else if (local109 * 2.0D < 1.0D) {
					local60 = local76;
				} else if (local109 * 3.0D < 2.0D) {
					local60 = (0.6666666666666666D - local109) * (-local91 + local76) * 6.0D + local91;
				} else {
					local60 = local91;
				}
			}
			local56 = Math.pow(local56, local20);
			local58 = Math.pow(local58, local20);
			local60 = Math.pow(local60, local20);
			@Pc(292) int local292 = (int) (local56 * 256.0D);
			@Pc(297) int local297 = (int) (local58 * 256.0D);
			@Pc(302) int local302 = (int) (local60 * 256.0D);
			@Pc(313) int local313 = (local297 << 8) + (local292 << 16) + local302;
			Static154.anIntArray246[local22] = local313;
		}
	}
}
