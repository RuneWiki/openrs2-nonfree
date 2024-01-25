import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
	public static int anInt3070;

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "Lclient!cv;")
	public static Class64 aClass64_2;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
	public static int anInt3072;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_46 = new Class286(19, 8);

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "Lclient!sfa;")
	public static final Class302 aClass302_3 = new Class302();

	@OriginalMember(owner = "client!fr", name = "y", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_47 = new Class286(38, 7);

	@OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
	public static int anInt3071 = 1;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)I")
	public static int method2484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static38.method664(arg0 + 91923, 4, arg1 + 45365) + (Static38.method664(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (Static38.method664(arg0, 1, arg1) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IBILclient!mc;)V")
	public static void method2485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class216 arg2) {
		Static423.aClass216ArrayArray1[arg0][arg1] = arg2;
	}
}
