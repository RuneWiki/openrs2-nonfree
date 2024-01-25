import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
	private int anInt2328;

	@OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
	private int anInt2321 = 819;

	@OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
	private int anInt2323 = 1024;

	@OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
	private int anInt2325 = 409;

	@OriginalMember(owner = "client!eq", name = "K", descriptor = "I")
	private int anInt2329 = 1024;

	@OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
	private int anInt2331 = 1024;

	@OriginalMember(owner = "client!eq", name = "Q", descriptor = "I")
	private int anInt2335 = 0;

	@OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
	private int anInt2322 = 2048;

	@OriginalMember(owner = "client!eq", name = "N", descriptor = "I")
	private int anInt2332 = 1024;

	@OriginalMember(owner = "client!eq", name = "O", descriptor = "I")
	private int anInt2333 = 0;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2333 = arg0.method5750();
		} else if (arg1 == 1) {
			this.anInt2332 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt2322 = arg0.method5771();
		} else if (arg1 == 3) {
			this.anInt2325 = arg0.method5771();
		} else if (arg1 == 4) {
			this.anInt2321 = arg0.method5771();
		} else if (arg1 == 5) {
			this.anInt2329 = arg0.method5771();
		} else if (arg1 == 6) {
			this.anInt2335 = arg0.method5750();
		} else if (arg1 == 7) {
			this.anInt2331 = arg0.method5771();
		} else if (arg1 == 8) {
			this.anInt2323 = arg0.method5771();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (!super.aClass223_41.aBoolean442) {
			return local11;
		}
		@Pc(28) int[][] local28 = super.aClass223_41.method4437();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = this.anInt2332 * Static279.anInt4906 >> 12;
		@Pc(60) int local60 = this.anInt2322 * Static279.anInt4906 >> 12;
		@Pc(67) int local67 = this.anInt2325 * Static52.anInt1010 >> 12;
		@Pc(74) int local74 = Static52.anInt1010 * this.anInt2321 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt2328 = this.anInt2329 * (Static279.anInt4906 / 8) >> 12;
		@Pc(99) int local99 = Static279.anInt4906 / local53 + 1;
		@Pc(103) int[][] local103 = new int[local99][3];
		@Pc(107) int[][] local107 = new int[local99][3];
		@Pc(114) Random local114 = new Random((long) this.anInt2333);
		while (true) {
			while (true) {
				@Pc(123) int local123 = local53 + Static87.method4324(local60 - local53, local114);
				@Pc(132) int local132 = Static87.method4324(local74 - local67, local114) + local67;
				@Pc(136) int local136 = local36 + local123;
				if (Static279.anInt4906 < local136) {
					local123 = Static279.anInt4906 - local36;
					local136 = Static279.anInt4906;
				}
				@Pc(150) int local150;
				@Pc(160) int local160;
				if (local42) {
					local150 = 0;
				} else {
					@Pc(154) int local154 = local38;
					@Pc(158) int[] local158 = local107[local38];
					local160 = 0;
					@Pc(164) int local164 = local136 + local30;
					if (local164 < 0) {
						local164 += Static279.anInt4906;
					}
					if (Static279.anInt4906 < local164) {
						local164 -= Static279.anInt4906;
					}
					local150 = local158[2];
					while (true) {
						@Pc(185) int[] local185 = local107[local154];
						if (local185[0] <= local164 && local164 <= local185[1]) {
							if (local38 != local154) {
								@Pc(215) int local215 = local30 + local36;
								if (local215 < 0) {
									local215 += Static279.anInt4906;
								}
								if (Static279.anInt4906 < local215) {
									local215 -= Static279.anInt4906;
								}
								for (@Pc(233) int local233 = 1; local233 <= local160; local233++) {
									@Pc(243) int[] local243 = local107[(local38 + local233) % local44];
									local150 = Math.max(local150, local243[2]);
								}
								for (@Pc(259) int local259 = 0; local259 <= local160; local259++) {
									@Pc(269) int[] local269 = local107[(local259 + local38) % local44];
									@Pc(273) int local273 = local269[2];
									if (local150 != local273) {
										@Pc(280) int local280 = local269[0];
										@Pc(284) int local284 = local269[1];
										@Pc(291) int local291;
										@Pc(295) int local295;
										if (local215 < local164) {
											local291 = Math.max(local215, local280);
											local295 = Math.min(local164, local284);
										} else if (local280 == 0) {
											local295 = Math.min(local164, local284);
											local291 = 0;
										} else {
											local291 = Math.max(local215, local280);
											local295 = Static279.anInt4906;
										}
										this.method1870(local273, local28, local114, local150 - local273, local34 + local291, local295 - local291);
									}
								}
							}
							local38 = local154;
							break;
						}
						local154++;
						if (local154 >= local44) {
							local154 = 0;
						}
						local160++;
					}
				}
				if (Static52.anInt1010 < local132 + local150) {
					local132 = Static52.anInt1010 - local150;
				} else {
					local40 = false;
				}
				@Pc(381) int[] local381;
				if (local136 == Static279.anInt4906) {
					this.method1870(local150, local28, local114, local132, local36 + local32, local123);
					if (local40) {
						return local11;
					}
					local40 = true;
					local381 = local103[local46++];
					local381[0] = local36;
					local381[2] = local132 + local150;
					local381[1] = local136;
					@Pc(397) int[][] local397 = local107;
					local107 = local103;
					local44 = local46;
					local103 = local397;
					local46 = 0;
					local34 = local32;
					local32 = Static87.method4324(Static279.anInt4906, local114);
					local36 = 0;
					local30 = local32 - local34;
					local160 = local30;
					if (local30 < 0) {
						local160 = local30 + Static279.anInt4906;
					}
					if (local160 > Static279.anInt4906) {
						local160 -= Static279.anInt4906;
					}
					local38 = 0;
					local42 = false;
					while (true) {
						@Pc(446) int[] local446 = local107[local38];
						if (local446[0] <= local160 && local160 <= local446[1]) {
							break;
						}
						@Pc(463) int local463 = ~local44;
						local38++;
						if (local463 >= ~local38) {
							local38 = 0;
						}
					}
				} else {
					local381 = local103[local46++];
					local381[2] = local150 + local132;
					local381[1] = local136;
					local381[0] = local36;
					this.method1870(local150, local28, local114, local132, local32 + local36, local123);
					local36 = local136;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[[IBLjava/util/Random;III)V")
	private void method1870(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(25) int local25 = this.anInt2323 <= 0 ? 4096 : 4096 - Static87.method4324(this.anInt2323, arg2);
		@Pc(33) int local33 = this.anInt2328 * this.anInt2331 >> 12;
		@Pc(45) int local45 = this.anInt2328 - (local33 > 0 ? Static87.method4324(local33, arg2) : 0);
		if (Static279.anInt4906 <= arg4) {
			arg4 -= Static279.anInt4906;
		}
		@Pc(68) int local68;
		@Pc(70) int local70;
		if (local45 <= 0) {
			if (arg4 + arg5 > Static279.anInt4906) {
				local68 = Static279.anInt4906 - arg4;
				for (local70 = 0; local70 < arg3; local70++) {
					@Pc(78) int[] local78 = arg1[local70 + arg0];
					Static598.method1171(local78, arg4, local68, local25);
					Static598.method1171(local78, 0, arg5 - local68, local25);
				}
			} else {
				for (local68 = 0; local68 < arg3; local68++) {
					Static598.method1171(arg1[local68 + arg0], arg4, arg5, local25);
				}
			}
		} else if (arg3 > 0 && arg5 > 0) {
			local68 = arg5 / 2;
			local70 = arg3 / 2;
			@Pc(142) int local142 = local45 > local68 ? local68 : local45;
			@Pc(153) int local153 = local70 < local45 ? local70 : local45;
			@Pc(157) int local157 = arg4 + local142;
			@Pc(164) int local164 = arg5 - local142 * 2;
			for (@Pc(166) int local166 = 0; local166 < arg3; local166++) {
				@Pc(175) int[] local175 = arg1[local166 + arg0];
				@Pc(184) int local184;
				@Pc(189) int local189;
				@Pc(197) int local197;
				if (local166 < local153) {
					local184 = local25 * local166 / local153;
					if (this.anInt2335 == 0) {
						for (local189 = 0; local189 < local142; local189++) {
							local197 = local189 * local25 / local142;
							local175[arg4 + local189 & Static216.anInt4134] = local175[Static216.anInt4134 & arg5 + arg4 - local189 - 1] = local197 * local184 >> 12;
						}
					} else {
						for (local189 = 0; local189 < local142; local189++) {
							local197 = local25 * local189 / local142;
							local175[Static216.anInt4134 & arg4 + local189] = local175[arg5 + arg4 - local189 - 1 & Static216.anInt4134] = local184 <= local197 ? local184 : local197;
						}
					}
					if (local157 + local164 <= Static279.anInt4906) {
						Static598.method1171(local175, local157, local164, local184);
					} else {
						local189 = Static279.anInt4906 - local157;
						Static598.method1171(local175, local157, local189, local184);
						Static598.method1171(local175, 0, local164 - local189, local184);
					}
				} else {
					local184 = arg3 - local166 - 1;
					if (local184 < local153) {
						local189 = local25 * local184 / local153;
						@Pc(346) int local346;
						if (this.anInt2335 == 0) {
							for (local197 = 0; local197 < local142; local197++) {
								local346 = local197 * local25 / local142;
								local175[Static216.anInt4134 & local197 + arg4] = local175[Static216.anInt4134 & arg4 + arg5 - local197 - 1] = local346 * local189 >> 12;
							}
						} else {
							for (local197 = 0; local197 < local142; local197++) {
								local346 = local197 * local25 / local142;
								local175[Static216.anInt4134 & local197 + arg4] = local175[arg4 + arg5 - local197 - 1 & Static216.anInt4134] = local346 >= local189 ? local189 : local346;
							}
						}
						if (local164 + local157 > Static279.anInt4906) {
							local197 = Static279.anInt4906 - local157;
							Static598.method1171(local175, local157, local197, local189);
							Static598.method1171(local175, 0, local164 - local197, local189);
						} else {
							Static598.method1171(local175, local157, local164, local189);
						}
					} else {
						for (local189 = 0; local189 < local142; local189++) {
							local175[Static216.anInt4134 & arg4 + local189] = local175[Static216.anInt4134 & arg5 + arg4 - local189 - 1] = local25 * local189 / local142;
						}
						if (local164 + local157 > Static279.anInt4906) {
							local197 = Static279.anInt4906 - local157;
							Static598.method1171(local175, local157, local197, local25);
							Static598.method1171(local175, 0, local164 - local197, local25);
						} else {
							Static598.method1171(local175, local157, local164, local25);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
	}
}
