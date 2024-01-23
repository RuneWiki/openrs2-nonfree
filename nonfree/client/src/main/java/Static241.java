import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
	public static int anInt5183 = 0;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString372 = "glow2:";

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
	public static int anInt5187 = 0;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	public static void method3955() {
		Static218.aClass79_32.method2489();
		Static81.aClass79_10.method2489();
		Static63.aClass79_8.method2489();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIII)V")
	public static void method3956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(14) Class116[] local14 = Static75.aClass116Array1;
		while (local14.length > local7) {
			@Pc(20) Class116 local20 = local14[local7];
			if (local20 != null && local20.anInt4410 == 2) {
				Static151.method2723((local20.anInt4402 - Static64.anInt1786 << 7) + local20.anInt4408, arg1 >> 1, local20.anInt4407 + (local20.anInt4405 - Static29.anInt907 << 7), arg2 >> 1, local20.anInt4398 * 2);
				if (Static257.anInt5460 > -1 && Static156.anInt3722 % 20 < 10) {
					Static112.aClass1_Sub2_Sub4Array10[local20.anInt4404].method892(Static257.anInt5460 + arg3 - 12, arg0 + -28 + Static100.anInt2721);
				}
			}
			local7++;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZZ)V")
	public static void method3957(@OriginalArg(0) boolean arg0) {
		Static98.method2086();
		if (Static224.anInt4922 != 30 && Static224.anInt4922 != 25) {
			return;
		}
		Static261.anInt5475++;
		if (Static261.anInt5475 < 50 && !arg0) {
			return;
		}
		Static261.anInt5475 = 0;
		if (!Static203.aBoolean224 && Static34.aClass109_2 != null) {
			Static171.aClass1_Sub13_Sub1_3.method1825(116);
			try {
				Static34.aClass109_2.method3150(Static171.aClass1_Sub13_Sub1_3.aByteArray29, Static171.aClass1_Sub13_Sub1_3.anInt2395);
				Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
			} catch (@Pc(49) IOException local49) {
				Static203.aBoolean224 = true;
			}
		}
		Static98.method2086();
	}
}
