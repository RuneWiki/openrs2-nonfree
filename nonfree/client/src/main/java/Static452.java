import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
	public static int anInt7565 = -2;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLclient!bp;)V")
	public static void method5833(@OriginalArg(1) Class6_Sub2_Sub1_Sub1 arg0) {
		@Pc(16) Class4_Sub44 local16 = (Class4_Sub44) Static279.aClass196_25.method4477((long) arg0.anInt6078);
		if (local16 == null) {
			Static242.method4046(null, arg0.anIntArray536[0], arg0.anIntArray537[0], null, 0, arg0, arg0.aByte86);
		} else {
			local16.method5665();
		}
	}
}
