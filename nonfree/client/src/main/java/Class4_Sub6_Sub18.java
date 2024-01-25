import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class4_Sub6_Sub18 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ju", name = "J", descriptor = "I")
	private int anInt3770 = 6;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub18() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(26) int[][] local26 = this.method5516(0, arg0);
			@Pc(32) int[][] local32 = this.method5516(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt3770;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static80.anInt1616; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static80.anInt1616; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static80.anInt1616; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(261) int local261;
				@Pc(265) int local265;
				@Pc(269) int local269;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static80.anInt1616; local71++) {
						local261 = local60[local71];
						local265 = local64[local71];
						local269 = local68[local71];
						local36[local71] = local261 == 0 ? 4096 : (local48[local71] << 12) / local261;
						local40[local71] = local265 == 0 ? 4096 : (local52[local71] << 12) / local265;
						local44[local71] = local269 == 0 ? 4096 : (local56[local71] << 12) / local269;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static80.anInt1616; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (4096 - local64[local71]) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (-local56[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static80.anInt1616; local71++) {
						local265 = local64[local71];
						local261 = local60[local71];
						local269 = local68[local71];
						local36[local71] = local261 < 2048 ? local48[local71] * local261 >> 11 : 4096 - ((4096 - local48[local71]) * (-local261 + 4096) >> 11);
						local40[local71] = local265 >= 2048 ? 4096 - ((4096 - local52[local71]) * (-local265 + 4096) >> 11) : local52[local71] * local265 >> 11;
						local44[local71] = local269 < 2048 ? local56[local71] * local269 >> 11 : 4096 - ((4096 - local56[local71]) * (-local269 + 4096) >> 11);
					}
				} else {
					@Pc(517) int local517;
					@Pc(513) int local513;
					@Pc(521) int local521;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static80.anInt1616; local71++) {
							local513 = local52[local71];
							local517 = local48[local71];
							local521 = local56[local71];
							local36[local71] = local517 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local517);
							local40[local71] = local513 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local513);
							local44[local71] = local521 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local521);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static80.anInt1616; local71++) {
							local517 = local48[local71];
							local513 = local52[local71];
							local521 = local56[local71];
							local36[local71] = local517 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local517;
							local40[local71] = local513 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local513;
							local44[local71] = local521 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local521;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static80.anInt1616; local71++) {
							local265 = local64[local71];
							local521 = local56[local71];
							local517 = local48[local71];
							local261 = local60[local71];
							local269 = local68[local71];
							local513 = local52[local71];
							local36[local71] = local517 >= local261 ? local261 : local517;
							local40[local71] = local513 < local265 ? local513 : local265;
							local44[local71] = local521 < local269 ? local521 : local269;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static80.anInt1616; local71++) {
							local265 = local64[local71];
							local261 = local60[local71];
							local521 = local56[local71];
							local269 = local68[local71];
							local517 = local48[local71];
							local513 = local52[local71];
							local36[local71] = local261 < local517 ? local517 : local261;
							local40[local71] = local513 > local265 ? local513 : local265;
							local44[local71] = local521 <= local269 ? local269 : local521;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static80.anInt1616; local71++) {
							local269 = local68[local71];
							local517 = local48[local71];
							local261 = local60[local71];
							local265 = local64[local71];
							local521 = local56[local71];
							local513 = local52[local71];
							local36[local71] = local261 < local517 ? local517 - local261 : -local517 + local261;
							local40[local71] = local265 < local513 ? local513 - local265 : local265 - local513;
							local44[local71] = local269 >= local521 ? local269 - local521 : local521 - local269;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static80.anInt1616; local71++) {
							local265 = local64[local71];
							local513 = local52[local71];
							local517 = local48[local71];
							local261 = local60[local71];
							local521 = local56[local71];
							local269 = local68[local71];
							local36[local71] = local517 + local261 - (local517 * local261 >> 11);
							local40[local71] = local513 + local265 - (local513 * local265 >> 11);
							local44[local71] = local269 + local521 - (local521 * local269 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt3770 = arg1.method2490();
		} else if (arg0 == 1) {
			super.aBoolean665 = arg1.method2490() == 1;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(29) int[] local29 = this.method5508(arg0, 0);
			@Pc(35) int[] local35 = this.method5508(arg0, 1);
			@Pc(38) int local38 = this.anInt3770;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static80.anInt1616; local38++) {
					local19[local38] = local35[local38] + local29[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static80.anInt1616; local38++) {
					local19[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static80.anInt1616; local38++) {
					local19[local38] = local35[local38] * local29[local38] >> 12;
				}
			} else {
				@Pc(157) int local157;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static80.anInt1616; local38++) {
						local157 = local35[local38];
						local19[local38] = local157 == 0 ? 4096 : (local29[local38] << 12) / local157;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static80.anInt1616; local38++) {
						local19[local38] = 4096 - ((4096 - local29[local38]) * (-local35[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static80.anInt1616; local38++) {
						local157 = local35[local38];
						local19[local38] = local157 >= 2048 ? 4096 - ((4096 - local157) * (-local29[local38] + 4096) >> 11) : local157 * local29[local38] >> 11;
					}
				} else {
					@Pc(264) int local264;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static80.anInt1616; local38++) {
							local264 = local29[local38];
							local19[local38] = local264 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local264);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static80.anInt1616; local38++) {
							local264 = local29[local38];
							local19[local38] = local264 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local264;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static80.anInt1616; local38++) {
							local157 = local35[local38];
							local264 = local29[local38];
							local19[local38] = local157 <= local264 ? local157 : local264;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static80.anInt1616; local38++) {
							local264 = local29[local38];
							local157 = local35[local38];
							local19[local38] = local264 <= local157 ? local157 : local264;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static80.anInt1616; local38++) {
							local264 = local29[local38];
							local157 = local35[local38];
							local19[local38] = local157 < local264 ? local264 - local157 : -local264 + local157;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static80.anInt1616; local38++) {
							local264 = local29[local38];
							local157 = local35[local38];
							local19[local38] = local264 + local157 - (local264 * local157 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
