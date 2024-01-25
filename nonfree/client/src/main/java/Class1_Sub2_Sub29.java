import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class1_Sub2_Sub29 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
	private int anInt5323;

	@OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
	private int anInt5314 = 819;

	@OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
	private int anInt5321 = 1024;

	@OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
	private int anInt5317 = 409;

	@OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
	private int anInt5319 = 0;

	@OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
	private int anInt5322 = 2048;

	@OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
	private int anInt5324 = 1024;

	@OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
	private int anInt5326 = 0;

	@OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
	private int anInt5327 = 1024;

	@OriginalMember(owner = "client!rk", name = "X", descriptor = "I")
	private int anInt5329 = 1024;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5319 = arg1.method3141();
		} else if (arg0 == 1) {
			this.anInt5324 = arg1.method3115();
		} else if (arg0 == 2) {
			this.anInt5322 = arg1.method3115();
		} else if (arg0 == 3) {
			this.anInt5317 = arg1.method3115();
		} else if (arg0 == 4) {
			this.anInt5314 = arg1.method3115();
		} else if (arg0 == 5) {
			this.anInt5329 = arg1.method3115();
		} else if (arg0 == 6) {
			this.anInt5326 = arg1.method3141();
		} else if (arg0 == 7) {
			this.anInt5327 = arg1.method3115();
		} else if (arg0 == 8) {
			this.anInt5321 = arg1.method3115();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2422(arg0);
		if (!super.aClass84_41.aBoolean227) {
			return local16;
		}
		@Pc(25) int[][] local25 = super.aClass84_41.method2421();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = this.anInt5324 * Static251.anInt6509 >> 12;
		@Pc(57) int local57 = Static251.anInt6509 * this.anInt5322 >> 12;
		@Pc(64) int local64 = Static81.anInt1606 * this.anInt5317 >> 12;
		@Pc(71) int local71 = Static81.anInt1606 * this.anInt5314 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt5323 = Static251.anInt6509 / 8 * this.anInt5329 >> 12;
		@Pc(96) int local96 = Static251.anInt6509 / local50 + 1;
		@Pc(100) int[][] local100 = new int[local96][3];
		@Pc(104) int[][] local104 = new int[local96][3];
		@Pc(111) Random local111 = new Random((long) this.anInt5319);
		while (true) {
			while (true) {
				@Pc(121) int local121 = local50 + Static263.method4610(local111, local57 - local50);
				@Pc(130) int local130 = local64 + Static263.method4610(local111, local71 - local64);
				@Pc(134) int local134 = local121 + local33;
				if (local134 > Static251.anInt6509) {
					local121 = Static251.anInt6509 - local33;
					local134 = Static251.anInt6509;
				}
				@Pc(151) int local151;
				@Pc(161) int local161;
				if (local39) {
					local151 = 0;
				} else {
					@Pc(155) int local155 = local35;
					@Pc(159) int[] local159 = local104[local35];
					local161 = 0;
					@Pc(165) int local165 = local27 + local134;
					if (local165 < 0) {
						local165 += Static251.anInt6509;
					}
					if (Static251.anInt6509 < local165) {
						local165 -= Static251.anInt6509;
					}
					while (true) {
						@Pc(186) int[] local186 = local104[local155];
						if (local165 >= local186[0] && local165 <= local186[1]) {
							local151 = local159[2];
							if (local35 != local155) {
								@Pc(221) int local221 = local33 + local27;
								if (local221 < 0) {
									local221 += Static251.anInt6509;
								}
								if (local221 > Static251.anInt6509) {
									local221 -= Static251.anInt6509;
								}
								for (@Pc(239) int local239 = 1; local239 <= local161; local239++) {
									@Pc(250) int[] local250 = local104[(local35 + local239) % local41];
									local151 = Math.max(local151, local250[2]);
								}
								for (@Pc(266) int local266 = 0; local266 <= local161; local266++) {
									@Pc(276) int[] local276 = local104[(local35 + local266) % local41];
									@Pc(280) int local280 = local276[2];
									if (local151 != local280) {
										@Pc(287) int local287 = local276[0];
										@Pc(291) int local291 = local276[1];
										@Pc(309) int local309;
										@Pc(307) int local307;
										if (local221 < local165) {
											local309 = Math.max(local221, local287);
											local307 = Math.min(local165, local291);
										} else if (local287 == 0) {
											local307 = Math.min(local165, local291);
											local309 = 0;
										} else {
											local309 = Math.max(local221, local287);
											local307 = Static251.anInt6509;
										}
										this.method4750(local31 + local309, -local280 + local151, local307 - local309, local111, local280, local25);
									}
								}
							}
							local35 = local155;
							break;
						}
						local155++;
						if (local41 <= local155) {
							local155 = 0;
						}
						local161++;
					}
				}
				if (local151 + local130 <= Static81.anInt1606) {
					local37 = false;
				} else {
					local130 = Static81.anInt1606 - local151;
				}
				@Pc(378) int[] local378;
				if (local134 == Static251.anInt6509) {
					this.method4750(local29 + local33, local130, local121, local111, local151, local25);
					if (local37) {
						return local16;
					}
					local37 = true;
					local378 = local100[local43++];
					local378[1] = local134;
					local378[2] = local130 + local151;
					local378[0] = local33;
					@Pc(445) int[][] local445 = local104;
					local104 = local100;
					local41 = local43;
					local100 = local445;
					local43 = 0;
					local31 = local29;
					local29 = Static263.method4610(local111, Static251.anInt6509);
					local33 = 0;
					local27 = local29 - local31;
					local161 = local27;
					if (local27 < 0) {
						local161 = local27 + Static251.anInt6509;
					}
					local35 = 0;
					if (local161 > Static251.anInt6509) {
						local161 -= Static251.anInt6509;
					}
					while (true) {
						@Pc(494) int[] local494 = local104[local35];
						if (local161 >= local494[0] && local494[1] >= local161) {
							local39 = false;
							break;
						}
						local35++;
						if (local35 >= local41) {
							local35 = 0;
						}
					}
				} else {
					local378 = local100[local43++];
					local378[1] = local134;
					local378[0] = local33;
					local378[2] = local151 + local130;
					this.method4750(local29 + local33, local130, local121, local111, local151, local25);
					local33 = local134;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIILjava/util/Random;I[[I)V")
	private void method4750(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(22) int local22 = this.anInt5321 <= 0 ? 4096 : 4096 - Static263.method4610(arg3, this.anInt5321);
		@Pc(38) int local38 = this.anInt5327 * this.anInt5323 >> 12;
		@Pc(51) int local51 = this.anInt5323 - (local38 > 0 ? Static263.method4610(arg3, local38) : 0);
		if (Static251.anInt6509 <= arg0) {
			arg0 -= Static251.anInt6509;
		}
		@Pc(74) int local74;
		@Pc(76) int local76;
		if (local51 <= 0) {
			if (Static251.anInt6509 < arg2 + arg0) {
				local74 = Static251.anInt6509 - arg0;
				for (local76 = 0; local76 < arg1; local76++) {
					@Pc(85) int[] local85 = arg5[arg4 + local76];
					Static367.method5379(local85, arg0, local74, local22);
					Static367.method5379(local85, 0, arg2 - local74, local22);
				}
			} else {
				for (local74 = 0; local74 < arg1; local74++) {
					Static367.method5379(arg5[arg4 + local74], arg0, arg2, local22);
				}
			}
		} else if (arg1 > 0 && arg2 > 0) {
			local74 = arg2 / 2;
			local76 = arg1 / 2;
			@Pc(151) int local151 = local74 < local51 ? local74 : local51;
			@Pc(158) int local158 = local76 >= local51 ? local51 : local76;
			@Pc(163) int local163 = arg0 + local151;
			@Pc(170) int local170 = arg2 - local151 * 2;
			for (@Pc(172) int local172 = 0; local172 < arg1; local172++) {
				@Pc(180) int[] local180 = arg5[arg4 + local172];
				@Pc(189) int local189;
				@Pc(197) int local197;
				@Pc(205) int local205;
				if (local172 < local158) {
					local189 = local172 * local22 / local158;
					if (this.anInt5326 == 0) {
						for (local197 = 0; local197 < local151; local197++) {
							local205 = local197 * local22 / local151;
							local180[local197 + arg0 & Static260.anInt5056] = local180[Static260.anInt5056 & arg2 + arg0 - local197 - 1] = local189 * local205 >> 12;
						}
					} else {
						for (local197 = 0; local197 < local151; local197++) {
							local205 = local22 * local197 / local151;
							local180[arg0 + local197 & Static260.anInt5056] = local180[arg2 + arg0 - local197 - 1 & Static260.anInt5056] = local189 <= local205 ? local189 : local205;
						}
					}
					if (local163 + local170 > Static251.anInt6509) {
						local197 = Static251.anInt6509 - local163;
						Static367.method5379(local180, local163, local197, local189);
						Static367.method5379(local180, 0, local170 - local197, local189);
					} else {
						Static367.method5379(local180, local163, local170, local189);
					}
				} else {
					local189 = arg1 - local172 - 1;
					if (local158 > local189) {
						local197 = local22 * local189 / local158;
						@Pc(342) int local342;
						if (this.anInt5326 == 0) {
							for (local205 = 0; local205 < local151; local205++) {
								local342 = local205 * local22 / local151;
								local180[local205 + arg0 & Static260.anInt5056] = local180[arg0 + arg2 - local205 - 1 & Static260.anInt5056] = local197 * local342 >> 12;
							}
						} else {
							for (local205 = 0; local205 < local151; local205++) {
								local342 = local22 * local205 / local151;
								local180[Static260.anInt5056 & arg0 + local205] = local180[arg2 + arg0 - local205 - 1 & Static260.anInt5056] = local197 <= local342 ? local197 : local342;
							}
						}
						if (Static251.anInt6509 < local170 + local163) {
							local205 = Static251.anInt6509 - local163;
							Static367.method5379(local180, local163, local205, local197);
							Static367.method5379(local180, 0, local170 - local205, local197);
						} else {
							Static367.method5379(local180, local163, local170, local197);
						}
					} else {
						for (local197 = 0; local197 < local151; local197++) {
							local180[arg0 + local197 & Static260.anInt5056] = local180[Static260.anInt5056 & arg0 + arg2 - local197 - 1] = local197 * local22 / local151;
						}
						if (Static251.anInt6509 < local163 + local170) {
							local205 = Static251.anInt6509 - local163;
							Static367.method5379(local180, local163, local205, local22);
							Static367.method5379(local180, 0, local170 - local205, local22);
						} else {
							Static367.method5379(local180, local163, local170, local22);
						}
					}
				}
			}
		}
	}
}
