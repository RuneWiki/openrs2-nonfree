import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class2_Sub3_Sub24 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pda", name = "M", descriptor = "I")
	private int anInt7948 = 6;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub24() {
		super(2, false);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7948 = arg0.method8383();
		} else if (arg1 == 1) {
			super.aBoolean748 = arg0.method8383() == 1;
		}
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(28) int[][] local28 = this.method9147(arg0, 0);
			@Pc(34) int[][] local34 = this.method9147(arg0, 1);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			@Pc(50) int[] local50 = local28[0];
			@Pc(54) int[] local54 = local28[1];
			@Pc(58) int[] local58 = local28[2];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt7948;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static222.anInt4971; local73++) {
					local38[local73] = local62[local73] + local50[local73];
					local42[local73] = local54[local73] + local66[local73];
					local46[local73] = local58[local73] + local70[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static222.anInt4971; local73++) {
					local38[local73] = local50[local73] - local62[local73];
					local42[local73] = local54[local73] - local66[local73];
					local46[local73] = local58[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static222.anInt4971; local73++) {
					local38[local73] = local62[local73] * local50[local73] >> 12;
					local42[local73] = local66[local73] * local54[local73] >> 12;
					local46[local73] = local58[local73] * local70[local73] >> 12;
				}
			} else {
				@Pc(265) int local265;
				@Pc(273) int local273;
				@Pc(269) int local269;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static222.anInt4971; local73++) {
						local265 = local62[local73];
						local269 = local70[local73];
						local273 = local66[local73];
						local38[local73] = local265 == 0 ? 4096 : (local50[local73] << 12) / local265;
						local42[local73] = local273 == 0 ? 4096 : (local54[local73] << 12) / local273;
						local46[local73] = local269 == 0 ? 4096 : (local58[local73] << 12) / local269;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static222.anInt4971; local73++) {
						local38[local73] = 4096 - ((4096 - local62[local73]) * (4096 - local50[local73]) >> 12);
						local42[local73] = 4096 - ((4096 - local66[local73]) * (4096 - local54[local73]) >> 12);
						local46[local73] = 4096 - ((4096 - local70[local73]) * (4096 - local58[local73]) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static222.anInt4971; local73++) {
						local265 = local62[local73];
						local269 = local70[local73];
						local273 = local66[local73];
						local38[local73] = local265 >= 2048 ? 4096 - ((4096 - local50[local73]) * (-local265 + 4096) >> 11) : local50[local73] * local265 >> 11;
						local42[local73] = local273 >= 2048 ? 4096 - ((4096 - local273) * (4096 - local54[local73]) >> 11) : local273 * local54[local73] >> 11;
						local46[local73] = local269 < 2048 ? local269 * local58[local73] >> 11 : 4096 - ((4096 - local58[local73]) * (-local269 + 4096) >> 11);
					}
				} else {
					@Pc(525) int local525;
					@Pc(521) int local521;
					@Pc(517) int local517;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static222.anInt4971; local73++) {
							local517 = local58[local73];
							local521 = local54[local73];
							local525 = local50[local73];
							local38[local73] = local525 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local525);
							local42[local73] = local521 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local521);
							local46[local73] = local517 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local517);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static222.anInt4971; local73++) {
							local521 = local54[local73];
							local525 = local50[local73];
							local517 = local58[local73];
							local38[local73] = local525 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local525;
							local42[local73] = local521 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local521;
							local46[local73] = local517 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local517;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static222.anInt4971; local73++) {
							local521 = local54[local73];
							local273 = local66[local73];
							local269 = local70[local73];
							local265 = local62[local73];
							local517 = local58[local73];
							local525 = local50[local73];
							local38[local73] = local525 < local265 ? local525 : local265;
							local42[local73] = local521 < local273 ? local521 : local273;
							local46[local73] = local269 > local517 ? local517 : local269;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static222.anInt4971; local73++) {
							local521 = local54[local73];
							local517 = local58[local73];
							local273 = local66[local73];
							local265 = local62[local73];
							local269 = local70[local73];
							local525 = local50[local73];
							local38[local73] = local265 < local525 ? local525 : local265;
							local42[local73] = local273 >= local521 ? local273 : local521;
							local46[local73] = local517 <= local269 ? local269 : local517;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static222.anInt4971; local73++) {
							local269 = local70[local73];
							local521 = local54[local73];
							local517 = local58[local73];
							local265 = local62[local73];
							local525 = local50[local73];
							local273 = local66[local73];
							local38[local73] = local265 < local525 ? local525 - local265 : local265 - local525;
							local42[local73] = local521 <= local273 ? local273 - local521 : -local273 + local521;
							local46[local73] = local517 <= local269 ? local269 - local517 : -local269 + local517;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static222.anInt4971; local73++) {
							local525 = local50[local73];
							local517 = local58[local73];
							local269 = local70[local73];
							local265 = local62[local73];
							local521 = local54[local73];
							local273 = local66[local73];
							local38[local73] = local265 + local525 - (local525 * local265 >> 11);
							local42[local73] = local521 + local273 - (local521 * local273 >> 11);
							local46[local73] = local269 + local517 - (local517 * local269 >> 11);
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(29) int[] local29 = this.method9156(arg0, 0);
			@Pc(35) int[] local35 = this.method9156(arg0, 1);
			@Pc(38) int local38 = this.anInt7948;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static222.anInt4971; local38++) {
					local19[local38] = local29[local38] + local35[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static222.anInt4971; local38++) {
					local19[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static222.anInt4971; local38++) {
					local19[local38] = local35[local38] * local29[local38] >> 12;
				}
			} else {
				@Pc(171) int local171;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static222.anInt4971; local38++) {
						local171 = local35[local38];
						local19[local38] = local171 == 0 ? 4096 : (local29[local38] << 12) / local171;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static222.anInt4971; local38++) {
						local19[local38] = 4096 - ((4096 - local29[local38]) * (4096 - local35[local38]) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static222.anInt4971; local38++) {
						local171 = local35[local38];
						local19[local38] = local171 >= 2048 ? 4096 - ((4096 - local171) * (4096 - local29[local38]) >> 11) : local171 * local29[local38] >> 11;
					}
				} else {
					@Pc(278) int local278;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static222.anInt4971; local38++) {
							local278 = local29[local38];
							local19[local38] = local278 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local278);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static222.anInt4971; local38++) {
							local278 = local29[local38];
							local19[local38] = local278 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local278;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static222.anInt4971; local38++) {
							local171 = local35[local38];
							local278 = local29[local38];
							local19[local38] = local278 < local171 ? local278 : local171;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static222.anInt4971; local38++) {
							local171 = local35[local38];
							local278 = local29[local38];
							local19[local38] = local278 > local171 ? local278 : local171;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static222.anInt4971; local38++) {
							local171 = local35[local38];
							local278 = local29[local38];
							local19[local38] = local278 <= local171 ? local171 - local278 : local278 - local171;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static222.anInt4971; local38++) {
							local171 = local35[local38];
							local278 = local29[local38];
							local19[local38] = local278 + local171 - (local278 * local171 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
