import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class3_Sub8_Sub3 extends Class3_Sub8 {

	@OriginalMember(owner = "client!bv", name = "L", descriptor = "I")
	private int anInt1282 = 6;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub3() {
		super(2, false);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(26) int[] local26 = this.method8776(arg0, 0);
			@Pc(32) int[] local32 = this.method8776(arg0, 1);
			@Pc(35) int local35 = this.anInt1282;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static91.anInt1849; local35++) {
					local11[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static91.anInt1849; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static91.anInt1849; local35++) {
					local11[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(162) int local162;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static91.anInt1849; local35++) {
						local162 = local32[local35];
						local11[local35] = local162 == 0 ? 4096 : (local26[local35] << 12) / local162;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static91.anInt1849; local35++) {
						local11[local35] = 4096 - ((4096 - local32[local35]) * (4096 - local26[local35]) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static91.anInt1849; local35++) {
						local162 = local32[local35];
						local11[local35] = local162 < 2048 ? local26[local35] * local162 >> 11 : 4096 - ((4096 - local26[local35]) * (-local162 + 4096) >> 11);
					}
				} else {
					@Pc(268) int local268;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static91.anInt1849; local35++) {
							local268 = local26[local35];
							local11[local35] = local268 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local268);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static91.anInt1849; local35++) {
							local268 = local26[local35];
							local11[local35] = local268 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local268;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static91.anInt1849; local35++) {
							local268 = local26[local35];
							local162 = local32[local35];
							local11[local35] = local268 >= local162 ? local162 : local268;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static91.anInt1849; local35++) {
							local162 = local32[local35];
							local268 = local26[local35];
							local11[local35] = local268 <= local162 ? local162 : local268;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static91.anInt1849; local35++) {
							local162 = local32[local35];
							local268 = local26[local35];
							local11[local35] = local268 > local162 ? local268 - local162 : local162 + -local268;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static91.anInt1849; local35++) {
							local268 = local26[local35];
							local162 = local32[local35];
							local11[local35] = local162 + local268 - (local268 * local162 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt1282 = arg1.method7954();
		} else if (arg0 == 1) {
			super.aBoolean737 = arg1.method7954() == 1;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(26) int[][] local26 = this.method8779(0, arg0);
			@Pc(32) int[][] local32 = this.method8779(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt1282;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static91.anInt1849; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static91.anInt1849; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static91.anInt1849; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(267) int local267;
				@Pc(271) int local271;
				@Pc(275) int local275;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static91.anInt1849; local71++) {
						local267 = local60[local71];
						local271 = local64[local71];
						local275 = local68[local71];
						local36[local71] = local267 == 0 ? 4096 : (local48[local71] << 12) / local267;
						local40[local71] = local271 == 0 ? 4096 : (local52[local71] << 12) / local271;
						local44[local71] = local275 == 0 ? 4096 : (local56[local71] << 12) / local275;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static91.anInt1849; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (4096 - local64[local71]) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static91.anInt1849; local71++) {
						local271 = local64[local71];
						local267 = local60[local71];
						local275 = local68[local71];
						local36[local71] = local267 < 2048 ? local267 * local48[local71] >> 11 : 4096 - ((4096 - local267) * (-local48[local71] + 4096) >> 11);
						local40[local71] = local271 >= 2048 ? 4096 - ((4096 - local52[local71]) * (4096 - local271) >> 11) : local52[local71] * local271 >> 11;
						local44[local71] = local275 < 2048 ? local275 * local56[local71] >> 11 : 4096 - ((4096 - local56[local71]) * (-local275 + 4096) >> 11);
					}
				} else {
					@Pc(531) int local531;
					@Pc(523) int local523;
					@Pc(527) int local527;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static91.anInt1849; local71++) {
							local523 = local52[local71];
							local527 = local56[local71];
							local531 = local48[local71];
							local36[local71] = local531 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local531);
							local40[local71] = local523 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local523);
							local44[local71] = local527 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local527);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static91.anInt1849; local71++) {
							local527 = local56[local71];
							local531 = local48[local71];
							local523 = local52[local71];
							local36[local71] = local531 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local531;
							local40[local71] = local523 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local523;
							local44[local71] = local527 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local527;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static91.anInt1849; local71++) {
							local527 = local56[local71];
							local523 = local52[local71];
							local275 = local68[local71];
							local531 = local48[local71];
							local271 = local64[local71];
							local267 = local60[local71];
							local36[local71] = local531 >= local267 ? local267 : local531;
							local40[local71] = local271 > local523 ? local523 : local271;
							local44[local71] = local527 < local275 ? local527 : local275;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static91.anInt1849; local71++) {
							local531 = local48[local71];
							local275 = local68[local71];
							local267 = local60[local71];
							local523 = local52[local71];
							local271 = local64[local71];
							local527 = local56[local71];
							local36[local71] = local267 >= local531 ? local267 : local531;
							local40[local71] = local523 > local271 ? local523 : local271;
							local44[local71] = local527 <= local275 ? local275 : local527;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static91.anInt1849; local71++) {
							local267 = local60[local71];
							local275 = local68[local71];
							local523 = local52[local71];
							local271 = local64[local71];
							local527 = local56[local71];
							local531 = local48[local71];
							local36[local71] = local531 <= local267 ? local267 - local531 : -local267 + local531;
							local40[local71] = local271 < local523 ? local523 - local271 : local271 + -local523;
							local44[local71] = local275 < local527 ? local527 - local275 : local275 - local527;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static91.anInt1849; local71++) {
							local523 = local52[local71];
							local275 = local68[local71];
							local531 = local48[local71];
							local267 = local60[local71];
							local527 = local56[local71];
							local271 = local64[local71];
							local36[local71] = local531 + local267 - (local531 * local267 >> 11);
							local40[local71] = local271 + local523 - (local523 * local271 >> 11);
							local44[local71] = local527 + local275 - (local527 * local275 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
