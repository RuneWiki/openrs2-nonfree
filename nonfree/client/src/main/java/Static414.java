import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "Lclient!pfa;")
	public static final Class269 aClass269_6 = new Class269();

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_152 = new Class200(46, 4);

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "[I")
	public static final int[] anIntArray461 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_122 = new Class145(67, 8);

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "[F")
	public static final float[] aFloatArray60 = new float[2];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Z")
	public static boolean method6056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V")
	public static void method6057(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub52 local15 = (Class2_Sub52) Static560.aClass323_36.method7484((long) arg0);
		if (local15 != null) {
			local15.aBoolean759 = !local15.aBoolean759;
			local15.aClass161_Sub1_1.method3856(local15.aBoolean759);
		}
	}
}
