import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "[I")
	public static final int[] anIntArray165 = new int[3];

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)V")
	public static void method2427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 << 3;
		@Pc(23) int local23 = arg1 << 3;
		if (Static262.anInt4081 == 2) {
			Static46.anInt1301 = local11;
			Static171.anInt8707 = local23;
			Static32.anInt1120 = 0;
		}
		Static382.aFloat40 = (float) local11;
		Static447.aFloat107 = (float) local23;
		Static651.method8576();
		Static96.aBoolean732 = true;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public static void method2428(@OriginalArg(0) Canvas arg0) {
		@Pc(14) Dimension local14 = arg0.getSize();
		Static670.method8989(local14.width, local14.height);
		if (Static488.anInt7680 == 1) {
			Static536.aClass22_11.method9370(arg0, Static438.anInt6734, Static182.anInt3160);
		} else {
			Static536.aClass22_11.method9370(arg0, Static637.anInt8890, Static316.anInt5077);
		}
	}
}
