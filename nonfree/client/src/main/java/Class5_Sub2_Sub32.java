import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class5_Sub2_Sub32 extends Class5_Sub2 {

	@OriginalMember(owner = "client!uea", name = "L", descriptor = "I")
	private int anInt9763;

	@OriginalMember(owner = "client!uea", name = "H", descriptor = "I")
	private int anInt9759 = 1024;

	@OriginalMember(owner = "client!uea", name = "K", descriptor = "I")
	private int anInt9762 = 819;

	@OriginalMember(owner = "client!uea", name = "M", descriptor = "I")
	private int anInt9764 = 2048;

	@OriginalMember(owner = "client!uea", name = "J", descriptor = "I")
	private int anInt9761 = 0;

	@OriginalMember(owner = "client!uea", name = "I", descriptor = "I")
	private int anInt9760 = 409;

	@OriginalMember(owner = "client!uea", name = "N", descriptor = "I")
	private int anInt9765 = 0;

	@OriginalMember(owner = "client!uea", name = "R", descriptor = "I")
	private int anInt9769 = 1024;

	@OriginalMember(owner = "client!uea", name = "P", descriptor = "I")
	private int anInt9767 = 1024;

	@OriginalMember(owner = "client!uea", name = "T", descriptor = "I")
	private int anInt9771 = 1024;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Ljava/util/Random;I[[IIIII)V")
	private void method8152(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21 = this.anInt9767 <= 0 ? 4096 : 4096 - Static508.method7270(this.anInt9767, arg0);
		@Pc(37) int local37 = this.anInt9771 * this.anInt9763 >> 12;
		@Pc(53) int local53 = this.anInt9763 - (local37 > 0 ? Static508.method7270(local37, arg0) : 0);
		if (arg4 >= Static195.anInt3759) {
			arg4 -= Static195.anInt3759;
		}
		@Pc(69) int local69;
		@Pc(97) int local97;
		if (local53 <= 0) {
			if (Static195.anInt3759 >= arg5 + arg4) {
				for (local69 = 0; local69 < arg3; local69++) {
					Static686.method4970(arg2[arg1 + local69], arg4, arg5, local21);
				}
			} else {
				local69 = Static195.anInt3759 - arg4;
				for (local97 = 0; local97 < arg3; local97++) {
					@Pc(105) int[] local105 = arg2[arg1 + local97];
					Static686.method4970(local105, arg4, local69, local21);
					Static686.method4970(local105, 0, arg5 - local69, local21);
				}
			}
		} else if (arg3 > 0 && arg5 > 0) {
			local69 = arg5 / 2;
			local97 = arg3 / 2;
			@Pc(149) int local149 = local53 > local69 ? local69 : local53;
			@Pc(160) int local160 = local97 >= local53 ? local53 : local97;
			@Pc(164) int local164 = local149 + arg4;
			@Pc(170) int local170 = arg5 - local149 * 2;
			for (@Pc(172) int local172 = 0; local172 < arg3; local172++) {
				@Pc(180) int[] local180 = arg2[arg1 + local172];
				@Pc(193) int local193;
				@Pc(198) int local198;
				@Pc(206) int local206;
				if (local160 > local172) {
					local193 = local21 * local172 / local160;
					if (this.anInt9761 == 0) {
						for (local198 = 0; local198 < local149; local198++) {
							local206 = local21 * local198 / local149;
							local180[arg4 + local198 & Static388.anInt6925] = local180[Static388.anInt6925 & arg5 + arg4 - local198 - 1] = local206 * local193 >> 12;
						}
					} else {
						for (local198 = 0; local198 < local149; local198++) {
							local206 = local198 * local21 / local149;
							local180[Static388.anInt6925 & local198 + arg4] = local180[arg4 + arg5 - local198 - 1 & Static388.anInt6925] = local193 > local206 ? local206 : local193;
						}
					}
					if (local170 + local164 > Static195.anInt3759) {
						local198 = Static195.anInt3759 - local164;
						Static686.method4970(local180, local164, local198, local193);
						Static686.method4970(local180, 0, local170 - local198, local193);
					} else {
						Static686.method4970(local180, local164, local170, local193);
					}
				} else {
					local193 = arg3 - local172 - 1;
					if (local160 > local193) {
						local198 = local21 * local193 / local160;
						@Pc(356) int local356;
						if (this.anInt9761 == 0) {
							for (local206 = 0; local206 < local149; local206++) {
								local356 = local206 * local21 / local149;
								local180[Static388.anInt6925 & local206 + arg4] = local180[Static388.anInt6925 & arg5 + arg4 - local206 - 1] = local356 * local198 >> 12;
							}
						} else {
							for (local206 = 0; local206 < local149; local206++) {
								local356 = local21 * local206 / local149;
								local180[arg4 + local206 & Static388.anInt6925] = local180[Static388.anInt6925 & arg5 + arg4 - local206 - 1] = local198 <= local356 ? local198 : local356;
							}
						}
						if (local170 + local164 > Static195.anInt3759) {
							local206 = Static195.anInt3759 - local164;
							Static686.method4970(local180, local164, local206, local198);
							Static686.method4970(local180, 0, local170 - local206, local198);
						} else {
							Static686.method4970(local180, local164, local170, local198);
						}
					} else {
						for (local198 = 0; local198 < local149; local198++) {
							local180[Static388.anInt6925 & arg4 + local198] = local180[arg4 + arg5 - local198 - 1 & Static388.anInt6925] = local21 * local198 / local149;
						}
						if (local164 + local170 > Static195.anInt3759) {
							local206 = Static195.anInt3759 - local164;
							Static686.method4970(local180, local164, local206, local21);
							Static686.method4970(local180, 0, local170 - local206, local21);
						} else {
							Static686.method4970(local180, local164, local170, local21);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9765 = arg0.method7816();
		} else if (arg1 == 1) {
			this.anInt9759 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt9764 = arg0.method7860();
		} else if (arg1 == 3) {
			this.anInt9760 = arg0.method7860();
		} else if (arg1 == 4) {
			this.anInt9762 = arg0.method7860();
		} else if (arg1 == 5) {
			this.anInt9769 = arg0.method7860();
		} else if (arg1 == 6) {
			this.anInt9761 = arg0.method7816();
		} else if (arg1 == 7) {
			this.anInt9771 = arg0.method7860();
		} else if (arg1 == 8) {
			this.anInt9767 = arg0.method7860();
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass333_41.method7747(arg0);
		if (!super.aClass333_41.aBoolean779) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass333_41.method7746();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt9759 * Static195.anInt3759 >> 12;
		@Pc(58) int local58 = Static195.anInt3759 * this.anInt9764 >> 12;
		@Pc(65) int local65 = this.anInt9760 * Static195.anInt3756 >> 12;
		@Pc(72) int local72 = this.anInt9762 * Static195.anInt3756 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt9763 = this.anInt9769 * (Static195.anInt3759 / 8) >> 12;
		@Pc(95) int local95 = Static195.anInt3759 / local51 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt9765);
		while (true) {
			while (true) {
				@Pc(121) int local121 = local51 + Static508.method7270(local58 - local51, local110);
				@Pc(131) int local131 = Static508.method7270(local72 - local65, local110) + local65;
				@Pc(135) int local135 = local34 + local121;
				if (Static195.anInt3759 < local135) {
					local121 = Static195.anInt3759 - local34;
					local135 = Static195.anInt3759;
				}
				@Pc(149) int local149;
				@Pc(159) int local159;
				if (local40) {
					local149 = 0;
				} else {
					@Pc(153) int local153 = local36;
					@Pc(157) int[] local157 = local103[local36];
					local159 = 0;
					@Pc(163) int local163 = local135 + local28;
					if (local163 < 0) {
						local163 += Static195.anInt3759;
					}
					if (local163 > Static195.anInt3759) {
						local163 -= Static195.anInt3759;
					}
					while (true) {
						@Pc(180) int[] local180 = local103[local153];
						if (local180[0] <= local163 && local163 <= local180[1]) {
							local149 = local157[2];
							if (local36 != local153) {
								@Pc(222) int local222 = local28 + local34;
								if (local222 < 0) {
									local222 += Static195.anInt3759;
								}
								if (Static195.anInt3759 < local222) {
									local222 -= Static195.anInt3759;
								}
								for (@Pc(240) int local240 = 1; local240 <= local159; local240++) {
									@Pc(251) int[] local251 = local103[(local36 + local240) % local42];
									local149 = Math.max(local149, local251[2]);
								}
								for (@Pc(263) int local263 = 0; local263 <= local159; local263++) {
									@Pc(273) int[] local273 = local103[(local263 + local36) % local42];
									@Pc(277) int local277 = local273[2];
									if (local277 != local149) {
										@Pc(288) int local288 = local273[0];
										@Pc(292) int local292 = local273[1];
										@Pc(308) int local308;
										@Pc(310) int local310;
										if (local222 < local163) {
											local308 = Math.max(local222, local288);
											local310 = Math.min(local163, local292);
										} else if (local288 == 0) {
											local310 = Math.min(local163, local292);
											local308 = 0;
										} else {
											local308 = Math.max(local222, local288);
											local310 = Static195.anInt3759;
										}
										this.method8152(local110, local277, local26, local149 - local277, local32 + local308, local310 - local308);
									}
								}
							}
							local36 = local153;
							break;
						}
						@Pc(201) int local201 = ~local42;
						local153++;
						if (local201 >= ~local153) {
							local153 = 0;
						}
						local159++;
					}
				}
				if (Static195.anInt3756 >= local149 + local131) {
					local38 = false;
				} else {
					local131 = Static195.anInt3756 - local149;
				}
				@Pc(398) int[] local398;
				if (local135 == Static195.anInt3759) {
					this.method8152(local110, local149, local26, local131, local34 + local30, local121);
					if (local38) {
						return local17;
					}
					local38 = true;
					local398 = local99[local44++];
					local398[2] = local131 + local149;
					local398[0] = local34;
					local398[1] = local135;
					@Pc(414) int[][] local414 = local103;
					local103 = local99;
					local42 = local44;
					local99 = local414;
					local32 = local30;
					local44 = 0;
					local30 = Static508.method7270(Static195.anInt3759, local110);
					local34 = 0;
					local28 = local30 - local32;
					local159 = local28;
					if (local28 < 0) {
						local159 = local28 + Static195.anInt3759;
					}
					if (Static195.anInt3759 < local159) {
						local159 -= Static195.anInt3759;
					}
					local36 = 0;
					while (true) {
						@Pc(460) int[] local460 = local103[local36];
						if (local159 >= local460[0] && local159 <= local460[1]) {
							local40 = false;
							break;
						}
						local36++;
						if (local36 >= local42) {
							local36 = 0;
						}
					}
				} else {
					local398 = local99[local44++];
					local398[1] = local135;
					local398[0] = local34;
					local398[2] = local149 + local131;
					this.method8152(local110, local149, local26, local131, local34 + local30, local121);
					local34 = local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
	}
}
