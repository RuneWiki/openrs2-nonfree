import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!ii;")
	public static Class111 aClass111_4;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
	public static void method1850() {
		Static294.anInt5085 = 0;
		Static227.aBoolean319 = false;
		Static281.anInt4933 = 0;
		Static158.anInt2849 = -3;
		Static355.anInt5982 = -1;
		Static193.anInt3497 = 1;
		Static142.anInt2709 = 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
	public static int method1851(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(37) int local37 = (arg0 & 0x7F) * 96 >> 7;
			if (local37 < 2) {
				local37 = 2;
			} else if (local37 > 126) {
				local37 = 126;
			}
			return local37 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
	public static void method1857() {
		if (Static270.anInt5905 == 0) {
			return;
		}
		try {
			if (++Static115.anInt2217 > 2000) {
				if (Static12.aClass145_2 != null) {
					Static12.aClass145_2.method3136();
					Static12.aClass145_2 = null;
				}
				if (Static24.anInt334 >= 1) {
					Static116.anInt2222 = -5;
					Static270.anInt5905 = 0;
					return;
				}
				Static115.anInt2217 = 0;
				if (Static303.anInt5267 == Static269.anInt4741) {
					Static269.anInt4741 = Static174.anInt3041;
				} else {
					Static269.anInt4741 = Static303.anInt5267;
				}
				Static24.anInt334++;
				Static270.anInt5905 = 1;
			}
			if (Static270.anInt5905 == 1) {
				Static89.aClass133_9 = Static61.aClass156_1.method3642(Static200.aString35, Static269.anInt4741);
				Static270.anInt5905 = 2;
			}
			if (Static270.anInt5905 == 2) {
				if (Static89.aClass133_9.anInt3257 == 2) {
					throw new IOException();
				}
				if (Static89.aClass133_9.anInt3257 != 1) {
					return;
				}
				Static12.aClass145_2 = new Class145((Socket) Static89.aClass133_9.anObject3, Static61.aClass156_1);
				Static89.aClass133_9 = null;
				Static12.aClass145_2.method3143(Static23.aClass3_Sub5_Sub1_1.anInt3121, Static23.aClass3_Sub5_Sub1_1.aByteArray42);
				if (Static25.aClass119_1 != null) {
					Static25.aClass119_1.method4983();
				}
				if (Static275.aClass119_2 != null) {
					Static275.aClass119_2.method4983();
				}
				@Pc(121) int local121 = Static12.aClass145_2.method3137();
				if (Static25.aClass119_1 != null) {
					Static25.aClass119_1.method4983();
				}
				if (Static275.aClass119_2 != null) {
					Static275.aClass119_2.method4983();
				}
				if (local121 != 21) {
					Static270.anInt5905 = 0;
					Static116.anInt2222 = local121;
					Static12.aClass145_2.method3136();
					Static12.aClass145_2 = null;
					return;
				}
				Static270.anInt5905 = 3;
			}
			if (Static270.anInt5905 == 3) {
				if (Static12.aClass145_2.method3139() < 1) {
					return;
				}
				Static351.aStringArray25 = new String[Static12.aClass145_2.method3137()];
				Static270.anInt5905 = 4;
			}
			if (Static270.anInt5905 == 4 && Static12.aClass145_2.method3139() >= Static351.aStringArray25.length * 8) {
				Static26.aClass3_Sub5_Sub1_2.anInt3121 = 0;
				Static12.aClass145_2.method3141(0, Static26.aClass3_Sub5_Sub1_2.aByteArray42, Static351.aStringArray25.length * 8);
				for (@Pc(199) int local199 = 0; local199 < Static351.aStringArray25.length; local199++) {
					Static351.aStringArray25[local199] = Static338.method5143(Static26.aClass3_Sub5_Sub1_2.method2741());
				}
				Static270.anInt5905 = 0;
				Static116.anInt2222 = 21;
				Static12.aClass145_2.method3136();
				Static12.aClass145_2 = null;
			}
		} catch (@Pc(225) IOException local225) {
			if (Static12.aClass145_2 != null) {
				Static12.aClass145_2.method3136();
				Static12.aClass145_2 = null;
			}
			if (Static24.anInt334 >= 1) {
				Static270.anInt5905 = 0;
				Static116.anInt2222 = -4;
			} else {
				if (Static269.anInt4741 == Static303.anInt5267) {
					Static269.anInt4741 = Static174.anInt3041;
				} else {
					Static269.anInt4741 = Static303.anInt5267;
				}
				Static115.anInt2217 = 0;
				Static24.anInt334++;
				Static270.anInt5905 = 1;
			}
		}
	}
}
