import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "[Lclient!gd;")
	public static Class23[] aClass23Array14;

	@OriginalMember(owner = "client!ob", name = "hb", descriptor = "Lclient!rb;")
	public static Class55 aClass55_30;

	@OriginalMember(owner = "client!ob", name = "mb", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_19;

	@OriginalMember(owner = "client!ob", name = "pb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1172 = Static15.method178("Please remove ");

	@OriginalMember(owner = "client!ob", name = "Y", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1161 = aClass23_1172;

	@OriginalMember(owner = "client!ob", name = "Z", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1162 = Static15.method178("Loaded textures");

	@OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1163 = Static15.method178("welle2:");

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1164 = Static15.method178("Fallen lassen");

	@OriginalMember(owner = "client!ob", name = "eb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1165 = Static15.method178("Accept challenge");

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1166 = Static15.method178(":chalreq:");

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1167 = aClass23_1172;

	@OriginalMember(owner = "client!ob", name = "ib", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1168 = Static15.method178("Loaded title screen");

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1169 = Static15.method178("@yel@*V");

	@OriginalMember(owner = "client!ob", name = "kb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1170 = aClass23_1165;

	@OriginalMember(owner = "client!ob", name = "ob", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1171 = aClass23_1168;

	@OriginalMember(owner = "client!ob", name = "qb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1173 = aClass23_1162;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZB)V")
	public static void method1282(@OriginalArg(0) boolean arg0) {
		Static63.aBoolean96 = arg0;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(46) int local46;
		@Pc(49) int local49;
		@Pc(122) int local122;
		@Pc(129) int local129;
		@Pc(136) int local136;
		if (!Static63.aBoolean96) {
			local16 = Static83.aClass1_Sub5_Sub1_3.method675();
			local20 = Static83.aClass1_Sub5_Sub1_3.method728();
			local24 = Static83.aClass1_Sub5_Sub1_3.method678();
			local28 = Static83.aClass1_Sub5_Sub1_3.method715();
			local32 = Static83.aClass1_Sub5_Sub1_3.method716();
			local40 = (Static39.anInt1382 - Static83.aClass1_Sub5_Sub1_3.anInt1266) / 16;
			Static100.anIntArrayArray58 = new int[local40][4];
			for (local46 = 0; local46 < local40; local46++) {
				for (local49 = 0; local49 < 4; local49++) {
					Static100.anIntArrayArray58[local46][local49] = Static83.aClass1_Sub5_Sub1_3.method692();
				}
			}
			Static75.aByteArrayArray5 = new byte[local40][];
			Static21.anIntArray93 = new int[local40];
			Static96.anIntArray205 = new int[local40];
			@Pc(77) boolean local77 = false;
			if ((local24 / 8 == 48 || local24 / 8 == 49) && local16 / 8 == 48) {
				local77 = true;
			}
			Static57.aByteArrayArray4 = new byte[local40][];
			Static96.anIntArray206 = new int[local40];
			if (local24 / 8 == 48 && local16 / 8 == 148) {
				local77 = true;
			}
			local40 = 0;
			for (local122 = (local24 - 6) / 8; local122 <= (local24 + 6) / 8; local122++) {
				for (local129 = (local16 - 6) / 8; local129 <= (local16 + 6) / 8; local129++) {
					local136 = local129 + (local122 << 8);
					if (!local77 || local129 != 49 && local129 != 149 && local129 != 147 && local122 != 50 && (local122 != 49 || local129 != 47)) {
						Static96.anIntArray206[local40] = local136;
						Static21.anIntArray93[local40] = Static65.aClass55_Sub1_12.method1885(Static17.method233(new Class23[] { Static33.aClass23_572, Static19.method274(local122), Static68.aClass23_250, Static19.method274(local129) }));
						Static96.anIntArray205[local40] = Static65.aClass55_Sub1_12.method1885(Static17.method233(new Class23[] { Static42.aClass23_767, Static19.method274(local122), Static68.aClass23_250, Static19.method274(local129) }));
						local40++;
					}
				}
			}
			Static8.method101(local32, local16, local28, local20, local24);
			return;
		}
		local16 = Static83.aClass1_Sub5_Sub1_3.method715();
		local20 = Static83.aClass1_Sub5_Sub1_3.method715();
		local24 = Static83.aClass1_Sub5_Sub1_3.method715();
		local28 = Static83.aClass1_Sub5_Sub1_3.method715();
		Static83.aClass1_Sub5_Sub1_3.method733();
		for (local32 = 0; local32 < 4; local32++) {
			for (local40 = 0; local40 < 13; local40++) {
				for (local46 = 0; local46 < 13; local46++) {
					local49 = Static83.aClass1_Sub5_Sub1_3.method739(1);
					if (local49 == 1) {
						Static21.anIntArrayArrayArray1[local32][local40][local46] = Static83.aClass1_Sub5_Sub1_3.method739(26);
					} else {
						Static21.anIntArrayArrayArray1[local32][local40][local46] = -1;
					}
				}
			}
		}
		Static83.aClass1_Sub5_Sub1_3.method730();
		local40 = (Static39.anInt1382 - Static83.aClass1_Sub5_Sub1_3.anInt1266) / 16;
		Static100.anIntArrayArray58 = new int[local40][4];
		for (local46 = 0; local46 < local40; local46++) {
			for (local49 = 0; local49 < 4; local49++) {
				Static100.anIntArrayArray58[local46][local49] = Static83.aClass1_Sub5_Sub1_3.method682();
			}
		}
		local49 = Static83.aClass1_Sub5_Sub1_3.method676();
		Static96.anIntArray206 = new int[local40];
		Static75.aByteArrayArray5 = new byte[local40][];
		Static21.anIntArray93 = new int[local40];
		Static96.anIntArray205 = new int[local40];
		Static57.aByteArrayArray4 = new byte[local40][];
		local40 = 0;
		for (local122 = 0; local122 < 4; local122++) {
			for (local129 = 0; local129 < 13; local129++) {
				for (local136 = 0; local136 < 13; local136++) {
					@Pc(402) int local402 = Static21.anIntArrayArrayArray1[local122][local129][local136];
					if (local402 != -1) {
						@Pc(411) int local411 = local402 >> 14 & 0x3FF;
						@Pc(417) int local417 = local402 >> 3 & 0x7FF;
						@Pc(427) int local427 = (local411 / 8 << 8) + local417 / 8;
						for (@Pc(429) int local429 = 0; local429 < local40; local429++) {
							if (Static96.anIntArray206[local429] == local427) {
								local427 = -1;
								break;
							}
						}
						if (local427 != -1) {
							@Pc(456) int local456 = local427 >> 8 & 0xFF;
							@Pc(460) int local460 = local427 & 0xFF;
							Static96.anIntArray206[local40] = local427;
							Static21.anIntArray93[local40] = Static65.aClass55_Sub1_12.method1885(Static17.method233(new Class23[] { Static33.aClass23_572, Static19.method274(local456), Static68.aClass23_250, Static19.method274(local460) }));
							Static96.anIntArray205[local40] = Static65.aClass55_Sub1_12.method1885(Static17.method233(new Class23[] { Static42.aClass23_767, Static19.method274(local456), Static68.aClass23_250, Static19.method274(local460) }));
							local40++;
						}
					}
				}
			}
		}
		Static8.method101(local49, local16, local24, local20, local28);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	public static void method1283() {
		Static41.method891(null, false, 0);
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
	public static void method1284() {
		aClass23_1169 = null;
		aClass23_1166 = null;
		aClass55_30 = null;
		aClass23_1172 = null;
		aClass23_1167 = null;
		aClass23_1171 = null;
		aClass23_1161 = null;
		aClass23_1162 = null;
		aClass23_1163 = null;
		aClass23_1165 = null;
		aClass23_1173 = null;
		aClass23_1164 = null;
		aClass1_Sub1_Sub6_Sub3_19 = null;
		aClass23_1170 = null;
		aClass23Array14 = null;
		aClass23_1168 = null;
	}
}
