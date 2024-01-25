import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "J")
	public static long aLong143 = 0L;

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
	public static int anInt4381 = 0;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
	public static int anInt4382 = 0;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	public static void method3525() {
		for (@Pc(10) Class10_Sub23 local10 = (Class10_Sub23) Static418.aClass163_43.method3620(); local10 != null; local10 = (Class10_Sub23) Static418.aClass163_43.method3621()) {
			if (local10.aBoolean269) {
				local10.method3170();
			}
		}
		for (@Pc(30) Class10_Sub23 local30 = (Class10_Sub23) Static104.aClass163_19.method3620(); local30 != null; local30 = (Class10_Sub23) Static104.aClass163_19.method3621()) {
			if (local30.aBoolean269) {
				local30.method3170();
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z")
	public static boolean method3526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static258.method3720(arg0, arg1) || Static445.method5935(arg0, arg1);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIII)V")
	public static void method3527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(10, arg3);
		local8.method5345();
		local8.anInt6807 = arg0;
		local8.anInt6806 = arg2;
		local8.anInt6813 = arg1;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BZ)V")
	public static void method3528(@OriginalArg(1) boolean arg0) {
		Static425.method5655(Static90.anInt1891, arg0, Static340.anInt5756, Static189.anInt3826);
	}
}
