import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
	public static final int anInt8645 = 1339;

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "[J")
	public static final long[] aLongArray14 = new long[100];

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "([BBILjava/lang/String;)I")
	public static int method7041(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(10) int local10 = arg1;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(21) char local21 = arg2.charAt(local12);
			if (local21 <= '\u007f') {
				arg0[local10++] = (byte) local21;
			} else if (local21 > '\u07ff') {
				arg0[local10++] = (byte) (local21 >> 12 | 0xE0);
				arg0[local10++] = (byte) (local21 >> 6 & 0x3F | 0x80);
				arg0[local10++] = (byte) (local21 & 0x3F | 0x80);
			} else {
				arg0[local10++] = (byte) (local21 >> 6 | 0xC0);
				arg0[local10++] = (byte) (local21 & 0x3F | 0x80);
			}
		}
		return local10 - arg1;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(II[S)[S")
	public static short[] method7042(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static585.method3078(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "()V")
	public static void method7043() {
		for (@Pc(1) int local1 = 0; local1 < Static164.anInt2888; local1++) {
			if (!Static368.aBooleanArray35[local1]) {
				@Pc(10) Class178 local10 = Static149.aClass178Array1[local1];
				@Pc(13) Class6_Sub7 local13 = local10.aClass6_Sub7_2;
				@Pc(16) int local16 = local10.anInt4479;
				@Pc(22) int local22 = local13.method3487() - Static431.anInt7547;
				@Pc(30) int local30 = (local22 * 2 >> Static188.anInt3275) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method3490() - local22 >> Static188.anInt3275;
				@Pc(53) int local53 = local13.method3492() - local22 >> Static188.anInt3275;
				@Pc(61) int local61 = local13.method3492() + local22 >> Static188.anInt3275;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static164.anInt2881) {
					local61 = Static164.anInt2881 - 1;
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
					if (local108 >= Static80.anInt1391) {
						local108 = Static80.anInt1391 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class29_Sub2 local141 = Static134.method1995(local16, local125, local78, hc.class);
						if (local141 != null && local141.aByte104 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte104 == 1) {
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
				Static368.aBooleanArray35[local1] = true;
				Static285.aClass60Array8[local16].method7893(local13, local37);
			}
		}
	}
}
