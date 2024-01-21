import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class5_Sub1_Sub36 extends Class5_Sub1 {

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
	private int anInt3968 = 6;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub36() {
		super(2, false);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3968 = arg0.method3062();
		} else if (arg1 == 1) {
			super.aBoolean189 = arg0.method3062() == 1;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(25) int[] local25 = this.method3196(arg0, 0);
			@Pc(31) int[] local31 = this.method3196(arg0, 1);
			@Pc(34) int local34 = this.anInt3968;
			if (local34 == 1) {
				for (local34 = 0; local34 < Static174.anInt3489; local34++) {
					local11[local34] = local31[local34] + local25[local34];
				}
			} else if (local34 == 2) {
				for (local34 = 0; local34 < Static174.anInt3489; local34++) {
					local11[local34] = local25[local34] - local31[local34];
				}
			} else if (local34 == 3) {
				for (local34 = 0; local34 < Static174.anInt3489; local34++) {
					local11[local34] = local25[local34] * local31[local34] >> 12;
				}
			} else {
				@Pc(165) int local165;
				if (local34 == 4) {
					for (local34 = 0; local34 < Static174.anInt3489; local34++) {
						local165 = local31[local34];
						local11[local34] = local165 == 0 ? 4096 : (local25[local34] << 12) / local165;
					}
				} else if (local34 == 5) {
					for (local34 = 0; local34 < Static174.anInt3489; local34++) {
						local11[local34] = 4096 - ((4096 - local25[local34]) * (-local31[local34] + 4096) >> 12);
					}
				} else if (local34 == 6) {
					for (local34 = 0; local34 < Static174.anInt3489; local34++) {
						local165 = local31[local34];
						local11[local34] = local165 < 2048 ? local25[local34] * local165 >> 11 : 4096 - ((4096 - local25[local34]) * (-local165 + 4096) >> 11);
					}
				} else {
					@Pc(279) int local279;
					if (local34 == 7) {
						for (local34 = 0; local34 < Static174.anInt3489; local34++) {
							local279 = local25[local34];
							local11[local34] = local279 == 4096 ? 4096 : (local31[local34] << 12) / (4096 - local279);
						}
					} else if (local34 == 8) {
						for (local34 = 0; local34 < Static174.anInt3489; local34++) {
							local279 = local25[local34];
							local11[local34] = local279 == 0 ? 0 : 4096 - (4096 - local31[local34] << 12) / local279;
						}
					} else if (local34 == 9) {
						for (local34 = 0; local34 < Static174.anInt3489; local34++) {
							local165 = local31[local34];
							local279 = local25[local34];
							local11[local34] = local165 > local279 ? local279 : local165;
						}
					} else if (local34 == 10) {
						for (local34 = 0; local34 < Static174.anInt3489; local34++) {
							local279 = local25[local34];
							local165 = local31[local34];
							local11[local34] = local279 <= local165 ? local165 : local279;
						}
					} else if (local34 == 11) {
						for (local34 = 0; local34 < Static174.anInt3489; local34++) {
							local165 = local31[local34];
							local279 = local25[local34];
							local11[local34] = local165 < local279 ? local279 - local165 : -local279 + local165;
						}
					} else if (local34 == 12) {
						for (local34 = 0; local34 < Static174.anInt3489; local34++) {
							local279 = local25[local34];
							local165 = local31[local34];
							local11[local34] = local165 + local279 - (local165 * local279 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(9) int[][] local9 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(31) int[][] local31 = this.method3191(0, arg0);
			@Pc(37) int[][] local37 = this.method3191(1, arg0);
			@Pc(41) int[] local41 = local9[0];
			@Pc(45) int[] local45 = local9[2];
			@Pc(49) int[] local49 = local31[0];
			@Pc(53) int[] local53 = local37[0];
			@Pc(57) int[] local57 = local37[1];
			@Pc(61) int[] local61 = local9[1];
			@Pc(65) int[] local65 = local31[2];
			@Pc(69) int[] local69 = local37[2];
			@Pc(73) int[] local73 = local31[1];
			@Pc(76) int local76 = this.anInt3968;
			if (local76 == 1) {
				for (local76 = 0; local76 < Static174.anInt3489; local76++) {
					local41[local76] = local49[local76] + local53[local76];
					local61[local76] = local57[local76] + local73[local76];
					local45[local76] = local65[local76] + local69[local76];
				}
			} else if (local76 == 2) {
				for (local76 = 0; local76 < Static174.anInt3489; local76++) {
					local41[local76] = local49[local76] - local53[local76];
					local61[local76] = local73[local76] - local57[local76];
					local45[local76] = local65[local76] - local69[local76];
				}
			} else if (local76 == 3) {
				for (local76 = 0; local76 < Static174.anInt3489; local76++) {
					local41[local76] = local49[local76] * local53[local76] >> 12;
					local61[local76] = local57[local76] * local73[local76] >> 12;
					local45[local76] = local65[local76] * local69[local76] >> 12;
				}
			} else {
				@Pc(284) int local284;
				@Pc(280) int local280;
				@Pc(276) int local276;
				if (local76 == 4) {
					for (local76 = 0; local76 < Static174.anInt3489; local76++) {
						local276 = local69[local76];
						local280 = local57[local76];
						local284 = local53[local76];
						local41[local76] = local284 == 0 ? 4096 : (local49[local76] << 12) / local284;
						local61[local76] = local280 == 0 ? 4096 : (local73[local76] << 12) / local280;
						local45[local76] = local276 == 0 ? 4096 : (local65[local76] << 12) / local276;
					}
				} else if (local76 == 5) {
					for (local76 = 0; local76 < Static174.anInt3489; local76++) {
						local41[local76] = 4096 - ((4096 - local53[local76]) * (-local49[local76] + 4096) >> 12);
						local61[local76] = 4096 - ((4096 - local57[local76]) * (-local73[local76] + 4096) >> 12);
						local45[local76] = 4096 - ((4096 - local65[local76]) * (4096 - local69[local76]) >> 12);
					}
				} else if (local76 == 6) {
					for (local76 = 0; local76 < Static174.anInt3489; local76++) {
						local284 = local53[local76];
						local276 = local69[local76];
						local280 = local57[local76];
						local41[local76] = local284 < 2048 ? local49[local76] * local284 >> 11 : 4096 - ((4096 - local49[local76]) * (-local284 + 4096) >> 11);
						local61[local76] = local280 >= 2048 ? 4096 - ((4096 - local73[local76]) * (4096 - local280) >> 11) : local73[local76] * local280 >> 11;
						local45[local76] = local276 < 2048 ? local276 * local65[local76] >> 11 : 4096 - ((4096 - local65[local76]) * (-local276 + 4096) >> 11);
					}
				} else {
					@Pc(543) int local543;
					@Pc(547) int local547;
					@Pc(539) int local539;
					if (local76 == 7) {
						for (local76 = 0; local76 < Static174.anInt3489; local76++) {
							local539 = local65[local76];
							local543 = local49[local76];
							local547 = local73[local76];
							local41[local76] = local543 == 4096 ? 4096 : (local53[local76] << 12) / (4096 - local543);
							local61[local76] = local547 == 4096 ? 4096 : (local57[local76] << 12) / (4096 - local547);
							local45[local76] = local539 == 4096 ? 4096 : (local69[local76] << 12) / (4096 - local539);
						}
					} else if (local76 == 8) {
						for (local76 = 0; local76 < Static174.anInt3489; local76++) {
							local543 = local49[local76];
							local539 = local65[local76];
							local547 = local73[local76];
							local41[local76] = local543 == 0 ? 0 : 4096 - (4096 - local53[local76] << 12) / local543;
							local61[local76] = local547 == 0 ? 0 : 4096 - (4096 - local57[local76] << 12) / local547;
							local45[local76] = local539 == 0 ? 0 : 4096 - (4096 - local69[local76] << 12) / local539;
						}
					} else if (local76 == 9) {
						for (local76 = 0; local76 < Static174.anInt3489; local76++) {
							local539 = local65[local76];
							local280 = local57[local76];
							local547 = local73[local76];
							local276 = local69[local76];
							local543 = local49[local76];
							local284 = local53[local76];
							local41[local76] = local543 < local284 ? local543 : local284;
							local61[local76] = local547 < local280 ? local547 : local280;
							local45[local76] = local276 <= local539 ? local276 : local539;
						}
					} else if (local76 == 10) {
						for (local76 = 0; local76 < Static174.anInt3489; local76++) {
							local547 = local73[local76];
							local284 = local53[local76];
							local539 = local65[local76];
							local280 = local57[local76];
							local276 = local69[local76];
							local543 = local49[local76];
							local41[local76] = local284 < local543 ? local543 : local284;
							local61[local76] = local280 >= local547 ? local280 : local547;
							local45[local76] = local276 >= local539 ? local276 : local539;
						}
					} else if (local76 == 11) {
						for (local76 = 0; local76 < Static174.anInt3489; local76++) {
							local539 = local65[local76];
							local547 = local73[local76];
							local280 = local57[local76];
							local276 = local69[local76];
							local543 = local49[local76];
							local284 = local53[local76];
							local41[local76] = local543 <= local284 ? local284 - local543 : local543 - local284;
							local61[local76] = local547 <= local280 ? local280 - local547 : -local280 + local547;
							local45[local76] = local276 < local539 ? local539 - local276 : -local539 + local276;
						}
					} else if (local76 == 12) {
						for (local76 = 0; local76 < Static174.anInt3489; local76++) {
							local543 = local49[local76];
							local280 = local57[local76];
							local539 = local65[local76];
							local547 = local73[local76];
							local284 = local53[local76];
							local276 = local69[local76];
							local41[local76] = local543 + local284 - (local284 * local543 >> 11);
							local61[local76] = local547 + local280 - (local280 * local547 >> 11);
							local45[local76] = local276 + local539 - (local276 * local539 >> 11);
						}
					}
				}
			}
		}
		return local9;
	}
}
