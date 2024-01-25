import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class5_Sub3_Sub22 extends Class5_Sub3 {

	@OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
	private int anInt3967 = 6;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub22() {
		super(2, false);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(29) int[] local29 = this.method6020(0, arg0);
			@Pc(35) int[] local35 = this.method6020(1, arg0);
			@Pc(38) int local38 = this.anInt3967;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static7.anInt129; local38++) {
					local11[local38] = local29[local38] + local35[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static7.anInt129; local38++) {
					local11[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static7.anInt129; local38++) {
					local11[local38] = local29[local38] * local35[local38] >> 12;
				}
			} else {
				@Pc(158) int local158;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static7.anInt129; local38++) {
						local158 = local35[local38];
						local11[local38] = local158 == 0 ? 4096 : (local29[local38] << 12) / local158;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static7.anInt129; local38++) {
						local11[local38] = 4096 - ((4096 - local29[local38]) * (-local35[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static7.anInt129; local38++) {
						local158 = local35[local38];
						local11[local38] = local158 < 2048 ? local29[local38] * local158 >> 11 : 4096 - ((4096 - local29[local38]) * (-local158 + 4096) >> 11);
					}
				} else {
					@Pc(272) int local272;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static7.anInt129; local38++) {
							local272 = local29[local38];
							local11[local38] = local272 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local272);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static7.anInt129; local38++) {
							local272 = local29[local38];
							local11[local38] = local272 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local272;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static7.anInt129; local38++) {
							local158 = local35[local38];
							local272 = local29[local38];
							local11[local38] = local272 < local158 ? local272 : local158;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static7.anInt129; local38++) {
							local158 = local35[local38];
							local272 = local29[local38];
							local11[local38] = local272 > local158 ? local272 : local158;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static7.anInt129; local38++) {
							local158 = local35[local38];
							local272 = local29[local38];
							local11[local38] = local272 <= local158 ? local158 - local272 : -local158 + local272;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static7.anInt129; local38++) {
							local158 = local35[local38];
							local272 = local29[local38];
							local11[local38] = local272 + local158 - (local272 * local158 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(21) int[][] local21 = this.method6023(0, arg0);
			@Pc(27) int[][] local27 = this.method6023(1, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt3967;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static7.anInt129; local66++) {
					local31[local66] = local43[local66] + local55[local66];
					local35[local66] = local59[local66] + local47[local66];
					local39[local66] = local51[local66] + local63[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static7.anInt129; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static7.anInt129; local66++) {
					local31[local66] = local55[local66] * local43[local66] >> 12;
					local35[local66] = local47[local66] * local59[local66] >> 12;
					local39[local66] = local51[local66] * local63[local66] >> 12;
				}
			} else {
				@Pc(262) int local262;
				@Pc(258) int local258;
				@Pc(266) int local266;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static7.anInt129; local66++) {
						local258 = local59[local66];
						local262 = local55[local66];
						local266 = local63[local66];
						local31[local66] = local262 == 0 ? 4096 : (local43[local66] << 12) / local262;
						local35[local66] = local258 == 0 ? 4096 : (local47[local66] << 12) / local258;
						local39[local66] = local266 == 0 ? 4096 : (local51[local66] << 12) / local266;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static7.anInt129; local66++) {
						local31[local66] = 4096 - ((4096 - local43[local66]) * (-local55[local66] + 4096) >> 12);
						local35[local66] = 4096 - ((4096 - local59[local66]) * (4096 - local47[local66]) >> 12);
						local39[local66] = 4096 - ((4096 - local63[local66]) * (-local51[local66] + 4096) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static7.anInt129; local66++) {
						local262 = local55[local66];
						local266 = local63[local66];
						local258 = local59[local66];
						local31[local66] = local262 >= 2048 ? 4096 - ((4096 - local262) * (-local43[local66] + 4096) >> 11) : local43[local66] * local262 >> 11;
						local35[local66] = local258 < 2048 ? local258 * local47[local66] >> 11 : 4096 - ((4096 - local258) * (-local47[local66] + 4096) >> 11);
						local39[local66] = local266 < 2048 ? local51[local66] * local266 >> 11 : 4096 - ((4096 - local266) * (-local51[local66] + 4096) >> 11);
					}
				} else {
					@Pc(529) int local529;
					@Pc(521) int local521;
					@Pc(525) int local525;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static7.anInt129; local66++) {
							local521 = local47[local66];
							local525 = local51[local66];
							local529 = local43[local66];
							local31[local66] = local529 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local529);
							local35[local66] = local521 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local521);
							local39[local66] = local525 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local525);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static7.anInt129; local66++) {
							local529 = local43[local66];
							local521 = local47[local66];
							local525 = local51[local66];
							local31[local66] = local529 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local529;
							local35[local66] = local521 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local521;
							local39[local66] = local525 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local525;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static7.anInt129; local66++) {
							local262 = local55[local66];
							local525 = local51[local66];
							local266 = local63[local66];
							local521 = local47[local66];
							local258 = local59[local66];
							local529 = local43[local66];
							local31[local66] = local262 > local529 ? local529 : local262;
							local35[local66] = local258 <= local521 ? local258 : local521;
							local39[local66] = local525 < local266 ? local525 : local266;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static7.anInt129; local66++) {
							local529 = local43[local66];
							local525 = local51[local66];
							local258 = local59[local66];
							local521 = local47[local66];
							local266 = local63[local66];
							local262 = local55[local66];
							local31[local66] = local529 > local262 ? local529 : local262;
							local35[local66] = local258 >= local521 ? local258 : local521;
							local39[local66] = local266 >= local525 ? local266 : local525;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static7.anInt129; local66++) {
							local266 = local63[local66];
							local258 = local59[local66];
							local262 = local55[local66];
							local525 = local51[local66];
							local529 = local43[local66];
							local521 = local47[local66];
							local31[local66] = local262 < local529 ? local529 - local262 : -local529 + local262;
							local35[local66] = local258 < local521 ? local521 - local258 : local258 + -local521;
							local39[local66] = local266 >= local525 ? local266 - local525 : local525 + -local266;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static7.anInt129; local66++) {
							local521 = local47[local66];
							local258 = local59[local66];
							local525 = local51[local66];
							local262 = local55[local66];
							local266 = local63[local66];
							local529 = local43[local66];
							local31[local66] = local262 + local529 - (local529 * local262 >> 11);
							local35[local66] = local258 + local521 - (local521 * local258 >> 11);
							local39[local66] = local525 + local266 - (local266 * local525 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3967 = arg0.method5115();
		} else if (arg1 == 1) {
			super.aBoolean592 = arg0.method5115() == 1;
		}
	}
}
