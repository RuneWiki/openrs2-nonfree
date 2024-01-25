import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uha")
public final class Class3_Sub2_Sub33 extends Class3_Sub2 {

	@OriginalMember(owner = "client!uha", name = "E", descriptor = "I")
	private int anInt9492 = 6;

	@OriginalMember(owner = "client!uha", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub33() {
		super(2, false);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9492 = arg0.method4225();
		} else if (arg1 == 1) {
			super.aBoolean720 = arg0.method4225() == 1;
		}
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(26) int[][] local26 = this.method8595(arg0, 0);
			@Pc(32) int[][] local32 = this.method8595(arg0, 1);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt9492;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static491.anInt8519; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static491.anInt8519; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static491.anInt8519; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(264) int local264;
				@Pc(268) int local268;
				@Pc(272) int local272;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static491.anInt8519; local71++) {
						local264 = local60[local71];
						local268 = local64[local71];
						local272 = local68[local71];
						local36[local71] = local264 == 0 ? 4096 : (local48[local71] << 12) / local264;
						local40[local71] = local268 == 0 ? 4096 : (local52[local71] << 12) / local268;
						local44[local71] = local272 == 0 ? 4096 : (local56[local71] << 12) / local272;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static491.anInt8519; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (4096 - local60[local71]) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static491.anInt8519; local71++) {
						local264 = local60[local71];
						local272 = local68[local71];
						local268 = local64[local71];
						local36[local71] = local264 < 2048 ? local48[local71] * local264 >> 11 : 4096 - ((4096 - local48[local71]) * (-local264 + 4096) >> 11);
						local40[local71] = local268 < 2048 ? local268 * local52[local71] >> 11 : 4096 - ((4096 - local52[local71]) * (4096 - local268) >> 11);
						local44[local71] = local272 >= 2048 ? 4096 - ((4096 - local272) * (-local56[local71] + 4096) >> 11) : local272 * local56[local71] >> 11;
					}
				} else {
					@Pc(517) int local517;
					@Pc(525) int local525;
					@Pc(521) int local521;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static491.anInt8519; local71++) {
							local517 = local48[local71];
							local521 = local56[local71];
							local525 = local52[local71];
							local36[local71] = local517 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local517);
							local40[local71] = local525 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local525);
							local44[local71] = local521 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local521);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static491.anInt8519; local71++) {
							local521 = local56[local71];
							local525 = local52[local71];
							local517 = local48[local71];
							local36[local71] = local517 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local517;
							local40[local71] = local525 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local525;
							local44[local71] = local521 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local521;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static491.anInt8519; local71++) {
							local272 = local68[local71];
							local268 = local64[local71];
							local517 = local48[local71];
							local525 = local52[local71];
							local264 = local60[local71];
							local521 = local56[local71];
							local36[local71] = local517 >= local264 ? local264 : local517;
							local40[local71] = local268 <= local525 ? local268 : local525;
							local44[local71] = local521 >= local272 ? local272 : local521;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static491.anInt8519; local71++) {
							local272 = local68[local71];
							local264 = local60[local71];
							local521 = local56[local71];
							local525 = local52[local71];
							local517 = local48[local71];
							local268 = local64[local71];
							local36[local71] = local517 > local264 ? local517 : local264;
							local40[local71] = local525 <= local268 ? local268 : local525;
							local44[local71] = local272 < local521 ? local521 : local272;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static491.anInt8519; local71++) {
							local264 = local60[local71];
							local268 = local64[local71];
							local525 = local52[local71];
							local517 = local48[local71];
							local521 = local56[local71];
							local272 = local68[local71];
							local36[local71] = local517 <= local264 ? local264 - local517 : -local264 + local517;
							local40[local71] = local268 < local525 ? local525 - local268 : -local525 + local268;
							local44[local71] = local272 >= local521 ? local272 - local521 : local521 - local272;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static491.anInt8519; local71++) {
							local272 = local68[local71];
							local268 = local64[local71];
							local517 = local48[local71];
							local525 = local52[local71];
							local521 = local56[local71];
							local264 = local60[local71];
							local36[local71] = local517 + local264 - (local517 * local264 >> 11);
							local40[local71] = local268 + local525 - (local525 * local268 >> 11);
							local44[local71] = local272 + local521 - (local272 * local521 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(21) int[] local21 = this.method8603(arg0, 0);
			@Pc(27) int[] local27 = this.method8603(arg0, 1);
			@Pc(30) int local30 = this.anInt9492;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static491.anInt8519; local30++) {
					local11[local30] = local21[local30] + local27[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static491.anInt8519; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static491.anInt8519; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(170) int local170;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static491.anInt8519; local30++) {
						local170 = local27[local30];
						local11[local30] = local170 == 0 ? 4096 : (local21[local30] << 12) / local170;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static491.anInt8519; local30++) {
						local11[local30] = 4096 - ((4096 - local21[local30]) * (4096 - local27[local30]) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static491.anInt8519; local30++) {
						local170 = local27[local30];
						local11[local30] = local170 >= 2048 ? 4096 - ((4096 - local21[local30]) * (-local170 + 4096) >> 11) : local21[local30] * local170 >> 11;
					}
				} else {
					@Pc(279) int local279;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static491.anInt8519; local30++) {
							local279 = local21[local30];
							local11[local30] = local279 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local279);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static491.anInt8519; local30++) {
							local279 = local21[local30];
							local11[local30] = local279 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local279;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static491.anInt8519; local30++) {
							local170 = local27[local30];
							local279 = local21[local30];
							local11[local30] = local170 <= local279 ? local170 : local279;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static491.anInt8519; local30++) {
							local170 = local27[local30];
							local279 = local21[local30];
							local11[local30] = local279 > local170 ? local279 : local170;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static491.anInt8519; local30++) {
							local279 = local21[local30];
							local170 = local27[local30];
							local11[local30] = local170 < local279 ? local279 - local170 : -local279 + local170;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static491.anInt8519; local30++) {
							local279 = local21[local30];
							local170 = local27[local30];
							local11[local30] = local279 + local170 - (local279 * local170 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
