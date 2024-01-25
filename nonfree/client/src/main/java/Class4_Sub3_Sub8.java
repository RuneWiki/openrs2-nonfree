import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class4_Sub3_Sub8 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ds", name = "W", descriptor = "I")
	private int anInt1840;

	@OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
	private int anInt1826 = 2048;

	@OriginalMember(owner = "client!ds", name = "N", descriptor = "I")
	private int anInt1833 = 819;

	@OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
	private int anInt1830 = 1024;

	@OriginalMember(owner = "client!ds", name = "J", descriptor = "I")
	private int anInt1829 = 409;

	@OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
	private int anInt1827 = 0;

	@OriginalMember(owner = "client!ds", name = "Q", descriptor = "I")
	private int anInt1836 = 1024;

	@OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
	private int anInt1825 = 1024;

	@OriginalMember(owner = "client!ds", name = "L", descriptor = "I")
	private int anInt1831 = 1024;

	@OriginalMember(owner = "client!ds", name = "X", descriptor = "I")
	private int anInt1841 = 0;

	static {
		new Class21("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III[[IILjava/util/Random;I)V")
	private void method1627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(29) int local29 = this.anInt1830 <= 0 ? 4096 : 4096 - Static127.method2396(arg4, this.anInt1830);
		@Pc(37) int local37 = this.anInt1840 * this.anInt1836 >> 12;
		@Pc(54) int local54 = this.anInt1840 - (local37 <= 0 ? 0 : Static127.method2396(arg4, local37));
		if (arg1 >= Static304.anInt5637) {
			arg1 -= Static304.anInt5637;
		}
		@Pc(73) int local73;
		@Pc(101) int local101;
		if (local54 <= 0) {
			if (Static304.anInt5637 >= arg5 + arg1) {
				for (local73 = 0; local73 < arg0; local73++) {
					Static474.method3330(arg3[arg2 + local73], arg1, arg5, local29);
				}
			} else {
				local73 = Static304.anInt5637 - arg1;
				for (local101 = 0; local101 < arg0; local101++) {
					@Pc(109) int[] local109 = arg3[arg2 + local101];
					Static474.method3330(local109, arg1, local73, local29);
					Static474.method3330(local109, 0, arg5 - local73, local29);
				}
			}
		} else if (arg0 > 0 && arg5 > 0) {
			local73 = arg5 / 2;
			local101 = arg0 / 2;
			@Pc(157) int local157 = local73 < local54 ? local73 : local54;
			@Pc(168) int local168 = local54 <= local101 ? local54 : local101;
			@Pc(173) int local173 = arg1 + local157;
			@Pc(179) int local179 = arg5 - local157 * 2;
			for (@Pc(181) int local181 = 0; local181 < arg0; local181++) {
				@Pc(190) int[] local190 = arg3[local181 + arg2];
				@Pc(199) int local199;
				@Pc(207) int local207;
				@Pc(215) int local215;
				if (local181 < local168) {
					local199 = local181 * local29 / local168;
					if (this.anInt1827 == 0) {
						for (local207 = 0; local207 < local157; local207++) {
							local215 = local207 * local29 / local157;
							local190[local207 + arg1 & Static279.anInt5254] = local190[arg5 + arg1 - local207 - 1 & Static279.anInt5254] = local215 * local199 >> 12;
						}
					} else {
						for (local207 = 0; local207 < local157; local207++) {
							local215 = local207 * local29 / local157;
							local190[arg1 + local207 & Static279.anInt5254] = local190[arg1 + arg5 - local207 - 1 & Static279.anInt5254] = local199 <= local215 ? local199 : local215;
						}
					}
					if (Static304.anInt5637 >= local173 + local179) {
						Static474.method3330(local190, local173, local179, local199);
					} else {
						local207 = Static304.anInt5637 - local173;
						Static474.method3330(local190, local173, local207, local199);
						Static474.method3330(local190, 0, local179 - local207, local199);
					}
				} else {
					local199 = arg0 - local181 - 1;
					if (local199 < local168) {
						local207 = local29 * local199 / local168;
						@Pc(355) int local355;
						if (this.anInt1827 == 0) {
							for (local215 = 0; local215 < local157; local215++) {
								local355 = local29 * local215 / local157;
								local190[local215 + arg1 & Static279.anInt5254] = local190[arg1 + arg5 - local215 - 1 & Static279.anInt5254] = local207 * local355 >> 12;
							}
						} else {
							for (local215 = 0; local215 < local157; local215++) {
								local355 = local29 * local215 / local157;
								local190[local215 + arg1 & Static279.anInt5254] = local190[Static279.anInt5254 & arg5 + arg1 - local215 - 1] = local207 <= local355 ? local207 : local355;
							}
						}
						if (Static304.anInt5637 < local173 + local179) {
							local215 = Static304.anInt5637 - local173;
							Static474.method3330(local190, local173, local215, local207);
							Static474.method3330(local190, 0, local179 - local215, local207);
						} else {
							Static474.method3330(local190, local173, local179, local207);
						}
					} else {
						for (local207 = 0; local207 < local157; local207++) {
							local190[arg1 + local207 & Static279.anInt5254] = local190[Static279.anInt5254 & arg5 + arg1 - local207 - 1] = local29 * local207 / local157;
						}
						if (Static304.anInt5637 >= local173 + local179) {
							Static474.method3330(local190, local173, local179, local29);
						} else {
							local215 = Static304.anInt5637 - local173;
							Static474.method3330(local190, local173, local215, local29);
							Static474.method3330(local190, 0, local179 - local215, local29);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4027(arg0);
		if (!super.aClass157_41.aBoolean315) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass157_41.method4028();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt1831 * Static304.anInt5637 >> 12;
		@Pc(52) int local52 = this.anInt1826 * Static304.anInt5637 >> 12;
		@Pc(59) int local59 = this.anInt1829 * Static191.anInt3822 >> 12;
		@Pc(66) int local66 = Static191.anInt3822 * this.anInt1833 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt1840 = this.anInt1825 * (Static304.anInt5637 / 8) >> 12;
		@Pc(92) int local92 = Static304.anInt5637 / local45 + 1;
		@Pc(96) int[][] local96 = new int[local92][3];
		@Pc(100) int[][] local100 = new int[local92][3];
		@Pc(107) Random local107 = new Random((long) this.anInt1841);
		while (true) {
			while (true) {
				@Pc(119) int local119 = Static127.method2396(local107, local52 - local45) + local45;
				@Pc(129) int local129 = Static127.method2396(local107, local66 - local59) + local59;
				@Pc(134) int local134 = local28 + local119;
				if (Static304.anInt5637 < local134) {
					local134 = Static304.anInt5637;
					local119 = Static304.anInt5637 - local28;
				}
				@Pc(214) int local214;
				@Pc(154) int local154;
				if (local34) {
					local214 = 0;
				} else {
					@Pc(148) int local148 = local30;
					@Pc(152) int[] local152 = local100[local30];
					local154 = 0;
					@Pc(158) int local158 = local134 + local22;
					if (local158 < 0) {
						local158 += Static304.anInt5637;
					}
					if (Static304.anInt5637 < local158) {
						local158 -= Static304.anInt5637;
					}
					while (true) {
						@Pc(179) int[] local179 = local100[local148];
						if (local158 >= local179[0] && local158 <= local179[1]) {
							local214 = local152[2];
							if (local30 != local148) {
								@Pc(221) int local221 = local28 + local22;
								if (local221 < 0) {
									local221 += Static304.anInt5637;
								}
								if (local221 > Static304.anInt5637) {
									local221 -= Static304.anInt5637;
								}
								for (@Pc(236) int local236 = 1; local236 <= local154; local236++) {
									@Pc(246) int[] local246 = local100[(local236 + local30) % local36];
									local214 = Math.max(local214, local246[2]);
								}
								for (@Pc(258) int local258 = 0; local258 <= local154; local258++) {
									@Pc(269) int[] local269 = local100[(local30 + local258) % local36];
									@Pc(273) int local273 = local269[2];
									if (local273 != local214) {
										@Pc(284) int local284 = local269[0];
										@Pc(288) int local288 = local269[1];
										@Pc(295) int local295;
										@Pc(299) int local299;
										if (local221 < local158) {
											local295 = Math.max(local221, local284);
											local299 = Math.min(local158, local288);
										} else if (local284 == 0) {
											local295 = 0;
											local299 = Math.min(local158, local288);
										} else {
											local295 = Math.max(local221, local284);
											local299 = Static304.anInt5637;
										}
										this.method1627(local214 - local273, local295 - -local26, local273, local20, local107, local299 - local295);
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
				if (Static191.anInt3822 >= local214 + local129) {
					local32 = false;
				} else {
					local129 = Static191.anInt3822 - local214;
				}
				@Pc(373) int[] local373;
				if (local134 == Static304.anInt5637) {
					this.method1627(local129, local24 + local28, local214, local20, local107, local119);
					if (local32) {
						return local11;
					}
					local32 = true;
					local373 = local96[local38++];
					local373[2] = local214 + local129;
					local373[1] = local134;
					local373[0] = local28;
					@Pc(442) int[][] local442 = local100;
					local100 = local96;
					local36 = local38;
					local96 = local442;
					local38 = 0;
					local26 = local24;
					local24 = Static127.method2396(local107, Static304.anInt5637);
					local22 = local24 - local26;
					local28 = 0;
					local154 = local22;
					if (local22 < 0) {
						local154 = local22 + Static304.anInt5637;
					}
					if (Static304.anInt5637 < local154) {
						local154 -= Static304.anInt5637;
					}
					local30 = 0;
					while (true) {
						@Pc(492) int[] local492 = local100[local30];
						if (local492[0] <= local154 && local154 <= local492[1]) {
							local34 = false;
							break;
						}
						local30++;
						if (local36 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local373 = local96[local38++];
					local373[1] = local134;
					local373[0] = local28;
					local373[2] = local129 + local214;
					this.method1627(local129, local24 + local28, local214, local20, local107, local119);
					local28 = local134;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt1841 = arg1.method4614();
		} else if (arg0 == 1) {
			this.anInt1831 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt1826 = arg1.method4560();
		} else if (arg0 == 3) {
			this.anInt1829 = arg1.method4560();
		} else if (arg0 == 4) {
			this.anInt1833 = arg1.method4560();
		} else if (arg0 == 5) {
			this.anInt1825 = arg1.method4560();
		} else if (arg0 == 6) {
			this.anInt1827 = arg1.method4614();
		} else if (arg0 == 7) {
			this.anInt1836 = arg1.method4560();
		} else if (arg0 == 8) {
			this.anInt1830 = arg1.method4560();
		}
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
	}
}
