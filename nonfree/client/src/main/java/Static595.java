import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!eia;")
	public static Class88 aClass88_20;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZ)I")
	public static int method8363(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub24 local14 = Static640.method8894(arg0, false);
		if (local14 == null) {
			return Static396.aClass157_1.method4136(arg0).anInt2885;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray307.length; local26++) {
			if (local14.anIntArray307[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static396.aClass157_1.method4136(arg0).anInt2885 - local14.anIntArray307.length;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIII)I")
	public static int method8368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public static void method8369() {
		for (@Pc(1) int local1 = 0; local1 < Static486.anInt8045; local1++) {
			if (!Static648.aBooleanArray55[local1]) {
				@Pc(10) Class265 local10 = Static541.aClass265Array1[local1];
				@Pc(13) Class3_Sub15 local13 = local10.aClass3_Sub15_2;
				@Pc(16) int local16 = local10.anInt7434;
				@Pc(22) int local22 = local13.method8378() - Static597.anInt9602;
				@Pc(30) int local30 = (local22 * 2 >> Static391.anInt10262) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8384() - local22 >> Static391.anInt10262;
				@Pc(53) int local53 = local13.method8383() - local22 >> Static391.anInt10262;
				@Pc(61) int local61 = local13.method8383() + local22 >> Static391.anInt10262;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static602.anInt9668) {
					local61 = Static602.anInt9668 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray109[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static146.anInt2951) {
						local108 = Static146.anInt2951 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class28_Sub1_Sub1 local141 = Static318.method4861(local16, local125, local78, nb.class);
						if (local141 != null && local141.aByte175 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte175 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray109[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray109[local32 - 1];
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
									local182 = local10.aShortArray109[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray109[local32 + 1];
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
				Static648.aBooleanArray55[local1] = true;
				Static121.aClass21Array2[local16].method7975(local13, local37);
			}
		}
	}
}
