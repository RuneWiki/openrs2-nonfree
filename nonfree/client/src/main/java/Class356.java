import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class356 {

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "[I")
	private final int[] anIntArray671 = new int[8191];

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "[[Lclient!fu;")
	private final Class55_Sub2_Sub1[][] aClass55_Sub2_Sub1ArrayArray3 = new Class55_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "[I")
	private final int[] anIntArray672 = new int[1600];

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
	private int anInt10292 = 0;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "[[Lclient!fu;")
	private final Class55_Sub2_Sub1[][] aClass55_Sub2_Sub1ArrayArray4 = new Class55_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "[I")
	private final int[] anIntArray673 = new int[64];

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "Lclient!hj;")
	private final Class142 aClass142_20;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "Lclient!cu;")
	private final Interface2 anInterface2_14;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Lclient!cu;")
	private final Interface2 anInterface2_15;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "Lclient!ui;")
	private final Interface20 anInterface20_8;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!fc;)V")
	public Class356(@OriginalArg(0) Class15_Sub2 arg0) {
		this.aClass142_20 = arg0.method5421(new Class78[] { new Class78(new Class164[] { Static231.aClass164_1, Static231.aClass164_3, Static231.aClass164_5 }), new Class78(Static231.aClass164_2) });
		this.anInterface2_14 = arg0.method5383(true);
		this.anInterface2_15 = arg0.method5383(false);
		this.anInterface2_15.method5805(12, 393168);
		this.anInterface20_8 = arg0.method5489(false);
		this.anInterface20_8.method6240(49146);
		@Pc(96) Buffer local96 = this.anInterface20_8.method6243();
		@Pc(112) int local112;
		if (local96 != null) {
			@Pc(103) Stream local103 = arg0.method5409(local96);
			@Pc(107) int local107;
			if (Stream.b()) {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.f(local112);
					local103.f(local112 + 1);
					local103.f(local112 + 2);
					local103.f(local112 + 2);
					local103.f(local112 + 3);
					local103.f(local112);
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
			this.anInterface20_8.method6241();
		}
		@Pc(197) Buffer local197 = this.anInterface2_15.method6243();
		if (local197 != null) {
			@Pc(204) Stream local204 = arg0.method5409(local197);
			if (Stream.b()) {
				for (local112 = 0; local112 < 8191; local112++) {
					local204.b(0.0F);
					local204.b(-1.0F);
					local204.b(0.0F);
					local204.b(0.0F);
					local204.b(-1.0F);
					local204.b(0.0F);
					local204.b(0.0F);
					local204.b(-1.0F);
					local204.b(0.0F);
					local204.b(0.0F);
					local204.b(-1.0F);
					local204.b(0.0F);
				}
			} else {
				for (local112 = 0; local112 < 8191; local112++) {
					local204.a(0.0F);
					local204.a(-1.0F);
					local204.a(0.0F);
					local204.a(0.0F);
					local204.a(-1.0F);
					local204.a(0.0F);
					local204.a(0.0F);
					local204.a(-1.0F);
					local204.a(0.0F);
					local204.a(0.0F);
					local204.a(-1.0F);
					local204.a(0.0F);
				}
			}
			local204.a();
			this.anInterface2_15.method6241();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!fc;B)V")
	public void method8320(@OriginalArg(0) Class15_Sub2 arg0) {
		this.anInterface2_14.method5805(24, 786336);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!fc;Lclient!qu;)V")
	public void method8321(@OriginalArg(1) Class15_Sub2 arg0, @OriginalArg(2) Class274 arg1) {
		if (arg0.aClass255_Sub3_16 == null) {
			return;
		}
		this.method8323(arg0);
		@Pc(17) float local17 = arg0.aClass255_Sub3_16.aFloat193;
		@Pc(21) float local21 = arg0.aClass255_Sub3_16.aFloat191;
		@Pc(25) float local25 = arg0.aClass255_Sub3_16.aFloat192;
		@Pc(29) float local29 = arg0.aClass255_Sub3_16.aFloat194;
		try {
			@Pc(39) int local39;
			@Pc(47) int local47;
			@Pc(71) Class55_Sub2 local71;
			@Pc(84) int local84;
			@Pc(249) Class55_Sub2_Sub1[] local249;
			@Pc(182) int local182;
			@Pc(259) int local259;
			@Pc(261) int local261;
			if (arg1.aBoolean690) {
				local39 = arg1.anInt8395 - arg1.anInt8396;
				if (local39 + 2 <= 1600) {
					local39 += 2;
					local47 = 0;
				} else {
					local47 = Static373.method6080(local39) + 1 - Static37.anInt1035;
					local39 = (local39 >> local47) + 2;
				}
				@Pc(68) Class55_Sub2 local68 = arg1.aClass22_1.aClass55_Sub2_1;
				local71 = local68.aClass55_Sub2_10;
				@Pc(73) int local73 = -2;
				@Pc(75) boolean local75 = true;
				@Pc(77) boolean local77 = true;
				while (local68 != local71) {
					this.anInt10292 = 0;
					for (local84 = 0; local84 < local39; local84++) {
						this.anIntArray672[local84] = 0;
					}
					for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
						this.anIntArray673[local97] = 0;
					}
					while (local71 != local68) {
						@Pc(113) Class55_Sub2_Sub1 local113 = (Class55_Sub2_Sub1) local71;
						if (local77) {
							local73 = local113.anInt2867;
							local77 = false;
							local75 = local113.aBoolean219;
						} else if (local113.anInt2867 != local73 || local113.aBoolean219 != local75) {
							local77 = true;
							break;
						}
						local182 = (int) (local17 * (float) (local113.anInt2862 >> 12) + local21 * (float) (local113.anInt2858 >> 12) + (float) (local113.anInt2859 >> 12) * local25 + local29) - arg1.anInt8396 >> local47;
						if (local182 < 1600) {
							if (this.anIntArray672[local182] < 64) {
								this.aClass55_Sub2_Sub1ArrayArray4[local182][this.anIntArray672[local182]++] = local113;
							} else {
								label202: {
									if (this.anIntArray672[local182] == 64) {
										if (this.anInt10292 == 64) {
											break label202;
										}
										this.anIntArray672[local182] += this.anInt10292++ + 1;
									}
									local249 = this.aClass55_Sub2_Sub1ArrayArray3[this.anIntArray672[local182] - 1 - 64];
									local259 = this.anIntArray672[local182] - 1 - 64;
									local261 = this.anIntArray673[this.anIntArray672[local182] - 1 - 64];
									this.anIntArray673[local259] = this.anIntArray673[this.anIntArray672[local182] - 1 - 64] + 1;
									local249[local261] = local113;
								}
							}
						}
						local71 = local71.aClass55_Sub2_10;
					}
					arg0.method5359(false, false, local73 <= 0 ? -1 : local73);
					if (local75 && Static542.aFloat189 != arg0.aFloat126) {
						arg0.ha(Static542.aFloat189);
					} else if (arg0.aFloat126 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method8325(local39, arg0);
				}
			} else {
				local39 = 0;
				local47 = Integer.MAX_VALUE;
				@Pc(322) int local322 = 0;
				local71 = arg1.aClass22_1.aClass55_Sub2_1;
				@Pc(329) Class55_Sub2 local329;
				@Pc(361) int local361;
				for (local329 = local71.aClass55_Sub2_10; local329 != local71; local329 = local329.aClass55_Sub2_10) {
					@Pc(334) Class55_Sub2_Sub1 local334 = (Class55_Sub2_Sub1) local329;
					local361 = (int) (local21 * (float) (local334.anInt2858 >> 12) + (float) (local334.anInt2862 >> 12) * local17 + (float) (local334.anInt2859 >> 12) * local25 + local29);
					if (local322 < local361) {
						local322 = local361;
					}
					this.anIntArray671[local39++] = local361;
					if (local47 > local361) {
						local47 = local361;
					}
				}
				@Pc(396) int local396 = local322 - local47;
				if (local396 + 2 > 1600) {
					local361 = Static373.method6080(local396) + 1 - Static37.anInt1035;
					local396 = (local396 >> local361) + 2;
				} else {
					local396 += 2;
					local361 = 0;
				}
				local329 = local71.aClass55_Sub2_10;
				local39 = 0;
				local84 = -2;
				@Pc(434) boolean local434 = true;
				@Pc(436) boolean local436 = true;
				while (local71 != local329) {
					this.anInt10292 = 0;
					for (local182 = 0; local182 < local396; local182++) {
						this.anIntArray672[local182] = 0;
					}
					for (@Pc(456) int local456 = 0; local456 < 64; local456++) {
						this.anIntArray673[local456] = 0;
					}
					while (local71 != local329) {
						@Pc(474) Class55_Sub2_Sub1 local474 = (Class55_Sub2_Sub1) local329;
						if (local436) {
							local436 = false;
							local84 = local474.anInt2867;
							local434 = local474.aBoolean219;
						}
						if (local39 > 0 && (local474.anInt2867 != local84 || local434 != local474.aBoolean219)) {
							local436 = true;
							break;
						}
						@Pc(520) int local520 = this.anIntArray671[local39++] - local47 >> local361;
						if (local520 < 1600) {
							if (this.anIntArray672[local520] < 64) {
								this.aClass55_Sub2_Sub1ArrayArray4[local520][this.anIntArray672[local520]++] = local474;
							} else {
								label152: {
									if (this.anIntArray672[local520] == 64) {
										if (this.anInt10292 == 64) {
											break label152;
										}
										this.anIntArray672[local520] += this.anInt10292++ + 1;
									}
									local249 = this.aClass55_Sub2_Sub1ArrayArray3[this.anIntArray672[local520] - 64 - 1];
									local259 = this.anIntArray672[local520] - 65;
									local261 = this.anIntArray673[this.anIntArray672[local520] - 65];
									this.anIntArray673[local259] = this.anIntArray673[this.anIntArray672[local520] - 65] + 1;
									local249[local261] = local474;
								}
							}
						}
						local329 = local329.aClass55_Sub2_10;
					}
					arg0.method5359(false, false, local84 >= 0 ? local84 : -1);
					if (local434 && arg0.aFloat126 != Static542.aFloat189) {
						arg0.ha(Static542.aFloat189);
					} else if (arg0.aFloat126 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method8325(local396, arg0);
				}
			}
		} catch (@Pc(662) Exception local662) {
		}
		this.method8326(arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!fc;Z)V")
	private void method8323(@OriginalArg(0) Class15_Sub2 arg0) {
		Static542.aFloat189 = arg0.aFloat126;
		arg0.method5486();
		arg0.method5452(false);
		arg0.method5399(false);
		arg0.method5477();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
	public void method8324() {
		this.anInterface2_14.method6239();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILclient!fc;)V")
	private void method8325(@OriginalArg(0) int arg0, @OriginalArg(2) Class15_Sub2 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class255_Sub3 local11 = arg1.method5377();
		@Pc(14) float local14 = local11.aFloat198;
		@Pc(17) float local17 = local11.aFloat196;
		@Pc(20) float local20 = local11.aFloat199;
		@Pc(23) float local23 = local11.aFloat200;
		@Pc(26) float local26 = local11.aFloat190;
		@Pc(29) float local29 = local11.aFloat201;
		@Pc(33) float local33 = local14 + local23;
		@Pc(37) float local37 = local26 + local17;
		@Pc(41) float local41 = local29 + local20;
		@Pc(45) float local45 = local14 - local23;
		@Pc(50) float local50 = local17 - local26;
		@Pc(54) float local54 = local20 - local29;
		@Pc(59) float local59 = local23 - local14;
		@Pc(64) float local64 = local26 - local17;
		@Pc(69) float local69 = local29 - local20;
		@Pc(75) Buffer local75 = this.anInterface2_14.method6243();
		if (local75 == null) {
			return;
		}
		@Pc(83) Stream local83 = arg1.method5409(local75);
		@Pc(97) int local97;
		@Pc(114) int local114;
		@Pc(120) int local120;
		@Pc(129) Class55_Sub2_Sub1 local129;
		@Pc(132) int local132;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(168) float local168;
		@Pc(173) int local173;
		@Pc(452) float local452;
		@Pc(457) int local457;
		@Pc(397) int local397;
		@Pc(413) Class55_Sub2_Sub1 local413;
		@Pc(416) int local416;
		@Pc(429) byte local429;
		@Pc(434) byte local434;
		@Pc(446) float local446;
		if (Stream.b()) {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray672[local97] <= 64 ? this.anIntArray672[local97] : 64;
				if (local114 > 0) {
					for (local120 = local114 - 1; local120 >= 0; local120--) {
						local129 = this.aClass55_Sub2_Sub1ArrayArray4[local97][local120];
						local132 = local129.anInt2864;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt2862 >> 12;
						local162 = local129.anInt2858 >> 12;
						local168 = local129.anInt2859 >> 12;
						local173 = local129.anInt2865 >> 12;
						local83.b(local156 + (float) -local173 * local33);
						local83.b(local37 * (float) -local173 + local162);
						local83.b(local168 + (float) -local173 * local41);
						if (arg1.anInt6540 == 0) {
							local83.b(local137, local142, local145, local150);
						} else {
							local83.a(local137, local142, local145, local150);
						}
						local83.b(0.0F);
						local83.b(0.0F);
						local83.b(local45 * (float) local173 + local156);
						local83.b(local50 * (float) local173 + local162);
						local83.b(local168 + local54 * (float) local173);
						if (arg1.anInt6540 == 0) {
							local83.b(local137, local142, local145, local150);
						} else {
							local83.a(local137, local142, local145, local150);
						}
						local83.b(1.0F);
						local83.b(0.0F);
						local83.b(local156 + (float) local173 * local33);
						local83.b(local162 + local37 * (float) local173);
						local83.b((float) local173 * local41 + local168);
						if (arg1.anInt6540 == 0) {
							local83.b(local137, local142, local145, local150);
						} else {
							local83.a(local137, local142, local145, local150);
						}
						local83.b(1.0F);
						local83.b(1.0F);
						local83.b((float) local173 * local59 + local156);
						local83.b(local64 * (float) local173 + local162);
						local83.b((float) local173 * local69 + local168);
						if (arg1.anInt6540 == 0) {
							local83.b(local137, local142, local145, local150);
						} else {
							local83.a(local137, local142, local145, local150);
						}
						local83.b(0.0F);
						local83.b(1.0F);
						local7++;
					}
					if (this.anIntArray672[local97] > 64) {
						local397 = this.anIntArray672[local97] - 64 - 1;
						for (local132 = this.anIntArray673[local397] - 1; local132 >= 0; local132--) {
							local413 = this.aClass55_Sub2_Sub1ArrayArray3[local397][local132];
							local416 = local413.anInt2864;
							local145 = (byte) (local416 >> 16);
							local150 = (byte) (local416 >> 8);
							local429 = (byte) local416;
							local434 = (byte) (local416 >>> 24);
							local168 = local413.anInt2862 >> 12;
							local446 = local413.anInt2858 >> 12;
							local452 = local413.anInt2859 >> 12;
							local457 = local413.anInt2865 >> 12;
							local83.b(local168 + local33 * (float) -local457);
							local83.b(local446 + (float) -local457 * local37);
							local83.b(local452 + local41 * (float) -local457);
							if (arg1.anInt6540 == 0) {
								local83.b(local145, local150, local429, local434);
							} else {
								local83.a(local145, local150, local429, local434);
							}
							local83.b(0.0F);
							local83.b(0.0F);
							local83.b(local168 + (float) local457 * local45);
							local83.b((float) local457 * local50 + local446);
							local83.b((float) local457 * local54 + local452);
							if (arg1.anInt6540 == 0) {
								local83.b(local145, local150, local429, local434);
							} else {
								local83.a(local145, local150, local429, local434);
							}
							local83.b(1.0F);
							local83.b(0.0F);
							local83.b(local168 + (float) local457 * local33);
							local83.b((float) local457 * local37 + local446);
							local83.b(local452 + local41 * (float) local457);
							if (arg1.anInt6540 == 0) {
								local83.b(local145, local150, local429, local434);
							} else {
								local83.a(local145, local150, local429, local434);
							}
							local83.b(1.0F);
							local83.b(1.0F);
							local83.b(local59 * (float) local457 + local168);
							local83.b(local446 + local64 * (float) local457);
							local83.b(local452 + (float) local457 * local69);
							if (arg1.anInt6540 == 0) {
								local83.b(local145, local150, local429, local434);
							} else {
								local83.a(local145, local150, local429, local434);
							}
							local83.b(0.0F);
							local7++;
							local83.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray672[local97] > 64 ? 64 : this.anIntArray672[local97];
				if (local114 > 0) {
					for (local120 = local114 - 1; local120 >= 0; local120--) {
						local129 = this.aClass55_Sub2_Sub1ArrayArray4[local97][local120];
						local132 = local129.anInt2864;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt2862 >> 12;
						local162 = local129.anInt2858 >> 12;
						local168 = local129.anInt2859 >> 12;
						local173 = local129.anInt2865 >> 12;
						local83.a(local156 + local33 * (float) -local173);
						local83.a(local37 * (float) -local173 + local162);
						local83.a((float) -local173 * local41 + local168);
						if (arg1.anInt6540 == 0) {
							local83.b(local137, local142, local145, local150);
						} else {
							local83.a(local137, local142, local145, local150);
						}
						local83.a(0.0F);
						local83.a(0.0F);
						local83.a(local156 + (float) local173 * local45);
						local83.a(local162 + local50 * (float) local173);
						local83.a(local168 + local54 * (float) local173);
						if (arg1.anInt6540 == 0) {
							local83.b(local137, local142, local145, local150);
						} else {
							local83.a(local137, local142, local145, local150);
						}
						local83.a(1.0F);
						local83.a(0.0F);
						local83.a(local156 + (float) local173 * local33);
						local83.a(local37 * (float) local173 + local162);
						local83.a(local168 + local41 * (float) local173);
						if (arg1.anInt6540 == 0) {
							local83.b(local137, local142, local145, local150);
						} else {
							local83.a(local137, local142, local145, local150);
						}
						local83.a(1.0F);
						local83.a(1.0F);
						local83.a(local156 + local59 * (float) local173);
						local83.a(local64 * (float) local173 + local162);
						local83.a(local168 + local69 * (float) local173);
						if (arg1.anInt6540 == 0) {
							local83.b(local137, local142, local145, local150);
						} else {
							local83.a(local137, local142, local145, local150);
						}
						local83.a(0.0F);
						local83.a(1.0F);
						local7++;
					}
					if (this.anIntArray672[local97] > 64) {
						local397 = this.anIntArray672[local97] - 1 - 64;
						for (local132 = this.anIntArray673[local397] - 1; local132 >= 0; local132--) {
							local413 = this.aClass55_Sub2_Sub1ArrayArray3[local397][local132];
							local416 = local413.anInt2864;
							local145 = (byte) (local416 >> 16);
							local150 = (byte) (local416 >> 8);
							local429 = (byte) local416;
							local434 = (byte) (local416 >>> 24);
							local168 = local413.anInt2862 >> 12;
							local446 = local413.anInt2858 >> 12;
							local452 = local413.anInt2859 >> 12;
							local457 = local413.anInt2865 >> 12;
							local83.a(local33 * (float) -local457 + local168);
							local83.a((float) -local457 * local37 + local446);
							local83.a(local41 * (float) -local457 + local452);
							if (arg1.anInt6540 == 0) {
								local83.b(local145, local150, local429, local434);
							} else {
								local83.a(local145, local150, local429, local434);
							}
							local83.a(0.0F);
							local83.a(0.0F);
							local83.a(local168 + local45 * (float) local457);
							local83.a((float) local457 * local50 + local446);
							local83.a(local452 + (float) local457 * local54);
							if (arg1.anInt6540 == 0) {
								local83.b(local145, local150, local429, local434);
							} else {
								local83.a(local145, local150, local429, local434);
							}
							local83.a(1.0F);
							local83.a(0.0F);
							local83.a(local168 + (float) local457 * local33);
							local83.a(local446 + local37 * (float) local457);
							local83.a(local452 + local41 * (float) local457);
							if (arg1.anInt6540 == 0) {
								local83.b(local145, local150, local429, local434);
							} else {
								local83.a(local145, local150, local429, local434);
							}
							local83.a(1.0F);
							local83.a(1.0F);
							local83.a(local168 + (float) local457 * local59);
							local83.a(local446 + (float) local457 * local64);
							local83.a(local452 + local69 * (float) local457);
							if (arg1.anInt6540 == 0) {
								local83.b(local145, local150, local429, local434);
							} else {
								local83.a(local145, local150, local429, local434);
							}
							local83.a(0.0F);
							local83.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local83.a();
		if (this.anInterface2_14.method6241()) {
			arg1.method5376(0, this.anInterface2_14);
			arg1.method5376(1, this.anInterface2_15);
			arg1.method5391(this.aClass142_20);
			arg1.method5375(0, Static18.aClass32_2, 0, local7 * 2, local7 * 4, this.anInterface20_8);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!fc;I)V")
	private void method8326(@OriginalArg(0) Class15_Sub2 arg0) {
		arg0.method5399(true);
		arg0.method5452(true);
		if (arg0.aFloat126 != Static542.aFloat189) {
			arg0.ha(Static542.aFloat189);
		}
	}
}
