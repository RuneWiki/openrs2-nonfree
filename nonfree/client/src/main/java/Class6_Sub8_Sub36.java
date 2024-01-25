import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class6_Sub8_Sub36 extends Class6_Sub8 {

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
	private int anInt9748 = 6;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub36() {
		super(2, false);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt9748 = arg1.method3030();
		} else if (arg0 == 1) {
			super.aBoolean766 = arg1.method3030() == 1;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(27) int[][] local27 = this.method8928(0, arg0);
			@Pc(33) int[][] local33 = this.method8928(1, arg0);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			@Pc(72) int local72 = this.anInt9748;
			if (local72 == 1) {
				for (local72 = 0; local72 < Static83.anInt1268; local72++) {
					local37[local72] = local61[local72] + local49[local72];
					local41[local72] = local65[local72] + local53[local72];
					local45[local72] = local69[local72] + local57[local72];
				}
			} else if (local72 == 2) {
				for (local72 = 0; local72 < Static83.anInt1268; local72++) {
					local37[local72] = local49[local72] - local61[local72];
					local41[local72] = local53[local72] - local65[local72];
					local45[local72] = local57[local72] - local69[local72];
				}
			} else if (local72 == 3) {
				for (local72 = 0; local72 < Static83.anInt1268; local72++) {
					local37[local72] = local61[local72] * local49[local72] >> 12;
					local41[local72] = local65[local72] * local53[local72] >> 12;
					local45[local72] = local69[local72] * local57[local72] >> 12;
				}
			} else {
				@Pc(317) int local317;
				@Pc(309) int local309;
				@Pc(313) int local313;
				if (local72 == 4) {
					for (local72 = 0; local72 < Static83.anInt1268; local72++) {
						local309 = local65[local72];
						local313 = local69[local72];
						local317 = local61[local72];
						local37[local72] = local317 == 0 ? 4096 : (local49[local72] << 12) / local317;
						local41[local72] = local309 == 0 ? 4096 : (local53[local72] << 12) / local309;
						local45[local72] = local313 == 0 ? 4096 : (local57[local72] << 12) / local313;
					}
				} else if (local72 == 5) {
					for (local72 = 0; local72 < Static83.anInt1268; local72++) {
						local37[local72] = 4096 - ((4096 - local49[local72]) * (4096 - local61[local72]) >> 12);
						local41[local72] = 4096 - ((4096 - local65[local72]) * (-local53[local72] + 4096) >> 12);
						local45[local72] = 4096 - ((4096 - local57[local72]) * (-local69[local72] + 4096) >> 12);
					}
				} else if (local72 == 6) {
					for (local72 = 0; local72 < Static83.anInt1268; local72++) {
						local313 = local69[local72];
						local317 = local61[local72];
						local309 = local65[local72];
						local37[local72] = local317 < 2048 ? local317 * local49[local72] >> 11 : 4096 - ((4096 - local49[local72]) * (-local317 + 4096) >> 11);
						local41[local72] = local309 >= 2048 ? 4096 - ((4096 - local309) * (-local53[local72] + 4096) >> 11) : local309 * local53[local72] >> 11;
						local45[local72] = local313 < 2048 ? local57[local72] * local313 >> 11 : 4096 - ((4096 - local313) * (4096 - local57[local72]) >> 11);
					}
				} else {
					@Pc(573) int local573;
					@Pc(577) int local577;
					@Pc(581) int local581;
					if (local72 == 7) {
						for (local72 = 0; local72 < Static83.anInt1268; local72++) {
							local573 = local49[local72];
							local577 = local53[local72];
							local581 = local57[local72];
							local37[local72] = local573 == 4096 ? 4096 : (local61[local72] << 12) / (4096 - local573);
							local41[local72] = local577 == 4096 ? 4096 : (local65[local72] << 12) / (4096 - local577);
							local45[local72] = local581 == 4096 ? 4096 : (local69[local72] << 12) / (4096 - local581);
						}
					} else if (local72 == 8) {
						for (local72 = 0; local72 < Static83.anInt1268; local72++) {
							local577 = local53[local72];
							local573 = local49[local72];
							local581 = local57[local72];
							local37[local72] = local573 == 0 ? 0 : 4096 - (4096 - local61[local72] << 12) / local573;
							local41[local72] = local577 == 0 ? 0 : 4096 - (4096 - local65[local72] << 12) / local577;
							local45[local72] = local581 == 0 ? 0 : 4096 - (4096 - local69[local72] << 12) / local581;
						}
					} else if (local72 == 9) {
						for (local72 = 0; local72 < Static83.anInt1268; local72++) {
							local577 = local53[local72];
							local309 = local65[local72];
							local313 = local69[local72];
							local581 = local57[local72];
							local573 = local49[local72];
							local317 = local61[local72];
							local37[local72] = local573 >= local317 ? local317 : local573;
							local41[local72] = local309 <= local577 ? local309 : local577;
							local45[local72] = local581 < local313 ? local581 : local313;
						}
					} else if (local72 == 10) {
						for (local72 = 0; local72 < Static83.anInt1268; local72++) {
							local577 = local53[local72];
							local309 = local65[local72];
							local317 = local61[local72];
							local313 = local69[local72];
							local573 = local49[local72];
							local581 = local57[local72];
							local37[local72] = local317 >= local573 ? local317 : local573;
							local41[local72] = local309 >= local577 ? local309 : local577;
							local45[local72] = local313 >= local581 ? local313 : local581;
						}
					} else if (local72 == 11) {
						for (local72 = 0; local72 < Static83.anInt1268; local72++) {
							local313 = local69[local72];
							local309 = local65[local72];
							local577 = local53[local72];
							local573 = local49[local72];
							local317 = local61[local72];
							local581 = local57[local72];
							local37[local72] = local573 > local317 ? local573 - local317 : -local573 + local317;
							local41[local72] = local309 >= local577 ? local309 - local577 : local577 + -local309;
							local45[local72] = local581 > local313 ? local581 - local313 : -local581 + local313;
						}
					} else if (local72 == 12) {
						for (local72 = 0; local72 < Static83.anInt1268; local72++) {
							local313 = local69[local72];
							local577 = local53[local72];
							local573 = local49[local72];
							local309 = local65[local72];
							local317 = local61[local72];
							local581 = local57[local72];
							local37[local72] = local317 + local573 - (local317 * local573 >> 11);
							local41[local72] = local577 + local309 - (local577 * local309 >> 11);
							local45[local72] = local581 + local313 - (local581 * local313 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(21) int[] local21 = this.method8930(arg0, 0);
			@Pc(27) int[] local27 = this.method8930(arg0, 1);
			@Pc(30) int local30 = this.anInt9748;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static83.anInt1268; local30++) {
					local11[local30] = local27[local30] + local21[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static83.anInt1268; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static83.anInt1268; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(209) int local209;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static83.anInt1268; local30++) {
						local209 = local27[local30];
						local11[local30] = local209 == 0 ? 4096 : (local21[local30] << 12) / local209;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static83.anInt1268; local30++) {
						local11[local30] = 4096 - ((4096 - local27[local30]) * (-local21[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static83.anInt1268; local30++) {
						local209 = local27[local30];
						local11[local30] = local209 < 2048 ? local209 * local21[local30] >> 11 : 4096 - ((4096 - local209) * (-local21[local30] + 4096) >> 11);
					}
				} else {
					@Pc(337) int local337;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static83.anInt1268; local30++) {
							local337 = local21[local30];
							local11[local30] = local337 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local337);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static83.anInt1268; local30++) {
							local337 = local21[local30];
							local11[local30] = local337 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local337;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static83.anInt1268; local30++) {
							local209 = local27[local30];
							local337 = local21[local30];
							local11[local30] = local337 >= local209 ? local209 : local337;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static83.anInt1268; local30++) {
							local209 = local27[local30];
							local337 = local21[local30];
							local11[local30] = local209 < local337 ? local337 : local209;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static83.anInt1268; local30++) {
							local209 = local27[local30];
							local337 = local21[local30];
							local11[local30] = local209 < local337 ? local337 - local209 : -local337 + local209;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static83.anInt1268; local30++) {
							local209 = local27[local30];
							local337 = local21[local30];
							local11[local30] = local209 + local337 - (local337 * local209 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
