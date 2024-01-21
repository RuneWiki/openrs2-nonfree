import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "J")
	public static long aLong61;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
	public static int anInt2112 = 0;

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "Lclient!rf;")
	private static Class70 aClass70_656 = Static49.method1293("shake:");

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "Lclient!rf;")
	public static Class70 aClass70_657 = Static49.method1293("Clientscript error in: ");

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "Z")
	public static volatile boolean aBoolean73 = true;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "Lclient!rf;")
	public static Class70 aClass70_658 = Static49.method1293("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "Lclient!rf;")
	public static Class70 aClass70_659 = aClass70_656;

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "Lclient!rf;")
	public static Class70 aClass70_660 = Static49.method1293("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "Lclient!rf;")
	public static Class70 aClass70_661 = Static49.method1293("hel");

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
	public static int anInt2116 = 0;

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_662 = aClass70_656;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
	public static void method1564() {
		aClass70_656 = null;
		aClass70_659 = null;
		aClass70_661 = null;
		aClass70_660 = null;
		aClass70_657 = null;
		aClass70_662 = null;
		anIntArray204 = null;
		aClass70_658 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!rf;I)V")
	public static void method1565(@OriginalArg(1) Class70 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class70 local9 = arg0.method2911().method2898();
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < Static104.anInt2960; local17++) {
			@Pc(30) Class1_Sub1_Sub4_Sub2_Sub1 local30 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[Static26.anIntArray46[local17]];
			if (local30 != null && local30.aClass70_408 != null && local30.aClass70_408.method2905(local9)) {
				local15 = true;
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local30.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local30.anIntArray199[0], 0, 1, false);
				if (arg1 == 1) {
					Static131.aClass1_Sub9_Sub1_3.method1283(124);
					Static131.aClass1_Sub9_Sub1_3.method1254(Static26.anIntArray46[local17]);
				} else if (arg1 == 4) {
					Static131.aClass1_Sub9_Sub1_3.method1283(152);
					Static131.aClass1_Sub9_Sub1_3.method1251(Static26.anIntArray46[local17]);
				} else if (arg1 == 6) {
					Static131.aClass1_Sub9_Sub1_3.method1283(20);
					Static131.aClass1_Sub9_Sub1_3.method1245(Static26.anIntArray46[local17]);
				} else if (arg1 == 7) {
					Static131.aClass1_Sub9_Sub1_3.method1283(180);
					Static131.aClass1_Sub9_Sub1_3.method1236(Static26.anIntArray46[local17]);
				}
				break;
			}
		}
		if (!local15) {
			Static41.method1036(Static160.method3210(new Class70[] { Static113.aClass70_1023, local9 }), Static35.aClass70_632, 0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4 method1566() {
		@Pc(9) Class1_Sub1_Sub1_Sub4 local9 = new Class1_Sub1_Sub1_Sub4();
		local9.anInt3967 = Static101.anIntArray272[0];
		local9.anInt3972 = Static74.anInt2262;
		local9.anInt3968 = Static53.anIntArray173[0];
		@Pc(28) int local28 = local9.anInt3968 * local9.anInt3967;
		local9.anIntArray374 = new int[local28];
		local9.anInt3971 = Static119.anIntArray319[0];
		local9.anInt3970 = Static182.anInt4532;
		local9.anInt3969 = Static95.anIntArray257[0];
		@Pc(54) byte[] local54 = Static179.aByteArrayArray10[0];
		for (@Pc(56) int local56 = 0; local56 < local28; local56++) {
			local9.anIntArray374[local56] = Static150.anIntArray375[local54[local56] & 0xFF];
		}
		Static111.method2288();
		return local9;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIII)I")
	public static int method1568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 & arg2 - 1;
		@Pc(13) int local13 = arg0 / arg2;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(28) int local28 = arg2 - 1 & arg0;
		@Pc(33) int local33 = Static125.method2530(local17, local13);
		@Pc(40) int local40 = Static125.method2530(local17 + 1, local13);
		@Pc(47) int local47 = Static125.method2530(local17, local13 + 1);
		@Pc(56) int local56 = Static125.method2530(local17 + 1, local13 - -1);
		@Pc(63) int local63 = Static65.method1521(local9, local40, local33, arg2);
		@Pc(70) int local70 = Static65.method1521(local9, local56, local47, arg2);
		return Static65.method1521(local28, local70, local63, arg2);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIZILclient!re;)V")
	public static void method1569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub1_Sub17 arg4) {
		if (Static88.anInt2601 >= 50 || (arg4.anIntArray369 == null || arg4.anIntArray369.length <= arg1)) {
			return;
		}
		@Pc(31) int local31 = arg4.anIntArray369[arg1];
		if (local31 == 0) {
			return;
		}
		@Pc(38) int local38 = local31 >> 8;
		@Pc(44) int local44 = local31 >> 4 & 0x7;
		@Pc(48) int local48 = local31 & 0xF;
		if (local48 == 0) {
			if (arg2) {
				Static156.method3140(local38, 0, local44);
			}
		} else if (Static140.anInt3678 != 0) {
			Static15.anIntArray30[Static88.anInt2601] = local38;
			Static30.anIntArray98[Static88.anInt2601] = local44;
			Static166.anIntArray411[Static88.anInt2601] = 0;
			Static12.aClass47Array1[Static88.anInt2601] = null;
			@Pc(83) int local83 = (arg0 - 64) / 128;
			@Pc(89) int local89 = (arg3 - 64) / 128;
			Static179.anIntArray426[Static88.anInt2601] = (local89 << 16) - (-(local83 << 8) - local48);
			Static88.anInt2601++;
		}
	}
}
