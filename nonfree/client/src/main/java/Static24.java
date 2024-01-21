import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "[I")
	public static int[] anIntArray247;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
	public static int anInt1900;

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "[Lclient!of;")
	public static Class8_Sub17[] aClass8_Sub17Array2;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!ic;")
	private static Class34 aClass34_857 = Static56.method816("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!ic;")
	public static Class34 aClass34_858 = Static56.method816("::");

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!ic;")
	public static Class34 aClass34_859 = aClass34_857;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Lclient!pc;")
	public static Applet_Sub1 anApplet_Sub1_2 = null;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "J")
	public static long aLong64 = 0L;

	@OriginalMember(owner = "client!dd", name = "ab", descriptor = "Lclient!ic;")
	private static Class34 aClass34_862 = Static56.method816("Click to switch");

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_860 = aClass34_862;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "Lclient!ic;")
	public static Class34 aClass34_861 = Static56.method816("swe");

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "[I")
	public static int[] anIntArray250 = new int[4000];

	@OriginalMember(owner = "client!dd", name = "bb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][105][105];

	@OriginalMember(owner = "client!dd", name = "db", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[100];

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Lclient!gd;")
	public static Class8_Sub1_Sub10 method1147(@OriginalArg(0) int arg0) {
		@Pc(10) Class8_Sub1_Sub10 local10 = (Class8_Sub1_Sub10) Static29.aClass48_18.method1100((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static36.aClass14_12.method1156(arg0, 4);
		local10 = new Class8_Sub1_Sub10();
		if (local20 != null) {
			local10.method673(new Class8_Sub20(local20), arg0);
		}
		local10.method675();
		Static29.aClass48_18.method1097(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZII)I")
	public static int method1152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class8_Sub22 local10 = (Class8_Sub22) Static64.aClass7_14.method45((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray396.length) {
			return local10.anIntArray396[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public static void method1155() {
		aClass34_860 = null;
		anIntArrayArrayArray4 = null;
		aClass8_Sub17Array2 = null;
		aClass34_862 = null;
		aClass34_858 = null;
		anIntArray247 = null;
		aClass34_857 = null;
		aBooleanArray11 = null;
		aClass34_861 = null;
		anIntArray250 = null;
		aClass34_859 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
	public static void method1160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static133.anInt3069; local7++) {
			if (arg3 < Static2.anIntArray3[local7] + Static125.anIntArray395[local7] && Static125.anIntArray395[local7] < arg3 + arg2 && Static6.anIntArray12[local7] + Static38.anIntArray131[local7] > arg0 && arg1 + arg0 > Static38.anIntArray131[local7]) {
				aBooleanArray11[local7] = true;
			}
		}
	}
}
