import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class3_Sub2_Sub13 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hf", name = "tb", descriptor = "I")
	private int anInt1562;

	@OriginalMember(owner = "client!hf", name = "gb", descriptor = "I")
	private int anInt1551 = 0;

	@OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
	private int anInt1548 = 1024;

	@OriginalMember(owner = "client!hf", name = "fb", descriptor = "I")
	private int anInt1550 = 409;

	@OriginalMember(owner = "client!hf", name = "nb", descriptor = "I")
	private int anInt1557 = 1024;

	@OriginalMember(owner = "client!hf", name = "hb", descriptor = "I")
	private int anInt1552 = 1024;

	@OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
	private int anInt1549 = 819;

	@OriginalMember(owner = "client!hf", name = "kb", descriptor = "I")
	private int anInt1554 = 1024;

	@OriginalMember(owner = "client!hf", name = "pb", descriptor = "I")
	private int anInt1559 = 0;

	@OriginalMember(owner = "client!hf", name = "sb", descriptor = "I")
	private int anInt1561 = 2048;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass2_41.method9(arg0);
		if (!super.aClass2_41.aBoolean2) {
			return local15;
		}
		@Pc(28) int[][] local28 = super.aClass2_41.method11();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = Static190.anInt3865 * this.anInt1548 >> 12;
		@Pc(53) int local53 = 0;
		@Pc(60) int local60 = this.anInt1561 * Static190.anInt3865 >> 12;
		@Pc(67) int local67 = this.anInt1549 * Static97.anInt2014 >> 12;
		@Pc(74) int local74 = Static97.anInt2014 * this.anInt1550 >> 12;
		if (local67 <= 1) {
			return local28[arg0];
		}
		this.anInt1562 = Static190.anInt3865 / 8 * this.anInt1557 >> 12;
		@Pc(99) int local99 = Static190.anInt3865 / local51 + 1;
		@Pc(103) int[][] local103 = new int[local99][3];
		@Pc(107) int[][] local107 = new int[local99][3];
		@Pc(114) Random local114 = new Random((long) this.anInt1551);
		while (true) {
			while (true) {
				@Pc(124) int local124 = Static13.method273(local114, local60 - local51) + local51;
				@Pc(134) int local134 = local74 + Static13.method273(local114, local67 - local74);
				@Pc(138) int local138 = local38 + local124;
				if (Static190.anInt3865 < local138) {
					local124 = Static190.anInt3865 - local38;
					local138 = Static190.anInt3865;
				}
				@Pc(152) int local152;
				@Pc(162) int local162;
				if (local42) {
					local152 = 0;
				} else {
					@Pc(156) int local156 = local36;
					@Pc(160) int[] local160 = local107[local36];
					local162 = 0;
					@Pc(167) int local167 = local138 + local30;
					if (local167 < 0) {
						local167 += Static190.anInt3865;
					}
					if (Static190.anInt3865 < local167) {
						local167 -= Static190.anInt3865;
					}
					while (true) {
						@Pc(184) int[] local184 = local107[local156];
						if (local167 >= local184[0] && local184[1] >= local167) {
							local152 = local160[2];
							if (local36 != local156) {
								@Pc(222) int local222 = local30 + local38;
								if (local222 < 0) {
									local222 += Static190.anInt3865;
								}
								if (local222 > Static190.anInt3865) {
									local222 -= Static190.anInt3865;
								}
								for (@Pc(244) int local244 = 1; local244 <= local162; local244++) {
									@Pc(255) int[] local255 = local107[(local36 + local244) % local44];
									local152 = Math.max(local152, local255[2]);
								}
								for (@Pc(271) int local271 = 0; local271 <= local162; local271++) {
									@Pc(282) int[] local282 = local107[(local36 + local271) % local44];
									@Pc(286) int local286 = local282[2];
									if (local152 != local286) {
										@Pc(293) int local293 = local282[0];
										@Pc(297) int local297 = local282[1];
										@Pc(313) int local313;
										@Pc(315) int local315;
										if (local167 > local222) {
											local313 = Math.max(local222, local293);
											local315 = Math.min(local167, local297);
										} else if (local293 == 0) {
											local315 = Math.min(local167, local297);
											local313 = 0;
										} else {
											local313 = Math.max(local222, local293);
											local315 = Static190.anInt3865;
										}
										this.method1145(local152 - local286, -local313 + local315, local28, local114, local313 + local34, local286);
									}
								}
							}
							local36 = local156;
							break;
						}
						local156++;
						if (local156 >= local44) {
							local156 = 0;
						}
						local162++;
					}
				}
				if (Static97.anInt2014 >= local134 + local152) {
					local40 = false;
				} else {
					local134 = Static97.anInt2014 - local152;
				}
				@Pc(409) int[] local409;
				if (local138 == Static190.anInt3865) {
					this.method1145(local134, local124, local28, local114, local38 + local32, local152);
					if (local40) {
						return local15;
					}
					local42 = false;
					local34 = local32;
					local40 = true;
					@Pc(400) int[][] local400 = local107;
					local107 = local103;
					local36 = 0;
					local409 = local103[local53++];
					local103 = local400;
					local44 = local53;
					local409[2] = local152 + local134;
					local409[0] = local38;
					local409[1] = local138;
					local32 = Static13.method273(local114, Static190.anInt3865);
					local38 = 0;
					local53 = 0;
					local30 = local32 - local34;
					local162 = local30;
					if (local30 < 0) {
						local162 = local30 + Static190.anInt3865;
					}
					if (local162 > Static190.anInt3865) {
						local162 -= Static190.anInt3865;
					}
					while (true) {
						@Pc(464) int[] local464 = local107[local36];
						if (local464[0] <= local162 && local464[1] >= local162) {
							break;
						}
						local36++;
						if (local36 >= local44) {
							local36 = 0;
						}
					}
				} else {
					local409 = local103[local53++];
					local409[1] = local138;
					local409[0] = local38;
					local409[2] = local152 + local134;
					this.method1145(local134, local124, local28, local114, local38 + local32, local152);
					local38 = local138;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1551 = arg0.method1278();
		} else if (arg1 == 1) {
			this.anInt1548 = arg0.method1270();
		} else if (arg1 == 2) {
			this.anInt1561 = arg0.method1270();
		} else if (arg1 == 3) {
			this.anInt1550 = arg0.method1270();
		} else if (arg1 == 4) {
			this.anInt1549 = arg0.method1270();
		} else if (arg1 == 5) {
			this.anInt1557 = arg0.method1270();
		} else if (arg1 == 6) {
			this.anInt1559 = arg0.method1278();
		} else if (arg1 == 7) {
			this.anInt1554 = arg0.method1270();
		} else if (arg1 == 8) {
			this.anInt1552 = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II[[IBLjava/util/Random;II)V")
	private void method1145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(27) int local27 = this.anInt1552 > 0 ? 4096 - Static13.method273(arg3, this.anInt1552) : 4096;
		@Pc(35) int local35 = this.anInt1554 * this.anInt1562 >> 12;
		@Pc(48) int local48 = this.anInt1562 - (local35 > 0 ? Static13.method273(arg3, local35) : 0);
		if (arg4 >= Static190.anInt3865) {
			arg4 -= Static190.anInt3865;
		}
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (local48 <= 0) {
			if (Static190.anInt3865 < arg4 + arg1) {
				local73 = Static190.anInt3865 - arg4;
				for (local75 = 0; local75 < arg0; local75++) {
					@Pc(83) int[] local83 = arg2[local75 + arg5];
					Static218.method2015(local83, arg4, local73, local27);
					Static218.method2015(local83, 0, arg1 - local73, local27);
				}
			} else {
				for (local73 = 0; local73 < arg0; local73++) {
					Static218.method2015(arg2[arg5 + local73], arg4, arg1, local27);
				}
			}
		} else if (arg0 > 0 && arg1 > 0) {
			local73 = arg1 / 2;
			local75 = arg0 / 2;
			@Pc(146) int local146 = local75 < local48 ? local75 : local48;
			@Pc(157) int local157 = local73 >= local48 ? local48 : local73;
			@Pc(164) int local164 = arg1 - local157 * 2;
			@Pc(168) int local168 = arg4 + local157;
			for (@Pc(170) int local170 = 0; local170 < arg0; local170++) {
				@Pc(178) int[] local178 = arg2[arg5 + local170];
				@Pc(187) int local187;
				@Pc(195) int local195;
				@Pc(203) int local203;
				if (local146 > local170) {
					local187 = local170 * local27 / local146;
					if (this.anInt1559 == 0) {
						for (local195 = 0; local195 < local157; local195++) {
							local203 = local27 * local195 / local157;
							local178[arg4 + local195 & Static134.anInt2681] = local178[arg1 + arg4 - local195 - 1 & Static134.anInt2681] = local203 * local187 >> 12;
						}
					} else {
						for (local195 = 0; local195 < local157; local195++) {
							local203 = local195 * local27 / local157;
							local178[Static134.anInt2681 & arg4 + local195] = local178[Static134.anInt2681 & arg1 + arg4 - local195 - 1] = local187 > local203 ? local203 : local187;
						}
					}
					if (local168 + local164 <= Static190.anInt3865) {
						Static218.method2015(local178, local168, local164, local187);
					} else {
						local195 = Static190.anInt3865 - local168;
						Static218.method2015(local178, local168, local195, local187);
						Static218.method2015(local178, 0, local164 - local195, local187);
					}
				} else {
					local187 = arg0 - local170 - 1;
					if (local187 < local146) {
						local195 = local27 * local187 / local146;
						@Pc(348) int local348;
						if (this.anInt1559 == 0) {
							for (local203 = 0; local203 < local157; local203++) {
								local348 = local27 * local203 / local157;
								local178[local203 + arg4 & Static134.anInt2681] = local178[Static134.anInt2681 & arg4 + arg1 - local203 - 1] = local195 * local348 >> 12;
							}
						} else {
							for (local203 = 0; local203 < local157; local203++) {
								local348 = local27 * local203 / local157;
								local178[Static134.anInt2681 & arg4 + local203] = local178[arg1 + arg4 - local203 - 1 & Static134.anInt2681] = local195 <= local348 ? local195 : local348;
							}
						}
						if (Static190.anInt3865 < local164 + local168) {
							local203 = Static190.anInt3865 - local168;
							Static218.method2015(local178, local168, local203, local195);
							Static218.method2015(local178, 0, local164 - local203, local195);
						} else {
							Static218.method2015(local178, local168, local164, local195);
						}
					} else {
						for (local195 = 0; local195 < local157; local195++) {
							local178[Static134.anInt2681 & arg4 + local195] = local178[arg4 + arg1 - local195 - 1 & Static134.anInt2681] = local195 * local27 / local157;
						}
						if (Static190.anInt3865 >= local164 + local168) {
							Static218.method2015(local178, local168, local164, local27);
						} else {
							local203 = Static190.anInt3865 - local168;
							Static218.method2015(local178, local168, local203, local27);
							Static218.method2015(local178, 0, local164 - local203, local27);
						}
					}
				}
			}
		}
	}
}
