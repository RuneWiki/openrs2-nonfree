import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
	public static int anInt7806 = 1;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIBII)V")
	public static void method6391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static108.anInt2079 = arg3;
		Static138.anInt3087 = arg2;
		Static44.anInt1027 = arg1;
		Static332.anInt6027 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
	public static void method6397() {
		Static394.anInt6906 = -1;
		Static259.aBoolean354 = false;
		Static171.anInt3648 = 1;
		Static300.anInt5541 = -1;
		Static377.aClass251_90 = null;
		Static213.anInt8692 = 2;
		Static430.anInt7500 = 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
	public static void method6399() {
		for (@Pc(1) int local1 = 0; local1 < Static573.anInt9406; local1++) {
			if (!Static599.aBooleanArray44[local1]) {
				@Pc(10) Class78 local10 = Static478.aClass78Array1[local1];
				@Pc(13) Class6_Sub7 local13 = local10.aClass6_Sub7_1;
				@Pc(16) int local16 = local10.anInt2074;
				@Pc(22) int local22 = local13.method4283() - Static108.anInt2068;
				@Pc(30) int local30 = (local22 * 2 >> Static339.anInt6128) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method4292() - local22 >> Static339.anInt6128;
				@Pc(53) int local53 = local13.method4286() - local22 >> Static339.anInt6128;
				@Pc(61) int local61 = local13.method4286() + local22 >> Static339.anInt6128;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static555.anInt9182) {
					local61 = Static555.anInt9182 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray13[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static401.anInt7022) {
						local108 = Static401.anInt7022 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class4_Sub1 local141 = Static117.method2480(local16, local125, local78, wda.class);
						if (local141 != null && local141.aByte107 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte107 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray13[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray13[local32 - 1];
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
									local182 = local10.aShortArray13[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray13[local32 + 1];
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
				Static599.aBooleanArray44[local1] = true;
				Static133.aClass59Array3[local16].method7866(local13, local37);
			}
		}
	}
}
