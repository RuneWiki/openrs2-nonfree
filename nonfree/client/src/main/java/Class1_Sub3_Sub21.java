import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class1_Sub3_Sub21 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kp", name = "I", descriptor = "I")
	private int anInt4996 = 6;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub21() {
		super(2, false);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4996 = arg0.method3922();
		} else if (arg1 == 1) {
			super.aBoolean614 = arg0.method3922() == 1;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(26) int[][] local26 = this.method7130(arg0, 0);
			@Pc(32) int[][] local32 = this.method7130(arg0, 1);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt4996;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static452.anInt7734; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static452.anInt7734; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static452.anInt7734; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(260) int local260;
				@Pc(268) int local268;
				@Pc(264) int local264;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static452.anInt7734; local71++) {
						local260 = local60[local71];
						local264 = local68[local71];
						local268 = local64[local71];
						local36[local71] = local260 == 0 ? 4096 : (local48[local71] << 12) / local260;
						local40[local71] = local268 == 0 ? 4096 : (local52[local71] << 12) / local268;
						local44[local71] = local264 == 0 ? 4096 : (local56[local71] << 12) / local264;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static452.anInt7734; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static452.anInt7734; local71++) {
						local260 = local60[local71];
						local268 = local64[local71];
						local264 = local68[local71];
						local36[local71] = local260 < 2048 ? local48[local71] * local260 >> 11 : 4096 - ((4096 - local48[local71]) * (-local260 + 4096) >> 11);
						local40[local71] = local268 < 2048 ? local52[local71] * local268 >> 11 : 4096 - ((4096 - local52[local71]) * (-local268 + 4096) >> 11);
						local44[local71] = local264 < 2048 ? local56[local71] * local264 >> 11 : 4096 - ((4096 - local264) * (-local56[local71] + 4096) >> 11);
					}
				} else {
					@Pc(525) int local525;
					@Pc(533) int local533;
					@Pc(529) int local529;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static452.anInt7734; local71++) {
							local525 = local48[local71];
							local529 = local56[local71];
							local533 = local52[local71];
							local36[local71] = local525 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local525);
							local40[local71] = local533 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local533);
							local44[local71] = local529 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local529);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static452.anInt7734; local71++) {
							local529 = local56[local71];
							local525 = local48[local71];
							local533 = local52[local71];
							local36[local71] = local525 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local525;
							local40[local71] = local533 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local533;
							local44[local71] = local529 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local529;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static452.anInt7734; local71++) {
							local533 = local52[local71];
							local268 = local64[local71];
							local529 = local56[local71];
							local264 = local68[local71];
							local525 = local48[local71];
							local260 = local60[local71];
							local36[local71] = local260 > local525 ? local525 : local260;
							local40[local71] = local268 > local533 ? local533 : local268;
							local44[local71] = local264 > local529 ? local529 : local264;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static452.anInt7734; local71++) {
							local268 = local64[local71];
							local264 = local68[local71];
							local260 = local60[local71];
							local525 = local48[local71];
							local533 = local52[local71];
							local529 = local56[local71];
							local36[local71] = local260 >= local525 ? local260 : local525;
							local40[local71] = local533 > local268 ? local533 : local268;
							local44[local71] = local264 >= local529 ? local264 : local529;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static452.anInt7734; local71++) {
							local525 = local48[local71];
							local533 = local52[local71];
							local268 = local64[local71];
							local264 = local68[local71];
							local260 = local60[local71];
							local529 = local56[local71];
							local36[local71] = local525 > local260 ? local525 - local260 : local260 + -local525;
							local40[local71] = local533 > local268 ? local533 - local268 : local268 + -local533;
							local44[local71] = local264 < local529 ? local529 - local264 : -local529 + local264;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static452.anInt7734; local71++) {
							local264 = local68[local71];
							local529 = local56[local71];
							local260 = local60[local71];
							local533 = local52[local71];
							local268 = local64[local71];
							local525 = local48[local71];
							local36[local71] = local525 + local260 - (local260 * local525 >> 11);
							local40[local71] = local533 + local268 - (local533 * local268 >> 11);
							local44[local71] = local529 + local264 - (local529 * local264 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(26) int[] local26 = this.method7128(0, arg0);
			@Pc(32) int[] local32 = this.method7128(1, arg0);
			@Pc(35) int local35 = this.anInt4996;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static452.anInt7734; local35++) {
					local11[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static452.anInt7734; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static452.anInt7734; local35++) {
					local11[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(167) int local167;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static452.anInt7734; local35++) {
						local167 = local32[local35];
						local11[local35] = local167 == 0 ? 4096 : (local26[local35] << 12) / local167;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static452.anInt7734; local35++) {
						local11[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static452.anInt7734; local35++) {
						local167 = local32[local35];
						local11[local35] = local167 < 2048 ? local167 * local26[local35] >> 11 : 4096 - ((4096 - local26[local35]) * (-local167 + 4096) >> 11);
					}
				} else {
					@Pc(274) int local274;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static452.anInt7734; local35++) {
							local274 = local26[local35];
							local11[local35] = local274 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local274);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static452.anInt7734; local35++) {
							local274 = local26[local35];
							local11[local35] = local274 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local274;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static452.anInt7734; local35++) {
							local274 = local26[local35];
							local167 = local32[local35];
							local11[local35] = local167 <= local274 ? local167 : local274;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static452.anInt7734; local35++) {
							local274 = local26[local35];
							local167 = local32[local35];
							local11[local35] = local167 < local274 ? local274 : local167;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static452.anInt7734; local35++) {
							local274 = local26[local35];
							local167 = local32[local35];
							local11[local35] = local274 > local167 ? local274 - local167 : local167 + -local274;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static452.anInt7734; local35++) {
							local167 = local32[local35];
							local274 = local26[local35];
							local11[local35] = local274 + local167 - (local167 * local274 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
