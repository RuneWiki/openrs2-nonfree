import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class5_Sub2_Sub26 extends Class5_Sub2 {

	@OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
	private int anInt4694;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
	private int anInt4684 = 1024;

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
	private int anInt4682 = 2048;

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
	private int anInt4680 = 819;

	@OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
	private int anInt4687 = 1024;

	@OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
	private int anInt4691 = 0;

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
	private int anInt4683 = 1024;

	@OriginalMember(owner = "client!pk", name = "Z", descriptor = "I")
	private int anInt4693 = 0;

	@OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
	private int anInt4695 = 1024;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
	private int anInt4688 = 409;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4693 = arg0.method1832();
		} else if (arg1 == 1) {
			this.anInt4695 = arg0.method1845();
		} else if (arg1 == 2) {
			this.anInt4682 = arg0.method1845();
		} else if (arg1 == 3) {
			this.anInt4688 = arg0.method1845();
		} else if (arg1 == 4) {
			this.anInt4680 = arg0.method1845();
		} else if (arg1 == 5) {
			this.anInt4683 = arg0.method1845();
		} else if (arg1 == 6) {
			this.anInt4691 = arg0.method1832();
		} else if (arg1 == 7) {
			this.anInt4687 = arg0.method1845();
		} else if (arg1 == 8) {
			this.anInt4684 = arg0.method1845();
		}
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILjava/util/Random;III[[I)V")
	private void method4111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(29) int local29 = this.anInt4684 > 0 ? 4096 - Static210.method4979(this.anInt4684, arg2) : 4096;
		@Pc(37) int local37 = this.anInt4694 * this.anInt4687 >> 12;
		@Pc(52) int local52 = this.anInt4694 - (local37 <= 0 ? 0 : Static210.method4979(local37, arg2));
		if (arg3 >= Static15.anInt493) {
			arg3 -= Static15.anInt493;
		}
		@Pc(76) int local76;
		@Pc(80) int local80;
		if (local52 > 0) {
			if (arg1 > 0 && arg4 > 0) {
				local76 = arg4 / 2;
				local80 = arg1 / 2;
				@Pc(91) int local91 = local52 > local76 ? local76 : local52;
				@Pc(102) int local102 = local80 >= local52 ? local52 : local80;
				@Pc(106) int local106 = local91 + arg3;
				@Pc(112) int local112 = arg4 - local91 * 2;
				for (@Pc(114) int local114 = 0; local114 < arg1; local114++) {
					@Pc(122) int[] local122 = arg5[arg0 + local114];
					@Pc(135) int local135;
					@Pc(143) int local143;
					@Pc(151) int local151;
					if (local114 < local102) {
						local135 = local29 * local114 / local102;
						if (this.anInt4691 == 0) {
							for (local143 = 0; local143 < local91; local143++) {
								local151 = local143 * local29 / local91;
								local122[arg3 + local143 & Static317.anInt6151] = local122[Static317.anInt6151 & arg3 + arg4 - local143 - 1] = local135 * local151 >> 12;
							}
						} else {
							for (local143 = 0; local143 < local91; local143++) {
								local151 = local143 * local29 / local91;
								local122[arg3 + local143 & Static317.anInt6151] = local122[arg3 + arg4 - local143 - 1 & Static317.anInt6151] = local135 > local151 ? local151 : local135;
							}
						}
						if (Static15.anInt493 >= local112 + local106) {
							Static359.method754(local122, local106, local112, local135);
						} else {
							local143 = Static15.anInt493 - local106;
							Static359.method754(local122, local106, local143, local135);
							Static359.method754(local122, 0, local112 - local143, local135);
						}
					} else {
						local135 = arg1 - local114 - 1;
						if (local135 < local102) {
							local143 = local135 * local29 / local102;
							@Pc(293) int local293;
							if (this.anInt4691 == 0) {
								for (local151 = 0; local151 < local91; local151++) {
									local293 = local151 * local29 / local91;
									local122[local151 + arg3 & Static317.anInt6151] = local122[Static317.anInt6151 & arg4 + arg3 - local151 - 1] = local143 * local293 >> 12;
								}
							} else {
								for (local151 = 0; local151 < local91; local151++) {
									local293 = local151 * local29 / local91;
									local122[Static317.anInt6151 & local151 + arg3] = local122[Static317.anInt6151 & arg4 + arg3 - local151 - 1] = local143 <= local293 ? local143 : local293;
								}
							}
							if (local112 + local106 <= Static15.anInt493) {
								Static359.method754(local122, local106, local112, local143);
							} else {
								local151 = Static15.anInt493 - local106;
								Static359.method754(local122, local106, local151, local143);
								Static359.method754(local122, 0, local112 - local151, local143);
							}
						} else {
							for (local143 = 0; local143 < local91; local143++) {
								local122[Static317.anInt6151 & arg3 + local143] = local122[Static317.anInt6151 & arg3 + arg4 - local143 - 1] = local143 * local29 / local91;
							}
							if (local112 + local106 > Static15.anInt493) {
								local151 = Static15.anInt493 - local106;
								Static359.method754(local122, local106, local151, local29);
								Static359.method754(local122, 0, local112 - local151, local29);
							} else {
								Static359.method754(local122, local106, local112, local29);
							}
						}
					}
				}
			}
		} else if (arg3 + arg4 <= Static15.anInt493) {
			for (local76 = 0; local76 < arg1; local76++) {
				Static359.method754(arg5[local76 + arg0], arg3, arg4, local29);
			}
		} else {
			local76 = Static15.anInt493 - arg3;
			for (local80 = 0; local80 < arg1; local80++) {
				@Pc(532) int[] local532 = arg5[local80 + arg0];
				Static359.method754(local532, arg3, local76, local29);
				Static359.method754(local532, 0, arg4 - local76, local29);
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass52_41.method1260(arg0);
		if (!super.aClass52_41.aBoolean95) {
			return local15;
		}
		@Pc(24) int[][] local24 = super.aClass52_41.method1261();
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = true;
		@Pc(38) boolean local38 = true;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49 = this.anInt4695 * Static15.anInt493 >> 12;
		@Pc(56) int local56 = Static15.anInt493 * this.anInt4682 >> 12;
		@Pc(63) int local63 = Static88.anInt1584 * this.anInt4688 >> 12;
		@Pc(70) int local70 = this.anInt4680 * Static88.anInt1584 >> 12;
		if (local70 <= 1) {
			return local24[arg0];
		}
		this.anInt4694 = this.anInt4683 * (Static15.anInt493 / 8) >> 12;
		@Pc(93) int local93 = Static15.anInt493 / local49 + 1;
		@Pc(97) int[][] local97 = new int[local93][3];
		@Pc(101) int[][] local101 = new int[local93][3];
		@Pc(108) Random local108 = new Random((long) this.anInt4693);
		while (true) {
			while (true) {
				@Pc(117) int local117 = Static210.method4979(local56 - local49, local108) + local49;
				@Pc(127) int local127 = Static210.method4979(local70 - local63, local108) + local63;
				@Pc(132) int local132 = local32 + local117;
				if (Static15.anInt493 < local132) {
					local117 = Static15.anInt493 - local32;
					local132 = Static15.anInt493;
				}
				@Pc(177) int local177;
				@Pc(156) int local156;
				if (local38) {
					local177 = 0;
				} else {
					@Pc(150) int local150 = local34;
					@Pc(154) int[] local154 = local101[local34];
					local156 = 0;
					@Pc(160) int local160 = local26 + local132;
					if (local160 < 0) {
						local160 += Static15.anInt493;
					}
					if (Static15.anInt493 < local160) {
						local160 -= Static15.anInt493;
					}
					local177 = local154[2];
					while (true) {
						@Pc(181) int[] local181 = local101[local150];
						if (local160 >= local181[0] && local160 <= local181[1]) {
							if (local150 != local34) {
								@Pc(215) int local215 = local26 + local32;
								if (local215 < 0) {
									local215 += Static15.anInt493;
								}
								if (Static15.anInt493 < local215) {
									local215 -= Static15.anInt493;
								}
								for (@Pc(233) int local233 = 1; local233 <= local156; local233++) {
									@Pc(243) int[] local243 = local101[(local233 + local34) % local40];
									local177 = Math.max(local177, local243[2]);
								}
								for (@Pc(259) int local259 = 0; local259 <= local156; local259++) {
									@Pc(270) int[] local270 = local101[(local34 + local259) % local40];
									@Pc(274) int local274 = local270[2];
									if (local177 != local274) {
										@Pc(281) int local281 = local270[0];
										@Pc(285) int local285 = local270[1];
										@Pc(295) int local295;
										@Pc(299) int local299;
										if (local215 < local160) {
											local295 = Math.max(local215, local281);
											local299 = Math.min(local160, local285);
										} else if (local281 == 0) {
											local295 = 0;
											local299 = Math.min(local160, local285);
										} else {
											local295 = Math.max(local215, local281);
											local299 = Static15.anInt493;
										}
										this.method4111(local274, local177 - local274, local108, local30 + local295, local299 + -local295, local24);
									}
								}
							}
							local34 = local150;
							break;
						}
						local156++;
						@Pc(199) int local199 = ~local40;
						local150++;
						if (local199 >= ~local150) {
							local150 = 0;
						}
					}
				}
				if (Static88.anInt1584 < local177 + local127) {
					local127 = Static88.anInt1584 - local177;
				} else {
					local36 = false;
				}
				@Pc(382) int[] local382;
				if (Static15.anInt493 == local132) {
					this.method4111(local177, local127, local108, local28 + local32, local117, local24);
					if (local36) {
						return local15;
					}
					local36 = true;
					local382 = local97[local42++];
					local382[2] = local177 + local127;
					local382[0] = local32;
					local382[1] = local132;
					@Pc(399) int[][] local399 = local101;
					local101 = local97;
					local40 = local42;
					local97 = local399;
					local30 = local28;
					local42 = 0;
					local28 = Static210.method4979(Static15.anInt493, local108);
					local32 = 0;
					local26 = local28 - local30;
					local156 = local26;
					if (local26 < 0) {
						local156 = local26 + Static15.anInt493;
					}
					local34 = 0;
					if (local156 > Static15.anInt493) {
						local156 -= Static15.anInt493;
					}
					local38 = false;
					while (true) {
						@Pc(450) int[] local450 = local101[local34];
						if (local450[0] <= local156 && local450[1] >= local156) {
							break;
						}
						local34++;
						if (local34 >= local40) {
							local34 = 0;
						}
					}
				} else {
					local382 = local97[local42++];
					local382[1] = local132;
					local382[2] = local177 + local127;
					local382[0] = local32;
					this.method4111(local177, local127, local108, local28 + local32, local117, local24);
					local32 = local132;
				}
			}
		}
	}
}
