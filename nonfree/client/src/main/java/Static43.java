import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Lclient!nk;")
	public static Class121 aClass121_31;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public static int anInt905 = 0;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "[S")
	public static short[] aShortArray5 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!db", name = "q", descriptor = "[Lclient!rd;")
	public static Class15_Sub6[] aClass15_Sub6Array1 = new Class15_Sub6[4];

	@OriginalMember(owner = "client!db", name = "r", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public static void method805(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static252.anIntArray400[arg0];
		@Pc(17) int local17 = Static85.anIntArray147[arg0];
		@Pc(21) int local21 = Static17.aShortArray2[arg0];
		@Pc(25) long local25 = Static32.aLongArray8[arg0];
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(35) int local35 = (int) Static32.aLongArray8[arg0];
		@Pc(45) Class15_Sub5_Sub2 local45;
		if (local21 == 5) {
			local45 = Static17.aClass15_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static92.anInt5525 = Static282.anInt5092;
				Static303.anInt5390 = Static238.anInt4321;
				Static262.anInt4774 = 0;
				Static205.anInt3910 = 2;
				Static127.aClass1_Sub14_Sub1_3.method1408(193);
				Static127.aClass1_Sub14_Sub1_3.method1341(local35);
				Static127.aClass1_Sub14_Sub1_3.method1345(Static32.aBooleanArray9[82] ? 1 : 0);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local45.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local45.method4702());
			}
		}
		if (local21 == 18) {
			Static92.anInt5525 = Static282.anInt5092;
			Static262.anInt4774 = 0;
			Static205.anInt3910 = 2;
			Static303.anInt5390 = Static238.anInt4321;
			Static127.aClass1_Sub14_Sub1_3.method1408(127);
			Static127.aClass1_Sub14_Sub1_3.method1341(Static199.anInt3817 + local17);
			Static127.aClass1_Sub14_Sub1_3.method1341(Static192.anInt3637 + local13);
			Static127.aClass1_Sub14_Sub1_3.method1337(local35);
			Static127.aClass1_Sub14_Sub1_3.method1349(Static32.aBooleanArray9[82] ? 1 : 0);
			Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, 0, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, 0);
		}
		if (local21 == 41) {
			local45 = Static17.aClass15_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static303.anInt5390 = Static238.anInt4321;
				Static205.anInt3910 = 2;
				Static92.anInt5525 = Static282.anInt5092;
				Static262.anInt4774 = 0;
				Static127.aClass1_Sub14_Sub1_3.method1408(154);
				Static127.aClass1_Sub14_Sub1_3.method1337(local35);
				Static127.aClass1_Sub14_Sub1_3.method1345(Static32.aBooleanArray9[82] ? 1 : 0);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local45.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local45.method4702());
			}
		}
		if (local21 == 12) {
			Static127.aClass1_Sub14_Sub1_3.method1408(160);
			Static127.aClass1_Sub14_Sub1_3.method1341(local17);
			Static127.aClass1_Sub14_Sub1_3.method1376(local13);
			Static127.aClass1_Sub14_Sub1_3.method1337(local35);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 46) {
			local45 = Static17.aClass15_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static303.anInt5390 = Static238.anInt4321;
				Static262.anInt4774 = 0;
				Static92.anInt5525 = Static282.anInt5092;
				Static205.anInt3910 = 2;
				Static127.aClass1_Sub14_Sub1_3.method1408(187);
				Static127.aClass1_Sub14_Sub1_3.method1338(Static287.anInt5147);
				Static127.aClass1_Sub14_Sub1_3.method1345(Static32.aBooleanArray9[82] ? 1 : 0);
				Static127.aClass1_Sub14_Sub1_3.method1337(local35);
				Static127.aClass1_Sub14_Sub1_3.method1387(Static306.anInt5424);
				Static127.aClass1_Sub14_Sub1_3.method1338(Static8.anInt134);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local45.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local45.method4702());
			}
		}
		if (local21 == 32) {
			Static127.aClass1_Sub14_Sub1_3.method1408(135);
			Static127.aClass1_Sub14_Sub1_3.method1341(Static312.anInt5732);
			Static127.aClass1_Sub14_Sub1_3.method1384(local17);
			Static127.aClass1_Sub14_Sub1_3.method1387(local13);
			Static127.aClass1_Sub14_Sub1_3.method1376(Static104.anInt2090);
		}
		if (local21 == 51) {
			Static127.aClass1_Sub14_Sub1_3.method1408(109);
			Static127.aClass1_Sub14_Sub1_3.method1338(local17);
			Static127.aClass1_Sub14_Sub1_3.method1387(local13);
			Static127.aClass1_Sub14_Sub1_3.method1341(local35);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		@Pc(406) Class66 local406;
		if (local21 == 1001) {
			local406 = Static53.method968(local13);
			if (local406 == null || local406.anIntArray195[local17] < 100000) {
				Static127.aClass1_Sub14_Sub1_3.method1408(114);
				Static127.aClass1_Sub14_Sub1_3.method1337(local35);
			} else {
				Static243.method4744(local406.anIntArray195[local17] + " x " + Static49.method909(local35).aString181, 0, "");
			}
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 9) {
			local45 = Static17.aClass15_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static262.anInt4774 = 0;
				Static92.anInt5525 = Static282.anInt5092;
				Static303.anInt5390 = Static238.anInt4321;
				Static205.anInt3910 = 2;
				Static127.aClass1_Sub14_Sub1_3.method1408(195);
				Static127.aClass1_Sub14_Sub1_3.method1345(Static32.aBooleanArray9[82] ? 1 : 0);
				Static127.aClass1_Sub14_Sub1_3.method1338(local35);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local45.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local45.method4702());
			}
		}
		@Pc(533) Class15_Sub5_Sub1 local533;
		if (local21 == 4) {
			local533 = Static83.aClass15_Sub5_Sub1Array1[local35];
			if (local533 != null) {
				Static92.anInt5525 = Static282.anInt5092;
				Static303.anInt5390 = Static238.anInt4321;
				Static205.anInt3910 = 2;
				Static262.anInt4774 = 0;
				Static127.aClass1_Sub14_Sub1_3.method1408(237);
				Static127.aClass1_Sub14_Sub1_3.method1361(Static32.aBooleanArray9[82] ? 1 : 0);
				Static127.aClass1_Sub14_Sub1_3.method1341(local35);
				Static127.aClass1_Sub14_Sub1_3.method1387(Static104.anInt2090);
				Static127.aClass1_Sub14_Sub1_3.method1337(Static312.anInt5732);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local533.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local533.method4702());
			}
		}
		if (local21 == 30) {
			Static127.aClass1_Sub14_Sub1_3.method1408(218);
			Static127.aClass1_Sub14_Sub1_3.method1342(Static104.anInt2090);
			Static127.aClass1_Sub14_Sub1_3.method1338(local35);
			Static127.aClass1_Sub14_Sub1_3.method1384(Static312.anInt5732);
			Static127.aClass1_Sub14_Sub1_3.method1387(local13);
			Static127.aClass1_Sub14_Sub1_3.method1337(local17);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 36) {
			local533 = Static83.aClass15_Sub5_Sub1Array1[local35];
			if (local533 != null) {
				Static303.anInt5390 = Static238.anInt4321;
				Static205.anInt3910 = 2;
				Static262.anInt4774 = 0;
				Static92.anInt5525 = Static282.anInt5092;
				Static127.aClass1_Sub14_Sub1_3.method1408(34);
				Static127.aClass1_Sub14_Sub1_3.method1337(local35);
				Static127.aClass1_Sub14_Sub1_3.method1390(Static32.aBooleanArray9[82] ? 1 : 0);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local533.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local533.method4702());
			}
		}
		if (local21 == 49) {
			local533 = Static83.aClass15_Sub5_Sub1Array1[local35];
			if (local533 != null) {
				Static303.anInt5390 = Static238.anInt4321;
				Static205.anInt3910 = 2;
				Static92.anInt5525 = Static282.anInt5092;
				Static262.anInt4774 = 0;
				Static127.aClass1_Sub14_Sub1_3.method1408(59);
				Static127.aClass1_Sub14_Sub1_3.method1337(local35);
				Static127.aClass1_Sub14_Sub1_3.method1361(Static32.aBooleanArray9[82] ? 1 : 0);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local533.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local533.method4702());
			}
		}
		if (local21 == 1002) {
			Static205.anInt3910 = 2;
			Static92.anInt5525 = Static282.anInt5092;
			Static303.anInt5390 = Static238.anInt4321;
			Static262.anInt4774 = 0;
			Static127.aClass1_Sub14_Sub1_3.method1408(114);
			Static127.aClass1_Sub14_Sub1_3.method1337(local35);
		}
		if (local21 == 50) {
			Static301.method4558();
			local406 = Static53.method968(local13);
			Static287.anInt5147 = local35;
			Static306.anInt5424 = local13;
			Static306.anInt5423 = 1;
			Static8.anInt134 = local17;
			Static103.method1865(local406);
			Static272.aString340 = "<col=ff9040>" + Static49.method909(local35).aString181 + "<col=ffffff>";
			if (Static272.aString340 == null) {
				Static272.aString340 = "null";
			}
			return;
		}
		if (local21 == 3) {
			Static92.anInt5525 = Static282.anInt5092;
			Static205.anInt3910 = 2;
			Static262.anInt4774 = 0;
			Static303.anInt5390 = Static238.anInt4321;
			Static127.aClass1_Sub14_Sub1_3.method1408(26);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static199.anInt3817 + local17);
			Static127.aClass1_Sub14_Sub1_3.method1341(local35);
			Static127.aClass1_Sub14_Sub1_3.method1345(Static32.aBooleanArray9[82] ? 1 : 0);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static192.anInt3637 + local13);
			Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, 0, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, 0);
		}
		if (local21 == 40) {
			Static262.anInt4774 = 0;
			Static205.anInt3910 = 2;
			Static92.anInt5525 = Static282.anInt5092;
			Static303.anInt5390 = Static238.anInt4321;
			Static127.aClass1_Sub14_Sub1_3.method1408(100);
			Static127.aClass1_Sub14_Sub1_3.method1390(Static32.aBooleanArray9[82] ? 1 : 0);
			Static127.aClass1_Sub14_Sub1_3.method1341(Static199.anInt3817 + local17);
			Static127.aClass1_Sub14_Sub1_3.method1341(local13 + Static192.anInt3637);
			Static127.aClass1_Sub14_Sub1_3.method1341((int) (local25 >>> 32) & Integer.MAX_VALUE);
			Static183.method3000(local13, local17, local25);
		}
		if (local21 == 38) {
			Static127.aClass1_Sub14_Sub1_3.method1408(55);
			Static127.aClass1_Sub14_Sub1_3.method1384(local35);
			Static127.aClass1_Sub14_Sub1_3.method1337(local17);
			Static127.aClass1_Sub14_Sub1_3.method1387(local13);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 39) {
			local533 = Static83.aClass15_Sub5_Sub1Array1[local35];
			if (local533 != null) {
				Static92.anInt5525 = Static282.anInt5092;
				Static303.anInt5390 = Static238.anInt4321;
				Static205.anInt3910 = 2;
				Static262.anInt4774 = 0;
				Static127.aClass1_Sub14_Sub1_3.method1408(138);
				Static127.aClass1_Sub14_Sub1_3.method1341(local35);
				Static127.aClass1_Sub14_Sub1_3.method1390(Static32.aBooleanArray9[82] ? 1 : 0);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local533.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local533.method4702());
			}
		}
		if (local21 == 57) {
			Static262.anInt4774 = 0;
			Static303.anInt5390 = Static238.anInt4321;
			Static205.anInt3910 = 2;
			Static92.anInt5525 = Static282.anInt5092;
			Static127.aClass1_Sub14_Sub1_3.method1408(76);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static192.anInt3637 + local13);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static199.anInt3817 + local17);
			Static127.aClass1_Sub14_Sub1_3.method1349(Static32.aBooleanArray9[82] ? 1 : 0);
			Static127.aClass1_Sub14_Sub1_3.method1338(local35);
			Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, 0, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, 0);
		}
		if (local21 == 13) {
			local533 = Static83.aClass15_Sub5_Sub1Array1[local35];
			if (local533 != null) {
				Static205.anInt3910 = 2;
				Static92.anInt5525 = Static282.anInt5092;
				Static262.anInt4774 = 0;
				Static303.anInt5390 = Static238.anInt4321;
				Static127.aClass1_Sub14_Sub1_3.method1408(151);
				Static127.aClass1_Sub14_Sub1_3.method1390(Static32.aBooleanArray9[82] ? 1 : 0);
				Static127.aClass1_Sub14_Sub1_3.method1341(local35);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local533.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local533.method4702());
			}
		}
		if (local21 == 11) {
			local406 = Static296.method4522(local13, local17);
			if (local406 != null) {
				Static301.method4558();
				@Pc(1192) Class1_Sub22 local1192 = Static37.method679(local406);
				Static275.method4269(local1192.method3059(), local1192.anInt3563, local17, local13, local406.anInt2225, local406.anInt2199);
				Static306.anInt5423 = 0;
				Static148.aString164 = Static31.method504(local406);
				if (local406.aBoolean132) {
					Static88.aString106 = local406.aString123 + "<col=ffffff>";
				} else {
					Static88.aString106 = "<col=00ff00>" + local406.aString121 + "<col=ffffff>";
				}
				if (Static148.aString164 == null) {
					Static148.aString164 = "Null";
				}
			}
			return;
		}
		if (local21 == 1010) {
			Static262.anInt4774 = 0;
			Static303.anInt5390 = Static238.anInt4321;
			Static205.anInt3910 = 2;
			Static92.anInt5525 = Static282.anInt5092;
			Static127.aClass1_Sub14_Sub1_3.method1408(27);
			Static127.aClass1_Sub14_Sub1_3.method1349(Static32.aBooleanArray9[82] ? 1 : 0);
			Static127.aClass1_Sub14_Sub1_3.method1384((int) (local25 >>> 32) & Integer.MAX_VALUE);
			Static127.aClass1_Sub14_Sub1_3.method1341(Static192.anInt3637 + local13);
			Static127.aClass1_Sub14_Sub1_3.method1384(local17 + Static199.anInt3817);
			Static183.method3000(local13, local17, local25);
		}
		@Pc(1343) int local1343;
		if (local21 == 37) {
			Static127.aClass1_Sub14_Sub1_3.method1408(220);
			Static127.aClass1_Sub14_Sub1_3.method1387(local13);
			local406 = Static53.method968(local13);
			if (local406.anIntArrayArray17 != null && local406.anIntArrayArray17[0][0] == 5) {
				local1343 = local406.anIntArrayArray17[0][1];
				if (local406.anIntArray186[0] != Static55.anIntArray64[local1343]) {
					Static55.anIntArray64[local1343] = local406.anIntArray186[0];
					Static229.method3546(local1343);
				}
			}
		}
		if (local21 == 23) {
			Static127.aClass1_Sub14_Sub1_3.method1408(141);
			Static127.aClass1_Sub14_Sub1_3.method1338(local35);
			Static127.aClass1_Sub14_Sub1_3.method1351(local13);
			Static127.aClass1_Sub14_Sub1_3.method1337(local17);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 42) {
			local45 = Static17.aClass15_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static303.anInt5390 = Static238.anInt4321;
				Static262.anInt4774 = 0;
				Static92.anInt5525 = Static282.anInt5092;
				Static205.anInt3910 = 2;
				Static127.aClass1_Sub14_Sub1_3.method1408(254);
				Static127.aClass1_Sub14_Sub1_3.method1384(local35);
				Static127.aClass1_Sub14_Sub1_3.method1361(Static32.aBooleanArray9[82] ? 1 : 0);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local45.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local45.method4702());
			}
		}
		if (local21 == 47) {
			Static127.aClass1_Sub14_Sub1_3.method1408(122);
			Static127.aClass1_Sub14_Sub1_3.method1338(local17);
			Static127.aClass1_Sub14_Sub1_3.method1342(local13);
			Static127.aClass1_Sub14_Sub1_3.method1341(local35);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 1007 || local21 == 1005 || local21 == 1011 || local21 == 1003 || local21 == 1008) {
			Static76.method1483(local35, local17, local21);
		}
		if (local21 == 7) {
			Static127.aClass1_Sub14_Sub1_3.method1408(105);
			Static127.aClass1_Sub14_Sub1_3.method1337(local17);
			Static127.aClass1_Sub14_Sub1_3.method1387(local13);
			Static127.aClass1_Sub14_Sub1_3.method1341(Static8.anInt134);
			Static127.aClass1_Sub14_Sub1_3.method1341(local35);
			Static127.aClass1_Sub14_Sub1_3.method1351(Static306.anInt5424);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static287.anInt5147);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 60) {
			Static303.anInt5390 = Static238.anInt4321;
			Static92.anInt5525 = Static282.anInt5092;
			Static205.anInt3910 = 2;
			Static262.anInt4774 = 0;
			Static127.aClass1_Sub14_Sub1_3.method1408(35);
			Static127.aClass1_Sub14_Sub1_3.method1384((int) (local25 >>> 32) & Integer.MAX_VALUE);
			Static127.aClass1_Sub14_Sub1_3.method1384(Static312.anInt5732);
			Static127.aClass1_Sub14_Sub1_3.method1384(local13 + Static192.anInt3637);
			Static127.aClass1_Sub14_Sub1_3.method1384(Static199.anInt3817 + local17);
			Static127.aClass1_Sub14_Sub1_3.method1387(Static104.anInt2090);
			Static127.aClass1_Sub14_Sub1_3.method1361(Static32.aBooleanArray9[82] ? 1 : 0);
			Static183.method3000(local13, local17, local25);
		}
		if (local21 == 26) {
			Static127.aClass1_Sub14_Sub1_3.method1408(53);
			Static127.aClass1_Sub14_Sub1_3.method1376(local13);
			Static127.aClass1_Sub14_Sub1_3.method1384(local17);
			Static127.aClass1_Sub14_Sub1_3.method1341(local35);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 35) {
			Static127.aClass1_Sub14_Sub1_3.method1408(159);
			Static127.aClass1_Sub14_Sub1_3.method1342(local13);
			Static127.aClass1_Sub14_Sub1_3.method1337(local35);
			Static127.aClass1_Sub14_Sub1_3.method1337(local17);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 14) {
			local45 = Static17.aClass15_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static262.anInt4774 = 0;
				Static92.anInt5525 = Static282.anInt5092;
				Static205.anInt3910 = 2;
				Static303.anInt5390 = Static238.anInt4321;
				Static127.aClass1_Sub14_Sub1_3.method1408(78);
				Static127.aClass1_Sub14_Sub1_3.method1345(Static32.aBooleanArray9[82] ? 1 : 0);
				Static127.aClass1_Sub14_Sub1_3.method1384(local35);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local45.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local45.method4702());
			}
		}
		if (local21 == 19) {
			local406 = Static53.method968(local13);
			@Pc(1772) boolean local1772 = true;
			if (local406.anInt2210 > 0) {
				local1772 = Static130.method2231(local406);
			}
			if (local1772) {
				Static127.aClass1_Sub14_Sub1_3.method1408(220);
				Static127.aClass1_Sub14_Sub1_3.method1387(local13);
			}
		}
		if (local21 == 58) {
			local45 = Static17.aClass15_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static262.anInt4774 = 0;
				Static92.anInt5525 = Static282.anInt5092;
				Static205.anInt3910 = 2;
				Static303.anInt5390 = Static238.anInt4321;
				Static127.aClass1_Sub14_Sub1_3.method1408(108);
				Static127.aClass1_Sub14_Sub1_3.method1337(local35);
				Static127.aClass1_Sub14_Sub1_3.method1390(Static32.aBooleanArray9[82] ? 1 : 0);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local45.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local45.method4702());
			}
		}
		if (local21 == 10) {
			if (local35 == 0) {
				Static134.anInt5660 = 1;
				Static255.method4051(Static65.anInt1300, local17, local13);
			} else if (local35 == 1) {
				Static127.aClass1_Sub14_Sub1_3.method1408(235);
				Static127.aClass1_Sub14_Sub1_3.method1384(Static192.anInt3637 + local13);
				Static127.aClass1_Sub14_Sub1_3.method1338(Static199.anInt3817 + local17);
				Static127.aClass1_Sub14_Sub1_3.method1341(Static312.anInt5732);
				Static127.aClass1_Sub14_Sub1_3.method1387(Static104.anInt2090);
			}
		}
		if (local21 == 43) {
			Static173.method2914();
		}
		if (local21 == 25) {
			local533 = Static83.aClass15_Sub5_Sub1Array1[local35];
			if (local533 != null) {
				Static303.anInt5390 = Static238.anInt4321;
				Static205.anInt3910 = 2;
				Static262.anInt4774 = 0;
				Static92.anInt5525 = Static282.anInt5092;
				Static127.aClass1_Sub14_Sub1_3.method1408(51);
				Static127.aClass1_Sub14_Sub1_3.method1345(Static32.aBooleanArray9[82] ? 1 : 0);
				Static127.aClass1_Sub14_Sub1_3.method1384(local35);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local533.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local533.method4702());
			}
		}
		if (local21 == 2) {
			Static127.aClass1_Sub14_Sub1_3.method1408(220);
			Static127.aClass1_Sub14_Sub1_3.method1387(local13);
			local406 = Static53.method968(local13);
			if (local406.anIntArrayArray17 != null && local406.anIntArrayArray17[0][0] == 5) {
				local1343 = local406.anIntArrayArray17[0][1];
				Static55.anIntArray64[local1343] = 1 - Static55.anIntArray64[local1343];
				Static229.method3546(local1343);
			}
		}
		if (local21 == 28) {
			if (local35 == 0) {
				Static255.method4051(Static65.anInt1300, local17, local13);
			} else if (local35 == 1) {
				if (Static137.anInt2751 > 0 && Static32.aBooleanArray9[82] && Static32.aBooleanArray9[81]) {
					Static255.method4050(Static65.anInt1300, Static192.anInt3637 + local13, local17 + Static199.anInt3817);
				} else {
					Static182.method2995(local17, 1, local13);
					Static127.aClass1_Sub14_Sub1_3.method1390(Static76.anInt1574);
					Static127.aClass1_Sub14_Sub1_3.method1390(Static205.anInt3912);
					Static127.aClass1_Sub14_Sub1_3.method1338((int) Static49.aFloat32);
					Static127.aClass1_Sub14_Sub1_3.method1390(57);
					Static127.aClass1_Sub14_Sub1_3.method1390(Static189.anInt3613);
					Static127.aClass1_Sub14_Sub1_3.method1390(Static309.anInt5618);
					Static127.aClass1_Sub14_Sub1_3.method1390(89);
					Static127.aClass1_Sub14_Sub1_3.method1338(Static90.aClass15_Sub5_Sub2_2.anInt5559);
					Static127.aClass1_Sub14_Sub1_3.method1338(Static90.aClass15_Sub5_Sub2_2.anInt5557);
					Static127.aClass1_Sub14_Sub1_3.method1390(Static210.anInt3996);
					Static127.aClass1_Sub14_Sub1_3.method1390(63);
					Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, 0, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, 0);
				}
			}
		}
		if (local21 == 1012) {
			Static303.anInt5390 = Static238.anInt4321;
			Static92.anInt5525 = Static282.anInt5092;
			Static205.anInt3910 = 2;
			Static262.anInt4774 = 0;
			Static127.aClass1_Sub14_Sub1_3.method1408(234);
			Static127.aClass1_Sub14_Sub1_3.method1341(local35);
		}
		if (local21 == 8) {
			Static92.anInt5525 = Static282.anInt5092;
			Static205.anInt3910 = 2;
			Static262.anInt4774 = 0;
			Static303.anInt5390 = Static238.anInt4321;
			Static127.aClass1_Sub14_Sub1_3.method1408(178);
			Static127.aClass1_Sub14_Sub1_3.method1338(local35);
			Static127.aClass1_Sub14_Sub1_3.method1337(local13 + Static192.anInt3637);
			Static127.aClass1_Sub14_Sub1_3.method1390(Static32.aBooleanArray9[82] ? 1 : 0);
			Static127.aClass1_Sub14_Sub1_3.method1384(local17 + Static199.anInt3817);
			Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, 0, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, 0);
		}
		if (local21 == 59) {
			local45 = Static17.aClass15_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static205.anInt3910 = 2;
				Static92.anInt5525 = Static282.anInt5092;
				Static303.anInt5390 = Static238.anInt4321;
				Static262.anInt4774 = 0;
				Static127.aClass1_Sub14_Sub1_3.method1408(80);
				Static127.aClass1_Sub14_Sub1_3.method1341(local35);
				Static127.aClass1_Sub14_Sub1_3.method1349(Static32.aBooleanArray9[82] ? 1 : 0);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local45.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local45.method4702());
			}
		}
		if (local21 == 29 || local21 == 1006) {
			Static8.method118(local35, local13, Static73.aStringArray6[arg0], local17);
		}
		if (local21 == 34) {
			Static127.aClass1_Sub14_Sub1_3.method1408(91);
			Static127.aClass1_Sub14_Sub1_3.method1351(local13);
			Static127.aClass1_Sub14_Sub1_3.method1384(local35);
			Static127.aClass1_Sub14_Sub1_3.method1341(local17);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 21) {
			local45 = Static17.aClass15_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static205.anInt3910 = 2;
				Static303.anInt5390 = Static238.anInt4321;
				Static262.anInt4774 = 0;
				Static92.anInt5525 = Static282.anInt5092;
				Static127.aClass1_Sub14_Sub1_3.method1408(12);
				Static127.aClass1_Sub14_Sub1_3.method1338(local35);
				Static127.aClass1_Sub14_Sub1_3.method1390(Static32.aBooleanArray9[82] ? 1 : 0);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local45.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local45.method4702());
			}
		}
		if (local21 == 44) {
			Static303.anInt5390 = Static238.anInt4321;
			Static92.anInt5525 = Static282.anInt5092;
			Static205.anInt3910 = 2;
			Static262.anInt4774 = 0;
			Static127.aClass1_Sub14_Sub1_3.method1408(66);
			Static127.aClass1_Sub14_Sub1_3.method1361(Static32.aBooleanArray9[82] ? 1 : 0);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static199.anInt3817 + local17);
			Static127.aClass1_Sub14_Sub1_3.method1384(Static192.anInt3637 + local13);
			Static127.aClass1_Sub14_Sub1_3.method1384(Integer.MAX_VALUE & (int) (local25 >>> 32));
			Static183.method3000(local13, local17, local25);
		}
		if (local21 == 20) {
			local45 = Static17.aClass15_Sub5_Sub2Array1[local35];
			if (local45 != null) {
				Static205.anInt3910 = 2;
				Static262.anInt4774 = 0;
				Static92.anInt5525 = Static282.anInt5092;
				Static303.anInt5390 = Static238.anInt4321;
				Static127.aClass1_Sub14_Sub1_3.method1408(45);
				Static127.aClass1_Sub14_Sub1_3.method1338(Static312.anInt5732);
				Static127.aClass1_Sub14_Sub1_3.method1361(Static32.aBooleanArray9[82] ? 1 : 0);
				Static127.aClass1_Sub14_Sub1_3.method1342(Static104.anInt2090);
				Static127.aClass1_Sub14_Sub1_3.method1337(local35);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local45.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local45.method4702());
			}
		}
		if (local21 == 22) {
			Static92.anInt5525 = Static282.anInt5092;
			Static205.anInt3910 = 2;
			Static262.anInt4774 = 0;
			Static303.anInt5390 = Static238.anInt4321;
			Static127.aClass1_Sub14_Sub1_3.method1408(140);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static199.anInt3817 + local17);
			Static127.aClass1_Sub14_Sub1_3.method1338(local13 + Static192.anInt3637);
			Static127.aClass1_Sub14_Sub1_3.method1384((int) (local25 >>> 32) & Integer.MAX_VALUE);
			Static127.aClass1_Sub14_Sub1_3.method1390(Static32.aBooleanArray9[82] ? 1 : 0);
			Static183.method3000(local13, local17, local25);
		}
		if (local21 == 15) {
			local533 = Static83.aClass15_Sub5_Sub1Array1[local35];
			if (local533 != null) {
				Static205.anInt3910 = 2;
				Static262.anInt4774 = 0;
				Static303.anInt5390 = Static238.anInt4321;
				Static92.anInt5525 = Static282.anInt5092;
				Static127.aClass1_Sub14_Sub1_3.method1408(162);
				Static127.aClass1_Sub14_Sub1_3.method1384(local35);
				Static127.aClass1_Sub14_Sub1_3.method1376(Static306.anInt5424);
				Static127.aClass1_Sub14_Sub1_3.method1341(Static287.anInt5147);
				Static127.aClass1_Sub14_Sub1_3.method1361(Static32.aBooleanArray9[82] ? 1 : 0);
				Static127.aClass1_Sub14_Sub1_3.method1384(Static8.anInt134);
				Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, local533.method4702(), Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, local533.method4702());
			}
		}
		if (local21 == 45 && Static310.aClass66_51 == null) {
			Static3.method20(local17, local13);
			Static310.aClass66_51 = Static296.method4522(local13, local17);
			Static103.method1865(Static310.aClass66_51);
		}
		if (local21 == 48) {
			Static262.anInt4774 = 0;
			Static303.anInt5390 = Static238.anInt4321;
			Static205.anInt3910 = 2;
			Static92.anInt5525 = Static282.anInt5092;
			Static127.aClass1_Sub14_Sub1_3.method1408(49);
			Static127.aClass1_Sub14_Sub1_3.method1338(local35);
			Static127.aClass1_Sub14_Sub1_3.method1338(Static8.anInt134);
			Static127.aClass1_Sub14_Sub1_3.method1384(Static287.anInt5147);
			Static127.aClass1_Sub14_Sub1_3.method1345(Static32.aBooleanArray9[82] ? 1 : 0);
			Static127.aClass1_Sub14_Sub1_3.method1337(local17 + Static199.anInt3817);
			Static127.aClass1_Sub14_Sub1_3.method1342(Static306.anInt5424);
			Static127.aClass1_Sub14_Sub1_3.method1384(Static192.anInt3637 + local13);
			Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, 0, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, 0);
		}
		if (local21 == 33) {
			Static92.anInt5525 = Static282.anInt5092;
			Static205.anInt3910 = 2;
			Static303.anInt5390 = Static238.anInt4321;
			Static262.anInt4774 = 0;
			Static127.aClass1_Sub14_Sub1_3.method1408(153);
			Static127.aClass1_Sub14_Sub1_3.method1341(local13 + Static192.anInt3637);
			Static127.aClass1_Sub14_Sub1_3.method1384(Integer.MAX_VALUE & (int) (local25 >>> 32));
			Static127.aClass1_Sub14_Sub1_3.method1341(local17 + Static199.anInt3817);
			Static127.aClass1_Sub14_Sub1_3.method1390(Static32.aBooleanArray9[82] ? 1 : 0);
			Static183.method3000(local13, local17, local25);
		}
		if (local21 == 24) {
			Static303.anInt5390 = Static238.anInt4321;
			Static262.anInt4774 = 0;
			Static92.anInt5525 = Static282.anInt5092;
			Static205.anInt3910 = 2;
			Static127.aClass1_Sub14_Sub1_3.method1408(98);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static287.anInt5147);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static8.anInt134);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static192.anInt3637 + local13);
			Static127.aClass1_Sub14_Sub1_3.method1338(local17 + Static199.anInt3817);
			Static127.aClass1_Sub14_Sub1_3.method1342(Static306.anInt5424);
			Static127.aClass1_Sub14_Sub1_3.method1349(Static32.aBooleanArray9[82] ? 1 : 0);
			Static127.aClass1_Sub14_Sub1_3.method1384((int) (local25 >>> 32) & Integer.MAX_VALUE);
			Static183.method3000(local13, local17, local25);
		}
		if (local21 == 1) {
			Static262.anInt4774 = 0;
			Static92.anInt5525 = Static282.anInt5092;
			Static205.anInt3910 = 2;
			Static303.anInt5390 = Static238.anInt4321;
			Static127.aClass1_Sub14_Sub1_3.method1408(19);
			Static127.aClass1_Sub14_Sub1_3.method1351(Static104.anInt2090);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static192.anInt3637 + local13);
			Static127.aClass1_Sub14_Sub1_3.method1341(local17 + Static199.anInt3817);
			Static127.aClass1_Sub14_Sub1_3.method1338(local35);
			Static127.aClass1_Sub14_Sub1_3.method1361(Static32.aBooleanArray9[82] ? 1 : 0);
			Static127.aClass1_Sub14_Sub1_3.method1337(Static312.anInt5732);
			Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, 0, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, 0);
		}
		if (local21 == 17) {
			Static205.anInt3910 = 2;
			Static262.anInt4774 = 0;
			Static303.anInt5390 = Static238.anInt4321;
			Static92.anInt5525 = Static282.anInt5092;
			Static127.aClass1_Sub14_Sub1_3.method1408(31);
			Static127.aClass1_Sub14_Sub1_3.method1390(Static32.aBooleanArray9[82] ? 1 : 0);
			Static127.aClass1_Sub14_Sub1_3.method1384(Static199.anInt3817 + local17);
			Static127.aClass1_Sub14_Sub1_3.method1341(local13 + Static192.anInt3637);
			Static127.aClass1_Sub14_Sub1_3.method1338(local35);
			Static45.method886(local13, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local17, 0, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, 0);
		}
		if (local21 == 6) {
			if (local35 == 0) {
				Static200.anInt3852 = 1;
				Static255.method4051(Static65.anInt1300, local17, local13);
			} else if (Static137.anInt2751 > 0 && Static32.aBooleanArray9[82] && Static32.aBooleanArray9[81]) {
				Static255.method4050(Static65.anInt1300, Static192.anInt3637 + local13, Static199.anInt3817 + local17);
			} else {
				Static127.aClass1_Sub14_Sub1_3.method1408(212);
				Static127.aClass1_Sub14_Sub1_3.method1338(local17 + Static199.anInt3817);
				Static127.aClass1_Sub14_Sub1_3.method1384(Static192.anInt3637 + local13);
			}
		}
		if (local21 == 31) {
			Static127.aClass1_Sub14_Sub1_3.method1408(164);
			Static127.aClass1_Sub14_Sub1_3.method1342(local13);
			Static127.aClass1_Sub14_Sub1_3.method1341(local35);
			Static127.aClass1_Sub14_Sub1_3.method1384(local17);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 16) {
			Static127.aClass1_Sub14_Sub1_3.method1408(41);
			Static127.aClass1_Sub14_Sub1_3.method1341(local17);
			Static127.aClass1_Sub14_Sub1_3.method1387(local13);
			Static127.aClass1_Sub14_Sub1_3.method1337(local35);
			Static250.anInt4518 = 0;
			Static281.aClass66_45 = Static53.method968(local13);
			Static218.anInt1146 = local17;
		}
		if (local21 == 1004) {
			Static262.anInt4774 = 0;
			Static92.anInt5525 = Static282.anInt5092;
			Static205.anInt3910 = 2;
			Static303.anInt5390 = Static238.anInt4321;
			local533 = Static83.aClass15_Sub5_Sub1Array1[local35];
			if (local533 != null) {
				@Pc(3197) Class99 local3197 = local533.aClass99_1;
				if (local3197.anIntArray255 != null) {
					local3197 = local3197.method2647();
				}
				if (local3197 != null) {
					Static127.aClass1_Sub14_Sub1_3.method1408(44);
					Static127.aClass1_Sub14_Sub1_3.method1384(local3197.anInt3039);
				}
			}
		}
		if (Static306.anInt5423 != 0) {
			Static306.anInt5423 = 0;
			Static103.method1865(Static53.method968(Static306.anInt5424));
		}
		if (Static133.aBoolean168) {
			Static301.method4558();
		}
		if (Static281.aClass66_45 != null && Static250.anInt4518 == 0) {
			Static103.method1865(Static281.aClass66_45);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method807() {
		for (@Pc(3) int local3 = 0; local3 < Static64.anInt1227; local3++) {
			@Pc(10) Class17 local10 = Static98.method1803(local3);
			if (local10 != null && local10.anInt409 == 0) {
				Static107.anIntArray191[local3] = 0;
				Static55.anIntArray64[local3] = 0;
			}
		}
		Static86.aClass142_7 = new Class142(16);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!lf;Z)Lclient!rm;")
	public static Class44_Sub3 method808(@OriginalArg(0) Class1_Sub14 arg0) {
		return new Class44_Sub3(arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1352(), arg0.method1352(), arg0.method1378());
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method809(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString72 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local24 + "| " + local61;
			}
			@Pc(72) int local72 = local64.indexOf(40);
			@Pc(79) int local79 = local64.indexOf(41, local72 + 1);
			@Pc(87) String local87;
			if (local72 == -1) {
				local87 = local64;
			} else {
				local87 = local64.substring(0, local72);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local24 = local24 + local87;
			if (local72 != -1 && local79 != -1) {
				@Pc(133) int local133 = local64.indexOf(".java:", local72);
				if (local133 >= 0) {
					local24 = local24 + local64.substring(local133 + 5, local79);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BIILclient!nk;Lclient!nk;)Lclient!fg;")
	public static Class1_Sub2_Sub6 method811(@OriginalArg(1) int arg0, @OriginalArg(3) Class121 arg1, @OriginalArg(4) Class121 arg2) {
		return Static313.method2575(arg0, 0, arg1) ? Static234.method3634(arg2.method3115(arg0, 0)) : null;
	}
}
