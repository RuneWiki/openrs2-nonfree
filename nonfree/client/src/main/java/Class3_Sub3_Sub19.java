import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class3_Sub3_Sub19 extends Class3_Sub3 {

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
	private int anInt3452 = 6;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub19() {
		super(2, false);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(26) int[][] local26 = this.method5729(0, arg0);
			@Pc(32) int[][] local32 = this.method5729(1, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt3452;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static131.anInt2755; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static131.anInt2755; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static131.anInt2755; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(274) int local274;
				@Pc(278) int local278;
				@Pc(270) int local270;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static131.anInt2755; local71++) {
						local270 = local68[local71];
						local274 = local60[local71];
						local278 = local64[local71];
						local36[local71] = local274 == 0 ? 4096 : (local48[local71] << 12) / local274;
						local40[local71] = local278 == 0 ? 4096 : (local52[local71] << 12) / local278;
						local44[local71] = local270 == 0 ? 4096 : (local56[local71] << 12) / local270;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static131.anInt2755; local71++) {
						local36[local71] = 4096 - ((4096 - local60[local71]) * (-local48[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static131.anInt2755; local71++) {
						local278 = local64[local71];
						local270 = local68[local71];
						local274 = local60[local71];
						local36[local71] = local274 < 2048 ? local274 * local48[local71] >> 11 : 4096 - ((4096 - local274) * (-local48[local71] + 4096) >> 11);
						local40[local71] = local278 < 2048 ? local278 * local52[local71] >> 11 : 4096 - ((4096 - local278) * (-local52[local71] + 4096) >> 11);
						local44[local71] = local270 >= 2048 ? 4096 - ((4096 - local56[local71]) * (-local270 + 4096) >> 11) : local56[local71] * local270 >> 11;
					}
				} else {
					@Pc(536) int local536;
					@Pc(528) int local528;
					@Pc(532) int local532;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static131.anInt2755; local71++) {
							local528 = local52[local71];
							local532 = local56[local71];
							local536 = local48[local71];
							local36[local71] = local536 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local536);
							local40[local71] = local528 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local528);
							local44[local71] = local532 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local532);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static131.anInt2755; local71++) {
							local536 = local48[local71];
							local532 = local56[local71];
							local528 = local52[local71];
							local36[local71] = local536 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local536;
							local40[local71] = local528 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local528;
							local44[local71] = local532 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local532;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static131.anInt2755; local71++) {
							local278 = local64[local71];
							local270 = local68[local71];
							local274 = local60[local71];
							local532 = local56[local71];
							local528 = local52[local71];
							local536 = local48[local71];
							local36[local71] = local274 <= local536 ? local274 : local536;
							local40[local71] = local528 >= local278 ? local278 : local528;
							local44[local71] = local270 > local532 ? local532 : local270;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static131.anInt2755; local71++) {
							local278 = local64[local71];
							local270 = local68[local71];
							local536 = local48[local71];
							local532 = local56[local71];
							local274 = local60[local71];
							local528 = local52[local71];
							local36[local71] = local536 <= local274 ? local274 : local536;
							local40[local71] = local278 < local528 ? local528 : local278;
							local44[local71] = local532 <= local270 ? local270 : local532;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static131.anInt2755; local71++) {
							local536 = local48[local71];
							local274 = local60[local71];
							local532 = local56[local71];
							local278 = local64[local71];
							local270 = local68[local71];
							local528 = local52[local71];
							local36[local71] = local274 < local536 ? local536 - local274 : -local536 + local274;
							local40[local71] = local528 > local278 ? local528 - local278 : local278 + -local528;
							local44[local71] = local532 > local270 ? local532 - local270 : local270 + -local532;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static131.anInt2755; local71++) {
							local532 = local56[local71];
							local278 = local64[local71];
							local536 = local48[local71];
							local528 = local52[local71];
							local274 = local60[local71];
							local270 = local68[local71];
							local36[local71] = local536 + local274 - (local274 * local536 >> 11);
							local40[local71] = local278 + local528 - (local528 * local278 >> 11);
							local44[local71] = local532 + local270 - (local270 * local532 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(29) int[] local29 = this.method5733(arg0, 0);
			@Pc(35) int[] local35 = this.method5733(arg0, 1);
			@Pc(38) int local38 = this.anInt3452;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static131.anInt2755; local38++) {
					local11[local38] = local35[local38] + local29[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static131.anInt2755; local38++) {
					local11[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static131.anInt2755; local38++) {
					local11[local38] = local29[local38] * local35[local38] >> 12;
				}
			} else {
				@Pc(166) int local166;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static131.anInt2755; local38++) {
						local166 = local35[local38];
						local11[local38] = local166 == 0 ? 4096 : (local29[local38] << 12) / local166;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static131.anInt2755; local38++) {
						local11[local38] = 4096 - ((4096 - local29[local38]) * (-local35[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static131.anInt2755; local38++) {
						local166 = local35[local38];
						local11[local38] = local166 >= 2048 ? 4096 - ((4096 - local29[local38]) * (-local166 + 4096) >> 11) : local166 * local29[local38] >> 11;
					}
				} else {
					@Pc(284) int local284;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static131.anInt2755; local38++) {
							local284 = local29[local38];
							local11[local38] = local284 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local284);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static131.anInt2755; local38++) {
							local284 = local29[local38];
							local11[local38] = local284 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local284;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static131.anInt2755; local38++) {
							local166 = local35[local38];
							local284 = local29[local38];
							local11[local38] = local166 <= local284 ? local166 : local284;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static131.anInt2755; local38++) {
							local284 = local29[local38];
							local166 = local35[local38];
							local11[local38] = local166 >= local284 ? local166 : local284;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static131.anInt2755; local38++) {
							local166 = local35[local38];
							local284 = local29[local38];
							local11[local38] = local284 <= local166 ? local166 - local284 : local284 - local166;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static131.anInt2755; local38++) {
							local284 = local29[local38];
							local166 = local35[local38];
							local11[local38] = local284 + local166 - (local284 * local166 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3452 = arg0.method3643();
		} else if (arg1 == 1) {
			super.aBoolean454 = arg0.method3643() == 1;
		}
	}
}
