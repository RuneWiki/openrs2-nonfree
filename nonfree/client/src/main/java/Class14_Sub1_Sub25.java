import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nja")
public final class Class14_Sub1_Sub25 extends Class14_Sub1 {

	@OriginalMember(owner = "client!nja", name = "W", descriptor = "I")
	private int anInt7375;

	@OriginalMember(owner = "client!nja", name = "J", descriptor = "I")
	private int anInt7365 = 0;

	@OriginalMember(owner = "client!nja", name = "O", descriptor = "I")
	private int anInt7369 = 1024;

	@OriginalMember(owner = "client!nja", name = "F", descriptor = "I")
	private int anInt7363 = 2048;

	@OriginalMember(owner = "client!nja", name = "E", descriptor = "I")
	private int anInt7362 = 1024;

	@OriginalMember(owner = "client!nja", name = "S", descriptor = "I")
	private int anInt7372 = 1024;

	@OriginalMember(owner = "client!nja", name = "T", descriptor = "I")
	private int anInt7373 = 0;

	@OriginalMember(owner = "client!nja", name = "R", descriptor = "I")
	private int anInt7371 = 1024;

	@OriginalMember(owner = "client!nja", name = "V", descriptor = "I")
	private int anInt7374 = 819;

	@OriginalMember(owner = "client!nja", name = "Q", descriptor = "I")
	private int anInt7370 = 409;

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(B[[ILjava/util/Random;IIII)V")
	private void method5981(@OriginalArg(1) int[][] arg0, @OriginalArg(2) Random arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(25) int local25 = this.anInt7371 > 0 ? 4096 - Static251.method3688(arg1, this.anInt7371) : 4096;
		@Pc(33) int local33 = this.anInt7375 * this.anInt7372 >> 12;
		@Pc(48) int local48 = this.anInt7375 - (local33 <= 0 ? 0 : Static251.method3688(arg1, local33));
		if (arg4 >= Static371.anInt6835) {
			arg4 -= Static371.anInt6835;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		if (local48 > 0) {
			if (arg5 > 0 && arg2 > 0) {
				local75 = arg2 / 2;
				local79 = arg5 / 2;
				@Pc(86) int local86 = local75 < local48 ? local75 : local48;
				@Pc(97) int local97 = local48 > local79 ? local79 : local48;
				@Pc(101) int local101 = local86 + arg4;
				@Pc(108) int local108 = arg2 - local86 * 2;
				for (@Pc(110) int local110 = 0; local110 < arg5; local110++) {
					@Pc(118) int[] local118 = arg0[arg3 + local110];
					@Pc(127) int local127;
					@Pc(132) int local132;
					@Pc(140) int local140;
					if (local110 < local97) {
						local127 = local25 * local110 / local97;
						if (this.anInt7365 == 0) {
							for (local132 = 0; local132 < local86; local132++) {
								local140 = local132 * local25 / local86;
								local118[local132 + arg4 & Static192.anInt3590] = local118[Static192.anInt3590 & arg2 + arg4 - local132 - 1] = local127 * local140 >> 12;
							}
						} else {
							for (local132 = 0; local132 < local86; local132++) {
								local140 = local132 * local25 / local86;
								local118[arg4 + local132 & Static192.anInt3590] = local118[arg2 + arg4 - local132 - 1 & Static192.anInt3590] = local140 < local127 ? local140 : local127;
							}
						}
						if (local108 + local101 <= Static371.anInt6835) {
							Static681.method2479(local118, local101, local108, local127);
						} else {
							local132 = Static371.anInt6835 - local101;
							Static681.method2479(local118, local101, local132, local127);
							Static681.method2479(local118, 0, local108 - local132, local127);
						}
					} else {
						local127 = arg5 - local110 - 1;
						if (local127 < local97) {
							local132 = local25 * local127 / local97;
							@Pc(279) int local279;
							if (this.anInt7365 == 0) {
								for (local140 = 0; local140 < local86; local140++) {
									local279 = local25 * local140 / local86;
									local118[arg4 + local140 & Static192.anInt3590] = local118[arg4 + arg2 - local140 - 1 & Static192.anInt3590] = local279 * local132 >> 12;
								}
							} else {
								for (local140 = 0; local140 < local86; local140++) {
									local279 = local140 * local25 / local86;
									local118[arg4 + local140 & Static192.anInt3590] = local118[arg2 + arg4 - local140 - 1 & Static192.anInt3590] = local279 < local132 ? local279 : local132;
								}
							}
							if (local108 + local101 <= Static371.anInt6835) {
								Static681.method2479(local118, local101, local108, local132);
							} else {
								local140 = Static371.anInt6835 - local101;
								Static681.method2479(local118, local101, local140, local132);
								Static681.method2479(local118, 0, local108 - local140, local132);
							}
						} else {
							for (local132 = 0; local132 < local86; local132++) {
								local118[arg4 + local132 & Static192.anInt3590] = local118[Static192.anInt3590 & arg2 + arg4 - local132 - 1] = local25 * local132 / local86;
							}
							if (local108 + local101 > Static371.anInt6835) {
								local140 = Static371.anInt6835 - local101;
								Static681.method2479(local118, local101, local140, local25);
								Static681.method2479(local118, 0, local108 - local140, local25);
							} else {
								Static681.method2479(local118, local101, local108, local25);
							}
						}
					}
				}
			}
		} else if (arg2 + arg4 <= Static371.anInt6835) {
			for (local75 = 0; local75 < arg5; local75++) {
				Static681.method2479(arg0[arg3 + local75], arg4, arg2, local25);
			}
		} else {
			local75 = Static371.anInt6835 - arg4;
			for (local79 = 0; local79 < arg5; local79++) {
				@Pc(507) int[] local507 = arg0[local79 + arg3];
				Static681.method2479(local507, arg4, local75, local25);
				Static681.method2479(local507, 0, arg2 - local75, local25);
			}
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass211_41.method5137(arg0);
		if (!super.aClass211_41.aBoolean432) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass211_41.method5139();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt7369 * Static371.anInt6835 >> 12;
		@Pc(58) int local58 = Static371.anInt6835 * this.anInt7363 >> 12;
		@Pc(65) int local65 = Static535.anInt9239 * this.anInt7370 >> 12;
		@Pc(72) int local72 = this.anInt7374 * Static535.anInt9239 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt7375 = this.anInt7362 * (Static371.anInt6835 / 8) >> 12;
		@Pc(95) int local95 = Static371.anInt6835 / local51 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt7373);
		while (true) {
			while (true) {
				@Pc(120) int local120 = Static251.method3688(local110, local58 - local51) + local51;
				@Pc(130) int local130 = local65 + Static251.method3688(local110, local72 - local65);
				@Pc(135) int local135 = local34 + local120;
				if (Static371.anInt6835 < local135) {
					local135 = Static371.anInt6835;
					local120 = Static371.anInt6835 - local34;
				}
				@Pc(148) int local148;
				@Pc(158) int local158;
				if (local40) {
					local148 = 0;
				} else {
					@Pc(152) int local152 = local36;
					@Pc(156) int[] local156 = local103[local36];
					local158 = 0;
					@Pc(162) int local162 = local28 + local135;
					if (local162 < 0) {
						local162 += Static371.anInt6835;
					}
					if (Static371.anInt6835 < local162) {
						local162 -= Static371.anInt6835;
					}
					local148 = local156[2];
					while (true) {
						@Pc(190) int[] local190 = local103[local152];
						if (local190[0] <= local162 && local162 <= local190[1]) {
							if (local152 != local36) {
								@Pc(224) int local224 = local34 + local28;
								if (local224 < 0) {
									local224 += Static371.anInt6835;
								}
								if (Static371.anInt6835 < local224) {
									local224 -= Static371.anInt6835;
								}
								for (@Pc(242) int local242 = 1; local242 <= local158; local242++) {
									@Pc(252) int[] local252 = local103[(local242 + local36) % local42];
									local148 = Math.max(local148, local252[2]);
								}
								for (@Pc(264) int local264 = 0; local264 <= local158; local264++) {
									@Pc(274) int[] local274 = local103[(local36 + local264) % local42];
									@Pc(278) int local278 = local274[2];
									if (local148 != local278) {
										@Pc(289) int local289 = local274[0];
										@Pc(293) int local293 = local274[1];
										@Pc(308) int local308;
										@Pc(306) int local306;
										if (local162 > local224) {
											local308 = Math.max(local224, local289);
											local306 = Math.min(local162, local293);
										} else if (local289 == 0) {
											local306 = Math.min(local162, local293);
											local308 = 0;
										} else {
											local308 = Math.max(local224, local289);
											local306 = Static371.anInt6835;
										}
										this.method5981(local26, local110, local306 - local308, local278, local308 + local32, local148 + -local278);
									}
								}
							}
							local36 = local152;
							break;
						}
						local152++;
						if (local152 >= local42) {
							local152 = 0;
						}
						local158++;
					}
				}
				if (Static535.anInt9239 >= local148 + local130) {
					local38 = false;
				} else {
					local130 = Static535.anInt9239 - local148;
				}
				@Pc(390) int[] local390;
				if (local135 == Static371.anInt6835) {
					this.method5981(local26, local110, local120, local148, local30 + local34, local130);
					if (local38) {
						return local17;
					}
					local38 = true;
					local390 = local99[local44++];
					local390[0] = local34;
					local390[2] = local130 + local148;
					local390[1] = local135;
					@Pc(406) int[][] local406 = local103;
					local103 = local99;
					local99 = local406;
					local42 = local44;
					local32 = local30;
					local44 = 0;
					local30 = Static251.method3688(local110, Static371.anInt6835);
					local34 = 0;
					local28 = local30 - local32;
					local158 = local28;
					if (local28 < 0) {
						local158 = local28 + Static371.anInt6835;
					}
					local36 = 0;
					if (local158 > Static371.anInt6835) {
						local158 -= Static371.anInt6835;
					}
					local40 = false;
					while (true) {
						@Pc(455) int[] local455 = local103[local36];
						if (local158 >= local455[0] && local455[1] >= local158) {
							break;
						}
						local36++;
						if (local42 <= local36) {
							local36 = 0;
						}
					}
				} else {
					local390 = local99[local44++];
					local390[0] = local34;
					local390[2] = local148 + local130;
					local390[1] = local135;
					this.method5981(local26, local110, local120, local148, local34 + local30, local130);
					local34 = local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7373 = arg0.method5866();
		} else if (arg1 == 1) {
			this.anInt7369 = arg0.method5900();
		} else if (arg1 == 2) {
			this.anInt7363 = arg0.method5900();
		} else if (arg1 == 3) {
			this.anInt7370 = arg0.method5900();
		} else if (arg1 == 4) {
			this.anInt7374 = arg0.method5900();
		} else if (arg1 == 5) {
			this.anInt7362 = arg0.method5900();
		} else if (arg1 == 6) {
			this.anInt7365 = arg0.method5866();
		} else if (arg1 == 7) {
			this.anInt7372 = arg0.method5900();
		} else if (arg1 == 8) {
			this.anInt7371 = arg0.method5900();
		}
	}
}
