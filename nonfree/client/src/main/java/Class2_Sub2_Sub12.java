import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
	private int anInt1871;

	@OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
	private int anInt1868 = 819;

	@OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
	private int anInt1866 = 409;

	@OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
	private int anInt1865 = 1024;

	@OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
	private int anInt1867 = 0;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	private int anInt1857 = 1024;

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "I")
	private int anInt1872 = 1024;

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
	private int anInt1858 = 1024;

	@OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
	private int anInt1874 = 2048;

	@OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
	private int anInt1873 = 0;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLjava/util/Random;II[[III)V")
	private void method1931(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt1858 > 0 ? 4096 - Static188.method3700(arg0, this.anInt1858) : 4096;
		@Pc(30) int local30 = this.anInt1871 * this.anInt1872 >> 12;
		@Pc(46) int local46 = this.anInt1871 - (local30 <= 0 ? 0 : Static188.method3700(arg0, local30));
		if (arg4 >= Static339.anInt6735) {
			arg4 -= Static339.anInt6735;
		}
		@Pc(68) int local68;
		@Pc(72) int local72;
		if (local46 > 0) {
			if (arg1 <= 0 || arg5 <= 0) {
				return;
			}
			local68 = arg5 / 2;
			local72 = arg1 / 2;
			@Pc(79) int local79 = local46 > local68 ? local68 : local46;
			@Pc(90) int local90 = local72 < local46 ? local72 : local46;
			@Pc(94) int local94 = local79 + arg4;
			@Pc(101) int local101 = arg5 - local79 * 2;
			for (@Pc(103) int local103 = 0; local103 < arg1; local103++) {
				@Pc(111) int[] local111 = arg3[arg2 + local103];
				@Pc(120) int local120;
				@Pc(128) int local128;
				@Pc(136) int local136;
				if (local103 < local90) {
					local120 = local103 * local22 / local90;
					if (this.anInt1873 == 0) {
						for (local128 = 0; local128 < local79; local128++) {
							local136 = local128 * local22 / local79;
							local111[Static25.anInt1346 & arg4 + local128] = local111[arg5 + arg4 - local128 - 1 & Static25.anInt1346] = local136 * local120 >> 12;
						}
					} else {
						for (local128 = 0; local128 < local79; local128++) {
							local136 = local22 * local128 / local79;
							local111[Static25.anInt1346 & local128 + arg4] = local111[Static25.anInt1346 & arg5 + arg4 - local128 - 1] = local120 <= local136 ? local120 : local136;
						}
					}
					if (local101 + local94 > Static339.anInt6735) {
						local128 = Static339.anInt6735 - local94;
						Static359.method685(local111, local94, local128, local120);
						Static359.method685(local111, 0, local101 - local128, local120);
					} else {
						Static359.method685(local111, local94, local101, local120);
					}
				} else {
					local120 = arg1 - local103 - 1;
					if (local90 > local120) {
						local128 = local120 * local22 / local90;
						@Pc(274) int local274;
						if (this.anInt1873 == 0) {
							for (local136 = 0; local136 < local79; local136++) {
								local274 = local22 * local136 / local79;
								local111[Static25.anInt1346 & local136 + arg4] = local111[Static25.anInt1346 & arg4 + arg5 - local136 - 1] = local274 * local128 >> 12;
							}
						} else {
							for (local136 = 0; local136 < local79; local136++) {
								local274 = local136 * local22 / local79;
								local111[local136 + arg4 & Static25.anInt1346] = local111[Static25.anInt1346 & arg4 + arg5 - local136 - 1] = local128 <= local274 ? local128 : local274;
							}
						}
						if (Static339.anInt6735 < local101 + local94) {
							local136 = Static339.anInt6735 - local94;
							Static359.method685(local111, local94, local136, local128);
							Static359.method685(local111, 0, local101 - local136, local128);
						} else {
							Static359.method685(local111, local94, local101, local128);
						}
					} else {
						for (local128 = 0; local128 < local79; local128++) {
							local111[arg4 + local128 & Static25.anInt1346] = local111[arg5 + arg4 - local128 - 1 & Static25.anInt1346] = local128 * local22 / local79;
						}
						if (Static339.anInt6735 >= local94 + local101) {
							Static359.method685(local111, local94, local101, local22);
						} else {
							local136 = Static339.anInt6735 - local94;
							Static359.method685(local111, local94, local136, local22);
							Static359.method685(local111, 0, local101 - local136, local22);
						}
					}
				}
			}
		} else if (Static339.anInt6735 < arg5 + arg4) {
			local68 = Static339.anInt6735 - arg4;
			for (local72 = 0; local72 < arg1; local72++) {
				@Pc(493) int[] local493 = arg3[arg2 + local72];
				Static359.method685(local493, arg4, local68, local22);
				Static359.method685(local493, 0, arg5 - local68, local22);
			}
		} else {
			for (local68 = 0; local68 < arg1; local68++) {
				Static359.method685(arg3[local68 + arg2], arg4, arg5, local22);
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt1867 = arg1.method4421();
		} else if (arg0 == 1) {
			this.anInt1865 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt1874 = arg1.method4464();
		} else if (arg0 == 3) {
			this.anInt1866 = arg1.method4464();
		} else if (arg0 == 4) {
			this.anInt1868 = arg1.method4464();
		} else if (arg0 == 5) {
			this.anInt1857 = arg1.method4464();
		} else if (arg0 == 6) {
			this.anInt1873 = arg1.method4421();
		} else if (arg0 == 7) {
			this.anInt1872 = arg1.method4464();
		} else if (arg0 == 8) {
			this.anInt1858 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (!super.aClass137_41.aBoolean369) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass137_41.method3808();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static339.anInt6735 * this.anInt1865 >> 12;
		@Pc(52) int local52 = this.anInt1874 * Static339.anInt6735 >> 12;
		@Pc(59) int local59 = this.anInt1866 * Static84.anInt1830 >> 12;
		@Pc(66) int local66 = this.anInt1868 * Static84.anInt1830 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt1871 = Static339.anInt6735 / 8 * this.anInt1857 >> 12;
		@Pc(91) int local91 = Static339.anInt6735 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt1867);
		while (true) {
			while (true) {
				@Pc(118) int local118 = Static188.method3700(local106, local52 - local45) + local45;
				@Pc(128) int local128 = local59 + Static188.method3700(local106, local66 - local59);
				@Pc(132) int local132 = local118 + local28;
				if (local132 > Static339.anInt6735) {
					local118 = Static339.anInt6735 - local28;
					local132 = Static339.anInt6735;
				}
				@Pc(209) int local209;
				@Pc(149) int local149;
				@Pc(159) int local159;
				if (local34) {
					local149 = 0;
				} else {
					@Pc(153) int local153 = local30;
					@Pc(157) int[] local157 = local99[local30];
					local159 = 0;
					@Pc(164) int local164 = local132 + local22;
					if (local164 < 0) {
						local164 += Static339.anInt6735;
					}
					if (local164 > Static339.anInt6735) {
						local164 -= Static339.anInt6735;
					}
					local149 = local157[2];
					while (true) {
						@Pc(188) int[] local188 = local99[local153];
						if (local188[0] <= local164 && local164 <= local188[1]) {
							if (local30 != local153) {
								@Pc(226) int local226 = local22 + local28;
								if (local226 < 0) {
									local226 += Static339.anInt6735;
								}
								if (local226 > Static339.anInt6735) {
									local226 -= Static339.anInt6735;
								}
								for (@Pc(248) int local248 = 1; local248 <= local159; local248++) {
									@Pc(258) int[] local258 = local99[(local30 + local248) % local36];
									local149 = Math.max(local149, local258[2]);
								}
								for (@Pc(274) int local274 = 0; local274 <= local159; local274++) {
									@Pc(285) int[] local285 = local99[(local30 + local274) % local36];
									@Pc(289) int local289 = local285[2];
									if (local289 != local149) {
										@Pc(296) int local296 = local285[0];
										@Pc(300) int local300 = local285[1];
										@Pc(311) int local311;
										@Pc(315) int local315;
										if (local226 < local164) {
											local311 = Math.max(local226, local296);
											local315 = Math.min(local164, local300);
										} else if (local296 == 0) {
											local311 = 0;
											local315 = Math.min(local164, local300);
										} else {
											local311 = Math.max(local226, local296);
											local315 = Static339.anInt6735;
										}
										this.method1931(local106, local149 - local289, local289, local20, local26 + local311, -local311 + local315);
									}
								}
							}
							local30 = local153;
							break;
						}
						local209 = ~local36;
						local153++;
						if (local209 >= ~local153) {
							local153 = 0;
						}
						local159++;
					}
				}
				if (local149 + local128 > Static84.anInt1830) {
					local128 = Static84.anInt1830 - local149;
				} else {
					local32 = false;
				}
				@Pc(386) int[] local386;
				if (Static339.anInt6735 == local132) {
					this.method1931(local106, local128, local149, local20, local24 + local28, local118);
					if (local32) {
						return local11;
					}
					local32 = true;
					local386 = local95[local38++];
					local386[1] = local132;
					local386[2] = local149 + local128;
					local386[0] = local28;
					@Pc(453) int[][] local453 = local99;
					local99 = local95;
					local95 = local453;
					local36 = local38;
					local38 = 0;
					local26 = local24;
					local24 = Static188.method3700(local106, Static339.anInt6735);
					local28 = 0;
					local22 = local24 - local26;
					local159 = local22;
					if (local22 < 0) {
						local159 = local22 + Static339.anInt6735;
					}
					local30 = 0;
					if (local159 > Static339.anInt6735) {
						local159 -= Static339.anInt6735;
					}
					while (true) {
						@Pc(500) int[] local500 = local99[local30];
						if (local500[0] <= local159 && local500[1] >= local159) {
							local34 = false;
							break;
						}
						local209 = ~local36;
						local30++;
						if (local209 >= ~local30) {
							local30 = 0;
						}
					}
				} else {
					local386 = local95[local38++];
					local386[1] = local132;
					local386[2] = local149 + local128;
					local386[0] = local28;
					this.method1931(local106, local128, local149, local20, local24 + local28, local118);
					local28 = local132;
				}
			}
		}
	}
}
