import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class2_Sub6_Sub2 extends Class2_Sub6 {

	@OriginalMember(owner = "client!bu", name = "V", descriptor = "I")
	private int anInt661;

	@OriginalMember(owner = "client!bu", name = "N", descriptor = "I")
	private int anInt653 = 2048;

	@OriginalMember(owner = "client!bu", name = "O", descriptor = "I")
	private int anInt654 = 1024;

	@OriginalMember(owner = "client!bu", name = "K", descriptor = "I")
	private int anInt651 = 409;

	@OriginalMember(owner = "client!bu", name = "R", descriptor = "I")
	private int anInt657 = 819;

	@OriginalMember(owner = "client!bu", name = "L", descriptor = "I")
	private int anInt652 = 1024;

	@OriginalMember(owner = "client!bu", name = "Y", descriptor = "I")
	private int anInt664 = 0;

	@OriginalMember(owner = "client!bu", name = "W", descriptor = "I")
	private int anInt662 = 0;

	@OriginalMember(owner = "client!bu", name = "Q", descriptor = "I")
	private int anInt656 = 1024;

	@OriginalMember(owner = "client!bu", name = "db", descriptor = "I")
	private int anInt668 = 1024;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "([[ILjava/util/Random;IIIII)V")
	private void method704(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Random arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt656 > 0 ? 4096 - Static367.method5542(this.anInt656, arg1) : 4096;
		@Pc(27) int local27 = this.anInt661 * this.anInt652 >> 12;
		@Pc(39) int local39 = this.anInt661 - (local27 > 0 ? Static367.method5542(local27, arg1) : 0);
		if (arg2 >= Static151.anInt2711) {
			arg2 -= Static151.anInt2711;
		}
		@Pc(67) int local67;
		@Pc(95) int local95;
		if (local39 <= 0) {
			if (Static151.anInt2711 >= arg2 + arg5) {
				for (local67 = 0; local67 < arg4; local67++) {
					Static406.method5655(arg0[arg3 + local67], arg2, arg5, local19);
				}
			} else {
				local67 = Static151.anInt2711 - arg2;
				for (local95 = 0; local95 < arg4; local95++) {
					@Pc(104) int[] local104 = arg0[arg3 + local95];
					Static406.method5655(local104, arg2, local67, local19);
					Static406.method5655(local104, 0, arg5 - local67, local19);
				}
			}
		} else if (arg4 > 0 && arg5 > 0) {
			local67 = arg5 / 2;
			local95 = arg4 / 2;
			@Pc(151) int local151 = local39 <= local67 ? local39 : local67;
			@Pc(162) int local162 = local39 > local95 ? local95 : local39;
			@Pc(166) int local166 = local151 + arg2;
			@Pc(172) int local172 = arg5 - local151 * 2;
			for (@Pc(174) int local174 = 0; local174 < arg4; local174++) {
				@Pc(182) int[] local182 = arg0[arg3 + local174];
				@Pc(191) int local191;
				@Pc(199) int local199;
				@Pc(207) int local207;
				if (local162 > local174) {
					local191 = local19 * local174 / local162;
					if (this.anInt662 == 0) {
						for (local199 = 0; local199 < local151; local199++) {
							local207 = local19 * local199 / local151;
							local182[local199 + arg2 & Static274.anInt1078] = local182[Static274.anInt1078 & arg5 + arg2 - local199 - 1] = local191 * local207 >> 12;
						}
					} else {
						for (local199 = 0; local199 < local151; local199++) {
							local207 = local199 * local19 / local151;
							local182[local199 + arg2 & Static274.anInt1078] = local182[Static274.anInt1078 & arg5 + arg2 - local199 - 1] = local207 < local191 ? local207 : local191;
						}
					}
					if (Static151.anInt2711 >= local172 + local166) {
						Static406.method5655(local182, local166, local172, local191);
					} else {
						local199 = Static151.anInt2711 - local166;
						Static406.method5655(local182, local166, local199, local191);
						Static406.method5655(local182, 0, local172 - local199, local191);
					}
				} else {
					local191 = arg4 - local174 - 1;
					if (local162 > local191) {
						local199 = local19 * local191 / local162;
						@Pc(351) int local351;
						if (this.anInt662 == 0) {
							for (local207 = 0; local207 < local151; local207++) {
								local351 = local207 * local19 / local151;
								local182[local207 + arg2 & Static274.anInt1078] = local182[Static274.anInt1078 & arg2 + arg5 - local207 - 1] = local199 * local351 >> 12;
							}
						} else {
							for (local207 = 0; local207 < local151; local207++) {
								local351 = local19 * local207 / local151;
								local182[local207 + arg2 & Static274.anInt1078] = local182[arg2 + arg5 - local207 - 1 & Static274.anInt1078] = local351 < local199 ? local351 : local199;
							}
						}
						if (local166 + local172 > Static151.anInt2711) {
							local207 = Static151.anInt2711 - local166;
							Static406.method5655(local182, local166, local207, local199);
							Static406.method5655(local182, 0, local172 - local207, local199);
						} else {
							Static406.method5655(local182, local166, local172, local199);
						}
					} else {
						for (local199 = 0; local199 < local151; local199++) {
							local182[arg2 + local199 & Static274.anInt1078] = local182[arg5 + arg2 - local199 - 1 & Static274.anInt1078] = local19 * local199 / local151;
						}
						if (local166 + local172 > Static151.anInt2711) {
							local207 = Static151.anInt2711 - local166;
							Static406.method5655(local182, local166, local207, local19);
							Static406.method5655(local182, 0, local172 - local207, local19);
						} else {
							Static406.method5655(local182, local166, local172, local19);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt664 = arg0.method4240();
		} else if (arg1 == 1) {
			this.anInt654 = arg0.method4245();
		} else if (arg1 == 2) {
			this.anInt653 = arg0.method4245();
		} else if (arg1 == 3) {
			this.anInt651 = arg0.method4245();
		} else if (arg1 == 4) {
			this.anInt657 = arg0.method4245();
		} else if (arg1 == 5) {
			this.anInt668 = arg0.method4245();
		} else if (arg1 == 6) {
			this.anInt662 = arg0.method4240();
		} else if (arg1 == 7) {
			this.anInt652 = arg0.method4245();
		} else if (arg1 == 8) {
			this.anInt656 = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass166_41.method3993(arg0);
		if (!super.aClass166_41.aBoolean336) {
			return local11;
		}
		@Pc(32) int[][] local32 = super.aClass166_41.method3990();
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(44) boolean local44 = true;
		@Pc(46) boolean local46 = true;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50 = 0;
		@Pc(57) int local57 = Static151.anInt2711 * this.anInt654 >> 12;
		@Pc(64) int local64 = Static151.anInt2711 * this.anInt653 >> 12;
		@Pc(71) int local71 = this.anInt651 * Static372.anInt6520 >> 12;
		@Pc(78) int local78 = Static372.anInt6520 * this.anInt657 >> 12;
		if (local78 <= 1) {
			return local32[arg0];
		}
		this.anInt661 = this.anInt668 * (Static151.anInt2711 / 8) >> 12;
		@Pc(103) int local103 = Static151.anInt2711 / local57 + 1;
		@Pc(107) int[][] local107 = new int[local103][3];
		@Pc(111) int[][] local111 = new int[local103][3];
		@Pc(118) Random local118 = new Random((long) this.anInt664);
		while (true) {
			while (true) {
				@Pc(128) int local128 = local57 + Static367.method5542(local64 - local57, local118);
				@Pc(139) int local139 = local71 + Static367.method5542(local78 - local71, local118);
				@Pc(143) int local143 = local40 + local128;
				if (Static151.anInt2711 < local143) {
					local128 = Static151.anInt2711 - local40;
					local143 = Static151.anInt2711;
				}
				@Pc(188) int local188;
				@Pc(166) int local166;
				if (local46) {
					local188 = 0;
				} else {
					@Pc(160) int local160 = local42;
					@Pc(164) int[] local164 = local111[local42];
					local166 = 0;
					@Pc(171) int local171 = local143 + local34;
					if (local171 < 0) {
						local171 += Static151.anInt2711;
					}
					if (local171 > Static151.anInt2711) {
						local171 -= Static151.anInt2711;
					}
					local188 = local164[2];
					while (true) {
						@Pc(192) int[] local192 = local111[local160];
						if (local192[0] <= local171 && local171 <= local192[1]) {
							if (local42 != local160) {
								@Pc(223) int local223 = local40 + local34;
								if (local223 < 0) {
									local223 += Static151.anInt2711;
								}
								if (Static151.anInt2711 < local223) {
									local223 -= Static151.anInt2711;
								}
								for (@Pc(238) int local238 = 1; local238 <= local166; local238++) {
									@Pc(248) int[] local248 = local111[(local238 + local42) % local48];
									local188 = Math.max(local188, local248[2]);
								}
								for (@Pc(264) int local264 = 0; local264 <= local166; local264++) {
									@Pc(274) int[] local274 = local111[(local42 + local264) % local48];
									@Pc(278) int local278 = local274[2];
									if (local188 != local278) {
										@Pc(289) int local289 = local274[0];
										@Pc(293) int local293 = local274[1];
										@Pc(300) int local300;
										@Pc(304) int local304;
										if (local223 < local171) {
											local300 = Math.max(local223, local289);
											local304 = Math.min(local171, local293);
										} else if (local289 == 0) {
											local300 = 0;
											local304 = Math.min(local171, local293);
										} else {
											local300 = Math.max(local223, local289);
											local304 = Static151.anInt2711;
										}
										this.method704(local32, local118, local38 + local300, local278, local188 - local278, local304 - local300);
									}
								}
							}
							local42 = local160;
							break;
						}
						local160++;
						if (local160 >= local48) {
							local160 = 0;
						}
						local166++;
					}
				}
				if (local139 + local188 > Static372.anInt6520) {
					local139 = Static372.anInt6520 - local188;
				} else {
					local44 = false;
				}
				@Pc(376) int[] local376;
				if (local143 == Static151.anInt2711) {
					this.method704(local32, local118, local40 + local36, local188, local139, local128);
					if (local44) {
						return local11;
					}
					local44 = true;
					local376 = local107[local50++];
					local376[1] = local143;
					local376[2] = local139 + local188;
					local376[0] = local40;
					@Pc(443) int[][] local443 = local111;
					local111 = local107;
					local48 = local50;
					local107 = local443;
					local50 = 0;
					local38 = local36;
					local36 = Static367.method5542(Static151.anInt2711, local118);
					local40 = 0;
					local34 = local36 - local38;
					local166 = local34;
					if (local34 < 0) {
						local166 = local34 + Static151.anInt2711;
					}
					local42 = 0;
					if (local166 > Static151.anInt2711) {
						local166 -= Static151.anInt2711;
					}
					while (true) {
						@Pc(486) int[] local486 = local111[local42];
						if (local166 >= local486[0] && local486[1] >= local166) {
							local46 = false;
							break;
						}
						local42++;
						if (local42 >= local48) {
							local42 = 0;
						}
					}
				} else {
					local376 = local107[local50++];
					local376[2] = local139 + local188;
					local376[1] = local143;
					local376[0] = local40;
					this.method704(local32, local118, local40 + local36, local188, local139, local128);
					local40 = local143;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
	}
}
