import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
	public static int anInt2976;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIIII)V")
	public static void method2589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) Class11_Sub8 local17 = (Class11_Sub8) Static337.aClass196_5.method4024(); local17 != null; local17 = (Class11_Sub8) Static337.aClass196_5.method4028()) {
			if (Static518.anInt9331 >= local17.anInt5618) {
				local17.method7200();
			} else {
				Static504.method7067((local17.anInt5614 << 9) + 256, local17.anInt5612, local17.anInt5615 * 2, (local17.anInt5613 << 9) + 256, arg2 >> 1, arg1 >> 1);
				Static62.aClass96_4.method7252(0, local17.aString68, Static70.anIntArray59[1] + arg3, local17.anInt5616 | 0xFF000000, arg0 + Static70.anIntArray59[0]);
			}
		}
	}
}
