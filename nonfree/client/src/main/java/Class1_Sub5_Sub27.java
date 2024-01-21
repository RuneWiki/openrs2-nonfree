import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class1_Sub5_Sub27 extends Class1_Sub5 {

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
	private int anInt2913;

	@OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
	private int anInt2905;

	@OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
	private int anInt2908;

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
	private int anInt2904;

	@OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
	private int anInt2910;

	@OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
	private int anInt2917;

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
	private int anInt2902;

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
	private int anInt2915;

	@OriginalMember(owner = "client!qd", name = "jb", descriptor = "I")
	private int anInt2920;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass2_41.method19(arg0);
		if (!super.aClass2_41.aBoolean2) {
			return local7;
		}
		@Pc(25) int[][] local25 = super.aClass2_41.method18();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = this.anInt2902 * Static101.anInt2218 >> 12;
		@Pc(57) int local57 = Static177.anInt4018 * this.anInt2910 >> 12;
		@Pc(64) int local64 = this.anInt2920 * Static177.anInt4018 >> 12;
		@Pc(71) int local71 = this.anInt2905 * Static101.anInt2218 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt2913 = Static177.anInt4018 / 8 * this.anInt2904 >> 12;
		@Pc(97) int local97 = Static177.anInt4018 / local64 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt2915);
		while (true) {
			while (true) {
				@Pc(121) int local121 = Static103.method1706(local57 - local64, local112) + local64;
				@Pc(130) int local130 = Static103.method1706(local71 - local50, local112) + local50;
				@Pc(134) int local134 = local31 + local121;
				if (Static177.anInt4018 < local134) {
					local134 = Static177.anInt4018;
					local121 = Static177.anInt4018 - local31;
				}
				@Pc(147) int local147;
				@Pc(161) int local161;
				if (local39) {
					local147 = 0;
				} else {
					@Pc(151) int local151 = local35;
					@Pc(155) int[] local155 = local105[local35];
					local147 = local155[2];
					local161 = 0;
					@Pc(165) int local165 = local27 + local134;
					if (local165 < 0) {
						local165 += Static177.anInt4018;
					}
					if (Static177.anInt4018 < local165) {
						local165 -= Static177.anInt4018;
					}
					while (true) {
						@Pc(185) int[] local185 = local105[local151];
						if (local185[0] <= local165 && local185[1] >= local165) {
							if (local151 != local35) {
								@Pc(215) int local215 = local27 + local31;
								if (local215 < 0) {
									local215 += Static177.anInt4018;
								}
								if (local215 > Static177.anInt4018) {
									local215 -= Static177.anInt4018;
								}
								for (@Pc(234) int local234 = 1; local234 <= local161; local234++) {
									@Pc(244) int[] local244 = local105[(local234 + local35) % local43];
									local147 = Math.max(local147, local244[2]);
								}
								for (@Pc(256) int local256 = 0; local256 <= local161; local256++) {
									@Pc(266) int[] local266 = local105[(local35 + local256) % local43];
									@Pc(270) int local270 = local266[2];
									if (local270 != local147) {
										@Pc(277) int local277 = local266[0];
										@Pc(281) int local281 = local266[1];
										@Pc(292) int local292;
										@Pc(296) int local296;
										if (local215 < local165) {
											local292 = Math.max(local215, local277);
											local296 = Math.min(local165, local281);
										} else if (local277 == 0) {
											local292 = 0;
											local296 = Math.min(local165, local281);
										} else {
											local292 = Math.max(local215, local277);
											local296 = Static177.anInt4018;
										}
										this.method2287(local112, local25, local292 + local29, local270, local147 - local270, local296 - local292);
									}
								}
							}
							local35 = local151;
							break;
						}
						local151++;
						if (local43 <= local151) {
							local151 = 0;
						}
						local161++;
					}
				}
				if (local130 + local147 <= Static101.anInt2218) {
					local37 = false;
				} else {
					local130 = Static101.anInt2218 - local147;
				}
				@Pc(361) int[] local361;
				if (local134 == Static177.anInt4018) {
					this.method2287(local112, local25, local31 + local33, local147, local130, local121);
					if (local37) {
						return local7;
					}
					local39 = false;
					local37 = true;
					local29 = local33;
					local361 = local101[local41++];
					@Pc(417) int[][] local417 = local105;
					local361[1] = local134;
					local105 = local101;
					local43 = local41;
					local361[2] = local130 + local147;
					local101 = local417;
					local361[0] = local31;
					local31 = 0;
					local33 = Static103.method1706(Static177.anInt4018, local112);
					local41 = 0;
					local35 = 0;
					local27 = local33 - local29;
					local161 = local27;
					if (local27 < 0) {
						local161 = local27 + Static177.anInt4018;
					}
					if (Static177.anInt4018 < local161) {
						local161 -= Static177.anInt4018;
					}
					while (true) {
						@Pc(479) int[] local479 = local105[local35];
						if (local479[0] <= local161 && local161 <= local479[1]) {
							break;
						}
						@Pc(492) int local492 = ~local43;
						local35++;
						if (local492 >= ~local35) {
							local35 = 0;
						}
					}
				} else {
					local361 = local101[local41++];
					local361[0] = local31;
					local361[2] = local130 + local147;
					local361[1] = local134;
					this.method2287(local112, local25, local33 + local31, local147, local130, local121);
					local31 = local134;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2915 = arg0.method336();
		} else if (arg1 == 1) {
			this.anInt2920 = arg0.method359();
		} else if (arg1 == 2) {
			this.anInt2910 = arg0.method359();
		} else if (arg1 == 3) {
			this.anInt2902 = arg0.method359();
		} else if (arg1 == 4) {
			this.anInt2905 = arg0.method359();
		} else if (arg1 == 5) {
			this.anInt2904 = arg0.method359();
		} else if (arg1 == 6) {
			this.anInt2917 = arg0.method336();
		} else if (arg1 == 7) {
			this.anInt2912 = arg0.method359();
		} else if (arg1 == 8) {
			this.anInt2908 = arg0.method359();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/util/Random;[[IIIIIZ)V")
	private void method2287(@OriginalArg(0) Random arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(22) int local22 = this.anInt2908 <= 0 ? 4096 : 4096 - Static103.method1706(this.anInt2908, arg0);
		@Pc(30) int local30 = this.anInt2912 * this.anInt2913 >> 12;
		@Pc(43) int local43 = this.anInt2913 - (local30 > 0 ? Static103.method1706(local30, arg0) : 0);
		if (arg2 >= Static177.anInt4018) {
			arg2 -= Static177.anInt4018;
		}
		@Pc(61) int local61;
		@Pc(65) int local65;
		if (local43 > 0) {
			if (arg4 <= 0 || arg5 <= 0) {
				return;
			}
			local61 = arg5 / 2;
			local65 = arg4 / 2;
			@Pc(72) int local72 = local65 >= local43 ? local43 : local65;
			@Pc(83) int local83 = local43 <= local61 ? local43 : local61;
			@Pc(87) int local87 = local83 + arg2;
			@Pc(94) int local94 = arg5 - local83 * 2;
			for (@Pc(96) int local96 = 0; local96 < arg4; local96++) {
				@Pc(104) int[] local104 = arg1[local96 + arg3];
				@Pc(117) int local117;
				@Pc(125) int local125;
				@Pc(133) int local133;
				if (local96 < local72) {
					local117 = local96 * local22 / local72;
					if (this.anInt2917 == 0) {
						for (local125 = 0; local125 < local83; local125++) {
							local133 = local22 * local125 / local83;
							local104[Static47.anInt1130 & local125 + arg2] = local104[Static47.anInt1130 & arg5 + arg2 - local125 - 1] = local117 * local133 >> 12;
						}
					} else {
						for (local125 = 0; local125 < local83; local125++) {
							local133 = local125 * local22 / local83;
							local104[arg2 + local125 & Static47.anInt1130] = local104[Static47.anInt1130 & arg2 + arg5 - local125 - 1] = local117 > local133 ? local133 : local117;
						}
					}
					if (local94 + local87 > Static177.anInt4018) {
						local125 = Static177.anInt4018 - local87;
						Static190.method1385(local104, local87, local125, local117);
						Static190.method1385(local104, 0, local94 - local125, local117);
					} else {
						Static190.method1385(local104, local87, local94, local117);
					}
				} else {
					local117 = arg4 - local96 - 1;
					if (local72 > local117) {
						local125 = local117 * local22 / local72;
						@Pc(280) int local280;
						if (this.anInt2917 == 0) {
							for (local133 = 0; local133 < local83; local133++) {
								local280 = local22 * local133 / local83;
								local104[Static47.anInt1130 & local133 + arg2] = local104[arg5 + arg2 - local133 - 1 & Static47.anInt1130] = local280 * local125 >> 12;
							}
						} else {
							for (local133 = 0; local133 < local83; local133++) {
								local280 = local133 * local22 / local83;
								local104[arg2 + local133 & Static47.anInt1130] = local104[Static47.anInt1130 & arg5 + arg2 - local133 - 1] = local280 < local125 ? local280 : local125;
							}
						}
						if (local87 + local94 > Static177.anInt4018) {
							local133 = Static177.anInt4018 - local87;
							Static190.method1385(local104, local87, local133, local125);
							Static190.method1385(local104, 0, local94 - local133, local125);
						} else {
							Static190.method1385(local104, local87, local94, local125);
						}
					} else {
						for (local125 = 0; local125 < local83; local125++) {
							local104[Static47.anInt1130 & arg2 + local125] = local104[arg2 + arg5 - local125 - 1 & Static47.anInt1130] = local22 * local125 / local83;
						}
						if (Static177.anInt4018 < local94 + local87) {
							local133 = Static177.anInt4018 - local87;
							Static190.method1385(local104, local87, local133, local22);
							Static190.method1385(local104, 0, local94 - local133, local22);
						} else {
							Static190.method1385(local104, local87, local94, local22);
						}
					}
				}
			}
		} else if (Static177.anInt4018 >= arg2 + arg5) {
			for (local61 = 0; local61 < arg4; local61++) {
				Static190.method1385(arg1[arg3 + local61], arg2, arg5, local22);
			}
		} else {
			local61 = Static177.anInt4018 - arg2;
			for (local65 = 0; local65 < arg4; local65++) {
				@Pc(510) int[] local510 = arg1[arg3 + local65];
				Static190.method1385(local510, arg2, local61, local22);
				Static190.method1385(local510, 0, arg5 - local61, local22);
			}
		}
	}
}
