import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class10_Sub2_Sub27 extends Class10_Sub2 {

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
	private int anInt5586;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
	private int anInt5579 = 1024;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
	private int anInt5581 = 2048;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
	private int anInt5580 = 819;

	@OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
	private int anInt5588 = 1024;

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
	private int anInt5584 = 1024;

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
	private int anInt5585 = 0;

	@OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
	private int anInt5589 = 1024;

	@OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
	private int anInt5587 = 409;

	@OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
	private int anInt5590 = 0;

	static {
		new Class182("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass241_41.method5238(arg0);
		if (!super.aClass241_41.aBoolean440) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass241_41.method5237();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = Static121.anInt2458 * this.anInt5584 >> 12;
		@Pc(58) int local58 = this.anInt5581 * Static121.anInt2458 >> 12;
		@Pc(65) int local65 = Static190.anInt3835 * this.anInt5587 >> 12;
		@Pc(72) int local72 = Static190.anInt3835 * this.anInt5580 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt5586 = Static121.anInt2458 / 8 * this.anInt5589 >> 12;
		@Pc(98) int local98 = Static121.anInt2458 / local51 + 1;
		@Pc(102) int[][] local102 = new int[local98][3];
		@Pc(106) int[][] local106 = new int[local98][3];
		@Pc(113) Random local113 = new Random((long) this.anInt5585);
		while (true) {
			while (true) {
				@Pc(122) int local122 = Static434.method5743(local113, local58 - local51) + local51;
				@Pc(132) int local132 = Static434.method5743(local113, local72 - local65) + local65;
				@Pc(136) int local136 = local34 + local122;
				if (local136 > Static121.anInt2458) {
					local136 = Static121.anInt2458;
					local122 = Static121.anInt2458 - local34;
				}
				@Pc(176) int local176;
				@Pc(155) int local155;
				if (local40) {
					local176 = 0;
				} else {
					@Pc(149) int local149 = local36;
					@Pc(153) int[] local153 = local106[local36];
					local155 = 0;
					@Pc(159) int local159 = local28 + local136;
					if (local159 < 0) {
						local159 += Static121.anInt2458;
					}
					if (Static121.anInt2458 < local159) {
						local159 -= Static121.anInt2458;
					}
					local176 = local153[2];
					while (true) {
						@Pc(180) int[] local180 = local106[local149];
						if (local180[0] <= local159 && local159 <= local180[1]) {
							if (local149 != local36) {
								@Pc(214) int local214 = local28 + local34;
								if (local214 < 0) {
									local214 += Static121.anInt2458;
								}
								if (local214 > Static121.anInt2458) {
									local214 -= Static121.anInt2458;
								}
								for (@Pc(233) int local233 = 1; local233 <= local155; local233++) {
									@Pc(243) int[] local243 = local106[(local36 + local233) % local42];
									local176 = Math.max(local176, local243[2]);
								}
								for (@Pc(255) int local255 = 0; local255 <= local155; local255++) {
									@Pc(265) int[] local265 = local106[(local36 + local255) % local42];
									@Pc(269) int local269 = local265[2];
									if (local176 != local269) {
										@Pc(276) int local276 = local265[0];
										@Pc(280) int local280 = local265[1];
										@Pc(292) int local292;
										@Pc(294) int local294;
										if (local159 > local214) {
											local292 = Math.max(local214, local276);
											local294 = Math.min(local159, local280);
										} else if (local276 == 0) {
											local292 = 0;
											local294 = Math.min(local159, local280);
										} else {
											local292 = Math.max(local214, local276);
											local294 = Static121.anInt2458;
										}
										this.method4445(local113, local26, local292 + local32, -local269 + local176, local269, local294 - local292);
									}
								}
							}
							local36 = local149;
							break;
						}
						local155++;
						local149++;
						if (local149 >= local42) {
							local149 = 0;
						}
					}
				}
				if (Static190.anInt3835 < local176 + local132) {
					local132 = Static190.anInt3835 - local176;
				} else {
					local38 = false;
				}
				@Pc(361) int[] local361;
				if (local136 == Static121.anInt2458) {
					this.method4445(local113, local26, local30 + local34, local132, local176, local122);
					if (local38) {
						return local17;
					}
					local38 = true;
					local361 = local102[local44++];
					local361[1] = local136;
					local361[2] = local132 + local176;
					local361[0] = local34;
					@Pc(427) int[][] local427 = local106;
					local106 = local102;
					local42 = local44;
					local102 = local427;
					local32 = local30;
					local44 = 0;
					local30 = Static434.method5743(local113, Static121.anInt2458);
					local28 = local30 - local32;
					local34 = 0;
					local155 = local28;
					if (local28 < 0) {
						local155 = local28 + Static121.anInt2458;
					}
					if (local155 > Static121.anInt2458) {
						local155 -= Static121.anInt2458;
					}
					local36 = 0;
					while (true) {
						@Pc(473) int[] local473 = local106[local36];
						if (local473[0] <= local155 && local473[1] >= local155) {
							local40 = false;
							break;
						}
						local36++;
						if (local36 >= local42) {
							local36 = 0;
						}
					}
				} else {
					local361 = local102[local44++];
					local361[2] = local176 + local132;
					local361[0] = local34;
					local361[1] = local136;
					this.method4445(local113, local26, local34 + local30, local132, local176, local122);
					local34 = local136;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5585 = arg1.method2502();
		} else if (arg0 == 1) {
			this.anInt5584 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anInt5581 = arg1.method2485();
		} else if (arg0 == 3) {
			this.anInt5587 = arg1.method2485();
		} else if (arg0 == 4) {
			this.anInt5580 = arg1.method2485();
		} else if (arg0 == 5) {
			this.anInt5589 = arg1.method2485();
		} else if (arg0 == 6) {
			this.anInt5590 = arg1.method2502();
		} else if (arg0 == 7) {
			this.anInt5588 = arg1.method2485();
		} else if (arg0 == 8) {
			this.anInt5579 = arg1.method2485();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/util/Random;[[IIIIII)V")
	private void method4445(@OriginalArg(0) Random arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt5579 <= 0 ? 4096 : 4096 - Static434.method5743(arg0, this.anInt5579);
		@Pc(35) int local35 = this.anInt5586 * this.anInt5588 >> 12;
		@Pc(48) int local48 = this.anInt5586 - (local35 > 0 ? Static434.method5743(arg0, local35) : 0);
		if (Static121.anInt2458 <= arg2) {
			arg2 -= Static121.anInt2458;
		}
		@Pc(71) int local71;
		@Pc(97) int local97;
		if (local48 <= 0) {
			if (Static121.anInt2458 >= arg5 + arg2) {
				for (local71 = 0; local71 < arg3; local71++) {
					Static468.method4353(arg1[arg4 + local71], arg2, arg5, local19);
				}
			} else {
				local71 = Static121.anInt2458 - arg2;
				for (local97 = 0; local97 < arg3; local97++) {
					@Pc(105) int[] local105 = arg1[local97 + arg4];
					Static468.method4353(local105, arg2, local71, local19);
					Static468.method4353(local105, 0, arg5 - local71, local19);
				}
			}
		} else if (arg3 > 0 && arg5 > 0) {
			local71 = arg5 / 2;
			local97 = arg3 / 2;
			@Pc(146) int local146 = local71 < local48 ? local71 : local48;
			@Pc(153) int local153 = local48 > local97 ? local97 : local48;
			@Pc(157) int local157 = local146 + arg2;
			@Pc(163) int local163 = arg5 - local146 * 2;
			for (@Pc(165) int local165 = 0; local165 < arg3; local165++) {
				@Pc(174) int[] local174 = arg1[local165 + arg4];
				@Pc(183) int local183;
				@Pc(188) int local188;
				@Pc(196) int local196;
				if (local165 < local153) {
					local183 = local19 * local165 / local153;
					if (this.anInt5590 == 0) {
						for (local188 = 0; local188 < local146; local188++) {
							local196 = local188 * local19 / local146;
							local174[local188 + arg2 & Static429.anInt7203] = local174[Static429.anInt7203 & arg5 + arg2 - local188 - 1] = local196 * local183 >> 12;
						}
					} else {
						for (local188 = 0; local188 < local146; local188++) {
							local196 = local188 * local19 / local146;
							local174[arg2 + local188 & Static429.anInt7203] = local174[arg2 + arg5 - local188 - 1 & Static429.anInt7203] = local183 <= local196 ? local183 : local196;
						}
					}
					if (local157 + local163 <= Static121.anInt2458) {
						Static468.method4353(local174, local157, local163, local183);
					} else {
						local188 = Static121.anInt2458 - local157;
						Static468.method4353(local174, local157, local188, local183);
						Static468.method4353(local174, 0, local163 - local188, local183);
					}
				} else {
					local183 = arg3 - local165 - 1;
					if (local183 < local153) {
						local188 = local183 * local19 / local153;
						@Pc(333) int local333;
						if (this.anInt5590 == 0) {
							for (local196 = 0; local196 < local146; local196++) {
								local333 = local19 * local196 / local146;
								local174[arg2 + local196 & Static429.anInt7203] = local174[arg5 + arg2 - local196 - 1 & Static429.anInt7203] = local333 * local188 >> 12;
							}
						} else {
							for (local196 = 0; local196 < local146; local196++) {
								local333 = local19 * local196 / local146;
								local174[Static429.anInt7203 & arg2 + local196] = local174[arg5 + arg2 - local196 - 1 & Static429.anInt7203] = local333 < local188 ? local333 : local188;
							}
						}
						if (Static121.anInt2458 < local157 + local163) {
							local196 = Static121.anInt2458 - local157;
							Static468.method4353(local174, local157, local196, local188);
							Static468.method4353(local174, 0, local163 - local196, local188);
						} else {
							Static468.method4353(local174, local157, local163, local188);
						}
					} else {
						for (local188 = 0; local188 < local146; local188++) {
							local174[Static429.anInt7203 & arg2 + local188] = local174[arg2 + arg5 - local188 - 1 & Static429.anInt7203] = local188 * local19 / local146;
						}
						if (Static121.anInt2458 >= local157 + local163) {
							Static468.method4353(local174, local157, local163, local19);
						} else {
							local196 = Static121.anInt2458 - local157;
							Static468.method4353(local174, local157, local196, local19);
							Static468.method4353(local174, 0, local163 - local196, local19);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
	}
}
