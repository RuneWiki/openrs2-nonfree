import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!we", name = "G", descriptor = "I")
	public static int anInt3398;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "[I")
	public static int[] anIntArray448;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	public static volatile int anInt3391 = 0;

	@OriginalMember(owner = "client!we", name = "E", descriptor = "Lclient!qb;")
	public static Class58 aClass58_76 = new Class58();

	@OriginalMember(owner = "client!we", name = "F", descriptor = "I")
	public static int anInt3397 = 0;

	@OriginalMember(owner = "client!we", name = "H", descriptor = "Lclient!r;")
	private static Class61 aClass61_1093 = Static129.method2060("Examine");

	@OriginalMember(owner = "client!we", name = "J", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!we", name = "K", descriptor = "Lclient!r;")
	public static Class61 aClass61_1094 = aClass61_1093;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "[I")
	public static int[] anIntArray449 = new int[1000];

	@OriginalMember(owner = "client!we", name = "M", descriptor = "Lclient!r;")
	public static Class61 aClass61_1095 = Static129.method2060("sl_flags");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
	public static void method2193(@OriginalArg(0) boolean arg0) {
		Static53.aBoolean47 = arg0;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(27) int local27;
		@Pc(34) int local34;
		@Pc(128) int local128;
		@Pc(132) int local132;
		@Pc(136) int local136;
		@Pc(161) int local161;
		@Pc(165) int local165;
		@Pc(169) int local169;
		if (!Static53.aBoolean47) {
			local19 = Static47.aClass5_Sub14_Sub1_2.method1459();
			local23 = (Static80.anInt2057 - Static47.aClass5_Sub14_Sub1_2.anInt2199) / 16;
			Static93.anIntArrayArray21 = new int[local23][4];
			for (local27 = 0; local27 < local23; local27++) {
				for (local34 = 0; local34 < 4; local34++) {
					Static93.anIntArrayArray21[local27][local34] = Static47.aClass5_Sub14_Sub1_2.method1461();
				}
			}
			local34 = Static47.aClass5_Sub14_Sub1_2.method1472();
			local128 = Static47.aClass5_Sub14_Sub1_2.method1459();
			local132 = Static47.aClass5_Sub14_Sub1_2.method1437();
			local136 = Static47.aClass5_Sub14_Sub1_2.method1471();
			Static127.aByteArrayArray10 = new byte[local23][];
			Static50.aByteArrayArray5 = new byte[local23][];
			Static2.anIntArray3 = new int[local23];
			Static68.anIntArray251 = new int[local23];
			Static125.anIntArray378 = new int[local23];
			local23 = 0;
			@Pc(402) boolean local402 = false;
			if ((local132 / 8 == 48 || local132 / 8 == 49) && local128 / 8 == 48) {
				local402 = true;
			}
			if (local132 / 8 == 48 && local128 / 8 == 148) {
				local402 = true;
			}
			for (local161 = (local132 - 6) / 8; local161 <= (local132 + 6) / 8; local161++) {
				for (local165 = (local128 - 6) / 8; local165 <= (local128 + 6) / 8; local165++) {
					local169 = (local161 << 8) + local165;
					if (!local402 || local165 != 49 && local165 != 149 && local165 != 147 && local161 != 50 && (local161 != 49 || local165 != 47)) {
						Static2.anIntArray3[local23] = local169;
						Static125.anIntArray378[local23] = Static45.aClass26_Sub1_7.method1044(Static123.method1929(new Class61[] { Static50.aClass61_393, Static39.method730(local161), Static11.aClass61_97, Static39.method730(local165) }));
						Static68.anIntArray251[local23] = Static45.aClass26_Sub1_7.method1044(Static123.method1929(new Class61[] { Static99.aClass61_771, Static39.method730(local161), Static11.aClass61_97, Static39.method730(local165) }));
						local23++;
					}
				}
			}
			Static104.method1757(local128, local34, local136, local19, local132);
			return;
		}
		Static47.aClass5_Sub14_Sub1_2.method1493();
		for (local19 = 0; local19 < 4; local19++) {
			for (local23 = 0; local23 < 13; local23++) {
				for (local27 = 0; local27 < 13; local27++) {
					local34 = Static47.aClass5_Sub14_Sub1_2.method1492(1);
					if (local34 == 1) {
						Static60.anIntArrayArrayArray1[local19][local23][local27] = Static47.aClass5_Sub14_Sub1_2.method1492(26);
					} else {
						Static60.anIntArrayArrayArray1[local19][local23][local27] = -1;
					}
				}
			}
		}
		Static47.aClass5_Sub14_Sub1_2.method1499();
		local23 = (Static80.anInt2057 - Static47.aClass5_Sub14_Sub1_2.anInt2199) / 16;
		Static93.anIntArrayArray21 = new int[local23][4];
		for (local27 = 0; local27 < local23; local27++) {
			for (local34 = 0; local34 < 4; local34++) {
				Static93.anIntArrayArray21[local27][local34] = Static47.aClass5_Sub14_Sub1_2.method1452();
			}
		}
		local34 = Static47.aClass5_Sub14_Sub1_2.method1437();
		local128 = Static47.aClass5_Sub14_Sub1_2.method1471();
		local132 = Static47.aClass5_Sub14_Sub1_2.method1459();
		local136 = Static47.aClass5_Sub14_Sub1_2.method1437();
		@Pc(142) int local142 = Static47.aClass5_Sub14_Sub1_2.method1472();
		Static50.aByteArrayArray5 = new byte[local23][];
		Static2.anIntArray3 = new int[local23];
		Static68.anIntArray251 = new int[local23];
		Static125.anIntArray378 = new int[local23];
		Static127.aByteArrayArray10 = new byte[local23][];
		local23 = 0;
		for (local161 = 0; local161 < 4; local161++) {
			for (local165 = 0; local165 < 13; local165++) {
				for (local169 = 0; local169 < 13; local169++) {
					@Pc(179) int local179 = Static60.anIntArrayArrayArray1[local161][local165][local169];
					if (local179 != -1) {
						@Pc(188) int local188 = local179 >> 14 & 0x3FF;
						@Pc(194) int local194 = local179 >> 3 & 0x7FF;
						@Pc(204) int local204 = local194 / 8 + (local188 / 8 << 8);
						for (@Pc(206) int local206 = 0; local206 < local23; local206++) {
							if (local204 == Static2.anIntArray3[local206]) {
								local204 = -1;
								break;
							}
						}
						if (local204 != -1) {
							Static2.anIntArray3[local23] = local204;
							@Pc(238) int local238 = local204 >> 8 & 0xFF;
							@Pc(242) int local242 = local204 & 0xFF;
							Static125.anIntArray378[local23] = Static45.aClass26_Sub1_7.method1044(Static123.method1929(new Class61[] { Static50.aClass61_393, Static39.method730(local238), Static11.aClass61_97, Static39.method730(local242) }));
							Static68.anIntArray251[local23] = Static45.aClass26_Sub1_7.method1044(Static123.method1929(new Class61[] { Static99.aClass61_771, Static39.method730(local238), Static11.aClass61_97, Static39.method730(local242) }));
							local23++;
						}
					}
				}
			}
		}
		Static104.method1757(local34, local136, local128, local132, local142);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)V")
	public static void method2194(@OriginalArg(1) boolean arg0) {
		Static48.method879();
		Static78.anInt1982++;
		if (Static78.anInt1982 < 50 && !arg0) {
			return;
		}
		Static78.anInt1982 = 0;
		if (Static83.aBoolean78 || Static108.aClass30_2 == null) {
			return;
		}
		Static1.aClass5_Sub14_Sub1_1.method1489(176);
		try {
			Static108.aClass30_2.method780(Static1.aClass5_Sub14_Sub1_1.aByteArray33, Static1.aClass5_Sub14_Sub1_1.anInt2199);
			Static1.aClass5_Sub14_Sub1_1.anInt2199 = 0;
		} catch (@Pc(49) IOException local49) {
			Static83.aBoolean78 = true;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ff;BZLclient!ff;)V")
	public static void method2195(@OriginalArg(0) Class26 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class26 arg2) {
		Static72.aClass26_17 = arg0;
		Static62.aClass26_8 = arg2;
		Static62.aBoolean58 = arg1;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I")
	public static int method2196() {
		return Static62.anInt1536++;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V")
	public static void method2197() {
		anIntArray449 = null;
		aClass61_1094 = null;
		aClass61_1093 = null;
		aClass61_1095 = null;
		aBooleanArray18 = null;
		anIntArray448 = null;
		aClass58_76 = null;
	}
}
