import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class5_Sub1_Sub3 extends Class5_Sub1 {

	@OriginalMember(owner = "client!daa", name = "Q", descriptor = "I")
	private int anInt1539;

	@OriginalMember(owner = "client!daa", name = "C", descriptor = "I")
	private int anInt1528 = 409;

	@OriginalMember(owner = "client!daa", name = "D", descriptor = "I")
	private int anInt1529 = 0;

	@OriginalMember(owner = "client!daa", name = "E", descriptor = "I")
	private int anInt1530 = 1024;

	@OriginalMember(owner = "client!daa", name = "F", descriptor = "I")
	private int anInt1531 = 1024;

	@OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
	private int anInt1536 = 2048;

	@OriginalMember(owner = "client!daa", name = "B", descriptor = "I")
	private int anInt1527 = 0;

	@OriginalMember(owner = "client!daa", name = "K", descriptor = "I")
	private int anInt1534 = 1024;

	@OriginalMember(owner = "client!daa", name = "M", descriptor = "I")
	private int anInt1535 = 819;

	@OriginalMember(owner = "client!daa", name = "J", descriptor = "I")
	private int anInt1533 = 1024;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt1529 = arg1.method4220();
		} else if (arg0 == 1) {
			this.anInt1534 = arg1.method4227();
		} else if (arg0 == 2) {
			this.anInt1536 = arg1.method4227();
		} else if (arg0 == 3) {
			this.anInt1528 = arg1.method4227();
		} else if (arg0 == 4) {
			this.anInt1535 = arg1.method4227();
		} else if (arg0 == 5) {
			this.anInt1530 = arg1.method4227();
		} else if (arg0 == 6) {
			this.anInt1527 = arg1.method4220();
		} else if (arg0 == 7) {
			this.anInt1533 = arg1.method4227();
		} else if (arg0 == 8) {
			this.anInt1531 = arg1.method4227();
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(III[[IIILjava/util/Random;)V")
	private void method1419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(22) int local22 = this.anInt1531 <= 0 ? 4096 : 4096 - Static542.method7398(arg5, this.anInt1531);
		@Pc(30) int local30 = this.anInt1539 * this.anInt1533 >> 12;
		@Pc(45) int local45 = this.anInt1539 - (local30 <= 0 ? 0 : Static542.method7398(arg5, local30));
		if (arg0 >= Static147.anInt3075) {
			arg0 -= Static147.anInt3075;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		if (local45 > 0) {
			if (arg3 > 0 && arg4 > 0) {
				local73 = arg4 / 2;
				local77 = arg3 / 2;
				@Pc(88) int local88 = local73 < local45 ? local73 : local45;
				@Pc(95) int local95 = local77 < local45 ? local77 : local45;
				@Pc(100) int local100 = arg0 + local88;
				@Pc(107) int local107 = arg4 - local88 * 2;
				for (@Pc(109) int local109 = 0; local109 < arg3; local109++) {
					@Pc(118) int[] local118 = arg2[local109 + arg1];
					@Pc(131) int local131;
					@Pc(139) int local139;
					@Pc(147) int local147;
					if (local95 > local109) {
						local131 = local22 * local109 / local95;
						if (this.anInt1527 == 0) {
							for (local139 = 0; local139 < local88; local139++) {
								local147 = local139 * local22 / local88;
								local118[Static497.anInt9138 & arg0 + local139] = local118[Static497.anInt9138 & arg4 + arg0 - local139 - 1] = local147 * local131 >> 12;
							}
						} else {
							for (local139 = 0; local139 < local88; local139++) {
								local147 = local22 * local139 / local88;
								local118[Static497.anInt9138 & arg0 + local139] = local118[Static497.anInt9138 & arg4 + arg0 - local139 - 1] = local131 <= local147 ? local131 : local147;
							}
						}
						if (Static147.anInt3075 >= local100 + local107) {
							Static553.method2532(local118, local100, local107, local131);
						} else {
							local139 = Static147.anInt3075 - local100;
							Static553.method2532(local118, local100, local139, local131);
							Static553.method2532(local118, 0, local107 - local139, local131);
						}
					} else {
						local131 = arg3 - local109 - 1;
						if (local95 > local131) {
							local139 = local22 * local131 / local95;
							@Pc(290) int local290;
							if (this.anInt1527 == 0) {
								for (local147 = 0; local147 < local88; local147++) {
									local290 = local147 * local22 / local88;
									local118[Static497.anInt9138 & local147 + arg0] = local118[Static497.anInt9138 & arg0 + arg4 - local147 - 1] = local290 * local139 >> 12;
								}
							} else {
								for (local147 = 0; local147 < local88; local147++) {
									local290 = local22 * local147 / local88;
									local118[local147 + arg0 & Static497.anInt9138] = local118[arg0 + arg4 - local147 - 1 & Static497.anInt9138] = local139 > local290 ? local290 : local139;
								}
							}
							if (local107 + local100 <= Static147.anInt3075) {
								Static553.method2532(local118, local100, local107, local139);
							} else {
								local147 = Static147.anInt3075 - local100;
								Static553.method2532(local118, local100, local147, local139);
								Static553.method2532(local118, 0, local107 - local147, local139);
							}
						} else {
							for (local139 = 0; local139 < local88; local139++) {
								local118[Static497.anInt9138 & arg0 + local139] = local118[arg4 + arg0 - local139 - 1 & Static497.anInt9138] = local139 * local22 / local88;
							}
							if (local107 + local100 <= Static147.anInt3075) {
								Static553.method2532(local118, local100, local107, local22);
							} else {
								local147 = Static147.anInt3075 - local100;
								Static553.method2532(local118, local100, local147, local22);
								Static553.method2532(local118, 0, local107 - local147, local22);
							}
						}
					}
				}
			}
		} else if (arg4 + arg0 > Static147.anInt3075) {
			local73 = Static147.anInt3075 - arg0;
			for (local77 = 0; local77 < arg3; local77++) {
				@Pc(500) int[] local500 = arg2[arg1 + local77];
				Static553.method2532(local500, arg0, local73, local22);
				Static553.method2532(local500, 0, arg4 - local73, local22);
			}
		} else {
			for (local73 = 0; local73 < arg3; local73++) {
				Static553.method2532(arg2[arg1 + local73], arg0, arg4, local22);
			}
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (!super.aClass104_41.aBoolean203) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass104_41.method2754();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static147.anInt3075 * this.anInt1534 >> 12;
		@Pc(52) int local52 = this.anInt1536 * Static147.anInt3075 >> 12;
		@Pc(59) int local59 = this.anInt1528 * Static250.anInt5057 >> 12;
		@Pc(66) int local66 = this.anInt1535 * Static250.anInt5057 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt1539 = Static147.anInt3075 / 8 * this.anInt1530 >> 12;
		@Pc(91) int local91 = Static147.anInt3075 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt1529);
		while (true) {
			while (true) {
				@Pc(117) int local117 = local45 + Static542.method7398(local106, local52 - local45);
				@Pc(126) int local126 = Static542.method7398(local106, local66 - local59) + local59;
				@Pc(130) int local130 = local28 + local117;
				if (Static147.anInt3075 < local130) {
					local117 = Static147.anInt3075 - local28;
					local130 = Static147.anInt3075;
				}
				@Pc(147) int local147;
				@Pc(157) int local157;
				if (local34) {
					local147 = 0;
				} else {
					@Pc(151) int local151 = local30;
					@Pc(155) int[] local155 = local99[local30];
					local157 = 0;
					@Pc(161) int local161 = local130 + local22;
					if (local161 < 0) {
						local161 += Static147.anInt3075;
					}
					if (local161 > Static147.anInt3075) {
						local161 -= Static147.anInt3075;
					}
					local147 = local155[2];
					while (true) {
						@Pc(182) int[] local182 = local99[local151];
						if (local161 >= local182[0] && local182[1] >= local161) {
							if (local151 != local30) {
								@Pc(212) int local212 = local22 + local28;
								if (local212 < 0) {
									local212 += Static147.anInt3075;
								}
								if (local212 > Static147.anInt3075) {
									local212 -= Static147.anInt3075;
								}
								for (@Pc(231) int local231 = 1; local231 <= local157; local231++) {
									@Pc(241) int[] local241 = local99[(local231 + local30) % local36];
									local147 = Math.max(local147, local241[2]);
								}
								for (@Pc(257) int local257 = 0; local257 <= local157; local257++) {
									@Pc(267) int[] local267 = local99[(local30 + local257) % local36];
									@Pc(271) int local271 = local267[2];
									if (local271 != local147) {
										@Pc(278) int local278 = local267[0];
										@Pc(282) int local282 = local267[1];
										@Pc(291) int local291;
										@Pc(293) int local293;
										if (local212 < local161) {
											local291 = Math.max(local212, local278);
											local293 = Math.min(local161, local282);
										} else if (local278 == 0) {
											local293 = Math.min(local161, local282);
											local291 = 0;
										} else {
											local291 = Math.max(local212, local278);
											local293 = Static147.anInt3075;
										}
										this.method1419(local291 + local26, local271, local20, local147 - local271, local293 - local291, local106);
									}
								}
							}
							local30 = local151;
							break;
						}
						local157++;
						local151++;
						if (local36 <= local151) {
							local151 = 0;
						}
					}
				}
				if (Static250.anInt5057 < local147 + local126) {
					local126 = Static250.anInt5057 - local147;
				} else {
					local32 = false;
				}
				@Pc(364) int[] local364;
				if (local130 == Static147.anInt3075) {
					this.method1419(local28 + local24, local147, local20, local126, local117, local106);
					if (local32) {
						return local11;
					}
					local32 = true;
					local364 = local95[local38++];
					local364[2] = local147 + local126;
					local364[0] = local28;
					local364[1] = local130;
					@Pc(429) int[][] local429 = local99;
					local99 = local95;
					local36 = local38;
					local95 = local429;
					local38 = 0;
					local26 = local24;
					local24 = Static542.method7398(local106, Static147.anInt3075);
					local22 = local24 - local26;
					local28 = 0;
					local157 = local22;
					if (local22 < 0) {
						local157 = local22 + Static147.anInt3075;
					}
					if (local157 > Static147.anInt3075) {
						local157 -= Static147.anInt3075;
					}
					local30 = 0;
					local34 = false;
					while (true) {
						@Pc(476) int[] local476 = local99[local30];
						if (local476[0] <= local157 && local476[1] >= local157) {
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local364 = local95[local38++];
					local364[2] = local147 + local126;
					local364[0] = local28;
					local364[1] = local130;
					this.method1419(local24 + local28, local147, local20, local126, local117, local106);
					local28 = local130;
				}
			}
		}
	}
}
