import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ce", name = "ob", descriptor = "I")
	private int anInt769;

	@OriginalMember(owner = "client!ce", name = "lb", descriptor = "I")
	private int anInt766 = 0;

	@OriginalMember(owner = "client!ce", name = "jb", descriptor = "I")
	private int anInt764 = 0;

	@OriginalMember(owner = "client!ce", name = "ib", descriptor = "I")
	private int anInt763 = 1024;

	@OriginalMember(owner = "client!ce", name = "wb", descriptor = "I")
	private int anInt776 = 1024;

	@OriginalMember(owner = "client!ce", name = "Ab", descriptor = "I")
	private int anInt780 = 1024;

	@OriginalMember(owner = "client!ce", name = "yb", descriptor = "I")
	private int anInt778 = 1024;

	@OriginalMember(owner = "client!ce", name = "Bb", descriptor = "I")
	private int anInt781 = 819;

	@OriginalMember(owner = "client!ce", name = "pb", descriptor = "I")
	private int anInt770 = 409;

	@OriginalMember(owner = "client!ce", name = "Cb", descriptor = "I")
	private int anInt782 = 2048;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt766 = arg1.method1738();
		} else if (arg0 == 1) {
			this.anInt776 = arg1.method1753();
		} else if (arg0 == 2) {
			this.anInt782 = arg1.method1753();
		} else if (arg0 == 3) {
			this.anInt770 = arg1.method1753();
		} else if (arg0 == 4) {
			this.anInt781 = arg1.method1753();
		} else if (arg0 == 5) {
			this.anInt778 = arg1.method1753();
		} else if (arg0 == 6) {
			this.anInt764 = arg1.method1738();
		} else if (arg0 == 7) {
			this.anInt763 = arg1.method1753();
		} else if (arg0 == 8) {
			this.anInt780 = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2876(arg0);
		if (!super.aClass80_41.aBoolean151) {
			return local7;
		}
		@Pc(22) int[][] local22 = super.aClass80_41.method2877();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) int local40 = 0;
		@Pc(47) int local47 = Static176.anInt3921 * this.anInt776 >> 12;
		@Pc(54) int local54 = Static112.anInt2736 * this.anInt770 >> 12;
		@Pc(61) int local61 = Static176.anInt3921 * this.anInt782 >> 12;
		@Pc(68) int local68 = this.anInt781 * Static112.anInt2736 >> 12;
		if (local68 <= 1) {
			return local22[arg0];
		}
		this.anInt769 = Static176.anInt3921 / 8 * this.anInt778 >> 12;
		@Pc(93) int local93 = Static176.anInt3921 / local47 + 1;
		@Pc(97) int[][] local97 = new int[local93][3];
		@Pc(101) int[][] local101 = new int[local93][3];
		@Pc(108) Random local108 = new Random((long) this.anInt766);
		while (true) {
			while (true) {
				@Pc(118) int local118 = Static3.method61(local108, local61 - local47) + local47;
				@Pc(122) int local122 = local118 + local30;
				@Pc(134) int local134 = Static3.method61(local108, local68 - local54) + local54;
				if (local122 > Static176.anInt3921) {
					local122 = Static176.anInt3921;
					local118 = Static176.anInt3921 - local30;
				}
				@Pc(178) int local178;
				@Pc(150) int local150;
				if (local38) {
					local178 = 0;
				} else {
					@Pc(148) int local148 = local32;
					local150 = 0;
					@Pc(154) int local154 = local24 + local122;
					if (local154 < 0) {
						local154 += Static176.anInt3921;
					}
					if (Static176.anInt3921 < local154) {
						local154 -= Static176.anInt3921;
					}
					@Pc(174) int[] local174 = local101[local32];
					local178 = local174[2];
					while (true) {
						@Pc(182) int[] local182 = local101[local148];
						if (local182[0] <= local154 && local182[1] >= local154) {
							if (local148 != local32) {
								@Pc(221) int local221 = local30 + local24;
								if (local221 < 0) {
									local221 += Static176.anInt3921;
								}
								if (Static176.anInt3921 < local221) {
									local221 -= Static176.anInt3921;
								}
								for (@Pc(239) int local239 = 1; local239 <= local150; local239++) {
									@Pc(249) int[] local249 = local101[(local239 + local32) % local36];
									local178 = Math.max(local178, local249[2]);
								}
								for (@Pc(261) int local261 = 0; local261 <= local150; local261++) {
									@Pc(272) int[] local272 = local101[(local32 + local261) % local36];
									@Pc(276) int local276 = local272[2];
									if (local276 != local178) {
										@Pc(287) int local287 = local272[1];
										@Pc(291) int local291 = local272[0];
										@Pc(302) int local302;
										@Pc(306) int local306;
										if (local221 < local154) {
											local302 = Math.max(local221, local291);
											local306 = Math.min(local154, local287);
										} else if (local291 == 0) {
											local306 = Math.min(local154, local287);
											local302 = 0;
										} else {
											local302 = Math.max(local221, local291);
											local306 = Static176.anInt3921;
										}
										this.method478(local28 + local302, local22, local276, local306 - local302, local108, local178 - local276);
									}
								}
							}
							local32 = local148;
							break;
						}
						local150++;
						local148++;
						if (local148 >= local36) {
							local148 = 0;
						}
					}
				}
				if (Static112.anInt2736 < local178 + local134) {
					local134 = Static112.anInt2736 - local178;
				} else {
					local34 = false;
				}
				@Pc(378) int[] local378;
				if (local122 == Static176.anInt3921) {
					this.method478(local26 + local30, local22, local178, local118, local108, local134);
					if (local34) {
						return local7;
					}
					local34 = true;
					local32 = 0;
					local38 = false;
					local378 = local97[local40++];
					local36 = local40;
					local378[2] = local134 + local178;
					local40 = 0;
					local378[1] = local122;
					local378[0] = local30;
					local28 = local26;
					local26 = Static3.method61(local108, Static176.anInt3921);
					@Pc(459) int[][] local459 = local101;
					local101 = local97;
					local97 = local459;
					local24 = local26 - local28;
					local150 = local24;
					if (local24 < 0) {
						local150 = local24 + Static176.anInt3921;
					}
					if (local150 > Static176.anInt3921) {
						local150 -= Static176.anInt3921;
					}
					local30 = 0;
					while (true) {
						@Pc(495) int[] local495 = local101[local32];
						if (local495[0] <= local150 && local150 <= local495[1]) {
							break;
						}
						local32++;
						if (local32 >= local36) {
							local32 = 0;
						}
					}
				} else {
					local378 = local97[local40++];
					local378[1] = local122;
					local378[2] = local178 + local134;
					local378[0] = local30;
					this.method478(local30 + local26, local22, local178, local118, local108, local134);
					local30 = local122;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[[IIILjava/util/Random;BI)V")
	private void method478(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21 = this.anInt780 > 0 ? 4096 - Static3.method61(arg4, this.anInt780) : 4096;
		@Pc(29) int local29 = this.anInt763 * this.anInt769 >> 12;
		@Pc(46) int local46 = this.anInt769 - (local29 > 0 ? Static3.method61(arg4, local29) : 0);
		if (Static176.anInt3921 <= arg0) {
			arg0 -= Static176.anInt3921;
		}
		@Pc(65) int local65;
		@Pc(92) int local92;
		if (local46 <= 0) {
			if (arg3 + arg0 <= Static176.anInt3921) {
				for (local65 = 0; local65 < arg5; local65++) {
					Static217.method2360(arg1[local65 + arg2], arg0, arg3, local21);
				}
			} else {
				local65 = Static176.anInt3921 - arg0;
				for (local92 = 0; local92 < arg5; local92++) {
					@Pc(100) int[] local100 = arg1[local92 + arg2];
					Static217.method2360(local100, arg0, local65, local21);
					Static217.method2360(local100, 0, arg3 - local65, local21);
				}
			}
		} else if (arg5 > 0 && arg3 > 0) {
			local65 = arg3 / 2;
			@Pc(138) int local138 = local65 < local46 ? local65 : local46;
			local92 = arg5 / 2;
			@Pc(147) int local147 = arg0 + local138;
			@Pc(154) int local154 = arg3 - local138 * 2;
			@Pc(165) int local165 = local92 < local46 ? local92 : local46;
			for (@Pc(167) int local167 = 0; local167 < arg5; local167++) {
				@Pc(175) int[] local175 = arg1[local167 + arg2];
				@Pc(184) int local184;
				@Pc(192) int local192;
				@Pc(200) int local200;
				if (local167 < local165) {
					local184 = local167 * local21 / local165;
					if (this.anInt764 == 0) {
						for (local192 = 0; local192 < local138; local192++) {
							local200 = local192 * local21 / local138;
							local175[local192 + arg0 & Static70.anInt1730] = local175[Static70.anInt1730 & arg3 + arg0 - local192 - 1] = local184 * local200 >> 12;
						}
					} else {
						for (local192 = 0; local192 < local138; local192++) {
							local200 = local192 * local21 / local138;
							local175[arg0 + local192 & Static70.anInt1730] = local175[Static70.anInt1730 & arg3 + arg0 - local192 - 1] = local200 >= local184 ? local184 : local200;
						}
					}
					if (local154 + local147 > Static176.anInt3921) {
						local192 = Static176.anInt3921 - local147;
						Static217.method2360(local175, local147, local192, local184);
						Static217.method2360(local175, 0, local154 - local192, local184);
					} else {
						Static217.method2360(local175, local147, local154, local184);
					}
				} else {
					local184 = arg5 - local167 - 1;
					if (local184 < local165) {
						local192 = local184 * local21 / local165;
						@Pc(351) int local351;
						if (this.anInt764 == 0) {
							for (local200 = 0; local200 < local138; local200++) {
								local351 = local200 * local21 / local138;
								local175[Static70.anInt1730 & arg0 + local200] = local175[Static70.anInt1730 & arg3 + arg0 - local200 - 1] = local351 * local192 >> 12;
							}
						} else {
							for (local200 = 0; local200 < local138; local200++) {
								local351 = local21 * local200 / local138;
								local175[local200 + arg0 & Static70.anInt1730] = local175[Static70.anInt1730 & arg0 + arg3 - local200 - 1] = local351 < local192 ? local351 : local192;
							}
						}
						if (local147 + local154 <= Static176.anInt3921) {
							Static217.method2360(local175, local147, local154, local192);
						} else {
							local200 = Static176.anInt3921 - local147;
							Static217.method2360(local175, local147, local200, local192);
							Static217.method2360(local175, 0, local154 - local200, local192);
						}
					} else {
						for (local192 = 0; local192 < local138; local192++) {
							local175[Static70.anInt1730 & arg0 + local192] = local175[Static70.anInt1730 & arg0 + arg3 - local192 - 1] = local192 * local21 / local138;
						}
						if (Static176.anInt3921 >= local154 + local147) {
							Static217.method2360(local175, local147, local154, local21);
						} else {
							local200 = Static176.anInt3921 - local147;
							Static217.method2360(local175, local147, local200, local21);
							Static217.method2360(local175, 0, local154 - local200, local21);
						}
					}
				}
			}
		}
	}
}
