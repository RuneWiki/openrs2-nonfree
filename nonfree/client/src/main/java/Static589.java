import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Z")
	public static boolean aBoolean931;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!rh;")
	public static final Class323 aClass323_7 = new Class323();

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "J")
	public static long aLong344 = 20000000L;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public static void method9461() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static98.aClass405Array1[local7] = null;
		}
		Static527.anInt8374 = 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Z")
	public static boolean method9463(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static451.method6590(arg0, arg1) || Static400.method5898(arg0, arg1) || Static587.method7242(arg0, arg1);
	}
}
