import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class4_Sub2_Sub34 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ul", name = "I", descriptor = "I")
	private int anInt9384 = 6;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub34() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(21) int[][] local21 = this.method8772(arg0, 0);
			@Pc(27) int[][] local27 = this.method8772(arg0, 1);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt9384;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static269.anInt4330; local66++) {
					local31[local66] = local43[local66] + local55[local66];
					local35[local66] = local47[local66] + local59[local66];
					local39[local66] = local51[local66] + local63[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static269.anInt4330; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static269.anInt4330; local66++) {
					local31[local66] = local43[local66] * local55[local66] >> 12;
					local35[local66] = local59[local66] * local47[local66] >> 12;
					local39[local66] = local51[local66] * local63[local66] >> 12;
				}
			} else {
				@Pc(262) int local262;
				@Pc(270) int local270;
				@Pc(266) int local266;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static269.anInt4330; local66++) {
						local262 = local55[local66];
						local266 = local63[local66];
						local270 = local59[local66];
						local31[local66] = local262 == 0 ? 4096 : (local43[local66] << 12) / local262;
						local35[local66] = local270 == 0 ? 4096 : (local47[local66] << 12) / local270;
						local39[local66] = local266 == 0 ? 4096 : (local51[local66] << 12) / local266;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static269.anInt4330; local66++) {
						local31[local66] = 4096 - ((4096 - local43[local66]) * (4096 - local55[local66]) >> 12);
						local35[local66] = 4096 - ((4096 - local59[local66]) * (4096 - local47[local66]) >> 12);
						local39[local66] = 4096 - ((4096 - local63[local66]) * (-local51[local66] + 4096) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static269.anInt4330; local66++) {
						local266 = local63[local66];
						local262 = local55[local66];
						local270 = local59[local66];
						local31[local66] = local262 >= 2048 ? 4096 - ((4096 - local43[local66]) * (4096 - local262) >> 11) : local43[local66] * local262 >> 11;
						local35[local66] = local270 >= 2048 ? 4096 - ((4096 - local47[local66]) * (-local270 + 4096) >> 11) : local270 * local47[local66] >> 11;
						local39[local66] = local266 < 2048 ? local266 * local51[local66] >> 11 : 4096 - ((4096 - local266) * (-local51[local66] + 4096) >> 11);
					}
				} else {
					@Pc(519) int local519;
					@Pc(515) int local515;
					@Pc(511) int local511;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static269.anInt4330; local66++) {
							local511 = local51[local66];
							local515 = local47[local66];
							local519 = local43[local66];
							local31[local66] = local519 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local519);
							local35[local66] = local515 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local515);
							local39[local66] = local511 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local511);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static269.anInt4330; local66++) {
							local515 = local47[local66];
							local519 = local43[local66];
							local511 = local51[local66];
							local31[local66] = local519 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local519;
							local35[local66] = local515 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local515;
							local39[local66] = local511 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local511;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static269.anInt4330; local66++) {
							local511 = local51[local66];
							local515 = local47[local66];
							local519 = local43[local66];
							local266 = local63[local66];
							local262 = local55[local66];
							local270 = local59[local66];
							local31[local66] = local519 >= local262 ? local262 : local519;
							local35[local66] = local515 >= local270 ? local270 : local515;
							local39[local66] = local511 < local266 ? local511 : local266;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static269.anInt4330; local66++) {
							local270 = local59[local66];
							local262 = local55[local66];
							local515 = local47[local66];
							local511 = local51[local66];
							local519 = local43[local66];
							local266 = local63[local66];
							local31[local66] = local519 <= local262 ? local262 : local519;
							local35[local66] = local270 >= local515 ? local270 : local515;
							local39[local66] = local511 > local266 ? local511 : local266;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static269.anInt4330; local66++) {
							local270 = local59[local66];
							local266 = local63[local66];
							local511 = local51[local66];
							local262 = local55[local66];
							local519 = local43[local66];
							local515 = local47[local66];
							local31[local66] = local262 >= local519 ? local262 - local519 : -local262 + local519;
							local35[local66] = local270 >= local515 ? local270 - local515 : -local270 + local515;
							local39[local66] = local266 >= local511 ? local266 - local511 : -local266 + local511;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static269.anInt4330; local66++) {
							local266 = local63[local66];
							local519 = local43[local66];
							local515 = local47[local66];
							local270 = local59[local66];
							local262 = local55[local66];
							local511 = local51[local66];
							local31[local66] = local262 + local519 - (local262 * local519 >> 11);
							local35[local66] = local270 + local515 - (local515 * local270 >> 11);
							local39[local66] = local266 + local511 - (local266 * local511 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt9384 = arg1.method8865();
		} else if (arg0 == 1) {
			super.aBoolean793 = arg1.method8865() == 1;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(21) int[] local21 = this.method8768(0, arg0);
			@Pc(27) int[] local27 = this.method8768(1, arg0);
			@Pc(30) int local30 = this.anInt9384;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static269.anInt4330; local30++) {
					local11[local30] = local21[local30] + local27[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static269.anInt4330; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static269.anInt4330; local30++) {
					local11[local30] = local21[local30] * local27[local30] >> 12;
				}
			} else {
				@Pc(153) int local153;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static269.anInt4330; local30++) {
						local153 = local27[local30];
						local11[local30] = local153 == 0 ? 4096 : (local21[local30] << 12) / local153;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static269.anInt4330; local30++) {
						local11[local30] = 4096 - ((4096 - local27[local30]) * (4096 - local21[local30]) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static269.anInt4330; local30++) {
						local153 = local27[local30];
						local11[local30] = local153 >= 2048 ? 4096 - ((4096 - local21[local30]) * (-local153 + 4096) >> 11) : local21[local30] * local153 >> 11;
					}
				} else {
					@Pc(269) int local269;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static269.anInt4330; local30++) {
							local269 = local21[local30];
							local11[local30] = local269 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local269);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static269.anInt4330; local30++) {
							local269 = local21[local30];
							local11[local30] = local269 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local269;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static269.anInt4330; local30++) {
							local269 = local21[local30];
							local153 = local27[local30];
							local11[local30] = local153 > local269 ? local269 : local153;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static269.anInt4330; local30++) {
							local269 = local21[local30];
							local153 = local27[local30];
							local11[local30] = local153 < local269 ? local269 : local153;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static269.anInt4330; local30++) {
							local269 = local21[local30];
							local153 = local27[local30];
							local11[local30] = local269 <= local153 ? local153 - local269 : local269 - local153;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static269.anInt4330; local30++) {
							local153 = local27[local30];
							local269 = local21[local30];
							local11[local30] = local153 + local269 - (local153 * local269 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
