import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class4_Sub1_Sub24 extends Class4_Sub1 {

	@OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
	private int anInt3656 = 6;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub24() {
		super(2, false);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(22) int[] local22 = this.method4538(0, arg0);
			@Pc(28) int[] local28 = this.method4538(1, arg0);
			@Pc(31) int local31 = this.anInt3656;
			if (local31 == 1) {
				for (local31 = 0; local31 < Static68.anInt1753; local31++) {
					local7[local31] = local28[local31] + local22[local31];
				}
			} else if (local31 == 2) {
				for (local31 = 0; local31 < Static68.anInt1753; local31++) {
					local7[local31] = local22[local31] - local28[local31];
				}
			} else if (local31 == 3) {
				for (local31 = 0; local31 < Static68.anInt1753; local31++) {
					local7[local31] = local22[local31] * local28[local31] >> 12;
				}
			} else {
				@Pc(177) int local177;
				if (local31 == 4) {
					for (local31 = 0; local31 < Static68.anInt1753; local31++) {
						local177 = local28[local31];
						local7[local31] = local177 == 0 ? 4096 : (local22[local31] << 12) / local177;
					}
				} else if (local31 == 5) {
					for (local31 = 0; local31 < Static68.anInt1753; local31++) {
						local7[local31] = 4096 - ((4096 - local22[local31]) * (-local28[local31] + 4096) >> 12);
					}
				} else if (local31 == 6) {
					for (local31 = 0; local31 < Static68.anInt1753; local31++) {
						local177 = local28[local31];
						local7[local31] = local177 < 2048 ? local177 * local22[local31] >> 11 : 4096 - ((4096 - local22[local31]) * (-local177 + 4096) >> 11);
					}
				} else {
					@Pc(287) int local287;
					if (local31 == 7) {
						for (local31 = 0; local31 < Static68.anInt1753; local31++) {
							local287 = local22[local31];
							local7[local31] = local287 == 4096 ? 4096 : (local28[local31] << 12) / (4096 - local287);
						}
					} else if (local31 == 8) {
						for (local31 = 0; local31 < Static68.anInt1753; local31++) {
							local287 = local22[local31];
							local7[local31] = local287 == 0 ? 0 : 4096 - (4096 - local28[local31] << 12) / local287;
						}
					} else if (local31 == 9) {
						for (local31 = 0; local31 < Static68.anInt1753; local31++) {
							local287 = local22[local31];
							local177 = local28[local31];
							local7[local31] = local177 > local287 ? local287 : local177;
						}
					} else if (local31 == 10) {
						for (local31 = 0; local31 < Static68.anInt1753; local31++) {
							local177 = local28[local31];
							local287 = local22[local31];
							local7[local31] = local287 <= local177 ? local177 : local287;
						}
					} else if (local31 == 11) {
						for (local31 = 0; local31 < Static68.anInt1753; local31++) {
							local287 = local22[local31];
							local177 = local28[local31];
							local7[local31] = local177 < local287 ? local287 - local177 : -local287 + local177;
						}
					} else if (local31 == 12) {
						for (local31 = 0; local31 < Static68.anInt1753; local31++) {
							local177 = local28[local31];
							local287 = local22[local31];
							local7[local31] = local287 + local177 - (local287 * local177 >> 11);
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(26) int[][] local26 = this.method4549(0, arg0);
			@Pc(34) int[][] local34 = this.method4549(1, arg0);
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local26[0];
			@Pc(54) int[] local54 = local26[2];
			@Pc(58) int[] local58 = local16[1];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt3656;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static68.anInt1753; local73++) {
					local42[local73] = local62[local73] + local50[local73];
					local58[local73] = local66[local73] + local38[local73];
					local46[local73] = local54[local73] + local70[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static68.anInt1753; local73++) {
					local42[local73] = local50[local73] - local62[local73];
					local58[local73] = local38[local73] - local66[local73];
					local46[local73] = local54[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static68.anInt1753; local73++) {
					local42[local73] = local62[local73] * local50[local73] >> 12;
					local58[local73] = local66[local73] * local38[local73] >> 12;
					local46[local73] = local54[local73] * local70[local73] >> 12;
				}
			} else {
				@Pc(277) int local277;
				@Pc(281) int local281;
				@Pc(285) int local285;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static68.anInt1753; local73++) {
						local277 = local62[local73];
						local281 = local66[local73];
						local285 = local70[local73];
						local42[local73] = local277 == 0 ? 4096 : (local50[local73] << 12) / local277;
						local58[local73] = local281 == 0 ? 4096 : (local38[local73] << 12) / local281;
						local46[local73] = local285 == 0 ? 4096 : (local54[local73] << 12) / local285;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static68.anInt1753; local73++) {
						local42[local73] = 4096 - ((4096 - local62[local73]) * (4096 - local50[local73]) >> 12);
						local58[local73] = 4096 - ((4096 - local66[local73]) * (4096 - local38[local73]) >> 12);
						local46[local73] = 4096 - ((4096 - local54[local73]) * (4096 - local70[local73]) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static68.anInt1753; local73++) {
						local285 = local70[local73];
						local281 = local66[local73];
						local277 = local62[local73];
						local42[local73] = local277 < 2048 ? local277 * local50[local73] >> 11 : 4096 - ((4096 - local277) * (-local50[local73] + 4096) >> 11);
						local58[local73] = local281 < 2048 ? local281 * local38[local73] >> 11 : 4096 - ((4096 - local38[local73]) * (-local281 + 4096) >> 11);
						local46[local73] = local285 >= 2048 ? 4096 - ((4096 - local54[local73]) * (4096 - local285) >> 11) : local54[local73] * local285 >> 11;
					}
				} else {
					@Pc(544) int local544;
					@Pc(536) int local536;
					@Pc(540) int local540;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static68.anInt1753; local73++) {
							local536 = local38[local73];
							local540 = local54[local73];
							local544 = local50[local73];
							local42[local73] = local544 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local544);
							local58[local73] = local536 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local536);
							local46[local73] = local540 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local540);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static68.anInt1753; local73++) {
							local544 = local50[local73];
							local540 = local54[local73];
							local536 = local38[local73];
							local42[local73] = local544 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local544;
							local58[local73] = local536 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local536;
							local46[local73] = local540 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local540;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static68.anInt1753; local73++) {
							local277 = local62[local73];
							local285 = local70[local73];
							local540 = local54[local73];
							local544 = local50[local73];
							local281 = local66[local73];
							local536 = local38[local73];
							local42[local73] = local277 <= local544 ? local277 : local544;
							local58[local73] = local281 <= local536 ? local281 : local536;
							local46[local73] = local540 >= local285 ? local285 : local540;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static68.anInt1753; local73++) {
							local544 = local50[local73];
							local277 = local62[local73];
							local281 = local66[local73];
							local540 = local54[local73];
							local536 = local38[local73];
							local285 = local70[local73];
							local42[local73] = local277 < local544 ? local544 : local277;
							local58[local73] = local536 <= local281 ? local281 : local536;
							local46[local73] = local285 < local540 ? local540 : local285;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static68.anInt1753; local73++) {
							local281 = local66[local73];
							local536 = local38[local73];
							local544 = local50[local73];
							local285 = local70[local73];
							local540 = local54[local73];
							local277 = local62[local73];
							local42[local73] = local544 <= local277 ? local277 - local544 : -local277 + local544;
							local58[local73] = local281 >= local536 ? local281 - local536 : -local281 + local536;
							local46[local73] = local285 < local540 ? local540 - local285 : local285 + -local540;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static68.anInt1753; local73++) {
							local285 = local70[local73];
							local540 = local54[local73];
							local544 = local50[local73];
							local281 = local66[local73];
							local536 = local38[local73];
							local277 = local62[local73];
							local42[local73] = local277 + local544 - (local544 * local277 >> 11);
							local58[local73] = local536 + local281 - (local536 * local281 >> 11);
							local46[local73] = local540 + local285 - (local540 * local285 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt3656 = arg1.method3110();
		} else if (arg0 == 1) {
			this.aBoolean392 = arg1.method3110() == 1;
		}
	}
}
