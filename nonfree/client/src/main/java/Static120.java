import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1126 = Static119.method1462("va");

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!bc;")
	public static Class8 aClass8_58 = new Class8(50);

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1127 = Static119.method1462("Versteckt");

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
	public static int anInt2599 = 0;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1128 = Static119.method1462("T");

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "[S")
	public static short[] aShortArray34 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1130 = Static119.method1462("Loading sprites )2 ");

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1129 = aClass65_1130;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "[I")
	public static int[] anIntArray341 = new int[2000];

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "[Lclient!pe;")
	public static Class65[] aClass65Array69 = new Class65[100];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public static void method1868(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class2_Sub24 local8 = (Class2_Sub24) Static82.aClass40_22.method854(); local8 != null; local8 = (Class2_Sub24) Static82.aClass40_22.method852()) {
			if ((local8.aLong100 >> 48 & 0xFFFFL) == (long) arg0) {
				local8.method2053();
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method1869() {
		if (Static96.aClass43_1 != null) {
			@Pc(3) Class43 local3 = Static96.aClass43_1;
			synchronized (Static96.aClass43_1) {
				Static96.aClass43_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method1870() {
		Static65.aBoolean56 = true;
		Static48.aBoolean47 = true;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Lclient!pe;")
	public static Class65 method1871(@OriginalArg(0) int arg0) {
		return Static67.method1212(arg0, false);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	public static void method1872() {
		aClass65_1126 = null;
		aClass8_58 = null;
		aClass65_1130 = null;
		aClass65_1129 = null;
		aClass65Array69 = null;
		aClass65_1127 = null;
		aClass65_1128 = null;
		anIntArray341 = null;
		aShortArray34 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!na;Lclient!na;ILclient!na;Lclient!na;)V")
	public static void method1873(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(3) Class56 arg2, @OriginalArg(4) Class56 arg3) {
		Static23.aClass56_27 = arg1;
		Static17.aClass56_9 = arg0;
		Static89.aClass56_29 = arg2;
		Static13.aClass56_37 = arg3;
		Static95.aClass2_Sub22ArrayArray1 = new Class2_Sub22[Static89.aClass56_29.method1681()][];
		Static38.aBooleanArray7 = new boolean[Static89.aClass56_29.method1681()];
	}
}
