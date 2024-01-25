import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!waa", name = "K", descriptor = "I")
	private int anInt9463;

	@OriginalMember(owner = "client!waa", name = "E", descriptor = "I")
	private int anInt9458 = 1024;

	@OriginalMember(owner = "client!waa", name = "J", descriptor = "I")
	private int anInt9462 = 0;

	@OriginalMember(owner = "client!waa", name = "H", descriptor = "I")
	private int anInt9460 = 409;

	@OriginalMember(owner = "client!waa", name = "F", descriptor = "I")
	private int anInt9459 = 0;

	@OriginalMember(owner = "client!waa", name = "M", descriptor = "I")
	private int anInt9465 = 1024;

	@OriginalMember(owner = "client!waa", name = "I", descriptor = "I")
	private int anInt9461 = 819;

	@OriginalMember(owner = "client!waa", name = "R", descriptor = "I")
	private int anInt9467 = 1024;

	@OriginalMember(owner = "client!waa", name = "L", descriptor = "I")
	private int anInt9464 = 2048;

	@OriginalMember(owner = "client!waa", name = "Q", descriptor = "I")
	private int anInt9466 = 1024;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass152_41.method3216(arg0);
		if (!super.aClass152_41.aBoolean282) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass152_41.method3215();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt9466 * Static501.anInt8748 >> 12;
		@Pc(58) int local58 = this.anInt9464 * Static501.anInt8748 >> 12;
		@Pc(65) int local65 = this.anInt9460 * Static8.anInt5990 >> 12;
		@Pc(72) int local72 = Static8.anInt5990 * this.anInt9461 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt9463 = Static501.anInt8748 / 8 * this.anInt9458 >> 12;
		@Pc(97) int local97 = Static501.anInt8748 / local51 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt9462);
		while (true) {
			while (true) {
				@Pc(123) int local123 = local51 + Static46.method765(local58 - local51, local112);
				@Pc(134) int local134 = local65 + Static46.method765(local72 - local65, local112);
				@Pc(138) int local138 = local123 + local34;
				if (local138 > Static501.anInt8748) {
					local123 = Static501.anInt8748 - local34;
					local138 = Static501.anInt8748;
				}
				@Pc(152) int local152;
				@Pc(162) int local162;
				if (local40) {
					local152 = 0;
				} else {
					@Pc(156) int local156 = local36;
					@Pc(160) int[] local160 = local105[local36];
					local162 = 0;
					@Pc(166) int local166 = local28 + local138;
					if (local166 < 0) {
						local166 += Static501.anInt8748;
					}
					if (Static501.anInt8748 < local166) {
						local166 -= Static501.anInt8748;
					}
					while (true) {
						@Pc(187) int[] local187 = local105[local156];
						if (local187[0] <= local166 && local187[1] >= local166) {
							local152 = local160[2];
							if (local36 != local156) {
								@Pc(225) int local225 = local34 + local28;
								if (local225 < 0) {
									local225 += Static501.anInt8748;
								}
								if (Static501.anInt8748 < local225) {
									local225 -= Static501.anInt8748;
								}
								for (@Pc(243) int local243 = 1; local243 <= local162; local243++) {
									@Pc(253) int[] local253 = local105[(local36 + local243) % local42];
									local152 = Math.max(local152, local253[2]);
								}
								for (@Pc(269) int local269 = 0; local269 <= local162; local269++) {
									@Pc(279) int[] local279 = local105[(local269 + local36) % local42];
									@Pc(283) int local283 = local279[2];
									if (local152 != local283) {
										@Pc(290) int local290 = local279[0];
										@Pc(294) int local294 = local279[1];
										@Pc(305) int local305;
										@Pc(309) int local309;
										if (local166 > local225) {
											local305 = Math.max(local225, local290);
											local309 = Math.min(local166, local294);
										} else if (local290 == 0) {
											local305 = 0;
											local309 = Math.min(local166, local294);
										} else {
											local305 = Math.max(local225, local290);
											local309 = Static501.anInt8748;
										}
										this.method7701(local26, local112, local152 - local283, -local305 + local309, local283, local32 + local305);
									}
								}
							}
							local36 = local156;
							break;
						}
						local156++;
						if (local156 >= local42) {
							local156 = 0;
						}
						local162++;
					}
				}
				if (Static8.anInt5990 >= local152 + local134) {
					local38 = false;
				} else {
					local134 = Static8.anInt5990 - local152;
				}
				@Pc(377) int[] local377;
				if (local138 == Static501.anInt8748) {
					this.method7701(local26, local112, local134, local123, local152, local30 + local34);
					if (local38) {
						return local17;
					}
					local38 = true;
					local377 = local101[local44++];
					local377[1] = local138;
					local377[0] = local34;
					local377[2] = local152 + local134;
					@Pc(443) int[][] local443 = local105;
					local105 = local101;
					local42 = local44;
					local101 = local443;
					local44 = 0;
					local32 = local30;
					local30 = Static46.method765(Static501.anInt8748, local112);
					local34 = 0;
					local28 = local30 - local32;
					local162 = local28;
					if (local28 < 0) {
						local162 = local28 + Static501.anInt8748;
					}
					local36 = 0;
					if (Static501.anInt8748 < local162) {
						local162 -= Static501.anInt8748;
					}
					local40 = false;
					while (true) {
						@Pc(494) int[] local494 = local105[local36];
						if (local162 >= local494[0] && local494[1] >= local162) {
							break;
						}
						local36++;
						if (local36 >= local42) {
							local36 = 0;
						}
					}
				} else {
					local377 = local101[local44++];
					local377[1] = local138;
					local377[2] = local134 + local152;
					local377[0] = local34;
					this.method7701(local26, local112, local134, local123, local152, local30 + local34);
					local34 = local138;
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt9462 = arg1.method7974();
		} else if (arg0 == 1) {
			this.anInt9466 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anInt9464 = arg1.method7945();
		} else if (arg0 == 3) {
			this.anInt9460 = arg1.method7945();
		} else if (arg0 == 4) {
			this.anInt9461 = arg1.method7945();
		} else if (arg0 == 5) {
			this.anInt9458 = arg1.method7945();
		} else if (arg0 == 6) {
			this.anInt9459 = arg1.method7974();
		} else if (arg0 == 7) {
			this.anInt9467 = arg1.method7945();
		} else if (arg0 == 8) {
			this.anInt9465 = arg1.method7945();
		}
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "([[ILjava/util/Random;IIIBI)V")
	private void method7701(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(27) int local27 = this.anInt9465 <= 0 ? 4096 : 4096 - Static46.method765(this.anInt9465, arg1);
		@Pc(35) int local35 = this.anInt9467 * this.anInt9463 >> 12;
		@Pc(51) int local51 = this.anInt9463 - (local35 <= 0 ? 0 : Static46.method765(local35, arg1));
		if (arg5 >= Static501.anInt8748) {
			arg5 -= Static501.anInt8748;
		}
		@Pc(82) int local82;
		@Pc(86) int local86;
		if (local51 > 0) {
			if (arg2 > 0 && arg3 > 0) {
				local82 = arg3 / 2;
				local86 = arg2 / 2;
				@Pc(97) int local97 = local51 <= local82 ? local51 : local82;
				@Pc(108) int local108 = local51 > local86 ? local86 : local51;
				@Pc(112) int local112 = local97 + arg5;
				@Pc(119) int local119 = arg3 - local97 * 2;
				for (@Pc(121) int local121 = 0; local121 < arg2; local121++) {
					@Pc(129) int[] local129 = arg0[arg4 + local121];
					@Pc(138) int local138;
					@Pc(143) int local143;
					@Pc(151) int local151;
					if (local121 < local108) {
						local138 = local121 * local27 / local108;
						if (this.anInt9459 == 0) {
							for (local143 = 0; local143 < local97; local143++) {
								local151 = local27 * local143 / local97;
								local129[local143 + arg5 & Static326.anInt4973] = local129[arg3 + arg5 - local143 - 1 & Static326.anInt4973] = local151 * local138 >> 12;
							}
						} else {
							for (local143 = 0; local143 < local97; local143++) {
								local151 = local27 * local143 / local97;
								local129[Static326.anInt4973 & arg5 + local143] = local129[arg3 + arg5 - local143 - 1 & Static326.anInt4973] = local138 > local151 ? local151 : local138;
							}
						}
						if (Static501.anInt8748 >= local112 + local119) {
							Static598.method772(local129, local112, local119, local138);
						} else {
							local143 = Static501.anInt8748 - local112;
							Static598.method772(local129, local112, local143, local138);
							Static598.method772(local129, 0, local119 - local143, local138);
						}
					} else {
						local138 = arg2 - local121 - 1;
						if (local108 > local138) {
							local143 = local138 * local27 / local108;
							@Pc(301) int local301;
							if (this.anInt9459 == 0) {
								for (local151 = 0; local151 < local97; local151++) {
									local301 = local151 * local27 / local97;
									local129[Static326.anInt4973 & arg5 + local151] = local129[Static326.anInt4973 & arg5 + arg3 - local151 - 1] = local301 * local143 >> 12;
								}
							} else {
								for (local151 = 0; local151 < local97; local151++) {
									local301 = local151 * local27 / local97;
									local129[arg5 + local151 & Static326.anInt4973] = local129[arg3 + arg5 - local151 - 1 & Static326.anInt4973] = local143 > local301 ? local301 : local143;
								}
							}
							if (local119 + local112 <= Static501.anInt8748) {
								Static598.method772(local129, local112, local119, local143);
							} else {
								local151 = Static501.anInt8748 - local112;
								Static598.method772(local129, local112, local151, local143);
								Static598.method772(local129, 0, local119 - local151, local143);
							}
						} else {
							for (local143 = 0; local143 < local97; local143++) {
								local129[arg5 + local143 & Static326.anInt4973] = local129[arg5 + arg3 - local143 - 1 & Static326.anInt4973] = local143 * local27 / local97;
							}
							if (Static501.anInt8748 >= local119 + local112) {
								Static598.method772(local129, local112, local119, local27);
							} else {
								local151 = Static501.anInt8748 - local112;
								Static598.method772(local129, local112, local151, local27);
								Static598.method772(local129, 0, local119 - local151, local27);
							}
						}
					}
				}
			}
		} else if (arg5 + arg3 <= Static501.anInt8748) {
			for (local82 = 0; local82 < arg2; local82++) {
				Static598.method772(arg0[local82 + arg4], arg5, arg3, local27);
			}
		} else {
			local82 = Static501.anInt8748 - arg5;
			for (local86 = 0; local86 < arg2; local86++) {
				@Pc(523) int[] local523 = arg0[local86 + arg4];
				Static598.method772(local523, arg5, local82, local27);
				Static598.method772(local523, 0, arg3 - local82, local27);
			}
		}
	}
}
