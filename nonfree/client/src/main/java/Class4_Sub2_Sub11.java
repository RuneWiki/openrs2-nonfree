import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class4_Sub2_Sub11 extends Class4_Sub2 {

	@OriginalMember(owner = "client!gga", name = "J", descriptor = "I")
	private int anInt3183;

	@OriginalMember(owner = "client!gga", name = "H", descriptor = "I")
	private int anInt3181 = 2048;

	@OriginalMember(owner = "client!gga", name = "E", descriptor = "I")
	private int anInt3178 = 1024;

	@OriginalMember(owner = "client!gga", name = "L", descriptor = "I")
	private int anInt3185 = 0;

	@OriginalMember(owner = "client!gga", name = "O", descriptor = "I")
	private int anInt3187 = 1024;

	@OriginalMember(owner = "client!gga", name = "I", descriptor = "I")
	private int anInt3182 = 1024;

	@OriginalMember(owner = "client!gga", name = "K", descriptor = "I")
	private int anInt3184 = 819;

	@OriginalMember(owner = "client!gga", name = "P", descriptor = "I")
	private int anInt3188 = 1024;

	@OriginalMember(owner = "client!gga", name = "R", descriptor = "I")
	private int anInt3190 = 0;

	@OriginalMember(owner = "client!gga", name = "T", descriptor = "I")
	private int anInt3191 = 409;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IZILjava/util/Random;II[[I)V")
	private void method2948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(21) int local21 = this.anInt3188 <= 0 ? 4096 : 4096 - Static149.method2598(arg2, this.anInt3188);
		@Pc(29) int local29 = this.anInt3183 * this.anInt3187 >> 12;
		@Pc(50) int local50 = this.anInt3183 - (local29 > 0 ? Static149.method2598(arg2, local29) : 0);
		if (Static269.anInt4330 <= arg1) {
			arg1 -= Static269.anInt4330;
		}
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (local50 <= 0) {
			if (arg3 + arg1 > Static269.anInt4330) {
				local73 = Static269.anInt4330 - arg1;
				for (local75 = 0; local75 < arg4; local75++) {
					@Pc(84) int[] local84 = arg5[arg0 + local75];
					Static685.method6467(local84, arg1, local73, local21);
					Static685.method6467(local84, 0, arg3 - local73, local21);
				}
			} else {
				for (local73 = 0; local73 < arg4; local73++) {
					Static685.method6467(arg5[arg0 + local73], arg1, arg3, local21);
				}
			}
		} else if (arg4 > 0 && arg3 > 0) {
			local73 = arg3 / 2;
			local75 = arg4 / 2;
			@Pc(152) int local152 = local73 < local50 ? local73 : local50;
			@Pc(159) int local159 = local75 >= local50 ? local50 : local75;
			@Pc(163) int local163 = local152 + arg1;
			@Pc(169) int local169 = arg3 - local152 * 2;
			for (@Pc(171) int local171 = 0; local171 < arg4; local171++) {
				@Pc(180) int[] local180 = arg5[local171 + arg0];
				@Pc(189) int local189;
				@Pc(194) int local194;
				@Pc(202) int local202;
				if (local171 < local159) {
					local189 = local171 * local21 / local159;
					if (this.anInt3190 == 0) {
						for (local194 = 0; local194 < local152; local194++) {
							local202 = local194 * local21 / local152;
							local180[local194 + arg1 & Static215.anInt3481] = local180[arg3 + arg1 - local194 - 1 & Static215.anInt3481] = local202 * local189 >> 12;
						}
					} else {
						for (local194 = 0; local194 < local152; local194++) {
							local202 = local21 * local194 / local152;
							local180[Static215.anInt3481 & local194 + arg1] = local180[arg3 + arg1 - local194 - 1 & Static215.anInt3481] = local202 >= local189 ? local189 : local202;
						}
					}
					if (Static269.anInt4330 >= local163 + local169) {
						Static685.method6467(local180, local163, local169, local189);
					} else {
						local194 = Static269.anInt4330 - local163;
						Static685.method6467(local180, local163, local194, local189);
						Static685.method6467(local180, 0, local169 - local194, local189);
					}
				} else {
					local189 = arg4 - local171 - 1;
					if (local159 > local189) {
						local194 = local189 * local21 / local159;
						@Pc(338) int local338;
						if (this.anInt3190 == 0) {
							for (local202 = 0; local202 < local152; local202++) {
								local338 = local21 * local202 / local152;
								local180[Static215.anInt3481 & local202 + arg1] = local180[Static215.anInt3481 & arg3 + arg1 - local202 - 1] = local338 * local194 >> 12;
							}
						} else {
							for (local202 = 0; local202 < local152; local202++) {
								local338 = local21 * local202 / local152;
								local180[Static215.anInt3481 & local202 + arg1] = local180[arg3 + arg1 - local202 - 1 & Static215.anInt3481] = local194 <= local338 ? local194 : local338;
							}
						}
						if (local169 + local163 > Static269.anInt4330) {
							local202 = Static269.anInt4330 - local163;
							Static685.method6467(local180, local163, local202, local194);
							Static685.method6467(local180, 0, local169 - local202, local194);
						} else {
							Static685.method6467(local180, local163, local169, local194);
						}
					} else {
						for (local194 = 0; local194 < local152; local194++) {
							local180[Static215.anInt3481 & local194 + arg1] = local180[arg1 + arg3 - local194 - 1 & Static215.anInt3481] = local194 * local21 / local152;
						}
						if (local163 + local169 > Static269.anInt4330) {
							local202 = Static269.anInt4330 - local163;
							Static685.method6467(local180, local163, local202, local21);
							Static685.method6467(local180, 0, local169 - local202, local21);
						} else {
							Static685.method6467(local180, local163, local169, local21);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3185 = arg1.method8865();
		} else if (arg0 == 1) {
			this.anInt3182 = arg1.method8859();
		} else if (arg0 == 2) {
			this.anInt3181 = arg1.method8859();
		} else if (arg0 == 3) {
			this.anInt3191 = arg1.method8859();
		} else if (arg0 == 4) {
			this.anInt3184 = arg1.method8859();
		} else if (arg0 == 5) {
			this.anInt3178 = arg1.method8859();
		} else if (arg0 == 6) {
			this.anInt3190 = arg1.method8865();
		} else if (arg0 == 7) {
			this.anInt3187 = arg1.method8859();
		} else if (arg0 == 8) {
			this.anInt3188 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (!super.aClass271_41.aBoolean534) {
			return local11;
		}
		@Pc(24) int[][] local24 = super.aClass271_41.method6063();
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = true;
		@Pc(38) boolean local38 = true;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49 = Static269.anInt4330 * this.anInt3182 >> 12;
		@Pc(56) int local56 = this.anInt3181 * Static269.anInt4330 >> 12;
		@Pc(63) int local63 = this.anInt3191 * Static355.anInt5410 >> 12;
		@Pc(70) int local70 = Static355.anInt5410 * this.anInt3184 >> 12;
		if (local70 <= 1) {
			return local24[arg0];
		}
		this.anInt3183 = this.anInt3178 * (Static269.anInt4330 / 8) >> 12;
		@Pc(93) int local93 = Static269.anInt4330 / local49 + 1;
		@Pc(97) int[][] local97 = new int[local93][3];
		@Pc(101) int[][] local101 = new int[local93][3];
		@Pc(108) Random local108 = new Random((long) this.anInt3185);
		while (true) {
			while (true) {
				@Pc(121) int local121 = local49 + Static149.method2598(local108, local56 - local49);
				@Pc(130) int local130 = Static149.method2598(local108, local70 - local63) + local63;
				@Pc(135) int local135 = local32 + local121;
				if (local135 > Static269.anInt4330) {
					local135 = Static269.anInt4330;
					local121 = Static269.anInt4330 - local32;
				}
				@Pc(152) int local152;
				@Pc(162) int local162;
				if (local38) {
					local152 = 0;
				} else {
					@Pc(156) int local156 = local34;
					@Pc(160) int[] local160 = local101[local34];
					local162 = 0;
					@Pc(166) int local166 = local26 + local135;
					if (local166 < 0) {
						local166 += Static269.anInt4330;
					}
					if (local166 > Static269.anInt4330) {
						local166 -= Static269.anInt4330;
					}
					while (true) {
						@Pc(186) int[] local186 = local101[local156];
						if (local166 >= local186[0] && local166 <= local186[1]) {
							local152 = local160[2];
							if (local34 != local156) {
								@Pc(224) int local224 = local32 + local26;
								if (local224 < 0) {
									local224 += Static269.anInt4330;
								}
								if (local224 > Static269.anInt4330) {
									local224 -= Static269.anInt4330;
								}
								for (@Pc(239) int local239 = 1; local239 <= local162; local239++) {
									@Pc(250) int[] local250 = local101[(local34 + local239) % local40];
									local152 = Math.max(local152, local250[2]);
								}
								for (@Pc(262) int local262 = 0; local262 <= local162; local262++) {
									@Pc(272) int[] local272 = local101[(local262 + local34) % local40];
									@Pc(276) int local276 = local272[2];
									if (local152 != local276) {
										@Pc(283) int local283 = local272[0];
										@Pc(287) int local287 = local272[1];
										@Pc(294) int local294;
										@Pc(298) int local298;
										if (local166 > local224) {
											local294 = Math.max(local224, local283);
											local298 = Math.min(local166, local287);
										} else if (local283 == 0) {
											local298 = Math.min(local166, local287);
											local294 = 0;
										} else {
											local294 = Math.max(local224, local283);
											local298 = Static269.anInt4330;
										}
										this.method2948(local276, local294 + local30, local108, local298 - local294, local152 + -local276, local24);
									}
								}
							}
							local34 = local156;
							break;
						}
						local162++;
						local156++;
						if (local40 <= local156) {
							local156 = 0;
						}
					}
				}
				if (Static355.anInt5410 < local152 + local130) {
					local130 = Static355.anInt5410 - local152;
				} else {
					local36 = false;
				}
				@Pc(388) int[] local388;
				if (local135 == Static269.anInt4330) {
					this.method2948(local152, local32 + local28, local108, local121, local130, local24);
					if (local36) {
						return local11;
					}
					local36 = true;
					local388 = local97[local42++];
					local388[0] = local32;
					local388[1] = local135;
					local388[2] = local152 + local130;
					@Pc(404) int[][] local404 = local101;
					local101 = local97;
					local40 = local42;
					local97 = local404;
					local30 = local28;
					local42 = 0;
					local28 = Static149.method2598(local108, Static269.anInt4330);
					local32 = 0;
					local26 = local28 - local30;
					local162 = local26;
					if (local26 < 0) {
						local162 = local26 + Static269.anInt4330;
					}
					local34 = 0;
					if (Static269.anInt4330 < local162) {
						local162 -= Static269.anInt4330;
					}
					local38 = false;
					while (true) {
						@Pc(452) int[] local452 = local101[local34];
						if (local162 >= local452[0] && local452[1] >= local162) {
							break;
						}
						local34++;
						if (local40 <= local34) {
							local34 = 0;
						}
					}
				} else {
					local388 = local97[local42++];
					local388[1] = local135;
					local388[0] = local32;
					local388[2] = local130 + local152;
					this.method2948(local152, local28 + local32, local108, local121, local130, local24);
					local32 = local135;
				}
			}
		}
	}
}
