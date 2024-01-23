import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "Lclient!nm;")
	public static Class119 aClass119_95;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray21;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "Lclient!ui;")
	public static Class175 aClass175_45 = new Class175(64);

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "[I")
	public static int[] anIntArray611 = new int[] { 6, 0, 0, 0, 0, 0, 0, 14, 0, 7, 2, 0, 0, 15, 0, 0, -2, 10, 0, 0, 7, 20, 0, 0, 0, 0, 0, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 9, -2, 12, -1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 1, 0, 0, 10, 0, 5, 3, 0, 0, 2, 0, 2, 0, -1, 10, 0, 0, 0, 0, 0, -1, 12, 0, -2, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -1, 0, 6, 6, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 0, 8, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, -1, -1, 0, 6, -1, 0, 0, 0, 0, 0, 0, -1, 0, 4, 0, 0, 0, 0, 0, 1, 3, 0, 0, 6, 0, 0, 0, 0, 2, -2, 0, 12, 5, 0, 6, 28, 4, 0, -2, 0, 0, 11, 0, 0, -2, 0, 2, -1, 5, 6, 0, 0, 12, 0, 0, 0, 6, 0, 17, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 6, 0, 14, 0, -1, 0, -1, 4, 10, 0, 8, 8, 0, 7, -2, 2, 0, 0, 0, -2, 0, 0, 0, 0, 7, 8, -2, 0, 0, 3, 0, -2, 2, 0, 0, 6, 8, 0, 0, 8, 4, 0, -2, 0, 0, 15, 3, -1, 0, 0, 0, 8, 0, 0, 0 };

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public static void method4645() {
		Static10.aClass1_Sub13_Sub1_117.method1892();
		@Pc(7) int local7 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
		if (local7 == 0) {
			return;
		}
		@Pc(22) int local22 = Static10.aClass1_Sub13_Sub1_117.method1883(2);
		if (local22 == 0) {
			Static18.anIntArray36[Static125.anInt2513++] = 2047;
			return;
		}
		@Pc(53) int local53;
		@Pc(63) int local63;
		if (local22 == 1) {
			local53 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
			Static138.aClass11_Sub4_Sub1_3.method3361(1, local53);
			local63 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
			if (local63 == 1) {
				Static18.anIntArray36[Static125.anInt2513++] = 2047;
			}
		} else if (local22 == 2) {
			if (Static10.aClass1_Sub13_Sub1_117.method1883(1) == 1) {
				local53 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
				Static138.aClass11_Sub4_Sub1_3.method3361(2, local53);
				local63 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
				Static138.aClass11_Sub4_Sub1_3.method3361(2, local63);
			} else {
				local53 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
				Static138.aClass11_Sub4_Sub1_3.method3361(0, local53);
			}
			local53 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
			if (local53 == 1) {
				Static18.anIntArray36[Static125.anInt2513++] = 2047;
			}
		} else if (local22 == 3) {
			local53 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
			if (local53 == 1) {
				Static18.anIntArray36[Static125.anInt2513++] = 2047;
			}
			local63 = Static10.aClass1_Sub13_Sub1_117.method1883(7);
			@Pc(170) int local170 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
			@Pc(175) int local175 = Static10.aClass1_Sub13_Sub1_117.method1883(7);
			Static132.anInt2608 = Static10.aClass1_Sub13_Sub1_117.method1883(2);
			Static138.aClass11_Sub4_Sub1_3.method2584(local170 == 1, local175, local63);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Z")
	public static boolean method4646(@OriginalArg(1) int arg0) {
		@Pc(7) Class4_Sub1 local7 = Static235.method3787(arg0);
		if (local7 == null) {
			return false;
		} else if (Static290.anInt5261 == 1 || Static290.anInt5261 == 2 || Static210.anInt4011 == 2) {
			Static252.aString164 = local7.aString4;
			Static124.anInt596 = local7.anInt208;
			if (Static210.anInt4011 != 0) {
				Static287.anInt5204 = Static124.anInt596 + 50000;
				Static23.anInt472 = Static124.anInt596 + 40000;
				Static8.anInt235 = Static23.anInt472;
			}
			return true;
		} else {
			@Pc(54) String local54 = "";
			if (Static210.anInt4011 != 0) {
				local54 = ":" + (local7.anInt208 + 7000);
			}
			@Pc(70) String local70 = "";
			if (Static258.aString177 != null) {
				local70 = "/p=" + Static258.aString177;
			}
			@Pc(128) String local128 = "http://" + local7.aString4 + local54 + "/l=" + Static114.anInt2343 + "/a=" + Static158.anInt3622 + local70 + "/j" + (Static274.aBoolean479 ? "1" : "0") + ",o" + (Static292.aBoolean498 ? "1" : "0") + ",a2,m" + (Static258.aBoolean463 ? "1" : "0");
			try {
				Static222.aClient1.getAppletContext().showDocument(new URL(local128), "_self");
				return true;
			} catch (@Pc(138) Exception local138) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)V")
	public static void method4650() {
		Static100.aClass175_44.method4288(5);
		Static116.aClass175_19.method4288(5);
	}
}
