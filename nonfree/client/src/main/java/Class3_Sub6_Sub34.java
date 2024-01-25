import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class3_Sub6_Sub34 extends Class3_Sub6 {

	@OriginalMember(owner = "client!um", name = "N", descriptor = "I")
	private int anInt9533 = 6;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub34() {
		super(2, false);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9533 = arg0.method6814();
		} else if (arg1 == 1) {
			super.aBoolean720 = arg0.method6814() == 1;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(29) int[][] local29 = this.method8005(0, arg0);
			@Pc(35) int[][] local35 = this.method8005(1, arg0);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt9533;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static481.anInt8358; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static481.anInt8358; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static481.anInt8358; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(263) int local263;
				@Pc(267) int local267;
				@Pc(259) int local259;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static481.anInt8358; local74++) {
						local259 = local71[local74];
						local263 = local63[local74];
						local267 = local67[local74];
						local39[local74] = local263 == 0 ? 4096 : (local51[local74] << 12) / local263;
						local43[local74] = local267 == 0 ? 4096 : (local55[local74] << 12) / local267;
						local47[local74] = local259 == 0 ? 4096 : (local59[local74] << 12) / local259;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static481.anInt8358; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (-local51[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local71[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static481.anInt8358; local74++) {
						local267 = local67[local74];
						local263 = local63[local74];
						local259 = local71[local74];
						local39[local74] = local263 < 2048 ? local51[local74] * local263 >> 11 : 4096 - ((4096 - local263) * (-local51[local74] + 4096) >> 11);
						local43[local74] = local267 >= 2048 ? 4096 - ((4096 - local55[local74]) * (-local267 + 4096) >> 11) : local267 * local55[local74] >> 11;
						local47[local74] = local259 >= 2048 ? 4096 - ((4096 - local259) * (4096 - local59[local74]) >> 11) : local259 * local59[local74] >> 11;
					}
				} else {
					@Pc(525) int local525;
					@Pc(521) int local521;
					@Pc(529) int local529;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static481.anInt8358; local74++) {
							local521 = local55[local74];
							local525 = local51[local74];
							local529 = local59[local74];
							local39[local74] = local525 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local525);
							local43[local74] = local521 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local521);
							local47[local74] = local529 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local529);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static481.anInt8358; local74++) {
							local525 = local51[local74];
							local529 = local59[local74];
							local521 = local55[local74];
							local39[local74] = local525 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local525;
							local43[local74] = local521 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local521;
							local47[local74] = local529 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local529;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static481.anInt8358; local74++) {
							local259 = local71[local74];
							local521 = local55[local74];
							local529 = local59[local74];
							local263 = local63[local74];
							local525 = local51[local74];
							local267 = local67[local74];
							local39[local74] = local525 < local263 ? local525 : local263;
							local43[local74] = local521 < local267 ? local521 : local267;
							local47[local74] = local259 <= local529 ? local259 : local529;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static481.anInt8358; local74++) {
							local529 = local59[local74];
							local263 = local63[local74];
							local525 = local51[local74];
							local521 = local55[local74];
							local259 = local71[local74];
							local267 = local67[local74];
							local39[local74] = local263 >= local525 ? local263 : local525;
							local43[local74] = local267 >= local521 ? local267 : local521;
							local47[local74] = local259 < local529 ? local529 : local259;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static481.anInt8358; local74++) {
							local521 = local55[local74];
							local267 = local67[local74];
							local263 = local63[local74];
							local525 = local51[local74];
							local529 = local59[local74];
							local259 = local71[local74];
							local39[local74] = local263 >= local525 ? local263 - local525 : local525 - local263;
							local43[local74] = local521 > local267 ? local521 - local267 : local267 + -local521;
							local47[local74] = local259 >= local529 ? local259 - local529 : local529 - local259;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static481.anInt8358; local74++) {
							local263 = local63[local74];
							local525 = local51[local74];
							local521 = local55[local74];
							local267 = local67[local74];
							local259 = local71[local74];
							local529 = local59[local74];
							local39[local74] = local525 + local263 - (local525 * local263 >> 11);
							local43[local74] = local267 + local521 - (local521 * local267 >> 11);
							local47[local74] = local529 + local259 - (local529 * local259 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(26) int[] local26 = this.method8001(0, arg0);
			@Pc(32) int[] local32 = this.method8001(1, arg0);
			@Pc(35) int local35 = this.anInt9533;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static481.anInt8358; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static481.anInt8358; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static481.anInt8358; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(171) int local171;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static481.anInt8358; local35++) {
						local171 = local32[local35];
						local16[local35] = local171 == 0 ? 4096 : (local26[local35] << 12) / local171;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static481.anInt8358; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (4096 - local32[local35]) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static481.anInt8358; local35++) {
						local171 = local32[local35];
						local16[local35] = local171 < 2048 ? local171 * local26[local35] >> 11 : 4096 - ((4096 - local171) * (4096 - local26[local35]) >> 11);
					}
				} else {
					@Pc(276) int local276;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static481.anInt8358; local35++) {
							local276 = local26[local35];
							local16[local35] = local276 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local276);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static481.anInt8358; local35++) {
							local276 = local26[local35];
							local16[local35] = local276 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local276;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static481.anInt8358; local35++) {
							local276 = local26[local35];
							local171 = local32[local35];
							local16[local35] = local276 >= local171 ? local171 : local276;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static481.anInt8358; local35++) {
							local276 = local26[local35];
							local171 = local32[local35];
							local16[local35] = local171 >= local276 ? local171 : local276;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static481.anInt8358; local35++) {
							local276 = local26[local35];
							local171 = local32[local35];
							local16[local35] = local171 >= local276 ? local171 - local276 : -local171 + local276;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static481.anInt8358; local35++) {
							local171 = local32[local35];
							local276 = local26[local35];
							local16[local35] = local276 + local171 - (local171 * local276 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
