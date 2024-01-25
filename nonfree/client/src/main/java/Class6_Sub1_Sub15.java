import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class6_Sub1_Sub15 extends Class6_Sub1 {

	@OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
	private int anInt2250;

	@OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
	private int anInt2241 = 819;

	@OriginalMember(owner = "client!hl", name = "U", descriptor = "I")
	private int anInt2252 = 409;

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
	private int anInt2246 = 1024;

	@OriginalMember(owner = "client!hl", name = "V", descriptor = "I")
	private int anInt2253 = 2048;

	@OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
	private int anInt2256 = 1024;

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
	private int anInt2244 = 0;

	@OriginalMember(owner = "client!hl", name = "bb", descriptor = "I")
	private int anInt2259 = 0;

	@OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
	private int anInt2249 = 1024;

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
	private int anInt2242 = 1024;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/util/Random;II[[IIII)V")
	private void method2409(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) int local24 = this.anInt2246 > 0 ? 4096 - Static24.method368(this.anInt2246, arg0) : 4096;
		@Pc(32) int local32 = this.anInt2250 * this.anInt2242 >> 12;
		@Pc(45) int local45 = this.anInt2250 - (local32 > 0 ? Static24.method368(local32, arg0) : 0);
		if (Static299.anInt5659 <= arg4) {
			arg4 -= Static299.anInt5659;
		}
		@Pc(66) int local66;
		@Pc(70) int local70;
		if (local45 > 0) {
			if (arg5 > 0 && arg2 > 0) {
				local66 = arg2 / 2;
				local70 = arg5 / 2;
				@Pc(77) int local77 = local66 < local45 ? local66 : local45;
				@Pc(84) int local84 = local70 < local45 ? local70 : local45;
				@Pc(88) int local88 = arg4 + local77;
				@Pc(95) int local95 = arg2 - local77 * 2;
				for (@Pc(97) int local97 = 0; local97 < arg5; local97++) {
					@Pc(106) int[] local106 = arg3[local97 + arg1];
					@Pc(119) int local119;
					@Pc(124) int local124;
					@Pc(132) int local132;
					if (local97 < local84) {
						local119 = local97 * local24 / local84;
						if (this.anInt2244 == 0) {
							for (local124 = 0; local124 < local77; local124++) {
								local132 = local24 * local124 / local77;
								local106[Static76.anInt2850 & arg4 + local124] = local106[arg4 + arg2 - local124 - 1 & Static76.anInt2850] = local132 * local119 >> 12;
							}
						} else {
							for (local124 = 0; local124 < local77; local124++) {
								local132 = local24 * local124 / local77;
								local106[Static76.anInt2850 & local124 + arg4] = local106[arg4 + arg2 - local124 - 1 & Static76.anInt2850] = local132 < local119 ? local132 : local119;
							}
						}
						if (Static299.anInt5659 < local95 + local88) {
							local124 = Static299.anInt5659 - local88;
							Static358.method955(local106, local88, local124, local119);
							Static358.method955(local106, 0, local95 - local124, local119);
						} else {
							Static358.method955(local106, local88, local95, local119);
						}
					} else {
						local119 = arg5 - local97 - 1;
						if (local84 > local119) {
							local124 = local119 * local24 / local84;
							@Pc(273) int local273;
							if (this.anInt2244 == 0) {
								for (local132 = 0; local132 < local77; local132++) {
									local273 = local132 * local24 / local77;
									local106[Static76.anInt2850 & arg4 + local132] = local106[arg2 + arg4 - local132 - 1 & Static76.anInt2850] = local124 * local273 >> 12;
								}
							} else {
								for (local132 = 0; local132 < local77; local132++) {
									local273 = local24 * local132 / local77;
									local106[local132 + arg4 & Static76.anInt2850] = local106[arg4 + arg2 - local132 - 1 & Static76.anInt2850] = local273 >= local124 ? local124 : local273;
								}
							}
							if (Static299.anInt5659 >= local88 + local95) {
								Static358.method955(local106, local88, local95, local124);
							} else {
								local132 = Static299.anInt5659 - local88;
								Static358.method955(local106, local88, local132, local124);
								Static358.method955(local106, 0, local95 - local132, local124);
							}
						} else {
							for (local124 = 0; local124 < local77; local124++) {
								local106[Static76.anInt2850 & local124 + arg4] = local106[arg2 + arg4 - local124 - 1 & Static76.anInt2850] = local124 * local24 / local77;
							}
							if (Static299.anInt5659 < local95 + local88) {
								local132 = Static299.anInt5659 - local88;
								Static358.method955(local106, local88, local132, local24);
								Static358.method955(local106, 0, local95 - local132, local24);
							} else {
								Static358.method955(local106, local88, local95, local24);
							}
						}
					}
				}
			}
		} else if (arg4 + arg2 <= Static299.anInt5659) {
			for (local66 = 0; local66 < arg5; local66++) {
				Static358.method955(arg3[arg1 + local66], arg4, arg2, local24);
			}
		} else {
			local66 = Static299.anInt5659 - arg4;
			for (local70 = 0; local70 < arg5; local70++) {
				@Pc(494) int[] local494 = arg3[local70 + arg1];
				Static358.method955(local494, arg4, local66, local24);
				Static358.method955(local494, 0, arg2 - local66, local24);
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2259 = arg0.method3972();
		} else if (arg1 == 1) {
			this.anInt2249 = arg0.method4021();
		} else if (arg1 == 2) {
			this.anInt2253 = arg0.method4021();
		} else if (arg1 == 3) {
			this.anInt2252 = arg0.method4021();
		} else if (arg1 == 4) {
			this.anInt2241 = arg0.method4021();
		} else if (arg1 == 5) {
			this.anInt2256 = arg0.method4021();
		} else if (arg1 == 6) {
			this.anInt2244 = arg0.method3972();
		} else if (arg1 == 7) {
			this.anInt2242 = arg0.method4021();
		} else if (arg1 == 8) {
			this.anInt2246 = arg0.method4021();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (!super.aClass140_41.aBoolean287) {
			return local11;
		}
		@Pc(25) int[][] local25 = super.aClass140_41.method3662();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = this.anInt2249 * Static299.anInt5659 >> 12;
		@Pc(57) int local57 = this.anInt2253 * Static299.anInt5659 >> 12;
		@Pc(64) int local64 = Static273.anInt6145 * this.anInt2252 >> 12;
		@Pc(71) int local71 = Static273.anInt6145 * this.anInt2241 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt2250 = Static299.anInt5659 / 8 * this.anInt2256 >> 12;
		@Pc(94) int local94 = Static299.anInt5659 / local50 + 1;
		@Pc(98) int[][] local98 = new int[local94][3];
		@Pc(102) int[][] local102 = new int[local94][3];
		@Pc(109) Random local109 = new Random((long) this.anInt2259);
		while (true) {
			while (true) {
				@Pc(119) int local119 = local50 + Static24.method368(local57 - local50, local109);
				@Pc(129) int local129 = local64 + Static24.method368(local71 - local64, local109);
				@Pc(133) int local133 = local119 + local33;
				if (local133 > Static299.anInt5659) {
					local133 = Static299.anInt5659;
					local119 = Static299.anInt5659 - local33;
				}
				@Pc(151) int local151;
				@Pc(161) int local161;
				if (local39) {
					local151 = 0;
				} else {
					@Pc(155) int local155 = local35;
					@Pc(159) int[] local159 = local102[local35];
					local161 = 0;
					@Pc(166) int local166 = local133 + local27;
					if (local166 < 0) {
						local166 += Static299.anInt5659;
					}
					if (Static299.anInt5659 < local166) {
						local166 -= Static299.anInt5659;
					}
					local151 = local159[2];
					while (true) {
						@Pc(191) int[] local191 = local102[local155];
						if (local191[0] <= local166 && local191[1] >= local166) {
							if (local155 != local35) {
								@Pc(226) int local226 = local33 + local27;
								if (local226 < 0) {
									local226 += Static299.anInt5659;
								}
								if (Static299.anInt5659 < local226) {
									local226 -= Static299.anInt5659;
								}
								for (@Pc(244) int local244 = 1; local244 <= local161; local244++) {
									@Pc(254) int[] local254 = local102[(local244 + local35) % local41];
									local151 = Math.max(local151, local254[2]);
								}
								for (@Pc(270) int local270 = 0; local270 <= local161; local270++) {
									@Pc(280) int[] local280 = local102[(local35 + local270) % local41];
									@Pc(284) int local284 = local280[2];
									if (local151 != local284) {
										@Pc(295) int local295 = local280[0];
										@Pc(299) int local299 = local280[1];
										@Pc(310) int local310;
										@Pc(308) int local308;
										if (local226 < local166) {
											local310 = Math.max(local226, local295);
											local308 = Math.min(local166, local299);
										} else if (local295 == 0) {
											local308 = Math.min(local166, local299);
											local310 = 0;
										} else {
											local310 = Math.max(local226, local295);
											local308 = Static299.anInt5659;
										}
										this.method2409(local109, local284, local308 - local310, local25, local310 + local31, local151 - local284);
									}
								}
							}
							local35 = local155;
							break;
						}
						local155++;
						if (local41 <= local155) {
							local155 = 0;
						}
						local161++;
					}
				}
				if (Static273.anInt6145 < local151 + local129) {
					local129 = Static273.anInt6145 - local151;
				} else {
					local37 = false;
				}
				@Pc(382) int[] local382;
				if (local133 == Static299.anInt5659) {
					this.method2409(local109, local151, local119, local25, local29 + local33, local129);
					if (local37) {
						return local11;
					}
					local37 = true;
					local382 = local98[local43++];
					local382[2] = local151 + local129;
					local382[0] = local33;
					local382[1] = local133;
					@Pc(447) int[][] local447 = local102;
					local102 = local98;
					local98 = local447;
					local41 = local43;
					local31 = local29;
					local43 = 0;
					local29 = Static24.method368(Static299.anInt5659, local109);
					local27 = local29 - local31;
					local33 = 0;
					local161 = local27;
					if (local27 < 0) {
						local161 = local27 + Static299.anInt5659;
					}
					local35 = 0;
					if (Static299.anInt5659 < local161) {
						local161 -= Static299.anInt5659;
					}
					while (true) {
						@Pc(494) int[] local494 = local102[local35];
						if (local494[0] <= local161 && local161 <= local494[1]) {
							local39 = false;
							break;
						}
						local35++;
						if (local35 >= local41) {
							local35 = 0;
						}
					}
				} else {
					local382 = local98[local43++];
					local382[0] = local33;
					local382[1] = local133;
					local382[2] = local151 + local129;
					this.method2409(local109, local151, local119, local25, local29 + local33, local129);
					local33 = local133;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
	}
}
