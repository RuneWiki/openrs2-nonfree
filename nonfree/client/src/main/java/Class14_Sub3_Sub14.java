import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class14_Sub3_Sub14 extends Class14_Sub3 {

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
	private int anInt2549 = 6;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub14() {
		super(2, false);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2549 = arg0.method2548();
		} else if (arg1 == 1) {
			super.aBoolean446 = arg0.method2548() == 1;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(26) int[] local26 = this.method6004(0, arg0);
			@Pc(32) int[] local32 = this.method6004(1, arg0);
			@Pc(35) int local35 = this.anInt2549;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static294.anInt5657; local35++) {
					local11[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static294.anInt5657; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static294.anInt5657; local35++) {
					local11[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(166) int local166;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static294.anInt5657; local35++) {
						local166 = local32[local35];
						local11[local35] = local166 == 0 ? 4096 : (local26[local35] << 12) / local166;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static294.anInt5657; local35++) {
						local11[local35] = 4096 - ((4096 - local32[local35]) * (4096 - local26[local35]) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static294.anInt5657; local35++) {
						local166 = local32[local35];
						local11[local35] = local166 < 2048 ? local26[local35] * local166 >> 11 : 4096 - ((4096 - local26[local35]) * (-local166 + 4096) >> 11);
					}
				} else {
					@Pc(278) int local278;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static294.anInt5657; local35++) {
							local278 = local26[local35];
							local11[local35] = local278 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local278);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static294.anInt5657; local35++) {
							local278 = local26[local35];
							local11[local35] = local278 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local278;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static294.anInt5657; local35++) {
							local278 = local26[local35];
							local166 = local32[local35];
							local11[local35] = local278 < local166 ? local278 : local166;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static294.anInt5657; local35++) {
							local166 = local32[local35];
							local278 = local26[local35];
							local11[local35] = local278 > local166 ? local278 : local166;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static294.anInt5657; local35++) {
							local278 = local26[local35];
							local166 = local32[local35];
							local11[local35] = local166 >= local278 ? local166 - local278 : local278 - local166;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static294.anInt5657; local35++) {
							local166 = local32[local35];
							local278 = local26[local35];
							local11[local35] = local166 + local278 - (local278 * local166 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(26) int[][] local26 = this.method5997(arg0, 0);
			@Pc(34) int[][] local34 = this.method5997(arg0, 1);
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			@Pc(50) int[] local50 = local26[0];
			@Pc(54) int[] local54 = local26[1];
			@Pc(58) int[] local58 = local26[2];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt2549;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static294.anInt5657; local73++) {
					local38[local73] = local62[local73] + local50[local73];
					local42[local73] = local54[local73] + local66[local73];
					local46[local73] = local58[local73] + local70[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static294.anInt5657; local73++) {
					local38[local73] = local50[local73] - local62[local73];
					local42[local73] = local54[local73] - local66[local73];
					local46[local73] = local58[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static294.anInt5657; local73++) {
					local38[local73] = local50[local73] * local62[local73] >> 12;
					local42[local73] = local54[local73] * local66[local73] >> 12;
					local46[local73] = local70[local73] * local58[local73] >> 12;
				}
			} else {
				@Pc(269) int local269;
				@Pc(261) int local261;
				@Pc(265) int local265;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static294.anInt5657; local73++) {
						local261 = local66[local73];
						local265 = local70[local73];
						local269 = local62[local73];
						local38[local73] = local269 == 0 ? 4096 : (local50[local73] << 12) / local269;
						local42[local73] = local261 == 0 ? 4096 : (local54[local73] << 12) / local261;
						local46[local73] = local265 == 0 ? 4096 : (local58[local73] << 12) / local265;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static294.anInt5657; local73++) {
						local38[local73] = 4096 - ((4096 - local50[local73]) * (-local62[local73] + 4096) >> 12);
						local42[local73] = 4096 - ((4096 - local54[local73]) * (-local66[local73] + 4096) >> 12);
						local46[local73] = 4096 - ((4096 - local70[local73]) * (4096 - local58[local73]) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static294.anInt5657; local73++) {
						local265 = local70[local73];
						local261 = local66[local73];
						local269 = local62[local73];
						local38[local73] = local269 < 2048 ? local269 * local50[local73] >> 11 : 4096 - ((4096 - local269) * (-local50[local73] + 4096) >> 11);
						local42[local73] = local261 < 2048 ? local261 * local54[local73] >> 11 : 4096 - ((4096 - local261) * (-local54[local73] + 4096) >> 11);
						local46[local73] = local265 >= 2048 ? 4096 - ((4096 - local58[local73]) * (-local265 + 4096) >> 11) : local265 * local58[local73] >> 11;
					}
				} else {
					@Pc(517) int local517;
					@Pc(513) int local513;
					@Pc(521) int local521;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static294.anInt5657; local73++) {
							local513 = local54[local73];
							local517 = local50[local73];
							local521 = local58[local73];
							local38[local73] = local517 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local517);
							local42[local73] = local513 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local513);
							local46[local73] = local521 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local521);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static294.anInt5657; local73++) {
							local521 = local58[local73];
							local517 = local50[local73];
							local513 = local54[local73];
							local38[local73] = local517 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local517;
							local42[local73] = local513 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local513;
							local46[local73] = local521 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local521;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static294.anInt5657; local73++) {
							local513 = local54[local73];
							local261 = local66[local73];
							local269 = local62[local73];
							local517 = local50[local73];
							local521 = local58[local73];
							local265 = local70[local73];
							local38[local73] = local269 <= local517 ? local269 : local517;
							local42[local73] = local261 > local513 ? local513 : local261;
							local46[local73] = local265 <= local521 ? local265 : local521;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static294.anInt5657; local73++) {
							local513 = local54[local73];
							local521 = local58[local73];
							local261 = local66[local73];
							local517 = local50[local73];
							local265 = local70[local73];
							local269 = local62[local73];
							local38[local73] = local517 <= local269 ? local269 : local517;
							local42[local73] = local513 <= local261 ? local261 : local513;
							local46[local73] = local521 > local265 ? local521 : local265;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static294.anInt5657; local73++) {
							local269 = local62[local73];
							local521 = local58[local73];
							local261 = local66[local73];
							local513 = local54[local73];
							local517 = local50[local73];
							local265 = local70[local73];
							local38[local73] = local517 > local269 ? local517 - local269 : -local517 + local269;
							local42[local73] = local261 < local513 ? local513 - local261 : local261 - local513;
							local46[local73] = local265 < local521 ? local521 - local265 : -local521 + local265;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static294.anInt5657; local73++) {
							local521 = local58[local73];
							local513 = local54[local73];
							local261 = local66[local73];
							local265 = local70[local73];
							local517 = local50[local73];
							local269 = local62[local73];
							local38[local73] = local269 + local517 - (local517 * local269 >> 11);
							local42[local73] = local261 + local513 - (local513 * local261 >> 11);
							local46[local73] = local265 + local521 - (local265 * local521 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
