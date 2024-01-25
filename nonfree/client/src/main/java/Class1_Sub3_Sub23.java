import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class1_Sub3_Sub23 extends Class1_Sub3 {

	@OriginalMember(owner = "client!lo", name = "W", descriptor = "I")
	private int anInt5278;

	@OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
	private int anInt5263 = 1024;

	@OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
	private int anInt5265 = 0;

	@OriginalMember(owner = "client!lo", name = "Q", descriptor = "I")
	private int anInt5272 = 409;

	@OriginalMember(owner = "client!lo", name = "R", descriptor = "I")
	private int anInt5273 = 1024;

	@OriginalMember(owner = "client!lo", name = "S", descriptor = "I")
	private int anInt5274 = 1024;

	@OriginalMember(owner = "client!lo", name = "V", descriptor = "I")
	private int anInt5277 = 819;

	@OriginalMember(owner = "client!lo", name = "U", descriptor = "I")
	private int anInt5276 = 2048;

	@OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
	private int anInt5267 = 0;

	@OriginalMember(owner = "client!lo", name = "Z", descriptor = "I")
	private int anInt5280 = 1024;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/util/Random;[[IIIZII)V")
	private void method4558(@OriginalArg(0) Random arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt5280 <= 0 ? 4096 : 4096 - Static220.method3801(arg0, this.anInt5280);
		@Pc(30) int local30 = this.anInt5278 * this.anInt5263 >> 12;
		@Pc(45) int local45 = this.anInt5278 - (local30 <= 0 ? 0 : Static220.method3801(arg0, local30));
		if (Static452.anInt7734 <= arg2) {
			arg2 -= Static452.anInt7734;
		}
		@Pc(70) int local70;
		@Pc(72) int local72;
		if (local45 > 0) {
			if (arg3 <= 0 || arg5 <= 0) {
				return;
			}
			local70 = arg5 / 2;
			local72 = arg3 / 2;
			@Pc(149) int local149 = local45 <= local70 ? local45 : local70;
			@Pc(160) int local160 = local45 <= local72 ? local45 : local72;
			@Pc(165) int local165 = arg2 + local149;
			@Pc(171) int local171 = arg5 - local149 * 2;
			for (@Pc(173) int local173 = 0; local173 < arg3; local173++) {
				@Pc(182) int[] local182 = arg1[local173 + arg4];
				@Pc(195) int local195;
				@Pc(200) int local200;
				@Pc(208) int local208;
				if (local160 > local173) {
					local195 = local173 * local22 / local160;
					if (this.anInt5267 == 0) {
						for (local200 = 0; local200 < local149; local200++) {
							local208 = local22 * local200 / local149;
							local182[local200 + arg2 & Static80.anInt1453] = local182[Static80.anInt1453 & arg5 + arg2 - local200 - 1] = local208 * local195 >> 12;
						}
					} else {
						for (local200 = 0; local200 < local149; local200++) {
							local208 = local22 * local200 / local149;
							local182[Static80.anInt1453 & arg2 + local200] = local182[arg5 + arg2 - local200 - 1 & Static80.anInt1453] = local208 < local195 ? local208 : local195;
						}
					}
					if (local171 + local165 > Static452.anInt7734) {
						local200 = Static452.anInt7734 - local165;
						Static551.method3492(local182, local165, local200, local195);
						Static551.method3492(local182, 0, local171 - local200, local195);
					} else {
						Static551.method3492(local182, local165, local171, local195);
					}
				} else {
					local195 = arg3 - local173 - 1;
					if (local160 > local195) {
						local200 = local22 * local195 / local160;
						@Pc(349) int local349;
						if (this.anInt5267 == 0) {
							for (local208 = 0; local208 < local149; local208++) {
								local349 = local208 * local22 / local149;
								local182[local208 + arg2 & Static80.anInt1453] = local182[arg5 + arg2 - local208 - 1 & Static80.anInt1453] = local200 * local349 >> 12;
							}
						} else {
							for (local208 = 0; local208 < local149; local208++) {
								local349 = local22 * local208 / local149;
								local182[local208 + arg2 & Static80.anInt1453] = local182[Static80.anInt1453 & arg5 + arg2 - local208 - 1] = local349 < local200 ? local349 : local200;
							}
						}
						if (Static452.anInt7734 < local171 + local165) {
							local208 = Static452.anInt7734 - local165;
							Static551.method3492(local182, local165, local208, local200);
							Static551.method3492(local182, 0, local171 - local208, local200);
						} else {
							Static551.method3492(local182, local165, local171, local200);
						}
					} else {
						for (local200 = 0; local200 < local149; local200++) {
							local182[Static80.anInt1453 & local200 + arg2] = local182[Static80.anInt1453 & arg2 + arg5 - local200 - 1] = local22 * local200 / local149;
						}
						if (Static452.anInt7734 < local165 + local171) {
							local208 = Static452.anInt7734 - local165;
							Static551.method3492(local182, local165, local208, local22);
							Static551.method3492(local182, 0, local171 - local208, local22);
						} else {
							Static551.method3492(local182, local165, local171, local22);
						}
					}
				}
			}
		} else if (arg5 + arg2 > Static452.anInt7734) {
			local70 = Static452.anInt7734 - arg2;
			for (local72 = 0; local72 < arg3; local72++) {
				@Pc(80) int[] local80 = arg1[local72 + arg4];
				Static551.method3492(local80, arg2, local70, local22);
				Static551.method3492(local80, 0, arg5 - local70, local22);
			}
		} else {
			for (local70 = 0; local70 < arg3; local70++) {
				Static551.method3492(arg1[arg4 + local70], arg2, arg5, local22);
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass12_41.method502(arg0);
		if (!super.aClass12_41.aBoolean23) {
			return local13;
		}
		@Pc(27) int[][] local27 = super.aClass12_41.method505();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) boolean local39 = true;
		@Pc(41) boolean local41 = true;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(52) int local52 = this.anInt5273 * Static452.anInt7734 >> 12;
		@Pc(59) int local59 = this.anInt5276 * Static452.anInt7734 >> 12;
		@Pc(66) int local66 = this.anInt5272 * Static272.anInt5156 >> 12;
		@Pc(73) int local73 = Static272.anInt5156 * this.anInt5277 >> 12;
		if (local73 <= 1) {
			return local27[arg0];
		}
		this.anInt5278 = Static452.anInt7734 / 8 * this.anInt5274 >> 12;
		@Pc(96) int local96 = Static452.anInt7734 / local52 + 1;
		@Pc(100) int[][] local100 = new int[local96][3];
		@Pc(104) int[][] local104 = new int[local96][3];
		@Pc(111) Random local111 = new Random((long) this.anInt5265);
		while (true) {
			while (true) {
				@Pc(120) int local120 = local52 + Static220.method3801(local111, local59 - local52);
				@Pc(130) int local130 = Static220.method3801(local111, local73 - local66) + local66;
				@Pc(135) int local135 = local35 + local120;
				if (Static452.anInt7734 < local135) {
					local120 = Static452.anInt7734 - local35;
					local135 = Static452.anInt7734;
				}
				@Pc(149) int local149;
				@Pc(159) int local159;
				if (local41) {
					local149 = 0;
				} else {
					@Pc(153) int local153 = local37;
					@Pc(157) int[] local157 = local104[local37];
					local159 = 0;
					@Pc(163) int local163 = local135 + local29;
					if (local163 < 0) {
						local163 += Static452.anInt7734;
					}
					if (Static452.anInt7734 < local163) {
						local163 -= Static452.anInt7734;
					}
					while (true) {
						@Pc(183) int[] local183 = local104[local153];
						if (local163 >= local183[0] && local163 <= local183[1]) {
							local149 = local157[2];
							if (local37 != local153) {
								@Pc(221) int local221 = local29 + local35;
								if (local221 < 0) {
									local221 += Static452.anInt7734;
								}
								if (local221 > Static452.anInt7734) {
									local221 -= Static452.anInt7734;
								}
								for (@Pc(239) int local239 = 1; local239 <= local159; local239++) {
									@Pc(250) int[] local250 = local104[(local37 + local239) % local43];
									local149 = Math.max(local149, local250[2]);
								}
								for (@Pc(266) int local266 = 0; local266 <= local159; local266++) {
									@Pc(276) int[] local276 = local104[(local266 + local37) % local43];
									@Pc(280) int local280 = local276[2];
									if (local280 != local149) {
										@Pc(287) int local287 = local276[0];
										@Pc(291) int local291 = local276[1];
										@Pc(302) int local302;
										@Pc(306) int local306;
										if (local163 > local221) {
											local302 = Math.max(local221, local287);
											local306 = Math.min(local163, local291);
										} else if (local287 == 0) {
											local306 = Math.min(local163, local291);
											local302 = 0;
										} else {
											local302 = Math.max(local221, local287);
											local306 = Static452.anInt7734;
										}
										this.method4558(local111, local27, local302 + local33, local149 + -local280, local280, local306 - local302);
									}
								}
							}
							local37 = local153;
							break;
						}
						local153++;
						if (local153 >= local43) {
							local153 = 0;
						}
						local159++;
					}
				}
				if (Static272.anInt5156 < local149 + local130) {
					local130 = Static272.anInt5156 - local149;
				} else {
					local39 = false;
				}
				@Pc(378) int[] local378;
				if (Static452.anInt7734 == local135) {
					this.method4558(local111, local27, local31 + local35, local130, local149, local120);
					if (local39) {
						return local13;
					}
					local39 = true;
					local378 = local100[local45++];
					local378[1] = local135;
					local378[2] = local130 + local149;
					local378[0] = local35;
					@Pc(443) int[][] local443 = local104;
					local104 = local100;
					local100 = local443;
					local43 = local45;
					local33 = local31;
					local45 = 0;
					local31 = Static220.method3801(local111, Static452.anInt7734);
					local29 = local31 - local33;
					local35 = 0;
					local159 = local29;
					if (local29 < 0) {
						local159 = local29 + Static452.anInt7734;
					}
					if (local159 > Static452.anInt7734) {
						local159 -= Static452.anInt7734;
					}
					local37 = 0;
					while (true) {
						@Pc(492) int[] local492 = local104[local37];
						if (local492[0] <= local159 && local492[1] >= local159) {
							local41 = false;
							break;
						}
						local37++;
						if (local37 >= local43) {
							local37 = 0;
						}
					}
				} else {
					local378 = local100[local45++];
					local378[2] = local130 + local149;
					local378[0] = local35;
					local378[1] = local135;
					this.method4558(local111, local27, local31 + local35, local130, local149, local120);
					local35 = local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5265 = arg0.method3922();
		} else if (arg1 == 1) {
			this.anInt5273 = arg0.method3967();
		} else if (arg1 == 2) {
			this.anInt5276 = arg0.method3967();
		} else if (arg1 == 3) {
			this.anInt5272 = arg0.method3967();
		} else if (arg1 == 4) {
			this.anInt5277 = arg0.method3967();
		} else if (arg1 == 5) {
			this.anInt5274 = arg0.method3967();
		} else if (arg1 == 6) {
			this.anInt5267 = arg0.method3922();
		} else if (arg1 == 7) {
			this.anInt5263 = arg0.method3967();
		} else if (arg1 == 8) {
			this.anInt5280 = arg0.method3967();
		}
	}
}
