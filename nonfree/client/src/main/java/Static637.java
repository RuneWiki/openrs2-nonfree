import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
	public static int anInt8736 = 0;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "()V")
	public static void method7521() {
		for (@Pc(1) int local1 = 0; local1 < Static461.anInt7766; local1++) {
			if (!Static560.aBooleanArray26[local1]) {
				@Pc(10) Class174 local10 = Static278.aClass174Array1[local1];
				@Pc(13) Class5_Sub11 local13 = local10.aClass5_Sub11_2;
				@Pc(16) int local16 = local10.anInt4603;
				@Pc(22) int local22 = local13.method8099() - Static147.anInt2575;
				@Pc(30) int local30 = (local22 * 2 >> Static115.anInt2156) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8103() - local22 >> Static115.anInt2156;
				@Pc(53) int local53 = local13.method8098() - local22 >> Static115.anInt2156;
				@Pc(61) int local61 = local13.method8098() + local22 >> Static115.anInt2156;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static429.anInt7422) {
					local61 = Static429.anInt7422 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray60[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static357.anInt5961) {
						local108 = Static357.anInt5961 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class4_Sub2_Sub1 local141 = Static217.method3700(local16, local125, local78, vp.class);
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
									local182 = local10.aShortArray60[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray60[local32 - 1];
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
									local182 = local10.aShortArray60[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray60[local32 + 1];
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
				Static560.aBooleanArray26[local1] = true;
				Static11.aClass61Array1[local16].method8578(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIIBIILclient!ha;II[[[B)V")
	public static void method7526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class133 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg0 == 0 || arg5 == 0) {
			return;
		}
		if (arg0 == 9) {
			arg0 = 1;
			arg2 = arg2 + 1 & 0x3;
		}
		if (arg0 == 10) {
			arg0 = 1;
			arg2 = arg2 + 3 & 0x3;
		}
		if (arg0 == 11) {
			arg2 = arg2 + 3 & 0x3;
			arg0 = 8;
		}
		arg8.Q(arg10, arg3, arg6, arg1, arg7, arg9, arg11[arg0 - 1][arg2], arg5, arg4);
	}
}
