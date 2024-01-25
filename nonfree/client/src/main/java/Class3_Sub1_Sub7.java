import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!df", name = "L", descriptor = "I")
	private int anInt1271 = 6;

	static {
		new Class240("", 76);
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub7() {
		super(2, false);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1271 = arg0.method2739();
		} else if (arg1 == 1) {
			super.aBoolean487 = arg0.method2739() == 1;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(27) int[][] local27 = this.method5551(0, arg0);
			@Pc(33) int[][] local33 = this.method5551(1, arg0);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			@Pc(72) int local72 = this.anInt1271;
			if (local72 == 1) {
				for (local72 = 0; local72 < Static238.anInt4221; local72++) {
					local37[local72] = local49[local72] + local61[local72];
					local41[local72] = local65[local72] + local53[local72];
					local45[local72] = local57[local72] + local69[local72];
				}
			} else if (local72 == 2) {
				for (local72 = 0; local72 < Static238.anInt4221; local72++) {
					local37[local72] = local49[local72] - local61[local72];
					local41[local72] = local53[local72] - local65[local72];
					local45[local72] = local57[local72] - local69[local72];
				}
			} else if (local72 == 3) {
				for (local72 = 0; local72 < Static238.anInt4221; local72++) {
					local37[local72] = local61[local72] * local49[local72] >> 12;
					local41[local72] = local65[local72] * local53[local72] >> 12;
					local45[local72] = local69[local72] * local57[local72] >> 12;
				}
			} else {
				@Pc(274) int local274;
				@Pc(278) int local278;
				@Pc(282) int local282;
				if (local72 == 4) {
					for (local72 = 0; local72 < Static238.anInt4221; local72++) {
						local274 = local61[local72];
						local278 = local65[local72];
						local282 = local69[local72];
						local37[local72] = local274 == 0 ? 4096 : (local49[local72] << 12) / local274;
						local41[local72] = local278 == 0 ? 4096 : (local53[local72] << 12) / local278;
						local45[local72] = local282 == 0 ? 4096 : (local57[local72] << 12) / local282;
					}
				} else if (local72 == 5) {
					for (local72 = 0; local72 < Static238.anInt4221; local72++) {
						local37[local72] = 4096 - ((4096 - local61[local72]) * (-local49[local72] + 4096) >> 12);
						local41[local72] = 4096 - ((4096 - local65[local72]) * (-local53[local72] + 4096) >> 12);
						local45[local72] = 4096 - ((4096 - local57[local72]) * (-local69[local72] + 4096) >> 12);
					}
				} else if (local72 == 6) {
					for (local72 = 0; local72 < Static238.anInt4221; local72++) {
						local278 = local65[local72];
						local282 = local69[local72];
						local274 = local61[local72];
						local37[local72] = local274 >= 2048 ? 4096 - ((4096 - local49[local72]) * (-local274 + 4096) >> 11) : local274 * local49[local72] >> 11;
						local41[local72] = local278 < 2048 ? local278 * local53[local72] >> 11 : 4096 - ((4096 - local53[local72]) * (-local278 + 4096) >> 11);
						local45[local72] = local282 < 2048 ? local282 * local57[local72] >> 11 : 4096 - ((4096 - local57[local72]) * (-local282 + 4096) >> 11);
					}
				} else {
					@Pc(540) int local540;
					@Pc(536) int local536;
					@Pc(544) int local544;
					if (local72 == 7) {
						for (local72 = 0; local72 < Static238.anInt4221; local72++) {
							local536 = local53[local72];
							local540 = local49[local72];
							local544 = local57[local72];
							local37[local72] = local540 == 4096 ? 4096 : (local61[local72] << 12) / (4096 - local540);
							local41[local72] = local536 == 4096 ? 4096 : (local65[local72] << 12) / (4096 - local536);
							local45[local72] = local544 == 4096 ? 4096 : (local69[local72] << 12) / (4096 - local544);
						}
					} else if (local72 == 8) {
						for (local72 = 0; local72 < Static238.anInt4221; local72++) {
							local540 = local49[local72];
							local544 = local57[local72];
							local536 = local53[local72];
							local37[local72] = local540 == 0 ? 0 : 4096 - (4096 - local61[local72] << 12) / local540;
							local41[local72] = local536 == 0 ? 0 : 4096 - (4096 - local65[local72] << 12) / local536;
							local45[local72] = local544 == 0 ? 0 : 4096 - (4096 - local69[local72] << 12) / local544;
						}
					} else if (local72 == 9) {
						for (local72 = 0; local72 < Static238.anInt4221; local72++) {
							local274 = local61[local72];
							local282 = local69[local72];
							local540 = local49[local72];
							local278 = local65[local72];
							local536 = local53[local72];
							local544 = local57[local72];
							local37[local72] = local274 > local540 ? local540 : local274;
							local41[local72] = local278 > local536 ? local536 : local278;
							local45[local72] = local544 >= local282 ? local282 : local544;
						}
					} else if (local72 == 10) {
						for (local72 = 0; local72 < Static238.anInt4221; local72++) {
							local278 = local65[local72];
							local282 = local69[local72];
							local274 = local61[local72];
							local536 = local53[local72];
							local540 = local49[local72];
							local544 = local57[local72];
							local37[local72] = local540 <= local274 ? local274 : local540;
							local41[local72] = local278 >= local536 ? local278 : local536;
							local45[local72] = local544 <= local282 ? local282 : local544;
						}
					} else if (local72 == 11) {
						for (local72 = 0; local72 < Static238.anInt4221; local72++) {
							local278 = local65[local72];
							local536 = local53[local72];
							local544 = local57[local72];
							local274 = local61[local72];
							local540 = local49[local72];
							local282 = local69[local72];
							local37[local72] = local274 < local540 ? local540 - local274 : -local540 + local274;
							local41[local72] = local536 > local278 ? local536 - local278 : local278 + -local536;
							local45[local72] = local544 > local282 ? local544 - local282 : -local544 + local282;
						}
					} else if (local72 == 12) {
						for (local72 = 0; local72 < Static238.anInt4221; local72++) {
							local544 = local57[local72];
							local282 = local69[local72];
							local274 = local61[local72];
							local540 = local49[local72];
							local278 = local65[local72];
							local536 = local53[local72];
							local37[local72] = local540 + local274 - (local540 * local274 >> 11);
							local41[local72] = local278 + local536 - (local278 * local536 >> 11);
							local45[local72] = local544 + local282 - (local282 * local544 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(21) int[] local21 = this.method5547(arg0, 0);
			@Pc(27) int[] local27 = this.method5547(arg0, 1);
			@Pc(30) int local30 = this.anInt1271;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static238.anInt4221; local30++) {
					local11[local30] = local27[local30] + local21[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static238.anInt4221; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static238.anInt4221; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(161) int local161;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static238.anInt4221; local30++) {
						local161 = local27[local30];
						local11[local30] = local161 == 0 ? 4096 : (local21[local30] << 12) / local161;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static238.anInt4221; local30++) {
						local11[local30] = 4096 - ((4096 - local21[local30]) * (4096 - local27[local30]) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static238.anInt4221; local30++) {
						local161 = local27[local30];
						local11[local30] = local161 >= 2048 ? 4096 - ((4096 - local161) * (-local21[local30] + 4096) >> 11) : local161 * local21[local30] >> 11;
					}
				} else {
					@Pc(275) int local275;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static238.anInt4221; local30++) {
							local275 = local21[local30];
							local11[local30] = local275 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local275);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static238.anInt4221; local30++) {
							local275 = local21[local30];
							local11[local30] = local275 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local275;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static238.anInt4221; local30++) {
							local275 = local21[local30];
							local161 = local27[local30];
							local11[local30] = local275 >= local161 ? local161 : local275;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static238.anInt4221; local30++) {
							local275 = local21[local30];
							local161 = local27[local30];
							local11[local30] = local161 < local275 ? local275 : local161;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static238.anInt4221; local30++) {
							local275 = local21[local30];
							local161 = local27[local30];
							local11[local30] = local275 > local161 ? local275 - local161 : local161 + -local275;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static238.anInt4221; local30++) {
							local275 = local21[local30];
							local161 = local27[local30];
							local11[local30] = local275 + local161 - (local161 * local275 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
