import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
	private int anInt267 = 409;

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
	private int anInt274 = 819;

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
	private int anInt266 = 1024;

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
	private int anInt277 = 2048;

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
	private int anInt265 = 1024;

	@OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
	private int anInt279 = 1024;

	@OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
	private int anInt271 = 0;

	@OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
	private int anInt278 = 1024;

	@OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
	private int anInt275 = 0;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/util/Random;[[IIIBII)V")
	private void method245(@OriginalArg(0) Random arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(27) int local27 = this.anInt279 <= 0 ? 4096 : 4096 - Static235.method3704(this.anInt279, arg0);
		@Pc(35) int local35 = this.anInt280 * this.anInt278 >> 12;
		@Pc(48) int local48 = this.anInt280 - (local35 <= 0 ? 0 : Static235.method3704(local35, arg0));
		if (Static185.anInt4925 <= arg2) {
			arg2 -= Static185.anInt4925;
		}
		@Pc(76) int local76;
		@Pc(80) int local80;
		if (local48 > 0) {
			if (arg4 > 0 && arg5 > 0) {
				local76 = arg5 / 2;
				local80 = arg4 / 2;
				@Pc(87) int local87 = local48 > local76 ? local76 : local48;
				@Pc(94) int local94 = local48 > local80 ? local80 : local48;
				@Pc(98) int local98 = local87 + arg2;
				@Pc(105) int local105 = arg5 - local87 * 2;
				for (@Pc(107) int local107 = 0; local107 < arg4; local107++) {
					@Pc(115) int[] local115 = arg1[arg3 + local107];
					@Pc(124) int local124;
					@Pc(129) int local129;
					@Pc(137) int local137;
					if (local107 < local94) {
						local124 = local107 * local27 / local94;
						if (this.anInt271 == 0) {
							for (local129 = 0; local129 < local87; local129++) {
								local137 = local129 * local27 / local87;
								local115[Static64.anInt1348 & arg2 + local129] = local115[arg5 + arg2 - local129 - 1 & Static64.anInt1348] = local124 * local137 >> 12;
							}
						} else {
							for (local129 = 0; local129 < local87; local129++) {
								local137 = local27 * local129 / local87;
								local115[Static64.anInt1348 & local129 + arg2] = local115[Static64.anInt1348 & arg2 + arg5 - local129 - 1] = local137 >= local124 ? local124 : local137;
							}
						}
						if (local98 + local105 <= Static185.anInt4925) {
							Static459.method5349(local115, local98, local105, local124);
						} else {
							local129 = Static185.anInt4925 - local98;
							Static459.method5349(local115, local98, local129, local124);
							Static459.method5349(local115, 0, local105 - local129, local124);
						}
					} else {
						local124 = arg4 - local107 - 1;
						if (local124 < local94) {
							local129 = local124 * local27 / local94;
							@Pc(279) int local279;
							if (this.anInt271 == 0) {
								for (local137 = 0; local137 < local87; local137++) {
									local279 = local137 * local27 / local87;
									local115[arg2 + local137 & Static64.anInt1348] = local115[Static64.anInt1348 & arg5 + arg2 - local137 - 1] = local129 * local279 >> 12;
								}
							} else {
								for (local137 = 0; local137 < local87; local137++) {
									local279 = local137 * local27 / local87;
									local115[Static64.anInt1348 & arg2 + local137] = local115[arg2 + arg5 - local137 - 1 & Static64.anInt1348] = local279 >= local129 ? local129 : local279;
								}
							}
							if (local98 + local105 <= Static185.anInt4925) {
								Static459.method5349(local115, local98, local105, local129);
							} else {
								local137 = Static185.anInt4925 - local98;
								Static459.method5349(local115, local98, local137, local129);
								Static459.method5349(local115, 0, local105 - local137, local129);
							}
						} else {
							for (local129 = 0; local129 < local87; local129++) {
								local115[local129 + arg2 & Static64.anInt1348] = local115[Static64.anInt1348 & arg5 + arg2 - local129 - 1] = local27 * local129 / local87;
							}
							if (Static185.anInt4925 < local105 + local98) {
								local137 = Static185.anInt4925 - local98;
								Static459.method5349(local115, local98, local137, local27);
								Static459.method5349(local115, 0, local105 - local137, local27);
							} else {
								Static459.method5349(local115, local98, local105, local27);
							}
						}
					}
				}
			}
		} else if (Static185.anInt4925 < arg5 + arg2) {
			local76 = Static185.anInt4925 - arg2;
			for (local80 = 0; local80 < arg4; local80++) {
				@Pc(483) int[] local483 = arg1[local80 + arg3];
				Static459.method5349(local483, arg2, local76, local27);
				Static459.method5349(local483, 0, arg5 - local76, local27);
			}
		} else {
			for (local76 = 0; local76 < arg4; local76++) {
				Static459.method5349(arg1[arg3 + local76], arg2, arg5, local27);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt275 = arg0.method3111();
		} else if (arg1 == 1) {
			this.anInt265 = arg0.method3108();
		} else if (arg1 == 2) {
			this.anInt277 = arg0.method3108();
		} else if (arg1 == 3) {
			this.anInt267 = arg0.method3108();
		} else if (arg1 == 4) {
			this.anInt274 = arg0.method3108();
		} else if (arg1 == 5) {
			this.anInt266 = arg0.method3108();
		} else if (arg1 == 6) {
			this.anInt271 = arg0.method3111();
		} else if (arg1 == 7) {
			this.anInt278 = arg0.method3108();
		} else if (arg1 == 8) {
			this.anInt279 = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (!super.aClass100_41.aBoolean185) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass100_41.method2224();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static185.anInt4925 * this.anInt265 >> 12;
		@Pc(52) int local52 = Static185.anInt4925 * this.anInt277 >> 12;
		@Pc(59) int local59 = Static345.anInt5779 * this.anInt267 >> 12;
		@Pc(66) int local66 = Static345.anInt5779 * this.anInt274 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt280 = this.anInt266 * (Static185.anInt4925 / 8) >> 12;
		@Pc(91) int local91 = Static185.anInt4925 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt275);
		while (true) {
			while (true) {
				@Pc(116) int local116 = Static235.method3704(local52 - local45, local106) + local45;
				@Pc(126) int local126 = local59 + Static235.method3704(local66 - local59, local106);
				@Pc(131) int local131 = local28 + local116;
				if (local131 > Static185.anInt4925) {
					local116 = Static185.anInt4925 - local28;
					local131 = Static185.anInt4925;
				}
				@Pc(145) int local145;
				@Pc(155) int local155;
				if (local34) {
					local145 = 0;
				} else {
					@Pc(149) int local149 = local30;
					@Pc(153) int[] local153 = local99[local30];
					local155 = 0;
					@Pc(160) int local160 = local131 + local22;
					if (local160 < 0) {
						local160 += Static185.anInt4925;
					}
					if (local160 > Static185.anInt4925) {
						local160 -= Static185.anInt4925;
					}
					local145 = local153[2];
					while (true) {
						@Pc(181) int[] local181 = local99[local149];
						if (local181[0] <= local160 && local160 <= local181[1]) {
							if (local149 != local30) {
								@Pc(219) int local219 = local28 + local22;
								if (local219 < 0) {
									local219 += Static185.anInt4925;
								}
								if (local219 > Static185.anInt4925) {
									local219 -= Static185.anInt4925;
								}
								for (@Pc(241) int local241 = 1; local241 <= local155; local241++) {
									@Pc(251) int[] local251 = local99[(local241 + local30) % local36];
									local145 = Math.max(local145, local251[2]);
								}
								for (@Pc(263) int local263 = 0; local263 <= local155; local263++) {
									@Pc(273) int[] local273 = local99[(local30 + local263) % local36];
									@Pc(277) int local277 = local273[2];
									if (local277 != local145) {
										@Pc(284) int local284 = local273[0];
										@Pc(288) int local288 = local273[1];
										@Pc(297) int local297;
										@Pc(299) int local299;
										if (local160 > local219) {
											local297 = Math.max(local219, local284);
											local299 = Math.min(local160, local288);
										} else if (local284 == 0) {
											local299 = Math.min(local160, local288);
											local297 = 0;
										} else {
											local297 = Math.max(local219, local284);
											local299 = Static185.anInt4925;
										}
										this.method245(local106, local20, local26 + local297, local277, local145 - local277, local299 + -local297);
									}
								}
							}
							local30 = local149;
							break;
						}
						local149++;
						if (local36 <= local149) {
							local149 = 0;
						}
						local155++;
					}
				}
				if (Static345.anInt5779 < local145 + local126) {
					local126 = Static345.anInt5779 - local145;
				} else {
					local32 = false;
				}
				@Pc(362) int[] local362;
				if (Static185.anInt4925 == local131) {
					this.method245(local106, local20, local24 + local28, local145, local126, local116);
					if (local32) {
						return local11;
					}
					local32 = true;
					local362 = local95[local38++];
					local362[2] = local126 + local145;
					local362[1] = local131;
					local362[0] = local28;
					@Pc(428) int[][] local428 = local99;
					local99 = local95;
					local36 = local38;
					local95 = local428;
					local38 = 0;
					local26 = local24;
					local24 = Static235.method3704(Static185.anInt4925, local106);
					local22 = local24 - local26;
					local28 = 0;
					local155 = local22;
					if (local22 < 0) {
						local155 = local22 + Static185.anInt4925;
					}
					if (Static185.anInt4925 < local155) {
						local155 -= Static185.anInt4925;
					}
					local30 = 0;
					while (true) {
						@Pc(471) int[] local471 = local99[local30];
						if (local155 >= local471[0] && local471[1] >= local155) {
							local34 = false;
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local362 = local95[local38++];
					local362[0] = local28;
					local362[2] = local145 + local126;
					local362[1] = local131;
					this.method245(local106, local20, local28 + local24, local145, local126, local116);
					local28 = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
	}
}
