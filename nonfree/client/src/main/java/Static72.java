import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "[Lclient!rga;")
	public static Class8_Sub3[] aClass8_Sub3Array1;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
	public static int anInt1425 = -1;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IILclient!pu;Lclient!pu;)V")
	public static void method1231(@OriginalArg(2) Class270 arg0, @OriginalArg(3) Class270 arg1) {
		Static218.aClass270_46 = arg1;
		Static301.aClass270_59 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V")
	public static void method1232(@OriginalArg(1) int arg0) {
		Static58.anInt1101 = arg0;
		Static520.anInt8816 = 100;
		Static355.anInt5919 = -1;
		Static95.anInt2005 = 3;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIII)I")
	public static int method1234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(8) int local8 = arg3;
			arg3 = arg0;
			arg0 = local8;
		}
		@Pc(20) int local20 = arg2 & 0x3;
		if (local20 == 0) {
			return arg5;
		} else if (local20 == 1) {
			return 7 + 1 - arg1 - arg3;
		} else if (local20 == 2) {
			return 7 + 1 - arg5 - arg0;
		} else {
			return arg1;
		}
	}
}
