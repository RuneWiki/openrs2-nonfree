import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class5_Sub3_Sub12 extends Class5_Sub3 {

	@OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
	private int anInt2340;

	@OriginalMember(owner = "client!hm", name = "R", descriptor = "I")
	private int anInt2344 = 1024;

	@OriginalMember(owner = "client!hm", name = "X", descriptor = "I")
	private int anInt2349 = 2048;

	@OriginalMember(owner = "client!hm", name = "Y", descriptor = "I")
	private int anInt2350 = 0;

	@OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
	private int anInt2343 = 1024;

	@OriginalMember(owner = "client!hm", name = "ab", descriptor = "I")
	private int anInt2352 = 409;

	@OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
	private int anInt2347 = 0;

	@OriginalMember(owner = "client!hm", name = "U", descriptor = "I")
	private int anInt2346 = 1024;

	@OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
	private int anInt2356 = 1024;

	@OriginalMember(owner = "client!hm", name = "Z", descriptor = "I")
	private int anInt2351 = 819;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2347 = arg0.method5115();
		} else if (arg1 == 1) {
			this.anInt2346 = arg0.method5106();
		} else if (arg1 == 2) {
			this.anInt2349 = arg0.method5106();
		} else if (arg1 == 3) {
			this.anInt2352 = arg0.method5106();
		} else if (arg1 == 4) {
			this.anInt2351 = arg0.method5106();
		} else if (arg1 == 5) {
			this.anInt2356 = arg0.method5106();
		} else if (arg1 == 6) {
			this.anInt2350 = arg0.method5115();
		} else if (arg1 == 7) {
			this.anInt2343 = arg0.method5106();
		} else if (arg1 == 8) {
			this.anInt2344 = arg0.method5106();
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (!super.aClass188_41.aBoolean490) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass188_41.method5316();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static7.anInt129 * this.anInt2346 >> 12;
		@Pc(52) int local52 = this.anInt2349 * Static7.anInt129 >> 12;
		@Pc(59) int local59 = Static227.anInt4557 * this.anInt2352 >> 12;
		@Pc(66) int local66 = Static227.anInt4557 * this.anInt2351 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt2340 = Static7.anInt129 / 8 * this.anInt2356 >> 12;
		@Pc(91) int local91 = Static7.anInt129 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt2347);
		while (true) {
			while (true) {
				@Pc(117) int local117 = Static329.method5695(local106, local52 - local45) + local45;
				@Pc(127) int local127 = Static329.method5695(local106, local66 - local59) + local59;
				@Pc(131) int local131 = local117 + local28;
				if (Static7.anInt129 < local131) {
					local117 = Static7.anInt129 - local28;
					local131 = Static7.anInt129;
				}
				@Pc(144) int local144;
				@Pc(154) int local154;
				if (local34) {
					local144 = 0;
				} else {
					@Pc(148) int local148 = local30;
					@Pc(152) int[] local152 = local99[local30];
					local154 = 0;
					@Pc(158) int local158 = local22 + local131;
					if (local158 < 0) {
						local158 += Static7.anInt129;
					}
					if (Static7.anInt129 < local158) {
						local158 -= Static7.anInt129;
					}
					local144 = local152[2];
					while (true) {
						@Pc(186) int[] local186 = local99[local148];
						if (local158 >= local186[0] && local186[1] >= local158) {
							if (local148 != local30) {
								@Pc(220) int local220 = local22 + local28;
								if (local220 < 0) {
									local220 += Static7.anInt129;
								}
								if (Static7.anInt129 < local220) {
									local220 -= Static7.anInt129;
								}
								for (@Pc(235) int local235 = 1; local235 <= local154; local235++) {
									@Pc(246) int[] local246 = local99[(local30 + local235) % local36];
									local144 = Math.max(local144, local246[2]);
								}
								for (@Pc(262) int local262 = 0; local262 <= local154; local262++) {
									@Pc(272) int[] local272 = local99[(local262 + local30) % local36];
									@Pc(276) int local276 = local272[2];
									if (local276 != local144) {
										@Pc(283) int local283 = local272[0];
										@Pc(287) int local287 = local272[1];
										@Pc(302) int local302;
										@Pc(300) int local300;
										if (local158 > local220) {
											local302 = Math.max(local220, local283);
											local300 = Math.min(local158, local287);
										} else if (local283 == 0) {
											local300 = Math.min(local158, local287);
											local302 = 0;
										} else {
											local302 = Math.max(local220, local283);
											local300 = Static7.anInt129;
										}
										this.method2176(local20, local276, local144 - local276, local302 + local26, local106, local300 - local302);
									}
								}
							}
							local30 = local148;
							break;
						}
						local154++;
						@Pc(204) int local204 = ~local36;
						local148++;
						if (local204 >= ~local148) {
							local148 = 0;
						}
					}
				}
				if (Static227.anInt4557 < local144 + local127) {
					local127 = Static227.anInt4557 - local144;
				} else {
					local32 = false;
				}
				@Pc(386) int[] local386;
				if (local131 == Static7.anInt129) {
					this.method2176(local20, local144, local127, local28 + local24, local106, local117);
					if (local32) {
						return local11;
					}
					local32 = true;
					local386 = local95[local38++];
					local386[0] = local28;
					local386[2] = local144 + local127;
					local386[1] = local131;
					@Pc(403) int[][] local403 = local99;
					local99 = local95;
					local95 = local403;
					local36 = local38;
					local38 = 0;
					local26 = local24;
					local24 = Static329.method5695(local106, Static7.anInt129);
					local22 = local24 - local26;
					local28 = 0;
					local154 = local22;
					if (local22 < 0) {
						local154 = local22 + Static7.anInt129;
					}
					local30 = 0;
					if (Static7.anInt129 < local154) {
						local154 -= Static7.anInt129;
					}
					while (true) {
						@Pc(448) int[] local448 = local99[local30];
						if (local448[0] <= local154 && local448[1] >= local154) {
							local34 = false;
							break;
						}
						local30++;
						if (local36 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local386 = local95[local38++];
					local386[2] = local127 + local144;
					local386[1] = local131;
					local386[0] = local28;
					this.method2176(local20, local144, local127, local24 + local28, local106, local117);
					local28 = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "([[IBIIILjava/util/Random;I)V")
	private void method2176(@OriginalArg(0) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt2344 <= 0 ? 4096 : 4096 - Static329.method5695(arg4, this.anInt2344);
		@Pc(27) int local27 = this.anInt2343 * this.anInt2340 >> 12;
		@Pc(40) int local40 = this.anInt2340 - (local27 > 0 ? Static329.method5695(arg4, local27) : 0);
		if (arg3 >= Static7.anInt129) {
			arg3 -= Static7.anInt129;
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (local40 > 0) {
			if (arg2 > 0 && arg5 > 0) {
				local71 = arg5 / 2;
				local75 = arg2 / 2;
				@Pc(86) int local86 = local71 < local40 ? local71 : local40;
				@Pc(97) int local97 = local40 <= local75 ? local40 : local75;
				@Pc(101) int local101 = arg3 + local86;
				@Pc(108) int local108 = arg5 - local86 * 2;
				for (@Pc(110) int local110 = 0; local110 < arg2; local110++) {
					@Pc(118) int[] local118 = arg0[arg1 + local110];
					@Pc(127) int local127;
					@Pc(135) int local135;
					@Pc(143) int local143;
					if (local110 < local97) {
						local127 = local19 * local110 / local97;
						if (this.anInt2350 == 0) {
							for (local135 = 0; local135 < local86; local135++) {
								local143 = local135 * local19 / local86;
								local118[arg3 + local135 & Static177.anInt3515] = local118[Static177.anInt3515 & arg3 + arg5 - local135 - 1] = local127 * local143 >> 12;
							}
						} else {
							for (local135 = 0; local135 < local86; local135++) {
								local143 = local135 * local19 / local86;
								local118[arg3 + local135 & Static177.anInt3515] = local118[arg3 + arg5 - local135 - 1 & Static177.anInt3515] = local143 >= local127 ? local127 : local143;
							}
						}
						if (local101 + local108 > Static7.anInt129) {
							local135 = Static7.anInt129 - local101;
							Static368.method5428(local118, local101, local135, local127);
							Static368.method5428(local118, 0, local108 - local135, local127);
						} else {
							Static368.method5428(local118, local101, local108, local127);
						}
					} else {
						local127 = arg2 - local110 - 1;
						if (local97 > local127) {
							local135 = local127 * local19 / local97;
							@Pc(287) int local287;
							if (this.anInt2350 == 0) {
								for (local143 = 0; local143 < local86; local143++) {
									local287 = local19 * local143 / local86;
									local118[Static177.anInt3515 & local143 + arg3] = local118[Static177.anInt3515 & arg3 + arg5 - local143 - 1] = local135 * local287 >> 12;
								}
							} else {
								for (local143 = 0; local143 < local86; local143++) {
									local287 = local19 * local143 / local86;
									local118[arg3 + local143 & Static177.anInt3515] = local118[arg5 + arg3 - local143 - 1 & Static177.anInt3515] = local287 < local135 ? local287 : local135;
								}
							}
							if (local108 + local101 > Static7.anInt129) {
								local143 = Static7.anInt129 - local101;
								Static368.method5428(local118, local101, local143, local135);
								Static368.method5428(local118, 0, local108 - local143, local135);
							} else {
								Static368.method5428(local118, local101, local108, local135);
							}
						} else {
							for (local135 = 0; local135 < local86; local135++) {
								local118[Static177.anInt3515 & arg3 + local135] = local118[Static177.anInt3515 & arg5 + arg3 - local135 - 1] = local19 * local135 / local86;
							}
							if (Static7.anInt129 >= local101 + local108) {
								Static368.method5428(local118, local101, local108, local19);
							} else {
								local143 = Static7.anInt129 - local101;
								Static368.method5428(local118, local101, local143, local19);
								Static368.method5428(local118, 0, local108 - local143, local19);
							}
						}
					}
				}
			}
		} else if (Static7.anInt129 >= arg5 + arg3) {
			for (local71 = 0; local71 < arg2; local71++) {
				Static368.method5428(arg0[arg1 + local71], arg3, arg5, local19);
			}
		} else {
			local71 = Static7.anInt129 - arg3;
			for (local75 = 0; local75 < arg2; local75++) {
				@Pc(514) int[] local514 = arg0[arg1 + local75];
				Static368.method5428(local514, arg3, local71, local19);
				Static368.method5428(local514, 0, arg5 - local71, local19);
			}
		}
	}
}
