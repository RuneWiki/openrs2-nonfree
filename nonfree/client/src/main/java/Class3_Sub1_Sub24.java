import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class3_Sub1_Sub24 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
	private int anInt3569;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
	private int anInt3568 = 819;

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
	private int anInt3566 = 0;

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
	private int anInt3573 = 1024;

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
	private int anInt3576 = 1024;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
	private int anInt3577 = 1024;

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
	private int anInt3575 = 0;

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
	private int anInt3578 = 409;

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
	private int anInt3565 = 2048;

	@OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
	private int anInt3571 = 1024;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3575 = arg0.method2739();
		} else if (arg1 == 1) {
			this.anInt3573 = arg0.method2767();
		} else if (arg1 == 2) {
			this.anInt3565 = arg0.method2767();
		} else if (arg1 == 3) {
			this.anInt3578 = arg0.method2767();
		} else if (arg1 == 4) {
			this.anInt3568 = arg0.method2767();
		} else if (arg1 == 5) {
			this.anInt3577 = arg0.method2767();
		} else if (arg1 == 6) {
			this.anInt3566 = arg0.method2739();
		} else if (arg1 == 7) {
			this.anInt3571 = arg0.method2767();
		} else if (arg1 == 8) {
			this.anInt3576 = arg0.method2767();
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass4_41.method61(arg0);
		if (!super.aClass4_41.aBoolean7) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass4_41.method60();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt3573 * Static238.anInt4221 >> 12;
		@Pc(58) int local58 = Static238.anInt4221 * this.anInt3565 >> 12;
		@Pc(65) int local65 = this.anInt3578 * Static220.anInt3914 >> 12;
		@Pc(72) int local72 = Static220.anInt3914 * this.anInt3568 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt3569 = Static238.anInt4221 / 8 * this.anInt3577 >> 12;
		@Pc(95) int local95 = Static238.anInt4221 / local51 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt3575);
		while (true) {
			while (true) {
				@Pc(120) int local120 = local51 + Static213.method3319(local110, local58 - local51);
				@Pc(130) int local130 = Static213.method3319(local110, local72 - local65) + local65;
				@Pc(134) int local134 = local120 + local34;
				if (Static238.anInt4221 < local134) {
					local120 = Static238.anInt4221 - local34;
					local134 = Static238.anInt4221;
				}
				@Pc(178) int local178;
				@Pc(154) int local154;
				if (local40) {
					local178 = 0;
				} else {
					@Pc(148) int local148 = local36;
					@Pc(152) int[] local152 = local103[local36];
					local154 = 0;
					@Pc(158) int local158 = local28 + local134;
					if (local158 < 0) {
						local158 += Static238.anInt4221;
					}
					if (Static238.anInt4221 < local158) {
						local158 -= Static238.anInt4221;
					}
					local178 = local152[2];
					while (true) {
						@Pc(182) int[] local182 = local103[local148];
						if (local158 >= local182[0] && local182[1] >= local158) {
							if (local148 != local36) {
								@Pc(224) int local224 = local28 + local34;
								if (local224 < 0) {
									local224 += Static238.anInt4221;
								}
								if (local224 > Static238.anInt4221) {
									local224 -= Static238.anInt4221;
								}
								for (@Pc(246) int local246 = 1; local246 <= local154; local246++) {
									@Pc(256) int[] local256 = local103[(local246 + local36) % local42];
									local178 = Math.max(local178, local256[2]);
								}
								for (@Pc(268) int local268 = 0; local268 <= local154; local268++) {
									@Pc(278) int[] local278 = local103[(local268 + local36) % local42];
									@Pc(282) int local282 = local278[2];
									if (local178 != local282) {
										@Pc(289) int local289 = local278[0];
										@Pc(293) int local293 = local278[1];
										@Pc(303) int local303;
										@Pc(307) int local307;
										if (local158 > local224) {
											local303 = Math.max(local224, local289);
											local307 = Math.min(local158, local293);
										} else if (local289 == 0) {
											local303 = 0;
											local307 = Math.min(local158, local293);
										} else {
											local303 = Math.max(local224, local289);
											local307 = Static238.anInt4221;
										}
										this.method3129(local307 - local303, local282, local178 - local282, local32 + local303, local26, local110);
									}
								}
							}
							local36 = local148;
							break;
						}
						local154++;
						@Pc(204) int local204 = ~local42;
						local148++;
						if (local204 >= ~local148) {
							local148 = 0;
						}
					}
				}
				if (local178 + local130 <= Static220.anInt3914) {
					local38 = false;
				} else {
					local130 = Static220.anInt3914 - local178;
				}
				@Pc(401) int[] local401;
				if (local134 == Static238.anInt4221) {
					this.method3129(local120, local178, local130, local34 + local30, local26, local110);
					if (local38) {
						return local17;
					}
					local38 = true;
					local401 = local99[local44++];
					local401[2] = local178 + local130;
					local401[0] = local34;
					local401[1] = local134;
					@Pc(417) int[][] local417 = local103;
					local103 = local99;
					local42 = local44;
					local99 = local417;
					local32 = local30;
					local44 = 0;
					local30 = Static213.method3319(local110, Static238.anInt4221);
					local34 = 0;
					local28 = local30 - local32;
					local154 = local28;
					if (local28 < 0) {
						local154 = local28 + Static238.anInt4221;
					}
					if (Static238.anInt4221 < local154) {
						local154 -= Static238.anInt4221;
					}
					local36 = 0;
					local40 = false;
					while (true) {
						@Pc(466) int[] local466 = local103[local36];
						if (local154 >= local466[0] && local154 <= local466[1]) {
							break;
						}
						local36++;
						if (local42 <= local36) {
							local36 = 0;
						}
					}
				} else {
					local401 = local99[local44++];
					local401[2] = local130 + local178;
					local401[0] = local34;
					local401[1] = local134;
					this.method3129(local120, local178, local130, local34 + local30, local26, local110);
					local34 = local134;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII[[IILjava/util/Random;)V")
	private void method3129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(6) Random arg5) {
		@Pc(27) int local27 = this.anInt3576 <= 0 ? 4096 : 4096 - Static213.method3319(arg5, this.anInt3576);
		@Pc(35) int local35 = this.anInt3569 * this.anInt3571 >> 12;
		@Pc(51) int local51 = this.anInt3569 - (local35 <= 0 ? 0 : Static213.method3319(arg5, local35));
		if (arg3 >= Static238.anInt4221) {
			arg3 -= Static238.anInt4221;
		}
		@Pc(77) int local77;
		@Pc(79) int local79;
		if (local51 <= 0) {
			if (Static238.anInt4221 < arg3 + arg0) {
				local77 = Static238.anInt4221 - arg3;
				for (local79 = 0; local79 < arg2; local79++) {
					@Pc(87) int[] local87 = arg4[local79 + arg1];
					Static400.method1875(local87, arg3, local77, local27);
					Static400.method1875(local87, 0, arg0 - local77, local27);
				}
			} else {
				for (local77 = 0; local77 < arg2; local77++) {
					Static400.method1875(arg4[arg1 + local77], arg3, arg0, local27);
				}
			}
		} else if (arg2 > 0 && arg0 > 0) {
			local77 = arg0 / 2;
			local79 = arg2 / 2;
			@Pc(157) int local157 = local51 > local77 ? local77 : local51;
			@Pc(164) int local164 = local51 <= local79 ? local51 : local79;
			@Pc(168) int local168 = arg3 + local157;
			@Pc(175) int local175 = arg0 - local157 * 2;
			for (@Pc(177) int local177 = 0; local177 < arg2; local177++) {
				@Pc(186) int[] local186 = arg4[local177 + arg1];
				@Pc(199) int local199;
				@Pc(207) int local207;
				@Pc(215) int local215;
				if (local164 > local177) {
					local199 = local27 * local177 / local164;
					if (this.anInt3566 == 0) {
						for (local207 = 0; local207 < local157; local207++) {
							local215 = local207 * local27 / local157;
							local186[arg3 + local207 & Static171.anInt3000] = local186[arg0 + arg3 - local207 - 1 & Static171.anInt3000] = local215 * local199 >> 12;
						}
					} else {
						for (local207 = 0; local207 < local157; local207++) {
							local215 = local27 * local207 / local157;
							local186[Static171.anInt3000 & local207 + arg3] = local186[arg0 + arg3 - local207 - 1 & Static171.anInt3000] = local215 < local199 ? local215 : local199;
						}
					}
					if (local175 + local168 <= Static238.anInt4221) {
						Static400.method1875(local186, local168, local175, local199);
					} else {
						local207 = Static238.anInt4221 - local168;
						Static400.method1875(local186, local168, local207, local199);
						Static400.method1875(local186, 0, local175 - local207, local199);
					}
				} else {
					local199 = arg2 - local177 - 1;
					if (local164 > local199) {
						local207 = local27 * local199 / local164;
						@Pc(357) int local357;
						if (this.anInt3566 == 0) {
							for (local215 = 0; local215 < local157; local215++) {
								local357 = local215 * local27 / local157;
								local186[Static171.anInt3000 & arg3 + local215] = local186[arg0 + arg3 - local215 - 1 & Static171.anInt3000] = local357 * local207 >> 12;
							}
						} else {
							for (local215 = 0; local215 < local157; local215++) {
								local357 = local27 * local215 / local157;
								local186[local215 + arg3 & Static171.anInt3000] = local186[Static171.anInt3000 & arg0 + arg3 - local215 - 1] = local207 <= local357 ? local207 : local357;
							}
						}
						if (Static238.anInt4221 >= local168 + local175) {
							Static400.method1875(local186, local168, local175, local207);
						} else {
							local215 = Static238.anInt4221 - local168;
							Static400.method1875(local186, local168, local215, local207);
							Static400.method1875(local186, 0, local175 - local215, local207);
						}
					} else {
						for (local207 = 0; local207 < local157; local207++) {
							local186[Static171.anInt3000 & local207 + arg3] = local186[Static171.anInt3000 & arg3 + arg0 - local207 - 1] = local207 * local27 / local157;
						}
						if (Static238.anInt4221 >= local175 + local168) {
							Static400.method1875(local186, local168, local175, local27);
						} else {
							local215 = Static238.anInt4221 - local168;
							Static400.method1875(local186, local168, local215, local27);
							Static400.method1875(local186, 0, local175 - local215, local27);
						}
					}
				}
			}
		}
	}
}
