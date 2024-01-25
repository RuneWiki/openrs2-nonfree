import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class2_Sub7_Sub37 extends Class2_Sub7 {

	@OriginalMember(owner = "client!vba", name = "R", descriptor = "I")
	private int anInt8815 = 6;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub37() {
		super(2, false);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(23) int[][] local23 = this.method7589(0, arg0);
			@Pc(29) int[][] local29 = this.method7589(1, arg0);
			@Pc(33) int[] local33 = local13[0];
			@Pc(37) int[] local37 = local13[1];
			@Pc(41) int[] local41 = local13[2];
			@Pc(45) int[] local45 = local23[0];
			@Pc(49) int[] local49 = local23[1];
			@Pc(53) int[] local53 = local23[2];
			@Pc(57) int[] local57 = local29[0];
			@Pc(61) int[] local61 = local29[1];
			@Pc(65) int[] local65 = local29[2];
			@Pc(68) int local68 = this.anInt8815;
			if (local68 == 1) {
				for (local68 = 0; local68 < Static352.anInt6485; local68++) {
					local33[local68] = local45[local68] + local57[local68];
					local37[local68] = local49[local68] + local61[local68];
					local41[local68] = local53[local68] + local65[local68];
				}
			} else if (local68 == 2) {
				for (local68 = 0; local68 < Static352.anInt6485; local68++) {
					local33[local68] = local45[local68] - local57[local68];
					local37[local68] = local49[local68] - local61[local68];
					local41[local68] = local53[local68] - local65[local68];
				}
			} else if (local68 == 3) {
				for (local68 = 0; local68 < Static352.anInt6485; local68++) {
					local33[local68] = local57[local68] * local45[local68] >> 12;
					local37[local68] = local49[local68] * local61[local68] >> 12;
					local41[local68] = local65[local68] * local53[local68] >> 12;
				}
			} else {
				@Pc(269) int local269;
				@Pc(265) int local265;
				@Pc(261) int local261;
				if (local68 == 4) {
					for (local68 = 0; local68 < Static352.anInt6485; local68++) {
						local261 = local65[local68];
						local265 = local61[local68];
						local269 = local57[local68];
						local33[local68] = local269 == 0 ? 4096 : (local45[local68] << 12) / local269;
						local37[local68] = local265 == 0 ? 4096 : (local49[local68] << 12) / local265;
						local41[local68] = local261 == 0 ? 4096 : (local53[local68] << 12) / local261;
					}
				} else if (local68 == 5) {
					for (local68 = 0; local68 < Static352.anInt6485; local68++) {
						local33[local68] = 4096 - ((4096 - local45[local68]) * (-local57[local68] + 4096) >> 12);
						local37[local68] = 4096 - ((4096 - local49[local68]) * (4096 - local61[local68]) >> 12);
						local41[local68] = 4096 - ((4096 - local53[local68]) * (-local65[local68] + 4096) >> 12);
					}
				} else if (local68 == 6) {
					for (local68 = 0; local68 < Static352.anInt6485; local68++) {
						local265 = local61[local68];
						local261 = local65[local68];
						local269 = local57[local68];
						local33[local68] = local269 < 2048 ? local45[local68] * local269 >> 11 : 4096 - ((4096 - local269) * (-local45[local68] + 4096) >> 11);
						local37[local68] = local265 < 2048 ? local49[local68] * local265 >> 11 : 4096 - ((4096 - local49[local68]) * (-local265 + 4096) >> 11);
						local41[local68] = local261 < 2048 ? local53[local68] * local261 >> 11 : 4096 - ((4096 - local53[local68]) * (-local261 + 4096) >> 11);
					}
				} else {
					@Pc(516) int local516;
					@Pc(524) int local524;
					@Pc(520) int local520;
					if (local68 == 7) {
						for (local68 = 0; local68 < Static352.anInt6485; local68++) {
							local516 = local45[local68];
							local520 = local53[local68];
							local524 = local49[local68];
							local33[local68] = local516 == 4096 ? 4096 : (local57[local68] << 12) / (4096 - local516);
							local37[local68] = local524 == 4096 ? 4096 : (local61[local68] << 12) / (4096 - local524);
							local41[local68] = local520 == 4096 ? 4096 : (local65[local68] << 12) / (4096 - local520);
						}
					} else if (local68 == 8) {
						for (local68 = 0; local68 < Static352.anInt6485; local68++) {
							local516 = local45[local68];
							local520 = local53[local68];
							local524 = local49[local68];
							local33[local68] = local516 == 0 ? 0 : 4096 - (4096 - local57[local68] << 12) / local516;
							local37[local68] = local524 == 0 ? 0 : 4096 - (4096 - local61[local68] << 12) / local524;
							local41[local68] = local520 == 0 ? 0 : 4096 - (4096 - local65[local68] << 12) / local520;
						}
					} else if (local68 == 9) {
						for (local68 = 0; local68 < Static352.anInt6485; local68++) {
							local524 = local49[local68];
							local261 = local65[local68];
							local516 = local45[local68];
							local520 = local53[local68];
							local269 = local57[local68];
							local265 = local61[local68];
							local33[local68] = local516 >= local269 ? local269 : local516;
							local37[local68] = local265 > local524 ? local524 : local265;
							local41[local68] = local520 >= local261 ? local261 : local520;
						}
					} else if (local68 == 10) {
						for (local68 = 0; local68 < Static352.anInt6485; local68++) {
							local520 = local53[local68];
							local261 = local65[local68];
							local269 = local57[local68];
							local516 = local45[local68];
							local265 = local61[local68];
							local524 = local49[local68];
							local33[local68] = local269 >= local516 ? local269 : local516;
							local37[local68] = local524 <= local265 ? local265 : local524;
							local41[local68] = local261 < local520 ? local520 : local261;
						}
					} else if (local68 == 11) {
						for (local68 = 0; local68 < Static352.anInt6485; local68++) {
							local265 = local61[local68];
							local520 = local53[local68];
							local524 = local49[local68];
							local516 = local45[local68];
							local269 = local57[local68];
							local261 = local65[local68];
							local33[local68] = local516 <= local269 ? local269 - local516 : -local269 + local516;
							local37[local68] = local265 >= local524 ? local265 - local524 : -local265 + local524;
							local41[local68] = local520 > local261 ? local520 - local261 : local261 - local520;
						}
					} else if (local68 == 12) {
						for (local68 = 0; local68 < Static352.anInt6485; local68++) {
							local516 = local45[local68];
							local524 = local49[local68];
							local261 = local65[local68];
							local520 = local53[local68];
							local265 = local61[local68];
							local269 = local57[local68];
							local33[local68] = local516 + local269 - (local516 * local269 >> 11);
							local37[local68] = local265 + local524 - (local265 * local524 >> 11);
							local41[local68] = local520 + local261 - (local261 * local520 >> 11);
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(26) int[] local26 = this.method7581(arg0, 0);
			@Pc(32) int[] local32 = this.method7581(arg0, 1);
			@Pc(35) int local35 = this.anInt8815;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static352.anInt6485; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static352.anInt6485; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static352.anInt6485; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(165) int local165;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static352.anInt6485; local35++) {
						local165 = local32[local35];
						local16[local35] = local165 == 0 ? 4096 : (local26[local35] << 12) / local165;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static352.anInt6485; local35++) {
						local16[local35] = 4096 - ((4096 - local32[local35]) * (4096 - local26[local35]) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static352.anInt6485; local35++) {
						local165 = local32[local35];
						local16[local35] = local165 < 2048 ? local165 * local26[local35] >> 11 : 4096 - ((4096 - local26[local35]) * (4096 - local165) >> 11);
					}
				} else {
					@Pc(275) int local275;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static352.anInt6485; local35++) {
							local275 = local26[local35];
							local16[local35] = local275 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local275);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static352.anInt6485; local35++) {
							local275 = local26[local35];
							local16[local35] = local275 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local275;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static352.anInt6485; local35++) {
							local275 = local26[local35];
							local165 = local32[local35];
							local16[local35] = local165 > local275 ? local275 : local165;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static352.anInt6485; local35++) {
							local165 = local32[local35];
							local275 = local26[local35];
							local16[local35] = local275 > local165 ? local275 : local165;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static352.anInt6485; local35++) {
							local165 = local32[local35];
							local275 = local26[local35];
							local16[local35] = local275 > local165 ? local275 - local165 : local165 - local275;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static352.anInt6485; local35++) {
							local275 = local26[local35];
							local165 = local32[local35];
							local16[local35] = local165 + local275 - (local165 * local275 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt8815 = arg1.method5170();
		} else if (arg0 == 1) {
			super.aBoolean649 = arg1.method5170() == 1;
		}
	}
}
