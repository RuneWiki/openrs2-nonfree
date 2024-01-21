import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fd", name = "ob", descriptor = "I")
	private int anInt1306;

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
	private int anInt1293 = 1024;

	@OriginalMember(owner = "client!fd", name = "hb", descriptor = "I")
	private int anInt1301 = 1024;

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
	private int anInt1291 = 2048;

	@OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
	private int anInt1296 = 0;

	@OriginalMember(owner = "client!fd", name = "ib", descriptor = "I")
	private int anInt1302 = 409;

	@OriginalMember(owner = "client!fd", name = "mb", descriptor = "I")
	private int anInt1304 = 819;

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
	private int anInt1294 = 1024;

	@OriginalMember(owner = "client!fd", name = "pb", descriptor = "I")
	private int anInt1307 = 0;

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
	private int anInt1295 = 1024;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1307 = arg0.method3010();
		} else if (arg1 == 1) {
			this.anInt1294 = arg0.method3023();
		} else if (arg1 == 2) {
			this.anInt1291 = arg0.method3023();
		} else if (arg1 == 3) {
			this.anInt1302 = arg0.method3023();
		} else if (arg1 == 4) {
			this.anInt1304 = arg0.method3023();
		} else if (arg1 == 5) {
			this.anInt1293 = arg0.method3023();
		} else if (arg1 == 6) {
			this.anInt1296 = arg0.method3010();
		} else if (arg1 == 7) {
			this.anInt1295 = arg0.method3023();
		} else if (arg1 == 8) {
			this.anInt1301 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[[IIIILjava/util/Random;)V")
	private void method903(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(22) int local22 = this.anInt1301 > 0 ? 4096 - Static192.method3141(this.anInt1301, arg5) : 4096;
		@Pc(35) int local35 = this.anInt1295 * this.anInt1306 >> 12;
		@Pc(51) int local51 = this.anInt1306 - (local35 <= 0 ? 0 : Static192.method3141(local35, arg5));
		if (arg0 >= Static107.anInt2321) {
			arg0 -= Static107.anInt2321;
		}
		@Pc(72) int local72;
		@Pc(74) int local74;
		if (local51 <= 0) {
			if (Static107.anInt2321 < arg0 + arg2) {
				local72 = Static107.anInt2321 - arg0;
				for (local74 = 0; local74 < arg4; local74++) {
					@Pc(83) int[] local83 = arg1[arg3 + local74];
					Static216.method2202(local83, arg0, local72, local22);
					Static216.method2202(local83, 0, arg2 - local72, local22);
				}
			} else {
				for (local72 = 0; local72 < arg4; local72++) {
					Static216.method2202(arg1[arg3 + local72], arg0, arg2, local22);
				}
			}
		} else if (arg4 > 0 && arg2 > 0) {
			local72 = arg2 / 2;
			@Pc(138) int local138 = local72 >= local51 ? local51 : local72;
			local74 = arg4 / 2;
			@Pc(147) int local147 = arg0 + local138;
			@Pc(154) int local154 = arg2 - local138 * 2;
			@Pc(165) int local165 = local74 < local51 ? local74 : local51;
			for (@Pc(167) int local167 = 0; local167 < arg4; local167++) {
				@Pc(175) int[] local175 = arg1[local167 + arg3];
				@Pc(184) int local184;
				@Pc(192) int local192;
				@Pc(200) int local200;
				if (local167 < local165) {
					local184 = local167 * local22 / local165;
					if (this.anInt1296 == 0) {
						for (local192 = 0; local192 < local138; local192++) {
							local200 = local22 * local192 / local138;
							local175[Static144.anInt2893 & local192 + arg0] = local175[arg2 + arg0 - local192 - 1 & Static144.anInt2893] = local200 * local184 >> 12;
						}
					} else {
						for (local192 = 0; local192 < local138; local192++) {
							local200 = local192 * local22 / local138;
							local175[local192 + arg0 & Static144.anInt2893] = local175[arg0 + arg2 - local192 - 1 & Static144.anInt2893] = local184 <= local200 ? local184 : local200;
						}
					}
					if (local147 + local154 <= Static107.anInt2321) {
						Static216.method2202(local175, local147, local154, local184);
					} else {
						local192 = Static107.anInt2321 - local147;
						Static216.method2202(local175, local147, local192, local184);
						Static216.method2202(local175, 0, local154 - local192, local184);
					}
				} else {
					local184 = arg4 - local167 - 1;
					if (local165 > local184) {
						local192 = local22 * local184 / local165;
						@Pc(335) int local335;
						if (this.anInt1296 == 0) {
							for (local200 = 0; local200 < local138; local200++) {
								local335 = local22 * local200 / local138;
								local175[Static144.anInt2893 & local200 + arg0] = local175[Static144.anInt2893 & arg0 + arg2 - local200 - 1] = local192 * local335 >> 12;
							}
						} else {
							for (local200 = 0; local200 < local138; local200++) {
								local335 = local200 * local22 / local138;
								local175[local200 + arg0 & Static144.anInt2893] = local175[Static144.anInt2893 & arg2 + arg0 - local200 - 1] = local192 <= local335 ? local192 : local335;
							}
						}
						if (Static107.anInt2321 < local147 + local154) {
							local200 = Static107.anInt2321 - local147;
							Static216.method2202(local175, local147, local200, local192);
							Static216.method2202(local175, 0, local154 - local200, local192);
						} else {
							Static216.method2202(local175, local147, local154, local192);
						}
					} else {
						for (local192 = 0; local192 < local138; local192++) {
							local175[local192 + arg0 & Static144.anInt2893] = local175[Static144.anInt2893 & arg0 + arg2 - local192 - 1] = local192 * local22 / local138;
						}
						if (Static107.anInt2321 >= local147 + local154) {
							Static216.method2202(local175, local147, local154, local22);
						} else {
							local200 = Static107.anInt2321 - local147;
							Static216.method2202(local175, local147, local200, local22);
							Static216.method2202(local175, 0, local154 - local200, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass43_41.method1185(arg0);
		if (!super.aClass43_41.aBoolean106) {
			return local11;
		}
		@Pc(27) int[][] local27 = super.aClass43_41.method1182();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) boolean local39 = true;
		@Pc(41) boolean local41 = true;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(52) int local52 = this.anInt1294 * Static107.anInt2321 >> 12;
		@Pc(59) int local59 = Static107.anInt2321 * this.anInt1291 >> 12;
		@Pc(66) int local66 = Static123.anInt2607 * this.anInt1304 >> 12;
		@Pc(73) int local73 = this.anInt1302 * Static123.anInt2607 >> 12;
		if (local66 <= 1) {
			return local27[arg0];
		}
		this.anInt1306 = Static107.anInt2321 / 8 * this.anInt1293 >> 12;
		@Pc(96) int local96 = Static107.anInt2321 / local52 + 1;
		@Pc(103) Random local103 = new Random((long) this.anInt1307);
		@Pc(107) int[][] local107 = new int[local96][3];
		@Pc(111) int[][] local111 = new int[local96][3];
		while (true) {
			while (true) {
				@Pc(120) int local120 = Static192.method3141(local59 - local52, local103) + local52;
				@Pc(131) int local131 = local73 + Static192.method3141(local66 - local73, local103);
				@Pc(135) int local135 = local120 + local35;
				if (Static107.anInt2321 < local135) {
					local120 = Static107.anInt2321 - local35;
					local135 = Static107.anInt2321;
				}
				@Pc(155) int local155;
				@Pc(157) int local157;
				if (local39) {
					local155 = 0;
				} else {
					@Pc(151) int[] local151 = local107[local37];
					local155 = local151[2];
					local157 = 0;
					@Pc(159) int local159 = local37;
					@Pc(163) int local163 = local135 + local29;
					if (local163 < 0) {
						local163 += Static107.anInt2321;
					}
					if (local163 > Static107.anInt2321) {
						local163 -= Static107.anInt2321;
					}
					while (true) {
						@Pc(180) int[] local180 = local107[local159];
						if (local163 >= local180[0] && local180[1] >= local163) {
							if (local159 != local37) {
								@Pc(214) int local214 = local29 + local35;
								if (local214 < 0) {
									local214 += Static107.anInt2321;
								}
								if (local214 > Static107.anInt2321) {
									local214 -= Static107.anInt2321;
								}
								for (@Pc(233) int local233 = 1; local233 <= local157; local233++) {
									@Pc(243) int[] local243 = local107[(local233 + local37) % local45];
									local155 = Math.max(local155, local243[2]);
								}
								for (@Pc(255) int local255 = 0; local255 <= local157; local255++) {
									@Pc(266) int[] local266 = local107[(local37 + local255) % local45];
									@Pc(270) int local270 = local266[2];
									if (local155 != local270) {
										@Pc(281) int local281 = local266[0];
										@Pc(285) int local285 = local266[1];
										@Pc(296) int local296;
										@Pc(300) int local300;
										if (local214 < local163) {
											local296 = Math.max(local214, local281);
											local300 = Math.min(local163, local285);
										} else if (local281 == 0) {
											local296 = 0;
											local300 = Math.min(local163, local285);
										} else {
											local296 = Math.max(local214, local281);
											local300 = Static107.anInt2321;
										}
										this.method903(local33 + local296, local27, local300 - local296, local270, local155 - local270, local103);
									}
								}
							}
							local37 = local159;
							break;
						}
						local159++;
						if (local159 >= local45) {
							local159 = 0;
						}
						local157++;
					}
				}
				if (local155 + local131 > Static123.anInt2607) {
					local131 = Static123.anInt2607 - local155;
				} else {
					local41 = false;
				}
				@Pc(391) int[] local391;
				if (Static107.anInt2321 == local135) {
					this.method903(local35 + local31, local27, local120, local155, local131, local103);
					if (local41) {
						return local11;
					}
					local41 = true;
					local39 = false;
					local391 = local111[local43++];
					local391[1] = local135;
					local33 = local31;
					local45 = local43;
					local391[0] = local35;
					local43 = 0;
					local35 = 0;
					local391[2] = local131 + local155;
					local31 = Static192.method3141(Static107.anInt2321, local103);
					local37 = 0;
					local29 = local31 - local33;
					@Pc(427) int[][] local427 = local107;
					local107 = local111;
					local157 = local29;
					if (local29 < 0) {
						local157 = local29 + Static107.anInt2321;
					}
					local111 = local427;
					if (local157 > Static107.anInt2321) {
						local157 -= Static107.anInt2321;
					}
					while (true) {
						@Pc(450) int[] local450 = local107[local37];
						if (local450[0] <= local157 && local450[1] >= local157) {
							break;
						}
						@Pc(467) int local467 = ~local45;
						local37++;
						if (local467 >= ~local37) {
							local37 = 0;
						}
					}
				} else {
					local391 = local111[local43++];
					local391[0] = local35;
					local391[2] = local155 + local131;
					local391[1] = local135;
					this.method903(local31 + local35, local27, local120, local155, local131, local103);
					local35 = local135;
				}
			}
		}
	}
}
