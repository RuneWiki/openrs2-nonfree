import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "Lclient!ig;")
	public static Class39 aClass39_42;

	@OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
	public static int anInt3804;

	@OriginalMember(owner = "client!ra", name = "cb", descriptor = "Lclient!u;")
	public static Class76 aClass76_113;

	@OriginalMember(owner = "client!ra", name = "Y", descriptor = "Lclient!ad;")
	public static Class4 aClass4_14 = new Class4();

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1298 = Static49.method1293(":clan:");

	@OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
	public static int anInt3806 = 0;

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1299 = Static49.method1293("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(B)V")
	public static void method2834() {
		@Pc(7) int local7 = Static110.anInt3091;
		@Pc(9) int local9 = Static18.anInt481;
		@Pc(11) int local11 = Static3.anInt150;
		@Pc(13) int local13 = Static170.anInt4398;
		Static155.method3012(local7, local9, local13, local11, 6116423);
		Static155.method3012(local7 + 1, local9 + 1, local13 - 2, 16, 0);
		Static155.method3016(local7 + 1, local9 + 18, local13 - 2, local11 + -19, 0);
		Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2391(Static41.aClass70_455, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(65) int local65 = Static21.anInt591;
		@Pc(67) int local67 = Static70.anInt2156;
		for (@Pc(69) int local69 = 0; local69 < Static162.anInt4331; local69++) {
			@Pc(84) int local84 = (Static162.anInt4331 - local69 - 1) * 15 + local9 + 31;
			@Pc(86) int local86 = 16777215;
			if (local7 < local65 && local65 < local7 + local13 && local84 - 13 < local67 && local67 < local84 + 3) {
				local86 = 16776960;
			}
			Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2391(Static158.method3173(local69), local7 + 3, local84, local86, 0);
		}
		Static39.method1005(Static18.anInt481, Static110.anInt3091, Static3.anInt150, Static170.anInt4398);
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)V")
	public static void method2835() {
		aClass76_113 = null;
		aClass70_1298 = null;
		aClass4_14 = null;
		aClass39_42 = null;
		aClass70_1299 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!de;I)V")
	public static void method2836(@OriginalArg(0) Class1_Sub1_Sub4_Sub2 arg0) {
		if (Static47.anInt1654 == arg0.anInt2048 || arg0.anInt2041 == -1 || arg0.anInt2029 != 0 || arg0.anInt2010 + 1 > Static90.method1962(arg0.anInt2041).anIntArray370[arg0.anInt1999]) {
			@Pc(34) int local34 = arg0.anInt2048 - arg0.anInt1996;
			@Pc(39) int local39 = Static47.anInt1654 - arg0.anInt1996;
			@Pc(49) int local49 = arg0.anInt2004 * 64 + arg0.anInt2028 * 128;
			@Pc(59) int local59 = arg0.anInt2004 * 64 + arg0.anInt1998 * 128;
			@Pc(69) int local69 = arg0.anInt2004 * 64 + arg0.anInt2006 * 128;
			arg0.anInt2030 = (local69 * local39 + (local34 - local39) * local49) / local34;
			@Pc(94) int local94 = arg0.anInt2014 * 128 + arg0.anInt2004 * 64;
			arg0.anInt2001 = ((local34 - local39) * local59 + local39 * local94) / local34;
		}
		arg0.anInt2015 = 0;
		if (arg0.anInt2005 == 0) {
			arg0.anInt2047 = 1024;
		}
		if (arg0.anInt2005 == 1) {
			arg0.anInt2047 = 1536;
		}
		if (arg0.anInt2005 == 2) {
			arg0.anInt2047 = 0;
		}
		if (arg0.anInt2005 == 3) {
			arg0.anInt2047 = 512;
		}
		arg0.anInt2040 = arg0.anInt2047;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)Z")
	public static boolean method2837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static31.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == -Static59.anInt1907) {
			return false;
		} else if (local7 == Static59.anInt1907) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static2.method144(local22 + 1, Static92.anIntArrayArrayArray7[arg0][arg1][arg2], local26 + 1) && Static2.method144(local22 + 128 - 1, Static92.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local26 + 1) && Static2.method144(local22 + 128 - 1, Static92.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static2.method144(local22 + 1, Static92.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static31.anIntArrayArrayArray2[arg0][arg1][arg2] = Static59.anInt1907;
				return true;
			} else {
				Static31.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static59.anInt1907;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZII)I")
	public static int method2838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static20.aByteArrayArrayArray1[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static20.aByteArrayArrayArray1[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
