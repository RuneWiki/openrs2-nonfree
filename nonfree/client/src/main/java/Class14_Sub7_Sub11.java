import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class14_Sub7_Sub11 extends Class14_Sub7 {

	@OriginalMember(owner = "client!en", name = "S", descriptor = "I")
	private int anInt2231;

	@OriginalMember(owner = "client!en", name = "T", descriptor = "I")
	private int anInt2223 = 409;

	@OriginalMember(owner = "client!en", name = "bb", descriptor = "I")
	private int anInt2233 = 819;

	@OriginalMember(owner = "client!en", name = "db", descriptor = "I")
	private int anInt2234 = 1024;

	@OriginalMember(owner = "client!en", name = "Q", descriptor = "I")
	private int anInt2235 = 2048;

	@OriginalMember(owner = "client!en", name = "Z", descriptor = "I")
	private int anInt2237 = 1024;

	@OriginalMember(owner = "client!en", name = "O", descriptor = "I")
	private int anInt2236 = 1024;

	@OriginalMember(owner = "client!en", name = "J", descriptor = "I")
	private int anInt2228 = 0;

	@OriginalMember(owner = "client!en", name = "V", descriptor = "I")
	private int anInt2226 = 0;

	@OriginalMember(owner = "client!en", name = "M", descriptor = "I")
	private int anInt2241 = 1024;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIILjava/util/Random;I[[II)V")
	private void method2129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Random arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5) {
		@Pc(19) int local19 = this.anInt2236 <= 0 ? 4096 : 4096 - Static645.method9067(this.anInt2236, arg3);
		@Pc(27) int local27 = this.anInt2231 * this.anInt2234 >> 12;
		@Pc(43) int local43 = this.anInt2231 - (local27 <= 0 ? 0 : Static645.method9067(local27, arg3));
		if (Static613.anInt10114 <= arg1) {
			arg1 -= Static613.anInt10114;
		}
		@Pc(77) int local77;
		@Pc(81) int local81;
		if (local43 > 0) {
			if (arg0 > 0 && arg4 > 0) {
				local77 = arg4 / 2;
				local81 = arg0 / 2;
				@Pc(93) int local93 = local43 <= local77 ? local43 : local77;
				@Pc(101) int local101 = local43 <= local81 ? local43 : local81;
				@Pc(106) int local106 = arg1 + local93;
				@Pc(113) int local113 = arg4 - local93 * 2;
				for (@Pc(115) int local115 = 0; local115 < arg0; local115++) {
					@Pc(124) int[] local124 = arg5[local115 + arg2];
					@Pc(137) int local137;
					@Pc(142) int local142;
					@Pc(150) int local150;
					if (local101 > local115) {
						local137 = local19 * local115 / local101;
						if (this.anInt2226 == 0) {
							for (local142 = 0; local142 < local93; local142++) {
								local150 = local19 * local142 / local93;
								local124[arg1 + local142 & Static677.anInt11036] = local124[Static677.anInt11036 & arg1 + arg4 - local142 - 1] = local137 * local150 >> 12;
							}
						} else {
							for (local142 = 0; local142 < local93; local142++) {
								local150 = local142 * local19 / local93;
								local124[arg1 + local142 & Static677.anInt11036] = local124[Static677.anInt11036 & arg4 + arg1 - local142 - 1] = local137 <= local150 ? local137 : local150;
							}
						}
						if (Static613.anInt10114 >= local113 + local106) {
							Static691.method81(local124, local106, local113, local137);
						} else {
							local142 = Static613.anInt10114 - local106;
							Static691.method81(local124, local106, local142, local137);
							Static691.method81(local124, 0, local113 - local142, local137);
						}
					} else {
						local137 = arg0 - local115 - 1;
						if (local137 < local101) {
							local142 = local19 * local137 / local101;
							@Pc(303) int local303;
							if (this.anInt2226 == 0) {
								for (local150 = 0; local150 < local93; local150++) {
									local303 = local19 * local150 / local93;
									local124[arg1 + local150 & Static677.anInt11036] = local124[Static677.anInt11036 & arg4 + arg1 - local150 - 1] = local303 * local142 >> 12;
								}
							} else {
								for (local150 = 0; local150 < local93; local150++) {
									local303 = local150 * local19 / local93;
									local124[arg1 + local150 & Static677.anInt11036] = local124[Static677.anInt11036 & arg1 + arg4 - local150 - 1] = local142 <= local303 ? local142 : local303;
								}
							}
							if (Static613.anInt10114 < local113 + local106) {
								local150 = Static613.anInt10114 - local106;
								Static691.method81(local124, local106, local150, local142);
								Static691.method81(local124, 0, local113 - local150, local142);
							} else {
								Static691.method81(local124, local106, local113, local142);
							}
						} else {
							for (local142 = 0; local142 < local93; local142++) {
								local124[local142 + arg1 & Static677.anInt11036] = local124[arg4 + arg1 - local142 - 1 & Static677.anInt11036] = local142 * local19 / local93;
							}
							if (local113 + local106 <= Static613.anInt10114) {
								Static691.method81(local124, local106, local113, local19);
							} else {
								local150 = Static613.anInt10114 - local106;
								Static691.method81(local124, local106, local150, local19);
								Static691.method81(local124, 0, local113 - local150, local19);
							}
						}
					}
				}
			}
		} else if (arg1 + arg4 <= Static613.anInt10114) {
			for (local77 = 0; local77 < arg0; local77++) {
				Static691.method81(arg5[arg2 + local77], arg1, arg4, local19);
			}
		} else {
			local77 = Static613.anInt10114 - arg1;
			for (local81 = 0; local81 < arg0; local81++) {
				@Pc(563) int[] local563 = arg5[local81 + arg2];
				Static691.method81(local563, arg1, local77, local19);
				Static691.method81(local563, 0, arg4 - local77, local19);
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt2228 = arg1.method7695(105);
		} else if (arg0 == 1) {
			this.anInt2241 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			this.anInt2235 = arg1.method7717(-1978450544);
		} else if (arg0 == 3) {
			this.anInt2223 = arg1.method7717(-1978450544);
		} else if (arg0 == 4) {
			this.anInt2233 = arg1.method7717(-1978450544);
		} else if (arg0 == 5) {
			this.anInt2237 = arg1.method7717(-1978450544);
		} else if (arg0 == 6) {
			this.anInt2226 = arg1.method7695(126);
		} else if (arg0 == 7) {
			this.anInt2234 = arg1.method7717(-1978450544);
		} else if (arg0 == 8) {
			this.anInt2236 = arg1.method7717(-1978450544);
		}
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (!super.aClass83_41.aBoolean135) {
			return local11;
		}
		@Pc(26) int[][] local26 = super.aClass83_41.method1818();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt2241 * Static613.anInt10114 >> 12;
		@Pc(58) int local58 = Static613.anInt10114 * this.anInt2235 >> 12;
		@Pc(65) int local65 = this.anInt2223 * Static497.anInt8633 >> 12;
		@Pc(72) int local72 = Static497.anInt8633 * this.anInt2233 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt2231 = this.anInt2237 * (Static613.anInt10114 / 8) >> 12;
		@Pc(97) int local97 = Static613.anInt10114 / local51 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt2228);
		while (true) {
			while (true) {
				@Pc(121) int local121 = local51 + Static645.method9067(local58 - local51, local112);
				@Pc(132) int local132 = local65 + Static645.method9067(local72 - local65, local112);
				@Pc(137) int local137 = local34 + local121;
				if (Static613.anInt10114 < local137) {
					local121 = Static613.anInt10114 - local34;
					local137 = Static613.anInt10114;
				}
				@Pc(153) int local153;
				@Pc(163) int local163;
				if (local40) {
					local153 = 0;
				} else {
					@Pc(157) int local157 = local36;
					@Pc(161) int[] local161 = local105[local36];
					local163 = 0;
					@Pc(167) int local167 = local28 + local137;
					if (local167 < 0) {
						local167 += Static613.anInt10114;
					}
					if (local167 > Static613.anInt10114) {
						local167 -= Static613.anInt10114;
					}
					local153 = local161[2];
					while (true) {
						@Pc(188) int[] local188 = local105[local157];
						if (local167 >= local188[0] && local167 <= local188[1]) {
							if (local157 != local36) {
								@Pc(222) int local222 = local34 + local28;
								if (local222 < 0) {
									local222 += Static613.anInt10114;
								}
								if (local222 > Static613.anInt10114) {
									local222 -= Static613.anInt10114;
								}
								for (@Pc(241) int local241 = 1; local241 <= local163; local241++) {
									@Pc(251) int[] local251 = local105[(local36 + local241) % local42];
									local153 = Math.max(local153, local251[2]);
								}
								for (@Pc(263) int local263 = 0; local263 <= local163; local263++) {
									@Pc(273) int[] local273 = local105[(local263 + local36) % local42];
									@Pc(277) int local277 = local273[2];
									if (local277 != local153) {
										@Pc(288) int local288 = local273[0];
										@Pc(292) int local292 = local273[1];
										@Pc(303) int local303;
										@Pc(307) int local307;
										if (local167 > local222) {
											local303 = Math.max(local222, local288);
											local307 = Math.min(local167, local292);
										} else if (local288 == 0) {
											local303 = 0;
											local307 = Math.min(local167, local292);
										} else {
											local303 = Math.max(local222, local288);
											local307 = Static613.anInt10114;
										}
										this.method2129(local153 - local277, local303 + local32, local277, local112, local307 - local303, local26);
									}
								}
							}
							local36 = local157;
							break;
						}
						local163++;
						local157++;
						if (local157 >= local42) {
							local157 = 0;
						}
					}
				}
				if (Static497.anInt8633 < local153 + local132) {
					local132 = Static497.anInt8633 - local153;
				} else {
					local38 = false;
				}
				@Pc(383) int[] local383;
				if (local137 == Static613.anInt10114) {
					this.method2129(local132, local34 + local30, local153, local112, local121, local26);
					if (local38) {
						return local11;
					}
					local38 = true;
					local383 = local101[local44++];
					local383[0] = local34;
					local383[1] = local137;
					local383[2] = local153 + local132;
					@Pc(450) int[][] local450 = local105;
					local105 = local101;
					local101 = local450;
					local42 = local44;
					local44 = 0;
					local32 = local30;
					local30 = Static645.method9067(Static613.anInt10114, local112);
					local34 = 0;
					local28 = local30 - local32;
					local163 = local28;
					if (local28 < 0) {
						local163 = local28 + Static613.anInt10114;
					}
					if (local163 > Static613.anInt10114) {
						local163 -= Static613.anInt10114;
					}
					local36 = 0;
					while (true) {
						@Pc(496) int[] local496 = local105[local36];
						if (local163 >= local496[0] && local163 <= local496[1]) {
							local40 = false;
							break;
						}
						@Pc(513) int local513 = ~local42;
						local36++;
						if (local513 >= ~local36) {
							local36 = 0;
						}
					}
				} else {
					local383 = local101[local44++];
					local383[2] = local153 + local132;
					local383[0] = local34;
					local383[1] = local137;
					this.method2129(local132, local30 + local34, local153, local112, local121, local26);
					local34 = local137;
				}
			}
		}
	}
}
