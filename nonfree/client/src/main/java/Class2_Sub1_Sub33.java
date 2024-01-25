import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class2_Sub1_Sub33 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
	private int anInt6169 = 6;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub33() {
		super(2, false);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(26) int[] local26 = this.method6069(0, arg0);
			@Pc(32) int[] local32 = this.method6069(1, arg0);
			@Pc(35) int local35 = this.anInt6169;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static391.anInt7118; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static391.anInt7118; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static391.anInt7118; local35++) {
					local16[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(157) int local157;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static391.anInt7118; local35++) {
						local157 = local32[local35];
						local16[local35] = local157 == 0 ? 4096 : (local26[local35] << 12) / local157;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static391.anInt7118; local35++) {
						local16[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static391.anInt7118; local35++) {
						local157 = local32[local35];
						local16[local35] = local157 >= 2048 ? 4096 - ((4096 - local157) * (-local26[local35] + 4096) >> 11) : local157 * local26[local35] >> 11;
					}
				} else {
					@Pc(261) int local261;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static391.anInt7118; local35++) {
							local261 = local26[local35];
							local16[local35] = local261 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local261);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static391.anInt7118; local35++) {
							local261 = local26[local35];
							local16[local35] = local261 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local261;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static391.anInt7118; local35++) {
							local157 = local32[local35];
							local261 = local26[local35];
							local16[local35] = local157 > local261 ? local261 : local157;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static391.anInt7118; local35++) {
							local157 = local32[local35];
							local261 = local26[local35];
							local16[local35] = local261 <= local157 ? local157 : local261;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static391.anInt7118; local35++) {
							local261 = local26[local35];
							local157 = local32[local35];
							local16[local35] = local261 <= local157 ? local157 - local261 : -local157 + local261;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static391.anInt7118; local35++) {
							local261 = local26[local35];
							local157 = local32[local35];
							local16[local35] = local157 + local261 - (local157 * local261 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(26) int[][] local26 = this.method6061(0, arg0);
			@Pc(32) int[][] local32 = this.method6061(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt6169;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static391.anInt7118; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static391.anInt7118; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static391.anInt7118; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(268) int local268;
				@Pc(276) int local276;
				@Pc(272) int local272;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static391.anInt7118; local71++) {
						local268 = local60[local71];
						local272 = local68[local71];
						local276 = local64[local71];
						local36[local71] = local268 == 0 ? 4096 : (local48[local71] << 12) / local268;
						local40[local71] = local276 == 0 ? 4096 : (local52[local71] << 12) / local276;
						local44[local71] = local272 == 0 ? 4096 : (local56[local71] << 12) / local272;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static391.anInt7118; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (-local56[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static391.anInt7118; local71++) {
						local272 = local68[local71];
						local276 = local64[local71];
						local268 = local60[local71];
						local36[local71] = local268 < 2048 ? local48[local71] * local268 >> 11 : 4096 - ((4096 - local48[local71]) * (-local268 + 4096) >> 11);
						local40[local71] = local276 >= 2048 ? 4096 - ((4096 - local276) * (-local52[local71] + 4096) >> 11) : local276 * local52[local71] >> 11;
						local44[local71] = local272 < 2048 ? local272 * local56[local71] >> 11 : 4096 - ((4096 - local272) * (4096 - local56[local71]) >> 11);
					}
				} else {
					@Pc(533) int local533;
					@Pc(529) int local529;
					@Pc(537) int local537;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static391.anInt7118; local71++) {
							local529 = local52[local71];
							local533 = local48[local71];
							local537 = local56[local71];
							local36[local71] = local533 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local533);
							local40[local71] = local529 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local529);
							local44[local71] = local537 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local537);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static391.anInt7118; local71++) {
							local533 = local48[local71];
							local529 = local52[local71];
							local537 = local56[local71];
							local36[local71] = local533 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local533;
							local40[local71] = local529 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local529;
							local44[local71] = local537 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local537;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static391.anInt7118; local71++) {
							local537 = local56[local71];
							local272 = local68[local71];
							local533 = local48[local71];
							local276 = local64[local71];
							local529 = local52[local71];
							local268 = local60[local71];
							local36[local71] = local533 < local268 ? local533 : local268;
							local40[local71] = local529 < local276 ? local529 : local276;
							local44[local71] = local537 < local272 ? local537 : local272;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static391.anInt7118; local71++) {
							local268 = local60[local71];
							local533 = local48[local71];
							local537 = local56[local71];
							local529 = local52[local71];
							local276 = local64[local71];
							local272 = local68[local71];
							local36[local71] = local533 > local268 ? local533 : local268;
							local40[local71] = local529 > local276 ? local529 : local276;
							local44[local71] = local272 < local537 ? local537 : local272;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static391.anInt7118; local71++) {
							local537 = local56[local71];
							local268 = local60[local71];
							local533 = local48[local71];
							local272 = local68[local71];
							local276 = local64[local71];
							local529 = local52[local71];
							local36[local71] = local533 <= local268 ? local268 - local533 : -local268 + local533;
							local40[local71] = local276 >= local529 ? local276 - local529 : local529 - local276;
							local44[local71] = local537 > local272 ? local537 - local272 : local272 + -local537;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static391.anInt7118; local71++) {
							local533 = local48[local71];
							local268 = local60[local71];
							local272 = local68[local71];
							local529 = local52[local71];
							local537 = local56[local71];
							local276 = local64[local71];
							local36[local71] = local533 + local268 - (local533 * local268 >> 11);
							local40[local71] = local529 + local276 - (local529 * local276 >> 11);
							local44[local71] = local537 + local272 - (local272 * local537 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt6169 = arg1.method5732();
		} else if (arg0 == 1) {
			super.aBoolean498 = arg1.method5732() == 1;
		}
	}
}
