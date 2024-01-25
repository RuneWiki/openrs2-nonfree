import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class11_Sub2_Sub17 extends Class11_Sub2 {

	@OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
	private int anInt3049 = 6;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub17() {
		super(2, false);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3049 = arg0.method5185();
		} else if (arg1 == 1) {
			super.aBoolean427 = arg0.method5185() == 1;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(21) int[] local21 = this.method5710(0, arg0);
			@Pc(27) int[] local27 = this.method5710(1, arg0);
			@Pc(30) int local30 = this.anInt3049;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static339.anInt6549; local30++) {
					local11[local30] = local21[local30] + local27[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static339.anInt6549; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static339.anInt6549; local30++) {
					local11[local30] = local21[local30] * local27[local30] >> 12;
				}
			} else {
				@Pc(159) int local159;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static339.anInt6549; local30++) {
						local159 = local27[local30];
						local11[local30] = local159 == 0 ? 4096 : (local21[local30] << 12) / local159;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static339.anInt6549; local30++) {
						local11[local30] = 4096 - ((4096 - local27[local30]) * (-local21[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static339.anInt6549; local30++) {
						local159 = local27[local30];
						local11[local30] = local159 >= 2048 ? 4096 - ((4096 - local21[local30]) * (4096 - local159) >> 11) : local159 * local21[local30] >> 11;
					}
				} else {
					@Pc(265) int local265;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static339.anInt6549; local30++) {
							local265 = local21[local30];
							local11[local30] = local265 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local265);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static339.anInt6549; local30++) {
							local265 = local21[local30];
							local11[local30] = local265 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local265;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static339.anInt6549; local30++) {
							local265 = local21[local30];
							local159 = local27[local30];
							local11[local30] = local159 > local265 ? local265 : local159;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static339.anInt6549; local30++) {
							local265 = local21[local30];
							local159 = local27[local30];
							local11[local30] = local159 >= local265 ? local159 : local265;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static339.anInt6549; local30++) {
							local159 = local27[local30];
							local265 = local21[local30];
							local11[local30] = local159 < local265 ? local265 - local159 : -local265 + local159;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static339.anInt6549; local30++) {
							local265 = local21[local30];
							local159 = local27[local30];
							local11[local30] = local159 + local265 - (local159 * local265 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(26) int[][] local26 = this.method5715(arg0, 0);
			@Pc(32) int[][] local32 = this.method5715(arg0, 1);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt3049;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static339.anInt6549; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static339.anInt6549; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static339.anInt6549; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(267) int local267;
				@Pc(275) int local275;
				@Pc(271) int local271;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static339.anInt6549; local71++) {
						local267 = local60[local71];
						local271 = local68[local71];
						local275 = local64[local71];
						local36[local71] = local267 == 0 ? 4096 : (local48[local71] << 12) / local267;
						local40[local71] = local275 == 0 ? 4096 : (local52[local71] << 12) / local275;
						local44[local71] = local271 == 0 ? 4096 : (local56[local71] << 12) / local271;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static339.anInt6549; local71++) {
						local36[local71] = 4096 - ((4096 - local60[local71]) * (-local48[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (4096 - local64[local71]) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static339.anInt6549; local71++) {
						local271 = local68[local71];
						local267 = local60[local71];
						local275 = local64[local71];
						local36[local71] = local267 >= 2048 ? 4096 - ((4096 - local267) * (4096 - local48[local71]) >> 11) : local267 * local48[local71] >> 11;
						local40[local71] = local275 < 2048 ? local52[local71] * local275 >> 11 : 4096 - ((4096 - local52[local71]) * (-local275 + 4096) >> 11);
						local44[local71] = local271 < 2048 ? local56[local71] * local271 >> 11 : 4096 - ((4096 - local271) * (-local56[local71] + 4096) >> 11);
					}
				} else {
					@Pc(530) int local530;
					@Pc(522) int local522;
					@Pc(526) int local526;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static339.anInt6549; local71++) {
							local522 = local52[local71];
							local526 = local56[local71];
							local530 = local48[local71];
							local36[local71] = local530 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local530);
							local40[local71] = local522 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local522);
							local44[local71] = local526 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local526);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static339.anInt6549; local71++) {
							local530 = local48[local71];
							local526 = local56[local71];
							local522 = local52[local71];
							local36[local71] = local530 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local530;
							local40[local71] = local522 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local522;
							local44[local71] = local526 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local526;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static339.anInt6549; local71++) {
							local275 = local64[local71];
							local530 = local48[local71];
							local267 = local60[local71];
							local522 = local52[local71];
							local526 = local56[local71];
							local271 = local68[local71];
							local36[local71] = local267 > local530 ? local530 : local267;
							local40[local71] = local522 >= local275 ? local275 : local522;
							local44[local71] = local526 < local271 ? local526 : local271;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static339.anInt6549; local71++) {
							local271 = local68[local71];
							local522 = local52[local71];
							local267 = local60[local71];
							local275 = local64[local71];
							local526 = local56[local71];
							local530 = local48[local71];
							local36[local71] = local267 < local530 ? local530 : local267;
							local40[local71] = local275 >= local522 ? local275 : local522;
							local44[local71] = local271 >= local526 ? local271 : local526;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static339.anInt6549; local71++) {
							local267 = local60[local71];
							local275 = local64[local71];
							local271 = local68[local71];
							local526 = local56[local71];
							local522 = local52[local71];
							local530 = local48[local71];
							local36[local71] = local530 > local267 ? local530 - local267 : local267 - local530;
							local40[local71] = local275 >= local522 ? local275 - local522 : local522 - local275;
							local44[local71] = local526 > local271 ? local526 - local271 : -local526 + local271;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static339.anInt6549; local71++) {
							local275 = local64[local71];
							local271 = local68[local71];
							local530 = local48[local71];
							local522 = local52[local71];
							local526 = local56[local71];
							local267 = local60[local71];
							local36[local71] = local267 + local530 - (local267 * local530 >> 11);
							local40[local71] = local275 + local522 - (local522 * local275 >> 11);
							local44[local71] = local271 + local526 - (local526 * local271 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
