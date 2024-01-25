import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class3_Sub1_Sub36 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tda", name = "L", descriptor = "I")
	private int anInt8308 = 6;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub36() {
		super(2, false);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt8308 = arg1.method7548();
		} else if (arg0 == 1) {
			super.aBoolean687 = arg1.method7548() == 1;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(21) int[] local21 = this.method7778(0, arg0);
			@Pc(27) int[] local27 = this.method7778(1, arg0);
			@Pc(30) int local30 = this.anInt8308;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static307.anInt4846; local30++) {
					local11[local30] = local21[local30] + local27[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static307.anInt4846; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static307.anInt4846; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(157) int local157;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static307.anInt4846; local30++) {
						local157 = local27[local30];
						local11[local30] = local157 == 0 ? 4096 : (local21[local30] << 12) / local157;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static307.anInt4846; local30++) {
						local11[local30] = 4096 - ((4096 - local27[local30]) * (4096 - local21[local30]) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static307.anInt4846; local30++) {
						local157 = local27[local30];
						local11[local30] = local157 < 2048 ? local21[local30] * local157 >> 11 : 4096 - ((4096 - local21[local30]) * (-local157 + 4096) >> 11);
					}
				} else {
					@Pc(263) int local263;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static307.anInt4846; local30++) {
							local263 = local21[local30];
							local11[local30] = local263 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local263);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static307.anInt4846; local30++) {
							local263 = local21[local30];
							local11[local30] = local263 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local263;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static307.anInt4846; local30++) {
							local263 = local21[local30];
							local157 = local27[local30];
							local11[local30] = local157 > local263 ? local263 : local157;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static307.anInt4846; local30++) {
							local157 = local27[local30];
							local263 = local21[local30];
							local11[local30] = local157 >= local263 ? local157 : local263;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static307.anInt4846; local30++) {
							local263 = local21[local30];
							local157 = local27[local30];
							local11[local30] = local157 < local263 ? local263 - local157 : -local263 + local157;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static307.anInt4846; local30++) {
							local263 = local21[local30];
							local157 = local27[local30];
							local11[local30] = local263 + local157 - (local263 * local157 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(27) int[][] local27 = this.method7779(0, arg0);
			@Pc(33) int[][] local33 = this.method7779(1, arg0);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			@Pc(72) int local72 = this.anInt8308;
			if (local72 == 1) {
				for (local72 = 0; local72 < Static307.anInt4846; local72++) {
					local37[local72] = local61[local72] + local49[local72];
					local41[local72] = local53[local72] + local65[local72];
					local45[local72] = local57[local72] + local69[local72];
				}
			} else if (local72 == 2) {
				for (local72 = 0; local72 < Static307.anInt4846; local72++) {
					local37[local72] = local49[local72] - local61[local72];
					local41[local72] = local53[local72] - local65[local72];
					local45[local72] = local57[local72] - local69[local72];
				}
			} else if (local72 == 3) {
				for (local72 = 0; local72 < Static307.anInt4846; local72++) {
					local37[local72] = local49[local72] * local61[local72] >> 12;
					local41[local72] = local53[local72] * local65[local72] >> 12;
					local45[local72] = local69[local72] * local57[local72] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(278) int local278;
				@Pc(274) int local274;
				if (local72 == 4) {
					for (local72 = 0; local72 < Static307.anInt4846; local72++) {
						local270 = local61[local72];
						local274 = local69[local72];
						local278 = local65[local72];
						local37[local72] = local270 == 0 ? 4096 : (local49[local72] << 12) / local270;
						local41[local72] = local278 == 0 ? 4096 : (local53[local72] << 12) / local278;
						local45[local72] = local274 == 0 ? 4096 : (local57[local72] << 12) / local274;
					}
				} else if (local72 == 5) {
					for (local72 = 0; local72 < Static307.anInt4846; local72++) {
						local37[local72] = 4096 - ((4096 - local49[local72]) * (-local61[local72] + 4096) >> 12);
						local41[local72] = 4096 - ((4096 - local53[local72]) * (-local65[local72] + 4096) >> 12);
						local45[local72] = 4096 - ((4096 - local69[local72]) * (-local57[local72] + 4096) >> 12);
					}
				} else if (local72 == 6) {
					for (local72 = 0; local72 < Static307.anInt4846; local72++) {
						local278 = local65[local72];
						local270 = local61[local72];
						local274 = local69[local72];
						local37[local72] = local270 < 2048 ? local270 * local49[local72] >> 11 : 4096 - ((4096 - local49[local72]) * (-local270 + 4096) >> 11);
						local41[local72] = local278 >= 2048 ? 4096 - ((4096 - local278) * (-local53[local72] + 4096) >> 11) : local53[local72] * local278 >> 11;
						local45[local72] = local274 < 2048 ? local274 * local57[local72] >> 11 : 4096 - ((4096 - local57[local72]) * (-local274 + 4096) >> 11);
					}
				} else {
					@Pc(532) int local532;
					@Pc(528) int local528;
					@Pc(536) int local536;
					if (local72 == 7) {
						for (local72 = 0; local72 < Static307.anInt4846; local72++) {
							local528 = local53[local72];
							local532 = local49[local72];
							local536 = local57[local72];
							local37[local72] = local532 == 4096 ? 4096 : (local61[local72] << 12) / (4096 - local532);
							local41[local72] = local528 == 4096 ? 4096 : (local65[local72] << 12) / (4096 - local528);
							local45[local72] = local536 == 4096 ? 4096 : (local69[local72] << 12) / (4096 - local536);
						}
					} else if (local72 == 8) {
						for (local72 = 0; local72 < Static307.anInt4846; local72++) {
							local528 = local53[local72];
							local532 = local49[local72];
							local536 = local57[local72];
							local37[local72] = local532 == 0 ? 0 : 4096 - (4096 - local61[local72] << 12) / local532;
							local41[local72] = local528 == 0 ? 0 : 4096 - (4096 - local65[local72] << 12) / local528;
							local45[local72] = local536 == 0 ? 0 : 4096 - (4096 - local69[local72] << 12) / local536;
						}
					} else if (local72 == 9) {
						for (local72 = 0; local72 < Static307.anInt4846; local72++) {
							local274 = local69[local72];
							local532 = local49[local72];
							local270 = local61[local72];
							local528 = local53[local72];
							local278 = local65[local72];
							local536 = local57[local72];
							local37[local72] = local270 <= local532 ? local270 : local532;
							local41[local72] = local278 > local528 ? local528 : local278;
							local45[local72] = local274 > local536 ? local536 : local274;
						}
					} else if (local72 == 10) {
						for (local72 = 0; local72 < Static307.anInt4846; local72++) {
							local274 = local69[local72];
							local270 = local61[local72];
							local536 = local57[local72];
							local278 = local65[local72];
							local532 = local49[local72];
							local528 = local53[local72];
							local37[local72] = local270 < local532 ? local532 : local270;
							local41[local72] = local528 <= local278 ? local278 : local528;
							local45[local72] = local274 < local536 ? local536 : local274;
						}
					} else if (local72 == 11) {
						for (local72 = 0; local72 < Static307.anInt4846; local72++) {
							local532 = local49[local72];
							local270 = local61[local72];
							local536 = local57[local72];
							local274 = local69[local72];
							local278 = local65[local72];
							local528 = local53[local72];
							local37[local72] = local270 < local532 ? local532 - local270 : -local532 + local270;
							local41[local72] = local278 < local528 ? local528 - local278 : -local528 + local278;
							local45[local72] = local274 >= local536 ? local274 - local536 : -local274 + local536;
						}
					} else if (local72 == 12) {
						for (local72 = 0; local72 < Static307.anInt4846; local72++) {
							local278 = local65[local72];
							local274 = local69[local72];
							local532 = local49[local72];
							local536 = local57[local72];
							local528 = local53[local72];
							local270 = local61[local72];
							local37[local72] = local532 + local270 - (local532 * local270 >> 11);
							local41[local72] = local528 + local278 - (local528 * local278 >> 11);
							local45[local72] = local536 + local274 - (local536 * local274 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}
}
