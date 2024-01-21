import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
	private int anInt729 = 6;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(2, false);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt729 = arg1.method1738();
		} else if (arg0 == 1) {
			super.aBoolean185 = arg1.method1738() == 1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(26) int[][] local26 = this.method3307(0, arg0);
			@Pc(32) int[][] local32 = this.method3307(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local26[1];
			@Pc(48) int[] local48 = local16[2];
			@Pc(52) int[] local52 = local26[0];
			@Pc(56) int[] local56 = local32[1];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[2];
			@Pc(68) int[] local68 = local26[2];
			@Pc(71) int local71 = this.anInt729;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static176.anInt3921; local71++) {
					local36[local71] = local52[local71] + local60[local71];
					local40[local71] = local44[local71] + local56[local71];
					local48[local71] = local68[local71] + local64[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static176.anInt3921; local71++) {
					local36[local71] = local52[local71] - local60[local71];
					local40[local71] = local44[local71] - local56[local71];
					local48[local71] = local68[local71] - local64[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static176.anInt3921; local71++) {
					local36[local71] = local52[local71] * local60[local71] >> 12;
					local40[local71] = local56[local71] * local44[local71] >> 12;
					local48[local71] = local64[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(260) int local260;
				@Pc(256) int local256;
				@Pc(264) int local264;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static176.anInt3921; local71++) {
						local256 = local56[local71];
						local260 = local60[local71];
						local264 = local64[local71];
						local36[local71] = local260 == 0 ? 4096 : (local52[local71] << 12) / local260;
						local40[local71] = local256 == 0 ? 4096 : (local44[local71] << 12) / local256;
						local48[local71] = local264 == 0 ? 4096 : (local68[local71] << 12) / local264;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static176.anInt3921; local71++) {
						local36[local71] = 4096 - ((4096 - local52[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local56[local71]) * (-local44[local71] + 4096) >> 12);
						local48[local71] = 4096 - ((4096 - local64[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static176.anInt3921; local71++) {
						local264 = local64[local71];
						local256 = local56[local71];
						local260 = local60[local71];
						local36[local71] = local260 >= 2048 ? 4096 - ((4096 - local260) * (4096 - local52[local71]) >> 11) : local260 * local52[local71] >> 11;
						local40[local71] = local256 >= 2048 ? 4096 - ((4096 - local44[local71]) * (-local256 + 4096) >> 11) : local256 * local44[local71] >> 11;
						local48[local71] = local264 < 2048 ? local264 * local68[local71] >> 11 : 4096 - ((4096 - local68[local71]) * (-local264 + 4096) >> 11);
					}
				} else {
					@Pc(517) int local517;
					@Pc(513) int local513;
					@Pc(521) int local521;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static176.anInt3921; local71++) {
							local513 = local44[local71];
							local517 = local52[local71];
							local521 = local68[local71];
							local36[local71] = local517 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local517);
							local40[local71] = local513 == 4096 ? 4096 : (local56[local71] << 12) / (4096 - local513);
							local48[local71] = local521 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local521);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static176.anInt3921; local71++) {
							local513 = local44[local71];
							local517 = local52[local71];
							local521 = local68[local71];
							local36[local71] = local517 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local517;
							local40[local71] = local513 == 0 ? 0 : 4096 - (4096 - local56[local71] << 12) / local513;
							local48[local71] = local521 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local521;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static176.anInt3921; local71++) {
							local256 = local56[local71];
							local260 = local60[local71];
							local517 = local52[local71];
							local521 = local68[local71];
							local513 = local44[local71];
							local264 = local64[local71];
							local36[local71] = local260 > local517 ? local517 : local260;
							local40[local71] = local256 <= local513 ? local256 : local513;
							local48[local71] = local521 >= local264 ? local264 : local521;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static176.anInt3921; local71++) {
							local521 = local68[local71];
							local260 = local60[local71];
							local256 = local56[local71];
							local264 = local64[local71];
							local517 = local52[local71];
							local513 = local44[local71];
							local36[local71] = local517 > local260 ? local517 : local260;
							local40[local71] = local256 >= local513 ? local256 : local513;
							local48[local71] = local521 > local264 ? local521 : local264;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static176.anInt3921; local71++) {
							local256 = local56[local71];
							local517 = local52[local71];
							local513 = local44[local71];
							local264 = local64[local71];
							local521 = local68[local71];
							local260 = local60[local71];
							local36[local71] = local517 > local260 ? local517 - local260 : local260 - local517;
							local40[local71] = local256 < local513 ? local513 - local256 : local256 - local513;
							local48[local71] = local264 >= local521 ? local264 - local521 : -local264 + local521;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static176.anInt3921; local71++) {
							local264 = local64[local71];
							local260 = local60[local71];
							local513 = local44[local71];
							local521 = local68[local71];
							local256 = local56[local71];
							local517 = local52[local71];
							local36[local71] = local260 + local517 - (local260 * local517 >> 11);
							local40[local71] = local513 + local256 - (local256 * local513 >> 11);
							local48[local71] = local264 + local521 - (local521 * local264 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(23) int[] local23 = this.method3303(arg0, 0);
			@Pc(29) int[] local29 = this.method3303(arg0, 1);
			@Pc(32) int local32 = this.anInt729;
			if (local32 == 1) {
				for (local32 = 0; local32 < Static176.anInt3921; local32++) {
					local11[local32] = local29[local32] + local23[local32];
				}
			} else if (local32 == 2) {
				for (local32 = 0; local32 < Static176.anInt3921; local32++) {
					local11[local32] = local23[local32] - local29[local32];
				}
			} else if (local32 == 3) {
				for (local32 = 0; local32 < Static176.anInt3921; local32++) {
					local11[local32] = local29[local32] * local23[local32] >> 12;
				}
			} else {
				@Pc(157) int local157;
				if (local32 == 4) {
					for (local32 = 0; local32 < Static176.anInt3921; local32++) {
						local157 = local29[local32];
						local11[local32] = local157 == 0 ? 4096 : (local23[local32] << 12) / local157;
					}
				} else if (local32 == 5) {
					for (local32 = 0; local32 < Static176.anInt3921; local32++) {
						local11[local32] = 4096 - ((4096 - local29[local32]) * (-local23[local32] + 4096) >> 12);
					}
				} else if (local32 == 6) {
					for (local32 = 0; local32 < Static176.anInt3921; local32++) {
						local157 = local29[local32];
						local11[local32] = local157 < 2048 ? local23[local32] * local157 >> 11 : 4096 - ((4096 - local23[local32]) * (-local157 + 4096) >> 11);
					}
				} else {
					@Pc(273) int local273;
					if (local32 == 7) {
						for (local32 = 0; local32 < Static176.anInt3921; local32++) {
							local273 = local23[local32];
							local11[local32] = local273 == 4096 ? 4096 : (local29[local32] << 12) / (4096 - local273);
						}
					} else if (local32 == 8) {
						for (local32 = 0; local32 < Static176.anInt3921; local32++) {
							local273 = local23[local32];
							local11[local32] = local273 == 0 ? 0 : 4096 - (4096 - local29[local32] << 12) / local273;
						}
					} else if (local32 == 9) {
						for (local32 = 0; local32 < Static176.anInt3921; local32++) {
							local273 = local23[local32];
							local157 = local29[local32];
							local11[local32] = local273 < local157 ? local273 : local157;
						}
					} else if (local32 == 10) {
						for (local32 = 0; local32 < Static176.anInt3921; local32++) {
							local157 = local29[local32];
							local273 = local23[local32];
							local11[local32] = local273 > local157 ? local273 : local157;
						}
					} else if (local32 == 11) {
						for (local32 = 0; local32 < Static176.anInt3921; local32++) {
							local273 = local23[local32];
							local157 = local29[local32];
							local11[local32] = local273 > local157 ? local273 - local157 : -local273 + local157;
						}
					} else if (local32 == 12) {
						for (local32 = 0; local32 < Static176.anInt3921; local32++) {
							local273 = local23[local32];
							local157 = local29[local32];
							local11[local32] = local157 + local273 - (local157 * local273 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
