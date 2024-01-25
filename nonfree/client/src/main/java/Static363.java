import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!oca", name = "o", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!oca", name = "l", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_77 = new Class181(55, -1);

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!ep;IZI)V")
	public static void method5830(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class19 local13 = arg0.method2490(Static323.aClass9_8);
		if (local13 == null) {
			return;
		}
		Static323.aClass9_8.ca(arg2, arg1, arg2 + arg0.anInt2777, arg1 - -arg0.anInt2738);
		if (Static426.anInt7851 >= 3) {
			Static323.aClass9_8.L(-16777216, local13, arg2, arg1);
		} else {
			Static484.aClass66_31.method8067((float) arg2 + (float) arg0.anInt2777 / 2.0F, (float) arg0.anInt2738 / 2.0F + (float) arg1, ((int) -Static412.aFloat175 & 0x3FFF) << 2, local13, arg2, arg1);
		}
	}
}
