import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1162(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(IZI)Ljava/lang/String;")
	public static String method1164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 - arg0;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIB)Lclient!wd;")
	public static Class355 method1165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class355 local12 = new Class355();
		local12.anInt9400 = arg1 + 5 + 1;
		local12.anInt9391 = -1;
		local12.anInt9399 = -1;
		local12.anInt9386 = arg0 + 1 + 5;
		local12.anIntArrayArray68 = new int[local12.anInt9400][local12.anInt9386];
		local12.method7806();
		return local12;
	}
}
