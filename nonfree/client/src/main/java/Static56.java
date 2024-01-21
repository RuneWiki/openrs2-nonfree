import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
	public static int anInt1216;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_482 = Static120.method1824("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Ljava/lang/Object;")
	public static final Object anObject2 = new Object();

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_483 = Static120.method1824("Sorry invited players only)3");

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "Lclient!rd;")
	public static Class80 aClass80_484 = aClass80_483;

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array10 = new Class80[200];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
	public static void method820(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11;
		if (arg0 <= arg1) {
			for (local11 = arg0; local11 < arg1; local11++) {
				Static96.anIntArrayArray27[local11][arg3] = arg2;
			}
		} else {
			for (local11 = arg1; local11 < arg0; local11++) {
				Static96.anIntArrayArray27[local11][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!bc;Lclient!bc;BLjava/awt/Component;)V")
	public static void method821(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) Component arg2) {
		if (Static5.aBoolean17) {
			return;
		}
		Static24.method2566();
		@Pc(15) byte[] local15 = arg1.method60(Static19.anInt469, 0);
		Static147.aClass3_Sub1_Sub4_Sub4_31 = new Class3_Sub1_Sub4_Sub4(local15, arg2);
		Static13.aClass3_Sub1_Sub4_Sub4_3 = Static147.aClass3_Sub1_Sub4_Sub4_31.method2596();
		Static101.aClass3_Sub1_Sub4_Sub1_4 = Static186.method3015(arg0, Static181.anInt4058);
		Static51.aClass3_Sub1_Sub4_Sub1_1 = Static186.method3015(arg0, Static192.anInt4405);
		Static87.aClass3_Sub1_Sub4_Sub1_3 = Static186.method3015(arg0, Static158.anInt3508);
		Static126.aClass3_Sub1_Sub4_Sub1Array6 = Static192.method3100(Static153.anInt686, arg0);
		Static98.aClass3_Sub1_Sub4_Sub1Array4 = Static192.method3100(Static57.anInt1247, arg0);
		Static144.anIntArray408 = new int[256];
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			Static144.anIntArray408[local59] = local59 * 262144;
		}
		for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
			Static144.anIntArray408[local75 + 64] = local75 * 1024 + 16711680;
		}
		for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
			Static144.anIntArray408[local95 + 128] = local95 * 4 + 16776960;
		}
		for (@Pc(115) int local115 = 0; local115 < 64; local115++) {
			Static144.anIntArray408[local115 + 192] = 16777215;
		}
		Static151.anIntArray431 = new int[256];
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			Static151.anIntArray431[local132] = local132 * 1024;
		}
		for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
			Static151.anIntArray431[local148 + 64] = local148 * 4 + 65280;
		}
		for (@Pc(166) int local166 = 0; local166 < 64; local166++) {
			Static151.anIntArray431[local166 + 128] = local166 * 262144 + 65535;
		}
		for (@Pc(184) int local184 = 0; local184 < 64; local184++) {
			Static151.anIntArray431[local184 + 192] = 16777215;
		}
		Static130.anIntArray380 = new int[256];
		for (@Pc(203) int local203 = 0; local203 < 64; local203++) {
			Static130.anIntArray380[local203] = local203 * 4;
		}
		for (@Pc(219) int local219 = 0; local219 < 64; local219++) {
			Static130.anIntArray380[local219 + 64] = local219 * 262144 + 255;
		}
		for (@Pc(239) int local239 = 0; local239 < 64; local239++) {
			Static130.anIntArray380[local239 + 128] = local239 * 1024 + 16711935;
		}
		for (@Pc(259) int local259 = 0; local259 < 64; local259++) {
			Static130.anIntArray380[local259 + 192] = 16777215;
		}
		Static31.anIntArray94 = new int[256];
		Static90.anIntArray227 = new int[32768];
		Static184.anIntArray497 = new int[32768];
		Static122.method1835(null);
		Static59.anIntArray172 = new int[32768];
		Static170.anIntArray462 = new int[32768];
		Static78.aClass80_671 = Static78.aClass80_667;
		Static163.anInt3649 = 0;
		Static78.aClass80_666 = Static78.aClass80_667;
		if (Static187.anInt4245 == 0) {
			Static131.aBoolean170 = true;
		} else {
			Static131.aBoolean170 = false;
		}
		Static21.aBoolean29 = false;
		if (Static131.aBoolean170) {
			Static128.method1942();
		} else {
			Static42.method648(Static102.aClass1_Sub1_17, Static96.anInt2027, 255);
		}
		Static97.method1466(false);
		Static5.aBoolean17 = true;
		Static147.aClass3_Sub1_Sub4_Sub4_31.method2599(0, 0);
		Static13.aClass3_Sub1_Sub4_Sub4_3.method2599(382, 0);
		Static101.aClass3_Sub1_Sub4_Sub1_4.method567(382 - Static101.aClass3_Sub1_Sub4_Sub1_4.anInt819 / 2, 18);
		Static190.aClass3_Sub1_Sub4_Sub4_40 = new Class3_Sub1_Sub4_Sub4(128, 254);
		Static170.aClass3_Sub1_Sub4_Sub4_34 = new Class3_Sub1_Sub4_Sub4(128, 254);
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)J")
	public static long method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2014; local13++) {
			@Pc(19) Class4 local19 = local7.aClass4Array3[local13];
			if ((local19.aLong4 >> 29 & 0x3L) == 2L && local19.anInt185 == arg1 && local19.anInt188 == arg2) {
				return local19.aLong4;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLclient!qc;Lclient!bc;Lclient!bc;I)V")
	public static void method823(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub4_Sub3_Sub1 arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) Class1 arg3) {
		Static150.aBoolean137 = arg0;
		Static36.aClass1_6 = arg3;
		Static192.aClass1_33 = arg2;
		@Pc(15) int local15 = Static192.aClass1_33.method50() - 1;
		Static58.anInt1289 = local15 * 256 + Static192.aClass1_33.method56(local15);
		Static108.aClass3_Sub1_Sub4_Sub3_Sub1_5 = arg1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZ)V")
	public static void method824(@OriginalArg(0) boolean arg0) {
		@Pc(7) int local7 = Static15.anInt327;
		if (arg0) {
			local7 = 1;
		}
		if (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 >> 7 == Static49.anInt1087 && Static171.anInt3847 == Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 >> 7) {
			Static49.anInt1087 = 0;
		}
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(42) Class3_Sub1_Sub5_Sub4_Sub2 local42;
			@Pc(44) long local44;
			if (arg0) {
				local42 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1;
				local44 = 8791798054912L;
			} else {
				local42 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[Static168.anIntArray460[local31]];
				local44 = (long) Static168.anIntArray460[local31] << 32;
			}
			if (local42 != null && local42.method3064()) {
				local42.aBoolean171 = false;
				if ((Static96.aBoolean83 && Static15.anInt327 > 50 || Static15.anInt327 > 200) && !arg0 && local42.anInt4326 == local42.anInt4285) {
					local42.aBoolean171 = true;
				}
				@Pc(97) int local97 = local42.anInt4329 >> 7;
				@Pc(102) int local102 = local42.anInt4315 >> 7;
				if (local97 >= 0 && local97 < 104 && local102 >= 0 && local102 < 104) {
					if (local42.aClass3_Sub1_Sub5_Sub3_1 == null || local42.anInt4347 > Static193.anInt4411 || Static193.anInt4411 >= local42.anInt4335) {
						if ((local42.anInt4329 & 0x7F) == 64 && (local42.anInt4315 & 0x7F) == 64) {
							if (Static177.anIntArrayArray39[local97][local102] == Static37.anInt856) {
								continue;
							}
							Static177.anIntArrayArray39[local97][local102] = Static37.anInt856;
						}
						local42.anInt4280 = Static50.method742(Static153.anInt673, local42.anInt4315, local42.anInt4329);
						Static49.method738(Static153.anInt673, local42.anInt4329, local42.anInt4315, local42.anInt4280, 60, local42, local42.anInt4301, local44, local42.aBoolean169);
					} else {
						local42.aBoolean171 = false;
						local42.anInt4280 = Static50.method742(Static153.anInt673, local42.anInt4315, local42.anInt4329);
						Static141.method2185(Static153.anInt673, local42.anInt4329, local42.anInt4315, local42.anInt4280, local42, local42.anInt4301, local44, local42.anInt4343, local42.anInt4351, local42.anInt4339, local42.anInt4331);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIILclient!mb;I)V")
	public static void method826(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub17 arg5, @OriginalArg(7) int arg6) {
		@Pc(28) int local28;
		if (arg0 < 0 || arg0 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local28 = arg5.method2107();
				if (local28 == 0) {
					return;
				}
				if (local28 == 1) {
					arg5.method2107();
					return;
				}
				if (local28 <= 49) {
					arg5.method2107();
				}
			}
			return;
		}
		Static18.aByteArrayArrayArray1[arg3][arg0][arg6] = 0;
		while (true) {
			local28 = arg5.method2107();
			if (local28 == 0) {
				if (arg3 == 0) {
					Static42.anIntArrayArrayArray1[0][arg0][arg6] = -Static10.method171(arg4 + arg6 + 556238, arg0 + 932731 + arg1) * 8;
					return;
				} else {
					Static42.anIntArrayArrayArray1[arg3][arg0][arg6] = Static42.anIntArrayArrayArray1[arg3 - 1][arg0][arg6] - 240;
					return;
				}
			}
			if (local28 == 1) {
				@Pc(119) int local119 = arg5.method2107();
				if (local119 == 1) {
					local119 = 0;
				}
				if (arg3 == 0) {
					Static42.anIntArrayArrayArray1[0][arg0][arg6] = -local119 * 8;
					return;
				}
				Static42.anIntArrayArrayArray1[arg3][arg0][arg6] = Static42.anIntArrayArrayArray1[arg3 - 1][arg0][arg6] - local119 * 8;
				return;
			}
			if (local28 <= 49) {
				Static41.aByteArrayArrayArray3[arg3][arg0][arg6] = arg5.method2123();
				Static20.aByteArrayArrayArray2[arg3][arg0][arg6] = (byte) ((local28 - 2) / 4);
				Static113.aByteArrayArrayArray4[arg3][arg0][arg6] = (byte) (arg2 + local28 - 2 & 0x3);
			} else if (local28 <= 81) {
				Static18.aByteArrayArrayArray1[arg3][arg0][arg6] = (byte) (local28 - 49);
			} else {
				Static185.aByteArrayArrayArray7[arg3][arg0][arg6] = (byte) (local28 - 81);
			}
		}
	}
}
