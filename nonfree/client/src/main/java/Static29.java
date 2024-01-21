import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!pd;")
	public static Class20 aClass20_18;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_3;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!ja;")
	public static Class39 aClass39_405 = Static28.method504("Stufe)2");

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
	public static int[] anIntArray85 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_406 = Static28.method504("nav");

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!ja;")
	private static Class39 aClass39_407 = Static28.method504("Unable to find ");

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static int anInt762 = 0;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!c;")
	public static Class12 aClass12_20 = new Class12(128);

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_408 = Static28.method504("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_409 = aClass39_407;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_410 = Static28.method504("(U1");

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method508() {
		aClass39_405 = null;
		aClass39_407 = null;
		aClass39_409 = null;
		aClass39_408 = null;
		anIntArray85 = null;
		aClass20_Sub1_3 = null;
		aClass12_20 = null;
		aClass20_18 = null;
		aClass39_410 = null;
		aClass39_406 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([BLclient!u;II)V")
	public static void method509(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class4_Sub23 local3 = new Class4_Sub23();
		local3.aClass75_4 = arg1;
		local3.aByteArray34 = arg0;
		local3.anInt3043 = 0;
		local3.aLong155 = arg2;
		@Pc(30) Class61 local30 = Static33.aClass61_5;
		synchronized (Static33.aClass61_5) {
			Static33.aClass61_5.method1635(local3);
		}
		Static13.method231();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)Lclient!ja;")
	public static Class39 method510(@OriginalArg(1) int arg0) {
		return Static40.method669(arg0, false);
	}
}
