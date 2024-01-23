import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class4_Sub1_Sub19 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
	private int anInt2814;

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
	private int anInt2796 = 1024;

	@OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
	private int anInt2807 = 409;

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
	private int anInt2802 = 819;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
	private int anInt2797 = 0;

	@OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
	private int anInt2811 = 1024;

	@OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
	private int anInt2813 = 0;

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
	private int anInt2804 = 2048;

	@OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
	private int anInt2817 = 1024;

	@OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
	private int anInt2820 = 1024;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass43_41.method1180(arg0);
		if (!this.aClass43_41.aBoolean82) {
			return local9;
		}
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(32) int[][] local32 = this.aClass43_41.method1182();
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49 = this.anInt2804 * Static68.anInt1753 >> 12;
		@Pc(56) int local56 = Static68.anInt1753 * this.anInt2796 >> 12;
		@Pc(63) int local63 = Static33.anInt660 * this.anInt2807 >> 12;
		@Pc(70) int local70 = Static33.anInt660 * this.anInt2802 >> 12;
		if (local70 <= 1) {
			return local32[arg0];
		}
		this.anInt2814 = Static68.anInt1753 / 8 * this.anInt2811 >> 12;
		@Pc(94) int local94 = Static68.anInt1753 / local56 + 1;
		@Pc(98) int[][] local98 = new int[local94][3];
		@Pc(102) int[][] local102 = new int[local94][3];
		@Pc(109) Random local109 = new Random((long) this.anInt2813);
		while (true) {
			while (true) {
				@Pc(118) int local118 = Static59.method1118(local49 - local56, local109) + local56;
				@Pc(128) int local128 = local63 + Static59.method1118(local70 - local63, local109);
				@Pc(132) int local132 = local118 + local21;
				if (Static68.anInt1753 < local132) {
					local118 = Static68.anInt1753 - local21;
					local132 = Static68.anInt1753;
				}
				@Pc(145) int local145;
				@Pc(151) int local151;
				if (local38) {
					local145 = 0;
				} else {
					@Pc(149) int local149 = local36;
					local151 = 0;
					@Pc(155) int[] local155 = local98[local36];
					local145 = local155[2];
					@Pc(163) int local163 = local132 + local19;
					if (local163 < 0) {
						local163 += Static68.anInt1753;
					}
					if (Static68.anInt1753 < local163) {
						local163 -= Static68.anInt1753;
					}
					while (true) {
						@Pc(182) int[] local182 = local98[local149];
						if (local182[0] <= local163 && local163 <= local182[1]) {
							if (local149 != local36) {
								@Pc(214) int local214 = local21 + local19;
								if (local214 < 0) {
									local214 += Static68.anInt1753;
								}
								if (Static68.anInt1753 < local214) {
									local214 -= Static68.anInt1753;
								}
								@Pc(238) int local238;
								@Pc(250) int[] local250;
								for (local238 = 1; local238 <= local151; local238++) {
									local250 = local98[(local36 + local238) % local40];
									local145 = Math.max(local145, local250[2]);
								}
								for (local238 = 0; local238 <= local151; local238++) {
									local250 = local98[(local238 + local36) % local40];
									@Pc(280) int local280 = local250[2];
									if (local145 != local280) {
										@Pc(291) int local291 = local250[0];
										@Pc(295) int local295 = local250[1];
										@Pc(308) int local308;
										@Pc(310) int local310;
										if (local163 > local214) {
											local308 = Math.max(local214, local291);
											local310 = Math.min(local163, local295);
										} else if (local291 == 0) {
											local308 = 0;
											local310 = Math.min(local163, local295);
										} else {
											local308 = Math.max(local214, local291);
											local310 = Static68.anInt1753;
										}
										this.method2270(local280, local23 + local308, local32, local145 - local280, local310 + -local308, local109);
									}
								}
							}
							local36 = local149;
							break;
						}
						local151++;
						local149++;
						if (local149 >= local40) {
							local149 = 0;
						}
					}
				}
				if (local128 + local145 <= Static33.anInt660) {
					local34 = false;
				} else {
					local128 = Static33.anInt660 - local145;
				}
				@Pc(392) int[] local392;
				if (local132 == Static68.anInt1753) {
					this.method2270(local145, local21 + local25, local32, local128, local118, local109);
					if (local34) {
						return local9;
					}
					local23 = local25;
					local38 = false;
					local36 = 0;
					local392 = local102[local42++];
					local34 = true;
					local40 = local42;
					local42 = 0;
					local392[1] = local132;
					local392[2] = local128 + local145;
					local392[0] = local21;
					local21 = 0;
					local25 = Static59.method1118(Static68.anInt1753, local109);
					@Pc(421) int[][] local421 = local98;
					local98 = local102;
					local102 = local421;
					local19 = local25 - local23;
					local151 = local19;
					if (local19 < 0) {
						local151 = local19 + Static68.anInt1753;
					}
					if (local151 > Static68.anInt1753) {
						local151 -= Static68.anInt1753;
					}
					while (true) {
						@Pc(454) int[] local454 = local98[local36];
						if (local151 >= local454[0] && local454[1] >= local151) {
							break;
						}
						@Pc(473) int local473 = ~local40;
						local36++;
						if (local473 >= ~local36) {
							local36 = 0;
						}
					}
				} else {
					local392 = local102[local42++];
					local392[0] = local21;
					local392[1] = local132;
					local392[2] = local145 + local128;
					this.method2270(local145, local21 + local25, local32, local128, local118, local109);
					local21 = local132;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt2813 = arg1.method3110();
		} else if (arg0 == 1) {
			this.anInt2796 = arg1.method3085();
		} else if (arg0 == 2) {
			this.anInt2804 = arg1.method3085();
		} else if (arg0 == 3) {
			this.anInt2807 = arg1.method3085();
		} else if (arg0 == 4) {
			this.anInt2802 = arg1.method3085();
		} else if (arg0 == 5) {
			this.anInt2811 = arg1.method3085();
		} else if (arg0 == 6) {
			this.anInt2797 = arg1.method3110();
		} else if (arg0 == 7) {
			this.anInt2817 = arg1.method3085();
		} else if (arg0 == 8) {
			this.anInt2820 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB[[IIILjava/util/Random;)V")
	private void method2270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(19) int local19 = this.anInt2820 > 0 ? 4096 - Static59.method1118(this.anInt2820, arg5) : 4096;
		@Pc(27) int local27 = this.anInt2814 * this.anInt2817 >> 12;
		@Pc(42) int local42 = this.anInt2814 - (local27 <= 0 ? 0 : Static59.method1118(local27, arg5));
		if (Static68.anInt1753 <= arg1) {
			arg1 -= Static68.anInt1753;
		}
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (local42 > 0) {
			if (arg3 <= 0 || arg4 <= 0) {
				return;
			}
			local73 = arg4 / 2;
			local75 = arg3 / 2;
			@Pc(151) int local151 = local73 < local42 ? local73 : local42;
			@Pc(162) int local162 = local75 >= local42 ? local42 : local75;
			@Pc(166) int local166 = local151 + arg1;
			@Pc(173) int local173 = arg4 - local151 * 2;
			for (@Pc(175) int local175 = 0; local175 < arg3; local175++) {
				@Pc(184) int[] local184 = arg2[arg0 + local175];
				@Pc(194) int local194;
				@Pc(200) int local200;
				@Pc(213) int local213;
				if (local162 <= local175) {
					local194 = arg3 - local175 - 1;
					if (local194 >= local162) {
						for (local200 = 0; local200 < local151; local200++) {
							local184[Static295.anInt5711 & local200 + arg1] = local184[arg1 + arg4 - local200 - 1 & Static295.anInt5711] = local200 * local19 / local151;
						}
						if (Static68.anInt1753 >= local173 + local166) {
							Static317.method3204(local184, local166, local173, local19);
						} else {
							local200 = Static68.anInt1753 - local166;
							Static317.method3204(local184, local166, local200, local19);
							Static317.method3204(local184, 0, local173 - local200, local19);
						}
					} else {
						local200 = local194 * local19 / local162;
						@Pc(361) int local361;
						if (this.anInt2797 == 0) {
							for (local213 = 0; local213 < local151; local213++) {
								local361 = local213 * local19 / local151;
								local184[Static295.anInt5711 & local213 + arg1] = local184[Static295.anInt5711 & arg1 + arg4 - local213 - 1] = local200 * local361 >> 12;
							}
						} else {
							for (local213 = 0; local213 < local151; local213++) {
								local361 = local213 * local19 / local151;
								local184[Static295.anInt5711 & arg1 + local213] = local184[Static295.anInt5711 & arg4 + arg1 - local213 - 1] = local200 <= local361 ? local200 : local361;
							}
						}
						if (local173 + local166 <= Static68.anInt1753) {
							Static317.method3204(local184, local166, local173, local200);
						} else {
							local213 = Static68.anInt1753 - local166;
							Static317.method3204(local184, local166, local213, local200);
							Static317.method3204(local184, 0, local173 - local213, local200);
						}
					}
				} else {
					local194 = local175 * local19 / local162;
					if (this.anInt2797 == 0) {
						for (local200 = 0; local200 < local151; local200++) {
							local213 = local200 * local19 / local151;
							local184[local200 + arg1 & Static295.anInt5711] = local184[arg1 + arg4 - local200 - 1 & Static295.anInt5711] = local194 * local213 >> 12;
						}
					} else {
						for (local200 = 0; local200 < local151; local200++) {
							local213 = local200 * local19 / local151;
							local184[Static295.anInt5711 & local200 + arg1] = local184[arg1 + arg4 - local200 - 1 & Static295.anInt5711] = local213 >= local194 ? local194 : local213;
						}
					}
					if (Static68.anInt1753 < local166 + local173) {
						local200 = Static68.anInt1753 - local166;
						Static317.method3204(local184, local166, local200, local194);
						Static317.method3204(local184, 0, local173 - local200, local194);
					} else {
						Static317.method3204(local184, local166, local173, local194);
					}
				}
			}
		} else if (arg4 + arg1 > Static68.anInt1753) {
			local73 = Static68.anInt1753 - arg1;
			for (local75 = 0; local75 < arg3; local75++) {
				@Pc(88) int[] local88 = arg2[local75 + arg0];
				Static317.method3204(local88, arg1, local73, local19);
				Static317.method3204(local88, 0, arg4 - local73, local19);
			}
		} else {
			for (local73 = 0; local73 < arg3; local73++) {
				Static317.method3204(arg2[local73 + arg0], arg1, arg4, local19);
			}
		}
	}
}
