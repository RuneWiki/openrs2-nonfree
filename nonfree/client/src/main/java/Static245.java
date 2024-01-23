import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "[B")
	public static byte[] aByteArray63;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!ca;")
	public static Class9_Sub3 aClass9_Sub3_1;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "[I")
	public static int[] anIntArray458 = new int[4];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
	public static void method3995() {
		if (aClass9_Sub3_1 != null) {
			return;
		}
		@Pc(10) Class9_Sub3 local10 = aClass9_Sub3_1 = new Class9_Sub3(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray64;
		@Pc(16) int[] local16 = local10.anIntArray69;
		@Pc(19) int[] local19 = local10.anIntArray68;
		@Pc(22) int[] local22 = local10.anIntArray72;
		@Pc(25) int[] local25 = local10.anIntArray75;
		@Pc(28) int[] local28 = local10.anIntArray71;
		local10.anInt857 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(64) int local64 = local57 * 1024 / 16;
			@Pc(70) int local70 = Class132.anIntArray440[local64] >> 1;
			@Pc(76) int local76 = Class132.anIntArray439[local64] >> 1;
			@Pc(85) int local85;
			@Pc(91) int local91;
			@Pc(101) int local101;
			@Pc(111) int local111;
			for (@Pc(78) int local78 = 1; local78 < 16; local78++) {
				local85 = local78 * 1024 / 16;
				local91 = Class132.anIntArray439[local85] >> 9;
				local101 = (Class132.anIntArray440[local85] >> 1) * local70 >> 23;
				local111 = (Class132.anIntArray440[local85] >> 1) * local76 >> 23;
				local13[local10.anInt857] = local111;
				local16[local10.anInt857] = local91;
				local19[local10.anInt857] = -local101;
				local10.anInt857++;
			}
			if (local57 > 0) {
				local85 = local57 * 15 + 2;
				local91 = local85 - 15;
				local22[local10.anInt859] = 0;
				local25[local10.anInt859] = local91;
				local28[local10.anInt859] = local85;
				local10.anInt859++;
				for (local101 = 1; local101 < 15; local101++) {
					local111 = local91 + 1;
					@Pc(181) int local181 = local85 + 1;
					local22[local10.anInt859] = local91;
					local25[local10.anInt859] = local111;
					local28[local10.anInt859] = local85;
					local10.anInt859++;
					local22[local10.anInt859] = local111;
					local25[local10.anInt859] = local181;
					local28[local10.anInt859] = local85;
					local10.anInt859++;
					local91 = local111;
					local85 = local181;
				}
				local22[local10.anInt859] = local85;
				local25[local10.anInt859] = local91;
				local28[local10.anInt859] = 1;
				local10.anInt859++;
			}
		}
		local10.anInt860 = local10.anInt857;
		local10.aByteArray11 = null;
		local10.aShortArray9 = null;
		local10.anIntArray66 = null;
		local10.anIntArray74 = null;
		local10.aByteArray16 = null;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "()V")
	public static void method4003() {
		if (aByteArray63 != null) {
			return;
		}
		aByteArray63 = new byte[16384];
		for (@Pc(6) int local6 = 0; local6 < 64; local6++) {
			@Pc(11) int local11 = 64 - local6;
			@Pc(15) int local15 = local11 * local11;
			@Pc(21) int local21 = 128 - local6 - 1;
			@Pc(25) int local25 = local6 * 128;
			@Pc(29) int local29 = local21 * 128;
			for (@Pc(31) int local31 = 0; local31 < 64; local31++) {
				@Pc(36) int local36 = 64 - local31;
				@Pc(40) int local40 = local36 * local36;
				@Pc(46) int local46 = 128 - local31 - 1;
				@Pc(56) int local56 = 256 - (local40 + local15 << 8) / 4096;
				local56 = local56 * 16 * 192 / 1536;
				if (local56 < 0) {
					local56 = 0;
				} else if (local56 > 255) {
					local56 = 255;
				}
				aByteArray63[local25 + local31] = aByteArray63[local25 + local46] = aByteArray63[local29 + local31] = aByteArray63[local29 + local46] = (byte) local56;
			}
		}
	}
}
