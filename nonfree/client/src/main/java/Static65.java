import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt1844;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "[[Lclient!f;")
	public static Class4_Sub7[][] aClass4_Sub7ArrayArray1;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!ea;")
	public static Class20 aClass20_34;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt1845 = 0;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public static int anInt1848 = 0;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	public static int[] anIntArray187 = new int[2000];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!ec;")
	public static Class22 aClass22_491 = Static60.method1113("Fps:");

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!ec;")
	public static Class22 aClass22_492 = Static60.method1113("Titelbild geladen)3");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
	public static void method1150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg0; local7 <= arg2 + arg0; local7++) {
			for (@Pc(13) int local13 = arg1; local13 <= arg3 + arg1; local13++) {
				if (local13 >= 0 && local13 < 104 && local7 >= 0 && local7 < 104) {
					Static71.aByteArrayArrayArray3[0][local13][local7] = 127;
					if (arg1 == local13 && local13 > 0) {
						Static57.anIntArrayArrayArray4[0][local13][local7] = Static57.anIntArrayArrayArray4[0][local13 - 1][local7];
					}
					if (local13 == arg1 + arg3 && local13 < 103) {
						Static57.anIntArrayArrayArray4[0][local13][local7] = Static57.anIntArrayArrayArray4[0][local13 + 1][local7];
					}
					if (arg0 == local7 && local7 > 0) {
						Static57.anIntArrayArrayArray4[0][local13][local7] = Static57.anIntArrayArrayArray4[0][local13][local7 - 1];
					}
					if (local7 == arg0 + arg2 && local7 < 103) {
						Static57.anIntArrayArrayArray4[0][local13][local7] = Static57.anIntArrayArrayArray4[0][local13][local7 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Z")
	public static boolean method1151(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method1152() {
		Static85.anIntArrayArrayArray5 = new int[4][105][105];
		Static27.anIntArrayArray3 = new int[105][105];
		Static56.anIntArray157 = new int[104];
		Static29.anIntArray76 = new int[104];
		Static71.aByteArrayArrayArray3 = new byte[4][105][105];
		Static88.anIntArray270 = new int[104];
		Static128.anInt3046 = 99;
		Static120.anIntArray314 = new int[104];
		Static97.aByteArrayArrayArray5 = new byte[4][104][104];
		Static92.aByteArrayArrayArray4 = new byte[4][104][104];
		Static32.anIntArray92 = new int[104];
		Static112.aByteArrayArrayArray6 = new byte[4][104][104];
		Static112.aByteArrayArrayArray7 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!ec;ILclient!ec;)V")
	public static void method1153(@OriginalArg(1) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22 arg2) {
		Static79.method1433(arg2, arg1, arg0, null);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1154() {
		aClass22_491 = null;
		aClass22_492 = null;
		aClass20_34 = null;
		aClass4_Sub7ArrayArray1 = null;
		anIntArray187 = null;
	}
}
