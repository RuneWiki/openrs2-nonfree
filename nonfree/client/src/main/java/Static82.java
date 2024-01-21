import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Lclient!ra;")
	public static Class54 aClass54_3;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_14;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1294 = Static15.method178("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public static int anInt2312 = 0;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1295 = Static15.method178("Private chat");

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1300 = Static15.method178("cyan:");

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1296 = aClass23_1300;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public static int anInt2314 = 0;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Lclient!oe;")
	public static Class45 aClass45_7 = new Class45();

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1297 = Static15.method178("b12_full");

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1298 = aClass23_1295;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public static int anInt2315 = 0;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1299 = Static15.method178("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1301 = Static15.method178("Please try again)3");

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1302 = aClass23_1301;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J")
	public static synchronized long method1454() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static75.aLong60) {
			Static94.aLong69 += Static75.aLong60 - local5;
		}
		Static75.aLong60 = local5;
		return local5 + Static94.aLong69;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BILclient!nd;)V")
	public static void method1455(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class41 arg2) {
		@Pc(7) Class1_Sub7 local7 = new Class1_Sub7();
		local7.aByteArray8 = arg1;
		local7.anInt1483 = 0;
		local7.aClass41_1 = arg2;
		local7.aLong85 = arg0;
		@Pc(22) Class45 local22 = Static48.aClass45_4;
		synchronized (Static48.aClass45_4) {
			Static48.aClass45_4.method1295(local7);
		}
		Static61.method1199();
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public static void method1456() {
		aClass23_1296 = null;
		aClass23_1300 = null;
		aClass23_1297 = null;
		aClass54_3 = null;
		aClass45_7 = null;
		aClass55_Sub1_14 = null;
		aClass23_1299 = null;
		aClass23_1302 = null;
		aClass23_1294 = null;
		aClass23_1298 = null;
		aClass23_1301 = null;
		aClass23_1295 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!gd;Lclient!gd;III)V")
	public static void method1457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) Class23 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static40.anInt1400 >= 500) {
			return;
		}
		if (arg2.method525() > 0) {
			Static109.aClass23Array18[Static40.anInt1400] = Static17.method233(new Class23[] { arg3, Static27.aClass23_472, arg2 });
		} else {
			Static109.aClass23Array18[Static40.anInt1400] = arg3;
		}
		Static34.anIntArray142[Static40.anInt1400] = arg4;
		Static14.anIntArray48[Static40.anInt1400] = arg5;
		Static90.anIntArray327[Static40.anInt1400] = arg0;
		Static18.anIntArray66[Static40.anInt1400] = arg1;
		Static40.anInt1400++;
	}
}
