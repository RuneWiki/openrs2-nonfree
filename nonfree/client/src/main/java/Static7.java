import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_2;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	public static int anInt226;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
	public static int anInt228;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public static int anInt223 = 0;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_84 = Static170.method3101(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_85 = Static170.method3101("<)4col>");

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "[I")
	public static int[] anIntArray84 = new int[5];

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!eh;")
	private static Class28 aClass28_86 = Static170.method3101("Login limit exceeded)3");

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "Lclient!eh;")
	public static Class28 aClass28_87 = aClass28_86;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_88 = Static170.method3101("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "J")
	public static long aLong9 = 0L;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
	public static int method215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!ah;Lclient!ah;Lclient!ah;Lclient!kf;)Z")
	public static boolean method216(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) Class3_Sub3_Sub2 arg3) {
		Static93.aClass7_43 = arg2;
		Static65.aClass7_30 = arg0;
		Static156.aClass3_Sub3_Sub2_2 = arg3;
		Static121.aClass7_50 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIILclient!gf;)V")
	public static void method217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		if (Static16.anInt490 != 0 && Static16.anInt490 != 3) {
			return;
		}
		@Pc(21) int local21 = arg0 - arg2.anInt1515 / 2;
		@Pc(28) int local28 = arg1 - arg2.anInt1457 / 2;
		@Pc(34) int local34 = Static139.anInt3673 + Static170.anInt4092 & 0x7FF;
		@Pc(38) int local38 = Class3_Sub2_Sub2_Sub2.anIntArray127[local34];
		@Pc(42) int local42 = Class3_Sub2_Sub2_Sub2.anIntArray129[local34];
		@Pc(50) int local50 = (Static51.anInt1446 + 256) * local38 >> 8;
		@Pc(58) int local58 = (Static51.anInt1446 + 256) * local42 >> 8;
		@Pc(69) int local69 = local58 * local21 - local50 * local28 >> 11;
		@Pc(79) int local79 = local21 * local50 + local28 * local58 >> 11;
		@Pc(87) int local87 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 - local69 >> 7;
		@Pc(94) int local94 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 + local79 >> 7;
		@Pc(114) boolean local114 = Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 0, 0, true, local94, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 1, local87, 0);
		if (!local114) {
			return;
		}
		Static51.aClass3_Sub8_Sub1_2.method1550(local28);
		Static51.aClass3_Sub8_Sub1_2.method1550(local21);
		Static51.aClass3_Sub8_Sub1_2.method1531(Static139.anInt3673);
		Static51.aClass3_Sub8_Sub1_2.method1550(57);
		Static51.aClass3_Sub8_Sub1_2.method1550(Static170.anInt4092);
		Static51.aClass3_Sub8_Sub1_2.method1550(Static51.anInt1446);
		Static51.aClass3_Sub8_Sub1_2.method1550(89);
		Static51.aClass3_Sub8_Sub1_2.method1531(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800);
		Static51.aClass3_Sub8_Sub1_2.method1531(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792);
		Static51.aClass3_Sub8_Sub1_2.method1550(Static155.anInt3870);
		Static51.aClass3_Sub8_Sub1_2.method1550(63);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BJ)V")
	public static void method218(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static66.anInt2068 >= 100 && Static22.anInt598 != 1 || Static66.anInt2068 >= 200) {
			Static51.method1192(Static156.aClass28_1306, 0, Static169.aClass28_254);
			return;
		}
		@Pc(31) Class28 local31 = Static149.method2829(arg0).method912();
		for (@Pc(33) int local33 = 0; local33 < Static66.anInt2068; local33++) {
			if (Static26.aLongArray4[local33] == arg0) {
				Static51.method1192(Static156.aClass28_1306, 0, Static4.method96(new Class28[] { local31, Static164.aClass28_1386 }));
				return;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < Static4.anInt128; local63++) {
			if (Static21.aLongArray3[local63] == arg0) {
				Static51.method1192(Static156.aClass28_1306, 0, Static4.method96(new Class28[] { Static152.aClass28_1264, local31, Static168.aClass28_1425 }));
				return;
			}
		}
		if (local31.method934(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass28_296)) {
			Static51.method1192(Static156.aClass28_1306, 0, Static103.aClass28_853);
			return;
		}
		Static37.aClass28Array4[Static66.anInt2068] = local31;
		Static26.aLongArray4[Static66.anInt2068] = arg0;
		Static114.anIntArray509[Static66.anInt2068] = 0;
		Static165.anIntArray669[Static66.anInt2068] = 0;
		Static31.anInt968 = Static90.anInt2570;
		Static66.anInt2068++;
		Static51.aClass3_Sub8_Sub1_2.method1559(53);
		Static51.aClass3_Sub8_Sub1_2.method1541(arg0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	public static void method219() {
		anIntArray84 = null;
		aClass28_84 = null;
		aClass28_86 = null;
		aClass28_85 = null;
		aClass28_87 = null;
		aClass28_88 = null;
		aClass7_Sub1_2 = null;
	}
}
