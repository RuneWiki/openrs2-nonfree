import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
	private int anInt2824 = 6;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(2, false);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(26) int[] local26 = this.method3580(arg0, 0);
			@Pc(32) int[] local32 = this.method3580(arg0, 1);
			@Pc(35) int local35 = this.anInt2824;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static115.anInt2578; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static115.anInt2578; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static115.anInt2578; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(164) int local164;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static115.anInt2578; local35++) {
						local164 = local32[local35];
						local16[local35] = local164 == 0 ? 4096 : (local26[local35] << 12) / local164;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static115.anInt2578; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static115.anInt2578; local35++) {
						local164 = local32[local35];
						local16[local35] = local164 >= 2048 ? 4096 - ((4096 - local164) * (-local26[local35] + 4096) >> 11) : local26[local35] * local164 >> 11;
					}
				} else {
					@Pc(275) int local275;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static115.anInt2578; local35++) {
							local275 = local26[local35];
							local16[local35] = local275 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local275);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static115.anInt2578; local35++) {
							local275 = local26[local35];
							local16[local35] = local275 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local275;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static115.anInt2578; local35++) {
							local164 = local32[local35];
							local275 = local26[local35];
							local16[local35] = local275 >= local164 ? local164 : local275;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static115.anInt2578; local35++) {
							local164 = local32[local35];
							local275 = local26[local35];
							local16[local35] = local275 > local164 ? local275 : local164;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static115.anInt2578; local35++) {
							local275 = local26[local35];
							local164 = local32[local35];
							local16[local35] = local275 > local164 ? local275 - local164 : -local275 + local164;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static115.anInt2578; local35++) {
							local275 = local26[local35];
							local164 = local32[local35];
							local16[local35] = local164 + local275 - (local164 * local275 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2824 = arg0.method2771();
		} else if (arg1 == 1) {
			super.aBoolean231 = arg0.method2771() == 1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(29) int[][] local29 = this.method3579(arg0, 0);
			@Pc(35) int[][] local35 = this.method3579(arg0, 1);
			@Pc(39) int[] local39 = local19[1];
			@Pc(43) int[] local43 = local19[0];
			@Pc(47) int[] local47 = local29[0];
			@Pc(51) int[] local51 = local19[2];
			@Pc(55) int[] local55 = local29[2];
			@Pc(59) int[] local59 = local35[0];
			@Pc(63) int[] local63 = local29[1];
			@Pc(67) int[] local67 = local35[2];
			@Pc(71) int[] local71 = local35[1];
			@Pc(74) int local74 = this.anInt2824;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static115.anInt2578; local74++) {
					local43[local74] = local59[local74] + local47[local74];
					local39[local74] = local63[local74] + local71[local74];
					local51[local74] = local67[local74] + local55[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static115.anInt2578; local74++) {
					local43[local74] = local47[local74] - local59[local74];
					local39[local74] = local63[local74] - local71[local74];
					local51[local74] = local55[local74] - local67[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static115.anInt2578; local74++) {
					local43[local74] = local47[local74] * local59[local74] >> 12;
					local39[local74] = local71[local74] * local63[local74] >> 12;
					local51[local74] = local67[local74] * local55[local74] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(262) int local262;
				@Pc(266) int local266;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static115.anInt2578; local74++) {
						local262 = local71[local74];
						local266 = local67[local74];
						local270 = local59[local74];
						local43[local74] = local270 == 0 ? 4096 : (local47[local74] << 12) / local270;
						local39[local74] = local262 == 0 ? 4096 : (local63[local74] << 12) / local262;
						local51[local74] = local266 == 0 ? 4096 : (local55[local74] << 12) / local266;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static115.anInt2578; local74++) {
						local43[local74] = 4096 - ((4096 - local59[local74]) * (-local47[local74] + 4096) >> 12);
						local39[local74] = 4096 - ((4096 - local63[local74]) * (4096 - local71[local74]) >> 12);
						local51[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static115.anInt2578; local74++) {
						local266 = local67[local74];
						local262 = local71[local74];
						local270 = local59[local74];
						local43[local74] = local270 >= 2048 ? 4096 - ((4096 - local270) * (-local47[local74] + 4096) >> 11) : local47[local74] * local270 >> 11;
						local39[local74] = local262 < 2048 ? local262 * local63[local74] >> 11 : 4096 - ((4096 - local262) * (-local63[local74] + 4096) >> 11);
						local51[local74] = local266 < 2048 ? local266 * local55[local74] >> 11 : 4096 - ((4096 - local55[local74]) * (-local266 + 4096) >> 11);
					}
				} else {
					@Pc(529) int local529;
					@Pc(521) int local521;
					@Pc(525) int local525;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static115.anInt2578; local74++) {
							local521 = local63[local74];
							local525 = local55[local74];
							local529 = local47[local74];
							local43[local74] = local529 == 4096 ? 4096 : (local59[local74] << 12) / (4096 - local529);
							local39[local74] = local521 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local521);
							local51[local74] = local525 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local525);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static115.anInt2578; local74++) {
							local525 = local55[local74];
							local521 = local63[local74];
							local529 = local47[local74];
							local43[local74] = local529 == 0 ? 0 : 4096 - (4096 - local59[local74] << 12) / local529;
							local39[local74] = local521 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local521;
							local51[local74] = local525 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local525;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static115.anInt2578; local74++) {
							local525 = local55[local74];
							local529 = local47[local74];
							local266 = local67[local74];
							local270 = local59[local74];
							local262 = local71[local74];
							local521 = local63[local74];
							local43[local74] = local529 < local270 ? local529 : local270;
							local39[local74] = local262 > local521 ? local521 : local262;
							local51[local74] = local525 < local266 ? local525 : local266;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static115.anInt2578; local74++) {
							local525 = local55[local74];
							local270 = local59[local74];
							local529 = local47[local74];
							local521 = local63[local74];
							local266 = local67[local74];
							local262 = local71[local74];
							local43[local74] = local270 >= local529 ? local270 : local529;
							local39[local74] = local262 >= local521 ? local262 : local521;
							local51[local74] = local525 <= local266 ? local266 : local525;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static115.anInt2578; local74++) {
							local529 = local47[local74];
							local521 = local63[local74];
							local266 = local67[local74];
							local262 = local71[local74];
							local270 = local59[local74];
							local525 = local55[local74];
							local43[local74] = local529 > local270 ? local529 - local270 : -local529 + local270;
							local39[local74] = local262 >= local521 ? local262 - local521 : local521 + -local262;
							local51[local74] = local266 >= local525 ? local266 - local525 : -local266 + local525;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static115.anInt2578; local74++) {
							local266 = local67[local74];
							local262 = local71[local74];
							local525 = local55[local74];
							local521 = local63[local74];
							local529 = local47[local74];
							local270 = local59[local74];
							local43[local74] = local529 + local270 - (local529 * local270 >> 11);
							local39[local74] = local262 + local521 - (local521 * local262 >> 11);
							local51[local74] = local525 + local266 - (local266 * local525 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
