import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class6_Sub1_Sub28 extends Class6_Sub1 {

	@OriginalMember(owner = "client!po", name = "V", descriptor = "I")
	private int anInt8019;

	@OriginalMember(owner = "client!po", name = "G", descriptor = "I")
	private int anInt8008 = 1024;

	@OriginalMember(owner = "client!po", name = "K", descriptor = "I")
	private int anInt8011 = 1024;

	@OriginalMember(owner = "client!po", name = "J", descriptor = "I")
	private int anInt8010 = 819;

	@OriginalMember(owner = "client!po", name = "O", descriptor = "I")
	private int anInt8014 = 0;

	@OriginalMember(owner = "client!po", name = "M", descriptor = "I")
	private int anInt8012 = 1024;

	@OriginalMember(owner = "client!po", name = "Q", descriptor = "I")
	private int anInt8016 = 409;

	@OriginalMember(owner = "client!po", name = "N", descriptor = "I")
	private int anInt8013 = 1024;

	@OriginalMember(owner = "client!po", name = "R", descriptor = "I")
	private int anInt8017 = 0;

	@OriginalMember(owner = "client!po", name = "P", descriptor = "I")
	private int anInt8015 = 2048;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt8014 = arg1.method8246();
		} else if (arg0 == 1) {
			this.anInt8012 = arg1.method8220();
		} else if (arg0 == 2) {
			this.anInt8015 = arg1.method8220();
		} else if (arg0 == 3) {
			this.anInt8016 = arg1.method8220();
		} else if (arg0 == 4) {
			this.anInt8010 = arg1.method8220();
		} else if (arg0 == 5) {
			this.anInt8011 = arg1.method8220();
		} else if (arg0 == 6) {
			this.anInt8017 = arg1.method8246();
		} else if (arg0 == 7) {
			this.anInt8008 = arg1.method8220();
		} else if (arg0 == 8) {
			this.anInt8013 = arg1.method8220();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BIILjava/util/Random;[[III)V")
	private void method6750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = this.anInt8013 <= 0 ? 4096 : 4096 - Static123.method2611(this.anInt8013, arg2);
		@Pc(26) int local26 = this.anInt8019 * this.anInt8008 >> 12;
		@Pc(42) int local42 = this.anInt8019 - (local26 <= 0 ? 0 : Static123.method2611(local26, arg2));
		if (Static53.anInt1787 <= arg1) {
			arg1 -= Static53.anInt1787;
		}
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local42 > 0) {
			if (arg5 > 0 && arg0 > 0) {
				local67 = arg0 / 2;
				local71 = arg5 / 2;
				@Pc(82) int local82 = local42 > local67 ? local67 : local42;
				@Pc(93) int local93 = local71 < local42 ? local71 : local42;
				@Pc(98) int local98 = arg1 + local82;
				@Pc(105) int local105 = arg0 - local82 * 2;
				for (@Pc(107) int local107 = 0; local107 < arg5; local107++) {
					@Pc(116) int[] local116 = arg3[local107 + arg4];
					@Pc(129) int local129;
					@Pc(134) int local134;
					@Pc(142) int local142;
					if (local107 < local93) {
						local129 = local18 * local107 / local93;
						if (this.anInt8017 == 0) {
							for (local134 = 0; local134 < local82; local134++) {
								local142 = local134 * local18 / local82;
								local116[arg1 + local134 & Static564.anInt9697] = local116[arg0 + arg1 - local134 - 1 & Static564.anInt9697] = local142 * local129 >> 12;
							}
						} else {
							for (local134 = 0; local134 < local82; local134++) {
								local142 = local18 * local134 / local82;
								local116[Static564.anInt9697 & local134 + arg1] = local116[Static564.anInt9697 & arg1 + arg0 - local134 - 1] = local142 < local129 ? local142 : local129;
							}
						}
						if (Static53.anInt1787 >= local98 + local105) {
							Static653.method6539(local116, local98, local105, local129);
						} else {
							local134 = Static53.anInt1787 - local98;
							Static653.method6539(local116, local98, local134, local129);
							Static653.method6539(local116, 0, local105 - local134, local129);
						}
					} else {
						local129 = arg5 - local107 - 1;
						if (local93 > local129) {
							local134 = local129 * local18 / local93;
							@Pc(292) int local292;
							if (this.anInt8017 == 0) {
								for (local142 = 0; local142 < local82; local142++) {
									local292 = local142 * local18 / local82;
									local116[Static564.anInt9697 & arg1 + local142] = local116[arg1 + arg0 - local142 - 1 & Static564.anInt9697] = local292 * local134 >> 12;
								}
							} else {
								for (local142 = 0; local142 < local82; local142++) {
									local292 = local142 * local18 / local82;
									local116[Static564.anInt9697 & local142 + arg1] = local116[Static564.anInt9697 & arg0 + arg1 - local142 - 1] = local292 >= local134 ? local134 : local292;
								}
							}
							if (Static53.anInt1787 < local98 + local105) {
								local142 = Static53.anInt1787 - local98;
								Static653.method6539(local116, local98, local142, local134);
								Static653.method6539(local116, 0, local105 - local142, local134);
							} else {
								Static653.method6539(local116, local98, local105, local134);
							}
						} else {
							for (local134 = 0; local134 < local82; local134++) {
								local116[local134 + arg1 & Static564.anInt9697] = local116[Static564.anInt9697 & arg0 + arg1 - local134 - 1] = local18 * local134 / local82;
							}
							if (Static53.anInt1787 >= local98 + local105) {
								Static653.method6539(local116, local98, local105, local18);
							} else {
								local142 = Static53.anInt1787 - local98;
								Static653.method6539(local116, local98, local142, local18);
								Static653.method6539(local116, 0, local105 - local142, local18);
							}
						}
					}
				}
			}
		} else if (arg0 + arg1 <= Static53.anInt1787) {
			for (local67 = 0; local67 < arg5; local67++) {
				Static653.method6539(arg3[local67 + arg4], arg1, arg0, local18);
			}
		} else {
			local67 = Static53.anInt1787 - arg1;
			for (local71 = 0; local71 < arg5; local71++) {
				@Pc(508) int[] local508 = arg3[local71 + arg4];
				Static653.method6539(local508, arg1, local67, local18);
				Static653.method6539(local508, 0, arg0 - local67, local18);
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (!super.aClass24_41.aBoolean80) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass24_41.method789();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt8012 * Static53.anInt1787 >> 12;
		@Pc(52) int local52 = this.anInt8015 * Static53.anInt1787 >> 12;
		@Pc(59) int local59 = Static123.anInt3099 * this.anInt8016 >> 12;
		@Pc(66) int local66 = Static123.anInt3099 * this.anInt8010 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt8019 = Static53.anInt1787 / 8 * this.anInt8011 >> 12;
		@Pc(89) int local89 = Static53.anInt1787 / local45 + 1;
		@Pc(93) int[][] local93 = new int[local89][3];
		@Pc(97) int[][] local97 = new int[local89][3];
		@Pc(104) Random local104 = new Random((long) this.anInt8014);
		while (true) {
			while (true) {
				@Pc(115) int local115 = Static123.method2611(local52 - local45, local104) + local45;
				@Pc(124) int local124 = Static123.method2611(local66 - local59, local104) + local59;
				@Pc(128) int local128 = local28 + local115;
				if (local128 > Static53.anInt1787) {
					local128 = Static53.anInt1787;
					local115 = Static53.anInt1787 - local28;
				}
				@Pc(142) int local142;
				@Pc(152) int local152;
				if (local34) {
					local142 = 0;
				} else {
					@Pc(146) int local146 = local30;
					@Pc(150) int[] local150 = local97[local30];
					local152 = 0;
					@Pc(156) int local156 = local22 + local128;
					if (local156 < 0) {
						local156 += Static53.anInt1787;
					}
					if (local156 > Static53.anInt1787) {
						local156 -= Static53.anInt1787;
					}
					local142 = local150[2];
					while (true) {
						@Pc(177) int[] local177 = local97[local146];
						if (local156 >= local177[0] && local177[1] >= local156) {
							if (local30 != local146) {
								@Pc(207) int local207 = local28 + local22;
								if (local207 < 0) {
									local207 += Static53.anInt1787;
								}
								if (local207 > Static53.anInt1787) {
									local207 -= Static53.anInt1787;
								}
								for (@Pc(222) int local222 = 1; local222 <= local152; local222++) {
									@Pc(232) int[] local232 = local97[(local222 + local30) % local36];
									local142 = Math.max(local142, local232[2]);
								}
								for (@Pc(248) int local248 = 0; local248 <= local152; local248++) {
									@Pc(258) int[] local258 = local97[(local248 + local30) % local36];
									@Pc(262) int local262 = local258[2];
									if (local262 != local142) {
										@Pc(273) int local273 = local258[0];
										@Pc(277) int local277 = local258[1];
										@Pc(290) int local290;
										@Pc(292) int local292;
										if (local207 < local156) {
											local290 = Math.max(local207, local273);
											local292 = Math.min(local156, local277);
										} else if (local273 == 0) {
											local292 = Math.min(local156, local277);
											local290 = 0;
										} else {
											local290 = Math.max(local207, local273);
											local292 = Static53.anInt1787;
										}
										this.method6750(local292 - local290, local26 + local290, local104, local20, local262, local142 - local262);
									}
								}
							}
							local30 = local146;
							break;
						}
						local152++;
						local146++;
						if (local36 <= local146) {
							local146 = 0;
						}
					}
				}
				if (Static123.anInt3099 < local142 + local124) {
					local124 = Static123.anInt3099 - local142;
				} else {
					local32 = false;
				}
				@Pc(359) int[] local359;
				if (local128 == Static53.anInt1787) {
					this.method6750(local115, local28 + local24, local104, local20, local142, local124);
					if (local32) {
						return local11;
					}
					local32 = true;
					local359 = local93[local38++];
					local359[1] = local128;
					local359[0] = local28;
					local359[2] = local142 + local124;
					@Pc(427) int[][] local427 = local97;
					local97 = local93;
					local36 = local38;
					local93 = local427;
					local26 = local24;
					local38 = 0;
					local24 = Static123.method2611(Static53.anInt1787, local104);
					local28 = 0;
					local22 = local24 - local26;
					local152 = local22;
					if (local22 < 0) {
						local152 = local22 + Static53.anInt1787;
					}
					local30 = 0;
					if (local152 > Static53.anInt1787) {
						local152 -= Static53.anInt1787;
					}
					local34 = false;
					while (true) {
						@Pc(472) int[] local472 = local97[local30];
						if (local472[0] <= local152 && local152 <= local472[1]) {
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local359 = local93[local38++];
					local359[1] = local128;
					local359[0] = local28;
					local359[2] = local142 + local124;
					this.method6750(local115, local28 + local24, local104, local20, local142, local124);
					local28 = local128;
				}
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
	}
}
