import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jja")
public final class Class5_Sub2_Sub18 extends Class5_Sub2 {

	@OriginalMember(owner = "client!jja", name = "G", descriptor = "I")
	private int anInt5610 = 6;

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub18() {
		super(2, false);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5610 = arg0.method7816();
		} else if (arg1 == 1) {
			super.aBoolean910 = arg0.method7816() == 1;
		}
	}

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(26) int[][] local26 = this.method8952(0, arg0);
			@Pc(32) int[][] local32 = this.method8952(1, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt5610;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static195.anInt3759; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static195.anInt3759; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static195.anInt3759; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(274) int local274;
				@Pc(278) int local278;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static195.anInt3759; local71++) {
						local270 = local60[local71];
						local274 = local64[local71];
						local278 = local68[local71];
						local36[local71] = local270 == 0 ? 4096 : (local48[local71] << 12) / local270;
						local40[local71] = local274 == 0 ? 4096 : (local52[local71] << 12) / local274;
						local44[local71] = local278 == 0 ? 4096 : (local56[local71] << 12) / local278;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static195.anInt3759; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (4096 - local60[local71]) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (4096 - local68[local71]) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static195.anInt3759; local71++) {
						local278 = local68[local71];
						local270 = local60[local71];
						local274 = local64[local71];
						local36[local71] = local270 >= 2048 ? 4096 - ((4096 - local48[local71]) * (-local270 + 4096) >> 11) : local48[local71] * local270 >> 11;
						local40[local71] = local274 < 2048 ? local52[local71] * local274 >> 11 : 4096 - ((4096 - local274) * (4096 - local52[local71]) >> 11);
						local44[local71] = local278 >= 2048 ? 4096 - ((4096 - local278) * (-local56[local71] + 4096) >> 11) : local56[local71] * local278 >> 11;
					}
				} else {
					@Pc(534) int local534;
					@Pc(530) int local530;
					@Pc(526) int local526;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static195.anInt3759; local71++) {
							local526 = local56[local71];
							local530 = local52[local71];
							local534 = local48[local71];
							local36[local71] = local534 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local534);
							local40[local71] = local530 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local530);
							local44[local71] = local526 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local526);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static195.anInt3759; local71++) {
							local526 = local56[local71];
							local534 = local48[local71];
							local530 = local52[local71];
							local36[local71] = local534 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local534;
							local40[local71] = local530 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local530;
							local44[local71] = local526 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local526;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static195.anInt3759; local71++) {
							local278 = local68[local71];
							local270 = local60[local71];
							local526 = local56[local71];
							local530 = local52[local71];
							local274 = local64[local71];
							local534 = local48[local71];
							local36[local71] = local270 <= local534 ? local270 : local534;
							local40[local71] = local274 > local530 ? local530 : local274;
							local44[local71] = local278 > local526 ? local526 : local278;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static195.anInt3759; local71++) {
							local274 = local64[local71];
							local278 = local68[local71];
							local530 = local52[local71];
							local270 = local60[local71];
							local526 = local56[local71];
							local534 = local48[local71];
							local36[local71] = local270 >= local534 ? local270 : local534;
							local40[local71] = local274 < local530 ? local530 : local274;
							local44[local71] = local526 > local278 ? local526 : local278;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static195.anInt3759; local71++) {
							local526 = local56[local71];
							local270 = local60[local71];
							local530 = local52[local71];
							local278 = local68[local71];
							local274 = local64[local71];
							local534 = local48[local71];
							local36[local71] = local270 < local534 ? local534 - local270 : local270 - local534;
							local40[local71] = local274 < local530 ? local530 - local274 : local274 - local530;
							local44[local71] = local526 > local278 ? local526 - local278 : local278 - local526;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static195.anInt3759; local71++) {
							local530 = local52[local71];
							local526 = local56[local71];
							local274 = local64[local71];
							local278 = local68[local71];
							local534 = local48[local71];
							local270 = local60[local71];
							local36[local71] = local270 + local534 - (local534 * local270 >> 11);
							local40[local71] = local530 + local274 - (local274 * local530 >> 11);
							local44[local71] = local278 + local526 - (local526 * local278 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(27) int[] local27 = this.method8945(arg0, 0);
			@Pc(33) int[] local33 = this.method8945(arg0, 1);
			@Pc(36) int local36 = this.anInt5610;
			if (local36 == 1) {
				for (local36 = 0; local36 < Static195.anInt3759; local36++) {
					local17[local36] = local27[local36] + local33[local36];
				}
			} else if (local36 == 2) {
				for (local36 = 0; local36 < Static195.anInt3759; local36++) {
					local17[local36] = local27[local36] - local33[local36];
				}
			} else if (local36 == 3) {
				for (local36 = 0; local36 < Static195.anInt3759; local36++) {
					local17[local36] = local33[local36] * local27[local36] >> 12;
				}
			} else {
				@Pc(160) int local160;
				if (local36 == 4) {
					for (local36 = 0; local36 < Static195.anInt3759; local36++) {
						local160 = local33[local36];
						local17[local36] = local160 == 0 ? 4096 : (local27[local36] << 12) / local160;
					}
				} else if (local36 == 5) {
					for (local36 = 0; local36 < Static195.anInt3759; local36++) {
						local17[local36] = 4096 - ((4096 - local33[local36]) * (-local27[local36] + 4096) >> 12);
					}
				} else if (local36 == 6) {
					for (local36 = 0; local36 < Static195.anInt3759; local36++) {
						local160 = local33[local36];
						local17[local36] = local160 < 2048 ? local160 * local27[local36] >> 11 : 4096 - ((4096 - local27[local36]) * (4096 - local160) >> 11);
					}
				} else {
					@Pc(274) int local274;
					if (local36 == 7) {
						for (local36 = 0; local36 < Static195.anInt3759; local36++) {
							local274 = local27[local36];
							local17[local36] = local274 == 4096 ? 4096 : (local33[local36] << 12) / (4096 - local274);
						}
					} else if (local36 == 8) {
						for (local36 = 0; local36 < Static195.anInt3759; local36++) {
							local274 = local27[local36];
							local17[local36] = local274 == 0 ? 0 : 4096 - (4096 - local33[local36] << 12) / local274;
						}
					} else if (local36 == 9) {
						for (local36 = 0; local36 < Static195.anInt3759; local36++) {
							local160 = local33[local36];
							local274 = local27[local36];
							local17[local36] = local160 <= local274 ? local160 : local274;
						}
					} else if (local36 == 10) {
						for (local36 = 0; local36 < Static195.anInt3759; local36++) {
							local274 = local27[local36];
							local160 = local33[local36];
							local17[local36] = local160 < local274 ? local274 : local160;
						}
					} else if (local36 == 11) {
						for (local36 = 0; local36 < Static195.anInt3759; local36++) {
							local274 = local27[local36];
							local160 = local33[local36];
							local17[local36] = local274 > local160 ? local274 - local160 : local160 + -local274;
						}
					} else if (local36 == 12) {
						for (local36 = 0; local36 < Static195.anInt3759; local36++) {
							local274 = local27[local36];
							local160 = local33[local36];
							local17[local36] = local274 + local160 - (local160 * local274 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}
}
