import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
	public static int anInt329;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
	public static int anInt331 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)I")
	public static int method290(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method291() {
		for (@Pc(7) int local7 = 0; local7 < Static272.anInt5008; local7++) {
			Static402.aClass38Array3[local7] = null;
		}
		Static272.anInt5008 = 0;
		@Pc(27) int local27;
		@Pc(31) int local31;
		for (@Pc(23) int local23 = 0; local23 < Static219.anInt4088; local23++) {
			for (local27 = 0; local27 < Static216.anInt4042; local27++) {
				for (local31 = 0; local31 < Static233.anInt4238; local31++) {
					@Pc(41) Class226 local41 = Static635.aClass226ArrayArrayArray3[local23][local31][local27];
					if (local41 != null) {
						if (local41.aShort66 > 0) {
							local41.aShort66 = (short) (local41.aShort66 * -1);
						}
						if (local41.aShort68 > 0) {
							local41.aShort68 = (short) (local41.aShort68 * -1);
						}
					}
				}
			}
		}
		for (local27 = 0; local27 < Static219.anInt4088; local27++) {
			for (local31 = 0; local31 < Static216.anInt4042; local31++) {
				for (@Pc(88) int local88 = 0; local88 < Static233.anInt4238; local88++) {
					@Pc(98) Class226 local98 = Static635.aClass226ArrayArrayArray3[local27][local88][local31];
					if (local98 != null) {
						@Pc(121) boolean local121 = Static635.aClass226ArrayArrayArray3[0][local88][local31] != null && Static635.aClass226ArrayArrayArray3[0][local88][local31].aClass226_1 != null;
						@Pc(129) int local129;
						@Pc(131) int local131;
						@Pc(145) Class226 local145;
						@Pc(153) int local153;
						@Pc(301) int local301;
						@Pc(317) int local317;
						@Pc(324) int local324;
						@Pc(340) int local340;
						@Pc(348) int local348;
						@Pc(352) int local352;
						@Pc(356) int local356;
						@Pc(362) int local362;
						@Pc(401) int local401;
						@Pc(405) int local405;
						if (local98.aShort66 < 0) {
							local129 = local31;
							local131 = local31;
							local145 = Static635.aClass226ArrayArrayArray3[local27][local88][local31 - 1];
							local153 = Static605.aClass109Array5[local27].method7695(local31, local88);
							while (local129 > 0 && local145 != null && local145.aShort66 < 0 && local145.aShort66 == local98.aShort66 && local98.aShort67 == local145.aShort67 && Static605.aClass109Array5[local27].method7695(local129 - 1, local88) == local153 && (local129 - 1 <= 0 || Static605.aClass109Array5[local27].method7695(local129 - 2, local88) == local153)) {
								local129--;
								local145 = Static635.aClass226ArrayArrayArray3[local27][local88][local129 - 1];
							}
							for (local145 = Static635.aClass226ArrayArrayArray3[local27][local88][local31 + 1]; local131 < Static233.anInt4238 && local145 != null && local145.aShort66 < 0 && local145.aShort66 == local98.aShort66 && local145.aShort67 == local98.aShort67 && local153 == Static605.aClass109Array5[local27].method7695(local131 + 1, local88) && (local131 + 1 >= Static233.anInt4238 || Static605.aClass109Array5[local27].method7695(local131 + 2, local88) == local153); local145 = Static635.aClass226ArrayArrayArray3[local27][local88][local131 + 1]) {
								local131++;
							}
							local301 = local27 + 1 - local27;
							local317 = Static605.aClass109Array5[local121 ? local27 + 1 : local27].method7695(local129, local88);
							local324 = local98.aShort66 * local301 + local317;
							local340 = Static605.aClass109Array5[local121 ? local27 + 1 : local27].method7695(local131 + 1, local88);
							local348 = local340 + local301 * local98.aShort66;
							local352 = local88 << Static588.anInt9672;
							local356 = local129 << Static588.anInt9672;
							local362 = Static671.anInt10769 + (local131 << Static588.anInt9672);
							Static402.aClass38Array3[Static272.anInt5008++] = new Class38(1, local27, local98.aShort67 + local352, local352 - -local98.aShort67, local98.aShort67 + local352, local352 + local98.aShort67, local317, local340, local348, local324, local356, local362, local362, local356);
							for (local401 = local27; local401 <= local27; local401++) {
								for (local405 = local129; local405 <= local131; local405++) {
									Static635.aClass226ArrayArrayArray3[local401][local88][local405].aShort66 = (short) (Static635.aClass226ArrayArrayArray3[local401][local88][local405].aShort66 * -1);
								}
							}
						}
						if (local98.aShort68 < 0) {
							local129 = local88;
							local131 = local88;
							local145 = Static635.aClass226ArrayArrayArray3[local27][local88 - 1][local31];
							local153 = Static605.aClass109Array5[local27].method7695(local31, local88);
							while (local129 > 0 && local145 != null && local145.aShort68 < 0 && local145.aShort68 == local98.aShort68 && local145.aShort65 == local98.aShort65 && Static605.aClass109Array5[local27].method7695(local31, local129 - 1) == local153 && (local129 - 1 <= 0 || Static605.aClass109Array5[local27].method7695(local31, local129 - 2) == local153)) {
								local129--;
								local145 = Static635.aClass226ArrayArrayArray3[local27][local129 - 1][local31];
							}
							for (local145 = Static635.aClass226ArrayArrayArray3[local27][local88 + 1][local31]; Static216.anInt4042 > local131 && local145 != null && local145.aShort68 < 0 && local145.aShort68 == local98.aShort68 && local98.aShort65 == local145.aShort65 && local153 == Static605.aClass109Array5[local27].method7695(local31, local131 + 1) && (Static216.anInt4042 <= local131 + 1 || local153 == Static605.aClass109Array5[local27].method7695(local31, local131 + 2)); local145 = Static635.aClass226ArrayArrayArray3[local27][local131 + 1][local31]) {
								local131++;
							}
							local301 = local27 + 1 - local27;
							local317 = Static605.aClass109Array5[local121 ? local27 + 1 : local27].method7695(local31, local129);
							local324 = local317 + local98.aShort68 * local301;
							local340 = Static605.aClass109Array5[local121 ? local27 + 1 : local27].method7695(local31, local131 + 1);
							local348 = local301 * local98.aShort68 + local340;
							local352 = local129 << Static588.anInt9672;
							local356 = Static671.anInt10769 + (local131 << Static588.anInt9672);
							local362 = local31 << Static588.anInt9672;
							Static402.aClass38Array3[Static272.anInt5008++] = new Class38(2, local27, local352, local356, local356, local352, local317, local340, local348, local324, local362 + local98.aShort65, local98.aShort65 + local362, local98.aShort65 + local362, local362 - -local98.aShort65);
							for (local401 = local27; local401 <= local27; local401++) {
								for (local405 = local129; local405 <= local131; local405++) {
									Static635.aClass226ArrayArrayArray3[local401][local405][local31].aShort68 = (short) (Static635.aClass226ArrayArrayArray3[local401][local405][local31].aShort68 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static563.aBoolean781 = true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBIII)V")
	public static void method292(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		Static639.anInt10384 = 0;
		Static496.anInt8305 = arg1;
		Static106.anInt2266 = 0;
		Static669.anInt10712 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([IIILclient!su;)Lclient!qn;")
	public static Class292 method293(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class329 arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(14) int[] local14 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg2.aByteArray86 != null) {
			@Pc(24) int local24 = arg2.anInt9032;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(30) int[] local30 = new int[local24];
			@Pc(33) int[] local33 = new int[local24];
			@Pc(36) int[] local36 = new int[local24];
			@Pc(39) int[] local39 = new int[local24];
			@Pc(42) int[] local42 = new int[local24];
			for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
				local27[local44] = Integer.MAX_VALUE;
				local30[local44] = -2147483647;
				local33[local44] = Integer.MAX_VALUE;
				local36[local44] = -2147483647;
				local39[local44] = Integer.MAX_VALUE;
				local42[local44] = -2147483647;
			}
			local16 = new int[local24];
			@Pc(85) int local85;
			@Pc(138) int local138;
			for (@Pc(79) int local79 = 0; local79 < arg1; local79++) {
				local85 = arg0[local79];
				if (arg2.aByteArray86[local85] != -1) {
					@Pc(98) int local98 = arg2.aByteArray86[local85] & 0xFF;
					for (@Pc(100) int local100 = 0; local100 < 3; local100++) {
						@Pc(109) short local109;
						if (local100 == 0) {
							local109 = arg2.aShortArray115[local85];
						} else if (local100 == 1) {
							local109 = arg2.aShortArray116[local85];
						} else {
							local109 = arg2.aShortArray113[local85];
						}
						@Pc(133) int local133 = arg2.anIntArray508[local109];
						local138 = arg2.anIntArray503[local109];
						@Pc(143) int local143 = arg2.anIntArray506[local109];
						if (local133 < local27[local98]) {
							local27[local98] = local133;
						}
						if (local30[local98] < local133) {
							local30[local98] = local133;
						}
						if (local33[local98] > local138) {
							local33[local98] = local138;
						}
						if (local138 > local36[local98]) {
							local36[local98] = local138;
						}
						if (local143 < local39[local98]) {
							local39[local98] = local143;
						}
						if (local42[local98] < local143) {
							local42[local98] = local143;
						}
					}
				}
			}
			local14 = new int[local24];
			local7 = new int[local24];
			local18 = new float[local24][];
			for (local85 = 0; local85 < local24; local85++) {
				@Pc(231) byte local231 = arg2.aByteArray92[local85];
				if (local231 > 0) {
					local7[local85] = (local30[local85] + local27[local85]) / 2;
					local14[local85] = (local36[local85] + local33[local85]) / 2;
					local16[local85] = (local42[local85] + local39[local85]) / 2;
					@Pc(296) float local296;
					@Pc(288) float local288;
					@Pc(304) float local304;
					if (local231 == 1) {
						local138 = arg2.anIntArray504[local85];
						local288 = 64.0F / (float) arg2.anIntArray501[local85];
						if (local138 == 0) {
							local304 = 1.0F;
							local296 = 1.0F;
						} else if (local138 <= 0) {
							local296 = (float) -local138 / 1024.0F;
							local304 = 1.0F;
						} else {
							local296 = 1.0F;
							local304 = (float) local138 / 1024.0F;
						}
					} else if (local231 == 2) {
						local288 = 64.0F / (float) arg2.anIntArray501[local85];
						local304 = 64.0F / (float) arg2.anIntArray505[local85];
						local296 = 64.0F / (float) arg2.anIntArray504[local85];
					} else {
						local288 = (float) arg2.anIntArray501[local85] / 1024.0F;
						local296 = (float) arg2.anIntArray504[local85] / 1024.0F;
						local304 = (float) arg2.anIntArray505[local85] / 1024.0F;
					}
					local18[local85] = Static288.method4657(arg2.aShortArray117[local85], arg2.aByteArray89[local85] & 0xFF, local288, local296, arg2.aShortArray119[local85], arg2.aShortArray111[local85], local304);
				}
			}
		}
		return new Class292(local7, local14, local16, local18);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZIILclient!wm;ILclient!eka;B)V")
	public static void method294(@OriginalArg(1) int arg0, @OriginalArg(3) Class390 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class5_Sub17_Sub1 arg3) {
		Static127.method2322(arg1, arg2, arg0);
		Static439.aClass5_Sub17_Sub1_3 = arg3;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIBIIII)I")
	public static int method295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg1 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(24) int local24 = arg3;
			arg3 = arg0;
			arg0 = local24;
		}
		if (local15 == 0) {
			return arg4;
		} else if (local15 == 1) {
			return arg2;
		} else if (local15 == 2) {
			return 1 + 7 - arg3 - arg4;
		} else {
			return 7 + 1 - arg2 - arg0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V")
	public static void method296(@OriginalArg(1) int arg0) {
		if (-1 != arg0 && Static593.aBooleanArray38[arg0]) {
			Static113.aClass390_22.method8906(arg0);
			Static648.aClass345ArrayArray2[arg0] = null;
			Static212.aClass345ArrayArray1[arg0] = null;
			Static593.aBooleanArray38[arg0] = false;
		}
	}
}
