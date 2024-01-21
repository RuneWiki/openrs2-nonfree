import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public static int anInt1197 = 0;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	public static int anInt1198 = -1;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_567 = Static193.method3027("headicons_prayer");

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "B")
	public static byte aByte8 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)I")
	public static int method882(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local28) {
			local30 = local28;
		}
		if (local19 < local30) {
			local30 = local19;
		}
		@Pc(44) double local44 = local12;
		@Pc(46) double local46 = 0.0D;
		if (local28 > local12) {
			local44 = local28;
		}
		if (local44 < local19) {
			local44 = local19;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(71) double local71 = (local30 + local44) / 2.0D;
		if (local44 != local30) {
			if (local71 < 0.5D) {
				local60 = (local44 - local30) / (local30 + local44);
			}
			if (local71 >= 0.5D) {
				local60 = (local44 - local30) / (2.0D - local44 - local30);
			}
			if (local12 == local44) {
				local46 = (local28 - local19) / (-local30 + local44);
			} else if (local44 == local28) {
				local46 = (local19 - local12) / (-local30 + local44) + 2.0D;
			} else if (local44 == local19) {
				local46 = (local12 - local28) / (local44 - local30) + 4.0D;
			}
		}
		local46 /= 6.0D;
		@Pc(158) int local158 = (int) (local46 * 256.0D);
		@Pc(163) int local163 = (int) (local60 * 256.0D);
		if (local163 < 0) {
			local163 = 0;
		} else if (local163 > 255) {
			local163 = 255;
		}
		@Pc(180) int local180 = (int) (local71 * 256.0D);
		if (local180 < 0) {
			local180 = 0;
		} else if (local180 > 255) {
			local180 = 255;
		}
		if (local180 > 243) {
			local163 >>= 0x4;
		} else if (local180 > 217) {
			local163 >>= 0x3;
		} else if (local180 > 192) {
			local163 >>= 0x2;
		} else if (local180 > 179) {
			local163 >>= 0x1;
		}
		return (local180 >> 1) + (local163 >> 5 << 7) + (local158 >> 2 << 10);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!cg;I[B)V")
	public static void method884(@OriginalArg(1) Class18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class3_Sub17 local7 = new Class3_Sub17();
		local7.aClass18_2 = arg0;
		local7.anInt2109 = 0;
		local7.aByteArray17 = arg2;
		local7.aLong147 = arg1;
		@Pc(26) Class10 local26 = Static155.aClass10_87;
		synchronized (Static155.aClass10_87) {
			Static155.aClass10_87.method261(local7);
		}
		Static71.method1031();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)V")
	public static void method887(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static155.anIntArray233[arg0];
		@Pc(14) int local14 = Static175.anIntArray293[arg0];
		@Pc(18) long local18 = Static95.aLongArray3[arg0];
		@Pc(22) int local22 = Static55.aShortArray13[arg0];
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		@Pc(33) int local33 = (int) Static95.aLongArray3[arg0];
		@Pc(40) Class26_Sub2_Sub1 local40;
		if (local22 == 28) {
			local40 = Static146.aClass26_Sub2_Sub1Array1[local33];
			if (local40 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local40.anIntArray185[0], local40.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static191.anInt3883 = 0;
				Static27.anInt572 = Static124.anInt3874;
				Static108.anInt2201 = 2;
				Static31.anInt714 = Static96.anInt2006;
				Static93.aClass3_Sub4_Sub1_18.method1298(213);
				Static93.aClass3_Sub4_Sub1_18.method1252(local33);
			}
		}
		if (local22 == 44) {
			Static93.aClass3_Sub4_Sub1_18.method1298(105);
			Static93.aClass3_Sub4_Sub1_18.method1293(local14);
			Static93.aClass3_Sub4_Sub1_18.method1289(Static113.anInt2287);
			Static93.aClass3_Sub4_Sub1_18.method1289(local10);
			Static93.aClass3_Sub4_Sub1_18.method1264(local33);
			Static93.aClass3_Sub4_Sub1_18.method1283(Static6.anInt118);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 9) {
			local40 = Static146.aClass26_Sub2_Sub1Array1[local33];
			if (local40 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local40.anIntArray185[0], local40.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static108.anInt2201 = 2;
				Static191.anInt3883 = 0;
				Static31.anInt714 = Static96.anInt2006;
				Static27.anInt572 = Static124.anInt3874;
				Static93.aClass3_Sub4_Sub1_18.method1298(167);
				Static93.aClass3_Sub4_Sub1_18.method1273(local33);
			}
		}
		@Pc(197) Class26_Sub2_Sub2 local197;
		if (local22 == 32) {
			local197 = Static8.aClass26_Sub2_Sub2Array1[local33];
			if (local197 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local197.anIntArray185[0], local197.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static108.anInt2201 = 2;
				Static191.anInt3883 = 0;
				Static27.anInt572 = Static124.anInt3874;
				Static31.anInt714 = Static96.anInt2006;
				Static93.aClass3_Sub4_Sub1_18.method1298(111);
				Static93.aClass3_Sub4_Sub1_18.method1273(local33);
			}
		}
		if (local22 == 24) {
			local197 = Static8.aClass26_Sub2_Sub2Array1[local33];
			if (local197 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local197.anIntArray185[0], local197.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static191.anInt3883 = 0;
				Static31.anInt714 = Static96.anInt2006;
				Static27.anInt572 = Static124.anInt3874;
				Static108.anInt2201 = 2;
				Static93.aClass3_Sub4_Sub1_18.method1298(223);
				Static93.aClass3_Sub4_Sub1_18.method1264(local33);
			}
		}
		if (local22 == 26) {
			Static122.method1754(local18, local10, local14);
			Static93.aClass3_Sub4_Sub1_18.method1298(244);
			Static93.aClass3_Sub4_Sub1_18.method1252(local14 + Static55.anInt1184);
			Static93.aClass3_Sub4_Sub1_18.method1289(Static30.anInt695 + local10);
			Static93.aClass3_Sub4_Sub1_18.method1289((int) (local18 >>> 32) & Integer.MAX_VALUE);
		}
		if (local22 == 21 || local22 == 1007) {
			Static174.method2696(local33, local14, Static49.aClass70Array21[arg0], local10);
		}
		if (local22 == 29) {
			Static93.aClass3_Sub4_Sub1_18.method1298(186);
			Static93.aClass3_Sub4_Sub1_18.method1252(local10);
			Static93.aClass3_Sub4_Sub1_18.method1275(local14);
			Static93.aClass3_Sub4_Sub1_18.method1273(local33);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 20) {
			local40 = Static146.aClass26_Sub2_Sub1Array1[local33];
			if (local40 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local40.anIntArray185[0], local40.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static191.anInt3883 = 0;
				Static27.anInt572 = Static124.anInt3874;
				Static31.anInt714 = Static96.anInt2006;
				Static108.anInt2201 = 2;
				Static93.aClass3_Sub4_Sub1_18.method1298(76);
				Static93.aClass3_Sub4_Sub1_18.method1252(local33);
			}
		}
		if (local22 == 47 && Static72.aClass6_40 == null) {
			Static138.method1977(local14, local10);
			Static72.aClass6_40 = Static64.method982(local10, local14);
			Static9.method237(Static72.aClass6_40);
		}
		@Pc(508) int local508;
		@Pc(488) Class6 local488;
		if (local22 == 31) {
			Static93.aClass3_Sub4_Sub1_18.method1298(129);
			Static93.aClass3_Sub4_Sub1_18.method1285(local14);
			local488 = Static146.method2127(local14);
			if (local488.anIntArrayArray4 != null && local488.anIntArrayArray4[0][0] == 5) {
				local508 = local488.anIntArrayArray4[0][1];
				if (local488.anIntArray18[0] != Static16.anIntArray27[local508]) {
					Static16.anIntArray27[local508] = local488.anIntArray18[0];
					Static187.method2947(local508);
				}
			}
		}
		@Pc(551) boolean local551;
		if (local22 == 3) {
			local551 = Static103.method1467(false, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 0, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			if (!local551) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			}
			Static108.anInt2201 = 2;
			Static191.anInt3883 = 0;
			Static27.anInt572 = Static124.anInt3874;
			Static31.anInt714 = Static96.anInt2006;
			Static93.aClass3_Sub4_Sub1_18.method1298(170);
			Static93.aClass3_Sub4_Sub1_18.method1289(Static60.anInt3272);
			Static93.aClass3_Sub4_Sub1_18.method1275(Static55.anInt1195);
			Static93.aClass3_Sub4_Sub1_18.method1273(Static55.anInt1184 + local14);
			Static93.aClass3_Sub4_Sub1_18.method1273(Static30.anInt695 + local10);
			Static93.aClass3_Sub4_Sub1_18.method1252(Static179.anInt1325);
			Static93.aClass3_Sub4_Sub1_18.method1252(local33);
		}
		if (local22 == 1002) {
			Static122.method1754(local18, local10, local14);
			Static93.aClass3_Sub4_Sub1_18.method1298(7);
			Static93.aClass3_Sub4_Sub1_18.method1252(Static30.anInt695 + local10);
			Static93.aClass3_Sub4_Sub1_18.method1289((int) (local18 >>> 32) & Integer.MAX_VALUE);
			Static93.aClass3_Sub4_Sub1_18.method1273(Static55.anInt1184 + local14);
		}
		if (local22 == 49) {
			Static93.aClass3_Sub4_Sub1_18.method1298(171);
			Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			Static93.aClass3_Sub4_Sub1_18.method1275(local14);
			Static93.aClass3_Sub4_Sub1_18.method1273(local10);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 23) {
			local551 = Static103.method1467(false, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 0, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			if (!local551) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			}
			Static191.anInt3883 = 0;
			Static31.anInt714 = Static96.anInt2006;
			Static27.anInt572 = Static124.anInt3874;
			Static108.anInt2201 = 2;
			Static93.aClass3_Sub4_Sub1_18.method1298(97);
			Static93.aClass3_Sub4_Sub1_18.method1252(Static55.anInt1184 + local14);
			Static93.aClass3_Sub4_Sub1_18.method1252(Static30.anInt695 + local10);
			Static93.aClass3_Sub4_Sub1_18.method1252(local33);
		}
		if (local22 == 1001) {
			local488 = Static146.method2127(local14);
			if (local488 == null || local488.anIntArray9[local10] < 100000) {
				Static93.aClass3_Sub4_Sub1_18.method1298(122);
				Static93.aClass3_Sub4_Sub1_18.method1273(local33);
			} else {
				Static135.method1934(Static207.method3296(new Class70[] { Static107.method2404(local488.anIntArray9[local10]), Static123.aClass70_1182, Static14.method275(local33).aClass70_579 }), 0, Static61.aClass70_596);
			}
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 41) {
			local197 = Static8.aClass26_Sub2_Sub2Array1[local33];
			if (local197 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local197.anIntArray185[0], local197.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static31.anInt714 = Static96.anInt2006;
				Static191.anInt3883 = 0;
				Static27.anInt572 = Static124.anInt3874;
				Static108.anInt2201 = 2;
				Static93.aClass3_Sub4_Sub1_18.method1298(39);
				Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			}
		}
		if (local22 == 36) {
			local488 = Static146.method2127(local14);
			@Pc(908) boolean local908 = true;
			if (local488.anInt274 > 0) {
				local908 = Static65.method990(local488);
			}
			if (local908) {
				Static93.aClass3_Sub4_Sub1_18.method1298(129);
				Static93.aClass3_Sub4_Sub1_18.method1285(local14);
			}
		}
		if (local22 == 38) {
			local551 = Static103.method1467(false, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 0, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			if (!local551) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			}
			Static191.anInt3883 = 0;
			Static31.anInt714 = Static96.anInt2006;
			Static108.anInt2201 = 2;
			Static27.anInt572 = Static124.anInt3874;
			Static93.aClass3_Sub4_Sub1_18.method1298(156);
			Static93.aClass3_Sub4_Sub1_18.method1264(local33);
			Static93.aClass3_Sub4_Sub1_18.method1252(Static55.anInt1184 + local14);
			Static93.aClass3_Sub4_Sub1_18.method1289(Static30.anInt695 + local10);
		}
		if (local22 == 30) {
			local40 = Static146.aClass26_Sub2_Sub1Array1[local33];
			if (local40 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local40.anIntArray185[0], local40.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static27.anInt572 = Static124.anInt3874;
				Static31.anInt714 = Static96.anInt2006;
				Static191.anInt3883 = 0;
				Static108.anInt2201 = 2;
				Static93.aClass3_Sub4_Sub1_18.method1298(180);
				Static93.aClass3_Sub4_Sub1_18.method1264(Static60.anInt3272);
				Static93.aClass3_Sub4_Sub1_18.method1273(local33);
				Static93.aClass3_Sub4_Sub1_18.method1252(Static179.anInt1325);
				Static93.aClass3_Sub4_Sub1_18.method1275(Static55.anInt1195);
			}
		}
		if (local22 == 34) {
			Static93.aClass3_Sub4_Sub1_18.method1298(64);
			Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			Static93.aClass3_Sub4_Sub1_18.method1252(local10);
			Static93.aClass3_Sub4_Sub1_18.method1283(local14);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 2) {
			Static93.aClass3_Sub4_Sub1_18.method1298(22);
			Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			Static93.aClass3_Sub4_Sub1_18.method1289(local10);
			Static93.aClass3_Sub4_Sub1_18.method1293(local14);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 39) {
			local40 = Static146.aClass26_Sub2_Sub1Array1[local33];
			if (local40 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local40.anIntArray185[0], local40.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static191.anInt3883 = 0;
				Static31.anInt714 = Static96.anInt2006;
				Static108.anInt2201 = 2;
				Static27.anInt572 = Static124.anInt3874;
				Static93.aClass3_Sub4_Sub1_18.method1298(242);
				Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			}
		}
		if (local22 == 8) {
			local40 = Static146.aClass26_Sub2_Sub1Array1[local33];
			if (local40 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local40.anIntArray185[0], local40.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static108.anInt2201 = 2;
				Static191.anInt3883 = 0;
				Static31.anInt714 = Static96.anInt2006;
				Static27.anInt572 = Static124.anInt3874;
				Static93.aClass3_Sub4_Sub1_18.method1298(173);
				Static93.aClass3_Sub4_Sub1_18.method1289(Static113.anInt2287);
				Static93.aClass3_Sub4_Sub1_18.method1293(Static6.anInt118);
				Static93.aClass3_Sub4_Sub1_18.method1264(local33);
			}
		}
		if (local22 == 1003) {
			Static27.anInt572 = Static124.anInt3874;
			Static191.anInt3883 = 0;
			Static31.anInt714 = Static96.anInt2006;
			Static108.anInt2201 = 2;
			Static93.aClass3_Sub4_Sub1_18.method1298(122);
			Static93.aClass3_Sub4_Sub1_18.method1273(local33);
		}
		if (local22 == 51) {
			local197 = Static8.aClass26_Sub2_Sub2Array1[local33];
			if (local197 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local197.anIntArray185[0], local197.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static27.anInt572 = Static124.anInt3874;
				Static108.anInt2201 = 2;
				Static191.anInt3883 = 0;
				Static31.anInt714 = Static96.anInt2006;
				Static93.aClass3_Sub4_Sub1_18.method1298(200);
				Static93.aClass3_Sub4_Sub1_18.method1264(local33);
				Static93.aClass3_Sub4_Sub1_18.method1289(Static113.anInt2287);
				Static93.aClass3_Sub4_Sub1_18.method1285(Static6.anInt118);
			}
		}
		if (local22 == 6) {
			local551 = Static103.method1467(false, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 0, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			if (!local551) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			}
			Static191.anInt3883 = 0;
			Static27.anInt572 = Static124.anInt3874;
			Static31.anInt714 = Static96.anInt2006;
			Static108.anInt2201 = 2;
			Static93.aClass3_Sub4_Sub1_18.method1298(94);
			Static93.aClass3_Sub4_Sub1_18.method1289(Static55.anInt1184 + local14);
			Static93.aClass3_Sub4_Sub1_18.method1273(Static30.anInt695 + local10);
			Static93.aClass3_Sub4_Sub1_18.method1273(local33);
		}
		if (local22 == 11) {
			local40 = Static146.aClass26_Sub2_Sub1Array1[local33];
			if (local40 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local40.anIntArray185[0], local40.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static191.anInt3883 = 0;
				Static108.anInt2201 = 2;
				Static27.anInt572 = Static124.anInt3874;
				Static31.anInt714 = Static96.anInt2006;
				Static93.aClass3_Sub4_Sub1_18.method1298(25);
				Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			}
		}
		if (local22 == 1006) {
			Static27.anInt572 = Static124.anInt3874;
			Static31.anInt714 = Static96.anInt2006;
			Static108.anInt2201 = 2;
			Static191.anInt3883 = 0;
			Static93.aClass3_Sub4_Sub1_18.method1298(45);
			Static93.aClass3_Sub4_Sub1_18.method1289(local33);
		}
		if (local22 == 1004) {
			Static27.anInt572 = Static124.anInt3874;
			Static191.anInt3883 = 0;
			Static108.anInt2201 = 2;
			Static31.anInt714 = Static96.anInt2006;
			local197 = Static8.aClass26_Sub2_Sub2Array1[local33];
			if (local197 != null) {
				@Pc(1565) Class3_Sub3_Sub24 local1565 = local197.aClass3_Sub3_Sub24_1;
				if (local1565.anIntArray344 != null) {
					local1565 = local1565.method3065();
				}
				if (local1565 != null) {
					Static93.aClass3_Sub4_Sub1_18.method1298(165);
					Static93.aClass3_Sub4_Sub1_18.method1273(local1565.anInt3976);
				}
			}
		}
		if (local22 == 45) {
			Static93.aClass3_Sub4_Sub1_18.method1298(132);
			Static93.aClass3_Sub4_Sub1_18.method1252(local10);
			Static93.aClass3_Sub4_Sub1_18.method1283(local14);
			Static93.aClass3_Sub4_Sub1_18.method1273(local33);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 14) {
			Static122.method1754(local18, local10, local14);
			Static93.aClass3_Sub4_Sub1_18.method1298(136);
			Static93.aClass3_Sub4_Sub1_18.method1273(local14 + Static55.anInt1184);
			Static93.aClass3_Sub4_Sub1_18.method1273(Integer.MAX_VALUE & (int) (local18 >>> 32));
			Static93.aClass3_Sub4_Sub1_18.method1252(local10 + Static30.anInt695);
		}
		if (local22 == 58) {
			local551 = Static103.method1467(false, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 0, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			if (!local551) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			}
			Static191.anInt3883 = 0;
			Static27.anInt572 = Static124.anInt3874;
			Static108.anInt2201 = 2;
			Static31.anInt714 = Static96.anInt2006;
			Static93.aClass3_Sub4_Sub1_18.method1298(209);
			Static93.aClass3_Sub4_Sub1_18.method1273(Static113.anInt2287);
			Static93.aClass3_Sub4_Sub1_18.method1264(Static55.anInt1184 + local14);
			Static93.aClass3_Sub4_Sub1_18.method1293(Static6.anInt118);
			Static93.aClass3_Sub4_Sub1_18.method1264(local33);
			Static93.aClass3_Sub4_Sub1_18.method1264(Static30.anInt695 + local10);
		}
		if (local22 == 1) {
			local197 = Static8.aClass26_Sub2_Sub2Array1[local33];
			if (local197 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local197.anIntArray185[0], local197.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static108.anInt2201 = 2;
				Static27.anInt572 = Static124.anInt3874;
				Static31.anInt714 = Static96.anInt2006;
				Static191.anInt3883 = 0;
				Static93.aClass3_Sub4_Sub1_18.method1298(20);
				Static93.aClass3_Sub4_Sub1_18.method1252(Static60.anInt3272);
				Static93.aClass3_Sub4_Sub1_18.method1293(Static55.anInt1195);
				Static93.aClass3_Sub4_Sub1_18.method1264(Static179.anInt1325);
				Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			}
		}
		if (local22 == 42) {
			Static93.aClass3_Sub4_Sub1_18.method1298(116);
			Static93.aClass3_Sub4_Sub1_18.method1293(local14);
			Static93.aClass3_Sub4_Sub1_18.method1252(local10);
			Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 46) {
			local197 = Static8.aClass26_Sub2_Sub2Array1[local33];
			if (local197 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local197.anIntArray185[0], local197.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static27.anInt572 = Static124.anInt3874;
				Static108.anInt2201 = 2;
				Static191.anInt3883 = 0;
				Static31.anInt714 = Static96.anInt2006;
				Static93.aClass3_Sub4_Sub1_18.method1298(184);
				Static93.aClass3_Sub4_Sub1_18.method1264(local33);
			}
		}
		if (local22 == 12) {
			local40 = Static146.aClass26_Sub2_Sub1Array1[local33];
			if (local40 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local40.anIntArray185[0], local40.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static108.anInt2201 = 2;
				Static191.anInt3883 = 0;
				Static31.anInt714 = Static96.anInt2006;
				Static27.anInt572 = Static124.anInt3874;
				Static93.aClass3_Sub4_Sub1_18.method1298(128);
				Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			}
		}
		if (local22 == 5) {
			Static93.aClass3_Sub4_Sub1_18.method1298(55);
			Static93.aClass3_Sub4_Sub1_18.method1264(local33);
			Static93.aClass3_Sub4_Sub1_18.method1289(local10);
			Static93.aClass3_Sub4_Sub1_18.method1285(local14);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 25 && Static122.method1754(local18, local10, local14)) {
			Static93.aClass3_Sub4_Sub1_18.method1298(65);
			Static93.aClass3_Sub4_Sub1_18.method1293(Static55.anInt1195);
			Static93.aClass3_Sub4_Sub1_18.method1289(Static179.anInt1325);
			Static93.aClass3_Sub4_Sub1_18.method1273(Static60.anInt3272);
			Static93.aClass3_Sub4_Sub1_18.method1289(local10 + Static30.anInt695);
			Static93.aClass3_Sub4_Sub1_18.method1252(Integer.MAX_VALUE & (int) (local18 >>> 32));
			Static93.aClass3_Sub4_Sub1_18.method1289(Static55.anInt1184 + local14);
		}
		if (local22 == 15) {
			Static93.aClass3_Sub4_Sub1_18.method1298(145);
			Static93.aClass3_Sub4_Sub1_18.method1285(local14);
			Static93.aClass3_Sub4_Sub1_18.method1289(local10);
			Static93.aClass3_Sub4_Sub1_18.method1273(local33);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 37) {
			Static122.method1754(local18, local10, local14);
			Static93.aClass3_Sub4_Sub1_18.method1298(77);
			Static93.aClass3_Sub4_Sub1_18.method1273((int) (local18 >>> 32) & Integer.MAX_VALUE);
			Static93.aClass3_Sub4_Sub1_18.method1264(local14 + Static55.anInt1184);
			Static93.aClass3_Sub4_Sub1_18.method1289(local10 + Static30.anInt695);
		}
		if (local22 == 13) {
			Static93.aClass3_Sub4_Sub1_18.method1298(54);
			Static93.aClass3_Sub4_Sub1_18.method1252(local10);
			Static93.aClass3_Sub4_Sub1_18.method1273(local33);
			Static93.aClass3_Sub4_Sub1_18.method1283(local14);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 10) {
			Static93.aClass3_Sub4_Sub1_18.method1298(118);
			Static93.aClass3_Sub4_Sub1_18.method1285(Static6.anInt118);
			Static93.aClass3_Sub4_Sub1_18.method1285(local14);
			Static93.aClass3_Sub4_Sub1_18.method1289(local10);
			Static93.aClass3_Sub4_Sub1_18.method1264(Static113.anInt2287);
		}
		if (local22 == 48) {
			Static93.aClass3_Sub4_Sub1_18.method1298(102);
			Static93.aClass3_Sub4_Sub1_18.method1289(local10);
			Static93.aClass3_Sub4_Sub1_18.method1283(local14);
			Static93.aClass3_Sub4_Sub1_18.method1264(local33);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 35) {
			local197 = Static8.aClass26_Sub2_Sub2Array1[local33];
			if (local197 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local197.anIntArray185[0], local197.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static31.anInt714 = Static96.anInt2006;
				Static108.anInt2201 = 2;
				Static27.anInt572 = Static124.anInt3874;
				Static191.anInt3883 = 0;
				Static93.aClass3_Sub4_Sub1_18.method1298(42);
				Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			}
		}
		if (local22 == 33) {
			local40 = Static146.aClass26_Sub2_Sub1Array1[local33];
			if (local40 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local40.anIntArray185[0], local40.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static31.anInt714 = Static96.anInt2006;
				Static27.anInt572 = Static124.anInt3874;
				Static191.anInt3883 = 0;
				Static108.anInt2201 = 2;
				Static93.aClass3_Sub4_Sub1_18.method1298(227);
				Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			}
		}
		if (local22 == 43) {
			local551 = Static103.method1467(false, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 0, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			if (!local551) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			}
			Static191.anInt3883 = 0;
			Static31.anInt714 = Static96.anInt2006;
			Static108.anInt2201 = 2;
			Static27.anInt572 = Static124.anInt3874;
			Static93.aClass3_Sub4_Sub1_18.method1298(34);
			Static93.aClass3_Sub4_Sub1_18.method1289(Static55.anInt1184 + local14);
			Static93.aClass3_Sub4_Sub1_18.method1264(local33);
			Static93.aClass3_Sub4_Sub1_18.method1289(local10 + Static30.anInt695);
		}
		if (local22 == 7) {
			Static93.aClass3_Sub4_Sub1_18.method1298(129);
			Static93.aClass3_Sub4_Sub1_18.method1285(local14);
			local488 = Static146.method2127(local14);
			if (local488.anIntArrayArray4 != null && local488.anIntArrayArray4[0][0] == 5) {
				local508 = local488.anIntArrayArray4[0][1];
				Static16.anIntArray27[local508] = 1 - Static16.anIntArray27[local508];
				Static187.method2947(local508);
			}
		}
		if (local22 == 19) {
			Static41.method680();
			local488 = Static146.method2127(local14);
			Static55.anInt1195 = local14;
			Static210.anInt4244 = 1;
			Static179.anInt1325 = local33;
			Static60.anInt3272 = local10;
			Static9.method237(local488);
			Static2.aClass70_2 = Static207.method3296(new Class70[] { Static149.aClass70_1432, Static14.method275(local33).aClass70_579, Static211.aClass70_2097 });
			if (Static2.aClass70_2 == null) {
				Static2.aClass70_2 = Static121.aClass70_1173;
			}
			return;
		}
		if (local22 == 22) {
			Static151.method2221(Static137.anInt2795, local10, local14);
		}
		if (local22 == 57 && Static122.method1754(local18, local10, local14)) {
			Static93.aClass3_Sub4_Sub1_18.method1298(92);
			Static93.aClass3_Sub4_Sub1_18.method1289(local10 + Static30.anInt695);
			Static93.aClass3_Sub4_Sub1_18.method1273(Static113.anInt2287);
			Static93.aClass3_Sub4_Sub1_18.method1273((int) (local18 >>> 32) & Integer.MAX_VALUE);
			Static93.aClass3_Sub4_Sub1_18.method1289(Static55.anInt1184 + local14);
			Static93.aClass3_Sub4_Sub1_18.method1275(Static6.anInt118);
		}
		if (local22 == 40) {
			Static122.method1754(local18, local10, local14);
			Static93.aClass3_Sub4_Sub1_18.method1298(216);
			Static93.aClass3_Sub4_Sub1_18.method1264(local10 + Static30.anInt695);
			Static93.aClass3_Sub4_Sub1_18.method1273(Integer.MAX_VALUE & (int) (local18 >>> 32));
			Static93.aClass3_Sub4_Sub1_18.method1289(local14 + Static55.anInt1184);
		}
		if (local22 == 17) {
			local488 = Static64.method982(local10, local14);
			if (local488 != null) {
				Static41.method680();
				Static16.method299(local10, Static86.method1231(Static157.method2365(local488)), local14);
				Static210.anInt4244 = 0;
				Static136.aClass70_1289 = Static146.method2126(local488);
				if (Static136.aClass70_1289 == null) {
					Static136.aClass70_1289 = Static24.aClass70_915;
				}
				if (!local488.aBoolean21) {
					Static110.aClass70_1097 = Static207.method3296(new Class70[] { Static22.aClass70_223, local488.aClass70_120, Static211.aClass70_2097 });
					return;
				}
				Static110.aClass70_1097 = Static207.method3296(new Class70[] { local488.aClass70_125, Static211.aClass70_2097 });
			}
			return;
		}
		if (local22 == 16) {
			Static93.aClass3_Sub4_Sub1_18.method1298(38);
			Static93.aClass3_Sub4_Sub1_18.method1285(local14);
			Static93.aClass3_Sub4_Sub1_18.method1273(Static60.anInt3272);
			Static93.aClass3_Sub4_Sub1_18.method1273(local33);
			Static93.aClass3_Sub4_Sub1_18.method1285(Static55.anInt1195);
			Static93.aClass3_Sub4_Sub1_18.method1273(local10);
			Static93.aClass3_Sub4_Sub1_18.method1273(Static179.anInt1325);
			Static120.anInt2431 = 0;
			Static145.aClass6_75 = Static146.method2127(local14);
			Static159.anInt3286 = local10;
		}
		if (local22 == 50) {
			local40 = Static146.aClass26_Sub2_Sub1Array1[local33];
			if (local40 != null) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local40.anIntArray185[0], local40.anIntArray182[0], 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
				Static108.anInt2201 = 2;
				Static27.anInt572 = Static124.anInt3874;
				Static191.anInt3883 = 0;
				Static31.anInt714 = Static96.anInt2006;
				Static93.aClass3_Sub4_Sub1_18.method1298(226);
				Static93.aClass3_Sub4_Sub1_18.method1264(local33);
			}
		}
		if (local22 == 18) {
			Static26.method468();
		}
		if (local22 == 4) {
			local551 = Static103.method1467(false, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 0, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			if (!local551) {
				Static103.method1467(false, 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 1, 0, local14, local10, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
			}
			Static191.anInt3883 = 0;
			Static27.anInt572 = Static124.anInt3874;
			Static31.anInt714 = Static96.anInt2006;
			Static108.anInt2201 = 2;
			Static93.aClass3_Sub4_Sub1_18.method1298(110);
			Static93.aClass3_Sub4_Sub1_18.method1289(local33);
			Static93.aClass3_Sub4_Sub1_18.method1264(Static30.anInt695 + local10);
			Static93.aClass3_Sub4_Sub1_18.method1289(local14 + Static55.anInt1184);
		}
		if (Static210.anInt4244 != 0) {
			Static210.anInt4244 = 0;
			Static9.method237(Static146.method2127(Static55.anInt1195));
		}
		if (Static5.aBoolean7) {
			Static41.method680();
		}
		if (Static145.aClass6_75 != null && Static120.anInt2431 == 0) {
			Static9.method237(Static145.aClass6_75);
		}
	}
}
