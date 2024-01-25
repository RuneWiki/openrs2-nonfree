import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
	public static int anInt53 = 0;

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
	public static int anInt54 = 0;

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
	public static int anInt56 = 0;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!wca;)V")
	public static void method195(@OriginalArg(1) Class1_Sub50 arg0) {
		if (!Static25.aBoolean94) {
			arg0.method7983();
			Static267.anInt5167--;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	public static void method196() {
		if (Static392.anIntArray516 != null) {
			return;
		}
		Static392.anIntArray516 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(24) int local24 = 0; local24 < 65536; local24++) {
			@Pc(37) double local37 = (double) (local24 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(48) double local48 = (double) (local24 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(55) double local55 = (double) (local24 & 0x7F) / 128.0D;
			@Pc(57) double local57 = local55;
			@Pc(59) double local59 = local55;
			@Pc(61) double local61 = local55;
			if (local48 != 0.0D) {
				@Pc(77) double local77;
				if (local55 < 0.5D) {
					local77 = local55 * (local48 + 1.0D);
				} else {
					local77 = local55 + local48 - local55 * local48;
				}
				@Pc(91) double local91 = local55 * 2.0D - local77;
				@Pc(95) double local95 = local37 + 0.3333333333333333D;
				if (local95 > 1.0D) {
					local95--;
				}
				@Pc(109) double local109 = local37 - 0.3333333333333333D;
				if (local37 * 6.0D < 1.0D) {
					local59 = local91 + local37 * 6.0D * (local77 - local91);
				} else if (local37 * 2.0D < 1.0D) {
					local59 = local77;
				} else if (local37 * 3.0D < 2.0D) {
					local59 = local91 + (local77 - local91) * (-local37 + 0.6666666666666666D) * 6.0D;
				} else {
					local59 = local91;
				}
				if (local95 * 6.0D < 1.0D) {
					local57 = (local77 - local91) * 6.0D * local95 + local91;
				} else if (local95 * 2.0D < 1.0D) {
					local57 = local77;
				} else if (local95 * 3.0D < 2.0D) {
					local57 = (0.6666666666666666D - local95) * 6.0D * (local77 - local91) + local91;
				} else {
					local57 = local91;
				}
				if (local109 < 0.0D) {
					local109++;
				}
				if (local109 * 6.0D < 1.0D) {
					local61 = local109 * (local77 - local91) * 6.0D + local91;
				} else if (local109 * 2.0D < 1.0D) {
					local61 = local77;
				} else if (local109 * 3.0D < 2.0D) {
					local61 = local91 + (0.6666666666666666D - local109) * 6.0D * (local77 - local91);
				} else {
					local61 = local91;
				}
			}
			local57 = Math.pow(local57, local17);
			local59 = Math.pow(local59, local17);
			local61 = Math.pow(local61, local17);
			@Pc(279) int local279 = (int) (local57 * 256.0D);
			@Pc(284) int local284 = (int) (local59 * 256.0D);
			@Pc(289) int local289 = (int) (local61 * 256.0D);
			@Pc(300) int local300 = (local279 << 16) + ((local284 << 8) + local289);
			Static392.anIntArray516[local24] = local300;
		}
	}
}
