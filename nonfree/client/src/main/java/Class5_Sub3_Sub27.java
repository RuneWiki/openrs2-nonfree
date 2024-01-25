import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class5_Sub3_Sub27 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
	private int anInt8264 = 6;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub27() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(31) int[] local31 = this.method9205(arg0, 0);
			@Pc(37) int[] local37 = this.method9205(arg0, 1);
			@Pc(40) int local40 = this.anInt8264;
			if (local40 == 1) {
				for (local40 = 0; local40 < Static7.anInt102; local40++) {
					local11[local40] = local31[local40] + local37[local40];
				}
			} else if (local40 == 2) {
				for (local40 = 0; local40 < Static7.anInt102; local40++) {
					local11[local40] = local31[local40] - local37[local40];
				}
			} else if (local40 == 3) {
				for (local40 = 0; local40 < Static7.anInt102; local40++) {
					local11[local40] = local37[local40] * local31[local40] >> 12;
				}
			} else {
				@Pc(205) int local205;
				if (local40 == 4) {
					for (local40 = 0; local40 < Static7.anInt102; local40++) {
						local205 = local37[local40];
						local11[local40] = local205 == 0 ? 4096 : (local31[local40] << 12) / local205;
					}
				} else if (local40 == 5) {
					for (local40 = 0; local40 < Static7.anInt102; local40++) {
						local11[local40] = 4096 - ((4096 - local37[local40]) * (-local31[local40] + 4096) >> 12);
					}
				} else if (local40 == 6) {
					for (local40 = 0; local40 < Static7.anInt102; local40++) {
						local205 = local37[local40];
						local11[local40] = local205 >= 2048 ? 4096 - ((4096 - local205) * (-local31[local40] + 4096) >> 11) : local205 * local31[local40] >> 11;
					}
				} else {
					@Pc(325) int local325;
					if (local40 == 7) {
						for (local40 = 0; local40 < Static7.anInt102; local40++) {
							local325 = local31[local40];
							local11[local40] = local325 == 4096 ? 4096 : (local37[local40] << 12) / (4096 - local325);
						}
					} else if (local40 == 8) {
						for (local40 = 0; local40 < Static7.anInt102; local40++) {
							local325 = local31[local40];
							local11[local40] = local325 == 0 ? 0 : 4096 - (4096 - local37[local40] << 12) / local325;
						}
					} else if (local40 == 9) {
						for (local40 = 0; local40 < Static7.anInt102; local40++) {
							local325 = local31[local40];
							local205 = local37[local40];
							local11[local40] = local205 <= local325 ? local205 : local325;
						}
					} else if (local40 == 10) {
						for (local40 = 0; local40 < Static7.anInt102; local40++) {
							local205 = local37[local40];
							local325 = local31[local40];
							local11[local40] = local205 < local325 ? local325 : local205;
						}
					} else if (local40 == 11) {
						for (local40 = 0; local40 < Static7.anInt102; local40++) {
							local205 = local37[local40];
							local325 = local31[local40];
							local11[local40] = local325 <= local205 ? local205 - local325 : local325 - local205;
						}
					} else if (local40 == 12) {
						for (local40 = 0; local40 < Static7.anInt102; local40++) {
							local325 = local31[local40];
							local205 = local37[local40];
							local11[local40] = local325 + local205 - (local205 * local325 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8264 = arg0.method7291();
		} else if (arg1 == 1) {
			super.aBoolean769 = arg0.method7291() == 1;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(31) int[][] local31 = this.method9207(arg0, 0);
			@Pc(37) int[][] local37 = this.method9207(arg0, 1);
			@Pc(41) int[] local41 = local21[0];
			@Pc(45) int[] local45 = local21[1];
			@Pc(49) int[] local49 = local21[2];
			@Pc(53) int[] local53 = local31[0];
			@Pc(57) int[] local57 = local31[1];
			@Pc(61) int[] local61 = local31[2];
			@Pc(65) int[] local65 = local37[0];
			@Pc(69) int[] local69 = local37[1];
			@Pc(73) int[] local73 = local37[2];
			@Pc(76) int local76 = this.anInt8264;
			if (local76 == 1) {
				for (local76 = 0; local76 < Static7.anInt102; local76++) {
					local41[local76] = local65[local76] + local53[local76];
					local45[local76] = local69[local76] + local57[local76];
					local49[local76] = local61[local76] + local73[local76];
				}
			} else if (local76 == 2) {
				for (local76 = 0; local76 < Static7.anInt102; local76++) {
					local41[local76] = local53[local76] - local65[local76];
					local45[local76] = local57[local76] - local69[local76];
					local49[local76] = local61[local76] - local73[local76];
				}
			} else if (local76 == 3) {
				for (local76 = 0; local76 < Static7.anInt102; local76++) {
					local41[local76] = local53[local76] * local65[local76] >> 12;
					local45[local76] = local69[local76] * local57[local76] >> 12;
					local49[local76] = local61[local76] * local73[local76] >> 12;
				}
			} else {
				@Pc(310) int local310;
				@Pc(306) int local306;
				@Pc(302) int local302;
				if (local76 == 4) {
					for (local76 = 0; local76 < Static7.anInt102; local76++) {
						local302 = local73[local76];
						local306 = local69[local76];
						local310 = local65[local76];
						local41[local76] = local310 == 0 ? 4096 : (local53[local76] << 12) / local310;
						local45[local76] = local306 == 0 ? 4096 : (local57[local76] << 12) / local306;
						local49[local76] = local302 == 0 ? 4096 : (local61[local76] << 12) / local302;
					}
				} else if (local76 == 5) {
					for (local76 = 0; local76 < Static7.anInt102; local76++) {
						local41[local76] = 4096 - ((4096 - local53[local76]) * (-local65[local76] + 4096) >> 12);
						local45[local76] = 4096 - ((4096 - local69[local76]) * (4096 - local57[local76]) >> 12);
						local49[local76] = 4096 - ((4096 - local73[local76]) * (-local61[local76] + 4096) >> 12);
					}
				} else if (local76 == 6) {
					for (local76 = 0; local76 < Static7.anInt102; local76++) {
						local302 = local73[local76];
						local306 = local69[local76];
						local310 = local65[local76];
						local41[local76] = local310 >= 2048 ? 4096 - ((4096 - local53[local76]) * (-local310 + 4096) >> 11) : local53[local76] * local310 >> 11;
						local45[local76] = local306 >= 2048 ? 4096 - ((4096 - local57[local76]) * (4096 - local306) >> 11) : local57[local76] * local306 >> 11;
						local49[local76] = local302 >= 2048 ? 4096 - ((4096 - local61[local76]) * (-local302 + 4096) >> 11) : local61[local76] * local302 >> 11;
					}
				} else {
					@Pc(589) int local589;
					@Pc(581) int local581;
					@Pc(585) int local585;
					if (local76 == 7) {
						for (local76 = 0; local76 < Static7.anInt102; local76++) {
							local581 = local57[local76];
							local585 = local61[local76];
							local589 = local53[local76];
							local41[local76] = local589 == 4096 ? 4096 : (local65[local76] << 12) / (4096 - local589);
							local45[local76] = local581 == 4096 ? 4096 : (local69[local76] << 12) / (4096 - local581);
							local49[local76] = local585 == 4096 ? 4096 : (local73[local76] << 12) / (4096 - local585);
						}
					} else if (local76 == 8) {
						for (local76 = 0; local76 < Static7.anInt102; local76++) {
							local585 = local61[local76];
							local589 = local53[local76];
							local581 = local57[local76];
							local41[local76] = local589 == 0 ? 0 : 4096 - (4096 - local65[local76] << 12) / local589;
							local45[local76] = local581 == 0 ? 0 : 4096 - (4096 - local69[local76] << 12) / local581;
							local49[local76] = local585 == 0 ? 0 : 4096 - (4096 - local73[local76] << 12) / local585;
						}
					} else if (local76 == 9) {
						for (local76 = 0; local76 < Static7.anInt102; local76++) {
							local585 = local61[local76];
							local302 = local73[local76];
							local589 = local53[local76];
							local310 = local65[local76];
							local306 = local69[local76];
							local581 = local57[local76];
							local41[local76] = local310 > local589 ? local589 : local310;
							local45[local76] = local306 > local581 ? local581 : local306;
							local49[local76] = local302 > local585 ? local585 : local302;
						}
					} else if (local76 == 10) {
						for (local76 = 0; local76 < Static7.anInt102; local76++) {
							local585 = local61[local76];
							local589 = local53[local76];
							local306 = local69[local76];
							local310 = local65[local76];
							local581 = local57[local76];
							local302 = local73[local76];
							local41[local76] = local310 < local589 ? local589 : local310;
							local45[local76] = local306 >= local581 ? local306 : local581;
							local49[local76] = local302 < local585 ? local585 : local302;
						}
					} else if (local76 == 11) {
						for (local76 = 0; local76 < Static7.anInt102; local76++) {
							local581 = local57[local76];
							local310 = local65[local76];
							local306 = local69[local76];
							local302 = local73[local76];
							local585 = local61[local76];
							local589 = local53[local76];
							local41[local76] = local589 <= local310 ? local310 - local589 : local589 + -local310;
							local45[local76] = local581 > local306 ? local581 - local306 : -local581 + local306;
							local49[local76] = local302 >= local585 ? local302 - local585 : local585 + -local302;
						}
					} else if (local76 == 12) {
						for (local76 = 0; local76 < Static7.anInt102; local76++) {
							local310 = local65[local76];
							local585 = local61[local76];
							local589 = local53[local76];
							local581 = local57[local76];
							local306 = local69[local76];
							local302 = local73[local76];
							local41[local76] = local310 + local589 - (local589 * local310 >> 11);
							local45[local76] = local306 + local581 - (local581 * local306 >> 11);
							local49[local76] = local585 + local302 - (local585 * local302 >> 11);
						}
					}
				}
			}
		}
		return local21;
	}
}
