import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class305 {

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	private int anInt8069 = 0;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "[I")
	private final int[] anIntArray509 = new int[8191];

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "[[Lclient!wd;")
	private final Class11_Sub5_Sub1[][] aClass11_Sub5_Sub1ArrayArray4 = new Class11_Sub5_Sub1[1600][64];

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "[I")
	private final int[] anIntArray510 = new int[1600];

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "[[Lclient!wd;")
	private final Class11_Sub5_Sub1[][] aClass11_Sub5_Sub1ArrayArray3 = new Class11_Sub5_Sub1[64][768];

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "[I")
	private final int[] anIntArray511 = new int[64];

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!si;")
	private final Class185 aClass185_14;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!vc;")
	private final Interface23 anInterface23_13;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!vc;")
	private final Interface23 anInterface23_12;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!jea;")
	private final Interface13 anInterface13_7;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class305(@OriginalArg(0) Class78_Sub1 arg0) {
		this.aClass185_14 = arg0.method6938(new Class318[] { new Class318(new Class174[] { Static246.aClass174_1, Static246.aClass174_3, Static246.aClass174_5 }), new Class318(Static246.aClass174_2) });
		this.anInterface23_13 = arg0.method6927(true);
		this.anInterface23_12 = arg0.method6927(false);
		this.anInterface23_12.method5569(393168, 12);
		this.anInterface13_7 = arg0.method6980(false);
		this.anInterface13_7.method5600(49146);
		@Pc(98) Buffer local98 = this.anInterface13_7.method5603();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method6925(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.b(local115);
					local105.b(local115 + 1);
					local105.b(local115 + 2);
					local105.b(local115 + 2);
					local105.b(local115 + 3);
					local105.b(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.c(local115);
					local105.c(local115 + 1);
					local105.c(local115 + 2);
					local105.c(local115 + 2);
					local105.c(local115 + 3);
					local105.c(local115);
				}
			}
			local105.a();
			this.anInterface13_7.method5602();
		}
		@Pc(200) Buffer local200 = this.anInterface23_12.method5570();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method6925(local200);
			if (Stream.b()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
				}
			}
			local207.a();
			this.anInterface23_12.method5572();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!nv;B)V")
	private void method6484(@OriginalArg(0) Class78_Sub1 arg0) {
		arg0.method6953(true);
		arg0.method6883(true);
		if (arg0.aFloat213 != Static538.aFloat193) {
			arg0.ra(Static538.aFloat193);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!nv;)V")
	public void method6485(@OriginalArg(1) Class78_Sub1 arg0) {
		this.anInterface23_13.method5569(786336, 24);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public void method6486() {
		this.anInterface23_13.method5601();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!nv;IB)V")
	private void method6487(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static538.aFloat193 = arg0.aFloat213;
		arg0.method6976((float) arg1);
		arg0.method6969();
		arg0.method6883(false);
		arg0.method6953(false);
		arg0.method6957();
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lclient!nv;IB)V")
	private void method6488(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class34_Sub1 local11 = arg0.method6987();
		@Pc(14) float local14 = local11.aFloat17;
		@Pc(17) float local17 = local11.aFloat16;
		@Pc(20) float local20 = local11.aFloat14;
		@Pc(23) float local23 = local11.aFloat21;
		@Pc(26) float local26 = local11.aFloat15;
		@Pc(29) float local29 = local11.aFloat23;
		@Pc(33) float local33 = local14 + local23;
		@Pc(37) float local37 = local26 + local17;
		@Pc(45) float local45 = local20 + local29;
		@Pc(49) float local49 = local14 - local23;
		@Pc(53) float local53 = local17 - local26;
		@Pc(57) float local57 = local20 - local29;
		@Pc(62) float local62 = local23 - local14;
		@Pc(67) float local67 = local26 - local17;
		@Pc(71) float local71 = local29 - local20;
		@Pc(77) Buffer local77 = this.anInterface23_13.method5570();
		if (local77 == null) {
			return;
		}
		@Pc(87) Stream local87 = arg0.method6925(local77);
		@Pc(93) int local93;
		@Pc(108) int local108;
		@Pc(114) int local114;
		@Pc(123) Class11_Sub5_Sub1 local123;
		@Pc(126) int local126;
		@Pc(131) byte local131;
		@Pc(136) byte local136;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(167) int local167;
		@Pc(439) float local439;
		@Pc(444) int local444;
		@Pc(384) int local384;
		@Pc(400) Class11_Sub5_Sub1 local400;
		@Pc(403) int local403;
		@Pc(416) byte local416;
		@Pc(421) byte local421;
		@Pc(433) float local433;
		if (Stream.b()) {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray510[local93] <= 64 ? this.anIntArray510[local93] : 64;
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass11_Sub5_Sub1ArrayArray4[local93][local114];
						local126 = local123.anInt4079;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt4083 >> 12;
						local156 = local123.anInt4081 >> 12;
						local162 = local123.anInt4077 >> 12;
						local167 = local123.anInt4075 >> 12;
						local87.b(local150 + local33 * (float) -local167);
						local87.b(local156 + local37 * (float) -local167);
						local87.b(local162 + local45 * (float) -local167);
						if (arg0.anInt8568 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.b(0.0F);
						local87.b(0.0F);
						local87.b(local49 * (float) local167 + local150);
						local87.b(local156 + local53 * (float) local167);
						local87.b(local57 * (float) local167 + local162);
						if (arg0.anInt8568 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.b(1.0F);
						local87.b(0.0F);
						local87.b((float) local167 * local33 + local150);
						local87.b(local37 * (float) local167 + local156);
						local87.b((float) local167 * local45 + local162);
						if (arg0.anInt8568 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.b(1.0F);
						local87.b(1.0F);
						local87.b((float) local167 * local62 + local150);
						local87.b(local156 + (float) local167 * local67);
						local87.b((float) local167 * local71 + local162);
						if (arg0.anInt8568 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.b(0.0F);
						local87.b(1.0F);
						local7++;
					}
					if (this.anIntArray510[local93] > 64) {
						local384 = this.anIntArray510[local93] - 65;
						for (local126 = this.anIntArray511[local384] - 1; local126 >= 0; local126--) {
							local400 = this.aClass11_Sub5_Sub1ArrayArray3[local384][local126];
							local403 = local400.anInt4079;
							local139 = (byte) (local403 >> 16);
							local144 = (byte) (local403 >> 8);
							local416 = (byte) local403;
							local421 = (byte) (local403 >>> 24);
							local162 = local400.anInt4083 >> 12;
							local433 = local400.anInt4081 >> 12;
							local439 = local400.anInt4077 >> 12;
							local444 = local400.anInt4075 >> 12;
							local87.b(local162 + (float) -local444 * local33);
							local87.b(local37 * (float) -local444 + local433);
							local87.b((float) -local444 * local45 + local439);
							if (arg0.anInt8568 == 0) {
								local87.b(local139, local144, local416, local421);
							} else {
								local87.a(local139, local144, local416, local421);
							}
							local87.b(0.0F);
							local87.b(0.0F);
							local87.b(local162 + (float) local444 * local49);
							local87.b(local53 * (float) local444 + local433);
							local87.b(local439 + (float) local444 * local57);
							if (arg0.anInt8568 == 0) {
								local87.b(local139, local144, local416, local421);
							} else {
								local87.a(local139, local144, local416, local421);
							}
							local87.b(1.0F);
							local87.b(0.0F);
							local87.b((float) local444 * local33 + local162);
							local87.b(local433 + (float) local444 * local37);
							local87.b(local439 + (float) local444 * local45);
							if (arg0.anInt8568 == 0) {
								local87.b(local139, local144, local416, local421);
							} else {
								local87.a(local139, local144, local416, local421);
							}
							local87.b(1.0F);
							local87.b(1.0F);
							local87.b(local62 * (float) local444 + local162);
							local87.b((float) local444 * local67 + local433);
							local87.b(local439 + (float) local444 * local71);
							if (arg0.anInt8568 == 0) {
								local87.b(local139, local144, local416, local421);
							} else {
								local87.a(local139, local144, local416, local421);
							}
							local87.b(0.0F);
							local7++;
							local87.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray510[local93] > 64 ? 64 : this.anIntArray510[local93];
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass11_Sub5_Sub1ArrayArray4[local93][local114];
						local126 = local123.anInt4079;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt4083 >> 12;
						local156 = local123.anInt4081 >> 12;
						local162 = local123.anInt4077 >> 12;
						local167 = local123.anInt4075 >> 12;
						local87.a(local150 + local33 * (float) -local167);
						local87.a(local37 * (float) -local167 + local156);
						local87.a(local162 + local45 * (float) -local167);
						if (arg0.anInt8568 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.a(0.0F);
						local87.a(0.0F);
						local87.a((float) local167 * local49 + local150);
						local87.a(local156 + (float) local167 * local53);
						local87.a((float) local167 * local57 + local162);
						if (arg0.anInt8568 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.a(1.0F);
						local87.a(0.0F);
						local87.a((float) local167 * local33 + local150);
						local87.a(local156 + (float) local167 * local37);
						local87.a(local162 + (float) local167 * local45);
						if (arg0.anInt8568 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.a(1.0F);
						local87.a(1.0F);
						local87.a((float) local167 * local62 + local150);
						local87.a((float) local167 * local67 + local156);
						local87.a(local162 + (float) local167 * local71);
						if (arg0.anInt8568 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.a(0.0F);
						local7++;
						local87.a(1.0F);
					}
					if (this.anIntArray510[local93] > 64) {
						local384 = this.anIntArray510[local93] - 65;
						for (local126 = this.anIntArray511[local384] - 1; local126 >= 0; local126--) {
							local400 = this.aClass11_Sub5_Sub1ArrayArray3[local384][local126];
							local403 = local400.anInt4079;
							local139 = (byte) (local403 >> 16);
							local144 = (byte) (local403 >> 8);
							local416 = (byte) local403;
							local421 = (byte) (local403 >>> 24);
							local162 = local400.anInt4083 >> 12;
							local433 = local400.anInt4081 >> 12;
							local439 = local400.anInt4077 >> 12;
							local444 = local400.anInt4075 >> 12;
							local87.a(local33 * (float) -local444 + local162);
							local87.a(local433 + (float) -local444 * local37);
							local87.a(local439 + local45 * (float) -local444);
							if (arg0.anInt8568 == 0) {
								local87.b(local139, local144, local416, local421);
							} else {
								local87.a(local139, local144, local416, local421);
							}
							local87.a(0.0F);
							local87.a(0.0F);
							local87.a(local162 + (float) local444 * local49);
							local87.a(local433 + (float) local444 * local53);
							local87.a(local439 + (float) local444 * local57);
							if (arg0.anInt8568 == 0) {
								local87.b(local139, local144, local416, local421);
							} else {
								local87.a(local139, local144, local416, local421);
							}
							local87.a(1.0F);
							local87.a(0.0F);
							local87.a(local33 * (float) local444 + local162);
							local87.a(local433 + local37 * (float) local444);
							local87.a(local45 * (float) local444 + local439);
							if (arg0.anInt8568 == 0) {
								local87.b(local139, local144, local416, local421);
							} else {
								local87.a(local139, local144, local416, local421);
							}
							local87.a(1.0F);
							local87.a(1.0F);
							local87.a(local162 + local62 * (float) local444);
							local87.a((float) local444 * local67 + local433);
							local87.a(local439 + (float) local444 * local71);
							if (arg0.anInt8568 == 0) {
								local87.b(local139, local144, local416, local421);
							} else {
								local87.a(local139, local144, local416, local421);
							}
							local87.a(0.0F);
							local7++;
							local87.a(1.0F);
						}
					}
				}
			}
		}
		local87.a();
		if (this.anInterface23_13.method5572()) {
			arg0.method6965(this.anInterface23_13, 0);
			arg0.method6965(this.anInterface23_12, 1);
			arg0.method6941(this.aClass185_14);
			arg0.method6947(Static302.aClass77_5, local7 * 4, 0, local7 * 2, 0, this.anInterface13_7);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!dk;ILclient!nv;)V")
	public void method6489(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(3) Class78_Sub1 arg2) {
		if (arg2.aClass34_Sub1_16 == null) {
			return;
		}
		if (arg0 < 0) {
			this.method6490(arg2);
		} else {
			this.method6487(arg2, arg0);
		}
		@Pc(32) float local32 = arg2.aClass34_Sub1_16.aFloat13;
		@Pc(36) float local36 = arg2.aClass34_Sub1_16.aFloat22;
		@Pc(40) float local40 = arg2.aClass34_Sub1_16.aFloat24;
		@Pc(44) float local44 = arg2.aClass34_Sub1_16.aFloat20;
		try {
			@Pc(46) int local46 = 0;
			@Pc(48) int local48 = Integer.MAX_VALUE;
			@Pc(50) int local50 = 0;
			@Pc(54) Class11_Sub5 local54 = arg1.aClass102_1.aClass11_Sub5_1;
			@Pc(57) Class11_Sub5 local57;
			@Pc(89) int local89;
			for (local57 = local54.aClass11_Sub5_9; local57 != local54; local57 = local57.aClass11_Sub5_9) {
				@Pc(62) Class11_Sub5_Sub1 local62 = (Class11_Sub5_Sub1) local57;
				local89 = (int) (local32 * (float) (local62.anInt4083 >> 12) + local36 * (float) (local62.anInt4081 >> 12) + (float) (local62.anInt4077 >> 12) * local40 + local44);
				this.anIntArray509[local46++] = local89;
				if (local89 > local50) {
					local50 = local89;
				}
				if (local89 < local48) {
					local48 = local89;
				}
			}
			@Pc(124) int local124 = local50 - local48;
			if (local124 + 2 > 1600) {
				local89 = Static77.method7407(local124) + 1 - Static405.anInt7237;
				local124 = (local124 >> local89) + 2;
			} else {
				local89 = 0;
				local124 += 2;
			}
			local57 = local54.aClass11_Sub5_9;
			local46 = 0;
			@Pc(156) int local156 = -2;
			@Pc(158) boolean local158 = true;
			@Pc(160) boolean local160 = true;
			while (local57 != local54) {
				this.anInt8069 = 0;
				for (@Pc(167) int local167 = 0; local167 < local124; local167++) {
					this.anIntArray510[local167] = 0;
				}
				for (@Pc(180) int local180 = 0; local180 < 64; local180++) {
					this.anIntArray511[local180] = 0;
				}
				while (local54 != local57) {
					@Pc(196) Class11_Sub5_Sub1 local196 = (Class11_Sub5_Sub1) local57;
					if (local160) {
						local158 = local196.aBoolean287;
						local160 = false;
						local156 = local196.anInt4078;
					}
					if (local46 > 0 && (local156 != local196.anInt4078 || local196.aBoolean287 != local158)) {
						local160 = true;
						break;
					}
					@Pc(245) int local245 = this.anIntArray509[local46++] - local48 >> local89;
					if (local245 < 1600) {
						if (this.anIntArray510[local245] >= 64) {
							label107: {
								if (this.anIntArray510[local245] == 64) {
									if (this.anInt8069 == 64) {
										break label107;
									}
									this.anIntArray510[local245] += this.anInt8069++ + 1;
								}
								this.aClass11_Sub5_Sub1ArrayArray3[this.anIntArray510[local245] - 64 - 1][this.anIntArray511[this.anIntArray510[local245] - 64 - 1]++] = local196;
							}
						} else {
							this.aClass11_Sub5_Sub1ArrayArray4[local245][this.anIntArray510[local245]++] = local196;
						}
					}
					local57 = local57.aClass11_Sub5_9;
				}
				arg2.method6948(false, false, local156 < 0 ? -1 : local156);
				if (local158 && Static538.aFloat193 != arg2.aFloat213) {
					arg2.ra(Static538.aFloat193);
				} else if (arg2.aFloat213 != 1.0F) {
					arg2.ra(1.0F);
				}
				this.method6488(arg2, local124);
			}
		} catch (@Pc(380) Exception local380) {
		}
		this.method6484(arg2);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!nv;I)V")
	private void method6490(@OriginalArg(0) Class78_Sub1 arg0) {
		Static538.aFloat193 = arg0.aFloat213;
		arg0.method6939();
		arg0.method6883(false);
		arg0.method6953(false);
		arg0.method6957();
	}
}
