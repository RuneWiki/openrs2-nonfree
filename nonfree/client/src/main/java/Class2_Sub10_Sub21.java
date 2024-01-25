import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class2_Sub10_Sub21 extends Class2_Sub10 {

	@OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
	private int anInt6830;

	@OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
	private int anInt6833 = 1024;

	@OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
	private int anInt6834 = 409;

	@OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
	private int anInt6835 = 819;

	@OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
	private int anInt6827 = 1024;

	@OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
	private int anInt6836 = 1024;

	@OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
	private int anInt6839 = 1024;

	@OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
	private int anInt6840 = 2048;

	@OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
	private int anInt6829 = 0;

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
	private int anInt6838 = 0;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6838 = arg0.method6904();
		} else if (arg1 == 1) {
			this.anInt6827 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt6840 = arg0.method6884();
		} else if (arg1 == 3) {
			this.anInt6834 = arg0.method6884();
		} else if (arg1 == 4) {
			this.anInt6835 = arg0.method6884();
		} else if (arg1 == 5) {
			this.anInt6833 = arg0.method6884();
		} else if (arg1 == 6) {
			this.anInt6829 = arg0.method6904();
		} else if (arg1 == 7) {
			this.anInt6839 = arg0.method6884();
		} else if (arg1 == 8) {
			this.anInt6836 = arg0.method6884();
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILjava/util/Random;[[IBII)V")
	private void method5742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt6836 > 0 ? 4096 - Static610.method8343(arg2, this.anInt6836) : 4096;
		@Pc(33) int local33 = this.anInt6830 * this.anInt6839 >> 12;
		@Pc(48) int local48 = this.anInt6830 - (local33 <= 0 ? 0 : Static610.method8343(arg2, local33));
		if (Static93.anInt1862 <= arg4) {
			arg4 -= Static93.anInt1862;
		}
		@Pc(72) int local72;
		@Pc(95) int local95;
		if (local48 <= 0) {
			if (Static93.anInt1862 >= arg0 + arg4) {
				for (local72 = 0; local72 < arg1; local72++) {
					Static649.method4858(arg3[local72 + arg5], arg4, arg0, local19);
				}
			} else {
				local72 = Static93.anInt1862 - arg4;
				for (local95 = 0; local95 < arg1; local95++) {
					@Pc(103) int[] local103 = arg3[local95 + arg5];
					Static649.method4858(local103, arg4, local72, local19);
					Static649.method4858(local103, 0, arg0 - local72, local19);
				}
			}
		} else if (arg1 > 0 && arg0 > 0) {
			local72 = arg0 / 2;
			local95 = arg1 / 2;
			@Pc(150) int local150 = local72 >= local48 ? local48 : local72;
			@Pc(157) int local157 = local48 > local95 ? local95 : local48;
			@Pc(161) int local161 = local150 + arg4;
			@Pc(168) int local168 = arg0 - local150 * 2;
			for (@Pc(170) int local170 = 0; local170 < arg1; local170++) {
				@Pc(178) int[] local178 = arg3[local170 + arg5];
				@Pc(187) int local187;
				@Pc(192) int local192;
				@Pc(200) int local200;
				if (local170 < local157) {
					local187 = local170 * local19 / local157;
					if (this.anInt6829 == 0) {
						for (local192 = 0; local192 < local150; local192++) {
							local200 = local192 * local19 / local150;
							local178[local192 + arg4 & Static603.anInt9994] = local178[Static603.anInt9994 & arg4 + arg0 - local192 - 1] = local200 * local187 >> 12;
						}
					} else {
						for (local192 = 0; local192 < local150; local192++) {
							local200 = local192 * local19 / local150;
							local178[local192 + arg4 & Static603.anInt9994] = local178[arg0 + arg4 - local192 - 1 & Static603.anInt9994] = local187 <= local200 ? local187 : local200;
						}
					}
					if (Static93.anInt1862 < local161 + local168) {
						local192 = Static93.anInt1862 - local161;
						Static649.method4858(local178, local161, local192, local187);
						Static649.method4858(local178, 0, local168 - local192, local187);
					} else {
						Static649.method4858(local178, local161, local168, local187);
					}
				} else {
					local187 = arg1 - local170 - 1;
					if (local157 > local187) {
						local192 = local187 * local19 / local157;
						@Pc(350) int local350;
						if (this.anInt6829 == 0) {
							for (local200 = 0; local200 < local150; local200++) {
								local350 = local19 * local200 / local150;
								local178[arg4 + local200 & Static603.anInt9994] = local178[Static603.anInt9994 & arg4 + arg0 - local200 - 1] = local350 * local192 >> 12;
							}
						} else {
							for (local200 = 0; local200 < local150; local200++) {
								local350 = local200 * local19 / local150;
								local178[Static603.anInt9994 & arg4 + local200] = local178[arg4 + arg0 - local200 - 1 & Static603.anInt9994] = local350 >= local192 ? local192 : local350;
							}
						}
						if (local161 + local168 > Static93.anInt1862) {
							local200 = Static93.anInt1862 - local161;
							Static649.method4858(local178, local161, local200, local192);
							Static649.method4858(local178, 0, local168 - local200, local192);
						} else {
							Static649.method4858(local178, local161, local168, local192);
						}
					} else {
						for (local192 = 0; local192 < local150; local192++) {
							local178[Static603.anInt9994 & local192 + arg4] = local178[Static603.anInt9994 & arg4 + arg0 - local192 - 1] = local19 * local192 / local150;
						}
						if (local161 + local168 > Static93.anInt1862) {
							local200 = Static93.anInt1862 - local161;
							Static649.method4858(local178, local161, local200, local19);
							Static649.method4858(local178, 0, local168 - local200, local19);
						} else {
							Static649.method4858(local178, local161, local168, local19);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (!super.aClass304_41.aBoolean638) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass304_41.method7210();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static93.anInt1862 * this.anInt6827 >> 12;
		@Pc(52) int local52 = Static93.anInt1862 * this.anInt6840 >> 12;
		@Pc(59) int local59 = this.anInt6834 * Static512.anInt8591 >> 12;
		@Pc(66) int local66 = Static512.anInt8591 * this.anInt6835 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt6830 = this.anInt6833 * (Static93.anInt1862 / 8) >> 12;
		@Pc(89) int local89 = Static93.anInt1862 / local45 + 1;
		@Pc(93) int[][] local93 = new int[local89][3];
		@Pc(97) int[][] local97 = new int[local89][3];
		@Pc(104) Random local104 = new Random((long) this.anInt6838);
		while (true) {
			while (true) {
				@Pc(114) int local114 = local45 + Static610.method8343(local104, local52 - local45);
				@Pc(123) int local123 = Static610.method8343(local104, local66 - local59) + local59;
				@Pc(127) int local127 = local114 + local28;
				if (Static93.anInt1862 < local127) {
					local127 = Static93.anInt1862;
					local114 = Static93.anInt1862 - local28;
				}
				@Pc(200) int local200;
				@Pc(147) int local147;
				if (local34) {
					local200 = 0;
				} else {
					@Pc(141) int local141 = local30;
					@Pc(145) int[] local145 = local97[local30];
					local147 = 0;
					@Pc(152) int local152 = local127 + local22;
					if (local152 < 0) {
						local152 += Static93.anInt1862;
					}
					if (Static93.anInt1862 < local152) {
						local152 -= Static93.anInt1862;
					}
					while (true) {
						@Pc(173) int[] local173 = local97[local141];
						if (local152 >= local173[0] && local173[1] >= local152) {
							local200 = local145[2];
							if (local30 != local141) {
								@Pc(207) int local207 = local28 + local22;
								if (local207 < 0) {
									local207 += Static93.anInt1862;
								}
								if (local207 > Static93.anInt1862) {
									local207 -= Static93.anInt1862;
								}
								for (@Pc(229) int local229 = 1; local229 <= local147; local229++) {
									@Pc(239) int[] local239 = local97[(local229 + local30) % local36];
									local200 = Math.max(local200, local239[2]);
								}
								for (@Pc(255) int local255 = 0; local255 <= local147; local255++) {
									@Pc(265) int[] local265 = local97[(local255 + local30) % local36];
									@Pc(269) int local269 = local265[2];
									if (local269 != local200) {
										@Pc(280) int local280 = local265[0];
										@Pc(284) int local284 = local265[1];
										@Pc(295) int local295;
										@Pc(299) int local299;
										if (local207 < local152) {
											local295 = Math.max(local207, local280);
											local299 = Math.min(local152, local284);
										} else if (local280 == 0) {
											local299 = Math.min(local152, local284);
											local295 = 0;
										} else {
											local295 = Math.max(local207, local280);
											local299 = Static93.anInt1862;
										}
										this.method5742(local299 - local295, local200 + -local269, local104, local20, local26 + local295, local269);
									}
								}
							}
							local30 = local141;
							break;
						}
						local141++;
						if (local141 >= local36) {
							local141 = 0;
						}
						local147++;
					}
				}
				if (local200 + local123 > Static512.anInt8591) {
					local123 = Static512.anInt8591 - local200;
				} else {
					local32 = false;
				}
				@Pc(394) int[] local394;
				if (local127 == Static93.anInt1862) {
					this.method5742(local114, local123, local104, local20, local28 + local24, local200);
					if (local32) {
						return local11;
					}
					local32 = true;
					local394 = local93[local38++];
					local394[0] = local28;
					local394[2] = local200 + local123;
					local394[1] = local127;
					@Pc(411) int[][] local411 = local97;
					local97 = local93;
					local36 = local38;
					local93 = local411;
					local26 = local24;
					local38 = 0;
					local24 = Static610.method8343(local104, Static93.anInt1862);
					local22 = local24 - local26;
					local28 = 0;
					local147 = local22;
					if (local22 < 0) {
						local147 = local22 + Static93.anInt1862;
					}
					if (Static93.anInt1862 < local147) {
						local147 -= Static93.anInt1862;
					}
					local30 = 0;
					while (true) {
						@Pc(457) int[] local457 = local97[local30];
						if (local147 >= local457[0] && local147 <= local457[1]) {
							local34 = false;
							break;
						}
						@Pc(470) int local470 = ~local36;
						local30++;
						if (local470 >= ~local30) {
							local30 = 0;
						}
					}
				} else {
					local394 = local93[local38++];
					local394[0] = local28;
					local394[2] = local200 + local123;
					local394[1] = local127;
					this.method5742(local114, local123, local104, local20, local28 + local24, local200);
					local28 = local127;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
	}
}
