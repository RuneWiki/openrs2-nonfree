import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Lclient!ne;")
	public static Class139 aClass139_4;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	public static int anInt1444 = 0;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public static int anInt1447 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([[BILclient!ea;[[BZI[[B[[I[[BLclient!dn;IILclient!dn;)V")
	public static void method1397(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int[][] arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) Class51 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class51 arg11) {
		for (@Pc(3) int local3 = 0; local3 < arg5; local3++) {
			for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
				if (Static288.method5007() || Static64.method1603(arg10, local3, Static322.anInt611, local9)) {
					@Pc(31) byte local31 = arg3[local3][local9];
					@Pc(37) byte local37 = arg8[local3][local9];
					@Pc(45) int local45 = arg6[local3][local9] & 0xFF;
					@Pc(53) int local53 = arg0[local3][local9] & 0xFF;
					@Pc(66) Class9 local66 = local45 == 0 ? null : Static355.method6032(local45 - 1);
					@Pc(78) Class11 local78 = local53 == 0 ? null : Static209.method3853(local53 - 1);
					@Pc(80) int local80 = 0;
					@Pc(82) int local82 = 0;
					if (local31 != 0) {
						local82 = local66 == null ? 0 : Static350.anIntArray635[local31];
						local80 = local78 == null ? 0 : Static211.anIntArray398[local31];
					} else if (local66 != null) {
						local82 = Static350.anIntArray635[local31];
					} else if (local78 != null) {
						local80 = Static350.anIntArray635[local31];
					}
					@Pc(120) int local120 = local82 + local80;
					@Pc(122) int local122 = 0;
					if (local120 != 0) {
						@Pc(127) int[] local127 = new int[local120];
						@Pc(130) int[] local130 = new int[local120];
						@Pc(133) int[] local133 = new int[local120];
						@Pc(136) int[] local136 = new int[local120];
						@Pc(138) boolean local138 = false;
						@Pc(156) int local156;
						@Pc(184) int local184;
						if (local66 == null || local66.anInt200 == -1 && local66.anInt205 == -1 && local66.anInt202 == -1) {
							for (local156 = 0; local156 < local82; local156++) {
								local127[local122] = -1;
								local122++;
							}
						} else {
							local156 = arg2.method5177() ? local66.anInt202 : local66.anInt192;
							if (!Static306.aBoolean497) {
								local156 = -1;
							}
							for (local184 = 0; local184 < local82; local184++) {
								local133[local122] = local156;
								local136[local122] = local66.anInt198;
								if (local66.anInt200 == -1) {
									local127[local122] = -1;
								} else {
									local127[local122] = local66.anInt200;
								}
								if (local66.anInt205 == -1) {
									local130[local122] = -1;
								} else {
									local138 = true;
									local130[local122] = local66.anInt205;
								}
								local122++;
							}
							if (!arg4 && arg10 == 0) {
								Static117.method2047(local3, local9, local66.anInt194, local66.anInt193 * 8);
							}
						}
						if (!local138) {
							local130 = null;
						}
						if (local78 == null) {
							for (local156 = 0; local156 < local80; local156++) {
								local127[local122] = -1;
								local122++;
							}
						} else {
							local156 = local78.anInt317;
							if (!Static306.aBoolean497) {
								local156 = -1;
							}
							for (local184 = 0; local184 < local80; local184++) {
								local133[local122] = local156;
								local136[local122] = local78.anInt318;
								local127[local122] = arg7[local3][local9];
								if (local130 != null) {
									local130[local122] = -1;
								}
								local122++;
							}
						}
						local156 = Static283.anIntArray541.length;
						@Pc(321) int[] local321 = arg4 ? new int[local156] : null;
						@Pc(324) int[] local324 = new int[local156];
						@Pc(327) int[] local327 = new int[local156];
						@Pc(335) int local335;
						@Pc(339) int local339;
						@Pc(423) int local423;
						@Pc(432) int local432;
						for (@Pc(329) int local329 = 0; local329 < local156; local329++) {
							local335 = Static283.anIntArray541[local329];
							local339 = Static195.anIntArray386[local329];
							if (local37 == 0) {
								local324[local329] = local335;
								local327[local329] = local339;
							} else if (local37 == 1) {
								local324[local329] = local339;
								local327[local329] = 128 - local335;
							} else if (local37 == 2) {
								local324[local329] = 128 - local335;
								local327[local329] = 128 - local339;
							} else if (local37 == 3) {
								local324[local329] = 128 - local339;
								local327[local329] = local335;
							}
							if (arg4 && Static101.aBooleanArrayArray1[local31][local329]) {
								local423 = local324[local329] + (local3 << 7);
								local432 = (local9 << 7) + local327[local329];
								local321[local329] = arg11.method1844(local423, local432) - arg9.method1844(local423, local432);
							}
						}
						local335 = arg9.method1856(local3, local9);
						local339 = arg9.method1856(local3 + 1, local9);
						local423 = arg9.method1856(local3 + 1, local9 + 1);
						local432 = arg9.method1856(local3, local9 + 1);
						if (arg10 > 0) {
							@Pc(485) boolean local485 = true;
							if (local53 == 0 && local31 != 0) {
								local485 = false;
							}
							if (local45 > 0 && local66 != null && !local66.aBoolean15) {
								local485 = false;
							}
							if (local485 && local339 == local335 && local335 == local423 && local432 == local335) {
								Static8.aByteArrayArrayArray3[arg10][local3][local9] = (byte) (Static8.aByteArrayArrayArray3[arg10][local3][local9] | 0x4);
							}
						}
						@Pc(540) int local540 = 0;
						@Pc(542) int local542 = 0;
						if (arg4) {
							local540 = Static21.method438(local3, local9);
							local542 = Static311.method3259(local3, local9);
						}
						arg9.method1850(local3, local9, local324, local321, local327, Static85.anIntArrayArray28[local31], Static99.anIntArrayArray31[local31], Static318.anIntArrayArray93[local31], local127, local130, local133, local136, local540, local542);
						Static1.method3(arg10, local3, local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
	public static void method1398() {
		if (Static229.anInt4634 <= 0) {
			Static163.aString20 = "";
			return;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < Static17.aStringArray4.length; local20++) {
			if (Static17.aStringArray4[local20].startsWith("--> ")) {
				local18++;
				if (local18 == Static229.anInt4634) {
					Static163.aString20 = Static17.aStringArray4[local20].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)V")
	public static void method1400(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 4);
		local8.method856();
	}
}
