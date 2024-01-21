import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
	public static int anInt1424;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "Lclient!va;")
	private static Class61 aClass61_585 = Static88.method1421("Unexpected server response: ");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_578 = aClass61_585;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public static int anInt1409 = 0;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "Lclient!va;")
	private static Class61 aClass61_586 = Static88.method1421("cyan:");

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Lclient!va;")
	public static Class61 aClass61_579 = aClass61_586;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	public static int anInt1410 = 1;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[104][104];

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!va;")
	private static Class61 aClass61_580 = Static88.method1421("Invalid username or password)3");

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!va;")
	private static Class61 aClass61_581 = Static88.method1421("wishes to duel with you)3");

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Lclient!va;")
	public static Class61 aClass61_582 = aClass61_581;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "Lclient!va;")
	private static Class61 aClass61_591 = Static88.method1421("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!va;")
	public static Class61 aClass61_583 = aClass61_591;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
	public static int anInt1412 = 0;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!va;")
	private static Class61 aClass61_584 = Static88.method1421("From");

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "Lclient!va;")
	private static Class61 aClass61_590 = Static88.method1421("Classic");

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "Lclient!va;")
	public static Class61 aClass61_587 = aClass61_590;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "Lclient!va;")
	public static Class61 aClass61_588 = aClass61_580;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
	public static int anInt1414 = 0;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "Lclient!va;")
	public static Class61 aClass61_589 = aClass61_584;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
	public static int anInt1419 = 255;

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
	public static volatile int anInt1420 = 0;

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "[I")
	public static int[] anIntArray154 = new int[100];

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
	public static int anInt1421 = 0;

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
	public static int anInt1423 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method785() {
		anIntArrayArray12 = null;
		aClass61_584 = null;
		aClass61_583 = null;
		aClass61_580 = null;
		anIntArrayArrayArray3 = null;
		aClass61_589 = null;
		aClass61_587 = null;
		aClass61_591 = null;
		aClass61_581 = null;
		aClass61_582 = null;
		aClass61_588 = null;
		aBooleanArray5 = null;
		anIntArray154 = null;
		aClass61_578 = null;
		aClass61_590 = null;
		aClass61_586 = null;
		aClass61_579 = null;
		aClass61_585 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
	public static void method786(@OriginalArg(1) int arg0) {
		if (!Static25.method491(arg0)) {
			return;
		}
		@Pc(19) Class10_Sub1_Sub4[] local19 = Static104.aClass10_Sub1_Sub4ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class10_Sub1_Sub4 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt556 = 0;
				local27.anInt571 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!he;Lclient!he;I)V")
	public static void method787(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		Static9.aClass11_9 = arg1;
		Static10.aClass11_10 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIBII)V")
	public static void method788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static25.aClass10_Sub1_Sub1_Sub2Array2[0].method873(arg4, arg0);
		Static25.aClass10_Sub1_Sub1_Sub2Array2[1].method873(arg4, arg0 + arg2 - 16);
		Static45.method1531(arg4, arg0 + 16, 16, arg2 - 32, Static55.anInt1490);
		@Pc(37) int local37 = (arg2 - 32) * arg2 / arg1;
		if (local37 < 8) {
			local37 = 8;
		}
		@Pc(58) int local58 = (arg2 - local37 - 32) * arg3 / (arg1 - arg2);
		Static45.method1531(arg4, arg0 + local58 + 16, 16, local37, Static101.anInt2591);
		Static45.method1535(arg4, local58 + arg0 + 16, local37, Static34.anInt1013);
		Static45.method1535(arg4 + 1, local58 + 16 + arg0, local37, Static34.anInt1013);
		Static45.method1527(arg4, arg0 + local58 + 16, 16, Static34.anInt1013);
		Static45.method1527(arg4, arg0 + local58 + 17, 16, Static34.anInt1013);
		Static45.method1535(arg4 + 15, local58 + 16 + arg0, local37, Static78.anInt2128);
		Static45.method1535(arg4 + 14, arg0 + 17 - -local58, local37 - 1, Static78.anInt2128);
		Static45.method1527(arg4, local37 + arg0 + local58 + 15, 16, Static78.anInt2128);
		Static45.method1527(arg4 + 1, local37 + local58 + arg0 + 14, 15, Static78.anInt2128);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lclient!qd;")
	public static Class10_Sub1_Sub14 method789(@OriginalArg(0) int arg0) {
		@Pc(15) Class10_Sub1_Sub14 local15 = (Class10_Sub1_Sub14) Static28.aClass29_22.method644((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static105.aClass11_63.method203(13, arg0);
		local15 = new Class10_Sub1_Sub14();
		local15.anInt2187 = arg0;
		if (local25 != null) {
			local15.method1275(new Class10_Sub10(local25));
		}
		Static28.aClass29_22.method649(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method790() {
		Static57.aClass7_1.method242();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static30.aLongArray3[local6] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static61.aLongArray5[local22] = 0L;
		}
		Static48.anInt1335 = 0;
	}
}
