import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class2_Sub2_Sub21 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mda", name = "M", descriptor = "I")
	private int anInt6054 = 6;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub21() {
		super(2, false);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6054 = arg0.method4325();
		} else if (arg1 == 1) {
			super.aBoolean729 = arg0.method4325() == 1;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(29) int[] local29 = this.method7951(arg0, 0);
			@Pc(35) int[] local35 = this.method7951(arg0, 1);
			@Pc(38) int local38 = this.anInt6054;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static153.anInt3070; local38++) {
					local11[local38] = local29[local38] + local35[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static153.anInt3070; local38++) {
					local11[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static153.anInt3070; local38++) {
					local11[local38] = local35[local38] * local29[local38] >> 12;
				}
			} else {
				@Pc(167) int local167;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static153.anInt3070; local38++) {
						local167 = local35[local38];
						local11[local38] = local167 == 0 ? 4096 : (local29[local38] << 12) / local167;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static153.anInt3070; local38++) {
						local11[local38] = 4096 - ((4096 - local35[local38]) * (4096 - local29[local38]) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static153.anInt3070; local38++) {
						local167 = local35[local38];
						local11[local38] = local167 < 2048 ? local167 * local29[local38] >> 11 : 4096 - ((4096 - local167) * (-local29[local38] + 4096) >> 11);
					}
				} else {
					@Pc(282) int local282;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static153.anInt3070; local38++) {
							local282 = local29[local38];
							local11[local38] = local282 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local282);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static153.anInt3070; local38++) {
							local282 = local29[local38];
							local11[local38] = local282 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local282;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static153.anInt3070; local38++) {
							local282 = local29[local38];
							local167 = local35[local38];
							local11[local38] = local167 > local282 ? local282 : local167;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static153.anInt3070; local38++) {
							local167 = local35[local38];
							local282 = local29[local38];
							local11[local38] = local167 < local282 ? local282 : local167;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static153.anInt3070; local38++) {
							local282 = local29[local38];
							local167 = local35[local38];
							local11[local38] = local167 < local282 ? local282 - local167 : -local282 + local167;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static153.anInt3070; local38++) {
							local282 = local29[local38];
							local167 = local35[local38];
							local11[local38] = local282 + local167 - (local282 * local167 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(29) int[][] local29 = this.method7947(0, arg0);
			@Pc(35) int[][] local35 = this.method7947(1, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt6054;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static153.anInt3070; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static153.anInt3070; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static153.anInt3070; local74++) {
					local39[local74] = local51[local74] * local63[local74] >> 12;
					local43[local74] = local67[local74] * local55[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(275) int local275;
				@Pc(271) int local271;
				@Pc(267) int local267;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static153.anInt3070; local74++) {
						local267 = local71[local74];
						local271 = local67[local74];
						local275 = local63[local74];
						local39[local74] = local275 == 0 ? 4096 : (local51[local74] << 12) / local275;
						local43[local74] = local271 == 0 ? 4096 : (local55[local74] << 12) / local271;
						local47[local74] = local267 == 0 ? 4096 : (local59[local74] << 12) / local267;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static153.anInt3070; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (4096 - local63[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (-local55[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (4096 - local59[local74]) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static153.anInt3070; local74++) {
						local275 = local63[local74];
						local267 = local71[local74];
						local271 = local67[local74];
						local39[local74] = local275 >= 2048 ? 4096 - ((4096 - local275) * (-local51[local74] + 4096) >> 11) : local275 * local51[local74] >> 11;
						local43[local74] = local271 >= 2048 ? 4096 - ((4096 - local271) * (4096 - local55[local74]) >> 11) : local271 * local55[local74] >> 11;
						local47[local74] = local267 < 2048 ? local59[local74] * local267 >> 11 : 4096 - ((4096 - local267) * (4096 - local59[local74]) >> 11);
					}
				} else {
					@Pc(538) int local538;
					@Pc(530) int local530;
					@Pc(534) int local534;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static153.anInt3070; local74++) {
							local530 = local55[local74];
							local534 = local59[local74];
							local538 = local51[local74];
							local39[local74] = local538 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local538);
							local43[local74] = local530 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local530);
							local47[local74] = local534 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local534);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static153.anInt3070; local74++) {
							local534 = local59[local74];
							local538 = local51[local74];
							local530 = local55[local74];
							local39[local74] = local538 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local538;
							local43[local74] = local530 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local530;
							local47[local74] = local534 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local534;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static153.anInt3070; local74++) {
							local538 = local51[local74];
							local267 = local71[local74];
							local275 = local63[local74];
							local271 = local67[local74];
							local530 = local55[local74];
							local534 = local59[local74];
							local39[local74] = local275 > local538 ? local538 : local275;
							local43[local74] = local271 <= local530 ? local271 : local530;
							local47[local74] = local267 <= local534 ? local267 : local534;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static153.anInt3070; local74++) {
							local267 = local71[local74];
							local275 = local63[local74];
							local530 = local55[local74];
							local534 = local59[local74];
							local538 = local51[local74];
							local271 = local67[local74];
							local39[local74] = local275 >= local538 ? local275 : local538;
							local43[local74] = local530 <= local271 ? local271 : local530;
							local47[local74] = local267 < local534 ? local534 : local267;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static153.anInt3070; local74++) {
							local271 = local67[local74];
							local534 = local59[local74];
							local275 = local63[local74];
							local267 = local71[local74];
							local530 = local55[local74];
							local538 = local51[local74];
							local39[local74] = local275 < local538 ? local538 - local275 : local275 + -local538;
							local43[local74] = local530 > local271 ? local530 - local271 : -local530 + local271;
							local47[local74] = local534 <= local267 ? local267 - local534 : -local267 + local534;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static153.anInt3070; local74++) {
							local271 = local67[local74];
							local267 = local71[local74];
							local534 = local59[local74];
							local530 = local55[local74];
							local538 = local51[local74];
							local275 = local63[local74];
							local39[local74] = local538 + local275 - (local538 * local275 >> 11);
							local43[local74] = local530 + local271 - (local530 * local271 >> 11);
							local47[local74] = local534 + local267 - (local267 * local534 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
