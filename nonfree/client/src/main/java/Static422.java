import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!qca", name = "r", descriptor = "I")
	public static int anInt8117 = 1;

	@OriginalMember(owner = "client!qca", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString169 = "";

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!hw;Z)V")
	public static void method6327(@OriginalArg(0) Class21_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(16) Class4_Sub43 local16 = (Class4_Sub43) Static458.aClass221_32.method5075((long) arg0.anInt4256);
		if (local16 == null) {
			Static394.method6038(null, arg0, arg0.aByte127, arg0.anIntArray207[0], arg0.anIntArray206[0], 0, null);
		} else {
			local16.method6719();
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V")
	public static void method6329() {
		if (Static523.aClass94_24 != null) {
			Static521.aClass258_1 = new Class258();
			Static521.aClass258_1.method5972(Static523.aClass94_24.aClass152_2.method3624(Static142.anInt3088), Static435.aLong221, Static523.aClass94_24.anInt2736, Static523.aClass94_24);
			Static458.aThread5 = new Thread(Static521.aClass258_1, "");
			Static458.aThread5.start();
		}
	}
}
