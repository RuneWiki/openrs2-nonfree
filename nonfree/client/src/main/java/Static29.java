import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!fa;")
	public static Class23 aClass23_2;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!kh;")
	public static Class29 aClass29_15;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!kh;")
	public static Class29 aClass29_16;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!cd;")
	private static Class10 aClass10_366 = Static51.method932("Members only world");

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_365 = aClass10_366;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "[I")
	public static int[] anIntArray63 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IILclient!fa;)Lclient!cd;")
	public static Class10 method614(@OriginalArg(1) int arg0, @OriginalArg(2) Class23 arg1) {
		if (!method618(arg0, Static126.method2068(arg1)) && arg1.anObjectArray25 == null) {
			return null;
		} else if (arg1.aClass10Array6 == null || arg1.aClass10Array6.length <= arg0 || arg1.aClass10Array6[arg0] == null || arg1.aClass10Array6[arg0].method336().method340() == 0) {
			return Static54.aBoolean55 ? Static3.method36(new Class10[] { Static20.aClass10_237, Static164.method2485(arg0) }) : null;
		} else {
			return arg1.aClass10Array6[arg0];
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)J")
	public static synchronized long method615() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < Static155.aLong118) {
			Static22.aLong20 += Static155.aLong118 - local1;
		}
		Static155.aLong118 = local1;
		return local1 + Static22.aLong20;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(JB)V")
	public static void method616(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method617() {
		aClass10_365 = null;
		aClass29_15 = null;
		aClass29_16 = null;
		anIntArray63 = null;
		aClass23_2 = null;
		aClass10_366 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
	public static boolean method618(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}
}
