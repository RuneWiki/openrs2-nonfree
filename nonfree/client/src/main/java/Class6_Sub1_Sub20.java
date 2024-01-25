import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class6_Sub1_Sub20 extends Class6_Sub1 {

	@OriginalMember(owner = "client!nca", name = "F", descriptor = "I")
	private int anInt6293 = 6;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub20() {
		super(2, false);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(26) int[] local26 = this.method8165(0, arg0);
			@Pc(32) int[] local32 = this.method8165(1, arg0);
			@Pc(35) int local35 = this.anInt6293;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static289.anInt5549; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static289.anInt5549; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static289.anInt5549; local35++) {
					local16[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(156) int local156;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static289.anInt5549; local35++) {
						local156 = local32[local35];
						local16[local35] = local156 == 0 ? 4096 : (local26[local35] << 12) / local156;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static289.anInt5549; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static289.anInt5549; local35++) {
						local156 = local32[local35];
						local16[local35] = local156 < 2048 ? local26[local35] * local156 >> 11 : 4096 - ((4096 - local156) * (-local26[local35] + 4096) >> 11);
					}
				} else {
					@Pc(266) int local266;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static289.anInt5549; local35++) {
							local266 = local26[local35];
							local16[local35] = local266 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local266);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static289.anInt5549; local35++) {
							local266 = local26[local35];
							local16[local35] = local266 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local266;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static289.anInt5549; local35++) {
							local156 = local32[local35];
							local266 = local26[local35];
							local16[local35] = local266 < local156 ? local266 : local156;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static289.anInt5549; local35++) {
							local156 = local32[local35];
							local266 = local26[local35];
							local16[local35] = local266 > local156 ? local266 : local156;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static289.anInt5549; local35++) {
							local266 = local26[local35];
							local156 = local32[local35];
							local16[local35] = local156 < local266 ? local266 - local156 : -local266 + local156;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static289.anInt5549; local35++) {
							local266 = local26[local35];
							local156 = local32[local35];
							local16[local35] = local156 + local266 - (local156 * local266 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(26) int[][] local26 = this.method8162(arg0, 0);
			@Pc(32) int[][] local32 = this.method8162(arg0, 1);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt6293;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static289.anInt5549; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static289.anInt5549; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static289.anInt5549; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(272) int local272;
				@Pc(264) int local264;
				@Pc(268) int local268;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static289.anInt5549; local71++) {
						local264 = local64[local71];
						local268 = local68[local71];
						local272 = local60[local71];
						local36[local71] = local272 == 0 ? 4096 : (local48[local71] << 12) / local272;
						local40[local71] = local264 == 0 ? 4096 : (local52[local71] << 12) / local264;
						local44[local71] = local268 == 0 ? 4096 : (local56[local71] << 12) / local268;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static289.anInt5549; local71++) {
						local36[local71] = 4096 - ((4096 - local60[local71]) * (-local48[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (4096 - local52[local71]) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (4096 - local56[local71]) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static289.anInt5549; local71++) {
						local268 = local68[local71];
						local264 = local64[local71];
						local272 = local60[local71];
						local36[local71] = local272 >= 2048 ? 4096 - ((4096 - local48[local71]) * (4096 - local272) >> 11) : local48[local71] * local272 >> 11;
						local40[local71] = local264 < 2048 ? local264 * local52[local71] >> 11 : 4096 - ((4096 - local264) * (-local52[local71] + 4096) >> 11);
						local44[local71] = local268 < 2048 ? local56[local71] * local268 >> 11 : 4096 - ((4096 - local56[local71]) * (4096 - local268) >> 11);
					}
				} else {
					@Pc(527) int local527;
					@Pc(531) int local531;
					@Pc(523) int local523;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static289.anInt5549; local71++) {
							local523 = local56[local71];
							local527 = local48[local71];
							local531 = local52[local71];
							local36[local71] = local527 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local527);
							local40[local71] = local531 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local531);
							local44[local71] = local523 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local523);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static289.anInt5549; local71++) {
							local523 = local56[local71];
							local527 = local48[local71];
							local531 = local52[local71];
							local36[local71] = local527 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local527;
							local40[local71] = local531 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local531;
							local44[local71] = local523 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local523;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static289.anInt5549; local71++) {
							local531 = local52[local71];
							local268 = local68[local71];
							local272 = local60[local71];
							local264 = local64[local71];
							local527 = local48[local71];
							local523 = local56[local71];
							local36[local71] = local272 <= local527 ? local272 : local527;
							local40[local71] = local264 <= local531 ? local264 : local531;
							local44[local71] = local523 >= local268 ? local268 : local523;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static289.anInt5549; local71++) {
							local268 = local68[local71];
							local527 = local48[local71];
							local523 = local56[local71];
							local264 = local64[local71];
							local272 = local60[local71];
							local531 = local52[local71];
							local36[local71] = local527 > local272 ? local527 : local272;
							local40[local71] = local264 < local531 ? local531 : local264;
							local44[local71] = local523 <= local268 ? local268 : local523;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static289.anInt5549; local71++) {
							local531 = local52[local71];
							local272 = local60[local71];
							local268 = local68[local71];
							local264 = local64[local71];
							local527 = local48[local71];
							local523 = local56[local71];
							local36[local71] = local527 <= local272 ? local272 - local527 : -local272 + local527;
							local40[local71] = local264 >= local531 ? local264 - local531 : -local264 + local531;
							local44[local71] = local268 >= local523 ? local268 - local523 : local523 - local268;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static289.anInt5549; local71++) {
							local527 = local48[local71];
							local264 = local64[local71];
							local531 = local52[local71];
							local272 = local60[local71];
							local523 = local56[local71];
							local268 = local68[local71];
							local36[local71] = local527 + local272 - (local272 * local527 >> 11);
							local40[local71] = local531 + local264 - (local531 * local264 >> 11);
							local44[local71] = local268 + local523 - (local523 * local268 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt6293 = arg1.method4966();
		} else if (arg0 == 1) {
			super.aBoolean719 = arg1.method4966() == 1;
		}
	}
}
