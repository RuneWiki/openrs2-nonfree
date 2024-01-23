import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class4_Sub6_Sub20 extends Class4_Sub6 {

	@OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
	private int anInt3347;

	@OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
	private int anInt3345 = 1024;

	@OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
	private int anInt3352 = 819;

	@OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
	private int anInt3344 = 1024;

	@OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
	private int anInt3353 = 1024;

	@OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
	private int anInt3355 = 409;

	@OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
	private int anInt3354 = 2048;

	@OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
	private int anInt3341 = 0;

	@OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
	private int anInt3360 = 1024;

	@OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
	private int anInt3358 = 0;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([[IIILjava/util/Random;III)V")
	private void method2657(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Random arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) int local33 = this.anInt3345 > 0 ? 4096 - Static241.method3695(this.anInt3345, arg3) : 4096;
		@Pc(41) int local41 = this.anInt3353 * this.anInt3347 >> 12;
		@Pc(57) int local57 = this.anInt3347 - (local41 > 0 ? Static241.method3695(local41, arg3) : 0);
		if (Static2.anInt19 <= arg4) {
			arg4 -= Static2.anInt19;
		}
		@Pc(93) int local93;
		@Pc(97) int local97;
		if (local57 > 0) {
			if (arg5 <= 0 || arg2 <= 0) {
				return;
			}
			local93 = arg2 / 2;
			local97 = arg5 / 2;
			@Pc(108) int local108 = local57 > local93 ? local93 : local57;
			@Pc(115) int local115 = local97 >= local57 ? local57 : local97;
			@Pc(120) int local120 = arg4 + local108;
			@Pc(127) int local127 = arg2 - local108 * 2;
			for (@Pc(129) int local129 = 0; local129 < arg5; local129++) {
				@Pc(143) int[] local143 = arg0[local129 + arg1];
				@Pc(157) int local157;
				@Pc(165) int local165;
				@Pc(178) int local178;
				if (local129 >= local115) {
					local157 = arg5 - local129 - 1;
					if (local157 >= local115) {
						for (local165 = 0; local165 < local108; local165++) {
							local143[local165 + arg4 & Static168.anInt3337] = local143[Static168.anInt3337 & arg2 + arg4 - local165 - 1] = local33 * local165 / local108;
						}
						if (local120 + local127 > Static2.anInt19) {
							local165 = Static2.anInt19 - local120;
							Static307.method3249(local143, local120, local165, local33);
							Static307.method3249(local143, 0, local127 - local165, local33);
						} else {
							Static307.method3249(local143, local120, local127, local33);
						}
					} else {
						local165 = local157 * local33 / local115;
						@Pc(326) int local326;
						if (this.anInt3358 == 0) {
							for (local178 = 0; local178 < local108; local178++) {
								local326 = local33 * local178 / local108;
								local143[local178 + arg4 & Static168.anInt3337] = local143[arg2 + arg4 - local178 - 1 & Static168.anInt3337] = local165 * local326 >> 12;
							}
						} else {
							for (local178 = 0; local178 < local108; local178++) {
								local326 = local33 * local178 / local108;
								local143[Static168.anInt3337 & local178 + arg4] = local143[arg2 + arg4 - local178 - 1 & Static168.anInt3337] = local165 > local326 ? local326 : local165;
							}
						}
						if (Static2.anInt19 < local127 + local120) {
							local178 = Static2.anInt19 - local120;
							Static307.method3249(local143, local120, local178, local165);
							Static307.method3249(local143, 0, local127 - local178, local165);
						} else {
							Static307.method3249(local143, local120, local127, local165);
						}
					}
				} else {
					local157 = local33 * local129 / local115;
					if (this.anInt3358 == 0) {
						for (local165 = 0; local165 < local108; local165++) {
							local178 = local165 * local33 / local108;
							local143[arg4 + local165 & Static168.anInt3337] = local143[Static168.anInt3337 & arg2 + arg4 - local165 - 1] = local157 * local178 >> 12;
						}
					} else {
						for (local165 = 0; local165 < local108; local165++) {
							local178 = local165 * local33 / local108;
							local143[local165 + arg4 & Static168.anInt3337] = local143[arg2 + arg4 - local165 - 1 & Static168.anInt3337] = local157 > local178 ? local178 : local157;
						}
					}
					if (local127 + local120 > Static2.anInt19) {
						local165 = Static2.anInt19 - local120;
						Static307.method3249(local143, local120, local165, local157);
						Static307.method3249(local143, 0, local127 - local165, local157);
					} else {
						Static307.method3249(local143, local120, local127, local157);
					}
				}
			}
		} else if (arg2 + arg4 > Static2.anInt19) {
			local93 = Static2.anInt19 - arg4;
			for (local97 = 0; local97 < arg5; local97++) {
				@Pc(534) int[] local534 = arg0[local97 + arg1];
				Static307.method3249(local534, arg4, local93, local33);
				Static307.method3249(local534, 0, arg2 - local93, local33);
			}
		} else {
			for (local93 = 0; local93 < arg5; local93++) {
				Static307.method3249(arg0[arg1 + local93], arg4, arg2, local33);
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass156_41.method3763(arg0);
		if (!this.aClass156_41.aBoolean307) {
			return local11;
		}
		@Pc(27) int[][] local27 = this.aClass156_41.method3755();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) boolean local43 = true;
		@Pc(50) int local50 = Static2.anInt19 * this.anInt3344 >> 12;
		@Pc(52) int local52 = 0;
		@Pc(59) int local59 = Static2.anInt19 * this.anInt3354 >> 12;
		@Pc(66) int local66 = this.anInt3355 * Static16.anInt308 >> 12;
		@Pc(73) int local73 = this.anInt3352 * Static16.anInt308 >> 12;
		if (local73 <= 1) {
			return local27[arg0];
		}
		this.anInt3347 = Static2.anInt19 / 8 * this.anInt3360 >> 12;
		@Pc(98) int local98 = Static2.anInt19 / local50 + 1;
		@Pc(102) int[][] local102 = new int[local98][3];
		@Pc(106) int[][] local106 = new int[local98][3];
		@Pc(113) Random local113 = new Random((long) this.anInt3341);
		while (true) {
			while (true) {
				@Pc(123) int local123 = local50 + Static241.method3695(local59 - local50, local113);
				@Pc(134) int local134 = local66 + Static241.method3695(local73 - local66, local113);
				@Pc(138) int local138 = local123 + local33;
				if (Static2.anInt19 < local138) {
					local123 = Static2.anInt19 - local33;
					local138 = Static2.anInt19;
				}
				@Pc(151) int local151;
				@Pc(165) int local165;
				if (local43) {
					local151 = 0;
				} else {
					@Pc(155) int local155 = local37;
					@Pc(159) int[] local159 = local106[local37];
					local151 = local159[2];
					local165 = 0;
					@Pc(169) int local169 = local138 + local29;
					if (local169 < 0) {
						local169 += Static2.anInt19;
					}
					if (local169 > Static2.anInt19) {
						local169 -= Static2.anInt19;
					}
					while (true) {
						@Pc(189) int[] local189 = local106[local155];
						if (local189[0] <= local169 && local189[1] >= local169) {
							if (local37 != local155) {
								@Pc(225) int local225 = local33 + local29;
								if (local225 < 0) {
									local225 += Static2.anInt19;
								}
								if (Static2.anInt19 < local225) {
									local225 -= Static2.anInt19;
								}
								@Pc(243) int local243;
								@Pc(258) int[] local258;
								for (local243 = 1; local243 <= local165; local243++) {
									local258 = local106[(local243 + local37) % local52];
									local151 = Math.max(local151, local258[2]);
								}
								for (local243 = 0; local243 <= local165; local243++) {
									local258 = local106[(local37 + local243) % local52];
									@Pc(289) int local289 = local258[2];
									if (local151 != local289) {
										@Pc(301) int local301 = local258[0];
										@Pc(305) int local305 = local258[1];
										@Pc(315) int local315;
										@Pc(319) int local319;
										if (local225 < local169) {
											local315 = Math.max(local225, local301);
											local319 = Math.min(local169, local305);
										} else if (local301 == 0) {
											local315 = 0;
											local319 = Math.min(local169, local305);
										} else {
											local315 = Math.max(local225, local301);
											local319 = Static2.anInt19;
										}
										this.method2657(local27, local289, local319 - local315, local113, local315 + local35, local151 - local289);
									}
								}
							}
							local37 = local155;
							break;
						}
						local165++;
						@Pc(209) int local209 = ~local52;
						local155++;
						if (local209 >= ~local155) {
							local155 = 0;
						}
					}
				}
				if (local151 + local134 > Static16.anInt308) {
					local134 = Static16.anInt308 - local151;
				} else {
					local39 = false;
				}
				@Pc(385) int[] local385;
				if (local138 == Static2.anInt19) {
					this.method2657(local27, local151, local123, local113, local31 + local33, local134);
					if (local39) {
						return local11;
					}
					local39 = true;
					local35 = local31;
					local37 = 0;
					local385 = local102[local41++];
					local52 = local41;
					local43 = false;
					local385[1] = local138;
					local385[0] = local33;
					local33 = 0;
					local41 = 0;
					@Pc(458) int[][] local458 = local106;
					local106 = local102;
					local102 = local458;
					local385[2] = local134 + local151;
					local31 = Static241.method3695(Static2.anInt19, local113);
					local29 = local31 - local35;
					local165 = local29;
					if (local29 < 0) {
						local165 = local29 + Static2.anInt19;
					}
					if (Static2.anInt19 < local165) {
						local165 -= Static2.anInt19;
					}
					while (true) {
						@Pc(505) int[] local505 = local106[local37];
						if (local505[0] <= local165 && local505[1] >= local165) {
							break;
						}
						local37++;
						if (local52 <= local37) {
							local37 = 0;
						}
					}
				} else {
					local385 = local102[local41++];
					local385[1] = local138;
					local385[0] = local33;
					local385[2] = local151 + local134;
					this.method2657(local27, local151, local123, local113, local33 + local31, local134);
					local33 = local138;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3341 = arg0.method1874();
		} else if (arg1 == 1) {
			this.anInt3344 = arg0.method1837();
		} else if (arg1 == 2) {
			this.anInt3354 = arg0.method1837();
		} else if (arg1 == 3) {
			this.anInt3355 = arg0.method1837();
		} else if (arg1 == 4) {
			this.anInt3352 = arg0.method1837();
		} else if (arg1 == 5) {
			this.anInt3360 = arg0.method1837();
		} else if (arg1 == 6) {
			this.anInt3358 = arg0.method1874();
		} else if (arg1 == 7) {
			this.anInt3353 = arg0.method1837();
		} else if (arg1 == 8) {
			this.anInt3345 = arg0.method1837();
		}
	}
}
