import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!am", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!am", name = "v", descriptor = "Lclient!hg;")
	public static Class99 aClass99_2;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "[Lclient!go;")
	public static final Class5_Sub2_Sub6[] aClass5_Sub2_Sub6Array1 = new Class5_Sub2_Sub6[14];

	@OriginalMember(owner = "client!am", name = "a", descriptor = "()V")
	public static void method260() {
		for (@Pc(1) int local1 = 0; local1 < Static70.anInt1276; local1++) {
			if (!Static381.aBooleanArray14[local1]) {
				@Pc(10) Class111 local10 = Static68.aClass111Array1[local1];
				@Pc(13) Class5_Sub19 local13 = local10.aClass5_Sub19_2;
				@Pc(16) int local16 = local10.anInt2911;
				@Pc(22) int local22 = local13.method4982() - Static301.anInt4709;
				@Pc(30) int local30 = (local22 * 2 >> Static419.anInt6980) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method4977() - local22 >> Static419.anInt6980;
				@Pc(53) int local53 = local13.method4979() - local22 >> Static419.anInt6980;
				@Pc(61) int local61 = local13.method4979() + local22 >> Static419.anInt6980;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static459.anInt4775) {
					local61 = Static459.anInt4775 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray33[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static439.anInt7318) {
						local108 = Static439.anInt7318 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class2_Sub1 local141 = Static12.method194(local16, local125, local78, aa.class);
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
									local182 = local10.aShortArray33[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray33[local32 - 1];
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
									local182 = local10.aShortArray33[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray33[local32 + 1];
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
				Static381.aBooleanArray14[local1] = true;
				Static410.aClass125Array3[local16].method4987(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)I")
	public static int method261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return ((arg2 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7) + (arg0 >> 1);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IBI)Z")
	public static boolean method262(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
