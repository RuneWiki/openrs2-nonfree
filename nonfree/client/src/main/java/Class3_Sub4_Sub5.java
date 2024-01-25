import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class3_Sub4_Sub5 extends Class3_Sub4 {

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
	private int anInt858 = 1024;

	@OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
	private int anInt857 = 1024;

	@OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
	private int anInt862 = 1024;

	@OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
	private int anInt867 = 1024;

	@OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
	private int anInt860 = 2048;

	@OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
	private int anInt866 = 0;

	@OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
	private int anInt863 = 819;

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
	private int anInt864 = 0;

	@OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
	private int anInt868 = 409;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI[[ILjava/util/Random;III)V")
	private void method913(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt857 > 0 ? 4096 - Static438.method2068(arg2, this.anInt857) : 4096;
		@Pc(27) int local27 = this.anInt862 * this.anInt854 >> 12;
		@Pc(42) int local42 = this.anInt854 - (local27 <= 0 ? 0 : Static438.method2068(arg2, local27));
		if (arg3 >= Static148.anInt2687) {
			arg3 -= Static148.anInt2687;
		}
		@Pc(70) int local70;
		@Pc(97) int local97;
		if (local42 <= 0) {
			if (arg0 + arg3 <= Static148.anInt2687) {
				for (local70 = 0; local70 < arg5; local70++) {
					Static466.method206(arg1[local70 + arg4], arg3, arg0, local19);
				}
			} else {
				local70 = Static148.anInt2687 - arg3;
				for (local97 = 0; local97 < arg5; local97++) {
					@Pc(105) int[] local105 = arg1[arg4 + local97];
					Static466.method206(local105, arg3, local70, local19);
					Static466.method206(local105, 0, arg0 - local70, local19);
				}
			}
		} else if (arg5 > 0 && arg0 > 0) {
			local70 = arg0 / 2;
			local97 = arg5 / 2;
			@Pc(145) int local145 = local70 >= local42 ? local42 : local70;
			@Pc(156) int local156 = local97 < local42 ? local97 : local42;
			@Pc(160) int local160 = arg3 + local145;
			@Pc(166) int local166 = arg0 - local145 * 2;
			for (@Pc(168) int local168 = 0; local168 < arg5; local168++) {
				@Pc(177) int[] local177 = arg1[local168 + arg4];
				@Pc(186) int local186;
				@Pc(191) int local191;
				@Pc(199) int local199;
				if (local156 > local168) {
					local186 = local19 * local168 / local156;
					if (this.anInt866 == 0) {
						for (local191 = 0; local191 < local145; local191++) {
							local199 = local191 * local19 / local145;
							local177[local191 + arg3 & Static225.anInt3793] = local177[arg0 + arg3 - local191 - 1 & Static225.anInt3793] = local199 * local186 >> 12;
						}
					} else {
						for (local191 = 0; local191 < local145; local191++) {
							local199 = local191 * local19 / local145;
							local177[local191 + arg3 & Static225.anInt3793] = local177[arg3 + arg0 - local191 - 1 & Static225.anInt3793] = local199 < local186 ? local199 : local186;
						}
					}
					if (Static148.anInt2687 < local160 + local166) {
						local191 = Static148.anInt2687 - local160;
						Static466.method206(local177, local160, local191, local186);
						Static466.method206(local177, 0, local166 - local191, local186);
					} else {
						Static466.method206(local177, local160, local166, local186);
					}
				} else {
					local186 = arg5 - local168 - 1;
					if (local186 < local156) {
						local191 = local19 * local186 / local156;
						@Pc(344) int local344;
						if (this.anInt866 == 0) {
							for (local199 = 0; local199 < local145; local199++) {
								local344 = local199 * local19 / local145;
								local177[Static225.anInt3793 & local199 + arg3] = local177[arg3 + arg0 - local199 - 1 & Static225.anInt3793] = local344 * local191 >> 12;
							}
						} else {
							for (local199 = 0; local199 < local145; local199++) {
								local344 = local199 * local19 / local145;
								local177[local199 + arg3 & Static225.anInt3793] = local177[Static225.anInt3793 & arg3 + arg0 - local199 - 1] = local191 > local344 ? local344 : local191;
							}
						}
						if (local160 + local166 <= Static148.anInt2687) {
							Static466.method206(local177, local160, local166, local191);
						} else {
							local199 = Static148.anInt2687 - local160;
							Static466.method206(local177, local160, local199, local191);
							Static466.method206(local177, 0, local166 - local199, local191);
						}
					} else {
						for (local191 = 0; local191 < local145; local191++) {
							local177[arg3 + local191 & Static225.anInt3793] = local177[arg3 + arg0 - local191 - 1 & Static225.anInt3793] = local191 * local19 / local145;
						}
						if (Static148.anInt2687 < local160 + local166) {
							local199 = Static148.anInt2687 - local160;
							Static466.method206(local177, local160, local199, local19);
							Static466.method206(local177, 0, local166 - local199, local19);
						} else {
							Static466.method206(local177, local160, local166, local19);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt864 = arg0.method4096();
		} else if (arg1 == 1) {
			this.anInt867 = arg0.method4083();
		} else if (arg1 == 2) {
			this.anInt860 = arg0.method4083();
		} else if (arg1 == 3) {
			this.anInt868 = arg0.method4083();
		} else if (arg1 == 4) {
			this.anInt863 = arg0.method4083();
		} else if (arg1 == 5) {
			this.anInt858 = arg0.method4083();
		} else if (arg1 == 6) {
			this.anInt866 = arg0.method4096();
		} else if (arg1 == 7) {
			this.anInt862 = arg0.method4083();
		} else if (arg1 == 8) {
			this.anInt857 = arg0.method4083();
		}
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (!super.aClass109_41.aBoolean250) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass109_41.method2832();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt867 * Static148.anInt2687 >> 12;
		@Pc(52) int local52 = Static148.anInt2687 * this.anInt860 >> 12;
		@Pc(59) int local59 = this.anInt868 * Static140.anInt2503 >> 12;
		@Pc(66) int local66 = this.anInt863 * Static140.anInt2503 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt854 = Static148.anInt2687 / 8 * this.anInt858 >> 12;
		@Pc(91) int local91 = Static148.anInt2687 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt864);
		while (true) {
			while (true) {
				@Pc(116) int local116 = local45 + Static438.method2068(local106, local52 - local45);
				@Pc(126) int local126 = Static438.method2068(local106, local66 - local59) + local59;
				@Pc(130) int local130 = local28 + local116;
				if (local130 > Static148.anInt2687) {
					local130 = Static148.anInt2687;
					local116 = Static148.anInt2687 - local28;
				}
				@Pc(144) int local144;
				@Pc(154) int local154;
				if (local34) {
					local144 = 0;
				} else {
					@Pc(148) int local148 = local30;
					@Pc(152) int[] local152 = local99[local30];
					local154 = 0;
					@Pc(158) int local158 = local22 + local130;
					if (local158 < 0) {
						local158 += Static148.anInt2687;
					}
					if (local158 > Static148.anInt2687) {
						local158 -= Static148.anInt2687;
					}
					local144 = local152[2];
					while (true) {
						@Pc(182) int[] local182 = local99[local148];
						if (local158 >= local182[0] && local182[1] >= local158) {
							if (local30 != local148) {
								@Pc(224) int local224 = local22 + local28;
								if (local224 < 0) {
									local224 += Static148.anInt2687;
								}
								if (Static148.anInt2687 < local224) {
									local224 -= Static148.anInt2687;
								}
								for (@Pc(242) int local242 = 1; local242 <= local154; local242++) {
									@Pc(252) int[] local252 = local99[(local30 + local242) % local36];
									local144 = Math.max(local144, local252[2]);
								}
								for (@Pc(268) int local268 = 0; local268 <= local154; local268++) {
									@Pc(278) int[] local278 = local99[(local30 + local268) % local36];
									@Pc(282) int local282 = local278[2];
									if (local282 != local144) {
										@Pc(289) int local289 = local278[0];
										@Pc(293) int local293 = local278[1];
										@Pc(304) int local304;
										@Pc(308) int local308;
										if (local224 < local158) {
											local304 = Math.max(local224, local289);
											local308 = Math.min(local158, local293);
										} else if (local289 == 0) {
											local304 = 0;
											local308 = Math.min(local158, local293);
										} else {
											local304 = Math.max(local224, local289);
											local308 = Static148.anInt2687;
										}
										this.method913(local308 - local304, local20, local106, local304 + local26, local282, local144 - local282);
									}
								}
							}
							local30 = local148;
							break;
						}
						local154++;
						local148++;
						if (local148 >= local36) {
							local148 = 0;
						}
					}
				}
				if (local144 + local126 <= Static140.anInt2503) {
					local32 = false;
				} else {
					local126 = Static140.anInt2503 - local144;
				}
				@Pc(396) int[] local396;
				if (local130 == Static148.anInt2687) {
					this.method913(local116, local20, local106, local28 + local24, local144, local126);
					if (local32) {
						return local11;
					}
					local32 = true;
					local396 = local95[local38++];
					local396[1] = local130;
					local396[2] = local126 + local144;
					local396[0] = local28;
					@Pc(412) int[][] local412 = local99;
					local99 = local95;
					local36 = local38;
					local95 = local412;
					local26 = local24;
					local38 = 0;
					local24 = Static438.method2068(local106, Static148.anInt2687);
					local22 = local24 - local26;
					local28 = 0;
					local154 = local22;
					if (local22 < 0) {
						local154 = local22 + Static148.anInt2687;
					}
					if (Static148.anInt2687 < local154) {
						local154 -= Static148.anInt2687;
					}
					local30 = 0;
					local34 = false;
					while (true) {
						@Pc(464) int[] local464 = local99[local30];
						if (local154 >= local464[0] && local154 <= local464[1]) {
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local396 = local95[local38++];
					local396[1] = local130;
					local396[0] = local28;
					local396[2] = local144 + local126;
					this.method913(local116, local20, local106, local24 + local28, local144, local126);
					local28 = local130;
				}
			}
		}
	}
}
