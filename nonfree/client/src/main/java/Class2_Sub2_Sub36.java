import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class2_Sub2_Sub36 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
	private int anInt7094 = 6;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub36() {
		super(2, false);
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(21) int[] local21 = this.method5839(arg0, 0);
			@Pc(27) int[] local27 = this.method5839(arg0, 1);
			@Pc(30) int local30 = this.anInt7094;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static429.anInt6518; local30++) {
					local11[local30] = local27[local30] + local21[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static429.anInt6518; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static429.anInt6518; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(155) int local155;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static429.anInt6518; local30++) {
						local155 = local27[local30];
						local11[local30] = local155 == 0 ? 4096 : (local21[local30] << 12) / local155;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static429.anInt6518; local30++) {
						local11[local30] = 4096 - ((4096 - local27[local30]) * (-local21[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static429.anInt6518; local30++) {
						local155 = local27[local30];
						local11[local30] = local155 < 2048 ? local155 * local21[local30] >> 11 : 4096 - ((4096 - local155) * (-local21[local30] + 4096) >> 11);
					}
				} else {
					@Pc(271) int local271;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static429.anInt6518; local30++) {
							local271 = local21[local30];
							local11[local30] = local271 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local271);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static429.anInt6518; local30++) {
							local271 = local21[local30];
							local11[local30] = local271 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local271;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static429.anInt6518; local30++) {
							local155 = local27[local30];
							local271 = local21[local30];
							local11[local30] = local271 < local155 ? local271 : local155;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static429.anInt6518; local30++) {
							local155 = local27[local30];
							local271 = local21[local30];
							local11[local30] = local155 >= local271 ? local155 : local271;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static429.anInt6518; local30++) {
							local271 = local21[local30];
							local155 = local27[local30];
							local11[local30] = local271 <= local155 ? local155 - local271 : local271 + -local155;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static429.anInt6518; local30++) {
							local271 = local21[local30];
							local155 = local27[local30];
							local11[local30] = local155 + local271 - (local155 * local271 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(29) int[][] local29 = this.method5840(arg0, 0);
			@Pc(35) int[][] local35 = this.method5840(arg0, 1);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt7094;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static429.anInt6518; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static429.anInt6518; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static429.anInt6518; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(274) int local274;
				@Pc(278) int local278;
				@Pc(282) int local282;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static429.anInt6518; local74++) {
						local274 = local63[local74];
						local278 = local67[local74];
						local282 = local71[local74];
						local39[local74] = local274 == 0 ? 4096 : (local51[local74] << 12) / local274;
						local43[local74] = local278 == 0 ? 4096 : (local55[local74] << 12) / local278;
						local47[local74] = local282 == 0 ? 4096 : (local59[local74] << 12) / local282;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static429.anInt6518; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (-local63[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (-local55[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (4096 - local59[local74]) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static429.anInt6518; local74++) {
						local278 = local67[local74];
						local282 = local71[local74];
						local274 = local63[local74];
						local39[local74] = local274 >= 2048 ? 4096 - ((4096 - local274) * (4096 - local51[local74]) >> 11) : local51[local74] * local274 >> 11;
						local43[local74] = local278 >= 2048 ? 4096 - ((4096 - local55[local74]) * (-local278 + 4096) >> 11) : local278 * local55[local74] >> 11;
						local47[local74] = local282 >= 2048 ? 4096 - ((4096 - local59[local74]) * (-local282 + 4096) >> 11) : local282 * local59[local74] >> 11;
					}
				} else {
					@Pc(528) int local528;
					@Pc(536) int local536;
					@Pc(532) int local532;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static429.anInt6518; local74++) {
							local528 = local51[local74];
							local532 = local59[local74];
							local536 = local55[local74];
							local39[local74] = local528 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local528);
							local43[local74] = local536 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local536);
							local47[local74] = local532 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local532);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static429.anInt6518; local74++) {
							local532 = local59[local74];
							local536 = local55[local74];
							local528 = local51[local74];
							local39[local74] = local528 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local528;
							local43[local74] = local536 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local536;
							local47[local74] = local532 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local532;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static429.anInt6518; local74++) {
							local536 = local55[local74];
							local282 = local71[local74];
							local274 = local63[local74];
							local278 = local67[local74];
							local532 = local59[local74];
							local528 = local51[local74];
							local39[local74] = local274 > local528 ? local528 : local274;
							local43[local74] = local536 < local278 ? local536 : local278;
							local47[local74] = local532 < local282 ? local532 : local282;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static429.anInt6518; local74++) {
							local274 = local63[local74];
							local528 = local51[local74];
							local278 = local67[local74];
							local282 = local71[local74];
							local536 = local55[local74];
							local532 = local59[local74];
							local39[local74] = local528 > local274 ? local528 : local274;
							local43[local74] = local536 <= local278 ? local278 : local536;
							local47[local74] = local282 >= local532 ? local282 : local532;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static429.anInt6518; local74++) {
							local532 = local59[local74];
							local274 = local63[local74];
							local282 = local71[local74];
							local536 = local55[local74];
							local528 = local51[local74];
							local278 = local67[local74];
							local39[local74] = local274 < local528 ? local528 - local274 : local274 + -local528;
							local43[local74] = local536 <= local278 ? local278 - local536 : -local278 + local536;
							local47[local74] = local282 >= local532 ? local282 - local532 : -local282 + local532;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static429.anInt6518; local74++) {
							local274 = local63[local74];
							local532 = local59[local74];
							local282 = local71[local74];
							local536 = local55[local74];
							local528 = local51[local74];
							local278 = local67[local74];
							local39[local74] = local528 + local274 - (local274 * local528 >> 11);
							local43[local74] = local536 + local278 - (local278 * local536 >> 11);
							local47[local74] = local532 + local282 - (local282 * local532 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7094 = arg0.method5495();
		} else if (arg1 == 1) {
			super.aBoolean488 = arg0.method5495() == 1;
		}
	}
}
