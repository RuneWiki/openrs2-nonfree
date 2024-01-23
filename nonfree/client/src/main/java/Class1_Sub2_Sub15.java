import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
	private int anInt2027;

	@OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
	private int anInt2033 = 1024;

	@OriginalMember(owner = "client!ii", name = "Z", descriptor = "I")
	private int anInt2029 = 409;

	@OriginalMember(owner = "client!ii", name = "eb", descriptor = "I")
	private int anInt2034 = 2048;

	@OriginalMember(owner = "client!ii", name = "jb", descriptor = "I")
	private int anInt2038 = 819;

	@OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
	private int anInt2026 = 1024;

	@OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
	private int anInt2028 = 0;

	@OriginalMember(owner = "client!ii", name = "mb", descriptor = "I")
	private int anInt2040 = 1024;

	@OriginalMember(owner = "client!ii", name = "ob", descriptor = "I")
	private int anInt2042 = 1024;

	@OriginalMember(owner = "client!ii", name = "pb", descriptor = "I")
	private int anInt2043 = 0;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2028 = arg0.method895();
		} else if (arg1 == 1) {
			this.anInt2042 = arg0.method946();
		} else if (arg1 == 2) {
			this.anInt2034 = arg0.method946();
		} else if (arg1 == 3) {
			this.anInt2029 = arg0.method946();
		} else if (arg1 == 4) {
			this.anInt2038 = arg0.method946();
		} else if (arg1 == 5) {
			this.anInt2033 = arg0.method946();
		} else if (arg1 == 6) {
			this.anInt2043 = arg0.method895();
		} else if (arg1 == 7) {
			this.anInt2026 = arg0.method946();
		} else if (arg1 == 8) {
			this.anInt2040 = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[[IILjava/util/Random;I)V")
	private void method1514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt2040 <= 0 ? 4096 : 4096 - Static199.method3113(this.anInt2040, arg4);
		@Pc(27) int local27 = this.anInt2027 * this.anInt2026 >> 12;
		@Pc(43) int local43 = this.anInt2027 - (local27 <= 0 ? 0 : Static199.method3113(local27, arg4));
		if (arg5 >= Static105.anInt2391) {
			arg5 -= Static105.anInt2391;
		}
		@Pc(72) int local72;
		@Pc(83) int local83;
		if (local43 > 0) {
			if (arg2 > 0 && arg1 > 0) {
				local72 = arg1 / 2;
				@Pc(79) int local79 = local43 > local72 ? local72 : local43;
				local83 = arg2 / 2;
				@Pc(90) int local90 = arg1 - local79 * 2;
				@Pc(101) int local101 = local83 < local43 ? local83 : local43;
				@Pc(105) int local105 = arg5 + local79;
				for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
					@Pc(116) int[] local116 = arg3[local107 + arg0];
					@Pc(125) int local125;
					@Pc(133) int local133;
					@Pc(141) int local141;
					if (local107 < local101) {
						local125 = local107 * local19 / local101;
						if (this.anInt2043 == 0) {
							for (local133 = 0; local133 < local79; local133++) {
								local141 = local133 * local19 / local79;
								local116[Static32.anInt814 & local133 + arg5] = local116[Static32.anInt814 & arg1 + arg5 - local133 - 1] = local125 * local141 >> 12;
							}
						} else {
							for (local133 = 0; local133 < local79; local133++) {
								local141 = local133 * local19 / local79;
								local116[Static32.anInt814 & local133 + arg5] = local116[arg5 + arg1 - local133 - 1 & Static32.anInt814] = local125 > local141 ? local141 : local125;
							}
						}
						if (Static105.anInt2391 >= local90 + local105) {
							Static221.method34(local116, local105, local90, local125);
						} else {
							local133 = Static105.anInt2391 - local105;
							Static221.method34(local116, local105, local133, local125);
							Static221.method34(local116, 0, local90 - local133, local125);
						}
					} else {
						local125 = arg2 - local107 - 1;
						if (local101 > local125) {
							local133 = local125 * local19 / local101;
							@Pc(285) int local285;
							if (this.anInt2043 == 0) {
								for (local141 = 0; local141 < local79; local141++) {
									local285 = local19 * local141 / local79;
									local116[Static32.anInt814 & arg5 + local141] = local116[Static32.anInt814 & arg5 + arg1 - local141 - 1] = local285 * local133 >> 12;
								}
							} else {
								for (local141 = 0; local141 < local79; local141++) {
									local285 = local141 * local19 / local79;
									local116[arg5 + local141 & Static32.anInt814] = local116[arg1 + arg5 - local141 - 1 & Static32.anInt814] = local285 >= local133 ? local133 : local285;
								}
							}
							if (local90 + local105 <= Static105.anInt2391) {
								Static221.method34(local116, local105, local90, local133);
							} else {
								local141 = Static105.anInt2391 - local105;
								Static221.method34(local116, local105, local141, local133);
								Static221.method34(local116, 0, local90 - local141, local133);
							}
						} else {
							for (local133 = 0; local133 < local79; local133++) {
								local116[local133 + arg5 & Static32.anInt814] = local116[Static32.anInt814 & arg5 + arg1 - local133 - 1] = local19 * local133 / local79;
							}
							if (local90 + local105 > Static105.anInt2391) {
								local141 = Static105.anInt2391 - local105;
								Static221.method34(local116, local105, local141, local19);
								Static221.method34(local116, 0, local90 - local141, local19);
							} else {
								Static221.method34(local116, local105, local90, local19);
							}
						}
					}
				}
			}
		} else if (arg5 + arg1 > Static105.anInt2391) {
			local72 = Static105.anInt2391 - arg5;
			for (local83 = 0; local83 < arg2; local83++) {
				@Pc(497) int[] local497 = arg3[local83 + arg0];
				Static221.method34(local497, arg5, local72, local19);
				Static221.method34(local497, 0, arg1 - local72, local19);
			}
		} else {
			for (local72 = 0; local72 < arg2; local72++) {
				Static221.method34(arg3[arg0 + local72], arg5, arg1, local19);
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass102_41.method3129(arg0);
		if (!super.aClass102_41.aBoolean239) {
			return local11;
		}
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(28) int[][] local28 = super.aClass102_41.method3131();
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt2034 * Static105.anInt2391 >> 12;
		@Pc(52) int local52 = Static105.anInt2391 * this.anInt2042 >> 12;
		@Pc(59) int local59 = Static53.anInt1436 * this.anInt2029 >> 12;
		@Pc(66) int local66 = this.anInt2038 * Static53.anInt1436 >> 12;
		if (local66 <= 1) {
			return local28[arg0];
		}
		this.anInt2027 = Static105.anInt2391 / 8 * this.anInt2033 >> 12;
		@Pc(91) int local91 = Static105.anInt2391 / local52 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt2028);
		while (true) {
			while (true) {
				@Pc(116) int local116 = Static199.method3113(local45 - local52, local106) + local52;
				@Pc(120) int local120 = local30 + local116;
				@Pc(129) int local129 = local59 + Static199.method3113(local66 - local59, local106);
				if (local120 > Static105.anInt2391) {
					local120 = Static105.anInt2391;
					local116 = Static105.anInt2391 - local30;
				}
				@Pc(149) int local149;
				@Pc(151) int local151;
				if (local34) {
					local149 = 0;
				} else {
					@Pc(145) int[] local145 = local95[local23];
					local149 = local145[2];
					local151 = 0;
					@Pc(153) int local153 = local23;
					@Pc(158) int local158 = local120 + local17;
					if (local158 < 0) {
						local158 += Static105.anInt2391;
					}
					if (local158 > Static105.anInt2391) {
						local158 -= Static105.anInt2391;
					}
					while (true) {
						@Pc(182) int[] local182 = local95[local153];
						if (local158 >= local182[0] && local182[1] >= local158) {
							if (local153 != local23) {
								@Pc(221) int local221 = local30 + local17;
								if (local221 < 0) {
									local221 += Static105.anInt2391;
								}
								if (local221 > Static105.anInt2391) {
									local221 -= Static105.anInt2391;
								}
								for (@Pc(236) int local236 = 1; local236 <= local151; local236++) {
									@Pc(246) int[] local246 = local95[(local236 + local23) % local36];
									local149 = Math.max(local149, local246[2]);
								}
								for (@Pc(258) int local258 = 0; local258 <= local151; local258++) {
									@Pc(268) int[] local268 = local95[(local258 + local23) % local36];
									@Pc(272) int local272 = local268[2];
									if (local149 != local272) {
										@Pc(283) int local283 = local268[0];
										@Pc(287) int local287 = local268[1];
										@Pc(298) int local298;
										@Pc(302) int local302;
										if (local158 > local221) {
											local298 = Math.max(local221, local283);
											local302 = Math.min(local158, local287);
										} else if (local283 == 0) {
											local302 = Math.min(local158, local287);
											local298 = 0;
										} else {
											local298 = Math.max(local221, local283);
											local302 = Static105.anInt2391;
										}
										this.method1514(local272, local302 - local298, local149 - local272, local28, local106, local298 + local21);
									}
								}
							}
							local23 = local153;
							break;
						}
						local153++;
						if (local153 >= local36) {
							local153 = 0;
						}
						local151++;
					}
				}
				if (local129 + local149 > Static53.anInt1436) {
					local129 = Static53.anInt1436 - local149;
				} else {
					local32 = false;
				}
				@Pc(380) int[] local380;
				if (local120 == Static105.anInt2391) {
					this.method1514(local149, local116, local129, local28, local106, local19 + local30);
					if (local32) {
						return local11;
					}
					local34 = false;
					local32 = true;
					local21 = local19;
					local23 = 0;
					local380 = local99[local38++];
					local380[0] = local30;
					local380[2] = local149 + local129;
					local380[1] = local120;
					local30 = 0;
					local19 = Static199.method3113(Static105.anInt2391, local106);
					local17 = local19 - local21;
					local151 = local17;
					@Pc(467) int[][] local467 = local95;
					if (local17 < 0) {
						local151 = local17 + Static105.anInt2391;
					}
					if (local151 > Static105.anInt2391) {
						local151 -= Static105.anInt2391;
					}
					local95 = local99;
					local36 = local38;
					local38 = 0;
					while (true) {
						@Pc(494) int[] local494 = local99[local23];
						if (local151 >= local494[0] && local494[1] >= local151) {
							local99 = local467;
							break;
						}
						@Pc(511) int local511 = ~local36;
						local23++;
						if (local511 >= ~local23) {
							local23 = 0;
						}
					}
				} else {
					local380 = local99[local38++];
					local380[1] = local120;
					local380[2] = local129 + local149;
					local380[0] = local30;
					this.method1514(local149, local116, local129, local28, local106, local19 + local30);
					local30 = local120;
				}
			}
		}
	}
}
