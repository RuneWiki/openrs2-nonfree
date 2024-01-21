import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public static int anInt1922;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!kd;")
	public static Class1_Sub2_Sub2_Sub2_Sub2 aClass1_Sub2_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!ld;")
	public static Class47 aClass47_15 = new Class47(5);

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!dd;")
	private static Class13 aClass13_651 = Static161.method2971("shake:");

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!dd;")
	public static Class13 aClass13_648 = aClass13_651;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_649 = aClass13_651;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_650 = Static161.method2971("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!th;")
	public static Class82 aClass82_5 = new Class82();

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "[S")
	public static short[] aShortArray19 = new short[] { 32, 26, 39, 50, 24, 29, 20, 47 };

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "[I")
	public static int[] anIntArray198 = new int[128];

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "Lclient!dd;")
	private static Class13 aClass13_652 = Static161.method2971("The server is being updated)3");

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Lclient!dd;")
	public static Class13 aClass13_653 = aClass13_652;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!dd;")
	public static Class13 aClass13_654 = Static161.method2971(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray26 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_655 = Static161.method2971("::clientdrop");

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
	public static int anInt1926 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIIIII)V")
	public static void method1434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg4 & 0x7FF;
		@Pc(12) int local12 = 0;
		@Pc(19) int local19 = 2048 - arg3 & 0x7FF;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg5;
		@Pc(33) int local33;
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (local19 != 0) {
			local29 = Class1_Sub2_Sub1_Sub2.anIntArray38[local19];
			local33 = Class1_Sub2_Sub1_Sub2.anIntArray41[local19];
			local44 = local29 * 0 - local33 * arg5 >> 16;
			local23 = arg5 * local29 + local33 * 0 >> 16;
			local21 = local44;
		}
		if (local10 != 0) {
			local29 = Class1_Sub2_Sub1_Sub2.anIntArray38[local10];
			local33 = Class1_Sub2_Sub1_Sub2.anIntArray41[local10];
			local44 = local29 * 0 + local33 * local23 >> 16;
			local23 = local23 * local29 - local33 * 0 >> 16;
			local12 = local44;
		}
		Static7.anInt3157 = arg2 - local23;
		Static49.anInt1557 = arg4;
		Static104.anInt2874 = arg3;
		Static22.anInt2236 = arg1 - local12;
		Static45.anInt1493 = arg0 - local21;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1435(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static33.anInt1154 > 0) {
			local18 = Static61.aByteArrayArray4[--Static33.anInt1154];
			Static61.aByteArrayArray4[Static33.anInt1154] = null;
			return local18;
		} else if (arg0 == 5000 && Static113.anInt3058 > 0) {
			local18 = Static86.aByteArrayArray6[--Static113.anInt3058];
			Static86.aByteArrayArray6[Static113.anInt3058] = null;
			return local18;
		} else if (arg0 == 30000 && Static95.anInt2766 > 0) {
			local18 = Static37.aByteArrayArray3[--Static95.anInt2766];
			Static37.aByteArrayArray3[Static95.anInt2766] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method1436() {
		aClass13_654 = null;
		aClass82_5 = null;
		aClass13_652 = null;
		aClass13_650 = null;
		aClass1_Sub2_Sub2_Sub2_Sub2_1 = null;
		aClass13_651 = null;
		aClass13_649 = null;
		aShortArray19 = null;
		anIntArray198 = null;
		aClass13_648 = null;
		aClass13_655 = null;
		aClass13_653 = null;
		aClass47_15 = null;
		aBooleanArray26 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
	public static int method1437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}
}
