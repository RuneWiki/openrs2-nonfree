import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!eg", name = "eb", descriptor = "[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array1;

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
	public static int anInt1005 = 0;

	@OriginalMember(owner = "client!eg", name = "fb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_377 = Static120.method1824("Prepared visibility map");

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "Lclient!rd;")
	public static Class80 aClass80_375 = aClass80_377;

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
	public static int anInt1007 = 0;

	@OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
	public static int anInt1010 = 0;

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "Lclient!rd;")
	public static Class80 aClass80_376 = null;

	@OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
	public static int anInt1015 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Lclient!v;")
	public static Class3_Sub1_Sub17 method678(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub17 local10 = (Class3_Sub1_Sub17) Static171.aClass5_55.method139((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static87.aClass1_12.method60(16, arg0);
		local10 = new Class3_Sub1_Sub17();
		if (local25 != null) {
			local10.method2974(new Class3_Sub17(local25));
		}
		Static171.aClass5_55.method145(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
	public static void method680() {
		if (Static11.aBooleanArray2[96]) {
			Static30.anInt4482 += (-Static30.anInt4482 - 24) / 2;
		} else if (Static11.aBooleanArray2[97]) {
			Static30.anInt4482 += (24 - Static30.anInt4482) / 2;
		} else {
			Static30.anInt4482 /= 2;
		}
		@Pc(42) int local42 = Static82.anInt1743 + Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329;
		Static126.anInt2704 = Static30.anInt4482 / 2 + Static126.anInt2704 & 0x7FF;
		if (Static11.aBooleanArray2[98]) {
			Static50.anInt1095 += (12 - Static50.anInt1095) / 2;
		} else if (Static11.aBooleanArray2[99]) {
			Static50.anInt1095 += (-Static50.anInt1095 - 12) / 2;
		} else {
			Static50.anInt1095 /= 2;
		}
		@Pc(89) int local89 = Static18.anInt458 + Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315;
		if (Static48.anInt1076 - local42 < -500 || Static48.anInt1076 - local42 > 500 || Static92.anInt3071 - local89 < -500 || Static92.anInt3071 - local89 > 500) {
			Static92.anInt3071 = local89;
			Static48.anInt1076 = local42;
		}
		Static181.anInt4047 += Static50.anInt1095 / 2;
		@Pc(127) int local127 = 0;
		if (local42 != Static48.anInt1076) {
			Static48.anInt1076 += (local42 - Static48.anInt1076) / 16;
		}
		@Pc(147) int local147 = Static48.anInt1076 >> 7;
		if (Static92.anInt3071 != local89) {
			Static92.anInt3071 += (local89 - Static92.anInt3071) / 16;
		}
		if (Static181.anInt4047 < 128) {
			Static181.anInt4047 = 128;
		}
		@Pc(177) int local177 = Static92.anInt3071 >> 7;
		if (Static181.anInt4047 > 383) {
			Static181.anInt4047 = 383;
		}
		@Pc(188) int local188 = Static50.method742(Static153.anInt673, Static92.anInt3071, Static48.anInt1076);
		@Pc(208) int local208;
		if (local147 > 3 && local177 > 3 && local147 < 100 && local177 < 100) {
			for (local208 = local147 - 4; local208 <= local147 + 4; local208++) {
				for (@Pc(214) int local214 = local177 - 4; local214 <= local177 + 4; local214++) {
					@Pc(218) int local218 = Static153.anInt673;
					if (local218 < 3 && (Static18.aByteArrayArrayArray1[1][local208][local214] & 0x2) == 2) {
						local218++;
					}
					@Pc(248) int local248 = local188 - Static42.anIntArrayArrayArray1[local218][local208][local214];
					if (local127 < local248) {
						local127 = local248;
					}
				}
			}
		}
		local208 = local127 * 192;
		if (local208 > 98048) {
			local208 = 98048;
		}
		if (local208 < 32768) {
			local208 = 32768;
		}
		if (Static174.anInt3934 < local208) {
			Static174.anInt3934 += (local208 - Static174.anInt3934) / 24;
		} else if (Static174.anInt3934 > local208) {
			Static174.anInt3934 += (local208 - Static174.anInt3934) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(IB)V")
	public static void method681(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static129.aBooleanArray16[arg0]) {
			return;
		}
		Static107.aClass1_17.method57(arg0);
		if (Static57.aClass77ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(31) boolean local31 = true;
		for (@Pc(33) int local33 = 0; local33 < Static57.aClass77ArrayArray1[arg0].length; local33++) {
			if (Static57.aClass77ArrayArray1[arg0][local33] != null) {
				if (Static57.aClass77ArrayArray1[arg0][local33].anInt3206 == 2) {
					local31 = false;
				} else {
					Static57.aClass77ArrayArray1[arg0][local33] = null;
				}
			}
		}
		if (local31) {
			Static57.aClass77ArrayArray1[arg0] = null;
		}
		Static129.aBooleanArray16[arg0] = false;
	}
}
