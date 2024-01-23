import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
	private int anInt2189;

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
	private int anInt2188 = 1024;

	@OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
	private int anInt2187 = 1024;

	@OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
	private int anInt2194 = 819;

	@OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
	private int anInt2192 = 2048;

	@OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
	private int anInt2193 = 1024;

	@OriginalMember(owner = "client!jd", name = "rb", descriptor = "I")
	private int anInt2203 = 0;

	@OriginalMember(owner = "client!jd", name = "ob", descriptor = "I")
	private int anInt2200 = 0;

	@OriginalMember(owner = "client!jd", name = "lb", descriptor = "I")
	private int anInt2198 = 1024;

	@OriginalMember(owner = "client!jd", name = "ub", descriptor = "I")
	private int anInt2205 = 409;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2203 = arg0.method2122();
		} else if (arg1 == 1) {
			this.anInt2188 = arg0.method2095();
		} else if (arg1 == 2) {
			this.anInt2192 = arg0.method2095();
		} else if (arg1 == 3) {
			this.anInt2205 = arg0.method2095();
		} else if (arg1 == 4) {
			this.anInt2194 = arg0.method2095();
		} else if (arg1 == 5) {
			this.anInt2187 = arg0.method2095();
		} else if (arg1 == 6) {
			this.anInt2200 = arg0.method2122();
		} else if (arg1 == 7) {
			this.anInt2198 = arg0.method2095();
		} else if (arg1 == 8) {
			this.anInt2193 = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BIILjava/util/Random;I[[II)V")
	private void method1727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(26) int local26 = this.anInt2193 <= 0 ? 4096 : 4096 - Static8.method184(arg2, this.anInt2193);
		@Pc(34) int local34 = this.anInt2189 * this.anInt2198 >> 12;
		@Pc(47) int local47 = this.anInt2189 - (local34 <= 0 ? 0 : Static8.method184(arg2, local34));
		if (arg1 >= Static54.anInt953) {
			arg1 -= Static54.anInt953;
		}
		@Pc(67) int local67;
		@Pc(94) int local94;
		if (local47 <= 0) {
			if (arg1 + arg0 <= Static54.anInt953) {
				for (local67 = 0; local67 < arg5; local67++) {
					Static231.method2215(arg4[arg3 + local67], arg1, arg0, local26);
				}
			} else {
				local67 = Static54.anInt953 - arg1;
				for (local94 = 0; local94 < arg5; local94++) {
					@Pc(103) int[] local103 = arg4[arg3 + local94];
					Static231.method2215(local103, arg1, local67, local26);
					Static231.method2215(local103, 0, arg0 - local67, local26);
				}
			}
		} else if (arg5 > 0 && arg0 > 0) {
			local67 = arg0 / 2;
			local94 = arg5 / 2;
			@Pc(148) int local148 = local47 <= local94 ? local47 : local94;
			@Pc(155) int local155 = local67 < local47 ? local67 : local47;
			@Pc(159) int local159 = local155 + arg1;
			@Pc(165) int local165 = arg0 - local155 * 2;
			for (@Pc(167) int local167 = 0; local167 < arg5; local167++) {
				@Pc(175) int[] local175 = arg4[local167 + arg3];
				@Pc(188) int local188;
				@Pc(196) int local196;
				@Pc(204) int local204;
				if (local167 < local148) {
					local188 = local167 * local26 / local148;
					if (this.anInt2200 == 0) {
						for (local196 = 0; local196 < local155; local196++) {
							local204 = local26 * local196 / local155;
							local175[local196 + arg1 & Static74.anInt1601] = local175[arg1 + arg0 - local196 - 1 & Static74.anInt1601] = local188 * local204 >> 12;
						}
					} else {
						for (local196 = 0; local196 < local155; local196++) {
							local204 = local196 * local26 / local155;
							local175[arg1 + local196 & Static74.anInt1601] = local175[arg1 + arg0 - local196 - 1 & Static74.anInt1601] = local204 >= local188 ? local188 : local204;
						}
					}
					if (local165 + local159 > Static54.anInt953) {
						local196 = Static54.anInt953 - local159;
						Static231.method2215(local175, local159, local196, local188);
						Static231.method2215(local175, 0, local165 - local196, local188);
					} else {
						Static231.method2215(local175, local159, local165, local188);
					}
				} else {
					local188 = arg5 - local167 - 1;
					if (local148 > local188) {
						local196 = local188 * local26 / local148;
						@Pc(348) int local348;
						if (this.anInt2200 == 0) {
							for (local204 = 0; local204 < local155; local204++) {
								local348 = local26 * local204 / local155;
								local175[Static74.anInt1601 & arg1 + local204] = local175[Static74.anInt1601 & arg0 + arg1 - local204 - 1] = local196 * local348 >> 12;
							}
						} else {
							for (local204 = 0; local204 < local155; local204++) {
								local348 = local204 * local26 / local155;
								local175[Static74.anInt1601 & arg1 + local204] = local175[Static74.anInt1601 & arg0 + arg1 - local204 - 1] = local196 <= local348 ? local196 : local348;
							}
						}
						if (local159 + local165 <= Static54.anInt953) {
							Static231.method2215(local175, local159, local165, local196);
						} else {
							local204 = Static54.anInt953 - local159;
							Static231.method2215(local175, local159, local204, local196);
							Static231.method2215(local175, 0, local165 - local204, local196);
						}
					} else {
						for (local196 = 0; local196 < local155; local196++) {
							local175[local196 + arg1 & Static74.anInt1601] = local175[Static74.anInt1601 & arg0 + arg1 - local196 - 1] = local196 * local26 / local155;
						}
						if (local165 + local159 > Static54.anInt953) {
							local204 = Static54.anInt953 - local159;
							Static231.method2215(local175, local159, local204, local26);
							Static231.method2215(local175, 0, local165 - local204, local26);
						} else {
							Static231.method2215(local175, local159, local165, local26);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass16_41.method300(arg0);
		if (!super.aClass16_41.aBoolean12) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass16_41.method299();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = true;
		@Pc(43) int local43 = this.anInt2192 * Static54.anInt953 >> 12;
		@Pc(50) int local50 = Static54.anInt953 * this.anInt2188 >> 12;
		@Pc(52) int local52 = 0;
		@Pc(59) int local59 = Static11.anInt313 * this.anInt2205 >> 12;
		@Pc(66) int local66 = this.anInt2194 * Static11.anInt313 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt2189 = Static54.anInt953 / 8 * this.anInt2187 >> 12;
		@Pc(91) int local91 = Static54.anInt953 / local50 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt2203);
		while (true) {
			while (true) {
				@Pc(115) int local115 = Static8.method184(local106, local43 - local50) + local50;
				@Pc(125) int local125 = Static8.method184(local106, local66 - local59) + local59;
				@Pc(129) int local129 = local115 + local28;
				if (Static54.anInt953 < local129) {
					local129 = Static54.anInt953;
					local115 = Static54.anInt953 - local28;
				}
				@Pc(156) int local156;
				@Pc(148) int local148;
				if (local36) {
					local156 = 0;
				} else {
					@Pc(146) int local146 = local30;
					local148 = 0;
					@Pc(152) int[] local152 = local99[local30];
					local156 = local152[2];
					@Pc(160) int local160 = local22 + local129;
					if (local160 < 0) {
						local160 += Static54.anInt953;
					}
					if (Static54.anInt953 < local160) {
						local160 -= Static54.anInt953;
					}
					while (true) {
						@Pc(180) int[] local180 = local99[local146];
						if (local180[0] <= local160 && local160 <= local180[1]) {
							if (local30 != local146) {
								@Pc(218) int local218 = local22 + local28;
								if (local218 < 0) {
									local218 += Static54.anInt953;
								}
								if (Static54.anInt953 < local218) {
									local218 -= Static54.anInt953;
								}
								for (@Pc(233) int local233 = 1; local233 <= local148; local233++) {
									@Pc(244) int[] local244 = local99[(local30 + local233) % local34];
									local156 = Math.max(local156, local244[2]);
								}
								for (@Pc(260) int local260 = 0; local260 <= local148; local260++) {
									@Pc(270) int[] local270 = local99[(local260 + local30) % local34];
									@Pc(274) int local274 = local270[2];
									if (local274 != local156) {
										@Pc(281) int local281 = local270[1];
										@Pc(285) int local285 = local270[0];
										@Pc(295) int local295;
										@Pc(299) int local299;
										if (local160 > local218) {
											local295 = Math.max(local218, local285);
											local299 = Math.min(local160, local281);
										} else if (local285 == 0) {
											local295 = 0;
											local299 = Math.min(local160, local281);
										} else {
											local295 = Math.max(local218, local285);
											local299 = Static54.anInt953;
										}
										this.method1727(local299 - local295, local295 - -local26, local106, local274, local20, local156 - local274);
									}
								}
							}
							local30 = local146;
							break;
						}
						@Pc(197) int local197 = ~local34;
						local146++;
						if (local197 >= ~local146) {
							local146 = 0;
						}
						local148++;
					}
				}
				if (Static11.anInt313 < local156 + local125) {
					local125 = Static11.anInt313 - local156;
				} else {
					local32 = false;
				}
				@Pc(365) int[] local365;
				if (Static54.anInt953 == local129) {
					this.method1727(local115, local24 + local28, local106, local156, local20, local125);
					if (local32) {
						return local11;
					}
					local32 = true;
					local26 = local24;
					local30 = 0;
					local36 = false;
					local365 = local95[local52++];
					local365[0] = local28;
					local365[1] = local129;
					local28 = 0;
					local34 = local52;
					local52 = 0;
					local365[2] = local156 + local125;
					local24 = Static8.method184(local106, Static54.anInt953);
					local22 = local24 - local26;
					local148 = local22;
					if (local22 < 0) {
						local148 = local22 + Static54.anInt953;
					}
					if (local148 > Static54.anInt953) {
						local148 -= Static54.anInt953;
					}
					@Pc(475) int[][] local475 = local99;
					local99 = local95;
					while (true) {
						@Pc(481) int[] local481 = local95[local30];
						if (local148 >= local481[0] && local481[1] >= local148) {
							local95 = local475;
							break;
						}
						local30++;
						if (local30 >= local34) {
							local30 = 0;
						}
					}
				} else {
					local365 = local95[local52++];
					local365[0] = local28;
					local365[2] = local125 + local156;
					local365[1] = local129;
					this.method1727(local115, local24 + local28, local106, local156, local20, local125);
					local28 = local129;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
	}
}
