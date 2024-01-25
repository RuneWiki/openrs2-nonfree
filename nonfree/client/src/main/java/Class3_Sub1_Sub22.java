import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class3_Sub1_Sub22 extends Class3_Sub1 {

	@OriginalMember(owner = "client!om", name = "B", descriptor = "I")
	private int anInt7447 = 6;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub22() {
		super(2, false);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(29) int[] local29 = this.method9577(0, arg0);
			@Pc(35) int[] local35 = this.method9577(1, arg0);
			@Pc(38) int local38 = this.anInt7447;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static379.anInt5859; local38++) {
					local19[local38] = local29[local38] + local35[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static379.anInt5859; local38++) {
					local19[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static379.anInt5859; local38++) {
					local19[local38] = local35[local38] * local29[local38] >> 12;
				}
			} else {
				@Pc(215) int local215;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static379.anInt5859; local38++) {
						local215 = local35[local38];
						local19[local38] = local215 == 0 ? 4096 : (local29[local38] << 12) / local215;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static379.anInt5859; local38++) {
						local19[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static379.anInt5859; local38++) {
						local215 = local35[local38];
						local19[local38] = local215 >= 2048 ? 4096 - ((4096 - local215) * (4096 - local29[local38]) >> 11) : local215 * local29[local38] >> 11;
					}
				} else {
					@Pc(337) int local337;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static379.anInt5859; local38++) {
							local337 = local29[local38];
							local19[local38] = local337 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local337);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static379.anInt5859; local38++) {
							local337 = local29[local38];
							local19[local38] = local337 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local337;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static379.anInt5859; local38++) {
							local215 = local35[local38];
							local337 = local29[local38];
							local19[local38] = local215 > local337 ? local337 : local215;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static379.anInt5859; local38++) {
							local337 = local29[local38];
							local215 = local35[local38];
							local19[local38] = local337 > local215 ? local337 : local215;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static379.anInt5859; local38++) {
							local337 = local29[local38];
							local215 = local35[local38];
							local19[local38] = local337 <= local215 ? local215 - local337 : local337 + -local215;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static379.anInt5859; local38++) {
							local337 = local29[local38];
							local215 = local35[local38];
							local19[local38] = local337 + local215 - (local337 * local215 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(28) int[][] local28 = this.method9576(arg0, 0);
			@Pc(34) int[][] local34 = this.method9576(arg0, 1);
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			@Pc(50) int[] local50 = local28[0];
			@Pc(54) int[] local54 = local28[1];
			@Pc(58) int[] local58 = local28[2];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt7447;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static379.anInt5859; local73++) {
					local38[local73] = local62[local73] + local50[local73];
					local42[local73] = local54[local73] + local66[local73];
					local46[local73] = local70[local73] + local58[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static379.anInt5859; local73++) {
					local38[local73] = local50[local73] - local62[local73];
					local42[local73] = local54[local73] - local66[local73];
					local46[local73] = local58[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static379.anInt5859; local73++) {
					local38[local73] = local62[local73] * local50[local73] >> 12;
					local42[local73] = local66[local73] * local54[local73] >> 12;
					local46[local73] = local70[local73] * local58[local73] >> 12;
				}
			} else {
				@Pc(313) int local313;
				@Pc(321) int local321;
				@Pc(317) int local317;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static379.anInt5859; local73++) {
						local313 = local62[local73];
						local317 = local70[local73];
						local321 = local66[local73];
						local38[local73] = local313 == 0 ? 4096 : (local50[local73] << 12) / local313;
						local42[local73] = local321 == 0 ? 4096 : (local54[local73] << 12) / local321;
						local46[local73] = local317 == 0 ? 4096 : (local58[local73] << 12) / local317;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static379.anInt5859; local73++) {
						local38[local73] = 4096 - ((4096 - local62[local73]) * (4096 - local50[local73]) >> 12);
						local42[local73] = 4096 - ((4096 - local54[local73]) * (-local66[local73] + 4096) >> 12);
						local46[local73] = 4096 - ((4096 - local58[local73]) * (4096 - local70[local73]) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static379.anInt5859; local73++) {
						local321 = local66[local73];
						local313 = local62[local73];
						local317 = local70[local73];
						local38[local73] = local313 < 2048 ? local50[local73] * local313 >> 11 : 4096 - ((4096 - local313) * (-local50[local73] + 4096) >> 11);
						local42[local73] = local321 >= 2048 ? 4096 - ((4096 - local321) * (-local54[local73] + 4096) >> 11) : local54[local73] * local321 >> 11;
						local46[local73] = local317 >= 2048 ? 4096 - ((4096 - local317) * (4096 - local58[local73]) >> 11) : local58[local73] * local317 >> 11;
					}
				} else {
					@Pc(585) int local585;
					@Pc(589) int local589;
					@Pc(581) int local581;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static379.anInt5859; local73++) {
							local581 = local58[local73];
							local585 = local50[local73];
							local589 = local54[local73];
							local38[local73] = local585 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local585);
							local42[local73] = local589 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local589);
							local46[local73] = local581 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local581);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static379.anInt5859; local73++) {
							local585 = local50[local73];
							local581 = local58[local73];
							local589 = local54[local73];
							local38[local73] = local585 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local585;
							local42[local73] = local589 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local589;
							local46[local73] = local581 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local581;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static379.anInt5859; local73++) {
							local581 = local58[local73];
							local589 = local54[local73];
							local585 = local50[local73];
							local321 = local66[local73];
							local317 = local70[local73];
							local313 = local62[local73];
							local38[local73] = local585 < local313 ? local585 : local313;
							local42[local73] = local321 > local589 ? local589 : local321;
							local46[local73] = local581 >= local317 ? local317 : local581;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static379.anInt5859; local73++) {
							local321 = local66[local73];
							local313 = local62[local73];
							local317 = local70[local73];
							local585 = local50[local73];
							local589 = local54[local73];
							local581 = local58[local73];
							local38[local73] = local313 >= local585 ? local313 : local585;
							local42[local73] = local589 > local321 ? local589 : local321;
							local46[local73] = local581 > local317 ? local581 : local317;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static379.anInt5859; local73++) {
							local581 = local58[local73];
							local321 = local66[local73];
							local313 = local62[local73];
							local317 = local70[local73];
							local589 = local54[local73];
							local585 = local50[local73];
							local38[local73] = local313 >= local585 ? local313 - local585 : local585 - local313;
							local42[local73] = local321 < local589 ? local589 - local321 : local321 - local589;
							local46[local73] = local317 < local581 ? local581 - local317 : -local581 + local317;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static379.anInt5859; local73++) {
							local313 = local62[local73];
							local317 = local70[local73];
							local581 = local58[local73];
							local585 = local50[local73];
							local589 = local54[local73];
							local321 = local66[local73];
							local38[local73] = local313 + local585 - (local313 * local585 >> 11);
							local42[local73] = local589 + local321 - (local321 * local589 >> 11);
							local46[local73] = local317 + local581 - (local581 * local317 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt7447 = arg1.method2048(255);
		} else if (arg0 == 1) {
			super.aBoolean773 = arg1.method2048(255) == 1;
		}
	}
}
