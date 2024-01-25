import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class75 {

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "[[Lclient!fa;")
	private final Class11_Sub5_Sub1[][] aClass11_Sub5_Sub1ArrayArray1 = new Class11_Sub5_Sub1[1600][64];

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "[I")
	private final int[] anIntArray171 = new int[8191];

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "[I")
	private final int[] anIntArray169 = new int[64];

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	private int anInt1896 = 0;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "[I")
	private final int[] anIntArray172 = new int[1600];

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "[[Lclient!fa;")
	private final Class11_Sub5_Sub1[][] aClass11_Sub5_Sub1ArrayArray2 = new Class11_Sub5_Sub1[64][768];

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Lclient!hi;")
	private final Class147 aClass147_1;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "Lclient!caa;")
	private final Interface3 anInterface3_2;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!caa;")
	private final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Lclient!ida;")
	private final Interface10 anInterface10_3;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!gt;)V")
	public Class75(@OriginalArg(0) Class87_Sub1 arg0) {
		this.aClass147_1 = arg0.method5083(new Class241[] { new Class241(new Class365[] { Static620.aClass365_1, Static620.aClass365_3, Static620.aClass365_5 }), new Class241(Static620.aClass365_2) });
		this.anInterface3_2 = arg0.method5043(true);
		this.anInterface3_3 = arg0.method5043(false);
		this.anInterface3_3.method7186(12, 393168);
		this.anInterface10_3 = arg0.method5087(false);
		this.anInterface10_3.method7675(49146);
		@Pc(96) Buffer local96 = this.anInterface10_3.method7682();
		@Pc(112) int local112;
		if (local96 != null) {
			@Pc(103) Stream local103 = arg0.method5128(local96);
			@Pc(107) int local107;
			if (Stream.b()) {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.c(local112);
					local103.c(local112 + 1);
					local103.c(local112 + 2);
					local103.c(local112 + 2);
					local103.c(local112 + 3);
					local103.c(local112);
				}
			} else {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.d(local112);
					local103.d(local112 + 1);
					local103.d(local112 + 2);
					local103.d(local112 + 2);
					local103.d(local112 + 3);
					local103.d(local112);
				}
			}
			local103.a();
			this.anInterface10_3.method7683();
		}
		@Pc(195) Buffer local195 = this.anInterface3_3.method7189();
		if (local195 != null) {
			@Pc(202) Stream local202 = arg0.method5128(local195);
			if (Stream.b()) {
				for (local112 = 0; local112 < 8191; local112++) {
					local202.b(0.0F);
					local202.b(-1.0F);
					local202.b(0.0F);
					local202.b(0.0F);
					local202.b(-1.0F);
					local202.b(0.0F);
					local202.b(0.0F);
					local202.b(-1.0F);
					local202.b(0.0F);
					local202.b(0.0F);
					local202.b(-1.0F);
					local202.b(0.0F);
				}
			} else {
				for (local112 = 0; local112 < 8191; local112++) {
					local202.a(0.0F);
					local202.a(-1.0F);
					local202.a(0.0F);
					local202.a(0.0F);
					local202.a(-1.0F);
					local202.a(0.0F);
					local202.a(0.0F);
					local202.a(-1.0F);
					local202.a(0.0F);
					local202.a(0.0F);
					local202.a(-1.0F);
					local202.a(0.0F);
				}
			}
			local202.a();
			this.anInterface3_3.method7187();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!gt;II)V")
	private void method1660(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static140.aFloat70 = arg0.aFloat140;
		arg0.method5020((float) arg1);
		arg0.method5041();
		arg0.method5135(false);
		arg0.method5053(false);
		arg0.method5047();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public void method1661() {
		this.anInterface3_2.method7671();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!gt;B)V")
	public void method1662(@OriginalArg(0) Class87_Sub1 arg0) {
		this.anInterface3_2.method7186(24, 786336);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!gt;Lclient!oo;IZ)V")
	public void method1663(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2) {
		if (arg0.aClass6_Sub2_16 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method1660(arg0, arg2);
		} else {
			this.method1668(arg0);
		}
		@Pc(26) float local26 = arg0.aClass6_Sub2_16.aFloat77;
		@Pc(30) float local30 = arg0.aClass6_Sub2_16.aFloat74;
		@Pc(34) float local34 = arg0.aClass6_Sub2_16.aFloat76;
		@Pc(38) float local38 = arg0.aClass6_Sub2_16.aFloat72;
		try {
			@Pc(40) int local40 = 0;
			@Pc(48) int local48 = Integer.MAX_VALUE;
			@Pc(50) int local50 = 0;
			@Pc(54) Class11_Sub5 local54 = arg1.aClass34_1.aClass11_Sub5_1;
			@Pc(57) Class11_Sub5 local57;
			@Pc(89) int local89;
			for (local57 = local54.aClass11_Sub5_10; local57 != local54; local57 = local57.aClass11_Sub5_10) {
				@Pc(62) Class11_Sub5_Sub1 local62 = (Class11_Sub5_Sub1) local57;
				local89 = (int) (local38 + (float) (local62.anInt4043 >> 12) * local26 + local30 * (float) (local62.anInt4041 >> 12) + (float) (local62.anInt4044 >> 12) * local34);
				if (local48 > local89) {
					local48 = local89;
				}
				this.anIntArray171[local40++] = local89;
				if (local50 < local89) {
					local50 = local89;
				}
			}
			@Pc(119) int local119 = local50 - local48;
			if (local119 + 2 > 1600) {
				local89 = Static420.method6395(local119) + 1 - Static532.anInt8899;
				local119 = (local119 >> local89) + 2;
			} else {
				local89 = 0;
				local119 += 2;
			}
			local57 = local54.aClass11_Sub5_10;
			local40 = 0;
			@Pc(152) int local152 = -2;
			@Pc(154) boolean local154 = true;
			@Pc(156) boolean local156 = true;
			while (local54 != local57) {
				this.anInt1896 = 0;
				for (@Pc(163) int local163 = 0; local163 < local119; local163++) {
					this.anIntArray172[local163] = 0;
				}
				for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
					this.anIntArray169[local176] = 0;
				}
				while (local54 != local57) {
					@Pc(194) Class11_Sub5_Sub1 local194 = (Class11_Sub5_Sub1) local57;
					if (local156) {
						local156 = false;
						local152 = local194.anInt4046;
						local154 = local194.aBoolean339;
					}
					if (local40 > 0 && (local152 != local194.anInt4046 || local154 != local194.aBoolean339)) {
						local156 = true;
						break;
					}
					@Pc(236) int local236 = this.anIntArray171[local40++] - local48 >> local89;
					if (local236 < 1600) {
						if (this.anIntArray172[local236] < 64) {
							this.aClass11_Sub5_Sub1ArrayArray1[local236][this.anIntArray172[local236]++] = local194;
						} else {
							label97: {
								if (this.anIntArray172[local236] == 64) {
									if (this.anInt1896 == 64) {
										break label97;
									}
									this.anIntArray172[local236] += this.anInt1896++ + 1;
								}
								this.aClass11_Sub5_Sub1ArrayArray2[this.anIntArray172[local236] - 1 - 64][this.anIntArray169[this.anIntArray172[local236] - 1 - 64]++] = local194;
							}
						}
					}
					local57 = local57.aClass11_Sub5_10;
				}
				arg0.method5071(false, false, local152 >= 0 ? local152 : -1);
				if (local154 && arg0.aFloat140 != Static140.aFloat70) {
					arg0.xa(Static140.aFloat70);
				} else if (arg0.aFloat140 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method1666(arg0, local119);
			}
		} catch (@Pc(372) Exception local372) {
		}
		this.method1667(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lclient!gt;II)V")
	private void method1666(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(13) Class6_Sub2 local13 = arg0.method5100();
		@Pc(16) float local16 = local13.aFloat81;
		@Pc(19) float local19 = local13.aFloat80;
		@Pc(22) float local22 = local13.aFloat71;
		@Pc(25) float local25 = local13.aFloat73;
		@Pc(28) float local28 = local13.aFloat82;
		@Pc(37) float local37 = local13.aFloat79;
		@Pc(41) float local41 = local25 + local16;
		@Pc(45) float local45 = local28 + local19;
		@Pc(49) float local49 = local37 + local22;
		@Pc(53) float local53 = local16 - local25;
		@Pc(58) float local58 = local19 - local28;
		@Pc(62) float local62 = local22 - local37;
		@Pc(67) float local67 = local25 - local16;
		@Pc(71) float local71 = local28 - local19;
		@Pc(76) float local76 = local37 - local22;
		@Pc(82) Buffer local82 = this.anInterface3_2.method7189();
		if (local82 == null) {
			return;
		}
		@Pc(90) Stream local90 = arg0.method5128(local82);
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(122) int local122;
		@Pc(131) Class11_Sub5_Sub1 local131;
		@Pc(134) int local134;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(147) byte local147;
		@Pc(152) byte local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(170) float local170;
		@Pc(175) int local175;
		@Pc(446) float local446;
		@Pc(451) int local451;
		@Pc(391) int local391;
		@Pc(407) Class11_Sub5_Sub1 local407;
		@Pc(410) int local410;
		@Pc(423) byte local423;
		@Pc(428) byte local428;
		@Pc(440) float local440;
		if (Stream.b()) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray172[local96] > 64 ? 64 : this.anIntArray172[local96];
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass11_Sub5_Sub1ArrayArray1[local96][local122];
						local134 = local131.anInt4045;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt4043 >> 12;
						local164 = local131.anInt4041 >> 12;
						local170 = local131.anInt4044 >> 12;
						local175 = local131.anInt4047 >> 12;
						local90.b(local158 + (float) -local175 * local41);
						local90.b((float) -local175 * local45 + local164);
						local90.b((float) -local175 * local49 + local170);
						if (arg0.anInt6133 == 0) {
							local90.b(local139, local144, local147, local152);
						} else {
							local90.a(local139, local144, local147, local152);
						}
						local90.b(0.0F);
						local90.b(0.0F);
						local90.b(local53 * (float) local175 + local158);
						local90.b((float) local175 * local58 + local164);
						local90.b((float) local175 * local62 + local170);
						if (arg0.anInt6133 == 0) {
							local90.b(local139, local144, local147, local152);
						} else {
							local90.a(local139, local144, local147, local152);
						}
						local90.b(1.0F);
						local90.b(0.0F);
						local90.b(local41 * (float) local175 + local158);
						local90.b(local45 * (float) local175 + local164);
						local90.b((float) local175 * local49 + local170);
						if (arg0.anInt6133 == 0) {
							local90.b(local139, local144, local147, local152);
						} else {
							local90.a(local139, local144, local147, local152);
						}
						local90.b(1.0F);
						local90.b(1.0F);
						local90.b(local67 * (float) local175 + local158);
						local90.b(local164 + local71 * (float) local175);
						local90.b(local170 + (float) local175 * local76);
						if (arg0.anInt6133 == 0) {
							local90.b(local139, local144, local147, local152);
						} else {
							local90.a(local139, local144, local147, local152);
						}
						local90.b(0.0F);
						local7++;
						local90.b(1.0F);
					}
					if (this.anIntArray172[local96] > 64) {
						local391 = this.anIntArray172[local96] - 65;
						for (local134 = this.anIntArray169[local391] - 1; local134 >= 0; local134--) {
							local407 = this.aClass11_Sub5_Sub1ArrayArray2[local391][local134];
							local410 = local407.anInt4045;
							local147 = (byte) (local410 >> 16);
							local152 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local170 = local407.anInt4043 >> 12;
							local440 = local407.anInt4041 >> 12;
							local446 = local407.anInt4044 >> 12;
							local451 = local407.anInt4047 >> 12;
							local90.b((float) -local451 * local41 + local170);
							local90.b((float) -local451 * local45 + local440);
							local90.b(local446 + (float) -local451 * local49);
							if (arg0.anInt6133 == 0) {
								local90.b(local147, local152, local423, local428);
							} else {
								local90.a(local147, local152, local423, local428);
							}
							local90.b(0.0F);
							local90.b(0.0F);
							local90.b(local53 * (float) local451 + local170);
							local90.b(local440 + local58 * (float) local451);
							local90.b(local446 + local62 * (float) local451);
							if (arg0.anInt6133 == 0) {
								local90.b(local147, local152, local423, local428);
							} else {
								local90.a(local147, local152, local423, local428);
							}
							local90.b(1.0F);
							local90.b(0.0F);
							local90.b(local170 + (float) local451 * local41);
							local90.b(local440 + (float) local451 * local45);
							local90.b((float) local451 * local49 + local446);
							if (arg0.anInt6133 == 0) {
								local90.b(local147, local152, local423, local428);
							} else {
								local90.a(local147, local152, local423, local428);
							}
							local90.b(1.0F);
							local90.b(1.0F);
							local90.b(local170 + (float) local451 * local67);
							local90.b(local440 + local71 * (float) local451);
							local90.b(local446 + local76 * (float) local451);
							if (arg0.anInt6133 == 0) {
								local90.b(local147, local152, local423, local428);
							} else {
								local90.a(local147, local152, local423, local428);
							}
							local90.b(0.0F);
							local7++;
							local90.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray172[local96] <= 64 ? this.anIntArray172[local96] : 64;
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass11_Sub5_Sub1ArrayArray1[local96][local122];
						local134 = local131.anInt4045;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt4043 >> 12;
						local164 = local131.anInt4041 >> 12;
						local170 = local131.anInt4044 >> 12;
						local175 = local131.anInt4047 >> 12;
						local90.a(local158 + (float) -local175 * local41);
						local90.a((float) -local175 * local45 + local164);
						local90.a(local170 + local49 * (float) -local175);
						if (arg0.anInt6133 == 0) {
							local90.b(local139, local144, local147, local152);
						} else {
							local90.a(local139, local144, local147, local152);
						}
						local90.a(0.0F);
						local90.a(0.0F);
						local90.a(local158 + (float) local175 * local53);
						local90.a((float) local175 * local58 + local164);
						local90.a(local170 + (float) local175 * local62);
						if (arg0.anInt6133 == 0) {
							local90.b(local139, local144, local147, local152);
						} else {
							local90.a(local139, local144, local147, local152);
						}
						local90.a(1.0F);
						local90.a(0.0F);
						local90.a((float) local175 * local41 + local158);
						local90.a((float) local175 * local45 + local164);
						local90.a(local170 + (float) local175 * local49);
						if (arg0.anInt6133 == 0) {
							local90.b(local139, local144, local147, local152);
						} else {
							local90.a(local139, local144, local147, local152);
						}
						local90.a(1.0F);
						local90.a(1.0F);
						local90.a(local67 * (float) local175 + local158);
						local90.a((float) local175 * local71 + local164);
						local90.a(local170 + local76 * (float) local175);
						if (arg0.anInt6133 == 0) {
							local90.b(local139, local144, local147, local152);
						} else {
							local90.a(local139, local144, local147, local152);
						}
						local90.a(0.0F);
						local7++;
						local90.a(1.0F);
					}
					if (this.anIntArray172[local96] > 64) {
						local391 = this.anIntArray172[local96] - 64 - 1;
						for (local134 = this.anIntArray169[local391] - 1; local134 >= 0; local134--) {
							local407 = this.aClass11_Sub5_Sub1ArrayArray2[local391][local134];
							local410 = local407.anInt4045;
							local147 = (byte) (local410 >> 16);
							local152 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local170 = local407.anInt4043 >> 12;
							local440 = local407.anInt4041 >> 12;
							local446 = local407.anInt4044 >> 12;
							local451 = local407.anInt4047 >> 12;
							local90.a(local170 + (float) -local451 * local41);
							local90.a((float) -local451 * local45 + local440);
							local90.a(local446 + (float) -local451 * local49);
							if (arg0.anInt6133 == 0) {
								local90.b(local147, local152, local423, local428);
							} else {
								local90.a(local147, local152, local423, local428);
							}
							local90.a(0.0F);
							local90.a(0.0F);
							local90.a((float) local451 * local53 + local170);
							local90.a(local440 + local58 * (float) local451);
							local90.a((float) local451 * local62 + local446);
							if (arg0.anInt6133 == 0) {
								local90.b(local147, local152, local423, local428);
							} else {
								local90.a(local147, local152, local423, local428);
							}
							local90.a(1.0F);
							local90.a(0.0F);
							local90.a(local41 * (float) local451 + local170);
							local90.a((float) local451 * local45 + local440);
							local90.a(local446 + (float) local451 * local49);
							if (arg0.anInt6133 == 0) {
								local90.b(local147, local152, local423, local428);
							} else {
								local90.a(local147, local152, local423, local428);
							}
							local90.a(1.0F);
							local90.a(1.0F);
							local90.a(local170 + (float) local451 * local67);
							local90.a(local440 + (float) local451 * local71);
							local90.a(local446 + local76 * (float) local451);
							if (arg0.anInt6133 == 0) {
								local90.b(local147, local152, local423, local428);
							} else {
								local90.a(local147, local152, local423, local428);
							}
							local90.a(0.0F);
							local90.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local90.a();
		if (this.anInterface3_2.method7187()) {
			arg0.method5148(this.anInterface3_2, 0);
			arg0.method5148(this.anInterface3_3, 1);
			arg0.method5110(this.aClass147_1);
			arg0.method5136(0, local7 * 4, this.anInterface10_3, local7 * 2, Static562.aClass334_7, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lclient!gt;B)V")
	private void method1667(@OriginalArg(0) Class87_Sub1 arg0) {
		arg0.method5053(true);
		arg0.method5135(true);
		if (Static140.aFloat70 != arg0.aFloat140) {
			arg0.xa(Static140.aFloat70);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!gt;Z)V")
	private void method1668(@OriginalArg(0) Class87_Sub1 arg0) {
		Static140.aFloat70 = arg0.aFloat140;
		arg0.method5124();
		arg0.method5135(false);
		arg0.method5053(false);
		arg0.method5047();
	}
}
