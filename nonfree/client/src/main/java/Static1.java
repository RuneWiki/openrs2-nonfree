import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "fb", descriptor = "I")
	public static int anInt4460;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2591 = Static118.method2249("Jan");

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2592 = Static118.method2249("Dec");

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2593 = Static118.method2249("Jun");

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2594 = Static118.method2249("Nov");

	@OriginalMember(owner = "client!a", name = "w", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2595 = Static118.method2249("Mar");

	@OriginalMember(owner = "client!a", name = "y", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2596 = Static118.method2249("Apr");

	@OriginalMember(owner = "client!a", name = "A", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2597 = Static118.method2249("Sep");

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2598 = Static118.method2249("Oct");

	@OriginalMember(owner = "client!a", name = "R", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2600 = Static118.method2249("Feb");

	@OriginalMember(owner = "client!a", name = "W", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2602 = Static118.method2249("May");

	@OriginalMember(owner = "client!a", name = "J", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2599 = Static118.method2249("Jul");

	@OriginalMember(owner = "client!a", name = "U", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2601 = Static118.method2249("Aug");

	@OriginalMember(owner = "client!a", name = "H", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array68 = new Class65[] { aClass65_2591, aClass65_2600, aClass65_2595, aClass65_2596, aClass65_2602, aClass65_2593, aClass65_2599, aClass65_2601, aClass65_2597, aClass65_2598, aClass65_2594, aClass65_2592 };

	@OriginalMember(owner = "client!a", name = "X", descriptor = "Lclient!k;")
	public static final Class1_Sub14_Sub1 aClass1_Sub14_Sub1_43 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
	public static int anInt4459 = 1;

	@OriginalMember(owner = "client!a", name = "db", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2606 = Static118.method2249("World");

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2603 = aClass65_2606;

	@OriginalMember(owner = "client!a", name = "ab", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2604 = aClass65_2606;

	@OriginalMember(owner = "client!a", name = "bb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2605 = Static118.method2249(")4slr2)3ws?order=LPWM");

	@OriginalMember(owner = "client!a", name = "cb", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_75 = new Class87(100);

	@OriginalMember(owner = "client!a", name = "eb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2607 = Static118.method2249("Hidden)2use");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!wa;IIIIIII)V")
	public static void method3300(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(20) int local20;
		if (arg1 < 0 || arg1 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local20 = arg0.method1738();
				if (local20 == 0) {
					break;
				}
				if (local20 == 1) {
					arg0.method1738();
					break;
				}
				if (local20 <= 49) {
					arg0.method1738();
				}
			}
			return;
		}
		Static106.aByteArrayArrayArray67[arg4][arg1][arg6] = 0;
		while (true) {
			local20 = arg0.method1738();
			if (local20 == 0) {
				if (arg4 == 0) {
					Static89.anIntArrayArrayArray3[0][arg1][arg6] = -Static128.method2422(arg5 + arg1 + 932731, arg6 - -arg2 + 556238) * 8;
				} else {
					Static89.anIntArrayArrayArray3[arg4][arg1][arg6] = Static89.anIntArrayArrayArray3[arg4 - 1][arg1][arg6] - 240;
				}
				break;
			}
			if (local20 == 1) {
				@Pc(115) int local115 = arg0.method1738();
				if (local115 == 1) {
					local115 = 0;
				}
				if (arg4 == 0) {
					Static89.anIntArrayArrayArray3[0][arg1][arg6] = -local115 * 8;
				} else {
					Static89.anIntArrayArrayArray3[arg4][arg1][arg6] = Static89.anIntArrayArrayArray3[arg4 - 1][arg1][arg6] - local115 * 8;
				}
				break;
			}
			if (local20 <= 49) {
				Static173.aByteArrayArrayArray104[arg4][arg1][arg6] = arg0.method1720();
				Static162.aByteArrayArrayArray98[arg4][arg1][arg6] = (byte) ((local20 - 2) / 4);
				Static82.aByteArrayArrayArray51[arg4][arg1][arg6] = (byte) (local20 + arg3 - 2 & 0x3);
			} else if (local20 <= 81) {
				Static106.aByteArrayArrayArray67[arg4][arg1][arg6] = (byte) (local20 - 49);
			} else {
				Static71.aByteArrayArrayArray40[arg4][arg1][arg6] = (byte) (local20 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public static void method3302() {
		Static63.aClass1_Sub6_Sub2_1.method2048();
		Static62.aClass60_14 = null;
		Static191.anInt4167 = 1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!sd;)Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3 method3305(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1) {
		return Static68.method987(arg0, arg1) ? Static181.method3054() : null;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	public static void method3314() {
		Static16.aBoolean20 = true;
		Static13.aBoolean36 = true;
	}
}
