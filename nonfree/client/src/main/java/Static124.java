import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Lclient!ic;")
	public static Class85 aClass85_9;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "I")
	public static int anInt2449;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "[I")
	public static int[] anIntArray217 = new int[50];

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method1922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 <= 3) {
			return local8 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
		} else {
			return "<col=80ff00>";
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public static void method1923() {
		if (Static121.aClass4_Sub3_Sub22_3 == null) {
			return;
		}
		if (Static138.anInt2644 < 10) {
			if (!Static121.aClass58_65.method1365(Static121.aClass4_Sub3_Sub22_3.aString365)) {
				Static138.anInt2644 = Static219.aClass58_82.method1342(Static121.aClass4_Sub3_Sub22_3.aString365) / 10;
				return;
			}
			Static227.method3634();
			Static138.anInt2644 = 10;
		}
		if (Static138.anInt2644 == 10) {
			Static121.anInt2962 = Static121.aClass4_Sub3_Sub22_3.anInt5995 >> 6 << 6;
			Static121.anInt2965 = (Static121.aClass4_Sub3_Sub22_3.anInt6006 >> 6 << 6) + 64 - Static121.anInt2962;
			Static121.anInt2961 = Static121.aClass4_Sub3_Sub22_3.anInt6000 >> 6 << 6;
			@Pc(70) int[] local70 = new int[3];
			Static121.anInt2960 = (Static121.aClass4_Sub3_Sub22_3.anInt6011 >> 6 << 6) + 64 - Static121.anInt2961;
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = -1;
			if (Static121.aClass4_Sub3_Sub22_3.method4790(Static295.anInt5480 + (Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7), Static281.anInt5335, local70, (Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7) + Static220.anInt3983)) {
				local86 = local70[1] - Static121.anInt2962;
				local84 = Static121.anInt2961 + Static121.anInt2960 - local70[2] - 1;
			}
			if (!Static71.aBoolean82 && local86 >= 0 && Static121.anInt2965 > local86 && local84 >= 0 && Static121.anInt2960 > local84) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				Static275.anInt5232 = local84;
				local86 += (int) (Math.random() * 10.0D) - 5;
				Static22.anInt331 = local86;
			} else if (Static259.anInt4954 == -1 || Static133.anInt2571 == -1) {
				Static121.aClass4_Sub3_Sub22_3.method4792(local70, Static121.aClass4_Sub3_Sub22_3.anInt5996 & 0x3FFF, Static121.aClass4_Sub3_Sub22_3.anInt5996 >> 14 & 0x3FFF);
				Static275.anInt5232 = Static121.anInt2961 + Static121.anInt2960 - local70[2] - 1;
				Static22.anInt331 = local70[1] - Static121.anInt2962;
			} else {
				Static121.aClass4_Sub3_Sub22_3.method4792(local70, Static133.anInt2571, Static259.anInt4954);
				Static133.anInt2571 = -1;
				Static259.anInt4954 = -1;
				Static71.aBoolean82 = false;
				if (local70 != null) {
					Static275.anInt5232 = Static121.anInt2960 + Static121.anInt2961 - local70[2] - 1;
					Static22.anInt331 = local70[1] - Static121.anInt2962;
				}
			}
			if (Static121.aClass4_Sub3_Sub22_3.anInt6010 == 37) {
				Static121.aFloat68 = 3.0F;
				Static121.aFloat69 = 3.0F;
			} else if (Static121.aClass4_Sub3_Sub22_3.anInt6010 == 50) {
				Static121.aFloat68 = 4.0F;
				Static121.aFloat69 = 4.0F;
			} else if (Static121.aClass4_Sub3_Sub22_3.anInt6010 == 75) {
				Static121.aFloat68 = 6.0F;
				Static121.aFloat69 = 6.0F;
			} else if (Static121.aClass4_Sub3_Sub22_3.anInt6010 == 100) {
				Static121.aFloat68 = 8.0F;
				Static121.aFloat69 = 8.0F;
			} else if (Static121.aClass4_Sub3_Sub22_3.anInt6010 == 200) {
				Static121.aFloat68 = 16.0F;
				Static121.aFloat69 = 16.0F;
			} else {
				Static121.aFloat68 = 8.0F;
				Static121.aFloat69 = 8.0F;
			}
			Static204.method3262();
			@Pc(309) int local309 = Static121.anInt2965 >> 6;
			Static121.anIntArray266 = new int[Static76.anInt5720 + 1];
			@Pc(318) int local318 = Static121.anInt2960 >> 6;
			Static121.aByteArrayArrayArray11 = new byte[local309][local318][];
			Static121.anIntArrayArrayArray6 = new int[local309][local318][];
			Static121.aByteArrayArrayArray12 = new byte[local309][local318][];
			Static121.aByteArrayArrayArray13 = new byte[local309][local318][];
			Static121.anIntArrayArrayArray7 = new int[local309][local318][];
			Static121.aByteArrayArrayArray10 = new byte[local309][local318][];
			Static121.aByteArrayArrayArray14 = new byte[local309][local318][];
			Static113.aClass114_13 = new Class114();
			Static33.aClass132_1 = new Class132();
			@Pc(358) int local358 = Static65.anInt1273 >> 1;
			@Pc(364) int local364 = Static240.anInt4556 >> 2 << 10;
			Static121.method2415(local364, local358);
			Static68.method1064(1024, 256);
			Static85.method1501(256);
			Static138.anInt2644 = 20;
		} else if (Static138.anInt2644 == 20) {
			Static182.method2947(new Class4_Sub10(Static121.aClass58_65.method1358("underlay", Static121.aClass4_Sub3_Sub22_3.aString365)));
			Static138.anInt2644 = 30;
			Static249.method3954(true);
			Static107.method4408();
		} else if (Static138.anInt2644 == 30) {
			Static121.method2405(new Class4_Sub10(Static121.aClass58_65.method1358("overlay", Static121.aClass4_Sub3_Sub22_3.aString365)));
			Static138.anInt2644 = 40;
			Static107.method4408();
		} else if (Static138.anInt2644 == 40) {
			Static121.method2413(new Class4_Sub10(Static121.aClass58_65.method1358("overlay2", Static121.aClass4_Sub3_Sub22_3.aString365)));
			Static138.anInt2644 = 50;
			Static107.method4408();
		} else if (Static138.anInt2644 == 50) {
			Static121.method2414(new Class4_Sub10(Static121.aClass58_65.method1358("loc", Static121.aClass4_Sub3_Sub22_3.aString365)), Static293.aBoolean371);
			Static138.anInt2644 = 60;
			Static249.method3954(true);
			Static107.method4408();
		} else if (Static138.anInt2644 == 60) {
			if (Static121.aClass58_65.method1344(Static121.aClass4_Sub3_Sub22_3.aString365 + "_labels")) {
				if (!Static121.aClass58_65.method1365(Static121.aClass4_Sub3_Sub22_3.aString365 + "_labels")) {
					return;
				}
				Static121.aClass141_6 = Static89.method1555(Static121.aClass58_65, Static121.aClass4_Sub3_Sub22_3.aString365 + "_labels", Static293.aBoolean371);
			} else {
				Static121.aClass141_6 = new Class141(0);
			}
			Static121.method2407();
			Static138.anInt2644 = 70;
			Static107.method4408();
		} else if (Static138.anInt2644 == 70) {
			Static228.aClass108_7 = new Class108(11, true, Static188.aCanvas115);
			Static138.anInt2644 = 73;
			Static249.method3954(true);
			Static107.method4408();
		} else if (Static138.anInt2644 == 73) {
			Static142.aClass108_3 = new Class108(12, true, Static188.aCanvas115);
			Static138.anInt2644 = 76;
			Static249.method3954(true);
			Static107.method4408();
		} else if (Static138.anInt2644 == 76) {
			Static172.aClass108_5 = new Class108(14, true, Static188.aCanvas115);
			Static138.anInt2644 = 79;
			Static249.method3954(true);
			Static107.method4408();
		} else if (Static138.anInt2644 == 79) {
			Static170.aClass108_4 = new Class108(17, true, Static188.aCanvas115);
			Static138.anInt2644 = 82;
			Static249.method3954(true);
			Static107.method4408();
		} else if (Static138.anInt2644 == 82) {
			Static10.aClass108_1 = new Class108(19, true, Static188.aCanvas115);
			Static138.anInt2644 = 85;
			Static249.method3954(true);
			Static107.method4408();
		} else if (Static138.anInt2644 == 85) {
			Static88.aClass108_2 = new Class108(22, true, Static188.aCanvas115);
			Static138.anInt2644 = 88;
			Static249.method3954(true);
			Static107.method4408();
		} else if (Static138.anInt2644 == 88) {
			Static199.aClass108_6 = new Class108(26, true, Static188.aCanvas115);
			Static138.anInt2644 = 91;
			Static249.method3954(true);
			Static107.method4408();
		} else {
			Static243.aClass108_8 = new Class108(30, true, Static188.aCanvas115);
			Static138.anInt2644 = 100;
			Static249.method3954(true);
			Static107.method4408();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	public static void method1924() {
		Static189.aClass26_35.method517(5);
		Static51.aClass26_7.method517(5);
		Static193.aClass26_37.method517(5);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
	public static void method1925() {
		if (Static307.aBoolean402) {
			return;
		}
		if (Static212.aBoolean293) {
			Static202.aFloat97 = (int) Static202.aFloat97 + 191 & 0xFFFFFF80;
		} else {
			Static168.aFloat79 += (24.0F - Static168.aFloat79) / 2.0F;
		}
		Static307.aBoolean402 = true;
		Static182.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public static void method1926() {
		Static81.aClass26_16.method515();
	}
}
