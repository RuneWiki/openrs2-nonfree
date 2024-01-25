import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class7_Sub3_Sub20 extends Class7_Sub3 {

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
	private int anInt4106;

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
	private int anInt4102 = 1024;

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
	private int anInt4105 = 0;

	@OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
	private int anInt4110 = 1024;

	@OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
	private int anInt4109 = 819;

	@OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
	private int anInt4114 = 2048;

	@OriginalMember(owner = "client!lr", name = "T", descriptor = "I")
	private int anInt4116 = 1024;

	@OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
	private int anInt4103 = 409;

	@OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
	private int anInt4107 = 0;

	@OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
	private int anInt4117 = 1024;

	static {
		new Class55("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt4105 = arg1.method3981();
		} else if (arg0 == 1) {
			this.anInt4116 = arg1.method3943();
		} else if (arg0 == 2) {
			this.anInt4114 = arg1.method3943();
		} else if (arg0 == 3) {
			this.anInt4103 = arg1.method3943();
		} else if (arg0 == 4) {
			this.anInt4109 = arg1.method3943();
		} else if (arg0 == 5) {
			this.anInt4117 = arg1.method3943();
		} else if (arg0 == 6) {
			this.anInt4107 = arg1.method3981();
		} else if (arg0 == 7) {
			this.anInt4102 = arg1.method3943();
		} else if (arg0 == 8) {
			this.anInt4110 = arg1.method3943();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (!super.aClass113_41.aBoolean181) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass113_41.method2457();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt4116 * Static58.anInt1052 >> 12;
		@Pc(52) int local52 = Static58.anInt1052 * this.anInt4114 >> 12;
		@Pc(59) int local59 = Static383.anInt6175 * this.anInt4103 >> 12;
		@Pc(66) int local66 = Static383.anInt6175 * this.anInt4109 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt4106 = this.anInt4117 * (Static58.anInt1052 / 8) >> 12;
		@Pc(91) int local91 = Static58.anInt1052 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt4105);
		while (true) {
			while (true) {
				@Pc(115) int local115 = local45 + Static304.method4043(local52 - local45, local106);
				@Pc(125) int local125 = Static304.method4043(local66 - local59, local106) + local59;
				@Pc(129) int local129 = local115 + local28;
				if (local129 > Static58.anInt1052) {
					local129 = Static58.anInt1052;
					local115 = Static58.anInt1052 - local28;
				}
				@Pc(146) int local146;
				@Pc(156) int local156;
				if (local34) {
					local146 = 0;
				} else {
					@Pc(150) int local150 = local30;
					@Pc(154) int[] local154 = local99[local30];
					local156 = 0;
					@Pc(160) int local160 = local22 + local129;
					if (local160 < 0) {
						local160 += Static58.anInt1052;
					}
					if (local160 > Static58.anInt1052) {
						local160 -= Static58.anInt1052;
					}
					local146 = local154[2];
					while (true) {
						@Pc(184) int[] local184 = local99[local150];
						if (local160 >= local184[0] && local184[1] >= local160) {
							if (local150 != local30) {
								@Pc(222) int local222 = local22 + local28;
								if (local222 < 0) {
									local222 += Static58.anInt1052;
								}
								if (Static58.anInt1052 < local222) {
									local222 -= Static58.anInt1052;
								}
								for (@Pc(237) int local237 = 1; local237 <= local156; local237++) {
									@Pc(247) int[] local247 = local99[(local30 + local237) % local36];
									local146 = Math.max(local146, local247[2]);
								}
								for (@Pc(263) int local263 = 0; local263 <= local156; local263++) {
									@Pc(273) int[] local273 = local99[(local263 + local30) % local36];
									@Pc(277) int local277 = local273[2];
									if (local277 != local146) {
										@Pc(284) int local284 = local273[0];
										@Pc(288) int local288 = local273[1];
										@Pc(295) int local295;
										@Pc(299) int local299;
										if (local160 > local222) {
											local295 = Math.max(local222, local284);
											local299 = Math.min(local160, local288);
										} else if (local284 == 0) {
											local295 = 0;
											local299 = Math.min(local160, local288);
										} else {
											local295 = Math.max(local222, local284);
											local299 = Static58.anInt1052;
										}
										this.method3259(local20, local299 - local295, local26 + local295, local106, local277, local146 - local277);
									}
								}
							}
							local30 = local150;
							break;
						}
						local150++;
						if (local150 >= local36) {
							local150 = 0;
						}
						local156++;
					}
				}
				if (local125 + local146 > Static383.anInt6175) {
					local125 = Static383.anInt6175 - local146;
				} else {
					local32 = false;
				}
				@Pc(391) int[] local391;
				if (local129 == Static58.anInt1052) {
					this.method3259(local20, local115, local24 + local28, local106, local146, local125);
					if (local32) {
						return local11;
					}
					local32 = true;
					local391 = local95[local38++];
					local391[0] = local28;
					local391[1] = local129;
					local391[2] = local125 + local146;
					@Pc(407) int[][] local407 = local99;
					local99 = local95;
					local95 = local407;
					local36 = local38;
					local26 = local24;
					local38 = 0;
					local24 = Static304.method4043(Static58.anInt1052, local106);
					local22 = local24 - local26;
					local28 = 0;
					local156 = local22;
					if (local22 < 0) {
						local156 = local22 + Static58.anInt1052;
					}
					local30 = 0;
					if (local156 > Static58.anInt1052) {
						local156 -= Static58.anInt1052;
					}
					while (true) {
						@Pc(449) int[] local449 = local99[local30];
						if (local449[0] <= local156 && local156 <= local449[1]) {
							local34 = false;
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local391 = local95[local38++];
					local391[1] = local129;
					local391[0] = local28;
					local391[2] = local125 + local146;
					this.method3259(local20, local115, local28 + local24, local106, local146, local125);
					local28 = local129;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([[IIIILjava/util/Random;II)V")
	private void method3259(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt4110 <= 0 ? 4096 : 4096 - Static304.method4043(this.anInt4110, arg3);
		@Pc(27) int local27 = this.anInt4106 * this.anInt4102 >> 12;
		@Pc(49) int local49 = this.anInt4106 - (local27 > 0 ? Static304.method4043(local27, arg3) : 0);
		if (Static58.anInt1052 <= arg2) {
			arg2 -= Static58.anInt1052;
		}
		@Pc(69) int local69;
		@Pc(96) int local96;
		if (local49 <= 0) {
			if (Static58.anInt1052 >= arg1 + arg2) {
				for (local69 = 0; local69 < arg5; local69++) {
					Static464.method3634(arg0[arg4 + local69], arg2, arg1, local19);
				}
			} else {
				local69 = Static58.anInt1052 - arg2;
				for (local96 = 0; local96 < arg5; local96++) {
					@Pc(104) int[] local104 = arg0[local96 + arg4];
					Static464.method3634(local104, arg2, local69, local19);
					Static464.method3634(local104, 0, arg1 - local69, local19);
				}
			}
		} else if (arg5 > 0 && arg1 > 0) {
			local69 = arg1 / 2;
			local96 = arg5 / 2;
			@Pc(151) int local151 = local49 > local69 ? local69 : local49;
			@Pc(162) int local162 = local96 >= local49 ? local49 : local96;
			@Pc(166) int local166 = local151 + arg2;
			@Pc(173) int local173 = arg1 - local151 * 2;
			for (@Pc(175) int local175 = 0; local175 < arg5; local175++) {
				@Pc(183) int[] local183 = arg0[arg4 + local175];
				@Pc(192) int local192;
				@Pc(200) int local200;
				@Pc(208) int local208;
				if (local162 > local175) {
					local192 = local175 * local19 / local162;
					if (this.anInt4107 == 0) {
						for (local200 = 0; local200 < local151; local200++) {
							local208 = local19 * local200 / local151;
							local183[arg2 + local200 & Static410.anInt6497] = local183[Static410.anInt6497 & arg1 + arg2 - local200 - 1] = local208 * local192 >> 12;
						}
					} else {
						for (local200 = 0; local200 < local151; local200++) {
							local208 = local200 * local19 / local151;
							local183[Static410.anInt6497 & local200 + arg2] = local183[arg1 + arg2 - local200 - 1 & Static410.anInt6497] = local192 > local208 ? local208 : local192;
						}
					}
					if (local173 + local166 > Static58.anInt1052) {
						local200 = Static58.anInt1052 - local166;
						Static464.method3634(local183, local166, local200, local192);
						Static464.method3634(local183, 0, local173 - local200, local192);
					} else {
						Static464.method3634(local183, local166, local173, local192);
					}
				} else {
					local192 = arg5 - local175 - 1;
					if (local192 < local162) {
						local200 = local192 * local19 / local162;
						@Pc(345) int local345;
						if (this.anInt4107 == 0) {
							for (local208 = 0; local208 < local151; local208++) {
								local345 = local208 * local19 / local151;
								local183[local208 + arg2 & Static410.anInt6497] = local183[arg1 + arg2 - local208 - 1 & Static410.anInt6497] = local345 * local200 >> 12;
							}
						} else {
							for (local208 = 0; local208 < local151; local208++) {
								local345 = local208 * local19 / local151;
								local183[arg2 + local208 & Static410.anInt6497] = local183[Static410.anInt6497 & arg2 + arg1 - local208 - 1] = local200 <= local345 ? local200 : local345;
							}
						}
						if (Static58.anInt1052 < local166 + local173) {
							local208 = Static58.anInt1052 - local166;
							Static464.method3634(local183, local166, local208, local200);
							Static464.method3634(local183, 0, local173 - local208, local200);
						} else {
							Static464.method3634(local183, local166, local173, local200);
						}
					} else {
						for (local200 = 0; local200 < local151; local200++) {
							local183[Static410.anInt6497 & arg2 + local200] = local183[Static410.anInt6497 & arg2 + arg1 - local200 - 1] = local200 * local19 / local151;
						}
						if (Static58.anInt1052 >= local166 + local173) {
							Static464.method3634(local183, local166, local173, local19);
						} else {
							local208 = Static58.anInt1052 - local166;
							Static464.method3634(local183, local166, local208, local19);
							Static464.method3634(local183, 0, local173 - local208, local19);
						}
					}
				}
			}
		}
	}
}
