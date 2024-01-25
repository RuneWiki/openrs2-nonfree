import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class2_Sub10_Sub19 extends Class2_Sub10 {

	@OriginalMember(owner = "client!lia", name = "D", descriptor = "I")
	private int anInt5877 = 6;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub19() {
		super(2, false);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(21) int[][] local21 = this.method8408(arg0, 0);
			@Pc(27) int[][] local27 = this.method8408(arg0, 1);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt5877;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static93.anInt1862; local66++) {
					local31[local66] = local55[local66] + local43[local66];
					local35[local66] = local47[local66] + local59[local66];
					local39[local66] = local63[local66] + local51[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static93.anInt1862; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static93.anInt1862; local66++) {
					local31[local66] = local43[local66] * local55[local66] >> 12;
					local35[local66] = local59[local66] * local47[local66] >> 12;
					local39[local66] = local63[local66] * local51[local66] >> 12;
				}
			} else {
				@Pc(263) int local263;
				@Pc(267) int local267;
				@Pc(259) int local259;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static93.anInt1862; local66++) {
						local259 = local63[local66];
						local263 = local55[local66];
						local267 = local59[local66];
						local31[local66] = local263 == 0 ? 4096 : (local43[local66] << 12) / local263;
						local35[local66] = local267 == 0 ? 4096 : (local47[local66] << 12) / local267;
						local39[local66] = local259 == 0 ? 4096 : (local51[local66] << 12) / local259;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static93.anInt1862; local66++) {
						local31[local66] = 4096 - ((4096 - local43[local66]) * (-local55[local66] + 4096) >> 12);
						local35[local66] = 4096 - ((4096 - local59[local66]) * (-local47[local66] + 4096) >> 12);
						local39[local66] = 4096 - ((4096 - local63[local66]) * (-local51[local66] + 4096) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static93.anInt1862; local66++) {
						local263 = local55[local66];
						local259 = local63[local66];
						local267 = local59[local66];
						local31[local66] = local263 >= 2048 ? 4096 - ((4096 - local43[local66]) * (-local263 + 4096) >> 11) : local43[local66] * local263 >> 11;
						local35[local66] = local267 < 2048 ? local267 * local47[local66] >> 11 : 4096 - ((4096 - local47[local66]) * (-local267 + 4096) >> 11);
						local39[local66] = local259 >= 2048 ? 4096 - ((4096 - local51[local66]) * (-local259 + 4096) >> 11) : local259 * local51[local66] >> 11;
					}
				} else {
					@Pc(520) int local520;
					@Pc(524) int local524;
					@Pc(528) int local528;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static93.anInt1862; local66++) {
							local520 = local43[local66];
							local524 = local47[local66];
							local528 = local51[local66];
							local31[local66] = local520 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local520);
							local35[local66] = local524 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local524);
							local39[local66] = local528 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local528);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static93.anInt1862; local66++) {
							local524 = local47[local66];
							local520 = local43[local66];
							local528 = local51[local66];
							local31[local66] = local520 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local520;
							local35[local66] = local524 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local524;
							local39[local66] = local528 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local528;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static93.anInt1862; local66++) {
							local263 = local55[local66];
							local259 = local63[local66];
							local520 = local43[local66];
							local524 = local47[local66];
							local267 = local59[local66];
							local528 = local51[local66];
							local31[local66] = local520 >= local263 ? local263 : local520;
							local35[local66] = local267 > local524 ? local524 : local267;
							local39[local66] = local528 < local259 ? local528 : local259;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static93.anInt1862; local66++) {
							local524 = local47[local66];
							local528 = local51[local66];
							local520 = local43[local66];
							local259 = local63[local66];
							local267 = local59[local66];
							local263 = local55[local66];
							local31[local66] = local263 < local520 ? local520 : local263;
							local35[local66] = local267 < local524 ? local524 : local267;
							local39[local66] = local259 >= local528 ? local259 : local528;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static93.anInt1862; local66++) {
							local267 = local59[local66];
							local263 = local55[local66];
							local528 = local51[local66];
							local524 = local47[local66];
							local259 = local63[local66];
							local520 = local43[local66];
							local31[local66] = local263 < local520 ? local520 - local263 : -local520 + local263;
							local35[local66] = local524 <= local267 ? local267 - local524 : local524 + -local267;
							local39[local66] = local528 <= local259 ? local259 - local528 : -local259 + local528;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static93.anInt1862; local66++) {
							local524 = local47[local66];
							local528 = local51[local66];
							local263 = local55[local66];
							local259 = local63[local66];
							local520 = local43[local66];
							local267 = local59[local66];
							local31[local66] = local263 + local520 - (local263 * local520 >> 11);
							local35[local66] = local267 + local524 - (local524 * local267 >> 11);
							local39[local66] = local528 + local259 - (local528 * local259 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(26) int[] local26 = this.method8402(arg0, 0);
			@Pc(32) int[] local32 = this.method8402(arg0, 1);
			@Pc(35) int local35 = this.anInt5877;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static93.anInt1862; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static93.anInt1862; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static93.anInt1862; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(158) int local158;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static93.anInt1862; local35++) {
						local158 = local32[local35];
						local16[local35] = local158 == 0 ? 4096 : (local26[local35] << 12) / local158;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static93.anInt1862; local35++) {
						local16[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static93.anInt1862; local35++) {
						local158 = local32[local35];
						local16[local35] = local158 < 2048 ? local158 * local26[local35] >> 11 : 4096 - ((4096 - local158) * (-local26[local35] + 4096) >> 11);
					}
				} else {
					@Pc(273) int local273;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static93.anInt1862; local35++) {
							local273 = local26[local35];
							local16[local35] = local273 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local273);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static93.anInt1862; local35++) {
							local273 = local26[local35];
							local16[local35] = local273 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local273;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static93.anInt1862; local35++) {
							local158 = local32[local35];
							local273 = local26[local35];
							local16[local35] = local273 >= local158 ? local158 : local273;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static93.anInt1862; local35++) {
							local273 = local26[local35];
							local158 = local32[local35];
							local16[local35] = local273 <= local158 ? local158 : local273;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static93.anInt1862; local35++) {
							local273 = local26[local35];
							local158 = local32[local35];
							local16[local35] = local158 < local273 ? local273 - local158 : -local273 + local158;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static93.anInt1862; local35++) {
							local273 = local26[local35];
							local158 = local32[local35];
							local16[local35] = local158 + local273 - (local273 * local158 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5877 = arg0.method6904();
		} else if (arg1 == 1) {
			super.aBoolean741 = arg0.method6904() == 1;
		}
	}
}
