import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "Lclient!qh;")
	public static Class4_Sub5_Sub17 aClass4_Sub5_Sub17_4;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!lo", name = "y", descriptor = "J")
	public static long aLong163;

	@OriginalMember(owner = "client!lo", name = "w", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_118 = new Class151(2, 1);

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_119 = new Class151(108, 7);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBI)Z")
	public static boolean method4720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static152.method2628(arg1, arg0) & Static84.method1758(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(Z)V")
	public static void method4721() {
		@Pc(7) Class80 local7 = null;
		try {
			local7 = Static332.method4580("2");
			@Pc(20) Class4_Sub11 local20 = new Class4_Sub11(Static145.anInt2659 * 6 + 3);
			local20.method8822(1);
			local20.method8838(Static145.anInt2659);
			for (@Pc(30) int local30 = 0; local30 < Static509.anIntArray546.length; local30++) {
				if (Static51.aBooleanArray3[local30]) {
					local20.method8838(local30);
					local20.method8860(Static509.anIntArray546[local30]);
				}
			}
			local7.method2122(local20.anInt10466, local20.aByteArray107, 0);
		} catch (@Pc(61) Exception local61) {
		}
		try {
			if (local7 != null) {
				local7.method2118();
			}
		} catch (@Pc(68) Exception local68) {
		}
		Static16.aLong11 = Static429.method5935();
		Static550.aBoolean656 = false;
	}
}
