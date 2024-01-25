import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class6_Sub2_Sub14 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
	private int anInt2934 = 6;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub14() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2934 = arg0.method3111();
		} else if (arg1 == 1) {
			super.aBoolean488 = arg0.method3111() == 1;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(26) int[] local26 = this.method5858(0, arg0);
			@Pc(32) int[] local32 = this.method5858(1, arg0);
			@Pc(35) int local35 = this.anInt2934;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static185.anInt4925; local35++) {
					local11[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static185.anInt4925; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static185.anInt4925; local35++) {
					local11[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(163) int local163;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static185.anInt4925; local35++) {
						local163 = local32[local35];
						local11[local35] = local163 == 0 ? 4096 : (local26[local35] << 12) / local163;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static185.anInt4925; local35++) {
						local11[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static185.anInt4925; local35++) {
						local163 = local32[local35];
						local11[local35] = local163 < 2048 ? local163 * local26[local35] >> 11 : 4096 - ((4096 - local163) * (4096 - local26[local35]) >> 11);
					}
				} else {
					@Pc(276) int local276;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static185.anInt4925; local35++) {
							local276 = local26[local35];
							local11[local35] = local276 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local276);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static185.anInt4925; local35++) {
							local276 = local26[local35];
							local11[local35] = local276 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local276;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static185.anInt4925; local35++) {
							local163 = local32[local35];
							local276 = local26[local35];
							local11[local35] = local163 > local276 ? local276 : local163;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static185.anInt4925; local35++) {
							local163 = local32[local35];
							local276 = local26[local35];
							local11[local35] = local276 > local163 ? local276 : local163;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static185.anInt4925; local35++) {
							local276 = local26[local35];
							local163 = local32[local35];
							local11[local35] = local276 > local163 ? local276 - local163 : -local276 + local163;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static185.anInt4925; local35++) {
							local276 = local26[local35];
							local163 = local32[local35];
							local11[local35] = local163 + local276 - (local276 * local163 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(29) int[][] local29 = this.method5867(arg0, 0);
			@Pc(35) int[][] local35 = this.method5867(arg0, 1);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt2934;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static185.anInt4925; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local55[local74] + local67[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static185.anInt4925; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static185.anInt4925; local74++) {
					local39[local74] = local51[local74] * local63[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(262) int local262;
				@Pc(266) int local266;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static185.anInt4925; local74++) {
						local262 = local67[local74];
						local266 = local71[local74];
						local270 = local63[local74];
						local39[local74] = local270 == 0 ? 4096 : (local51[local74] << 12) / local270;
						local43[local74] = local262 == 0 ? 4096 : (local55[local74] << 12) / local262;
						local47[local74] = local266 == 0 ? 4096 : (local59[local74] << 12) / local266;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static185.anInt4925; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (4096 - local63[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (-local59[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static185.anInt4925; local74++) {
						local262 = local67[local74];
						local270 = local63[local74];
						local266 = local71[local74];
						local39[local74] = local270 < 2048 ? local270 * local51[local74] >> 11 : 4096 - ((4096 - local270) * (-local51[local74] + 4096) >> 11);
						local43[local74] = local262 < 2048 ? local262 * local55[local74] >> 11 : 4096 - ((4096 - local55[local74]) * (-local262 + 4096) >> 11);
						local47[local74] = local266 >= 2048 ? 4096 - ((4096 - local59[local74]) * (-local266 + 4096) >> 11) : local266 * local59[local74] >> 11;
					}
				} else {
					@Pc(518) int local518;
					@Pc(522) int local522;
					@Pc(526) int local526;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static185.anInt4925; local74++) {
							local518 = local51[local74];
							local522 = local55[local74];
							local526 = local59[local74];
							local39[local74] = local518 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local518);
							local43[local74] = local522 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local522);
							local47[local74] = local526 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local526);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static185.anInt4925; local74++) {
							local518 = local51[local74];
							local522 = local55[local74];
							local526 = local59[local74];
							local39[local74] = local518 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local518;
							local43[local74] = local522 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local522;
							local47[local74] = local526 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local526;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static185.anInt4925; local74++) {
							local518 = local51[local74];
							local526 = local59[local74];
							local270 = local63[local74];
							local262 = local67[local74];
							local522 = local55[local74];
							local266 = local71[local74];
							local39[local74] = local518 >= local270 ? local270 : local518;
							local43[local74] = local522 >= local262 ? local262 : local522;
							local47[local74] = local526 >= local266 ? local266 : local526;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static185.anInt4925; local74++) {
							local266 = local71[local74];
							local262 = local67[local74];
							local270 = local63[local74];
							local522 = local55[local74];
							local518 = local51[local74];
							local526 = local59[local74];
							local39[local74] = local270 < local518 ? local518 : local270;
							local43[local74] = local522 > local262 ? local522 : local262;
							local47[local74] = local526 > local266 ? local526 : local266;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static185.anInt4925; local74++) {
							local266 = local71[local74];
							local270 = local63[local74];
							local526 = local59[local74];
							local518 = local51[local74];
							local262 = local67[local74];
							local522 = local55[local74];
							local39[local74] = local270 < local518 ? local518 - local270 : local270 - local518;
							local43[local74] = local522 > local262 ? local522 - local262 : -local522 + local262;
							local47[local74] = local526 <= local266 ? local266 - local526 : -local266 + local526;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static185.anInt4925; local74++) {
							local518 = local51[local74];
							local522 = local55[local74];
							local270 = local63[local74];
							local266 = local71[local74];
							local526 = local59[local74];
							local262 = local67[local74];
							local39[local74] = local518 + local270 - (local270 * local518 >> 11);
							local43[local74] = local262 + local522 - (local262 * local522 >> 11);
							local47[local74] = local266 + local526 - (local266 * local526 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
