import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!ef;")
	public static Class22 aClass22_8;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] aClass3_Sub1_Sub5_Sub4Array14;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!na;")
	private static Class53 aClass53_1299 = Static109.method1737("Close");

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_1297 = aClass53_1299;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!na;")
	public static Class53 aClass53_1298 = Static109.method1737("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!na;")
	public static Class53 aClass53_1300 = Static109.method1737("");

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
	public static int anInt2601 = 10;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_1301 = Static109.method1737("System)2Update in: ");

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
	public static int anInt2603 = -1;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Lclient!vd;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public static void method1804() {
		if (Static82.anInt940 > 0) {
			Static43.method867();
		} else {
			Static103.method1692(40);
			Static65.aClass37_3 = Static40.aClass37_2;
			Static40.aClass37_2 = null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!u;I)V")
	public static void method1806(@OriginalArg(0) Class3_Sub16 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt2504 == 0) {
			local5 = Static120.aClass39_1.method1010(arg0.anInt2493, arg0.anInt2507, arg0.anInt2496);
		}
		if (arg0.anInt2504 == 1) {
			local5 = Static120.aClass39_1.method979(arg0.anInt2493, arg0.anInt2507, arg0.anInt2496);
		}
		if (arg0.anInt2504 == 2) {
			local5 = Static120.aClass39_1.method973(arg0.anInt2493, arg0.anInt2507, arg0.anInt2496);
		}
		@Pc(48) int local48 = 0;
		if (arg0.anInt2504 == 3) {
			local5 = Static120.aClass39_1.method971(arg0.anInt2493, arg0.anInt2507, arg0.anInt2496);
		}
		@Pc(63) int local63 = -1;
		@Pc(65) int local65 = 0;
		if (local5 != 0) {
			local63 = local5 >> 14 & 0x7FFF;
			@Pc(86) int local86 = Static120.aClass39_1.method985(arg0.anInt2493, arg0.anInt2507, arg0.anInt2496, local5);
			local48 = local86 & 0x1F;
			local65 = local86 >> 6 & 0x3;
		}
		arg0.anInt2497 = local65;
		arg0.anInt2500 = local48;
		arg0.anInt2505 = local63;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
	public static void method1807() {
		aClass53_1300 = null;
		aClass53_1297 = null;
		aClass53_1298 = null;
		aClass22_8 = null;
		aClass53_1301 = null;
		aClass3_Sub1_Sub5_Sub4Array14 = null;
		aClass53_1299 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!we;ILclient!ff;Lclient!we;)V")
	public static void method1808(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) Class3_Sub1_Sub5_Sub2 arg2, @OriginalArg(4) Class62 arg3) {
		Static118.aClass62_25 = arg1;
		Static32.aBoolean37 = arg0;
		Static20.aClass62_2 = arg3;
		Static96.anInt1474 = Static118.aClass62_25.method1507(10);
		Static60.aClass3_Sub1_Sub5_Sub2_2 = arg2;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static98.method1633(arg6)) {
			Static48.method923(0, -1, arg3, arg4, arg1, arg2, arg7, Static107.aClass3_Sub1_Sub15ArrayArray1[arg6], arg5, arg0, 0);
		}
	}
}
