import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!sf;")
	public static Class157 aClass157_29 = new Class157(64);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method2856() {
		Static150.aClass101_11.method2869();
		Static83.aClass37_7.method1141();
		Static247.aClass37_6.method1141();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!sh;I)V")
	public static void method2861(@OriginalArg(0) Class159 arg0) {
		Static173.aClass159_1 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!g;)Lclient!g;")
	public static Class56 method2862(@OriginalArg(1) Class56 arg0) {
		if (arg0.anInt2030 != -1) {
			return Static38.method715(arg0.anInt2030);
		}
		@Pc(20) int local20 = arg0.anInt2096 >>> 16;
		@Pc(25) Class162 local25 = new Class162(Static132.aClass101_8);
		for (@Pc(30) Class2_Sub4 local30 = (Class2_Sub4) local25.method4097(); local30 != null; local30 = (Class2_Sub4) local25.method4098()) {
			if (local30.anInt274 == local20) {
				return Static38.method715((int) local30.aLong214);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ek;Z)Z")
	public static boolean method2866(@OriginalArg(0) Class42 arg0) {
		return arg0.method1253(Static56.anInt1438);
	}
}
