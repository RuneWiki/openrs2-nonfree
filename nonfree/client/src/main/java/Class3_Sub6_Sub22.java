import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class3_Sub6_Sub22 extends Class3_Sub6 {

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
	private int anInt5562 = 6;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub22() {
		super(2, false);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(26) int[][] local26 = this.method7773(0, arg0);
			@Pc(32) int[][] local32 = this.method7773(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt5562;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static521.anInt8383; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static521.anInt8383; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static521.anInt8383; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(278) int local278;
				@Pc(270) int local270;
				@Pc(274) int local274;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static521.anInt8383; local71++) {
						local270 = local64[local71];
						local274 = local68[local71];
						local278 = local60[local71];
						local36[local71] = local278 == 0 ? 4096 : (local48[local71] << 12) / local278;
						local40[local71] = local270 == 0 ? 4096 : (local52[local71] << 12) / local270;
						local44[local71] = local274 == 0 ? 4096 : (local56[local71] << 12) / local274;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static521.anInt8383; local71++) {
						local36[local71] = 4096 - ((4096 - local60[local71]) * (-local48[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static521.anInt8383; local71++) {
						local270 = local64[local71];
						local278 = local60[local71];
						local274 = local68[local71];
						local36[local71] = local278 < 2048 ? local278 * local48[local71] >> 11 : 4096 - ((4096 - local278) * (-local48[local71] + 4096) >> 11);
						local40[local71] = local270 >= 2048 ? 4096 - ((4096 - local270) * (-local52[local71] + 4096) >> 11) : local270 * local52[local71] >> 11;
						local44[local71] = local274 >= 2048 ? 4096 - ((4096 - local56[local71]) * (-local274 + 4096) >> 11) : local274 * local56[local71] >> 11;
					}
				} else {
					@Pc(531) int local531;
					@Pc(535) int local535;
					@Pc(539) int local539;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static521.anInt8383; local71++) {
							local531 = local48[local71];
							local535 = local52[local71];
							local539 = local56[local71];
							local36[local71] = local531 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local531);
							local40[local71] = local535 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local535);
							local44[local71] = local539 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local539);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static521.anInt8383; local71++) {
							local539 = local56[local71];
							local531 = local48[local71];
							local535 = local52[local71];
							local36[local71] = local531 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local531;
							local40[local71] = local535 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local535;
							local44[local71] = local539 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local539;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static521.anInt8383; local71++) {
							local535 = local52[local71];
							local278 = local60[local71];
							local531 = local48[local71];
							local270 = local64[local71];
							local539 = local56[local71];
							local274 = local68[local71];
							local36[local71] = local531 < local278 ? local531 : local278;
							local40[local71] = local535 >= local270 ? local270 : local535;
							local44[local71] = local274 <= local539 ? local274 : local539;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static521.anInt8383; local71++) {
							local539 = local56[local71];
							local274 = local68[local71];
							local278 = local60[local71];
							local270 = local64[local71];
							local535 = local52[local71];
							local531 = local48[local71];
							local36[local71] = local531 <= local278 ? local278 : local531;
							local40[local71] = local535 <= local270 ? local270 : local535;
							local44[local71] = local274 >= local539 ? local274 : local539;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static521.anInt8383; local71++) {
							local270 = local64[local71];
							local274 = local68[local71];
							local539 = local56[local71];
							local278 = local60[local71];
							local535 = local52[local71];
							local531 = local48[local71];
							local36[local71] = local531 > local278 ? local531 - local278 : -local531 + local278;
							local40[local71] = local270 < local535 ? local535 - local270 : -local535 + local270;
							local44[local71] = local539 > local274 ? local539 - local274 : local274 + -local539;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static521.anInt8383; local71++) {
							local535 = local52[local71];
							local270 = local64[local71];
							local531 = local48[local71];
							local539 = local56[local71];
							local278 = local60[local71];
							local274 = local68[local71];
							local36[local71] = local531 + local278 - (local278 * local531 >> 11);
							local40[local71] = local535 + local270 - (local535 * local270 >> 11);
							local44[local71] = local539 + local274 - (local539 * local274 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(26) int[] local26 = this.method7769(arg0, 0);
			@Pc(32) int[] local32 = this.method7769(arg0, 1);
			@Pc(35) int local35 = this.anInt5562;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static521.anInt8383; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static521.anInt8383; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static521.anInt8383; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(155) int local155;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static521.anInt8383; local35++) {
						local155 = local32[local35];
						local16[local35] = local155 == 0 ? 4096 : (local26[local35] << 12) / local155;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static521.anInt8383; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static521.anInt8383; local35++) {
						local155 = local32[local35];
						local16[local35] = local155 < 2048 ? local155 * local26[local35] >> 11 : 4096 - ((4096 - local155) * (-local26[local35] + 4096) >> 11);
					}
				} else {
					@Pc(263) int local263;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static521.anInt8383; local35++) {
							local263 = local26[local35];
							local16[local35] = local263 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local263);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static521.anInt8383; local35++) {
							local263 = local26[local35];
							local16[local35] = local263 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local263;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static521.anInt8383; local35++) {
							local263 = local26[local35];
							local155 = local32[local35];
							local16[local35] = local263 < local155 ? local263 : local155;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static521.anInt8383; local35++) {
							local155 = local32[local35];
							local263 = local26[local35];
							local16[local35] = local155 >= local263 ? local155 : local263;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static521.anInt8383; local35++) {
							local263 = local26[local35];
							local155 = local32[local35];
							local16[local35] = local155 >= local263 ? local155 - local263 : -local155 + local263;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static521.anInt8383; local35++) {
							local263 = local26[local35];
							local155 = local32[local35];
							local16[local35] = local155 + local263 - (local263 * local155 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5562 = arg0.method5175();
		} else if (arg1 == 1) {
			super.aBoolean729 = arg0.method5175() == 1;
		}
	}
}
