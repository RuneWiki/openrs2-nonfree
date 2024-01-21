import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!w;")
	public static Class15 aClass15_33;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	public static int anInt2340;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	public static int anInt2341;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_921 = Static88.method1421("p12_full");

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Lclient!va;")
	private static Class61 aClass61_922 = Static88.method1421("Walk here");

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!va;")
	private static Class61 aClass61_923 = Static88.method1421("Hide");

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!va;")
	public static Class61 aClass61_924 = Static88.method1421("0(U");

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!va;")
	public static Class61 aClass61_925 = Static88.method1421(" ");

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!va;")
	public static Class61 aClass61_926 = aClass61_922;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Lclient!va;")
	public static Class61 aClass61_927 = aClass61_923;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "Lclient!va;")
	public static Class61 aClass61_928 = Static88.method1421("backvmid2");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!ic;)V")
	public static synchronized void method1428(@OriginalArg(1) Class10_Sub5 arg0) {
		Static9.aClass10_Sub5_1 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!he;Lclient!he;Lclient!he;I)V")
	public static void method1429(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class11 arg2) {
		Static88.aClass11_55 = arg1;
		Static46.aClass11_35 = arg2;
		Static21.aClass11_21 = arg0;
		Static104.aClass10_Sub1_Sub4ArrayArray1 = new Class10_Sub1_Sub4[Static88.aClass11_55.method225()][];
		Static51.aBooleanArray5 = new boolean[Static88.aClass11_55.method225()];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([II)V")
	public static synchronized void method1430(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static9.aClass10_Sub5_1 != null) {
			Static9.aClass10_Sub5_1.method879(arg0, 0, local2);
		}
		Static66.method954(local2);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V")
	public static void method1431(@OriginalArg(1) boolean arg0) {
		Static71.aBoolean88 = arg0;
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		@Pc(149) int local149;
		@Pc(153) int local153;
		@Pc(157) int local157;
		if (!Static71.aBoolean88) {
			local9 = Static55.aClass10_Sub10_Sub1_4.method1132();
			local13 = Static55.aClass10_Sub10_Sub1_4.method1119();
			local17 = Static55.aClass10_Sub10_Sub1_4.method1119();
			local22 = (Static5.anInt34 - Static55.aClass10_Sub10_Sub1_4.anInt1957) / 16;
			Static98.anIntArrayArray23 = new int[local22][4];
			for (local26 = 0; local26 < local22; local26++) {
				for (local30 = 0; local30 < 4; local30++) {
					Static98.anIntArrayArray23[local26][local30] = Static55.aClass10_Sub10_Sub1_4.method1127();
				}
			}
			@Pc(374) boolean local374 = false;
			if ((local9 / 8 == 48 || local9 / 8 == 49) && local17 / 8 == 48) {
				local374 = true;
			}
			local30 = Static55.aClass10_Sub10_Sub1_4.method1135();
			if (local9 / 8 == 48 && local17 / 8 == 148) {
				local374 = true;
			}
			local37 = Static55.aClass10_Sub10_Sub1_4.method1119();
			Static39.aByteArrayArray3 = new byte[local22][];
			Static37.anIntArray118 = new int[local22];
			Static17.anIntArray67 = new int[local22];
			Static79.anIntArray240 = new int[local22];
			Static65.aByteArrayArray9 = new byte[local22][];
			local22 = 0;
			for (local149 = (local9 - 6) / 8; local149 <= (local9 + 6) / 8; local149++) {
				for (local153 = (local17 - 6) / 8; local153 <= (local17 + 6) / 8; local153++) {
					local157 = local153 + (local149 << 8);
					if (!local374 || local153 != 49 && local153 != 149 && local153 != 147 && local149 != 50 && (local149 != 49 || local153 != 47)) {
						Static37.anIntArray118[local22] = local157;
						Static79.anIntArray240[local22] = Static57.aClass11_Sub1_10.method221(Static93.method1156(new Class61[] { Static57.aClass61_630, Static29.method529(local149), Static95.aClass61_979, Static29.method529(local153) }));
						Static17.anIntArray67[local22] = Static57.aClass11_Sub1_10.method221(Static93.method1156(new Class61[] { Static12.aClass61_92, Static29.method529(local149), Static95.aClass61_979, Static29.method529(local153) }));
						local22++;
					}
				}
			}
			Static80.method1257(local30, local9, local13, local17, local37);
			return;
		}
		local9 = Static55.aClass10_Sub10_Sub1_4.method1119();
		local13 = Static55.aClass10_Sub10_Sub1_4.method1132();
		local17 = Static55.aClass10_Sub10_Sub1_4.method1135();
		Static55.aClass10_Sub10_Sub1_4.method1162();
		for (local22 = 0; local22 < 4; local22++) {
			for (local26 = 0; local26 < 13; local26++) {
				for (local30 = 0; local30 < 13; local30++) {
					local37 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
					if (local37 == 1) {
						Static38.anIntArrayArrayArray2[local22][local26][local30] = Static55.aClass10_Sub10_Sub1_4.method1171(26);
					} else {
						Static38.anIntArrayArrayArray2[local22][local26][local30] = -1;
					}
				}
			}
		}
		Static55.aClass10_Sub10_Sub1_4.method1165();
		local26 = (Static5.anInt34 - Static55.aClass10_Sub10_Sub1_4.anInt1957) / 16;
		Static98.anIntArrayArray23 = new int[local26][4];
		for (local30 = 0; local30 < local26; local30++) {
			for (local37 = 0; local37 < 4; local37++) {
				Static98.anIntArrayArray23[local30][local37] = Static55.aClass10_Sub10_Sub1_4.method1120();
			}
		}
		local37 = Static55.aClass10_Sub10_Sub1_4.method1141();
		@Pc(130) int local130 = Static55.aClass10_Sub10_Sub1_4.method1141();
		Static39.aByteArrayArray3 = new byte[local26][];
		Static79.anIntArray240 = new int[local26];
		Static17.anIntArray67 = new int[local26];
		Static37.anIntArray118 = new int[local26];
		Static65.aByteArrayArray9 = new byte[local26][];
		local26 = 0;
		for (local149 = 0; local149 < 4; local149++) {
			for (local153 = 0; local153 < 13; local153++) {
				for (local157 = 0; local157 < 13; local157++) {
					@Pc(167) int local167 = Static38.anIntArrayArrayArray2[local149][local153][local157];
					if (local167 != -1) {
						@Pc(177) int local177 = local167 >> 3 & 0x7FF;
						@Pc(183) int local183 = local167 >> 14 & 0x3FF;
						@Pc(193) int local193 = local177 / 8 + (local183 / 8 << 8);
						for (@Pc(195) int local195 = 0; local195 < local26; local195++) {
							if (Static37.anIntArray118[local195] == local193) {
								local193 = -1;
								break;
							}
						}
						if (local193 != -1) {
							Static37.anIntArray118[local26] = local193;
							@Pc(230) int local230 = local193 & 0xFF;
							@Pc(236) int local236 = local193 >> 8 & 0xFF;
							Static79.anIntArray240[local26] = Static57.aClass11_Sub1_10.method221(Static93.method1156(new Class61[] { Static57.aClass61_630, Static29.method529(local236), Static95.aClass61_979, Static29.method529(local230) }));
							Static17.anIntArray67[local26] = Static57.aClass11_Sub1_10.method221(Static93.method1156(new Class61[] { Static12.aClass61_92, Static29.method529(local236), Static95.aClass61_979, Static29.method529(local230) }));
							local26++;
						}
					}
				}
			}
		}
		Static80.method1257(local17, local37, local13, local9, local130);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZLclient!tc;)Lclient!va;")
	public static Class61 method1432(@OriginalArg(2) Class10_Sub10 arg0) {
		try {
			@Pc(7) Class61 local7 = new Class61();
			local7.anInt2559 = arg0.method1136();
			if (local7.anInt2559 > 32767) {
				local7.anInt2559 = 32767;
			}
			local7.aByteArray18 = new byte[local7.anInt2559];
			arg0.anInt1957 += Static35.aClass18_1.method492(arg0.aByteArray9, local7.anInt2559, local7.aByteArray18, arg0.anInt1957, 0);
			return local7;
		} catch (@Pc(57) Exception local57) {
			return Static71.aClass61_759;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method1434() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members],");
		System.exit(1);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public static void method1436() {
		aClass61_924 = null;
		aClass61_921 = null;
		aClass61_928 = null;
		aClass15_33 = null;
		aClass61_927 = null;
		aClass61_926 = null;
		aClass61_923 = null;
		aClass61_925 = null;
		aClass61_922 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public static synchronized void method1437() {
		if (Static9.aClass10_Sub5_1 != null) {
			Static9.aClass10_Sub5_1.method881(256);
		}
		Static66.method954(256);
	}
}
