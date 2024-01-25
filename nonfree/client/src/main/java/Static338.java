import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!nu", name = "H", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!nu", name = "D", descriptor = "Lclient!io;")
	public static final Class147 aClass147_3 = new Class147();

	@OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
	public static int anInt2905 = 0;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BI)V")
	public static void method2648(@OriginalArg(1) int arg0) {
		@Pc(14) Class12_Sub4_Sub1 local14 = Static389.method6156(5, arg0);
		local14.method823();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[[I)V")
	public static void method2651(@OriginalArg(1) int[][] arg0) {
		Static228.anIntArrayArray46 = arg0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
	public static void method2652() {
		if (Static175.anInt3980 == 0) {
			return;
		}
		try {
			if (++Static267.anInt5373 > 2000) {
				if (Static491.aClass277_2 != null) {
					Static491.aClass277_2.method7170();
					Static491.aClass277_2 = null;
				}
				if (Static96.anInt2249 >= 1) {
					Static194.anInt4316 = -5;
					Static175.anInt3980 = 0;
					return;
				}
				Static267.anInt5373 = 0;
				Static175.anInt3980 = 1;
				Static96.anInt2249++;
				Static537.aClass247_5.aBoolean535 = !Static537.aClass247_5.aBoolean535;
			}
			if (Static175.anInt3980 == 1) {
				Static298.aClass55_7 = Static375.aClass71_3.method1991(Static537.aClass247_5.method6190(), Static537.aClass247_5.aString85);
				Static175.anInt3980 = 2;
			}
			if (Static175.anInt3980 == 2) {
				if (Static298.aClass55_7.anInt1481 == 2) {
					throw new IOException();
				}
				if (Static298.aClass55_7.anInt1481 != 1) {
					return;
				}
				Static491.aClass277_2 = Static80.method5220((Socket) Static298.aClass55_7.anObject5);
				Static298.aClass55_7 = null;
				Static491.aClass277_2.method7164(Static383.aClass12_Sub8_Sub2_1.aByteArray82, Static383.aClass12_Sub8_Sub2_1.anInt6217);
				Static175.anInt3980 = 4;
			}
			@Pc(127) int local127;
			if (Static175.anInt3980 == 4) {
				if (!Static491.aClass277_2.method7166(1)) {
					return;
				}
				Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 1, 0);
				local127 = Static394.aClass12_Sub8_Sub2_2.aByteArray82[0] & 0xFF;
				if (local127 != 21) {
					Static175.anInt3980 = 0;
					Static194.anInt4316 = local127;
					Static491.aClass277_2.method7170();
					Static491.aClass277_2 = null;
					return;
				}
				Static175.anInt3980 = 5;
			}
			if (Static175.anInt3980 == 5) {
				if (!Static491.aClass277_2.method7166(1)) {
					return;
				}
				Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 1, 0);
				Static175.anInt3980 = 6;
				Static495.aStringArray59 = new String[Static394.aClass12_Sub8_Sub2_2.aByteArray82[0] & 0xFF];
			}
			if (Static175.anInt3980 == 6) {
				if (!Static491.aClass277_2.method7166(Static495.aStringArray59.length * 8)) {
					return;
				}
				Static394.aClass12_Sub8_Sub2_2.anInt6217 = 0;
				Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, Static495.aStringArray59.length * 8, 0);
				for (local127 = 0; local127 < Static495.aStringArray59.length; local127++) {
					Static495.aStringArray59[local127] = Static104.method2138(Static394.aClass12_Sub8_Sub2_2.method5191());
				}
				Static194.anInt4316 = 21;
				Static175.anInt3980 = 0;
				Static491.aClass277_2.method7170();
				Static491.aClass277_2 = null;
				return;
			}
		} catch (@Pc(235) IOException local235) {
			if (Static491.aClass277_2 != null) {
				Static491.aClass277_2.method7170();
				Static491.aClass277_2 = null;
			}
			if (Static96.anInt2249 < 1) {
				Static267.anInt5373 = 0;
				Static175.anInt3980 = 1;
				Static96.anInt2249++;
				Static537.aClass247_5.aBoolean535 = !Static537.aClass247_5.aBoolean535;
			} else {
				Static175.anInt3980 = 0;
				Static194.anInt4316 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!n;BLjava/awt/Canvas;Z)Lclient!qa;")
	public static Class42 method2654(@OriginalArg(0) Interface11 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) boolean arg2) {
		return arg2 ? new Class42_Sub2_Sub2(arg1, arg0) : new Class42_Sub2_Sub1(arg1, arg0);
	}
}
