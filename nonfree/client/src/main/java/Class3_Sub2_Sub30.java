import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class3_Sub2_Sub30 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
	private int anInt7557;

	@OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
	private int anInt7547 = 0;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
	private int anInt7543 = 1024;

	@OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
	private int anInt7549 = 1024;

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
	private int anInt7544 = 0;

	@OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
	private int anInt7548 = 819;

	@OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
	private int anInt7551 = 2048;

	@OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
	private int anInt7554 = 1024;

	@OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
	private int anInt7556 = 1024;

	@OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
	private int anInt7553 = 409;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([[IIIIIILjava/util/Random;)V")
	private void method6592(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(19) int local19 = this.anInt7549 <= 0 ? 4096 : 4096 - Static512.method7419(this.anInt7549, arg5);
		@Pc(27) int local27 = this.anInt7557 * this.anInt7554 >> 12;
		@Pc(43) int local43 = this.anInt7557 - (local27 <= 0 ? 0 : Static512.method7419(local27, arg5));
		if (Static201.anInt3738 <= arg2) {
			arg2 -= Static201.anInt3738;
		}
		@Pc(76) int local76;
		@Pc(80) int local80;
		if (local43 > 0) {
			if (arg1 > 0 && arg4 > 0) {
				local76 = arg4 / 2;
				local80 = arg1 / 2;
				@Pc(91) int local91 = local76 >= local43 ? local43 : local76;
				@Pc(98) int local98 = local80 >= local43 ? local43 : local80;
				@Pc(102) int local102 = arg2 + local91;
				@Pc(109) int local109 = arg4 - local91 * 2;
				for (@Pc(111) int local111 = 0; local111 < arg1; local111++) {
					@Pc(119) int[] local119 = arg0[local111 + arg3];
					@Pc(128) int local128;
					@Pc(133) int local133;
					@Pc(141) int local141;
					if (local98 > local111) {
						local128 = local111 * local19 / local98;
						if (this.anInt7544 == 0) {
							for (local133 = 0; local133 < local91; local133++) {
								local141 = local19 * local133 / local91;
								local119[local133 + arg2 & Static201.anInt3740] = local119[Static201.anInt3740 & arg2 + arg4 - local133 - 1] = local141 * local128 >> 12;
							}
						} else {
							for (local133 = 0; local133 < local91; local133++) {
								local141 = local19 * local133 / local91;
								local119[arg2 + local133 & Static201.anInt3740] = local119[Static201.anInt3740 & arg2 + arg4 - local133 - 1] = local141 >= local128 ? local128 : local141;
							}
						}
						if (Static201.anInt3738 >= local102 + local109) {
							Static651.method751(local119, local102, local109, local128);
						} else {
							local133 = Static201.anInt3738 - local102;
							Static651.method751(local119, local102, local133, local128);
							Static651.method751(local119, 0, local109 - local133, local128);
						}
					} else {
						local128 = arg1 - local111 - 1;
						if (local98 > local128) {
							local133 = local19 * local128 / local98;
							@Pc(280) int local280;
							if (this.anInt7544 == 0) {
								for (local141 = 0; local141 < local91; local141++) {
									local280 = local19 * local141 / local91;
									local119[arg2 + local141 & Static201.anInt3740] = local119[Static201.anInt3740 & arg2 + arg4 - local141 - 1] = local280 * local133 >> 12;
								}
							} else {
								for (local141 = 0; local141 < local91; local141++) {
									local280 = local141 * local19 / local91;
									local119[Static201.anInt3740 & local141 + arg2] = local119[arg4 + arg2 - local141 - 1 & Static201.anInt3740] = local280 >= local133 ? local133 : local280;
								}
							}
							if (Static201.anInt3738 >= local102 + local109) {
								Static651.method751(local119, local102, local109, local133);
							} else {
								local141 = Static201.anInt3738 - local102;
								Static651.method751(local119, local102, local141, local133);
								Static651.method751(local119, 0, local109 - local141, local133);
							}
						} else {
							for (local133 = 0; local133 < local91; local133++) {
								local119[Static201.anInt3740 & arg2 + local133] = local119[arg2 + arg4 - local133 - 1 & Static201.anInt3740] = local133 * local19 / local91;
							}
							if (Static201.anInt3738 < local109 + local102) {
								local141 = Static201.anInt3738 - local102;
								Static651.method751(local119, local102, local141, local19);
								Static651.method751(local119, 0, local109 - local141, local19);
							} else {
								Static651.method751(local119, local102, local109, local19);
							}
						}
					}
				}
			}
		} else if (arg2 + arg4 > Static201.anInt3738) {
			local76 = Static201.anInt3738 - arg2;
			for (local80 = 0; local80 < arg1; local80++) {
				@Pc(490) int[] local490 = arg0[arg3 + local80];
				Static651.method751(local490, arg2, local76, local19);
				Static651.method751(local490, 0, arg4 - local76, local19);
			}
		} else {
			for (local76 = 0; local76 < arg1; local76++) {
				Static651.method751(arg0[local76 + arg3], arg2, arg4, local19);
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(23) int[] local23 = super.aClass84_41.method2125(arg0);
		if (!super.aClass84_41.aBoolean201) {
			return local23;
		}
		@Pc(32) int[][] local32 = super.aClass84_41.method2126();
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(44) boolean local44 = true;
		@Pc(46) boolean local46 = true;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50 = 0;
		@Pc(57) int local57 = this.anInt7543 * Static201.anInt3738 >> 12;
		@Pc(64) int local64 = this.anInt7551 * Static201.anInt3738 >> 12;
		@Pc(71) int local71 = this.anInt7553 * Static414.anInt7271 >> 12;
		@Pc(78) int local78 = Static414.anInt7271 * this.anInt7548 >> 12;
		if (local78 <= 1) {
			return local32[arg0];
		}
		this.anInt7557 = this.anInt7556 * (Static201.anInt3738 / 8) >> 12;
		@Pc(103) int local103 = Static201.anInt3738 / local57 + 1;
		@Pc(107) int[][] local107 = new int[local103][3];
		@Pc(111) int[][] local111 = new int[local103][3];
		@Pc(118) Random local118 = new Random((long) this.anInt7547);
		while (true) {
			while (true) {
				@Pc(128) int local128 = local57 + Static512.method7419(local64 - local57, local118);
				@Pc(138) int local138 = Static512.method7419(local78 - local71, local118) + local71;
				@Pc(142) int local142 = local40 + local128;
				if (local142 > Static201.anInt3738) {
					local128 = Static201.anInt3738 - local40;
					local142 = Static201.anInt3738;
				}
				@Pc(187) int local187;
				@Pc(162) int local162;
				if (local46) {
					local187 = 0;
				} else {
					@Pc(156) int local156 = local42;
					@Pc(160) int[] local160 = local111[local42];
					local162 = 0;
					@Pc(166) int local166 = local142 + local34;
					if (local166 < 0) {
						local166 += Static201.anInt3738;
					}
					if (Static201.anInt3738 < local166) {
						local166 -= Static201.anInt3738;
					}
					local187 = local160[2];
					while (true) {
						@Pc(191) int[] local191 = local111[local156];
						if (local191[0] <= local166 && local166 <= local191[1]) {
							if (local156 != local42) {
								@Pc(225) int local225 = local40 + local34;
								if (local225 < 0) {
									local225 += Static201.anInt3738;
								}
								if (Static201.anInt3738 < local225) {
									local225 -= Static201.anInt3738;
								}
								for (@Pc(243) int local243 = 1; local243 <= local162; local243++) {
									@Pc(253) int[] local253 = local111[(local42 + local243) % local48];
									local187 = Math.max(local187, local253[2]);
								}
								for (@Pc(265) int local265 = 0; local265 <= local162; local265++) {
									@Pc(275) int[] local275 = local111[(local265 + local42) % local48];
									@Pc(279) int local279 = local275[2];
									if (local187 != local279) {
										@Pc(286) int local286 = local275[0];
										@Pc(290) int local290 = local275[1];
										@Pc(301) int local301;
										@Pc(305) int local305;
										if (local166 > local225) {
											local301 = Math.max(local225, local286);
											local305 = Math.min(local166, local290);
										} else if (local286 == 0) {
											local301 = 0;
											local305 = Math.min(local166, local290);
										} else {
											local301 = Math.max(local225, local286);
											local305 = Static201.anInt3738;
										}
										this.method6592(local32, local187 - local279, local38 + local301, local279, local305 - local301, local118);
									}
								}
							}
							local42 = local156;
							break;
						}
						local156++;
						if (local156 >= local48) {
							local156 = 0;
						}
						local162++;
					}
				}
				if (local138 + local187 <= Static414.anInt7271) {
					local44 = false;
				} else {
					local138 = Static414.anInt7271 - local187;
				}
				@Pc(375) int[] local375;
				if (Static201.anInt3738 == local142) {
					this.method6592(local32, local138, local36 + local40, local187, local128, local118);
					if (local44) {
						return local23;
					}
					local44 = true;
					local375 = local107[local50++];
					local375[0] = local40;
					local375[2] = local187 + local138;
					local375[1] = local142;
					@Pc(443) int[][] local443 = local111;
					local111 = local107;
					local48 = local50;
					local107 = local443;
					local38 = local36;
					local50 = 0;
					local36 = Static512.method7419(Static201.anInt3738, local118);
					local34 = local36 - local38;
					local40 = 0;
					local162 = local34;
					if (local34 < 0) {
						local162 = local34 + Static201.anInt3738;
					}
					if (Static201.anInt3738 < local162) {
						local162 -= Static201.anInt3738;
					}
					local42 = 0;
					local46 = false;
					while (true) {
						@Pc(487) int[] local487 = local111[local42];
						if (local162 >= local487[0] && local162 <= local487[1]) {
							break;
						}
						@Pc(504) int local504 = ~local48;
						local42++;
						if (local504 >= ~local42) {
							local42 = 0;
						}
					}
				} else {
					local375 = local107[local50++];
					local375[1] = local142;
					local375[2] = local187 + local138;
					local375[0] = local40;
					this.method6592(local32, local138, local40 + local36, local187, local128, local118);
					local40 = local142;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7547 = arg0.method5633();
		} else if (arg1 == 1) {
			this.anInt7543 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt7551 = arg0.method5610();
		} else if (arg1 == 3) {
			this.anInt7553 = arg0.method5610();
		} else if (arg1 == 4) {
			this.anInt7548 = arg0.method5610();
		} else if (arg1 == 5) {
			this.anInt7556 = arg0.method5610();
		} else if (arg1 == 6) {
			this.anInt7544 = arg0.method5633();
		} else if (arg1 == 7) {
			this.anInt7554 = arg0.method5610();
		} else if (arg1 == 8) {
			this.anInt7549 = arg0.method5610();
		}
	}
}
