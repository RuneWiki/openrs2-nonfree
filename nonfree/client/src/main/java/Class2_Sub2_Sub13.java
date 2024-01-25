import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
	private int anInt1910 = 6;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub13() {
		super(2, false);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(29) int[][] local29 = this.method5887(arg0, 0);
			@Pc(35) int[][] local35 = this.method5887(arg0, 1);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt1910;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static339.anInt6735; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static339.anInt6735; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static339.anInt6735; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(272) int local272;
				@Pc(268) int local268;
				@Pc(264) int local264;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static339.anInt6735; local74++) {
						local264 = local71[local74];
						local268 = local67[local74];
						local272 = local63[local74];
						local39[local74] = local272 == 0 ? 4096 : (local51[local74] << 12) / local272;
						local43[local74] = local268 == 0 ? 4096 : (local55[local74] << 12) / local268;
						local47[local74] = local264 == 0 ? 4096 : (local59[local74] << 12) / local264;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static339.anInt6735; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (-local63[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (-local59[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static339.anInt6735; local74++) {
						local272 = local63[local74];
						local264 = local71[local74];
						local268 = local67[local74];
						local39[local74] = local272 >= 2048 ? 4096 - ((4096 - local272) * (4096 - local51[local74]) >> 11) : local272 * local51[local74] >> 11;
						local43[local74] = local268 >= 2048 ? 4096 - ((4096 - local55[local74]) * (-local268 + 4096) >> 11) : local55[local74] * local268 >> 11;
						local47[local74] = local264 < 2048 ? local59[local74] * local264 >> 11 : 4096 - ((4096 - local59[local74]) * (-local264 + 4096) >> 11);
					}
				} else {
					@Pc(522) int local522;
					@Pc(514) int local514;
					@Pc(518) int local518;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static339.anInt6735; local74++) {
							local514 = local55[local74];
							local518 = local59[local74];
							local522 = local51[local74];
							local39[local74] = local522 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local522);
							local43[local74] = local514 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local514);
							local47[local74] = local518 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local518);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static339.anInt6735; local74++) {
							local518 = local59[local74];
							local522 = local51[local74];
							local514 = local55[local74];
							local39[local74] = local522 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local522;
							local43[local74] = local514 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local514;
							local47[local74] = local518 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local518;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static339.anInt6735; local74++) {
							local264 = local71[local74];
							local522 = local51[local74];
							local268 = local67[local74];
							local514 = local55[local74];
							local272 = local63[local74];
							local518 = local59[local74];
							local39[local74] = local272 > local522 ? local522 : local272;
							local43[local74] = local514 < local268 ? local514 : local268;
							local47[local74] = local264 > local518 ? local518 : local264;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static339.anInt6735; local74++) {
							local268 = local67[local74];
							local264 = local71[local74];
							local514 = local55[local74];
							local518 = local59[local74];
							local272 = local63[local74];
							local522 = local51[local74];
							local39[local74] = local522 <= local272 ? local272 : local522;
							local43[local74] = local514 <= local268 ? local268 : local514;
							local47[local74] = local264 >= local518 ? local264 : local518;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static339.anInt6735; local74++) {
							local518 = local59[local74];
							local514 = local55[local74];
							local268 = local67[local74];
							local264 = local71[local74];
							local522 = local51[local74];
							local272 = local63[local74];
							local39[local74] = local272 < local522 ? local522 - local272 : local272 - local522;
							local43[local74] = local514 > local268 ? local514 - local268 : local268 + -local514;
							local47[local74] = local518 > local264 ? local518 - local264 : local264 - local518;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static339.anInt6735; local74++) {
							local514 = local55[local74];
							local264 = local71[local74];
							local518 = local59[local74];
							local268 = local67[local74];
							local522 = local51[local74];
							local272 = local63[local74];
							local39[local74] = local522 + local272 - (local522 * local272 >> 11);
							local43[local74] = local268 + local514 - (local514 * local268 >> 11);
							local47[local74] = local518 + local264 - (local264 * local518 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(28) int[] local28 = this.method5876(0, arg0);
			@Pc(34) int[] local34 = this.method5876(1, arg0);
			@Pc(37) int local37 = this.anInt1910;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static339.anInt6735; local37++) {
					local18[local37] = local34[local37] + local28[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static339.anInt6735; local37++) {
					local18[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static339.anInt6735; local37++) {
					local18[local37] = local34[local37] * local28[local37] >> 12;
				}
			} else {
				@Pc(172) int local172;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static339.anInt6735; local37++) {
						local172 = local34[local37];
						local18[local37] = local172 == 0 ? 4096 : (local28[local37] << 12) / local172;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static339.anInt6735; local37++) {
						local18[local37] = 4096 - ((4096 - local28[local37]) * (-local34[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static339.anInt6735; local37++) {
						local172 = local34[local37];
						local18[local37] = local172 >= 2048 ? 4096 - ((4096 - local172) * (-local28[local37] + 4096) >> 11) : local28[local37] * local172 >> 11;
					}
				} else {
					@Pc(279) int local279;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static339.anInt6735; local37++) {
							local279 = local28[local37];
							local18[local37] = local279 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local279);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static339.anInt6735; local37++) {
							local279 = local28[local37];
							local18[local37] = local279 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local279;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static339.anInt6735; local37++) {
							local172 = local34[local37];
							local279 = local28[local37];
							local18[local37] = local279 < local172 ? local279 : local172;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static339.anInt6735; local37++) {
							local279 = local28[local37];
							local172 = local34[local37];
							local18[local37] = local172 >= local279 ? local172 : local279;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static339.anInt6735; local37++) {
							local172 = local34[local37];
							local279 = local28[local37];
							local18[local37] = local279 <= local172 ? local172 - local279 : -local172 + local279;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static339.anInt6735; local37++) {
							local172 = local34[local37];
							local279 = local28[local37];
							local18[local37] = local172 + local279 - (local279 * local172 >> 11);
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt1910 = arg1.method4421();
		} else if (arg0 == 1) {
			super.aBoolean597 = arg1.method4421() == 1;
		}
	}
}
