import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class107_Sub2 extends Class107 {

	@OriginalMember(owner = "client!so", name = "n", descriptor = "I")
	private int anInt5382;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "I")
	private int anInt5383;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "I")
	private int anInt5384;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "I")
	private int anInt5385;

	@OriginalMember(owner = "client!so", name = "s", descriptor = "I")
	private int anInt5386;

	@OriginalMember(owner = "client!so", name = "u", descriptor = "I")
	private int anInt5387;

	@OriginalMember(owner = "client!so", name = "v", descriptor = "I")
	private int anInt5388;

	@OriginalMember(owner = "client!so", name = "x", descriptor = "[[Lclient!h;")
	private Class88[][] aClass88ArrayArray1;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "[[Lclient!ob;")
	private Class175[][] aClass175ArrayArray1;

	@OriginalMember(owner = "client!so", name = "B", descriptor = "[[Lclient!ho;")
	private Class100[][] aClass100ArrayArray1;

	@OriginalMember(owner = "client!so", name = "C", descriptor = "I")
	private int anInt5390;

	@OriginalMember(owner = "client!so", name = "D", descriptor = "I")
	private int anInt5391;

	@OriginalMember(owner = "client!so", name = "F", descriptor = "[[Lclient!fd;")
	private Class68[][] aClass68ArrayArray1;

	@OriginalMember(owner = "client!so", name = "G", descriptor = "I")
	private int anInt5393;

	@OriginalMember(owner = "client!so", name = "H", descriptor = "I")
	private int anInt5394;

	@OriginalMember(owner = "client!so", name = "I", descriptor = "I")
	private int anInt5395;

	@OriginalMember(owner = "client!so", name = "w", descriptor = "Lclient!et;")
	private final Class63_Sub1 aClass63_Sub1_8;

	@OriginalMember(owner = "client!so", name = "E", descriptor = "I")
	private final int anInt5392;

	@OriginalMember(owner = "client!so", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "I")
	private final int anInt5381;

	@OriginalMember(owner = "client!so", name = "A", descriptor = "I")
	private int anInt5389;

	@OriginalMember(owner = "client!so", name = "r", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!so", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!et;IIII[[I[[II)V")
	public Class107_Sub2(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass63_Sub1_8 = arg0;
		this.anInt5392 = arg2;
		this.anIntArrayArray43 = arg5;
		this.anInt5381 = arg7;
		this.anInt5389 = 0;
		while (arg7 > 1) {
			this.anInt5389++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray15 = new byte[arg3 + 1][arg4 + 1];
		@Pc(47) int local47 = this.aClass63_Sub1_8.anInt1599 >> 9;
		for (@Pc(49) int local49 = 1; local49 < arg4; local49++) {
			for (@Pc(52) int local52 = 1; local52 < arg3; local52++) {
				@Pc(71) int local71 = arg6[local52 + 1][local49] - arg6[local52 - 1][local49];
				@Pc(87) int local87 = arg6[local52][local49 + 1] - arg6[local52][local49 - 1];
				@Pc(100) int local100 = (int) Math.sqrt((double) (local71 * local71 + local87 * local87 + 65536));
				@Pc(106) int local106 = (local71 << 8) / local100;
				@Pc(110) int local110 = -65536 / local100;
				@Pc(116) int local116 = (local87 << 8) / local100;
				@Pc(138) int local138 = local47 + (this.aClass63_Sub1_8.anInt1608 * local106 + this.aClass63_Sub1_8.anInt1597 * local110 + this.aClass63_Sub1_8.anInt1616 * local116 >> 17);
				local138 >>= 0x1;
				if (local138 < 2) {
					local138 = 2;
				} else if (local138 > 126) {
					local138 = 126;
				}
				this.aByteArrayArray15[local52][local49] = (byte) local138;
			}
		}
		this.aByteArrayArray16 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII[[ZLclient!da;[I[I)V")
	private void method4686(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class43 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean86 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass175ArrayArray1[local22][local25] != null) {
						@Pc(50) Class175 local50 = this.aClass175ArrayArray1[local22][local25];
						if (local50.aShort59 != -1 && (local50.aByte46 & 0x2) == 0 && local50.anInt4292 == 0) {
							local68 = this.aClass63_Sub1_8.method1508(local50.aShort59);
							arg5.method881(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static50.method860(local68, local50.anInt4293), Static50.method860(local68, local50.anInt4291), Static50.method860(local68, local50.anInt4294));
							arg5.method881(local20, local20, local20 - 4, local16, local16 + 4, local16, Static50.method860(local68, local50.anInt4295), Static50.method860(local68, local50.anInt4294), Static50.method860(local68, local50.anInt4291));
						} else if (local50.anInt4292 == 0) {
							arg5.method891(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt4293, local50.anInt4291, local50.anInt4294);
							arg5.method891(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt4295, local50.anInt4294, local50.anInt4291);
						} else {
							local68 = local50.anInt4292;
							arg5.method891(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static156.method2842(local68, local50.anInt4293 & 0xFF000000), Static156.method2842(local68, local50.anInt4291 & 0xFF000000), Static156.method2842(local68, local50.anInt4294 & 0xFF000000));
							arg5.method891(local20, local20, local20 - 4, local16, local16 + 4, local16, Static156.method2842(local68, local50.anInt4295 & 0xFF000000), Static156.method2842(local68, local50.anInt4294 & 0xFF000000), Static156.method2842(local68, local50.anInt4291 & 0xFF000000));
						}
					} else if (this.aClass100ArrayArray1[local22][local25] != null) {
						@Pc(259) Class100 local259 = this.aClass100ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort46; local68++) {
							arg6[local68] = local16 + (local259.aShortArray39[local68] - local22 * this.anInt5381) * 4 / this.anInt5381;
							arg7[local68] = local20 - (local259.aShortArray38[local68] - local25 * this.anInt5381) * 4 / this.anInt5381;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort47; local307++) {
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
							if (local259.anIntArray548 != null && local259.anIntArray548[local307] != 0 && (local259.aShortArray35 == null || local259.aShortArray35 != null && local259.aShortArray35[local307] == -1)) {
								local369 = local259.anIntArray548[local307];
								arg5.method891(local336, local340, local344, local324, local328, local332, Static156.method2842(local369, -(local259.anIntArray549[local312] & -16777216) - 16777216), Static156.method2842(local369, -(local259.anIntArray549[local316] & -16777216) - 16777216), Static156.method2842(local369, -(local259.anIntArray549[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray35 == null || local259.aShortArray35[local307] == -1) {
								arg5.method891(local336, local340, local344, local324, local328, local332, local259.anIntArray549[local312], local259.anIntArray549[local316], local259.anIntArray549[local320]);
							} else {
								local369 = this.aClass63_Sub1_8.method1508(local259.aShortArray35[local307]);
								arg5.method881(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean86 = true;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIZLclient!da;[I[I[I)V")
	private void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class43 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class175 local6 = this.aClass175ArrayArray1[arg0][arg1];
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
			@Pc(1426) Class100 local1426 = this.aClass100ArrayArray1[arg0][arg1];
			if (local1426 != null) {
				for (local423 = 0; local423 < local1426.aShort46; local423++) {
					@Pc(1436) short local1436 = local1426.aShortArray39[local423];
					local29 = local1426.aShortArray37[local423];
					@Pc(1446) short local1446 = local1426.aShortArray38[local423];
					local367 = this.anInt5395 + (this.anInt5393 * local1436 + this.anInt5384 * local29 + this.anInt5394 * local1446 >> 15);
					if (local367 <= this.aClass63_Sub1_8.anInt1613) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass63_Sub1_8.anInt1606;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1426.aShortArray36[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass63_Sub1_8.aBoolean120) {
						local283 = local367 - this.aClass63_Sub1_8.anInt1606;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt5391 + (this.anInt5388 * local1436 + this.anInt5385 * local29 + this.anInt5387 * local1446 >> 15);
					local311 = this.anInt5382 + (this.anInt5390 * local1436 + this.anInt5383 * local29 + this.anInt5386 * local1446 >> 15);
					arg4[local423] = arg3.anInt1062 + local255 * this.aClass63_Sub1_8.anInt1611 / local367;
					arg5[local423] = arg3.anInt1065 + local311 * this.aClass63_Sub1_8.anInt1598 / local367;
				}
				if (local1426.aShortArray35 != null) {
					local283 = this.anIntArrayArray43[arg0][arg1];
					local339 = this.anIntArrayArray43[arg0 + 1][arg1];
					local395 = this.anIntArrayArray43[arg0][arg1 + 1];
					local451 = arg0 * this.anInt5381;
					local244 = local451 + this.anInt5381;
					local300 = arg1 * this.anInt5381;
					local356 = local300 + this.anInt5381;
					local412 = this.anInt5391 + (this.anInt5388 * local451 + this.anInt5385 * local283 + this.anInt5387 * local300 >> 15);
					local272 = this.anInt5382 + (this.anInt5390 * local451 + this.anInt5383 * local283 + this.anInt5386 * local300 >> 15);
					local328 = this.anInt5395 + (this.anInt5393 * local451 + this.anInt5384 * local283 + this.anInt5394 * local300 >> 15);
					local384 = this.anInt5391 + (this.anInt5388 * local244 + this.anInt5385 * local339 + this.anInt5387 * local300 >> 15);
					local440 = this.anInt5382 + (this.anInt5390 * local244 + this.anInt5383 * local339 + this.anInt5386 * local300 >> 15);
					local78 = this.anInt5395 + (this.anInt5393 * local244 + this.anInt5384 * local339 + this.anInt5394 * local300 >> 15);
					local101 = this.anInt5391 + (this.anInt5388 * local451 + this.anInt5385 * local395 + this.anInt5387 * local356 >> 15);
					local124 = this.anInt5382 + (this.anInt5390 * local451 + this.anInt5383 * local395 + this.anInt5386 * local356 >> 15);
					local147 = this.anInt5395 + (this.anInt5393 * local451 + this.anInt5384 * local395 + this.anInt5394 * local356 >> 15);
					for (local36 = 0; local36 < local1426.aShort47; local36++) {
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
							arg3.aBoolean83 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt1063 || local56 > arg3.anInt1063 || local61 > arg3.anInt1063;
							@Pc(1930) short local1930 = local1426.aShortArray35[local36];
							if (local1886 < 765) {
								if (local1930 != -1 && this.method4689(this.aClass63_Sub1_8.anInterface9_3.method139(local1930).aByte33)) {
									arg3.anInt1064 = 100;
								}
								if (local1886 > 0) {
									if (local1930 != -1) {
										arg3.method878(local222, local227, local616, local163, local56, local61, this.aClass63_Sub1_8.anInt1621, arg6[local38], arg6[local40], arg6[local42], local1426.anIntArray549[local38], local1426.anIntArray549[local40], local1426.anIntArray549[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1930);
									} else if ((local1426.anIntArray549[local38] & 0xFFFFFF) != 0) {
										arg3.method891(local222, local227, local616, local163, local56, local61, Static156.method2842(local1426.anIntArray549[local38], arg6[local38] << 24 | this.aClass63_Sub1_8.anInt1621), Static156.method2842(local1426.anIntArray549[local40], arg6[local40] << 24 | this.aClass63_Sub1_8.anInt1621), Static156.method2842(local1426.anIntArray549[local42], arg6[local42] << 24 | this.aClass63_Sub1_8.anInt1621));
									}
								} else if (local1930 != -1) {
									arg3.method885(local222, local227, local616, local163, local56, local61, local1426.anIntArray549[local38], local1426.anIntArray549[local40], local1426.anIntArray549[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1930);
								} else if ((local1426.anIntArray549[local38] & 0xFFFFFF) != 0) {
									arg3.method891(local222, local227, local616, local163, local56, local61, local1426.anIntArray549[local38], local1426.anIntArray549[local40], local1426.anIntArray549[local42]);
								}
								arg3.anInt1064 = 0;
							} else {
								arg3.method892(local222, local227, local616, local163, local56, local61, this.aClass63_Sub1_8.anInt1621);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1426.aShort47; local283++) {
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
						arg3.aBoolean83 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt1063 || local300 > arg3.anInt1063 || local356 > arg3.anInt1063;
						if (local384 >= 765) {
							arg3.method892(local412, local272, local328, local244, local300, local356, this.aClass63_Sub1_8.anInt1621);
						} else if (local384 > 0) {
							if ((local1426.anIntArray549[local339] & 0xFFFFFF) != 0) {
								arg3.method891(local412, local272, local328, local244, local300, local356, Static236.method1932(arg6[local339], this.aClass63_Sub1_8.anInt1621, local1426.anIntArray549[local339]), Static236.method1932(arg6[local395], this.aClass63_Sub1_8.anInt1621, local1426.anIntArray549[local395]), Static236.method1932(arg6[local451], this.aClass63_Sub1_8.anInt1621, local1426.anIntArray549[local451]));
							}
						} else if ((local1426.anIntArray549[local339] & 0xFFFFFF) != 0) {
							arg3.method891(local412, local272, local328, local244, local300, local356, local1426.anIntArray549[local339], local1426.anIntArray549[local395], local1426.anIntArray549[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte46 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt5381;
			@Pc(24) int local24 = local19 + this.anInt5381;
			local29 = arg1 * this.anInt5381;
			@Pc(34) int local34 = local29 + this.anInt5381;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte46 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray43[arg0][arg1];
				local61 = this.anIntArrayArray43[arg0 + 1][arg1];
				local222 = this.anIntArrayArray43[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray43[arg0][arg1 + 1];
				local78 = this.anInt5395 + (this.anInt5393 * local19 + this.anInt5384 * local56 + this.anInt5394 * local29 >> 15);
				if (local78 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local101 = this.anInt5395 + (this.anInt5393 * local24 + this.anInt5384 * local61 + this.anInt5394 * local29 >> 15);
				if (local101 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local124 = this.anInt5395 + (this.anInt5393 * local24 + this.anInt5384 * local222 + this.anInt5394 * local34 >> 15);
				if (local124 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local147 = this.anInt5395 + (this.anInt5393 * local19 + this.anInt5384 * local227 + this.anInt5394 * local34 >> 15);
				if (local147 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local616 = local6.aShort60 * local163 / 255;
						if (local616 > 0) {
							local56 -= local616;
						}
					}
					local163 = local101 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local616 = local6.aShort57 * local163 / 255;
						if (local616 > 0) {
							local61 -= local616;
						}
					}
					local163 = local124 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local616 = local6.aShort61 * local163 / 255;
						if (local616 > 0) {
							local222 -= local616;
						}
					}
					local163 = local147 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local616 = local6.aShort58 * local163 / 255;
						if (local616 > 0) {
							local227 -= local616;
						}
					}
				} else if (this.aClass63_Sub1_8.aBoolean120) {
					local163 = local78 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt5391 + (this.anInt5388 * local19 + this.anInt5385 * local56 + this.anInt5387 * local29 >> 15);
				local255 = arg3.anInt1062 + local244 * this.aClass63_Sub1_8.anInt1611 / local78;
				local272 = this.anInt5382 + (this.anInt5390 * local19 + this.anInt5383 * local56 + this.anInt5386 * local29 >> 15);
				local283 = arg3.anInt1065 + local272 * this.aClass63_Sub1_8.anInt1598 / local78;
				local300 = this.anInt5391 + (this.anInt5388 * local24 + this.anInt5385 * local61 + this.anInt5387 * local29 >> 15);
				local311 = arg3.anInt1062 + local300 * this.aClass63_Sub1_8.anInt1611 / local101;
				local328 = this.anInt5382 + (this.anInt5390 * local24 + this.anInt5383 * local61 + this.anInt5386 * local29 >> 15);
				local339 = arg3.anInt1065 + local328 * this.aClass63_Sub1_8.anInt1598 / local101;
				local356 = this.anInt5391 + (this.anInt5388 * local24 + this.anInt5385 * local222 + this.anInt5387 * local34 >> 15);
				local367 = arg3.anInt1062 + local356 * this.aClass63_Sub1_8.anInt1611 / local124;
				local384 = this.anInt5382 + (this.anInt5390 * local24 + this.anInt5383 * local222 + this.anInt5386 * local34 >> 15);
				local395 = arg3.anInt1065 + local384 * this.aClass63_Sub1_8.anInt1598 / local124;
				local412 = this.anInt5391 + (this.anInt5388 * local19 + this.anInt5385 * local227 + this.anInt5387 * local34 >> 15);
				local423 = arg3.anInt1062 + local412 * this.aClass63_Sub1_8.anInt1611 / local147;
				local440 = this.anInt5382 + (this.anInt5390 * local19 + this.anInt5383 * local227 + this.anInt5386 * local34 >> 15);
				local451 = arg3.anInt1065 + local440 * this.aClass63_Sub1_8.anInt1598 / local147;
			} else {
				local56 = this.anIntArrayArray43[arg0][arg1];
				local61 = this.anInt5384 * local56;
				local78 = this.anInt5395 + (this.anInt5393 * local19 + local61 + this.anInt5394 * local29 >> 15);
				if (local78 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local101 = this.anInt5395 + (this.anInt5393 * local24 + local61 + this.anInt5394 * local29 >> 15);
				if (local101 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local124 = this.anInt5395 + (this.anInt5393 * local24 + local61 + this.anInt5394 * local34 >> 15);
				if (local124 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local147 = this.anInt5395 + (this.anInt5393 * local19 + local61 + this.anInt5394 * local34 >> 15);
				if (local147 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				if (this.aClass63_Sub1_8.aBoolean120) {
					local163 = local78 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass63_Sub1_8.anInt1606;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt5385 * local56;
				local227 = this.anInt5383 * local56;
				local244 = this.anInt5391 + (this.anInt5388 * local19 + local222 + this.anInt5387 * local29 >> 15);
				local255 = arg3.anInt1062 + local244 * this.aClass63_Sub1_8.anInt1611 / local78;
				local272 = this.anInt5382 + (this.anInt5390 * local19 + local227 + this.anInt5386 * local29 >> 15);
				local283 = arg3.anInt1065 + local272 * this.aClass63_Sub1_8.anInt1598 / local78;
				local300 = this.anInt5391 + (this.anInt5388 * local24 + local222 + this.anInt5387 * local29 >> 15);
				local311 = arg3.anInt1062 + local300 * this.aClass63_Sub1_8.anInt1611 / local101;
				local328 = this.anInt5382 + (this.anInt5390 * local24 + local227 + this.anInt5386 * local29 >> 15);
				local339 = arg3.anInt1065 + local328 * this.aClass63_Sub1_8.anInt1598 / local101;
				local356 = this.anInt5391 + (this.anInt5388 * local24 + local222 + this.anInt5387 * local34 >> 15);
				local367 = arg3.anInt1062 + local356 * this.aClass63_Sub1_8.anInt1611 / local124;
				local384 = this.anInt5382 + (this.anInt5390 * local24 + local227 + this.anInt5386 * local34 >> 15);
				local395 = arg3.anInt1065 + local384 * this.aClass63_Sub1_8.anInt1598 / local124;
				local412 = this.anInt5391 + (this.anInt5388 * local19 + local222 + this.anInt5387 * local34 >> 15);
				local423 = arg3.anInt1062 + local412 * this.aClass63_Sub1_8.anInt1611 / local147;
				local440 = this.anInt5382 + (this.anInt5390 * local19 + local227 + this.anInt5386 * local34 >> 15);
				local451 = arg3.anInt1065 + local440 * this.aClass63_Sub1_8.anInt1598 / local147;
			}
			@Pc(1038) boolean local1038 = local6.aShort59 != -1 && this.method4689(this.aClass63_Sub1_8.anInterface9_3.method139(local6.aShort59).aByte33);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean83 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt1063 || local423 > arg3.anInt1063 || local311 > arg3.anInt1063;
				if (local61 < 765) {
					if (local1038) {
						arg3.anInt1064 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort59 >= 0) {
							arg3.method878(local395, local451, local339, local367, local423, local311, this.aClass63_Sub1_8.anInt1621, local40, local42, local38, local6.anInt4293, local6.anInt4291, local6.anInt4294, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort59);
						} else {
							arg3.method891(local395, local451, local339, local367, local423, local311, Static156.method2842(local6.anInt4293, local40 << 24 | this.aClass63_Sub1_8.anInt1621), Static156.method2842(local6.anInt4291, local42 << 24 | this.aClass63_Sub1_8.anInt1621), Static156.method2842(local6.anInt4294, local38 << 24 | this.aClass63_Sub1_8.anInt1621));
						}
					} else if (local6.aShort59 >= 0) {
						arg3.method885(local395, local451, local339, local367, local423, local311, local6.anInt4293, local6.anInt4291, local6.anInt4294, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort59);
					} else {
						arg3.method891(local395, local451, local339, local367, local423, local311, local6.anInt4293, local6.anInt4291, local6.anInt4294);
					}
					arg3.anInt1064 = 0;
				} else {
					arg3.method892(local395, local451, local339, local367, local423, local311, this.aClass63_Sub1_8.anInt1621);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean83 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt1063 || local311 > arg3.anInt1063 || local423 > arg3.anInt1063;
				if (local61 < 765) {
					if (local1038) {
						arg3.anInt1064 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort59 >= 0) {
							arg3.method878(local283, local339, local451, local255, local311, local423, this.aClass63_Sub1_8.anInt1621, local36, local38, local42, local6.anInt4295, local6.anInt4294, local6.anInt4291, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort59);
						} else {
							arg3.method891(local283, local339, local451, local255, local311, local423, Static156.method2842(local6.anInt4295, local36 << 24 | this.aClass63_Sub1_8.anInt1621), Static156.method2842(local6.anInt4294, local38 << 24 | this.aClass63_Sub1_8.anInt1621), Static156.method2842(local6.anInt4291, local42 << 24 | this.aClass63_Sub1_8.anInt1621));
						}
					} else if (local6.aShort59 >= 0) {
						arg3.method885(local283, local339, local451, local255, local311, local423, local6.anInt4295, local6.anInt4294, local6.anInt4291, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort59);
					} else {
						arg3.method891(local283, local339, local451, local255, local311, local423, local6.anInt4295, local6.anInt4294, local6.anInt4291);
					}
					arg3.anInt1064 = 0;
					return;
				}
				arg3.method892(local283, local339, local451, local255, local311, local423, this.aClass63_Sub1_8.anInt1621);
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
	@Override
	public void method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray16[arg0][arg1] < arg2) {
			this.aByteArrayArray16[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!nq;[I)V")
	@Override
	public void method4676(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass88ArrayArray1 == null) {
			this.aClass88ArrayArray1 = new Class88[super.anInt5379][super.anInt5378];
			this.aClass68ArrayArray1 = new Class68[super.anInt5379][super.anInt5378];
		} else if (this.aClass175ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != this.anInt5381 || local70 != 0 && local70 != this.anInt5381) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class68 local95 = new Class68();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort17 = local99;
			local95.aShortArray25 = new short[local99];
			local95.anIntArray374 = new int[local99];
			local95.anIntArray373 = new int[local99];
			local95.anIntArray376 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray25[local124] = (short) (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt5381) {
					local95.aShortArray25[local124] = (short) (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				} else if (local129 == this.anInt5381 && local133 == this.anInt5381) {
					local95.aShortArray25[local124] = (short) (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt5381 && local133 == 0) {
					local95.aShortArray25[local124] = (short) (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (this.anInt5381 - local129) + (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (this.anInt5381 - local129) + (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray25[local124] = (short) (local288 * (this.anInt5381 - local133) + local335 * local133 >> this.anInt5389 * 2);
				}
				local288 = (arg0 << this.anInt5389) + local129;
				local335 = (arg1 << this.anInt5389) + local133;
				local95.anIntArray374[local124] = local288;
				local95.anIntArray376[local124] = local335;
				local95.anIntArray373[local124] = this.method4673(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray25[local124] < 2) {
					local95.aShortArray25[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass63_Sub1_8.anInterface9_3.method139(arg11[local288]).aBoolean255) {
					local412 = true;
				}
			}
			local95.anIntArray375 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray372 = new int[local133];
			}
			local95.aShortArray24 = new short[local133];
			local95.aShortArray27 = new short[local133];
			local95.aShortArray28 = new short[local133];
			if (local412) {
				local95.aShortArray26 = new short[local133];
				local95.aShortArray29 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray375[local95.aShort18] = Static264.method4082(arg9[local335]);
					} else {
						local95.anIntArray375[local95.aShort18] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray372[local95.aShort18] = -1;
						} else {
							local95.anIntArray372[local95.aShort18] = Static264.method4082(arg10[local335]);
						}
					}
					local95.aShortArray24[local95.aShort18] = (short) arg6[local335];
					local95.aShortArray27[local95.aShort18] = (short) arg7[local335];
					local95.aShortArray28[local95.aShort18] = (short) arg8[local335];
					if (local412) {
						if (arg11[local335] == -1 || this.aClass63_Sub1_8.anInterface9_3.method139(arg11[local335]).aBoolean255) {
							local95.aShortArray26[local95.aShort18] = -1;
						} else {
							local95.aShortArray26[local95.aShort18] = (short) arg11[local335];
							local95.aShortArray29[local95.aShort18] = (short) arg12[local335];
						}
					}
					local95.aShort18++;
				}
			}
			this.aClass68ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(641) Class88 local641 = new Class88();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local641.anInt2586 = Static50.method860(Static264.method4082(arg10[0]), this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				if (local64 == -1) {
					local641.aByte27 = (byte) (local641.aByte27 | 0x2);
				}
			}
			if (this.anIntArrayArray43[arg0][arg1] == this.anIntArrayArray43[arg0 + 1][arg1] && this.anIntArrayArray43[arg0][arg1] == this.anIntArrayArray43[arg0 + 1][arg1 + 1] && this.anIntArrayArray43[arg0][arg1] == this.anIntArrayArray43[arg0][arg1 + 1]) {
				local641.aByte27 = (byte) (local641.aByte27 | 0x1);
			}
			if (local70 == -1 || (local641.aByte27 & 0x2) != 0 || this.aClass63_Sub1_8.anInterface9_3.method139(local70).aBoolean255) {
				@Pc(842) short local842 = Static264.method4082(local64);
				local641.aShort41 = (short) Static50.method860(local842, this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				local641.aShort43 = (short) Static50.method860(local842, this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				local641.aShort44 = (short) Static50.method860(local842, this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				local641.aShort45 = (short) Static50.method860(local842, this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				local641.aShort42 = -1;
			} else {
				local641.aShort41 = (short) (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				local641.aShort43 = (short) (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				local641.aShort44 = (short) (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				local641.aShort45 = (short) (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				local641.aShort42 = (short) local70;
			}
			this.aClass88ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass175ArrayArray1 == null) {
			this.aClass175ArrayArray1 = new Class175[super.anInt5379][super.anInt5378];
			this.aClass100ArrayArray1 = new Class100[super.anInt5379][super.anInt5378];
		} else if (this.aClass88ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static214.anIntArray762[Static264.method4082(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static214.anIntArray762[Static264.method4082(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == this.anInt5381 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt5381 && arg4[local116] == this.anInt5381) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt5381) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt5381 && arg2[local244] != arg2[0] - this.anInt5381) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt5381 && arg4[local244] != arg4[0] - this.anInt5381) {
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
			@Pc(334) Class175 local334 = new Class175();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt4292 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte46 = (byte) (local334.aByte46 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray43[arg0][arg1] == this.anIntArrayArray43[arg0 + 1][arg1] && this.anIntArrayArray43[arg0][arg1] == this.anIntArrayArray43[arg0 + 1][arg1 + 1] && this.anIntArrayArray43[arg0][arg1] == this.anIntArrayArray43[arg0][arg1 + 1]) {
				local334.aByte46 = (byte) (local334.aByte46 | 0x1);
			}
			if (local342 == -1 || (local334.aByte46 & 0x2) != 0 || this.aClass63_Sub1_8.anInterface9_3.method139(local342).aBoolean255) {
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
				local334.anInt4295 = Static236.method1932(local527, arg10, Static404.method4687(arg6[local104] >> 8, this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]));
				if (local334.anInt4292 != 0) {
					local334.anInt4295 |= this.aByteArrayArray16[arg0][arg1] + 255 - this.aByteArrayArray15[arg0][arg1] << 25;
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
				local334.anInt4294 = Static236.method1932(local527, arg10, Static404.method4687(arg6[local106] >> 8, this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]));
				if (local334.anInt4292 != 0) {
					local334.anInt4294 |= this.aByteArrayArray16[arg0 + 1][arg1] + 255 - this.aByteArrayArray15[arg0 + 1][arg1] << 25;
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
				local334.anInt4293 = Static236.method1932(local527, arg10, Static404.method4687(arg6[local108] >> 8, this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]));
				if (local334.anInt4292 != 0) {
					local334.anInt4293 |= this.aByteArrayArray16[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray15[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt4291 = Static236.method1932(local527, arg10, Static404.method4687(arg6[local110] >> 8, this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]));
				if (local334.anInt4292 != 0) {
					local334.anInt4291 |= this.aByteArrayArray16[arg0][arg1 + 1] + 255 - this.aByteArrayArray15[arg0][arg1 + 1] << 25;
				}
				local334.aShort59 = -1;
			} else {
				local334.anInt4295 = this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1];
				local334.anInt4294 = this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1];
				local334.anInt4293 = this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1];
				local334.anInt4291 = this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1];
				local334.aShort59 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort61 = (short) arg5[local108];
				local334.aShort58 = (short) arg5[local110];
				local334.aShort57 = (short) arg5[local106];
				local334.aShort60 = (short) arg5[local104];
			}
			this.aClass175ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class100 local888 = new Class100();
		local888.aShort46 = (short) arg2.length;
		local888.aShort47 = (short) (arg2.length / 3);
		local888.aShortArray39 = new short[local888.aShort46];
		local888.aShortArray37 = new short[local888.aShort46];
		local888.aShortArray38 = new short[local888.aShort46];
		local888.anIntArray549 = new int[local888.aShort46];
		if (arg5 != null) {
			local888.aShortArray36 = new short[local888.aShort46];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort46; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1];
			} else if (local342 == 0 && local527 == this.anInt5381) {
				local958 = this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1];
			} else if (local342 == this.anInt5381 && local527 == this.anInt5381) {
				local958 = this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt5381 && local527 == 0) {
				local958 = this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (this.anInt5381 - local342) + (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (this.anInt5381 - local342) + (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (this.anInt5381 - local527) + local1126 * local527 >> this.anInt5389 * 2;
			}
			@Pc(1150) short local1150 = (short) ((arg0 << this.anInt5389) + local342);
			@Pc(1158) short local1158 = (short) ((arg1 << this.anInt5389) + local527);
			local888.aShortArray39[local244] = local1150;
			local888.aShortArray38[local244] = local1158;
			local888.aShortArray37[local244] = (short) (this.method4673(local1150, local1158) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass63_Sub1_8.anInterface9_3.method139(arg8[local244]).aBoolean255) {
				local888.anIntArray549[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray36[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray549[local244] = Static236.method1932(local1226, arg10, Static404.method4687(arg6[local244] >> 8, local958));
				if (arg7 != null) {
					local888.anIntArray549[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray549[local244] = 0;
			} else {
				local888.anIntArray549[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort47; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass63_Sub1_8.anInterface9_3.method139(arg8[local527 * 3]).aBoolean255) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray548 = new int[local888.aShort47];
		}
		if (local1296) {
			local888.aShortArray35 = new short[local888.aShort47];
			local888.aShortArray40 = new short[local888.aShort47];
		}
		for (local958 = 0; local958 < local888.aShort47; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray548[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass63_Sub1_8.anInterface9_3.method139(local1384).aBoolean255) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass63_Sub1_8.anInterface9_3.method139(local1384).aBoolean255) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass63_Sub1_8.anInterface9_3.method139(local1384).aBoolean255) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray35[local958] = (short) local1384;
					local888.aShortArray40[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass63_Sub1_8.anInterface9_3.method139(local1384).aBoolean255) {
							local888.anIntArray549[local1079] = Static214.anIntArray762[Static264.method4082(this.aClass63_Sub1_8.anInterface9_3.method139(local1384).aShort52 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass63_Sub1_8.anInterface9_3.method139(local1384).aBoolean255) {
							local888.anIntArray549[local1126] = Static214.anIntArray762[Static264.method4082(this.aClass63_Sub1_8.anInterface9_3.method139(local1384).aShort52 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass63_Sub1_8.anInterface9_3.method139(local1384).aBoolean255) {
							local888.anIntArray549[local1226] = Static214.anIntArray762[Static264.method4082(this.aClass63_Sub1_8.anInterface9_3.method139(local1384).aShort52 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray35[local958] = -1;
				}
			}
		}
		this.aClass100ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "()V")
	@Override
	public void method4684() {
		this.aByteArrayArray15 = null;
		this.aByteArrayArray16 = null;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)Z")
	private boolean method4689(@OriginalArg(0) int arg0) {
		if ((this.anInt5392 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Lclient!dh;IIIIZ)V")
	@Override
	public void method4677(@OriginalArg(0) Class2_Sub10_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!dh;IIIIZ)Z")
	@Override
	public boolean method4674(@OriginalArg(0) Class2_Sub10_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IIIIIII[[ZLclient!da;[I[I)V")
	private void method4690(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class43 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean86 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass88ArrayArray1[local22][local25] != null) {
						@Pc(50) Class88 local50 = this.aClass88ArrayArray1[local22][local25];
						if (local50.aShort42 != -1 && (local50.aByte27 & 0x2) == 0 && local50.anInt2586 == -1) {
							local69 = this.aClass63_Sub1_8.method1508(local50.aShort42);
							arg5.method881(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static50.method860(local69, local50.aShort44 & 0xFFFF), Static50.method860(local69, local50.aShort45 & 0xFFFF), Static50.method860(local69, local50.aShort43 & 0xFFFF));
							arg5.method881(local20, local20, local20 - 4, local16, local16 + 4, local16, Static50.method860(local69, local50.aShort41 & 0xFFFF), Static50.method860(local69, local50.aShort43 & 0xFFFF), Static50.method860(local69, local50.aShort45 & 0xFFFF));
						} else if (local50.anInt2586 == -1) {
							arg5.method881(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort44 & 0xFFFF, local50.aShort45 & 0xFFFF, local50.aShort43 & 0xFFFF);
							arg5.method881(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort41 & 0xFFFF, local50.aShort43 & 0xFFFF, local50.aShort45 & 0xFFFF);
						} else {
							local69 = local50.anInt2586;
							arg5.method881(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method881(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass68ArrayArray1[local22][local25] != null) {
						@Pc(249) Class68 local249 = this.aClass68ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort17; local69++) {
							arg6[local69] = local16 + (local249.anIntArray374[local69] - local22 * this.anInt5381) * 4 / this.anInt5381;
							arg7[local69] = local20 - (local249.anIntArray376[local69] - local25 * this.anInt5381) * 4 / this.anInt5381;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort18; local297++) {
							@Pc(303) short local303 = local249.aShortArray24[local297];
							@Pc(308) short local308 = local249.aShortArray27[local297];
							@Pc(313) short local313 = local249.aShortArray28[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray372 != null && local249.anIntArray372[local297] != -1) {
								local351 = local249.anIntArray372[local297];
								arg5.method881(local329, local333, local337, local317, local321, local325, Static50.method860(local351, local249.aShortArray25[local303]), Static50.method860(local351, local249.aShortArray25[local308]), Static50.method860(local351, local249.aShortArray25[local313]));
							} else if (local249.aShortArray26 == null || local249.aShortArray26[local297] == -1) {
								local351 = local249.anIntArray375[local297];
								arg5.method881(local329, local333, local337, local317, local321, local325, Static50.method860(local351, local249.aShortArray25[local303]), Static50.method860(local351, local249.aShortArray25[local308]), Static50.method860(local351, local249.aShortArray25[local313]));
							} else {
								local351 = this.aClass63_Sub1_8.method1508(local249.aShortArray26[local297]);
								arg5.method881(local329, local333, local337, local317, local321, local325, Static50.method860(local351, local249.aShortArray25[local303]), Static50.method860(local351, local249.aShortArray25[local308]), Static50.method860(local351, local249.aShortArray25[local313]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean86 = true;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4671(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class219 local4 = this.aClass63_Sub1_8.method1515(Thread.currentThread());
		@Pc(7) Class43 local7 = local4.aClass43_1;
		local7.anInt1064 = 0;
		local7.aBoolean83 = false;
		if (this.aClass175ArrayArray1 != null) {
			this.method4686(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray1088, local4.anIntArray1082);
		} else if (this.aClass88ArrayArray1 != null) {
			this.method4690(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray1088, local4.anIntArray1082);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IILclient!dh;)Lclient!dh;")
	@Override
	public Class2_Sub10_Sub3 method4668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub10_Sub3 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class44_Sub1 local3 = this.aClass63_Sub1_8.aClass44_Sub1_1;
		this.anInt5388 = local3.anInt3398;
		this.anInt5385 = local3.anInt3389;
		this.anInt5387 = local3.anInt3391;
		this.anInt5391 = local3.anInt3394;
		this.anInt5390 = local3.anInt3390;
		this.anInt5383 = local3.anInt3399;
		this.anInt5386 = local3.anInt3388;
		this.anInt5382 = local3.anInt3393;
		this.anInt5393 = local3.anInt3392;
		this.anInt5384 = local3.anInt3395;
		this.anInt5394 = local3.anInt3397;
		this.anInt5395 = local3.anInt3396;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
	@Override
	public void method4667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class219 local4 = this.aClass63_Sub1_8.method1515(Thread.currentThread());
		local4.aClass43_1.anInt1064 = 0;
		if (this.aClass175ArrayArray1 != null) {
			this.method4688(arg0, arg1, this.aClass63_Sub1_8.aBoolean117, local4.aClass43_1, local4.anIntArray1088, local4.anIntArray1082, local4.anIntArray1102);
		} else if (this.aClass88ArrayArray1 != null) {
			this.method4691(arg0, arg1, local4.aClass43_1, local4.anIntArray1088, local4.anIntArray1082, local4.anIntArray1102);
		}
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(Lclient!dh;IIIIZ)V")
	@Override
	public void method4683(@OriginalArg(0) Class2_Sub10_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(II)I")
	@Override
	public int method4673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt5389;
		@Pc(9) int local9 = arg1 >> this.anInt5389;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt5379 - 1 || local9 > super.anInt5378 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt5381 - 1;
		@Pc(41) int local41 = arg1 & this.anInt5381 - 1;
		@Pc(67) int local67 = this.anIntArrayArray43[local4][local9] * (this.anInt5381 - local34) + this.anIntArrayArray43[local4 + 1][local9] * local34 >> this.anInt5389;
		@Pc(97) int local97 = this.anIntArrayArray43[local4][local9 + 1] * (this.anInt5381 - local34) + this.anIntArrayArray43[local4 + 1][local9 + 1] * local34 >> this.anInt5389;
		return local67 * (this.anInt5381 - local41) + local97 * local41 >> this.anInt5389;
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(II)I")
	@Override
	public int method4685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray43[arg0][arg1];
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IILclient!da;[I[I[I)V")
	private void method4691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class88 local6 = this.aClass88ArrayArray1[arg0][arg1];
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
			@Pc(996) Class68 local996 = this.aClass68ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort17; local349++) {
					local24 = local996.anIntArray374[local349];
					local29 = local996.anIntArray373[local349];
					local34 = local996.anIntArray376[local349];
					local293 = this.anInt5395 + (this.anInt5393 * local24 + this.anInt5384 * local29 + this.anInt5394 * local34 >> 15);
					if (local293 <= this.aClass63_Sub1_8.anInt1613) {
						return;
					}
					local181 = this.anInt5391 + (this.anInt5388 * local24 + this.anInt5385 * local29 + this.anInt5387 * local34 >> 15);
					local237 = this.anInt5382 + (this.anInt5390 * local24 + this.anInt5383 * local29 + this.anInt5386 * local34 >> 15);
					arg3[local349] = arg2.anInt1062 + local181 * this.aClass63_Sub1_8.anInt1611 / local293;
					arg4[local349] = arg2.anInt1065 + local237 * this.aClass63_Sub1_8.anInt1598 / local293;
				}
				if (local996.aShortArray26 != null) {
					local209 = this.anIntArrayArray43[arg0][arg1];
					local265 = this.anIntArrayArray43[arg0 + 1][arg1];
					local321 = this.anIntArrayArray43[arg0][arg1 + 1];
					local377 = arg0 * this.anInt5381;
					local170 = local377 + this.anInt5381;
					local226 = arg1 * this.anInt5381;
					local282 = local226 + this.anInt5381;
					local338 = this.anInt5391 + (this.anInt5388 * local377 + this.anInt5385 * local209 + this.anInt5387 * local226 >> 15);
					local198 = this.anInt5382 + (this.anInt5390 * local377 + this.anInt5383 * local209 + this.anInt5386 * local226 >> 15);
					local254 = this.anInt5395 + (this.anInt5393 * local377 + this.anInt5384 * local209 + this.anInt5394 * local226 >> 15);
					local310 = this.anInt5391 + (this.anInt5388 * local170 + this.anInt5385 * local265 + this.anInt5387 * local226 >> 15);
					local366 = this.anInt5382 + (this.anInt5390 * local170 + this.anInt5383 * local265 + this.anInt5386 * local226 >> 15);
					local68 = this.anInt5395 + (this.anInt5393 * local170 + this.anInt5384 * local265 + this.anInt5394 * local226 >> 15);
					local91 = this.anInt5391 + (this.anInt5388 * local377 + this.anInt5385 * local321 + this.anInt5387 * local282 >> 15);
					local114 = this.anInt5382 + (this.anInt5390 * local377 + this.anInt5383 * local321 + this.anInt5386 * local282 >> 15);
					local137 = this.anInt5395 + (this.anInt5393 * local377 + this.anInt5384 * local321 + this.anInt5394 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort18; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray24[local46];
						@Pc(1354) short local1354 = local996.aShortArray27[local46];
						@Pc(1359) short local1359 = local996.aShortArray28[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean83 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt1063 || local1367 > arg2.anInt1063 || local1371 > arg2.anInt1063;
							@Pc(1427) short local1427 = local996.aShortArray26[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray375[local46];
								if (local1482 != -1) {
									arg2.method881(local1375, local1379, local1383, local1363, local1367, local1371, Static50.method860(local1482, local996.aShortArray25[local1349]), Static50.method860(local1482, local996.aShortArray25[local1354]), Static50.method860(local1482, local996.aShortArray25[local1359]));
								}
							} else {
								if (this.method4689(this.aClass63_Sub1_8.anInterface9_3.method139(local1427).aByte33)) {
									arg2.anInt1064 = 100;
								}
								arg2.method885(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray25[local1349], local996.aShortArray25[local1354], local996.aShortArray25[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt1064 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort18; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray24[local209];
					@Pc(1533) short local1533 = local996.aShortArray27[local209];
					@Pc(1538) short local1538 = local996.aShortArray28[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray375[local209];
						if (local310 != -1) {
							arg2.aBoolean83 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt1063 || local226 > arg2.anInt1063 || local282 > arg2.anInt1063;
							arg2.method881(local338, local198, local254, local170, local226, local282, Static50.method860(local310, local996.aShortArray25[local1528]), Static50.method860(local310, local996.aShortArray25[local1533]), Static50.method860(local310, local996.aShortArray25[local1538]));
						}
					}
				}
			}
		} else if ((local6.aByte27 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt5381;
			local24 = local19 + this.anInt5381;
			local29 = arg1 * this.anInt5381;
			local34 = local29 + this.anInt5381;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte27 & 0x1) == 0) {
				local46 = this.anIntArrayArray43[arg0][arg1];
				local51 = this.anIntArrayArray43[arg0 + 1][arg1];
				local148 = this.anIntArrayArray43[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray43[arg0][arg1 + 1];
				local68 = this.anInt5395 + (this.anInt5393 * local19 + this.anInt5384 * local46 + this.anInt5394 * local29 >> 15);
				if (local68 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local91 = this.anInt5395 + (this.anInt5393 * local24 + this.anInt5384 * local51 + this.anInt5394 * local29 >> 15);
				if (local91 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local114 = this.anInt5395 + (this.anInt5393 * local24 + this.anInt5384 * local148 + this.anInt5394 * local34 >> 15);
				if (local114 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local137 = this.anInt5395 + (this.anInt5393 * local19 + this.anInt5384 * local153 + this.anInt5394 * local34 >> 15);
				if (local137 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local170 = this.anInt5391 + (this.anInt5388 * local19 + this.anInt5385 * local46 + this.anInt5387 * local29 >> 15);
				local181 = arg2.anInt1062 + local170 * this.aClass63_Sub1_8.anInt1611 / local68;
				local198 = this.anInt5382 + (this.anInt5390 * local19 + this.anInt5383 * local46 + this.anInt5386 * local29 >> 15);
				local209 = arg2.anInt1065 + local198 * this.aClass63_Sub1_8.anInt1598 / local68;
				local226 = this.anInt5391 + (this.anInt5388 * local24 + this.anInt5385 * local51 + this.anInt5387 * local29 >> 15);
				local237 = arg2.anInt1062 + local226 * this.aClass63_Sub1_8.anInt1611 / local91;
				local254 = this.anInt5382 + (this.anInt5390 * local24 + this.anInt5383 * local51 + this.anInt5386 * local29 >> 15);
				local265 = arg2.anInt1065 + local254 * this.aClass63_Sub1_8.anInt1598 / local91;
				local282 = this.anInt5391 + (this.anInt5388 * local24 + this.anInt5385 * local148 + this.anInt5387 * local34 >> 15);
				local293 = arg2.anInt1062 + local282 * this.aClass63_Sub1_8.anInt1611 / local114;
				local310 = this.anInt5382 + (this.anInt5390 * local24 + this.anInt5383 * local148 + this.anInt5386 * local34 >> 15);
				local321 = arg2.anInt1065 + local310 * this.aClass63_Sub1_8.anInt1598 / local114;
				local338 = this.anInt5391 + (this.anInt5388 * local19 + this.anInt5385 * local153 + this.anInt5387 * local34 >> 15);
				local349 = arg2.anInt1062 + local338 * this.aClass63_Sub1_8.anInt1611 / local137;
				local366 = this.anInt5382 + (this.anInt5390 * local19 + this.anInt5383 * local153 + this.anInt5386 * local34 >> 15);
				local377 = arg2.anInt1065 + local366 * this.aClass63_Sub1_8.anInt1598 / local137;
			} else {
				local46 = this.anIntArrayArray43[arg0][arg1];
				local51 = this.anInt5384 * local46;
				local68 = this.anInt5395 + (this.anInt5393 * local19 + local51 + this.anInt5394 * local29 >> 15);
				if (local68 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local91 = this.anInt5395 + (this.anInt5393 * local24 + local51 + this.anInt5394 * local29 >> 15);
				if (local91 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local114 = this.anInt5395 + (this.anInt5393 * local24 + local51 + this.anInt5394 * local34 >> 15);
				if (local114 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local137 = this.anInt5395 + (this.anInt5393 * local19 + local51 + this.anInt5394 * local34 >> 15);
				if (local137 <= this.aClass63_Sub1_8.anInt1613) {
					return;
				}
				local148 = this.anInt5385 * local46;
				local153 = this.anInt5383 * local46;
				local170 = this.anInt5391 + (this.anInt5388 * local19 + local148 + this.anInt5387 * local29 >> 15);
				local181 = arg2.anInt1062 + local170 * this.aClass63_Sub1_8.anInt1611 / local68;
				local198 = this.anInt5382 + (this.anInt5390 * local19 + local153 + this.anInt5386 * local29 >> 15);
				local209 = arg2.anInt1065 + local198 * this.aClass63_Sub1_8.anInt1598 / local68;
				local226 = this.anInt5391 + (this.anInt5388 * local24 + local148 + this.anInt5387 * local29 >> 15);
				local237 = arg2.anInt1062 + local226 * this.aClass63_Sub1_8.anInt1611 / local91;
				local254 = this.anInt5382 + (this.anInt5390 * local24 + local153 + this.anInt5386 * local29 >> 15);
				local265 = arg2.anInt1065 + local254 * this.aClass63_Sub1_8.anInt1598 / local91;
				local282 = this.anInt5391 + (this.anInt5388 * local24 + local148 + this.anInt5387 * local34 >> 15);
				local293 = arg2.anInt1062 + local282 * this.aClass63_Sub1_8.anInt1611 / local114;
				local310 = this.anInt5382 + (this.anInt5390 * local24 + local153 + this.anInt5386 * local34 >> 15);
				local321 = arg2.anInt1065 + local310 * this.aClass63_Sub1_8.anInt1598 / local114;
				local338 = this.anInt5391 + (this.anInt5388 * local19 + local148 + this.anInt5387 * local34 >> 15);
				local349 = arg2.anInt1062 + local338 * this.aClass63_Sub1_8.anInt1611 / local137;
				local366 = this.anInt5382 + (this.anInt5390 * local19 + local153 + this.anInt5386 * local34 >> 15);
				local377 = arg2.anInt1065 + local366 * this.aClass63_Sub1_8.anInt1598 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean83 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt1063 || local349 > arg2.anInt1063 || local237 > arg2.anInt1063;
				if (local6.aShort42 >= 0) {
					if (this.method4689(this.aClass63_Sub1_8.anInterface9_3.method139(local6.aShort42).aByte33)) {
						arg2.anInt1064 = 100;
					}
					arg2.method885(local321, local377, local265, local293, local349, local237, local6.aShort44 & 0xFFFF, local6.aShort45 & 0xFFFF, local6.aShort43 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort42);
					arg2.anInt1064 = 0;
				} else {
					arg2.method881(local321, local377, local265, local293, local349, local237, local6.aShort44 & 0xFFFF, local6.aShort45 & 0xFFFF, local6.aShort43 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean83 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt1063 || local237 > arg2.anInt1063 || local349 > arg2.anInt1063;
				if (local6.aShort42 >= 0) {
					if (this.method4689(this.aClass63_Sub1_8.anInterface9_3.method139(local6.aShort42).aByte33)) {
						arg2.anInt1064 = 100;
					}
					arg2.method885(local209, local265, local377, local181, local237, local349, local6.aShort41 & 0xFFFF, local6.aShort43 & 0xFFFF, local6.aShort45 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort42);
					arg2.anInt1064 = 0;
					return;
				}
				arg2.method881(local209, local265, local377, local181, local237, local349, local6.aShort41 & 0xFFFF, local6.aShort43 & 0xFFFF, local6.aShort45 & 0xFFFF);
			}
		}
	}
}
