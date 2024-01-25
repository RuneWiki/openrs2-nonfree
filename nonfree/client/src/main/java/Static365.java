import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
	public static int anInt6684;

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
	public static int anInt6688 = 0;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLclient!pj;)V")
	public static void method5402(@OriginalArg(1) Class248 arg0) {
		Static455.aClass248_88 = arg0;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZIILclient!pj;IZ)V")
	public static void method5403(@OriginalArg(1) int arg0, @OriginalArg(3) Class248 arg1, @OriginalArg(4) int arg2) {
		Static95.aBoolean114 = false;
		Static226.aClass248_33 = arg1;
		Static540.anInt8992 = arg2;
		Static321.anInt6142 = 10000;
		Static131.anInt2504 = 1;
		Static426.anInt7575 = arg0;
		Static554.anInt9644 = 0;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method5404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(18) String local18 = arg2[arg1];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(30) int local30 = arg0 + arg1;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg1; local34 < local30; local34++) {
				@Pc(40) String local40 = arg2[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(63) StringBuffer local63 = new StringBuffer(local32);
			for (@Pc(70) int local70 = arg1; local70 < local30; local70++) {
				@Pc(76) String local76 = arg2[local70];
				if (local76 == null) {
					local63.append("null");
				} else {
					local63.append(local76);
				}
			}
			return local63.toString();
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "()V")
	public static void method5405() {
		for (@Pc(1) int local1 = 0; local1 < Static28.anInt487; local1++) {
			if (!Static170.aBooleanArray12[local1]) {
				@Pc(10) Class255 local10 = Static111.aClass255Array1[local1];
				@Pc(13) Class6_Sub25 local13 = local10.aClass6_Sub25_3;
				@Pc(16) int local16 = local10.anInt7361;
				@Pc(22) int local22 = local13.method6398() - Static259.anInt4703;
				@Pc(30) int local30 = (local22 * 2 >> Static23.anInt420) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method6405() - local22 >> Static23.anInt420;
				@Pc(53) int local53 = local13.method6400() - local22 >> Static23.anInt420;
				@Pc(61) int local61 = local13.method6400() + local22 >> Static23.anInt420;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static20.anInt358) {
					local61 = Static20.anInt358 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray120[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static547.anInt9363) {
						local108 = Static547.anInt9363 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class15_Sub2 local141 = Static406.method5850(local16, local125, local78, bt.class);
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
									local182 = local10.aShortArray120[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray120[local32 - 1];
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
									local182 = local10.aShortArray120[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray120[local32 + 1];
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
				Static170.aBooleanArray12[local1] = true;
				Static205.aClass46Array1[local16].method7965(local13, local37);
			}
		}
	}
}
