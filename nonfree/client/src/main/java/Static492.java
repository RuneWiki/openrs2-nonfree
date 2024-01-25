import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!d;II)Lclient!ha;")
	public static Class143 method5400(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new oa(arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!hq;I)V")
	public static void method5401(@OriginalArg(0) Class41_Sub3 arg0) {
		arg0.aClass41_Sub1_10 = null;
		@Pc(10) int local10 = arg0.aClass41_Sub9Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass41_Sub9Array1[local12].aBoolean648 = false;
		}
		@Pc(29) Class102[] local29 = Class5_Sub6_Sub23.aClass102Array1;
		synchronized (Class5_Sub6_Sub23.aClass102Array1) {
			if (local10 < Class5_Sub6_Sub23.aClass102Array1.length && Static618.anIntArray567[local10] < 200) {
				Class5_Sub6_Sub23.aClass102Array1[local10].method2055(arg0);
				@Pc(56) int local56 = Static618.anIntArray567[local10]++;
			}
		}
	}
}
