import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qja")
public final class Class299 {

	@OriginalMember(owner = "client!qja", name = "g", descriptor = "[I")
	private final int[] anIntArray526 = new int[64];

	@OriginalMember(owner = "client!qja", name = "t", descriptor = "[I")
	private final int[] anIntArray527 = new int[8191];

	@OriginalMember(owner = "client!qja", name = "u", descriptor = "[[Lclient!ts;")
	private final Class60_Sub2_Sub1[][] aClass60_Sub2_Sub1ArrayArray1 = new Class60_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!qja", name = "v", descriptor = "[I")
	private final int[] anIntArray528 = new int[1600];

	@OriginalMember(owner = "client!qja", name = "m", descriptor = "I")
	private int anInt8360 = 0;

	@OriginalMember(owner = "client!qja", name = "s", descriptor = "[[Lclient!ts;")
	private final Class60_Sub2_Sub1[][] aClass60_Sub2_Sub1ArrayArray2 = new Class60_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!qja", name = "o", descriptor = "Lclient!ot;")
	private final Class207 aClass207_23;

	@OriginalMember(owner = "client!qja", name = "d", descriptor = "Lclient!bl;")
	private final Interface6 anInterface6_17;

	@OriginalMember(owner = "client!qja", name = "n", descriptor = "Lclient!bl;")
	private final Interface6 anInterface6_18;

	@OriginalMember(owner = "client!qja", name = "r", descriptor = "Lclient!uba;")
	private final Interface25 anInterface25_8;

	@OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class299(@OriginalArg(0) Class75_Sub1 arg0) {
		this.aClass207_23 = arg0.method6803(new Class355[] { new Class355(new Class70[] { Static93.aClass70_1, Static93.aClass70_3, Static93.aClass70_5 }), new Class355(Static93.aClass70_2) });
		this.anInterface6_17 = arg0.method6768(true);
		this.anInterface6_18 = arg0.method6768(false);
		this.anInterface6_18.method3659(393168, 12);
		this.anInterface25_8 = arg0.method6817(false);
		this.anInterface25_8.method8679(49146);
		@Pc(98) Buffer local98 = this.anInterface25_8.method8677();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method6788(local98);
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
					local105.a(local115);
					local105.a(local115 + 1);
					local105.a(local115 + 2);
					local105.a(local115 + 2);
					local105.a(local115 + 3);
					local105.a(local115);
				}
			}
			local105.a();
			this.anInterface25_8.method8676();
		}
		@Pc(210) Buffer local210 = this.anInterface6_18.method3658();
		if (local210 != null) {
			@Pc(217) Stream local217 = arg0.method6788(local210);
			if (Stream.b()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local217.a(0.0F);
					local217.a(-1.0F);
					local217.a(0.0F);
					local217.a(0.0F);
					local217.a(-1.0F);
					local217.a(0.0F);
					local217.a(0.0F);
					local217.a(-1.0F);
					local217.a(0.0F);
					local217.a(0.0F);
					local217.a(-1.0F);
					local217.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local217.b(0.0F);
					local217.b(-1.0F);
					local217.b(0.0F);
					local217.b(0.0F);
					local217.b(-1.0F);
					local217.b(0.0F);
					local217.b(0.0F);
					local217.b(-1.0F);
					local217.b(0.0F);
					local217.b(0.0F);
					local217.b(-1.0F);
					local217.b(0.0F);
				}
			}
			local217.a();
			this.anInterface6_18.method3657();
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!kia;Lclient!jj;II)V")
	public void method7302(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class75_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aClass109_Sub3_16 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method7306(arg1);
		} else {
			this.method7309(arg2, arg1);
		}
		@Pc(34) float local34 = arg1.aClass109_Sub3_16.aFloat86;
		@Pc(38) float local38 = arg1.aClass109_Sub3_16.aFloat96;
		@Pc(42) float local42 = arg1.aClass109_Sub3_16.aFloat88;
		@Pc(46) float local46 = arg1.aClass109_Sub3_16.aFloat91;
		try {
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = Integer.MAX_VALUE;
			@Pc(52) int local52 = 0;
			@Pc(56) Class60_Sub2 local56 = arg0.aClass46_1.aClass60_Sub2_1;
			@Pc(59) Class60_Sub2 local59;
			@Pc(91) int local91;
			for (local59 = local56.aClass60_Sub2_10; local59 != local56; local59 = local59.aClass60_Sub2_10) {
				@Pc(64) Class60_Sub2_Sub1 local64 = (Class60_Sub2_Sub1) local59;
				local91 = (int) ((float) (local64.anInt5627 >> 12) * local42 + local34 * (float) (local64.anInt5624 >> 12) + (float) (local64.anInt5625 >> 12) * local38 + local46);
				this.anIntArray527[local48++] = local91;
				if (local91 < local50) {
					local50 = local91;
				}
				if (local52 < local91) {
					local52 = local91;
				}
			}
			@Pc(122) int local122 = local52 - local50;
			if (local122 + 2 > 1600) {
				local91 = Static23.method257(local122) + 1 - Static50.anInt605;
				local122 = (local122 >> local91) + 2;
			} else {
				local91 = 0;
				local122 += 2;
			}
			local59 = local56.aClass60_Sub2_10;
			local48 = 0;
			@Pc(156) int local156 = -2;
			@Pc(158) boolean local158 = true;
			@Pc(168) boolean local168 = true;
			while (local56 != local59) {
				this.anInt8360 = 0;
				for (@Pc(177) int local177 = 0; local177 < local122; local177++) {
					this.anIntArray528[local177] = 0;
				}
				for (@Pc(192) int local192 = 0; local192 < 64; local192++) {
					this.anIntArray526[local192] = 0;
				}
				while (local56 != local59) {
					@Pc(216) Class60_Sub2_Sub1 local216 = (Class60_Sub2_Sub1) local59;
					if (local168) {
						local158 = local216.aBoolean420;
						local156 = local216.anInt5623;
						local168 = false;
					}
					if (local48 > 0 && (local156 != local216.anInt5623 || local216.aBoolean420 != local158)) {
						local168 = true;
						break;
					}
					@Pc(267) int local267 = this.anIntArray527[local48++] - local50 >> local91;
					if (local267 < 1600) {
						if (this.anIntArray528[local267] >= 64) {
							label107: {
								if (this.anIntArray528[local267] == 64) {
									if (this.anInt8360 == 64) {
										break label107;
									}
									this.anIntArray528[local267] += this.anInt8360++ + 1;
								}
								@Pc(329) Class60_Sub2_Sub1[] local329 = this.aClass60_Sub2_Sub1ArrayArray2[this.anIntArray528[local267] - 64 - 1];
								@Pc(339) int local339 = this.anIntArray528[local267] - 1 - 64;
								@Pc(341) int local341 = this.anIntArray526[this.anIntArray528[local267] - 1 - 64];
								this.anIntArray526[local339] = this.anIntArray526[this.anIntArray528[local267] - 1 - 64] + 1;
								local329[local341] = local216;
							}
						} else {
							this.aClass60_Sub2_Sub1ArrayArray1[local267][this.anIntArray528[local267]++] = local216;
						}
					}
					local59 = local59.aClass60_Sub2_10;
				}
				arg1.method6809(false, false, local156 < 0 ? -1 : local156);
				if (local158 && arg1.aFloat152 != Static400.aFloat134) {
					arg1.xa(Static400.aFloat134);
				} else if (arg1.aFloat152 != 1.0F) {
					arg1.xa(1.0F);
				}
				this.method7305(arg1, local122);
			}
		} catch (@Pc(428) Exception local428) {
		}
		this.method7304(arg1);
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!jj;B)V")
	public void method7303(@OriginalArg(0) Class75_Sub1 arg0) {
		this.anInterface6_17.method3659(786336, 24);
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ILclient!jj;)V")
	private void method7304(@OriginalArg(1) Class75_Sub1 arg0) {
		arg0.method6752(true);
		arg0.method6756(true);
		if (Static400.aFloat134 != arg0.aFloat152) {
			arg0.xa(Static400.aFloat134);
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!jj;II)V")
	private void method7305(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class109_Sub3 local11 = arg0.method6848();
		@Pc(14) float local14 = local11.aFloat93;
		@Pc(17) float local17 = local11.aFloat94;
		@Pc(20) float local20 = local11.aFloat92;
		@Pc(23) float local23 = local11.aFloat90;
		@Pc(26) float local26 = local11.aFloat95;
		@Pc(29) float local29 = local11.aFloat85;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local29 + local20;
		@Pc(45) float local45 = local14 - local23;
		@Pc(50) float local50 = local17 - local26;
		@Pc(54) float local54 = local20 - local29;
		@Pc(59) float local59 = local23 - local14;
		@Pc(64) float local64 = local26 - local17;
		@Pc(69) float local69 = local29 - local20;
		@Pc(75) Buffer local75 = this.anInterface6_17.method3658();
		if (local75 == null) {
			return;
		}
		@Pc(84) Stream local84 = arg0.method6788(local75);
		@Pc(90) int local90;
		@Pc(108) int local108;
		@Pc(117) int local117;
		@Pc(128) Class60_Sub2_Sub1 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(463) float local463;
		@Pc(468) int local468;
		@Pc(408) int local408;
		@Pc(424) Class60_Sub2_Sub1 local424;
		@Pc(427) int local427;
		@Pc(440) byte local440;
		@Pc(445) byte local445;
		@Pc(457) float local457;
		if (Stream.b()) {
			for (local90 = arg1 - 1; local90 >= 0; local90--) {
				local108 = this.anIntArray528[local90] > 64 ? 64 : this.anIntArray528[local90];
				if (local108 > 0) {
					for (local117 = local108 - 1; local117 >= 0; local117--) {
						local128 = this.aClass60_Sub2_Sub1ArrayArray1[local90][local117];
						local131 = local128.anInt5621;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = (float) (local128.anInt5624 >> 12);
						local161 = (float) (local128.anInt5625 >> 12);
						local167 = (float) (local128.anInt5627 >> 12);
						local172 = local128.anInt5628 >> 12;
						local84.a(local155 + local33 * (float) -local172);
						local84.a(local161 + local37 * (float) -local172);
						local84.a((float) -local172 * local41 + local167);
						if (arg0.anInt7674 == 0) {
							local84.a(local136, local141, local144, local149);
						} else {
							local84.b(local136, local141, local144, local149);
						}
						local84.a(0.0F);
						local84.a(0.0F);
						local84.a(local45 * (float) local172 + local155);
						local84.a(local161 + local50 * (float) local172);
						local84.a(local167 + local54 * (float) local172);
						if (arg0.anInt7674 == 0) {
							local84.a(local136, local141, local144, local149);
						} else {
							local84.b(local136, local141, local144, local149);
						}
						local84.a(1.0F);
						local84.a(0.0F);
						local84.a(local33 * (float) local172 + local155);
						local84.a(local161 + local37 * (float) local172);
						local84.a(local167 + local41 * (float) local172);
						if (arg0.anInt7674 == 0) {
							local84.a(local136, local141, local144, local149);
						} else {
							local84.b(local136, local141, local144, local149);
						}
						local84.a(1.0F);
						local84.a(1.0F);
						local84.a((float) local172 * local59 + local155);
						local84.a((float) local172 * local64 + local161);
						local84.a((float) local172 * local69 + local167);
						if (arg0.anInt7674 == 0) {
							local84.a(local136, local141, local144, local149);
						} else {
							local84.b(local136, local141, local144, local149);
						}
						local84.a(0.0F);
						local84.a(1.0F);
						local7++;
					}
					if (this.anIntArray528[local90] > 64) {
						local408 = this.anIntArray528[local90] - 65;
						for (local131 = this.anIntArray526[local408] - 1; local131 >= 0; local131--) {
							local424 = this.aClass60_Sub2_Sub1ArrayArray2[local408][local131];
							local427 = local424.anInt5621;
							local144 = (byte) (local427 >> 16);
							local149 = (byte) (local427 >> 8);
							local440 = (byte) local427;
							local445 = (byte) (local427 >>> 24);
							local167 = (float) (local424.anInt5624 >> 12);
							local457 = (float) (local424.anInt5625 >> 12);
							local463 = (float) (local424.anInt5627 >> 12);
							local468 = local424.anInt5628 >> 12;
							local84.a(local167 + local33 * (float) -local468);
							local84.a(local37 * (float) -local468 + local457);
							local84.a((float) -local468 * local41 + local463);
							if (arg0.anInt7674 == 0) {
								local84.a(local144, local149, local440, local445);
							} else {
								local84.b(local144, local149, local440, local445);
							}
							local84.a(0.0F);
							local84.a(0.0F);
							local84.a(local167 + (float) local468 * local45);
							local84.a((float) local468 * local50 + local457);
							local84.a(local54 * (float) local468 + local463);
							if (arg0.anInt7674 == 0) {
								local84.a(local144, local149, local440, local445);
							} else {
								local84.b(local144, local149, local440, local445);
							}
							local84.a(1.0F);
							local84.a(0.0F);
							local84.a((float) local468 * local33 + local167);
							local84.a(local457 + (float) local468 * local37);
							local84.a((float) local468 * local41 + local463);
							if (arg0.anInt7674 == 0) {
								local84.a(local144, local149, local440, local445);
							} else {
								local84.b(local144, local149, local440, local445);
							}
							local84.a(1.0F);
							local84.a(1.0F);
							local84.a(local167 + local59 * (float) local468);
							local84.a(local457 + local64 * (float) local468);
							local84.a(local463 + (float) local468 * local69);
							if (arg0.anInt7674 == 0) {
								local84.a(local144, local149, local440, local445);
							} else {
								local84.b(local144, local149, local440, local445);
							}
							local84.a(0.0F);
							local84.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local90 = arg1 - 1; local90 >= 0; local90--) {
				local108 = this.anIntArray528[local90] <= 64 ? this.anIntArray528[local90] : 64;
				if (local108 > 0) {
					for (local117 = local108 - 1; local117 >= 0; local117--) {
						local128 = this.aClass60_Sub2_Sub1ArrayArray1[local90][local117];
						local131 = local128.anInt5621;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = (float) (local128.anInt5624 >> 12);
						local161 = (float) (local128.anInt5625 >> 12);
						local167 = (float) (local128.anInt5627 >> 12);
						local172 = local128.anInt5628 >> 12;
						local84.b((float) -local172 * local33 + local155);
						local84.b(local161 + local37 * (float) -local172);
						local84.b(local167 + (float) -local172 * local41);
						if (arg0.anInt7674 == 0) {
							local84.a(local136, local141, local144, local149);
						} else {
							local84.b(local136, local141, local144, local149);
						}
						local84.b(0.0F);
						local84.b(0.0F);
						local84.b(local155 + (float) local172 * local45);
						local84.b(local161 + local50 * (float) local172);
						local84.b(local54 * (float) local172 + local167);
						if (arg0.anInt7674 == 0) {
							local84.a(local136, local141, local144, local149);
						} else {
							local84.b(local136, local141, local144, local149);
						}
						local84.b(1.0F);
						local84.b(0.0F);
						local84.b((float) local172 * local33 + local155);
						local84.b(local161 + (float) local172 * local37);
						local84.b(local167 + local41 * (float) local172);
						if (arg0.anInt7674 == 0) {
							local84.a(local136, local141, local144, local149);
						} else {
							local84.b(local136, local141, local144, local149);
						}
						local84.b(1.0F);
						local84.b(1.0F);
						local84.b((float) local172 * local59 + local155);
						local84.b(local161 + local64 * (float) local172);
						local84.b(local167 + (float) local172 * local69);
						if (arg0.anInt7674 == 0) {
							local84.a(local136, local141, local144, local149);
						} else {
							local84.b(local136, local141, local144, local149);
						}
						local84.b(0.0F);
						local84.b(1.0F);
						local7++;
					}
					if (this.anIntArray528[local90] > 64) {
						local408 = this.anIntArray528[local90] - 64 - 1;
						for (local131 = this.anIntArray526[local408] - 1; local131 >= 0; local131--) {
							local424 = this.aClass60_Sub2_Sub1ArrayArray2[local408][local131];
							local427 = local424.anInt5621;
							local144 = (byte) (local427 >> 16);
							local149 = (byte) (local427 >> 8);
							local440 = (byte) local427;
							local445 = (byte) (local427 >>> 24);
							local167 = (float) (local424.anInt5624 >> 12);
							local457 = (float) (local424.anInt5625 >> 12);
							local463 = (float) (local424.anInt5627 >> 12);
							local468 = local424.anInt5628 >> 12;
							local84.b(local167 + local33 * (float) -local468);
							local84.b((float) -local468 * local37 + local457);
							local84.b(local463 + local41 * (float) -local468);
							if (arg0.anInt7674 == 0) {
								local84.a(local144, local149, local440, local445);
							} else {
								local84.b(local144, local149, local440, local445);
							}
							local84.b(0.0F);
							local84.b(0.0F);
							local84.b(local167 + (float) local468 * local45);
							local84.b(local457 + local50 * (float) local468);
							local84.b(local54 * (float) local468 + local463);
							if (arg0.anInt7674 == 0) {
								local84.a(local144, local149, local440, local445);
							} else {
								local84.b(local144, local149, local440, local445);
							}
							local84.b(1.0F);
							local84.b(0.0F);
							local84.b(local33 * (float) local468 + local167);
							local84.b(local457 + local37 * (float) local468);
							local84.b(local463 + local41 * (float) local468);
							if (arg0.anInt7674 == 0) {
								local84.a(local144, local149, local440, local445);
							} else {
								local84.b(local144, local149, local440, local445);
							}
							local84.b(1.0F);
							local84.b(1.0F);
							local84.b((float) local468 * local59 + local167);
							local84.b(local457 + local64 * (float) local468);
							local84.b(local463 + local69 * (float) local468);
							if (arg0.anInt7674 == 0) {
								local84.a(local144, local149, local440, local445);
							} else {
								local84.b(local144, local149, local440, local445);
							}
							local84.b(0.0F);
							local7++;
							local84.b(1.0F);
						}
					}
				}
			}
		}
		local84.a();
		if (this.anInterface6_17.method3657()) {
			arg0.method6827(this.anInterface6_17, 0);
			arg0.method6827(this.anInterface6_18, 1);
			arg0.method6753(this.aClass207_23);
			arg0.method6746(Static118.aClass51_4, 0, local7 * 4, this.anInterface25_8, 0, local7 * 2);
		}
	}

	@OriginalMember(owner = "client!qja", name = "b", descriptor = "(ILclient!jj;)V")
	private void method7306(@OriginalArg(1) Class75_Sub1 arg0) {
		Static400.aFloat134 = arg0.aFloat152;
		arg0.method6791();
		arg0.method6756(false);
		arg0.method6752(false);
		arg0.method6777();
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(B)V")
	public void method7308() {
		this.anInterface6_17.method8675();
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IILclient!jj;)V")
	private void method7309(@OriginalArg(0) int arg0, @OriginalArg(2) Class75_Sub1 arg1) {
		Static400.aFloat134 = arg1.aFloat152;
		arg1.method6749((float) arg0);
		arg1.method6761();
		arg1.method6756(false);
		arg1.method6752(false);
		arg1.method6777();
	}
}
