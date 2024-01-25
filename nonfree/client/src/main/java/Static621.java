import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static621 {

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "Lclient!kc;")
	public static Class202 aClass202_13;

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
	public static int anInt9665 = 0;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "([ILclient!gj;BLclient!gj;)V")
	public static void method8227(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(3) Class143 arg2) {
		Static114.aClass143_26 = arg1;
		Static647.aClass143_143 = arg2;
		if (arg0 != null) {
			Static438.anIntArray459 = arg0;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)V")
	public static void method8230(@OriginalArg(0) int arg0) {
		Static577.anInt9150 = -1;
		Static296.anInt8194 = -1;
		Static176.anInt3320 = arg0;
		Static109.method2090();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IB)V")
	public static void method8231(@OriginalArg(0) int arg0) {
		Static296.anInt8194 = -1;
		if (arg0 == 37) {
			Static574.aFloat182 = 3.0F;
		} else if (arg0 == 50) {
			Static574.aFloat182 = 4.0F;
		} else if (arg0 == 75) {
			Static574.aFloat182 = 6.0F;
		} else if (arg0 == 100) {
			Static574.aFloat182 = 8.0F;
		} else if (arg0 == 200) {
			Static574.aFloat182 = 16.0F;
		}
		Static296.anInt8194 = -1;
	}
}
