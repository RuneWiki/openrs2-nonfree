import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "Lclient!tq;")
	public static Class191 aClass191_35;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
	public static int anInt1289 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZIII)V")
	public static void method1350(@OriginalArg(0) boolean arg0) {
		Static65.anInt1429 = 22050;
		Static283.anInt5721 = 2;
		Static18.aBoolean55 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Lclient!sd;")
	public static Class178 method1351(@OriginalArg(0) int arg0) {
		@Pc(10) Class178 local10 = (Class178) Static93.aClass119_54.method3311((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static196.aClass191_126.method5459(33, arg0);
		local10 = new Class178();
		if (local20 != null) {
			local10.method5082(arg0, new Class2_Sub10(local20));
		}
		Static93.aClass119_54.method3308(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(ZIII)I")
	public static int method1356(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
