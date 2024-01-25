import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class6_Sub3_Sub18 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
	private int anInt4199;

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
	private int anInt4193 = 0;

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
	private int anInt4195 = 1024;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
	private int anInt4200 = 2048;

	@OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
	private int anInt4198 = 1024;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
	private int anInt4196 = 409;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
	private int anInt4194 = 819;

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
	private int anInt4197 = 0;

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
	private int anInt4205 = 1024;

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
	private int anInt4192 = 1024;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (!super.aClass174_41.aBoolean271) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass174_41.method3727();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt4198 * Static447.anInt8568 >> 12;
		@Pc(52) int local52 = Static447.anInt8568 * this.anInt4200 >> 12;
		@Pc(59) int local59 = Static495.anInt8251 * this.anInt4196 >> 12;
		@Pc(66) int local66 = this.anInt4194 * Static495.anInt8251 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt4199 = Static447.anInt8568 / 8 * this.anInt4205 >> 12;
		@Pc(89) int local89 = Static447.anInt8568 / local45 + 1;
		@Pc(93) int[][] local93 = new int[local89][3];
		@Pc(97) int[][] local97 = new int[local89][3];
		@Pc(104) Random local104 = new Random((long) this.anInt4193);
		while (true) {
			while (true) {
				@Pc(113) int local113 = Static29.method431(local52 - local45, local104) + local45;
				@Pc(123) int local123 = local59 + Static29.method431(local66 - local59, local104);
				@Pc(127) int local127 = local28 + local113;
				if (local127 > Static447.anInt8568) {
					local113 = Static447.anInt8568 - local28;
					local127 = Static447.anInt8568;
				}
				@Pc(175) int local175;
				@Pc(147) int local147;
				if (local34) {
					local175 = 0;
				} else {
					@Pc(141) int local141 = local30;
					@Pc(145) int[] local145 = local97[local30];
					local147 = 0;
					@Pc(151) int local151 = local22 + local127;
					if (local151 < 0) {
						local151 += Static447.anInt8568;
					}
					if (Static447.anInt8568 < local151) {
						local151 -= Static447.anInt8568;
					}
					local175 = local145[2];
					while (true) {
						@Pc(179) int[] local179 = local97[local141];
						if (local179[0] <= local151 && local151 <= local179[1]) {
							if (local30 != local141) {
								@Pc(213) int local213 = local22 + local28;
								if (local213 < 0) {
									local213 += Static447.anInt8568;
								}
								if (local213 > Static447.anInt8568) {
									local213 -= Static447.anInt8568;
								}
								for (@Pc(232) int local232 = 1; local232 <= local147; local232++) {
									@Pc(242) int[] local242 = local97[(local232 + local30) % local36];
									local175 = Math.max(local175, local242[2]);
								}
								for (@Pc(254) int local254 = 0; local254 <= local147; local254++) {
									@Pc(264) int[] local264 = local97[(local254 + local30) % local36];
									@Pc(268) int local268 = local264[2];
									if (local268 != local175) {
										@Pc(279) int local279 = local264[0];
										@Pc(283) int local283 = local264[1];
										@Pc(297) int local297;
										@Pc(295) int local295;
										if (local213 < local151) {
											local297 = Math.max(local213, local279);
											local295 = Math.min(local151, local283);
										} else if (local279 == 0) {
											local295 = Math.min(local151, local283);
											local297 = 0;
										} else {
											local297 = Math.max(local213, local279);
											local295 = Static447.anInt8568;
										}
										this.method3610(local20, local104, local268, local297 + local26, local295 + -local297, local175 - local268);
									}
								}
							}
							local30 = local141;
							break;
						}
						local147++;
						local141++;
						if (local141 >= local36) {
							local141 = 0;
						}
					}
				}
				if (local175 + local123 <= Static495.anInt8251) {
					local32 = false;
				} else {
					local123 = Static495.anInt8251 - local175;
				}
				@Pc(365) int[] local365;
				if (local127 == Static447.anInt8568) {
					this.method3610(local20, local104, local175, local28 + local24, local113, local123);
					if (local32) {
						return local11;
					}
					local32 = true;
					local365 = local93[local38++];
					local365[2] = local175 + local123;
					local365[0] = local28;
					local365[1] = local127;
					@Pc(432) int[][] local432 = local97;
					local97 = local93;
					local36 = local38;
					local93 = local432;
					local26 = local24;
					local38 = 0;
					local24 = Static29.method431(Static447.anInt8568, local104);
					local28 = 0;
					local22 = local24 - local26;
					local147 = local22;
					if (local22 < 0) {
						local147 = local22 + Static447.anInt8568;
					}
					local30 = 0;
					if (local147 > Static447.anInt8568) {
						local147 -= Static447.anInt8568;
					}
					while (true) {
						@Pc(478) int[] local478 = local97[local30];
						if (local147 >= local478[0] && local478[1] >= local147) {
							local34 = false;
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local365 = local93[local38++];
					local365[2] = local175 + local123;
					local365[0] = local28;
					local365[1] = local127;
					this.method3610(local20, local104, local175, local24 + local28, local113, local123);
					local28 = local127;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt4193 = arg1.method6041();
		} else if (arg0 == 1) {
			this.anInt4198 = arg1.method6006();
		} else if (arg0 == 2) {
			this.anInt4200 = arg1.method6006();
		} else if (arg0 == 3) {
			this.anInt4196 = arg1.method6006();
		} else if (arg0 == 4) {
			this.anInt4194 = arg1.method6006();
		} else if (arg0 == 5) {
			this.anInt4205 = arg1.method6006();
		} else if (arg0 == 6) {
			this.anInt4197 = arg1.method6041();
		} else if (arg0 == 7) {
			this.anInt4195 = arg1.method6006();
		} else if (arg0 == 8) {
			this.anInt4192 = arg1.method6006();
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([[ILjava/util/Random;BIIII)V")
	private void method3610(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Random arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt4192 > 0 ? 4096 - Static29.method431(this.anInt4192, arg1) : 4096;
		@Pc(32) int local32 = this.anInt4195 * this.anInt4199 >> 12;
		@Pc(47) int local47 = this.anInt4199 - (local32 <= 0 ? 0 : Static29.method431(local32, arg1));
		if (arg3 >= Static447.anInt8568) {
			arg3 -= Static447.anInt8568;
		}
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (local47 <= 0) {
			if (Static447.anInt8568 < arg3 + arg4) {
				local66 = Static447.anInt8568 - arg3;
				for (local68 = 0; local68 < arg5; local68++) {
					@Pc(76) int[] local76 = arg0[local68 + arg2];
					Static585.method3075(local76, arg3, local66, local19);
					Static585.method3075(local76, 0, arg4 - local66, local19);
				}
			} else {
				for (local66 = 0; local66 < arg5; local66++) {
					Static585.method3075(arg0[arg2 + local66], arg3, arg4, local19);
				}
			}
		} else if (arg5 > 0 && arg4 > 0) {
			local66 = arg4 / 2;
			local68 = arg5 / 2;
			@Pc(140) int local140 = local47 > local66 ? local66 : local47;
			@Pc(147) int local147 = local47 > local68 ? local68 : local47;
			@Pc(151) int local151 = local140 + arg3;
			@Pc(157) int local157 = arg4 - local140 * 2;
			for (@Pc(159) int local159 = 0; local159 < arg5; local159++) {
				@Pc(167) int[] local167 = arg0[arg2 + local159];
				@Pc(176) int local176;
				@Pc(181) int local181;
				@Pc(189) int local189;
				if (local159 < local147) {
					local176 = local159 * local19 / local147;
					if (this.anInt4197 == 0) {
						for (local181 = 0; local181 < local140; local181++) {
							local189 = local181 * local19 / local140;
							local167[arg3 + local181 & Static392.anInt6966] = local167[Static392.anInt6966 & arg4 + arg3 - local181 - 1] = local176 * local189 >> 12;
						}
					} else {
						for (local181 = 0; local181 < local140; local181++) {
							local189 = local19 * local181 / local140;
							local167[Static392.anInt6966 & arg3 + local181] = local167[arg3 + arg4 - local181 - 1 & Static392.anInt6966] = local189 >= local176 ? local176 : local189;
						}
					}
					if (Static447.anInt8568 < local157 + local151) {
						local181 = Static447.anInt8568 - local151;
						Static585.method3075(local167, local151, local181, local176);
						Static585.method3075(local167, 0, local157 - local181, local176);
					} else {
						Static585.method3075(local167, local151, local157, local176);
					}
				} else {
					local176 = arg5 - local159 - 1;
					if (local147 > local176) {
						local181 = local19 * local176 / local147;
						@Pc(335) int local335;
						if (this.anInt4197 == 0) {
							for (local189 = 0; local189 < local140; local189++) {
								local335 = local189 * local19 / local140;
								local167[arg3 + local189 & Static392.anInt6966] = local167[Static392.anInt6966 & arg3 + arg4 - local189 - 1] = local335 * local181 >> 12;
							}
						} else {
							for (local189 = 0; local189 < local140; local189++) {
								local335 = local189 * local19 / local140;
								local167[Static392.anInt6966 & arg3 + local189] = local167[arg3 + arg4 - local189 - 1 & Static392.anInt6966] = local181 > local335 ? local335 : local181;
							}
						}
						if (Static447.anInt8568 >= local151 + local157) {
							Static585.method3075(local167, local151, local157, local181);
						} else {
							local189 = Static447.anInt8568 - local151;
							Static585.method3075(local167, local151, local189, local181);
							Static585.method3075(local167, 0, local157 - local189, local181);
						}
					} else {
						for (local181 = 0; local181 < local140; local181++) {
							local167[Static392.anInt6966 & local181 + arg3] = local167[Static392.anInt6966 & arg4 + arg3 - local181 - 1] = local181 * local19 / local140;
						}
						if (local151 + local157 > Static447.anInt8568) {
							local189 = Static447.anInt8568 - local151;
							Static585.method3075(local167, local151, local189, local19);
							Static585.method3075(local167, 0, local157 - local189, local19);
						} else {
							Static585.method3075(local167, local151, local157, local19);
						}
					}
				}
			}
		}
	}
}
