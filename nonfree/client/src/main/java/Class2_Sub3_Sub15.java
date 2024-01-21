import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class2_Sub3_Sub15 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
	private int anInt1851;

	@OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
	private int anInt1849;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
	private int anInt1848;

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
	private int anInt1857;

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
	private int anInt1856;

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
	private int anInt1859;

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
	private int anInt1854;

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "I")
	private int anInt1862;

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
	private int anInt1853;

	@OriginalMember(owner = "client!kd", name = "lb", descriptor = "I")
	private int anInt1865;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass51_41.method1730(arg0);
		if (!super.aClass51_41.aBoolean89) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass51_41.method1728();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) boolean local30 = true;
		@Pc(32) boolean local32 = true;
		@Pc(34) int local34 = 0;
		@Pc(41) int local41 = Static53.anInt1184 * this.anInt1856 >> 12;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(52) int local52 = this.anInt1853 * Static53.anInt1184 >> 12;
		@Pc(59) int local59 = this.anInt1865 * Static34.anInt889 >> 12;
		@Pc(66) int local66 = this.anInt1854 * Static34.anInt889 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt1851 = Static53.anInt1184 / 8 * this.anInt1848 >> 12;
		@Pc(92) int local92 = Static53.anInt1184 / local41 + 1;
		@Pc(96) int[][] local96 = new int[local92][3];
		@Pc(103) Random local103 = new Random((long) this.anInt1857);
		@Pc(107) int[][] local107 = new int[local92][3];
		while (true) {
			while (true) {
				@Pc(117) int local117 = local41 + Static108.method1830(local52 - local41, local103);
				@Pc(122) int local122 = local28 + local117;
				@Pc(133) int local133 = local59 + Static108.method1830(local66 - local59, local103);
				if (local122 > Static53.anInt1184) {
					local122 = Static53.anInt1184;
					local117 = Static53.anInt1184 - local28;
				}
				@Pc(157) int local157;
				@Pc(161) int local161;
				if (local32) {
					local157 = 0;
				} else {
					@Pc(153) int[] local153 = local107[local43];
					local157 = local153[2];
					@Pc(159) int local159 = local43;
					local161 = 0;
					@Pc(166) int local166 = local122 + local22;
					if (local166 < 0) {
						local166 += Static53.anInt1184;
					}
					if (Static53.anInt1184 < local166) {
						local166 -= Static53.anInt1184;
					}
					while (true) {
						@Pc(187) int[] local187 = local107[local159];
						if (local187[0] <= local166 && local187[1] >= local166) {
							if (local159 != local43) {
								@Pc(217) int local217 = local28 + local22;
								if (local217 < 0) {
									local217 += Static53.anInt1184;
								}
								if (local217 > Static53.anInt1184) {
									local217 -= Static53.anInt1184;
								}
								for (@Pc(236) int local236 = 1; local236 <= local161; local236++) {
									@Pc(246) int[] local246 = local107[(local43 + local236) % local34];
									local157 = Math.max(local157, local246[2]);
								}
								for (@Pc(262) int local262 = 0; local262 <= local161; local262++) {
									@Pc(272) int[] local272 = local107[(local43 + local262) % local34];
									@Pc(276) int local276 = local272[2];
									if (local276 != local157) {
										@Pc(283) int local283 = local272[0];
										@Pc(287) int local287 = local272[1];
										@Pc(302) int local302;
										@Pc(300) int local300;
										if (local217 < local166) {
											local302 = Math.max(local217, local283);
											local300 = Math.min(local166, local287);
										} else if (local283 == 0) {
											local300 = Math.min(local166, local287);
											local302 = 0;
										} else {
											local302 = Math.max(local217, local283);
											local300 = Static53.anInt1184;
										}
										this.method1478(local300 - local302, local157 + -local276, local20, local26 + local302, local103, local276);
									}
								}
							}
							local43 = local159;
							break;
						}
						local159++;
						if (local159 >= local34) {
							local159 = 0;
						}
						local161++;
					}
				}
				if (local157 + local133 <= Static34.anInt889) {
					local30 = false;
				} else {
					local133 = Static34.anInt889 - local157;
				}
				@Pc(388) int[] local388;
				if (local122 == Static53.anInt1184) {
					this.method1478(local117, local133, local20, local24 + local28, local103, local157);
					if (local30) {
						return local11;
					}
					local30 = true;
					local43 = 0;
					local26 = local24;
					local388 = local96[local45++];
					local32 = false;
					local388[1] = local122;
					local388[2] = local133 + local157;
					local388[0] = local28;
					local24 = Static108.method1830(Static53.anInt1184, local103);
					local28 = 0;
					local22 = local24 - local26;
					@Pc(418) int[][] local418 = local107;
					local34 = local45;
					local107 = local96;
					local161 = local22;
					local96 = local418;
					local45 = 0;
					if (local22 < 0) {
						local161 = local22 + Static53.anInt1184;
					}
					if (local161 > Static53.anInt1184) {
						local161 -= Static53.anInt1184;
					}
					while (true) {
						@Pc(448) int[] local448 = local107[local43];
						if (local448[0] <= local161 && local161 <= local448[1]) {
							break;
						}
						local43++;
						if (local43 >= local34) {
							local43 = 0;
						}
					}
				} else {
					local388 = local96[local45++];
					local388[0] = local28;
					local388[1] = local122;
					local388[2] = local157 + local133;
					this.method1478(local117, local133, local20, local28 + local24, local103, local157);
					local28 = local122;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB[[IILjava/util/Random;I)V")
	private void method1478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = this.anInt1862 <= 0 ? 4096 : 4096 - Static108.method1830(this.anInt1862, arg4);
		@Pc(22) int local22 = this.anInt1849 * this.anInt1851 >> 12;
		@Pc(47) int local47 = this.anInt1851 - (local22 > 0 ? Static108.method1830(local22, arg4) : 0);
		if (Static53.anInt1184 <= arg3) {
			arg3 -= Static53.anInt1184;
		}
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (local47 <= 0) {
			if (Static53.anInt1184 < arg0 + arg3) {
				local73 = Static53.anInt1184 - arg3;
				for (local75 = 0; local75 < arg1; local75++) {
					@Pc(84) int[] local84 = arg2[arg5 + local75];
					Static191.method1825(local84, arg3, local73, local14);
					Static191.method1825(local84, 0, arg0 - local73, local14);
				}
			} else {
				for (local73 = 0; local73 < arg1; local73++) {
					Static191.method1825(arg2[local73 + arg5], arg3, arg0, local14);
				}
			}
		} else if (arg1 > 0 && arg0 > 0) {
			local73 = arg0 / 2;
			local75 = arg1 / 2;
			@Pc(150) int local150 = local73 < local47 ? local73 : local47;
			@Pc(157) int local157 = local47 <= local75 ? local47 : local75;
			@Pc(161) int local161 = local150 + arg3;
			@Pc(168) int local168 = arg0 - local150 * 2;
			for (@Pc(170) int local170 = 0; local170 < arg1; local170++) {
				@Pc(179) int[] local179 = arg2[local170 + arg5];
				@Pc(192) int local192;
				@Pc(197) int local197;
				@Pc(205) int local205;
				if (local157 > local170) {
					local192 = local14 * local170 / local157;
					if (this.anInt1859 == 0) {
						for (local197 = 0; local197 < local150; local197++) {
							local205 = local197 * local14 / local150;
							local179[Static27.anInt588 & arg3 + local197] = local179[Static27.anInt588 & arg0 + arg3 - local197 - 1] = local205 * local192 >> 12;
						}
					} else {
						for (local197 = 0; local197 < local150; local197++) {
							local205 = local197 * local14 / local150;
							local179[local197 + arg3 & Static27.anInt588] = local179[arg0 + arg3 - local197 - 1 & Static27.anInt588] = local205 < local192 ? local205 : local192;
						}
					}
					if (Static53.anInt1184 >= local161 + local168) {
						Static191.method1825(local179, local161, local168, local192);
					} else {
						local197 = Static53.anInt1184 - local161;
						Static191.method1825(local179, local161, local197, local192);
						Static191.method1825(local179, 0, local168 - local197, local192);
					}
				} else {
					local192 = arg1 - local170 - 1;
					if (local157 > local192) {
						local197 = local192 * local14 / local157;
						@Pc(349) int local349;
						if (this.anInt1859 == 0) {
							for (local205 = 0; local205 < local150; local205++) {
								local349 = local205 * local14 / local150;
								local179[arg3 + local205 & Static27.anInt588] = local179[arg3 + arg0 - local205 - 1 & Static27.anInt588] = local197 * local349 >> 12;
							}
						} else {
							for (local205 = 0; local205 < local150; local205++) {
								local349 = local205 * local14 / local150;
								local179[arg3 + local205 & Static27.anInt588] = local179[Static27.anInt588 & arg0 + arg3 - local205 - 1] = local197 > local349 ? local349 : local197;
							}
						}
						if (local168 + local161 > Static53.anInt1184) {
							local205 = Static53.anInt1184 - local161;
							Static191.method1825(local179, local161, local205, local197);
							Static191.method1825(local179, 0, local168 - local205, local197);
						} else {
							Static191.method1825(local179, local161, local168, local197);
						}
					} else {
						for (local197 = 0; local197 < local150; local197++) {
							local179[Static27.anInt588 & arg3 + local197] = local179[arg0 + arg3 - local197 - 1 & Static27.anInt588] = local197 * local14 / local150;
						}
						if (local161 + local168 <= Static53.anInt1184) {
							Static191.method1825(local179, local161, local168, local14);
						} else {
							local205 = Static53.anInt1184 - local161;
							Static191.method1825(local179, local161, local205, local14);
							Static191.method1825(local179, 0, local168 - local205, local14);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt1857 = arg1.method2962();
		} else if (arg0 == 1) {
			this.anInt1856 = arg1.method2933();
		} else if (arg0 == 2) {
			this.anInt1853 = arg1.method2933();
		} else if (arg0 == 3) {
			this.anInt1865 = arg1.method2933();
		} else if (arg0 == 4) {
			this.anInt1854 = arg1.method2933();
		} else if (arg0 == 5) {
			this.anInt1848 = arg1.method2933();
		} else if (arg0 == 6) {
			this.anInt1859 = arg1.method2962();
		} else if (arg0 == 7) {
			this.anInt1849 = arg1.method2933();
		} else if (arg0 == 8) {
			this.anInt1862 = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
	}
}
