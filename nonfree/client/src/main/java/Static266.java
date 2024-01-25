import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_366 = new Class12(51, -2);

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	public static int anInt7428 = 0;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "[I")
	public static final int[] anIntArray561 = new int[1000];

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lclient!kf;")
	public static Class137 method5735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static131.aClass137ArrayArrayArray2[0][arg1][arg2] != null && Static131.aClass137ArrayArrayArray2[0][arg1][arg2].aClass137_1 != null;
			if (local28 && arg0 >= Static29.anInt482 - 1) {
				return null;
			}
			Static221.method5883(arg0, arg1, arg2);
		}
		return Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "()V")
	public static void method5736() {
		for (@Pc(1) int local1 = 0; local1 < Static121.anInt2306; local1++) {
			if (!Static60.aBooleanArray4[local1]) {
				@Pc(10) Class253 local10 = Static352.aClass253Array1[local1];
				@Pc(13) Class1_Sub12 local13 = local10.aClass1_Sub12_2;
				@Pc(16) int local16 = local10.anInt7485;
				@Pc(22) int local22 = local13.method3180() - Static86.anInt1530;
				@Pc(30) int local30 = (local22 * 2 >> Static58.anInt1051) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method3182() - local22 >> Static58.anInt1051;
				@Pc(53) int local53 = local13.method3181() - local22 >> Static58.anInt1051;
				@Pc(61) int local61 = local13.method3181() + local22 >> Static58.anInt1051;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static219.anInt3872) {
					local61 = Static219.anInt3872 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray115[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static251.anInt4344) {
						local108 = Static251.anInt4344 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class47_Sub1 local141 = Static286.method3918(local16, local125, local78, tp.class);
						if (local141 != null && local141.aByte96 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte96 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray115[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray115[local32 - 1];
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
									local182 = local10.aShortArray115[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray115[local32 + 1];
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
				Static60.aBooleanArray4[local1] = true;
				Static256.aClass70Array2[local16].method4265(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(JZII)V")
	public static void method5737(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static382.method4555(arg1, arg2, 0, local15, true, 0, local22, 0);
			return;
		}
		@Pc(61) Class29 local61 = Static251.aClass207_2.method4977(local29);
		@Pc(69) int local69;
		@Pc(72) int local72;
		if (local22 == 0 || local22 == 2) {
			local69 = local61.anInt532;
			local72 = local61.anInt542;
		} else {
			local69 = local61.anInt542;
			local72 = local61.anInt532;
		}
		@Pc(83) int local83 = local61.anInt566;
		if (local22 != 0) {
			local83 = (local83 << local22 & 0xF) + (local83 >> 4 - local22);
		}
		Static382.method4555(arg1, arg2, local83, 0, true, local69, 0, local72);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[B)[B")
	public static byte[] method5739(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[arg0];
		Static459.method1552(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
