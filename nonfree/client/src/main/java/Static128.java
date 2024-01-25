import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "[Lclient!ir;")
	public static final Class1_Sub2_Sub9[] aClass1_Sub2_Sub9Array1 = new Class1_Sub2_Sub9[14];

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
	public static void method2245() {
		for (@Pc(1) int local1 = 0; local1 < Static54.anInt1001; local1++) {
			if (!Static294.aBooleanArray49[local1]) {
				@Pc(10) Class243 local10 = Static124.aClass243Array5[local1];
				@Pc(13) Class1_Sub31 local13 = local10.aClass1_Sub31_2;
				@Pc(16) int local16 = local10.anInt6518;
				@Pc(22) int local22 = local13.method5910() - Static69.anInt1593;
				@Pc(30) int local30 = (local22 * 2 >> Static31.anInt665) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5906() - local22 >> Static31.anInt665;
				@Pc(53) int local53 = local13.method5904() - local22 >> Static31.anInt665;
				@Pc(61) int local61 = local13.method5904() + local22 >> Static31.anInt665;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static87.anInt1875) {
					local61 = Static87.anInt1875 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray112[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static132.anInt2639) {
						local108 = Static132.anInt2639 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class31_Sub2 local141 = Static357.method4896(local16, local125, local78, lq.class);
						if (local141 != null && local141.aByte101 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte101 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray112[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray112[local32 - 1];
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
									local182 = local10.aShortArray112[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray112[local32 + 1];
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
				Static294.aBooleanArray49[local1] = true;
				Static105.aClass149Array1[local16].method3571(local13, local37);
			}
		}
	}
}
