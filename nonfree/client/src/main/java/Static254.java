import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "Lclient!pba;")
	public static Class25_Sub2_Sub2_Sub5_Sub1 aClass25_Sub2_Sub2_Sub5_Sub1_1;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_165 = new Class123(82, 12);

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_96 = new Class342(260);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
	public static void method3975() {
		for (@Pc(1) int local1 = 0; local1 < Static346.anInt6230; local1++) {
			if (!Static561.aBooleanArray34[local1]) {
				@Pc(10) Class235 local10 = Static196.aClass235Array1[local1];
				@Pc(13) Class3_Sub9 local13 = local10.aClass3_Sub9_2;
				@Pc(16) int local16 = local10.anInt6525;
				@Pc(22) int local22 = local13.method6000() - Static211.anInt8485;
				@Pc(30) int local30 = (local22 * 2 >> Static385.anInt6657) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5997() - local22 >> Static385.anInt6657;
				@Pc(53) int local53 = local13.method5999() - local22 >> Static385.anInt6657;
				@Pc(61) int local61 = local13.method5999() + local22 >> Static385.anInt6657;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static414.anInt7451) {
					local61 = Static414.anInt7451 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray97[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static349.anInt6237) {
						local108 = Static349.anInt6237 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class25_Sub2_Sub2 local141 = Static13.method122(local16, local125, local78, iaa.class);
						if (local141 != null && local141.aByte119 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte119 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray97[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray97[local32 - 1];
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
									local182 = local10.aShortArray97[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray97[local32 + 1];
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
				Static561.aBooleanArray34[local1] = true;
				Static256.aClass127Array3[local16].method7866(local13, local37);
			}
		}
	}
}
