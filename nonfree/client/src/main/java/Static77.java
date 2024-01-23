import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
	public static int anInt1548;

	@OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
	public static int anInt1559;

	@OriginalMember(owner = "client!fi", name = "kb", descriptor = "I")
	public static int anInt1560;

	@OriginalMember(owner = "client!fi", name = "Z", descriptor = "Lclient!db;")
	public static Class31 aClass31_13 = new Class31(64);

	@OriginalMember(owner = "client!fi", name = "jb", descriptor = "[Lclient!qm;")
	public static Class6_Sub6_Sub2[] aClass6_Sub6_Sub2Array1 = new Class6_Sub6_Sub2[2048];

	@OriginalMember(owner = "client!fi", name = "lb", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)V")
	public static void method1322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class63 local13 = local7.aClass63_1;
		if (local13 != null) {
			local13.anInt1651 = local13.anInt1651 * arg3 / 16;
			local13.anInt1655 = local13.anInt1655 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ak;ILclient!ak;)V")
	public static void method1325(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static169.aClass1_Sub2_Sub12_3 = Static143.method2250(arg1, Static170.anInt3126, arg0);
		if (Static240.aBoolean369) {
			Static275.aClass1_Sub2_Sub12_Sub1_2 = Static6.method148(arg1, Static170.anInt3126, arg0);
		} else {
			Static275.aClass1_Sub2_Sub12_Sub1_2 = (Class1_Sub2_Sub12_Sub1) Static169.aClass1_Sub2_Sub12_3;
		}
		Static84.aClass1_Sub2_Sub12_2 = Static143.method2250(arg1, Static47.anInt5870, arg0);
		Static10.aClass1_Sub2_Sub12_1 = Static143.method2250(arg1, Static152.anInt2815, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "(I)V")
	public static void method1326() {
		if (Static249.anInt5046 == 0) {
			return;
		}
		try {
			if (++Static168.anInt3097 > 1500) {
				if (Static155.aClass73_3 != null) {
					Static155.aClass73_3.method1691();
					Static155.aClass73_3 = null;
				}
				if (Static230.anInt4834 >= 1) {
					Static170.anInt3132 = -5;
					Static249.anInt5046 = 0;
					return;
				}
				Static249.anInt5046 = 1;
				Static230.anInt4834++;
				Static168.anInt3097 = 0;
				if (Static121.anInt2345 == Static146.anInt2695) {
					Static121.anInt2345 = Static259.anInt5236;
				} else {
					Static121.anInt2345 = Static146.anInt2695;
				}
			}
			if (Static249.anInt5046 == 1) {
				Static4.aClass118_2 = Static13.aClass84_3.method1964(Static160.aString103, Static121.anInt2345);
				Static249.anInt5046 = 2;
			}
			@Pc(128) int local128;
			if (Static249.anInt5046 == 2) {
				if (Static4.aClass118_2.anInt3187 == 2) {
					throw new IOException();
				}
				if (Static4.aClass118_2.anInt3187 != 1) {
					return;
				}
				Static155.aClass73_3 = new Class73((Socket) Static4.aClass118_2.anObject3, Static13.aClass84_3);
				Static4.aClass118_2 = null;
				Static155.aClass73_3.method1685(Static270.aClass1_Sub18_Sub1_3.anInt3911, Static270.aClass1_Sub18_Sub1_3.aByteArray71);
				if (Static72.aClass24_1 != null) {
					Static72.aClass24_1.method2458();
				}
				if (Static159.aClass24_2 != null) {
					Static159.aClass24_2.method2458();
				}
				local128 = Static155.aClass73_3.method1686();
				if (Static72.aClass24_1 != null) {
					Static72.aClass24_1.method2458();
				}
				if (Static159.aClass24_2 != null) {
					Static159.aClass24_2.method2458();
				}
				if (local128 != 101) {
					Static249.anInt5046 = 0;
					Static170.anInt3132 = local128;
					Static155.aClass73_3.method1691();
					Static155.aClass73_3 = null;
					return;
				}
				Static249.anInt5046 = 3;
			}
			if (Static249.anInt5046 == 3) {
				if (Static155.aClass73_3.method1687() >= 2) {
					local128 = Static155.aClass73_3.method1686() << 8 | Static155.aClass73_3.method1686();
					Static140.method2202(local128);
					if (Static102.anInt1933 != -1) {
						Static249.anInt5046 = 0;
						Static155.aClass73_3.method1691();
						Static155.aClass73_3 = null;
						Static264.method1811();
						return;
					}
					Static249.anInt5046 = 0;
					Static170.anInt3132 = 6;
					Static155.aClass73_3.method1691();
					Static155.aClass73_3 = null;
					return;
				}
				return;
			}
		} catch (@Pc(210) IOException local210) {
			if (Static155.aClass73_3 != null) {
				Static155.aClass73_3.method1691();
				Static155.aClass73_3 = null;
			}
			if (Static230.anInt4834 < 1) {
				Static249.anInt5046 = 1;
				Static168.anInt3097 = 0;
				Static230.anInt4834++;
				if (Static146.anInt2695 == Static121.anInt2345) {
					Static121.anInt2345 = Static259.anInt5236;
				} else {
					Static121.anInt2345 = Static146.anInt2695;
				}
			} else {
				Static170.anInt3132 = -4;
				Static249.anInt5046 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
	public static void method1327() {
		Static163.aClass31_35.method855();
		Static190.aClass31_28.method855();
		Static55.aClass31_10.method855();
	}
}
