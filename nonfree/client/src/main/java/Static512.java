import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Lclient!bba;")
	public static Class29 method9097() {
		try {
			return (Class29) Class.forName("kaa").getDeclaredConstructor().newInstance();
		} catch (@Pc(21) Throwable local21) {
			return new Class29_Sub2();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V")
	public static void method9098(@OriginalArg(0) boolean arg0) {
		if (Static161.aClass329_3 == null) {
			Static241.method4042();
		}
		if (arg0) {
			Static161.aClass329_3.method8066();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z")
	public static boolean method9099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BZ)V")
	public static void method9100(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static152.anInt2360;
		@Pc(7) int local7 = Static3.anInt56;
		if (arg0 && Static6.aBoolean9) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static103.aClass144_3.f(local7, local5);
	}
}
