import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class2_Sub1_Sub31 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
	private int anInt6275;

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
	private int anInt6277 = 819;

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
	private int anInt6278 = 0;

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
	private int anInt6285 = 1024;

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
	private int anInt6276 = 1024;

	@OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
	private int anInt6283 = 2048;

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
	private int anInt6287 = 409;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
	private int anInt6288 = 1024;

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
	private int anInt6282 = 0;

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
	private int anInt6289 = 1024;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[[IIIBLjava/util/Random;)V")
	private void method4989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(22) int local22 = this.anInt6288 <= 0 ? 4096 : 4096 - Static159.method2512(this.anInt6288, arg5);
		@Pc(30) int local30 = this.anInt6275 * this.anInt6285 >> 12;
		@Pc(45) int local45 = this.anInt6275 - (local30 <= 0 ? 0 : Static159.method2512(local30, arg5));
		if (arg0 >= Static131.anInt2581) {
			arg0 -= Static131.anInt2581;
		}
		@Pc(77) int local77;
		@Pc(79) int local79;
		if (local45 <= 0) {
			if (Static131.anInt2581 < arg1 + arg0) {
				local77 = Static131.anInt2581 - arg0;
				for (local79 = 0; local79 < arg3; local79++) {
					@Pc(87) int[] local87 = arg2[arg4 + local79];
					Static459.method3349(local87, arg0, local77, local22);
					Static459.method3349(local87, 0, arg1 - local77, local22);
				}
			} else {
				for (local77 = 0; local77 < arg3; local77++) {
					Static459.method3349(arg2[arg4 + local77], arg0, arg1, local22);
				}
			}
		} else if (arg3 > 0 && arg1 > 0) {
			local77 = arg1 / 2;
			local79 = arg3 / 2;
			@Pc(150) int local150 = local77 >= local45 ? local45 : local77;
			@Pc(157) int local157 = local79 >= local45 ? local45 : local79;
			@Pc(161) int local161 = local150 + arg0;
			@Pc(168) int local168 = arg1 - local150 * 2;
			for (@Pc(170) int local170 = 0; local170 < arg3; local170++) {
				@Pc(178) int[] local178 = arg2[arg4 + local170];
				@Pc(191) int local191;
				@Pc(196) int local196;
				@Pc(204) int local204;
				if (local170 < local157) {
					local191 = local22 * local170 / local157;
					if (this.anInt6282 == 0) {
						for (local196 = 0; local196 < local150; local196++) {
							local204 = local22 * local196 / local150;
							local178[local196 + arg0 & Static287.anInt5227] = local178[Static287.anInt5227 & arg1 + arg0 - local196 - 1] = local191 * local204 >> 12;
						}
					} else {
						for (local196 = 0; local196 < local150; local196++) {
							local204 = local196 * local22 / local150;
							local178[Static287.anInt5227 & local196 + arg0] = local178[arg0 + arg1 - local196 - 1 & Static287.anInt5227] = local191 > local204 ? local204 : local191;
						}
					}
					if (local168 + local161 <= Static131.anInt2581) {
						Static459.method3349(local178, local161, local168, local191);
					} else {
						local196 = Static131.anInt2581 - local161;
						Static459.method3349(local178, local161, local196, local191);
						Static459.method3349(local178, 0, local168 - local196, local191);
					}
				} else {
					local191 = arg3 - local170 - 1;
					if (local191 < local157) {
						local196 = local191 * local22 / local157;
						@Pc(356) int local356;
						if (this.anInt6282 == 0) {
							for (local204 = 0; local204 < local150; local204++) {
								local356 = local22 * local204 / local150;
								local178[local204 + arg0 & Static287.anInt5227] = local178[Static287.anInt5227 & arg1 + arg0 - local204 - 1] = local356 * local196 >> 12;
							}
						} else {
							for (local204 = 0; local204 < local150; local204++) {
								local356 = local204 * local22 / local150;
								local178[Static287.anInt5227 & local204 + arg0] = local178[arg0 + arg1 - local204 - 1 & Static287.anInt5227] = local356 >= local196 ? local196 : local356;
							}
						}
						if (Static131.anInt2581 >= local168 + local161) {
							Static459.method3349(local178, local161, local168, local196);
						} else {
							local204 = Static131.anInt2581 - local161;
							Static459.method3349(local178, local161, local204, local196);
							Static459.method3349(local178, 0, local168 - local204, local196);
						}
					} else {
						for (local196 = 0; local196 < local150; local196++) {
							local178[local196 + arg0 & Static287.anInt5227] = local178[Static287.anInt5227 & arg0 + arg1 - local196 - 1] = local196 * local22 / local150;
						}
						if (local161 + local168 <= Static131.anInt2581) {
							Static459.method3349(local178, local161, local168, local22);
						} else {
							local204 = Static131.anInt2581 - local161;
							Static459.method3349(local178, local161, local204, local22);
							Static459.method3349(local178, 0, local168 - local204, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (!super.aClass67_41.aBoolean187) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass67_41.method1595();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static131.anInt2581 * this.anInt6276 >> 12;
		@Pc(52) int local52 = this.anInt6283 * Static131.anInt2581 >> 12;
		@Pc(59) int local59 = this.anInt6287 * Static266.anInt4930 >> 12;
		@Pc(66) int local66 = this.anInt6277 * Static266.anInt4930 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt6275 = this.anInt6289 * (Static131.anInt2581 / 8) >> 12;
		@Pc(89) int local89 = Static131.anInt2581 / local45 + 1;
		@Pc(93) int[][] local93 = new int[local89][3];
		@Pc(97) int[][] local97 = new int[local89][3];
		@Pc(104) Random local104 = new Random((long) this.anInt6278);
		while (true) {
			while (true) {
				@Pc(114) int local114 = Static159.method2512(local52 - local45, local104) + local45;
				@Pc(124) int local124 = Static159.method2512(local66 - local59, local104) + local59;
				@Pc(129) int local129 = local28 + local114;
				if (local129 > Static131.anInt2581) {
					local129 = Static131.anInt2581;
					local114 = Static131.anInt2581 - local28;
				}
				@Pc(147) int local147;
				@Pc(157) int local157;
				if (local34) {
					local147 = 0;
				} else {
					@Pc(151) int local151 = local30;
					@Pc(155) int[] local155 = local97[local30];
					local157 = 0;
					@Pc(162) int local162 = local129 + local22;
					if (local162 < 0) {
						local162 += Static131.anInt2581;
					}
					if (Static131.anInt2581 < local162) {
						local162 -= Static131.anInt2581;
					}
					local147 = local155[2];
					while (true) {
						@Pc(190) int[] local190 = local97[local151];
						if (local162 >= local190[0] && local190[1] >= local162) {
							if (local151 != local30) {
								@Pc(229) int local229 = local28 + local22;
								if (local229 < 0) {
									local229 += Static131.anInt2581;
								}
								if (Static131.anInt2581 < local229) {
									local229 -= Static131.anInt2581;
								}
								for (@Pc(251) int local251 = 1; local251 <= local157; local251++) {
									@Pc(261) int[] local261 = local97[(local30 + local251) % local36];
									local147 = Math.max(local147, local261[2]);
								}
								for (@Pc(277) int local277 = 0; local277 <= local157; local277++) {
									@Pc(287) int[] local287 = local97[(local277 + local30) % local36];
									@Pc(291) int local291 = local287[2];
									if (local147 != local291) {
										@Pc(298) int local298 = local287[0];
										@Pc(302) int local302 = local287[1];
										@Pc(318) int local318;
										@Pc(320) int local320;
										if (local229 < local162) {
											local318 = Math.max(local229, local298);
											local320 = Math.min(local162, local302);
										} else if (local298 == 0) {
											local320 = Math.min(local162, local302);
											local318 = 0;
										} else {
											local318 = Math.max(local229, local298);
											local320 = Static131.anInt2581;
										}
										this.method4989(local318 + local26, local320 - local318, local20, local147 - local291, local291, local104);
									}
								}
							}
							local30 = local151;
							break;
						}
						@Pc(207) int local207 = ~local36;
						local151++;
						if (local207 >= ~local151) {
							local151 = 0;
						}
						local157++;
					}
				}
				if (local124 + local147 > Static266.anInt4930) {
					local124 = Static266.anInt4930 - local147;
				} else {
					local32 = false;
				}
				@Pc(407) int[] local407;
				if (Static131.anInt2581 == local129) {
					this.method4989(local28 + local24, local114, local20, local124, local147, local104);
					if (local32) {
						return local11;
					}
					local32 = true;
					local407 = local93[local38++];
					local407[1] = local129;
					local407[2] = local147 + local124;
					local407[0] = local28;
					@Pc(423) int[][] local423 = local97;
					local97 = local93;
					local36 = local38;
					local93 = local423;
					local38 = 0;
					local26 = local24;
					local24 = Static159.method2512(Static131.anInt2581, local104);
					local28 = 0;
					local22 = local24 - local26;
					local157 = local22;
					if (local22 < 0) {
						local157 = local22 + Static131.anInt2581;
					}
					if (local157 > Static131.anInt2581) {
						local157 -= Static131.anInt2581;
					}
					local30 = 0;
					while (true) {
						@Pc(470) int[] local470 = local97[local30];
						if (local470[0] <= local157 && local470[1] >= local157) {
							local34 = false;
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local407 = local93[local38++];
					local407[0] = local28;
					local407[1] = local129;
					local407[2] = local124 + local147;
					this.method4989(local28 + local24, local114, local20, local124, local147, local104);
					local28 = local129;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6278 = arg1.method3737();
		} else if (arg0 == 1) {
			this.anInt6276 = arg1.method3711();
		} else if (arg0 == 2) {
			this.anInt6283 = arg1.method3711();
		} else if (arg0 == 3) {
			this.anInt6287 = arg1.method3711();
		} else if (arg0 == 4) {
			this.anInt6277 = arg1.method3711();
		} else if (arg0 == 5) {
			this.anInt6289 = arg1.method3711();
		} else if (arg0 == 6) {
			this.anInt6282 = arg1.method3737();
		} else if (arg0 == 7) {
			this.anInt6285 = arg1.method3711();
		} else if (arg0 == 8) {
			this.anInt6288 = arg1.method3711();
		}
	}
}
