import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class3_Sub2_Sub34 extends Class3_Sub2 {

	@OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
	private int anInt6465 = 6;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub34() {
		super(2, false);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(26) int[][] local26 = this.method5899(0, arg0);
			@Pc(34) int[][] local34 = this.method5899(1, arg0);
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			@Pc(50) int[] local50 = local26[0];
			@Pc(54) int[] local54 = local26[1];
			@Pc(58) int[] local58 = local26[2];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt6465;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static406.anInt6694; local73++) {
					local38[local73] = local62[local73] + local50[local73];
					local42[local73] = local66[local73] + local54[local73];
					local46[local73] = local70[local73] + local58[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static406.anInt6694; local73++) {
					local38[local73] = local50[local73] - local62[local73];
					local42[local73] = local54[local73] - local66[local73];
					local46[local73] = local58[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static406.anInt6694; local73++) {
					local38[local73] = local62[local73] * local50[local73] >> 12;
					local42[local73] = local54[local73] * local66[local73] >> 12;
					local46[local73] = local58[local73] * local70[local73] >> 12;
				}
			} else {
				@Pc(260) int local260;
				@Pc(264) int local264;
				@Pc(268) int local268;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static406.anInt6694; local73++) {
						local260 = local62[local73];
						local264 = local66[local73];
						local268 = local70[local73];
						local38[local73] = local260 == 0 ? 4096 : (local50[local73] << 12) / local260;
						local42[local73] = local264 == 0 ? 4096 : (local54[local73] << 12) / local264;
						local46[local73] = local268 == 0 ? 4096 : (local58[local73] << 12) / local268;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static406.anInt6694; local73++) {
						local38[local73] = 4096 - ((4096 - local62[local73]) * (-local50[local73] + 4096) >> 12);
						local42[local73] = 4096 - ((4096 - local54[local73]) * (-local66[local73] + 4096) >> 12);
						local46[local73] = 4096 - ((4096 - local70[local73]) * (-local58[local73] + 4096) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static406.anInt6694; local73++) {
						local268 = local70[local73];
						local264 = local66[local73];
						local260 = local62[local73];
						local38[local73] = local260 >= 2048 ? 4096 - ((4096 - local50[local73]) * (4096 - local260) >> 11) : local50[local73] * local260 >> 11;
						local42[local73] = local264 < 2048 ? local54[local73] * local264 >> 11 : 4096 - ((4096 - local54[local73]) * (4096 - local264) >> 11);
						local46[local73] = local268 < 2048 ? local268 * local58[local73] >> 11 : 4096 - ((4096 - local58[local73]) * (4096 - local268) >> 11);
					}
				} else {
					@Pc(517) int local517;
					@Pc(513) int local513;
					@Pc(521) int local521;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static406.anInt6694; local73++) {
							local513 = local54[local73];
							local517 = local50[local73];
							local521 = local58[local73];
							local38[local73] = local517 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local517);
							local42[local73] = local513 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local513);
							local46[local73] = local521 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local521);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static406.anInt6694; local73++) {
							local521 = local58[local73];
							local517 = local50[local73];
							local513 = local54[local73];
							local38[local73] = local517 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local517;
							local42[local73] = local513 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local513;
							local46[local73] = local521 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local521;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static406.anInt6694; local73++) {
							local517 = local50[local73];
							local521 = local58[local73];
							local513 = local54[local73];
							local264 = local66[local73];
							local268 = local70[local73];
							local260 = local62[local73];
							local38[local73] = local517 >= local260 ? local260 : local517;
							local42[local73] = local513 >= local264 ? local264 : local513;
							local46[local73] = local521 < local268 ? local521 : local268;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static406.anInt6694; local73++) {
							local260 = local62[local73];
							local513 = local54[local73];
							local517 = local50[local73];
							local264 = local66[local73];
							local521 = local58[local73];
							local268 = local70[local73];
							local38[local73] = local260 >= local517 ? local260 : local517;
							local42[local73] = local513 > local264 ? local513 : local264;
							local46[local73] = local521 > local268 ? local521 : local268;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static406.anInt6694; local73++) {
							local521 = local58[local73];
							local264 = local66[local73];
							local513 = local54[local73];
							local260 = local62[local73];
							local268 = local70[local73];
							local517 = local50[local73];
							local38[local73] = local260 < local517 ? local517 - local260 : local260 - local517;
							local42[local73] = local513 <= local264 ? local264 - local513 : -local264 + local513;
							local46[local73] = local268 < local521 ? local521 - local268 : local268 - local521;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static406.anInt6694; local73++) {
							local268 = local70[local73];
							local521 = local58[local73];
							local264 = local66[local73];
							local517 = local50[local73];
							local260 = local62[local73];
							local513 = local54[local73];
							local38[local73] = local260 + local517 - (local517 * local260 >> 11);
							local42[local73] = local513 + local264 - (local264 * local513 >> 11);
							local46[local73] = local521 + local268 - (local521 * local268 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(25) int[] local25 = this.method5894(0, arg0);
			@Pc(31) int[] local31 = this.method5894(1, arg0);
			@Pc(34) int local34 = this.anInt6465;
			if (local34 == 1) {
				for (local34 = 0; local34 < Static406.anInt6694; local34++) {
					local11[local34] = local31[local34] + local25[local34];
				}
			} else if (local34 == 2) {
				for (local34 = 0; local34 < Static406.anInt6694; local34++) {
					local11[local34] = local25[local34] - local31[local34];
				}
			} else if (local34 == 3) {
				for (local34 = 0; local34 < Static406.anInt6694; local34++) {
					local11[local34] = local31[local34] * local25[local34] >> 12;
				}
			} else {
				@Pc(157) int local157;
				if (local34 == 4) {
					for (local34 = 0; local34 < Static406.anInt6694; local34++) {
						local157 = local31[local34];
						local11[local34] = local157 == 0 ? 4096 : (local25[local34] << 12) / local157;
					}
				} else if (local34 == 5) {
					for (local34 = 0; local34 < Static406.anInt6694; local34++) {
						local11[local34] = 4096 - ((4096 - local25[local34]) * (-local31[local34] + 4096) >> 12);
					}
				} else if (local34 == 6) {
					for (local34 = 0; local34 < Static406.anInt6694; local34++) {
						local157 = local31[local34];
						local11[local34] = local157 >= 2048 ? 4096 - ((4096 - local25[local34]) * (4096 - local157) >> 11) : local25[local34] * local157 >> 11;
					}
				} else {
					@Pc(268) int local268;
					if (local34 == 7) {
						for (local34 = 0; local34 < Static406.anInt6694; local34++) {
							local268 = local25[local34];
							local11[local34] = local268 == 4096 ? 4096 : (local31[local34] << 12) / (4096 - local268);
						}
					} else if (local34 == 8) {
						for (local34 = 0; local34 < Static406.anInt6694; local34++) {
							local268 = local25[local34];
							local11[local34] = local268 == 0 ? 0 : 4096 - (4096 - local31[local34] << 12) / local268;
						}
					} else if (local34 == 9) {
						for (local34 = 0; local34 < Static406.anInt6694; local34++) {
							local268 = local25[local34];
							local157 = local31[local34];
							local11[local34] = local157 <= local268 ? local157 : local268;
						}
					} else if (local34 == 10) {
						for (local34 = 0; local34 < Static406.anInt6694; local34++) {
							local268 = local25[local34];
							local157 = local31[local34];
							local11[local34] = local268 > local157 ? local268 : local157;
						}
					} else if (local34 == 11) {
						for (local34 = 0; local34 < Static406.anInt6694; local34++) {
							local157 = local31[local34];
							local268 = local25[local34];
							local11[local34] = local268 > local157 ? local268 - local157 : -local268 + local157;
						}
					} else if (local34 == 12) {
						for (local34 = 0; local34 < Static406.anInt6694; local34++) {
							local157 = local31[local34];
							local268 = local25[local34];
							local11[local34] = local157 + local268 - (local157 * local268 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6465 = arg0.method2582();
		} else if (arg1 == 1) {
			super.aBoolean650 = arg0.method2582() == 1;
		}
	}
}
