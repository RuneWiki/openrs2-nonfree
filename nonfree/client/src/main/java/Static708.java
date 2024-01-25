import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static708 {

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "Lclient!te;")
	public static Class3_Sub33_Sub3 aClass3_Sub33_Sub3_4;

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "[Lclient!kw;")
	public static Class178[] aClass178Array18;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "[Lclient!wo;")
	public static final Interface26[] anInterface26Array2 = new Interface26[128];

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
	public static int anInt11107 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZBII)I")
	public static int method9459(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub38 local8 = Static14.method503(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && local8.anIntArray411.length > arg1) {
			return local8.anIntArray411[arg1];
		} else {
			return 0;
		}
	}
}
