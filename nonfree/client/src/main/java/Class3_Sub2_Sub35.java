import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class3_Sub2_Sub35 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
	private int anInt9710;

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
	private int anInt9714 = 1024;

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
	private int anInt9715 = 409;

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
	private int anInt9711 = 2048;

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
	private int anInt9720 = 1024;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
	private int anInt9716 = 0;

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
	private int anInt9707 = 0;

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
	private int anInt9713 = 1024;

	@OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
	private int anInt9721 = 819;

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
	private int anInt9722 = 1024;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9716 = arg0.method4225();
		} else if (arg1 == 1) {
			this.anInt9722 = arg0.method4221();
		} else if (arg1 == 2) {
			this.anInt9711 = arg0.method4221();
		} else if (arg1 == 3) {
			this.anInt9715 = arg0.method4221();
		} else if (arg1 == 4) {
			this.anInt9721 = arg0.method4221();
		} else if (arg1 == 5) {
			this.anInt9714 = arg0.method4221();
		} else if (arg1 == 6) {
			this.anInt9707 = arg0.method4225();
		} else if (arg1 == 7) {
			this.anInt9713 = arg0.method4221();
		} else if (arg1 == 8) {
			this.anInt9720 = arg0.method4221();
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (!super.aClass40_41.aBoolean97) {
			return local11;
		}
		@Pc(25) int[][] local25 = super.aClass40_41.method1571();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = this.anInt9722 * Static491.anInt8519 >> 12;
		@Pc(57) int local57 = this.anInt9711 * Static491.anInt8519 >> 12;
		@Pc(64) int local64 = Static336.anInt6310 * this.anInt9715 >> 12;
		@Pc(71) int local71 = Static336.anInt6310 * this.anInt9721 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt9710 = Static491.anInt8519 / 8 * this.anInt9714 >> 12;
		@Pc(95) int local95 = Static491.anInt8519 / local50 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt9716);
		while (true) {
			while (true) {
				@Pc(121) int local121 = local50 + Static522.method7729(local110, local57 - local50);
				@Pc(131) int local131 = Static522.method7729(local110, local71 - local64) + local64;
				@Pc(136) int local136 = local33 + local121;
				if (local136 > Static491.anInt8519) {
					local121 = Static491.anInt8519 - local33;
					local136 = Static491.anInt8519;
				}
				@Pc(154) int local154;
				@Pc(164) int local164;
				if (local39) {
					local154 = 0;
				} else {
					@Pc(158) int local158 = local35;
					@Pc(162) int[] local162 = local103[local35];
					local164 = 0;
					@Pc(168) int local168 = local136 + local27;
					if (local168 < 0) {
						local168 += Static491.anInt8519;
					}
					if (Static491.anInt8519 < local168) {
						local168 -= Static491.anInt8519;
					}
					while (true) {
						@Pc(189) int[] local189 = local103[local158];
						if (local168 >= local189[0] && local168 <= local189[1]) {
							local154 = local162[2];
							if (local35 != local158) {
								@Pc(227) int local227 = local27 + local33;
								if (local227 < 0) {
									local227 += Static491.anInt8519;
								}
								if (Static491.anInt8519 < local227) {
									local227 -= Static491.anInt8519;
								}
								for (@Pc(245) int local245 = 1; local245 <= local164; local245++) {
									@Pc(255) int[] local255 = local103[(local35 + local245) % local41];
									local154 = Math.max(local154, local255[2]);
								}
								for (@Pc(267) int local267 = 0; local267 <= local164; local267++) {
									@Pc(277) int[] local277 = local103[(local267 + local35) % local41];
									@Pc(281) int local281 = local277[2];
									if (local281 != local154) {
										@Pc(288) int local288 = local277[0];
										@Pc(292) int local292 = local277[1];
										@Pc(303) int local303;
										@Pc(307) int local307;
										if (local168 > local227) {
											local303 = Math.max(local227, local288);
											local307 = Math.min(local168, local292);
										} else if (local288 == 0) {
											local303 = 0;
											local307 = Math.min(local168, local292);
										} else {
											local303 = Math.max(local227, local288);
											local307 = Static491.anInt8519;
										}
										this.method8325(local303 + local31, local154 - local281, local307 - local303, local25, local281, local110);
									}
								}
							}
							local35 = local158;
							break;
						}
						local158++;
						if (local158 >= local41) {
							local158 = 0;
						}
						local164++;
					}
				}
				if (Static336.anInt6310 >= local154 + local131) {
					local37 = false;
				} else {
					local131 = Static336.anInt6310 - local154;
				}
				@Pc(377) int[] local377;
				if (Static491.anInt8519 == local136) {
					this.method8325(local33 + local29, local131, local121, local25, local154, local110);
					if (local37) {
						return local11;
					}
					local37 = true;
					local377 = local99[local43++];
					local377[2] = local131 + local154;
					local377[0] = local33;
					local377[1] = local136;
					@Pc(442) int[][] local442 = local103;
					local103 = local99;
					local41 = local43;
					local99 = local442;
					local43 = 0;
					local31 = local29;
					local29 = Static522.method7729(local110, Static491.anInt8519);
					local27 = local29 - local31;
					local33 = 0;
					local164 = local27;
					if (local27 < 0) {
						local164 = local27 + Static491.anInt8519;
					}
					local35 = 0;
					if (Static491.anInt8519 < local164) {
						local164 -= Static491.anInt8519;
					}
					while (true) {
						@Pc(489) int[] local489 = local103[local35];
						if (local164 >= local489[0] && local489[1] >= local164) {
							local39 = false;
							break;
						}
						@Pc(510) int local510 = ~local41;
						local35++;
						if (local510 >= ~local35) {
							local35 = 0;
						}
					}
				} else {
					local377 = local99[local43++];
					local377[0] = local33;
					local377[1] = local136;
					local377[2] = local154 + local131;
					this.method8325(local33 + local29, local131, local121, local25, local154, local110);
					local33 = local136;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[[IBILjava/util/Random;)V")
	private void method8325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(21) int local21 = this.anInt9720 > 0 ? 4096 - Static522.method7729(arg5, this.anInt9720) : 4096;
		@Pc(29) int local29 = this.anInt9710 * this.anInt9713 >> 12;
		@Pc(41) int local41 = this.anInt9710 - (local29 <= 0 ? 0 : Static522.method7729(arg5, local29));
		if (arg0 >= Static491.anInt8519) {
			arg0 -= Static491.anInt8519;
		}
		@Pc(66) int local66;
		@Pc(70) int local70;
		if (local41 > 0) {
			if (arg1 <= 0 || arg2 <= 0) {
				return;
			}
			local66 = arg2 / 2;
			local70 = arg1 / 2;
			@Pc(77) int local77 = local41 <= local66 ? local41 : local66;
			@Pc(84) int local84 = local70 >= local41 ? local41 : local70;
			@Pc(88) int local88 = local77 + arg0;
			@Pc(95) int local95 = arg2 - local77 * 2;
			for (@Pc(97) int local97 = 0; local97 < arg1; local97++) {
				@Pc(106) int[] local106 = arg3[local97 + arg4];
				@Pc(119) int local119;
				@Pc(127) int local127;
				@Pc(135) int local135;
				if (local97 < local84) {
					local119 = local21 * local97 / local84;
					if (this.anInt9707 == 0) {
						for (local127 = 0; local127 < local77; local127++) {
							local135 = local127 * local21 / local77;
							local106[local127 + arg0 & Static309.anInt5846] = local106[arg0 + arg2 - local127 - 1 & Static309.anInt5846] = local119 * local135 >> 12;
						}
					} else {
						for (local127 = 0; local127 < local77; local127++) {
							local135 = local21 * local127 / local77;
							local106[Static309.anInt5846 & local127 + arg0] = local106[arg0 + arg2 - local127 - 1 & Static309.anInt5846] = local119 <= local135 ? local119 : local135;
						}
					}
					if (local88 + local95 <= Static491.anInt8519) {
						Static653.method6860(local106, local88, local95, local119);
					} else {
						local127 = Static491.anInt8519 - local88;
						Static653.method6860(local106, local88, local127, local119);
						Static653.method6860(local106, 0, local95 - local127, local119);
					}
				} else {
					local119 = arg1 - local97 - 1;
					if (local84 > local119) {
						local127 = local119 * local21 / local84;
						@Pc(275) int local275;
						if (this.anInt9707 == 0) {
							for (local135 = 0; local135 < local77; local135++) {
								local275 = local135 * local21 / local77;
								local106[arg0 + local135 & Static309.anInt5846] = local106[arg0 + arg2 - local135 - 1 & Static309.anInt5846] = local127 * local275 >> 12;
							}
						} else {
							for (local135 = 0; local135 < local77; local135++) {
								local275 = local135 * local21 / local77;
								local106[arg0 + local135 & Static309.anInt5846] = local106[Static309.anInt5846 & arg2 + arg0 - local135 - 1] = local275 >= local127 ? local127 : local275;
							}
						}
						if (Static491.anInt8519 >= local95 + local88) {
							Static653.method6860(local106, local88, local95, local127);
						} else {
							local135 = Static491.anInt8519 - local88;
							Static653.method6860(local106, local88, local135, local127);
							Static653.method6860(local106, 0, local95 - local135, local127);
						}
					} else {
						for (local127 = 0; local127 < local77; local127++) {
							local106[local127 + arg0 & Static309.anInt5846] = local106[arg0 + arg2 - local127 - 1 & Static309.anInt5846] = local127 * local21 / local77;
						}
						if (Static491.anInt8519 < local95 + local88) {
							local135 = Static491.anInt8519 - local88;
							Static653.method6860(local106, local88, local135, local21);
							Static653.method6860(local106, 0, local95 - local135, local21);
						} else {
							Static653.method6860(local106, local88, local95, local21);
						}
					}
				}
			}
		} else if (Static491.anInt8519 >= arg0 + arg2) {
			for (local66 = 0; local66 < arg1; local66++) {
				Static653.method6860(arg3[local66 + arg4], arg0, arg2, local21);
			}
		} else {
			local66 = Static491.anInt8519 - arg0;
			for (local70 = 0; local70 < arg1; local70++) {
				@Pc(499) int[] local499 = arg3[arg4 + local70];
				Static653.method6860(local499, arg0, local66, local21);
				Static653.method6860(local499, 0, arg2 - local66, local21);
			}
		}
	}
}
