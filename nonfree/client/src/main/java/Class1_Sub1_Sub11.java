import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
	private int anInt1551;

	@OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
	private int anInt1545 = 2048;

	@OriginalMember(owner = "client!fi", name = "db", descriptor = "I")
	private int anInt1554 = 409;

	@OriginalMember(owner = "client!fi", name = "hb", descriptor = "I")
	private int anInt1558 = 1024;

	@OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
	private int anInt1544 = 0;

	@OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
	private int anInt1557 = 1024;

	@OriginalMember(owner = "client!fi", name = "fb", descriptor = "I")
	private int anInt1556 = 819;

	@OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
	private int anInt1541 = 1024;

	@OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
	private int anInt1555 = 0;

	@OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
	private int anInt1546 = 1024;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/util/Random;II[[III)V")
	private void method1324(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt1541 > 0 ? 4096 - Static14.method284(this.anInt1541, arg0) : 4096;
		@Pc(27) int local27 = this.anInt1551 * this.anInt1558 >> 12;
		@Pc(40) int local40 = this.anInt1551 - (local27 > 0 ? Static14.method284(local27, arg0) : 0);
		if (arg2 >= Static131.anInt2513) {
			arg2 -= Static131.anInt2513;
		}
		@Pc(74) int local74;
		@Pc(76) int local76;
		if (local40 > 0) {
			if (arg5 <= 0 || arg1 <= 0) {
				return;
			}
			local74 = arg1 / 2;
			local76 = arg5 / 2;
			@Pc(157) int local157 = local40 <= local76 ? local40 : local76;
			@Pc(164) int local164 = local74 >= local40 ? local40 : local74;
			@Pc(168) int local168 = local164 + arg2;
			@Pc(174) int local174 = arg1 - local164 * 2;
			for (@Pc(176) int local176 = 0; local176 < arg5; local176++) {
				@Pc(189) int[] local189 = arg3[arg4 + local176];
				@Pc(203) int local203;
				@Pc(209) int local209;
				@Pc(218) int local218;
				if (local157 <= local176) {
					local203 = arg5 - local176 - 1;
					if (local203 < local157) {
						local209 = local203 * local19 / local157;
						@Pc(360) int local360;
						if (this.anInt1555 == 0) {
							for (local218 = 0; local218 < local164; local218++) {
								local360 = local19 * local218 / local164;
								local189[Static11.anInt321 & local218 + arg2] = local189[Static11.anInt321 & arg1 + arg2 - local218 - 1] = local209 * local360 >> 12;
							}
						} else {
							for (local218 = 0; local218 < local164; local218++) {
								local360 = local19 * local218 / local164;
								local189[arg2 + local218 & Static11.anInt321] = local189[Static11.anInt321 & arg1 + arg2 - local218 - 1] = local209 <= local360 ? local209 : local360;
							}
						}
						if (local174 + local168 > Static131.anInt2513) {
							local218 = Static131.anInt2513 - local168;
							Static300.method487(local189, local168, local218, local209);
							Static300.method487(local189, 0, local174 - local218, local209);
						} else {
							Static300.method487(local189, local168, local174, local209);
						}
					} else {
						for (local209 = 0; local209 < local164; local209++) {
							local189[arg2 + local209 & Static11.anInt321] = local189[Static11.anInt321 & arg1 + arg2 - local209 - 1] = local209 * local19 / local164;
						}
						if (local174 + local168 <= Static131.anInt2513) {
							Static300.method487(local189, local168, local174, local19);
						} else {
							local209 = Static131.anInt2513 - local168;
							Static300.method487(local189, local168, local209, local19);
							Static300.method487(local189, 0, local174 - local209, local19);
						}
					}
				} else {
					local203 = local176 * local19 / local157;
					if (this.anInt1555 == 0) {
						for (local209 = 0; local209 < local164; local209++) {
							local218 = local209 * local19 / local164;
							local189[local209 + arg2 & Static11.anInt321] = local189[arg2 + arg1 - local209 - 1 & Static11.anInt321] = local218 * local203 >> 12;
						}
					} else {
						for (local209 = 0; local209 < local164; local209++) {
							local218 = local209 * local19 / local164;
							local189[Static11.anInt321 & arg2 + local209] = local189[arg2 + arg1 - local209 - 1 & Static11.anInt321] = local218 >= local203 ? local203 : local218;
						}
					}
					if (Static131.anInt2513 >= local174 + local168) {
						Static300.method487(local189, local168, local174, local203);
					} else {
						local209 = Static131.anInt2513 - local168;
						Static300.method487(local189, local168, local209, local203);
						Static300.method487(local189, 0, local174 - local209, local203);
					}
				}
			}
		} else if (Static131.anInt2513 < arg2 + arg1) {
			local74 = Static131.anInt2513 - arg2;
			for (local76 = 0; local76 < arg5; local76++) {
				@Pc(89) int[] local89 = arg3[local76 + arg4];
				Static300.method487(local89, arg2, local74, local19);
				Static300.method487(local89, 0, arg1 - local74, local19);
			}
		} else {
			for (local74 = 0; local74 < arg5; local74++) {
				Static300.method487(arg3[local74 + arg4], arg2, arg1, local19);
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass176_41.method4469(arg0);
		if (!this.aClass176_41.aBoolean437) {
			return local7;
		}
		@Pc(35) int[][] local35 = this.aClass176_41.method4470();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(47) boolean local47 = true;
		@Pc(49) boolean local49 = true;
		@Pc(51) int local51 = 0;
		@Pc(53) int local53 = 0;
		@Pc(60) int local60 = this.anInt1557 * Static131.anInt2513 >> 12;
		@Pc(67) int local67 = this.anInt1545 * Static131.anInt2513 >> 12;
		@Pc(74) int local74 = Static219.anInt4483 * this.anInt1554 >> 12;
		@Pc(81) int local81 = Static219.anInt4483 * this.anInt1556 >> 12;
		if (local81 <= 1) {
			return local35[arg0];
		}
		this.anInt1551 = this.anInt1546 * (Static131.anInt2513 / 8) >> 12;
		@Pc(107) int local107 = Static131.anInt2513 / local60 + 1;
		@Pc(111) int[][] local111 = new int[local107][3];
		@Pc(115) int[][] local115 = new int[local107][3];
		@Pc(122) Random local122 = new Random((long) this.anInt1544);
		while (true) {
			while (true) {
				@Pc(132) int local132 = local60 + Static14.method284(local67 - local60, local122);
				@Pc(142) int local142 = local74 + Static14.method284(local81 - local74, local122);
				@Pc(147) int local147 = local43 + local132;
				if (local147 > Static131.anInt2513) {
					local147 = Static131.anInt2513;
					local132 = Static131.anInt2513 - local43;
				}
				@Pc(169) int local169;
				@Pc(171) int local171;
				if (local47) {
					local169 = 0;
				} else {
					@Pc(161) int local161 = local45;
					@Pc(165) int[] local165 = local115[local45];
					local169 = local165[2];
					local171 = 0;
					@Pc(175) int local175 = local37 + local147;
					if (local175 < 0) {
						local175 += Static131.anInt2513;
					}
					if (Static131.anInt2513 < local175) {
						local175 -= Static131.anInt2513;
					}
					while (true) {
						@Pc(197) int[] local197 = local115[local161];
						if (local197[0] <= local175 && local197[1] >= local175) {
							if (local45 != local161) {
								@Pc(237) int local237 = local43 + local37;
								if (local237 < 0) {
									local237 += Static131.anInt2513;
								}
								if (Static131.anInt2513 < local237) {
									local237 -= Static131.anInt2513;
								}
								@Pc(258) int local258;
								@Pc(269) int[] local269;
								for (local258 = 1; local258 <= local171; local258++) {
									local269 = local115[(local258 + local45) % local53];
									local169 = Math.max(local169, local269[2]);
								}
								for (local258 = 0; local258 <= local171; local258++) {
									local269 = local115[(local258 + local45) % local53];
									@Pc(299) int local299 = local269[2];
									if (local299 != local169) {
										@Pc(311) int local311 = local269[0];
										@Pc(315) int local315 = local269[1];
										@Pc(322) int local322;
										@Pc(326) int local326;
										if (local175 > local237) {
											local322 = Math.max(local237, local311);
											local326 = Math.min(local175, local315);
										} else if (local311 == 0) {
											local326 = Math.min(local175, local315);
											local322 = 0;
										} else {
											local322 = Math.max(local237, local311);
											local326 = Static131.anInt2513;
										}
										this.method1324(local122, local326 - local322, local322 + local41, local35, local299, local169 - local299);
									}
								}
							}
							local45 = local161;
							break;
						}
						local171++;
						local161++;
						if (local161 >= local53) {
							local161 = 0;
						}
					}
				}
				if (Static219.anInt4483 >= local169 + local142) {
					local49 = false;
				} else {
					local142 = Static219.anInt4483 - local169;
				}
				@Pc(423) int[] local423;
				if (local147 == Static131.anInt2513) {
					this.method1324(local122, local132, local43 + local39, local35, local169, local142);
					if (local49) {
						return local7;
					}
					local41 = local39;
					local47 = false;
					local49 = true;
					local45 = 0;
					local423 = local111[local51++];
					local423[1] = local147;
					local423[2] = local142 + local169;
					@Pc(435) int[][] local435 = local115;
					local53 = local51;
					local115 = local111;
					local423[0] = local43;
					local111 = local435;
					local51 = 0;
					local43 = 0;
					local39 = Static14.method284(Static131.anInt2513, local122);
					local37 = local39 - local41;
					local171 = local37;
					if (local37 < 0) {
						local171 = local37 + Static131.anInt2513;
					}
					if (Static131.anInt2513 < local171) {
						local171 -= Static131.anInt2513;
					}
					while (true) {
						@Pc(483) int[] local483 = local115[local45];
						if (local483[0] <= local171 && local171 <= local483[1]) {
							break;
						}
						local45++;
						if (local53 <= local45) {
							local45 = 0;
						}
					}
				} else {
					local423 = local111[local51++];
					local423[1] = local147;
					local423[0] = local43;
					local423[2] = local142 + local169;
					this.method1324(local122, local132, local39 + local43, local35, local169, local142);
					local43 = local147;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1544 = arg0.method3122();
		} else if (arg1 == 1) {
			this.anInt1557 = arg0.method3107();
		} else if (arg1 == 2) {
			this.anInt1545 = arg0.method3107();
		} else if (arg1 == 3) {
			this.anInt1554 = arg0.method3107();
		} else if (arg1 == 4) {
			this.anInt1556 = arg0.method3107();
		} else if (arg1 == 5) {
			this.anInt1546 = arg0.method3107();
		} else if (arg1 == 6) {
			this.anInt1555 = arg0.method3122();
		} else if (arg1 == 7) {
			this.anInt1558 = arg0.method3107();
		} else if (arg1 == 8) {
			this.anInt1541 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
	}
}
