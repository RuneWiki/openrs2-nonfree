import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	public static int anInt672;

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "Lclient!fd;")
	public static Class21 aClass21_2;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_197 = Static8.method128("huffman");

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "Lclient!ea;")
	private static Class18 aClass18_199 = Static8.method128("flash2:");

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_198 = aClass18_199;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	public static int anInt668 = 0;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	public static int anInt673 = 0;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "[I")
	public static int[] anIntArray48 = new int[1000];

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "Lclient!ea;")
	public static Class18 aClass18_200 = aClass18_199;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "[Lclient!ja;")
	public static Class1_Sub1_Sub5_Sub5[] aClass1_Sub1_Sub5_Sub5Array2 = new Class1_Sub1_Sub5_Sub5[4];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!dd;BLclient!dd;)V")
	public static void method414(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Class16 arg1) {
		Static152.aClass16_28 = arg0;
		Static26.aClass16_4 = arg1;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public static void method416() {
		aClass18_197 = null;
		aClass1_Sub1_Sub5_Sub5Array2 = null;
		aClass18_200 = null;
		aClass21_2 = null;
		aClass18_199 = null;
		anIntArray48 = null;
		aClass18_198 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	public static void method418() {
		if (Static45.aBooleanArray6[98]) {
			Static49.anInt1585 += (12 - Static49.anInt1585) / 2;
		} else if (Static45.aBooleanArray6[99]) {
			Static49.anInt1585 += (-Static49.anInt1585 - 12) / 2;
		} else {
			Static49.anInt1585 /= 2;
		}
		Static155.anInt4270 += Static49.anInt1585 / 2;
		if (Static45.aBooleanArray6[96]) {
			Static38.anInt1191 += (-Static38.anInt1191 - 24) / 2;
		} else if (Static45.aBooleanArray6[97]) {
			Static38.anInt1191 += (24 - Static38.anInt1191) / 2;
		} else {
			Static38.anInt1191 /= 2;
		}
		@Pc(86) int local86 = Static72.anInt2205 + Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579;
		if (Static155.anInt4270 < 128) {
			Static155.anInt4270 = 128;
		}
		if (Static155.anInt4270 > 383) {
			Static155.anInt4270 = 383;
		}
		Static98.anInt3021 = Static38.anInt1191 / 2 + Static98.anInt3021 & 0x7FF;
		@Pc(112) int local112 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 + Static129.anInt3682;
		if (Static103.anInt3046 - local86 < -500 || Static103.anInt3046 - local86 > 500 || Static129.anInt3681 - local112 < -500 || Static129.anInt3681 - local112 > 500) {
			Static129.anInt3681 = local112;
			Static103.anInt3046 = local86;
		}
		@Pc(145) int local145 = 0;
		if (Static129.anInt3681 != local112) {
			Static129.anInt3681 += (local112 - Static129.anInt3681) / 16;
		}
		if (local86 != Static103.anInt3046) {
			Static103.anInt3046 += (local86 - Static103.anInt3046) / 16;
		}
		@Pc(181) int local181 = Static103.anInt3046 >> 7;
		@Pc(185) int local185 = Static129.anInt3681 >> 7;
		@Pc(191) int local191 = Static34.method728(Static9.anInt295, Static129.anInt3681, Static103.anInt3046);
		@Pc(211) int local211;
		if (local181 > 3 && local185 > 3 && local181 < 100 && local185 < 100) {
			for (local211 = local181 - 4; local211 <= local181 + 4; local211++) {
				for (@Pc(217) int local217 = local185 - 4; local217 <= local185 + 4; local217++) {
					@Pc(221) int local221 = Static9.anInt295;
					if (local221 < 3 && (Static2.aByteArrayArrayArray1[1][local211][local217] & 0x2) == 2) {
						local221++;
					}
					@Pc(248) int local248 = local191 - Static135.anIntArrayArrayArray5[local221][local211][local217];
					if (local248 > local145) {
						local145 = local248;
					}
				}
			}
		}
		local211 = local145 * 192;
		if (local211 > 98048) {
			local211 = 98048;
		}
		if (local211 < 32768) {
			local211 = 32768;
		}
		if (Static62.anInt1924 < local211) {
			Static62.anInt1924 += (local211 - Static62.anInt1924) / 24;
		} else if (Static62.anInt1924 > local211) {
			Static62.anInt1924 += (local211 - Static62.anInt1924) / 80;
			return;
		}
	}
}
