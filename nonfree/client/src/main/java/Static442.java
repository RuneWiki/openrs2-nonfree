import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "Lclient!cj;")
	public static Class55 aClass55_6;

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "Lclient!ega;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "[I")
	public static int[] anIntArray505 = new int[1];

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILclient!paa;I)V")
	public static void method6036(@OriginalArg(1) int arg0, @OriginalArg(2) Class261 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1 local8 = arg1.method5621(Static192.aClass95_4);
		if (local8 == null) {
			return;
		}
		Static192.aClass95_4.KA(arg0, arg2, arg0 + arg1.anInt6595, arg2 + arg1.anInt6622);
		if (Static502.anInt2999 >= 3) {
			Static192.aClass95_4.A(-16777216, local8, arg0, arg2);
		} else {
			Static83.aClass61_3.method6444((float) arg0 + (float) arg1.anInt6595 / 2.0F, (float) arg1.anInt6622 / 2.0F + (float) arg2, ((int) -Static440.aFloat144 & 0x3FFF) << 2, local8, arg0, arg2);
		}
	}
}
