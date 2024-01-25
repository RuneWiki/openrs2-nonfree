import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class5_Sub1_Sub36 extends Class5_Sub1 {

	@OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
	private int anInt10324;

	@OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
	private int anInt10317 = 1024;

	@OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
	private int anInt10318 = 2048;

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
	private int anInt10322 = 819;

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
	private int anInt10323 = 0;

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
	private int anInt10327 = 1024;

	@OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
	private int anInt10328 = 1024;

	@OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
	private int anInt10325 = 0;

	@OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
	private int anInt10319 = 409;

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
	private int anInt10326 = 1024;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt10325 = arg1.method8529();
		} else if (arg0 == 1) {
			this.anInt10326 = arg1.method8519();
		} else if (arg0 == 2) {
			this.anInt10318 = arg1.method8519();
		} else if (arg0 == 3) {
			this.anInt10319 = arg1.method8519();
		} else if (arg0 == 4) {
			this.anInt10322 = arg1.method8519();
		} else if (arg0 == 5) {
			this.anInt10327 = arg1.method8519();
		} else if (arg0 == 6) {
			this.anInt10323 = arg1.method8529();
		} else if (arg0 == 7) {
			this.anInt10317 = arg1.method8519();
		} else if (arg0 == 8) {
			this.anInt10328 = arg1.method8519();
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (!super.aClass83_41.aBoolean148) {
			return local11;
		}
		@Pc(27) int[][] local27 = super.aClass83_41.method1412();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) boolean local39 = true;
		@Pc(41) boolean local41 = true;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(52) int local52 = this.anInt10326 * Static648.anInt9588 >> 12;
		@Pc(59) int local59 = this.anInt10318 * Static648.anInt9588 >> 12;
		@Pc(66) int local66 = Static269.anInt4686 * this.anInt10319 >> 12;
		@Pc(73) int local73 = this.anInt10322 * Static269.anInt4686 >> 12;
		if (local73 <= 1) {
			return local27[arg0];
		}
		this.anInt10324 = this.anInt10327 * (Static648.anInt9588 / 8) >> 12;
		@Pc(99) int local99 = Static648.anInt9588 / local52 + 1;
		@Pc(103) int[][] local103 = new int[local99][3];
		@Pc(107) int[][] local107 = new int[local99][3];
		@Pc(114) Random local114 = new Random((long) this.anInt10325);
		while (true) {
			while (true) {
				@Pc(125) int local125 = local52 + Static547.method7966(local59 - local52, local114);
				@Pc(135) int local135 = Static547.method7966(local73 - local66, local114) + local66;
				@Pc(139) int local139 = local125 + local35;
				if (Static648.anInt9588 < local139) {
					local125 = Static648.anInt9588 - local35;
					local139 = Static648.anInt9588;
				}
				@Pc(187) int local187;
				@Pc(161) int local161;
				if (local41) {
					local187 = 0;
				} else {
					@Pc(155) int local155 = local37;
					@Pc(159) int[] local159 = local107[local37];
					local161 = 0;
					@Pc(166) int local166 = local139 + local29;
					if (local166 < 0) {
						local166 += Static648.anInt9588;
					}
					if (local166 > Static648.anInt9588) {
						local166 -= Static648.anInt9588;
					}
					local187 = local159[2];
					while (true) {
						@Pc(191) int[] local191 = local107[local155];
						if (local166 >= local191[0] && local166 <= local191[1]) {
							if (local37 != local155) {
								@Pc(233) int local233 = local29 + local35;
								if (local233 < 0) {
									local233 += Static648.anInt9588;
								}
								if (local233 > Static648.anInt9588) {
									local233 -= Static648.anInt9588;
								}
								for (@Pc(251) int local251 = 1; local251 <= local161; local251++) {
									@Pc(261) int[] local261 = local107[(local251 + local37) % local43];
									local187 = Math.max(local187, local261[2]);
								}
								for (@Pc(277) int local277 = 0; local277 <= local161; local277++) {
									@Pc(287) int[] local287 = local107[(local37 + local277) % local43];
									@Pc(291) int local291 = local287[2];
									if (local291 != local187) {
										@Pc(298) int local298 = local287[0];
										@Pc(302) int local302 = local287[1];
										@Pc(318) int local318;
										@Pc(316) int local316;
										if (local166 > local233) {
											local318 = Math.max(local233, local298);
											local316 = Math.min(local166, local302);
										} else if (local298 == 0) {
											local316 = Math.min(local166, local302);
											local318 = 0;
										} else {
											local318 = Math.max(local233, local298);
											local316 = Static648.anInt9588;
										}
										this.method8869(local33 + local318, local291, local187 - local291, local27, local114, local316 - local318);
									}
								}
							}
							local37 = local155;
							break;
						}
						local161++;
						local155++;
						if (local155 >= local43) {
							local155 = 0;
						}
					}
				}
				if (Static269.anInt4686 >= local187 + local135) {
					local39 = false;
				} else {
					local135 = Static269.anInt4686 - local187;
				}
				@Pc(402) int[] local402;
				if (local139 == Static648.anInt9588) {
					this.method8869(local35 + local31, local187, local135, local27, local114, local125);
					if (local39) {
						return local11;
					}
					local39 = true;
					local402 = local103[local45++];
					local402[2] = local135 + local187;
					local402[0] = local35;
					local402[1] = local139;
					@Pc(418) int[][] local418 = local107;
					local107 = local103;
					local43 = local45;
					local103 = local418;
					local33 = local31;
					local45 = 0;
					local31 = Static547.method7966(Static648.anInt9588, local114);
					local35 = 0;
					local29 = local31 - local33;
					local161 = local29;
					if (local29 < 0) {
						local161 = local29 + Static648.anInt9588;
					}
					local37 = 0;
					if (local161 > Static648.anInt9588) {
						local161 -= Static648.anInt9588;
					}
					while (true) {
						@Pc(464) int[] local464 = local107[local37];
						if (local464[0] <= local161 && local464[1] >= local161) {
							local41 = false;
							break;
						}
						@Pc(485) int local485 = ~local43;
						local37++;
						if (local485 >= ~local37) {
							local37 = 0;
						}
					}
				} else {
					local402 = local103[local45++];
					local402[2] = local187 + local135;
					local402[0] = local35;
					local402[1] = local139;
					this.method8869(local31 + local35, local187, local135, local27, local114, local125);
					local35 = local139;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZI[[ILjava/util/Random;I)V")
	private void method8869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(37) int local37 = this.anInt10328 > 0 ? 4096 - Static547.method7966(this.anInt10328, arg4) : 4096;
		@Pc(45) int local45 = this.anInt10317 * this.anInt10324 >> 12;
		@Pc(59) int local59 = this.anInt10324 - (local45 <= 0 ? 0 : Static547.method7966(local45, arg4));
		if (arg0 >= Static648.anInt9588) {
			arg0 -= Static648.anInt9588;
		}
		@Pc(87) int local87;
		@Pc(89) int local89;
		if (local59 <= 0) {
			if (arg5 + arg0 > Static648.anInt9588) {
				local87 = Static648.anInt9588 - arg0;
				for (local89 = 0; local89 < arg2; local89++) {
					@Pc(97) int[] local97 = arg3[local89 + arg1];
					Static682.method794(local97, arg0, local87, local37);
					Static682.method794(local97, 0, arg5 - local87, local37);
				}
			} else {
				for (local87 = 0; local87 < arg2; local87++) {
					Static682.method794(arg3[local87 + arg1], arg0, arg5, local37);
				}
			}
		} else if (arg2 > 0 && arg5 > 0) {
			local87 = arg5 / 2;
			local89 = arg2 / 2;
			@Pc(172) int local172 = local87 < local59 ? local87 : local59;
			@Pc(184) int local184 = local59 > local89 ? local89 : local59;
			@Pc(189) int local189 = arg0 + local172;
			@Pc(195) int local195 = arg5 - local172 * 2;
			for (@Pc(197) int local197 = 0; local197 < arg2; local197++) {
				@Pc(205) int[] local205 = arg3[arg1 + local197];
				@Pc(214) int local214;
				@Pc(219) int local219;
				@Pc(227) int local227;
				if (local184 > local197) {
					local214 = local37 * local197 / local184;
					if (this.anInt10323 == 0) {
						for (local219 = 0; local219 < local172; local219++) {
							local227 = local219 * local37 / local172;
							local205[local219 + arg0 & Static116.anInt3312] = local205[Static116.anInt3312 & arg0 + arg5 - local219 - 1] = local227 * local214 >> 12;
						}
					} else {
						for (local219 = 0; local219 < local172; local219++) {
							local227 = local37 * local219 / local172;
							local205[local219 + arg0 & Static116.anInt3312] = local205[arg5 + arg0 - local219 - 1 & Static116.anInt3312] = local214 > local227 ? local227 : local214;
						}
					}
					if (local195 + local189 > Static648.anInt9588) {
						local219 = Static648.anInt9588 - local189;
						Static682.method794(local205, local189, local219, local214);
						Static682.method794(local205, 0, local195 - local219, local214);
					} else {
						Static682.method794(local205, local189, local195, local214);
					}
				} else {
					local214 = arg2 - local197 - 1;
					if (local214 < local184) {
						local219 = local37 * local214 / local184;
						@Pc(383) int local383;
						if (this.anInt10323 == 0) {
							for (local227 = 0; local227 < local172; local227++) {
								local383 = local227 * local37 / local172;
								local205[local227 + arg0 & Static116.anInt3312] = local205[Static116.anInt3312 & arg0 + arg5 - local227 - 1] = local219 * local383 >> 12;
							}
						} else {
							for (local227 = 0; local227 < local172; local227++) {
								local383 = local37 * local227 / local172;
								local205[arg0 + local227 & Static116.anInt3312] = local205[Static116.anInt3312 & arg0 + arg5 - local227 - 1] = local383 < local219 ? local383 : local219;
							}
						}
						if (local189 + local195 <= Static648.anInt9588) {
							Static682.method794(local205, local189, local195, local219);
						} else {
							local227 = Static648.anInt9588 - local189;
							Static682.method794(local205, local189, local227, local219);
							Static682.method794(local205, 0, local195 - local227, local219);
						}
					} else {
						for (local219 = 0; local219 < local172; local219++) {
							local205[arg0 + local219 & Static116.anInt3312] = local205[arg5 + arg0 - local219 - 1 & Static116.anInt3312] = local37 * local219 / local172;
						}
						if (Static648.anInt9588 < local189 + local195) {
							local227 = Static648.anInt9588 - local189;
							Static682.method794(local205, local189, local227, local37);
							Static682.method794(local205, 0, local195 - local227, local37);
						} else {
							Static682.method794(local205, local189, local195, local37);
						}
					}
				}
			}
		}
	}
}
