import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
	private int anInt909 = 1024;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
	private int anInt908 = 1024;

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
	private int anInt915 = 409;

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
	private int anInt919 = 819;

	@OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
	private int anInt920 = 2048;

	@OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
	private int anInt925 = 1024;

	@OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
	private int anInt922 = 0;

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "I")
	private int anInt924 = 1024;

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
	private int anInt923 = 0;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (!super.aClass219_41.aBoolean423) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass219_41.method5568();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static307.anInt4846 * this.anInt908 >> 12;
		@Pc(52) int local52 = this.anInt920 * Static307.anInt4846 >> 12;
		@Pc(59) int local59 = this.anInt915 * Static397.anInt7340 >> 12;
		@Pc(66) int local66 = this.anInt919 * Static397.anInt7340 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt917 = this.anInt924 * (Static307.anInt4846 / 8) >> 12;
		@Pc(91) int local91 = Static307.anInt4846 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt923);
		while (true) {
			while (true) {
				@Pc(115) int local115 = local45 + Static500.method7215(local106, local52 - local45);
				@Pc(125) int local125 = local59 + Static500.method7215(local106, local66 - local59);
				@Pc(130) int local130 = local28 + local115;
				if (local130 > Static307.anInt4846) {
					local115 = Static307.anInt4846 - local28;
					local130 = Static307.anInt4846;
				}
				@Pc(198) int local198;
				@Pc(150) int local150;
				if (local34) {
					local198 = 0;
				} else {
					@Pc(144) int local144 = local30;
					@Pc(148) int[] local148 = local99[local30];
					local150 = 0;
					@Pc(154) int local154 = local130 + local22;
					if (local154 < 0) {
						local154 += Static307.anInt4846;
					}
					if (Static307.anInt4846 < local154) {
						local154 -= Static307.anInt4846;
					}
					while (true) {
						@Pc(171) int[] local171 = local99[local144];
						if (local154 >= local171[0] && local154 <= local171[1]) {
							local198 = local148[2];
							if (local144 != local30) {
								@Pc(209) int local209 = local28 + local22;
								if (local209 < 0) {
									local209 += Static307.anInt4846;
								}
								if (Static307.anInt4846 < local209) {
									local209 -= Static307.anInt4846;
								}
								for (@Pc(228) int local228 = 1; local228 <= local150; local228++) {
									@Pc(238) int[] local238 = local99[(local30 + local228) % local36];
									local198 = Math.max(local198, local238[2]);
								}
								for (@Pc(250) int local250 = 0; local250 <= local150; local250++) {
									@Pc(260) int[] local260 = local99[(local250 + local30) % local36];
									@Pc(264) int local264 = local260[2];
									if (local198 != local264) {
										@Pc(271) int local271 = local260[0];
										@Pc(275) int local275 = local260[1];
										@Pc(289) int local289;
										@Pc(287) int local287;
										if (local154 > local209) {
											local289 = Math.max(local209, local271);
											local287 = Math.min(local154, local275);
										} else if (local271 == 0) {
											local287 = Math.min(local154, local275);
											local289 = 0;
										} else {
											local289 = Math.max(local209, local271);
											local287 = Static307.anInt4846;
										}
										this.method860(local20, local198 - local264, local106, local287 - local289, local26 + local289, local264);
									}
								}
							}
							local30 = local144;
							break;
						}
						local150++;
						local144++;
						if (local144 >= local36) {
							local144 = 0;
						}
					}
				}
				if (Static397.anInt7340 >= local198 + local125) {
					local32 = false;
				} else {
					local125 = Static397.anInt7340 - local198;
				}
				@Pc(367) int[] local367;
				if (local130 == Static307.anInt4846) {
					this.method860(local20, local125, local106, local115, local28 + local24, local198);
					if (local32) {
						return local11;
					}
					local32 = true;
					local367 = local95[local38++];
					local367[1] = local130;
					local367[2] = local198 + local125;
					local367[0] = local28;
					@Pc(434) int[][] local434 = local99;
					local99 = local95;
					local36 = local38;
					local95 = local434;
					local38 = 0;
					local26 = local24;
					local24 = Static500.method7215(local106, Static307.anInt4846);
					local22 = local24 - local26;
					local28 = 0;
					local150 = local22;
					if (local22 < 0) {
						local150 = local22 + Static307.anInt4846;
					}
					local30 = 0;
					if (Static307.anInt4846 < local150) {
						local150 -= Static307.anInt4846;
					}
					local34 = false;
					while (true) {
						@Pc(483) int[] local483 = local99[local30];
						if (local150 >= local483[0] && local483[1] >= local150) {
							break;
						}
						local30++;
						if (local36 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local367 = local95[local38++];
					local367[0] = local28;
					local367[2] = local125 + local198;
					local367[1] = local130;
					this.method860(local20, local125, local106, local115, local24 + local28, local198);
					local28 = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt923 = arg1.method7548();
		} else if (arg0 == 1) {
			this.anInt908 = arg1.method7591();
		} else if (arg0 == 2) {
			this.anInt920 = arg1.method7591();
		} else if (arg0 == 3) {
			this.anInt915 = arg1.method7591();
		} else if (arg0 == 4) {
			this.anInt919 = arg1.method7591();
		} else if (arg0 == 5) {
			this.anInt924 = arg1.method7591();
		} else if (arg0 == 6) {
			this.anInt922 = arg1.method7548();
		} else if (arg0 == 7) {
			this.anInt925 = arg1.method7591();
		} else if (arg0 == 8) {
			this.anInt909 = arg1.method7591();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[[IILjava/util/Random;III)V")
	private void method860(@OriginalArg(1) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = this.anInt909 <= 0 ? 4096 : 4096 - Static500.method7215(arg2, this.anInt909);
		@Pc(32) int local32 = this.anInt917 * this.anInt925 >> 12;
		@Pc(47) int local47 = this.anInt917 - (local32 > 0 ? Static500.method7215(arg2, local32) : 0);
		if (Static307.anInt4846 <= arg4) {
			arg4 -= Static307.anInt4846;
		}
		@Pc(75) int local75;
		@Pc(77) int local77;
		if (local47 <= 0) {
			if (arg4 + arg3 > Static307.anInt4846) {
				local75 = Static307.anInt4846 - arg4;
				for (local77 = 0; local77 < arg1; local77++) {
					@Pc(85) int[] local85 = arg0[local77 + arg5];
					Static559.method5958(local85, arg4, local75, local18);
					Static559.method5958(local85, 0, arg3 - local75, local18);
				}
			} else {
				for (local75 = 0; local75 < arg1; local75++) {
					Static559.method5958(arg0[local75 + arg5], arg4, arg3, local18);
				}
			}
		} else if (arg1 > 0 && arg3 > 0) {
			local75 = arg3 / 2;
			local77 = arg1 / 2;
			@Pc(141) int local141 = local75 >= local47 ? local47 : local75;
			@Pc(148) int local148 = local77 < local47 ? local77 : local47;
			@Pc(152) int local152 = arg4 + local141;
			@Pc(159) int local159 = arg3 - local141 * 2;
			for (@Pc(161) int local161 = 0; local161 < arg1; local161++) {
				@Pc(169) int[] local169 = arg0[arg5 + local161];
				@Pc(182) int local182;
				@Pc(187) int local187;
				@Pc(195) int local195;
				if (local148 > local161) {
					local182 = local18 * local161 / local148;
					if (this.anInt922 == 0) {
						for (local187 = 0; local187 < local141; local187++) {
							local195 = local18 * local187 / local141;
							local169[local187 + arg4 & Static324.anInt6207] = local169[Static324.anInt6207 & arg3 + arg4 - local187 - 1] = local182 * local195 >> 12;
						}
					} else {
						for (local187 = 0; local187 < local141; local187++) {
							local195 = local18 * local187 / local141;
							local169[arg4 + local187 & Static324.anInt6207] = local169[Static324.anInt6207 & arg4 + arg3 - local187 - 1] = local195 >= local182 ? local182 : local195;
						}
					}
					if (local159 + local152 <= Static307.anInt4846) {
						Static559.method5958(local169, local152, local159, local182);
					} else {
						local187 = Static307.anInt4846 - local152;
						Static559.method5958(local169, local152, local187, local182);
						Static559.method5958(local169, 0, local159 - local187, local182);
					}
				} else {
					local182 = arg1 - local161 - 1;
					if (local148 > local182) {
						local187 = local182 * local18 / local148;
						@Pc(331) int local331;
						if (this.anInt922 == 0) {
							for (local195 = 0; local195 < local141; local195++) {
								local331 = local195 * local18 / local141;
								local169[arg4 + local195 & Static324.anInt6207] = local169[Static324.anInt6207 & arg3 + arg4 - local195 - 1] = local331 * local187 >> 12;
							}
						} else {
							for (local195 = 0; local195 < local141; local195++) {
								local331 = local18 * local195 / local141;
								local169[Static324.anInt6207 & arg4 + local195] = local169[Static324.anInt6207 & arg3 + arg4 - local195 - 1] = local331 >= local187 ? local187 : local331;
							}
						}
						if (local159 + local152 <= Static307.anInt4846) {
							Static559.method5958(local169, local152, local159, local187);
						} else {
							local195 = Static307.anInt4846 - local152;
							Static559.method5958(local169, local152, local195, local187);
							Static559.method5958(local169, 0, local159 - local195, local187);
						}
					} else {
						for (local187 = 0; local187 < local141; local187++) {
							local169[Static324.anInt6207 & arg4 + local187] = local169[Static324.anInt6207 & arg3 + arg4 - local187 - 1] = local187 * local18 / local141;
						}
						if (local159 + local152 <= Static307.anInt4846) {
							Static559.method5958(local169, local152, local159, local18);
						} else {
							local195 = Static307.anInt4846 - local152;
							Static559.method5958(local169, local152, local195, local18);
							Static559.method5958(local169, 0, local159 - local195, local18);
						}
					}
				}
			}
		}
	}
}
