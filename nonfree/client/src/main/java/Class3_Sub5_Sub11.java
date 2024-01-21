import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class3_Sub5_Sub11 extends Class3_Sub5 {

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
	private int anInt1513;

	@OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
	private int anInt1515;

	@OriginalMember(owner = "client!he", name = "hb", descriptor = "I")
	private int anInt1519;

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
	private int anInt1511;

	@OriginalMember(owner = "client!he", name = "fb", descriptor = "I")
	private int anInt1517;

	@OriginalMember(owner = "client!he", name = "X", descriptor = "I")
	private int anInt1510;

	@OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
	private int anInt1518;

	@OriginalMember(owner = "client!he", name = "kb", descriptor = "I")
	private int anInt1521;

	@OriginalMember(owner = "client!he", name = "pb", descriptor = "I")
	private int anInt1523;

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
	private int anInt1512;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II[[IILjava/util/Random;II)V")
	private void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt1523 > 0 ? 4096 - Static141.method2188(this.anInt1523, arg3) : 4096;
		@Pc(27) int local27 = this.anInt1517 * this.anInt1513 >> 12;
		@Pc(43) int local43 = this.anInt1513 - (local27 <= 0 ? 0 : Static141.method2188(local27, arg3));
		if (Static104.anInt2195 <= arg1) {
			arg1 -= Static104.anInt2195;
		}
		@Pc(71) int local71;
		@Pc(94) int local94;
		if (local43 <= 0) {
			if (Static104.anInt2195 >= arg4 + arg1) {
				for (local71 = 0; local71 < arg0; local71++) {
					Static200.method1180(arg2[local71 + arg5], arg1, arg4, local19);
				}
			} else {
				local71 = Static104.anInt2195 - arg1;
				for (local94 = 0; local94 < arg0; local94++) {
					@Pc(103) int[] local103 = arg2[arg5 + local94];
					Static200.method1180(local103, arg1, local71, local19);
					Static200.method1180(local103, 0, arg4 - local71, local19);
				}
			}
		} else if (arg0 > 0 && arg4 > 0) {
			local71 = arg4 / 2;
			local94 = arg0 / 2;
			@Pc(147) int local147 = local71 < local43 ? local71 : local43;
			@Pc(152) int local152 = arg1 + local147;
			@Pc(159) int local159 = local94 < local43 ? local94 : local43;
			@Pc(166) int local166 = arg4 - local147 * 2;
			for (@Pc(168) int local168 = 0; local168 < arg0; local168++) {
				@Pc(176) int[] local176 = arg2[local168 + arg5];
				@Pc(189) int local189;
				@Pc(194) int local194;
				@Pc(202) int local202;
				if (local159 > local168) {
					local189 = local19 * local168 / local159;
					if (this.anInt1512 == 0) {
						for (local194 = 0; local194 < local147; local194++) {
							local202 = local194 * local19 / local147;
							local176[arg1 + local194 & Static112.anInt2517] = local176[arg4 + arg1 - local194 - 1 & Static112.anInt2517] = local202 * local189 >> 12;
						}
					} else {
						for (local194 = 0; local194 < local147; local194++) {
							local202 = local19 * local194 / local147;
							local176[Static112.anInt2517 & arg1 + local194] = local176[arg1 + arg4 - local194 - 1 & Static112.anInt2517] = local189 > local202 ? local202 : local189;
						}
					}
					if (Static104.anInt2195 >= local152 + local166) {
						Static200.method1180(local176, local152, local166, local189);
					} else {
						local194 = Static104.anInt2195 - local152;
						Static200.method1180(local176, local152, local194, local189);
						Static200.method1180(local176, 0, local166 - local194, local189);
					}
				} else {
					local189 = arg0 - local168 - 1;
					if (local159 > local189) {
						local194 = local189 * local19 / local159;
						@Pc(342) int local342;
						if (this.anInt1512 == 0) {
							for (local202 = 0; local202 < local147; local202++) {
								local342 = local202 * local19 / local147;
								local176[Static112.anInt2517 & local202 + arg1] = local176[arg4 + arg1 - local202 - 1 & Static112.anInt2517] = local342 * local194 >> 12;
							}
						} else {
							for (local202 = 0; local202 < local147; local202++) {
								local342 = local19 * local202 / local147;
								local176[Static112.anInt2517 & arg1 + local202] = local176[arg4 + arg1 - local202 - 1 & Static112.anInt2517] = local342 >= local194 ? local194 : local342;
							}
						}
						if (Static104.anInt2195 >= local166 + local152) {
							Static200.method1180(local176, local152, local166, local194);
						} else {
							local202 = Static104.anInt2195 - local152;
							Static200.method1180(local176, local152, local202, local194);
							Static200.method1180(local176, 0, local166 - local202, local194);
						}
					} else {
						for (local194 = 0; local194 < local147; local194++) {
							local176[Static112.anInt2517 & local194 + arg1] = local176[Static112.anInt2517 & arg4 + arg1 - local194 - 1] = local194 * local19 / local147;
						}
						if (local152 + local166 > Static104.anInt2195) {
							local202 = Static104.anInt2195 - local152;
							Static200.method1180(local176, local152, local202, local19);
							Static200.method1180(local176, 0, local166 - local202, local19);
						} else {
							Static200.method1180(local176, local152, local166, local19);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt1521 = arg1.method2107();
		} else if (arg0 == 1) {
			this.anInt1515 = arg1.method2111();
		} else if (arg0 == 2) {
			this.anInt1519 = arg1.method2111();
		} else if (arg0 == 3) {
			this.anInt1510 = arg1.method2111();
		} else if (arg0 == 4) {
			this.anInt1511 = arg1.method2111();
		} else if (arg0 == 5) {
			this.anInt1518 = arg1.method2111();
		} else if (arg0 == 6) {
			this.anInt1512 = arg1.method2107();
		} else if (arg0 == 7) {
			this.anInt1517 = arg1.method2111();
		} else if (arg0 == 8) {
			this.anInt1523 = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (!super.aClass39_41.aBoolean66) {
			return local19;
		}
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(36) int[][] local36 = super.aClass39_41.method1115();
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49 = this.anInt1519 * Static104.anInt2195 >> 12;
		@Pc(56) int local56 = this.anInt1510 * Static88.anInt1834 >> 12;
		@Pc(63) int local63 = this.anInt1511 * Static88.anInt1834 >> 12;
		@Pc(65) int local65 = 0;
		@Pc(67) boolean local67 = true;
		@Pc(74) int local74 = Static104.anInt2195 * this.anInt1515 >> 12;
		if (local63 <= 1) {
			return local36[arg0];
		}
		@Pc(87) int local87 = Static104.anInt2195 / local74 + 1;
		this.anInt1513 = Static104.anInt2195 / 8 * this.anInt1518 >> 12;
		@Pc(101) int[][] local101 = new int[local87][3];
		@Pc(108) Random local108 = new Random((long) this.anInt1521);
		@Pc(112) int[][] local112 = new int[local87][3];
		while (true) {
			while (true) {
				@Pc(122) int local122 = local74 + Static141.method2188(local49 - local74, local108);
				@Pc(132) int local132 = Static141.method2188(local63 - local56, local108) + local56;
				@Pc(136) int local136 = local122 + local29;
				if (Static104.anInt2195 < local136) {
					local136 = Static104.anInt2195;
					local122 = Static104.anInt2195 - local29;
				}
				@Pc(163) int local163;
				@Pc(151) int local151;
				if (local40) {
					local163 = 0;
				} else {
					@Pc(149) int local149 = local38;
					local151 = 0;
					@Pc(155) int local155 = local27 + local136;
					@Pc(159) int[] local159 = local112[local38];
					local163 = local159[2];
					if (local155 < 0) {
						local155 += Static104.anInt2195;
					}
					if (Static104.anInt2195 < local155) {
						local155 -= Static104.anInt2195;
					}
					while (true) {
						@Pc(180) int[] local180 = local112[local149];
						if (local155 >= local180[0] && local155 <= local180[1]) {
							if (local38 != local149) {
								@Pc(214) int local214 = local27 + local29;
								if (local214 < 0) {
									local214 += Static104.anInt2195;
								}
								if (local214 > Static104.anInt2195) {
									local214 -= Static104.anInt2195;
								}
								for (@Pc(236) int local236 = 1; local236 <= local151; local236++) {
									@Pc(246) int[] local246 = local112[(local236 + local38) % local42];
									local163 = Math.max(local163, local246[2]);
								}
								for (@Pc(258) int local258 = 0; local258 <= local151; local258++) {
									@Pc(268) int[] local268 = local112[(local258 + local38) % local42];
									@Pc(272) int local272 = local268[2];
									if (local272 != local163) {
										@Pc(283) int local283 = local268[0];
										@Pc(287) int local287 = local268[1];
										@Pc(294) int local294;
										@Pc(298) int local298;
										if (local155 > local214) {
											local294 = Math.max(local214, local283);
											local298 = Math.min(local155, local287);
										} else if (local283 == 0) {
											local298 = Math.min(local155, local287);
											local294 = 0;
										} else {
											local294 = Math.max(local214, local283);
											local298 = Static104.anInt2195;
										}
										this.method1024(local163 - local272, local31 + local294, local36, local108, local298 - local294, local272);
									}
								}
							}
							local38 = local149;
							break;
						}
						local149++;
						if (local149 >= local42) {
							local149 = 0;
						}
						local151++;
					}
				}
				if (Static88.anInt1834 >= local132 + local163) {
					local67 = false;
				} else {
					local132 = Static88.anInt1834 - local163;
				}
				@Pc(394) int[] local394;
				if (local136 == Static104.anInt2195) {
					this.method1024(local132, local29 + local25, local36, local108, local122, local163);
					if (local67) {
						return local19;
					}
					local31 = local25;
					local40 = false;
					local38 = 0;
					local67 = true;
					@Pc(387) int[][] local387 = local112;
					local112 = local101;
					local394 = local101[local65++];
					local394[1] = local136;
					local42 = local65;
					local394[2] = local163 + local132;
					local65 = 0;
					local394[0] = local29;
					local101 = local387;
					local29 = 0;
					local25 = Static141.method2188(Static104.anInt2195, local108);
					local27 = local25 - local31;
					local151 = local27;
					if (local27 < 0) {
						local151 = local27 + Static104.anInt2195;
					}
					if (local151 > Static104.anInt2195) {
						local151 -= Static104.anInt2195;
					}
					while (true) {
						@Pc(449) int[] local449 = local112[local38];
						if (local151 >= local449[0] && local449[1] >= local151) {
							break;
						}
						local38++;
						if (local38 >= local42) {
							local38 = 0;
						}
					}
				} else {
					local394 = local101[local65++];
					local394[2] = local132 + local163;
					local394[0] = local29;
					local394[1] = local136;
					this.method1024(local132, local25 + local29, local36, local108, local122, local163);
					local29 = local136;
				}
			}
		}
	}
}
