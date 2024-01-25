import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class1_Sub2_Sub38 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
	private int anInt7407 = 6;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub38() {
		super(2, false);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(26) int[] local26 = this.method5872(0, arg0);
			@Pc(32) int[] local32 = this.method5872(1, arg0);
			@Pc(35) int local35 = this.anInt7407;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static410.anInt7198; local35++) {
					local11[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static410.anInt7198; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static410.anInt7198; local35++) {
					local11[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(158) int local158;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static410.anInt7198; local35++) {
						local158 = local32[local35];
						local11[local35] = local158 == 0 ? 4096 : (local26[local35] << 12) / local158;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static410.anInt7198; local35++) {
						local11[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static410.anInt7198; local35++) {
						local158 = local32[local35];
						local11[local35] = local158 < 2048 ? local26[local35] * local158 >> 11 : 4096 - ((4096 - local26[local35]) * (-local158 + 4096) >> 11);
					}
				} else {
					@Pc(271) int local271;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static410.anInt7198; local35++) {
							local271 = local26[local35];
							local11[local35] = local271 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local271);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static410.anInt7198; local35++) {
							local271 = local26[local35];
							local11[local35] = local271 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local271;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static410.anInt7198; local35++) {
							local158 = local32[local35];
							local271 = local26[local35];
							local11[local35] = local158 > local271 ? local271 : local158;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static410.anInt7198; local35++) {
							local158 = local32[local35];
							local271 = local26[local35];
							local11[local35] = local271 <= local158 ? local158 : local271;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static410.anInt7198; local35++) {
							local158 = local32[local35];
							local271 = local26[local35];
							local11[local35] = local271 <= local158 ? local158 - local271 : -local158 + local271;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static410.anInt7198; local35++) {
							local158 = local32[local35];
							local271 = local26[local35];
							local11[local35] = local158 + local271 - (local271 * local158 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(26) int[][] local26 = this.method5867(0, arg0);
			@Pc(32) int[][] local32 = this.method5867(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt7407;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static410.anInt7198; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static410.anInt7198; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static410.anInt7198; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(271) int local271;
				@Pc(267) int local267;
				@Pc(275) int local275;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static410.anInt7198; local71++) {
						local267 = local64[local71];
						local271 = local60[local71];
						local275 = local68[local71];
						local36[local71] = local271 == 0 ? 4096 : (local48[local71] << 12) / local271;
						local40[local71] = local267 == 0 ? 4096 : (local52[local71] << 12) / local267;
						local44[local71] = local275 == 0 ? 4096 : (local56[local71] << 12) / local275;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static410.anInt7198; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static410.anInt7198; local71++) {
						local275 = local68[local71];
						local267 = local64[local71];
						local271 = local60[local71];
						local36[local71] = local271 >= 2048 ? 4096 - ((4096 - local271) * (-local48[local71] + 4096) >> 11) : local48[local71] * local271 >> 11;
						local40[local71] = local267 >= 2048 ? 4096 - ((4096 - local267) * (-local52[local71] + 4096) >> 11) : local267 * local52[local71] >> 11;
						local44[local71] = local275 < 2048 ? local56[local71] * local275 >> 11 : 4096 - ((4096 - local275) * (4096 - local56[local71]) >> 11);
					}
				} else {
					@Pc(533) int local533;
					@Pc(537) int local537;
					@Pc(541) int local541;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static410.anInt7198; local71++) {
							local533 = local48[local71];
							local537 = local52[local71];
							local541 = local56[local71];
							local36[local71] = local533 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local533);
							local40[local71] = local537 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local537);
							local44[local71] = local541 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local541);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static410.anInt7198; local71++) {
							local537 = local52[local71];
							local533 = local48[local71];
							local541 = local56[local71];
							local36[local71] = local533 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local533;
							local40[local71] = local537 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local537;
							local44[local71] = local541 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local541;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static410.anInt7198; local71++) {
							local533 = local48[local71];
							local541 = local56[local71];
							local267 = local64[local71];
							local275 = local68[local71];
							local271 = local60[local71];
							local537 = local52[local71];
							local36[local71] = local271 <= local533 ? local271 : local533;
							local40[local71] = local537 >= local267 ? local267 : local537;
							local44[local71] = local541 < local275 ? local541 : local275;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static410.anInt7198; local71++) {
							local271 = local60[local71];
							local541 = local56[local71];
							local275 = local68[local71];
							local537 = local52[local71];
							local533 = local48[local71];
							local267 = local64[local71];
							local36[local71] = local533 <= local271 ? local271 : local533;
							local40[local71] = local267 >= local537 ? local267 : local537;
							local44[local71] = local275 < local541 ? local541 : local275;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static410.anInt7198; local71++) {
							local271 = local60[local71];
							local541 = local56[local71];
							local275 = local68[local71];
							local533 = local48[local71];
							local537 = local52[local71];
							local267 = local64[local71];
							local36[local71] = local271 < local533 ? local533 - local271 : -local533 + local271;
							local40[local71] = local537 <= local267 ? local267 - local537 : local537 - local267;
							local44[local71] = local541 > local275 ? local541 - local275 : -local541 + local275;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static410.anInt7198; local71++) {
							local537 = local52[local71];
							local541 = local56[local71];
							local533 = local48[local71];
							local275 = local68[local71];
							local267 = local64[local71];
							local271 = local60[local71];
							local36[local71] = local271 + local533 - (local271 * local533 >> 11);
							local40[local71] = local537 + local267 - (local267 * local537 >> 11);
							local44[local71] = local275 + local541 - (local541 * local275 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7407 = arg0.method4548();
		} else if (arg1 == 1) {
			super.aBoolean645 = arg0.method4548() == 1;
		}
	}
}
