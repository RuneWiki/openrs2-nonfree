import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
	private int anInt850 = 6;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(2, false);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt850 = arg0.method2945();
		} else if (arg1 == 1) {
			super.aBoolean442 = arg0.method2945() == 1;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(29) int[] local29 = this.method3706(arg0, 0);
			@Pc(35) int[] local35 = this.method3706(arg0, 1);
			@Pc(38) int local38 = this.anInt850;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static11.anInt294; local38++) {
					local15[local38] = local35[local38] + local29[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static11.anInt294; local38++) {
					local15[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static11.anInt294; local38++) {
					local15[local38] = local29[local38] * local35[local38] >> 12;
				}
			} else {
				@Pc(163) int local163;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static11.anInt294; local38++) {
						local163 = local35[local38];
						local15[local38] = local163 == 0 ? 4096 : (local29[local38] << 12) / local163;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static11.anInt294; local38++) {
						local15[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static11.anInt294; local38++) {
						local163 = local35[local38];
						local15[local38] = local163 >= 2048 ? 4096 - ((4096 - local29[local38]) * (-local163 + 4096) >> 11) : local163 * local29[local38] >> 11;
					}
				} else {
					@Pc(274) int local274;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static11.anInt294; local38++) {
							local274 = local29[local38];
							local15[local38] = local274 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local274);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static11.anInt294; local38++) {
							local274 = local29[local38];
							local15[local38] = local274 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local274;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static11.anInt294; local38++) {
							local274 = local29[local38];
							local163 = local35[local38];
							local15[local38] = local163 <= local274 ? local163 : local274;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static11.anInt294; local38++) {
							local163 = local35[local38];
							local274 = local29[local38];
							local15[local38] = local274 <= local163 ? local163 : local274;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static11.anInt294; local38++) {
							local274 = local29[local38];
							local163 = local35[local38];
							local15[local38] = local163 < local274 ? local274 - local163 : local163 - local274;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static11.anInt294; local38++) {
							local163 = local35[local38];
							local274 = local29[local38];
							local15[local38] = local274 + local163 - (local163 * local274 >> 11);
						}
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(28) int[][] local28 = this.method3713(arg0, 0);
			@Pc(34) int[][] local34 = this.method3713(arg0, 1);
			@Pc(38) int[] local38 = local13[2];
			@Pc(42) int[] local42 = local13[0];
			@Pc(46) int[] local46 = local13[1];
			@Pc(50) int[] local50 = local28[0];
			@Pc(54) int[] local54 = local28[2];
			@Pc(58) int[] local58 = local34[2];
			@Pc(62) int[] local62 = local28[1];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[0];
			@Pc(73) int local73 = this.anInt850;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static11.anInt294; local73++) {
					local42[local73] = local50[local73] + local70[local73];
					local46[local73] = local62[local73] + local66[local73];
					local38[local73] = local54[local73] + local58[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static11.anInt294; local73++) {
					local42[local73] = local50[local73] - local70[local73];
					local46[local73] = local62[local73] - local66[local73];
					local38[local73] = local54[local73] - local58[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static11.anInt294; local73++) {
					local42[local73] = local70[local73] * local50[local73] >> 12;
					local46[local73] = local66[local73] * local62[local73] >> 12;
					local38[local73] = local54[local73] * local58[local73] >> 12;
				}
			} else {
				@Pc(262) int local262;
				@Pc(270) int local270;
				@Pc(266) int local266;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static11.anInt294; local73++) {
						local262 = local70[local73];
						local266 = local58[local73];
						local270 = local66[local73];
						local42[local73] = local262 == 0 ? 4096 : (local50[local73] << 12) / local262;
						local46[local73] = local270 == 0 ? 4096 : (local62[local73] << 12) / local270;
						local38[local73] = local266 == 0 ? 4096 : (local54[local73] << 12) / local266;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static11.anInt294; local73++) {
						local42[local73] = 4096 - ((4096 - local70[local73]) * (-local50[local73] + 4096) >> 12);
						local46[local73] = 4096 - ((4096 - local62[local73]) * (-local66[local73] + 4096) >> 12);
						local38[local73] = 4096 - ((4096 - local58[local73]) * (4096 - local54[local73]) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static11.anInt294; local73++) {
						local262 = local70[local73];
						local266 = local58[local73];
						local270 = local66[local73];
						local42[local73] = local262 < 2048 ? local50[local73] * local262 >> 11 : 4096 - ((4096 - local262) * (4096 - local50[local73]) >> 11);
						local46[local73] = local270 < 2048 ? local62[local73] * local270 >> 11 : 4096 - ((4096 - local62[local73]) * (-local270 + 4096) >> 11);
						local38[local73] = local266 >= 2048 ? 4096 - ((4096 - local54[local73]) * (-local266 + 4096) >> 11) : local266 * local54[local73] >> 11;
					}
				} else {
					@Pc(518) int local518;
					@Pc(522) int local522;
					@Pc(526) int local526;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static11.anInt294; local73++) {
							local518 = local50[local73];
							local522 = local62[local73];
							local526 = local54[local73];
							local42[local73] = local518 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local518);
							local46[local73] = local522 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local522);
							local38[local73] = local526 == 4096 ? 4096 : (local58[local73] << 12) / (4096 - local526);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static11.anInt294; local73++) {
							local518 = local50[local73];
							local526 = local54[local73];
							local522 = local62[local73];
							local42[local73] = local518 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local518;
							local46[local73] = local522 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local522;
							local38[local73] = local526 == 0 ? 0 : 4096 - (4096 - local58[local73] << 12) / local526;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static11.anInt294; local73++) {
							local526 = local54[local73];
							local270 = local66[local73];
							local522 = local62[local73];
							local262 = local70[local73];
							local518 = local50[local73];
							local266 = local58[local73];
							local42[local73] = local518 >= local262 ? local262 : local518;
							local46[local73] = local522 >= local270 ? local270 : local522;
							local38[local73] = local526 >= local266 ? local266 : local526;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static11.anInt294; local73++) {
							local526 = local54[local73];
							local266 = local58[local73];
							local518 = local50[local73];
							local270 = local66[local73];
							local522 = local62[local73];
							local262 = local70[local73];
							local42[local73] = local518 > local262 ? local518 : local262;
							local46[local73] = local270 < local522 ? local522 : local270;
							local38[local73] = local526 <= local266 ? local266 : local526;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static11.anInt294; local73++) {
							local266 = local58[local73];
							local526 = local54[local73];
							local270 = local66[local73];
							local522 = local62[local73];
							local518 = local50[local73];
							local262 = local70[local73];
							local42[local73] = local518 > local262 ? local518 - local262 : local262 + -local518;
							local46[local73] = local522 > local270 ? local522 - local270 : -local522 + local270;
							local38[local73] = local266 >= local526 ? local266 - local526 : local526 + -local266;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static11.anInt294; local73++) {
							local522 = local62[local73];
							local262 = local70[local73];
							local266 = local58[local73];
							local270 = local66[local73];
							local526 = local54[local73];
							local518 = local50[local73];
							local42[local73] = local518 + local262 - (local518 * local262 >> 11);
							local46[local73] = local522 + local270 - (local270 * local522 >> 11);
							local38[local73] = local266 + local526 - (local526 * local266 >> 11);
						}
					}
				}
			}
		}
		return local13;
	}
}
