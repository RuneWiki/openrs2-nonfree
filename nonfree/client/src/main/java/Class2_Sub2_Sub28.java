import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class2_Sub2_Sub28 extends Class2_Sub2 {

	@OriginalMember(owner = "client!qh", name = "X", descriptor = "I")
	private int anInt3932 = 6;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub28() {
		super(2, false);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(26) int[] local26 = this.method3955(0, arg0);
			@Pc(32) int[] local32 = this.method3955(1, arg0);
			@Pc(35) int local35 = this.anInt3932;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static54.anInt953; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static54.anInt953; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static54.anInt953; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(160) int local160;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static54.anInt953; local35++) {
						local160 = local32[local35];
						local16[local35] = local160 == 0 ? 4096 : (local26[local35] << 12) / local160;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static54.anInt953; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static54.anInt953; local35++) {
						local160 = local32[local35];
						local16[local35] = local160 < 2048 ? local26[local35] * local160 >> 11 : 4096 - ((4096 - local160) * (-local26[local35] + 4096) >> 11);
					}
				} else {
					@Pc(277) int local277;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static54.anInt953; local35++) {
							local277 = local26[local35];
							local16[local35] = local277 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local277);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static54.anInt953; local35++) {
							local277 = local26[local35];
							local16[local35] = local277 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local277;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static54.anInt953; local35++) {
							local160 = local32[local35];
							local277 = local26[local35];
							local16[local35] = local160 > local277 ? local277 : local160;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static54.anInt953; local35++) {
							local277 = local26[local35];
							local160 = local32[local35];
							local16[local35] = local277 > local160 ? local277 : local160;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static54.anInt953; local35++) {
							local277 = local26[local35];
							local160 = local32[local35];
							local16[local35] = local277 > local160 ? local277 - local160 : local160 - local277;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static54.anInt953; local35++) {
							local277 = local26[local35];
							local160 = local32[local35];
							local16[local35] = local277 + local160 - (local277 * local160 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3932 = arg0.method2122();
		} else if (arg1 == 1) {
			super.aBoolean212 = arg0.method2122() == 1;
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(28) int[][] local28 = this.method3952(0, arg0);
			@Pc(34) int[][] local34 = this.method3952(1, arg0);
			@Pc(38) int[] local38 = local18[1];
			@Pc(42) int[] local42 = local18[0];
			@Pc(46) int[] local46 = local18[2];
			@Pc(50) int[] local50 = local28[1];
			@Pc(54) int[] local54 = local28[0];
			@Pc(58) int[] local58 = local34[1];
			@Pc(62) int[] local62 = local28[2];
			@Pc(66) int[] local66 = local34[0];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt3932;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static54.anInt953; local73++) {
					local42[local73] = local54[local73] + local66[local73];
					local38[local73] = local50[local73] + local58[local73];
					local46[local73] = local70[local73] + local62[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static54.anInt953; local73++) {
					local42[local73] = local54[local73] - local66[local73];
					local38[local73] = local50[local73] - local58[local73];
					local46[local73] = local62[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static54.anInt953; local73++) {
					local42[local73] = local66[local73] * local54[local73] >> 12;
					local38[local73] = local50[local73] * local58[local73] >> 12;
					local46[local73] = local62[local73] * local70[local73] >> 12;
				}
			} else {
				@Pc(269) int local269;
				@Pc(273) int local273;
				@Pc(277) int local277;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static54.anInt953; local73++) {
						local269 = local66[local73];
						local273 = local58[local73];
						local277 = local70[local73];
						local42[local73] = local269 == 0 ? 4096 : (local54[local73] << 12) / local269;
						local38[local73] = local273 == 0 ? 4096 : (local50[local73] << 12) / local273;
						local46[local73] = local277 == 0 ? 4096 : (local62[local73] << 12) / local277;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static54.anInt953; local73++) {
						local42[local73] = 4096 - ((4096 - local66[local73]) * (4096 - local54[local73]) >> 12);
						local38[local73] = 4096 - ((4096 - local50[local73]) * (-local58[local73] + 4096) >> 12);
						local46[local73] = 4096 - ((4096 - local62[local73]) * (-local70[local73] + 4096) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static54.anInt953; local73++) {
						local273 = local58[local73];
						local269 = local66[local73];
						local277 = local70[local73];
						local42[local73] = local269 >= 2048 ? 4096 - ((4096 - local54[local73]) * (-local269 + 4096) >> 11) : local54[local73] * local269 >> 11;
						local38[local73] = local273 >= 2048 ? 4096 - ((4096 - local273) * (-local50[local73] + 4096) >> 11) : local273 * local50[local73] >> 11;
						local46[local73] = local277 < 2048 ? local62[local73] * local277 >> 11 : 4096 - ((4096 - local277) * (-local62[local73] + 4096) >> 11);
					}
				} else {
					@Pc(533) int local533;
					@Pc(537) int local537;
					@Pc(529) int local529;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static54.anInt953; local73++) {
							local529 = local62[local73];
							local533 = local54[local73];
							local537 = local50[local73];
							local42[local73] = local533 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local533);
							local38[local73] = local537 == 4096 ? 4096 : (local58[local73] << 12) / (4096 - local537);
							local46[local73] = local529 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local529);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static54.anInt953; local73++) {
							local537 = local50[local73];
							local529 = local62[local73];
							local533 = local54[local73];
							local42[local73] = local533 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local533;
							local38[local73] = local537 == 0 ? 0 : 4096 - (4096 - local58[local73] << 12) / local537;
							local46[local73] = local529 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local529;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static54.anInt953; local73++) {
							local529 = local62[local73];
							local273 = local58[local73];
							local537 = local50[local73];
							local269 = local66[local73];
							local277 = local70[local73];
							local533 = local54[local73];
							local42[local73] = local533 < local269 ? local533 : local269;
							local38[local73] = local273 <= local537 ? local273 : local537;
							local46[local73] = local277 <= local529 ? local277 : local529;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static54.anInt953; local73++) {
							local529 = local62[local73];
							local533 = local54[local73];
							local277 = local70[local73];
							local273 = local58[local73];
							local537 = local50[local73];
							local269 = local66[local73];
							local42[local73] = local533 > local269 ? local533 : local269;
							local38[local73] = local537 > local273 ? local537 : local273;
							local46[local73] = local277 < local529 ? local529 : local277;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static54.anInt953; local73++) {
							local277 = local70[local73];
							local537 = local50[local73];
							local533 = local54[local73];
							local273 = local58[local73];
							local529 = local62[local73];
							local269 = local66[local73];
							local42[local73] = local533 <= local269 ? local269 - local533 : local533 + -local269;
							local38[local73] = local537 > local273 ? local537 - local273 : -local537 + local273;
							local46[local73] = local529 > local277 ? local529 - local277 : local277 + -local529;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static54.anInt953; local73++) {
							local277 = local70[local73];
							local537 = local50[local73];
							local533 = local54[local73];
							local273 = local58[local73];
							local269 = local66[local73];
							local529 = local62[local73];
							local42[local73] = local269 + local533 - (local269 * local533 >> 11);
							local38[local73] = local537 + local273 - (local273 * local537 >> 11);
							local46[local73] = local529 + local277 - (local277 * local529 >> 11);
						}
					}
				}
			}
		}
		return local18;
	}
}
