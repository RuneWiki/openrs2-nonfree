import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class4_Sub3_Sub10 extends Class4_Sub3 {

	@OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
	private int anInt2507 = 6;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub10() {
		super(2, false);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2507 = arg1.method4614();
		} else if (arg0 == 1) {
			super.aBoolean587 = arg1.method4614() == 1;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(21) int[][] local21 = this.method6331(arg0, 0);
			@Pc(27) int[][] local27 = this.method6331(arg0, 1);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt2507;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static304.anInt5637; local66++) {
					local31[local66] = local43[local66] + local55[local66];
					local35[local66] = local47[local66] + local59[local66];
					local39[local66] = local63[local66] + local51[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static304.anInt5637; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static304.anInt5637; local66++) {
					local31[local66] = local43[local66] * local55[local66] >> 12;
					local35[local66] = local47[local66] * local59[local66] >> 12;
					local39[local66] = local63[local66] * local51[local66] >> 12;
				}
			} else {
				@Pc(263) int local263;
				@Pc(267) int local267;
				@Pc(271) int local271;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static304.anInt5637; local66++) {
						local263 = local55[local66];
						local267 = local59[local66];
						local271 = local63[local66];
						local31[local66] = local263 == 0 ? 4096 : (local43[local66] << 12) / local263;
						local35[local66] = local267 == 0 ? 4096 : (local47[local66] << 12) / local267;
						local39[local66] = local271 == 0 ? 4096 : (local51[local66] << 12) / local271;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static304.anInt5637; local66++) {
						local31[local66] = 4096 - ((4096 - local43[local66]) * (-local55[local66] + 4096) >> 12);
						local35[local66] = 4096 - ((4096 - local59[local66]) * (-local47[local66] + 4096) >> 12);
						local39[local66] = 4096 - ((4096 - local51[local66]) * (4096 - local63[local66]) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static304.anInt5637; local66++) {
						local271 = local63[local66];
						local263 = local55[local66];
						local267 = local59[local66];
						local31[local66] = local263 >= 2048 ? 4096 - ((4096 - local43[local66]) * (-local263 + 4096) >> 11) : local43[local66] * local263 >> 11;
						local35[local66] = local267 >= 2048 ? 4096 - ((4096 - local47[local66]) * (4096 - local267) >> 11) : local47[local66] * local267 >> 11;
						local39[local66] = local271 >= 2048 ? 4096 - ((4096 - local51[local66]) * (-local271 + 4096) >> 11) : local51[local66] * local271 >> 11;
					}
				} else {
					@Pc(537) int local537;
					@Pc(529) int local529;
					@Pc(533) int local533;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static304.anInt5637; local66++) {
							local529 = local47[local66];
							local533 = local51[local66];
							local537 = local43[local66];
							local31[local66] = local537 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local537);
							local35[local66] = local529 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local529);
							local39[local66] = local533 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local533);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static304.anInt5637; local66++) {
							local537 = local43[local66];
							local533 = local51[local66];
							local529 = local47[local66];
							local31[local66] = local537 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local537;
							local35[local66] = local529 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local529;
							local39[local66] = local533 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local533;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static304.anInt5637; local66++) {
							local263 = local55[local66];
							local533 = local51[local66];
							local529 = local47[local66];
							local537 = local43[local66];
							local271 = local63[local66];
							local267 = local59[local66];
							local31[local66] = local537 < local263 ? local537 : local263;
							local35[local66] = local529 >= local267 ? local267 : local529;
							local39[local66] = local271 <= local533 ? local271 : local533;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static304.anInt5637; local66++) {
							local529 = local47[local66];
							local267 = local59[local66];
							local271 = local63[local66];
							local537 = local43[local66];
							local263 = local55[local66];
							local533 = local51[local66];
							local31[local66] = local263 >= local537 ? local263 : local537;
							local35[local66] = local529 <= local267 ? local267 : local529;
							local39[local66] = local271 < local533 ? local533 : local271;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static304.anInt5637; local66++) {
							local537 = local43[local66];
							local267 = local59[local66];
							local533 = local51[local66];
							local263 = local55[local66];
							local529 = local47[local66];
							local271 = local63[local66];
							local31[local66] = local537 > local263 ? local537 - local263 : local263 - local537;
							local35[local66] = local529 <= local267 ? local267 - local529 : -local267 + local529;
							local39[local66] = local271 >= local533 ? local271 - local533 : -local271 + local533;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static304.anInt5637; local66++) {
							local271 = local63[local66];
							local529 = local47[local66];
							local263 = local55[local66];
							local537 = local43[local66];
							local533 = local51[local66];
							local267 = local59[local66];
							local31[local66] = local537 + local263 - (local537 * local263 >> 11);
							local35[local66] = local529 + local267 - (local267 * local529 >> 11);
							local39[local66] = local271 + local533 - (local271 * local533 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(29) int[] local29 = this.method6337(0, arg0);
			@Pc(37) int[] local37 = this.method6337(1, arg0);
			@Pc(40) int local40 = this.anInt2507;
			if (local40 == 1) {
				for (local40 = 0; local40 < Static304.anInt5637; local40++) {
					local19[local40] = local37[local40] + local29[local40];
				}
			} else if (local40 == 2) {
				for (local40 = 0; local40 < Static304.anInt5637; local40++) {
					local19[local40] = local29[local40] - local37[local40];
				}
			} else if (local40 == 3) {
				for (local40 = 0; local40 < Static304.anInt5637; local40++) {
					local19[local40] = local29[local40] * local37[local40] >> 12;
				}
			} else {
				@Pc(164) int local164;
				if (local40 == 4) {
					for (local40 = 0; local40 < Static304.anInt5637; local40++) {
						local164 = local37[local40];
						local19[local40] = local164 == 0 ? 4096 : (local29[local40] << 12) / local164;
					}
				} else if (local40 == 5) {
					for (local40 = 0; local40 < Static304.anInt5637; local40++) {
						local19[local40] = 4096 - ((4096 - local37[local40]) * (4096 - local29[local40]) >> 12);
					}
				} else if (local40 == 6) {
					for (local40 = 0; local40 < Static304.anInt5637; local40++) {
						local164 = local37[local40];
						local19[local40] = local164 < 2048 ? local164 * local29[local40] >> 11 : 4096 - ((4096 - local164) * (4096 - local29[local40]) >> 11);
					}
				} else {
					@Pc(272) int local272;
					if (local40 == 7) {
						for (local40 = 0; local40 < Static304.anInt5637; local40++) {
							local272 = local29[local40];
							local19[local40] = local272 == 4096 ? 4096 : (local37[local40] << 12) / (4096 - local272);
						}
					} else if (local40 == 8) {
						for (local40 = 0; local40 < Static304.anInt5637; local40++) {
							local272 = local29[local40];
							local19[local40] = local272 == 0 ? 0 : 4096 - (4096 - local37[local40] << 12) / local272;
						}
					} else if (local40 == 9) {
						for (local40 = 0; local40 < Static304.anInt5637; local40++) {
							local272 = local29[local40];
							local164 = local37[local40];
							local19[local40] = local164 <= local272 ? local164 : local272;
						}
					} else if (local40 == 10) {
						for (local40 = 0; local40 < Static304.anInt5637; local40++) {
							local164 = local37[local40];
							local272 = local29[local40];
							local19[local40] = local164 < local272 ? local272 : local164;
						}
					} else if (local40 == 11) {
						for (local40 = 0; local40 < Static304.anInt5637; local40++) {
							local272 = local29[local40];
							local164 = local37[local40];
							local19[local40] = local164 >= local272 ? local164 - local272 : -local164 + local272;
						}
					} else if (local40 == 12) {
						for (local40 = 0; local40 < Static304.anInt5637; local40++) {
							local272 = local29[local40];
							local164 = local37[local40];
							local19[local40] = local164 + local272 - (local272 * local164 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
