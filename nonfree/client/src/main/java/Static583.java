import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "[Lclient!un;")
	public static Class333[] aClass333Array1;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
	public static int[] anIntArray731;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	public static int anInt9562 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
	public static void method7797() {
		Static577.aClass222_64.method4433(50);
		Static208.aClass222_25.method4433(50);
		Static143.aClass222_15.method4433(50);
		Static363.aClass222_37.method4433(50);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIF[FFBIIIF)V")
	public static void method7798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(14) int local14 = arg9 - arg2;
		@Pc(18) int local18 = arg4 - arg1;
		@Pc(22) int local22 = arg3 - arg10;
		@Pc(43) float local43 = arg6[0] * (float) local14 + (float) local22 * arg6[1] + (float) local18 * arg6[2];
		@Pc(64) float local64 = (float) local14 * arg6[3] + (float) local22 * arg6[4] + arg6[5] * (float) local18;
		@Pc(85) float local85 = arg6[7] * (float) local22 + arg6[6] * (float) local14 + (float) local18 * arg6[8];
		@Pc(100) float local100;
		@Pc(94) float local94;
		if (arg0 == 0) {
			local94 = arg11 + 0.5F - local85;
			local100 = arg7 + local43 + 0.5F;
		} else if (arg0 == 1) {
			local100 = local43 + arg7 + 0.5F;
			local94 = local85 + arg11 + 0.5F;
		} else if (arg0 == 2) {
			local94 = arg5 + 0.5F - local64;
			local100 = arg7 + 0.5F - local43;
		} else if (arg0 == 3) {
			local94 = arg5 + 0.5F - local64;
			local100 = arg7 + local43 + 0.5F;
		} else if (arg0 == 4) {
			local94 = arg5 + 0.5F - local64;
			local100 = arg11 + local85 + 0.5F;
		} else {
			local100 = arg11 + 0.5F - local85;
			local94 = arg5 + 0.5F - local64;
		}
		@Pc(197) float local197;
		if (arg8 == 1) {
			local197 = local100;
			local100 = -local94;
			local94 = local197;
		} else if (arg8 == 2) {
			local94 = -local94;
			local100 = -local100;
		} else if (arg8 == 3) {
			local197 = local100;
			local100 = local94;
			local94 = -local197;
		}
		Static227.aFloat110 = local100;
		Static498.aFloat203 = local94;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)Lclient!ws;")
	public static Class364 method7799() {
		return new Class364(1, false);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILclient!r;ILclient!vg;IILclient!ua;I)V")
	public static void method7800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class341 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class204 arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class310 local10 = Static383.aClass273_3.method5840(arg7);
		if (local10 == null || !local10.aBoolean619 || !local10.method6534(Static430.aClass321_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray624 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray624.length];
			@Pc(42) int local42;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static340.anInt5707 == 4) {
					local42 = (int) Static167.aFloat59 & 0x3FFF;
				} else {
					local42 = (int) Static167.aFloat59 + Static548.anInt8574 & 0x3FFF;
				}
				@Pc(53) int local53 = Class1_Sub6_Sub2.anIntArray675[local42];
				@Pc(57) int local57 = Class1_Sub6_Sub2.anIntArray676[local42];
				if (Static340.anInt5707 != 4) {
					local57 = local57 * 256 / (Static348.anInt5786 + 256);
					local53 = local53 * 256 / (Static348.anInt5786 + 256);
				}
				local28[local30 * 2] = ((local10.anIntArray624[local30 * 2 + 1] * 4 + arg5) * local53 + (local10.anIntArray624[local30 * 2] * 4 + arg0) * local57 >> 14) + arg4.anInt9300 / 2 + arg3;
				local28[local30 * 2 + 1] = arg1 + arg4.anInt9248 / 2 - ((local10.anIntArray624[local30 * 2 + 1] * 4 + arg5) * local57 - (local10.anIntArray624[local30 * 2] * 4 + arg0) * local53 >> 14);
			}
			Static551.method7498(arg2, local28, local10.anInt8111, arg4.anIntArray694, arg4.anIntArray700);
			for (local42 = 0; local42 < local28.length / 2 - 1; local42++) {
				arg2.method6921(local28[local42 * 2], local28[local42 * 2 + 1], local28[(local42 + 1) * 2], local28[(local42 + 1) * 2 + 1], local10.anInt8118, arg6, arg3, arg1);
			}
			arg2.method6921(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt8118, arg6, arg3, arg1);
		}
		@Pc(261) Class22 local261 = null;
		if (local10.anInt8124 != -1) {
			local261 = local10.method6532(false, arg2);
			if (local261 != null) {
				Static387.method5334(arg6, arg0, arg4, arg1, arg3, arg5, local261);
			}
		}
		if (local10.aString84 == null) {
			return;
		}
		local30 = 0;
		if (local261 != null) {
			local30 = local261.u();
		}
		@Pc(294) Class64 local294 = Static28.aClass64_1;
		@Pc(296) Class334 local296 = Static291.aClass334_9;
		if (local10.anInt8135 == 1) {
			local296 = Static268.aClass334_14;
			local294 = Static442.aClass64_12;
		}
		if (local10.anInt8135 == 2) {
			local294 = Static418.aClass64_11;
			local296 = Static373.aClass334_13;
		}
		Static1.method39(local294, arg3, arg4, local10.anInt8126, arg0, local296, arg6, arg1, local10.aString84, arg5, local30);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public static void method7801() {
		for (@Pc(7) int local7 = 0; local7 < Static134.anInt2588; local7++) {
			Static546.aClass342Array4[local7] = null;
		}
		Static134.anInt2588 = 0;
		@Pc(33) int local33;
		@Pc(37) int local37;
		for (@Pc(29) int local29 = 0; local29 < Static175.anInt9133; local29++) {
			for (local33 = 0; local33 < Static27.anInt373; local33++) {
				for (local37 = 0; local37 < Static507.anInt8645; local37++) {
					@Pc(47) Class39 local47 = Static292.aClass39ArrayArrayArray2[local29][local37][local33];
					if (local47 != null) {
						if (local47.aShort4 > 0) {
							local47.aShort4 = (short) (local47.aShort4 * -1);
						}
						if (local47.aShort7 > 0) {
							local47.aShort7 = (short) (local47.aShort7 * -1);
						}
					}
				}
			}
		}
		for (local33 = 0; local33 < Static175.anInt9133; local33++) {
			for (local37 = 0; local37 < Static27.anInt373; local37++) {
				for (@Pc(98) int local98 = 0; local98 < Static507.anInt8645; local98++) {
					@Pc(108) Class39 local108 = Static292.aClass39ArrayArrayArray2[local33][local98][local37];
					if (local108 != null) {
						@Pc(131) boolean local131 = Static292.aClass39ArrayArrayArray2[0][local98][local37] != null && Static292.aClass39ArrayArrayArray2[0][local98][local37].aClass39_1 != null;
						@Pc(136) int local136;
						@Pc(138) int local138;
						@Pc(140) int local140;
						@Pc(142) int local142;
						@Pc(152) Class39 local152;
						@Pc(160) int local160;
						@Pc(302) int local302;
						@Pc(431) int local431;
						@Pc(438) int local438;
						@Pc(454) int local454;
						@Pc(461) int local461;
						@Pc(465) int local465;
						@Pc(469) int local469;
						@Pc(475) int local475;
						@Pc(514) int local514;
						@Pc(518) int local518;
						if (local108.aShort4 < 0) {
							local136 = local37;
							local138 = local37;
							local140 = local33;
							local142 = local33;
							local152 = Static292.aClass39ArrayArrayArray2[local33][local98][local37 - 1];
							local160 = Static216.aClass47Array2[local33].method7545(local98, local37);
							while (local136 > 0 && local152 != null && local152.aShort4 < 0 && local152.aShort4 == local108.aShort4 && local152.aShort5 == local108.aShort5 && Static216.aClass47Array2[local33].method7545(local98, local136 - 1) == local160 && (local136 - 1 <= 0 || local160 == Static216.aClass47Array2[local33].method7545(local98, local136 - 2))) {
								local136--;
								local152 = Static292.aClass39ArrayArrayArray2[local33][local98][local136 - 1];
							}
							for (local152 = Static292.aClass39ArrayArrayArray2[local33][local98][local37 + 1]; local138 < Static507.anInt8645 && local152 != null && local152.aShort4 < 0 && local152.aShort4 == local108.aShort4 && local152.aShort5 == local108.aShort5 && Static216.aClass47Array2[local33].method7545(local98, local138 + 1) == local160 && (Static507.anInt8645 <= local138 + 1 || Static216.aClass47Array2[local33].method7545(local98, local138 + 2) == local160); local152 = Static292.aClass39ArrayArrayArray2[local33][local98][local138 + 1]) {
								local138++;
							}
							label289: while (local140 > 0) {
								for (local302 = local136; local302 <= local138; local302++) {
									if (Static292.aClass39ArrayArrayArray2[local140 - 1][local98][local302] == null || Static292.aClass39ArrayArrayArray2[local140 - 1][local98][local302].aShort4 != local108.aShort4 || local108.aShort5 != Static292.aClass39ArrayArrayArray2[local140 - 1][local98][local302].aShort5) {
										break label289;
									}
								}
								local140--;
							}
							label306: while (local142 < Static175.anInt9133 - 1) {
								for (local302 = local136; local302 <= local138; local302++) {
									if (Static292.aClass39ArrayArrayArray2[local142 + 1][local98][local302] == null || Static292.aClass39ArrayArrayArray2[local142 + 1][local98][local302].aShort4 != local108.aShort4 || Static292.aClass39ArrayArrayArray2[local142 + 1][local98][local302].aShort5 != local108.aShort5) {
										break label306;
									}
								}
								local142++;
							}
							local302 = local142 + 1 - local140;
							local431 = Static216.aClass47Array2[local131 ? local140 + 1 : local140].method7545(local98, local136);
							local438 = local108.aShort4 * local302 + local431;
							local454 = Static216.aClass47Array2[local131 ? local140 + 1 : local140].method7545(local98, local138 + 1);
							local461 = local454 + local302 * local108.aShort4;
							local465 = local98 << Static351.anInt5832;
							local469 = local136 << Static351.anInt5832;
							local475 = (local138 << Static351.anInt5832) + Static379.anInt6307;
							Static546.aClass342Array4[Static134.anInt2588++] = new Class342(1, local142, local108.aShort5 + local465, local465 - -local108.aShort5, local108.aShort5 + local465, local108.aShort5 + local465, local431, local454, local461, local438, local469, local475, local475, local469);
							for (local514 = local140; local514 <= local142; local514++) {
								for (local518 = local136; local518 <= local138; local518++) {
									Static292.aClass39ArrayArrayArray2[local514][local98][local518].aShort4 = (short) (Static292.aClass39ArrayArrayArray2[local514][local98][local518].aShort4 * -1);
								}
							}
						}
						if (local108.aShort7 < 0) {
							local136 = local98;
							local138 = local98;
							local140 = local33;
							local142 = local33;
							local152 = Static292.aClass39ArrayArrayArray2[local33][local98 - 1][local37];
							local160 = Static216.aClass47Array2[local33].method7545(local98, local37);
							while (local136 > 0 && local152 != null && local152.aShort7 < 0 && local152.aShort7 == local108.aShort7 && local152.aShort6 == local108.aShort6 && Static216.aClass47Array2[local33].method7545(local136 - 1, local37) == local160 && (local136 - 1 <= 0 || Static216.aClass47Array2[local33].method7545(local136 - 2, local37) == local160)) {
								local136--;
								local152 = Static292.aClass39ArrayArrayArray2[local33][local136 - 1][local37];
							}
							for (local152 = Static292.aClass39ArrayArrayArray2[local33][local98 + 1][local37]; local138 < Static27.anInt373 && local152 != null && local152.aShort7 < 0 && local108.aShort7 == local152.aShort7 && local108.aShort6 == local152.aShort6 && local160 == Static216.aClass47Array2[local33].method7545(local138 + 1, local37) && (local138 + 1 >= Static27.anInt373 || local160 == Static216.aClass47Array2[local33].method7545(local138 + 2, local37)); local152 = Static292.aClass39ArrayArrayArray2[local33][local138 + 1][local37]) {
								local138++;
							}
							label205: while (local140 > 0) {
								for (local302 = local136; local302 <= local138; local302++) {
									if (Static292.aClass39ArrayArrayArray2[local140 - 1][local302][local37] == null || local108.aShort7 != Static292.aClass39ArrayArrayArray2[local140 - 1][local302][local37].aShort7 || local108.aShort6 != Static292.aClass39ArrayArrayArray2[local140 - 1][local302][local37].aShort6) {
										break label205;
									}
								}
								local140--;
							}
							label190: while (local142 < Static175.anInt9133 - 1) {
								for (local302 = local136; local302 <= local138; local302++) {
									if (Static292.aClass39ArrayArrayArray2[local142 + 1][local302][local37] == null || local108.aShort7 != Static292.aClass39ArrayArrayArray2[local142 + 1][local302][local37].aShort7 || Static292.aClass39ArrayArrayArray2[local142 + 1][local302][local37].aShort6 != local108.aShort6) {
										break label190;
									}
								}
								local142++;
							}
							local302 = local142 + 1 - local140;
							local431 = Static216.aClass47Array2[local131 ? local140 + 1 : local140].method7545(local136, local37);
							local438 = local108.aShort7 * local302 + local431;
							local454 = Static216.aClass47Array2[local131 ? local140 + 1 : local140].method7545(local138 + 1, local37);
							local461 = local302 * local108.aShort7 + local454;
							local465 = local136 << Static351.anInt5832;
							local469 = Static379.anInt6307 + (local138 << Static351.anInt5832);
							local475 = local37 << Static351.anInt5832;
							Static546.aClass342Array4[Static134.anInt2588++] = new Class342(2, local142, local465, local469, local469, local465, local431, local454, local461, local438, local475 + local108.aShort6, local108.aShort6 + local475, local108.aShort6 + local475, local475 - -local108.aShort6);
							for (local514 = local140; local514 <= local142; local514++) {
								for (local518 = local136; local518 <= local138; local518++) {
									Static292.aClass39ArrayArrayArray2[local514][local518][local37].aShort7 = (short) (Static292.aClass39ArrayArrayArray2[local514][local518][local37].aShort7 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static146.aBoolean750 = true;
	}
}
