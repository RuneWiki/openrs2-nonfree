import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub3_Sub37 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
	private int anInt5114;

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
	private int anInt5117 = 819;

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
	private int anInt5115 = 1024;

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
	private int anInt5119 = 1024;

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
	private int anInt5120 = 1024;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
	private int anInt5113 = 409;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
	private int anInt5111 = 1024;

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
	private int anInt5124 = 2048;

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
	private int anInt5126 = 0;

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
	private int anInt5127 = 0;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILjava/util/Random;III[[I)V")
	private void method4004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(15) int local15 = this.anInt5111 <= 0 ? 4096 : 4096 - Static186.method3095(arg2, this.anInt5111);
		@Pc(23) int local23 = this.anInt5114 * this.anInt5119 >> 12;
		@Pc(48) int local48 = this.anInt5114 - (local23 > 0 ? Static186.method3095(arg2, local23) : 0);
		if (arg0 >= Static227.anInt4511) {
			arg0 -= Static227.anInt4511;
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		if (local48 > 0) {
			if (arg3 <= 0 || arg4 <= 0) {
				return;
			}
			local81 = arg4 / 2;
			local85 = arg3 / 2;
			@Pc(96) int local96 = local48 > local81 ? local81 : local48;
			@Pc(107) int local107 = local85 >= local48 ? local48 : local85;
			@Pc(111) int local111 = local96 + arg0;
			@Pc(118) int local118 = arg4 - local96 * 2;
			for (@Pc(120) int local120 = 0; local120 < arg3; local120++) {
				@Pc(133) int[] local133 = arg5[arg1 + local120];
				@Pc(147) int local147;
				@Pc(155) int local155;
				@Pc(168) int local168;
				if (local120 >= local107) {
					local147 = arg3 - local120 - 1;
					if (local147 >= local107) {
						for (local155 = 0; local155 < local96; local155++) {
							local133[local155 + arg0 & Static229.anInt4527] = local133[Static229.anInt4527 & arg0 + arg4 - local155 - 1] = local15 * local155 / local96;
						}
						if (Static227.anInt4511 >= local111 + local118) {
							Static304.method2610(local133, local111, local118, local15);
						} else {
							local155 = Static227.anInt4511 - local111;
							Static304.method2610(local133, local111, local155, local15);
							Static304.method2610(local133, 0, local118 - local155, local15);
						}
					} else {
						local155 = local15 * local147 / local107;
						@Pc(314) int local314;
						if (this.anInt5127 == 0) {
							for (local168 = 0; local168 < local96; local168++) {
								local314 = local168 * local15 / local96;
								local133[Static229.anInt4527 & local168 + arg0] = local133[arg4 + arg0 - local168 - 1 & Static229.anInt4527] = local314 * local155 >> 12;
							}
						} else {
							for (local168 = 0; local168 < local96; local168++) {
								local314 = local15 * local168 / local96;
								local133[Static229.anInt4527 & arg0 + local168] = local133[arg0 + arg4 - local168 - 1 & Static229.anInt4527] = local155 > local314 ? local314 : local155;
							}
						}
						if (local118 + local111 > Static227.anInt4511) {
							local168 = Static227.anInt4511 - local111;
							Static304.method2610(local133, local111, local168, local155);
							Static304.method2610(local133, 0, local118 - local168, local155);
						} else {
							Static304.method2610(local133, local111, local118, local155);
						}
					}
				} else {
					local147 = local15 * local120 / local107;
					if (this.anInt5127 == 0) {
						for (local155 = 0; local155 < local96; local155++) {
							local168 = local155 * local15 / local96;
							local133[Static229.anInt4527 & arg0 + local155] = local133[Static229.anInt4527 & arg4 + arg0 - local155 - 1] = local147 * local168 >> 12;
						}
					} else {
						for (local155 = 0; local155 < local96; local155++) {
							local168 = local155 * local15 / local96;
							local133[Static229.anInt4527 & arg0 + local155] = local133[arg4 + arg0 - local155 - 1 & Static229.anInt4527] = local168 < local147 ? local168 : local147;
						}
					}
					if (Static227.anInt4511 >= local111 + local118) {
						Static304.method2610(local133, local111, local118, local147);
					} else {
						local155 = Static227.anInt4511 - local111;
						Static304.method2610(local133, local111, local155, local147);
						Static304.method2610(local133, 0, local118 - local155, local147);
					}
				}
			}
		} else if (arg4 + arg0 <= Static227.anInt4511) {
			for (local81 = 0; local81 < arg3; local81++) {
				Static304.method2610(arg5[local81 + arg1], arg0, arg4, local15);
			}
		} else {
			local81 = Static227.anInt4511 - arg0;
			for (local85 = 0; local85 < arg3; local85++) {
				@Pc(545) int[] local545 = arg5[arg1 + local85];
				Static304.method2610(local545, arg0, local81, local15);
				Static304.method2610(local545, 0, arg4 - local81, local15);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5126 = arg0.method2690();
		} else if (arg1 == 1) {
			this.anInt5115 = arg0.method2691();
		} else if (arg1 == 2) {
			this.anInt5124 = arg0.method2691();
		} else if (arg1 == 3) {
			this.anInt5113 = arg0.method2691();
		} else if (arg1 == 4) {
			this.anInt5117 = arg0.method2691();
		} else if (arg1 == 5) {
			this.anInt5120 = arg0.method2691();
		} else if (arg1 == 6) {
			this.anInt5127 = arg0.method2690();
		} else if (arg1 == 7) {
			this.anInt5119 = arg0.method2691();
		} else if (arg1 == 8) {
			this.anInt5111 = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass122_41.method3152(arg0);
		if (!this.aClass122_41.aBoolean297) {
			return local11;
		}
		@Pc(21) int[][] local21 = this.aClass122_41.method3153();
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) boolean local31 = true;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(44) int local44 = this.anInt5115 * Static227.anInt4511 >> 12;
		@Pc(46) boolean local46 = true;
		@Pc(53) int local53 = this.anInt5124 * Static227.anInt4511 >> 12;
		@Pc(60) int local60 = this.anInt5117 * Static26.anInt632 >> 12;
		@Pc(67) int local67 = this.anInt5113 * Static26.anInt632 >> 12;
		if (local60 <= 1) {
			return local21[arg0];
		}
		@Pc(82) int local82 = Static227.anInt4511 / local44 + 1;
		this.anInt5114 = Static227.anInt4511 / 8 * this.anInt5120 >> 12;
		@Pc(96) int[][] local96 = new int[local82][3];
		@Pc(100) int[][] local100 = new int[local82][3];
		@Pc(107) Random local107 = new Random((long) this.anInt5126);
		while (true) {
			while (true) {
				@Pc(117) int local117 = local44 + Static186.method3095(local107, local53 - local44);
				@Pc(127) int local127 = local67 + Static186.method3095(local107, local60 - local67);
				@Pc(131) int local131 = local27 + local117;
				if (Static227.anInt4511 < local131) {
					local117 = Static227.anInt4511 - local27;
					local131 = Static227.anInt4511;
				}
				@Pc(161) int local161;
				@Pc(157) int local157;
				if (local46) {
					local161 = 0;
				} else {
					@Pc(146) int local146 = local37;
					@Pc(150) int[] local150 = local100[local37];
					@Pc(155) int local155 = local131 + local25;
					local157 = 0;
					local161 = local150[2];
					if (local155 < 0) {
						local155 += Static227.anInt4511;
					}
					if (Static227.anInt4511 < local155) {
						local155 -= Static227.anInt4511;
					}
					while (true) {
						@Pc(187) int[] local187 = local100[local146];
						if (local155 >= local187[0] && local187[1] >= local155) {
							if (local146 != local37) {
								@Pc(221) int local221 = local25 + local27;
								if (local221 < 0) {
									local221 += Static227.anInt4511;
								}
								if (Static227.anInt4511 < local221) {
									local221 -= Static227.anInt4511;
								}
								@Pc(236) int local236;
								@Pc(247) int[] local247;
								for (local236 = 1; local236 <= local157; local236++) {
									local247 = local100[(local236 + local37) % local33];
									local161 = Math.max(local161, local247[2]);
								}
								for (local236 = 0; local236 <= local157; local236++) {
									local247 = local100[(local236 + local37) % local33];
									@Pc(273) int local273 = local247[2];
									if (local161 != local273) {
										@Pc(284) int local284 = local247[0];
										@Pc(288) int local288 = local247[1];
										@Pc(297) int local297;
										@Pc(299) int local299;
										if (local155 > local221) {
											local297 = Math.max(local221, local284);
											local299 = Math.min(local155, local288);
										} else if (local284 == 0) {
											local297 = 0;
											local299 = Math.min(local155, local288);
										} else {
											local297 = Math.max(local221, local284);
											local299 = Static227.anInt4511;
										}
										this.method4004(local297 + local29, local273, local107, local161 - local273, local299 + -local297, local21);
									}
								}
							}
							local37 = local146;
							break;
						}
						local157++;
						local146++;
						if (local146 >= local33) {
							local146 = 0;
						}
					}
				}
				if (local161 + local127 > Static26.anInt632) {
					local127 = Static26.anInt632 - local161;
				} else {
					local31 = false;
				}
				@Pc(373) int[] local373;
				if (local131 == Static227.anInt4511) {
					this.method4004(local27 + local23, local161, local107, local127, local117, local21);
					if (local31) {
						return local11;
					}
					local31 = true;
					local373 = local96[local35++];
					local33 = local35;
					local46 = false;
					local37 = 0;
					local373[1] = local131;
					local373[2] = local161 + local127;
					local35 = 0;
					@Pc(447) int[][] local447 = local100;
					local373[0] = local27;
					local27 = 0;
					local100 = local96;
					local29 = local23;
					local23 = Static186.method3095(local107, Static227.anInt4511);
					local25 = local23 - local29;
					local96 = local447;
					local157 = local25;
					if (local25 < 0) {
						local157 = local25 + Static227.anInt4511;
					}
					if (local157 > Static227.anInt4511) {
						local157 -= Static227.anInt4511;
					}
					while (true) {
						@Pc(492) int[] local492 = local100[local37];
						if (local157 >= local492[0] && local492[1] >= local157) {
							break;
						}
						@Pc(511) int local511 = ~local33;
						local37++;
						if (local511 >= ~local37) {
							local37 = 0;
						}
					}
				} else {
					local373 = local96[local35++];
					local373[0] = local27;
					local373[2] = local161 + local127;
					local373[1] = local131;
					this.method4004(local27 + local23, local161, local107, local127, local117, local21);
					local27 = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
	}
}
