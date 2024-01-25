import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class4_Sub6_Sub25 extends Class4_Sub6 {

	@OriginalMember(owner = "client!oo", name = "O", descriptor = "I")
	private int anInt4700;

	@OriginalMember(owner = "client!oo", name = "T", descriptor = "I")
	private int anInt4704 = 0;

	@OriginalMember(owner = "client!oo", name = "S", descriptor = "I")
	private int anInt4703 = 1024;

	@OriginalMember(owner = "client!oo", name = "U", descriptor = "I")
	private int anInt4705 = 1024;

	@OriginalMember(owner = "client!oo", name = "M", descriptor = "I")
	private int anInt4699 = 409;

	@OriginalMember(owner = "client!oo", name = "Z", descriptor = "I")
	private int anInt4708 = 819;

	@OriginalMember(owner = "client!oo", name = "ab", descriptor = "I")
	private int anInt4709 = 2048;

	@OriginalMember(owner = "client!oo", name = "bb", descriptor = "I")
	private int anInt4710 = 0;

	@OriginalMember(owner = "client!oo", name = "cb", descriptor = "I")
	private int anInt4711 = 1024;

	@OriginalMember(owner = "client!oo", name = "db", descriptor = "I")
	private int anInt4712 = 1024;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4704 = arg1.method3440();
		} else if (arg0 == 1) {
			this.anInt4711 = arg1.method3401();
		} else if (arg0 == 2) {
			this.anInt4709 = arg1.method3401();
		} else if (arg0 == 3) {
			this.anInt4699 = arg1.method3401();
		} else if (arg0 == 4) {
			this.anInt4708 = arg1.method3401();
		} else if (arg0 == 5) {
			this.anInt4703 = arg1.method3401();
		} else if (arg0 == 6) {
			this.anInt4710 = arg1.method3440();
		} else if (arg0 == 7) {
			this.anInt4705 = arg1.method3401();
		} else if (arg0 == 8) {
			this.anInt4712 = arg1.method3401();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I[[IIIILjava/util/Random;I)V")
	private void method4146(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(20) int local20 = this.anInt4712 <= 0 ? 4096 : 4096 - Static355.method5668(arg4, this.anInt4712);
		@Pc(28) int local28 = this.anInt4705 * this.anInt4700 >> 12;
		@Pc(43) int local43 = this.anInt4700 - (local28 > 0 ? Static355.method5668(arg4, local28) : 0);
		if (Static31.anInt797 <= arg0) {
			arg0 -= Static31.anInt797;
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (local43 > 0) {
			if (arg2 > 0 && arg3 > 0) {
				local71 = arg3 / 2;
				local75 = arg2 / 2;
				@Pc(82) int local82 = local71 < local43 ? local71 : local43;
				@Pc(89) int local89 = local43 > local75 ? local75 : local43;
				@Pc(93) int local93 = local82 + arg0;
				@Pc(99) int local99 = arg3 - local82 * 2;
				for (@Pc(101) int local101 = 0; local101 < arg2; local101++) {
					@Pc(110) int[] local110 = arg1[local101 + arg5];
					@Pc(123) int local123;
					@Pc(131) int local131;
					@Pc(139) int local139;
					if (local89 > local101) {
						local123 = local101 * local20 / local89;
						if (this.anInt4710 == 0) {
							for (local131 = 0; local131 < local82; local131++) {
								local139 = local131 * local20 / local82;
								local110[Static335.anInt6403 & local131 + arg0] = local110[Static335.anInt6403 & arg0 + arg3 - local131 - 1] = local123 * local139 >> 12;
							}
						} else {
							for (local131 = 0; local131 < local82; local131++) {
								local139 = local20 * local131 / local82;
								local110[Static335.anInt6403 & local131 + arg0] = local110[Static335.anInt6403 & arg0 + arg3 - local131 - 1] = local139 < local123 ? local139 : local123;
							}
						}
						if (Static31.anInt797 >= local93 + local99) {
							Static359.method763(local110, local93, local99, local123);
						} else {
							local131 = Static31.anInt797 - local93;
							Static359.method763(local110, local93, local131, local123);
							Static359.method763(local110, 0, local99 - local131, local123);
						}
					} else {
						local123 = arg2 - local101 - 1;
						if (local123 < local89) {
							local131 = local123 * local20 / local89;
							@Pc(283) int local283;
							if (this.anInt4710 == 0) {
								for (local139 = 0; local139 < local82; local139++) {
									local283 = local20 * local139 / local82;
									local110[Static335.anInt6403 & local139 + arg0] = local110[arg0 + arg3 - local139 - 1 & Static335.anInt6403] = local131 * local283 >> 12;
								}
							} else {
								for (local139 = 0; local139 < local82; local139++) {
									local283 = local139 * local20 / local82;
									local110[local139 + arg0 & Static335.anInt6403] = local110[arg3 + arg0 - local139 - 1 & Static335.anInt6403] = local283 < local131 ? local283 : local131;
								}
							}
							if (local93 + local99 > Static31.anInt797) {
								local139 = Static31.anInt797 - local93;
								Static359.method763(local110, local93, local139, local131);
								Static359.method763(local110, 0, local99 - local139, local131);
							} else {
								Static359.method763(local110, local93, local99, local131);
							}
						} else {
							for (local131 = 0; local131 < local82; local131++) {
								local110[Static335.anInt6403 & local131 + arg0] = local110[arg3 + arg0 - local131 - 1 & Static335.anInt6403] = local131 * local20 / local82;
							}
							if (local99 + local93 <= Static31.anInt797) {
								Static359.method763(local110, local93, local99, local20);
							} else {
								local139 = Static31.anInt797 - local93;
								Static359.method763(local110, local93, local139, local20);
								Static359.method763(local110, 0, local99 - local139, local20);
							}
						}
					}
				}
			}
		} else if (arg3 + arg0 > Static31.anInt797) {
			local71 = Static31.anInt797 - arg0;
			for (local75 = 0; local75 < arg2; local75++) {
				@Pc(489) int[] local489 = arg1[arg5 + local75];
				Static359.method763(local489, arg0, local71, local20);
				Static359.method763(local489, 0, arg3 - local71, local20);
			}
		} else {
			for (local71 = 0; local71 < arg2; local71++) {
				Static359.method763(arg1[arg5 + local71], arg0, arg3, local20);
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (!super.aClass133_41.aBoolean318) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass133_41.method3736();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt4711 * Static31.anInt797 >> 12;
		@Pc(52) int local52 = this.anInt4709 * Static31.anInt797 >> 12;
		@Pc(59) int local59 = Static223.anInt4562 * this.anInt4699 >> 12;
		@Pc(66) int local66 = Static223.anInt4562 * this.anInt4708 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt4700 = this.anInt4703 * (Static31.anInt797 / 8) >> 12;
		@Pc(89) int local89 = Static31.anInt797 / local45 + 1;
		@Pc(93) int[][] local93 = new int[local89][3];
		@Pc(97) int[][] local97 = new int[local89][3];
		@Pc(104) Random local104 = new Random((long) this.anInt4704);
		while (true) {
			while (true) {
				@Pc(114) int local114 = Static355.method5668(local104, local52 - local45) + local45;
				@Pc(124) int local124 = Static355.method5668(local104, local66 - local59) + local59;
				@Pc(129) int local129 = local28 + local114;
				if (local129 > Static31.anInt797) {
					local114 = Static31.anInt797 - local28;
					local129 = Static31.anInt797;
				}
				@Pc(178) int local178;
				@Pc(149) int local149;
				if (local34) {
					local178 = 0;
				} else {
					@Pc(143) int local143 = local30;
					@Pc(147) int[] local147 = local97[local30];
					local149 = 0;
					@Pc(154) int local154 = local129 + local22;
					if (local154 < 0) {
						local154 += Static31.anInt797;
					}
					if (local154 > Static31.anInt797) {
						local154 -= Static31.anInt797;
					}
					local178 = local147[2];
					while (true) {
						@Pc(182) int[] local182 = local97[local143];
						if (local182[0] <= local154 && local182[1] >= local154) {
							if (local30 != local143) {
								@Pc(220) int local220 = local22 + local28;
								if (local220 < 0) {
									local220 += Static31.anInt797;
								}
								if (Static31.anInt797 < local220) {
									local220 -= Static31.anInt797;
								}
								for (@Pc(238) int local238 = 1; local238 <= local149; local238++) {
									@Pc(249) int[] local249 = local97[(local30 + local238) % local36];
									local178 = Math.max(local178, local249[2]);
								}
								for (@Pc(265) int local265 = 0; local265 <= local149; local265++) {
									@Pc(275) int[] local275 = local97[(local265 + local30) % local36];
									@Pc(279) int local279 = local275[2];
									if (local279 != local178) {
										@Pc(290) int local290 = local275[0];
										@Pc(294) int local294 = local275[1];
										@Pc(301) int local301;
										@Pc(305) int local305;
										if (local220 < local154) {
											local301 = Math.max(local220, local290);
											local305 = Math.min(local154, local294);
										} else if (local290 == 0) {
											local301 = 0;
											local305 = Math.min(local154, local294);
										} else {
											local301 = Math.max(local220, local290);
											local305 = Static31.anInt797;
										}
										this.method4146(local301 + local26, local20, local178 - local279, -local301 + local305, local104, local279);
									}
								}
							}
							local30 = local143;
							break;
						}
						local149++;
						@Pc(204) int local204 = ~local36;
						local143++;
						if (local204 >= ~local143) {
							local143 = 0;
						}
					}
				}
				if (Static223.anInt4562 < local178 + local124) {
					local124 = Static223.anInt4562 - local178;
				} else {
					local32 = false;
				}
				@Pc(379) int[] local379;
				if (local129 == Static31.anInt797) {
					this.method4146(local28 + local24, local20, local124, local114, local104, local178);
					if (local32) {
						return local11;
					}
					local32 = true;
					local379 = local93[local38++];
					local379[0] = local28;
					local379[2] = local178 + local124;
					local379[1] = local129;
					@Pc(445) int[][] local445 = local97;
					local97 = local93;
					local93 = local445;
					local36 = local38;
					local26 = local24;
					local38 = 0;
					local24 = Static355.method5668(local104, Static31.anInt797);
					local22 = local24 - local26;
					local28 = 0;
					local149 = local22;
					if (local22 < 0) {
						local149 = local22 + Static31.anInt797;
					}
					if (Static31.anInt797 < local149) {
						local149 -= Static31.anInt797;
					}
					local30 = 0;
					local34 = false;
					while (true) {
						@Pc(494) int[] local494 = local97[local30];
						if (local149 >= local494[0] && local494[1] >= local149) {
							break;
						}
						local30++;
						if (local36 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local379 = local93[local38++];
					local379[2] = local178 + local124;
					local379[0] = local28;
					local379[1] = local129;
					this.method4146(local28 + local24, local20, local124, local114, local104, local178);
					local28 = local129;
				}
			}
		}
	}
}
