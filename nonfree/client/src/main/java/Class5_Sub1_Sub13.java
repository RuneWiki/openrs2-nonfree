import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class5_Sub1_Sub13 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
	private int anInt1519;

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
	private int anInt1506 = 0;

	@OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
	private int anInt1510 = 2048;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
	private int anInt1511 = 1024;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
	private int anInt1516 = 1024;

	@OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
	private int anInt1517 = 1024;

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
	private int anInt1512 = 1024;

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
	private int anInt1509 = 819;

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
	private int anInt1518 = 409;

	@OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
	private int anInt1522 = 0;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1522 = arg0.method3062();
		} else if (arg1 == 1) {
			this.anInt1516 = arg0.method3077();
		} else if (arg1 == 2) {
			this.anInt1510 = arg0.method3077();
		} else if (arg1 == 3) {
			this.anInt1518 = arg0.method3077();
		} else if (arg1 == 4) {
			this.anInt1509 = arg0.method3077();
		} else if (arg1 == 5) {
			this.anInt1517 = arg0.method3077();
		} else if (arg1 == 6) {
			this.anInt1506 = arg0.method3062();
		} else if (arg1 == 7) {
			this.anInt1511 = arg0.method3077();
		} else if (arg1 == 8) {
			this.anInt1512 = arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[[IBLjava/util/Random;III)V")
	private void method1143(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = this.anInt1512 > 0 ? 4096 - Static85.method1454(arg2, this.anInt1512) : 4096;
		@Pc(25) int local25 = this.anInt1511 * this.anInt1519 >> 12;
		@Pc(49) int local49 = this.anInt1519 - (local25 > 0 ? Static85.method1454(arg2, local25) : 0);
		if (arg0 >= Static174.anInt3489) {
			arg0 -= Static174.anInt3489;
		}
		@Pc(73) int local73;
		@Pc(95) int local95;
		if (local49 > 0) {
			if (arg5 > 0 && arg3 > 0) {
				local73 = arg3 / 2;
				@Pc(80) int local80 = local49 <= local73 ? local49 : local73;
				@Pc(87) int local87 = arg3 - local80 * 2;
				@Pc(91) int local91 = arg0 + local80;
				local95 = arg5 / 2;
				@Pc(102) int local102 = local95 >= local49 ? local49 : local95;
				for (@Pc(104) int local104 = 0; local104 < arg5; local104++) {
					@Pc(113) int[] local113 = arg1[local104 + arg4];
					@Pc(126) int local126;
					@Pc(134) int local134;
					@Pc(142) int local142;
					if (local102 > local104) {
						local126 = local104 * local17 / local102;
						if (this.anInt1506 == 0) {
							for (local134 = 0; local134 < local80; local134++) {
								local142 = local17 * local134 / local80;
								local113[Static189.anInt3753 & local134 + arg0] = local113[arg3 + arg0 - local134 - 1 & Static189.anInt3753] = local126 * local142 >> 12;
							}
						} else {
							for (local134 = 0; local134 < local80; local134++) {
								local142 = local17 * local134 / local80;
								local113[arg0 + local134 & Static189.anInt3753] = local113[Static189.anInt3753 & arg3 + arg0 - local134 - 1] = local126 <= local142 ? local126 : local142;
							}
						}
						if (Static174.anInt3489 >= local91 + local87) {
							Static220.method48(local113, local91, local87, local126);
						} else {
							local134 = Static174.anInt3489 - local91;
							Static220.method48(local113, local91, local134, local126);
							Static220.method48(local113, 0, local87 - local134, local126);
						}
					} else {
						local126 = arg5 - local104 - 1;
						if (local126 < local102) {
							local134 = local126 * local17 / local102;
							@Pc(296) int local296;
							if (this.anInt1506 == 0) {
								for (local142 = 0; local142 < local80; local142++) {
									local296 = local142 * local17 / local80;
									local113[arg0 + local142 & Static189.anInt3753] = local113[Static189.anInt3753 & arg0 + arg3 - local142 - 1] = local134 * local296 >> 12;
								}
							} else {
								for (local142 = 0; local142 < local80; local142++) {
									local296 = local142 * local17 / local80;
									local113[arg0 + local142 & Static189.anInt3753] = local113[Static189.anInt3753 & arg0 + arg3 - local142 - 1] = local296 >= local134 ? local134 : local296;
								}
							}
							if (local91 + local87 <= Static174.anInt3489) {
								Static220.method48(local113, local91, local87, local134);
							} else {
								local142 = Static174.anInt3489 - local91;
								Static220.method48(local113, local91, local142, local134);
								Static220.method48(local113, 0, local87 - local142, local134);
							}
						} else {
							for (local134 = 0; local134 < local80; local134++) {
								local113[local134 + arg0 & Static189.anInt3753] = local113[Static189.anInt3753 & arg0 + arg3 - local134 - 1] = local17 * local134 / local80;
							}
							if (Static174.anInt3489 < local91 + local87) {
								local142 = Static174.anInt3489 - local91;
								Static220.method48(local113, local91, local142, local17);
								Static220.method48(local113, 0, local87 - local142, local17);
							} else {
								Static220.method48(local113, local91, local87, local17);
							}
						}
					}
				}
			}
		} else if (arg0 + arg3 > Static174.anInt3489) {
			local73 = Static174.anInt3489 - arg0;
			for (local95 = 0; local95 < arg5; local95++) {
				@Pc(510) int[] local510 = arg1[local95 + arg4];
				Static220.method48(local510, arg0, local73, local17);
				Static220.method48(local510, 0, arg3 - local73, local17);
			}
		} else {
			for (local73 = 0; local73 < arg5; local73++) {
				Static220.method48(arg1[arg4 + local73], arg0, arg3, local17);
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (!super.aClass101_41.aBoolean174) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass101_41.method2885();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(43) int local43 = Static174.anInt3489 * this.anInt1516 >> 12;
		@Pc(50) int local50 = Static174.anInt3489 * this.anInt1510 >> 12;
		@Pc(52) int local52 = 0;
		@Pc(59) int local59 = this.anInt1518 * Static207.anInt4072 >> 12;
		@Pc(66) int local66 = Static207.anInt4072 * this.anInt1509 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt1519 = Static174.anInt3489 / 8 * this.anInt1517 >> 12;
		@Pc(91) int local91 = Static174.anInt3489 / local43 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(102) Random local102 = new Random((long) this.anInt1522);
		@Pc(106) int[][] local106 = new int[local91][3];
		while (true) {
			while (true) {
				@Pc(117) int local117 = local43 + Static85.method1454(local102, local50 - local43);
				@Pc(129) int local129 = local59 + Static85.method1454(local102, local66 - local59);
				@Pc(133) int local133 = local117 + local26;
				if (Static174.anInt3489 < local133) {
					local133 = Static174.anInt3489;
					local117 = Static174.anInt3489 - local26;
				}
				@Pc(157) int local157;
				@Pc(153) int local153;
				if (local32) {
					local157 = 0;
				} else {
					@Pc(147) int local147 = local24;
					@Pc(151) int[] local151 = local106[local24];
					local153 = 0;
					local157 = local151[2];
					@Pc(161) int local161 = local22 + local133;
					if (local161 < 0) {
						local161 += Static174.anInt3489;
					}
					if (local161 > Static174.anInt3489) {
						local161 -= Static174.anInt3489;
					}
					while (true) {
						@Pc(185) int[] local185 = local106[local147];
						if (local161 >= local185[0] && local185[1] >= local161) {
							if (local24 != local147) {
								@Pc(223) int local223 = local26 + local22;
								if (local223 < 0) {
									local223 += Static174.anInt3489;
								}
								if (Static174.anInt3489 < local223) {
									local223 -= Static174.anInt3489;
								}
								for (@Pc(242) int local242 = 1; local242 <= local153; local242++) {
									@Pc(252) int[] local252 = local106[(local24 + local242) % local36];
									local157 = Math.max(local157, local252[2]);
								}
								for (@Pc(264) int local264 = 0; local264 <= local153; local264++) {
									@Pc(274) int[] local274 = local106[(local264 + local24) % local36];
									@Pc(278) int local278 = local274[2];
									if (local278 != local157) {
										@Pc(285) int local285 = local274[0];
										@Pc(289) int local289 = local274[1];
										@Pc(302) int local302;
										@Pc(304) int local304;
										if (local161 > local223) {
											local302 = Math.max(local223, local285);
											local304 = Math.min(local161, local289);
										} else if (local285 == 0) {
											local302 = 0;
											local304 = Math.min(local161, local289);
										} else {
											local302 = Math.max(local223, local285);
											local304 = Static174.anInt3489;
										}
										this.method1143(local28 + local302, local20, local102, local304 - local302, local278, local157 - local278);
									}
								}
							}
							local24 = local147;
							break;
						}
						local153++;
						@Pc(207) int local207 = ~local36;
						local147++;
						if (local207 >= ~local147) {
							local147 = 0;
						}
					}
				}
				if (local129 + local157 > Static207.anInt4072) {
					local129 = Static207.anInt4072 - local157;
				} else {
					local34 = false;
				}
				@Pc(381) int[] local381;
				if (local133 == Static174.anInt3489) {
					this.method1143(local30 + local26, local20, local102, local117, local157, local129);
					if (local34) {
						return local11;
					}
					local32 = false;
					local34 = true;
					local28 = local30;
					local24 = 0;
					@Pc(434) int[][] local434 = local106;
					local106 = local95;
					local381 = local95[local52++];
					local36 = local52;
					local381[0] = local26;
					local26 = 0;
					local95 = local434;
					local381[2] = local157 + local129;
					local381[1] = local133;
					local52 = 0;
					local30 = Static85.method1454(local102, Static174.anInt3489);
					local22 = local30 - local28;
					local153 = local22;
					if (local22 < 0) {
						local153 = local22 + Static174.anInt3489;
					}
					if (Static174.anInt3489 < local153) {
						local153 -= Static174.anInt3489;
					}
					while (true) {
						@Pc(494) int[] local494 = local106[local24];
						if (local494[0] <= local153 && local153 <= local494[1]) {
							break;
						}
						local24++;
						if (local24 >= local36) {
							local24 = 0;
						}
					}
				} else {
					local381 = local95[local52++];
					local381[0] = local26;
					local381[1] = local133;
					local381[2] = local157 + local129;
					this.method1143(local26 + local30, local20, local102, local117, local157, local129);
					local26 = local133;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
	}
}
