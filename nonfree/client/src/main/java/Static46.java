import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!ja;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_327 = Static158.method3034("::rect_debug");

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_328 = Static158.method3034("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	public static int anInt1431 = 0;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public static int anInt1433 = 0;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_329 = Static158.method3034("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_330 = Static158.method3034(" ");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ra;BII)V")
	public static void method1059(@OriginalArg(0) Class72 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt3927 == 1) {
			Static61.method1423(Static101.aClass60_807, arg0.aClass60_1061, (short) 39, 0L, 0, arg0.anInt3935);
		}
		if (arg0.anInt3927 == 2 && !Static58.aBoolean74) {
			@Pc(37) Class60 local37 = Static42.method918(arg0);
			if (local37 != null) {
				Static61.method1423(Static193.method3536(new Class60[] { Static176.aClass60_1184, arg0.aClass60_1058 }), local37, (short) 36, 0L, -1, arg0.anInt3935);
			}
		}
		if (arg0.anInt3927 == 3) {
			Static61.method1423(Static101.aClass60_807, Static58.aClass60_425, (short) 12, 0L, 0, arg0.anInt3935);
		}
		if (arg0.anInt3927 == 4) {
			Static61.method1423(Static101.aClass60_807, arg0.aClass60_1061, (short) 50, 0L, 0, arg0.anInt3935);
		}
		if (arg0.anInt3927 == 5) {
			Static61.method1423(Static101.aClass60_807, arg0.aClass60_1061, (short) 25, 0L, 0, arg0.anInt3935);
		}
		if (arg0.anInt3927 == 6 && Static164.aClass72_10 == null) {
			Static61.method1423(Static101.aClass60_807, arg0.aClass60_1061, (short) 35, 0L, -1, arg0.anInt3935);
		}
		@Pc(155) int local155;
		@Pc(161) int local161;
		if (arg0.anInt3932 == 2) {
			local155 = 0;
			for (@Pc(157) int local157 = 0; local157 < arg0.anInt3871; local157++) {
				for (local161 = 0; local161 < arg0.anInt3878; local161++) {
					@Pc(170) int local170 = local157 * (arg0.anInt3888 + 32);
					@Pc(178) int local178 = (arg0.anInt3899 + 32) * local161;
					if (local155 < 20) {
						local170 += arg0.anIntArray426[local155];
						local178 += arg0.anIntArray428[local155];
					}
					if (local178 <= arg2 && local170 <= arg1 && local178 + 32 > arg2 && arg1 < local170 + 32) {
						Static191.anInt4559 = local155;
						Static75.aClass72_6 = arg0;
						if (arg0.anIntArray436[local155] > 0) {
							@Pc(238) Class2_Sub1_Sub8 local238 = Static88.method2046(arg0.anIntArray436[local155] - 1);
							if (Static29.anInt889 == 1 && Static70.method1638(Static26.method637(arg0))) {
								if (arg0.anInt3935 != Static16.anInt517 || local155 != Static6.anInt275) {
									Static61.method1423(Static193.method3536(new Class60[] { Static162.aClass60_1102, Static189.aClass60_1285, local238.aClass60_363 }), Static56.aClass60_405, (short) 21, (long) local238.anInt1545, local155, arg0.anInt3935);
								}
							} else if (!Static58.aBoolean74 || !Static70.method1638(Static26.method637(arg0))) {
								@Pc(342) Class60[] local342 = local238.aClass60Array9;
								if (Static67.aBoolean87) {
									local342 = Static174.method3268(local342);
								}
								@Pc(356) int local356;
								@Pc(405) byte local405;
								if (Static70.method1638(Static26.method637(arg0))) {
									for (local356 = 4; local356 >= 3; local356--) {
										if (local342 != null && local342[local356] != null) {
											if (local356 == 3) {
												local405 = 28;
											} else {
												local405 = 58;
											}
											Static61.method1423(Static193.method3536(new Class60[] { Static103.aClass60_840, local238.aClass60_363 }), local342[local356], local405, (long) local238.anInt1545, local155, arg0.anInt3935);
										} else if (local356 == 4) {
											Static61.method1423(Static193.method3536(new Class60[] { Static103.aClass60_840, local238.aClass60_363 }), Static171.aClass60_1153, (short) 58, (long) local238.anInt1545, local155, arg0.anInt3935);
										}
									}
								}
								if (Static8.method254(Static26.method637(arg0))) {
									Static61.method1423(Static193.method3536(new Class60[] { Static103.aClass60_840, local238.aClass60_363 }), Static56.aClass60_405, (short) 3, (long) local238.anInt1545, local155, arg0.anInt3935);
								}
								if (Static70.method1638(Static26.method637(arg0)) && local342 != null) {
									for (local356 = 2; local356 >= 0; local356--) {
										if (local342[local356] != null) {
											local405 = 0;
											if (local356 == 0) {
												local405 = 10;
											}
											if (local356 == 1) {
												local405 = 31;
											}
											if (local356 == 2) {
												local405 = 1;
											}
											Static61.method1423(Static193.method3536(new Class60[] { Static103.aClass60_840, local238.aClass60_363 }), local342[local356], local405, (long) local238.anInt1545, local155, arg0.anInt3935);
										}
									}
								}
								local342 = arg0.aClass60Array23;
								if (Static67.aBoolean87) {
									local342 = Static174.method3268(local342);
								}
								if (local342 != null) {
									for (local356 = 4; local356 >= 0; local356--) {
										if (local342[local356] != null) {
											local405 = 0;
											if (local356 == 0) {
												local405 = 49;
											}
											if (local356 == 1) {
												local405 = 7;
											}
											if (local356 == 2) {
												local405 = 8;
											}
											if (local356 == 3) {
												local405 = 33;
											}
											if (local356 == 4) {
												local405 = 4;
											}
											Static61.method1423(Static193.method3536(new Class60[] { Static103.aClass60_840, local238.aClass60_363 }), local342[local356], local405, (long) local238.anInt1545, local155, arg0.anInt3935);
										}
									}
								}
								Static61.method1423(Static193.method3536(new Class60[] { Static103.aClass60_840, local238.aClass60_363 }), Static88.aClass60_704, (short) 1001, (long) local238.anInt1545, local155, arg0.anInt3935);
							} else if ((Static101.anInt2923 & 0x10) == 16) {
								Static61.method1423(Static193.method3536(new Class60[] { Static167.aClass60_1132, Static189.aClass60_1285, local238.aClass60_363 }), Static4.aClass60_35, (short) 20, (long) local238.anInt1545, local155, arg0.anInt3935);
							}
						}
					}
					local155++;
				}
			}
		}
		if (!arg0.aBoolean151) {
			return;
		}
		if (Static58.aBoolean74) {
			if (Static128.method2704(Static26.method637(arg0)) && (Static101.anInt2923 & 0x20) == 32) {
				Static61.method1423(Static193.method3536(new Class60[] { Static167.aClass60_1132, Static104.aClass60_846, arg0.aClass60_1059 }), Static4.aClass60_35, (short) 22, 0L, arg0.anInt3911, arg0.anInt3935);
				return;
			}
			return;
		}
		@Pc(717) Class60 local717;
		for (local155 = 9; local155 >= 5; local155--) {
			local717 = Static18.method3389(local155, arg0);
			if (local717 != null) {
				Static61.method1423(arg0.aClass60_1059, local717, (short) 1003, (long) (local155 + 1), arg0.anInt3911, arg0.anInt3935);
			}
		}
		local717 = Static42.method918(arg0);
		if (local717 != null) {
			Static61.method1423(arg0.aClass60_1059, local717, (short) 36, 0L, arg0.anInt3911, arg0.anInt3935);
		}
		for (local161 = 4; local161 >= 0; local161--) {
			@Pc(771) Class60 local771 = Static18.method3389(local161, arg0);
			if (local771 != null) {
				Static61.method1423(arg0.aClass60_1059, local771, (short) 15, (long) (local161 + 1), arg0.anInt3911, arg0.anInt3935);
			}
		}
		if (Static139.method2832(Static26.method637(arg0))) {
			Static61.method1423(Static101.aClass60_807, Static93.aClass60_761, (short) 35, 0L, arg0.anInt3911, arg0.anInt3935);
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
	public static void method1061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18;
		if (arg0 != Static106.anInt3045) {
			Static15.anIntArray41 = new int[arg0];
			for (local18 = 0; local18 < arg0; local18++) {
				Static15.anIntArray41[local18] = (local18 << 12) / arg0;
			}
			Static106.anInt3045 = arg0;
			Static96.anInt3099 = arg0 - 1;
			Static146.anInt3812 = arg0 == 64 ? 2048 : 4096;
		}
		if (Static57.anInt1795 == arg1) {
			return;
		}
		if (Static57.anInt1795 == Static106.anInt3045) {
			Static160.anIntArray187 = Static15.anIntArray41;
		} else {
			Static160.anIntArray187 = new int[arg1];
			for (local18 = 0; local18 < arg1; local18++) {
				Static160.anIntArray187[local18] = (local18 << 12) / arg1;
			}
		}
		Static53.anInt1668 = arg1 - 1;
		Static57.anInt1795 = arg1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ud;BI)V")
	public static void method1062(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		Static112.method2466(arg1, arg0.anInt3273, arg0.anInt3302);
	}
}
