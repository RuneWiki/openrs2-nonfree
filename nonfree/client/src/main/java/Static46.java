import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!pe;")
	public static Class61 aClass61_4;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	public static int anInt2774;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Z")
	public static boolean aBoolean221 = false;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1323 = Static108.method1915("jolt");

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Z")
	public static boolean aBoolean222 = false;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "Lclient!jb;")
	public static Class33 aClass33_38 = new Class33(50);

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "Lclient!jb;")
	public static Class33 aClass33_39 = new Class33(64);

	@OriginalMember(owner = "client!ha", name = "S", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1327 = Static108.method1915("Enter amount:");

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1324 = aClass39_1327;

	@OriginalMember(owner = "client!ha", name = "O", descriptor = "[[I")
	public static int[][] anIntArrayArray26 = new int[104][104];

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1325 = Static108.method1915("Attack");

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
	public static int anInt2784 = 0;

	@OriginalMember(owner = "client!ha", name = "R", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1326 = Static108.method1915("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1328 = Static108.method1915("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1329 = Static108.method1915(":  ");

	@OriginalMember(owner = "client!ha", name = "W", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1331 = Static108.method1915("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!ha", name = "V", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1330 = aClass39_1331;

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1332 = aClass39_1328;

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1333 = Static108.method1915("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

	@OriginalMember(owner = "client!ha", name = "Z", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!ha", name = "ab", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1334 = aClass39_1326;

	@OriginalMember(owner = "client!ha", name = "bb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1335 = aClass39_1325;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method1921() {
		aClass33_39 = null;
		aClass61_4 = null;
		aClass39_1328 = null;
		aClass39_1324 = null;
		aClass39_1325 = null;
		aClass39_1333 = null;
		aClass33_38 = null;
		aClass39_1323 = null;
		aClass39_1327 = null;
		anIntArrayArray26 = null;
		aClass39_1332 = null;
		aClass39_1331 = null;
		aClass39_1334 = null;
		aClass39_1335 = null;
		aClass39_1326 = null;
		aClass39_1329 = null;
		aClass39_1330 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)I")
	public static int method1929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(10) int local10 = arg1;
			arg1 = arg0;
			arg0 = local10;
		}
		@Pc(18) int local18 = arg3 & 0x3;
		if (local18 == 0) {
			return arg5;
		} else if (local18 == 1) {
			return 7 + 1 - arg4 - arg1;
		} else if (local18 == 2) {
			return 1 + 7 - arg0 - arg5;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lclient!hb;")
	public static Class1_Sub1_Sub10 method1934(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub10 local10 = (Class1_Sub1_Sub10) Static70.aClass33_26.method1038((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static59.aClass62_18.method2008(arg0, 16);
		local10 = new Class1_Sub1_Sub10();
		if (local20 != null) {
			local10.method825(new Class1_Sub18(local20));
		}
		Static70.aClass33_26.method1042(local10, (long) arg0);
		return local10;
	}
}
