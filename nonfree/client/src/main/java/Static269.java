import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!n", name = "l", descriptor = "I")
	public static int anInt2101;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_7 = new Class163(4, 4);

	@OriginalMember(owner = "client!n", name = "n", descriptor = "I")
	public static int anInt2102 = -1;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_58 = new Class25(69, -1);

	@OriginalMember(owner = "client!n", name = "q", descriptor = "D")
	public static double aDouble3 = -1.0D;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	public static int anInt2104 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIFZIII)[I")
	public static int[] method1982(@OriginalArg(3) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub2_Sub28 local10 = new Class2_Sub2_Sub28();
		local10.anInt5840 = (int) (arg0 * 4096.0F);
		local10.anInt5844 = 4;
		local10.anInt5848 = 8;
		local10.anInt5837 = 8;
		local10.aBoolean408 = true;
		local10.anInt5850 = 35;
		local10.method6262();
		Static249.method3443(2048, 1);
		local10.method4641(0, local6);
		return local6;
	}
}
