import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!ai", name = "J", descriptor = "Lclient!sc;")
	public static final Class300 aClass300_2 = new Class300();

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_10 = new Class298(80, 4);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
	public static void method244() {
		for (@Pc(1) int local1 = 0; local1 < Static218.anInt4299; local1++) {
			if (!Static302.aBooleanArray31[local1]) {
				@Pc(10) Class258 local10 = Static569.aClass258Array1[local1];
				@Pc(13) Class3_Sub22 local13 = local10.aClass3_Sub22_2;
				@Pc(16) int local16 = local10.anInt6859;
				@Pc(22) int local22 = local13.method6729() - Static122.anInt2780;
				@Pc(30) int local30 = (local22 * 2 >> Static458.anInt7508) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method6731() - local22 >> Static458.anInt7508;
				@Pc(53) int local53 = local13.method6725() - local22 >> Static458.anInt7508;
				@Pc(61) int local61 = local13.method6725() + local22 >> Static458.anInt7508;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static157.anInt3168) {
					local61 = Static157.anInt3168 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray224[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static411.anInt6927) {
						local108 = Static411.anInt6927 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class9_Sub1_Sub1 local141 = Static417.method5998(local16, local125, local78, vr.class);
						if (local141 != null && local141.aByte124 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte124 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray224[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray224[local32 - 1];
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
									local182 = local10.aShortArray224[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray224[local32 + 1];
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
				Static302.aBooleanArray31[local1] = true;
				Static29.aClass139Array6[local16].method6883(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)Z")
	public static boolean method248() {
		return Static151.anInt3123 > 0;
	}
}
