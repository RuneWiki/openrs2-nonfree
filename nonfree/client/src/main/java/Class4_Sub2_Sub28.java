import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class4_Sub2_Sub28 extends Class4_Sub2 {

	@OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
	private int anInt4952;

	@OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
	private int anInt4955 = 1024;

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
	private int anInt4954 = 1024;

	@OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
	private int anInt4957 = 1024;

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
	private int anInt4946 = 819;

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
	private int anInt4949 = 1024;

	@OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
	private int anInt4948 = 409;

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
	private int anInt4961 = 0;

	@OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
	private int anInt4953 = 2048;

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
	private int anInt4962 = 0;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass9_41.method279(arg0);
		if (!super.aClass9_41.aBoolean15) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass9_41.method276();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = Static350.anInt6330 * this.anInt4957 >> 12;
		@Pc(58) int local58 = this.anInt4953 * Static350.anInt6330 >> 12;
		@Pc(65) int local65 = Static160.anInt3006 * this.anInt4948 >> 12;
		@Pc(72) int local72 = Static160.anInt3006 * this.anInt4946 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt4952 = this.anInt4955 * (Static350.anInt6330 / 8) >> 12;
		@Pc(97) int local97 = Static350.anInt6330 / local51 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt4962);
		while (true) {
			while (true) {
				@Pc(124) int local124 = local51 + Static346.method4895(local112, local58 - local51);
				@Pc(134) int local134 = Static346.method4895(local112, local72 - local65) + local65;
				@Pc(139) int local139 = local34 + local124;
				if (Static350.anInt6330 < local139) {
					local139 = Static350.anInt6330;
					local124 = Static350.anInt6330 - local34;
				}
				@Pc(156) int local156;
				@Pc(166) int local166;
				if (local40) {
					local156 = 0;
				} else {
					@Pc(160) int local160 = local36;
					@Pc(164) int[] local164 = local105[local36];
					local166 = 0;
					@Pc(171) int local171 = local139 + local28;
					if (local171 < 0) {
						local171 += Static350.anInt6330;
					}
					if (Static350.anInt6330 < local171) {
						local171 -= Static350.anInt6330;
					}
					while (true) {
						@Pc(191) int[] local191 = local105[local160];
						if (local191[0] <= local171 && local191[1] >= local171) {
							local156 = local164[2];
							if (local160 != local36) {
								@Pc(233) int local233 = local28 + local34;
								if (local233 < 0) {
									local233 += Static350.anInt6330;
								}
								if (Static350.anInt6330 < local233) {
									local233 -= Static350.anInt6330;
								}
								for (@Pc(251) int local251 = 1; local251 <= local166; local251++) {
									@Pc(261) int[] local261 = local105[(local36 + local251) % local42];
									local156 = Math.max(local156, local261[2]);
								}
								for (@Pc(277) int local277 = 0; local277 <= local166; local277++) {
									@Pc(287) int[] local287 = local105[(local277 + local36) % local42];
									@Pc(291) int local291 = local287[2];
									if (local291 != local156) {
										@Pc(302) int local302 = local287[0];
										@Pc(306) int local306 = local287[1];
										@Pc(317) int local317;
										@Pc(321) int local321;
										if (local171 > local233) {
											local317 = Math.max(local233, local302);
											local321 = Math.min(local171, local306);
										} else if (local302 == 0) {
											local321 = Math.min(local171, local306);
											local317 = 0;
										} else {
											local317 = Math.max(local233, local302);
											local321 = Static350.anInt6330;
										}
										this.method3776(local156 - local291, local317 + local32, local26, local291, local112, local321 - local317);
									}
								}
							}
							local36 = local160;
							break;
						}
						local160++;
						if (local160 >= local42) {
							local160 = 0;
						}
						local166++;
					}
				}
				if (local134 + local156 <= Static160.anInt3006) {
					local38 = false;
				} else {
					local134 = Static160.anInt3006 - local156;
				}
				@Pc(413) int[] local413;
				if (local139 == Static350.anInt6330) {
					this.method3776(local134, local30 + local34, local26, local156, local112, local124);
					if (local38) {
						return local17;
					}
					local38 = true;
					local413 = local101[local44++];
					local413[1] = local139;
					local413[0] = local34;
					local413[2] = local134 + local156;
					@Pc(429) int[][] local429 = local105;
					local105 = local101;
					local101 = local429;
					local42 = local44;
					local32 = local30;
					local44 = 0;
					local30 = Static346.method4895(local112, Static350.anInt6330);
					local28 = local30 - local32;
					local34 = 0;
					local166 = local28;
					if (local28 < 0) {
						local166 = local28 + Static350.anInt6330;
					}
					local36 = 0;
					if (Static350.anInt6330 < local166) {
						local166 -= Static350.anInt6330;
					}
					while (true) {
						@Pc(476) int[] local476 = local105[local36];
						if (local166 >= local476[0] && local166 <= local476[1]) {
							local40 = false;
							break;
						}
						local36++;
						if (local36 >= local42) {
							local36 = 0;
						}
					}
				} else {
					local413 = local101[local44++];
					local413[2] = local134 + local156;
					local413[1] = local139;
					local413[0] = local34;
					this.method3776(local134, local30 + local34, local26, local156, local112, local124);
					local34 = local139;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt4962 = arg1.method4864();
		} else if (arg0 == 1) {
			this.anInt4957 = arg1.method4877();
		} else if (arg0 == 2) {
			this.anInt4953 = arg1.method4877();
		} else if (arg0 == 3) {
			this.anInt4948 = arg1.method4877();
		} else if (arg0 == 4) {
			this.anInt4946 = arg1.method4877();
		} else if (arg0 == 5) {
			this.anInt4955 = arg1.method4877();
		} else if (arg0 == 6) {
			this.anInt4961 = arg1.method4864();
		} else if (arg0 == 7) {
			this.anInt4949 = arg1.method4877();
		} else if (arg0 == 8) {
			this.anInt4954 = arg1.method4877();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[[IIILjava/util/Random;I)V")
	private void method3776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21 = this.anInt4954 > 0 ? 4096 - Static346.method4895(arg4, this.anInt4954) : 4096;
		@Pc(29) int local29 = this.anInt4952 * this.anInt4949 >> 12;
		@Pc(50) int local50 = this.anInt4952 - (local29 <= 0 ? 0 : Static346.method4895(arg4, local29));
		if (Static350.anInt6330 <= arg1) {
			arg1 -= Static350.anInt6330;
		}
		@Pc(69) int local69;
		@Pc(71) int local71;
		if (local50 <= 0) {
			if (arg1 + arg5 > Static350.anInt6330) {
				local69 = Static350.anInt6330 - arg1;
				for (local71 = 0; local71 < arg0; local71++) {
					@Pc(80) int[] local80 = arg2[arg3 + local71];
					Static457.method1217(local80, arg1, local69, local21);
					Static457.method1217(local80, 0, arg5 - local69, local21);
				}
			} else {
				for (local69 = 0; local69 < arg0; local69++) {
					Static457.method1217(arg2[local69 + arg3], arg1, arg5, local21);
				}
			}
		} else if (arg0 > 0 && arg5 > 0) {
			local69 = arg5 / 2;
			local71 = arg0 / 2;
			@Pc(140) int local140 = local50 > local69 ? local69 : local50;
			@Pc(147) int local147 = local71 < local50 ? local71 : local50;
			@Pc(151) int local151 = local140 + arg1;
			@Pc(158) int local158 = arg5 - local140 * 2;
			for (@Pc(160) int local160 = 0; local160 < arg0; local160++) {
				@Pc(168) int[] local168 = arg2[arg3 + local160];
				@Pc(177) int local177;
				@Pc(185) int local185;
				@Pc(193) int local193;
				if (local160 < local147) {
					local177 = local160 * local21 / local147;
					if (this.anInt4961 == 0) {
						for (local185 = 0; local185 < local140; local185++) {
							local193 = local185 * local21 / local140;
							local168[arg1 + local185 & Static144.anInt2707] = local168[arg1 + arg5 - local185 - 1 & Static144.anInt2707] = local177 * local193 >> 12;
						}
					} else {
						for (local185 = 0; local185 < local140; local185++) {
							local193 = local185 * local21 / local140;
							local168[local185 + arg1 & Static144.anInt2707] = local168[arg5 + arg1 - local185 - 1 & Static144.anInt2707] = local193 < local177 ? local193 : local177;
						}
					}
					if (local158 + local151 <= Static350.anInt6330) {
						Static457.method1217(local168, local151, local158, local177);
					} else {
						local185 = Static350.anInt6330 - local151;
						Static457.method1217(local168, local151, local185, local177);
						Static457.method1217(local168, 0, local158 - local185, local177);
					}
				} else {
					local177 = arg0 - local160 - 1;
					if (local147 > local177) {
						local185 = local21 * local177 / local147;
						@Pc(341) int local341;
						if (this.anInt4961 == 0) {
							for (local193 = 0; local193 < local140; local193++) {
								local341 = local193 * local21 / local140;
								local168[arg1 + local193 & Static144.anInt2707] = local168[arg1 + arg5 - local193 - 1 & Static144.anInt2707] = local185 * local341 >> 12;
							}
						} else {
							for (local193 = 0; local193 < local140; local193++) {
								local341 = local21 * local193 / local140;
								local168[Static144.anInt2707 & local193 + arg1] = local168[Static144.anInt2707 & arg5 + arg1 - local193 - 1] = local341 >= local185 ? local185 : local341;
							}
						}
						if (Static350.anInt6330 >= local151 + local158) {
							Static457.method1217(local168, local151, local158, local185);
						} else {
							local193 = Static350.anInt6330 - local151;
							Static457.method1217(local168, local151, local193, local185);
							Static457.method1217(local168, 0, local158 - local193, local185);
						}
					} else {
						for (local185 = 0; local185 < local140; local185++) {
							local168[local185 + arg1 & Static144.anInt2707] = local168[arg1 + arg5 - local185 - 1 & Static144.anInt2707] = local21 * local185 / local140;
						}
						if (Static350.anInt6330 >= local151 + local158) {
							Static457.method1217(local168, local151, local158, local21);
						} else {
							local193 = Static350.anInt6330 - local151;
							Static457.method1217(local168, local151, local193, local21);
							Static457.method1217(local168, 0, local158 - local193, local21);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
	}
}
