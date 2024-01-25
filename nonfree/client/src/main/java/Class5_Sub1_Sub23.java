import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class5_Sub1_Sub23 extends Class5_Sub1 {

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
	private int anInt3956 = 6;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub23() {
		super(2, false);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(28) int[] local28 = this.method5772(0, arg0);
			@Pc(34) int[] local34 = this.method5772(1, arg0);
			@Pc(37) int local37 = this.anInt3956;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static148.anInt2666; local37++) {
					local16[local37] = local28[local37] + local34[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static148.anInt2666; local37++) {
					local16[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static148.anInt2666; local37++) {
					local16[local37] = local34[local37] * local28[local37] >> 12;
				}
			} else {
				@Pc(155) int local155;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static148.anInt2666; local37++) {
						local155 = local34[local37];
						local16[local37] = local155 == 0 ? 4096 : (local28[local37] << 12) / local155;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static148.anInt2666; local37++) {
						local16[local37] = 4096 - ((4096 - local34[local37]) * (-local28[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static148.anInt2666; local37++) {
						local155 = local34[local37];
						local16[local37] = local155 < 2048 ? local28[local37] * local155 >> 11 : 4096 - ((4096 - local28[local37]) * (-local155 + 4096) >> 11);
					}
				} else {
					@Pc(260) int local260;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static148.anInt2666; local37++) {
							local260 = local28[local37];
							local16[local37] = local260 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local260);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static148.anInt2666; local37++) {
							local260 = local28[local37];
							local16[local37] = local260 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local260;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static148.anInt2666; local37++) {
							local260 = local28[local37];
							local155 = local34[local37];
							local16[local37] = local155 > local260 ? local260 : local155;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static148.anInt2666; local37++) {
							local260 = local28[local37];
							local155 = local34[local37];
							local16[local37] = local260 <= local155 ? local155 : local260;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static148.anInt2666; local37++) {
							local155 = local34[local37];
							local260 = local28[local37];
							local16[local37] = local155 < local260 ? local260 - local155 : local155 + -local260;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static148.anInt2666; local37++) {
							local155 = local34[local37];
							local260 = local28[local37];
							local16[local37] = local155 + local260 - (local155 * local260 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3956 = arg1.method5539();
		} else if (arg0 == 1) {
			super.aBoolean486 = arg1.method5539() == 1;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(26) int[][] local26 = this.method5764(0, arg0);
			@Pc(32) int[][] local32 = this.method5764(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt3956;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static148.anInt2666; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static148.anInt2666; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static148.anInt2666; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(266) int local266;
				@Pc(262) int local262;
				@Pc(258) int local258;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static148.anInt2666; local71++) {
						local258 = local68[local71];
						local262 = local64[local71];
						local266 = local60[local71];
						local36[local71] = local266 == 0 ? 4096 : (local48[local71] << 12) / local266;
						local40[local71] = local262 == 0 ? 4096 : (local52[local71] << 12) / local262;
						local44[local71] = local258 == 0 ? 4096 : (local56[local71] << 12) / local258;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static148.anInt2666; local71++) {
						local36[local71] = 4096 - ((4096 - local60[local71]) * (-local48[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (4096 - local64[local71]) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (-local56[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static148.anInt2666; local71++) {
						local266 = local60[local71];
						local258 = local68[local71];
						local262 = local64[local71];
						local36[local71] = local266 < 2048 ? local266 * local48[local71] >> 11 : 4096 - ((4096 - local48[local71]) * (-local266 + 4096) >> 11);
						local40[local71] = local262 >= 2048 ? 4096 - ((4096 - local262) * (-local52[local71] + 4096) >> 11) : local52[local71] * local262 >> 11;
						local44[local71] = local258 >= 2048 ? 4096 - ((4096 - local258) * (-local56[local71] + 4096) >> 11) : local56[local71] * local258 >> 11;
					}
				} else {
					@Pc(517) int local517;
					@Pc(513) int local513;
					@Pc(521) int local521;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static148.anInt2666; local71++) {
							local513 = local52[local71];
							local517 = local48[local71];
							local521 = local56[local71];
							local36[local71] = local517 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local517);
							local40[local71] = local513 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local513);
							local44[local71] = local521 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local521);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static148.anInt2666; local71++) {
							local517 = local48[local71];
							local521 = local56[local71];
							local513 = local52[local71];
							local36[local71] = local517 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local517;
							local40[local71] = local513 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local513;
							local44[local71] = local521 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local521;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static148.anInt2666; local71++) {
							local262 = local64[local71];
							local258 = local68[local71];
							local521 = local56[local71];
							local513 = local52[local71];
							local517 = local48[local71];
							local266 = local60[local71];
							local36[local71] = local517 < local266 ? local517 : local266;
							local40[local71] = local262 <= local513 ? local262 : local513;
							local44[local71] = local258 <= local521 ? local258 : local521;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static148.anInt2666; local71++) {
							local262 = local64[local71];
							local521 = local56[local71];
							local517 = local48[local71];
							local258 = local68[local71];
							local266 = local60[local71];
							local513 = local52[local71];
							local36[local71] = local266 < local517 ? local517 : local266;
							local40[local71] = local262 < local513 ? local513 : local262;
							local44[local71] = local521 <= local258 ? local258 : local521;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static148.anInt2666; local71++) {
							local266 = local60[local71];
							local521 = local56[local71];
							local258 = local68[local71];
							local262 = local64[local71];
							local513 = local52[local71];
							local517 = local48[local71];
							local36[local71] = local266 < local517 ? local517 - local266 : local266 + -local517;
							local40[local71] = local513 > local262 ? local513 - local262 : local262 + -local513;
							local44[local71] = local521 > local258 ? local521 - local258 : -local521 + local258;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static148.anInt2666; local71++) {
							local266 = local60[local71];
							local513 = local52[local71];
							local262 = local64[local71];
							local521 = local56[local71];
							local517 = local48[local71];
							local258 = local68[local71];
							local36[local71] = local517 + local266 - (local266 * local517 >> 11);
							local40[local71] = local262 + local513 - (local262 * local513 >> 11);
							local44[local71] = local258 + local521 - (local258 * local521 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
