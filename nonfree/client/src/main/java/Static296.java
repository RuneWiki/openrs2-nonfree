import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
	public static int anInt5320;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	public static int anInt5322 = 0;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBZFIIII)[I")
	public static int[] method4854(@OriginalArg(3) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class14_Sub7_Sub9 local10 = new Class14_Sub7_Sub9();
		local10.anInt2126 = 35;
		local10.aBoolean148 = true;
		local10.anInt2137 = 8;
		local10.anInt2129 = 8;
		local10.anInt2128 = (int) (arg0 * 4096.0F);
		local10.anInt2136 = 4;
		local10.method9386();
		Static598.method8463(1, 2048);
		local10.method2055(local6, 0);
		return local6;
	}
}
