import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class4_Sub4_Sub18 extends Class4_Sub4 {

	@OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
	private int anInt4912 = 6;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub18() {
		super(2, false);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(26) int[] local26 = this.method7890(0, arg0);
			@Pc(32) int[] local32 = this.method7890(1, arg0);
			@Pc(35) int local35 = this.anInt4912;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static560.anInt9394; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static560.anInt9394; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static560.anInt9394; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(168) int local168;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static560.anInt9394; local35++) {
						local168 = local32[local35];
						local16[local35] = local168 == 0 ? 4096 : (local26[local35] << 12) / local168;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static560.anInt9394; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static560.anInt9394; local35++) {
						local168 = local32[local35];
						local16[local35] = local168 >= 2048 ? 4096 - ((4096 - local26[local35]) * (-local168 + 4096) >> 11) : local26[local35] * local168 >> 11;
					}
				} else {
					@Pc(280) int local280;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static560.anInt9394; local35++) {
							local280 = local26[local35];
							local16[local35] = local280 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local280);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static560.anInt9394; local35++) {
							local280 = local26[local35];
							local16[local35] = local280 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local280;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static560.anInt9394; local35++) {
							local168 = local32[local35];
							local280 = local26[local35];
							local16[local35] = local280 < local168 ? local280 : local168;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static560.anInt9394; local35++) {
							local168 = local32[local35];
							local280 = local26[local35];
							local16[local35] = local168 < local280 ? local280 : local168;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static560.anInt9394; local35++) {
							local168 = local32[local35];
							local280 = local26[local35];
							local16[local35] = local280 <= local168 ? local168 - local280 : -local168 + local280;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static560.anInt9394; local35++) {
							local168 = local32[local35];
							local280 = local26[local35];
							local16[local35] = local280 + local168 - (local280 * local168 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(26) int[][] local26 = this.method7892(0, arg0);
			@Pc(32) int[][] local32 = this.method7892(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt4912;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static560.anInt9394; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static560.anInt9394; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static560.anInt9394; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(262) int local262;
				@Pc(266) int local266;
				@Pc(270) int local270;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static560.anInt9394; local71++) {
						local262 = local60[local71];
						local266 = local64[local71];
						local270 = local68[local71];
						local36[local71] = local262 == 0 ? 4096 : (local48[local71] << 12) / local262;
						local40[local71] = local266 == 0 ? 4096 : (local52[local71] << 12) / local266;
						local44[local71] = local270 == 0 ? 4096 : (local56[local71] << 12) / local270;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static560.anInt9394; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (4096 - local60[local71]) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (-local56[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static560.anInt9394; local71++) {
						local262 = local60[local71];
						local270 = local68[local71];
						local266 = local64[local71];
						local36[local71] = local262 >= 2048 ? 4096 - ((4096 - local48[local71]) * (-local262 + 4096) >> 11) : local48[local71] * local262 >> 11;
						local40[local71] = local266 < 2048 ? local266 * local52[local71] >> 11 : 4096 - ((4096 - local52[local71]) * (-local266 + 4096) >> 11);
						local44[local71] = local270 < 2048 ? local270 * local56[local71] >> 11 : 4096 - ((4096 - local270) * (-local56[local71] + 4096) >> 11);
					}
				} else {
					@Pc(524) int local524;
					@Pc(528) int local528;
					@Pc(520) int local520;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static560.anInt9394; local71++) {
							local520 = local56[local71];
							local524 = local48[local71];
							local528 = local52[local71];
							local36[local71] = local524 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local524);
							local40[local71] = local528 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local528);
							local44[local71] = local520 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local520);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static560.anInt9394; local71++) {
							local528 = local52[local71];
							local520 = local56[local71];
							local524 = local48[local71];
							local36[local71] = local524 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local524;
							local40[local71] = local528 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local528;
							local44[local71] = local520 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local520;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static560.anInt9394; local71++) {
							local266 = local64[local71];
							local262 = local60[local71];
							local524 = local48[local71];
							local528 = local52[local71];
							local270 = local68[local71];
							local520 = local56[local71];
							local36[local71] = local262 > local524 ? local524 : local262;
							local40[local71] = local528 >= local266 ? local266 : local528;
							local44[local71] = local520 < local270 ? local520 : local270;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static560.anInt9394; local71++) {
							local270 = local68[local71];
							local520 = local56[local71];
							local266 = local64[local71];
							local528 = local52[local71];
							local262 = local60[local71];
							local524 = local48[local71];
							local36[local71] = local524 <= local262 ? local262 : local524;
							local40[local71] = local266 >= local528 ? local266 : local528;
							local44[local71] = local520 > local270 ? local520 : local270;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static560.anInt9394; local71++) {
							local524 = local48[local71];
							local270 = local68[local71];
							local528 = local52[local71];
							local520 = local56[local71];
							local262 = local60[local71];
							local266 = local64[local71];
							local36[local71] = local262 >= local524 ? local262 - local524 : local524 - local262;
							local40[local71] = local266 >= local528 ? local266 - local528 : local528 - local266;
							local44[local71] = local520 <= local270 ? local270 - local520 : -local270 + local520;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static560.anInt9394; local71++) {
							local520 = local56[local71];
							local528 = local52[local71];
							local270 = local68[local71];
							local262 = local60[local71];
							local524 = local48[local71];
							local266 = local64[local71];
							local36[local71] = local262 + local524 - (local262 * local524 >> 11);
							local40[local71] = local528 + local266 - (local266 * local528 >> 11);
							local44[local71] = local270 + local520 - (local520 * local270 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4912 = arg1.method6015();
		} else if (arg0 == 1) {
			super.aBoolean679 = arg1.method6015() == 1;
		}
	}
}
