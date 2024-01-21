import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] aClass4_Sub4_Sub5_Sub2Array22;

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
	public static int anInt1222;

	@OriginalMember(owner = "client!ia", name = "Q", descriptor = "Lclient!vb;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!ia", name = "U", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!ia", name = "B", descriptor = "[I")
	public static int[] anIntArray153 = new int[32768];

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "[I")
	public static int[] anIntArray154 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ia", name = "L", descriptor = "J")
	public static long aLong46 = 0L;

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "Lclient!v;")
	private static Class76 aClass76_535 = Static134.method2017("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!ia", name = "N", descriptor = "Lclient!v;")
	private static Class76 aClass76_536 = Static134.method2017("Members only world");

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "Lclient!v;")
	public static Class76 aClass76_537 = Static134.method2017("Nehmen");

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "Lclient!v;")
	public static Class76 aClass76_538 = aClass76_535;

	@OriginalMember(owner = "client!ia", name = "X", descriptor = "Lclient!v;")
	public static Class76 aClass76_539 = aClass76_536;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	public static void method833() {
		anIntArray153 = null;
		anIntArrayArray12 = null;
		aClass76_539 = null;
		anIntArray154 = null;
		aClass77_1 = null;
		aClass4_Sub4_Sub5_Sub2Array22 = null;
		aClass76_538 = null;
		aClass76_535 = null;
		aClass76_537 = null;
		aClass76_536 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	public static void method834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static62.anInt1613 != 0 && Static62.anInt1613 != 3 || Static38.anInt1093 != 1) {
			return;
		}
		@Pc(31) int local31 = Static20.anInt427 - arg0 - 5;
		@Pc(38) int local38 = Static75.anInt1928 - arg1 - 25;
		if (local38 < 0 || local31 < 0 || local38 >= 146 || local31 >= 151) {
			return;
		}
		local38 -= 73;
		local31 -= 75;
		@Pc(66) int local66 = Static60.anInt1576 + Static14.anInt244 & 0x7FF;
		@Pc(70) int local70 = Class4_Sub4_Sub5_Sub1.anIntArray118[local66];
		@Pc(74) int local74 = Class4_Sub4_Sub5_Sub1.anIntArray119[local66];
		@Pc(82) int local82 = (Static27.anInt2814 + 256) * local70 >> 8;
		@Pc(90) int local90 = local74 * (Static27.anInt2814 + 256) >> 8;
		@Pc(100) int local100 = local82 * local31 + local90 * local38 >> 11;
		@Pc(111) int local111 = local31 * local90 - local82 * local38 >> 11;
		@Pc(119) int local119 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 + local100 >> 7;
		@Pc(127) int local127 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 - local111 >> 7;
		@Pc(149) boolean local149 = Static68.method1136(0, 0, local119, 0, 0, true, local127, 0, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
		if (!local149) {
			return;
		}
		Static69.aClass4_Sub10_Sub1_2.method600(local38);
		Static69.aClass4_Sub10_Sub1_2.method600(local31);
		Static69.aClass4_Sub10_Sub1_2.method575(Static60.anInt1576);
		Static69.aClass4_Sub10_Sub1_2.method600(57);
		Static69.aClass4_Sub10_Sub1_2.method600(Static14.anInt244);
		Static69.aClass4_Sub10_Sub1_2.method600(Static27.anInt2814);
		Static69.aClass4_Sub10_Sub1_2.method600(89);
		Static69.aClass4_Sub10_Sub1_2.method575(Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393);
		Static69.aClass4_Sub10_Sub1_2.method575(Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416);
		Static69.aClass4_Sub10_Sub1_2.method600(Static95.anInt2209);
		Static69.aClass4_Sub10_Sub1_2.method600(63);
		return;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)V")
	public static void method837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static10.anInt206 < 2 && Static39.anInt1125 == 0 && !Static18.aBoolean21) {
			return;
		}
		@Pc(46) Class76 local46;
		if (Static39.anInt1125 == 1 && Static10.anInt206 < 2) {
			local46 = Static59.method1017(new Class76[] { Static73.aClass76_814, Static10.aClass76_94, Static49.aClass76_557, Static111.aClass76_1150 });
		} else if (Static18.aBoolean21 && Static10.anInt206 < 2) {
			local46 = Static59.method1017(new Class76[] { Static102.aClass76_1086, Static10.aClass76_94, Static117.aClass76_1203, Static111.aClass76_1150 });
		} else {
			local46 = Static34.method616(Static10.anInt206 - 1);
		}
		if (Static10.anInt206 > 2) {
			local46 = Static59.method1017(new Class76[] { local46, Static23.aClass76_203, Static63.method1092(Static10.anInt206 - 2), Static51.aClass76_919 });
		}
		Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1316(local46, arg0 + 4, arg1 + 15, Static78.anInt1981 / 1000);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BILclient!la;I)Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4 method838(@OriginalArg(1) int arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) int arg2) {
		return Static1.method3(arg2, arg0, arg1) ? Static21.method323() : null;
	}
}
