import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class5_Sub6_Sub21 extends Class5_Sub6 {

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
	private int anInt4573 = 6;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub21() {
		super(2, false);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(26) int[] local26 = this.method8117(arg0, 0);
			@Pc(32) int[] local32 = this.method8117(arg0, 1);
			@Pc(35) int local35 = this.anInt4573;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static421.anInt7443; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static421.anInt7443; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static421.anInt7443; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(160) int local160;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static421.anInt7443; local35++) {
						local160 = local32[local35];
						local16[local35] = local160 == 0 ? 4096 : (local26[local35] << 12) / local160;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static421.anInt7443; local35++) {
						local16[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static421.anInt7443; local35++) {
						local160 = local32[local35];
						local16[local35] = local160 < 2048 ? local160 * local26[local35] >> 11 : 4096 - ((4096 - local160) * (-local26[local35] + 4096) >> 11);
					}
				} else {
					@Pc(267) int local267;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static421.anInt7443; local35++) {
							local267 = local26[local35];
							local16[local35] = local267 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local267);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static421.anInt7443; local35++) {
							local267 = local26[local35];
							local16[local35] = local267 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local267;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static421.anInt7443; local35++) {
							local160 = local32[local35];
							local267 = local26[local35];
							local16[local35] = local267 < local160 ? local267 : local160;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static421.anInt7443; local35++) {
							local267 = local26[local35];
							local160 = local32[local35];
							local16[local35] = local160 >= local267 ? local160 : local267;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static421.anInt7443; local35++) {
							local267 = local26[local35];
							local160 = local32[local35];
							local16[local35] = local160 >= local267 ? local160 - local267 : local267 - local160;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static421.anInt7443; local35++) {
							local160 = local32[local35];
							local267 = local26[local35];
							local16[local35] = local267 + local160 - (local267 * local160 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(29) int[][] local29 = this.method8116(0, arg0);
			@Pc(35) int[][] local35 = this.method8116(1, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt4573;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static421.anInt7443; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static421.anInt7443; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static421.anInt7443; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(283) int local283;
				@Pc(275) int local275;
				@Pc(279) int local279;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static421.anInt7443; local74++) {
						local275 = local67[local74];
						local279 = local71[local74];
						local283 = local63[local74];
						local39[local74] = local283 == 0 ? 4096 : (local51[local74] << 12) / local283;
						local43[local74] = local275 == 0 ? 4096 : (local55[local74] << 12) / local275;
						local47[local74] = local279 == 0 ? 4096 : (local59[local74] << 12) / local279;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static421.anInt7443; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (4096 - local51[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (-local55[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (-local59[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static421.anInt7443; local74++) {
						local275 = local67[local74];
						local279 = local71[local74];
						local283 = local63[local74];
						local39[local74] = local283 >= 2048 ? 4096 - ((4096 - local51[local74]) * (-local283 + 4096) >> 11) : local283 * local51[local74] >> 11;
						local43[local74] = local275 < 2048 ? local275 * local55[local74] >> 11 : 4096 - ((4096 - local275) * (-local55[local74] + 4096) >> 11);
						local47[local74] = local279 >= 2048 ? 4096 - ((4096 - local59[local74]) * (-local279 + 4096) >> 11) : local279 * local59[local74] >> 11;
					}
				} else {
					@Pc(535) int local535;
					@Pc(539) int local539;
					@Pc(531) int local531;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static421.anInt7443; local74++) {
							local531 = local59[local74];
							local535 = local51[local74];
							local539 = local55[local74];
							local39[local74] = local535 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local535);
							local43[local74] = local539 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local539);
							local47[local74] = local531 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local531);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static421.anInt7443; local74++) {
							local539 = local55[local74];
							local535 = local51[local74];
							local531 = local59[local74];
							local39[local74] = local535 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local535;
							local43[local74] = local539 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local539;
							local47[local74] = local531 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local531;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static421.anInt7443; local74++) {
							local283 = local63[local74];
							local539 = local55[local74];
							local279 = local71[local74];
							local275 = local67[local74];
							local531 = local59[local74];
							local535 = local51[local74];
							local39[local74] = local283 <= local535 ? local283 : local535;
							local43[local74] = local539 >= local275 ? local275 : local539;
							local47[local74] = local279 <= local531 ? local279 : local531;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static421.anInt7443; local74++) {
							local531 = local59[local74];
							local279 = local71[local74];
							local283 = local63[local74];
							local275 = local67[local74];
							local539 = local55[local74];
							local535 = local51[local74];
							local39[local74] = local283 >= local535 ? local283 : local535;
							local43[local74] = local275 >= local539 ? local275 : local539;
							local47[local74] = local279 >= local531 ? local279 : local531;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static421.anInt7443; local74++) {
							local539 = local55[local74];
							local283 = local63[local74];
							local275 = local67[local74];
							local535 = local51[local74];
							local279 = local71[local74];
							local531 = local59[local74];
							local39[local74] = local283 < local535 ? local535 - local283 : -local535 + local283;
							local43[local74] = local275 >= local539 ? local275 - local539 : -local275 + local539;
							local47[local74] = local279 >= local531 ? local279 - local531 : -local279 + local531;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static421.anInt7443; local74++) {
							local535 = local51[local74];
							local539 = local55[local74];
							local275 = local67[local74];
							local283 = local63[local74];
							local279 = local71[local74];
							local531 = local59[local74];
							local39[local74] = local535 + local283 - (local535 * local283 >> 11);
							local43[local74] = local539 + local275 - (local539 * local275 >> 11);
							local47[local74] = local531 + local279 - (local279 * local531 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4573 = arg0.method3642();
		} else if (arg1 == 1) {
			super.aBoolean718 = arg0.method3642() == 1;
		}
	}
}
