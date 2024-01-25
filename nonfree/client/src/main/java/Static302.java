import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
	public static int anInt5504;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(III)Z")
	public static boolean method4657(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static94.method1881(arg1, arg0) & Static393.method5691(arg0, arg1);
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(III)V")
	public static void method4658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class3_Sub6_Sub7 local21 = Static198.method3146((long) arg1 << 32 | (long) arg0, 19);
		local21.method1709();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)Lclient!iea;")
	public static Class174 method4659(@OriginalArg(1) int arg0) {
		@Pc(10) Class174 local10 = (Class174) Static132.aClass279_14.method6631((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static127.aClass143_33.method3125(arg0, 0);
		local10 = new Class174();
		if (local22 != null) {
			local10.method3934(new Class3_Sub17(local22));
		}
		local10.method3936();
		Static132.aClass279_14.method6635(local10, (long) arg0);
		return local10;
	}
}
