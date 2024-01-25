import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class12_Sub1_Sub31 extends Class12_Sub1 {

	@OriginalMember(owner = "client!tda", name = "L", descriptor = "I")
	private int anInt8538 = 6;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub31() {
		super(2, false);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(29) int[][] local29 = this.method7790(0, arg0);
			@Pc(35) int[][] local35 = this.method7790(1, arg0);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt8538;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static357.anInt6670; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static357.anInt6670; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static357.anInt6670; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(263) int local263;
				@Pc(267) int local267;
				@Pc(271) int local271;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static357.anInt6670; local74++) {
						local263 = local63[local74];
						local267 = local67[local74];
						local271 = local71[local74];
						local39[local74] = local263 == 0 ? 4096 : (local51[local74] << 12) / local263;
						local43[local74] = local267 == 0 ? 4096 : (local55[local74] << 12) / local267;
						local47[local74] = local271 == 0 ? 4096 : (local59[local74] << 12) / local271;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static357.anInt6670; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (-local63[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local71[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static357.anInt6670; local74++) {
						local263 = local63[local74];
						local271 = local71[local74];
						local267 = local67[local74];
						local39[local74] = local263 >= 2048 ? 4096 - ((4096 - local263) * (-local51[local74] + 4096) >> 11) : local263 * local51[local74] >> 11;
						local43[local74] = local267 < 2048 ? local55[local74] * local267 >> 11 : 4096 - ((4096 - local267) * (-local55[local74] + 4096) >> 11);
						local47[local74] = local271 >= 2048 ? 4096 - ((4096 - local59[local74]) * (-local271 + 4096) >> 11) : local271 * local59[local74] >> 11;
					}
				} else {
					@Pc(542) int local542;
					@Pc(538) int local538;
					@Pc(534) int local534;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static357.anInt6670; local74++) {
							local534 = local59[local74];
							local538 = local55[local74];
							local542 = local51[local74];
							local39[local74] = local542 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local542);
							local43[local74] = local538 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local538);
							local47[local74] = local534 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local534);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static357.anInt6670; local74++) {
							local538 = local55[local74];
							local542 = local51[local74];
							local534 = local59[local74];
							local39[local74] = local542 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local542;
							local43[local74] = local538 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local538;
							local47[local74] = local534 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local534;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static357.anInt6670; local74++) {
							local534 = local59[local74];
							local263 = local63[local74];
							local542 = local51[local74];
							local267 = local67[local74];
							local538 = local55[local74];
							local271 = local71[local74];
							local39[local74] = local542 < local263 ? local542 : local263;
							local43[local74] = local538 < local267 ? local538 : local267;
							local47[local74] = local271 <= local534 ? local271 : local534;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static357.anInt6670; local74++) {
							local534 = local59[local74];
							local271 = local71[local74];
							local263 = local63[local74];
							local267 = local67[local74];
							local542 = local51[local74];
							local538 = local55[local74];
							local39[local74] = local263 >= local542 ? local263 : local542;
							local43[local74] = local267 < local538 ? local538 : local267;
							local47[local74] = local271 < local534 ? local534 : local271;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static357.anInt6670; local74++) {
							local267 = local67[local74];
							local542 = local51[local74];
							local538 = local55[local74];
							local271 = local71[local74];
							local534 = local59[local74];
							local263 = local63[local74];
							local39[local74] = local542 <= local263 ? local263 - local542 : local542 - local263;
							local43[local74] = local538 > local267 ? local538 - local267 : local267 + -local538;
							local47[local74] = local271 >= local534 ? local271 - local534 : local534 - local271;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static357.anInt6670; local74++) {
							local538 = local55[local74];
							local263 = local63[local74];
							local542 = local51[local74];
							local267 = local67[local74];
							local271 = local71[local74];
							local534 = local59[local74];
							local39[local74] = local263 + local542 - (local263 * local542 >> 11);
							local43[local74] = local267 + local538 - (local267 * local538 >> 11);
							local47[local74] = local534 + local271 - (local534 * local271 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(27) int[] local27 = this.method7795(0, arg0);
			@Pc(33) int[] local33 = this.method7795(1, arg0);
			@Pc(36) int local36 = this.anInt8538;
			if (local36 == 1) {
				for (local36 = 0; local36 < Static357.anInt6670; local36++) {
					local11[local36] = local27[local36] + local33[local36];
				}
			} else if (local36 == 2) {
				for (local36 = 0; local36 < Static357.anInt6670; local36++) {
					local11[local36] = local27[local36] - local33[local36];
				}
			} else if (local36 == 3) {
				for (local36 = 0; local36 < Static357.anInt6670; local36++) {
					local11[local36] = local33[local36] * local27[local36] >> 12;
				}
			} else {
				@Pc(167) int local167;
				if (local36 == 4) {
					for (local36 = 0; local36 < Static357.anInt6670; local36++) {
						local167 = local33[local36];
						local11[local36] = local167 == 0 ? 4096 : (local27[local36] << 12) / local167;
					}
				} else if (local36 == 5) {
					for (local36 = 0; local36 < Static357.anInt6670; local36++) {
						local11[local36] = 4096 - ((4096 - local27[local36]) * (-local33[local36] + 4096) >> 12);
					}
				} else if (local36 == 6) {
					for (local36 = 0; local36 < Static357.anInt6670; local36++) {
						local167 = local33[local36];
						local11[local36] = local167 < 2048 ? local27[local36] * local167 >> 11 : 4096 - ((4096 - local167) * (4096 - local27[local36]) >> 11);
					}
				} else {
					@Pc(281) int local281;
					if (local36 == 7) {
						for (local36 = 0; local36 < Static357.anInt6670; local36++) {
							local281 = local27[local36];
							local11[local36] = local281 == 4096 ? 4096 : (local33[local36] << 12) / (4096 - local281);
						}
					} else if (local36 == 8) {
						for (local36 = 0; local36 < Static357.anInt6670; local36++) {
							local281 = local27[local36];
							local11[local36] = local281 == 0 ? 0 : 4096 - (4096 - local33[local36] << 12) / local281;
						}
					} else if (local36 == 9) {
						for (local36 = 0; local36 < Static357.anInt6670; local36++) {
							local167 = local33[local36];
							local281 = local27[local36];
							local11[local36] = local281 < local167 ? local281 : local167;
						}
					} else if (local36 == 10) {
						for (local36 = 0; local36 < Static357.anInt6670; local36++) {
							local167 = local33[local36];
							local281 = local27[local36];
							local11[local36] = local281 > local167 ? local281 : local167;
						}
					} else if (local36 == 11) {
						for (local36 = 0; local36 < Static357.anInt6670; local36++) {
							local167 = local33[local36];
							local281 = local27[local36];
							local11[local36] = local281 > local167 ? local281 - local167 : -local281 + local167;
						}
					} else if (local36 == 12) {
						for (local36 = 0; local36 < Static357.anInt6670; local36++) {
							local167 = local33[local36];
							local281 = local27[local36];
							local11[local36] = local281 + local167 - (local167 * local281 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8538 = arg0.method5216();
		} else if (arg1 == 1) {
			super.aBoolean663 = arg0.method5216() == 1;
		}
	}
}
