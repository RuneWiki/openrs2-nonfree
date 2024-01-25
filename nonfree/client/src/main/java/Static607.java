import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "Lclient!pga;")
	public static Class289 aClass289_17;

	@OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
	public static int anInt9426 = 0;

	@OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
	public static int anInt9429 = -1;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method8322(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(9) Class2_Sub6_Sub12 local9 = Static636.method8647(3, (long) arg0);
		local9.method6239();
		local9.aString73 = arg1;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)V")
	public static void method8325() {
		Static587.aClass145_12.method9684(Static558.aFloat145, Static439.aFloat123, Static65.aFloat3);
	}
}
