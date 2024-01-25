import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!da;")
	public static Class67 aClass67_3;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_35 = new Class240(49, 7);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method2885() {
		for (@Pc(1) int local1 = 0; local1 < 100; local1++) {
			Static89.aBooleanArray7[local1] = true;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!uq;IIIBJZ)V")
	public static void method2887(@OriginalArg(0) Class362 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) long arg3) {
		Static343.method4991(arg0, arg1, arg3, arg2);
	}
}
