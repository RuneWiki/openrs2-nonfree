import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!qh;")
	public static Class3_Sub39 aClass3_Sub39_2;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "[I")
	public static final int[] anIntArray440 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBI)Z")
	public static boolean method4100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([JI[I)V")
	public static void method4101(@OriginalArg(0) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static211.method3882(arg0.length - 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "()V")
	public static void method4102() {
		for (@Pc(1) int local1 = 0; local1 < Static84.anInt1836; local1++) {
			if (!Static69.aBooleanArray7[local1]) {
				@Pc(10) Class103 local10 = Static513.aClass103Array1[local1];
				@Pc(13) Class3_Sub30 local13 = local10.aClass3_Sub30_1;
				@Pc(16) int local16 = local10.anInt3141;
				@Pc(22) int local22 = local13.method5387() - Static467.anInt8424;
				@Pc(30) int local30 = (local22 * 2 >> Static33.anInt880) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5386() - local22 >> Static33.anInt880;
				@Pc(53) int local53 = local13.method5388() - local22 >> Static33.anInt880;
				@Pc(61) int local61 = local13.method5388() + local22 >> Static33.anInt880;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static108.anInt2385) {
					local61 = Static108.anInt2385 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray78[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static126.anInt2626) {
						local108 = Static126.anInt2626 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class6_Sub1 local141 = Static420.method6482(local16, local125, local78, ada.class);
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
									local182 = local10.aShortArray78[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray78[local32 - 1];
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
									local182 = local10.aShortArray78[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray78[local32 + 1];
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
				Static69.aBooleanArray7[local1] = true;
				Static511.aClass52Array3[local16].method7832(local13, local37);
			}
		}
	}
}
