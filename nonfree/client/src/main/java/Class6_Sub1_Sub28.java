import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class6_Sub1_Sub28 extends Class6_Sub1 {

	@OriginalMember(owner = "client!qda", name = "C", descriptor = "I")
	private int anInt8134;

	@OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
	private int anInt8137 = 1024;

	@OriginalMember(owner = "client!qda", name = "D", descriptor = "I")
	private int anInt8135 = 0;

	@OriginalMember(owner = "client!qda", name = "P", descriptor = "I")
	private int anInt8144 = 1024;

	@OriginalMember(owner = "client!qda", name = "S", descriptor = "I")
	private int anInt8147 = 1024;

	@OriginalMember(owner = "client!qda", name = "I", descriptor = "I")
	private int anInt8139 = 0;

	@OriginalMember(owner = "client!qda", name = "N", descriptor = "I")
	private int anInt8142 = 409;

	@OriginalMember(owner = "client!qda", name = "T", descriptor = "I")
	private int anInt8148 = 1024;

	@OriginalMember(owner = "client!qda", name = "V", descriptor = "I")
	private int anInt8150 = 2048;

	@OriginalMember(owner = "client!qda", name = "U", descriptor = "I")
	private int anInt8149 = 819;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8135 = arg0.method8374();
		} else if (arg1 == 1) {
			this.anInt8144 = arg0.method8363();
		} else if (arg1 == 2) {
			this.anInt8150 = arg0.method8363();
		} else if (arg1 == 3) {
			this.anInt8142 = arg0.method8363();
		} else if (arg1 == 4) {
			this.anInt8149 = arg0.method8363();
		} else if (arg1 == 5) {
			this.anInt8137 = arg0.method8363();
		} else if (arg1 == 6) {
			this.anInt8139 = arg0.method8374();
		} else if (arg1 == 7) {
			this.anInt8148 = arg0.method8363();
		} else if (arg1 == 8) {
			this.anInt8147 = arg0.method8363();
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (!super.aClass135_41.aBoolean210) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass135_41.method3063();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt8144 * Static479.anInt8231 >> 12;
		@Pc(52) int local52 = this.anInt8150 * Static479.anInt8231 >> 12;
		@Pc(59) int local59 = this.anInt8142 * Static434.anInt7425 >> 12;
		@Pc(66) int local66 = Static434.anInt7425 * this.anInt8149 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt8134 = Static479.anInt8231 / 8 * this.anInt8137 >> 12;
		@Pc(91) int local91 = Static479.anInt8231 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt8135);
		while (true) {
			while (true) {
				@Pc(117) int local117 = local45 + Static316.method4556(local106, local52 - local45);
				@Pc(126) int local126 = local59 + Static316.method4556(local106, local66 - local59);
				@Pc(130) int local130 = local117 + local28;
				if (Static479.anInt8231 < local130) {
					local130 = Static479.anInt8231;
					local117 = Static479.anInt8231 - local28;
				}
				@Pc(148) int local148;
				@Pc(158) int local158;
				if (local34) {
					local148 = 0;
				} else {
					@Pc(152) int local152 = local30;
					@Pc(156) int[] local156 = local99[local30];
					local158 = 0;
					@Pc(162) int local162 = local22 + local130;
					if (local162 < 0) {
						local162 += Static479.anInt8231;
					}
					if (local162 > Static479.anInt8231) {
						local162 -= Static479.anInt8231;
					}
					while (true) {
						@Pc(179) int[] local179 = local99[local152];
						if (local179[0] <= local162 && local179[1] >= local162) {
							local148 = local156[2];
							if (local152 != local30) {
								@Pc(221) int local221 = local22 + local28;
								if (local221 < 0) {
									local221 += Static479.anInt8231;
								}
								if (Static479.anInt8231 < local221) {
									local221 -= Static479.anInt8231;
								}
								for (@Pc(243) int local243 = 1; local243 <= local158; local243++) {
									@Pc(253) int[] local253 = local99[(local30 + local243) % local36];
									local148 = Math.max(local148, local253[2]);
								}
								for (@Pc(269) int local269 = 0; local269 <= local158; local269++) {
									@Pc(279) int[] local279 = local99[(local269 + local30) % local36];
									@Pc(283) int local283 = local279[2];
									if (local148 != local283) {
										@Pc(294) int local294 = local279[0];
										@Pc(298) int local298 = local279[1];
										@Pc(305) int local305;
										@Pc(309) int local309;
										if (local221 < local162) {
											local305 = Math.max(local221, local294);
											local309 = Math.min(local162, local298);
										} else if (local294 == 0) {
											local305 = 0;
											local309 = Math.min(local162, local298);
										} else {
											local305 = Math.max(local221, local294);
											local309 = Static479.anInt8231;
										}
										this.method6957(local305 + local26, local20, local148 - local283, -local305 + local309, local106, local283);
									}
								}
							}
							local30 = local152;
							break;
						}
						local158++;
						local152++;
						if (local152 >= local36) {
							local152 = 0;
						}
					}
				}
				if (local126 + local148 > Static434.anInt7425) {
					local126 = Static434.anInt7425 - local148;
				} else {
					local32 = false;
				}
				@Pc(372) int[] local372;
				if (Static479.anInt8231 == local130) {
					this.method6957(local24 + local28, local20, local126, local117, local106, local148);
					if (local32) {
						return local11;
					}
					local32 = true;
					local372 = local95[local38++];
					local372[0] = local28;
					local372[2] = local126 + local148;
					local372[1] = local130;
					@Pc(438) int[][] local438 = local99;
					local99 = local95;
					local95 = local438;
					local36 = local38;
					local26 = local24;
					local38 = 0;
					local24 = Static316.method4556(local106, Static479.anInt8231);
					local28 = 0;
					local22 = local24 - local26;
					local158 = local22;
					if (local22 < 0) {
						local158 = local22 + Static479.anInt8231;
					}
					local30 = 0;
					if (Static479.anInt8231 < local158) {
						local158 -= Static479.anInt8231;
					}
					while (true) {
						@Pc(485) int[] local485 = local99[local30];
						if (local158 >= local485[0] && local485[1] >= local158) {
							local34 = false;
							break;
						}
						@Pc(498) int local498 = ~local36;
						local30++;
						if (local498 >= ~local30) {
							local30 = 0;
						}
					}
				} else {
					local372 = local95[local38++];
					local372[2] = local148 + local126;
					local372[1] = local130;
					local372[0] = local28;
					this.method6957(local28 + local24, local20, local126, local117, local106, local148);
					local28 = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I[[IIIBLjava/util/Random;I)V")
	private void method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(28) int local28 = this.anInt8147 <= 0 ? 4096 : 4096 - Static316.method4556(arg4, this.anInt8147);
		@Pc(36) int local36 = this.anInt8148 * this.anInt8134 >> 12;
		@Pc(52) int local52 = this.anInt8134 - (local36 <= 0 ? 0 : Static316.method4556(arg4, local36));
		if (Static479.anInt8231 <= arg0) {
			arg0 -= Static479.anInt8231;
		}
		@Pc(80) int local80;
		@Pc(84) int local84;
		if (local52 > 0) {
			if (arg2 > 0 && arg3 > 0) {
				local80 = arg3 / 2;
				local84 = arg2 / 2;
				@Pc(95) int local95 = local52 <= local80 ? local52 : local80;
				@Pc(106) int local106 = local84 >= local52 ? local52 : local84;
				@Pc(110) int local110 = local95 + arg0;
				@Pc(116) int local116 = arg3 - local95 * 2;
				for (@Pc(118) int local118 = 0; local118 < arg2; local118++) {
					@Pc(127) int[] local127 = arg1[local118 + arg5];
					@Pc(140) int local140;
					@Pc(148) int local148;
					@Pc(156) int local156;
					if (local106 > local118) {
						local140 = local28 * local118 / local106;
						if (this.anInt8139 == 0) {
							for (local148 = 0; local148 < local95; local148++) {
								local156 = local148 * local28 / local95;
								local127[Static413.anInt7225 & local148 + arg0] = local127[arg3 + arg0 - local148 - 1 & Static413.anInt7225] = local156 * local140 >> 12;
							}
						} else {
							for (local148 = 0; local148 < local95; local148++) {
								local156 = local28 * local148 / local95;
								local127[local148 + arg0 & Static413.anInt7225] = local127[arg0 + arg3 - local148 - 1 & Static413.anInt7225] = local140 <= local156 ? local140 : local156;
							}
						}
						if (local110 + local116 <= Static479.anInt8231) {
							Static679.method1566(local127, local110, local116, local140);
						} else {
							local148 = Static479.anInt8231 - local110;
							Static679.method1566(local127, local110, local148, local140);
							Static679.method1566(local127, 0, local116 - local148, local140);
						}
					} else {
						local140 = arg2 - local118 - 1;
						if (local140 < local106) {
							local148 = local28 * local140 / local106;
							@Pc(295) int local295;
							if (this.anInt8139 == 0) {
								for (local156 = 0; local156 < local95; local156++) {
									local295 = local28 * local156 / local95;
									local127[Static413.anInt7225 & local156 + arg0] = local127[arg0 + arg3 - local156 - 1 & Static413.anInt7225] = local148 * local295 >> 12;
								}
							} else {
								for (local156 = 0; local156 < local95; local156++) {
									local295 = local28 * local156 / local95;
									local127[Static413.anInt7225 & local156 + arg0] = local127[Static413.anInt7225 & arg0 + arg3 - local156 - 1] = local295 >= local148 ? local148 : local295;
								}
							}
							if (local116 + local110 <= Static479.anInt8231) {
								Static679.method1566(local127, local110, local116, local148);
							} else {
								local156 = Static479.anInt8231 - local110;
								Static679.method1566(local127, local110, local156, local148);
								Static679.method1566(local127, 0, local116 - local156, local148);
							}
						} else {
							for (local148 = 0; local148 < local95; local148++) {
								local127[Static413.anInt7225 & arg0 + local148] = local127[Static413.anInt7225 & arg3 + arg0 - local148 - 1] = local148 * local28 / local95;
							}
							if (local116 + local110 > Static479.anInt8231) {
								local156 = Static479.anInt8231 - local110;
								Static679.method1566(local127, local110, local156, local28);
								Static679.method1566(local127, 0, local116 - local156, local28);
							} else {
								Static679.method1566(local127, local110, local116, local28);
							}
						}
					}
				}
			}
		} else if (arg3 + arg0 > Static479.anInt8231) {
			local80 = Static479.anInt8231 - arg0;
			for (local84 = 0; local84 < arg2; local84++) {
				@Pc(498) int[] local498 = arg1[arg5 + local84];
				Static679.method1566(local498, arg0, local80, local28);
				Static679.method1566(local498, 0, arg3 - local80, local28);
			}
		} else {
			for (local80 = 0; local80 < arg2; local80++) {
				Static679.method1566(arg1[local80 + arg5], arg0, arg3, local28);
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
	}
}
