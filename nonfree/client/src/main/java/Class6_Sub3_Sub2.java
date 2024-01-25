import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class6_Sub3_Sub2 extends Class6_Sub3 {

	@OriginalMember(owner = "client!bca", name = "H", descriptor = "I")
	private int anInt639 = 6;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub2() {
		super(2, false);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(26) int[] local26 = this.method7950(0, arg0);
			@Pc(32) int[] local32 = this.method7950(1, arg0);
			@Pc(35) int local35 = this.anInt639;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static35.anInt670; local35++) {
					local11[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static35.anInt670; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static35.anInt670; local35++) {
					local11[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(160) int local160;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static35.anInt670; local35++) {
						local160 = local32[local35];
						local11[local35] = local160 == 0 ? 4096 : (local26[local35] << 12) / local160;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static35.anInt670; local35++) {
						local11[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static35.anInt670; local35++) {
						local160 = local32[local35];
						local11[local35] = local160 >= 2048 ? 4096 - ((4096 - local160) * (4096 - local26[local35]) >> 11) : local160 * local26[local35] >> 11;
					}
				} else {
					@Pc(270) int local270;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static35.anInt670; local35++) {
							local270 = local26[local35];
							local11[local35] = local270 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local270);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static35.anInt670; local35++) {
							local270 = local26[local35];
							local11[local35] = local270 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local270;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static35.anInt670; local35++) {
							local160 = local32[local35];
							local270 = local26[local35];
							local11[local35] = local160 > local270 ? local270 : local160;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static35.anInt670; local35++) {
							local160 = local32[local35];
							local270 = local26[local35];
							local11[local35] = local270 <= local160 ? local160 : local270;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static35.anInt670; local35++) {
							local160 = local32[local35];
							local270 = local26[local35];
							local11[local35] = local160 < local270 ? local270 - local160 : -local270 + local160;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static35.anInt670; local35++) {
							local270 = local26[local35];
							local160 = local32[local35];
							local11[local35] = local270 + local160 - (local270 * local160 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt639 = arg1.method6019();
		} else if (arg0 == 1) {
			super.aBoolean674 = arg1.method6019() == 1;
		}
	}

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(28) int[][] local28 = this.method7961(arg0, 0);
			@Pc(34) int[][] local34 = this.method7961(arg0, 1);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			@Pc(50) int[] local50 = local28[0];
			@Pc(54) int[] local54 = local28[1];
			@Pc(58) int[] local58 = local28[2];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt639;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static35.anInt670; local73++) {
					local38[local73] = local50[local73] + local62[local73];
					local42[local73] = local54[local73] + local66[local73];
					local46[local73] = local70[local73] + local58[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static35.anInt670; local73++) {
					local38[local73] = local50[local73] - local62[local73];
					local42[local73] = local54[local73] - local66[local73];
					local46[local73] = local58[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static35.anInt670; local73++) {
					local38[local73] = local50[local73] * local62[local73] >> 12;
					local42[local73] = local54[local73] * local66[local73] >> 12;
					local46[local73] = local70[local73] * local58[local73] >> 12;
				}
			} else {
				@Pc(272) int local272;
				@Pc(268) int local268;
				@Pc(276) int local276;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static35.anInt670; local73++) {
						local268 = local66[local73];
						local272 = local62[local73];
						local276 = local70[local73];
						local38[local73] = local272 == 0 ? 4096 : (local50[local73] << 12) / local272;
						local42[local73] = local268 == 0 ? 4096 : (local54[local73] << 12) / local268;
						local46[local73] = local276 == 0 ? 4096 : (local58[local73] << 12) / local276;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static35.anInt670; local73++) {
						local38[local73] = 4096 - ((4096 - local62[local73]) * (4096 - local50[local73]) >> 12);
						local42[local73] = 4096 - ((4096 - local66[local73]) * (-local54[local73] + 4096) >> 12);
						local46[local73] = 4096 - ((4096 - local70[local73]) * (4096 - local58[local73]) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static35.anInt670; local73++) {
						local268 = local66[local73];
						local276 = local70[local73];
						local272 = local62[local73];
						local38[local73] = local272 < 2048 ? local272 * local50[local73] >> 11 : 4096 - ((4096 - local272) * (-local50[local73] + 4096) >> 11);
						local42[local73] = local268 < 2048 ? local54[local73] * local268 >> 11 : 4096 - ((4096 - local54[local73]) * (-local268 + 4096) >> 11);
						local46[local73] = local276 >= 2048 ? 4096 - ((4096 - local276) * (-local58[local73] + 4096) >> 11) : local58[local73] * local276 >> 11;
					}
				} else {
					@Pc(530) int local530;
					@Pc(538) int local538;
					@Pc(534) int local534;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static35.anInt670; local73++) {
							local530 = local50[local73];
							local534 = local58[local73];
							local538 = local54[local73];
							local38[local73] = local530 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local530);
							local42[local73] = local538 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local538);
							local46[local73] = local534 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local534);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static35.anInt670; local73++) {
							local538 = local54[local73];
							local530 = local50[local73];
							local534 = local58[local73];
							local38[local73] = local530 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local530;
							local42[local73] = local538 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local538;
							local46[local73] = local534 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local534;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static35.anInt670; local73++) {
							local534 = local58[local73];
							local530 = local50[local73];
							local272 = local62[local73];
							local276 = local70[local73];
							local538 = local54[local73];
							local268 = local66[local73];
							local38[local73] = local272 > local530 ? local530 : local272;
							local42[local73] = local268 <= local538 ? local268 : local538;
							local46[local73] = local534 < local276 ? local534 : local276;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static35.anInt670; local73++) {
							local534 = local58[local73];
							local538 = local54[local73];
							local276 = local70[local73];
							local272 = local62[local73];
							local530 = local50[local73];
							local268 = local66[local73];
							local38[local73] = local530 <= local272 ? local272 : local530;
							local42[local73] = local268 < local538 ? local538 : local268;
							local46[local73] = local534 <= local276 ? local276 : local534;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static35.anInt670; local73++) {
							local534 = local58[local73];
							local538 = local54[local73];
							local530 = local50[local73];
							local272 = local62[local73];
							local268 = local66[local73];
							local276 = local70[local73];
							local38[local73] = local272 < local530 ? local530 - local272 : local272 + -local530;
							local42[local73] = local268 >= local538 ? local268 - local538 : -local268 + local538;
							local46[local73] = local534 > local276 ? local534 - local276 : -local534 + local276;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static35.anInt670; local73++) {
							local534 = local58[local73];
							local272 = local62[local73];
							local538 = local54[local73];
							local530 = local50[local73];
							local276 = local70[local73];
							local268 = local66[local73];
							local38[local73] = local272 + local530 - (local272 * local530 >> 11);
							local42[local73] = local268 + local538 - (local268 * local538 >> 11);
							local46[local73] = local534 + local276 - (local276 * local534 >> 11);
						}
					}
				}
			}
		}
		return local18;
	}
}
