import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class4_Sub4_Sub12 extends Class4_Sub4 {

	@OriginalMember(owner = "client!id", name = "R", descriptor = "I")
	private int anInt4392;

	@OriginalMember(owner = "client!id", name = "I", descriptor = "I")
	private int anInt4385 = 1024;

	@OriginalMember(owner = "client!id", name = "N", descriptor = "I")
	private int anInt4389 = 819;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "I")
	private int anInt4386 = 1024;

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
	private int anInt4391 = 1024;

	@OriginalMember(owner = "client!id", name = "O", descriptor = "I")
	private int anInt4390 = 0;

	@OriginalMember(owner = "client!id", name = "H", descriptor = "I")
	private int anInt4384 = 1024;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "I")
	private int anInt4383 = 409;

	@OriginalMember(owner = "client!id", name = "T", descriptor = "I")
	private int anInt4394 = 0;

	@OriginalMember(owner = "client!id", name = "U", descriptor = "I")
	private int anInt4395 = 2048;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4390 = arg1.method6015();
		} else if (arg0 == 1) {
			this.anInt4386 = arg1.method5982();
		} else if (arg0 == 2) {
			this.anInt4395 = arg1.method5982();
		} else if (arg0 == 3) {
			this.anInt4383 = arg1.method5982();
		} else if (arg0 == 4) {
			this.anInt4389 = arg1.method5982();
		} else if (arg0 == 5) {
			this.anInt4385 = arg1.method5982();
		} else if (arg0 == 6) {
			this.anInt4394 = arg1.method6015();
		} else if (arg0 == 7) {
			this.anInt4384 = arg1.method5982();
		} else if (arg0 == 8) {
			this.anInt4391 = arg1.method5982();
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[[IBIIILjava/util/Random;)V")
	private void method3717(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(22) int local22 = this.anInt4391 <= 0 ? 4096 : 4096 - Static87.method2047(this.anInt4391, arg5);
		@Pc(30) int local30 = this.anInt4384 * this.anInt4392 >> 12;
		@Pc(42) int local42 = this.anInt4392 - (local30 <= 0 ? 0 : Static87.method2047(local30, arg5));
		if (Static560.anInt9394 <= arg0) {
			arg0 -= Static560.anInt9394;
		}
		@Pc(69) int local69;
		@Pc(71) int local71;
		if (local42 > 0) {
			if (arg3 <= 0 || arg4 <= 0) {
				return;
			}
			local69 = arg4 / 2;
			local71 = arg3 / 2;
			@Pc(148) int local148 = local69 >= local42 ? local42 : local69;
			@Pc(159) int local159 = local42 <= local71 ? local42 : local71;
			@Pc(163) int local163 = local148 + arg0;
			@Pc(170) int local170 = arg4 - local148 * 2;
			for (@Pc(172) int local172 = 0; local172 < arg3; local172++) {
				@Pc(180) int[] local180 = arg1[arg2 + local172];
				@Pc(189) int local189;
				@Pc(197) int local197;
				@Pc(205) int local205;
				if (local159 > local172) {
					local189 = local172 * local22 / local159;
					if (this.anInt4394 == 0) {
						for (local197 = 0; local197 < local148; local197++) {
							local205 = local22 * local197 / local148;
							local180[Static571.anInt9405 & arg0 + local197] = local180[Static571.anInt9405 & arg0 + arg4 - local197 - 1] = local189 * local205 >> 12;
						}
					} else {
						for (local197 = 0; local197 < local148; local197++) {
							local205 = local197 * local22 / local148;
							local180[arg0 + local197 & Static571.anInt9405] = local180[Static571.anInt9405 & arg0 + arg4 - local197 - 1] = local205 < local189 ? local205 : local189;
						}
					}
					if (local163 + local170 > Static560.anInt9394) {
						local197 = Static560.anInt9394 - local163;
						Static602.method1584(local180, local163, local197, local189);
						Static602.method1584(local180, 0, local170 - local197, local189);
					} else {
						Static602.method1584(local180, local163, local170, local189);
					}
				} else {
					local189 = arg3 - local172 - 1;
					if (local159 > local189) {
						local197 = local22 * local189 / local159;
						@Pc(345) int local345;
						if (this.anInt4394 == 0) {
							for (local205 = 0; local205 < local148; local205++) {
								local345 = local205 * local22 / local148;
								local180[local205 + arg0 & Static571.anInt9405] = local180[Static571.anInt9405 & arg4 + arg0 - local205 - 1] = local197 * local345 >> 12;
							}
						} else {
							for (local205 = 0; local205 < local148; local205++) {
								local345 = local22 * local205 / local148;
								local180[Static571.anInt9405 & arg0 + local205] = local180[arg0 + arg4 - local205 - 1 & Static571.anInt9405] = local197 <= local345 ? local197 : local345;
							}
						}
						if (Static560.anInt9394 >= local163 + local170) {
							Static602.method1584(local180, local163, local170, local197);
						} else {
							local205 = Static560.anInt9394 - local163;
							Static602.method1584(local180, local163, local205, local197);
							Static602.method1584(local180, 0, local170 - local205, local197);
						}
					} else {
						for (local197 = 0; local197 < local148; local197++) {
							local180[Static571.anInt9405 & local197 + arg0] = local180[Static571.anInt9405 & arg4 + arg0 - local197 - 1] = local22 * local197 / local148;
						}
						if (Static560.anInt9394 < local170 + local163) {
							local205 = Static560.anInt9394 - local163;
							Static602.method1584(local180, local163, local205, local22);
							Static602.method1584(local180, 0, local170 - local205, local22);
						} else {
							Static602.method1584(local180, local163, local170, local22);
						}
					}
				}
			}
		} else if (arg0 + arg4 > Static560.anInt9394) {
			local69 = Static560.anInt9394 - arg0;
			for (local71 = 0; local71 < arg3; local71++) {
				@Pc(80) int[] local80 = arg1[arg2 + local71];
				Static602.method1584(local80, arg0, local69, local22);
				Static602.method1584(local80, 0, arg4 - local69, local22);
			}
		} else {
			for (local69 = 0; local69 < arg3; local69++) {
				Static602.method1584(arg1[arg2 + local69], arg0, arg4, local22);
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass343_41.method7596(arg0);
		if (!super.aClass343_41.aBoolean638) {
			return local16;
		}
		@Pc(25) int[][] local25 = super.aClass343_41.method7592();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = this.anInt4386 * Static560.anInt9394 >> 12;
		@Pc(57) int local57 = Static560.anInt9394 * this.anInt4395 >> 12;
		@Pc(64) int local64 = Static278.anInt5214 * this.anInt4383 >> 12;
		@Pc(71) int local71 = this.anInt4389 * Static278.anInt5214 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt4392 = this.anInt4385 * (Static560.anInt9394 / 8) >> 12;
		@Pc(96) int local96 = Static560.anInt9394 / local50 + 1;
		@Pc(100) int[][] local100 = new int[local96][3];
		@Pc(104) int[][] local104 = new int[local96][3];
		@Pc(111) Random local111 = new Random((long) this.anInt4390);
		while (true) {
			while (true) {
				@Pc(120) int local120 = Static87.method2047(local57 - local50, local111) + local50;
				@Pc(130) int local130 = local64 + Static87.method2047(local71 - local64, local111);
				@Pc(134) int local134 = local120 + local33;
				if (local134 > Static560.anInt9394) {
					local134 = Static560.anInt9394;
					local120 = Static560.anInt9394 - local33;
				}
				@Pc(152) int local152;
				@Pc(162) int local162;
				if (local39) {
					local152 = 0;
				} else {
					@Pc(156) int local156 = local35;
					@Pc(160) int[] local160 = local104[local35];
					local162 = 0;
					@Pc(166) int local166 = local27 + local134;
					if (local166 < 0) {
						local166 += Static560.anInt9394;
					}
					if (local166 > Static560.anInt9394) {
						local166 -= Static560.anInt9394;
					}
					local152 = local160[2];
					while (true) {
						@Pc(190) int[] local190 = local104[local156];
						if (local190[0] <= local166 && local166 <= local190[1]) {
							if (local35 != local156) {
								@Pc(229) int local229 = local33 + local27;
								if (local229 < 0) {
									local229 += Static560.anInt9394;
								}
								if (local229 > Static560.anInt9394) {
									local229 -= Static560.anInt9394;
								}
								for (@Pc(248) int local248 = 1; local248 <= local162; local248++) {
									@Pc(258) int[] local258 = local104[(local248 + local35) % local41];
									local152 = Math.max(local152, local258[2]);
								}
								for (@Pc(274) int local274 = 0; local274 <= local162; local274++) {
									@Pc(284) int[] local284 = local104[(local274 + local35) % local41];
									@Pc(288) int local288 = local284[2];
									if (local152 != local288) {
										@Pc(299) int local299 = local284[0];
										@Pc(303) int local303 = local284[1];
										@Pc(314) int local314;
										@Pc(318) int local318;
										if (local166 > local229) {
											local314 = Math.max(local229, local299);
											local318 = Math.min(local166, local303);
										} else if (local299 == 0) {
											local314 = 0;
											local318 = Math.min(local166, local303);
										} else {
											local314 = Math.max(local229, local299);
											local318 = Static560.anInt9394;
										}
										this.method3717(local31 + local314, local25, local288, local152 - local288, local318 - local314, local111);
									}
								}
							}
							local35 = local156;
							break;
						}
						local162++;
						local156++;
						if (local156 >= local41) {
							local156 = 0;
						}
					}
				}
				if (local152 + local130 > Static278.anInt5214) {
					local130 = Static278.anInt5214 - local152;
				} else {
					local37 = false;
				}
				@Pc(407) int[] local407;
				if (Static560.anInt9394 == local134) {
					this.method3717(local33 + local29, local25, local152, local130, local120, local111);
					if (local37) {
						return local16;
					}
					local37 = true;
					local407 = local100[local43++];
					local407[0] = local33;
					local407[2] = local152 + local130;
					local407[1] = local134;
					@Pc(424) int[][] local424 = local104;
					local104 = local100;
					local41 = local43;
					local100 = local424;
					local31 = local29;
					local43 = 0;
					local29 = Static87.method2047(Static560.anInt9394, local111);
					local27 = local29 - local31;
					local33 = 0;
					local162 = local27;
					if (local27 < 0) {
						local162 = local27 + Static560.anInt9394;
					}
					if (local162 > Static560.anInt9394) {
						local162 -= Static560.anInt9394;
					}
					local35 = 0;
					local39 = false;
					while (true) {
						@Pc(469) int[] local469 = local104[local35];
						if (local469[0] <= local162 && local162 <= local469[1]) {
							break;
						}
						local35++;
						if (local41 <= local35) {
							local35 = 0;
						}
					}
				} else {
					local407 = local100[local43++];
					local407[1] = local134;
					local407[2] = local152 + local130;
					local407[0] = local33;
					this.method3717(local29 + local33, local25, local152, local130, local120, local111);
					local33 = local134;
				}
			}
		}
	}
}
