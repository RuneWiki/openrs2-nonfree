import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class14_Sub1_Sub6 extends Class14_Sub1 {

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
	private int anInt2058 = 6;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub6() {
		super(2, false);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(29) int[][] local29 = this.method8904(0, arg0);
			@Pc(35) int[][] local35 = this.method8904(1, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt2058;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static371.anInt6835; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local55[local74] + local67[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static371.anInt6835; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static371.anInt6835; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local67[local74] * local55[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(278) int local278;
				@Pc(274) int local274;
				@Pc(282) int local282;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static371.anInt6835; local74++) {
						local274 = local67[local74];
						local278 = local63[local74];
						local282 = local71[local74];
						local39[local74] = local278 == 0 ? 4096 : (local51[local74] << 12) / local278;
						local43[local74] = local274 == 0 ? 4096 : (local55[local74] << 12) / local274;
						local47[local74] = local282 == 0 ? 4096 : (local59[local74] << 12) / local282;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static371.anInt6835; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (-local51[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (-local55[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local71[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static371.anInt6835; local74++) {
						local274 = local67[local74];
						local282 = local71[local74];
						local278 = local63[local74];
						local39[local74] = local278 < 2048 ? local278 * local51[local74] >> 11 : 4096 - ((4096 - local278) * (4096 - local51[local74]) >> 11);
						local43[local74] = local274 >= 2048 ? 4096 - ((4096 - local274) * (4096 - local55[local74]) >> 11) : local55[local74] * local274 >> 11;
						local47[local74] = local282 >= 2048 ? 4096 - ((4096 - local59[local74]) * (-local282 + 4096) >> 11) : local59[local74] * local282 >> 11;
					}
				} else {
					@Pc(533) int local533;
					@Pc(537) int local537;
					@Pc(529) int local529;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static371.anInt6835; local74++) {
							local529 = local59[local74];
							local533 = local51[local74];
							local537 = local55[local74];
							local39[local74] = local533 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local533);
							local43[local74] = local537 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local537);
							local47[local74] = local529 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local529);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static371.anInt6835; local74++) {
							local529 = local59[local74];
							local537 = local55[local74];
							local533 = local51[local74];
							local39[local74] = local533 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local533;
							local43[local74] = local537 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local537;
							local47[local74] = local529 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local529;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static371.anInt6835; local74++) {
							local529 = local59[local74];
							local537 = local55[local74];
							local274 = local67[local74];
							local533 = local51[local74];
							local282 = local71[local74];
							local278 = local63[local74];
							local39[local74] = local533 >= local278 ? local278 : local533;
							local43[local74] = local274 > local537 ? local537 : local274;
							local47[local74] = local529 >= local282 ? local282 : local529;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static371.anInt6835; local74++) {
							local529 = local59[local74];
							local278 = local63[local74];
							local537 = local55[local74];
							local533 = local51[local74];
							local282 = local71[local74];
							local274 = local67[local74];
							local39[local74] = local278 < local533 ? local533 : local278;
							local43[local74] = local537 > local274 ? local537 : local274;
							local47[local74] = local529 <= local282 ? local282 : local529;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static371.anInt6835; local74++) {
							local529 = local59[local74];
							local537 = local55[local74];
							local274 = local67[local74];
							local282 = local71[local74];
							local533 = local51[local74];
							local278 = local63[local74];
							local39[local74] = local278 < local533 ? local533 - local278 : -local533 + local278;
							local43[local74] = local537 > local274 ? local537 - local274 : local274 - local537;
							local47[local74] = local529 > local282 ? local529 - local282 : local282 - local529;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static371.anInt6835; local74++) {
							local529 = local59[local74];
							local278 = local63[local74];
							local533 = local51[local74];
							local537 = local55[local74];
							local274 = local67[local74];
							local282 = local71[local74];
							local39[local74] = local278 + local533 - (local278 * local533 >> 11);
							local43[local74] = local537 + local274 - (local274 * local537 >> 11);
							local47[local74] = local529 + local282 - (local282 * local529 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2058 = arg0.method5866();
		} else if (arg1 == 1) {
			super.aBoolean734 = arg0.method5866() == 1;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(21) int[] local21 = this.method8897(0, arg0);
			@Pc(27) int[] local27 = this.method8897(1, arg0);
			@Pc(30) int local30 = this.anInt2058;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static371.anInt6835; local30++) {
					local11[local30] = local27[local30] + local21[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static371.anInt6835; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static371.anInt6835; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(157) int local157;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static371.anInt6835; local30++) {
						local157 = local27[local30];
						local11[local30] = local157 == 0 ? 4096 : (local21[local30] << 12) / local157;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static371.anInt6835; local30++) {
						local11[local30] = 4096 - ((4096 - local21[local30]) * (-local27[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static371.anInt6835; local30++) {
						local157 = local27[local30];
						local11[local30] = local157 < 2048 ? local21[local30] * local157 >> 11 : 4096 - ((4096 - local157) * (4096 - local21[local30]) >> 11);
					}
				} else {
					@Pc(271) int local271;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static371.anInt6835; local30++) {
							local271 = local21[local30];
							local11[local30] = local271 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local271);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static371.anInt6835; local30++) {
							local271 = local21[local30];
							local11[local30] = local271 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local271;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static371.anInt6835; local30++) {
							local271 = local21[local30];
							local157 = local27[local30];
							local11[local30] = local271 < local157 ? local271 : local157;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static371.anInt6835; local30++) {
							local157 = local27[local30];
							local271 = local21[local30];
							local11[local30] = local271 <= local157 ? local157 : local271;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static371.anInt6835; local30++) {
							local157 = local27[local30];
							local271 = local21[local30];
							local11[local30] = local157 >= local271 ? local157 - local271 : local271 + -local157;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static371.anInt6835; local30++) {
							local157 = local27[local30];
							local271 = local21[local30];
							local11[local30] = local271 + local157 - (local271 * local157 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
