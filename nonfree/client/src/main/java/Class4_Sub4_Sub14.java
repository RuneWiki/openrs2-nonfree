import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class4_Sub4_Sub14 extends Class4_Sub4 {

	@OriginalMember(owner = "client!jk", name = "Q", descriptor = "[I")
	public static final int[] anIntArray296 = new int[256];

	@OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
	private int anInt3281 = 6;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray296[local8] = local11;
		}
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub14() {
		super(2, false);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(26) int[] local26 = this.method5386(0, arg0);
			@Pc(32) int[] local32 = this.method5386(1, arg0);
			@Pc(35) int local35 = this.anInt3281;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static124.anInt3576; local35++) {
					local11[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static124.anInt3576; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static124.anInt3576; local35++) {
					local11[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(162) int local162;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static124.anInt3576; local35++) {
						local162 = local32[local35];
						local11[local35] = local162 == 0 ? 4096 : (local26[local35] << 12) / local162;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static124.anInt3576; local35++) {
						local11[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static124.anInt3576; local35++) {
						local162 = local32[local35];
						local11[local35] = local162 < 2048 ? local162 * local26[local35] >> 11 : 4096 - ((4096 - local162) * (-local26[local35] + 4096) >> 11);
					}
				} else {
					@Pc(278) int local278;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static124.anInt3576; local35++) {
							local278 = local26[local35];
							local11[local35] = local278 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local278);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static124.anInt3576; local35++) {
							local278 = local26[local35];
							local11[local35] = local278 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local278;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static124.anInt3576; local35++) {
							local162 = local32[local35];
							local278 = local26[local35];
							local11[local35] = local278 >= local162 ? local162 : local278;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static124.anInt3576; local35++) {
							local162 = local32[local35];
							local278 = local26[local35];
							local11[local35] = local162 < local278 ? local278 : local162;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static124.anInt3576; local35++) {
							local278 = local26[local35];
							local162 = local32[local35];
							local11[local35] = local278 <= local162 ? local162 - local278 : -local162 + local278;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static124.anInt3576; local35++) {
							local162 = local32[local35];
							local278 = local26[local35];
							local11[local35] = local162 + local278 - (local278 * local162 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(26) int[][] local26 = this.method5384(0, arg0);
			@Pc(32) int[][] local32 = this.method5384(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt3281;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static124.anInt3576; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static124.anInt3576; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static124.anInt3576; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(263) int local263;
				@Pc(271) int local271;
				@Pc(267) int local267;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static124.anInt3576; local71++) {
						local263 = local60[local71];
						local267 = local68[local71];
						local271 = local64[local71];
						local36[local71] = local263 == 0 ? 4096 : (local48[local71] << 12) / local263;
						local40[local71] = local271 == 0 ? 4096 : (local52[local71] << 12) / local271;
						local44[local71] = local267 == 0 ? 4096 : (local56[local71] << 12) / local267;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static124.anInt3576; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (4096 - local60[local71]) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static124.anInt3576; local71++) {
						local267 = local68[local71];
						local271 = local64[local71];
						local263 = local60[local71];
						local36[local71] = local263 >= 2048 ? 4096 - ((4096 - local263) * (-local48[local71] + 4096) >> 11) : local263 * local48[local71] >> 11;
						local40[local71] = local271 < 2048 ? local52[local71] * local271 >> 11 : 4096 - ((4096 - local52[local71]) * (-local271 + 4096) >> 11);
						local44[local71] = local267 < 2048 ? local267 * local56[local71] >> 11 : 4096 - ((4096 - local56[local71]) * (-local267 + 4096) >> 11);
					}
				} else {
					@Pc(526) int local526;
					@Pc(522) int local522;
					@Pc(518) int local518;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static124.anInt3576; local71++) {
							local518 = local56[local71];
							local522 = local52[local71];
							local526 = local48[local71];
							local36[local71] = local526 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local526);
							local40[local71] = local522 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local522);
							local44[local71] = local518 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local518);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static124.anInt3576; local71++) {
							local526 = local48[local71];
							local522 = local52[local71];
							local518 = local56[local71];
							local36[local71] = local526 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local526;
							local40[local71] = local522 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local522;
							local44[local71] = local518 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local518;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static124.anInt3576; local71++) {
							local526 = local48[local71];
							local271 = local64[local71];
							local263 = local60[local71];
							local267 = local68[local71];
							local518 = local56[local71];
							local522 = local52[local71];
							local36[local71] = local263 <= local526 ? local263 : local526;
							local40[local71] = local271 > local522 ? local522 : local271;
							local44[local71] = local267 > local518 ? local518 : local267;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static124.anInt3576; local71++) {
							local526 = local48[local71];
							local271 = local64[local71];
							local267 = local68[local71];
							local518 = local56[local71];
							local263 = local60[local71];
							local522 = local52[local71];
							local36[local71] = local526 <= local263 ? local263 : local526;
							local40[local71] = local271 < local522 ? local522 : local271;
							local44[local71] = local267 < local518 ? local518 : local267;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static124.anInt3576; local71++) {
							local267 = local68[local71];
							local522 = local52[local71];
							local271 = local64[local71];
							local263 = local60[local71];
							local526 = local48[local71];
							local518 = local56[local71];
							local36[local71] = local526 > local263 ? local526 - local263 : local263 - local526;
							local40[local71] = local271 >= local522 ? local271 - local522 : local522 + -local271;
							local44[local71] = local267 < local518 ? local518 - local267 : local267 + -local518;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static124.anInt3576; local71++) {
							local263 = local60[local71];
							local522 = local52[local71];
							local518 = local56[local71];
							local267 = local68[local71];
							local271 = local64[local71];
							local526 = local48[local71];
							local36[local71] = local263 + local526 - (local263 * local526 >> 11);
							local40[local71] = local271 + local522 - (local522 * local271 >> 11);
							local44[local71] = local518 + local267 - (local518 * local267 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3281 = arg1.method2380();
		} else if (arg0 == 1) {
			super.aBoolean563 = arg1.method2380() == 1;
		}
	}
}
