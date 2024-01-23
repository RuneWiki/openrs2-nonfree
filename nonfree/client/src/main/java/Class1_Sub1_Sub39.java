import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uo", name = "S", descriptor = "I")
	private int anInt5780;

	@OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
	private int anInt5774 = 1024;

	@OriginalMember(owner = "client!uo", name = "V", descriptor = "I")
	private int anInt5783 = 1024;

	@OriginalMember(owner = "client!uo", name = "Z", descriptor = "I")
	private int anInt5786 = 0;

	@OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
	private int anInt5777 = 409;

	@OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
	private int anInt5782 = 2048;

	@OriginalMember(owner = "client!uo", name = "Y", descriptor = "I")
	private int anInt5785 = 819;

	@OriginalMember(owner = "client!uo", name = "ab", descriptor = "I")
	private int anInt5787 = 1024;

	@OriginalMember(owner = "client!uo", name = "bb", descriptor = "I")
	private int anInt5788 = 0;

	@OriginalMember(owner = "client!uo", name = "T", descriptor = "I")
	private int anInt5781 = 1024;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5788 = arg0.method2199();
		} else if (arg1 == 1) {
			this.anInt5783 = arg0.method2244();
		} else if (arg1 == 2) {
			this.anInt5782 = arg0.method2244();
		} else if (arg1 == 3) {
			this.anInt5777 = arg0.method2244();
		} else if (arg1 == 4) {
			this.anInt5785 = arg0.method2244();
		} else if (arg1 == 5) {
			this.anInt5781 = arg0.method2244();
		} else if (arg1 == 6) {
			this.anInt5786 = arg0.method2199();
		} else if (arg1 == 7) {
			this.anInt5774 = arg0.method2244();
		} else if (arg1 == 8) {
			this.anInt5787 = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIB[[ILjava/util/Random;II)V")
	private void method4421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt5787 <= 0 ? 4096 : 4096 - Static207.method3275(this.anInt5787, arg3);
		@Pc(30) int local30 = this.anInt5780 * this.anInt5774 >> 12;
		@Pc(48) int local48 = this.anInt5780 - (local30 > 0 ? Static207.method3275(local30, arg3) : 0);
		if (Static62.anInt1350 <= arg1) {
			arg1 -= Static62.anInt1350;
		}
		@Pc(87) int local87;
		@Pc(115) int local115;
		if (local48 > 0) {
			if (arg4 <= 0 || arg0 <= 0) {
				return;
			}
			local115 = arg4 / 2;
			local87 = arg0 / 2;
			@Pc(169) int local169 = local115 < local48 ? local115 : local48;
			@Pc(180) int local180 = local87 >= local48 ? local48 : local87;
			@Pc(187) int local187 = arg0 - local180 * 2;
			@Pc(191) int local191 = arg1 + local180;
			for (@Pc(193) int local193 = 0; local193 < arg4; local193++) {
				@Pc(202) int[] local202 = arg2[arg5 + local193];
				@Pc(212) int local212;
				@Pc(220) int local220;
				@Pc(233) int local233;
				if (local169 <= local193) {
					local212 = arg4 - local193 - 1;
					if (local169 > local212) {
						local220 = local212 * local22 / local169;
						@Pc(383) int local383;
						if (this.anInt5786 == 0) {
							for (local233 = 0; local233 < local180; local233++) {
								local383 = local22 * local233 / local180;
								local202[local233 + arg1 & Static302.anInt6003] = local202[Static302.anInt6003 & arg0 + arg1 - local233 - 1] = local383 * local220 >> 12;
							}
						} else {
							for (local233 = 0; local233 < local180; local233++) {
								local383 = local233 * local22 / local180;
								local202[Static302.anInt6003 & local233 + arg1] = local202[Static302.anInt6003 & arg1 + arg0 - local233 - 1] = local383 < local220 ? local383 : local220;
							}
						}
						if (Static62.anInt1350 < local187 + local191) {
							local233 = Static62.anInt1350 - local191;
							Static319.method1417(local202, local191, local233, local220);
							Static319.method1417(local202, 0, local187 - local233, local220);
						} else {
							Static319.method1417(local202, local191, local187, local220);
						}
					} else {
						for (local220 = 0; local220 < local180; local220++) {
							local202[local220 + arg1 & Static302.anInt6003] = local202[arg0 + arg1 - local220 - 1 & Static302.anInt6003] = local220 * local22 / local180;
						}
						if (local187 + local191 <= Static62.anInt1350) {
							Static319.method1417(local202, local191, local187, local22);
						} else {
							local220 = Static62.anInt1350 - local191;
							Static319.method1417(local202, local191, local220, local22);
							Static319.method1417(local202, 0, local187 - local220, local22);
						}
					}
				} else {
					local212 = local22 * local193 / local169;
					if (this.anInt5786 == 0) {
						for (local220 = 0; local220 < local180; local220++) {
							local233 = local22 * local220 / local180;
							local202[Static302.anInt6003 & arg1 + local220] = local202[arg1 + arg0 - local220 - 1 & Static302.anInt6003] = local212 * local233 >> 12;
						}
					} else {
						for (local220 = 0; local220 < local180; local220++) {
							local233 = local220 * local22 / local180;
							local202[local220 + arg1 & Static302.anInt6003] = local202[Static302.anInt6003 & arg1 + arg0 - local220 - 1] = local212 > local233 ? local233 : local212;
						}
					}
					if (local187 + local191 > Static62.anInt1350) {
						local220 = Static62.anInt1350 - local191;
						Static319.method1417(local202, local191, local220, local212);
						Static319.method1417(local202, 0, local187 - local220, local212);
					} else {
						Static319.method1417(local202, local191, local187, local212);
					}
				}
			}
		} else if (Static62.anInt1350 >= arg1 + arg0) {
			for (local87 = 0; local87 < arg4; local87++) {
				Static319.method1417(arg2[local87 + arg5], arg1, arg0, local22);
			}
		} else {
			local87 = Static62.anInt1350 - arg1;
			for (local115 = 0; local115 < arg4; local115++) {
				@Pc(129) int[] local129 = arg2[arg5 + local115];
				Static319.method1417(local129, arg1, local87, local22);
				Static319.method1417(local129, 0, arg0 - local87, local22);
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass194_41.method4738(arg0);
		if (!this.aClass194_41.aBoolean411) {
			return local11;
		}
		@Pc(21) int[][] local21 = this.aClass194_41.method4740();
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) boolean local31 = true;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) int local39 = 0;
		@Pc(46) int local46 = Static62.anInt1350 * this.anInt5783 >> 12;
		@Pc(53) int local53 = this.anInt5777 * Static265.anInt5306 >> 12;
		@Pc(60) int local60 = this.anInt5785 * Static265.anInt5306 >> 12;
		@Pc(67) int local67 = Static62.anInt1350 * this.anInt5782 >> 12;
		if (local60 <= 1) {
			return local21[arg0];
		}
		this.anInt5780 = Static62.anInt1350 / 8 * this.anInt5781 >> 12;
		@Pc(90) int local90 = Static62.anInt1350 / local46 + 1;
		@Pc(94) int[][] local94 = new int[local90][3];
		@Pc(98) int[][] local98 = new int[local90][3];
		@Pc(105) Random local105 = new Random((long) this.anInt5788);
		while (true) {
			while (true) {
				@Pc(116) int local116 = local46 + Static207.method3275(local67 - local46, local105);
				@Pc(128) int local128 = Static207.method3275(local60 - local53, local105) + local53;
				@Pc(133) int local133 = local33 + local116;
				if (Static62.anInt1350 < local133) {
					local133 = Static62.anInt1350;
					local116 = Static62.anInt1350 - local33;
				}
				@Pc(151) int local151;
				@Pc(189) int local189;
				if (local31) {
					local151 = 0;
				} else {
					@Pc(155) int local155 = local29;
					@Pc(159) int[] local159 = local94[local29];
					local151 = local159[2];
					@Pc(167) int local167 = local23 + local133;
					if (local167 < 0) {
						local167 += Static62.anInt1350;
					}
					if (Static62.anInt1350 < local167) {
						local167 -= Static62.anInt1350;
					}
					local189 = 0;
					while (true) {
						@Pc(193) int[] local193 = local94[local155];
						if (local193[0] <= local167 && local167 <= local193[1]) {
							if (local155 != local29) {
								@Pc(229) int local229 = local23 + local33;
								if (local229 < 0) {
									local229 += Static62.anInt1350;
								}
								if (Static62.anInt1350 < local229) {
									local229 -= Static62.anInt1350;
								}
								@Pc(249) int local249;
								@Pc(264) int[] local264;
								for (local249 = 1; local249 <= local189; local249++) {
									local264 = local94[(local249 + local29) % local35];
									local151 = Math.max(local151, local264[2]);
								}
								for (local249 = 0; local249 <= local189; local249++) {
									local264 = local94[(local29 + local249) % local35];
									@Pc(290) int local290 = local264[2];
									if (local290 != local151) {
										@Pc(301) int local301 = local264[0];
										@Pc(305) int local305 = local264[1];
										@Pc(315) int local315;
										@Pc(317) int local317;
										if (local229 < local167) {
											local315 = Math.max(local229, local301);
											local317 = Math.min(local167, local305);
										} else if (local301 == 0) {
											local315 = 0;
											local317 = Math.min(local167, local305);
										} else {
											local315 = Math.max(local229, local301);
											local317 = Static62.anInt1350;
										}
										this.method4421(local317 - local315, local27 + local315, local21, local105, local151 - local290, local290);
									}
								}
							}
							local29 = local155;
							break;
						}
						local189++;
						@Pc(213) int local213 = ~local35;
						local155++;
						if (local213 >= ~local155) {
							local155 = 0;
						}
					}
				}
				if (Static265.anInt5306 < local151 + local128) {
					local128 = Static265.anInt5306 - local151;
				} else {
					local37 = false;
				}
				@Pc(384) int[] local384;
				if (Static62.anInt1350 == local133) {
					this.method4421(local116, local25 + local33, local21, local105, local128, local151);
					if (local37) {
						return local11;
					}
					local31 = false;
					local29 = 0;
					local37 = true;
					@Pc(438) int[][] local438 = local94;
					local384 = local98[local39++];
					local384[0] = local33;
					local94 = local98;
					local35 = local39;
					local384[2] = local128 + local151;
					local27 = local25;
					local384[1] = local133;
					local98 = local438;
					local25 = Static207.method3275(Static62.anInt1350, local105);
					local33 = 0;
					local23 = local25 - local27;
					local39 = 0;
					local189 = local23;
					if (local23 < 0) {
						local189 = local23 + Static62.anInt1350;
					}
					if (Static62.anInt1350 < local189) {
						local189 -= Static62.anInt1350;
					}
					while (true) {
						@Pc(505) int[] local505 = local94[local29];
						if (local505[0] <= local189 && local505[1] >= local189) {
							break;
						}
						local29++;
						if (local29 >= local35) {
							local29 = 0;
						}
					}
				} else {
					local384 = local98[local39++];
					local384[1] = local133;
					local384[0] = local33;
					local384[2] = local151 + local128;
					this.method4421(local116, local33 + local25, local21, local105, local128, local151);
					local33 = local133;
				}
			}
		}
	}
}
