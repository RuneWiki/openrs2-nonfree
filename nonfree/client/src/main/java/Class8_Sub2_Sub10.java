import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class8_Sub2_Sub10 extends Class8_Sub2 {

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
	private int anInt3350;

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
	private int anInt3344 = 0;

	@OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
	private int anInt3346 = 1024;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
	private int anInt3343 = 409;

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
	private int anInt3352 = 1024;

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
	private int anInt3353 = 819;

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
	private int anInt3342 = 1024;

	@OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
	private int anInt3354 = 0;

	@OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
	private int anInt3349 = 1024;

	@OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
	private int anInt3345 = 2048;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3354 = arg1.method8525();
		} else if (arg0 == 1) {
			this.anInt3342 = arg1.method8578();
		} else if (arg0 == 2) {
			this.anInt3345 = arg1.method8578();
		} else if (arg0 == 3) {
			this.anInt3343 = arg1.method8578();
		} else if (arg0 == 4) {
			this.anInt3353 = arg1.method8578();
		} else if (arg0 == 5) {
			this.anInt3346 = arg1.method8578();
		} else if (arg0 == 6) {
			this.anInt3344 = arg1.method8525();
		} else if (arg0 == 7) {
			this.anInt3349 = arg1.method8578();
		} else if (arg0 == 8) {
			this.anInt3352 = arg1.method8578();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILjava/util/Random;III[[I)V")
	private void method2788(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(23) int local23 = this.anInt3352 > 0 ? 4096 - Static221.method4149(this.anInt3352, arg1) : 4096;
		@Pc(31) int local31 = this.anInt3350 * this.anInt3349 >> 12;
		@Pc(49) int local49 = this.anInt3350 - (local31 > 0 ? Static221.method4149(local31, arg1) : 0);
		if (Static538.anInt9297 <= arg3) {
			arg3 -= Static538.anInt9297;
		}
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (local49 > 0) {
			if (arg2 > 0 && arg4 > 0) {
				local70 = arg4 / 2;
				local74 = arg2 / 2;
				@Pc(85) int local85 = local70 >= local49 ? local49 : local70;
				@Pc(92) int local92 = local74 < local49 ? local74 : local49;
				@Pc(97) int local97 = arg3 + local85;
				@Pc(103) int local103 = arg4 - local85 * 2;
				for (@Pc(105) int local105 = 0; local105 < arg2; local105++) {
					@Pc(113) int[] local113 = arg5[arg0 + local105];
					@Pc(122) int local122;
					@Pc(127) int local127;
					@Pc(135) int local135;
					if (local92 > local105) {
						local122 = local105 * local23 / local92;
						if (this.anInt3344 == 0) {
							for (local127 = 0; local127 < local85; local127++) {
								local135 = local23 * local127 / local85;
								local113[local127 + arg3 & Static263.anInt5634] = local113[arg3 + arg4 - local127 - 1 & Static263.anInt5634] = local122 * local135 >> 12;
							}
						} else {
							for (local127 = 0; local127 < local85; local127++) {
								local135 = local23 * local127 / local85;
								local113[Static263.anInt5634 & local127 + arg3] = local113[Static263.anInt5634 & arg3 + arg4 - local127 - 1] = local135 >= local122 ? local122 : local135;
							}
						}
						if (local103 + local97 > Static538.anInt9297) {
							local127 = Static538.anInt9297 - local97;
							Static649.method5534(local113, local97, local127, local122);
							Static649.method5534(local113, 0, local103 - local127, local122);
						} else {
							Static649.method5534(local113, local97, local103, local122);
						}
					} else {
						local122 = arg2 - local105 - 1;
						if (local92 > local122) {
							local127 = local23 * local122 / local92;
							@Pc(280) int local280;
							if (this.anInt3344 == 0) {
								for (local135 = 0; local135 < local85; local135++) {
									local280 = local23 * local135 / local85;
									local113[Static263.anInt5634 & arg3 + local135] = local113[arg4 + arg3 - local135 - 1 & Static263.anInt5634] = local280 * local127 >> 12;
								}
							} else {
								for (local135 = 0; local135 < local85; local135++) {
									local280 = local23 * local135 / local85;
									local113[Static263.anInt5634 & local135 + arg3] = local113[arg3 + arg4 - local135 - 1 & Static263.anInt5634] = local127 <= local280 ? local127 : local280;
								}
							}
							if (Static538.anInt9297 >= local103 + local97) {
								Static649.method5534(local113, local97, local103, local127);
							} else {
								local135 = Static538.anInt9297 - local97;
								Static649.method5534(local113, local97, local135, local127);
								Static649.method5534(local113, 0, local103 - local135, local127);
							}
						} else {
							for (local127 = 0; local127 < local85; local127++) {
								local113[Static263.anInt5634 & local127 + arg3] = local113[arg4 + arg3 - local127 - 1 & Static263.anInt5634] = local127 * local23 / local85;
							}
							if (Static538.anInt9297 < local97 + local103) {
								local135 = Static538.anInt9297 - local97;
								Static649.method5534(local113, local97, local135, local23);
								Static649.method5534(local113, 0, local103 - local135, local23);
							} else {
								Static649.method5534(local113, local97, local103, local23);
							}
						}
					}
				}
			}
		} else if (arg4 + arg3 <= Static538.anInt9297) {
			for (local70 = 0; local70 < arg2; local70++) {
				Static649.method5534(arg5[local70 + arg0], arg3, arg4, local23);
			}
		} else {
			local70 = Static538.anInt9297 - arg3;
			for (local74 = 0; local74 < arg2; local74++) {
				@Pc(505) int[] local505 = arg5[arg0 + local74];
				Static649.method5534(local505, arg3, local70, local23);
				Static649.method5534(local505, 0, arg4 - local70, local23);
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass50_41.method1685(arg0);
		if (!super.aClass50_41.aBoolean135) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass50_41.method1693();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt3342 * Static538.anInt9297 >> 12;
		@Pc(58) int local58 = Static538.anInt9297 * this.anInt3345 >> 12;
		@Pc(65) int local65 = Static159.anInt8698 * this.anInt3343 >> 12;
		@Pc(72) int local72 = this.anInt3353 * Static159.anInt8698 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt3350 = this.anInt3346 * (Static538.anInt9297 / 8) >> 12;
		@Pc(95) int local95 = Static538.anInt9297 / local51 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt3354);
		while (true) {
			while (true) {
				@Pc(121) int local121 = local51 + Static221.method4149(local58 - local51, local110);
				@Pc(132) int local132 = local65 + Static221.method4149(local72 - local65, local110);
				@Pc(136) int local136 = local121 + local34;
				if (Static538.anInt9297 < local136) {
					local121 = Static538.anInt9297 - local34;
					local136 = Static538.anInt9297;
				}
				@Pc(188) int local188;
				@Pc(160) int local160;
				if (local40) {
					local188 = 0;
				} else {
					@Pc(154) int local154 = local36;
					@Pc(158) int[] local158 = local103[local36];
					local160 = 0;
					@Pc(164) int local164 = local136 + local28;
					if (local164 < 0) {
						local164 += Static538.anInt9297;
					}
					if (local164 > Static538.anInt9297) {
						local164 -= Static538.anInt9297;
					}
					local188 = local158[2];
					while (true) {
						@Pc(192) int[] local192 = local103[local154];
						if (local192[0] <= local164 && local192[1] >= local164) {
							if (local154 != local36) {
								@Pc(226) int local226 = local28 + local34;
								if (local226 < 0) {
									local226 += Static538.anInt9297;
								}
								if (local226 > Static538.anInt9297) {
									local226 -= Static538.anInt9297;
								}
								for (@Pc(244) int local244 = 1; local244 <= local160; local244++) {
									@Pc(254) int[] local254 = local103[(local244 + local36) % local42];
									local188 = Math.max(local188, local254[2]);
								}
								for (@Pc(266) int local266 = 0; local266 <= local160; local266++) {
									@Pc(276) int[] local276 = local103[(local266 + local36) % local42];
									@Pc(280) int local280 = local276[2];
									if (local280 != local188) {
										@Pc(291) int local291 = local276[0];
										@Pc(295) int local295 = local276[1];
										@Pc(306) int local306;
										@Pc(310) int local310;
										if (local226 < local164) {
											local306 = Math.max(local226, local291);
											local310 = Math.min(local164, local295);
										} else if (local291 == 0) {
											local310 = Math.min(local164, local295);
											local306 = 0;
										} else {
											local306 = Math.max(local226, local291);
											local310 = Static538.anInt9297;
										}
										this.method2788(local280, local110, local188 - local280, local32 + local306, local310 - local306, local26);
									}
								}
							}
							local36 = local154;
							break;
						}
						@Pc(209) int local209 = ~local42;
						local154++;
						if (local209 >= ~local154) {
							local154 = 0;
						}
						local160++;
					}
				}
				if (Static159.anInt8698 < local132 + local188) {
					local132 = Static159.anInt8698 - local188;
				} else {
					local38 = false;
				}
				@Pc(384) int[] local384;
				if (Static538.anInt9297 == local136) {
					this.method2788(local188, local110, local132, local34 + local30, local121, local26);
					if (local38) {
						return local17;
					}
					local38 = true;
					local384 = local99[local44++];
					local384[0] = local34;
					local384[1] = local136;
					local384[2] = local188 + local132;
					@Pc(449) int[][] local449 = local103;
					local103 = local99;
					local99 = local449;
					local42 = local44;
					local32 = local30;
					local44 = 0;
					local30 = Static221.method4149(Static538.anInt9297, local110);
					local28 = local30 - local32;
					local34 = 0;
					local160 = local28;
					if (local28 < 0) {
						local160 = local28 + Static538.anInt9297;
					}
					if (local160 > Static538.anInt9297) {
						local160 -= Static538.anInt9297;
					}
					local36 = 0;
					local40 = false;
					while (true) {
						@Pc(501) int[] local501 = local103[local36];
						if (local160 >= local501[0] && local501[1] >= local160) {
							break;
						}
						local36++;
						if (local36 >= local42) {
							local36 = 0;
						}
					}
				} else {
					local384 = local99[local44++];
					local384[2] = local132 + local188;
					local384[0] = local34;
					local384[1] = local136;
					this.method2788(local188, local110, local132, local30 + local34, local121, local26);
					local34 = local136;
				}
			}
		}
	}
}
