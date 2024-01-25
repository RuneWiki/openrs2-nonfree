import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class5_Sub1_Sub14 extends Class5_Sub1 {

	@OriginalMember(owner = "client!gr", name = "V", descriptor = "I")
	private int anInt2532;

	@OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
	private int anInt2520 = 1024;

	@OriginalMember(owner = "client!gr", name = "M", descriptor = "I")
	private int anInt2523 = 819;

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
	private int anInt2516 = 0;

	@OriginalMember(owner = "client!gr", name = "P", descriptor = "I")
	private int anInt2526 = 1024;

	@OriginalMember(owner = "client!gr", name = "L", descriptor = "I")
	private int anInt2522 = 0;

	@OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
	private int anInt2517 = 409;

	@OriginalMember(owner = "client!gr", name = "R", descriptor = "I")
	private int anInt2528 = 2048;

	@OriginalMember(owner = "client!gr", name = "T", descriptor = "I")
	private int anInt2530 = 1024;

	@OriginalMember(owner = "client!gr", name = "I", descriptor = "I")
	private int anInt2519 = 1024;

	static {
		new Class198("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt2522 = arg1.method5539();
		} else if (arg0 == 1) {
			this.anInt2526 = arg1.method5598();
		} else if (arg0 == 2) {
			this.anInt2528 = arg1.method5598();
		} else if (arg0 == 3) {
			this.anInt2517 = arg1.method5598();
		} else if (arg0 == 4) {
			this.anInt2523 = arg1.method5598();
		} else if (arg0 == 5) {
			this.anInt2519 = arg1.method5598();
		} else if (arg0 == 6) {
			this.anInt2516 = arg1.method5539();
		} else if (arg0 == 7) {
			this.anInt2530 = arg1.method5598();
		} else if (arg0 == 8) {
			this.anInt2520 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[[IIILjava/util/Random;BI)V")
	private void method2037(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(26) int local26 = this.anInt2520 <= 0 ? 4096 : 4096 - Static44.method700(this.anInt2520, arg4);
		@Pc(34) int local34 = this.anInt2532 * this.anInt2530 >> 12;
		@Pc(46) int local46 = this.anInt2532 - (local34 > 0 ? Static44.method700(local34, arg4) : 0);
		if (Static148.anInt2666 <= arg2) {
			arg2 -= Static148.anInt2666;
		}
		@Pc(77) int local77;
		@Pc(79) int local79;
		if (local46 <= 0) {
			if (arg2 + arg0 > Static148.anInt2666) {
				local77 = Static148.anInt2666 - arg2;
				for (local79 = 0; local79 < arg5; local79++) {
					@Pc(87) int[] local87 = arg1[arg3 + local79];
					Static468.method3861(local87, arg2, local77, local26);
					Static468.method3861(local87, 0, arg0 - local77, local26);
				}
			} else {
				for (local77 = 0; local77 < arg5; local77++) {
					Static468.method3861(arg1[local77 + arg3], arg2, arg0, local26);
				}
			}
		} else if (arg5 > 0 && arg0 > 0) {
			local77 = arg0 / 2;
			local79 = arg5 / 2;
			@Pc(153) int local153 = local77 < local46 ? local77 : local46;
			@Pc(160) int local160 = local46 <= local79 ? local46 : local79;
			@Pc(165) int local165 = arg2 + local153;
			@Pc(172) int local172 = arg0 - local153 * 2;
			for (@Pc(174) int local174 = 0; local174 < arg5; local174++) {
				@Pc(182) int[] local182 = arg1[arg3 + local174];
				@Pc(191) int local191;
				@Pc(196) int local196;
				@Pc(204) int local204;
				if (local160 > local174) {
					local191 = local174 * local26 / local160;
					if (this.anInt2516 == 0) {
						for (local196 = 0; local196 < local153; local196++) {
							local204 = local196 * local26 / local153;
							local182[local196 + arg2 & Static273.anInt4299] = local182[arg2 + arg0 - local196 - 1 & Static273.anInt4299] = local191 * local204 >> 12;
						}
					} else {
						for (local196 = 0; local196 < local153; local196++) {
							local204 = local196 * local26 / local153;
							local182[Static273.anInt4299 & arg2 + local196] = local182[arg0 + arg2 - local196 - 1 & Static273.anInt4299] = local191 > local204 ? local204 : local191;
						}
					}
					if (local165 + local172 <= Static148.anInt2666) {
						Static468.method3861(local182, local165, local172, local191);
					} else {
						local196 = Static148.anInt2666 - local165;
						Static468.method3861(local182, local165, local196, local191);
						Static468.method3861(local182, 0, local172 - local196, local191);
					}
				} else {
					local191 = arg5 - local174 - 1;
					if (local191 < local160) {
						local196 = local26 * local191 / local160;
						@Pc(341) int local341;
						if (this.anInt2516 == 0) {
							for (local204 = 0; local204 < local153; local204++) {
								local341 = local204 * local26 / local153;
								local182[arg2 + local204 & Static273.anInt4299] = local182[arg2 + arg0 - local204 - 1 & Static273.anInt4299] = local196 * local341 >> 12;
							}
						} else {
							for (local204 = 0; local204 < local153; local204++) {
								local341 = local26 * local204 / local153;
								local182[local204 + arg2 & Static273.anInt4299] = local182[Static273.anInt4299 & arg2 + arg0 - local204 - 1] = local341 < local196 ? local341 : local196;
							}
						}
						if (Static148.anInt2666 < local165 + local172) {
							local204 = Static148.anInt2666 - local165;
							Static468.method3861(local182, local165, local204, local196);
							Static468.method3861(local182, 0, local172 - local204, local196);
						} else {
							Static468.method3861(local182, local165, local172, local196);
						}
					} else {
						for (local196 = 0; local196 < local153; local196++) {
							local182[arg2 + local196 & Static273.anInt4299] = local182[arg0 + arg2 - local196 - 1 & Static273.anInt4299] = local26 * local196 / local153;
						}
						if (Static148.anInt2666 >= local172 + local165) {
							Static468.method3861(local182, local165, local172, local26);
						} else {
							local204 = Static148.anInt2666 - local165;
							Static468.method3861(local182, local165, local204, local26);
							Static468.method3861(local182, 0, local172 - local204, local26);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass239_41.method5400(arg0);
		if (!super.aClass239_41.aBoolean460) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass239_41.method5403();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt2526 * Static148.anInt2666 >> 12;
		@Pc(58) int local58 = Static148.anInt2666 * this.anInt2528 >> 12;
		@Pc(65) int local65 = Static458.anInt7496 * this.anInt2517 >> 12;
		@Pc(72) int local72 = this.anInt2523 * Static458.anInt7496 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt2532 = this.anInt2519 * (Static148.anInt2666 / 8) >> 12;
		@Pc(97) int local97 = Static148.anInt2666 / local51 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt2522);
		while (true) {
			while (true) {
				@Pc(122) int local122 = Static44.method700(local58 - local51, local112) + local51;
				@Pc(132) int local132 = Static44.method700(local72 - local65, local112) + local65;
				@Pc(136) int local136 = local34 + local122;
				if (Static148.anInt2666 < local136) {
					local122 = Static148.anInt2666 - local34;
					local136 = Static148.anInt2666;
				}
				@Pc(154) int local154;
				@Pc(164) int local164;
				if (local40) {
					local154 = 0;
				} else {
					@Pc(158) int local158 = local36;
					@Pc(162) int[] local162 = local105[local36];
					local164 = 0;
					@Pc(168) int local168 = local28 + local136;
					if (local168 < 0) {
						local168 += Static148.anInt2666;
					}
					if (local168 > Static148.anInt2666) {
						local168 -= Static148.anInt2666;
					}
					local154 = local162[2];
					while (true) {
						@Pc(196) int[] local196 = local105[local158];
						if (local196[0] <= local168 && local168 <= local196[1]) {
							if (local158 != local36) {
								@Pc(231) int local231 = local34 + local28;
								if (local231 < 0) {
									local231 += Static148.anInt2666;
								}
								if (Static148.anInt2666 < local231) {
									local231 -= Static148.anInt2666;
								}
								for (@Pc(253) int local253 = 1; local253 <= local164; local253++) {
									@Pc(263) int[] local263 = local105[(local36 + local253) % local42];
									local154 = Math.max(local154, local263[2]);
								}
								for (@Pc(275) int local275 = 0; local275 <= local164; local275++) {
									@Pc(285) int[] local285 = local105[(local275 + local36) % local42];
									@Pc(289) int local289 = local285[2];
									if (local154 != local289) {
										@Pc(300) int local300 = local285[0];
										@Pc(304) int local304 = local285[1];
										@Pc(322) int local322;
										@Pc(320) int local320;
										if (local168 > local231) {
											local322 = Math.max(local231, local300);
											local320 = Math.min(local168, local304);
										} else if (local300 == 0) {
											local320 = Math.min(local168, local304);
											local322 = 0;
										} else {
											local322 = Math.max(local231, local300);
											local320 = Static148.anInt2666;
										}
										this.method2037(local320 - local322, local26, local32 + local322, local289, local112, local154 - local289);
									}
								}
							}
							local36 = local158;
							break;
						}
						local164++;
						local158++;
						if (local158 >= local42) {
							local158 = 0;
						}
					}
				}
				if (local154 + local132 <= Static458.anInt7496) {
					local38 = false;
				} else {
					local132 = Static458.anInt7496 - local154;
				}
				@Pc(399) int[] local399;
				if (Static148.anInt2666 == local136) {
					this.method2037(local122, local26, local30 + local34, local154, local112, local132);
					if (local38) {
						return local17;
					}
					local38 = true;
					local399 = local101[local44++];
					local399[1] = local136;
					local399[2] = local132 + local154;
					local399[0] = local34;
					@Pc(415) int[][] local415 = local105;
					local105 = local101;
					local101 = local415;
					local42 = local44;
					local44 = 0;
					local32 = local30;
					local30 = Static44.method700(Static148.anInt2666, local112);
					local34 = 0;
					local28 = local30 - local32;
					local164 = local28;
					if (local28 < 0) {
						local164 = local28 + Static148.anInt2666;
					}
					local36 = 0;
					if (Static148.anInt2666 < local164) {
						local164 -= Static148.anInt2666;
					}
					local40 = false;
					while (true) {
						@Pc(462) int[] local462 = local105[local36];
						if (local164 >= local462[0] && local462[1] >= local164) {
							break;
						}
						@Pc(479) int local479 = ~local42;
						local36++;
						if (local479 >= ~local36) {
							local36 = 0;
						}
					}
				} else {
					local399 = local101[local44++];
					local399[2] = local132 + local154;
					local399[0] = local34;
					local399[1] = local136;
					this.method2037(local122, local26, local34 + local30, local154, local112, local132);
					local34 = local136;
				}
			}
		}
	}
}
