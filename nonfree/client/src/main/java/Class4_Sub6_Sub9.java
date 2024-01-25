import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class4_Sub6_Sub9 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ev", name = "C", descriptor = "I")
	private int anInt2006;

	@OriginalMember(owner = "client!ev", name = "I", descriptor = "I")
	private int anInt2011 = 1024;

	@OriginalMember(owner = "client!ev", name = "E", descriptor = "I")
	private int anInt2008 = 1024;

	@OriginalMember(owner = "client!ev", name = "H", descriptor = "I")
	private int anInt2010 = 2048;

	@OriginalMember(owner = "client!ev", name = "R", descriptor = "I")
	private int anInt2019 = 1024;

	@OriginalMember(owner = "client!ev", name = "O", descriptor = "I")
	private int anInt2016 = 0;

	@OriginalMember(owner = "client!ev", name = "P", descriptor = "I")
	private int anInt2017 = 819;

	@OriginalMember(owner = "client!ev", name = "D", descriptor = "I")
	private int anInt2007 = 1024;

	@OriginalMember(owner = "client!ev", name = "J", descriptor = "I")
	private int anInt2012 = 409;

	@OriginalMember(owner = "client!ev", name = "T", descriptor = "I")
	private int anInt2021 = 0;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (!super.aClass82_41.aBoolean243) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass82_41.method2263();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt2019 * Static80.anInt1616 >> 12;
		@Pc(52) int local52 = this.anInt2010 * Static80.anInt1616 >> 12;
		@Pc(59) int local59 = Static262.anInt4939 * this.anInt2012 >> 12;
		@Pc(66) int local66 = this.anInt2017 * Static262.anInt4939 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt2006 = Static80.anInt1616 / 8 * this.anInt2011 >> 12;
		@Pc(91) int local91 = Static80.anInt1616 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt2021);
		while (true) {
			while (true) {
				@Pc(116) int local116 = local45 + Static226.method3443(local106, local52 - local45);
				@Pc(125) int local125 = Static226.method3443(local106, local66 - local59) + local59;
				@Pc(129) int local129 = local116 + local28;
				if (local129 > Static80.anInt1616) {
					local129 = Static80.anInt1616;
					local116 = Static80.anInt1616 - local28;
				}
				@Pc(146) int local146;
				@Pc(156) int local156;
				if (local34) {
					local146 = 0;
				} else {
					@Pc(150) int local150 = local30;
					@Pc(154) int[] local154 = local99[local30];
					local156 = 0;
					@Pc(161) int local161 = local129 + local22;
					if (local161 < 0) {
						local161 += Static80.anInt1616;
					}
					if (Static80.anInt1616 < local161) {
						local161 -= Static80.anInt1616;
					}
					local146 = local154[2];
					while (true) {
						@Pc(185) int[] local185 = local99[local150];
						if (local161 >= local185[0] && local161 <= local185[1]) {
							if (local150 != local30) {
								@Pc(219) int local219 = local28 + local22;
								if (local219 < 0) {
									local219 += Static80.anInt1616;
								}
								if (local219 > Static80.anInt1616) {
									local219 -= Static80.anInt1616;
								}
								for (@Pc(237) int local237 = 1; local237 <= local156; local237++) {
									@Pc(248) int[] local248 = local99[(local30 + local237) % local36];
									local146 = Math.max(local146, local248[2]);
								}
								for (@Pc(264) int local264 = 0; local264 <= local156; local264++) {
									@Pc(274) int[] local274 = local99[(local264 + local30) % local36];
									@Pc(278) int local278 = local274[2];
									if (local278 != local146) {
										@Pc(285) int local285 = local274[0];
										@Pc(289) int local289 = local274[1];
										@Pc(301) int local301;
										@Pc(303) int local303;
										if (local161 > local219) {
											local301 = Math.max(local219, local285);
											local303 = Math.min(local161, local289);
										} else if (local285 == 0) {
											local303 = Math.min(local161, local289);
											local301 = 0;
										} else {
											local301 = Math.max(local219, local285);
											local303 = Static80.anInt1616;
										}
										this.method1776(local278, local146 - local278, -local301 + local303, local20, local26 + local301, local106);
									}
								}
							}
							local30 = local150;
							break;
						}
						local150++;
						if (local36 <= local150) {
							local150 = 0;
						}
						local156++;
					}
				}
				if (local125 + local146 <= Static262.anInt4939) {
					local32 = false;
				} else {
					local125 = Static262.anInt4939 - local146;
				}
				@Pc(381) int[] local381;
				if (Static80.anInt1616 == local129) {
					this.method1776(local146, local125, local116, local20, local28 + local24, local106);
					if (local32) {
						return local11;
					}
					local32 = true;
					local381 = local95[local38++];
					local381[1] = local129;
					local381[0] = local28;
					local381[2] = local125 + local146;
					@Pc(397) int[][] local397 = local99;
					local99 = local95;
					local36 = local38;
					local95 = local397;
					local26 = local24;
					local38 = 0;
					local24 = Static226.method3443(local106, Static80.anInt1616);
					local22 = local24 - local26;
					local28 = 0;
					local156 = local22;
					if (local22 < 0) {
						local156 = local22 + Static80.anInt1616;
					}
					if (local156 > Static80.anInt1616) {
						local156 -= Static80.anInt1616;
					}
					local30 = 0;
					while (true) {
						@Pc(444) int[] local444 = local99[local30];
						if (local444[0] <= local156 && local156 <= local444[1]) {
							local34 = false;
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local381 = local95[local38++];
					local381[2] = local125 + local146;
					local381[0] = local28;
					local381[1] = local129;
					this.method1776(local146, local125, local116, local20, local28 + local24, local106);
					local28 = local129;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIII[[IILjava/util/Random;)V")
	private void method1776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(22) int local22 = this.anInt2008 <= 0 ? 4096 : 4096 - Static226.method3443(arg5, this.anInt2008);
		@Pc(30) int local30 = this.anInt2007 * this.anInt2006 >> 12;
		@Pc(45) int local45 = this.anInt2006 - (local30 > 0 ? Static226.method3443(arg5, local30) : 0);
		if (Static80.anInt1616 <= arg4) {
			arg4 -= Static80.anInt1616;
		}
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local45 > 0) {
			if (arg1 > 0 && arg2 > 0) {
				local67 = arg2 / 2;
				local71 = arg1 / 2;
				@Pc(78) int local78 = local67 < local45 ? local67 : local45;
				@Pc(85) int local85 = local45 > local71 ? local71 : local45;
				@Pc(89) int local89 = arg4 + local78;
				@Pc(96) int local96 = arg2 - local78 * 2;
				for (@Pc(98) int local98 = 0; local98 < arg1; local98++) {
					@Pc(107) int[] local107 = arg3[local98 + arg0];
					@Pc(116) int local116;
					@Pc(121) int local121;
					@Pc(129) int local129;
					if (local85 > local98) {
						local116 = local22 * local98 / local85;
						if (this.anInt2016 == 0) {
							for (local121 = 0; local121 < local78; local121++) {
								local129 = local121 * local22 / local78;
								local107[local121 + arg4 & Static203.anInt3883] = local107[Static203.anInt3883 & arg2 + arg4 - local121 - 1] = local129 * local116 >> 12;
							}
						} else {
							for (local121 = 0; local121 < local78; local121++) {
								local129 = local22 * local121 / local78;
								local107[arg4 + local121 & Static203.anInt3883] = local107[arg2 + arg4 - local121 - 1 & Static203.anInt3883] = local116 > local129 ? local129 : local116;
							}
						}
						if (local89 + local96 > Static80.anInt1616) {
							local121 = Static80.anInt1616 - local89;
							Static459.method3327(local107, local89, local121, local116);
							Static459.method3327(local107, 0, local96 - local121, local116);
						} else {
							Static459.method3327(local107, local89, local96, local116);
						}
					} else {
						local116 = arg1 - local98 - 1;
						if (local85 > local116) {
							local121 = local22 * local116 / local85;
							@Pc(264) int local264;
							if (this.anInt2016 == 0) {
								for (local129 = 0; local129 < local78; local129++) {
									local264 = local22 * local129 / local78;
									local107[local129 + arg4 & Static203.anInt3883] = local107[Static203.anInt3883 & arg4 + arg2 - local129 - 1] = local264 * local121 >> 12;
								}
							} else {
								for (local129 = 0; local129 < local78; local129++) {
									local264 = local22 * local129 / local78;
									local107[local129 + arg4 & Static203.anInt3883] = local107[Static203.anInt3883 & arg2 + arg4 - local129 - 1] = local264 >= local121 ? local121 : local264;
								}
							}
							if (Static80.anInt1616 < local96 + local89) {
								local129 = Static80.anInt1616 - local89;
								Static459.method3327(local107, local89, local129, local121);
								Static459.method3327(local107, 0, local96 - local129, local121);
							} else {
								Static459.method3327(local107, local89, local96, local121);
							}
						} else {
							for (local121 = 0; local121 < local78; local121++) {
								local107[local121 + arg4 & Static203.anInt3883] = local107[Static203.anInt3883 & arg2 + arg4 - local121 - 1] = local121 * local22 / local78;
							}
							if (local89 + local96 <= Static80.anInt1616) {
								Static459.method3327(local107, local89, local96, local22);
							} else {
								local129 = Static80.anInt1616 - local89;
								Static459.method3327(local107, local89, local129, local22);
								Static459.method3327(local107, 0, local96 - local129, local22);
							}
						}
					}
				}
			}
		} else if (arg4 + arg2 <= Static80.anInt1616) {
			for (local67 = 0; local67 < arg1; local67++) {
				Static459.method3327(arg3[arg0 + local67], arg4, arg2, local22);
			}
		} else {
			local67 = Static80.anInt1616 - arg4;
			for (local71 = 0; local71 < arg1; local71++) {
				@Pc(481) int[] local481 = arg3[arg0 + local71];
				Static459.method3327(local481, arg4, local67, local22);
				Static459.method3327(local481, 0, arg2 - local67, local22);
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt2021 = arg1.method2490();
		} else if (arg0 == 1) {
			this.anInt2019 = arg1.method2536();
		} else if (arg0 == 2) {
			this.anInt2010 = arg1.method2536();
		} else if (arg0 == 3) {
			this.anInt2012 = arg1.method2536();
		} else if (arg0 == 4) {
			this.anInt2017 = arg1.method2536();
		} else if (arg0 == 5) {
			this.anInt2011 = arg1.method2536();
		} else if (arg0 == 6) {
			this.anInt2016 = arg1.method2490();
		} else if (arg0 == 7) {
			this.anInt2007 = arg1.method2536();
		} else if (arg0 == 8) {
			this.anInt2008 = arg1.method2536();
		}
	}
}
