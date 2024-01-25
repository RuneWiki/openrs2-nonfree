import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class2_Sub4_Sub39 extends Class2_Sub4 {

	@OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
	private int anInt6524 = 6;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub39() {
		super(2, false);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(26) int[] local26 = this.method5600(arg0, 0);
			@Pc(32) int[] local32 = this.method5600(arg0, 1);
			@Pc(35) int local35 = this.anInt6524;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static76.anInt1458; local35++) {
					local11[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static76.anInt1458; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static76.anInt1458; local35++) {
					local11[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(153) int local153;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static76.anInt1458; local35++) {
						local153 = local32[local35];
						local11[local35] = local153 == 0 ? 4096 : (local26[local35] << 12) / local153;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static76.anInt1458; local35++) {
						local11[local35] = 4096 - ((4096 - local32[local35]) * (4096 - local26[local35]) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static76.anInt1458; local35++) {
						local153 = local32[local35];
						local11[local35] = local153 < 2048 ? local153 * local26[local35] >> 11 : 4096 - ((4096 - local153) * (-local26[local35] + 4096) >> 11);
					}
				} else {
					@Pc(265) int local265;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static76.anInt1458; local35++) {
							local265 = local26[local35];
							local11[local35] = local265 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local265);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static76.anInt1458; local35++) {
							local265 = local26[local35];
							local11[local35] = local265 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local265;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static76.anInt1458; local35++) {
							local153 = local32[local35];
							local265 = local26[local35];
							local11[local35] = local153 <= local265 ? local153 : local265;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static76.anInt1458; local35++) {
							local153 = local32[local35];
							local265 = local26[local35];
							local11[local35] = local153 < local265 ? local265 : local153;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static76.anInt1458; local35++) {
							local265 = local26[local35];
							local153 = local32[local35];
							local11[local35] = local265 > local153 ? local265 - local153 : -local265 + local153;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static76.anInt1458; local35++) {
							local265 = local26[local35];
							local153 = local32[local35];
							local11[local35] = local153 + local265 - (local265 * local153 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6524 = arg0.method5350();
		} else if (arg1 == 1) {
			super.aBoolean465 = arg0.method5350() == 1;
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(28) int[][] local28 = this.method5591(arg0, 0);
			@Pc(34) int[][] local34 = this.method5591(arg0, 1);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			@Pc(50) int[] local50 = local28[0];
			@Pc(54) int[] local54 = local28[1];
			@Pc(58) int[] local58 = local28[2];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt6524;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static76.anInt1458; local73++) {
					local38[local73] = local50[local73] + local62[local73];
					local42[local73] = local66[local73] + local54[local73];
					local46[local73] = local70[local73] + local58[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static76.anInt1458; local73++) {
					local38[local73] = local50[local73] - local62[local73];
					local42[local73] = local54[local73] - local66[local73];
					local46[local73] = local58[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static76.anInt1458; local73++) {
					local38[local73] = local50[local73] * local62[local73] >> 12;
					local42[local73] = local54[local73] * local66[local73] >> 12;
					local46[local73] = local70[local73] * local58[local73] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(262) int local262;
				@Pc(266) int local266;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static76.anInt1458; local73++) {
						local262 = local66[local73];
						local266 = local70[local73];
						local270 = local62[local73];
						local38[local73] = local270 == 0 ? 4096 : (local50[local73] << 12) / local270;
						local42[local73] = local262 == 0 ? 4096 : (local54[local73] << 12) / local262;
						local46[local73] = local266 == 0 ? 4096 : (local58[local73] << 12) / local266;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static76.anInt1458; local73++) {
						local38[local73] = 4096 - ((4096 - local62[local73]) * (4096 - local50[local73]) >> 12);
						local42[local73] = 4096 - ((4096 - local66[local73]) * (4096 - local54[local73]) >> 12);
						local46[local73] = 4096 - ((4096 - local58[local73]) * (-local70[local73] + 4096) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static76.anInt1458; local73++) {
						local262 = local66[local73];
						local266 = local70[local73];
						local270 = local62[local73];
						local38[local73] = local270 >= 2048 ? 4096 - ((4096 - local270) * (-local50[local73] + 4096) >> 11) : local50[local73] * local270 >> 11;
						local42[local73] = local262 >= 2048 ? 4096 - ((4096 - local262) * (-local54[local73] + 4096) >> 11) : local262 * local54[local73] >> 11;
						local46[local73] = local266 >= 2048 ? 4096 - ((4096 - local266) * (-local58[local73] + 4096) >> 11) : local266 * local58[local73] >> 11;
					}
				} else {
					@Pc(527) int local527;
					@Pc(523) int local523;
					@Pc(519) int local519;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static76.anInt1458; local73++) {
							local519 = local58[local73];
							local523 = local54[local73];
							local527 = local50[local73];
							local38[local73] = local527 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local527);
							local42[local73] = local523 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local523);
							local46[local73] = local519 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local519);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static76.anInt1458; local73++) {
							local519 = local58[local73];
							local523 = local54[local73];
							local527 = local50[local73];
							local38[local73] = local527 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local527;
							local42[local73] = local523 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local523;
							local46[local73] = local519 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local519;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static76.anInt1458; local73++) {
							local266 = local70[local73];
							local270 = local62[local73];
							local262 = local66[local73];
							local523 = local54[local73];
							local519 = local58[local73];
							local527 = local50[local73];
							local38[local73] = local270 <= local527 ? local270 : local527;
							local42[local73] = local262 > local523 ? local523 : local262;
							local46[local73] = local519 >= local266 ? local266 : local519;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static76.anInt1458; local73++) {
							local527 = local50[local73];
							local266 = local70[local73];
							local519 = local58[local73];
							local523 = local54[local73];
							local270 = local62[local73];
							local262 = local66[local73];
							local38[local73] = local527 <= local270 ? local270 : local527;
							local42[local73] = local523 <= local262 ? local262 : local523;
							local46[local73] = local519 > local266 ? local519 : local266;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static76.anInt1458; local73++) {
							local270 = local62[local73];
							local523 = local54[local73];
							local519 = local58[local73];
							local527 = local50[local73];
							local262 = local66[local73];
							local266 = local70[local73];
							local38[local73] = local270 < local527 ? local527 - local270 : -local527 + local270;
							local42[local73] = local262 < local523 ? local523 - local262 : -local523 + local262;
							local46[local73] = local266 < local519 ? local519 - local266 : local266 - local519;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static76.anInt1458; local73++) {
							local266 = local70[local73];
							local270 = local62[local73];
							local527 = local50[local73];
							local519 = local58[local73];
							local262 = local66[local73];
							local523 = local54[local73];
							local38[local73] = local527 + local270 - (local270 * local527 >> 11);
							local42[local73] = local262 + local523 - (local523 * local262 >> 11);
							local46[local73] = local266 + local519 - (local519 * local266 >> 11);
						}
					}
				}
			}
		}
		return local18;
	}
}
