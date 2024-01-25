import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class107 {

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
	private int anInt3044 = 0;

	@OriginalMember(owner = "client!faa", name = "j", descriptor = "[I")
	private final int[] anIntArray196 = new int[64];

	@OriginalMember(owner = "client!faa", name = "n", descriptor = "[I")
	private final int[] anIntArray197 = new int[8191];

	@OriginalMember(owner = "client!faa", name = "q", descriptor = "[[Lclient!l;")
	private final Class16_Sub6_Sub1[][] aClass16_Sub6_Sub1ArrayArray1 = new Class16_Sub6_Sub1[1600][64];

	@OriginalMember(owner = "client!faa", name = "s", descriptor = "[[Lclient!l;")
	private final Class16_Sub6_Sub1[][] aClass16_Sub6_Sub1ArrayArray2 = new Class16_Sub6_Sub1[64][768];

	@OriginalMember(owner = "client!faa", name = "t", descriptor = "[I")
	private final int[] anIntArray198 = new int[1600];

	@OriginalMember(owner = "client!faa", name = "o", descriptor = "Lclient!ri;")
	private final Class258 aClass258_1;

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "Lclient!ia;")
	private final Interface10 anInterface10_3;

	@OriginalMember(owner = "client!faa", name = "r", descriptor = "Lclient!ia;")
	private final Interface10 anInterface10_4;

	@OriginalMember(owner = "client!faa", name = "k", descriptor = "Lclient!iaa;")
	private final Interface11 anInterface11_1;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!ij;)V")
	public Class107(@OriginalArg(0) Class13_Sub3 arg0) {
		this.aClass258_1 = arg0.method8292(new Class118[] { new Class118(new Class371[] { Static622.aClass371_1, Static622.aClass371_3, Static622.aClass371_5 }), new Class118(Static622.aClass371_2) });
		this.anInterface10_3 = arg0.method8200(true);
		this.anInterface10_4 = arg0.method8200(false);
		this.anInterface10_4.method8450(12, 393168);
		this.anInterface11_1 = arg0.method8288(false);
		this.anInterface11_1.method7407(49146);
		@Pc(96) Buffer local96 = this.anInterface11_1.method7405();
		@Pc(112) int local112;
		if (local96 != null) {
			@Pc(103) Stream local103 = arg0.method8260(local96);
			@Pc(107) int local107;
			if (Stream.c()) {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.b(local112);
					local103.b(local112 + 1);
					local103.b(local112 + 2);
					local103.b(local112 + 2);
					local103.b(local112 + 3);
					local103.b(local112);
				}
			} else {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.e(local112);
					local103.e(local112 + 1);
					local103.e(local112 + 2);
					local103.e(local112 + 2);
					local103.e(local112 + 3);
					local103.e(local112);
				}
			}
			local103.b();
			this.anInterface11_1.method7409();
		}
		@Pc(195) Buffer local195 = this.anInterface10_4.method8449();
		if (local195 != null) {
			@Pc(202) Stream local202 = arg0.method8260(local195);
			if (Stream.c()) {
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
			local202.b();
			this.anInterface10_4.method8448();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V")
	public void method2609() {
		this.anInterface10_3.method8446();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILclient!ij;)V")
	private void method2611(@OriginalArg(1) Class13_Sub3 arg0) {
		arg0.method8218(true);
		arg0.method8221(true);
		if (arg0.aFloat202 != Static147.aFloat62) {
			arg0.xa(Static147.aFloat62);
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!ij;II)V")
	private void method2612(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class51_Sub2 local11 = arg0.method8289();
		@Pc(14) float local14 = local11.aFloat68;
		@Pc(17) float local17 = local11.aFloat76;
		@Pc(20) float local20 = local11.aFloat70;
		@Pc(23) float local23 = local11.aFloat72;
		@Pc(26) float local26 = local11.aFloat77;
		@Pc(29) float local29 = local11.aFloat71;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local26 + local17;
		@Pc(41) float local41 = local29 + local20;
		@Pc(45) float local45 = local14 - local23;
		@Pc(50) float local50 = local17 - local26;
		@Pc(54) float local54 = local20 - local29;
		@Pc(59) float local59 = local23 - local14;
		@Pc(64) float local64 = local26 - local17;
		@Pc(68) float local68 = local29 - local20;
		@Pc(74) Buffer local74 = this.anInterface10_3.method8449();
		if (local74 == null) {
			return;
		}
		@Pc(82) Stream local82 = arg0.method8260(local74);
		@Pc(88) int local88;
		@Pc(105) int local105;
		@Pc(114) int local114;
		@Pc(123) Class16_Sub6_Sub1 local123;
		@Pc(126) int local126;
		@Pc(131) byte local131;
		@Pc(136) byte local136;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(167) int local167;
		@Pc(440) float local440;
		@Pc(445) int local445;
		@Pc(385) int local385;
		@Pc(401) Class16_Sub6_Sub1 local401;
		@Pc(404) int local404;
		@Pc(417) byte local417;
		@Pc(422) byte local422;
		@Pc(434) float local434;
		if (Stream.c()) {
			for (local88 = arg1 - 1; local88 >= 0; local88--) {
				local105 = this.anIntArray198[local88] <= 64 ? this.anIntArray198[local88] : 64;
				if (local105 > 0) {
					for (local114 = local105 - 1; local114 >= 0; local114--) {
						local123 = this.aClass16_Sub6_Sub1ArrayArray1[local88][local114];
						local126 = local123.anInt10129;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = (float) (local123.anInt10126 >> 12);
						local156 = (float) (local123.anInt10131 >> 12);
						local162 = (float) (local123.anInt10130 >> 12);
						local167 = local123.anInt10125 >> 12;
						local82.b(local150 + local33 * (float) -local167);
						local82.b(local156 + (float) -local167 * local37);
						local82.b(local162 + local41 * (float) -local167);
						if (arg0.anInt9759 == 0) {
							local82.b(local131, local136, local139, local144);
						} else {
							local82.a(local131, local136, local139, local144);
						}
						local82.b(0.0F);
						local82.b(0.0F);
						local82.b(local150 + (float) local167 * local45);
						local82.b(local156 + (float) local167 * local50);
						local82.b(local54 * (float) local167 + local162);
						if (arg0.anInt9759 == 0) {
							local82.b(local131, local136, local139, local144);
						} else {
							local82.a(local131, local136, local139, local144);
						}
						local82.b(1.0F);
						local82.b(0.0F);
						local82.b(local150 + (float) local167 * local33);
						local82.b(local37 * (float) local167 + local156);
						local82.b(local162 + (float) local167 * local41);
						if (arg0.anInt9759 == 0) {
							local82.b(local131, local136, local139, local144);
						} else {
							local82.a(local131, local136, local139, local144);
						}
						local82.b(1.0F);
						local82.b(1.0F);
						local82.b(local150 + local59 * (float) local167);
						local82.b(local156 + local64 * (float) local167);
						local82.b(local162 + (float) local167 * local68);
						if (arg0.anInt9759 == 0) {
							local82.b(local131, local136, local139, local144);
						} else {
							local82.a(local131, local136, local139, local144);
						}
						local82.b(0.0F);
						local7++;
						local82.b(1.0F);
					}
					if (this.anIntArray198[local88] > 64) {
						local385 = this.anIntArray198[local88] - 1 - 64;
						for (local126 = this.anIntArray196[local385] - 1; local126 >= 0; local126--) {
							local401 = this.aClass16_Sub6_Sub1ArrayArray2[local385][local126];
							local404 = local401.anInt10129;
							local139 = (byte) (local404 >> 16);
							local144 = (byte) (local404 >> 8);
							local417 = (byte) local404;
							local422 = (byte) (local404 >>> 24);
							local162 = (float) (local401.anInt10126 >> 12);
							local434 = (float) (local401.anInt10131 >> 12);
							local440 = (float) (local401.anInt10130 >> 12);
							local445 = local401.anInt10125 >> 12;
							local82.b(local162 + (float) -local445 * local33);
							local82.b(local37 * (float) -local445 + local434);
							local82.b((float) -local445 * local41 + local440);
							if (arg0.anInt9759 == 0) {
								local82.b(local139, local144, local417, local422);
							} else {
								local82.a(local139, local144, local417, local422);
							}
							local82.b(0.0F);
							local82.b(0.0F);
							local82.b((float) local445 * local45 + local162);
							local82.b(local50 * (float) local445 + local434);
							local82.b(local54 * (float) local445 + local440);
							if (arg0.anInt9759 == 0) {
								local82.b(local139, local144, local417, local422);
							} else {
								local82.a(local139, local144, local417, local422);
							}
							local82.b(1.0F);
							local82.b(0.0F);
							local82.b(local162 + (float) local445 * local33);
							local82.b(local434 + local37 * (float) local445);
							local82.b(local440 + local41 * (float) local445);
							if (arg0.anInt9759 == 0) {
								local82.b(local139, local144, local417, local422);
							} else {
								local82.a(local139, local144, local417, local422);
							}
							local82.b(1.0F);
							local82.b(1.0F);
							local82.b(local59 * (float) local445 + local162);
							local82.b(local434 + local64 * (float) local445);
							local82.b((float) local445 * local68 + local440);
							if (arg0.anInt9759 == 0) {
								local82.b(local139, local144, local417, local422);
							} else {
								local82.a(local139, local144, local417, local422);
							}
							local82.b(0.0F);
							local7++;
							local82.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local88 = arg1 - 1; local88 >= 0; local88--) {
				local105 = this.anIntArray198[local88] > 64 ? 64 : this.anIntArray198[local88];
				if (local105 > 0) {
					for (local114 = local105 - 1; local114 >= 0; local114--) {
						local123 = this.aClass16_Sub6_Sub1ArrayArray1[local88][local114];
						local126 = local123.anInt10129;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = (float) (local123.anInt10126 >> 12);
						local156 = (float) (local123.anInt10131 >> 12);
						local162 = (float) (local123.anInt10130 >> 12);
						local167 = local123.anInt10125 >> 12;
						local82.a((float) -local167 * local33 + local150);
						local82.a((float) -local167 * local37 + local156);
						local82.a(local162 + (float) -local167 * local41);
						if (arg0.anInt9759 == 0) {
							local82.b(local131, local136, local139, local144);
						} else {
							local82.a(local131, local136, local139, local144);
						}
						local82.a(0.0F);
						local82.a(0.0F);
						local82.a(local150 + (float) local167 * local45);
						local82.a(local156 + (float) local167 * local50);
						local82.a(local162 + local54 * (float) local167);
						if (arg0.anInt9759 == 0) {
							local82.b(local131, local136, local139, local144);
						} else {
							local82.a(local131, local136, local139, local144);
						}
						local82.a(1.0F);
						local82.a(0.0F);
						local82.a(local150 + (float) local167 * local33);
						local82.a(local156 + (float) local167 * local37);
						local82.a(local162 + (float) local167 * local41);
						if (arg0.anInt9759 == 0) {
							local82.b(local131, local136, local139, local144);
						} else {
							local82.a(local131, local136, local139, local144);
						}
						local82.a(1.0F);
						local82.a(1.0F);
						local82.a(local59 * (float) local167 + local150);
						local82.a(local156 + local64 * (float) local167);
						local82.a((float) local167 * local68 + local162);
						if (arg0.anInt9759 == 0) {
							local82.b(local131, local136, local139, local144);
						} else {
							local82.a(local131, local136, local139, local144);
						}
						local82.a(0.0F);
						local7++;
						local82.a(1.0F);
					}
					if (this.anIntArray198[local88] > 64) {
						local385 = this.anIntArray198[local88] - 64 - 1;
						for (local126 = this.anIntArray196[local385] - 1; local126 >= 0; local126--) {
							local401 = this.aClass16_Sub6_Sub1ArrayArray2[local385][local126];
							local404 = local401.anInt10129;
							local139 = (byte) (local404 >> 16);
							local144 = (byte) (local404 >> 8);
							local417 = (byte) local404;
							local422 = (byte) (local404 >>> 24);
							local162 = (float) (local401.anInt10126 >> 12);
							local434 = (float) (local401.anInt10131 >> 12);
							local440 = (float) (local401.anInt10130 >> 12);
							local445 = local401.anInt10125 >> 12;
							local82.a(local33 * (float) -local445 + local162);
							local82.a(local434 + local37 * (float) -local445);
							local82.a((float) -local445 * local41 + local440);
							if (arg0.anInt9759 == 0) {
								local82.b(local139, local144, local417, local422);
							} else {
								local82.a(local139, local144, local417, local422);
							}
							local82.a(0.0F);
							local82.a(0.0F);
							local82.a((float) local445 * local45 + local162);
							local82.a(local434 + local50 * (float) local445);
							local82.a(local440 + local54 * (float) local445);
							if (arg0.anInt9759 == 0) {
								local82.b(local139, local144, local417, local422);
							} else {
								local82.a(local139, local144, local417, local422);
							}
							local82.a(1.0F);
							local82.a(0.0F);
							local82.a((float) local445 * local33 + local162);
							local82.a(local37 * (float) local445 + local434);
							local82.a((float) local445 * local41 + local440);
							if (arg0.anInt9759 == 0) {
								local82.b(local139, local144, local417, local422);
							} else {
								local82.a(local139, local144, local417, local422);
							}
							local82.a(1.0F);
							local82.a(1.0F);
							local82.a(local162 + (float) local445 * local59);
							local82.a(local64 * (float) local445 + local434);
							local82.a(local440 + local68 * (float) local445);
							if (arg0.anInt9759 == 0) {
								local82.b(local139, local144, local417, local422);
							} else {
								local82.a(local139, local144, local417, local422);
							}
							local82.a(0.0F);
							local82.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local82.b();
		if (this.anInterface10_3.method8448()) {
			arg0.method8192(0, this.anInterface10_3);
			arg0.method8192(1, this.anInterface10_4);
			arg0.method8243(this.aClass258_1);
			arg0.method8188(0, local7 * 4, Static339.aClass191_4, this.anInterface11_1, local7 * 2, 0);
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(BLclient!ij;)V")
	private void method2614(@OriginalArg(1) Class13_Sub3 arg0) {
		Static147.aFloat62 = arg0.aFloat202;
		arg0.method8223();
		arg0.method8221(false);
		arg0.method8218(false);
		arg0.method8241();
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(ILclient!ij;)V")
	public void method2615(@OriginalArg(1) Class13_Sub3 arg0) {
		this.anInterface10_3.method8450(24, 786336);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!ij;ILclient!fl;B)V")
	public void method2616(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class119 arg2) {
		if (arg0.aClass51_Sub2_16 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method2614(arg0);
		} else {
			this.method2617(arg0, arg1);
		}
		@Pc(26) float local26 = arg0.aClass51_Sub2_16.aFloat74;
		@Pc(30) float local30 = arg0.aClass51_Sub2_16.aFloat73;
		@Pc(34) float local34 = arg0.aClass51_Sub2_16.aFloat78;
		@Pc(38) float local38 = arg0.aClass51_Sub2_16.aFloat79;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(48) Class16_Sub6 local48 = arg2.aClass202_1.aClass16_Sub6_1;
			@Pc(51) Class16_Sub6 local51;
			@Pc(83) int local83;
			for (local51 = local48.aClass16_Sub6_10; local51 != local48; local51 = local51.aClass16_Sub6_10) {
				@Pc(56) Class16_Sub6_Sub1 local56 = (Class16_Sub6_Sub1) local51;
				local83 = (int) (local34 * (float) (local56.anInt10130 >> 12) + (float) (local56.anInt10131 >> 12) * local30 + (float) (local56.anInt10126 >> 12) * local26 + local38);
				this.anIntArray197[local40++] = local83;
				if (local83 < local42) {
					local42 = local83;
				}
				if (local83 > local44) {
					local44 = local83;
				}
			}
			@Pc(114) int local114 = local44 - local42;
			if (local114 + 2 > 1600) {
				local83 = Static138.method2523(local114) + 1 - Static347.anInt9929;
				local114 = (local114 >> local83) + 2;
			} else {
				local83 = 0;
				local114 += 2;
			}
			local51 = local48.aClass16_Sub6_10;
			local40 = 0;
			@Pc(155) int local155 = -2;
			@Pc(157) boolean local157 = true;
			@Pc(159) boolean local159 = true;
			while (local48 != local51) {
				this.anInt3044 = 0;
				for (@Pc(166) int local166 = 0; local166 < local114; local166++) {
					this.anIntArray198[local166] = 0;
				}
				for (@Pc(183) int local183 = 0; local183 < 64; local183++) {
					this.anIntArray196[local183] = 0;
				}
				while (local51 != local48) {
					@Pc(201) Class16_Sub6_Sub1 local201 = (Class16_Sub6_Sub1) local51;
					if (local159) {
						local157 = local201.aBoolean730;
						local155 = local201.anInt10127;
						local159 = false;
					}
					if (local40 > 0 && (local155 != local201.anInt10127 || local157 != local201.aBoolean730)) {
						local159 = true;
						break;
					}
					@Pc(250) int local250 = this.anIntArray197[local40++] - local42 >> local83;
					if (local250 < 1600) {
						if (this.anIntArray198[local250] < 64) {
							this.aClass16_Sub6_Sub1ArrayArray1[local250][this.anIntArray198[local250]++] = local201;
						} else {
							label106: {
								if (this.anIntArray198[local250] == 64) {
									if (this.anInt3044 == 64) {
										break label106;
									}
									this.anIntArray198[local250] += this.anInt3044++ + 1;
								}
								@Pc(318) Class16_Sub6_Sub1[] local318 = this.aClass16_Sub6_Sub1ArrayArray2[this.anIntArray198[local250] - 64 - 1];
								@Pc(326) int local326 = this.anIntArray198[local250] - 65;
								@Pc(328) int local328 = this.anIntArray196[this.anIntArray198[local250] - 65];
								this.anIntArray196[local326] = this.anIntArray196[this.anIntArray198[local250] - 65] + 1;
								local318[local328] = local201;
							}
						}
					}
					local51 = local51.aClass16_Sub6_10;
				}
				arg0.method8261(false, false, local155 < 0 ? -1 : local155);
				if (local157 && Static147.aFloat62 != arg0.aFloat202) {
					arg0.xa(Static147.aFloat62);
				} else if (arg0.aFloat202 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method2612(arg0, local114);
			}
		} catch (@Pc(383) Exception local383) {
		}
		this.method2611(arg0);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!ij;BI)V")
	private void method2617(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(2) int arg1) {
		Static147.aFloat62 = arg0.aFloat202;
		arg0.method8263((float) arg1);
		arg0.method8295();
		arg0.method8221(false);
		arg0.method8218(false);
		arg0.method8241();
	}
}
