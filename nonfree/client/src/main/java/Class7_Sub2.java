import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	private int anInt6382;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	private int anInt6383;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "[[Lclient!cr;")
	private Class46[][] aClass46ArrayArray1;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	private int anInt6384;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	private int anInt6385;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	private int anInt6386;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	private int anInt6387;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	private int anInt6388;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
	private int anInt6390;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "[[Lclient!nb;")
	private Class164[][] aClass164ArrayArray1;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
	private int anInt6391;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	private int anInt6392;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
	private int anInt6393;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "[[Lclient!l;")
	private Class140[][] aClass140ArrayArray1;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
	private int anInt6395;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "[[Lclient!mp;")
	private Class159[][] aClass159ArrayArray1;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "Lclient!sq;")
	private final Class155_Sub2 aClass155_Sub2_10;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
	private final int anInt6394;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "[[I")
	public final int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
	private final int anInt6389;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
	private int anInt6396;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "[[B")
	private byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!sq;IIII[[I[[II)V")
	public Class7_Sub2(@OriginalArg(0) Class155_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass155_Sub2_10 = arg0;
		this.anInt6394 = arg2;
		this.anIntArrayArray58 = arg5;
		this.anInt6389 = arg7;
		this.anInt6396 = 0;
		while (arg7 > 1) {
			this.anInt6396++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray25 = new byte[arg3 + 1][arg4 + 1];
		@Pc(47) int local47 = this.aClass155_Sub2_10.anInt5470 >> 9;
		for (@Pc(49) int local49 = 1; local49 < arg4; local49++) {
			for (@Pc(52) int local52 = 1; local52 < arg3; local52++) {
				@Pc(71) int local71 = arg6[local52 + 1][local49] - arg6[local52 - 1][local49];
				@Pc(87) int local87 = arg6[local52][local49 + 1] - arg6[local52][local49 - 1];
				@Pc(100) int local100 = (int) Math.sqrt((double) (local71 * local71 + local87 * local87 + 65536));
				@Pc(106) int local106 = (local71 << 8) / local100;
				@Pc(110) int local110 = -65536 / local100;
				@Pc(116) int local116 = (local87 << 8) / local100;
				@Pc(138) int local138 = local47 + (this.aClass155_Sub2_10.anInt5477 * local106 + this.aClass155_Sub2_10.anInt5486 * local110 + this.aClass155_Sub2_10.anInt5489 * local116 >> 17);
				local138 >>= 0x1;
				if (local138 < 2) {
					local138 = 2;
				} else if (local138 > 126) {
					local138 = 126;
				}
				this.aByteArrayArray25[local52][local49] = (byte) local138;
			}
		}
		this.aByteArrayArray24 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII[[ZLclient!qh;[I[I)V")
	private void method5653(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class193 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean376 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass159ArrayArray1[local22][local25] != null) {
						@Pc(50) Class159 local50 = this.aClass159ArrayArray1[local22][local25];
						if (local50.aShort54 != -1 && (local50.aByte50 & 0x2) == 0 && local50.anInt3972 == 0) {
							local68 = this.aClass155_Sub2_10.method4965(local50.aShort54);
							arg5.method4416(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static127.method2044(local68, local50.anInt3976), Static127.method2044(local68, local50.anInt3975), Static127.method2044(local68, local50.anInt3974));
							arg5.method4416(local20, local20, local20 - 4, local16, local16 + 4, local16, Static127.method2044(local68, local50.anInt3973), Static127.method2044(local68, local50.anInt3974), Static127.method2044(local68, local50.anInt3975));
						} else if (local50.anInt3972 == 0) {
							arg5.method4424(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt3976, local50.anInt3975, local50.anInt3974);
							arg5.method4424(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt3973, local50.anInt3974, local50.anInt3975);
						} else {
							local68 = local50.anInt3972;
							arg5.method4424(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static2.method56(local68, local50.anInt3976 & 0xFF000000), Static2.method56(local68, local50.anInt3975 & 0xFF000000), Static2.method56(local68, local50.anInt3974 & 0xFF000000));
							arg5.method4424(local20, local20, local20 - 4, local16, local16 + 4, local16, Static2.method56(local68, local50.anInt3973 & 0xFF000000), Static2.method56(local68, local50.anInt3974 & 0xFF000000), Static2.method56(local68, local50.anInt3975 & 0xFF000000));
						}
					} else if (this.aClass164ArrayArray1[local22][local25] != null) {
						@Pc(259) Class164 local259 = this.aClass164ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort58; local68++) {
							arg6[local68] = local16 + (local259.aShortArray71[local68] - local22 * this.anInt6389) * 4 / this.anInt6389;
							arg7[local68] = local20 - (local259.aShortArray73[local68] - local25 * this.anInt6389) * 4 / this.anInt6389;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort57; local307++) {
							@Pc(312) int local312 = local307 * 3;
							@Pc(316) int local316 = local312 + 1;
							@Pc(320) int local320 = local316 + 1;
							@Pc(324) int local324 = arg6[local312];
							@Pc(328) int local328 = arg6[local316];
							@Pc(332) int local332 = arg6[local320];
							@Pc(336) int local336 = arg7[local312];
							@Pc(340) int local340 = arg7[local316];
							@Pc(344) int local344 = arg7[local320];
							@Pc(369) int local369;
							if (local259.anIntArray434 != null && local259.anIntArray434[local307] != 0 && (local259.aShortArray70 == null || local259.aShortArray70 != null && local259.aShortArray70[local307] == -1)) {
								local369 = local259.anIntArray434[local307];
								arg5.method4424(local336, local340, local344, local324, local328, local332, Static2.method56(local369, -(local259.anIntArray435[local312] & -16777216) - 16777216), Static2.method56(local369, -(local259.anIntArray435[local316] & -16777216) - 16777216), Static2.method56(local369, -(local259.anIntArray435[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray70 == null || local259.aShortArray70[local307] == -1) {
								arg5.method4424(local336, local340, local344, local324, local328, local332, local259.anIntArray435[local312], local259.anIntArray435[local316], local259.anIntArray435[local320]);
							} else {
								local369 = this.aClass155_Sub2_10.method4965(local259.aShortArray70[local307]);
								arg5.method4416(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean376 = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!qh;[I[I[I)V")
	private void method5655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class193 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class140 local6 = this.aClass140ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(181) int local181;
		@Pc(237) int local237;
		@Pc(293) int local293;
		@Pc(349) int local349;
		@Pc(209) int local209;
		@Pc(170) int local170;
		@Pc(226) int local226;
		@Pc(282) int local282;
		@Pc(338) int local338;
		@Pc(198) int local198;
		@Pc(254) int local254;
		@Pc(310) int local310;
		@Pc(366) int local366;
		@Pc(68) int local68;
		@Pc(91) int local91;
		@Pc(114) int local114;
		@Pc(137) int local137;
		@Pc(46) int local46;
		@Pc(265) int local265;
		@Pc(321) int local321;
		@Pc(377) int local377;
		if (local6 == null) {
			@Pc(996) Class46 local996 = this.aClass46ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort14; local349++) {
					local24 = local996.anIntArray97[local349];
					local29 = local996.anIntArray96[local349];
					local34 = local996.anIntArray98[local349];
					local293 = this.anInt6387 + (this.anInt6390 * local24 + this.anInt6386 * local29 + this.anInt6383 * local34 >> 15);
					if (local293 <= this.aClass155_Sub2_10.anInt5472) {
						return;
					}
					local181 = this.anInt6392 + (this.anInt6388 * local24 + this.anInt6382 * local29 + this.anInt6391 * local34 >> 15);
					local237 = this.anInt6384 + (this.anInt6395 * local24 + this.anInt6385 * local29 + this.anInt6393 * local34 >> 15);
					arg3[local349] = arg2.anInt4906 + local181 * this.aClass155_Sub2_10.anInt5480 / local293;
					arg4[local349] = arg2.anInt4909 + local237 * this.aClass155_Sub2_10.anInt5490 / local293;
				}
				if (local996.aShortArray24 != null) {
					local209 = this.anIntArrayArray58[arg0][arg1];
					local265 = this.anIntArrayArray58[arg0 + 1][arg1];
					local321 = this.anIntArrayArray58[arg0][arg1 + 1];
					local377 = arg0 * this.anInt6389;
					local170 = local377 + this.anInt6389;
					local226 = arg1 * this.anInt6389;
					local282 = local226 + this.anInt6389;
					local338 = this.anInt6392 + (this.anInt6388 * local377 + this.anInt6382 * local209 + this.anInt6391 * local226 >> 15);
					local198 = this.anInt6384 + (this.anInt6395 * local377 + this.anInt6385 * local209 + this.anInt6393 * local226 >> 15);
					local254 = this.anInt6387 + (this.anInt6390 * local377 + this.anInt6386 * local209 + this.anInt6383 * local226 >> 15);
					local310 = this.anInt6392 + (this.anInt6388 * local170 + this.anInt6382 * local265 + this.anInt6391 * local226 >> 15);
					local366 = this.anInt6384 + (this.anInt6395 * local170 + this.anInt6385 * local265 + this.anInt6393 * local226 >> 15);
					local68 = this.anInt6387 + (this.anInt6390 * local170 + this.anInt6386 * local265 + this.anInt6383 * local226 >> 15);
					local91 = this.anInt6392 + (this.anInt6388 * local377 + this.anInt6382 * local321 + this.anInt6391 * local282 >> 15);
					local114 = this.anInt6384 + (this.anInt6395 * local377 + this.anInt6385 * local321 + this.anInt6393 * local282 >> 15);
					local137 = this.anInt6387 + (this.anInt6390 * local377 + this.anInt6386 * local321 + this.anInt6383 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort15; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray19[local46];
						@Pc(1354) short local1354 = local996.aShortArray22[local46];
						@Pc(1359) short local1359 = local996.aShortArray20[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean378 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt4908 || local1367 > arg2.anInt4908 || local1371 > arg2.anInt4908;
							@Pc(1427) short local1427 = local996.aShortArray24[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray94[local46];
								if (local1482 != -1) {
									arg2.method4416(local1375, local1379, local1383, local1363, local1367, local1371, Static127.method2044(local1482, local996.aShortArray23[local1349]), Static127.method2044(local1482, local996.aShortArray23[local1354]), Static127.method2044(local1482, local996.aShortArray23[local1359]));
								}
							} else {
								if (this.method5656(this.aClass155_Sub2_10.anInterface10_7.method192(local1427).aByte40)) {
									arg2.anInt4910 = 100;
								}
								arg2.method4418(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray23[local1349], local996.aShortArray23[local1354], local996.aShortArray23[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt4910 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort15; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray19[local209];
					@Pc(1533) short local1533 = local996.aShortArray22[local209];
					@Pc(1538) short local1538 = local996.aShortArray20[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray94[local209];
						if (local310 != -1) {
							arg2.aBoolean378 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt4908 || local226 > arg2.anInt4908 || local282 > arg2.anInt4908;
							arg2.method4416(local338, local198, local254, local170, local226, local282, Static127.method2044(local310, local996.aShortArray23[local1528]), Static127.method2044(local310, local996.aShortArray23[local1533]), Static127.method2044(local310, local996.aShortArray23[local1538]));
						}
					}
				}
			}
		} else if ((local6.aByte48 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt6389;
			local24 = local19 + this.anInt6389;
			local29 = arg1 * this.anInt6389;
			local34 = local29 + this.anInt6389;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte48 & 0x1) == 0) {
				local46 = this.anIntArrayArray58[arg0][arg1];
				local51 = this.anIntArrayArray58[arg0 + 1][arg1];
				local148 = this.anIntArrayArray58[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray58[arg0][arg1 + 1];
				local68 = this.anInt6387 + (this.anInt6390 * local19 + this.anInt6386 * local46 + this.anInt6383 * local29 >> 15);
				if (local68 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local91 = this.anInt6387 + (this.anInt6390 * local24 + this.anInt6386 * local51 + this.anInt6383 * local29 >> 15);
				if (local91 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local114 = this.anInt6387 + (this.anInt6390 * local24 + this.anInt6386 * local148 + this.anInt6383 * local34 >> 15);
				if (local114 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local137 = this.anInt6387 + (this.anInt6390 * local19 + this.anInt6386 * local153 + this.anInt6383 * local34 >> 15);
				if (local137 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local170 = this.anInt6392 + (this.anInt6388 * local19 + this.anInt6382 * local46 + this.anInt6391 * local29 >> 15);
				local181 = arg2.anInt4906 + local170 * this.aClass155_Sub2_10.anInt5480 / local68;
				local198 = this.anInt6384 + (this.anInt6395 * local19 + this.anInt6385 * local46 + this.anInt6393 * local29 >> 15);
				local209 = arg2.anInt4909 + local198 * this.aClass155_Sub2_10.anInt5490 / local68;
				local226 = this.anInt6392 + (this.anInt6388 * local24 + this.anInt6382 * local51 + this.anInt6391 * local29 >> 15);
				local237 = arg2.anInt4906 + local226 * this.aClass155_Sub2_10.anInt5480 / local91;
				local254 = this.anInt6384 + (this.anInt6395 * local24 + this.anInt6385 * local51 + this.anInt6393 * local29 >> 15);
				local265 = arg2.anInt4909 + local254 * this.aClass155_Sub2_10.anInt5490 / local91;
				local282 = this.anInt6392 + (this.anInt6388 * local24 + this.anInt6382 * local148 + this.anInt6391 * local34 >> 15);
				local293 = arg2.anInt4906 + local282 * this.aClass155_Sub2_10.anInt5480 / local114;
				local310 = this.anInt6384 + (this.anInt6395 * local24 + this.anInt6385 * local148 + this.anInt6393 * local34 >> 15);
				local321 = arg2.anInt4909 + local310 * this.aClass155_Sub2_10.anInt5490 / local114;
				local338 = this.anInt6392 + (this.anInt6388 * local19 + this.anInt6382 * local153 + this.anInt6391 * local34 >> 15);
				local349 = arg2.anInt4906 + local338 * this.aClass155_Sub2_10.anInt5480 / local137;
				local366 = this.anInt6384 + (this.anInt6395 * local19 + this.anInt6385 * local153 + this.anInt6393 * local34 >> 15);
				local377 = arg2.anInt4909 + local366 * this.aClass155_Sub2_10.anInt5490 / local137;
			} else {
				local46 = this.anIntArrayArray58[arg0][arg1];
				local51 = this.anInt6386 * local46;
				local68 = this.anInt6387 + (this.anInt6390 * local19 + local51 + this.anInt6383 * local29 >> 15);
				if (local68 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local91 = this.anInt6387 + (this.anInt6390 * local24 + local51 + this.anInt6383 * local29 >> 15);
				if (local91 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local114 = this.anInt6387 + (this.anInt6390 * local24 + local51 + this.anInt6383 * local34 >> 15);
				if (local114 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local137 = this.anInt6387 + (this.anInt6390 * local19 + local51 + this.anInt6383 * local34 >> 15);
				if (local137 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local148 = this.anInt6382 * local46;
				local153 = this.anInt6385 * local46;
				local170 = this.anInt6392 + (this.anInt6388 * local19 + local148 + this.anInt6391 * local29 >> 15);
				local181 = arg2.anInt4906 + local170 * this.aClass155_Sub2_10.anInt5480 / local68;
				local198 = this.anInt6384 + (this.anInt6395 * local19 + local153 + this.anInt6393 * local29 >> 15);
				local209 = arg2.anInt4909 + local198 * this.aClass155_Sub2_10.anInt5490 / local68;
				local226 = this.anInt6392 + (this.anInt6388 * local24 + local148 + this.anInt6391 * local29 >> 15);
				local237 = arg2.anInt4906 + local226 * this.aClass155_Sub2_10.anInt5480 / local91;
				local254 = this.anInt6384 + (this.anInt6395 * local24 + local153 + this.anInt6393 * local29 >> 15);
				local265 = arg2.anInt4909 + local254 * this.aClass155_Sub2_10.anInt5490 / local91;
				local282 = this.anInt6392 + (this.anInt6388 * local24 + local148 + this.anInt6391 * local34 >> 15);
				local293 = arg2.anInt4906 + local282 * this.aClass155_Sub2_10.anInt5480 / local114;
				local310 = this.anInt6384 + (this.anInt6395 * local24 + local153 + this.anInt6393 * local34 >> 15);
				local321 = arg2.anInt4909 + local310 * this.aClass155_Sub2_10.anInt5490 / local114;
				local338 = this.anInt6392 + (this.anInt6388 * local19 + local148 + this.anInt6391 * local34 >> 15);
				local349 = arg2.anInt4906 + local338 * this.aClass155_Sub2_10.anInt5480 / local137;
				local366 = this.anInt6384 + (this.anInt6395 * local19 + local153 + this.anInt6393 * local34 >> 15);
				local377 = arg2.anInt4909 + local366 * this.aClass155_Sub2_10.anInt5490 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean378 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt4908 || local349 > arg2.anInt4908 || local237 > arg2.anInt4908;
				if (local6.aShort46 >= 0) {
					if (this.method5656(this.aClass155_Sub2_10.anInterface10_7.method192(local6.aShort46).aByte40)) {
						arg2.anInt4910 = 100;
					}
					arg2.method4418(local321, local377, local265, local293, local349, local237, local6.aShort47 & 0xFFFF, local6.aShort49 & 0xFFFF, local6.aShort45 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort46);
					arg2.anInt4910 = 0;
				} else {
					arg2.method4416(local321, local377, local265, local293, local349, local237, local6.aShort47 & 0xFFFF, local6.aShort49 & 0xFFFF, local6.aShort45 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean378 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt4908 || local237 > arg2.anInt4908 || local349 > arg2.anInt4908;
				if (local6.aShort46 >= 0) {
					if (this.method5656(this.aClass155_Sub2_10.anInterface10_7.method192(local6.aShort46).aByte40)) {
						arg2.anInt4910 = 100;
					}
					arg2.method4418(local209, local265, local377, local181, local237, local349, local6.aShort48 & 0xFFFF, local6.aShort45 & 0xFFFF, local6.aShort49 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort46);
					arg2.anInt4910 = 0;
					return;
				}
				arg2.method4416(local209, local265, local377, local181, local237, local349, local6.aShort48 & 0xFFFF, local6.aShort45 & 0xFFFF, local6.aShort49 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass159ArrayArray1 == null) {
			this.aClass159ArrayArray1 = new Class159[super.anInt6380][super.anInt6381];
			this.aClass164ArrayArray1 = new Class164[super.anInt6380][super.anInt6381];
		} else if (this.aClass140ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static206.anIntArray393[Static378.method5608(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static206.anIntArray393[Static378.method5608(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg6[local104] != arg6[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == this.anInt6389 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt6389 && arg4[local116] == this.anInt6389) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt6389) {
					if (local110 != -1 && arg6[local110] != arg6[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt6389 && arg2[local244] != arg2[0] - this.anInt6389) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt6389 && arg4[local244] != arg4[0] - this.anInt6389) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(527) int local527;
		if (local102) {
			@Pc(334) Class159 local334 = new Class159();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt3972 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte50 = (byte) (local334.aByte50 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0 + 1][arg1] && this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0 + 1][arg1 + 1] && this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0][arg1 + 1]) {
				local334.aByte50 = (byte) (local334.aByte50 | 0x1);
			}
			if (local342 == -1 || (local334.aByte50 & 0x2) != 0 || this.aClass155_Sub2_10.anInterface10_7.method192(local342).aBoolean223) {
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local104] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt3973 = Static279.method5259(Static408.method5654(arg6[local104] >> 8, this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]), local527, arg10);
				if (local334.anInt3972 != 0) {
					local334.anInt3973 |= this.aByteArrayArray24[arg0][arg1] + 255 - this.aByteArrayArray25[arg0][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local106] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt3974 = Static279.method5259(Static408.method5654(arg6[local106] >> 8, this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1]), local527, arg10);
				if (local334.anInt3972 != 0) {
					local334.anInt3974 |= this.aByteArrayArray24[arg0 + 1][arg1] + 255 - this.aByteArrayArray25[arg0 + 1][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local108] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt3976 = Static279.method5259(Static408.method5654(arg6[local108] >> 8, this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1]), local527, arg10);
				if (local334.anInt3972 != 0) {
					local334.anInt3976 |= this.aByteArrayArray24[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray25[arg0 + 1][arg1 + 1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local110] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt3975 = Static279.method5259(Static408.method5654(arg6[local110] >> 8, this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1]), local527, arg10);
				if (local334.anInt3972 != 0) {
					local334.anInt3975 |= this.aByteArrayArray24[arg0][arg1 + 1] + 255 - this.aByteArrayArray25[arg0][arg1 + 1] << 25;
				}
				local334.aShort54 = -1;
			} else {
				local334.anInt3973 = this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1];
				local334.anInt3974 = this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1];
				local334.anInt3976 = this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1];
				local334.anInt3975 = this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1];
				local334.aShort54 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort55 = (short) arg5[local108];
				local334.aShort51 = (short) arg5[local110];
				local334.aShort52 = (short) arg5[local106];
				local334.aShort53 = (short) arg5[local104];
			}
			this.aClass159ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class164 local888 = new Class164();
		local888.aShort58 = (short) arg2.length;
		local888.aShort57 = (short) (arg2.length / 3);
		local888.aShortArray71 = new short[local888.aShort58];
		local888.aShortArray75 = new short[local888.aShort58];
		local888.aShortArray73 = new short[local888.aShort58];
		local888.anIntArray435 = new int[local888.aShort58];
		if (arg5 != null) {
			local888.aShortArray74 = new short[local888.aShort58];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort58; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1];
			} else if (local342 == 0 && local527 == this.anInt6389) {
				local958 = this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1];
			} else if (local342 == this.anInt6389 && local527 == this.anInt6389) {
				local958 = this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt6389 && local527 == 0) {
				local958 = this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]) * (this.anInt6389 - local342) + (this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1]) * (this.anInt6389 - local342) + (this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (this.anInt6389 - local527) + local1126 * local527 >> this.anInt6396 * 2;
			}
			@Pc(1150) short local1150 = (short) ((arg0 << this.anInt6396) + local342);
			@Pc(1158) short local1158 = (short) ((arg1 << this.anInt6396) + local527);
			local888.aShortArray71[local244] = local1150;
			local888.aShortArray73[local244] = local1158;
			local888.aShortArray75[local244] = (short) (this.method5638(local1150, local1158) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass155_Sub2_10.anInterface10_7.method192(arg8[local244]).aBoolean223) {
				local888.anIntArray435[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray74[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray435[local244] = Static279.method5259(Static408.method5654(arg6[local244] >> 8, local958), local1226, arg10);
				if (arg7 != null) {
					local888.anIntArray435[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray435[local244] = 0;
			} else {
				local888.anIntArray435[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort57; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass155_Sub2_10.anInterface10_7.method192(arg8[local527 * 3]).aBoolean223) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray434 = new int[local888.aShort57];
		}
		if (local1296) {
			local888.aShortArray70 = new short[local888.aShort57];
			local888.aShortArray72 = new short[local888.aShort57];
		}
		for (local958 = 0; local958 < local888.aShort57; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray434[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass155_Sub2_10.anInterface10_7.method192(local1384).aBoolean223) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass155_Sub2_10.anInterface10_7.method192(local1384).aBoolean223) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass155_Sub2_10.anInterface10_7.method192(local1384).aBoolean223) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray70[local958] = (short) local1384;
					local888.aShortArray72[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass155_Sub2_10.anInterface10_7.method192(local1384).aBoolean223) {
							local888.anIntArray435[local1079] = Static206.anIntArray393[Static378.method5608(this.aClass155_Sub2_10.anInterface10_7.method192(local1384).aShort32 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass155_Sub2_10.anInterface10_7.method192(local1384).aBoolean223) {
							local888.anIntArray435[local1126] = Static206.anIntArray393[Static378.method5608(this.aClass155_Sub2_10.anInterface10_7.method192(local1384).aShort32 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass155_Sub2_10.anInterface10_7.method192(local1384).aBoolean223) {
							local888.anIntArray435[local1226] = Static206.anIntArray393[Static378.method5608(this.aClass155_Sub2_10.anInterface10_7.method192(local1384).aShort32 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray70[local958] = -1;
				}
			}
		}
		this.aClass164ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Z")
	private boolean method5656(@OriginalArg(0) int arg0) {
		if ((this.anInt6394 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZLclient!qh;[I[I[I)V")
	private void method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class193 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class159 local6 = this.aClass159ArrayArray1[arg0][arg1];
		@Pc(29) int local29;
		@Pc(255) int local255;
		@Pc(311) int local311;
		@Pc(367) int local367;
		@Pc(423) int local423;
		@Pc(283) int local283;
		@Pc(339) int local339;
		@Pc(395) int local395;
		@Pc(451) int local451;
		@Pc(244) int local244;
		@Pc(300) int local300;
		@Pc(356) int local356;
		@Pc(412) int local412;
		@Pc(272) int local272;
		@Pc(328) int local328;
		@Pc(384) int local384;
		@Pc(440) int local440;
		@Pc(78) int local78;
		@Pc(101) int local101;
		@Pc(124) int local124;
		@Pc(147) int local147;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(163) int local163;
		@Pc(56) int local56;
		@Pc(61) int local61;
		@Pc(222) int local222;
		@Pc(227) int local227;
		@Pc(616) int local616;
		if (local6 == null) {
			@Pc(1426) Class164 local1426 = this.aClass164ArrayArray1[arg0][arg1];
			if (local1426 != null) {
				for (local423 = 0; local423 < local1426.aShort58; local423++) {
					@Pc(1436) short local1436 = local1426.aShortArray71[local423];
					local29 = local1426.aShortArray75[local423];
					@Pc(1446) short local1446 = local1426.aShortArray73[local423];
					local367 = this.anInt6387 + (this.anInt6390 * local1436 + this.anInt6386 * local29 + this.anInt6383 * local1446 >> 15);
					if (local367 <= this.aClass155_Sub2_10.anInt5472) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass155_Sub2_10.anInt5491;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1426.aShortArray74[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass155_Sub2_10.aBoolean424) {
						local283 = local367 - this.aClass155_Sub2_10.anInt5491;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt6392 + (this.anInt6388 * local1436 + this.anInt6382 * local29 + this.anInt6391 * local1446 >> 15);
					local311 = this.anInt6384 + (this.anInt6395 * local1436 + this.anInt6385 * local29 + this.anInt6393 * local1446 >> 15);
					arg4[local423] = arg3.anInt4906 + local255 * this.aClass155_Sub2_10.anInt5480 / local367;
					arg5[local423] = arg3.anInt4909 + local311 * this.aClass155_Sub2_10.anInt5490 / local367;
				}
				if (local1426.aShortArray70 != null) {
					local283 = this.anIntArrayArray58[arg0][arg1];
					local339 = this.anIntArrayArray58[arg0 + 1][arg1];
					local395 = this.anIntArrayArray58[arg0][arg1 + 1];
					local451 = arg0 * this.anInt6389;
					local244 = local451 + this.anInt6389;
					local300 = arg1 * this.anInt6389;
					local356 = local300 + this.anInt6389;
					local412 = this.anInt6392 + (this.anInt6388 * local451 + this.anInt6382 * local283 + this.anInt6391 * local300 >> 15);
					local272 = this.anInt6384 + (this.anInt6395 * local451 + this.anInt6385 * local283 + this.anInt6393 * local300 >> 15);
					local328 = this.anInt6387 + (this.anInt6390 * local451 + this.anInt6386 * local283 + this.anInt6383 * local300 >> 15);
					local384 = this.anInt6392 + (this.anInt6388 * local244 + this.anInt6382 * local339 + this.anInt6391 * local300 >> 15);
					local440 = this.anInt6384 + (this.anInt6395 * local244 + this.anInt6385 * local339 + this.anInt6393 * local300 >> 15);
					local78 = this.anInt6387 + (this.anInt6390 * local244 + this.anInt6386 * local339 + this.anInt6383 * local300 >> 15);
					local101 = this.anInt6392 + (this.anInt6388 * local451 + this.anInt6382 * local395 + this.anInt6391 * local356 >> 15);
					local124 = this.anInt6384 + (this.anInt6395 * local451 + this.anInt6385 * local395 + this.anInt6393 * local356 >> 15);
					local147 = this.anInt6387 + (this.anInt6390 * local451 + this.anInt6386 * local395 + this.anInt6383 * local356 >> 15);
					for (local36 = 0; local36 < local1426.aShort57; local36++) {
						local38 = local36 * 3;
						local40 = local38 + 1;
						local42 = local40 + 1;
						local163 = arg4[local38];
						local56 = arg4[local40];
						local61 = arg4[local42];
						local222 = arg5[local38];
						local227 = arg5[local40];
						local616 = arg5[local42];
						@Pc(1886) int local1886 = arg6[local38] + arg6[local40] + arg6[local42];
						if ((local163 - local56) * (local616 - local227) - (local222 - local227) * (local61 - local56) > 0) {
							arg3.aBoolean378 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt4908 || local56 > arg3.anInt4908 || local61 > arg3.anInt4908;
							@Pc(1930) short local1930 = local1426.aShortArray70[local36];
							if (local1886 < 765) {
								if (local1930 != -1 && this.method5656(this.aClass155_Sub2_10.anInterface10_7.method192(local1930).aByte40)) {
									arg3.anInt4910 = 100;
								}
								if (local1886 > 0) {
									if (local1930 != -1) {
										arg3.method4422(local222, local227, local616, local163, local56, local61, this.aClass155_Sub2_10.anInt5479, arg6[local38], arg6[local40], arg6[local42], local1426.anIntArray435[local38], local1426.anIntArray435[local40], local1426.anIntArray435[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1930);
									} else if ((local1426.anIntArray435[local38] & 0xFFFFFF) != 0) {
										arg3.method4424(local222, local227, local616, local163, local56, local61, Static2.method56(local1426.anIntArray435[local38], arg6[local38] << 24 | this.aClass155_Sub2_10.anInt5479), Static2.method56(local1426.anIntArray435[local40], arg6[local40] << 24 | this.aClass155_Sub2_10.anInt5479), Static2.method56(local1426.anIntArray435[local42], arg6[local42] << 24 | this.aClass155_Sub2_10.anInt5479));
									}
								} else if (local1930 != -1) {
									arg3.method4418(local222, local227, local616, local163, local56, local61, local1426.anIntArray435[local38], local1426.anIntArray435[local40], local1426.anIntArray435[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1930);
								} else if ((local1426.anIntArray435[local38] & 0xFFFFFF) != 0) {
									arg3.method4424(local222, local227, local616, local163, local56, local61, local1426.anIntArray435[local38], local1426.anIntArray435[local40], local1426.anIntArray435[local42]);
								}
								arg3.anInt4910 = 0;
							} else {
								arg3.method4423(local222, local227, local616, local163, local56, local61, this.aClass155_Sub2_10.anInt5479);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1426.aShort57; local283++) {
					local339 = local283 * 3;
					local395 = local339 + 1;
					local451 = local395 + 1;
					local244 = arg4[local339];
					local300 = arg4[local395];
					local356 = arg4[local451];
					local412 = arg5[local339];
					local272 = arg5[local395];
					local328 = arg5[local451];
					local384 = arg6[local339] + arg6[local395] + arg6[local451];
					if ((local244 - local300) * (local328 - local272) - (local412 - local272) * (local356 - local300) > 0) {
						arg3.aBoolean378 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt4908 || local300 > arg3.anInt4908 || local356 > arg3.anInt4908;
						if (local384 >= 765) {
							arg3.method4423(local412, local272, local328, local244, local300, local356, this.aClass155_Sub2_10.anInt5479);
						} else if (local384 > 0) {
							if ((local1426.anIntArray435[local339] & 0xFFFFFF) != 0) {
								arg3.method4424(local412, local272, local328, local244, local300, local356, Static279.method5259(local1426.anIntArray435[local339], arg6[local339], this.aClass155_Sub2_10.anInt5479), Static279.method5259(local1426.anIntArray435[local395], arg6[local395], this.aClass155_Sub2_10.anInt5479), Static279.method5259(local1426.anIntArray435[local451], arg6[local451], this.aClass155_Sub2_10.anInt5479));
							}
						} else if ((local1426.anIntArray435[local339] & 0xFFFFFF) != 0) {
							arg3.method4424(local412, local272, local328, local244, local300, local356, local1426.anIntArray435[local339], local1426.anIntArray435[local395], local1426.anIntArray435[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte50 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt6389;
			@Pc(24) int local24 = local19 + this.anInt6389;
			local29 = arg1 * this.anInt6389;
			@Pc(34) int local34 = local29 + this.anInt6389;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte50 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray58[arg0][arg1];
				local61 = this.anIntArrayArray58[arg0 + 1][arg1];
				local222 = this.anIntArrayArray58[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray58[arg0][arg1 + 1];
				local78 = this.anInt6387 + (this.anInt6390 * local19 + this.anInt6386 * local56 + this.anInt6383 * local29 >> 15);
				if (local78 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local101 = this.anInt6387 + (this.anInt6390 * local24 + this.anInt6386 * local61 + this.anInt6383 * local29 >> 15);
				if (local101 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local124 = this.anInt6387 + (this.anInt6390 * local24 + this.anInt6386 * local222 + this.anInt6383 * local34 >> 15);
				if (local124 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local147 = this.anInt6387 + (this.anInt6390 * local19 + this.anInt6386 * local227 + this.anInt6383 * local34 >> 15);
				if (local147 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local616 = local6.aShort53 * local163 / 255;
						if (local616 > 0) {
							local56 -= local616;
						}
					}
					local163 = local101 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local616 = local6.aShort52 * local163 / 255;
						if (local616 > 0) {
							local61 -= local616;
						}
					}
					local163 = local124 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local616 = local6.aShort55 * local163 / 255;
						if (local616 > 0) {
							local222 -= local616;
						}
					}
					local163 = local147 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local616 = local6.aShort51 * local163 / 255;
						if (local616 > 0) {
							local227 -= local616;
						}
					}
				} else if (this.aClass155_Sub2_10.aBoolean424) {
					local163 = local78 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt6392 + (this.anInt6388 * local19 + this.anInt6382 * local56 + this.anInt6391 * local29 >> 15);
				local255 = arg3.anInt4906 + local244 * this.aClass155_Sub2_10.anInt5480 / local78;
				local272 = this.anInt6384 + (this.anInt6395 * local19 + this.anInt6385 * local56 + this.anInt6393 * local29 >> 15);
				local283 = arg3.anInt4909 + local272 * this.aClass155_Sub2_10.anInt5490 / local78;
				local300 = this.anInt6392 + (this.anInt6388 * local24 + this.anInt6382 * local61 + this.anInt6391 * local29 >> 15);
				local311 = arg3.anInt4906 + local300 * this.aClass155_Sub2_10.anInt5480 / local101;
				local328 = this.anInt6384 + (this.anInt6395 * local24 + this.anInt6385 * local61 + this.anInt6393 * local29 >> 15);
				local339 = arg3.anInt4909 + local328 * this.aClass155_Sub2_10.anInt5490 / local101;
				local356 = this.anInt6392 + (this.anInt6388 * local24 + this.anInt6382 * local222 + this.anInt6391 * local34 >> 15);
				local367 = arg3.anInt4906 + local356 * this.aClass155_Sub2_10.anInt5480 / local124;
				local384 = this.anInt6384 + (this.anInt6395 * local24 + this.anInt6385 * local222 + this.anInt6393 * local34 >> 15);
				local395 = arg3.anInt4909 + local384 * this.aClass155_Sub2_10.anInt5490 / local124;
				local412 = this.anInt6392 + (this.anInt6388 * local19 + this.anInt6382 * local227 + this.anInt6391 * local34 >> 15);
				local423 = arg3.anInt4906 + local412 * this.aClass155_Sub2_10.anInt5480 / local147;
				local440 = this.anInt6384 + (this.anInt6395 * local19 + this.anInt6385 * local227 + this.anInt6393 * local34 >> 15);
				local451 = arg3.anInt4909 + local440 * this.aClass155_Sub2_10.anInt5490 / local147;
			} else {
				local56 = this.anIntArrayArray58[arg0][arg1];
				local61 = this.anInt6386 * local56;
				local78 = this.anInt6387 + (this.anInt6390 * local19 + local61 + this.anInt6383 * local29 >> 15);
				if (local78 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local101 = this.anInt6387 + (this.anInt6390 * local24 + local61 + this.anInt6383 * local29 >> 15);
				if (local101 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local124 = this.anInt6387 + (this.anInt6390 * local24 + local61 + this.anInt6383 * local34 >> 15);
				if (local124 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				local147 = this.anInt6387 + (this.anInt6390 * local19 + local61 + this.anInt6383 * local34 >> 15);
				if (local147 <= this.aClass155_Sub2_10.anInt5472) {
					return;
				}
				if (this.aClass155_Sub2_10.aBoolean424) {
					local163 = local78 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass155_Sub2_10.anInt5491;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt6382 * local56;
				local227 = this.anInt6385 * local56;
				local244 = this.anInt6392 + (this.anInt6388 * local19 + local222 + this.anInt6391 * local29 >> 15);
				local255 = arg3.anInt4906 + local244 * this.aClass155_Sub2_10.anInt5480 / local78;
				local272 = this.anInt6384 + (this.anInt6395 * local19 + local227 + this.anInt6393 * local29 >> 15);
				local283 = arg3.anInt4909 + local272 * this.aClass155_Sub2_10.anInt5490 / local78;
				local300 = this.anInt6392 + (this.anInt6388 * local24 + local222 + this.anInt6391 * local29 >> 15);
				local311 = arg3.anInt4906 + local300 * this.aClass155_Sub2_10.anInt5480 / local101;
				local328 = this.anInt6384 + (this.anInt6395 * local24 + local227 + this.anInt6393 * local29 >> 15);
				local339 = arg3.anInt4909 + local328 * this.aClass155_Sub2_10.anInt5490 / local101;
				local356 = this.anInt6392 + (this.anInt6388 * local24 + local222 + this.anInt6391 * local34 >> 15);
				local367 = arg3.anInt4906 + local356 * this.aClass155_Sub2_10.anInt5480 / local124;
				local384 = this.anInt6384 + (this.anInt6395 * local24 + local227 + this.anInt6393 * local34 >> 15);
				local395 = arg3.anInt4909 + local384 * this.aClass155_Sub2_10.anInt5490 / local124;
				local412 = this.anInt6392 + (this.anInt6388 * local19 + local222 + this.anInt6391 * local34 >> 15);
				local423 = arg3.anInt4906 + local412 * this.aClass155_Sub2_10.anInt5480 / local147;
				local440 = this.anInt6384 + (this.anInt6395 * local19 + local227 + this.anInt6393 * local34 >> 15);
				local451 = arg3.anInt4909 + local440 * this.aClass155_Sub2_10.anInt5490 / local147;
			}
			@Pc(1038) boolean local1038 = local6.aShort54 != -1 && this.method5656(this.aClass155_Sub2_10.anInterface10_7.method192(local6.aShort54).aByte40);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean378 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt4908 || local423 > arg3.anInt4908 || local311 > arg3.anInt4908;
				if (local61 < 765) {
					if (local1038) {
						arg3.anInt4910 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort54 >= 0) {
							arg3.method4422(local395, local451, local339, local367, local423, local311, this.aClass155_Sub2_10.anInt5479, local40, local42, local38, local6.anInt3976, local6.anInt3975, local6.anInt3974, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort54);
						} else {
							arg3.method4424(local395, local451, local339, local367, local423, local311, Static2.method56(local6.anInt3976, local40 << 24 | this.aClass155_Sub2_10.anInt5479), Static2.method56(local6.anInt3975, local42 << 24 | this.aClass155_Sub2_10.anInt5479), Static2.method56(local6.anInt3974, local38 << 24 | this.aClass155_Sub2_10.anInt5479));
						}
					} else if (local6.aShort54 >= 0) {
						arg3.method4418(local395, local451, local339, local367, local423, local311, local6.anInt3976, local6.anInt3975, local6.anInt3974, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort54);
					} else {
						arg3.method4424(local395, local451, local339, local367, local423, local311, local6.anInt3976, local6.anInt3975, local6.anInt3974);
					}
					arg3.anInt4910 = 0;
				} else {
					arg3.method4423(local395, local451, local339, local367, local423, local311, this.aClass155_Sub2_10.anInt5479);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean378 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt4908 || local311 > arg3.anInt4908 || local423 > arg3.anInt4908;
				if (local61 < 765) {
					if (local1038) {
						arg3.anInt4910 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort54 >= 0) {
							arg3.method4422(local283, local339, local451, local255, local311, local423, this.aClass155_Sub2_10.anInt5479, local36, local38, local42, local6.anInt3973, local6.anInt3974, local6.anInt3975, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort54);
						} else {
							arg3.method4424(local283, local339, local451, local255, local311, local423, Static2.method56(local6.anInt3973, local36 << 24 | this.aClass155_Sub2_10.anInt5479), Static2.method56(local6.anInt3974, local38 << 24 | this.aClass155_Sub2_10.anInt5479), Static2.method56(local6.anInt3975, local42 << 24 | this.aClass155_Sub2_10.anInt5479));
						}
					} else if (local6.aShort54 >= 0) {
						arg3.method4418(local283, local339, local451, local255, local311, local423, local6.anInt3973, local6.anInt3974, local6.anInt3975, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort54);
					} else {
						arg3.method4424(local283, local339, local451, local255, local311, local423, local6.anInt3973, local6.anInt3974, local6.anInt3975);
					}
					arg3.anInt4910 = 0;
					return;
				}
				arg3.method4423(local283, local339, local451, local255, local311, local423, this.aClass155_Sub2_10.anInt5479);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	@Override
	public int method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt6396;
		@Pc(9) int local9 = arg1 >> this.anInt6396;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt6380 - 1 || local9 > super.anInt6381 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt6389 - 1;
		@Pc(41) int local41 = arg1 & this.anInt6389 - 1;
		@Pc(67) int local67 = this.anIntArrayArray58[local4][local9] * (this.anInt6389 - local34) + this.anIntArrayArray58[local4 + 1][local9] * local34 >> this.anInt6396;
		@Pc(97) int local97 = this.anIntArrayArray58[local4][local9 + 1] * (this.anInt6389 - local34) + this.anIntArrayArray58[local4 + 1][local9 + 1] * local34 >> this.anInt6396;
		return local67 * (this.anInt6389 - local41) + local97 * local41 >> this.anInt6396;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lclient!tm;IIIIZ)Z")
	@Override
	public boolean method5643(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!eo;[I)V")
	@Override
	public void method5645(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	@Override
	public void method5637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray24[arg0][arg1] < arg2) {
			this.aByteArrayArray24[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5650(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class167 local4 = this.aClass155_Sub2_10.method4960(Thread.currentThread());
		@Pc(7) Class193 local7 = local4.aClass193_2;
		local7.anInt4910 = 0;
		local7.aBoolean378 = false;
		if (this.aClass159ArrayArray1 != null) {
			this.method5653(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray460, local4.anIntArray453);
		} else if (this.aClass140ArrayArray1 != null) {
			this.method5658(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray460, local4.anIntArray453);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!tm;)Lclient!tm;")
	@Override
	public Class3_Sub7_Sub6 method5641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub6 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!tm;IIIIZ)V")
	@Override
	public void method5642(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIIIIII[[ZLclient!qh;[I[I)V")
	private void method5658(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class193 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean376 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass140ArrayArray1[local22][local25] != null) {
						@Pc(50) Class140 local50 = this.aClass140ArrayArray1[local22][local25];
						if (local50.aShort46 != -1 && (local50.aByte48 & 0x2) == 0 && local50.anInt3526 == -1) {
							local69 = this.aClass155_Sub2_10.method4965(local50.aShort46);
							arg5.method4416(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static127.method2044(local69, local50.aShort47 & 0xFFFF), Static127.method2044(local69, local50.aShort49 & 0xFFFF), Static127.method2044(local69, local50.aShort45 & 0xFFFF));
							arg5.method4416(local20, local20, local20 - 4, local16, local16 + 4, local16, Static127.method2044(local69, local50.aShort48 & 0xFFFF), Static127.method2044(local69, local50.aShort45 & 0xFFFF), Static127.method2044(local69, local50.aShort49 & 0xFFFF));
						} else if (local50.anInt3526 == -1) {
							arg5.method4416(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort47 & 0xFFFF, local50.aShort49 & 0xFFFF, local50.aShort45 & 0xFFFF);
							arg5.method4416(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort48 & 0xFFFF, local50.aShort45 & 0xFFFF, local50.aShort49 & 0xFFFF);
						} else {
							local69 = local50.anInt3526;
							arg5.method4416(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method4416(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass46ArrayArray1[local22][local25] != null) {
						@Pc(249) Class46 local249 = this.aClass46ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort14; local69++) {
							arg6[local69] = local16 + (local249.anIntArray97[local69] - local22 * this.anInt6389) * 4 / this.anInt6389;
							arg7[local69] = local20 - (local249.anIntArray98[local69] - local25 * this.anInt6389) * 4 / this.anInt6389;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort15; local297++) {
							@Pc(303) short local303 = local249.aShortArray19[local297];
							@Pc(308) short local308 = local249.aShortArray22[local297];
							@Pc(313) short local313 = local249.aShortArray20[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray95 != null && local249.anIntArray95[local297] != -1) {
								local351 = local249.anIntArray95[local297];
								arg5.method4416(local329, local333, local337, local317, local321, local325, Static127.method2044(local351, local249.aShortArray23[local303]), Static127.method2044(local351, local249.aShortArray23[local308]), Static127.method2044(local351, local249.aShortArray23[local313]));
							} else if (local249.aShortArray24 == null || local249.aShortArray24[local297] == -1) {
								local351 = local249.anIntArray94[local297];
								arg5.method4416(local329, local333, local337, local317, local321, local325, Static127.method2044(local351, local249.aShortArray23[local303]), Static127.method2044(local351, local249.aShortArray23[local308]), Static127.method2044(local351, local249.aShortArray23[local313]));
							} else {
								local351 = this.aClass155_Sub2_10.method4965(local249.aShortArray24[local297]);
								arg5.method4416(local329, local333, local337, local317, local321, local325, Static127.method2044(local351, local249.aShortArray23[local303]), Static127.method2044(local351, local249.aShortArray23[local308]), Static127.method2044(local351, local249.aShortArray23[local313]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean376 = true;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Lclient!tm;IIIIZ)V")
	@Override
	public void method5646(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)I")
	@Override
	public int method5648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray58[arg0][arg1];
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
	@Override
	public void method5651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class167 local4 = this.aClass155_Sub2_10.method4960(Thread.currentThread());
		local4.aClass193_2.anInt4910 = 0;
		if (this.aClass159ArrayArray1 != null) {
			this.method5657(arg0, arg1, this.aClass155_Sub2_10.aBoolean425, local4.aClass193_2, local4.anIntArray460, local4.anIntArray453, local4.anIntArray450);
		} else if (this.aClass140ArrayArray1 != null) {
			this.method5655(arg0, arg1, local4.aClass193_2, local4.anIntArray460, local4.anIntArray453, local4.anIntArray450);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass140ArrayArray1 == null) {
			this.aClass140ArrayArray1 = new Class140[super.anInt6380][super.anInt6381];
			this.aClass46ArrayArray1 = new Class46[super.anInt6380][super.anInt6381];
		} else if (this.aClass159ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg6[local57]];
				local70 = arg4[arg6[local57]];
				if (local64 != 0 && local64 != this.anInt6389 || local70 != 0 && local70 != this.anInt6389) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class46 local95 = new Class46();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort14 = local99;
			local95.aShortArray23 = new short[local99];
			local95.anIntArray97 = new int[local99];
			local95.anIntArray96 = new int[local99];
			local95.anIntArray98 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray23[local124] = (short) (this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt6389) {
					local95.aShortArray23[local124] = (short) (this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1]);
				} else if (local129 == this.anInt6389 && local133 == this.anInt6389) {
					local95.aShortArray23[local124] = (short) (this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt6389 && local133 == 0) {
					local95.aShortArray23[local124] = (short) (this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]) * (this.anInt6389 - local129) + (this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1]) * (this.anInt6389 - local129) + (this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray23[local124] = (short) (local288 * (this.anInt6389 - local133) + local335 * local133 >> this.anInt6396 * 2);
				}
				local288 = (arg0 << this.anInt6396) + local129;
				local335 = (arg1 << this.anInt6396) + local133;
				local95.anIntArray97[local124] = local288;
				local95.anIntArray98[local124] = local335;
				local95.anIntArray96[local124] = this.method5638(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray23[local124] < 2) {
					local95.aShortArray23[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass155_Sub2_10.anInterface10_7.method192(arg11[local288]).aBoolean223) {
					local412 = true;
				}
			}
			local95.anIntArray94 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray95 = new int[local133];
			}
			local95.aShortArray19 = new short[local133];
			local95.aShortArray22 = new short[local133];
			local95.aShortArray20 = new short[local133];
			if (local412) {
				local95.aShortArray24 = new short[local133];
				local95.aShortArray21 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray94[local95.aShort15] = Static378.method5608(arg9[local335]);
					} else {
						local95.anIntArray94[local95.aShort15] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray95[local95.aShort15] = -1;
						} else {
							local95.anIntArray95[local95.aShort15] = Static378.method5608(arg10[local335]);
						}
					}
					local95.aShortArray19[local95.aShort15] = (short) arg6[local335];
					local95.aShortArray22[local95.aShort15] = (short) arg7[local335];
					local95.aShortArray20[local95.aShort15] = (short) arg8[local335];
					if (local412) {
						if (arg11[local335] == -1 || this.aClass155_Sub2_10.anInterface10_7.method192(arg11[local335]).aBoolean223) {
							local95.aShortArray24[local95.aShort15] = -1;
						} else {
							local95.aShortArray24[local95.aShort15] = (short) arg11[local335];
							local95.aShortArray21[local95.aShort15] = (short) arg12[local335];
						}
					}
					local95.aShort15++;
				}
			}
			this.aClass46ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(641) Class140 local641 = new Class140();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local641.anInt3526 = Static127.method2044(Static378.method5608(arg10[0]), this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]);
				if (local64 == -1) {
					local641.aByte48 = (byte) (local641.aByte48 | 0x2);
				}
			}
			if (this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0 + 1][arg1] && this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0 + 1][arg1 + 1] && this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0][arg1 + 1]) {
				local641.aByte48 = (byte) (local641.aByte48 | 0x1);
			}
			if (local70 == -1 || (local641.aByte48 & 0x2) != 0 || this.aClass155_Sub2_10.anInterface10_7.method192(local70).aBoolean223) {
				@Pc(842) short local842 = Static378.method5608(local64);
				local641.aShort48 = (short) Static127.method2044(local842, this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]);
				local641.aShort45 = (short) Static127.method2044(local842, this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1]);
				local641.aShort47 = (short) Static127.method2044(local842, this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1]);
				local641.aShort49 = (short) Static127.method2044(local842, this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1]);
				local641.aShort46 = -1;
			} else {
				local641.aShort48 = (short) (this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]);
				local641.aShort45 = (short) (this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1]);
				local641.aShort47 = (short) (this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1]);
				local641.aShort49 = (short) (this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1]);
				local641.aShort46 = (short) local70;
			}
			this.aClass140ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class118_Sub2 local3 = this.aClass155_Sub2_10.aClass118_Sub2_3;
		this.anInt6388 = local3.anInt3017;
		this.anInt6382 = local3.anInt3013;
		this.anInt6391 = local3.anInt3018;
		this.anInt6392 = local3.anInt3009;
		this.anInt6395 = local3.anInt3010;
		this.anInt6385 = local3.anInt3012;
		this.anInt6393 = local3.anInt3014;
		this.anInt6384 = local3.anInt3019;
		this.anInt6390 = local3.anInt3015;
		this.anInt6386 = local3.anInt3008;
		this.anInt6383 = local3.anInt3016;
		this.anInt6387 = local3.anInt3011;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	@Override
	public void method5644() {
		this.aByteArrayArray25 = null;
		this.aByteArrayArray24 = null;
	}
}
