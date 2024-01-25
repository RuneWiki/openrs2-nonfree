import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class5_Sub6_Sub8 extends Class5_Sub6 {

	@OriginalMember(owner = "client!dq", name = "U", descriptor = "I")
	private int anInt2019;

	@OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
	private int anInt2015 = 0;

	@OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
	private int anInt2006 = 1024;

	@OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
	private int anInt2017 = 819;

	@OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
	private int anInt2014 = 1024;

	@OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
	private int anInt2013 = 0;

	@OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
	private int anInt2009 = 1024;

	@OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
	private int anInt2012 = 409;

	@OriginalMember(owner = "client!dq", name = "W", descriptor = "I")
	private int anInt2021 = 2048;

	@OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
	private int anInt2011 = 1024;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (!super.aClass296_41.aBoolean614) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass296_41.method7190();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static421.anInt7443 * this.anInt2011 >> 12;
		@Pc(52) int local52 = this.anInt2021 * Static421.anInt7443 >> 12;
		@Pc(59) int local59 = Static378.anInt6579 * this.anInt2012 >> 12;
		@Pc(66) int local66 = Static378.anInt6579 * this.anInt2017 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt2019 = Static421.anInt7443 / 8 * this.anInt2006 >> 12;
		@Pc(91) int local91 = Static421.anInt7443 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt2013);
		while (true) {
			while (true) {
				@Pc(116) int local116 = local45 + Static653.method8578(local52 - local45, local106);
				@Pc(126) int local126 = Static653.method8578(local66 - local59, local106) + local59;
				@Pc(131) int local131 = local28 + local116;
				if (local131 > Static421.anInt7443) {
					local131 = Static421.anInt7443;
					local116 = Static421.anInt7443 - local28;
				}
				@Pc(145) int local145;
				@Pc(155) int local155;
				if (local34) {
					local145 = 0;
				} else {
					@Pc(149) int local149 = local30;
					@Pc(153) int[] local153 = local99[local30];
					local155 = 0;
					@Pc(159) int local159 = local22 + local131;
					if (local159 < 0) {
						local159 += Static421.anInt7443;
					}
					if (local159 > Static421.anInt7443) {
						local159 -= Static421.anInt7443;
					}
					while (true) {
						@Pc(183) int[] local183 = local99[local149];
						if (local159 >= local183[0] && local159 <= local183[1]) {
							local145 = local153[2];
							if (local149 != local30) {
								@Pc(221) int local221 = local22 + local28;
								if (local221 < 0) {
									local221 += Static421.anInt7443;
								}
								if (Static421.anInt7443 < local221) {
									local221 -= Static421.anInt7443;
								}
								for (@Pc(240) int local240 = 1; local240 <= local155; local240++) {
									@Pc(251) int[] local251 = local99[(local30 + local240) % local36];
									local145 = Math.max(local145, local251[2]);
								}
								for (@Pc(263) int local263 = 0; local263 <= local155; local263++) {
									@Pc(273) int[] local273 = local99[(local263 + local30) % local36];
									@Pc(277) int local277 = local273[2];
									if (local277 != local145) {
										@Pc(284) int local284 = local273[0];
										@Pc(288) int local288 = local273[1];
										@Pc(299) int local299;
										@Pc(297) int local297;
										if (local221 < local159) {
											local299 = Math.max(local221, local284);
											local297 = Math.min(local159, local288);
										} else if (local284 == 0) {
											local297 = Math.min(local159, local288);
											local299 = 0;
										} else {
											local299 = Math.max(local221, local284);
											local297 = Static421.anInt7443;
										}
										this.method1828(local106, local20, local277, local145 - local277, local297 + -local299, local26 + local299);
									}
								}
							}
							local30 = local149;
							break;
						}
						local155++;
						local149++;
						if (local36 <= local149) {
							local149 = 0;
						}
					}
				}
				if (Static378.anInt6579 < local145 + local126) {
					local126 = Static378.anInt6579 - local145;
				} else {
					local32 = false;
				}
				@Pc(365) int[] local365;
				if (local131 == Static421.anInt7443) {
					this.method1828(local106, local20, local145, local126, local116, local28 + local24);
					if (local32) {
						return local11;
					}
					local32 = true;
					local365 = local95[local38++];
					local365[1] = local131;
					local365[0] = local28;
					local365[2] = local126 + local145;
					@Pc(430) int[][] local430 = local99;
					local99 = local95;
					local36 = local38;
					local95 = local430;
					local38 = 0;
					local26 = local24;
					local24 = Static653.method8578(Static421.anInt7443, local106);
					local22 = local24 - local26;
					local28 = 0;
					local155 = local22;
					if (local22 < 0) {
						local155 = local22 + Static421.anInt7443;
					}
					local30 = 0;
					if (local155 > Static421.anInt7443) {
						local155 -= Static421.anInt7443;
					}
					local34 = false;
					while (true) {
						@Pc(478) int[] local478 = local99[local30];
						if (local478[0] <= local155 && local155 <= local478[1]) {
							break;
						}
						@Pc(491) int local491 = ~local36;
						local30++;
						if (local491 >= ~local30) {
							local30 = 0;
						}
					}
				} else {
					local365 = local95[local38++];
					local365[1] = local131;
					local365[0] = local28;
					local365[2] = local145 + local126;
					this.method1828(local106, local20, local145, local126, local116, local24 + local28);
					local28 = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/util/Random;[[IIIII)V")
	private void method1828(@OriginalArg(1) Random arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(24) int local24 = this.anInt2014 <= 0 ? 4096 : 4096 - Static653.method8578(this.anInt2014, arg0);
		@Pc(32) int local32 = this.anInt2009 * this.anInt2019 >> 12;
		@Pc(47) int local47 = this.anInt2019 - (local32 <= 0 ? 0 : Static653.method8578(local32, arg0));
		if (arg5 >= Static421.anInt7443) {
			arg5 -= Static421.anInt7443;
		}
		@Pc(72) int local72;
		@Pc(76) int local76;
		if (local47 > 0) {
			if (arg3 > 0 && arg4 > 0) {
				local72 = arg4 / 2;
				local76 = arg3 / 2;
				@Pc(83) int local83 = local47 <= local72 ? local47 : local72;
				@Pc(94) int local94 = local47 > local76 ? local76 : local47;
				@Pc(98) int local98 = arg5 + local83;
				@Pc(105) int local105 = arg4 - local83 * 2;
				for (@Pc(107) int local107 = 0; local107 < arg3; local107++) {
					@Pc(116) int[] local116 = arg1[local107 + arg2];
					@Pc(129) int local129;
					@Pc(137) int local137;
					@Pc(145) int local145;
					if (local94 > local107) {
						local129 = local107 * local24 / local94;
						if (this.anInt2015 == 0) {
							for (local137 = 0; local137 < local83; local137++) {
								local145 = local24 * local137 / local83;
								local116[local137 + arg5 & Static575.anInt9380] = local116[Static575.anInt9380 & arg5 + arg4 - local137 - 1] = local129 * local145 >> 12;
							}
						} else {
							for (local137 = 0; local137 < local83; local137++) {
								local145 = local137 * local24 / local83;
								local116[Static575.anInt9380 & local137 + arg5] = local116[arg5 + arg4 - local137 - 1 & Static575.anInt9380] = local129 <= local145 ? local129 : local145;
							}
						}
						if (Static421.anInt7443 >= local105 + local98) {
							Static685.method8333(local116, local98, local105, local129);
						} else {
							local137 = Static421.anInt7443 - local98;
							Static685.method8333(local116, local98, local137, local129);
							Static685.method8333(local116, 0, local105 - local137, local129);
						}
					} else {
						local129 = arg3 - local107 - 1;
						if (local129 < local94) {
							local137 = local24 * local129 / local94;
							@Pc(293) int local293;
							if (this.anInt2015 == 0) {
								for (local145 = 0; local145 < local83; local145++) {
									local293 = local24 * local145 / local83;
									local116[Static575.anInt9380 & arg5 + local145] = local116[arg5 + arg4 - local145 - 1 & Static575.anInt9380] = local137 * local293 >> 12;
								}
							} else {
								for (local145 = 0; local145 < local83; local145++) {
									local293 = local24 * local145 / local83;
									local116[local145 + arg5 & Static575.anInt9380] = local116[arg5 + arg4 - local145 - 1 & Static575.anInt9380] = local137 <= local293 ? local137 : local293;
								}
							}
							if (Static421.anInt7443 >= local98 + local105) {
								Static685.method8333(local116, local98, local105, local137);
							} else {
								local145 = Static421.anInt7443 - local98;
								Static685.method8333(local116, local98, local145, local137);
								Static685.method8333(local116, 0, local105 - local145, local137);
							}
						} else {
							for (local137 = 0; local137 < local83; local137++) {
								local116[Static575.anInt9380 & arg5 + local137] = local116[arg5 + arg4 - local137 - 1 & Static575.anInt9380] = local24 * local137 / local83;
							}
							if (Static421.anInt7443 < local105 + local98) {
								local145 = Static421.anInt7443 - local98;
								Static685.method8333(local116, local98, local145, local24);
								Static685.method8333(local116, 0, local105 - local145, local24);
							} else {
								Static685.method8333(local116, local98, local105, local24);
							}
						}
					}
				}
			}
		} else if (Static421.anInt7443 >= arg5 + arg4) {
			for (local72 = 0; local72 < arg3; local72++) {
				Static685.method8333(arg1[local72 + arg2], arg5, arg4, local24);
			}
		} else {
			local72 = Static421.anInt7443 - arg5;
			for (local76 = 0; local76 < arg3; local76++) {
				@Pc(519) int[] local519 = arg1[local76 + arg2];
				Static685.method8333(local519, arg5, local72, local24);
				Static685.method8333(local519, 0, arg4 - local72, local24);
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2013 = arg0.method3642();
		} else if (arg1 == 1) {
			this.anInt2011 = arg0.method3698();
		} else if (arg1 == 2) {
			this.anInt2021 = arg0.method3698();
		} else if (arg1 == 3) {
			this.anInt2012 = arg0.method3698();
		} else if (arg1 == 4) {
			this.anInt2017 = arg0.method3698();
		} else if (arg1 == 5) {
			this.anInt2006 = arg0.method3698();
		} else if (arg1 == 6) {
			this.anInt2015 = arg0.method3642();
		} else if (arg1 == 7) {
			this.anInt2009 = arg0.method3698();
		} else if (arg1 == 8) {
			this.anInt2014 = arg0.method3698();
		}
	}
}
