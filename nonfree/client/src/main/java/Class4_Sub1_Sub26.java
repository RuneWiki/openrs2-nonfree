import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class4_Sub1_Sub26 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ol", name = "D", descriptor = "[I")
	public static final int[] anIntArray369 = new int[4096];

	@OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
	private int anInt7336;

	@OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
	private int anInt7335 = 2048;

	@OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
	private int anInt7344 = 1024;

	@OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
	private int anInt7342 = 409;

	@OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
	private int anInt7347 = 0;

	@OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
	private int anInt7340 = 1024;

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
	private int anInt7343 = 1024;

	@OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
	private int anInt7339 = 819;

	@OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
	private int anInt7346 = 0;

	@OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
	private int anInt7338 = 1024;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray369[local4] = Static198.method3516(local4);
		}
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II[[IILjava/util/Random;II)V")
	private void method6065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) int local20 = this.anInt7343 > 0 ? 4096 - Static406.method6391(arg3, this.anInt7343) : 4096;
		@Pc(28) int local28 = this.anInt7344 * this.anInt7336 >> 12;
		@Pc(43) int local43 = this.anInt7336 - (local28 > 0 ? Static406.method6391(arg3, local28) : 0);
		if (Static376.anInt7260 <= arg0) {
			arg0 -= Static376.anInt7260;
		}
		@Pc(65) int local65;
		@Pc(67) int local67;
		if (local43 <= 0) {
			if (arg1 + arg0 > Static376.anInt7260) {
				local65 = Static376.anInt7260 - arg0;
				for (local67 = 0; local67 < arg5; local67++) {
					@Pc(75) int[] local75 = arg2[local67 + arg4];
					Static597.method3724(local75, arg0, local65, local20);
					Static597.method3724(local75, 0, arg1 - local65, local20);
				}
			} else {
				for (local65 = 0; local65 < arg5; local65++) {
					Static597.method3724(arg2[arg4 + local65], arg0, arg1, local20);
				}
			}
		} else if (arg5 > 0 && arg1 > 0) {
			local65 = arg1 / 2;
			local67 = arg5 / 2;
			@Pc(142) int local142 = local43 <= local65 ? local43 : local65;
			@Pc(149) int local149 = local43 <= local67 ? local43 : local67;
			@Pc(154) int local154 = arg0 + local142;
			@Pc(161) int local161 = arg1 - local142 * 2;
			for (@Pc(163) int local163 = 0; local163 < arg5; local163++) {
				@Pc(171) int[] local171 = arg2[local163 + arg4];
				@Pc(180) int local180;
				@Pc(185) int local185;
				@Pc(193) int local193;
				if (local163 < local149) {
					local180 = local20 * local163 / local149;
					if (this.anInt7346 == 0) {
						for (local185 = 0; local185 < local142; local185++) {
							local193 = local20 * local185 / local142;
							local171[local185 + arg0 & Static569.anInt9982] = local171[Static569.anInt9982 & arg0 + arg1 - local185 - 1] = local180 * local193 >> 12;
						}
					} else {
						for (local185 = 0; local185 < local142; local185++) {
							local193 = local20 * local185 / local142;
							local171[Static569.anInt9982 & local185 + arg0] = local171[arg0 + arg1 - local185 - 1 & Static569.anInt9982] = local193 < local180 ? local193 : local180;
						}
					}
					if (Static376.anInt7260 >= local161 + local154) {
						Static597.method3724(local171, local154, local161, local180);
					} else {
						local185 = Static376.anInt7260 - local154;
						Static597.method3724(local171, local154, local185, local180);
						Static597.method3724(local171, 0, local161 - local185, local180);
					}
				} else {
					local180 = arg5 - local163 - 1;
					if (local149 > local180) {
						local185 = local180 * local20 / local149;
						@Pc(338) int local338;
						if (this.anInt7346 == 0) {
							for (local193 = 0; local193 < local142; local193++) {
								local338 = local20 * local193 / local142;
								local171[arg0 + local193 & Static569.anInt9982] = local171[arg0 + arg1 - local193 - 1 & Static569.anInt9982] = local185 * local338 >> 12;
							}
						} else {
							for (local193 = 0; local193 < local142; local193++) {
								local338 = local193 * local20 / local142;
								local171[local193 + arg0 & Static569.anInt9982] = local171[arg0 + arg1 - local193 - 1 & Static569.anInt9982] = local185 > local338 ? local338 : local185;
							}
						}
						if (Static376.anInt7260 >= local161 + local154) {
							Static597.method3724(local171, local154, local161, local185);
						} else {
							local193 = Static376.anInt7260 - local154;
							Static597.method3724(local171, local154, local193, local185);
							Static597.method3724(local171, 0, local161 - local193, local185);
						}
					} else {
						for (local185 = 0; local185 < local142; local185++) {
							local171[Static569.anInt9982 & arg0 + local185] = local171[Static569.anInt9982 & arg0 + arg1 - local185 - 1] = local20 * local185 / local142;
						}
						if (Static376.anInt7260 >= local154 + local161) {
							Static597.method3724(local171, local154, local161, local20);
						} else {
							local193 = Static376.anInt7260 - local154;
							Static597.method3724(local171, local154, local193, local20);
							Static597.method3724(local171, 0, local161 - local193, local20);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (!super.aClass185_41.aBoolean366) {
			return local11;
		}
		@Pc(28) int[][] local28 = super.aClass185_41.method4443();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = this.anInt7338 * Static376.anInt7260 >> 12;
		@Pc(60) int local60 = this.anInt7335 * Static376.anInt7260 >> 12;
		@Pc(67) int local67 = this.anInt7342 * Static477.anInt8774 >> 12;
		@Pc(74) int local74 = Static477.anInt8774 * this.anInt7339 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt7336 = this.anInt7340 * (Static376.anInt7260 / 8) >> 12;
		@Pc(97) int local97 = Static376.anInt7260 / local53 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt7347);
		while (true) {
			while (true) {
				@Pc(122) int local122 = local53 + Static406.method6391(local112, local60 - local53);
				@Pc(132) int local132 = Static406.method6391(local112, local74 - local67) + local67;
				@Pc(137) int local137 = local36 + local122;
				if (local137 > Static376.anInt7260) {
					local137 = Static376.anInt7260;
					local122 = Static376.anInt7260 - local36;
				}
				@Pc(211) int local211;
				@Pc(156) int local156;
				if (local42) {
					local211 = 0;
				} else {
					@Pc(150) int local150 = local38;
					@Pc(154) int[] local154 = local105[local38];
					local156 = 0;
					@Pc(160) int local160 = local137 + local30;
					if (local160 < 0) {
						local160 += Static376.anInt7260;
					}
					if (Static376.anInt7260 < local160) {
						local160 -= Static376.anInt7260;
					}
					while (true) {
						@Pc(184) int[] local184 = local105[local150];
						if (local160 >= local184[0] && local160 <= local184[1]) {
							local211 = local154[2];
							if (local150 != local38) {
								@Pc(218) int local218 = local36 + local30;
								if (local218 < 0) {
									local218 += Static376.anInt7260;
								}
								if (Static376.anInt7260 < local218) {
									local218 -= Static376.anInt7260;
								}
								for (@Pc(236) int local236 = 1; local236 <= local156; local236++) {
									@Pc(246) int[] local246 = local105[(local236 + local38) % local44];
									local211 = Math.max(local211, local246[2]);
								}
								for (@Pc(258) int local258 = 0; local258 <= local156; local258++) {
									@Pc(268) int[] local268 = local105[(local258 + local38) % local44];
									@Pc(272) int local272 = local268[2];
									if (local211 != local272) {
										@Pc(279) int local279 = local268[0];
										@Pc(283) int local283 = local268[1];
										@Pc(292) int local292;
										@Pc(294) int local294;
										if (local160 > local218) {
											local292 = Math.max(local218, local279);
											local294 = Math.min(local160, local283);
										} else if (local279 == 0) {
											local292 = 0;
											local294 = Math.min(local160, local283);
										} else {
											local292 = Math.max(local218, local279);
											local294 = Static376.anInt7260;
										}
										this.method6065(local34 + local292, local294 - local292, local28, local112, local272, local211 - local272);
									}
								}
							}
							local38 = local150;
							break;
						}
						local150++;
						if (local44 <= local150) {
							local150 = 0;
						}
						local156++;
					}
				}
				if (local211 + local132 > Static477.anInt8774) {
					local132 = Static477.anInt8774 - local211;
				} else {
					local40 = false;
				}
				@Pc(384) int[] local384;
				if (local137 == Static376.anInt7260) {
					this.method6065(local32 + local36, local122, local28, local112, local211, local132);
					if (local40) {
						return local11;
					}
					local40 = true;
					local384 = local101[local46++];
					local384[1] = local137;
					local384[2] = local211 + local132;
					local384[0] = local36;
					@Pc(401) int[][] local401 = local105;
					local105 = local101;
					local101 = local401;
					local44 = local46;
					local34 = local32;
					local46 = 0;
					local32 = Static406.method6391(local112, Static376.anInt7260);
					local36 = 0;
					local30 = local32 - local34;
					local156 = local30;
					if (local30 < 0) {
						local156 = local30 + Static376.anInt7260;
					}
					if (local156 > Static376.anInt7260) {
						local156 -= Static376.anInt7260;
					}
					local38 = 0;
					local42 = false;
					while (true) {
						@Pc(445) int[] local445 = local105[local38];
						if (local445[0] <= local156 && local445[1] >= local156) {
							break;
						}
						@Pc(462) int local462 = ~local44;
						local38++;
						if (local462 >= ~local38) {
							local38 = 0;
						}
					}
				} else {
					local384 = local101[local46++];
					local384[2] = local132 + local211;
					local384[1] = local137;
					local384[0] = local36;
					this.method6065(local32 + local36, local122, local28, local112, local211, local132);
					local36 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt7347 = arg1.method4905();
		} else if (arg0 == 1) {
			this.anInt7338 = arg1.method4936();
		} else if (arg0 == 2) {
			this.anInt7335 = arg1.method4936();
		} else if (arg0 == 3) {
			this.anInt7342 = arg1.method4936();
		} else if (arg0 == 4) {
			this.anInt7339 = arg1.method4936();
		} else if (arg0 == 5) {
			this.anInt7340 = arg1.method4936();
		} else if (arg0 == 6) {
			this.anInt7346 = arg1.method4905();
		} else if (arg0 == 7) {
			this.anInt7344 = arg1.method4936();
		} else if (arg0 == 8) {
			this.anInt7343 = arg1.method4936();
		}
	}
}
