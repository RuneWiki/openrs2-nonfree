import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class2_Sub6_Sub20 extends Class2_Sub6 {

	@OriginalMember(owner = "client!oba", name = "J", descriptor = "I")
	private int anInt6213 = 6;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub20() {
		super(2, false);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt6213 = arg1.method8547();
		} else if (arg0 == 1) {
			super.aBoolean743 = arg1.method8547() == 1;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(26) int[] local26 = this.method8461(0, arg0);
			@Pc(32) int[] local32 = this.method8461(1, arg0);
			@Pc(35) int local35 = this.anInt6213;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static51.anInt1085; local35++) {
					local11[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static51.anInt1085; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static51.anInt1085; local35++) {
					local11[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(160) int local160;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static51.anInt1085; local35++) {
						local160 = local32[local35];
						local11[local35] = local160 == 0 ? 4096 : (local26[local35] << 12) / local160;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static51.anInt1085; local35++) {
						local11[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static51.anInt1085; local35++) {
						local160 = local32[local35];
						local11[local35] = local160 >= 2048 ? 4096 - ((4096 - local160) * (-local26[local35] + 4096) >> 11) : local160 * local26[local35] >> 11;
					}
				} else {
					@Pc(268) int local268;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static51.anInt1085; local35++) {
							local268 = local26[local35];
							local11[local35] = local268 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local268);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static51.anInt1085; local35++) {
							local268 = local26[local35];
							local11[local35] = local268 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local268;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static51.anInt1085; local35++) {
							local160 = local32[local35];
							local268 = local26[local35];
							local11[local35] = local268 >= local160 ? local160 : local268;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static51.anInt1085; local35++) {
							local160 = local32[local35];
							local268 = local26[local35];
							local11[local35] = local160 >= local268 ? local160 : local268;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static51.anInt1085; local35++) {
							local160 = local32[local35];
							local268 = local26[local35];
							local11[local35] = local160 >= local268 ? local160 - local268 : local268 - local160;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static51.anInt1085; local35++) {
							local268 = local26[local35];
							local160 = local32[local35];
							local11[local35] = local160 + local268 - (local268 * local160 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(27) int[][] local27 = this.method8465(0, arg0);
			@Pc(33) int[][] local33 = this.method8465(1, arg0);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			@Pc(72) int local72 = this.anInt6213;
			if (local72 == 1) {
				for (local72 = 0; local72 < Static51.anInt1085; local72++) {
					local37[local72] = local61[local72] + local49[local72];
					local41[local72] = local65[local72] + local53[local72];
					local45[local72] = local57[local72] + local69[local72];
				}
			} else if (local72 == 2) {
				for (local72 = 0; local72 < Static51.anInt1085; local72++) {
					local37[local72] = local49[local72] - local61[local72];
					local41[local72] = local53[local72] - local65[local72];
					local45[local72] = local57[local72] - local69[local72];
				}
			} else if (local72 == 3) {
				for (local72 = 0; local72 < Static51.anInt1085; local72++) {
					local37[local72] = local49[local72] * local61[local72] >> 12;
					local41[local72] = local53[local72] * local65[local72] >> 12;
					local45[local72] = local57[local72] * local69[local72] >> 12;
				}
			} else {
				@Pc(265) int local265;
				@Pc(269) int local269;
				@Pc(273) int local273;
				if (local72 == 4) {
					for (local72 = 0; local72 < Static51.anInt1085; local72++) {
						local265 = local61[local72];
						local269 = local65[local72];
						local273 = local69[local72];
						local37[local72] = local265 == 0 ? 4096 : (local49[local72] << 12) / local265;
						local41[local72] = local269 == 0 ? 4096 : (local53[local72] << 12) / local269;
						local45[local72] = local273 == 0 ? 4096 : (local57[local72] << 12) / local273;
					}
				} else if (local72 == 5) {
					for (local72 = 0; local72 < Static51.anInt1085; local72++) {
						local37[local72] = 4096 - ((4096 - local49[local72]) * (-local61[local72] + 4096) >> 12);
						local41[local72] = 4096 - ((4096 - local65[local72]) * (-local53[local72] + 4096) >> 12);
						local45[local72] = 4096 - ((4096 - local69[local72]) * (-local57[local72] + 4096) >> 12);
					}
				} else if (local72 == 6) {
					for (local72 = 0; local72 < Static51.anInt1085; local72++) {
						local273 = local69[local72];
						local265 = local61[local72];
						local269 = local65[local72];
						local37[local72] = local265 < 2048 ? local49[local72] * local265 >> 11 : 4096 - ((4096 - local265) * (4096 - local49[local72]) >> 11);
						local41[local72] = local269 >= 2048 ? 4096 - ((4096 - local269) * (4096 - local53[local72]) >> 11) : local269 * local53[local72] >> 11;
						local45[local72] = local273 >= 2048 ? 4096 - ((4096 - local57[local72]) * (-local273 + 4096) >> 11) : local273 * local57[local72] >> 11;
					}
				} else {
					@Pc(514) int local514;
					@Pc(522) int local522;
					@Pc(518) int local518;
					if (local72 == 7) {
						for (local72 = 0; local72 < Static51.anInt1085; local72++) {
							local514 = local49[local72];
							local518 = local57[local72];
							local522 = local53[local72];
							local37[local72] = local514 == 4096 ? 4096 : (local61[local72] << 12) / (4096 - local514);
							local41[local72] = local522 == 4096 ? 4096 : (local65[local72] << 12) / (4096 - local522);
							local45[local72] = local518 == 4096 ? 4096 : (local69[local72] << 12) / (4096 - local518);
						}
					} else if (local72 == 8) {
						for (local72 = 0; local72 < Static51.anInt1085; local72++) {
							local522 = local53[local72];
							local518 = local57[local72];
							local514 = local49[local72];
							local37[local72] = local514 == 0 ? 0 : 4096 - (4096 - local61[local72] << 12) / local514;
							local41[local72] = local522 == 0 ? 0 : 4096 - (4096 - local65[local72] << 12) / local522;
							local45[local72] = local518 == 0 ? 0 : 4096 - (4096 - local69[local72] << 12) / local518;
						}
					} else if (local72 == 9) {
						for (local72 = 0; local72 < Static51.anInt1085; local72++) {
							local518 = local57[local72];
							local522 = local53[local72];
							local269 = local65[local72];
							local265 = local61[local72];
							local273 = local69[local72];
							local514 = local49[local72];
							local37[local72] = local514 >= local265 ? local265 : local514;
							local41[local72] = local269 <= local522 ? local269 : local522;
							local45[local72] = local518 < local273 ? local518 : local273;
						}
					} else if (local72 == 10) {
						for (local72 = 0; local72 < Static51.anInt1085; local72++) {
							local265 = local61[local72];
							local518 = local57[local72];
							local273 = local69[local72];
							local522 = local53[local72];
							local514 = local49[local72];
							local269 = local65[local72];
							local37[local72] = local265 < local514 ? local514 : local265;
							local41[local72] = local522 > local269 ? local522 : local269;
							local45[local72] = local273 >= local518 ? local273 : local518;
						}
					} else if (local72 == 11) {
						for (local72 = 0; local72 < Static51.anInt1085; local72++) {
							local514 = local49[local72];
							local265 = local61[local72];
							local273 = local69[local72];
							local269 = local65[local72];
							local522 = local53[local72];
							local518 = local57[local72];
							local37[local72] = local265 < local514 ? local514 - local265 : -local514 + local265;
							local41[local72] = local269 >= local522 ? local269 - local522 : -local269 + local522;
							local45[local72] = local518 > local273 ? local518 - local273 : -local518 + local273;
						}
					} else if (local72 == 12) {
						for (local72 = 0; local72 < Static51.anInt1085; local72++) {
							local518 = local57[local72];
							local265 = local61[local72];
							local273 = local69[local72];
							local269 = local65[local72];
							local514 = local49[local72];
							local522 = local53[local72];
							local37[local72] = local514 + local265 - (local265 * local514 >> 11);
							local41[local72] = local522 + local269 - (local269 * local522 >> 11);
							local45[local72] = local273 + local518 - (local518 * local273 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}
}
