import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub4_Sub32 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
	private int anInt3826 = 6;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub32() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3826 = arg1.method1534();
		} else if (arg0 == 1) {
			super.aBoolean190 = arg1.method1534() == 1;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(23) int[] local23 = this.method3129(0, arg0);
			@Pc(31) int[] local31 = this.method3129(1, arg0);
			@Pc(34) int local34 = this.anInt3826;
			if (local34 == 1) {
				for (local34 = 0; local34 < Static118.anInt2608; local34++) {
					local11[local34] = local23[local34] + local31[local34];
				}
			} else if (local34 == 2) {
				for (local34 = 0; local34 < Static118.anInt2608; local34++) {
					local11[local34] = local23[local34] - local31[local34];
				}
			} else if (local34 == 3) {
				for (local34 = 0; local34 < Static118.anInt2608; local34++) {
					local11[local34] = local23[local34] * local31[local34] >> 12;
				}
			} else {
				@Pc(168) int local168;
				if (local34 == 4) {
					for (local34 = 0; local34 < Static118.anInt2608; local34++) {
						local168 = local31[local34];
						local11[local34] = local168 == 0 ? 4096 : (local23[local34] << 12) / local168;
					}
				} else if (local34 == 5) {
					for (local34 = 0; local34 < Static118.anInt2608; local34++) {
						local11[local34] = 4096 - ((4096 - local31[local34]) * (-local23[local34] + 4096) >> 12);
					}
				} else if (local34 == 6) {
					for (local34 = 0; local34 < Static118.anInt2608; local34++) {
						local168 = local31[local34];
						local11[local34] = local168 >= 2048 ? 4096 - ((4096 - local23[local34]) * (-local168 + 4096) >> 11) : local23[local34] * local168 >> 11;
					}
				} else {
					@Pc(278) int local278;
					if (local34 == 7) {
						for (local34 = 0; local34 < Static118.anInt2608; local34++) {
							local278 = local23[local34];
							local11[local34] = local278 == 4096 ? 4096 : (local31[local34] << 12) / (4096 - local278);
						}
					} else if (local34 == 8) {
						for (local34 = 0; local34 < Static118.anInt2608; local34++) {
							local278 = local23[local34];
							local11[local34] = local278 == 0 ? 0 : 4096 - (4096 - local31[local34] << 12) / local278;
						}
					} else if (local34 == 9) {
						for (local34 = 0; local34 < Static118.anInt2608; local34++) {
							local278 = local23[local34];
							local168 = local31[local34];
							local11[local34] = local168 <= local278 ? local168 : local278;
						}
					} else if (local34 == 10) {
						for (local34 = 0; local34 < Static118.anInt2608; local34++) {
							local278 = local23[local34];
							local168 = local31[local34];
							local11[local34] = local278 > local168 ? local278 : local168;
						}
					} else if (local34 == 11) {
						for (local34 = 0; local34 < Static118.anInt2608; local34++) {
							local278 = local23[local34];
							local168 = local31[local34];
							local11[local34] = local278 <= local168 ? local168 - local278 : -local168 + local278;
						}
					} else if (local34 == 12) {
						for (local34 = 0; local34 < Static118.anInt2608; local34++) {
							local168 = local31[local34];
							local278 = local23[local34];
							local11[local34] = local168 + local278 - (local168 * local278 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(26) int[][] local26 = this.method3130(arg0, 0);
			@Pc(32) int[][] local32 = this.method3130(arg0, 1);
			@Pc(36) int[] local36 = local12[1];
			@Pc(40) int[] local40 = local12[0];
			@Pc(44) int[] local44 = local12[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local32[0];
			@Pc(60) int[] local60 = local26[2];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt3826;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static118.anInt2608; local71++) {
					local40[local71] = local56[local71] + local48[local71];
					local36[local71] = local64[local71] + local52[local71];
					local44[local71] = local60[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static118.anInt2608; local71++) {
					local40[local71] = local48[local71] - local56[local71];
					local36[local71] = local52[local71] - local64[local71];
					local44[local71] = local60[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static118.anInt2608; local71++) {
					local40[local71] = local48[local71] * local56[local71] >> 12;
					local36[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local60[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(282) int local282;
				@Pc(286) int local286;
				@Pc(278) int local278;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static118.anInt2608; local71++) {
						local278 = local68[local71];
						local282 = local56[local71];
						local286 = local64[local71];
						local40[local71] = local282 == 0 ? 4096 : (local48[local71] << 12) / local282;
						local36[local71] = local286 == 0 ? 4096 : (local52[local71] << 12) / local286;
						local44[local71] = local278 == 0 ? 4096 : (local60[local71] << 12) / local278;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static118.anInt2608; local71++) {
						local40[local71] = 4096 - ((4096 - local56[local71]) * (-local48[local71] + 4096) >> 12);
						local36[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (4096 - local60[local71]) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static118.anInt2608; local71++) {
						local278 = local68[local71];
						local286 = local64[local71];
						local282 = local56[local71];
						local40[local71] = local282 < 2048 ? local282 * local48[local71] >> 11 : 4096 - ((4096 - local48[local71]) * (-local282 + 4096) >> 11);
						local36[local71] = local286 < 2048 ? local286 * local52[local71] >> 11 : 4096 - ((4096 - local286) * (-local52[local71] + 4096) >> 11);
						local44[local71] = local278 < 2048 ? local278 * local60[local71] >> 11 : 4096 - ((4096 - local60[local71]) * (-local278 + 4096) >> 11);
					}
				} else {
					@Pc(533) int local533;
					@Pc(541) int local541;
					@Pc(537) int local537;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static118.anInt2608; local71++) {
							local533 = local48[local71];
							local537 = local60[local71];
							local541 = local52[local71];
							local40[local71] = local533 == 4096 ? 4096 : (local56[local71] << 12) / (4096 - local533);
							local36[local71] = local541 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local541);
							local44[local71] = local537 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local537);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static118.anInt2608; local71++) {
							local537 = local60[local71];
							local533 = local48[local71];
							local541 = local52[local71];
							local40[local71] = local533 == 0 ? 0 : 4096 - (4096 - local56[local71] << 12) / local533;
							local36[local71] = local541 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local541;
							local44[local71] = local537 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local537;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static118.anInt2608; local71++) {
							local286 = local64[local71];
							local278 = local68[local71];
							local282 = local56[local71];
							local541 = local52[local71];
							local533 = local48[local71];
							local537 = local60[local71];
							local40[local71] = local282 <= local533 ? local282 : local533;
							local36[local71] = local286 > local541 ? local541 : local286;
							local44[local71] = local537 >= local278 ? local278 : local537;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static118.anInt2608; local71++) {
							local533 = local48[local71];
							local541 = local52[local71];
							local278 = local68[local71];
							local282 = local56[local71];
							local286 = local64[local71];
							local537 = local60[local71];
							local40[local71] = local533 <= local282 ? local282 : local533;
							local36[local71] = local541 > local286 ? local541 : local286;
							local44[local71] = local278 >= local537 ? local278 : local537;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static118.anInt2608; local71++) {
							local537 = local60[local71];
							local282 = local56[local71];
							local278 = local68[local71];
							local533 = local48[local71];
							local286 = local64[local71];
							local541 = local52[local71];
							local40[local71] = local282 >= local533 ? local282 - local533 : local533 - local282;
							local36[local71] = local286 < local541 ? local541 - local286 : local286 - local541;
							local44[local71] = local537 > local278 ? local537 - local278 : -local537 + local278;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static118.anInt2608; local71++) {
							local537 = local60[local71];
							local282 = local56[local71];
							local533 = local48[local71];
							local278 = local68[local71];
							local286 = local64[local71];
							local541 = local52[local71];
							local40[local71] = local533 + local282 - (local533 * local282 >> 11);
							local36[local71] = local286 + local541 - (local286 * local541 >> 11);
							local44[local71] = local278 + local537 - (local278 * local537 >> 11);
						}
					}
				}
			}
		}
		return local12;
	}
}
