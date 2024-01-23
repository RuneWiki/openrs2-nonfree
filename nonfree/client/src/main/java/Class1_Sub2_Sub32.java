import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class1_Sub2_Sub32 extends Class1_Sub2 {

	@OriginalMember(owner = "client!so", name = "K", descriptor = "I")
	private int anInt5069;

	@OriginalMember(owner = "client!so", name = "N", descriptor = "I")
	private int anInt5072 = 0;

	@OriginalMember(owner = "client!so", name = "W", descriptor = "I")
	private int anInt5079 = 1024;

	@OriginalMember(owner = "client!so", name = "Q", descriptor = "I")
	private int anInt5074 = 1024;

	@OriginalMember(owner = "client!so", name = "cb", descriptor = "I")
	private int anInt5084 = 2048;

	@OriginalMember(owner = "client!so", name = "Y", descriptor = "I")
	private int anInt5081 = 819;

	@OriginalMember(owner = "client!so", name = "bb", descriptor = "I")
	private int anInt5083 = 1024;

	@OriginalMember(owner = "client!so", name = "ab", descriptor = "I")
	private int anInt5082 = 409;

	@OriginalMember(owner = "client!so", name = "X", descriptor = "I")
	private int anInt5080 = 0;

	@OriginalMember(owner = "client!so", name = "db", descriptor = "I")
	private int anInt5085 = 1024;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass65_41.method1368(arg0);
		if (!this.aClass65_41.aBoolean137) {
			return local7;
		}
		@Pc(20) int[][] local20 = this.aClass65_41.method1365();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) boolean local30 = true;
		@Pc(32) int local32 = 0;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static299.anInt5670 * this.anInt5083 >> 12;
		@Pc(52) int local52 = Static299.anInt5670 * this.anInt5084 >> 12;
		@Pc(59) int local59 = Static202.anInt4038 * this.anInt5082 >> 12;
		@Pc(66) int local66 = Static202.anInt4038 * this.anInt5081 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt5069 = Static299.anInt5670 / 8 * this.anInt5079 >> 12;
		@Pc(92) int local92 = Static299.anInt5670 / local45 + 1;
		@Pc(96) int[][] local96 = new int[local92][3];
		@Pc(100) int[][] local100 = new int[local92][3];
		@Pc(107) Random local107 = new Random((long) this.anInt5072);
		while (true) {
			while (true) {
				@Pc(117) int local117 = local45 + Static165.method2794(local107, local52 - local45);
				@Pc(121) int local121 = local117 + local28;
				@Pc(131) int local131 = Static165.method2794(local107, local66 - local59) + local59;
				if (Static299.anInt5670 < local121) {
					local121 = Static299.anInt5670;
					local117 = Static299.anInt5670 - local28;
				}
				@Pc(145) int local145;
				@Pc(155) int local155;
				if (local34) {
					local145 = 0;
				} else {
					@Pc(149) int local149 = local32;
					@Pc(153) int[] local153 = local100[local32];
					local155 = 0;
					local145 = local153[2];
					@Pc(163) int local163 = local121 + local24;
					if (local163 < 0) {
						local163 += Static299.anInt5670;
					}
					if (Static299.anInt5670 < local163) {
						local163 -= Static299.anInt5670;
					}
					while (true) {
						@Pc(186) int[] local186 = local100[local149];
						if (local163 >= local186[0] && local186[1] >= local163) {
							if (local32 != local149) {
								@Pc(222) int local222 = local24 + local28;
								if (local222 < 0) {
									local222 += Static299.anInt5670;
								}
								if (local222 > Static299.anInt5670) {
									local222 -= Static299.anInt5670;
								}
								@Pc(243) int local243;
								@Pc(255) int[] local255;
								for (local243 = 1; local243 <= local155; local243++) {
									local255 = local100[(local32 + local243) % local36];
									local145 = Math.max(local145, local255[2]);
								}
								for (local243 = 0; local243 <= local155; local243++) {
									local255 = local100[(local243 + local32) % local36];
									@Pc(281) int local281 = local255[2];
									if (local145 != local281) {
										@Pc(288) int local288 = local255[1];
										@Pc(292) int local292 = local255[0];
										@Pc(306) int local306;
										@Pc(304) int local304;
										if (local222 < local163) {
											local306 = Math.max(local222, local292);
											local304 = Math.min(local163, local288);
										} else if (local292 == 0) {
											local304 = Math.min(local163, local288);
											local306 = 0;
										} else {
											local306 = Math.max(local222, local292);
											local304 = Static299.anInt5670;
										}
										this.method3941(local281, local304 - local306, local145 + -local281, local20, local107, local306 + local26);
									}
								}
							}
							local32 = local149;
							break;
						}
						local155++;
						local149++;
						if (local36 <= local149) {
							local149 = 0;
						}
					}
				}
				if (Static202.anInt4038 >= local131 + local145) {
					local30 = false;
				} else {
					local131 = Static202.anInt4038 - local145;
				}
				@Pc(394) int[] local394;
				if (Static299.anInt5670 == local121) {
					this.method3941(local145, local117, local131, local20, local107, local22 + local28);
					if (local30) {
						return local7;
					}
					local26 = local22;
					local34 = false;
					local32 = 0;
					@Pc(389) int[][] local389 = local100;
					local394 = local96[local38++];
					local36 = local38;
					local394[0] = local28;
					local30 = true;
					local28 = 0;
					local38 = 0;
					local394[1] = local121;
					local100 = local96;
					local96 = local389;
					local394[2] = local145 + local131;
					local22 = Static165.method2794(local107, Static299.anInt5670);
					local24 = local22 - local26;
					local155 = local24;
					if (local24 < 0) {
						local155 = local24 + Static299.anInt5670;
					}
					if (Static299.anInt5670 < local155) {
						local155 -= Static299.anInt5670;
					}
					while (true) {
						@Pc(453) int[] local453 = local100[local32];
						if (local453[0] <= local155 && local155 <= local453[1]) {
							break;
						}
						@Pc(468) int local468 = ~local36;
						local32++;
						if (local468 >= ~local32) {
							local32 = 0;
						}
					}
				} else {
					local394 = local96[local38++];
					local394[1] = local121;
					local394[0] = local28;
					local394[2] = local145 + local131;
					this.method3941(local145, local117, local131, local20, local107, local28 + local22);
					local28 = local121;
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5072 = arg0.method2595();
		} else if (arg1 == 1) {
			this.anInt5083 = arg0.method2593();
		} else if (arg1 == 2) {
			this.anInt5084 = arg0.method2593();
		} else if (arg1 == 3) {
			this.anInt5082 = arg0.method2593();
		} else if (arg1 == 4) {
			this.anInt5081 = arg0.method2593();
		} else if (arg1 == 5) {
			this.anInt5079 = arg0.method2593();
		} else if (arg1 == 6) {
			this.anInt5080 = arg0.method2595();
		} else if (arg1 == 7) {
			this.anInt5074 = arg0.method2593();
		} else if (arg1 == 8) {
			this.anInt5085 = arg0.method2593();
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III[[IILjava/util/Random;I)V")
	private void method3941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = this.anInt5085 <= 0 ? 4096 : 4096 - Static165.method2794(arg4, this.anInt5085);
		@Pc(26) int local26 = this.anInt5074 * this.anInt5069 >> 12;
		@Pc(42) int local42 = this.anInt5069 - (local26 <= 0 ? 0 : Static165.method2794(arg4, local26));
		if (Static299.anInt5670 <= arg5) {
			arg5 -= Static299.anInt5670;
		}
		@Pc(71) int local71;
		@Pc(99) int local99;
		if (local42 > 0) {
			if (arg2 <= 0 || arg1 <= 0) {
				return;
			}
			local99 = arg2 / 2;
			local71 = arg1 / 2;
			@Pc(155) int local155 = local42 <= local71 ? local42 : local71;
			@Pc(162) int local162 = arg1 - local155 * 2;
			@Pc(166) int local166 = arg5 + local155;
			@Pc(177) int local177 = local42 > local99 ? local99 : local42;
			for (@Pc(179) int local179 = 0; local179 < arg2; local179++) {
				@Pc(188) int[] local188 = arg3[local179 + arg0];
				@Pc(198) int local198;
				@Pc(204) int local204;
				@Pc(217) int local217;
				if (local177 <= local179) {
					local198 = arg2 - local179 - 1;
					if (local198 < local177) {
						local204 = local18 * local198 / local177;
						@Pc(360) int local360;
						if (this.anInt5080 == 0) {
							for (local217 = 0; local217 < local155; local217++) {
								local360 = local18 * local217 / local155;
								local188[arg5 + local217 & Static142.anInt2791] = local188[Static142.anInt2791 & arg5 + arg1 - local217 - 1] = local360 * local204 >> 12;
							}
						} else {
							for (local217 = 0; local217 < local155; local217++) {
								local360 = local217 * local18 / local155;
								local188[Static142.anInt2791 & local217 + arg5] = local188[Static142.anInt2791 & arg1 + arg5 - local217 - 1] = local360 >= local204 ? local204 : local360;
							}
						}
						if (Static299.anInt5670 >= local166 + local162) {
							Static319.method514(local188, local166, local162, local204);
						} else {
							local217 = Static299.anInt5670 - local166;
							Static319.method514(local188, local166, local217, local204);
							Static319.method514(local188, 0, local162 - local217, local204);
						}
					} else {
						for (local204 = 0; local204 < local155; local204++) {
							local188[Static142.anInt2791 & arg5 + local204] = local188[arg1 + arg5 - local204 - 1 & Static142.anInt2791] = local18 * local204 / local155;
						}
						if (Static299.anInt5670 < local162 + local166) {
							local204 = Static299.anInt5670 - local166;
							Static319.method514(local188, local166, local204, local18);
							Static319.method514(local188, 0, local162 - local204, local18);
						} else {
							Static319.method514(local188, local166, local162, local18);
						}
					}
				} else {
					local198 = local18 * local179 / local177;
					if (this.anInt5080 == 0) {
						for (local204 = 0; local204 < local155; local204++) {
							local217 = local18 * local204 / local155;
							local188[Static142.anInt2791 & arg5 + local204] = local188[arg1 + arg5 - local204 - 1 & Static142.anInt2791] = local217 * local198 >> 12;
						}
					} else {
						for (local204 = 0; local204 < local155; local204++) {
							local217 = local18 * local204 / local155;
							local188[arg5 + local204 & Static142.anInt2791] = local188[Static142.anInt2791 & arg1 + arg5 - local204 - 1] = local217 < local198 ? local217 : local198;
						}
					}
					if (Static299.anInt5670 >= local162 + local166) {
						Static319.method514(local188, local166, local162, local198);
					} else {
						local204 = Static299.anInt5670 - local166;
						Static319.method514(local188, local166, local204, local198);
						Static319.method514(local188, 0, local162 - local204, local198);
					}
				}
			}
		} else if (arg1 + arg5 <= Static299.anInt5670) {
			for (local71 = 0; local71 < arg2; local71++) {
				Static319.method514(arg3[arg0 + local71], arg5, arg1, local18);
			}
		} else {
			local71 = Static299.anInt5670 - arg5;
			for (local99 = 0; local99 < arg2; local99++) {
				@Pc(113) int[] local113 = arg3[arg0 + local99];
				Static319.method514(local113, arg5, local71, local18);
				Static319.method514(local113, 0, arg1 - local71, local18);
			}
		}
	}
}
