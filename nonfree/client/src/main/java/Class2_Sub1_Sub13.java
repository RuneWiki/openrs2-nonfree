import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hl", name = "V", descriptor = "I")
	private int anInt2176;

	@OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
	private int anInt2171 = 1024;

	@OriginalMember(owner = "client!hl", name = "S", descriptor = "I")
	private int anInt2173 = 2048;

	@OriginalMember(owner = "client!hl", name = "ab", descriptor = "I")
	private int anInt2179 = 819;

	@OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
	private int anInt2172 = 0;

	@OriginalMember(owner = "client!hl", name = "db", descriptor = "I")
	private int anInt2182 = 1024;

	@OriginalMember(owner = "client!hl", name = "bb", descriptor = "I")
	private int anInt2180 = 1024;

	@OriginalMember(owner = "client!hl", name = "ib", descriptor = "I")
	private int anInt2186 = 0;

	@OriginalMember(owner = "client!hl", name = "fb", descriptor = "I")
	private int anInt2184 = 1024;

	@OriginalMember(owner = "client!hl", name = "hb", descriptor = "I")
	private int anInt2185 = 409;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2172 = arg0.method4261();
		} else if (arg1 == 1) {
			this.anInt2184 = arg0.method4242();
		} else if (arg1 == 2) {
			this.anInt2173 = arg0.method4242();
		} else if (arg1 == 3) {
			this.anInt2185 = arg0.method4242();
		} else if (arg1 == 4) {
			this.anInt2179 = arg0.method4242();
		} else if (arg1 == 5) {
			this.anInt2171 = arg0.method4242();
		} else if (arg1 == 6) {
			this.anInt2186 = arg0.method4261();
		} else if (arg1 == 7) {
			this.anInt2182 = arg0.method4242();
		} else if (arg1 == 8) {
			this.anInt2180 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass136_41.method3410(arg0);
		if (!this.aClass136_41.aBoolean349) {
			return local11;
		}
		@Pc(21) int[][] local21 = this.aClass136_41.method3409();
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = true;
		@Pc(35) boolean local35 = true;
		@Pc(37) int local37 = 0;
		@Pc(44) int local44 = this.anInt2184 * Static114.anInt1359 >> 12;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = this.anInt2173 * Static114.anInt1359 >> 12;
		@Pc(60) int local60 = this.anInt2185 * Static199.anInt4143 >> 12;
		@Pc(67) int local67 = Static199.anInt4143 * this.anInt2179 >> 12;
		if (local67 <= 1) {
			return local21[arg0];
		}
		this.anInt2176 = Static114.anInt1359 / 8 * this.anInt2171 >> 12;
		@Pc(93) int local93 = Static114.anInt1359 / local44 + 1;
		@Pc(97) int[][] local97 = new int[local93][3];
		@Pc(101) int[][] local101 = new int[local93][3];
		@Pc(108) Random local108 = new Random((long) this.anInt2172);
		while (true) {
			while (true) {
				@Pc(119) int local119 = local44 + Static21.method459(local53 - local44, local108);
				@Pc(128) int local128 = Static21.method459(local67 - local60, local108) + local60;
				@Pc(133) int local133 = local29 + local119;
				if (Static114.anInt1359 < local133) {
					local133 = Static114.anInt1359;
					local119 = Static114.anInt1359 - local29;
				}
				@Pc(151) int local151;
				@Pc(157) int local157;
				if (local35) {
					local151 = 0;
				} else {
					@Pc(155) int local155 = local31;
					local157 = 0;
					@Pc(161) int[] local161 = local101[local31];
					@Pc(166) int local166 = local133 + local23;
					if (local166 < 0) {
						local166 += Static114.anInt1359;
					}
					if (local166 > Static114.anInt1359) {
						local166 -= Static114.anInt1359;
					}
					local151 = local161[2];
					while (true) {
						@Pc(192) int[] local192 = local101[local155];
						if (local166 >= local192[0] && local166 <= local192[1]) {
							if (local155 != local31) {
								@Pc(230) int local230 = local29 + local23;
								if (local230 < 0) {
									local230 += Static114.anInt1359;
								}
								if (Static114.anInt1359 < local230) {
									local230 -= Static114.anInt1359;
								}
								@Pc(249) int local249;
								@Pc(264) int[] local264;
								for (local249 = 1; local249 <= local157; local249++) {
									local264 = local101[(local31 + local249) % local37];
									local151 = Math.max(local151, local264[2]);
								}
								for (local249 = 0; local249 <= local157; local249++) {
									local264 = local101[(local31 + local249) % local37];
									@Pc(294) int local294 = local264[2];
									if (local294 != local151) {
										@Pc(305) int local305 = local264[0];
										@Pc(309) int local309 = local264[1];
										@Pc(320) int local320;
										@Pc(324) int local324;
										if (local166 > local230) {
											local320 = Math.max(local230, local305);
											local324 = Math.min(local166, local309);
										} else if (local305 == 0) {
											local324 = Math.min(local166, local309);
											local320 = 0;
										} else {
											local320 = Math.max(local230, local305);
											local324 = Static114.anInt1359;
										}
										this.method1887(local108, local27 + local320, local21, local294, local324 - local320, -local294 + local151);
									}
								}
							}
							local31 = local155;
							break;
						}
						local157++;
						local155++;
						if (local155 >= local37) {
							local155 = 0;
						}
					}
				}
				if (Static199.anInt4143 < local128 + local151) {
					local128 = Static199.anInt4143 - local151;
				} else {
					local33 = false;
				}
				@Pc(385) int[] local385;
				if (local133 == Static114.anInt1359) {
					this.method1887(local108, local25 + local29, local21, local151, local119, local128);
					if (local33) {
						return local11;
					}
					local33 = true;
					local27 = local25;
					local35 = false;
					local385 = local97[local46++];
					local385[0] = local29;
					local385[2] = local151 + local128;
					@Pc(455) int[][] local455 = local101;
					local101 = local97;
					local31 = 0;
					local37 = local46;
					local46 = 0;
					local29 = 0;
					local385[1] = local133;
					local25 = Static21.method459(Static114.anInt1359, local108);
					local23 = local25 - local27;
					local97 = local455;
					local157 = local23;
					if (local23 < 0) {
						local157 = local23 + Static114.anInt1359;
					}
					if (Static114.anInt1359 < local157) {
						local157 -= Static114.anInt1359;
					}
					while (true) {
						@Pc(504) int[] local504 = local101[local31];
						if (local157 >= local504[0] && local504[1] >= local157) {
							break;
						}
						local31++;
						if (local37 <= local31) {
							local31 = 0;
						}
					}
				} else {
					local385 = local97[local46++];
					local385[1] = local133;
					local385[2] = local151 + local128;
					local385[0] = local29;
					this.method1887(local108, local29 + local25, local21, local151, local119, local128);
					local29 = local133;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/util/Random;I[[IIII)V")
	private void method1887(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21 = this.anInt2180 <= 0 ? 4096 : 4096 - Static21.method459(this.anInt2180, arg0);
		@Pc(29) int local29 = this.anInt2176 * this.anInt2182 >> 12;
		@Pc(42) int local42 = this.anInt2176 - (local29 > 0 ? Static21.method459(local29, arg0) : 0);
		if (Static114.anInt1359 <= arg1) {
			arg1 -= Static114.anInt1359;
		}
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local42 > 0) {
			if (arg5 <= 0 || arg4 <= 0) {
				return;
			}
			local67 = arg4 / 2;
			local71 = arg5 / 2;
			@Pc(82) int local82 = local42 <= local67 ? local42 : local67;
			@Pc(93) int local93 = local71 >= local42 ? local42 : local71;
			@Pc(100) int local100 = arg4 - local82 * 2;
			@Pc(104) int local104 = local82 + arg1;
			for (@Pc(106) int local106 = 0; local106 < arg5; local106++) {
				@Pc(119) int[] local119 = arg2[arg3 + local106];
				@Pc(128) int local128;
				@Pc(133) int local133;
				@Pc(142) int local142;
				if (local93 > local106) {
					local128 = local106 * local21 / local93;
					if (this.anInt2186 == 0) {
						for (local133 = 0; local133 < local82; local133++) {
							local142 = local21 * local133 / local82;
							local119[Static129.anInt2676 & arg1 + local133] = local119[arg4 + arg1 - local133 - 1 & Static129.anInt2676] = local142 * local128 >> 12;
						}
					} else {
						for (local133 = 0; local133 < local82; local133++) {
							local142 = local133 * local21 / local82;
							local119[Static129.anInt2676 & local133 + arg1] = local119[arg4 + arg1 - local133 - 1 & Static129.anInt2676] = local128 <= local142 ? local128 : local142;
						}
					}
					if (local104 + local100 <= Static114.anInt1359) {
						Static301.method301(local119, local104, local100, local128);
					} else {
						local133 = Static114.anInt1359 - local104;
						Static301.method301(local119, local104, local133, local128);
						Static301.method301(local119, 0, local100 - local133, local128);
					}
				} else {
					local128 = arg5 - local106 - 1;
					if (local93 > local128) {
						local133 = local21 * local128 / local93;
						@Pc(282) int local282;
						if (this.anInt2186 == 0) {
							for (local142 = 0; local142 < local82; local142++) {
								local282 = local21 * local142 / local82;
								local119[Static129.anInt2676 & local142 + arg1] = local119[arg4 + arg1 - local142 - 1 & Static129.anInt2676] = local282 * local133 >> 12;
							}
						} else {
							for (local142 = 0; local142 < local82; local142++) {
								local282 = local21 * local142 / local82;
								local119[arg1 + local142 & Static129.anInt2676] = local119[Static129.anInt2676 & arg4 + arg1 - local142 - 1] = local133 <= local282 ? local133 : local282;
							}
						}
						if (Static114.anInt1359 >= local104 + local100) {
							Static301.method301(local119, local104, local100, local133);
						} else {
							local142 = Static114.anInt1359 - local104;
							Static301.method301(local119, local104, local142, local133);
							Static301.method301(local119, 0, local100 - local142, local133);
						}
					} else {
						for (local133 = 0; local133 < local82; local133++) {
							local119[local133 + arg1 & Static129.anInt2676] = local119[arg1 + arg4 - local133 - 1 & Static129.anInt2676] = local21 * local133 / local82;
						}
						if (local104 + local100 > Static114.anInt1359) {
							local133 = Static114.anInt1359 - local104;
							Static301.method301(local119, local104, local133, local21);
							Static301.method301(local119, 0, local100 - local133, local21);
						} else {
							Static301.method301(local119, local104, local100, local21);
						}
					}
				}
			}
		} else if (arg1 + arg4 <= Static114.anInt1359) {
			for (local67 = 0; local67 < arg5; local67++) {
				Static301.method301(arg2[arg3 + local67], arg1, arg4, local21);
			}
		} else {
			local67 = Static114.anInt1359 - arg1;
			for (local71 = 0; local71 < arg5; local71++) {
				@Pc(516) int[] local516 = arg2[local71 + arg3];
				Static301.method301(local516, arg1, local67, local21);
				Static301.method301(local516, 0, arg4 - local67, local21);
			}
		}
	}
}
