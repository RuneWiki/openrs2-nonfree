import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class1_Sub5_Sub19 extends Class1_Sub5 {

	@OriginalMember(owner = "client!nq", name = "lb", descriptor = "I")
	public static int lb = -2;

	@OriginalMember(owner = "client!nq", name = "U", descriptor = "I")
	private int anInt4360;

	@OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
	private int anInt4356 = 1024;

	@OriginalMember(owner = "client!nq", name = "Z", descriptor = "I")
	private int anInt4365 = 409;

	@OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
	private int anInt4353 = 0;

	@OriginalMember(owner = "client!nq", name = "W", descriptor = "I")
	private int anInt4362 = 1024;

	@OriginalMember(owner = "client!nq", name = "fb", descriptor = "I")
	private int anInt4371 = 0;

	@OriginalMember(owner = "client!nq", name = "hb", descriptor = "I")
	private int anInt4373 = 1024;

	@OriginalMember(owner = "client!nq", name = "jb", descriptor = "I")
	private int anInt4375 = 2048;

	@OriginalMember(owner = "client!nq", name = "gb", descriptor = "I")
	private int anInt4372 = 819;

	@OriginalMember(owner = "client!nq", name = "ib", descriptor = "I")
	private int anInt4374 = 1024;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass214_41.method5651(arg0);
		if (!super.aClass214_41.aBoolean544) {
			return local15;
		}
		@Pc(24) int[][] local24 = super.aClass214_41.method5647();
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = true;
		@Pc(38) boolean local38 = true;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49 = Static75.anInt1566 * this.anInt4373 >> 12;
		@Pc(56) int local56 = Static75.anInt1566 * this.anInt4375 >> 12;
		@Pc(63) int local63 = this.anInt4365 * Static129.anInt2574 >> 12;
		@Pc(70) int local70 = Static129.anInt2574 * this.anInt4372 >> 12;
		if (local70 <= 1) {
			return local24[arg0];
		}
		this.anInt4360 = this.anInt4362 * (Static75.anInt1566 / 8) >> 12;
		@Pc(95) int local95 = Static75.anInt1566 / local49 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt4353);
		while (true) {
			while (true) {
				@Pc(122) int local122 = Static304.method5274(local110, local56 - local49) + local49;
				@Pc(133) int local133 = Static304.method5274(local110, local70 - local63) + local63;
				@Pc(137) int local137 = local122 + local32;
				if (Static75.anInt1566 < local137) {
					local122 = Static75.anInt1566 - local32;
					local137 = Static75.anInt1566;
				}
				@Pc(177) int local177;
				@Pc(156) int local156;
				if (local38) {
					local177 = 0;
				} else {
					@Pc(150) int local150 = local34;
					@Pc(154) int[] local154 = local103[local34];
					local156 = 0;
					@Pc(160) int local160 = local26 + local137;
					if (local160 < 0) {
						local160 += Static75.anInt1566;
					}
					if (Static75.anInt1566 < local160) {
						local160 -= Static75.anInt1566;
					}
					local177 = local154[2];
					while (true) {
						@Pc(181) int[] local181 = local103[local150];
						if (local160 >= local181[0] && local181[1] >= local160) {
							if (local150 != local34) {
								@Pc(219) int local219 = local32 + local26;
								if (local219 < 0) {
									local219 += Static75.anInt1566;
								}
								if (local219 > Static75.anInt1566) {
									local219 -= Static75.anInt1566;
								}
								for (@Pc(234) int local234 = 1; local234 <= local156; local234++) {
									@Pc(245) int[] local245 = local103[(local34 + local234) % local40];
									local177 = Math.max(local177, local245[2]);
								}
								for (@Pc(257) int local257 = 0; local257 <= local156; local257++) {
									@Pc(267) int[] local267 = local103[(local34 + local257) % local40];
									@Pc(271) int local271 = local267[2];
									if (local271 != local177) {
										@Pc(278) int local278 = local267[0];
										@Pc(282) int local282 = local267[1];
										@Pc(289) int local289;
										@Pc(293) int local293;
										if (local160 > local219) {
											local289 = Math.max(local219, local278);
											local293 = Math.min(local160, local282);
										} else if (local278 == 0) {
											local293 = Math.min(local160, local282);
											local289 = 0;
										} else {
											local289 = Math.max(local219, local278);
											local293 = Static75.anInt1566;
										}
										this.method3733(local110, local177 - local271, local293 + -local289, local24, local30 + local289, local271);
									}
								}
							}
							local34 = local150;
							break;
						}
						local156++;
						local150++;
						if (local150 >= local40) {
							local150 = 0;
						}
					}
				}
				if (local177 + local133 > Static129.anInt2574) {
					local133 = Static129.anInt2574 - local177;
				} else {
					local36 = false;
				}
				@Pc(364) int[] local364;
				if (local137 == Static75.anInt1566) {
					this.method3733(local110, local133, local122, local24, local28 + local32, local177);
					if (local36) {
						return local15;
					}
					local36 = true;
					local364 = local99[local42++];
					local364[0] = local32;
					local364[1] = local137;
					local364[2] = local177 + local133;
					@Pc(430) int[][] local430 = local103;
					local103 = local99;
					local99 = local430;
					local40 = local42;
					local30 = local28;
					local42 = 0;
					local28 = Static304.method5274(local110, Static75.anInt1566);
					local26 = local28 - local30;
					local32 = 0;
					local156 = local26;
					if (local26 < 0) {
						local156 = local26 + Static75.anInt1566;
					}
					local34 = 0;
					if (Static75.anInt1566 < local156) {
						local156 -= Static75.anInt1566;
					}
					while (true) {
						@Pc(476) int[] local476 = local103[local34];
						if (local476[0] <= local156 && local156 <= local476[1]) {
							local38 = false;
							break;
						}
						local34++;
						if (local34 >= local40) {
							local34 = 0;
						}
					}
				} else {
					local364 = local99[local42++];
					local364[2] = local177 + local133;
					local364[0] = local32;
					local364[1] = local137;
					this.method3733(local110, local133, local122, local24, local28 + local32, local177);
					local32 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/util/Random;II[[IIBI)V")
	private void method3733(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21 = this.anInt4374 <= 0 ? 4096 : 4096 - Static304.method5274(arg0, this.anInt4374);
		@Pc(33) int local33 = this.anInt4356 * this.anInt4360 >> 12;
		@Pc(46) int local46 = this.anInt4360 - (local33 > 0 ? Static304.method5274(arg0, local33) : 0);
		if (arg4 >= Static75.anInt1566) {
			arg4 -= Static75.anInt1566;
		}
		@Pc(77) int local77;
		@Pc(81) int local81;
		if (local46 > 0) {
			if (arg1 > 0 && arg2 > 0) {
				local77 = arg2 / 2;
				local81 = arg1 / 2;
				@Pc(92) int local92 = local77 < local46 ? local77 : local46;
				@Pc(103) int local103 = local81 < local46 ? local81 : local46;
				@Pc(108) int local108 = arg4 + local92;
				@Pc(115) int local115 = arg2 - local92 * 2;
				for (@Pc(117) int local117 = 0; local117 < arg1; local117++) {
					@Pc(125) int[] local125 = arg3[arg5 + local117];
					@Pc(134) int local134;
					@Pc(139) int local139;
					@Pc(147) int local147;
					if (local103 > local117) {
						local134 = local21 * local117 / local103;
						if (this.anInt4371 == 0) {
							for (local139 = 0; local139 < local92; local139++) {
								local147 = local21 * local139 / local92;
								local125[local139 + arg4 & Static239.anInt2816] = local125[Static239.anInt2816 & arg4 + arg2 - local139 - 1] = local134 * local147 >> 12;
							}
						} else {
							for (local139 = 0; local139 < local92; local139++) {
								local147 = local21 * local139 / local92;
								local125[Static239.anInt2816 & arg4 + local139] = local125[Static239.anInt2816 & arg4 + arg2 - local139 - 1] = local134 > local147 ? local147 : local134;
							}
						}
						if (local108 + local115 <= Static75.anInt1566) {
							Static361.method1852(local125, local108, local115, local134);
						} else {
							local139 = Static75.anInt1566 - local108;
							Static361.method1852(local125, local108, local139, local134);
							Static361.method1852(local125, 0, local115 - local139, local134);
						}
					} else {
						local134 = arg1 - local117 - 1;
						if (local103 > local134) {
							local139 = local21 * local134 / local103;
							@Pc(300) int local300;
							if (this.anInt4371 == 0) {
								for (local147 = 0; local147 < local92; local147++) {
									local300 = local21 * local147 / local92;
									local125[Static239.anInt2816 & arg4 + local147] = local125[arg2 + arg4 - local147 - 1 & Static239.anInt2816] = local300 * local139 >> 12;
								}
							} else {
								for (local147 = 0; local147 < local92; local147++) {
									local300 = local147 * local21 / local92;
									local125[Static239.anInt2816 & local147 + arg4] = local125[Static239.anInt2816 & arg4 + arg2 - local147 - 1] = local139 > local300 ? local300 : local139;
								}
							}
							if (local108 + local115 > Static75.anInt1566) {
								local147 = Static75.anInt1566 - local108;
								Static361.method1852(local125, local108, local147, local139);
								Static361.method1852(local125, 0, local115 - local147, local139);
							} else {
								Static361.method1852(local125, local108, local115, local139);
							}
						} else {
							for (local139 = 0; local139 < local92; local139++) {
								local125[local139 + arg4 & Static239.anInt2816] = local125[arg4 + arg2 - local139 - 1 & Static239.anInt2816] = local139 * local21 / local92;
							}
							if (Static75.anInt1566 >= local115 + local108) {
								Static361.method1852(local125, local108, local115, local21);
							} else {
								local147 = Static75.anInt1566 - local108;
								Static361.method1852(local125, local108, local147, local21);
								Static361.method1852(local125, 0, local115 - local147, local21);
							}
						}
					}
				}
			}
		} else if (arg2 + arg4 <= Static75.anInt1566) {
			for (local77 = 0; local77 < arg1; local77++) {
				Static361.method1852(arg3[arg5 + local77], arg4, arg2, local21);
			}
		} else {
			local77 = Static75.anInt1566 - arg4;
			for (local81 = 0; local81 < arg1; local81++) {
				@Pc(529) int[] local529 = arg3[arg5 + local81];
				Static361.method1852(local529, arg4, local77, local21);
				Static361.method1852(local529, 0, arg2 - local77, local21);
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4353 = arg0.method5720();
		} else if (arg1 == 1) {
			this.anInt4373 = arg0.method5715();
		} else if (arg1 == 2) {
			this.anInt4375 = arg0.method5715();
		} else if (arg1 == 3) {
			this.anInt4365 = arg0.method5715();
		} else if (arg1 == 4) {
			this.anInt4372 = arg0.method5715();
		} else if (arg1 == 5) {
			this.anInt4362 = arg0.method5715();
		} else if (arg1 == 6) {
			this.anInt4371 = arg0.method5720();
		} else if (arg1 == 7) {
			this.anInt4356 = arg0.method5715();
		} else if (arg1 == 8) {
			this.anInt4374 = arg0.method5715();
		}
	}
}
