import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static540 {

	@OriginalMember(owner = "client!tda", name = "i", descriptor = "Lclient!vd;")
	public static Class353 aClass353_110;

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "[I")
	public static final int[] anIntArray571 = new int[3];

	@OriginalMember(owner = "client!tda", name = "g", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_82 = new Class208(10, 7);

	@OriginalMember(owner = "client!tda", name = "h", descriptor = "[I")
	public static int[] anIntArray572 = new int[2];

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!vd;I[ILclient!vd;)V")
	public static void method7924(@OriginalArg(0) Class353 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class353 arg2) {
		Static409.aClass353_74 = arg2;
		Static375.aClass353_61 = arg0;
		if (arg1 != null) {
			Static369.anIntArray417 = arg1;
		}
	}
}
