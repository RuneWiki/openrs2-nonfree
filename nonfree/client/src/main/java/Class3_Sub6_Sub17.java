import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class3_Sub6_Sub17 extends Class3_Sub6 {

	@OriginalMember(owner = "client!iw", name = "P", descriptor = "I")
	private int anInt4194;

	@OriginalMember(owner = "client!iw", name = "C", descriptor = "I")
	private int anInt4183 = 819;

	@OriginalMember(owner = "client!iw", name = "I", descriptor = "I")
	private int anInt4187 = 409;

	@OriginalMember(owner = "client!iw", name = "D", descriptor = "I")
	private int anInt4184 = 1024;

	@OriginalMember(owner = "client!iw", name = "K", descriptor = "I")
	private int anInt4189 = 2048;

	@OriginalMember(owner = "client!iw", name = "J", descriptor = "I")
	private int anInt4188 = 1024;

	@OriginalMember(owner = "client!iw", name = "O", descriptor = "I")
	private int anInt4193 = 1024;

	@OriginalMember(owner = "client!iw", name = "H", descriptor = "I")
	private int anInt4186 = 1024;

	@OriginalMember(owner = "client!iw", name = "S", descriptor = "I")
	private int anInt4197 = 0;

	@OriginalMember(owner = "client!iw", name = "Q", descriptor = "I")
	private int anInt4195 = 0;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass213_41.method4803(arg0);
		if (!super.aClass213_41.aBoolean407) {
			return local16;
		}
		@Pc(25) int[][] local25 = super.aClass213_41.method4805();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = Static521.anInt8383 * this.anInt4193 >> 12;
		@Pc(57) int local57 = Static521.anInt8383 * this.anInt4189 >> 12;
		@Pc(64) int local64 = this.anInt4187 * Static522.anInt8394 >> 12;
		@Pc(71) int local71 = Static522.anInt8394 * this.anInt4183 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt4194 = Static521.anInt8383 / 8 * this.anInt4184 >> 12;
		@Pc(97) int local97 = Static521.anInt8383 / local50 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt4195);
		while (true) {
			while (true) {
				@Pc(123) int local123 = local50 + Static164.method2981(local112, local57 - local50);
				@Pc(132) int local132 = Static164.method2981(local112, local71 - local64) + local64;
				@Pc(136) int local136 = local123 + local33;
				if (Static521.anInt8383 < local136) {
					local136 = Static521.anInt8383;
					local123 = Static521.anInt8383 - local33;
				}
				@Pc(184) int local184;
				@Pc(160) int local160;
				if (local39) {
					local184 = 0;
				} else {
					@Pc(154) int local154 = local35;
					@Pc(158) int[] local158 = local105[local35];
					local160 = 0;
					@Pc(164) int local164 = local27 + local136;
					if (local164 < 0) {
						local164 += Static521.anInt8383;
					}
					if (local164 > Static521.anInt8383) {
						local164 -= Static521.anInt8383;
					}
					local184 = local158[2];
					while (true) {
						@Pc(188) int[] local188 = local105[local154];
						if (local164 >= local188[0] && local188[1] >= local164) {
							if (local35 != local154) {
								@Pc(226) int local226 = local33 + local27;
								if (local226 < 0) {
									local226 += Static521.anInt8383;
								}
								if (Static521.anInt8383 < local226) {
									local226 -= Static521.anInt8383;
								}
								for (@Pc(248) int local248 = 1; local248 <= local160; local248++) {
									@Pc(258) int[] local258 = local105[(local35 + local248) % local41];
									local184 = Math.max(local184, local258[2]);
								}
								for (@Pc(270) int local270 = 0; local270 <= local160; local270++) {
									@Pc(280) int[] local280 = local105[(local270 + local35) % local41];
									@Pc(284) int local284 = local280[2];
									if (local184 != local284) {
										@Pc(295) int local295 = local280[0];
										@Pc(299) int local299 = local280[1];
										@Pc(306) int local306;
										@Pc(310) int local310;
										if (local164 > local226) {
											local306 = Math.max(local226, local295);
											local310 = Math.min(local164, local299);
										} else if (local295 == 0) {
											local306 = 0;
											local310 = Math.min(local164, local299);
										} else {
											local306 = Math.max(local226, local295);
											local310 = Static521.anInt8383;
										}
										this.method3660(local284, local306 + local31, local112, local184 - local284, -local306 + local310, local25);
									}
								}
							}
							local35 = local154;
							break;
						}
						local160++;
						@Pc(206) int local206 = ~local41;
						local154++;
						if (local206 >= ~local154) {
							local154 = 0;
						}
					}
				}
				if (Static522.anInt8394 >= local184 + local132) {
					local37 = false;
				} else {
					local132 = Static522.anInt8394 - local184;
				}
				@Pc(406) int[] local406;
				if (Static521.anInt8383 == local136) {
					this.method3660(local184, local33 + local29, local112, local132, local123, local25);
					if (local37) {
						return local16;
					}
					local37 = true;
					local406 = local101[local43++];
					local406[0] = local33;
					local406[2] = local184 + local132;
					local406[1] = local136;
					@Pc(422) int[][] local422 = local105;
					local105 = local101;
					local101 = local422;
					local41 = local43;
					local31 = local29;
					local43 = 0;
					local29 = Static164.method2981(local112, Static521.anInt8383);
					local33 = 0;
					local27 = local29 - local31;
					local160 = local27;
					if (local27 < 0) {
						local160 = local27 + Static521.anInt8383;
					}
					local35 = 0;
					if (local160 > Static521.anInt8383) {
						local160 -= Static521.anInt8383;
					}
					local39 = false;
					while (true) {
						@Pc(474) int[] local474 = local105[local35];
						if (local474[0] <= local160 && local160 <= local474[1]) {
							break;
						}
						local35++;
						if (local35 >= local41) {
							local35 = 0;
						}
					}
				} else {
					local406 = local101[local43++];
					local406[2] = local184 + local132;
					local406[0] = local33;
					local406[1] = local136;
					this.method3660(local184, local33 + local29, local112, local132, local123, local25);
					local33 = local136;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4195 = arg0.method5175();
		} else if (arg1 == 1) {
			this.anInt4193 = arg0.method5198();
		} else if (arg1 == 2) {
			this.anInt4189 = arg0.method5198();
		} else if (arg1 == 3) {
			this.anInt4187 = arg0.method5198();
		} else if (arg1 == 4) {
			this.anInt4183 = arg0.method5198();
		} else if (arg1 == 5) {
			this.anInt4184 = arg0.method5198();
		} else if (arg1 == 6) {
			this.anInt4197 = arg0.method5175();
		} else if (arg1 == 7) {
			this.anInt4186 = arg0.method5198();
		} else if (arg1 == 8) {
			this.anInt4188 = arg0.method5198();
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIILjava/util/Random;II[[I)V")
	private void method3660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(29) int local29 = this.anInt4188 <= 0 ? 4096 : 4096 - Static164.method2981(arg2, this.anInt4188);
		@Pc(37) int local37 = this.anInt4194 * this.anInt4186 >> 12;
		@Pc(51) int local51 = this.anInt4194 - (local37 <= 0 ? 0 : Static164.method2981(arg2, local37));
		if (arg1 >= Static521.anInt8383) {
			arg1 -= Static521.anInt8383;
		}
		@Pc(76) int local76;
		@Pc(99) int local99;
		if (local51 <= 0) {
			if (arg1 + arg4 <= Static521.anInt8383) {
				for (local76 = 0; local76 < arg3; local76++) {
					Static601.method2820(arg5[local76 + arg0], arg1, arg4, local29);
				}
			} else {
				local76 = Static521.anInt8383 - arg1;
				for (local99 = 0; local99 < arg3; local99++) {
					@Pc(108) int[] local108 = arg5[arg0 + local99];
					Static601.method2820(local108, arg1, local76, local29);
					Static601.method2820(local108, 0, arg4 - local76, local29);
				}
			}
		} else if (arg3 > 0 && arg4 > 0) {
			local76 = arg4 / 2;
			local99 = arg3 / 2;
			@Pc(149) int local149 = local51 <= local76 ? local51 : local76;
			@Pc(156) int local156 = local99 >= local51 ? local51 : local99;
			@Pc(161) int local161 = arg1 + local149;
			@Pc(168) int local168 = arg4 - local149 * 2;
			for (@Pc(170) int local170 = 0; local170 < arg3; local170++) {
				@Pc(179) int[] local179 = arg5[local170 + arg0];
				@Pc(192) int local192;
				@Pc(197) int local197;
				@Pc(205) int local205;
				if (local156 > local170) {
					local192 = local29 * local170 / local156;
					if (this.anInt4197 == 0) {
						for (local197 = 0; local197 < local149; local197++) {
							local205 = local29 * local197 / local149;
							local179[Static296.anInt5049 & arg1 + local197] = local179[arg4 + arg1 - local197 - 1 & Static296.anInt5049] = local192 * local205 >> 12;
						}
					} else {
						for (local197 = 0; local197 < local149; local197++) {
							local205 = local29 * local197 / local149;
							local179[Static296.anInt5049 & arg1 + local197] = local179[Static296.anInt5049 & arg4 + arg1 - local197 - 1] = local192 > local205 ? local205 : local192;
						}
					}
					if (local161 + local168 > Static521.anInt8383) {
						local197 = Static521.anInt8383 - local161;
						Static601.method2820(local179, local161, local197, local192);
						Static601.method2820(local179, 0, local168 - local197, local192);
					} else {
						Static601.method2820(local179, local161, local168, local192);
					}
				} else {
					local192 = arg3 - local170 - 1;
					if (local192 < local156) {
						local197 = local192 * local29 / local156;
						@Pc(344) int local344;
						if (this.anInt4197 == 0) {
							for (local205 = 0; local205 < local149; local205++) {
								local344 = local29 * local205 / local149;
								local179[arg1 + local205 & Static296.anInt5049] = local179[Static296.anInt5049 & arg4 + arg1 - local205 - 1] = local197 * local344 >> 12;
							}
						} else {
							for (local205 = 0; local205 < local149; local205++) {
								local344 = local29 * local205 / local149;
								local179[Static296.anInt5049 & arg1 + local205] = local179[Static296.anInt5049 & arg4 + arg1 - local205 - 1] = local344 < local197 ? local344 : local197;
							}
						}
						if (local168 + local161 > Static521.anInt8383) {
							local205 = Static521.anInt8383 - local161;
							Static601.method2820(local179, local161, local205, local197);
							Static601.method2820(local179, 0, local168 - local205, local197);
						} else {
							Static601.method2820(local179, local161, local168, local197);
						}
					} else {
						for (local197 = 0; local197 < local149; local197++) {
							local179[Static296.anInt5049 & local197 + arg1] = local179[arg1 + arg4 - local197 - 1 & Static296.anInt5049] = local29 * local197 / local149;
						}
						if (Static521.anInt8383 < local161 + local168) {
							local205 = Static521.anInt8383 - local161;
							Static601.method2820(local179, local161, local205, local29);
							Static601.method2820(local179, 0, local168 - local205, local29);
						} else {
							Static601.method2820(local179, local161, local168, local29);
						}
					}
				}
			}
		}
	}
}
