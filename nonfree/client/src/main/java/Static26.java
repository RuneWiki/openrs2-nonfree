import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	public static int anInt604;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
	public static int anInt615 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)I")
	public static int method506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method508(@OriginalArg(1) String arg0) {
		if (Static93.aClass81Array1 != null) {
			Static159.method2586(Static385.aClass54_92);
			Static424.aClass2_Sub23_Sub2_1.method5449(Static287.method4138(arg0));
			Static424.aClass2_Sub23_Sub2_1.method5496(arg0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lclient!eh;")
	public static Class2_Sub5_Sub5 method510(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub5_Sub5 local10 = (Class2_Sub5_Sub5) Static158.aClass147_1.method3340((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static424.aClass160_81.method3696(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static384.method5099(local20);
			Static158.aClass147_1.method3336(local10, (long) arg0);
			return local10;
		}
	}
}
