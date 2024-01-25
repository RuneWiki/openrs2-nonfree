import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qs", name = "L", descriptor = "I")
	private int anInt5256;

	@OriginalMember(owner = "client!qs", name = "K", descriptor = "I")
	private int anInt5255 = 409;

	@OriginalMember(owner = "client!qs", name = "N", descriptor = "I")
	private int anInt5258 = 0;

	@OriginalMember(owner = "client!qs", name = "P", descriptor = "I")
	private int anInt5260 = 819;

	@OriginalMember(owner = "client!qs", name = "R", descriptor = "I")
	private int anInt5261 = 1024;

	@OriginalMember(owner = "client!qs", name = "M", descriptor = "I")
	private int anInt5257 = 1024;

	@OriginalMember(owner = "client!qs", name = "J", descriptor = "I")
	private int anInt5254 = 1024;

	@OriginalMember(owner = "client!qs", name = "I", descriptor = "I")
	private int anInt5253 = 0;

	@OriginalMember(owner = "client!qs", name = "O", descriptor = "I")
	private int anInt5259 = 2048;

	@OriginalMember(owner = "client!qs", name = "Z", descriptor = "I")
	private int anInt5267 = 1024;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5258 = arg1.method2132();
		} else if (arg0 == 1) {
			this.anInt5257 = arg1.method2161();
		} else if (arg0 == 2) {
			this.anInt5259 = arg1.method2161();
		} else if (arg0 == 3) {
			this.anInt5255 = arg1.method2161();
		} else if (arg0 == 4) {
			this.anInt5260 = arg1.method2161();
		} else if (arg0 == 5) {
			this.anInt5254 = arg1.method2161();
		} else if (arg0 == 6) {
			this.anInt5253 = arg1.method2132();
		} else if (arg0 == 7) {
			this.anInt5261 = arg1.method2161();
		} else if (arg0 == 8) {
			this.anInt5267 = arg1.method2161();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (!super.aClass98_41.aBoolean210) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass98_41.method2852();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static85.anInt1910 * this.anInt5257 >> 12;
		@Pc(52) int local52 = this.anInt5259 * Static85.anInt1910 >> 12;
		@Pc(59) int local59 = this.anInt5255 * Static208.anInt4105 >> 12;
		@Pc(66) int local66 = Static208.anInt4105 * this.anInt5260 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt5256 = this.anInt5254 * (Static85.anInt1910 / 8) >> 12;
		@Pc(91) int local91 = Static85.anInt1910 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt5258);
		while (true) {
			while (true) {
				@Pc(116) int local116 = Static297.method5193(local106, local52 - local45) + local45;
				@Pc(126) int local126 = Static297.method5193(local106, local66 - local59) + local59;
				@Pc(131) int local131 = local28 + local116;
				if (Static85.anInt1910 < local131) {
					local116 = Static85.anInt1910 - local28;
					local131 = Static85.anInt1910;
				}
				@Pc(207) int local207;
				@Pc(155) int local155;
				if (local34) {
					local207 = 0;
				} else {
					@Pc(149) int local149 = local30;
					@Pc(153) int[] local153 = local99[local30];
					local155 = 0;
					@Pc(159) int local159 = local22 + local131;
					if (local159 < 0) {
						local159 += Static85.anInt1910;
					}
					if (local159 > Static85.anInt1910) {
						local159 -= Static85.anInt1910;
					}
					while (true) {
						@Pc(176) int[] local176 = local99[local149];
						if (local176[0] <= local159 && local159 <= local176[1]) {
							local207 = local153[2];
							if (local30 != local149) {
								@Pc(214) int local214 = local22 + local28;
								if (local214 < 0) {
									local214 += Static85.anInt1910;
								}
								if (local214 > Static85.anInt1910) {
									local214 -= Static85.anInt1910;
								}
								for (@Pc(232) int local232 = 1; local232 <= local155; local232++) {
									@Pc(242) int[] local242 = local99[(local232 + local30) % local36];
									local207 = Math.max(local207, local242[2]);
								}
								for (@Pc(258) int local258 = 0; local258 <= local155; local258++) {
									@Pc(268) int[] local268 = local99[(local258 + local30) % local36];
									@Pc(272) int local272 = local268[2];
									if (local207 != local272) {
										@Pc(279) int local279 = local268[0];
										@Pc(283) int local283 = local268[1];
										@Pc(294) int local294;
										@Pc(298) int local298;
										if (local214 < local159) {
											local294 = Math.max(local214, local279);
											local298 = Math.min(local159, local283);
										} else if (local279 == 0) {
											local294 = 0;
											local298 = Math.min(local159, local283);
										} else {
											local294 = Math.max(local214, local279);
											local298 = Static85.anInt1910;
										}
										this.method4841(local106, local298 - local294, local272, local20, local207 - local272, local26 + local294);
									}
								}
							}
							local30 = local149;
							break;
						}
						local155++;
						@Pc(194) int local194 = ~local36;
						local149++;
						if (local194 >= ~local149) {
							local149 = 0;
						}
					}
				}
				if (local207 + local126 > Static208.anInt4105) {
					local126 = Static208.anInt4105 - local207;
				} else {
					local32 = false;
				}
				@Pc(364) int[] local364;
				if (local131 == Static85.anInt1910) {
					this.method4841(local106, local116, local207, local20, local126, local28 + local24);
					if (local32) {
						return local11;
					}
					local32 = true;
					local364 = local95[local38++];
					local364[2] = local126 + local207;
					local364[0] = local28;
					local364[1] = local131;
					@Pc(431) int[][] local431 = local99;
					local99 = local95;
					local95 = local431;
					local36 = local38;
					local38 = 0;
					local26 = local24;
					local24 = Static297.method5193(local106, Static85.anInt1910);
					local22 = local24 - local26;
					local28 = 0;
					local155 = local22;
					if (local22 < 0) {
						local155 = local22 + Static85.anInt1910;
					}
					if (Static85.anInt1910 < local155) {
						local155 -= Static85.anInt1910;
					}
					local30 = 0;
					while (true) {
						@Pc(474) int[] local474 = local99[local30];
						if (local474[0] <= local155 && local474[1] >= local155) {
							local34 = false;
							break;
						}
						local30++;
						if (local36 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local364 = local95[local38++];
					local364[0] = local28;
					local364[2] = local207 + local126;
					local364[1] = local131;
					this.method4841(local106, local116, local207, local20, local126, local28 + local24);
					local28 = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/util/Random;BII[[III)V")
	private void method4841(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(26) int local26 = this.anInt5267 > 0 ? 4096 - Static297.method5193(arg0, this.anInt5267) : 4096;
		@Pc(34) int local34 = this.anInt5261 * this.anInt5256 >> 12;
		@Pc(46) int local46 = this.anInt5256 - (local34 <= 0 ? 0 : Static297.method5193(arg0, local34));
		if (Static85.anInt1910 <= arg5) {
			arg5 -= Static85.anInt1910;
		}
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (local46 > 0) {
			if (arg4 > 0 && arg1 > 0) {
				local70 = arg1 / 2;
				local74 = arg4 / 2;
				@Pc(85) int local85 = local46 <= local70 ? local46 : local70;
				@Pc(92) int local92 = local74 >= local46 ? local46 : local74;
				@Pc(96) int local96 = local85 + arg5;
				@Pc(103) int local103 = arg1 - local85 * 2;
				for (@Pc(105) int local105 = 0; local105 < arg4; local105++) {
					@Pc(113) int[] local113 = arg3[local105 + arg2];
					@Pc(122) int local122;
					@Pc(127) int local127;
					@Pc(135) int local135;
					if (local105 < local92) {
						local122 = local105 * local26 / local92;
						if (this.anInt5253 == 0) {
							for (local127 = 0; local127 < local85; local127++) {
								local135 = local26 * local127 / local85;
								local113[Static346.anInt6542 & local127 + arg5] = local113[Static346.anInt6542 & arg5 + arg1 - local127 - 1] = local122 * local135 >> 12;
							}
						} else {
							for (local127 = 0; local127 < local85; local127++) {
								local135 = local127 * local26 / local85;
								local113[Static346.anInt6542 & arg5 + local127] = local113[arg5 + arg1 - local127 - 1 & Static346.anInt6542] = local122 <= local135 ? local122 : local135;
							}
						}
						if (local96 + local103 > Static85.anInt1910) {
							local127 = Static85.anInt1910 - local96;
							Static374.method2829(local113, local96, local127, local122);
							Static374.method2829(local113, 0, local103 - local127, local122);
						} else {
							Static374.method2829(local113, local96, local103, local122);
						}
					} else {
						local122 = arg4 - local105 - 1;
						if (local122 < local92) {
							local127 = local122 * local26 / local92;
							@Pc(271) int local271;
							if (this.anInt5253 == 0) {
								for (local135 = 0; local135 < local85; local135++) {
									local271 = local26 * local135 / local85;
									local113[Static346.anInt6542 & local135 + arg5] = local113[Static346.anInt6542 & arg5 + arg1 - local135 - 1] = local127 * local271 >> 12;
								}
							} else {
								for (local135 = 0; local135 < local85; local135++) {
									local271 = local135 * local26 / local85;
									local113[Static346.anInt6542 & local135 + arg5] = local113[Static346.anInt6542 & arg5 + arg1 - local135 - 1] = local127 <= local271 ? local127 : local271;
								}
							}
							if (local96 + local103 <= Static85.anInt1910) {
								Static374.method2829(local113, local96, local103, local127);
							} else {
								local135 = Static85.anInt1910 - local96;
								Static374.method2829(local113, local96, local135, local127);
								Static374.method2829(local113, 0, local103 - local135, local127);
							}
						} else {
							for (local127 = 0; local127 < local85; local127++) {
								local113[Static346.anInt6542 & arg5 + local127] = local113[Static346.anInt6542 & arg1 + arg5 - local127 - 1] = local26 * local127 / local85;
							}
							if (Static85.anInt1910 >= local96 + local103) {
								Static374.method2829(local113, local96, local103, local26);
							} else {
								local135 = Static85.anInt1910 - local96;
								Static374.method2829(local113, local96, local135, local26);
								Static374.method2829(local113, 0, local103 - local135, local26);
							}
						}
					}
				}
			}
		} else if (arg1 + arg5 > Static85.anInt1910) {
			local70 = Static85.anInt1910 - arg5;
			for (local74 = 0; local74 < arg4; local74++) {
				@Pc(485) int[] local485 = arg3[local74 + arg2];
				Static374.method2829(local485, arg5, local70, local26);
				Static374.method2829(local485, 0, arg1 - local70, local26);
			}
		} else {
			for (local70 = 0; local70 < arg4; local70++) {
				Static374.method2829(arg3[arg2 + local70], arg5, arg1, local26);
			}
		}
	}
}
