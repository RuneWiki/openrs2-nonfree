import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1128 = Static38.method685("null");

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
	public static int anInt3790 = 0;

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1129 = Static38.method685("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[112];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V")
	public static void method2580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub17 local12 = (Class2_Sub17) Static89.aClass16_7.method479((long) arg3);
		if (local12 == null) {
			local12 = new Class2_Sub17();
			Static89.aClass16_7.method480(local12, (long) arg3);
		}
		if (local12.anIntArray240.length <= arg2) {
			@Pc(38) int[] local38 = new int[arg2 + 1];
			@Pc(43) int[] local43 = new int[arg2 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray240.length; local45++) {
				local38[local45] = local12.anIntArray240[local45];
				local43[local45] = local12.anIntArray239[local45];
			}
			for (@Pc(71) int local71 = local12.anIntArray240.length; local71 < arg2; local71++) {
				local38[local71] = -1;
				local43[local71] = 0;
			}
			local12.anIntArray240 = local38;
			local12.anIntArray239 = local43;
		}
		local12.anIntArray240[arg2] = arg1;
		local12.anIntArray239[arg2] = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
	public static void method2581() {
		aClass6_1128 = null;
		aClass6_1129 = null;
		aBooleanArray19 = null;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V")
	public static void method2582() {
		if (aBooleanArray19[98]) {
			Static2.anInt63 += (12 - Static2.anInt63) / 2;
		} else if (aBooleanArray19[99]) {
			Static2.anInt63 += (-Static2.anInt63 - 12) / 2;
		} else {
			Static2.anInt63 /= 2;
		}
		Static30.anInt768 += Static2.anInt63 / 2;
		if (Static30.anInt768 < 128) {
			Static30.anInt768 = 128;
		}
		if (aBooleanArray19[96]) {
			Static16.anInt433 += (-Static16.anInt433 - 24) / 2;
		} else if (aBooleanArray19[97]) {
			Static16.anInt433 += (24 - Static16.anInt433) / 2;
		} else {
			Static16.anInt433 /= 2;
		}
		@Pc(93) int local93 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 + Static60.anInt1425;
		@Pc(98) int local98 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 + Static92.anInt2288;
		if (Static68.anInt1725 - local98 < -500 || Static68.anInt1725 - local98 > 500 || Static101.anInt2155 - local93 < -500 || Static101.anInt2155 - local93 > 500) {
			Static101.anInt2155 = local93;
			Static68.anInt1725 = local98;
		}
		Static154.anInt3559 = Static16.anInt433 / 2 + Static154.anInt3559 & 0x7FF;
		if (Static101.anInt2155 != local93) {
			Static101.anInt2155 += (local93 - Static101.anInt2155) / 16;
		}
		if (Static30.anInt768 > 383) {
			Static30.anInt768 = 383;
		}
		@Pc(161) int local161 = Static101.anInt2155 >> 7;
		@Pc(163) int local163 = 0;
		if (local98 != Static68.anInt1725) {
			Static68.anInt1725 += (local98 - Static68.anInt1725) / 16;
		}
		@Pc(179) int local179 = Static68.anInt1725 >> 7;
		@Pc(185) int local185 = Static131.method2041(Static68.anInt1725, Static101.anInt2155, Static36.anInt1020);
		@Pc(207) int local207;
		if (local179 > 3 && local161 > 3 && local179 < 100 && local161 < 100) {
			for (local207 = local179 - 4; local207 <= local179 + 4; local207++) {
				for (@Pc(213) int local213 = local161 - 4; local213 <= local161 + 4; local213++) {
					@Pc(217) int local217 = Static36.anInt1020;
					if (local217 < 3 && (Static164.aByteArrayArrayArray7[1][local207][local213] & 0x2) == 2) {
						local217++;
					}
					@Pc(245) int local245 = local185 - Static165.anIntArrayArrayArray10[local217][local207][local213];
					if (local245 > local163) {
						local163 = local245;
					}
				}
			}
		}
		local207 = local163 * 192;
		if (local207 > 98048) {
			local207 = 98048;
		}
		if (local207 < 32768) {
			local207 = 32768;
		}
		if (local207 > Static72.anInt1756) {
			Static72.anInt1756 += (local207 - Static72.anInt1756) / 24;
		} else if (local207 < Static72.anInt1756) {
			Static72.anInt1756 += (local207 - Static72.anInt1756) / 80;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	public static void method2583(@OriginalArg(1) int arg0) {
		if (!Static36.method641(arg0)) {
			return;
		}
		@Pc(14) Class87[] local14 = Static180.aClass87ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			@Pc(26) Class87 local26 = local14[local20];
			if (local26 != null) {
				local26.anInt4119 = 0;
				local26.anInt4097 = 0;
			}
		}
	}
}
