import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!bia;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public static int anInt7764;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI[BI)Ljava/lang/String;")
	public static String method6678(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(22) int local22 = arg2 + arg0;
		while (local17 < local22) {
			@Pc(31) int local31 = arg1[local17++] & 0xFF;
			@Pc(43) int local43;
			if (local31 < 128) {
				if (local31 == 0) {
					local43 = 65533;
				} else {
					local43 = local31;
				}
			} else if (local31 < 192) {
				local43 = 65533;
			} else if (local31 >= 224) {
				if (local31 >= 240) {
					if (local31 >= 248) {
						local43 = 65533;
					} else if (local17 + 2 < local22 && (arg1[local17] & 0xC0) == 128 && (arg1[local17 + 1] & 0xC0) == 128 && (arg1[local17 + 2] & 0xC0) == 128) {
						local43 = (arg1[local17++] & 0x3F) << 12 | (local31 & 0x7) << 18 | (arg1[local17++] & 0x3F) << 6 | arg1[local17++] & 0x3F;
						if (local43 >= 65536 && local43 <= 1114111) {
							local43 = 65533;
						} else {
							local43 = 65533;
						}
					} else {
						local43 = 65533;
					}
				} else if (local17 + 1 < local22 && (arg1[local17] & 0xC0) == 128 && (arg1[local17 + 1] & 0xC0) == 128) {
					local43 = (local31 & 0xF) << 12 | arg1[local17++] << 6 & 0xFC0 | arg1[local17++] & 0x3F;
					if (local43 < 2048) {
						local43 = 65533;
					}
				} else {
					local43 = 65533;
				}
			} else if (local22 > local17 && (arg1[local17] & 0xC0) == 128) {
				local43 = arg1[local17++] & 0x3F | (local31 & 0x1F) << 6;
				if (local43 < 128) {
					local43 = 65533;
				}
			} else {
				local43 = 65533;
			}
			local8[local10++] = (char) local43;
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
	public static void method6679() {
		for (@Pc(1) int local1 = 0; local1 < Static523.anInt9117; local1++) {
			if (!Static612.aBooleanArray48[local1]) {
				@Pc(10) Class68 local10 = Static105.aClass68Array1[local1];
				@Pc(13) Class6_Sub1 local13 = local10.aClass6_Sub1_1;
				@Pc(16) int local16 = local10.anInt2166;
				@Pc(22) int local22 = local13.method8268() - Static557.anInt9470;
				@Pc(30) int local30 = (local22 * 2 >> Static643.anInt10682) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8264() - local22 >> Static643.anInt10682;
				@Pc(53) int local53 = local13.method8260() - local22 >> Static643.anInt10682;
				@Pc(61) int local61 = local13.method8260() + local22 >> Static643.anInt10682;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static608.anInt10072) {
					local61 = Static608.anInt10072 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray49[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static544.anInt9353) {
						local108 = Static544.anInt9353 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class20_Sub2_Sub2 local141 = Static366.method5797(local16, local125, local78, oda.class);
						if (local141 != null && local141.aByte132 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte132 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray49[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray49[local32 - 1];
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
									local182 = local10.aShortArray49[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray49[local32 + 1];
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
				Static612.aBooleanArray48[local1] = true;
				Static195.aClass199Array1[local16].method8526(local13, local37);
			}
		}
	}
}
