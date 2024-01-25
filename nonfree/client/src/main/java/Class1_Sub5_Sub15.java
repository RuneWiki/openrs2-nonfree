import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class1_Sub5_Sub15 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "[I")
	public static final int[] anIntArray335 = new int[16384];

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "[I")
	public static final int[] anIntArray333 = new int[16384];

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
	private int anInt3442 = 6;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray335[local9] = (int) (Math.sin((double) local9 * local7) * 32768.0D);
			anIntArray333[local9] = (int) (Math.cos(local7 * (double) local9) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub15() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3442 = arg0.method5720();
		} else if (arg1 == 1) {
			super.aBoolean552 = arg0.method5720() == 1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(29) int[][] local29 = this.method5807(arg0, 0);
			@Pc(35) int[][] local35 = this.method5807(arg0, 1);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt3442;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static75.anInt1566; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static75.anInt1566; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static75.anInt1566; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local67[local74] * local55[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(277) int local277;
				@Pc(273) int local273;
				@Pc(269) int local269;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static75.anInt1566; local74++) {
						local269 = local71[local74];
						local273 = local67[local74];
						local277 = local63[local74];
						local39[local74] = local277 == 0 ? 4096 : (local51[local74] << 12) / local277;
						local43[local74] = local273 == 0 ? 4096 : (local55[local74] << 12) / local273;
						local47[local74] = local269 == 0 ? 4096 : (local59[local74] << 12) / local269;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static75.anInt1566; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (-local51[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (-local59[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static75.anInt1566; local74++) {
						local277 = local63[local74];
						local273 = local67[local74];
						local269 = local71[local74];
						local39[local74] = local277 >= 2048 ? 4096 - ((4096 - local51[local74]) * (4096 - local277) >> 11) : local51[local74] * local277 >> 11;
						local43[local74] = local273 >= 2048 ? 4096 - ((4096 - local55[local74]) * (-local273 + 4096) >> 11) : local55[local74] * local273 >> 11;
						local47[local74] = local269 < 2048 ? local269 * local59[local74] >> 11 : 4096 - ((4096 - local59[local74]) * (-local269 + 4096) >> 11);
					}
				} else {
					@Pc(536) int local536;
					@Pc(532) int local532;
					@Pc(528) int local528;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static75.anInt1566; local74++) {
							local528 = local59[local74];
							local532 = local55[local74];
							local536 = local51[local74];
							local39[local74] = local536 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local536);
							local43[local74] = local532 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local532);
							local47[local74] = local528 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local528);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static75.anInt1566; local74++) {
							local536 = local51[local74];
							local528 = local59[local74];
							local532 = local55[local74];
							local39[local74] = local536 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local536;
							local43[local74] = local532 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local532;
							local47[local74] = local528 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local528;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static75.anInt1566; local74++) {
							local269 = local71[local74];
							local536 = local51[local74];
							local277 = local63[local74];
							local532 = local55[local74];
							local528 = local59[local74];
							local273 = local67[local74];
							local39[local74] = local277 > local536 ? local536 : local277;
							local43[local74] = local273 <= local532 ? local273 : local532;
							local47[local74] = local269 <= local528 ? local269 : local528;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static75.anInt1566; local74++) {
							local269 = local71[local74];
							local528 = local59[local74];
							local536 = local51[local74];
							local277 = local63[local74];
							local532 = local55[local74];
							local273 = local67[local74];
							local39[local74] = local536 <= local277 ? local277 : local536;
							local43[local74] = local532 <= local273 ? local273 : local532;
							local47[local74] = local528 > local269 ? local528 : local269;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static75.anInt1566; local74++) {
							local269 = local71[local74];
							local536 = local51[local74];
							local532 = local55[local74];
							local273 = local67[local74];
							local277 = local63[local74];
							local528 = local59[local74];
							local39[local74] = local277 >= local536 ? local277 - local536 : local536 + -local277;
							local43[local74] = local532 > local273 ? local532 - local273 : -local532 + local273;
							local47[local74] = local269 < local528 ? local528 - local269 : local269 - local528;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static75.anInt1566; local74++) {
							local273 = local67[local74];
							local528 = local59[local74];
							local536 = local51[local74];
							local532 = local55[local74];
							local277 = local63[local74];
							local269 = local71[local74];
							local39[local74] = local277 + local536 - (local277 * local536 >> 11);
							local43[local74] = local273 + local532 - (local273 * local532 >> 11);
							local47[local74] = local269 + local528 - (local528 * local269 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(25) int[] local25 = this.method5802(0, arg0);
			@Pc(31) int[] local31 = this.method5802(1, arg0);
			@Pc(34) int local34 = this.anInt3442;
			if (local34 == 1) {
				for (local34 = 0; local34 < Static75.anInt1566; local34++) {
					local15[local34] = local31[local34] + local25[local34];
				}
			} else if (local34 == 2) {
				for (local34 = 0; local34 < Static75.anInt1566; local34++) {
					local15[local34] = local25[local34] - local31[local34];
				}
			} else if (local34 == 3) {
				for (local34 = 0; local34 < Static75.anInt1566; local34++) {
					local15[local34] = local31[local34] * local25[local34] >> 12;
				}
			} else {
				@Pc(167) int local167;
				if (local34 == 4) {
					for (local34 = 0; local34 < Static75.anInt1566; local34++) {
						local167 = local31[local34];
						local15[local34] = local167 == 0 ? 4096 : (local25[local34] << 12) / local167;
					}
				} else if (local34 == 5) {
					for (local34 = 0; local34 < Static75.anInt1566; local34++) {
						local15[local34] = 4096 - ((4096 - local31[local34]) * (-local25[local34] + 4096) >> 12);
					}
				} else if (local34 == 6) {
					for (local34 = 0; local34 < Static75.anInt1566; local34++) {
						local167 = local31[local34];
						local15[local34] = local167 >= 2048 ? 4096 - ((4096 - local167) * (4096 - local25[local34]) >> 11) : local25[local34] * local167 >> 11;
					}
				} else {
					@Pc(280) int local280;
					if (local34 == 7) {
						for (local34 = 0; local34 < Static75.anInt1566; local34++) {
							local280 = local25[local34];
							local15[local34] = local280 == 4096 ? 4096 : (local31[local34] << 12) / (4096 - local280);
						}
					} else if (local34 == 8) {
						for (local34 = 0; local34 < Static75.anInt1566; local34++) {
							local280 = local25[local34];
							local15[local34] = local280 == 0 ? 0 : 4096 - (4096 - local31[local34] << 12) / local280;
						}
					} else if (local34 == 9) {
						for (local34 = 0; local34 < Static75.anInt1566; local34++) {
							local280 = local25[local34];
							local167 = local31[local34];
							local15[local34] = local167 > local280 ? local280 : local167;
						}
					} else if (local34 == 10) {
						for (local34 = 0; local34 < Static75.anInt1566; local34++) {
							local280 = local25[local34];
							local167 = local31[local34];
							local15[local34] = local167 >= local280 ? local167 : local280;
						}
					} else if (local34 == 11) {
						for (local34 = 0; local34 < Static75.anInt1566; local34++) {
							local167 = local31[local34];
							local280 = local25[local34];
							local15[local34] = local280 > local167 ? local280 - local167 : local167 - local280;
						}
					} else if (local34 == 12) {
						for (local34 = 0; local34 < Static75.anInt1566; local34++) {
							local280 = local25[local34];
							local167 = local31[local34];
							local15[local34] = local280 + local167 - (local280 * local167 >> 11);
						}
					}
				}
			}
		}
		return local15;
	}
}
