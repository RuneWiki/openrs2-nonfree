import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "[I")
	public static int[] anIntArray457;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
	public static int[] anIntArray458;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_91 = new Class240(70, -1);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method6885(@OriginalArg(0) Class95 arg0) {
		for (@Pc(18) Class34_Sub7 local18 = (Class34_Sub7) Static372.aClass317_6.method6891(); local18 != null; local18 = (Class34_Sub7) Static372.aClass317_6.method6894()) {
			if (local18.aBoolean417) {
				local18.method5092(arg0);
			}
		}
	}
}
