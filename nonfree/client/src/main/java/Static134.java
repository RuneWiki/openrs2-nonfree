import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static134 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public static int anInt3412 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ed;Lclient!ed;IIIII)V")
	public static void method2312(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static164.aBoolean201 || Static38.anInt1037 >= 500) {
			return;
		}
		Static102.aClass23Array11[Static38.anInt1037] = arg1;
		Static104.aClass23Array12[Static38.anInt1037] = arg0;
		Static37.anIntArray124[Static38.anInt1037] = arg3;
		Static178.anIntArray592[Static38.anInt1037] = arg4;
		Static104.anIntArray354[Static38.anInt1037] = arg2;
		Static153.anIntArray506[Static38.anInt1037] = arg5;
		Static38.anInt1037++;
	}
}
