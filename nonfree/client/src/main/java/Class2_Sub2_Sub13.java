import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!eu", name = "Q", descriptor = "I")
	private int anInt1679 = 6;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub13() {
		super(2, false);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(26) int[] local26 = this.method6266(0, arg0);
			@Pc(32) int[] local32 = this.method6266(1, arg0);
			@Pc(35) int local35 = this.anInt1679;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static398.anInt6955; local35++) {
					local11[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static398.anInt6955; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static398.anInt6955; local35++) {
					local11[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(159) int local159;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static398.anInt6955; local35++) {
						local159 = local32[local35];
						local11[local35] = local159 == 0 ? 4096 : (local26[local35] << 12) / local159;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static398.anInt6955; local35++) {
						local11[local35] = 4096 - ((4096 - local32[local35]) * (4096 - local26[local35]) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static398.anInt6955; local35++) {
						local159 = local32[local35];
						local11[local35] = local159 < 2048 ? local26[local35] * local159 >> 11 : 4096 - ((4096 - local26[local35]) * (-local159 + 4096) >> 11);
					}
				} else {
					@Pc(266) int local266;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static398.anInt6955; local35++) {
							local266 = local26[local35];
							local11[local35] = local266 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local266);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static398.anInt6955; local35++) {
							local266 = local26[local35];
							local11[local35] = local266 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local266;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static398.anInt6955; local35++) {
							local266 = local26[local35];
							local159 = local32[local35];
							local11[local35] = local266 >= local159 ? local159 : local266;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static398.anInt6955; local35++) {
							local159 = local32[local35];
							local266 = local26[local35];
							local11[local35] = local159 < local266 ? local266 : local159;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static398.anInt6955; local35++) {
							local159 = local32[local35];
							local266 = local26[local35];
							local11[local35] = local266 > local159 ? local266 - local159 : local159 + -local266;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static398.anInt6955; local35++) {
							local159 = local32[local35];
							local266 = local26[local35];
							local11[local35] = local159 + local266 - (local159 * local266 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1679 = arg0.method6138();
		} else if (arg1 == 1) {
			super.aBoolean518 = arg0.method6138() == 1;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(29) int[][] local29 = this.method6276(0, arg0);
			@Pc(37) int[][] local37 = this.method6276(1, arg0);
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local19[1];
			@Pc(49) int[] local49 = local19[2];
			@Pc(53) int[] local53 = local29[0];
			@Pc(57) int[] local57 = local29[1];
			@Pc(61) int[] local61 = local29[2];
			@Pc(65) int[] local65 = local37[0];
			@Pc(69) int[] local69 = local37[1];
			@Pc(73) int[] local73 = local37[2];
			@Pc(76) int local76 = this.anInt1679;
			if (local76 == 1) {
				for (local76 = 0; local76 < Static398.anInt6955; local76++) {
					local41[local76] = local65[local76] + local53[local76];
					local45[local76] = local69[local76] + local57[local76];
					local49[local76] = local73[local76] + local61[local76];
				}
			} else if (local76 == 2) {
				for (local76 = 0; local76 < Static398.anInt6955; local76++) {
					local41[local76] = local53[local76] - local65[local76];
					local45[local76] = local57[local76] - local69[local76];
					local49[local76] = local61[local76] - local73[local76];
				}
			} else if (local76 == 3) {
				for (local76 = 0; local76 < Static398.anInt6955; local76++) {
					local41[local76] = local65[local76] * local53[local76] >> 12;
					local45[local76] = local69[local76] * local57[local76] >> 12;
					local49[local76] = local73[local76] * local61[local76] >> 12;
				}
			} else {
				@Pc(265) int local265;
				@Pc(273) int local273;
				@Pc(269) int local269;
				if (local76 == 4) {
					for (local76 = 0; local76 < Static398.anInt6955; local76++) {
						local265 = local65[local76];
						local269 = local73[local76];
						local273 = local69[local76];
						local41[local76] = local265 == 0 ? 4096 : (local53[local76] << 12) / local265;
						local45[local76] = local273 == 0 ? 4096 : (local57[local76] << 12) / local273;
						local49[local76] = local269 == 0 ? 4096 : (local61[local76] << 12) / local269;
					}
				} else if (local76 == 5) {
					for (local76 = 0; local76 < Static398.anInt6955; local76++) {
						local41[local76] = 4096 - ((4096 - local65[local76]) * (4096 - local53[local76]) >> 12);
						local45[local76] = 4096 - ((4096 - local57[local76]) * (-local69[local76] + 4096) >> 12);
						local49[local76] = 4096 - ((4096 - local61[local76]) * (-local73[local76] + 4096) >> 12);
					}
				} else if (local76 == 6) {
					for (local76 = 0; local76 < Static398.anInt6955; local76++) {
						local269 = local73[local76];
						local265 = local65[local76];
						local273 = local69[local76];
						local41[local76] = local265 >= 2048 ? 4096 - ((4096 - local265) * (-local53[local76] + 4096) >> 11) : local265 * local53[local76] >> 11;
						local45[local76] = local273 < 2048 ? local273 * local57[local76] >> 11 : 4096 - ((4096 - local57[local76]) * (-local273 + 4096) >> 11);
						local49[local76] = local269 >= 2048 ? 4096 - ((4096 - local61[local76]) * (4096 - local269) >> 11) : local269 * local61[local76] >> 11;
					}
				} else {
					@Pc(518) int local518;
					@Pc(514) int local514;
					@Pc(522) int local522;
					if (local76 == 7) {
						for (local76 = 0; local76 < Static398.anInt6955; local76++) {
							local514 = local57[local76];
							local518 = local53[local76];
							local522 = local61[local76];
							local41[local76] = local518 == 4096 ? 4096 : (local65[local76] << 12) / (4096 - local518);
							local45[local76] = local514 == 4096 ? 4096 : (local69[local76] << 12) / (4096 - local514);
							local49[local76] = local522 == 4096 ? 4096 : (local73[local76] << 12) / (4096 - local522);
						}
					} else if (local76 == 8) {
						for (local76 = 0; local76 < Static398.anInt6955; local76++) {
							local514 = local57[local76];
							local522 = local61[local76];
							local518 = local53[local76];
							local41[local76] = local518 == 0 ? 0 : 4096 - (4096 - local65[local76] << 12) / local518;
							local45[local76] = local514 == 0 ? 0 : 4096 - (4096 - local69[local76] << 12) / local514;
							local49[local76] = local522 == 0 ? 0 : 4096 - (4096 - local73[local76] << 12) / local522;
						}
					} else if (local76 == 9) {
						for (local76 = 0; local76 < Static398.anInt6955; local76++) {
							local265 = local65[local76];
							local518 = local53[local76];
							local273 = local69[local76];
							local269 = local73[local76];
							local522 = local61[local76];
							local514 = local57[local76];
							local41[local76] = local518 < local265 ? local518 : local265;
							local45[local76] = local514 < local273 ? local514 : local273;
							local49[local76] = local522 >= local269 ? local269 : local522;
						}
					} else if (local76 == 10) {
						for (local76 = 0; local76 < Static398.anInt6955; local76++) {
							local522 = local61[local76];
							local265 = local65[local76];
							local518 = local53[local76];
							local269 = local73[local76];
							local273 = local69[local76];
							local514 = local57[local76];
							local41[local76] = local518 <= local265 ? local265 : local518;
							local45[local76] = local514 <= local273 ? local273 : local514;
							local49[local76] = local522 <= local269 ? local269 : local522;
						}
					} else if (local76 == 11) {
						for (local76 = 0; local76 < Static398.anInt6955; local76++) {
							local269 = local73[local76];
							local265 = local65[local76];
							local273 = local69[local76];
							local518 = local53[local76];
							local514 = local57[local76];
							local522 = local61[local76];
							local41[local76] = local265 >= local518 ? local265 - local518 : -local265 + local518;
							local45[local76] = local514 <= local273 ? local273 - local514 : local514 + -local273;
							local49[local76] = local522 <= local269 ? local269 - local522 : local522 + -local269;
						}
					} else if (local76 == 12) {
						for (local76 = 0; local76 < Static398.anInt6955; local76++) {
							local522 = local61[local76];
							local518 = local53[local76];
							local265 = local65[local76];
							local514 = local57[local76];
							local273 = local69[local76];
							local269 = local73[local76];
							local41[local76] = local265 + local518 - (local518 * local265 >> 11);
							local45[local76] = local514 + local273 - (local514 * local273 >> 11);
							local49[local76] = local269 + local522 - (local269 * local522 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
