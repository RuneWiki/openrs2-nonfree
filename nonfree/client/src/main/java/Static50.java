import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Z")
	public static boolean aBoolean82;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Z")
	public static boolean aBoolean83;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[100];

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!ps;")
	public static Class163 aClass163_5 = null;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_23 = new Class37(100);

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_24 = new Class37(260);

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString43 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)Lclient!nd;")
	public static Class7_Sub8 method1010() {
		@Pc(8) Class7_Sub8 local8 = (Class7_Sub8) Static148.aClass122_4.method2618();
		if (local8 == null) {
			return new Class7_Sub8();
		} else {
			Static233.anInt4835--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!dr;)V")
	public static void method1011(@OriginalArg(1) Class1_Sub12 arg0) {
		if (arg0 == null || arg0 == Static58.aClass14_4.aClass1_17) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt1410;
		@Pc(18) int local18 = arg0.anInt1405;
		@Pc(21) int local21 = arg0.anInt1409;
		@Pc(25) int local25 = (int) arg0.aLong30;
		@Pc(28) long local28 = arg0.aLong30;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(41) Class10_Sub1_Sub2_Sub1 local41;
		if (local21 == 31) {
			local41 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local25];
			if (local41 != null) {
				Static328.anInt486 = Static289.anInt5796;
				Static166.anInt3452 = 0;
				Static33.anInt646 = Static27.anInt4213;
				Static319.anInt3288 = 2;
				Static305.aClass1_Sub21_Sub2_3.method5757(166);
				Static305.aClass1_Sub21_Sub2_3.method5734(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5711(local25);
				Static102.method1601(0, local41.anIntArray387[0], -2, local41.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local41.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local41.method3402());
			}
		}
		if (local21 == 1011) {
			Static328.anInt486 = Static289.anInt5796;
			Static166.anInt3452 = 0;
			Static319.anInt3288 = 2;
			Static33.anInt646 = Static27.anInt4213;
			local41 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local25];
			if (local41 != null) {
				@Pc(124) Class60 local124 = local41.aClass60_1;
				if (local124.anIntArray109 != null) {
					local124 = local124.method1274();
				}
				if (local124 != null) {
					Static305.aClass1_Sub21_Sub2_3.method5757(132);
					Static305.aClass1_Sub21_Sub2_3.method5698(local124.anInt1530);
				}
			}
		}
		if (local21 == 1006) {
			Static328.anInt486 = Static289.anInt5796;
			Static166.anInt3452 = 0;
			Static33.anInt646 = Static27.anInt4213;
			Static319.anInt3288 = 2;
			Static305.aClass1_Sub21_Sub2_3.method5757(125);
			Static305.aClass1_Sub21_Sub2_3.method5751(local18 + Static98.anInt1911);
			Static305.aClass1_Sub21_Sub2_3.method5734(Static112.aBooleanArray11[82] ? 1 : 0);
			Static305.aClass1_Sub21_Sub2_3.method5711(Static92.anInt1755 + local15);
			Static305.aClass1_Sub21_Sub2_3.method5711(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static298.method5213(local18, local15, local28);
		}
		if (local21 == 4) {
			Static319.anInt3288 = 1;
			Static33.anInt646 = Static27.anInt4213;
			Static166.anInt3452 = 0;
			Static328.anInt486 = Static289.anInt5796;
			Static305.aClass1_Sub21_Sub2_3.method5757(84);
			Static305.aClass1_Sub21_Sub2_3.method5724(Static259.anInt5310);
			Static305.aClass1_Sub21_Sub2_3.method5751(Static178.anInt3758);
			Static305.aClass1_Sub21_Sub2_3.method5711(local15 + Static92.anInt1755);
			Static305.aClass1_Sub21_Sub2_3.method5711(Static98.anInt1911 + local18);
			Static102.method1601(0, local15, -4, local18, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], 1, true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], 1);
		}
		if (local21 == 23) {
			Static305.aClass1_Sub21_Sub2_3.method5757(76);
			Static305.aClass1_Sub21_Sub2_3.method5702(local18);
			Static305.aClass1_Sub21_Sub2_3.method5751(local15);
			Static305.aClass1_Sub21_Sub2_3.method5696(local25);
			Static111.anInt2150 = 0;
			Static90.aClass163_6 = Static248.method22(local18);
			Static351.anInt4014 = local15;
		}
		if (local21 == 24) {
			local41 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local25];
			if (local41 != null) {
				Static33.anInt646 = Static27.anInt4213;
				Static166.anInt3452 = 0;
				Static328.anInt486 = Static289.anInt5796;
				Static319.anInt3288 = 2;
				Static305.aClass1_Sub21_Sub2_3.method5757(36);
				Static305.aClass1_Sub21_Sub2_3.method5741(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5698(local25);
				Static102.method1601(0, local41.anIntArray387[0], -2, local41.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local41.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local41.method3402());
			}
		}
		@Pc(381) Class10_Sub1_Sub2_Sub2 local381;
		if (local21 == 29) {
			local381 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local25];
			if (local381 != null) {
				Static166.anInt3452 = 0;
				Static328.anInt486 = Static289.anInt5796;
				Static33.anInt646 = Static27.anInt4213;
				Static319.anInt3288 = 2;
				Static305.aClass1_Sub21_Sub2_3.method5757(27);
				Static305.aClass1_Sub21_Sub2_3.method5718(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5696(local25);
				Static102.method1601(0, local381.anIntArray387[0], -2, local381.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local381.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local381.method3402());
			}
		}
		if (local21 == 60) {
			if (Static305.anInt6104 > 0 && Static112.aBooleanArray11[82] && Static112.aBooleanArray11[81]) {
				Static180.method3194(local15 + Static92.anInt1755, local18 + Static98.anInt1911, Static127.anInt2487);
			} else {
				Static19.method326(local18, local15, local25);
				if (local25 == 1) {
					Static305.aClass1_Sub21_Sub2_3.method5718(-1);
					Static305.aClass1_Sub21_Sub2_3.method5718(-1);
					Static305.aClass1_Sub21_Sub2_3.method5698((int) Static143.aFloat21);
					Static305.aClass1_Sub21_Sub2_3.method5718(57);
					Static305.aClass1_Sub21_Sub2_3.method5718(Static86.anInt1648);
					Static305.aClass1_Sub21_Sub2_3.method5718(Static260.anInt5347);
					Static305.aClass1_Sub21_Sub2_3.method5718(89);
					Static305.aClass1_Sub21_Sub2_3.method5698(Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728);
					Static305.aClass1_Sub21_Sub2_3.method5698(Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726);
					Static305.aClass1_Sub21_Sub2_3.method5718(63);
				} else {
					Static33.anInt646 = Static27.anInt4213;
					Static319.anInt3288 = 1;
					Static166.anInt3452 = 0;
					Static328.anInt486 = Static289.anInt5796;
				}
				Static102.method1601(0, local15, -4, local18, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], 1, true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], 1);
			}
		}
		if (local21 == 32) {
			Static128.method2975(local18, local15);
		}
		if (local21 == 3) {
			Static319.anInt3288 = 2;
			Static33.anInt646 = Static27.anInt4213;
			Static328.anInt486 = Static289.anInt5796;
			Static166.anInt3452 = 0;
			Static305.aClass1_Sub21_Sub2_3.method5757(68);
			Static305.aClass1_Sub21_Sub2_3.method5738(Static223.anInt1490);
			Static305.aClass1_Sub21_Sub2_3.method5711(Static151.anInt3083);
			Static305.aClass1_Sub21_Sub2_3.method5751(local18 + Static98.anInt1911);
			Static305.aClass1_Sub21_Sub2_3.method5734(Static112.aBooleanArray11[82] ? 1 : 0);
			Static305.aClass1_Sub21_Sub2_3.method5711(local25);
			Static305.aClass1_Sub21_Sub2_3.method5751(Static92.anInt1755 + local15);
			Static305.aClass1_Sub21_Sub2_3.method5696(Static74.anInt1551);
			Static177.method3158(local15, local18);
		}
		if (local21 == 50) {
			local41 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local25];
			if (local41 != null) {
				Static319.anInt3288 = 2;
				Static33.anInt646 = Static27.anInt4213;
				Static166.anInt3452 = 0;
				Static328.anInt486 = Static289.anInt5796;
				Static305.aClass1_Sub21_Sub2_3.method5757(72);
				Static305.aClass1_Sub21_Sub2_3.method5751(Static74.anInt1551);
				Static305.aClass1_Sub21_Sub2_3.method5698(local25);
				Static305.aClass1_Sub21_Sub2_3.method5749(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5710(Static223.anInt1490);
				Static305.aClass1_Sub21_Sub2_3.method5698(Static151.anInt3083);
				Static102.method1601(0, local41.anIntArray387[0], -2, local41.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local41.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local41.method3402());
			}
		}
		if (local21 == 30) {
			Static305.aClass1_Sub21_Sub2_3.method5757(102);
			Static305.aClass1_Sub21_Sub2_3.method5702(local18);
			Static305.aClass1_Sub21_Sub2_3.method5698(local15);
			Static305.aClass1_Sub21_Sub2_3.method5698(local25);
			Static111.anInt2150 = 0;
			Static90.aClass163_6 = Static248.method22(local18);
			Static351.anInt4014 = local15;
		}
		if (local21 == 44) {
			Static33.anInt646 = Static27.anInt4213;
			Static166.anInt3452 = 0;
			Static319.anInt3288 = 2;
			Static328.anInt486 = Static289.anInt5796;
			Static305.aClass1_Sub21_Sub2_3.method5757(81);
			Static305.aClass1_Sub21_Sub2_3.method5711(Static92.anInt1755 + local15);
			Static305.aClass1_Sub21_Sub2_3.method5751(local25);
			Static305.aClass1_Sub21_Sub2_3.method5741(Static112.aBooleanArray11[82] ? 1 : 0);
			Static305.aClass1_Sub21_Sub2_3.method5711(Static98.anInt1911 + local18);
			Static177.method3158(local15, local18);
		}
		if (local21 == 5) {
			Static305.aClass1_Sub21_Sub2_3.method5757(140);
			Static305.aClass1_Sub21_Sub2_3.method5702(local18);
			Static305.aClass1_Sub21_Sub2_3.method5711(Static178.anInt3758);
			Static305.aClass1_Sub21_Sub2_3.method5698(local25);
			Static305.aClass1_Sub21_Sub2_3.method5711(local15);
			Static305.aClass1_Sub21_Sub2_3.method5724(Static259.anInt5310);
			Static111.anInt2150 = 0;
			Static90.aClass163_6 = Static248.method22(local18);
			Static351.anInt4014 = local15;
		}
		@Pc(847) Class163 local847;
		if (local21 == 34) {
			Static312.method5355();
			local847 = Static248.method22(local18);
			Static151.anInt3083 = local15;
			Static254.anInt5233 = 1;
			Static223.anInt1490 = local18;
			Static74.anInt1551 = local25;
			Static340.method5639(local847);
			Static142.aString102 = "<col=ff9040>" + Static348.method5333(local25).aString95 + "<col=ffffff>";
			if (Static142.aString102 == null) {
				Static142.aString102 = "null";
			}
		} else if (local21 == 39) {
			local847 = Static46.method931(local15, local18);
			if (local847 != null) {
				Static312.method5355();
				@Pc(893) Class1_Sub11 local893 = Static40.method857(local847);
				Static347.method5795(local893.method1086(), local15, local847.anInt4974, local847.anInt4959, local18, local893.anInt1310);
				Static254.anInt5233 = 0;
				Static238.aString191 = Static107.method1708(local847);
				if (local847.aBoolean411) {
					Static49.aString203 = local847.aString189 + "<col=ffffff>";
				} else {
					Static49.aString203 = "<col=00ff00>" + local847.aString194 + "<col=ffffff>";
				}
				if (Static238.aString191 == null) {
					Static238.aString191 = "Null";
				}
			}
		} else {
			if (local21 == 59) {
				Static328.anInt486 = Static289.anInt5796;
				Static166.anInt3452 = 0;
				Static319.anInt3288 = 2;
				Static33.anInt646 = Static27.anInt4213;
				Static305.aClass1_Sub21_Sub2_3.method5757(10);
				Static305.aClass1_Sub21_Sub2_3.method5751(local15 + Static92.anInt1755);
				Static305.aClass1_Sub21_Sub2_3.method5698(local25);
				Static305.aClass1_Sub21_Sub2_3.method5734(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5698(local18 + Static98.anInt1911);
				Static177.method3158(local15, local18);
			}
			if (local21 == 47) {
				Static305.aClass1_Sub21_Sub2_3.method5757(218);
				Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				Static305.aClass1_Sub21_Sub2_3.method5696(local25);
				Static305.aClass1_Sub21_Sub2_3.method5696(local15);
				Static111.anInt2150 = 0;
				Static90.aClass163_6 = Static248.method22(local18);
				Static351.anInt4014 = local15;
			}
			if (local21 == 2) {
				Static305.aClass1_Sub21_Sub2_3.method5757(48);
				Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				Static305.aClass1_Sub21_Sub2_3.method5711(local15);
				Static305.aClass1_Sub21_Sub2_3.method5698(local25);
				Static111.anInt2150 = 0;
				Static90.aClass163_6 = Static248.method22(local18);
				Static351.anInt4014 = local15;
			}
			if (local21 == 28) {
				Static328.anInt486 = Static289.anInt5796;
				Static166.anInt3452 = 0;
				Static319.anInt3288 = 2;
				Static33.anInt646 = Static27.anInt4213;
				Static305.aClass1_Sub21_Sub2_3.method5757(150);
				Static305.aClass1_Sub21_Sub2_3.method5696(local15 + Static92.anInt1755);
				Static305.aClass1_Sub21_Sub2_3.method5696(local18 + Static98.anInt1911);
				Static305.aClass1_Sub21_Sub2_3.method5734(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5698(Integer.MAX_VALUE & (int) (local28 >>> 32));
				Static298.method5213(local18, local15, local28);
			}
			if (local21 == 7) {
				local381 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local25];
				if (local381 != null) {
					Static33.anInt646 = Static27.anInt4213;
					Static328.anInt486 = Static289.anInt5796;
					Static319.anInt3288 = 2;
					Static166.anInt3452 = 0;
					Static305.aClass1_Sub21_Sub2_3.method5757(49);
					Static305.aClass1_Sub21_Sub2_3.method5718(Static112.aBooleanArray11[82] ? 1 : 0);
					Static305.aClass1_Sub21_Sub2_3.method5711(local25);
					Static102.method1601(0, local381.anIntArray387[0], -2, local381.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local381.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local381.method3402());
				}
			}
			if (local21 == 16) {
				Static205.method3695(false);
			}
			@Pc(1251) int local1251;
			if (local21 == 58) {
				Static305.aClass1_Sub21_Sub2_3.method5757(47);
				Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				local847 = Static248.method22(local18);
				if (local847.anIntArrayArray39 != null && local847.anIntArrayArray39[0][0] == 5) {
					local1251 = local847.anIntArrayArray39[0][1];
					Static81.anIntArray119[local1251] = 1 - Static81.anIntArray119[local1251];
					Static131.method2205(local1251);
				}
			}
			if (local21 == 33) {
				Static33.anInt646 = Static27.anInt4213;
				Static328.anInt486 = Static289.anInt5796;
				Static166.anInt3452 = 0;
				Static319.anInt3288 = 2;
				Static305.aClass1_Sub21_Sub2_3.method5757(34);
				Static305.aClass1_Sub21_Sub2_3.method5698(Integer.MAX_VALUE & (int) (local28 >>> 32));
				Static305.aClass1_Sub21_Sub2_3.method5741(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5711(Static98.anInt1911 + local18);
				Static305.aClass1_Sub21_Sub2_3.method5711(local15 + Static92.anInt1755);
				Static298.method5213(local18, local15, local28);
			}
			if (local21 == 26) {
				local41 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local25];
				if (local41 != null) {
					Static166.anInt3452 = 0;
					Static328.anInt486 = Static289.anInt5796;
					Static319.anInt3288 = 2;
					Static33.anInt646 = Static27.anInt4213;
					Static305.aClass1_Sub21_Sub2_3.method5757(63);
					Static305.aClass1_Sub21_Sub2_3.method5698(local25);
					Static305.aClass1_Sub21_Sub2_3.method5734(Static112.aBooleanArray11[82] ? 1 : 0);
					Static102.method1601(0, local41.anIntArray387[0], -2, local41.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local41.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local41.method3402());
				}
			}
			if (local21 == 12) {
				Static166.anInt3452 = 0;
				Static33.anInt646 = Static27.anInt4213;
				Static328.anInt486 = Static289.anInt5796;
				Static319.anInt3288 = 2;
				Static305.aClass1_Sub21_Sub2_3.method5757(13);
				Static305.aClass1_Sub21_Sub2_3.method5698(Static92.anInt1755 + local15);
				Static305.aClass1_Sub21_Sub2_3.method5711(local25);
				Static305.aClass1_Sub21_Sub2_3.method5751(Static98.anInt1911 + local18);
				Static305.aClass1_Sub21_Sub2_3.method5734(Static112.aBooleanArray11[82] ? 1 : 0);
				Static177.method3158(local15, local18);
			}
			if (local21 == 10) {
				Static305.aClass1_Sub21_Sub2_3.method5757(160);
				Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				Static305.aClass1_Sub21_Sub2_3.method5698(local15);
				Static305.aClass1_Sub21_Sub2_3.method5698(local25);
				Static111.anInt2150 = 0;
				Static90.aClass163_6 = Static248.method22(local18);
				Static351.anInt4014 = local15;
			}
			if (local21 == 36 || local21 == 1003) {
				Static83.method1321(local15, local18, local25, arg0.aString52);
			}
			if (local21 == 19) {
				Static305.aClass1_Sub21_Sub2_3.method5757(71);
				Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				Static305.aClass1_Sub21_Sub2_3.method5696(local25);
				Static305.aClass1_Sub21_Sub2_3.method5751(local15);
				Static111.anInt2150 = 0;
				Static90.aClass163_6 = Static248.method22(local18);
				Static351.anInt4014 = local15;
			}
			if (local21 == 43) {
				local41 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local25];
				if (local41 != null) {
					Static319.anInt3288 = 2;
					Static166.anInt3452 = 0;
					Static33.anInt646 = Static27.anInt4213;
					Static328.anInt486 = Static289.anInt5796;
					Static305.aClass1_Sub21_Sub2_3.method5757(135);
					Static305.aClass1_Sub21_Sub2_3.method5724(Static259.anInt5310);
					Static305.aClass1_Sub21_Sub2_3.method5698(Static178.anInt3758);
					Static305.aClass1_Sub21_Sub2_3.method5751(local25);
					Static305.aClass1_Sub21_Sub2_3.method5734(Static112.aBooleanArray11[82] ? 1 : 0);
					Static102.method1601(0, local41.anIntArray387[0], -2, local41.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local41.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local41.method3402());
				}
			}
			if (local21 == 21) {
				local41 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local25];
				if (local41 != null) {
					Static319.anInt3288 = 2;
					Static328.anInt486 = Static289.anInt5796;
					Static166.anInt3452 = 0;
					Static33.anInt646 = Static27.anInt4213;
					Static305.aClass1_Sub21_Sub2_3.method5757(164);
					Static305.aClass1_Sub21_Sub2_3.method5751(local25);
					Static305.aClass1_Sub21_Sub2_3.method5718(Static112.aBooleanArray11[82] ? 1 : 0);
					Static102.method1601(0, local41.anIntArray387[0], -2, local41.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local41.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local41.method3402());
				}
			}
			if (local21 == 51) {
				Static305.aClass1_Sub21_Sub2_3.method5757(115);
				Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				Static305.aClass1_Sub21_Sub2_3.method5696(local15);
				Static305.aClass1_Sub21_Sub2_3.method5696(local25);
				Static111.anInt2150 = 0;
				Static90.aClass163_6 = Static248.method22(local18);
				Static351.anInt4014 = local15;
			}
			if (local21 == 22) {
				Static305.aClass1_Sub21_Sub2_3.method5757(35);
				Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				Static305.aClass1_Sub21_Sub2_3.method5710(Static223.anInt1490);
				Static305.aClass1_Sub21_Sub2_3.method5751(Static74.anInt1551);
				Static305.aClass1_Sub21_Sub2_3.method5696(local25);
				Static305.aClass1_Sub21_Sub2_3.method5696(Static151.anInt3083);
				Static305.aClass1_Sub21_Sub2_3.method5698(local15);
				Static111.anInt2150 = 0;
				Static90.aClass163_6 = Static248.method22(local18);
				Static351.anInt4014 = local15;
			}
			if (local21 == 1008) {
				Static33.anInt646 = Static27.anInt4213;
				Static328.anInt486 = Static289.anInt5796;
				Static319.anInt3288 = 2;
				Static166.anInt3452 = 0;
				Static305.aClass1_Sub21_Sub2_3.method5757(129);
				Static305.aClass1_Sub21_Sub2_3.method5698(local25);
			}
			if (local21 == 48) {
				Static328.anInt486 = Static289.anInt5796;
				Static33.anInt646 = Static27.anInt4213;
				Static166.anInt3452 = 0;
				Static319.anInt3288 = 2;
				Static305.aClass1_Sub21_Sub2_3.method5757(67);
				Static305.aClass1_Sub21_Sub2_3.method5696(Static98.anInt1911 + local18);
				Static305.aClass1_Sub21_Sub2_3.method5696(local25);
				Static305.aClass1_Sub21_Sub2_3.method5718(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5711(Static92.anInt1755 + local15);
				Static177.method3158(local15, local18);
			}
			if (local21 == 11) {
				if (Static305.anInt6104 > 0 && Static112.aBooleanArray11[82] && Static112.aBooleanArray11[81]) {
					Static180.method3194(Static92.anInt1755 + local15, Static98.anInt1911 - -local18, Static127.anInt2487);
				} else {
					Static328.anInt486 = Static289.anInt5796;
					Static166.anInt3452 = 0;
					Static33.anInt646 = Static27.anInt4213;
					Static319.anInt3288 = 1;
					Static305.aClass1_Sub21_Sub2_3.method5757(154);
					Static305.aClass1_Sub21_Sub2_3.method5711(local15 + Static92.anInt1755);
					Static305.aClass1_Sub21_Sub2_3.method5751(local18 + Static98.anInt1911);
				}
			}
			if (local21 == 6 && aClass163_5 == null) {
				Static115.method1832(local18, local15);
				aClass163_5 = Static46.method931(local15, local18);
				Static340.method5639(aClass163_5);
			}
			if (local21 == 38) {
				local381 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local25];
				if (local381 != null) {
					Static33.anInt646 = Static27.anInt4213;
					Static319.anInt3288 = 2;
					Static166.anInt3452 = 0;
					Static328.anInt486 = Static289.anInt5796;
					Static305.aClass1_Sub21_Sub2_3.method5757(167);
					Static305.aClass1_Sub21_Sub2_3.method5751(local25);
					Static305.aClass1_Sub21_Sub2_3.method5718(Static112.aBooleanArray11[82] ? 1 : 0);
					Static102.method1601(0, local381.anIntArray387[0], -2, local381.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local381.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local381.method3402());
				}
			}
			if (local21 == 9) {
				local381 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local25];
				if (local381 != null) {
					Static166.anInt3452 = 0;
					Static319.anInt3288 = 2;
					Static33.anInt646 = Static27.anInt4213;
					Static328.anInt486 = Static289.anInt5796;
					Static305.aClass1_Sub21_Sub2_3.method5757(53);
					Static305.aClass1_Sub21_Sub2_3.method5696(local25);
					Static305.aClass1_Sub21_Sub2_3.method5718(Static112.aBooleanArray11[82] ? 1 : 0);
					Static102.method1601(0, local381.anIntArray387[0], -2, local381.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local381.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local381.method3402());
				}
			}
			if (local21 == 8) {
				local381 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local25];
				if (local381 != null) {
					Static319.anInt3288 = 2;
					Static328.anInt486 = Static289.anInt5796;
					Static33.anInt646 = Static27.anInt4213;
					Static166.anInt3452 = 0;
					Static305.aClass1_Sub21_Sub2_3.method5757(61);
					Static305.aClass1_Sub21_Sub2_3.method5698(local25);
					Static305.aClass1_Sub21_Sub2_3.method5749(Static112.aBooleanArray11[82] ? 1 : 0);
					Static102.method1601(0, local381.anIntArray387[0], -2, local381.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local381.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local381.method3402());
				}
			}
			if (local21 == 1004) {
				local847 = Static248.method22(local18);
				if (local847 == null || local847.anIntArray460[local15] < 100000) {
					Static305.aClass1_Sub21_Sub2_3.method5757(205);
					Static305.aClass1_Sub21_Sub2_3.method5711(local25);
				} else {
					Static335.method5587(local847.anIntArray460[local15] + " x " + Static348.method5333(local25).aString95);
				}
				Static111.anInt2150 = 0;
				Static90.aClass163_6 = Static248.method22(local18);
				Static351.anInt4014 = local15;
			}
			if (local21 == 1007 || local21 == 1010 || local21 == 1002 || local21 == 1012 || local21 == 1001) {
				Static15.method254(local21, local15, local25);
			}
			if (local21 == 17) {
				local381 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local25];
				if (local381 != null) {
					Static33.anInt646 = Static27.anInt4213;
					Static328.anInt486 = Static289.anInt5796;
					Static319.anInt3288 = 2;
					Static166.anInt3452 = 0;
					Static305.aClass1_Sub21_Sub2_3.method5757(157);
					Static305.aClass1_Sub21_Sub2_3.method5696(local25);
					Static305.aClass1_Sub21_Sub2_3.method5702(Static223.anInt1490);
					Static305.aClass1_Sub21_Sub2_3.method5696(Static74.anInt1551);
					Static305.aClass1_Sub21_Sub2_3.method5751(Static151.anInt3083);
					Static305.aClass1_Sub21_Sub2_3.method5741(Static112.aBooleanArray11[82] ? 1 : 0);
					Static102.method1601(0, local381.anIntArray387[0], -2, local381.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local381.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local381.method3402());
				}
			}
			if (local21 == 41) {
				local381 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local25];
				if (local381 != null) {
					Static328.anInt486 = Static289.anInt5796;
					Static166.anInt3452 = 0;
					Static319.anInt3288 = 2;
					Static33.anInt646 = Static27.anInt4213;
					Static305.aClass1_Sub21_Sub2_3.method5757(172);
					Static305.aClass1_Sub21_Sub2_3.method5749(Static112.aBooleanArray11[82] ? 1 : 0);
					Static305.aClass1_Sub21_Sub2_3.method5711(local25);
					Static102.method1601(0, local381.anIntArray387[0], -2, local381.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local381.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local381.method3402());
				}
			}
			if (local21 == 18) {
				local847 = Static248.method22(local18);
				@Pc(2394) boolean local2394 = true;
				if (local847.anInt4926 > 0) {
					local2394 = Static173.method3109(local847);
				}
				if (local2394) {
					Static305.aClass1_Sub21_Sub2_3.method5757(47);
					Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				}
			}
			if (local21 == 15) {
				Static305.aClass1_Sub21_Sub2_3.method5757(217);
				Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				Static305.aClass1_Sub21_Sub2_3.method5711(local25);
				Static305.aClass1_Sub21_Sub2_3.method5751(local15);
				Static111.anInt2150 = 0;
				Static90.aClass163_6 = Static248.method22(local18);
				Static351.anInt4014 = local15;
			}
			if (local21 == 49) {
				Static319.anInt3288 = 2;
				Static33.anInt646 = Static27.anInt4213;
				Static166.anInt3452 = 0;
				Static328.anInt486 = Static289.anInt5796;
				Static305.aClass1_Sub21_Sub2_3.method5757(9);
				Static305.aClass1_Sub21_Sub2_3.method5751((int) (local28 >>> 32) & Integer.MAX_VALUE);
				Static305.aClass1_Sub21_Sub2_3.method5718(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5711(Static98.anInt1911 + local18);
				Static305.aClass1_Sub21_Sub2_3.method5698(local15 + Static92.anInt1755);
				Static298.method5213(local18, local15, local28);
			}
			if (local21 == 40) {
				Static166.anInt3452 = 0;
				Static328.anInt486 = Static289.anInt5796;
				Static319.anInt3288 = 2;
				Static33.anInt646 = Static27.anInt4213;
				Static305.aClass1_Sub21_Sub2_3.method5757(116);
				Static305.aClass1_Sub21_Sub2_3.method5696((int) (local28 >>> 32) & Integer.MAX_VALUE);
				Static305.aClass1_Sub21_Sub2_3.method5751(Static98.anInt1911 + local18);
				Static305.aClass1_Sub21_Sub2_3.method5724(Static259.anInt5310);
				Static305.aClass1_Sub21_Sub2_3.method5749(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5711(Static178.anInt3758);
				Static305.aClass1_Sub21_Sub2_3.method5698(local15 + Static92.anInt1755);
				Static298.method5213(local18, local15, local28);
			}
			if (local21 == 46) {
				Static305.aClass1_Sub21_Sub2_3.method5757(47);
				Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				local847 = Static248.method22(local18);
				if (local847.anIntArrayArray39 != null && local847.anIntArrayArray39[0][0] == 5) {
					local1251 = local847.anIntArrayArray39[0][1];
					if (Static81.anIntArray119[local1251] != local847.anIntArray458[0]) {
						Static81.anIntArray119[local1251] = local847.anIntArray458[0];
						Static131.method2205(local1251);
					}
				}
			}
			if (local21 == 57) {
				Static328.anInt486 = Static289.anInt5796;
				Static319.anInt3288 = 2;
				Static166.anInt3452 = 0;
				Static33.anInt646 = Static27.anInt4213;
				Static305.aClass1_Sub21_Sub2_3.method5757(159);
				Static305.aClass1_Sub21_Sub2_3.method5749(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5698(local25);
				Static305.aClass1_Sub21_Sub2_3.method5711(Static92.anInt1755 + local15);
				Static305.aClass1_Sub21_Sub2_3.method5711(local18 + Static98.anInt1911);
				Static177.method3158(local15, local18);
			}
			if (local21 == 37) {
				local381 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local25];
				if (local381 != null) {
					Static328.anInt486 = Static289.anInt5796;
					Static33.anInt646 = Static27.anInt4213;
					Static319.anInt3288 = 2;
					Static166.anInt3452 = 0;
					Static305.aClass1_Sub21_Sub2_3.method5757(196);
					Static305.aClass1_Sub21_Sub2_3.method5698(local25);
					Static305.aClass1_Sub21_Sub2_3.method5718(Static112.aBooleanArray11[82] ? 1 : 0);
					Static102.method1601(0, local381.anIntArray387[0], -2, local381.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local381.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local381.method3402());
				}
			}
			if (local21 == 45) {
				Static166.anInt3452 = 0;
				Static319.anInt3288 = 2;
				Static33.anInt646 = Static27.anInt4213;
				Static328.anInt486 = Static289.anInt5796;
				Static305.aClass1_Sub21_Sub2_3.method5757(107);
				Static305.aClass1_Sub21_Sub2_3.method5711(Static92.anInt1755 + local15);
				Static305.aClass1_Sub21_Sub2_3.method5751(local25);
				Static305.aClass1_Sub21_Sub2_3.method5751(Static178.anInt3758);
				Static305.aClass1_Sub21_Sub2_3.method5741(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5751(local18 + Static98.anInt1911);
				Static305.aClass1_Sub21_Sub2_3.method5710(Static259.anInt5310);
				Static177.method3158(local15, local18);
			}
			if (local21 == 20) {
				local41 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local25];
				if (local41 != null) {
					Static166.anInt3452 = 0;
					Static328.anInt486 = Static289.anInt5796;
					Static319.anInt3288 = 2;
					Static33.anInt646 = Static27.anInt4213;
					Static305.aClass1_Sub21_Sub2_3.method5757(77);
					Static305.aClass1_Sub21_Sub2_3.method5734(Static112.aBooleanArray11[82] ? 1 : 0);
					Static305.aClass1_Sub21_Sub2_3.method5711(local25);
					Static102.method1601(0, local41.anIntArray387[0], -2, local41.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local41.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local41.method3402());
				}
			}
			if (local21 == 13) {
				Static328.anInt486 = Static289.anInt5796;
				Static33.anInt646 = Static27.anInt4213;
				Static319.anInt3288 = 2;
				Static166.anInt3452 = 0;
				Static305.aClass1_Sub21_Sub2_3.method5757(158);
				Static305.aClass1_Sub21_Sub2_3.method5711(Static151.anInt3083);
				Static305.aClass1_Sub21_Sub2_3.method5698(local15 + Static92.anInt1755);
				Static305.aClass1_Sub21_Sub2_3.method5698(local18 + Static98.anInt1911);
				Static305.aClass1_Sub21_Sub2_3.method5696((int) (local28 >>> 32) & Integer.MAX_VALUE);
				Static305.aClass1_Sub21_Sub2_3.method5696(Static74.anInt1551);
				Static305.aClass1_Sub21_Sub2_3.method5738(Static223.anInt1490);
				Static305.aClass1_Sub21_Sub2_3.method5749(Static112.aBooleanArray11[82] ? 1 : 0);
				Static298.method5213(local18, local15, local28);
			}
			if (local21 == 1) {
				Static305.aClass1_Sub21_Sub2_3.method5757(59);
				Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				Static305.aClass1_Sub21_Sub2_3.method5711(local15);
				Static305.aClass1_Sub21_Sub2_3.method5698(local25);
				Static111.anInt2150 = 0;
				Static90.aClass163_6 = Static248.method22(local18);
				Static351.anInt4014 = local15;
			}
			if (local21 == 14) {
				Static33.anInt646 = Static27.anInt4213;
				Static319.anInt3288 = 2;
				Static166.anInt3452 = 0;
				Static328.anInt486 = Static289.anInt5796;
				Static305.aClass1_Sub21_Sub2_3.method5757(60);
				Static305.aClass1_Sub21_Sub2_3.method5698(local18 + Static98.anInt1911);
				Static305.aClass1_Sub21_Sub2_3.method5711(Static92.anInt1755 + local15);
				Static305.aClass1_Sub21_Sub2_3.method5718(Static112.aBooleanArray11[82] ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5751((int) (local28 >>> 32) & Integer.MAX_VALUE);
				Static298.method5213(local18, local15, local28);
			}
			if (local21 == 42) {
				local381 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local25];
				if (local381 != null) {
					Static33.anInt646 = Static27.anInt4213;
					Static328.anInt486 = Static289.anInt5796;
					Static319.anInt3288 = 2;
					Static166.anInt3452 = 0;
					Static305.aClass1_Sub21_Sub2_3.method5757(199);
					Static305.aClass1_Sub21_Sub2_3.method5696(Static178.anInt3758);
					Static305.aClass1_Sub21_Sub2_3.method5710(Static259.anInt5310);
					Static305.aClass1_Sub21_Sub2_3.method5734(Static112.aBooleanArray11[82] ? 1 : 0);
					Static305.aClass1_Sub21_Sub2_3.method5711(local25);
					Static102.method1601(0, local381.anIntArray387[0], -2, local381.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local381.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local381.method3402());
				}
			}
			if (local21 == 35) {
				local381 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local25];
				if (local381 != null) {
					Static33.anInt646 = Static27.anInt4213;
					Static328.anInt486 = Static289.anInt5796;
					Static166.anInt3452 = 0;
					Static319.anInt3288 = 2;
					Static305.aClass1_Sub21_Sub2_3.method5757(131);
					Static305.aClass1_Sub21_Sub2_3.method5749(Static112.aBooleanArray11[82] ? 1 : 0);
					Static305.aClass1_Sub21_Sub2_3.method5711(local25);
					Static102.method1601(0, local381.anIntArray387[0], -2, local381.anIntArray388[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local381.method3402(), true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local381.method3402());
				}
			}
			if (local21 == 25) {
				Static305.aClass1_Sub21_Sub2_3.method5757(238);
				Static305.aClass1_Sub21_Sub2_3.method5702(local18);
				Static305.aClass1_Sub21_Sub2_3.method5696(local25);
				Static305.aClass1_Sub21_Sub2_3.method5698(local15);
				Static111.anInt2150 = 0;
				Static90.aClass163_6 = Static248.method22(local18);
				Static351.anInt4014 = local15;
			}
			if (local21 == 1005) {
				Static319.anInt3288 = 2;
				Static33.anInt646 = Static27.anInt4213;
				Static166.anInt3452 = 0;
				Static328.anInt486 = Static289.anInt5796;
				Static305.aClass1_Sub21_Sub2_3.method5757(205);
				Static305.aClass1_Sub21_Sub2_3.method5711(local25);
			}
			if (Static254.anInt5233 != 0) {
				Static254.anInt5233 = 0;
				Static340.method5639(Static248.method22(Static223.anInt1490));
			}
			if (Static265.aBoolean456) {
				Static312.method5355();
			}
			if (Static90.aClass163_6 != null && Static111.anInt2150 == 0) {
				Static340.method5639(Static90.aClass163_6);
			}
		}
	}
}
