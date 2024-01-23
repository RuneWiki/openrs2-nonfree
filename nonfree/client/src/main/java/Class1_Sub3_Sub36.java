import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class1_Sub3_Sub36 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ul", name = "U", descriptor = "I")
	private int anInt5220;

	@OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
	private int anInt5215 = 1024;

	@OriginalMember(owner = "client!ul", name = "P", descriptor = "I")
	private int anInt5216 = 819;

	@OriginalMember(owner = "client!ul", name = "Z", descriptor = "I")
	private int anInt5225 = 1024;

	@OriginalMember(owner = "client!ul", name = "V", descriptor = "I")
	private int anInt5221 = 0;

	@OriginalMember(owner = "client!ul", name = "gb", descriptor = "I")
	private int anInt5232 = 1024;

	@OriginalMember(owner = "client!ul", name = "bb", descriptor = "I")
	private int anInt5227 = 1024;

	@OriginalMember(owner = "client!ul", name = "ab", descriptor = "I")
	private int anInt5226 = 0;

	@OriginalMember(owner = "client!ul", name = "S", descriptor = "I")
	private int anInt5218 = 2048;

	@OriginalMember(owner = "client!ul", name = "jb", descriptor = "I")
	private int anInt5235 = 409;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([[IIIILjava/util/Random;II)V")
	private void method3983(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Random arg4, @OriginalArg(5) int arg5) {
		@Pc(15) int local15 = this.anInt5232 <= 0 ? 4096 : 4096 - Static205.method3438(this.anInt5232, arg4);
		@Pc(23) int local23 = this.anInt5220 * this.anInt5225 >> 12;
		@Pc(47) int local47 = this.anInt5220 - (local23 <= 0 ? 0 : Static205.method3438(local23, arg4));
		if (arg2 >= Static110.anInt2934) {
			arg2 -= Static110.anInt2934;
		}
		@Pc(71) int local71;
		@Pc(94) int local94;
		if (local47 <= 0) {
			if (arg5 + arg2 <= Static110.anInt2934) {
				for (local71 = 0; local71 < arg3; local71++) {
					Static274.method2689(arg0[arg1 + local71], arg2, arg5, local15);
				}
			} else {
				local71 = Static110.anInt2934 - arg2;
				for (local94 = 0; local94 < arg3; local94++) {
					@Pc(103) int[] local103 = arg0[arg1 + local94];
					Static274.method2689(local103, arg2, local71, local15);
					Static274.method2689(local103, 0, arg5 - local71, local15);
				}
			}
		} else if (arg3 > 0 && arg5 > 0) {
			local71 = arg5 / 2;
			local94 = arg3 / 2;
			@Pc(147) int local147 = local47 > local94 ? local94 : local47;
			@Pc(158) int local158 = local47 > local71 ? local71 : local47;
			@Pc(163) int local163 = arg2 + local158;
			@Pc(170) int local170 = arg5 - local158 * 2;
			for (@Pc(172) int local172 = 0; local172 < arg3; local172++) {
				@Pc(180) int[] local180 = arg0[local172 + arg1];
				@Pc(193) int local193;
				@Pc(198) int local198;
				@Pc(206) int local206;
				if (local172 < local147) {
					local193 = local172 * local15 / local147;
					if (this.anInt5226 == 0) {
						for (local198 = 0; local198 < local158; local198++) {
							local206 = local198 * local15 / local158;
							local180[arg2 + local198 & Static2.anInt38] = local180[Static2.anInt38 & arg2 + arg5 - local198 - 1] = local206 * local193 >> 12;
						}
					} else {
						for (local198 = 0; local198 < local158; local198++) {
							local206 = local15 * local198 / local158;
							local180[Static2.anInt38 & local198 + arg2] = local180[Static2.anInt38 & arg2 + arg5 - local198 - 1] = local193 > local206 ? local206 : local193;
						}
					}
					if (Static110.anInt2934 >= local163 + local170) {
						Static274.method2689(local180, local163, local170, local193);
					} else {
						local198 = Static110.anInt2934 - local163;
						Static274.method2689(local180, local163, local198, local193);
						Static274.method2689(local180, 0, local170 - local198, local193);
					}
				} else {
					local193 = arg3 - local172 - 1;
					if (local147 > local193) {
						local198 = local193 * local15 / local147;
						@Pc(355) int local355;
						if (this.anInt5226 == 0) {
							for (local206 = 0; local206 < local158; local206++) {
								local355 = local206 * local15 / local158;
								local180[Static2.anInt38 & arg2 + local206] = local180[Static2.anInt38 & arg2 + arg5 - local206 - 1] = local355 * local198 >> 12;
							}
						} else {
							for (local206 = 0; local206 < local158; local206++) {
								local355 = local15 * local206 / local158;
								local180[arg2 + local206 & Static2.anInt38] = local180[Static2.anInt38 & arg5 + arg2 - local206 - 1] = local355 >= local198 ? local198 : local355;
							}
						}
						if (local163 + local170 <= Static110.anInt2934) {
							Static274.method2689(local180, local163, local170, local198);
						} else {
							local206 = Static110.anInt2934 - local163;
							Static274.method2689(local180, local163, local206, local198);
							Static274.method2689(local180, 0, local170 - local206, local198);
						}
					} else {
						for (local198 = 0; local198 < local158; local198++) {
							local180[arg2 + local198 & Static2.anInt38] = local180[arg5 + arg2 - local198 - 1 & Static2.anInt38] = local15 * local198 / local158;
						}
						if (local163 + local170 <= Static110.anInt2934) {
							Static274.method2689(local180, local163, local170, local15);
						} else {
							local206 = Static110.anInt2934 - local163;
							Static274.method2689(local180, local163, local206, local15);
							Static274.method2689(local180, 0, local170 - local206, local15);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5221 = arg0.method1772();
		} else if (arg1 == 1) {
			this.anInt5227 = arg0.method1764();
		} else if (arg1 == 2) {
			this.anInt5218 = arg0.method1764();
		} else if (arg1 == 3) {
			this.anInt5235 = arg0.method1764();
		} else if (arg1 == 4) {
			this.anInt5216 = arg0.method1764();
		} else if (arg1 == 5) {
			this.anInt5215 = arg0.method1764();
		} else if (arg1 == 6) {
			this.anInt5226 = arg0.method1772();
		} else if (arg1 == 7) {
			this.anInt5225 = arg0.method1764();
		} else if (arg1 == 8) {
			this.anInt5232 = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass8_41.method111(arg0);
		if (!super.aClass8_41.aBoolean6) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass8_41.method107();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static110.anInt2934 * this.anInt5227 >> 12;
		@Pc(52) int local52 = Static166.anInt3882 * this.anInt5235 >> 12;
		@Pc(59) int local59 = Static110.anInt2934 * this.anInt5218 >> 12;
		@Pc(66) int local66 = this.anInt5216 * Static166.anInt3882 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		@Pc(79) int local79 = Static110.anInt2934 / local45 + 1;
		@Pc(83) int[][] local83 = new int[local79][3];
		@Pc(87) int[][] local87 = new int[local79][3];
		this.anInt5220 = this.anInt5215 * (Static110.anInt2934 / 8) >> 12;
		@Pc(104) Random local104 = new Random((long) this.anInt5221);
		while (true) {
			while (true) {
				@Pc(114) int local114 = Static205.method3438(local59 - local45, local104) + local45;
				@Pc(124) int local124 = Static205.method3438(local66 - local52, local104) + local52;
				@Pc(128) int local128 = local114 + local28;
				if (local128 > Static110.anInt2934) {
					local128 = Static110.anInt2934;
					local114 = Static110.anInt2934 - local28;
				}
				@Pc(152) int local152;
				@Pc(144) int local144;
				if (local34) {
					local152 = 0;
				} else {
					@Pc(142) int local142 = local30;
					local144 = 0;
					@Pc(148) int[] local148 = local83[local30];
					local152 = local148[2];
					@Pc(156) int local156 = local24 + local128;
					if (local156 < 0) {
						local156 += Static110.anInt2934;
					}
					if (Static110.anInt2934 < local156) {
						local156 -= Static110.anInt2934;
					}
					while (true) {
						@Pc(176) int[] local176 = local83[local142];
						if (local176[0] <= local156 && local156 <= local176[1]) {
							if (local142 != local30) {
								@Pc(210) int local210 = local24 + local28;
								if (local210 < 0) {
									local210 += Static110.anInt2934;
								}
								if (Static110.anInt2934 < local210) {
									local210 -= Static110.anInt2934;
								}
								for (@Pc(228) int local228 = 1; local228 <= local144; local228++) {
									@Pc(238) int[] local238 = local83[(local228 + local30) % local38];
									local152 = Math.max(local152, local238[2]);
								}
								for (@Pc(250) int local250 = 0; local250 <= local144; local250++) {
									@Pc(261) int[] local261 = local83[(local30 + local250) % local38];
									@Pc(265) int local265 = local261[2];
									if (local152 != local265) {
										@Pc(276) int local276 = local261[0];
										@Pc(280) int local280 = local261[1];
										@Pc(287) int local287;
										@Pc(291) int local291;
										if (local156 > local210) {
											local287 = Math.max(local210, local276);
											local291 = Math.min(local156, local280);
										} else if (local276 == 0) {
											local287 = 0;
											local291 = Math.min(local156, local280);
										} else {
											local287 = Math.max(local210, local276);
											local291 = Static110.anInt2934;
										}
										this.method3983(local20, local265, local287 + local22, local152 + -local265, local104, local291 - local287);
									}
								}
							}
							local30 = local142;
							break;
						}
						local144++;
						local142++;
						if (local142 >= local38) {
							local142 = 0;
						}
					}
				}
				if (local124 + local152 <= Static166.anInt3882) {
					local32 = false;
				} else {
					local124 = Static166.anInt3882 - local152;
				}
				@Pc(394) int[] local394;
				if (local128 == Static110.anInt2934) {
					this.method3983(local20, local152, local28 + local26, local124, local104, local114);
					if (local32) {
						return local11;
					}
					local34 = false;
					local32 = true;
					local22 = local26;
					local30 = 0;
					@Pc(387) int[][] local387 = local83;
					local83 = local87;
					local394 = local87[local36++];
					local394[1] = local128;
					local394[2] = local124 + local152;
					local38 = local36;
					local36 = 0;
					local87 = local387;
					local394[0] = local28;
					local26 = Static205.method3438(Static110.anInt2934, local104);
					local28 = 0;
					local24 = local26 - local22;
					local144 = local24;
					if (local24 < 0) {
						local144 = local24 + Static110.anInt2934;
					}
					if (local144 > Static110.anInt2934) {
						local144 -= Static110.anInt2934;
					}
					while (true) {
						@Pc(444) int[] local444 = local83[local30];
						if (local444[0] <= local144 && local144 <= local444[1]) {
							break;
						}
						local30++;
						if (local30 >= local38) {
							local30 = 0;
						}
					}
				} else {
					local394 = local87[local36++];
					local394[2] = local124 + local152;
					local394[0] = local28;
					local394[1] = local128;
					this.method3983(local20, local152, local26 + local28, local124, local104, local114);
					local28 = local128;
				}
			}
		}
	}
}
