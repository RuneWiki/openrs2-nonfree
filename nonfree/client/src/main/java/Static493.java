import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "Lclient!vd;")
	public static Class353 aClass353_96;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread6;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "Lclient!pga;")
	public static Class32 aClass32_38;

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray45 = new boolean[8];

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
	public static void method7390() {
		if (Static114.anInt2256 == 0) {
			return;
		}
		try {
			if (++Static292.anInt5761 > 2000) {
				if (Static97.aClass29_1 != null) {
					Static97.aClass29_1.method4606();
					Static97.aClass29_1 = null;
				}
				if (Static128.anInt2438 >= 2) {
					Static114.anInt2256 = 0;
					Static612.anInt8715 = -5;
					return;
				}
				Static288.aClass56_3.method1429();
				Static128.anInt2438++;
				Static292.anInt5761 = 0;
				Static114.anInt2256 = 1;
			}
			if (Static114.anInt2256 == 1) {
				Static218.aClass328_3 = Static288.aClass56_3.method1431(Static529.aClass112_6);
				Static114.anInt2256 = 2;
			}
			if (Static114.anInt2256 == 2) {
				if (Static218.aClass328_3.anInt9389 == 2) {
					throw new IOException();
				}
				if (Static218.aClass328_3.anInt9389 != 1) {
					return;
				}
				Static97.aClass29_1 = Static226.method3873((Socket) Static218.aClass328_3.anObject21);
				Static218.aClass328_3 = null;
				Static265.method3201();
				Static114.anInt2256 = 4;
			}
			if (Static114.anInt2256 == 4 && Static97.aClass29_1.method4608(1)) {
				Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 1, 0);
				@Pc(119) int local119 = Static456.aClass6_Sub40_Sub2_2.aByteArray113[0] & 0xFF;
				Static612.anInt8715 = local119;
				Static114.anInt2256 = 0;
				Static97.aClass29_1.method4606();
				Static97.aClass29_1 = null;
			}
		} catch (@Pc(130) IOException local130) {
			if (Static97.aClass29_1 != null) {
				Static97.aClass29_1.method4606();
				Static97.aClass29_1 = null;
			}
			if (Static128.anInt2438 >= 2) {
				Static114.anInt2256 = 0;
				Static612.anInt8715 = -4;
			} else {
				Static288.aClass56_3.method1429();
				Static128.anInt2438++;
				Static114.anInt2256 = 1;
				Static292.anInt5761 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
	public static Object method7391(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static309.aBoolean398) {
			try {
				@Pc(25) Class263 local25 = (Class263) Class.forName("Class263_Sub1").getDeclaredConstructor().newInstance();
				local25.method6922(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static309.aBoolean398 = true;
			}
		}
		return arg0;
	}
}
