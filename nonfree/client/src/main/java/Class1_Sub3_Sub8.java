import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
	private int anInt651 = 409;

	@OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
	private int anInt652 = 0;

	@OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
	private int anInt656 = 0;

	@OriginalMember(owner = "client!ck", name = "hb", descriptor = "I")
	private int anInt662 = 1024;

	@OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
	private int anInt654 = 1024;

	@OriginalMember(owner = "client!ck", name = "fb", descriptor = "I")
	private int anInt660 = 819;

	@OriginalMember(owner = "client!ck", name = "jb", descriptor = "I")
	private int anInt664 = 1024;

	@OriginalMember(owner = "client!ck", name = "ib", descriptor = "I")
	private int anInt663 = 1024;

	@OriginalMember(owner = "client!ck", name = "mb", descriptor = "I")
	private int anInt667 = 2048;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[[IIIILjava/util/Random;)V")
	private void method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(22) int local22 = this.anInt662 > 0 ? 4096 - Static131.method2214(this.anInt662, arg5) : 4096;
		@Pc(30) int local30 = this.anInt664 * this.anInt657 >> 12;
		@Pc(42) int local42 = this.anInt657 - (local30 <= 0 ? 0 : Static131.method2214(local30, arg5));
		if (Static76.anInt1531 <= arg1) {
			arg1 -= Static76.anInt1531;
		}
		@Pc(79) int local79;
		@Pc(94) int local94;
		if (local42 > 0) {
			if (arg4 > 0 && arg0 > 0) {
				local79 = arg0 / 2;
				@Pc(90) int local90 = local42 <= local79 ? local42 : local79;
				local94 = arg4 / 2;
				@Pc(101) int local101 = local94 >= local42 ? local42 : local94;
				@Pc(105) int local105 = arg1 + local90;
				@Pc(111) int local111 = arg0 - local90 * 2;
				for (@Pc(113) int local113 = 0; local113 < arg4; local113++) {
					@Pc(121) int[] local121 = arg2[arg3 + local113];
					@Pc(130) int local130;
					@Pc(135) int local135;
					@Pc(143) int local143;
					if (local101 > local113) {
						local130 = local22 * local113 / local101;
						if (this.anInt652 == 0) {
							for (local135 = 0; local135 < local90; local135++) {
								local143 = local22 * local135 / local90;
								local121[local135 + arg1 & Static121.anInt2385] = local121[Static121.anInt2385 & arg0 + arg1 - local135 - 1] = local143 * local130 >> 12;
							}
						} else {
							for (local135 = 0; local135 < local90; local135++) {
								local143 = local135 * local22 / local90;
								local121[local135 + arg1 & Static121.anInt2385] = local121[Static121.anInt2385 & arg0 + arg1 - local135 - 1] = local130 <= local143 ? local130 : local143;
							}
						}
						if (local111 + local105 > Static76.anInt1531) {
							local135 = Static76.anInt1531 - local105;
							Static235.method864(local121, local105, local135, local130);
							Static235.method864(local121, 0, local111 - local135, local130);
						} else {
							Static235.method864(local121, local105, local111, local130);
						}
					} else {
						local130 = arg4 - local113 - 1;
						if (local101 > local130) {
							local135 = local130 * local22 / local101;
							@Pc(281) int local281;
							if (this.anInt652 == 0) {
								for (local143 = 0; local143 < local90; local143++) {
									local281 = local22 * local143 / local90;
									local121[Static121.anInt2385 & local143 + arg1] = local121[Static121.anInt2385 & arg1 + arg0 - local143 - 1] = local281 * local135 >> 12;
								}
							} else {
								for (local143 = 0; local143 < local90; local143++) {
									local281 = local22 * local143 / local90;
									local121[Static121.anInt2385 & local143 + arg1] = local121[Static121.anInt2385 & arg0 + arg1 - local143 - 1] = local135 > local281 ? local281 : local135;
								}
							}
							if (Static76.anInt1531 < local105 + local111) {
								local143 = Static76.anInt1531 - local105;
								Static235.method864(local121, local105, local143, local135);
								Static235.method864(local121, 0, local111 - local143, local135);
							} else {
								Static235.method864(local121, local105, local111, local135);
							}
						} else {
							for (local135 = 0; local135 < local90; local135++) {
								local121[local135 + arg1 & Static121.anInt2385] = local121[arg1 + arg0 - local135 - 1 & Static121.anInt2385] = local135 * local22 / local90;
							}
							if (local105 + local111 <= Static76.anInt1531) {
								Static235.method864(local121, local105, local111, local22);
							} else {
								local143 = Static76.anInt1531 - local105;
								Static235.method864(local121, local105, local143, local22);
								Static235.method864(local121, 0, local111 - local143, local22);
							}
						}
					}
				}
			}
		} else if (Static76.anInt1531 < arg1 + arg0) {
			local79 = Static76.anInt1531 - arg1;
			for (local94 = 0; local94 < arg4; local94++) {
				@Pc(491) int[] local491 = arg2[arg3 + local94];
				Static235.method864(local491, arg1, local79, local22);
				Static235.method864(local491, 0, arg0 - local79, local22);
			}
		} else {
			for (local79 = 0; local79 < arg4; local79++) {
				Static235.method864(arg2[local79 + arg3], arg1, arg0, local22);
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt656 = arg1.method2142();
		} else if (arg0 == 1) {
			this.anInt663 = arg1.method2178();
		} else if (arg0 == 2) {
			this.anInt667 = arg1.method2178();
		} else if (arg0 == 3) {
			this.anInt651 = arg1.method2178();
		} else if (arg0 == 4) {
			this.anInt660 = arg1.method2178();
		} else if (arg0 == 5) {
			this.anInt654 = arg1.method2178();
		} else if (arg0 == 6) {
			this.anInt652 = arg1.method2142();
		} else if (arg0 == 7) {
			this.anInt664 = arg1.method2178();
		} else if (arg0 == 8) {
			this.anInt662 = arg1.method2178();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass79_41.method2341(arg0);
		if (!super.aClass79_41.aBoolean125) {
			return local7;
		}
		@Pc(20) int[][] local20 = super.aClass79_41.method2343();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) boolean local30 = true;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(45) int local45 = this.anInt663 * Static76.anInt1531 >> 12;
		@Pc(52) int local52 = this.anInt667 * Static76.anInt1531 >> 12;
		@Pc(59) int local59 = Static30.anInt572 * this.anInt651 >> 12;
		@Pc(66) int local66 = this.anInt660 * Static30.anInt572 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt657 = Static76.anInt1531 / 8 * this.anInt654 >> 12;
		@Pc(91) int local91 = Static76.anInt1531 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt656);
		while (true) {
			while (true) {
				@Pc(116) int local116 = Static131.method2214(local52 - local45, local106) + local45;
				@Pc(127) int local127 = Static131.method2214(local66 - local59, local106) + local59;
				@Pc(131) int local131 = local116 + local28;
				if (local131 > Static76.anInt1531) {
					local116 = Static76.anInt1531 - local28;
					local131 = Static76.anInt1531;
				}
				@Pc(204) int local204;
				@Pc(149) int local149;
				@Pc(172) int local172;
				if (local38) {
					local149 = 0;
				} else {
					@Pc(153) int local153 = local32;
					@Pc(157) int local157 = local22 + local131;
					if (local157 < 0) {
						local157 += Static76.anInt1531;
					}
					@Pc(170) int[] local170 = local99[local32];
					local172 = 0;
					if (Static76.anInt1531 < local157) {
						local157 -= Static76.anInt1531;
					}
					local149 = local170[2];
					while (true) {
						@Pc(191) int[] local191 = local99[local153];
						if (local157 >= local191[0] && local157 <= local191[1]) {
							if (local153 != local32) {
								@Pc(222) int local222 = local28 + local22;
								if (local222 < 0) {
									local222 += Static76.anInt1531;
								}
								if (Static76.anInt1531 < local222) {
									local222 -= Static76.anInt1531;
								}
								for (@Pc(237) int local237 = 1; local237 <= local172; local237++) {
									@Pc(247) int[] local247 = local99[(local237 + local32) % local34];
									local149 = Math.max(local149, local247[2]);
								}
								for (@Pc(263) int local263 = 0; local263 <= local172; local263++) {
									@Pc(273) int[] local273 = local99[(local263 + local32) % local34];
									@Pc(277) int local277 = local273[2];
									if (local149 != local277) {
										@Pc(288) int local288 = local273[0];
										@Pc(292) int local292 = local273[1];
										@Pc(304) int local304;
										@Pc(306) int local306;
										if (local157 > local222) {
											local304 = Math.max(local222, local288);
											local306 = Math.min(local157, local292);
										} else if (local288 == 0) {
											local304 = 0;
											local306 = Math.min(local157, local292);
										} else {
											local304 = Math.max(local222, local288);
											local306 = Static76.anInt1531;
										}
										this.method506(local306 - local304, local304 - -local26, local20, local277, local149 - local277, local106);
									}
								}
							}
							local32 = local153;
							break;
						}
						local204 = ~local34;
						local153++;
						if (local204 >= ~local153) {
							local153 = 0;
						}
						local172++;
					}
				}
				if (local149 + local127 > Static30.anInt572) {
					local127 = Static30.anInt572 - local149;
				} else {
					local30 = false;
				}
				@Pc(378) int[] local378;
				if (Static76.anInt1531 == local131) {
					this.method506(local116, local28 + local24, local20, local149, local127, local106);
					if (local30) {
						return local7;
					}
					local30 = true;
					local38 = false;
					local32 = 0;
					local378 = local95[local36++];
					local378[0] = local28;
					local34 = local36;
					local28 = 0;
					local378[1] = local131;
					@Pc(446) int[][] local446 = local99;
					local378[2] = local149 + local127;
					local26 = local24;
					local24 = Static131.method2214(Static76.anInt1531, local106);
					local22 = local24 - local26;
					local99 = local95;
					local172 = local22;
					if (local22 < 0) {
						local172 = local22 + Static76.anInt1531;
					}
					if (local172 > Static76.anInt1531) {
						local172 -= Static76.anInt1531;
					}
					local95 = local446;
					local36 = 0;
					while (true) {
						@Pc(495) int[] local495 = local99[local32];
						if (local495[0] <= local172 && local172 <= local495[1]) {
							break;
						}
						local204 = ~local34;
						local32++;
						if (local204 >= ~local32) {
							local32 = 0;
						}
					}
				} else {
					local378 = local95[local36++];
					local378[1] = local131;
					local378[2] = local127 + local149;
					local378[0] = local28;
					this.method506(local116, local24 + local28, local20, local149, local127, local106);
					local28 = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
	}
}
