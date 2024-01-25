import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class1_Sub4_Sub14 extends Class1_Sub4 {

	@OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
	private int anInt1771;

	@OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
	private int anInt1765 = 819;

	@OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
	private int anInt1768 = 1024;

	@OriginalMember(owner = "client!eq", name = "K", descriptor = "I")
	private int anInt1769 = 1024;

	@OriginalMember(owner = "client!eq", name = "O", descriptor = "I")
	private int anInt1772 = 1024;

	@OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
	private int anInt1770 = 409;

	@OriginalMember(owner = "client!eq", name = "P", descriptor = "I")
	private int anInt1773 = 0;

	@OriginalMember(owner = "client!eq", name = "I", descriptor = "I")
	private int anInt1767 = 1024;

	@OriginalMember(owner = "client!eq", name = "H", descriptor = "I")
	private int anInt1766 = 2048;

	@OriginalMember(owner = "client!eq", name = "W", descriptor = "I")
	private int anInt1777 = 0;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (!super.aClass2_41.aBoolean5) {
			return local11;
		}
		@Pc(22) int[][] local22 = super.aClass2_41.method13();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) boolean local34 = true;
		@Pc(36) boolean local36 = true;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(47) int local47 = this.anInt1768 * Static395.anInt6592 >> 12;
		@Pc(54) int local54 = this.anInt1766 * Static395.anInt6592 >> 12;
		@Pc(61) int local61 = Static186.anInt3223 * this.anInt1770 >> 12;
		@Pc(68) int local68 = this.anInt1765 * Static186.anInt3223 >> 12;
		if (local68 <= 1) {
			return local22[arg0];
		}
		this.anInt1771 = this.anInt1767 * (Static395.anInt6592 / 8) >> 12;
		@Pc(91) int local91 = Static395.anInt6592 / local47 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt1777);
		while (true) {
			while (true) {
				@Pc(116) int local116 = Static301.method4119(local106, local54 - local47) + local47;
				@Pc(125) int local125 = Static301.method4119(local106, local68 - local61) + local61;
				@Pc(129) int local129 = local116 + local30;
				if (local129 > Static395.anInt6592) {
					local116 = Static395.anInt6592 - local30;
					local129 = Static395.anInt6592;
				}
				@Pc(205) int local205;
				@Pc(153) int local153;
				if (local36) {
					local205 = 0;
				} else {
					@Pc(147) int local147 = local32;
					@Pc(151) int[] local151 = local99[local32];
					local153 = 0;
					@Pc(157) int local157 = local24 + local129;
					if (local157 < 0) {
						local157 += Static395.anInt6592;
					}
					if (local157 > Static395.anInt6592) {
						local157 -= Static395.anInt6592;
					}
					while (true) {
						@Pc(178) int[] local178 = local99[local147];
						if (local157 >= local178[0] && local178[1] >= local157) {
							local205 = local151[2];
							if (local32 != local147) {
								@Pc(212) int local212 = local24 + local30;
								if (local212 < 0) {
									local212 += Static395.anInt6592;
								}
								if (local212 > Static395.anInt6592) {
									local212 -= Static395.anInt6592;
								}
								for (@Pc(231) int local231 = 1; local231 <= local153; local231++) {
									@Pc(241) int[] local241 = local99[(local231 + local32) % local38];
									local205 = Math.max(local205, local241[2]);
								}
								for (@Pc(253) int local253 = 0; local253 <= local153; local253++) {
									@Pc(263) int[] local263 = local99[(local253 + local32) % local38];
									@Pc(267) int local267 = local263[2];
									if (local267 != local205) {
										@Pc(274) int local274 = local263[0];
										@Pc(278) int local278 = local263[1];
										@Pc(285) int local285;
										@Pc(289) int local289;
										if (local212 < local157) {
											local285 = Math.max(local212, local274);
											local289 = Math.min(local157, local278);
										} else if (local274 == 0) {
											local289 = Math.min(local157, local278);
											local285 = 0;
										} else {
											local285 = Math.max(local212, local274);
											local289 = Static395.anInt6592;
										}
										this.method1533(local106, local22, local267, local205 - local267, local285 - -local28, local289 - local285);
									}
								}
							}
							local32 = local147;
							break;
						}
						local153++;
						local147++;
						if (local38 <= local147) {
							local147 = 0;
						}
					}
				}
				if (Static186.anInt3223 < local205 + local125) {
					local125 = Static186.anInt3223 - local205;
				} else {
					local34 = false;
				}
				@Pc(369) int[] local369;
				if (local129 == Static395.anInt6592) {
					this.method1533(local106, local22, local205, local125, local26 + local30, local116);
					if (local34) {
						return local11;
					}
					local34 = true;
					local369 = local95[local40++];
					local369[0] = local30;
					local369[1] = local129;
					local369[2] = local125 + local205;
					@Pc(434) int[][] local434 = local99;
					local99 = local95;
					local95 = local434;
					local38 = local40;
					local28 = local26;
					local40 = 0;
					local26 = Static301.method4119(local106, Static395.anInt6592);
					local30 = 0;
					local24 = local26 - local28;
					local153 = local24;
					if (local24 < 0) {
						local153 = local24 + Static395.anInt6592;
					}
					if (Static395.anInt6592 < local153) {
						local153 -= Static395.anInt6592;
					}
					local32 = 0;
					while (true) {
						@Pc(476) int[] local476 = local99[local32];
						if (local153 >= local476[0] && local153 <= local476[1]) {
							local36 = false;
							break;
						}
						local32++;
						if (local32 >= local38) {
							local32 = 0;
						}
					}
				} else {
					local369 = local95[local40++];
					local369[2] = local125 + local205;
					local369[0] = local30;
					local369[1] = local129;
					this.method1533(local106, local22, local205, local125, local30 + local26, local116);
					local30 = local129;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/util/Random;[[IZIIII)V")
	private void method1533(@OriginalArg(0) Random arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt1772 <= 0 ? 4096 : 4096 - Static301.method4119(arg0, this.anInt1772);
		@Pc(27) int local27 = this.anInt1771 * this.anInt1769 >> 12;
		@Pc(43) int local43 = this.anInt1771 - (local27 > 0 ? Static301.method4119(arg0, local27) : 0);
		if (Static395.anInt6592 <= arg4) {
			arg4 -= Static395.anInt6592;
		}
		@Pc(69) int local69;
		@Pc(71) int local71;
		if (local43 > 0) {
			if (arg3 <= 0 || arg5 <= 0) {
				return;
			}
			local69 = arg5 / 2;
			local71 = arg3 / 2;
			@Pc(151) int local151 = local43 <= local69 ? local43 : local69;
			@Pc(158) int local158 = local43 > local71 ? local71 : local43;
			@Pc(163) int local163 = arg4 + local151;
			@Pc(170) int local170 = arg5 - local151 * 2;
			for (@Pc(172) int local172 = 0; local172 < arg3; local172++) {
				@Pc(180) int[] local180 = arg1[local172 + arg2];
				@Pc(193) int local193;
				@Pc(201) int local201;
				@Pc(209) int local209;
				if (local172 < local158) {
					local193 = local172 * local19 / local158;
					if (this.anInt1773 == 0) {
						for (local201 = 0; local201 < local151; local201++) {
							local209 = local19 * local201 / local151;
							local180[Static247.anInt4469 & local201 + arg4] = local180[arg5 + arg4 - local201 - 1 & Static247.anInt4469] = local193 * local209 >> 12;
						}
					} else {
						for (local201 = 0; local201 < local151; local201++) {
							local209 = local201 * local19 / local151;
							local180[Static247.anInt4469 & arg4 + local201] = local180[arg4 + arg5 - local201 - 1 & Static247.anInt4469] = local193 > local209 ? local209 : local193;
						}
					}
					if (local170 + local163 <= Static395.anInt6592) {
						Static468.method5037(local180, local163, local170, local193);
					} else {
						local201 = Static395.anInt6592 - local163;
						Static468.method5037(local180, local163, local201, local193);
						Static468.method5037(local180, 0, local170 - local201, local193);
					}
				} else {
					local193 = arg3 - local172 - 1;
					if (local158 > local193) {
						local201 = local193 * local19 / local158;
						@Pc(343) int local343;
						if (this.anInt1773 == 0) {
							for (local209 = 0; local209 < local151; local209++) {
								local343 = local209 * local19 / local151;
								local180[arg4 + local209 & Static247.anInt4469] = local180[Static247.anInt4469 & arg4 + arg5 - local209 - 1] = local343 * local201 >> 12;
							}
						} else {
							for (local209 = 0; local209 < local151; local209++) {
								local343 = local19 * local209 / local151;
								local180[Static247.anInt4469 & local209 + arg4] = local180[Static247.anInt4469 & arg5 + arg4 - local209 - 1] = local343 >= local201 ? local201 : local343;
							}
						}
						if (Static395.anInt6592 < local170 + local163) {
							local209 = Static395.anInt6592 - local163;
							Static468.method5037(local180, local163, local209, local201);
							Static468.method5037(local180, 0, local170 - local209, local201);
						} else {
							Static468.method5037(local180, local163, local170, local201);
						}
					} else {
						for (local201 = 0; local201 < local151; local201++) {
							local180[Static247.anInt4469 & arg4 + local201] = local180[arg4 + arg5 - local201 - 1 & Static247.anInt4469] = local201 * local19 / local151;
						}
						if (local163 + local170 > Static395.anInt6592) {
							local209 = Static395.anInt6592 - local163;
							Static468.method5037(local180, local163, local209, local19);
							Static468.method5037(local180, 0, local170 - local209, local19);
						} else {
							Static468.method5037(local180, local163, local170, local19);
						}
					}
				}
			}
		} else if (Static395.anInt6592 < arg5 + arg4) {
			local69 = Static395.anInt6592 - arg4;
			for (local71 = 0; local71 < arg3; local71++) {
				@Pc(79) int[] local79 = arg1[arg2 + local71];
				Static468.method5037(local79, arg4, local69, local19);
				Static468.method5037(local79, 0, arg5 - local69, local19);
			}
		} else {
			for (local69 = 0; local69 < arg3; local69++) {
				Static468.method5037(arg1[local69 + arg2], arg4, arg5, local19);
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1777 = arg0.method5337();
		} else if (arg1 == 1) {
			this.anInt1768 = arg0.method5335();
		} else if (arg1 == 2) {
			this.anInt1766 = arg0.method5335();
		} else if (arg1 == 3) {
			this.anInt1770 = arg0.method5335();
		} else if (arg1 == 4) {
			this.anInt1765 = arg0.method5335();
		} else if (arg1 == 5) {
			this.anInt1767 = arg0.method5335();
		} else if (arg1 == 6) {
			this.anInt1773 = arg0.method5337();
		} else if (arg1 == 7) {
			this.anInt1769 = arg0.method5335();
		} else if (arg1 == 8) {
			this.anInt1772 = arg0.method5335();
		}
	}
}
