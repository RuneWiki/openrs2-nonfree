import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class246 {

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
	private int anInt6991 = 0;

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "[I")
	private final int[] anIntArray391 = new int[8191];

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "[[Lclient!gk;")
	private final Class25_Sub5_Sub1[][] aClass25_Sub5_Sub1ArrayArray4 = new Class25_Sub5_Sub1[64][768];

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "[I")
	private final int[] anIntArray392 = new int[64];

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "[[Lclient!gk;")
	private final Class25_Sub5_Sub1[][] aClass25_Sub5_Sub1ArrayArray3 = new Class25_Sub5_Sub1[1600][64];

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "[I")
	private final int[] anIntArray390 = new int[1600];

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "Lclient!qf;")
	private final Class1 aClass1_14;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "Lclient!og;")
	private final Interface15 anInterface15_10;

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "Lclient!og;")
	private final Interface15 anInterface15_11;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "Lclient!bo;")
	private final Interface2 anInterface2_5;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!rr;)V")
	public Class246(@OriginalArg(0) Class31_Sub1 arg0) {
		this.aClass1_14 = arg0.method7116(new Class90[] { new Class90(new Class156[] { Static248.aClass156_1, Static248.aClass156_3, Static248.aClass156_5 }), new Class90(Static248.aClass156_2) });
		this.anInterface15_10 = arg0.method7132(true);
		this.anInterface15_11 = arg0.method7132(false);
		this.anInterface15_11.method5277(393168, 12);
		this.anInterface2_5 = arg0.method7158(false);
		this.anInterface2_5.method7282(49146);
		@Pc(98) Buffer local98 = this.anInterface2_5.method7292();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method7154(local98);
			@Pc(109) int local109;
			if (Stream.a()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.e(local115);
					local105.e(local115 + 1);
					local105.e(local115 + 2);
					local105.e(local115 + 2);
					local105.e(local115 + 3);
					local105.e(local115);
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
			local105.c();
			this.anInterface2_5.method7291();
		}
		@Pc(200) Buffer local200 = this.anInterface15_11.method5275();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method7154(local200);
			if (Stream.a()) {
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
			} else {
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
			}
			local207.c();
			this.anInterface15_11.method5276();
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!rr;)V")
	private void method5584(@OriginalArg(1) Class31_Sub1 arg0) {
		Static372.aFloat150 = arg0.aFloat191;
		arg0.method7139();
		arg0.method7118(false);
		arg0.method7058(false);
		arg0.method7060();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!tt;ILclient!rr;I)V")
	public void method5585(@OriginalArg(0) Class323 arg0, @OriginalArg(2) Class31_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aClass42_Sub3_16 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method5591(arg2, arg1);
		} else {
			this.method5584(arg1);
		}
		@Pc(29) float local29 = arg1.aClass42_Sub3_16.aFloat218;
		@Pc(33) float local33 = arg1.aClass42_Sub3_16.aFloat217;
		@Pc(37) float local37 = arg1.aClass42_Sub3_16.aFloat222;
		@Pc(41) float local41 = arg1.aClass42_Sub3_16.aFloat215;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class25_Sub5 local51 = arg0.aClass114_1.aClass25_Sub5_3;
			@Pc(54) Class25_Sub5 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass25_Sub5_10; local54 != local51; local54 = local54.aClass25_Sub5_10) {
				@Pc(59) Class25_Sub5_Sub1 local59 = (Class25_Sub5_Sub1) local54;
				local86 = (int) (local41 + (float) (local59.anInt8914 >> 12) * local37 + local29 * (float) (local59.anInt8915 >> 12) + (float) (local59.anInt8911 >> 12) * local33);
				if (local86 < local45) {
					local45 = local86;
				}
				this.anIntArray391[local43++] = local86;
				if (local86 > local47) {
					local47 = local86;
				}
			}
			@Pc(116) int local116 = local47 - local45;
			if (local116 + 2 > 1600) {
				local86 = Static402.method5690(local116) + 1 - Static412.anInt7414;
				local116 = (local116 >> local86) + 2;
			} else {
				local116 += 2;
				local86 = 0;
			}
			local54 = local51.aClass25_Sub5_10;
			local43 = 0;
			@Pc(148) int local148 = -2;
			@Pc(150) boolean local150 = true;
			@Pc(159) boolean local159 = true;
			while (local54 != local51) {
				this.anInt6991 = 0;
				for (@Pc(166) int local166 = 0; local166 < local116; local166++) {
					this.anIntArray390[local166] = 0;
				}
				for (@Pc(183) int local183 = 0; local183 < 64; local183++) {
					this.anIntArray392[local183] = 0;
				}
				while (local54 != local51) {
					@Pc(199) Class25_Sub5_Sub1 local199 = (Class25_Sub5_Sub1) local54;
					if (local159) {
						local148 = local199.anInt8908;
						local159 = false;
						local150 = local199.aBoolean593;
					}
					if (local43 > 0 && (local199.anInt8908 != local148 || local150 != local199.aBoolean593)) {
						local159 = true;
						break;
					}
					@Pc(242) int local242 = this.anIntArray391[local43++] - local45 >> local86;
					if (local242 < 1600) {
						if (this.anIntArray390[local242] < 64) {
							this.aClass25_Sub5_Sub1ArrayArray3[local242][this.anIntArray390[local242]++] = local199;
						} else {
							label102: {
								if (this.anIntArray390[local242] == 64) {
									if (this.anInt6991 == 64) {
										break label102;
									}
									this.anIntArray390[local242] += this.anInt6991++ + 1;
								}
								@Pc(309) Class25_Sub5_Sub1[] local309 = this.aClass25_Sub5_Sub1ArrayArray4[this.anIntArray390[local242] - 65];
								@Pc(319) int local319 = this.anIntArray390[local242] - 1 - 64;
								@Pc(321) int local321 = this.anIntArray392[this.anIntArray390[local242] - 1 - 64];
								this.anIntArray392[local319] = this.anIntArray392[this.anIntArray390[local242] - 1 - 64] + 1;
								local309[local321] = local199;
							}
						}
					}
					local54 = local54.aClass25_Sub5_10;
				}
				arg1.method7088(false, local148 >= 0 ? local148 : -1, false);
				if (local150 && Static372.aFloat150 != arg1.aFloat191) {
					arg1.ra(Static372.aFloat150);
				} else if (arg1.aFloat191 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method5588(arg1, local116);
			}
		} catch (@Pc(376) Exception local376) {
		}
		this.method5592(arg1);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	public void method5586() {
		this.anInterface15_10.method7285();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!rr;I)V")
	private void method5588(@OriginalArg(1) Class31_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class42_Sub3 local11 = arg0.method7182();
		@Pc(14) float local14 = local11.aFloat221;
		@Pc(17) float local17 = local11.aFloat223;
		@Pc(20) float local20 = local11.aFloat219;
		@Pc(23) float local23 = local11.aFloat213;
		@Pc(26) float local26 = local11.aFloat216;
		@Pc(29) float local29 = local11.aFloat214;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local26 + local17;
		@Pc(41) float local41 = local20 + local29;
		@Pc(46) float local46 = local14 - local23;
		@Pc(51) float local51 = local17 - local26;
		@Pc(56) float local56 = local20 - local29;
		@Pc(61) float local61 = local23 - local14;
		@Pc(66) float local66 = local26 - local17;
		@Pc(71) float local71 = local29 - local20;
		@Pc(77) Buffer local77 = this.anInterface15_10.method5275();
		if (local77 == null) {
			return;
		}
		@Pc(85) Stream local85 = arg0.method7154(local77);
		@Pc(91) int local91;
		@Pc(108) int local108;
		@Pc(114) int local114;
		@Pc(123) Class25_Sub5_Sub1 local123;
		@Pc(126) int local126;
		@Pc(131) byte local131;
		@Pc(136) byte local136;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(167) int local167;
		@Pc(437) float local437;
		@Pc(442) int local442;
		@Pc(382) int local382;
		@Pc(398) Class25_Sub5_Sub1 local398;
		@Pc(401) int local401;
		@Pc(414) byte local414;
		@Pc(419) byte local419;
		@Pc(431) float local431;
		if (Stream.a()) {
			for (local91 = arg1 - 1; local91 >= 0; local91--) {
				local108 = this.anIntArray390[local91] > 64 ? 64 : this.anIntArray390[local91];
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass25_Sub5_Sub1ArrayArray3[local91][local114];
						local126 = local123.anInt8912;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt8915 >> 12;
						local156 = local123.anInt8911 >> 12;
						local162 = local123.anInt8914 >> 12;
						local167 = local123.anInt8913 >> 12;
						local85.a(local150 + (float) -local167 * local33);
						local85.a(local156 + (float) -local167 * local37);
						local85.a(local41 * (float) -local167 + local162);
						if (arg0.anInt9122 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.a(0.0F);
						local85.a(0.0F);
						local85.a(local150 + local46 * (float) local167);
						local85.a((float) local167 * local51 + local156);
						local85.a(local56 * (float) local167 + local162);
						if (arg0.anInt9122 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.a(1.0F);
						local85.a(0.0F);
						local85.a(local33 * (float) local167 + local150);
						local85.a(local37 * (float) local167 + local156);
						local85.a(local162 + local41 * (float) local167);
						if (arg0.anInt9122 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.a(1.0F);
						local85.a(1.0F);
						local85.a(local150 + (float) local167 * local61);
						local85.a((float) local167 * local66 + local156);
						local85.a((float) local167 * local71 + local162);
						if (arg0.anInt9122 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.a(0.0F);
						local7++;
						local85.a(1.0F);
					}
					if (this.anIntArray390[local91] > 64) {
						local382 = this.anIntArray390[local91] - 1 - 64;
						for (local126 = this.anIntArray392[local382] - 1; local126 >= 0; local126--) {
							local398 = this.aClass25_Sub5_Sub1ArrayArray4[local382][local126];
							local401 = local398.anInt8912;
							local139 = (byte) (local401 >> 16);
							local144 = (byte) (local401 >> 8);
							local414 = (byte) local401;
							local419 = (byte) (local401 >>> 24);
							local162 = local398.anInt8915 >> 12;
							local431 = local398.anInt8911 >> 12;
							local437 = local398.anInt8914 >> 12;
							local442 = local398.anInt8913 >> 12;
							local85.a(local33 * (float) -local442 + local162);
							local85.a(local431 + local37 * (float) -local442);
							local85.a((float) -local442 * local41 + local437);
							if (arg0.anInt9122 == 0) {
								local85.b(local139, local144, local414, local419);
							} else {
								local85.a(local139, local144, local414, local419);
							}
							local85.a(0.0F);
							local85.a(0.0F);
							local85.a(local46 * (float) local442 + local162);
							local85.a(local431 + local51 * (float) local442);
							local85.a(local56 * (float) local442 + local437);
							if (arg0.anInt9122 == 0) {
								local85.b(local139, local144, local414, local419);
							} else {
								local85.a(local139, local144, local414, local419);
							}
							local85.a(1.0F);
							local85.a(0.0F);
							local85.a(local33 * (float) local442 + local162);
							local85.a(local431 + local37 * (float) local442);
							local85.a((float) local442 * local41 + local437);
							if (arg0.anInt9122 == 0) {
								local85.b(local139, local144, local414, local419);
							} else {
								local85.a(local139, local144, local414, local419);
							}
							local85.a(1.0F);
							local85.a(1.0F);
							local85.a(local61 * (float) local442 + local162);
							local85.a(local431 + local66 * (float) local442);
							local85.a(local437 + (float) local442 * local71);
							if (arg0.anInt9122 == 0) {
								local85.b(local139, local144, local414, local419);
							} else {
								local85.a(local139, local144, local414, local419);
							}
							local85.a(0.0F);
							local7++;
							local85.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local91 = arg1 - 1; local91 >= 0; local91--) {
				local108 = this.anIntArray390[local91] <= 64 ? this.anIntArray390[local91] : 64;
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass25_Sub5_Sub1ArrayArray3[local91][local114];
						local126 = local123.anInt8912;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt8915 >> 12;
						local156 = local123.anInt8911 >> 12;
						local162 = local123.anInt8914 >> 12;
						local167 = local123.anInt8913 >> 12;
						local85.b((float) -local167 * local33 + local150);
						local85.b((float) -local167 * local37 + local156);
						local85.b(local162 + (float) -local167 * local41);
						if (arg0.anInt9122 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.b(0.0F);
						local85.b(0.0F);
						local85.b(local150 + local46 * (float) local167);
						local85.b(local156 + local51 * (float) local167);
						local85.b((float) local167 * local56 + local162);
						if (arg0.anInt9122 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.b(1.0F);
						local85.b(0.0F);
						local85.b((float) local167 * local33 + local150);
						local85.b(local37 * (float) local167 + local156);
						local85.b(local162 + local41 * (float) local167);
						if (arg0.anInt9122 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.b(1.0F);
						local85.b(1.0F);
						local85.b(local150 + local61 * (float) local167);
						local85.b(local156 + (float) local167 * local66);
						local85.b(local162 + (float) local167 * local71);
						if (arg0.anInt9122 == 0) {
							local85.b(local131, local136, local139, local144);
						} else {
							local85.a(local131, local136, local139, local144);
						}
						local85.b(0.0F);
						local85.b(1.0F);
						local7++;
					}
					if (this.anIntArray390[local91] > 64) {
						local382 = this.anIntArray390[local91] - 1 - 64;
						for (local126 = this.anIntArray392[local382] - 1; local126 >= 0; local126--) {
							local398 = this.aClass25_Sub5_Sub1ArrayArray4[local382][local126];
							local401 = local398.anInt8912;
							local139 = (byte) (local401 >> 16);
							local144 = (byte) (local401 >> 8);
							local414 = (byte) local401;
							local419 = (byte) (local401 >>> 24);
							local162 = local398.anInt8915 >> 12;
							local431 = local398.anInt8911 >> 12;
							local437 = local398.anInt8914 >> 12;
							local442 = local398.anInt8913 >> 12;
							local85.b(local162 + local33 * (float) -local442);
							local85.b(local37 * (float) -local442 + local431);
							local85.b(local437 + local41 * (float) -local442);
							if (arg0.anInt9122 == 0) {
								local85.b(local139, local144, local414, local419);
							} else {
								local85.a(local139, local144, local414, local419);
							}
							local85.b(0.0F);
							local85.b(0.0F);
							local85.b((float) local442 * local46 + local162);
							local85.b(local51 * (float) local442 + local431);
							local85.b(local437 + local56 * (float) local442);
							if (arg0.anInt9122 == 0) {
								local85.b(local139, local144, local414, local419);
							} else {
								local85.a(local139, local144, local414, local419);
							}
							local85.b(1.0F);
							local85.b(0.0F);
							local85.b(local33 * (float) local442 + local162);
							local85.b(local37 * (float) local442 + local431);
							local85.b(local437 + (float) local442 * local41);
							if (arg0.anInt9122 == 0) {
								local85.b(local139, local144, local414, local419);
							} else {
								local85.a(local139, local144, local414, local419);
							}
							local85.b(1.0F);
							local85.b(1.0F);
							local85.b((float) local442 * local61 + local162);
							local85.b((float) local442 * local66 + local431);
							local85.b(local71 * (float) local442 + local437);
							if (arg0.anInt9122 == 0) {
								local85.b(local139, local144, local414, local419);
							} else {
								local85.a(local139, local144, local414, local419);
							}
							local85.b(0.0F);
							local85.b(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local85.c();
		if (this.anInterface15_10.method5276()) {
			arg0.method7113(this.anInterface15_10, 0);
			arg0.method7113(this.anInterface15_11, 1);
			arg0.method7149(this.aClass1_14);
			arg0.method7174(Static486.aClass265_10, local7 * 4, this.anInterface2_5, 0, local7 * 2, 0);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLclient!rr;)V")
	public void method5590(@OriginalArg(1) Class31_Sub1 arg0) {
		this.anInterface15_10.method5277(786336, 24);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILclient!rr;)V")
	private void method5591(@OriginalArg(1) int arg0, @OriginalArg(2) Class31_Sub1 arg1) {
		Static372.aFloat150 = arg1.aFloat191;
		arg1.method7140((float) arg0);
		arg1.method7071();
		arg1.method7118(false);
		arg1.method7058(false);
		arg1.method7060();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLclient!rr;)V")
	private void method5592(@OriginalArg(1) Class31_Sub1 arg0) {
		arg0.method7058(true);
		arg0.method7118(true);
		if (arg0.aFloat191 != Static372.aFloat150) {
			arg0.ra(Static372.aFloat150);
		}
	}
}
