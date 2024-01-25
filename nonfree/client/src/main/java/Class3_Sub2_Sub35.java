import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class3_Sub2_Sub35 extends Class3_Sub2 {

	@OriginalMember(owner = "client!th", name = "H", descriptor = "I")
	private int anInt9329 = 6;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub35() {
		super(2, false);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt9329 = arg1.method8401();
		} else if (arg0 == 1) {
			super.aBoolean855 = arg1.method8401() == 1;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(21) int[] local21 = this.method8340(arg0, 0);
			@Pc(27) int[] local27 = this.method8340(arg0, 1);
			@Pc(30) int local30 = this.anInt9329;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static164.anInt8839; local30++) {
					local11[local30] = local27[local30] + local21[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static164.anInt8839; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static164.anInt8839; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(159) int local159;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static164.anInt8839; local30++) {
						local159 = local27[local30];
						local11[local30] = local159 == 0 ? 4096 : (local21[local30] << 12) / local159;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static164.anInt8839; local30++) {
						local11[local30] = 4096 - ((4096 - local27[local30]) * (-local21[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static164.anInt8839; local30++) {
						local159 = local27[local30];
						local11[local30] = local159 < 2048 ? local159 * local21[local30] >> 11 : 4096 - ((4096 - local21[local30]) * (-local159 + 4096) >> 11);
					}
				} else {
					@Pc(268) int local268;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static164.anInt8839; local30++) {
							local268 = local21[local30];
							local11[local30] = local268 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local268);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static164.anInt8839; local30++) {
							local268 = local21[local30];
							local11[local30] = local268 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local268;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static164.anInt8839; local30++) {
							local159 = local27[local30];
							local268 = local21[local30];
							local11[local30] = local159 <= local268 ? local159 : local268;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static164.anInt8839; local30++) {
							local159 = local27[local30];
							local268 = local21[local30];
							local11[local30] = local159 < local268 ? local268 : local159;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static164.anInt8839; local30++) {
							local159 = local27[local30];
							local268 = local21[local30];
							local11[local30] = local268 > local159 ? local268 - local159 : -local268 + local159;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static164.anInt8839; local30++) {
							local159 = local27[local30];
							local268 = local21[local30];
							local11[local30] = local159 + local268 - (local268 * local159 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(29) int[][] local29 = this.method8337(0, arg0);
			@Pc(35) int[][] local35 = this.method8337(1, arg0);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt9329;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static164.anInt8839; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local55[local74] + local67[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static164.anInt8839; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static164.anInt8839; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local67[local74] * local55[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(267) int local267;
				@Pc(271) int local271;
				@Pc(275) int local275;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static164.anInt8839; local74++) {
						local267 = local63[local74];
						local271 = local67[local74];
						local275 = local71[local74];
						local39[local74] = local267 == 0 ? 4096 : (local51[local74] << 12) / local267;
						local43[local74] = local271 == 0 ? 4096 : (local55[local74] << 12) / local271;
						local47[local74] = local275 == 0 ? 4096 : (local59[local74] << 12) / local275;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static164.anInt8839; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (-local51[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (-local55[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (4096 - local71[local74]) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static164.anInt8839; local74++) {
						local275 = local71[local74];
						local271 = local67[local74];
						local267 = local63[local74];
						local39[local74] = local267 >= 2048 ? 4096 - ((4096 - local51[local74]) * (-local267 + 4096) >> 11) : local51[local74] * local267 >> 11;
						local43[local74] = local271 >= 2048 ? 4096 - ((4096 - local271) * (-local55[local74] + 4096) >> 11) : local271 * local55[local74] >> 11;
						local47[local74] = local275 < 2048 ? local59[local74] * local275 >> 11 : 4096 - ((4096 - local59[local74]) * (-local275 + 4096) >> 11);
					}
				} else {
					@Pc(517) int local517;
					@Pc(521) int local521;
					@Pc(525) int local525;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static164.anInt8839; local74++) {
							local517 = local51[local74];
							local521 = local55[local74];
							local525 = local59[local74];
							local39[local74] = local517 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local517);
							local43[local74] = local521 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local521);
							local47[local74] = local525 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local525);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static164.anInt8839; local74++) {
							local517 = local51[local74];
							local525 = local59[local74];
							local521 = local55[local74];
							local39[local74] = local517 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local517;
							local43[local74] = local521 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local521;
							local47[local74] = local525 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local525;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static164.anInt8839; local74++) {
							local271 = local67[local74];
							local517 = local51[local74];
							local267 = local63[local74];
							local521 = local55[local74];
							local275 = local71[local74];
							local525 = local59[local74];
							local39[local74] = local517 >= local267 ? local267 : local517;
							local43[local74] = local521 < local271 ? local521 : local271;
							local47[local74] = local275 <= local525 ? local275 : local525;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static164.anInt8839; local74++) {
							local517 = local51[local74];
							local267 = local63[local74];
							local525 = local59[local74];
							local521 = local55[local74];
							local271 = local67[local74];
							local275 = local71[local74];
							local39[local74] = local517 <= local267 ? local267 : local517;
							local43[local74] = local271 < local521 ? local521 : local271;
							local47[local74] = local275 >= local525 ? local275 : local525;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static164.anInt8839; local74++) {
							local517 = local51[local74];
							local275 = local71[local74];
							local521 = local55[local74];
							local525 = local59[local74];
							local271 = local67[local74];
							local267 = local63[local74];
							local39[local74] = local517 > local267 ? local517 - local267 : local267 + -local517;
							local43[local74] = local271 >= local521 ? local271 - local521 : -local271 + local521;
							local47[local74] = local275 >= local525 ? local275 - local525 : local525 + -local275;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static164.anInt8839; local74++) {
							local267 = local63[local74];
							local525 = local59[local74];
							local275 = local71[local74];
							local521 = local55[local74];
							local271 = local67[local74];
							local517 = local51[local74];
							local39[local74] = local267 + local517 - (local267 * local517 >> 11);
							local43[local74] = local271 + local521 - (local271 * local521 >> 11);
							local47[local74] = local525 + local275 - (local275 * local525 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
