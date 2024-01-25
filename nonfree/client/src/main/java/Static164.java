import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_67 = new Class180(91, 0);

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
	public static int anInt3235 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public static void method2974(@OriginalArg(0) int arg0) {
		Static610.anInt9839 = arg0;
		@Pc(7) Class165 local7 = Static291.aClass165_34;
		synchronized (Static291.aClass165_34) {
			Static291.aClass165_34.method4403();
		}
		local7 = Static643.aClass165_77;
		synchronized (Static643.aClass165_77) {
			Static643.aClass165_77.method4403();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZZ)V")
	public static void method2975(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static73.anInt1386++;
			Static468.method6791();
		}
		if (arg0) {
			Static538.anInt8867++;
			Static361.method5306();
		}
	}
}
