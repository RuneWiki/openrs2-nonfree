import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "Lclient!ok;")
	public static Class3_Sub38 aClass3_Sub38_1;

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "I")
	public static int anInt9138;

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "Lclient!baa;")
	public static final Class25 aClass25_40 = new Class25(64);

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(B)I")
	public static int method7842() {
		@Pc(14) Class136 local14 = Static40.aClass136_9;
		synchronized (Static40.aClass136_9) {
			return Static40.aClass136_9.method3144();
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIIZI)V")
	public static void method7843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static592.method8210();
		Static512.aLong232 = 0L;
		@Pc(12) int local12 = Static339.method917();
		if (arg1 == 3 || local12 == 3) {
			arg3 = true;
		}
		if (!Static266.aClass82_8.method6158()) {
			arg3 = true;
		}
		Static247.method4166(local12, arg1, arg0, arg3, arg2);
	}
}
