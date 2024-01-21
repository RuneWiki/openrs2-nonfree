import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_10;

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "[I")
	public static int[] anIntArray192;

	@OriginalMember(owner = "client!hd", name = "fb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_573 = Static120.method1824("Please contact customer support)3");

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "Lclient!rd;")
	public static Class80 aClass80_571 = aClass80_573;

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_572 = Static120.method1824("Existing User");

	@OriginalMember(owner = "client!hd", name = "X", descriptor = "[Lclient!a;")
	public static final Class1_Sub1[] aClass1_Sub1Array1 = new Class1_Sub1[256];

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "I")
	public static volatile int anInt1477 = 0;

	@OriginalMember(owner = "client!hd", name = "gb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_574 = aClass80_572;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public static void method998() {
		Static94.aClass5_28.method146();
		Static10.aClass5_3.method146();
		Static167.aClass5_52.method146();
		Static156.aClass5_45.method146();
		Static136.aClass5_40.method146();
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
	public static void method999() {
		try {
			if (Static73.aClass33_1 == null) {
				Static73.aClass33_1 = new Class33(Static58.aClass61_1, Static154.method2467(new Class80[] { Static77.aClass80_715, Static185.aClass80_1640, Static108.aClass80_1152 }).method2438());
			} else {
				@Pc(32) byte[] local32 = Static73.aClass33_1.method886();
				if (local32 != null) {
					@Pc(39) Class3_Sub17 local39 = new Class3_Sub17(local32);
					Static101.anInt2112 = local39.method2111();
					Static176.aClass21Array1 = new Class21[Static101.anInt2112];
					for (@Pc(48) int local48 = 0; local48 < Static101.anInt2112; local48++) {
						@Pc(58) Class21 local58 = Static176.aClass21Array1[local48] = new Class21();
						@Pc(62) int local62 = local39.method2111();
						local58.aBoolean39 = (local62 & 0x8000) != 0;
						local58.anInt826 = local62 & 0x7FFF;
						local58.aClass80_289 = local39.method2102();
						local58.anInt831 = local39.method2138();
						local58.anInt829 = local48;
						local58.anInt828 = Static4.method129(local58.aClass80_289);
					}
					Static139.method2159(Static176.aClass21Array1.length - 1, Static133.anIntArray384, Static176.aClass21Array1, 0, Static143.anIntArray395);
					Static21.aBoolean29 = true;
					Static73.aClass33_1 = null;
				}
			}
		} catch (@Pc(115) Exception local115) {
			local115.printStackTrace();
			Static73.aClass33_1 = null;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIIIII)V")
	public static void method1000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(15) int local15 = arg1 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static88.method1288(arg4, arg3, arg2, arg1);
			}
		} else if (local15 == 0) {
			Static185.method2994(arg2, arg3, arg4, arg0);
		} else {
			@Pc(49) int local49 = (local15 << 12) / local10;
			@Pc(58) int local58 = arg3 - (arg4 * local49 >> 12);
			@Pc(70) int local70;
			@Pc(72) int local72;
			if (Static172.anInt3861 > arg4) {
				local70 = Static172.anInt3861;
				local72 = local58 + (Static172.anInt3861 * local49 >> 12);
			} else if (arg4 <= Static85.anInt1779) {
				local70 = arg4;
				local72 = arg3;
			} else {
				local70 = Static85.anInt1779;
				local72 = local58 + (Static85.anInt1779 * local49 >> 12);
			}
			@Pc(105) int local105;
			@Pc(114) int local114;
			if (Static172.anInt3861 > arg0) {
				local114 = (local49 * Static172.anInt3861 >> 12) + local58;
				local105 = Static172.anInt3861;
			} else if (arg0 > Static85.anInt1779) {
				local105 = Static85.anInt1779;
				local114 = local58 + (Static85.anInt1779 * local49 >> 12);
			} else {
				local105 = arg0;
				local114 = arg1;
			}
			if (Static34.anInt790 > local72) {
				local70 = (Static34.anInt790 - local58 << 12) / local49;
				local72 = Static34.anInt790;
			} else if (Static17.anInt440 < local72) {
				local72 = Static17.anInt440;
				local70 = (Static17.anInt440 - local58 << 12) / local49;
			}
			if (Static34.anInt790 > local114) {
				local114 = Static34.anInt790;
				local105 = (Static34.anInt790 - local58 << 12) / local49;
			} else if (local114 > Static17.anInt440) {
				local114 = Static17.anInt440;
				local105 = (Static17.anInt440 - local58 << 12) / local49;
			}
			Static130.method1959(local114, local72, local105, local70, arg2);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public static void method1001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = arg3; local3 <= arg2 + arg3; local3++) {
			for (@Pc(12) int local12 = arg0; local12 <= arg1 + arg0; local12++) {
				if (local12 >= 0 && local12 < 104 && local3 >= 0 && local3 < 104) {
					Static126.aByteArrayArrayArray5[0][local12][local3] = 127;
					if (arg0 == local12 && local12 > 0) {
						Static42.anIntArrayArrayArray1[0][local12][local3] = Static42.anIntArrayArrayArray1[0][local12 - 1][local3];
					}
					if (arg1 + arg0 == local12 && local12 < 103) {
						Static42.anIntArrayArrayArray1[0][local12][local3] = Static42.anIntArrayArrayArray1[0][local12 + 1][local3];
					}
					if (local3 == arg3 && local3 > 0) {
						Static42.anIntArrayArrayArray1[0][local12][local3] = Static42.anIntArrayArrayArray1[0][local12][local3 - 1];
					}
					if (arg2 + arg3 == local3 && local3 < 103) {
						Static42.anIntArrayArrayArray1[0][local12][local3] = Static42.anIntArrayArrayArray1[0][local12][local3 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZIII)I")
	public static int method1002(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class3_Sub1_Sub4_Sub2.anIntArray190[arg3 * 1024 / arg1] >> 1;
		return (arg2 * local24 >> 16) + ((65536 - local24) * arg0 >> 16);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
	public static void method1004() {
		Static41.anInt906 = 0;
		Static33.anInt779 = 0;
		Static21.method344();
		Static104.method1557();
		Static137.method2067();
		Static155.method2488();
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static41.anInt906; local23++) {
			local29 = Static36.anIntArray109[local23];
			if (Static193.anInt4411 != Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local29].anInt4314) {
				Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local29] = null;
			}
		}
		if (Static63.aClass3_Sub17_Sub1_2.anInt2923 != Static41.anInt905) {
			throw new RuntimeException("gpp1 pos:" + Static63.aClass3_Sub17_Sub1_2.anInt2923 + " psize:" + Static41.anInt905);
		}
		for (local29 = 0; local29 < Static15.anInt327; local29++) {
			if (Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[Static168.anIntArray460[local29]] == null) {
				throw new RuntimeException("gpp2 pos:" + local29 + " size:" + Static15.anInt327);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method1005(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static153.method462(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static75.aClass61_2.anApplet1 != null) {
				@Pc(106) Class94 local106 = Static75.aClass61_2.method1789(new URL(Static75.aClass61_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static2.anInt84 + "&u=" + Static34.aLong26 + "&v1=" + Static117.aString4 + "&v2=" + Static117.aString3 + "&e=" + local7));
				while (local106.anInt4472 == 0) {
					Static135.method2059(1L);
				}
				if (local106.anInt4472 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local106.anObject3;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}
}
