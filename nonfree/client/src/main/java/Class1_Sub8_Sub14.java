import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class1_Sub8_Sub14 extends Class1_Sub8 {

	@OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
	private int anInt3345;

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
	private int anInt3340 = 409;

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
	private int anInt3341 = 0;

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
	private int anInt3337 = 1024;

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
	private int anInt3338 = 1024;

	@OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
	private int anInt3348 = 0;

	@OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
	private int anInt3344 = 2048;

	@OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
	private int anInt3351 = 819;

	@OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
	private int anInt3347 = 1024;

	@OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
	private int anInt3352 = 1024;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (!super.aClass225_41.aBoolean421) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass225_41.method5086();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt3352 * Static18.anInt439 >> 12;
		@Pc(52) int local52 = this.anInt3344 * Static18.anInt439 >> 12;
		@Pc(59) int local59 = Static217.anInt4363 * this.anInt3340 >> 12;
		@Pc(66) int local66 = this.anInt3351 * Static217.anInt4363 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt3345 = this.anInt3347 * (Static18.anInt439 / 8) >> 12;
		@Pc(89) int local89 = Static18.anInt439 / local45 + 1;
		@Pc(93) int[][] local93 = new int[local89][3];
		@Pc(97) int[][] local97 = new int[local89][3];
		@Pc(104) Random local104 = new Random((long) this.anInt3348);
		while (true) {
			while (true) {
				@Pc(114) int local114 = Static70.method1340(local104, local52 - local45) + local45;
				@Pc(123) int local123 = Static70.method1340(local104, local66 - local59) + local59;
				@Pc(127) int local127 = local114 + local28;
				if (Static18.anInt439 < local127) {
					local114 = Static18.anInt439 - local28;
					local127 = Static18.anInt439;
				}
				@Pc(176) int local176;
				@Pc(151) int local151;
				if (local34) {
					local176 = 0;
				} else {
					@Pc(145) int local145 = local30;
					@Pc(149) int[] local149 = local97[local30];
					local151 = 0;
					@Pc(155) int local155 = local22 + local127;
					if (local155 < 0) {
						local155 += Static18.anInt439;
					}
					if (Static18.anInt439 < local155) {
						local155 -= Static18.anInt439;
					}
					local176 = local149[2];
					while (true) {
						@Pc(180) int[] local180 = local97[local145];
						if (local180[0] <= local155 && local155 <= local180[1]) {
							if (local145 != local30) {
								@Pc(222) int local222 = local22 + local28;
								if (local222 < 0) {
									local222 += Static18.anInt439;
								}
								if (Static18.anInt439 < local222) {
									local222 -= Static18.anInt439;
								}
								for (@Pc(237) int local237 = 1; local237 <= local151; local237++) {
									@Pc(248) int[] local248 = local97[(local30 + local237) % local36];
									local176 = Math.max(local176, local248[2]);
								}
								for (@Pc(260) int local260 = 0; local260 <= local151; local260++) {
									@Pc(270) int[] local270 = local97[(local260 + local30) % local36];
									@Pc(274) int local274 = local270[2];
									if (local274 != local176) {
										@Pc(285) int local285 = local270[0];
										@Pc(289) int local289 = local270[1];
										@Pc(300) int local300;
										@Pc(304) int local304;
										if (local222 < local155) {
											local300 = Math.max(local222, local285);
											local304 = Math.min(local155, local289);
										} else if (local285 == 0) {
											local300 = 0;
											local304 = Math.min(local155, local289);
										} else {
											local300 = Math.max(local222, local285);
											local304 = Static18.anInt439;
										}
										this.method2613(local304 - local300, local300 - -local26, local104, local176 - local274, local274, local20);
									}
								}
							}
							local30 = local145;
							break;
						}
						local151++;
						@Pc(202) int local202 = ~local36;
						local145++;
						if (local202 >= ~local145) {
							local145 = 0;
						}
					}
				}
				if (local176 + local123 <= Static217.anInt4363) {
					local32 = false;
				} else {
					local123 = Static217.anInt4363 - local176;
				}
				@Pc(399) int[] local399;
				if (local127 == Static18.anInt439) {
					this.method2613(local114, local28 + local24, local104, local123, local176, local20);
					if (local32) {
						return local11;
					}
					local32 = true;
					local399 = local93[local38++];
					local399[2] = local176 + local123;
					local399[0] = local28;
					local399[1] = local127;
					@Pc(415) int[][] local415 = local97;
					local97 = local93;
					local36 = local38;
					local93 = local415;
					local26 = local24;
					local38 = 0;
					local24 = Static70.method1340(local104, Static18.anInt439);
					local28 = 0;
					local22 = local24 - local26;
					local151 = local22;
					if (local22 < 0) {
						local151 = local22 + Static18.anInt439;
					}
					local30 = 0;
					if (Static18.anInt439 < local151) {
						local151 -= Static18.anInt439;
					}
					local34 = false;
					while (true) {
						@Pc(460) int[] local460 = local97[local30];
						if (local151 >= local460[0] && local460[1] >= local151) {
							break;
						}
						local30++;
						if (local36 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local399 = local93[local38++];
					local399[1] = local127;
					local399[2] = local176 + local123;
					local399[0] = local28;
					this.method2613(local114, local24 + local28, local104, local123, local176, local20);
					local28 = local127;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3348 = arg1.method1171();
		} else if (arg0 == 1) {
			this.anInt3352 = arg1.method1177();
		} else if (arg0 == 2) {
			this.anInt3344 = arg1.method1177();
		} else if (arg0 == 3) {
			this.anInt3340 = arg1.method1177();
		} else if (arg0 == 4) {
			this.anInt3351 = arg1.method1177();
		} else if (arg0 == 5) {
			this.anInt3347 = arg1.method1177();
		} else if (arg0 == 6) {
			this.anInt3341 = arg1.method1171();
		} else if (arg0 == 7) {
			this.anInt3338 = arg1.method1177();
		} else if (arg0 == 8) {
			this.anInt3337 = arg1.method1177();
		}
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIILjava/util/Random;II[[I)V")
	private void method2613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(26) int local26 = this.anInt3337 > 0 ? 4096 - Static70.method1340(arg2, this.anInt3337) : 4096;
		@Pc(34) int local34 = this.anInt3345 * this.anInt3338 >> 12;
		@Pc(46) int local46 = this.anInt3345 - (local34 > 0 ? Static70.method1340(arg2, local34) : 0);
		if (Static18.anInt439 <= arg1) {
			arg1 -= Static18.anInt439;
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (local46 > 0) {
			if (arg3 > 0 && arg0 > 0) {
				local71 = arg0 / 2;
				local75 = arg3 / 2;
				@Pc(86) int local86 = local71 >= local46 ? local46 : local71;
				@Pc(93) int local93 = local75 < local46 ? local75 : local46;
				@Pc(97) int local97 = local86 + arg1;
				@Pc(103) int local103 = arg0 - local86 * 2;
				for (@Pc(105) int local105 = 0; local105 < arg3; local105++) {
					@Pc(113) int[] local113 = arg5[arg4 + local105];
					@Pc(122) int local122;
					@Pc(127) int local127;
					@Pc(135) int local135;
					if (local93 > local105) {
						local122 = local26 * local105 / local93;
						if (this.anInt3341 == 0) {
							for (local127 = 0; local127 < local86; local127++) {
								local135 = local26 * local127 / local86;
								local113[Static283.anInt5397 & local127 + arg1] = local113[arg1 + arg0 - local127 - 1 & Static283.anInt5397] = local122 * local135 >> 12;
							}
						} else {
							for (local127 = 0; local127 < local86; local127++) {
								local135 = local26 * local127 / local86;
								local113[Static283.anInt5397 & arg1 + local127] = local113[Static283.anInt5397 & arg1 + arg0 - local127 - 1] = local135 < local122 ? local135 : local122;
							}
						}
						if (local97 + local103 > Static18.anInt439) {
							local127 = Static18.anInt439 - local97;
							Static469.method6015(local113, local97, local127, local122);
							Static469.method6015(local113, 0, local103 - local127, local122);
						} else {
							Static469.method6015(local113, local97, local103, local122);
						}
					} else {
						local122 = arg3 - local105 - 1;
						if (local122 < local93) {
							local127 = local122 * local26 / local93;
							@Pc(276) int local276;
							if (this.anInt3341 == 0) {
								for (local135 = 0; local135 < local86; local135++) {
									local276 = local135 * local26 / local86;
									local113[arg1 + local135 & Static283.anInt5397] = local113[Static283.anInt5397 & arg1 + arg0 - local135 - 1] = local127 * local276 >> 12;
								}
							} else {
								for (local135 = 0; local135 < local86; local135++) {
									local276 = local135 * local26 / local86;
									local113[arg1 + local135 & Static283.anInt5397] = local113[arg1 + arg0 - local135 - 1 & Static283.anInt5397] = local276 < local127 ? local276 : local127;
								}
							}
							if (local97 + local103 <= Static18.anInt439) {
								Static469.method6015(local113, local97, local103, local127);
							} else {
								local135 = Static18.anInt439 - local97;
								Static469.method6015(local113, local97, local135, local127);
								Static469.method6015(local113, 0, local103 - local135, local127);
							}
						} else {
							for (local127 = 0; local127 < local86; local127++) {
								local113[Static283.anInt5397 & arg1 + local127] = local113[arg1 + arg0 - local127 - 1 & Static283.anInt5397] = local26 * local127 / local86;
							}
							if (Static18.anInt439 >= local103 + local97) {
								Static469.method6015(local113, local97, local103, local26);
							} else {
								local135 = Static18.anInt439 - local97;
								Static469.method6015(local113, local97, local135, local26);
								Static469.method6015(local113, 0, local103 - local135, local26);
							}
						}
					}
				}
			}
		} else if (Static18.anInt439 >= arg0 + arg1) {
			for (local71 = 0; local71 < arg3; local71++) {
				Static469.method6015(arg5[arg4 + local71], arg1, arg0, local26);
			}
		} else {
			local71 = Static18.anInt439 - arg1;
			for (local75 = 0; local75 < arg3; local75++) {
				@Pc(501) int[] local501 = arg5[arg4 + local75];
				Static469.method6015(local501, arg1, local71, local26);
				Static469.method6015(local501, 0, arg0 - local71, local26);
			}
		}
	}
}
