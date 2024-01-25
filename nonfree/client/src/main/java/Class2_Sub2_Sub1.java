import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
	private int anInt111 = 1024;

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
	private int anInt107 = 0;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
	private int anInt113 = 409;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
	private int anInt108 = 1024;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
	private int anInt116 = 1024;

	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
	private int anInt120 = 819;

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
	private int anInt118 = 0;

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
	private int anInt123 = 1024;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
	private int anInt122 = 2048;

	static {
		new Class134("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method3645(arg0);
		if (!super.aClass170_41.aBoolean317) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass170_41.method3646();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static217.anInt3574 * this.anInt111 >> 12;
		@Pc(52) int local52 = Static217.anInt3574 * this.anInt122 >> 12;
		@Pc(59) int local59 = Static290.anInt4775 * this.anInt113 >> 12;
		@Pc(66) int local66 = Static290.anInt4775 * this.anInt120 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt121 = this.anInt108 * (Static217.anInt3574 / 8) >> 12;
		@Pc(92) int local92 = Static217.anInt3574 / local45 + 1;
		@Pc(96) int[][] local96 = new int[local92][3];
		@Pc(100) int[][] local100 = new int[local92][3];
		@Pc(107) Random local107 = new Random((long) this.anInt118);
		while (true) {
			while (true) {
				@Pc(117) int local117 = local45 + Static175.method2474(local52 - local45, local107);
				@Pc(127) int local127 = local59 + Static175.method2474(local66 - local59, local107);
				@Pc(131) int local131 = local117 + local28;
				if (local131 > Static217.anInt3574) {
					local117 = Static217.anInt3574 - local28;
					local131 = Static217.anInt3574;
				}
				@Pc(175) int local175;
				@Pc(154) int local154;
				if (local34) {
					local175 = 0;
				} else {
					@Pc(148) int local148 = local30;
					@Pc(152) int[] local152 = local100[local30];
					local154 = 0;
					@Pc(158) int local158 = local22 + local131;
					if (local158 < 0) {
						local158 += Static217.anInt3574;
					}
					if (Static217.anInt3574 < local158) {
						local158 -= Static217.anInt3574;
					}
					local175 = local152[2];
					while (true) {
						@Pc(179) int[] local179 = local100[local148];
						if (local179[0] <= local158 && local179[1] >= local158) {
							if (local30 != local148) {
								@Pc(209) int local209 = local28 + local22;
								if (local209 < 0) {
									local209 += Static217.anInt3574;
								}
								if (local209 > Static217.anInt3574) {
									local209 -= Static217.anInt3574;
								}
								for (@Pc(227) int local227 = 1; local227 <= local154; local227++) {
									@Pc(237) int[] local237 = local100[(local30 + local227) % local36];
									local175 = Math.max(local175, local237[2]);
								}
								for (@Pc(249) int local249 = 0; local249 <= local154; local249++) {
									@Pc(259) int[] local259 = local100[(local249 + local30) % local36];
									@Pc(263) int local263 = local259[2];
									if (local263 != local175) {
										@Pc(274) int local274 = local259[0];
										@Pc(278) int local278 = local259[1];
										@Pc(290) int local290;
										@Pc(292) int local292;
										if (local209 < local158) {
											local290 = Math.max(local209, local274);
											local292 = Math.min(local158, local278);
										} else if (local274 == 0) {
											local292 = Math.min(local158, local278);
											local290 = 0;
										} else {
											local290 = Math.max(local209, local274);
											local292 = Static217.anInt3574;
										}
										this.method113(local292 - local290, local20, local107, local263, local175 - local263, local290 - -local26);
									}
								}
							}
							local30 = local148;
							break;
						}
						local148++;
						if (local148 >= local36) {
							local148 = 0;
						}
						local154++;
					}
				}
				if (local175 + local127 <= Static290.anInt4775) {
					local32 = false;
				} else {
					local127 = Static290.anInt4775 - local175;
				}
				@Pc(376) int[] local376;
				if (Static217.anInt3574 == local131) {
					this.method113(local117, local20, local107, local175, local127, local24 + local28);
					if (local32) {
						return local11;
					}
					local32 = true;
					local376 = local96[local38++];
					local376[2] = local127 + local175;
					local376[0] = local28;
					local376[1] = local131;
					@Pc(392) int[][] local392 = local100;
					local100 = local96;
					local36 = local38;
					local96 = local392;
					local26 = local24;
					local38 = 0;
					local24 = Static175.method2474(Static217.anInt3574, local107);
					local22 = local24 - local26;
					local28 = 0;
					local154 = local22;
					if (local22 < 0) {
						local154 = local22 + Static217.anInt3574;
					}
					if (Static217.anInt3574 < local154) {
						local154 -= Static217.anInt3574;
					}
					local30 = 0;
					while (true) {
						@Pc(442) int[] local442 = local100[local30];
						if (local154 >= local442[0] && local154 <= local442[1]) {
							local34 = false;
							break;
						}
						local30++;
						if (local36 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local376 = local96[local38++];
					local376[0] = local28;
					local376[1] = local131;
					local376[2] = local175 + local127;
					this.method113(local117, local20, local107, local175, local127, local24 + local28);
					local28 = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt118 = arg0.method3580();
		} else if (arg1 == 1) {
			this.anInt111 = arg0.method3555();
		} else if (arg1 == 2) {
			this.anInt122 = arg0.method3555();
		} else if (arg1 == 3) {
			this.anInt113 = arg0.method3555();
		} else if (arg1 == 4) {
			this.anInt120 = arg0.method3555();
		} else if (arg1 == 5) {
			this.anInt108 = arg0.method3555();
		} else if (arg1 == 6) {
			this.anInt107 = arg0.method3580();
		} else if (arg1 == 7) {
			this.anInt123 = arg0.method3555();
		} else if (arg1 == 8) {
			this.anInt116 = arg0.method3555();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[[ILjava/util/Random;ZIII)V")
	private void method113(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt116 <= 0 ? 4096 : 4096 - Static175.method2474(this.anInt116, arg2);
		@Pc(27) int local27 = this.anInt123 * this.anInt121 >> 12;
		@Pc(49) int local49 = this.anInt121 - (local27 > 0 ? Static175.method2474(local27, arg2) : 0);
		if (arg5 >= Static217.anInt3574) {
			arg5 -= Static217.anInt3574;
		}
		@Pc(69) int local69;
		@Pc(92) int local92;
		if (local49 <= 0) {
			if (Static217.anInt3574 >= arg0 + arg5) {
				for (local69 = 0; local69 < arg4; local69++) {
					Static464.method1962(arg1[local69 + arg3], arg5, arg0, local19);
				}
			} else {
				local69 = Static217.anInt3574 - arg5;
				for (local92 = 0; local92 < arg4; local92++) {
					@Pc(101) int[] local101 = arg1[arg3 + local92];
					Static464.method1962(local101, arg5, local69, local19);
					Static464.method1962(local101, 0, arg0 - local69, local19);
				}
			}
		} else if (arg4 > 0 && arg0 > 0) {
			local69 = arg0 / 2;
			local92 = arg4 / 2;
			@Pc(145) int local145 = local69 < local49 ? local69 : local49;
			@Pc(156) int local156 = local49 <= local92 ? local49 : local92;
			@Pc(160) int local160 = arg5 + local145;
			@Pc(167) int local167 = arg0 - local145 * 2;
			for (@Pc(169) int local169 = 0; local169 < arg4; local169++) {
				@Pc(177) int[] local177 = arg1[local169 + arg3];
				@Pc(190) int local190;
				@Pc(195) int local195;
				@Pc(203) int local203;
				if (local169 < local156) {
					local190 = local169 * local19 / local156;
					if (this.anInt107 == 0) {
						for (local195 = 0; local195 < local145; local195++) {
							local203 = local19 * local195 / local145;
							local177[Static127.anInt2287 & local195 + arg5] = local177[arg5 + arg0 - local195 - 1 & Static127.anInt2287] = local190 * local203 >> 12;
						}
					} else {
						for (local195 = 0; local195 < local145; local195++) {
							local203 = local19 * local195 / local145;
							local177[Static127.anInt2287 & local195 + arg5] = local177[arg0 + arg5 - local195 - 1 & Static127.anInt2287] = local190 > local203 ? local203 : local190;
						}
					}
					if (local160 + local167 <= Static217.anInt3574) {
						Static464.method1962(local177, local160, local167, local190);
					} else {
						local195 = Static217.anInt3574 - local160;
						Static464.method1962(local177, local160, local195, local190);
						Static464.method1962(local177, 0, local167 - local195, local190);
					}
				} else {
					local190 = arg4 - local169 - 1;
					if (local190 < local156) {
						local195 = local19 * local190 / local156;
						@Pc(358) int local358;
						if (this.anInt107 == 0) {
							for (local203 = 0; local203 < local145; local203++) {
								local358 = local19 * local203 / local145;
								local177[local203 + arg5 & Static127.anInt2287] = local177[Static127.anInt2287 & arg0 + arg5 - local203 - 1] = local195 * local358 >> 12;
							}
						} else {
							for (local203 = 0; local203 < local145; local203++) {
								local358 = local203 * local19 / local145;
								local177[Static127.anInt2287 & arg5 + local203] = local177[Static127.anInt2287 & arg5 + arg0 - local203 - 1] = local195 <= local358 ? local195 : local358;
							}
						}
						if (Static217.anInt3574 < local167 + local160) {
							local203 = Static217.anInt3574 - local160;
							Static464.method1962(local177, local160, local203, local195);
							Static464.method1962(local177, 0, local167 - local203, local195);
						} else {
							Static464.method1962(local177, local160, local167, local195);
						}
					} else {
						for (local195 = 0; local195 < local145; local195++) {
							local177[Static127.anInt2287 & arg5 + local195] = local177[Static127.anInt2287 & arg0 + arg5 - local195 - 1] = local195 * local19 / local145;
						}
						if (local167 + local160 <= Static217.anInt3574) {
							Static464.method1962(local177, local160, local167, local19);
						} else {
							local203 = Static217.anInt3574 - local160;
							Static464.method1962(local177, local160, local203, local19);
							Static464.method1962(local177, 0, local167 - local203, local19);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
	}
}
