import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
	public static int anInt1250;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!db;")
	public static Class19 aClass19_8 = new Class19();

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "Lclient!kh;")
	public static Class60 aClass60_396 = Static200.method3116("headicons_prayer");

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "J")
	public static long aLong42 = 0L;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	public static int anInt1249 = 0;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)Lclient!nf;")
	public static Class1_Sub1_Sub17 method967(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub17 local10 = (Class1_Sub1_Sub17) Static100.aClass39_13.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static196.aClass7_36.method3242(5, arg0);
		local10 = new Class1_Sub1_Sub17();
		if (local25 != null) {
			local10.method2211(new Class1_Sub9(local25));
		}
		Static100.aClass39_13.method1152((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public static void method969() {
		Static183.aClass26_1.method3055();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static171.aLongArray8[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static114.aLongArray6[local24] = 0L;
		}
		Static6.anInt162 = 0;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
	public static void method970() {
		Static152.aClass39_17.method1158();
		Static188.aClass27_106.method963();
		Static172.aClass27_100.method963();
	}
}
