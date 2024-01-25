import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class3_Sub1_Sub21 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mfa", name = "I", descriptor = "I")
	private int anInt6731;

	@OriginalMember(owner = "client!mfa", name = "O", descriptor = "I")
	private int anInt6736 = 819;

	@OriginalMember(owner = "client!mfa", name = "P", descriptor = "I")
	private int anInt6737 = 0;

	@OriginalMember(owner = "client!mfa", name = "K", descriptor = "I")
	private int anInt6733 = 1024;

	@OriginalMember(owner = "client!mfa", name = "R", descriptor = "I")
	private int anInt6739 = 1024;

	@OriginalMember(owner = "client!mfa", name = "S", descriptor = "I")
	private int anInt6740 = 1024;

	@OriginalMember(owner = "client!mfa", name = "X", descriptor = "I")
	private int anInt6744 = 0;

	@OriginalMember(owner = "client!mfa", name = "N", descriptor = "I")
	private int anInt6735 = 1024;

	@OriginalMember(owner = "client!mfa", name = "J", descriptor = "I")
	private int anInt6732 = 409;

	@OriginalMember(owner = "client!mfa", name = "Z", descriptor = "I")
	private int anInt6745 = 2048;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (!super.aClass313_41.aBoolean787) {
			return local11;
		}
		@Pc(28) int[][] local28 = super.aClass313_41.method7615();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = this.anInt6739 * Static131.anInt2935 >> 12;
		@Pc(60) int local60 = this.anInt6745 * Static131.anInt2935 >> 12;
		@Pc(67) int local67 = this.anInt6732 * Static331.anInt6903 >> 12;
		@Pc(74) int local74 = this.anInt6736 * Static331.anInt6903 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt6731 = Static131.anInt2935 / 8 * this.anInt6733 >> 12;
		@Pc(97) int local97 = Static131.anInt2935 / local53 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt6744);
		while (true) {
			while (true) {
				@Pc(121) int local121 = Static137.method2798(local112, local60 - local53) + local53;
				@Pc(131) int local131 = Static137.method2798(local112, local74 - local67) + local67;
				@Pc(135) int local135 = local121 + local36;
				if (local135 > Static131.anInt2935) {
					local121 = Static131.anInt2935 - local36;
					local135 = Static131.anInt2935;
				}
				@Pc(210) int local210;
				@Pc(155) int local155;
				if (local42) {
					local210 = 0;
				} else {
					@Pc(149) int local149 = local38;
					@Pc(153) int[] local153 = local105[local38];
					local155 = 0;
					@Pc(159) int local159 = local135 + local30;
					if (local159 < 0) {
						local159 += Static131.anInt2935;
					}
					if (Static131.anInt2935 < local159) {
						local159 -= Static131.anInt2935;
					}
					while (true) {
						@Pc(179) int[] local179 = local105[local149];
						if (local179[0] <= local159 && local159 <= local179[1]) {
							local210 = local153[2];
							if (local38 != local149) {
								@Pc(221) int local221 = local36 + local30;
								if (local221 < 0) {
									local221 += Static131.anInt2935;
								}
								if (Static131.anInt2935 < local221) {
									local221 -= Static131.anInt2935;
								}
								for (@Pc(240) int local240 = 1; local240 <= local155; local240++) {
									@Pc(251) int[] local251 = local105[(local38 + local240) % local44];
									local210 = Math.max(local210, local251[2]);
								}
								for (@Pc(263) int local263 = 0; local263 <= local155; local263++) {
									@Pc(273) int[] local273 = local105[(local263 + local38) % local44];
									@Pc(277) int local277 = local273[2];
									if (local210 != local277) {
										@Pc(284) int local284 = local273[0];
										@Pc(288) int local288 = local273[1];
										@Pc(300) int local300;
										@Pc(302) int local302;
										if (local159 > local221) {
											local300 = Math.max(local221, local284);
											local302 = Math.min(local159, local288);
										} else if (local284 == 0) {
											local300 = 0;
											local302 = Math.min(local159, local288);
										} else {
											local300 = Math.max(local221, local284);
											local302 = Static131.anInt2935;
										}
										this.method5609(local302 - local300, local277, local34 + local300, -local277 + local210, local112, local28);
									}
								}
							}
							local38 = local149;
							break;
						}
						local155++;
						local149++;
						if (local149 >= local44) {
							local149 = 0;
						}
					}
				}
				if (Static331.anInt6903 < local131 + local210) {
					local131 = Static331.anInt6903 - local210;
				} else {
					local40 = false;
				}
				@Pc(377) int[] local377;
				if (Static131.anInt2935 == local135) {
					this.method5609(local121, local210, local36 + local32, local131, local112, local28);
					if (local40) {
						return local11;
					}
					local40 = true;
					local377 = local101[local46++];
					local377[0] = local36;
					local377[1] = local135;
					local377[2] = local131 + local210;
					@Pc(442) int[][] local442 = local105;
					local105 = local101;
					local44 = local46;
					local101 = local442;
					local34 = local32;
					local46 = 0;
					local32 = Static137.method2798(local112, Static131.anInt2935);
					local36 = 0;
					local30 = local32 - local34;
					local155 = local30;
					if (local30 < 0) {
						local155 = local30 + Static131.anInt2935;
					}
					if (local155 > Static131.anInt2935) {
						local155 -= Static131.anInt2935;
					}
					local38 = 0;
					while (true) {
						@Pc(489) int[] local489 = local105[local38];
						if (local155 >= local489[0] && local155 <= local489[1]) {
							local42 = false;
							break;
						}
						local38++;
						if (local38 >= local44) {
							local38 = 0;
						}
					}
				} else {
					local377 = local101[local46++];
					local377[1] = local135;
					local377[2] = local210 + local131;
					local377[0] = local36;
					this.method5609(local121, local210, local36 + local32, local131, local112, local28);
					local36 = local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIIIILjava/util/Random;[[I)V")
	private void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(22) int local22 = this.anInt6740 <= 0 ? 4096 : 4096 - Static137.method2798(arg4, this.anInt6740);
		@Pc(30) int local30 = this.anInt6735 * this.anInt6731 >> 12;
		@Pc(54) int local54 = this.anInt6731 - (local30 <= 0 ? 0 : Static137.method2798(arg4, local30));
		if (arg2 >= Static131.anInt2935) {
			arg2 -= Static131.anInt2935;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		if (local54 > 0) {
			if (arg3 > 0 && arg0 > 0) {
				local75 = arg0 / 2;
				local79 = arg3 / 2;
				@Pc(90) int local90 = local75 >= local54 ? local54 : local75;
				@Pc(101) int local101 = local54 > local79 ? local79 : local54;
				@Pc(105) int local105 = arg2 + local90;
				@Pc(112) int local112 = arg0 - local90 * 2;
				for (@Pc(114) int local114 = 0; local114 < arg3; local114++) {
					@Pc(122) int[] local122 = arg5[arg1 + local114];
					@Pc(135) int local135;
					@Pc(140) int local140;
					@Pc(148) int local148;
					if (local101 > local114) {
						local135 = local114 * local22 / local101;
						if (this.anInt6737 == 0) {
							for (local140 = 0; local140 < local90; local140++) {
								local148 = local140 * local22 / local90;
								local122[arg2 + local140 & Static251.anInt5425] = local122[Static251.anInt5425 & arg0 + arg2 - local140 - 1] = local148 * local135 >> 12;
							}
						} else {
							for (local140 = 0; local140 < local90; local140++) {
								local148 = local140 * local22 / local90;
								local122[arg2 + local140 & Static251.anInt5425] = local122[arg0 + arg2 - local140 - 1 & Static251.anInt5425] = local148 < local135 ? local148 : local135;
							}
						}
						if (local105 + local112 > Static131.anInt2935) {
							local140 = Static131.anInt2935 - local105;
							Static602.method4663(local122, local105, local140, local135);
							Static602.method4663(local122, 0, local112 - local140, local135);
						} else {
							Static602.method4663(local122, local105, local112, local135);
						}
					} else {
						local135 = arg3 - local114 - 1;
						if (local135 < local101) {
							local140 = local22 * local135 / local101;
							@Pc(285) int local285;
							if (this.anInt6737 == 0) {
								for (local148 = 0; local148 < local90; local148++) {
									local285 = local148 * local22 / local90;
									local122[Static251.anInt5425 & arg2 + local148] = local122[Static251.anInt5425 & arg2 + arg0 - local148 - 1] = local140 * local285 >> 12;
								}
							} else {
								for (local148 = 0; local148 < local90; local148++) {
									local285 = local148 * local22 / local90;
									local122[Static251.anInt5425 & arg2 + local148] = local122[arg2 + arg0 - local148 - 1 & Static251.anInt5425] = local140 <= local285 ? local140 : local285;
								}
							}
							if (local105 + local112 <= Static131.anInt2935) {
								Static602.method4663(local122, local105, local112, local140);
							} else {
								local148 = Static131.anInt2935 - local105;
								Static602.method4663(local122, local105, local148, local140);
								Static602.method4663(local122, 0, local112 - local148, local140);
							}
						} else {
							for (local140 = 0; local140 < local90; local140++) {
								local122[arg2 + local140 & Static251.anInt5425] = local122[arg2 + arg0 - local140 - 1 & Static251.anInt5425] = local22 * local140 / local90;
							}
							if (Static131.anInt2935 >= local105 + local112) {
								Static602.method4663(local122, local105, local112, local22);
							} else {
								local148 = Static131.anInt2935 - local105;
								Static602.method4663(local122, local105, local148, local22);
								Static602.method4663(local122, 0, local112 - local148, local22);
							}
						}
					}
				}
			}
		} else if (Static131.anInt2935 >= arg2 + arg0) {
			for (local75 = 0; local75 < arg3; local75++) {
				Static602.method4663(arg5[arg1 + local75], arg2, arg0, local22);
			}
		} else {
			local75 = Static131.anInt2935 - arg2;
			for (local79 = 0; local79 < arg3; local79++) {
				@Pc(519) int[] local519 = arg5[arg1 + local79];
				Static602.method4663(local519, arg2, local75, local22);
				Static602.method4663(local519, 0, arg0 - local75, local22);
			}
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6744 = arg1.method6538();
		} else if (arg0 == 1) {
			this.anInt6739 = arg1.method6535();
		} else if (arg0 == 2) {
			this.anInt6745 = arg1.method6535();
		} else if (arg0 == 3) {
			this.anInt6732 = arg1.method6535();
		} else if (arg0 == 4) {
			this.anInt6736 = arg1.method6535();
		} else if (arg0 == 5) {
			this.anInt6733 = arg1.method6535();
		} else if (arg0 == 6) {
			this.anInt6737 = arg1.method6538();
		} else if (arg0 == 7) {
			this.anInt6735 = arg1.method6535();
		} else if (arg0 == 8) {
			this.anInt6740 = arg1.method6535();
		}
	}
}
