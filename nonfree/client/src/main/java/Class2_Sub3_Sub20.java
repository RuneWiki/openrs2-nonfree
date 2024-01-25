import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class2_Sub3_Sub20 extends Class2_Sub3 {

	@OriginalMember(owner = "client!lm", name = "Z", descriptor = "I")
	private int anInt4143;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
	private int anInt4127 = 1024;

	@OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
	private int anInt4131 = 1024;

	@OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
	private int anInt4134 = 2048;

	@OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
	private int anInt4136 = 409;

	@OriginalMember(owner = "client!lm", name = "U", descriptor = "I")
	private int anInt4140 = 0;

	@OriginalMember(owner = "client!lm", name = "T", descriptor = "I")
	private int anInt4139 = 1024;

	@OriginalMember(owner = "client!lm", name = "V", descriptor = "I")
	private int anInt4141 = 1024;

	@OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
	private int anInt4133 = 0;

	@OriginalMember(owner = "client!lm", name = "ab", descriptor = "I")
	private int anInt4144 = 819;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3984(arg0);
		if (!super.aClass137_41.aBoolean400) {
			return local11;
		}
		@Pc(22) int[][] local22 = super.aClass137_41.method3983();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) boolean local34 = true;
		@Pc(36) boolean local36 = true;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(47) int local47 = this.anInt4127 * Static263.anInt5504 >> 12;
		@Pc(54) int local54 = Static263.anInt5504 * this.anInt4134 >> 12;
		@Pc(61) int local61 = Static363.anInt6995 * this.anInt4136 >> 12;
		@Pc(68) int local68 = this.anInt4144 * Static363.anInt6995 >> 12;
		if (local68 <= 1) {
			return local22[arg0];
		}
		this.anInt4143 = this.anInt4131 * (Static263.anInt5504 / 8) >> 12;
		@Pc(91) int local91 = Static263.anInt5504 / local47 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt4140);
		while (true) {
			while (true) {
				@Pc(116) int local116 = Static172.method3391(local54 - local47, local106) + local47;
				@Pc(126) int local126 = Static172.method3391(local68 - local61, local106) + local61;
				@Pc(131) int local131 = local30 + local116;
				if (local131 > Static263.anInt5504) {
					local116 = Static263.anInt5504 - local30;
					local131 = Static263.anInt5504;
				}
				@Pc(145) int local145;
				@Pc(155) int local155;
				if (local36) {
					local145 = 0;
				} else {
					@Pc(149) int local149 = local32;
					@Pc(153) int[] local153 = local99[local32];
					local155 = 0;
					@Pc(159) int local159 = local24 + local131;
					if (local159 < 0) {
						local159 += Static263.anInt5504;
					}
					if (Static263.anInt5504 < local159) {
						local159 -= Static263.anInt5504;
					}
					while (true) {
						@Pc(179) int[] local179 = local99[local149];
						if (local159 >= local179[0] && local179[1] >= local159) {
							local145 = local153[2];
							if (local32 != local149) {
								@Pc(221) int local221 = local24 + local30;
								if (local221 < 0) {
									local221 += Static263.anInt5504;
								}
								if (local221 > Static263.anInt5504) {
									local221 -= Static263.anInt5504;
								}
								for (@Pc(243) int local243 = 1; local243 <= local155; local243++) {
									@Pc(253) int[] local253 = local99[(local243 + local32) % local38];
									local145 = Math.max(local145, local253[2]);
								}
								for (@Pc(269) int local269 = 0; local269 <= local155; local269++) {
									@Pc(280) int[] local280 = local99[(local32 + local269) % local38];
									@Pc(284) int local284 = local280[2];
									if (local284 != local145) {
										@Pc(295) int local295 = local280[0];
										@Pc(299) int local299 = local280[1];
										@Pc(310) int local310;
										@Pc(314) int local314;
										if (local159 > local221) {
											local310 = Math.max(local221, local295);
											local314 = Math.min(local159, local299);
										} else if (local295 == 0) {
											local314 = Math.min(local159, local299);
											local310 = 0;
										} else {
											local310 = Math.max(local221, local295);
											local314 = Static263.anInt5504;
										}
										this.method3535(local22, local284, local314 - local310, local145 + -local284, local106, local310 + local28);
									}
								}
							}
							local32 = local149;
							break;
						}
						local155++;
						@Pc(197) int local197 = ~local38;
						local149++;
						if (local197 >= ~local149) {
							local149 = 0;
						}
					}
				}
				if (Static363.anInt6995 < local126 + local145) {
					local126 = Static363.anInt6995 - local145;
				} else {
					local34 = false;
				}
				@Pc(393) int[] local393;
				if (local131 == Static263.anInt5504) {
					this.method3535(local22, local145, local116, local126, local106, local30 + local26);
					if (local34) {
						return local11;
					}
					local34 = true;
					local393 = local95[local40++];
					local393[0] = local30;
					local393[1] = local131;
					local393[2] = local126 + local145;
					@Pc(409) int[][] local409 = local99;
					local99 = local95;
					local95 = local409;
					local38 = local40;
					local40 = 0;
					local28 = local26;
					local26 = Static172.method3391(Static263.anInt5504, local106);
					local30 = 0;
					local24 = local26 - local28;
					local155 = local24;
					if (local24 < 0) {
						local155 = local24 + Static263.anInt5504;
					}
					local32 = 0;
					if (local155 > Static263.anInt5504) {
						local155 -= Static263.anInt5504;
					}
					local36 = false;
					while (true) {
						@Pc(460) int[] local460 = local99[local32];
						if (local460[0] <= local155 && local155 <= local460[1]) {
							break;
						}
						local32++;
						if (local32 >= local38) {
							local32 = 0;
						}
					}
				} else {
					local393 = local95[local40++];
					local393[2] = local145 + local126;
					local393[0] = local30;
					local393[1] = local131;
					this.method3535(local22, local145, local116, local126, local106, local26 + local30);
					local30 = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4140 = arg1.method3124();
		} else if (arg0 == 1) {
			this.anInt4127 = arg1.method3104();
		} else if (arg0 == 2) {
			this.anInt4134 = arg1.method3104();
		} else if (arg0 == 3) {
			this.anInt4136 = arg1.method3104();
		} else if (arg0 == 4) {
			this.anInt4144 = arg1.method3104();
		} else if (arg0 == 5) {
			this.anInt4131 = arg1.method3104();
		} else if (arg0 == 6) {
			this.anInt4133 = arg1.method3124();
		} else if (arg0 == 7) {
			this.anInt4139 = arg1.method3104();
		} else if (arg0 == 8) {
			this.anInt4141 = arg1.method3104();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B[[IIIILjava/util/Random;I)V")
	private void method3535(@OriginalArg(1) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(26) int local26 = this.anInt4141 <= 0 ? 4096 : 4096 - Static172.method3391(this.anInt4141, arg4);
		@Pc(34) int local34 = this.anInt4143 * this.anInt4139 >> 12;
		@Pc(50) int local50 = this.anInt4143 - (local34 > 0 ? Static172.method3391(local34, arg4) : 0);
		if (arg5 >= Static263.anInt5504) {
			arg5 -= Static263.anInt5504;
		}
		@Pc(66) int local66;
		@Pc(93) int local93;
		if (local50 <= 0) {
			if (arg2 + arg5 <= Static263.anInt5504) {
				for (local66 = 0; local66 < arg3; local66++) {
					Static369.method2580(arg0[arg1 + local66], arg5, arg2, local26);
				}
			} else {
				local66 = Static263.anInt5504 - arg5;
				for (local93 = 0; local93 < arg3; local93++) {
					@Pc(101) int[] local101 = arg0[local93 + arg1];
					Static369.method2580(local101, arg5, local66, local26);
					Static369.method2580(local101, 0, arg2 - local66, local26);
				}
			}
		} else if (arg3 > 0 && arg2 > 0) {
			local66 = arg2 / 2;
			local93 = arg3 / 2;
			@Pc(139) int local139 = local66 >= local50 ? local50 : local66;
			@Pc(150) int local150 = local50 > local93 ? local93 : local50;
			@Pc(154) int local154 = local139 + arg5;
			@Pc(161) int local161 = arg2 - local139 * 2;
			for (@Pc(163) int local163 = 0; local163 < arg3; local163++) {
				@Pc(171) int[] local171 = arg0[arg1 + local163];
				@Pc(180) int local180;
				@Pc(185) int local185;
				@Pc(193) int local193;
				if (local163 < local150) {
					local180 = local163 * local26 / local150;
					if (this.anInt4133 == 0) {
						for (local185 = 0; local185 < local139; local185++) {
							local193 = local26 * local185 / local139;
							local171[arg5 + local185 & Static171.anInt3863] = local171[arg2 + arg5 - local185 - 1 & Static171.anInt3863] = local180 * local193 >> 12;
						}
					} else {
						for (local185 = 0; local185 < local139; local185++) {
							local193 = local185 * local26 / local139;
							local171[local185 + arg5 & Static171.anInt3863] = local171[arg5 + arg2 - local185 - 1 & Static171.anInt3863] = local193 >= local180 ? local180 : local193;
						}
					}
					if (Static263.anInt5504 < local154 + local161) {
						local185 = Static263.anInt5504 - local154;
						Static369.method2580(local171, local154, local185, local180);
						Static369.method2580(local171, 0, local161 - local185, local180);
					} else {
						Static369.method2580(local171, local154, local161, local180);
					}
				} else {
					local180 = arg3 - local163 - 1;
					if (local150 > local180) {
						local185 = local180 * local26 / local150;
						@Pc(325) int local325;
						if (this.anInt4133 == 0) {
							for (local193 = 0; local193 < local139; local193++) {
								local325 = local193 * local26 / local139;
								local171[arg5 + local193 & Static171.anInt3863] = local171[Static171.anInt3863 & arg5 + arg2 - local193 - 1] = local325 * local185 >> 12;
							}
						} else {
							for (local193 = 0; local193 < local139; local193++) {
								local325 = local26 * local193 / local139;
								local171[Static171.anInt3863 & arg5 + local193] = local171[arg2 + arg5 - local193 - 1 & Static171.anInt3863] = local325 >= local185 ? local185 : local325;
							}
						}
						if (Static263.anInt5504 >= local154 + local161) {
							Static369.method2580(local171, local154, local161, local185);
						} else {
							local193 = Static263.anInt5504 - local154;
							Static369.method2580(local171, local154, local193, local185);
							Static369.method2580(local171, 0, local161 - local193, local185);
						}
					} else {
						for (local185 = 0; local185 < local139; local185++) {
							local171[Static171.anInt3863 & arg5 + local185] = local171[arg2 + arg5 - local185 - 1 & Static171.anInt3863] = local26 * local185 / local139;
						}
						if (Static263.anInt5504 < local154 + local161) {
							local193 = Static263.anInt5504 - local154;
							Static369.method2580(local171, local154, local193, local26);
							Static369.method2580(local171, 0, local161 - local193, local26);
						} else {
							Static369.method2580(local171, local154, local161, local26);
						}
					}
				}
			}
		}
	}
}
