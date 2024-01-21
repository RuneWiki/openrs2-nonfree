import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Lclient!dd;")
	public static Class14 aClass14_2;

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "Lclient!dd;")
	public static Class14 aClass14_3;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
	public static int anInt359 = 0;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_204 = Static56.method816("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "Lclient!ic;")
	public static Class34 aClass34_205 = Static56.method816("rect_debug=");

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "[I")
	public static int[] anIntArray51 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
	public static int anInt364 = 0;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "Lclient!lf;")
	public static Class48 aClass48_10 = new Class48(200);

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "Lclient!ic;")
	public static Class34 aClass34_206 = Static56.method816("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "Lclient!ic;")
	public static Class34 aClass34_207 = Static56.method816("headicons_pk");

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
	public static int anInt366 = 0;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
	public static void method233() {
		aClass34_204 = null;
		aClass34_205 = null;
		aClass14_2 = null;
		aClass34_207 = null;
		aClass14_3 = null;
		aClass34_206 = null;
		aClass48_10 = null;
		anIntArray51 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lclient!eb;")
	public static Class8_Sub1_Sub7 method234(@OriginalArg(0) int arg0) {
		@Pc(6) Class8_Sub1_Sub7 local6 = (Class8_Sub1_Sub7) Static106.aClass48_48.method1100((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static20.aClass14_5.method1156(arg0, 3);
		local6 = new Class8_Sub1_Sub7();
		if (local20 != null) {
			local6.method515(new Class8_Sub20(local20));
		}
		Static106.aClass48_48.method1097(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)Lclient!da;")
	public static Class8_Sub1_Sub5 method235(@OriginalArg(1) int arg0) {
		@Pc(10) Class8_Sub1_Sub5 local10 = (Class8_Sub1_Sub5) Static113.aClass48_52.method1100((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static106.aClass14_25.method1156(arg0, 13);
		local10 = new Class8_Sub1_Sub5();
		local10.anInt647 = arg0;
		if (local20 != null) {
			local10.method386(new Class8_Sub20(local20));
		}
		Static113.aClass48_52.method1097(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
	public static int method236() {
		@Pc(16) int local16 = Static123.method1945(Static13.anInt345, Static42.anInt1024, Static48.anInt2951);
		return local16 - Static113.anInt2579 >= 800 || (Static105.aByteArrayArrayArray5[Static42.anInt1024][Static48.anInt2951 >> 7][Static13.anInt345 >> 7] & 0x4) == 0 ? 3 : Static42.anInt1024;
	}
}
