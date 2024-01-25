import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public static int anInt1706;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt1704 = 0;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString124 = "";

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method1365(@OriginalArg(0) Class7_Sub32 arg0) {
		if (arg0 == null || arg0 == Static76.aClass74_8.aClass7_72) {
			return;
		}
		@Pc(13) int local13 = arg0.anInt5226;
		@Pc(16) int local16 = arg0.anInt5225;
		@Pc(19) int local19 = arg0.anInt5229;
		@Pc(23) int local23 = (int) arg0.aLong169;
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		@Pc(30) long local30 = arg0.aLong169;
		@Pc(49) Class26 local49;
		@Pc(69) int local69;
		if (local19 == 25) {
			Static29.aClass7_Sub3_Sub2_1.method2799(167);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			local49 = Static245.method4231(local16);
			if (local49.anIntArrayArray6 != null && local49.anIntArrayArray6[0][0] == 5) {
				local69 = local49.anIntArrayArray6[0][1];
				if (local49.anIntArray58[0] != Static212.anIntArray579[local69]) {
					Static212.anIntArray579[local69] = local49.anIntArray58[0];
					Static75.method1501(local69);
				}
			}
		}
		@Pc(96) Class22_Sub2_Sub1_Sub2 local96;
		if (local19 == 35) {
			local96 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local23];
			if (local96 != null) {
				Static342.anInt6494 = 0;
				Static160.anInt3333 = Static169.anInt3518;
				Static275.anInt5445 = Static108.anInt1312;
				Static154.anInt3271 = 2;
				Static29.aClass7_Sub3_Sub2_1.method2799(166);
				Static29.aClass7_Sub3_Sub2_1.method2788(local23);
				Static29.aClass7_Sub3_Sub2_1.method2735(Static17.aBooleanArray24[82] ? 1 : 0);
				Static104.method2059(true, 0, local96.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local96.method4421(), -2, local96.method4421(), local96.anIntArray666[0]);
			}
		}
		if (local19 == 30) {
			Static313.method5075(false);
		}
		if (local19 == 18) {
			Static29.aClass7_Sub3_Sub2_1.method2799(233);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2745(local23);
			Static29.aClass7_Sub3_Sub2_1.method2745(local13);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 60 && Static165.aClass26_19 == null) {
			Static36.method829(local13, local16);
			Static165.aClass26_19 = Static23.method4815(local13, local16);
			Static245.method4226(Static165.aClass26_19);
		}
		if (local19 == 16) {
			Static29.aClass7_Sub3_Sub2_1.method2799(63);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2785(local13);
			Static29.aClass7_Sub3_Sub2_1.method2745(local23);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 29) {
			if (Static244.anInt4842 > 0 && Static17.aBooleanArray24[82] && Static17.aBooleanArray24[81]) {
				Static262.method4384(Static168.anInt3508, Static350.anInt6609 + local13, local16 + Static237.anInt4696);
			} else {
				Static342.anInt6494 = 0;
				Static160.anInt3333 = Static169.anInt3518;
				Static154.anInt3271 = 1;
				Static275.anInt5445 = Static108.anInt1312;
				Static29.aClass7_Sub3_Sub2_1.method2799(139);
				Static29.aClass7_Sub3_Sub2_1.method2780(local16 + Static237.anInt4696);
				Static29.aClass7_Sub3_Sub2_1.method2745(local13 + Static350.anInt6609);
			}
		}
		if (local19 == 23) {
			local96 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local23];
			if (local96 != null) {
				Static160.anInt3333 = Static169.anInt3518;
				Static154.anInt3271 = 2;
				Static275.anInt5445 = Static108.anInt1312;
				Static342.anInt6494 = 0;
				Static29.aClass7_Sub3_Sub2_1.method2799(130);
				Static29.aClass7_Sub3_Sub2_1.method2783(Static17.aBooleanArray24[82] ? 1 : 0);
				Static29.aClass7_Sub3_Sub2_1.method2745(local23);
				Static104.method2059(true, 0, local96.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local96.method4421(), -2, local96.method4421(), local96.anIntArray666[0]);
			}
		}
		if (local19 == 45) {
			Static154.anInt3271 = 2;
			Static275.anInt5445 = Static108.anInt1312;
			Static160.anInt3333 = Static169.anInt3518;
			Static342.anInt6494 = 0;
			Static29.aClass7_Sub3_Sub2_1.method2799(158);
			Static29.aClass7_Sub3_Sub2_1.method2785(local23);
			Static29.aClass7_Sub3_Sub2_1.method2788(Static237.anInt4696 + local16);
			Static29.aClass7_Sub3_Sub2_1.method2775(Static17.aBooleanArray24[82] ? 1 : 0);
			Static29.aClass7_Sub3_Sub2_1.method2745(local13 + Static350.anInt6609);
			Static207.method3675(local13, local16);
		}
		if (local19 == 36) {
			local49 = Static245.method4231(local16);
			@Pc(438) boolean local438 = true;
			if (local49.anInt557 > 0) {
				local438 = Static145.method2911(local49);
			}
			if (local438) {
				Static29.aClass7_Sub3_Sub2_1.method2799(167);
				Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			}
		}
		if (local19 == 15 || local19 == 1011) {
			Static319.method5152(arg0.aString330, local16, local13, local23);
		}
		@Pc(483) Class22_Sub2_Sub1_Sub1 local483;
		if (local19 == 57) {
			local483 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local23];
			if (local483 != null) {
				Static342.anInt6494 = 0;
				Static154.anInt3271 = 2;
				Static160.anInt3333 = Static169.anInt3518;
				Static275.anInt5445 = Static108.anInt1312;
				Static29.aClass7_Sub3_Sub2_1.method2799(26);
				Static29.aClass7_Sub3_Sub2_1.method2735(Static17.aBooleanArray24[82] ? 1 : 0);
				Static29.aClass7_Sub3_Sub2_1.method2788(local23);
				Static104.method2059(true, 0, local483.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local483.method4421(), -2, local483.method4421(), local483.anIntArray666[0]);
			}
		}
		if (local19 == 47) {
			Static160.anInt3333 = Static169.anInt3518;
			Static342.anInt6494 = 0;
			Static154.anInt3271 = 2;
			Static275.anInt5445 = Static108.anInt1312;
			Static29.aClass7_Sub3_Sub2_1.method2799(187);
			Static29.aClass7_Sub3_Sub2_1.method2783(Static17.aBooleanArray24[82] ? 1 : 0);
			Static29.aClass7_Sub3_Sub2_1.method2745(Static237.anInt4696 + local16);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static256.anInt4950);
			Static29.aClass7_Sub3_Sub2_1.method2780(local23);
			Static29.aClass7_Sub3_Sub2_1.method2741(Static269.anInt5313);
			Static29.aClass7_Sub3_Sub2_1.method2780(local13 + Static350.anInt6609);
			Static207.method3675(local13, local16);
		}
		if (local19 == 41) {
			local96 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local23];
			if (local96 != null) {
				Static154.anInt3271 = 2;
				Static342.anInt6494 = 0;
				Static275.anInt5445 = Static108.anInt1312;
				Static160.anInt3333 = Static169.anInt3518;
				Static29.aClass7_Sub3_Sub2_1.method2799(42);
				Static29.aClass7_Sub3_Sub2_1.method2745(local23);
				Static29.aClass7_Sub3_Sub2_1.method2747(Static17.aBooleanArray24[82] ? 1 : 0);
				Static104.method2059(true, 0, local96.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local96.method4421(), -2, local96.method4421(), local96.anIntArray666[0]);
			}
		}
		if (local19 == 6) {
			Static275.anInt5445 = Static108.anInt1312;
			Static342.anInt6494 = 0;
			Static160.anInt3333 = Static169.anInt3518;
			Static154.anInt3271 = 1;
			Static29.aClass7_Sub3_Sub2_1.method2799(82);
			Static29.aClass7_Sub3_Sub2_1.method2765(Static269.anInt5313);
			Static29.aClass7_Sub3_Sub2_1.method2780(local16 + Static237.anInt4696);
			Static29.aClass7_Sub3_Sub2_1.method2788(Static256.anInt4950);
			Static29.aClass7_Sub3_Sub2_1.method2745(local13 + Static350.anInt6609);
			Static104.method2059(true, 0, local16, 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], 1, -4, 1, local13);
		}
		if (local19 == 28) {
			Static275.anInt5445 = Static108.anInt1312;
			Static160.anInt3333 = Static169.anInt3518;
			Static154.anInt3271 = 2;
			Static342.anInt6494 = 0;
			Static29.aClass7_Sub3_Sub2_1.method2799(242);
			Static29.aClass7_Sub3_Sub2_1.method2745(Static143.anInt4073);
			Static29.aClass7_Sub3_Sub2_1.method2747(Static17.aBooleanArray24[82] ? 1 : 0);
			Static29.aClass7_Sub3_Sub2_1.method2741(Static150.anInt1962);
			Static29.aClass7_Sub3_Sub2_1.method2788((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static29.aClass7_Sub3_Sub2_1.method2785(Static341.anInt6489);
			Static29.aClass7_Sub3_Sub2_1.method2785(Static350.anInt6609 + local13);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static237.anInt4696 + local16);
			Static241.method4152(local16, local30, local13);
		}
		if (local19 == 4) {
			local483 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local23];
			if (local483 != null) {
				Static154.anInt3271 = 2;
				Static160.anInt3333 = Static169.anInt3518;
				Static342.anInt6494 = 0;
				Static275.anInt5445 = Static108.anInt1312;
				Static29.aClass7_Sub3_Sub2_1.method2799(177);
				Static29.aClass7_Sub3_Sub2_1.method2783(Static17.aBooleanArray24[82] ? 1 : 0);
				Static29.aClass7_Sub3_Sub2_1.method2785(local23);
				Static104.method2059(true, 0, local483.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local483.method4421(), -2, local483.method4421(), local483.anIntArray666[0]);
			}
		}
		if (local19 == 2) {
			Static342.anInt6494 = 0;
			Static275.anInt5445 = Static108.anInt1312;
			Static160.anInt3333 = Static169.anInt3518;
			Static154.anInt3271 = 2;
			Static29.aClass7_Sub3_Sub2_1.method2799(111);
			Static29.aClass7_Sub3_Sub2_1.method2745(Static350.anInt6609 + local13);
			Static29.aClass7_Sub3_Sub2_1.method2788((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static29.aClass7_Sub3_Sub2_1.method2783(Static17.aBooleanArray24[82] ? 1 : 0);
			Static29.aClass7_Sub3_Sub2_1.method2745(Static237.anInt4696 + local16);
			Static241.method4152(local16, local30, local13);
		}
		if (local19 == 42) {
			local49 = Static23.method4815(local13, local16);
			if (local49 != null) {
				Static249.method1112();
				@Pc(947) Class7_Sub27 local947 = Static45.method1034(local49);
				Static48.method4685(local49.anInt507, local947.method3765(), local13, local947.anInt4220, local49.anInt485, local16);
				Static127.anInt2799 = 0;
				Static85.aString150 = Static313.method5074(local49);
				if (Static85.aString150 == null) {
					Static85.aString150 = "Null";
				}
				if (!local49.aBoolean36) {
					Static277.aString348 = "<col=00ff00>" + local49.aString43 + "<col=ffffff>";
					return;
				}
				Static277.aString348 = local49.aString49 + "<col=ffffff>";
			}
			return;
		}
		if (local19 == 1006) {
			local49 = Static245.method4231(local16);
			if (local49 == null || local49.anIntArray69[local13] < 100000) {
				Static29.aClass7_Sub3_Sub2_1.method2799(60);
				Static29.aClass7_Sub3_Sub2_1.method2785(local23);
			} else {
				Static16.method2749(local49.anIntArray69[local13] + " x " + Static17.method4472(local23).aString261);
			}
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 1001 || local19 == 1012 || local19 == 1003 || local19 == 1007 || local19 == 1005) {
			Static126.method2607(local13, local19, local23);
		}
		if (local19 == 11) {
			local96 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local23];
			if (local96 != null) {
				Static160.anInt3333 = Static169.anInt3518;
				Static342.anInt6494 = 0;
				Static275.anInt5445 = Static108.anInt1312;
				Static154.anInt3271 = 2;
				Static29.aClass7_Sub3_Sub2_1.method2799(189);
				Static29.aClass7_Sub3_Sub2_1.method2745(Static341.anInt6489);
				Static29.aClass7_Sub3_Sub2_1.method2745(local23);
				Static29.aClass7_Sub3_Sub2_1.method2735(Static17.aBooleanArray24[82] ? 1 : 0);
				Static29.aClass7_Sub3_Sub2_1.method2765(Static150.anInt1962);
				Static29.aClass7_Sub3_Sub2_1.method2745(Static143.anInt4073);
				Static104.method2059(true, 0, local96.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local96.method4421(), -2, local96.method4421(), local96.anIntArray666[0]);
			}
		}
		if (local19 == 1008) {
			Static342.anInt6494 = 0;
			Static160.anInt3333 = Static169.anInt3518;
			Static275.anInt5445 = Static108.anInt1312;
			Static154.anInt3271 = 2;
			local96 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local23];
			if (local96 != null) {
				@Pc(1182) Class174 local1182 = local96.aClass174_1;
				if (local1182.anIntArray670 != null) {
					local1182 = local1182.method4438();
				}
				if (local1182 != null) {
					Static29.aClass7_Sub3_Sub2_1.method2799(91);
					Static29.aClass7_Sub3_Sub2_1.method2745(local1182.anInt5188);
				}
			}
		}
		if (local19 == 1004) {
			Static275.anInt5445 = Static108.anInt1312;
			Static154.anInt3271 = 2;
			Static342.anInt6494 = 0;
			Static160.anInt3333 = Static169.anInt3518;
			Static29.aClass7_Sub3_Sub2_1.method2799(60);
			Static29.aClass7_Sub3_Sub2_1.method2785(local23);
		}
		if (local19 == 44) {
			Static160.anInt3333 = Static169.anInt3518;
			Static342.anInt6494 = 0;
			Static275.anInt5445 = Static108.anInt1312;
			Static154.anInt3271 = 2;
			Static29.aClass7_Sub3_Sub2_1.method2799(159);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static350.anInt6609 + local13);
			Static29.aClass7_Sub3_Sub2_1.method2785(local16 + Static237.anInt4696);
			Static29.aClass7_Sub3_Sub2_1.method2745(local23);
			Static29.aClass7_Sub3_Sub2_1.method2775(Static17.aBooleanArray24[82] ? 1 : 0);
			Static207.method3675(local13, local16);
		}
		if (local19 == 1009) {
			Static275.anInt5445 = Static108.anInt1312;
			Static154.anInt3271 = 2;
			Static342.anInt6494 = 0;
			Static160.anInt3333 = Static169.anInt3518;
			Static29.aClass7_Sub3_Sub2_1.method2799(43);
			Static29.aClass7_Sub3_Sub2_1.method2785(local23);
		}
		if (local19 == 39) {
			Static29.aClass7_Sub3_Sub2_1.method2799(167);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			local49 = Static245.method4231(local16);
			if (local49.anIntArrayArray6 != null && local49.anIntArrayArray6[0][0] == 5) {
				local69 = local49.anIntArrayArray6[0][1];
				Static212.anIntArray579[local69] = 1 - Static212.anIntArray579[local69];
				Static75.method1501(local69);
			}
		}
		if (local19 == 26) {
			Static154.anInt3271 = 2;
			Static342.anInt6494 = 0;
			Static275.anInt5445 = Static108.anInt1312;
			Static160.anInt3333 = Static169.anInt3518;
			Static29.aClass7_Sub3_Sub2_1.method2799(206);
			Static29.aClass7_Sub3_Sub2_1.method2747(Static17.aBooleanArray24[82] ? 1 : 0);
			Static29.aClass7_Sub3_Sub2_1.method2785(local16 + Static237.anInt4696);
			Static29.aClass7_Sub3_Sub2_1.method2785(Static143.anInt4073);
			Static29.aClass7_Sub3_Sub2_1.method2780(local13 + Static350.anInt6609);
			Static29.aClass7_Sub3_Sub2_1.method2780(local23);
			Static29.aClass7_Sub3_Sub2_1.method2733(Static150.anInt1962);
			Static29.aClass7_Sub3_Sub2_1.method2785(Static341.anInt6489);
			Static207.method3675(local13, local16);
		}
		if (local19 == 21) {
			Static29.aClass7_Sub3_Sub2_1.method2799(227);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2788(local23);
			Static29.aClass7_Sub3_Sub2_1.method2788(local13);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 7) {
			local96 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local23];
			if (local96 != null) {
				Static160.anInt3333 = Static169.anInt3518;
				Static154.anInt3271 = 2;
				Static275.anInt5445 = Static108.anInt1312;
				Static342.anInt6494 = 0;
				Static29.aClass7_Sub3_Sub2_1.method2799(229);
				Static29.aClass7_Sub3_Sub2_1.method2745(local23);
				Static29.aClass7_Sub3_Sub2_1.method2747(Static17.aBooleanArray24[82] ? 1 : 0);
				Static104.method2059(true, 0, local96.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local96.method4421(), -2, local96.method4421(), local96.anIntArray666[0]);
			}
		}
		if (local19 == 1) {
			Static29.aClass7_Sub3_Sub2_1.method2799(132);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2788(local13);
			Static29.aClass7_Sub3_Sub2_1.method2785(local23);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 22) {
			local96 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local23];
			if (local96 != null) {
				Static154.anInt3271 = 2;
				Static342.anInt6494 = 0;
				Static160.anInt3333 = Static169.anInt3518;
				Static275.anInt5445 = Static108.anInt1312;
				Static29.aClass7_Sub3_Sub2_1.method2799(98);
				Static29.aClass7_Sub3_Sub2_1.method2745(local23);
				Static29.aClass7_Sub3_Sub2_1.method2783(Static17.aBooleanArray24[82] ? 1 : 0);
				Static104.method2059(true, 0, local96.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local96.method4421(), -2, local96.method4421(), local96.anIntArray666[0]);
			}
		}
		if (local19 == 20) {
			Static29.aClass7_Sub3_Sub2_1.method2799(54);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2780(local13);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static143.anInt4073);
			Static29.aClass7_Sub3_Sub2_1.method2780(local23);
			Static29.aClass7_Sub3_Sub2_1.method2733(Static150.anInt1962);
			Static29.aClass7_Sub3_Sub2_1.method2785(Static341.anInt6489);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 46) {
			Static160.anInt3333 = Static169.anInt3518;
			Static154.anInt3271 = 2;
			Static342.anInt6494 = 0;
			Static275.anInt5445 = Static108.anInt1312;
			Static29.aClass7_Sub3_Sub2_1.method2799(4);
			Static29.aClass7_Sub3_Sub2_1.method2780(local23);
			Static29.aClass7_Sub3_Sub2_1.method2775(Static17.aBooleanArray24[82] ? 1 : 0);
			Static29.aClass7_Sub3_Sub2_1.method2785(local13 + Static350.anInt6609);
			Static29.aClass7_Sub3_Sub2_1.method2788(Static237.anInt4696 + local16);
			Static207.method3675(local13, local16);
		}
		if (local19 == 24) {
			Static154.anInt3271 = 2;
			Static160.anInt3333 = Static169.anInt3518;
			Static342.anInt6494 = 0;
			Static275.anInt5445 = Static108.anInt1312;
			Static29.aClass7_Sub3_Sub2_1.method2799(136);
			Static29.aClass7_Sub3_Sub2_1.method2745(local23);
			Static29.aClass7_Sub3_Sub2_1.method2747(Static17.aBooleanArray24[82] ? 1 : 0);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static350.anInt6609 + local13);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static237.anInt4696 + local16);
			Static207.method3675(local13, local16);
		}
		if (local19 == 5) {
			Static29.aClass7_Sub3_Sub2_1.method2799(116);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2785(local13);
			Static29.aClass7_Sub3_Sub2_1.method2788(local23);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 37) {
			local483 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local23];
			if (local483 != null) {
				Static342.anInt6494 = 0;
				Static160.anInt3333 = Static169.anInt3518;
				Static154.anInt3271 = 2;
				Static275.anInt5445 = Static108.anInt1312;
				Static29.aClass7_Sub3_Sub2_1.method2799(237);
				Static29.aClass7_Sub3_Sub2_1.method2775(Static17.aBooleanArray24[82] ? 1 : 0);
				Static29.aClass7_Sub3_Sub2_1.method2745(local23);
				Static104.method2059(true, 0, local483.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local483.method4421(), -2, local483.method4421(), local483.anIntArray666[0]);
			}
		}
		if (local19 == 17) {
			local483 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local23];
			if (local483 != null) {
				Static342.anInt6494 = 0;
				Static275.anInt5445 = Static108.anInt1312;
				Static160.anInt3333 = Static169.anInt3518;
				Static154.anInt3271 = 2;
				Static29.aClass7_Sub3_Sub2_1.method2799(249);
				Static29.aClass7_Sub3_Sub2_1.method2775(Static17.aBooleanArray24[82] ? 1 : 0);
				Static29.aClass7_Sub3_Sub2_1.method2745(local23);
				Static104.method2059(true, 0, local483.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local483.method4421(), -2, local483.method4421(), local483.anIntArray666[0]);
			}
		}
		if (local19 == 1010) {
			Static342.anInt6494 = 0;
			Static160.anInt3333 = Static169.anInt3518;
			Static275.anInt5445 = Static108.anInt1312;
			Static154.anInt3271 = 2;
			Static29.aClass7_Sub3_Sub2_1.method2799(36);
			Static29.aClass7_Sub3_Sub2_1.method2745((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static29.aClass7_Sub3_Sub2_1.method2785(Static350.anInt6609 + local13);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static237.anInt4696 + local16);
			Static29.aClass7_Sub3_Sub2_1.method2747(Static17.aBooleanArray24[82] ? 1 : 0);
			Static241.method4152(local16, local30, local13);
		}
		if (local19 == 34) {
			Static29.aClass7_Sub3_Sub2_1.method2799(51);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2745(local23);
			Static29.aClass7_Sub3_Sub2_1.method2785(local13);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 59) {
			Static342.anInt6494 = 0;
			Static275.anInt5445 = Static108.anInt1312;
			Static160.anInt3333 = Static169.anInt3518;
			Static154.anInt3271 = 2;
			Static29.aClass7_Sub3_Sub2_1.method2799(209);
			Static29.aClass7_Sub3_Sub2_1.method2788((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static29.aClass7_Sub3_Sub2_1.method2783(Static17.aBooleanArray24[82] ? 1 : 0);
			Static29.aClass7_Sub3_Sub2_1.method2785(local13 + Static350.anInt6609);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static256.anInt4950);
			Static29.aClass7_Sub3_Sub2_1.method2741(Static269.anInt5313);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static237.anInt4696 + local16);
			Static241.method4152(local16, local30, local13);
		}
		if (local19 == 51) {
			if (Static244.anInt4842 > 0 && Static17.aBooleanArray24[82] && Static17.aBooleanArray24[81]) {
				Static262.method4384(Static168.anInt3508, local13 + Static350.anInt6609, local16 + Static237.anInt4696);
			} else {
				Static145.method2915(local23, local13, local16);
				if (local23 == 1) {
					Static29.aClass7_Sub3_Sub2_1.method2735(-1);
					Static29.aClass7_Sub3_Sub2_1.method2735(-1);
					Static29.aClass7_Sub3_Sub2_1.method2788((int) Static351.aFloat80);
					Static29.aClass7_Sub3_Sub2_1.method2735(57);
					Static29.aClass7_Sub3_Sub2_1.method2735(Static218.anInt4347);
					Static29.aClass7_Sub3_Sub2_1.method2735(Static49.anInt1359);
					Static29.aClass7_Sub3_Sub2_1.method2735(89);
					Static29.aClass7_Sub3_Sub2_1.method2788(Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973);
					Static29.aClass7_Sub3_Sub2_1.method2788(Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967);
					Static29.aClass7_Sub3_Sub2_1.method2735(63);
				} else {
					Static342.anInt6494 = 0;
					Static275.anInt5445 = Static108.anInt1312;
					Static160.anInt3333 = Static169.anInt3518;
					Static154.anInt3271 = 1;
				}
				Static104.method2059(true, 0, local16, 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], 1, -4, 1, local13);
			}
		}
		if (local19 == 48) {
			local483 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local23];
			if (local483 != null) {
				Static275.anInt5445 = Static108.anInt1312;
				Static342.anInt6494 = 0;
				Static160.anInt3333 = Static169.anInt3518;
				Static154.anInt3271 = 2;
				Static29.aClass7_Sub3_Sub2_1.method2799(8);
				Static29.aClass7_Sub3_Sub2_1.method2745(Static256.anInt4950);
				Static29.aClass7_Sub3_Sub2_1.method2746(Static269.anInt5313);
				Static29.aClass7_Sub3_Sub2_1.method2745(local23);
				Static29.aClass7_Sub3_Sub2_1.method2747(Static17.aBooleanArray24[82] ? 1 : 0);
				Static104.method2059(true, 0, local483.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local483.method4421(), -2, local483.method4421(), local483.anIntArray666[0]);
			}
		}
		if (local19 == 50) {
			Static29.aClass7_Sub3_Sub2_1.method2799(113);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2745(Static256.anInt4950);
			Static29.aClass7_Sub3_Sub2_1.method2785(local13);
			Static29.aClass7_Sub3_Sub2_1.method2765(Static269.anInt5313);
		}
		if (local19 == 43) {
			local483 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local23];
			if (local483 != null) {
				Static154.anInt3271 = 2;
				Static342.anInt6494 = 0;
				Static160.anInt3333 = Static169.anInt3518;
				Static275.anInt5445 = Static108.anInt1312;
				Static29.aClass7_Sub3_Sub2_1.method2799(198);
				Static29.aClass7_Sub3_Sub2_1.method2775(Static17.aBooleanArray24[82] ? 1 : 0);
				Static29.aClass7_Sub3_Sub2_1.method2745(local23);
				Static104.method2059(true, 0, local483.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local483.method4421(), -2, local483.method4421(), local483.anIntArray666[0]);
			}
		}
		if (local19 == 49) {
			Static29.aClass7_Sub3_Sub2_1.method2799(244);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2785(local13);
			Static29.aClass7_Sub3_Sub2_1.method2788(local23);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 12) {
			local483 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local23];
			if (local483 != null) {
				Static275.anInt5445 = Static108.anInt1312;
				Static154.anInt3271 = 2;
				Static342.anInt6494 = 0;
				Static160.anInt3333 = Static169.anInt3518;
				Static29.aClass7_Sub3_Sub2_1.method2799(184);
				Static29.aClass7_Sub3_Sub2_1.method2785(local23);
				Static29.aClass7_Sub3_Sub2_1.method2783(Static17.aBooleanArray24[82] ? 1 : 0);
				Static104.method2059(true, 0, local483.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local483.method4421(), -2, local483.method4421(), local483.anIntArray666[0]);
			}
		}
		if (local19 == 40) {
			Static29.aClass7_Sub3_Sub2_1.method2799(192);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2785(local23);
			Static29.aClass7_Sub3_Sub2_1.method2788(local13);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 13) {
			Static29.aClass7_Sub3_Sub2_1.method2799(0);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2780(local23);
			Static29.aClass7_Sub3_Sub2_1.method2745(local13);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 32) {
			local96 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local23];
			if (local96 != null) {
				Static154.anInt3271 = 2;
				Static160.anInt3333 = Static169.anInt3518;
				Static342.anInt6494 = 0;
				Static275.anInt5445 = Static108.anInt1312;
				Static29.aClass7_Sub3_Sub2_1.method2799(122);
				Static29.aClass7_Sub3_Sub2_1.method2747(Static17.aBooleanArray24[82] ? 1 : 0);
				Static29.aClass7_Sub3_Sub2_1.method2780(local23);
				Static29.aClass7_Sub3_Sub2_1.method2785(Static256.anInt4950);
				Static29.aClass7_Sub3_Sub2_1.method2746(Static269.anInt5313);
				Static104.method2059(true, 0, local96.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local96.method4421(), -2, local96.method4421(), local96.anIntArray666[0]);
			}
		}
		if (local19 == 58) {
			Static29.aClass7_Sub3_Sub2_1.method2799(255);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2745(local13);
			Static29.aClass7_Sub3_Sub2_1.method2788(Static256.anInt4950);
			Static29.aClass7_Sub3_Sub2_1.method2745(local23);
			Static29.aClass7_Sub3_Sub2_1.method2765(Static269.anInt5313);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 3) {
			local483 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local23];
			if (local483 != null) {
				Static342.anInt6494 = 0;
				Static160.anInt3333 = Static169.anInt3518;
				Static275.anInt5445 = Static108.anInt1312;
				Static154.anInt3271 = 2;
				Static29.aClass7_Sub3_Sub2_1.method2799(190);
				Static29.aClass7_Sub3_Sub2_1.method2745(Static143.anInt4073);
				Static29.aClass7_Sub3_Sub2_1.method2775(Static17.aBooleanArray24[82] ? 1 : 0);
				Static29.aClass7_Sub3_Sub2_1.method2785(Static341.anInt6489);
				Static29.aClass7_Sub3_Sub2_1.method2746(Static150.anInt1962);
				Static29.aClass7_Sub3_Sub2_1.method2780(local23);
				Static104.method2059(true, 0, local483.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local483.method4421(), -2, local483.method4421(), local483.anIntArray666[0]);
			}
		}
		if (local19 == 19) {
			Static154.anInt3271 = 2;
			Static342.anInt6494 = 0;
			Static160.anInt3333 = Static169.anInt3518;
			Static275.anInt5445 = Static108.anInt1312;
			Static29.aClass7_Sub3_Sub2_1.method2799(203);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static350.anInt6609 + local13);
			Static29.aClass7_Sub3_Sub2_1.method2780(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static29.aClass7_Sub3_Sub2_1.method2747(Static17.aBooleanArray24[82] ? 1 : 0);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static237.anInt4696 + local16);
			Static241.method4152(local16, local30, local13);
		}
		if (local19 == 33) {
			Static342.anInt6494 = 0;
			Static160.anInt3333 = Static169.anInt3518;
			Static275.anInt5445 = Static108.anInt1312;
			Static154.anInt3271 = 2;
			Static29.aClass7_Sub3_Sub2_1.method2799(109);
			Static29.aClass7_Sub3_Sub2_1.method2788(local16 + Static237.anInt4696);
			Static29.aClass7_Sub3_Sub2_1.method2788(Static350.anInt6609 + local13);
			Static29.aClass7_Sub3_Sub2_1.method2785(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static29.aClass7_Sub3_Sub2_1.method2747(Static17.aBooleanArray24[82] ? 1 : 0);
			Static241.method4152(local16, local30, local13);
		}
		if (local19 == 14) {
			local483 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local23];
			if (local483 != null) {
				Static154.anInt3271 = 2;
				Static160.anInt3333 = Static169.anInt3518;
				Static342.anInt6494 = 0;
				Static275.anInt5445 = Static108.anInt1312;
				Static29.aClass7_Sub3_Sub2_1.method2799(161);
				Static29.aClass7_Sub3_Sub2_1.method2788(local23);
				Static29.aClass7_Sub3_Sub2_1.method2747(Static17.aBooleanArray24[82] ? 1 : 0);
				Static104.method2059(true, 0, local483.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local483.method4421(), -2, local483.method4421(), local483.anIntArray666[0]);
			}
		}
		if (local19 == 31) {
			Static249.method1112();
			local49 = Static245.method4231(local16);
			Static127.anInt2799 = 1;
			Static143.anInt4073 = local23;
			Static341.anInt6489 = local13;
			Static150.anInt1962 = local16;
			Static245.method4226(local49);
			Static205.aString266 = "<col=ff9040>" + Static17.method4472(local23).aString261 + "<col=ffffff>";
			if (Static205.aString266 == null) {
				Static205.aString266 = "null";
			}
			return;
		}
		if (local19 == 10) {
			Static29.aClass7_Sub3_Sub2_1.method2799(46);
			Static29.aClass7_Sub3_Sub2_1.method2765(local16);
			Static29.aClass7_Sub3_Sub2_1.method2780(local13);
			Static29.aClass7_Sub3_Sub2_1.method2780(local23);
			Static271.anInt5363 = 0;
			Static41.aClass26_10 = Static245.method4231(local16);
			Static213.anInt4247 = local13;
		}
		if (local19 == 9) {
			local483 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local23];
			if (local483 != null) {
				Static154.anInt3271 = 2;
				Static275.anInt5445 = Static108.anInt1312;
				Static160.anInt3333 = Static169.anInt3518;
				Static342.anInt6494 = 0;
				Static29.aClass7_Sub3_Sub2_1.method2799(149);
				Static29.aClass7_Sub3_Sub2_1.method2780(local23);
				Static29.aClass7_Sub3_Sub2_1.method2783(Static17.aBooleanArray24[82] ? 1 : 0);
				Static104.method2059(true, 0, local483.anIntArray665[0], 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local483.method4421(), -2, local483.method4421(), local483.anIntArray666[0]);
			}
		}
		if (local19 == 8) {
			Static275.anInt5445 = Static108.anInt1312;
			Static154.anInt3271 = 2;
			Static342.anInt6494 = 0;
			Static160.anInt3333 = Static169.anInt3518;
			Static29.aClass7_Sub3_Sub2_1.method2799(153);
			Static29.aClass7_Sub3_Sub2_1.method2788(local16 + Static237.anInt4696);
			Static29.aClass7_Sub3_Sub2_1.method2780(Static350.anInt6609 + local13);
			Static29.aClass7_Sub3_Sub2_1.method2783(Static17.aBooleanArray24[82] ? 1 : 0);
			Static29.aClass7_Sub3_Sub2_1.method2780(local23);
			Static207.method3675(local13, local16);
		}
		if (local19 == 38) {
			Static342.anInt6494 = 0;
			Static275.anInt5445 = Static108.anInt1312;
			Static160.anInt3333 = Static169.anInt3518;
			Static154.anInt3271 = 2;
			Static29.aClass7_Sub3_Sub2_1.method2799(230);
			Static29.aClass7_Sub3_Sub2_1.method2785(local13 + Static350.anInt6609);
			Static29.aClass7_Sub3_Sub2_1.method2785((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static29.aClass7_Sub3_Sub2_1.method2780(local16 + Static237.anInt4696);
			Static29.aClass7_Sub3_Sub2_1.method2783(Static17.aBooleanArray24[82] ? 1 : 0);
			Static241.method4152(local16, local30, local13);
		}
		if (Static127.anInt2799 != 0) {
			Static127.anInt2799 = 0;
			Static245.method4226(Static245.method4231(Static150.anInt1962));
		}
		if (Static253.aBoolean361) {
			Static249.method1112();
		}
		if (Static41.aClass26_10 != null && Static271.anInt5363 == 0) {
			Static245.method4226(Static41.aClass26_10);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static285.anIntArrayArrayArray14[arg0][local16][local20] == -Static175.anInt3624) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static331.aClass8Array5[arg0].method4173(arg1, arg3) + arg5;
			if (!Static245.method4225(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static245.method4225(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static245.method4225(local20, local151, local177)) {
				return false;
			} else if (Static245.method4225(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static63.method4607(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static245.method4225(local16 + 1, Static331.aClass8Array5[arg0].method4173(arg1, arg3) + arg5, local20 + 1) && Static245.method4225(local16 + 128 - 1, Static331.aClass8Array5[arg0].method4173(arg1 + 1, arg3) + arg5, local20 + 1) && Static245.method4225(local16 + 128 - 1, Static331.aClass8Array5[arg0].method4173(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static245.method4225(local16 + 1, Static331.aClass8Array5[arg0].method4173(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method1368() {
		@Pc(5) String local5 = "www";
		if (Static151.anInt3239 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(16) String local16 = "";
		if (Static249.aString99 != null) {
			local16 = "/p=" + Static249.aString99;
		}
		return Static345.anInt6530 == 1 ? "http://" + local5 + ".stellardawn.com/l=" + Static177.anInt3637 + "/a=" + Static37.anInt1055 + local16 + "/" : "http://" + local5 + ".runescape.com/l=" + Static177.anInt3637 + "/a=" + Static37.anInt1055 + local16 + "/";
	}
}
