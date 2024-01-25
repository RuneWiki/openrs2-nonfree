import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class5_Sub3_Sub12 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
	private int anInt2951;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
	private int anInt2950 = 0;

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
	private int anInt2949 = 1024;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
	private int anInt2952 = 2048;

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
	private int anInt2955 = 1024;

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
	private int anInt2959 = 409;

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
	private int anInt2960 = 819;

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
	private int anInt2953 = 1024;

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
	private int anInt2961 = 0;

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
	private int anInt2948 = 1024;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2961 = arg0.method7291();
		} else if (arg1 == 1) {
			this.anInt2955 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt2952 = arg0.method7333();
		} else if (arg1 == 3) {
			this.anInt2959 = arg0.method7333();
		} else if (arg1 == 4) {
			this.anInt2960 = arg0.method7333();
		} else if (arg1 == 5) {
			this.anInt2953 = arg0.method7333();
		} else if (arg1 == 6) {
			this.anInt2950 = arg0.method7291();
		} else if (arg1 == 7) {
			this.anInt2948 = arg0.method7333();
		} else if (arg1 == 8) {
			this.anInt2949 = arg0.method7333();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/util/Random;[[IIIII)V")
	private void method2776(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(35) int local35 = this.anInt2949 > 0 ? 4096 - Static131.method1936(arg1, this.anInt2949) : 4096;
		@Pc(43) int local43 = this.anInt2948 * this.anInt2951 >> 12;
		@Pc(57) int local57 = this.anInt2951 - (local43 <= 0 ? 0 : Static131.method1936(arg1, local43));
		if (Static7.anInt102 <= arg0) {
			arg0 -= Static7.anInt102;
		}
		@Pc(86) int local86;
		@Pc(90) int local90;
		if (local57 > 0) {
			if (arg3 > 0 && arg5 > 0) {
				local86 = arg5 / 2;
				local90 = arg3 / 2;
				@Pc(98) int local98 = local86 >= local57 ? local57 : local86;
				@Pc(110) int local110 = local57 > local90 ? local90 : local57;
				@Pc(115) int local115 = arg0 + local98;
				@Pc(122) int local122 = arg5 - local98 * 2;
				for (@Pc(124) int local124 = 0; local124 < arg3; local124++) {
					@Pc(132) int[] local132 = arg2[arg4 + local124];
					@Pc(141) int local141;
					@Pc(146) int local146;
					@Pc(154) int local154;
					if (local124 < local110) {
						local141 = local35 * local124 / local110;
						if (this.anInt2950 == 0) {
							for (local146 = 0; local146 < local98; local146++) {
								local154 = local35 * local146 / local98;
								local132[arg0 + local146 & Static517.anInt8205] = local132[arg5 + arg0 - local146 - 1 & Static517.anInt8205] = local141 * local154 >> 12;
							}
						} else {
							for (local146 = 0; local146 < local98; local146++) {
								local154 = local35 * local146 / local98;
								local132[local146 + arg0 & Static517.anInt8205] = local132[arg5 + arg0 - local146 - 1 & Static517.anInt8205] = local154 < local141 ? local154 : local141;
							}
						}
						if (Static7.anInt102 >= local122 + local115) {
							Static693.method8318(local132, local115, local122, local141);
						} else {
							local146 = Static7.anInt102 - local115;
							Static693.method8318(local132, local115, local146, local141);
							Static693.method8318(local132, 0, local122 - local146, local141);
						}
					} else {
						local141 = arg3 - local124 - 1;
						if (local110 > local141) {
							local146 = local35 * local141 / local110;
							@Pc(316) int local316;
							if (this.anInt2950 == 0) {
								for (local154 = 0; local154 < local98; local154++) {
									local316 = local35 * local154 / local98;
									local132[local154 + arg0 & Static517.anInt8205] = local132[arg5 + arg0 - local154 - 1 & Static517.anInt8205] = local146 * local316 >> 12;
								}
							} else {
								for (local154 = 0; local154 < local98; local154++) {
									local316 = local35 * local154 / local98;
									local132[arg0 + local154 & Static517.anInt8205] = local132[arg0 + arg5 - local154 - 1 & Static517.anInt8205] = local146 > local316 ? local316 : local146;
								}
							}
							if (Static7.anInt102 < local115 + local122) {
								local154 = Static7.anInt102 - local115;
								Static693.method8318(local132, local115, local154, local146);
								Static693.method8318(local132, 0, local122 - local154, local146);
							} else {
								Static693.method8318(local132, local115, local122, local146);
							}
						} else {
							for (local146 = 0; local146 < local98; local146++) {
								local132[local146 + arg0 & Static517.anInt8205] = local132[arg0 + arg5 - local146 - 1 & Static517.anInt8205] = local146 * local35 / local98;
							}
							if (Static7.anInt102 >= local115 + local122) {
								Static693.method8318(local132, local115, local122, local35);
							} else {
								local154 = Static7.anInt102 - local115;
								Static693.method8318(local132, local115, local154, local35);
								Static693.method8318(local132, 0, local122 - local154, local35);
							}
						}
					}
				}
			}
		} else if (arg5 + arg0 <= Static7.anInt102) {
			for (local86 = 0; local86 < arg3; local86++) {
				Static693.method8318(arg2[arg4 + local86], arg0, arg5, local35);
			}
		} else {
			local86 = Static7.anInt102 - arg0;
			for (local90 = 0; local90 < arg3; local90++) {
				@Pc(571) int[] local571 = arg2[arg4 + local90];
				Static693.method8318(local571, arg0, local86, local35);
				Static693.method8318(local571, 0, arg5 - local86, local35);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (!super.aClass234_41.aBoolean392) {
			return local11;
		}
		@Pc(28) int[][] local28 = super.aClass234_41.method5230();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = this.anInt2955 * Static7.anInt102 >> 12;
		@Pc(60) int local60 = Static7.anInt102 * this.anInt2952 >> 12;
		@Pc(67) int local67 = Static122.anInt2020 * this.anInt2959 >> 12;
		@Pc(74) int local74 = Static122.anInt2020 * this.anInt2960 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt2951 = Static7.anInt102 / 8 * this.anInt2953 >> 12;
		@Pc(100) int local100 = Static7.anInt102 / local53 + 1;
		@Pc(104) int[][] local104 = new int[local100][3];
		@Pc(108) int[][] local108 = new int[local100][3];
		@Pc(115) Random local115 = new Random((long) this.anInt2961);
		while (true) {
			while (true) {
				@Pc(124) int local124 = local53 + Static131.method1936(local115, local60 - local53);
				@Pc(133) int local133 = Static131.method1936(local115, local74 - local67) + local67;
				@Pc(137) int local137 = local124 + local36;
				if (Static7.anInt102 < local137) {
					local137 = Static7.anInt102;
					local124 = Static7.anInt102 - local36;
				}
				@Pc(153) int local153;
				@Pc(163) int local163;
				if (local42) {
					local153 = 0;
				} else {
					@Pc(157) int local157 = local38;
					@Pc(161) int[] local161 = local108[local38];
					local163 = 0;
					@Pc(167) int local167 = local137 + local30;
					if (local167 < 0) {
						local167 += Static7.anInt102;
					}
					if (Static7.anInt102 < local167) {
						local167 -= Static7.anInt102;
					}
					while (true) {
						@Pc(184) int[] local184 = local108[local157];
						if (local167 >= local184[0] && local184[1] >= local167) {
							local153 = local161[2];
							if (local157 != local38) {
								@Pc(227) int local227 = local36 + local30;
								if (local227 < 0) {
									local227 += Static7.anInt102;
								}
								if (local227 > Static7.anInt102) {
									local227 -= Static7.anInt102;
								}
								for (@Pc(246) int local246 = 1; local246 <= local163; local246++) {
									@Pc(257) int[] local257 = local108[(local38 + local246) % local44];
									local153 = Math.max(local153, local257[2]);
								}
								for (@Pc(269) int local269 = 0; local269 <= local163; local269++) {
									@Pc(279) int[] local279 = local108[(local269 + local38) % local44];
									@Pc(283) int local283 = local279[2];
									if (local153 != local283) {
										@Pc(294) int local294 = local279[0];
										@Pc(298) int local298 = local279[1];
										@Pc(305) int local305;
										@Pc(309) int local309;
										if (local167 > local227) {
											local305 = Math.max(local227, local294);
											local309 = Math.min(local167, local298);
										} else if (local294 == 0) {
											local305 = 0;
											local309 = Math.min(local167, local298);
										} else {
											local305 = Math.max(local227, local294);
											local309 = Static7.anInt102;
										}
										this.method2776(local34 + local305, local115, local28, local153 - local283, local283, local309 - local305);
									}
								}
							}
							local38 = local157;
							break;
						}
						local163++;
						local157++;
						if (local157 >= local44) {
							local157 = 0;
						}
					}
				}
				if (Static122.anInt2020 < local153 + local133) {
					local133 = Static122.anInt2020 - local153;
				} else {
					local40 = false;
				}
				@Pc(384) int[] local384;
				if (local137 == Static7.anInt102) {
					this.method2776(local32 + local36, local115, local28, local133, local153, local124);
					if (local40) {
						return local11;
					}
					local40 = true;
					local384 = local104[local46++];
					local384[0] = local36;
					local384[2] = local153 + local133;
					local384[1] = local137;
					@Pc(450) int[][] local450 = local108;
					local108 = local104;
					local104 = local450;
					local44 = local46;
					local46 = 0;
					local34 = local32;
					local32 = Static131.method1936(local115, Static7.anInt102);
					local30 = local32 - local34;
					local36 = 0;
					local163 = local30;
					if (local30 < 0) {
						local163 = local30 + Static7.anInt102;
					}
					if (Static7.anInt102 < local163) {
						local163 -= Static7.anInt102;
					}
					local38 = 0;
					local42 = false;
					while (true) {
						@Pc(502) int[] local502 = local108[local38];
						if (local163 >= local502[0] && local163 <= local502[1]) {
							break;
						}
						@Pc(515) int local515 = ~local44;
						local38++;
						if (local515 >= ~local38) {
							local38 = 0;
						}
					}
				} else {
					local384 = local104[local46++];
					local384[1] = local137;
					local384[0] = local36;
					local384[2] = local133 + local153;
					this.method2776(local32 + local36, local115, local28, local133, local153, local124);
					local36 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
	}
}
