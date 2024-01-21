import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
	private int anInt2157;

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
	private int anInt2158;

	@OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
	private int anInt2163;

	@OriginalMember(owner = "client!hf", name = "hb", descriptor = "I")
	private int anInt2167;

	@OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
	private int anInt2165;

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
	private int anInt2159;

	@OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
	private int anInt2161;

	@OriginalMember(owner = "client!hf", name = "nb", descriptor = "I")
	private int anInt2171;

	@OriginalMember(owner = "client!hf", name = "fb", descriptor = "I")
	private int anInt2166;

	@OriginalMember(owner = "client!hf", name = "pb", descriptor = "I")
	private int anInt2173;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILjava/util/Random;II[[I)V")
	private void method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(22) int local22 = this.anInt2158 <= 0 ? 4096 : 4096 - Static152.method1616(this.anInt2158, arg2);
		@Pc(30) int local30 = this.anInt2163 * this.anInt2157 >> 12;
		@Pc(45) int local45 = this.anInt2157 - (local30 > 0 ? Static152.method1616(local30, arg2) : 0);
		if (Static22.anInt596 <= arg1) {
			arg1 -= Static22.anInt596;
		}
		@Pc(74) int local74;
		@Pc(76) int local76;
		if (local45 <= 0) {
			if (Static22.anInt596 < arg1 + arg3) {
				local74 = Static22.anInt596 - arg1;
				for (local76 = 0; local76 < arg0; local76++) {
					@Pc(85) int[] local85 = arg5[arg4 + local76];
					Static188.method2301(local85, arg1, local74, local22);
					Static188.method2301(local85, 0, arg3 - local74, local22);
				}
			} else {
				for (local74 = 0; local74 < arg0; local74++) {
					Static188.method2301(arg5[local74 + arg4], arg1, arg3, local22);
				}
			}
		} else if (arg0 > 0 && arg3 > 0) {
			local74 = arg3 / 2;
			local76 = arg0 / 2;
			@Pc(151) int local151 = local45 > local74 ? local74 : local45;
			@Pc(158) int local158 = local76 < local45 ? local76 : local45;
			@Pc(162) int local162 = arg1 + local151;
			@Pc(169) int local169 = arg3 - local151 * 2;
			for (@Pc(171) int local171 = 0; local171 < arg0; local171++) {
				@Pc(179) int[] local179 = arg5[arg4 + local171];
				@Pc(188) int local188;
				@Pc(193) int local193;
				@Pc(201) int local201;
				if (local158 > local171) {
					local188 = local22 * local171 / local158;
					if (this.anInt2166 == 0) {
						for (local193 = 0; local193 < local151; local193++) {
							local201 = local193 * local22 / local151;
							local179[arg1 + local193 & Static28.anInt833] = local179[Static28.anInt833 & arg1 + arg3 - local193 - 1] = local188 * local201 >> 12;
						}
					} else {
						for (local193 = 0; local193 < local151; local193++) {
							local201 = local22 * local193 / local151;
							local179[Static28.anInt833 & local193 + arg1] = local179[arg1 + arg3 - local193 - 1 & Static28.anInt833] = local188 > local201 ? local201 : local188;
						}
					}
					if (Static22.anInt596 >= local162 + local169) {
						Static188.method2301(local179, local162, local169, local188);
					} else {
						local193 = Static22.anInt596 - local162;
						Static188.method2301(local179, local162, local193, local188);
						Static188.method2301(local179, 0, local169 - local193, local188);
					}
				} else {
					local188 = arg0 - local171 - 1;
					if (local158 > local188) {
						local193 = local22 * local188 / local158;
						@Pc(341) int local341;
						if (this.anInt2166 == 0) {
							for (local201 = 0; local201 < local151; local201++) {
								local341 = local201 * local22 / local151;
								local179[arg1 + local201 & Static28.anInt833] = local179[Static28.anInt833 & arg1 + arg3 - local201 - 1] = local193 * local341 >> 12;
							}
						} else {
							for (local201 = 0; local201 < local151; local201++) {
								local341 = local201 * local22 / local151;
								local179[arg1 + local201 & Static28.anInt833] = local179[Static28.anInt833 & arg1 + arg3 - local201 - 1] = local341 >= local193 ? local193 : local341;
							}
						}
						if (Static22.anInt596 >= local169 + local162) {
							Static188.method2301(local179, local162, local169, local193);
						} else {
							local201 = Static22.anInt596 - local162;
							Static188.method2301(local179, local162, local201, local193);
							Static188.method2301(local179, 0, local169 - local201, local193);
						}
					} else {
						for (local193 = 0; local193 < local151; local193++) {
							local179[arg1 + local193 & Static28.anInt833] = local179[arg1 + arg3 - local193 - 1 & Static28.anInt833] = local193 * local22 / local151;
						}
						if (local162 + local169 > Static22.anInt596) {
							local201 = Static22.anInt596 - local162;
							Static188.method2301(local179, local162, local201, local22);
							Static188.method2301(local179, 0, local169 - local201, local22);
						} else {
							Static188.method2301(local179, local162, local169, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method3438(arg0);
		if (!super.aClass85_41.aBoolean177) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass85_41.method3436();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt2161 * Static22.anInt596 >> 12;
		@Pc(52) int local52 = Static22.anInt596 * this.anInt2165 >> 12;
		@Pc(59) int local59 = Static181.anInt4508 * this.anInt2159 >> 12;
		@Pc(66) int local66 = this.anInt2173 * Static181.anInt4508 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		@Pc(79) int local79 = Static22.anInt596 / local45 + 1;
		@Pc(83) int[][] local83 = new int[local79][3];
		this.anInt2157 = this.anInt2167 * (Static22.anInt596 / 8) >> 12;
		@Pc(100) Random local100 = new Random((long) this.anInt2171);
		@Pc(104) int[][] local104 = new int[local79][3];
		while (true) {
			while (true) {
				@Pc(114) int local114 = Static152.method1616(local52 - local45, local100) + local45;
				@Pc(123) int local123 = local59 + Static152.method1616(local66 - local59, local100);
				@Pc(127) int local127 = local114 + local26;
				if (Static22.anInt596 < local127) {
					local114 = Static22.anInt596 - local26;
					local127 = Static22.anInt596;
				}
				@Pc(168) int local168;
				@Pc(147) int local147;
				if (local32) {
					local168 = 0;
				} else {
					@Pc(145) int local145 = local28;
					local147 = 0;
					@Pc(151) int[] local151 = local104[local28];
					@Pc(155) int local155 = local24 + local127;
					if (local155 < 0) {
						local155 += Static22.anInt596;
					}
					local168 = local151[2];
					if (Static22.anInt596 < local155) {
						local155 -= Static22.anInt596;
					}
					while (true) {
						@Pc(183) int[] local183 = local104[local145];
						if (local155 >= local183[0] && local183[1] >= local155) {
							if (local145 != local28) {
								@Pc(217) int local217 = local24 + local26;
								if (local217 < 0) {
									local217 += Static22.anInt596;
								}
								if (local217 > Static22.anInt596) {
									local217 -= Static22.anInt596;
								}
								for (@Pc(239) int local239 = 1; local239 <= local147; local239++) {
									@Pc(249) int[] local249 = local104[(local239 + local28) % local36];
									local168 = Math.max(local168, local249[2]);
								}
								for (@Pc(261) int local261 = 0; local261 <= local147; local261++) {
									@Pc(271) int[] local271 = local104[(local261 + local28) % local36];
									@Pc(275) int local275 = local271[2];
									if (local168 != local275) {
										@Pc(282) int local282 = local271[0];
										@Pc(286) int local286 = local271[1];
										@Pc(304) int local304;
										@Pc(302) int local302;
										if (local155 > local217) {
											local304 = Math.max(local217, local282);
											local302 = Math.min(local155, local286);
										} else if (local282 == 0) {
											local302 = Math.min(local155, local286);
											local304 = 0;
										} else {
											local304 = Math.max(local217, local282);
											local302 = Static22.anInt596;
										}
										this.method1599(local168 - local275, local30 + local304, local100, local302 - local304, local275, local20);
									}
								}
							}
							local28 = local145;
							break;
						}
						@Pc(200) int local200 = ~local36;
						local145++;
						if (local200 >= ~local145) {
							local145 = 0;
						}
						local147++;
					}
				}
				if (local168 + local123 <= Static181.anInt4508) {
					local34 = false;
				} else {
					local123 = Static181.anInt4508 - local168;
				}
				@Pc(396) int[] local396;
				if (Static22.anInt596 == local127) {
					this.method1599(local123, local22 + local26, local100, local114, local168, local20);
					if (local34) {
						return local11;
					}
					local32 = false;
					local28 = 0;
					local396 = local83[local38++];
					local396[1] = local127;
					local396[0] = local26;
					local36 = local38;
					local30 = local22;
					local396[2] = local123 + local168;
					local26 = 0;
					local22 = Static152.method1616(Static22.anInt596, local100);
					local38 = 0;
					local34 = true;
					local24 = local22 - local30;
					@Pc(432) int[][] local432 = local104;
					local104 = local83;
					local147 = local24;
					if (local24 < 0) {
						local147 = local24 + Static22.anInt596;
					}
					local83 = local432;
					if (local147 > Static22.anInt596) {
						local147 -= Static22.anInt596;
					}
					while (true) {
						@Pc(462) int[] local462 = local104[local28];
						if (local147 >= local462[0] && local462[1] >= local147) {
							break;
						}
						local28++;
						if (local28 >= local36) {
							local28 = 0;
						}
					}
				} else {
					local396 = local83[local38++];
					local396[1] = local127;
					local396[2] = local168 + local123;
					local396[0] = local26;
					this.method1599(local123, local26 + local22, local100, local114, local168, local20);
					local26 = local127;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt2171 = arg1.method1234();
		} else if (arg0 == 1) {
			this.anInt2161 = arg1.method1280();
		} else if (arg0 == 2) {
			this.anInt2165 = arg1.method1280();
		} else if (arg0 == 3) {
			this.anInt2159 = arg1.method1280();
		} else if (arg0 == 4) {
			this.anInt2173 = arg1.method1280();
		} else if (arg0 == 5) {
			this.anInt2167 = arg1.method1280();
		} else if (arg0 == 6) {
			this.anInt2166 = arg1.method1234();
		} else if (arg0 == 7) {
			this.anInt2163 = arg1.method1280();
		} else if (arg0 == 8) {
			this.anInt2158 = arg1.method1280();
		}
	}
}
