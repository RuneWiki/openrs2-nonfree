import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_6;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_7;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
	public static int anInt824;

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "Lclient!p;")
	public static Class45 aClass45_16;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public static int anInt816 = 0;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "[I")
	public static int[] anIntArray159 = new int[5];

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "[I")
	public static int[] anIntArray160 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Lclient!o;")
	public static Class40 aClass40_252 = Static13.method257("Click to continue");

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "[I")
	public static int[] anIntArray161 = new int[500];

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "Lclient!o;")
	public static Class40 aClass40_253 = Static13.method257("null");

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "Lclient!o;")
	public static Class40 aClass40_254 = Static13.method257("You last logged in @red@");

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "Lclient!o;")
	public static Class40 aClass40_255 = Static13.method257("Dec");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public static void method632(@OriginalArg(1) int arg0) {
		if (Static106.aClass12_1 == null) {
			return;
		}
		if (Static18.anInt432 != 0) {
			if (Static24.aByteArray9 == null) {
				return;
			}
			Static27.anInt685 = arg0;
		} else if (Static61.anInt1548 >= 0) {
			Static61.anInt1548 = arg0;
			Static106.aClass12_1.method1244(0, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public static void method633() {
		Static74.aByteArrayArrayArray8 = new byte[4][104][104];
		Static75.aByteArrayArrayArray9 = new byte[4][104][104];
		Static20.anIntArray91 = new int[104];
		Static85.anIntArray434 = new int[104];
		Static15.aByteArrayArrayArray10 = new byte[4][104][104];
		Static37.aByteArrayArrayArray4 = new byte[4][104][104];
		Static46.anIntArray543 = new int[104];
		Static60.aByteArrayArrayArray6 = new byte[4][105][105];
		Static25.anIntArray126 = new int[104];
		Static32.anIntArrayArrayArray3 = new int[4][105][105];
		Static10.anIntArrayArray5 = new int[105][105];
		Static34.anInt807 = 99;
		Static83.anIntArray428 = new int[104];
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)Z")
	public static boolean method634(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static54.anIntArray287[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 51;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
	public static void method635() {
		aClass5_Sub1_6 = null;
		aClass40_252 = null;
		aClass40_255 = null;
		anIntArray161 = null;
		aClass5_Sub1_7 = null;
		anIntArray159 = null;
		anIntArray160 = null;
		aClass40_254 = null;
		aLongArray3 = null;
		aClass40_253 = null;
		aClass45_16 = null;
	}
}
