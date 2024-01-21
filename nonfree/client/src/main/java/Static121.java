import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
	public static int anInt3318;

	@OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1112 = Static49.method1293("glow2:");

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1111 = aClass70_1112;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Lclient!ig;")
	public static Class39 aClass39_36 = null;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Lclient!pb;")
	public static Class63 aClass63_1 = new Class63();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1113 = aClass70_1112;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "Lclient!ge;")
	public static Class30 aClass30_11 = new Class30(4096);

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1116 = Static49.method1293("cyan:");

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1114 = aClass70_1116;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1115 = aClass70_1116;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!fa;)V")
	public static void method2466(@OriginalArg(1) Class1_Sub9 arg0) {
		if (Static25.aClass66_4 != null) {
			try {
				Static25.aClass66_4.method2662(0L);
				Static25.aClass66_4.method2654(arg0.aByteArray25, arg0.anInt1592, 24);
			} catch (@Pc(15) Exception local15) {
			}
		}
		arg0.anInt1592 += 24;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method2472() {
		aClass39_36 = null;
		aClass70_1113 = null;
		anIntArray321 = null;
		aClass30_11 = null;
		aClass70_1115 = null;
		aClass70_1111 = null;
		aClass70_1114 = null;
		aClass70_1112 = null;
		aClass70_1116 = null;
		aClass63_1 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!ke;")
	public static Class1_Sub1_Sub12 method2473(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub12 local10 = (Class1_Sub1_Sub12) Static164.aClass25_23.method1302((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static45.aClass76_42.method3316(arg0, 14);
		local10 = new Class1_Sub1_Sub12();
		if (local20 != null) {
			local10.method2010(new Class1_Sub9(local20));
		}
		Static164.aClass25_23.method1299(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)I")
	public static int method2476(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local10 += 8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return local10 + arg0;
	}
}
