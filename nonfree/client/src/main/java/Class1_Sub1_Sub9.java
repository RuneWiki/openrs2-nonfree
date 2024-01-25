import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
	private int anInt1611 = 6;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(2, false);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(21) int[] local21 = this.method5620(arg0, 0);
			@Pc(27) int[] local27 = this.method5620(arg0, 1);
			@Pc(30) int local30 = this.anInt1611;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static434.anInt4326; local30++) {
					local11[local30] = local27[local30] + local21[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static434.anInt4326; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static434.anInt4326; local30++) {
					local11[local30] = local21[local30] * local27[local30] >> 12;
				}
			} else {
				@Pc(165) int local165;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static434.anInt4326; local30++) {
						local165 = local27[local30];
						local11[local30] = local165 == 0 ? 4096 : (local21[local30] << 12) / local165;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static434.anInt4326; local30++) {
						local11[local30] = 4096 - ((4096 - local21[local30]) * (-local27[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static434.anInt4326; local30++) {
						local165 = local27[local30];
						local11[local30] = local165 < 2048 ? local21[local30] * local165 >> 11 : 4096 - ((4096 - local165) * (-local21[local30] + 4096) >> 11);
					}
				} else {
					@Pc(279) int local279;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static434.anInt4326; local30++) {
							local279 = local21[local30];
							local11[local30] = local279 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local279);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static434.anInt4326; local30++) {
							local279 = local21[local30];
							local11[local30] = local279 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local279;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static434.anInt4326; local30++) {
							local279 = local21[local30];
							local165 = local27[local30];
							local11[local30] = local279 < local165 ? local279 : local165;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static434.anInt4326; local30++) {
							local279 = local21[local30];
							local165 = local27[local30];
							local11[local30] = local165 < local279 ? local279 : local165;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static434.anInt4326; local30++) {
							local165 = local27[local30];
							local279 = local21[local30];
							local11[local30] = local165 < local279 ? local279 - local165 : -local279 + local165;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static434.anInt4326; local30++) {
							local165 = local27[local30];
							local279 = local21[local30];
							local11[local30] = local279 + local165 - (local165 * local279 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(21) int[][] local21 = this.method5624(0, arg0);
			@Pc(27) int[][] local27 = this.method5624(1, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt1611;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static434.anInt4326; local66++) {
					local31[local66] = local43[local66] + local55[local66];
					local35[local66] = local47[local66] + local59[local66];
					local39[local66] = local63[local66] + local51[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static434.anInt4326; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static434.anInt4326; local66++) {
					local31[local66] = local43[local66] * local55[local66] >> 12;
					local35[local66] = local59[local66] * local47[local66] >> 12;
					local39[local66] = local51[local66] * local63[local66] >> 12;
				}
			} else {
				@Pc(269) int local269;
				@Pc(261) int local261;
				@Pc(265) int local265;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static434.anInt4326; local66++) {
						local261 = local59[local66];
						local265 = local63[local66];
						local269 = local55[local66];
						local31[local66] = local269 == 0 ? 4096 : (local43[local66] << 12) / local269;
						local35[local66] = local261 == 0 ? 4096 : (local47[local66] << 12) / local261;
						local39[local66] = local265 == 0 ? 4096 : (local51[local66] << 12) / local265;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static434.anInt4326; local66++) {
						local31[local66] = 4096 - ((4096 - local55[local66]) * (-local43[local66] + 4096) >> 12);
						local35[local66] = 4096 - ((4096 - local47[local66]) * (-local59[local66] + 4096) >> 12);
						local39[local66] = 4096 - ((4096 - local63[local66]) * (-local51[local66] + 4096) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static434.anInt4326; local66++) {
						local269 = local55[local66];
						local261 = local59[local66];
						local265 = local63[local66];
						local31[local66] = local269 < 2048 ? local43[local66] * local269 >> 11 : 4096 - ((4096 - local269) * (-local43[local66] + 4096) >> 11);
						local35[local66] = local261 >= 2048 ? 4096 - ((4096 - local261) * (4096 - local47[local66]) >> 11) : local47[local66] * local261 >> 11;
						local39[local66] = local265 >= 2048 ? 4096 - ((4096 - local51[local66]) * (-local265 + 4096) >> 11) : local51[local66] * local265 >> 11;
					}
				} else {
					@Pc(525) int local525;
					@Pc(529) int local529;
					@Pc(533) int local533;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static434.anInt4326; local66++) {
							local525 = local43[local66];
							local529 = local47[local66];
							local533 = local51[local66];
							local31[local66] = local525 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local525);
							local35[local66] = local529 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local529);
							local39[local66] = local533 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local533);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static434.anInt4326; local66++) {
							local529 = local47[local66];
							local533 = local51[local66];
							local525 = local43[local66];
							local31[local66] = local525 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local525;
							local35[local66] = local529 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local529;
							local39[local66] = local533 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local533;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static434.anInt4326; local66++) {
							local533 = local51[local66];
							local269 = local55[local66];
							local529 = local47[local66];
							local525 = local43[local66];
							local261 = local59[local66];
							local265 = local63[local66];
							local31[local66] = local269 > local525 ? local525 : local269;
							local35[local66] = local529 >= local261 ? local261 : local529;
							local39[local66] = local533 < local265 ? local533 : local265;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static434.anInt4326; local66++) {
							local525 = local43[local66];
							local533 = local51[local66];
							local261 = local59[local66];
							local269 = local55[local66];
							local529 = local47[local66];
							local265 = local63[local66];
							local31[local66] = local269 >= local525 ? local269 : local525;
							local35[local66] = local261 < local529 ? local529 : local261;
							local39[local66] = local533 <= local265 ? local265 : local533;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static434.anInt4326; local66++) {
							local269 = local55[local66];
							local525 = local43[local66];
							local261 = local59[local66];
							local529 = local47[local66];
							local533 = local51[local66];
							local265 = local63[local66];
							local31[local66] = local525 <= local269 ? local269 - local525 : local525 + -local269;
							local35[local66] = local261 < local529 ? local529 - local261 : local261 - local529;
							local39[local66] = local533 > local265 ? local533 - local265 : local265 - local533;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static434.anInt4326; local66++) {
							local533 = local51[local66];
							local265 = local63[local66];
							local529 = local47[local66];
							local525 = local43[local66];
							local269 = local55[local66];
							local261 = local59[local66];
							local31[local66] = local269 + local525 - (local525 * local269 >> 11);
							local35[local66] = local529 + local261 - (local529 * local261 >> 11);
							local39[local66] = local533 + local265 - (local265 * local533 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1611 = arg1.method4463();
		} else if (arg0 == 1) {
			super.aBoolean612 = arg1.method4463() == 1;
		}
	}
}
