import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
	private int anInt1127 = 6;

	static {
		new Class114("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub2() {
		super(2, false);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(23) int[] local23 = this.method7911(arg0, 0);
			@Pc(29) int[] local29 = this.method7911(arg0, 1);
			@Pc(32) int local32 = this.anInt1127;
			if (local32 == 1) {
				for (local32 = 0; local32 < Static236.anInt4609; local32++) {
					local13[local32] = local23[local32] + local29[local32];
				}
			} else if (local32 == 2) {
				for (local32 = 0; local32 < Static236.anInt4609; local32++) {
					local13[local32] = local23[local32] - local29[local32];
				}
			} else if (local32 == 3) {
				for (local32 = 0; local32 < Static236.anInt4609; local32++) {
					local13[local32] = local29[local32] * local23[local32] >> 12;
				}
			} else {
				@Pc(161) int local161;
				if (local32 == 4) {
					for (local32 = 0; local32 < Static236.anInt4609; local32++) {
						local161 = local29[local32];
						local13[local32] = local161 == 0 ? 4096 : (local23[local32] << 12) / local161;
					}
				} else if (local32 == 5) {
					for (local32 = 0; local32 < Static236.anInt4609; local32++) {
						local13[local32] = 4096 - ((4096 - local23[local32]) * (-local29[local32] + 4096) >> 12);
					}
				} else if (local32 == 6) {
					for (local32 = 0; local32 < Static236.anInt4609; local32++) {
						local161 = local29[local32];
						local13[local32] = local161 >= 2048 ? 4096 - ((4096 - local23[local32]) * (-local161 + 4096) >> 11) : local23[local32] * local161 >> 11;
					}
				} else {
					@Pc(268) int local268;
					if (local32 == 7) {
						for (local32 = 0; local32 < Static236.anInt4609; local32++) {
							local268 = local23[local32];
							local13[local32] = local268 == 4096 ? 4096 : (local29[local32] << 12) / (4096 - local268);
						}
					} else if (local32 == 8) {
						for (local32 = 0; local32 < Static236.anInt4609; local32++) {
							local268 = local23[local32];
							local13[local32] = local268 == 0 ? 0 : 4096 - (4096 - local29[local32] << 12) / local268;
						}
					} else if (local32 == 9) {
						for (local32 = 0; local32 < Static236.anInt4609; local32++) {
							local161 = local29[local32];
							local268 = local23[local32];
							local13[local32] = local161 <= local268 ? local161 : local268;
						}
					} else if (local32 == 10) {
						for (local32 = 0; local32 < Static236.anInt4609; local32++) {
							local268 = local23[local32];
							local161 = local29[local32];
							local13[local32] = local268 <= local161 ? local161 : local268;
						}
					} else if (local32 == 11) {
						for (local32 = 0; local32 < Static236.anInt4609; local32++) {
							local161 = local29[local32];
							local268 = local23[local32];
							local13[local32] = local268 > local161 ? local268 - local161 : -local268 + local161;
						}
					} else if (local32 == 12) {
						for (local32 = 0; local32 < Static236.anInt4609; local32++) {
							local161 = local29[local32];
							local268 = local23[local32];
							local13[local32] = local161 + local268 - (local268 * local161 >> 11);
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1127 = arg0.method3043();
		} else if (arg1 == 1) {
			super.aBoolean652 = arg0.method3043() == 1;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(21) int[][] local21 = this.method7910(0, arg0);
			@Pc(27) int[][] local27 = this.method7910(1, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt1127;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static236.anInt4609; local66++) {
					local31[local66] = local43[local66] + local55[local66];
					local35[local66] = local47[local66] + local59[local66];
					local39[local66] = local51[local66] + local63[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static236.anInt4609; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static236.anInt4609; local66++) {
					local31[local66] = local43[local66] * local55[local66] >> 12;
					local35[local66] = local59[local66] * local47[local66] >> 12;
					local39[local66] = local63[local66] * local51[local66] >> 12;
				}
			} else {
				@Pc(260) int local260;
				@Pc(256) int local256;
				@Pc(252) int local252;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static236.anInt4609; local66++) {
						local252 = local63[local66];
						local256 = local59[local66];
						local260 = local55[local66];
						local31[local66] = local260 == 0 ? 4096 : (local43[local66] << 12) / local260;
						local35[local66] = local256 == 0 ? 4096 : (local47[local66] << 12) / local256;
						local39[local66] = local252 == 0 ? 4096 : (local51[local66] << 12) / local252;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static236.anInt4609; local66++) {
						local31[local66] = 4096 - ((4096 - local43[local66]) * (-local55[local66] + 4096) >> 12);
						local35[local66] = 4096 - ((4096 - local47[local66]) * (-local59[local66] + 4096) >> 12);
						local39[local66] = 4096 - ((4096 - local51[local66]) * (-local63[local66] + 4096) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static236.anInt4609; local66++) {
						local252 = local63[local66];
						local260 = local55[local66];
						local256 = local59[local66];
						local31[local66] = local260 < 2048 ? local43[local66] * local260 >> 11 : 4096 - ((4096 - local260) * (-local43[local66] + 4096) >> 11);
						local35[local66] = local256 >= 2048 ? 4096 - ((4096 - local256) * (4096 - local47[local66]) >> 11) : local256 * local47[local66] >> 11;
						local39[local66] = local252 >= 2048 ? 4096 - ((4096 - local252) * (-local51[local66] + 4096) >> 11) : local252 * local51[local66] >> 11;
					}
				} else {
					@Pc(512) int local512;
					@Pc(516) int local516;
					@Pc(508) int local508;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static236.anInt4609; local66++) {
							local508 = local51[local66];
							local512 = local43[local66];
							local516 = local47[local66];
							local31[local66] = local512 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local512);
							local35[local66] = local516 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local516);
							local39[local66] = local508 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local508);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static236.anInt4609; local66++) {
							local512 = local43[local66];
							local516 = local47[local66];
							local508 = local51[local66];
							local31[local66] = local512 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local512;
							local35[local66] = local516 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local516;
							local39[local66] = local508 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local508;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static236.anInt4609; local66++) {
							local508 = local51[local66];
							local252 = local63[local66];
							local260 = local55[local66];
							local516 = local47[local66];
							local512 = local43[local66];
							local256 = local59[local66];
							local31[local66] = local512 >= local260 ? local260 : local512;
							local35[local66] = local256 > local516 ? local516 : local256;
							local39[local66] = local508 >= local252 ? local252 : local508;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static236.anInt4609; local66++) {
							local260 = local55[local66];
							local256 = local59[local66];
							local252 = local63[local66];
							local512 = local43[local66];
							local508 = local51[local66];
							local516 = local47[local66];
							local31[local66] = local512 > local260 ? local512 : local260;
							local35[local66] = local256 >= local516 ? local256 : local516;
							local39[local66] = local508 <= local252 ? local252 : local508;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static236.anInt4609; local66++) {
							local516 = local47[local66];
							local508 = local51[local66];
							local252 = local63[local66];
							local512 = local43[local66];
							local256 = local59[local66];
							local260 = local55[local66];
							local31[local66] = local512 > local260 ? local512 - local260 : local260 - local512;
							local35[local66] = local516 <= local256 ? local256 - local516 : -local256 + local516;
							local39[local66] = local508 > local252 ? local508 - local252 : -local508 + local252;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static236.anInt4609; local66++) {
							local516 = local47[local66];
							local508 = local51[local66];
							local512 = local43[local66];
							local252 = local63[local66];
							local256 = local59[local66];
							local260 = local55[local66];
							local31[local66] = local260 + local512 - (local260 * local512 >> 11);
							local35[local66] = local256 + local516 - (local256 * local516 >> 11);
							local39[local66] = local508 + local252 - (local252 * local508 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
