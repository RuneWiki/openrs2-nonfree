import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!na", name = "H", descriptor = "I")
	private int anInt3455 = 6;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(2, false);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(32) int[][] local32 = this.method4456(arg0, 0);
			@Pc(38) int[][] local38 = this.method4456(arg0, 1);
			@Pc(42) int[] local42 = local7[0];
			@Pc(46) int[] local46 = local7[2];
			@Pc(50) int[] local50 = local7[1];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[2];
			@Pc(74) int[] local74 = local38[1];
			@Pc(77) int local77 = this.anInt3455;
			if (local77 == 1) {
				for (local77 = 0; local77 < Static6.anInt4960; local77++) {
					local42[local77] = local54[local77] + local66[local77];
					local50[local77] = local58[local77] + local74[local77];
					local46[local77] = local70[local77] + local62[local77];
				}
			} else if (local77 == 2) {
				for (local77 = 0; local77 < Static6.anInt4960; local77++) {
					local42[local77] = local54[local77] - local66[local77];
					local50[local77] = local58[local77] - local74[local77];
					local46[local77] = local62[local77] - local70[local77];
				}
			} else if (local77 == 3) {
				for (local77 = 0; local77 < Static6.anInt4960; local77++) {
					local42[local77] = local66[local77] * local54[local77] >> 12;
					local50[local77] = local58[local77] * local74[local77] >> 12;
					local46[local77] = local62[local77] * local70[local77] >> 12;
				}
			} else {
				@Pc(275) int local275;
				@Pc(283) int local283;
				@Pc(279) int local279;
				if (local77 == 4) {
					for (local77 = 0; local77 < Static6.anInt4960; local77++) {
						local275 = local66[local77];
						local279 = local70[local77];
						local283 = local74[local77];
						local42[local77] = local275 == 0 ? 4096 : (local54[local77] << 12) / local275;
						local50[local77] = local283 == 0 ? 4096 : (local58[local77] << 12) / local283;
						local46[local77] = local279 == 0 ? 4096 : (local62[local77] << 12) / local279;
					}
				} else if (local77 == 5) {
					for (local77 = 0; local77 < Static6.anInt4960; local77++) {
						local42[local77] = 4096 - ((4096 - local54[local77]) * (-local66[local77] + 4096) >> 12);
						local50[local77] = 4096 - ((4096 - local74[local77]) * (-local58[local77] + 4096) >> 12);
						local46[local77] = 4096 - ((4096 - local62[local77]) * (-local70[local77] + 4096) >> 12);
					}
				} else if (local77 == 6) {
					for (local77 = 0; local77 < Static6.anInt4960; local77++) {
						local283 = local74[local77];
						local279 = local70[local77];
						local275 = local66[local77];
						local42[local77] = local275 >= 2048 ? 4096 - ((4096 - local54[local77]) * (-local275 + 4096) >> 11) : local54[local77] * local275 >> 11;
						local50[local77] = local283 < 2048 ? local283 * local58[local77] >> 11 : 4096 - ((4096 - local58[local77]) * (-local283 + 4096) >> 11);
						local46[local77] = local279 >= 2048 ? 4096 - ((4096 - local62[local77]) * (-local279 + 4096) >> 11) : local62[local77] * local279 >> 11;
					}
				} else {
					@Pc(538) int local538;
					@Pc(542) int local542;
					@Pc(534) int local534;
					if (local77 == 7) {
						for (local77 = 0; local77 < Static6.anInt4960; local77++) {
							local534 = local62[local77];
							local538 = local54[local77];
							local542 = local58[local77];
							local42[local77] = local538 == 4096 ? 4096 : (local66[local77] << 12) / (4096 - local538);
							local50[local77] = local542 == 4096 ? 4096 : (local74[local77] << 12) / (4096 - local542);
							local46[local77] = local534 == 4096 ? 4096 : (local70[local77] << 12) / (4096 - local534);
						}
					} else if (local77 == 8) {
						for (local77 = 0; local77 < Static6.anInt4960; local77++) {
							local538 = local54[local77];
							local534 = local62[local77];
							local542 = local58[local77];
							local42[local77] = local538 == 0 ? 0 : 4096 - (4096 - local66[local77] << 12) / local538;
							local50[local77] = local542 == 0 ? 0 : 4096 - (4096 - local74[local77] << 12) / local542;
							local46[local77] = local534 == 0 ? 0 : 4096 - (4096 - local70[local77] << 12) / local534;
						}
					} else if (local77 == 9) {
						for (local77 = 0; local77 < Static6.anInt4960; local77++) {
							local279 = local70[local77];
							local538 = local54[local77];
							local542 = local58[local77];
							local275 = local66[local77];
							local283 = local74[local77];
							local534 = local62[local77];
							local42[local77] = local538 >= local275 ? local275 : local538;
							local50[local77] = local283 <= local542 ? local283 : local542;
							local46[local77] = local534 >= local279 ? local279 : local534;
						}
					} else if (local77 == 10) {
						for (local77 = 0; local77 < Static6.anInt4960; local77++) {
							local534 = local62[local77];
							local279 = local70[local77];
							local542 = local58[local77];
							local283 = local74[local77];
							local275 = local66[local77];
							local538 = local54[local77];
							local42[local77] = local275 < local538 ? local538 : local275;
							local50[local77] = local283 < local542 ? local542 : local283;
							local46[local77] = local534 <= local279 ? local279 : local534;
						}
					} else if (local77 == 11) {
						for (local77 = 0; local77 < Static6.anInt4960; local77++) {
							local283 = local74[local77];
							local534 = local62[local77];
							local275 = local66[local77];
							local279 = local70[local77];
							local542 = local58[local77];
							local538 = local54[local77];
							local42[local77] = local538 <= local275 ? local275 - local538 : local538 + -local275;
							local50[local77] = local542 <= local283 ? local283 - local542 : -local283 + local542;
							local46[local77] = local534 <= local279 ? local279 - local534 : local534 - local279;
						}
					} else if (local77 == 12) {
						for (local77 = 0; local77 < Static6.anInt4960; local77++) {
							local542 = local58[local77];
							local279 = local70[local77];
							local538 = local54[local77];
							local534 = local62[local77];
							local275 = local66[local77];
							local283 = local74[local77];
							local42[local77] = local538 + local275 - (local538 * local275 >> 11);
							local50[local77] = local283 + local542 - (local283 * local542 >> 11);
							local46[local77] = local534 + local279 - (local279 * local534 >> 11);
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(21) int[] local21 = this.method4464(arg0, 0);
			@Pc(27) int[] local27 = this.method4464(arg0, 1);
			@Pc(30) int local30 = this.anInt3455;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static6.anInt4960; local30++) {
					local11[local30] = local27[local30] + local21[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static6.anInt4960; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static6.anInt4960; local30++) {
					local11[local30] = local21[local30] * local27[local30] >> 12;
				}
			} else {
				@Pc(177) int local177;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static6.anInt4960; local30++) {
						local177 = local27[local30];
						local11[local30] = local177 == 0 ? 4096 : (local21[local30] << 12) / local177;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static6.anInt4960; local30++) {
						local11[local30] = 4096 - ((4096 - local21[local30]) * (-local27[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static6.anInt4960; local30++) {
						local177 = local27[local30];
						local11[local30] = local177 < 2048 ? local177 * local21[local30] >> 11 : 4096 - ((4096 - local177) * (-local21[local30] + 4096) >> 11);
					}
				} else {
					@Pc(291) int local291;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static6.anInt4960; local30++) {
							local291 = local21[local30];
							local11[local30] = local291 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local291);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static6.anInt4960; local30++) {
							local291 = local21[local30];
							local11[local30] = local291 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local291;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static6.anInt4960; local30++) {
							local291 = local21[local30];
							local177 = local27[local30];
							local11[local30] = local177 <= local291 ? local177 : local291;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static6.anInt4960; local30++) {
							local177 = local27[local30];
							local291 = local21[local30];
							local11[local30] = local291 <= local177 ? local177 : local291;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static6.anInt4960; local30++) {
							local291 = local21[local30];
							local177 = local27[local30];
							local11[local30] = local291 > local177 ? local291 - local177 : -local291 + local177;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static6.anInt4960; local30++) {
							local291 = local21[local30];
							local177 = local27[local30];
							local11[local30] = local177 + local291 - (local177 * local291 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3455 = arg0.method1853();
		} else if (arg1 == 1) {
			this.aBoolean505 = arg0.method1853() == 1;
		}
	}
}
