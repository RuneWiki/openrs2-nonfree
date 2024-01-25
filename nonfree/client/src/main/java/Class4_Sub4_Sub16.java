import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class4_Sub4_Sub16 extends Class4_Sub4 {

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
	private int anInt3486;

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
	private int anInt3490 = 1024;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
	private int anInt3491 = 1024;

	@OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
	private int anInt3496 = 0;

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
	private int anInt3488 = 1024;

	@OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
	private int anInt3503 = 2048;

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
	private int anInt3487 = 0;

	@OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
	private int anInt3499 = 819;

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
	private int anInt3489 = 409;

	@OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
	private int anInt3502 = 1024;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass207_41.method5470(arg0);
		if (!super.aClass207_41.aBoolean572) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass207_41.method5468();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = Static124.anInt3576 * this.anInt3488 >> 12;
		@Pc(58) int local58 = Static124.anInt3576 * this.anInt3503 >> 12;
		@Pc(65) int local65 = this.anInt3489 * Static331.anInt6571 >> 12;
		@Pc(72) int local72 = this.anInt3499 * Static331.anInt6571 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt3486 = this.anInt3490 * (Static124.anInt3576 / 8) >> 12;
		@Pc(95) int local95 = Static124.anInt3576 / local51 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt3487);
		while (true) {
			while (true) {
				@Pc(121) int local121 = local51 + Static130.method2621(local110, local58 - local51);
				@Pc(134) int local134 = local65 + Static130.method2621(local110, local72 - local65);
				@Pc(138) int local138 = local121 + local34;
				if (Static124.anInt3576 < local138) {
					local138 = Static124.anInt3576;
					local121 = Static124.anInt3576 - local34;
				}
				@Pc(152) int local152;
				@Pc(162) int local162;
				if (local40) {
					local152 = 0;
				} else {
					@Pc(156) int local156 = local36;
					@Pc(160) int[] local160 = local103[local36];
					local162 = 0;
					@Pc(166) int local166 = local138 + local28;
					if (local166 < 0) {
						local166 += Static124.anInt3576;
					}
					if (Static124.anInt3576 < local166) {
						local166 -= Static124.anInt3576;
					}
					while (true) {
						@Pc(186) int[] local186 = local103[local156];
						if (local166 >= local186[0] && local166 <= local186[1]) {
							local152 = local160[2];
							if (local36 != local156) {
								@Pc(224) int local224 = local34 + local28;
								if (local224 < 0) {
									local224 += Static124.anInt3576;
								}
								if (local224 > Static124.anInt3576) {
									local224 -= Static124.anInt3576;
								}
								for (@Pc(243) int local243 = 1; local243 <= local162; local243++) {
									@Pc(254) int[] local254 = local103[(local36 + local243) % local42];
									local152 = Math.max(local152, local254[2]);
								}
								for (@Pc(270) int local270 = 0; local270 <= local162; local270++) {
									@Pc(280) int[] local280 = local103[(local270 + local36) % local42];
									@Pc(284) int local284 = local280[2];
									if (local152 != local284) {
										@Pc(295) int local295 = local280[0];
										@Pc(299) int local299 = local280[1];
										@Pc(315) int local315;
										@Pc(317) int local317;
										if (local224 < local166) {
											local315 = Math.max(local224, local295);
											local317 = Math.min(local166, local299);
										} else if (local295 == 0) {
											local317 = Math.min(local166, local299);
											local315 = 0;
										} else {
											local315 = Math.max(local224, local295);
											local317 = Static124.anInt3576;
										}
										this.method3023(local32 + local315, local26, local110, local152 - local284, local284, local317 - local315);
									}
								}
							}
							local36 = local156;
							break;
						}
						local162++;
						local156++;
						if (local42 <= local156) {
							local156 = 0;
						}
					}
				}
				if (Static331.anInt6571 < local152 + local134) {
					local134 = Static331.anInt6571 - local152;
				} else {
					local38 = false;
				}
				@Pc(384) int[] local384;
				if (Static124.anInt3576 == local138) {
					this.method3023(local34 + local30, local26, local110, local134, local152, local121);
					if (local38) {
						return local17;
					}
					local38 = true;
					local384 = local99[local44++];
					local384[2] = local152 + local134;
					local384[0] = local34;
					local384[1] = local138;
					@Pc(450) int[][] local450 = local103;
					local103 = local99;
					local99 = local450;
					local42 = local44;
					local44 = 0;
					local32 = local30;
					local30 = Static130.method2621(local110, Static124.anInt3576);
					local28 = local30 - local32;
					local34 = 0;
					local162 = local28;
					if (local28 < 0) {
						local162 = local28 + Static124.anInt3576;
					}
					if (Static124.anInt3576 < local162) {
						local162 -= Static124.anInt3576;
					}
					local36 = 0;
					local40 = false;
					while (true) {
						@Pc(504) int[] local504 = local103[local36];
						if (local504[0] <= local162 && local504[1] >= local162) {
							break;
						}
						local36++;
						if (local36 >= local42) {
							local36 = 0;
						}
					}
				} else {
					local384 = local99[local44++];
					local384[1] = local138;
					local384[0] = local34;
					local384[2] = local134 + local152;
					this.method3023(local34 + local30, local26, local110, local134, local152, local121);
					local34 = local138;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3487 = arg1.method2380();
		} else if (arg0 == 1) {
			this.anInt3488 = arg1.method2404();
		} else if (arg0 == 2) {
			this.anInt3503 = arg1.method2404();
		} else if (arg0 == 3) {
			this.anInt3489 = arg1.method2404();
		} else if (arg0 == 4) {
			this.anInt3499 = arg1.method2404();
		} else if (arg0 == 5) {
			this.anInt3490 = arg1.method2404();
		} else if (arg0 == 6) {
			this.anInt3496 = arg1.method2380();
		} else if (arg0 == 7) {
			this.anInt3491 = arg1.method2404();
		} else if (arg0 == 8) {
			this.anInt3502 = arg1.method2404();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[[ILjava/util/Random;IIII)V")
	private void method3023(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21 = this.anInt3502 > 0 ? 4096 - Static130.method2621(arg2, this.anInt3502) : 4096;
		@Pc(29) int local29 = this.anInt3486 * this.anInt3491 >> 12;
		@Pc(45) int local45 = this.anInt3486 - (local29 <= 0 ? 0 : Static130.method2621(arg2, local29));
		if (Static124.anInt3576 <= arg0) {
			arg0 -= Static124.anInt3576;
		}
		@Pc(66) int local66;
		@Pc(70) int local70;
		if (local45 > 0) {
			if (arg3 > 0 && arg5 > 0) {
				local66 = arg5 / 2;
				local70 = arg3 / 2;
				@Pc(77) int local77 = local66 < local45 ? local66 : local45;
				@Pc(88) int local88 = local70 < local45 ? local70 : local45;
				@Pc(92) int local92 = local77 + arg0;
				@Pc(98) int local98 = arg5 - local77 * 2;
				for (@Pc(100) int local100 = 0; local100 < arg3; local100++) {
					@Pc(108) int[] local108 = arg1[arg4 + local100];
					@Pc(121) int local121;
					@Pc(126) int local126;
					@Pc(134) int local134;
					if (local88 > local100) {
						local121 = local100 * local21 / local88;
						if (this.anInt3496 == 0) {
							for (local126 = 0; local126 < local77; local126++) {
								local134 = local21 * local126 / local77;
								local108[Static350.anInt6802 & local126 + arg0] = local108[Static350.anInt6802 & arg0 + arg5 - local126 - 1] = local121 * local134 >> 12;
							}
						} else {
							for (local126 = 0; local126 < local77; local126++) {
								local134 = local21 * local126 / local77;
								local108[local126 + arg0 & Static350.anInt6802] = local108[Static350.anInt6802 & arg5 + arg0 - local126 - 1] = local134 < local121 ? local134 : local121;
							}
						}
						if (local98 + local92 <= Static124.anInt3576) {
							Static363.method4758(local108, local92, local98, local121);
						} else {
							local126 = Static124.anInt3576 - local92;
							Static363.method4758(local108, local92, local126, local121);
							Static363.method4758(local108, 0, local98 - local126, local121);
						}
					} else {
						local121 = arg3 - local100 - 1;
						if (local121 < local88) {
							local126 = local21 * local121 / local88;
							@Pc(276) int local276;
							if (this.anInt3496 == 0) {
								for (local134 = 0; local134 < local77; local134++) {
									local276 = local21 * local134 / local77;
									local108[arg0 + local134 & Static350.anInt6802] = local108[arg0 + arg5 - local134 - 1 & Static350.anInt6802] = local276 * local126 >> 12;
								}
							} else {
								for (local134 = 0; local134 < local77; local134++) {
									local276 = local134 * local21 / local77;
									local108[Static350.anInt6802 & local134 + arg0] = local108[Static350.anInt6802 & arg5 + arg0 - local134 - 1] = local276 >= local126 ? local126 : local276;
								}
							}
							if (Static124.anInt3576 >= local98 + local92) {
								Static363.method4758(local108, local92, local98, local126);
							} else {
								local134 = Static124.anInt3576 - local92;
								Static363.method4758(local108, local92, local134, local126);
								Static363.method4758(local108, 0, local98 - local134, local126);
							}
						} else {
							for (local126 = 0; local126 < local77; local126++) {
								local108[Static350.anInt6802 & arg0 + local126] = local108[Static350.anInt6802 & arg5 + arg0 - local126 - 1] = local126 * local21 / local77;
							}
							if (Static124.anInt3576 >= local98 + local92) {
								Static363.method4758(local108, local92, local98, local21);
							} else {
								local134 = Static124.anInt3576 - local92;
								Static363.method4758(local108, local92, local134, local21);
								Static363.method4758(local108, 0, local98 - local134, local21);
							}
						}
					}
				}
			}
		} else if (Static124.anInt3576 < arg5 + arg0) {
			local66 = Static124.anInt3576 - arg0;
			for (local70 = 0; local70 < arg3; local70++) {
				@Pc(481) int[] local481 = arg1[arg4 + local70];
				Static363.method4758(local481, arg0, local66, local21);
				Static363.method4758(local481, 0, arg5 - local66, local21);
			}
		} else {
			for (local66 = 0; local66 < arg3; local66++) {
				Static363.method4758(arg1[local66 + arg4], arg0, arg5, local21);
			}
		}
	}
}
