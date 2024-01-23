import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	public static int anInt418;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "[I")
	public static int[] anIntArray55 = new int[2500];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method335(@OriginalArg(1) String arg0) {
		if (Static150.aClass165Array1 != null) {
			Static211.aClass2_Sub16_Sub1_2.method2198(100);
			Static211.aClass2_Sub16_Sub1_2.method2168(Static223.method3684(arg0));
			Static211.aClass2_Sub16_Sub1_2.method2153(arg0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIBILclient!qn;II)Z")
	public static boolean method337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class146 arg2, @OriginalArg(6) int arg3) {
		@Pc(12) Class140 local12 = Static46.method855(arg2.anInt4764);
		if (local12.anInt4522 == -1) {
			return true;
		}
		if (arg2.aBoolean315) {
			@Pc(31) int local31 = arg3 + arg2.anInt4759;
			arg3 = local31 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(49) Class93_Sub1 local49 = local12.method3671(arg3, arg2.aBoolean310);
		if (local49 == null) {
			return false;
		}
		@Pc(56) int local56 = arg2.anInt4749;
		@Pc(59) int local59 = arg2.anInt4721;
		if ((arg3 & 0x1) == 1) {
			local56 = arg2.anInt4721;
			local59 = arg2.anInt4749;
		}
		@Pc(76) int local76 = local49.anInt4354;
		@Pc(79) int local79 = local49.anInt4361;
		if (local12.aBoolean302) {
			local76 = local59 * 4;
			local79 = local56 * 4;
		}
		if (local12.anInt4531 == 0) {
			local49.method2561(arg1 * 4 + 48, (-local59 + -arg0 + 104) * 4 + 48, local79, local76);
		} else {
			local49.method2563(arg1 * 4 + 48, (-local59 + 104 + -arg0) * 4 + 48, local79, local76, local12.anInt4531);
		}
		return true;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIIII)V")
	public static void method342(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static91.anInt2195 < 100) {
			Static88.method1565();
		}
		if (Static116.aBoolean184) {
			Static111.method1895(arg0, arg3, arg0 + arg2, arg3 + arg1);
		} else {
			Static77.method1444(arg0, arg3, arg0 + arg2, arg3 - -arg1);
		}
		@Pc(49) int local49;
		@Pc(60) int local60;
		if (Static91.anInt2195 < 100) {
			local49 = arg0 + arg2 / 2;
			local60 = arg1 / 2 + arg3 - 20 - 18;
			if (Static116.aBoolean184) {
				Static111.method1888(arg0, arg3, arg2, arg1, 0);
				Static111.method1897(local49 - 152, local60, 304, 34, 9179409);
				Static111.method1888(local49 - 150, local60 + 2, Static91.anInt2195 * 3, 30, 9179409);
			} else {
				Static77.method1447(arg0, arg3, arg2, arg1, 0);
				Static77.method1457(local49 - 152, local60, 304, 34, 9179409);
				Static77.method1447(local49 - 150, local60 + 2, Static91.anInt2195 * 3, 30, 9179409);
			}
			Static237.aClass2_Sub8_Sub5_5.method1230(Static131.aString101, local49, local60 + 20, 16777215, -1);
			return;
		}
		Static200.anInt4185 = (int) ((float) (arg2 * 2) / Static250.aFloat32);
		Static26.anInt4562 = Static67.anInt1659 - (int) ((float) arg1 / Static250.aFloat32);
		Static84.anInt1966 = Static237.anInt4776 - (int) ((float) arg2 / Static250.aFloat32);
		@Pc(160) int local160 = Static237.anInt4776 - (int) ((float) arg2 / Static250.aFloat32);
		Static223.anInt4545 = (int) ((float) (arg1 * 2) / Static250.aFloat32);
		local49 = Static67.anInt1659 - (int) ((float) arg1 / Static250.aFloat32);
		@Pc(185) int local185 = Static67.anInt1659 + (int) ((float) arg1 / Static250.aFloat32);
		local60 = (int) ((float) arg2 / Static250.aFloat32) + Static237.anInt4776;
		@Pc(240) Class44 local240;
		if (Static116.aBoolean184) {
			if (Static182.aClass2_Sub8_Sub1_Sub1_6 == null || Static182.aClass2_Sub8_Sub1_Sub1_6.anInt5514 != arg2 || Static182.aClass2_Sub8_Sub1_Sub1_6.anInt5517 != arg1) {
				Static182.aClass2_Sub8_Sub1_Sub1_6 = null;
				Static182.aClass2_Sub8_Sub1_Sub1_6 = new Class2_Sub8_Sub1_Sub1(arg2, arg1);
			}
			Static77.method1460(Static182.aClass2_Sub8_Sub1_Sub1_6.anIntArray340, arg2, arg1);
			Static250.method2539(local160, local49, local60, local185, 0, 0, arg2, arg1 + 1);
			Static250.method2523();
			local240 = Static250.method2528();
			Static203.method3464(local240, arg3, arg0);
			Static182.aClass2_Sub8_Sub1_Sub1_6.method2782();
			Static111.method1882(Static182.aClass2_Sub8_Sub1_Sub1_6.anIntArray340, arg0, arg3, arg2, arg1);
			Static77.anIntArray163 = null;
		} else {
			Static250.method2539(local160, local49, local60, local185, arg0, arg3, arg0 + arg2, arg1 + 1 + arg3);
			Static250.method2523();
			local240 = Static250.method2528();
			Static203.method3464(local240, 0, 0);
		}
		if (Static10.anInt171 > 0) {
			Static225.anInt5333--;
			if (Static225.anInt5333 == 0) {
				Static10.anInt171--;
				Static225.anInt5333 = 20;
			}
		}
		if (!Static193.aBoolean277) {
			return;
		}
		@Pc(309) int local309 = arg0 + arg2 - 5;
		@Pc(315) int local315 = arg1 + arg3 - 8;
		Static69.aClass2_Sub8_Sub5_4.method1227("Fps:" + Static107.anInt2458, local309, local315, 16776960, -1);
		@Pc(331) int local331 = 16776960;
		@Pc(333) Runtime local333 = Runtime.getRuntime();
		@Pc(342) int local342 = (int) ((local333.totalMemory() - local333.freeMemory()) / 1024L);
		@Pc(343) int local343 = local315 - 15;
		if (local342 > 65536) {
			local331 = 16711680;
		}
		Static69.aClass2_Sub8_Sub5_4.method1227("Mem:" + local342 + "k", local309, local343, local331, -1);
		local315 = local343 - 15;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Lclient!dc;")
	public static Class32 method343(@OriginalArg(1) int arg0) {
		@Pc(8) Class32 local8 = (Class32) Static89.aClass157_19.method4031((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(30) byte[] local30 = Static54.aClass42_16.method1256(30, arg0);
		local8 = new Class32();
		if (local30 != null) {
			local8.method891(arg0, new Class2_Sub16(local30));
		}
		Static89.aClass157_19.method4026((long) arg0, local8);
		return local8;
	}
}
