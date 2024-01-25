import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class5_Sub1_Sub17 extends Class5_Sub1 {

	@OriginalMember(owner = "client!lfa", name = "J", descriptor = "I")
	private int anInt6020 = 6;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub17() {
		super(2, false);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(29) int[][] local29 = this.method9203(0, arg0);
			@Pc(35) int[][] local35 = this.method9203(1, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt6020;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static648.anInt9588; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local55[local74] + local67[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static648.anInt9588; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static648.anInt9588; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local67[local74] * local55[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(321) int local321;
				@Pc(313) int local313;
				@Pc(317) int local317;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static648.anInt9588; local74++) {
						local313 = local67[local74];
						local317 = local71[local74];
						local321 = local63[local74];
						local39[local74] = local321 == 0 ? 4096 : (local51[local74] << 12) / local321;
						local43[local74] = local313 == 0 ? 4096 : (local55[local74] << 12) / local313;
						local47[local74] = local317 == 0 ? 4096 : (local59[local74] << 12) / local317;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static648.anInt9588; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (-local63[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (-local55[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (4096 - local71[local74]) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static648.anInt9588; local74++) {
						local317 = local71[local74];
						local321 = local63[local74];
						local313 = local67[local74];
						local39[local74] = local321 >= 2048 ? 4096 - ((4096 - local321) * (-local51[local74] + 4096) >> 11) : local321 * local51[local74] >> 11;
						local43[local74] = local313 < 2048 ? local55[local74] * local313 >> 11 : 4096 - ((4096 - local55[local74]) * (4096 - local313) >> 11);
						local47[local74] = local317 < 2048 ? local317 * local59[local74] >> 11 : 4096 - ((4096 - local317) * (4096 - local59[local74]) >> 11);
					}
				} else {
					@Pc(588) int local588;
					@Pc(584) int local584;
					@Pc(592) int local592;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static648.anInt9588; local74++) {
							local584 = local55[local74];
							local588 = local51[local74];
							local592 = local59[local74];
							local39[local74] = local588 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local588);
							local43[local74] = local584 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local584);
							local47[local74] = local592 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local592);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static648.anInt9588; local74++) {
							local584 = local55[local74];
							local588 = local51[local74];
							local592 = local59[local74];
							local39[local74] = local588 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local588;
							local43[local74] = local584 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local584;
							local47[local74] = local592 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local592;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static648.anInt9588; local74++) {
							local313 = local67[local74];
							local321 = local63[local74];
							local592 = local59[local74];
							local588 = local51[local74];
							local317 = local71[local74];
							local584 = local55[local74];
							local39[local74] = local321 > local588 ? local588 : local321;
							local43[local74] = local584 >= local313 ? local313 : local584;
							local47[local74] = local317 <= local592 ? local317 : local592;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static648.anInt9588; local74++) {
							local313 = local67[local74];
							local592 = local59[local74];
							local588 = local51[local74];
							local584 = local55[local74];
							local321 = local63[local74];
							local317 = local71[local74];
							local39[local74] = local321 < local588 ? local588 : local321;
							local43[local74] = local313 < local584 ? local584 : local313;
							local47[local74] = local317 < local592 ? local592 : local317;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static648.anInt9588; local74++) {
							local584 = local55[local74];
							local321 = local63[local74];
							local317 = local71[local74];
							local313 = local67[local74];
							local592 = local59[local74];
							local588 = local51[local74];
							local39[local74] = local321 >= local588 ? local321 - local588 : local588 - local321;
							local43[local74] = local584 <= local313 ? local313 - local584 : -local313 + local584;
							local47[local74] = local317 >= local592 ? local317 - local592 : -local317 + local592;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static648.anInt9588; local74++) {
							local313 = local67[local74];
							local592 = local59[local74];
							local317 = local71[local74];
							local584 = local55[local74];
							local321 = local63[local74];
							local588 = local51[local74];
							local39[local74] = local588 + local321 - (local321 * local588 >> 11);
							local43[local74] = local584 + local313 - (local584 * local313 >> 11);
							local47[local74] = local317 + local592 - (local592 * local317 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt6020 = arg1.method8529();
		} else if (arg0 == 1) {
			super.aBoolean786 = arg1.method8529() == 1;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(27) int[] local27 = this.method9210(0, arg0);
			@Pc(33) int[] local33 = this.method9210(1, arg0);
			@Pc(36) int local36 = this.anInt6020;
			if (local36 == 1) {
				for (local36 = 0; local36 < Static648.anInt9588; local36++) {
					local11[local36] = local27[local36] + local33[local36];
				}
			} else if (local36 == 2) {
				for (local36 = 0; local36 < Static648.anInt9588; local36++) {
					local11[local36] = local27[local36] - local33[local36];
				}
			} else if (local36 == 3) {
				for (local36 = 0; local36 < Static648.anInt9588; local36++) {
					local11[local36] = local33[local36] * local27[local36] >> 12;
				}
			} else {
				@Pc(214) int local214;
				if (local36 == 4) {
					for (local36 = 0; local36 < Static648.anInt9588; local36++) {
						local214 = local33[local36];
						local11[local36] = local214 == 0 ? 4096 : (local27[local36] << 12) / local214;
					}
				} else if (local36 == 5) {
					for (local36 = 0; local36 < Static648.anInt9588; local36++) {
						local11[local36] = 4096 - ((4096 - local33[local36]) * (-local27[local36] + 4096) >> 12);
					}
				} else if (local36 == 6) {
					for (local36 = 0; local36 < Static648.anInt9588; local36++) {
						local214 = local33[local36];
						local11[local36] = local214 >= 2048 ? 4096 - ((4096 - local27[local36]) * (-local214 + 4096) >> 11) : local27[local36] * local214 >> 11;
					}
				} else {
					@Pc(328) int local328;
					if (local36 == 7) {
						for (local36 = 0; local36 < Static648.anInt9588; local36++) {
							local328 = local27[local36];
							local11[local36] = local328 == 4096 ? 4096 : (local33[local36] << 12) / (4096 - local328);
						}
					} else if (local36 == 8) {
						for (local36 = 0; local36 < Static648.anInt9588; local36++) {
							local328 = local27[local36];
							local11[local36] = local328 == 0 ? 0 : 4096 - (4096 - local33[local36] << 12) / local328;
						}
					} else if (local36 == 9) {
						for (local36 = 0; local36 < Static648.anInt9588; local36++) {
							local328 = local27[local36];
							local214 = local33[local36];
							local11[local36] = local214 > local328 ? local328 : local214;
						}
					} else if (local36 == 10) {
						for (local36 = 0; local36 < Static648.anInt9588; local36++) {
							local328 = local27[local36];
							local214 = local33[local36];
							local11[local36] = local328 <= local214 ? local214 : local328;
						}
					} else if (local36 == 11) {
						for (local36 = 0; local36 < Static648.anInt9588; local36++) {
							local328 = local27[local36];
							local214 = local33[local36];
							local11[local36] = local214 < local328 ? local328 - local214 : -local328 + local214;
						}
					} else if (local36 == 12) {
						for (local36 = 0; local36 < Static648.anInt9588; local36++) {
							local214 = local33[local36];
							local328 = local27[local36];
							local11[local36] = local214 + local328 - (local214 * local328 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
