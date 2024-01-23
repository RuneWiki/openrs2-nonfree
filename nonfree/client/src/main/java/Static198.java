import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString70 = " more options";

	@OriginalMember(owner = "client!p", name = "r", descriptor = "Lclient!an;")
	public static Class10 aClass10_25 = new Class10();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)V")
	public static void method1838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class4_Sub2_Sub21 local10 = Static39.method4121(arg1, 10);
		local10.method4360();
		local10.anInt5495 = arg2;
		local10.anInt5492 = arg3;
		local10.anInt5502 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
	public static void method1846() {
		aClass10_25 = null;
		aString70 = null;
	}
}
