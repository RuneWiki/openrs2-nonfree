import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class14_Sub3_Sub39 extends Class14_Sub3 {

	@OriginalMember(owner = "client!wr", name = "cb", descriptor = "I")
	private int anInt6759;

	@OriginalMember(owner = "client!wr", name = "V", descriptor = "I")
	private int anInt6752 = 1024;

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
	private int anInt6746 = 0;

	@OriginalMember(owner = "client!wr", name = "Z", descriptor = "I")
	private int anInt6756 = 409;

	@OriginalMember(owner = "client!wr", name = "T", descriptor = "I")
	private int anInt6750 = 1024;

	@OriginalMember(owner = "client!wr", name = "S", descriptor = "I")
	private int anInt6749 = 819;

	@OriginalMember(owner = "client!wr", name = "W", descriptor = "I")
	private int anInt6753 = 0;

	@OriginalMember(owner = "client!wr", name = "bb", descriptor = "I")
	private int anInt6758 = 1024;

	@OriginalMember(owner = "client!wr", name = "fb", descriptor = "I")
	private int anInt6762 = 2048;

	@OriginalMember(owner = "client!wr", name = "hb", descriptor = "I")
	private int anInt6763 = 1024;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIB[[ILjava/util/Random;II)V")
	private void method6006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt6750 <= 0 ? 4096 : 4096 - Static193.method3664(arg3, this.anInt6750);
		@Pc(30) int local30 = this.anInt6759 * this.anInt6758 >> 12;
		@Pc(46) int local46 = this.anInt6759 - (local30 > 0 ? Static193.method3664(arg3, local30) : 0);
		if (Static294.anInt5657 <= arg1) {
			arg1 -= Static294.anInt5657;
		}
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (local46 > 0) {
			if (arg0 <= 0 || arg5 <= 0) {
				return;
			}
			local70 = arg5 / 2;
			local74 = arg0 / 2;
			@Pc(81) int local81 = local46 > local70 ? local70 : local46;
			@Pc(88) int local88 = local46 <= local74 ? local46 : local74;
			@Pc(93) int local93 = arg1 + local81;
			@Pc(100) int local100 = arg5 - local81 * 2;
			for (@Pc(102) int local102 = 0; local102 < arg0; local102++) {
				@Pc(110) int[] local110 = arg2[arg4 + local102];
				@Pc(123) int local123;
				@Pc(128) int local128;
				@Pc(136) int local136;
				if (local102 < local88) {
					local123 = local22 * local102 / local88;
					if (this.anInt6753 == 0) {
						for (local128 = 0; local128 < local81; local128++) {
							local136 = local22 * local128 / local81;
							local110[Static329.anInt6352 & local128 + arg1] = local110[Static329.anInt6352 & arg1 + arg5 - local128 - 1] = local123 * local136 >> 12;
						}
					} else {
						for (local128 = 0; local128 < local81; local128++) {
							local136 = local22 * local128 / local81;
							local110[local128 + arg1 & Static329.anInt6352] = local110[arg5 + arg1 - local128 - 1 & Static329.anInt6352] = local136 >= local123 ? local123 : local136;
						}
					}
					if (local100 + local93 > Static294.anInt5657) {
						local128 = Static294.anInt5657 - local93;
						Static358.method768(local110, local93, local128, local123);
						Static358.method768(local110, 0, local100 - local128, local123);
					} else {
						Static358.method768(local110, local93, local100, local123);
					}
				} else {
					local123 = arg0 - local102 - 1;
					if (local123 < local88) {
						local128 = local22 * local123 / local88;
						@Pc(279) int local279;
						if (this.anInt6753 == 0) {
							for (local136 = 0; local136 < local81; local136++) {
								local279 = local22 * local136 / local81;
								local110[Static329.anInt6352 & local136 + arg1] = local110[Static329.anInt6352 & arg1 + arg5 - local136 - 1] = local128 * local279 >> 12;
							}
						} else {
							for (local136 = 0; local136 < local81; local136++) {
								local279 = local22 * local136 / local81;
								local110[local136 + arg1 & Static329.anInt6352] = local110[Static329.anInt6352 & arg1 + arg5 - local136 - 1] = local279 >= local128 ? local128 : local279;
							}
						}
						if (Static294.anInt5657 < local100 + local93) {
							local136 = Static294.anInt5657 - local93;
							Static358.method768(local110, local93, local136, local128);
							Static358.method768(local110, 0, local100 - local136, local128);
						} else {
							Static358.method768(local110, local93, local100, local128);
						}
					} else {
						for (local128 = 0; local128 < local81; local128++) {
							local110[Static329.anInt6352 & arg1 + local128] = local110[Static329.anInt6352 & arg1 + arg5 - local128 - 1] = local128 * local22 / local81;
						}
						if (local100 + local93 <= Static294.anInt5657) {
							Static358.method768(local110, local93, local100, local22);
						} else {
							local136 = Static294.anInt5657 - local93;
							Static358.method768(local110, local93, local136, local22);
							Static358.method768(local110, 0, local100 - local136, local22);
						}
					}
				}
			}
		} else if (Static294.anInt5657 >= arg5 + arg1) {
			for (local70 = 0; local70 < arg0; local70++) {
				Static358.method768(arg2[arg4 + local70], arg1, arg5, local22);
			}
		} else {
			local70 = Static294.anInt5657 - arg1;
			for (local74 = 0; local74 < arg0; local74++) {
				@Pc(513) int[] local513 = arg2[local74 + arg4];
				Static358.method768(local513, arg1, local70, local22);
				Static358.method768(local513, 0, arg5 - local70, local22);
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (!super.aClass157_41.aBoolean296) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass157_41.method4023();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static294.anInt5657 * this.anInt6752 >> 12;
		@Pc(52) int local52 = Static294.anInt5657 * this.anInt6762 >> 12;
		@Pc(59) int local59 = Static65.anInt5731 * this.anInt6756 >> 12;
		@Pc(66) int local66 = Static65.anInt5731 * this.anInt6749 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt6759 = this.anInt6763 * (Static294.anInt5657 / 8) >> 12;
		@Pc(91) int local91 = Static294.anInt5657 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt6746);
		while (true) {
			while (true) {
				@Pc(116) int local116 = Static193.method3664(local106, local52 - local45) + local45;
				@Pc(126) int local126 = Static193.method3664(local106, local66 - local59) + local59;
				@Pc(130) int local130 = local116 + local28;
				if (local130 > Static294.anInt5657) {
					local116 = Static294.anInt5657 - local28;
					local130 = Static294.anInt5657;
				}
				@Pc(175) int local175;
				@Pc(150) int local150;
				if (local34) {
					local175 = 0;
				} else {
					@Pc(144) int local144 = local30;
					@Pc(148) int[] local148 = local99[local30];
					local150 = 0;
					@Pc(154) int local154 = local22 + local130;
					if (local154 < 0) {
						local154 += Static294.anInt5657;
					}
					if (local154 > Static294.anInt5657) {
						local154 -= Static294.anInt5657;
					}
					local175 = local148[2];
					while (true) {
						@Pc(179) int[] local179 = local99[local144];
						if (local179[0] <= local154 && local179[1] >= local154) {
							if (local30 != local144) {
								@Pc(217) int local217 = local28 + local22;
								if (local217 < 0) {
									local217 += Static294.anInt5657;
								}
								if (Static294.anInt5657 < local217) {
									local217 -= Static294.anInt5657;
								}
								for (@Pc(236) int local236 = 1; local236 <= local150; local236++) {
									@Pc(246) int[] local246 = local99[(local30 + local236) % local36];
									local175 = Math.max(local175, local246[2]);
								}
								for (@Pc(258) int local258 = 0; local258 <= local150; local258++) {
									@Pc(268) int[] local268 = local99[(local258 + local30) % local36];
									@Pc(272) int local272 = local268[2];
									if (local272 != local175) {
										@Pc(283) int local283 = local268[0];
										@Pc(287) int local287 = local268[1];
										@Pc(299) int local299;
										@Pc(301) int local301;
										if (local154 > local217) {
											local299 = Math.max(local217, local283);
											local301 = Math.min(local154, local287);
										} else if (local283 == 0) {
											local299 = 0;
											local301 = Math.min(local154, local287);
										} else {
											local299 = Math.max(local217, local283);
											local301 = Static294.anInt5657;
										}
										this.method6006(local175 - local272, local299 + local26, local20, local106, local272, local301 - local299);
									}
								}
							}
							local30 = local144;
							break;
						}
						local150++;
						@Pc(201) int local201 = ~local36;
						local144++;
						if (local201 >= ~local144) {
							local144 = 0;
						}
					}
				}
				if (Static65.anInt5731 < local126 + local175) {
					local126 = Static65.anInt5731 - local175;
				} else {
					local32 = false;
				}
				@Pc(374) int[] local374;
				if (Static294.anInt5657 == local130) {
					this.method6006(local126, local28 + local24, local20, local106, local175, local116);
					if (local32) {
						return local11;
					}
					local32 = true;
					local374 = local95[local38++];
					local374[1] = local130;
					local374[0] = local28;
					local374[2] = local126 + local175;
					@Pc(440) int[][] local440 = local99;
					local99 = local95;
					local95 = local440;
					local36 = local38;
					local26 = local24;
					local38 = 0;
					local24 = Static193.method3664(local106, Static294.anInt5657);
					local22 = local24 - local26;
					local28 = 0;
					local150 = local22;
					if (local22 < 0) {
						local150 = local22 + Static294.anInt5657;
					}
					local30 = 0;
					if (Static294.anInt5657 < local150) {
						local150 -= Static294.anInt5657;
					}
					while (true) {
						@Pc(490) int[] local490 = local99[local30];
						if (local490[0] <= local150 && local490[1] >= local150) {
							local34 = false;
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local374 = local95[local38++];
					local374[2] = local175 + local126;
					local374[1] = local130;
					local374[0] = local28;
					this.method6006(local126, local24 + local28, local20, local106, local175, local116);
					local28 = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6746 = arg0.method2548();
		} else if (arg1 == 1) {
			this.anInt6752 = arg0.method2498();
		} else if (arg1 == 2) {
			this.anInt6762 = arg0.method2498();
		} else if (arg1 == 3) {
			this.anInt6756 = arg0.method2498();
		} else if (arg1 == 4) {
			this.anInt6749 = arg0.method2498();
		} else if (arg1 == 5) {
			this.anInt6763 = arg0.method2498();
		} else if (arg1 == 6) {
			this.anInt6753 = arg0.method2548();
		} else if (arg1 == 7) {
			this.anInt6758 = arg0.method2498();
		} else if (arg1 == 8) {
			this.anInt6750 = arg0.method2498();
		}
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
	}
}
