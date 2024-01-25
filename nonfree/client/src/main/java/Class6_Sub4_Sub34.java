import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class6_Sub4_Sub34 extends Class6_Sub4 {

	@OriginalMember(owner = "client!uaa", name = "P", descriptor = "I")
	private int anInt8783;

	@OriginalMember(owner = "client!uaa", name = "A", descriptor = "I")
	private int anInt8769 = 1024;

	@OriginalMember(owner = "client!uaa", name = "F", descriptor = "I")
	private int anInt8774 = 819;

	@OriginalMember(owner = "client!uaa", name = "C", descriptor = "I")
	private int anInt8771 = 1024;

	@OriginalMember(owner = "client!uaa", name = "H", descriptor = "I")
	private int anInt8776 = 409;

	@OriginalMember(owner = "client!uaa", name = "J", descriptor = "I")
	private int anInt8777 = 2048;

	@OriginalMember(owner = "client!uaa", name = "K", descriptor = "I")
	private int anInt8778 = 1024;

	@OriginalMember(owner = "client!uaa", name = "M", descriptor = "I")
	private int anInt8780 = 0;

	@OriginalMember(owner = "client!uaa", name = "N", descriptor = "I")
	private int anInt8781 = 0;

	@OriginalMember(owner = "client!uaa", name = "E", descriptor = "I")
	private int anInt8773 = 1024;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIII[[ILjava/util/Random;)V")
	private void method7184(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Random arg5) {
		@Pc(22) int local22 = this.anInt8778 <= 0 ? 4096 : 4096 - Static411.method7689(this.anInt8778, arg5);
		@Pc(35) int local35 = this.anInt8783 * this.anInt8773 >> 12;
		@Pc(47) int local47 = this.anInt8783 - (local35 > 0 ? Static411.method7689(local35, arg5) : 0);
		if (arg0 >= Static408.anInt7209) {
			arg0 -= Static408.anInt7209;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		if (local47 > 0) {
			if (arg1 > 0 && arg2 > 0) {
				local75 = arg2 / 2;
				local79 = arg1 / 2;
				@Pc(90) int local90 = local47 <= local75 ? local47 : local75;
				@Pc(101) int local101 = local47 <= local79 ? local47 : local79;
				@Pc(105) int local105 = local90 + arg0;
				@Pc(111) int local111 = arg2 - local90 * 2;
				for (@Pc(113) int local113 = 0; local113 < arg1; local113++) {
					@Pc(121) int[] local121 = arg4[local113 + arg3];
					@Pc(130) int local130;
					@Pc(135) int local135;
					@Pc(143) int local143;
					if (local113 < local101) {
						local130 = local113 * local22 / local101;
						if (this.anInt8780 == 0) {
							for (local135 = 0; local135 < local90; local135++) {
								local143 = local22 * local135 / local90;
								local121[Static368.anInt6505 & arg0 + local135] = local121[Static368.anInt6505 & arg0 + arg2 - local135 - 1] = local143 * local130 >> 12;
							}
						} else {
							for (local135 = 0; local135 < local90; local135++) {
								local143 = local22 * local135 / local90;
								local121[Static368.anInt6505 & arg0 + local135] = local121[arg0 + arg2 - local135 - 1 & Static368.anInt6505] = local130 <= local143 ? local130 : local143;
							}
						}
						if (Static408.anInt7209 < local111 + local105) {
							local135 = Static408.anInt7209 - local105;
							Static601.method2939(local121, local105, local135, local130);
							Static601.method2939(local121, 0, local111 - local135, local130);
						} else {
							Static601.method2939(local121, local105, local111, local130);
						}
					} else {
						local130 = arg1 - local113 - 1;
						if (local101 > local130) {
							local135 = local130 * local22 / local101;
							@Pc(293) int local293;
							if (this.anInt8780 == 0) {
								for (local143 = 0; local143 < local90; local143++) {
									local293 = local143 * local22 / local90;
									local121[local143 + arg0 & Static368.anInt6505] = local121[arg2 + arg0 - local143 - 1 & Static368.anInt6505] = local293 * local135 >> 12;
								}
							} else {
								for (local143 = 0; local143 < local90; local143++) {
									local293 = local22 * local143 / local90;
									local121[arg0 + local143 & Static368.anInt6505] = local121[Static368.anInt6505 & arg2 + arg0 - local143 - 1] = local293 < local135 ? local293 : local135;
								}
							}
							if (local111 + local105 > Static408.anInt7209) {
								local143 = Static408.anInt7209 - local105;
								Static601.method2939(local121, local105, local143, local135);
								Static601.method2939(local121, 0, local111 - local143, local135);
							} else {
								Static601.method2939(local121, local105, local111, local135);
							}
						} else {
							for (local135 = 0; local135 < local90; local135++) {
								local121[arg0 + local135 & Static368.anInt6505] = local121[Static368.anInt6505 & arg0 + arg2 - local135 - 1] = local22 * local135 / local90;
							}
							if (Static408.anInt7209 >= local105 + local111) {
								Static601.method2939(local121, local105, local111, local22);
							} else {
								local143 = Static408.anInt7209 - local105;
								Static601.method2939(local121, local105, local143, local22);
								Static601.method2939(local121, 0, local111 - local143, local22);
							}
						}
					}
				}
			}
		} else if (Static408.anInt7209 < arg0 + arg2) {
			local75 = Static408.anInt7209 - arg0;
			for (local79 = 0; local79 < arg1; local79++) {
				@Pc(503) int[] local503 = arg4[arg3 + local79];
				Static601.method2939(local503, arg0, local75, local22);
				Static601.method2939(local503, 0, arg2 - local75, local22);
			}
		} else {
			for (local75 = 0; local75 < arg1; local75++) {
				Static601.method2939(arg4[arg3 + local75], arg0, arg2, local22);
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt8781 = arg1.method6069();
		} else if (arg0 == 1) {
			this.anInt8769 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anInt8777 = arg1.method6003();
		} else if (arg0 == 3) {
			this.anInt8776 = arg1.method6003();
		} else if (arg0 == 4) {
			this.anInt8774 = arg1.method6003();
		} else if (arg0 == 5) {
			this.anInt8771 = arg1.method6003();
		} else if (arg0 == 6) {
			this.anInt8780 = arg1.method6069();
		} else if (arg0 == 7) {
			this.anInt8773 = arg1.method6003();
		} else if (arg0 == 8) {
			this.anInt8778 = arg1.method6003();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (!super.aClass187_41.aBoolean374) {
			return local19;
		}
		@Pc(28) int[][] local28 = super.aClass187_41.method4557();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = this.anInt8769 * Static408.anInt7209 >> 12;
		@Pc(60) int local60 = this.anInt8777 * Static408.anInt7209 >> 12;
		@Pc(67) int local67 = this.anInt8776 * Static88.anInt1743 >> 12;
		@Pc(74) int local74 = this.anInt8774 * Static88.anInt1743 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt8783 = Static408.anInt7209 / 8 * this.anInt8771 >> 12;
		@Pc(99) int local99 = Static408.anInt7209 / local53 + 1;
		@Pc(103) int[][] local103 = new int[local99][3];
		@Pc(107) int[][] local107 = new int[local99][3];
		@Pc(114) Random local114 = new Random((long) this.anInt8781);
		while (true) {
			while (true) {
				@Pc(124) int local124 = Static411.method7689(local60 - local53, local114) + local53;
				@Pc(134) int local134 = local67 + Static411.method7689(local74 - local67, local114);
				@Pc(138) int local138 = local124 + local36;
				if (local138 > Static408.anInt7209) {
					local124 = Static408.anInt7209 - local36;
					local138 = Static408.anInt7209;
				}
				@Pc(200) int local200;
				@Pc(182) int local182;
				@Pc(157) int local157;
				if (local42) {
					local182 = 0;
				} else {
					@Pc(151) int local151 = local38;
					@Pc(155) int[] local155 = local107[local38];
					local157 = 0;
					@Pc(161) int local161 = local30 + local138;
					if (local161 < 0) {
						local161 += Static408.anInt7209;
					}
					if (Static408.anInt7209 < local161) {
						local161 -= Static408.anInt7209;
					}
					local182 = local155[2];
					while (true) {
						@Pc(186) int[] local186 = local107[local151];
						if (local186[0] <= local161 && local161 <= local186[1]) {
							if (local38 != local151) {
								@Pc(216) int local216 = local30 + local36;
								if (local216 < 0) {
									local216 += Static408.anInt7209;
								}
								if (Static408.anInt7209 < local216) {
									local216 -= Static408.anInt7209;
								}
								for (@Pc(235) int local235 = 1; local235 <= local157; local235++) {
									@Pc(245) int[] local245 = local107[(local235 + local38) % local44];
									local182 = Math.max(local182, local245[2]);
								}
								for (@Pc(257) int local257 = 0; local257 <= local157; local257++) {
									@Pc(267) int[] local267 = local107[(local257 + local38) % local44];
									@Pc(271) int local271 = local267[2];
									if (local271 != local182) {
										@Pc(282) int local282 = local267[0];
										@Pc(286) int local286 = local267[1];
										@Pc(297) int local297;
										@Pc(301) int local301;
										if (local216 < local161) {
											local297 = Math.max(local216, local282);
											local301 = Math.min(local161, local286);
										} else if (local282 == 0) {
											local297 = 0;
											local301 = Math.min(local161, local286);
										} else {
											local297 = Math.max(local216, local282);
											local301 = Static408.anInt7209;
										}
										this.method7184(local297 + local34, local182 - local271, local301 - local297, local271, local28, local114);
									}
								}
							}
							local38 = local151;
							break;
						}
						local157++;
						local200 = ~local44;
						local151++;
						if (local200 >= ~local151) {
							local151 = 0;
						}
					}
				}
				if (Static88.anInt1743 >= local182 + local134) {
					local40 = false;
				} else {
					local134 = Static88.anInt1743 - local182;
				}
				@Pc(376) int[] local376;
				if (local138 == Static408.anInt7209) {
					this.method7184(local32 + local36, local134, local124, local182, local28, local114);
					if (local40) {
						return local19;
					}
					local40 = true;
					local376 = local103[local46++];
					local376[0] = local36;
					local376[1] = local138;
					local376[2] = local134 + local182;
					@Pc(442) int[][] local442 = local107;
					local107 = local103;
					local103 = local442;
					local44 = local46;
					local46 = 0;
					local34 = local32;
					local32 = Static411.method7689(Static408.anInt7209, local114);
					local36 = 0;
					local30 = local32 - local34;
					local157 = local30;
					if (local30 < 0) {
						local157 = local30 + Static408.anInt7209;
					}
					if (Static408.anInt7209 < local157) {
						local157 -= Static408.anInt7209;
					}
					local38 = 0;
					local42 = false;
					while (true) {
						@Pc(491) int[] local491 = local107[local38];
						if (local157 >= local491[0] && local491[1] >= local157) {
							break;
						}
						local200 = ~local44;
						local38++;
						if (local200 >= ~local38) {
							local38 = 0;
						}
					}
				} else {
					local376 = local103[local46++];
					local376[1] = local138;
					local376[0] = local36;
					local376[2] = local182 + local134;
					this.method7184(local36 + local32, local134, local124, local182, local28, local114);
					local36 = local138;
				}
			}
		}
	}
}
