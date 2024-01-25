import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class5_Sub2_Sub21 extends Class5_Sub2 {

	@OriginalMember(owner = "client!od", name = "E", descriptor = "I")
	private int anInt6507 = 6;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub21() {
		super(2, false);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(21) int[][] local21 = this.method9033(0, arg0);
			@Pc(27) int[][] local27 = this.method9033(1, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt6507;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static597.anInt10025; local66++) {
					local31[local66] = local43[local66] + local55[local66];
					local35[local66] = local47[local66] + local59[local66];
					local39[local66] = local63[local66] + local51[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static597.anInt10025; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static597.anInt10025; local66++) {
					local31[local66] = local43[local66] * local55[local66] >> 12;
					local35[local66] = local59[local66] * local47[local66] >> 12;
					local39[local66] = local51[local66] * local63[local66] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(266) int local266;
				@Pc(262) int local262;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static597.anInt10025; local66++) {
						local262 = local63[local66];
						local266 = local59[local66];
						local270 = local55[local66];
						local31[local66] = local270 == 0 ? 4096 : (local43[local66] << 12) / local270;
						local35[local66] = local266 == 0 ? 4096 : (local47[local66] << 12) / local266;
						local39[local66] = local262 == 0 ? 4096 : (local51[local66] << 12) / local262;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static597.anInt10025; local66++) {
						local31[local66] = 4096 - ((4096 - local43[local66]) * (-local55[local66] + 4096) >> 12);
						local35[local66] = 4096 - ((4096 - local59[local66]) * (-local47[local66] + 4096) >> 12);
						local39[local66] = 4096 - ((4096 - local63[local66]) * (-local51[local66] + 4096) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static597.anInt10025; local66++) {
						local270 = local55[local66];
						local266 = local59[local66];
						local262 = local63[local66];
						local31[local66] = local270 >= 2048 ? 4096 - ((4096 - local43[local66]) * (-local270 + 4096) >> 11) : local270 * local43[local66] >> 11;
						local35[local66] = local266 >= 2048 ? 4096 - ((4096 - local266) * (-local47[local66] + 4096) >> 11) : local266 * local47[local66] >> 11;
						local39[local66] = local262 >= 2048 ? 4096 - ((4096 - local51[local66]) * (4096 - local262) >> 11) : local51[local66] * local262 >> 11;
					}
				} else {
					@Pc(521) int local521;
					@Pc(517) int local517;
					@Pc(513) int local513;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static597.anInt10025; local66++) {
							local513 = local51[local66];
							local517 = local47[local66];
							local521 = local43[local66];
							local31[local66] = local521 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local521);
							local35[local66] = local517 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local517);
							local39[local66] = local513 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local513);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static597.anInt10025; local66++) {
							local521 = local43[local66];
							local517 = local47[local66];
							local513 = local51[local66];
							local31[local66] = local521 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local521;
							local35[local66] = local517 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local517;
							local39[local66] = local513 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local513;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static597.anInt10025; local66++) {
							local521 = local43[local66];
							local513 = local51[local66];
							local517 = local47[local66];
							local266 = local59[local66];
							local270 = local55[local66];
							local262 = local63[local66];
							local31[local66] = local521 < local270 ? local521 : local270;
							local35[local66] = local517 < local266 ? local517 : local266;
							local39[local66] = local262 <= local513 ? local262 : local513;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static597.anInt10025; local66++) {
							local513 = local51[local66];
							local521 = local43[local66];
							local517 = local47[local66];
							local262 = local63[local66];
							local266 = local59[local66];
							local270 = local55[local66];
							local31[local66] = local521 > local270 ? local521 : local270;
							local35[local66] = local517 > local266 ? local517 : local266;
							local39[local66] = local262 < local513 ? local513 : local262;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static597.anInt10025; local66++) {
							local517 = local47[local66];
							local513 = local51[local66];
							local262 = local63[local66];
							local521 = local43[local66];
							local270 = local55[local66];
							local266 = local59[local66];
							local31[local66] = local521 > local270 ? local521 - local270 : -local521 + local270;
							local35[local66] = local266 >= local517 ? local266 - local517 : local517 - local266;
							local39[local66] = local513 <= local262 ? local262 - local513 : -local262 + local513;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static597.anInt10025; local66++) {
							local521 = local43[local66];
							local270 = local55[local66];
							local517 = local47[local66];
							local513 = local51[local66];
							local262 = local63[local66];
							local266 = local59[local66];
							local31[local66] = local270 + local521 - (local270 * local521 >> 11);
							local35[local66] = local517 + local266 - (local517 * local266 >> 11);
							local39[local66] = local262 + local513 - (local262 * local513 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(28) int[] local28 = this.method9042(arg0, 0);
			@Pc(36) int[] local36 = this.method9042(arg0, 1);
			@Pc(39) int local39 = this.anInt6507;
			if (local39 == 1) {
				for (local39 = 0; local39 < Static597.anInt10025; local39++) {
					local18[local39] = local28[local39] + local36[local39];
				}
			} else if (local39 == 2) {
				for (local39 = 0; local39 < Static597.anInt10025; local39++) {
					local18[local39] = local28[local39] - local36[local39];
				}
			} else if (local39 == 3) {
				for (local39 = 0; local39 < Static597.anInt10025; local39++) {
					local18[local39] = local36[local39] * local28[local39] >> 12;
				}
			} else {
				@Pc(168) int local168;
				if (local39 == 4) {
					for (local39 = 0; local39 < Static597.anInt10025; local39++) {
						local168 = local36[local39];
						local18[local39] = local168 == 0 ? 4096 : (local28[local39] << 12) / local168;
					}
				} else if (local39 == 5) {
					for (local39 = 0; local39 < Static597.anInt10025; local39++) {
						local18[local39] = 4096 - ((4096 - local36[local39]) * (-local28[local39] + 4096) >> 12);
					}
				} else if (local39 == 6) {
					for (local39 = 0; local39 < Static597.anInt10025; local39++) {
						local168 = local36[local39];
						local18[local39] = local168 >= 2048 ? 4096 - ((4096 - local168) * (-local28[local39] + 4096) >> 11) : local168 * local28[local39] >> 11;
					}
				} else {
					@Pc(280) int local280;
					if (local39 == 7) {
						for (local39 = 0; local39 < Static597.anInt10025; local39++) {
							local280 = local28[local39];
							local18[local39] = local280 == 4096 ? 4096 : (local36[local39] << 12) / (4096 - local280);
						}
					} else if (local39 == 8) {
						for (local39 = 0; local39 < Static597.anInt10025; local39++) {
							local280 = local28[local39];
							local18[local39] = local280 == 0 ? 0 : 4096 - (4096 - local36[local39] << 12) / local280;
						}
					} else if (local39 == 9) {
						for (local39 = 0; local39 < Static597.anInt10025; local39++) {
							local280 = local28[local39];
							local168 = local36[local39];
							local18[local39] = local168 <= local280 ? local168 : local280;
						}
					} else if (local39 == 10) {
						for (local39 = 0; local39 < Static597.anInt10025; local39++) {
							local280 = local28[local39];
							local168 = local36[local39];
							local18[local39] = local168 >= local280 ? local168 : local280;
						}
					} else if (local39 == 11) {
						for (local39 = 0; local39 < Static597.anInt10025; local39++) {
							local280 = local28[local39];
							local168 = local36[local39];
							local18[local39] = local168 < local280 ? local280 - local168 : -local280 + local168;
						}
					} else if (local39 == 12) {
						for (local39 = 0; local39 < Static597.anInt10025; local39++) {
							local168 = local36[local39];
							local280 = local28[local39];
							local18[local39] = local168 + local280 - (local168 * local280 >> 11);
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6507 = arg0.method5966();
		} else if (arg1 == 1) {
			super.aBoolean762 = arg0.method5966() == 1;
		}
	}
}
