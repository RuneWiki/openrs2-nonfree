import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class7_Sub3_Sub36 extends Class7_Sub3 {

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
	private int anInt6699 = 6;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub36() {
		super(2, false);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt6699 = arg1.method3981();
		} else if (arg0 == 1) {
			super.aBoolean490 = arg1.method3981() == 1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(26) int[][] local26 = this.method5597(0, arg0);
			@Pc(32) int[][] local32 = this.method5597(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt6699;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static58.anInt1052; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static58.anInt1052; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static58.anInt1052; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(264) int local264;
				@Pc(260) int local260;
				@Pc(268) int local268;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static58.anInt1052; local71++) {
						local260 = local64[local71];
						local264 = local60[local71];
						local268 = local68[local71];
						local36[local71] = local264 == 0 ? 4096 : (local48[local71] << 12) / local264;
						local40[local71] = local260 == 0 ? 4096 : (local52[local71] << 12) / local260;
						local44[local71] = local268 == 0 ? 4096 : (local56[local71] << 12) / local268;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static58.anInt1052; local71++) {
						local36[local71] = 4096 - ((4096 - local60[local71]) * (4096 - local48[local71]) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (-local56[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static58.anInt1052; local71++) {
						local268 = local68[local71];
						local260 = local64[local71];
						local264 = local60[local71];
						local36[local71] = local264 >= 2048 ? 4096 - ((4096 - local48[local71]) * (-local264 + 4096) >> 11) : local264 * local48[local71] >> 11;
						local40[local71] = local260 >= 2048 ? 4096 - ((4096 - local260) * (-local52[local71] + 4096) >> 11) : local260 * local52[local71] >> 11;
						local44[local71] = local268 >= 2048 ? 4096 - ((4096 - local56[local71]) * (-local268 + 4096) >> 11) : local56[local71] * local268 >> 11;
					}
				} else {
					@Pc(518) int local518;
					@Pc(526) int local526;
					@Pc(522) int local522;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static58.anInt1052; local71++) {
							local518 = local48[local71];
							local522 = local56[local71];
							local526 = local52[local71];
							local36[local71] = local518 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local518);
							local40[local71] = local526 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local526);
							local44[local71] = local522 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local522);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static58.anInt1052; local71++) {
							local526 = local52[local71];
							local522 = local56[local71];
							local518 = local48[local71];
							local36[local71] = local518 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local518;
							local40[local71] = local526 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local526;
							local44[local71] = local522 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local522;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static58.anInt1052; local71++) {
							local268 = local68[local71];
							local522 = local56[local71];
							local526 = local52[local71];
							local518 = local48[local71];
							local260 = local64[local71];
							local264 = local60[local71];
							local36[local71] = local518 >= local264 ? local264 : local518;
							local40[local71] = local260 > local526 ? local526 : local260;
							local44[local71] = local268 > local522 ? local522 : local268;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static58.anInt1052; local71++) {
							local264 = local60[local71];
							local260 = local64[local71];
							local522 = local56[local71];
							local268 = local68[local71];
							local526 = local52[local71];
							local518 = local48[local71];
							local36[local71] = local518 <= local264 ? local264 : local518;
							local40[local71] = local526 <= local260 ? local260 : local526;
							local44[local71] = local522 <= local268 ? local268 : local522;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static58.anInt1052; local71++) {
							local522 = local56[local71];
							local268 = local68[local71];
							local260 = local64[local71];
							local518 = local48[local71];
							local526 = local52[local71];
							local264 = local60[local71];
							local36[local71] = local264 >= local518 ? local264 - local518 : -local264 + local518;
							local40[local71] = local260 < local526 ? local526 - local260 : -local526 + local260;
							local44[local71] = local268 < local522 ? local522 - local268 : local268 - local522;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static58.anInt1052; local71++) {
							local526 = local52[local71];
							local518 = local48[local71];
							local268 = local68[local71];
							local522 = local56[local71];
							local260 = local64[local71];
							local264 = local60[local71];
							local36[local71] = local264 + local518 - (local264 * local518 >> 11);
							local40[local71] = local260 + local526 - (local526 * local260 >> 11);
							local44[local71] = local268 + local522 - (local522 * local268 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(21) int[] local21 = this.method5591(0, arg0);
			@Pc(27) int[] local27 = this.method5591(1, arg0);
			@Pc(30) int local30 = this.anInt6699;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static58.anInt1052; local30++) {
					local11[local30] = local27[local30] + local21[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static58.anInt1052; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static58.anInt1052; local30++) {
					local11[local30] = local21[local30] * local27[local30] >> 12;
				}
			} else {
				@Pc(165) int local165;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static58.anInt1052; local30++) {
						local165 = local27[local30];
						local11[local30] = local165 == 0 ? 4096 : (local21[local30] << 12) / local165;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static58.anInt1052; local30++) {
						local11[local30] = 4096 - ((4096 - local27[local30]) * (-local21[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static58.anInt1052; local30++) {
						local165 = local27[local30];
						local11[local30] = local165 >= 2048 ? 4096 - ((4096 - local165) * (-local21[local30] + 4096) >> 11) : local21[local30] * local165 >> 11;
					}
				} else {
					@Pc(278) int local278;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static58.anInt1052; local30++) {
							local278 = local21[local30];
							local11[local30] = local278 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local278);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static58.anInt1052; local30++) {
							local278 = local21[local30];
							local11[local30] = local278 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local278;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static58.anInt1052; local30++) {
							local165 = local27[local30];
							local278 = local21[local30];
							local11[local30] = local278 < local165 ? local278 : local165;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static58.anInt1052; local30++) {
							local278 = local21[local30];
							local165 = local27[local30];
							local11[local30] = local165 < local278 ? local278 : local165;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static58.anInt1052; local30++) {
							local278 = local21[local30];
							local165 = local27[local30];
							local11[local30] = local165 >= local278 ? local165 - local278 : local278 - local165;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static58.anInt1052; local30++) {
							local165 = local27[local30];
							local278 = local21[local30];
							local11[local30] = local165 + local278 - (local165 * local278 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
