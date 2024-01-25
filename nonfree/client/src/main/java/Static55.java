import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bq", name = "J", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_58 = new Class289(16, 0);

	@OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
	public static int anInt4238 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;IILjava/lang/String;)V")
	public static void method3549(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		Static593.method8154(arg2, arg1, -1, arg0, arg5, arg3, (String) null, arg4);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3550(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			local18 = (local18 << 5) + arg0.charAt(local20) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBI)Z")
	public static boolean method3551(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static164.method9055(arg1, arg0) | (arg1 & 0x800) != 0 || Static454.method6568(arg1, arg0);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "()V")
	public static void method3552() {
		for (@Pc(1) int local1 = 0; local1 < Static390.anInt6562; local1++) {
			if (!Static223.aBooleanArray11[local1]) {
				@Pc(10) Class394 local10 = Static193.aClass394Array1[local1];
				@Pc(13) Class6_Sub17 local13 = local10.aClass6_Sub17_3;
				@Pc(16) int local16 = local10.anInt10794;
				@Pc(22) int local22 = local13.method8520() - Static625.anInt10177;
				@Pc(30) int local30 = (local22 * 2 >> Static185.anInt3178) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8518() - local22 >> Static185.anInt3178;
				@Pc(53) int local53 = local13.method8521() - local22 >> Static185.anInt3178;
				@Pc(61) int local61 = local13.method8521() + local22 >> Static185.anInt3178;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static245.anInt4308) {
					local61 = Static245.anInt4308 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray160[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static209.anInt3602) {
						local108 = Static209.anInt3602 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class2_Sub1_Sub1 local141 = Static486.method7064(local16, local125, local78, aaa.class);
						if (local141 != null && local141.aByte142 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte142 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray160[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray160[local32 - 1];
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
									local182 = local10.aShortArray160[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray160[local32 + 1];
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
				Static223.aBooleanArray11[local1] = true;
				Static289.aClass12Array3[local16].method7856(local13, local37);
			}
		}
	}
}
