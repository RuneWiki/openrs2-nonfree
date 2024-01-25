import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
	private int anInt2157;

	@OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
	private int anInt2155 = 819;

	@OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
	private int anInt2150 = 0;

	@OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
	private int anInt2151 = 1024;

	@OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
	private int anInt2159 = 1024;

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
	private int anInt2158 = 1024;

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
	private int anInt2148 = 1024;

	@OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
	private int anInt2147 = 2048;

	@OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
	private int anInt2160 = 409;

	@OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
	private int anInt2153 = 0;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (!super.aClass74_41.aBoolean145) {
			return local11;
		}
		@Pc(25) int[][] local25 = super.aClass74_41.method1352();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = Static158.anInt2658 * this.anInt2151 >> 12;
		@Pc(57) int local57 = Static158.anInt2658 * this.anInt2147 >> 12;
		@Pc(64) int local64 = Static91.anInt1665 * this.anInt2160 >> 12;
		@Pc(71) int local71 = this.anInt2155 * Static91.anInt1665 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt2157 = Static158.anInt2658 / 8 * this.anInt2159 >> 12;
		@Pc(94) int local94 = Static158.anInt2658 / local50 + 1;
		@Pc(98) int[][] local98 = new int[local94][3];
		@Pc(102) int[][] local102 = new int[local94][3];
		@Pc(109) Random local109 = new Random((long) this.anInt2153);
		while (true) {
			while (true) {
				@Pc(119) int local119 = Static351.method4927(local57 - local50, local109) + local50;
				@Pc(128) int local128 = Static351.method4927(local71 - local64, local109) + local64;
				@Pc(133) int local133 = local33 + local119;
				if (Static158.anInt2658 < local133) {
					local133 = Static158.anInt2658;
					local119 = Static158.anInt2658 - local33;
				}
				@Pc(147) int local147;
				@Pc(157) int local157;
				if (local39) {
					local147 = 0;
				} else {
					@Pc(151) int local151 = local35;
					@Pc(155) int[] local155 = local102[local35];
					local157 = 0;
					@Pc(162) int local162 = local133 + local27;
					if (local162 < 0) {
						local162 += Static158.anInt2658;
					}
					if (local162 > Static158.anInt2658) {
						local162 -= Static158.anInt2658;
					}
					while (true) {
						@Pc(179) int[] local179 = local102[local151];
						if (local179[0] <= local162 && local179[1] >= local162) {
							local147 = local155[2];
							if (local151 != local35) {
								@Pc(217) int local217 = local33 + local27;
								if (local217 < 0) {
									local217 += Static158.anInt2658;
								}
								if (Static158.anInt2658 < local217) {
									local217 -= Static158.anInt2658;
								}
								for (@Pc(232) int local232 = 1; local232 <= local157; local232++) {
									@Pc(242) int[] local242 = local102[(local232 + local35) % local41];
									local147 = Math.max(local147, local242[2]);
								}
								for (@Pc(258) int local258 = 0; local258 <= local157; local258++) {
									@Pc(269) int[] local269 = local102[(local35 + local258) % local41];
									@Pc(273) int local273 = local269[2];
									if (local273 != local147) {
										@Pc(280) int local280 = local269[0];
										@Pc(284) int local284 = local269[1];
										@Pc(300) int local300;
										@Pc(302) int local302;
										if (local162 > local217) {
											local300 = Math.max(local217, local280);
											local302 = Math.min(local162, local284);
										} else if (local280 == 0) {
											local302 = Math.min(local162, local284);
											local300 = 0;
										} else {
											local300 = Math.max(local217, local280);
											local302 = Static158.anInt2658;
										}
										this.method1773(local31 + local300, local302 + -local300, local273, local147 - local273, local25, local109);
									}
								}
							}
							local35 = local151;
							break;
						}
						local151++;
						if (local41 <= local151) {
							local151 = 0;
						}
						local157++;
					}
				}
				if (Static91.anInt1665 < local128 + local147) {
					local128 = Static91.anInt1665 - local147;
				} else {
					local37 = false;
				}
				@Pc(377) int[] local377;
				if (local133 == Static158.anInt2658) {
					this.method1773(local33 + local29, local119, local147, local128, local25, local109);
					if (local37) {
						return local11;
					}
					local37 = true;
					local377 = local98[local43++];
					local377[1] = local133;
					local377[0] = local33;
					local377[2] = local147 + local128;
					@Pc(443) int[][] local443 = local102;
					local102 = local98;
					local41 = local43;
					local98 = local443;
					local43 = 0;
					local31 = local29;
					local29 = Static351.method4927(Static158.anInt2658, local109);
					local33 = 0;
					local27 = local29 - local31;
					local157 = local27;
					if (local27 < 0) {
						local157 = local27 + Static158.anInt2658;
					}
					local35 = 0;
					if (local157 > Static158.anInt2658) {
						local157 -= Static158.anInt2658;
					}
					while (true) {
						@Pc(490) int[] local490 = local102[local35];
						if (local490[0] <= local157 && local157 <= local490[1]) {
							local39 = false;
							break;
						}
						local35++;
						if (local35 >= local41) {
							local35 = 0;
						}
					}
				} else {
					local377 = local98[local43++];
					local377[0] = local33;
					local377[2] = local147 + local128;
					local377[1] = local133;
					this.method1773(local33 + local29, local119, local147, local128, local25, local109);
					local33 = local133;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIBI[[ILjava/util/Random;)V")
	private void method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Random arg5) {
		@Pc(28) int local28 = this.anInt2158 > 0 ? 4096 - Static351.method4927(this.anInt2158, arg5) : 4096;
		@Pc(36) int local36 = this.anInt2157 * this.anInt2148 >> 12;
		@Pc(52) int local52 = this.anInt2157 - (local36 > 0 ? Static351.method4927(local36, arg5) : 0);
		if (Static158.anInt2658 <= arg0) {
			arg0 -= Static158.anInt2658;
		}
		@Pc(68) int local68;
		@Pc(91) int local91;
		if (local52 <= 0) {
			if (arg1 + arg0 <= Static158.anInt2658) {
				for (local68 = 0; local68 < arg3; local68++) {
					Static404.method4340(arg4[local68 + arg2], arg0, arg1, local28);
				}
			} else {
				local68 = Static158.anInt2658 - arg0;
				for (local91 = 0; local91 < arg3; local91++) {
					@Pc(99) int[] local99 = arg4[arg2 + local91];
					Static404.method4340(local99, arg0, local68, local28);
					Static404.method4340(local99, 0, arg1 - local68, local28);
				}
			}
		} else if (arg3 > 0 && arg1 > 0) {
			local68 = arg1 / 2;
			local91 = arg3 / 2;
			@Pc(137) int local137 = local68 < local52 ? local68 : local52;
			@Pc(144) int local144 = local91 >= local52 ? local52 : local91;
			@Pc(148) int local148 = arg0 + local137;
			@Pc(155) int local155 = arg1 - local137 * 2;
			for (@Pc(157) int local157 = 0; local157 < arg3; local157++) {
				@Pc(165) int[] local165 = arg4[arg2 + local157];
				@Pc(178) int local178;
				@Pc(186) int local186;
				@Pc(194) int local194;
				if (local144 > local157) {
					local178 = local28 * local157 / local144;
					if (this.anInt2150 == 0) {
						for (local186 = 0; local186 < local137; local186++) {
							local194 = local186 * local28 / local137;
							local165[arg0 + local186 & Static271.anInt4721] = local165[Static271.anInt4721 & arg0 + arg1 - local186 - 1] = local194 * local178 >> 12;
						}
					} else {
						for (local186 = 0; local186 < local137; local186++) {
							local194 = local28 * local186 / local137;
							local165[local186 + arg0 & Static271.anInt4721] = local165[arg1 + arg0 - local186 - 1 & Static271.anInt4721] = local178 > local194 ? local194 : local178;
						}
					}
					if (Static158.anInt2658 < local155 + local148) {
						local186 = Static158.anInt2658 - local148;
						Static404.method4340(local165, local148, local186, local178);
						Static404.method4340(local165, 0, local155 - local186, local178);
					} else {
						Static404.method4340(local165, local148, local155, local178);
					}
				} else {
					local178 = arg3 - local157 - 1;
					if (local144 > local178) {
						local186 = local28 * local178 / local144;
						@Pc(330) int local330;
						if (this.anInt2150 == 0) {
							for (local194 = 0; local194 < local137; local194++) {
								local330 = local28 * local194 / local137;
								local165[Static271.anInt4721 & arg0 + local194] = local165[Static271.anInt4721 & arg1 + arg0 - local194 - 1] = local330 * local186 >> 12;
							}
						} else {
							for (local194 = 0; local194 < local137; local194++) {
								local330 = local194 * local28 / local137;
								local165[Static271.anInt4721 & arg0 + local194] = local165[arg1 + arg0 - local194 - 1 & Static271.anInt4721] = local186 > local330 ? local330 : local186;
							}
						}
						if (Static158.anInt2658 < local155 + local148) {
							local194 = Static158.anInt2658 - local148;
							Static404.method4340(local165, local148, local194, local186);
							Static404.method4340(local165, 0, local155 - local194, local186);
						} else {
							Static404.method4340(local165, local148, local155, local186);
						}
					} else {
						for (local186 = 0; local186 < local137; local186++) {
							local165[Static271.anInt4721 & local186 + arg0] = local165[Static271.anInt4721 & arg1 + arg0 - local186 - 1] = local186 * local28 / local137;
						}
						if (local155 + local148 > Static158.anInt2658) {
							local194 = Static158.anInt2658 - local148;
							Static404.method4340(local165, local148, local194, local28);
							Static404.method4340(local165, 0, local155 - local194, local28);
						} else {
							Static404.method4340(local165, local148, local155, local28);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt2153 = arg1.method5174();
		} else if (arg0 == 1) {
			this.anInt2151 = arg1.method5177();
		} else if (arg0 == 2) {
			this.anInt2147 = arg1.method5177();
		} else if (arg0 == 3) {
			this.anInt2160 = arg1.method5177();
		} else if (arg0 == 4) {
			this.anInt2155 = arg1.method5177();
		} else if (arg0 == 5) {
			this.anInt2159 = arg1.method5177();
		} else if (arg0 == 6) {
			this.anInt2150 = arg1.method5174();
		} else if (arg0 == 7) {
			this.anInt2148 = arg1.method5177();
		} else if (arg0 == 8) {
			this.anInt2158 = arg1.method5177();
		}
	}
}
