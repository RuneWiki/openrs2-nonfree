import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
	private int anInt4474 = 6;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(2, false);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(28) int[][] local28 = this.method4457(0, arg0);
			@Pc(34) int[][] local34 = this.method4457(1, arg0);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			@Pc(50) int[] local50 = local28[0];
			@Pc(54) int[] local54 = local28[2];
			@Pc(58) int[] local58 = local28[1];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt4474;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static131.anInt2513; local73++) {
					local38[local73] = local50[local73] + local62[local73];
					local42[local73] = local58[local73] + local66[local73];
					local46[local73] = local70[local73] + local54[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static131.anInt2513; local73++) {
					local38[local73] = local50[local73] - local62[local73];
					local42[local73] = local58[local73] - local66[local73];
					local46[local73] = local54[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static131.anInt2513; local73++) {
					local38[local73] = local50[local73] * local62[local73] >> 12;
					local42[local73] = local58[local73] * local66[local73] >> 12;
					local46[local73] = local54[local73] * local70[local73] >> 12;
				}
			} else {
				@Pc(283) int local283;
				@Pc(287) int local287;
				@Pc(279) int local279;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static131.anInt2513; local73++) {
						local279 = local70[local73];
						local283 = local62[local73];
						local287 = local66[local73];
						local38[local73] = local283 == 0 ? 4096 : (local50[local73] << 12) / local283;
						local42[local73] = local287 == 0 ? 4096 : (local58[local73] << 12) / local287;
						local46[local73] = local279 == 0 ? 4096 : (local54[local73] << 12) / local279;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static131.anInt2513; local73++) {
						local38[local73] = 4096 - ((4096 - local62[local73]) * (-local50[local73] + 4096) >> 12);
						local42[local73] = 4096 - ((4096 - local66[local73]) * (-local58[local73] + 4096) >> 12);
						local46[local73] = 4096 - ((4096 - local70[local73]) * (-local54[local73] + 4096) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static131.anInt2513; local73++) {
						local287 = local66[local73];
						local283 = local62[local73];
						local279 = local70[local73];
						local38[local73] = local283 >= 2048 ? 4096 - ((4096 - local283) * (-local50[local73] + 4096) >> 11) : local50[local73] * local283 >> 11;
						local42[local73] = local287 >= 2048 ? 4096 - ((4096 - local58[local73]) * (-local287 + 4096) >> 11) : local58[local73] * local287 >> 11;
						local46[local73] = local279 < 2048 ? local279 * local54[local73] >> 11 : 4096 - ((4096 - local54[local73]) * (-local279 + 4096) >> 11);
					}
				} else {
					@Pc(545) int local545;
					@Pc(549) int local549;
					@Pc(541) int local541;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static131.anInt2513; local73++) {
							local541 = local54[local73];
							local545 = local50[local73];
							local549 = local58[local73];
							local38[local73] = local545 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local545);
							local42[local73] = local549 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local549);
							local46[local73] = local541 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local541);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static131.anInt2513; local73++) {
							local545 = local50[local73];
							local549 = local58[local73];
							local541 = local54[local73];
							local38[local73] = local545 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local545;
							local42[local73] = local549 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local549;
							local46[local73] = local541 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local541;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static131.anInt2513; local73++) {
							local545 = local50[local73];
							local549 = local58[local73];
							local541 = local54[local73];
							local279 = local70[local73];
							local283 = local62[local73];
							local287 = local66[local73];
							local38[local73] = local545 >= local283 ? local283 : local545;
							local42[local73] = local287 > local549 ? local549 : local287;
							local46[local73] = local541 >= local279 ? local279 : local541;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static131.anInt2513; local73++) {
							local279 = local70[local73];
							local287 = local66[local73];
							local549 = local58[local73];
							local541 = local54[local73];
							local545 = local50[local73];
							local283 = local62[local73];
							local38[local73] = local283 >= local545 ? local283 : local545;
							local42[local73] = local287 < local549 ? local549 : local287;
							local46[local73] = local541 <= local279 ? local279 : local541;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static131.anInt2513; local73++) {
							local545 = local50[local73];
							local279 = local70[local73];
							local287 = local66[local73];
							local283 = local62[local73];
							local549 = local58[local73];
							local541 = local54[local73];
							local38[local73] = local545 <= local283 ? local283 - local545 : -local283 + local545;
							local42[local73] = local549 <= local287 ? local287 - local549 : -local287 + local549;
							local46[local73] = local541 <= local279 ? local279 - local541 : local541 + -local279;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static131.anInt2513; local73++) {
							local279 = local70[local73];
							local541 = local54[local73];
							local545 = local50[local73];
							local283 = local62[local73];
							local287 = local66[local73];
							local549 = local58[local73];
							local38[local73] = local545 + local283 - (local545 * local283 >> 11);
							local42[local73] = local549 + local287 - (local287 * local549 >> 11);
							local46[local73] = local279 + local541 - (local541 * local279 >> 11);
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4474 = arg0.method3122();
		} else if (arg1 == 1) {
			this.aBoolean434 = arg0.method3122() == 1;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(27) int[] local27 = this.method4450(0, arg0);
			@Pc(33) int[] local33 = this.method4450(1, arg0);
			@Pc(36) int local36 = this.anInt4474;
			if (local36 == 1) {
				for (local36 = 0; local36 < Static131.anInt2513; local36++) {
					local7[local36] = local27[local36] + local33[local36];
				}
			} else if (local36 == 2) {
				for (local36 = 0; local36 < Static131.anInt2513; local36++) {
					local7[local36] = local27[local36] - local33[local36];
				}
			} else if (local36 == 3) {
				for (local36 = 0; local36 < Static131.anInt2513; local36++) {
					local7[local36] = local27[local36] * local33[local36] >> 12;
				}
			} else {
				@Pc(177) int local177;
				if (local36 == 4) {
					for (local36 = 0; local36 < Static131.anInt2513; local36++) {
						local177 = local33[local36];
						local7[local36] = local177 == 0 ? 4096 : (local27[local36] << 12) / local177;
					}
				} else if (local36 == 5) {
					for (local36 = 0; local36 < Static131.anInt2513; local36++) {
						local7[local36] = 4096 - ((4096 - local33[local36]) * (-local27[local36] + 4096) >> 12);
					}
				} else if (local36 == 6) {
					for (local36 = 0; local36 < Static131.anInt2513; local36++) {
						local177 = local33[local36];
						local7[local36] = local177 >= 2048 ? 4096 - ((4096 - local27[local36]) * (-local177 + 4096) >> 11) : local27[local36] * local177 >> 11;
					}
				} else {
					@Pc(289) int local289;
					if (local36 == 7) {
						for (local36 = 0; local36 < Static131.anInt2513; local36++) {
							local289 = local27[local36];
							local7[local36] = local289 == 4096 ? 4096 : (local33[local36] << 12) / (4096 - local289);
						}
					} else if (local36 == 8) {
						for (local36 = 0; local36 < Static131.anInt2513; local36++) {
							local289 = local27[local36];
							local7[local36] = local289 == 0 ? 0 : 4096 - (4096 - local33[local36] << 12) / local289;
						}
					} else if (local36 == 9) {
						for (local36 = 0; local36 < Static131.anInt2513; local36++) {
							local177 = local33[local36];
							local289 = local27[local36];
							local7[local36] = local177 <= local289 ? local177 : local289;
						}
					} else if (local36 == 10) {
						for (local36 = 0; local36 < Static131.anInt2513; local36++) {
							local177 = local33[local36];
							local289 = local27[local36];
							local7[local36] = local177 >= local289 ? local177 : local289;
						}
					} else if (local36 == 11) {
						for (local36 = 0; local36 < Static131.anInt2513; local36++) {
							local177 = local33[local36];
							local289 = local27[local36];
							local7[local36] = local177 >= local289 ? local177 - local289 : local289 + -local177;
						}
					} else if (local36 == 12) {
						for (local36 = 0; local36 < Static131.anInt2513; local36++) {
							local177 = local33[local36];
							local289 = local27[local36];
							local7[local36] = local289 + local177 - (local177 * local289 >> 11);
						}
					}
				}
			}
		}
		return local7;
	}
}
