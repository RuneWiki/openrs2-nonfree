import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class2_Sub11_Sub17 extends Class2_Sub11 {

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
	private int anInt7111 = 6;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub17() {
		super(2, false);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt7111 = arg1.method8581(-17416);
		} else if (arg0 == 1) {
			super.aBoolean936 = arg1.method8581(-17416) == 1;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(31) int[] local31 = this.method9540(arg0, 0);
			@Pc(37) int[] local37 = this.method9540(arg0, 1);
			@Pc(40) int local40 = this.anInt7111;
			if (local40 == 1) {
				for (local40 = 0; local40 < Static301.anInt10214; local40++) {
					local11[local40] = local37[local40] + local31[local40];
				}
			} else if (local40 == 2) {
				for (local40 = 0; local40 < Static301.anInt10214; local40++) {
					local11[local40] = local31[local40] - local37[local40];
				}
			} else if (local40 == 3) {
				for (local40 = 0; local40 < Static301.anInt10214; local40++) {
					local11[local40] = local37[local40] * local31[local40] >> 12;
				}
			} else {
				@Pc(206) int local206;
				if (local40 == 4) {
					for (local40 = 0; local40 < Static301.anInt10214; local40++) {
						local206 = local37[local40];
						local11[local40] = local206 == 0 ? 4096 : (local31[local40] << 12) / local206;
					}
				} else if (local40 == 5) {
					for (local40 = 0; local40 < Static301.anInt10214; local40++) {
						local11[local40] = 4096 - ((4096 - local37[local40]) * (-local31[local40] + 4096) >> 12);
					}
				} else if (local40 == 6) {
					for (local40 = 0; local40 < Static301.anInt10214; local40++) {
						local206 = local37[local40];
						local11[local40] = local206 < 2048 ? local31[local40] * local206 >> 11 : 4096 - ((4096 - local31[local40]) * (-local206 + 4096) >> 11);
					}
				} else {
					@Pc(328) int local328;
					if (local40 == 7) {
						for (local40 = 0; local40 < Static301.anInt10214; local40++) {
							local328 = local31[local40];
							local11[local40] = local328 == 4096 ? 4096 : (local37[local40] << 12) / (4096 - local328);
						}
					} else if (local40 == 8) {
						for (local40 = 0; local40 < Static301.anInt10214; local40++) {
							local328 = local31[local40];
							local11[local40] = local328 == 0 ? 0 : 4096 - (4096 - local37[local40] << 12) / local328;
						}
					} else if (local40 == 9) {
						for (local40 = 0; local40 < Static301.anInt10214; local40++) {
							local328 = local31[local40];
							local206 = local37[local40];
							local11[local40] = local206 > local328 ? local328 : local206;
						}
					} else if (local40 == 10) {
						for (local40 = 0; local40 < Static301.anInt10214; local40++) {
							local328 = local31[local40];
							local206 = local37[local40];
							local11[local40] = local206 >= local328 ? local206 : local328;
						}
					} else if (local40 == 11) {
						for (local40 = 0; local40 < Static301.anInt10214; local40++) {
							local328 = local31[local40];
							local206 = local37[local40];
							local11[local40] = local328 > local206 ? local328 - local206 : -local328 + local206;
						}
					} else if (local40 == 12) {
						for (local40 = 0; local40 < Static301.anInt10214; local40++) {
							local206 = local37[local40];
							local328 = local31[local40];
							local11[local40] = local328 + local206 - (local206 * local328 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(21) int[][] local21 = this.method9538(0, arg0);
			@Pc(27) int[][] local27 = this.method9538(1, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt7111;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static301.anInt10214; local66++) {
					local31[local66] = local43[local66] + local55[local66];
					local35[local66] = local59[local66] + local47[local66];
					local39[local66] = local63[local66] + local51[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static301.anInt10214; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static301.anInt10214; local66++) {
					local31[local66] = local43[local66] * local55[local66] >> 12;
					local35[local66] = local59[local66] * local47[local66] >> 12;
					local39[local66] = local51[local66] * local63[local66] >> 12;
				}
			} else {
				@Pc(309) int local309;
				@Pc(313) int local313;
				@Pc(305) int local305;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static301.anInt10214; local66++) {
						local305 = local63[local66];
						local309 = local55[local66];
						local313 = local59[local66];
						local31[local66] = local309 == 0 ? 4096 : (local43[local66] << 12) / local309;
						local35[local66] = local313 == 0 ? 4096 : (local47[local66] << 12) / local313;
						local39[local66] = local305 == 0 ? 4096 : (local51[local66] << 12) / local305;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static301.anInt10214; local66++) {
						local31[local66] = 4096 - ((4096 - local43[local66]) * (4096 - local55[local66]) >> 12);
						local35[local66] = 4096 - ((4096 - local59[local66]) * (-local47[local66] + 4096) >> 12);
						local39[local66] = 4096 - ((4096 - local63[local66]) * (-local51[local66] + 4096) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static301.anInt10214; local66++) {
						local309 = local55[local66];
						local305 = local63[local66];
						local313 = local59[local66];
						local31[local66] = local309 < 2048 ? local309 * local43[local66] >> 11 : 4096 - ((4096 - local309) * (-local43[local66] + 4096) >> 11);
						local35[local66] = local313 < 2048 ? local313 * local47[local66] >> 11 : 4096 - ((4096 - local47[local66]) * (-local313 + 4096) >> 11);
						local39[local66] = local305 < 2048 ? local51[local66] * local305 >> 11 : 4096 - ((4096 - local51[local66]) * (-local305 + 4096) >> 11);
					}
				} else {
					@Pc(577) int local577;
					@Pc(581) int local581;
					@Pc(585) int local585;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static301.anInt10214; local66++) {
							local577 = local43[local66];
							local581 = local47[local66];
							local585 = local51[local66];
							local31[local66] = local577 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local577);
							local35[local66] = local581 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local581);
							local39[local66] = local585 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local585);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static301.anInt10214; local66++) {
							local581 = local47[local66];
							local585 = local51[local66];
							local577 = local43[local66];
							local31[local66] = local577 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local577;
							local35[local66] = local581 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local581;
							local39[local66] = local585 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local585;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static301.anInt10214; local66++) {
							local577 = local43[local66];
							local305 = local63[local66];
							local581 = local47[local66];
							local585 = local51[local66];
							local313 = local59[local66];
							local309 = local55[local66];
							local31[local66] = local577 >= local309 ? local309 : local577;
							local35[local66] = local313 > local581 ? local581 : local313;
							local39[local66] = local585 >= local305 ? local305 : local585;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static301.anInt10214; local66++) {
							local577 = local43[local66];
							local305 = local63[local66];
							local581 = local47[local66];
							local585 = local51[local66];
							local313 = local59[local66];
							local309 = local55[local66];
							local31[local66] = local577 > local309 ? local577 : local309;
							local35[local66] = local581 > local313 ? local581 : local313;
							local39[local66] = local305 < local585 ? local585 : local305;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static301.anInt10214; local66++) {
							local577 = local43[local66];
							local305 = local63[local66];
							local309 = local55[local66];
							local585 = local51[local66];
							local581 = local47[local66];
							local313 = local59[local66];
							local31[local66] = local309 < local577 ? local577 - local309 : -local577 + local309;
							local35[local66] = local581 > local313 ? local581 - local313 : local313 - local581;
							local39[local66] = local305 >= local585 ? local305 - local585 : local585 - local305;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static301.anInt10214; local66++) {
							local305 = local63[local66];
							local581 = local47[local66];
							local309 = local55[local66];
							local577 = local43[local66];
							local313 = local59[local66];
							local585 = local51[local66];
							local31[local66] = local309 + local577 - (local577 * local309 >> 11);
							local35[local66] = local581 + local313 - (local313 * local581 >> 11);
							local39[local66] = local305 + local585 - (local585 * local305 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
