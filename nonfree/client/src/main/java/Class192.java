import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class192 {

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "[I")
	private final int[] anIntArray282 = new int[1600];

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "[I")
	private final int[] anIntArray283 = new int[64];

	@OriginalMember(owner = "client!kca", name = "m", descriptor = "[I")
	private final int[] anIntArray284 = new int[8191];

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "[[Lclient!bd;")
	private final Class15_Sub2_Sub1[][] aClass15_Sub2_Sub1ArrayArray1 = new Class15_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!kca", name = "q", descriptor = "[[Lclient!bd;")
	private final Class15_Sub2_Sub1[][] aClass15_Sub2_Sub1ArrayArray2 = new Class15_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
	private int anInt5529 = 0;

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "Lclient!ija;")
	private final Class167 aClass167_15;

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "Lclient!wba;")
	private final Interface25 anInterface25_9;

	@OriginalMember(owner = "client!kca", name = "s", descriptor = "Lclient!wba;")
	private final Interface25 anInterface25_10;

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "Lclient!vv;")
	private final Interface24 anInterface24_6;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class192(@OriginalArg(0) Class101_Sub1 arg0) {
		this.aClass167_15 = arg0.method5871(new Class280[] { new Class280(new Class354[] { Static591.aClass354_1, Static591.aClass354_3, Static591.aClass354_5 }), new Class280(Static591.aClass354_2) });
		this.anInterface25_9 = arg0.method5856(true);
		this.anInterface25_10 = arg0.method5856(false);
		this.anInterface25_10.method9040(393168, 12);
		this.anInterface24_6 = arg0.method5941(false);
		this.anInterface24_6.method9031(49146);
		@Pc(98) Buffer local98 = this.anInterface24_6.method6460();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method5942(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.c(local115);
					local105.c(local115 + 1);
					local105.c(local115 + 2);
					local105.c(local115 + 2);
					local105.c(local115 + 3);
					local105.c(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.a(local115);
					local105.a(local115 + 1);
					local105.a(local115 + 2);
					local105.a(local115 + 2);
					local105.a(local115 + 3);
					local105.a(local115);
				}
			}
			local105.a();
			this.anInterface24_6.method6459();
		}
		@Pc(198) Buffer local198 = this.anInterface25_10.method9043();
		if (local198 != null) {
			@Pc(205) Stream local205 = arg0.method5942(local198);
			if (Stream.c()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
				}
			}
			local205.a();
			this.anInterface25_10.method9041();
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IILclient!mj;)V")
	private void method5012(@OriginalArg(1) int arg0, @OriginalArg(2) Class101_Sub1 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class76_Sub2 local11 = arg1.method5958();
		@Pc(14) float local14 = local11.aFloat167;
		@Pc(17) float local17 = local11.aFloat173;
		@Pc(20) float local20 = local11.aFloat171;
		@Pc(23) float local23 = local11.aFloat168;
		@Pc(26) float local26 = local11.aFloat165;
		@Pc(29) float local29 = local11.aFloat172;
		@Pc(33) float local33 = local14 + local23;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local29 + local20;
		@Pc(46) float local46 = local14 - local23;
		@Pc(51) float local51 = local17 - local26;
		@Pc(59) float local59 = local20 - local29;
		@Pc(64) float local64 = local23 - local14;
		@Pc(68) float local68 = local26 - local17;
		@Pc(73) float local73 = local29 - local20;
		@Pc(79) Buffer local79 = this.anInterface25_9.method9043();
		if (local79 == null) {
			return;
		}
		@Pc(87) Stream local87 = arg1.method5942(local79);
		@Pc(93) int local93;
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(125) Class15_Sub2_Sub1 local125;
		@Pc(128) int local128;
		@Pc(133) byte local133;
		@Pc(138) byte local138;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(152) float local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(169) int local169;
		@Pc(437) float local437;
		@Pc(442) int local442;
		@Pc(382) int local382;
		@Pc(398) Class15_Sub2_Sub1 local398;
		@Pc(401) int local401;
		@Pc(414) byte local414;
		@Pc(419) byte local419;
		@Pc(431) float local431;
		if (Stream.c()) {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray282[local93] <= 64 ? this.anIntArray282[local93] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass15_Sub2_Sub1ArrayArray2[local93][local116];
						local128 = local125.anInt10898;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = (float) (local125.anInt10896 >> 12);
						local158 = (float) (local125.anInt10899 >> 12);
						local164 = (float) (local125.anInt10900 >> 12);
						local169 = local125.anInt10903 >> 12;
						local87.a(local152 + (float) -local169 * local33);
						local87.a(local158 + local37 * (float) -local169);
						local87.a(local164 + (float) -local169 * local41);
						if (arg1.anInt6641 == 0) {
							local87.a(local133, local138, local141, local146);
						} else {
							local87.b(local133, local138, local141, local146);
						}
						local87.a(0.0F);
						local87.a(0.0F);
						local87.a(local152 + (float) local169 * local46);
						local87.a(local158 + local51 * (float) local169);
						local87.a(local164 + local59 * (float) local169);
						if (arg1.anInt6641 == 0) {
							local87.a(local133, local138, local141, local146);
						} else {
							local87.b(local133, local138, local141, local146);
						}
						local87.a(1.0F);
						local87.a(0.0F);
						local87.a(local152 + (float) local169 * local33);
						local87.a(local158 + (float) local169 * local37);
						local87.a(local41 * (float) local169 + local164);
						if (arg1.anInt6641 == 0) {
							local87.a(local133, local138, local141, local146);
						} else {
							local87.b(local133, local138, local141, local146);
						}
						local87.a(1.0F);
						local87.a(1.0F);
						local87.a(local152 + (float) local169 * local64);
						local87.a((float) local169 * local68 + local158);
						local87.a(local164 + (float) local169 * local73);
						if (arg1.anInt6641 == 0) {
							local87.a(local133, local138, local141, local146);
						} else {
							local87.b(local133, local138, local141, local146);
						}
						local87.a(0.0F);
						local87.a(1.0F);
						local7++;
					}
					if (this.anIntArray282[local93] > 64) {
						local382 = this.anIntArray282[local93] - 65;
						for (local128 = this.anIntArray283[local382] - 1; local128 >= 0; local128--) {
							local398 = this.aClass15_Sub2_Sub1ArrayArray1[local382][local128];
							local401 = local398.anInt10898;
							local141 = (byte) (local401 >> 16);
							local146 = (byte) (local401 >> 8);
							local414 = (byte) local401;
							local419 = (byte) (local401 >>> 24);
							local164 = (float) (local398.anInt10896 >> 12);
							local431 = (float) (local398.anInt10899 >> 12);
							local437 = (float) (local398.anInt10900 >> 12);
							local442 = local398.anInt10903 >> 12;
							local87.a(local164 + local33 * (float) -local442);
							local87.a(local37 * (float) -local442 + local431);
							local87.a((float) -local442 * local41 + local437);
							if (arg1.anInt6641 == 0) {
								local87.a(local141, local146, local414, local419);
							} else {
								local87.b(local141, local146, local414, local419);
							}
							local87.a(0.0F);
							local87.a(0.0F);
							local87.a(local164 + local46 * (float) local442);
							local87.a(local431 + (float) local442 * local51);
							local87.a(local59 * (float) local442 + local437);
							if (arg1.anInt6641 == 0) {
								local87.a(local141, local146, local414, local419);
							} else {
								local87.b(local141, local146, local414, local419);
							}
							local87.a(1.0F);
							local87.a(0.0F);
							local87.a((float) local442 * local33 + local164);
							local87.a(local37 * (float) local442 + local431);
							local87.a(local41 * (float) local442 + local437);
							if (arg1.anInt6641 == 0) {
								local87.a(local141, local146, local414, local419);
							} else {
								local87.b(local141, local146, local414, local419);
							}
							local87.a(1.0F);
							local87.a(1.0F);
							local87.a((float) local442 * local64 + local164);
							local87.a(local68 * (float) local442 + local431);
							local87.a((float) local442 * local73 + local437);
							if (arg1.anInt6641 == 0) {
								local87.a(local141, local146, local414, local419);
							} else {
								local87.b(local141, local146, local414, local419);
							}
							local87.a(0.0F);
							local87.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray282[local93] <= 64 ? this.anIntArray282[local93] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass15_Sub2_Sub1ArrayArray2[local93][local116];
						local128 = local125.anInt10898;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = (float) (local125.anInt10896 >> 12);
						local158 = (float) (local125.anInt10899 >> 12);
						local164 = (float) (local125.anInt10900 >> 12);
						local169 = local125.anInt10903 >> 12;
						local87.b(local33 * (float) -local169 + local152);
						local87.b((float) -local169 * local37 + local158);
						local87.b(local164 + local41 * (float) -local169);
						if (arg1.anInt6641 == 0) {
							local87.a(local133, local138, local141, local146);
						} else {
							local87.b(local133, local138, local141, local146);
						}
						local87.b(0.0F);
						local87.b(0.0F);
						local87.b(local46 * (float) local169 + local152);
						local87.b((float) local169 * local51 + local158);
						local87.b(local59 * (float) local169 + local164);
						if (arg1.anInt6641 == 0) {
							local87.a(local133, local138, local141, local146);
						} else {
							local87.b(local133, local138, local141, local146);
						}
						local87.b(1.0F);
						local87.b(0.0F);
						local87.b((float) local169 * local33 + local152);
						local87.b(local37 * (float) local169 + local158);
						local87.b(local164 + (float) local169 * local41);
						if (arg1.anInt6641 == 0) {
							local87.a(local133, local138, local141, local146);
						} else {
							local87.b(local133, local138, local141, local146);
						}
						local87.b(1.0F);
						local87.b(1.0F);
						local87.b(local152 + local64 * (float) local169);
						local87.b(local158 + local68 * (float) local169);
						local87.b(local73 * (float) local169 + local164);
						if (arg1.anInt6641 == 0) {
							local87.a(local133, local138, local141, local146);
						} else {
							local87.b(local133, local138, local141, local146);
						}
						local87.b(0.0F);
						local7++;
						local87.b(1.0F);
					}
					if (this.anIntArray282[local93] > 64) {
						local382 = this.anIntArray282[local93] - 65;
						for (local128 = this.anIntArray283[local382] - 1; local128 >= 0; local128--) {
							local398 = this.aClass15_Sub2_Sub1ArrayArray1[local382][local128];
							local401 = local398.anInt10898;
							local141 = (byte) (local401 >> 16);
							local146 = (byte) (local401 >> 8);
							local414 = (byte) local401;
							local419 = (byte) (local401 >>> 24);
							local164 = (float) (local398.anInt10896 >> 12);
							local431 = (float) (local398.anInt10899 >> 12);
							local437 = (float) (local398.anInt10900 >> 12);
							local442 = local398.anInt10903 >> 12;
							local87.b(local164 + (float) -local442 * local33);
							local87.b(local37 * (float) -local442 + local431);
							local87.b(local41 * (float) -local442 + local437);
							if (arg1.anInt6641 == 0) {
								local87.a(local141, local146, local414, local419);
							} else {
								local87.b(local141, local146, local414, local419);
							}
							local87.b(0.0F);
							local87.b(0.0F);
							local87.b(local46 * (float) local442 + local164);
							local87.b(local431 + (float) local442 * local51);
							local87.b((float) local442 * local59 + local437);
							if (arg1.anInt6641 == 0) {
								local87.a(local141, local146, local414, local419);
							} else {
								local87.b(local141, local146, local414, local419);
							}
							local87.b(1.0F);
							local87.b(0.0F);
							local87.b((float) local442 * local33 + local164);
							local87.b((float) local442 * local37 + local431);
							local87.b(local437 + local41 * (float) local442);
							if (arg1.anInt6641 == 0) {
								local87.a(local141, local146, local414, local419);
							} else {
								local87.b(local141, local146, local414, local419);
							}
							local87.b(1.0F);
							local87.b(1.0F);
							local87.b(local164 + local64 * (float) local442);
							local87.b((float) local442 * local68 + local431);
							local87.b(local437 + (float) local442 * local73);
							if (arg1.anInt6641 == 0) {
								local87.a(local141, local146, local414, local419);
							} else {
								local87.b(local141, local146, local414, local419);
							}
							local87.b(0.0F);
							local7++;
							local87.b(1.0F);
						}
					}
				}
			}
		}
		local87.a();
		if (this.anInterface25_9.method9041()) {
			arg1.method5953(0, this.anInterface25_9);
			arg1.method5953(1, this.anInterface25_10);
			arg1.method5938(this.aClass167_15);
			arg1.method5947(0, local7 * 4, this.anInterface24_6, Static627.aClass320_6, 0, local7 * 2);
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILclient!mj;ILclient!gka;)V")
	public void method5013(@OriginalArg(0) int arg0, @OriginalArg(1) Class101_Sub1 arg1, @OriginalArg(3) Class127 arg2) {
		if (arg1.aClass76_Sub2_16 == null) {
			return;
		}
		if (arg0 < 0) {
			this.method5014(arg1);
		} else {
			this.method5020(arg0, arg1);
		}
		@Pc(31) float local31 = arg1.aClass76_Sub2_16.aFloat174;
		@Pc(35) float local35 = arg1.aClass76_Sub2_16.aFloat166;
		@Pc(39) float local39 = arg1.aClass76_Sub2_16.aFloat175;
		@Pc(43) float local43 = arg1.aClass76_Sub2_16.aFloat169;
		try {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = Integer.MAX_VALUE;
			@Pc(53) int local53 = 0;
			@Pc(57) Class15_Sub2 local57 = arg2.aClass390_1.aClass15_Sub2_9;
			@Pc(60) Class15_Sub2 local60;
			@Pc(92) int local92;
			for (local60 = local57.aClass15_Sub2_8; local60 != local57; local60 = local60.aClass15_Sub2_8) {
				@Pc(65) Class15_Sub2_Sub1 local65 = (Class15_Sub2_Sub1) local60;
				local92 = (int) (local43 + local31 * (float) (local65.anInt10896 >> 12) + (float) (local65.anInt10899 >> 12) * local35 + (float) (local65.anInt10900 >> 12) * local39);
				this.anIntArray284[local45++] = local92;
				if (local53 < local92) {
					local53 = local92;
				}
				if (local92 < local47) {
					local47 = local92;
				}
			}
			@Pc(123) int local123 = local53 - local47;
			if (local123 + 2 <= 1600) {
				local92 = 0;
				local123 += 2;
			} else {
				local92 = Static8.method135(local123) + 1 - Static575.anInt10030;
				local123 = (local123 >> local92) + 2;
			}
			local60 = local57.aClass15_Sub2_8;
			local45 = 0;
			@Pc(155) int local155 = -2;
			@Pc(157) boolean local157 = true;
			@Pc(159) boolean local159 = true;
			while (local57 != local60) {
				this.anInt5529 = 0;
				for (@Pc(166) int local166 = 0; local166 < local123; local166++) {
					this.anIntArray282[local166] = 0;
				}
				for (@Pc(179) int local179 = 0; local179 < 64; local179++) {
					this.anIntArray283[local179] = 0;
				}
				while (local60 != local57) {
					@Pc(195) Class15_Sub2_Sub1 local195 = (Class15_Sub2_Sub1) local60;
					if (local159) {
						local155 = local195.anInt10902;
						local157 = local195.aBoolean784;
						local159 = false;
					}
					if (local45 > 0 && (local195.anInt10902 != local155 || local157 != local195.aBoolean784)) {
						local159 = true;
						break;
					}
					@Pc(236) int local236 = this.anIntArray284[local45++] - local47 >> local92;
					if (local236 < 1600) {
						if (this.anIntArray282[local236] < 64) {
							this.aClass15_Sub2_Sub1ArrayArray2[local236][this.anIntArray282[local236]++] = local195;
						} else {
							label96: {
								if (this.anIntArray282[local236] == 64) {
									if (this.anInt5529 == 64) {
										break label96;
									}
									this.anIntArray282[local236] += this.anInt5529++ + 1;
								}
								this.aClass15_Sub2_Sub1ArrayArray1[this.anIntArray282[local236] - 65][this.anIntArray283[this.anIntArray282[local236] - 64 - 1]++] = local195;
							}
						}
					}
					local60 = local60.aClass15_Sub2_8;
				}
				arg1.method5873(local155 < 0 ? -1 : local155, false, false);
				if (local157 && Static69.aFloat12 != arg1.aFloat150) {
					arg1.xa(Static69.aFloat12);
				} else if (arg1.aFloat150 != 1.0F) {
					arg1.xa(1.0F);
				}
				this.method5012(local123, arg1);
			}
		} catch (@Pc(368) Exception local368) {
		}
		this.method5019(arg1);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILclient!mj;)V")
	private void method5014(@OriginalArg(1) Class101_Sub1 arg0) {
		Static69.aFloat12 = arg0.aFloat150;
		arg0.method5911();
		arg0.method5932(false);
		arg0.method5864(false);
		arg0.method5895();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!mj;B)V")
	public void method5015(@OriginalArg(0) Class101_Sub1 arg0) {
		this.anInterface25_9.method9040(786336, 24);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
	public void method5016() {
		this.anInterface25_9.method9037();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BLclient!mj;)V")
	private void method5019(@OriginalArg(1) Class101_Sub1 arg0) {
		arg0.method5864(true);
		arg0.method5932(true);
		if (arg0.aFloat150 != Static69.aFloat12) {
			arg0.xa(Static69.aFloat12);
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IBLclient!mj;)V")
	private void method5020(@OriginalArg(0) int arg0, @OriginalArg(2) Class101_Sub1 arg1) {
		Static69.aFloat12 = arg1.aFloat150;
		arg1.method5879((float) arg0);
		arg1.method5852();
		arg1.method5932(false);
		arg1.method5864(false);
		arg1.method5895();
	}
}
