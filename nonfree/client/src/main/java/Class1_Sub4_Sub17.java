import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class1_Sub4_Sub17 extends Class1_Sub4 {

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
	private int anInt4033 = 6;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub17() {
		super(2, false);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt4033 = arg1.method5366();
		} else if (arg0 == 1) {
			super.aBoolean501 = arg1.method5366() == 1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(29) int[][] local29 = this.method5956(arg0, 0);
			@Pc(35) int[][] local35 = this.method5956(arg0, 1);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt4033;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static66.anInt1511; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local55[local74] + local67[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static66.anInt1511; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static66.anInt1511; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local67[local74] * local55[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(267) int local267;
				@Pc(263) int local263;
				@Pc(271) int local271;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static66.anInt1511; local74++) {
						local263 = local67[local74];
						local267 = local63[local74];
						local271 = local71[local74];
						local39[local74] = local267 == 0 ? 4096 : (local51[local74] << 12) / local267;
						local43[local74] = local263 == 0 ? 4096 : (local55[local74] << 12) / local263;
						local47[local74] = local271 == 0 ? 4096 : (local59[local74] << 12) / local271;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static66.anInt1511; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (-local63[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (4096 - local55[local74]) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (-local59[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static66.anInt1511; local74++) {
						local271 = local71[local74];
						local263 = local67[local74];
						local267 = local63[local74];
						local39[local74] = local267 >= 2048 ? 4096 - ((4096 - local267) * (4096 - local51[local74]) >> 11) : local267 * local51[local74] >> 11;
						local43[local74] = local263 >= 2048 ? 4096 - ((4096 - local55[local74]) * (-local263 + 4096) >> 11) : local55[local74] * local263 >> 11;
						local47[local74] = local271 >= 2048 ? 4096 - ((4096 - local271) * (-local59[local74] + 4096) >> 11) : local271 * local59[local74] >> 11;
					}
				} else {
					@Pc(524) int local524;
					@Pc(516) int local516;
					@Pc(520) int local520;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static66.anInt1511; local74++) {
							local516 = local55[local74];
							local520 = local59[local74];
							local524 = local51[local74];
							local39[local74] = local524 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local524);
							local43[local74] = local516 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local516);
							local47[local74] = local520 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local520);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static66.anInt1511; local74++) {
							local516 = local55[local74];
							local524 = local51[local74];
							local520 = local59[local74];
							local39[local74] = local524 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local524;
							local43[local74] = local516 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local516;
							local47[local74] = local520 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local520;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static66.anInt1511; local74++) {
							local524 = local51[local74];
							local271 = local71[local74];
							local267 = local63[local74];
							local263 = local67[local74];
							local516 = local55[local74];
							local520 = local59[local74];
							local39[local74] = local524 < local267 ? local524 : local267;
							local43[local74] = local516 >= local263 ? local263 : local516;
							local47[local74] = local520 < local271 ? local520 : local271;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static66.anInt1511; local74++) {
							local520 = local59[local74];
							local516 = local55[local74];
							local263 = local67[local74];
							local267 = local63[local74];
							local524 = local51[local74];
							local271 = local71[local74];
							local39[local74] = local524 > local267 ? local524 : local267;
							local43[local74] = local263 < local516 ? local516 : local263;
							local47[local74] = local520 <= local271 ? local271 : local520;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static66.anInt1511; local74++) {
							local524 = local51[local74];
							local520 = local59[local74];
							local516 = local55[local74];
							local271 = local71[local74];
							local267 = local63[local74];
							local263 = local67[local74];
							local39[local74] = local267 >= local524 ? local267 - local524 : local524 - local267;
							local43[local74] = local263 >= local516 ? local263 - local516 : local516 - local263;
							local47[local74] = local520 > local271 ? local520 - local271 : local271 - local520;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static66.anInt1511; local74++) {
							local516 = local55[local74];
							local271 = local71[local74];
							local520 = local59[local74];
							local267 = local63[local74];
							local263 = local67[local74];
							local524 = local51[local74];
							local39[local74] = local267 + local524 - (local524 * local267 >> 11);
							local43[local74] = local263 + local516 - (local516 * local263 >> 11);
							local47[local74] = local520 + local271 - (local271 * local520 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(26) int[] local26 = this.method5958(arg0, 0);
			@Pc(32) int[] local32 = this.method5958(arg0, 1);
			@Pc(35) int local35 = this.anInt4033;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static66.anInt1511; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static66.anInt1511; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static66.anInt1511; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(166) int local166;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static66.anInt1511; local35++) {
						local166 = local32[local35];
						local16[local35] = local166 == 0 ? 4096 : (local26[local35] << 12) / local166;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static66.anInt1511; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static66.anInt1511; local35++) {
						local166 = local32[local35];
						local16[local35] = local166 >= 2048 ? 4096 - ((4096 - local26[local35]) * (-local166 + 4096) >> 11) : local166 * local26[local35] >> 11;
					}
				} else {
					@Pc(277) int local277;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static66.anInt1511; local35++) {
							local277 = local26[local35];
							local16[local35] = local277 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local277);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static66.anInt1511; local35++) {
							local277 = local26[local35];
							local16[local35] = local277 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local277;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static66.anInt1511; local35++) {
							local166 = local32[local35];
							local277 = local26[local35];
							local16[local35] = local277 < local166 ? local277 : local166;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static66.anInt1511; local35++) {
							local166 = local32[local35];
							local277 = local26[local35];
							local16[local35] = local277 <= local166 ? local166 : local277;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static66.anInt1511; local35++) {
							local277 = local26[local35];
							local166 = local32[local35];
							local16[local35] = local166 < local277 ? local277 - local166 : local166 + -local277;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static66.anInt1511; local35++) {
							local277 = local26[local35];
							local166 = local32[local35];
							local16[local35] = local277 + local166 - (local277 * local166 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
