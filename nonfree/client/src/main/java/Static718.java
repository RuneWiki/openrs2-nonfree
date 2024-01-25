import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static718 {

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "[Lclient!gt;")
	public static final Class145[] aClass145Array1 = new Class145[4];

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_191 = new Class397(133, 1);

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "[Lclient!ika;")
	public static final Class3_Sub2[] aClass3_Sub2Array1 = new Class3_Sub2[2048];

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIZI)V")
	public static void method9506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg0; local3 <= arg1; local3++) {
			Static202.method3077(Static118.anIntArrayArray7[local3], arg4, arg3, arg2);
		}
	}
}
