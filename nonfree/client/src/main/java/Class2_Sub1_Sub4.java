import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
	private int anInt1549;

	@OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
	private int anInt1538 = 0;

	@OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
	private int anInt1537 = 1024;

	@OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
	private int anInt1539 = 819;

	@OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
	private int anInt1542 = 0;

	@OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
	private int anInt1541 = 1024;

	@OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
	private int anInt1544 = 2048;

	@OriginalMember(owner = "client!dj", name = "eb", descriptor = "I")
	private int anInt1552 = 1024;

	@OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
	private int anInt1546 = 409;

	@OriginalMember(owner = "client!dj", name = "gb", descriptor = "I")
	private int anInt1554 = 1024;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass156_41.method3899(arg0);
		if (!super.aClass156_41.aBoolean318) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass156_41.method3898();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt1537 * Static391.anInt7118 >> 12;
		@Pc(58) int local58 = Static391.anInt7118 * this.anInt1544 >> 12;
		@Pc(65) int local65 = Static299.anInt5583 * this.anInt1546 >> 12;
		@Pc(72) int local72 = this.anInt1539 * Static299.anInt5583 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt1549 = Static391.anInt7118 / 8 * this.anInt1554 >> 12;
		@Pc(95) int local95 = Static391.anInt7118 / local51 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt1538);
		while (true) {
			while (true) {
				@Pc(120) int local120 = Static371.method5907(local58 - local51, local110) + local51;
				@Pc(131) int local131 = local65 + Static371.method5907(local72 - local65, local110);
				@Pc(135) int local135 = local120 + local34;
				if (local135 > Static391.anInt7118) {
					local120 = Static391.anInt7118 - local34;
					local135 = Static391.anInt7118;
				}
				@Pc(149) int local149;
				@Pc(159) int local159;
				if (local40) {
					local149 = 0;
				} else {
					@Pc(153) int local153 = local36;
					@Pc(157) int[] local157 = local103[local36];
					local159 = 0;
					@Pc(163) int local163 = local135 + local28;
					if (local163 < 0) {
						local163 += Static391.anInt7118;
					}
					if (Static391.anInt7118 < local163) {
						local163 -= Static391.anInt7118;
					}
					local149 = local157[2];
					while (true) {
						@Pc(184) int[] local184 = local103[local153];
						if (local184[0] <= local163 && local163 <= local184[1]) {
							if (local153 != local36) {
								@Pc(214) int local214 = local34 + local28;
								if (local214 < 0) {
									local214 += Static391.anInt7118;
								}
								if (Static391.anInt7118 < local214) {
									local214 -= Static391.anInt7118;
								}
								for (@Pc(232) int local232 = 1; local232 <= local159; local232++) {
									@Pc(242) int[] local242 = local103[(local232 + local36) % local42];
									local149 = Math.max(local149, local242[2]);
								}
								for (@Pc(254) int local254 = 0; local254 <= local159; local254++) {
									@Pc(264) int[] local264 = local103[(local36 + local254) % local42];
									@Pc(268) int local268 = local264[2];
									if (local149 != local268) {
										@Pc(279) int local279 = local264[0];
										@Pc(283) int local283 = local264[1];
										@Pc(301) int local301;
										@Pc(299) int local299;
										if (local163 > local214) {
											local301 = Math.max(local214, local279);
											local299 = Math.min(local163, local283);
										} else if (local279 == 0) {
											local299 = Math.min(local163, local283);
											local301 = 0;
										} else {
											local301 = Math.max(local214, local279);
											local299 = Static391.anInt7118;
										}
										this.method1255(local268, local299 - local301, local32 + local301, local149 - local268, local110, local26);
									}
								}
							}
							local36 = local153;
							break;
						}
						local159++;
						@Pc(198) int local198 = ~local42;
						local153++;
						if (local198 >= ~local153) {
							local153 = 0;
						}
					}
				}
				if (Static299.anInt5583 >= local149 + local131) {
					local38 = false;
				} else {
					local131 = Static299.anInt5583 - local149;
				}
				@Pc(381) int[] local381;
				if (Static391.anInt7118 == local135) {
					this.method1255(local149, local120, local30 + local34, local131, local110, local26);
					if (local38) {
						return local17;
					}
					local38 = true;
					local381 = local99[local44++];
					local381[0] = local34;
					local381[2] = local131 + local149;
					local381[1] = local135;
					@Pc(397) int[][] local397 = local103;
					local103 = local99;
					local99 = local397;
					local42 = local44;
					local44 = 0;
					local32 = local30;
					local30 = Static371.method5907(Static391.anInt7118, local110);
					local28 = local30 - local32;
					local34 = 0;
					local159 = local28;
					if (local28 < 0) {
						local159 = local28 + Static391.anInt7118;
					}
					if (local159 > Static391.anInt7118) {
						local159 -= Static391.anInt7118;
					}
					local36 = 0;
					local40 = false;
					while (true) {
						@Pc(445) int[] local445 = local103[local36];
						if (local445[0] <= local159 && local445[1] >= local159) {
							break;
						}
						local36++;
						if (local42 <= local36) {
							local36 = 0;
						}
					}
				} else {
					local381 = local99[local44++];
					local381[2] = local149 + local131;
					local381[0] = local34;
					local381[1] = local135;
					this.method1255(local149, local120, local34 + local30, local131, local110, local26);
					local34 = local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIBLjava/util/Random;[[I)V")
	private void method1255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(18) int local18 = this.anInt1552 <= 0 ? 4096 : 4096 - Static371.method5907(this.anInt1552, arg4);
		@Pc(26) int local26 = this.anInt1549 * this.anInt1541 >> 12;
		@Pc(44) int local44 = this.anInt1549 - (local26 <= 0 ? 0 : Static371.method5907(local26, arg4));
		if (arg2 >= Static391.anInt7118) {
			arg2 -= Static391.anInt7118;
		}
		@Pc(72) int local72;
		@Pc(74) int local74;
		if (local44 <= 0) {
			if (arg1 + arg2 > Static391.anInt7118) {
				local72 = Static391.anInt7118 - arg2;
				for (local74 = 0; local74 < arg3; local74++) {
					@Pc(82) int[] local82 = arg5[local74 + arg0];
					Static394.method2439(local82, arg2, local72, local18);
					Static394.method2439(local82, 0, arg1 - local72, local18);
				}
			} else {
				for (local72 = 0; local72 < arg3; local72++) {
					Static394.method2439(arg5[arg0 + local72], arg2, arg1, local18);
				}
			}
		} else if (arg3 > 0 && arg1 > 0) {
			local72 = arg1 / 2;
			local74 = arg3 / 2;
			@Pc(157) int local157 = local44 <= local72 ? local44 : local72;
			@Pc(164) int local164 = local44 <= local74 ? local44 : local74;
			@Pc(168) int local168 = arg2 + local157;
			@Pc(175) int local175 = arg1 - local157 * 2;
			for (@Pc(177) int local177 = 0; local177 < arg3; local177++) {
				@Pc(185) int[] local185 = arg5[local177 + arg0];
				@Pc(194) int local194;
				@Pc(199) int local199;
				@Pc(207) int local207;
				if (local164 > local177) {
					local194 = local177 * local18 / local164;
					if (this.anInt1542 == 0) {
						for (local199 = 0; local199 < local157; local199++) {
							local207 = local199 * local18 / local157;
							local185[Static235.anInt4676 & local199 + arg2] = local185[Static235.anInt4676 & arg1 + arg2 - local199 - 1] = local194 * local207 >> 12;
						}
					} else {
						for (local199 = 0; local199 < local157; local199++) {
							local207 = local18 * local199 / local157;
							local185[local199 + arg2 & Static235.anInt4676] = local185[Static235.anInt4676 & arg1 + arg2 - local199 - 1] = local194 <= local207 ? local194 : local207;
						}
					}
					if (local175 + local168 <= Static391.anInt7118) {
						Static394.method2439(local185, local168, local175, local194);
					} else {
						local199 = Static391.anInt7118 - local168;
						Static394.method2439(local185, local168, local199, local194);
						Static394.method2439(local185, 0, local175 - local199, local194);
					}
				} else {
					local194 = arg3 - local177 - 1;
					if (local194 < local164) {
						local199 = local194 * local18 / local164;
						@Pc(358) int local358;
						if (this.anInt1542 == 0) {
							for (local207 = 0; local207 < local157; local207++) {
								local358 = local207 * local18 / local157;
								local185[arg2 + local207 & Static235.anInt4676] = local185[Static235.anInt4676 & arg2 + arg1 - local207 - 1] = local199 * local358 >> 12;
							}
						} else {
							for (local207 = 0; local207 < local157; local207++) {
								local358 = local18 * local207 / local157;
								local185[Static235.anInt4676 & local207 + arg2] = local185[arg2 + arg1 - local207 - 1 & Static235.anInt4676] = local358 < local199 ? local358 : local199;
							}
						}
						if (Static391.anInt7118 < local175 + local168) {
							local207 = Static391.anInt7118 - local168;
							Static394.method2439(local185, local168, local207, local199);
							Static394.method2439(local185, 0, local175 - local207, local199);
						} else {
							Static394.method2439(local185, local168, local175, local199);
						}
					} else {
						for (local199 = 0; local199 < local157; local199++) {
							local185[local199 + arg2 & Static235.anInt4676] = local185[Static235.anInt4676 & arg2 + arg1 - local199 - 1] = local199 * local18 / local157;
						}
						if (Static391.anInt7118 < local175 + local168) {
							local207 = Static391.anInt7118 - local168;
							Static394.method2439(local185, local168, local207, local18);
							Static394.method2439(local185, 0, local175 - local207, local18);
						} else {
							Static394.method2439(local185, local168, local175, local18);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt1538 = arg1.method5732();
		} else if (arg0 == 1) {
			this.anInt1537 = arg1.method5753();
		} else if (arg0 == 2) {
			this.anInt1544 = arg1.method5753();
		} else if (arg0 == 3) {
			this.anInt1546 = arg1.method5753();
		} else if (arg0 == 4) {
			this.anInt1539 = arg1.method5753();
		} else if (arg0 == 5) {
			this.anInt1554 = arg1.method5753();
		} else if (arg0 == 6) {
			this.anInt1542 = arg1.method5732();
		} else if (arg0 == 7) {
			this.anInt1541 = arg1.method5753();
		} else if (arg0 == 8) {
			this.anInt1552 = arg1.method5753();
		}
	}
}
