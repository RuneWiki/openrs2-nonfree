import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class1_Sub2_Sub28 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
	private int anInt5192;

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
	private int anInt5181 = 1024;

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
	private int anInt5182 = 409;

	@OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
	private int anInt5178 = 2048;

	@OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
	private int anInt5185 = 1024;

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
	private int anInt5190 = 819;

	@OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
	private int anInt5189 = 1024;

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
	private int anInt5191 = 0;

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
	private int anInt5184 = 1024;

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
	private int anInt5188 = 0;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5188 = arg0.method4548();
		} else if (arg1 == 1) {
			this.anInt5184 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anInt5178 = arg0.method4498();
		} else if (arg1 == 3) {
			this.anInt5182 = arg0.method4498();
		} else if (arg1 == 4) {
			this.anInt5190 = arg0.method4498();
		} else if (arg1 == 5) {
			this.anInt5185 = arg0.method4498();
		} else if (arg1 == 6) {
			this.anInt5191 = arg0.method4548();
		} else if (arg1 == 7) {
			this.anInt5181 = arg0.method4498();
		} else if (arg1 == 8) {
			this.anInt5189 = arg0.method4498();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (!super.aClass264_41.aBoolean657) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass264_41.method5971();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt5184 * Static410.anInt7198 >> 12;
		@Pc(52) int local52 = Static410.anInt7198 * this.anInt5178 >> 12;
		@Pc(59) int local59 = Static214.anInt6457 * this.anInt5182 >> 12;
		@Pc(66) int local66 = this.anInt5190 * Static214.anInt6457 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt5192 = Static410.anInt7198 / 8 * this.anInt5185 >> 12;
		@Pc(89) int local89 = Static410.anInt7198 / local45 + 1;
		@Pc(93) int[][] local93 = new int[local89][3];
		@Pc(97) int[][] local97 = new int[local89][3];
		@Pc(104) Random local104 = new Random((long) this.anInt5188);
		while (true) {
			while (true) {
				@Pc(114) int local114 = Static19.method243(local52 - local45, local104) + local45;
				@Pc(123) int local123 = Static19.method243(local66 - local59, local104) + local59;
				@Pc(127) int local127 = local114 + local28;
				if (Static410.anInt7198 < local127) {
					local127 = Static410.anInt7198;
					local114 = Static410.anInt7198 - local28;
				}
				@Pc(175) int local175;
				@Pc(147) int local147;
				if (local34) {
					local175 = 0;
				} else {
					@Pc(141) int local141 = local30;
					@Pc(145) int[] local145 = local97[local30];
					local147 = 0;
					@Pc(151) int local151 = local127 + local22;
					if (local151 < 0) {
						local151 += Static410.anInt7198;
					}
					if (Static410.anInt7198 < local151) {
						local151 -= Static410.anInt7198;
					}
					local175 = local145[2];
					while (true) {
						@Pc(179) int[] local179 = local97[local141];
						if (local179[0] <= local151 && local151 <= local179[1]) {
							if (local141 != local30) {
								@Pc(214) int local214 = local28 + local22;
								if (local214 < 0) {
									local214 += Static410.anInt7198;
								}
								if (local214 > Static410.anInt7198) {
									local214 -= Static410.anInt7198;
								}
								for (@Pc(236) int local236 = 1; local236 <= local147; local236++) {
									@Pc(246) int[] local246 = local97[(local30 + local236) % local36];
									local175 = Math.max(local175, local246[2]);
								}
								for (@Pc(262) int local262 = 0; local262 <= local147; local262++) {
									@Pc(272) int[] local272 = local97[(local30 + local262) % local36];
									@Pc(276) int local276 = local272[2];
									if (local175 != local276) {
										@Pc(283) int local283 = local272[0];
										@Pc(287) int local287 = local272[1];
										@Pc(303) int local303;
										@Pc(305) int local305;
										if (local214 < local151) {
											local303 = Math.max(local214, local283);
											local305 = Math.min(local151, local287);
										} else if (local283 == 0) {
											local303 = 0;
											local305 = Math.min(local151, local287);
										} else {
											local303 = Math.max(local214, local283);
											local305 = Static410.anInt7198;
										}
										this.method4219(local20, local104, local305 - local303, local303 + local26, local175 - local276, local276);
									}
								}
							}
							local30 = local141;
							break;
						}
						local147++;
						@Pc(193) int local193 = ~local36;
						local141++;
						if (local193 >= ~local141) {
							local141 = 0;
						}
					}
				}
				if (Static214.anInt6457 < local123 + local175) {
					local123 = Static214.anInt6457 - local175;
				} else {
					local32 = false;
				}
				@Pc(397) int[] local397;
				if (Static410.anInt7198 == local127) {
					this.method4219(local20, local104, local114, local24 + local28, local123, local175);
					if (local32) {
						return local11;
					}
					local32 = true;
					local397 = local93[local38++];
					local397[2] = local123 + local175;
					local397[1] = local127;
					local397[0] = local28;
					@Pc(413) int[][] local413 = local97;
					local97 = local93;
					local93 = local413;
					local36 = local38;
					local38 = 0;
					local26 = local24;
					local24 = Static19.method243(Static410.anInt7198, local104);
					local28 = 0;
					local22 = local24 - local26;
					local147 = local22;
					if (local22 < 0) {
						local147 = local22 + Static410.anInt7198;
					}
					local30 = 0;
					if (Static410.anInt7198 < local147) {
						local147 -= Static410.anInt7198;
					}
					while (true) {
						@Pc(459) int[] local459 = local97[local30];
						if (local147 >= local459[0] && local147 <= local459[1]) {
							local34 = false;
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local397 = local93[local38++];
					local397[1] = local127;
					local397[2] = local123 + local175;
					local397[0] = local28;
					this.method4219(local20, local104, local114, local28 + local24, local123, local175);
					local28 = local127;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([[ILjava/util/Random;IIIII)V")
	private void method4219(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt5189 <= 0 ? 4096 : 4096 - Static19.method243(this.anInt5189, arg1);
		@Pc(27) int local27 = this.anInt5192 * this.anInt5181 >> 12;
		@Pc(42) int local42 = this.anInt5192 - (local27 <= 0 ? 0 : Static19.method243(local27, arg1));
		if (arg3 >= Static410.anInt7198) {
			arg3 -= Static410.anInt7198;
		}
		@Pc(66) int local66;
		@Pc(70) int local70;
		if (local42 > 0) {
			if (arg4 > 0 && arg2 > 0) {
				local66 = arg2 / 2;
				local70 = arg4 / 2;
				@Pc(77) int local77 = local66 >= local42 ? local42 : local66;
				@Pc(84) int local84 = local70 < local42 ? local70 : local42;
				@Pc(88) int local88 = local77 + arg3;
				@Pc(95) int local95 = arg2 - local77 * 2;
				for (@Pc(97) int local97 = 0; local97 < arg4; local97++) {
					@Pc(105) int[] local105 = arg0[arg5 + local97];
					@Pc(114) int local114;
					@Pc(119) int local119;
					@Pc(127) int local127;
					if (local97 < local84) {
						local114 = local19 * local97 / local84;
						if (this.anInt5191 == 0) {
							for (local119 = 0; local119 < local77; local119++) {
								local127 = local119 * local19 / local77;
								local105[Static301.anInt5026 & local119 + arg3] = local105[Static301.anInt5026 & arg3 + arg2 - local119 - 1] = local114 * local127 >> 12;
							}
						} else {
							for (local119 = 0; local119 < local77; local119++) {
								local127 = local119 * local19 / local77;
								local105[local119 + arg3 & Static301.anInt5026] = local105[Static301.anInt5026 & arg3 + arg2 - local119 - 1] = local127 >= local114 ? local114 : local127;
							}
						}
						if (Static410.anInt7198 < local95 + local88) {
							local119 = Static410.anInt7198 - local88;
							Static459.method1547(local105, local88, local119, local114);
							Static459.method1547(local105, 0, local95 - local119, local114);
						} else {
							Static459.method1547(local105, local88, local95, local114);
						}
					} else {
						local114 = arg4 - local97 - 1;
						if (local84 > local114) {
							local119 = local114 * local19 / local84;
							@Pc(271) int local271;
							if (this.anInt5191 == 0) {
								for (local127 = 0; local127 < local77; local127++) {
									local271 = local19 * local127 / local77;
									local105[Static301.anInt5026 & arg3 + local127] = local105[arg2 + arg3 - local127 - 1 & Static301.anInt5026] = local271 * local119 >> 12;
								}
							} else {
								for (local127 = 0; local127 < local77; local127++) {
									local271 = local127 * local19 / local77;
									local105[local127 + arg3 & Static301.anInt5026] = local105[arg3 + arg2 - local127 - 1 & Static301.anInt5026] = local271 >= local119 ? local119 : local271;
								}
							}
							if (local88 + local95 > Static410.anInt7198) {
								local127 = Static410.anInt7198 - local88;
								Static459.method1547(local105, local88, local127, local119);
								Static459.method1547(local105, 0, local95 - local127, local119);
							} else {
								Static459.method1547(local105, local88, local95, local119);
							}
						} else {
							for (local119 = 0; local119 < local77; local119++) {
								local105[local119 + arg3 & Static301.anInt5026] = local105[arg3 + arg2 - local119 - 1 & Static301.anInt5026] = local119 * local19 / local77;
							}
							if (Static410.anInt7198 < local95 + local88) {
								local127 = Static410.anInt7198 - local88;
								Static459.method1547(local105, local88, local127, local19);
								Static459.method1547(local105, 0, local95 - local127, local19);
							} else {
								Static459.method1547(local105, local88, local95, local19);
							}
						}
					}
				}
			}
		} else if (arg3 + arg2 <= Static410.anInt7198) {
			for (local66 = 0; local66 < arg4; local66++) {
				Static459.method1547(arg0[arg5 + local66], arg3, arg2, local19);
			}
		} else {
			local66 = Static410.anInt7198 - arg3;
			for (local70 = 0; local70 < arg4; local70++) {
				@Pc(484) int[] local484 = arg0[local70 + arg5];
				Static459.method1547(local484, arg3, local66, local19);
				Static459.method1547(local484, 0, arg2 - local66, local19);
			}
		}
	}
}
