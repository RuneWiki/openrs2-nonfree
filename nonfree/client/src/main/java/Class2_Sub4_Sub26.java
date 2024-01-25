import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class2_Sub4_Sub26 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
	private int anInt6254 = 6;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub26() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(26) int[][] local26 = this.method8898(0, arg0);
			@Pc(32) int[][] local32 = this.method8898(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt6254;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static395.anInt6816; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static395.anInt6816; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static395.anInt6816; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(257) int local257;
				@Pc(261) int local261;
				@Pc(265) int local265;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static395.anInt6816; local71++) {
						local257 = local60[local71];
						local261 = local64[local71];
						local265 = local68[local71];
						local36[local71] = local257 == 0 ? 4096 : (local48[local71] << 12) / local257;
						local40[local71] = local261 == 0 ? 4096 : (local52[local71] << 12) / local261;
						local44[local71] = local265 == 0 ? 4096 : (local56[local71] << 12) / local265;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static395.anInt6816; local71++) {
						local36[local71] = 4096 - ((4096 - local60[local71]) * (-local48[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (-local56[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static395.anInt6816; local71++) {
						local261 = local64[local71];
						local257 = local60[local71];
						local265 = local68[local71];
						local36[local71] = local257 < 2048 ? local257 * local48[local71] >> 11 : 4096 - ((4096 - local48[local71]) * (4096 - local257) >> 11);
						local40[local71] = local261 >= 2048 ? 4096 - ((4096 - local52[local71]) * (-local261 + 4096) >> 11) : local52[local71] * local261 >> 11;
						local44[local71] = local265 < 2048 ? local56[local71] * local265 >> 11 : 4096 - ((4096 - local56[local71]) * (-local265 + 4096) >> 11);
					}
				} else {
					@Pc(521) int local521;
					@Pc(525) int local525;
					@Pc(517) int local517;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static395.anInt6816; local71++) {
							local517 = local56[local71];
							local521 = local48[local71];
							local525 = local52[local71];
							local36[local71] = local521 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local521);
							local40[local71] = local525 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local525);
							local44[local71] = local517 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local517);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static395.anInt6816; local71++) {
							local521 = local48[local71];
							local517 = local56[local71];
							local525 = local52[local71];
							local36[local71] = local521 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local521;
							local40[local71] = local525 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local525;
							local44[local71] = local517 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local517;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static395.anInt6816; local71++) {
							local261 = local64[local71];
							local517 = local56[local71];
							local265 = local68[local71];
							local525 = local52[local71];
							local257 = local60[local71];
							local521 = local48[local71];
							local36[local71] = local521 < local257 ? local521 : local257;
							local40[local71] = local525 >= local261 ? local261 : local525;
							local44[local71] = local517 >= local265 ? local265 : local517;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static395.anInt6816; local71++) {
							local521 = local48[local71];
							local257 = local60[local71];
							local517 = local56[local71];
							local525 = local52[local71];
							local261 = local64[local71];
							local265 = local68[local71];
							local36[local71] = local257 >= local521 ? local257 : local521;
							local40[local71] = local261 < local525 ? local525 : local261;
							local44[local71] = local517 > local265 ? local517 : local265;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static395.anInt6816; local71++) {
							local261 = local64[local71];
							local525 = local52[local71];
							local521 = local48[local71];
							local257 = local60[local71];
							local517 = local56[local71];
							local265 = local68[local71];
							local36[local71] = local257 < local521 ? local521 - local257 : -local521 + local257;
							local40[local71] = local261 >= local525 ? local261 - local525 : local525 + -local261;
							local44[local71] = local265 < local517 ? local517 - local265 : -local517 + local265;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static395.anInt6816; local71++) {
							local261 = local64[local71];
							local525 = local52[local71];
							local257 = local60[local71];
							local265 = local68[local71];
							local521 = local48[local71];
							local517 = local56[local71];
							local36[local71] = local257 + local521 - (local257 * local521 >> 11);
							local40[local71] = local525 + local261 - (local261 * local525 >> 11);
							local44[local71] = local265 + local517 - (local265 * local517 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(21) int[] local21 = this.method8892(arg0, 0);
			@Pc(27) int[] local27 = this.method8892(arg0, 1);
			@Pc(30) int local30 = this.anInt6254;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static395.anInt6816; local30++) {
					local11[local30] = local21[local30] + local27[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static395.anInt6816; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static395.anInt6816; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(153) int local153;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static395.anInt6816; local30++) {
						local153 = local27[local30];
						local11[local30] = local153 == 0 ? 4096 : (local21[local30] << 12) / local153;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static395.anInt6816; local30++) {
						local11[local30] = 4096 - ((4096 - local27[local30]) * (-local21[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static395.anInt6816; local30++) {
						local153 = local27[local30];
						local11[local30] = local153 >= 2048 ? 4096 - ((4096 - local21[local30]) * (-local153 + 4096) >> 11) : local21[local30] * local153 >> 11;
					}
				} else {
					@Pc(259) int local259;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static395.anInt6816; local30++) {
							local259 = local21[local30];
							local11[local30] = local259 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local259);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static395.anInt6816; local30++) {
							local259 = local21[local30];
							local11[local30] = local259 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local259;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static395.anInt6816; local30++) {
							local153 = local27[local30];
							local259 = local21[local30];
							local11[local30] = local259 < local153 ? local259 : local153;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static395.anInt6816; local30++) {
							local259 = local21[local30];
							local153 = local27[local30];
							local11[local30] = local153 >= local259 ? local153 : local259;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static395.anInt6816; local30++) {
							local153 = local27[local30];
							local259 = local21[local30];
							local11[local30] = local259 > local153 ? local259 - local153 : -local259 + local153;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static395.anInt6816; local30++) {
							local153 = local27[local30];
							local259 = local21[local30];
							local11[local30] = local259 + local153 - (local153 * local259 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6254 = arg0.method2859();
		} else if (arg1 == 1) {
			super.aBoolean763 = arg0.method2859() == 1;
		}
	}
}
