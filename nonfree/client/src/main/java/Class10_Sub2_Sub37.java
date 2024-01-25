import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class10_Sub2_Sub37 extends Class10_Sub2 {

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
	private int anInt7442 = 6;

	static {
		new Class182("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub37() {
		super(2, false);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(26) int[] local26 = this.method6041(arg0, 0);
			@Pc(32) int[] local32 = this.method6041(arg0, 1);
			@Pc(35) int local35 = this.anInt7442;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static121.anInt2458; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static121.anInt2458; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static121.anInt2458; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(158) int local158;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static121.anInt2458; local35++) {
						local158 = local32[local35];
						local16[local35] = local158 == 0 ? 4096 : (local26[local35] << 12) / local158;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static121.anInt2458; local35++) {
						local16[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static121.anInt2458; local35++) {
						local158 = local32[local35];
						local16[local35] = local158 < 2048 ? local158 * local26[local35] >> 11 : 4096 - ((4096 - local158) * (-local26[local35] + 4096) >> 11);
					}
				} else {
					@Pc(274) int local274;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static121.anInt2458; local35++) {
							local274 = local26[local35];
							local16[local35] = local274 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local274);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static121.anInt2458; local35++) {
							local274 = local26[local35];
							local16[local35] = local274 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local274;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static121.anInt2458; local35++) {
							local274 = local26[local35];
							local158 = local32[local35];
							local16[local35] = local274 >= local158 ? local158 : local274;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static121.anInt2458; local35++) {
							local158 = local32[local35];
							local274 = local26[local35];
							local16[local35] = local158 >= local274 ? local158 : local274;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static121.anInt2458; local35++) {
							local158 = local32[local35];
							local274 = local26[local35];
							local16[local35] = local274 > local158 ? local274 - local158 : local158 + -local274;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static121.anInt2458; local35++) {
							local274 = local26[local35];
							local158 = local32[local35];
							local16[local35] = local158 + local274 - (local274 * local158 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(28) int[][] local28 = this.method6045(0, arg0);
			@Pc(34) int[][] local34 = this.method6045(1, arg0);
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			@Pc(50) int[] local50 = local28[0];
			@Pc(54) int[] local54 = local28[1];
			@Pc(58) int[] local58 = local28[2];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt7442;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static121.anInt2458; local73++) {
					local38[local73] = local62[local73] + local50[local73];
					local42[local73] = local54[local73] + local66[local73];
					local46[local73] = local58[local73] + local70[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static121.anInt2458; local73++) {
					local38[local73] = local50[local73] - local62[local73];
					local42[local73] = local54[local73] - local66[local73];
					local46[local73] = local58[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static121.anInt2458; local73++) {
					local38[local73] = local50[local73] * local62[local73] >> 12;
					local42[local73] = local66[local73] * local54[local73] >> 12;
					local46[local73] = local70[local73] * local58[local73] >> 12;
				}
			} else {
				@Pc(267) int local267;
				@Pc(271) int local271;
				@Pc(263) int local263;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static121.anInt2458; local73++) {
						local263 = local70[local73];
						local267 = local62[local73];
						local271 = local66[local73];
						local38[local73] = local267 == 0 ? 4096 : (local50[local73] << 12) / local267;
						local42[local73] = local271 == 0 ? 4096 : (local54[local73] << 12) / local271;
						local46[local73] = local263 == 0 ? 4096 : (local58[local73] << 12) / local263;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static121.anInt2458; local73++) {
						local38[local73] = 4096 - ((4096 - local50[local73]) * (-local62[local73] + 4096) >> 12);
						local42[local73] = 4096 - ((4096 - local54[local73]) * (4096 - local66[local73]) >> 12);
						local46[local73] = 4096 - ((4096 - local58[local73]) * (-local70[local73] + 4096) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static121.anInt2458; local73++) {
						local267 = local62[local73];
						local271 = local66[local73];
						local263 = local70[local73];
						local38[local73] = local267 < 2048 ? local267 * local50[local73] >> 11 : 4096 - ((4096 - local50[local73]) * (4096 - local267) >> 11);
						local42[local73] = local271 < 2048 ? local54[local73] * local271 >> 11 : 4096 - ((4096 - local271) * (-local54[local73] + 4096) >> 11);
						local46[local73] = local263 >= 2048 ? 4096 - ((4096 - local58[local73]) * (-local263 + 4096) >> 11) : local263 * local58[local73] >> 11;
					}
				} else {
					@Pc(517) int local517;
					@Pc(513) int local513;
					@Pc(521) int local521;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static121.anInt2458; local73++) {
							local513 = local54[local73];
							local517 = local50[local73];
							local521 = local58[local73];
							local38[local73] = local517 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local517);
							local42[local73] = local513 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local513);
							local46[local73] = local521 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local521);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static121.anInt2458; local73++) {
							local517 = local50[local73];
							local521 = local58[local73];
							local513 = local54[local73];
							local38[local73] = local517 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local517;
							local42[local73] = local513 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local513;
							local46[local73] = local521 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local521;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static121.anInt2458; local73++) {
							local271 = local66[local73];
							local263 = local70[local73];
							local513 = local54[local73];
							local521 = local58[local73];
							local267 = local62[local73];
							local517 = local50[local73];
							local38[local73] = local267 > local517 ? local517 : local267;
							local42[local73] = local513 < local271 ? local513 : local271;
							local46[local73] = local263 <= local521 ? local263 : local521;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static121.anInt2458; local73++) {
							local267 = local62[local73];
							local271 = local66[local73];
							local517 = local50[local73];
							local521 = local58[local73];
							local263 = local70[local73];
							local513 = local54[local73];
							local38[local73] = local517 > local267 ? local517 : local267;
							local42[local73] = local271 >= local513 ? local271 : local513;
							local46[local73] = local263 >= local521 ? local263 : local521;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static121.anInt2458; local73++) {
							local271 = local66[local73];
							local263 = local70[local73];
							local517 = local50[local73];
							local267 = local62[local73];
							local513 = local54[local73];
							local521 = local58[local73];
							local38[local73] = local517 > local267 ? local517 - local267 : -local517 + local267;
							local42[local73] = local513 <= local271 ? local271 - local513 : -local271 + local513;
							local46[local73] = local521 <= local263 ? local263 - local521 : local521 - local263;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static121.anInt2458; local73++) {
							local521 = local58[local73];
							local517 = local50[local73];
							local271 = local66[local73];
							local263 = local70[local73];
							local267 = local62[local73];
							local513 = local54[local73];
							local38[local73] = local267 + local517 - (local517 * local267 >> 11);
							local42[local73] = local513 + local271 - (local271 * local513 >> 11);
							local46[local73] = local263 + local521 - (local521 * local263 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7442 = arg1.method2502();
		} else if (arg0 == 1) {
			super.aBoolean499 = arg1.method2502() == 1;
		}
	}
}
