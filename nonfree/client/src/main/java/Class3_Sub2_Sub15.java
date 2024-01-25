import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
	private int anInt4914 = 6;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub15() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(31) int[][] local31 = this.method9212(0, arg0);
			@Pc(37) int[][] local37 = this.method9212(1, arg0);
			@Pc(41) int[] local41 = local21[0];
			@Pc(45) int[] local45 = local21[1];
			@Pc(49) int[] local49 = local21[2];
			@Pc(53) int[] local53 = local31[0];
			@Pc(57) int[] local57 = local31[1];
			@Pc(61) int[] local61 = local31[2];
			@Pc(65) int[] local65 = local37[0];
			@Pc(69) int[] local69 = local37[1];
			@Pc(73) int[] local73 = local37[2];
			@Pc(76) int local76 = this.anInt4914;
			if (local76 == 1) {
				for (local76 = 0; local76 < Static636.anInt10302; local76++) {
					local41[local76] = local65[local76] + local53[local76];
					local45[local76] = local69[local76] + local57[local76];
					local49[local76] = local73[local76] + local61[local76];
				}
			} else if (local76 == 2) {
				for (local76 = 0; local76 < Static636.anInt10302; local76++) {
					local41[local76] = local53[local76] - local65[local76];
					local45[local76] = local57[local76] - local69[local76];
					local49[local76] = local61[local76] - local73[local76];
				}
			} else if (local76 == 3) {
				for (local76 = 0; local76 < Static636.anInt10302; local76++) {
					local41[local76] = local65[local76] * local53[local76] >> 12;
					local45[local76] = local69[local76] * local57[local76] >> 12;
					local49[local76] = local61[local76] * local73[local76] >> 12;
				}
			} else {
				@Pc(307) int local307;
				@Pc(315) int local315;
				@Pc(311) int local311;
				if (local76 == 4) {
					for (local76 = 0; local76 < Static636.anInt10302; local76++) {
						local307 = local65[local76];
						local311 = local73[local76];
						local315 = local69[local76];
						local41[local76] = local307 == 0 ? 4096 : (local53[local76] << 12) / local307;
						local45[local76] = local315 == 0 ? 4096 : (local57[local76] << 12) / local315;
						local49[local76] = local311 == 0 ? 4096 : (local61[local76] << 12) / local311;
					}
				} else if (local76 == 5) {
					for (local76 = 0; local76 < Static636.anInt10302; local76++) {
						local41[local76] = 4096 - ((4096 - local53[local76]) * (-local65[local76] + 4096) >> 12);
						local45[local76] = 4096 - ((4096 - local69[local76]) * (-local57[local76] + 4096) >> 12);
						local49[local76] = 4096 - ((4096 - local61[local76]) * (4096 - local73[local76]) >> 12);
					}
				} else if (local76 == 6) {
					for (local76 = 0; local76 < Static636.anInt10302; local76++) {
						local311 = local73[local76];
						local307 = local65[local76];
						local315 = local69[local76];
						local41[local76] = local307 < 2048 ? local53[local76] * local307 >> 11 : 4096 - ((4096 - local53[local76]) * (-local307 + 4096) >> 11);
						local45[local76] = local315 < 2048 ? local57[local76] * local315 >> 11 : 4096 - ((4096 - local315) * (-local57[local76] + 4096) >> 11);
						local49[local76] = local311 < 2048 ? local311 * local61[local76] >> 11 : 4096 - ((4096 - local311) * (-local61[local76] + 4096) >> 11);
					}
				} else {
					@Pc(584) int local584;
					@Pc(592) int local592;
					@Pc(588) int local588;
					if (local76 == 7) {
						for (local76 = 0; local76 < Static636.anInt10302; local76++) {
							local584 = local53[local76];
							local588 = local61[local76];
							local592 = local57[local76];
							local41[local76] = local584 == 4096 ? 4096 : (local65[local76] << 12) / (4096 - local584);
							local45[local76] = local592 == 4096 ? 4096 : (local69[local76] << 12) / (4096 - local592);
							local49[local76] = local588 == 4096 ? 4096 : (local73[local76] << 12) / (4096 - local588);
						}
					} else if (local76 == 8) {
						for (local76 = 0; local76 < Static636.anInt10302; local76++) {
							local588 = local61[local76];
							local592 = local57[local76];
							local584 = local53[local76];
							local41[local76] = local584 == 0 ? 0 : 4096 - (4096 - local65[local76] << 12) / local584;
							local45[local76] = local592 == 0 ? 0 : 4096 - (4096 - local69[local76] << 12) / local592;
							local49[local76] = local588 == 0 ? 0 : 4096 - (4096 - local73[local76] << 12) / local588;
						}
					} else if (local76 == 9) {
						for (local76 = 0; local76 < Static636.anInt10302; local76++) {
							local311 = local73[local76];
							local592 = local57[local76];
							local307 = local65[local76];
							local588 = local61[local76];
							local584 = local53[local76];
							local315 = local69[local76];
							local41[local76] = local584 < local307 ? local584 : local307;
							local45[local76] = local315 <= local592 ? local315 : local592;
							local49[local76] = local311 <= local588 ? local311 : local588;
						}
					} else if (local76 == 10) {
						for (local76 = 0; local76 < Static636.anInt10302; local76++) {
							local307 = local65[local76];
							local588 = local61[local76];
							local584 = local53[local76];
							local592 = local57[local76];
							local311 = local73[local76];
							local315 = local69[local76];
							local41[local76] = local307 < local584 ? local584 : local307;
							local45[local76] = local592 > local315 ? local592 : local315;
							local49[local76] = local311 < local588 ? local588 : local311;
						}
					} else if (local76 == 11) {
						for (local76 = 0; local76 < Static636.anInt10302; local76++) {
							local315 = local69[local76];
							local311 = local73[local76];
							local592 = local57[local76];
							local307 = local65[local76];
							local584 = local53[local76];
							local588 = local61[local76];
							local41[local76] = local584 > local307 ? local584 - local307 : -local584 + local307;
							local45[local76] = local592 <= local315 ? local315 - local592 : -local315 + local592;
							local49[local76] = local311 < local588 ? local588 - local311 : local311 + -local588;
						}
					} else if (local76 == 12) {
						for (local76 = 0; local76 < Static636.anInt10302; local76++) {
							local311 = local73[local76];
							local592 = local57[local76];
							local307 = local65[local76];
							local588 = local61[local76];
							local315 = local69[local76];
							local584 = local53[local76];
							local41[local76] = local584 + local307 - (local584 * local307 >> 11);
							local45[local76] = local315 + local592 - (local315 * local592 >> 11);
							local49[local76] = local588 + local311 - (local588 * local311 >> 11);
						}
					}
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(28) int[] local28 = this.method9204(arg0, 0);
			@Pc(34) int[] local34 = this.method9204(arg0, 1);
			@Pc(37) int local37 = this.anInt4914;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static636.anInt10302; local37++) {
					local18[local37] = local34[local37] + local28[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static636.anInt10302; local37++) {
					local18[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static636.anInt10302; local37++) {
					local18[local37] = local28[local37] * local34[local37] >> 12;
				}
			} else {
				@Pc(201) int local201;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static636.anInt10302; local37++) {
						local201 = local34[local37];
						local18[local37] = local201 == 0 ? 4096 : (local28[local37] << 12) / local201;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static636.anInt10302; local37++) {
						local18[local37] = 4096 - ((4096 - local28[local37]) * (-local34[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static636.anInt10302; local37++) {
						local201 = local34[local37];
						local18[local37] = local201 >= 2048 ? 4096 - ((4096 - local28[local37]) * (4096 - local201) >> 11) : local28[local37] * local201 >> 11;
					}
				} else {
					@Pc(322) int local322;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static636.anInt10302; local37++) {
							local322 = local28[local37];
							local18[local37] = local322 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local322);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static636.anInt10302; local37++) {
							local322 = local28[local37];
							local18[local37] = local322 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local322;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static636.anInt10302; local37++) {
							local201 = local34[local37];
							local322 = local28[local37];
							local18[local37] = local322 >= local201 ? local201 : local322;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static636.anInt10302; local37++) {
							local201 = local34[local37];
							local322 = local28[local37];
							local18[local37] = local322 > local201 ? local322 : local201;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static636.anInt10302; local37++) {
							local201 = local34[local37];
							local322 = local28[local37];
							local18[local37] = local201 < local322 ? local322 - local201 : local201 - local322;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static636.anInt10302; local37++) {
							local322 = local28[local37];
							local201 = local34[local37];
							local18[local37] = local201 + local322 - (local322 * local201 >> 11);
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt4914 = arg1.method5322(-18);
		} else if (arg0 == 1) {
			super.aBoolean794 = arg1.method5322(-60) == 1;
		}
	}
}
