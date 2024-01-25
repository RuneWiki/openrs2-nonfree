import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!qf;B)V")
	public static void method809(@OriginalArg(0) Class245 arg0) {
		if (arg0.anInt7278 == Static441.anInt8034) {
			Static125.aBooleanArray12[arg0.anInt7253] = true;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z")
	public static boolean method810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static228.method4098(arg1, arg0) || Static318.method4379(arg0, arg1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	public static void method811() {
		@Pc(5) Class125 local5 = Static145.aClass125_24;
		synchronized (Static145.aClass125_24) {
			Static145.aClass125_24.method3516();
		}
		local5 = Static388.aClass125_57;
		synchronized (Static388.aClass125_57) {
			Static388.aClass125_57.method3516();
		}
	}
}
