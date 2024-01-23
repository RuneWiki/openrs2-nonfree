import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!ig;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public static int anInt2453;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!qe;")
	private static Class78 aClass78_524 = Static199.method3560("purple:");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_522 = aClass78_524;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_523 = Static199.method3560(")4g");

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Z")
	public static boolean aBoolean105 = true;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_525 = aClass78_524;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public static int anInt2452 = 0;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_526 = Static199.method3560("<br>(X100(U(Y");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!qe;Z)Lclient!w;")
	public static Class2_Sub27 method1914(@OriginalArg(0) Class78 arg0) {
		if (arg0.method3041() == 0) {
			return null;
		}
		for (@Pc(19) Class2_Sub27 local19 = (Class2_Sub27) Static81.aClass44_17.method1359(); local19 != null; local19 = (Class2_Sub27) Static81.aClass44_17.method1356()) {
			if (local19.aClass78_858.method3033(arg0)) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLclient!nh;)Lclient!k;")
	public static Class55 method1915(@OriginalArg(1) Class2_Sub23 arg0) {
		@Pc(3) Class55 local3 = new Class55();
		local3.anInt2309 = arg0.method2095();
		local3.aClass2_Sub3_Sub25_1 = Static5.method98(local3.anInt2309);
		return local3;
	}
}
