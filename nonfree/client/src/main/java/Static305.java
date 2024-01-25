import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!th", name = "B", descriptor = "I")
	public static int anInt6785;

	@OriginalMember(owner = "client!th", name = "G", descriptor = "[Lclient!qk;")
	public static Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array4;

	@OriginalMember(owner = "client!th", name = "H", descriptor = "I")
	public static int anInt6789;

	@OriginalMember(owner = "client!th", name = "C", descriptor = "I")
	public static int anInt6786 = 3;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "I")
	public static int anInt6787 = 0;

	@OriginalMember(owner = "client!th", name = "E", descriptor = "[J")
	public static final long[] aLongArray10 = new long[32];

	@OriginalMember(owner = "client!th", name = "K", descriptor = "[I")
	public static final int[] anIntArray512 = new int[5];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)V")
	public static void method5682(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub4_Sub18 local12 = Static302.method4961(arg0, 6);
		local12.method4902();
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(B)V")
	public static void method5683() {
		if (Static26.anIntArray24 != null) {
			return;
		}
		Static26.anIntArray24 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(40) double local40 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(51) double local51 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(58) double local58 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(60) double local60 = local58;
			@Pc(62) double local62 = local58;
			@Pc(64) double local64 = local58;
			if (local51 != 0.0D) {
				@Pc(78) double local78;
				if (local58 < 0.5D) {
					local78 = (local51 + 1.0D) * local58;
				} else {
					local78 = local58 + local51 - local51 * local58;
				}
				@Pc(95) double local95 = local58 * 2.0D - local78;
				@Pc(99) double local99 = local40 + 0.3333333333333333D;
				if (local99 > 1.0D) {
					local99--;
				}
				@Pc(113) double local113 = local40 - 0.3333333333333333D;
				if (local99 * 6.0D < 1.0D) {
					local60 = local99 * 6.0D * (local78 - local95) + local95;
				} else if (local99 * 2.0D < 1.0D) {
					local60 = local78;
				} else if (local99 * 3.0D < 2.0D) {
					local60 = local95 + (local78 - local95) * (0.6666666666666666D - local99) * 6.0D;
				} else {
					local60 = local95;
				}
				if (local113 < 0.0D) {
					local113++;
				}
				if (local40 * 6.0D < 1.0D) {
					local62 = local40 * 6.0D * (local78 - local95) + local95;
				} else if (local40 * 2.0D < 1.0D) {
					local62 = local78;
				} else if (local40 * 3.0D < 2.0D) {
					local62 = (0.6666666666666666D - local40) * 6.0D * (local78 - local95) + local95;
				} else {
					local62 = local95;
				}
				if (local113 * 6.0D < 1.0D) {
					local64 = local95 + local113 * (local78 - local95) * 6.0D;
				} else if (local113 * 2.0D < 1.0D) {
					local64 = local78;
				} else if (local113 * 3.0D < 2.0D) {
					local64 = local95 + (0.6666666666666666D - local113) * 6.0D * (local78 - local95);
				} else {
					local64 = local95;
				}
			}
			local60 = Math.pow(local60, local20);
			local62 = Math.pow(local62, local20);
			local64 = Math.pow(local64, local20);
			@Pc(290) int local290 = (int) (local60 * 256.0D);
			@Pc(295) int local295 = (int) (local62 * 256.0D);
			@Pc(300) int local300 = (int) (local64 * 256.0D);
			@Pc(311) int local311 = local300 + (local290 << 16) + (local295 << 8);
			Static26.anIntArray24[local26] = local311;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!uh;)V")
	public static void method5684(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1) {
		Static261.aClass60Array2[arg0] = arg1;
	}
}
