import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class36_Sub2 extends Class36 {

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[[Lclient!fb;")
	private Class53[][] aClass53ArrayArray1;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
	private int anInt4860;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
	private int anInt4861;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "[[Lclient!gd;")
	private Class69[][] aClass69ArrayArray1;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "[[Lclient!sb;")
	private Class188[][] aClass188ArrayArray1;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
	private int anInt4863;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	private int anInt4864;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
	private int anInt4865;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	private int anInt4866;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
	private int anInt4867;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
	private int anInt4868;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
	private int anInt4870;

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
	private int anInt4872;

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "[[Lclient!fj;")
	private Class59[][] aClass59ArrayArray1;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
	private int anInt4873;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
	private int anInt4874;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Lclient!pm;")
	private final Class63_Sub2 aClass63_Sub2_8;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
	private final int anInt4869;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "[[I")
	public final int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "[[I")
	private final int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
	private final int anInt4871;

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
	private int anInt4862;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!pm;IIII[[I[[II)V")
	public Class36_Sub2(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass63_Sub2_8 = arg0;
		this.anInt4869 = arg2;
		this.anIntArrayArray49 = arg5;
		this.anIntArrayArray48 = arg6;
		this.anInt4871 = arg7;
		this.anInt4862 = 0;
		while (arg7 > 1) {
			this.anInt4862++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray14 = new byte[arg3 + 1][arg4 + 1];
		@Pc(50) int local50 = this.aClass63_Sub2_8.anInt5044 >> 9;
		for (@Pc(52) int local52 = 1; local52 < arg4; local52++) {
			for (@Pc(55) int local55 = 1; local55 < arg3; local55++) {
				@Pc(76) int local76 = this.anIntArrayArray49[local55 + 1][local52] - this.anIntArrayArray49[local55 - 1][local52];
				@Pc(94) int local94 = this.anIntArrayArray49[local55][local52 + 1] - this.anIntArrayArray49[local55][local52 - 1];
				@Pc(107) int local107 = (int) Math.sqrt((double) (local76 * local76 + local94 * local94 + 65536));
				@Pc(113) int local113 = (local76 << 8) / local107;
				@Pc(117) int local117 = -65536 / local107;
				@Pc(123) int local123 = (local94 << 8) / local107;
				@Pc(145) int local145 = local50 + (this.aClass63_Sub2_8.anInt5024 * local113 + this.aClass63_Sub2_8.anInt5028 * local117 + this.aClass63_Sub2_8.anInt5025 * local123 >> 17);
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

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)I")
	@Override
	public int method4433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt4862;
		@Pc(9) int local9 = arg1 >> this.anInt4862;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt4858 - 1 || local9 > super.anInt4859 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt4871 - 1;
		@Pc(41) int local41 = arg1 & this.anInt4871 - 1;
		@Pc(67) int local67 = this.anIntArrayArray49[local4][local9] * (this.anInt4871 - local34) + this.anIntArrayArray49[local4 + 1][local9] * local34 >> this.anInt4862;
		@Pc(97) int local97 = this.anIntArrayArray49[local4][local9 + 1] * (this.anInt4871 - local34) + this.anIntArrayArray49[local4 + 1][local9 + 1] * local34 >> this.anInt4862;
		return local67 * (this.anInt4871 - local41) + local97 * local41 >> this.anInt4862;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class129_Sub1 local3 = this.aClass63_Sub2_8.aClass129_Sub1_3;
		this.anInt4861 = local3.anInt4570;
		this.anInt4870 = local3.anInt4569;
		this.anInt4860 = local3.anInt4567;
		this.anInt4865 = local3.anInt4564;
		this.anInt4872 = local3.anInt4571;
		this.anInt4863 = local3.anInt4560;
		this.anInt4864 = local3.anInt4561;
		this.anInt4867 = local3.anInt4566;
		this.anInt4874 = local3.anInt4565;
		this.anInt4868 = local3.anInt4563;
		this.anInt4873 = local3.anInt4568;
		this.anInt4866 = local3.anInt4562;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	@Override
	public void method4443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray15[arg0][arg1] < arg2) {
			this.aByteArrayArray15[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZLclient!fi;[I[I[I)V")
	private void method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class58 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class69 local6 = this.aClass69ArrayArray1[arg0][arg1];
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
			@Pc(1450) Class188 local1450 = this.aClass188ArrayArray1[arg0][arg1];
			if (local1450 != null) {
				for (local423 = 0; local423 < local1450.aShort78; local423++) {
					@Pc(1460) short local1460 = local1450.aShortArray95[local423];
					local29 = local1450.aShortArray93[local423];
					@Pc(1470) short local1470 = local1450.aShortArray96[local423];
					local367 = this.anInt4866 + (this.anInt4874 * local1460 + this.anInt4868 * local29 + this.anInt4873 * local1470 >> 15);
					if (local367 <= this.aClass63_Sub2_8.anInt5017) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass63_Sub2_8.anInt5034;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1450.aShortArray94[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass63_Sub2_8.lb) {
						local283 = local367 - this.aClass63_Sub2_8.anInt5034;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt4865 + (this.anInt4861 * local1460 + this.anInt4870 * local29 + this.anInt4860 * local1470 >> 15);
					local311 = this.anInt4867 + (this.anInt4872 * local1460 + this.anInt4863 * local29 + this.anInt4864 * local1470 >> 15);
					arg4[local423] = arg3.anInt1963 + local255 * this.aClass63_Sub2_8.anInt5043 / local367;
					arg5[local423] = arg3.anInt1961 + local311 * this.aClass63_Sub2_8.anInt5021 / local367;
				}
				if (local1450.aShortArray92 != null) {
					local283 = this.anIntArrayArray49[arg0][arg1];
					local339 = this.anIntArrayArray49[arg0 + 1][arg1];
					local395 = this.anIntArrayArray49[arg0][arg1 + 1];
					local451 = arg0 * this.anInt4871;
					local244 = local451 + this.anInt4871;
					local300 = arg1 * this.anInt4871;
					local356 = local300 + this.anInt4871;
					local412 = this.anInt4865 + (this.anInt4861 * local451 + this.anInt4870 * local283 + this.anInt4860 * local300 >> 15);
					local272 = this.anInt4867 + (this.anInt4872 * local451 + this.anInt4863 * local283 + this.anInt4864 * local300 >> 15);
					local328 = this.anInt4866 + (this.anInt4874 * local451 + this.anInt4868 * local283 + this.anInt4873 * local300 >> 15);
					local384 = this.anInt4865 + (this.anInt4861 * local244 + this.anInt4870 * local339 + this.anInt4860 * local300 >> 15);
					local440 = this.anInt4867 + (this.anInt4872 * local244 + this.anInt4863 * local339 + this.anInt4864 * local300 >> 15);
					local78 = this.anInt4866 + (this.anInt4874 * local244 + this.anInt4868 * local339 + this.anInt4873 * local300 >> 15);
					local101 = this.anInt4865 + (this.anInt4861 * local451 + this.anInt4870 * local395 + this.anInt4860 * local356 >> 15);
					local124 = this.anInt4867 + (this.anInt4872 * local451 + this.anInt4863 * local395 + this.anInt4864 * local356 >> 15);
					local147 = this.anInt4866 + (this.anInt4874 * local451 + this.anInt4868 * local395 + this.anInt4873 * local356 >> 15);
					for (local36 = 0; local36 < local1450.aShort79; local36++) {
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
							arg3.aBoolean138 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt1960 || local56 > arg3.anInt1960 || local61 > arg3.anInt1960;
							@Pc(1954) short local1954 = local1450.aShortArray92[local36];
							if (local1910 < 765) {
								if (local1954 != -1 && this.method4450(this.aClass63_Sub2_8.anInterface3_6.method5486(local1954).aByte54)) {
									arg3.anInt1962 = 100;
								}
								if (local1910 > 0) {
									if (local1954 != -1) {
										arg3.method1846(local222, local227, local620, local163, local56, local61, this.aClass63_Sub2_8.anInt5016, arg6[local38], arg6[local40], arg6[local42], local1450.anIntArray425[local38], local1450.anIntArray425[local40], local1450.anIntArray425[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
									} else if ((local1450.anIntArray425[local38] & 0xFFFFFF) != 0) {
										arg3.method1849(local222, local227, local620, local163, local56, local61, Static144.method2862(local1450.anIntArray425[local38], arg6[local38] << 24 | this.aClass63_Sub2_8.anInt5016), Static144.method2862(local1450.anIntArray425[local40], arg6[local40] << 24 | this.aClass63_Sub2_8.anInt5016), Static144.method2862(local1450.anIntArray425[local42], arg6[local42] << 24 | this.aClass63_Sub2_8.anInt5016));
									}
								} else if (local1954 != -1) {
									arg3.method1844(local222, local227, local620, local163, local56, local61, local1450.anIntArray425[local38], local1450.anIntArray425[local40], local1450.anIntArray425[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
								} else if ((local1450.anIntArray425[local38] & 0xFFFFFF) != 0) {
									arg3.method1849(local222, local227, local620, local163, local56, local61, local1450.anIntArray425[local38], local1450.anIntArray425[local40], local1450.anIntArray425[local42]);
								}
								arg3.anInt1962 = 0;
							} else {
								arg3.method1840(local222, local227, local620, local163, local56, local61, this.aClass63_Sub2_8.anInt5016);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1450.aShort79; local283++) {
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
						arg3.aBoolean138 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt1960 || local300 > arg3.anInt1960 || local356 > arg3.anInt1960;
						if (local384 >= 765) {
							arg3.method1840(local412, local272, local328, local244, local300, local356, this.aClass63_Sub2_8.anInt5016);
						} else if (local384 > 0) {
							if ((local1450.anIntArray425[local339] & 0xFFFFFF) != 0) {
								arg3.method1849(local412, local272, local328, local244, local300, local356, Static353.method5817(local1450.anIntArray425[local339], arg6[local339], this.aClass63_Sub2_8.anInt5016), Static353.method5817(local1450.anIntArray425[local395], arg6[local395], this.aClass63_Sub2_8.anInt5016), Static353.method5817(local1450.anIntArray425[local451], arg6[local451], this.aClass63_Sub2_8.anInt5016));
							}
						} else if ((local1450.anIntArray425[local339] & 0xFFFFFF) != 0) {
							arg3.method1849(local412, local272, local328, local244, local300, local356, local1450.anIntArray425[local339], local1450.anIntArray425[local395], local1450.anIntArray425[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte15 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt4871;
			@Pc(24) int local24 = local19 + this.anInt4871;
			local29 = arg1 * this.anInt4871;
			@Pc(34) int local34 = local29 + this.anInt4871;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte15 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray49[arg0][arg1];
				local61 = this.anIntArrayArray49[arg0 + 1][arg1];
				local222 = this.anIntArrayArray49[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray49[arg0][arg1 + 1];
				local78 = this.anInt4866 + (this.anInt4874 * local19 + this.anInt4868 * local56 + this.anInt4873 * local29 >> 15);
				if (local78 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local101 = this.anInt4866 + (this.anInt4874 * local24 + this.anInt4868 * local61 + this.anInt4873 * local29 >> 15);
				if (local101 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local124 = this.anInt4866 + (this.anInt4874 * local24 + this.anInt4868 * local222 + this.anInt4873 * local34 >> 15);
				if (local124 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local147 = this.anInt4866 + (this.anInt4874 * local19 + this.anInt4868 * local227 + this.anInt4873 * local34 >> 15);
				if (local147 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local620 = this.anIntArrayArray48[arg0][arg1] * local163 / 255;
						if (local620 > 0) {
							local56 -= local620;
						}
					}
					local163 = local101 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local620 = this.anIntArrayArray48[arg0 + 1][arg1] * local163 / 255;
						if (local620 > 0) {
							local61 -= local620;
						}
					}
					local163 = local124 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local620 = this.anIntArrayArray48[arg0 + 1][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local222 -= local620;
						}
					}
					local163 = local147 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local620 = this.anIntArrayArray48[arg0][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local227 -= local620;
						}
					}
				} else if (this.aClass63_Sub2_8.lb) {
					local163 = local78 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt4865 + (this.anInt4861 * local19 + this.anInt4870 * local56 + this.anInt4860 * local29 >> 15);
				local255 = arg3.anInt1963 + local244 * this.aClass63_Sub2_8.anInt5043 / local78;
				local272 = this.anInt4867 + (this.anInt4872 * local19 + this.anInt4863 * local56 + this.anInt4864 * local29 >> 15);
				local283 = arg3.anInt1961 + local272 * this.aClass63_Sub2_8.anInt5021 / local78;
				local300 = this.anInt4865 + (this.anInt4861 * local24 + this.anInt4870 * local61 + this.anInt4860 * local29 >> 15);
				local311 = arg3.anInt1963 + local300 * this.aClass63_Sub2_8.anInt5043 / local101;
				local328 = this.anInt4867 + (this.anInt4872 * local24 + this.anInt4863 * local61 + this.anInt4864 * local29 >> 15);
				local339 = arg3.anInt1961 + local328 * this.aClass63_Sub2_8.anInt5021 / local101;
				local356 = this.anInt4865 + (this.anInt4861 * local24 + this.anInt4870 * local222 + this.anInt4860 * local34 >> 15);
				local367 = arg3.anInt1963 + local356 * this.aClass63_Sub2_8.anInt5043 / local124;
				local384 = this.anInt4867 + (this.anInt4872 * local24 + this.anInt4863 * local222 + this.anInt4864 * local34 >> 15);
				local395 = arg3.anInt1961 + local384 * this.aClass63_Sub2_8.anInt5021 / local124;
				local412 = this.anInt4865 + (this.anInt4861 * local19 + this.anInt4870 * local227 + this.anInt4860 * local34 >> 15);
				local423 = arg3.anInt1963 + local412 * this.aClass63_Sub2_8.anInt5043 / local147;
				local440 = this.anInt4867 + (this.anInt4872 * local19 + this.anInt4863 * local227 + this.anInt4864 * local34 >> 15);
				local451 = arg3.anInt1961 + local440 * this.aClass63_Sub2_8.anInt5021 / local147;
			} else {
				local56 = this.anIntArrayArray49[arg0][arg1];
				local61 = this.anInt4868 * local56;
				local78 = this.anInt4866 + (this.anInt4874 * local19 + local61 + this.anInt4873 * local29 >> 15);
				if (local78 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local101 = this.anInt4866 + (this.anInt4874 * local24 + local61 + this.anInt4873 * local29 >> 15);
				if (local101 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local124 = this.anInt4866 + (this.anInt4874 * local24 + local61 + this.anInt4873 * local34 >> 15);
				if (local124 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local147 = this.anInt4866 + (this.anInt4874 * local19 + local61 + this.anInt4873 * local34 >> 15);
				if (local147 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				if (this.aClass63_Sub2_8.lb) {
					local163 = local78 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass63_Sub2_8.anInt5034;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt4870 * local56;
				local227 = this.anInt4863 * local56;
				local244 = this.anInt4865 + (this.anInt4861 * local19 + local222 + this.anInt4860 * local29 >> 15);
				local255 = arg3.anInt1963 + local244 * this.aClass63_Sub2_8.anInt5043 / local78;
				local272 = this.anInt4867 + (this.anInt4872 * local19 + local227 + this.anInt4864 * local29 >> 15);
				local283 = arg3.anInt1961 + local272 * this.aClass63_Sub2_8.anInt5021 / local78;
				local300 = this.anInt4865 + (this.anInt4861 * local24 + local222 + this.anInt4860 * local29 >> 15);
				local311 = arg3.anInt1963 + local300 * this.aClass63_Sub2_8.anInt5043 / local101;
				local328 = this.anInt4867 + (this.anInt4872 * local24 + local227 + this.anInt4864 * local29 >> 15);
				local339 = arg3.anInt1961 + local328 * this.aClass63_Sub2_8.anInt5021 / local101;
				local356 = this.anInt4865 + (this.anInt4861 * local24 + local222 + this.anInt4860 * local34 >> 15);
				local367 = arg3.anInt1963 + local356 * this.aClass63_Sub2_8.anInt5043 / local124;
				local384 = this.anInt4867 + (this.anInt4872 * local24 + local227 + this.anInt4864 * local34 >> 15);
				local395 = arg3.anInt1961 + local384 * this.aClass63_Sub2_8.anInt5021 / local124;
				local412 = this.anInt4865 + (this.anInt4861 * local19 + local222 + this.anInt4860 * local34 >> 15);
				local423 = arg3.anInt1963 + local412 * this.aClass63_Sub2_8.anInt5043 / local147;
				local440 = this.anInt4867 + (this.anInt4872 * local19 + local227 + this.anInt4864 * local34 >> 15);
				local451 = arg3.anInt1961 + local440 * this.aClass63_Sub2_8.anInt5021 / local147;
			}
			@Pc(1062) boolean local1062 = local6.aShort36 != -1 && this.method4450(this.aClass63_Sub2_8.anInterface3_6.method5486(local6.aShort36).aByte54);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean138 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt1960 || local423 > arg3.anInt1960 || local311 > arg3.anInt1960;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt1962 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort36 >= 0) {
							arg3.method1846(local395, local451, local339, local367, local423, local311, this.aClass63_Sub2_8.anInt5016, local40, local42, local38, local6.anInt2180, local6.anInt2178, local6.anInt2181, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort36);
						} else {
							arg3.method1849(local395, local451, local339, local367, local423, local311, Static144.method2862(local6.anInt2180, local40 << 24 | this.aClass63_Sub2_8.anInt5016), Static144.method2862(local6.anInt2178, local42 << 24 | this.aClass63_Sub2_8.anInt5016), Static144.method2862(local6.anInt2181, local38 << 24 | this.aClass63_Sub2_8.anInt5016));
						}
					} else if (local6.aShort36 >= 0) {
						arg3.method1844(local395, local451, local339, local367, local423, local311, local6.anInt2180, local6.anInt2178, local6.anInt2181, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort36);
					} else {
						arg3.method1849(local395, local451, local339, local367, local423, local311, local6.anInt2180, local6.anInt2178, local6.anInt2181);
					}
					arg3.anInt1962 = 0;
				} else {
					arg3.method1840(local395, local451, local339, local367, local423, local311, this.aClass63_Sub2_8.anInt5016);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean138 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt1960 || local311 > arg3.anInt1960 || local423 > arg3.anInt1960;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt1962 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort36 >= 0) {
							arg3.method1846(local283, local339, local451, local255, local311, local423, this.aClass63_Sub2_8.anInt5016, local36, local38, local42, local6.anInt2179, local6.anInt2181, local6.anInt2178, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort36);
						} else {
							arg3.method1849(local283, local339, local451, local255, local311, local423, Static144.method2862(local6.anInt2179, local36 << 24 | this.aClass63_Sub2_8.anInt5016), Static144.method2862(local6.anInt2181, local38 << 24 | this.aClass63_Sub2_8.anInt5016), Static144.method2862(local6.anInt2178, local42 << 24 | this.aClass63_Sub2_8.anInt5016));
						}
					} else if (local6.aShort36 >= 0) {
						arg3.method1844(local283, local339, local451, local255, local311, local423, local6.anInt2179, local6.anInt2181, local6.anInt2178, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort36);
					} else {
						arg3.method1849(local283, local339, local451, local255, local311, local423, local6.anInt2179, local6.anInt2181, local6.anInt2178);
					}
					arg3.anInt1962 = 0;
					return;
				}
				arg3.method1840(local283, local339, local451, local255, local311, local423, this.aClass63_Sub2_8.anInt5016);
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Lclient!qh;IIIIZ)V")
	@Override
	public void method4444(@OriginalArg(0) Class1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Z")
	private boolean method4450(@OriginalArg(0) int arg0) {
		if ((this.anInt4869 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII[[ZLclient!fi;[I[I)V")
	private void method4451(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class58 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean139 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass69ArrayArray1[local22][local25] != null) {
						@Pc(50) Class69 local50 = this.aClass69ArrayArray1[local22][local25];
						if (local50.aShort36 != -1 && (local50.aByte15 & 0x2) == 0 && local50.anInt2182 == 0) {
							local68 = this.aClass63_Sub2_8.method4666(local50.aShort36);
							arg5.method1850(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static255.method4772(local68, local50.anInt2180), Static255.method4772(local68, local50.anInt2178), Static255.method4772(local68, local50.anInt2181));
							arg5.method1850(local20, local20, local20 - 4, local16, local16 + 4, local16, Static255.method4772(local68, local50.anInt2179), Static255.method4772(local68, local50.anInt2181), Static255.method4772(local68, local50.anInt2178));
						} else if (local50.anInt2182 == 0) {
							arg5.method1849(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt2180, local50.anInt2178, local50.anInt2181);
							arg5.method1849(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt2179, local50.anInt2181, local50.anInt2178);
						} else {
							local68 = local50.anInt2182;
							arg5.method1849(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static144.method2862(local68, local50.anInt2180 & 0xFF000000), Static144.method2862(local68, local50.anInt2178 & 0xFF000000), Static144.method2862(local68, local50.anInt2181 & 0xFF000000));
							arg5.method1849(local20, local20, local20 - 4, local16, local16 + 4, local16, Static144.method2862(local68, local50.anInt2179 & 0xFF000000), Static144.method2862(local68, local50.anInt2181 & 0xFF000000), Static144.method2862(local68, local50.anInt2178 & 0xFF000000));
						}
					} else if (this.aClass188ArrayArray1[local22][local25] != null) {
						@Pc(259) Class188 local259 = this.aClass188ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort78; local68++) {
							arg6[local68] = local16 + (local259.aShortArray95[local68] - local22 * this.anInt4871) * 4 / this.anInt4871;
							arg7[local68] = local20 - (local259.aShortArray96[local68] - local25 * this.anInt4871) * 4 / this.anInt4871;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort79; local307++) {
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
							if (local259.anIntArray424 != null && local259.anIntArray424[local307] != 0 && (local259.aShortArray92 == null || local259.aShortArray92 != null && local259.aShortArray92[local307] == -1)) {
								local369 = local259.anIntArray424[local307];
								arg5.method1849(local336, local340, local344, local324, local328, local332, Static144.method2862(local369, -(local259.anIntArray425[local312] & -16777216) - 16777216), Static144.method2862(local369, -(local259.anIntArray425[local316] & -16777216) - 16777216), Static144.method2862(local369, -(local259.anIntArray425[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray92 == null || local259.aShortArray92[local307] == -1) {
								arg5.method1849(local336, local340, local344, local324, local328, local332, local259.anIntArray425[local312], local259.anIntArray425[local316], local259.anIntArray425[local320]);
							} else {
								local369 = this.aClass63_Sub2_8.method4666(local259.aShortArray92[local307]);
								arg5.method1850(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean139 = true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
	@Override
	public int method4431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray49[arg0][arg1];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4432(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class144 local4 = this.aClass63_Sub2_8.method4668(Thread.currentThread());
		@Pc(7) Class58 local7 = local4.aClass58_2;
		local7.anInt1962 = 0;
		local7.aBoolean138 = false;
		if (this.aClass69ArrayArray1 != null) {
			this.method4451(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray339, local4.anIntArray321);
		} else if (this.aClass53ArrayArray1 != null) {
			this.method4452(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray339, local4.anIntArray321);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ap;[I)V")
	@Override
	public void method4447(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!qh;IIIIZ)V")
	@Override
	public void method4442(@OriginalArg(0) Class1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIIIIII[[ZLclient!fi;[I[I)V")
	private void method4452(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class58 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean139 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass53ArrayArray1[local22][local25] != null) {
						@Pc(50) Class53 local50 = this.aClass53ArrayArray1[local22][local25];
						if (local50.aShort29 != -1 && (local50.aByte14 & 0x2) == 0 && local50.anInt1870 == -1) {
							local69 = this.aClass63_Sub2_8.method4666(local50.aShort29);
							arg5.method1850(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static255.method4772(local69, local50.aShort31 & 0xFFFF), Static255.method4772(local69, local50.aShort30 & 0xFFFF), Static255.method4772(local69, local50.aShort32 & 0xFFFF));
							arg5.method1850(local20, local20, local20 - 4, local16, local16 + 4, local16, Static255.method4772(local69, local50.aShort33 & 0xFFFF), Static255.method4772(local69, local50.aShort32 & 0xFFFF), Static255.method4772(local69, local50.aShort30 & 0xFFFF));
						} else if (local50.anInt1870 == -1) {
							arg5.method1850(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort31 & 0xFFFF, local50.aShort30 & 0xFFFF, local50.aShort32 & 0xFFFF);
							arg5.method1850(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort33 & 0xFFFF, local50.aShort32 & 0xFFFF, local50.aShort30 & 0xFFFF);
						} else {
							local69 = local50.anInt1870;
							arg5.method1850(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method1850(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass59ArrayArray1[local22][local25] != null) {
						@Pc(249) Class59 local249 = this.aClass59ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort34; local69++) {
							arg6[local69] = local16 + (local249.anIntArray155[local69] - local22 * this.anInt4871) * 4 / this.anInt4871;
							arg7[local69] = local20 - (local249.anIntArray156[local69] - local25 * this.anInt4871) * 4 / this.anInt4871;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort35; local297++) {
							@Pc(303) short local303 = local249.aShortArray51[local297];
							@Pc(308) short local308 = local249.aShortArray48[local297];
							@Pc(313) short local313 = local249.aShortArray50[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray153 != null && local249.anIntArray153[local297] != -1) {
								local351 = local249.anIntArray153[local297];
								arg5.method1850(local329, local333, local337, local317, local321, local325, Static255.method4772(local351, local249.aShortArray52[local303]), Static255.method4772(local351, local249.aShortArray52[local308]), Static255.method4772(local351, local249.aShortArray52[local313]));
							} else if (local249.aShortArray49 == null || local249.aShortArray49[local297] == -1) {
								local351 = local249.anIntArray157[local297];
								arg5.method1850(local329, local333, local337, local317, local321, local325, Static255.method4772(local351, local249.aShortArray52[local303]), Static255.method4772(local351, local249.aShortArray52[local308]), Static255.method4772(local351, local249.aShortArray52[local313]));
							} else {
								local351 = this.aClass63_Sub2_8.method4666(local249.aShortArray49[local297]);
								arg5.method1850(local329, local333, local337, local317, local321, local325, Static255.method4772(local351, local249.aShortArray52[local303]), Static255.method4772(local351, local249.aShortArray52[local308]), Static255.method4772(local351, local249.aShortArray52[local313]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean139 = true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		if (this.aClass69ArrayArray1 == null) {
			this.aClass69ArrayArray1 = new Class69[super.anInt4858][super.anInt4859];
			this.aClass188ArrayArray1 = new Class188[super.anInt4858][super.anInt4859];
		} else if (this.aClass53ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg5.length; local32++) {
			if (arg5[local32] == -1) {
				arg5[local32] = 0;
			} else {
				arg5[local32] = Static170.anIntArray264[Static28.method693(arg5[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg6 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg6.length; local68++) {
				if (arg6[local68] == -1) {
					arg6[local68] = 0;
				} else {
					arg6[local68] = Static170.anIntArray264[Static28.method693(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == this.anInt4871 && arg4[local116] == 0) {
					if (local106 != -1 && arg5[local106] != arg5[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt4871 && arg4[local116] == this.anInt4871) {
					if (local108 != -1 && arg5[local108] != arg5[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt4871) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt4871 && arg2[local244] != arg2[0] - this.anInt4871) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt4871 && arg4[local244] != arg4[0] - this.anInt4871) {
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
			@Pc(334) Class69 local334 = new Class69();
			local244 = arg5[0];
			local342 = arg7[0];
			if (arg6 != null) {
				local334.anInt2182 = arg6[0] >> 8;
				if (local244 == 0) {
					local334.aByte15 = (byte) (local334.aByte15 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray49[arg0][arg1] == this.anIntArrayArray49[arg0 + 1][arg1] && this.anIntArrayArray49[arg0][arg1] == this.anIntArrayArray49[arg0 + 1][arg1 + 1] && this.anIntArrayArray49[arg0][arg1] == this.anIntArrayArray49[arg0][arg1 + 1]) {
				local334.aByte15 = (byte) (local334.aByte15 | 0x1);
			}
			if (local342 == -1 || (local334.aByte15 & 0x2) != 0 || this.aClass63_Sub2_8.anInterface3_6.method5486(local342).aBoolean390) {
				if (this.anIntArrayArray48 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray48[arg0][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt2179 = Static353.method5817(Static380.method4448(arg5[local104] >> 8, this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]), local531, arg9);
				if (local334.anInt2182 != 0) {
					local334.anInt2179 |= this.aByteArrayArray15[arg0][arg1] + 255 - this.aByteArrayArray14[arg0][arg1] << 25;
				}
				if (this.anIntArrayArray48 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray48[arg0 + 1][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt2181 = Static353.method5817(Static380.method4448(arg5[local106] >> 8, this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]), local531, arg9);
				if (local334.anInt2182 != 0) {
					local334.anInt2181 |= this.aByteArrayArray15[arg0 + 1][arg1] + 255 - this.aByteArrayArray14[arg0 + 1][arg1] << 25;
				}
				if (this.anIntArrayArray48 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray48[arg0 + 1][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt2180 = Static353.method5817(Static380.method4448(arg5[local108] >> 8, this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]), local531, arg9);
				if (local334.anInt2182 != 0) {
					local334.anInt2180 |= this.aByteArrayArray15[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray14[arg0 + 1][arg1 + 1] << 25;
				}
				if (this.anIntArrayArray48 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray48[arg0][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt2178 = Static353.method5817(Static380.method4448(arg5[local110] >> 8, this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]), local531, arg9);
				if (local334.anInt2182 != 0) {
					local334.anInt2178 |= this.aByteArrayArray15[arg0][arg1 + 1] + 255 - this.aByteArrayArray14[arg0][arg1 + 1] << 25;
				}
				local334.aShort36 = -1;
			} else {
				local334.anInt2179 = this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1];
				local334.anInt2181 = this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1];
				local334.anInt2180 = this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1];
				local334.anInt2178 = this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1];
				local334.aShort36 = (short) local342;
			}
			this.aClass69ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(886) Class188 local886 = new Class188();
		local886.aShort78 = (short) arg2.length;
		local886.aShort79 = (short) (arg2.length / 3);
		local886.aShortArray95 = new short[local886.aShort78];
		local886.aShortArray93 = new short[local886.aShort78];
		local886.aShortArray96 = new short[local886.aShort78];
		local886.anIntArray425 = new int[local886.aShort78];
		if (this.anIntArrayArray48 != null) {
			local886.aShortArray94 = new short[local886.aShort78];
		}
		@Pc(957) int local957;
		@Pc(1078) int local1078;
		@Pc(1125) int local1125;
		@Pc(1225) int local1225;
		@Pc(1344) int local1344;
		for (local244 = 0; local244 < local886.aShort78; local244++) {
			local342 = arg2[local244];
			local531 = arg4[local244];
			if (local342 == 0 && local531 == 0) {
				local957 = this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1];
			} else if (local342 == 0 && local531 == this.anInt4871) {
				local957 = this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1];
			} else if (local342 == this.anInt4871 && local531 == this.anInt4871) {
				local957 = this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt4871 && local531 == 0) {
				local957 = this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1];
			} else {
				local1078 = (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]) * (this.anInt4871 - local342) + (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]) * local342;
				local1125 = (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]) * (this.anInt4871 - local342) + (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]) * local342;
				local957 = local1078 * (this.anInt4871 - local531) + local1125 * local531 >> this.anInt4862 * 2;
			}
			@Pc(1149) short local1149 = (short) ((arg0 << this.anInt4862) + local342);
			@Pc(1157) short local1157 = (short) ((arg1 << this.anInt4862) + local531);
			local886.aShortArray95[local244] = local1149;
			local886.aShortArray96[local244] = local1157;
			local886.aShortArray93[local244] = (short) (this.method4433(local1149, local1157) + (arg3 == null ? 0 : arg3[local244]));
			if (local957 < 0) {
				local957 = 0;
			}
			if (arg7[local244] != -1 && !this.aClass63_Sub2_8.anInterface3_6.method5486(arg7[local244]).aBoolean390) {
				local886.anIntArray425[local244] = local957;
			} else if (arg5[local244] != 0) {
				local1225 = 0;
				if (this.anIntArrayArray48 != null) {
					@Pc(1241) int local1241;
					if (local342 == 0 && local531 == 0) {
						local1241 = this.anIntArrayArray48[arg0][arg1];
					} else if (local342 == 0 && local531 == this.anInt4871) {
						local1241 = this.anIntArrayArray48[arg0][arg1 + 1];
					} else if (local342 == this.anInt4871 && local531 == this.anInt4871) {
						local1241 = this.anIntArrayArray48[arg0 + 1][arg1 + 1];
					} else if (local342 == this.anInt4871 && local531 == 0) {
						local1241 = this.anIntArrayArray48[arg0 + 1][arg1];
					} else {
						@Pc(1317) int local1317 = this.anIntArrayArray48[arg0][arg1] * (this.anInt4871 - local342) + this.anIntArrayArray48[arg0 + 1][arg1] * local342;
						local1344 = this.anIntArrayArray48[arg0][arg1 + 1] * (this.anInt4871 - local342) + this.anIntArrayArray48[arg0 + 1][arg1 + 1] * local342;
						local1241 = local1317 * (this.anInt4871 - local531) + local1344 * local531 >> this.anInt4862 * 2;
					}
					local886.aShortArray94[local244] = (short) local1241;
					if (arg10 != 0) {
						local1225 = local1241 * 255 / arg10;
						if (local1225 < 0) {
							local1225 = 0;
						} else if (local1225 > 255) {
							local1225 = 255;
						}
					}
				}
				local886.anIntArray425[local244] = Static353.method5817(Static380.method4448(arg5[local244] >> 8, local957), local1225, arg9);
				if (arg6 != null) {
					local886.anIntArray425[local244] |= local957 << 25;
				}
			} else if (arg6 == null) {
				local886.anIntArray425[local244] = 0;
			} else {
				local886.anIntArray425[local244] = local957 << 25;
			}
		}
		@Pc(1424) boolean local1424 = false;
		for (local531 = 0; local531 < local886.aShort79; local531++) {
			if (arg7[local531 * 3] != -1 && !this.aClass63_Sub2_8.anInterface3_6.method5486(arg7[local531 * 3]).aBoolean390) {
				local1424 = true;
			}
		}
		if (arg6 != null) {
			local886.anIntArray424 = new int[local886.aShort79];
		}
		if (local1424) {
			local886.aShortArray92 = new short[local886.aShort79];
			local886.aShortArray91 = new short[local886.aShort79];
		}
		for (local957 = 0; local957 < local886.aShort79; local957++) {
			local1078 = local957 * 3;
			if (arg6 != null && arg6[local1078] != 0) {
				local886.anIntArray424[local957] = arg6[local1078] >> 8;
			}
			if (local1424) {
				local1125 = local1078 + 1;
				local1225 = local1125 + 1;
				@Pc(1506) boolean local1506 = false;
				@Pc(1508) boolean local1508 = true;
				local1344 = arg7[local1078];
				if (local1344 == -1 || this.aClass63_Sub2_8.anInterface3_6.method5486(local1344).aBoolean390) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1125];
				if (local1344 == -1 || this.aClass63_Sub2_8.anInterface3_6.method5486(local1344).aBoolean390) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1225];
				if (local1344 == -1 || this.aClass63_Sub2_8.anInterface3_6.method5486(local1344).aBoolean390) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				if (local1508) {
					local886.aShortArray92[local957] = (short) local1344;
					local886.aShortArray91[local957] = (short) arg8[local1078];
				} else {
					if (local1506) {
						local1344 = arg7[local1078];
						if (local1344 != -1 && !this.aClass63_Sub2_8.anInterface3_6.method5486(local1344).aBoolean390) {
							local886.anIntArray425[local1078] = Static170.anIntArray264[Static28.method693(this.aClass63_Sub2_8.anInterface3_6.method5486(local1344).aShort72 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1125];
						if (local1344 != -1 && !this.aClass63_Sub2_8.anInterface3_6.method5486(local1344).aBoolean390) {
							local886.anIntArray425[local1125] = Static170.anIntArray264[Static28.method693(this.aClass63_Sub2_8.anInterface3_6.method5486(local1344).aShort72 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1225];
						if (local1344 != -1 && !this.aClass63_Sub2_8.anInterface3_6.method5486(local1344).aBoolean390) {
							local886.anIntArray425[local1225] = Static170.anIntArray264[Static28.method693(this.aClass63_Sub2_8.anInterface3_6.method5486(local1344).aShort72 & 0xFFFF) & 0xFFFF];
						}
					}
					local886.aShortArray92[local957] = -1;
				}
			}
		}
		this.aClass188ArrayArray1[arg0][arg1] = local886;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILclient!fi;[I[I[I)V")
	private void method4453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class53 local6 = this.aClass53ArrayArray1[arg0][arg1];
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
			@Pc(996) Class59 local996 = this.aClass59ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort34; local349++) {
					local24 = local996.anIntArray155[local349];
					local29 = local996.anIntArray154[local349];
					local34 = local996.anIntArray156[local349];
					local293 = this.anInt4866 + (this.anInt4874 * local24 + this.anInt4868 * local29 + this.anInt4873 * local34 >> 15);
					if (local293 <= this.aClass63_Sub2_8.anInt5017) {
						return;
					}
					local181 = this.anInt4865 + (this.anInt4861 * local24 + this.anInt4870 * local29 + this.anInt4860 * local34 >> 15);
					local237 = this.anInt4867 + (this.anInt4872 * local24 + this.anInt4863 * local29 + this.anInt4864 * local34 >> 15);
					arg3[local349] = arg2.anInt1963 + local181 * this.aClass63_Sub2_8.anInt5043 / local293;
					arg4[local349] = arg2.anInt1961 + local237 * this.aClass63_Sub2_8.anInt5021 / local293;
				}
				if (local996.aShortArray49 != null) {
					local209 = this.anIntArrayArray49[arg0][arg1];
					local265 = this.anIntArrayArray49[arg0 + 1][arg1];
					local321 = this.anIntArrayArray49[arg0][arg1 + 1];
					local377 = arg0 * this.anInt4871;
					local170 = local377 + this.anInt4871;
					local226 = arg1 * this.anInt4871;
					local282 = local226 + this.anInt4871;
					local338 = this.anInt4865 + (this.anInt4861 * local377 + this.anInt4870 * local209 + this.anInt4860 * local226 >> 15);
					local198 = this.anInt4867 + (this.anInt4872 * local377 + this.anInt4863 * local209 + this.anInt4864 * local226 >> 15);
					local254 = this.anInt4866 + (this.anInt4874 * local377 + this.anInt4868 * local209 + this.anInt4873 * local226 >> 15);
					local310 = this.anInt4865 + (this.anInt4861 * local170 + this.anInt4870 * local265 + this.anInt4860 * local226 >> 15);
					local366 = this.anInt4867 + (this.anInt4872 * local170 + this.anInt4863 * local265 + this.anInt4864 * local226 >> 15);
					local68 = this.anInt4866 + (this.anInt4874 * local170 + this.anInt4868 * local265 + this.anInt4873 * local226 >> 15);
					local91 = this.anInt4865 + (this.anInt4861 * local377 + this.anInt4870 * local321 + this.anInt4860 * local282 >> 15);
					local114 = this.anInt4867 + (this.anInt4872 * local377 + this.anInt4863 * local321 + this.anInt4864 * local282 >> 15);
					local137 = this.anInt4866 + (this.anInt4874 * local377 + this.anInt4868 * local321 + this.anInt4873 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort35; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray51[local46];
						@Pc(1354) short local1354 = local996.aShortArray48[local46];
						@Pc(1359) short local1359 = local996.aShortArray50[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean138 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt1960 || local1367 > arg2.anInt1960 || local1371 > arg2.anInt1960;
							@Pc(1427) short local1427 = local996.aShortArray49[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray157[local46];
								if (local1482 != -1) {
									arg2.method1850(local1375, local1379, local1383, local1363, local1367, local1371, Static255.method4772(local1482, local996.aShortArray52[local1349]), Static255.method4772(local1482, local996.aShortArray52[local1354]), Static255.method4772(local1482, local996.aShortArray52[local1359]));
								}
							} else {
								if (this.method4450(this.aClass63_Sub2_8.anInterface3_6.method5486(local1427).aByte54)) {
									arg2.anInt1962 = 100;
								}
								arg2.method1844(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray52[local1349], local996.aShortArray52[local1354], local996.aShortArray52[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt1962 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort35; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray51[local209];
					@Pc(1533) short local1533 = local996.aShortArray48[local209];
					@Pc(1538) short local1538 = local996.aShortArray50[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray157[local209];
						if (local310 != -1) {
							arg2.aBoolean138 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt1960 || local226 > arg2.anInt1960 || local282 > arg2.anInt1960;
							arg2.method1850(local338, local198, local254, local170, local226, local282, Static255.method4772(local310, local996.aShortArray52[local1528]), Static255.method4772(local310, local996.aShortArray52[local1533]), Static255.method4772(local310, local996.aShortArray52[local1538]));
						}
					}
				}
			}
		} else if ((local6.aByte14 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt4871;
			local24 = local19 + this.anInt4871;
			local29 = arg1 * this.anInt4871;
			local34 = local29 + this.anInt4871;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte14 & 0x1) == 0) {
				local46 = this.anIntArrayArray49[arg0][arg1];
				local51 = this.anIntArrayArray49[arg0 + 1][arg1];
				local148 = this.anIntArrayArray49[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray49[arg0][arg1 + 1];
				local68 = this.anInt4866 + (this.anInt4874 * local19 + this.anInt4868 * local46 + this.anInt4873 * local29 >> 15);
				if (local68 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local91 = this.anInt4866 + (this.anInt4874 * local24 + this.anInt4868 * local51 + this.anInt4873 * local29 >> 15);
				if (local91 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local114 = this.anInt4866 + (this.anInt4874 * local24 + this.anInt4868 * local148 + this.anInt4873 * local34 >> 15);
				if (local114 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local137 = this.anInt4866 + (this.anInt4874 * local19 + this.anInt4868 * local153 + this.anInt4873 * local34 >> 15);
				if (local137 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local170 = this.anInt4865 + (this.anInt4861 * local19 + this.anInt4870 * local46 + this.anInt4860 * local29 >> 15);
				local181 = arg2.anInt1963 + local170 * this.aClass63_Sub2_8.anInt5043 / local68;
				local198 = this.anInt4867 + (this.anInt4872 * local19 + this.anInt4863 * local46 + this.anInt4864 * local29 >> 15);
				local209 = arg2.anInt1961 + local198 * this.aClass63_Sub2_8.anInt5021 / local68;
				local226 = this.anInt4865 + (this.anInt4861 * local24 + this.anInt4870 * local51 + this.anInt4860 * local29 >> 15);
				local237 = arg2.anInt1963 + local226 * this.aClass63_Sub2_8.anInt5043 / local91;
				local254 = this.anInt4867 + (this.anInt4872 * local24 + this.anInt4863 * local51 + this.anInt4864 * local29 >> 15);
				local265 = arg2.anInt1961 + local254 * this.aClass63_Sub2_8.anInt5021 / local91;
				local282 = this.anInt4865 + (this.anInt4861 * local24 + this.anInt4870 * local148 + this.anInt4860 * local34 >> 15);
				local293 = arg2.anInt1963 + local282 * this.aClass63_Sub2_8.anInt5043 / local114;
				local310 = this.anInt4867 + (this.anInt4872 * local24 + this.anInt4863 * local148 + this.anInt4864 * local34 >> 15);
				local321 = arg2.anInt1961 + local310 * this.aClass63_Sub2_8.anInt5021 / local114;
				local338 = this.anInt4865 + (this.anInt4861 * local19 + this.anInt4870 * local153 + this.anInt4860 * local34 >> 15);
				local349 = arg2.anInt1963 + local338 * this.aClass63_Sub2_8.anInt5043 / local137;
				local366 = this.anInt4867 + (this.anInt4872 * local19 + this.anInt4863 * local153 + this.anInt4864 * local34 >> 15);
				local377 = arg2.anInt1961 + local366 * this.aClass63_Sub2_8.anInt5021 / local137;
			} else {
				local46 = this.anIntArrayArray49[arg0][arg1];
				local51 = this.anInt4868 * local46;
				local68 = this.anInt4866 + (this.anInt4874 * local19 + local51 + this.anInt4873 * local29 >> 15);
				if (local68 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local91 = this.anInt4866 + (this.anInt4874 * local24 + local51 + this.anInt4873 * local29 >> 15);
				if (local91 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local114 = this.anInt4866 + (this.anInt4874 * local24 + local51 + this.anInt4873 * local34 >> 15);
				if (local114 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local137 = this.anInt4866 + (this.anInt4874 * local19 + local51 + this.anInt4873 * local34 >> 15);
				if (local137 <= this.aClass63_Sub2_8.anInt5017) {
					return;
				}
				local148 = this.anInt4870 * local46;
				local153 = this.anInt4863 * local46;
				local170 = this.anInt4865 + (this.anInt4861 * local19 + local148 + this.anInt4860 * local29 >> 15);
				local181 = arg2.anInt1963 + local170 * this.aClass63_Sub2_8.anInt5043 / local68;
				local198 = this.anInt4867 + (this.anInt4872 * local19 + local153 + this.anInt4864 * local29 >> 15);
				local209 = arg2.anInt1961 + local198 * this.aClass63_Sub2_8.anInt5021 / local68;
				local226 = this.anInt4865 + (this.anInt4861 * local24 + local148 + this.anInt4860 * local29 >> 15);
				local237 = arg2.anInt1963 + local226 * this.aClass63_Sub2_8.anInt5043 / local91;
				local254 = this.anInt4867 + (this.anInt4872 * local24 + local153 + this.anInt4864 * local29 >> 15);
				local265 = arg2.anInt1961 + local254 * this.aClass63_Sub2_8.anInt5021 / local91;
				local282 = this.anInt4865 + (this.anInt4861 * local24 + local148 + this.anInt4860 * local34 >> 15);
				local293 = arg2.anInt1963 + local282 * this.aClass63_Sub2_8.anInt5043 / local114;
				local310 = this.anInt4867 + (this.anInt4872 * local24 + local153 + this.anInt4864 * local34 >> 15);
				local321 = arg2.anInt1961 + local310 * this.aClass63_Sub2_8.anInt5021 / local114;
				local338 = this.anInt4865 + (this.anInt4861 * local19 + local148 + this.anInt4860 * local34 >> 15);
				local349 = arg2.anInt1963 + local338 * this.aClass63_Sub2_8.anInt5043 / local137;
				local366 = this.anInt4867 + (this.anInt4872 * local19 + local153 + this.anInt4864 * local34 >> 15);
				local377 = arg2.anInt1961 + local366 * this.aClass63_Sub2_8.anInt5021 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean138 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt1960 || local349 > arg2.anInt1960 || local237 > arg2.anInt1960;
				if (local6.aShort29 >= 0) {
					if (this.method4450(this.aClass63_Sub2_8.anInterface3_6.method5486(local6.aShort29).aByte54)) {
						arg2.anInt1962 = 100;
					}
					arg2.method1844(local321, local377, local265, local293, local349, local237, local6.aShort31 & 0xFFFF, local6.aShort30 & 0xFFFF, local6.aShort32 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort29);
					arg2.anInt1962 = 0;
				} else {
					arg2.method1850(local321, local377, local265, local293, local349, local237, local6.aShort31 & 0xFFFF, local6.aShort30 & 0xFFFF, local6.aShort32 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean138 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt1960 || local237 > arg2.anInt1960 || local349 > arg2.anInt1960;
				if (local6.aShort29 >= 0) {
					if (this.method4450(this.aClass63_Sub2_8.anInterface3_6.method5486(local6.aShort29).aByte54)) {
						arg2.anInt1962 = 100;
					}
					arg2.method1844(local209, local265, local377, local181, local237, local349, local6.aShort33 & 0xFFFF, local6.aShort32 & 0xFFFF, local6.aShort30 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort29);
					arg2.anInt1962 = 0;
					return;
				}
				arg2.method1850(local209, local265, local377, local181, local237, local349, local6.aShort33 & 0xFFFF, local6.aShort32 & 0xFFFF, local6.aShort30 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
	@Override
	public void method4434() {
		this.aByteArrayArray14 = null;
		this.aByteArrayArray15 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILclient!qh;)Lclient!qh;")
	@Override
	public Class1_Sub4_Sub4 method4435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub4_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(Lclient!qh;IIIIZ)Z")
	@Override
	public boolean method4445(@OriginalArg(0) Class1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (this.aClass53ArrayArray1 == null) {
			this.aClass53ArrayArray1 = new Class53[super.anInt4858][super.anInt4859];
			this.aClass59ArrayArray1 = new Class59[super.anInt4858][super.anInt4859];
		} else if (this.aClass69ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != this.anInt4871 || local70 != 0 && local70 != this.anInt4871) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class59 local95 = new Class59();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg8.length;
			local95.aShort34 = local99;
			local95.aShortArray52 = new short[local99];
			local95.anIntArray155 = new int[local99];
			local95.anIntArray154 = new int[local99];
			local95.anIntArray156 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray52[local124] = (short) (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt4871) {
					local95.aShortArray52[local124] = (short) (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]);
				} else if (local129 == this.anInt4871 && local133 == this.anInt4871) {
					local95.aShortArray52[local124] = (short) (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt4871 && local133 == 0) {
					local95.aShortArray52[local124] = (short) (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]) * (this.anInt4871 - local129) + (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]) * (this.anInt4871 - local129) + (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray52[local124] = (short) (local288 * (this.anInt4871 - local133) + local335 * local133 >> this.anInt4862 * 2);
				}
				local288 = (arg0 << this.anInt4862) + local129;
				local335 = (arg1 << this.anInt4862) + local133;
				local95.anIntArray155[local124] = local288;
				local95.anIntArray156[local124] = local335;
				local95.anIntArray154[local124] = this.method4433(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray52[local124] < 2) {
					local95.aShortArray52[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg8[local288] >= 0 || arg9 != null && arg9[local288] >= 0) {
					local133++;
				}
				if (arg10[local288] != -1 && !this.aClass63_Sub2_8.anInterface3_6.method5486(arg10[local288]).aBoolean390) {
					local412 = true;
				}
			}
			local95.anIntArray157 = new int[local133];
			if (arg9 != null) {
				local95.anIntArray153 = new int[local133];
			}
			local95.aShortArray51 = new short[local133];
			local95.aShortArray48 = new short[local133];
			local95.aShortArray50 = new short[local133];
			if (local412) {
				local95.aShortArray49 = new short[local133];
				local95.aShortArray47 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg8[local335] >= 0 || arg9 != null && arg9[local335] >= 0) {
					if (arg8[local335] >= 0) {
						local95.anIntArray157[local95.aShort35] = Static28.method693(arg8[local335]);
					} else {
						local95.anIntArray157[local95.aShort35] = -1;
					}
					if (arg9 != null) {
						if (arg9[local335] == -1) {
							local95.anIntArray153[local95.aShort35] = -1;
						} else {
							local95.anIntArray153[local95.aShort35] = Static28.method693(arg9[local335]);
						}
					}
					local95.aShortArray51[local95.aShort35] = (short) arg5[local335];
					local95.aShortArray48[local95.aShort35] = (short) arg6[local335];
					local95.aShortArray50[local95.aShort35] = (short) arg7[local335];
					if (local412) {
						if (arg10[local335] == -1 || this.aClass63_Sub2_8.anInterface3_6.method5486(arg10[local335]).aBoolean390) {
							local95.aShortArray49[local95.aShort35] = -1;
						} else {
							local95.aShortArray49[local95.aShort35] = (short) arg10[local335];
							local95.aShortArray47[local95.aShort35] = (short) arg11[local335];
						}
					}
					local95.aShort35++;
				}
			}
			this.aClass59ArrayArray1[arg0][arg1] = local95;
		} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
			@Pc(641) Class53 local641 = new Class53();
			local64 = arg8[0];
			local70 = arg10[0];
			if (arg9 != null) {
				local641.anInt1870 = Static255.method4772(Static28.method693(arg9[0]), this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]);
				if (local64 == -1) {
					local641.aByte14 = (byte) (local641.aByte14 | 0x2);
				}
			}
			if (this.anIntArrayArray49[arg0][arg1] == this.anIntArrayArray49[arg0 + 1][arg1] && this.anIntArrayArray49[arg0][arg1] == this.anIntArrayArray49[arg0 + 1][arg1 + 1] && this.anIntArrayArray49[arg0][arg1] == this.anIntArrayArray49[arg0][arg1 + 1]) {
				local641.aByte14 = (byte) (local641.aByte14 | 0x1);
			}
			if (local70 == -1 || (local641.aByte14 & 0x2) != 0 || this.aClass63_Sub2_8.anInterface3_6.method5486(local70).aBoolean390) {
				@Pc(842) short local842 = Static28.method693(local64);
				local641.aShort33 = (short) Static255.method4772(local842, this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]);
				local641.aShort32 = (short) Static255.method4772(local842, this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]);
				local641.aShort31 = (short) Static255.method4772(local842, this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]);
				local641.aShort30 = (short) Static255.method4772(local842, this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]);
				local641.aShort29 = -1;
			} else {
				local641.aShort33 = (short) (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray15[arg0][arg1]);
				local641.aShort32 = (short) (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray15[arg0 + 1][arg1]);
				local641.aShort31 = (short) (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray15[arg0 + 1][arg1 + 1]);
				local641.aShort30 = (short) (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray15[arg0][arg1 + 1]);
				local641.aShort29 = (short) local70;
			}
			this.aClass53ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V")
	@Override
	public void method4441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class144 local4 = this.aClass63_Sub2_8.method4668(Thread.currentThread());
		local4.aClass58_2.anInt1962 = 0;
		if (this.aClass69ArrayArray1 != null) {
			this.method4449(arg0, arg1, this.aClass63_Sub2_8.aBoolean377, local4.aClass58_2, local4.anIntArray339, local4.anIntArray321, local4.anIntArray325);
		} else if (this.aClass53ArrayArray1 != null) {
			this.method4453(arg0, arg1, local4.aClass58_2, local4.anIntArray339, local4.anIntArray321, local4.anIntArray325);
		}
	}
}
