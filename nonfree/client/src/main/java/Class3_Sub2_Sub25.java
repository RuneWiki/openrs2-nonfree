import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class3_Sub2_Sub25 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
	private int anInt3630;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
	private int anInt3634 = 2048;

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
	private int anInt3627 = 1024;

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
	private int anInt3636 = 1024;

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
	private int anInt3640 = 409;

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
	private int anInt3643 = 819;

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
	private int anInt3633 = 1024;

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
	private int anInt3641 = 0;

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
	private int anInt3632 = 0;

	@OriginalMember(owner = "client!ne", name = "hb", descriptor = "I")
	private int anInt3646 = 1024;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass168_41.method4366(arg0);
		if (!this.aClass168_41.aBoolean373) {
			return local17;
		}
		@Pc(26) int[][] local26 = this.aClass168_41.method4361();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt3640 * Static62.anInt1150 >> 12;
		@Pc(58) int local58 = this.anInt3636 * Static22.anInt421 >> 12;
		@Pc(65) int local65 = this.anInt3634 * Static22.anInt421 >> 12;
		@Pc(72) int local72 = this.anInt3643 * Static62.anInt1150 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		@Pc(85) int local85 = Static22.anInt421 / local58 + 1;
		@Pc(89) int[][] local89 = new int[local85][3];
		this.anInt3630 = this.anInt3633 * (Static22.anInt421 / 8) >> 12;
		@Pc(106) Random local106 = new Random((long) this.anInt3632);
		@Pc(110) int[][] local110 = new int[local85][3];
		while (true) {
			while (true) {
				@Pc(120) int local120 = local58 + Static276.method4529(local65 - local58, local106);
				@Pc(130) int local130 = local51 + Static276.method4529(local72 - local51, local106);
				@Pc(135) int local135 = local34 + local120;
				if (Static22.anInt421 < local135) {
					local120 = Static22.anInt421 - local34;
					local135 = Static22.anInt421;
				}
				@Pc(149) int local149;
				@Pc(155) int local155;
				if (local40) {
					local149 = 0;
				} else {
					@Pc(153) int local153 = local30;
					local155 = 0;
					@Pc(159) int[] local159 = local110[local30];
					local149 = local159[2];
					@Pc(167) int local167 = local32 + local135;
					if (local167 < 0) {
						local167 += Static22.anInt421;
					}
					if (local167 > Static22.anInt421) {
						local167 -= Static22.anInt421;
					}
					while (true) {
						@Pc(186) int[] local186 = local110[local153];
						if (local167 >= local186[0] && local167 <= local186[1]) {
							if (local30 != local153) {
								@Pc(223) int local223 = local32 + local34;
								if (local223 < 0) {
									local223 += Static22.anInt421;
								}
								if (local223 > Static22.anInt421) {
									local223 -= Static22.anInt421;
								}
								@Pc(240) int local240;
								@Pc(255) int[] local255;
								for (local240 = 1; local240 <= local155; local240++) {
									local255 = local110[(local30 + local240) % local42];
									local149 = Math.max(local149, local255[2]);
								}
								for (local240 = 0; local240 <= local155; local240++) {
									local255 = local110[(local240 + local30) % local42];
									@Pc(281) int local281 = local255[2];
									if (local149 != local281) {
										@Pc(288) int local288 = local255[0];
										@Pc(292) int local292 = local255[1];
										@Pc(303) int local303;
										@Pc(307) int local307;
										if (local167 > local223) {
											local303 = Math.max(local223, local288);
											local307 = Math.min(local167, local292);
										} else if (local288 == 0) {
											local307 = Math.min(local167, local292);
											local303 = 0;
										} else {
											local303 = Math.max(local223, local288);
											local307 = Static22.anInt421;
										}
										this.method3089(local303 + local28, local281, local307 - local303, local26, local149 - local281, local106);
									}
								}
							}
							local30 = local153;
							break;
						}
						local155++;
						local153++;
						if (local42 <= local153) {
							local153 = 0;
						}
					}
				}
				if (local149 + local130 > Static62.anInt1150) {
					local130 = Static62.anInt1150 - local149;
				} else {
					local38 = false;
				}
				@Pc(374) int[] local374;
				if (local135 == Static22.anInt421) {
					this.method3089(local36 + local34, local149, local120, local26, local130, local106);
					if (local38) {
						return local17;
					}
					local28 = local36;
					local30 = 0;
					local38 = true;
					local40 = false;
					local374 = local89[local44++];
					local42 = local44;
					local374[0] = local34;
					local34 = 0;
					local44 = 0;
					local374[1] = local135;
					local374[2] = local149 + local130;
					@Pc(452) int[][] local452 = local110;
					local36 = Static276.method4529(Static22.anInt421, local106);
					local32 = local36 - local28;
					local110 = local89;
					local155 = local32;
					if (local32 < 0) {
						local155 = local32 + Static22.anInt421;
					}
					if (local155 > Static22.anInt421) {
						local155 -= Static22.anInt421;
					}
					while (true) {
						@Pc(485) int[] local485 = local89[local30];
						if (local485[0] <= local155 && local485[1] >= local155) {
							local89 = local452;
							break;
						}
						local30++;
						if (local42 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local374 = local89[local44++];
					local374[0] = local34;
					local374[1] = local135;
					local374[2] = local149 + local130;
					this.method3089(local34 + local36, local149, local120, local26, local130, local106);
					local34 = local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt3632 = arg1.method3915();
		} else if (arg0 == 1) {
			this.anInt3636 = arg1.method3948();
		} else if (arg0 == 2) {
			this.anInt3634 = arg1.method3948();
		} else if (arg0 == 3) {
			this.anInt3640 = arg1.method3948();
		} else if (arg0 == 4) {
			this.anInt3643 = arg1.method3948();
		} else if (arg0 == 5) {
			this.anInt3633 = arg1.method3948();
		} else if (arg0 == 6) {
			this.anInt3641 = arg1.method3915();
		} else if (arg0 == 7) {
			this.anInt3627 = arg1.method3948();
		} else if (arg0 == 8) {
			this.anInt3646 = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[[IIILjava/util/Random;)V")
	private void method3089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(18) int local18 = this.anInt3646 > 0 ? 4096 - Static276.method4529(this.anInt3646, arg5) : 4096;
		@Pc(26) int local26 = this.anInt3630 * this.anInt3627 >> 12;
		@Pc(38) int local38 = this.anInt3630 - (local26 <= 0 ? 0 : Static276.method4529(local26, arg5));
		if (arg0 >= Static22.anInt421) {
			arg0 -= Static22.anInt421;
		}
		@Pc(61) int local61;
		@Pc(63) int local63;
		if (local38 > 0) {
			if (arg4 <= 0 || arg2 <= 0) {
				return;
			}
			local61 = arg2 / 2;
			local63 = arg4 / 2;
			@Pc(136) int local136 = local38 > local63 ? local63 : local38;
			@Pc(143) int local143 = local61 >= local38 ? local38 : local61;
			@Pc(148) int local148 = arg0 + local143;
			@Pc(155) int local155 = arg2 - local143 * 2;
			for (@Pc(157) int local157 = 0; local157 < arg4; local157++) {
				@Pc(171) int[] local171 = arg3[local157 + arg1];
				@Pc(181) int local181;
				@Pc(189) int local189;
				@Pc(202) int local202;
				if (local136 <= local157) {
					local181 = arg4 - local157 - 1;
					if (local181 >= local136) {
						for (local189 = 0; local189 < local143; local189++) {
							local171[Static84.anInt1566 & arg0 + local189] = local171[Static84.anInt1566 & arg2 + arg0 - local189 - 1] = local18 * local189 / local143;
						}
						if (local148 + local155 > Static22.anInt421) {
							local189 = Static22.anInt421 - local148;
							Static326.method4267(local171, local148, local189, local18);
							Static326.method4267(local171, 0, local155 - local189, local18);
						} else {
							Static326.method4267(local171, local148, local155, local18);
						}
					} else {
						local189 = local181 * local18 / local136;
						@Pc(340) int local340;
						if (this.anInt3641 == 0) {
							for (local202 = 0; local202 < local143; local202++) {
								local340 = local202 * local18 / local143;
								local171[Static84.anInt1566 & arg0 + local202] = local171[Static84.anInt1566 & arg0 + arg2 - local202 - 1] = local340 * local189 >> 12;
							}
						} else {
							for (local202 = 0; local202 < local143; local202++) {
								local340 = local18 * local202 / local143;
								local171[arg0 + local202 & Static84.anInt1566] = local171[arg0 + arg2 - local202 - 1 & Static84.anInt1566] = local189 > local340 ? local340 : local189;
							}
						}
						if (local155 + local148 > Static22.anInt421) {
							local202 = Static22.anInt421 - local148;
							Static326.method4267(local171, local148, local202, local189);
							Static326.method4267(local171, 0, local155 - local202, local189);
						} else {
							Static326.method4267(local171, local148, local155, local189);
						}
					}
				} else {
					local181 = local157 * local18 / local136;
					if (this.anInt3641 == 0) {
						for (local189 = 0; local189 < local143; local189++) {
							local202 = local189 * local18 / local143;
							local171[Static84.anInt1566 & arg0 + local189] = local171[Static84.anInt1566 & arg0 + arg2 - local189 - 1] = local181 * local202 >> 12;
						}
					} else {
						for (local189 = 0; local189 < local143; local189++) {
							local202 = local189 * local18 / local143;
							local171[Static84.anInt1566 & local189 + arg0] = local171[arg2 + arg0 - local189 - 1 & Static84.anInt1566] = local202 >= local181 ? local181 : local202;
						}
					}
					if (local155 + local148 > Static22.anInt421) {
						local189 = Static22.anInt421 - local148;
						Static326.method4267(local171, local148, local189, local181);
						Static326.method4267(local171, 0, local155 - local189, local181);
					} else {
						Static326.method4267(local171, local148, local155, local181);
					}
				}
			}
		} else if (Static22.anInt421 < arg2 + arg0) {
			local61 = Static22.anInt421 - arg0;
			for (local63 = 0; local63 < arg4; local63++) {
				@Pc(72) int[] local72 = arg3[local63 + arg1];
				Static326.method4267(local72, arg0, local61, local18);
				Static326.method4267(local72, 0, arg2 - local61, local18);
			}
		} else {
			for (local61 = 0; local61 < arg4; local61++) {
				Static326.method4267(arg3[local61 + arg1], arg0, arg2, local18);
			}
		}
	}
}
