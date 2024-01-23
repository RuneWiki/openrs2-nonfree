import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class8_Sub3_Sub3 extends Class8_Sub3 {

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
	private int anInt465;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
	private int anInt470 = 409;

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
	private int anInt466 = 1024;

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
	private int anInt471 = 0;

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
	private int anInt474 = 1024;

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
	private int anInt478 = 1024;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
	private int anInt476 = 819;

	@OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
	private int anInt483 = 1024;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
	private int anInt468 = 0;

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "I")
	private int anInt484 = 2048;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass59_41.method1366(arg0);
		if (!this.aClass59_41.aBoolean131) {
			return local11;
		}
		@Pc(29) int[][] local29 = this.aClass59_41.method1363();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) boolean local41 = true;
		@Pc(43) boolean local43 = true;
		@Pc(45) int local45 = 0;
		@Pc(52) int local52 = Static239.anInt4789 * this.anInt478 >> 12;
		@Pc(59) int local59 = Static239.anInt4789 * this.anInt484 >> 12;
		@Pc(61) int local61 = 0;
		@Pc(68) int local68 = Static86.anInt1852 * this.anInt470 >> 12;
		@Pc(75) int local75 = Static86.anInt1852 * this.anInt476 >> 12;
		if (local75 <= 1) {
			return local29[arg0];
		}
		this.anInt465 = this.anInt466 * (Static239.anInt4789 / 8) >> 12;
		@Pc(101) int local101 = Static239.anInt4789 / local52 + 1;
		@Pc(105) int[][] local105 = new int[local101][3];
		@Pc(112) Random local112 = new Random((long) this.anInt471);
		@Pc(116) int[][] local116 = new int[local101][3];
		while (true) {
			while (true) {
				@Pc(126) int local126 = Static293.method4280(local59 - local52, local112) + local52;
				@Pc(136) int local136 = Static293.method4280(local75 - local68, local112) + local68;
				@Pc(140) int local140 = local126 + local37;
				if (local140 > Static239.anInt4789) {
					local126 = Static239.anInt4789 - local37;
					local140 = Static239.anInt4789;
				}
				@Pc(207) int local207;
				@Pc(162) int local162;
				@Pc(168) int local168;
				if (local41) {
					local162 = 0;
				} else {
					@Pc(154) int local154 = local39;
					@Pc(158) int[] local158 = local116[local39];
					local162 = local158[2];
					@Pc(166) int local166 = local31 + local140;
					local168 = 0;
					if (local166 < 0) {
						local166 += Static239.anInt4789;
					}
					if (local166 > Static239.anInt4789) {
						local166 -= Static239.anInt4789;
					}
					while (true) {
						@Pc(193) int[] local193 = local116[local154];
						if (local193[0] <= local166 && local193[1] >= local166) {
							if (local39 != local154) {
								@Pc(227) int local227 = local31 + local37;
								if (local227 < 0) {
									local227 += Static239.anInt4789;
								}
								if (local227 > Static239.anInt4789) {
									local227 -= Static239.anInt4789;
								}
								@Pc(249) int local249;
								@Pc(265) int[] local265;
								for (local249 = 1; local249 <= local168; local249++) {
									local265 = local116[(local39 + local249) % local61];
									local162 = Math.max(local162, local265[2]);
								}
								for (local249 = 0; local249 <= local168; local249++) {
									local265 = local116[(local39 + local249) % local61];
									@Pc(295) int local295 = local265[2];
									if (local162 != local295) {
										@Pc(307) int local307 = local265[0];
										@Pc(311) int local311 = local265[1];
										@Pc(318) int local318;
										@Pc(322) int local322;
										if (local227 < local166) {
											local318 = Math.max(local227, local307);
											local322 = Math.min(local166, local311);
										} else if (local307 == 0) {
											local318 = 0;
											local322 = Math.min(local166, local311);
										} else {
											local318 = Math.max(local227, local307);
											local322 = Static239.anInt4789;
										}
										this.method321(local35 + local318, local295, local112, local29, local162 - local295, -local318 + local322);
									}
								}
							}
							local39 = local154;
							break;
						}
						local168++;
						local207 = ~local61;
						local154++;
						if (local207 >= ~local154) {
							local154 = 0;
						}
					}
				}
				if (local136 + local162 > Static86.anInt1852) {
					local136 = Static86.anInt1852 - local162;
				} else {
					local43 = false;
				}
				@Pc(423) int[] local423;
				if (local140 == Static239.anInt4789) {
					this.method321(local37 + local33, local162, local112, local29, local136, local126);
					if (local43) {
						return local11;
					}
					local41 = false;
					local39 = 0;
					local35 = local33;
					local43 = true;
					local423 = local105[local45++];
					local423[0] = local37;
					@Pc(429) int[][] local429 = local116;
					local423[1] = local140;
					local61 = local45;
					local45 = 0;
					local423[2] = local136 + local162;
					local33 = Static293.method4280(Static239.anInt4789, local112);
					local116 = local105;
					local37 = 0;
					local105 = local429;
					local31 = local33 - local35;
					local168 = local31;
					if (local31 < 0) {
						local168 = local31 + Static239.anInt4789;
					}
					if (Static239.anInt4789 < local168) {
						local168 -= Static239.anInt4789;
					}
					while (true) {
						@Pc(483) int[] local483 = local116[local39];
						if (local483[0] <= local168 && local168 <= local483[1]) {
							break;
						}
						local207 = ~local61;
						local39++;
						if (local207 >= ~local39) {
							local39 = 0;
						}
					}
				} else {
					local423 = local105[local45++];
					local423[0] = local37;
					local423[1] = local140;
					local423[2] = local162 + local136;
					this.method321(local37 + local33, local162, local112, local29, local136, local126);
					local37 = local140;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt471 = arg1.method2334();
		} else if (arg0 == 1) {
			this.anInt478 = arg1.method2375();
		} else if (arg0 == 2) {
			this.anInt484 = arg1.method2375();
		} else if (arg0 == 3) {
			this.anInt470 = arg1.method2375();
		} else if (arg0 == 4) {
			this.anInt476 = arg1.method2375();
		} else if (arg0 == 5) {
			this.anInt466 = arg1.method2375();
		} else if (arg0 == 6) {
			this.anInt468 = arg1.method2334();
		} else if (arg0 == 7) {
			this.anInt474 = arg1.method2375();
		} else if (arg0 == 8) {
			this.anInt483 = arg1.method2375();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIILjava/util/Random;[[III)V")
	private void method321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = this.anInt483 > 0 ? 4096 - Static293.method4280(this.anInt483, arg2) : 4096;
		@Pc(34) int local34 = this.anInt465 * this.anInt474 >> 12;
		@Pc(49) int local49 = this.anInt465 - (local34 > 0 ? Static293.method4280(local34, arg2) : 0);
		if (Static239.anInt4789 <= arg0) {
			arg0 -= Static239.anInt4789;
		}
		@Pc(72) int local72;
		@Pc(96) int local96;
		if (local49 > 0) {
			if (arg4 <= 0 || arg5 <= 0) {
				return;
			}
			local72 = arg5 / 2;
			local96 = arg4 / 2;
			@Pc(148) int local148 = local72 >= local49 ? local49 : local72;
			@Pc(159) int local159 = local96 >= local49 ? local49 : local96;
			@Pc(163) int local163 = arg0 + local148;
			@Pc(170) int local170 = arg5 - local148 * 2;
			for (@Pc(172) int local172 = 0; local172 < arg4; local172++) {
				@Pc(186) int[] local186 = arg3[local172 + arg1];
				@Pc(196) int local196;
				@Pc(204) int local204;
				@Pc(213) int local213;
				if (local172 >= local159) {
					local196 = arg4 - local172 - 1;
					if (local159 > local196) {
						local204 = local18 * local196 / local159;
						@Pc(355) int local355;
						if (this.anInt468 == 0) {
							for (local213 = 0; local213 < local148; local213++) {
								local355 = local18 * local213 / local148;
								local186[arg0 + local213 & Static214.anInt4402] = local186[Static214.anInt4402 & arg5 + arg0 - local213 - 1] = local204 * local355 >> 12;
							}
						} else {
							for (local213 = 0; local213 < local148; local213++) {
								local355 = local18 * local213 / local148;
								local186[local213 + arg0 & Static214.anInt4402] = local186[Static214.anInt4402 & arg5 + arg0 - local213 - 1] = local204 <= local355 ? local204 : local355;
							}
						}
						if (local163 + local170 > Static239.anInt4789) {
							local213 = Static239.anInt4789 - local163;
							Static301.method500(local186, local163, local213, local204);
							Static301.method500(local186, 0, local170 - local213, local204);
						} else {
							Static301.method500(local186, local163, local170, local204);
						}
					} else {
						for (local204 = 0; local204 < local148; local204++) {
							local186[arg0 + local204 & Static214.anInt4402] = local186[Static214.anInt4402 & arg0 + arg5 - local204 - 1] = local204 * local18 / local148;
						}
						if (local170 + local163 > Static239.anInt4789) {
							local204 = Static239.anInt4789 - local163;
							Static301.method500(local186, local163, local204, local18);
							Static301.method500(local186, 0, local170 - local204, local18);
						} else {
							Static301.method500(local186, local163, local170, local18);
						}
					}
				} else {
					local196 = local172 * local18 / local159;
					if (this.anInt468 == 0) {
						for (local204 = 0; local204 < local148; local204++) {
							local213 = local18 * local204 / local148;
							local186[arg0 + local204 & Static214.anInt4402] = local186[arg0 + arg5 - local204 - 1 & Static214.anInt4402] = local213 * local196 >> 12;
						}
					} else {
						for (local204 = 0; local204 < local148; local204++) {
							local213 = local204 * local18 / local148;
							local186[Static214.anInt4402 & arg0 + local204] = local186[Static214.anInt4402 & arg0 + arg5 - local204 - 1] = local196 > local213 ? local213 : local196;
						}
					}
					if (local163 + local170 > Static239.anInt4789) {
						local204 = Static239.anInt4789 - local163;
						Static301.method500(local186, local163, local204, local196);
						Static301.method500(local186, 0, local170 - local204, local196);
					} else {
						Static301.method500(local186, local163, local170, local196);
					}
				}
			}
		} else if (arg5 + arg0 <= Static239.anInt4789) {
			for (local72 = 0; local72 < arg4; local72++) {
				Static301.method500(arg3[arg1 + local72], arg0, arg5, local18);
			}
		} else {
			local72 = Static239.anInt4789 - arg0;
			for (local96 = 0; local96 < arg4; local96++) {
				@Pc(106) int[] local106 = arg3[arg1 + local96];
				Static301.method500(local106, arg0, local72, local18);
				Static301.method500(local106, 0, arg5 - local72, local18);
			}
		}
	}
}
