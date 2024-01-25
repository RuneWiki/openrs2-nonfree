import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class4_Sub4_Sub2 extends Class4_Sub4 {

	@OriginalMember(owner = "client!aw", name = "D", descriptor = "I")
	private int anInt343 = 6;

	static {
		new Class15(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub2() {
		super(2, false);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt343 = arg1.method5007();
		} else if (arg0 == 1) {
			super.aBoolean535 = arg1.method5007() == 1;
		}
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(29) int[][] local29 = this.method6049(arg0, 0);
			@Pc(35) int[][] local35 = this.method6049(arg0, 1);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt343;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static419.anInt6404; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static419.anInt6404; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static419.anInt6404; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(271) int local271;
				@Pc(263) int local263;
				@Pc(267) int local267;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static419.anInt6404; local74++) {
						local263 = local67[local74];
						local267 = local71[local74];
						local271 = local63[local74];
						local39[local74] = local271 == 0 ? 4096 : (local51[local74] << 12) / local271;
						local43[local74] = local263 == 0 ? 4096 : (local55[local74] << 12) / local263;
						local47[local74] = local267 == 0 ? 4096 : (local59[local74] << 12) / local267;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static419.anInt6404; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (4096 - local51[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (-local55[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local71[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static419.anInt6404; local74++) {
						local263 = local67[local74];
						local271 = local63[local74];
						local267 = local71[local74];
						local39[local74] = local271 >= 2048 ? 4096 - ((4096 - local51[local74]) * (4096 - local271) >> 11) : local271 * local51[local74] >> 11;
						local43[local74] = local263 < 2048 ? local263 * local55[local74] >> 11 : 4096 - ((4096 - local263) * (4096 - local55[local74]) >> 11);
						local47[local74] = local267 >= 2048 ? 4096 - ((4096 - local59[local74]) * (-local267 + 4096) >> 11) : local59[local74] * local267 >> 11;
					}
				} else {
					@Pc(522) int local522;
					@Pc(518) int local518;
					@Pc(526) int local526;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static419.anInt6404; local74++) {
							local518 = local55[local74];
							local522 = local51[local74];
							local526 = local59[local74];
							local39[local74] = local522 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local522);
							local43[local74] = local518 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local518);
							local47[local74] = local526 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local526);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static419.anInt6404; local74++) {
							local526 = local59[local74];
							local518 = local55[local74];
							local522 = local51[local74];
							local39[local74] = local522 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local522;
							local43[local74] = local518 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local518;
							local47[local74] = local526 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local526;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static419.anInt6404; local74++) {
							local263 = local67[local74];
							local518 = local55[local74];
							local271 = local63[local74];
							local526 = local59[local74];
							local267 = local71[local74];
							local522 = local51[local74];
							local39[local74] = local522 >= local271 ? local271 : local522;
							local43[local74] = local518 >= local263 ? local263 : local518;
							local47[local74] = local267 > local526 ? local526 : local267;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static419.anInt6404; local74++) {
							local522 = local51[local74];
							local526 = local59[local74];
							local263 = local67[local74];
							local518 = local55[local74];
							local271 = local63[local74];
							local267 = local71[local74];
							local39[local74] = local271 < local522 ? local522 : local271;
							local43[local74] = local518 <= local263 ? local263 : local518;
							local47[local74] = local526 > local267 ? local526 : local267;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static419.anInt6404; local74++) {
							local522 = local51[local74];
							local263 = local67[local74];
							local518 = local55[local74];
							local271 = local63[local74];
							local267 = local71[local74];
							local526 = local59[local74];
							local39[local74] = local271 < local522 ? local522 - local271 : -local522 + local271;
							local43[local74] = local263 < local518 ? local518 - local263 : local263 - local518;
							local47[local74] = local526 > local267 ? local526 - local267 : local267 + -local526;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static419.anInt6404; local74++) {
							local267 = local71[local74];
							local526 = local59[local74];
							local263 = local67[local74];
							local271 = local63[local74];
							local518 = local55[local74];
							local522 = local51[local74];
							local39[local74] = local522 + local271 - (local271 * local522 >> 11);
							local43[local74] = local518 + local263 - (local518 * local263 >> 11);
							local47[local74] = local526 + local267 - (local526 * local267 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(26) int[] local26 = this.method6040(arg0, 0);
			@Pc(34) int[] local34 = this.method6040(arg0, 1);
			@Pc(37) int local37 = this.anInt343;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static419.anInt6404; local37++) {
					local11[local37] = local34[local37] + local26[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static419.anInt6404; local37++) {
					local11[local37] = local26[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static419.anInt6404; local37++) {
					local11[local37] = local34[local37] * local26[local37] >> 12;
				}
			} else {
				@Pc(165) int local165;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static419.anInt6404; local37++) {
						local165 = local34[local37];
						local11[local37] = local165 == 0 ? 4096 : (local26[local37] << 12) / local165;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static419.anInt6404; local37++) {
						local11[local37] = 4096 - ((4096 - local34[local37]) * (-local26[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static419.anInt6404; local37++) {
						local165 = local34[local37];
						local11[local37] = local165 >= 2048 ? 4096 - ((4096 - local26[local37]) * (-local165 + 4096) >> 11) : local165 * local26[local37] >> 11;
					}
				} else {
					@Pc(279) int local279;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static419.anInt6404; local37++) {
							local279 = local26[local37];
							local11[local37] = local279 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local279);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static419.anInt6404; local37++) {
							local279 = local26[local37];
							local11[local37] = local279 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local279;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static419.anInt6404; local37++) {
							local279 = local26[local37];
							local165 = local34[local37];
							local11[local37] = local279 < local165 ? local279 : local165;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static419.anInt6404; local37++) {
							local279 = local26[local37];
							local165 = local34[local37];
							local11[local37] = local165 >= local279 ? local165 : local279;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static419.anInt6404; local37++) {
							local165 = local34[local37];
							local279 = local26[local37];
							local11[local37] = local165 < local279 ? local279 - local165 : -local279 + local165;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static419.anInt6404; local37++) {
							local279 = local26[local37];
							local165 = local34[local37];
							local11[local37] = local165 + local279 - (local279 * local165 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
