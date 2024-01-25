import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class2_Sub4_Sub8 extends Class2_Sub4 {

	@OriginalMember(owner = "client!cn", name = "H", descriptor = "I")
	private int anInt2129;

	@OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
	private int anInt2126 = 2048;

	@OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
	private int anInt2127 = 819;

	@OriginalMember(owner = "client!cn", name = "L", descriptor = "I")
	private int anInt2133 = 1024;

	@OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
	private int anInt2128 = 1024;

	@OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
	private int anInt2137 = 0;

	@OriginalMember(owner = "client!cn", name = "Q", descriptor = "I")
	private int anInt2138 = 0;

	@OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
	private int anInt2140 = 1024;

	@OriginalMember(owner = "client!cn", name = "K", descriptor = "I")
	private int anInt2132 = 409;

	@OriginalMember(owner = "client!cn", name = "X", descriptor = "I")
	private int anInt2145 = 1024;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2137 = arg0.method2859();
		} else if (arg1 == 1) {
			this.anInt2128 = arg0.method2825();
		} else if (arg1 == 2) {
			this.anInt2126 = arg0.method2825();
		} else if (arg1 == 3) {
			this.anInt2132 = arg0.method2825();
		} else if (arg1 == 4) {
			this.anInt2127 = arg0.method2825();
		} else if (arg1 == 5) {
			this.anInt2133 = arg0.method2825();
		} else if (arg1 == 6) {
			this.anInt2138 = arg0.method2859();
		} else if (arg1 == 7) {
			this.anInt2140 = arg0.method2825();
		} else if (arg1 == 8) {
			this.anInt2145 = arg0.method2825();
		}
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass348_41.method8072(arg0);
		if (!super.aClass348_41.aBoolean680) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass348_41.method8071();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static395.anInt6816 * this.anInt2128 >> 12;
		@Pc(52) int local52 = this.anInt2126 * Static395.anInt6816 >> 12;
		@Pc(59) int local59 = this.anInt2132 * Static118.anInt2485 >> 12;
		@Pc(66) int local66 = Static118.anInt2485 * this.anInt2127 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt2129 = this.anInt2133 * (Static395.anInt6816 / 8) >> 12;
		@Pc(91) int local91 = Static395.anInt6816 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt2137);
		while (true) {
			while (true) {
				@Pc(116) int local116 = Static142.method2572(local52 - local45, local106) + local45;
				@Pc(126) int local126 = Static142.method2572(local66 - local59, local106) + local59;
				@Pc(130) int local130 = local28 + local116;
				if (local130 > Static395.anInt6816) {
					local116 = Static395.anInt6816 - local28;
					local130 = Static395.anInt6816;
				}
				@Pc(174) int local174;
				@Pc(150) int local150;
				if (local34) {
					local174 = 0;
				} else {
					@Pc(144) int local144 = local30;
					@Pc(148) int[] local148 = local99[local30];
					local150 = 0;
					@Pc(154) int local154 = local22 + local130;
					if (local154 < 0) {
						local154 += Static395.anInt6816;
					}
					if (Static395.anInt6816 < local154) {
						local154 -= Static395.anInt6816;
					}
					local174 = local148[2];
					while (true) {
						@Pc(178) int[] local178 = local99[local144];
						if (local154 >= local178[0] && local154 <= local178[1]) {
							if (local30 != local144) {
								@Pc(212) int local212 = local22 + local28;
								if (local212 < 0) {
									local212 += Static395.anInt6816;
								}
								if (Static395.anInt6816 < local212) {
									local212 -= Static395.anInt6816;
								}
								for (@Pc(231) int local231 = 1; local231 <= local150; local231++) {
									@Pc(241) int[] local241 = local99[(local231 + local30) % local36];
									local174 = Math.max(local174, local241[2]);
								}
								for (@Pc(253) int local253 = 0; local253 <= local150; local253++) {
									@Pc(263) int[] local263 = local99[(local253 + local30) % local36];
									@Pc(267) int local267 = local263[2];
									if (local267 != local174) {
										@Pc(274) int local274 = local263[0];
										@Pc(278) int local278 = local263[1];
										@Pc(285) int local285;
										@Pc(289) int local289;
										if (local212 < local154) {
											local285 = Math.max(local212, local274);
											local289 = Math.min(local154, local278);
										} else if (local274 == 0) {
											local289 = Math.min(local154, local278);
											local285 = 0;
										} else {
											local285 = Math.max(local212, local274);
											local289 = Static395.anInt6816;
										}
										this.method1772(local289 - local285, local267, local174 - local267, local26 + local285, local20, local106);
									}
								}
							}
							local30 = local144;
							break;
						}
						local150++;
						local144++;
						if (local36 <= local144) {
							local144 = 0;
						}
					}
				}
				if (Static118.anInt2485 >= local174 + local126) {
					local32 = false;
				} else {
					local126 = Static118.anInt2485 - local174;
				}
				@Pc(368) int[] local368;
				if (Static395.anInt6816 == local130) {
					this.method1772(local116, local174, local126, local24 + local28, local20, local106);
					if (local32) {
						return local11;
					}
					local32 = true;
					local368 = local95[local38++];
					local368[0] = local28;
					local368[2] = local126 + local174;
					local368[1] = local130;
					@Pc(436) int[][] local436 = local99;
					local99 = local95;
					local36 = local38;
					local95 = local436;
					local26 = local24;
					local38 = 0;
					local24 = Static142.method2572(Static395.anInt6816, local106);
					local28 = 0;
					local22 = local24 - local26;
					local150 = local22;
					if (local22 < 0) {
						local150 = local22 + Static395.anInt6816;
					}
					if (Static395.anInt6816 < local150) {
						local150 -= Static395.anInt6816;
					}
					local30 = 0;
					while (true) {
						@Pc(479) int[] local479 = local99[local30];
						if (local150 >= local479[0] && local479[1] >= local150) {
							local34 = false;
							break;
						}
						local30++;
						if (local36 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local368 = local95[local38++];
					local368[2] = local174 + local126;
					local368[0] = local28;
					local368[1] = local130;
					this.method1772(local116, local174, local126, local24 + local28, local20, local106);
					local28 = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIII[[ILjava/util/Random;I)V")
	private void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) Random arg5) {
		@Pc(18) int local18 = this.anInt2145 > 0 ? 4096 - Static142.method2572(this.anInt2145, arg5) : 4096;
		@Pc(26) int local26 = this.anInt2129 * this.anInt2140 >> 12;
		@Pc(39) int local39 = this.anInt2129 - (local26 > 0 ? Static142.method2572(local26, arg5) : 0);
		if (arg3 >= Static395.anInt6816) {
			arg3 -= Static395.anInt6816;
		}
		@Pc(63) int local63;
		@Pc(90) int local90;
		if (local39 <= 0) {
			if (arg3 + arg0 <= Static395.anInt6816) {
				for (local63 = 0; local63 < arg2; local63++) {
					Static650.method2272(arg4[local63 + arg1], arg3, arg0, local18);
				}
			} else {
				local63 = Static395.anInt6816 - arg3;
				for (local90 = 0; local90 < arg2; local90++) {
					@Pc(98) int[] local98 = arg4[local90 + arg1];
					Static650.method2272(local98, arg3, local63, local18);
					Static650.method2272(local98, 0, arg0 - local63, local18);
				}
			}
		} else if (arg2 > 0 && arg0 > 0) {
			local63 = arg0 / 2;
			local90 = arg2 / 2;
			@Pc(146) int local146 = local39 > local63 ? local63 : local39;
			@Pc(153) int local153 = local90 >= local39 ? local39 : local90;
			@Pc(157) int local157 = local146 + arg3;
			@Pc(164) int local164 = arg0 - local146 * 2;
			for (@Pc(166) int local166 = 0; local166 < arg2; local166++) {
				@Pc(175) int[] local175 = arg4[local166 + arg1];
				@Pc(188) int local188;
				@Pc(196) int local196;
				@Pc(204) int local204;
				if (local153 > local166) {
					local188 = local166 * local18 / local153;
					if (this.anInt2138 == 0) {
						for (local196 = 0; local196 < local146; local196++) {
							local204 = local196 * local18 / local146;
							local175[local196 + arg3 & Static104.anInt2340] = local175[Static104.anInt2340 & arg0 + arg3 - local196 - 1] = local188 * local204 >> 12;
						}
					} else {
						for (local196 = 0; local196 < local146; local196++) {
							local204 = local196 * local18 / local146;
							local175[Static104.anInt2340 & local196 + arg3] = local175[arg0 + arg3 - local196 - 1 & Static104.anInt2340] = local188 > local204 ? local204 : local188;
						}
					}
					if (Static395.anInt6816 >= local157 + local164) {
						Static650.method2272(local175, local157, local164, local188);
					} else {
						local196 = Static395.anInt6816 - local157;
						Static650.method2272(local175, local157, local196, local188);
						Static650.method2272(local175, 0, local164 - local196, local188);
					}
				} else {
					local188 = arg2 - local166 - 1;
					if (local188 < local153) {
						local196 = local18 * local188 / local153;
						@Pc(353) int local353;
						if (this.anInt2138 == 0) {
							for (local204 = 0; local204 < local146; local204++) {
								local353 = local204 * local18 / local146;
								local175[local204 + arg3 & Static104.anInt2340] = local175[arg3 + arg0 - local204 - 1 & Static104.anInt2340] = local353 * local196 >> 12;
							}
						} else {
							for (local204 = 0; local204 < local146; local204++) {
								local353 = local204 * local18 / local146;
								local175[Static104.anInt2340 & arg3 + local204] = local175[Static104.anInt2340 & arg3 + arg0 - local204 - 1] = local353 >= local196 ? local196 : local353;
							}
						}
						if (Static395.anInt6816 >= local157 + local164) {
							Static650.method2272(local175, local157, local164, local196);
						} else {
							local204 = Static395.anInt6816 - local157;
							Static650.method2272(local175, local157, local204, local196);
							Static650.method2272(local175, 0, local164 - local204, local196);
						}
					} else {
						for (local196 = 0; local196 < local146; local196++) {
							local175[local196 + arg3 & Static104.anInt2340] = local175[Static104.anInt2340 & arg0 + arg3 - local196 - 1] = local18 * local196 / local146;
						}
						if (Static395.anInt6816 >= local157 + local164) {
							Static650.method2272(local175, local157, local164, local18);
						} else {
							local204 = Static395.anInt6816 - local157;
							Static650.method2272(local175, local157, local204, local18);
							Static650.method2272(local175, 0, local164 - local204, local18);
						}
					}
				}
			}
		}
	}
}
