import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class3_Sub2_Sub19 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
	private int anInt2582 = 6;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub19() {
		super(2, false);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt2582 = arg1.method3915();
		} else if (arg0 == 1) {
			this.aBoolean430 = arg1.method3915() == 1;
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(28) int[][] local28 = this.method4965(arg0, 0);
			@Pc(34) int[][] local34 = this.method4965(arg0, 1);
			@Pc(38) int[] local38 = local13[0];
			@Pc(42) int[] local42 = local13[1];
			@Pc(46) int[] local46 = local13[2];
			@Pc(50) int[] local50 = local28[1];
			@Pc(54) int[] local54 = local28[0];
			@Pc(58) int[] local58 = local34[0];
			@Pc(62) int[] local62 = local34[1];
			@Pc(66) int[] local66 = local28[2];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt2582;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static22.anInt421; local73++) {
					local38[local73] = local54[local73] + local58[local73];
					local42[local73] = local62[local73] + local50[local73];
					local46[local73] = local66[local73] + local70[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static22.anInt421; local73++) {
					local38[local73] = local54[local73] - local58[local73];
					local42[local73] = local50[local73] - local62[local73];
					local46[local73] = local66[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static22.anInt421; local73++) {
					local38[local73] = local54[local73] * local58[local73] >> 12;
					local42[local73] = local62[local73] * local50[local73] >> 12;
					local46[local73] = local70[local73] * local66[local73] >> 12;
				}
			} else {
				@Pc(286) int local286;
				@Pc(290) int local290;
				@Pc(294) int local294;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static22.anInt421; local73++) {
						local286 = local58[local73];
						local290 = local62[local73];
						local294 = local70[local73];
						local38[local73] = local286 == 0 ? 4096 : (local54[local73] << 12) / local286;
						local42[local73] = local290 == 0 ? 4096 : (local50[local73] << 12) / local290;
						local46[local73] = local294 == 0 ? 4096 : (local66[local73] << 12) / local294;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static22.anInt421; local73++) {
						local38[local73] = 4096 - ((4096 - local58[local73]) * (-local54[local73] + 4096) >> 12);
						local42[local73] = 4096 - ((4096 - local50[local73]) * (-local62[local73] + 4096) >> 12);
						local46[local73] = 4096 - ((4096 - local66[local73]) * (-local70[local73] + 4096) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static22.anInt421; local73++) {
						local290 = local62[local73];
						local294 = local70[local73];
						local286 = local58[local73];
						local38[local73] = local286 < 2048 ? local286 * local54[local73] >> 11 : 4096 - ((4096 - local54[local73]) * (-local286 + 4096) >> 11);
						local42[local73] = local290 >= 2048 ? 4096 - ((4096 - local290) * (-local50[local73] + 4096) >> 11) : local290 * local50[local73] >> 11;
						local46[local73] = local294 >= 2048 ? 4096 - ((4096 - local66[local73]) * (-local294 + 4096) >> 11) : local294 * local66[local73] >> 11;
					}
				} else {
					@Pc(545) int local545;
					@Pc(549) int local549;
					@Pc(553) int local553;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static22.anInt421; local73++) {
							local545 = local54[local73];
							local549 = local50[local73];
							local553 = local66[local73];
							local38[local73] = local545 == 4096 ? 4096 : (local58[local73] << 12) / (4096 - local545);
							local42[local73] = local549 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local549);
							local46[local73] = local553 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local553);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static22.anInt421; local73++) {
							local553 = local66[local73];
							local549 = local50[local73];
							local545 = local54[local73];
							local38[local73] = local545 == 0 ? 0 : 4096 - (4096 - local58[local73] << 12) / local545;
							local42[local73] = local549 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local549;
							local46[local73] = local553 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local553;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static22.anInt421; local73++) {
							local553 = local66[local73];
							local545 = local54[local73];
							local549 = local50[local73];
							local286 = local58[local73];
							local294 = local70[local73];
							local290 = local62[local73];
							local38[local73] = local545 >= local286 ? local286 : local545;
							local42[local73] = local549 < local290 ? local549 : local290;
							local46[local73] = local294 <= local553 ? local294 : local553;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static22.anInt421; local73++) {
							local549 = local50[local73];
							local290 = local62[local73];
							local294 = local70[local73];
							local286 = local58[local73];
							local545 = local54[local73];
							local553 = local66[local73];
							local38[local73] = local545 <= local286 ? local286 : local545;
							local42[local73] = local290 < local549 ? local549 : local290;
							local46[local73] = local553 <= local294 ? local294 : local553;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static22.anInt421; local73++) {
							local549 = local50[local73];
							local553 = local66[local73];
							local545 = local54[local73];
							local294 = local70[local73];
							local290 = local62[local73];
							local286 = local58[local73];
							local38[local73] = local545 > local286 ? local545 - local286 : -local545 + local286;
							local42[local73] = local549 > local290 ? local549 - local290 : -local549 + local290;
							local46[local73] = local294 >= local553 ? local294 - local553 : -local294 + local553;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static22.anInt421; local73++) {
							local549 = local50[local73];
							local286 = local58[local73];
							local290 = local62[local73];
							local545 = local54[local73];
							local553 = local66[local73];
							local294 = local70[local73];
							local38[local73] = local545 + local286 - (local545 * local286 >> 11);
							local42[local73] = local549 + local290 - (local290 * local549 >> 11);
							local46[local73] = local553 + local294 - (local553 * local294 >> 11);
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(28) int[] local28 = this.method4954(arg0, 0);
			@Pc(34) int[] local34 = this.method4954(arg0, 1);
			@Pc(37) int local37 = this.anInt2582;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static22.anInt421; local37++) {
					local17[local37] = local34[local37] + local28[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static22.anInt421; local37++) {
					local17[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static22.anInt421; local37++) {
					local17[local37] = local28[local37] * local34[local37] >> 12;
				}
			} else {
				@Pc(180) int local180;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static22.anInt421; local37++) {
						local180 = local34[local37];
						local17[local37] = local180 == 0 ? 4096 : (local28[local37] << 12) / local180;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static22.anInt421; local37++) {
						local17[local37] = 4096 - ((4096 - local34[local37]) * (-local28[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static22.anInt421; local37++) {
						local180 = local34[local37];
						local17[local37] = local180 >= 2048 ? 4096 - ((4096 - local180) * (-local28[local37] + 4096) >> 11) : local180 * local28[local37] >> 11;
					}
				} else {
					@Pc(288) int local288;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static22.anInt421; local37++) {
							local288 = local28[local37];
							local17[local37] = local288 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local288);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static22.anInt421; local37++) {
							local288 = local28[local37];
							local17[local37] = local288 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local288;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static22.anInt421; local37++) {
							local180 = local34[local37];
							local288 = local28[local37];
							local17[local37] = local288 < local180 ? local288 : local180;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static22.anInt421; local37++) {
							local180 = local34[local37];
							local288 = local28[local37];
							local17[local37] = local288 > local180 ? local288 : local180;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static22.anInt421; local37++) {
							local288 = local28[local37];
							local180 = local34[local37];
							local17[local37] = local180 >= local288 ? local180 - local288 : local288 + -local180;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static22.anInt421; local37++) {
							local288 = local28[local37];
							local180 = local34[local37];
							local17[local37] = local180 + local288 - (local288 * local180 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}
}
