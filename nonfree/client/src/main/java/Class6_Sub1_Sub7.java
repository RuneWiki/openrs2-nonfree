import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class6_Sub1_Sub7 extends Class6_Sub1 {

	@OriginalMember(owner = "client!dp", name = "J", descriptor = "I")
	private int anInt2931 = 6;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub7() {
		super(2, false);
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(28) int[][] local28 = this.method8725(arg0, 0);
			@Pc(34) int[][] local34 = this.method8725(arg0, 1);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			@Pc(50) int[] local50 = local28[0];
			@Pc(54) int[] local54 = local28[1];
			@Pc(58) int[] local58 = local28[2];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt2931;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static53.anInt1787; local73++) {
					local38[local73] = local50[local73] + local62[local73];
					local42[local73] = local54[local73] + local66[local73];
					local46[local73] = local70[local73] + local58[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static53.anInt1787; local73++) {
					local38[local73] = local50[local73] - local62[local73];
					local42[local73] = local54[local73] - local66[local73];
					local46[local73] = local58[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static53.anInt1787; local73++) {
					local38[local73] = local50[local73] * local62[local73] >> 12;
					local42[local73] = local54[local73] * local66[local73] >> 12;
					local46[local73] = local70[local73] * local58[local73] >> 12;
				}
			} else {
				@Pc(264) int local264;
				@Pc(268) int local268;
				@Pc(272) int local272;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static53.anInt1787; local73++) {
						local264 = local62[local73];
						local268 = local66[local73];
						local272 = local70[local73];
						local38[local73] = local264 == 0 ? 4096 : (local50[local73] << 12) / local264;
						local42[local73] = local268 == 0 ? 4096 : (local54[local73] << 12) / local268;
						local46[local73] = local272 == 0 ? 4096 : (local58[local73] << 12) / local272;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static53.anInt1787; local73++) {
						local38[local73] = 4096 - ((4096 - local62[local73]) * (-local50[local73] + 4096) >> 12);
						local42[local73] = 4096 - ((4096 - local66[local73]) * (-local54[local73] + 4096) >> 12);
						local46[local73] = 4096 - ((4096 - local70[local73]) * (4096 - local58[local73]) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static53.anInt1787; local73++) {
						local272 = local70[local73];
						local268 = local66[local73];
						local264 = local62[local73];
						local38[local73] = local264 >= 2048 ? 4096 - ((4096 - local50[local73]) * (-local264 + 4096) >> 11) : local50[local73] * local264 >> 11;
						local42[local73] = local268 < 2048 ? local54[local73] * local268 >> 11 : 4096 - ((4096 - local268) * (-local54[local73] + 4096) >> 11);
						local46[local73] = local272 < 2048 ? local58[local73] * local272 >> 11 : 4096 - ((4096 - local58[local73]) * (-local272 + 4096) >> 11);
					}
				} else {
					@Pc(521) int local521;
					@Pc(525) int local525;
					@Pc(529) int local529;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static53.anInt1787; local73++) {
							local521 = local50[local73];
							local525 = local54[local73];
							local529 = local58[local73];
							local38[local73] = local521 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local521);
							local42[local73] = local525 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local525);
							local46[local73] = local529 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local529);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static53.anInt1787; local73++) {
							local521 = local50[local73];
							local525 = local54[local73];
							local529 = local58[local73];
							local38[local73] = local521 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local521;
							local42[local73] = local525 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local525;
							local46[local73] = local529 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local529;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static53.anInt1787; local73++) {
							local525 = local54[local73];
							local268 = local66[local73];
							local521 = local50[local73];
							local529 = local58[local73];
							local272 = local70[local73];
							local264 = local62[local73];
							local38[local73] = local264 > local521 ? local521 : local264;
							local42[local73] = local268 <= local525 ? local268 : local525;
							local46[local73] = local529 < local272 ? local529 : local272;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static53.anInt1787; local73++) {
							local529 = local58[local73];
							local521 = local50[local73];
							local264 = local62[local73];
							local268 = local66[local73];
							local272 = local70[local73];
							local525 = local54[local73];
							local38[local73] = local521 > local264 ? local521 : local264;
							local42[local73] = local268 >= local525 ? local268 : local525;
							local46[local73] = local272 >= local529 ? local272 : local529;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static53.anInt1787; local73++) {
							local529 = local58[local73];
							local268 = local66[local73];
							local525 = local54[local73];
							local272 = local70[local73];
							local521 = local50[local73];
							local264 = local62[local73];
							local38[local73] = local264 < local521 ? local521 - local264 : -local521 + local264;
							local42[local73] = local268 >= local525 ? local268 - local525 : -local268 + local525;
							local46[local73] = local529 > local272 ? local529 - local272 : local272 - local529;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static53.anInt1787; local73++) {
							local525 = local54[local73];
							local264 = local62[local73];
							local268 = local66[local73];
							local529 = local58[local73];
							local272 = local70[local73];
							local521 = local50[local73];
							local38[local73] = local264 + local521 - (local521 * local264 >> 11);
							local42[local73] = local525 + local268 - (local268 * local525 >> 11);
							local46[local73] = local272 + local529 - (local529 * local272 >> 11);
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(28) int[] local28 = this.method8731(arg0, 0);
			@Pc(34) int[] local34 = this.method8731(arg0, 1);
			@Pc(37) int local37 = this.anInt2931;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static53.anInt1787; local37++) {
					local11[local37] = local28[local37] + local34[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static53.anInt1787; local37++) {
					local11[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static53.anInt1787; local37++) {
					local11[local37] = local34[local37] * local28[local37] >> 12;
				}
			} else {
				@Pc(153) int local153;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static53.anInt1787; local37++) {
						local153 = local34[local37];
						local11[local37] = local153 == 0 ? 4096 : (local28[local37] << 12) / local153;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static53.anInt1787; local37++) {
						local11[local37] = 4096 - ((4096 - local28[local37]) * (-local34[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static53.anInt1787; local37++) {
						local153 = local34[local37];
						local11[local37] = local153 >= 2048 ? 4096 - ((4096 - local28[local37]) * (-local153 + 4096) >> 11) : local153 * local28[local37] >> 11;
					}
				} else {
					@Pc(265) int local265;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static53.anInt1787; local37++) {
							local265 = local28[local37];
							local11[local37] = local265 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local265);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static53.anInt1787; local37++) {
							local265 = local28[local37];
							local11[local37] = local265 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local265;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static53.anInt1787; local37++) {
							local265 = local28[local37];
							local153 = local34[local37];
							local11[local37] = local265 >= local153 ? local153 : local265;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static53.anInt1787; local37++) {
							local265 = local28[local37];
							local153 = local34[local37];
							local11[local37] = local265 <= local153 ? local153 : local265;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static53.anInt1787; local37++) {
							local153 = local34[local37];
							local265 = local28[local37];
							local11[local37] = local153 < local265 ? local265 - local153 : -local265 + local153;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static53.anInt1787; local37++) {
							local153 = local34[local37];
							local265 = local28[local37];
							local11[local37] = local265 + local153 - (local265 * local153 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2931 = arg1.method8246();
		} else if (arg0 == 1) {
			super.aBoolean842 = arg1.method8246() == 1;
		}
	}
}
