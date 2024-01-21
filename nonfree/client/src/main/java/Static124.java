import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "Lclient!ad;")
	public static Class1_Sub3_Sub1_Sub1 aClass1_Sub3_Sub1_Sub1_4;

	@OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
	public static int anInt3187;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "[Lclient!af;")
	public static Class5[] aClass5Array24 = new Class5[500];

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "Lclient!af;")
	private static Class5 aClass5_1405 = Static45.method1937("flash1:");

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "Lclient!af;")
	public static Class5 aClass5_1400 = aClass5_1405;

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "Lclient!af;")
	private static Class5 aClass5_1402 = Static45.method1937("Existing User");

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "Lclient!af;")
	public static Class5 aClass5_1401 = aClass5_1402;

	@OriginalMember(owner = "client!vc", name = "M", descriptor = "Lclient!af;")
	public static Class5 aClass5_1403 = aClass5_1405;

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "[I")
	public static int[] anIntArray454 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!vc", name = "U", descriptor = "Lclient!af;")
	public static Class5 aClass5_1404 = Static45.method1937("lila:");

	@OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
	public static int anInt3182 = 0;

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "[S")
	public static short[] aShortArray14 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "[I")
	public static int[] anIntArray455 = new int[500];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lclient!ve;")
	public static Class1_Sub3_Sub17 method2202(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub3_Sub17 local6 = (Class1_Sub3_Sub17) Static18.aClass28_80.method796((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static52.aClass41_5.method1710(16, arg0);
		local6 = new Class1_Sub3_Sub17();
		if (local20 != null) {
			local6.method2239(new Class1_Sub20(local20));
		}
		Static18.aClass28_80.method789(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!of;I)Lclient!of;")
	public static Class1_Sub17 method2203(@OriginalArg(0) Class1_Sub17 arg0) {
		@Pc(3) Class1_Sub17 local3 = Static23.method535(arg0);
		if (local3 == null) {
			local3 = arg0.aClass1_Sub17_58;
		}
		return local3;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!cd;I)V")
	public static void method2204(@OriginalArg(0) Class1_Sub3_Sub4_Sub2 arg0) {
		arg0.anInt3035 = 0;
		if (arg0.anInt3069 == 0) {
			arg0.anInt3080 = 1024;
		}
		if (arg0.anInt3069 == 1) {
			arg0.anInt3080 = 1536;
		}
		if (arg0.anInt3069 == 2) {
			arg0.anInt3080 = 0;
		}
		@Pc(37) int local37 = arg0.anInt3072 - Static131.anInt3270;
		if (arg0.anInt3069 == 3) {
			arg0.anInt3080 = 512;
		}
		@Pc(59) int local59 = arg0.anInt3063 * 64 + arg0.anInt3090 * 128;
		arg0.anInt3079 += (local59 - arg0.anInt3079) / local37;
		@Pc(82) int local82 = arg0.anInt3071 * 128 + arg0.anInt3063 * 64;
		arg0.anInt3089 += (local82 - arg0.anInt3089) / local37;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLclient!va;I)V")
	public static void method2205(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class78 arg1) {
		if (Static1.aClass78_1 != null) {
			try {
				Static1.aClass78_1.method2176();
			} catch (@Pc(8) Exception local8) {
			}
			Static1.aClass78_1 = null;
		}
		Static1.aClass78_1 = arg1;
		Static51.method896(arg0);
		Static97.anInt2389 = 0;
		Static100.aClass1_Sub20_5 = null;
		Static51.aClass1_Sub3_Sub15_1 = null;
		Static58.aClass1_Sub20_4.anInt2951 = 0;
		while (true) {
			@Pc(35) Class1_Sub3_Sub15 local35 = (Class1_Sub3_Sub15) Static9.aClass7_1.method288();
			if (local35 == null) {
				while (true) {
					local35 = (Class1_Sub3_Sub15) Static21.aClass7_2.method288();
					if (local35 == null) {
						if (Static121.aByte8 != 0) {
							try {
								@Pc(89) Class1_Sub20 local89 = new Class1_Sub20(4);
								local89.method2081(4);
								local89.method2081(Static121.aByte8);
								local89.method2055(0);
								Static1.aClass78_1.method2182(4, local89.aByteArray36);
							} catch (@Pc(110) IOException local110) {
								try {
									Static1.aClass78_1.method2176();
								} catch (@Pc(115) Exception local115) {
								}
								Static120.anInt1835++;
								Static1.aClass78_1 = null;
							}
						}
						Static38.anInt976 = 0;
						Static84.aLong65 = Static52.method906();
						return;
					}
					Static6.aClass17_1.method609(local35);
					Static95.aClass7_10.method291(local35, local35.aLong95);
					Static74.anInt1720++;
					Static90.anInt2229--;
				}
			}
			Static78.aClass7_9.method291(local35, local35.aLong95);
			Static56.anInt1347++;
			Static1.anInt50--;
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	public static void method2207() {
		aClass5_1401 = null;
		aClass5_1400 = null;
		aClass5_1402 = null;
		aShortArray14 = null;
		anIntArray454 = null;
		aClass1_Sub3_Sub1_Sub1_4 = null;
		aClass5_1405 = null;
		aClass5Array24 = null;
		aClass5_1403 = null;
		anIntArray455 = null;
		aClass5_1404 = null;
	}
}
