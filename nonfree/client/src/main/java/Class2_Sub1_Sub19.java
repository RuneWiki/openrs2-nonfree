import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!le", name = "R", descriptor = "[I")
	public static final int[] anIntArray269 = new int[4096];

	@OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
	private int anInt4240 = 6;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray269[local4] = Static166.method2611(local4);
		}
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub19() {
		super(2, false);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(21) int[] local21 = this.method6037(arg0, 0);
			@Pc(27) int[] local27 = this.method6037(arg0, 1);
			@Pc(30) int local30 = this.anInt4240;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static131.anInt2581; local30++) {
					local11[local30] = local21[local30] + local27[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static131.anInt2581; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static131.anInt2581; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(144) int local144;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static131.anInt2581; local30++) {
						local144 = local27[local30];
						local11[local30] = local144 == 0 ? 4096 : (local21[local30] << 12) / local144;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static131.anInt2581; local30++) {
						local11[local30] = 4096 - ((4096 - local27[local30]) * (-local21[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static131.anInt2581; local30++) {
						local144 = local27[local30];
						local11[local30] = local144 < 2048 ? local21[local30] * local144 >> 11 : 4096 - ((4096 - local144) * (-local21[local30] + 4096) >> 11);
					}
				} else {
					@Pc(253) int local253;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static131.anInt2581; local30++) {
							local253 = local21[local30];
							local11[local30] = local253 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local253);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static131.anInt2581; local30++) {
							local253 = local21[local30];
							local11[local30] = local253 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local253;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static131.anInt2581; local30++) {
							local144 = local27[local30];
							local253 = local21[local30];
							local11[local30] = local253 < local144 ? local253 : local144;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static131.anInt2581; local30++) {
							local253 = local21[local30];
							local144 = local27[local30];
							local11[local30] = local144 < local253 ? local253 : local144;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static131.anInt2581; local30++) {
							local253 = local21[local30];
							local144 = local27[local30];
							local11[local30] = local144 < local253 ? local253 - local144 : local144 + -local253;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static131.anInt2581; local30++) {
							local144 = local27[local30];
							local253 = local21[local30];
							local11[local30] = local144 + local253 - (local144 * local253 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4240 = arg1.method3737();
		} else if (arg0 == 1) {
			super.aBoolean665 = arg1.method3737() == 1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(29) int[][] local29 = this.method6031(0, arg0);
			@Pc(37) int[][] local37 = this.method6031(1, arg0);
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local19[1];
			@Pc(49) int[] local49 = local19[2];
			@Pc(53) int[] local53 = local29[0];
			@Pc(57) int[] local57 = local29[1];
			@Pc(61) int[] local61 = local29[2];
			@Pc(65) int[] local65 = local37[0];
			@Pc(69) int[] local69 = local37[1];
			@Pc(73) int[] local73 = local37[2];
			@Pc(76) int local76 = this.anInt4240;
			if (local76 == 1) {
				for (local76 = 0; local76 < Static131.anInt2581; local76++) {
					local41[local76] = local65[local76] + local53[local76];
					local45[local76] = local57[local76] + local69[local76];
					local49[local76] = local73[local76] + local61[local76];
				}
			} else if (local76 == 2) {
				for (local76 = 0; local76 < Static131.anInt2581; local76++) {
					local41[local76] = local53[local76] - local65[local76];
					local45[local76] = local57[local76] - local69[local76];
					local49[local76] = local61[local76] - local73[local76];
				}
			} else if (local76 == 3) {
				for (local76 = 0; local76 < Static131.anInt2581; local76++) {
					local41[local76] = local65[local76] * local53[local76] >> 12;
					local45[local76] = local69[local76] * local57[local76] >> 12;
					local49[local76] = local73[local76] * local61[local76] >> 12;
				}
			} else {
				@Pc(278) int local278;
				@Pc(286) int local286;
				@Pc(282) int local282;
				if (local76 == 4) {
					for (local76 = 0; local76 < Static131.anInt2581; local76++) {
						local278 = local65[local76];
						local282 = local73[local76];
						local286 = local69[local76];
						local41[local76] = local278 == 0 ? 4096 : (local53[local76] << 12) / local278;
						local45[local76] = local286 == 0 ? 4096 : (local57[local76] << 12) / local286;
						local49[local76] = local282 == 0 ? 4096 : (local61[local76] << 12) / local282;
					}
				} else if (local76 == 5) {
					for (local76 = 0; local76 < Static131.anInt2581; local76++) {
						local41[local76] = 4096 - ((4096 - local53[local76]) * (-local65[local76] + 4096) >> 12);
						local45[local76] = 4096 - ((4096 - local69[local76]) * (-local57[local76] + 4096) >> 12);
						local49[local76] = 4096 - ((4096 - local61[local76]) * (-local73[local76] + 4096) >> 12);
					}
				} else if (local76 == 6) {
					for (local76 = 0; local76 < Static131.anInt2581; local76++) {
						local286 = local69[local76];
						local282 = local73[local76];
						local278 = local65[local76];
						local41[local76] = local278 < 2048 ? local53[local76] * local278 >> 11 : 4096 - ((4096 - local53[local76]) * (-local278 + 4096) >> 11);
						local45[local76] = local286 >= 2048 ? 4096 - ((4096 - local286) * (-local57[local76] + 4096) >> 11) : local57[local76] * local286 >> 11;
						local49[local76] = local282 < 2048 ? local282 * local61[local76] >> 11 : 4096 - ((4096 - local282) * (-local61[local76] + 4096) >> 11);
					}
				} else {
					@Pc(542) int local542;
					@Pc(546) int local546;
					@Pc(538) int local538;
					if (local76 == 7) {
						for (local76 = 0; local76 < Static131.anInt2581; local76++) {
							local538 = local61[local76];
							local542 = local53[local76];
							local546 = local57[local76];
							local41[local76] = local542 == 4096 ? 4096 : (local65[local76] << 12) / (4096 - local542);
							local45[local76] = local546 == 4096 ? 4096 : (local69[local76] << 12) / (4096 - local546);
							local49[local76] = local538 == 4096 ? 4096 : (local73[local76] << 12) / (4096 - local538);
						}
					} else if (local76 == 8) {
						for (local76 = 0; local76 < Static131.anInt2581; local76++) {
							local542 = local53[local76];
							local546 = local57[local76];
							local538 = local61[local76];
							local41[local76] = local542 == 0 ? 0 : 4096 - (4096 - local65[local76] << 12) / local542;
							local45[local76] = local546 == 0 ? 0 : 4096 - (4096 - local69[local76] << 12) / local546;
							local49[local76] = local538 == 0 ? 0 : 4096 - (4096 - local73[local76] << 12) / local538;
						}
					} else if (local76 == 9) {
						for (local76 = 0; local76 < Static131.anInt2581; local76++) {
							local546 = local57[local76];
							local538 = local61[local76];
							local282 = local73[local76];
							local542 = local53[local76];
							local286 = local69[local76];
							local278 = local65[local76];
							local41[local76] = local278 <= local542 ? local278 : local542;
							local45[local76] = local546 >= local286 ? local286 : local546;
							local49[local76] = local282 > local538 ? local538 : local282;
						}
					} else if (local76 == 10) {
						for (local76 = 0; local76 < Static131.anInt2581; local76++) {
							local538 = local61[local76];
							local542 = local53[local76];
							local546 = local57[local76];
							local282 = local73[local76];
							local286 = local69[local76];
							local278 = local65[local76];
							local41[local76] = local278 >= local542 ? local278 : local542;
							local45[local76] = local286 < local546 ? local546 : local286;
							local49[local76] = local538 <= local282 ? local282 : local538;
						}
					} else if (local76 == 11) {
						for (local76 = 0; local76 < Static131.anInt2581; local76++) {
							local286 = local69[local76];
							local538 = local61[local76];
							local542 = local53[local76];
							local278 = local65[local76];
							local282 = local73[local76];
							local546 = local57[local76];
							local41[local76] = local542 <= local278 ? local278 - local542 : -local278 + local542;
							local45[local76] = local546 > local286 ? local546 - local286 : -local546 + local286;
							local49[local76] = local538 <= local282 ? local282 - local538 : -local282 + local538;
						}
					} else if (local76 == 12) {
						for (local76 = 0; local76 < Static131.anInt2581; local76++) {
							local282 = local73[local76];
							local546 = local57[local76];
							local286 = local69[local76];
							local542 = local53[local76];
							local538 = local61[local76];
							local278 = local65[local76];
							local41[local76] = local542 + local278 - (local278 * local542 >> 11);
							local45[local76] = local286 + local546 - (local286 * local546 >> 11);
							local49[local76] = local282 + local538 - (local282 * local538 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
