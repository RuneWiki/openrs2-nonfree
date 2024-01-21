import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3 aClass2_Sub3_Sub2_Sub3_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1 = Static38.method685("Error loading your profile)3");

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!ai;")
	public static Class6 aClass6_2 = Static38.method685("<col=00ff00>");

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_3 = aClass6_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([BIZI)I")
	public static int method1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg2; local9++) {
			local7 = Class2_Sub1_Sub28.anIntArray279[(arg0[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method2() {
		aClass6_2 = null;
		aClass6_3 = null;
		aClass2_Sub3_Sub2_Sub3_1 = null;
		aClass6_1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Lclient!lb;")
	public static Class50 method3() {
		try {
			return (Class50) Class.forName("Class50_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
