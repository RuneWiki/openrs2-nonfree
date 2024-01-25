import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class5_Sub2_Sub20 extends Class5_Sub2 {

	@OriginalMember(owner = "client!o", name = "J", descriptor = "I")
	private int anInt6807 = 6;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub20() {
		super(2, false);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(26) int[] local26 = this.method8821(arg0, 0);
			@Pc(32) int[] local32 = this.method8821(arg0, 1);
			@Pc(35) int local35 = this.anInt6807;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static314.anInt6320; local35++) {
					local11[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static314.anInt6320; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static314.anInt6320; local35++) {
					local11[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(156) int local156;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static314.anInt6320; local35++) {
						local156 = local32[local35];
						local11[local35] = local156 == 0 ? 4096 : (local26[local35] << 12) / local156;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static314.anInt6320; local35++) {
						local11[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static314.anInt6320; local35++) {
						local156 = local32[local35];
						local11[local35] = local156 < 2048 ? local26[local35] * local156 >> 11 : 4096 - ((4096 - local26[local35]) * (-local156 + 4096) >> 11);
					}
				} else {
					@Pc(270) int local270;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static314.anInt6320; local35++) {
							local270 = local26[local35];
							local11[local35] = local270 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local270);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static314.anInt6320; local35++) {
							local270 = local26[local35];
							local11[local35] = local270 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local270;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static314.anInt6320; local35++) {
							local270 = local26[local35];
							local156 = local32[local35];
							local11[local35] = local156 > local270 ? local270 : local156;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static314.anInt6320; local35++) {
							local156 = local32[local35];
							local270 = local26[local35];
							local11[local35] = local270 <= local156 ? local156 : local270;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static314.anInt6320; local35++) {
							local270 = local26[local35];
							local156 = local32[local35];
							local11[local35] = local156 >= local270 ? local156 - local270 : -local156 + local270;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static314.anInt6320; local35++) {
							local156 = local32[local35];
							local270 = local26[local35];
							local11[local35] = local156 + local270 - (local156 * local270 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(26) int[][] local26 = this.method8823(arg0, 0);
			@Pc(32) int[][] local32 = this.method8823(arg0, 1);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt6807;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static314.anInt6320; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static314.anInt6320; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static314.anInt6320; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(271) int local271;
				@Pc(267) int local267;
				@Pc(275) int local275;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static314.anInt6320; local71++) {
						local267 = local64[local71];
						local271 = local60[local71];
						local275 = local68[local71];
						local36[local71] = local271 == 0 ? 4096 : (local48[local71] << 12) / local271;
						local40[local71] = local267 == 0 ? 4096 : (local52[local71] << 12) / local267;
						local44[local71] = local275 == 0 ? 4096 : (local56[local71] << 12) / local275;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static314.anInt6320; local71++) {
						local36[local71] = 4096 - ((4096 - local60[local71]) * (-local48[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static314.anInt6320; local71++) {
						local271 = local60[local71];
						local267 = local64[local71];
						local275 = local68[local71];
						local36[local71] = local271 < 2048 ? local48[local71] * local271 >> 11 : 4096 - ((4096 - local48[local71]) * (4096 - local271) >> 11);
						local40[local71] = local267 < 2048 ? local267 * local52[local71] >> 11 : 4096 - ((4096 - local52[local71]) * (-local267 + 4096) >> 11);
						local44[local71] = local275 < 2048 ? local56[local71] * local275 >> 11 : 4096 - ((4096 - local275) * (-local56[local71] + 4096) >> 11);
					}
				} else {
					@Pc(536) int local536;
					@Pc(532) int local532;
					@Pc(528) int local528;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static314.anInt6320; local71++) {
							local528 = local56[local71];
							local532 = local52[local71];
							local536 = local48[local71];
							local36[local71] = local536 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local536);
							local40[local71] = local532 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local532);
							local44[local71] = local528 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local528);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static314.anInt6320; local71++) {
							local532 = local52[local71];
							local528 = local56[local71];
							local536 = local48[local71];
							local36[local71] = local536 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local536;
							local40[local71] = local532 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local532;
							local44[local71] = local528 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local528;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static314.anInt6320; local71++) {
							local532 = local52[local71];
							local275 = local68[local71];
							local267 = local64[local71];
							local528 = local56[local71];
							local271 = local60[local71];
							local536 = local48[local71];
							local36[local71] = local536 < local271 ? local536 : local271;
							local40[local71] = local532 >= local267 ? local267 : local532;
							local44[local71] = local528 >= local275 ? local275 : local528;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static314.anInt6320; local71++) {
							local275 = local68[local71];
							local267 = local64[local71];
							local271 = local60[local71];
							local532 = local52[local71];
							local536 = local48[local71];
							local528 = local56[local71];
							local36[local71] = local536 <= local271 ? local271 : local536;
							local40[local71] = local267 >= local532 ? local267 : local532;
							local44[local71] = local275 < local528 ? local528 : local275;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static314.anInt6320; local71++) {
							local528 = local56[local71];
							local532 = local52[local71];
							local275 = local68[local71];
							local271 = local60[local71];
							local536 = local48[local71];
							local267 = local64[local71];
							local36[local71] = local271 < local536 ? local536 - local271 : local271 + -local536;
							local40[local71] = local267 < local532 ? local532 - local267 : local267 + -local532;
							local44[local71] = local275 >= local528 ? local275 - local528 : local528 - local275;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static314.anInt6320; local71++) {
							local536 = local48[local71];
							local532 = local52[local71];
							local528 = local56[local71];
							local267 = local64[local71];
							local271 = local60[local71];
							local275 = local68[local71];
							local36[local71] = local536 + local271 - (local271 * local536 >> 11);
							local40[local71] = local532 + local267 - (local267 * local532 >> 11);
							local44[local71] = local528 + local275 - (local528 * local275 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6807 = arg0.method8645();
		} else if (arg1 == 1) {
			super.aBoolean834 = arg0.method8645() == 1;
		}
	}
}
