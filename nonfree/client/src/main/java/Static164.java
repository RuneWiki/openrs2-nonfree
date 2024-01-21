import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ua", name = "N", descriptor = "[I")
	public static int[] anIntArray390 = new int[128];

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
	public static int anInt3767 = 0;

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1330 = Static120.method2057("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
	public static int anInt3772 = 1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ka;I)Lclient!tg;")
	public static Class81 method2872(@OriginalArg(0) Class1_Sub8 arg0) {
		return Static80.method1358(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
	public static void method2873() {
		if (Static107.aBooleanArray13[98]) {
			Static29.anInt753 += (12 - Static29.anInt753) / 2;
		} else if (Static107.aBooleanArray13[99]) {
			Static29.anInt753 += (-Static29.anInt753 - 12) / 2;
		} else {
			Static29.anInt753 /= 2;
		}
		if (Static107.aBooleanArray13[96]) {
			Static44.anInt1087 += (-Static44.anInt1087 - 24) / 2;
		} else if (Static107.aBooleanArray13[97]) {
			Static44.anInt1087 += (24 - Static44.anInt1087) / 2;
		} else {
			Static44.anInt1087 /= 2;
		}
		Static35.anInt964 = Static44.anInt1087 / 2 + Static35.anInt964 & 0x7FF;
		@Pc(85) int local85 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3040 + Static46.anInt1126;
		Static23.anInt585 += Static29.anInt753 / 2;
		if (Static23.anInt585 < 128) {
			Static23.anInt585 = 128;
		}
		if (Static23.anInt585 > 383) {
			Static23.anInt585 = 383;
		}
		@Pc(108) int local108 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3026 + Static85.anInt418;
		if (Static116.anInt2611 - local85 < -500 || Static116.anInt2611 - local85 > 500 || Static3.anInt111 - local108 < -500 || Static3.anInt111 - local108 > 500) {
			Static116.anInt2611 = local85;
			Static3.anInt111 = local108;
		}
		if (Static116.anInt2611 != local85) {
			Static116.anInt2611 += (local85 - Static116.anInt2611) / 16;
		}
		@Pc(160) int local160 = Static116.anInt2611 >> 7;
		if (Static3.anInt111 != local108) {
			Static3.anInt111 += (local108 - Static3.anInt111) / 16;
		}
		@Pc(180) int local180 = Static3.anInt111 >> 7;
		@Pc(182) int local182 = 0;
		@Pc(188) int local188 = Static102.method1694(Static116.anInt2611, Static44.anInt1086, Static3.anInt111);
		@Pc(204) int local204;
		if (local160 > 3 && local180 > 3 && local160 < 100 && local180 < 100) {
			for (local204 = local160 - 4; local204 <= local160 + 4; local204++) {
				for (@Pc(210) int local210 = local180 - 4; local210 <= local180 + 4; local210++) {
					@Pc(214) int local214 = Static44.anInt1086;
					if (local214 < 3 && (Static43.aByteArrayArrayArray2[1][local204][local210] & 0x2) == 2) {
						local214++;
					}
					@Pc(240) int local240 = local188 - Static157.anIntArrayArrayArray7[local214][local204][local210];
					if (local240 > local182) {
						local182 = local240;
					}
				}
			}
		}
		local204 = local182 * 192;
		if (local204 > 98048) {
			local204 = 98048;
		}
		if (local204 < 32768) {
			local204 = 32768;
		}
		if (local204 > Static154.anInt3515) {
			Static154.anInt3515 += (local204 - Static154.anInt3515) / 24;
		} else if (Static154.anInt3515 > local204) {
			Static154.anInt3515 += (local204 - Static154.anInt3515) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
	public static void method2874() {
		aClass81_1330 = null;
		anIntArray390 = null;
	}
}
