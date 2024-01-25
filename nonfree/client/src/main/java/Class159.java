import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class159 {

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
	private int anInt4359 = 0;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "[I")
	private final int[] anIntArray341 = new int[64];

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "[I")
	private final int[] anIntArray340 = new int[8191];

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "[I")
	private final int[] anIntArray342 = new int[1600];

	@OriginalMember(owner = "client!iea", name = "t", descriptor = "[[Lclient!on;")
	private final Class12_Sub7_Sub2[][] aClass12_Sub7_Sub2ArrayArray2 = new Class12_Sub7_Sub2[64][768];

	@OriginalMember(owner = "client!iea", name = "p", descriptor = "[[Lclient!on;")
	private final Class12_Sub7_Sub2[][] aClass12_Sub7_Sub2ArrayArray1 = new Class12_Sub7_Sub2[1600][64];

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "Lclient!kq;")
	private final Class201 aClass201_1;

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "Lclient!hl;")
	private final Interface10 anInterface10_1;

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "Lclient!hl;")
	private final Interface10 anInterface10_2;

	@OriginalMember(owner = "client!iea", name = "q", descriptor = "Lclient!dk;")
	private final Interface4 anInterface4_1;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class159(@OriginalArg(0) Class137_Sub1 arg0) {
		this.aClass201_1 = arg0.method8040(new Class388[] { new Class388(new Class170[] { Static256.aClass170_1, Static256.aClass170_3, Static256.aClass170_5 }), new Class388(Static256.aClass170_2) });
		this.anInterface10_1 = arg0.method7963(true);
		this.anInterface10_2 = arg0.method7963(false);
		this.anInterface10_2.method3994(393168, 12);
		this.anInterface4_1 = arg0.method8073(false);
		this.anInterface4_1.method5678(49146);
		@Pc(98) Buffer local98 = this.anInterface4_1.method5680();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method8079(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.a(local115);
					local105.a(local115 + 1);
					local105.a(local115 + 2);
					local105.a(local115 + 2);
					local105.a(local115 + 3);
					local105.a(local115);
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
			local105.b();
			this.anInterface4_1.method5682();
		}
		@Pc(200) Buffer local200 = this.anInterface10_2.method3996();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method8079(local200);
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
			local207.b();
			this.anInterface10_2.method3995();
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!pj;I)V")
	private void method3608(@OriginalArg(0) Class137_Sub1 arg0) {
		arg0.method8022(true);
		arg0.method7983(true);
		if (Static515.aFloat222 != arg0.aFloat235) {
			arg0.xa(Static515.aFloat222);
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!pj;B)V")
	private void method3610(@OriginalArg(0) Class137_Sub1 arg0) {
		Static515.aFloat222 = arg0.aFloat235;
		arg0.method7955();
		arg0.method7983(false);
		arg0.method8022(false);
		arg0.method7977();
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!pj;BI)V")
	private void method3611(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static515.aFloat222 = arg0.aFloat235;
		arg0.method7993((float) arg1);
		arg0.method7966();
		arg0.method7983(false);
		arg0.method8022(false);
		arg0.method7977();
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V")
	public void method3612() {
		this.anInterface10_1.method5675();
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILclient!pj;)V")
	public void method3613(@OriginalArg(1) Class137_Sub1 arg0) {
		this.anInterface10_1.method3994(786336, 24);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZILclient!pj;)V")
	private void method3614(@OriginalArg(1) int arg0, @OriginalArg(2) Class137_Sub1 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class26_Sub1 local11 = arg1.method8016();
		@Pc(14) float local14 = local11.aFloat29;
		@Pc(17) float local17 = local11.aFloat26;
		@Pc(20) float local20 = local11.aFloat19;
		@Pc(23) float local23 = local11.aFloat22;
		@Pc(26) float local26 = local11.aFloat24;
		@Pc(29) float local29 = local11.aFloat27;
		@Pc(33) float local33 = local14 + local23;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local29 + local20;
		@Pc(46) float local46 = local14 - local23;
		@Pc(50) float local50 = local17 - local26;
		@Pc(54) float local54 = local20 - local29;
		@Pc(58) float local58 = local23 - local14;
		@Pc(62) float local62 = local26 - local17;
		@Pc(67) float local67 = local29 - local20;
		@Pc(73) Buffer local73 = this.anInterface10_1.method3996();
		if (local73 == null) {
			return;
		}
		@Pc(81) Stream local81 = arg1.method8079(local73);
		@Pc(87) int local87;
		@Pc(102) int local102;
		@Pc(108) int local108;
		@Pc(117) Class12_Sub7_Sub2 local117;
		@Pc(120) int local120;
		@Pc(125) byte local125;
		@Pc(130) byte local130;
		@Pc(133) byte local133;
		@Pc(138) byte local138;
		@Pc(144) float local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(161) int local161;
		@Pc(440) float local440;
		@Pc(445) int local445;
		@Pc(385) int local385;
		@Pc(401) Class12_Sub7_Sub2 local401;
		@Pc(404) int local404;
		@Pc(417) byte local417;
		@Pc(422) byte local422;
		@Pc(434) float local434;
		if (Stream.c()) {
			for (local87 = arg0 - 1; local87 >= 0; local87--) {
				local102 = this.anIntArray342[local87] > 64 ? 64 : this.anIntArray342[local87];
				if (local102 > 0) {
					for (local108 = local102 - 1; local108 >= 0; local108--) {
						local117 = this.aClass12_Sub7_Sub2ArrayArray1[local87][local108];
						local120 = local117.anInt10254;
						local125 = (byte) (local120 >> 16);
						local130 = (byte) (local120 >> 8);
						local133 = (byte) local120;
						local138 = (byte) (local120 >>> 24);
						local144 = (float) (local117.anInt10249 >> 12);
						local150 = (float) (local117.anInt10247 >> 12);
						local156 = (float) (local117.anInt10252 >> 12);
						local161 = local117.anInt10251 >> 12;
						local81.b((float) -local161 * local33 + local144);
						local81.b(local37 * (float) -local161 + local150);
						local81.b(local41 * (float) -local161 + local156);
						if (arg1.anInt9724 == 0) {
							local81.b(local125, local130, local133, local138);
						} else {
							local81.a(local125, local130, local133, local138);
						}
						local81.b(0.0F);
						local81.b(0.0F);
						local81.b(local144 + (float) local161 * local46);
						local81.b((float) local161 * local50 + local150);
						local81.b((float) local161 * local54 + local156);
						if (arg1.anInt9724 == 0) {
							local81.b(local125, local130, local133, local138);
						} else {
							local81.a(local125, local130, local133, local138);
						}
						local81.b(1.0F);
						local81.b(0.0F);
						local81.b((float) local161 * local33 + local144);
						local81.b(local150 + local37 * (float) local161);
						local81.b(local156 + (float) local161 * local41);
						if (arg1.anInt9724 == 0) {
							local81.b(local125, local130, local133, local138);
						} else {
							local81.a(local125, local130, local133, local138);
						}
						local81.b(1.0F);
						local81.b(1.0F);
						local81.b((float) local161 * local58 + local144);
						local81.b(local150 + local62 * (float) local161);
						local81.b(local156 + (float) local161 * local67);
						if (arg1.anInt9724 == 0) {
							local81.b(local125, local130, local133, local138);
						} else {
							local81.a(local125, local130, local133, local138);
						}
						local81.b(0.0F);
						local81.b(1.0F);
						local7++;
					}
					if (this.anIntArray342[local87] > 64) {
						local385 = this.anIntArray342[local87] - 1 - 64;
						for (local120 = this.anIntArray341[local385] - 1; local120 >= 0; local120--) {
							local401 = this.aClass12_Sub7_Sub2ArrayArray2[local385][local120];
							local404 = local401.anInt10254;
							local133 = (byte) (local404 >> 16);
							local138 = (byte) (local404 >> 8);
							local417 = (byte) local404;
							local422 = (byte) (local404 >>> 24);
							local156 = (float) (local401.anInt10249 >> 12);
							local434 = (float) (local401.anInt10247 >> 12);
							local440 = (float) (local401.anInt10252 >> 12);
							local445 = local401.anInt10251 >> 12;
							local81.b(local33 * (float) -local445 + local156);
							local81.b(local434 + local37 * (float) -local445);
							local81.b(local41 * (float) -local445 + local440);
							if (arg1.anInt9724 == 0) {
								local81.b(local133, local138, local417, local422);
							} else {
								local81.a(local133, local138, local417, local422);
							}
							local81.b(0.0F);
							local81.b(0.0F);
							local81.b(local156 + (float) local445 * local46);
							local81.b(local50 * (float) local445 + local434);
							local81.b((float) local445 * local54 + local440);
							if (arg1.anInt9724 == 0) {
								local81.b(local133, local138, local417, local422);
							} else {
								local81.a(local133, local138, local417, local422);
							}
							local81.b(1.0F);
							local81.b(0.0F);
							local81.b((float) local445 * local33 + local156);
							local81.b((float) local445 * local37 + local434);
							local81.b(local440 + local41 * (float) local445);
							if (arg1.anInt9724 == 0) {
								local81.b(local133, local138, local417, local422);
							} else {
								local81.a(local133, local138, local417, local422);
							}
							local81.b(1.0F);
							local81.b(1.0F);
							local81.b(local156 + local58 * (float) local445);
							local81.b(local434 + (float) local445 * local62);
							local81.b(local67 * (float) local445 + local440);
							if (arg1.anInt9724 == 0) {
								local81.b(local133, local138, local417, local422);
							} else {
								local81.a(local133, local138, local417, local422);
							}
							local81.b(0.0F);
							local7++;
							local81.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local87 = arg0 - 1; local87 >= 0; local87--) {
				local102 = this.anIntArray342[local87] > 64 ? 64 : this.anIntArray342[local87];
				if (local102 > 0) {
					for (local108 = local102 - 1; local108 >= 0; local108--) {
						local117 = this.aClass12_Sub7_Sub2ArrayArray1[local87][local108];
						local120 = local117.anInt10254;
						local125 = (byte) (local120 >> 16);
						local130 = (byte) (local120 >> 8);
						local133 = (byte) local120;
						local138 = (byte) (local120 >>> 24);
						local144 = (float) (local117.anInt10249 >> 12);
						local150 = (float) (local117.anInt10247 >> 12);
						local156 = (float) (local117.anInt10252 >> 12);
						local161 = local117.anInt10251 >> 12;
						local81.a(local144 + local33 * (float) -local161);
						local81.a(local37 * (float) -local161 + local150);
						local81.a(local41 * (float) -local161 + local156);
						if (arg1.anInt9724 == 0) {
							local81.b(local125, local130, local133, local138);
						} else {
							local81.a(local125, local130, local133, local138);
						}
						local81.a(0.0F);
						local81.a(0.0F);
						local81.a((float) local161 * local46 + local144);
						local81.a(local50 * (float) local161 + local150);
						local81.a(local156 + local54 * (float) local161);
						if (arg1.anInt9724 == 0) {
							local81.b(local125, local130, local133, local138);
						} else {
							local81.a(local125, local130, local133, local138);
						}
						local81.a(1.0F);
						local81.a(0.0F);
						local81.a(local144 + local33 * (float) local161);
						local81.a(local150 + local37 * (float) local161);
						local81.a(local41 * (float) local161 + local156);
						if (arg1.anInt9724 == 0) {
							local81.b(local125, local130, local133, local138);
						} else {
							local81.a(local125, local130, local133, local138);
						}
						local81.a(1.0F);
						local81.a(1.0F);
						local81.a((float) local161 * local58 + local144);
						local81.a(local150 + local62 * (float) local161);
						local81.a(local156 + local67 * (float) local161);
						if (arg1.anInt9724 == 0) {
							local81.b(local125, local130, local133, local138);
						} else {
							local81.a(local125, local130, local133, local138);
						}
						local81.a(0.0F);
						local7++;
						local81.a(1.0F);
					}
					if (this.anIntArray342[local87] > 64) {
						local385 = this.anIntArray342[local87] - 65;
						for (local120 = this.anIntArray341[local385] - 1; local120 >= 0; local120--) {
							local401 = this.aClass12_Sub7_Sub2ArrayArray2[local385][local120];
							local404 = local401.anInt10254;
							local133 = (byte) (local404 >> 16);
							local138 = (byte) (local404 >> 8);
							local417 = (byte) local404;
							local422 = (byte) (local404 >>> 24);
							local156 = (float) (local401.anInt10249 >> 12);
							local434 = (float) (local401.anInt10247 >> 12);
							local440 = (float) (local401.anInt10252 >> 12);
							local445 = local401.anInt10251 >> 12;
							local81.a((float) -local445 * local33 + local156);
							local81.a((float) -local445 * local37 + local434);
							local81.a(local440 + (float) -local445 * local41);
							if (arg1.anInt9724 == 0) {
								local81.b(local133, local138, local417, local422);
							} else {
								local81.a(local133, local138, local417, local422);
							}
							local81.a(0.0F);
							local81.a(0.0F);
							local81.a((float) local445 * local46 + local156);
							local81.a((float) local445 * local50 + local434);
							local81.a(local440 + (float) local445 * local54);
							if (arg1.anInt9724 == 0) {
								local81.b(local133, local138, local417, local422);
							} else {
								local81.a(local133, local138, local417, local422);
							}
							local81.a(1.0F);
							local81.a(0.0F);
							local81.a(local156 + local33 * (float) local445);
							local81.a((float) local445 * local37 + local434);
							local81.a((float) local445 * local41 + local440);
							if (arg1.anInt9724 == 0) {
								local81.b(local133, local138, local417, local422);
							} else {
								local81.a(local133, local138, local417, local422);
							}
							local81.a(1.0F);
							local81.a(1.0F);
							local81.a(local58 * (float) local445 + local156);
							local81.a(local434 + (float) local445 * local62);
							local81.a(local440 + (float) local445 * local67);
							if (arg1.anInt9724 == 0) {
								local81.b(local133, local138, local417, local422);
							} else {
								local81.a(local133, local138, local417, local422);
							}
							local81.a(0.0F);
							local81.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local81.b();
		if (this.anInterface10_1.method3995()) {
			arg1.method8067(0, this.anInterface10_1);
			arg1.method8067(1, this.anInterface10_2);
			arg1.method8000(this.aClass201_1);
			arg1.method7980(local7 * 2, this.anInterface4_1, 0, 0, local7 * 4, Static620.aClass54_6);
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!kd;IBLclient!pj;)V")
	public void method3615(@OriginalArg(0) Class196 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class137_Sub1 arg2) {
		if (arg2.aClass26_Sub1_16 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method3611(arg2, arg1);
		} else {
			this.method3610(arg2);
		}
		@Pc(29) float local29 = arg2.aClass26_Sub1_16.aFloat20;
		@Pc(33) float local33 = arg2.aClass26_Sub1_16.aFloat28;
		@Pc(37) float local37 = arg2.aClass26_Sub1_16.aFloat21;
		@Pc(41) float local41 = arg2.aClass26_Sub1_16.aFloat25;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class12_Sub7 local51 = arg0.aClass243_1.aClass12_Sub7_5;
			@Pc(54) Class12_Sub7 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass12_Sub7_9; local54 != local51; local54 = local54.aClass12_Sub7_9) {
				@Pc(59) Class12_Sub7_Sub2 local59 = (Class12_Sub7_Sub2) local54;
				local86 = (int) (local41 + (float) (local59.anInt10249 >> 12) * local29 + local33 * (float) (local59.anInt10247 >> 12) + (float) (local59.anInt10252 >> 12) * local37);
				this.anIntArray340[local43++] = local86;
				if (local45 > local86) {
					local45 = local86;
				}
				if (local86 > local47) {
					local47 = local86;
				}
			}
			@Pc(120) int local120 = local47 - local45;
			if (local120 + 2 <= 1600) {
				local120 += 2;
				local86 = 0;
			} else {
				local86 = Static296.method5214(local120) + 1 - Static175.anInt3420;
				local120 = (local120 >> local86) + 2;
			}
			local43 = 0;
			local54 = local51.aClass12_Sub7_9;
			@Pc(153) int local153 = -2;
			@Pc(155) boolean local155 = true;
			@Pc(157) boolean local157 = true;
			while (local51 != local54) {
				this.anInt4359 = 0;
				for (@Pc(164) int local164 = 0; local164 < local120; local164++) {
					this.anIntArray342[local164] = 0;
				}
				for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
					this.anIntArray341[local177] = 0;
				}
				while (local54 != local51) {
					@Pc(193) Class12_Sub7_Sub2 local193 = (Class12_Sub7_Sub2) local54;
					if (local157) {
						local157 = false;
						local155 = local193.aBoolean716;
						local153 = local193.anInt10253;
					}
					if (local43 > 0 && (local193.anInt10253 != local153 || local193.aBoolean716 != local155)) {
						local157 = true;
						break;
					}
					@Pc(232) int local232 = this.anIntArray340[local43++] - local45 >> local86;
					if (local232 < 1600) {
						if (this.anIntArray342[local232] < 64) {
							this.aClass12_Sub7_Sub2ArrayArray1[local232][this.anIntArray342[local232]++] = local193;
						} else {
							label101: {
								if (this.anIntArray342[local232] == 64) {
									if (this.anInt4359 == 64) {
										break label101;
									}
									this.anIntArray342[local232] += this.anInt4359++ + 1;
								}
								@Pc(303) Class12_Sub7_Sub2[] local303 = this.aClass12_Sub7_Sub2ArrayArray2[this.anIntArray342[local232] - 1 - 64];
								@Pc(313) int local313 = this.anIntArray342[local232] - 64 - 1;
								@Pc(315) int local315 = this.anIntArray341[this.anIntArray342[local232] - 64 - 1];
								this.anIntArray341[local313] = this.anIntArray341[this.anIntArray342[local232] - 64 - 1] + 1;
								local303[local315] = local193;
							}
						}
					}
					local54 = local54.aClass12_Sub7_9;
				}
				arg2.method7962(false, local153 >= 0 ? local153 : -1, false);
				if (local155 && Static515.aFloat222 != arg2.aFloat235) {
					arg2.xa(Static515.aFloat222);
				} else if (arg2.aFloat235 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method3614(local120, arg2);
			}
		} catch (@Pc(367) Exception local367) {
		}
		this.method3608(arg2);
	}
}
