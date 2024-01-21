import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
	private int anInt1710;

	@OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
	private int anInt1700;

	@OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
	private int anInt1702;

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
	private int anInt1705;

	@OriginalMember(owner = "client!fg", name = "gb", descriptor = "I")
	private int anInt1713;

	@OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
	private int anInt1711;

	@OriginalMember(owner = "client!fg", name = "jb", descriptor = "I")
	private int anInt1716;

	@OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
	private int anInt1709;

	@OriginalMember(owner = "client!fg", name = "kb", descriptor = "I")
	private int anInt1717;

	@OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
	private int anInt1707;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2742(arg0);
		if (!super.aClass80_41.aBoolean288) {
			return local7;
		}
		@Pc(17) int local17 = 0;
		@Pc(22) int[][] local22 = super.aClass80_41.method2740();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) boolean local28 = true;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static65.anInt1933 * this.anInt1700 >> 12;
		@Pc(52) int local52 = this.anInt1716 * Static65.anInt1933 >> 12;
		@Pc(59) int local59 = Static30.anInt1097 * this.anInt1711 >> 12;
		@Pc(66) int local66 = this.anInt1707 * Static30.anInt1097 >> 12;
		if (local66 <= 1) {
			return local22[arg0];
		}
		this.anInt1710 = this.anInt1713 * (Static65.anInt1933 / 8) >> 12;
		@Pc(89) int local89 = Static65.anInt1933 / local45 + 1;
		@Pc(93) int[][] local93 = new int[local89][3];
		@Pc(97) int[][] local97 = new int[local89][3];
		@Pc(104) Random local104 = new Random((long) this.anInt1717);
		while (true) {
			while (true) {
				@Pc(114) int local114 = Static164.method2805(local52 - local45, local104) + local45;
				@Pc(124) int local124 = local59 + Static164.method2805(local66 - local59, local104);
				@Pc(128) int local128 = local114 + local24;
				if (Static65.anInt1933 < local128) {
					local128 = Static65.anInt1933;
					local114 = Static65.anInt1933 - local24;
				}
				@Pc(154) int local154;
				@Pc(150) int local150;
				if (local34) {
					local154 = 0;
				} else {
					@Pc(148) int[] local148 = local93[local32];
					local150 = 0;
					local154 = local148[2];
					@Pc(156) int local156 = local32;
					@Pc(161) int local161 = local128 + local17;
					if (local161 < 0) {
						local161 += Static65.anInt1933;
					}
					if (Static65.anInt1933 < local161) {
						local161 -= Static65.anInt1933;
					}
					while (true) {
						@Pc(185) int[] local185 = local93[local156];
						if (local185[0] <= local161 && local161 <= local185[1]) {
							if (local156 != local32) {
								@Pc(220) int local220 = local24 + local17;
								if (local220 < 0) {
									local220 += Static65.anInt1933;
								}
								if (local220 > Static65.anInt1933) {
									local220 -= Static65.anInt1933;
								}
								for (@Pc(239) int local239 = 1; local239 <= local150; local239++) {
									@Pc(249) int[] local249 = local93[(local32 + local239) % local38];
									local154 = Math.max(local154, local249[2]);
								}
								for (@Pc(261) int local261 = 0; local261 <= local150; local261++) {
									@Pc(272) int[] local272 = local93[(local32 + local261) % local38];
									@Pc(276) int local276 = local272[2];
									if (local154 != local276) {
										@Pc(283) int local283 = local272[0];
										@Pc(287) int local287 = local272[1];
										@Pc(297) int local297;
										@Pc(301) int local301;
										if (local220 < local161) {
											local297 = Math.max(local220, local283);
											local301 = Math.min(local161, local287);
										} else if (local283 == 0) {
											local297 = 0;
											local301 = Math.min(local161, local287);
										} else {
											local297 = Math.max(local220, local283);
											local301 = Static65.anInt1933;
										}
										this.method1288(local301 - local297, local22, local104, local154 - local276, local297 + local30, local276);
									}
								}
							}
							local32 = local156;
							break;
						}
						local156++;
						if (local156 >= local38) {
							local156 = 0;
						}
						local150++;
					}
				}
				if (local124 + local154 <= Static30.anInt1097) {
					local28 = false;
				} else {
					local124 = Static30.anInt1097 - local154;
				}
				@Pc(379) int[] local379;
				if (local128 == Static65.anInt1933) {
					this.method1288(local114, local22, local104, local124, local26 + local24, local154);
					if (local28) {
						return local7;
					}
					local34 = false;
					local30 = local26;
					local28 = true;
					local379 = local97[local36++];
					local379[0] = local24;
					local379[2] = local124 + local154;
					local38 = local36;
					local32 = 0;
					local24 = 0;
					local36 = 0;
					local379[1] = local128;
					@Pc(458) int[][] local458 = local93;
					local93 = local97;
					local97 = local458;
					local26 = Static164.method2805(Static65.anInt1933, local104);
					local17 = local26 - local30;
					local150 = local17;
					if (local17 < 0) {
						local150 = local17 + Static65.anInt1933;
					}
					if (Static65.anInt1933 < local150) {
						local150 -= Static65.anInt1933;
					}
					while (true) {
						@Pc(496) int[] local496 = local93[local32];
						if (local496[0] <= local150 && local496[1] >= local150) {
							break;
						}
						local32++;
						if (local32 >= local38) {
							local32 = 0;
						}
					}
				} else {
					local379 = local97[local36++];
					local379[1] = local128;
					local379[2] = local154 + local124;
					local379[0] = local24;
					this.method1288(local114, local22, local104, local124, local26 + local24, local154);
					local24 = local128;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[[ILjava/util/Random;IIII)V")
	private void method1288(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt1709 > 0 ? 4096 - Static164.method2805(this.anInt1709, arg2) : 4096;
		@Pc(27) int local27 = this.anInt1705 * this.anInt1710 >> 12;
		@Pc(41) int local41 = this.anInt1710 - (local27 > 0 ? Static164.method2805(local27, arg2) : 0);
		if (arg4 >= Static65.anInt1933) {
			arg4 -= Static65.anInt1933;
		}
		@Pc(65) int local65;
		@Pc(91) int local91;
		if (local41 <= 0) {
			if (Static65.anInt1933 >= arg4 + arg0) {
				for (local65 = 0; local65 < arg3; local65++) {
					Static193.method2479(arg1[arg5 + local65], arg4, arg0, local19);
				}
			} else {
				local65 = Static65.anInt1933 - arg4;
				for (local91 = 0; local91 < arg3; local91++) {
					@Pc(99) int[] local99 = arg1[local91 + arg5];
					Static193.method2479(local99, arg4, local65, local19);
					Static193.method2479(local99, 0, arg0 - local65, local19);
				}
			}
		} else if (arg3 > 0 && arg0 > 0) {
			local65 = arg0 / 2;
			local91 = arg3 / 2;
			@Pc(147) int local147 = local65 < local41 ? local65 : local41;
			@Pc(154) int local154 = local41 <= local91 ? local41 : local91;
			@Pc(158) int local158 = local147 + arg4;
			@Pc(165) int local165 = arg0 - local147 * 2;
			for (@Pc(167) int local167 = 0; local167 < arg3; local167++) {
				@Pc(176) int[] local176 = arg1[local167 + arg5];
				@Pc(185) int local185;
				@Pc(193) int local193;
				@Pc(201) int local201;
				if (local154 > local167) {
					local185 = local167 * local19 / local154;
					if (this.anInt1702 == 0) {
						for (local193 = 0; local193 < local147; local193++) {
							local201 = local19 * local193 / local147;
							local176[local193 + arg4 & Static64.anInt1922] = local176[Static64.anInt1922 & arg0 + arg4 - local193 - 1] = local201 * local185 >> 12;
						}
					} else {
						for (local193 = 0; local193 < local147; local193++) {
							local201 = local193 * local19 / local147;
							local176[Static64.anInt1922 & local193 + arg4] = local176[arg4 + arg0 - local193 - 1 & Static64.anInt1922] = local185 <= local201 ? local185 : local201;
						}
					}
					if (Static65.anInt1933 < local158 + local165) {
						local193 = Static65.anInt1933 - local158;
						Static193.method2479(local176, local158, local193, local185);
						Static193.method2479(local176, 0, local165 - local193, local185);
					} else {
						Static193.method2479(local176, local158, local165, local185);
					}
				} else {
					local185 = arg3 - local167 - 1;
					if (local154 > local185) {
						local193 = local185 * local19 / local154;
						@Pc(345) int local345;
						if (this.anInt1702 == 0) {
							for (local201 = 0; local201 < local147; local201++) {
								local345 = local19 * local201 / local147;
								local176[local201 + arg4 & Static64.anInt1922] = local176[arg0 + arg4 - local201 - 1 & Static64.anInt1922] = local345 * local193 >> 12;
							}
						} else {
							for (local201 = 0; local201 < local147; local201++) {
								local345 = local19 * local201 / local147;
								local176[arg4 + local201 & Static64.anInt1922] = local176[Static64.anInt1922 & arg0 + arg4 - local201 - 1] = local193 <= local345 ? local193 : local345;
							}
						}
						if (local165 + local158 > Static65.anInt1933) {
							local201 = Static65.anInt1933 - local158;
							Static193.method2479(local176, local158, local201, local193);
							Static193.method2479(local176, 0, local165 - local201, local193);
						} else {
							Static193.method2479(local176, local158, local165, local193);
						}
					} else {
						for (local193 = 0; local193 < local147; local193++) {
							local176[Static64.anInt1922 & arg4 + local193] = local176[Static64.anInt1922 & arg4 + arg0 - local193 - 1] = local19 * local193 / local147;
						}
						if (Static65.anInt1933 < local158 + local165) {
							local201 = Static65.anInt1933 - local158;
							Static193.method2479(local176, local158, local201, local19);
							Static193.method2479(local176, 0, local165 - local201, local19);
						} else {
							Static193.method2479(local176, local158, local165, local19);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1717 = arg1.method1607();
		} else if (arg0 == 1) {
			this.anInt1700 = arg1.method1642();
		} else if (arg0 == 2) {
			this.anInt1716 = arg1.method1642();
		} else if (arg0 == 3) {
			this.anInt1711 = arg1.method1642();
		} else if (arg0 == 4) {
			this.anInt1707 = arg1.method1642();
		} else if (arg0 == 5) {
			this.anInt1713 = arg1.method1642();
		} else if (arg0 == 6) {
			this.anInt1702 = arg1.method1607();
		} else if (arg0 == 7) {
			this.anInt1705 = arg1.method1642();
		} else if (arg0 == 8) {
			this.anInt1709 = arg1.method1642();
		}
	}
}
