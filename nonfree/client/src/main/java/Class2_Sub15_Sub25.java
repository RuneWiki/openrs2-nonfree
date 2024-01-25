import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qja")
public final class Class2_Sub15_Sub25 extends Class2_Sub15 {

	@OriginalMember(owner = "client!qja", name = "T", descriptor = "I")
	private int anInt8808;

	@OriginalMember(owner = "client!qja", name = "E", descriptor = "I")
	private int anInt8794 = 1024;

	@OriginalMember(owner = "client!qja", name = "L", descriptor = "I")
	private int anInt8801 = 1024;

	@OriginalMember(owner = "client!qja", name = "P", descriptor = "I")
	private int anInt8805 = 819;

	@OriginalMember(owner = "client!qja", name = "K", descriptor = "I")
	private int anInt8800 = 1024;

	@OriginalMember(owner = "client!qja", name = "N", descriptor = "I")
	private int anInt8803 = 0;

	@OriginalMember(owner = "client!qja", name = "R", descriptor = "I")
	private int anInt8807 = 409;

	@OriginalMember(owner = "client!qja", name = "Q", descriptor = "I")
	private int anInt8806 = 2048;

	@OriginalMember(owner = "client!qja", name = "U", descriptor = "I")
	private int anInt8809 = 0;

	@OriginalMember(owner = "client!qja", name = "O", descriptor = "I")
	private int anInt8804 = 1024;

	@OriginalMember(owner = "client!qja", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (!super.aClass338_41.aBoolean712) {
			return local11;
		}
		@Pc(26) int[][] local26 = super.aClass338_41.method8467();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt8801 * Static329.anInt6017 >> 12;
		@Pc(58) int local58 = Static329.anInt6017 * this.anInt8806 >> 12;
		@Pc(65) int local65 = this.anInt8807 * Static667.anInt10615 >> 12;
		@Pc(72) int local72 = this.anInt8805 * Static667.anInt10615 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt8808 = this.anInt8800 * (Static329.anInt6017 / 8) >> 12;
		@Pc(97) int local97 = Static329.anInt6017 / local51 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt8803);
		while (true) {
			while (true) {
				@Pc(122) int local122 = Static17.method7641(local58 - local51, local112) + local51;
				@Pc(133) int local133 = local65 + Static17.method7641(local72 - local65, local112);
				@Pc(137) int local137 = local34 + local122;
				if (Static329.anInt6017 < local137) {
					local137 = Static329.anInt6017;
					local122 = Static329.anInt6017 - local34;
				}
				@Pc(209) int local209;
				@Pc(161) int local161;
				if (local40) {
					local209 = 0;
				} else {
					@Pc(155) int local155 = local36;
					@Pc(159) int[] local159 = local105[local36];
					local161 = 0;
					@Pc(165) int local165 = local137 + local28;
					if (local165 < 0) {
						local165 += Static329.anInt6017;
					}
					if (local165 > Static329.anInt6017) {
						local165 -= Static329.anInt6017;
					}
					while (true) {
						@Pc(182) int[] local182 = local105[local155];
						if (local182[0] <= local165 && local165 <= local182[1]) {
							local209 = local159[2];
							if (local155 != local36) {
								@Pc(220) int local220 = local28 + local34;
								if (local220 < 0) {
									local220 += Static329.anInt6017;
								}
								if (Static329.anInt6017 < local220) {
									local220 -= Static329.anInt6017;
								}
								for (@Pc(238) int local238 = 1; local238 <= local161; local238++) {
									@Pc(248) int[] local248 = local105[(local36 + local238) % local42];
									local209 = Math.max(local209, local248[2]);
								}
								for (@Pc(260) int local260 = 0; local260 <= local161; local260++) {
									@Pc(271) int[] local271 = local105[(local36 + local260) % local42];
									@Pc(275) int local275 = local271[2];
									if (local209 != local275) {
										@Pc(282) int local282 = local271[0];
										@Pc(286) int local286 = local271[1];
										@Pc(293) int local293;
										@Pc(297) int local297;
										if (local220 < local165) {
											local293 = Math.max(local220, local282);
											local297 = Math.min(local165, local286);
										} else if (local282 == 0) {
											local293 = 0;
											local297 = Math.min(local165, local286);
										} else {
											local293 = Math.max(local220, local282);
											local297 = Static329.anInt6017;
										}
										this.method7783(local112, local209 - local275, local297 + -local293, local275, local26, local293 + local32);
									}
								}
							}
							local36 = local155;
							break;
						}
						local161++;
						local155++;
						if (local155 >= local42) {
							local155 = 0;
						}
					}
				}
				if (local133 + local209 > Static667.anInt10615) {
					local133 = Static667.anInt10615 - local209;
				} else {
					local38 = false;
				}
				@Pc(385) int[] local385;
				if (local137 == Static329.anInt6017) {
					this.method7783(local112, local133, local122, local209, local26, local30 + local34);
					if (local38) {
						return local11;
					}
					local38 = true;
					local385 = local101[local44++];
					local385[0] = local34;
					local385[1] = local137;
					local385[2] = local133 + local209;
					@Pc(401) int[][] local401 = local105;
					local105 = local101;
					local42 = local44;
					local101 = local401;
					local32 = local30;
					local44 = 0;
					local30 = Static17.method7641(Static329.anInt6017, local112);
					local28 = local30 - local32;
					local34 = 0;
					local161 = local28;
					if (local28 < 0) {
						local161 = local28 + Static329.anInt6017;
					}
					if (Static329.anInt6017 < local161) {
						local161 -= Static329.anInt6017;
					}
					local36 = 0;
					while (true) {
						@Pc(448) int[] local448 = local105[local36];
						if (local161 >= local448[0] && local448[1] >= local161) {
							local40 = false;
							break;
						}
						@Pc(465) int local465 = ~local42;
						local36++;
						if (local465 >= ~local36) {
							local36 = 0;
						}
					}
				} else {
					local385 = local101[local44++];
					local385[2] = local209 + local133;
					local385[1] = local137;
					local385[0] = local34;
					this.method7783(local112, local133, local122, local209, local26, local34 + local30);
					local34 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qja", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt8803 = arg1.method5203();
		} else if (arg0 == 1) {
			this.anInt8801 = arg1.method5211();
		} else if (arg0 == 2) {
			this.anInt8806 = arg1.method5211();
		} else if (arg0 == 3) {
			this.anInt8807 = arg1.method5211();
		} else if (arg0 == 4) {
			this.anInt8805 = arg1.method5211();
		} else if (arg0 == 5) {
			this.anInt8800 = arg1.method5211();
		} else if (arg0 == 6) {
			this.anInt8809 = arg1.method5203();
		} else if (arg0 == 7) {
			this.anInt8804 = arg1.method5211();
		} else if (arg0 == 8) {
			this.anInt8794 = arg1.method5211();
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Ljava/util/Random;IIII[[II)V")
	private void method7783(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt8794 > 0 ? 4096 - Static17.method7641(this.anInt8794, arg0) : 4096;
		@Pc(30) int local30 = this.anInt8804 * this.anInt8808 >> 12;
		@Pc(53) int local53 = this.anInt8808 - (local30 > 0 ? Static17.method7641(local30, arg0) : 0);
		if (Static329.anInt6017 <= arg5) {
			arg5 -= Static329.anInt6017;
		}
		@Pc(77) int local77;
		@Pc(81) int local81;
		if (local53 > 0) {
			if (arg1 > 0 && arg2 > 0) {
				local77 = arg2 / 2;
				local81 = arg1 / 2;
				@Pc(88) int local88 = local53 <= local77 ? local53 : local77;
				@Pc(95) int local95 = local53 <= local81 ? local53 : local81;
				@Pc(100) int local100 = arg5 + local88;
				@Pc(107) int local107 = arg2 - local88 * 2;
				for (@Pc(109) int local109 = 0; local109 < arg1; local109++) {
					@Pc(117) int[] local117 = arg4[arg3 + local109];
					@Pc(126) int local126;
					@Pc(134) int local134;
					@Pc(142) int local142;
					if (local95 > local109) {
						local126 = local22 * local109 / local95;
						if (this.anInt8809 == 0) {
							for (local134 = 0; local134 < local88; local134++) {
								local142 = local22 * local134 / local88;
								local117[local134 + arg5 & Static386.anInt7302] = local117[Static386.anInt7302 & arg5 + arg2 - local134 - 1] = local126 * local142 >> 12;
							}
						} else {
							for (local134 = 0; local134 < local88; local134++) {
								local142 = local22 * local134 / local88;
								local117[Static386.anInt7302 & arg5 + local134] = local117[Static386.anInt7302 & arg2 + arg5 - local134 - 1] = local126 > local142 ? local142 : local126;
							}
						}
						if (local100 + local107 > Static329.anInt6017) {
							local134 = Static329.anInt6017 - local100;
							Static679.method4130(local117, local100, local134, local126);
							Static679.method4130(local117, 0, local107 - local134, local126);
						} else {
							Static679.method4130(local117, local100, local107, local126);
						}
					} else {
						local126 = arg1 - local109 - 1;
						if (local126 < local95) {
							local134 = local22 * local126 / local95;
							@Pc(286) int local286;
							if (this.anInt8809 == 0) {
								for (local142 = 0; local142 < local88; local142++) {
									local286 = local22 * local142 / local88;
									local117[Static386.anInt7302 & local142 + arg5] = local117[Static386.anInt7302 & arg2 + arg5 - local142 - 1] = local134 * local286 >> 12;
								}
							} else {
								for (local142 = 0; local142 < local88; local142++) {
									local286 = local142 * local22 / local88;
									local117[Static386.anInt7302 & arg5 + local142] = local117[Static386.anInt7302 & arg5 + arg2 - local142 - 1] = local134 > local286 ? local286 : local134;
								}
							}
							if (local100 + local107 <= Static329.anInt6017) {
								Static679.method4130(local117, local100, local107, local134);
							} else {
								local142 = Static329.anInt6017 - local100;
								Static679.method4130(local117, local100, local142, local134);
								Static679.method4130(local117, 0, local107 - local142, local134);
							}
						} else {
							for (local134 = 0; local134 < local88; local134++) {
								local117[local134 + arg5 & Static386.anInt7302] = local117[Static386.anInt7302 & arg5 + arg2 - local134 - 1] = local134 * local22 / local88;
							}
							if (Static329.anInt6017 >= local100 + local107) {
								Static679.method4130(local117, local100, local107, local22);
							} else {
								local142 = Static329.anInt6017 - local100;
								Static679.method4130(local117, local100, local142, local22);
								Static679.method4130(local117, 0, local107 - local142, local22);
							}
						}
					}
				}
			}
		} else if (Static329.anInt6017 < arg5 + arg2) {
			local77 = Static329.anInt6017 - arg5;
			for (local81 = 0; local81 < arg1; local81++) {
				@Pc(494) int[] local494 = arg4[local81 + arg3];
				Static679.method4130(local494, arg5, local77, local22);
				Static679.method4130(local494, 0, arg2 - local77, local22);
			}
		} else {
			for (local77 = 0; local77 < arg1; local77++) {
				Static679.method4130(arg4[arg3 + local77], arg5, arg2, local22);
			}
		}
	}
}
