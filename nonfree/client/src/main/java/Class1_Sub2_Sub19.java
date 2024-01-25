import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!he", name = "K", descriptor = "I")
	private int anInt2501 = 6;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub19() {
		super(2, false);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(26) int[] local26 = this.method5510(arg0, 0);
			@Pc(32) int[] local32 = this.method5510(arg0, 1);
			@Pc(35) int local35 = this.anInt2501;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static158.anInt2658; local35++) {
					local11[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static158.anInt2658; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static158.anInt2658; local35++) {
					local11[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(161) int local161;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static158.anInt2658; local35++) {
						local161 = local32[local35];
						local11[local35] = local161 == 0 ? 4096 : (local26[local35] << 12) / local161;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static158.anInt2658; local35++) {
						local11[local35] = 4096 - ((4096 - local32[local35]) * (4096 - local26[local35]) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static158.anInt2658; local35++) {
						local161 = local32[local35];
						local11[local35] = local161 < 2048 ? local161 * local26[local35] >> 11 : 4096 - ((4096 - local26[local35]) * (4096 - local161) >> 11);
					}
				} else {
					@Pc(271) int local271;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static158.anInt2658; local35++) {
							local271 = local26[local35];
							local11[local35] = local271 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local271);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static158.anInt2658; local35++) {
							local271 = local26[local35];
							local11[local35] = local271 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local271;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static158.anInt2658; local35++) {
							local161 = local32[local35];
							local271 = local26[local35];
							local11[local35] = local161 <= local271 ? local161 : local271;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static158.anInt2658; local35++) {
							local161 = local32[local35];
							local271 = local26[local35];
							local11[local35] = local271 <= local161 ? local161 : local271;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static158.anInt2658; local35++) {
							local271 = local26[local35];
							local161 = local32[local35];
							local11[local35] = local271 > local161 ? local271 - local161 : -local271 + local161;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static158.anInt2658; local35++) {
							local161 = local32[local35];
							local271 = local26[local35];
							local11[local35] = local271 + local161 - (local161 * local271 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(25) int[][] local25 = this.method5514(arg0, 0);
			@Pc(31) int[][] local31 = this.method5514(arg0, 1);
			@Pc(35) int[] local35 = local15[0];
			@Pc(39) int[] local39 = local15[1];
			@Pc(43) int[] local43 = local15[2];
			@Pc(47) int[] local47 = local25[0];
			@Pc(51) int[] local51 = local25[1];
			@Pc(55) int[] local55 = local25[2];
			@Pc(59) int[] local59 = local31[0];
			@Pc(63) int[] local63 = local31[1];
			@Pc(67) int[] local67 = local31[2];
			@Pc(70) int local70 = this.anInt2501;
			if (local70 == 1) {
				for (local70 = 0; local70 < Static158.anInt2658; local70++) {
					local35[local70] = local47[local70] + local59[local70];
					local39[local70] = local51[local70] + local63[local70];
					local43[local70] = local55[local70] + local67[local70];
				}
			} else if (local70 == 2) {
				for (local70 = 0; local70 < Static158.anInt2658; local70++) {
					local35[local70] = local47[local70] - local59[local70];
					local39[local70] = local51[local70] - local63[local70];
					local43[local70] = local55[local70] - local67[local70];
				}
			} else if (local70 == 3) {
				for (local70 = 0; local70 < Static158.anInt2658; local70++) {
					local35[local70] = local47[local70] * local59[local70] >> 12;
					local39[local70] = local63[local70] * local51[local70] >> 12;
					local43[local70] = local67[local70] * local55[local70] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(266) int local266;
				@Pc(274) int local274;
				if (local70 == 4) {
					for (local70 = 0; local70 < Static158.anInt2658; local70++) {
						local266 = local63[local70];
						local270 = local59[local70];
						local274 = local67[local70];
						local35[local70] = local270 == 0 ? 4096 : (local47[local70] << 12) / local270;
						local39[local70] = local266 == 0 ? 4096 : (local51[local70] << 12) / local266;
						local43[local70] = local274 == 0 ? 4096 : (local55[local70] << 12) / local274;
					}
				} else if (local70 == 5) {
					for (local70 = 0; local70 < Static158.anInt2658; local70++) {
						local35[local70] = 4096 - ((4096 - local59[local70]) * (4096 - local47[local70]) >> 12);
						local39[local70] = 4096 - ((4096 - local63[local70]) * (-local51[local70] + 4096) >> 12);
						local43[local70] = 4096 - ((4096 - local55[local70]) * (-local67[local70] + 4096) >> 12);
					}
				} else if (local70 == 6) {
					for (local70 = 0; local70 < Static158.anInt2658; local70++) {
						local270 = local59[local70];
						local266 = local63[local70];
						local274 = local67[local70];
						local35[local70] = local270 >= 2048 ? 4096 - ((4096 - local47[local70]) * (-local270 + 4096) >> 11) : local270 * local47[local70] >> 11;
						local39[local70] = local266 < 2048 ? local51[local70] * local266 >> 11 : 4096 - ((4096 - local51[local70]) * (-local266 + 4096) >> 11);
						local43[local70] = local274 >= 2048 ? 4096 - ((4096 - local55[local70]) * (-local274 + 4096) >> 11) : local55[local70] * local274 >> 11;
					}
				} else {
					@Pc(525) int local525;
					@Pc(533) int local533;
					@Pc(529) int local529;
					if (local70 == 7) {
						for (local70 = 0; local70 < Static158.anInt2658; local70++) {
							local525 = local47[local70];
							local529 = local55[local70];
							local533 = local51[local70];
							local35[local70] = local525 == 4096 ? 4096 : (local59[local70] << 12) / (4096 - local525);
							local39[local70] = local533 == 4096 ? 4096 : (local63[local70] << 12) / (4096 - local533);
							local43[local70] = local529 == 4096 ? 4096 : (local67[local70] << 12) / (4096 - local529);
						}
					} else if (local70 == 8) {
						for (local70 = 0; local70 < Static158.anInt2658; local70++) {
							local525 = local47[local70];
							local533 = local51[local70];
							local529 = local55[local70];
							local35[local70] = local525 == 0 ? 0 : 4096 - (4096 - local59[local70] << 12) / local525;
							local39[local70] = local533 == 0 ? 0 : 4096 - (4096 - local63[local70] << 12) / local533;
							local43[local70] = local529 == 0 ? 0 : 4096 - (4096 - local67[local70] << 12) / local529;
						}
					} else if (local70 == 9) {
						for (local70 = 0; local70 < Static158.anInt2658; local70++) {
							local533 = local51[local70];
							local270 = local59[local70];
							local266 = local63[local70];
							local274 = local67[local70];
							local529 = local55[local70];
							local525 = local47[local70];
							local35[local70] = local270 <= local525 ? local270 : local525;
							local39[local70] = local533 < local266 ? local533 : local266;
							local43[local70] = local529 >= local274 ? local274 : local529;
						}
					} else if (local70 == 10) {
						for (local70 = 0; local70 < Static158.anInt2658; local70++) {
							local533 = local51[local70];
							local529 = local55[local70];
							local270 = local59[local70];
							local525 = local47[local70];
							local274 = local67[local70];
							local266 = local63[local70];
							local35[local70] = local525 <= local270 ? local270 : local525;
							local39[local70] = local266 >= local533 ? local266 : local533;
							local43[local70] = local529 <= local274 ? local274 : local529;
						}
					} else if (local70 == 11) {
						for (local70 = 0; local70 < Static158.anInt2658; local70++) {
							local533 = local51[local70];
							local525 = local47[local70];
							local274 = local67[local70];
							local266 = local63[local70];
							local529 = local55[local70];
							local270 = local59[local70];
							local35[local70] = local525 > local270 ? local525 - local270 : -local525 + local270;
							local39[local70] = local266 < local533 ? local533 - local266 : local266 + -local533;
							local43[local70] = local529 > local274 ? local529 - local274 : -local529 + local274;
						}
					} else if (local70 == 12) {
						for (local70 = 0; local70 < Static158.anInt2658; local70++) {
							local266 = local63[local70];
							local274 = local67[local70];
							local525 = local47[local70];
							local533 = local51[local70];
							local270 = local59[local70];
							local529 = local55[local70];
							local35[local70] = local270 + local525 - (local525 * local270 >> 11);
							local39[local70] = local533 + local266 - (local266 * local533 >> 11);
							local43[local70] = local274 + local529 - (local274 * local529 >> 11);
						}
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt2501 = arg1.method5174();
		} else if (arg0 == 1) {
			super.aBoolean586 = arg1.method5174() == 1;
		}
	}
}
