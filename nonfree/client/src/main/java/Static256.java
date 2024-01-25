import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!ir;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!la;")
	public static final Class136 aClass136_124 = new Class136(32, 6);

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "[I")
	public static int[] anIntArray280 = new int[2];

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "[I")
	public static final int[] anIntArray281 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "J")
	public static long aLong148 = 0L;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)V")
	public static void method3580(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub3_Sub4 local16 = Static281.method3883(1, arg0);
		local16.method1006();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZBI)V")
	public static void method3581(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub32 local10 = Static457.method6232(arg0, arg1);
		if (local10 != null) {
			for (@Pc(19) int local19 = 0; local19 < local10.anIntArray274.length; local19++) {
				local10.anIntArray274[local19] = -1;
				local10.anIntArray275[local19] = 0;
			}
		}
	}
}
