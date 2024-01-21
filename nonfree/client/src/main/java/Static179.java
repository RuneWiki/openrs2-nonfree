import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Lclient!hd;")
	public static Class3_Sub8 aClass3_Sub8_5;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Lclient!hg;")
	public static Class3_Sub9 aClass3_Sub9_1;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
	public static int anInt4268;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1491 = Static170.method3101("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1492 = Static170.method3101("(U3");

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Lclient!pa;")
	public static Class63 aClass63_31 = new Class63(100);

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1493 = Static170.method3101("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1494 = Static170.method3101("<)4col>");

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "Z")
	public static boolean aBoolean202 = false;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public static void method3193() {
		aClass3_Sub9_1 = null;
		aClass28_1493 = null;
		aClass28_1492 = null;
		aClass3_Sub8_5 = null;
		aClass63_31 = null;
		aClass28_1494 = null;
		aClass28_1491 = null;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
	public static void method3194() {
		if (!Static69.aBoolean112) {
			Static145.aClass28Array22[0] = Static107.aClass28_893;
			Static69.aClass28Array12[0] = Static156.aClass28_1306;
			Static21.aShortArray8[0] = 1003;
			Static82.anInt2400 = 1;
		}
		if (Static177.anInt4207 != -1) {
			Static94.method2074(Static177.anInt4207);
		}
		for (@Pc(33) int local33 = 0; local33 < Static2.anInt84; local33++) {
			if (Static137.aBooleanArray15[local33]) {
				Static118.aBooleanArray13[local33] = true;
			}
			Static138.aBooleanArray16[local33] = Static137.aBooleanArray15[local33];
			Static137.aBooleanArray15[local33] = false;
		}
		Static165.anInt3995 = Static14.anInt481;
		Static170.anInt4093 = -1;
		Static82.anInt2401 = -1;
		Static15.aClass33_5 = null;
		if (Static177.anInt4207 != -1) {
			Static2.anInt84 = 0;
			Static155.method2948(503, Static177.anInt4207, -1, 0, 0, 0, 0, 765);
		}
		Static147.method1774();
		Static57.method1260();
		if (Static69.aBoolean112) {
			Static59.method1337();
		} else if (Static170.anInt4093 != -1) {
			Static57.method1261(Static82.anInt2401, Static170.anInt4093);
		}
		if (Static116.anInt2985 == 3) {
			for (@Pc(100) int local100 = 0; local100 < Static2.anInt84; local100++) {
				if (Static138.aBooleanArray16[local100]) {
					Static147.method1768(Static24.anIntArray154[local100], Static64.anIntArray332[local100], Static78.anIntArray382[local100], Static166.anIntArray675[local100], 16711935, 128);
				} else if (Static118.aBooleanArray13[local100]) {
					Static147.method1768(Static24.anIntArray154[local100], Static64.anIntArray332[local100], Static78.anIntArray382[local100], Static166.anIntArray675[local100], 16711680, 128);
				}
			}
		}
		Static139.method2801(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800, Static171.anInt4109, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792, Static165.anInt3991);
		Static165.anInt3991 = 0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIZIIIIIBI)Z")
	public static boolean method3196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(4) int local4;
		for (@Pc(1) int local1 = 0; local1 < 104; local1++) {
			for (local4 = 0; local4 < 104; local4++) {
				Static164.anIntArrayArray33[local1][local4] = 0;
				Static110.anIntArrayArray23[local1][local4] = 99999999;
			}
		}
		local4 = arg1;
		@Pc(35) int local35 = arg6;
		Static164.anIntArrayArray33[arg1][arg6] = 99;
		Static110.anIntArrayArray23[arg1][arg6] = 0;
		@Pc(49) byte local49 = 0;
		Static105.anIntArray479[0] = arg1;
		@Pc(56) int local56 = local49 + 1;
		Static99.anIntArray464[0] = arg6;
		@Pc(60) boolean local60 = false;
		@Pc(62) int local62 = 0;
		@Pc(65) int local65 = Static105.anIntArray479.length;
		@Pc(70) int[][] local70 = Static45.aClass21Array1[Static171.anInt4109].anIntArrayArray12;
		@Pc(183) int local183;
		while (local56 != local62) {
			local35 = Static99.anIntArray464[local62];
			local4 = Static105.anIntArray479[local62];
			local62 = (local62 + 1) % local65;
			if (arg5 == local4 && arg9 == local35) {
				local60 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static45.aClass21Array1[Static171.anInt4109].method798(local35, arg5, arg0 - 1, arg9, arg10, local4)) {
					local60 = true;
					break;
				}
				if (arg0 < 10 && Static45.aClass21Array1[Static171.anInt4109].method807(arg10, arg0 - 1, local35, local4, arg9, arg5)) {
					local60 = true;
					break;
				}
			}
			if (arg2 != 0 && arg3 != 0 && Static45.aClass21Array1[Static171.anInt4109].method794(arg9, arg3, local35, arg5, local4, arg2, arg7)) {
				local60 = true;
				break;
			}
			local183 = Static110.anIntArrayArray23[local4][local35] + 1;
			if (local4 > 0 && Static164.anIntArrayArray33[local4 - 1][local35] == 0 && (local70[local4 - 1][local35] & 0x12C0108) == 0) {
				Static105.anIntArray479[local56] = local4 - 1;
				Static99.anIntArray464[local56] = local35;
				Static164.anIntArrayArray33[local4 - 1][local35] = 2;
				local56 = (local56 + 1) % local65;
				Static110.anIntArrayArray23[local4 - 1][local35] = local183;
			}
			if (local4 < 103 && Static164.anIntArrayArray33[local4 + 1][local35] == 0 && (local70[local4 + 1][local35] & 0x12C0180) == 0) {
				Static105.anIntArray479[local56] = local4 + 1;
				Static99.anIntArray464[local56] = local35;
				local56 = (local56 + 1) % local65;
				Static164.anIntArrayArray33[local4 + 1][local35] = 8;
				Static110.anIntArrayArray23[local4 + 1][local35] = local183;
			}
			if (local35 > 0 && Static164.anIntArrayArray33[local4][local35 - 1] == 0 && (local70[local4][local35 - 1] & 0x12C0102) == 0) {
				Static105.anIntArray479[local56] = local4;
				Static99.anIntArray464[local56] = local35 - 1;
				Static164.anIntArrayArray33[local4][local35 - 1] = 1;
				local56 = (local56 + 1) % local65;
				Static110.anIntArrayArray23[local4][local35 - 1] = local183;
			}
			if (local35 < 103 && Static164.anIntArrayArray33[local4][local35 + 1] == 0 && (local70[local4][local35 + 1] & 0x12C0120) == 0) {
				Static105.anIntArray479[local56] = local4;
				Static99.anIntArray464[local56] = local35 + 1;
				local56 = (local56 + 1) % local65;
				Static164.anIntArrayArray33[local4][local35 + 1] = 4;
				Static110.anIntArrayArray23[local4][local35 + 1] = local183;
			}
			if (local4 > 0 && local35 > 0 && Static164.anIntArrayArray33[local4 - 1][local35 - 1] == 0 && (local70[local4 - 1][local35 - 1] & 0x12C010E) == 0 && (local70[local4 - 1][local35] & 0x12C0108) == 0 && (local70[local4][local35 - 1] & 0x12C0102) == 0) {
				Static105.anIntArray479[local56] = local4 - 1;
				Static99.anIntArray464[local56] = local35 - 1;
				local56 = (local56 + 1) % local65;
				Static164.anIntArrayArray33[local4 - 1][local35 - 1] = 3;
				Static110.anIntArrayArray23[local4 - 1][local35 - 1] = local183;
			}
			if (local4 < 103 && local35 > 0 && Static164.anIntArrayArray33[local4 + 1][local35 - 1] == 0 && (local70[local4 + 1][local35 - 1] & 0x12C0183) == 0 && (local70[local4 + 1][local35] & 0x12C0180) == 0 && (local70[local4][local35 - 1] & 0x12C0102) == 0) {
				Static105.anIntArray479[local56] = local4 + 1;
				Static99.anIntArray464[local56] = local35 - 1;
				Static164.anIntArrayArray33[local4 + 1][local35 - 1] = 9;
				local56 = (local56 + 1) % local65;
				Static110.anIntArrayArray23[local4 + 1][local35 - 1] = local183;
			}
			if (local4 > 0 && local35 < 103 && Static164.anIntArrayArray33[local4 - 1][local35 + 1] == 0 && (local70[local4 - 1][local35 + 1] & 0x12C0138) == 0 && (local70[local4 - 1][local35] & 0x12C0108) == 0 && (local70[local4][local35 + 1] & 0x12C0120) == 0) {
				Static105.anIntArray479[local56] = local4 - 1;
				Static99.anIntArray464[local56] = local35 + 1;
				Static164.anIntArrayArray33[local4 - 1][local35 + 1] = 6;
				local56 = (local56 + 1) % local65;
				Static110.anIntArrayArray23[local4 - 1][local35 + 1] = local183;
			}
			if (local4 < 103 && local35 < 103 && Static164.anIntArrayArray33[local4 + 1][local35 + 1] == 0 && (local70[local4 + 1][local35 + 1] & 0x12C01E0) == 0 && (local70[local4 + 1][local35] & 0x12C0180) == 0 && (local70[local4][local35 + 1] & 0x12C0120) == 0) {
				Static105.anIntArray479[local56] = local4 + 1;
				Static99.anIntArray464[local56] = local35 + 1;
				local56 = (local56 + 1) % local65;
				Static164.anIntArrayArray33[local4 + 1][local35 + 1] = 12;
				Static110.anIntArrayArray23[local4 + 1][local35 + 1] = local183;
			}
		}
		Static155.anInt3870 = 0;
		@Pc(794) int local794;
		@Pc(802) int local802;
		@Pc(808) int local808;
		if (!local60) {
			if (!arg4) {
				return false;
			}
			local794 = 100;
			local183 = 1000;
			for (local802 = arg5 - 10; local802 <= arg5 + 10; local802++) {
				for (local808 = arg9 - 10; local808 <= arg9 + 10; local808++) {
					if (local802 >= 0 && local808 >= 0 && local802 < 104 && local808 < 104 && Static110.anIntArrayArray23[local802][local808] < 100) {
						@Pc(833) int local833 = 0;
						@Pc(835) int local835 = 0;
						if (local802 < arg5) {
							local833 = arg5 - local802;
						} else if (arg2 + arg5 - 1 < local802) {
							local833 = local802 + 1 - arg5 - arg2;
						}
						if (local808 < arg9) {
							local835 = arg9 - local808;
						} else if (arg3 + arg9 - 1 < local808) {
							local835 = local808 + 1 - arg9 - arg3;
						}
						@Pc(902) int local902 = local835 * local835 + local833 * local833;
						if (local183 > local902 || local183 == local902 && Static110.anIntArrayArray23[local802][local808] < local794) {
							local183 = local902;
							local4 = local802;
							local35 = local808;
							local794 = Static110.anIntArrayArray23[local802][local808];
						}
					}
				}
			}
			if (local183 == 1000) {
				return false;
			}
			if (local4 == arg1 && local35 == arg6) {
				return false;
			}
			Static155.anInt3870 = 1;
		}
		@Pc(966) byte local966 = 0;
		Static105.anIntArray479[0] = local4;
		local62 = local966 + 1;
		Static99.anIntArray464[0] = local35;
		local183 = local794 = Static164.anIntArrayArray33[local4][local35];
		while (arg1 != local4 || local35 != arg6) {
			if (local183 != local794) {
				local794 = local183;
				Static105.anIntArray479[local62] = local4;
				Static99.anIntArray464[local62++] = local35;
			}
			if ((local183 & 0x1) != 0) {
				local35++;
			} else if ((local183 & 0x4) != 0) {
				local35--;
			}
			if ((local183 & 0x2) != 0) {
				local4++;
			} else if ((local183 & 0x8) != 0) {
				local4--;
			}
			local183 = Static164.anIntArrayArray33[local4][local35];
		}
		if (local62 > 0) {
			local65 = local62--;
			@Pc(1063) int local1063 = Static105.anIntArray479[local62];
			local802 = Static99.anIntArray464[local62];
			if (local65 > 25) {
				local65 = 25;
			}
			if (arg8 == 0) {
				Static51.aClass3_Sub8_Sub1_2.method1559(198);
				Static51.aClass3_Sub8_Sub1_2.method1550(local65 + local65 + 3);
			}
			if (arg8 == 1) {
				Static51.aClass3_Sub8_Sub1_2.method1559(249);
				Static51.aClass3_Sub8_Sub1_2.method1550(local65 + local65 + 3 + 14);
			}
			if (arg8 == 2) {
				Static51.aClass3_Sub8_Sub1_2.method1559(95);
				Static51.aClass3_Sub8_Sub1_2.method1550(local65 + local65 + 3);
			}
			Static51.aClass3_Sub8_Sub1_2.method1514(local802 + Static29.anInt907);
			Static51.aClass3_Sub8_Sub1_2.method1524(Static111.anInt2843 + local1063);
			Static21.anInt574 = Static105.anIntArray479[0];
			Static41.anInt1106 = Static99.anIntArray464[0];
			for (local808 = 1; local808 < local65; local808++) {
				local62--;
				Static51.aClass3_Sub8_Sub1_2.method1523(Static105.anIntArray479[local62] - local1063);
				Static51.aClass3_Sub8_Sub1_2.method1523(Static99.anIntArray464[local62] - local802);
			}
			Static51.aClass3_Sub8_Sub1_2.method1550(Static78.aBooleanArray12[82] ? 1 : 0);
			return true;
		} else if (arg8 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ah;B)V")
	public static void method3197(@OriginalArg(0) Class7 arg0) {
		Static22.aClass7_14 = arg0;
	}
}
