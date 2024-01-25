import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	public static int anInt603;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_8 = new Class218(11, -2);

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	public static int anInt606 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method596() {
		if (!Static82.aBoolean192) {
			return;
		}
		@Pc(11) Class108 local11 = Static526.method6818(Static33.anInt612, Static461.anInt8388);
		if (local11 != null && local11.anObjectArray25 != null) {
			@Pc(20) Class3_Sub51 local20 = new Class3_Sub51();
			local20.aClass108_13 = local11;
			local20.anObjectArray33 = local11.anObjectArray25;
			Static84.method2222(local20);
		}
		Static82.aBoolean192 = false;
		Static60.anInt1272 = -1;
		Static548.anInt9367 = -1;
		if (local11 != null) {
			Static139.method3135(local11);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	public static void method597(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub24 local12 = (Class3_Sub24) Static493.aClass307_47.method7424((long) arg0);
		if (local12 != null) {
			local12.aBoolean396 = !local12.aBoolean396;
			local12.aClass187_Sub1_1.method5772(local12.aBoolean396);
		}
	}
}
