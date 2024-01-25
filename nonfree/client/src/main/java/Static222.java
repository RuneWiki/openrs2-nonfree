import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "Lclient!hh;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "[I")
	public static int[] anIntArray416;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILclient!sl;)V")
	public static void method4157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class17_Sub5 arg3) {
		if (Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static269.method4738(arg0, arg1, arg2);
		}
		Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2].aClass17_Sub5_1 = arg3;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
	public static void method4158() {
		if (Static130.anInt2868 == 0) {
			return;
		}
		try {
			if (++Static64.anInt1799 > 2000) {
				if (Static7.aClass148_1 != null) {
					Static7.aClass148_1.method4123();
					Static7.aClass148_1 = null;
				}
				if (Static278.anInt5664 >= 1) {
					Static292.anInt4644 = -5;
					Static130.anInt2868 = 0;
					return;
				}
				if (Static266.anInt5404 == Static274.anInt5608) {
					Static274.anInt5608 = Static286.anInt5727;
				} else {
					Static274.anInt5608 = Static266.anInt5404;
				}
				Static64.anInt1799 = 0;
				Static278.anInt5664++;
				Static130.anInt2868 = 1;
			}
			if (Static130.anInt2868 == 1) {
				Static7.aClass162_1 = Static15.aClass143_1.method3889(Static274.anInt5608, Static114.aString46);
				Static130.anInt2868 = 2;
			}
			@Pc(120) int local120;
			if (Static130.anInt2868 == 2) {
				if (Static7.aClass162_1.anInt4801 == 2) {
					throw new IOException();
				}
				if (Static7.aClass162_1.anInt4801 != 1) {
					return;
				}
				Static7.aClass148_1 = new Class148((Socket) Static7.aClass162_1.anObject5, Static15.aClass143_1);
				Static7.aClass162_1 = null;
				Static7.aClass148_1.method4122(Static342.aClass1_Sub8_Sub1_7.anInt5182, Static342.aClass1_Sub8_Sub1_7.aByteArray81);
				if (Static129.aClass7_2 != null) {
					Static129.aClass7_2.method5559();
				}
				if (Static88.aClass7_1 != null) {
					Static88.aClass7_1.method5559();
				}
				local120 = Static7.aClass148_1.method4127();
				if (Static129.aClass7_2 != null) {
					Static129.aClass7_2.method5559();
				}
				if (Static88.aClass7_1 != null) {
					Static88.aClass7_1.method5559();
				}
				if (local120 != 21) {
					Static292.anInt4644 = local120;
					Static130.anInt2868 = 0;
					Static7.aClass148_1.method4123();
					Static7.aClass148_1 = null;
					return;
				}
				Static130.anInt2868 = 3;
			}
			if (Static130.anInt2868 == 3) {
				if (Static7.aClass148_1.method4125() < 1) {
					return;
				}
				Static131.aStringArray28 = new String[Static7.aClass148_1.method4127()];
				Static130.anInt2868 = 4;
			}
			if (Static130.anInt2868 == 4 && Static7.aClass148_1.method4125() >= Static131.aStringArray28.length * 8) {
				Static311.aClass1_Sub8_Sub1_8.anInt5182 = 0;
				Static7.aClass148_1.method4124(0, Static131.aStringArray28.length * 8, Static311.aClass1_Sub8_Sub1_8.aByteArray81);
				for (local120 = 0; local120 < Static131.aStringArray28.length; local120++) {
					Static131.aStringArray28[local120] = Static87.method1890(Static311.aClass1_Sub8_Sub1_8.method4511());
				}
				Static292.anInt4644 = 21;
				Static130.anInt2868 = 0;
				Static7.aClass148_1.method4123();
				Static7.aClass148_1 = null;
			}
		} catch (@Pc(226) IOException local226) {
			if (Static7.aClass148_1 != null) {
				Static7.aClass148_1.method4123();
				Static7.aClass148_1 = null;
			}
			if (Static278.anInt5664 >= 1) {
				Static130.anInt2868 = 0;
				Static292.anInt4644 = -4;
			} else {
				Static130.anInt2868 = 1;
				if (Static274.anInt5608 == Static266.anInt5404) {
					Static274.anInt5608 = Static286.anInt5727;
				} else {
					Static274.anInt5608 = Static266.anInt5404;
				}
				Static278.anInt5664++;
				Static64.anInt1799 = 0;
			}
		}
	}
}
