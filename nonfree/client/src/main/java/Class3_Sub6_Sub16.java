import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class3_Sub6_Sub16 extends Class3_Sub6 {

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
	private int anInt4944;

	@OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
	private int anInt4943 = 1024;

	@OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
	private int anInt4945 = 819;

	@OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
	private int anInt4946 = 1024;

	@OriginalMember(owner = "client!jh", name = "cb", descriptor = "I")
	private int anInt4953 = 1024;

	@OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
	private int anInt4949 = 409;

	@OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
	private int anInt4950 = 0;

	@OriginalMember(owner = "client!jh", name = "hb", descriptor = "I")
	private int anInt4957 = 2048;

	@OriginalMember(owner = "client!jh", name = "ib", descriptor = "I")
	private int anInt4958 = 0;

	@OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
	private int anInt4954 = 1024;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[[IIIILjava/util/Random;I)V")
	private void method3968(@OriginalArg(1) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(23) int local23 = this.anInt4946 > 0 ? 4096 - Static120.method2330(arg4, this.anInt4946) : 4096;
		@Pc(31) int local31 = this.anInt4943 * this.anInt4944 >> 12;
		@Pc(47) int local47 = this.anInt4944 - (local31 <= 0 ? 0 : Static120.method2330(arg4, local31));
		if (Static481.anInt8358 <= arg2) {
			arg2 -= Static481.anInt8358;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		if (local47 > 0) {
			if (arg5 > 0 && arg1 > 0) {
				local73 = arg1 / 2;
				local77 = arg5 / 2;
				@Pc(88) int local88 = local73 >= local47 ? local47 : local73;
				@Pc(95) int local95 = local47 > local77 ? local77 : local47;
				@Pc(99) int local99 = arg2 + local88;
				@Pc(106) int local106 = arg1 - local88 * 2;
				for (@Pc(108) int local108 = 0; local108 < arg5; local108++) {
					@Pc(116) int[] local116 = arg0[local108 + arg3];
					@Pc(129) int local129;
					@Pc(134) int local134;
					@Pc(142) int local142;
					if (local95 > local108) {
						local129 = local108 * local23 / local95;
						if (this.anInt4950 == 0) {
							for (local134 = 0; local134 < local88; local134++) {
								local142 = local134 * local23 / local88;
								local116[Static325.anInt5932 & arg2 + local134] = local116[Static325.anInt5932 & arg2 + arg1 - local134 - 1] = local142 * local129 >> 12;
							}
						} else {
							for (local134 = 0; local134 < local88; local134++) {
								local142 = local134 * local23 / local88;
								local116[arg2 + local134 & Static325.anInt5932] = local116[Static325.anInt5932 & arg1 + arg2 - local134 - 1] = local142 < local129 ? local142 : local129;
							}
						}
						if (Static481.anInt8358 >= local106 + local99) {
							Static604.method6221(local116, local99, local106, local129);
						} else {
							local134 = Static481.anInt8358 - local99;
							Static604.method6221(local116, local99, local134, local129);
							Static604.method6221(local116, 0, local106 - local134, local129);
						}
					} else {
						local129 = arg5 - local108 - 1;
						if (local129 < local95) {
							local134 = local23 * local129 / local95;
							@Pc(282) int local282;
							if (this.anInt4950 == 0) {
								for (local142 = 0; local142 < local88; local142++) {
									local282 = local142 * local23 / local88;
									local116[arg2 + local142 & Static325.anInt5932] = local116[arg2 + arg1 - local142 - 1 & Static325.anInt5932] = local282 * local134 >> 12;
								}
							} else {
								for (local142 = 0; local142 < local88; local142++) {
									local282 = local142 * local23 / local88;
									local116[Static325.anInt5932 & local142 + arg2] = local116[arg2 + arg1 - local142 - 1 & Static325.anInt5932] = local134 <= local282 ? local134 : local282;
								}
							}
							if (Static481.anInt8358 < local106 + local99) {
								local142 = Static481.anInt8358 - local99;
								Static604.method6221(local116, local99, local142, local134);
								Static604.method6221(local116, 0, local106 - local142, local134);
							} else {
								Static604.method6221(local116, local99, local106, local134);
							}
						} else {
							for (local134 = 0; local134 < local88; local134++) {
								local116[Static325.anInt5932 & arg2 + local134] = local116[Static325.anInt5932 & arg2 + arg1 - local134 - 1] = local134 * local23 / local88;
							}
							if (local99 + local106 > Static481.anInt8358) {
								local142 = Static481.anInt8358 - local99;
								Static604.method6221(local116, local99, local142, local23);
								Static604.method6221(local116, 0, local106 - local142, local23);
							} else {
								Static604.method6221(local116, local99, local106, local23);
							}
						}
					}
				}
			}
		} else if (arg2 + arg1 > Static481.anInt8358) {
			local73 = Static481.anInt8358 - arg2;
			for (local77 = 0; local77 < arg5; local77++) {
				@Pc(487) int[] local487 = arg0[arg3 + local77];
				Static604.method6221(local487, arg2, local73, local23);
				Static604.method6221(local487, 0, arg1 - local73, local23);
			}
		} else {
			for (local73 = 0; local73 < arg5; local73++) {
				Static604.method6221(arg0[arg3 + local73], arg2, arg1, local23);
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (!super.aClass170_41.aBoolean337) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass170_41.method4101();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt4954 * Static481.anInt8358 >> 12;
		@Pc(52) int local52 = Static481.anInt8358 * this.anInt4957 >> 12;
		@Pc(59) int local59 = Static465.anInt8091 * this.anInt4949 >> 12;
		@Pc(66) int local66 = this.anInt4945 * Static465.anInt8091 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt4944 = this.anInt4953 * (Static481.anInt8358 / 8) >> 12;
		@Pc(91) int local91 = Static481.anInt8358 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt4958);
		while (true) {
			while (true) {
				@Pc(116) int local116 = Static120.method2330(local106, local52 - local45) + local45;
				@Pc(126) int local126 = Static120.method2330(local106, local66 - local59) + local59;
				@Pc(131) int local131 = local28 + local116;
				if (Static481.anInt8358 < local131) {
					local116 = Static481.anInt8358 - local28;
					local131 = Static481.anInt8358;
				}
				@Pc(171) int local171;
				@Pc(150) int local150;
				if (local34) {
					local171 = 0;
				} else {
					@Pc(144) int local144 = local30;
					@Pc(148) int[] local148 = local99[local30];
					local150 = 0;
					@Pc(154) int local154 = local22 + local131;
					if (local154 < 0) {
						local154 += Static481.anInt8358;
					}
					if (Static481.anInt8358 < local154) {
						local154 -= Static481.anInt8358;
					}
					local171 = local148[2];
					while (true) {
						@Pc(175) int[] local175 = local99[local144];
						if (local175[0] <= local154 && local175[1] >= local154) {
							if (local144 != local30) {
								@Pc(213) int local213 = local22 + local28;
								if (local213 < 0) {
									local213 += Static481.anInt8358;
								}
								if (Static481.anInt8358 < local213) {
									local213 -= Static481.anInt8358;
								}
								for (@Pc(235) int local235 = 1; local235 <= local150; local235++) {
									@Pc(245) int[] local245 = local99[(local30 + local235) % local36];
									local171 = Math.max(local171, local245[2]);
								}
								for (@Pc(257) int local257 = 0; local257 <= local150; local257++) {
									@Pc(267) int[] local267 = local99[(local257 + local30) % local36];
									@Pc(271) int local271 = local267[2];
									if (local171 != local271) {
										@Pc(278) int local278 = local267[0];
										@Pc(282) int local282 = local267[1];
										@Pc(296) int local296;
										@Pc(300) int local300;
										if (local213 < local154) {
											local296 = Math.max(local213, local278);
											local300 = Math.min(local154, local282);
										} else if (local278 == 0) {
											local296 = 0;
											local300 = Math.min(local154, local282);
										} else {
											local296 = Math.max(local213, local278);
											local300 = Static481.anInt8358;
										}
										this.method3968(local20, local300 - local296, local26 + local296, local271, local106, local171 - local271);
									}
								}
							}
							local30 = local144;
							break;
						}
						local150++;
						local144++;
						if (local36 <= local144) {
							local144 = 0;
						}
					}
				}
				if (local171 + local126 <= Static465.anInt8091) {
					local32 = false;
				} else {
					local126 = Static465.anInt8091 - local171;
				}
				@Pc(395) int[] local395;
				if (local131 == Static481.anInt8358) {
					this.method3968(local20, local116, local28 + local24, local171, local106, local126);
					if (local32) {
						return local11;
					}
					local32 = true;
					local395 = local95[local38++];
					local395[1] = local131;
					local395[0] = local28;
					local395[2] = local126 + local171;
					@Pc(411) int[][] local411 = local99;
					local99 = local95;
					local95 = local411;
					local36 = local38;
					local38 = 0;
					local26 = local24;
					local24 = Static120.method2330(local106, Static481.anInt8358);
					local28 = 0;
					local22 = local24 - local26;
					local150 = local22;
					if (local22 < 0) {
						local150 = local22 + Static481.anInt8358;
					}
					if (Static481.anInt8358 < local150) {
						local150 -= Static481.anInt8358;
					}
					local30 = 0;
					while (true) {
						@Pc(461) int[] local461 = local99[local30];
						if (local461[0] <= local150 && local150 <= local461[1]) {
							local34 = false;
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local395 = local95[local38++];
					local395[1] = local131;
					local395[0] = local28;
					local395[2] = local126 + local171;
					this.method3968(local20, local116, local24 + local28, local171, local106, local126);
					local28 = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4958 = arg0.method6814();
		} else if (arg1 == 1) {
			this.anInt4954 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anInt4957 = arg0.method6811();
		} else if (arg1 == 3) {
			this.anInt4949 = arg0.method6811();
		} else if (arg1 == 4) {
			this.anInt4945 = arg0.method6811();
		} else if (arg1 == 5) {
			this.anInt4953 = arg0.method6811();
		} else if (arg1 == 6) {
			this.anInt4950 = arg0.method6814();
		} else if (arg1 == 7) {
			this.anInt4943 = arg0.method6811();
		} else if (arg1 == 8) {
			this.anInt4946 = arg0.method6811();
		}
	}
}
