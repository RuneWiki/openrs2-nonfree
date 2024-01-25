import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class7_Sub4_Sub3 extends Class7_Sub4 {

	@OriginalMember(owner = "client!de", name = "H", descriptor = "I")
	private int anInt1444;

	@OriginalMember(owner = "client!de", name = "F", descriptor = "I")
	private int anInt1442 = 0;

	@OriginalMember(owner = "client!de", name = "P", descriptor = "I")
	private int anInt1451 = 1024;

	@OriginalMember(owner = "client!de", name = "U", descriptor = "I")
	private int anInt1456 = 409;

	@OriginalMember(owner = "client!de", name = "K", descriptor = "I")
	private int anInt1446 = 1024;

	@OriginalMember(owner = "client!de", name = "T", descriptor = "I")
	private int anInt1455 = 1024;

	@OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
	private int anInt1460 = 819;

	@OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
	private int anInt1461 = 2048;

	@OriginalMember(owner = "client!de", name = "I", descriptor = "I")
	private int anInt1445 = 0;

	@OriginalMember(owner = "client!de", name = "W", descriptor = "I")
	private int anInt1458 = 1024;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1442 = arg0.method2772();
		} else if (arg1 == 1) {
			this.anInt1446 = arg0.method2764();
		} else if (arg1 == 2) {
			this.anInt1461 = arg0.method2764();
		} else if (arg1 == 3) {
			this.anInt1456 = arg0.method2764();
		} else if (arg1 == 4) {
			this.anInt1460 = arg0.method2764();
		} else if (arg1 == 5) {
			this.anInt1451 = arg0.method2764();
		} else if (arg1 == 6) {
			this.anInt1445 = arg0.method2772();
		} else if (arg1 == 7) {
			this.anInt1455 = arg0.method2764();
		} else if (arg1 == 8) {
			this.anInt1458 = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (!super.aClass219_41.aBoolean495) {
			return local11;
		}
		@Pc(28) int[][] local28 = super.aClass219_41.method5704();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = this.anInt1446 * Static201.anInt4174 >> 12;
		@Pc(60) int local60 = Static201.anInt4174 * this.anInt1461 >> 12;
		@Pc(67) int local67 = this.anInt1456 * Static216.anInt4322 >> 12;
		@Pc(74) int local74 = this.anInt1460 * Static216.anInt4322 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt1444 = Static201.anInt4174 / 8 * this.anInt1451 >> 12;
		@Pc(99) int local99 = Static201.anInt4174 / local53 + 1;
		@Pc(103) int[][] local103 = new int[local99][3];
		@Pc(107) int[][] local107 = new int[local99][3];
		@Pc(114) Random local114 = new Random((long) this.anInt1442);
		while (true) {
			while (true) {
				@Pc(124) int local124 = Static350.method5618(local60 - local53, local114) + local53;
				@Pc(133) int local133 = Static350.method5618(local74 - local67, local114) + local67;
				@Pc(137) int local137 = local124 + local36;
				if (local137 > Static201.anInt4174) {
					local124 = Static201.anInt4174 - local36;
					local137 = Static201.anInt4174;
				}
				@Pc(213) int local213;
				@Pc(161) int local161;
				if (local42) {
					local213 = 0;
				} else {
					@Pc(155) int local155 = local38;
					@Pc(159) int[] local159 = local107[local38];
					local161 = 0;
					@Pc(165) int local165 = local137 + local30;
					if (local165 < 0) {
						local165 += Static201.anInt4174;
					}
					if (local165 > Static201.anInt4174) {
						local165 -= Static201.anInt4174;
					}
					while (true) {
						@Pc(182) int[] local182 = local107[local155];
						if (local182[0] <= local165 && local165 <= local182[1]) {
							local213 = local159[2];
							if (local155 != local38) {
								@Pc(220) int local220 = local36 + local30;
								if (local220 < 0) {
									local220 += Static201.anInt4174;
								}
								if (local220 > Static201.anInt4174) {
									local220 -= Static201.anInt4174;
								}
								for (@Pc(242) int local242 = 1; local242 <= local161; local242++) {
									@Pc(252) int[] local252 = local107[(local242 + local38) % local44];
									local213 = Math.max(local213, local252[2]);
								}
								for (@Pc(268) int local268 = 0; local268 <= local161; local268++) {
									@Pc(278) int[] local278 = local107[(local268 + local38) % local44];
									@Pc(282) int local282 = local278[2];
									if (local282 != local213) {
										@Pc(289) int local289 = local278[0];
										@Pc(293) int local293 = local278[1];
										@Pc(300) int local300;
										@Pc(304) int local304;
										if (local165 > local220) {
											local300 = Math.max(local220, local289);
											local304 = Math.min(local165, local293);
										} else if (local289 == 0) {
											local300 = 0;
											local304 = Math.min(local165, local293);
										} else {
											local300 = Math.max(local220, local289);
											local304 = Static201.anInt4174;
										}
										this.method1165(local34 + local300, local213 - local282, local28, local282, local304 - local300, local114);
									}
								}
							}
							local38 = local155;
							break;
						}
						local155++;
						if (local44 <= local155) {
							local155 = 0;
						}
						local161++;
					}
				}
				if (local213 + local133 <= Static216.anInt4322) {
					local40 = false;
				} else {
					local133 = Static216.anInt4322 - local213;
				}
				@Pc(390) int[] local390;
				if (Static201.anInt4174 == local137) {
					this.method1165(local32 + local36, local133, local28, local213, local124, local114);
					if (local40) {
						return local11;
					}
					local40 = true;
					local390 = local103[local46++];
					local390[1] = local137;
					local390[0] = local36;
					local390[2] = local133 + local213;
					@Pc(406) int[][] local406 = local107;
					local107 = local103;
					local103 = local406;
					local44 = local46;
					local34 = local32;
					local46 = 0;
					local32 = Static350.method5618(Static201.anInt4174, local114);
					local30 = local32 - local34;
					local36 = 0;
					local161 = local30;
					if (local30 < 0) {
						local161 = local30 + Static201.anInt4174;
					}
					if (Static201.anInt4174 < local161) {
						local161 -= Static201.anInt4174;
					}
					local38 = 0;
					local42 = false;
					while (true) {
						@Pc(453) int[] local453 = local107[local38];
						if (local161 >= local453[0] && local453[1] >= local161) {
							break;
						}
						local38++;
						if (local44 <= local38) {
							local38 = 0;
						}
					}
				} else {
					local390 = local103[local46++];
					local390[1] = local137;
					local390[2] = local133 + local213;
					local390[0] = local36;
					this.method1165(local32 + local36, local133, local28, local213, local124, local114);
					local36 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III[[IIILjava/util/Random;)V")
	private void method1165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(22) int local22 = this.anInt1458 <= 0 ? 4096 : 4096 - Static350.method5618(this.anInt1458, arg5);
		@Pc(30) int local30 = this.anInt1455 * this.anInt1444 >> 12;
		@Pc(42) int local42 = this.anInt1444 - (local30 <= 0 ? 0 : Static350.method5618(local30, arg5));
		if (Static201.anInt4174 <= arg0) {
			arg0 -= Static201.anInt4174;
		}
		@Pc(69) int local69;
		@Pc(71) int local71;
		if (local42 <= 0) {
			if (Static201.anInt4174 < arg0 + arg4) {
				local69 = Static201.anInt4174 - arg0;
				for (local71 = 0; local71 < arg1; local71++) {
					@Pc(79) int[] local79 = arg2[local71 + arg3];
					Static366.method4203(local79, arg0, local69, local22);
					Static366.method4203(local79, 0, arg4 - local69, local22);
				}
			} else {
				for (local69 = 0; local69 < arg1; local69++) {
					Static366.method4203(arg2[arg3 + local69], arg0, arg4, local22);
				}
			}
		} else if (arg1 > 0 && arg4 > 0) {
			local69 = arg4 / 2;
			local71 = arg1 / 2;
			@Pc(143) int local143 = local69 < local42 ? local69 : local42;
			@Pc(150) int local150 = local42 > local71 ? local71 : local42;
			@Pc(154) int local154 = local143 + arg0;
			@Pc(160) int local160 = arg4 - local143 * 2;
			for (@Pc(162) int local162 = 0; local162 < arg1; local162++) {
				@Pc(171) int[] local171 = arg2[local162 + arg3];
				@Pc(180) int local180;
				@Pc(188) int local188;
				@Pc(196) int local196;
				if (local150 > local162) {
					local180 = local22 * local162 / local150;
					if (this.anInt1445 == 0) {
						for (local188 = 0; local188 < local143; local188++) {
							local196 = local22 * local188 / local143;
							local171[Static110.anInt2508 & arg0 + local188] = local171[Static110.anInt2508 & arg4 + arg0 - local188 - 1] = local180 * local196 >> 12;
						}
					} else {
						for (local188 = 0; local188 < local143; local188++) {
							local196 = local22 * local188 / local143;
							local171[Static110.anInt2508 & arg0 + local188] = local171[arg4 + arg0 - local188 - 1 & Static110.anInt2508] = local180 <= local196 ? local180 : local196;
						}
					}
					if (Static201.anInt4174 < local154 + local160) {
						local188 = Static201.anInt4174 - local154;
						Static366.method4203(local171, local154, local188, local180);
						Static366.method4203(local171, 0, local160 - local188, local180);
					} else {
						Static366.method4203(local171, local154, local160, local180);
					}
				} else {
					local180 = arg1 - local162 - 1;
					if (local150 > local180) {
						local188 = local180 * local22 / local150;
						@Pc(347) int local347;
						if (this.anInt1445 == 0) {
							for (local196 = 0; local196 < local143; local196++) {
								local347 = local196 * local22 / local143;
								local171[local196 + arg0 & Static110.anInt2508] = local171[arg0 + arg4 - local196 - 1 & Static110.anInt2508] = local188 * local347 >> 12;
							}
						} else {
							for (local196 = 0; local196 < local143; local196++) {
								local347 = local22 * local196 / local143;
								local171[Static110.anInt2508 & local196 + arg0] = local171[arg0 + arg4 - local196 - 1 & Static110.anInt2508] = local347 < local188 ? local347 : local188;
							}
						}
						if (local160 + local154 <= Static201.anInt4174) {
							Static366.method4203(local171, local154, local160, local188);
						} else {
							local196 = Static201.anInt4174 - local154;
							Static366.method4203(local171, local154, local196, local188);
							Static366.method4203(local171, 0, local160 - local196, local188);
						}
					} else {
						for (local188 = 0; local188 < local143; local188++) {
							local171[local188 + arg0 & Static110.anInt2508] = local171[arg4 + arg0 - local188 - 1 & Static110.anInt2508] = local188 * local22 / local143;
						}
						if (local154 + local160 <= Static201.anInt4174) {
							Static366.method4203(local171, local154, local160, local22);
						} else {
							local196 = Static201.anInt4174 - local154;
							Static366.method4203(local171, local154, local196, local22);
							Static366.method4203(local171, 0, local160 - local196, local22);
						}
					}
				}
			}
		}
	}
}
