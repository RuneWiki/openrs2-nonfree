import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class4_Sub3_Sub21 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
	private int anInt2336;

	@OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
	private int anInt2327;

	@OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
	private int anInt2330;

	@OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
	private int anInt2332;

	@OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
	private int anInt2334;

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
	private int anInt2326;

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "I")
	private int anInt2335;

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
	private int anInt2329;

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "I")
	private int anInt2331;

	@OriginalMember(owner = "client!ka", name = "kb", descriptor = "I")
	private int anInt2339;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass64_41.method2211(arg0);
		if (!super.aClass64_41.aBoolean127) {
			return local7;
		}
		@Pc(17) int local17 = 0;
		@Pc(22) int[][] local22 = super.aClass64_41.method2208();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) boolean local30 = true;
		@Pc(32) boolean local32 = true;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static134.anInt3188 * this.anInt2331 >> 12;
		@Pc(52) int local52 = this.anInt2329 * Static134.anInt3188 >> 12;
		@Pc(59) int local59 = this.anInt2334 * Static61.anInt1639 >> 12;
		@Pc(66) int local66 = Static61.anInt1639 * this.anInt2326 >> 12;
		if (local66 <= 1) {
			return local22[arg0];
		}
		this.anInt2336 = this.anInt2339 * (Static134.anInt3188 / 8) >> 12;
		@Pc(91) int local91 = Static134.anInt3188 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt2332);
		while (true) {
			while (true) {
				@Pc(116) int local116 = local45 + Static38.method679(local52 - local45, local106);
				@Pc(125) int local125 = Static38.method679(local66 - local59, local106) + local59;
				@Pc(130) int local130 = local28 + local116;
				if (local130 > Static134.anInt3188) {
					local116 = Static134.anInt3188 - local28;
					local130 = Static134.anInt3188;
				}
				@Pc(152) int local152;
				@Pc(175) int local175;
				if (local32) {
					local152 = 0;
				} else {
					@Pc(144) int local144 = local36;
					@Pc(148) int[] local148 = local99[local36];
					local152 = local148[2];
					@Pc(156) int local156 = local130 + local24;
					if (local156 < 0) {
						local156 += Static134.anInt3188;
					}
					if (local156 > Static134.anInt3188) {
						local156 -= Static134.anInt3188;
					}
					local175 = 0;
					while (true) {
						@Pc(179) int[] local179 = local99[local144];
						if (local156 >= local179[0] && local179[1] >= local156) {
							if (local144 != local36) {
								@Pc(213) int local213 = local28 + local24;
								if (local213 < 0) {
									local213 += Static134.anInt3188;
								}
								if (local213 > Static134.anInt3188) {
									local213 -= Static134.anInt3188;
								}
								for (@Pc(232) int local232 = 1; local232 <= local175; local232++) {
									@Pc(242) int[] local242 = local99[(local232 + local36) % local38];
									local152 = Math.max(local152, local242[2]);
								}
								for (@Pc(254) int local254 = 0; local254 <= local175; local254++) {
									@Pc(264) int[] local264 = local99[(local36 + local254) % local38];
									@Pc(268) int local268 = local264[2];
									if (local268 != local152) {
										@Pc(275) int local275 = local264[0];
										@Pc(279) int local279 = local264[1];
										@Pc(289) int local289;
										@Pc(293) int local293;
										if (local156 > local213) {
											local289 = Math.max(local213, local275);
											local293 = Math.min(local156, local279);
										} else if (local275 == 0) {
											local289 = 0;
											local293 = Math.min(local156, local279);
										} else {
											local289 = Math.max(local213, local275);
											local293 = Static134.anInt3188;
										}
										this.method1798(local289 + local26, -local268 + local152, local22, local268, local106, local293 - local289);
									}
								}
							}
							local36 = local144;
							break;
						}
						@Pc(192) int local192 = ~local38;
						local144++;
						if (local192 >= ~local144) {
							local144 = 0;
						}
						local175++;
					}
				}
				if (local125 + local152 > Static61.anInt1639) {
					local125 = Static61.anInt1639 - local152;
				} else {
					local30 = false;
				}
				@Pc(363) int[] local363;
				if (local130 == Static134.anInt3188) {
					this.method1798(local28 + local17, local125, local22, local152, local106, local116);
					if (local30) {
						return local7;
					}
					local36 = 0;
					local363 = local95[local34++];
					local38 = local34;
					@Pc(417) int[][] local417 = local99;
					local34 = 0;
					local99 = local95;
					local363[2] = local125 + local152;
					local30 = true;
					local32 = false;
					local363[0] = local28;
					local95 = local417;
					local28 = 0;
					local26 = local17;
					local363[1] = local130;
					local17 = Static38.method679(Static134.anInt3188, local106);
					local24 = local17 - local26;
					local175 = local24;
					if (local24 < 0) {
						local175 = local24 + Static134.anInt3188;
					}
					if (Static134.anInt3188 < local175) {
						local175 -= Static134.anInt3188;
					}
					while (true) {
						@Pc(477) int[] local477 = local99[local36];
						if (local175 >= local477[0] && local477[1] >= local175) {
							break;
						}
						local36++;
						if (local36 >= local38) {
							local36 = 0;
						}
					}
				} else {
					local363 = local95[local34++];
					local363[1] = local130;
					local363[2] = local152 + local125;
					local363[0] = local28;
					this.method1798(local17 + local28, local125, local22, local152, local106, local116);
					local28 = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[[IILjava/util/Random;BI)V")
	private void method1798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt2330 > 0 ? 4096 - Static38.method679(this.anInt2330, arg4) : 4096;
		@Pc(30) int local30 = this.anInt2336 * this.anInt2335 >> 12;
		@Pc(45) int local45 = this.anInt2336 - (local30 <= 0 ? 0 : Static38.method679(local30, arg4));
		if (arg0 >= Static134.anInt3188) {
			arg0 -= Static134.anInt3188;
		}
		@Pc(70) int local70;
		@Pc(66) int local66;
		if (local45 > 0) {
			if (arg1 <= 0 || arg5 <= 0) {
				return;
			}
			local66 = arg1 / 2;
			local70 = arg5 / 2;
			@Pc(81) int local81 = local45 > local70 ? local70 : local45;
			@Pc(88) int local88 = arg5 - local81 * 2;
			@Pc(93) int local93 = arg0 + local81;
			@Pc(104) int local104 = local66 < local45 ? local66 : local45;
			for (@Pc(106) int local106 = 0; local106 < arg1; local106++) {
				@Pc(114) int[] local114 = arg2[arg3 + local106];
				@Pc(127) int local127;
				@Pc(132) int local132;
				@Pc(140) int local140;
				if (local106 < local104) {
					local127 = local22 * local106 / local104;
					if (this.anInt2327 == 0) {
						for (local132 = 0; local132 < local81; local132++) {
							local140 = local22 * local132 / local81;
							local114[arg0 + local132 & Static2.anInt80] = local114[Static2.anInt80 & arg0 + arg5 - local132 - 1] = local140 * local127 >> 12;
						}
					} else {
						for (local132 = 0; local132 < local81; local132++) {
							local140 = local132 * local22 / local81;
							local114[Static2.anInt80 & arg0 + local132] = local114[Static2.anInt80 & arg0 + arg5 - local132 - 1] = local127 <= local140 ? local127 : local140;
						}
					}
					if (Static134.anInt3188 < local88 + local93) {
						local132 = Static134.anInt3188 - local93;
						Static189.method189(local114, local93, local132, local127);
						Static189.method189(local114, 0, local88 - local132, local127);
					} else {
						Static189.method189(local114, local93, local88, local127);
					}
				} else {
					local127 = arg1 - local106 - 1;
					if (local127 < local104) {
						local132 = local127 * local22 / local104;
						@Pc(279) int local279;
						if (this.anInt2327 == 0) {
							for (local140 = 0; local140 < local81; local140++) {
								local279 = local140 * local22 / local81;
								local114[Static2.anInt80 & local140 + arg0] = local114[Static2.anInt80 & arg5 + arg0 - local140 - 1] = local132 * local279 >> 12;
							}
						} else {
							for (local140 = 0; local140 < local81; local140++) {
								local279 = local22 * local140 / local81;
								local114[arg0 + local140 & Static2.anInt80] = local114[arg0 + arg5 - local140 - 1 & Static2.anInt80] = local279 < local132 ? local279 : local132;
							}
						}
						if (local88 + local93 > Static134.anInt3188) {
							local140 = Static134.anInt3188 - local93;
							Static189.method189(local114, local93, local140, local132);
							Static189.method189(local114, 0, local88 - local140, local132);
						} else {
							Static189.method189(local114, local93, local88, local132);
						}
					} else {
						for (local132 = 0; local132 < local81; local132++) {
							local114[arg0 + local132 & Static2.anInt80] = local114[Static2.anInt80 & arg5 + arg0 - local132 - 1] = local22 * local132 / local81;
						}
						if (Static134.anInt3188 < local88 + local93) {
							local140 = Static134.anInt3188 - local93;
							Static189.method189(local114, local93, local140, local22);
							Static189.method189(local114, 0, local88 - local140, local22);
						} else {
							Static189.method189(local114, local93, local88, local22);
						}
					}
				}
			}
		} else if (arg0 + arg5 > Static134.anInt3188) {
			local70 = Static134.anInt3188 - arg0;
			for (local66 = 0; local66 < arg1; local66++) {
				@Pc(496) int[] local496 = arg2[arg3 + local66];
				Static189.method189(local496, arg0, local70, local22);
				Static189.method189(local496, 0, arg5 - local70, local22);
			}
		} else {
			for (local70 = 0; local70 < arg1; local70++) {
				Static189.method189(arg2[arg3 + local70], arg0, arg5, local22);
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2332 = arg1.method1253();
		} else if (arg0 == 1) {
			this.anInt2331 = arg1.method1252();
		} else if (arg0 == 2) {
			this.anInt2329 = arg1.method1252();
		} else if (arg0 == 3) {
			this.anInt2334 = arg1.method1252();
		} else if (arg0 == 4) {
			this.anInt2326 = arg1.method1252();
		} else if (arg0 == 5) {
			this.anInt2339 = arg1.method1252();
		} else if (arg0 == 6) {
			this.anInt2327 = arg1.method1253();
		} else if (arg0 == 7) {
			this.anInt2335 = arg1.method1252();
		} else if (arg0 == 8) {
			this.anInt2330 = arg1.method1252();
		}
	}
}
