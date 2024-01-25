import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class5_Sub2_Sub24 extends Class5_Sub2 {

	@OriginalMember(owner = "client!pia", name = "T", descriptor = "I")
	private int anInt7386;

	@OriginalMember(owner = "client!pia", name = "D", descriptor = "I")
	private int anInt7374 = 1024;

	@OriginalMember(owner = "client!pia", name = "E", descriptor = "I")
	private int anInt7375 = 1024;

	@OriginalMember(owner = "client!pia", name = "K", descriptor = "I")
	private int anInt7379 = 1024;

	@OriginalMember(owner = "client!pia", name = "P", descriptor = "I")
	private int anInt7383 = 1024;

	@OriginalMember(owner = "client!pia", name = "J", descriptor = "I")
	private int anInt7378 = 2048;

	@OriginalMember(owner = "client!pia", name = "G", descriptor = "I")
	private int anInt7376 = 409;

	@OriginalMember(owner = "client!pia", name = "Q", descriptor = "I")
	private int anInt7384 = 819;

	@OriginalMember(owner = "client!pia", name = "R", descriptor = "I")
	private int anInt7385 = 0;

	@OriginalMember(owner = "client!pia", name = "L", descriptor = "I")
	private int anInt7380 = 0;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7385 = arg0.method8645();
		} else if (arg1 == 1) {
			this.anInt7374 = arg0.method8631();
		} else if (arg1 == 2) {
			this.anInt7378 = arg0.method8631();
		} else if (arg1 == 3) {
			this.anInt7376 = arg0.method8631();
		} else if (arg1 == 4) {
			this.anInt7384 = arg0.method8631();
		} else if (arg1 == 5) {
			this.anInt7383 = arg0.method8631();
		} else if (arg1 == 6) {
			this.anInt7380 = arg0.method8645();
		} else if (arg1 == 7) {
			this.anInt7379 = arg0.method8631();
		} else if (arg1 == 8) {
			this.anInt7375 = arg0.method8631();
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass246_41.method5949(arg0);
		if (!super.aClass246_41.aBoolean561) {
			return local11;
		}
		@Pc(25) int[][] local25 = super.aClass246_41.method5950();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = Static314.anInt6320 * this.anInt7374 >> 12;
		@Pc(57) int local57 = this.anInt7378 * Static314.anInt6320 >> 12;
		@Pc(64) int local64 = this.anInt7376 * Static423.anInt7200 >> 12;
		@Pc(71) int local71 = this.anInt7384 * Static423.anInt7200 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt7386 = Static314.anInt6320 / 8 * this.anInt7383 >> 12;
		@Pc(96) int local96 = Static314.anInt6320 / local50 + 1;
		@Pc(100) int[][] local100 = new int[local96][3];
		@Pc(104) int[][] local104 = new int[local96][3];
		@Pc(111) Random local111 = new Random((long) this.anInt7385);
		while (true) {
			while (true) {
				@Pc(122) int local122 = local50 + Static57.method964(local57 - local50, local111);
				@Pc(133) int local133 = local64 + Static57.method964(local71 - local64, local111);
				@Pc(137) int local137 = local33 + local122;
				if (local137 > Static314.anInt6320) {
					local122 = Static314.anInt6320 - local33;
					local137 = Static314.anInt6320;
				}
				@Pc(217) int local217;
				@Pc(161) int local161;
				if (local39) {
					local217 = 0;
				} else {
					@Pc(155) int local155 = local35;
					@Pc(159) int[] local159 = local104[local35];
					local161 = 0;
					@Pc(165) int local165 = local27 + local137;
					if (local165 < 0) {
						local165 += Static314.anInt6320;
					}
					if (local165 > Static314.anInt6320) {
						local165 -= Static314.anInt6320;
					}
					while (true) {
						@Pc(186) int[] local186 = local104[local155];
						if (local165 >= local186[0] && local165 <= local186[1]) {
							local217 = local159[2];
							if (local35 != local155) {
								@Pc(228) int local228 = local27 + local33;
								if (local228 < 0) {
									local228 += Static314.anInt6320;
								}
								if (Static314.anInt6320 < local228) {
									local228 -= Static314.anInt6320;
								}
								for (@Pc(247) int local247 = 1; local247 <= local161; local247++) {
									@Pc(257) int[] local257 = local104[(local247 + local35) % local41];
									local217 = Math.max(local217, local257[2]);
								}
								for (@Pc(273) int local273 = 0; local273 <= local161; local273++) {
									@Pc(283) int[] local283 = local104[(local273 + local35) % local41];
									@Pc(287) int local287 = local283[2];
									if (local217 != local287) {
										@Pc(298) int local298 = local283[0];
										@Pc(302) int local302 = local283[1];
										@Pc(313) int local313;
										@Pc(317) int local317;
										if (local165 > local228) {
											local313 = Math.max(local228, local298);
											local317 = Math.min(local165, local302);
										} else if (local298 == 0) {
											local313 = 0;
											local317 = Math.min(local165, local302);
										} else {
											local313 = Math.max(local228, local298);
											local317 = Static314.anInt6320;
										}
										this.method6508(local25, local313 + local31, local287, local317 - local313, local111, local217 - local287);
									}
								}
							}
							local35 = local155;
							break;
						}
						local155++;
						if (local155 >= local41) {
							local155 = 0;
						}
						local161++;
					}
				}
				if (Static423.anInt7200 < local133 + local217) {
					local133 = Static423.anInt7200 - local217;
				} else {
					local37 = false;
				}
				@Pc(392) int[] local392;
				if (local137 == Static314.anInt6320) {
					this.method6508(local25, local33 + local29, local217, local122, local111, local133);
					if (local37) {
						return local11;
					}
					local37 = true;
					local392 = local100[local43++];
					local392[2] = local217 + local133;
					local392[1] = local137;
					local392[0] = local33;
					@Pc(460) int[][] local460 = local104;
					local104 = local100;
					local41 = local43;
					local100 = local460;
					local43 = 0;
					local31 = local29;
					local29 = Static57.method964(Static314.anInt6320, local111);
					local27 = local29 - local31;
					local33 = 0;
					local161 = local27;
					if (local27 < 0) {
						local161 = local27 + Static314.anInt6320;
					}
					if (local161 > Static314.anInt6320) {
						local161 -= Static314.anInt6320;
					}
					local35 = 0;
					while (true) {
						@Pc(510) int[] local510 = local104[local35];
						if (local161 >= local510[0] && local161 <= local510[1]) {
							local39 = false;
							break;
						}
						local35++;
						if (local35 >= local41) {
							local35 = 0;
						}
					}
				} else {
					local392 = local100[local43++];
					local392[0] = local33;
					local392[1] = local137;
					local392[2] = local133 + local217;
					this.method6508(local25, local33 + local29, local217, local122, local111, local133);
					local33 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "([[IIIILjava/util/Random;II)V")
	private void method6508(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Random arg4, @OriginalArg(5) int arg5) {
		@Pc(19) int local19 = this.anInt7375 <= 0 ? 4096 : 4096 - Static57.method964(this.anInt7375, arg4);
		@Pc(27) int local27 = this.anInt7386 * this.anInt7379 >> 12;
		@Pc(48) int local48 = this.anInt7386 - (local27 > 0 ? Static57.method964(local27, arg4) : 0);
		if (arg1 >= Static314.anInt6320) {
			arg1 -= Static314.anInt6320;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		if (local48 > 0) {
			if (arg5 > 0 && arg3 > 0) {
				local73 = arg3 / 2;
				local77 = arg5 / 2;
				@Pc(88) int local88 = local73 < local48 ? local73 : local48;
				@Pc(99) int local99 = local48 > local77 ? local77 : local48;
				@Pc(104) int local104 = arg1 + local88;
				@Pc(111) int local111 = arg3 - local88 * 2;
				for (@Pc(113) int local113 = 0; local113 < arg5; local113++) {
					@Pc(121) int[] local121 = arg0[arg2 + local113];
					@Pc(134) int local134;
					@Pc(142) int local142;
					@Pc(150) int local150;
					if (local113 < local99) {
						local134 = local19 * local113 / local99;
						if (this.anInt7380 == 0) {
							for (local142 = 0; local142 < local88; local142++) {
								local150 = local142 * local19 / local88;
								local121[local142 + arg1 & Static550.anInt6610] = local121[arg1 + arg3 - local142 - 1 & Static550.anInt6610] = local150 * local134 >> 12;
							}
						} else {
							for (local142 = 0; local142 < local88; local142++) {
								local150 = local142 * local19 / local88;
								local121[Static550.anInt6610 & local142 + arg1] = local121[Static550.anInt6610 & arg3 + arg1 - local142 - 1] = local150 >= local134 ? local134 : local150;
							}
						}
						if (Static314.anInt6320 < local111 + local104) {
							local142 = Static314.anInt6320 - local104;
							Static655.method4110(local121, local104, local142, local134);
							Static655.method4110(local121, 0, local111 - local142, local134);
						} else {
							Static655.method4110(local121, local104, local111, local134);
						}
					} else {
						local134 = arg5 - local113 - 1;
						if (local99 > local134) {
							local142 = local134 * local19 / local99;
							@Pc(297) int local297;
							if (this.anInt7380 == 0) {
								for (local150 = 0; local150 < local88; local150++) {
									local297 = local19 * local150 / local88;
									local121[local150 + arg1 & Static550.anInt6610] = local121[Static550.anInt6610 & arg3 + arg1 - local150 - 1] = local142 * local297 >> 12;
								}
							} else {
								for (local150 = 0; local150 < local88; local150++) {
									local297 = local19 * local150 / local88;
									local121[local150 + arg1 & Static550.anInt6610] = local121[Static550.anInt6610 & arg3 + arg1 - local150 - 1] = local297 < local142 ? local297 : local142;
								}
							}
							if (Static314.anInt6320 < local111 + local104) {
								local150 = Static314.anInt6320 - local104;
								Static655.method4110(local121, local104, local150, local142);
								Static655.method4110(local121, 0, local111 - local150, local142);
							} else {
								Static655.method4110(local121, local104, local111, local142);
							}
						} else {
							for (local142 = 0; local142 < local88; local142++) {
								local121[Static550.anInt6610 & local142 + arg1] = local121[Static550.anInt6610 & arg3 + arg1 - local142 - 1] = local142 * local19 / local88;
							}
							if (Static314.anInt6320 < local111 + local104) {
								local150 = Static314.anInt6320 - local104;
								Static655.method4110(local121, local104, local150, local19);
								Static655.method4110(local121, 0, local111 - local150, local19);
							} else {
								Static655.method4110(local121, local104, local111, local19);
							}
						}
					}
				}
			}
		} else if (Static314.anInt6320 >= arg1 + arg3) {
			for (local73 = 0; local73 < arg5; local73++) {
				Static655.method4110(arg0[local73 + arg2], arg1, arg3, local19);
			}
		} else {
			local73 = Static314.anInt6320 - arg1;
			for (local77 = 0; local77 < arg5; local77++) {
				@Pc(525) int[] local525 = arg0[arg2 + local77];
				Static655.method4110(local525, arg1, local73, local19);
				Static655.method4110(local525, 0, arg3 - local73, local19);
			}
		}
	}
}
