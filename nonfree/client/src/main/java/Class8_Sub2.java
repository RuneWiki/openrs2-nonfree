import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
	private int anInt4764;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "[[Lclient!em;")
	private Class65[][] aClass65ArrayArray1;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "[[Lclient!bl;")
	private Class28[][] aClass28ArrayArray1;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "[[Lclient!ea;")
	private Class58[][] aClass58ArrayArray1;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
	private int anInt4765;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
	private int anInt4766;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
	private int anInt4767;

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
	private int anInt4769;

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "[[Lclient!rh;")
	private Class178[][] aClass178ArrayArray1;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
	private int anInt4770;

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
	private int anInt4771;

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
	private int anInt4772;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
	private int anInt4773;

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
	private int anInt4774;

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
	private int anInt4775;

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
	private int anInt4776;

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "Lclient!vn;")
	private final Class89_Sub2 aClass89_Sub2_10;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
	private final int anInt4763;

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "[[I")
	public final int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "[[I")
	private final int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	private final int anInt4762;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
	private int anInt4768;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!vn;IIII[[I[[II)V")
	public Class8_Sub2(@OriginalArg(0) Class89_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass89_Sub2_10 = arg0;
		this.anInt4763 = arg2;
		this.anIntArrayArray41 = arg5;
		this.anIntArrayArray40 = arg6;
		this.anInt4762 = arg7;
		this.anInt4768 = 0;
		while (arg7 > 1) {
			this.anInt4768++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray14 = new byte[arg3 + 1][arg4 + 1];
		@Pc(50) int local50 = this.aClass89_Sub2_10.anInt6417 >> 9;
		for (@Pc(52) int local52 = 1; local52 < arg4; local52++) {
			for (@Pc(55) int local55 = 1; local55 < arg3; local55++) {
				@Pc(76) int local76 = this.anIntArrayArray41[local55 + 1][local52] - this.anIntArrayArray41[local55 - 1][local52];
				@Pc(94) int local94 = this.anIntArrayArray41[local55][local52 + 1] - this.anIntArrayArray41[local55][local52 - 1];
				@Pc(107) int local107 = (int) Math.sqrt((double) (local76 * local76 + local94 * local94 + 65536));
				@Pc(113) int local113 = (local76 << 8) / local107;
				@Pc(117) int local117 = -65536 / local107;
				@Pc(123) int local123 = (local94 << 8) / local107;
				@Pc(145) int local145 = local50 + (this.aClass89_Sub2_10.anInt6415 * local113 + this.aClass89_Sub2_10.anInt6401 * local117 + this.aClass89_Sub2_10.anInt6425 * local123 >> 17);
				local145 >>= 0x1;
				if (local145 < 2) {
					local145 = 2;
				} else if (local145 > 126) {
					local145 = 126;
				}
				this.aByteArrayArray14[local55][local52] = (byte) local145;
			}
		}
		this.aByteArrayArray15 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZLclient!wl;[I[I[I)V")
	private void method4176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class217 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class58 local6 = this.aClass58ArrayArray1[arg0][arg1];
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
		@Pc(620) int local620;
		if (local6 == null) {
			@Pc(1450) Class28 local1450 = this.aClass28ArrayArray1[arg0][arg1];
			if (local1450 != null) {
				for (local423 = 0; local423 < local1450.aShort11; local423++) {
					@Pc(1460) short local1460 = local1450.aShortArray12[local423];
					local29 = local1450.aShortArray15[local423];
					@Pc(1470) short local1470 = local1450.aShortArray16[local423];
					local367 = this.anInt4766 + (this.anInt4771 * local1460 + this.anInt4775 * local29 + this.anInt4765 * local1470 >> 15);
					if (local367 <= this.aClass89_Sub2_10.anInt6407) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass89_Sub2_10.anInt6408;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1450.aShortArray13[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass89_Sub2_10.aBoolean462) {
						local283 = local367 - this.aClass89_Sub2_10.anInt6408;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt4776 + (this.anInt4770 * local1460 + this.anInt4769 * local29 + this.anInt4767 * local1470 >> 15);
					local311 = this.anInt4774 + (this.anInt4773 * local1460 + this.anInt4764 * local29 + this.anInt4772 * local1470 >> 15);
					arg4[local423] = arg3.anInt6659 + local255 * this.aClass89_Sub2_10.anInt6412 / local367;
					arg5[local423] = arg3.anInt6660 + local311 * this.aClass89_Sub2_10.anInt6424 / local367;
				}
				if (local1450.aShortArray11 != null) {
					local283 = this.anIntArrayArray41[arg0][arg1];
					local339 = this.anIntArrayArray41[arg0 + 1][arg1];
					local395 = this.anIntArrayArray41[arg0][arg1 + 1];
					local451 = arg0 * this.anInt4762;
					local244 = local451 + this.anInt4762;
					local300 = arg1 * this.anInt4762;
					local356 = local300 + this.anInt4762;
					local412 = this.anInt4776 + (this.anInt4770 * local451 + this.anInt4769 * local283 + this.anInt4767 * local300 >> 15);
					local272 = this.anInt4774 + (this.anInt4773 * local451 + this.anInt4764 * local283 + this.anInt4772 * local300 >> 15);
					local328 = this.anInt4766 + (this.anInt4771 * local451 + this.anInt4775 * local283 + this.anInt4765 * local300 >> 15);
					local384 = this.anInt4776 + (this.anInt4770 * local244 + this.anInt4769 * local339 + this.anInt4767 * local300 >> 15);
					local440 = this.anInt4774 + (this.anInt4773 * local244 + this.anInt4764 * local339 + this.anInt4772 * local300 >> 15);
					local78 = this.anInt4766 + (this.anInt4771 * local244 + this.anInt4775 * local339 + this.anInt4765 * local300 >> 15);
					local101 = this.anInt4776 + (this.anInt4770 * local451 + this.anInt4769 * local395 + this.anInt4767 * local356 >> 15);
					local124 = this.anInt4774 + (this.anInt4773 * local451 + this.anInt4764 * local395 + this.anInt4772 * local356 >> 15);
					local147 = this.anInt4766 + (this.anInt4771 * local451 + this.anInt4775 * local395 + this.anInt4765 * local356 >> 15);
					for (local36 = 0; local36 < local1450.aShort10; local36++) {
						local38 = local36 * 3;
						local40 = local38 + 1;
						local42 = local40 + 1;
						local163 = arg4[local38];
						local56 = arg4[local40];
						local61 = arg4[local42];
						local222 = arg5[local38];
						local227 = arg5[local40];
						local620 = arg5[local42];
						@Pc(1910) int local1910 = arg6[local38] + arg6[local40] + arg6[local42];
						if ((local163 - local56) * (local620 - local227) - (local222 - local227) * (local61 - local56) > 0) {
							arg3.aBoolean490 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt6662 || local56 > arg3.anInt6662 || local61 > arg3.anInt6662;
							@Pc(1954) short local1954 = local1450.aShortArray11[local36];
							if (local1910 < 765) {
								if (local1954 != -1 && this.method4177(this.aClass89_Sub2_10.anInterface6_6.method5614(local1954).aByte5)) {
									arg3.anInt6658 = 100;
								}
								if (local1910 > 0) {
									if (local1954 != -1) {
										arg3.method5662(local222, local227, local620, local163, local56, local61, this.aClass89_Sub2_10.anInt6410, arg6[local38], arg6[local40], arg6[local42], local1450.anIntArray86[local38], local1450.anIntArray86[local40], local1450.anIntArray86[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
									} else if ((local1450.anIntArray86[local38] & 0xFFFFFF) != 0) {
										arg3.method5674(local222, local227, local620, local163, local56, local61, Static77.method1576(local1450.anIntArray86[local38], arg6[local38] << 24 | this.aClass89_Sub2_10.anInt6410), Static77.method1576(local1450.anIntArray86[local40], arg6[local40] << 24 | this.aClass89_Sub2_10.anInt6410), Static77.method1576(local1450.anIntArray86[local42], arg6[local42] << 24 | this.aClass89_Sub2_10.anInt6410));
									}
								} else if (local1954 != -1) {
									arg3.method5660(local222, local227, local620, local163, local56, local61, local1450.anIntArray86[local38], local1450.anIntArray86[local40], local1450.anIntArray86[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
								} else if ((local1450.anIntArray86[local38] & 0xFFFFFF) != 0) {
									arg3.method5674(local222, local227, local620, local163, local56, local61, local1450.anIntArray86[local38], local1450.anIntArray86[local40], local1450.anIntArray86[local42]);
								}
								arg3.anInt6658 = 0;
							} else {
								arg3.method5661(local222, local227, local620, local163, local56, local61, this.aClass89_Sub2_10.anInt6410);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1450.aShort10; local283++) {
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
						arg3.aBoolean490 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt6662 || local300 > arg3.anInt6662 || local356 > arg3.anInt6662;
						if (local384 >= 765) {
							arg3.method5661(local412, local272, local328, local244, local300, local356, this.aClass89_Sub2_10.anInt6410);
						} else if (local384 > 0) {
							if ((local1450.anIntArray86[local339] & 0xFFFFFF) != 0) {
								arg3.method5674(local412, local272, local328, local244, local300, local356, Static133.method2670(arg6[local339], this.aClass89_Sub2_10.anInt6410, local1450.anIntArray86[local339]), Static133.method2670(arg6[local395], this.aClass89_Sub2_10.anInt6410, local1450.anIntArray86[local395]), Static133.method2670(arg6[local451], this.aClass89_Sub2_10.anInt6410, local1450.anIntArray86[local451]));
							}
						} else if ((local1450.anIntArray86[local339] & 0xFFFFFF) != 0) {
							arg3.method5674(local412, local272, local328, local244, local300, local356, local1450.anIntArray86[local339], local1450.anIntArray86[local395], local1450.anIntArray86[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte32 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt4762;
			@Pc(24) int local24 = local19 + this.anInt4762;
			local29 = arg1 * this.anInt4762;
			@Pc(34) int local34 = local29 + this.anInt4762;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte32 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray41[arg0][arg1];
				local61 = this.anIntArrayArray41[arg0 + 1][arg1];
				local222 = this.anIntArrayArray41[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray41[arg0][arg1 + 1];
				local78 = this.anInt4766 + (this.anInt4771 * local19 + this.anInt4775 * local56 + this.anInt4765 * local29 >> 15);
				if (local78 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local101 = this.anInt4766 + (this.anInt4771 * local24 + this.anInt4775 * local61 + this.anInt4765 * local29 >> 15);
				if (local101 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local124 = this.anInt4766 + (this.anInt4771 * local24 + this.anInt4775 * local222 + this.anInt4765 * local34 >> 15);
				if (local124 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local147 = this.anInt4766 + (this.anInt4771 * local19 + this.anInt4775 * local227 + this.anInt4765 * local34 >> 15);
				if (local147 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local620 = this.anIntArrayArray40[arg0][arg1] * local163 / 255;
						if (local620 > 0) {
							local56 -= local620;
						}
					}
					local163 = local101 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local620 = this.anIntArrayArray40[arg0 + 1][arg1] * local163 / 255;
						if (local620 > 0) {
							local61 -= local620;
						}
					}
					local163 = local124 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local620 = this.anIntArrayArray40[arg0 + 1][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local222 -= local620;
						}
					}
					local163 = local147 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local620 = this.anIntArrayArray40[arg0][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local227 -= local620;
						}
					}
				} else if (this.aClass89_Sub2_10.aBoolean462) {
					local163 = local78 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt4776 + (this.anInt4770 * local19 + this.anInt4769 * local56 + this.anInt4767 * local29 >> 15);
				local255 = arg3.anInt6659 + local244 * this.aClass89_Sub2_10.anInt6412 / local78;
				local272 = this.anInt4774 + (this.anInt4773 * local19 + this.anInt4764 * local56 + this.anInt4772 * local29 >> 15);
				local283 = arg3.anInt6660 + local272 * this.aClass89_Sub2_10.anInt6424 / local78;
				local300 = this.anInt4776 + (this.anInt4770 * local24 + this.anInt4769 * local61 + this.anInt4767 * local29 >> 15);
				local311 = arg3.anInt6659 + local300 * this.aClass89_Sub2_10.anInt6412 / local101;
				local328 = this.anInt4774 + (this.anInt4773 * local24 + this.anInt4764 * local61 + this.anInt4772 * local29 >> 15);
				local339 = arg3.anInt6660 + local328 * this.aClass89_Sub2_10.anInt6424 / local101;
				local356 = this.anInt4776 + (this.anInt4770 * local24 + this.anInt4769 * local222 + this.anInt4767 * local34 >> 15);
				local367 = arg3.anInt6659 + local356 * this.aClass89_Sub2_10.anInt6412 / local124;
				local384 = this.anInt4774 + (this.anInt4773 * local24 + this.anInt4764 * local222 + this.anInt4772 * local34 >> 15);
				local395 = arg3.anInt6660 + local384 * this.aClass89_Sub2_10.anInt6424 / local124;
				local412 = this.anInt4776 + (this.anInt4770 * local19 + this.anInt4769 * local227 + this.anInt4767 * local34 >> 15);
				local423 = arg3.anInt6659 + local412 * this.aClass89_Sub2_10.anInt6412 / local147;
				local440 = this.anInt4774 + (this.anInt4773 * local19 + this.anInt4764 * local227 + this.anInt4772 * local34 >> 15);
				local451 = arg3.anInt6660 + local440 * this.aClass89_Sub2_10.anInt6424 / local147;
			} else {
				local56 = this.anIntArrayArray41[arg0][arg1];
				local61 = this.anInt4775 * local56;
				local78 = this.anInt4766 + (this.anInt4771 * local19 + local61 + this.anInt4765 * local29 >> 15);
				if (local78 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local101 = this.anInt4766 + (this.anInt4771 * local24 + local61 + this.anInt4765 * local29 >> 15);
				if (local101 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local124 = this.anInt4766 + (this.anInt4771 * local24 + local61 + this.anInt4765 * local34 >> 15);
				if (local124 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local147 = this.anInt4766 + (this.anInt4771 * local19 + local61 + this.anInt4765 * local34 >> 15);
				if (local147 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				if (this.aClass89_Sub2_10.aBoolean462) {
					local163 = local78 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass89_Sub2_10.anInt6408;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt4769 * local56;
				local227 = this.anInt4764 * local56;
				local244 = this.anInt4776 + (this.anInt4770 * local19 + local222 + this.anInt4767 * local29 >> 15);
				local255 = arg3.anInt6659 + local244 * this.aClass89_Sub2_10.anInt6412 / local78;
				local272 = this.anInt4774 + (this.anInt4773 * local19 + local227 + this.anInt4772 * local29 >> 15);
				local283 = arg3.anInt6660 + local272 * this.aClass89_Sub2_10.anInt6424 / local78;
				local300 = this.anInt4776 + (this.anInt4770 * local24 + local222 + this.anInt4767 * local29 >> 15);
				local311 = arg3.anInt6659 + local300 * this.aClass89_Sub2_10.anInt6412 / local101;
				local328 = this.anInt4774 + (this.anInt4773 * local24 + local227 + this.anInt4772 * local29 >> 15);
				local339 = arg3.anInt6660 + local328 * this.aClass89_Sub2_10.anInt6424 / local101;
				local356 = this.anInt4776 + (this.anInt4770 * local24 + local222 + this.anInt4767 * local34 >> 15);
				local367 = arg3.anInt6659 + local356 * this.aClass89_Sub2_10.anInt6412 / local124;
				local384 = this.anInt4774 + (this.anInt4773 * local24 + local227 + this.anInt4772 * local34 >> 15);
				local395 = arg3.anInt6660 + local384 * this.aClass89_Sub2_10.anInt6424 / local124;
				local412 = this.anInt4776 + (this.anInt4770 * local19 + local222 + this.anInt4767 * local34 >> 15);
				local423 = arg3.anInt6659 + local412 * this.aClass89_Sub2_10.anInt6412 / local147;
				local440 = this.anInt4774 + (this.anInt4773 * local19 + local227 + this.anInt4772 * local34 >> 15);
				local451 = arg3.anInt6660 + local440 * this.aClass89_Sub2_10.anInt6424 / local147;
			}
			@Pc(1062) boolean local1062 = local6.aShort37 != -1 && this.method4177(this.aClass89_Sub2_10.anInterface6_6.method5614(local6.aShort37).aByte5);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean490 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt6662 || local423 > arg3.anInt6662 || local311 > arg3.anInt6662;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt6658 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort37 >= 0) {
							arg3.method5662(local395, local451, local339, local367, local423, local311, this.aClass89_Sub2_10.anInt6410, local40, local42, local38, local6.anInt1668, local6.anInt1669, local6.anInt1666, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort37);
						} else {
							arg3.method5674(local395, local451, local339, local367, local423, local311, Static77.method1576(local6.anInt1668, local40 << 24 | this.aClass89_Sub2_10.anInt6410), Static77.method1576(local6.anInt1669, local42 << 24 | this.aClass89_Sub2_10.anInt6410), Static77.method1576(local6.anInt1666, local38 << 24 | this.aClass89_Sub2_10.anInt6410));
						}
					} else if (local6.aShort37 >= 0) {
						arg3.method5660(local395, local451, local339, local367, local423, local311, local6.anInt1668, local6.anInt1669, local6.anInt1666, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort37);
					} else {
						arg3.method5674(local395, local451, local339, local367, local423, local311, local6.anInt1668, local6.anInt1669, local6.anInt1666);
					}
					arg3.anInt6658 = 0;
				} else {
					arg3.method5661(local395, local451, local339, local367, local423, local311, this.aClass89_Sub2_10.anInt6410);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean490 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt6662 || local311 > arg3.anInt6662 || local423 > arg3.anInt6662;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt6658 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort37 >= 0) {
							arg3.method5662(local283, local339, local451, local255, local311, local423, this.aClass89_Sub2_10.anInt6410, local36, local38, local42, local6.anInt1667, local6.anInt1666, local6.anInt1669, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort37);
						} else {
							arg3.method5674(local283, local339, local451, local255, local311, local423, Static77.method1576(local6.anInt1667, local36 << 24 | this.aClass89_Sub2_10.anInt6410), Static77.method1576(local6.anInt1666, local38 << 24 | this.aClass89_Sub2_10.anInt6410), Static77.method1576(local6.anInt1669, local42 << 24 | this.aClass89_Sub2_10.anInt6410));
						}
					} else if (local6.aShort37 >= 0) {
						arg3.method5660(local283, local339, local451, local255, local311, local423, local6.anInt1667, local6.anInt1666, local6.anInt1669, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort37);
					} else {
						arg3.method5674(local283, local339, local451, local255, local311, local423, local6.anInt1667, local6.anInt1666, local6.anInt1669);
					}
					arg3.anInt6658 = 0;
					return;
				}
				arg3.method5661(local283, local339, local451, local255, local311, local423, this.aClass89_Sub2_10.anInt6410);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ug;IIIIZ)Z")
	@Override
	public boolean method4158(@OriginalArg(0) Class7_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	@Override
	public void method4168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class37 local4 = this.aClass89_Sub2_10.method5498(Thread.currentThread());
		local4.aClass217_2.anInt6658 = 0;
		if (this.aClass58ArrayArray1 != null) {
			this.method4176(arg0, arg1, this.aClass89_Sub2_10.aBoolean463, local4.aClass217_2, local4.anIntArray175, local4.anIntArray164, local4.anIntArray154);
		} else if (this.aClass178ArrayArray1 != null) {
			this.method4179(arg0, arg1, local4.aClass217_2, local4.anIntArray175, local4.anIntArray164, local4.anIntArray154);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!ug;)Lclient!ug;")
	@Override
	public Class7_Sub1_Sub4 method4165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7_Sub1_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		if (this.aClass58ArrayArray1 == null) {
			this.aClass58ArrayArray1 = new Class58[super.anInt4755][super.anInt4760];
			this.aClass28ArrayArray1 = new Class28[super.anInt4755][super.anInt4760];
		} else if (this.aClass178ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg5.length; local32++) {
			if (arg5[local32] == -1) {
				arg5[local32] = 0;
			} else {
				arg5[local32] = Static200.anIntArray548[Static110.method2132(arg5[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg6 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg6.length; local68++) {
				if (arg6[local68] == -1) {
					arg6[local68] = 0;
				} else {
					arg6[local68] = Static200.anIntArray548[Static110.method2132(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
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
					if (local104 != -1 && arg5[local104] != arg5[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == this.anInt4762 && arg4[local116] == 0) {
					if (local106 != -1 && arg5[local106] != arg5[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt4762 && arg4[local116] == this.anInt4762) {
					if (local108 != -1 && arg5[local108] != arg5[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt4762) {
					if (local110 != -1 && arg5[local110] != arg5[local116]) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt4762 && arg2[local244] != arg2[0] - this.anInt4762) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt4762 && arg4[local244] != arg4[0] - this.anInt4762) {
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
		@Pc(531) int local531;
		if (local102) {
			@Pc(334) Class58 local334 = new Class58();
			local244 = arg5[0];
			local342 = arg7[0];
			if (arg6 != null) {
				local334.anInt1670 = arg6[0] >> 8;
				if (local244 == 0) {
					local334.aByte32 = (byte) (local334.aByte32 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray41[arg0][arg1] == this.anIntArrayArray41[arg0 + 1][arg1] && this.anIntArrayArray41[arg0][arg1] == this.anIntArrayArray41[arg0 + 1][arg1 + 1] && this.anIntArrayArray41[arg0][arg1] == this.anIntArrayArray41[arg0][arg1 + 1]) {
				local334.aByte32 = (byte) (local334.aByte32 | 0x1);
			}
			if (local342 == -1 || (local334.aByte32 & 0x2) != 0 || this.aClass89_Sub2_10.anInterface6_6.method5614(local342).aBoolean16) {
				if (this.anIntArrayArray40 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray40[arg0][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt1667 = Static133.method2670(local531, arg9, Static365.method4181(arg5[local104] >> 8, this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]));
				if (local334.anInt1670 != 0) {
					local334.anInt1667 |= this.aByteArrayArray15[arg0][arg1] + 255 - this.aByteArrayArray14[arg0][arg1] << 25;
				}
				if (this.anIntArrayArray40 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray40[arg0 + 1][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt1666 = Static133.method2670(local531, arg9, Static365.method4181(arg5[local106] >> 8, this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]));
				if (local334.anInt1670 != 0) {
					local334.anInt1666 |= this.aByteArrayArray15[arg0 + 1][arg1] + 255 - this.aByteArrayArray14[arg0 + 1][arg1] << 25;
				}
				if (this.anIntArrayArray40 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray40[arg0 + 1][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt1668 = Static133.method2670(local531, arg9, Static365.method4181(arg5[local108] >> 8, this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]));
				if (local334.anInt1670 != 0) {
					local334.anInt1668 |= this.aByteArrayArray15[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray14[arg0 + 1][arg1 + 1] << 25;
				}
				if (this.anIntArrayArray40 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray40[arg0][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt1669 = Static133.method2670(local531, arg9, Static365.method4181(arg5[local110] >> 8, this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]));
				if (local334.anInt1670 != 0) {
					local334.anInt1669 |= this.aByteArrayArray15[arg0][arg1 + 1] + 255 - this.aByteArrayArray14[arg0][arg1 + 1] << 25;
				}
				local334.aShort37 = -1;
			} else {
				local334.anInt1667 = this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1];
				local334.anInt1666 = this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1];
				local334.anInt1668 = this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1];
				local334.anInt1669 = this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1];
				local334.aShort37 = (short) local342;
			}
			this.aClass58ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(886) Class28 local886 = new Class28();
		local886.aShort11 = (short) arg2.length;
		local886.aShort10 = (short) (arg2.length / 3);
		local886.aShortArray12 = new short[local886.aShort11];
		local886.aShortArray15 = new short[local886.aShort11];
		local886.aShortArray16 = new short[local886.aShort11];
		local886.anIntArray86 = new int[local886.aShort11];
		if (this.anIntArrayArray40 != null) {
			local886.aShortArray13 = new short[local886.aShort11];
		}
		@Pc(957) int local957;
		@Pc(1078) int local1078;
		@Pc(1125) int local1125;
		@Pc(1225) int local1225;
		@Pc(1344) int local1344;
		for (local244 = 0; local244 < local886.aShort11; local244++) {
			local342 = arg2[local244];
			local531 = arg4[local244];
			if (local342 == 0 && local531 == 0) {
				local957 = this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1];
			} else if (local342 == 0 && local531 == this.anInt4762) {
				local957 = this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1];
			} else if (local342 == this.anInt4762 && local531 == this.anInt4762) {
				local957 = this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt4762 && local531 == 0) {
				local957 = this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1];
			} else {
				local1078 = (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]) * (this.anInt4762 - local342) + (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]) * local342;
				local1125 = (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]) * (this.anInt4762 - local342) + (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]) * local342;
				local957 = local1078 * (this.anInt4762 - local531) + local1125 * local531 >> this.anInt4768 * 2;
			}
			@Pc(1149) short local1149 = (short) ((arg0 << this.anInt4768) + local342);
			@Pc(1157) short local1157 = (short) ((arg1 << this.anInt4768) + local531);
			local886.aShortArray12[local244] = local1149;
			local886.aShortArray16[local244] = local1157;
			local886.aShortArray15[local244] = (short) (this.method4169(local1149, local1157) + (arg3 == null ? 0 : arg3[local244]));
			if (local957 < 0) {
				local957 = 0;
			}
			if (arg7[local244] != -1 && !this.aClass89_Sub2_10.anInterface6_6.method5614(arg7[local244]).aBoolean16) {
				local886.anIntArray86[local244] = local957;
			} else if (arg5[local244] != 0) {
				local1225 = 0;
				if (this.anIntArrayArray40 != null) {
					@Pc(1241) int local1241;
					if (local342 == 0 && local531 == 0) {
						local1241 = this.anIntArrayArray40[arg0][arg1];
					} else if (local342 == 0 && local531 == this.anInt4762) {
						local1241 = this.anIntArrayArray40[arg0][arg1 + 1];
					} else if (local342 == this.anInt4762 && local531 == this.anInt4762) {
						local1241 = this.anIntArrayArray40[arg0 + 1][arg1 + 1];
					} else if (local342 == this.anInt4762 && local531 == 0) {
						local1241 = this.anIntArrayArray40[arg0 + 1][arg1];
					} else {
						@Pc(1317) int local1317 = this.anIntArrayArray40[arg0][arg1] * (this.anInt4762 - local342) + this.anIntArrayArray40[arg0 + 1][arg1] * local342;
						local1344 = this.anIntArrayArray40[arg0][arg1 + 1] * (this.anInt4762 - local342) + this.anIntArrayArray40[arg0 + 1][arg1 + 1] * local342;
						local1241 = local1317 * (this.anInt4762 - local531) + local1344 * local531 >> this.anInt4768 * 2;
					}
					local886.aShortArray13[local244] = (short) local1241;
					if (arg10 != 0) {
						local1225 = local1241 * 255 / arg10;
						if (local1225 < 0) {
							local1225 = 0;
						} else if (local1225 > 255) {
							local1225 = 255;
						}
					}
				}
				local886.anIntArray86[local244] = Static133.method2670(local1225, arg9, Static365.method4181(arg5[local244] >> 8, local957));
				if (arg6 != null) {
					local886.anIntArray86[local244] |= local957 << 25;
				}
			} else if (arg6 == null) {
				local886.anIntArray86[local244] = 0;
			} else {
				local886.anIntArray86[local244] = local957 << 25;
			}
		}
		@Pc(1424) boolean local1424 = false;
		for (local531 = 0; local531 < local886.aShort10; local531++) {
			if (arg7[local531 * 3] != -1 && !this.aClass89_Sub2_10.anInterface6_6.method5614(arg7[local531 * 3]).aBoolean16) {
				local1424 = true;
			}
		}
		if (arg6 != null) {
			local886.anIntArray87 = new int[local886.aShort10];
		}
		if (local1424) {
			local886.aShortArray11 = new short[local886.aShort10];
			local886.aShortArray14 = new short[local886.aShort10];
		}
		for (local957 = 0; local957 < local886.aShort10; local957++) {
			local1078 = local957 * 3;
			if (arg6 != null && arg6[local1078] != 0) {
				local886.anIntArray87[local957] = arg6[local1078] >> 8;
			}
			if (local1424) {
				local1125 = local1078 + 1;
				local1225 = local1125 + 1;
				@Pc(1506) boolean local1506 = false;
				@Pc(1508) boolean local1508 = true;
				local1344 = arg7[local1078];
				if (local1344 == -1 || this.aClass89_Sub2_10.anInterface6_6.method5614(local1344).aBoolean16) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1125];
				if (local1344 == -1 || this.aClass89_Sub2_10.anInterface6_6.method5614(local1344).aBoolean16) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1225];
				if (local1344 == -1 || this.aClass89_Sub2_10.anInterface6_6.method5614(local1344).aBoolean16) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				if (local1508) {
					local886.aShortArray11[local957] = (short) local1344;
					local886.aShortArray14[local957] = (short) arg8[local1078];
				} else {
					if (local1506) {
						local1344 = arg7[local1078];
						if (local1344 != -1 && !this.aClass89_Sub2_10.anInterface6_6.method5614(local1344).aBoolean16) {
							local886.anIntArray86[local1078] = Static200.anIntArray548[Static110.method2132(this.aClass89_Sub2_10.anInterface6_6.method5614(local1344).aShort7 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1125];
						if (local1344 != -1 && !this.aClass89_Sub2_10.anInterface6_6.method5614(local1344).aBoolean16) {
							local886.anIntArray86[local1125] = Static200.anIntArray548[Static110.method2132(this.aClass89_Sub2_10.anInterface6_6.method5614(local1344).aShort7 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1225];
						if (local1344 != -1 && !this.aClass89_Sub2_10.anInterface6_6.method5614(local1344).aBoolean16) {
							local886.anIntArray86[local1225] = Static200.anIntArray548[Static110.method2132(this.aClass89_Sub2_10.anInterface6_6.method5614(local1344).aShort7 & 0xFFFF) & 0xFFFF];
						}
					}
					local886.aShortArray11[local957] = -1;
				}
			}
		}
		this.aClass28ArrayArray1[arg0][arg1] = local886;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)Z")
	private boolean method4177(@OriginalArg(0) int arg0) {
		if ((this.anInt4763 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII[[ZLclient!wl;[I[I)V")
	private void method4178(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class217 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean489 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass178ArrayArray1[local22][local25] != null) {
						@Pc(50) Class178 local50 = this.aClass178ArrayArray1[local22][local25];
						if (local50.aShort74 != -1 && (local50.aByte59 & 0x2) == 0 && local50.anInt5388 == -1) {
							local69 = this.aClass89_Sub2_10.method5495(local50.aShort74);
							arg5.method5669(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static351.method5641(local69, local50.aShort72 & 0xFFFF), Static351.method5641(local69, local50.aShort73 & 0xFFFF), Static351.method5641(local69, local50.aShort71 & 0xFFFF));
							arg5.method5669(local20, local20, local20 - 4, local16, local16 + 4, local16, Static351.method5641(local69, local50.aShort70 & 0xFFFF), Static351.method5641(local69, local50.aShort71 & 0xFFFF), Static351.method5641(local69, local50.aShort73 & 0xFFFF));
						} else if (local50.anInt5388 == -1) {
							arg5.method5669(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort72 & 0xFFFF, local50.aShort73 & 0xFFFF, local50.aShort71 & 0xFFFF);
							arg5.method5669(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort70 & 0xFFFF, local50.aShort71 & 0xFFFF, local50.aShort73 & 0xFFFF);
						} else {
							local69 = local50.anInt5388;
							arg5.method5669(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method5669(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass65ArrayArray1[local22][local25] != null) {
						@Pc(249) Class65 local249 = this.aClass65ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort38; local69++) {
							arg6[local69] = local16 + (local249.anIntArray265[local69] - local22 * this.anInt4762) * 4 / this.anInt4762;
							arg7[local69] = local20 - (local249.anIntArray266[local69] - local25 * this.anInt4762) * 4 / this.anInt4762;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort39; local297++) {
							@Pc(303) short local303 = local249.aShortArray28[local297];
							@Pc(308) short local308 = local249.aShortArray31[local297];
							@Pc(313) short local313 = local249.aShortArray30[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray264 != null && local249.anIntArray264[local297] != -1) {
								local351 = local249.anIntArray264[local297];
								arg5.method5669(local329, local333, local337, local317, local321, local325, Static351.method5641(local351, local249.aShortArray29[local303]), Static351.method5641(local351, local249.aShortArray29[local308]), Static351.method5641(local351, local249.aShortArray29[local313]));
							} else if (local249.aShortArray27 == null || local249.aShortArray27[local297] == -1) {
								local351 = local249.anIntArray267[local297];
								arg5.method5669(local329, local333, local337, local317, local321, local325, Static351.method5641(local351, local249.aShortArray29[local303]), Static351.method5641(local351, local249.aShortArray29[local308]), Static351.method5641(local351, local249.aShortArray29[local313]));
							} else {
								local351 = this.aClass89_Sub2_10.method5495(local249.aShortArray27[local297]);
								arg5.method5669(local329, local333, local337, local317, local321, local325, Static351.method5641(local351, local249.aShortArray29[local303]), Static351.method5641(local351, local249.aShortArray29[local308]), Static351.method5641(local351, local249.aShortArray29[local313]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean489 = true;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!wl;[I[I[I)V")
	private void method4179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class217 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class178 local6 = this.aClass178ArrayArray1[arg0][arg1];
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
			@Pc(996) Class65 local996 = this.aClass65ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort38; local349++) {
					local24 = local996.anIntArray265[local349];
					local29 = local996.anIntArray268[local349];
					local34 = local996.anIntArray266[local349];
					local293 = this.anInt4766 + (this.anInt4771 * local24 + this.anInt4775 * local29 + this.anInt4765 * local34 >> 15);
					if (local293 <= this.aClass89_Sub2_10.anInt6407) {
						return;
					}
					local181 = this.anInt4776 + (this.anInt4770 * local24 + this.anInt4769 * local29 + this.anInt4767 * local34 >> 15);
					local237 = this.anInt4774 + (this.anInt4773 * local24 + this.anInt4764 * local29 + this.anInt4772 * local34 >> 15);
					arg3[local349] = arg2.anInt6659 + local181 * this.aClass89_Sub2_10.anInt6412 / local293;
					arg4[local349] = arg2.anInt6660 + local237 * this.aClass89_Sub2_10.anInt6424 / local293;
				}
				if (local996.aShortArray27 != null) {
					local209 = this.anIntArrayArray41[arg0][arg1];
					local265 = this.anIntArrayArray41[arg0 + 1][arg1];
					local321 = this.anIntArrayArray41[arg0][arg1 + 1];
					local377 = arg0 * this.anInt4762;
					local170 = local377 + this.anInt4762;
					local226 = arg1 * this.anInt4762;
					local282 = local226 + this.anInt4762;
					local338 = this.anInt4776 + (this.anInt4770 * local377 + this.anInt4769 * local209 + this.anInt4767 * local226 >> 15);
					local198 = this.anInt4774 + (this.anInt4773 * local377 + this.anInt4764 * local209 + this.anInt4772 * local226 >> 15);
					local254 = this.anInt4766 + (this.anInt4771 * local377 + this.anInt4775 * local209 + this.anInt4765 * local226 >> 15);
					local310 = this.anInt4776 + (this.anInt4770 * local170 + this.anInt4769 * local265 + this.anInt4767 * local226 >> 15);
					local366 = this.anInt4774 + (this.anInt4773 * local170 + this.anInt4764 * local265 + this.anInt4772 * local226 >> 15);
					local68 = this.anInt4766 + (this.anInt4771 * local170 + this.anInt4775 * local265 + this.anInt4765 * local226 >> 15);
					local91 = this.anInt4776 + (this.anInt4770 * local377 + this.anInt4769 * local321 + this.anInt4767 * local282 >> 15);
					local114 = this.anInt4774 + (this.anInt4773 * local377 + this.anInt4764 * local321 + this.anInt4772 * local282 >> 15);
					local137 = this.anInt4766 + (this.anInt4771 * local377 + this.anInt4775 * local321 + this.anInt4765 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort39; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray28[local46];
						@Pc(1354) short local1354 = local996.aShortArray31[local46];
						@Pc(1359) short local1359 = local996.aShortArray30[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean490 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt6662 || local1367 > arg2.anInt6662 || local1371 > arg2.anInt6662;
							@Pc(1427) short local1427 = local996.aShortArray27[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray267[local46];
								if (local1482 != -1) {
									arg2.method5669(local1375, local1379, local1383, local1363, local1367, local1371, Static351.method5641(local1482, local996.aShortArray29[local1349]), Static351.method5641(local1482, local996.aShortArray29[local1354]), Static351.method5641(local1482, local996.aShortArray29[local1359]));
								}
							} else {
								if (this.method4177(this.aClass89_Sub2_10.anInterface6_6.method5614(local1427).aByte5)) {
									arg2.anInt6658 = 100;
								}
								arg2.method5660(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray29[local1349], local996.aShortArray29[local1354], local996.aShortArray29[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt6658 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort39; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray28[local209];
					@Pc(1533) short local1533 = local996.aShortArray31[local209];
					@Pc(1538) short local1538 = local996.aShortArray30[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray267[local209];
						if (local310 != -1) {
							arg2.aBoolean490 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt6662 || local226 > arg2.anInt6662 || local282 > arg2.anInt6662;
							arg2.method5669(local338, local198, local254, local170, local226, local282, Static351.method5641(local310, local996.aShortArray29[local1528]), Static351.method5641(local310, local996.aShortArray29[local1533]), Static351.method5641(local310, local996.aShortArray29[local1538]));
						}
					}
				}
			}
		} else if ((local6.aByte59 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt4762;
			local24 = local19 + this.anInt4762;
			local29 = arg1 * this.anInt4762;
			local34 = local29 + this.anInt4762;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte59 & 0x1) == 0) {
				local46 = this.anIntArrayArray41[arg0][arg1];
				local51 = this.anIntArrayArray41[arg0 + 1][arg1];
				local148 = this.anIntArrayArray41[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray41[arg0][arg1 + 1];
				local68 = this.anInt4766 + (this.anInt4771 * local19 + this.anInt4775 * local46 + this.anInt4765 * local29 >> 15);
				if (local68 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local91 = this.anInt4766 + (this.anInt4771 * local24 + this.anInt4775 * local51 + this.anInt4765 * local29 >> 15);
				if (local91 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local114 = this.anInt4766 + (this.anInt4771 * local24 + this.anInt4775 * local148 + this.anInt4765 * local34 >> 15);
				if (local114 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local137 = this.anInt4766 + (this.anInt4771 * local19 + this.anInt4775 * local153 + this.anInt4765 * local34 >> 15);
				if (local137 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local170 = this.anInt4776 + (this.anInt4770 * local19 + this.anInt4769 * local46 + this.anInt4767 * local29 >> 15);
				local181 = arg2.anInt6659 + local170 * this.aClass89_Sub2_10.anInt6412 / local68;
				local198 = this.anInt4774 + (this.anInt4773 * local19 + this.anInt4764 * local46 + this.anInt4772 * local29 >> 15);
				local209 = arg2.anInt6660 + local198 * this.aClass89_Sub2_10.anInt6424 / local68;
				local226 = this.anInt4776 + (this.anInt4770 * local24 + this.anInt4769 * local51 + this.anInt4767 * local29 >> 15);
				local237 = arg2.anInt6659 + local226 * this.aClass89_Sub2_10.anInt6412 / local91;
				local254 = this.anInt4774 + (this.anInt4773 * local24 + this.anInt4764 * local51 + this.anInt4772 * local29 >> 15);
				local265 = arg2.anInt6660 + local254 * this.aClass89_Sub2_10.anInt6424 / local91;
				local282 = this.anInt4776 + (this.anInt4770 * local24 + this.anInt4769 * local148 + this.anInt4767 * local34 >> 15);
				local293 = arg2.anInt6659 + local282 * this.aClass89_Sub2_10.anInt6412 / local114;
				local310 = this.anInt4774 + (this.anInt4773 * local24 + this.anInt4764 * local148 + this.anInt4772 * local34 >> 15);
				local321 = arg2.anInt6660 + local310 * this.aClass89_Sub2_10.anInt6424 / local114;
				local338 = this.anInt4776 + (this.anInt4770 * local19 + this.anInt4769 * local153 + this.anInt4767 * local34 >> 15);
				local349 = arg2.anInt6659 + local338 * this.aClass89_Sub2_10.anInt6412 / local137;
				local366 = this.anInt4774 + (this.anInt4773 * local19 + this.anInt4764 * local153 + this.anInt4772 * local34 >> 15);
				local377 = arg2.anInt6660 + local366 * this.aClass89_Sub2_10.anInt6424 / local137;
			} else {
				local46 = this.anIntArrayArray41[arg0][arg1];
				local51 = this.anInt4775 * local46;
				local68 = this.anInt4766 + (this.anInt4771 * local19 + local51 + this.anInt4765 * local29 >> 15);
				if (local68 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local91 = this.anInt4766 + (this.anInt4771 * local24 + local51 + this.anInt4765 * local29 >> 15);
				if (local91 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local114 = this.anInt4766 + (this.anInt4771 * local24 + local51 + this.anInt4765 * local34 >> 15);
				if (local114 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local137 = this.anInt4766 + (this.anInt4771 * local19 + local51 + this.anInt4765 * local34 >> 15);
				if (local137 <= this.aClass89_Sub2_10.anInt6407) {
					return;
				}
				local148 = this.anInt4769 * local46;
				local153 = this.anInt4764 * local46;
				local170 = this.anInt4776 + (this.anInt4770 * local19 + local148 + this.anInt4767 * local29 >> 15);
				local181 = arg2.anInt6659 + local170 * this.aClass89_Sub2_10.anInt6412 / local68;
				local198 = this.anInt4774 + (this.anInt4773 * local19 + local153 + this.anInt4772 * local29 >> 15);
				local209 = arg2.anInt6660 + local198 * this.aClass89_Sub2_10.anInt6424 / local68;
				local226 = this.anInt4776 + (this.anInt4770 * local24 + local148 + this.anInt4767 * local29 >> 15);
				local237 = arg2.anInt6659 + local226 * this.aClass89_Sub2_10.anInt6412 / local91;
				local254 = this.anInt4774 + (this.anInt4773 * local24 + local153 + this.anInt4772 * local29 >> 15);
				local265 = arg2.anInt6660 + local254 * this.aClass89_Sub2_10.anInt6424 / local91;
				local282 = this.anInt4776 + (this.anInt4770 * local24 + local148 + this.anInt4767 * local34 >> 15);
				local293 = arg2.anInt6659 + local282 * this.aClass89_Sub2_10.anInt6412 / local114;
				local310 = this.anInt4774 + (this.anInt4773 * local24 + local153 + this.anInt4772 * local34 >> 15);
				local321 = arg2.anInt6660 + local310 * this.aClass89_Sub2_10.anInt6424 / local114;
				local338 = this.anInt4776 + (this.anInt4770 * local19 + local148 + this.anInt4767 * local34 >> 15);
				local349 = arg2.anInt6659 + local338 * this.aClass89_Sub2_10.anInt6412 / local137;
				local366 = this.anInt4774 + (this.anInt4773 * local19 + local153 + this.anInt4772 * local34 >> 15);
				local377 = arg2.anInt6660 + local366 * this.aClass89_Sub2_10.anInt6424 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean490 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt6662 || local349 > arg2.anInt6662 || local237 > arg2.anInt6662;
				if (local6.aShort74 >= 0) {
					if (this.method4177(this.aClass89_Sub2_10.anInterface6_6.method5614(local6.aShort74).aByte5)) {
						arg2.anInt6658 = 100;
					}
					arg2.method5660(local321, local377, local265, local293, local349, local237, local6.aShort72 & 0xFFFF, local6.aShort73 & 0xFFFF, local6.aShort71 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort74);
					arg2.anInt6658 = 0;
				} else {
					arg2.method5669(local321, local377, local265, local293, local349, local237, local6.aShort72 & 0xFFFF, local6.aShort73 & 0xFFFF, local6.aShort71 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean490 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt6662 || local237 > arg2.anInt6662 || local349 > arg2.anInt6662;
				if (local6.aShort74 >= 0) {
					if (this.method4177(this.aClass89_Sub2_10.anInterface6_6.method5614(local6.aShort74).aByte5)) {
						arg2.anInt6658 = 100;
					}
					arg2.method5660(local209, local265, local377, local181, local237, local349, local6.aShort70 & 0xFFFF, local6.aShort71 & 0xFFFF, local6.aShort73 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort74);
					arg2.anInt6658 = 0;
					return;
				}
				arg2.method5669(local209, local265, local377, local181, local237, local349, local6.aShort70 & 0xFFFF, local6.aShort71 & 0xFFFF, local6.aShort73 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)I")
	@Override
	public int method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray41[arg0][arg1];
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class70_Sub1 local3 = this.aClass89_Sub2_10.aClass70_Sub1_3;
		this.anInt4770 = local3.anInt2139;
		this.anInt4769 = local3.anInt2135;
		this.anInt4767 = local3.anInt2133;
		this.anInt4776 = local3.anInt2137;
		this.anInt4773 = local3.anInt2134;
		this.anInt4764 = local3.anInt2132;
		this.anInt4772 = local3.anInt2140;
		this.anInt4774 = local3.anInt2131;
		this.anInt4771 = local3.anInt2129;
		this.anInt4775 = local3.anInt2136;
		this.anInt4765 = local3.anInt2138;
		this.anInt4766 = local3.anInt2130;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(Lclient!ug;IIIIZ)V")
	@Override
	public void method4164(@OriginalArg(0) Class7_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4171(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class37 local4 = this.aClass89_Sub2_10.method5498(Thread.currentThread());
		@Pc(7) Class217 local7 = local4.aClass217_2;
		local7.anInt6658 = 0;
		local7.aBoolean490 = false;
		if (this.aClass58ArrayArray1 != null) {
			this.method4180(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray175, local4.anIntArray164);
		} else if (this.aClass178ArrayArray1 != null) {
			this.method4178(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray175, local4.anIntArray164);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
	@Override
	public void method4163() {
		this.aByteArrayArray14 = null;
		this.aByteArrayArray15 = null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (this.aClass178ArrayArray1 == null) {
			this.aClass178ArrayArray1 = new Class178[super.anInt4755][super.anInt4760];
			this.aClass65ArrayArray1 = new Class65[super.anInt4755][super.anInt4760];
		} else if (this.aClass58ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg5[local57]];
				local70 = arg4[arg5[local57]];
				if (local64 != 0 && local64 != this.anInt4762 || local70 != 0 && local70 != this.anInt4762) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class65 local95 = new Class65();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg8.length;
			local95.aShort38 = local99;
			local95.aShortArray29 = new short[local99];
			local95.anIntArray265 = new int[local99];
			local95.anIntArray268 = new int[local99];
			local95.anIntArray266 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray29[local124] = (short) (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt4762) {
					local95.aShortArray29[local124] = (short) (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]);
				} else if (local129 == this.anInt4762 && local133 == this.anInt4762) {
					local95.aShortArray29[local124] = (short) (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt4762 && local133 == 0) {
					local95.aShortArray29[local124] = (short) (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]) * (this.anInt4762 - local129) + (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]) * (this.anInt4762 - local129) + (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray29[local124] = (short) (local288 * (this.anInt4762 - local133) + local335 * local133 >> this.anInt4768 * 2);
				}
				local288 = (arg0 << this.anInt4768) + local129;
				local335 = (arg1 << this.anInt4768) + local133;
				local95.anIntArray265[local124] = local288;
				local95.anIntArray266[local124] = local335;
				local95.anIntArray268[local124] = this.method4169(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray29[local124] < 2) {
					local95.aShortArray29[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg8[local288] >= 0 || arg9 != null && arg9[local288] >= 0) {
					local133++;
				}
				if (arg10[local288] != -1 && !this.aClass89_Sub2_10.anInterface6_6.method5614(arg10[local288]).aBoolean16) {
					local412 = true;
				}
			}
			local95.anIntArray267 = new int[local133];
			if (arg9 != null) {
				local95.anIntArray264 = new int[local133];
			}
			local95.aShortArray28 = new short[local133];
			local95.aShortArray31 = new short[local133];
			local95.aShortArray30 = new short[local133];
			if (local412) {
				local95.aShortArray27 = new short[local133];
				local95.aShortArray32 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg8[local335] >= 0 || arg9 != null && arg9[local335] >= 0) {
					if (arg8[local335] >= 0) {
						local95.anIntArray267[local95.aShort39] = Static110.method2132(arg8[local335]);
					} else {
						local95.anIntArray267[local95.aShort39] = -1;
					}
					if (arg9 != null) {
						if (arg9[local335] == -1) {
							local95.anIntArray264[local95.aShort39] = -1;
						} else {
							local95.anIntArray264[local95.aShort39] = Static110.method2132(arg9[local335]);
						}
					}
					local95.aShortArray28[local95.aShort39] = (short) arg5[local335];
					local95.aShortArray31[local95.aShort39] = (short) arg6[local335];
					local95.aShortArray30[local95.aShort39] = (short) arg7[local335];
					if (local412) {
						if (arg10[local335] == -1 || this.aClass89_Sub2_10.anInterface6_6.method5614(arg10[local335]).aBoolean16) {
							local95.aShortArray27[local95.aShort39] = -1;
						} else {
							local95.aShortArray27[local95.aShort39] = (short) arg10[local335];
							local95.aShortArray32[local95.aShort39] = (short) arg11[local335];
						}
					}
					local95.aShort39++;
				}
			}
			this.aClass65ArrayArray1[arg0][arg1] = local95;
		} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
			@Pc(641) Class178 local641 = new Class178();
			local64 = arg8[0];
			local70 = arg10[0];
			if (arg9 != null) {
				local641.anInt5388 = Static351.method5641(Static110.method2132(arg9[0]), this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]);
				if (local64 == -1) {
					local641.aByte59 = (byte) (local641.aByte59 | 0x2);
				}
			}
			if (this.anIntArrayArray41[arg0][arg1] == this.anIntArrayArray41[arg0 + 1][arg1] && this.anIntArrayArray41[arg0][arg1] == this.anIntArrayArray41[arg0 + 1][arg1 + 1] && this.anIntArrayArray41[arg0][arg1] == this.anIntArrayArray41[arg0][arg1 + 1]) {
				local641.aByte59 = (byte) (local641.aByte59 | 0x1);
			}
			if (local70 == -1 || (local641.aByte59 & 0x2) != 0 || this.aClass89_Sub2_10.anInterface6_6.method5614(local70).aBoolean16) {
				@Pc(842) short local842 = Static110.method2132(local64);
				local641.aShort70 = (short) Static351.method5641(local842, this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]);
				local641.aShort71 = (short) Static351.method5641(local842, this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]);
				local641.aShort72 = (short) Static351.method5641(local842, this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]);
				local641.aShort73 = (short) Static351.method5641(local842, this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]);
				local641.aShort74 = -1;
			} else {
				local641.aShort70 = (short) (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]);
				local641.aShort71 = (short) (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]);
				local641.aShort72 = (short) (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]);
				local641.aShort73 = (short) (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]);
				local641.aShort74 = (short) local70;
			}
			this.aClass178ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)I")
	@Override
	public int method4169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt4768;
		@Pc(9) int local9 = arg1 >> this.anInt4768;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt4755 - 1 || local9 > super.anInt4760 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt4762 - 1;
		@Pc(41) int local41 = arg1 & this.anInt4762 - 1;
		@Pc(67) int local67 = this.anIntArrayArray41[local4][local9] * (this.anInt4762 - local34) + this.anIntArrayArray41[local4 + 1][local9] * local34 >> this.anInt4768;
		@Pc(97) int local97 = this.anIntArrayArray41[local4][local9 + 1] * (this.anInt4762 - local34) + this.anIntArrayArray41[local4 + 1][local9 + 1] * local34 >> this.anInt4768;
		return local67 * (this.anInt4762 - local41) + local97 * local41 >> this.anInt4768;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(Lclient!ug;IIIIZ)V")
	@Override
	public void method4159(@OriginalArg(0) Class7_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIIIIII[[ZLclient!wl;[I[I)V")
	private void method4180(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class217 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean489 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass58ArrayArray1[local22][local25] != null) {
						@Pc(50) Class58 local50 = this.aClass58ArrayArray1[local22][local25];
						if (local50.aShort37 != -1 && (local50.aByte32 & 0x2) == 0 && local50.anInt1670 == 0) {
							local68 = this.aClass89_Sub2_10.method5495(local50.aShort37);
							arg5.method5669(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static351.method5641(local68, local50.anInt1668), Static351.method5641(local68, local50.anInt1669), Static351.method5641(local68, local50.anInt1666));
							arg5.method5669(local20, local20, local20 - 4, local16, local16 + 4, local16, Static351.method5641(local68, local50.anInt1667), Static351.method5641(local68, local50.anInt1666), Static351.method5641(local68, local50.anInt1669));
						} else if (local50.anInt1670 == 0) {
							arg5.method5674(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt1668, local50.anInt1669, local50.anInt1666);
							arg5.method5674(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt1667, local50.anInt1666, local50.anInt1669);
						} else {
							local68 = local50.anInt1670;
							arg5.method5674(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static77.method1576(local68, local50.anInt1668 & 0xFF000000), Static77.method1576(local68, local50.anInt1669 & 0xFF000000), Static77.method1576(local68, local50.anInt1666 & 0xFF000000));
							arg5.method5674(local20, local20, local20 - 4, local16, local16 + 4, local16, Static77.method1576(local68, local50.anInt1667 & 0xFF000000), Static77.method1576(local68, local50.anInt1666 & 0xFF000000), Static77.method1576(local68, local50.anInt1669 & 0xFF000000));
						}
					} else if (this.aClass28ArrayArray1[local22][local25] != null) {
						@Pc(259) Class28 local259 = this.aClass28ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort11; local68++) {
							arg6[local68] = local16 + (local259.aShortArray12[local68] - local22 * this.anInt4762) * 4 / this.anInt4762;
							arg7[local68] = local20 - (local259.aShortArray16[local68] - local25 * this.anInt4762) * 4 / this.anInt4762;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort10; local307++) {
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
							if (local259.anIntArray87 != null && local259.anIntArray87[local307] != 0 && (local259.aShortArray11 == null || local259.aShortArray11 != null && local259.aShortArray11[local307] == -1)) {
								local369 = local259.anIntArray87[local307];
								arg5.method5674(local336, local340, local344, local324, local328, local332, Static77.method1576(local369, -(local259.anIntArray86[local312] & -16777216) - 16777216), Static77.method1576(local369, -(local259.anIntArray86[local316] & -16777216) - 16777216), Static77.method1576(local369, -(local259.anIntArray86[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray11 == null || local259.aShortArray11[local307] == -1) {
								arg5.method5674(local336, local340, local344, local324, local328, local332, local259.anIntArray86[local312], local259.anIntArray86[local316], local259.anIntArray86[local320]);
							} else {
								local369 = this.aClass89_Sub2_10.method5495(local259.aShortArray11[local307]);
								arg5.method5669(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean489 = true;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	@Override
	public void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray15[arg0][arg1] < arg2) {
			this.aByteArrayArray15[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!j;[I)V")
	@Override
	public void method4162(@OriginalArg(0) Class7_Sub16 arg0, @OriginalArg(1) int[] arg1) {
	}
}
