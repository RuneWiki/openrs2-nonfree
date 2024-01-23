import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
	private int anInt5072;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
	private int anInt5067 = 409;

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
	private int anInt5079 = 2048;

	@OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
	private int anInt5070 = 0;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
	private int anInt5074 = 1024;

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
	private int anInt5068 = 1024;

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
	private int anInt5077 = 1024;

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
	private int anInt5078 = 0;

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
	private int anInt5083 = 1024;

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
	private int anInt5085 = 819;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass190_41.method4648(arg0);
		if (!this.aClass190_41.aBoolean527) {
			return local7;
		}
		@Pc(35) int[][] local35 = this.aClass190_41.method4649();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(47) boolean local47 = true;
		@Pc(49) int local49 = 0;
		@Pc(51) int local51 = 0;
		@Pc(53) boolean local53 = true;
		@Pc(60) int local60 = Static6.anInt4960 * this.anInt5079 >> 12;
		@Pc(67) int local67 = this.anInt5067 * Static213.anInt5511 >> 12;
		@Pc(74) int local74 = this.anInt5083 * Static6.anInt4960 >> 12;
		@Pc(81) int local81 = Static213.anInt5511 * this.anInt5085 >> 12;
		if (local81 <= 1) {
			return local35[arg0];
		}
		@Pc(95) int local95 = Static6.anInt4960 / local74 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		this.anInt5072 = Static6.anInt4960 / 8 * this.anInt5077 >> 12;
		@Pc(116) Random local116 = new Random((long) this.anInt5078);
		@Pc(120) int[][] local120 = new int[local95][3];
		while (true) {
			while (true) {
				@Pc(130) int local130 = Static118.method2140(local116, local60 - local74) + local74;
				@Pc(140) int local140 = Static118.method2140(local116, local81 - local67) + local67;
				@Pc(144) int local144 = local130 + local43;
				if (local144 > Static6.anInt4960) {
					local144 = Static6.anInt4960;
					local130 = Static6.anInt4960 - local43;
				}
				@Pc(165) int local165;
				@Pc(167) int local167;
				if (local53) {
					local165 = 0;
				} else {
					@Pc(157) int local157 = local45;
					@Pc(161) int[] local161 = local120[local45];
					local165 = local161[2];
					local167 = 0;
					@Pc(171) int local171 = local37 + local144;
					if (local171 < 0) {
						local171 += Static6.anInt4960;
					}
					if (Static6.anInt4960 < local171) {
						local171 -= Static6.anInt4960;
					}
					while (true) {
						@Pc(192) int[] local192 = local120[local157];
						if (local192[0] <= local171 && local192[1] >= local171) {
							if (local45 != local157) {
								@Pc(224) int local224 = local43 + local37;
								if (local224 < 0) {
									local224 += Static6.anInt4960;
								}
								if (local224 > Static6.anInt4960) {
									local224 -= Static6.anInt4960;
								}
								@Pc(247) int local247;
								@Pc(262) int[] local262;
								for (local247 = 1; local247 <= local167; local247++) {
									local262 = local120[(local247 + local45) % local51];
									local165 = Math.max(local165, local262[2]);
								}
								for (local247 = 0; local247 <= local167; local247++) {
									local262 = local120[(local247 + local45) % local51];
									@Pc(292) int local292 = local262[2];
									if (local165 != local292) {
										@Pc(304) int local304 = local262[0];
										@Pc(308) int local308 = local262[1];
										@Pc(323) int local323;
										@Pc(321) int local321;
										if (local224 < local171) {
											local323 = Math.max(local224, local304);
											local321 = Math.min(local171, local308);
										} else if (local304 == 0) {
											local321 = Math.min(local171, local308);
											local323 = 0;
										} else {
											local323 = Math.max(local224, local304);
											local321 = Static6.anInt4960;
										}
										this.method4231(local165 - local292, local35, local116, local41 + local323, local292, local321 - local323);
									}
								}
							}
							local45 = local157;
							break;
						}
						local157++;
						if (local51 <= local157) {
							local157 = 0;
						}
						local167++;
					}
				}
				if (local165 + local140 <= Static213.anInt5511) {
					local47 = false;
				} else {
					local140 = Static213.anInt5511 - local165;
				}
				@Pc(413) int[] local413;
				if (Static6.anInt4960 == local144) {
					this.method4231(local140, local35, local116, local43 + local39, local165, local130);
					if (local47) {
						return local7;
					}
					local45 = 0;
					local47 = true;
					local413 = local99[local49++];
					local41 = local39;
					local413[1] = local144;
					local53 = false;
					local413[0] = local43;
					@Pc(427) int[][] local427 = local120;
					local413[2] = local165 + local140;
					local51 = local49;
					local39 = Static118.method2140(local116, Static6.anInt4960);
					local49 = 0;
					local120 = local99;
					local37 = local39 - local41;
					local99 = local427;
					local43 = 0;
					local167 = local37;
					if (local37 < 0) {
						local167 = local37 + Static6.anInt4960;
					}
					if (local167 > Static6.anInt4960) {
						local167 -= Static6.anInt4960;
					}
					while (true) {
						@Pc(472) int[] local472 = local120[local45];
						if (local167 >= local472[0] && local167 <= local472[1]) {
							break;
						}
						@Pc(489) int local489 = ~local51;
						local45++;
						if (local489 >= ~local45) {
							local45 = 0;
						}
					}
				} else {
					local413 = local99[local49++];
					local413[1] = local144;
					local413[2] = local140 + local165;
					local413[0] = local43;
					this.method4231(local140, local35, local116, local43 + local39, local165, local130);
					local43 = local144;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[[IBLjava/util/Random;III)V")
	private void method4231(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21 = this.anInt5074 <= 0 ? 4096 : 4096 - Static118.method2140(arg2, this.anInt5074);
		@Pc(29) int local29 = this.anInt5068 * this.anInt5072 >> 12;
		@Pc(43) int local43 = this.anInt5072 - (local29 > 0 ? Static118.method2140(arg2, local29) : 0);
		if (Static6.anInt4960 <= arg3) {
			arg3 -= Static6.anInt4960;
		}
		@Pc(72) int local72;
		@Pc(76) int local76;
		if (local43 > 0) {
			if (arg0 <= 0 || arg5 <= 0) {
				return;
			}
			local72 = arg5 / 2;
			local76 = arg0 / 2;
			@Pc(83) int local83 = local43 <= local76 ? local43 : local76;
			@Pc(94) int local94 = local43 > local72 ? local72 : local43;
			@Pc(99) int local99 = arg3 + local94;
			@Pc(106) int local106 = arg5 - local94 * 2;
			for (@Pc(108) int local108 = 0; local108 < arg0; local108++) {
				@Pc(122) int[] local122 = arg1[local108 + arg4];
				@Pc(132) int local132;
				@Pc(140) int local140;
				@Pc(153) int local153;
				if (local83 <= local108) {
					local132 = arg0 - local108 - 1;
					if (local83 <= local132) {
						for (local140 = 0; local140 < local94; local140++) {
							local122[Static274.anInt5042 & arg3 + local140] = local122[arg3 + arg5 - local140 - 1 & Static274.anInt5042] = local140 * local21 / local94;
						}
						if (local99 + local106 <= Static6.anInt4960) {
							Static317.method1052(local122, local99, local106, local21);
						} else {
							local140 = Static6.anInt4960 - local99;
							Static317.method1052(local122, local99, local140, local21);
							Static317.method1052(local122, 0, local106 - local140, local21);
						}
					} else {
						local140 = local21 * local132 / local83;
						@Pc(296) int local296;
						if (this.anInt5070 == 0) {
							for (local153 = 0; local153 < local94; local153++) {
								local296 = local153 * local21 / local94;
								local122[local153 + arg3 & Static274.anInt5042] = local122[arg3 + arg5 - local153 - 1 & Static274.anInt5042] = local140 * local296 >> 12;
							}
						} else {
							for (local153 = 0; local153 < local94; local153++) {
								local296 = local21 * local153 / local94;
								local122[local153 + arg3 & Static274.anInt5042] = local122[Static274.anInt5042 & arg5 + arg3 - local153 - 1] = local140 > local296 ? local296 : local140;
							}
						}
						if (local99 + local106 <= Static6.anInt4960) {
							Static317.method1052(local122, local99, local106, local140);
						} else {
							local153 = Static6.anInt4960 - local99;
							Static317.method1052(local122, local99, local153, local140);
							Static317.method1052(local122, 0, local106 - local153, local140);
						}
					}
				} else {
					local132 = local21 * local108 / local83;
					if (this.anInt5070 == 0) {
						for (local140 = 0; local140 < local94; local140++) {
							local153 = local140 * local21 / local94;
							local122[arg3 + local140 & Static274.anInt5042] = local122[Static274.anInt5042 & arg5 + arg3 - local140 - 1] = local132 * local153 >> 12;
						}
					} else {
						for (local140 = 0; local140 < local94; local140++) {
							local153 = local140 * local21 / local94;
							local122[arg3 + local140 & Static274.anInt5042] = local122[arg5 + arg3 - local140 - 1 & Static274.anInt5042] = local132 > local153 ? local153 : local132;
						}
					}
					if (Static6.anInt4960 >= local99 + local106) {
						Static317.method1052(local122, local99, local106, local132);
					} else {
						local140 = Static6.anInt4960 - local99;
						Static317.method1052(local122, local99, local140, local132);
						Static317.method1052(local122, 0, local106 - local140, local132);
					}
				}
			}
		} else if (arg3 + arg5 <= Static6.anInt4960) {
			for (local72 = 0; local72 < arg0; local72++) {
				Static317.method1052(arg1[arg4 + local72], arg3, arg5, local21);
			}
		} else {
			local72 = Static6.anInt4960 - arg3;
			for (local76 = 0; local76 < arg0; local76++) {
				@Pc(529) int[] local529 = arg1[local76 + arg4];
				Static317.method1052(local529, arg3, local72, local21);
				Static317.method1052(local529, 0, arg5 - local72, local21);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5078 = arg0.method1853();
		} else if (arg1 == 1) {
			this.anInt5083 = arg0.method1879();
		} else if (arg1 == 2) {
			this.anInt5079 = arg0.method1879();
		} else if (arg1 == 3) {
			this.anInt5067 = arg0.method1879();
		} else if (arg1 == 4) {
			this.anInt5085 = arg0.method1879();
		} else if (arg1 == 5) {
			this.anInt5077 = arg0.method1879();
		} else if (arg1 == 6) {
			this.anInt5070 = arg0.method1853();
		} else if (arg1 == 7) {
			this.anInt5068 = arg0.method1879();
		} else if (arg1 == 8) {
			this.anInt5074 = arg0.method1879();
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
	}
}
