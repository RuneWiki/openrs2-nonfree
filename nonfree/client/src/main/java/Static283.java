import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
	public static int anInt8425;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_151 = new Class73(84, 4);

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Lclient!wr;")
	public static final Class380 aClass380_37 = new Class380(64);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Lclient!mu;")
	public static final Class212 aClass212_16 = new Class212("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	public static void method7063() {
		for (@Pc(1) int local1 = 0; local1 < Static402.anInt7480; local1++) {
			if (!Static632.aBooleanArray26[local1]) {
				@Pc(10) Class3 local10 = Static489.aClass3Array1[local1];
				@Pc(13) Class6_Sub10 local13 = local10.aClass6_Sub10_1;
				@Pc(16) int local16 = local10.anInt57;
				@Pc(22) int local22 = local13.method5316() - Static375.anInt7139;
				@Pc(30) int local30 = (local22 * 2 >> Static606.anInt10280) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5312() - local22 >> Static606.anInt10280;
				@Pc(53) int local53 = local13.method5320() - local22 >> Static606.anInt10280;
				@Pc(61) int local61 = local13.method5320() + local22 >> Static606.anInt10280;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static142.anInt3372) {
					local61 = Static142.anInt3372 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray1[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static623.anInt10485) {
						local108 = Static623.anInt10485 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class9_Sub4_Sub2 local141 = Static173.method3262(local16, local125, local78, lr.class);
						if (local141 != null && local141.aByte117 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte117 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray1[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray1[local32 - 1];
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
									local182 = local10.aShortArray1[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray1[local32 + 1];
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
				Static632.aBooleanArray26[local1] = true;
				Static148.aClass245Array1[local16].method7584(local13, local37);
			}
		}
	}
}
