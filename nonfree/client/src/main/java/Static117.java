import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "Lclient!me;")
	public static Class111 aClass111_2;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22 = null;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	public static void method1986() {
		Static65.method1194(false);
		System.gc();
		Static305.method4624(25);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
	public static void method1987() {
		Static80.aClass157_13.method4034(5);
		Static81.aClass157_15.method4034(5);
		Static163.aClass157_31.method4034(5);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I")
	public static int method1989() {
		try {
			if (Static209.anInt4316 == 0) {
				if (Static265.aLong187 > Static221.method3670() - 5000L) {
					return 0;
				}
				Static146.aClass111_3 = Static164.aClass102_2.method2881(Static276.anInt5458, Static204.aString146);
				Static58.aLong50 = Static221.method3670();
				Static209.anInt4316 = 1;
			}
			if (Static58.aLong50 + 30000L < Static221.method3670()) {
				return Static137.method2471(1000);
			}
			@Pc(79) int local79;
			@Pc(116) int local116;
			if (Static209.anInt4316 == 1) {
				if (Static146.aClass111_3.anInt3788 == 2) {
					return Static137.method2471(1001);
				}
				if (Static146.aClass111_3.anInt3788 != 1) {
					return -1;
				}
				Static253.aClass34_3 = new Class34((Socket) Static146.aClass111_3.anObject4, Static164.aClass102_2);
				Static146.aClass111_3 = null;
				Static211.aClass2_Sub16_Sub1_2.anInt2789 = 0;
				local79 = 0;
				if (Static218.aBoolean299) {
					local79 = Static187.anInt3993;
				}
				Static211.aClass2_Sub16_Sub1_2.method2168(23);
				Static211.aClass2_Sub16_Sub1_2.method2186(local79);
				Static253.aClass34_3.method1076(Static211.aClass2_Sub16_Sub1_2.aByteArray17, Static211.aClass2_Sub16_Sub1_2.anInt2789);
				if (Static48.aClass43_2 != null) {
					Static48.aClass43_2.method2443();
				}
				if (Static22.aClass43_1 != null) {
					Static22.aClass43_1.method2443();
				}
				local116 = Static253.aClass34_3.method1070();
				if (Static48.aClass43_2 != null) {
					Static48.aClass43_2.method2443();
				}
				if (Static22.aClass43_1 != null) {
					Static22.aClass43_1.method2443();
				}
				if (local116 != 0) {
					return Static137.method2471(local116);
				}
				Static209.anInt4316 = 2;
			}
			if (Static209.anInt4316 == 2) {
				if (Static253.aClass34_3.method1073() < 2) {
					return -1;
				}
				Static71.anInt1811 = Static253.aClass34_3.method1070();
				Static71.anInt1811 <<= 0x8;
				Static71.anInt1811 += Static253.aClass34_3.method1070();
				Static198.aByteArray43 = new byte[Static71.anInt1811];
				Static31.anInt855 = 0;
				Static209.anInt4316 = 3;
			}
			if (Static209.anInt4316 != 3) {
				return -1;
			}
			local79 = Static253.aClass34_3.method1073();
			if (local79 < 1) {
				return -1;
			}
			if (local79 > Static71.anInt1811 - Static31.anInt855) {
				local79 = Static71.anInt1811 - Static31.anInt855;
			}
			Static253.aClass34_3.method1074(Static31.anInt855, local79, Static198.aByteArray43);
			Static31.anInt855 += local79;
			if (Static31.anInt855 < Static71.anInt1811) {
				return -1;
			} else if (Static194.method3336(Static198.aByteArray43)) {
				Static200.aClass58_Sub1Array1 = new Class58_Sub1[Static39.anInt981];
				local116 = 0;
				for (@Pc(236) int local236 = Static5.anInt4794; local236 <= Static13.anInt260; local236++) {
					@Pc(243) Class58_Sub1 local243 = Static252.method3958(local236);
					if (local243 != null) {
						Static200.aClass58_Sub1Array1[local116++] = local243;
					}
				}
				Static253.aClass34_3.method1077();
				Static296.anInt5746 = 0;
				Static209.anInt4316 = 0;
				Static198.aByteArray43 = null;
				Static253.aClass34_3 = null;
				Static265.aLong187 = Static221.method3670();
				return 0;
			} else {
				return Static137.method2471(1002);
			}
		} catch (@Pc(271) IOException local271) {
			return Static137.method2471(1003);
		}
	}
}
