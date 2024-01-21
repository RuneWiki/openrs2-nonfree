import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] aClass4_Sub4_Sub5_Sub2Array40;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2 aClass4_Sub4_Sub5_Sub2_4;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!gf;")
	public static Class28 aClass28_9 = new Class28(32);

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean138 = true;

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "Lclient!v;")
	private static Class76 aClass76_1093 = Static134.method2017("Attack");

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_1092 = aClass76_1093;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
	public static int[] anIntArray323 = new int[1000];

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
	public static int anInt2333 = 0;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
	public static int anInt2337 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BILclient!je;I)V")
	public static void method1599(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub4_Sub3_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if ((arg2 & 0x200) != 0) {
			arg1.anInt1436 = Static24.aClass4_Sub10_Sub1_1.method599();
			arg1.anInt1408 = Static24.aClass4_Sub10_Sub1_1.method599();
			arg1.anInt1413 = Static24.aClass4_Sub10_Sub1_1.method599();
			arg1.anInt1398 = Static24.aClass4_Sub10_Sub1_1.method596();
			arg1.anInt1397 = Static24.aClass4_Sub10_Sub1_1.method604() + Static78.anInt1981;
			arg1.anInt1427 = Static24.aClass4_Sub10_Sub1_1.method593() + Static78.anInt1981;
			arg1.anInt1407 = Static24.aClass4_Sub10_Sub1_1.method598();
			arg1.anInt1404 = 0;
			arg1.anInt1434 = 1;
		}
		@Pc(76) int local76;
		if ((arg2 & 0x4) != 0) {
			@Pc(65) int local65 = Static24.aClass4_Sub10_Sub1_1.method593();
			if (local65 == 65535) {
				local65 = -1;
			}
			local76 = Static24.aClass4_Sub10_Sub1_1.method599();
			Static24.method354(local76, arg1, local65);
		}
		if ((arg2 & 0x80) != 0) {
			arg1.aClass76_607 = Static24.aClass4_Sub10_Sub1_1.method581();
			if (arg1.aClass76_607.method1860(0) == 126) {
				arg1.aClass76_607 = arg1.aClass76_607.method1874(1);
				Static21.method328(2, arg1.aClass76_612, arg1.aClass76_607);
			} else if (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1 == arg1) {
				Static21.method328(2, arg1.aClass76_612, arg1.aClass76_607);
			}
			arg1.anInt1402 = 0;
			arg1.anInt1381 = 150;
			arg1.anInt1420 = 0;
		}
		if ((arg2 & 0x1) != 0) {
			arg1.anInt1405 = Static24.aClass4_Sub10_Sub1_1.method563();
			if (arg1.anInt1405 == 65535) {
				arg1.anInt1405 = -1;
			}
		}
		if ((arg2 & 0x8) != 0) {
			arg1.anInt1414 = Static24.aClass4_Sub10_Sub1_1.method604();
			arg1.anInt1418 = Static24.aClass4_Sub10_Sub1_1.method593();
		}
		@Pc(182) int local182;
		if ((arg2 & 0x40) != 0) {
			local76 = Static24.aClass4_Sub10_Sub1_1.method598();
			local182 = Static24.aClass4_Sub10_Sub1_1.method599();
			arg1.method971(Static78.anInt1981, local182, local76);
			arg1.anInt1380 = Static78.anInt1981 + 300;
			arg1.anInt1383 = Static24.aClass4_Sub10_Sub1_1.method599();
			arg1.anInt1411 = Static24.aClass4_Sub10_Sub1_1.method598();
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt1439 = Static24.aClass4_Sub10_Sub1_1.method589();
			local76 = Static24.aClass4_Sub10_Sub1_1.method554();
			if (arg1.anInt1439 == 65535) {
				arg1.anInt1439 = -1;
			}
			arg1.anInt1401 = local76 >> 16;
			arg1.anInt1394 = 0;
			arg1.anInt1396 = Static78.anInt1981 + (local76 & 0xFFFF);
			arg1.anInt1428 = 0;
			if (arg1.anInt1396 > Static78.anInt1981) {
				arg1.anInt1428 = -1;
			}
		}
		if ((arg2 & 0x100) != 0) {
			local76 = Static24.aClass4_Sub10_Sub1_1.method599();
			local182 = Static24.aClass4_Sub10_Sub1_1.method598();
			arg1.method971(Static78.anInt1981, local182, local76);
			arg1.anInt1380 = Static78.anInt1981 + 300;
			arg1.anInt1383 = Static24.aClass4_Sub10_Sub1_1.method599();
			arg1.anInt1411 = Static24.aClass4_Sub10_Sub1_1.method598();
		}
		if ((arg2 & 0x10) != 0) {
			local76 = Static24.aClass4_Sub10_Sub1_1.method598();
			@Pc(300) byte[] local300 = new byte[local76];
			@Pc(305) Class4_Sub10 local305 = new Class4_Sub10(local300);
			Static24.aClass4_Sub10_Sub1_1.method587(local76, local300);
			Static73.aClass4_Sub10Array1[arg0] = local305;
			arg1.method977(local305);
		}
		if ((arg2 & 0x20) == 0) {
			return;
		}
		local76 = Static24.aClass4_Sub10_Sub1_1.method604();
		local182 = Static24.aClass4_Sub10_Sub1_1.method599();
		@Pc(338) int local338 = Static24.aClass4_Sub10_Sub1_1.method596();
		@Pc(341) int local341 = Static24.aClass4_Sub10_Sub1_1.anInt931;
		if (arg1.aClass76_612 != null && arg1.aClass26_3 != null) {
			@Pc(349) boolean local349 = false;
			@Pc(354) long local354 = arg1.aClass76_612.method1872();
			if (local182 <= 1) {
				for (@Pc(359) int local359 = 0; local359 < Static45.anInt1192; local359++) {
					if (Static31.aLongArray17[local359] == local354) {
						local349 = true;
						break;
					}
				}
			}
			if (!local349 && Static32.anInt811 == 0) {
				Static110.aClass4_Sub10_7.anInt931 = 0;
				Static24.aClass4_Sub10_Sub1_1.method587(local338, Static110.aClass4_Sub10_7.aByteArray17);
				Static110.aClass4_Sub10_7.anInt931 = 0;
				@Pc(403) Class76 local403 = Static83.method1328(method1601(Static110.aClass4_Sub10_7).method1871());
				arg1.aClass76_607 = local403.method1883();
				arg1.anInt1420 = local76 & 0xFF;
				arg1.anInt1381 = 150;
				arg1.anInt1402 = local76 >> 8;
				if (local182 == 2 || local182 == 3) {
					Static21.method328(1, Static59.method1017(new Class76[] { Static111.aClass76_1148, arg1.aClass76_612 }), local403);
				} else if (local182 == 1) {
					Static21.method328(1, Static59.method1017(new Class76[] { Static65.aClass76_173, arg1.aClass76_612 }), local403);
				} else {
					Static21.method328(2, arg1.aClass76_612, local403);
				}
			}
		}
		Static24.aClass4_Sub10_Sub1_1.anInt931 = local341 + local338;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lclient!k;")
	public static Class4_Sub4_Sub8 method1600(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub4_Sub8 local12 = (Class4_Sub4_Sub8) Static119.aClass72_27.method1781((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static128.aClass17_42.method290(6, arg0);
		local12 = new Class4_Sub4_Sub8();
		local12.anInt1525 = arg0;
		if (local22 != null) {
			local12.method995(new Class4_Sub10(local22));
		}
		local12.method999();
		if (local12.aBoolean90) {
			local12.aBoolean89 = false;
			local12.anInt1500 = 0;
		}
		Static119.aClass72_27.method1783(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ne;I)Lclient!v;")
	public static Class76 method1601(@OriginalArg(0) Class4_Sub10 arg0) {
		return Static57.method1004(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)Z")
	public static boolean method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!la;I)Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4 method1603(@OriginalArg(1) Class17 arg0, @OriginalArg(2) int arg1) {
		return Static68.method1137(arg1, arg0) ? Static21.method323() : null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!v;B)V")
	public static void method1604(@OriginalArg(0) Class76 arg0) {
		if (Static129.anInt2759 >= 2) {
			if (arg0.method1882(Static36.aClass76_437)) {
				System.gc();
			}
			if (arg0.method1882(Static85.aClass76_907)) {
				Static93.method1501();
			}
			if (arg0.method1882(Static112.aClass76_1157)) {
				Static126.aBoolean156 = true;
			}
			if (arg0.method1882(Static90.aClass76_943)) {
				Static126.aBoolean156 = false;
			}
			if (arg0.method1882(Static42.aClass76_498)) {
				for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
					for (@Pc(48) int local48 = 1; local48 < 103; local48++) {
						for (@Pc(52) int local52 = 1; local52 < 103; local52++) {
							Static52.aClass50Array1[local44].anIntArrayArray16[local48][local52] = 0;
						}
					}
				}
			}
			if (arg0.method1882(Static14.aClass76_118) && Static21.anInt508 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1869(Static54.aClass76_1194)) {
				Static13.anInt223 = arg0.method1874(12).method1883().method1884();
				Static21.method328(0, null, Static59.method1017(new Class76[] { Static134.aClass76_1331, Static63.method1092(Static13.anInt223) }));
			}
			if (arg0.method1882(Static85.aClass76_908)) {
				Static99.aBoolean157 = true;
			}
		}
		Static69.aClass4_Sub10_Sub1_2.method611(159);
		Static69.aClass4_Sub10_Sub1_2.method600(arg0.method1851() - 1);
		Static69.aClass4_Sub10_Sub1_2.method571(arg0.method1874(2));
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method1605() {
		aClass76_1092 = null;
		aClass4_Sub4_Sub5_Sub2_4 = null;
		anIntArray323 = null;
		aClass28_9 = null;
		aClass76_1093 = null;
		aString4 = null;
		aClass4_Sub4_Sub5_Sub2Array40 = null;
	}
}
