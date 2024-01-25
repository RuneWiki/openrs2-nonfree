import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class6_Sub4_Sub31 extends Class6_Sub4 {

	@OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
	private int anInt7903;

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
	private int anInt7892 = 1024;

	@OriginalMember(owner = "client!pi", name = "L", descriptor = "I")
	private int anInt7896 = 0;

	@OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
	private int anInt7897 = 2048;

	@OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
	private int anInt7898 = 1024;

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
	private int anInt7888 = 1024;

	@OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
	private int anInt7895 = 819;

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
	private int anInt7891 = 409;

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
	private int anInt7889 = 0;

	@OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
	private int anInt7901 = 1024;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt7889 = arg1.method8604();
		} else if (arg0 == 1) {
			this.anInt7888 = arg1.method8571();
		} else if (arg0 == 2) {
			this.anInt7897 = arg1.method8571();
		} else if (arg0 == 3) {
			this.anInt7891 = arg1.method8571();
		} else if (arg0 == 4) {
			this.anInt7895 = arg1.method8571();
		} else if (arg0 == 5) {
			this.anInt7901 = arg1.method8571();
		} else if (arg0 == 6) {
			this.anInt7896 = arg1.method8604();
		} else if (arg0 == 7) {
			this.anInt7898 = arg1.method8571();
		} else if (arg0 == 8) {
			this.anInt7892 = arg1.method8571();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass372_41.method8736(arg0);
		if (!super.aClass372_41.aBoolean691) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass372_41.method8735();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = Static6.anInt111 * this.anInt7888 >> 12;
		@Pc(58) int local58 = Static6.anInt111 * this.anInt7897 >> 12;
		@Pc(65) int local65 = this.anInt7891 * Static429.anInt7811 >> 12;
		@Pc(72) int local72 = this.anInt7895 * Static429.anInt7811 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt7903 = Static6.anInt111 / 8 * this.anInt7901 >> 12;
		@Pc(95) int local95 = Static6.anInt111 / local51 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt7889);
		while (true) {
			while (true) {
				@Pc(120) int local120 = Static588.method8281(local110, local58 - local51) + local51;
				@Pc(130) int local130 = local65 + Static588.method8281(local110, local72 - local65);
				@Pc(134) int local134 = local120 + local34;
				if (Static6.anInt111 < local134) {
					local134 = Static6.anInt111;
					local120 = Static6.anInt111 - local34;
				}
				@Pc(209) int local209;
				@Pc(154) int local154;
				if (local40) {
					local209 = 0;
				} else {
					@Pc(148) int local148 = local36;
					@Pc(152) int[] local152 = local103[local36];
					local154 = 0;
					@Pc(158) int local158 = local134 + local28;
					if (local158 < 0) {
						local158 += Static6.anInt111;
					}
					if (local158 > Static6.anInt111) {
						local158 -= Static6.anInt111;
					}
					while (true) {
						@Pc(178) int[] local178 = local103[local148];
						if (local178[0] <= local158 && local158 <= local178[1]) {
							local209 = local152[2];
							if (local148 != local36) {
								@Pc(220) int local220 = local34 + local28;
								if (local220 < 0) {
									local220 += Static6.anInt111;
								}
								if (Static6.anInt111 < local220) {
									local220 -= Static6.anInt111;
								}
								for (@Pc(235) int local235 = 1; local235 <= local154; local235++) {
									@Pc(245) int[] local245 = local103[(local36 + local235) % local42];
									local209 = Math.max(local209, local245[2]);
								}
								for (@Pc(261) int local261 = 0; local261 <= local154; local261++) {
									@Pc(271) int[] local271 = local103[(local261 + local36) % local42];
									@Pc(275) int local275 = local271[2];
									if (local275 != local209) {
										@Pc(282) int local282 = local271[0];
										@Pc(286) int local286 = local271[1];
										@Pc(293) int local293;
										@Pc(297) int local297;
										if (local220 < local158) {
											local293 = Math.max(local220, local282);
											local297 = Math.min(local158, local286);
										} else if (local282 == 0) {
											local293 = 0;
											local297 = Math.min(local158, local286);
										} else {
											local293 = Math.max(local220, local282);
											local297 = Static6.anInt111;
										}
										this.method6774(local297 - local293, local32 + local293, local110, local275, local209 - local275, local26);
									}
								}
							}
							local36 = local148;
							break;
						}
						local148++;
						if (local42 <= local148) {
							local148 = 0;
						}
						local154++;
					}
				}
				if (Static429.anInt7811 >= local209 + local130) {
					local38 = false;
				} else {
					local130 = Static429.anInt7811 - local209;
				}
				@Pc(372) int[] local372;
				if (Static6.anInt111 == local134) {
					this.method6774(local120, local34 + local30, local110, local209, local130, local26);
					if (local38) {
						return local17;
					}
					local38 = true;
					local372 = local99[local44++];
					local372[1] = local134;
					local372[2] = local130 + local209;
					local372[0] = local34;
					@Pc(437) int[][] local437 = local103;
					local103 = local99;
					local42 = local44;
					local99 = local437;
					local32 = local30;
					local44 = 0;
					local30 = Static588.method8281(local110, Static6.anInt111);
					local28 = local30 - local32;
					local34 = 0;
					local154 = local28;
					if (local28 < 0) {
						local154 = local28 + Static6.anInt111;
					}
					local36 = 0;
					if (local154 > Static6.anInt111) {
						local154 -= Static6.anInt111;
					}
					while (true) {
						@Pc(484) int[] local484 = local103[local36];
						if (local484[0] <= local154 && local154 <= local484[1]) {
							local40 = false;
							break;
						}
						local36++;
						if (local36 >= local42) {
							local36 = 0;
						}
					}
				} else {
					local372 = local99[local44++];
					local372[2] = local130 + local209;
					local372[0] = local34;
					local372[1] = local134;
					this.method6774(local120, local30 + local34, local110, local209, local130, local26);
					local34 = local134;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILjava/util/Random;III[[I)V")
	private void method6774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(21) int local21 = this.anInt7892 > 0 ? 4096 - Static588.method8281(arg2, this.anInt7892) : 4096;
		@Pc(29) int local29 = this.anInt7898 * this.anInt7903 >> 12;
		@Pc(42) int local42 = this.anInt7903 - (local29 > 0 ? Static588.method8281(arg2, local29) : 0);
		if (Static6.anInt111 <= arg1) {
			arg1 -= Static6.anInt111;
		}
		@Pc(61) int local61;
		@Pc(65) int local65;
		if (local42 > 0) {
			if (arg4 > 0 && arg0 > 0) {
				local61 = arg0 / 2;
				local65 = arg4 / 2;
				@Pc(72) int local72 = local42 <= local61 ? local42 : local61;
				@Pc(79) int local79 = local42 > local65 ? local65 : local42;
				@Pc(83) int local83 = arg1 + local72;
				@Pc(90) int local90 = arg0 - local72 * 2;
				for (@Pc(92) int local92 = 0; local92 < arg4; local92++) {
					@Pc(100) int[] local100 = arg5[arg3 + local92];
					@Pc(113) int local113;
					@Pc(118) int local118;
					@Pc(126) int local126;
					if (local92 < local79) {
						local113 = local92 * local21 / local79;
						if (this.anInt7896 == 0) {
							for (local118 = 0; local118 < local72; local118++) {
								local126 = local118 * local21 / local72;
								local100[local118 + arg1 & Static325.anInt6209] = local100[Static325.anInt6209 & arg1 + arg0 - local118 - 1] = local126 * local113 >> 12;
							}
						} else {
							for (local118 = 0; local118 < local72; local118++) {
								local126 = local118 * local21 / local72;
								local100[local118 + arg1 & Static325.anInt6209] = local100[arg1 + arg0 - local118 - 1 & Static325.anInt6209] = local113 > local126 ? local126 : local113;
							}
						}
						if (Static6.anInt111 >= local83 + local90) {
							Static655.method5835(local100, local83, local90, local113);
						} else {
							local118 = Static6.anInt111 - local83;
							Static655.method5835(local100, local83, local118, local113);
							Static655.method5835(local100, 0, local90 - local118, local113);
						}
					} else {
						local113 = arg4 - local92 - 1;
						if (local79 > local113) {
							local118 = local21 * local113 / local79;
							@Pc(270) int local270;
							if (this.anInt7896 == 0) {
								for (local126 = 0; local126 < local72; local126++) {
									local270 = local21 * local126 / local72;
									local100[Static325.anInt6209 & local126 + arg1] = local100[arg0 + arg1 - local126 - 1 & Static325.anInt6209] = local118 * local270 >> 12;
								}
							} else {
								for (local126 = 0; local126 < local72; local126++) {
									local270 = local126 * local21 / local72;
									local100[Static325.anInt6209 & local126 + arg1] = local100[arg1 + arg0 - local126 - 1 & Static325.anInt6209] = local270 < local118 ? local270 : local118;
								}
							}
							if (local83 + local90 > Static6.anInt111) {
								local126 = Static6.anInt111 - local83;
								Static655.method5835(local100, local83, local126, local118);
								Static655.method5835(local100, 0, local90 - local126, local118);
							} else {
								Static655.method5835(local100, local83, local90, local118);
							}
						} else {
							for (local118 = 0; local118 < local72; local118++) {
								local100[Static325.anInt6209 & local118 + arg1] = local100[Static325.anInt6209 & arg0 + arg1 - local118 - 1] = local118 * local21 / local72;
							}
							if (Static6.anInt111 >= local83 + local90) {
								Static655.method5835(local100, local83, local90, local21);
							} else {
								local126 = Static6.anInt111 - local83;
								Static655.method5835(local100, local83, local126, local21);
								Static655.method5835(local100, 0, local90 - local126, local21);
							}
						}
					}
				}
			}
		} else if (Static6.anInt111 < arg0 + arg1) {
			local61 = Static6.anInt111 - arg1;
			for (local65 = 0; local65 < arg4; local65++) {
				@Pc(470) int[] local470 = arg5[local65 + arg3];
				Static655.method5835(local470, arg1, local61, local21);
				Static655.method5835(local470, 0, arg0 - local61, local21);
			}
		} else {
			for (local61 = 0; local61 < arg4; local61++) {
				Static655.method5835(arg5[local61 + arg3], arg1, arg0, local21);
			}
		}
	}
}
