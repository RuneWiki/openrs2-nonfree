import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BII)Z")
	public static boolean method6648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	public static void method6649() {
		Static564.anInt9350 = 0;
		Static372.anInt6710 = 0;
		Static208.anInt8061 = 0;
		Static225.anInt4130 = 0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)J")
	public static synchronized long method6650() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static527.aLong243 > local10) {
			Static194.aLong96 += Static527.aLong243 - local10;
		}
		Static527.aLong243 = local10;
		return Static194.aLong96 + local10;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)Lclient!mca;")
	public static Class188 method6651() {
		try {
			return new Class188_Sub1();
		} catch (@Pc(14) Throwable local14) {
			try {
				return (Class188) Class.forName("Class188_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class188_Sub2();
			}
		}
	}
}
