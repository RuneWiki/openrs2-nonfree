import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!kw", name = "Ab", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!kw", name = "Kb", descriptor = "Lclient!pu;")
	public static Class244 aClass244_5;

	@OriginalMember(owner = "client!kw", name = "xb", descriptor = "I")
	public static int anInt5373 = 0;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)Z")
	public static boolean method4549(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)Z")
	public static boolean method4551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "(I)V")
	public static void method4552() {
		Static3.aClass125_1.method3442();
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(II)Lclient!sc;")
	public static Class271 method4553(@OriginalArg(0) int arg0) {
		@Pc(10) Class271 local10 = (Class271) Static348.aClass125_50.method3446((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static196.aClass16_51.method408(0, arg0);
		local10 = new Class271();
		if (local20 != null) {
			local10.method6721(new Class12_Sub8(local20), arg0);
		}
		Static348.aClass125_50.method3437(local10, (long) arg0);
		return local10;
	}
}
