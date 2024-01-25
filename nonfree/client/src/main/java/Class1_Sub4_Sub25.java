import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class1_Sub4_Sub25 extends Class1_Sub4 {

	@OriginalMember(owner = "client!o", name = "S", descriptor = "I")
	private int anInt4904;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "I")
	private int anInt4896 = 1024;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "I")
	private int anInt4893 = 819;

	@OriginalMember(owner = "client!o", name = "G", descriptor = "I")
	private int anInt4894 = 1024;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "I")
	private int anInt4892 = 1024;

	@OriginalMember(owner = "client!o", name = "P", descriptor = "I")
	private int anInt4901 = 0;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	private int anInt4899 = 409;

	@OriginalMember(owner = "client!o", name = "T", descriptor = "I")
	private int anInt4905 = 0;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "I")
	private int anInt4891 = 1024;

	@OriginalMember(owner = "client!o", name = "W", descriptor = "I")
	private int anInt4907 = 2048;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILjava/util/Random;III[[I)V")
	private void method4055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(22) int local22 = this.anInt4892 > 0 ? 4096 - Static300.method5748(arg2, this.anInt4892) : 4096;
		@Pc(38) int local38 = this.anInt4894 * this.anInt4904 >> 12;
		@Pc(50) int local50 = this.anInt4904 - (local38 > 0 ? Static300.method5748(arg2, local38) : 0);
		if (arg0 >= Static66.anInt1511) {
			arg0 -= Static66.anInt1511;
		}
		@Pc(78) int local78;
		@Pc(105) int local105;
		if (local50 <= 0) {
			if (Static66.anInt1511 >= arg0 + arg3) {
				for (local78 = 0; local78 < arg1; local78++) {
					Static468.method4333(arg5[local78 + arg4], arg0, arg3, local22);
				}
			} else {
				local78 = Static66.anInt1511 - arg0;
				for (local105 = 0; local105 < arg1; local105++) {
					@Pc(113) int[] local113 = arg5[local105 + arg4];
					Static468.method4333(local113, arg0, local78, local22);
					Static468.method4333(local113, 0, arg3 - local78, local22);
				}
			}
		} else if (arg1 > 0 && arg3 > 0) {
			local78 = arg3 / 2;
			local105 = arg1 / 2;
			@Pc(161) int local161 = local78 < local50 ? local78 : local50;
			@Pc(172) int local172 = local105 < local50 ? local105 : local50;
			@Pc(177) int local177 = arg0 + local161;
			@Pc(184) int local184 = arg3 - local161 * 2;
			for (@Pc(186) int local186 = 0; local186 < arg1; local186++) {
				@Pc(195) int[] local195 = arg5[local186 + arg4];
				@Pc(204) int local204;
				@Pc(212) int local212;
				@Pc(220) int local220;
				if (local186 < local172) {
					local204 = local22 * local186 / local172;
					if (this.anInt4901 == 0) {
						for (local212 = 0; local212 < local161; local212++) {
							local220 = local22 * local212 / local161;
							local195[Static393.anInt6315 & local212 + arg0] = local195[Static393.anInt6315 & arg3 + arg0 - local212 - 1] = local204 * local220 >> 12;
						}
					} else {
						for (local212 = 0; local212 < local161; local212++) {
							local220 = local22 * local212 / local161;
							local195[Static393.anInt6315 & local212 + arg0] = local195[arg0 + arg3 - local212 - 1 & Static393.anInt6315] = local204 > local220 ? local220 : local204;
						}
					}
					if (Static66.anInt1511 >= local177 + local184) {
						Static468.method4333(local195, local177, local184, local204);
					} else {
						local212 = Static66.anInt1511 - local177;
						Static468.method4333(local195, local177, local212, local204);
						Static468.method4333(local195, 0, local184 - local212, local204);
					}
				} else {
					local204 = arg1 - local186 - 1;
					if (local204 < local172) {
						local212 = local204 * local22 / local172;
						@Pc(358) int local358;
						if (this.anInt4901 == 0) {
							for (local220 = 0; local220 < local161; local220++) {
								local358 = local22 * local220 / local161;
								local195[arg0 + local220 & Static393.anInt6315] = local195[Static393.anInt6315 & arg0 + arg3 - local220 - 1] = local212 * local358 >> 12;
							}
						} else {
							for (local220 = 0; local220 < local161; local220++) {
								local358 = local220 * local22 / local161;
								local195[local220 + arg0 & Static393.anInt6315] = local195[arg3 + arg0 - local220 - 1 & Static393.anInt6315] = local212 > local358 ? local358 : local212;
							}
						}
						if (Static66.anInt1511 >= local177 + local184) {
							Static468.method4333(local195, local177, local184, local212);
						} else {
							local220 = Static66.anInt1511 - local177;
							Static468.method4333(local195, local177, local220, local212);
							Static468.method4333(local195, 0, local184 - local220, local212);
						}
					} else {
						for (local212 = 0; local212 < local161; local212++) {
							local195[Static393.anInt6315 & local212 + arg0] = local195[Static393.anInt6315 & arg0 + arg3 - local212 - 1] = local22 * local212 / local161;
						}
						if (local184 + local177 > Static66.anInt1511) {
							local220 = Static66.anInt1511 - local177;
							Static468.method4333(local195, local177, local220, local22);
							Static468.method4333(local195, 0, local184 - local220, local22);
						} else {
							Static468.method4333(local195, local177, local184, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt4905 = arg1.method5366();
		} else if (arg0 == 1) {
			this.anInt4896 = arg1.method5362();
		} else if (arg0 == 2) {
			this.anInt4907 = arg1.method5362();
		} else if (arg0 == 3) {
			this.anInt4899 = arg1.method5362();
		} else if (arg0 == 4) {
			this.anInt4893 = arg1.method5362();
		} else if (arg0 == 5) {
			this.anInt4891 = arg1.method5362();
		} else if (arg0 == 6) {
			this.anInt4901 = arg1.method5366();
		} else if (arg0 == 7) {
			this.anInt4894 = arg1.method5362();
		} else if (arg0 == 8) {
			this.anInt4892 = arg1.method5362();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass15_41.method508(arg0);
		if (!super.aClass15_41.aBoolean17) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass15_41.method507();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = Static66.anInt1511 * this.anInt4896 >> 12;
		@Pc(58) int local58 = Static66.anInt1511 * this.anInt4907 >> 12;
		@Pc(65) int local65 = Static61.anInt1456 * this.anInt4899 >> 12;
		@Pc(72) int local72 = this.anInt4893 * Static61.anInt1456 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt4904 = this.anInt4891 * (Static66.anInt1511 / 8) >> 12;
		@Pc(97) int local97 = Static66.anInt1511 / local51 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt4905);
		while (true) {
			while (true) {
				@Pc(124) int local124 = local51 + Static300.method5748(local112, local58 - local51);
				@Pc(136) int local136 = Static300.method5748(local112, local72 - local65) + local65;
				@Pc(140) int local140 = local34 + local124;
				if (Static66.anInt1511 < local140) {
					local140 = Static66.anInt1511;
					local124 = Static66.anInt1511 - local34;
				}
				@Pc(154) int local154;
				@Pc(164) int local164;
				if (local40) {
					local154 = 0;
				} else {
					@Pc(158) int local158 = local36;
					@Pc(162) int[] local162 = local105[local36];
					local164 = 0;
					@Pc(168) int local168 = local140 + local28;
					if (local168 < 0) {
						local168 += Static66.anInt1511;
					}
					if (local168 > Static66.anInt1511) {
						local168 -= Static66.anInt1511;
					}
					local154 = local162[2];
					while (true) {
						@Pc(193) int[] local193 = local105[local158];
						if (local168 >= local193[0] && local168 <= local193[1]) {
							if (local158 != local36) {
								@Pc(231) int local231 = local34 + local28;
								if (local231 < 0) {
									local231 += Static66.anInt1511;
								}
								if (local231 > Static66.anInt1511) {
									local231 -= Static66.anInt1511;
								}
								for (@Pc(246) int local246 = 1; local246 <= local164; local246++) {
									@Pc(257) int[] local257 = local105[(local36 + local246) % local42];
									local154 = Math.max(local154, local257[2]);
								}
								for (@Pc(269) int local269 = 0; local269 <= local164; local269++) {
									@Pc(280) int[] local280 = local105[(local36 + local269) % local42];
									@Pc(284) int local284 = local280[2];
									if (local284 != local154) {
										@Pc(291) int local291 = local280[0];
										@Pc(295) int local295 = local280[1];
										@Pc(311) int local311;
										@Pc(313) int local313;
										if (local168 > local231) {
											local311 = Math.max(local231, local291);
											local313 = Math.min(local168, local295);
										} else if (local291 == 0) {
											local311 = 0;
											local313 = Math.min(local168, local295);
										} else {
											local311 = Math.max(local231, local291);
											local313 = Static66.anInt1511;
										}
										this.method4055(local311 + local32, local154 + -local284, local112, local313 - local311, local284, local26);
									}
								}
							}
							local36 = local158;
							break;
						}
						local158++;
						if (local42 <= local158) {
							local158 = 0;
						}
						local164++;
					}
				}
				if (Static61.anInt1456 >= local136 + local154) {
					local38 = false;
				} else {
					local136 = Static61.anInt1456 - local154;
				}
				@Pc(404) int[] local404;
				if (Static66.anInt1511 == local140) {
					this.method4055(local34 + local30, local136, local112, local124, local154, local26);
					if (local38) {
						return local17;
					}
					local38 = true;
					local404 = local101[local44++];
					local404[2] = local136 + local154;
					local404[0] = local34;
					local404[1] = local140;
					@Pc(420) int[][] local420 = local105;
					local105 = local101;
					local101 = local420;
					local42 = local44;
					local44 = 0;
					local32 = local30;
					local30 = Static300.method5748(local112, Static66.anInt1511);
					local34 = 0;
					local28 = local30 - local32;
					local164 = local28;
					if (local28 < 0) {
						local164 = local28 + Static66.anInt1511;
					}
					local36 = 0;
					if (Static66.anInt1511 < local164) {
						local164 -= Static66.anInt1511;
					}
					local40 = false;
					while (true) {
						@Pc(468) int[] local468 = local105[local36];
						if (local164 >= local468[0] && local468[1] >= local164) {
							break;
						}
						local36++;
						if (local42 <= local36) {
							local36 = 0;
						}
					}
				} else {
					local404 = local101[local44++];
					local404[1] = local140;
					local404[0] = local34;
					local404[2] = local136 + local154;
					this.method4055(local34 + local30, local136, local112, local124, local154, local26);
					local34 = local140;
				}
			}
		}
	}
}
