import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class139 {

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "[I")
	private final int[] anIntArray226 = new int[8191];

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "[I")
	private final int[] anIntArray227 = new int[1600];

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
	private int anInt4019 = 0;

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "[[Lclient!bh;")
	private final Class20_Sub1_Sub1[][] aClass20_Sub1_Sub1ArrayArray2 = new Class20_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "[[Lclient!bh;")
	private final Class20_Sub1_Sub1[][] aClass20_Sub1_Sub1ArrayArray1 = new Class20_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "[I")
	private final int[] anIntArray228 = new int[64];

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "Lclient!um;")
	private final Class331 aClass331_13;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "Lclient!wr;")
	private final Interface24 anInterface24_8;

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "Lclient!wr;")
	private final Interface24 anInterface24_7;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!kga;")
	private final Interface13 anInterface13_4;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!qq;)V")
	public Class139(@OriginalArg(0) Class12_Sub2 arg0) {
		this.aClass331_13 = arg0.method6189(new Class271[] { new Class271(new Class193[] { Static278.aClass193_1, Static278.aClass193_3, Static278.aClass193_5 }), new Class271(Static278.aClass193_2) });
		this.anInterface24_8 = arg0.method6176(true);
		this.anInterface24_7 = arg0.method6176(false);
		this.anInterface24_7.method6518(12, 393168);
		this.anInterface13_4 = arg0.method6193(false);
		this.anInterface13_4.method7650(49146);
		@Pc(98) Buffer local98 = this.anInterface13_4.method7648();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method6160(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
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
					local105.e(local115);
					local105.e(local115 + 1);
					local105.e(local115 + 2);
					local105.e(local115 + 2);
					local105.e(local115 + 3);
					local105.e(local115);
				}
			}
			local105.a();
			this.anInterface13_4.method7652();
		}
		@Pc(200) Buffer local200 = this.anInterface24_7.method6519();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method6160(local200);
			if (Stream.c()) {
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
			this.anInterface24_7.method6520();
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!qq;B)V")
	private void method3408(@OriginalArg(0) Class12_Sub2 arg0) {
		Static291.aFloat120 = arg0.aFloat188;
		arg0.method6277();
		arg0.method6169(false);
		arg0.method6184(false);
		arg0.method6175();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!qq;)V")
	private void method3410(@OriginalArg(1) Class12_Sub2 arg0) {
		arg0.method6184(true);
		arg0.method6169(true);
		if (Static291.aFloat120 != arg0.aFloat188) {
			arg0.ra(Static291.aFloat120);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public void method3411() {
		this.anInterface24_8.method7651();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!qq;ILclient!ec;I)V")
	public void method3413(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) int arg2) {
		if (arg0.aClass209_Sub2_16 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method3408(arg0);
		} else {
			this.method3415(arg0, arg2);
		}
		@Pc(26) float local26 = arg0.aClass209_Sub2_16.aFloat140;
		@Pc(30) float local30 = arg0.aClass209_Sub2_16.aFloat139;
		@Pc(34) float local34 = arg0.aClass209_Sub2_16.aFloat143;
		@Pc(38) float local38 = arg0.aClass209_Sub2_16.aFloat142;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(48) Class20_Sub1 local48 = arg1.aClass127_1.aClass20_Sub1_7;
			@Pc(51) Class20_Sub1 local51;
			@Pc(83) int local83;
			for (local51 = local48.aClass20_Sub1_9; local51 != local48; local51 = local51.aClass20_Sub1_9) {
				@Pc(56) Class20_Sub1_Sub1 local56 = (Class20_Sub1_Sub1) local51;
				local83 = (int) (local38 + local26 * (float) (local56.anInt6325 >> 12) + (float) (local56.anInt6324 >> 12) * local30 + local34 * (float) (local56.anInt6329 >> 12));
				if (local83 > local44) {
					local44 = local83;
				}
				this.anIntArray226[local40++] = local83;
				if (local83 < local42) {
					local42 = local83;
				}
			}
			@Pc(114) int local114 = local44 - local42;
			if (local114 + 2 <= 1600) {
				local83 = 0;
				local114 += 2;
			} else {
				local83 = Static267.method4195(local114) + 1 - Static116.anInt2336;
				local114 = (local114 >> local83) + 2;
			}
			local40 = 0;
			local51 = local48.aClass20_Sub1_9;
			@Pc(147) int local147 = -2;
			@Pc(149) boolean local149 = true;
			@Pc(151) boolean local151 = true;
			while (local48 != local51) {
				this.anInt4019 = 0;
				for (@Pc(158) int local158 = 0; local158 < local114; local158++) {
					this.anIntArray227[local158] = 0;
				}
				for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
					this.anIntArray228[local175] = 0;
				}
				while (local51 != local48) {
					@Pc(191) Class20_Sub1_Sub1 local191 = (Class20_Sub1_Sub1) local51;
					if (local151) {
						local147 = local191.anInt6322;
						local149 = local191.aBoolean451;
						local151 = false;
					}
					if (local40 > 0 && (local191.anInt6322 != local147 || local191.aBoolean451 != local149)) {
						local151 = true;
						break;
					}
					@Pc(241) int local241 = this.anIntArray226[local40++] - local42 >> local83;
					if (local241 < 1600) {
						if (this.anIntArray227[local241] >= 64) {
							label107: {
								if (this.anIntArray227[local241] == 64) {
									if (this.anInt4019 == 64) {
										break label107;
									}
									this.anIntArray227[local241] += this.anInt4019++ + 1;
								}
								@Pc(291) Class20_Sub1_Sub1[] local291 = this.aClass20_Sub1_Sub1ArrayArray2[this.anIntArray227[local241] - 1 - 64];
								@Pc(301) int local301 = this.anIntArray227[local241] - 64 - 1;
								@Pc(303) int local303 = this.anIntArray228[this.anIntArray227[local241] - 64 - 1];
								this.anIntArray228[local301] = this.anIntArray228[this.anIntArray227[local241] - 64 - 1] + 1;
								local291[local303] = local191;
							}
						} else {
							this.aClass20_Sub1_Sub1ArrayArray1[local241][this.anIntArray227[local241]++] = local191;
						}
					}
					local51 = local51.aClass20_Sub1_9;
				}
				arg0.method6236(local147 >= 0 ? local147 : -1, false, false);
				if (local149 && arg0.aFloat188 != Static291.aFloat120) {
					arg0.ra(Static291.aFloat120);
				} else if (arg0.aFloat188 != 1.0F) {
					arg0.ra(1.0F);
				}
				this.method3414(local114, arg0);
			}
		} catch (@Pc(377) Exception local377) {
		}
		this.method3410(arg0);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!qq;I)V")
	private void method3414(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub2 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class209_Sub2 local11 = arg1.method6164();
		@Pc(14) float local14 = local11.aFloat146;
		@Pc(17) float local17 = local11.aFloat145;
		@Pc(20) float local20 = local11.aFloat148;
		@Pc(23) float local23 = local11.aFloat147;
		@Pc(26) float local26 = local11.aFloat149;
		@Pc(29) float local29 = local11.aFloat144;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local26 + local17;
		@Pc(41) float local41 = local29 + local20;
		@Pc(45) float local45 = local14 - local23;
		@Pc(56) float local56 = local17 - local26;
		@Pc(60) float local60 = local20 - local29;
		@Pc(64) float local64 = local23 - local14;
		@Pc(69) float local69 = local26 - local17;
		@Pc(73) float local73 = local29 - local20;
		@Pc(79) Buffer local79 = this.anInterface24_8.method6519();
		if (local79 == null) {
			return;
		}
		@Pc(87) Stream local87 = arg1.method6160(local79);
		@Pc(93) int local93;
		@Pc(108) int local108;
		@Pc(114) int local114;
		@Pc(123) Class20_Sub1_Sub1 local123;
		@Pc(126) int local126;
		@Pc(131) byte local131;
		@Pc(136) byte local136;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(167) int local167;
		@Pc(432) float local432;
		@Pc(437) int local437;
		@Pc(377) int local377;
		@Pc(393) Class20_Sub1_Sub1 local393;
		@Pc(396) int local396;
		@Pc(409) byte local409;
		@Pc(414) byte local414;
		@Pc(426) float local426;
		if (Stream.c()) {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray227[local93] <= 64 ? this.anIntArray227[local93] : 64;
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass20_Sub1_Sub1ArrayArray1[local93][local114];
						local126 = local123.anInt6327;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt6325 >> 12;
						local156 = local123.anInt6324 >> 12;
						local162 = local123.anInt6329 >> 12;
						local167 = local123.anInt6323 >> 12;
						local87.b(local150 + local33 * (float) -local167);
						local87.b(local156 + local37 * (float) -local167);
						local87.b(local41 * (float) -local167 + local162);
						if (arg1.anInt7554 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.b(0.0F);
						local87.b(0.0F);
						local87.b(local150 + local45 * (float) local167);
						local87.b(local156 + local56 * (float) local167);
						local87.b(local162 + local60 * (float) local167);
						if (arg1.anInt7554 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.b(1.0F);
						local87.b(0.0F);
						local87.b(local150 + (float) local167 * local33);
						local87.b(local156 + local37 * (float) local167);
						local87.b((float) local167 * local41 + local162);
						if (arg1.anInt7554 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.b(1.0F);
						local87.b(1.0F);
						local87.b(local64 * (float) local167 + local150);
						local87.b(local69 * (float) local167 + local156);
						local87.b(local162 + (float) local167 * local73);
						if (arg1.anInt7554 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.b(0.0F);
						local7++;
						local87.b(1.0F);
					}
					if (this.anIntArray227[local93] > 64) {
						local377 = this.anIntArray227[local93] - 64 - 1;
						for (local126 = this.anIntArray228[local377] - 1; local126 >= 0; local126--) {
							local393 = this.aClass20_Sub1_Sub1ArrayArray2[local377][local126];
							local396 = local393.anInt6327;
							local139 = (byte) (local396 >> 16);
							local144 = (byte) (local396 >> 8);
							local409 = (byte) local396;
							local414 = (byte) (local396 >>> 24);
							local162 = local393.anInt6325 >> 12;
							local426 = local393.anInt6324 >> 12;
							local432 = local393.anInt6329 >> 12;
							local437 = local393.anInt6323 >> 12;
							local87.b(local162 + local33 * (float) -local437);
							local87.b(local37 * (float) -local437 + local426);
							local87.b((float) -local437 * local41 + local432);
							if (arg1.anInt7554 == 0) {
								local87.b(local139, local144, local409, local414);
							} else {
								local87.a(local139, local144, local409, local414);
							}
							local87.b(0.0F);
							local87.b(0.0F);
							local87.b(local162 + local45 * (float) local437);
							local87.b(local426 + (float) local437 * local56);
							local87.b((float) local437 * local60 + local432);
							if (arg1.anInt7554 == 0) {
								local87.b(local139, local144, local409, local414);
							} else {
								local87.a(local139, local144, local409, local414);
							}
							local87.b(1.0F);
							local87.b(0.0F);
							local87.b((float) local437 * local33 + local162);
							local87.b((float) local437 * local37 + local426);
							local87.b(local432 + local41 * (float) local437);
							if (arg1.anInt7554 == 0) {
								local87.b(local139, local144, local409, local414);
							} else {
								local87.a(local139, local144, local409, local414);
							}
							local87.b(1.0F);
							local87.b(1.0F);
							local87.b(local162 + (float) local437 * local64);
							local87.b(local69 * (float) local437 + local426);
							local87.b(local432 + (float) local437 * local73);
							if (arg1.anInt7554 == 0) {
								local87.b(local139, local144, local409, local414);
							} else {
								local87.a(local139, local144, local409, local414);
							}
							local87.b(0.0F);
							local87.b(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray227[local93] <= 64 ? this.anIntArray227[local93] : 64;
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass20_Sub1_Sub1ArrayArray1[local93][local114];
						local126 = local123.anInt6327;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt6325 >> 12;
						local156 = local123.anInt6324 >> 12;
						local162 = local123.anInt6329 >> 12;
						local167 = local123.anInt6323 >> 12;
						local87.a((float) -local167 * local33 + local150);
						local87.a(local37 * (float) -local167 + local156);
						local87.a((float) -local167 * local41 + local162);
						if (arg1.anInt7554 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.a(0.0F);
						local87.a(0.0F);
						local87.a(local150 + local45 * (float) local167);
						local87.a((float) local167 * local56 + local156);
						local87.a((float) local167 * local60 + local162);
						if (arg1.anInt7554 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.a(1.0F);
						local87.a(0.0F);
						local87.a(local150 + (float) local167 * local33);
						local87.a(local156 + local37 * (float) local167);
						local87.a(local41 * (float) local167 + local162);
						if (arg1.anInt7554 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.a(1.0F);
						local87.a(1.0F);
						local87.a(local150 + local64 * (float) local167);
						local87.a(local69 * (float) local167 + local156);
						local87.a((float) local167 * local73 + local162);
						if (arg1.anInt7554 == 0) {
							local87.b(local131, local136, local139, local144);
						} else {
							local87.a(local131, local136, local139, local144);
						}
						local87.a(0.0F);
						local87.a(1.0F);
						local7++;
					}
					if (this.anIntArray227[local93] > 64) {
						local377 = this.anIntArray227[local93] - 65;
						for (local126 = this.anIntArray228[local377] - 1; local126 >= 0; local126--) {
							local393 = this.aClass20_Sub1_Sub1ArrayArray2[local377][local126];
							local396 = local393.anInt6327;
							local139 = (byte) (local396 >> 16);
							local144 = (byte) (local396 >> 8);
							local409 = (byte) local396;
							local414 = (byte) (local396 >>> 24);
							local162 = local393.anInt6325 >> 12;
							local426 = local393.anInt6324 >> 12;
							local432 = local393.anInt6329 >> 12;
							local437 = local393.anInt6323 >> 12;
							local87.a(local162 + local33 * (float) -local437);
							local87.a((float) -local437 * local37 + local426);
							local87.a((float) -local437 * local41 + local432);
							if (arg1.anInt7554 == 0) {
								local87.b(local139, local144, local409, local414);
							} else {
								local87.a(local139, local144, local409, local414);
							}
							local87.a(0.0F);
							local87.a(0.0F);
							local87.a(local162 + (float) local437 * local45);
							local87.a(local426 + (float) local437 * local56);
							local87.a((float) local437 * local60 + local432);
							if (arg1.anInt7554 == 0) {
								local87.b(local139, local144, local409, local414);
							} else {
								local87.a(local139, local144, local409, local414);
							}
							local87.a(1.0F);
							local87.a(0.0F);
							local87.a(local162 + (float) local437 * local33);
							local87.a(local426 + local37 * (float) local437);
							local87.a((float) local437 * local41 + local432);
							if (arg1.anInt7554 == 0) {
								local87.b(local139, local144, local409, local414);
							} else {
								local87.a(local139, local144, local409, local414);
							}
							local87.a(1.0F);
							local87.a(1.0F);
							local87.a(local162 + local64 * (float) local437);
							local87.a(local69 * (float) local437 + local426);
							local87.a((float) local437 * local73 + local432);
							if (arg1.anInt7554 == 0) {
								local87.b(local139, local144, local409, local414);
							} else {
								local87.a(local139, local144, local409, local414);
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
		if (this.anInterface24_8.method6520()) {
			arg1.method6276(0, this.anInterface24_8);
			arg1.method6276(1, this.anInterface24_7);
			arg1.method6194(this.aClass331_13);
			arg1.method6274(0, 0, this.anInterface13_4, local7 * 2, local7 * 4, Static312.aClass165_3);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!qq;II)V")
	private void method3415(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static291.aFloat120 = arg0.aFloat188;
		arg0.method6233((float) arg1);
		arg0.method6267();
		arg0.method6169(false);
		arg0.method6184(false);
		arg0.method6175();
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(Lclient!qq;B)V")
	public void method3417(@OriginalArg(0) Class12_Sub2 arg0) {
		this.anInterface24_8.method6518(24, 786336);
	}
}
