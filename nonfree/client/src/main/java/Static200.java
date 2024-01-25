import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	public static int anInt3881 = 0;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "[I")
	public static final int[] anIntArray334 = new int[6];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
	public static void method3439() {
		for (@Pc(1) int local1 = 0; local1 < Static246.anInt4872; local1++) {
			if (!Static98.aBooleanArray45[local1]) {
				@Pc(10) Class62 local10 = Static447.aClass62Array1[local1];
				@Pc(13) Class1_Sub2 local13 = local10.aClass1_Sub2_1;
				@Pc(16) int local16 = local10.anInt1596;
				@Pc(22) int local22 = local13.method2434() - Static122.anInt2483;
				@Pc(30) int local30 = (local22 * 2 >> Static451.anInt7905) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method2426() - local22 >> Static451.anInt7905;
				@Pc(53) int local53 = local13.method2427() - local22 >> Static451.anInt7905;
				@Pc(61) int local61 = local13.method2427() + local22 >> Static451.anInt7905;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static382.anInt6965) {
					local61 = Static382.anInt6965 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray32[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static93.anInt1898) {
						local108 = Static93.anInt1898 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class49_Sub2 local141 = Static156.method2467(local16, local125, local78, fu.class);
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
									local182 = local10.aShortArray32[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray32[local32 - 1];
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
									local182 = local10.aShortArray32[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray32[local32 + 1];
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
				Static98.aBooleanArray45[local1] = true;
				Static544.aClass205Array3[local16].method6747(local13, local37);
			}
		}
	}
}
