import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public static int anInt4053 = 0;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "[Lclient!di;")
	public static final Interface2[] anInterface2Array2 = new Interface2[128];

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_63 = new Class186(69, 3);

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!ee;")
	public static final Class74 aClass74_2 = new Class74();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Lclient!gg;")
	public static Class103 method3619(@OriginalArg(0) int arg0) {
		@Pc(15) Class103 local15 = (Class103) Static92.aClass316_12.method7799((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static491.aClass160_94.method4198(arg0, 0);
		local15 = new Class103();
		if (local25 != null) {
			local15.method3132(arg0, new Class1_Sub13(local25));
		}
		Static92.aClass316_12.method7792((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IBII)I")
	public static int method3621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 >= arg2) {
			return arg0 >= arg1 ? arg1 : arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Lclient!hu;")
	public static Class47_Sub4 method3623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass47_Sub4_1;
	}
}
