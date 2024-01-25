import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class6_Sub3_Sub16 extends Class6_Sub3 {

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
	private int anInt3013;

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
	private int anInt3015 = 1024;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
	private int anInt3012 = 0;

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
	private int anInt3022 = 2048;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
	private int anInt3020 = 409;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
	private int anInt3010 = 1024;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
	private int anInt3025 = 819;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
	private int anInt3023 = 1024;

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
	private int anInt3024 = 1024;

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
	private int anInt3026 = 0;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII[[IILjava/util/Random;)V")
	private void method2623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(6) Random arg5) {
		@Pc(25) int local25 = this.anInt3010 > 0 ? 4096 - Static309.method4643(arg5, this.anInt3010) : 4096;
		@Pc(33) int local33 = this.anInt3013 * this.anInt3015 >> 12;
		@Pc(48) int local48 = this.anInt3013 - (local33 > 0 ? Static309.method4643(arg5, local33) : 0);
		if (Static35.anInt670 <= arg1) {
			arg1 -= Static35.anInt670;
		}
		@Pc(69) int local69;
		@Pc(91) int local91;
		if (local48 <= 0) {
			if (Static35.anInt670 >= arg1 + arg0) {
				for (local69 = 0; local69 < arg2; local69++) {
					Static596.method7718(arg4[arg3 + local69], arg1, arg0, local25);
				}
			} else {
				local69 = Static35.anInt670 - arg1;
				for (local91 = 0; local91 < arg2; local91++) {
					@Pc(99) int[] local99 = arg4[local91 + arg3];
					Static596.method7718(local99, arg1, local69, local25);
					Static596.method7718(local99, 0, arg0 - local69, local25);
				}
			}
		} else if (arg2 > 0 && arg0 > 0) {
			local69 = arg0 / 2;
			local91 = arg2 / 2;
			@Pc(141) int local141 = local69 >= local48 ? local48 : local69;
			@Pc(152) int local152 = local48 <= local91 ? local48 : local91;
			@Pc(156) int local156 = local141 + arg1;
			@Pc(162) int local162 = arg0 - local141 * 2;
			for (@Pc(164) int local164 = 0; local164 < arg2; local164++) {
				@Pc(172) int[] local172 = arg4[local164 + arg3];
				@Pc(185) int local185;
				@Pc(193) int local193;
				@Pc(201) int local201;
				if (local152 > local164) {
					local185 = local164 * local25 / local152;
					if (this.anInt3012 == 0) {
						for (local193 = 0; local193 < local141; local193++) {
							local201 = local193 * local25 / local141;
							local172[Static147.anInt2781 & arg1 + local193] = local172[arg0 + arg1 - local193 - 1 & Static147.anInt2781] = local185 * local201 >> 12;
						}
					} else {
						for (local193 = 0; local193 < local141; local193++) {
							local201 = local193 * local25 / local141;
							local172[arg1 + local193 & Static147.anInt2781] = local172[arg0 + arg1 - local193 - 1 & Static147.anInt2781] = local185 <= local201 ? local185 : local201;
						}
					}
					if (Static35.anInt670 >= local156 + local162) {
						Static596.method7718(local172, local156, local162, local185);
					} else {
						local193 = Static35.anInt670 - local156;
						Static596.method7718(local172, local156, local193, local185);
						Static596.method7718(local172, 0, local162 - local193, local185);
					}
				} else {
					local185 = arg2 - local164 - 1;
					if (local152 > local185) {
						local193 = local25 * local185 / local152;
						@Pc(348) int local348;
						if (this.anInt3012 == 0) {
							for (local201 = 0; local201 < local141; local201++) {
								local348 = local201 * local25 / local141;
								local172[Static147.anInt2781 & local201 + arg1] = local172[Static147.anInt2781 & arg1 + arg0 - local201 - 1] = local348 * local193 >> 12;
							}
						} else {
							for (local201 = 0; local201 < local141; local201++) {
								local348 = local25 * local201 / local141;
								local172[local201 + arg1 & Static147.anInt2781] = local172[arg1 + arg0 - local201 - 1 & Static147.anInt2781] = local348 < local193 ? local348 : local193;
							}
						}
						if (local156 + local162 > Static35.anInt670) {
							local201 = Static35.anInt670 - local156;
							Static596.method7718(local172, local156, local201, local193);
							Static596.method7718(local172, 0, local162 - local201, local193);
						} else {
							Static596.method7718(local172, local156, local162, local193);
						}
					} else {
						for (local193 = 0; local193 < local141; local193++) {
							local172[local193 + arg1 & Static147.anInt2781] = local172[arg0 + arg1 - local193 - 1 & Static147.anInt2781] = local25 * local193 / local141;
						}
						if (local162 + local156 <= Static35.anInt670) {
							Static596.method7718(local172, local156, local162, local25);
						} else {
							local201 = Static35.anInt670 - local156;
							Static596.method7718(local172, local156, local201, local25);
							Static596.method7718(local172, 0, local162 - local201, local25);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt3026 = arg1.method6019();
		} else if (arg0 == 1) {
			this.anInt3023 = arg1.method6044();
		} else if (arg0 == 2) {
			this.anInt3022 = arg1.method6044();
		} else if (arg0 == 3) {
			this.anInt3020 = arg1.method6044();
		} else if (arg0 == 4) {
			this.anInt3025 = arg1.method6044();
		} else if (arg0 == 5) {
			this.anInt3024 = arg1.method6044();
		} else if (arg0 == 6) {
			this.anInt3012 = arg1.method6019();
		} else if (arg0 == 7) {
			this.anInt3015 = arg1.method6044();
		} else if (arg0 == 8) {
			this.anInt3010 = arg1.method6044();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3408(arg0);
		if (!super.aClass137_41.aBoolean306) {
			return local11;
		}
		@Pc(26) int[][] local26 = super.aClass137_41.method3413();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt3023 * Static35.anInt670 >> 12;
		@Pc(58) int local58 = Static35.anInt670 * this.anInt3022 >> 12;
		@Pc(65) int local65 = this.anInt3020 * Static170.anInt3133 >> 12;
		@Pc(72) int local72 = Static170.anInt3133 * this.anInt3025 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt3013 = Static35.anInt670 / 8 * this.anInt3024 >> 12;
		@Pc(97) int local97 = Static35.anInt670 / local51 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt3026);
		while (true) {
			while (true) {
				@Pc(121) int local121 = Static309.method4643(local112, local58 - local51) + local51;
				@Pc(131) int local131 = Static309.method4643(local112, local72 - local65) + local65;
				@Pc(135) int local135 = local121 + local34;
				if (Static35.anInt670 < local135) {
					local121 = Static35.anInt670 - local34;
					local135 = Static35.anInt670;
				}
				@Pc(149) int local149;
				@Pc(159) int local159;
				if (local40) {
					local149 = 0;
				} else {
					@Pc(153) int local153 = local36;
					@Pc(157) int[] local157 = local105[local36];
					local159 = 0;
					@Pc(163) int local163 = local28 + local135;
					if (local163 < 0) {
						local163 += Static35.anInt670;
					}
					if (local163 > Static35.anInt670) {
						local163 -= Static35.anInt670;
					}
					local149 = local157[2];
					while (true) {
						@Pc(191) int[] local191 = local105[local153];
						if (local191[0] <= local163 && local191[1] >= local163) {
							if (local153 != local36) {
								@Pc(221) int local221 = local34 + local28;
								if (local221 < 0) {
									local221 += Static35.anInt670;
								}
								if (Static35.anInt670 < local221) {
									local221 -= Static35.anInt670;
								}
								for (@Pc(239) int local239 = 1; local239 <= local159; local239++) {
									@Pc(249) int[] local249 = local105[(local36 + local239) % local42];
									local149 = Math.max(local149, local249[2]);
								}
								for (@Pc(265) int local265 = 0; local265 <= local159; local265++) {
									@Pc(275) int[] local275 = local105[(local265 + local36) % local42];
									@Pc(279) int local279 = local275[2];
									if (local149 != local279) {
										@Pc(290) int local290 = local275[0];
										@Pc(294) int local294 = local275[1];
										@Pc(305) int local305;
										@Pc(309) int local309;
										if (local221 < local163) {
											local305 = Math.max(local221, local290);
											local309 = Math.min(local163, local294);
										} else if (local290 == 0) {
											local305 = 0;
											local309 = Math.min(local163, local294);
										} else {
											local305 = Math.max(local221, local290);
											local309 = Static35.anInt670;
										}
										this.method2623(local309 - local305, local32 + local305, local149 - local279, local279, local26, local112);
									}
								}
							}
							local36 = local153;
							break;
						}
						@Pc(204) int local204 = ~local42;
						local153++;
						if (local204 >= ~local153) {
							local153 = 0;
						}
						local159++;
					}
				}
				if (local131 + local149 > Static170.anInt3133) {
					local131 = Static170.anInt3133 - local149;
				} else {
					local38 = false;
				}
				@Pc(374) int[] local374;
				if (Static35.anInt670 == local135) {
					this.method2623(local121, local34 + local30, local131, local149, local26, local112);
					if (local38) {
						return local11;
					}
					local38 = true;
					local374 = local101[local44++];
					local374[2] = local131 + local149;
					local374[1] = local135;
					local374[0] = local34;
					@Pc(440) int[][] local440 = local105;
					local105 = local101;
					local42 = local44;
					local101 = local440;
					local44 = 0;
					local32 = local30;
					local30 = Static309.method4643(local112, Static35.anInt670);
					local28 = local30 - local32;
					local34 = 0;
					local159 = local28;
					if (local28 < 0) {
						local159 = local28 + Static35.anInt670;
					}
					if (local159 > Static35.anInt670) {
						local159 -= Static35.anInt670;
					}
					local36 = 0;
					while (true) {
						@Pc(486) int[] local486 = local105[local36];
						if (local159 >= local486[0] && local159 <= local486[1]) {
							local40 = false;
							break;
						}
						local36++;
						if (local36 >= local42) {
							local36 = 0;
						}
					}
				} else {
					local374 = local101[local44++];
					local374[2] = local149 + local131;
					local374[1] = local135;
					local374[0] = local34;
					this.method2623(local121, local30 + local34, local131, local149, local26, local112);
					local34 = local135;
				}
			}
		}
	}
}
