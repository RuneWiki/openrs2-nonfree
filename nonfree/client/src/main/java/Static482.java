import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!rea", name = "q", descriptor = "Lclient!be;")
	public static Class28 aClass28_4;

	@OriginalMember(owner = "client!rea", name = "r", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!rea", name = "t", descriptor = "D")
	public static double aDouble54;

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "[Lclient!tw;")
	public static final Class3_Sub49[] aClass3_Sub49Array1 = new Class3_Sub49[1024];

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "(II)Lclient!ga;")
	public static Class107 method7083(@OriginalArg(0) int arg0) {
		@Pc(8) Class107[] local8 = Static279.method4950();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class107 local16 = local8[local10];
			if (arg0 == local16.anInt4007) {
				return local16;
			}
		}
		return null;
	}
}
