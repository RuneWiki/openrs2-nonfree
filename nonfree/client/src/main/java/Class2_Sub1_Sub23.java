import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class2_Sub1_Sub23 extends Class2_Sub1 {

	@OriginalMember(owner = "client!km", name = "W", descriptor = "I")
	private int anInt3458;

	@OriginalMember(owner = "client!km", name = "K", descriptor = "I")
	private int anInt3447 = 1024;

	@OriginalMember(owner = "client!km", name = "J", descriptor = "I")
	private int anInt3446 = 1024;

	@OriginalMember(owner = "client!km", name = "M", descriptor = "I")
	private int anInt3449 = 2048;

	@OriginalMember(owner = "client!km", name = "Q", descriptor = "I")
	private int anInt3453 = 409;

	@OriginalMember(owner = "client!km", name = "V", descriptor = "I")
	private int anInt3457 = 1024;

	@OriginalMember(owner = "client!km", name = "O", descriptor = "I")
	private int anInt3451 = 0;

	@OriginalMember(owner = "client!km", name = "I", descriptor = "I")
	private int anInt3445 = 0;

	@OriginalMember(owner = "client!km", name = "X", descriptor = "I")
	private int anInt3459 = 819;

	@OriginalMember(owner = "client!km", name = "Y", descriptor = "I")
	private int anInt3460 = 1024;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3445 = arg0.method2146();
		} else if (arg1 == 1) {
			this.anInt3460 = arg0.method2130();
		} else if (arg1 == 2) {
			this.anInt3449 = arg0.method2130();
		} else if (arg1 == 3) {
			this.anInt3453 = arg0.method2130();
		} else if (arg1 == 4) {
			this.anInt3459 = arg0.method2130();
		} else if (arg1 == 5) {
			this.anInt3457 = arg0.method2130();
		} else if (arg1 == 6) {
			this.anInt3451 = arg0.method2146();
		} else if (arg1 == 7) {
			this.anInt3447 = arg0.method2130();
		} else if (arg1 == 8) {
			this.anInt3446 = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([[ILjava/util/Random;IIBII)V")
	private void method2842(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt3446 <= 0 ? 4096 : 4096 - Static222.method3672(arg1, this.anInt3446);
		@Pc(38) int local38 = this.anInt3447 * this.anInt3458 >> 12;
		@Pc(54) int local54 = this.anInt3458 - (local38 <= 0 ? 0 : Static222.method3672(arg1, local38));
		if (Static281.anInt5558 <= arg3) {
			arg3 -= Static281.anInt5558;
		}
		@Pc(77) int local77;
		@Pc(105) int local105;
		if (local54 > 0) {
			if (arg4 <= 0 || arg2 <= 0) {
				return;
			}
			local105 = arg4 / 2;
			local77 = arg2 / 2;
			@Pc(160) int local160 = local54 > local77 ? local77 : local54;
			@Pc(167) int local167 = local105 >= local54 ? local54 : local105;
			@Pc(174) int local174 = arg2 - local160 * 2;
			@Pc(178) int local178 = arg3 + local160;
			for (@Pc(180) int local180 = 0; local180 < arg4; local180++) {
				@Pc(189) int[] local189 = arg0[local180 + arg5];
				@Pc(202) int local202;
				@Pc(210) int local210;
				@Pc(223) int local223;
				if (local180 < local167) {
					local202 = local180 * local22 / local167;
					if (this.anInt3451 == 0) {
						for (local210 = 0; local210 < local160; local210++) {
							local223 = local22 * local210 / local160;
							local189[Static226.anInt6054 & arg3 + local210] = local189[arg2 + arg3 - local210 - 1 & Static226.anInt6054] = local223 * local202 >> 12;
						}
					} else {
						for (local210 = 0; local210 < local160; local210++) {
							local223 = local22 * local210 / local160;
							local189[Static226.anInt6054 & local210 + arg3] = local189[arg2 + arg3 - local210 - 1 & Static226.anInt6054] = local223 >= local202 ? local202 : local223;
						}
					}
					if (Static281.anInt5558 >= local178 + local174) {
						Static323.method3553(local189, local178, local174, local202);
					} else {
						local210 = Static281.anInt5558 - local178;
						Static323.method3553(local189, local178, local210, local202);
						Static323.method3553(local189, 0, local174 - local210, local202);
					}
				} else {
					local202 = arg4 - local180 - 1;
					if (local167 <= local202) {
						for (local210 = 0; local210 < local160; local210++) {
							local189[local210 + arg3 & Static226.anInt6054] = local189[Static226.anInt6054 & arg3 + arg2 - local210 - 1] = local210 * local22 / local160;
						}
						if (Static281.anInt5558 >= local174 + local178) {
							Static323.method3553(local189, local178, local174, local22);
						} else {
							local210 = Static281.anInt5558 - local178;
							Static323.method3553(local189, local178, local210, local22);
							Static323.method3553(local189, 0, local174 - local210, local22);
						}
					} else {
						local210 = local202 * local22 / local167;
						@Pc(370) int local370;
						if (this.anInt3451 == 0) {
							for (local223 = 0; local223 < local160; local223++) {
								local370 = local22 * local223 / local160;
								local189[Static226.anInt6054 & arg3 + local223] = local189[arg2 + arg3 - local223 - 1 & Static226.anInt6054] = local210 * local370 >> 12;
							}
						} else {
							for (local223 = 0; local223 < local160; local223++) {
								local370 = local22 * local223 / local160;
								local189[Static226.anInt6054 & local223 + arg3] = local189[arg2 + arg3 - local223 - 1 & Static226.anInt6054] = local370 >= local210 ? local210 : local370;
							}
						}
						if (Static281.anInt5558 < local174 + local178) {
							local223 = Static281.anInt5558 - local178;
							Static323.method3553(local189, local178, local223, local210);
							Static323.method3553(local189, 0, local174 - local223, local210);
						} else {
							Static323.method3553(local189, local178, local174, local210);
						}
					}
				}
			}
		} else if (arg3 + arg2 <= Static281.anInt5558) {
			for (local77 = 0; local77 < arg4; local77++) {
				Static323.method3553(arg0[local77 + arg5], arg3, arg2, local22);
			}
		} else {
			local77 = Static281.anInt5558 - arg3;
			for (local105 = 0; local105 < arg4; local105++) {
				@Pc(114) int[] local114 = arg0[arg5 + local105];
				Static323.method3553(local114, arg3, local77, local22);
				Static323.method3553(local114, 0, arg2 - local77, local22);
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = this.aClass174_41.method4334(arg0);
		if (!this.aClass174_41.aBoolean364) {
			return local12;
		}
		@Pc(25) int[][] local25 = this.aClass174_41.method4335();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) boolean local35 = true;
		@Pc(37) int local37 = 0;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = Static281.anInt5558 * this.anInt3460 >> 12;
		@Pc(57) int local57 = this.anInt3453 * Static64.anInt1560 >> 12;
		@Pc(64) int local64 = Static281.anInt5558 * this.anInt3449 >> 12;
		@Pc(71) int local71 = Static64.anInt1560 * this.anInt3459 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt3458 = this.anInt3457 * (Static281.anInt5558 / 8) >> 12;
		@Pc(97) int local97 = Static281.anInt5558 / local50 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt3445);
		while (true) {
			while (true) {
				@Pc(122) int local122 = Static222.method3672(local112, local64 - local50) + local50;
				@Pc(132) int local132 = Static222.method3672(local112, local71 - local57) + local57;
				@Pc(136) int local136 = local122 + local33;
				if (local136 > Static281.anInt5558) {
					local122 = Static281.anInt5558 - local33;
					local136 = Static281.anInt5558;
				}
				@Pc(150) int local150;
				@Pc(166) int local166;
				if (local39) {
					local150 = 0;
				} else {
					@Pc(156) int[] local156 = local105[local37];
					local150 = local156[2];
					@Pc(164) int local164 = local27 + local136;
					local166 = 0;
					@Pc(168) int local168 = local37;
					if (local164 < 0) {
						local164 += Static281.anInt5558;
					}
					if (Static281.anInt5558 < local164) {
						local164 -= Static281.anInt5558;
					}
					while (true) {
						@Pc(190) int[] local190 = local105[local168];
						if (local190[0] <= local164 && local164 <= local190[1]) {
							if (local37 != local168) {
								@Pc(218) int local218 = local33 + local27;
								if (local218 < 0) {
									local218 += Static281.anInt5558;
								}
								if (Static281.anInt5558 < local218) {
									local218 -= Static281.anInt5558;
								}
								@Pc(240) int local240;
								@Pc(255) int[] local255;
								for (local240 = 1; local240 <= local166; local240++) {
									local255 = local105[(local240 + local37) % local41];
									local150 = Math.max(local150, local255[2]);
								}
								for (local240 = 0; local240 <= local166; local240++) {
									local255 = local105[(local37 + local240) % local41];
									@Pc(286) int local286 = local255[2];
									if (local150 != local286) {
										@Pc(297) int local297 = local255[0];
										@Pc(301) int local301 = local255[1];
										@Pc(308) int local308;
										@Pc(312) int local312;
										if (local218 < local164) {
											local308 = Math.max(local218, local297);
											local312 = Math.min(local164, local301);
										} else if (local297 == 0) {
											local308 = 0;
											local312 = Math.min(local164, local301);
										} else {
											local308 = Math.max(local218, local297);
											local312 = Static281.anInt5558;
										}
										this.method2842(local25, local112, local312 - local308, local31 + local308, local150 - local286, local286);
									}
								}
							}
							local37 = local168;
							break;
						}
						local168++;
						if (local41 <= local168) {
							local168 = 0;
						}
						local166++;
					}
				}
				if (local150 + local132 > Static64.anInt1560) {
					local132 = Static64.anInt1560 - local150;
				} else {
					local35 = false;
				}
				@Pc(402) int[] local402;
				if (local136 == Static281.anInt5558) {
					this.method2842(local25, local112, local122, local33 + local29, local132, local150);
					if (local35) {
						return local12;
					}
					local31 = local29;
					local37 = 0;
					local39 = false;
					local35 = true;
					local402 = local101[local43++];
					local402[1] = local136;
					local41 = local43;
					local402[2] = local150 + local132;
					local43 = 0;
					local402[0] = local33;
					local33 = 0;
					local29 = Static222.method3672(local112, Static281.anInt5558);
					@Pc(429) int[][] local429 = local105;
					local27 = local29 - local31;
					local166 = local27;
					local105 = local101;
					local101 = local429;
					if (local27 < 0) {
						local166 = local27 + Static281.anInt5558;
					}
					if (Static281.anInt5558 < local166) {
						local166 -= Static281.anInt5558;
					}
					while (true) {
						@Pc(461) int[] local461 = local105[local37];
						if (local461[0] <= local166 && local461[1] >= local166) {
							break;
						}
						local37++;
						if (local41 <= local37) {
							local37 = 0;
						}
					}
				} else {
					local402 = local101[local43++];
					local402[2] = local132 + local150;
					local402[1] = local136;
					local402[0] = local33;
					this.method2842(local25, local112, local122, local29 + local33, local132, local150);
					local33 = local136;
				}
			}
		}
	}
}
