import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class2_Sub6_Sub33 extends Class2_Sub6 {

	@OriginalMember(owner = "client!un", name = "R", descriptor = "I")
	private int anInt9440;

	@OriginalMember(owner = "client!un", name = "I", descriptor = "I")
	private int anInt9431 = 2048;

	@OriginalMember(owner = "client!un", name = "P", descriptor = "I")
	private int anInt9438 = 0;

	@OriginalMember(owner = "client!un", name = "L", descriptor = "I")
	private int anInt9434 = 0;

	@OriginalMember(owner = "client!un", name = "O", descriptor = "I")
	private int anInt9437 = 1024;

	@OriginalMember(owner = "client!un", name = "K", descriptor = "I")
	private int anInt9433 = 409;

	@OriginalMember(owner = "client!un", name = "N", descriptor = "I")
	private int anInt9436 = 1024;

	@OriginalMember(owner = "client!un", name = "M", descriptor = "I")
	private int anInt9435 = 819;

	@OriginalMember(owner = "client!un", name = "S", descriptor = "I")
	private int anInt9441 = 1024;

	@OriginalMember(owner = "client!un", name = "V", descriptor = "I")
	private int anInt9444 = 1024;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I[[IIIIILjava/util/Random;)V")
	private void method7914(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(19) int local19 = this.anInt9441 <= 0 ? 4096 : 4096 - Static239.method3351(this.anInt9441, arg5);
		@Pc(27) int local27 = this.anInt9444 * this.anInt9440 >> 12;
		@Pc(47) int local47 = this.anInt9440 - (local27 > 0 ? Static239.method3351(local27, arg5) : 0);
		if (Static51.anInt1085 <= arg4) {
			arg4 -= Static51.anInt1085;
		}
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (local47 <= 0) {
			if (Static51.anInt1085 < arg4 + arg2) {
				local73 = Static51.anInt1085 - arg4;
				for (local75 = 0; local75 < arg3; local75++) {
					@Pc(83) int[] local83 = arg1[arg0 + local75];
					Static653.method5393(local83, arg4, local73, local19);
					Static653.method5393(local83, 0, arg2 - local73, local19);
				}
			} else {
				for (local73 = 0; local73 < arg3; local73++) {
					Static653.method5393(arg1[local73 + arg0], arg4, arg2, local19);
				}
			}
		} else if (arg3 > 0 && arg2 > 0) {
			local73 = arg2 / 2;
			local75 = arg3 / 2;
			@Pc(153) int local153 = local73 < local47 ? local73 : local47;
			@Pc(164) int local164 = local75 >= local47 ? local47 : local75;
			@Pc(168) int local168 = local153 + arg4;
			@Pc(175) int local175 = arg2 - local153 * 2;
			for (@Pc(177) int local177 = 0; local177 < arg3; local177++) {
				@Pc(185) int[] local185 = arg1[local177 + arg0];
				@Pc(198) int local198;
				@Pc(203) int local203;
				@Pc(211) int local211;
				if (local177 < local164) {
					local198 = local19 * local177 / local164;
					if (this.anInt9434 == 0) {
						for (local203 = 0; local203 < local153; local203++) {
							local211 = local203 * local19 / local153;
							local185[Static332.anInt5256 & arg4 + local203] = local185[arg4 + arg2 - local203 - 1 & Static332.anInt5256] = local211 * local198 >> 12;
						}
					} else {
						for (local203 = 0; local203 < local153; local203++) {
							local211 = local19 * local203 / local153;
							local185[arg4 + local203 & Static332.anInt5256] = local185[arg2 + arg4 - local203 - 1 & Static332.anInt5256] = local211 >= local198 ? local198 : local211;
						}
					}
					if (Static51.anInt1085 < local168 + local175) {
						local203 = Static51.anInt1085 - local168;
						Static653.method5393(local185, local168, local203, local198);
						Static653.method5393(local185, 0, local175 - local203, local198);
					} else {
						Static653.method5393(local185, local168, local175, local198);
					}
				} else {
					local198 = arg3 - local177 - 1;
					if (local198 < local164) {
						local203 = local19 * local198 / local164;
						@Pc(349) int local349;
						if (this.anInt9434 == 0) {
							for (local211 = 0; local211 < local153; local211++) {
								local349 = local211 * local19 / local153;
								local185[arg4 + local211 & Static332.anInt5256] = local185[arg4 + arg2 - local211 - 1 & Static332.anInt5256] = local203 * local349 >> 12;
							}
						} else {
							for (local211 = 0; local211 < local153; local211++) {
								local349 = local211 * local19 / local153;
								local185[arg4 + local211 & Static332.anInt5256] = local185[Static332.anInt5256 & arg4 + arg2 - local211 - 1] = local203 <= local349 ? local203 : local349;
							}
						}
						if (Static51.anInt1085 < local175 + local168) {
							local211 = Static51.anInt1085 - local168;
							Static653.method5393(local185, local168, local211, local203);
							Static653.method5393(local185, 0, local175 - local211, local203);
						} else {
							Static653.method5393(local185, local168, local175, local203);
						}
					} else {
						for (local203 = 0; local203 < local153; local203++) {
							local185[local203 + arg4 & Static332.anInt5256] = local185[arg4 + arg2 - local203 - 1 & Static332.anInt5256] = local203 * local19 / local153;
						}
						if (Static51.anInt1085 >= local168 + local175) {
							Static653.method5393(local185, local168, local175, local19);
						} else {
							local211 = Static51.anInt1085 - local168;
							Static653.method5393(local185, local168, local211, local19);
							Static653.method5393(local185, 0, local175 - local211, local19);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (!super.aClass377_41.aBoolean746) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass377_41.method8587();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt9436 * Static51.anInt1085 >> 12;
		@Pc(52) int local52 = this.anInt9431 * Static51.anInt1085 >> 12;
		@Pc(59) int local59 = Static262.anInt5589 * this.anInt9433 >> 12;
		@Pc(66) int local66 = this.anInt9435 * Static262.anInt5589 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt9440 = Static51.anInt1085 / 8 * this.anInt9437 >> 12;
		@Pc(89) int local89 = Static51.anInt1085 / local45 + 1;
		@Pc(93) int[][] local93 = new int[local89][3];
		@Pc(97) int[][] local97 = new int[local89][3];
		@Pc(104) Random local104 = new Random((long) this.anInt9438);
		while (true) {
			while (true) {
				@Pc(113) int local113 = Static239.method3351(local52 - local45, local104) + local45;
				@Pc(123) int local123 = Static239.method3351(local66 - local59, local104) + local59;
				@Pc(127) int local127 = local113 + local28;
				if (local127 > Static51.anInt1085) {
					local127 = Static51.anInt1085;
					local113 = Static51.anInt1085 - local28;
				}
				@Pc(174) int local174;
				@Pc(146) int local146;
				if (local34) {
					local174 = 0;
				} else {
					@Pc(140) int local140 = local30;
					@Pc(144) int[] local144 = local97[local30];
					local146 = 0;
					@Pc(150) int local150 = local22 + local127;
					if (local150 < 0) {
						local150 += Static51.anInt1085;
					}
					if (Static51.anInt1085 < local150) {
						local150 -= Static51.anInt1085;
					}
					local174 = local144[2];
					while (true) {
						@Pc(178) int[] local178 = local97[local140];
						if (local150 >= local178[0] && local150 <= local178[1]) {
							if (local30 != local140) {
								@Pc(212) int local212 = local22 + local28;
								if (local212 < 0) {
									local212 += Static51.anInt1085;
								}
								if (Static51.anInt1085 < local212) {
									local212 -= Static51.anInt1085;
								}
								for (@Pc(230) int local230 = 1; local230 <= local146; local230++) {
									@Pc(240) int[] local240 = local97[(local230 + local30) % local36];
									local174 = Math.max(local174, local240[2]);
								}
								for (@Pc(256) int local256 = 0; local256 <= local146; local256++) {
									@Pc(266) int[] local266 = local97[(local256 + local30) % local36];
									@Pc(270) int local270 = local266[2];
									if (local270 != local174) {
										@Pc(281) int local281 = local266[0];
										@Pc(285) int local285 = local266[1];
										@Pc(300) int local300;
										@Pc(298) int local298;
										if (local150 > local212) {
											local300 = Math.max(local212, local281);
											local298 = Math.min(local150, local285);
										} else if (local281 == 0) {
											local298 = Math.min(local150, local285);
											local300 = 0;
										} else {
											local300 = Math.max(local212, local281);
											local298 = Static51.anInt1085;
										}
										this.method7914(local270, local20, local298 - local300, local174 + -local270, local26 + local300, local104);
									}
								}
							}
							local30 = local140;
							break;
						}
						local140++;
						if (local36 <= local140) {
							local140 = 0;
						}
						local146++;
					}
				}
				if (local123 + local174 > Static262.anInt5589) {
					local123 = Static262.anInt5589 - local174;
				} else {
					local32 = false;
				}
				@Pc(380) int[] local380;
				if (local127 == Static51.anInt1085) {
					this.method7914(local174, local20, local113, local123, local28 + local24, local104);
					if (local32) {
						return local11;
					}
					local32 = true;
					local380 = local93[local38++];
					local380[0] = local28;
					local380[1] = local127;
					local380[2] = local123 + local174;
					@Pc(446) int[][] local446 = local97;
					local97 = local93;
					local93 = local446;
					local36 = local38;
					local38 = 0;
					local26 = local24;
					local24 = Static239.method3351(Static51.anInt1085, local104);
					local22 = local24 - local26;
					local28 = 0;
					local146 = local22;
					if (local22 < 0) {
						local146 = local22 + Static51.anInt1085;
					}
					local30 = 0;
					if (local146 > Static51.anInt1085) {
						local146 -= Static51.anInt1085;
					}
					local34 = false;
					while (true) {
						@Pc(498) int[] local498 = local97[local30];
						if (local146 >= local498[0] && local498[1] >= local146) {
							break;
						}
						@Pc(511) int local511 = ~local36;
						local30++;
						if (local511 >= ~local30) {
							local30 = 0;
						}
					}
				} else {
					local380 = local93[local38++];
					local380[0] = local28;
					local380[2] = local123 + local174;
					local380[1] = local127;
					this.method7914(local174, local20, local113, local123, local24 + local28, local104);
					local28 = local127;
				}
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt9438 = arg1.method8547();
		} else if (arg0 == 1) {
			this.anInt9436 = arg1.method8546();
		} else if (arg0 == 2) {
			this.anInt9431 = arg1.method8546();
		} else if (arg0 == 3) {
			this.anInt9433 = arg1.method8546();
		} else if (arg0 == 4) {
			this.anInt9435 = arg1.method8546();
		} else if (arg0 == 5) {
			this.anInt9437 = arg1.method8546();
		} else if (arg0 == 6) {
			this.anInt9434 = arg1.method8547();
		} else if (arg0 == 7) {
			this.anInt9444 = arg1.method8546();
		} else if (arg0 == 8) {
			this.anInt9441 = arg1.method8546();
		}
	}
}
