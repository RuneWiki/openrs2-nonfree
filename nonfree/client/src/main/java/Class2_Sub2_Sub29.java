import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class2_Sub2_Sub29 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sh", name = "ab", descriptor = "I")
	private int anInt6107;

	@OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
	private int anInt6097 = 2048;

	@OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
	private int anInt6099 = 0;

	@OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
	private int anInt6101 = 1024;

	@OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
	private int anInt6096 = 819;

	@OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
	private int anInt6103 = 1024;

	@OriginalMember(owner = "client!sh", name = "Y", descriptor = "I")
	private int anInt6105 = 1024;

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
	private int anInt6094 = 0;

	@OriginalMember(owner = "client!sh", name = "bb", descriptor = "I")
	private int anInt6108 = 409;

	@OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
	private int anInt6106 = 1024;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6099 = arg0.method5495();
		} else if (arg1 == 1) {
			this.anInt6106 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt6097 = arg0.method5500();
		} else if (arg1 == 3) {
			this.anInt6108 = arg0.method5500();
		} else if (arg1 == 4) {
			this.anInt6096 = arg0.method5500();
		} else if (arg1 == 5) {
			this.anInt6101 = arg0.method5500();
		} else if (arg1 == 6) {
			this.anInt6094 = arg0.method5495();
		} else if (arg1 == 7) {
			this.anInt6105 = arg0.method5500();
		} else if (arg1 == 8) {
			this.anInt6103 = arg0.method5500();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([[IIIIIILjava/util/Random;)V")
	private void method4896(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(20) int local20 = this.anInt6103 > 0 ? 4096 - Static149.method2451(this.anInt6103, arg5) : 4096;
		@Pc(28) int local28 = this.anInt6107 * this.anInt6105 >> 12;
		@Pc(43) int local43 = this.anInt6107 - (local28 > 0 ? Static149.method2451(local28, arg5) : 0);
		if (arg4 >= Static429.anInt6518) {
			arg4 -= Static429.anInt6518;
		}
		@Pc(66) int local66;
		@Pc(93) int local93;
		if (local43 <= 0) {
			if (arg3 + arg4 <= Static429.anInt6518) {
				for (local66 = 0; local66 < arg2; local66++) {
					Static457.method686(arg0[local66 + arg1], arg4, arg3, local20);
				}
			} else {
				local66 = Static429.anInt6518 - arg4;
				for (local93 = 0; local93 < arg2; local93++) {
					@Pc(101) int[] local101 = arg0[arg1 + local93];
					Static457.method686(local101, arg4, local66, local20);
					Static457.method686(local101, 0, arg3 - local66, local20);
				}
			}
		} else if (arg2 > 0 && arg3 > 0) {
			local66 = arg3 / 2;
			local93 = arg2 / 2;
			@Pc(143) int local143 = local43 <= local66 ? local43 : local66;
			@Pc(154) int local154 = local43 > local93 ? local93 : local43;
			@Pc(158) int local158 = local143 + arg4;
			@Pc(165) int local165 = arg3 - local143 * 2;
			for (@Pc(167) int local167 = 0; local167 < arg2; local167++) {
				@Pc(176) int[] local176 = arg0[local167 + arg1];
				@Pc(189) int local189;
				@Pc(197) int local197;
				@Pc(205) int local205;
				if (local167 < local154) {
					local189 = local167 * local20 / local154;
					if (this.anInt6094 == 0) {
						for (local197 = 0; local197 < local143; local197++) {
							local205 = local20 * local197 / local143;
							local176[Static303.anInt5406 & arg4 + local197] = local176[arg4 + arg3 - local197 - 1 & Static303.anInt5406] = local205 * local189 >> 12;
						}
					} else {
						for (local197 = 0; local197 < local143; local197++) {
							local205 = local20 * local197 / local143;
							local176[arg4 + local197 & Static303.anInt5406] = local176[arg4 + arg3 - local197 - 1 & Static303.anInt5406] = local189 > local205 ? local205 : local189;
						}
					}
					if (Static429.anInt6518 < local165 + local158) {
						local197 = Static429.anInt6518 - local158;
						Static457.method686(local176, local158, local197, local189);
						Static457.method686(local176, 0, local165 - local197, local189);
					} else {
						Static457.method686(local176, local158, local165, local189);
					}
				} else {
					local189 = arg2 - local167 - 1;
					if (local154 > local189) {
						local197 = local20 * local189 / local154;
						@Pc(345) int local345;
						if (this.anInt6094 == 0) {
							for (local205 = 0; local205 < local143; local205++) {
								local345 = local20 * local205 / local143;
								local176[Static303.anInt5406 & arg4 + local205] = local176[arg4 + arg3 - local205 - 1 & Static303.anInt5406] = local197 * local345 >> 12;
							}
						} else {
							for (local205 = 0; local205 < local143; local205++) {
								local345 = local20 * local205 / local143;
								local176[Static303.anInt5406 & arg4 + local205] = local176[arg3 + arg4 - local205 - 1 & Static303.anInt5406] = local197 <= local345 ? local197 : local345;
							}
						}
						if (local158 + local165 <= Static429.anInt6518) {
							Static457.method686(local176, local158, local165, local197);
						} else {
							local205 = Static429.anInt6518 - local158;
							Static457.method686(local176, local158, local205, local197);
							Static457.method686(local176, 0, local165 - local205, local197);
						}
					} else {
						for (local197 = 0; local197 < local143; local197++) {
							local176[Static303.anInt5406 & local197 + arg4] = local176[Static303.anInt5406 & arg4 + arg3 - local197 - 1] = local197 * local20 / local143;
						}
						if (local165 + local158 <= Static429.anInt6518) {
							Static457.method686(local176, local158, local165, local20);
						} else {
							local205 = Static429.anInt6518 - local158;
							Static457.method686(local176, local158, local205, local20);
							Static457.method686(local176, 0, local165 - local205, local20);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (!super.aClass82_41.aBoolean199) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass82_41.method2032();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static429.anInt6518 * this.anInt6106 >> 12;
		@Pc(52) int local52 = this.anInt6097 * Static429.anInt6518 >> 12;
		@Pc(59) int local59 = this.anInt6108 * Static51.anInt1129 >> 12;
		@Pc(66) int local66 = Static51.anInt1129 * this.anInt6096 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt6107 = Static429.anInt6518 / 8 * this.anInt6101 >> 12;
		@Pc(91) int local91 = Static429.anInt6518 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt6099);
		while (true) {
			while (true) {
				@Pc(116) int local116 = local45 + Static149.method2451(local52 - local45, local106);
				@Pc(125) int local125 = Static149.method2451(local66 - local59, local106) + local59;
				@Pc(130) int local130 = local28 + local116;
				if (Static429.anInt6518 < local130) {
					local116 = Static429.anInt6518 - local28;
					local130 = Static429.anInt6518;
				}
				@Pc(178) int local178;
				@Pc(150) int local150;
				if (local34) {
					local178 = 0;
				} else {
					@Pc(144) int local144 = local30;
					@Pc(148) int[] local148 = local99[local30];
					local150 = 0;
					@Pc(154) int local154 = local22 + local130;
					if (local154 < 0) {
						local154 += Static429.anInt6518;
					}
					if (Static429.anInt6518 < local154) {
						local154 -= Static429.anInt6518;
					}
					local178 = local148[2];
					while (true) {
						@Pc(182) int[] local182 = local99[local144];
						if (local182[0] <= local154 && local154 <= local182[1]) {
							if (local144 != local30) {
								@Pc(220) int local220 = local28 + local22;
								if (local220 < 0) {
									local220 += Static429.anInt6518;
								}
								if (Static429.anInt6518 < local220) {
									local220 -= Static429.anInt6518;
								}
								for (@Pc(242) int local242 = 1; local242 <= local150; local242++) {
									@Pc(253) int[] local253 = local99[(local30 + local242) % local36];
									local178 = Math.max(local178, local253[2]);
								}
								for (@Pc(265) int local265 = 0; local265 <= local150; local265++) {
									@Pc(275) int[] local275 = local99[(local265 + local30) % local36];
									@Pc(279) int local279 = local275[2];
									if (local279 != local178) {
										@Pc(286) int local286 = local275[0];
										@Pc(290) int local290 = local275[1];
										@Pc(301) int local301;
										@Pc(299) int local299;
										if (local154 > local220) {
											local301 = Math.max(local220, local286);
											local299 = Math.min(local154, local290);
										} else if (local286 == 0) {
											local299 = Math.min(local154, local290);
											local301 = 0;
										} else {
											local301 = Math.max(local220, local286);
											local299 = Static429.anInt6518;
										}
										this.method4896(local20, local279, local178 - local279, local299 + -local301, local26 + local301, local106);
									}
								}
							}
							local30 = local144;
							break;
						}
						local150++;
						@Pc(204) int local204 = ~local36;
						local144++;
						if (local204 >= ~local144) {
							local144 = 0;
						}
					}
				}
				if (local125 + local178 > Static51.anInt1129) {
					local125 = Static51.anInt1129 - local178;
				} else {
					local32 = false;
				}
				@Pc(387) int[] local387;
				if (local130 == Static429.anInt6518) {
					this.method4896(local20, local178, local125, local116, local24 + local28, local106);
					if (local32) {
						return local11;
					}
					local32 = true;
					local387 = local95[local38++];
					local387[2] = local125 + local178;
					local387[1] = local130;
					local387[0] = local28;
					@Pc(403) int[][] local403 = local99;
					local99 = local95;
					local36 = local38;
					local95 = local403;
					local38 = 0;
					local26 = local24;
					local24 = Static149.method2451(Static429.anInt6518, local106);
					local22 = local24 - local26;
					local28 = 0;
					local150 = local22;
					if (local22 < 0) {
						local150 = local22 + Static429.anInt6518;
					}
					local30 = 0;
					if (Static429.anInt6518 < local150) {
						local150 -= Static429.anInt6518;
					}
					local34 = false;
					while (true) {
						@Pc(448) int[] local448 = local99[local30];
						if (local150 >= local448[0] && local150 <= local448[1]) {
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local387 = local95[local38++];
					local387[0] = local28;
					local387[2] = local125 + local178;
					local387[1] = local130;
					this.method4896(local20, local178, local125, local116, local24 + local28, local106);
					local28 = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
	}
}
