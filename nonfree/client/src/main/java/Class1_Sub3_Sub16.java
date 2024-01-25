import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jm", name = "S", descriptor = "I")
	private int anInt4443 = 6;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub16() {
		super(2, false);
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(27) int[][] local27 = this.method8199(0, arg0);
			@Pc(33) int[][] local33 = this.method8199(1, arg0);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			@Pc(72) int local72 = this.anInt4443;
			if (local72 == 1) {
				for (local72 = 0; local72 < Static254.anInt4973; local72++) {
					local37[local72] = local49[local72] + local61[local72];
					local41[local72] = local53[local72] + local65[local72];
					local45[local72] = local69[local72] + local57[local72];
				}
			} else if (local72 == 2) {
				for (local72 = 0; local72 < Static254.anInt4973; local72++) {
					local37[local72] = local49[local72] - local61[local72];
					local41[local72] = local53[local72] - local65[local72];
					local45[local72] = local57[local72] - local69[local72];
				}
			} else if (local72 == 3) {
				for (local72 = 0; local72 < Static254.anInt4973; local72++) {
					local37[local72] = local49[local72] * local61[local72] >> 12;
					local41[local72] = local65[local72] * local53[local72] >> 12;
					local45[local72] = local69[local72] * local57[local72] >> 12;
				}
			} else {
				@Pc(260) int local260;
				@Pc(264) int local264;
				@Pc(256) int local256;
				if (local72 == 4) {
					for (local72 = 0; local72 < Static254.anInt4973; local72++) {
						local256 = local69[local72];
						local260 = local61[local72];
						local264 = local65[local72];
						local37[local72] = local260 == 0 ? 4096 : (local49[local72] << 12) / local260;
						local41[local72] = local264 == 0 ? 4096 : (local53[local72] << 12) / local264;
						local45[local72] = local256 == 0 ? 4096 : (local57[local72] << 12) / local256;
					}
				} else if (local72 == 5) {
					for (local72 = 0; local72 < Static254.anInt4973; local72++) {
						local37[local72] = 4096 - ((4096 - local61[local72]) * (-local49[local72] + 4096) >> 12);
						local41[local72] = 4096 - ((4096 - local65[local72]) * (-local53[local72] + 4096) >> 12);
						local45[local72] = 4096 - ((4096 - local57[local72]) * (-local69[local72] + 4096) >> 12);
					}
				} else if (local72 == 6) {
					for (local72 = 0; local72 < Static254.anInt4973; local72++) {
						local256 = local69[local72];
						local260 = local61[local72];
						local264 = local65[local72];
						local37[local72] = local260 >= 2048 ? 4096 - ((4096 - local49[local72]) * (-local260 + 4096) >> 11) : local260 * local49[local72] >> 11;
						local41[local72] = local264 >= 2048 ? 4096 - ((4096 - local264) * (4096 - local53[local72]) >> 11) : local53[local72] * local264 >> 11;
						local45[local72] = local256 >= 2048 ? 4096 - ((4096 - local57[local72]) * (4096 - local256) >> 11) : local256 * local57[local72] >> 11;
					}
				} else {
					@Pc(519) int local519;
					@Pc(511) int local511;
					@Pc(515) int local515;
					if (local72 == 7) {
						for (local72 = 0; local72 < Static254.anInt4973; local72++) {
							local511 = local53[local72];
							local515 = local57[local72];
							local519 = local49[local72];
							local37[local72] = local519 == 4096 ? 4096 : (local61[local72] << 12) / (4096 - local519);
							local41[local72] = local511 == 4096 ? 4096 : (local65[local72] << 12) / (4096 - local511);
							local45[local72] = local515 == 4096 ? 4096 : (local69[local72] << 12) / (4096 - local515);
						}
					} else if (local72 == 8) {
						for (local72 = 0; local72 < Static254.anInt4973; local72++) {
							local511 = local53[local72];
							local519 = local49[local72];
							local515 = local57[local72];
							local37[local72] = local519 == 0 ? 0 : 4096 - (4096 - local61[local72] << 12) / local519;
							local41[local72] = local511 == 0 ? 0 : 4096 - (4096 - local65[local72] << 12) / local511;
							local45[local72] = local515 == 0 ? 0 : 4096 - (4096 - local69[local72] << 12) / local515;
						}
					} else if (local72 == 9) {
						for (local72 = 0; local72 < Static254.anInt4973; local72++) {
							local256 = local69[local72];
							local260 = local61[local72];
							local511 = local53[local72];
							local519 = local49[local72];
							local264 = local65[local72];
							local515 = local57[local72];
							local37[local72] = local519 >= local260 ? local260 : local519;
							local41[local72] = local264 <= local511 ? local264 : local511;
							local45[local72] = local256 <= local515 ? local256 : local515;
						}
					} else if (local72 == 10) {
						for (local72 = 0; local72 < Static254.anInt4973; local72++) {
							local264 = local65[local72];
							local260 = local61[local72];
							local515 = local57[local72];
							local519 = local49[local72];
							local511 = local53[local72];
							local256 = local69[local72];
							local37[local72] = local260 >= local519 ? local260 : local519;
							local41[local72] = local264 >= local511 ? local264 : local511;
							local45[local72] = local256 >= local515 ? local256 : local515;
						}
					} else if (local72 == 11) {
						for (local72 = 0; local72 < Static254.anInt4973; local72++) {
							local260 = local61[local72];
							local256 = local69[local72];
							local515 = local57[local72];
							local519 = local49[local72];
							local511 = local53[local72];
							local264 = local65[local72];
							local37[local72] = local260 < local519 ? local519 - local260 : -local519 + local260;
							local41[local72] = local511 > local264 ? local511 - local264 : -local511 + local264;
							local45[local72] = local515 > local256 ? local515 - local256 : -local515 + local256;
						}
					} else if (local72 == 12) {
						for (local72 = 0; local72 < Static254.anInt4973; local72++) {
							local511 = local53[local72];
							local515 = local57[local72];
							local264 = local65[local72];
							local519 = local49[local72];
							local260 = local61[local72];
							local256 = local69[local72];
							local37[local72] = local519 + local260 - (local260 * local519 >> 11);
							local41[local72] = local264 + local511 - (local264 * local511 >> 11);
							local45[local72] = local515 + local256 - (local256 * local515 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt4443 = arg1.method4487();
		} else if (arg0 == 1) {
			super.aBoolean708 = arg1.method4487() == 1;
		}
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(21) int[] local21 = this.method8201(0, arg0);
			@Pc(27) int[] local27 = this.method8201(1, arg0);
			@Pc(30) int local30 = this.anInt4443;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static254.anInt4973; local30++) {
					local11[local30] = local27[local30] + local21[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static254.anInt4973; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static254.anInt4973; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(157) int local157;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static254.anInt4973; local30++) {
						local157 = local27[local30];
						local11[local30] = local157 == 0 ? 4096 : (local21[local30] << 12) / local157;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static254.anInt4973; local30++) {
						local11[local30] = 4096 - ((4096 - local21[local30]) * (4096 - local27[local30]) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static254.anInt4973; local30++) {
						local157 = local27[local30];
						local11[local30] = local157 < 2048 ? local157 * local21[local30] >> 11 : 4096 - ((4096 - local21[local30]) * (4096 - local157) >> 11);
					}
				} else {
					@Pc(266) int local266;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static254.anInt4973; local30++) {
							local266 = local21[local30];
							local11[local30] = local266 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local266);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static254.anInt4973; local30++) {
							local266 = local21[local30];
							local11[local30] = local266 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local266;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static254.anInt4973; local30++) {
							local266 = local21[local30];
							local157 = local27[local30];
							local11[local30] = local157 > local266 ? local266 : local157;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static254.anInt4973; local30++) {
							local157 = local27[local30];
							local266 = local21[local30];
							local11[local30] = local157 < local266 ? local266 : local157;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static254.anInt4973; local30++) {
							local266 = local21[local30];
							local157 = local27[local30];
							local11[local30] = local266 <= local157 ? local157 - local266 : -local157 + local266;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static254.anInt4973; local30++) {
							local157 = local27[local30];
							local266 = local21[local30];
							local11[local30] = local157 + local266 - (local157 * local266 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
