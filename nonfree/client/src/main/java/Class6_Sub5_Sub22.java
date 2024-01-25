import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class6_Sub5_Sub22 extends Class6_Sub5 {

	@OriginalMember(owner = "client!mm", name = "Y", descriptor = "I")
	private int anInt4588;

	@OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
	private int anInt4580 = 409;

	@OriginalMember(owner = "client!mm", name = "T", descriptor = "I")
	private int anInt4585 = 1024;

	@OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
	private int anInt4582 = 0;

	@OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
	private int anInt4581 = 0;

	@OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
	private int anInt4586 = 2048;

	@OriginalMember(owner = "client!mm", name = "Z", descriptor = "I")
	private int anInt4589 = 819;

	@OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
	private int anInt4577 = 1024;

	@OriginalMember(owner = "client!mm", name = "ab", descriptor = "I")
	private int anInt4590 = 1024;

	@OriginalMember(owner = "client!mm", name = "cb", descriptor = "I")
	private int anInt4592 = 1024;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass61_41.method1611(arg0);
		if (!super.aClass61_41.aBoolean142) {
			return local17;
		}
		@Pc(28) int[][] local28 = super.aClass61_41.method1607();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = this.anInt4585 * Static240.anInt4386 >> 12;
		@Pc(60) int local60 = Static240.anInt4386 * this.anInt4586 >> 12;
		@Pc(67) int local67 = this.anInt4580 * Static235.anInt4304 >> 12;
		@Pc(74) int local74 = this.anInt4589 * Static235.anInt4304 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt4588 = this.anInt4592 * (Static240.anInt4386 / 8) >> 12;
		@Pc(99) int local99 = Static240.anInt4386 / local53 + 1;
		@Pc(103) int[][] local103 = new int[local99][3];
		@Pc(107) int[][] local107 = new int[local99][3];
		@Pc(114) Random local114 = new Random((long) this.anInt4582);
		while (true) {
			while (true) {
				@Pc(124) int local124 = Static267.method4083(local114, local60 - local53) + local53;
				@Pc(134) int local134 = local67 + Static267.method4083(local114, local74 - local67);
				@Pc(138) int local138 = local124 + local36;
				if (local138 > Static240.anInt4386) {
					local138 = Static240.anInt4386;
					local124 = Static240.anInt4386 - local36;
				}
				@Pc(187) int local187;
				@Pc(162) int local162;
				if (local42) {
					local187 = 0;
				} else {
					@Pc(156) int local156 = local38;
					@Pc(160) int[] local160 = local107[local38];
					local162 = 0;
					@Pc(166) int local166 = local30 + local138;
					if (local166 < 0) {
						local166 += Static240.anInt4386;
					}
					if (local166 > Static240.anInt4386) {
						local166 -= Static240.anInt4386;
					}
					local187 = local160[2];
					while (true) {
						@Pc(191) int[] local191 = local107[local156];
						if (local191[0] <= local166 && local166 <= local191[1]) {
							if (local156 != local38) {
								@Pc(225) int local225 = local30 + local36;
								if (local225 < 0) {
									local225 += Static240.anInt4386;
								}
								if (local225 > Static240.anInt4386) {
									local225 -= Static240.anInt4386;
								}
								for (@Pc(247) int local247 = 1; local247 <= local162; local247++) {
									@Pc(257) int[] local257 = local107[(local247 + local38) % local44];
									local187 = Math.max(local187, local257[2]);
								}
								for (@Pc(273) int local273 = 0; local273 <= local162; local273++) {
									@Pc(283) int[] local283 = local107[(local273 + local38) % local44];
									@Pc(287) int local287 = local283[2];
									if (local287 != local187) {
										@Pc(294) int local294 = local283[0];
										@Pc(298) int local298 = local283[1];
										@Pc(312) int local312;
										@Pc(316) int local316;
										if (local225 < local166) {
											local312 = Math.max(local225, local294);
											local316 = Math.min(local166, local298);
										} else if (local294 == 0) {
											local312 = 0;
											local316 = Math.min(local166, local298);
										} else {
											local312 = Math.max(local225, local294);
											local316 = Static240.anInt4386;
										}
										this.method3882(local316 - local312, local28, local187 - local287, local287, local114, local34 + local312);
									}
								}
							}
							local38 = local156;
							break;
						}
						local162++;
						local156++;
						if (local156 >= local44) {
							local156 = 0;
						}
					}
				}
				if (local134 + local187 > Static235.anInt4304) {
					local134 = Static235.anInt4304 - local187;
				} else {
					local40 = false;
				}
				@Pc(407) int[] local407;
				if (Static240.anInt4386 == local138) {
					this.method3882(local124, local28, local134, local187, local114, local32 + local36);
					if (local40) {
						return local17;
					}
					local40 = true;
					local407 = local103[local46++];
					local407[2] = local187 + local134;
					local407[1] = local138;
					local407[0] = local36;
					@Pc(424) int[][] local424 = local107;
					local107 = local103;
					local44 = local46;
					local103 = local424;
					local46 = 0;
					local34 = local32;
					local32 = Static267.method4083(local114, Static240.anInt4386);
					local30 = local32 - local34;
					local36 = 0;
					local162 = local30;
					if (local30 < 0) {
						local162 = local30 + Static240.anInt4386;
					}
					if (Static240.anInt4386 < local162) {
						local162 -= Static240.anInt4386;
					}
					local38 = 0;
					while (true) {
						@Pc(470) int[] local470 = local107[local38];
						if (local470[0] <= local162 && local162 <= local470[1]) {
							local42 = false;
							break;
						}
						local38++;
						if (local44 <= local38) {
							local38 = 0;
						}
					}
				} else {
					local407 = local103[local46++];
					local407[0] = local36;
					local407[1] = local138;
					local407[2] = local187 + local134;
					this.method3882(local124, local28, local134, local187, local114, local32 + local36);
					local36 = local138;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt4582 = arg1.method6433();
		} else if (arg0 == 1) {
			this.anInt4585 = arg1.method6485();
		} else if (arg0 == 2) {
			this.anInt4586 = arg1.method6485();
		} else if (arg0 == 3) {
			this.anInt4580 = arg1.method6485();
		} else if (arg0 == 4) {
			this.anInt4589 = arg1.method6485();
		} else if (arg0 == 5) {
			this.anInt4592 = arg1.method6485();
		} else if (arg0 == 6) {
			this.anInt4581 = arg1.method6433();
		} else if (arg0 == 7) {
			this.anInt4590 = arg1.method6485();
		} else if (arg0 == 8) {
			this.anInt4577 = arg1.method6485();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[[IIILjava/util/Random;I)V")
	private void method3882(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21 = this.anInt4577 <= 0 ? 4096 : 4096 - Static267.method4083(arg4, this.anInt4577);
		@Pc(29) int local29 = this.anInt4590 * this.anInt4588 >> 12;
		@Pc(42) int local42 = this.anInt4588 - (local29 > 0 ? Static267.method4083(arg4, local29) : 0);
		if (arg5 >= Static240.anInt4386) {
			arg5 -= Static240.anInt4386;
		}
		@Pc(62) int local62;
		@Pc(85) int local85;
		if (local42 <= 0) {
			if (arg5 + arg0 <= Static240.anInt4386) {
				for (local62 = 0; local62 < arg2; local62++) {
					Static459.method6344(arg1[arg3 + local62], arg5, arg0, local21);
				}
			} else {
				local62 = Static240.anInt4386 - arg5;
				for (local85 = 0; local85 < arg2; local85++) {
					@Pc(94) int[] local94 = arg1[arg3 + local85];
					Static459.method6344(local94, arg5, local62, local21);
					Static459.method6344(local94, 0, arg0 - local62, local21);
				}
			}
		} else if (arg2 > 0 && arg0 > 0) {
			local62 = arg0 / 2;
			local85 = arg2 / 2;
			@Pc(132) int local132 = local42 <= local62 ? local42 : local62;
			@Pc(143) int local143 = local42 <= local85 ? local42 : local85;
			@Pc(148) int local148 = arg5 + local132;
			@Pc(155) int local155 = arg0 - local132 * 2;
			for (@Pc(157) int local157 = 0; local157 < arg2; local157++) {
				@Pc(165) int[] local165 = arg1[local157 + arg3];
				@Pc(178) int local178;
				@Pc(183) int local183;
				@Pc(191) int local191;
				if (local143 > local157) {
					local178 = local21 * local157 / local143;
					if (this.anInt4581 == 0) {
						for (local183 = 0; local183 < local132; local183++) {
							local191 = local183 * local21 / local132;
							local165[local183 + arg5 & Static408.anInt7338] = local165[arg0 + arg5 - local183 - 1 & Static408.anInt7338] = local178 * local191 >> 12;
						}
					} else {
						for (local183 = 0; local183 < local132; local183++) {
							local191 = local183 * local21 / local132;
							local165[Static408.anInt7338 & arg5 + local183] = local165[arg5 + arg0 - local183 - 1 & Static408.anInt7338] = local178 <= local191 ? local178 : local191;
						}
					}
					if (local148 + local155 <= Static240.anInt4386) {
						Static459.method6344(local165, local148, local155, local178);
					} else {
						local183 = Static240.anInt4386 - local148;
						Static459.method6344(local165, local148, local183, local178);
						Static459.method6344(local165, 0, local155 - local183, local178);
					}
				} else {
					local178 = arg2 - local157 - 1;
					if (local178 < local143) {
						local183 = local178 * local21 / local143;
						@Pc(340) int local340;
						if (this.anInt4581 == 0) {
							for (local191 = 0; local191 < local132; local191++) {
								local340 = local191 * local21 / local132;
								local165[Static408.anInt7338 & arg5 + local191] = local165[arg5 + arg0 - local191 - 1 & Static408.anInt7338] = local183 * local340 >> 12;
							}
						} else {
							for (local191 = 0; local191 < local132; local191++) {
								local340 = local191 * local21 / local132;
								local165[arg5 + local191 & Static408.anInt7338] = local165[Static408.anInt7338 & arg5 + arg0 - local191 - 1] = local183 > local340 ? local340 : local183;
							}
						}
						if (Static240.anInt4386 < local155 + local148) {
							local191 = Static240.anInt4386 - local148;
							Static459.method6344(local165, local148, local191, local183);
							Static459.method6344(local165, 0, local155 - local191, local183);
						} else {
							Static459.method6344(local165, local148, local155, local183);
						}
					} else {
						for (local183 = 0; local183 < local132; local183++) {
							local165[Static408.anInt7338 & arg5 + local183] = local165[Static408.anInt7338 & arg0 + arg5 - local183 - 1] = local183 * local21 / local132;
						}
						if (local148 + local155 > Static240.anInt4386) {
							local191 = Static240.anInt4386 - local148;
							Static459.method6344(local165, local148, local191, local21);
							Static459.method6344(local165, 0, local155 - local191, local21);
						} else {
							Static459.method6344(local165, local148, local155, local21);
						}
					}
				}
			}
		}
	}
}
