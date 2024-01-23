import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!pl", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString153;

	@OriginalMember(owner = "client!pl", name = "S", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "Lclient!l;")
	public static Class101 aClass101_18 = new Class101(32);

	@OriginalMember(owner = "client!pl", name = "H", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!pl", name = "L", descriptor = "Z")
	public static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
	public static int anInt4477 = 128;

	@OriginalMember(owner = "client!pl", name = "Q", descriptor = "Lclient!g;")
	public static Class56 aClass56_20 = null;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V")
	public static void method3631() {
		if (Static259.anInt5132 == 0) {
			return;
		}
		try {
			if (++Static92.anInt2207 > 2000) {
				if (Static253.aClass34_3 != null) {
					Static253.aClass34_3.method1077();
					Static253.aClass34_3 = null;
				}
				if (Static194.anInt4084 >= 1) {
					Static259.anInt5132 = 0;
					Static195.anInt6028 = -5;
					return;
				}
				Static194.anInt4084++;
				Static92.anInt2207 = 0;
				Static259.anInt5132 = 1;
				if (Static259.anInt5136 == Static166.anInt3677) {
					Static166.anInt3677 = Static285.anInt5646;
				} else {
					Static166.anInt3677 = Static259.anInt5136;
				}
			}
			if (Static259.anInt5132 == 1) {
				Static146.aClass111_3 = Static164.aClass102_2.method2881(Static166.anInt3677, Static122.aString96);
				Static259.anInt5132 = 2;
			}
			@Pc(125) int local125;
			if (Static259.anInt5132 == 2) {
				if (Static146.aClass111_3.anInt3788 == 2) {
					throw new IOException();
				}
				if (Static146.aClass111_3.anInt3788 != 1) {
					return;
				}
				Static253.aClass34_3 = new Class34((Socket) Static146.aClass111_3.anObject4, Static164.aClass102_2);
				Static146.aClass111_3 = null;
				Static253.aClass34_3.method1076(Static211.aClass2_Sub16_Sub1_2.aByteArray17, Static211.aClass2_Sub16_Sub1_2.anInt2789);
				if (Static48.aClass43_2 != null) {
					Static48.aClass43_2.method2443();
				}
				if (Static22.aClass43_1 != null) {
					Static22.aClass43_1.method2443();
				}
				local125 = Static253.aClass34_3.method1070();
				if (Static48.aClass43_2 != null) {
					Static48.aClass43_2.method2443();
				}
				if (Static22.aClass43_1 != null) {
					Static22.aClass43_1.method2443();
				}
				if (local125 != 21) {
					Static259.anInt5132 = 0;
					Static195.anInt6028 = local125;
					Static253.aClass34_3.method1077();
					Static253.aClass34_3 = null;
					return;
				}
				Static259.anInt5132 = 3;
			}
			if (Static259.anInt5132 == 3) {
				if (Static253.aClass34_3.method1073() < 1) {
					return;
				}
				Static230.aStringArray36 = new String[Static253.aClass34_3.method1070()];
				Static259.anInt5132 = 4;
			}
			if (Static259.anInt5132 == 4) {
				if (Static253.aClass34_3.method1073() < Static230.aStringArray36.length * 8) {
					return;
				}
				Static91.aClass2_Sub16_Sub1_1.anInt2789 = 0;
				Static253.aClass34_3.method1074(0, Static230.aStringArray36.length * 8, Static91.aClass2_Sub16_Sub1_1.aByteArray17);
				for (local125 = 0; local125 < Static230.aStringArray36.length; local125++) {
					Static230.aStringArray36[local125] = Static146.method2595(Static91.aClass2_Sub16_Sub1_1.method2132());
				}
				Static195.anInt6028 = 21;
				Static259.anInt5132 = 0;
				Static253.aClass34_3.method1077();
				Static253.aClass34_3 = null;
				return;
			}
		} catch (@Pc(234) IOException local234) {
			if (Static253.aClass34_3 != null) {
				Static253.aClass34_3.method1077();
				Static253.aClass34_3 = null;
			}
			if (Static194.anInt4084 >= 1) {
				Static259.anInt5132 = 0;
				Static195.anInt6028 = -4;
			} else {
				if (Static166.anInt3677 == Static259.anInt5136) {
					Static166.anInt3677 = Static285.anInt5646;
				} else {
					Static166.anInt3677 = Static259.anInt5136;
				}
				Static92.anInt2207 = 0;
				Static194.anInt4084++;
				Static259.anInt5132 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ek;BII)Lclient!sc;")
	public static Class2_Sub8_Sub1_Sub1 method3633(@OriginalArg(0) Class42 arg0, @OriginalArg(3) int arg1) {
		return Static187.method3282(arg0, arg1, 0) ? Static32.method642() : null;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!oe;I)Ljava/lang/String;")
	public static String method3638(@OriginalArg(0) Class2_Sub16 arg0) {
		return Static259.method4089(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)I")
	public static int method3639(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
