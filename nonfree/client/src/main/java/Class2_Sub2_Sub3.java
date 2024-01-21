import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "I")
	private int anInt477 = 409;

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
	private int anInt468 = 0;

	@OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
	private int anInt483 = 0;

	@OriginalMember(owner = "client!bc", name = "ib", descriptor = "I")
	private int anInt482 = 2048;

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
	private int anInt471 = 1024;

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
	private int anInt474 = 1024;

	@OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
	private int anInt481 = 1024;

	@OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
	private int anInt480 = 1024;

	@OriginalMember(owner = "client!bc", name = "ob", descriptor = "I")
	private int anInt487 = 819;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass57_41.method2569(arg0);
		if (!super.aClass57_41.aBoolean122) {
			return local7;
		}
		@Pc(25) int[][] local25 = super.aClass57_41.method2572();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(44) int local44 = Static106.anInt3045 * this.anInt481 >> 12;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(55) int local55 = this.anInt477 * Static57.anInt1795 >> 12;
		@Pc(57) boolean local57 = true;
		@Pc(64) int local64 = this.anInt482 * Static106.anInt3045 >> 12;
		@Pc(71) int local71 = this.anInt487 * Static57.anInt1795 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt467 = this.anInt474 * (Static106.anInt3045 / 8) >> 12;
		@Pc(97) int local97 = Static106.anInt3045 / local44 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt468);
		while (true) {
			while (true) {
				@Pc(122) int local122 = local44 + Static183.method3421(local112, local64 - local44);
				@Pc(132) int local132 = Static183.method3421(local112, local71 - local55) + local55;
				@Pc(136) int local136 = local122 + local31;
				if (local136 > Static106.anInt3045) {
					local136 = Static106.anInt3045;
					local122 = Static106.anInt3045 - local31;
				}
				@Pc(189) int local189;
				@Pc(174) int local174;
				if (local57) {
					local189 = 0;
				} else {
					@Pc(154) int local154 = local35;
					@Pc(159) int local159 = local136 + local27;
					if (local159 < 0) {
						local159 += Static106.anInt3045;
					}
					@Pc(172) int[] local172 = local105[local35];
					local174 = 0;
					if (Static106.anInt3045 < local159) {
						local159 -= Static106.anInt3045;
					}
					local189 = local172[2];
					while (true) {
						@Pc(193) int[] local193 = local105[local154];
						if (local159 >= local193[0] && local193[1] >= local159) {
							if (local35 != local154) {
								@Pc(227) int local227 = local27 + local31;
								if (local227 < 0) {
									local227 += Static106.anInt3045;
								}
								if (Static106.anInt3045 < local227) {
									local227 -= Static106.anInt3045;
								}
								for (@Pc(245) int local245 = 1; local245 <= local174; local245++) {
									@Pc(255) int[] local255 = local105[(local245 + local35) % local48];
									local189 = Math.max(local189, local255[2]);
								}
								for (@Pc(267) int local267 = 0; local267 <= local174; local267++) {
									@Pc(277) int[] local277 = local105[(local267 + local35) % local48];
									@Pc(281) int local281 = local277[2];
									if (local281 != local189) {
										@Pc(288) int local288 = local277[0];
										@Pc(292) int local292 = local277[1];
										@Pc(304) int local304;
										@Pc(306) int local306;
										if (local227 < local159) {
											local304 = Math.max(local227, local288);
											local306 = Math.min(local159, local292);
										} else if (local288 == 0) {
											local306 = Math.min(local159, local292);
											local304 = 0;
										} else {
											local304 = Math.max(local227, local288);
											local306 = Static106.anInt3045;
										}
										this.method378(local112, local189 - local281, local281, local25, local33 + local304, local306 + -local304);
									}
								}
							}
							local35 = local154;
							break;
						}
						local154++;
						if (local154 >= local48) {
							local154 = 0;
						}
						local174++;
					}
				}
				if (Static57.anInt1795 < local132 + local189) {
					local132 = Static57.anInt1795 - local189;
				} else {
					local37 = false;
				}
				@Pc(375) int[] local375;
				if (Static106.anInt3045 == local136) {
					this.method378(local112, local132, local189, local25, local31 + local29, local122);
					if (local37) {
						return local7;
					}
					local35 = 0;
					local37 = true;
					local33 = local29;
					@Pc(427) int[][] local427 = local105;
					local375 = local101[local46++];
					local375[1] = local136;
					local105 = local101;
					local375[0] = local31;
					local375[2] = local189 + local132;
					local101 = local427;
					local57 = false;
					local48 = local46;
					local31 = 0;
					local46 = 0;
					local29 = Static183.method3421(local112, Static106.anInt3045);
					local27 = local29 - local33;
					local174 = local27;
					if (local27 < 0) {
						local174 = local27 + Static106.anInt3045;
					}
					if (local174 > Static106.anInt3045) {
						local174 -= Static106.anInt3045;
					}
					while (true) {
						@Pc(491) int[] local491 = local105[local35];
						if (local491[0] <= local174 && local491[1] >= local174) {
							break;
						}
						local35++;
						if (local48 <= local35) {
							local35 = 0;
						}
					}
				} else {
					local375 = local101[local46++];
					local375[0] = local31;
					local375[2] = local189 + local132;
					local375[1] = local136;
					this.method378(local112, local132, local189, local25, local29 + local31, local122);
					local31 = local136;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt468 = arg1.method218();
		} else if (arg0 == 1) {
			this.anInt481 = arg1.method234();
		} else if (arg0 == 2) {
			this.anInt482 = arg1.method234();
		} else if (arg0 == 3) {
			this.anInt477 = arg1.method234();
		} else if (arg0 == 4) {
			this.anInt487 = arg1.method234();
		} else if (arg0 == 5) {
			this.anInt474 = arg1.method234();
		} else if (arg0 == 6) {
			this.anInt483 = arg1.method218();
		} else if (arg0 == 7) {
			this.anInt471 = arg1.method234();
		} else if (arg0 == 8) {
			this.anInt480 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/util/Random;II[[IIBI)V")
	private void method378(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = this.anInt480 > 0 ? 4096 - Static183.method3421(arg0, this.anInt480) : 4096;
		@Pc(26) int local26 = this.anInt467 * this.anInt471 >> 12;
		@Pc(49) int local49 = this.anInt467 - (local26 <= 0 ? 0 : Static183.method3421(arg0, local26));
		if (arg4 >= Static106.anInt3045) {
			arg4 -= Static106.anInt3045;
		}
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local49 > 0) {
			if (arg1 > 0 && arg5 > 0) {
				local67 = arg5 / 2;
				local71 = arg1 / 2;
				@Pc(82) int local82 = local67 >= local49 ? local49 : local67;
				@Pc(86) int local86 = local82 + arg4;
				@Pc(97) int local97 = local49 > local71 ? local71 : local49;
				@Pc(104) int local104 = arg5 - local82 * 2;
				for (@Pc(106) int local106 = 0; local106 < arg1; local106++) {
					@Pc(114) int[] local114 = arg3[arg2 + local106];
					@Pc(123) int local123;
					@Pc(128) int local128;
					@Pc(136) int local136;
					if (local106 < local97) {
						local123 = local18 * local106 / local97;
						if (this.anInt483 == 0) {
							for (local128 = 0; local128 < local82; local128++) {
								local136 = local128 * local18 / local82;
								local114[local128 + arg4 & Static96.anInt3099] = local114[arg4 + arg5 - local128 - 1 & Static96.anInt3099] = local136 * local123 >> 12;
							}
						} else {
							for (local128 = 0; local128 < local82; local128++) {
								local136 = local18 * local128 / local82;
								local114[arg4 + local128 & Static96.anInt3099] = local114[Static96.anInt3099 & arg5 + arg4 - local128 - 1] = local136 < local123 ? local136 : local123;
							}
						}
						if (Static106.anInt3045 < local104 + local86) {
							local128 = Static106.anInt3045 - local86;
							Static203.method2768(local114, local86, local128, local123);
							Static203.method2768(local114, 0, local104 - local128, local123);
						} else {
							Static203.method2768(local114, local86, local104, local123);
						}
					} else {
						local123 = arg1 - local106 - 1;
						if (local97 > local123) {
							local128 = local18 * local123 / local97;
							@Pc(279) int local279;
							if (this.anInt483 == 0) {
								for (local136 = 0; local136 < local82; local136++) {
									local279 = local136 * local18 / local82;
									local114[Static96.anInt3099 & arg4 + local136] = local114[Static96.anInt3099 & arg5 + arg4 - local136 - 1] = local128 * local279 >> 12;
								}
							} else {
								for (local136 = 0; local136 < local82; local136++) {
									local279 = local18 * local136 / local82;
									local114[local136 + arg4 & Static96.anInt3099] = local114[arg5 + arg4 - local136 - 1 & Static96.anInt3099] = local128 <= local279 ? local128 : local279;
								}
							}
							if (Static106.anInt3045 >= local104 + local86) {
								Static203.method2768(local114, local86, local104, local128);
							} else {
								local136 = Static106.anInt3045 - local86;
								Static203.method2768(local114, local86, local136, local128);
								Static203.method2768(local114, 0, local104 - local136, local128);
							}
						} else {
							for (local128 = 0; local128 < local82; local128++) {
								local114[arg4 + local128 & Static96.anInt3099] = local114[arg5 + arg4 - local128 - 1 & Static96.anInt3099] = local128 * local18 / local82;
							}
							if (local104 + local86 <= Static106.anInt3045) {
								Static203.method2768(local114, local86, local104, local18);
							} else {
								local136 = Static106.anInt3045 - local86;
								Static203.method2768(local114, local86, local136, local18);
								Static203.method2768(local114, 0, local104 - local136, local18);
							}
						}
					}
				}
			}
		} else if (Static106.anInt3045 >= arg4 + arg5) {
			for (local67 = 0; local67 < arg1; local67++) {
				Static203.method2768(arg3[local67 + arg2], arg4, arg5, local18);
			}
		} else {
			local67 = Static106.anInt3045 - arg4;
			for (local71 = 0; local71 < arg1; local71++) {
				@Pc(512) int[] local512 = arg3[local71 + arg2];
				Static203.method2768(local512, arg4, local67, local18);
				Static203.method2768(local512, 0, arg5 - local67, local18);
			}
		}
	}
}
