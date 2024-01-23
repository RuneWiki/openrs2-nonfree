import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
	private int anInt4174;

	@OriginalMember(owner = "client!od", name = "R", descriptor = "I")
	private int anInt4166 = 1024;

	@OriginalMember(owner = "client!od", name = "S", descriptor = "I")
	private int anInt4167 = 1024;

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
	private int anInt4178 = 819;

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
	private int anInt4179 = 1024;

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
	private int anInt4176 = 0;

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
	private int anInt4172 = 2048;

	@OriginalMember(owner = "client!od", name = "U", descriptor = "I")
	private int anInt4168 = 409;

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
	private int anInt4173 = 0;

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
	private int anInt4175 = 1024;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass114_41.method3364(arg0);
		if (!this.aClass114_41.aBoolean211) {
			return local11;
		}
		@Pc(23) int local23 = 0;
		@Pc(28) int[][] local28 = this.aClass114_41.method3365();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) int local40 = 0;
		@Pc(47) int local47 = this.anInt4166 * Static75.anInt1848 >> 12;
		@Pc(49) boolean local49 = true;
		@Pc(51) int local51 = 0;
		@Pc(58) int local58 = this.anInt4168 * Static6.anInt2264 >> 12;
		@Pc(65) int local65 = Static75.anInt1848 * this.anInt4172 >> 12;
		@Pc(72) int local72 = this.anInt4178 * Static6.anInt2264 >> 12;
		if (local72 <= 1) {
			return local28[arg0];
		}
		this.anInt4174 = this.anInt4179 * (Static75.anInt1848 / 8) >> 12;
		@Pc(95) int local95 = Static75.anInt1848 / local47 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(106) Random local106 = new Random((long) this.anInt4173);
		@Pc(110) int[][] local110 = new int[local95][3];
		while (true) {
			while (true) {
				@Pc(120) int local120 = local47 + Static13.method291(local65 - local47, local106);
				@Pc(130) int local130 = local58 + Static13.method291(local72 - local58, local106);
				@Pc(134) int local134 = local36 + local120;
				if (Static75.anInt1848 < local134) {
					local134 = Static75.anInt1848;
					local120 = Static75.anInt1848 - local36;
				}
				@Pc(158) int local158;
				@Pc(172) int local172;
				if (local38) {
					local158 = 0;
				} else {
					@Pc(154) int[] local154 = local110[local34];
					local158 = local154[2];
					@Pc(160) int local160 = local34;
					@Pc(164) int local164 = local134 + local23;
					if (local164 < 0) {
						local164 += Static75.anInt1848;
					}
					local172 = 0;
					if (Static75.anInt1848 < local164) {
						local164 -= Static75.anInt1848;
					}
					while (true) {
						@Pc(183) int[] local183 = local110[local160];
						if (local183[0] <= local164 && local164 <= local183[1]) {
							if (local34 != local160) {
								@Pc(225) int local225 = local36 + local23;
								if (local225 < 0) {
									local225 += Static75.anInt1848;
								}
								if (local225 > Static75.anInt1848) {
									local225 -= Static75.anInt1848;
								}
								@Pc(245) int local245;
								@Pc(260) int[] local260;
								for (local245 = 1; local245 <= local172; local245++) {
									local260 = local110[(local245 + local34) % local51];
									local158 = Math.max(local158, local260[2]);
								}
								for (local245 = 0; local245 <= local172; local245++) {
									local260 = local110[(local245 + local34) % local51];
									@Pc(290) int local290 = local260[2];
									if (local158 != local290) {
										@Pc(302) int local302 = local260[0];
										@Pc(306) int local306 = local260[1];
										@Pc(314) int local314;
										@Pc(318) int local318;
										if (local225 < local164) {
											local314 = Math.max(local225, local302);
											local318 = Math.min(local164, local306);
										} else if (local302 == 0) {
											local314 = 0;
											local318 = Math.min(local164, local306);
										} else {
											local314 = Math.max(local225, local302);
											local318 = Static75.anInt1848;
										}
										this.method3354(local290, local158 - local290, local28, local314 + local30, local106, local318 - local314);
									}
								}
							}
							local34 = local160;
							break;
						}
						local172++;
						@Pc(207) int local207 = ~local51;
						local160++;
						if (local207 >= ~local160) {
							local160 = 0;
						}
					}
				}
				if (local158 + local130 > Static6.anInt2264) {
					local130 = Static6.anInt2264 - local158;
				} else {
					local49 = false;
				}
				@Pc(407) int[] local407;
				if (local134 == Static75.anInt1848) {
					this.method3354(local158, local130, local28, local32 + local36, local106, local120);
					if (local49) {
						return local11;
					}
					local34 = 0;
					local49 = true;
					local30 = local32;
					@Pc(400) int[][] local400 = local110;
					local38 = false;
					local407 = local99[local40++];
					local407[2] = local158 + local130;
					local407[1] = local134;
					local110 = local99;
					local99 = local400;
					local51 = local40;
					local407[0] = local36;
					local40 = 0;
					local32 = Static13.method291(Static75.anInt1848, local106);
					local23 = local32 - local30;
					local36 = 0;
					local172 = local23;
					if (local23 < 0) {
						local172 = local23 + Static75.anInt1848;
					}
					if (Static75.anInt1848 < local172) {
						local172 -= Static75.anInt1848;
					}
					while (true) {
						@Pc(469) int[] local469 = local110[local34];
						if (local469[0] <= local172 && local172 <= local469[1]) {
							break;
						}
						local34++;
						if (local51 <= local34) {
							local34 = 0;
						}
					}
				} else {
					local407 = local99[local40++];
					local407[2] = local130 + local158;
					local407[1] = local134;
					local407[0] = local36;
					this.method3354(local158, local130, local28, local36 + local32, local106, local120);
					local36 = local134;
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4173 = arg0.method2655();
		} else if (arg1 == 1) {
			this.anInt4166 = arg0.method2652();
		} else if (arg1 == 2) {
			this.anInt4172 = arg0.method2652();
		} else if (arg1 == 3) {
			this.anInt4168 = arg0.method2652();
		} else if (arg1 == 4) {
			this.anInt4178 = arg0.method2652();
		} else if (arg1 == 5) {
			this.anInt4179 = arg0.method2652();
		} else if (arg1 == 6) {
			this.anInt4176 = arg0.method2655();
		} else if (arg1 == 7) {
			this.anInt4175 = arg0.method2652();
		} else if (arg1 == 8) {
			this.anInt4167 = arg0.method2652();
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIB[[IILjava/util/Random;I)V")
	private void method3354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = this.anInt4167 <= 0 ? 4096 : 4096 - Static13.method291(this.anInt4167, arg4);
		@Pc(29) int local29 = this.anInt4174 * this.anInt4175 >> 12;
		@Pc(44) int local44 = this.anInt4174 - (local29 > 0 ? Static13.method291(local29, arg4) : 0);
		if (Static75.anInt1848 <= arg3) {
			arg3 -= Static75.anInt1848;
		}
		@Pc(85) int local85;
		@Pc(81) int local81;
		if (local44 > 0) {
			if (arg1 <= 0 || arg5 <= 0) {
				return;
			}
			local81 = arg1 / 2;
			local85 = arg5 / 2;
			@Pc(96) int local96 = local85 < local44 ? local85 : local44;
			@Pc(100) int local100 = local96 + arg3;
			@Pc(111) int local111 = local81 < local44 ? local81 : local44;
			@Pc(118) int local118 = arg5 - local96 * 2;
			for (@Pc(120) int local120 = 0; local120 < arg1; local120++) {
				@Pc(133) int[] local133 = arg2[local120 + arg0];
				@Pc(147) int local147;
				@Pc(153) int local153;
				@Pc(166) int local166;
				if (local111 <= local120) {
					local147 = arg1 - local120 - 1;
					if (local147 < local111) {
						local153 = local17 * local147 / local111;
						@Pc(312) int local312;
						if (this.anInt4176 == 0) {
							for (local166 = 0; local166 < local96; local166++) {
								local312 = local166 * local17 / local96;
								local133[Static145.anInt3482 & local166 + arg3] = local133[Static145.anInt3482 & arg5 + arg3 - local166 - 1] = local312 * local153 >> 12;
							}
						} else {
							for (local166 = 0; local166 < local96; local166++) {
								local312 = local17 * local166 / local96;
								local133[Static145.anInt3482 & arg3 + local166] = local133[arg3 + arg5 - local166 - 1 & Static145.anInt3482] = local153 <= local312 ? local153 : local312;
							}
						}
						if (Static75.anInt1848 < local100 + local118) {
							local166 = Static75.anInt1848 - local100;
							Static302.method1371(local133, local100, local166, local153);
							Static302.method1371(local133, 0, local118 - local166, local153);
						} else {
							Static302.method1371(local133, local100, local118, local153);
						}
					} else {
						for (local153 = 0; local153 < local96; local153++) {
							local133[Static145.anInt3482 & arg3 + local153] = local133[Static145.anInt3482 & arg3 + arg5 - local153 - 1] = local153 * local17 / local96;
						}
						if (Static75.anInt1848 < local100 + local118) {
							local153 = Static75.anInt1848 - local100;
							Static302.method1371(local133, local100, local153, local17);
							Static302.method1371(local133, 0, local118 - local153, local17);
						} else {
							Static302.method1371(local133, local100, local118, local17);
						}
					}
				} else {
					local147 = local120 * local17 / local111;
					if (this.anInt4176 == 0) {
						for (local153 = 0; local153 < local96; local153++) {
							local166 = local153 * local17 / local96;
							local133[arg3 + local153 & Static145.anInt3482] = local133[Static145.anInt3482 & arg3 + arg5 - local153 - 1] = local147 * local166 >> 12;
						}
					} else {
						for (local153 = 0; local153 < local96; local153++) {
							local166 = local153 * local17 / local96;
							local133[Static145.anInt3482 & local153 + arg3] = local133[arg3 + arg5 - local153 - 1 & Static145.anInt3482] = local166 < local147 ? local166 : local147;
						}
					}
					if (local100 + local118 > Static75.anInt1848) {
						local153 = Static75.anInt1848 - local100;
						Static302.method1371(local133, local100, local153, local147);
						Static302.method1371(local133, 0, local118 - local153, local147);
					} else {
						Static302.method1371(local133, local100, local118, local147);
					}
				}
			}
		} else if (arg5 + arg3 > Static75.anInt1848) {
			local85 = Static75.anInt1848 - arg3;
			for (local81 = 0; local81 < arg1; local81++) {
				@Pc(512) int[] local512 = arg2[local81 + arg0];
				Static302.method1371(local512, arg3, local85, local17);
				Static302.method1371(local512, 0, arg5 - local85, local17);
			}
		} else {
			for (local85 = 0; local85 < arg1; local85++) {
				Static302.method1371(arg2[arg0 + local85], arg3, arg5, local17);
			}
		}
	}
}
