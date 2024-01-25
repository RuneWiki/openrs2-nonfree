import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class2_Sub3_Sub31 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
	private int anInt6280 = 6;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub31() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6280 = arg1.method3124();
		} else if (arg0 == 1) {
			super.aBoolean606 = arg1.method3124() == 1;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(26) int[][] local26 = this.method5707(arg0, 0);
			@Pc(32) int[][] local32 = this.method5707(arg0, 1);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt6280;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static263.anInt5504; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static263.anInt5504; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static263.anInt5504; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(260) int local260;
				@Pc(264) int local264;
				@Pc(268) int local268;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static263.anInt5504; local71++) {
						local260 = local60[local71];
						local264 = local64[local71];
						local268 = local68[local71];
						local36[local71] = local260 == 0 ? 4096 : (local48[local71] << 12) / local260;
						local40[local71] = local264 == 0 ? 4096 : (local52[local71] << 12) / local264;
						local44[local71] = local268 == 0 ? 4096 : (local56[local71] << 12) / local268;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static263.anInt5504; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (4096 - local60[local71]) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (4096 - local52[local71]) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (4096 - local68[local71]) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static263.anInt5504; local71++) {
						local264 = local64[local71];
						local260 = local60[local71];
						local268 = local68[local71];
						local36[local71] = local260 < 2048 ? local48[local71] * local260 >> 11 : 4096 - ((4096 - local260) * (4096 - local48[local71]) >> 11);
						local40[local71] = local264 < 2048 ? local52[local71] * local264 >> 11 : 4096 - ((4096 - local52[local71]) * (4096 - local264) >> 11);
						local44[local71] = local268 < 2048 ? local268 * local56[local71] >> 11 : 4096 - ((4096 - local268) * (-local56[local71] + 4096) >> 11);
					}
				} else {
					@Pc(518) int local518;
					@Pc(514) int local514;
					@Pc(510) int local510;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static263.anInt5504; local71++) {
							local510 = local56[local71];
							local514 = local52[local71];
							local518 = local48[local71];
							local36[local71] = local518 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local518);
							local40[local71] = local514 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local514);
							local44[local71] = local510 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local510);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static263.anInt5504; local71++) {
							local514 = local52[local71];
							local518 = local48[local71];
							local510 = local56[local71];
							local36[local71] = local518 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local518;
							local40[local71] = local514 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local514;
							local44[local71] = local510 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local510;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static263.anInt5504; local71++) {
							local510 = local56[local71];
							local514 = local52[local71];
							local264 = local64[local71];
							local268 = local68[local71];
							local260 = local60[local71];
							local518 = local48[local71];
							local36[local71] = local260 <= local518 ? local260 : local518;
							local40[local71] = local264 <= local514 ? local264 : local514;
							local44[local71] = local268 > local510 ? local510 : local268;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static263.anInt5504; local71++) {
							local518 = local48[local71];
							local514 = local52[local71];
							local260 = local60[local71];
							local268 = local68[local71];
							local510 = local56[local71];
							local264 = local64[local71];
							local36[local71] = local260 >= local518 ? local260 : local518;
							local40[local71] = local264 >= local514 ? local264 : local514;
							local44[local71] = local268 < local510 ? local510 : local268;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static263.anInt5504; local71++) {
							local514 = local52[local71];
							local264 = local64[local71];
							local518 = local48[local71];
							local268 = local68[local71];
							local260 = local60[local71];
							local510 = local56[local71];
							local36[local71] = local260 >= local518 ? local260 - local518 : -local260 + local518;
							local40[local71] = local514 > local264 ? local514 - local264 : -local514 + local264;
							local44[local71] = local268 < local510 ? local510 - local268 : -local510 + local268;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static263.anInt5504; local71++) {
							local264 = local64[local71];
							local260 = local60[local71];
							local268 = local68[local71];
							local518 = local48[local71];
							local514 = local52[local71];
							local510 = local56[local71];
							local36[local71] = local260 + local518 - (local518 * local260 >> 11);
							local40[local71] = local514 + local264 - (local264 * local514 >> 11);
							local44[local71] = local268 + local510 - (local268 * local510 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(26) int[] local26 = this.method5700(0, arg0);
			@Pc(32) int[] local32 = this.method5700(1, arg0);
			@Pc(35) int local35 = this.anInt6280;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static263.anInt5504; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static263.anInt5504; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static263.anInt5504; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(159) int local159;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static263.anInt5504; local35++) {
						local159 = local32[local35];
						local16[local35] = local159 == 0 ? 4096 : (local26[local35] << 12) / local159;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static263.anInt5504; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static263.anInt5504; local35++) {
						local159 = local32[local35];
						local16[local35] = local159 >= 2048 ? 4096 - ((4096 - local26[local35]) * (4096 - local159) >> 11) : local26[local35] * local159 >> 11;
					}
				} else {
					@Pc(270) int local270;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static263.anInt5504; local35++) {
							local270 = local26[local35];
							local16[local35] = local270 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local270);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static263.anInt5504; local35++) {
							local270 = local26[local35];
							local16[local35] = local270 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local270;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static263.anInt5504; local35++) {
							local159 = local32[local35];
							local270 = local26[local35];
							local16[local35] = local159 <= local270 ? local159 : local270;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static263.anInt5504; local35++) {
							local159 = local32[local35];
							local270 = local26[local35];
							local16[local35] = local159 < local270 ? local270 : local159;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static263.anInt5504; local35++) {
							local159 = local32[local35];
							local270 = local26[local35];
							local16[local35] = local270 <= local159 ? local159 - local270 : -local159 + local270;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static263.anInt5504; local35++) {
							local270 = local26[local35];
							local159 = local32[local35];
							local16[local35] = local159 + local270 - (local270 * local159 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
