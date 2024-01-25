import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class2_Sub6_Sub13 extends Class2_Sub6 {

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
	private int anInt2562 = 6;

	static {
		new Class221("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub13() {
		super(2, false);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(29) int[][] local29 = this.method5640(0, arg0);
			@Pc(35) int[][] local35 = this.method5640(1, arg0);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt2562;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static151.anInt2711; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static151.anInt2711; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static151.anInt2711; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(279) int local279;
				@Pc(271) int local271;
				@Pc(275) int local275;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static151.anInt2711; local74++) {
						local271 = local67[local74];
						local275 = local71[local74];
						local279 = local63[local74];
						local39[local74] = local279 == 0 ? 4096 : (local51[local74] << 12) / local279;
						local43[local74] = local271 == 0 ? 4096 : (local55[local74] << 12) / local271;
						local47[local74] = local275 == 0 ? 4096 : (local59[local74] << 12) / local275;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static151.anInt2711; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (-local51[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (-local55[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local71[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static151.anInt2711; local74++) {
						local279 = local63[local74];
						local271 = local67[local74];
						local275 = local71[local74];
						local39[local74] = local279 < 2048 ? local279 * local51[local74] >> 11 : 4096 - ((4096 - local51[local74]) * (-local279 + 4096) >> 11);
						local43[local74] = local271 < 2048 ? local55[local74] * local271 >> 11 : 4096 - ((4096 - local271) * (4096 - local55[local74]) >> 11);
						local47[local74] = local275 < 2048 ? local59[local74] * local275 >> 11 : 4096 - ((4096 - local59[local74]) * (-local275 + 4096) >> 11);
					}
				} else {
					@Pc(530) int local530;
					@Pc(534) int local534;
					@Pc(538) int local538;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static151.anInt2711; local74++) {
							local530 = local51[local74];
							local534 = local55[local74];
							local538 = local59[local74];
							local39[local74] = local530 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local530);
							local43[local74] = local534 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local534);
							local47[local74] = local538 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local538);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static151.anInt2711; local74++) {
							local530 = local51[local74];
							local538 = local59[local74];
							local534 = local55[local74];
							local39[local74] = local530 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local530;
							local43[local74] = local534 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local534;
							local47[local74] = local538 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local538;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static151.anInt2711; local74++) {
							local271 = local67[local74];
							local538 = local59[local74];
							local530 = local51[local74];
							local279 = local63[local74];
							local534 = local55[local74];
							local275 = local71[local74];
							local39[local74] = local530 >= local279 ? local279 : local530;
							local43[local74] = local271 <= local534 ? local271 : local534;
							local47[local74] = local275 > local538 ? local538 : local275;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static151.anInt2711; local74++) {
							local279 = local63[local74];
							local530 = local51[local74];
							local538 = local59[local74];
							local534 = local55[local74];
							local271 = local67[local74];
							local275 = local71[local74];
							local39[local74] = local279 < local530 ? local530 : local279;
							local43[local74] = local534 <= local271 ? local271 : local534;
							local47[local74] = local538 <= local275 ? local275 : local538;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static151.anInt2711; local74++) {
							local534 = local55[local74];
							local275 = local71[local74];
							local530 = local51[local74];
							local279 = local63[local74];
							local271 = local67[local74];
							local538 = local59[local74];
							local39[local74] = local279 < local530 ? local530 - local279 : local279 + -local530;
							local43[local74] = local271 >= local534 ? local271 - local534 : local534 + -local271;
							local47[local74] = local275 >= local538 ? local275 - local538 : -local275 + local538;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static151.anInt2711; local74++) {
							local534 = local55[local74];
							local275 = local71[local74];
							local538 = local59[local74];
							local530 = local51[local74];
							local279 = local63[local74];
							local271 = local67[local74];
							local39[local74] = local279 + local530 - (local279 * local530 >> 11);
							local43[local74] = local271 + local534 - (local534 * local271 >> 11);
							local47[local74] = local275 + local538 - (local538 * local275 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2562 = arg0.method4240();
		} else if (arg1 == 1) {
			super.aBoolean491 = arg0.method4240() == 1;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(26) int[] local26 = this.method5635(arg0, 0);
			@Pc(32) int[] local32 = this.method5635(arg0, 1);
			@Pc(35) int local35 = this.anInt2562;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static151.anInt2711; local35++) {
					local11[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static151.anInt2711; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static151.anInt2711; local35++) {
					local11[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(154) int local154;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static151.anInt2711; local35++) {
						local154 = local32[local35];
						local11[local35] = local154 == 0 ? 4096 : (local26[local35] << 12) / local154;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static151.anInt2711; local35++) {
						local11[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static151.anInt2711; local35++) {
						local154 = local32[local35];
						local11[local35] = local154 >= 2048 ? 4096 - ((4096 - local154) * (-local26[local35] + 4096) >> 11) : local26[local35] * local154 >> 11;
					}
				} else {
					@Pc(264) int local264;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static151.anInt2711; local35++) {
							local264 = local26[local35];
							local11[local35] = local264 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local264);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static151.anInt2711; local35++) {
							local264 = local26[local35];
							local11[local35] = local264 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local264;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static151.anInt2711; local35++) {
							local154 = local32[local35];
							local264 = local26[local35];
							local11[local35] = local154 <= local264 ? local154 : local264;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static151.anInt2711; local35++) {
							local264 = local26[local35];
							local154 = local32[local35];
							local11[local35] = local264 > local154 ? local264 : local154;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static151.anInt2711; local35++) {
							local154 = local32[local35];
							local264 = local26[local35];
							local11[local35] = local264 > local154 ? local264 - local154 : -local264 + local154;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static151.anInt2711; local35++) {
							local264 = local26[local35];
							local154 = local32[local35];
							local11[local35] = local154 + local264 - (local154 * local264 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
