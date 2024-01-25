import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class3_Sub2_Sub36 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ts", name = "M", descriptor = "I")
	private int anInt10179;

	@OriginalMember(owner = "client!ts", name = "U", descriptor = "I")
	private int anInt10177 = 1024;

	@OriginalMember(owner = "client!ts", name = "H", descriptor = "I")
	private int anInt10176 = 1024;

	@OriginalMember(owner = "client!ts", name = "Q", descriptor = "I")
	private int anInt10184 = 1024;

	@OriginalMember(owner = "client!ts", name = "R", descriptor = "I")
	private int anInt10183 = 2048;

	@OriginalMember(owner = "client!ts", name = "Y", descriptor = "I")
	private int anInt10178 = 0;

	@OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
	private int anInt10180 = 409;

	@OriginalMember(owner = "client!ts", name = "X", descriptor = "I")
	private int anInt10182 = 1024;

	@OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
	private int anInt10185 = 819;

	@OriginalMember(owner = "client!ts", name = "P", descriptor = "I")
	private int anInt10190 = 0;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt10190 = arg1.method5322(-128);
		} else if (arg0 == 1) {
			this.anInt10182 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anInt10183 = arg1.method5272();
		} else if (arg0 == 3) {
			this.anInt10180 = arg1.method5272();
		} else if (arg0 == 4) {
			this.anInt10185 = arg1.method5272();
		} else if (arg0 == 5) {
			this.anInt10176 = arg1.method5272();
		} else if (arg0 == 6) {
			this.anInt10178 = arg1.method5322(-93);
		} else if (arg0 == 7) {
			this.anInt10177 = arg1.method5272();
		} else if (arg0 == 8) {
			this.anInt10184 = arg1.method5272();
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIILjava/util/Random;I[[II)V")
	private void method8538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Random arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(20) int local20 = this.anInt10184 > 0 ? 4096 - Static63.method794(this.anInt10184, arg3) : 4096;
		@Pc(28) int local28 = this.anInt10177 * this.anInt10179 >> 12;
		@Pc(45) int local45 = this.anInt10179 - (local28 <= 0 ? 0 : Static63.method794(local28, arg3));
		if (Static636.anInt10302 <= arg2) {
			arg2 -= Static636.anInt10302;
		}
		@Pc(72) int local72;
		@Pc(74) int local74;
		if (local45 <= 0) {
			if (Static636.anInt10302 < arg2 + arg5) {
				local72 = Static636.anInt10302 - arg2;
				for (local74 = 0; local74 < arg1; local74++) {
					@Pc(82) int[] local82 = arg4[arg0 + local74];
					Static735.method9184(local82, arg2, local72, local20);
					Static735.method9184(local82, 0, arg5 - local72, local20);
				}
			} else {
				for (local72 = 0; local72 < arg1; local72++) {
					Static735.method9184(arg4[local72 + arg0], arg2, arg5, local20);
				}
			}
		} else if (arg1 > 0 && arg5 > 0) {
			local72 = arg5 / 2;
			local74 = arg1 / 2;
			@Pc(163) int local163 = local72 >= local45 ? local45 : local72;
			@Pc(171) int local171 = local45 <= local74 ? local45 : local74;
			@Pc(175) int local175 = local163 + arg2;
			@Pc(181) int local181 = arg5 - local163 * 2;
			for (@Pc(183) int local183 = 0; local183 < arg1; local183++) {
				@Pc(191) int[] local191 = arg4[arg0 + local183];
				@Pc(204) int local204;
				@Pc(212) int local212;
				@Pc(220) int local220;
				if (local183 < local171) {
					local204 = local183 * local20 / local171;
					if (this.anInt10178 == 0) {
						for (local212 = 0; local212 < local163; local212++) {
							local220 = local212 * local20 / local163;
							local191[local212 + arg2 & Static144.anInt2744] = local191[Static144.anInt2744 & arg5 + arg2 - local212 - 1] = local204 * local220 >> 12;
						}
					} else {
						for (local212 = 0; local212 < local163; local212++) {
							local220 = local212 * local20 / local163;
							local191[Static144.anInt2744 & local212 + arg2] = local191[arg2 + arg5 - local212 - 1 & Static144.anInt2744] = local220 < local204 ? local220 : local204;
						}
					}
					if (Static636.anInt10302 >= local181 + local175) {
						Static735.method9184(local191, local175, local181, local204);
					} else {
						local212 = Static636.anInt10302 - local175;
						Static735.method9184(local191, local175, local212, local204);
						Static735.method9184(local191, 0, local181 - local212, local204);
					}
				} else {
					local204 = arg1 - local183 - 1;
					if (local171 > local204) {
						local212 = local204 * local20 / local171;
						@Pc(374) int local374;
						if (this.anInt10178 == 0) {
							for (local220 = 0; local220 < local163; local220++) {
								local374 = local20 * local220 / local163;
								local191[arg2 + local220 & Static144.anInt2744] = local191[Static144.anInt2744 & arg2 + arg5 - local220 - 1] = local374 * local212 >> 12;
							}
						} else {
							for (local220 = 0; local220 < local163; local220++) {
								local374 = local220 * local20 / local163;
								local191[Static144.anInt2744 & arg2 + local220] = local191[arg5 + arg2 - local220 - 1 & Static144.anInt2744] = local374 >= local212 ? local212 : local374;
							}
						}
						if (local181 + local175 > Static636.anInt10302) {
							local220 = Static636.anInt10302 - local175;
							Static735.method9184(local191, local175, local220, local212);
							Static735.method9184(local191, 0, local181 - local220, local212);
						} else {
							Static735.method9184(local191, local175, local181, local212);
						}
					} else {
						for (local212 = 0; local212 < local163; local212++) {
							local191[local212 + arg2 & Static144.anInt2744] = local191[Static144.anInt2744 & arg5 + arg2 - local212 - 1] = local20 * local212 / local163;
						}
						if (local181 + local175 > Static636.anInt10302) {
							local220 = Static636.anInt10302 - local175;
							Static735.method9184(local191, local175, local220, local20);
							Static735.method9184(local191, 0, local181 - local220, local20);
						} else {
							Static735.method9184(local191, local175, local181, local20);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (!super.aClass293_41.aBoolean641) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass293_41.method7202();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt10182 * Static636.anInt10302 >> 12;
		@Pc(52) int local52 = Static636.anInt10302 * this.anInt10183 >> 12;
		@Pc(59) int local59 = Static443.anInt7682 * this.anInt10180 >> 12;
		@Pc(66) int local66 = this.anInt10185 * Static443.anInt7682 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt10179 = Static636.anInt10302 / 8 * this.anInt10176 >> 12;
		@Pc(92) int local92 = Static636.anInt10302 / local45 + 1;
		@Pc(96) int[][] local96 = new int[local92][3];
		@Pc(100) int[][] local100 = new int[local92][3];
		@Pc(107) Random local107 = new Random((long) this.anInt10190);
		while (true) {
			while (true) {
				@Pc(117) int local117 = local45 + Static63.method794(local52 - local45, local107);
				@Pc(127) int local127 = local59 + Static63.method794(local66 - local59, local107);
				@Pc(131) int local131 = local117 + local28;
				if (local131 > Static636.anInt10302) {
					local117 = Static636.anInt10302 - local28;
					local131 = Static636.anInt10302;
				}
				@Pc(147) int local147;
				@Pc(157) int local157;
				if (local34) {
					local147 = 0;
				} else {
					@Pc(151) int local151 = local30;
					@Pc(155) int[] local155 = local100[local30];
					local157 = 0;
					@Pc(162) int local162 = local131 + local22;
					if (local162 < 0) {
						local162 += Static636.anInt10302;
					}
					if (local162 > Static636.anInt10302) {
						local162 -= Static636.anInt10302;
					}
					while (true) {
						@Pc(182) int[] local182 = local100[local151];
						if (local162 >= local182[0] && local162 <= local182[1]) {
							local147 = local155[2];
							if (local151 != local30) {
								@Pc(222) int local222 = local22 + local28;
								if (local222 < 0) {
									local222 += Static636.anInt10302;
								}
								if (local222 > Static636.anInt10302) {
									local222 -= Static636.anInt10302;
								}
								for (@Pc(240) int local240 = 1; local240 <= local157; local240++) {
									@Pc(250) int[] local250 = local100[(local30 + local240) % local36];
									local147 = Math.max(local147, local250[2]);
								}
								for (@Pc(262) int local262 = 0; local262 <= local157; local262++) {
									@Pc(272) int[] local272 = local100[(local262 + local30) % local36];
									@Pc(276) int local276 = local272[2];
									if (local276 != local147) {
										@Pc(287) int local287 = local272[0];
										@Pc(291) int local291 = local272[1];
										@Pc(298) int local298;
										@Pc(302) int local302;
										if (local222 < local162) {
											local298 = Math.max(local222, local287);
											local302 = Math.min(local162, local291);
										} else if (local287 == 0) {
											local298 = 0;
											local302 = Math.min(local162, local291);
										} else {
											local298 = Math.max(local222, local287);
											local302 = Static636.anInt10302;
										}
										this.method8538(local276, local147 - local276, local298 - -local26, local107, local20, local302 - local298);
									}
								}
							}
							local30 = local151;
							break;
						}
						local151++;
						if (local36 <= local151) {
							local151 = 0;
						}
						local157++;
					}
				}
				if (Static443.anInt7682 >= local127 + local147) {
					local32 = false;
				} else {
					local127 = Static443.anInt7682 - local147;
				}
				@Pc(374) int[] local374;
				if (local131 == Static636.anInt10302) {
					this.method8538(local147, local127, local28 + local24, local107, local20, local117);
					if (local32) {
						return local11;
					}
					local32 = true;
					local374 = local96[local38++];
					local374[0] = local28;
					local374[1] = local131;
					local374[2] = local127 + local147;
					@Pc(439) int[][] local439 = local100;
					local100 = local96;
					local96 = local439;
					local36 = local38;
					local26 = local24;
					local38 = 0;
					local24 = Static63.method794(Static636.anInt10302, local107);
					local22 = local24 - local26;
					local28 = 0;
					local157 = local22;
					if (local22 < 0) {
						local157 = local22 + Static636.anInt10302;
					}
					local30 = 0;
					if (Static636.anInt10302 < local157) {
						local157 -= Static636.anInt10302;
					}
					local34 = false;
					while (true) {
						@Pc(488) int[] local488 = local100[local30];
						if (local157 >= local488[0] && local157 <= local488[1]) {
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local374 = local96[local38++];
					local374[2] = local127 + local147;
					local374[1] = local131;
					local374[0] = local28;
					this.method8538(local147, local127, local28 + local24, local107, local20, local117);
					local28 = local131;
				}
			}
		}
	}
}
