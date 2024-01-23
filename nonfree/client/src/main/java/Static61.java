import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt1335;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!pk;")
	public static Class132 aClass132_22;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public static int anInt1336 = 0;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	public static volatile int anInt1337 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!aj;I)Lclient!af;")
	public static Class7 method954(@OriginalArg(0) Class8_Sub2 arg0) {
		@Pc(7) Class7 local7 = new Class7();
		local7.anInt61 = arg0.method2375();
		local7.aClass8_Sub1_Sub12_1 = Static115.method1854(local7.anInt61);
		return local7;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!pk;Lclient!pk;Z)V")
	public static void method955(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1) {
		Static135.aClass132_49 = arg0;
		Static192.aClass132_67 = arg1;
	}
}
