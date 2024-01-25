import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class6_Sub8_Sub16 extends Class6_Sub8 {

	@OriginalMember(owner = "client!kga", name = "N", descriptor = "I")
	private int anInt5397;

	@OriginalMember(owner = "client!kga", name = "C", descriptor = "I")
	private int anInt5390 = 409;

	@OriginalMember(owner = "client!kga", name = "I", descriptor = "I")
	private int anInt5395 = 1024;

	@OriginalMember(owner = "client!kga", name = "B", descriptor = "I")
	private int anInt5400 = 0;

	@OriginalMember(owner = "client!kga", name = "R", descriptor = "I")
	private int anInt5394 = 1024;

	@OriginalMember(owner = "client!kga", name = "S", descriptor = "I")
	private int anInt5401 = 819;

	@OriginalMember(owner = "client!kga", name = "J", descriptor = "I")
	private int anInt5402 = 1024;

	@OriginalMember(owner = "client!kga", name = "O", descriptor = "I")
	private int anInt5392 = 2048;

	@OriginalMember(owner = "client!kga", name = "L", descriptor = "I")
	private int anInt5404 = 0;

	@OriginalMember(owner = "client!kga", name = "D", descriptor = "I")
	private int anInt5403 = 1024;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5404 = arg1.method3030();
		} else if (arg0 == 1) {
			this.anInt5394 = arg1.method3018();
		} else if (arg0 == 2) {
			this.anInt5392 = arg1.method3018();
		} else if (arg0 == 3) {
			this.anInt5390 = arg1.method3018();
		} else if (arg0 == 4) {
			this.anInt5401 = arg1.method3018();
		} else if (arg0 == 5) {
			this.anInt5402 = arg1.method3018();
		} else if (arg0 == 6) {
			this.anInt5400 = arg1.method3030();
		} else if (arg0 == 7) {
			this.anInt5395 = arg1.method3018();
		} else if (arg0 == 8) {
			this.anInt5403 = arg1.method3018();
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (!super.aClass325_41.aBoolean671) {
			return local11;
		}
		@Pc(28) int[][] local28 = super.aClass325_41.method7753();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = this.anInt5394 * Static83.anInt1268 >> 12;
		@Pc(60) int local60 = this.anInt5392 * Static83.anInt1268 >> 12;
		@Pc(67) int local67 = Static226.anInt4404 * this.anInt5390 >> 12;
		@Pc(74) int local74 = Static226.anInt4404 * this.anInt5401 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt5397 = Static83.anInt1268 / 8 * this.anInt5402 >> 12;
		@Pc(101) int local101 = Static83.anInt1268 / local53 + 1;
		@Pc(105) int[][] local105 = new int[local101][3];
		@Pc(109) int[][] local109 = new int[local101][3];
		@Pc(116) Random local116 = new Random((long) this.anInt5404);
		while (true) {
			while (true) {
				@Pc(126) int local126 = Static196.method3692(local116, local60 - local53) + local53;
				@Pc(136) int local136 = local67 + Static196.method3692(local116, local74 - local67);
				@Pc(141) int local141 = local36 + local126;
				if (local141 > Static83.anInt1268) {
					local126 = Static83.anInt1268 - local36;
					local141 = Static83.anInt1268;
				}
				@Pc(221) int local221;
				@Pc(161) int local161;
				@Pc(171) int local171;
				if (local42) {
					local161 = 0;
				} else {
					@Pc(165) int local165 = local38;
					@Pc(169) int[] local169 = local109[local38];
					local171 = 0;
					@Pc(175) int local175 = local30 + local141;
					if (local175 < 0) {
						local175 += Static83.anInt1268;
					}
					if (local175 > Static83.anInt1268) {
						local175 -= Static83.anInt1268;
					}
					local161 = local169[2];
					while (true) {
						@Pc(200) int[] local200 = local109[local165];
						if (local200[0] <= local175 && local200[1] >= local175) {
							if (local38 != local165) {
								@Pc(240) int local240 = local30 + local36;
								if (local240 < 0) {
									local240 += Static83.anInt1268;
								}
								if (Static83.anInt1268 < local240) {
									local240 -= Static83.anInt1268;
								}
								for (@Pc(259) int local259 = 1; local259 <= local171; local259++) {
									@Pc(269) int[] local269 = local109[(local259 + local38) % local44];
									local161 = Math.max(local161, local269[2]);
								}
								for (@Pc(285) int local285 = 0; local285 <= local171; local285++) {
									@Pc(295) int[] local295 = local109[(local38 + local285) % local44];
									@Pc(299) int local299 = local295[2];
									if (local161 != local299) {
										@Pc(310) int local310 = local295[0];
										@Pc(314) int local314 = local295[1];
										@Pc(323) int local323;
										@Pc(327) int local327;
										if (local175 > local240) {
											local323 = Math.max(local240, local310);
											local327 = Math.min(local175, local314);
										} else if (local310 == 0) {
											local323 = 0;
											local327 = Math.min(local175, local314);
										} else {
											local323 = Math.max(local240, local310);
											local327 = Static83.anInt1268;
										}
										this.method4936(local161 - local299, local299, local28, local116, local327 - local323, local34 + local323);
									}
								}
							}
							local38 = local165;
							break;
						}
						local221 = ~local44;
						local165++;
						if (local221 >= ~local165) {
							local165 = 0;
						}
						local171++;
					}
				}
				if (local136 + local161 <= Static226.anInt4404) {
					local40 = false;
				} else {
					local136 = Static226.anInt4404 - local161;
				}
				@Pc(410) int[] local410;
				if (Static83.anInt1268 == local141) {
					this.method4936(local136, local161, local28, local116, local126, local32 + local36);
					if (local40) {
						return local11;
					}
					local40 = true;
					local410 = local105[local46++];
					local410[1] = local141;
					local410[2] = local161 + local136;
					local410[0] = local36;
					@Pc(427) int[][] local427 = local109;
					local109 = local105;
					local105 = local427;
					local44 = local46;
					local46 = 0;
					local34 = local32;
					local32 = Static196.method3692(local116, Static83.anInt1268);
					local36 = 0;
					local30 = local32 - local34;
					local171 = local30;
					if (local30 < 0) {
						local171 = local30 + Static83.anInt1268;
					}
					if (Static83.anInt1268 < local171) {
						local171 -= Static83.anInt1268;
					}
					local38 = 0;
					while (true) {
						@Pc(473) int[] local473 = local109[local38];
						if (local171 >= local473[0] && local171 <= local473[1]) {
							local42 = false;
							break;
						}
						local221 = ~local44;
						local38++;
						if (local221 >= ~local38) {
							local38 = 0;
						}
					}
				} else {
					local410 = local105[local46++];
					local410[2] = local161 + local136;
					local410[0] = local36;
					local410[1] = local141;
					this.method4936(local136, local161, local28, local116, local126, local32 + local36);
					local36 = local141;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III[[ILjava/util/Random;II)V")
	private void method4936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(23) int local23 = this.anInt5403 > 0 ? 4096 - Static196.method3692(arg3, this.anInt5403) : 4096;
		@Pc(31) int local31 = this.anInt5395 * this.anInt5397 >> 12;
		@Pc(45) int local45 = this.anInt5397 - (local31 <= 0 ? 0 : Static196.method3692(arg3, local31));
		if (arg5 >= Static83.anInt1268) {
			arg5 -= Static83.anInt1268;
		}
		@Pc(80) int local80;
		@Pc(110) int local110;
		if (local45 <= 0) {
			if (arg5 + arg4 <= Static83.anInt1268) {
				for (local80 = 0; local80 < arg0; local80++) {
					Static695.method5644(arg2[arg1 + local80], arg5, arg4, local23);
				}
			} else {
				local80 = Static83.anInt1268 - arg5;
				for (local110 = 0; local110 < arg0; local110++) {
					@Pc(118) int[] local118 = arg2[local110 + arg1];
					Static695.method5644(local118, arg5, local80, local23);
					Static695.method5644(local118, 0, arg4 - local80, local23);
				}
			}
		} else if (arg0 > 0 && arg4 > 0) {
			local80 = arg4 / 2;
			local110 = arg0 / 2;
			@Pc(172) int local172 = local45 > local80 ? local80 : local45;
			@Pc(180) int local180 = local45 <= local110 ? local45 : local110;
			@Pc(184) int local184 = local172 + arg5;
			@Pc(191) int local191 = arg4 - local172 * 2;
			for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
				@Pc(201) int[] local201 = arg2[arg1 + local193];
				@Pc(210) int local210;
				@Pc(215) int local215;
				@Pc(223) int local223;
				if (local193 < local180) {
					local210 = local193 * local23 / local180;
					if (this.anInt5400 == 0) {
						for (local215 = 0; local215 < local172; local215++) {
							local223 = local215 * local23 / local172;
							local201[Static333.anInt5727 & local215 + arg5] = local201[Static333.anInt5727 & arg5 + arg4 - local215 - 1] = local223 * local210 >> 12;
						}
					} else {
						for (local215 = 0; local215 < local172; local215++) {
							local223 = local215 * local23 / local172;
							local201[local215 + arg5 & Static333.anInt5727] = local201[arg4 + arg5 - local215 - 1 & Static333.anInt5727] = local223 >= local210 ? local210 : local223;
						}
					}
					if (local191 + local184 <= Static83.anInt1268) {
						Static695.method5644(local201, local184, local191, local210);
					} else {
						local215 = Static83.anInt1268 - local184;
						Static695.method5644(local201, local184, local215, local210);
						Static695.method5644(local201, 0, local191 - local215, local210);
					}
				} else {
					local210 = arg0 - local193 - 1;
					if (local210 < local180) {
						local215 = local210 * local23 / local180;
						@Pc(368) int local368;
						if (this.anInt5400 == 0) {
							for (local223 = 0; local223 < local172; local223++) {
								local368 = local223 * local23 / local172;
								local201[local223 + arg5 & Static333.anInt5727] = local201[Static333.anInt5727 & arg4 + arg5 - local223 - 1] = local215 * local368 >> 12;
							}
						} else {
							for (local223 = 0; local223 < local172; local223++) {
								local368 = local23 * local223 / local172;
								local201[arg5 + local223 & Static333.anInt5727] = local201[arg4 + arg5 - local223 - 1 & Static333.anInt5727] = local215 <= local368 ? local215 : local368;
							}
						}
						if (Static83.anInt1268 >= local184 + local191) {
							Static695.method5644(local201, local184, local191, local215);
						} else {
							local223 = Static83.anInt1268 - local184;
							Static695.method5644(local201, local184, local223, local215);
							Static695.method5644(local201, 0, local191 - local223, local215);
						}
					} else {
						for (local215 = 0; local215 < local172; local215++) {
							local201[Static333.anInt5727 & local215 + arg5] = local201[Static333.anInt5727 & arg5 + arg4 - local215 - 1] = local23 * local215 / local172;
						}
						if (Static83.anInt1268 < local191 + local184) {
							local223 = Static83.anInt1268 - local184;
							Static695.method5644(local201, local184, local223, local23);
							Static695.method5644(local201, 0, local191 - local223, local23);
						} else {
							Static695.method5644(local201, local184, local191, local23);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
	}
}
