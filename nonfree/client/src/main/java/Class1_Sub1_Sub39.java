import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wt", name = "F", descriptor = "I")
	private int anInt9554 = 6;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(2, false);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(26) int[] local26 = this.method7882(0, arg0);
			@Pc(32) int[] local32 = this.method7882(1, arg0);
			@Pc(35) int local35 = this.anInt9554;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static87.anInt1964; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static87.anInt1964; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static87.anInt1964; local35++) {
					local16[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(158) int local158;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static87.anInt1964; local35++) {
						local158 = local32[local35];
						local16[local35] = local158 == 0 ? 4096 : (local26[local35] << 12) / local158;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static87.anInt1964; local35++) {
						local16[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static87.anInt1964; local35++) {
						local158 = local32[local35];
						local16[local35] = local158 < 2048 ? local26[local35] * local158 >> 11 : 4096 - ((4096 - local158) * (4096 - local26[local35]) >> 11);
					}
				} else {
					@Pc(268) int local268;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static87.anInt1964; local35++) {
							local268 = local26[local35];
							local16[local35] = local268 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local268);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static87.anInt1964; local35++) {
							local268 = local26[local35];
							local16[local35] = local268 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local268;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static87.anInt1964; local35++) {
							local158 = local32[local35];
							local268 = local26[local35];
							local16[local35] = local158 <= local268 ? local158 : local268;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static87.anInt1964; local35++) {
							local268 = local26[local35];
							local158 = local32[local35];
							local16[local35] = local268 > local158 ? local268 : local158;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static87.anInt1964; local35++) {
							local268 = local26[local35];
							local158 = local32[local35];
							local16[local35] = local158 >= local268 ? local158 - local268 : local268 + -local158;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static87.anInt1964; local35++) {
							local268 = local26[local35];
							local158 = local32[local35];
							local16[local35] = local268 + local158 - (local268 * local158 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(26) int[][] local26 = this.method7880(arg0, 0);
			@Pc(32) int[][] local32 = this.method7880(arg0, 1);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt9554;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static87.anInt1964; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static87.anInt1964; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static87.anInt1964; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(266) int local266;
				@Pc(274) int local274;
				@Pc(270) int local270;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static87.anInt1964; local71++) {
						local266 = local60[local71];
						local270 = local68[local71];
						local274 = local64[local71];
						local36[local71] = local266 == 0 ? 4096 : (local48[local71] << 12) / local266;
						local40[local71] = local274 == 0 ? 4096 : (local52[local71] << 12) / local274;
						local44[local71] = local270 == 0 ? 4096 : (local56[local71] << 12) / local270;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static87.anInt1964; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (4096 - local60[local71]) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (4096 - local52[local71]) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (-local56[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static87.anInt1964; local71++) {
						local266 = local60[local71];
						local270 = local68[local71];
						local274 = local64[local71];
						local36[local71] = local266 < 2048 ? local48[local71] * local266 >> 11 : 4096 - ((4096 - local266) * (-local48[local71] + 4096) >> 11);
						local40[local71] = local274 >= 2048 ? 4096 - ((4096 - local274) * (4096 - local52[local71]) >> 11) : local52[local71] * local274 >> 11;
						local44[local71] = local270 >= 2048 ? 4096 - ((4096 - local56[local71]) * (-local270 + 4096) >> 11) : local56[local71] * local270 >> 11;
					}
				} else {
					@Pc(536) int local536;
					@Pc(532) int local532;
					@Pc(528) int local528;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static87.anInt1964; local71++) {
							local528 = local56[local71];
							local532 = local52[local71];
							local536 = local48[local71];
							local36[local71] = local536 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local536);
							local40[local71] = local532 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local532);
							local44[local71] = local528 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local528);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static87.anInt1964; local71++) {
							local536 = local48[local71];
							local528 = local56[local71];
							local532 = local52[local71];
							local36[local71] = local536 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local536;
							local40[local71] = local532 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local532;
							local44[local71] = local528 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local528;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static87.anInt1964; local71++) {
							local266 = local60[local71];
							local536 = local48[local71];
							local532 = local52[local71];
							local274 = local64[local71];
							local270 = local68[local71];
							local528 = local56[local71];
							local36[local71] = local536 >= local266 ? local266 : local536;
							local40[local71] = local274 <= local532 ? local274 : local532;
							local44[local71] = local528 < local270 ? local528 : local270;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static87.anInt1964; local71++) {
							local270 = local68[local71];
							local274 = local64[local71];
							local536 = local48[local71];
							local266 = local60[local71];
							local528 = local56[local71];
							local532 = local52[local71];
							local36[local71] = local536 > local266 ? local536 : local266;
							local40[local71] = local274 >= local532 ? local274 : local532;
							local44[local71] = local528 <= local270 ? local270 : local528;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static87.anInt1964; local71++) {
							local536 = local48[local71];
							local528 = local56[local71];
							local266 = local60[local71];
							local532 = local52[local71];
							local274 = local64[local71];
							local270 = local68[local71];
							local36[local71] = local266 >= local536 ? local266 - local536 : local536 - local266;
							local40[local71] = local274 >= local532 ? local274 - local532 : local532 - local274;
							local44[local71] = local528 > local270 ? local528 - local270 : local270 - local528;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static87.anInt1964; local71++) {
							local532 = local52[local71];
							local270 = local68[local71];
							local274 = local64[local71];
							local528 = local56[local71];
							local266 = local60[local71];
							local536 = local48[local71];
							local36[local71] = local536 + local266 - (local266 * local536 >> 11);
							local40[local71] = local274 + local532 - (local532 * local274 >> 11);
							local44[local71] = local270 + local528 - (local270 * local528 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt9554 = arg1.method4393();
		} else if (arg0 == 1) {
			super.aBoolean696 = arg1.method4393() == 1;
		}
	}
}
