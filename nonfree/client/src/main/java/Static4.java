import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "F")
	public static float aFloat263;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "[I")
	public static final int[] anIntArray673 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_59 = new Class313(64);

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_272 = new Class363(60, -2);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
	public static void method7708() {
		for (@Pc(1) int local1 = 0; local1 < Static441.anInt7764; local1++) {
			if (!Static237.aBooleanArray34[local1]) {
				@Pc(10) Class265 local10 = Static237.aClass265Array2[local1];
				@Pc(13) Class2_Sub14 local13 = local10.aClass2_Sub14_3;
				@Pc(16) int local16 = local10.anInt7293;
				@Pc(22) int local22 = local13.method7691() - Static81.anInt1767;
				@Pc(30) int local30 = (local22 * 2 >> Static134.anInt2822) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method7694() - local22 >> Static134.anInt2822;
				@Pc(53) int local53 = local13.method7693() - local22 >> Static134.anInt2822;
				@Pc(61) int local61 = local13.method7693() + local22 >> Static134.anInt2822;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static357.anInt6390) {
					local61 = Static357.anInt6390 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray102[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static496.anInt8369) {
						local108 = Static496.anInt8369 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class6_Sub1_Sub1 local141 = Static224.method3516(local16, local125, local78, qda.class);
						if (local141 != null && local141.aByte97 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte97 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray102[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray102[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray102[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray102[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static237.aBooleanArray34[local1] = true;
				Static421.aClass67Array7[local16].method6709(local13, local37);
			}
		}
	}
}
