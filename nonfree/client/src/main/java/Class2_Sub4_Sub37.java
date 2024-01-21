import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class2_Sub4_Sub37 extends Class2_Sub4 {

	@OriginalMember(owner = "client!vh", name = "gb", descriptor = "I")
	private int anInt4273;

	@OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
	private int anInt4261 = 819;

	@OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
	private int anInt4264 = 409;

	@OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
	private int anInt4265 = 1024;

	@OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
	private int anInt4266 = 1024;

	@OriginalMember(owner = "client!vh", name = "cb", descriptor = "I")
	private int anInt4269 = 2048;

	@OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
	private int anInt4262 = 1024;

	@OriginalMember(owner = "client!vh", name = "ib", descriptor = "I")
	private int anInt4275 = 0;

	@OriginalMember(owner = "client!vh", name = "ab", descriptor = "I")
	private int anInt4267 = 1024;

	@OriginalMember(owner = "client!vh", name = "eb", descriptor = "I")
	private int anInt4271 = 0;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[[IZIILjava/util/Random;I)V")
	private void method2994(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(23) int local23 = this.anInt4262 > 0 ? 4096 - Static120.method1889(arg4, this.anInt4262) : 4096;
		@Pc(31) int local31 = this.anInt4273 * this.anInt4266 >> 12;
		@Pc(46) int local46 = this.anInt4273 - (local31 > 0 ? Static120.method1889(arg4, local31) : 0);
		if (arg3 >= Static118.anInt2608) {
			arg3 -= Static118.anInt2608;
		}
		@Pc(69) int local69;
		@Pc(91) int local91;
		if (local46 <= 0) {
			if (arg3 + arg5 <= Static118.anInt2608) {
				for (local69 = 0; local69 < arg2; local69++) {
					Static220.method1004(arg1[local69 + arg0], arg3, arg5, local23);
				}
			} else {
				local69 = Static118.anInt2608 - arg3;
				for (local91 = 0; local91 < arg2; local91++) {
					@Pc(99) int[] local99 = arg1[arg0 + local91];
					Static220.method1004(local99, arg3, local69, local23);
					Static220.method1004(local99, 0, arg5 - local69, local23);
				}
			}
		} else if (arg2 > 0 && arg5 > 0) {
			local69 = arg5 / 2;
			local91 = arg2 / 2;
			@Pc(148) int local148 = local69 >= local46 ? local46 : local69;
			@Pc(159) int local159 = local46 <= local91 ? local46 : local91;
			@Pc(164) int local164 = arg3 + local148;
			@Pc(171) int local171 = arg5 - local148 * 2;
			for (@Pc(173) int local173 = 0; local173 < arg2; local173++) {
				@Pc(182) int[] local182 = arg1[local173 + arg0];
				@Pc(195) int local195;
				@Pc(200) int local200;
				@Pc(208) int local208;
				if (local159 > local173) {
					local195 = local173 * local23 / local159;
					if (this.anInt4271 == 0) {
						for (local200 = 0; local200 < local148; local200++) {
							local208 = local200 * local23 / local148;
							local182[local200 + arg3 & Static82.anInt1734] = local182[Static82.anInt1734 & arg5 + arg3 - local200 - 1] = local208 * local195 >> 12;
						}
					} else {
						for (local200 = 0; local200 < local148; local200++) {
							local208 = local23 * local200 / local148;
							local182[arg3 + local200 & Static82.anInt1734] = local182[arg5 + arg3 - local200 - 1 & Static82.anInt1734] = local208 >= local195 ? local195 : local208;
						}
					}
					if (Static118.anInt2608 < local164 + local171) {
						local200 = Static118.anInt2608 - local164;
						Static220.method1004(local182, local164, local200, local195);
						Static220.method1004(local182, 0, local171 - local200, local195);
					} else {
						Static220.method1004(local182, local164, local171, local195);
					}
				} else {
					local195 = arg2 - local173 - 1;
					if (local159 > local195) {
						local200 = local195 * local23 / local159;
						@Pc(357) int local357;
						if (this.anInt4271 == 0) {
							for (local208 = 0; local208 < local148; local208++) {
								local357 = local23 * local208 / local148;
								local182[local208 + arg3 & Static82.anInt1734] = local182[arg3 + arg5 - local208 - 1 & Static82.anInt1734] = local200 * local357 >> 12;
							}
						} else {
							for (local208 = 0; local208 < local148; local208++) {
								local357 = local23 * local208 / local148;
								local182[local208 + arg3 & Static82.anInt1734] = local182[arg3 + arg5 - local208 - 1 & Static82.anInt1734] = local357 < local200 ? local357 : local200;
							}
						}
						if (local164 + local171 <= Static118.anInt2608) {
							Static220.method1004(local182, local164, local171, local200);
						} else {
							local208 = Static118.anInt2608 - local164;
							Static220.method1004(local182, local164, local208, local200);
							Static220.method1004(local182, 0, local171 - local208, local200);
						}
					} else {
						for (local200 = 0; local200 < local148; local200++) {
							local182[Static82.anInt1734 & arg3 + local200] = local182[Static82.anInt1734 & arg5 + arg3 - local200 - 1] = local23 * local200 / local148;
						}
						if (local171 + local164 <= Static118.anInt2608) {
							Static220.method1004(local182, local164, local171, local23);
						} else {
							local208 = Static118.anInt2608 - local164;
							Static220.method1004(local182, local164, local208, local23);
							Static220.method1004(local182, 0, local171 - local208, local23);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4275 = arg1.method1534();
		} else if (arg0 == 1) {
			this.anInt4265 = arg1.method1557();
		} else if (arg0 == 2) {
			this.anInt4269 = arg1.method1557();
		} else if (arg0 == 3) {
			this.anInt4264 = arg1.method1557();
		} else if (arg0 == 4) {
			this.anInt4261 = arg1.method1557();
		} else if (arg0 == 5) {
			this.anInt4267 = arg1.method1557();
		} else if (arg0 == 6) {
			this.anInt4271 = arg1.method1534();
		} else if (arg0 == 7) {
			this.anInt4266 = arg1.method1557();
		} else if (arg0 == 8) {
			this.anInt4262 = arg1.method1557();
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (!super.aClass78_41.aBoolean144) {
			return local11;
		}
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) boolean local23 = true;
		@Pc(28) int[][] local28 = super.aClass78_41.method2315();
		@Pc(30) boolean local30 = true;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(43) int local43 = this.anInt4269 * Static118.anInt2608 >> 12;
		@Pc(45) int local45 = 0;
		@Pc(52) int local52 = Static118.anInt2608 * this.anInt4265 >> 12;
		@Pc(59) int local59 = Static38.anInt3056 * this.anInt4261 >> 12;
		@Pc(66) int local66 = Static38.anInt3056 * this.anInt4264 >> 12;
		if (local59 <= 1) {
			return local28[arg0];
		}
		this.anInt4273 = this.anInt4267 * (Static118.anInt2608 / 8) >> 12;
		@Pc(91) int local91 = Static118.anInt2608 / local52 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt4275);
		while (true) {
			while (true) {
				@Pc(116) int local116 = local52 + Static120.method1889(local106, local43 - local52);
				@Pc(125) int local125 = Static120.method1889(local106, local59 - local66) + local66;
				@Pc(129) int local129 = local19 + local116;
				if (local129 > Static118.anInt2608) {
					local129 = Static118.anInt2608;
					local116 = Static118.anInt2608 - local19;
				}
				@Pc(147) int local147;
				@Pc(170) int local170;
				if (local23) {
					local147 = 0;
				} else {
					@Pc(151) int local151 = local36;
					@Pc(155) int local155 = local21 + local129;
					if (local155 < 0) {
						local155 += Static118.anInt2608;
					}
					@Pc(168) int[] local168 = local99[local36];
					local170 = 0;
					local147 = local168[2];
					if (Static118.anInt2608 < local155) {
						local155 -= Static118.anInt2608;
					}
					while (true) {
						@Pc(189) int[] local189 = local99[local151];
						if (local189[0] <= local155 && local155 <= local189[1]) {
							if (local151 != local36) {
								@Pc(228) int local228 = local19 + local21;
								if (local228 < 0) {
									local228 += Static118.anInt2608;
								}
								if (Static118.anInt2608 < local228) {
									local228 -= Static118.anInt2608;
								}
								for (@Pc(247) int local247 = 1; local247 <= local170; local247++) {
									@Pc(257) int[] local257 = local99[(local247 + local36) % local34];
									local147 = Math.max(local147, local257[2]);
								}
								for (@Pc(269) int local269 = 0; local269 <= local170; local269++) {
									@Pc(279) int[] local279 = local99[(local36 + local269) % local34];
									@Pc(283) int local283 = local279[2];
									if (local147 != local283) {
										@Pc(294) int local294 = local279[0];
										@Pc(298) int local298 = local279[1];
										@Pc(309) int local309;
										@Pc(313) int local313;
										if (local155 > local228) {
											local309 = Math.max(local228, local294);
											local313 = Math.min(local155, local298);
										} else if (local294 == 0) {
											local309 = 0;
											local313 = Math.min(local155, local298);
										} else {
											local309 = Math.max(local228, local294);
											local313 = Static118.anInt2608;
										}
										this.method2994(local283, local28, local147 - local283, local32 + local309, local106, local313 - local309);
									}
								}
							}
							local36 = local151;
							break;
						}
						local170++;
						local151++;
						if (local151 >= local34) {
							local151 = 0;
						}
					}
				}
				if (local125 + local147 <= Static38.anInt3056) {
					local30 = false;
				} else {
					local125 = Static38.anInt3056 - local147;
				}
				@Pc(405) int[] local405;
				if (local129 == Static118.anInt2608) {
					this.method2994(local147, local28, local125, local17 + local19, local106, local116);
					if (local30) {
						return local11;
					}
					local23 = false;
					local32 = local17;
					local30 = true;
					local36 = 0;
					@Pc(398) int[][] local398 = local99;
					local99 = local95;
					local405 = local95[local45++];
					local95 = local398;
					local405[0] = local19;
					local34 = local45;
					local405[1] = local129;
					local405[2] = local125 + local147;
					local45 = 0;
					local19 = 0;
					local17 = Static120.method1889(local106, Static118.anInt2608);
					local21 = local17 - local32;
					local170 = local21;
					if (local21 < 0) {
						local170 = local21 + Static118.anInt2608;
					}
					if (Static118.anInt2608 < local170) {
						local170 -= Static118.anInt2608;
					}
					while (true) {
						@Pc(456) int[] local456 = local99[local36];
						if (local456[0] <= local170 && local456[1] >= local170) {
							break;
						}
						@Pc(477) int local477 = ~local34;
						local36++;
						if (local477 >= ~local36) {
							local36 = 0;
						}
					}
				} else {
					local405 = local95[local45++];
					local405[2] = local147 + local125;
					local405[1] = local129;
					local405[0] = local19;
					this.method2994(local147, local28, local125, local17 + local19, local106, local116);
					local19 = local129;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
	}
}
