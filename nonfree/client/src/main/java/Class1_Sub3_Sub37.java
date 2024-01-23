import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class1_Sub3_Sub37 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
	private int anInt5319 = 6;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub37() {
		super(2, false);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(25) int[][] local25 = this.method4129(0, arg0);
			@Pc(31) int[][] local31 = this.method4129(1, arg0);
			@Pc(35) int[] local35 = local15[2];
			@Pc(39) int[] local39 = local15[1];
			@Pc(43) int[] local43 = local25[1];
			@Pc(47) int[] local47 = local25[0];
			@Pc(51) int[] local51 = local25[2];
			@Pc(55) int[] local55 = local31[0];
			@Pc(59) int[] local59 = local15[0];
			@Pc(63) int[] local63 = local31[1];
			@Pc(67) int[] local67 = local31[2];
			@Pc(70) int local70 = this.anInt5319;
			if (local70 == 1) {
				for (local70 = 0; local70 < Static110.anInt2934; local70++) {
					local59[local70] = local47[local70] + local55[local70];
					local39[local70] = local43[local70] + local63[local70];
					local35[local70] = local51[local70] + local67[local70];
				}
			} else if (local70 == 2) {
				for (local70 = 0; local70 < Static110.anInt2934; local70++) {
					local59[local70] = local47[local70] - local55[local70];
					local39[local70] = local43[local70] - local63[local70];
					local35[local70] = local51[local70] - local67[local70];
				}
			} else if (local70 == 3) {
				for (local70 = 0; local70 < Static110.anInt2934; local70++) {
					local59[local70] = local47[local70] * local55[local70] >> 12;
					local39[local70] = local63[local70] * local43[local70] >> 12;
					local35[local70] = local51[local70] * local67[local70] >> 12;
				}
			} else {
				@Pc(275) int local275;
				@Pc(279) int local279;
				@Pc(271) int local271;
				if (local70 == 4) {
					for (local70 = 0; local70 < Static110.anInt2934; local70++) {
						local271 = local67[local70];
						local275 = local55[local70];
						local279 = local63[local70];
						local59[local70] = local275 == 0 ? 4096 : (local47[local70] << 12) / local275;
						local39[local70] = local279 == 0 ? 4096 : (local43[local70] << 12) / local279;
						local35[local70] = local271 == 0 ? 4096 : (local51[local70] << 12) / local271;
					}
				} else if (local70 == 5) {
					for (local70 = 0; local70 < Static110.anInt2934; local70++) {
						local59[local70] = 4096 - ((4096 - local47[local70]) * (-local55[local70] + 4096) >> 12);
						local39[local70] = 4096 - ((4096 - local43[local70]) * (-local63[local70] + 4096) >> 12);
						local35[local70] = 4096 - ((4096 - local67[local70]) * (4096 - local51[local70]) >> 12);
					}
				} else if (local70 == 6) {
					for (local70 = 0; local70 < Static110.anInt2934; local70++) {
						local275 = local55[local70];
						local271 = local67[local70];
						local279 = local63[local70];
						local59[local70] = local275 < 2048 ? local47[local70] * local275 >> 11 : 4096 - ((4096 - local275) * (4096 - local47[local70]) >> 11);
						local39[local70] = local279 < 2048 ? local279 * local43[local70] >> 11 : 4096 - ((4096 - local279) * (-local43[local70] + 4096) >> 11);
						local35[local70] = local271 < 2048 ? local271 * local51[local70] >> 11 : 4096 - ((4096 - local271) * (-local51[local70] + 4096) >> 11);
					}
				} else {
					@Pc(521) int local521;
					@Pc(529) int local529;
					@Pc(525) int local525;
					if (local70 == 7) {
						for (local70 = 0; local70 < Static110.anInt2934; local70++) {
							local521 = local47[local70];
							local525 = local51[local70];
							local529 = local43[local70];
							local59[local70] = local521 == 4096 ? 4096 : (local55[local70] << 12) / (4096 - local521);
							local39[local70] = local529 == 4096 ? 4096 : (local63[local70] << 12) / (4096 - local529);
							local35[local70] = local525 == 4096 ? 4096 : (local67[local70] << 12) / (4096 - local525);
						}
					} else if (local70 == 8) {
						for (local70 = 0; local70 < Static110.anInt2934; local70++) {
							local529 = local43[local70];
							local521 = local47[local70];
							local525 = local51[local70];
							local59[local70] = local521 == 0 ? 0 : 4096 - (4096 - local55[local70] << 12) / local521;
							local39[local70] = local529 == 0 ? 0 : 4096 - (4096 - local63[local70] << 12) / local529;
							local35[local70] = local525 == 0 ? 0 : 4096 - (4096 - local67[local70] << 12) / local525;
						}
					} else if (local70 == 9) {
						for (local70 = 0; local70 < Static110.anInt2934; local70++) {
							local279 = local63[local70];
							local271 = local67[local70];
							local275 = local55[local70];
							local521 = local47[local70];
							local529 = local43[local70];
							local525 = local51[local70];
							local59[local70] = local275 <= local521 ? local275 : local521;
							local39[local70] = local279 > local529 ? local529 : local279;
							local35[local70] = local271 > local525 ? local525 : local271;
						}
					} else if (local70 == 10) {
						for (local70 = 0; local70 < Static110.anInt2934; local70++) {
							local271 = local67[local70];
							local521 = local47[local70];
							local529 = local43[local70];
							local279 = local63[local70];
							local525 = local51[local70];
							local275 = local55[local70];
							local59[local70] = local521 > local275 ? local521 : local275;
							local39[local70] = local279 < local529 ? local529 : local279;
							local35[local70] = local271 >= local525 ? local271 : local525;
						}
					} else if (local70 == 11) {
						for (local70 = 0; local70 < Static110.anInt2934; local70++) {
							local279 = local63[local70];
							local529 = local43[local70];
							local521 = local47[local70];
							local271 = local67[local70];
							local525 = local51[local70];
							local275 = local55[local70];
							local59[local70] = local275 < local521 ? local521 - local275 : local275 - local521;
							local39[local70] = local279 < local529 ? local529 - local279 : -local529 + local279;
							local35[local70] = local525 > local271 ? local525 - local271 : local271 + -local525;
						}
					} else if (local70 == 12) {
						for (local70 = 0; local70 < Static110.anInt2934; local70++) {
							local271 = local67[local70];
							local275 = local55[local70];
							local279 = local63[local70];
							local525 = local51[local70];
							local521 = local47[local70];
							local529 = local43[local70];
							local59[local70] = local275 + local521 - (local521 * local275 >> 11);
							local39[local70] = local529 + local279 - (local279 * local529 >> 11);
							local35[local70] = local271 + local525 - (local525 * local271 >> 11);
						}
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5319 = arg0.method1772();
		} else if (arg1 == 1) {
			super.aBoolean275 = arg0.method1772() == 1;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(29) int[] local29 = this.method4117(0, arg0);
			@Pc(35) int[] local35 = this.method4117(1, arg0);
			@Pc(38) int local38 = this.anInt5319;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static110.anInt2934; local38++) {
					local19[local38] = local35[local38] + local29[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static110.anInt2934; local38++) {
					local19[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static110.anInt2934; local38++) {
					local19[local38] = local35[local38] * local29[local38] >> 12;
				}
			} else {
				@Pc(165) int local165;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static110.anInt2934; local38++) {
						local165 = local35[local38];
						local19[local38] = local165 == 0 ? 4096 : (local29[local38] << 12) / local165;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static110.anInt2934; local38++) {
						local19[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static110.anInt2934; local38++) {
						local165 = local35[local38];
						local19[local38] = local165 < 2048 ? local165 * local29[local38] >> 11 : 4096 - ((4096 - local165) * (4096 - local29[local38]) >> 11);
					}
				} else {
					@Pc(275) int local275;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static110.anInt2934; local38++) {
							local275 = local29[local38];
							local19[local38] = local275 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local275);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static110.anInt2934; local38++) {
							local275 = local29[local38];
							local19[local38] = local275 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local275;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static110.anInt2934; local38++) {
							local165 = local35[local38];
							local275 = local29[local38];
							local19[local38] = local165 <= local275 ? local165 : local275;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static110.anInt2934; local38++) {
							local165 = local35[local38];
							local275 = local29[local38];
							local19[local38] = local275 <= local165 ? local165 : local275;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static110.anInt2934; local38++) {
							local165 = local35[local38];
							local275 = local29[local38];
							local19[local38] = local275 > local165 ? local275 - local165 : local165 - local275;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static110.anInt2934; local38++) {
							local275 = local29[local38];
							local165 = local35[local38];
							local19[local38] = local165 + local275 - (local165 * local275 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
