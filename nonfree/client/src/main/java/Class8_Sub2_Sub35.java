import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class8_Sub2_Sub35 extends Class8_Sub2 {

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
	private int anInt9754 = 6;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub35() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(26) int[] local26 = this.method8505(arg0, 0);
			@Pc(32) int[] local32 = this.method8505(arg0, 1);
			@Pc(35) int local35 = this.anInt9754;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static538.anInt9297; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static538.anInt9297; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static538.anInt9297; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(167) int local167;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static538.anInt9297; local35++) {
						local167 = local32[local35];
						local16[local35] = local167 == 0 ? 4096 : (local26[local35] << 12) / local167;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static538.anInt9297; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static538.anInt9297; local35++) {
						local167 = local32[local35];
						local16[local35] = local167 < 2048 ? local26[local35] * local167 >> 11 : 4096 - ((4096 - local26[local35]) * (-local167 + 4096) >> 11);
					}
				} else {
					@Pc(277) int local277;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static538.anInt9297; local35++) {
							local277 = local26[local35];
							local16[local35] = local277 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local277);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static538.anInt9297; local35++) {
							local277 = local26[local35];
							local16[local35] = local277 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local277;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static538.anInt9297; local35++) {
							local167 = local32[local35];
							local277 = local26[local35];
							local16[local35] = local277 >= local167 ? local167 : local277;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static538.anInt9297; local35++) {
							local277 = local26[local35];
							local167 = local32[local35];
							local16[local35] = local277 > local167 ? local277 : local167;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static538.anInt9297; local35++) {
							local167 = local32[local35];
							local277 = local26[local35];
							local16[local35] = local167 < local277 ? local277 - local167 : local167 + -local277;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static538.anInt9297; local35++) {
							local167 = local32[local35];
							local277 = local26[local35];
							local16[local35] = local167 + local277 - (local277 * local167 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt9754 = arg1.method8525();
		} else if (arg0 == 1) {
			super.aBoolean753 = arg1.method8525() == 1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(21) int[][] local21 = this.method8510(0, arg0);
			@Pc(27) int[][] local27 = this.method8510(1, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt9754;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static538.anInt9297; local66++) {
					local31[local66] = local43[local66] + local55[local66];
					local35[local66] = local59[local66] + local47[local66];
					local39[local66] = local51[local66] + local63[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static538.anInt9297; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static538.anInt9297; local66++) {
					local31[local66] = local43[local66] * local55[local66] >> 12;
					local35[local66] = local47[local66] * local59[local66] >> 12;
					local39[local66] = local51[local66] * local63[local66] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(266) int local266;
				@Pc(274) int local274;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static538.anInt9297; local66++) {
						local266 = local59[local66];
						local270 = local55[local66];
						local274 = local63[local66];
						local31[local66] = local270 == 0 ? 4096 : (local43[local66] << 12) / local270;
						local35[local66] = local266 == 0 ? 4096 : (local47[local66] << 12) / local266;
						local39[local66] = local274 == 0 ? 4096 : (local51[local66] << 12) / local274;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static538.anInt9297; local66++) {
						local31[local66] = 4096 - ((4096 - local43[local66]) * (-local55[local66] + 4096) >> 12);
						local35[local66] = 4096 - ((4096 - local59[local66]) * (-local47[local66] + 4096) >> 12);
						local39[local66] = 4096 - ((4096 - local51[local66]) * (-local63[local66] + 4096) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static538.anInt9297; local66++) {
						local274 = local63[local66];
						local266 = local59[local66];
						local270 = local55[local66];
						local31[local66] = local270 < 2048 ? local43[local66] * local270 >> 11 : 4096 - ((4096 - local43[local66]) * (-local270 + 4096) >> 11);
						local35[local66] = local266 >= 2048 ? 4096 - ((4096 - local266) * (4096 - local47[local66]) >> 11) : local47[local66] * local266 >> 11;
						local39[local66] = local274 < 2048 ? local51[local66] * local274 >> 11 : 4096 - ((4096 - local274) * (-local51[local66] + 4096) >> 11);
					}
				} else {
					@Pc(527) int local527;
					@Pc(519) int local519;
					@Pc(523) int local523;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static538.anInt9297; local66++) {
							local519 = local47[local66];
							local523 = local51[local66];
							local527 = local43[local66];
							local31[local66] = local527 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local527);
							local35[local66] = local519 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local519);
							local39[local66] = local523 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local523);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static538.anInt9297; local66++) {
							local527 = local43[local66];
							local519 = local47[local66];
							local523 = local51[local66];
							local31[local66] = local527 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local527;
							local35[local66] = local519 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local519;
							local39[local66] = local523 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local523;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static538.anInt9297; local66++) {
							local523 = local51[local66];
							local266 = local59[local66];
							local527 = local43[local66];
							local519 = local47[local66];
							local274 = local63[local66];
							local270 = local55[local66];
							local31[local66] = local527 < local270 ? local527 : local270;
							local35[local66] = local266 > local519 ? local519 : local266;
							local39[local66] = local523 < local274 ? local523 : local274;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static538.anInt9297; local66++) {
							local274 = local63[local66];
							local266 = local59[local66];
							local523 = local51[local66];
							local519 = local47[local66];
							local527 = local43[local66];
							local270 = local55[local66];
							local31[local66] = local527 <= local270 ? local270 : local527;
							local35[local66] = local266 < local519 ? local519 : local266;
							local39[local66] = local523 > local274 ? local523 : local274;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static538.anInt9297; local66++) {
							local527 = local43[local66];
							local519 = local47[local66];
							local266 = local59[local66];
							local270 = local55[local66];
							local523 = local51[local66];
							local274 = local63[local66];
							local31[local66] = local270 >= local527 ? local270 - local527 : -local270 + local527;
							local35[local66] = local519 > local266 ? local519 - local266 : -local519 + local266;
							local39[local66] = local274 >= local523 ? local274 - local523 : -local274 + local523;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static538.anInt9297; local66++) {
							local527 = local43[local66];
							local523 = local51[local66];
							local266 = local59[local66];
							local274 = local63[local66];
							local270 = local55[local66];
							local519 = local47[local66];
							local31[local66] = local527 + local270 - (local270 * local527 >> 11);
							local35[local66] = local266 + local519 - (local266 * local519 >> 11);
							local39[local66] = local274 + local523 - (local523 * local274 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
