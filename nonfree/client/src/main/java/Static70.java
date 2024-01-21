import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	public static int anInt1621;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
	public static int anInt1623;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Lclient!n;")
	public static Class51 aClass51_3;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
	public static int anInt1626;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "Lclient!af;")
	private static Class5 aClass5_816 = Static45.method1937("Cancel");

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "Lclient!af;")
	public static Class5 aClass5_817 = Static45.method1937("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "[Lclient!af;")
	public static Class5[] aClass5Array9 = new Class5[1000];

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "Lclient!af;")
	public static Class5 aClass5_819 = aClass5_816;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "Lclient!af;")
	public static Class5 aClass5_820 = Static45.method1937("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Z")
	public static boolean method1220() {
		return Static125.anInt3198 == 0 ? Static2.aClass1_Sub1_Sub3_1.method1172() : true;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
	public static int method1221() {
		return 6;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public static void method1222() {
		if (Static79.aBoolean64 && Static42.anInt1065 != Static7.anInt213) {
			Static112.method1926(Static7.anInt213, Static42.anInt1066, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0], Static108.anInt2662, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0]);
		} else if (Static109.anInt2695 != Static7.anInt213) {
			Static109.anInt2695 = Static7.anInt213;
			Static20.method487(Static7.anInt213);
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public static void method1223() {
		aClass5_819 = null;
		aClass5_817 = null;
		aClass51_3 = null;
		aClass5_820 = null;
		aClass5Array9 = null;
		aClass5_816 = null;
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
	public static void method1224() {
		if (Static102.aBooleanArray24[96]) {
			Static82.anInt2066 += (-Static82.anInt2066 - 24) / 2;
		} else if (Static102.aBooleanArray24[97]) {
			Static82.anInt2066 += (24 - Static82.anInt2066) / 2;
		} else {
			Static82.anInt2066 /= 2;
		}
		Static3.anInt58 = Static82.anInt2066 / 2 + Static3.anInt58 & 0x7FF;
		if (Static102.aBooleanArray24[98]) {
			Static18.anInt3034 += (12 - Static18.anInt3034) / 2;
		} else if (Static102.aBooleanArray24[99]) {
			Static18.anInt3034 += (-Static18.anInt3034 - 12) / 2;
		} else {
			Static18.anInt3034 /= 2;
		}
		Static8.anInt263 += Static18.anInt3034 / 2;
		if (Static8.anInt263 < 128) {
			Static8.anInt263 = 128;
		}
		if (Static8.anInt263 > 383) {
			Static8.anInt263 = 383;
		}
		@Pc(101) int local101 = Static78.anInt1878 + Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089;
		@Pc(106) int local106 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 + Static69.anInt1603;
		if (Static57.anInt1364 - local101 < -500 || Static57.anInt1364 - local101 > 500 || Static125.anInt3203 - local106 < -500 || Static125.anInt3203 - local106 > 500) {
			Static125.anInt3203 = local106;
			Static57.anInt1364 = local101;
		}
		if (local101 != Static57.anInt1364) {
			Static57.anInt1364 += (local101 - Static57.anInt1364) / 16;
		}
		if (local106 != Static125.anInt3203) {
			Static125.anInt3203 += (local106 - Static125.anInt3203) / 16;
		}
		@Pc(169) int local169 = Static57.anInt1364 >> 7;
		@Pc(171) int local171 = 0;
		@Pc(175) int local175 = Static125.anInt3203 >> 7;
		@Pc(181) int local181 = Static102.method1746(Static125.anInt3203, Static7.anInt213, Static57.anInt1364);
		@Pc(199) int local199;
		if (local169 > 3 && local175 > 3 && local169 < 100 && local175 < 100) {
			for (local199 = local169 - 4; local199 <= local169 + 4; local199++) {
				for (@Pc(205) int local205 = local175 - 4; local205 <= local175 + 4; local205++) {
					@Pc(209) int local209 = Static7.anInt213;
					if (local209 < 3 && (Static25.aByteArrayArrayArray1[1][local199][local205] & 0x2) == 2) {
						local209++;
					}
					@Pc(237) int local237 = local181 - Static95.anIntArrayArrayArray2[local209][local199][local205];
					if (local171 < local237) {
						local171 = local237;
					}
				}
			}
		}
		local199 = local171 * 192;
		if (local199 > 98048) {
			local199 = 98048;
		}
		if (local199 < 32768) {
			local199 = 32768;
		}
		if (Static11.anInt323 < local199) {
			Static11.anInt323 += (local199 - Static11.anInt323) / 24;
		} else if (local199 < Static11.anInt323) {
			Static11.anInt323 += (local199 - Static11.anInt323) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)Lclient!oa;")
	public static Class1_Sub3_Sub13 method1225(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub13 local10 = (Class1_Sub3_Sub13) Static69.aClass28_46.method796((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static69.aClass41_11.method1710(3, arg0);
		local10 = new Class1_Sub3_Sub13();
		if (local20 != null) {
			local10.method1523(new Class1_Sub20(local20));
		}
		Static69.aClass28_46.method789(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IJ)V")
	public static void method1226(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static23.method534(arg0 - 1L);
			Static23.method534(1L);
		} else {
			Static23.method534(arg0);
		}
	}
}
