import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static520 {

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "[I")
	public static int[] anIntArray480 = new int[1];

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "([Ljava/awt/Rectangle;IB)V")
	public static void method7404(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (Static293.anInt5243 == 1) {
			Static622.aClass67_15.method7649(arg0, arg1, Static292.anInt5232, Static575.anInt9444);
		} else {
			Static622.aClass67_15.method7649(arg0, arg1, 0, 0);
		}
	}
}
