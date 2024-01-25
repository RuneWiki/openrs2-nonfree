import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class6_Sub4_Sub17 extends Class6_Sub4 {

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
	private int anInt5109 = 6;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub17() {
		super(2, false);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt5109 = arg1.method8604();
		} else if (arg0 == 1) {
			super.aBoolean674 = arg1.method8604() == 1;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(27) int[][] local27 = this.method8319(0, arg0);
			@Pc(33) int[][] local33 = this.method8319(1, arg0);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			@Pc(72) int local72 = this.anInt5109;
			if (local72 == 1) {
				for (local72 = 0; local72 < Static6.anInt111; local72++) {
					local37[local72] = local49[local72] + local61[local72];
					local41[local72] = local53[local72] + local65[local72];
					local45[local72] = local57[local72] + local69[local72];
				}
			} else if (local72 == 2) {
				for (local72 = 0; local72 < Static6.anInt111; local72++) {
					local37[local72] = local49[local72] - local61[local72];
					local41[local72] = local53[local72] - local65[local72];
					local45[local72] = local57[local72] - local69[local72];
				}
			} else if (local72 == 3) {
				for (local72 = 0; local72 < Static6.anInt111; local72++) {
					local37[local72] = local61[local72] * local49[local72] >> 12;
					local41[local72] = local65[local72] * local53[local72] >> 12;
					local45[local72] = local57[local72] * local69[local72] >> 12;
				}
			} else {
				@Pc(279) int local279;
				@Pc(275) int local275;
				@Pc(271) int local271;
				if (local72 == 4) {
					for (local72 = 0; local72 < Static6.anInt111; local72++) {
						local271 = local69[local72];
						local275 = local65[local72];
						local279 = local61[local72];
						local37[local72] = local279 == 0 ? 4096 : (local49[local72] << 12) / local279;
						local41[local72] = local275 == 0 ? 4096 : (local53[local72] << 12) / local275;
						local45[local72] = local271 == 0 ? 4096 : (local57[local72] << 12) / local271;
					}
				} else if (local72 == 5) {
					for (local72 = 0; local72 < Static6.anInt111; local72++) {
						local37[local72] = 4096 - ((4096 - local61[local72]) * (-local49[local72] + 4096) >> 12);
						local41[local72] = 4096 - ((4096 - local53[local72]) * (-local65[local72] + 4096) >> 12);
						local45[local72] = 4096 - ((4096 - local69[local72]) * (-local57[local72] + 4096) >> 12);
					}
				} else if (local72 == 6) {
					for (local72 = 0; local72 < Static6.anInt111; local72++) {
						local271 = local69[local72];
						local279 = local61[local72];
						local275 = local65[local72];
						local37[local72] = local279 < 2048 ? local49[local72] * local279 >> 11 : 4096 - ((4096 - local279) * (-local49[local72] + 4096) >> 11);
						local41[local72] = local275 < 2048 ? local275 * local53[local72] >> 11 : 4096 - ((4096 - local275) * (-local53[local72] + 4096) >> 11);
						local45[local72] = local271 >= 2048 ? 4096 - ((4096 - local57[local72]) * (-local271 + 4096) >> 11) : local271 * local57[local72] >> 11;
					}
				} else {
					@Pc(533) int local533;
					@Pc(537) int local537;
					@Pc(541) int local541;
					if (local72 == 7) {
						for (local72 = 0; local72 < Static6.anInt111; local72++) {
							local533 = local49[local72];
							local537 = local53[local72];
							local541 = local57[local72];
							local37[local72] = local533 == 4096 ? 4096 : (local61[local72] << 12) / (4096 - local533);
							local41[local72] = local537 == 4096 ? 4096 : (local65[local72] << 12) / (4096 - local537);
							local45[local72] = local541 == 4096 ? 4096 : (local69[local72] << 12) / (4096 - local541);
						}
					} else if (local72 == 8) {
						for (local72 = 0; local72 < Static6.anInt111; local72++) {
							local533 = local49[local72];
							local537 = local53[local72];
							local541 = local57[local72];
							local37[local72] = local533 == 0 ? 0 : 4096 - (4096 - local61[local72] << 12) / local533;
							local41[local72] = local537 == 0 ? 0 : 4096 - (4096 - local65[local72] << 12) / local537;
							local45[local72] = local541 == 0 ? 0 : 4096 - (4096 - local69[local72] << 12) / local541;
						}
					} else if (local72 == 9) {
						for (local72 = 0; local72 < Static6.anInt111; local72++) {
							local537 = local53[local72];
							local541 = local57[local72];
							local279 = local61[local72];
							local271 = local69[local72];
							local275 = local65[local72];
							local533 = local49[local72];
							local37[local72] = local533 < local279 ? local533 : local279;
							local41[local72] = local537 >= local275 ? local275 : local537;
							local45[local72] = local271 <= local541 ? local271 : local541;
						}
					} else if (local72 == 10) {
						for (local72 = 0; local72 < Static6.anInt111; local72++) {
							local275 = local65[local72];
							local279 = local61[local72];
							local533 = local49[local72];
							local271 = local69[local72];
							local537 = local53[local72];
							local541 = local57[local72];
							local37[local72] = local533 <= local279 ? local279 : local533;
							local41[local72] = local537 <= local275 ? local275 : local537;
							local45[local72] = local541 <= local271 ? local271 : local541;
						}
					} else if (local72 == 11) {
						for (local72 = 0; local72 < Static6.anInt111; local72++) {
							local279 = local61[local72];
							local275 = local65[local72];
							local541 = local57[local72];
							local537 = local53[local72];
							local533 = local49[local72];
							local271 = local69[local72];
							local37[local72] = local279 < local533 ? local533 - local279 : local279 - local533;
							local41[local72] = local275 < local537 ? local537 - local275 : local275 + -local537;
							local45[local72] = local271 >= local541 ? local271 - local541 : -local271 + local541;
						}
					} else if (local72 == 12) {
						for (local72 = 0; local72 < Static6.anInt111; local72++) {
							local279 = local61[local72];
							local541 = local57[local72];
							local275 = local65[local72];
							local271 = local69[local72];
							local537 = local53[local72];
							local533 = local49[local72];
							local37[local72] = local533 + local279 - (local279 * local533 >> 11);
							local41[local72] = local275 + local537 - (local537 * local275 >> 11);
							local45[local72] = local541 + local271 - (local271 * local541 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(27) int[] local27 = this.method8313(arg0, 0);
			@Pc(33) int[] local33 = this.method8313(arg0, 1);
			@Pc(36) int local36 = this.anInt5109;
			if (local36 == 1) {
				for (local36 = 0; local36 < Static6.anInt111; local36++) {
					local11[local36] = local33[local36] + local27[local36];
				}
			} else if (local36 == 2) {
				for (local36 = 0; local36 < Static6.anInt111; local36++) {
					local11[local36] = local27[local36] - local33[local36];
				}
			} else if (local36 == 3) {
				for (local36 = 0; local36 < Static6.anInt111; local36++) {
					local11[local36] = local33[local36] * local27[local36] >> 12;
				}
			} else {
				@Pc(159) int local159;
				if (local36 == 4) {
					for (local36 = 0; local36 < Static6.anInt111; local36++) {
						local159 = local33[local36];
						local11[local36] = local159 == 0 ? 4096 : (local27[local36] << 12) / local159;
					}
				} else if (local36 == 5) {
					for (local36 = 0; local36 < Static6.anInt111; local36++) {
						local11[local36] = 4096 - ((4096 - local33[local36]) * (-local27[local36] + 4096) >> 12);
					}
				} else if (local36 == 6) {
					for (local36 = 0; local36 < Static6.anInt111; local36++) {
						local159 = local33[local36];
						local11[local36] = local159 < 2048 ? local27[local36] * local159 >> 11 : 4096 - ((4096 - local27[local36]) * (4096 - local159) >> 11);
					}
				} else {
					@Pc(266) int local266;
					if (local36 == 7) {
						for (local36 = 0; local36 < Static6.anInt111; local36++) {
							local266 = local27[local36];
							local11[local36] = local266 == 4096 ? 4096 : (local33[local36] << 12) / (4096 - local266);
						}
					} else if (local36 == 8) {
						for (local36 = 0; local36 < Static6.anInt111; local36++) {
							local266 = local27[local36];
							local11[local36] = local266 == 0 ? 0 : 4096 - (4096 - local33[local36] << 12) / local266;
						}
					} else if (local36 == 9) {
						for (local36 = 0; local36 < Static6.anInt111; local36++) {
							local159 = local33[local36];
							local266 = local27[local36];
							local11[local36] = local159 <= local266 ? local159 : local266;
						}
					} else if (local36 == 10) {
						for (local36 = 0; local36 < Static6.anInt111; local36++) {
							local266 = local27[local36];
							local159 = local33[local36];
							local11[local36] = local266 <= local159 ? local159 : local266;
						}
					} else if (local36 == 11) {
						for (local36 = 0; local36 < Static6.anInt111; local36++) {
							local266 = local27[local36];
							local159 = local33[local36];
							local11[local36] = local159 < local266 ? local266 - local159 : local159 - local266;
						}
					} else if (local36 == 12) {
						for (local36 = 0; local36 < Static6.anInt111; local36++) {
							local159 = local33[local36];
							local266 = local27[local36];
							local11[local36] = local266 + local159 - (local159 * local266 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
