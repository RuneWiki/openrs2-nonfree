import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray43;

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "Lclient!ag;")
	public static Class4 aClass4_98;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_53;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "Lclient!ag;")
	public static Class4 aClass4_99;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "[[[Lclient!fc;")
	public static Class1_Sub10[][][] aClass1_Sub10ArrayArrayArray35;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "[I")
	public static int[] anIntArray428 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	public static int anInt3826 = 0;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1315 = Static161.method2971("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1314 = aClass13_1315;

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1316 = Static161.method2971("::");

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1317 = Static161.method2971("Existing User");

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "[Z")
	public static boolean[] aBooleanArray52 = new boolean[100];

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1318 = Static161.method2971("<br>");

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1319 = aClass13_1317;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	public static void method2788() {
		aClass4_98 = null;
		aClass13_1315 = null;
		aClass13_1316 = null;
		aClass13_1318 = null;
		aByteArrayArrayArray43 = null;
		aClass13_1317 = null;
		aClass4_99 = null;
		aClass1_Sub10ArrayArrayArray35 = null;
		aBooleanArray52 = null;
		aClass13_1319 = null;
		anIntArray428 = null;
		aClass13_1314 = null;
		aClass4_Sub1_53 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	public static void method2790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass7_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public static void method2791() {
		Static35.aClass47_8.method1995();
		Static102.aClass47_21.method1995();
		Static40.aClass47_10.method1995();
	}
}
