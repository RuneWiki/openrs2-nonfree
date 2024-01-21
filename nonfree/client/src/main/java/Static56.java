import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array7;

	@OriginalMember(owner = "client!lc", name = "bb", descriptor = "[Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1[] aClass2_Sub1_Sub3_Sub1Array3;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Lclient!lc;")
	public static Class31 aClass31_665 = method1206("Accept trade @whi@");

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "Lclient!lc;")
	public static Class31 aClass31_666 = method1206("flash2:");

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Lclient!lc;")
	public static Class31 aClass31_667 = method1206("Loading wordpack )2 0(U");

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "Lclient!md;")
	public static Class34 aClass34_1 = new Class34();

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
	public static int anInt1911 = 0;

	@OriginalMember(owner = "client!lc", name = "W", descriptor = "Lclient!fe;")
	public static Class17 aClass17_71 = new Class17(50);

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "Lclient!lc;")
	public static Class31 aClass31_668 = method1206("backhmid2");

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "Lclient!lc;")
	public static Class31 aClass31_669 = method1206("To cancel this request:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WCancel recovery questions(W)3");

	@OriginalMember(owner = "client!lc", name = "cb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_670 = method1206("red:");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/lang/String;)Lclient!lc;")
	public static Class31 method1206(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class31 local13 = new Class31();
		@Pc(15) int local15 = 0;
		local13.aByteArray17 = new byte[local9];
		while (local9 > local15) {
			@Pc(27) int local27 = local6[local15++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local15 >= local9) {
					break;
				}
				@Pc(62) int local62 = local6[local15++] & 0xFF;
				local13.aByteArray17[local13.anInt1901++] = (byte) ((local27 - 40) * 43 + local62 - 48);
			} else {
				local13.aByteArray17[local13.anInt1901++] = (byte) local27;
			}
		}
		local13.method1211();
		return local13.method1198();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZB)V")
	public static void method1207(@OriginalArg(0) boolean arg0) {
		Static59.aBoolean103 = arg0;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(151) int local151;
		if (!Static59.aBoolean103) {
			local18 = Static3.aClass2_Sub6_Sub1_1.method632();
			local26 = (Static87.anInt2339 - Static3.aClass2_Sub6_Sub1_1.anInt952) / 16;
			Static21.anIntArrayArray27 = new int[local26][4];
			for (local32 = 0; local32 < local26; local32++) {
				for (local36 = 0; local36 < 4; local36++) {
					Static21.anIntArrayArray27[local32][local36] = Static3.aClass2_Sub6_Sub1_1.method629();
				}
			}
			local36 = Static3.aClass2_Sub6_Sub1_1.method632();
			local66 = Static3.aClass2_Sub6_Sub1_1.method632();
			local70 = Static3.aClass2_Sub6_Sub1_1.method671();
			local74 = Static3.aClass2_Sub6_Sub1_1.method627();
			Static54.aByteArrayArray9 = new byte[local26][];
			Static15.aByteArrayArray5 = new byte[local26][];
			Static79.anIntArray323 = new int[local26];
			@Pc(85) boolean local85 = false;
			if ((local74 / 8 == 48 || local74 / 8 == 49) && (local36 / 8) == 48) {
				local85 = true;
			}
			Static55.anIntArray275 = new int[local26];
			Static13.anIntArray81 = new int[local26];
			local26 = 0;
			if (local74 / 8 == 48 && local36 / 8 == 148) {
				local85 = true;
			}
			for (local134 = (local74 - 6) / 8; local134 <= (local74 + 6) / 8; local134++) {
				for (local142 = (local36 - 6) / 8; local142 <= (local36 + 6) / 8; local142++) {
					local151 = (local134 << 8) + local142;
					if (!local85 || local142 != 49 && local142 != 149 && local142 != 147 && local134 != 50 && (local134 != 49 || local142 != 47)) {
						Static13.anIntArray81[local26] = local151;
						Static55.anIntArray275[local26] = Static89.aClass11_Sub1_14.method345(Static37.method974(new Class31[] { Static63.aClass31_744, Static89.method1499(local134), Static20.aClass31_705, Static89.method1499(local142) }));
						Static79.anIntArray323[local26] = Static89.aClass11_Sub1_14.method345(Static37.method974(new Class31[] { Static42.aClass31_572, Static89.method1499(local134), Static20.aClass31_705, Static89.method1499(local142) }));
						local26++;
					}
				}
			}
			Static38.method989(local18, local74, local66, local36, local70);
			return;
		}
		local18 = Static3.aClass2_Sub6_Sub1_1.method667();
		Static3.aClass2_Sub6_Sub1_1.method681();
		for (local26 = 0; local26 < 4; local26++) {
			for (local32 = 0; local32 < 13; local32++) {
				for (local36 = 0; local36 < 13; local36++) {
					local66 = Static3.aClass2_Sub6_Sub1_1.method687(1);
					if (local66 == 1) {
						Static58.anIntArrayArrayArray2[local26][local32][local36] = Static3.aClass2_Sub6_Sub1_1.method687(26);
					} else {
						Static58.anIntArrayArrayArray2[local26][local32][local36] = -1;
					}
				}
			}
		}
		Static3.aClass2_Sub6_Sub1_1.method682();
		local32 = (Static87.anInt2339 - Static3.aClass2_Sub6_Sub1_1.anInt952) / 16;
		Static21.anIntArrayArray27 = new int[local32][4];
		for (local36 = 0; local36 < local32; local36++) {
			for (local66 = 0; local66 < 4; local66++) {
				Static21.anIntArrayArray27[local36][local66] = Static3.aClass2_Sub6_Sub1_1.method660();
			}
		}
		local66 = Static3.aClass2_Sub6_Sub1_1.method671();
		local70 = Static3.aClass2_Sub6_Sub1_1.method633();
		local74 = Static3.aClass2_Sub6_Sub1_1.method667();
		@Pc(395) int local395 = Static3.aClass2_Sub6_Sub1_1.method633();
		Static79.anIntArray323 = new int[local32];
		Static13.anIntArray81 = new int[local32];
		Static54.aByteArrayArray9 = new byte[local32][];
		Static15.aByteArrayArray5 = new byte[local32][];
		Static55.anIntArray275 = new int[local32];
		local32 = 0;
		for (local134 = 0; local134 < 4; local134++) {
			for (local142 = 0; local142 < 13; local142++) {
				for (local151 = 0; local151 < 13; local151++) {
					@Pc(432) int local432 = Static58.anIntArrayArrayArray2[local134][local142][local151];
					if (local432 != -1) {
						@Pc(442) int local442 = local432 >> 3 & 0x7FF;
						@Pc(448) int local448 = local432 >> 14 & 0x3FF;
						@Pc(459) int local459 = (local448 / 8 << 8) + (local442 / 8);
						for (@Pc(461) int local461 = 0; local461 < local32; local461++) {
							if (local459 == Static13.anIntArray81[local461]) {
								local459 = -1;
								break;
							}
						}
						if (local459 != -1) {
							@Pc(491) int local491 = local459 & 0xFF;
							Static13.anIntArray81[local32] = local459;
							@Pc(501) int local501 = local459 >> 8 & 0xFF;
							Static55.anIntArray275[local32] = Static89.aClass11_Sub1_14.method345(Static37.method974(new Class31[] { Static63.aClass31_744, Static89.method1499(local501), Static20.aClass31_705, Static89.method1499(local491) }));
							Static79.anIntArray323[local32] = Static89.aClass11_Sub1_14.method345(Static37.method974(new Class31[] { Static42.aClass31_572, Static89.method1499(local501), Static20.aClass31_705, Static89.method1499(local491) }));
							local32++;
						}
					}
				}
			}
		}
		Static38.method989(local18, local74, local70, local395, local66);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!kc;BLclient!kc;)V")
	public static void method1224(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		Static98.aBoolean67 = arg0;
		Static68.aClass11_12 = arg2;
		Static18.aClass11_6 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	public static void method1227() {
		aClass31_667 = null;
		aClass34_1 = null;
		aClass31_669 = null;
		aClass2_Sub1_Sub3_Sub1Array3 = null;
		aClass31_665 = null;
		aClass31_670 = null;
		aClass2_Sub1_Sub3_Sub2Array7 = null;
		aClass31_666 = null;
		aClass31_668 = null;
		aClass17_71 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!qd;I)V")
	public static void method1229(@OriginalArg(0) Class51 arg0) {
		Static57.anInt2684 = 20;
		try {
			Static87.aClass1_1 = (Class1) Class.forName("Class1_Sub1_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(12) Throwable local12) {
			@Pc(18) Interface2 local18 = arg0.method1463();
			if (local18 == null) {
				Static87.aClass1_1 = new Class1_Sub2(arg0);
			} else {
				Static87.aClass1_1 = new Class1_Sub1_Sub2(arg0, local18);
			}
		}
	}
}
