import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
	private int anInt3694;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
	private int anInt3690 = 409;

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
	private int anInt3688 = 0;

	@OriginalMember(owner = "client!qb", name = "ib", descriptor = "I")
	private int anInt3699 = 2048;

	@OriginalMember(owner = "client!qb", name = "hb", descriptor = "I")
	private int anInt3698 = 1024;

	@OriginalMember(owner = "client!qb", name = "jb", descriptor = "I")
	private int anInt3700 = 1024;

	@OriginalMember(owner = "client!qb", name = "mb", descriptor = "I")
	private int anInt3703 = 1024;

	@OriginalMember(owner = "client!qb", name = "nb", descriptor = "I")
	private int anInt3704 = 0;

	@OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
	private int anInt3696 = 1024;

	@OriginalMember(owner = "client!qb", name = "rb", descriptor = "I")
	private int anInt3707 = 819;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass37_41.method1168(arg0);
		if (!super.aClass37_41.aBoolean131) {
			return local19;
		}
		@Pc(32) int[][] local32 = super.aClass37_41.method1165();
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) boolean local44 = true;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50 = 0;
		@Pc(57) int local57 = this.anInt3699 * Static11.anInt294 >> 12;
		@Pc(64) int local64 = this.anInt3696 * Static11.anInt294 >> 12;
		@Pc(71) int local71 = this.anInt3690 * Static116.anInt2571 >> 12;
		@Pc(78) int local78 = this.anInt3707 * Static116.anInt2571 >> 12;
		if (local78 <= 1) {
			return local32[arg0];
		}
		@Pc(92) int local92 = Static11.anInt294 / local64 + 1;
		this.anInt3694 = this.anInt3698 * (Static11.anInt294 / 8) >> 12;
		@Pc(106) int[][] local106 = new int[local92][3];
		@Pc(113) Random local113 = new Random((long) this.anInt3704);
		@Pc(117) int[][] local117 = new int[local92][3];
		while (true) {
			while (true) {
				@Pc(127) int local127 = Static206.method3285(local113, local57 - local64) + local64;
				@Pc(137) int local137 = Static206.method3285(local113, local78 - local71) + local71;
				@Pc(142) int local142 = local46 + local127;
				if (local142 > Static11.anInt294) {
					local142 = Static11.anInt294;
					local127 = Static11.anInt294 - local46;
				}
				@Pc(160) int local160;
				@Pc(168) int local168;
				if (local44) {
					local160 = 0;
				} else {
					@Pc(166) int[] local166 = local117[local42];
					local168 = 0;
					@Pc(170) int local170 = local42;
					local160 = local166[2];
					@Pc(178) int local178 = local34 + local142;
					if (local178 < 0) {
						local178 += Static11.anInt294;
					}
					if (Static11.anInt294 < local178) {
						local178 -= Static11.anInt294;
					}
					while (true) {
						@Pc(199) int[] local199 = local117[local170];
						if (local199[0] <= local178 && local199[1] >= local178) {
							if (local42 != local170) {
								@Pc(234) int local234 = local46 + local34;
								if (local234 < 0) {
									local234 += Static11.anInt294;
								}
								if (Static11.anInt294 < local234) {
									local234 -= Static11.anInt294;
								}
								for (@Pc(252) int local252 = 1; local252 <= local168; local252++) {
									@Pc(262) int[] local262 = local117[(local42 + local252) % local48];
									local160 = Math.max(local160, local262[2]);
								}
								for (@Pc(274) int local274 = 0; local274 <= local168; local274++) {
									@Pc(285) int[] local285 = local117[(local42 + local274) % local48];
									@Pc(289) int local289 = local285[2];
									if (local289 != local160) {
										@Pc(296) int local296 = local285[0];
										@Pc(300) int local300 = local285[1];
										@Pc(307) int local307;
										@Pc(311) int local311;
										if (local234 < local178) {
											local307 = Math.max(local234, local296);
											local311 = Math.min(local178, local300);
										} else if (local296 == 0) {
											local307 = 0;
											local311 = Math.min(local178, local300);
										} else {
											local307 = Math.max(local234, local296);
											local311 = Static11.anInt294;
										}
										this.method2727(local311 - local307, local113, local289, local32, local160 - local289, local307 - -local38);
									}
								}
							}
							local42 = local170;
							break;
						}
						local170++;
						if (local48 <= local170) {
							local170 = 0;
						}
						local168++;
					}
				}
				if (local137 + local160 <= Static116.anInt2571) {
					local40 = false;
				} else {
					local137 = Static116.anInt2571 - local160;
				}
				@Pc(386) int[] local386;
				if (Static11.anInt294 == local142) {
					this.method2727(local127, local113, local160, local32, local137, local36 + local46);
					if (local40) {
						return local19;
					}
					local42 = 0;
					local44 = false;
					local38 = local36;
					local40 = true;
					local386 = local106[local50++];
					local48 = local50;
					local386[0] = local46;
					local46 = 0;
					local386[2] = local160 + local137;
					local386[1] = local142;
					local36 = Static206.method3285(local113, Static11.anInt294);
					local34 = local36 - local38;
					local50 = 0;
					@Pc(472) int[][] local472 = local117;
					local117 = local106;
					local168 = local34;
					local106 = local472;
					if (local34 < 0) {
						local168 = local34 + Static11.anInt294;
					}
					if (local168 > Static11.anInt294) {
						local168 -= Static11.anInt294;
					}
					while (true) {
						@Pc(499) int[] local499 = local117[local42];
						if (local168 >= local499[0] && local499[1] >= local168) {
							break;
						}
						local42++;
						if (local42 >= local48) {
							local42 = 0;
						}
					}
				} else {
					local386 = local106[local50++];
					local386[2] = local137 + local160;
					local386[0] = local46;
					local386[1] = local142;
					this.method2727(local127, local113, local160, local32, local137, local36 + local46);
					local46 = local142;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3704 = arg0.method2945();
		} else if (arg1 == 1) {
			this.anInt3696 = arg0.method2964();
		} else if (arg1 == 2) {
			this.anInt3699 = arg0.method2964();
		} else if (arg1 == 3) {
			this.anInt3690 = arg0.method2964();
		} else if (arg1 == 4) {
			this.anInt3707 = arg0.method2964();
		} else if (arg1 == 5) {
			this.anInt3698 = arg0.method2964();
		} else if (arg1 == 6) {
			this.anInt3688 = arg0.method2945();
		} else if (arg1 == 7) {
			this.anInt3700 = arg0.method2964();
		} else if (arg1 == 8) {
			this.anInt3703 = arg0.method2964();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/util/Random;II[[III)V")
	private void method2727(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = this.anInt3703 > 0 ? 4096 - Static206.method3285(arg1, this.anInt3703) : 4096;
		@Pc(27) int local27 = this.anInt3694 * this.anInt3700 >> 12;
		@Pc(43) int local43 = this.anInt3694 - (local27 <= 0 ? 0 : Static206.method3285(arg1, local27));
		if (Static11.anInt294 <= arg5) {
			arg5 -= Static11.anInt294;
		}
		@Pc(67) int local67;
		@Pc(95) int local95;
		if (local43 <= 0) {
			if (Static11.anInt294 >= arg5 + arg0) {
				for (local67 = 0; local67 < arg4; local67++) {
					Static236.method301(arg3[arg2 + local67], arg5, arg0, local15);
				}
			} else {
				local67 = Static11.anInt294 - arg5;
				for (local95 = 0; local95 < arg4; local95++) {
					@Pc(104) int[] local104 = arg3[arg2 + local95];
					Static236.method301(local104, arg5, local67, local15);
					Static236.method301(local104, 0, arg0 - local67, local15);
				}
			}
		} else if (arg4 > 0 && arg0 > 0) {
			local67 = arg0 / 2;
			local95 = arg4 / 2;
			@Pc(156) int local156 = local43 <= local95 ? local43 : local95;
			@Pc(167) int local167 = local67 < local43 ? local67 : local43;
			@Pc(171) int local171 = arg5 + local167;
			@Pc(178) int local178 = arg0 - local167 * 2;
			for (@Pc(180) int local180 = 0; local180 < arg4; local180++) {
				@Pc(188) int[] local188 = arg3[arg2 + local180];
				@Pc(201) int local201;
				@Pc(209) int local209;
				@Pc(217) int local217;
				if (local180 < local156) {
					local201 = local180 * local15 / local156;
					if (this.anInt3688 == 0) {
						for (local209 = 0; local209 < local167; local209++) {
							local217 = local15 * local209 / local167;
							local188[Static147.anInt3169 & local209 + arg5] = local188[Static147.anInt3169 & arg5 + arg0 - local209 - 1] = local201 * local217 >> 12;
						}
					} else {
						for (local209 = 0; local209 < local167; local209++) {
							local217 = local209 * local15 / local167;
							local188[local209 + arg5 & Static147.anInt3169] = local188[arg0 + arg5 - local209 - 1 & Static147.anInt3169] = local201 <= local217 ? local201 : local217;
						}
					}
					if (local178 + local171 <= Static11.anInt294) {
						Static236.method301(local188, local171, local178, local201);
					} else {
						local209 = Static11.anInt294 - local171;
						Static236.method301(local188, local171, local209, local201);
						Static236.method301(local188, 0, local178 - local209, local201);
					}
				} else {
					local201 = arg4 - local180 - 1;
					if (local156 > local201) {
						local209 = local201 * local15 / local156;
						@Pc(359) int local359;
						if (this.anInt3688 == 0) {
							for (local217 = 0; local217 < local167; local217++) {
								local359 = local217 * local15 / local167;
								local188[arg5 + local217 & Static147.anInt3169] = local188[arg5 + arg0 - local217 - 1 & Static147.anInt3169] = local209 * local359 >> 12;
							}
						} else {
							for (local217 = 0; local217 < local167; local217++) {
								local359 = local217 * local15 / local167;
								local188[local217 + arg5 & Static147.anInt3169] = local188[arg0 + arg5 - local217 - 1 & Static147.anInt3169] = local209 <= local359 ? local209 : local359;
							}
						}
						if (Static11.anInt294 >= local171 + local178) {
							Static236.method301(local188, local171, local178, local209);
						} else {
							local217 = Static11.anInt294 - local171;
							Static236.method301(local188, local171, local217, local209);
							Static236.method301(local188, 0, local178 - local217, local209);
						}
					} else {
						for (local209 = 0; local209 < local167; local209++) {
							local188[arg5 + local209 & Static147.anInt3169] = local188[arg5 + arg0 - local209 - 1 & Static147.anInt3169] = local15 * local209 / local167;
						}
						if (local178 + local171 > Static11.anInt294) {
							local217 = Static11.anInt294 - local171;
							Static236.method301(local188, local171, local217, local15);
							Static236.method301(local188, 0, local178 - local217, local15);
						} else {
							Static236.method301(local188, local171, local178, local15);
						}
					}
				}
			}
		}
	}
}
