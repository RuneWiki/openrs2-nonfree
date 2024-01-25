import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wm", name = "P", descriptor = "[I")
	public static final int[] anIntArray514 = new int[256];

	@OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
	private int anInt6972 = 6;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray514[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(2, false);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(26) int[] local26 = this.method6013(arg0, 0);
			@Pc(32) int[] local32 = this.method6013(arg0, 1);
			@Pc(35) int local35 = this.anInt6972;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static85.anInt1910; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static85.anInt1910; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static85.anInt1910; local35++) {
					local16[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(162) int local162;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static85.anInt1910; local35++) {
						local162 = local32[local35];
						local16[local35] = local162 == 0 ? 4096 : (local26[local35] << 12) / local162;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static85.anInt1910; local35++) {
						local16[local35] = 4096 - ((4096 - local32[local35]) * (4096 - local26[local35]) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static85.anInt1910; local35++) {
						local162 = local32[local35];
						local16[local35] = local162 < 2048 ? local162 * local26[local35] >> 11 : 4096 - ((4096 - local162) * (-local26[local35] + 4096) >> 11);
					}
				} else {
					@Pc(278) int local278;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static85.anInt1910; local35++) {
							local278 = local26[local35];
							local16[local35] = local278 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local278);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static85.anInt1910; local35++) {
							local278 = local26[local35];
							local16[local35] = local278 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local278;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static85.anInt1910; local35++) {
							local162 = local32[local35];
							local278 = local26[local35];
							local16[local35] = local162 <= local278 ? local162 : local278;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static85.anInt1910; local35++) {
							local278 = local26[local35];
							local162 = local32[local35];
							local16[local35] = local278 > local162 ? local278 : local162;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static85.anInt1910; local35++) {
							local162 = local32[local35];
							local278 = local26[local35];
							local16[local35] = local162 >= local278 ? local162 - local278 : -local162 + local278;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static85.anInt1910; local35++) {
							local162 = local32[local35];
							local278 = local26[local35];
							local16[local35] = local278 + local162 - (local278 * local162 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6972 = arg1.method2132();
		} else if (arg0 == 1) {
			super.aBoolean509 = arg1.method2132() == 1;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(26) int[][] local26 = this.method6006(0, arg0);
			@Pc(32) int[][] local32 = this.method6006(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt6972;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static85.anInt1910; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static85.anInt1910; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static85.anInt1910; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(264) int local264;
				@Pc(268) int local268;
				@Pc(272) int local272;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static85.anInt1910; local71++) {
						local264 = local60[local71];
						local268 = local64[local71];
						local272 = local68[local71];
						local36[local71] = local264 == 0 ? 4096 : (local48[local71] << 12) / local264;
						local40[local71] = local268 == 0 ? 4096 : (local52[local71] << 12) / local268;
						local44[local71] = local272 == 0 ? 4096 : (local56[local71] << 12) / local272;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static85.anInt1910; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (-local56[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static85.anInt1910; local71++) {
						local264 = local60[local71];
						local272 = local68[local71];
						local268 = local64[local71];
						local36[local71] = local264 < 2048 ? local264 * local48[local71] >> 11 : 4096 - ((4096 - local264) * (-local48[local71] + 4096) >> 11);
						local40[local71] = local268 >= 2048 ? 4096 - ((4096 - local268) * (4096 - local52[local71]) >> 11) : local268 * local52[local71] >> 11;
						local44[local71] = local272 >= 2048 ? 4096 - ((4096 - local272) * (-local56[local71] + 4096) >> 11) : local272 * local56[local71] >> 11;
					}
				} else {
					@Pc(520) int local520;
					@Pc(516) int local516;
					@Pc(524) int local524;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static85.anInt1910; local71++) {
							local516 = local52[local71];
							local520 = local48[local71];
							local524 = local56[local71];
							local36[local71] = local520 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local520);
							local40[local71] = local516 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local516);
							local44[local71] = local524 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local524);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static85.anInt1910; local71++) {
							local524 = local56[local71];
							local520 = local48[local71];
							local516 = local52[local71];
							local36[local71] = local520 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local520;
							local40[local71] = local516 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local516;
							local44[local71] = local524 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local524;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static85.anInt1910; local71++) {
							local268 = local64[local71];
							local272 = local68[local71];
							local516 = local52[local71];
							local264 = local60[local71];
							local520 = local48[local71];
							local524 = local56[local71];
							local36[local71] = local520 < local264 ? local520 : local264;
							local40[local71] = local268 > local516 ? local516 : local268;
							local44[local71] = local272 > local524 ? local524 : local272;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static85.anInt1910; local71++) {
							local272 = local68[local71];
							local268 = local64[local71];
							local524 = local56[local71];
							local520 = local48[local71];
							local264 = local60[local71];
							local516 = local52[local71];
							local36[local71] = local264 < local520 ? local520 : local264;
							local40[local71] = local516 > local268 ? local516 : local268;
							local44[local71] = local524 > local272 ? local524 : local272;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static85.anInt1910; local71++) {
							local268 = local64[local71];
							local264 = local60[local71];
							local272 = local68[local71];
							local516 = local52[local71];
							local520 = local48[local71];
							local524 = local56[local71];
							local36[local71] = local264 >= local520 ? local264 - local520 : -local264 + local520;
							local40[local71] = local516 > local268 ? local516 - local268 : local268 - local516;
							local44[local71] = local272 >= local524 ? local272 - local524 : -local272 + local524;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static85.anInt1910; local71++) {
							local524 = local56[local71];
							local268 = local64[local71];
							local516 = local52[local71];
							local520 = local48[local71];
							local272 = local68[local71];
							local264 = local60[local71];
							local36[local71] = local264 + local520 - (local520 * local264 >> 11);
							local40[local71] = local268 + local516 - (local516 * local268 >> 11);
							local44[local71] = local272 + local524 - (local524 * local272 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
