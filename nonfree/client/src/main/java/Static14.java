import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	public static int anInt285 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZFFF)F")
	public static float method208(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg0 * (arg1 - arg2) + arg2;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method209(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - arg0;
		if (local16 < -9) {
			return "<col=ff0000>";
		} else if (local16 < -6) {
			return "<col=ff3000>";
		} else if (local16 < -3) {
			return "<col=ff7000>";
		} else if (local16 < 0) {
			return "<col=ffb000>";
		} else if (local16 > 9) {
			return "<col=00ff00>";
		} else if (local16 > 6) {
			return "<col=40ff00>";
		} else if (local16 > 3) {
			return "<col=80ff00>";
		} else if (local16 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Lclient!bf;")
	public static Class31 method211(@OriginalArg(0) int arg0) {
		@Pc(10) Class31 local10 = (Class31) Static189.aClass6_18.method92((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static593.aClass322_157.method6802(0, arg0);
		local10 = new Class31();
		if (local20 != null) {
			local10.method651(arg0, new Class3_Sub11(local20));
		}
		Static189.aClass6_18.method106((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
	public static void method212(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub7_Sub18 local15 = Static543.method7218(4, arg0);
		local15.method7329();
	}
}
