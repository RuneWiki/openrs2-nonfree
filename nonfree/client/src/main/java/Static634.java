import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!via", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString107;

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(B)V")
	public static void method8551() {
		@Pc(5) Class340 local5 = Static201.aClass340_22;
		synchronized (Static201.aClass340_22) {
			Static201.aClass340_22.method7987();
		}
		local5 = Static607.aClass340_49;
		synchronized (Static607.aClass340_49) {
			Static607.aClass340_49.method7987();
		}
	}

	@OriginalMember(owner = "client!via", name = "c", descriptor = "(B)V")
	public static void method8552() {
		@Pc(8) int local8 = Static172.aClass5_Sub50_14.aClass12_Sub13_2.method3075();
		if (local8 == 0) {
			Static104.aByteArrayArrayArray5 = null;
			Static343.method5266(0);
		} else if (local8 == 1) {
			Static457.method6554((byte) 0);
			Static343.method5266(512);
			if (Static7.aByteArrayArrayArray1 != null) {
				Static592.method8120();
			}
		} else {
			Static457.method6554((byte) (Static349.anInt6360 - 4 & 0xFF));
			Static343.method5266(2);
		}
		Static183.anInt3589 = Static481.anInt8082;
	}
}
