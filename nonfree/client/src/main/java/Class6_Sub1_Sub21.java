import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class6_Sub1_Sub21 extends Class6_Sub1 {

	@OriginalMember(owner = "client!os", name = "N", descriptor = "I")
	private int anInt7099;

	@OriginalMember(owner = "client!os", name = "D", descriptor = "I")
	private int anInt7091 = 409;

	@OriginalMember(owner = "client!os", name = "M", descriptor = "I")
	private int anInt7098 = 0;

	@OriginalMember(owner = "client!os", name = "E", descriptor = "I")
	private int anInt7092 = 1024;

	@OriginalMember(owner = "client!os", name = "O", descriptor = "I")
	private int anInt7100 = 819;

	@OriginalMember(owner = "client!os", name = "P", descriptor = "I")
	private int anInt7101 = 1024;

	@OriginalMember(owner = "client!os", name = "G", descriptor = "I")
	private int anInt7094 = 2048;

	@OriginalMember(owner = "client!os", name = "V", descriptor = "I")
	private int anInt7107 = 0;

	@OriginalMember(owner = "client!os", name = "L", descriptor = "I")
	private int anInt7097 = 1024;

	@OriginalMember(owner = "client!os", name = "T", descriptor = "I")
	private int anInt7105 = 1024;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4597(arg0);
		if (!super.aClass187_41.aBoolean403) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass187_41.method4592();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt7097 * Static289.anInt5549 >> 12;
		@Pc(52) int local52 = Static289.anInt5549 * this.anInt7094 >> 12;
		@Pc(59) int local59 = Static468.anInt8642 * this.anInt7091 >> 12;
		@Pc(66) int local66 = Static468.anInt8642 * this.anInt7100 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt7099 = Static289.anInt5549 / 8 * this.anInt7092 >> 12;
		@Pc(92) int local92 = Static289.anInt5549 / local45 + 1;
		@Pc(96) int[][] local96 = new int[local92][3];
		@Pc(100) int[][] local100 = new int[local92][3];
		@Pc(107) Random local107 = new Random((long) this.anInt7107);
		while (true) {
			while (true) {
				@Pc(116) int local116 = Static326.method5252(local107, local52 - local45) + local45;
				@Pc(127) int local127 = local59 + Static326.method5252(local107, local66 - local59);
				@Pc(131) int local131 = local28 + local116;
				if (Static289.anInt5549 < local131) {
					local116 = Static289.anInt5549 - local28;
					local131 = Static289.anInt5549;
				}
				@Pc(145) int local145;
				@Pc(155) int local155;
				if (local34) {
					local145 = 0;
				} else {
					@Pc(149) int local149 = local30;
					@Pc(153) int[] local153 = local100[local30];
					local155 = 0;
					@Pc(159) int local159 = local131 + local22;
					if (local159 < 0) {
						local159 += Static289.anInt5549;
					}
					if (local159 > Static289.anInt5549) {
						local159 -= Static289.anInt5549;
					}
					while (true) {
						@Pc(176) int[] local176 = local100[local149];
						if (local159 >= local176[0] && local159 <= local176[1]) {
							local145 = local153[2];
							if (local149 != local30) {
								@Pc(215) int local215 = local28 + local22;
								if (local215 < 0) {
									local215 += Static289.anInt5549;
								}
								if (Static289.anInt5549 < local215) {
									local215 -= Static289.anInt5549;
								}
								for (@Pc(233) int local233 = 1; local233 <= local155; local233++) {
									@Pc(243) int[] local243 = local100[(local233 + local30) % local36];
									local145 = Math.max(local145, local243[2]);
								}
								for (@Pc(259) int local259 = 0; local259 <= local155; local259++) {
									@Pc(269) int[] local269 = local100[(local259 + local30) % local36];
									@Pc(273) int local273 = local269[2];
									if (local273 != local145) {
										@Pc(280) int local280 = local269[0];
										@Pc(284) int local284 = local269[1];
										@Pc(295) int local295;
										@Pc(299) int local299;
										if (local215 < local159) {
											local295 = Math.max(local215, local280);
											local299 = Math.min(local159, local284);
										} else if (local280 == 0) {
											local299 = Math.min(local159, local284);
											local295 = 0;
										} else {
											local295 = Math.max(local215, local280);
											local299 = Static289.anInt5549;
										}
										this.method5982(local299 - local295, local295 + local26, local20, local273, local107, local145 - local273);
									}
								}
							}
							local30 = local149;
							break;
						}
						local149++;
						if (local149 >= local36) {
							local149 = 0;
						}
						local155++;
					}
				}
				if (Static468.anInt8642 >= local127 + local145) {
					local32 = false;
				} else {
					local127 = Static468.anInt8642 - local145;
				}
				@Pc(368) int[] local368;
				if (Static289.anInt5549 == local131) {
					this.method5982(local116, local28 + local24, local20, local145, local107, local127);
					if (local32) {
						return local11;
					}
					local32 = true;
					local368 = local96[local38++];
					local368[2] = local145 + local127;
					local368[0] = local28;
					local368[1] = local131;
					@Pc(435) int[][] local435 = local100;
					local100 = local96;
					local36 = local38;
					local96 = local435;
					local26 = local24;
					local38 = 0;
					local24 = Static326.method5252(local107, Static289.anInt5549);
					local28 = 0;
					local22 = local24 - local26;
					local155 = local22;
					if (local22 < 0) {
						local155 = local22 + Static289.anInt5549;
					}
					local30 = 0;
					if (Static289.anInt5549 < local155) {
						local155 -= Static289.anInt5549;
					}
					local34 = false;
					while (true) {
						@Pc(487) int[] local487 = local100[local30];
						if (local487[0] <= local155 && local155 <= local487[1]) {
							break;
						}
						local30++;
						if (local36 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local368 = local96[local38++];
					local368[0] = local28;
					local368[1] = local131;
					local368[2] = local145 + local127;
					this.method5982(local116, local28 + local24, local20, local145, local107, local127);
					local28 = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II[[IIILjava/util/Random;I)V")
	private void method5982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(26) int local26 = this.anInt7101 <= 0 ? 4096 : 4096 - Static326.method5252(arg4, this.anInt7101);
		@Pc(34) int local34 = this.anInt7105 * this.anInt7099 >> 12;
		@Pc(50) int local50 = this.anInt7099 - (local34 <= 0 ? 0 : Static326.method5252(arg4, local34));
		if (Static289.anInt5549 <= arg1) {
			arg1 -= Static289.anInt5549;
		}
		@Pc(74) int local74;
		@Pc(97) int local97;
		if (local50 <= 0) {
			if (Static289.anInt5549 >= arg0 + arg1) {
				for (local74 = 0; local74 < arg5; local74++) {
					Static589.method5379(arg2[arg3 + local74], arg1, arg0, local26);
				}
			} else {
				local74 = Static289.anInt5549 - arg1;
				for (local97 = 0; local97 < arg5; local97++) {
					@Pc(106) int[] local106 = arg2[arg3 + local97];
					Static589.method5379(local106, arg1, local74, local26);
					Static589.method5379(local106, 0, arg0 - local74, local26);
				}
			}
		} else if (arg5 > 0 && arg0 > 0) {
			local74 = arg0 / 2;
			local97 = arg5 / 2;
			@Pc(151) int local151 = local50 <= local74 ? local50 : local74;
			@Pc(162) int local162 = local97 >= local50 ? local50 : local97;
			@Pc(167) int local167 = arg1 + local151;
			@Pc(174) int local174 = arg0 - local151 * 2;
			for (@Pc(176) int local176 = 0; local176 < arg5; local176++) {
				@Pc(184) int[] local184 = arg2[arg3 + local176];
				@Pc(197) int local197;
				@Pc(202) int local202;
				@Pc(210) int local210;
				if (local176 < local162) {
					local197 = local176 * local26 / local162;
					if (this.anInt7098 == 0) {
						for (local202 = 0; local202 < local151; local202++) {
							local210 = local26 * local202 / local151;
							local184[arg1 + local202 & Static153.anInt3343] = local184[arg1 + arg0 - local202 - 1 & Static153.anInt3343] = local197 * local210 >> 12;
						}
					} else {
						for (local202 = 0; local202 < local151; local202++) {
							local210 = local26 * local202 / local151;
							local184[local202 + arg1 & Static153.anInt3343] = local184[Static153.anInt3343 & arg0 + arg1 - local202 - 1] = local210 >= local197 ? local197 : local210;
						}
					}
					if (local174 + local167 > Static289.anInt5549) {
						local202 = Static289.anInt5549 - local167;
						Static589.method5379(local184, local167, local202, local197);
						Static589.method5379(local184, 0, local174 - local202, local197);
					} else {
						Static589.method5379(local184, local167, local174, local197);
					}
				} else {
					local197 = arg5 - local176 - 1;
					if (local197 < local162) {
						local202 = local197 * local26 / local162;
						@Pc(352) int local352;
						if (this.anInt7098 == 0) {
							for (local210 = 0; local210 < local151; local210++) {
								local352 = local26 * local210 / local151;
								local184[arg1 + local210 & Static153.anInt3343] = local184[arg0 + arg1 - local210 - 1 & Static153.anInt3343] = local202 * local352 >> 12;
							}
						} else {
							for (local210 = 0; local210 < local151; local210++) {
								local352 = local26 * local210 / local151;
								local184[arg1 + local210 & Static153.anInt3343] = local184[Static153.anInt3343 & arg1 + arg0 - local210 - 1] = local352 >= local202 ? local202 : local352;
							}
						}
						if (local167 + local174 <= Static289.anInt5549) {
							Static589.method5379(local184, local167, local174, local202);
						} else {
							local210 = Static289.anInt5549 - local167;
							Static589.method5379(local184, local167, local210, local202);
							Static589.method5379(local184, 0, local174 - local210, local202);
						}
					} else {
						for (local202 = 0; local202 < local151; local202++) {
							local184[Static153.anInt3343 & local202 + arg1] = local184[Static153.anInt3343 & arg0 + arg1 - local202 - 1] = local26 * local202 / local151;
						}
						if (Static289.anInt5549 < local174 + local167) {
							local210 = Static289.anInt5549 - local167;
							Static589.method5379(local184, local167, local210, local26);
							Static589.method5379(local184, 0, local174 - local210, local26);
						} else {
							Static589.method5379(local184, local167, local174, local26);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt7107 = arg1.method4966();
		} else if (arg0 == 1) {
			this.anInt7097 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anInt7094 = arg1.method4999();
		} else if (arg0 == 3) {
			this.anInt7091 = arg1.method4999();
		} else if (arg0 == 4) {
			this.anInt7100 = arg1.method4999();
		} else if (arg0 == 5) {
			this.anInt7092 = arg1.method4999();
		} else if (arg0 == 6) {
			this.anInt7098 = arg1.method4966();
		} else if (arg0 == 7) {
			this.anInt7105 = arg1.method4999();
		} else if (arg0 == 8) {
			this.anInt7101 = arg1.method4999();
		}
	}
}
