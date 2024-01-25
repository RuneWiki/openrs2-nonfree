import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!cn;III)V")
	public static void method5580(@OriginalArg(0) Class73 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1 local8 = arg0.method1287(Static457.aClass57_11);
		if (local8 == null) {
			return;
		}
		Static457.aClass57_11.KA(arg2, arg1, arg0.anInt1384 + arg2, arg1 - -arg0.anInt1394);
		if (Static170.anInt2914 < 3) {
			Static318.aClass134_28.method9239((float) arg2 + (float) arg0.anInt1384 / 2.0F, (float) arg1 + (float) arg0.anInt1394 / 2.0F, ((int) -Static429.aFloat132 & 0x3FFF) << 2, local8, arg2, arg1);
		} else {
			Static457.aClass57_11.A(-16777216, local8, arg2, arg1);
		}
	}
}
