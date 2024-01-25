import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
	public static int anInt2577;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
	public static int anInt2579;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "[I")
	public static final int[] anIntArray201 = new int[14];

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
	public static int anInt2578 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "()V")
	public static void method2013() {
		for (@Pc(1) int local1 = 0; local1 < Static48.anInt963; local1++) {
			if (!Static69.aBooleanArray8[local1]) {
				@Pc(10) Class170 local10 = Static140.aClass170Array1[local1];
				@Pc(13) Class2_Sub20 local13 = local10.aClass2_Sub20_1;
				@Pc(16) int local16 = local10.anInt4842;
				@Pc(22) int local22 = local13.method5743() - Static414.anInt6898;
				@Pc(30) int local30 = (local22 * 2 >> Static307.anInt5425) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5740() - local22 >> Static307.anInt5425;
				@Pc(53) int local53 = local13.method5741() - local22 >> Static307.anInt5425;
				@Pc(61) int local61 = local13.method5741() + local22 >> Static307.anInt5425;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static386.anInt6463) {
					local61 = Static386.anInt6463 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray77[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static42.anInt4340) {
						local108 = Static42.anInt4340 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class3_Sub2 local141 = Static455.method4456(local16, local125, local78, gg.class);
						if (local141 != null && local141.aByte88 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte88 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray77[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray77[local32 - 1];
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
									local182 = local10.aShortArray77[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray77[local32 + 1];
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
				Static69.aBooleanArray8[local1] = true;
				Static58.aClass64Array1[local16].method2349(local13, local37);
			}
		}
	}
}
