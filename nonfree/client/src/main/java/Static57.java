import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!pc;")
	public static Class51 aClass51_3;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!je;")
	public static Class3_Sub1 aClass3_Sub1_6;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array19;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!ta;")
	public static Class14 aClass14_21;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt1494 = -1;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!kc;")
	private static Class36 aClass36_713 = Static14.method2017("Malformed login packet)3");

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!kc;")
	public static Class36 aClass36_709 = aClass36_713;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!kc;")
	private static Class36 aClass36_711 = Static14.method2017("green:");

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!kc;")
	public static Class36 aClass36_710 = aClass36_711;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!kc;")
	private static Class36 aClass36_712 = Static14.method2017(" from your ignore list first");

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public static int anInt1497 = 10;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!kc;")
	public static Class36 aClass36_714 = aClass36_712;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "I")
	public static int anInt1502 = 0;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "I")
	public static int anInt1504 = 0;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "[I")
	public static int[] anIntArray187 = new int[500];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)I")
	public static int method1049() {
		@Pc(9) int local9 = Static56.method1044(Static59.anInt1588, Static105.anInt2735, Static92.anInt2412);
		return local9 - Static111.anInt2875 >= 800 || (Static16.aByteArrayArrayArray3[Static92.anInt2412][Static105.anInt2735 >> 7][Static59.anInt1588 >> 7] & 0x4) == 0 ? 3 : Static92.anInt2412;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZILclient!bf;Lclient!je;)V")
	public static void method1050(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) Class3_Sub1 arg2) {
		@Pc(7) Class2_Sub5 local7 = new Class2_Sub5();
		local7.aLong89 = arg0;
		local7.aClass10_1 = arg1;
		local7.anInt814 = 1;
		local7.aClass3_Sub1_5 = arg2;
		@Pc(22) Class8 local22 = Static45.aClass8_3;
		synchronized (Static45.aClass8_3) {
			Static45.aClass8_3.method187(local7);
		}
		Static91.method1654();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method1051() {
		anIntArray187 = null;
		aClass36_712 = null;
		aClass51_3 = null;
		aClass36_711 = null;
		aClass36_710 = null;
		aClass2_Sub1_Sub1_Sub3Array19 = null;
		aClass14_21 = null;
		aClass36_713 = null;
		aClass36_714 = null;
		aClass36_709 = null;
		aClass3_Sub1_6 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lclient!ad;I[BBII)V")
	public static void method1052(@OriginalArg(0) int arg0, @OriginalArg(1) Class4[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (arg5 + local11 > 0 && arg5 + local11 < 103 && arg2 + local15 > 0 && arg2 + local15 < 103) {
						arg1[local7].anIntArrayArray3[local11 + arg5][arg2 + local15] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(87) Class2_Sub12 local87 = new Class2_Sub12(arg3);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					Static3.method938(arg0, arg2 + local102, local87, arg4, 0, arg5 + local98, local15);
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method1053() {
		for (@Pc(12) int local12 = 0; local12 < Static55.anInt2714; local12++) {
			@Pc(18) int local18 = Static115.anIntArray225[local12];
			@Pc(22) Class2_Sub1_Sub4_Sub2_Sub2 local22 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local18];
			@Pc(28) int local28 = Static92.aClass2_Sub12_Sub1_3.method1399();
			if ((local28 & 0x8) != 0) {
				local28 += Static92.aClass2_Sub12_Sub1_3.method1399() << 8;
			}
			Static77.method1466(local28, local22, local18);
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)I")
	public static int method1054() {
		return 19;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lclient!kc;")
	public static Class36 method1055(@OriginalArg(1) int arg0) {
		return Static73.method1291(arg0, false);
	}
}
