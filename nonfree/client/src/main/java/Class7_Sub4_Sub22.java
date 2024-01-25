import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class7_Sub4_Sub22 extends Class7_Sub4 {

	@OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
	private int anInt4118 = 6;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub22() {
		super(2, false);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(21) int[][] local21 = this.method5638(arg0, 0);
			@Pc(27) int[][] local27 = this.method5638(arg0, 1);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt4118;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static201.anInt4174; local66++) {
					local31[local66] = local43[local66] + local55[local66];
					local35[local66] = local59[local66] + local47[local66];
					local39[local66] = local51[local66] + local63[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static201.anInt4174; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static201.anInt4174; local66++) {
					local31[local66] = local55[local66] * local43[local66] >> 12;
					local35[local66] = local59[local66] * local47[local66] >> 12;
					local39[local66] = local51[local66] * local63[local66] >> 12;
				}
			} else {
				@Pc(260) int local260;
				@Pc(264) int local264;
				@Pc(256) int local256;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static201.anInt4174; local66++) {
						local256 = local63[local66];
						local260 = local55[local66];
						local264 = local59[local66];
						local31[local66] = local260 == 0 ? 4096 : (local43[local66] << 12) / local260;
						local35[local66] = local264 == 0 ? 4096 : (local47[local66] << 12) / local264;
						local39[local66] = local256 == 0 ? 4096 : (local51[local66] << 12) / local256;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static201.anInt4174; local66++) {
						local31[local66] = 4096 - ((4096 - local43[local66]) * (-local55[local66] + 4096) >> 12);
						local35[local66] = 4096 - ((4096 - local47[local66]) * (-local59[local66] + 4096) >> 12);
						local39[local66] = 4096 - ((4096 - local63[local66]) * (-local51[local66] + 4096) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static201.anInt4174; local66++) {
						local260 = local55[local66];
						local264 = local59[local66];
						local256 = local63[local66];
						local31[local66] = local260 >= 2048 ? 4096 - ((4096 - local260) * (-local43[local66] + 4096) >> 11) : local260 * local43[local66] >> 11;
						local35[local66] = local264 < 2048 ? local264 * local47[local66] >> 11 : 4096 - ((4096 - local47[local66]) * (-local264 + 4096) >> 11);
						local39[local66] = local256 >= 2048 ? 4096 - ((4096 - local51[local66]) * (-local256 + 4096) >> 11) : local256 * local51[local66] >> 11;
					}
				} else {
					@Pc(520) int local520;
					@Pc(512) int local512;
					@Pc(516) int local516;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static201.anInt4174; local66++) {
							local512 = local47[local66];
							local516 = local51[local66];
							local520 = local43[local66];
							local31[local66] = local520 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local520);
							local35[local66] = local512 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local512);
							local39[local66] = local516 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local516);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static201.anInt4174; local66++) {
							local516 = local51[local66];
							local512 = local47[local66];
							local520 = local43[local66];
							local31[local66] = local520 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local520;
							local35[local66] = local512 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local512;
							local39[local66] = local516 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local516;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static201.anInt4174; local66++) {
							local520 = local43[local66];
							local256 = local63[local66];
							local264 = local59[local66];
							local516 = local51[local66];
							local512 = local47[local66];
							local260 = local55[local66];
							local31[local66] = local260 <= local520 ? local260 : local520;
							local35[local66] = local264 <= local512 ? local264 : local512;
							local39[local66] = local256 > local516 ? local516 : local256;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static201.anInt4174; local66++) {
							local256 = local63[local66];
							local260 = local55[local66];
							local264 = local59[local66];
							local512 = local47[local66];
							local516 = local51[local66];
							local520 = local43[local66];
							local31[local66] = local260 < local520 ? local520 : local260;
							local35[local66] = local512 <= local264 ? local264 : local512;
							local39[local66] = local516 > local256 ? local516 : local256;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static201.anInt4174; local66++) {
							local516 = local51[local66];
							local264 = local59[local66];
							local260 = local55[local66];
							local256 = local63[local66];
							local520 = local43[local66];
							local512 = local47[local66];
							local31[local66] = local520 > local260 ? local520 - local260 : local260 - local520;
							local35[local66] = local264 < local512 ? local512 - local264 : -local512 + local264;
							local39[local66] = local256 >= local516 ? local256 - local516 : local516 + -local256;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static201.anInt4174; local66++) {
							local520 = local43[local66];
							local512 = local47[local66];
							local264 = local59[local66];
							local516 = local51[local66];
							local256 = local63[local66];
							local260 = local55[local66];
							local31[local66] = local520 + local260 - (local260 * local520 >> 11);
							local35[local66] = local264 + local512 - (local264 * local512 >> 11);
							local39[local66] = local256 + local516 - (local256 * local516 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4118 = arg0.method2772();
		} else if (arg1 == 1) {
			super.aBoolean481 = arg0.method2772() == 1;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(21) int[] local21 = this.method5634(0, arg0);
			@Pc(27) int[] local27 = this.method5634(1, arg0);
			@Pc(30) int local30 = this.anInt4118;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static201.anInt4174; local30++) {
					local11[local30] = local21[local30] + local27[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static201.anInt4174; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static201.anInt4174; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(159) int local159;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static201.anInt4174; local30++) {
						local159 = local27[local30];
						local11[local30] = local159 == 0 ? 4096 : (local21[local30] << 12) / local159;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static201.anInt4174; local30++) {
						local11[local30] = 4096 - ((4096 - local21[local30]) * (-local27[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static201.anInt4174; local30++) {
						local159 = local27[local30];
						local11[local30] = local159 >= 2048 ? 4096 - ((4096 - local159) * (4096 - local21[local30]) >> 11) : local159 * local21[local30] >> 11;
					}
				} else {
					@Pc(264) int local264;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static201.anInt4174; local30++) {
							local264 = local21[local30];
							local11[local30] = local264 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local264);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static201.anInt4174; local30++) {
							local264 = local21[local30];
							local11[local30] = local264 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local264;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static201.anInt4174; local30++) {
							local264 = local21[local30];
							local159 = local27[local30];
							local11[local30] = local264 >= local159 ? local159 : local264;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static201.anInt4174; local30++) {
							local159 = local27[local30];
							local264 = local21[local30];
							local11[local30] = local159 >= local264 ? local159 : local264;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static201.anInt4174; local30++) {
							local264 = local21[local30];
							local159 = local27[local30];
							local11[local30] = local264 <= local159 ? local159 - local264 : -local159 + local264;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static201.anInt4174; local30++) {
							local264 = local21[local30];
							local159 = local27[local30];
							local11[local30] = local264 + local159 - (local264 * local159 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
