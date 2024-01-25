import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class3_Sub4_Sub21 extends Class3_Sub4 {

	@OriginalMember(owner = "client!le", name = "K", descriptor = "I")
	private int anInt3945 = 6;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub21() {
		super(2, false);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(29) int[][] local29 = this.method6138(arg0, 0);
			@Pc(35) int[][] local35 = this.method6138(arg0, 1);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt3945;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static148.anInt2687; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static148.anInt2687; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static148.anInt2687; local74++) {
					local39[local74] = local51[local74] * local63[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(271) int local271;
				@Pc(267) int local267;
				@Pc(275) int local275;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static148.anInt2687; local74++) {
						local267 = local67[local74];
						local271 = local63[local74];
						local275 = local71[local74];
						local39[local74] = local271 == 0 ? 4096 : (local51[local74] << 12) / local271;
						local43[local74] = local267 == 0 ? 4096 : (local55[local74] << 12) / local267;
						local47[local74] = local275 == 0 ? 4096 : (local59[local74] << 12) / local275;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static148.anInt2687; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (4096 - local51[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (4096 - local55[local74]) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local71[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static148.anInt2687; local74++) {
						local275 = local71[local74];
						local271 = local63[local74];
						local267 = local67[local74];
						local39[local74] = local271 < 2048 ? local271 * local51[local74] >> 11 : 4096 - ((4096 - local271) * (-local51[local74] + 4096) >> 11);
						local43[local74] = local267 < 2048 ? local267 * local55[local74] >> 11 : 4096 - ((4096 - local267) * (4096 - local55[local74]) >> 11);
						local47[local74] = local275 < 2048 ? local275 * local59[local74] >> 11 : 4096 - ((4096 - local59[local74]) * (4096 - local275) >> 11);
					}
				} else {
					@Pc(525) int local525;
					@Pc(529) int local529;
					@Pc(533) int local533;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static148.anInt2687; local74++) {
							local525 = local51[local74];
							local529 = local55[local74];
							local533 = local59[local74];
							local39[local74] = local525 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local525);
							local43[local74] = local529 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local529);
							local47[local74] = local533 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local533);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static148.anInt2687; local74++) {
							local529 = local55[local74];
							local533 = local59[local74];
							local525 = local51[local74];
							local39[local74] = local525 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local525;
							local43[local74] = local529 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local529;
							local47[local74] = local533 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local533;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static148.anInt2687; local74++) {
							local271 = local63[local74];
							local267 = local67[local74];
							local275 = local71[local74];
							local525 = local51[local74];
							local533 = local59[local74];
							local529 = local55[local74];
							local39[local74] = local271 <= local525 ? local271 : local525;
							local43[local74] = local529 >= local267 ? local267 : local529;
							local47[local74] = local275 <= local533 ? local275 : local533;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static148.anInt2687; local74++) {
							local267 = local67[local74];
							local529 = local55[local74];
							local275 = local71[local74];
							local533 = local59[local74];
							local271 = local63[local74];
							local525 = local51[local74];
							local39[local74] = local271 < local525 ? local525 : local271;
							local43[local74] = local529 > local267 ? local529 : local267;
							local47[local74] = local275 < local533 ? local533 : local275;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static148.anInt2687; local74++) {
							local533 = local59[local74];
							local271 = local63[local74];
							local267 = local67[local74];
							local529 = local55[local74];
							local275 = local71[local74];
							local525 = local51[local74];
							local39[local74] = local525 <= local271 ? local271 - local525 : -local271 + local525;
							local43[local74] = local529 > local267 ? local529 - local267 : -local529 + local267;
							local47[local74] = local275 >= local533 ? local275 - local533 : -local275 + local533;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static148.anInt2687; local74++) {
							local533 = local59[local74];
							local271 = local63[local74];
							local529 = local55[local74];
							local267 = local67[local74];
							local275 = local71[local74];
							local525 = local51[local74];
							local39[local74] = local525 + local271 - (local271 * local525 >> 11);
							local43[local74] = local529 + local267 - (local267 * local529 >> 11);
							local47[local74] = local275 + local533 - (local533 * local275 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(26) int[] local26 = this.method6139(0, arg0);
			@Pc(32) int[] local32 = this.method6139(1, arg0);
			@Pc(35) int local35 = this.anInt3945;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static148.anInt2687; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static148.anInt2687; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static148.anInt2687; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(165) int local165;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static148.anInt2687; local35++) {
						local165 = local32[local35];
						local16[local35] = local165 == 0 ? 4096 : (local26[local35] << 12) / local165;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static148.anInt2687; local35++) {
						local16[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static148.anInt2687; local35++) {
						local165 = local32[local35];
						local16[local35] = local165 >= 2048 ? 4096 - ((4096 - local26[local35]) * (-local165 + 4096) >> 11) : local26[local35] * local165 >> 11;
					}
				} else {
					@Pc(271) int local271;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static148.anInt2687; local35++) {
							local271 = local26[local35];
							local16[local35] = local271 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local271);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static148.anInt2687; local35++) {
							local271 = local26[local35];
							local16[local35] = local271 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local271;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static148.anInt2687; local35++) {
							local271 = local26[local35];
							local165 = local32[local35];
							local16[local35] = local165 <= local271 ? local165 : local271;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static148.anInt2687; local35++) {
							local165 = local32[local35];
							local271 = local26[local35];
							local16[local35] = local165 >= local271 ? local165 : local271;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static148.anInt2687; local35++) {
							local165 = local32[local35];
							local271 = local26[local35];
							local16[local35] = local271 > local165 ? local271 - local165 : -local271 + local165;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static148.anInt2687; local35++) {
							local165 = local32[local35];
							local271 = local26[local35];
							local16[local35] = local271 + local165 - (local165 * local271 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3945 = arg0.method4096();
		} else if (arg1 == 1) {
			super.aBoolean504 = arg0.method4096() == 1;
		}
	}
}
