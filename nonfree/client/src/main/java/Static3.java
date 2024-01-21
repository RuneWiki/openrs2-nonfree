import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_30 = Static177.method3050("scrollbar");

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_33 = Static177.method3050("");

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!jd;")
	public static Class46 aClass46_31 = aClass46_33;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public static final int anInt82 = 50;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!jd;")
	public static Class46 aClass46_32 = aClass46_33;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!jd;")
	public static Class46 aClass46_34 = aClass46_33;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public static int anInt83 = 0;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!jd;")
	public static Class46 aClass46_35 = aClass46_33;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!bg;")
	public static final Class11 aClass11_1 = new Class11();

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_39 = Static177.method3050("Password: ");

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!jd;")
	public static Class46 aClass46_36 = aClass46_39;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_37 = Static177.method3050("This computers address has been blocked");

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!jd;")
	public static Class46 aClass46_38 = aClass46_33;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	public static int anInt86 = 0;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!jd;")
	public static Class46 aClass46_40 = aClass46_33;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_41 = Static177.method3050("Loading textures )2 ");

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
	public static int anInt87 = 0;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!jd;")
	public static Class46 aClass46_42 = aClass46_41;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!jd;")
	public static Class46 aClass46_43 = aClass46_37;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_44 = Static177.method3050("");

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "Lclient!jd;")
	public static Class46 aClass46_45 = aClass46_44;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!a;)V")
	public static void method21(@OriginalArg(1) Class1 arg0) {
		if (Static140.anInt3262 == arg0.anInt73) {
			Static50.aBooleanArray8[arg0.anInt27] = true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZB)V")
	public static void method22(@OriginalArg(0) boolean arg0) {
		Static91.aBoolean104 = arg0;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(54) int local54;
		@Pc(156) int local156;
		@Pc(160) int local160;
		if (!Static91.aBoolean104) {
			local18 = (Static132.anInt3166 - Static162.aClass4_Sub11_Sub1_3.anInt1597) / 16;
			Static101.anIntArrayArray19 = new int[local18][4];
			for (local22 = 0; local22 < local18; local22++) {
				for (local26 = 0; local26 < 4; local26++) {
					Static101.anIntArrayArray19[local22][local26] = Static162.aClass4_Sub11_Sub1_3.method1261();
				}
			}
			local26 = Static162.aClass4_Sub11_Sub1_3.method1253();
			local30 = Static162.aClass4_Sub11_Sub1_3.method1252();
			local34 = Static162.aClass4_Sub11_Sub1_3.method1275();
			@Pc(379) boolean local379 = false;
			local39 = Static162.aClass4_Sub11_Sub1_3.method1235();
			local43 = Static162.aClass4_Sub11_Sub1_3.method1235();
			Static172.aByteArrayArray11 = new byte[local18][];
			Static154.aByteArrayArray12 = new byte[local18][];
			Static95.anIntArray282 = new int[local18];
			if ((local30 / 8 == 48 || local30 / 8 == 49) && local43 / 8 == 48) {
				local379 = true;
			}
			Static182.anIntArray436 = new int[local18];
			if (local30 / 8 == 48 && local43 / 8 == 148) {
				local379 = true;
			}
			Static83.anIntArray205 = new int[local18];
			local18 = 0;
			for (local54 = (local30 - 6) / 8; local54 <= (local30 + 6) / 8; local54++) {
				for (local156 = (local43 - 6) / 8; local156 <= (local43 + 6) / 8; local156++) {
					local160 = local156 + (local54 << 8);
					if (!local379 || local156 != 49 && local156 != 149 && local156 != 147 && local54 != 50 && (local54 != 49 || local156 != 47)) {
						Static83.anIntArray205[local18] = local160;
						Static182.anIntArray436[local18] = Static160.aClass62_Sub1_88.method2859(Static69.method1482(new Class46[] { Static152.aClass46_1285, Static127.method2240(local54), Static91.aClass46_847, Static127.method2240(local156) }));
						Static95.anIntArray282[local18] = Static160.aClass62_Sub1_88.method2859(Static69.method1482(new Class46[] { Static158.aClass46_1312, Static127.method2240(local54), Static91.aClass46_847, Static127.method2240(local156) }));
						local18++;
					}
				}
			}
			Static147.method468(local30, local43, local39, local26, local34);
			return;
		}
		local18 = Static162.aClass4_Sub11_Sub1_3.method1275();
		local22 = Static162.aClass4_Sub11_Sub1_3.method1224();
		local26 = Static162.aClass4_Sub11_Sub1_3.method1221();
		local30 = Static162.aClass4_Sub11_Sub1_3.method1235();
		local34 = Static162.aClass4_Sub11_Sub1_3.method1252();
		Static162.aClass4_Sub11_Sub1_3.method1287();
		@Pc(47) int local47;
		for (local39 = 0; local39 < 4; local39++) {
			for (local43 = 0; local43 < 13; local43++) {
				for (local47 = 0; local47 < 13; local47++) {
					local54 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
					if (local54 == 1) {
						Static9.anIntArrayArrayArray6[local39][local43][local47] = Static162.aClass4_Sub11_Sub1_3.method1288(26);
					} else {
						Static9.anIntArrayArrayArray6[local39][local43][local47] = -1;
					}
				}
			}
		}
		Static162.aClass4_Sub11_Sub1_3.method1286();
		local43 = (Static132.anInt3166 - Static162.aClass4_Sub11_Sub1_3.anInt1597) / 16;
		Static101.anIntArrayArray19 = new int[local43][4];
		for (local47 = 0; local47 < local43; local47++) {
			for (local54 = 0; local54 < 4; local54++) {
				Static101.anIntArrayArray19[local47][local54] = Static162.aClass4_Sub11_Sub1_3.method1261();
			}
		}
		Static83.anIntArray205 = new int[local43];
		Static154.aByteArrayArray12 = new byte[local43][];
		Static95.anIntArray282 = new int[local43];
		Static172.aByteArrayArray11 = new byte[local43][];
		Static182.anIntArray436 = new int[local43];
		local43 = 0;
		for (local54 = 0; local54 < 4; local54++) {
			for (local156 = 0; local156 < 13; local156++) {
				for (local160 = 0; local160 < 13; local160++) {
					@Pc(170) int local170 = Static9.anIntArrayArrayArray6[local54][local156][local160];
					if (local170 != -1) {
						@Pc(180) int local180 = local170 >> 14 & 0x3FF;
						@Pc(186) int local186 = local170 >> 3 & 0x7FF;
						@Pc(196) int local196 = local186 / 8 + (local180 / 8 << 8);
						for (@Pc(198) int local198 = 0; local198 < local43; local198++) {
							if (local196 == Static83.anIntArray205[local198]) {
								local196 = -1;
								break;
							}
						}
						if (local196 != -1) {
							Static83.anIntArray205[local43] = local196;
							@Pc(234) int local234 = local196 >> 8 & 0xFF;
							@Pc(238) int local238 = local196 & 0xFF;
							Static182.anIntArray436[local43] = Static160.aClass62_Sub1_88.method2859(Static69.method1482(new Class46[] { Static152.aClass46_1285, Static127.method2240(local234), Static91.aClass46_847, Static127.method2240(local238) }));
							Static95.anIntArray282[local43] = Static160.aClass62_Sub1_88.method2859(Static69.method1482(new Class46[] { Static158.aClass46_1312, Static127.method2240(local234), Static91.aClass46_847, Static127.method2240(local238) }));
							local43++;
						}
					}
				}
			}
		}
		Static147.method468(local22, local34, local30, local26, local18);
	}
}
