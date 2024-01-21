import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!k", name = "F", descriptor = "Lclient!ke;")
	public static Class43 aClass43_21;

	@OriginalMember(owner = "client!k", name = "z", descriptor = "Lclient!sg;")
	private static Class77 aClass77_822 = Static146.method2172("Type");

	@OriginalMember(owner = "client!k", name = "C", descriptor = "Lclient!sg;")
	public static Class77 aClass77_823 = aClass77_822;

	@OriginalMember(owner = "client!k", name = "E", descriptor = "[I")
	public static int[] anIntArray351 = new int[50];

	@OriginalMember(owner = "client!k", name = "H", descriptor = "Lclient!ua;")
	public static Class82 aClass82_32 = new Class82(64);

	@OriginalMember(owner = "client!k", name = "O", descriptor = "Lclient!sg;")
	private static Class77 aClass77_825 = Static146.method2172("Your account is already logged in)3");

	@OriginalMember(owner = "client!k", name = "K", descriptor = "Lclient!sg;")
	public static Class77 aClass77_824 = aClass77_825;

	@OriginalMember(owner = "client!k", name = "L", descriptor = "I")
	public static int anInt2063 = 0;

	@OriginalMember(owner = "client!k", name = "M", descriptor = "B")
	public static byte aByte5 = 0;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "I")
	public static volatile int anInt2064 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)Z")
	public static boolean method1465(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
	public static void method1466() {
		for (@Pc(3) int local3 = -1; local3 < Static124.anInt3042; local3++) {
			@Pc(10) int local10;
			if (local3 == -1) {
				local10 = 2047;
			} else {
				local10 = Static177.anIntArray632[local3];
			}
			@Pc(20) Class2_Sub2_Sub1_Sub6_Sub1 local20 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local10];
			if (local20 != null) {
				Static168.method2809(local20, 1);
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
	public static void method1467() {
		aClass77_824 = null;
		aClass77_823 = null;
		anIntArray351 = null;
		aClass43_21 = null;
		aClass77_822 = null;
		aClass82_32 = null;
		aClass77_825 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method1468() {
		@Pc(12) boolean local12 = false;
		while (!local12) {
			local12 = true;
			for (@Pc(18) int local18 = 0; local18 < Static18.anInt618 - 1; local18++) {
				if (Static131.anIntArray616[local18] < 1000 && Static131.anIntArray616[local18 + 1] > 1000) {
					local12 = false;
					@Pc(40) Class77 local40 = Static136.aClass77Array20[local18];
					Static136.aClass77Array20[local18] = Static136.aClass77Array20[local18 + 1];
					Static136.aClass77Array20[local18 + 1] = local40;
					@Pc(58) Class77 local58 = Static56.aClass77Array10[local18];
					Static56.aClass77Array10[local18] = Static56.aClass77Array10[local18 + 1];
					Static56.aClass77Array10[local18 + 1] = local58;
					@Pc(76) int local76 = Static131.anIntArray616[local18];
					Static131.anIntArray616[local18] = Static131.anIntArray616[local18 + 1];
					Static131.anIntArray616[local18 + 1] = local76;
					@Pc(94) int local94 = Static107.anIntArray418[local18];
					Static107.anIntArray418[local18] = Static107.anIntArray418[local18 + 1];
					Static107.anIntArray418[local18 + 1] = local94;
					@Pc(112) int local112 = Static137.anIntArray496[local18];
					Static137.anIntArray496[local18] = Static137.anIntArray496[local18 + 1];
					Static137.anIntArray496[local18 + 1] = local112;
					@Pc(130) int local130 = Static20.anIntArray86[local18];
					Static20.anIntArray86[local18] = Static20.anIntArray86[local18 + 1];
					Static20.anIntArray86[local18 + 1] = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ke;Lclient!sg;Lclient!sg;I)Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 method1469(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class77 arg2) {
		@Pc(8) int local8 = arg0.method2206(arg1);
		@Pc(16) int local16 = arg0.method2215(local8, arg2);
		return Static175.method2949(arg0, local8, local16);
	}
}
