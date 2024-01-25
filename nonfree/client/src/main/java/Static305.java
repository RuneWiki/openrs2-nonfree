import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!lq", name = "z", descriptor = "Lclient!je;")
	public static final Class170 aClass170_9 = new Class170();

	@OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
	public static int anInt5674 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method4621(@OriginalArg(0) Class78 arg0) {
		for (@Pc(8) Class11_Sub9 local8 = (Class11_Sub9) Static485.aClass196_8.method4024(); local8 != null; local8 = (Class11_Sub9) Static485.aClass196_8.method4028()) {
			if (local8.aBoolean513) {
				local8.method5349(arg0);
			}
		}
	}
}
