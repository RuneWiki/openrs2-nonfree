import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kv", name = "G", descriptor = "I")
	private int anInt5187 = 6;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(2, false);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(26) int[] local26 = this.method7836(arg0, 0);
			@Pc(32) int[] local32 = this.method7836(arg0, 1);
			@Pc(35) int local35 = this.anInt5187;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static501.anInt8748; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static501.anInt8748; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static501.anInt8748; local35++) {
					local16[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(156) int local156;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static501.anInt8748; local35++) {
						local156 = local32[local35];
						local16[local35] = local156 == 0 ? 4096 : (local26[local35] << 12) / local156;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static501.anInt8748; local35++) {
						local16[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static501.anInt8748; local35++) {
						local156 = local32[local35];
						local16[local35] = local156 < 2048 ? local156 * local26[local35] >> 11 : 4096 - ((4096 - local26[local35]) * (4096 - local156) >> 11);
					}
				} else {
					@Pc(268) int local268;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static501.anInt8748; local35++) {
							local268 = local26[local35];
							local16[local35] = local268 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local268);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static501.anInt8748; local35++) {
							local268 = local26[local35];
							local16[local35] = local268 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local268;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static501.anInt8748; local35++) {
							local268 = local26[local35];
							local156 = local32[local35];
							local16[local35] = local156 > local268 ? local268 : local156;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static501.anInt8748; local35++) {
							local156 = local32[local35];
							local268 = local26[local35];
							local16[local35] = local156 >= local268 ? local156 : local268;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static501.anInt8748; local35++) {
							local156 = local32[local35];
							local268 = local26[local35];
							local16[local35] = local156 < local268 ? local268 - local156 : local156 - local268;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static501.anInt8748; local35++) {
							local268 = local26[local35];
							local156 = local32[local35];
							local16[local35] = local156 + local268 - (local156 * local268 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(26) int[][] local26 = this.method7833(0, arg0);
			@Pc(32) int[][] local32 = this.method7833(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt5187;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static501.anInt8748; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static501.anInt8748; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static501.anInt8748; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(266) int local266;
				@Pc(262) int local262;
				@Pc(270) int local270;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static501.anInt8748; local71++) {
						local262 = local64[local71];
						local266 = local60[local71];
						local270 = local68[local71];
						local36[local71] = local266 == 0 ? 4096 : (local48[local71] << 12) / local266;
						local40[local71] = local262 == 0 ? 4096 : (local52[local71] << 12) / local262;
						local44[local71] = local270 == 0 ? 4096 : (local56[local71] << 12) / local270;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static501.anInt8748; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static501.anInt8748; local71++) {
						local270 = local68[local71];
						local266 = local60[local71];
						local262 = local64[local71];
						local36[local71] = local266 >= 2048 ? 4096 - ((4096 - local48[local71]) * (4096 - local266) >> 11) : local266 * local48[local71] >> 11;
						local40[local71] = local262 >= 2048 ? 4096 - ((4096 - local262) * (4096 - local52[local71]) >> 11) : local262 * local52[local71] >> 11;
						local44[local71] = local270 < 2048 ? local270 * local56[local71] >> 11 : 4096 - ((4096 - local56[local71]) * (-local270 + 4096) >> 11);
					}
				} else {
					@Pc(519) int local519;
					@Pc(523) int local523;
					@Pc(527) int local527;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static501.anInt8748; local71++) {
							local519 = local48[local71];
							local523 = local52[local71];
							local527 = local56[local71];
							local36[local71] = local519 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local519);
							local40[local71] = local523 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local523);
							local44[local71] = local527 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local527);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static501.anInt8748; local71++) {
							local527 = local56[local71];
							local523 = local52[local71];
							local519 = local48[local71];
							local36[local71] = local519 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local519;
							local40[local71] = local523 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local523;
							local44[local71] = local527 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local527;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static501.anInt8748; local71++) {
							local527 = local56[local71];
							local262 = local64[local71];
							local519 = local48[local71];
							local270 = local68[local71];
							local523 = local52[local71];
							local266 = local60[local71];
							local36[local71] = local519 < local266 ? local519 : local266;
							local40[local71] = local523 >= local262 ? local262 : local523;
							local44[local71] = local527 < local270 ? local527 : local270;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static501.anInt8748; local71++) {
							local519 = local48[local71];
							local523 = local52[local71];
							local527 = local56[local71];
							local262 = local64[local71];
							local266 = local60[local71];
							local270 = local68[local71];
							local36[local71] = local519 <= local266 ? local266 : local519;
							local40[local71] = local523 > local262 ? local523 : local262;
							local44[local71] = local527 <= local270 ? local270 : local527;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static501.anInt8748; local71++) {
							local527 = local56[local71];
							local519 = local48[local71];
							local266 = local60[local71];
							local270 = local68[local71];
							local262 = local64[local71];
							local523 = local52[local71];
							local36[local71] = local519 <= local266 ? local266 - local519 : -local266 + local519;
							local40[local71] = local262 >= local523 ? local262 - local523 : -local262 + local523;
							local44[local71] = local527 <= local270 ? local270 - local527 : -local270 + local527;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static501.anInt8748; local71++) {
							local262 = local64[local71];
							local527 = local56[local71];
							local519 = local48[local71];
							local270 = local68[local71];
							local266 = local60[local71];
							local523 = local52[local71];
							local36[local71] = local266 + local519 - (local266 * local519 >> 11);
							local40[local71] = local523 + local262 - (local262 * local523 >> 11);
							local44[local71] = local270 + local527 - (local527 * local270 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt5187 = arg1.method7974();
		} else if (arg0 == 1) {
			super.aBoolean711 = arg1.method7974() == 1;
		}
	}
}
