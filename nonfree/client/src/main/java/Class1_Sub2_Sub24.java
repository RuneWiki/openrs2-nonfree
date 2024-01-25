import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class1_Sub2_Sub24 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
	private int anInt5374;

	@OriginalMember(owner = "client!pr", name = "J", descriptor = "I")
	private int anInt5376 = 1024;

	@OriginalMember(owner = "client!pr", name = "I", descriptor = "I")
	private int anInt5375 = 1024;

	@OriginalMember(owner = "client!pr", name = "M", descriptor = "I")
	private int anInt5379 = 819;

	@OriginalMember(owner = "client!pr", name = "W", descriptor = "I")
	private int anInt5389 = 1024;

	@OriginalMember(owner = "client!pr", name = "S", descriptor = "I")
	private int anInt5385 = 1024;

	@OriginalMember(owner = "client!pr", name = "V", descriptor = "I")
	private int anInt5388 = 2048;

	@OriginalMember(owner = "client!pr", name = "L", descriptor = "I")
	private int anInt5378 = 0;

	@OriginalMember(owner = "client!pr", name = "O", descriptor = "I")
	private int anInt5381 = 0;

	@OriginalMember(owner = "client!pr", name = "R", descriptor = "I")
	private int anInt5384 = 409;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III[[ILjava/util/Random;II)V")
	private void method4300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) Random arg4, @OriginalArg(5) int arg5) {
		@Pc(19) int local19 = this.anInt5375 > 0 ? 4096 - Static133.method1697(this.anInt5375, arg4) : 4096;
		@Pc(27) int local27 = this.anInt5385 * this.anInt5374 >> 12;
		@Pc(42) int local42 = this.anInt5374 - (local27 > 0 ? Static133.method1697(local27, arg4) : 0);
		if (arg2 >= Static218.anInt3990) {
			arg2 -= Static218.anInt3990;
		}
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (local42 <= 0) {
			if (Static218.anInt3990 < arg2 + arg5) {
				local73 = Static218.anInt3990 - arg2;
				for (local75 = 0; local75 < arg1; local75++) {
					@Pc(83) int[] local83 = arg3[local75 + arg0];
					Static471.method3064(local83, arg2, local73, local19);
					Static471.method3064(local83, 0, arg5 - local73, local19);
				}
			} else {
				for (local73 = 0; local73 < arg1; local73++) {
					Static471.method3064(arg3[local73 + arg0], arg2, arg5, local19);
				}
			}
		} else if (arg1 > 0 && arg5 > 0) {
			local73 = arg5 / 2;
			local75 = arg1 / 2;
			@Pc(147) int local147 = local73 >= local42 ? local42 : local73;
			@Pc(158) int local158 = local75 >= local42 ? local42 : local75;
			@Pc(162) int local162 = local147 + arg2;
			@Pc(169) int local169 = arg5 - local147 * 2;
			for (@Pc(171) int local171 = 0; local171 < arg1; local171++) {
				@Pc(179) int[] local179 = arg3[arg0 + local171];
				@Pc(188) int local188;
				@Pc(193) int local193;
				@Pc(201) int local201;
				if (local171 < local158) {
					local188 = local171 * local19 / local158;
					if (this.anInt5378 == 0) {
						for (local193 = 0; local193 < local147; local193++) {
							local201 = local19 * local193 / local147;
							local179[Static147.anInt2302 & local193 + arg2] = local179[Static147.anInt2302 & arg5 + arg2 - local193 - 1] = local201 * local188 >> 12;
						}
					} else {
						for (local193 = 0; local193 < local147; local193++) {
							local201 = local19 * local193 / local147;
							local179[arg2 + local193 & Static147.anInt2302] = local179[arg5 + arg2 - local193 - 1 & Static147.anInt2302] = local201 >= local188 ? local188 : local201;
						}
					}
					if (local169 + local162 > Static218.anInt3990) {
						local193 = Static218.anInt3990 - local162;
						Static471.method3064(local179, local162, local193, local188);
						Static471.method3064(local179, 0, local169 - local193, local188);
					} else {
						Static471.method3064(local179, local162, local169, local188);
					}
				} else {
					local188 = arg1 - local171 - 1;
					if (local188 < local158) {
						local193 = local19 * local188 / local158;
						@Pc(339) int local339;
						if (this.anInt5378 == 0) {
							for (local201 = 0; local201 < local147; local201++) {
								local339 = local201 * local19 / local147;
								local179[Static147.anInt2302 & local201 + arg2] = local179[Static147.anInt2302 & arg5 + arg2 - local201 - 1] = local339 * local193 >> 12;
							}
						} else {
							for (local201 = 0; local201 < local147; local201++) {
								local339 = local19 * local201 / local147;
								local179[arg2 + local201 & Static147.anInt2302] = local179[Static147.anInt2302 & arg5 + arg2 - local201 - 1] = local193 <= local339 ? local193 : local339;
							}
						}
						if (local169 + local162 > Static218.anInt3990) {
							local201 = Static218.anInt3990 - local162;
							Static471.method3064(local179, local162, local201, local193);
							Static471.method3064(local179, 0, local169 - local201, local193);
						} else {
							Static471.method3064(local179, local162, local169, local193);
						}
					} else {
						for (local193 = 0; local193 < local147; local193++) {
							local179[arg2 + local193 & Static147.anInt2302] = local179[Static147.anInt2302 & arg2 + arg5 - local193 - 1] = local19 * local193 / local147;
						}
						if (Static218.anInt3990 < local162 + local169) {
							local201 = Static218.anInt3990 - local162;
							Static471.method3064(local179, local162, local201, local19);
							Static471.method3064(local179, 0, local169 - local201, local19);
						} else {
							Static471.method3064(local179, local162, local169, local19);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_41.method312(arg0);
		if (!super.aClass22_41.aBoolean44) {
			return local16;
		}
		@Pc(25) int[][] local25 = super.aClass22_41.method314();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = this.anInt5376 * Static218.anInt3990 >> 12;
		@Pc(57) int local57 = Static218.anInt3990 * this.anInt5388 >> 12;
		@Pc(64) int local64 = this.anInt5384 * Static54.anInt778 >> 12;
		@Pc(71) int local71 = Static54.anInt778 * this.anInt5379 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt5374 = Static218.anInt3990 / 8 * this.anInt5389 >> 12;
		@Pc(97) int local97 = Static218.anInt3990 / local50 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt5381);
		while (true) {
			while (true) {
				@Pc(122) int local122 = Static133.method1697(local57 - local50, local112) + local50;
				@Pc(132) int local132 = Static133.method1697(local71 - local64, local112) + local64;
				@Pc(136) int local136 = local122 + local33;
				if (local136 > Static218.anInt3990) {
					local136 = Static218.anInt3990;
					local122 = Static218.anInt3990 - local33;
				}
				@Pc(178) int local178;
				@Pc(156) int local156;
				if (local39) {
					local178 = 0;
				} else {
					@Pc(150) int local150 = local35;
					@Pc(154) int[] local154 = local105[local35];
					local156 = 0;
					@Pc(161) int local161 = local136 + local27;
					if (local161 < 0) {
						local161 += Static218.anInt3990;
					}
					if (local161 > Static218.anInt3990) {
						local161 -= Static218.anInt3990;
					}
					local178 = local154[2];
					while (true) {
						@Pc(182) int[] local182 = local105[local150];
						if (local161 >= local182[0] && local161 <= local182[1]) {
							if (local35 != local150) {
								@Pc(216) int local216 = local33 + local27;
								if (local216 < 0) {
									local216 += Static218.anInt3990;
								}
								if (Static218.anInt3990 < local216) {
									local216 -= Static218.anInt3990;
								}
								for (@Pc(231) int local231 = 1; local231 <= local156; local231++) {
									@Pc(242) int[] local242 = local105[(local35 + local231) % local41];
									local178 = Math.max(local178, local242[2]);
								}
								for (@Pc(258) int local258 = 0; local258 <= local156; local258++) {
									@Pc(268) int[] local268 = local105[(local258 + local35) % local41];
									@Pc(272) int local272 = local268[2];
									if (local178 != local272) {
										@Pc(279) int local279 = local268[0];
										@Pc(283) int local283 = local268[1];
										@Pc(292) int local292;
										@Pc(294) int local294;
										if (local161 > local216) {
											local292 = Math.max(local216, local279);
											local294 = Math.min(local161, local283);
										} else if (local279 == 0) {
											local294 = Math.min(local161, local283);
											local292 = 0;
										} else {
											local292 = Math.max(local216, local279);
											local294 = Static218.anInt3990;
										}
										this.method4300(local272, local178 - local272, local31 + local292, local25, local112, local294 - local292);
									}
								}
							}
							local35 = local150;
							break;
						}
						local150++;
						if (local41 <= local150) {
							local150 = 0;
						}
						local156++;
					}
				}
				if (Static54.anInt778 < local132 + local178) {
					local132 = Static54.anInt778 - local178;
				} else {
					local37 = false;
				}
				@Pc(369) int[] local369;
				if (local136 == Static218.anInt3990) {
					this.method4300(local178, local132, local33 + local29, local25, local112, local122);
					if (local37) {
						return local16;
					}
					local37 = true;
					local369 = local101[local43++];
					local369[1] = local136;
					local369[2] = local178 + local132;
					local369[0] = local33;
					@Pc(436) int[][] local436 = local105;
					local105 = local101;
					local41 = local43;
					local101 = local436;
					local31 = local29;
					local43 = 0;
					local29 = Static133.method1697(Static218.anInt3990, local112);
					local27 = local29 - local31;
					local33 = 0;
					local156 = local27;
					if (local27 < 0) {
						local156 = local27 + Static218.anInt3990;
					}
					local35 = 0;
					if (local156 > Static218.anInt3990) {
						local156 -= Static218.anInt3990;
					}
					local39 = false;
					while (true) {
						@Pc(484) int[] local484 = local105[local35];
						if (local484[0] <= local156 && local484[1] >= local156) {
							break;
						}
						local35++;
						if (local35 >= local41) {
							local35 = 0;
						}
					}
				} else {
					local369 = local101[local43++];
					local369[0] = local33;
					local369[1] = local136;
					local369[2] = local178 + local132;
					this.method4300(local178, local132, local33 + local29, local25, local112, local122);
					local33 = local136;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5381 = arg0.method2915();
		} else if (arg1 == 1) {
			this.anInt5376 = arg0.method2896();
		} else if (arg1 == 2) {
			this.anInt5388 = arg0.method2896();
		} else if (arg1 == 3) {
			this.anInt5384 = arg0.method2896();
		} else if (arg1 == 4) {
			this.anInt5379 = arg0.method2896();
		} else if (arg1 == 5) {
			this.anInt5389 = arg0.method2896();
		} else if (arg1 == 6) {
			this.anInt5378 = arg0.method2915();
		} else if (arg1 == 7) {
			this.anInt5385 = arg0.method2896();
		} else if (arg1 == 8) {
			this.anInt5375 = arg0.method2896();
		}
	}
}
