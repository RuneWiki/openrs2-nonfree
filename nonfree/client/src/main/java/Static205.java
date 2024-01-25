import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
	public static int anInt4042 = 100;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "(I)V")
	public static void method3533() {
		@Pc(5) int local5 = 0;
		if (Static544.aClass1_Sub22_Sub1_1.method4648(Static374.anInt6861)) {
			local5 = 55;
		}
		if (!Static544.aClass1_Sub22_Sub1_1.aBoolean396) {
			local5 |= 0x40;
		}
		Static479.method7106(local5);
		Static308.aClass96_4.method2275(local5);
		Static342.aClass250_2.method5973(local5);
		Static538.aClass242_2.method5837(local5);
		Static489.aClass194_2.method4807(local5);
		Static100.method6724(local5);
		Static521.method7164(local5);
		Static73.method1281(local5);
		Static53.method1032(local5);
		Static419.method6151();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method3534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 + arg5 > arg7 && arg4 < arg7 + arg0) {
			return arg6 + arg3 > arg1 && arg3 < arg1 + arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
	public static void method3536() {
		@Pc(3) Class299[] local3 = Class300.aClass299Array1;
		synchronized (Class300.aClass299Array1) {
			for (@Pc(12) int local12 = 0; local12 < Class300.aClass299Array1.length; local12++) {
				Class300.aClass299Array1[local12] = new Class299();
				Static287.anIntArray545[local12] = 0;
			}
		}
	}
}
