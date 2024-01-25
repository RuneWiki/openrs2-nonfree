import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class4_Sub1_Sub35 extends Class4_Sub1 {

	@OriginalMember(owner = "client!uda", name = "E", descriptor = "I")
	private int anInt9420 = 6;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub35() {
		super(2, false);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(29) int[] local29 = this.method8392(arg0, 0);
			@Pc(35) int[] local35 = this.method8392(arg0, 1);
			@Pc(38) int local38 = this.anInt9420;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static376.anInt7260; local38++) {
					local19[local38] = local29[local38] + local35[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static376.anInt7260; local38++) {
					local19[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static376.anInt7260; local38++) {
					local19[local38] = local29[local38] * local35[local38] >> 12;
				}
			} else {
				@Pc(151) int local151;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static376.anInt7260; local38++) {
						local151 = local35[local38];
						local19[local38] = local151 == 0 ? 4096 : (local29[local38] << 12) / local151;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static376.anInt7260; local38++) {
						local19[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static376.anInt7260; local38++) {
						local151 = local35[local38];
						local19[local38] = local151 >= 2048 ? 4096 - ((4096 - local29[local38]) * (-local151 + 4096) >> 11) : local151 * local29[local38] >> 11;
					}
				} else {
					@Pc(254) int local254;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static376.anInt7260; local38++) {
							local254 = local29[local38];
							local19[local38] = local254 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local254);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static376.anInt7260; local38++) {
							local254 = local29[local38];
							local19[local38] = local254 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local254;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static376.anInt7260; local38++) {
							local151 = local35[local38];
							local254 = local29[local38];
							local19[local38] = local151 <= local254 ? local151 : local254;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static376.anInt7260; local38++) {
							local254 = local29[local38];
							local151 = local35[local38];
							local19[local38] = local151 < local254 ? local254 : local151;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static376.anInt7260; local38++) {
							local151 = local35[local38];
							local254 = local29[local38];
							local19[local38] = local151 >= local254 ? local151 - local254 : local254 - local151;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static376.anInt7260; local38++) {
							local254 = local29[local38];
							local151 = local35[local38];
							local19[local38] = local254 + local151 - (local151 * local254 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt9420 = arg1.method4905();
		} else if (arg0 == 1) {
			super.aBoolean726 = arg1.method4905() == 1;
		}
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(31) int[][] local31 = this.method8385(arg0, 0);
			@Pc(37) int[][] local37 = this.method8385(arg0, 1);
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[2];
			@Pc(53) int[] local53 = local31[0];
			@Pc(57) int[] local57 = local31[1];
			@Pc(61) int[] local61 = local31[2];
			@Pc(65) int[] local65 = local37[0];
			@Pc(69) int[] local69 = local37[1];
			@Pc(73) int[] local73 = local37[2];
			@Pc(76) int local76 = this.anInt9420;
			if (local76 == 1) {
				for (local76 = 0; local76 < Static376.anInt7260; local76++) {
					local41[local76] = local53[local76] + local65[local76];
					local45[local76] = local57[local76] + local69[local76];
					local49[local76] = local61[local76] + local73[local76];
				}
			} else if (local76 == 2) {
				for (local76 = 0; local76 < Static376.anInt7260; local76++) {
					local41[local76] = local53[local76] - local65[local76];
					local45[local76] = local57[local76] - local69[local76];
					local49[local76] = local61[local76] - local73[local76];
				}
			} else if (local76 == 3) {
				for (local76 = 0; local76 < Static376.anInt7260; local76++) {
					local41[local76] = local65[local76] * local53[local76] >> 12;
					local45[local76] = local69[local76] * local57[local76] >> 12;
					local49[local76] = local73[local76] * local61[local76] >> 12;
				}
			} else {
				@Pc(271) int local271;
				@Pc(275) int local275;
				@Pc(279) int local279;
				if (local76 == 4) {
					for (local76 = 0; local76 < Static376.anInt7260; local76++) {
						local271 = local65[local76];
						local275 = local69[local76];
						local279 = local73[local76];
						local41[local76] = local271 == 0 ? 4096 : (local53[local76] << 12) / local271;
						local45[local76] = local275 == 0 ? 4096 : (local57[local76] << 12) / local275;
						local49[local76] = local279 == 0 ? 4096 : (local61[local76] << 12) / local279;
					}
				} else if (local76 == 5) {
					for (local76 = 0; local76 < Static376.anInt7260; local76++) {
						local41[local76] = 4096 - ((4096 - local53[local76]) * (-local65[local76] + 4096) >> 12);
						local45[local76] = 4096 - ((4096 - local69[local76]) * (-local57[local76] + 4096) >> 12);
						local49[local76] = 4096 - ((4096 - local73[local76]) * (4096 - local61[local76]) >> 12);
					}
				} else if (local76 == 6) {
					for (local76 = 0; local76 < Static376.anInt7260; local76++) {
						local271 = local65[local76];
						local279 = local73[local76];
						local275 = local69[local76];
						local41[local76] = local271 < 2048 ? local53[local76] * local271 >> 11 : 4096 - ((4096 - local53[local76]) * (4096 - local271) >> 11);
						local45[local76] = local275 >= 2048 ? 4096 - ((4096 - local275) * (-local57[local76] + 4096) >> 11) : local57[local76] * local275 >> 11;
						local49[local76] = local279 < 2048 ? local61[local76] * local279 >> 11 : 4096 - ((4096 - local279) * (-local61[local76] + 4096) >> 11);
					}
				} else {
					@Pc(531) int local531;
					@Pc(527) int local527;
					@Pc(535) int local535;
					if (local76 == 7) {
						for (local76 = 0; local76 < Static376.anInt7260; local76++) {
							local527 = local57[local76];
							local531 = local53[local76];
							local535 = local61[local76];
							local41[local76] = local531 == 4096 ? 4096 : (local65[local76] << 12) / (4096 - local531);
							local45[local76] = local527 == 4096 ? 4096 : (local69[local76] << 12) / (4096 - local527);
							local49[local76] = local535 == 4096 ? 4096 : (local73[local76] << 12) / (4096 - local535);
						}
					} else if (local76 == 8) {
						for (local76 = 0; local76 < Static376.anInt7260; local76++) {
							local535 = local61[local76];
							local527 = local57[local76];
							local531 = local53[local76];
							local41[local76] = local531 == 0 ? 0 : 4096 - (4096 - local65[local76] << 12) / local531;
							local45[local76] = local527 == 0 ? 0 : 4096 - (4096 - local69[local76] << 12) / local527;
							local49[local76] = local535 == 0 ? 0 : 4096 - (4096 - local73[local76] << 12) / local535;
						}
					} else if (local76 == 9) {
						for (local76 = 0; local76 < Static376.anInt7260; local76++) {
							local275 = local69[local76];
							local535 = local61[local76];
							local279 = local73[local76];
							local271 = local65[local76];
							local527 = local57[local76];
							local531 = local53[local76];
							local41[local76] = local271 > local531 ? local531 : local271;
							local45[local76] = local275 <= local527 ? local275 : local527;
							local49[local76] = local279 <= local535 ? local279 : local535;
						}
					} else if (local76 == 10) {
						for (local76 = 0; local76 < Static376.anInt7260; local76++) {
							local535 = local61[local76];
							local275 = local69[local76];
							local271 = local65[local76];
							local527 = local57[local76];
							local279 = local73[local76];
							local531 = local53[local76];
							local41[local76] = local531 > local271 ? local531 : local271;
							local45[local76] = local275 < local527 ? local527 : local275;
							local49[local76] = local535 <= local279 ? local279 : local535;
						}
					} else if (local76 == 11) {
						for (local76 = 0; local76 < Static376.anInt7260; local76++) {
							local527 = local57[local76];
							local271 = local65[local76];
							local531 = local53[local76];
							local275 = local69[local76];
							local535 = local61[local76];
							local279 = local73[local76];
							local41[local76] = local531 > local271 ? local531 - local271 : local271 - local531;
							local45[local76] = local527 <= local275 ? local275 - local527 : -local275 + local527;
							local49[local76] = local535 <= local279 ? local279 - local535 : local535 - local279;
						}
					} else if (local76 == 12) {
						for (local76 = 0; local76 < Static376.anInt7260; local76++) {
							local531 = local53[local76];
							local279 = local73[local76];
							local535 = local61[local76];
							local271 = local65[local76];
							local527 = local57[local76];
							local275 = local69[local76];
							local41[local76] = local531 + local271 - (local531 * local271 >> 11);
							local45[local76] = local275 + local527 - (local275 * local527 >> 11);
							local49[local76] = local535 + local279 - (local279 * local535 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
