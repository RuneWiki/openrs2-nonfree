import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
	private int anInt1821;

	@OriginalMember(owner = "client!ii", name = "fb", descriptor = "I")
	private int anInt1831 = 1024;

	@OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
	private int anInt1830 = 1024;

	@OriginalMember(owner = "client!ii", name = "hb", descriptor = "I")
	private int anInt1833 = 819;

	@OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
	private int anInt1825 = 0;

	@OriginalMember(owner = "client!ii", name = "cb", descriptor = "I")
	private int anInt1829 = 409;

	@OriginalMember(owner = "client!ii", name = "nb", descriptor = "I")
	private int anInt1837 = 1024;

	@OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
	private int anInt1822 = 1024;

	@OriginalMember(owner = "client!ii", name = "tb", descriptor = "I")
	private int anInt1841 = 0;

	@OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
	private int anInt1824 = 2048;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1596(arg0);
		if (!super.aClass52_41.aBoolean103) {
			return local11;
		}
		@Pc(26) int[][] local26 = super.aClass52_41.method1597();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(44) boolean local44 = true;
		@Pc(51) int local51 = this.anInt1822 * Static135.anInt2897 >> 12;
		@Pc(58) int local58 = this.anInt1824 * Static135.anInt2897 >> 12;
		@Pc(65) int local65 = this.anInt1833 * Static102.anInt2347 >> 12;
		@Pc(72) int local72 = this.anInt1829 * Static102.anInt2347 >> 12;
		if (local65 <= 1) {
			return local26[arg0];
		}
		this.anInt1821 = Static135.anInt2897 / 8 * this.anInt1831 >> 12;
		@Pc(96) int local96 = Static135.anInt2897 / local51 + 1;
		@Pc(100) int[][] local100 = new int[local96][3];
		@Pc(104) int[][] local104 = new int[local96][3];
		@Pc(111) Random local111 = new Random((long) this.anInt1841);
		while (true) {
			while (true) {
				@Pc(121) int local121 = Static4.method87(local111, local58 - local51) + local51;
				@Pc(131) int local131 = Static4.method87(local111, local65 - local72) + local72;
				@Pc(135) int local135 = local32 + local121;
				if (Static135.anInt2897 < local135) {
					local121 = Static135.anInt2897 - local32;
					local135 = Static135.anInt2897;
				}
				@Pc(161) int local161;
				@Pc(163) int local163;
				if (local38) {
					local161 = 0;
				} else {
					@Pc(153) int local153 = local36;
					@Pc(157) int[] local157 = local100[local36];
					local161 = local157[2];
					local163 = 0;
					@Pc(167) int local167 = local135 + local30;
					if (local167 < 0) {
						local167 += Static135.anInt2897;
					}
					if (Static135.anInt2897 < local167) {
						local167 -= Static135.anInt2897;
					}
					while (true) {
						@Pc(191) int[] local191 = local100[local153];
						if (local167 >= local191[0] && local167 <= local191[1]) {
							if (local153 != local36) {
								@Pc(225) int local225 = local30 + local32;
								if (local225 < 0) {
									local225 += Static135.anInt2897;
								}
								if (Static135.anInt2897 < local225) {
									local225 -= Static135.anInt2897;
								}
								for (@Pc(243) int local243 = 1; local243 <= local163; local243++) {
									@Pc(253) int[] local253 = local100[(local36 + local243) % local40];
									local161 = Math.max(local161, local253[2]);
								}
								for (@Pc(269) int local269 = 0; local269 <= local163; local269++) {
									@Pc(279) int[] local279 = local100[(local269 + local36) % local40];
									@Pc(283) int local283 = local279[2];
									if (local161 != local283) {
										@Pc(290) int local290 = local279[0];
										@Pc(294) int local294 = local279[1];
										@Pc(305) int local305;
										@Pc(309) int local309;
										if (local167 > local225) {
											local305 = Math.max(local225, local290);
											local309 = Math.min(local167, local294);
										} else if (local290 == 0) {
											local309 = Math.min(local167, local294);
											local305 = 0;
										} else {
											local305 = Math.max(local225, local290);
											local309 = Static135.anInt2897;
										}
										this.method1480(local111, local26, local309 - local305, -local283 + local161, local283, local305 + local34);
									}
								}
							}
							local36 = local153;
							break;
						}
						local163++;
						local153++;
						if (local153 >= local40) {
							local153 = 0;
						}
					}
				}
				if (local131 + local161 > Static102.anInt2347) {
					local131 = Static102.anInt2347 - local161;
				} else {
					local44 = false;
				}
				@Pc(405) int[] local405;
				if (Static135.anInt2897 == local135) {
					this.method1480(local111, local26, local121, local131, local161, local28 + local32);
					if (local44) {
						return local11;
					}
					local38 = false;
					local34 = local28;
					local44 = true;
					local36 = 0;
					@Pc(400) int[][] local400 = local100;
					local405 = local104[local42++];
					local405[2] = local161 + local131;
					local405[0] = local32;
					local32 = 0;
					local405[1] = local135;
					local40 = local42;
					local28 = Static4.method87(local111, Static135.anInt2897);
					local100 = local104;
					local42 = 0;
					local30 = local28 - local34;
					local163 = local30;
					if (local30 < 0) {
						local163 = local30 + Static135.anInt2897;
					}
					local104 = local400;
					if (local163 > Static135.anInt2897) {
						local163 -= Static135.anInt2897;
					}
					while (true) {
						@Pc(466) int[] local466 = local100[local36];
						if (local466[0] <= local163 && local163 <= local466[1]) {
							break;
						}
						local36++;
						if (local36 >= local40) {
							local36 = 0;
						}
					}
				} else {
					local405 = local104[local42++];
					local405[0] = local32;
					local405[1] = local135;
					local405[2] = local131 + local161;
					this.method1480(local111, local26, local121, local131, local161, local32 + local28);
					local32 = local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/util/Random;[[IIIIII)V")
	private void method1480(@OriginalArg(0) Random arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt1837 > 0 ? 4096 - Static4.method87(arg0, this.anInt1837) : 4096;
		@Pc(34) int local34 = this.anInt1830 * this.anInt1821 >> 12;
		@Pc(49) int local49 = this.anInt1821 - (local34 > 0 ? Static4.method87(arg0, local34) : 0);
		if (arg5 >= Static135.anInt2897) {
			arg5 -= Static135.anInt2897;
		}
		@Pc(69) int local69;
		@Pc(96) int local96;
		if (local49 <= 0) {
			if (arg2 + arg5 <= Static135.anInt2897) {
				for (local69 = 0; local69 < arg3; local69++) {
					Static222.method2223(arg1[local69 + arg4], arg5, arg2, local22);
				}
			} else {
				local69 = Static135.anInt2897 - arg5;
				for (local96 = 0; local96 < arg3; local96++) {
					@Pc(104) int[] local104 = arg1[local96 + arg4];
					Static222.method2223(local104, arg5, local69, local22);
					Static222.method2223(local104, 0, arg2 - local69, local22);
				}
			}
		} else if (arg3 > 0 && arg2 > 0) {
			local69 = arg2 / 2;
			local96 = arg3 / 2;
			@Pc(148) int local148 = local69 < local49 ? local69 : local49;
			@Pc(152) int local152 = local148 + arg5;
			@Pc(163) int local163 = local49 > local96 ? local96 : local49;
			@Pc(170) int local170 = arg2 - local148 * 2;
			for (@Pc(172) int local172 = 0; local172 < arg3; local172++) {
				@Pc(180) int[] local180 = arg1[arg4 + local172];
				@Pc(193) int local193;
				@Pc(198) int local198;
				@Pc(206) int local206;
				if (local172 < local163) {
					local193 = local172 * local22 / local163;
					if (this.anInt1825 == 0) {
						for (local198 = 0; local198 < local148; local198++) {
							local206 = local198 * local22 / local148;
							local180[Static201.anInt3995 & arg5 + local198] = local180[arg5 + arg2 - local198 - 1 & Static201.anInt3995] = local206 * local193 >> 12;
						}
					} else {
						for (local198 = 0; local198 < local148; local198++) {
							local206 = local198 * local22 / local148;
							local180[arg5 + local198 & Static201.anInt3995] = local180[arg2 + arg5 - local198 - 1 & Static201.anInt3995] = local206 < local193 ? local206 : local193;
						}
					}
					if (Static135.anInt2897 < local170 + local152) {
						local198 = Static135.anInt2897 - local152;
						Static222.method2223(local180, local152, local198, local193);
						Static222.method2223(local180, 0, local170 - local198, local193);
					} else {
						Static222.method2223(local180, local152, local170, local193);
					}
				} else {
					local193 = arg3 - local172 - 1;
					if (local193 < local163) {
						local198 = local22 * local193 / local163;
						@Pc(348) int local348;
						if (this.anInt1825 == 0) {
							for (local206 = 0; local206 < local148; local206++) {
								local348 = local206 * local22 / local148;
								local180[arg5 + local206 & Static201.anInt3995] = local180[Static201.anInt3995 & arg5 + arg2 - local206 - 1] = local198 * local348 >> 12;
							}
						} else {
							for (local206 = 0; local206 < local148; local206++) {
								local348 = local206 * local22 / local148;
								local180[local206 + arg5 & Static201.anInt3995] = local180[Static201.anInt3995 & arg2 + arg5 - local206 - 1] = local198 <= local348 ? local198 : local348;
							}
						}
						if (local170 + local152 > Static135.anInt2897) {
							local206 = Static135.anInt2897 - local152;
							Static222.method2223(local180, local152, local206, local198);
							Static222.method2223(local180, 0, local170 - local206, local198);
						} else {
							Static222.method2223(local180, local152, local170, local198);
						}
					} else {
						for (local198 = 0; local198 < local148; local198++) {
							local180[Static201.anInt3995 & local198 + arg5] = local180[Static201.anInt3995 & arg5 + arg2 - local198 - 1] = local22 * local198 / local148;
						}
						if (local152 + local170 <= Static135.anInt2897) {
							Static222.method2223(local180, local152, local170, local22);
						} else {
							local206 = Static135.anInt2897 - local152;
							Static222.method2223(local180, local152, local206, local22);
							Static222.method2223(local180, 0, local170 - local206, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1841 = arg0.method260();
		} else if (arg1 == 1) {
			this.anInt1822 = arg0.method269();
		} else if (arg1 == 2) {
			this.anInt1824 = arg0.method269();
		} else if (arg1 == 3) {
			this.anInt1829 = arg0.method269();
		} else if (arg1 == 4) {
			this.anInt1833 = arg0.method269();
		} else if (arg1 == 5) {
			this.anInt1831 = arg0.method269();
		} else if (arg1 == 6) {
			this.anInt1825 = arg0.method260();
		} else if (arg1 == 7) {
			this.anInt1830 = arg0.method269();
		} else if (arg1 == 8) {
			this.anInt1837 = arg0.method269();
		}
	}
}
